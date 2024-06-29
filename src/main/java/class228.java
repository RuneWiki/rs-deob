import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class228 extends class45 {

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    private int field3247 = 6;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "S")
    public static short field3241 = 205;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "Z")
    public static boolean field3250 = false;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "[Lf;")
    public static class529[] field3248;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)[[I", line = 4)
    public final int[][] method49(int arg0, int arg1) {
        ++field3245;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            field3246 = -14;
        }
        if (super.field833.field1888) {
            int[][] var4 = this.method437(0, arg1, -117);
            int[][] var5 = this.method437(1, arg1, arg0 ^ 92);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3247;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class259.field3768; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = -(var20 * var21 >> 11) + var21 + var20;
                                                                var7[var16] = var19 + var22 + -(var19 * var22 >> 11);
                                                                var8[var16] = var18 - (-var17 - -(var17 * var18 >> 11));
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class259.field3768 > var23; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = ~var27 > ~var29 ? -var27 + var29 : var27 - var29;
                                                            var7[var23] = ~var26 >= ~var25 ? -var26 + var25 : -var25 + var26;
                                                            var8[var23] = var28 < var24 ? -var28 + var24 : var28 - var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class259.field3768; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = ~var31 <= ~var33 ? var31 : var33;
                                                        var7[var30] = var32 > var34 ? var32 : var34;
                                                        var8[var30] = ~var35 < ~var36 ? var35 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class259.field3768; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = var38 >= var43 ? var43 : var38;
                                                    var7[var37] = var40 >= var41 ? var41 : var40;
                                                    var8[var37] = var39 < var42 ? var39 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class259.field3768; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var46 != 0 ? 4096 - (4096 - var12[var44] << 12) / var46 : 0;
                                                var7[var44] = ~var47 != -1 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = var45 != 0 ? 4096 - (-var14[var44] + 4096 << 12) / var45 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class259.field3768 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var50 != 4096 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = var49 != 4096 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                            var8[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class259.field3768; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 >= 2048 ? -((4096 - var55) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                        var7[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : 4096 - ((4096 - var10[var52]) * (4096 - var54) >> 11);
                                        var8[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : 4096 - ((4096 - var53) * (-var11[var52] + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class259.field3768; ++var56) {
                                    var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; class259.field3768 > var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var58 == -1 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = var59 != 0 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = ~var60 == -1 ? 4096 : (var11[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; class259.field3768 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class259.field3768; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class259.field3768; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(B)V", line = 319)
    public static void method1488(byte arg0) {
        if (arg0 == -94) {
            field3248 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 332)
    public class228() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[I", line = 336)
    public final int[] method35(int arg0, int arg1) {
        ++field3244;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (arg0 != 0) {
            method1488((byte) -20);
        }
        if (super.field854.field1928) {
            int[] var4 = this.method434(0, arg1, -28);
            int[] var5 = this.method434(1, arg1, -9);
            int var6 = this.field3247;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class259.field3768 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class259.field3768; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 > var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class259.field3768; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 > var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class259.field3768; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 <= var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class259.field3768; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class259.field3768; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class259.field3768; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? 4096 - ((4096 - var24) * (-var4[var23] + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class259.field3768 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class259.field3768 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class259.field3768 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class259.field3768; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class259.field3768; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZIIZ)V", line = 587)
    public static final void method1489(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class479.field7137 = 0L;
        ++field3242;
        int var5 = class8.method43(arg1);
        if (~arg0 == -4 || ~var5 == -4) {
            arg4 = true;
        }
        if (!class4.field109.method223()) {
            arg4 = true;
        }
        class302.method1903(arg3, arg2, arg0, arg4, (byte) -60, var5);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lcu;II)V", line = 610)
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field3249;
        if (arg1 != -26471) {
            field3241 = 105;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field844 = arg0.method1063((byte) 112) == 1;
            }
        } else {
            this.field3247 = arg0.method1063((byte) -63);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBLgm;ILln;Lat;I)V", line = 650)
    public static final void method1490(int arg0, int arg1, byte arg2, class79 arg3, int arg4, class256 arg5, class255 arg6, int arg7) {
        ++field3243;
        if (arg2 == 117) {
            class69 var8 = new class69();
            var8.field1187 = arg7 << 7;
            var8.field1198 = arg4 << 7;
            var8.field1182 = arg0;
            if (arg3 == null) {
                if (arg6 == null) {
                    if (arg5 != null) {
                        var8.field1194 = arg5;
                        var8.field1183 = arg7 - -arg5.method1654(116) << 7;
                        var8.field1202 = arg4 - -arg5.method1654(92) << 7;
                        var8.field1190 = class9.method47(arg5, true);
                        var8.field1204 = arg5.field3709 << 7;
                        var8.field1203 = arg5.field3699;
                        class284.field4051.method166(var8, (long) arg5.field7669, 108);
                        return;
                    }
                } else {
                    var8.field1188 = arg6;
                    class42 var11 = arg6.field3677;
                    if (var11.field797 != null) {
                        var8.field1201 = true;
                        var11 = var11.method427(class335.field5059, (byte) -100);
                    }
                    if (var11 != null) {
                        var8.field1183 = var11.field807 + arg7 << 7;
                        var8.field1202 = var11.field807 + arg4 << 7;
                        var8.field1190 = class405.method2476(arg6, (byte) -10);
                        var8.field1204 = var11.field781 << 7;
                        var8.field1203 = var11.field791;
                    }
                    class510.field7530.method2417(-128, var8);
                }
            } else {
                var8.field1189 = arg3;
                int var9 = arg3.field1345;
                int var10 = arg3.field1384;
                if (arg1 == 1 || arg1 == 3) {
                    var9 = arg3.field1384;
                    var10 = arg3.field1345;
                }
                var8.field1203 = arg3.field1342;
                var8.field1202 = arg4 + var10 << 7;
                var8.field1196 = arg3.field1399;
                var8.field1204 = arg3.field1379 << 7;
                var8.field1190 = arg3.field1317;
                var8.field1184 = arg3.field1313;
                var8.field1183 = arg7 + var9 << 7;
                var8.field1200 = arg3.field1350;
                if (arg3.field1370 != null) {
                    var8.field1201 = true;
                    var8.method566(31106);
                }
                if (var8.field1200 != null) {
                    var8.field1180 = (int) (Math.random() * (double) (-var8.field1184 + var8.field1196)) + var8.field1184;
                }
                class110.field1872.method2417(102, var8);
            }
        }
    }
}
