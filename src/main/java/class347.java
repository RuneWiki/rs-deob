import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class347 extends class83 {

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    private int field4843 = 1;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    private int field4844 = 1;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "[[I")
    public static int[][] field4840 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "Lkh;")
    public static class68 field4846;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
    public static void method2108(int arg0) {
        if (arg0 < -107) {
            field4840 = null;
            field4846 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field4845;
        int[] var3 = super.field916.method1813(arg1, (byte) 9);
        if (arg0 != 2) {
            method2109(34, 92);
        }
        if (super.field916.field4174) {
            int var4 = this.field4843 + this.field4843 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field4844 + this.field4844 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field4843 + arg1; this.field4843 + arg1 >= var9; ++var9) {
                int[] var13 = this.method451(0, arg0 + 101, class109.field1348 & var9);
                int[] var14 = new int[class420.field6139];
                int var15 = 0;
                for (int var16 = -this.field4844; ~var16 >= ~this.field4844; ++var16) {
                    var15 += var13[class213.field2881 & var16];
                }
                int var17 = 0;
                while (var17 < class420.field6139) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field4844 + var17 & class213.field2881];
                    ++var17;
                    var15 = var13[class213.field2881 & this.field4844 + var17] + var18;
                }
                var8[var9 - -this.field4843 + -arg1] = var14;
            }
            for (int var10 = 0; ~class420.field6139 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field924 = arg2.method1350(31351) == 1;
                }
            } else {
                this.field4843 = arg2.method1350(31351);
            }
        } else {
            this.field4844 = arg2.method1350(31351);
        }
        ++field4847;
        int var5 = 93 / ((arg1 - -27) / 50);
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)S")
    public static final short method2109(int arg0, int arg1) {
        ++field4841;
        int var2 = (arg0 & 65087) >> 10;
        int var3 = 112 & arg0 >> 3;
        int var4 = arg0 & 127;
        int var5 = ~var4 >= -65 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (~var6 != -1) {
            var7 = (var5 << 8) / var6;
        } else {
            var7 = var5 << 1;
        }
        int var9 = 107 % ((arg1 - 74) / 34);
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
    public class347() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field4842;
        if (!arg0) {
            method2108(-107);
        }
        int[][] var3 = super.field927.method1774((byte) 122, arg1);
        if (super.field927.field4104) {
            int var4 = this.field4843 + this.field4843 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field4844 + this.field4844 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field4843 + arg1; ~var9 >= ~(this.field4843 + arg1); ++var9) {
                int[][] var19 = this.method449(0, true, class109.field1348 & var9);
                int[][] var20 = new int[3][class420.field6139];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field4844; var27 <= this.field4844; ++var27) {
                    int var37 = class213.field2881 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class420.field6139 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field4844 & class213.field2881;
                    int var33 = var22 - var25[var32];
                    int var34 = var23 - var26[var32];
                    ++var31;
                    int var35 = var21 - var24[var32];
                    int var36 = class213.field2881 & this.field4844 + var31;
                    var22 = var25[var36] + var33;
                    var21 = var24[var36] + var35;
                    var23 = var26[var36] + var34;
                }
                var8[-arg1 + var9 + this.field4843] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class420.field6139; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }
}
