import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class671 extends class443 {

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "Lrp;")
    private class680 field9404;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "[I")
    private int[] field9400;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "[I")
    private int[] field9405;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "[[B")
    private byte[][] field9402;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "[I")
    private int[] field9403;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "[I")
    private int[] field9399;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "[I")
    private int[] field9401;

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lrp;Lrt;[Lde;[I[I)V", line = 3)
    public class671(class680 arg0, class470 arg1, class418[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field9404 = arg0;
        this.field9404 = arg0;
        this.field9400 = arg3;
        this.field9405 = arg4;
        this.field9402 = new byte[arg2.length][];
        this.field9403 = new int[arg2.length];
        this.field9399 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field9402[var6] = arg2[var6].field5793;
            this.field9403[var6] = arg2[var6].field5799;
            this.field9399[var6] = arg2[var6].field5794;
        }
        this.field9401 = arg2[0].field5795;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([B[I[IIIIIII)V", line = 26)
    private final void method3762(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        boolean var12 = false;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                byte var17;
                if ((var17 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var17 & 0xFF];
                }
                byte var18;
                if ((var18 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var18 & 0xFF];
                }
                byte var19;
                if ((var19 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var19 & 0xFF];
                }
                byte var20;
                if ((var20 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var20 & 0xFF];
                }
            }
            for (int var15 = var11; var15 < 0; var15++) {
                byte var16;
                if ((var16 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var16 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([B[I[IIIIIIIIIIILaa;II)V", line = 85)
    private final void method3763(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class88 arg13, int arg14, int arg15) {
        class301 var17 = (class301) arg13;
        int[] var18 = var17.field4328;
        int[] var19 = var17.field4331;
        int var20 = arg10 - this.field9404.field9637;
        int var21 = arg11;
        if (arg15 > arg11) {
            var21 = arg15;
            arg5 += (arg15 - arg11) * this.field9404.field9635;
            arg4 += (arg15 - arg11) * arg12;
        }
        int var22 = var18.length + arg15 < arg7 + arg11 ? var18.length + arg15 : arg7 + arg11;
        boolean var23 = false;
        for (int var24 = var21; var24 < var22; var24++) {
            int var25 = var18[var24 - arg15] + arg14;
            int var26 = var19[var24 - arg15];
            int var27 = arg6;
            if (var20 > var25) {
                int var28 = var20 - var25;
                if (var28 >= var26) {
                    arg4 += arg6 + arg9;
                    arg5 += arg6 + arg8;
                    continue;
                }
                var26 -= var28;
            } else {
                int var29 = var25 - var20;
                if (var29 >= arg6) {
                    arg4 += arg6 + arg9;
                    arg5 += arg6 + arg8;
                    continue;
                }
                arg4 += var29;
                var27 = arg6 - var29;
                arg5 += var29;
            }
            int var30 = 0;
            if (var27 < var26) {
                var26 = var27;
            } else {
                var30 = var27 - var26;
            }
            for (int var31 = -var26; var31 < 0; var31++) {
                byte var32;
                if ((var32 = arg0[arg4++]) == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg2[var32 & 0xFF];
                }
            }
            arg4 += arg9 + var30;
            arg5 += arg8 + var30;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([B[IIIIIIIIIIILaa;II)V", line = 174)
    private final void method3764(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class88 arg12, int arg13, int arg14) {
        class301 var16 = (class301) arg12;
        int[] var17 = var16.field4328;
        int[] var18 = var16.field4331;
        int var19 = arg9 - this.field9404.field9637;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field9404.field9635;
            arg3 += (arg14 - arg10) * arg11;
        }
        int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
        for (int var22 = var20; var22 < var21; var22++) {
            int var23 = var17[var22 - arg14] + arg13;
            int var24 = var18[var22 - arg14];
            int var25 = arg5;
            if (var19 > var23) {
                int var26 = var19 - var23;
                if (var26 >= var24) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                var24 -= var26;
            } else {
                int var27 = var23 - var19;
                if (var27 >= arg5) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                arg3 += var27;
                var25 = arg5 - var27;
                arg4 += var27;
            }
            int var28 = 0;
            if (var25 < var24) {
                var24 = var25;
            } else {
                var28 = var25 - var24;
            }
            for (int var29 = -var24; var29 < 0; var29++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            arg3 += arg3 + var28;
            arg4 += arg7 + var28;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(CIIIZLaa;II)V", line = 266)
    public final void method180(char arg0, int arg1, int arg2, int arg3, boolean arg4, class88 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method179(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field9399[arg0] + arg1;
        int var10 = this.field9403[arg0] + arg2;
        int var11 = this.field9400[arg0];
        int var12 = this.field9405[arg0];
        int var13 = this.field9404.field9635;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field9404.field9628) {
            int var18 = this.field9404.field9628 - var10;
            var12 -= var18;
            var10 = this.field9404.field9628;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field9404.field9622) {
            var12 -= var10 + var12 - this.field9404.field9622;
        }
        if (var9 < this.field9404.field9637) {
            int var19 = this.field9404.field9637 - var9;
            var11 -= var19;
            var9 = this.field9404.field9637;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field9404.field9647) {
            int var20 = var9 + var11 - this.field9404.field9647;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 <= 0 || var12 <= 0) {
            return;
        }
        if (arg4) {
            this.method3764(this.field9402[arg0], this.field9404.field9629, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field9400[arg0], arg5, arg6, arg7);
        } else {
            this.method3763(this.field9402[arg0], this.field9404.field9629, this.field9401, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field9400[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!cm", name = "fa", descriptor = "(CIIIZ)V", line = 333)
    public final void method179(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field9399[arg0] + arg1;
        int var7 = this.field9403[arg0] + arg2;
        int var8 = this.field9400[arg0];
        int var9 = this.field9405[arg0];
        int var10 = this.field9404.field9635;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field9404.field9628) {
            int var15 = this.field9404.field9628 - var7;
            var9 -= var15;
            var7 = this.field9404.field9628;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field9404.field9622) {
            var9 -= var7 + var9 - this.field9404.field9622;
        }
        if (var6 < this.field9404.field9637) {
            int var16 = this.field9404.field9637 - var6;
            var8 -= var16;
            var6 = this.field9404.field9637;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field9404.field9647) {
            int var17 = var6 + var8 - this.field9404.field9647;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (arg4) {
            this.method3765(this.field9402[arg0], this.field9404.field9629, arg3, var14, var11, var8, var9, var12, var13);
        } else {
            this.method3762(this.field9402[arg0], this.field9404.field9629, this.field9401, var14, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([B[IIIIIIII)V", line = 394)
    private final void method3765(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }
}
