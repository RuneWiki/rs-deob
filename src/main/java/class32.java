import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class32 extends class8 {

    @OriginalMember(owner = "mapview!u", name = "E", descriptor = "[I")
    public int[] field347;

    @OriginalMember(owner = "mapview!u", name = "y", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "mapview!u", name = "A", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "mapview!u", name = "B", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "mapview!u", name = "C", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "mapview!u", name = "D", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "mapview!u", name = "z", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([I[IIIIIII)V", line = 17)
    private static final void method202(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)V", line = 61)
    public final void method203(int arg0, int arg1) {
        int var3 = this.field342 + arg0;
        int var4 = this.field346 + arg1;
        int var5 = class8.field66 * var4 + var3;
        int var6 = 0;
        int var7 = this.field345;
        int var8 = this.field343;
        int var9 = class8.field66 - var8;
        int var10 = 0;
        if (var4 < class8.field72) {
            int var11 = class8.field72 - var4;
            var7 -= var11;
            var4 = class8.field72;
            var6 += var8 * var11;
            var5 += class8.field66 * var11;
        }
        if (var4 + var7 > class8.field67) {
            var7 -= var4 + var7 - class8.field67;
        }
        if (var3 < class8.field69) {
            int var12 = class8.field69 - var3;
            var8 -= var12;
            var3 = class8.field69;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class8.field68) {
            int var13 = var3 + var8 - class8.field68;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method202(class8.field71, this.field347, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(II)V", line = 122)
    public final void method204(int arg0, int arg1) {
        int var3 = this.field342 + arg0;
        int var4 = this.field346 + arg1;
        int var5 = class8.field66 * var4 + var3;
        int var6 = 0;
        int var7 = this.field345;
        int var8 = this.field343;
        int var9 = class8.field66 - var8;
        int var10 = 0;
        if (var4 < class8.field72) {
            int var11 = class8.field72 - var4;
            var7 -= var11;
            var4 = class8.field72;
            var6 += var8 * var11;
            var5 += class8.field66 * var11;
        }
        if (var4 + var7 > class8.field67) {
            var7 -= var4 + var7 - class8.field67;
        }
        if (var3 < class8.field69) {
            int var12 = class8.field69 - var3;
            var8 -= var12;
            var3 = class8.field69;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class8.field68) {
            int var13 = var3 + var8 - class8.field68;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method206(class8.field71, this.field347, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "()V", line = 176)
    public final void method205() {
        class8.method46(this.field347, this.field343, this.field345);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([I[IIIIIIII)V", line = 181)
    private static final void method206(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "()V", line = 273)
    public class32() {
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "(II)V", line = 275)
    public class32(int arg0, int arg1) {
        this.field347 = new int[arg0 * arg1];
        this.field343 = this.field341 = arg0;
        this.field345 = this.field344 = arg1;
        this.field342 = this.field346 = 0;
    }
}
