import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class119 extends class108 {

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "[B")
    public byte[] field2947;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "[I")
    public int[] field2952;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)V", line = 6)
    public final void method957(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2952.length; var4++) {
            int var5 = this.field2952[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2952[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2952[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2952[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([I[B[IIIIIII)V", line = 52)
    private static final void method958(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V", line = 116)
    public final void method959() {
        byte[] var1 = new byte[this.field2954 * this.field2949];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2949; var3++) {
            for (int var4 = this.field2954 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2947[this.field2954 * var3 + var4];
            }
        }
        this.field2947 = var1;
        this.field2948 = this.field2951 - this.field2954 - this.field2948;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()Luc;", line = 141)
    public final class119 method960() {
        class119 var1 = new class119(this.field2954, this.field2949, this.field2952.length);
        var1.field2951 = this.field2951;
        var1.field2950 = this.field2950;
        var1.field2948 = this.field2948;
        var1.field2953 = this.field2953;
        int var2 = this.field2947.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2947[var3] = this.field2947[var3];
        }
        int var4 = this.field2952.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2952[var5] = this.field2952[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "()V", line = 169)
    public final void method961() {
        byte[] var1 = new byte[this.field2954 * this.field2949];
        int var2 = 0;
        for (int var3 = this.field2949 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2954; var4++) {
                var1[var2++] = this.field2947[this.field2954 * var3 + var4];
            }
        }
        this.field2947 = var1;
        this.field2953 = this.field2950 - this.field2949 - this.field2953;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 194)
    public class119() {
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "()V", line = 197)
    public final void method962() {
        if (this.field2954 == this.field2951 && this.field2950 == this.field2949) {
            return;
        }
        byte[] var1 = new byte[this.field2951 * this.field2950];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2949; var3++) {
            for (int var4 = 0; var4 < this.field2954; var4++) {
                var1[(this.field2953 + var3) * this.field2951 + this.field2948 + var4] = this.field2947[var2++];
            }
        }
        this.field2947 = var1;
        this.field2954 = this.field2951;
        this.field2949 = this.field2950;
        this.field2948 = 0;
        this.field2953 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(III)V", line = 228)
    private class119(int arg0, int arg1, int arg2) {
        this.field2951 = this.field2954 = arg0;
        this.field2950 = this.field2949 = arg1;
        this.field2948 = this.field2953 = 0;
        this.field2947 = new byte[arg0 * arg1];
        this.field2952 = new int[arg2];
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V", line = 237)
    public final void method963(int arg0, int arg1) {
        int var3 = this.field2948 + arg0;
        int var4 = this.field2953 + arg1;
        int var5 = class108.field2709 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2949;
        int var8 = this.field2954;
        int var9 = class108.field2709 - var8;
        int var10 = 0;
        if (var4 < class108.field2707) {
            int var11 = class108.field2707 - var4;
            var7 -= var11;
            var4 = class108.field2707;
            var6 += var8 * var11;
            var5 += class108.field2709 * var11;
        }
        if (var4 + var7 > class108.field2705) {
            var7 -= var4 + var7 - class108.field2705;
        }
        if (var3 < class108.field2708) {
            int var12 = class108.field2708 - var3;
            var8 -= var12;
            var3 = class108.field2708;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class108.field2710) {
            int var13 = var3 + var8 - class108.field2710;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method958(class108.field2711, this.field2947, this.field2952, var6, var5, var8, var7, var9, var10);
        }
    }
}
