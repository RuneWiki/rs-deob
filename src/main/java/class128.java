import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class128 extends class74 {

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "[B")
    public byte[] field3109;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "[I")
    public int[] field3108;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()V", line = 5)
    public final void method1032() {
        byte[] var1 = new byte[this.field3104 * this.field3103];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3104; var3++) {
            for (int var4 = this.field3103 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field3109[this.field3103 * var3 + var4];
            }
        }
        this.field3109 = var1;
        this.field3107 = this.field3105 - this.field3103 - this.field3107;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "()Lva;", line = 31)
    public final class128 method1033() {
        class128 var1 = new class128(this.field3103, this.field3104, this.field3108.length);
        var1.field3105 = this.field3105;
        var1.field3106 = this.field3106;
        var1.field3107 = this.field3107;
        var1.field3102 = this.field3102;
        int var2 = this.field3109.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field3109[var3] = this.field3109[var3];
        }
        int var4 = this.field3108.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field3108[var5] = this.field3108[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V", line = 61)
    public final void method1034(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3108.length; var4++) {
            int var5 = this.field3108[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3108[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3108[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3108[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "()V", line = 109)
    public final void method1035() {
        byte[] var1 = new byte[this.field3104 * this.field3103];
        int var2 = 0;
        for (int var3 = this.field3104 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3103; var4++) {
                var1[var2++] = this.field3109[this.field3103 * var3 + var4];
            }
        }
        this.field3109 = var1;
        this.field3102 = this.field3106 - this.field3104 - this.field3102;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V", line = 132)
    public final void method1036(int arg0, int arg1) {
        int var3 = this.field3107 + arg0;
        int var4 = this.field3102 + arg1;
        int var5 = class74.field1683 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3104;
        int var8 = this.field3103;
        int var9 = class74.field1683 - var8;
        int var10 = 0;
        if (var4 < class74.field1682) {
            int var11 = class74.field1682 - var4;
            var7 -= var11;
            var4 = class74.field1682;
            var6 += var8 * var11;
            var5 += class74.field1683 * var11;
        }
        if (var4 + var7 > class74.field1681) {
            var7 -= var4 + var7 - class74.field1681;
        }
        if (var3 < class74.field1686) {
            int var12 = class74.field1686 - var3;
            var8 -= var12;
            var3 = class74.field1686;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class74.field1685) {
            int var13 = var3 + var8 - class74.field1685;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1037(class74.field1680, this.field3109, this.field3108, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([I[B[IIIIIII)V", line = 188)
    private static final void method1037(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!va", name = "g", descriptor = "()V", line = 250)
    public final void method1038() {
        if (this.field3105 == this.field3103 && this.field3106 == this.field3104) {
            return;
        }
        byte[] var1 = new byte[this.field3106 * this.field3105];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3104; var3++) {
            for (int var4 = 0; var4 < this.field3103; var4++) {
                var1[(this.field3102 + var3) * this.field3105 + this.field3107 + var4] = this.field3109[var2++];
            }
        }
        this.field3109 = var1;
        this.field3103 = this.field3105;
        this.field3104 = this.field3106;
        this.field3107 = 0;
        this.field3102 = 0;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 282)
    public class128() {
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(III)V", line = 284)
    private class128(int arg0, int arg1, int arg2) {
        this.field3105 = this.field3103 = arg0;
        this.field3106 = this.field3104 = arg1;
        this.field3107 = this.field3102 = 0;
        this.field3109 = new byte[arg0 * arg1];
        this.field3108 = new int[arg2];
    }
}
