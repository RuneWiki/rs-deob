import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class248 extends class313 {

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    private int field4024 = 6;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public static int field4020 = 1;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    public static int field4034 = 0;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "[Llg;")
    public static class137[] field4032;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)[I", line = 5)
    public final int[] method111(int arg0, int arg1) {
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        field4021++;
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(0, true, arg1);
            int[] var5 = this.method2156(1, true, arg1);
            int var6 = this.field4024;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class133.field2269; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class133.field2269; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var28 = 0; var28 < class133.field2269; var28++) {
                    var3[var28] = var4[var28] * var5[var28] >> 12;
                }
            } else if (var6 == 4) {
                for (int var7 = 0; var7 < class133.field2269; var7++) {
                    int var8 = var5[var7];
                    var3[var7] = var8 == 0 ? 4096 : (var4[var7] << 12) / var8;
                }
            } else if (var6 == 5) {
                for (int var27 = 0; var27 < class133.field2269; var27++) {
                    var3[var27] = 4096 - ((4096 - var4[var27]) * (4096 - var5[var27]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var25 = 0; var25 < class133.field2269; var25++) {
                    int var26 = var5[var25];
                    var3[var25] = var26 < 2048 ? var4[var25] * var26 >> 11 : 4096 - ((4096 - var4[var25]) * (4096 - var26) >> 11);
                }
            } else if (var6 == 7) {
                for (int var9 = 0; var9 < class133.field2269; var9++) {
                    int var10 = var4[var9];
                    var3[var9] = var10 == 4096 ? 4096 : (var5[var9] << 12) / (4096 - var10);
                }
            } else if (var6 == 8) {
                for (int var11 = 0; var11 < class133.field2269; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 0 ? 0 : 4096 - ((4096 - var5[var11] << 12) / var12);
                }
            } else if (var6 == 9) {
                for (int var13 = 0; var13 < class133.field2269; var13++) {
                    int var14 = var4[var13];
                    int var15 = var5[var13];
                    var3[var13] = var15 > var14 ? var14 : var15;
                }
            } else if (var6 == 10) {
                for (int var16 = 0; var16 < class133.field2269; var16++) {
                    int var17 = var5[var16];
                    int var18 = var4[var16];
                    var3[var16] = var18 <= var17 ? var17 : var18;
                }
            } else if (var6 == 11) {
                for (int var19 = 0; var19 < class133.field2269; var19++) {
                    int var20 = var4[var19];
                    int var21 = var5[var19];
                    var3[var19] = var21 < var20 ? var20 - var21 : -var20 + var21;
                }
            } else if (var6 == 12) {
                for (int var22 = 0; var22 < class133.field2269; var22++) {
                    int var23 = var5[var22];
                    int var24 = var4[var22];
                    var3[var22] = var24 + var23 - (var23 * var24 >> 11);
                }
            }
        }
        return arg0 == 4 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V", line = 254)
    public static final void method1740(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            method1743(-40, 11, -28, -12, 93);
        }
        if (arg2 >= arg3) {
            class317.method2184(arg2, (byte) 117, class64.field1007[arg1], arg4, arg3);
        } else {
            class317.method2184(arg3, (byte) 109, class64.field1007[arg1], arg4, arg2);
        }
        field4026++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BILcg;)Ln;", line = 275)
    public static final class309 method1741(byte arg0, int arg1, class49 arg2) {
        field4023++;
        if (arg0 != 116) {
            field4032 = (class137[]) null;
        }
        return class160.method1276((byte) -28, arg1, arg2) ? class325.method2259((byte) 112) : null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)[[I", line = 291)
    public final int[][] method299(int arg0, int arg1) {
        if (arg1 != 2) {
            field4029 = -54;
        }
        field4022++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 119);
        if (this.field4958.field5463) {
            int[][] var4 = this.method2161(0, 4, arg0);
            int[][] var5 = this.method2161(1, arg1 + 2, arg0);
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var3[1];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4024;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class133.field2269; var63++) {
                    var7[var63] = var9[var63] + var12[var63];
                    var11[var63] = var6[var63] + var13[var63];
                    var8[var63] = var10[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class133.field2269; var62++) {
                    var7[var62] = var9[var62] - var12[var62];
                    var11[var62] = var6[var62] - var13[var62];
                    var8[var62] = var10[var62] - var14[var62];
                }
            } else if (var15 == 3) {
                for (int var61 = 0; var61 < class133.field2269; var61++) {
                    var7[var61] = var9[var61] * var12[var61] >> 12;
                    var11[var61] = var6[var61] * var13[var61] >> 12;
                    var8[var61] = var10[var61] * var14[var61] >> 12;
                }
            } else if (var15 == 4) {
                for (int var16 = 0; var16 < class133.field2269; var16++) {
                    int var17 = var12[var16];
                    int var18 = var13[var16];
                    int var19 = var14[var16];
                    var7[var16] = var17 == 0 ? 4096 : (var9[var16] << 12) / var17;
                    var11[var16] = var18 == 0 ? 4096 : (var6[var16] << 12) / var18;
                    var8[var16] = var19 == 0 ? 4096 : (var10[var16] << 12) / var19;
                }
            } else if (var15 == 5) {
                for (int var20 = 0; var20 < class133.field2269; var20++) {
                    var7[var20] = 4096 - ((4096 - var9[var20]) * (4096 - var12[var20]) >> 12);
                    var11[var20] = 4096 - ((4096 - var6[var20]) * (4096 - var13[var20]) >> 12);
                    var8[var20] = 4096 - ((4096 - var10[var20]) * (4096 - var14[var20]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var57 = 0; var57 < class133.field2269; var57++) {
                    int var58 = var14[var57];
                    int var59 = var13[var57];
                    int var60 = var12[var57];
                    var7[var57] = var60 < 2048 ? var9[var57] * var60 >> 11 : 4096 - ((4096 - var9[var57]) * (4096 - var60) >> 11);
                    var11[var57] = var59 < 2048 ? var6[var57] * var59 >> 11 : 4096 - ((4096 - var6[var57]) * (4096 - var59) >> 11);
                    var8[var57] = var58 >= 2048 ? 4096 - ((4096 - var58) * (4096 - var10[var57]) >> 11) : var10[var57] * var58 >> 11;
                }
            } else if (var15 == 7) {
                for (int var53 = 0; var53 < class133.field2269; var53++) {
                    int var54 = var6[var53];
                    int var55 = var10[var53];
                    int var56 = var9[var53];
                    var7[var53] = var56 == 4096 ? 4096 : (var12[var53] << 12) / (4096 - var56);
                    var11[var53] = var54 == 4096 ? 4096 : (var13[var53] << 12) / (4096 - var54);
                    var8[var53] = var55 == 4096 ? 4096 : (var14[var53] << 12) / (4096 - var55);
                }
            } else if (var15 == 8) {
                for (int var49 = 0; var49 < class133.field2269; var49++) {
                    int var50 = var9[var49];
                    int var51 = var10[var49];
                    int var52 = var6[var49];
                    var7[var49] = var50 == 0 ? 0 : 4096 - (4096 - var12[var49] << 12) / var50;
                    var11[var49] = var52 == 0 ? 0 : 4096 - ((4096 - var13[var49] << 12) / var52);
                    var8[var49] = var51 == 0 ? 0 : 4096 - ((4096 - var14[var49] << 12) / var51);
                }
            } else if (var15 == 9) {
                for (int var21 = 0; var21 < class133.field2269; var21++) {
                    int var22 = var12[var21];
                    int var23 = var14[var21];
                    int var24 = var10[var21];
                    int var25 = var9[var21];
                    int var26 = var13[var21];
                    int var27 = var6[var21];
                    var7[var21] = var22 <= var25 ? var22 : var25;
                    var11[var21] = var26 <= var27 ? var26 : var27;
                    var8[var21] = var24 >= var23 ? var23 : var24;
                }
            } else if (var15 == 10) {
                for (int var42 = 0; var42 < class133.field2269; var42++) {
                    int var43 = var9[var42];
                    int var44 = var12[var42];
                    int var45 = var13[var42];
                    int var46 = var10[var42];
                    int var47 = var6[var42];
                    int var48 = var14[var42];
                    var7[var42] = var44 < var43 ? var43 : var44;
                    var11[var42] = var47 <= var45 ? var45 : var47;
                    var8[var42] = var48 < var46 ? var46 : var48;
                }
            } else if (var15 == 11) {
                for (int var28 = 0; var28 < class133.field2269; var28++) {
                    int var29 = var13[var28];
                    int var30 = var6[var28];
                    int var31 = var9[var28];
                    int var32 = var14[var28];
                    int var33 = var10[var28];
                    int var34 = var12[var28];
                    var7[var28] = var31 <= var34 ? var34 - var31 : -var34 + var31;
                    var11[var28] = var29 >= var30 ? var29 - var30 : -var29 + var30;
                    var8[var28] = var32 < var33 ? var33 - var32 : -var33 + var32;
                }
            } else if (var15 == 12) {
                for (int var35 = 0; var35 < class133.field2269; var35++) {
                    int var36 = var14[var35];
                    int var37 = var10[var35];
                    int var38 = var9[var35];
                    int var39 = var13[var35];
                    int var40 = var6[var35];
                    int var41 = var12[var35];
                    var7[var35] = var38 + var41 - (var38 * var41 >> 11);
                    var11[var35] = var39 + var40 - (var39 * var40 >> 11);
                    var8[var35] = var37 + var36 - (var36 * var37 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILcg;I)Lwb;", line = 606)
    public static final class171 method1742(int arg0, class49 arg1, int arg2) {
        field4031++;
        if (class160.method1276((byte) -28, arg0, arg1)) {
            if (arg2 != 9581) {
                field4029 = 2;
            }
            return class58.method525(-79);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 662)
    public class248() {
        super(2, false);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIIII)V", line = 626)
    public static final void method1743(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < arg4) {
            for (int var5 = arg0; var5 < arg4; var5++) {
                class64.field1007[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg4; var6 < arg0; var6++) {
                class64.field1007[var6][arg3] = arg1;
            }
        }
        if (arg2 >= 83) {
            field4033++;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V", line = 673)
    public static void method1744(byte arg0) {
        if (arg0 <= 94) {
            field4032 = (class137[]) null;
        }
        field4032 = null;
    }

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)V", line = 683)
    public static final void method1745(int arg0) {
        field4030++;
        if (arg0 <= 20) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class104.field1745[var1] = false;
        }
        class191.field3194 = 1;
        class303.field4789 = 0;
        class213.field3586 = -1;
        class286.field4550 = 0;
        class277.field4402 = -1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILpi;)V", line = 717)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field4024 = arg2.method2364(arg1 ^ 0x66DB);
        } else if (arg0 == 1) {
            this.field4968 = arg2.method2364(-9069) == 1;
        }
        field4025++;
        if (arg1 != -17848) {
            this.method299(-114, 59);
        }
    }
}
