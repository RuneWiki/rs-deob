import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class132 extends class27 {

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    private int field1938 = 6;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1932 = "Loading wordpack - ";

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field1934 = 0;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field1928 = 50;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "[I")
    public static int[] field1927 = new int[14];

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "Lph;")
    public static class361 field1935;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "[Lcj;")
    public static class148[] field1942;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "[[[B")
    public static byte[][][] field1933;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "[[[I")
    public static int[][][] field1930;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBII)I", line = 7)
    public static final int method953(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1936++;
        int var5 = -15 % ((arg2 - 61) / 60);
        int var6 = arg4 & 0xF;
        int var7 = var6 < 4 ? arg0 : (var6 == 12 || var6 == 14 ? arg1 : arg3);
        int var8 = var6 < 8 ? arg1 : arg0;
        return ((var6 & 0x2) == 0 ? var7 : -var7) + ((var6 & 0x1) == 0 ? var8 : -var8);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[I", line = 28)
    public final int[] method18(int arg0, byte arg1) {
        field1924++;
        if (arg1 != -62) {
            field1942 = (class148[]) null;
        }
        int[] var3 = this.field375.method2087(-108, arg0);
        if (this.field375.field4382) {
            int[] var4 = this.method164(arg0, arg1 + 80, 0);
            int[] var5 = this.method164(arg0, 108, 1);
            int var6 = this.field1938;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class209.field3053; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var8 = 0; var8 < class209.field3053; var8++) {
                    var3[var8] = var4[var8] - var5[var8];
                }
            } else if (var6 == 3) {
                for (int var9 = 0; var9 < class209.field3053; var9++) {
                    var3[var9] = var4[var9] * var5[var9] >> 12;
                }
            } else if (var6 == 4) {
                for (int var29 = 0; var29 < class209.field3053; var29++) {
                    int var30 = var5[var29];
                    var3[var29] = var30 == 0 ? 4096 : (var4[var29] << 12) / var30;
                }
            } else if (var6 == 5) {
                for (int var10 = 0; var10 < class209.field3053; var10++) {
                    var3[var10] = 4096 - ((4096 - var4[var10]) * (4096 - var5[var10]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var11 = 0; var11 < class209.field3053; var11++) {
                    int var12 = var5[var11];
                    var3[var11] = var12 >= 2048 ? 4096 - ((4096 - var4[var11]) * (4096 - var12) >> 11) : var4[var11] * var12 >> 11;
                }
            } else if (var6 == 7) {
                for (int var13 = 0; var13 < class209.field3053; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 4096 ? 4096 : (var5[var13] << 12) / (4096 - var14);
                }
            } else if (var6 == 8) {
                for (int var27 = 0; var27 < class209.field3053; var27++) {
                    int var28 = var4[var27];
                    var3[var27] = var28 == 0 ? 0 : 4096 - ((4096 - var5[var27] << 12) / var28);
                }
            } else if (var6 == 9) {
                for (int var15 = 0; var15 < class209.field3053; var15++) {
                    int var16 = var4[var15];
                    int var17 = var5[var15];
                    var3[var15] = var16 >= var17 ? var17 : var16;
                }
            } else if (var6 == 10) {
                for (int var24 = 0; var24 < class209.field3053; var24++) {
                    int var25 = var5[var24];
                    int var26 = var4[var24];
                    var3[var24] = var26 <= var25 ? var25 : var26;
                }
            } else if (var6 == 11) {
                for (int var21 = 0; var21 < class209.field3053; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var22 < var23 ? var23 - var22 : var22 - var23;
                }
            } else if (var6 == 12) {
                for (int var18 = 0; var18 < class209.field3053; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var19 + var20 - (var19 * var20 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V", line = 270)
    public static final void method954(byte arg0) {
        field1941++;
        class239.field3558.method458((byte) -100);
        int var1 = -20 / ((2 - arg0) / 58);
        class314.field4673.method458((byte) -126);
        class316.field4694.method458((byte) -120);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[[I", line = 286)
    public final int[][] method19(int arg0, int arg1) {
        if (arg0 != -28941) {
            method954((byte) 94);
        }
        int[][] var3 = this.field379.method668(arg1, 0);
        field1937++;
        if (this.field379.field1171) {
            int[][] var4 = this.method168(0, 74, arg1);
            int[][] var5 = this.method168(1, arg0 + 28814, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field1938;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class209.field3053; var63++) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var11[var63] + var14[var63];
                    var8[var63] = var10[var63] + var13[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class209.field3053; var16++) {
                    var6[var16] = var9[var16] - var12[var16];
                    var7[var16] = var11[var16] - var14[var16];
                    var8[var16] = var10[var16] - var13[var16];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class209.field3053; var17++) {
                    var6[var17] = var9[var17] * var12[var17] >> 12;
                    var7[var17] = var11[var17] * var14[var17] >> 12;
                    var8[var17] = var10[var17] * var13[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var18 = 0; var18 < class209.field3053; var18++) {
                    int var19 = var13[var18];
                    int var20 = var12[var18];
                    int var21 = var14[var18];
                    var6[var18] = var20 == 0 ? 4096 : (var9[var18] << 12) / var20;
                    var7[var18] = var21 == 0 ? 4096 : (var11[var18] << 12) / var21;
                    var8[var18] = var19 == 0 ? 4096 : (var10[var18] << 12) / var19;
                }
            } else if (var15 == 5) {
                for (int var62 = 0; var62 < class209.field3053; var62++) {
                    var6[var62] = 4096 - ((4096 - var9[var62]) * (4096 - var12[var62]) >> 12);
                    var7[var62] = 4096 - ((4096 - var11[var62]) * (4096 - var14[var62]) >> 12);
                    var8[var62] = 4096 - ((4096 - var10[var62]) * (4096 - var13[var62]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var22 = 0; var22 < class209.field3053; var22++) {
                    int var23 = var12[var22];
                    int var24 = var13[var22];
                    int var25 = var14[var22];
                    var6[var22] = var23 >= 2048 ? 4096 - ((4096 - var9[var22]) * (4096 - var23) >> 11) : var9[var22] * var23 >> 11;
                    var7[var22] = var25 >= 2048 ? 4096 - ((4096 - var11[var22]) * (4096 - var25) >> 11) : var11[var22] * var25 >> 11;
                    var8[var22] = var24 < 2048 ? var10[var22] * var24 >> 11 : 4096 - ((4096 - var24) * (4096 - var10[var22]) >> 11);
                }
            } else if (var15 == 7) {
                for (int var26 = 0; var26 < class209.field3053; var26++) {
                    int var27 = var11[var26];
                    int var28 = var9[var26];
                    int var29 = var10[var26];
                    var6[var26] = var28 == 4096 ? 4096 : (var12[var26] << 12) / (4096 - var28);
                    var7[var26] = var27 == 4096 ? 4096 : (var14[var26] << 12) / (4096 - var27);
                    var8[var26] = var29 == 4096 ? 4096 : (var13[var26] << 12) / (4096 - var29);
                }
            } else if (var15 == 8) {
                for (int var30 = 0; var30 < class209.field3053; var30++) {
                    int var31 = var10[var30];
                    int var32 = var9[var30];
                    int var33 = var11[var30];
                    var6[var30] = var32 == 0 ? 0 : 4096 - ((4096 - var12[var30] << 12) / var32);
                    var7[var30] = var33 == 0 ? 0 : 4096 - (4096 - var14[var30] << 12) / var33;
                    var8[var30] = var31 == 0 ? 0 : 4096 - (4096 - var13[var30] << 12) / var31;
                }
            } else if (var15 == 9) {
                for (int var55 = 0; var55 < class209.field3053; var55++) {
                    int var56 = var10[var55];
                    int var57 = var11[var55];
                    int var58 = var13[var55];
                    int var59 = var14[var55];
                    int var60 = var9[var55];
                    int var61 = var12[var55];
                    var6[var55] = var61 > var60 ? var60 : var61;
                    var7[var55] = var57 < var59 ? var57 : var59;
                    var8[var55] = var58 <= var56 ? var58 : var56;
                }
            } else if (var15 == 10) {
                for (int var48 = 0; var48 < class209.field3053; var48++) {
                    int var49 = var10[var48];
                    int var50 = var13[var48];
                    int var51 = var14[var48];
                    int var52 = var12[var48];
                    int var53 = var11[var48];
                    int var54 = var9[var48];
                    var6[var48] = var52 >= var54 ? var52 : var54;
                    var7[var48] = var53 > var51 ? var53 : var51;
                    var8[var48] = var49 <= var50 ? var50 : var49;
                }
            } else if (var15 == 11) {
                for (int var41 = 0; var41 < class209.field3053; var41++) {
                    int var42 = var12[var41];
                    int var43 = var14[var41];
                    int var44 = var10[var41];
                    int var45 = var11[var41];
                    int var46 = var13[var41];
                    int var47 = var9[var41];
                    var6[var41] = var42 < var47 ? var47 - var42 : var42 - var47;
                    var7[var41] = var43 >= var45 ? var43 - var45 : -var43 + var45;
                    var8[var41] = var46 >= var44 ? var46 - var44 : -var46 + var44;
                }
            } else if (var15 == 12) {
                for (int var34 = 0; var34 < class209.field3053; var34++) {
                    int var35 = var9[var34];
                    int var36 = var11[var34];
                    int var37 = var12[var34];
                    int var38 = var10[var34];
                    int var39 = var14[var34];
                    int var40 = var13[var34];
                    var6[var34] = var35 + var37 - (var35 * var37 >> 11);
                    var7[var34] = var36 - ((var36 * var39 >> 11) - var39);
                    var8[var34] = var38 + var40 - (var38 * var40 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILsb;I)V", line = 619)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field1940++;
        if (arg0 != -5836) {
            field1942 = (class148[]) null;
        }
        if (arg2 == 0) {
            this.field1938 = arg1.method1319(255);
        } else if (arg2 == 1) {
            this.field376 = arg1.method1319(255) == 1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 653)
    public class132() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZJ)V", line = 661)
    public static final void method955(boolean arg0, long arg1) {
        field1939++;
        if (arg0) {
            method953(100, 39, (byte) 27, 69, 126);
        }
        if (!class274.field4156) {
            class36.field535 += (float) arg1 * class257.field3844 / 40.0F;
            class103.field1476 += (float) arg1 * class354.field5443 / 40.0F;
        }
        int var3 = class259.field3864;
        if (class112.field1623 != var3) {
            int var4 = var3 - class112.field1623;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var4 > var5) {
                var5 = var4;
            }
            class112.field1623 += var5;
        }
        int var6 = class194.field2823;
        if (class150.field2184 != var6) {
            int var7 = var6 - class150.field2184;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class150.field2184 += var8;
        }
        class32.method226(-128);
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(B)V", line = 747)
    public static void method956(byte arg0) {
        field1942 = null;
        field1935 = null;
        if (arg0 > -97) {
            field1926 = -28;
        }
        field1932 = null;
        field1927 = null;
        field1933 = (byte[][][]) null;
        field1930 = (int[][][]) null;
    }
}
