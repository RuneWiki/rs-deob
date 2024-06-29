import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class31 extends class13 {

    @OriginalMember(owner = "mapview!q", name = "F", descriptor = "[I")
    public int[] field461;

    @OriginalMember(owner = "mapview!q", name = "H", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "mapview!q", name = "D", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "mapview!q", name = "G", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "mapview!q", name = "E", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([I[IIIIIII)V", line = 6)
    private static final void method210(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(II)V", line = 75)
    public final void method211(int arg0, int arg1) {
        int var3 = this.field460 + arg0;
        int var4 = this.field462 + arg1;
        int var5 = class13.field133 * var4 + var3;
        int var6 = 0;
        int var7 = this.field459;
        int var8 = this.field463;
        int var9 = class13.field133 - var8;
        int var10 = 0;
        if (var4 < class13.field132) {
            int var11 = class13.field132 - var4;
            var7 -= var11;
            var4 = class13.field132;
            var6 += var8 * var11;
            var5 += class13.field133 * var11;
        }
        if (var4 + var7 > class13.field127) {
            var7 -= var4 + var7 - class13.field127;
        }
        if (var3 < class13.field129) {
            int var12 = class13.field129 - var3;
            var8 -= var12;
            var3 = class13.field129;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class13.field131) {
            int var13 = var3 + var8 - class13.field131;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method210(class13.field128, this.field461, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "()V", line = 136)
    public final void method212() {
        class13.method66(this.field461, this.field463, this.field459);
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(II)V", line = 162)
    public final void method213(int arg0, int arg1) {
        int var3 = this.field460 + arg0;
        int var4 = this.field462 + arg1;
        int var5 = class13.field133 * var4 + var3;
        int var6 = 0;
        int var7 = this.field459;
        int var8 = this.field463;
        int var9 = class13.field133 - var8;
        int var10 = 0;
        if (var4 < class13.field132) {
            int var11 = class13.field132 - var4;
            var7 -= var11;
            var4 = class13.field132;
            var6 += var8 * var11;
            var5 += class13.field133 * var11;
        }
        if (var4 + var7 > class13.field127) {
            var7 -= var4 + var7 - class13.field127;
        }
        if (var3 < class13.field129) {
            int var12 = class13.field129 - var3;
            var8 -= var12;
            var3 = class13.field129;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class13.field131) {
            int var13 = var3 + var8 - class13.field131;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method214(class13.field128, this.field461, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([I[IIIIIIII)V", line = 237)
    private static final void method214(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "()V", line = 297)
    protected class31() {
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "(II)V", line = 299)
    public class31(int arg0, int arg1) {
        this.field461 = new int[arg0 * arg1];
        this.field463 = arg0;
        this.field459 = arg1;
        this.field460 = this.field462 = 0;
    }
}
