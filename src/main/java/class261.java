import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class261 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3712 = new String[] { method2172(method2171("\u0013-$4\u0002")), method2172(method2171("\u0013-$\u0005E3;x\u0018D\u0007g")), method2172(method2171("\u0013-$2\u0002")), method2172(method2171("\u0013-$5\u0002")), method2172(method2171("\u0013-$0\u0002")), method2172(method2171("\u0013-$MC\u000e&~O\u0002")), method2172(method2171("\u0013-$3\u0002")) };

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3701 = 0;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
    public static int[] field3708 = new int[2];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lhj;")
    public static class671 field3698 = new class671(12, 0, 1, 0);

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lmg;")
    public static class290 field3709;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Ljf;")
    public static class566 field3699;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field3700;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[[Z")
    public static boolean[][] field3705;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JB)V")
    public static final void method2166(long arg0, byte arg1) {
        try {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var4) {
            }
            if (arg1 <= -4) {
                field3703++;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3712[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method2167(int arg0) {
        try {
            field3700 = null;
            field3699 = null;
            field3698 = null;
            field3708 = null;
            if (arg0 <= -38) {
                field3709 = null;
                field3705 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3712[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
    public static final int method2168(int arg0, int arg1, int arg2, int arg3) {
        try {
            field3704++;
            if (arg0 < 115) {
                return 116;
            } else if ((class76.field1089[arg3][arg1][arg2] & 0x8) == 0) {
                return arg3 <= 0 || (class76.field1089[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
            } else {
                return 0;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3712[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field3702++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3712[1] + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
    public final int method2169(int arg0) {
        try {
            field3710++;
            if (arg0 != -12884) {
                field3708 = null;
            }
            return this.field3706;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3712[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(II)V")
    public class261(int arg0, int arg1) {
        try {
            this.field3706 = arg0;
            this.field3707 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3712[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIII)Llga;")
    public static final class47 method2170(boolean arg0, int arg1, int arg2, int arg3) {
        try {
            field3711++;
            class335 var4 = null;
            if (class504.field7375 != null) {
                var4 = new class335(arg2, class504.field7375, class74.field1069[arg2], 1000000);
            }
            class301.field4192[arg2] = class722.field10274.method2185(class2.field31, (byte) -47, var4, arg2);
            class301.field4192[arg2].method3799(arg1 - 14685);
            return arg1 == 14772 ? new class47(class301.field4192[arg2], arg0, arg3) : null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3712[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2171(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2172(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
