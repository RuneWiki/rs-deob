import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class111 extends class286 {

    @OriginalMember(owner = "client!el", name = "V", descriptor = "I")
    private int field1880 = 6;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "[I")
    public static int[] field1872 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!el", name = "P", descriptor = "Lbe;")
    public static class283 field1874 = class153.method941(-87, ":clanreq:");

    @OriginalMember(owner = "client!el", name = "U", descriptor = "I")
    public static int field1879 = 0;

    @OriginalMember(owner = "client!el", name = "W", descriptor = "Lbe;")
    public static class283 field1881 = class153.method941(125, ": ");

    @OriginalMember(owner = "client!el", name = "X", descriptor = "Lbe;")
    public static class283 field1882 = class153.method941(125, "Schlie-8en");

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "[I")
    public static int[] field1875 = new int[1000];

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "[[[B")
    public static byte[][][] field1877;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 3)
    public class111() {
        super(2, false);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IIII)V", line = 11)
    public static final void method730(int arg0, int arg1, int arg2, int arg3) {
        class196.field3336 = new class160[arg0][arg1][arg2];
        class1.field12 = new int[arg0][arg1 + 1][arg2 + 1];
        class220.field3710 = new class100[4][];
        class75.method498(false);
        class246.field4176 = arg1;
        class76.field1325 = arg2;
        class36.field530 = new int[arg0][arg1 + 1][arg2 + 1];
        class116.method751();
        class241.field4064 = arg3;
        class217.field3675 = new boolean[class241.field4064 + class241.field4064 + 1][class241.field4064 + class241.field4064 + 1];
        class86.field1449 = new boolean[class241.field4064 + class241.field4064 + 2][class241.field4064 + class241.field4064 + 2];
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "(I)V", line = 28)
    public static void method731(int arg0) {
        field1874 = null;
        field1882 = null;
        field1872 = null;
        if (arg0 != -16117) {
            field1882 = (class283) null;
        }
        field1875 = null;
        field1881 = null;
        field1877 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)Z", line = 46)
    public static final boolean method732(int arg0, int arg1) {
        if (arg0 == -1) {
            field1884++;
            return ((arg1 & 0x3582AE62) >> 29) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[I", line = 80)
    public final int[] method14(int arg0, int arg1) {
        field1876++;
        if (arg0 > -52) {
            this.method16(105, (byte) 79);
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int[] var4 = this.method1963(arg1, 0, -1);
            int[] var5 = this.method1963(arg1, 1, -1);
            int var6 = this.field1880;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class27.field410; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class27.field410; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var8 = 0; var8 < class27.field410; var8++) {
                    var3[var8] = var4[var8] * var5[var8] >> 12;
                }
            } else if (var6 == 4) {
                for (int var28 = 0; var28 < class27.field410; var28++) {
                    int var29 = var5[var28];
                    var3[var28] = var29 == 0 ? 4096 : (var4[var28] << 12) / var29;
                }
            } else if (var6 == 5) {
                for (int var27 = 0; var27 < class27.field410; var27++) {
                    var3[var27] = 4096 - ((4096 - var4[var27]) * (4096 - var5[var27]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var9 = 0; var9 < class27.field410; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 >= 2048 ? 4096 - ((4096 - var4[var9]) * (4096 - var10) >> 11) : var4[var9] * var10 >> 11;
                }
            } else if (var6 == 7) {
                for (int var11 = 0; var11 < class27.field410; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 4096 ? 4096 : (var5[var11] << 12) / (4096 - var12);
                }
            } else if (var6 == 8) {
                for (int var25 = 0; var25 < class27.field410; var25++) {
                    int var26 = var4[var25];
                    var3[var25] = var26 == 0 ? 0 : 4096 - (4096 - var5[var25] << 12) / var26;
                }
            } else if (var6 == 9) {
                for (int var13 = 0; var13 < class27.field410; var13++) {
                    int var14 = var4[var13];
                    int var15 = var5[var13];
                    var3[var13] = var14 < var15 ? var14 : var15;
                }
            } else if (var6 == 10) {
                for (int var22 = 0; var22 < class27.field410; var22++) {
                    int var23 = var4[var22];
                    int var24 = var5[var22];
                    var3[var22] = var23 <= var24 ? var24 : var23;
                }
            } else if (var6 == 11) {
                for (int var16 = 0; var16 < class27.field410; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var18 >= var17 ? var18 - var17 : var17 - var18;
                }
            } else if (var6 == 12) {
                for (int var19 = 0; var19 < class27.field410; var19++) {
                    int var20 = var4[var19];
                    int var21 = var5[var19];
                    var3[var19] = var20 + var21 - (var20 * var21 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lfe;ZI)V", line = 323)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field1878++;
        if (arg2 == 0) {
            this.field1880 = arg0.method1535((byte) 88);
        } else if (arg2 == 1) {
            this.field4876 = arg0.method1535((byte) 120) == 1;
        }
        if (arg1) {
            method730(118, -93, -51, 24);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)[[I", line = 371)
    public final int[][] method16(int arg0, byte arg1) {
        if (arg1 != -19) {
            method732(120, -39);
        }
        field1873++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int[][] var4 = this.method1964(arg0, 0, false);
            int[][] var5 = this.method1964(arg0, 1, false);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var5[0];
            int[] var11 = var4[0];
            int[] var12 = var4[2];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1880;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class27.field410; var63++) {
                    var6[var63] = var10[var63] + var11[var63];
                    var7[var63] = var9[var63] + var13[var63];
                    var8[var63] = var12[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class27.field410; var16++) {
                    var6[var16] = var11[var16] - var10[var16];
                    var7[var16] = var9[var16] - var13[var16];
                    var8[var16] = var12[var16] - var14[var16];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class27.field410; var17++) {
                    var6[var17] = var10[var17] * var11[var17] >> 12;
                    var7[var17] = var9[var17] * var13[var17] >> 12;
                    var8[var17] = var12[var17] * var14[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var59 = 0; var59 < class27.field410; var59++) {
                    int var60 = var13[var59];
                    int var61 = var14[var59];
                    int var62 = var10[var59];
                    var6[var59] = var62 == 0 ? 4096 : (var11[var59] << 12) / var62;
                    var7[var59] = var60 == 0 ? 4096 : (var9[var59] << 12) / var60;
                    var8[var59] = var61 == 0 ? 4096 : (var12[var59] << 12) / var61;
                }
            } else if (var15 == 5) {
                for (int var58 = 0; var58 < class27.field410; var58++) {
                    var6[var58] = 4096 - ((4096 - var10[var58]) * (4096 - var11[var58]) >> 12);
                    var7[var58] = 4096 - ((4096 - var9[var58]) * (4096 - var13[var58]) >> 12);
                    var8[var58] = 4096 - ((4096 - var12[var58]) * (4096 - var14[var58]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var54 = 0; var54 < class27.field410; var54++) {
                    int var55 = var14[var54];
                    int var56 = var13[var54];
                    int var57 = var10[var54];
                    var6[var54] = var57 < 2048 ? var11[var54] * var57 >> 11 : 4096 - ((4096 - var11[var54]) * (4096 - var57) >> 11);
                    var7[var54] = var56 < 2048 ? var9[var54] * var56 >> 11 : 4096 - ((4096 - var9[var54]) * (4096 - var56) >> 11);
                    var8[var54] = var55 >= 2048 ? 4096 - ((4096 - var12[var54]) * (4096 - var55) >> 11) : var12[var54] * var55 >> 11;
                }
            } else if (var15 == 7) {
                for (int var50 = 0; var50 < class27.field410; var50++) {
                    int var51 = var9[var50];
                    int var52 = var12[var50];
                    int var53 = var11[var50];
                    var6[var50] = var53 == 4096 ? 4096 : (var10[var50] << 12) / (4096 - var53);
                    var7[var50] = var51 == 4096 ? 4096 : (var13[var50] << 12) / (4096 - var51);
                    var8[var50] = var52 == 4096 ? 4096 : (var14[var50] << 12) / (4096 - var52);
                }
            } else if (var15 == 8) {
                for (int var18 = 0; var18 < class27.field410; var18++) {
                    int var19 = var11[var18];
                    int var20 = var12[var18];
                    int var21 = var9[var18];
                    var6[var18] = var19 == 0 ? 0 : 4096 - ((4096 - var10[var18] << 12) / var19);
                    var7[var18] = var21 == 0 ? 0 : 4096 - ((4096 - var13[var18] << 12) / var21);
                    var8[var18] = var20 == 0 ? 0 : 4096 - ((4096 - var14[var18] << 12) / var20);
                }
            } else if (var15 == 9) {
                for (int var22 = 0; var22 < class27.field410; var22++) {
                    int var23 = var9[var22];
                    int var24 = var14[var22];
                    int var25 = var11[var22];
                    int var26 = var12[var22];
                    int var27 = var13[var22];
                    int var28 = var10[var22];
                    var6[var22] = var28 <= var25 ? var28 : var25;
                    var7[var22] = var23 >= var27 ? var27 : var23;
                    var8[var22] = var24 > var26 ? var26 : var24;
                }
            } else if (var15 == 10) {
                for (int var29 = 0; var29 < class27.field410; var29++) {
                    int var30 = var14[var29];
                    int var31 = var11[var29];
                    int var32 = var12[var29];
                    int var33 = var10[var29];
                    int var34 = var9[var29];
                    int var35 = var13[var29];
                    var6[var29] = var31 <= var33 ? var33 : var31;
                    var7[var29] = var35 >= var34 ? var35 : var34;
                    var8[var29] = var30 >= var32 ? var30 : var32;
                }
            } else if (var15 == 11) {
                for (int var36 = 0; var36 < class27.field410; var36++) {
                    int var37 = var11[var36];
                    int var38 = var14[var36];
                    int var39 = var9[var36];
                    int var40 = var12[var36];
                    int var41 = var13[var36];
                    int var42 = var10[var36];
                    var6[var36] = var37 > var42 ? var37 - var42 : -var37 + var42;
                    var7[var36] = var41 >= var39 ? var41 - var39 : var39 - var41;
                    var8[var36] = var38 >= var40 ? var38 - var40 : -var38 + var40;
                }
            } else if (var15 == 12) {
                for (int var43 = 0; var43 < class27.field410; var43++) {
                    int var44 = var10[var43];
                    int var45 = var14[var43];
                    int var46 = var12[var43];
                    int var47 = var13[var43];
                    int var48 = var9[var43];
                    int var49 = var11[var43];
                    var6[var43] = var44 + var49 - (var44 * var49 >> 11);
                    var7[var43] = var48 + var47 - (var47 * var48 >> 11);
                    var8[var43] = var45 + var46 - (var45 * var46 >> 11);
                }
            }
        }
        return var3;
    }
}
