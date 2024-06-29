import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class181 extends class303 {

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    private int field2901 = 6;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "[I")
    public static int[] field2900 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field2894 = 0;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "[I")
    public static int[] field2902 = new int[14];

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "Lik;")
    public static class259 field2897 = new class259(64);

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "Z")
    public static boolean field2903;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)[Lai;", line = 6)
    public static final class126[] method1346(int arg0) {
        field2899++;
        class126[] var1 = new class126[class103.field1744];
        for (int var2 = 0; var2 < class103.field1744; var2++) {
            int var3 = class3.field14[var2] * class108.field1797[var2];
            byte[] var4 = class270.field4198[var2];
            if (class33.field548[var2]) {
                byte[] var5 = class24.field408[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class94.method673(class251.field3871[class280.method2001(255, var4[var7])], class280.method2001(255, var5[var7]) << 24);
                }
                if (class265.field4126) {
                    var1[var2] = new class1(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], var6);
                } else {
                    var1[var2] = new class66(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], var6);
                }
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class251.field3871[class280.method2001(var4[var9], 255)];
                }
                if (class265.field4126) {
                    var1[var2] = new class105(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], var8);
                } else {
                    var1[var2] = new class7(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], var8);
                }
            }
        }
        if (arg0 != -24241) {
            field2891 = -8;
        }
        class233.method1680((byte) -12);
        return var1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILpe;I)V", line = 76)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            return;
        }
        if (arg2 == 0) {
            this.field2901 = arg1.method741(arg0 + 4127);
        } else if (arg2 == 1) {
            this.field4773 = arg1.method741(72) == 1;
        }
        field2895++;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 111)
    public class181() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[[I", line = 116)
    public final int[][] method74(int arg0, int arg1) {
        field2896++;
        if (arg1 != 82) {
            method1348(-30, true, -11, 98);
        }
        int[][] var3 = this.field4772.method1175(-113, arg0);
        if (this.field4772.field2488) {
            int[][] var4 = this.method2106(arg0, 0, 38);
            int[][] var5 = this.method2106(arg0, 1, arg1 + 19);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            int[] var11 = var5[0];
            int[] var12 = var4[1];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field2901;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class70.field1108; var63++) {
                    var7[var63] = var8[var63] + var11[var63];
                    var6[var63] = var12[var63] + var14[var63];
                    var9[var63] = var10[var63] + var13[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class70.field1108; var62++) {
                    var7[var62] = var8[var62] - var11[var62];
                    var6[var62] = var12[var62] - var14[var62];
                    var9[var62] = var10[var62] - var13[var62];
                }
            } else if (var15 == 3) {
                for (int var16 = 0; var16 < class70.field1108; var16++) {
                    var7[var16] = var8[var16] * var11[var16] >> 12;
                    var6[var16] = var12[var16] * var14[var16] >> 12;
                    var9[var16] = var10[var16] * var13[var16] >> 12;
                }
            } else if (var15 == 4) {
                for (int var17 = 0; var17 < class70.field1108; var17++) {
                    int var18 = var14[var17];
                    int var19 = var13[var17];
                    int var20 = var11[var17];
                    var7[var17] = var20 == 0 ? 4096 : (var8[var17] << 12) / var20;
                    var6[var17] = var18 == 0 ? 4096 : (var12[var17] << 12) / var18;
                    var9[var17] = var19 == 0 ? 4096 : (var10[var17] << 12) / var19;
                }
            } else if (var15 == 5) {
                for (int var61 = 0; var61 < class70.field1108; var61++) {
                    var7[var61] = 4096 - ((4096 - var8[var61]) * (4096 - var11[var61]) >> 12);
                    var6[var61] = 4096 - ((4096 - var12[var61]) * (4096 - var14[var61]) >> 12);
                    var9[var61] = 4096 - ((4096 - var10[var61]) * (4096 - var13[var61]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var21 = 0; var21 < class70.field1108; var21++) {
                    int var22 = var14[var21];
                    int var23 = var11[var21];
                    int var24 = var13[var21];
                    var7[var21] = var23 >= 2048 ? 4096 - ((4096 - var23) * (4096 - var8[var21]) >> 11) : var8[var21] * var23 >> 11;
                    var6[var21] = var22 >= 2048 ? 4096 - ((4096 - var12[var21]) * (4096 - var22) >> 11) : var12[var21] * var22 >> 11;
                    var9[var21] = var24 >= 2048 ? 4096 - ((4096 - var10[var21]) * (4096 - var24) >> 11) : var10[var21] * var24 >> 11;
                }
            } else if (var15 == 7) {
                for (int var25 = 0; var25 < class70.field1108; var25++) {
                    int var26 = var8[var25];
                    int var27 = var12[var25];
                    int var28 = var10[var25];
                    var7[var25] = var26 == 4096 ? 4096 : (var11[var25] << 12) / (4096 - var26);
                    var6[var25] = var27 == 4096 ? 4096 : (var14[var25] << 12) / (4096 - var27);
                    var9[var25] = var28 == 4096 ? 4096 : (var13[var25] << 12) / (4096 - var28);
                }
            } else if (var15 == 8) {
                for (int var29 = 0; var29 < class70.field1108; var29++) {
                    int var30 = var8[var29];
                    int var31 = var10[var29];
                    int var32 = var12[var29];
                    var7[var29] = var30 == 0 ? 0 : 4096 - ((4096 - var11[var29] << 12) / var30);
                    var6[var29] = var32 == 0 ? 0 : 4096 - ((4096 - var14[var29] << 12) / var32);
                    var9[var29] = var31 == 0 ? 0 : 4096 - ((4096 - var13[var29] << 12) / var31);
                }
            } else if (var15 == 9) {
                for (int var33 = 0; var33 < class70.field1108; var33++) {
                    int var34 = var14[var33];
                    int var35 = var12[var33];
                    int var36 = var8[var33];
                    int var37 = var11[var33];
                    int var38 = var10[var33];
                    int var39 = var13[var33];
                    var7[var33] = var36 >= var37 ? var37 : var36;
                    var6[var33] = var34 <= var35 ? var34 : var35;
                    var9[var33] = var38 >= var39 ? var39 : var38;
                }
            } else if (var15 == 10) {
                for (int var40 = 0; var40 < class70.field1108; var40++) {
                    int var41 = var13[var40];
                    int var42 = var14[var40];
                    int var43 = var8[var40];
                    int var44 = var11[var40];
                    int var45 = var10[var40];
                    int var46 = var12[var40];
                    var7[var40] = var43 > var44 ? var43 : var44;
                    var6[var40] = var46 <= var42 ? var42 : var46;
                    var9[var40] = var41 >= var45 ? var41 : var45;
                }
            } else if (var15 == 11) {
                for (int var47 = 0; var47 < class70.field1108; var47++) {
                    int var48 = var14[var47];
                    int var49 = var11[var47];
                    int var50 = var10[var47];
                    int var51 = var13[var47];
                    int var52 = var8[var47];
                    int var53 = var12[var47];
                    var7[var47] = var49 >= var52 ? var49 - var52 : -var49 + var52;
                    var6[var47] = var48 >= var53 ? var48 - var53 : -var48 + var53;
                    var9[var47] = var50 <= var51 ? var51 - var50 : -var51 + var50;
                }
            } else if (var15 == 12) {
                for (int var54 = 0; var54 < class70.field1108; var54++) {
                    int var55 = var14[var54];
                    int var56 = var8[var54];
                    int var57 = var12[var54];
                    int var58 = var11[var54];
                    int var59 = var10[var54];
                    int var60 = var13[var54];
                    var7[var54] = var56 + var58 - (var56 * var58 >> 11);
                    var6[var54] = var55 + var57 - (var55 * var57 >> 11);
                    var9[var54] = var59 + var60 - (var59 * var60 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIZIIIZILsj;I)V", line = 430)
    public static final void method1347(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, class56 arg9, int arg10) {
        field2898++;
        if (arg7 && !class34.method248(-117) && (class250.field3857[0][arg8][arg10] & 0x2) == 0) {
            if ((class250.field3857[arg6][arg8][arg10] & 0x10) != 0) {
                return;
            }
            if (class189.method1407(true, arg8, arg6, arg10) != class273.field4247) {
                return;
            }
        }
        if (class92.field1522 > arg6) {
            class92.field1522 = arg6;
        }
        class6 var11 = class28.method190(98, arg4);
        if (class265.field4126 && var11.field115) {
            return;
        }
        int[][] var12 = class29.field475[arg0];
        int var13 = -98 % ((arg1 - 16) / 33);
        int var14;
        int var15;
        if (arg2 == 1 || arg2 == 3) {
            var15 = var11.field63;
            var14 = var11.field90;
        } else {
            var14 = var11.field63;
            var15 = var11.field90;
        }
        int var16;
        int var17;
        if ((arg10 + var15) > 104) {
            var16 = arg10;
            var17 = arg10 + 1;
        } else {
            var17 = (var15 + 1 >> 1) + arg10;
            var16 = (var15 >> 1) + arg10;
        }
        int var18 = (arg8 << 7) + (var14 << 6);
        int var19 = (arg10 << 7) + (var15 << 6);
        int var20;
        int var21;
        if ((arg8 + var14) > 104) {
            var20 = arg8;
            var21 = arg8 + 1;
        } else {
            var20 = (var14 >> 1) + arg8;
            var21 = arg8 + (var14 + 1 >> 1);
        }
        int var22 = var12[var20][var16] + var12[var20][var17] - (-var12[var21][var16] - var12[var21][var17]) >> 2;
        int var23 = 0;
        if (class265.field4126 && arg0 != 0) {
            int[][] var24 = class29.field475[0];
            var23 = var22 - (var24[var20][var16] + var24[var21][var16] - (-var24[var20][var17] - var24[var21][var17]) >> 2);
        }
        int[][] var25 = (int[][]) null;
        if (arg3) {
            var25 = class298.field4701[0];
        } else if (arg0 < 3) {
            var25 = class29.field475[arg0 + 1];
        }
        long var26 = (long) (arg2 << 20 | arg5 << 14 | arg8 | arg10 << 7 | 0x40000000);
        if (var11.field59 == 0 || arg3) {
            var26 |= Long.MIN_VALUE;
        }
        if (var11.field82 == 1) {
            var26 |= 0x400000L;
        }
        if (var11.field36) {
            var26 |= 0x80000000L;
        }
        long var28 = var26 | (long) arg4 << 32;
        if (var11.method35(88)) {
            class272.method1962((byte) -125, arg10, arg2, (class305) null, var11, (class30) null, arg6, arg8);
        }
        boolean var30 = !arg3 & var11.field51;
        if (arg5 == 22) {
            if (class289.field4406 || var11.field59 != 0 || var11.field86 == 1 || var11.field60) {
                class320 var32;
                if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                    class293 var31 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2, var25, var18, var19, 22, var12);
                    if (class265.field4126 && var30) {
                        class69.method523(var31.field4615, var18, var23, var19);
                    }
                    var32 = var31.field4619;
                } else {
                    var32 = new class258(arg4, 22, arg2, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
                }
                class48.method376(arg6, arg8, arg10, var22, var32, var28, var11.field38);
                if (var11.field86 == 1 && arg9 != null) {
                    arg9.method426(arg8, -109, arg10);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class320 var74;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var73 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg5 == 11 ? arg2 + 4 : arg2, var25, var18, var19, 10, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var73.field4615, var18, var23, var19);
                }
                var74 = var73.field4619;
            } else {
                var74 = new class258(arg4, 10, arg5 == 11 ? arg2 + 4 : arg2, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            if (var74 != null) {
                boolean var75 = class143.method1090(arg6, arg8, arg10, var22, var14, var15, var74, 0, var28);
                if (var11.field47 && var75 && arg7) {
                    int var76 = 15;
                    if (var74 instanceof class199) {
                        var76 = ((class199) var74).method1122() / 4;
                        if (var76 > 30) {
                            var76 = 30;
                        }
                    }
                    for (int var77 = 0; var77 <= var14; var77++) {
                        for (int var78 = 0; var78 <= var15; var78++) {
                            if (class295.field4667[arg6][arg8 + var77][arg10 + var78] < var76) {
                                class295.field4667[arg6][arg8 + var77][arg10 + var78] = (byte) var76;
                            }
                        }
                    }
                }
            }
            if (var11.field86 != 0 && arg9 != null) {
                arg9.method412((byte) -81, var15, arg10, arg8, var11.field105, var14);
            }
        } else if (arg5 >= 12) {
            class320 var72;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var71 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2, var25, var18, var19, arg5, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var71.field4615, var18, var23, var19);
                }
                var72 = var71.field4619;
            } else {
                var72 = new class258(arg4, arg5, arg2, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class143.method1090(arg6, arg8, arg10, var22, 1, 1, var72, 0, var28);
            if (arg7 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0) {
                class151.field2426[arg6][arg8][arg10] = class94.method673(class151.field2426[arg6][arg8][arg10], 4);
            }
            if (var11.field86 != 0 && arg9 != null) {
                arg9.method412((byte) -81, var15, arg10, arg8, var11.field105, var14);
            }
        } else if (arg5 == 0) {
            class320 var70;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var69 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2, var25, var18, var19, 0, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var69.field4615, var18, var23, var19);
                }
                var70 = var69.field4619;
            } else {
                var70 = new class258(arg4, 0, arg2, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class291.method2039(arg6, arg8, arg10, var22, var70, (class320) null, class323.field5020[arg2], 0, var28);
            if (arg7) {
                if (arg2 == 0) {
                    if (var11.field47) {
                        class295.field4667[arg6][arg8][arg10] = 50;
                        class295.field4667[arg6][arg8][arg10 + 1] = 50;
                    }
                    if (var11.field91) {
                        class151.field2426[arg6][arg8][arg10] = class94.method673(class151.field2426[arg6][arg8][arg10], 1);
                    }
                } else if (arg2 == 1) {
                    if (var11.field47) {
                        class295.field4667[arg6][arg8][arg10 + 1] = 50;
                        class295.field4667[arg6][arg8 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field91) {
                        class151.field2426[arg6][arg8][arg10 + 1] = class94.method673(class151.field2426[arg6][arg8][arg10 + 1], 2);
                    }
                } else if (arg2 == 2) {
                    if (var11.field47) {
                        class295.field4667[arg6][arg8 + 1][arg10] = 50;
                        class295.field4667[arg6][arg8 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field91) {
                        class151.field2426[arg6][arg8 + 1][arg10] = class94.method673(class151.field2426[arg6][arg8 + 1][arg10], 1);
                    }
                } else if (arg2 == 3) {
                    if (var11.field47) {
                        class295.field4667[arg6][arg8][arg10] = 50;
                        class295.field4667[arg6][arg8 + 1][arg10] = 50;
                    }
                    if (var11.field91) {
                        class151.field2426[arg6][arg8][arg10] = class94.method673(class151.field2426[arg6][arg8][arg10], 2);
                    }
                }
            }
            if (var11.field86 != 0 && arg9 != null) {
                arg9.method427(arg8, var11.field105, arg10, -125, arg5, arg2);
            }
            if (var11.field96 != 16) {
                class280.method2002(arg6, arg8, arg10, var11.field96);
            }
        } else if (arg5 == 1) {
            class320 var68;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var67 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2, var25, var18, var19, 1, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var67.field4615, var18, var23, var19);
                }
                var68 = var67.field4619;
            } else {
                var68 = new class258(arg4, 1, arg2, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class291.method2039(arg6, arg8, arg10, var22, var68, (class320) null, class71.field1116[arg2], 0, var28);
            if (var11.field47 && arg7) {
                if (arg2 == 0) {
                    class295.field4667[arg6][arg8][arg10 + 1] = 50;
                } else if (arg2 == 1) {
                    class295.field4667[arg6][arg8 + 1][arg10 + 1] = 50;
                } else if (arg2 == 2) {
                    class295.field4667[arg6][arg8 + 1][arg10] = 50;
                } else if (arg2 == 3) {
                    class295.field4667[arg6][arg8][arg10] = 50;
                }
            }
            if (var11.field86 != 0 && arg9 != null) {
                arg9.method427(arg8, var11.field105, arg10, -115, arg5, arg2);
            }
        } else if (arg5 == 2) {
            int var33 = arg2 + 1 & 0x3;
            class320 var35;
            class320 var37;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var34 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2 + 4, var25, var18, var19, 2, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var34.field4615, var18, var23, var19);
                }
                var35 = var34.field4619;
                class293 var36 = var11.method27(var22, arg7, var30, 20558, (class315) null, var33, var25, var18, var19, 2, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var36.field4615, var18, var23, var19);
                }
                var37 = var36.field4619;
            } else {
                var35 = new class258(arg4, 2, arg2 + 4, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
                var37 = new class258(arg4, 2, var33, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class291.method2039(arg6, arg8, arg10, var22, var35, var37, class323.field5020[arg2], class323.field5020[var33], var28);
            if (var11.field91 && arg7) {
                if (arg2 == 0) {
                    class151.field2426[arg6][arg8][arg10] = class94.method673(class151.field2426[arg6][arg8][arg10], 1);
                    class151.field2426[arg6][arg8][arg10 + 1] = class94.method673(class151.field2426[arg6][arg8][arg10 + 1], 2);
                } else if (arg2 == 1) {
                    class151.field2426[arg6][arg8][arg10 + 1] = class94.method673(class151.field2426[arg6][arg8][arg10 + 1], 2);
                    class151.field2426[arg6][arg8 + 1][arg10] = class94.method673(class151.field2426[arg6][arg8 + 1][arg10], 1);
                } else if (arg2 == 2) {
                    class151.field2426[arg6][arg8 + 1][arg10] = class94.method673(class151.field2426[arg6][arg8 + 1][arg10], 1);
                    class151.field2426[arg6][arg8][arg10] = class94.method673(class151.field2426[arg6][arg8][arg10], 2);
                } else if (arg2 == 3) {
                    class151.field2426[arg6][arg8][arg10] = class94.method673(class151.field2426[arg6][arg8][arg10], 2);
                    class151.field2426[arg6][arg8][arg10] = class94.method673(class151.field2426[arg6][arg8][arg10], 1);
                }
            }
            if (var11.field86 != 0 && arg9 != null) {
                arg9.method427(arg8, var11.field105, arg10, -120, arg5, arg2);
            }
            if (var11.field96 != 16) {
                class280.method2002(arg6, arg8, arg10, var11.field96);
            }
        } else if (arg5 == 3) {
            class320 var66;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var65 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2, var25, var18, var19, 3, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var65.field4615, var18, var23, var19);
                }
                var66 = var65.field4619;
            } else {
                var66 = new class258(arg4, 3, arg2, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class291.method2039(arg6, arg8, arg10, var22, var66, (class320) null, class71.field1116[arg2], 0, var28);
            if (var11.field47 && arg7) {
                if (arg2 == 0) {
                    class295.field4667[arg6][arg8][arg10 + 1] = 50;
                } else if (arg2 == 1) {
                    class295.field4667[arg6][arg8 + 1][arg10 + 1] = 50;
                } else if (arg2 == 2) {
                    class295.field4667[arg6][arg8 + 1][arg10] = 50;
                } else if (arg2 == 3) {
                    class295.field4667[arg6][arg8][arg10] = 50;
                }
            }
            if (var11.field86 != 0 && arg9 != null) {
                arg9.method427(arg8, var11.field105, arg10, -110, arg5, arg2);
            }
        } else if (arg5 == 9) {
            class320 var39;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var38 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2, var25, var18, var19, arg5, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var38.field4615, var18, var23, var19);
                }
                var39 = var38.field4619;
            } else {
                var39 = new class258(arg4, arg5, arg2, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class143.method1090(arg6, arg8, arg10, var22, 1, 1, var39, 0, var28);
            if (var11.field86 != 0 && arg9 != null) {
                arg9.method412((byte) -81, var15, arg10, arg8, var11.field105, var14);
            }
            if (var11.field96 != 16) {
                class280.method2002(arg6, arg8, arg10, var11.field96);
            }
        } else if (arg5 == 4) {
            class320 var64;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var63 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2, var25, var18, var19, 4, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var63.field4615, var18, var23, var19);
                }
                var64 = var63.field4619;
            } else {
                var64 = new class258(arg4, 4, arg2, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class198.method1441(arg6, arg8, arg10, var22, var64, (class320) null, class323.field5020[arg2], 0, 0, 0, var28);
        } else if (arg5 == 5) {
            long var58 = class70.method540(arg6, arg8, arg10);
            int var60 = 16;
            if (var58 != 0L) {
                var60 = class28.method190(6, Integer.MAX_VALUE & (int) (var58 >>> 32)).field96;
            }
            class320 var62;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var61 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2, var25, var18, var19, 4, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var61.field4615, var18 - (class99.field1639[arg2] * 8), var23, var19 - (class292.field4558[arg2] * 8));
                }
                var62 = var61.field4619;
            } else {
                var62 = new class258(arg4, 4, arg2, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class198.method1441(arg6, arg8, arg10, var22, var62, (class320) null, class323.field5020[arg2], 0, class99.field1639[arg2] * var60, class292.field4558[arg2] * var60, var28);
        } else if (arg5 == 6) {
            int var53 = 8;
            long var54 = class70.method540(arg6, arg8, arg10);
            if (var54 != 0L) {
                var53 = class28.method190(-128, (int) (var54 >>> 32) & Integer.MAX_VALUE).field96 / 2;
            }
            class320 var57;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var56 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2 + 4, var25, var18, var19, 4, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var56.field4615, var18 - (class65.field1066[arg2] * 8), var23, var19 - (class260.field4040[arg2] * 8));
                }
                var57 = var56.field4619;
            } else {
                var57 = new class258(arg4, 4, arg2 + 4, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class198.method1441(arg6, arg8, arg10, var22, var57, (class320) null, 256, arg2, class65.field1066[arg2] * var53, class260.field4040[arg2] * var53, var28);
        } else if (arg5 == 7) {
            int var50 = arg2 + 2 & 0x3;
            class320 var52;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                class293 var51 = var11.method27(var22, arg7, var30, 20558, (class315) null, var50 + 4, var25, var18, var19, 4, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var51.field4615, var18, var23, var19);
                }
                var52 = var51.field4619;
            } else {
                var52 = new class258(arg4, 4, var50 + 4, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class198.method1441(arg6, arg8, arg10, var22, var52, (class320) null, 256, var50, 0, 0, var28);
        } else if (arg5 == 8) {
            int var40 = 8;
            long var41 = class70.method540(arg6, arg8, arg10);
            int var43 = arg2 + 2 & 0x3;
            if (var41 != 0L) {
                var40 = class28.method190(-110, Integer.MAX_VALUE & (int) (var41 >>> 32)).field96 / 2;
            }
            class320 var47;
            class320 var49;
            if (var11.field52 == -1 && var11.field56 == null && !var11.field69) {
                int var44 = class65.field1066[arg2] * 8;
                int var45 = class260.field4040[arg2] * 8;
                class293 var46 = var11.method27(var22, arg7, var30, 20558, (class315) null, arg2 + 4, var25, var18, var19, 4, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var46.field4615, var18 - var44, var23, var19 - var45);
                }
                var47 = var46.field4619;
                class293 var48 = var11.method27(var22, arg7, var30, 20558, (class315) null, var43 + 4, var25, var18, var19, 4, var12);
                if (class265.field4126 && var30) {
                    class69.method523(var48.field4615, var18 - var44, var23, var19 - var45);
                }
                var49 = var48.field4619;
            } else {
                var47 = new class258(arg4, 4, arg2 + 4, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
                var49 = new class258(arg4, 4, var43 + 4, arg0, arg8, arg10, var11.field52, var11.field54, (class320) null);
            }
            class198.method1441(arg6, arg8, arg10, var22, var47, var49, 256, arg2, class65.field1066[arg2] * var40, class260.field4040[arg2] * var40, var28);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)[I", line = 1092)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            field2897 = (class259) null;
        }
        field2904++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int[] var4 = this.method2107(arg1, 0, 0);
            int[] var5 = this.method2107(arg1, 0, 1);
            int var6 = this.field2901;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class70.field1108; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class70.field1108; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class70.field1108; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var8 = 0; var8 < class70.field1108; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 == 0 ? 4096 : (var4[var8] << 12) / var9;
                }
            } else if (var6 == 5) {
                for (int var28 = 0; var28 < class70.field1108; var28++) {
                    var3[var28] = 4096 - ((4096 - var4[var28]) * (4096 - var5[var28]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var26 = 0; var26 < class70.field1108; var26++) {
                    int var27 = var5[var26];
                    var3[var26] = var27 < 2048 ? var4[var26] * var27 >> 11 : 4096 - ((4096 - var4[var26]) * (4096 - var27) >> 11);
                }
            } else if (var6 == 7) {
                for (int var10 = 0; var10 < class70.field1108; var10++) {
                    int var11 = var4[var10];
                    var3[var10] = var11 == 4096 ? 4096 : (var5[var10] << 12) / (4096 - var11);
                }
            } else if (var6 == 8) {
                for (int var24 = 0; var24 < class70.field1108; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 0 ? 0 : 4096 - ((4096 - var5[var24] << 12) / var25);
                }
            } else if (var6 == 9) {
                for (int var21 = 0; var21 < class70.field1108; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var22 > var23 ? var23 : var22;
                }
            } else if (var6 == 10) {
                for (int var12 = 0; var12 < class70.field1108; var12++) {
                    int var13 = var4[var12];
                    int var14 = var5[var12];
                    var3[var12] = var14 >= var13 ? var14 : var13;
                }
            } else if (var6 == 11) {
                for (int var18 = 0; var18 < class70.field1108; var18++) {
                    int var19 = var4[var18];
                    int var20 = var5[var18];
                    var3[var18] = var20 >= var19 ? var20 - var19 : -var20 + var19;
                }
            } else if (var6 == 12) {
                for (int var15 = 0; var15 < class70.field1108; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var17 + var16 - (var16 * var17 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZII)V", line = 1342)
    public static final void method1348(int arg0, boolean arg1, int arg2, int arg3) {
        field2893++;
        if (!arg1) {
            class4 var4 = class67.method510(1, 9, arg3);
            var4.method14(24710);
            var4.field20 = arg0;
            var4.field15 = arg2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V", line = 1357)
    public static void method1349(int arg0) {
        field2902 = null;
        field2897 = null;
        field2900 = null;
        if (arg0 <= 44) {
            method1349(-113);
        }
    }
}
