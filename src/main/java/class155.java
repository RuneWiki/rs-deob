import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class155 extends class90 {

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "[B")
    public byte[] field2711;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "[I")
    private int[] field2710;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1083(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
    public final void method673(int arg0, int arg1) {
        int var3 = super.field1729 + arg0;
        int var4 = super.field1722 + arg1;
        int var5 = class23.field451 * var4 + var3;
        int var6 = 0;
        int var7 = super.field1730;
        int var8 = super.field1724;
        int var9 = class23.field451 - var8;
        int var10 = 0;
        if (var4 < class23.field449) {
            int var11 = class23.field449 - var4;
            var7 -= var11;
            var4 = class23.field449;
            var6 += var8 * var11;
            var5 += class23.field451 * var11;
        }
        if (var4 + var7 > class23.field450) {
            var7 -= var4 + var7 - class23.field450;
        }
        if (var3 < class23.field446) {
            int var12 = class23.field446 - var3;
            var8 -= var12;
            var3 = class23.field446;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class23.field448) {
            int var13 = var3 + var8 - class23.field448;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1085(class23.field445, this.field2711, this.field2710, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method1084(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1085(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(III)V")
    public final void method1086(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2710.length; ++var4) {
            int var5 = this.field2710[var4] >> 16 & 255;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2710[var4] >> 8 & 255;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2710[var4] & 255;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2710[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
    public final void method1087(int arg0, int arg1, int arg2, int arg3) {
        int var5 = super.field1724;
        int var6 = super.field1730;
        int var7 = 0;
        int var8 = 0;
        int var9 = super.field1728;
        int var10 = super.field1734;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (super.field1729 > 0) {
            int var13 = ((super.field1729 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (super.field1729 << 16);
        }
        if (super.field1722 > 0) {
            int var14 = ((super.field1722 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (super.field1722 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = class23.field451 * arg1 + arg0;
        int var16 = class23.field451 - arg2;
        if (arg1 + arg3 > class23.field450) {
            arg3 -= arg1 + arg3 - class23.field450;
        }
        if (arg1 < class23.field449) {
            int var17 = class23.field449 - arg1;
            arg3 -= var17;
            var15 += class23.field451 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class23.field448) {
            int var18 = arg0 + arg2 - class23.field448;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class23.field446) {
            int var19 = class23.field446 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1084(class23.field445, this.field2711, this.field2710, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
    public final void method670(int arg0, int arg1, int arg2) {
        int var4 = super.field1729 + arg0;
        int var5 = super.field1722 + arg1;
        int var6 = class23.field451 * var5 + var4;
        int var7 = 0;
        int var8 = super.field1730;
        int var9 = super.field1724;
        int var10 = class23.field451 - var9;
        int var11 = 0;
        if (var5 < class23.field449) {
            int var12 = class23.field449 - var5;
            var8 -= var12;
            var5 = class23.field449;
            var7 += var9 * var12;
            var6 += class23.field451 * var12;
        }
        if (var5 + var8 > class23.field450) {
            var8 -= var5 + var8 - class23.field450;
        }
        if (var4 < class23.field446) {
            int var13 = class23.field446 - var4;
            var9 -= var13;
            var4 = class23.field446;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class23.field448) {
            int var14 = var4 + var9 - class23.field448;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1083(class23.field445, this.field2711, this.field2710, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIII[B[I)V")
    public class155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        super.field1728 = arg0;
        super.field1734 = arg1;
        super.field1729 = arg2;
        super.field1722 = arg3;
        super.field1724 = arg4;
        super.field1730 = arg5;
        this.field2711 = arg6;
        this.field2710 = arg7;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
    public final void method1088() {
        if (super.field1728 != super.field1724 || super.field1734 != super.field1730) {
            byte[] var1 = new byte[super.field1734 * super.field1728];
            int var2 = 0;
            for (int var3 = 0; var3 < super.field1730; ++var3) {
                for (int var4 = 0; var4 < super.field1724; ++var4) {
                    var1[(super.field1722 + var3) * super.field1728 + super.field1729 + var4] = this.field2711[var2++];
                }
            }
            this.field2711 = var1;
            super.field1724 = super.field1728;
            super.field1730 = super.field1734;
            super.field1729 = 0;
            super.field1722 = 0;
        }
    }
}
