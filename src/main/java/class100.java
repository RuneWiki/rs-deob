import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class100 extends class49 {

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "[B")
    public byte[] field2412;

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "[I")
    public int[] field2410;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V", line = 7)
    public final void method744(int arg0, int arg1) {
        int var3 = this.field2406 + arg0;
        int var4 = this.field2408 + arg1;
        int var5 = class49.field1302 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2409;
        int var8 = this.field2407;
        int var9 = class49.field1302 - var8;
        int var10 = 0;
        if (var4 < class49.field1303) {
            int var11 = class49.field1303 - var4;
            var7 -= var11;
            var4 = class49.field1303;
            var6 += var8 * var11;
            var5 += class49.field1302 * var11;
        }
        if (var4 + var7 > class49.field1306) {
            var7 -= var4 + var7 - class49.field1306;
        }
        if (var3 < class49.field1304) {
            int var12 = class49.field1304 - var3;
            var8 -= var12;
            var3 = class49.field1304;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class49.field1305) {
            int var13 = var3 + var8 - class49.field1305;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method747(class49.field1308, this.field2412, this.field2410, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()V", line = 63)
    public final void method745() {
        byte[] var1 = new byte[this.field2409 * this.field2407];
        int var2 = 0;
        for (int var3 = this.field2409 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2407; var4++) {
                var1[var2++] = this.field2412[this.field2407 * var3 + var4];
            }
        }
        this.field2412 = var1;
        this.field2408 = this.field2411 - this.field2409 - this.field2408;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "()V", line = 87)
    public final void method746() {
        byte[] var1 = new byte[this.field2409 * this.field2407];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2409; var3++) {
            for (int var4 = this.field2407 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2412[this.field2407 * var3 + var4];
            }
        }
        this.field2412 = var1;
        this.field2406 = this.field2405 - this.field2407 - this.field2406;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([I[B[IIIIIII)V", line = 112)
    private static final void method747(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                byte var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var18 & 0xFF];
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                byte var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var14 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "()V", line = 176)
    public final void method748() {
        if (this.field2407 == this.field2405 && this.field2411 == this.field2409) {
            return;
        }
        byte[] var1 = new byte[this.field2411 * this.field2405];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2409; var3++) {
            for (int var4 = 0; var4 < this.field2407; var4++) {
                var1[(this.field2408 + var3) * this.field2405 + this.field2406 + var4] = this.field2412[var2++];
            }
        }
        this.field2412 = var1;
        this.field2407 = this.field2405;
        this.field2409 = this.field2411;
        this.field2406 = 0;
        this.field2408 = 0;
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "()Lqd;", line = 208)
    public final class100 method749() {
        class100 var1 = new class100(this.field2407, this.field2409, this.field2410.length);
        var1.field2405 = this.field2405;
        var1.field2411 = this.field2411;
        var1.field2406 = this.field2406;
        var1.field2408 = this.field2408;
        int var2 = this.field2412.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2412[var3] = this.field2412[var3];
        }
        int var4 = this.field2410.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2410[var5] = this.field2410[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 237)
    public final void method750(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2410.length; var4++) {
            int var5 = this.field2410[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2410[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2410[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2410[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 280)
    public class100() {
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(III)V", line = 283)
    private class100(int arg0, int arg1, int arg2) {
        this.field2405 = this.field2407 = arg0;
        this.field2411 = this.field2409 = arg1;
        this.field2406 = this.field2408 = 0;
        this.field2412 = new byte[arg0 * arg1];
        this.field2410 = new int[arg2];
    }
}
