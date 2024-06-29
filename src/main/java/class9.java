import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 extends class2 {

    @OriginalMember(owner = "mapview!e", name = "B", descriptor = "[I")
    public int[] field113;

    @OriginalMember(owner = "mapview!e", name = "x", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "mapview!e", name = "y", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "mapview!e", name = "z", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "mapview!e", name = "A", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(II)V", line = 3)
    public final void method60(int arg0, int arg1) {
        int var3 = this.field112 + arg0;
        int var4 = this.field111 + arg1;
        int var5 = class2.field45 * var4 + var3;
        int var6 = 0;
        int var7 = this.field110;
        int var8 = this.field109;
        int var9 = class2.field45 - var8;
        int var10 = 0;
        if (var4 < class2.field44) {
            int var11 = class2.field44 - var4;
            var7 -= var11;
            var4 = class2.field44;
            var6 += var8 * var11;
            var5 += class2.field45 * var11;
        }
        if (var4 + var7 > class2.field43) {
            var7 -= var4 + var7 - class2.field43;
        }
        if (var3 < class2.field42) {
            int var12 = class2.field42 - var3;
            var8 -= var12;
            var3 = class2.field42;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class2.field46) {
            int var13 = var3 + var8 - class2.field46;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method63(class2.field48, this.field113, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([I[IIIIIII)V", line = 96)
    private static final void method61(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "()V", line = 134)
    public final void method62() {
        class2.method8(this.field113, this.field109, this.field110);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([I[IIIIIIII)V", line = 184)
    private static final void method63(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "()V", line = 243)
    protected class9() {
    }

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "(II)V", line = 246)
    public class9(int arg0, int arg1) {
        this.field113 = new int[arg0 * arg1];
        this.field109 = arg0;
        this.field110 = arg1;
        this.field112 = this.field111 = 0;
    }

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "(II)V", line = 253)
    public final void method64(int arg0, int arg1) {
        int var3 = this.field112 + arg0;
        int var4 = this.field111 + arg1;
        int var5 = class2.field45 * var4 + var3;
        int var6 = 0;
        int var7 = this.field110;
        int var8 = this.field109;
        int var9 = class2.field45 - var8;
        int var10 = 0;
        if (var4 < class2.field44) {
            int var11 = class2.field44 - var4;
            var7 -= var11;
            var4 = class2.field44;
            var6 += var8 * var11;
            var5 += class2.field45 * var11;
        }
        if (var4 + var7 > class2.field43) {
            var7 -= var4 + var7 - class2.field43;
        }
        if (var3 < class2.field42) {
            int var12 = class2.field42 - var3;
            var8 -= var12;
            var3 = class2.field42;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class2.field46) {
            int var13 = var3 + var8 - class2.field46;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method61(class2.field48, this.field113, var6, var5, var8, var7, var9, var10);
        }
    }
}
