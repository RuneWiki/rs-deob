import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class32 extends class12 {

    @OriginalMember(owner = "mapview!s", name = "L", descriptor = "[I")
    public int[] field433;

    @OriginalMember(owner = "mapview!s", name = "M", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "mapview!s", name = "K", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "mapview!s", name = "J", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "mapview!s", name = "N", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "([I[IIIIIIII)V", line = 51)
    private static final void method228(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "([I[IIIIIII)V", line = 124)
    private static final void method229(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(II)V", line = 156)
    public final void method230(int arg0, int arg1) {
        int var3 = this.field435 + arg0;
        int var4 = this.field431 + arg1;
        int var5 = class12.field223 * var4 + var3;
        int var6 = 0;
        int var7 = this.field432;
        int var8 = this.field434;
        int var9 = class12.field223 - var8;
        int var10 = 0;
        if (var4 < class12.field224) {
            int var11 = class12.field224 - var4;
            var7 -= var11;
            var4 = class12.field224;
            var6 += var8 * var11;
            var5 += class12.field223 * var11;
        }
        if (var4 + var7 > class12.field225) {
            var7 -= var4 + var7 - class12.field225;
        }
        if (var3 < class12.field219) {
            int var12 = class12.field219 - var3;
            var8 -= var12;
            var3 = class12.field219;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class12.field221) {
            int var13 = var3 + var8 - class12.field221;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method229(class12.field222, this.field433, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "()V", line = 210)
    public final void method231() {
        class12.method92(this.field433, this.field434, this.field432);
    }

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "(II)V", line = 214)
    public final void method232(int arg0, int arg1) {
        int var3 = this.field435 + arg0;
        int var4 = this.field431 + arg1;
        int var5 = class12.field223 * var4 + var3;
        int var6 = 0;
        int var7 = this.field432;
        int var8 = this.field434;
        int var9 = class12.field223 - var8;
        int var10 = 0;
        if (var4 < class12.field224) {
            int var11 = class12.field224 - var4;
            var7 -= var11;
            var4 = class12.field224;
            var6 += var8 * var11;
            var5 += class12.field223 * var11;
        }
        if (var4 + var7 > class12.field225) {
            var7 -= var4 + var7 - class12.field225;
        }
        if (var3 < class12.field219) {
            int var12 = class12.field219 - var3;
            var8 -= var12;
            var3 = class12.field219;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class12.field221) {
            int var13 = var3 + var8 - class12.field221;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method228(class12.field222, this.field433, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "()V", line = 272)
    public class32() {
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "(II)V", line = 274)
    public class32(int arg0, int arg1) {
        this.field433 = new int[arg0 * arg1];
        this.field434 = arg0;
        this.field432 = arg1;
        this.field435 = this.field431 = 0;
    }
}
