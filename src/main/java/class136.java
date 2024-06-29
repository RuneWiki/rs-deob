import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class136 extends class246 {

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    private final int field2630;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    private final int field2627;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    private final int field2629;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    private final int field2633;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2623 = (int) (17.0D * Math.random()) - 8;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lhh;")
    private static class163 field2622 = class137.method1065(" is already on your friend list)3", 17);

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lhh;")
    public static class163 field2626 = field2622;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Lhh;")
    public static class163 field2624 = class137.method1065("W-=hlen Sie eine Welt", 17);

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[I")
    public static int[] field2635 = new int[256];

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "Lhh;")
    public static class163 field2636 = class137.method1065(":chalreq:", 17);

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lhh;")
    public static class163 field2638 = class137.method1065("mem=", 17);

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method1058(byte arg0) {
        field2622 = null;
        field2636 = null;
        int var1 = -31 % ((arg0 - 46) / 50);
        field2638 = null;
        field2624 = null;
        field2635 = null;
        field2626 = null;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)I")
    public static final int method1059(int arg0, int arg1) {
        if (arg0 != -11998) {
            return -15;
        } else {
            ++field2631;
            int var2 = arg1 * 6 + -61440;
            int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var4 = 40960 - -(arg1 * var2 >> 12);
            return var3 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)V")
    public final void method44(byte arg0, int arg1, int arg2) {
        if (arg0 != 6) {
            field2638 = null;
        }
        ++field2625;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method1060(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class127.field2469.field4096; ++var9) {
            int var11 = class127.field2469.field4105[var9] + -class54.field892;
            int var12 = (-arg2 + var11) * (-arg7 + arg4) / (-arg2 + arg5) + arg7;
            int var13 = -class127.field2469.field4097[var9] + class218.field3965 + class58.field952 + -1;
            int var14 = class127.field2469.method1584(var9, (byte) -83);
            int var15 = (-arg0 + arg6) * (-arg1 + var13) / (-arg1 + arg8) + arg0;
            class108 var16 = null;
            if (var14 == 0) {
                if ((double) class21.field335 == 3.0D) {
                    var16 = class64.field1081;
                }
                if ((double) class21.field335 == 4.0D) {
                    var16 = class51.field859;
                }
                if ((double) class21.field335 == 6.0D) {
                    var16 = class127.field2477;
                }
                if ((double) class21.field335 == 8.0D) {
                    var16 = class43.field734;
                }
            }
            int var17 = 16777215;
            if (~var14 == -2) {
                if ((double) class21.field335 == 3.0D) {
                    var16 = class127.field2477;
                }
                if ((double) class21.field335 == 4.0D) {
                    var16 = class43.field734;
                }
                if ((double) class21.field335 == 6.0D) {
                    var16 = class82.field1588;
                }
                if ((double) class21.field335 == 8.0D) {
                    var16 = class181.field3306;
                }
            }
            if (var14 == 2) {
                if ((double) class21.field335 == 3.0D) {
                    var16 = class82.field1588;
                }
                var17 = 16755200;
                if ((double) class21.field335 == 4.0D) {
                    var16 = class181.field3306;
                }
                if ((double) class21.field335 == 6.0D) {
                    var16 = class253.field4433;
                }
                if ((double) class21.field335 == 8.0D) {
                    var16 = class10.field163;
                }
            }
            if (class127.field2469.field4106[var9] != -1) {
                var17 = class127.field2469.field4106[var9];
            }
            if (var16 != null) {
                class163[] var18 = new class163[class127.field2469.field4098[var9].method1222(60, false) + 1];
                class43.field739.method573(class127.field2469.field4098[var9], (int[]) null, var18);
                int var19 = var18.length;
                int var20 = var15 - (var19 + -1) * var16.method868() / 2;
                int var21 = var20 + var16.method873() / 2;
                for (int var22 = 0; var19 > var22; ++var22) {
                    class163 var23 = ~(var19 + -1) == ~var22 ? var18[var22] : var18[var22].method1188(true, -4 + var18[var22].method1221(-23096), 0);
                    var16.method876(var23, var12, var21, var17, true);
                    var21 += var16.method868();
                }
            }
        }
        ++field2634;
        int var10 = -81 / ((arg3 - 42) / 63);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public final void method42(int arg0, int arg1, int arg2) {
        ++field2637;
        int var4 = this.field2627 * arg1 >> 12;
        int var5 = this.field2629 * arg1 >> 12;
        if (arg0 >= -17) {
            field2635 = null;
        }
        int var6 = this.field2633 * arg2 >> 12;
        int var7 = this.field2630 * arg2 >> 12;
        class127.method1008(var5, var7, (byte) -48, super.field4342, super.field4333, var4, super.field4335, var6);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Lhh;")
    public static final class163 method1061(int arg0, byte arg1) {
        if (arg1 <= 100) {
            field2638 = null;
        }
        ++field2639;
        return class256.method1732(10, false, arg0, false);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIII)V")
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2630 = arg3;
        this.field2627 = arg0;
        this.field2629 = arg2;
        this.field2633 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        int var4 = this.field2629 * arg0 >> 12;
        if (arg1 == 2) {
            ++field2640;
            int var5 = this.field2633 * arg2 >> 12;
            int var6 = this.field2630 * arg2 >> 12;
            int var7 = this.field2627 * arg0 >> 12;
            class171.method1269(var6, super.field4333, var7, var5, (byte) 112, var4);
        }
    }
}
