import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class39 extends class13 {

    @OriginalMember(owner = "mapview!u", name = "J", descriptor = "[I")
    public int[] field531;

    @OriginalMember(owner = "mapview!u", name = "H", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "mapview!u", name = "G", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "mapview!u", name = "K", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "mapview!u", name = "I", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([I[IIIIIIII)V", line = 18)
    private static final void method248(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([I[IIIIIII)V", line = 83)
    private static final void method249(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)V", line = 121)
    public final void method250(int arg0, int arg1) {
        int var3 = this.field530 + arg0;
        int var4 = this.field532 + arg1;
        int var5 = class13.field131 * var4 + var3;
        int var6 = 0;
        int var7 = this.field528;
        int var8 = this.field529;
        int var9 = class13.field131 - var8;
        int var10 = 0;
        if (var4 < class13.field130) {
            int var11 = class13.field130 - var4;
            var7 -= var11;
            var4 = class13.field130;
            var6 += var8 * var11;
            var5 += class13.field131 * var11;
        }
        if (var4 + var7 > class13.field132) {
            var7 -= var4 + var7 - class13.field132;
        }
        if (var3 < class13.field127) {
            int var12 = class13.field127 - var3;
            var8 -= var12;
            var3 = class13.field127;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class13.field128) {
            int var13 = var3 + var8 - class13.field128;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method249(class13.field126, this.field531, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "()V", line = 194)
    public final void method251() {
        class13.method98(this.field531, this.field529, this.field528);
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(II)V", line = 213)
    public final void method252(int arg0, int arg1) {
        int var3 = this.field530 + arg0;
        int var4 = this.field532 + arg1;
        int var5 = class13.field131 * var4 + var3;
        int var6 = 0;
        int var7 = this.field528;
        int var8 = this.field529;
        int var9 = class13.field131 - var8;
        int var10 = 0;
        if (var4 < class13.field130) {
            int var11 = class13.field130 - var4;
            var7 -= var11;
            var4 = class13.field130;
            var6 += var8 * var11;
            var5 += class13.field131 * var11;
        }
        if (var4 + var7 > class13.field132) {
            var7 -= var4 + var7 - class13.field132;
        }
        if (var3 < class13.field127) {
            int var12 = class13.field127 - var3;
            var8 -= var12;
            var3 = class13.field127;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class13.field128) {
            int var13 = var3 + var8 - class13.field128;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method248(class13.field126, this.field531, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "()V", line = 301)
    protected class39() {
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "(II)V", line = 303)
    public class39(int arg0, int arg1) {
        this.field531 = new int[arg0 * arg1];
        this.field529 = arg0;
        this.field528 = arg1;
        this.field530 = this.field532 = 0;
    }
}
