import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class297 extends class273 {

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    private int field4551 = 6;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field4559 = 0;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "Z")
    public static boolean field4556 = true;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "Lwf;")
    public static class306 field4554;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "[I")
    public static int[] field4547;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/lang/StringBuffer;IC)Ljava/lang/StringBuffer;", line = 4)
    public static final StringBuffer method1947(int arg0, StringBuffer arg1, int arg2, char arg3) {
        field4549++;
        int var4 = arg1.length();
        arg1.setLength(arg2);
        if (arg0 == -25053) {
            for (int var5 = var4; var5 < arg2; var5++) {
                arg1.setCharAt(var5, arg3);
            }
            return arg1;
        } else {
            return (StringBuffer) null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BILgn;)V", line = 25)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field4552++;
        if (arg0 < 27) {
            field4547 = (int[]) null;
        }
        if (arg1 == 0) {
            this.field4551 = arg2.method2043((byte) -110);
        } else if (arg1 == 1) {
            this.field4194 = arg2.method2043((byte) -106) == 1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[B)[B", line = 62)
    public static final byte[] method1948(int arg0, byte[] arg1) {
        field4553++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class223.method1501(arg1, arg0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V", line = 81)
    public static void method1949(int arg0) {
        field4547 = null;
        if (arg0 == 2) {
            field4554 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 346)
    public class297() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I", line = 100)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            method1948(109, (byte[]) null);
        }
        field4548++;
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int[] var4 = this.method1790(0, arg0, 0);
            int[] var5 = this.method1790(1, arg0, 0);
            int var6 = this.field4551;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class27.field346; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class27.field346; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class27.field346; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class27.field346; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var26 = 0; var26 < class27.field346; var26++) {
                    var3[var26] = 4096 - ((4096 - var5[var26]) * (4096 - var4[var26]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var8 = 0; var8 < class27.field346; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 < 2048 ? var4[var8] * var9 >> 11 : 4096 - ((4096 - var4[var8]) * (4096 - var9) >> 11);
                }
            } else if (var6 == 7) {
                for (int var24 = 0; var24 < class27.field346; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 4096 ? 4096 : (var5[var24] << 12) / (4096 - var25);
                }
            } else if (var6 == 8) {
                for (int var22 = 0; var22 < class27.field346; var22++) {
                    int var23 = var4[var22];
                    var3[var22] = var23 == 0 ? 0 : 4096 - ((4096 - var5[var22] << 12) / var23);
                }
            } else if (var6 == 9) {
                for (int var19 = 0; var19 < class27.field346; var19++) {
                    int var20 = var5[var19];
                    int var21 = var4[var19];
                    var3[var19] = var21 < var20 ? var21 : var20;
                }
            } else if (var6 == 10) {
                for (int var10 = 0; var10 < class27.field346; var10++) {
                    int var11 = var4[var10];
                    int var12 = var5[var10];
                    var3[var10] = var12 >= var11 ? var12 : var11;
                }
            } else if (var6 == 11) {
                for (int var13 = 0; var13 < class27.field346; var13++) {
                    int var14 = var4[var13];
                    int var15 = var5[var13];
                    var3[var13] = var15 >= var14 ? var15 - var14 : -var15 + var14;
                }
            } else if (var6 == 12) {
                for (int var16 = 0; var16 < class27.field346; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var17 + var18 - (var17 * var18 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)I", line = 353)
    public static final int method1950(byte arg0) {
        field4558++;
        int var1 = 0 % ((-arg0 - 43) / 62);
        return ((class34.field441 == 0 ? 0 : 1) << 20) + ((class187.field2843 ? 1 : 0) << 16) + ((field4556 ? 1 : 0) << 15) + ((class90.field1382 & 0x3) << 11) + ((class124.field1935 ? 1 : 0) << 9) + ((class318.field4986 ? 1 : 0) << 8) + ((class188.field2856 ? 1 : 0) << 7) + ((class233.field3752 ? 1 : 0) << 4) + (((class82.field1226 ? 1 : 0) << 3) + (class88.field1322 & 0x7) - -((class317.field4985 ? 1 : 0) << 5)) - (-((class275.field4239 ? 1 : 0) << 6) + -((class155.field2434 ? 1 : 0) << 10) - ((class192.field2903 ? 1 : 0) << 13) - ((class338.field5235 << 17) + ((class269.field4148 ? 1 : 0) << 19)) - (((class334.field5199 == 0 ? 0 : 1) << 21) - (-((class274.field4219 == 0 ? 0 : 1) << 22) - (class243.method1654() << 23))));
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[[I", line = 364)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            this.method170(76, (byte) -79);
        }
        field4555++;
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147) {
            int[][] var4 = this.method1795(arg0, -124, 0);
            int[][] var5 = this.method1795(arg0, arg1 ^ 0xFFFFFFC0, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[1];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field4551;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class27.field346; var16++) {
                    var7[var16] = var9[var16] + var13[var16];
                    var6[var16] = var10[var16] + var12[var16];
                    var8[var16] = var11[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var17 = 0; var17 < class27.field346; var17++) {
                    var7[var17] = var9[var17] - var13[var17];
                    var6[var17] = var10[var17] - var12[var17];
                    var8[var17] = var11[var17] - var14[var17];
                }
            } else if (var15 == 3) {
                for (int var18 = 0; var18 < class27.field346; var18++) {
                    var7[var18] = var9[var18] * var13[var18] >> 12;
                    var6[var18] = var10[var18] * var12[var18] >> 12;
                    var8[var18] = var11[var18] * var14[var18] >> 12;
                }
            } else if (var15 == 4) {
                for (int var19 = 0; var19 < class27.field346; var19++) {
                    int var20 = var14[var19];
                    int var21 = var12[var19];
                    int var22 = var13[var19];
                    var7[var19] = var22 == 0 ? 4096 : (var9[var19] << 12) / var22;
                    var6[var19] = var21 == 0 ? 4096 : (var10[var19] << 12) / var21;
                    var8[var19] = var20 == 0 ? 4096 : (var11[var19] << 12) / var20;
                }
            } else if (var15 == 5) {
                for (int var23 = 0; var23 < class27.field346; var23++) {
                    var7[var23] = 4096 - ((4096 - var13[var23]) * (4096 - var9[var23]) >> 12);
                    var6[var23] = 4096 - ((4096 - var10[var23]) * (4096 - var12[var23]) >> 12);
                    var8[var23] = 4096 - ((4096 - var11[var23]) * (4096 - var14[var23]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var24 = 0; var24 < class27.field346; var24++) {
                    int var25 = var13[var24];
                    int var26 = var12[var24];
                    int var27 = var14[var24];
                    var7[var24] = var25 < 2048 ? var9[var24] * var25 >> 11 : 4096 - ((4096 - var9[var24]) * (4096 - var25) >> 11);
                    var6[var24] = var26 >= 2048 ? 4096 - ((4096 - var26) * (4096 - var10[var24]) >> 11) : var10[var24] * var26 >> 11;
                    var8[var24] = var27 >= 2048 ? 4096 - ((4096 - var11[var24]) * (4096 - var27) >> 11) : var11[var24] * var27 >> 11;
                }
            } else if (var15 == 7) {
                for (int var28 = 0; var28 < class27.field346; var28++) {
                    int var29 = var9[var28];
                    int var30 = var11[var28];
                    int var31 = var10[var28];
                    var7[var28] = var29 == 4096 ? 4096 : (var13[var28] << 12) / (4096 - var29);
                    var6[var28] = var31 == 4096 ? 4096 : (var12[var28] << 12) / (4096 - var31);
                    var8[var28] = var30 == 4096 ? 4096 : (var14[var28] << 12) / (4096 - var30);
                }
            } else if (var15 == 8) {
                for (int var60 = 0; var60 < class27.field346; var60++) {
                    int var61 = var10[var60];
                    int var62 = var9[var60];
                    int var63 = var11[var60];
                    var7[var60] = var62 == 0 ? 0 : 4096 - ((4096 - var13[var60] << 12) / var62);
                    var6[var60] = var61 == 0 ? 0 : 4096 - ((4096 - var12[var60] << 12) / var61);
                    var8[var60] = var63 == 0 ? 0 : 4096 - ((4096 - var14[var60] << 12) / var63);
                }
            } else if (var15 == 9) {
                for (int var53 = 0; var53 < class27.field346; var53++) {
                    int var54 = var9[var53];
                    int var55 = var10[var53];
                    int var56 = var14[var53];
                    int var57 = var11[var53];
                    int var58 = var12[var53];
                    int var59 = var13[var53];
                    var7[var53] = var59 <= var54 ? var59 : var54;
                    var6[var53] = var55 < var58 ? var55 : var58;
                    var8[var53] = var56 > var57 ? var57 : var56;
                }
            } else if (var15 == 10) {
                for (int var32 = 0; var32 < class27.field346; var32++) {
                    int var33 = var10[var32];
                    int var34 = var13[var32];
                    int var35 = var14[var32];
                    int var36 = var11[var32];
                    int var37 = var9[var32];
                    int var38 = var12[var32];
                    var7[var32] = var37 <= var34 ? var34 : var37;
                    var6[var32] = var38 < var33 ? var33 : var38;
                    var8[var32] = var36 <= var35 ? var35 : var36;
                }
            } else if (var15 == 11) {
                for (int var46 = 0; var46 < class27.field346; var46++) {
                    int var47 = var14[var46];
                    int var48 = var10[var46];
                    int var49 = var12[var46];
                    int var50 = var11[var46];
                    int var51 = var9[var46];
                    int var52 = var13[var46];
                    var7[var46] = var52 < var51 ? var51 - var52 : -var51 + var52;
                    var6[var46] = var49 < var48 ? var48 - var49 : -var48 + var49;
                    var8[var46] = var47 >= var50 ? var47 - var50 : -var47 + var50;
                }
            } else if (var15 == 12) {
                for (int var39 = 0; var39 < class27.field346; var39++) {
                    int var40 = var13[var39];
                    int var41 = var12[var39];
                    int var42 = var11[var39];
                    int var43 = var10[var39];
                    int var44 = var14[var39];
                    int var45 = var9[var39];
                    var7[var39] = var40 + var45 - (var40 * var45 >> 11);
                    var6[var39] = var41 + var43 - (var41 * var43 >> 11);
                    var8[var39] = var42 + var44 - (var42 * var44 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IC)Z", line = 677)
    public static final boolean method1951(int arg0, char arg1) {
        int var2 = 66 % ((arg0 + 37) / 36);
        field4557++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            int var3 = 0;
            char[] var4 = class4.field44;
            while (var4.length > var3) {
                char var5 = var4[var3];
                if (arg1 == var5) {
                    return true;
                }
                var3++;
            }
        }
        return false;
    }
}
