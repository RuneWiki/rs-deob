import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class47 extends class224 {

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    private int field598 = 1;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    private int field597 = 1;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "Ljava/lang/String;")
    public static String field602 = "Connection lost.";

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "[I")
    public static int[] field604 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "Ljava/lang/String;")
    public static String field600 = "green:";

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)V")
    public static void method355(int arg0) {
        field600 = null;
        field602 = null;
        if (arg0 == 23171) {
            field604 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)V")
    public static final void method356(int arg0) {
        if (arg0 == -1) {
            ++field603;
            class229.field3706.method1430(arg0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public static final void method357(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field605;
        if (class147.field2157 == 1) {
            class273.field4349[class118.field1740 / 100].method71(class38.field513 + -8, class272.field4322 + -8);
        }
        if (class147.field2157 == 2) {
            class273.field4349[4 - -(class118.field1740 / 100)].method71(class38.field513 - 8, class272.field4322 + -8);
        }
        class212.method1438(4);
        if (arg2 != 24651) {
            field599 = 120;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field606;
        if (arg1 != 1) {
            field600 = null;
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int var4 = this.field597 - -1 + this.field597;
            int var5 = 65536 / var4;
            int var6 = this.field598 + this.field598 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field597 + arg0; var9 <= this.field597 + arg0; ++var9) {
                int[][] var19 = this.method1532(70, 0, class261.field4217 & var9);
                int[][] var20 = new int[3][class78.field1108];
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var19[0];
                int var24 = 0;
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field598; var27 <= this.field598; ++var27) {
                    int var37 = var27 & class206.field3220;
                    var24 += var26[var37];
                    var21 += var25[var37];
                    var22 += var23[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class78.field1108 > var31) {
                    var28[var31] = var7 * var22 >> 16;
                    var29[var31] = var7 * var21 >> 16;
                    var30[var31] = var7 * var24 >> 16;
                    int var32 = class206.field3220 & -this.field598 + var31;
                    int var33 = var22 - var23[var32];
                    ++var31;
                    int var34 = var21 - var25[var32];
                    int var35 = var24 - var26[var32];
                    int var36 = class206.field3220 & var31 - -this.field598;
                    var22 = var23[var36] + var33;
                    var21 = var25[var36] + var34;
                    var24 = var26[var36] + var35;
                }
                var8[-arg0 + this.field597 + var9] = var20;
            }
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            int[] var12 = var3[0];
            for (int var13 = 0; ~var13 > ~class78.field1108; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[1][var13];
                    var16 += var18[2][var13];
                    var15 += var18[0][var13];
                }
                var12[var13] = var5 * var15 >> 16;
                var11[var13] = var5 * var14 >> 16;
                var10[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            this.field597 = 103;
        }
        ++field607;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int var4 = this.field597 - -this.field597 + 1;
            int var5 = this.field598 + this.field598 + 1;
            int var6 = 65536 / var5;
            int var7 = 65536 / var4;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field597 + arg0; ~(this.field597 + arg0) <= ~var9; ++var9) {
                int[] var13 = this.method1527(var9 & class261.field4217, 0, (byte) 84);
                int[] var14 = new int[class78.field1108];
                int var15 = 0;
                for (int var16 = -this.field598; var16 <= this.field598; ++var16) {
                    var15 += var13[var16 & class206.field3220];
                }
                int var17 = 0;
                while (class78.field1108 > var17) {
                    var14[var17] = var6 * var15 >> 16;
                    int var18 = var15 - var13[class206.field3220 & -this.field598 + var17];
                    ++var17;
                    var15 = var13[class206.field3220 & this.field598 + var17] + var18;
                }
                var8[-arg0 + var9 - -this.field597] = var14;
            }
            for (int var10 = 0; ~class78.field1108 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var7 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BIIII)V")
    public static final void method358(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 98 / ((66 - arg0) / 47);
        if (arg1 >= arg3) {
            class8.method52(arg3, class106.field1637[arg4], arg1, arg2, true);
        } else {
            class8.method52(arg1, class106.field1637[arg4], arg3, arg2, true);
        }
        ++field608;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class47() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field3624 = ~arg0.method201(255) == -2;
                }
            } else {
                this.field597 = arg0.method201(255);
            }
        } else {
            this.field598 = arg0.method201(255);
        }
        if (arg2 >= -46) {
            this.method14(12, false);
        }
        ++field601;
    }
}
