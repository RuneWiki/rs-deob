import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class536 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Z")
    public boolean field7871 = false;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "Liha;")
    private class29 field7857 = new class29(64);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Liha;")
    public class29 field7879 = new class29(500);

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "Liha;")
    public class29 field7880 = new class29(30);

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "Liha;")
    public class29 field7881 = new class29(50);

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "Z")
    public boolean field7870;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "Lgda;")
    public class58 field7864;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Lgda;")
    private class58 field7861;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field7883 = new String[] { method4006(method4005("J\u0000\u0010\u0005\u0000")), method4006(method4005("J\u0000\u0010\u0001\u0000")), method4006(method4005("J\u0000\u0010\r\u0000")), method4006(method4005("J\u0000\u0010\u0006\u0000")), method4006(method4005("J\u0000\u0010\u0003\u0000")), method4006(method4005("J\u0000\u0010{AI\u0018Jy\u0000")), method4006(method4005("\\_\u0010iU")), method4006(method4005("I\u0004R+")), method4006(method4005("J\u0000\u0010\u000e\u0000")), method4006(method4005("J\u0000\u0010\u0000\u0000")), method4006(method4005("J\u0000\u0010\u0004\u0000")), method4006(method4005("J\u0000\u0010\u000f\u0000")), method4006(method4005("J\u0000\u0010\u0002\u0000")), method4006(method4005("J\u0000\u0010\f\u0000")) };

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "Lat;")
    public static class398 field7858 = new class398();

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "Lhl;")
    public static class556 field7875 = new class556(3, 0);

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "Lhl;")
    public static class556 field7877 = new class556(27, -2);

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    public int field7882;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "Lmk;")
    public static class59 field7876;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field7868;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "[I")
    public static int[] field7878;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static void method3994(byte arg0) {
        try {
            if (arg0 == -119) {
                field7877 = null;
                field7875 = null;
                field7858 = null;
                field7868 = null;
                field7876 = null;
                field7878 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7883[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)V")
    public final void method3995(int arg0, boolean arg1) {
        try {
            field7860++;
            int var3 = -74 % ((arg0 + 40) / 63);
            if (this.field7871 != arg1) {
                this.field7871 = arg1;
                this.method4000(30402);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7883[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
    public final void method3996(int arg0, int arg1) {
        try {
            field7869++;
            class29 var3 = this.field7857;
            synchronized (this.field7857) {
                this.field7857.method294(arg1, -630);
            }
            class29 var4 = this.field7879;
            synchronized (this.field7879) {
                this.field7879.method294(arg1, -630);
            }
            if (arg0 == 30) {
                class29 var5 = this.field7880;
                synchronized (this.field7880) {
                    this.field7880.method294(arg1, -630);
                }
                class29 var6 = this.field7881;
                synchronized (this.field7881) {
                    this.field7881.method294(arg1, -630);
                }
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field7883[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(II)V")
    public final void method3997(int arg0, int arg1) {
        try {
            this.field7857 = new class29(arg1);
            if (arg0 != 500) {
                this.method4004(false, (byte) -94);
            }
            field7863++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7883[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
    public final void method3998(boolean arg0) {
        try {
            class29 var2 = this.field7857;
            synchronized (this.field7857) {
                this.field7857.method298(5);
            }
            field7867++;
            class29 var3 = this.field7879;
            synchronized (this.field7879) {
                this.field7879.method298(5);
            }
            class29 var4 = this.field7880;
            synchronized (this.field7880) {
                if (!arg0) {
                    return;
                }
                this.field7880.method298(5);
            }
            class29 var5 = this.field7881;
            synchronized (this.field7881) {
                this.field7881.method298(5);
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field7883[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)I")
    public static final int method3999(int arg0, byte arg1, int arg2) {
        try {
            field7872++;
            int var3 = 1;
            while (arg0 > 1) {
                if ((arg0 & 0x1) != 0) {
                    var3 = arg2 * var3;
                }
                arg2 *= arg2;
                arg0 >>= 0x1;
            }
            if (arg0 == 1) {
                return arg2 * var3;
            } else {
                int var4 = 89 / ((17 - arg1) / 45);
                return var3;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7883[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public final void method4000(int arg0) {
        try {
            class29 var2 = this.field7857;
            synchronized (this.field7857) {
                this.field7857.method304(arg0 ^ 0x76C3);
            }
            field7874++;
            class29 var3 = this.field7879;
            synchronized (this.field7879) {
                this.field7879.method304(1);
                if (arg0 != 30402) {
                    method3994((byte) -74);
                }
            }
            class29 var4 = this.field7880;
            synchronized (this.field7880) {
                this.field7880.method304(arg0 ^ 0x76C3);
            }
            class29 var5 = this.field7881;
            synchronized (this.field7881) {
                this.field7881.method304(arg0 - 30401);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7883[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)V")
    public final void method4001(byte arg0, int arg1) {
        try {
            field7862++;
            this.field7882 = arg1;
            class29 var3 = this.field7879;
            synchronized (this.field7879) {
                this.field7879.method304(1);
            }
            class29 var4 = this.field7880;
            synchronized (this.field7880) {
                this.field7880.method304(1);
                if (arg0 != 36) {
                    method4003(-112, -45);
                }
            }
            class29 var5 = this.field7881;
            synchronized (this.field7881) {
                this.field7881.method304(1);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field7883[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(II)Ltk;")
    public final class362 method4002(int arg0, int arg1) {
        try {
            field7866++;
            class29 var3 = this.field7857;
            class362 var4;
            synchronized (this.field7857) {
                var4 = (class362) this.field7857.method302(-83, (long) arg1);
                int var5 = 68 / ((56 - arg0) / 53);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var6 = this.field7861;
            byte[] var7;
            synchronized (this.field7861) {
                var7 = this.field7861.method604((byte) -119, class313.method2683(arg1, 255), class668.method4845(arg1, -74));
            }
            class362 var8 = new class362();
            var8.field5901 = this;
            var8.field5855 = arg1;
            if (var7 != null) {
                var8.method2999(0, new class176(var7));
            }
            var8.method2989(26585);
            if (!this.field7870 && var8.field5888) {
                var8.field5877 = null;
                var8.field5900 = null;
            }
            if (var8.field5862) {
                var8.field5916 = 0;
                var8.field5914 = false;
            }
            class29 var9 = this.field7857;
            synchronized (this.field7857) {
                this.field7857.method295(false, (long) arg1, var8);
                return var8;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field7883[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
    public static final void method4003(int arg0, int arg1) {
        try {
            field7859++;
            class551 var2 = class380.method3113(-120, (long) arg1, 8);
            if (arg0 <= 84) {
                method3994((byte) -106);
            }
            var2.method4089(63);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7883[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZB)V")
    public final void method4004(boolean arg0, byte arg1) {
        try {
            field7865++;
            if (arg1 == -32 && this.field7870 != arg0) {
                this.field7870 = arg0;
                this.method4000(30402);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7883[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lpo;IZLgda;Lgda;)V")
    public class536(class585 arg0, int arg1, boolean arg2, class58 arg3, class58 arg4) {
        try {
            this.field7870 = arg2;
            this.field7864 = arg4;
            this.field7861 = arg3;
            if (this.field7861 != null) {
                int var6 = this.field7861.method600(1) - 1;
                this.field7861.method580(82, var6);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7883[5] + (arg0 == null ? field7883[7] : field7883[6]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7883[7] : field7883[6]) + ',' + (arg4 == null ? field7883[7] : field7883[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4005(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4006(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
