import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class36 extends class31 {

    @OriginalMember(owner = "mapview!u", name = "D", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "mapview!u", name = "F", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "mapview!u", name = "G", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "mapview!u", name = "H", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "mapview!u", name = "I", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "mapview!u", name = "K", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "mapview!u", name = "E", descriptor = "[B")
    public byte[] field480;

    @OriginalMember(owner = "mapview!u", name = "J", descriptor = "[I")
    public int[] field485;

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "(IIII)V", line = 10)
    public final void method237(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field483;
        int var6 = this.field486;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field479;
        int var10 = this.field481;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field484 > 0) {
            int var13 = ((this.field484 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field484 << 16);
        }
        if (this.field482 > 0) {
            int var14 = ((this.field482 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field482 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class31.field428 * arg1 + arg0;
        int var16 = class31.field428 - arg2;
        if (arg1 + arg3 > class31.field433) {
            arg3 -= arg1 + arg3 - class31.field433;
        }
        if (arg1 < class31.field432) {
            int var17 = class31.field432 - arg1;
            arg3 -= var17;
            var15 += class31.field428 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class31.field431) {
            int var18 = arg0 + arg2 - class31.field431;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class31.field430) {
            int var19 = class31.field430 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method238(class31.field434, this.field480, this.field485, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 94)
    private static final void method238(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; var13++) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; var15++) {
                byte var16 = arg1[(arg3 >> 16) + var14];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }
}
