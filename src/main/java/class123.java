import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class123 extends class254 {

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[B")
    public byte[] field1853;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
    private int[] field1854;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 9)
    private static final void method848(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 52)
    public final void method849() {
        int var1 = 0;
        int var2 = this.field1853.length - 7;
        while (var1 < var2) {
            this.field1853[var1++] = 0;
            this.field1853[var1++] = 0;
            this.field1853[var1++] = 0;
            this.field1853[var1++] = 0;
            this.field1853[var1++] = 0;
            this.field1853[var1++] = 0;
            this.field1853[var1++] = 0;
            this.field1853[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field1853[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V", line = 75)
    public final void method850(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1854.length; var4++) {
            int var5 = this.field1854[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1854[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1854[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1854[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([I[B[IIIIIIIIIII)V", line = 117)
    private static final void method851(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg3;
        int var14 = arg12 >> 16 & 0xFF;
        int var15 = arg12 >> 8 & 0xFF;
        int var16 = arg12 & 0xFF;
        for (int var17 = -arg8; var17 < 0; var17++) {
            int var18 = (arg4 >> 16) * arg11;
            for (int var19 = -arg7; var19 < 0; var19++) {
                byte var20 = arg1[(arg3 >> 16) + var18];
                if (var20 == 0) {
                    arg5++;
                } else {
                    int var21 = arg2[var20 & 0xFF];
                    int var22 = var21 >> 16 & 0xFF;
                    int var23 = var21 >> 8 & 0xFF;
                    int var24 = var21 & 0xFF;
                    arg0[arg5++] = (var16 * var24 >> 8) + (var14 * var22 >> 8 << 16) + (var15 * var23 >> 8 << 8);
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()V", line = 164)
    public final void method852() {
        if (this.field4037 == this.field4027 && this.field4039 == this.field4028) {
            return;
        }
        byte[] var1 = new byte[this.field4028 * this.field4027];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4039; var3++) {
            for (int var4 = 0; var4 < this.field4037; var4++) {
                var1[(this.field4031 + var3) * this.field4027 + this.field4034 + var4] = this.field1853[var2++];
            }
        }
        this.field1853 = var1;
        this.field4037 = this.field4027;
        this.field4039 = this.field4028;
        this.field4034 = 0;
        this.field4031 = 0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V", line = 196)
    public final void method853(int arg0, int arg1, int arg2) {
        int var4 = this.field4034 + arg0;
        int var5 = this.field4031 + arg1;
        int var6 = class216.field3482 * var5 + var4;
        int var7 = 0;
        int var8 = this.field4039;
        int var9 = this.field4037;
        int var10 = class216.field3482 - var9;
        int var11 = 0;
        if (var5 < class216.field3485) {
            int var12 = class216.field3485 - var5;
            var8 -= var12;
            var5 = class216.field3485;
            var7 += var9 * var12;
            var6 += class216.field3482 * var12;
        }
        if (var5 + var8 > class216.field3479) {
            var8 -= var5 + var8 - class216.field3479;
        }
        if (var4 < class216.field3483) {
            int var13 = class216.field3483 - var4;
            var9 -= var13;
            var4 = class216.field3483;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class216.field3486) {
            int var14 = var4 + var9 - class216.field3486;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method858(class216.field3480, this.field1853, this.field1854, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V", line = 251)
    public final void method854(int arg0, int arg1) {
        int var3 = this.field4034 + arg0;
        int var4 = this.field4031 + arg1;
        int var5 = class216.field3482 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4039;
        int var8 = this.field4037;
        int var9 = class216.field3482 - var8;
        int var10 = 0;
        if (var4 < class216.field3485) {
            int var11 = class216.field3485 - var4;
            var7 -= var11;
            var4 = class216.field3485;
            var6 += var8 * var11;
            var5 += class216.field3482 * var11;
        }
        if (var4 + var7 > class216.field3479) {
            var7 -= var4 + var7 - class216.field3479;
        }
        if (var3 < class216.field3483) {
            int var12 = class216.field3483 - var3;
            var8 -= var12;
            var3 = class216.field3483;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class216.field3486) {
            int var13 = var3 + var8 - class216.field3486;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method860(class216.field3480, this.field1853, this.field1854, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()V", line = 307)
    public final void method855() {
        byte[] var1 = new byte[this.field4039 * this.field4037];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4037; var3++) {
            for (int var4 = this.field4039 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field1853[this.field4037 * var4 + var3];
            }
        }
        this.field1853 = var1;
        int var5 = this.field4031;
        this.field4031 = this.field4034;
        this.field4034 = this.field4028 - this.field4039 - var5;
        int var6 = this.field4039;
        this.field4039 = this.field4037;
        this.field4037 = var6;
        int var7 = this.field4028;
        this.field4028 = this.field4027;
        this.field4027 = var7;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V", line = 342)
    public final void method856(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field4037;
        int var7 = this.field4039;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4027;
        int var11 = this.field4028;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4034 > 0) {
            int var14 = ((this.field4034 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4034 << 16);
        }
        if (this.field4031 > 0) {
            int var15 = ((this.field4031 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4031 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        int var16 = class216.field3482 * arg1 + arg0;
        int var17 = class216.field3482 - arg2;
        if (arg1 + arg3 > class216.field3479) {
            arg3 -= arg1 + arg3 - class216.field3479;
        }
        if (arg1 < class216.field3485) {
            int var18 = class216.field3485 - arg1;
            arg3 -= var18;
            var16 += class216.field3482 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class216.field3486) {
            int var19 = arg0 + arg2 - class216.field3486;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class216.field3483) {
            int var20 = class216.field3483 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method851(class216.field3480, this.field1853, this.field1854, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIII)V", line = 417)
    public final void method857(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field4037;
        int var6 = this.field4039;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4027;
        int var10 = this.field4028;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4034 > 0) {
            int var13 = ((this.field4034 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4034 << 16);
        }
        if (this.field4031 > 0) {
            int var14 = ((this.field4031 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4031 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class216.field3482 * arg1 + arg0;
        int var16 = class216.field3482 - arg2;
        if (arg1 + arg3 > class216.field3479) {
            arg3 -= arg1 + arg3 - class216.field3479;
        }
        if (arg1 < class216.field3485) {
            int var17 = class216.field3485 - arg1;
            arg3 -= var17;
            var15 += class216.field3482 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class216.field3486) {
            int var18 = arg0 + arg2 - class216.field3486;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class216.field3483) {
            int var19 = class216.field3483 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method848(class216.field3480, this.field1853, this.field1854, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 492)
    private static final void method858(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()V", line = 527)
    public final void method859() {
        byte[] var1 = new byte[this.field4039 * this.field4037];
        int var2 = 0;
        for (int var3 = this.field4039 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field4037; var4++) {
                var1[var2++] = this.field1853[this.field4037 * var3 + var4];
            }
        }
        this.field1853 = var1;
        this.field4031 = this.field4028 - this.field4039 - this.field4031;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 552)
    private static final void method860(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                byte var14 = arg1[arg4++];
                if (var14 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var14 & 0xFF];
                }
                byte var15 = arg1[arg4++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var15 & 0xFF];
                }
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
            }
            for (int var18 = var11; var18 < 0; var18++) {
                byte var19 = arg1[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var19 & 0xFF];
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 613)
    public class123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4027 = arg0;
        this.field4028 = arg1;
        this.field4034 = arg2;
        this.field4031 = arg3;
        this.field4037 = arg4;
        this.field4039 = arg5;
        this.field1853 = arg6;
        this.field1854 = arg7;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(III)V", line = 625)
    public class123(int arg0, int arg1, int arg2) {
        this.field4027 = this.field4037 = arg0;
        this.field4028 = this.field4039 = arg1;
        this.field4034 = this.field4031 = 0;
        this.field1853 = new byte[arg0 * arg1];
        this.field1854 = new int[arg2];
    }
}
