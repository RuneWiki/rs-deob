import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class38 extends class32 {

    @OriginalMember(owner = "mapview!u", name = "z", descriptor = "[I")
    public int[] field488;

    @OriginalMember(owner = "mapview!u", name = "B", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "mapview!u", name = "y", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "mapview!u", name = "x", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "mapview!u", name = "A", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([I[IIIIIII)V", line = 24)
    private static final void method240(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "()V", line = 71)
    public final void method241() {
        class32.method213(this.field488, this.field490, this.field487);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)V", line = 83)
    public final void method242(int arg0, int arg1) {
        int var3 = this.field489 + arg0;
        int var4 = this.field486 + arg1;
        int var5 = class32.field445 * var4 + var3;
        int var6 = 0;
        int var7 = this.field487;
        int var8 = this.field490;
        int var9 = class32.field445 - var8;
        int var10 = 0;
        if (var4 < class32.field444) {
            int var11 = class32.field444 - var4;
            var7 -= var11;
            var4 = class32.field444;
            var6 += var8 * var11;
            var5 += class32.field445 * var11;
        }
        if (var4 + var7 > class32.field448) {
            var7 -= var4 + var7 - class32.field448;
        }
        if (var3 < class32.field442) {
            int var12 = class32.field442 - var3;
            var8 -= var12;
            var3 = class32.field442;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class32.field447) {
            int var13 = var3 + var8 - class32.field447;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method244(class32.field446, this.field488, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(II)V", line = 143)
    public final void method243(int arg0, int arg1) {
        int var3 = this.field489 + arg0;
        int var4 = this.field486 + arg1;
        int var5 = class32.field445 * var4 + var3;
        int var6 = 0;
        int var7 = this.field487;
        int var8 = this.field490;
        int var9 = class32.field445 - var8;
        int var10 = 0;
        if (var4 < class32.field444) {
            int var11 = class32.field444 - var4;
            var7 -= var11;
            var4 = class32.field444;
            var6 += var8 * var11;
            var5 += class32.field445 * var11;
        }
        if (var4 + var7 > class32.field448) {
            var7 -= var4 + var7 - class32.field448;
        }
        if (var3 < class32.field442) {
            int var12 = class32.field442 - var3;
            var8 -= var12;
            var3 = class32.field442;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class32.field447) {
            int var13 = var3 + var8 - class32.field447;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method240(class32.field446, this.field488, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([I[IIIIIIII)V", line = 225)
    private static final void method244(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "()V", line = 298)
    protected class38() {
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "(II)V", line = 300)
    public class38(int arg0, int arg1) {
        this.field488 = new int[arg0 * arg1];
        this.field490 = arg0;
        this.field487 = arg1;
        this.field489 = this.field486 = 0;
    }
}
