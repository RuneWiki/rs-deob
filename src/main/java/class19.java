import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class19 extends Draw2D {

    @OriginalMember(owner = "mapview!k", name = "B", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "mapview!k", name = "D", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "mapview!k", name = "E", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "mapview!k", name = "G", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "mapview!k", name = "H", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "mapview!k", name = "I", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "mapview!k", name = "A", descriptor = "[B")
    public byte[] field164;

    @OriginalMember(owner = "mapview!k", name = "F", descriptor = "[I")
    public int[] field168;

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "(IIII)V", line = 13)
    public final void method82(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field171;
        int var6 = this.field165;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field166;
        int var10 = this.field170;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field167 > 0) {
            int var13 = ((this.field167 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field167 << 16);
        }
        if (this.field169 > 0) {
            int var14 = ((this.field169 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field169 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = Draw2D.field310 * arg1 + arg0;
        int var16 = Draw2D.field310 - arg2;
        if (arg1 + arg3 > Draw2D.field307) {
            arg3 -= arg1 + arg3 - Draw2D.field307;
        }
        if (arg1 < Draw2D.field312) {
            int var17 = Draw2D.field312 - arg1;
            arg3 -= var17;
            var15 += Draw2D.field310 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > Draw2D.field309) {
            int var18 = arg0 + arg2 - Draw2D.field309;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < Draw2D.field308) {
            int var19 = Draw2D.field308 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method83(Draw2D.field306, this.field164, this.field168, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 90)
    private static final void method83(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
