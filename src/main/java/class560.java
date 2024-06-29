import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class560 extends class227 {

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Z")
    public static volatile boolean field6993 = true;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "[I")
    public static int[] field6997 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "[I")
    public static int[] field6994 = new int[1];

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "Z")
    public static boolean field6992;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIF)V", line = 4)
    public class560(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 8)
    public static void method2976(boolean arg0) {
        if (!arg0) {
            method2978(-87, 30, -76);
        }
        field6997 = null;
        field6994 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(FZ)V", line = 20)
    public final void method118(float arg0, boolean arg1) {
        super.field2933 = arg0;
        ++field6995;
        if (arg1) {
            field6993 = false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V", line = 31)
    public static final void method2977(int arg0) {
        class248.field3191.method1913((byte) 94);
        ++field6998;
        class215.field2525.method1913((byte) 51);
        class501 var1 = (class501) class345.field4438.method1909(true);
        if (arg0 != -25195) {
            field6994 = null;
        }
        while (var1 != null) {
            int var18 = var1.field6242;
            if (var18 < 1000) {
                var1.method1566(arg0 + 25078);
                if (var18 != 45 && var18 != 50 && var18 != 58 && var18 != 46 && ~var18 != -58 && ~var18 != -6 && ~var18 != -61) {
                    class248.field3191.method1904(var1, -20);
                } else {
                    class215.field2525.method1904(var1, -82);
                }
            }
            var1 = (class501) class345.field4438.method1916((byte) 120);
        }
        class248.field3191.method1914(16, class345.field4438);
        class215.field2525.method1914(16, class345.field4438);
        if (class638.field8648 <= 1) {
            class67.field817 = null;
        } else if (class272.field3438 && class307.field3884.method1592((byte) -120, 81) && ~class638.field8648 < -3) {
            class67.field817 = (class501) class345.field4438.field4121.field3319.field3319;
        } else {
            class67.field817 = (class501) class345.field4438.field4121.field3319;
        }
        int var2 = -1;
        class132 var3 = (class132) class500.field6235.method1909(true);
        if (var3 != null) {
            var2 = var3.method855((byte) -114);
        }
        if (class367.field4752) {
            if (~var2 == 0) {
                int var4 = class113.field1423.method1074((byte) 126);
                int var5 = class113.field1423.method1078((byte) 118);
                if (~var4 > ~(class284.field3593 + -10) || ~(class559.field6988 + class284.field3593 + 10) > ~var4 || class465.field5774 + -10 > var5 || ~(class465.field5774 - -class484.field6012 + 10) > ~var5) {
                    class75.method598(0);
                }
            }
            if (var2 == 0) {
                int var6 = class284.field3593;
                int var7 = class465.field5774;
                int var8 = class559.field6988;
                int var9 = var3.method860(true);
                int var10 = var3.method851(arg0 + -1160803756);
                int var11 = -1;
                for (int var12 = 0; ~var12 > ~class638.field8648; ++var12) {
                    if (class353.field4564) {
                        int var16 = (class638.field8648 - (var12 + 1)) * 16 + 33 + var7;
                        if (~var9 < ~var6 && ~(var6 + var8) < ~var9 && ~var10 < ~(var16 - 13) && ~(var16 + 4) < ~var10) {
                            var11 = var12;
                        }
                    } else {
                        int var17 = (-var12 + -1 + class638.field8648) * 16 + var7 + 31;
                        if (~var6 > ~var9 && var9 < var6 - -var8 && ~var10 < ~(var17 - 13) && var17 - -3 > var10) {
                            var11 = var12;
                        }
                    }
                }
                if (~var11 != 0) {
                    int var13 = 0;
                    class270 var14 = new class270(class345.field4438);
                    for (class501 var15 = (class501) var14.method1608(3); var15 != null; var15 = (class501) var14.method1604(98)) {
                        if (~var11 == ~var13) {
                            class391.method2228(var15, false, var10, var9);
                        }
                        ++var13;
                    }
                }
                class75.method598(0);
                return;
            }
        } else {
            if (~var2 == -1 && (class175.field2061 == 1 && ~class638.field8648 < -3 || class681.method3766(-5))) {
                var2 = 2;
            }
            if (var2 == 2 && ~class638.field8648 < -1 && var3 != null) {
                if (class338.field4324 == null && class336.field4145 == 0) {
                    class252.method1519(var3.method860(true), var3.method851(-1160828951), (byte) -8);
                } else {
                    class618.field8385 = 2;
                }
            }
            if (var2 == 0 && class638.field8648 > 0) {
                class327.method1881((byte) 116);
            }
            if (class338.field4324 != null || ~class336.field4145 != -1) {
                return;
            }
            class666.field9041 = null;
            class618.field8385 = 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z", line = 211)
    public static final boolean method2978(int arg0, int arg1, int arg2) {
        ++field6996;
        class687 var3 = class232.field3017.method2358(0, arg2);
        if (~arg0 == -12) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return arg1 != 1 ? true : var3.method3789(-7344, arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIII)V", line = 236)
    public final void method116(byte arg0, int arg1, int arg2, int arg3) {
        super.field2929 = arg1;
        super.field2931 = arg3;
        ++field6990;
        int var5 = -55 / ((arg0 - 47) / 34);
        super.field2936 = arg2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)I", line = 248)
    public static final int method2979(int arg0, byte arg1) {
        int var7 = arg0 - 1;
        ++field6991;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 <= 9) {
            field6997 = null;
        }
        return var6 + 1;
    }
}
