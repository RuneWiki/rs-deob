import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class261 implements Runnable {

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Z")
    public boolean field4507 = true;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field4506 = new Object();

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "[I")
    public int[] field4515 = new int[500];

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public int field4520 = 0;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "[I")
    public int[] field4519 = new int[500];

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lke;")
    private static class256 field4505 = class316.method2202("Checking for updates )2 ", 27626);

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Lke;")
    public static class256 field4511 = null;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "[Lke;")
    public static class256[] field4510 = new class256[500];

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "[I")
    public static int[] field4509 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Lke;")
    public static class256 field4512 = class316.method2202(" loggt sich aus)3", 27626);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Lke;")
    public static class256 field4500 = class316.method2202("ondulation:", 27626);

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Lke;")
    public static class256 field4513 = class316.method2202("null", 27626);

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lke;")
    public static class256 field4503 = field4505;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 8)
    public static void method1829(int arg0) {
        field4509 = null;
        field4503 = null;
        field4513 = null;
        field4512 = null;
        field4510 = null;
        field4500 = null;
        if (arg0 != 13421772) {
            field4512 = (class256) null;
        }
        field4511 = null;
        field4505 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIIIIB)V", line = 26)
    public static final void method1830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        if (arg10 >= -53) {
            field4512 = (class256) null;
        }
        field4508++;
        int var11 = arg6 - arg9;
        int var12 = arg2 - arg1;
        if (class154.field2753 > arg6) {
            var11++;
        }
        if (arg2 < class40.field731) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg8 * var13 + arg0 >> 16;
            int var15 = (var13 + 1) * arg8 + arg0 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = var13 + arg1 >> 6;
                if (var17 >= 0 && class254.field4354.length - 1 >= var17) {
                    int var18 = arg5 + var14;
                    int var19 = arg5 + var15;
                    byte[][] var20 = class196.field3591[var17];
                    int[][] var21 = class254.field4354[var17];
                    byte[][] var22 = class37.field651[var17];
                    byte[][] var23 = class126.field2242[var17];
                    byte[][] var24 = class185.field3260[var17];
                    byte[][] var25 = class313.field5396[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = arg3 + (arg4 * var26) >> 16;
                        int var28 = arg3 + ((var26 + 1) * arg4) >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg7 + var28;
                            int var31 = arg7 + var27;
                            int var32 = arg9 + var26 >> 6;
                            int var33 = arg9 + var26 & 0x3F;
                            int var34 = arg1 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || var32 > var21.length - 1 || var21[var32] == null) {
                                if (class231.field3950.field497 != -1) {
                                    var36 = class231.field3950.field497;
                                } else if ((arg1 + var13 & 0x4) == (arg9 + var26 & 0x4)) {
                                    var36 = class163.field2898[class181.field3196 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || (var21.length - 1) < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class178.method1299(var18, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var21[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var20[var32] == null ? 0 : class163.field2898[var20[var32][var35] & 0xFF];
                            int var38 = var23[var32] == null ? 0 : class163.field2898[var23[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class178.method1299(var18, var31, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var32] == null ? 0 : var22[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class178.method1299(var18, var31, var16, var29, var37);
                                    } else {
                                        class107.method759(var40 >> 2, class178.field3146, var29, var39 & 0x3, -1, var36, var18, var16, var31, true, var37);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class178.method1299(var18, var31, var16, var29, var38);
                                    }
                                    class107.method759(var42 >> 2, class178.field3146, var29, var41 & 0x3, -1, 0, var18, var16, var31, var37 == 0, var38);
                                }
                            }
                            if (var25[var32] != null) {
                                int var43 = var25[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var19 - 1;
                                    }
                                    int var45 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var45 = 13369344;
                                        var43 -= 4;
                                    }
                                    int var46;
                                    if (var29 == 1) {
                                        var46 = var31;
                                    } else {
                                        var46 = var30 - 1;
                                    }
                                    if (var43 == 1) {
                                        class178.method1294(var18, var31, var29, var45);
                                    } else if (var43 == 2) {
                                        class178.method1300(var18, var31, var16, var45);
                                    } else if (var43 == 3) {
                                        class178.method1294(var44, var31, var29, var45);
                                    } else if (var43 == 4) {
                                        class178.method1300(var18, var46, var16, var45);
                                    } else if (var43 == 9) {
                                        class178.method1294(var18, var31, var29, 16777215);
                                        class178.method1300(var18, var31, var16, var45);
                                    } else if (var43 == 10) {
                                        class178.method1294(var44, var31, var29, 16777215);
                                        class178.method1300(var18, var31, var16, var45);
                                    } else if (var43 == 11) {
                                        class178.method1294(var44, var31, var29, 16777215);
                                        class178.method1300(var18, var46, var16, var45);
                                    } else if (var43 == 12) {
                                        class178.method1294(var18, var31, var29, 16777215);
                                        class178.method1300(var18, var46, var16, var45);
                                    } else if (var43 == 17) {
                                        class178.method1300(var18, var31, 1, var45);
                                    } else if (var43 == 18) {
                                        class178.method1300(var44, var31, 1, var45);
                                    } else if (var43 == 19) {
                                        class178.method1300(var44, var46, 1, var45);
                                    } else if (var43 == 20) {
                                        class178.method1300(var18, var46, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class178.method1300(var18 + var48, -var48 + var46, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class178.method1300(var18 + var47, var31 + var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg5 + var14;
                    for (int var50 = 0; var50 < var11; var50++) {
                        int var51;
                        if (class231.field3950.field497 != -1) {
                            var51 = class231.field3950.field497;
                        } else if ((var13 + arg1 & 0x4) == (arg9 + var50 & 0x4)) {
                            var51 = class163.field2898[class181.field3196 + 1];
                        } else {
                            var51 = 4936552;
                        }
                        if (var51 == 0) {
                            var51 = 1;
                        }
                        int var52 = (arg4 * var50 + arg3 >> 16) + arg7;
                        int var53 = (arg3 + ((var50 + 1) * arg4) >> 16) + arg7;
                        int var54 = var53 - var52;
                        class178.method1299(var49, var52, var16, var54, var51);
                    }
                    var10000 = arg5 + var15;
                }
            }
        }
        for (int var56 = -2; var56 < (var12 + 2); var56++) {
            int var57 = arg0 + (arg8 * var56) >> 16;
            int var58 = (var56 + 1) * arg8 + arg0 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg5 + var57;
                var10000 = arg5 + var58;
                int var62 = var56 + arg1 >> 6;
                if (var62 >= 0 && class80.field1492.length - 1 >= var62) {
                    short[][] var63 = class80.field1492[var62];
                    for (int var64 = -2; var64 < (var11 + 2); var64++) {
                        int var65 = (var64 + 1) * arg4 + arg3 >> 16;
                        int var66 = arg4 * var64 + arg3 >> 16;
                        int var67 = var65 - var66;
                        if (var67 > 0) {
                            var10000 = arg7 + var65;
                            int var69 = arg7 + var66;
                            int var70 = arg9 + var64 >> 6;
                            if (var70 >= 0 && var70 <= (var63.length - 1)) {
                                int var71 = (arg9 + var64 & 0x3F << 6) + (arg1 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71] & 0x3FFF;
                                    int var73 = var63[var70][var71] >> 14 & 0x3;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var83 = class86.field1551[var72 - 1].field5018 * var59 / 4;
                                            int var84 = class86.field1551[var72 - 1].field5008 * var67 / 4;
                                            if (var83 != 0 && var84 != 0) {
                                                int var85 = class86.field1551[var72 - 1].field5009 * var67 / 4;
                                                class86.field1551[var72 - 1].method1571(var60, var69 - var85, var83, var84);
                                            }
                                        } else if (var73 == 1) {
                                            int var74 = class236.field4027[var72 - 1].field5018 * var59 / 4;
                                            int var75 = class236.field4027[var72 - 1].field5008 * var67 / 4;
                                            if (var74 != 0 && var75 != 0) {
                                                int var76 = class236.field4027[var72 - 1].field5009 * var67 / 4;
                                                class236.field4027[var72 - 1].method1571(var60, var69 - var76, var74, var75);
                                            }
                                        } else if (var73 == 2) {
                                            int var80 = class118.field2077[var72 - 1].field5018 * var59 / 4;
                                            int var81 = class118.field2077[var72 - 1].field5008 * var67 / 4;
                                            if (var80 != 0 && var81 != 0) {
                                                int var82 = class118.field2077[var72 - 1].field5009 * var67 / 4;
                                                class118.field2077[var72 - 1].method1571(var60, var69 - var82, var80, var81);
                                            }
                                        } else if (var73 == 3) {
                                            int var77 = class164.field2907[var72 - 1].field5018 * var59 / 4;
                                            int var78 = class164.field2907[var72 - 1].field5008 * var67 / 4;
                                            if (var77 != 0 && var78 != 0) {
                                                int var79 = class164.field2907[var72 - 1].field5009 * var67 / 4;
                                                class164.field2907[var72 - 1].method1571(var60, var69 - var79, var77, var78);
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

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V", line = 466)
    public static final void method1831(int arg0, int arg1) {
        class59.field1071.method2075(arg1, 1);
        field4518++;
        class80.field1487.method2075(arg1, 1);
        if (arg0 < 46) {
            method1833(76, 1, 53, -74, -22);
        }
    }

    @OriginalMember(owner = "client!lj", name = "run", descriptor = "()V", line = 479)
    public final void run() {
        field4502++;
        while (this.field4507) {
            Object var1 = this.field4506;
            synchronized (this.field4506) {
                if (this.field4520 < 500) {
                    this.field4519[this.field4520] = class286.field4963;
                    this.field4515[this.field4520] = class208.field3762;
                    this.field4520++;
                }
            }
            class46.method381(50L, 73);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIZII)V", line = 513)
    public static final void method1832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (arg4 == arg6 && arg0 == arg3 && arg8 == arg9 && arg1 == arg2) {
            class318.method2213(arg5, arg8, arg3, (byte) 82, arg6, arg1);
        } else {
            int var10 = arg6;
            int var11 = arg3;
            int var12 = arg3 * 3;
            int var13 = arg4 * 3;
            int var14 = arg0 * 3;
            int var15 = arg6 * 3;
            int var16 = arg9 * 3;
            int var17 = arg2 * 3;
            int var18 = arg1 + var14 - var17 - arg3;
            int var19 = arg8 - (var16 - var13) - arg6;
            int var20 = var16 + var15 - var13 - var13;
            int var21 = var13 - var15;
            int var22 = var17 + var12 - (var14 + var14);
            int var23 = var14 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var23 * var24;
                int var31 = var21 * var24;
                int var32 = arg6 + (var29 + var31 + var28 >> 12);
                int var33 = var22 * var25;
                int var34 = (var27 + var33 + var30 >> 12) + arg3;
                class318.method2213(arg5, var32, var11, (byte) -119, var10, var34);
                var10 = var32;
                var11 = var34;
            }
        }
        field4501++;
        if (arg7) {
            field4512 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)I", line = 599)
    public static final int method1833(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 91 / ((-arg4 - 58) / 60);
        field4517++;
        int var6 = 65536 - class136.field2372[arg3 * 1024 / arg0] >> 1;
        return ((65536 - var6) * arg1 >> 16) + (arg2 * var6 >> 16);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZII)V", line = 625)
    public static final void method1834(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        int var5 = 0;
        int var6 = -1;
        field4514++;
        int var7 = class101.method731(class175.field3106, arg0 + arg1, class244.field4161, true);
        int var8 = -arg1;
        int var9 = arg1;
        int var10 = class101.method731(class175.field3106, arg0 - arg1, class244.field4161, arg2);
        class73.method550(-29903, class308.field5329[arg4], var7, var10, arg3);
        while (var9 > var5) {
            var6 += 2;
            var8 += var6;
            if (var8 > 0) {
                var9--;
                var8 -= var9 << 1;
                int var11 = arg4 + var9;
                int var12 = arg4 - var9;
                if (class105.field1887 <= var11 && var12 <= class274.field4748) {
                    int var13 = class101.method731(class175.field3106, arg0 + var5, class244.field4161, arg2);
                    int var14 = class101.method731(class175.field3106, arg0 - var5, class244.field4161, true);
                    if (class274.field4748 >= var11) {
                        class73.method550(-29903, class308.field5329[var11], var13, var14, arg3);
                    }
                    if (class105.field1887 <= var12) {
                        class73.method550(-29903, class308.field5329[var12], var13, var14, arg3);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class105.field1887 && var15 <= class274.field4748) {
                int var17 = class101.method731(class175.field3106, arg0 + var9, class244.field4161, true);
                int var18 = class101.method731(class175.field3106, arg0 - var9, class244.field4161, arg2);
                if (class274.field4748 >= var16) {
                    class73.method550(-29903, class308.field5329[var16], var17, var18, arg3);
                }
                if (class105.field1887 <= var15) {
                    class73.method550(-29903, class308.field5329[var15], var17, var18, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)I", line = 701)
    public static final int method1835(boolean arg0, int arg1) {
        field4516++;
        return arg0 ? arg1 >>> 8 : 31;
    }
}
