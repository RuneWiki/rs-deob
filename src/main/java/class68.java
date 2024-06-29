import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class68 extends class238 {

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[B")
    public byte[] field1179;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
    private int[] field1180;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V", line = 8)
    public final void method576() {
        byte[] var1 = new byte[this.field4007 * this.field3999];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4007; var3++) {
            for (int var4 = this.field3999 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field1179[this.field4007 * var4 + var3];
            }
        }
        this.field1179 = var1;
        int var5 = this.field4002;
        this.field4002 = this.field4005;
        this.field4005 = this.field3996 - this.field3999 - var5;
        int var6 = this.field3999;
        this.field3999 = this.field4007;
        this.field4007 = var6;
        int var7 = this.field3996;
        this.field3996 = this.field3997;
        this.field3997 = var7;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 41)
    public final void method351(int arg0, int arg1) {
        int var3 = this.field4005 + arg0;
        int var4 = this.field4002 + arg1;
        int var5 = class44.field717 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3999;
        int var8 = this.field4007;
        int var9 = class44.field717 - var8;
        int var10 = 0;
        if (var4 < class44.field719) {
            int var11 = class44.field719 - var4;
            var7 -= var11;
            var4 = class44.field719;
            var6 += var8 * var11;
            var5 += class44.field717 * var11;
        }
        if (var4 + var7 > class44.field720) {
            var7 -= var4 + var7 - class44.field720;
        }
        if (var3 < class44.field715) {
            int var12 = class44.field715 - var3;
            var8 -= var12;
            var3 = class44.field715;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class44.field714) {
            int var13 = var3 + var8 - class44.field714;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method584(class44.field721, this.field1179, this.field1180, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V", line = 102)
    public final void method577(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1180.length; var4++) {
            int var5 = this.field1180[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1180[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1180[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1180[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V", line = 144)
    public final void method578() {
        int var1 = 0;
        int var2 = this.field1179.length - 7;
        while (var1 < var2) {
            this.field1179[var1++] = 0;
            this.field1179[var1++] = 0;
            this.field1179[var1++] = 0;
            this.field1179[var1++] = 0;
            this.field1179[var1++] = 0;
            this.field1179[var1++] = 0;
            this.field1179[var1++] = 0;
            this.field1179[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field1179[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()Lje;", line = 167)
    public final class68 method579() {
        class68 var1 = new class68(this.field4007, this.field3999, this.field1180.length);
        var1.field3997 = this.field3997;
        var1.field3996 = this.field3996;
        var1.field4005 = this.field4005;
        var1.field4002 = this.field4002;
        int var2 = this.field1179.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field1179[var3] = this.field1179[var3];
        }
        var1.field1180 = this.field1180;
        return var1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V", line = 188)
    public final void method580(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field4007;
        int var6 = this.field3999;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3997;
        int var10 = this.field3996;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4005 > 0) {
            int var13 = ((this.field4005 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4005 << 16);
        }
        if (this.field4002 > 0) {
            int var14 = ((this.field4002 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4002 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class44.field717 * arg1 + arg0;
        int var16 = class44.field717 - arg2;
        if (arg1 + arg3 > class44.field720) {
            arg3 -= arg1 + arg3 - class44.field720;
        }
        if (arg1 < class44.field719) {
            int var17 = class44.field719 - arg1;
            arg3 -= var17;
            var15 += class44.field717 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class44.field714) {
            int var18 = arg0 + arg2 - class44.field714;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class44.field715) {
            int var19 = class44.field715 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method583(class44.field721, this.field1179, this.field1180, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V", line = 262)
    public final void method355(int arg0, int arg1, int arg2) {
        int var4 = this.field4005 + arg0;
        int var5 = this.field4002 + arg1;
        int var6 = class44.field717 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3999;
        int var9 = this.field4007;
        int var10 = class44.field717 - var9;
        int var11 = 0;
        if (var5 < class44.field719) {
            int var12 = class44.field719 - var5;
            var8 -= var12;
            var5 = class44.field719;
            var7 += var9 * var12;
            var6 += class44.field717 * var12;
        }
        if (var5 + var8 > class44.field720) {
            var8 -= var5 + var8 - class44.field720;
        }
        if (var4 < class44.field715) {
            int var13 = class44.field715 - var4;
            var9 -= var13;
            var4 = class44.field715;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class44.field714) {
            int var14 = var4 + var9 - class44.field714;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method582(class44.field721, this.field1179, this.field1180, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()V", line = 317)
    public final void method581() {
        if (this.field4007 == this.field3997 && this.field3999 == this.field3996) {
            return;
        }
        byte[] var1 = new byte[this.field3997 * this.field3996];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3999; var3++) {
            for (int var4 = 0; var4 < this.field4007; var4++) {
                var1[(this.field4002 + var3) * this.field3997 + this.field4005 + var4] = this.field1179[var2++];
            }
        }
        this.field1179 = var1;
        this.field4007 = this.field3997;
        this.field3999 = this.field3996;
        this.field4005 = 0;
        this.field4002 = 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 349)
    private static final void method582(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 389)
    private static final void method583(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!je", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 429)
    private static final void method584(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 488)
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3997 = arg0;
        this.field3996 = arg1;
        this.field4005 = arg2;
        this.field4002 = arg3;
        this.field4007 = arg4;
        this.field3999 = arg5;
        this.field1179 = arg6;
        this.field1180 = arg7;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(III)V", line = 498)
    public class68(int arg0, int arg1, int arg2) {
        this.field3997 = this.field4007 = arg0;
        this.field3996 = this.field3999 = arg1;
        this.field4005 = this.field4002 = 0;
        this.field1179 = new byte[arg0 * arg1];
        this.field1180 = new int[arg2];
    }
}
