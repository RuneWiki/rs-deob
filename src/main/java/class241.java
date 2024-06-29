import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class241 extends class59 {

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    private int field3990 = 6;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field3982 = 64;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "Lph;")
    public static class229 field3986 = class266.method1858("Impossible de trouver ", 0);

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "[Lph;")
    public static class229[] field3992 = new class229[1000];

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "Lvm;")
    public static class202 field3984 = new class202(64);

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "[I")
    public static int[] field3991;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "(I)V", line = 13)
    public static void method1692(int arg0) {
        field3991 = null;
        field3986 = null;
        field3992 = null;
        if (arg0 > -9) {
            field3986 = (class229) null;
        }
        field3984 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZIIIBILwa;ILv;III)Lv;", line = 26)
    public static final class286 method1693(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class312 arg8, int arg9, class286 arg10, int arg11, int arg12, int arg13) {
        field3989++;
        long var14 = ((long) arg11 << 32) + ((long) arg13 << 48) + (long) ((arg5 << 16) + arg12 - -(arg3 << 24));
        class286 var16 = (class286) class184.field2985.method1413(var14, true);
        if (var16 == null) {
            byte var17;
            if (arg12 == 1) {
                var17 = 9;
            } else if (arg12 == 2) {
                var17 = 12;
            } else if (arg12 == 3) {
                var17 = 15;
            } else if (arg12 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class28 var20 = new class28(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int var21 = var20.method199(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class310.field5199[var27] * var24 + arg1 >> 16;
                    int var29 = arg7 + (class310.field5197[var27] * var25) >> 16;
                    var22[var23][var26] = var20.method199(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                short var33 = (short) (((arg11 & 0x7F) * var32 + (arg13 & 0x7F) * var31 & 0x7F00) + ((arg11 & 0xFC00) * var32 + (arg13 & 0xFC00) * var31 & 0xFC0000) + ((arg11 & 0x380) * var32 + (arg13 & 0x380) * var31 & 0x38000) >> 8);
                byte var34 = (byte) (arg3 * var31 + arg5 * var32 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method218(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var33, var34);
                    } else {
                        var20.method218(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var20.method218(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var20.method193(64, 768, -50, -10, -50);
            class184.field2985.method1419(var14, 5216, var16);
        }
        int var36 = arg12 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg10.method1729();
        if (arg6 != -46) {
            method1692(-12);
        }
        int var41 = arg10.method1726();
        int var42 = arg10.method1723();
        int var43 = var36;
        if (arg2) {
            if (arg0 > 128 && arg0 < 896) {
                var38 -= 128;
            }
            if (arg0 > 640 && arg0 < 1408) {
                var43 = var36 + 128;
            }
            if (arg0 > 1152 && arg0 < 1920) {
                var39 = var36 + 128;
            }
            if (arg0 > 1664 || arg0 < 384) {
                var37 -= 128;
            }
        }
        if (var41 > var39) {
            var41 = var39;
        }
        if (var38 > var40) {
            var40 = var38;
        }
        if (var42 < var37) {
            var42 = var37;
        }
        int var44 = arg10.method1720();
        class145 var45 = null;
        if (var43 < var44) {
            var44 = var43;
        }
        if (arg8 != null) {
            int var46 = arg8.field5226[arg9];
            var45 = class230.method1648(110, var46 >> 16);
            arg9 = var46 & 0xFFFF;
        }
        class286 var47;
        if (var45 == null) {
            var47 = var16.method1727(true, true);
            var47.method1728((var41 - var40) / 2, 128, (var44 - var42) / 2);
            var47.method1734((var40 + var41) / 2, 0, (var42 + var44) / 2);
        } else {
            var47 = var16.method1727(!var45.method1069(255, arg9), true);
            var47.method1728((var41 - var40) / 2, 128, (var44 - var42) / 2);
            var47.method1734((var40 + var41) / 2, 0, (var42 + var44) / 2);
            var47.method1715(var45, arg9);
        }
        if (arg0 != 0) {
            var47.method1732(arg0);
        }
        if (class99.field1675) {
            class322 var50 = (class322) var47;
            if (class259.method1801(arg7 + var42, -20428, class298.field4849, arg1 + var40) != arg4 || arg4 != class259.method1801(arg7 + var44, -20428, class298.field4849, arg1 + var41)) {
                for (int var51 = 0; var51 < var50.field5480; var51++) {
                    var50.field5461[var51] += class259.method1801(var50.field5459[var51] + arg7, -20428, class298.field4849, var50.field5448[var51] + arg1) - arg4;
                }
                var50.field5469.field1619 = false;
                var50.field5455.field58 = false;
            }
        } else {
            class246 var48 = (class246) var47;
            if (class259.method1801(arg7 + var42, -20428, class298.field4849, arg1 + var40) != arg4 || arg4 != class259.method1801(arg7 + var44, -20428, class298.field4849, arg1 + var41)) {
                for (int var49 = 0; var49 < var48.field4060; var49++) {
                    var48.field4080[var49] += class259.method1801(var48.field4068[var49] + arg7, -20428, class298.field4849, var48.field4072[var49] + arg1) - arg4;
                }
                var48.field4067 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)[I", line = 259)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            method1693(124, 101, true, 106, -92, -90, (byte) 2, -124, (class312) null, 30, (class286) null, 59, 68, 57);
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(arg1, 0, (byte) 114);
            int[] var5 = this.method394(arg1, 1, (byte) -83);
            int var6 = this.field3990;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class293.field4789; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class293.field4789; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var7 = 0; var7 < class293.field4789; var7++) {
                    var3[var7] = var4[var7] * var5[var7] >> 12;
                }
            } else if (var6 == 4) {
                for (int var8 = 0; var8 < class293.field4789; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 == 0 ? 4096 : (var4[var8] << 12) / var9;
                }
            } else if (var6 == 5) {
                for (int var10 = 0; var10 < class293.field4789; var10++) {
                    var3[var10] = 4096 - ((4096 - var4[var10]) * (4096 - var5[var10]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var11 = 0; var11 < class293.field4789; var11++) {
                    int var12 = var5[var11];
                    var3[var11] = var12 < 2048 ? var4[var11] * var12 >> 11 : 4096 - ((4096 - var12) * (4096 - var4[var11]) >> 11);
                }
            } else if (var6 == 7) {
                for (int var27 = 0; var27 < class293.field4789; var27++) {
                    int var28 = var4[var27];
                    var3[var27] = var28 == 4096 ? 4096 : (var5[var27] << 12) / (4096 - var28);
                }
            } else if (var6 == 8) {
                for (int var13 = 0; var13 < class293.field4789; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 0 ? 0 : 4096 - (4096 - var5[var13] << 12) / var14;
                }
            } else if (var6 == 9) {
                for (int var15 = 0; var15 < class293.field4789; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var16 <= var17 ? var16 : var17;
                }
            } else if (var6 == 10) {
                for (int var18 = 0; var18 < class293.field4789; var18++) {
                    int var19 = var4[var18];
                    int var20 = var5[var18];
                    var3[var18] = var20 < var19 ? var19 : var20;
                }
            } else if (var6 == 11) {
                for (int var24 = 0; var24 < class293.field4789; var24++) {
                    int var25 = var4[var24];
                    int var26 = var5[var24];
                    var3[var24] = var25 > var26 ? var25 - var26 : -var25 + var26;
                }
            } else if (var6 == 12) {
                for (int var21 = 0; var21 < class293.field4789; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var22 + var23 - (var22 * var23 >> 11);
                }
            }
        }
        field3983++;
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[[I", line = 507)
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != 4588) {
            return (int[][]) ((int[][]) null);
        }
        field3981++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int[][] var4 = this.method397(1, 0, arg0);
            int[][] var5 = this.method397(1, 1, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[1];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field3990;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class293.field4789; var16++) {
                    var6[var16] = var9[var16] + var13[var16];
                    var7[var16] = var10[var16] + var12[var16];
                    var8[var16] = var11[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var17 = 0; var17 < class293.field4789; var17++) {
                    var6[var17] = var9[var17] - var13[var17];
                    var7[var17] = var10[var17] - var12[var17];
                    var8[var17] = var11[var17] - var14[var17];
                }
            } else if (var15 == 3) {
                for (int var18 = 0; var18 < class293.field4789; var18++) {
                    var6[var18] = var9[var18] * var13[var18] >> 12;
                    var7[var18] = var10[var18] * var12[var18] >> 12;
                    var8[var18] = var11[var18] * var14[var18] >> 12;
                }
            } else if (var15 == 4) {
                for (int var60 = 0; var60 < class293.field4789; var60++) {
                    int var61 = var13[var60];
                    int var62 = var12[var60];
                    int var63 = var14[var60];
                    var6[var60] = var61 == 0 ? 4096 : (var9[var60] << 12) / var61;
                    var7[var60] = var62 == 0 ? 4096 : (var10[var60] << 12) / var62;
                    var8[var60] = var63 == 0 ? 4096 : (var11[var60] << 12) / var63;
                }
            } else if (var15 == 5) {
                for (int var59 = 0; var59 < class293.field4789; var59++) {
                    var6[var59] = 4096 - ((4096 - var13[var59]) * (4096 - var9[var59]) >> 12);
                    var7[var59] = 4096 - ((4096 - var10[var59]) * (4096 - var12[var59]) >> 12);
                    var8[var59] = 4096 - ((4096 - var11[var59]) * (4096 - var14[var59]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var19 = 0; var19 < class293.field4789; var19++) {
                    int var20 = var12[var19];
                    int var21 = var13[var19];
                    int var22 = var14[var19];
                    var6[var19] = var21 >= 2048 ? 4096 - ((4096 - var9[var19]) * (4096 - var21) >> 11) : var9[var19] * var21 >> 11;
                    var7[var19] = var20 >= 2048 ? 4096 - ((4096 - var10[var19]) * (4096 - var20) >> 11) : var10[var19] * var20 >> 11;
                    var8[var19] = var22 >= 2048 ? 4096 - ((4096 - var11[var19]) * (4096 - var22) >> 11) : var11[var19] * var22 >> 11;
                }
            } else if (var15 == 7) {
                for (int var23 = 0; var23 < class293.field4789; var23++) {
                    int var24 = var9[var23];
                    int var25 = var10[var23];
                    int var26 = var11[var23];
                    var6[var23] = var24 == 4096 ? 4096 : (var13[var23] << 12) / (4096 - var24);
                    var7[var23] = var25 == 4096 ? 4096 : (var12[var23] << 12) / (4096 - var25);
                    var8[var23] = var26 == 4096 ? 4096 : (var14[var23] << 12) / (4096 - var26);
                }
            } else if (var15 == 8) {
                for (int var55 = 0; var55 < class293.field4789; var55++) {
                    int var56 = var9[var55];
                    int var57 = var11[var55];
                    int var58 = var10[var55];
                    var6[var55] = var56 == 0 ? 0 : 4096 - ((4096 - var13[var55] << 12) / var56);
                    var7[var55] = var58 == 0 ? 0 : 4096 - ((4096 - var12[var55] << 12) / var58);
                    var8[var55] = var57 == 0 ? 0 : 4096 - ((4096 - var14[var55] << 12) / var57);
                }
            } else if (var15 == 9) {
                for (int var27 = 0; var27 < class293.field4789; var27++) {
                    int var28 = var12[var27];
                    int var29 = var10[var27];
                    int var30 = var9[var27];
                    int var31 = var11[var27];
                    int var32 = var13[var27];
                    int var33 = var14[var27];
                    var6[var27] = var30 < var32 ? var30 : var32;
                    var7[var27] = var28 <= var29 ? var28 : var29;
                    var8[var27] = var33 > var31 ? var31 : var33;
                }
            } else if (var15 == 10) {
                for (int var34 = 0; var34 < class293.field4789; var34++) {
                    int var35 = var13[var34];
                    int var36 = var12[var34];
                    int var37 = var10[var34];
                    int var38 = var9[var34];
                    int var39 = var11[var34];
                    int var40 = var14[var34];
                    var6[var34] = var35 >= var38 ? var35 : var38;
                    var7[var34] = var37 <= var36 ? var36 : var37;
                    var8[var34] = var40 >= var39 ? var40 : var39;
                }
            } else if (var15 == 11) {
                for (int var41 = 0; var41 < class293.field4789; var41++) {
                    int var42 = var14[var41];
                    int var43 = var13[var41];
                    int var44 = var12[var41];
                    int var45 = var10[var41];
                    int var46 = var9[var41];
                    int var47 = var11[var41];
                    var6[var41] = var43 < var46 ? var46 - var43 : var43 - var46;
                    var7[var41] = var45 > var44 ? var45 - var44 : -var45 + var44;
                    var8[var41] = var42 < var47 ? var47 - var42 : -var47 + var42;
                }
            } else if (var15 == 12) {
                for (int var48 = 0; var48 < class293.field4789; var48++) {
                    int var49 = var12[var48];
                    int var50 = var10[var48];
                    int var51 = var9[var48];
                    int var52 = var13[var48];
                    int var53 = var14[var48];
                    int var54 = var11[var48];
                    var6[var48] = var52 + var51 - (var51 * var52 >> 11);
                    var7[var48] = var49 + var50 - (var49 * var50 >> 11);
                    var8[var48] = var54 + var53 - (var53 * var54 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 819)
    public class241() {
        super(2, false);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 832)
    public static final void method1694(boolean arg0) {
        class119.field1996.method1415(-18218);
        field3987++;
        if (!arg0) {
            field3993 = 110;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BILhb;)V", line = 858)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field3990 = arg2.method1178(8);
        } else if (arg1 == 1) {
            this.field841 = arg2.method1178(arg0 - 107) == 1;
        }
        if (arg0 != 115) {
            method1694(false);
        }
        field3980++;
    }
}
