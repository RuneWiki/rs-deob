import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class26 extends class260 {

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    private int field706 = 1;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    private int field705 = 1;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "[I")
    public static int[] field700 = new int[1000];

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "Loh;")
    public static class263 field703 = class253.method1681(-122, "gelb:");

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class26() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field701;
        if (arg1 != 5701) {
            this.method174(28, -44);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4505 = arg2.method1301(arg1 + -14018) == 1;
                }
            } else {
                this.field705 = arg2.method1301(-8317);
            }
        } else {
            this.field706 = arg2.method1301(-8317);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field698;
        if (arg1 != 5) {
            this.field706 = 68;
        }
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (super.field4509.field4346) {
            int var4 = this.field705 + 1 + this.field705;
            int[][][] var5 = new int[var4][][];
            int var6 = 65536 / var4;
            int var7 = this.field706 + this.field706 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg0 - this.field705; var9 <= this.field705 + arg0; ++var9) {
                int[][] var19 = this.method1712((byte) 108, 0, var9 & class277.field4846);
                int var20 = 0;
                int[][] var21 = new int[3][class49.field1052];
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[1];
                int[] var25 = var19[2];
                int[] var26 = var19[0];
                for (int var27 = -this.field706; var27 <= this.field706; ++var27) {
                    int var37 = var27 & class166.field3024;
                    var20 += var26[var37];
                    var23 += var25[var37];
                    var22 += var24[var37];
                }
                int[] var28 = var21[0];
                int[] var29 = var21[1];
                int[] var30 = var21[2];
                int var31 = 0;
                while (~class49.field1052 < ~var31) {
                    var28[var31] = var8 * var20 >> 16;
                    var29[var31] = var8 * var22 >> 16;
                    var30[var31] = var8 * var23 >> 16;
                    int var32 = class166.field3024 & var31 - this.field706;
                    ++var31;
                    int var33 = var20 - var26[var32];
                    int var34 = var23 - var25[var32];
                    int var35 = var22 - var24[var32];
                    int var36 = class166.field3024 & this.field706 + var31;
                    var22 = var24[var36] + var35;
                    var23 = var25[var36] + var34;
                    var20 = var26[var36] + var33;
                }
                var5[-arg0 + var9 + this.field705] = var21;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class49.field1052; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var5[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var6 * var14 >> 16;
                var11[var13] = var6 * var15 >> 16;
                var12[var13] = var6 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public static void method183(int arg0) {
        field700 = null;
        field703 = null;
        if (arg0 < 107) {
            method183(-24);
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)Loh;")
    public static final class263 method184(int arg0, int arg1) {
        int var2 = -112 / ((68 - arg0) / 54);
        ++field699;
        return class124.method797(-44, new class263[] { class136.method891(-95, arg1 >> 24 & 255), class41.field921, class136.method891(-104, 255 & arg1 >> 16), class41.field921, class136.method891(-52, 255 & arg1 >> 8), class41.field921, class136.method891(-52, arg1 & 255) });
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field704;
        int[] var3 = super.field4511.method304(arg0, false);
        if (arg1 != 255) {
            field700 = null;
        }
        if (super.field4511.field1029) {
            int var4 = this.field705 + this.field705 - -1;
            int var5 = this.field706 + this.field706 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field705 + arg0; this.field705 + arg0 >= var9; ++var9) {
                int[] var13 = this.method1711(var9 & class277.field4846, 0, false);
                int[] var14 = new int[class49.field1052];
                int var15 = 0;
                for (int var16 = -this.field706; var16 <= this.field706; ++var16) {
                    var15 += var13[class166.field3024 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class49.field1052) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class166.field3024 & -this.field706 + var17];
                    ++var17;
                    var15 = var13[this.field706 + var17 & class166.field3024] + var18;
                }
                var8[-arg0 + this.field705 + var9] = var14;
            }
            for (int var10 = 0; var10 < class49.field1052; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        return var3;
    }
}
