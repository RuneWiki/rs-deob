import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class280 implements Runnable {

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    private int field4996 = 0;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    private int field5005 = 0;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
    private boolean field4997 = false;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Z")
    private boolean field5009 = false;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lbd;")
    private class305 field4995;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field4990;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Ljava/io/InputStream;")
    private InputStream field5003;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4992;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Z")
    public static boolean field5006 = false;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lia;")
    private class206 field5000;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[B")
    private byte[] field5007;

    @OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() {
        field4991++;
        this.method2024(-1);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[BII)V", line = 34)
    public final void method2021(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4999++;
        if (this.field5009) {
            return;
        }
        if (this.field4997) {
            this.field4997 = false;
            throw new IOException();
        }
        if (this.field5007 == null) {
            this.field5007 = new byte[5000];
        }
        synchronized (this) {
            if (arg3 == 3) {
                for (int var6 = 0; var6 < arg0; var6++) {
                    this.field5007[this.field5005] = arg1[arg2 + var6];
                    this.field5005 = (this.field5005 + 1) % 5000;
                    if ((this.field4996 + 4900) % 5000 == this.field5005) {
                        throw new IOException();
                    }
                }
                if (this.field5000 == null) {
                    this.field5000 = this.field4995.method2163(this, 3, arg3 + 7156);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/net/Socket;Lbd;)V", line = 311)
    public class280(Socket arg0, class305 arg1) throws IOException {
        this.field4995 = arg1;
        this.field4990 = arg0;
        this.field4990.setSoTimeout(30000);
        this.field4990.setTcpNoDelay(true);
        this.field5003 = this.field4990.getInputStream();
        this.field4992 = this.field4990.getOutputStream();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I", line = 91)
    public final int method2022(byte arg0) throws IOException {
        field4994++;
        if (this.field5009) {
            return 0;
        } else if (arg0 >= -101) {
            return -63;
        } else {
            return this.field5003.read();
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I", line = 106)
    public final int method2023(int arg0) throws IOException {
        field4993++;
        if (arg0 < 85) {
            this.field4990 = (Socket) null;
        }
        return this.field5009 ? 0 : this.field5003.available();
    }

    @OriginalMember(owner = "client!cb", name = "run", descriptor = "()V", line = 134)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label87: {
                    synchronized (this) {
                        label88: {
                            if (this.field5005 == this.field4996) {
                                if (this.field5009) {
                                    break label88;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            if (this.field4996 <= this.field5005) {
                                var3 = this.field5005 - this.field4996;
                            } else {
                                var3 = 5000 - this.field4996;
                            }
                            var4 = this.field4996;
                            break label87;
                        }
                    }
                    try {
                        if (this.field5003 != null) {
                            this.field5003.close();
                        }
                        if (this.field4992 != null) {
                            this.field4992.close();
                        }
                        if (this.field4990 != null) {
                            this.field4990.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field5007 = null;
                    break;
                }
                if (var3 > 0) {
                    try {
                        this.field4992.write(this.field5007, var4, var3);
                    } catch (IOException var12) {
                        this.field4997 = true;
                    }
                    this.field4996 = (this.field4996 + var3) % 5000;
                    try {
                        if (this.field5005 == this.field4996) {
                            this.field4992.flush();
                        }
                    } catch (IOException var11) {
                        this.field4997 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class94.method792(var15, (byte) -115, (String) null);
        }
        field4989++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 199)
    public final void method2024(int arg0) {
        field5002++;
        if (this.field5009 || arg0 != -1) {
            return;
        }
        synchronized (this) {
            this.field5009 = true;
            this.notifyAll();
        }
        if (this.field5000 != null) {
            while (this.field5000.field3655 == 0) {
                class204.method1510(1L, 1);
            }
            if (this.field5000.field3655 == 1) {
                try {
                    ((Thread) this.field5000.field3657).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field5000 = null;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V", line = 237)
    public final void method2025(int arg0) throws IOException {
        if (arg0 != 5000) {
            this.field4995 = (class305) null;
        }
        field5001++;
        if (!this.field5009 && this.field4997) {
            this.field4997 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I[BII)V", line = 259)
    public final void method2026(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4988++;
        int var5 = 115 % ((-arg0 - 66) / 59);
        if (this.field5009) {
            return;
        }
        while (arg2 > 0) {
            int var6 = this.field5003.read(arg1, arg3, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 += var6;
            arg2 -= var6;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 294)
    public final void method2027(int arg0) {
        field5008++;
        if (!this.field5009) {
            this.field5003 = new class83();
            this.field4992 = new class260();
            int var2 = 56 / ((arg0 + 34) / 61);
        }
    }
}
