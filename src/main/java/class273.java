import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class273 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lvf;")
    public static class265 field4842 = class87.method582(-46, "tremblement:");

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lvf;")
    public static class265 field4840 = class87.method582(-46, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[[I")
    private static int[][] field4844 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field4845 = 0;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lgk;")
    public static class6 field4846 = null;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lvf;")
    public static class265 field4847 = class87.method582(-46, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lal;IIIIIIIZ)V")
    public static final void method1868(class278 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class65.field1254;
        int var11;
        int var12 = var11 = (arg7 << 7) - class204.field3647;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class279.field4936[arg1][arg6][arg7] - class248.field4309;
        int var18 = class279.field4936[arg1][arg6 + 1][arg7] - class248.field4309;
        int var19 = class279.field4936[arg1][arg6 + 1][arg7 + 1] - class248.field4309;
        int var20 = class279.field4936[arg1][arg6][arg7 + 1] - class248.field4309;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class247.field4300;
        int var46 = (var24 << 9) / var25 + class247.field4291;
        int var47 = (var27 << 9) / var31 + class247.field4300;
        int var48 = (var30 << 9) / var31 + class247.field4291;
        int var49 = (var33 << 9) / var37 + class247.field4300;
        int var50 = (var36 << 9) / var37 + class247.field4291;
        int var51 = (var39 << 9) / var43 + class247.field4300;
        int var52 = (var42 << 9) / var43 + class247.field4291;
        class247.field4302 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class193.field3478 && class102.method680(class262.field4573 + class247.field4300, class7.field264 + class247.field4291, var50, var52, var48, var49, var51, var47)) {
                class127.field2267 = arg6;
                class179.field3183 = arg7;
            }
            if (!arg8) {
                class247.field4297 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class247.field4301 || var51 > class247.field4301 || var47 > class247.field4301) {
                    class247.field4297 = true;
                }
                if (arg0.field4910 == -1) {
                    if (arg0.field4923 != 12345678) {
                        class247.method1633(var50, var52, var48, var49, var51, var47, arg0.field4923, arg0.field4917, arg0.field4909);
                    }
                } else if (!class196.field3505) {
                    int var53 = class247.field4292.method64(-59, arg0.field4910);
                    class247.method1633(var50, var52, var48, var49, var51, var47, class91.method622(var53, arg0.field4923), class91.method622(var53, arg0.field4917), class91.method622(var53, arg0.field4909));
                } else if (arg0.field4914) {
                    class247.method1643(var50, var52, var48, var49, var51, var47, arg0.field4923, arg0.field4917, arg0.field4909, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4910);
                } else {
                    class247.method1643(var50, var52, var48, var49, var51, var47, arg0.field4923, arg0.field4917, arg0.field4909, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4910);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class193.field3478 && class102.method680(class262.field4573 + class247.field4300, class7.field264 + class247.field4291, var46, var48, var52, var45, var47, var51)) {
            class127.field2267 = arg6;
            class179.field3183 = arg7;
        }
        if (arg8) {
            return;
        }
        class247.field4297 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class247.field4301 || var47 > class247.field4301 || var51 > class247.field4301) {
            class247.field4297 = true;
        }
        if (arg0.field4910 != -1) {
            if (class196.field3505) {
                class247.method1643(var46, var48, var52, var45, var47, var51, arg0.field4919, arg0.field4909, arg0.field4917, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4910);
                return;
            }
            int var54 = class247.field4292.method64(-61, arg0.field4910);
            class247.method1633(var46, var48, var52, var45, var47, var51, class91.method622(var54, arg0.field4919), class91.method622(var54, arg0.field4909), class91.method622(var54, arg0.field4917));
        } else if (arg0.field4919 != 12345678) {
            class247.method1633(var46, var48, var52, var45, var47, var51, arg0.field4919, arg0.field4909, arg0.field4917);
            return;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1869(int arg0) {
        field4844 = null;
        field4842 = null;
        if (arg0 != 1) {
            field4844 = null;
        }
        field4847 = null;
        field4846 = null;
        field4840 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Llb;")
    public static final class178 method1870(byte arg0) {
        field4843++;
        if (arg0 != -122) {
            method1870((byte) -19);
        }
        class178 var1 = (class178) class186.field3366.method1148(3);
        if (var1 != null) {
            var1.method97(158);
            var1.method238((byte) 62);
            return var1;
        }
        class178 var2;
        do {
            var2 = (class178) class1.field13.method1148(7);
            if (var2 == null) {
                return null;
            }
            if (var2.method1161((byte) 120) > class136.method950(arg0 ^ 0xFFFFDD7C)) {
                return null;
            }
            var2.method97(arg0 + 280);
            var2.method238((byte) 89);
        } while ((var2.field727 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lgk;I)V")
    public static final void method1871(class6 arg0, int arg1) {
        field4841++;
        class6 var2 = class21.method176((byte) 58, arg0);
        if (arg1 > -9) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class26.field706;
            var4 = class50.field1053;
        } else {
            var4 = var2.field84;
            var3 = var2.field89;
        }
        class127.method845(arg0, false, var3, var4, -98);
        class70.method495(var4, var3, arg0, -26564);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4848++;
        int var11 = arg3 - arg0;
        if (arg3 < class213.field3824) {
            var11++;
        }
        int var12 = arg5 - arg10;
        if (class155.field2871 > arg5) {
            var12++;
        }
        if (arg8 != 17548) {
            field4846 = null;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var44 = arg1 * var13 + arg4 >> 16;
            int var45 = (var13 + 1) * arg1 + arg4 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg0 + var13 >> 6;
                if (var47 >= 0 && (class172.field3112.length - 1) >= var47) {
                    int var48 = arg6 + var45;
                    int var49 = arg6 + var44;
                    int[][] var50 = class172.field3112[var47];
                    byte[][] var51 = class72.field1369[var47];
                    byte[][] var52 = class166.field3007[var47];
                    byte[][] var53 = class18.field493[var47];
                    byte[][] var54 = class182.field3245[var47];
                    byte[][] var55 = class120.field2130[var47];
                    for (int var56 = 0; var56 < var12; var56++) {
                        int var57 = arg7 * var56 + arg9 >> 16;
                        int var58 = (var56 + 1) * arg7 + arg9 >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg2 + var57;
                            int var61 = arg2 + var58;
                            int var62 = arg10 + var56 >> 6;
                            int var63 = arg10 + var56 & 0x3F;
                            int var64 = arg0 + var13 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var62 < 0 || var50.length - 1 < var62 || var50[var62] == null) {
                                if (class181.field3211.field412 != -1) {
                                    var66 = class181.field3211.field412;
                                } else if ((arg0 + var13 & 0x4) == (arg10 + var56 & 0x4)) {
                                    var66 = class61.field1216[class149.field2773 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var62 < 0 || var62 > (var50.length - 1)) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class35.method295(var49, var60, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var50[var62][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var51[var62] == null ? 0 : class61.field1216[var51[var62][var65] & 0xFF];
                            int var68 = var54[var62] == null ? 0 : class61.field1216[var54[var62][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class35.method295(var49, var60, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    byte var69 = var52[var62] == null ? 0 : var52[var62][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class35.method295(var49, var60, var46, var59, var67);
                                    } else {
                                        class131.method873(var67, var60, var49, var46, var59, -9, true, var70 >> 2, var66, var69 & 0x3, class35.field822);
                                    }
                                }
                                if (var68 != 0) {
                                    byte var71 = var53[var62][var65];
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class35.method295(var49, var60, var46, var59, var68);
                                    }
                                    class131.method873(var68, var60, var49, var46, var59, arg8 - 17557, var67 == 0, var72 >> 2, 0, var71 & 0x3, class35.field822);
                                }
                            }
                            if (var55[var62] != null) {
                                int var73 = var55[var62][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var49;
                                    } else {
                                        var74 = var48 - 1;
                                    }
                                    int var75;
                                    if (var59 == 1) {
                                        var75 = var60;
                                    } else {
                                        var75 = var61 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var76 = 13369344;
                                        var73 -= 4;
                                    }
                                    if (var73 == 1) {
                                        class35.method297(var49, var60, var59, var76);
                                    } else if (var73 == 2) {
                                        class35.method283(var49, var60, var46, var76);
                                    } else if (var73 == 3) {
                                        class35.method297(var74, var60, var59, var76);
                                    } else if (var73 == 4) {
                                        class35.method283(var49, var75, var46, var76);
                                    } else if (var73 == 9) {
                                        class35.method297(var49, var60, var59, 16777215);
                                        class35.method283(var49, var60, var46, var76);
                                    } else if (var73 == 10) {
                                        class35.method297(var74, var60, var59, 16777215);
                                        class35.method283(var49, var60, var46, var76);
                                    } else if (var73 == 11) {
                                        class35.method297(var74, var60, var59, 16777215);
                                        class35.method283(var49, var75, var46, var76);
                                    } else if (var73 == 12) {
                                        class35.method297(var49, var60, var59, 16777215);
                                        class35.method283(var49, var75, var46, var76);
                                    } else if (var73 == 17) {
                                        class35.method283(var49, var60, 1, var76);
                                    } else if (var73 == 18) {
                                        class35.method283(var74, var60, 1, var76);
                                    } else if (var73 == 19) {
                                        class35.method283(var74, var75, 1, var76);
                                    } else if (var73 == 20) {
                                        class35.method283(var49, var75, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class35.method283(var49 + var77, -var77 + var75, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class35.method283(var49 + var78, var60 + var78, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg6 + var45;
                    int var80 = arg6 + var44;
                    for (int var81 = 0; var81 < var12; var81++) {
                        int var82;
                        if (class181.field3211.field412 != -1) {
                            var82 = class181.field3211.field412;
                        } else if ((var13 + arg0 & 0x4) == (arg10 + var81 & 0x4)) {
                            var82 = class61.field1216[class149.field2773 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var83 = ((var81 + 1) * arg7 + arg9 >> 16) + arg2;
                        int var84 = (arg7 * var81 + arg9 >> 16) + arg2;
                        int var85 = var83 - var84;
                        class35.method295(var80, var84, var46, var85, var82);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < (var11 + 2); var14++) {
            int var15 = arg4 + (arg1 * var14) >> 16;
            int var16 = (var14 + 1) * arg1 + arg4 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg6 + var15;
                int var19 = arg0 + var14 >> 6;
                var10000 = arg6 + var16;
                if (var19 >= 0 && var19 <= class254.field4373.length - 1) {
                    short[][] var21 = class254.field4373[var19];
                    for (int var22 = -2; var22 < var12 + 2; var22++) {
                        int var23 = arg7 * var22 + arg9 >> 16;
                        int var24 = arg9 + ((var22 + 1) * arg7) >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg2 + var24;
                            int var27 = arg2 + var23;
                            int var28 = arg10 + var22 >> 6;
                            if (var28 >= 0 && (var21.length - 1) >= var28) {
                                int var29 = ((arg10 + var22 & 0x3F) << 6) + (var14 + arg0 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29] & 0x3FFF;
                                    int var31 = (var21[var28][var29] & 0xCA3E) >> 14;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var41 = class119.field2101[var30 - 1].field2926 * var17 / 4;
                                            int var42 = class119.field2101[var30 - 1].field2929 * var25 / 4;
                                            if (var41 != 0 && var42 != 0) {
                                                int var43 = class119.field2101[var30 - 1].field2935 * var25 / 4;
                                                class119.field2101[var30 - 1].method270(var18, var27 - var43, var41, var42);
                                            }
                                        } else if (var31 == 1) {
                                            int var32 = class66.field1268[var30 - 1].field2929 * var25 / 4;
                                            int var33 = class66.field1268[var30 - 1].field2926 * var17 / 4;
                                            if (var33 != 0 && var32 != 0) {
                                                int var34 = class66.field1268[var30 - 1].field2935 * var25 / 4;
                                                class66.field1268[var30 - 1].method270(var18, var27 - var34, var33, var32);
                                            }
                                        } else if (var31 == 2) {
                                            int var38 = class237.field4142[var30 - 1].field2926 * var17 / 4;
                                            int var39 = class237.field4142[var30 - 1].field2929 * var25 / 4;
                                            if (var38 != 0 && var39 != 0) {
                                                int var40 = class237.field4142[var30 - 1].field2935 * var25 / 4;
                                                class237.field4142[var30 - 1].method270(var18, var27 - var40, var38, var39);
                                            }
                                        } else if (var31 == 3) {
                                            int var35 = class30.field752[var30 - 1].field2926 * var17 / 4;
                                            int var36 = class30.field752[var30 - 1].field2929 * var25 / 4;
                                            if (var35 != 0 && var36 != 0) {
                                                int var37 = class30.field752[var30 - 1].field2935 * var25 / 4;
                                                class30.field752[var30 - 1].method270(var18, var27 - var37, var35, var36);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([IIIIII)V")
    public static final void method1873(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class137 var6 = class200.field3577[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class278 var7 = var6.field2505;
        if (var7 != null) {
            int var8 = var7.field4921;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class266 var10 = var6.field2497;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4680;
        int var12 = var10.field4685;
        int var13 = var10.field4682;
        int var14 = var10.field4693;
        int[] var15 = class54.field1120[var11];
        int[] var16 = field4844[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}
