import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class19 extends class152 {

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    private int field263 = 6;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "[I")
    public static int[] field254 = new int[32];

    @OriginalMember(owner = "client!be", name = "W", descriptor = "Lce;")
    public static class126 field256 = class206.method1445(-7923, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "Lkj;")
    public static class241 field259 = new class241();

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    public static int field262 = 0;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "Lce;")
    public static class126 field264 = class206.method1445(-7923, "Fermer");

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "Lce;")
    public static class126 field261 = class206.method1445(-7923, "0");

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "Lclient;")
    public static client field260;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "[Lie;")
    public static class2[] field265;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILbb;)V", line = 5)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field258++;
        if (arg0 != 8) {
            this.method6(false, 22);
        }
        if (arg1 == 0) {
            this.field263 = arg2.method948(arg0 ^ 0xFFFFFF8F);
        } else if (arg1 == 1) {
            this.field2781 = arg2.method948(arg0 ^ -120) == 1;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 41)
    public class19() {
        super(2, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II[Lsh;IZII[BIII)V", line = 52)
    public static final void method101(int arg0, int arg1, class32[] arg2, int arg3, boolean arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        field255++;
        class134 var11 = new class134(arg7);
        int var12 = 13 % ((35 - arg10) / 44);
        int var13 = -1;
        while (true) {
            int var14 = var11.method961(1153370960);
            if (var14 == 0) {
                return;
            }
            int var15 = 0;
            var13 += var14;
            while (true) {
                int var16 = var11.method930(-15535);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 >> 12;
                int var18 = var15 & 0x3F;
                int var19 = var11.method948(-122);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                int var22 = var15 >> 6 & 0x3F;
                if (arg8 == var17 && arg6 <= var22 && var22 < (arg6 + 8) && var18 >= arg0 && (arg0 + 8) > var18) {
                    class265 var23 = class185.method1338(var13, -7153);
                    int var24 = class41.method258((byte) 45, var23.field4452, var22 & 0x7, var23.field4474, var18 & 0x7, var21, arg1) + arg9;
                    int var25 = class307.method2077(var23.field4474, var21, var22 & 0x7, var18 & 0x7, true, arg1, var23.field4452) + arg5;
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        class32 var26 = null;
                        if (!arg4) {
                            int var27 = arg3;
                            if ((class301.field4992[1][var24][var25] & 0x2) == 2) {
                                var27 = arg3 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg2[var27];
                            }
                        }
                        class52.method329(-124, var24, arg3, arg3, var26, var25, var20, arg1 + var21 & 0x3, arg4, var13, !arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V", line = 137)
    public static void method102(int arg0) {
        field260 = null;
        field254 = null;
        if (arg0 != 4096) {
            return;
        }
        field261 = null;
        field265 = null;
        field259 = null;
        field256 = null;
        field264 = null;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(II)[[I", line = 155)
    public final int[][] method26(int arg0, int arg1) {
        field257++;
        if (arg0 != 0) {
            this.field263 = 21;
        }
        int[][] var3 = this.field2775.method319(67, arg1);
        if (this.field2775.field775) {
            int[][] var4 = this.method1133(arg1, 0, true);
            int[][] var5 = this.method1133(arg1, 1, true);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field263;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class244.field4133; var16++) {
                    var6[var16] = var10[var16] + var12[var16];
                    var7[var16] = var9[var16] + var13[var16];
                    var8[var16] = var11[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var17 = 0; var17 < class244.field4133; var17++) {
                    var6[var17] = var10[var17] - var12[var17];
                    var7[var17] = var9[var17] - var13[var17];
                    var8[var17] = var11[var17] - var14[var17];
                }
            } else if (var15 == 3) {
                for (int var18 = 0; var18 < class244.field4133; var18++) {
                    var6[var18] = var10[var18] * var12[var18] >> 12;
                    var7[var18] = var9[var18] * var13[var18] >> 12;
                    var8[var18] = var11[var18] * var14[var18] >> 12;
                }
            } else if (var15 == 4) {
                for (int var60 = 0; var60 < class244.field4133; var60++) {
                    int var61 = var12[var60];
                    int var62 = var13[var60];
                    int var63 = var14[var60];
                    var6[var60] = var61 == 0 ? 4096 : (var10[var60] << 12) / var61;
                    var7[var60] = var62 == 0 ? 4096 : (var9[var60] << 12) / var62;
                    var8[var60] = var63 == 0 ? 4096 : (var11[var60] << 12) / var63;
                }
            } else if (var15 == 5) {
                for (int var59 = 0; var59 < class244.field4133; var59++) {
                    var6[var59] = 4096 - ((4096 - var10[var59]) * (4096 - var12[var59]) >> 12);
                    var7[var59] = 4096 - ((4096 - var9[var59]) * (4096 - var13[var59]) >> 12);
                    var8[var59] = 4096 - ((4096 - var11[var59]) * (4096 - var14[var59]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var55 = 0; var55 < class244.field4133; var55++) {
                    int var56 = var13[var55];
                    int var57 = var14[var55];
                    int var58 = var12[var55];
                    var6[var55] = var58 < 2048 ? var10[var55] * var58 >> 11 : 4096 - ((4096 - var10[var55]) * (4096 - var58) >> 11);
                    var7[var55] = var56 >= 2048 ? 4096 - ((4096 - var9[var55]) * (4096 - var56) >> 11) : var9[var55] * var56 >> 11;
                    var8[var55] = var57 < 2048 ? var11[var55] * var57 >> 11 : 4096 - ((4096 - var11[var55]) * (4096 - var57) >> 11);
                }
            } else if (var15 == 7) {
                for (int var51 = 0; var51 < class244.field4133; var51++) {
                    int var52 = var9[var51];
                    int var53 = var11[var51];
                    int var54 = var10[var51];
                    var6[var51] = var54 == 4096 ? 4096 : (var12[var51] << 12) / (4096 - var54);
                    var7[var51] = var52 == 4096 ? 4096 : (var13[var51] << 12) / (4096 - var52);
                    var8[var51] = var53 == 4096 ? 4096 : (var14[var51] << 12) / (4096 - var53);
                }
            } else if (var15 == 8) {
                for (int var19 = 0; var19 < class244.field4133; var19++) {
                    int var20 = var10[var19];
                    int var21 = var9[var19];
                    int var22 = var11[var19];
                    var6[var19] = var20 == 0 ? 0 : 4096 - ((4096 - var12[var19] << 12) / var20);
                    var7[var19] = var21 == 0 ? 0 : 4096 - (4096 - var13[var19] << 12) / var21;
                    var8[var19] = var22 == 0 ? 0 : 4096 - ((4096 - var14[var19] << 12) / var22);
                }
            } else if (var15 == 9) {
                for (int var23 = 0; var23 < class244.field4133; var23++) {
                    int var24 = var11[var23];
                    int var25 = var13[var23];
                    int var26 = var14[var23];
                    int var27 = var12[var23];
                    int var28 = var10[var23];
                    int var29 = var9[var23];
                    var6[var23] = var27 <= var28 ? var27 : var28;
                    var7[var23] = var29 < var25 ? var29 : var25;
                    var8[var23] = var26 > var24 ? var24 : var26;
                }
            } else if (var15 == 10) {
                for (int var30 = 0; var30 < class244.field4133; var30++) {
                    int var31 = var14[var30];
                    int var32 = var12[var30];
                    int var33 = var9[var30];
                    int var34 = var10[var30];
                    int var35 = var13[var30];
                    int var36 = var11[var30];
                    var6[var30] = var32 < var34 ? var34 : var32;
                    var7[var30] = var33 > var35 ? var33 : var35;
                    var8[var30] = var31 < var36 ? var36 : var31;
                }
            } else if (var15 == 11) {
                for (int var37 = 0; var37 < class244.field4133; var37++) {
                    int var38 = var10[var37];
                    int var39 = var14[var37];
                    int var40 = var13[var37];
                    int var41 = var9[var37];
                    int var42 = var11[var37];
                    int var43 = var12[var37];
                    var6[var37] = var43 < var38 ? var38 - var43 : var43 - var38;
                    var7[var37] = var41 <= var40 ? var40 - var41 : -var40 + var41;
                    var8[var37] = var39 < var42 ? var42 - var39 : -var42 + var39;
                }
            } else if (var15 == 12) {
                for (int var44 = 0; var44 < class244.field4133; var44++) {
                    int var45 = var14[var44];
                    int var46 = var11[var44];
                    int var47 = var9[var44];
                    int var48 = var10[var44];
                    int var49 = var12[var44];
                    int var50 = var13[var44];
                    var6[var44] = var48 + var49 - (var48 * var49 >> 11);
                    var7[var44] = var47 - ((var47 * var50 >> 11) - var50);
                    var8[var44] = var45 + var46 - (var45 * var46 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IJ)V", line = 468)
    public static final void method103(int arg0, long arg1) {
        field251++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 > -93) {
            method102(-83);
        }
        for (int var3 = 0; var3 < class116.field1961; var3++) {
            if (class163.field2922[var3] == arg1) {
                class116.field1961--;
                for (int var4 = var3; var4 < class116.field1961; var4++) {
                    class163.field2922[var4] = class163.field2922[var4 + 1];
                    class112.field1887[var4] = class112.field1887[var4 + 1];
                }
                class187.field3228++;
                class130.field2227 = class50.field777;
                class103.field1645.method1238(120, 97);
                class103.field1645.method962(-125, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)[I", line = 512)
    public final int[] method6(boolean arg0, int arg1) {
        field253++;
        if (!arg0) {
            method103(-59, -127L);
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(arg1, 116, 0);
            int[] var5 = this.method1132(arg1, -118, 1);
            int var6 = this.field263;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class244.field4133; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class244.field4133; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class244.field4133; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class244.field4133; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var26 = 0; var26 < class244.field4133; var26++) {
                    var3[var26] = 4096 - ((4096 - var4[var26]) * (4096 - var5[var26]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var8 = 0; var8 < class244.field4133; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 < 2048 ? var4[var8] * var9 >> 11 : 4096 - ((4096 - var9) * (4096 - var4[var8]) >> 11);
                }
            } else if (var6 == 7) {
                for (int var10 = 0; var10 < class244.field4133; var10++) {
                    int var11 = var4[var10];
                    var3[var10] = var11 == 4096 ? 4096 : (var5[var10] << 12) / (4096 - var11);
                }
            } else if (var6 == 8) {
                for (int var12 = 0; var12 < class244.field4133; var12++) {
                    int var13 = var4[var12];
                    var3[var12] = var13 == 0 ? 0 : 4096 - (4096 - var5[var12] << 12) / var13;
                }
            } else if (var6 == 9) {
                for (int var23 = 0; var23 < class244.field4133; var23++) {
                    int var24 = var5[var23];
                    int var25 = var4[var23];
                    var3[var23] = var25 < var24 ? var25 : var24;
                }
            } else if (var6 == 10) {
                for (int var20 = 0; var20 < class244.field4133; var20++) {
                    int var21 = var4[var20];
                    int var22 = var5[var20];
                    var3[var20] = var22 >= var21 ? var22 : var21;
                }
            } else if (var6 == 11) {
                for (int var14 = 0; var14 < class244.field4133; var14++) {
                    int var15 = var5[var14];
                    int var16 = var4[var14];
                    var3[var14] = var15 >= var16 ? var15 - var16 : -var15 + var16;
                }
            } else if (var6 == 12) {
                for (int var17 = 0; var17 < class244.field4133; var17++) {
                    int var18 = var4[var17];
                    int var19 = var5[var17];
                    var3[var17] = var18 + var19 - (var18 * var19 >> 11);
                }
            }
        }
        return var3;
    }
}
