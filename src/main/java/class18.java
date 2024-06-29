import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class18 extends class37 {

    @OriginalMember(owner = "mapview!j", name = "H", descriptor = "[I")
    private int[] field155;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(II)V", line = 3)
    public final void method91(int arg0, int arg1) {
        int var3 = super.field466 + arg0;
        int var4 = super.field460 + arg1;
        int var5 = class12.field118 * var4 + var3;
        int var6 = 0;
        int var7 = super.field464;
        int var8 = super.field467;
        int var9 = class12.field118 - var8;
        int var10 = 0;
        if (var4 < class12.field117) {
            int var11 = class12.field117 - var4;
            var7 -= var11;
            var4 = class12.field117;
            var6 += var8 * var11;
            var5 += class12.field118 * var11;
        }
        if (var4 + var7 > class12.field119) {
            var7 -= var4 + var7 - class12.field119;
        }
        if (var3 < class12.field114) {
            int var12 = class12.field114 - var3;
            var8 -= var12;
            var3 = class12.field114;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class12.field120) {
            int var13 = var3 + var8 - class12.field120;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method95(class12.field115, this.field155, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([I[IIIIIII)V", line = 65)
    private static final void method92(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; ++var8) {
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

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "()V", line = 134)
    public final void bind() {
        class12.method67(this.field155, super.field467, super.field464);
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(II)V", line = 137)
    public final void method94(int arg0, int arg1) {
        int var3 = super.field466 + arg0;
        int var4 = super.field460 + arg1;
        int var5 = class12.field118 * var4 + var3;
        int var6 = 0;
        int var7 = super.field464;
        int var8 = super.field467;
        int var9 = class12.field118 - var8;
        int var10 = 0;
        if (var4 < class12.field117) {
            int var11 = class12.field117 - var4;
            var7 -= var11;
            var4 = class12.field117;
            var6 += var8 * var11;
            var5 += class12.field118 * var11;
        }
        if (var4 + var7 > class12.field119) {
            var7 -= var4 + var7 - class12.field119;
        }
        if (var3 < class12.field114) {
            int var12 = class12.field114 - var3;
            var8 -= var12;
            var3 = class12.field114;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class12.field120) {
            int var13 = var3 + var8 - class12.field120;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method92(class12.field115, this.field155, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([I[IIIIIIII)V", line = 220)
    private static final void method95(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 3);
        for (int var11 = -arg6; var11 < 0; ++var11) {
            for (int var12 = var9; var12 < 0; ++var12) {
                int var13 = arg1[arg3++];
                if (var13 != 0) {
                    arg0[arg4++] = var13;
                } else {
                    ++arg4;
                }
                int var14 = arg1[arg3++];
                if (var14 != 0) {
                    arg0[arg4++] = var14;
                } else {
                    ++arg4;
                }
                int var15 = arg1[arg3++];
                if (var15 != 0) {
                    arg0[arg4++] = var15;
                } else {
                    ++arg4;
                }
                int var16 = arg1[arg3++];
                if (var16 != 0) {
                    arg0[arg4++] = var16;
                } else {
                    ++arg4;
                }
            }
            for (int var17 = var10; var17 < 0; ++var17) {
                int var18 = arg1[arg3++];
                if (var18 != 0) {
                    arg0[arg4++] = var18;
                } else {
                    ++arg4;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(IIIIII[I)V", line = 282)
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super.field466 = arg2;
        super.field460 = arg3;
        super.field467 = arg4;
        super.field464 = arg5;
        this.field155 = arg6;
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(II)V", line = 293)
    public class18(int arg0, int arg1) {
        this.field155 = new int[arg0 * arg1];
        super.field467 = arg0;
        super.field464 = arg1;
        super.field466 = super.field460 = 0;
    }
}
