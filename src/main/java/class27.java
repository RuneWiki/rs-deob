import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class27 extends class19 {

    @OriginalMember(owner = "mapview!na", name = "A", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "mapview!na", name = "B", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "mapview!na", name = "D", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "mapview!na", name = "E", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "mapview!na", name = "F", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "mapview!na", name = "J", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "mapview!na", name = "I", descriptor = "[B")
    public byte[] field381;

    @OriginalMember(owner = "mapview!na", name = "G", descriptor = "[I")
    public int[] field380;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "(IIII)V", line = 15)
    public final void method201(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field375;
        int var6 = this.field378;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field379;
        int var10 = this.field376;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field377 > 0) {
            int var13 = ((this.field377 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field377 << 16);
        }
        if (this.field382 > 0) {
            int var14 = ((this.field382 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field382 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class19.field201 * arg1 + arg0;
        int var16 = class19.field201 - arg2;
        if (arg1 + arg3 > class19.field204) {
            arg3 -= arg1 + arg3 - class19.field204;
        }
        if (arg1 < class19.field202) {
            int var17 = class19.field202 - arg1;
            arg3 -= var17;
            var15 += class19.field201 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class19.field206) {
            int var18 = arg0 + arg2 - class19.field206;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class19.field205) {
            int var19 = class19.field205 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method202(class19.field203, this.field381, this.field380, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 106)
    private static final void method202(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
