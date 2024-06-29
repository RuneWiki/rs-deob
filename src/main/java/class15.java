import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class15 extends class8 {

    @OriginalMember(owner = "mapview!ha", name = "y", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "mapview!ha", name = "z", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "mapview!ha", name = "A", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "mapview!ha", name = "B", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "mapview!ha", name = "C", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "mapview!ha", name = "E", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "mapview!ha", name = "F", descriptor = "[B")
    public byte[] field125;

    @OriginalMember(owner = "mapview!ha", name = "D", descriptor = "[I")
    public int[] field123;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 11)
    private static final void method85(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "(IIII)V", line = 45)
    public final void method86(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field121;
        int var6 = this.field124;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field120;
        int var10 = this.field119;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field118 > 0) {
            int var13 = ((this.field118 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field118 << 16);
        }
        if (this.field122 > 0) {
            int var14 = ((this.field122 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field122 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class8.field66 * arg1 + arg0;
        int var16 = class8.field66 - arg2;
        if (arg1 + arg3 > class8.field67) {
            arg3 -= arg1 + arg3 - class8.field67;
        }
        if (arg1 < class8.field72) {
            int var17 = class8.field72 - arg1;
            arg3 -= var17;
            var15 += class8.field66 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class8.field68) {
            int var18 = arg0 + arg2 - class8.field68;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class8.field69) {
            int var19 = class8.field69 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method85(class8.field71, this.field125, this.field123, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }
}
