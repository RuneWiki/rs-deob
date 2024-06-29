import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class35 extends class40 {

    @OriginalMember(owner = "mapview!ra", name = "D", descriptor = "[I")
    public int[] field459;

    @OriginalMember(owner = "mapview!ra", name = "C", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "mapview!ra", name = "E", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "mapview!ra", name = "F", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "mapview!ra", name = "G", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "([I[IIIIIIII)V", line = 5)
    private static final void method205(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(II)V", line = 73)
    public final void method206(int arg0, int arg1) {
        int var3 = this.field462 + arg0;
        int var4 = this.field461 + arg1;
        int var5 = class40.field518 * var4 + var3;
        int var6 = 0;
        int var7 = this.field460;
        int var8 = this.field458;
        int var9 = class40.field518 - var8;
        int var10 = 0;
        if (var4 < class40.field520) {
            int var11 = class40.field520 - var4;
            var7 -= var11;
            var4 = class40.field520;
            var6 += var8 * var11;
            var5 += class40.field518 * var11;
        }
        if (var4 + var7 > class40.field517) {
            var7 -= var4 + var7 - class40.field517;
        }
        if (var3 < class40.field519) {
            int var12 = class40.field519 - var3;
            var8 -= var12;
            var3 = class40.field519;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class40.field516) {
            int var13 = var3 + var8 - class40.field516;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method205(class40.field515, this.field459, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "(II)V", line = 174)
    public final void method207(int arg0, int arg1) {
        int var3 = this.field462 + arg0;
        int var4 = this.field461 + arg1;
        int var5 = class40.field518 * var4 + var3;
        int var6 = 0;
        int var7 = this.field460;
        int var8 = this.field458;
        int var9 = class40.field518 - var8;
        int var10 = 0;
        if (var4 < class40.field520) {
            int var11 = class40.field520 - var4;
            var7 -= var11;
            var4 = class40.field520;
            var6 += var8 * var11;
            var5 += class40.field518 * var11;
        }
        if (var4 + var7 > class40.field517) {
            var7 -= var4 + var7 - class40.field517;
        }
        if (var3 < class40.field519) {
            int var12 = class40.field519 - var3;
            var8 -= var12;
            var3 = class40.field519;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class40.field516) {
            int var13 = var3 + var8 - class40.field516;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method209(class40.field515, this.field459, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "()V", line = 243)
    public final void method208() {
        class40.method263(this.field459, this.field458, this.field460);
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "()V", line = 263)
    public class35() {
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "(II)V", line = 265)
    public class35(int arg0, int arg1) {
        this.field459 = new int[arg0 * arg1];
        this.field458 = arg0;
        this.field460 = arg1;
        this.field462 = this.field461 = 0;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "([I[IIIIIII)V", line = 276)
    private static final void method209(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
}
