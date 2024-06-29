import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class30 extends class221 {

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "[B")
    public byte[] field628;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "[I")
    public int[] field632;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method223(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)V")
    public final void method224(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field632.length; var4++) {
            int var5 = this.field632[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field632[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field632[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field632[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(IIII)V")
    public final void method225(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field633;
        int var6 = this.field634;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field635;
        int var10 = this.field629;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field631 > 0) {
            int var13 = ((this.field631 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field631 << 16);
        }
        if (this.field630 > 0) {
            int var14 = ((this.field630 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field630 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class221.field3833 * arg1 + arg0;
        int var16 = class221.field3833 - arg2;
        if (arg1 + arg3 > class221.field3836) {
            arg3 -= arg1 + arg3 - class221.field3836;
        }
        if (arg1 < class221.field3835) {
            int var17 = class221.field3835 - arg1;
            arg3 -= var17;
            var15 += class221.field3833 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class221.field3832) {
            int var18 = arg0 + arg2 - class221.field3832;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class221.field3837) {
            int var19 = class221.field3837 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method223(class221.field3834, this.field628, this.field632, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)V")
    public final void method226(int arg0, int arg1, int arg2) {
        int var4 = this.field631 + arg0;
        int var5 = this.field630 + arg1;
        int var6 = class221.field3833 * var5 + var4;
        int var7 = 0;
        int var8 = this.field634;
        int var9 = this.field633;
        int var10 = class221.field3833 - var9;
        int var11 = 0;
        if (var5 < class221.field3835) {
            int var12 = class221.field3835 - var5;
            var8 -= var12;
            var5 = class221.field3835;
            var7 += var9 * var12;
            var6 += class221.field3833 * var12;
        }
        if (var5 + var8 > class221.field3836) {
            var8 -= var5 + var8 - class221.field3836;
        }
        if (var4 < class221.field3837) {
            int var13 = class221.field3837 - var4;
            var9 -= var13;
            var4 = class221.field3837;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class221.field3832) {
            int var14 = var4 + var9 - class221.field3832;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method228(class221.field3834, this.field628, this.field632, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method227(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                byte var16 = arg1[arg4++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg4++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg1[arg4++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg1[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var19 & 0xFF];
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                byte var15 = arg1[arg4++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var15 & 0xFF];
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method228(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                byte var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg2[var13 & 0xFF];
                    int var15 = arg0[arg4];
                    arg0[arg4++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V")
    public final void method229(int arg0, int arg1) {
        int var3 = this.field631 + arg0;
        int var4 = this.field630 + arg1;
        int var5 = class221.field3833 * var4 + var3;
        int var6 = 0;
        int var7 = this.field634;
        int var8 = this.field633;
        int var9 = class221.field3833 - var8;
        int var10 = 0;
        if (var4 < class221.field3835) {
            int var11 = class221.field3835 - var4;
            var7 -= var11;
            var4 = class221.field3835;
            var6 += var8 * var11;
            var5 += class221.field3833 * var11;
        }
        if (var4 + var7 > class221.field3836) {
            var7 -= var4 + var7 - class221.field3836;
        }
        if (var3 < class221.field3837) {
            int var12 = class221.field3837 - var3;
            var8 -= var12;
            var3 = class221.field3837;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class221.field3832) {
            int var13 = var3 + var8 - class221.field3832;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method227(class221.field3834, this.field628, this.field632, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "()V")
    public final void method230() {
        if (this.field635 == this.field633 && this.field634 == this.field629) {
            return;
        }
        byte[] var1 = new byte[this.field635 * this.field629];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field634; var3++) {
            for (int var4 = 0; var4 < this.field633; var4++) {
                var1[(this.field630 + var3) * this.field635 + this.field631 + var4] = this.field628[var2++];
            }
        }
        this.field628 = var1;
        this.field633 = this.field635;
        this.field634 = this.field629;
        this.field631 = 0;
        this.field630 = 0;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    protected class30() {
    }
}
