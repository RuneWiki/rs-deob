import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class20 extends class37 {

    @OriginalMember(owner = "mapview!ja", name = "I", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "mapview!ja", name = "J", descriptor = "I")
    public int field227;

    @OriginalMember(owner = "mapview!ja", name = "K", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "mapview!ja", name = "L", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "mapview!ja", name = "M", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "mapview!ja", name = "P", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "mapview!ja", name = "N", descriptor = "[B")
    public byte[] field231;

    @OriginalMember(owner = "mapview!ja", name = "O", descriptor = "[I")
    public int[] field232;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 8)
    private static final void method121(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "(IIII)V", line = 43)
    public final void method122(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field230;
        int var6 = this.field226;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field228;
        int var10 = this.field229;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field227 > 0) {
            int var13 = ((this.field227 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field227 << 16);
        }
        if (this.field233 > 0) {
            int var14 = ((this.field233 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field233 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class37.field460 * arg1 + arg0;
        int var16 = class37.field460 - arg2;
        if (arg1 + arg3 > class37.field454) {
            arg3 -= arg1 + arg3 - class37.field454;
        }
        if (arg1 < class37.field459) {
            int var17 = class37.field459 - arg1;
            arg3 -= var17;
            var15 += class37.field460 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class37.field458) {
            int var18 = arg0 + arg2 - class37.field458;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class37.field457) {
            int var19 = class37.field457 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method121(class37.field456, this.field231, this.field232, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }
}
