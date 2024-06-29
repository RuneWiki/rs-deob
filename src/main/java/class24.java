import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class24 extends class96 {

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "[B")
    public byte[] field566;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "[I")
    public int[] field565;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
    public final void method213(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field565.length; var4++) {
            int var5 = this.field565[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field565[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field565[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field565[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "()V")
    public final void method214() {
        if (this.field569 == this.field562 && this.field568 == this.field563) {
            return;
        }
        byte[] var1 = new byte[this.field568 * this.field562];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field563; var3++) {
            for (int var4 = 0; var4 < this.field569; var4++) {
                var1[(this.field567 + var3) * this.field562 + this.field564 + var4] = this.field566[var2++];
            }
        }
        this.field566 = var1;
        this.field569 = this.field562;
        this.field563 = this.field568;
        this.field564 = 0;
        this.field567 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "()V")
    public final void method215() {
        byte[] var1 = new byte[this.field569 * this.field563];
        int var2 = 0;
        for (int var3 = this.field563 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field569; var4++) {
                var1[var2++] = this.field566[this.field569 * var3 + var4];
            }
        }
        this.field566 = var1;
        this.field567 = this.field568 - this.field563 - this.field567;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    public final void method216(int arg0, int arg1) {
        int var3 = this.field564 + arg0;
        int var4 = this.field567 + arg1;
        int var5 = class96.field2329 * var4 + var3;
        int var6 = 0;
        int var7 = this.field563;
        int var8 = this.field569;
        int var9 = class96.field2329 - var8;
        int var10 = 0;
        if (var4 < class96.field2325) {
            int var11 = class96.field2325 - var4;
            var7 -= var11;
            var4 = class96.field2325;
            var6 += var8 * var11;
            var5 += class96.field2329 * var11;
        }
        if (var4 + var7 > class96.field2328) {
            var7 -= var4 + var7 - class96.field2328;
        }
        if (var3 < class96.field2327) {
            int var12 = class96.field2327 - var3;
            var8 -= var12;
            var3 = class96.field2327;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class96.field2331) {
            int var13 = var3 + var8 - class96.field2331;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method217(class96.field2330, this.field566, this.field565, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method217(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "()V")
    public final void method218() {
        byte[] var1 = new byte[this.field569 * this.field563];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field563; var3++) {
            for (int var4 = this.field569 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field566[this.field569 * var3 + var4];
            }
        }
        this.field566 = var1;
        this.field564 = this.field562 - this.field569 - this.field564;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class24() {
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
    private class24(int arg0, int arg1, int arg2) {
        this.field562 = this.field569 = arg0;
        this.field568 = this.field563 = arg1;
        this.field564 = this.field567 = 0;
        this.field566 = new byte[arg0 * arg1];
        this.field565 = new int[arg2];
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "()Ldc;")
    public final class24 method219() {
        class24 var1 = new class24(this.field569, this.field563, this.field565.length);
        var1.field562 = this.field562;
        var1.field568 = this.field568;
        var1.field564 = this.field564;
        var1.field567 = this.field567;
        int var2 = this.field566.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field566[var3] = this.field566[var3];
        }
        int var4 = this.field565.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field565[var5] = this.field565[var5];
        }
        return var1;
    }
}
