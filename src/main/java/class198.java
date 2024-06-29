import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class198 extends class16 {

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "I")
    private int field3253 = 6;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    public static int field3247 = 0;

    @OriginalMember(owner = "client!nm", name = "bb", descriptor = "I")
    public static int field3256 = 0;

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "Ljava/lang/String;")
    public static String field3252 = "skill: ";

    @OriginalMember(owner = "client!nm", name = "cb", descriptor = "[J")
    public static long[] field3257 = new long[32];

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    public static int field3248 = -1;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!nm", name = "ab", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!nm", name = "db", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!nm", name = "eb", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!nm", name = "fb", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!nm", name = "gb", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!nm", name = "Z", descriptor = "[I")
    public static int[] field3254;

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 7)
    public class198() {
        super(2, false);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lkb;ILkb;)V", line = 11)
    public static final void method1444(class39 arg0, int arg1, class39 arg2) {
        field3245++;
        class225.field3582 = arg0;
        if (arg1 >= -49) {
            field3256 = -13;
        }
        class219.field3511 = arg2;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIIIZI)V", line = 23)
    public static final void method1445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field3261++;
        if (arg0 == arg1 && arg2 == arg3 && arg5 == arg7 && arg4 == arg6) {
            class251.method1774(arg0, arg6, arg7, arg3, arg9, 24687);
        } else {
            int var10 = arg0;
            int var11 = arg3;
            int var12 = arg0 * 3;
            int var13 = arg1 * 3;
            int var14 = arg2 * 3;
            int var15 = arg3 * 3;
            int var16 = arg5 * 3;
            int var17 = arg4 * 3;
            int var18 = var14 + arg6 - var17 - arg3;
            int var19 = var16 + var12 - var13 - var13;
            int var20 = arg7 + var13 - var16 - arg0;
            int var21 = var15 + var17 - var14 - var14;
            int var22 = var13 - var12;
            int var23 = var14 - var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var26;
                int var28 = var19 * var25;
                int var29 = var21 * var25;
                int var30 = var22 * var24;
                int var31 = var18 * var26;
                int var32 = var23 * var24;
                int var33 = arg0 + (var27 - (-var28 - var30) >> 12);
                int var34 = arg3 + (var29 + var32 + var31 >> 12);
                class251.method1774(var10, var34, var33, var11, arg9, 24687);
                var11 = var34;
                var10 = var33;
            }
        }
        if (!arg8) {
            method1449((int[][]) ((int[][]) null), 20);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIBII)V", line = 100)
    public static final void method1446(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class140.field2086; var5++) {
            if ((class283.field4466[var5] + class192.field3135[var5]) > arg0 && arg0 + arg4 > class192.field3135[var5] && class48.field647[var5] + class210.field3433[var5] > arg1 && arg1 + arg3 > class48.field647[var5]) {
                class237.field3748[var5] = true;
            }
        }
        field3255++;
        if (arg2 > -74) {
            field3256 = -34;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLim;I)V", line = 143)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field3249++;
        if (arg0 != -7) {
            field3257 = (long[]) null;
        }
        if (arg2 == 0) {
            this.field3253 = arg1.method1399(arg0 - 1172389777);
        } else if (arg2 == 1) {
            this.field191 = arg1.method1399(-1172389784) == 1;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V", line = 179)
    public static final void method1447(int arg0, int arg1) {
        field3251++;
        class179 var2 = class319.method2220(arg0, (byte) -69, arg1);
        var2.method1239(true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)[[I", line = 192)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = 34 % ((arg1 - 40) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int[][] var5 = this.method111(0, (byte) 122, arg0);
            int[][] var6 = this.method111(1, (byte) 122, arg0);
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var4[0];
            int[] var10 = var5[1];
            int[] var11 = var5[0];
            int[] var12 = var6[0];
            int[] var13 = var6[1];
            int[] var14 = var5[2];
            int[] var15 = var6[2];
            int var16 = this.field3253;
            if (var16 == 1) {
                for (int var64 = 0; var64 < class276.field4376; var64++) {
                    var9[var64] = var11[var64] + var12[var64];
                    var7[var64] = var10[var64] + var13[var64];
                    var8[var64] = var14[var64] + var15[var64];
                }
            } else if (var16 == 2) {
                for (int var63 = 0; var63 < class276.field4376; var63++) {
                    var9[var63] = var11[var63] - var12[var63];
                    var7[var63] = var10[var63] - var13[var63];
                    var8[var63] = var14[var63] - var15[var63];
                }
            } else if (var16 == 3) {
                for (int var62 = 0; var62 < class276.field4376; var62++) {
                    var9[var62] = var11[var62] * var12[var62] >> 12;
                    var7[var62] = var10[var62] * var13[var62] >> 12;
                    var8[var62] = var14[var62] * var15[var62] >> 12;
                }
            } else if (var16 == 4) {
                for (int var17 = 0; var17 < class276.field4376; var17++) {
                    int var18 = var13[var17];
                    int var19 = var15[var17];
                    int var20 = var12[var17];
                    var9[var17] = var20 == 0 ? 4096 : (var11[var17] << 12) / var20;
                    var7[var17] = var18 == 0 ? 4096 : (var10[var17] << 12) / var18;
                    var8[var17] = var19 == 0 ? 4096 : (var14[var17] << 12) / var19;
                }
            } else if (var16 == 5) {
                for (int var61 = 0; var61 < class276.field4376; var61++) {
                    var9[var61] = 4096 - ((4096 - var11[var61]) * (4096 - var12[var61]) >> 12);
                    var7[var61] = 4096 - ((4096 - var10[var61]) * (4096 - var13[var61]) >> 12);
                    var8[var61] = 4096 - ((4096 - var14[var61]) * (4096 - var15[var61]) >> 12);
                }
            } else if (var16 == 6) {
                for (int var21 = 0; var21 < class276.field4376; var21++) {
                    int var22 = var13[var21];
                    int var23 = var12[var21];
                    int var24 = var15[var21];
                    var9[var21] = var23 >= 2048 ? 4096 - ((4096 - var11[var21]) * (4096 - var23) >> 11) : var11[var21] * var23 >> 11;
                    var7[var21] = var22 < 2048 ? var10[var21] * var22 >> 11 : 4096 - ((4096 - var10[var21]) * (4096 - var22) >> 11);
                    var8[var21] = var24 >= 2048 ? 4096 - ((4096 - var14[var21]) * (4096 - var24) >> 11) : var14[var21] * var24 >> 11;
                }
            } else if (var16 == 7) {
                for (int var57 = 0; var57 < class276.field4376; var57++) {
                    int var58 = var11[var57];
                    int var59 = var14[var57];
                    int var60 = var10[var57];
                    var9[var57] = var58 == 4096 ? 4096 : (var12[var57] << 12) / (4096 - var58);
                    var7[var57] = var60 == 4096 ? 4096 : (var13[var57] << 12) / (4096 - var60);
                    var8[var57] = var59 == 4096 ? 4096 : (var15[var57] << 12) / (4096 - var59);
                }
            } else if (var16 == 8) {
                for (int var25 = 0; var25 < class276.field4376; var25++) {
                    int var26 = var11[var25];
                    int var27 = var14[var25];
                    int var28 = var10[var25];
                    var9[var25] = var26 == 0 ? 0 : 4096 - (4096 - var12[var25] << 12) / var26;
                    var7[var25] = var28 == 0 ? 0 : 4096 - ((4096 - var13[var25] << 12) / var28);
                    var8[var25] = var27 == 0 ? 0 : 4096 - ((4096 - var15[var25] << 12) / var27);
                }
            } else if (var16 == 9) {
                for (int var29 = 0; var29 < class276.field4376; var29++) {
                    int var30 = var13[var29];
                    int var31 = var11[var29];
                    int var32 = var10[var29];
                    int var33 = var15[var29];
                    int var34 = var12[var29];
                    int var35 = var14[var29];
                    var9[var29] = var34 > var31 ? var31 : var34;
                    var7[var29] = var30 <= var32 ? var30 : var32;
                    var8[var29] = var33 <= var35 ? var33 : var35;
                }
            } else if (var16 == 10) {
                for (int var50 = 0; var50 < class276.field4376; var50++) {
                    int var51 = var11[var50];
                    int var52 = var14[var50];
                    int var53 = var15[var50];
                    int var54 = var13[var50];
                    int var55 = var10[var50];
                    int var56 = var12[var50];
                    var9[var50] = var56 >= var51 ? var56 : var51;
                    var7[var50] = var54 < var55 ? var55 : var54;
                    var8[var50] = var53 < var52 ? var52 : var53;
                }
            } else if (var16 == 11) {
                for (int var36 = 0; var36 < class276.field4376; var36++) {
                    int var37 = var15[var36];
                    int var38 = var11[var36];
                    int var39 = var14[var36];
                    int var40 = var10[var36];
                    int var41 = var12[var36];
                    int var42 = var13[var36];
                    var9[var36] = var38 <= var41 ? var41 - var38 : -var41 + var38;
                    var7[var36] = var42 >= var40 ? var42 - var40 : -var42 + var40;
                    var8[var36] = var37 < var39 ? var39 - var37 : -var39 + var37;
                }
            } else if (var16 == 12) {
                for (int var43 = 0; var43 < class276.field4376; var43++) {
                    int var44 = var11[var43];
                    int var45 = var12[var43];
                    int var46 = var10[var43];
                    int var47 = var14[var43];
                    int var48 = var15[var43];
                    int var49 = var13[var43];
                    var9[var43] = var44 + var45 - (var44 * var45 >> 11);
                    var7[var43] = var49 + var46 - (var46 * var49 >> 11);
                    var8[var43] = var47 + var48 - (var47 * var48 >> 11);
                }
            }
        }
        field3250++;
        return var4;
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V", line = 506)
    public static void method1448(int arg0) {
        field3252 = null;
        if (arg0 < -50) {
            field3257 = null;
            field3254 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([[II)V", line = 520)
    public static final void method1449(int[][] arg0, int arg1) {
        class310.field4841 = arg0;
        if (arg1 == 3) {
            field3259++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(ZI)[I", line = 532)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            this.field3253 = 0;
        }
        field3260++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int[] var4 = this.method103(0, 4389, arg1);
            int[] var5 = this.method103(1, 4389, arg1);
            int var6 = this.field3253;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class276.field4376; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class276.field4376; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var28 = 0; var28 < class276.field4376; var28++) {
                    var3[var28] = var4[var28] * var5[var28] >> 12;
                }
            } else if (var6 == 4) {
                for (int var26 = 0; var26 < class276.field4376; var26++) {
                    int var27 = var5[var26];
                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                }
            } else if (var6 == 5) {
                for (int var25 = 0; var25 < class276.field4376; var25++) {
                    var3[var25] = 4096 - ((4096 - var4[var25]) * (4096 - var5[var25]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var7 = 0; var7 < class276.field4376; var7++) {
                    int var8 = var5[var7];
                    var3[var7] = var8 < 2048 ? var4[var7] * var8 >> 11 : 4096 - ((4096 - var4[var7]) * (4096 - var8) >> 11);
                }
            } else if (var6 == 7) {
                for (int var9 = 0; var9 < class276.field4376; var9++) {
                    int var10 = var4[var9];
                    var3[var9] = var10 == 4096 ? 4096 : (var5[var9] << 12) / (4096 - var10);
                }
            } else if (var6 == 8) {
                for (int var23 = 0; var23 < class276.field4376; var23++) {
                    int var24 = var4[var23];
                    var3[var23] = var24 == 0 ? 0 : 4096 - ((4096 - var5[var23] << 12) / var24);
                }
            } else if (var6 == 9) {
                for (int var20 = 0; var20 < class276.field4376; var20++) {
                    int var21 = var5[var20];
                    int var22 = var4[var20];
                    var3[var20] = var21 > var22 ? var22 : var21;
                }
            } else if (var6 == 10) {
                for (int var11 = 0; var11 < class276.field4376; var11++) {
                    int var12 = var5[var11];
                    int var13 = var4[var11];
                    var3[var11] = var12 >= var13 ? var12 : var13;
                }
            } else if (var6 == 11) {
                for (int var17 = 0; var17 < class276.field4376; var17++) {
                    int var18 = var4[var17];
                    int var19 = var5[var17];
                    var3[var17] = var18 <= var19 ? var19 - var18 : -var19 + var18;
                }
            } else if (var6 == 12) {
                for (int var14 = 0; var14 < class276.field4376; var14++) {
                    int var15 = var4[var14];
                    int var16 = var5[var14];
                    var3[var14] = var15 + var16 - (var15 * var16 >> 11);
                }
            }
        }
        return var3;
    }
}
