import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class125 extends class99 {

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "[B")
    public byte[] field2270;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "[I")
    public int[] field2265;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(IIII)V")
    public final void method859(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field2271;
        int var6 = this.field2269;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2272;
        int var10 = this.field2267;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2268 > 0) {
            int var13 = ((this.field2268 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2268 << 16);
        }
        if (this.field2266 > 0) {
            int var14 = ((this.field2266 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2266 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class99.field1818 * arg1 + arg0;
        int var16 = class99.field1818 - arg2;
        if (arg1 + arg3 > class99.field1820) {
            arg3 -= arg1 + arg3 - class99.field1820;
        }
        if (arg1 < class99.field1821) {
            int var17 = class99.field1821 - arg1;
            arg3 -= var17;
            var15 += class99.field1818 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class99.field1817) {
            int var18 = arg0 + arg2 - class99.field1817;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class99.field1819) {
            int var19 = class99.field1819 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method862(class99.field1823, this.field2270, this.field2265, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V")
    public final void method860(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2265.length; var4++) {
            int var5 = this.field2265[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2265[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2265[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2265[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)V")
    public final void method861(int arg0, int arg1, int arg2) {
        int var4 = this.field2268 + arg0;
        int var5 = this.field2266 + arg1;
        int var6 = class99.field1818 * var5 + var4;
        int var7 = 0;
        int var8 = this.field2269;
        int var9 = this.field2271;
        int var10 = class99.field1818 - var9;
        int var11 = 0;
        if (var5 < class99.field1821) {
            int var12 = class99.field1821 - var5;
            var8 -= var12;
            var5 = class99.field1821;
            var7 += var9 * var12;
            var6 += class99.field1818 * var12;
        }
        if (var5 + var8 > class99.field1820) {
            var8 -= var5 + var8 - class99.field1820;
        }
        if (var4 < class99.field1819) {
            int var13 = class99.field1819 - var4;
            var9 -= var13;
            var4 = class99.field1819;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class99.field1817) {
            int var14 = var4 + var9 - class99.field1817;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method866(class99.field1823, this.field2270, this.field2265, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method862(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(II)V")
    public final void method863(int arg0, int arg1) {
        int var3 = this.field2268 + arg0;
        int var4 = this.field2266 + arg1;
        int var5 = class99.field1818 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2269;
        int var8 = this.field2271;
        int var9 = class99.field1818 - var8;
        int var10 = 0;
        if (var4 < class99.field1821) {
            int var11 = class99.field1821 - var4;
            var7 -= var11;
            var4 = class99.field1821;
            var6 += var8 * var11;
            var5 += class99.field1818 * var11;
        }
        if (var4 + var7 > class99.field1820) {
            var7 -= var4 + var7 - class99.field1820;
        }
        if (var3 < class99.field1819) {
            int var12 = class99.field1819 - var3;
            var8 -= var12;
            var3 = class99.field1819;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class99.field1817) {
            int var13 = var3 + var8 - class99.field1817;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method865(class99.field1823, this.field2270, this.field2265, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
    public final void method864() {
        if (this.field2272 == this.field2271 && this.field2269 == this.field2267) {
            return;
        }
        byte[] var1 = new byte[this.field2272 * this.field2267];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2269; var3++) {
            for (int var4 = 0; var4 < this.field2271; var4++) {
                var1[(this.field2266 + var3) * this.field2272 + this.field2268 + var4] = this.field2270[var2++];
            }
        }
        this.field2270 = var1;
        this.field2271 = this.field2272;
        this.field2269 = this.field2267;
        this.field2268 = 0;
        this.field2266 = 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method865(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!le", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method866(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    protected class125() {
    }
}
