import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 extends class37 {

    @OriginalMember(owner = "mapview!f", name = "v", descriptor = "[I")
    public int[] field162;

    @OriginalMember(owner = "mapview!f", name = "y", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "mapview!f", name = "w", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "mapview!f", name = "x", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "mapview!f", name = "u", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[IIIIIIII)V", line = 21)
    private static final void method91(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(II)V", line = 86)
    public final void method92(int arg0, int arg1) {
        int var3 = this.field161 + arg0;
        int var4 = this.field164 + arg1;
        int var5 = class37.field456 * var4 + var3;
        int var6 = 0;
        int var7 = this.field163;
        int var8 = this.field165;
        int var9 = class37.field456 - var8;
        int var10 = 0;
        if (var4 < class37.field458) {
            int var11 = class37.field458 - var4;
            var7 -= var11;
            var4 = class37.field458;
            var6 += var8 * var11;
            var5 += class37.field456 * var11;
        }
        if (var4 + var7 > class37.field454) {
            var7 -= var4 + var7 - class37.field454;
        }
        if (var3 < class37.field455) {
            int var12 = class37.field455 - var3;
            var8 -= var12;
            var3 = class37.field455;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class37.field460) {
            int var13 = var3 + var8 - class37.field460;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method91(class37.field457, this.field162, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "()V", line = 146)
    public final void method93() {
        class37.method242(this.field162, this.field165, this.field163);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[IIIIIII)V", line = 160)
    private static final void method94(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(II)V", line = 203)
    public final void method95(int arg0, int arg1) {
        int var3 = this.field161 + arg0;
        int var4 = this.field164 + arg1;
        int var5 = class37.field456 * var4 + var3;
        int var6 = 0;
        int var7 = this.field163;
        int var8 = this.field165;
        int var9 = class37.field456 - var8;
        int var10 = 0;
        if (var4 < class37.field458) {
            int var11 = class37.field458 - var4;
            var7 -= var11;
            var4 = class37.field458;
            var6 += var8 * var11;
            var5 += class37.field456 * var11;
        }
        if (var4 + var7 > class37.field454) {
            var7 -= var4 + var7 - class37.field454;
        }
        if (var3 < class37.field455) {
            int var12 = class37.field455 - var3;
            var8 -= var12;
            var3 = class37.field455;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class37.field460) {
            int var13 = var3 + var8 - class37.field460;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method94(class37.field457, this.field162, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "()V", line = 272)
    public class11() {
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "(II)V", line = 275)
    public class11(int arg0, int arg1) {
        this.field162 = new int[arg0 * arg1];
        this.field165 = arg0;
        this.field163 = arg1;
        this.field161 = this.field164 = 0;
    }
}
