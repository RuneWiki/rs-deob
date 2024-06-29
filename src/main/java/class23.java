import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class23 extends class21 {

    @OriginalMember(owner = "mapview!m", name = "B", descriptor = "[I")
    public int[] field332;

    @OriginalMember(owner = "mapview!m", name = "z", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "mapview!m", name = "C", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "mapview!m", name = "A", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "mapview!m", name = "y", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([I[IIIIIII)V", line = 24)
    private static final void method155(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(II)V", line = 58)
    public final void method156(int arg0, int arg1) {
        int var3 = this.field329 + arg0;
        int var4 = this.field331 + arg1;
        int var5 = class21.field291 * var4 + var3;
        int var6 = 0;
        int var7 = this.field333;
        int var8 = this.field330;
        int var9 = class21.field291 - var8;
        int var10 = 0;
        if (var4 < class21.field290) {
            int var11 = class21.field290 - var4;
            var7 -= var11;
            var4 = class21.field290;
            var6 += var8 * var11;
            var5 += class21.field291 * var11;
        }
        if (var4 + var7 > class21.field288) {
            var7 -= var4 + var7 - class21.field288;
        }
        if (var3 < class21.field292) {
            int var12 = class21.field292 - var3;
            var8 -= var12;
            var3 = class21.field292;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class21.field289) {
            int var13 = var3 + var8 - class21.field289;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method155(class21.field294, this.field332, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([I[IIIIIIII)V", line = 119)
    private static final void method157(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "()V", line = 213)
    public final void method158() {
        class21.method130(this.field332, this.field330, this.field333);
    }

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "(II)V", line = 225)
    public final void method159(int arg0, int arg1) {
        int var3 = this.field329 + arg0;
        int var4 = this.field331 + arg1;
        int var5 = class21.field291 * var4 + var3;
        int var6 = 0;
        int var7 = this.field333;
        int var8 = this.field330;
        int var9 = class21.field291 - var8;
        int var10 = 0;
        if (var4 < class21.field290) {
            int var11 = class21.field290 - var4;
            var7 -= var11;
            var4 = class21.field290;
            var6 += var8 * var11;
            var5 += class21.field291 * var11;
        }
        if (var4 + var7 > class21.field288) {
            var7 -= var4 + var7 - class21.field288;
        }
        if (var3 < class21.field292) {
            int var12 = class21.field292 - var3;
            var8 -= var12;
            var3 = class21.field292;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class21.field289) {
            int var13 = var3 + var8 - class21.field289;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method157(class21.field294, this.field332, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "()V", line = 297)
    public class23() {
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "(II)V", line = 299)
    public class23(int arg0, int arg1) {
        this.field332 = new int[arg0 * arg1];
        this.field330 = arg0;
        this.field333 = arg1;
        this.field329 = this.field331 = 0;
    }
}
