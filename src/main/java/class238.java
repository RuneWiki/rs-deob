import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class238 implements Runnable {

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Z")
    private boolean field3081 = false;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Z")
    private boolean field3076 = false;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    private int field3078 = 0;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    private int field3074 = 0;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Lqj;")
    private class476 field3082;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Ljava/net/Socket;")
    private Socket field3087;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field3088;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3085;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field3091 = 0;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lue;")
    private class218 field3077;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "[B")
    private byte[] field3072;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[[B")
    public static byte[][] field3075;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 4)
    public static void method1433(int arg0) {
        field3075 = null;
        if (arg0 != 22814) {
            method1433(-30);
        }
    }

    @OriginalMember(owner = "client!ok", name = "run", descriptor = "()V", line = 25)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3078 == this.field3074) {
                            if (this.field3081) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3074;
                        if (this.field3078 >= this.field3074) {
                            var3 = this.field3078 - this.field3074;
                        } else {
                            var3 = 5000 - this.field3074;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3085.write(this.field3072, var2, var3);
                    } catch (IOException var9) {
                        this.field3076 = true;
                    }
                    this.field3074 = (this.field3074 + var3) % 5000;
                    try {
                        if (this.field3078 == this.field3074) {
                            this.field3085.flush();
                        }
                    } catch (IOException var8) {
                        this.field3076 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3088 != null) {
                        this.field3088.close();
                    }
                    if (this.field3085 != null) {
                        this.field3085.close();
                    }
                    if (this.field3087 != null) {
                        this.field3087.close();
                    }
                } catch (IOException var7) {
                }
                this.field3072 = null;
                break;
            }
        } catch (Exception var12) {
            class564.method2994((byte) 34, null, var12);
        }
        field3084++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[BI)V", line = 98)
    public final void method1434(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3079++;
        if (this.field3081) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field3088.read(arg2, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
        if (arg0 != -1) {
            this.field3078 = -89;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ljava/net/Socket;Lqj;)V", line = 305)
    public class238(Socket arg0, class476 arg1) throws IOException {
        this.field3082 = arg1;
        this.field3087 = arg0;
        this.field3087.setSoTimeout(30000);
        this.field3087.setTcpNoDelay(true);
        this.field3088 = this.field3087.getInputStream();
        this.field3085 = this.field3087.getOutputStream();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([BIII)V", line = 126)
    public final void method1435(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3083++;
        if (this.field3081) {
            return;
        }
        if (this.field3076) {
            this.field3076 = false;
            throw new IOException();
        }
        if (this.field3072 == null) {
            this.field3072 = new byte[5000];
        }
        synchronized (this) {
            if (arg2 < -123) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field3072[this.field3078] = arg0[arg3 + var6];
                    this.field3078 = (this.field3078 + 1) % 5000;
                    if ((this.field3074 + 4900) % 5000 == this.field3078) {
                        throw new IOException();
                    }
                }
                if (this.field3077 == null) {
                    this.field3077 = this.field3082.method2592(3, this, (byte) 104);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I", line = 178)
    public final int method1436(int arg0) throws IOException {
        field3092++;
        if (this.field3081) {
            return 0;
        } else {
            if (arg0 != 0) {
                field3075 = null;
            }
            return this.field3088.available();
        }
    }

    @OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V", line = 193)
    protected final void finalize() {
        field3073++;
        this.method1437(true);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 202)
    public final void method1437(boolean arg0) {
        field3090++;
        if (this.field3081) {
            return;
        }
        synchronized (this) {
            this.field3081 = arg0;
            this.notifyAll();
        }
        if (this.field3077 != null) {
            while (this.field3077.field2546 == 0) {
                class700.method3867(29279, 1L);
            }
            if (this.field3077.field2546 == 1) {
                try {
                    ((Thread) this.field3077.field2547).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3077 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 239)
    public final void method1438(byte arg0) throws IOException {
        if (arg0 <= 101) {
            this.field3082 = null;
        }
        field3080++;
        if (!this.field3081 && this.field3076) {
            this.field3076 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 261)
    public final void method1439(int arg0) {
        field3089++;
        if (!this.field3081) {
            int var2 = -47 % ((41 - arg0) / 47);
            this.field3088 = new class307();
            this.field3085 = new class371();
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)I", line = 282)
    public final int method1440(byte arg0) throws IOException {
        if (arg0 < 51) {
            return -41;
        } else {
            field3086++;
            return this.field3081 ? 0 : this.field3088.read();
        }
    }
}
