import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class19 extends class23 {

    @OriginalMember(owner = "mapview!ja", name = "x", descriptor = "[I")
    public int[] field252;

    @OriginalMember(owner = "mapview!ja", name = "w", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "mapview!ja", name = "z", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "mapview!ja", name = "y", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "mapview!ja", name = "v", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(II)V", line = 12)
    public final void method104(int arg0, int arg1) {
        int var3 = this.field250 + arg0;
        int var4 = this.field253 + arg1;
        int var5 = class23.field269 * var4 + var3;
        int var6 = 0;
        int var7 = this.field254;
        int var8 = this.field251;
        int var9 = class23.field269 - var8;
        int var10 = 0;
        if (var4 < class23.field274) {
            int var11 = class23.field274 - var4;
            var7 -= var11;
            var4 = class23.field274;
            var6 += var8 * var11;
            var5 += class23.field269 * var11;
        }
        if (var4 + var7 > class23.field273) {
            var7 -= var4 + var7 - class23.field273;
        }
        if (var3 < class23.field272) {
            int var12 = class23.field272 - var3;
            var8 -= var12;
            var3 = class23.field272;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class23.field275) {
            int var13 = var3 + var8 - class23.field275;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method105(class23.field270, this.field252, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([I[IIIIIIII)V", line = 67)
    private static final void method105(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "()V", line = 141)
    public final void method106() {
        class23.method114(this.field252, this.field251, this.field254);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([I[IIIIIII)V", line = 149)
    private static final void method107(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(II)V", line = 188)
    public final void method108(int arg0, int arg1) {
        int var3 = this.field250 + arg0;
        int var4 = this.field253 + arg1;
        int var5 = class23.field269 * var4 + var3;
        int var6 = 0;
        int var7 = this.field254;
        int var8 = this.field251;
        int var9 = class23.field269 - var8;
        int var10 = 0;
        if (var4 < class23.field274) {
            int var11 = class23.field274 - var4;
            var7 -= var11;
            var4 = class23.field274;
            var6 += var8 * var11;
            var5 += class23.field269 * var11;
        }
        if (var4 + var7 > class23.field273) {
            var7 -= var4 + var7 - class23.field273;
        }
        if (var3 < class23.field272) {
            int var12 = class23.field272 - var3;
            var8 -= var12;
            var3 = class23.field272;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class23.field275) {
            int var13 = var3 + var8 - class23.field275;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method107(class23.field270, this.field252, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "()V", line = 272)
    public class19() {
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "(II)V", line = 274)
    public class19(int arg0, int arg1) {
        this.field252 = new int[arg0 * arg1];
        this.field251 = arg0;
        this.field254 = arg1;
        this.field250 = this.field253 = 0;
    }
}
