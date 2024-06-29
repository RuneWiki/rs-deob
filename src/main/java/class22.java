import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class22 extends class25 {

    @OriginalMember(owner = "mapview!la", name = "B", descriptor = "[I")
    public int[] field297;

    @OriginalMember(owner = "mapview!la", name = "A", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "mapview!la", name = "C", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "mapview!la", name = "z", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "mapview!la", name = "y", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([I[IIIIIIII)V", line = 23)
    private static final void method150(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([I[IIIIIII)V", line = 89)
    private static final void method151(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "()V", line = 123)
    public final void method152() {
        class25.method175(this.field297, this.field296, this.field298);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(II)V", line = 147)
    public final void method153(int arg0, int arg1) {
        int var3 = this.field294 + arg0;
        int var4 = this.field295 + arg1;
        int var5 = class25.field330 * var4 + var3;
        int var6 = 0;
        int var7 = this.field298;
        int var8 = this.field296;
        int var9 = class25.field330 - var8;
        int var10 = 0;
        if (var4 < class25.field324) {
            int var11 = class25.field324 - var4;
            var7 -= var11;
            var4 = class25.field324;
            var6 += var8 * var11;
            var5 += class25.field330 * var11;
        }
        if (var4 + var7 > class25.field329) {
            var7 -= var4 + var7 - class25.field329;
        }
        if (var3 < class25.field326) {
            int var12 = class25.field326 - var3;
            var8 -= var12;
            var3 = class25.field326;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class25.field328) {
            int var13 = var3 + var8 - class25.field328;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method150(class25.field325, this.field297, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(II)V", line = 205)
    public final void method154(int arg0, int arg1) {
        int var3 = this.field294 + arg0;
        int var4 = this.field295 + arg1;
        int var5 = class25.field330 * var4 + var3;
        int var6 = 0;
        int var7 = this.field298;
        int var8 = this.field296;
        int var9 = class25.field330 - var8;
        int var10 = 0;
        if (var4 < class25.field324) {
            int var11 = class25.field324 - var4;
            var7 -= var11;
            var4 = class25.field324;
            var6 += var8 * var11;
            var5 += class25.field330 * var11;
        }
        if (var4 + var7 > class25.field329) {
            var7 -= var4 + var7 - class25.field329;
        }
        if (var3 < class25.field326) {
            int var12 = class25.field326 - var3;
            var8 -= var12;
            var3 = class25.field326;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class25.field328) {
            int var13 = var3 + var8 - class25.field328;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method151(class25.field325, this.field297, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "()V", line = 274)
    public class22() {
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "(II)V", line = 276)
    public class22(int arg0, int arg1) {
        this.field297 = new int[arg0 * arg1];
        this.field296 = arg0;
        this.field298 = arg1;
        this.field294 = this.field295 = 0;
    }
}
