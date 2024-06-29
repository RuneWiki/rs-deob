import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class253 implements Runnable {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    private int field4064 = 0;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Z")
    private boolean field4076 = false;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Z")
    private boolean field4074 = false;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    private int field4075 = 0;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Llh;")
    private class282 field4062;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field4068;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field4070;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4078;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lck;")
    public static class119 field4072 = class298.method1987((byte) 93, "leuchten1:");

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field4069 = 0;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field4077 = 0;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lck;")
    private static class119 field4081 = class298.method1987((byte) 12, "");

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lck;")
    public static class119 field4082 = field4081;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static volatile int field4084 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lth;")
    private class275 field4065;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[B")
    private byte[] field4073;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI[B)V", line = 6)
    public final void method1627(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field4066++;
        if (arg1 < 70 || this.field4074) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field4070.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/net/Socket;Llh;)V", line = 339)
    public class253(Socket arg0, class282 arg1) throws IOException {
        this.field4062 = arg1;
        this.field4068 = arg0;
        this.field4068.setSoTimeout(30000);
        this.field4068.setTcpNoDelay(true);
        this.field4070 = this.field4068.getInputStream();
        this.field4078 = this.field4068.getOutputStream();
    }

    @OriginalMember(owner = "client!uc", name = "run", descriptor = "()V", line = 54)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field4075 == this.field4064) {
                        if (this.field4074) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var12) {
                        }
                    }
                    var3 = this.field4064;
                    if (this.field4064 > this.field4075) {
                        var4 = 5000 - this.field4064;
                    } else {
                        var4 = this.field4075 - this.field4064;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field4078.write(this.field4073, var3, var4);
                    } catch (IOException var11) {
                        this.field4076 = true;
                    }
                    this.field4064 = (this.field4064 + var4) % 5000;
                    try {
                        if (this.field4075 == this.field4064) {
                            this.field4078.flush();
                        }
                    } catch (IOException var10) {
                        this.field4076 = true;
                    }
                }
            }
            try {
                if (this.field4070 != null) {
                    this.field4070.close();
                }
                if (this.field4078 != null) {
                    this.field4078.close();
                }
                if (this.field4068 != null) {
                    this.field4068.close();
                }
            } catch (IOException var13) {
            }
            this.field4073 = null;
        } catch (Exception var15) {
            class87.method591((String) null, var15, 58);
        }
        field4080++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)I", line = 128)
    public static final int method1628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg0;
            arg0 = var7;
        }
        int var8 = arg6 & 0x3;
        field4071++;
        if (var8 == 0) {
            return arg1;
        } else if (arg5 <= 69) {
            return 5;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg0 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 160)
    public final void method1629(int arg0) {
        field4079++;
        if (this.field4074) {
            return;
        }
        synchronized (this) {
            this.field4074 = true;
            if (arg0 >= -63) {
                field4069 = -70;
            }
            this.notifyAll();
        }
        if (this.field4065 != null) {
            while (this.field4065.field4496 == 0) {
                class232.method1493(1L, (byte) -51);
            }
            if (this.field4065.field4496 == 1) {
                try {
                    ((Thread) this.field4065.field4499).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field4065 = null;
    }

    @OriginalMember(owner = "client!uc", name = "finalize", descriptor = "()V", line = 198)
    protected final void finalize() {
        this.method1629(-79);
        field4083++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB[B)V", line = 210)
    public final void method1630(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (arg2 != -70) {
            this.field4064 = 39;
        }
        field4063++;
        if (this.field4074) {
            return;
        }
        if (this.field4076) {
            this.field4076 = false;
            throw new IOException();
        }
        if (this.field4073 == null) {
            this.field4073 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field4073[this.field4075] = arg3[arg0 + var6];
                this.field4075 = (this.field4075 + 1) % 5000;
                if (((this.field4064 + 4900) % 5000) == this.field4075) {
                    throw new IOException();
                }
            }
            if (this.field4065 == null) {
                this.field4065 = this.field4062.method1879(2, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 274)
    public static void method1631(int arg0) {
        field4072 = null;
        field4082 = null;
        field4081 = null;
        if (arg0 != 0) {
            field4069 = 37;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I", line = 290)
    public final int method1632(byte arg0) throws IOException {
        field4061++;
        if (arg0 > -114) {
            field4084 = -2;
        }
        return this.field4074 ? 0 : this.field4070.read();
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I", line = 317)
    public final int method1633(int arg0) throws IOException {
        field4067++;
        if (arg0 <= 66) {
            method1628(120, -81, -51, 47, -80, 56, -109);
        }
        return this.field4074 ? 0 : this.field4070.available();
    }
}
