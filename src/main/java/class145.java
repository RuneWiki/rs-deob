import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class145 extends class173 {

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "[B")
    public byte[] field2977;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "[I")
    public int[] field2974;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "()V")
    public final void method939() {
        if (this.field2973 == this.field2972 && this.field2976 == this.field2971) {
            return;
        }
        byte[] var1 = new byte[this.field2973 * this.field2971];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2976; var3++) {
            for (int var4 = 0; var4 < this.field2972; var4++) {
                var1[(this.field2970 + var3) * this.field2973 + this.field2975 + var4] = this.field2977[var2++];
            }
        }
        this.field2977 = var1;
        this.field2972 = this.field2973;
        this.field2976 = this.field2971;
        this.field2975 = 0;
        this.field2970 = 0;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
    public final void method940(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2974.length; var4++) {
            int var5 = this.field2974[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2974[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2974[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2974[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method941(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)V")
    public final void method942(int arg0, int arg1, int arg2) {
        int var4 = this.field2975 + arg0;
        int var5 = this.field2970 + arg1;
        int var6 = class173.field3504 * var5 + var4;
        int var7 = 0;
        int var8 = this.field2976;
        int var9 = this.field2972;
        int var10 = class173.field3504 - var9;
        int var11 = 0;
        if (var5 < class173.field3506) {
            int var12 = class173.field3506 - var5;
            var8 -= var12;
            var5 = class173.field3506;
            var7 += var9 * var12;
            var6 += class173.field3504 * var12;
        }
        if (var5 + var8 > class173.field3501) {
            var8 -= var5 + var8 - class173.field3501;
        }
        if (var4 < class173.field3503) {
            int var13 = class173.field3503 - var4;
            var9 -= var13;
            var4 = class173.field3503;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class173.field3507) {
            int var14 = var4 + var9 - class173.field3507;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method943(class173.field3502, this.field2977, this.field2974, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method943(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V")
    public final void method944(int arg0, int arg1) {
        int var3 = this.field2975 + arg0;
        int var4 = this.field2970 + arg1;
        int var5 = class173.field3504 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2976;
        int var8 = this.field2972;
        int var9 = class173.field3504 - var8;
        int var10 = 0;
        if (var4 < class173.field3506) {
            int var11 = class173.field3506 - var4;
            var7 -= var11;
            var4 = class173.field3506;
            var6 += var8 * var11;
            var5 += class173.field3504 * var11;
        }
        if (var4 + var7 > class173.field3501) {
            var7 -= var4 + var7 - class173.field3501;
        }
        if (var3 < class173.field3503) {
            int var12 = class173.field3503 - var3;
            var8 -= var12;
            var3 = class173.field3503;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class173.field3507) {
            int var13 = var3 + var8 - class173.field3507;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method941(class173.field3502, this.field2977, this.field2974, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    protected class145() {
    }
}
