import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class74 extends class149 {

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[B")
    public byte[] field1224;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "[I")
    private int[] field1225;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()V")
    public final void method585() {
        byte[] var1 = new byte[super.field2447 * super.field2440];
        int var2 = 0;
        for (int var3 = 0; var3 < super.field2440; ++var3) {
            for (int var7 = super.field2447 - 1; var7 >= 0; --var7) {
                var1[var2++] = this.field1224[super.field2440 * var7 + var3];
            }
        }
        this.field1224 = var1;
        int var4 = super.field2442;
        super.field2442 = super.field2445;
        super.field2445 = super.field2444 - super.field2447 - var4;
        int var5 = super.field2447;
        super.field2447 = super.field2440;
        super.field2440 = var5;
        int var6 = super.field2444;
        super.field2444 = super.field2439;
        super.field2439 = var6;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method586(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()V")
    public final void method587() {
        byte[] var1 = new byte[super.field2447 * super.field2440];
        int var2 = 0;
        for (int var3 = super.field2447 - 1; var3 >= 0; --var3) {
            for (int var4 = 0; var4 < super.field2440; ++var4) {
                var1[var2++] = this.field1224[super.field2440 * var3 + var4];
            }
        }
        this.field1224 = var1;
        super.field2442 = super.field2444 - super.field2447 - super.field2442;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
    public final void method588(int arg0, int arg1) {
        int var3 = super.field2445 + arg0;
        int var4 = super.field2442 + arg1;
        int var5 = class63.field1049 * var4 + var3;
        int var6 = 0;
        int var7 = super.field2447;
        int var8 = super.field2440;
        int var9 = class63.field1049 - var8;
        int var10 = 0;
        if (var4 < class63.field1052) {
            int var11 = class63.field1052 - var4;
            var7 -= var11;
            var4 = class63.field1052;
            var6 += var8 * var11;
            var5 += class63.field1049 * var11;
        }
        if (var4 + var7 > class63.field1055) {
            var7 -= var4 + var7 - class63.field1055;
        }
        if (var3 < class63.field1050) {
            int var12 = class63.field1050 - var3;
            var8 -= var12;
            var3 = class63.field1050;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class63.field1056) {
            int var13 = var3 + var8 - class63.field1056;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method586(class63.field1048, this.field1224, this.field1225, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public final void method589(int arg0, int arg1, int arg2) {
        int var4 = super.field2445 + arg0;
        int var5 = super.field2442 + arg1;
        int var6 = class63.field1049 * var5 + var4;
        int var7 = 0;
        int var8 = super.field2447;
        int var9 = super.field2440;
        int var10 = class63.field1049 - var9;
        int var11 = 0;
        if (var5 < class63.field1052) {
            int var12 = class63.field1052 - var5;
            var8 -= var12;
            var5 = class63.field1052;
            var7 += var9 * var12;
            var6 += class63.field1049 * var12;
        }
        if (var5 + var8 > class63.field1055) {
            var8 -= var5 + var8 - class63.field1055;
        }
        if (var4 < class63.field1050) {
            int var13 = class63.field1050 - var4;
            var9 -= var13;
            var4 = class63.field1050;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class63.field1056) {
            int var14 = var4 + var9 - class63.field1056;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method591(class63.field1048, this.field1224, this.field1225, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([I[B[IIIIIIIIIII)V")
    private static final void method590(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg3;
        int var14 = arg12 >> 16 & 255;
        int var15 = arg12 >> 8 & 255;
        int var16 = arg12 & 255;
        for (int var17 = -arg8; var17 < 0; ++var17) {
            int var18 = (arg4 >> 16) * arg11;
            for (int var19 = -arg7; var19 < 0; ++var19) {
                byte var20 = arg1[(arg3 >> 16) + var18];
                if (var20 != 0) {
                    int var21 = arg2[var20 & 255];
                    int var22 = var21 >> 16 & 255;
                    int var23 = var21 >> 8 & 255;
                    int var24 = var21 & 255;
                    arg0[arg5++] = (var16 * var24 >> 8) + (var14 * var22 >> 8 << 16) + (var15 * var23 >> 8 << 8);
                } else {
                    ++arg5;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method591(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)V")
    public final void method592(int arg0, int arg1, int arg2, int arg3) {
        int var5 = super.field2440;
        int var6 = super.field2447;
        int var7 = 0;
        int var8 = 0;
        int var9 = super.field2439;
        int var10 = super.field2444;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (super.field2445 > 0) {
            int var13 = ((super.field2445 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (super.field2445 << 16);
        }
        if (super.field2442 > 0) {
            int var14 = ((super.field2442 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (super.field2442 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = class63.field1049 * arg1 + arg0;
        int var16 = class63.field1049 - arg2;
        if (arg1 + arg3 > class63.field1055) {
            arg3 -= arg1 + arg3 - class63.field1055;
        }
        if (arg1 < class63.field1052) {
            int var17 = class63.field1052 - arg1;
            arg3 -= var17;
            var15 += class63.field1049 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class63.field1056) {
            int var18 = arg0 + arg2 - class63.field1056;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class63.field1050) {
            int var19 = class63.field1050 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method596(class63.field1048, this.field1224, this.field1225, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
    public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = super.field2440;
        int var7 = super.field2447;
        int var8 = 0;
        int var9 = 0;
        int var10 = super.field2439;
        int var11 = super.field2444;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (super.field2445 > 0) {
            int var14 = ((super.field2445 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (super.field2445 << 16);
        }
        if (super.field2442 > 0) {
            int var15 = ((super.field2442 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (super.field2442 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        int var16 = class63.field1049 * arg1 + arg0;
        int var17 = class63.field1049 - arg2;
        if (arg1 + arg3 > class63.field1055) {
            arg3 -= arg1 + arg3 - class63.field1055;
        }
        if (arg1 < class63.field1052) {
            int var18 = class63.field1052 - arg1;
            arg3 -= var18;
            var16 += class63.field1049 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class63.field1056) {
            int var19 = arg0 + arg2 - class63.field1056;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class63.field1050) {
            int var20 = class63.field1050 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method590(class63.field1048, this.field1224, this.field1225, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)V")
    public final void method594(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1225.length; ++var4) {
            int var5 = this.field1225[var4] >> 16 & 255;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1225[var4] >> 8 & 255;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1225[var4] & 255;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1225[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "()V")
    public final void method595() {
        if (super.field2440 != super.field2439 || super.field2447 != super.field2444) {
            byte[] var1 = new byte[super.field2444 * super.field2439];
            int var2 = 0;
            for (int var3 = 0; var3 < super.field2447; ++var3) {
                for (int var4 = 0; var4 < super.field2440; ++var4) {
                    var1[(super.field2442 + var3) * super.field2439 + super.field2445 + var4] = this.field1224[var2++];
                }
            }
            this.field1224 = var1;
            super.field2440 = super.field2439;
            super.field2447 = super.field2444;
            super.field2445 = 0;
            super.field2442 = 0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method596(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIII[B[I)V")
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        super.field2439 = arg0;
        super.field2444 = arg1;
        super.field2445 = arg2;
        super.field2442 = arg3;
        super.field2440 = arg4;
        super.field2447 = arg5;
        this.field1224 = arg6;
        this.field1225 = arg7;
    }
}
