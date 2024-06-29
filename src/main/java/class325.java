import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class325 implements Runnable {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Z")
    private boolean field4171 = false;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    private int field4176 = 0;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "Z")
    private boolean field4186 = false;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    private int field4192 = 0;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field4184;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lmr;")
    private class613 field4172;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "Ljava/io/InputStream;")
    private InputStream field4190;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4177;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    private int field4183;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "Lju;")
    public static class102 field4175 = new class102(11, -1);

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "Lfg;")
    private class436 field4178;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "[B")
    private byte[] field4173;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "[Z")
    public static boolean[] field4188;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIB[B)V")
    public final void method1897(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field4193++;
        if (this.field4171) {
            return;
        }
        if (arg2 != 12) {
            field4175 = null;
        }
        while (arg0 > 0) {
            int var5 = this.field4190.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I")
    public final int method1898(int arg0) throws IOException {
        field4182++;
        if (arg0 != -26946) {
            this.method1903((byte) -128);
        }
        return this.field4171 ? 0 : this.field4190.read();
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    public static void method1899(int arg0) {
        if (arg0 != -1) {
            field4188 = null;
        }
        field4175 = null;
        field4188 = null;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public final void method1900(int arg0) {
        if (arg0 <= 42) {
            this.method1903((byte) 64);
        }
        field4191++;
        if (!this.field4171) {
            this.field4190 = new class490();
            this.field4177 = new class559();
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIZ)I")
    public static final int method1901(int arg0, int arg1, int arg2, boolean arg3) {
        field4187++;
        if (!arg3) {
            method1899(82);
        }
        if (arg1 > arg0) {
            return arg1;
        } else if (arg0 > arg2) {
            return arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
    public final void method1902(boolean arg0) throws IOException {
        if (!arg0) {
            this.field4192 = 63;
        }
        field4179++;
        if (!this.field4171 && this.field4186) {
            this.field4186 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public final void method1903(byte arg0) {
        field4189++;
        if (this.field4171) {
            return;
        }
        synchronized (this) {
            this.field4171 = true;
            if (arg0 <= 108) {
                this.finalize();
            }
            this.notifyAll();
        }
        if (this.field4178 != null) {
            while (this.field4178.field5975 == 0) {
                class740.method4124(1L, 120);
            }
            if (this.field4178.field5975 == 1) {
                try {
                    ((Thread) this.field4178.field5973).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4178 = null;
    }

    @OriginalMember(owner = "client!or", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1903((byte) 120);
        field4181++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IB[BI)V")
    public final void method1904(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field4174++;
        if (this.field4171) {
            return;
        }
        if (this.field4186) {
            this.field4186 = false;
            throw new IOException();
        }
        if (this.field4173 == null) {
            this.field4173 = new byte[this.field4183];
        }
        synchronized (this) {
            if (arg1 == 39) {
                for (int var6 = 0; var6 < arg0; var6++) {
                    this.field4173[this.field4176] = arg2[arg3 + var6];
                    this.field4176 = (this.field4176 + 1) % this.field4183;
                    if (((this.field4192 + this.field4183 - 100) % this.field4183) == this.field4176) {
                        throw new IOException();
                    }
                }
                if (this.field4178 == null) {
                    this.field4178 = this.field4172.method3580(this, 49, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4192 == this.field4176) {
                            if (this.field4171) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field4192;
                        if (this.field4176 < this.field4192) {
                            var3 = this.field4183 - this.field4192;
                        } else {
                            var3 = this.field4176 - this.field4192;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field4177.write(this.field4173, var2, var3);
                    } catch (IOException var9) {
                        this.field4186 = true;
                    }
                    this.field4192 = (this.field4192 + var3) % this.field4183;
                    try {
                        if (this.field4192 == this.field4176) {
                            this.field4177.flush();
                        }
                    } catch (IOException var8) {
                        this.field4186 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4190 != null) {
                        this.field4190.close();
                    }
                    if (this.field4177 != null) {
                        this.field4177.close();
                    }
                    if (this.field4184 != null) {
                        this.field4184.close();
                    }
                } catch (IOException var7) {
                }
                this.field4173 = null;
                break;
            }
        } catch (Exception var12) {
            class233.method1495((byte) -120, var12, null);
        }
        field4180++;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)I")
    public final int method1905(boolean arg0) throws IOException {
        if (arg0) {
            method1901(44, -94, -12, true);
        }
        field4185++;
        return this.field4171 ? 0 : this.field4190.available();
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/net/Socket;Lmr;I)V")
    public class325(Socket arg0, class613 arg1, int arg2) throws IOException {
        this.field4184 = arg0;
        this.field4172 = arg1;
        this.field4184.setSoTimeout(30000);
        this.field4184.setTcpNoDelay(true);
        this.field4190 = this.field4184.getInputStream();
        this.field4177 = this.field4184.getOutputStream();
        this.field4183 = arg2;
    }
}
