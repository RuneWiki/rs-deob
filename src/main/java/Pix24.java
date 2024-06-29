import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class Pix24 extends Draw2D {

    @OriginalMember(owner = "mapview!f", name = "A", descriptor = "[I")
    public int[] pixels;

    @OriginalMember(owner = "mapview!f", name = "E", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "mapview!f", name = "C", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "mapview!f", name = "F", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "mapview!f", name = "B", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "mapview!f", name = "H", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "mapview!f", name = "G", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(II)V", line = 11)
    public final void method22(int arg0, int arg1) {
        int var3 = this.field67 + arg0;
        int var4 = this.field68 + arg1;
        int var5 = Draw2D.field310 * var4 + var3;
        int var6 = 0;
        int var7 = this.field63;
        int var8 = this.field64;
        int var9 = Draw2D.field310 - var8;
        int var10 = 0;
        if (var4 < Draw2D.field312) {
            int var11 = Draw2D.field312 - var4;
            var7 -= var11;
            var4 = Draw2D.field312;
            var6 += var8 * var11;
            var5 += Draw2D.field310 * var11;
        }
        if (var4 + var7 > Draw2D.field307) {
            var7 -= var4 + var7 - Draw2D.field307;
        }
        if (var3 < Draw2D.field308) {
            int var12 = Draw2D.field308 - var3;
            var8 -= var12;
            var3 = Draw2D.field308;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > Draw2D.field309) {
            int var13 = var3 + var8 - Draw2D.field309;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method23(Draw2D.field306, this.pixels, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[IIIIIII)V", line = 88)
    private static final void method23(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; var8++) {
            int var9 = arg3 + arg4 - 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
            }
            var9 += 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(II)V", line = 118)
    public final void method24(int arg0, int arg1) {
        int var3 = this.field67 + arg0;
        int var4 = this.field68 + arg1;
        int var5 = Draw2D.field310 * var4 + var3;
        int var6 = 0;
        int var7 = this.field63;
        int var8 = this.field64;
        int var9 = Draw2D.field310 - var8;
        int var10 = 0;
        if (var4 < Draw2D.field312) {
            int var11 = Draw2D.field312 - var4;
            var7 -= var11;
            var4 = Draw2D.field312;
            var6 += var8 * var11;
            var5 += Draw2D.field310 * var11;
        }
        if (var4 + var7 > Draw2D.field307) {
            var7 -= var4 + var7 - Draw2D.field307;
        }
        if (var3 < Draw2D.field308) {
            int var12 = Draw2D.field308 - var3;
            var8 -= var12;
            var3 = Draw2D.field308;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > Draw2D.field309) {
            int var13 = var3 + var8 - Draw2D.field309;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method26(Draw2D.field306, this.pixels, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "()V", line = 203)
    public final void bind() {
        Draw2D.method173(this.pixels, this.field64, this.field63);
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "()V", line = 209)
    public Pix24() {
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "(II)V", line = 212)
    public Pix24(int arg0, int arg1) {
        this.pixels = new int[arg0 * arg1];
        this.field64 = this.field65 = arg0;
        this.field63 = this.field66 = arg1;
        this.field67 = this.field68 = 0;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[IIIIIIII)V", line = 220)
    private static final void method26(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                int var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var13;
                }
                int var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var14;
                }
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
            }
            for (int var17 = var10; var17 < 0; var17++) {
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }
}
