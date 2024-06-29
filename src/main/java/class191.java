import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class191 extends class497 {

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2536 = new String[] { method1599(method1598("M\u00050mG")), method1599(method1598("M\u00050hG")), method1599(method1598("M\u00050lG")), method1599(method1598("M\u00050kG")), method1599(method1598("M\u00050oG")), method1599(method1598("M\u00050nG")), method1599(method1598("M\u00050jG")) };

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "Ldfa;")
    public static class477 field2530 = new class477(32);

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "F")
    public static float field2535 = 1.0F;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "D")
    public static double field2534;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)I", line = 4)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field2532;
            if (arg0 != -73) {
                this.method1029((byte) 2, -12);
            }
            return 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2536[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(ILpp;)V", line = 15)
    public class191(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lpp;)V", line = 18)
    public class191(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V", line = 22)
    public final void method1030(int arg0, int arg1) {
        try {
            ++field2533;
            if (arg0 != 64) {
                this.method1032(24);
            }
            super.field7292 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2536[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V", line = 34)
    public final void method1031(byte arg0) {
        try {
            ++field2531;
            if (arg0 < -70) {
                if (super.field7292 < 1 || ~super.field7292 < -4) {
                    super.field7292 = this.method1032(-127);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2536[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I", line = 48)
    public final int method1032(int arg0) {
        try {
            ++field2527;
            if (arg0 >= -101) {
                this.method1032(-110);
            }
            return super.field7293.method4675((byte) -118).method276(118) ? 3 : 2;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2536[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)I", line = 59)
    public final int method1595(int arg0) {
        try {
            ++field2529;
            return arg0 != 3 ? 16 : super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2536[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V", line = 73)
    public static void method1596(byte arg0) {
        try {
            field2530 = null;
            if (arg0 >= -7) {
                method1596((byte) 8);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2536[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIBI)V", line = 91)
    public static final void method1597(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            if (arg3 != 58) {
                method1597(-79, 24, -103, (byte) -56, -81);
            }
            ++field2528;
            if (arg1 >= class335.field4844 && arg1 <= class507.field7453) {
                int var8 = class679.method4875(class50.field717, class557.field8113, arg2, arg3 + -59);
                int var7 = class679.method4875(class50.field717, class557.field8113, arg0, arg3 ^ -59);
                class228.method1901(arg4, var8, var7, arg1, (byte) 121);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2536[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1598(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 111);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1599(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
