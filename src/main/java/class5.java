import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class724 {

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field39 = -1;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(FZIFIFLcn;IFI[BFII)V")
    public static final void method12(float arg0, boolean arg1, int arg2, float arg3, int arg4, float arg5, class516 arg6, int arg7, float arg8, int arg9, byte[] arg10, float arg11, int arg12, int arg13) {
        ++field40;
        int var14 = arg9 * arg12;
        float[] var15 = new float[var14];
        for (int var16 = 0; arg7 > var16; ++var16) {
            int var19 = arg2;
            arg6.method2848(arg4, arg9, arg5 / (float) arg4, arg13, arg8 * 127.0F, 0, arg0 / (float) arg12, arg11 / (float) arg9, var15, arg12, 1);
            arg11 *= 2.0F;
            arg5 *= 2.0F;
            arg8 = arg3 * arg8;
            arg0 *= 2.0F;
            for (int var20 = 0; var20 < var14; ++var20) {
                arg10[var19] = (byte) ((int) ((float) arg10[var19] + var15[var20]));
                ++var19;
            }
        }
        int var17 = arg2;
        for (int var18 = 0; ~var18 > ~var14; ++var18) {
            arg10[var17] = (byte) (arg10[var17] + 127);
            ++var17;
        }
        if (arg1) {
            method12(-1.6836507F, true, 101, -0.5326127F, 104, -0.6777266F, (class516) null, -49, -1.3125609F, 51, (byte[]) null, 0.05877325F, -34, -101);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field38;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335 && this.method4066(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field10118 * super.field10118;
            for (int var8 = 0; ~var8 > ~class687.field9628; ++var8) {
                int var9 = super.field10110[var8 % super.field10119 + var7];
                var6[var8] = class321.method1919(var9 << 4, 4080);
                var5[var8] = class321.method1919(4080, var9 >> 4);
                var4[var8] = class321.method1919(var9, 16711680) >> 12;
            }
        }
        if (arg0 >= -76) {
            this.method2(54, -2);
        }
        return var3;
    }
}
