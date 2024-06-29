import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class17 extends class8 {

    @OriginalMember(owner = "mapview!i", name = "E", descriptor = "[I")
    public int[] field247;

    @OriginalMember(owner = "mapview!i", name = "G", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "mapview!i", name = "C", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "mapview!i", name = "D", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "mapview!i", name = "F", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "([I[IIIIIII)V", line = 12)
    private static final void method144(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "()V", line = 47)
    public final void method145() {
        class8.method66(this.field247, this.field249, this.field245);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "([I[IIIIIIII)V", line = 81)
    private static final void method146(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)V", line = 141)
    public final void method147(int arg0, int arg1) {
        int var3 = this.field248 + arg0;
        int var4 = this.field246 + arg1;
        int var5 = class8.field109 * var4 + var3;
        int var6 = 0;
        int var7 = this.field245;
        int var8 = this.field249;
        int var9 = class8.field109 - var8;
        int var10 = 0;
        if (var4 < class8.field110) {
            int var11 = class8.field110 - var4;
            var7 -= var11;
            var4 = class8.field110;
            var6 += var8 * var11;
            var5 += class8.field109 * var11;
        }
        if (var4 + var7 > class8.field113) {
            var7 -= var4 + var7 - class8.field113;
        }
        if (var3 < class8.field108) {
            int var12 = class8.field108 - var3;
            var8 -= var12;
            var3 = class8.field108;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class8.field111) {
            int var13 = var3 + var8 - class8.field111;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method146(class8.field114, this.field247, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(II)V", line = 209)
    public final void method148(int arg0, int arg1) {
        int var3 = this.field248 + arg0;
        int var4 = this.field246 + arg1;
        int var5 = class8.field109 * var4 + var3;
        int var6 = 0;
        int var7 = this.field245;
        int var8 = this.field249;
        int var9 = class8.field109 - var8;
        int var10 = 0;
        if (var4 < class8.field110) {
            int var11 = class8.field110 - var4;
            var7 -= var11;
            var4 = class8.field110;
            var6 += var8 * var11;
            var5 += class8.field109 * var11;
        }
        if (var4 + var7 > class8.field113) {
            var7 -= var4 + var7 - class8.field113;
        }
        if (var3 < class8.field108) {
            int var12 = class8.field108 - var3;
            var8 -= var12;
            var3 = class8.field108;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class8.field111) {
            int var13 = var3 + var8 - class8.field111;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method144(class8.field114, this.field247, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "()V", line = 267)
    public class17() {
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "(II)V", line = 271)
    public class17(int arg0, int arg1) {
        this.field247 = new int[arg0 * arg1];
        this.field249 = arg0;
        this.field245 = arg1;
        this.field248 = this.field246 = 0;
    }
}
