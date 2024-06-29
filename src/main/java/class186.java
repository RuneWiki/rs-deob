import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class186 extends class306 {

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    private int field2799 = 6;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Z")
    public static boolean field2797 = false;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Lqb;")
    public static class117 field2804 = new class117(512);

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "F")
    public static float field2800;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)Lfm;", line = 9)
    public static final class55 method1280(int arg0, int arg1) {
        class55 var2 = (class55) class102.field1378.method380(0, (long) arg1);
        field2798++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class196.field2975.method100(3, arg1, (byte) -107);
        if (arg0 > -126) {
            method1283(-50);
        }
        class55 var4 = new class55();
        if (var3 != null) {
            var4.method332(-120, new class143(var3));
        }
        class102.field1378.method377((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 36)
    public class186() {
        super(2, false);
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V", line = 43)
    public static void method1281(int arg0) {
        if (arg0 != 1810482956) {
            field2800 = 1.5194741F;
        }
        field2804 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z", line = 60)
    public static final boolean method1282(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class326.field5223; var3++) {
            class85 var4 = class85.field1102[var3];
            if (var4.field1113 == 1) {
                int var5 = var4.field1112 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1126 * var5 >> 8) + var4.field1111;
                    int var7 = (var4.field1116 * var5 >> 8) + var4.field1123;
                    int var8 = (var4.field1105 * var5 >> 8) + var4.field1122;
                    int var9 = (var4.field1125 * var5 >> 8) + var4.field1119;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1113 == 2) {
                int var10 = arg0 - var4.field1112;
                if (var10 > 0) {
                    int var11 = (var4.field1126 * var10 >> 8) + var4.field1111;
                    int var12 = (var4.field1116 * var10 >> 8) + var4.field1123;
                    int var13 = (var4.field1105 * var10 >> 8) + var4.field1122;
                    int var14 = (var4.field1125 * var10 >> 8) + var4.field1119;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1113 == 3) {
                int var15 = var4.field1111 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1114 * var15 >> 8) + var4.field1112;
                    int var17 = (var4.field1104 * var15 >> 8) + var4.field1107;
                    int var18 = (var4.field1105 * var15 >> 8) + var4.field1122;
                    int var19 = (var4.field1125 * var15 >> 8) + var4.field1119;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1113 == 4) {
                int var20 = arg2 - var4.field1111;
                if (var20 > 0) {
                    int var21 = (var4.field1114 * var20 >> 8) + var4.field1112;
                    int var22 = (var4.field1104 * var20 >> 8) + var4.field1107;
                    int var23 = (var4.field1105 * var20 >> 8) + var4.field1122;
                    int var24 = (var4.field1125 * var20 >> 8) + var4.field1119;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1113 == 5) {
                int var25 = arg1 - var4.field1122;
                if (var25 > 0) {
                    int var26 = (var4.field1114 * var25 >> 8) + var4.field1112;
                    int var27 = (var4.field1104 * var25 >> 8) + var4.field1107;
                    int var28 = (var4.field1126 * var25 >> 8) + var4.field1111;
                    int var29 = (var4.field1116 * var25 >> 8) + var4.field1123;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILlf;I)V", line = 184)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field2802++;
        if (arg0 != -15334) {
            method1282(10, -32, 116);
        }
        if (arg2 == 0) {
            this.field2799 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field4759 = arg1.method1043(true) == 1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I", line = 220)
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        int[] var3 = this.field4757.method903(arg0, arg1 ^ 0x5C2B3C94);
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(arg0, (byte) 127, 0);
            int[] var5 = this.method2161(arg0, (byte) 122, 1);
            int var6 = this.field2799;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class31.field367; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class31.field367; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var8 = 0; var8 < class31.field367; var8++) {
                    var3[var8] = var4[var8] * var5[var8] >> 12;
                }
            } else if (var6 == 4) {
                for (int var9 = 0; var9 < class31.field367; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 == 0 ? 4096 : (var4[var9] << 12) / var10;
                }
            } else if (var6 == 5) {
                for (int var29 = 0; var29 < class31.field367; var29++) {
                    var3[var29] = 4096 - ((4096 - var4[var29]) * (4096 - var5[var29]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var11 = 0; var11 < class31.field367; var11++) {
                    int var12 = var5[var11];
                    var3[var11] = var12 < 2048 ? var4[var11] * var12 >> 11 : 4096 - ((4096 - var4[var11]) * (4096 - var12) >> 11);
                }
            } else if (var6 == 7) {
                for (int var27 = 0; var27 < class31.field367; var27++) {
                    int var28 = var4[var27];
                    var3[var27] = var28 == 4096 ? 4096 : (var5[var27] << 12) / (4096 - var28);
                }
            } else if (var6 == 8) {
                for (int var13 = 0; var13 < class31.field367; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 0 ? 0 : 4096 - ((4096 - var5[var13] << 12) / var14);
                }
            } else if (var6 == 9) {
                for (int var24 = 0; var24 < class31.field367; var24++) {
                    int var25 = var4[var24];
                    int var26 = var5[var24];
                    var3[var24] = var25 < var26 ? var25 : var26;
                }
            } else if (var6 == 10) {
                for (int var15 = 0; var15 < class31.field367; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var16 < var17 ? var17 : var16;
                }
            } else if (var6 == 11) {
                for (int var21 = 0; var21 < class31.field367; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var22 < var23 ? var23 - var22 : var22 - var23;
                }
            } else if (var6 == 12) {
                for (int var18 = 0; var18 < class31.field367; var18++) {
                    int var19 = var4[var18];
                    int var20 = var5[var18];
                    var3[var18] = var20 + var19 - (var19 * var20 >> 11);
                }
            }
        }
        field2805++;
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)[Lje;", line = 465)
    public static final class84[] method1283(int arg0) {
        if (arg0 <= 47) {
            return (class84[]) null;
        }
        if (class116.field1614 == null) {
            class84[] var1 = class116.method753(class156.field2451, 1344872514);
            int var2 = 0;
            class84[] var3 = new class84[var1.length];
            label56: for (int var4 = 0; var4 < var1.length; var4++) {
                class84 var5 = var1[var4];
                if ((var5.field1091 <= 0 || var5.field1091 >= 24) && var5.field1100 >= 800 && var5.field1095 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class84 var7 = var3[var6];
                        if (var5.field1100 == var7.field1100 && var5.field1095 == var7.field1095) {
                            if (var7.field1091 < var5.field1091) {
                                var3[var6] = var5;
                            }
                            continue label56;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class116.field1614 = new class84[var2];
            class8.method56(var3, 0, class116.field1614, 0, var2);
            int[] var8 = new int[class116.field1614.length];
            for (int var9 = 0; var9 < class116.field1614.length; var9++) {
                class84 var10 = class116.field1614[var9];
                var8[var9] = var10.field1100 * var10.field1095;
            }
            class282.method2039(var8, class116.field1614, (byte) 112);
        }
        field2801++;
        return class116.field1614;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBI)I", line = 542)
    public static final int method1284(int arg0, int arg1, byte arg2, int arg3) {
        field2806++;
        if (arg2 != 125) {
            return 111;
        }
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        return (arg1 >> 5 << 7) + ((arg0 >> 2 << 10) + (arg3 >> 1));
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)[[I", line = 584)
    public final int[][] method681(int arg0, byte arg1) {
        field2803++;
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (arg1 != -119) {
            field2800 = 0.56757337F;
        }
        if (this.field4752.field4179) {
            int[][] var4 = this.method2160(0, (byte) 112, arg0);
            int[][] var5 = this.method2160(1, (byte) 112, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var4[2];
            int[] var9 = var5[0];
            int[] var10 = var4[0];
            int[] var11 = var5[1];
            int[] var12 = var4[1];
            int[] var13 = var3[1];
            int[] var14 = var5[2];
            int var15 = this.field2799;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class31.field367; var16++) {
                    var6[var16] = var9[var16] + var10[var16];
                    var13[var16] = var11[var16] + var12[var16];
                    var7[var16] = var8[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var63 = 0; var63 < class31.field367; var63++) {
                    var6[var63] = var10[var63] - var9[var63];
                    var13[var63] = var12[var63] - var11[var63];
                    var7[var63] = var8[var63] - var14[var63];
                }
            } else if (var15 == 3) {
                for (int var62 = 0; var62 < class31.field367; var62++) {
                    var6[var62] = var9[var62] * var10[var62] >> 12;
                    var13[var62] = var11[var62] * var12[var62] >> 12;
                    var7[var62] = var8[var62] * var14[var62] >> 12;
                }
            } else if (var15 == 4) {
                for (int var17 = 0; var17 < class31.field367; var17++) {
                    int var18 = var14[var17];
                    int var19 = var11[var17];
                    int var20 = var9[var17];
                    var6[var17] = var20 == 0 ? 4096 : (var10[var17] << 12) / var20;
                    var13[var17] = var19 == 0 ? 4096 : (var12[var17] << 12) / var19;
                    var7[var17] = var18 == 0 ? 4096 : (var8[var17] << 12) / var18;
                }
            } else if (var15 == 5) {
                for (int var61 = 0; var61 < class31.field367; var61++) {
                    var6[var61] = 4096 - ((4096 - var9[var61]) * (4096 - var10[var61]) >> 12);
                    var13[var61] = 4096 - ((4096 - var12[var61]) * (4096 - var11[var61]) >> 12);
                    var7[var61] = 4096 - ((4096 - var8[var61]) * (4096 - var14[var61]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var21 = 0; var21 < class31.field367; var21++) {
                    int var22 = var11[var21];
                    int var23 = var14[var21];
                    int var24 = var9[var21];
                    var6[var21] = var24 < 2048 ? var10[var21] * var24 >> 11 : 4096 - ((4096 - var10[var21]) * (4096 - var24) >> 11);
                    var13[var21] = var22 < 2048 ? var12[var21] * var22 >> 11 : 4096 - ((4096 - var22) * (4096 - var12[var21]) >> 11);
                    var7[var21] = var23 < 2048 ? var8[var21] * var23 >> 11 : 4096 - ((4096 - var8[var21]) * (4096 - var23) >> 11);
                }
            } else if (var15 == 7) {
                for (int var25 = 0; var25 < class31.field367; var25++) {
                    int var26 = var12[var25];
                    int var27 = var8[var25];
                    int var28 = var10[var25];
                    var6[var25] = var28 == 4096 ? 4096 : (var9[var25] << 12) / (4096 - var28);
                    var13[var25] = var26 == 4096 ? 4096 : (var11[var25] << 12) / (4096 - var26);
                    var7[var25] = var27 == 4096 ? 4096 : (var14[var25] << 12) / (4096 - var27);
                }
            } else if (var15 == 8) {
                for (int var29 = 0; var29 < class31.field367; var29++) {
                    int var30 = var10[var29];
                    int var31 = var12[var29];
                    int var32 = var8[var29];
                    var6[var29] = var30 == 0 ? 0 : 4096 - ((4096 - var9[var29] << 12) / var30);
                    var13[var29] = var31 == 0 ? 0 : 4096 - ((4096 - var11[var29] << 12) / var31);
                    var7[var29] = var32 == 0 ? 0 : 4096 - (4096 - var14[var29] << 12) / var32;
                }
            } else if (var15 == 9) {
                for (int var54 = 0; var54 < class31.field367; var54++) {
                    int var55 = var8[var54];
                    int var56 = var14[var54];
                    int var57 = var9[var54];
                    int var58 = var11[var54];
                    int var59 = var12[var54];
                    int var60 = var10[var54];
                    var6[var54] = var57 > var60 ? var60 : var57;
                    var13[var54] = var59 >= var58 ? var58 : var59;
                    var7[var54] = var56 <= var55 ? var56 : var55;
                }
            } else if (var15 == 10) {
                for (int var33 = 0; var33 < class31.field367; var33++) {
                    int var34 = var11[var33];
                    int var35 = var12[var33];
                    int var36 = var10[var33];
                    int var37 = var9[var33];
                    int var38 = var8[var33];
                    int var39 = var14[var33];
                    var6[var33] = var37 < var36 ? var36 : var37;
                    var13[var33] = var35 <= var34 ? var34 : var35;
                    var7[var33] = var38 > var39 ? var38 : var39;
                }
            } else if (var15 == 11) {
                for (int var47 = 0; var47 < class31.field367; var47++) {
                    int var48 = var8[var47];
                    int var49 = var12[var47];
                    int var50 = var11[var47];
                    int var51 = var14[var47];
                    int var52 = var9[var47];
                    int var53 = var10[var47];
                    var6[var47] = var52 >= var53 ? var52 - var53 : var53 - var52;
                    var13[var47] = var50 < var49 ? var49 - var50 : -var49 + var50;
                    var7[var47] = var51 < var48 ? var48 - var51 : var51 - var48;
                }
            } else if (var15 == 12) {
                for (int var40 = 0; var40 < class31.field367; var40++) {
                    int var41 = var9[var40];
                    int var42 = var12[var40];
                    int var43 = var10[var40];
                    int var44 = var14[var40];
                    int var45 = var8[var40];
                    int var46 = var11[var40];
                    var6[var40] = var41 + var43 - (var41 * var43 >> 11);
                    var13[var40] = var42 + var46 - (var42 * var46 >> 11);
                    var7[var40] = var44 + var45 - (var44 * var45 >> 11);
                }
            }
        }
        return var3;
    }
}
