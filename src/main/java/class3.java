import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class117 {

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "[B")
    public byte[] field98;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "[I")
    public int[] field96;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V", line = 7)
    public final void method58(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field96.length; var4++) {
            int var5 = this.field96[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field96[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field96[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field96[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V", line = 48)
    public final void method59() {
        byte[] var1 = new byte[this.field99 * this.field93];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field93; var3++) {
            for (int var4 = this.field99 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field98[this.field99 * var3 + var4];
            }
        }
        this.field98 = var1;
        this.field100 = this.field97 - this.field99 - this.field100;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V", line = 73)
    public final void method60() {
        byte[] var1 = new byte[this.field99 * this.field93];
        int var2 = 0;
        for (int var3 = this.field93 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field99; var4++) {
                var1[var2++] = this.field98[this.field99 * var3 + var4];
            }
        }
        this.field98 = var1;
        this.field95 = this.field94 - this.field93 - this.field95;
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()V", line = 98)
    public final void method61() {
        if (this.field99 == this.field97 && this.field94 == this.field93) {
            return;
        }
        byte[] var1 = new byte[this.field97 * this.field94];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field93; var3++) {
            for (int var4 = 0; var4 < this.field99; var4++) {
                var1[(this.field95 + var3) * this.field97 + this.field100 + var4] = this.field98[var2++];
            }
        }
        this.field98 = var1;
        this.field99 = this.field97;
        this.field93 = this.field94;
        this.field100 = 0;
        this.field95 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([I[B[IIIIIII)V", line = 131)
    private static final void method62(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V", line = 193)
    public final void method63(int arg0, int arg1) {
        int var3 = this.field100 + arg0;
        int var4 = this.field95 + arg1;
        int var5 = class117.field2834 * var4 + var3;
        int var6 = 0;
        int var7 = this.field93;
        int var8 = this.field99;
        int var9 = class117.field2834 - var8;
        int var10 = 0;
        if (var4 < class117.field2832) {
            int var11 = class117.field2832 - var4;
            var7 -= var11;
            var4 = class117.field2832;
            var6 += var8 * var11;
            var5 += class117.field2834 * var11;
        }
        if (var4 + var7 > class117.field2836) {
            var7 -= var4 + var7 - class117.field2836;
        }
        if (var3 < class117.field2830) {
            int var12 = class117.field2830 - var3;
            var8 -= var12;
            var3 = class117.field2830;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class117.field2831) {
            int var13 = var3 + var8 - class117.field2831;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method62(class117.field2833, this.field98, this.field96, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "()Lab;", line = 249)
    public final class3 method64() {
        class3 var1 = new class3(this.field99, this.field93, this.field96.length);
        var1.field97 = this.field97;
        var1.field94 = this.field94;
        var1.field100 = this.field100;
        var1.field95 = this.field95;
        int var2 = this.field98.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field98[var3] = this.field98[var3];
        }
        int var4 = this.field96.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field96[var5] = this.field96[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 281)
    public class3() {
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V", line = 283)
    private class3(int arg0, int arg1, int arg2) {
        this.field97 = this.field99 = arg0;
        this.field94 = this.field93 = arg1;
        this.field100 = this.field95 = 0;
        this.field98 = new byte[arg0 * arg1];
        this.field96 = new int[arg2];
    }
}
