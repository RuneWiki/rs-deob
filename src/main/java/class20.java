import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class20 extends class15 {

    @OriginalMember(owner = "mapview!l", name = "F", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "mapview!l", name = "G", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "mapview!l", name = "H", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "mapview!l", name = "I", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "mapview!l", name = "J", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "mapview!l", name = "L", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "mapview!l", name = "K", descriptor = "[B")
    public byte[] field211;

    @OriginalMember(owner = "mapview!l", name = "M", descriptor = "[I")
    public int[] field213;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 6)
    private static final void method120(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "(IIII)V", line = 49)
    public final void method121(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field212;
        int var6 = this.field206;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field208;
        int var10 = this.field207;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field209 > 0) {
            int var13 = ((this.field209 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field209 << 16);
        }
        if (this.field210 > 0) {
            int var14 = ((this.field210 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field210 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class15.field139 * arg1 + arg0;
        int var16 = class15.field139 - arg2;
        if (arg1 + arg3 > class15.field136) {
            arg3 -= arg1 + arg3 - class15.field136;
        }
        if (arg1 < class15.field134) {
            int var17 = class15.field134 - arg1;
            arg3 -= var17;
            var15 += class15.field139 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class15.field133) {
            int var18 = arg0 + arg2 - class15.field133;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class15.field135) {
            int var19 = class15.field135 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method120(class15.field138, this.field211, this.field213, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }
}
