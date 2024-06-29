import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class29 extends class27 {

    @OriginalMember(owner = "mapview!oa", name = "B", descriptor = "[I")
    public int[] field356;

    @OriginalMember(owner = "mapview!oa", name = "F", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "mapview!oa", name = "C", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "mapview!oa", name = "E", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "mapview!oa", name = "D", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "()V", line = 9)
    public final void method165() {
        class27.method154(this.field356, this.field360, this.field357);
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "([I[IIIIIIII)V", line = 29)
    private static final void method166(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(II)V", line = 99)
    public final void method167(int arg0, int arg1) {
        int var3 = this.field358 + arg0;
        int var4 = this.field359 + arg1;
        int var5 = class27.field337 * var4 + var3;
        int var6 = 0;
        int var7 = this.field357;
        int var8 = this.field360;
        int var9 = class27.field337 - var8;
        int var10 = 0;
        if (var4 < class27.field339) {
            int var11 = class27.field339 - var4;
            var7 -= var11;
            var4 = class27.field339;
            var6 += var8 * var11;
            var5 += class27.field337 * var11;
        }
        if (var4 + var7 > class27.field336) {
            var7 -= var4 + var7 - class27.field336;
        }
        if (var3 < class27.field340) {
            int var12 = class27.field340 - var3;
            var8 -= var12;
            var3 = class27.field340;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class27.field341) {
            int var13 = var3 + var8 - class27.field341;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method166(class27.field338, this.field356, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "([I[IIIIIII)V", line = 184)
    private static final void method168(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(II)V", line = 219)
    public final void method169(int arg0, int arg1) {
        int var3 = this.field358 + arg0;
        int var4 = this.field359 + arg1;
        int var5 = class27.field337 * var4 + var3;
        int var6 = 0;
        int var7 = this.field357;
        int var8 = this.field360;
        int var9 = class27.field337 - var8;
        int var10 = 0;
        if (var4 < class27.field339) {
            int var11 = class27.field339 - var4;
            var7 -= var11;
            var4 = class27.field339;
            var6 += var8 * var11;
            var5 += class27.field337 * var11;
        }
        if (var4 + var7 > class27.field336) {
            var7 -= var4 + var7 - class27.field336;
        }
        if (var3 < class27.field340) {
            int var12 = class27.field340 - var3;
            var8 -= var12;
            var3 = class27.field340;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class27.field341) {
            int var13 = var3 + var8 - class27.field341;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method168(class27.field338, this.field356, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "()V", line = 291)
    public class29() {
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "(II)V", line = 294)
    public class29(int arg0, int arg1) {
        this.field356 = new int[arg0 * arg1];
        this.field360 = arg0;
        this.field357 = arg1;
        this.field358 = this.field359 = 0;
    }
}
