import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class7 extends class8 {

    @OriginalMember(owner = "mapview!da", name = "H", descriptor = "[I")
    public int[] field65;

    @OriginalMember(owner = "mapview!da", name = "F", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "mapview!da", name = "E", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "mapview!da", name = "G", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "mapview!da", name = "D", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "([I[IIIIIIII)V", line = 8)
    private static final void method30(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "()V", line = 71)
    public final void method31() {
        class8.method38(this.field65, this.field63, this.field62);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "([I[IIIIIII)V", line = 109)
    private static final void method32(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(II)V", line = 160)
    public final void method33(int arg0, int arg1) {
        int var3 = this.field61 + arg0;
        int var4 = this.field64 + arg1;
        int var5 = class8.field67 * var4 + var3;
        int var6 = 0;
        int var7 = this.field62;
        int var8 = this.field63;
        int var9 = class8.field67 - var8;
        int var10 = 0;
        if (var4 < class8.field68) {
            int var11 = class8.field68 - var4;
            var7 -= var11;
            var4 = class8.field68;
            var6 += var8 * var11;
            var5 += class8.field67 * var11;
        }
        if (var4 + var7 > class8.field66) {
            var7 -= var4 + var7 - class8.field66;
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
        if (var3 + var8 > class8.field72) {
            int var13 = var3 + var8 - class8.field72;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method30(class8.field70, this.field65, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(II)V", line = 235)
    public final void method34(int arg0, int arg1) {
        int var3 = this.field61 + arg0;
        int var4 = this.field64 + arg1;
        int var5 = class8.field67 * var4 + var3;
        int var6 = 0;
        int var7 = this.field62;
        int var8 = this.field63;
        int var9 = class8.field67 - var8;
        int var10 = 0;
        if (var4 < class8.field68) {
            int var11 = class8.field68 - var4;
            var7 -= var11;
            var4 = class8.field68;
            var6 += var8 * var11;
            var5 += class8.field67 * var11;
        }
        if (var4 + var7 > class8.field66) {
            var7 -= var4 + var7 - class8.field66;
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
        if (var3 + var8 > class8.field72) {
            int var13 = var3 + var8 - class8.field72;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method32(class8.field70, this.field65, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "()V", line = 296)
    protected class7() {
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "(II)V", line = 298)
    public class7(int arg0, int arg1) {
        this.field65 = new int[arg0 * arg1];
        this.field63 = arg0;
        this.field62 = arg1;
        this.field61 = this.field64 = 0;
    }
}
