import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class30 extends class27 {

    @OriginalMember(owner = "mapview!pa", name = "O", descriptor = "[I")
    public int[] field422;

    @OriginalMember(owner = "mapview!pa", name = "D", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "mapview!pa", name = "M", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "mapview!pa", name = "N", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "mapview!pa", name = "F", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(II)V", line = 26)
    public final void method215(int arg0, int arg1) {
        int var3 = this.field419 + arg0;
        int var4 = this.field421 + arg1;
        int var5 = class27.field397 * var4 + var3;
        int var6 = 0;
        int var7 = this.field420;
        int var8 = this.field418;
        int var9 = class27.field397 - var8;
        int var10 = 0;
        if (var4 < class27.field402) {
            int var11 = class27.field402 - var4;
            var7 -= var11;
            var4 = class27.field402;
            var6 += var8 * var11;
            var5 += class27.field397 * var11;
        }
        if (var4 + var7 > class27.field398) {
            var7 -= var4 + var7 - class27.field398;
        }
        if (var3 < class27.field401) {
            int var12 = class27.field401 - var3;
            var8 -= var12;
            var3 = class27.field401;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class27.field400) {
            int var13 = var3 + var8 - class27.field400;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method219(class27.field399, this.field422, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "([I[IIIIIII)V", line = 94)
    private static final void method216(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "()V", line = 134)
    public final void method217() {
        class27.method203(this.field422, this.field418, this.field420);
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(II)V", line = 142)
    public final void method218(int arg0, int arg1) {
        int var3 = this.field419 + arg0;
        int var4 = this.field421 + arg1;
        int var5 = class27.field397 * var4 + var3;
        int var6 = 0;
        int var7 = this.field420;
        int var8 = this.field418;
        int var9 = class27.field397 - var8;
        int var10 = 0;
        if (var4 < class27.field402) {
            int var11 = class27.field402 - var4;
            var7 -= var11;
            var4 = class27.field402;
            var6 += var8 * var11;
            var5 += class27.field397 * var11;
        }
        if (var4 + var7 > class27.field398) {
            var7 -= var4 + var7 - class27.field398;
        }
        if (var3 < class27.field401) {
            int var12 = class27.field401 - var3;
            var8 -= var12;
            var3 = class27.field401;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class27.field400) {
            int var13 = var3 + var8 - class27.field400;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method216(class27.field399, this.field422, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "<init>", descriptor = "()V", line = 214)
    protected class30() {
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "([I[IIIIIIII)V", line = 222)
    private static final void method219(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!pa", name = "<init>", descriptor = "(II)V", line = 289)
    public class30(int arg0, int arg1) {
        this.field422 = new int[arg0 * arg1];
        this.field418 = arg0;
        this.field420 = arg1;
        this.field419 = this.field421 = 0;
    }
}
