import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class130 extends class335 {

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    private int field2038 = 6;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "[I")
    public static int[] field2040 = new int[32];

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field2042 = 0;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "Lpg;")
    public static class320 field2035 = new class320(4);

    @OriginalMember(owner = "client!f", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2044 = "M";

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Ll;")
    public static class133 field2043;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "Lgm;")
    public static class249 field2045;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "[S")
    public static short[] field2041;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V", line = 8)
    public static void method936(int arg0) {
        field2043 = null;
        if (arg0 != 4096) {
            field2041 = (short[]) null;
        }
        field2040 = null;
        field2045 = null;
        field2035 = null;
        field2041 = null;
        field2044 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V", line = 25)
    public static final void method937(byte arg0, int arg1) {
        class30.field441.method2175(arg1, -1401253017);
        field2037++;
        if (arg0 != -116) {
            method937((byte) 53, -59);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[[I", line = 41)
    public final int[][] method249(int arg0, byte arg1) {
        if (arg1 != 51) {
            return (int[][]) ((int[][]) null);
        }
        field2034++;
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int[][] var4 = this.method2328(arg0, false, 0);
            int[][] var5 = this.method2328(arg0, false, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            int[] var12 = var5[1];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field2038;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class105.field1630; var63++) {
                    var6[var63] = var10[var63] + var13[var63];
                    var7[var63] = var9[var63] + var12[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class105.field1630; var16++) {
                    var6[var16] = var10[var16] - var13[var16];
                    var7[var16] = var9[var16] - var12[var16];
                    var8[var16] = var11[var16] - var14[var16];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class105.field1630; var17++) {
                    var6[var17] = var10[var17] * var13[var17] >> 12;
                    var7[var17] = var9[var17] * var12[var17] >> 12;
                    var8[var17] = var11[var17] * var14[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var59 = 0; var59 < class105.field1630; var59++) {
                    int var60 = var13[var59];
                    int var61 = var12[var59];
                    int var62 = var14[var59];
                    var6[var59] = var60 == 0 ? 4096 : (var10[var59] << 12) / var60;
                    var7[var59] = var61 == 0 ? 4096 : (var9[var59] << 12) / var61;
                    var8[var59] = var62 == 0 ? 4096 : (var11[var59] << 12) / var62;
                }
            } else if (var15 == 5) {
                for (int var58 = 0; var58 < class105.field1630; var58++) {
                    var6[var58] = 4096 - ((4096 - var10[var58]) * (4096 - var13[var58]) >> 12);
                    var7[var58] = 4096 - ((4096 - var9[var58]) * (4096 - var12[var58]) >> 12);
                    var8[var58] = 4096 - ((4096 - var11[var58]) * (4096 - var14[var58]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var54 = 0; var54 < class105.field1630; var54++) {
                    int var55 = var12[var54];
                    int var56 = var13[var54];
                    int var57 = var14[var54];
                    var6[var54] = var56 >= 2048 ? 4096 - ((4096 - var10[var54]) * (4096 - var56) >> 11) : var10[var54] * var56 >> 11;
                    var7[var54] = var55 < 2048 ? var9[var54] * var55 >> 11 : 4096 - ((4096 - var55) * (4096 - var9[var54]) >> 11);
                    var8[var54] = var57 < 2048 ? var11[var54] * var57 >> 11 : 4096 - ((4096 - var11[var54]) * (4096 - var57) >> 11);
                }
            } else if (var15 == 7) {
                for (int var50 = 0; var50 < class105.field1630; var50++) {
                    int var51 = var11[var50];
                    int var52 = var9[var50];
                    int var53 = var10[var50];
                    var6[var50] = var53 == 4096 ? 4096 : (var13[var50] << 12) / (4096 - var53);
                    var7[var50] = var52 == 4096 ? 4096 : (var12[var50] << 12) / (4096 - var52);
                    var8[var50] = var51 == 4096 ? 4096 : (var14[var50] << 12) / (4096 - var51);
                }
            } else if (var15 == 8) {
                for (int var18 = 0; var18 < class105.field1630; var18++) {
                    int var19 = var9[var18];
                    int var20 = var11[var18];
                    int var21 = var10[var18];
                    var6[var18] = var21 == 0 ? 0 : 4096 - (4096 - var13[var18] << 12) / var21;
                    var7[var18] = var19 == 0 ? 0 : 4096 - ((4096 - var12[var18] << 12) / var19);
                    var8[var18] = var20 == 0 ? 0 : 4096 - ((4096 - var14[var18] << 12) / var20);
                }
            } else if (var15 == 9) {
                for (int var43 = 0; var43 < class105.field1630; var43++) {
                    int var44 = var9[var43];
                    int var45 = var12[var43];
                    int var46 = var10[var43];
                    int var47 = var13[var43];
                    int var48 = var11[var43];
                    int var49 = var14[var43];
                    var6[var43] = var46 >= var47 ? var47 : var46;
                    var7[var43] = var45 <= var44 ? var45 : var44;
                    var8[var43] = var48 < var49 ? var48 : var49;
                }
            } else if (var15 == 10) {
                for (int var22 = 0; var22 < class105.field1630; var22++) {
                    int var23 = var12[var22];
                    int var24 = var10[var22];
                    int var25 = var14[var22];
                    int var26 = var11[var22];
                    int var27 = var9[var22];
                    int var28 = var13[var22];
                    var6[var22] = var28 >= var24 ? var28 : var24;
                    var7[var22] = var23 >= var27 ? var23 : var27;
                    var8[var22] = var26 > var25 ? var26 : var25;
                }
            } else if (var15 == 11) {
                for (int var36 = 0; var36 < class105.field1630; var36++) {
                    int var37 = var11[var36];
                    int var38 = var13[var36];
                    int var39 = var14[var36];
                    int var40 = var9[var36];
                    int var41 = var10[var36];
                    int var42 = var12[var36];
                    var6[var36] = var38 < var41 ? var41 - var38 : -var41 + var38;
                    var7[var36] = var40 <= var42 ? var42 - var40 : -var42 + var40;
                    var8[var36] = var39 >= var37 ? var39 - var37 : -var39 + var37;
                }
            } else if (var15 == 12) {
                for (int var29 = 0; var29 < class105.field1630; var29++) {
                    int var30 = var14[var29];
                    int var31 = var11[var29];
                    int var32 = var13[var29];
                    int var33 = var9[var29];
                    int var34 = var12[var29];
                    int var35 = var10[var29];
                    var6[var29] = var32 + var35 - (var32 * var35 >> 11);
                    var7[var29] = var33 + var34 - (var33 * var34 >> 11);
                    var8[var29] = var30 + var31 - (var30 * var31 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[I", line = 364)
    public final int[] method149(int arg0, int arg1) {
        field2033++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(arg0, true, 0);
            int[] var5 = this.method2330(arg0, true, 1);
            int var6 = this.field2038;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class105.field1630; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class105.field1630; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class105.field1630; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class105.field1630; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var26 = 0; var26 < class105.field1630; var26++) {
                    var3[var26] = 4096 - ((4096 - var4[var26]) * (4096 - var5[var26]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var24 = 0; var24 < class105.field1630; var24++) {
                    int var25 = var5[var24];
                    var3[var24] = var25 >= 2048 ? 4096 - ((4096 - var25) * (4096 - var4[var24]) >> 11) : var4[var24] * var25 >> 11;
                }
            } else if (var6 == 7) {
                for (int var22 = 0; var22 < class105.field1630; var22++) {
                    int var23 = var4[var22];
                    var3[var22] = var23 == 4096 ? 4096 : (var5[var22] << 12) / (4096 - var23);
                }
            } else if (var6 == 8) {
                for (int var20 = 0; var20 < class105.field1630; var20++) {
                    int var21 = var4[var20];
                    var3[var20] = var21 == 0 ? 0 : 4096 - ((4096 - var5[var20] << 12) / var21);
                }
            } else if (var6 == 9) {
                for (int var17 = 0; var17 < class105.field1630; var17++) {
                    int var18 = var4[var17];
                    int var19 = var5[var17];
                    var3[var17] = var19 > var18 ? var18 : var19;
                }
            } else if (var6 == 10) {
                for (int var8 = 0; var8 < class105.field1630; var8++) {
                    int var9 = var4[var8];
                    int var10 = var5[var8];
                    var3[var8] = var10 >= var9 ? var10 : var9;
                }
            } else if (var6 == 11) {
                for (int var14 = 0; var14 < class105.field1630; var14++) {
                    int var15 = var4[var14];
                    int var16 = var5[var14];
                    var3[var14] = var15 <= var16 ? var16 - var15 : -var16 + var15;
                }
            } else if (var6 == 12) {
                for (int var11 = 0; var11 < class105.field1630; var11++) {
                    int var12 = var4[var11];
                    int var13 = var5[var11];
                    var3[var11] = var12 + var13 - (var12 * var13 >> 11);
                }
            }
        }
        if (arg1 != 621) {
            field2045 = (class249) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILkh;I)V", line = 614)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field2039++;
        if (arg2 <= 51) {
            return;
        }
        if (arg0 == 0) {
            this.field2038 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field5234 = arg1.method1178(0) == 1;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 651)
    public class130() {
        super(2, false);
    }
}
