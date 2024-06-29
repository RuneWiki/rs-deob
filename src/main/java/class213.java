import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class213 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[I")
    public static int[] field3849 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Laf;")
    public static class68 field3851 = new class68();

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field3852 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field3855 = 0;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lcc;")
    public static class209 field3858 = class95.method669(114, "Fps:");

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILde;III)V")
    public static final void method1498(int arg0, class108 arg1, int arg2, int arg3, int arg4) {
        field3850++;
        if (class223.field4069 == arg1 || class98.field1912 >= 400) {
            return;
        }
        class209 var5;
        if (arg1.field2175 == 0) {
            boolean var6 = true;
            if (class223.field4069.field2153 != -1 && arg1.field2153 != -1) {
                int var7 = arg1.field2153 <= class223.field4069.field2153 ? arg1.field2153 : class223.field4069.field2153;
                int var8 = class223.field4069.field2171 <= arg1.field2171 ? arg1.field2171 : class223.field4069.field2171;
                int var9 = 5 - (-(var8 * 10 / 100) - var7);
                int var10 = class223.field4069.field2171 - arg1.field2171;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            if (arg1.field2171 < arg1.field2165) {
                var5 = class229.method1604(new class209[] { arg1.method781(65535), var6 ? class13.method99(arg1.field2171, true, class223.field4069.field2171) : class173.field3157, class198.field3553, class239.field4316, class66.method485(arg1.field2171, (byte) 105), class255.field4606, class66.method485(arg1.field2165 - arg1.field2171, (byte) 37), class228.field4154 }, (byte) 126);
            } else {
                var5 = class229.method1604(new class209[] { arg1.method781(65535), var6 ? class13.method99(arg1.field2171, true, class223.field4069.field2171) : class173.field3157, class198.field3553, class239.field4316, class66.method485(arg1.field2171, (byte) 41), class228.field4154 }, (byte) 43);
            }
        } else {
            var5 = class229.method1604(new class209[] { arg1.method781(65535), class198.field3553, class40.field683, class66.method485(arg1.field2175, (byte) 23), class228.field4154 }, (byte) 26);
        }
        if (class25.field445 == 1) {
            class19.field378++;
            class252.method1740((long) arg2, (byte) 90, class124.field2417, arg0, (short) 24, class229.method1604(new class209[] { class114.field2289, class183.field3308, var5 }, (byte) 61), arg3);
        } else if (!class260.field4689) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class33.field592[var11] != null) {
                    class47.field915++;
                    boolean var12 = false;
                    short var13 = 0;
                    if (class218.field3936 == 0 && class33.field592[var11].method1483(class131.field2508, (byte) -25)) {
                        if (class223.field4069.field2171 < arg1.field2171) {
                            var13 = 2000;
                        }
                        if (class223.field4069.field2178 != 0 && arg1.field2178 != 0) {
                            if (class223.field4069.field2178 == arg1.field2178) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class171.field3136[var11]) {
                        var13 = 2000;
                    }
                    short var14 = class224.field4077[var11];
                    short var15 = (short) (var13 + var14);
                    class252.method1740((long) arg2, (byte) 90, class33.field592[var11], arg0, var15, class229.method1604(new class209[] { class173.field3157, var5 }, (byte) 70), arg3);
                }
            }
        } else if ((class49.field948 & 0x8) == 8) {
            class56.field1158++;
            class252.method1740((long) arg2, (byte) 90, class184.field3318, arg0, (short) 10, class229.method1604(new class209[] { class44.field879, class183.field3308, var5 }, (byte) 105), arg3);
        }
        for (int var16 = 0; var16 < class98.field1912; var16++) {
            if (class40.field680[var16] == 31) {
                class20.field391[var16] = class229.method1604(new class209[] { class173.field3157, var5 }, (byte) 47);
                break;
            }
        }
        if (arg4 != 28542) {
            field3851 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lsj;ILsj;Lsj;)V")
    public static final void method1499(class49 arg0, int arg1, class49 arg2, class49 arg3) {
        if (arg1 == 1) {
            field3853++;
            class2.field31 = arg0;
            class247.field4469 = arg2;
            class23.field428 = arg3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lpb;IIIII)V")
    public static final void method1500(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class50.field983 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class56.field1154) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class277.field4879 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class109 var14 = class106.field2089[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class271.field4803[var11][var12 + 1][var13] + class271.field4803[var11][var12][var13] + class271.field4803[var11][var12][var13 + 1] + class271.field4803[var11][var12 + 1][var13 + 1]) / 4 - (class271.field4803[arg1][arg2 + 1][arg3] + class271.field4803[arg1][arg2][arg3] + class271.field4803[arg1][arg2][arg3 + 1] + class271.field4803[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class187 var16 = var14.field2213;
                                    if (var16 != null) {
                                        if (var16.field3377.method909()) {
                                            arg0.method910(var16.field3377, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3387 != null && var16.field3387.method909()) {
                                            arg0.method910(var16.field3387, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2203; var17++) {
                                        class264 var18 = var14.field2189[var17];
                                        if (var18 != null && var18.field4735.method909() && (var18.field4746 == var12 || var7 == var12) && (var18.field4741 == var13 || var9 == var13)) {
                                            int var19 = var18.field4747 + 1 - var18.field4746;
                                            int var20 = var18.field4731 + 1 - var18.field4741;
                                            arg0.method910(var18.field4735, (var18.field4746 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4741 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1501(int arg0) {
        field3851 = null;
        if (arg0 < 112) {
            method1502(false, -36, (byte) 68, true, true);
        }
        field3849 = null;
        field3858 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZIBZZ)Lsj;")
    public static final class49 method1502(boolean arg0, int arg1, byte arg2, boolean arg3, boolean arg4) {
        if (arg2 >= -125) {
            field3851 = null;
        }
        field3856++;
        class182 var5 = null;
        if (class118.field2369 != null) {
            var5 = new class182(arg1, class118.field2369, class146.field2692[arg1], 1000000);
        }
        class81.field1533[arg1] = class104.field2006.method1552(var5, arg1, (byte) 67, class48.field918);
        if (arg3) {
            class81.field1533[arg1].method550(27551);
        }
        return new class49(class81.field1533[arg1], arg4, arg0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLrh;Lsj;Lsj;)V")
    public static final void method1503(boolean arg0, class46 arg1, class49 arg2, class49 arg3) {
        class104.field2008 = arg2;
        class30.field536 = arg3;
        class173.field3156 = arg1;
        if (!arg0) {
            field3852 = 117;
        }
        if (class104.field2008 != null) {
            class7.field130 = class104.field2008.method360(1, 0);
        }
        if (class30.field536 != null) {
            class166.field3001 = class30.field536.method360(1, 0);
        }
        field3848++;
    }
}
