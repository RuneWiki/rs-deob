import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class602 extends class82 {

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    private int field8690 = 4096;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    private int field8692 = 4096;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    private int field8694 = 4096;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "[I")
    private int[] field8693 = new int[3];

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    private int field8695 = 409;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "[I")
    public static int[] field8688 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "[I")
    public static int[] field8696 = new int[50];

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "[Lfu;")
    public static class328[] field8699;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILos;)V", line = 8)
    public final void method198(int arg0, int arg1, class374 arg2) {
        int var4 = 30 / ((arg1 - -69) / 42);
        ++field8698;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var6 = arg2.method2128(true);
                            this.field8693[1] = class288.method1624(4080, var6 >> 4);
                            this.field8693[0] = class288.method1624(16711680, var6) << 4;
                            this.field8693[2] = class288.method1624(var6 >> 12, 0);
                        }
                    } else {
                        this.field8692 = arg2.method2136(false);
                    }
                } else {
                    this.field8690 = arg2.method2136(false);
                }
            } else {
                this.field8694 = arg2.method2136(false);
            }
        } else {
            this.field8695 = arg2.method2136(false);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 73)
    public class602() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 84)
    public static void method3466(byte arg0) {
        field8688 = null;
        field8696 = null;
        field8699 = null;
        if (arg0 != -32) {
            field8699 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIZI[FI)V", line = 105)
    public static final void method3467(int arg0, int arg1, int arg2, boolean arg3, int arg4, float[] arg5, int arg6) {
        ++field8697;
        if (~arg6 < -1 && !class415.method2366(-128, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class415.method2366(-122, arg0)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class53.method302((byte) -127, arg4);
            int var8 = 0;
            if (!arg3) {
                method3466((byte) -123);
            }
            int var9 = ~arg6 > ~arg0 ? arg6 : arg0;
            int var10 = arg6 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg5;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var8, arg2, arg6, arg0, 0, arg4, 5126, var12, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var14 = arg6 * var7;
                for (int var15 = 0; ~var7 < ~var15; ++var15) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var11 > var20; ++var20) {
                        for (int var21 = 0; ~var10 < ~var21; ++var21) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg6 = var10;
                arg0 = var11;
                ++var8;
                var11 >>= 1;
                var9 >>= 1;
                var10 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[[I", line = 207)
    public final int[][] method481(int arg0, int arg1) {
        ++field8689;
        int[][] var3 = super.field992.method3178(arg1, arg0 ^ arg0);
        if (super.field992.field7962) {
            int[][] var4 = this.method488(0, arg1, arg0 + -999);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class629.field9033 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field8693[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field8695) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field8693[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field8695 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field8693[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field8695) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field8692 * var12 >> 12;
                            var9[var11] = this.field8690 * var14 >> 12;
                            var10[var11] = this.field8694 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
