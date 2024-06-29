import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class171 extends class23 {

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
    private int field3328 = 6;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "Li;")
    private static class88 field3326 = class208.method1425(105, "Bad session id)3");

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "Li;")
    private static class88 field3327 = class208.method1425(105, " has logged in)3");

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "Li;")
    public static class88 field3331 = field3326;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "Li;")
    public static class88 field3323 = field3327;

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "[Li;")
    public static class88[] field3332 = new class88[1000];

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class171() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        if (arg1 != 13) {
            this.method7(-26, (byte) 48);
        }
        ++field3333;
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int[][] var4 = this.method121(0, (byte) 14, arg0);
            int[][] var5 = this.method121(1, (byte) -120, arg0);
            int[] var6 = var4[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[1];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field3328;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class70.field1276; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var6[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var11[var16];
                                                                var9[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                                var7[var16] = -(var17 * var20 >> 11) + var20 - -var17;
                                                                var8[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class70.field1276 < ~var23; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var6[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var11[var23];
                                                            var9[var23] = ~var27 < ~var28 ? -var28 + var27 : -var27 + var28;
                                                            var7[var23] = ~var25 <= ~var24 ? var25 - var24 : -var25 + var24;
                                                            var8[var23] = var29 <= var26 ? -var29 + var26 : -var26 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class70.field1276 > var30; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var6[var30];
                                                        int var36 = var12[var30];
                                                        var9[var30] = var35 > var31 ? var35 : var31;
                                                        var7[var30] = ~var33 >= ~var36 ? var36 : var33;
                                                        var8[var30] = var32 >= var34 ? var32 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class70.field1276 > var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var6[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var13[var37];
                                                    var9[var37] = var43 > var39 ? var39 : var43;
                                                    var7[var37] = var42 > var40 ? var40 : var42;
                                                    var8[var37] = ~var41 >= ~var38 ? var41 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class70.field1276; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var6[var44];
                                                int var47 = var10[var44];
                                                var9[var44] = ~var46 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = var45 != 0 ? 4096 - (-var14[var44] + 4096 << 12) / var45 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class70.field1276; ++var48) {
                                            int var49 = var6[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var9[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = var51 == 4096 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var8[var48] = var50 != 4096 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class70.field1276 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var9[var52] = var55 >= 2048 ? -((-var6[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var6[var52] * var55 >> 11;
                                        var7[var52] = var53 >= 2048 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = ~var54 <= -2049 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class70.field1276; ++var56) {
                                    var9[var56] = -((4096 - var13[var56]) * (-var6[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class70.field1276; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var9[var57] = var60 != 0 ? (var6[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = ~var58 == -1 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class70.field1276; ++var61) {
                            var9[var61] = var6[var61] * var13[var61] >> 12;
                            var7[var61] = var10[var61] * var12[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class70.field1276; ++var62) {
                        var9[var62] = var6[var62] + -var13[var62];
                        var7[var62] = var10[var62] + -var12[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class70.field1276; ++var63) {
                    var9[var63] = var6[var63] - -var13[var63];
                    var7[var63] = var10[var63] + var12[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Li;II)V")
    public static final void method1215(class88 arg0, int arg1, int arg2) {
        class146.field2749.method30((byte) -72, 40);
        ++class145.field2721;
        ++field3325;
        if (arg2 != 0) {
            method1218(true);
        }
        class146.field2749.method296((byte) -109, arg0.method630(false));
        class146.field2749.method346(arg2 ^ 255, arg1);
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public static final void method1216(int arg0) {
        if (arg0 != -11989) {
            field3327 = null;
        }
        for (int var1 = -1; ~class55.field1027 < ~var1; ++var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class174.field3430[var1];
            }
            class44 var3 = class244.field4493[var2];
            if (var3 != null) {
                class77.method514(var3.field4105, var3, 24550);
            }
        }
        ++field3330;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public static final void method1217(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class11.field152; ++var3) {
            for (int var4 = 0; var4 < class48.field899; ++var4) {
                for (int var5 = 0; var5 < class66.field1202; ++var5) {
                    class52 var6 = class29.field489[var3][var4][var5];
                    if (var6 != null) {
                        class157 var7 = var6.field959;
                        if (var7 != null && var7.field3023.method544()) {
                            class242.method1596(var7.field3023, var3, var4, var5, 1, 1);
                            if (var7.field3034 != null && var7.field3034.method544()) {
                                class242.method1596(var7.field3034, var3, var4, var5, 1, 1);
                                var7.field3023.method570(var7.field3034, 0, 0, 0, false);
                                var7.field3034 = var7.field3034.method559(arg0, arg1, arg2);
                            }
                            var7.field3023 = var7.field3023.method559(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field962; ++var8) {
                            class108 var10 = var6.field963[var8];
                            if (var10 != null && var10.field1945.method544()) {
                                class242.method1596(var10.field1945, var3, var4, var5, var10.field1942 - var10.field1935 + 1, var10.field1937 - var10.field1938 + 1);
                                var10.field1945 = var10.field1945.method559(arg0, arg1, arg2);
                            }
                        }
                        class166 var9 = var6.field949;
                        if (var9 != null && var9.field3196.method544()) {
                            class149.method1020(var9.field3196, var3, var4, var5);
                            var9.field3196 = var9.field3196.method559(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        ++field3322;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field369 = ~arg0.method347(26119) == -2;
            }
        } else {
            this.field3328 = arg0.method347(26119);
        }
        if (arg1 != -3) {
            method1216(-34);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field3324;
        if (arg1 < 19) {
            field3329 = -75;
        }
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int[] var4 = this.method120(arg0, false, 0);
            int[] var5 = this.method120(arg0, false, 1);
            int var6 = this.field3328;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class70.field1276; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class70.field1276; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? -var11 + var12 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class70.field1276; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 > ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class70.field1276 < ~var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class70.field1276; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class70.field1276; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class70.field1276 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class70.field1276; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class70.field1276 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class70.field1276 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class70.field1276; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class70.field1276; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(Z)V")
    public static void method1218(boolean arg0) {
        field3323 = null;
        field3326 = null;
        if (arg0) {
            method1217(81, 125, -118);
        }
        field3332 = null;
        field3327 = null;
        field3331 = null;
    }
}
