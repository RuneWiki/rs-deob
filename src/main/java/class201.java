import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class201 extends class440 {

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "I")
    private int field2836 = 1024;

    @OriginalMember(owner = "client!nt", name = "I", descriptor = "I")
    private int field2842 = 2048;

    @OriginalMember(owner = "client!nt", name = "L", descriptor = "I")
    private int field2845 = 3072;

    @OriginalMember(owner = "client!nt", name = "H", descriptor = "Lmf;")
    public static class382 field2841 = new class382(4);

    @OriginalMember(owner = "client!nt", name = "K", descriptor = "Z")
    public static boolean field2844 = false;

    @OriginalMember(owner = "client!nt", name = "D", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!nt", name = "G", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!nt", name = "J", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field2837;
        this.field2842 = -this.field2836 + this.field2845;
        if (arg0 != -9) {
            this.field2845 = -6;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2843;
        if (arg6 != -513) {
            field2844 = true;
        }
        if (arg7 >= 512 && ~arg1 <= -513 && (class199.field2812 + -2) * 512 >= arg7 && ~arg1 >= ~((class232.field3611 + -2) * 512)) {
            int var10 = class674.method3748(arg7, arg8, 118, arg1) - arg3;
            class318.field4690.method270(arg9, 0, 0);
            class282.field4228.method155(class318.field4690);
            class282.field4228.method197(arg7, var10, arg1, class287.field4269);
            class318.field4690.method270(-arg9, 0, 0);
            class282.field4228.method155(class318.field4690);
        } else {
            class287.field4269[0] = class287.field4269[1] = -1;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field2838;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int[] var4 = this.method2611(-62, arg1, 0);
            for (int var5 = 0; ~class549.field7715 < ~var5; ++var5) {
                var3[var5] = this.field2836 - -(var4[var5] * this.field2842 >> 12);
            }
        }
        int var6 = -117 % ((-56 - arg0) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field2840;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field6424 = ~arg1.method3826(false) == -2;
                }
            } else {
                this.field2845 = arg1.method3847((byte) 118);
            }
        } else {
            this.field2836 = arg1.method3847((byte) 118);
        }
        if (arg0 != 5) {
            field2844 = false;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
    public class201() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)[[I")
    public final int[][] method763(int arg0, int arg1) {
        ++field2839;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (super.field6417.field9606) {
            int[][] var4 = this.method2606(arg1, 0, -1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class549.field7715; ++var11) {
                var8[var11] = (var5[var11] * this.field2842 >> 12) + this.field2836;
                var9[var11] = (var6[var11] * this.field2842 >> 12) + this.field2836;
                var10[var11] = (var7[var11] * this.field2842 >> 12) + this.field2836;
            }
        }
        if (arg0 != -5766) {
            method1337(108);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "(I)V")
    public static void method1337(int arg0) {
        field2841 = null;
        if (arg0 != 5616) {
            field2841 = null;
        }
    }
}
