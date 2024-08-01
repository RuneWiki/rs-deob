import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("df")
public class class37 extends class11 {

    @OriginalMember(owner = "df", name = "N", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "df", name = "P", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "df", name = "R", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "df", name = "S", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "df", name = "T", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "df", name = "U", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "df", name = "O", descriptor = "[B")
    public byte[] field802;

    @OriginalMember(owner = "df", name = "Q", descriptor = "[I")
    public int[] field804;

    @OriginalMember(owner = "df", name = "a", descriptor = "(II)V")
    public final void method280(int arg0, int arg1) {
        int var3 = this.field803 + arg0;
        int var4 = this.field807 + arg1;
        int var5 = class11.field172 * var4 + var3;
        int var6 = 0;
        int var7 = this.field806;
        int var8 = this.field801;
        int var9 = class11.field172 - var8;
        int var10 = 0;
        if (var4 < class11.field170) {
            int var11 = class11.field170 - var4;
            var7 -= var11;
            var4 = class11.field170;
            var6 += var8 * var11;
            var5 += class11.field172 * var11;
        }
        if (var4 + var7 > class11.field174) {
            var7 -= var4 + var7 - class11.field174;
        }
        if (var3 < class11.field171) {
            int var12 = class11.field171 - var3;
            var8 -= var12;
            var3 = class11.field171;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class11.field173) {
            int var13 = var3 + var8 - class11.field173;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method281(class11.field175, this.field802, this.field804, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "df", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method281(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "df", name = "a", descriptor = "(III)V")
    public final void method282(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field804.length; var4++) {
            int var5 = this.field804[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field804[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field804[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field804[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "df", name = "b", descriptor = "(III)V")
    public final void method283(int arg0, int arg1, int arg2) {
        int var4 = this.field803 + arg0;
        int var5 = this.field807 + arg1;
        int var6 = class11.field172 * var5 + var4;
        int var7 = 0;
        int var8 = this.field806;
        int var9 = this.field801;
        int var10 = class11.field172 - var9;
        int var11 = 0;
        if (var5 < class11.field170) {
            int var12 = class11.field170 - var5;
            var8 -= var12;
            var5 = class11.field170;
            var7 += var9 * var12;
            var6 += class11.field172 * var12;
        }
        if (var5 + var8 > class11.field174) {
            var8 -= var5 + var8 - class11.field174;
        }
        if (var4 < class11.field171) {
            int var13 = class11.field171 - var4;
            var9 -= var13;
            var4 = class11.field171;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class11.field173) {
            int var14 = var4 + var9 - class11.field173;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method285(class11.field175, this.field802, this.field804, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "df", name = "d", descriptor = "()V")
    public final void method284() {
        if (this.field805 == this.field801 && this.field808 == this.field806) {
            return;
        }
        byte[] var1 = new byte[this.field808 * this.field805];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field806; var3++) {
            for (int var4 = 0; var4 < this.field801; var4++) {
                var1[(this.field807 + var3) * this.field805 + this.field803 + var4] = this.field802[var2++];
            }
        }
        this.field802 = var1;
        this.field801 = this.field805;
        this.field806 = this.field808;
        this.field803 = 0;
        this.field807 = 0;
    }

    @OriginalMember(owner = "df", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method285(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "df", name = "<init>", descriptor = "()V")
    protected class37() {
    }
}
