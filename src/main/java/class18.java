import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class18 extends class17 {

    @OriginalMember(owner = "mapview!j", name = "G", descriptor = "[I")
    public int[] field186;

    @OriginalMember(owner = "mapview!j", name = "E", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "mapview!j", name = "H", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "mapview!j", name = "D", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "mapview!j", name = "F", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([I[IIIIIIII)V", line = 28)
    private static final void method131(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(II)V", line = 103)
    public final void method132(int arg0, int arg1) {
        int var3 = this.field185 + arg0;
        int var4 = this.field183 + arg1;
        int var5 = class17.field181 * var4 + var3;
        int var6 = 0;
        int var7 = this.field187;
        int var8 = this.field184;
        int var9 = class17.field181 - var8;
        int var10 = 0;
        if (var4 < class17.field177) {
            int var11 = class17.field177 - var4;
            var7 -= var11;
            var4 = class17.field177;
            var6 += var8 * var11;
            var5 += class17.field181 * var11;
        }
        if (var4 + var7 > class17.field178) {
            var7 -= var4 + var7 - class17.field178;
        }
        if (var3 < class17.field179) {
            int var12 = class17.field179 - var3;
            var8 -= var12;
            var3 = class17.field179;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class17.field182) {
            int var13 = var3 + var8 - class17.field182;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method131(class17.field180, this.field186, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([I[IIIIIII)V", line = 162)
    private static final void method133(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(II)V", line = 207)
    public final void method134(int arg0, int arg1) {
        int var3 = this.field185 + arg0;
        int var4 = this.field183 + arg1;
        int var5 = class17.field181 * var4 + var3;
        int var6 = 0;
        int var7 = this.field187;
        int var8 = this.field184;
        int var9 = class17.field181 - var8;
        int var10 = 0;
        if (var4 < class17.field177) {
            int var11 = class17.field177 - var4;
            var7 -= var11;
            var4 = class17.field177;
            var6 += var8 * var11;
            var5 += class17.field181 * var11;
        }
        if (var4 + var7 > class17.field178) {
            var7 -= var4 + var7 - class17.field178;
        }
        if (var3 < class17.field179) {
            int var12 = class17.field179 - var3;
            var8 -= var12;
            var3 = class17.field179;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class17.field182) {
            int var13 = var3 + var8 - class17.field182;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method133(class17.field180, this.field186, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "()V", line = 265)
    public final void method135() {
        class17.method124(this.field186, this.field184, this.field187);
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "()V", line = 268)
    public class18() {
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(II)V", line = 275)
    public class18(int arg0, int arg1) {
        this.field186 = new int[arg0 * arg1];
        this.field184 = arg0;
        this.field187 = arg1;
        this.field185 = this.field183 = 0;
    }
}
