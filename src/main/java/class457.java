import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class457 implements Runnable {

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    private int field7056 = 0;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    private int field7062 = 0;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field7051;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    private int field7052;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "[B")
    private byte[] field7048;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field7053;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7063 = new String[] { method3551(method3550("P\t\u0015:\u0010")), method3551(method3550("ERWx")), method3551(method3550("XT\u0015WE")), method3551(method3550("XT\u0015f\u0018E\u000f")), method3551(method3550("XT\u0015VE")), method3551(method3550("XT\u0015PE")), method3551(method3550("XT\u0015UE")), method3551(method3550("XT\u0015QE")), method3551(method3550("XT\u0015(\u0004ENO*E")) };

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "[I")
    public static int[] field7049 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field7058 = 0;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "[S")
    public static short[] field7055 = new short[256];

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "Lqp;")
    public static class686 field7057 = class141.method1309(123);

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Ljava/io/IOException;")
    private IOException field7061;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V", line = 6)
    public static void method3545(byte arg0) {
        try {
            field7055 = null;
            if (arg0 >= 107) {
                field7057 = null;
                field7049 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7063[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 18)
    public final void method3546(int arg0) {
        try {
            this.field7051 = new class460();
            field7047++;
            if (arg0 != 1) {
                this.field7052 = -92;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7063[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II[BI)I", line = 38)
    public final int method3547(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        try {
            if (arg0 != 12251) {
                this.field7051 = null;
            }
            field7054++;
            if (arg3 < 0 || arg1 < 0 || arg1 + arg3 > arg2.length) {
                throw new IOException();
            }
            synchronized (this) {
                int var6;
                if (this.field7062 < this.field7056) {
                    var6 = this.field7062 + this.field7052 - this.field7056;
                } else {
                    var6 = this.field7062 - this.field7056;
                }
                if (var6 < arg3) {
                    arg3 = var6;
                }
                if (arg3 == 0 && this.field7061 != null) {
                    throw new IOException(this.field7061.toString());
                }
                if (this.field7056 + arg3 > this.field7052) {
                    int var7 = this.field7052 - this.field7056;
                    class405.method3259(this.field7048, this.field7056, arg2, arg1, var7);
                    class405.method3259(this.field7048, 0, arg2, arg1 + var7, -var7 + arg3);
                } else {
                    class405.method3259(this.field7048, this.field7056, arg2, arg1, arg3);
                }
                this.field7056 = (this.field7056 + arg3) % this.field7052;
                this.notifyAll();
                return arg3;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field7063[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7063[1] : field7063[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Z", line = 82)
    public final boolean method3548(int arg0, int arg1) throws IOException {
        try {
            field7059++;
            if (arg1 <= 0 || arg1 >= this.field7052) {
                throw new IOException();
            }
            synchronized (this) {
                int var4;
                if (this.field7056 > this.field7062) {
                    var4 = this.field7062 + this.field7052 - this.field7056;
                } else {
                    var4 = this.field7062 - this.field7056;
                }
                if (arg0 != 1) {
                    this.field7048 = null;
                }
                if (arg1 <= var4) {
                    return true;
                } else if (this.field7061 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field7061.toString());
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field7063[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "run", descriptor = "()V", line = 118)
    public final void run() {
        try {
            field7060++;
            while (true) {
                int var2;
                synchronized (this) {
                    while (true) {
                        if (this.field7061 != null) {
                            return;
                        }
                        if (this.field7056 == 0) {
                            var2 = this.field7052 - this.field7062 - 1;
                        } else if (this.field7056 <= this.field7062) {
                            var2 = this.field7052 - this.field7062;
                        } else {
                            var2 = this.field7056 - this.field7062 - 1;
                        }
                        if (var2 > 0) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                }
                int var3;
                try {
                    var3 = this.field7051.read(this.field7048, this.field7062, var2);
                    if (var3 == -1) {
                        throw new EOFException();
                    }
                } catch (IOException var15) {
                    IOException var4 = var15;
                    synchronized (this) {
                        this.field7061 = var4;
                        return;
                    }
                }
                synchronized (this) {
                    this.field7062 = (this.field7062 + var3) % this.field7052;
                }
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field7063[3] + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V", line = 178)
    public final void method3549(int arg0) {
        try {
            synchronized (this) {
                if (arg0 != -4105) {
                    method3545((byte) 48);
                }
                if (this.field7061 == null) {
                    this.field7061 = new IOException("");
                }
                this.notifyAll();
            }
            field7050++;
            try {
                this.field7053.join();
            } catch (InterruptedException var4) {
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7063[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 213)
    public class457(InputStream arg0, int arg1) {
        try {
            this.field7051 = arg0;
            this.field7052 = arg1 + 1;
            this.field7048 = new byte[this.field7052];
            this.field7053 = new Thread(this);
            this.field7053.setDaemon(true);
            this.field7053.start();
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7063[8] + (arg0 == null ? field7063[1] : field7063[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3550(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3551(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
