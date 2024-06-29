import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class333 extends class345 {

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Lj;")
    private class349 field4516;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "[I")
    private int[] field4515;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "[I")
    private int[] field4510;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "[[B")
    private byte[][] field4513;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "[I")
    private int[] field4511;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "[I")
    private int[] field4512;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "[I")
    private int[] field4514;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(CIIIZLkf;II)V", line = 8)
    public final void method1319(char arg0, int arg1, int arg2, int arg3, boolean arg4, class152 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method1314(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field4512[arg0] + arg1;
        int var10 = this.field4511[arg0] + arg2;
        int var11 = this.field4515[arg0];
        int var12 = this.field4510[arg0];
        int var13 = this.field4516.field4833;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field4516.field4825) {
            int var18 = this.field4516.field4825 - var10;
            var12 -= var18;
            var10 = this.field4516.field4825;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field4516.field4828) {
            var12 -= var10 + var12 - this.field4516.field4828;
        }
        if (var9 < this.field4516.field4842) {
            int var19 = this.field4516.field4842 - var9;
            var11 -= var19;
            var9 = this.field4516.field4842;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field4516.field4820) {
            int var20 = var9 + var11 - this.field4516.field4820;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 <= 0 || var12 <= 0) {
            return;
        }
        if (arg4) {
            this.method1907(this.field4513[arg0], this.field4516.field4827, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field4515[arg0], arg5, arg6, arg7);
        } else {
            this.method1908(this.field4513[arg0], this.field4516.field4827, this.field4514, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field4515[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([B[I[IIIIIII)V", line = 75)
    private final void method1906(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([B[IIIIIIIIIIILkf;II)V", line = 133)
    private final void method1907(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class152 arg12, int arg13, int arg14) {
        class129 var16 = (class129) arg12;
        int[] var17 = var16.field1894;
        int[] var18 = var16.field1897;
        int var19 = arg9 - this.field4516.field4842;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field4516.field4833;
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([B[I[IIIIIIIIIIILkf;II)V", line = 220)
    private final void method1908(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class152 arg13, int arg14, int arg15) {
        class129 var17 = (class129) arg13;
        int[] var18 = var17.field1894;
        int[] var19 = var17.field1897;
        int var20 = arg10 - this.field4516.field4842;
        int var21 = arg11;
        if (arg15 > arg11) {
            var21 = arg15;
            arg5 += (arg15 - arg11) * this.field4516.field4833;
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(CIIIZ)V", line = 307)
    public final void method1314(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field4512[arg0] + arg1;
        int var7 = this.field4511[arg0] + arg2;
        int var8 = this.field4515[arg0];
        int var9 = this.field4510[arg0];
        int var10 = this.field4516.field4833;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field4516.field4825) {
            int var15 = this.field4516.field4825 - var7;
            var9 -= var15;
            var7 = this.field4516.field4825;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field4516.field4828) {
            var9 -= var7 + var9 - this.field4516.field4828;
        }
        if (var6 < this.field4516.field4842) {
            int var16 = this.field4516.field4842 - var6;
            var8 -= var16;
            var6 = this.field4516.field4842;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field4516.field4820) {
            int var17 = var6 + var8 - this.field4516.field4820;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (arg4) {
            this.method1909(this.field4513[arg0], this.field4516.field4827, arg3, var14, var11, var8, var9, var12, var13);
        } else {
            this.method1906(this.field4513[arg0], this.field4516.field4827, this.field4514, var14, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lj;Lvi;[Ldk;[I[I)V", line = 370)
    public class333(class349 arg0, class347 arg1, class325[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field4516 = arg0;
        this.field4516 = arg0;
        this.field4515 = arg3;
        this.field4510 = arg4;
        this.field4513 = new byte[arg2.length][];
        this.field4511 = new int[arg2.length];
        this.field4512 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field4513[var6] = arg2[var6].field4337;
            this.field4511[var6] = arg2[var6].field4329;
            this.field4512[var6] = arg2[var6].field4336;
        }
        this.field4514 = arg2[0].field4334;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([B[IIIIIIII)V", line = 393)
    private final void method1909(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
