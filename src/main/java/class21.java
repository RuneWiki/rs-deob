import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class21 extends class23 {

    @OriginalMember(owner = "mapview!ka", name = "v", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "mapview!ka", name = "x", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "mapview!ka", name = "y", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "mapview!ka", name = "A", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "mapview!ka", name = "B", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "mapview!ka", name = "C", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "mapview!ka", name = "z", descriptor = "[B")
    public byte[] field259;

    @OriginalMember(owner = "mapview!ka", name = "w", descriptor = "[I")
    public int[] field256;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "(IIII)V", line = 16)
    public final void method109(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field261;
        int var6 = this.field257;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field262;
        int var10 = this.field258;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field260 > 0) {
            int var13 = ((this.field260 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field260 << 16);
        }
        if (this.field255 > 0) {
            int var14 = ((this.field255 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field255 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class23.field269 * arg1 + arg0;
        int var16 = class23.field269 - arg2;
        if (arg1 + arg3 > class23.field273) {
            arg3 -= arg1 + arg3 - class23.field273;
        }
        if (arg1 < class23.field274) {
            int var17 = class23.field274 - arg1;
            arg3 -= var17;
            var15 += class23.field269 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class23.field275) {
            int var18 = arg0 + arg2 - class23.field275;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class23.field272) {
            int var19 = class23.field272 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method110(class23.field270, this.field259, this.field256, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 97)
    private static final void method110(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
