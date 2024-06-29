import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class34 extends class32 {

    @OriginalMember(owner = "mapview!s", name = "x", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "mapview!s", name = "y", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "mapview!s", name = "z", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "mapview!s", name = "D", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "mapview!s", name = "E", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "mapview!s", name = "F", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "mapview!s", name = "B", descriptor = "[B")
    public byte[] field469;

    @OriginalMember(owner = "mapview!s", name = "A", descriptor = "[I")
    public int[] field468;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 15)
    private static final void method226(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "(IIII)V", line = 70)
    public final void method227(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field465;
        int var6 = this.field470;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field471;
        int var10 = this.field472;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field467 > 0) {
            int var13 = ((this.field467 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field467 << 16);
        }
        if (this.field466 > 0) {
            int var14 = ((this.field466 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field466 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class32.field445 * arg1 + arg0;
        int var16 = class32.field445 - arg2;
        if (arg1 + arg3 > class32.field448) {
            arg3 -= arg1 + arg3 - class32.field448;
        }
        if (arg1 < class32.field444) {
            int var17 = class32.field444 - arg1;
            arg3 -= var17;
            var15 += class32.field445 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class32.field447) {
            int var18 = arg0 + arg2 - class32.field447;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class32.field442) {
            int var19 = class32.field442 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method226(class32.field446, this.field469, this.field468, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(II)V", line = 145)
    public final void method228(int arg0, int arg1) {
        int var3 = this.field467 + arg0;
        int var4 = this.field466 + arg1;
        int var5 = class32.field445 * var4 + var3;
        int var6 = 0;
        int var7 = this.field470;
        int var8 = this.field465;
        int var9 = class32.field445 - var8;
        int var10 = 0;
        if (var4 < class32.field444) {
            int var11 = class32.field444 - var4;
            var7 -= var11;
            var4 = class32.field444;
            var6 += var8 * var11;
            var5 += class32.field445 * var11;
        }
        if (var4 + var7 > class32.field448) {
            var7 -= var4 + var7 - class32.field448;
        }
        if (var3 < class32.field442) {
            int var12 = class32.field442 - var3;
            var8 -= var12;
            var3 = class32.field442;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class32.field447) {
            int var13 = var3 + var8 - class32.field447;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method229(class32.field446, this.field469, this.field468, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "()V", line = 202)
    protected class34() {
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 206)
    private static final void method229(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                byte var14 = arg1[arg4++];
                if (var14 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var14 & 0xFF];
                }
                byte var15 = arg1[arg4++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg4++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg4++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var17 & 0xFF];
                }
            }
            for (int var18 = var11; var18 < 0; var18++) {
                byte var19 = arg1[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var19 & 0xFF];
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }
}
