import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class12 extends class177 {

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    private int field132 = 6;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Ljava/lang/String;")
    public static String field134 = "Loading fonts - ";

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "Lem;")
    public static class11 field133;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "[Ltb;")
    public static class220[] field129;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B", line = 4)
    public static final byte[] method92(Object arg0, boolean arg1, byte arg2) {
        field131++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 > -27) {
            field134 = (String) null;
        }
        if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg1 ? class312.method2153((byte) -54, var4) : var4;
        } else if ((arg0 instanceof class207)) {
            class207 var3 = (class207) arg0;
            return var3.method473(-1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V", line = 40)
    public static final void method93(int arg0, int arg1, int arg2) {
        field137++;
        if (arg1 <= -83) {
            class147 var3 = class92.method731(-29125, arg2, 13);
            var3.method1095(104);
            var3.field2240 = arg0;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(B)V", line = 54)
    public static final void method94(byte arg0) {
        field130++;
        if (arg0 != 13) {
            method94((byte) -14);
        }
        class213.field3383.method850(-10531);
        class276.field4244 = null;
        class41.field616 = 1;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 70)
    public class12() {
        super(2, false);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I", line = 80)
    public final int[] method95(int arg0, int arg1) {
        field138++;
        if (arg0 >= -52) {
            return (int[]) null;
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -86);
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(arg1, 0, false);
            int[] var5 = this.method1280(arg1, 1, false);
            int var6 = this.field132;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class287.field4415; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class287.field4415; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var8 = 0; var8 < class287.field4415; var8++) {
                    var3[var8] = var4[var8] * var5[var8] >> 12;
                }
            } else if (var6 == 4) {
                for (int var9 = 0; var9 < class287.field4415; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 == 0 ? 4096 : (var4[var9] << 12) / var10;
                }
            } else if (var6 == 5) {
                for (int var29 = 0; var29 < class287.field4415; var29++) {
                    var3[var29] = 4096 - ((4096 - var4[var29]) * (4096 - var5[var29]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var27 = 0; var27 < class287.field4415; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 >= 2048 ? 4096 - ((4096 - var4[var27]) * (4096 - var28) >> 11) : var4[var27] * var28 >> 11;
                }
            } else if (var6 == 7) {
                for (int var11 = 0; var11 < class287.field4415; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 4096 ? 4096 : (var5[var11] << 12) / (4096 - var12);
                }
            } else if (var6 == 8) {
                for (int var13 = 0; var13 < class287.field4415; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 0 ? 0 : 4096 - ((4096 - var5[var13] << 12) / var14);
                }
            } else if (var6 == 9) {
                for (int var15 = 0; var15 < class287.field4415; var15++) {
                    int var16 = var4[var15];
                    int var17 = var5[var15];
                    var3[var15] = var16 >= var17 ? var17 : var16;
                }
            } else if (var6 == 10) {
                for (int var18 = 0; var18 < class287.field4415; var18++) {
                    int var19 = var4[var18];
                    int var20 = var5[var18];
                    var3[var18] = var20 < var19 ? var19 : var20;
                }
            } else if (var6 == 11) {
                for (int var24 = 0; var24 < class287.field4415; var24++) {
                    int var25 = var5[var24];
                    int var26 = var4[var24];
                    var3[var24] = var26 <= var25 ? var25 - var26 : -var25 + var26;
                }
            } else if (var6 == 12) {
                for (int var21 = 0; var21 < class287.field4415; var21++) {
                    int var22 = var4[var21];
                    int var23 = var5[var21];
                    var3[var21] = var22 + var23 - (var22 * var23 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(CI)Z", line = 323)
    public static final boolean method96(char arg0, int arg1) {
        field139++;
        if (arg1 == 644397899) {
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lhb;II)V", line = 335)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 != -18061) {
            method96('F', 98);
        }
        if (arg2 == 0) {
            this.field132 = arg0.method273(65280);
        } else if (arg2 == 1) {
            this.field2649 = arg0.method273(65280) == 1;
        }
        field135++;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(B)V", line = 371)
    public static void method98(byte arg0) {
        field129 = null;
        field134 = null;
        if (arg0 <= -74) {
            field133 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[[I", line = 389)
    public final int[][] method99(int arg0, int arg1) {
        field140++;
        if (arg1 != -23387) {
            this.field132 = 120;
        }
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int[][] var4 = this.method1285(0, arg0, arg1 ^ 0xFFFFC862);
            int[][] var5 = this.method1285(1, arg0, arg1 ^ 0xFFFFC862);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field132;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class287.field4415; var63++) {
                    var7[var63] = var8[var63] + var12[var63];
                    var6[var63] = var11[var63] + var13[var63];
                    var9[var63] = var10[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class287.field4415; var62++) {
                    var7[var62] = var8[var62] - var12[var62];
                    var6[var62] = var11[var62] - var13[var62];
                    var9[var62] = var10[var62] - var14[var62];
                }
            } else if (var15 == 3) {
                for (int var16 = 0; var16 < class287.field4415; var16++) {
                    var7[var16] = var8[var16] * var12[var16] >> 12;
                    var6[var16] = var11[var16] * var13[var16] >> 12;
                    var9[var16] = var10[var16] * var14[var16] >> 12;
                }
            } else if (var15 == 4) {
                for (int var17 = 0; var17 < class287.field4415; var17++) {
                    int var18 = var12[var17];
                    int var19 = var14[var17];
                    int var20 = var13[var17];
                    var7[var17] = var18 == 0 ? 4096 : (var8[var17] << 12) / var18;
                    var6[var17] = var20 == 0 ? 4096 : (var11[var17] << 12) / var20;
                    var9[var17] = var19 == 0 ? 4096 : (var10[var17] << 12) / var19;
                }
            } else if (var15 == 5) {
                for (int var61 = 0; var61 < class287.field4415; var61++) {
                    var7[var61] = 4096 - ((4096 - var8[var61]) * (4096 - var12[var61]) >> 12);
                    var6[var61] = 4096 - ((4096 - var13[var61]) * (4096 - var11[var61]) >> 12);
                    var9[var61] = 4096 - ((4096 - var10[var61]) * (4096 - var14[var61]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var57 = 0; var57 < class287.field4415; var57++) {
                    int var58 = var12[var57];
                    int var59 = var13[var57];
                    int var60 = var14[var57];
                    var7[var57] = var58 >= 2048 ? 4096 - ((4096 - var8[var57]) * (4096 - var58) >> 11) : var8[var57] * var58 >> 11;
                    var6[var57] = var59 < 2048 ? var11[var57] * var59 >> 11 : 4096 - ((4096 - var11[var57]) * (4096 - var59) >> 11);
                    var9[var57] = var60 < 2048 ? var10[var57] * var60 >> 11 : 4096 - ((4096 - var10[var57]) * (4096 - var60) >> 11);
                }
            } else if (var15 == 7) {
                for (int var21 = 0; var21 < class287.field4415; var21++) {
                    int var22 = var11[var21];
                    int var23 = var10[var21];
                    int var24 = var8[var21];
                    var7[var21] = var24 == 4096 ? 4096 : (var12[var21] << 12) / (4096 - var24);
                    var6[var21] = var22 == 4096 ? 4096 : (var13[var21] << 12) / (4096 - var22);
                    var9[var21] = var23 == 4096 ? 4096 : (var14[var21] << 12) / (4096 - var23);
                }
            } else if (var15 == 8) {
                for (int var53 = 0; var53 < class287.field4415; var53++) {
                    int var54 = var8[var53];
                    int var55 = var10[var53];
                    int var56 = var11[var53];
                    var7[var53] = var54 == 0 ? 0 : 4096 - ((4096 - var12[var53] << 12) / var54);
                    var6[var53] = var56 == 0 ? 0 : 4096 - ((4096 - var13[var53] << 12) / var56);
                    var9[var53] = var55 == 0 ? 0 : 4096 - (4096 - var14[var53] << 12) / var55;
                }
            } else if (var15 == 9) {
                for (int var25 = 0; var25 < class287.field4415; var25++) {
                    int var26 = var13[var25];
                    int var27 = var10[var25];
                    int var28 = var11[var25];
                    int var29 = var8[var25];
                    int var30 = var12[var25];
                    int var31 = var14[var25];
                    var7[var25] = var29 < var30 ? var29 : var30;
                    var6[var25] = var28 >= var26 ? var26 : var28;
                    var9[var25] = var31 > var27 ? var27 : var31;
                }
            } else if (var15 == 10) {
                for (int var46 = 0; var46 < class287.field4415; var46++) {
                    int var47 = var11[var46];
                    int var48 = var13[var46];
                    int var49 = var10[var46];
                    int var50 = var8[var46];
                    int var51 = var12[var46];
                    int var52 = var14[var46];
                    var7[var46] = var50 > var51 ? var50 : var51;
                    var6[var46] = var47 <= var48 ? var48 : var47;
                    var9[var46] = var52 < var49 ? var49 : var52;
                }
            } else if (var15 == 11) {
                for (int var32 = 0; var32 < class287.field4415; var32++) {
                    int var33 = var10[var32];
                    int var34 = var8[var32];
                    int var35 = var12[var32];
                    int var36 = var13[var32];
                    int var37 = var14[var32];
                    int var38 = var11[var32];
                    var7[var32] = var35 >= var34 ? var35 - var34 : -var35 + var34;
                    var6[var32] = var38 <= var36 ? var36 - var38 : var38 - var36;
                    var9[var32] = var33 > var37 ? var33 - var37 : -var33 + var37;
                }
            } else if (var15 == 12) {
                for (int var39 = 0; var39 < class287.field4415; var39++) {
                    int var40 = var11[var39];
                    int var41 = var14[var39];
                    int var42 = var12[var39];
                    int var43 = var10[var39];
                    int var44 = var13[var39];
                    int var45 = var8[var39];
                    var7[var39] = var42 + var45 - (var42 * var45 >> 11);
                    var6[var39] = var40 + var44 - (var40 * var44 >> 11);
                    var9[var39] = var41 + var43 - (var41 * var43 >> 11);
                }
            }
        }
        return var3;
    }
}
