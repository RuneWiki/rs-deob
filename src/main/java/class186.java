import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class186 extends class120 {

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    private int field3029 = 6;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "Lok;")
    public static class41 field3028 = class137.method956("settings=", 45);

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "Lok;")
    public static class41 field3030 = class137.method956("details", 45);

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "Lfl;")
    public static class86 field3031 = new class86(32);

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "Lok;")
    public static class41 field3036 = class137.method956("null", 45);

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "Lbc;")
    public static class302 field3039 = null;

    @OriginalMember(owner = "client!nk", name = "jb", descriptor = "Lok;")
    public static class41 field3044 = class137.method956("Okay", 45);

    @OriginalMember(owner = "client!nk", name = "ib", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "Lke;")
    public static class218 field3038;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "Lpk;")
    public static class44 field3041;

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 7)
    public class186() {
        super(2, false);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)[[I", line = 34)
    public final int[][] method168(int arg0, boolean arg1) {
        field3034++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[][] var4 = this.method858(0, arg0, 127);
            int[][] var5 = this.method858(1, arg0, 127);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            int[] var11 = var4[2];
            int[] var12 = var5[1];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field3029;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class307.field5160; var63++) {
                    var6[var63] = var8[var63] + var13[var63];
                    var7[var63] = var9[var63] + var12[var63];
                    var10[var63] = var11[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class307.field5160; var62++) {
                    var6[var62] = var8[var62] - var13[var62];
                    var7[var62] = var9[var62] - var12[var62];
                    var10[var62] = var11[var62] - var14[var62];
                }
            } else if (var15 == 3) {
                for (int var61 = 0; var61 < class307.field5160; var61++) {
                    var6[var61] = var8[var61] * var13[var61] >> 12;
                    var7[var61] = var9[var61] * var12[var61] >> 12;
                    var10[var61] = var11[var61] * var14[var61] >> 12;
                }
            } else if (var15 == 4) {
                for (int var16 = 0; var16 < class307.field5160; var16++) {
                    int var17 = var14[var16];
                    int var18 = var13[var16];
                    int var19 = var12[var16];
                    var6[var16] = var18 == 0 ? 4096 : (var8[var16] << 12) / var18;
                    var7[var16] = var19 == 0 ? 4096 : (var9[var16] << 12) / var19;
                    var10[var16] = var17 == 0 ? 4096 : (var11[var16] << 12) / var17;
                }
            } else if (var15 == 5) {
                for (int var60 = 0; var60 < class307.field5160; var60++) {
                    var6[var60] = 4096 - ((4096 - var8[var60]) * (4096 - var13[var60]) >> 12);
                    var7[var60] = 4096 - ((4096 - var9[var60]) * (4096 - var12[var60]) >> 12);
                    var10[var60] = 4096 - ((4096 - var11[var60]) * (4096 - var14[var60]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var56 = 0; var56 < class307.field5160; var56++) {
                    int var57 = var14[var56];
                    int var58 = var12[var56];
                    int var59 = var13[var56];
                    var6[var56] = var59 >= 2048 ? 4096 - ((4096 - var8[var56]) * (4096 - var59) >> 11) : var8[var56] * var59 >> 11;
                    var7[var56] = var58 < 2048 ? var9[var56] * var58 >> 11 : 4096 - ((4096 - var9[var56]) * (4096 - var58) >> 11);
                    var10[var56] = var57 >= 2048 ? 4096 - ((4096 - var11[var56]) * (4096 - var57) >> 11) : var11[var56] * var57 >> 11;
                }
            } else if (var15 == 7) {
                for (int var52 = 0; var52 < class307.field5160; var52++) {
                    int var53 = var11[var52];
                    int var54 = var8[var52];
                    int var55 = var9[var52];
                    var6[var52] = var54 == 4096 ? 4096 : (var13[var52] << 12) / (4096 - var54);
                    var7[var52] = var55 == 4096 ? 4096 : (var12[var52] << 12) / (4096 - var55);
                    var10[var52] = var53 == 4096 ? 4096 : (var14[var52] << 12) / (4096 - var53);
                }
            } else if (var15 == 8) {
                for (int var20 = 0; var20 < class307.field5160; var20++) {
                    int var21 = var8[var20];
                    int var22 = var9[var20];
                    int var23 = var11[var20];
                    var6[var20] = var21 == 0 ? 0 : 4096 - (4096 - var13[var20] << 12) / var21;
                    var7[var20] = var22 == 0 ? 0 : 4096 - ((4096 - var12[var20] << 12) / var22);
                    var10[var20] = var23 == 0 ? 0 : 4096 - ((4096 - var14[var20] << 12) / var23);
                }
            } else if (var15 == 9) {
                for (int var45 = 0; var45 < class307.field5160; var45++) {
                    int var46 = var11[var45];
                    int var47 = var13[var45];
                    int var48 = var14[var45];
                    int var49 = var8[var45];
                    int var50 = var12[var45];
                    int var51 = var9[var45];
                    var6[var45] = var49 < var47 ? var49 : var47;
                    var7[var45] = var50 > var51 ? var51 : var50;
                    var10[var45] = var48 <= var46 ? var48 : var46;
                }
            } else if (var15 == 10) {
                for (int var38 = 0; var38 < class307.field5160; var38++) {
                    int var39 = var12[var38];
                    int var40 = var13[var38];
                    int var41 = var8[var38];
                    int var42 = var14[var38];
                    int var43 = var11[var38];
                    int var44 = var9[var38];
                    var6[var38] = var40 < var41 ? var41 : var40;
                    var7[var38] = var39 >= var44 ? var39 : var44;
                    var10[var38] = var42 >= var43 ? var42 : var43;
                }
            } else if (var15 == 11) {
                for (int var24 = 0; var24 < class307.field5160; var24++) {
                    int var25 = var12[var24];
                    int var26 = var9[var24];
                    int var27 = var13[var24];
                    int var28 = var8[var24];
                    int var29 = var14[var24];
                    int var30 = var11[var24];
                    var6[var24] = var27 < var28 ? var28 - var27 : -var28 + var27;
                    var7[var24] = var26 <= var25 ? var25 - var26 : -var25 + var26;
                    var10[var24] = var29 >= var30 ? var29 - var30 : -var29 + var30;
                }
            } else if (var15 == 12) {
                for (int var31 = 0; var31 < class307.field5160; var31++) {
                    int var32 = var14[var31];
                    int var33 = var9[var31];
                    int var34 = var11[var31];
                    int var35 = var8[var31];
                    int var36 = var12[var31];
                    int var37 = var13[var31];
                    var6[var31] = var35 + var37 - (var35 * var37 >> 11);
                    var7[var31] = var33 - ((var33 * var36 >> 11) - var36);
                    var10[var31] = var32 + var34 - (var32 * var34 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I", line = 353)
    public final int[] method14(int arg0, int arg1) {
        field3032++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 != -14959) {
            this.field3029 = -19;
        }
        if (this.field1775.field1798) {
            int[] var4 = this.method854(0, arg0, -24059);
            int[] var5 = this.method854(1, arg0, -24059);
            int var6 = this.field3029;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class307.field5160; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class307.field5160; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var7 = 0; var7 < class307.field5160; var7++) {
                    var3[var7] = var4[var7] * var5[var7] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class307.field5160; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var8 = 0; var8 < class307.field5160; var8++) {
                    var3[var8] = 4096 - ((4096 - var4[var8]) * (4096 - var5[var8]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var9 = 0; var9 < class307.field5160; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 < 2048 ? var4[var9] * var10 >> 11 : 4096 - ((4096 - var4[var9]) * (4096 - var10) >> 11);
                }
            } else if (var6 == 7) {
                for (int var11 = 0; var11 < class307.field5160; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 4096 ? 4096 : (var5[var11] << 12) / (4096 - var12);
                }
            } else if (var6 == 8) {
                for (int var25 = 0; var25 < class307.field5160; var25++) {
                    int var26 = var4[var25];
                    var3[var25] = var26 == 0 ? 0 : 4096 - (4096 - var5[var25] << 12) / var26;
                }
            } else if (var6 == 9) {
                for (int var22 = 0; var22 < class307.field5160; var22++) {
                    int var23 = var5[var22];
                    int var24 = var4[var22];
                    var3[var22] = var24 >= var23 ? var23 : var24;
                }
            } else if (var6 == 10) {
                for (int var19 = 0; var19 < class307.field5160; var19++) {
                    int var20 = var4[var19];
                    int var21 = var5[var19];
                    var3[var19] = var21 >= var20 ? var21 : var20;
                }
            } else if (var6 == 11) {
                for (int var13 = 0; var13 < class307.field5160; var13++) {
                    int var14 = var4[var13];
                    int var15 = var5[var13];
                    var3[var13] = var14 > var15 ? var14 - var15 : -var14 + var15;
                }
            } else if (var6 == 12) {
                for (int var16 = 0; var16 < class307.field5160; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var17 + var18 - (var17 * var18 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V", line = 601)
    public static final void method1343(int arg0) {
        if (arg0 == -28931) {
            class63.field927.method135(arg0 + 47367);
            field3040++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(B)V", line = 616)
    public static void method1344(byte arg0) {
        field3044 = null;
        field3036 = null;
        field3031 = null;
        field3038 = null;
        field3039 = null;
        field3041 = null;
        field3028 = null;
        field3030 = null;
        if (arg0 < 67) {
            method1345((byte) -55, 24);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Llb;II)V", line = 649)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3029 = arg0.method792(2);
        } else if (arg2 == 1) {
            this.field1770 = arg0.method792(2) == 1;
        }
        if (arg1 != -1) {
            field3030 = (class41) null;
        }
        field3033++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)V", line = 688)
    public static final void method1345(byte arg0, int arg1) {
        class46 var2 = class195.method1396(10, arg1, false);
        var2.method336(true);
        if (arg0 != -102) {
            field3030 = (class41) null;
        }
        field3037++;
    }
}
