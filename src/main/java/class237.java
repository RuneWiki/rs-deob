import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class237 implements Runnable {

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    private int field3867 = 0;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Z")
    private boolean field3869 = false;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    private int field3872 = 0;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Z")
    private boolean field3880 = false;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lla;")
    private class157 field3861;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field3864;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field3875;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3883;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field3881 = 0;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "[Z")
    public static boolean[] field3877 = new boolean[100];

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Lme;")
    private class210 field3879;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[B")
    private byte[] field3870;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)I", line = 8)
    public static final int method1638(int arg0, int arg1) {
        if (arg1 != 261677) {
            field3881 = -115;
        }
        field3874++;
        return (arg0 & 0x3FE2D) >> 11;
    }

    @OriginalMember(owner = "client!dk", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() {
        field3873++;
        this.method1646((byte) 110);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I", line = 28)
    public final int method1639(byte arg0) throws IOException {
        field3876++;
        if (arg0 == 125) {
            return this.field3880 ? 0 : this.field3875.read();
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 46)
    public static void method1640(boolean arg0) {
        if (!arg0) {
            field3881 = -1;
        }
        field3877 = null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/net/Socket;Lla;)V", line = 341)
    public class237(Socket arg0, class157 arg1) throws IOException {
        this.field3861 = arg1;
        this.field3864 = arg0;
        this.field3864.setSoTimeout(30000);
        this.field3864.setTcpNoDelay(true);
        this.field3875 = this.field3864.getInputStream();
        this.field3883 = this.field3864.getOutputStream();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 64)
    public final void method1641(int arg0) throws IOException {
        if (arg0 != 0) {
            method1640(false);
        }
        field3863++;
        if (!this.field3880 && this.field3869) {
            this.field3869 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)I", line = 95)
    public final int method1642(byte arg0) throws IOException {
        field3882++;
        if (this.field3880) {
            return 0;
        } else {
            if (arg0 != -89) {
                this.field3879 = (class210) null;
            }
            return this.field3875.available();
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIB[B)V", line = 109)
    public final void method1643(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field3871++;
        if (arg2 > -40) {
            this.run();
        }
        if (this.field3880) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field3875.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 135)
    public final void method1644(int arg0) {
        field3865++;
        if (this.field3880) {
            return;
        }
        this.field3875 = new class316();
        if (arg0 != -26255) {
            method1638(14, 108);
        }
        this.field3883 = new class100();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([BIII)V", line = 152)
    public final void method1645(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3862++;
        if (this.field3880) {
            return;
        }
        if (this.field3869) {
            this.field3869 = false;
            throw new IOException();
        }
        if (this.field3870 == null) {
            this.field3870 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field3870[this.field3867] = arg0[arg3 + var6];
                this.field3867 = (this.field3867 + 1) % 5000;
                if ((this.field3872 + 4900) % 5000 == this.field3867) {
                    throw new IOException();
                }
            }
            if (arg2 == -20326) {
                if (this.field3879 == null) {
                    this.field3879 = this.field3861.method1132(3, 0, this);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V", line = 206)
    public final void method1646(byte arg0) {
        field3866++;
        if (this.field3880) {
            return;
        }
        synchronized (this) {
            this.field3880 = true;
            this.notifyAll();
        }
        if (this.field3879 != null) {
            while (this.field3879.field3504 == 0) {
                class122.method881(-101, 1L);
            }
            if (this.field3879.field3504 == 1) {
                try {
                    ((Thread) this.field3879.field3501).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field3879 = null;
        if (arg0 < 75) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!dk", name = "run", descriptor = "()V", line = 244)
    public final void run() {
        field3868++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field3872 == this.field3867) {
                        if (this.field3880) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field3872 <= this.field3867) {
                        var3 = this.field3867 - this.field3872;
                    } else {
                        var3 = 5000 - this.field3872;
                    }
                    var4 = this.field3872;
                }
                if (var3 > 0) {
                    try {
                        this.field3883.write(this.field3870, var4, var3);
                    } catch (IOException var12) {
                        this.field3869 = true;
                    }
                    this.field3872 = (this.field3872 + var3) % 5000;
                    try {
                        if (this.field3872 == this.field3867) {
                            this.field3883.flush();
                        }
                    } catch (IOException var11) {
                        this.field3869 = true;
                    }
                }
            }
            try {
                if (this.field3875 != null) {
                    this.field3875.close();
                }
                if (this.field3883 != null) {
                    this.field3883.close();
                }
                if (this.field3864 != null) {
                    this.field3864.close();
                }
            } catch (IOException var10) {
            }
            this.field3870 = null;
        } catch (Exception var15) {
            class348.method2493(-26700, var15, (String) null);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lek;Lek;B)V", line = 322)
    public static final void method1647(class206 arg0, class206 arg1, byte arg2) {
        if (arg2 != -5) {
            return;
        }
        class173.field2877 = class282.method2002(arg0, arg1, true, 0, class251.field4130);
        if (class241.field4016) {
            class358.field5698 = class7.method71(0, arg1, class251.field4130, arg0, true);
        } else {
            class358.field5698 = (class361) class173.field2877;
        }
        field3878++;
        class14.field416 = class282.method2002(arg0, arg1, true, 0, class50.field1033);
        class332.field5297 = class282.method2002(arg0, arg1, true, 0, class225.field3705);
    }
}
