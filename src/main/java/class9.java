import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 extends class20 {

    @OriginalMember(owner = "mapview!e", name = "A", descriptor = "[I")
    public int[] field154;

    @OriginalMember(owner = "mapview!e", name = "z", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "mapview!e", name = "y", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "mapview!e", name = "x", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "mapview!e", name = "w", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([I[IIIIIIII)V", line = 4)
    private static final void method59(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "()V", line = 85)
    public final void method60() {
        class20.method123(this.field154, this.field153, this.field152);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(II)V", line = 107)
    public final void method61(int arg0, int arg1) {
        int var3 = this.field150 + arg0;
        int var4 = this.field151 + arg1;
        int var5 = class20.field248 * var4 + var3;
        int var6 = 0;
        int var7 = this.field152;
        int var8 = this.field153;
        int var9 = class20.field248 - var8;
        int var10 = 0;
        if (var4 < class20.field246) {
            int var11 = class20.field246 - var4;
            var7 -= var11;
            var4 = class20.field246;
            var6 += var8 * var11;
            var5 += class20.field248 * var11;
        }
        if (var4 + var7 > class20.field249) {
            var7 -= var4 + var7 - class20.field249;
        }
        if (var3 < class20.field251) {
            int var12 = class20.field251 - var3;
            var8 -= var12;
            var3 = class20.field251;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class20.field252) {
            int var13 = var3 + var8 - class20.field252;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method59(class20.field247, this.field154, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(II)V", line = 169)
    public final void method62(int arg0, int arg1) {
        int var3 = this.field150 + arg0;
        int var4 = this.field151 + arg1;
        int var5 = class20.field248 * var4 + var3;
        int var6 = 0;
        int var7 = this.field152;
        int var8 = this.field153;
        int var9 = class20.field248 - var8;
        int var10 = 0;
        if (var4 < class20.field246) {
            int var11 = class20.field246 - var4;
            var7 -= var11;
            var4 = class20.field246;
            var6 += var8 * var11;
            var5 += class20.field248 * var11;
        }
        if (var4 + var7 > class20.field249) {
            var7 -= var4 + var7 - class20.field249;
        }
        if (var3 < class20.field251) {
            int var12 = class20.field251 - var3;
            var8 -= var12;
            var3 = class20.field251;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class20.field252) {
            int var13 = var3 + var8 - class20.field252;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method63(class20.field247, this.field154, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([I[IIIIIII)V", line = 226)
    private static final void method63(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "()V", line = 270)
    public class9() {
    }

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "(II)V", line = 273)
    public class9(int arg0, int arg1) {
        this.field154 = new int[arg0 * arg1];
        this.field153 = arg0;
        this.field152 = arg1;
        this.field150 = this.field151 = 0;
    }
}
