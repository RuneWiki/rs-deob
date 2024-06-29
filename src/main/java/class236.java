import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class236 extends class262 {

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    private int field3942 = 6;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field3936 = 127;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "Z")
    public static boolean field3939 = false;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "Lok;")
    public static class146 field3938 = class235.method1724(-12908, "p12_full");

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field3943 = -1;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field3947 = 0;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V", line = 4)
    public static void method1726(byte arg0) {
        if (arg0 < 8) {
            field3937 = 83;
        }
        field3938 = null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[[I", line = 17)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != 7) {
            method1728((byte) 123, 20);
        }
        int[][] var3 = this.field4347.method536(arg1, arg0 + 4089);
        if (this.field4347.field1202) {
            int[][] var4 = this.method1893(0, arg1, 117);
            int[][] var5 = this.method1893(1, arg1, 117);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3942;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class98.field1598; var16++) {
                    var6[var16] = var9[var16] + var12[var16];
                    var7[var16] = var10[var16] + var13[var16];
                    var8[var16] = var11[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var63 = 0; var63 < class98.field1598; var63++) {
                    var6[var63] = var9[var63] - var12[var63];
                    var7[var63] = var10[var63] - var13[var63];
                    var8[var63] = var11[var63] - var14[var63];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class98.field1598; var17++) {
                    var6[var17] = var9[var17] * var12[var17] >> 12;
                    var7[var17] = var10[var17] * var13[var17] >> 12;
                    var8[var17] = var11[var17] * var14[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var18 = 0; var18 < class98.field1598; var18++) {
                    int var19 = var12[var18];
                    int var20 = var13[var18];
                    int var21 = var14[var18];
                    var6[var18] = var19 == 0 ? 4096 : (var9[var18] << 12) / var19;
                    var7[var18] = var20 == 0 ? 4096 : (var10[var18] << 12) / var20;
                    var8[var18] = var21 == 0 ? 4096 : (var11[var18] << 12) / var21;
                }
            } else if (var15 == 5) {
                for (int var22 = 0; var22 < class98.field1598; var22++) {
                    var6[var22] = 4096 - ((4096 - var9[var22]) * (4096 - var12[var22]) >> 12);
                    var7[var22] = 4096 - ((4096 - var10[var22]) * (4096 - var13[var22]) >> 12);
                    var8[var22] = 4096 - ((4096 - var11[var22]) * (4096 - var14[var22]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var59 = 0; var59 < class98.field1598; var59++) {
                    int var60 = var14[var59];
                    int var61 = var12[var59];
                    int var62 = var13[var59];
                    var6[var59] = var61 >= 2048 ? 4096 - ((4096 - var9[var59]) * (4096 - var61) >> 11) : var9[var59] * var61 >> 11;
                    var7[var59] = var62 >= 2048 ? 4096 - ((4096 - var10[var59]) * (4096 - var62) >> 11) : var10[var59] * var62 >> 11;
                    var8[var59] = var60 < 2048 ? var11[var59] * var60 >> 11 : 4096 - ((4096 - var11[var59]) * (4096 - var60) >> 11);
                }
            } else if (var15 == 7) {
                for (int var55 = 0; var55 < class98.field1598; var55++) {
                    int var56 = var10[var55];
                    int var57 = var9[var55];
                    int var58 = var11[var55];
                    var6[var55] = var57 == 4096 ? 4096 : (var12[var55] << 12) / (4096 - var57);
                    var7[var55] = var56 == 4096 ? 4096 : (var13[var55] << 12) / (4096 - var56);
                    var8[var55] = var58 == 4096 ? 4096 : (var14[var55] << 12) / (4096 - var58);
                }
            } else if (var15 == 8) {
                for (int var51 = 0; var51 < class98.field1598; var51++) {
                    int var52 = var9[var51];
                    int var53 = var10[var51];
                    int var54 = var11[var51];
                    var6[var51] = var52 == 0 ? 0 : 4096 - ((4096 - var12[var51] << 12) / var52);
                    var7[var51] = var53 == 0 ? 0 : 4096 - ((4096 - var13[var51] << 12) / var53);
                    var8[var51] = var54 == 0 ? 0 : 4096 - ((4096 - var14[var51] << 12) / var54);
                }
            } else if (var15 == 9) {
                for (int var44 = 0; var44 < class98.field1598; var44++) {
                    int var45 = var10[var44];
                    int var46 = var14[var44];
                    int var47 = var12[var44];
                    int var48 = var13[var44];
                    int var49 = var11[var44];
                    int var50 = var9[var44];
                    var6[var44] = var50 < var47 ? var50 : var47;
                    var7[var44] = var48 > var45 ? var45 : var48;
                    var8[var44] = var46 > var49 ? var49 : var46;
                }
            } else if (var15 == 10) {
                for (int var37 = 0; var37 < class98.field1598; var37++) {
                    int var38 = var10[var37];
                    int var39 = var9[var37];
                    int var40 = var14[var37];
                    int var41 = var11[var37];
                    int var42 = var13[var37];
                    int var43 = var12[var37];
                    var6[var37] = var39 > var43 ? var39 : var43;
                    var7[var37] = var38 > var42 ? var38 : var42;
                    var8[var37] = var40 >= var41 ? var40 : var41;
                }
            } else if (var15 == 11) {
                for (int var30 = 0; var30 < class98.field1598; var30++) {
                    int var31 = var11[var30];
                    int var32 = var14[var30];
                    int var33 = var12[var30];
                    int var34 = var13[var30];
                    int var35 = var10[var30];
                    int var36 = var9[var30];
                    var6[var30] = var36 > var33 ? var36 - var33 : -var36 + var33;
                    var7[var30] = var35 > var34 ? var35 - var34 : -var35 + var34;
                    var8[var30] = var31 <= var32 ? var32 - var31 : -var32 + var31;
                }
            } else if (var15 == 12) {
                for (int var23 = 0; var23 < class98.field1598; var23++) {
                    int var24 = var10[var23];
                    int var25 = var13[var23];
                    int var26 = var11[var23];
                    int var27 = var9[var23];
                    int var28 = var12[var23];
                    int var29 = var14[var23];
                    var6[var23] = var28 + var27 - (var27 * var28 >> 11);
                    var7[var23] = var24 + var25 - (var24 * var25 >> 11);
                    var8[var23] = var26 + var29 - (var26 * var29 >> 11);
                }
            }
        }
        field3944++;
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILoj;)V", line = 332)
    public static final void method1727(int arg0, class318 arg1) {
        if (class203.field3385 == arg1.field5437 || arg1.field5408 == -1 || arg1.field5438 != 0 || (arg1.field5391 + 1) > class306.method2156(122, arg1.field5408).field4898[arg1.field5443]) {
            int var2 = arg1.field5437 - arg1.field5414;
            int var3 = class203.field3385 - arg1.field5414;
            int var4 = arg1.field5382 * 128 + arg1.method1717(0) * 64;
            int var5 = arg1.field5425 * 128 + (arg1.method1717(0) * 64);
            int var6 = arg1.field5393 * 128 + (arg1.method1717(0) * 64);
            int var7 = arg1.field5403 * 128 + (arg1.method1717(0) * 64);
            arg1.field5409 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field5380 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg1.field5396 == 0) {
            arg1.field5421 = 1024;
        }
        if (arg0 < 125) {
            return;
        }
        arg1.field5404 = 0;
        field3946++;
        if (arg1.field5396 == 1) {
            arg1.field5421 = 1536;
        }
        if (arg1.field5396 == 2) {
            arg1.field5421 = 0;
        }
        if (arg1.field5396 == 3) {
            arg1.field5421 = 512;
        }
        arg1.field5406 = arg1.field5421;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lwe;II)V", line = 399)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            this.field3942 = -35;
        }
        field3945++;
        if (arg2 == 0) {
            this.field3942 = arg0.method368(-101);
        } else if (arg2 == 1) {
            this.field4365 = arg0.method368(103) == 1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[I", line = 444)
    public final int[] method38(int arg0, byte arg1) {
        field3941++;
        if (arg1 >= -85) {
            field3943 = 85;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 127);
        if (this.field4350.field3333) {
            int[] var4 = this.method1895(7, 0, arg0);
            int[] var5 = this.method1895(7, 1, arg0);
            int var6 = this.field3942;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class98.field1598; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class98.field1598; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class98.field1598; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class98.field1598; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var8 = 0; var8 < class98.field1598; var8++) {
                    var3[var8] = 4096 - ((4096 - var5[var8]) * (4096 - var4[var8]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var9 = 0; var9 < class98.field1598; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 < 2048 ? var4[var9] * var10 >> 11 : 4096 - ((4096 - var4[var9]) * (4096 - var10) >> 11);
                }
            } else if (var6 == 7) {
                for (int var11 = 0; var11 < class98.field1598; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 4096 ? 4096 : (var5[var11] << 12) / (4096 - var12);
                }
            } else if (var6 == 8) {
                for (int var13 = 0; var13 < class98.field1598; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 0 ? 0 : 4096 - ((4096 - var5[var13] << 12) / var14);
                }
            } else if (var6 == 9) {
                for (int var24 = 0; var24 < class98.field1598; var24++) {
                    int var25 = var5[var24];
                    int var26 = var4[var24];
                    var3[var24] = var26 < var25 ? var26 : var25;
                }
            } else if (var6 == 10) {
                for (int var15 = 0; var15 < class98.field1598; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var16 >= var17 ? var16 : var17;
                }
            } else if (var6 == 11) {
                for (int var18 = 0; var18 < class98.field1598; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var20 > var19 ? var20 - var19 : -var20 + var19;
                }
            } else if (var6 == 12) {
                for (int var21 = 0; var21 < class98.field1598; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var22 + var23 - (var22 * var23 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 690)
    public class236() {
        super(2, false);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V", line = 699)
    public static final void method1728(byte arg0, int arg1) {
        field3940++;
        class158 var2 = class206.method1564(arg1, 10, arg0 ^ 0x42);
        var2.method1238(arg0 ^ 0xFFFFFFD3);
        if (arg0 != -43) {
            field3943 = 32;
        }
    }
}
