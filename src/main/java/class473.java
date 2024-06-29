import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class473 extends class585 {

    @OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
    private int field6629 = 1;

    @OriginalMember(owner = "client!jea", name = "I", descriptor = "I")
    private int field6631 = 1;

    @OriginalMember(owner = "client!jea", name = "L", descriptor = "Luh;")
    public static class176 field6634 = new class176(0, 2, 2, 1);

    @OriginalMember(owner = "client!jea", name = "E", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!jea", name = "H", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!jea", name = "J", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!jea", name = "K", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
    public class473() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        ++field6633;
        if (arg0) {
            field6634 = null;
        }
        int[][] var3 = super.field8265.method1576((byte) -48, arg1);
        if (super.field8265.field3546) {
            int var4 = this.field6631 + 1 + this.field6631;
            int var5 = 65536 / var4;
            int var6 = this.field6629 - (-this.field6629 - 1);
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field6631 + arg1; ~(arg1 - -this.field6631) <= ~var9; ++var9) {
                int[][] var19 = this.method3417(0, var9 & class305.field4391, (byte) 113);
                int[][] var20 = new int[3][class293.field4278];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field6629; this.field6629 >= var27; ++var27) {
                    int var37 = var27 & class625.field8759;
                    var23 += var26[var37];
                    var21 += var24[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class293.field4278) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field6629 & class625.field8759;
                    int var33 = var22 - var25[var32];
                    ++var31;
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = this.field6629 + var31 & class625.field8759;
                    var22 = var25[var36] + var33;
                    var23 = var26[var36] + var34;
                    var21 = var24[var36] + var35;
                }
                var8[var9 - -this.field6631 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class293.field4278 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIZII)V")
    public static final void method2811(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field6630;
        long var6 = (long) (arg5 | (!arg3 ? 0 : Integer.MIN_VALUE));
        class787 var8 = (class787) class220.field3409.method2242(var6, -1);
        if (var8 == null) {
            var8 = new class787();
            class220.field3409.method2241(-101, var6, var8);
        }
        if (arg4 != 1) {
            field6634 = null;
        }
        if (~arg0 <= ~var8.field10809.length) {
            int[] var9 = new int[arg0 + 1];
            int[] var10 = new int[arg0 + 1];
            for (int var11 = 0; var8.field10809.length > var11; ++var11) {
                var9[var11] = var8.field10809[var11];
                var10[var11] = var8.field10805[var11];
            }
            for (int var12 = var8.field10809.length; arg0 > var12; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field10805 = var10;
            var8.field10809 = var9;
        }
        var8.field10809[arg0] = arg1;
        var8.field10805[arg0] = arg2;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field6628;
        if (arg1 <= 123) {
            return null;
        } else {
            int[] var3 = super.field8255.method1637(-29827, arg0);
            if (super.field8255.field3677) {
                int var4 = this.field6631 - -1 + this.field6631;
                int var5 = 65536 / var4;
                int var6 = this.field6629 + 1 + this.field6629;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = arg0 - this.field6631; ~var9 >= ~(this.field6631 + arg0); ++var9) {
                    int[] var13 = this.method3415(-128, 0, class305.field4391 & var9);
                    int[] var14 = new int[class293.field4278];
                    int var15 = 0;
                    for (int var16 = -this.field6629; this.field6629 >= var16; ++var16) {
                        var15 += var13[var16 & class625.field8759];
                    }
                    int var17 = 0;
                    while (~var17 > ~class293.field4278) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class625.field8759 & -this.field6629 + var17];
                        ++var17;
                        var15 = var13[class625.field8759 & this.field6629 + var17] + var18;
                    }
                    var8[var9 - arg0 + this.field6631] = var14;
                }
                for (int var10 = 0; class293.field4278 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var12 > ~var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field6634 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field8266 = arg0.method2964((byte) 104) == 1;
                }
            } else {
                this.field6631 = arg0.method2964((byte) 52);
            }
        } else {
            this.field6629 = arg0.method2964((byte) 107);
        }
        ++field6632;
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
    public static void method2812(int arg0) {
        field6634 = null;
        if (arg0 != 1) {
            field6634 = null;
        }
    }
}
