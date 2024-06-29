import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class163 extends class82 {

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field2812 = 50;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "Ldj;")
    public static class44 field2817 = class89.method650(255, "mapdots");

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "Ll;")
    public static class120 field2814 = new class120(512);

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "Lih;")
    public static class95 field2818 = new class95(50);

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "[I")
    public static int[] field2820 = new int[32];

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "[I")
    public static int[] field2821 = new int[50];

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    public static int field2822 = 0;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static final void method1051(boolean arg0) {
        ++field2816;
        class75 var1 = class17.field309;
        synchronized (class17.field309) {
            ++class146.field2568;
            if (!arg0) {
                field2821 = null;
            }
            class197.field3496 = class202.field3595;
            if (~class111.field2006 <= -1) {
                while (class230.field4313 != class111.field2006) {
                    int var2 = class151.field2622[class230.field4313];
                    class230.field4313 = class230.field4313 + 1 & 127;
                    if (var2 >= 0) {
                        class130.field2324[var2] = true;
                    } else {
                        class130.field2324[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; ++var3) {
                    class130.field2324[var3] = false;
                }
                class111.field2006 = class230.field4313;
            }
            class202.field3595 = class55.field1006;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lgb;ZLgb;)V")
    public static final void method1052(class69 arg0, boolean arg1, class69 arg2) {
        ++field2813;
        if (class106.field1954 == null) {
            class106.field1954 = class115.method809(class19.field326, 0, -31242, class48.field902);
        }
        if (class219.field3964 == null) {
            class219.field3964 = class54.method390(-116, class169.field2924, 0, class48.field902);
        }
        if (class75.field1435 == null) {
            class75.field1435 = class54.method390(-121, class139.field2483, 0, class48.field902);
        }
        if (class87.field1666 == null) {
            class87.field1666 = class54.method390(-125, class166.field2867, 0, class48.field902);
        }
        if (!arg1) {
            class99.method688(0, 23, 765, 480, 0);
            class99.method700(0, 0, 138, 23, 12425273, 9135624);
            class99.method700(138, 0, 640, 23, 5197647, 2697513);
            arg2.method401(class139.field2478, 69, 15, 0, -1);
            if (class87.field1666 != null) {
                class87.field1666[1].method863(140, 1);
                arg0.method428(class135.field2426, 152, 10, 16777215, -1);
                class87.field1666[0].method863(140, 12);
                arg0.method428(class205.field3679, 152, 21, 16777215, -1);
            }
            if (class75.field1435 != null) {
                short var3 = 280;
                if (class17.field306[0] == 0 && ~class156.field2704[0] == -1) {
                    class75.field1435[2].method863(var3, 4);
                } else {
                    class75.field1435[0].method863(var3, 4);
                }
                short var4 = 500;
                short var5 = 390;
                short var6 = 610;
                if (class17.field306[0] == 0 && ~class156.field2704[0] == -2) {
                    class75.field1435[3].method863(var3 + 15, 4);
                } else {
                    class75.field1435[1].method863(var3 + 15, 4);
                }
                arg2.method428(class212.field3812, var3 + 32, 17, 16777215, -1);
                if (class17.field306[0] == 1 && class156.field2704[0] == 0) {
                    class75.field1435[2].method863(var5, 4);
                } else {
                    class75.field1435[0].method863(var5, 4);
                }
                if (class17.field306[0] == 1 && class156.field2704[0] == 1) {
                    class75.field1435[3].method863(var5 - -15, 4);
                } else {
                    class75.field1435[1].method863(var5 - -15, 4);
                }
                arg2.method428(class15.field276, var5 - -32, 17, 16777215, -1);
                if (class17.field306[0] == 2 && ~class156.field2704[0] == -1) {
                    class75.field1435[2].method863(var4, 4);
                } else {
                    class75.field1435[0].method863(var4, 4);
                }
                if (class17.field306[0] == 2 && ~class156.field2704[0] == -2) {
                    class75.field1435[3].method863(var4 + 15, 4);
                } else {
                    class75.field1435[1].method863(var4 + 15, 4);
                }
                arg2.method428(class47.field876, var4 + 32, 17, 16777215, -1);
                if (class17.field306[0] == 3 && ~class156.field2704[0] == -1) {
                    class75.field1435[2].method863(var6, 4);
                } else {
                    class75.field1435[0].method863(var6, 4);
                }
                if (~class17.field306[0] == -4 && class156.field2704[0] == 1) {
                    class75.field1435[3].method863(var6 + 15, 4);
                } else {
                    class75.field1435[1].method863(var6 + 15, 4);
                }
                arg2.method428(class219.field3966, var6 + 32, 17, 16777215, -1);
            }
            class99.method688(700, 4, 58, 16, 0);
            arg0.method401(class105.field1929, 729, 16, 16777215, -1);
            class98.field1807 = -1;
            if (class106.field1954 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 480 / (var8 + 1);
                int var10 = 765 / (var7 + 1);
                int var11;
                int var12;
                do {
                    var11 = var9;
                    var12 = var10;
                    if ((var10 - 1) * var9 >= class215.field3902) {
                        --var10;
                    }
                    if ((var9 + -1) * var10 >= class215.field3902) {
                        --var9;
                    }
                    if (~((var9 + -1) * var10) <= ~class215.field3902) {
                        --var9;
                    }
                } while (~var9 != ~var11 || ~var10 != ~var12);
                int var13 = (765 - var7 * var10) / (var10 - -1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (-(var8 * var9) + 480) / (var9 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (765 - (var7 * var10 - -((var10 + -1) * var13))) / 2;
                int var16 = (-((var9 + -1) * var14) + 480 + -(var8 * var9)) / 2;
                int var17 = 23 - -var16;
                int var18 = var15;
                int var19 = 0;
                for (int var20 = 0; class215.field3902 > var20; ++var20) {
                    boolean var21 = true;
                    class134 var22 = class183.field3188[var20];
                    class44 var23 = class199.method1287(var22.field2394, -1);
                    if (var22.field2394 == -1) {
                        var21 = false;
                        var23 = class106.field1932;
                    } else if (~var22.field2394 < -1981) {
                        var21 = false;
                        var23 = class123.field2192;
                    }
                    if (~class27.field486 <= ~var18 && class7.field151 >= var17 && class27.field486 < var7 + var18 && var8 + var17 > class7.field151 && var21) {
                        class98.field1807 = var20;
                        class106.field1954[!var22.field2405 ? 0 : 1].method1001(var18, var17, 128, 16777215);
                    } else {
                        class106.field1954[var22.field2405 ? 1 : 0].method1015(var18, var17);
                    }
                    if (class219.field3964 != null) {
                        class219.field3964[(!var22.field2405 ? 0 : 8) - -var22.field2395].method863(var18 + 29, var17);
                    }
                    arg2.method401(class199.method1287(var22.field2402, -1), var18 + 15, var8 / 2 + var17 - -5, 0, -1);
                    arg0.method401(var23, var18 + 60, var8 / 2 + var17 + 5, 268435455, -1);
                    var17 += var14 - -var8;
                    ++var19;
                    if (~var19 <= ~var9) {
                        var17 = 23 - -var16;
                        var18 += var7 + var13;
                        var19 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)V")
    public static void method1053(int arg0) {
        field2818 = null;
        field2817 = null;
        field2821 = null;
        if (arg0 == 27274) {
            field2814 = null;
            field2820 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2811;
        if (arg0 != 25238) {
            return null;
        } else {
            int[] var3 = super.field1595.method603(true, arg1);
            if (super.field1595.field1538) {
                class18.method147(var3, 0, class129.field2287, class212.field3809[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }
}
