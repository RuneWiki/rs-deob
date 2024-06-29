import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class62 extends class214 {

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    private final int field846;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    private final int field850;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    private final int field858;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    private final int field844;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Lqj;")
    public static class196 field849 = null;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field855 = 0;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Lea;")
    public static class243 field852 = new class243();

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static volatile int field861 = -1;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "Lea;")
    public static class243 field862 = new class243();

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "Ldf;")
    public static class231 field854;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Lnb;")
    public static class95 field847;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public final void method388(int arg0, int arg1, int arg2) {
        ++field843;
        if (arg0 <= 35) {
            field861 = 30;
        }
        int var4 = this.field858 * arg2 >> 12;
        int var5 = this.field844 * arg1 >> 12;
        int var6 = this.field850 * arg2 >> 12;
        int var7 = this.field846 * arg1 >> 12;
        class179.method1166(super.field3835, var6, var4, 55, var7, var5);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLqj;I)V")
    public static final void method389(byte arg0, class196 arg1, int arg2) {
        ++field845;
        boolean var3 = false;
        class196 var4 = arg1.method1293((byte) -11).method1307(-96);
        if (arg0 <= 12) {
            field859 = 23;
        }
        for (int var5 = 0; var5 < class252.field4451; ++var5) {
            class134 var6 = class247.field4397[class14.field153[var5]];
            if (var6 != null && var6.field1924 != null && var6.field1924.method1320(false, var4)) {
                var3 = true;
                class194.method1277(class102.field1477.field2102[0], 2, false, 1, var6.field2102[0], 0, var6.field2046[0], class102.field1477.field2046[0], 0, 0, 91, 1);
                if (arg2 != 1) {
                    if (~arg2 != -5) {
                        if (arg2 == 6) {
                            ++class86.field1264;
                            class44.field520.method1173(250, 14592);
                            class44.field520.method323(class14.field153[var5], (byte) -97);
                        } else if (arg2 == 7) {
                            ++class186.field3280;
                            class44.field520.method1173(21, 14592);
                            class44.field520.method323(class14.field153[var5], (byte) 50);
                        }
                    } else {
                        ++class111.field1592;
                        class44.field520.method1173(228, 14592);
                        class44.field520.method352(false, class14.field153[var5]);
                    }
                } else {
                    class44.field520.method1173(73, 14592);
                    ++class66.field935;
                    class44.field520.method352(false, class14.field153[var5]);
                }
                break;
            }
        }
        if (!var3) {
            class236.method1586(class93.method572(-72, new class196[] { class223.field4007, var4 }), 102, 0, class152.field2450);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIII)V")
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field846 = arg3;
        this.field850 = arg0;
        this.field858 = arg2;
        this.field844 = arg1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V")
    public final void method390(byte arg0, int arg1, int arg2) {
        ++field857;
        int var4 = 80 % ((arg0 - 48) / 52);
        int var5 = this.field846 * arg2 >> 12;
        int var6 = this.field850 * arg1 >> 12;
        int var7 = this.field844 * arg2 >> 12;
        int var8 = this.field858 * arg1 >> 12;
        class50.method264(super.field3830, super.field3827, var6, var5, super.field3835, var8, 3, var7);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public static void method391(byte arg0) {
        field849 = null;
        field847 = null;
        field854 = null;
        if (arg0 == -70) {
            field852 = null;
            field862 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V")
    public final void method392(int arg0, int arg1, int arg2) {
        ++field853;
        int var4 = this.field850 * arg0 >> 12;
        if (arg2 == -954688305) {
            int var5 = this.field858 * arg0 >> 12;
            int var6 = this.field844 * arg1 >> 12;
            int var7 = this.field846 * arg1 >> 12;
            class64.method402(super.field3830, var5, var7, 1, var4, var6, super.field3827);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field856;
        int var9 = -arg8 + arg0;
        int var10 = -102 % ((-65 - arg2) / 35);
        int var11 = (-arg5 + arg4 << 16) / var9;
        int var12 = -arg1 + arg3;
        if (arg0 < class144.field2221) {
            ++var9;
        }
        int var13 = (-arg7 + arg6 << 16) / var12;
        if (~class83.field1213 < ~arg3) {
            ++var12;
        }
        for (int var14 = 0; var14 < var9; ++var14) {
            int var31 = var11 * var14 >> 16;
            int var32 = (var14 - -1) * var11 >> 16;
            int var33 = -var31 + var32;
            if (var33 > 0) {
                int var34 = arg5 + var31;
                int var35 = var14 - -arg8 >> 6;
                int[][] var36 = class164.field2654[var35];
                byte[][] var37 = class92.field1349[var35];
                int var38 = arg5 + var32;
                byte[][] var39 = class104.field1500[var35];
                byte[][] var40 = class71.field1013[var35];
                byte[][] var41 = class53.field665[var35];
                byte[][] var42 = class64.field893[var35];
                for (int var43 = 0; var12 > var43; ++var43) {
                    int var44 = var13 * var43 >> 16;
                    int var45 = (var43 + 1) * var13 >> 16;
                    int var46 = -var44 + var45;
                    if (var46 > 0) {
                        int var47 = arg7 + var45;
                        int var48 = var43 - -arg1 >> 6;
                        int var49 = 63 & arg1 + var43;
                        int var50 = 63 & arg8 + var14;
                        int var51 = arg7 + var44;
                        int var52 = (var49 << 6) + var50;
                        int var55;
                        if (var36[var48] == null) {
                            int var53 = arg8 + var14 & 4;
                            int var54 = arg1 + var43 & 4;
                            if ((~var53 <= -3 || ~var54 >= -3) && (~var53 >= -3 || var54 >= 2)) {
                                var55 = class215.field3878[class151.field2437 - -1];
                            } else {
                                var55 = 4936552;
                            }
                        } else {
                            var55 = var36[var48][var52];
                        }
                        int var56 = var37[var48] != null ? class215.field3878[255 & var37[var48][var52]] : 0;
                        int var57 = var40[var48] == null ? 0 : class215.field3878[var40[var48][var52] & 255];
                        if (~var55 == -1) {
                            var55 = 1;
                        }
                        if (~var56 == -1 && var57 == 0) {
                            class55.method295(var34, var51, var33, var46, var55);
                        } else {
                            if (~var56 != -1) {
                                if (~var56 == 0) {
                                    var56 = 1;
                                }
                                byte var58 = var39[var48] == null ? 0 : var39[var48][var52];
                                int var59 = var58 & 252;
                                if (~var59 != -1 && var33 > 1 && ~var46 < -2) {
                                    class157.method993(true, var46, var34, var55, var51, var33, var59 >> 2, -105, class55.field683, var56, var58 & 3);
                                } else {
                                    class55.method295(var34, var51, var33, var46, var56);
                                }
                            }
                            if (var57 != 0) {
                                if (~var57 == 0) {
                                    var57 = var55;
                                }
                                byte var60 = var42[var48][var52];
                                int var61 = 252 & var60;
                                if (var61 == 0 || ~var33 >= -2 || var46 <= 1) {
                                    class55.method295(var34, var51, var33, var46, var57);
                                }
                                class157.method993(var56 == 0, var46, var34, 0, var51, var33, var61 >> 2, -99, class55.field683, var57, var60 & 3);
                            }
                        }
                        if (var41[var48] != null) {
                            int var62 = var41[var48][var52] & 255;
                            if (~var62 != -1) {
                                int var63;
                                if (~var33 != -2) {
                                    var63 = var38 + -1;
                                } else {
                                    var63 = var34;
                                }
                                int var64 = 13421772;
                                int var65;
                                if (~var46 != -2) {
                                    var65 = var47 + -1;
                                } else {
                                    var65 = var51;
                                }
                                if (~var62 <= -6 && ~var62 >= -9 || ~var62 <= -14 && var62 <= 16 || var62 >= 21 && ~var62 >= -25 || ~var62 == -28 || var62 == 28) {
                                    var62 -= 4;
                                    var64 = 13369344;
                                }
                                if (var62 == 1) {
                                    class55.method283(var34, var51, var46, var64);
                                } else if (var62 == 2) {
                                    class55.method291(var34, var51, var33, var64);
                                } else if (~var62 != -4) {
                                    if (var62 == 4) {
                                        class55.method291(var34, var65, var33, var64);
                                    } else if (~var62 != -10) {
                                        if (~var62 != -11) {
                                            if (~var62 == -12) {
                                                class55.method283(var63, var51, var46, 16777215);
                                                class55.method291(var34, var65, var33, var64);
                                            } else if (var62 == 12) {
                                                class55.method283(var34, var51, var46, 16777215);
                                                class55.method291(var34, var65, var33, var64);
                                            } else if (var62 != 17) {
                                                if (~var62 != -19) {
                                                    if (var62 == 19) {
                                                        class55.method291(var63, var65, 1, var64);
                                                    } else if (~var62 == -21) {
                                                        class55.method291(var34, var65, 1, var64);
                                                    } else if (~var62 != -26) {
                                                        if (var62 == 26) {
                                                            for (int var66 = 0; ~var46 < ~var66; ++var66) {
                                                                class55.method291(var34 + var66, var51 + var66, 1, var64);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var67 = 0; var46 > var67; ++var67) {
                                                            class55.method291(var34 - -var67, -var67 + var65, 1, var64);
                                                        }
                                                    }
                                                } else {
                                                    class55.method291(var63, var51, 1, var64);
                                                }
                                            } else {
                                                class55.method291(var34, var51, 1, var64);
                                            }
                                        } else {
                                            class55.method283(var63, var51, var46, 16777215);
                                            class55.method291(var34, var51, var33, var64);
                                        }
                                    } else {
                                        class55.method283(var34, var51, var46, 16777215);
                                        class55.method291(var34, var51, var33, var64);
                                    }
                                } else {
                                    class55.method283(var63, var51, var46, var64);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var15 = 0; ~var15 > ~var9; ++var15) {
            int var16 = var11 * var15 >> 16;
            int var17 = (var15 + 1) * var11 >> 16;
            int var18 = -var16 + var17;
            if (var18 > 0) {
                int var10000 = arg5 + var17;
                int var20 = arg5 + var16;
                byte[][] var21 = class187.field3288[arg8 + var15 >> 6];
                for (int var22 = 0; var22 < var12; ++var22) {
                    int var23 = var13 * var22 >> 16;
                    int var24 = (var22 + 1) * var13 >> 16;
                    int var25 = var24 - var23;
                    if (var25 > 0) {
                        var10000 = arg7 + var24;
                        int var27 = arg7 + var23;
                        int var28 = ((63 & var22 - -arg1) << 6) - -(var15 - -arg8 & 63);
                        int var29 = var22 - -arg1 >> 6;
                        if (var21[var29] != null) {
                            int var30 = 255 & var21[var29][var28];
                            if (var30 != 0) {
                                if (~var30 != -48 && ~var30 != -54) {
                                    class253.field4484[var30 + -1].method438(-(var18 / 2) + var20, -(var25 / 2) + var27, var18 * 2, var25 * 2);
                                } else {
                                    class253.field4484[var30 - 1].method438(var20, var27, var18 * 2 + 1, var25 * 2 + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(III)Lec;")
    public static final class178 method394(int arg0, int arg1, int arg2) {
        class178 var3 = class201.method1356(arg1, (byte) 106);
        ++field851;
        if (~arg2 == arg0) {
            return var3;
        } else {
            return var3 != null && var3.field3087 != null && arg2 < var3.field3087.length ? var3.field3087[arg2] : null;
        }
    }
}
