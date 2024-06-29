import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class179 extends class168 {

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "[B")
    public byte[] field3577;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "[I")
    public int[] field3571;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)V")
    public final void method1161(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3571.length; var4++) {
            int var5 = this.field3571[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3571[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3571[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3571[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1162(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    public final void method1163(int arg0, int arg1) {
        int var3 = this.field3573 + arg0;
        int var4 = this.field3575 + arg1;
        int var5 = class168.field3338 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3576;
        int var8 = this.field3574;
        int var9 = class168.field3338 - var8;
        int var10 = 0;
        if (var4 < class168.field3336) {
            int var11 = class168.field3336 - var4;
            var7 -= var11;
            var4 = class168.field3336;
            var6 += var8 * var11;
            var5 += class168.field3338 * var11;
        }
        if (var4 + var7 > class168.field3339) {
            var7 -= var4 + var7 - class168.field3339;
        }
        if (var3 < class168.field3340) {
            int var12 = class168.field3340 - var3;
            var8 -= var12;
            var3 = class168.field3340;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class168.field3335) {
            int var13 = var3 + var8 - class168.field3335;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1165(class168.field3334, this.field3577, this.field3571, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(III)V")
    public final void method1164(int arg0, int arg1, int arg2) {
        int var4 = this.field3573 + arg0;
        int var5 = this.field3575 + arg1;
        int var6 = class168.field3338 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3576;
        int var9 = this.field3574;
        int var10 = class168.field3338 - var9;
        int var11 = 0;
        if (var5 < class168.field3336) {
            int var12 = class168.field3336 - var5;
            var8 -= var12;
            var5 = class168.field3336;
            var7 += var9 * var12;
            var6 += class168.field3338 * var12;
        }
        if (var5 + var8 > class168.field3339) {
            var8 -= var5 + var8 - class168.field3339;
        }
        if (var4 < class168.field3340) {
            int var13 = class168.field3340 - var4;
            var9 -= var13;
            var4 = class168.field3340;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class168.field3335) {
            int var14 = var4 + var9 - class168.field3335;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1162(class168.field3334, this.field3577, this.field3571, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1165(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    protected class179() {
    }
}
