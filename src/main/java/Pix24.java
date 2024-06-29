import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class Pix24 extends Draw2D {

    @OriginalMember(owner = "mapview!b", name = "A", descriptor = "[I")
    public int[] field26;

    @OriginalMember(owner = "mapview!b", name = "w", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "mapview!b", name = "y", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "mapview!b", name = "z", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "mapview!b", name = "x", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([I[IIIIIIII)V", line = 27)
    private static final void method8(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([I[IIIIIII)V", line = 91)
    private static final void method9(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(II)V", line = 122)
    public final void method10(int arg0, int arg1) {
        int var3 = this.field23 + arg0;
        int var4 = this.field25 + arg1;
        int var5 = Draw2D.width * var4 + var3;
        int var6 = 0;
        int var7 = this.field24;
        int var8 = this.field22;
        int var9 = Draw2D.width - var8;
        int var10 = 0;
        if (var4 < Draw2D.top) {
            int var11 = Draw2D.top - var4;
            var7 -= var11;
            var4 = Draw2D.top;
            var6 += var8 * var11;
            var5 += Draw2D.width * var11;
        }
        if (var4 + var7 > Draw2D.bottom) {
            var7 -= var4 + var7 - Draw2D.bottom;
        }
        if (var3 < Draw2D.left) {
            int var12 = Draw2D.left - var3;
            var8 -= var12;
            var3 = Draw2D.left;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > Draw2D.right) {
            int var13 = var3 + var8 - Draw2D.right;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method8(Draw2D.data, this.field26, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "()V", line = 178)
    public final void method11() {
        Draw2D.bind(this.field26, this.field22, this.field24);
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(II)V", line = 188)
    public final void method12(int arg0, int arg1) {
        int var3 = this.field23 + arg0;
        int var4 = this.field25 + arg1;
        int var5 = Draw2D.width * var4 + var3;
        int var6 = 0;
        int var7 = this.field24;
        int var8 = this.field22;
        int var9 = Draw2D.width - var8;
        int var10 = 0;
        if (var4 < Draw2D.top) {
            int var11 = Draw2D.top - var4;
            var7 -= var11;
            var4 = Draw2D.top;
            var6 += var8 * var11;
            var5 += Draw2D.width * var11;
        }
        if (var4 + var7 > Draw2D.bottom) {
            var7 -= var4 + var7 - Draw2D.bottom;
        }
        if (var3 < Draw2D.left) {
            int var12 = Draw2D.left - var3;
            var8 -= var12;
            var3 = Draw2D.left;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > Draw2D.right) {
            int var13 = var3 + var8 - Draw2D.right;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method9(Draw2D.data, this.field26, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "()V", line = 285)
    public Pix24() {
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(II)V", line = 289)
    public Pix24(int arg0, int arg1) {
        this.field26 = new int[arg0 * arg1];
        this.field22 = arg0;
        this.field24 = arg1;
        this.field23 = this.field25 = 0;
    }
}
