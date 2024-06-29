import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 extends class1 {

    @OriginalMember(owner = "mapview!h", name = "A", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "mapview!h", name = "C", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "mapview!h", name = "E", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "mapview!h", name = "F", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "mapview!h", name = "G", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "mapview!h", name = "H", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "mapview!h", name = "D", descriptor = "[B")
    public byte[] field180;

    @OriginalMember(owner = "mapview!h", name = "B", descriptor = "[I")
    public int[] field178;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 6)
    private static final void method100(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "(IIII)V", line = 44)
    public final void method101(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field177;
        int var6 = this.field183;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field184;
        int var10 = this.field181;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field179 > 0) {
            int var13 = ((this.field179 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field179 << 16);
        }
        if (this.field182 > 0) {
            int var14 = ((this.field182 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field182 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class1.field3 * arg1 + arg0;
        int var16 = class1.field3 - arg2;
        if (arg1 + arg3 > class1.field2) {
            arg3 -= arg1 + arg3 - class1.field2;
        }
        if (arg1 < class1.field4) {
            int var17 = class1.field4 - arg1;
            arg3 -= var17;
            var15 += class1.field3 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class1.field7) {
            int var18 = arg0 + arg2 - class1.field7;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class1.field5) {
            int var19 = class1.field5 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method100(class1.field6, this.field180, this.field178, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }
}
