import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class70 extends class195 {

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    private int field1098 = 6;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "Lck;")
    public static class119 field1101 = class298.method1987((byte) 9, "9");

    @OriginalMember(owner = "client!r", name = "db", descriptor = "[Lqh;")
    public static class163[] field1103 = new class163[32768];

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "Lwi;")
    public static class23 field1102;

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 4)
    public class70() {
        super(2, false);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfj;II)V", line = 16)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1098 = arg0.method64((byte) -99);
        } else if (arg2 == 1) {
            this.field3127 = arg0.method64((byte) -125) == 1;
        }
        field1104++;
        if (arg1 >= -117) {
            this.method9((byte) -56, -15);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)[[I", line = 47)
    public final int[][] method9(byte arg0, int arg1) {
        field1100++;
        int[][] var3 = this.field3126.method603(arg1, -126);
        if (this.field3126.field1372) {
            int[][] var4 = this.method1256(arg1, 0, -10072);
            int[][] var5 = this.method1256(arg1, 1, -10072);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field1098;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class157.field2504; var63++) {
                    var6[var63] = var8[var63] + var12[var63];
                    var9[var63] = var11[var63] + var14[var63];
                    var7[var63] = var10[var63] + var13[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class157.field2504; var62++) {
                    var6[var62] = var8[var62] - var12[var62];
                    var9[var62] = var11[var62] - var14[var62];
                    var7[var62] = var10[var62] - var13[var62];
                }
            } else if (var15 == 3) {
                for (int var16 = 0; var16 < class157.field2504; var16++) {
                    var6[var16] = var8[var16] * var12[var16] >> 12;
                    var9[var16] = var11[var16] * var14[var16] >> 12;
                    var7[var16] = var10[var16] * var13[var16] >> 12;
                }
            } else if (var15 == 4) {
                for (int var58 = 0; var58 < class157.field2504; var58++) {
                    int var59 = var13[var58];
                    int var60 = var12[var58];
                    int var61 = var14[var58];
                    var6[var58] = var60 == 0 ? 4096 : (var8[var58] << 12) / var60;
                    var9[var58] = var61 == 0 ? 4096 : (var11[var58] << 12) / var61;
                    var7[var58] = var59 == 0 ? 4096 : (var10[var58] << 12) / var59;
                }
            } else if (var15 == 5) {
                for (int var17 = 0; var17 < class157.field2504; var17++) {
                    var6[var17] = 4096 - ((4096 - var8[var17]) * (4096 - var12[var17]) >> 12);
                    var9[var17] = 4096 - ((4096 - var11[var17]) * (4096 - var14[var17]) >> 12);
                    var7[var17] = 4096 - ((4096 - var13[var17]) * (4096 - var10[var17]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var18 = 0; var18 < class157.field2504; var18++) {
                    int var19 = var13[var18];
                    int var20 = var12[var18];
                    int var21 = var14[var18];
                    var6[var18] = var20 < 2048 ? var8[var18] * var20 >> 11 : 4096 - ((4096 - var8[var18]) * (4096 - var20) >> 11);
                    var9[var18] = var21 < 2048 ? var11[var18] * var21 >> 11 : 4096 - ((4096 - var11[var18]) * (4096 - var21) >> 11);
                    var7[var18] = var19 < 2048 ? var10[var18] * var19 >> 11 : 4096 - ((4096 - var10[var18]) * (4096 - var19) >> 11);
                }
            } else if (var15 == 7) {
                for (int var54 = 0; var54 < class157.field2504; var54++) {
                    int var55 = var10[var54];
                    int var56 = var11[var54];
                    int var57 = var8[var54];
                    var6[var54] = var57 == 4096 ? 4096 : (var12[var54] << 12) / (4096 - var57);
                    var9[var54] = var56 == 4096 ? 4096 : (var14[var54] << 12) / (4096 - var56);
                    var7[var54] = var55 == 4096 ? 4096 : (var13[var54] << 12) / (4096 - var55);
                }
            } else if (var15 == 8) {
                for (int var22 = 0; var22 < class157.field2504; var22++) {
                    int var23 = var10[var22];
                    int var24 = var11[var22];
                    int var25 = var8[var22];
                    var6[var22] = var25 == 0 ? 0 : 4096 - ((4096 - var12[var22] << 12) / var25);
                    var9[var22] = var24 == 0 ? 0 : 4096 - ((4096 - var14[var22] << 12) / var24);
                    var7[var22] = var23 == 0 ? 0 : 4096 - (4096 - var13[var22] << 12) / var23;
                }
            } else if (var15 == 9) {
                for (int var47 = 0; var47 < class157.field2504; var47++) {
                    int var48 = var11[var47];
                    int var49 = var8[var47];
                    int var50 = var12[var47];
                    int var51 = var10[var47];
                    int var52 = var13[var47];
                    int var53 = var14[var47];
                    var6[var47] = var49 < var50 ? var49 : var50;
                    var9[var47] = var48 < var53 ? var48 : var53;
                    var7[var47] = var51 >= var52 ? var52 : var51;
                }
            } else if (var15 == 10) {
                for (int var26 = 0; var26 < class157.field2504; var26++) {
                    int var27 = var14[var26];
                    int var28 = var10[var26];
                    int var29 = var8[var26];
                    int var30 = var12[var26];
                    int var31 = var13[var26];
                    int var32 = var11[var26];
                    var6[var26] = var30 < var29 ? var29 : var30;
                    var9[var26] = var32 > var27 ? var32 : var27;
                    var7[var26] = var28 <= var31 ? var31 : var28;
                }
            } else if (var15 == 11) {
                for (int var33 = 0; var33 < class157.field2504; var33++) {
                    int var34 = var13[var33];
                    int var35 = var14[var33];
                    int var36 = var8[var33];
                    int var37 = var11[var33];
                    int var38 = var10[var33];
                    int var39 = var12[var33];
                    var6[var33] = var36 > var39 ? var36 - var39 : -var36 + var39;
                    var9[var33] = var37 <= var35 ? var35 - var37 : -var35 + var37;
                    var7[var33] = var38 <= var34 ? var34 - var38 : var38 - var34;
                }
            } else if (var15 == 12) {
                for (int var40 = 0; var40 < class157.field2504; var40++) {
                    int var41 = var10[var40];
                    int var42 = var11[var40];
                    int var43 = var8[var40];
                    int var44 = var13[var40];
                    int var45 = var12[var40];
                    int var46 = var14[var40];
                    var6[var40] = var43 + var45 - (var43 * var45 >> 11);
                    var9[var40] = var46 + var42 - (var42 * var46 >> 11);
                    var7[var40] = var41 + var44 - (var41 * var44 >> 11);
                }
            }
        }
        if (arg0 != 3) {
            field1101 = (class119) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)[I", line = 360)
    public final int[] method11(int arg0, boolean arg1) {
        field1099++;
        if (arg1) {
            field1103 = (class163[]) null;
        }
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(0, 102, arg0);
            int[] var5 = this.method1253(1, 65, arg0);
            int var6 = this.field1098;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class157.field2504; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class157.field2504; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var8 = 0; var8 < class157.field2504; var8++) {
                    var3[var8] = var4[var8] * var5[var8] >> 12;
                }
            } else if (var6 == 4) {
                for (int var28 = 0; var28 < class157.field2504; var28++) {
                    int var29 = var5[var28];
                    var3[var28] = var29 == 0 ? 4096 : (var4[var28] << 12) / var29;
                }
            } else if (var6 == 5) {
                for (int var27 = 0; var27 < class157.field2504; var27++) {
                    var3[var27] = 4096 - ((4096 - var4[var27]) * (4096 - var5[var27]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var9 = 0; var9 < class157.field2504; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 < 2048 ? var4[var9] * var10 >> 11 : 4096 - ((4096 - var4[var9]) * (4096 - var10) >> 11);
                }
            } else if (var6 == 7) {
                for (int var11 = 0; var11 < class157.field2504; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 4096 ? 4096 : (var5[var11] << 12) / (4096 - var12);
                }
            } else if (var6 == 8) {
                for (int var25 = 0; var25 < class157.field2504; var25++) {
                    int var26 = var4[var25];
                    var3[var25] = var26 == 0 ? 0 : 4096 - ((4096 - var5[var25] << 12) / var26);
                }
            } else if (var6 == 9) {
                for (int var22 = 0; var22 < class157.field2504; var22++) {
                    int var23 = var5[var22];
                    int var24 = var4[var22];
                    var3[var22] = var23 <= var24 ? var23 : var24;
                }
            } else if (var6 == 10) {
                for (int var13 = 0; var13 < class157.field2504; var13++) {
                    int var14 = var5[var13];
                    int var15 = var4[var13];
                    var3[var13] = var14 < var15 ? var15 : var14;
                }
            } else if (var6 == 11) {
                for (int var16 = 0; var16 < class157.field2504; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var18 >= var17 ? var18 - var17 : -var18 + var17;
                }
            } else if (var6 == 12) {
                for (int var19 = 0; var19 < class157.field2504; var19++) {
                    int var20 = var4[var19];
                    int var21 = var5[var19];
                    var3[var19] = var20 + var21 - (var20 * var21 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I", line = 611)
    public static final int method505(int arg0, int arg1) {
        field1095++;
        if (arg0 != 1260589739) {
            field1105 = -9;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V", line = 623)
    public static void method506(int arg0) {
        field1101 = null;
        if (arg0 != 26187) {
            method506(-20);
        }
        field1102 = null;
        field1103 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V", line = 642)
    public static final void method507(int arg0, int arg1) {
        field1096++;
        class153 var2 = class299.field5049;
        synchronized (class299.field5049) {
            if (arg1 != 0) {
                field1102 = (class23) null;
            }
            class266.field4354 = arg0;
        }
    }
}
