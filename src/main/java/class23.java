import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class23 extends class17 {

    @OriginalMember(owner = "mapview!la", name = "D", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "mapview!la", name = "E", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "mapview!la", name = "F", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "mapview!la", name = "G", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "mapview!la", name = "I", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "mapview!la", name = "K", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "mapview!la", name = "J", descriptor = "[B")
    public byte[] field225;

    @OriginalMember(owner = "mapview!la", name = "H", descriptor = "[I")
    public int[] field223;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 14)
    private static final void method151(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "(IIII)V", line = 47)
    public final void method152(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field222;
        int var6 = this.field219;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field224;
        int var10 = this.field221;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field226 > 0) {
            int var13 = ((this.field226 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field226 << 16);
        }
        if (this.field220 > 0) {
            int var14 = ((this.field220 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field220 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class17.field181 * arg1 + arg0;
        int var16 = class17.field181 - arg2;
        if (arg1 + arg3 > class17.field178) {
            arg3 -= arg1 + arg3 - class17.field178;
        }
        if (arg1 < class17.field177) {
            int var17 = class17.field177 - arg1;
            arg3 -= var17;
            var15 += class17.field181 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class17.field182) {
            int var18 = arg0 + arg2 - class17.field182;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class17.field179) {
            int var19 = class17.field179 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method151(class17.field180, this.field225, this.field223, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }
}
