import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class264 extends class84 {

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    private int field4284 = 1;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    private int field4285 = 1;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "Z")
    public static boolean field4286 = false;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field4289 = 1;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Lcc;")
    public static class216 field4282 = new class216(5);

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "Lqi;")
    public static class131 field4291 = null;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public static int field4290 = 0;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class264() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field4279;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field1217 = arg0.method1111(255) == 1;
                }
            } else {
                this.field4285 = arg0.method1111(255);
            }
        } else {
            this.field4284 = arg0.method1111(255);
        }
        if (arg1 < 87) {
            method1847(-77, 119, 41, -31, -80, -124, 62);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
    public static final void method1846(int arg0, int arg1, int arg2) {
        class238.field3806 = true;
        class113.field1622 = arg0;
        class232.field3727 = arg1;
        class286.field4550 = arg2;
        class101.field1496 = -1;
        class286.field4540 = -1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 3;
        if ((arg3 & 1) == 1) {
            int var8 = arg4;
            arg4 = arg1;
            arg1 = var8;
        }
        ++field4281;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return -arg4 - -8 - arg0;
        } else {
            return arg6 == var7 ? 7 - (arg1 + -1 + arg2) : arg0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field4283;
        if (arg1 != -18) {
            return null;
        } else {
            int[][] var3 = super.field1211.method193((byte) -127, arg0);
            if (super.field1211.field321) {
                int var4 = this.field4285 + 1 + this.field4285;
                int var5 = this.field4284 + 1 - -this.field4284;
                int[][][] var6 = new int[var4][][];
                int var7 = 65536 / var5;
                for (int var8 = arg0 - this.field4285; ~(this.field4285 + arg0) <= ~var8; ++var8) {
                    int[][] var19 = this.method611(0, (byte) -82, var8 & class58.field822);
                    int[][] var20 = new int[3][class20.field221];
                    int var21 = 0;
                    int[] var22 = var19[0];
                    int var23 = 0;
                    int var24 = 0;
                    int[] var25 = var19[2];
                    int[] var26 = var19[1];
                    for (int var27 = -this.field4284; ~this.field4284 <= ~var27; ++var27) {
                        int var37 = var27 & class36.field497;
                        var21 += var25[var37];
                        var24 += var26[var37];
                        var23 += var22[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (class20.field221 > var31) {
                        var28[var31] = var7 * var23 >> 16;
                        var29[var31] = var7 * var24 >> 16;
                        var30[var31] = var7 * var21 >> 16;
                        int var32 = class36.field497 & -this.field4284 + var31;
                        int var33 = var23 - var22[var32];
                        int var34 = var21 - var25[var32];
                        int var35 = var24 - var26[var32];
                        ++var31;
                        int var36 = this.field4284 + var31 & class36.field497;
                        var21 = var25[var36] + var34;
                        var23 = var22[var36] + var33;
                        var24 = var26[var36] + var35;
                    }
                    var6[-arg0 + var8 + this.field4285] = var20;
                }
                int var9 = 65536 / var4;
                int[] var10 = var3[1];
                int[] var11 = var3[0];
                int[] var12 = var3[2];
                for (int var13 = 0; var13 < class20.field221; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var6[var17];
                        var16 += var18[2][var13];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                    }
                    var11[var13] = var9 * var14 >> 16;
                    var10[var13] = var9 * var15 >> 16;
                    var12[var13] = var9 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)V")
    public static void method1848(int arg0) {
        if (arg0 > -68) {
            method1848(111);
        }
        field4282 = null;
        field4291 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        if (arg0 > -125) {
            this.method31((class152) null, (byte) 39, 73);
        }
        ++field4280;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int var4 = this.field4285 + this.field4285 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4284 + this.field4284 + 1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field4285 + arg1; var9 <= arg1 - -this.field4285; ++var9) {
                int[] var13 = this.method612(0, var9 & class58.field822, false);
                int var14 = 0;
                int[] var15 = new int[class20.field221];
                for (int var16 = -this.field4284; ~var16 >= ~this.field4284; ++var16) {
                    var14 += var13[class36.field497 & var16];
                }
                int var17 = 0;
                while (class20.field221 > var17) {
                    var15[var17] = var8 * var14 >> 16;
                    int var18 = var14 - var13[-this.field4284 + var17 & class36.field497];
                    ++var17;
                    var14 = var13[this.field4284 + var17 & class36.field497] + var18;
                }
                var7[-arg1 + var9 - -this.field4285] = var15;
            }
            for (int var10 = 0; var10 < class20.field221; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }
}
