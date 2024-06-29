import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class96 extends class32 {

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "[B")
    public byte[] field2058;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "[I")
    public int[] field2063;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()V", line = 5)
    public final void method730() {
        byte[] var1 = new byte[this.field2062 * this.field2056];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2062; var3++) {
            for (int var4 = this.field2056 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2058[this.field2056 * var3 + var4];
            }
        }
        this.field2058 = var1;
        this.field2059 = this.field2061 - this.field2056 - this.field2059;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()Lqb;", line = 30)
    public final class96 method731() {
        class96 var1 = new class96(this.field2056, this.field2062, this.field2063.length);
        var1.field2061 = this.field2061;
        var1.field2060 = this.field2060;
        var1.field2059 = this.field2059;
        var1.field2057 = this.field2057;
        int var2 = this.field2058.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2058[var3] = this.field2058[var3];
        }
        int var4 = this.field2063.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2063[var5] = this.field2063[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 61)
    public final void method732(int arg0, int arg1) {
        int var3 = this.field2059 + arg0;
        int var4 = this.field2057 + arg1;
        int var5 = class32.field638 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2062;
        int var8 = this.field2056;
        int var9 = class32.field638 - var8;
        int var10 = 0;
        if (var4 < class32.field637) {
            int var11 = class32.field637 - var4;
            var7 -= var11;
            var4 = class32.field637;
            var6 += var8 * var11;
            var5 += class32.field638 * var11;
        }
        if (var4 + var7 > class32.field636) {
            var7 -= var4 + var7 - class32.field636;
        }
        if (var3 < class32.field635) {
            int var12 = class32.field635 - var3;
            var8 -= var12;
            var3 = class32.field635;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class32.field634) {
            int var13 = var3 + var8 - class32.field634;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method735(class32.field639, this.field2058, this.field2063, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V", line = 120)
    public final void method733(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2063.length; var4++) {
            int var5 = this.field2063[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2063[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2063[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2063[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "()V", line = 161)
    public final void method734() {
        byte[] var1 = new byte[this.field2062 * this.field2056];
        int var2 = 0;
        for (int var3 = this.field2062 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2056; var4++) {
                var1[var2++] = this.field2058[this.field2056 * var3 + var4];
            }
        }
        this.field2058 = var1;
        this.field2057 = this.field2060 - this.field2062 - this.field2057;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([I[B[IIIIIII)V", line = 185)
    private static final void method735(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 249)
    public class96() {
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(III)V", line = 252)
    private class96(int arg0, int arg1, int arg2) {
        this.field2061 = this.field2056 = arg0;
        this.field2060 = this.field2062 = arg1;
        this.field2059 = this.field2057 = 0;
        this.field2058 = new byte[arg0 * arg1];
        this.field2063 = new int[arg2];
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "()V", line = 260)
    public final void method736() {
        if (this.field2061 == this.field2056 && this.field2062 == this.field2060) {
            return;
        }
        byte[] var1 = new byte[this.field2061 * this.field2060];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2062; var3++) {
            for (int var4 = 0; var4 < this.field2056; var4++) {
                var1[(this.field2057 + var3) * this.field2061 + this.field2059 + var4] = this.field2058[var2++];
            }
        }
        this.field2058 = var1;
        this.field2056 = this.field2061;
        this.field2062 = this.field2060;
        this.field2059 = 0;
        this.field2057 = 0;
    }
}
