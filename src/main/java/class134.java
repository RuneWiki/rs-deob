import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class134 extends class69 {

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "[B")
    public byte[] field2190;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "[I")
    private int[] field2191;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
    public final void method860(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2191.length; ++var4) {
            int var5 = this.field2191[var4] >> 16 & 255;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2191[var4] >> 8 & 255;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2191[var4] & 255;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2191[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()Lka;")
    public final class134 method861() {
        class134 var1 = new class134(super.field1096, super.field1102, this.field2191.length);
        var1.field1110 = super.field1110;
        var1.field1100 = super.field1100;
        var1.field1098 = super.field1098;
        var1.field1105 = super.field1105;
        int var2 = this.field2190.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            var1.field2190[var3] = this.field2190[var3];
        }
        var1.field2191 = this.field2191;
        return var1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method862(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 3);
        for (int var12 = -arg7; var12 < 0; ++var12) {
            for (int var13 = var10; var13 < 0; ++var13) {
                byte var16 = arg1[arg4++];
                if (var16 != 0) {
                    arg0[arg5++] = arg2[var16 & 255];
                } else {
                    ++arg5;
                }
                byte var17 = arg1[arg4++];
                if (var17 != 0) {
                    arg0[arg5++] = arg2[var17 & 255];
                } else {
                    ++arg5;
                }
                byte var18 = arg1[arg4++];
                if (var18 != 0) {
                    arg0[arg5++] = arg2[var18 & 255];
                } else {
                    ++arg5;
                }
                byte var19 = arg1[arg4++];
                if (var19 != 0) {
                    arg0[arg5++] = arg2[var19 & 255];
                } else {
                    ++arg5;
                }
            }
            for (int var14 = var11; var14 < 0; ++var14) {
                byte var15 = arg1[arg4++];
                if (var15 != 0) {
                    arg0[arg5++] = arg2[var15 & 255];
                } else {
                    ++arg5;
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method863(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; ++var11) {
            for (int var12 = -arg5; var12 < 0; ++var12) {
                byte var13 = arg1[arg3++];
                if (var13 != 0) {
                    int var14 = arg2[var13 & 255];
                    int var15 = arg0[arg4];
                    arg0[arg4++] = ((var14 & 16711935) * arg9 + (var15 & 16711935) * var10 & -16711936) + ((var14 & 65280) * arg9 + (var15 & 65280) * var10 & 16711680) >> 8;
                } else {
                    ++arg4;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public final void method864(int arg0, int arg1, int arg2, int arg3) {
        int var5 = super.field1096;
        int var6 = super.field1102;
        int var7 = 0;
        int var8 = 0;
        int var9 = super.field1110;
        int var10 = super.field1100;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (super.field1098 > 0) {
            int var13 = ((super.field1098 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (super.field1098 << 16);
        }
        if (super.field1105 > 0) {
            int var14 = ((super.field1105 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (super.field1105 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = class17.field308 * arg1 + arg0;
        int var16 = class17.field308 - arg2;
        if (arg1 + arg3 > class17.field311) {
            arg3 -= arg1 + arg3 - class17.field311;
        }
        if (arg1 < class17.field314) {
            int var17 = class17.field314 - arg1;
            arg3 -= var17;
            var15 += class17.field308 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class17.field312) {
            int var18 = arg0 + arg2 - class17.field312;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class17.field313) {
            int var19 = class17.field313 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method866(class17.field307, this.field2190, this.field2191, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
    public final void method482(int arg0, int arg1) {
        int var3 = super.field1098 + arg0;
        int var4 = super.field1105 + arg1;
        int var5 = class17.field308 * var4 + var3;
        int var6 = 0;
        int var7 = super.field1102;
        int var8 = super.field1096;
        int var9 = class17.field308 - var8;
        int var10 = 0;
        if (var4 < class17.field314) {
            int var11 = class17.field314 - var4;
            var7 -= var11;
            var4 = class17.field314;
            var6 += var8 * var11;
            var5 += class17.field308 * var11;
        }
        if (var4 + var7 > class17.field311) {
            var7 -= var4 + var7 - class17.field311;
        }
        if (var3 < class17.field313) {
            int var12 = class17.field313 - var3;
            var8 -= var12;
            var3 = class17.field313;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class17.field312) {
            int var13 = var3 + var8 - class17.field312;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method862(class17.field307, this.field2190, this.field2191, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public final void method865() {
        if (super.field1110 != super.field1096 || super.field1102 != super.field1100) {
            byte[] var1 = new byte[super.field1110 * super.field1100];
            int var2 = 0;
            for (int var3 = 0; var3 < super.field1102; ++var3) {
                for (int var4 = 0; var4 < super.field1096; ++var4) {
                    var1[(super.field1105 + var3) * super.field1110 + super.field1098 + var4] = this.field2190[var2++];
                }
            }
            this.field2190 = var1;
            super.field1096 = super.field1110;
            super.field1102 = super.field1100;
            super.field1098 = 0;
            super.field1105 = 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method866(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; ++var13) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; ++var15) {
                byte var16 = arg1[(arg3 >> 16) + var14];
                if (var16 != 0) {
                    arg0[arg5++] = arg2[var16 & 255];
                } else {
                    ++arg5;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public final void method867() {
        byte[] var1 = new byte[super.field1102 * super.field1096];
        int var2 = 0;
        for (int var3 = 0; var3 < super.field1096; ++var3) {
            for (int var7 = super.field1102 - 1; var7 >= 0; --var7) {
                var1[var2++] = this.field2190[super.field1096 * var7 + var3];
            }
        }
        this.field2190 = var1;
        int var4 = super.field1105;
        super.field1105 = super.field1098;
        super.field1098 = super.field1100 - super.field1102 - var4;
        int var5 = super.field1102;
        super.field1102 = super.field1096;
        super.field1096 = var5;
        int var6 = super.field1100;
        super.field1100 = super.field1110;
        super.field1110 = var6;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIII[B[I)V")
    public class134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        super.field1110 = arg0;
        super.field1100 = arg1;
        super.field1098 = arg2;
        super.field1105 = arg3;
        super.field1096 = arg4;
        super.field1102 = arg5;
        this.field2190 = arg6;
        this.field2191 = arg7;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public final void method483(int arg0, int arg1, int arg2) {
        int var4 = super.field1098 + arg0;
        int var5 = super.field1105 + arg1;
        int var6 = class17.field308 * var5 + var4;
        int var7 = 0;
        int var8 = super.field1102;
        int var9 = super.field1096;
        int var10 = class17.field308 - var9;
        int var11 = 0;
        if (var5 < class17.field314) {
            int var12 = class17.field314 - var5;
            var8 -= var12;
            var5 = class17.field314;
            var7 += var9 * var12;
            var6 += class17.field308 * var12;
        }
        if (var5 + var8 > class17.field311) {
            var8 -= var5 + var8 - class17.field311;
        }
        if (var4 < class17.field313) {
            int var13 = class17.field313 - var4;
            var9 -= var13;
            var4 = class17.field313;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class17.field312) {
            int var14 = var4 + var9 - class17.field312;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method863(class17.field307, this.field2190, this.field2191, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(III)V")
    private class134(int arg0, int arg1, int arg2) {
        super.field1110 = super.field1096 = arg0;
        super.field1100 = super.field1102 = arg1;
        super.field1098 = super.field1105 = 0;
        this.field2190 = new byte[arg0 * arg1];
        this.field2191 = new int[arg2];
    }
}
