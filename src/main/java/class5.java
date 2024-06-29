import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 extends class20 {

    @OriginalMember(owner = "mapview!c", name = "C", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "mapview!c", name = "F", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "mapview!c", name = "w", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "mapview!c", name = "x", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "mapview!c", name = "y", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "mapview!c", name = "z", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "mapview!c", name = "D", descriptor = "[B")
    public byte[] field101;

    @OriginalMember(owner = "mapview!c", name = "A", descriptor = "[I")
    public int[] field99;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "(IIII)V", line = 7)
    public final void method52(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field98;
        int var6 = this.field95;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field100;
        int var10 = this.field96;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field97 > 0) {
            int var13 = ((this.field97 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field97 << 16);
        }
        if (this.field102 > 0) {
            int var14 = ((this.field102 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field102 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class20.field248 * arg1 + arg0;
        int var16 = class20.field248 - arg2;
        if (arg1 + arg3 > class20.field249) {
            arg3 -= arg1 + arg3 - class20.field249;
        }
        if (arg1 < class20.field246) {
            int var17 = class20.field246 - arg1;
            arg3 -= var17;
            var15 += class20.field248 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class20.field252) {
            int var18 = arg0 + arg2 - class20.field252;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class20.field251) {
            int var19 = class20.field251 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method53(class20.field247, this.field101, this.field99, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 85)
    private static final void method53(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
