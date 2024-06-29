import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class293 extends class497 {

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4129 = new String[] { method2370(method2369("_\u0018j\u001d9\u0014")), method2370(method2369("_\u0018j\u001d>\u0014")), method2370(method2369("_\u0018j\u001d:\u0014")), method2370(method2369("_\u0018j\u001d<\u0014")), method2370(method2369("_\u0018j\u001d8\u0014")), method2370(method2369("_\u0018j\u001d?\u0014")) };

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "Lsb;")
    public static class261 field4118 = new class261(113, -2);

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "Z")
    public static boolean field4128 = false;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "Lmq;")
    public static class657 field4122;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "Lip;")
    public static class663 field4126;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "[Liw;")
    public static class108[] field4124;

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lpp;)V", line = 3)
    public class293(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)I", line = 6)
    public final int method1032(int arg0) {
        try {
            if (arg0 > -101) {
                field4118 = null;
            }
            ++field4120;
            return 3;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4129[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)I", line = 18)
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                this.method1030(27, 103);
            }
            ++field4125;
            return 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4129[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V", line = 29)
    public final void method1030(int arg0, int arg1) {
        try {
            ++field4119;
            super.field7292 = arg1;
            if (arg0 != 64) {
                this.method2367(-31);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4129[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)I", line = 42)
    public final int method2367(int arg0) {
        try {
            if (arg0 != 3) {
                field4122 = null;
            }
            ++field4123;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4129[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)V", line = 59)
    public static void method2368(int arg0) {
        try {
            field4118 = null;
            field4122 = null;
            if (arg0 != 4) {
                field4121 = 24;
            }
            field4126 = null;
            field4124 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4129[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(ILpp;)V", line = 73)
    public class293(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V", line = 76)
    public final void method1031(byte arg0) {
        try {
            if (~super.field7292 > -1 || super.field7292 > 4) {
                super.field7292 = this.method1032(-111);
            }
            if (arg0 >= -70) {
                this.method1030(50, -52);
            }
            ++field4127;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4129[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2369(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 123);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2370(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
