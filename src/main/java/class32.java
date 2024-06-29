import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class32 extends class12 {

    @OriginalMember(owner = "mapview!q", name = "A", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "mapview!q", name = "B", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "mapview!q", name = "C", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "mapview!q", name = "D", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "mapview!q", name = "F", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "mapview!q", name = "G", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "mapview!q", name = "E", descriptor = "[B")
    public byte[] field399;

    @OriginalMember(owner = "mapview!q", name = "z", descriptor = "[I")
    public int[] field394;

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "(IIII)V", line = 15)
    public final void method224(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field396;
        int var6 = this.field401;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field398;
        int var10 = this.field400;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field395 > 0) {
            int var13 = ((this.field395 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field395 << 16);
        }
        if (this.field397 > 0) {
            int var14 = ((this.field397 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field397 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class12.field213 * arg1 + arg0;
        int var16 = class12.field213 - arg2;
        if (arg1 + arg3 > class12.field215) {
            arg3 -= arg1 + arg3 - class12.field215;
        }
        if (arg1 < class12.field216) {
            int var17 = class12.field216 - arg1;
            arg3 -= var17;
            var15 += class12.field213 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class12.field211) {
            int var18 = arg0 + arg2 - class12.field211;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class12.field217) {
            int var19 = class12.field217 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method225(class12.field212, this.field399, this.field394, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 98)
    private static final void method225(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
