import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class152 extends class46 {

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Laj;")
    public class11 field2774;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Lmb;")
    public static class132 field2775 = class166.method1092("sl_stars", 124);

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Llc;")
    public static class122 field2771 = new class122(32);

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field2777 = 0;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "Lmb;")
    public static class132 field2778 = class166.method1092("", 122);

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Lmb;")
    public static class132 field2779 = field2778;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Lmb;")
    public static class132 field2783 = class166.method1092(":clanreq:", 118);

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Lmb;")
    public static class132 field2784 = field2778;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Lmb;")
    public static class132 field2781 = field2778;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Lmb;")
    public static class132 field2776 = field2778;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Z")
    public static boolean field2782 = false;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Lmb;")
    public static class132 field2785 = field2778;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lmb;")
    public static class132 field2780 = field2778;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2772++;
        if (arg9 != 11056) {
            method998(68, 71, 117, 41, 69, -95, -121, 109, 49, 75);
        }
        class226 var10 = null;
        for (class226 var11 = (class226) class84.field1462.method119(true); var11 != null; var11 = (class226) class84.field1462.method125((byte) -62)) {
            if (var11.field4088 == arg2 && var11.field4102 == arg8 && var11.field4094 == arg4 && var11.field4099 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class226();
            var10.field4088 = arg2;
            var10.field4094 = arg4;
            var10.field4099 = arg5;
            var10.field4102 = arg8;
            class4.method20(var10, false);
            class84.field1462.method120(0, var10);
        }
        var10.field4091 = arg1;
        var10.field4084 = arg3;
        var10.field4093 = arg7;
        var10.field4097 = arg6;
        var10.field4083 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lrg;I)V")
    public static final void method999(class191 arg0, int arg1) {
        field2773++;
        if (class62.field1040) {
            class232.method1475(arg0, 100);
            return;
        }
        if (class49.field827 == 1 && class48.field826 >= 715 && class189.field3501 >= 453) {
            class168.field3068 = !class168.field3068;
            if (class168.field3068) {
                class208.method1289((byte) 81);
            } else {
                class86.method538(0, 255, arg1 ^ 0xFFFFFF8F, class69.field1161, false, class145.field2710);
            }
        }
        if (class95.field1666 == 5) {
            return;
        }
        class74.field1238++;
        if (class95.field1666 != 10) {
            return;
        }
        if (field2777 != 2) {
            if (class49.field827 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 100;
                byte var5 = 35;
                if (class48.field826 >= var2 && class48.field826 <= var2 + var4 && var3 <= class189.field3501 && var3 + var5 >= class189.field3501) {
                    class49.method324(true);
                    return;
                }
            }
            if (class4.field45 != null) {
                class49.method324(true);
            }
        }
        if (arg1 != 0) {
            return;
        }
        int var6 = class48.field826;
        int var7 = class49.field827;
        int var8 = class189.field3501;
        if (class225.field4078 == 0) {
            short var9 = 302;
            short var10 = 291;
            if (var7 == 1 && var9 - 75 <= var6 && var9 + 75 >= var6 && var8 >= var10 - 20 && var10 + 20 >= var8) {
                class225.field4078 = 3;
                class144.field2691 = 0;
            }
            boolean var11 = false;
            if (class211.field3871 != 0) {
                while (class85.method526((byte) -95)) {
                    if (class191.field3536 == 84) {
                        var11 = true;
                        break;
                    }
                }
            }
            short var12 = 462;
            if (var11 || var7 == 1 && var12 - 75 <= var6 && var12 + 75 >= var6 && var8 >= var10 - 20 && var8 <= var10 + 20) {
                field2779 = class169.field3149;
                field2784 = class119.field2254;
                class225.field4078 = 2;
                field2776 = class169.field3163;
                class144.field2691 = 0;
            }
        } else if (class225.field4078 == 2) {
            short var13 = 302;
            short var14 = 231;
            int var21 = var14 + 30;
            short var15 = 321;
            if (var7 == 1 && var21 - 15 <= var8 && var21 > var8) {
                class144.field2691 = 0;
            }
            var21 += 15;
            if (var7 == 1 && var8 >= var21 - 15 && var21 > var8) {
                class144.field2691 = 1;
            }
            var21 += 15;
            if (var7 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var15 - 20 <= var8 && var8 <= var15 + 20) {
                field2780 = field2780.method906(-48).method900(0);
                if (field2780.method902((byte) -4) == 0) {
                    class48.method321(class169.field3143, class189.field3487, (byte) 33, class169.field3152);
                } else if (field2785.method902((byte) -4) == 0) {
                    class48.method321(class169.field3139, class40.field653, (byte) 43, class169.field3151);
                } else {
                    class48.method321(class169.field3120, class68.field1119, (byte) -128, class169.field3154);
                    class2.method6(20, (byte) -128);
                }
            } else {
                short var16 = 462;
                if (var7 == 1 && var16 - 75 <= var6 && var16 + 75 >= var6 && var15 - 20 <= var8 && var15 + 20 >= var8) {
                    field2780 = field2778;
                    field2785 = field2778;
                    class225.field4078 = 0;
                }
                while (true) {
                    while (class85.method526((byte) -118)) {
                        boolean var17 = false;
                        for (int var18 = 0; var18 < class47.field808.method902((byte) -4); var18++) {
                            if (class209.field3814 == class47.field808.method881(var18, 70)) {
                                var17 = true;
                                break;
                            }
                        }
                        if (class144.field2691 == 0) {
                            if (class191.field3536 == 85 && field2780.method902((byte) -4) > 0) {
                                field2780 = field2780.method886(~arg1, 0, field2780.method902((byte) -4) - 1);
                            }
                            if (class191.field3536 == 84 || class191.field3536 == 80) {
                                class144.field2691 = 1;
                            }
                            if (var17 && field2780.method902((byte) -4) < 12) {
                                field2780 = field2780.method875(118, class209.field3814);
                            }
                        } else if (class144.field2691 == 1) {
                            if (class191.field3536 == 85 && field2785.method902((byte) -4) > 0) {
                                field2785 = field2785.method886(-1, 0, field2785.method902((byte) -4) - 1);
                            }
                            if (class191.field3536 == 84 || class191.field3536 == 80) {
                                class144.field2691 = 0;
                            }
                            if (class211.field3871 != 0 && class191.field3536 == 84) {
                                field2780 = field2780.method906(-48).method900(0);
                                if (field2780.method902((byte) -4) == 0) {
                                    class48.method321(class169.field3143, class189.field3487, (byte) -118, class169.field3152);
                                    return;
                                }
                                if (field2785.method902((byte) -4) == 0) {
                                    class48.method321(class169.field3139, class40.field653, (byte) -124, class169.field3151);
                                    return;
                                }
                                class48.method321(class169.field3120, class68.field1119, (byte) 35, class169.field3154);
                                class2.method6(20, (byte) 54);
                                return;
                            }
                            if (var17 && field2785.method902((byte) -4) < 20) {
                                field2785 = field2785.method875(arg1 ^ 0xFFFFFFA3, class209.field3814);
                            }
                        }
                    }
                    return;
                }
            }
        } else if (class225.field4078 == 3) {
            short var19 = 382;
            short var20 = 321;
            if (var7 == 1 && var19 - 75 <= var6 && var19 + 75 >= var6 && var8 >= var20 - 20 && var20 + 20 >= var8) {
                class225.field4078 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static void method1000(int arg0) {
        field2776 = null;
        field2778 = null;
        field2783 = null;
        field2785 = null;
        field2784 = null;
        field2779 = null;
        field2775 = null;
        field2781 = null;
        field2780 = null;
        field2771 = null;
        if (arg0 != 25719) {
            method998(81, -55, -52, 119, 40, 22, 7, -37, 11, -100);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Laj;)V")
    public class152(class11 arg0) {
        this.field2774 = arg0;
    }
}
