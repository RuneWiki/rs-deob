import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class131 extends class219 {

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    private int field2368 = 6;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "Lbd;")
    public static class162 field2359 = class17.method142(0, "(U0a )2 in: ");

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field2364 = 0;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "Lbd;")
    public static class162 field2367 = class17.method142(0, "Hidden)2");

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Z")
    public static boolean field2365 = false;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "[Lgg;")
    public static class34[] field2360;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "[[B")
    public static byte[][] field2361;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(ZI)V", line = 6)
    public static final void method1045(boolean arg0, int arg1) {
        if (arg0) {
            field2360 = (class34[]) null;
        }
        field2363++;
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class110.field1973 += arg1 * 128;
        if (class10.field120.length < class110.field1973) {
            class110.field1973 -= class10.field120.length;
            int var3 = (int) (Math.random() * 12.0D);
            class110.method886(true, class266.field4438[var3]);
        }
        int var4 = 0;
        int var5 = (var2 - arg1) * 128;
        int var6 = arg1 * 128;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = class31.field515[var4 + var6] - class10.field120[class10.field120.length - 1 & class110.field1973 + var4] * arg1 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class31.field515[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class31.field515[var10 + var11] = 255;
                } else {
                    class31.field515[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg1); var13++) {
            class183.field3145[var13] = class183.field3145[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class183.field3145[var14] = (int) (Math.sin((double) class74.field1178 / 14.0D) * 16.0D + Math.sin((double) class74.field1178 / 15.0D) * 14.0D + Math.sin((double) class74.field1178 / 16.0D) * 12.0D);
            class74.field1178++;
        }
        class42.field675 += arg1;
        int var15 = ((class90.field1598 & 0x1) + arg1) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class42.field675; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class31.field515[(var18 << 7) + var17] = 192;
        }
        class42.field675 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var22 + var15 < 128) {
                    var20 += class31.field515[var22 + var15 + var21];
                }
                if (var22 - var15 - 1 >= 0) {
                    var20 -= class31.field515[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class264.field4407[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class264.field4407[var23 - (-(var15 * 128) - var26)];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class264.field4407[var23 + var26 - (var15 * 128 - -128)];
                }
                if (var25 >= 0) {
                    class31.field515[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[Lbd;ZI[S)V", line = 178)
    public static final void method1046(int arg0, class162[] arg1, boolean arg2, int arg3, short[] arg4) {
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            class162 var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].method1257(var7, (byte) 62) < (var9 & 0x1)) {
                    class162 var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method1046(var6 - 1, arg1, arg2, arg3, arg4);
            method1046(arg0, arg1, true, var6 + 1, arg4);
        }
        field2362++;
        if (!arg2) {
            method1048((byte) 79);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[[I", line = 238)
    public final int[][] method219(int arg0, byte arg1) {
        if (arg1 != 83) {
            field2365 = false;
        }
        field2357++;
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[][] var4 = this.method1583(arg0, true, 0);
            int[][] var5 = this.method1583(arg0, true, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var5[2];
            int[] var14 = var4[2];
            int var15 = this.field2368;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class128.field2326; var63++) {
                    var6[var63] = var9[var63] + var11[var63];
                    var7[var63] = var10[var63] + var12[var63];
                    var8[var63] = var13[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class128.field2326; var62++) {
                    var6[var62] = var9[var62] - var11[var62];
                    var7[var62] = var10[var62] - var12[var62];
                    var8[var62] = var14[var62] - var13[var62];
                }
            } else if (var15 == 3) {
                for (int var61 = 0; var61 < class128.field2326; var61++) {
                    var6[var61] = var9[var61] * var11[var61] >> 12;
                    var7[var61] = var10[var61] * var12[var61] >> 12;
                    var8[var61] = var13[var61] * var14[var61] >> 12;
                }
            } else if (var15 == 4) {
                for (int var16 = 0; var16 < class128.field2326; var16++) {
                    int var17 = var13[var16];
                    int var18 = var11[var16];
                    int var19 = var12[var16];
                    var6[var16] = var18 == 0 ? 4096 : (var9[var16] << 12) / var18;
                    var7[var16] = var19 == 0 ? 4096 : (var10[var16] << 12) / var19;
                    var8[var16] = var17 == 0 ? 4096 : (var14[var16] << 12) / var17;
                }
            } else if (var15 == 5) {
                for (int var60 = 0; var60 < class128.field2326; var60++) {
                    var6[var60] = 4096 - ((4096 - var9[var60]) * (4096 - var11[var60]) >> 12);
                    var7[var60] = 4096 - ((4096 - var10[var60]) * (4096 - var12[var60]) >> 12);
                    var8[var60] = 4096 - ((4096 - var13[var60]) * (4096 - var14[var60]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var20 = 0; var20 < class128.field2326; var20++) {
                    int var21 = var13[var20];
                    int var22 = var11[var20];
                    int var23 = var12[var20];
                    var6[var20] = var22 >= 2048 ? 4096 - ((4096 - var9[var20]) * (4096 - var22) >> 11) : var9[var20] * var22 >> 11;
                    var7[var20] = var23 < 2048 ? var10[var20] * var23 >> 11 : 4096 - ((4096 - var10[var20]) * (4096 - var23) >> 11);
                    var8[var20] = var21 < 2048 ? var14[var20] * var21 >> 11 : 4096 - ((4096 - var14[var20]) * (4096 - var21) >> 11);
                }
            } else if (var15 == 7) {
                for (int var24 = 0; var24 < class128.field2326; var24++) {
                    int var25 = var10[var24];
                    int var26 = var9[var24];
                    int var27 = var14[var24];
                    var6[var24] = var26 == 4096 ? 4096 : (var11[var24] << 12) / (4096 - var26);
                    var7[var24] = var25 == 4096 ? 4096 : (var12[var24] << 12) / (4096 - var25);
                    var8[var24] = var27 == 4096 ? 4096 : (var13[var24] << 12) / (4096 - var27);
                }
            } else if (var15 == 8) {
                for (int var56 = 0; var56 < class128.field2326; var56++) {
                    int var57 = var10[var56];
                    int var58 = var9[var56];
                    int var59 = var14[var56];
                    var6[var56] = var58 == 0 ? 0 : 4096 - ((4096 - var11[var56] << 12) / var58);
                    var7[var56] = var57 == 0 ? 0 : 4096 - ((4096 - var12[var56] << 12) / var57);
                    var8[var56] = var59 == 0 ? 0 : 4096 - (4096 - var13[var56] << 12) / var59;
                }
            } else if (var15 == 9) {
                for (int var49 = 0; var49 < class128.field2326; var49++) {
                    int var50 = var14[var49];
                    int var51 = var12[var49];
                    int var52 = var11[var49];
                    int var53 = var10[var49];
                    int var54 = var9[var49];
                    int var55 = var13[var49];
                    var6[var49] = var52 <= var54 ? var52 : var54;
                    var7[var49] = var51 <= var53 ? var51 : var53;
                    var8[var49] = var55 > var50 ? var50 : var55;
                }
            } else if (var15 == 10) {
                for (int var28 = 0; var28 < class128.field2326; var28++) {
                    int var29 = var14[var28];
                    int var30 = var12[var28];
                    int var31 = var9[var28];
                    int var32 = var13[var28];
                    int var33 = var11[var28];
                    int var34 = var10[var28];
                    var6[var28] = var33 < var31 ? var31 : var33;
                    var7[var28] = var34 > var30 ? var34 : var30;
                    var8[var28] = var32 < var29 ? var29 : var32;
                }
            } else if (var15 == 11) {
                for (int var35 = 0; var35 < class128.field2326; var35++) {
                    int var36 = var9[var35];
                    int var37 = var11[var35];
                    int var38 = var10[var35];
                    int var39 = var13[var35];
                    int var40 = var12[var35];
                    int var41 = var14[var35];
                    var6[var35] = var37 < var36 ? var36 - var37 : var37 - var36;
                    var7[var35] = var38 > var40 ? var38 - var40 : -var38 + var40;
                    var8[var35] = var41 <= var39 ? var39 - var41 : -var39 + var41;
                }
            } else if (var15 == 12) {
                for (int var42 = 0; var42 < class128.field2326; var42++) {
                    int var43 = var11[var42];
                    int var44 = var12[var42];
                    int var45 = var10[var42];
                    int var46 = var9[var42];
                    int var47 = var14[var42];
                    int var48 = var13[var42];
                    var6[var42] = var43 + var46 - (var43 * var46 >> 11);
                    var7[var42] = var45 + var44 - (var44 * var45 >> 11);
                    var8[var42] = var47 + var48 - (var47 * var48 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILb;)V", line = 564)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg0 == 0) {
            this.field2368 = arg2.method756(arg1 ^ 0x36979D60);
        } else if (arg0 == 1) {
            this.field3647 = arg2.method756(915905888) == 1;
        }
        field2355++;
        if (arg1 != 0) {
            this.method219(-81, (byte) 16);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)[I", line = 596)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        field2358++;
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(0, arg1, -6606);
            int[] var5 = this.method1585(1, arg1, -6606);
            int var6 = this.field2368;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class128.field2326; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var8 = 0; var8 < class128.field2326; var8++) {
                    var3[var8] = var4[var8] - var5[var8];
                }
            } else if (var6 == 3) {
                for (int var30 = 0; var30 < class128.field2326; var30++) {
                    var3[var30] = var4[var30] * var5[var30] >> 12;
                }
            } else if (var6 == 4) {
                for (int var28 = 0; var28 < class128.field2326; var28++) {
                    int var29 = var5[var28];
                    var3[var28] = var29 == 0 ? 4096 : (var4[var28] << 12) / var29;
                }
            } else if (var6 == 5) {
                for (int var9 = 0; var9 < class128.field2326; var9++) {
                    var3[var9] = 4096 - ((4096 - var4[var9]) * (4096 - var5[var9]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var26 = 0; var26 < class128.field2326; var26++) {
                    int var27 = var5[var26];
                    var3[var26] = var27 < 2048 ? var4[var26] * var27 >> 11 : 4096 - ((4096 - var4[var26]) * (4096 - var27) >> 11);
                }
            } else if (var6 == 7) {
                for (int var24 = 0; var24 < class128.field2326; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 4096 ? 4096 : (var5[var24] << 12) / (4096 - var25);
                }
            } else if (var6 == 8) {
                for (int var22 = 0; var22 < class128.field2326; var22++) {
                    int var23 = var4[var22];
                    var3[var22] = var23 == 0 ? 0 : 4096 - (4096 - var5[var22] << 12) / var23;
                }
            } else if (var6 == 9) {
                for (int var10 = 0; var10 < class128.field2326; var10++) {
                    int var11 = var4[var10];
                    int var12 = var5[var10];
                    var3[var10] = var12 <= var11 ? var12 : var11;
                }
            } else if (var6 == 10) {
                for (int var13 = 0; var13 < class128.field2326; var13++) {
                    int var14 = var4[var13];
                    int var15 = var5[var13];
                    var3[var13] = var15 >= var14 ? var15 : var14;
                }
            } else if (var6 == 11) {
                for (int var16 = 0; var16 < class128.field2326; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var18 < var17 ? var17 - var18 : -var17 + var18;
                }
            } else if (var6 == 12) {
                for (int var19 = 0; var19 < class128.field2326; var19++) {
                    int var20 = var5[var19];
                    int var21 = var4[var19];
                    var3[var19] = var20 + var21 - (var20 * var21 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 842)
    public class131() {
        super(2, false);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Z", line = 854)
    public static final boolean method1047(byte arg0, int arg1) {
        field2366++;
        if (arg0 != -76) {
            method1046(-90, (class162[]) null, true, 80, (short[]) null);
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(B)V", line = 865)
    public static void method1048(byte arg0) {
        field2359 = null;
        if (arg0 == -90) {
            field2360 = null;
            field2367 = null;
            field2361 = (byte[][]) null;
        }
    }
}
