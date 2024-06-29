import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 extends class27 {

    @OriginalMember(owner = "mapview!d", name = "B", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "mapview!d", name = "C", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "mapview!d", name = "D", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "mapview!d", name = "F", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "mapview!d", name = "I", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "mapview!d", name = "J", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "mapview!d", name = "G", descriptor = "[B")
    public byte[] field60;

    @OriginalMember(owner = "mapview!d", name = "E", descriptor = "[I")
    public int[] field58;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(II)V", line = 7)
    public final void method27(int arg0, int arg1) {
        int var3 = this.field56 + arg0;
        int var4 = this.field61 + arg1;
        int var5 = class27.field337 * var4 + var3;
        int var6 = 0;
        int var7 = this.field55;
        int var8 = this.field62;
        int var9 = class27.field337 - var8;
        int var10 = 0;
        if (var4 < class27.field339) {
            int var11 = class27.field339 - var4;
            var7 -= var11;
            var4 = class27.field339;
            var6 += var8 * var11;
            var5 += class27.field337 * var11;
        }
        if (var4 + var7 > class27.field336) {
            var7 -= var4 + var7 - class27.field336;
        }
        if (var3 < class27.field340) {
            int var12 = class27.field340 - var3;
            var8 -= var12;
            var3 = class27.field340;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class27.field341) {
            int var13 = var3 + var8 - class27.field341;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method30(class27.field338, this.field60, this.field58, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 64)
    private static final void method28(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; var13++) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; var15++) {
                byte var16 = arg1[(arg3 >> 16) + var14];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "(IIII)V", line = 109)
    public final void method29(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field62;
        int var6 = this.field55;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field57;
        int var10 = this.field59;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field56 > 0) {
            int var13 = ((this.field56 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field56 << 16);
        }
        if (this.field61 > 0) {
            int var14 = ((this.field61 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field61 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class27.field337 * arg1 + arg0;
        int var16 = class27.field337 - arg2;
        if (arg1 + arg3 > class27.field336) {
            arg3 -= arg1 + arg3 - class27.field336;
        }
        if (arg1 < class27.field339) {
            int var17 = class27.field339 - arg1;
            arg3 -= var17;
            var15 += class27.field337 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class27.field341) {
            int var18 = arg0 + arg2 - class27.field341;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class27.field340) {
            int var19 = class27.field340 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method28(class27.field338, this.field60, this.field58, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([I[B[IIIIIII)V", line = 190)
    private static final void method30(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                byte var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var13 & 0xFF];
                }
                byte var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var14 & 0xFF];
                }
                byte var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var16 & 0xFF];
                }
            }
            for (int var17 = var10; var17 < 0; var17++) {
                byte var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var18 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }
}
