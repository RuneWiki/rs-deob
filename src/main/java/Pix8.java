import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class Pix8 extends Draw2D {

    @OriginalMember(owner = "mapview!f", name = "w", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "mapview!f", name = "x", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "mapview!f", name = "A", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "mapview!f", name = "B", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "mapview!f", name = "C", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "mapview!f", name = "D", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "mapview!f", name = "z", descriptor = "[B")
    public byte[] field74;

    @OriginalMember(owner = "mapview!f", name = "y", descriptor = "[I")
    public int[] field73;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 7)
    private static final void method36(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "(IIII)V", line = 40)
    public final void method37(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field78;
        int var6 = this.field72;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field75;
        int var10 = this.field76;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field71 > 0) {
            int var13 = ((this.field71 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field71 << 16);
        }
        if (this.field77 > 0) {
            int var14 = ((this.field77 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field77 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = Draw2D.width * arg1 + arg0;
        int var16 = Draw2D.width - arg2;
        if (arg1 + arg3 > Draw2D.bottom) {
            arg3 -= arg1 + arg3 - Draw2D.bottom;
        }
        if (arg1 < Draw2D.top) {
            int var17 = Draw2D.top - arg1;
            arg3 -= var17;
            var15 += Draw2D.width * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > Draw2D.right) {
            int var18 = arg0 + arg2 - Draw2D.right;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < Draw2D.left) {
            int var19 = Draw2D.left - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method36(Draw2D.data, this.field74, this.field73, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }
}
