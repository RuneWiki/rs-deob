import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class27 extends class15 {

    @OriginalMember(owner = "mapview!o", name = "M", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "mapview!o", name = "N", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "mapview!o", name = "O", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "mapview!o", name = "P", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "mapview!o", name = "Q", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "mapview!o", name = "R", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "mapview!o", name = "S", descriptor = "[B")
    public byte[] field387;

    @OriginalMember(owner = "mapview!o", name = "L", descriptor = "[I")
    public int[] field380;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "(IIII)V", line = 7)
    public final void method199(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field385;
        int var6 = this.field382;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field386;
        int var10 = this.field381;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field384 > 0) {
            int var13 = ((this.field384 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field384 << 16);
        }
        if (this.field383 > 0) {
            int var14 = ((this.field383 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field383 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class15.field175 * arg1 + arg0;
        int var16 = class15.field175 - arg2;
        if (arg1 + arg3 > class15.field171) {
            arg3 -= arg1 + arg3 - class15.field171;
        }
        if (arg1 < class15.field173) {
            int var17 = class15.field173 - arg1;
            arg3 -= var17;
            var15 += class15.field175 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class15.field176) {
            int var18 = arg0 + arg2 - class15.field176;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class15.field174) {
            int var19 = class15.field174 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method200(class15.field172, this.field387, this.field380, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 92)
    private static final void method200(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
