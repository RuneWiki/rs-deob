import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class595 extends class54 {

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8735 = new String[] { method4433(method4432(",9Y\u0019s")), method4433(method4432(",9Y\u0011s")), method4433(method4432(",9Y\u0012s")), method4433(method4432(",9Y\u0013s")), method4433(method4432(",9Y\u0017s")), method4433(method4432(",9Y\u0016s")), method4433(method4432(",9Y\u0015s")), method4433(method4432(",9Y\u0010s")) };

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "[I")
    public static int[] field8726 = new int[4];

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "J")
    public static long field8729 = 0L;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lla;")
    public static class476 field8725;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lhia;)V", line = 4)
    public class595(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFFFIBFF)F", line = 11)
    public static final float method4428(float arg0, float arg1, float arg2, float arg3, int arg4, byte arg5, float arg6, float arg7) {
        try {
            ++field8728;
            float var8 = 0.0F;
            float var9 = -arg1 + arg2;
            float var10 = -arg7 + arg0;
            float var11 = arg3 - arg6;
            if (arg5 <= 20) {
                method4429(true);
            }
            float var12 = 0.0F;
            float var13 = 0.0F;
            float var14 = 0.0F;
            while (var8 < 1.1F) {
                float var15 = var8 * var9 + arg1;
                float var16 = var8 * var10 + arg7;
                float var17 = var8 * var11 + arg6;
                int var18 = (int) var15 >> 9;
                int var19 = (int) var17 >> 9;
                if (~var18 < -1 && var19 > 0 && ~class648.field9378 < ~var18 && ~class659.field9506 < ~var19) {
                    int var20 = class225.field3446.field6200;
                    if (var20 < 3 && (class184.field2545[1][var18][var19] & 2) != 0) {
                        ++var20;
                    }
                    int var21 = class184.field2541[var20].method2404((byte) 115, (int) var15, (int) var17);
                    if (var16 > (float) var21) {
                        if (~arg4 > -3) {
                            return var8;
                        }
                        return 0.1F * method4428(var16, var12, var15, var17, arg4 + -1, (byte) 22, var14, var13) + (var8 - 0.1F);
                    }
                }
                var12 = var15;
                var13 = var16;
                var8 += 0.1F;
                var14 = var17;
            }
            return -1.0F;
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field8735[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(Z)V", line = 83)
    public static void method4429(boolean arg0) {
        try {
            if (arg0) {
                method4429(false);
            }
            field8725 = null;
            field8726 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8735[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(ILhia;)V", line = 96)
    public class595(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V", line = 99)
    public final void method113(int arg0, int arg1) {
        try {
            ++field8734;
            if (arg0 != 0) {
                field8733 = 90;
            }
            super.field593 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8735[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)I", line = 110)
    public final int method4430(boolean arg0) {
        try {
            if (arg0) {
                field8726 = null;
            }
            ++field8732;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8735[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IB)I", line = 121)
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 >= -106) {
                method4429(true);
            }
            ++field8724;
            return !class301.method2530(true, super.field589.field812.method1610(false)) ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8735[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)I", line = 135)
    public final int method111(boolean arg0) {
        try {
            ++field8731;
            if (arg0) {
                method4428(-1.2020315F, -0.51450557F, -0.3605594F, 1.2967949F, 73, (byte) 6, -0.33668178F, -0.3054187F);
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8735[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Z", line = 148)
    public final boolean method4431(int arg0) {
        try {
            ++field8730;
            if (arg0 != -10243) {
                field8729 = 52L;
            }
            return class301.method2530(true, super.field589.field812.method1610(false));
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8735[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V", line = 167)
    public final void method115(boolean arg0) {
        try {
            ++field8727;
            if (super.field589.field812.method1612(false) && !class301.method2530(true, super.field589.field812.method1610(false))) {
                super.field593 = 0;
            }
            if (super.field593 < 0 || ~super.field593 < -3) {
                super.field593 = this.method111(false);
            }
            if (!arg0) {
                field8733 = -50;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8735[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4432(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 91);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4433(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
