import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class13 extends class22 {

    @OriginalMember(owner = "mapview!ga", name = "s", descriptor = "[I")
    public int[] field147;

    @OriginalMember(owner = "mapview!ga", name = "v", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "mapview!ga", name = "r", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "mapview!ga", name = "u", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "mapview!ga", name = "t", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([I[IIIIIIII)V", line = 13)
    private static final void method55(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([I[IIIIIII)V", line = 77)
    private static final void method56(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(II)V", line = 182)
    public final void method57(int arg0, int arg1) {
        int var3 = this.field148 + arg0;
        int var4 = this.field149 + arg1;
        int var5 = class22.field246 * var4 + var3;
        int var6 = 0;
        int var7 = this.field146;
        int var8 = this.field150;
        int var9 = class22.field246 - var8;
        int var10 = 0;
        if (var4 < class22.field247) {
            int var11 = class22.field247 - var4;
            var7 -= var11;
            var4 = class22.field247;
            var6 += var8 * var11;
            var5 += class22.field246 * var11;
        }
        if (var4 + var7 > class22.field245) {
            var7 -= var4 + var7 - class22.field245;
        }
        if (var3 < class22.field248) {
            int var12 = class22.field248 - var3;
            var8 -= var12;
            var3 = class22.field248;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class22.field251) {
            int var13 = var3 + var8 - class22.field251;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method55(class22.field249, this.field147, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(II)V", line = 236)
    public final void method58(int arg0, int arg1) {
        int var3 = this.field148 + arg0;
        int var4 = this.field149 + arg1;
        int var5 = class22.field246 * var4 + var3;
        int var6 = 0;
        int var7 = this.field146;
        int var8 = this.field150;
        int var9 = class22.field246 - var8;
        int var10 = 0;
        if (var4 < class22.field247) {
            int var11 = class22.field247 - var4;
            var7 -= var11;
            var4 = class22.field247;
            var6 += var8 * var11;
            var5 += class22.field246 * var11;
        }
        if (var4 + var7 > class22.field245) {
            var7 -= var4 + var7 - class22.field245;
        }
        if (var3 < class22.field248) {
            int var12 = class22.field248 - var3;
            var8 -= var12;
            var3 = class22.field248;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class22.field251) {
            int var13 = var3 + var8 - class22.field251;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method56(class22.field249, this.field147, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "()V", line = 293)
    protected class13() {
    }

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "()V", line = 300)
    public final void method59() {
        class22.method109(this.field147, this.field150, this.field146);
    }

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "(II)V", line = 303)
    public class13(int arg0, int arg1) {
        this.field147 = new int[arg0 * arg1];
        this.field150 = arg0;
        this.field146 = arg1;
        this.field148 = this.field149 = 0;
    }
}
