import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class36 extends class25 {

    @OriginalMember(owner = "mapview!v", name = "y", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "mapview!v", name = "A", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "mapview!v", name = "B", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "mapview!v", name = "C", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "mapview!v", name = "E", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "mapview!v", name = "F", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "mapview!v", name = "z", descriptor = "[B")
    public byte[] field450;

    @OriginalMember(owner = "mapview!v", name = "D", descriptor = "[I")
    public int[] field454;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 12)
    private static final void method241(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "(IIII)V", line = 54)
    public final void method242(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field451;
        int var6 = this.field456;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field449;
        int var10 = this.field452;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field453 > 0) {
            int var13 = ((this.field453 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field453 << 16);
        }
        if (this.field455 > 0) {
            int var14 = ((this.field455 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field455 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class25.field330 * arg1 + arg0;
        int var16 = class25.field330 - arg2;
        if (arg1 + arg3 > class25.field329) {
            arg3 -= arg1 + arg3 - class25.field329;
        }
        if (arg1 < class25.field324) {
            int var17 = class25.field324 - arg1;
            arg3 -= var17;
            var15 += class25.field330 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class25.field328) {
            int var18 = arg0 + arg2 - class25.field328;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class25.field326) {
            int var19 = class25.field326 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method241(class25.field325, this.field450, this.field454, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }
}
