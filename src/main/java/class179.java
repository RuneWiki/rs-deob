import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class179 extends class377 {

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Ltd;")
    private class515 field2477;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "Ltd;")
    private class515 field2478;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Ltd;")
    private class515 field2480;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "Ltd;")
    public class515 field2482;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Ltd;")
    private class515 field2483;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "Ltd;")
    private class515 field2484;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Z")
    public static boolean field2476;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIII)V")
    public final void method413(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -2) {
            this.field2478 = null;
        }
        ++field2479;
        if (arg0) {
            int[] var5 = new int[4];
            class211.field3164.method358(var5);
            class211.field3164.method297(arg1, arg2, arg1 - -super.field5449.field5617, super.field5449.field5613 + arg2);
            int var6 = this.field2477.method784();
            int var7 = this.field2477.method780();
            int var8 = this.field2483.method784();
            int var9 = this.field2483.method780();
            this.field2477.method3128(arg1, (super.field5449.field5613 - var7) / 2 + arg2);
            this.field2483.method3128(super.field5449.field5617 + arg1 + -var8, (-var9 + super.field5449.field5613) / 2 + arg2);
            class211.field3164.method297(arg1, arg2, super.field5449.field5617 + arg1, arg2 - -this.field2480.method780());
            this.field2480.method3135(arg1 + var6, arg2, super.field5449.field5617 - var6 + -var8, super.field5449.field5613);
            int var10 = this.field2484.method780();
            class211.field3164.method297(arg1, super.field5449.field5613 + arg2 + -var10, arg1 - -super.field5449.field5617, super.field5449.field5613 + arg2);
            this.field2484.method3135(arg1 - -var6, super.field5449.field5613 + arg2 + -var10, super.field5449.field5617 - var6 + -var8, super.field5449.field5613);
            class211.field3164.method297(var5[0], var5[1], var5[2], var5[3]);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
    public void method149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2485;
        if (arg2 != 2) {
            this.field2480 = null;
        }
        this.field2482.method3135(arg1, arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public final void method414(byte arg0) {
        super.method414((byte) 127);
        ++field2481;
        if (arg0 > 126) {
            class629 var2 = (class629) super.field5449;
            this.field2482 = class181.method1279(super.field5452, 0, var2.field8913);
            this.field2478 = class181.method1279(super.field5452, 0, var2.field8908);
            this.field2477 = class181.method1279(super.field5452, 0, var2.field8911);
            this.field2483 = class181.method1279(super.field5452, 0, var2.field8915);
            this.field2480 = class181.method1279(super.field5452, 0, var2.field8918);
            this.field2484 = class181.method1279(super.field5452, 0, var2.field8914);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Z")
    public final boolean method418(boolean arg0) {
        ++field2475;
        if (!super.method418(arg0)) {
            return false;
        } else {
            class629 var2 = (class629) super.field5449;
            if (!super.field5452.method2609(0, var2.field8913)) {
                return false;
            } else if (!super.field5452.method2609(0, var2.field8908)) {
                return false;
            } else if (!super.field5452.method2609(0, var2.field8911)) {
                return false;
            } else if (!super.field5452.method2609(0, var2.field8915)) {
                return false;
            } else if (!arg0) {
                return true;
            } else if (!super.field5452.method2609(0, var2.field8918)) {
                return false;
            } else {
                return super.field5452.method2609(0, var2.field8914);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lla;Lla;Lnaa;)V")
    public class179(class423 arg0, class423 arg1, class629 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[FIIIIFFII[FI)V")
    public static final void method1272(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9, float[] arg10, int arg11) {
        if (arg4 == 32476) {
            ++field2474;
            int var12 = arg9 - arg5;
            int var13 = arg0 - arg11;
            int var14 = arg8 - arg2;
            float var15 = arg10[2] * (float) var14 + arg10[1] * (float) var13 + arg10[0] * (float) var12;
            float var16 = arg10[5] * (float) var14 + arg10[3] * (float) var12 + arg10[4] * (float) var13;
            float var17 = arg10[8] * (float) var14 + arg10[6] * (float) var12 + arg10[7] * (float) var13;
            float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
            if (arg7 != 1.0F) {
                var18 = arg7 * var18;
            }
            float var19 = var16 + 0.5F + arg6;
            if (arg3 != 1) {
                if (~arg3 == -3) {
                    var18 = -var18;
                    var19 = -var19;
                } else if (arg3 == 3) {
                    float var20 = var18;
                    var18 = var19;
                    var19 = -var20;
                }
            } else {
                float var21 = var18;
                var18 = -var19;
                var19 = var21;
            }
            arg1[0] = var18;
            arg1[1] = var19;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBIZ)V")
    public final void method417(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field2486;
        int var5 = arg2 + this.field2477.method784();
        int var6 = arg2 + (super.field5449.field5617 - this.field2483.method784());
        int var7 = arg0 + this.field2480.method780();
        int var8 = arg0 + (super.field5449.field5613 - this.field2484.method780());
        int var9 = -var5 + var6;
        int var10 = var8 - var7;
        if (arg1 <= -69) {
            int var11 = var9 * this.method2339((byte) 6) / 10000;
            int[] var12 = new int[4];
            class211.field3164.method358(var12);
            class211.field3164.method297(var5, var7, var5 + var11, var8);
            this.method149(var9, var5, 2, var7, var10);
            class211.field3164.method297(var5 + var11, var7, var6, var8);
            this.field2478.method3135(var5, var7, var9, var10);
            class211.field3164.method297(var12[0], var12[1], var12[2], var12[3]);
        }
    }
}
