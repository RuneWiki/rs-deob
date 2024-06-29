import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class123 extends class55 {

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
    public int field3027;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!uc", name = "qb", descriptor = "[B")
    public byte[] field3028;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "[I")
    public int[] field3024;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V", line = 7)
    public final void method972() {
        byte[] var1 = new byte[this.field3026 * this.field3023];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3026; var3++) {
            for (int var4 = this.field3023 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field3028[this.field3023 * var3 + var4];
            }
        }
        this.field3028 = var1;
        this.field3021 = this.field3025 - this.field3023 - this.field3021;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()Luc;", line = 30)
    public final class123 method973() {
        class123 var1 = new class123(this.field3023, this.field3026, this.field3024.length);
        var1.field3025 = this.field3025;
        var1.field3027 = this.field3027;
        var1.field3021 = this.field3021;
        var1.field3022 = this.field3022;
        int var2 = this.field3028.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field3028[var3] = this.field3028[var3];
        }
        int var4 = this.field3024.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field3024[var5] = this.field3024[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([I[B[IIIIIII)V", line = 56)
    private static final void method974(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "()V", line = 124)
    public final void method975() {
        byte[] var1 = new byte[this.field3026 * this.field3023];
        int var2 = 0;
        for (int var3 = this.field3026 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3023; var4++) {
                var1[var2++] = this.field3028[this.field3023 * var3 + var4];
            }
        }
        this.field3028 = var1;
        this.field3022 = this.field3027 - this.field3026 - this.field3022;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V", line = 147)
    public final void method976(int arg0, int arg1) {
        int var3 = this.field3021 + arg0;
        int var4 = this.field3022 + arg1;
        int var5 = class55.field1381 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3026;
        int var8 = this.field3023;
        int var9 = class55.field1381 - var8;
        int var10 = 0;
        if (var4 < class55.field1375) {
            int var11 = class55.field1375 - var4;
            var7 -= var11;
            var4 = class55.field1375;
            var6 += var8 * var11;
            var5 += class55.field1381 * var11;
        }
        if (var4 + var7 > class55.field1378) {
            var7 -= var4 + var7 - class55.field1378;
        }
        if (var3 < class55.field1377) {
            int var12 = class55.field1377 - var3;
            var8 -= var12;
            var3 = class55.field1377;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class55.field1379) {
            int var13 = var3 + var8 - class55.field1379;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method974(class55.field1380, this.field3028, this.field3024, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V", line = 206)
    public final void method977(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3024.length; var4++) {
            int var5 = this.field3024[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3024[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3024[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3024[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "()V", line = 247)
    public final void method978() {
        if (this.field3025 == this.field3023 && this.field3027 == this.field3026) {
            return;
        }
        byte[] var1 = new byte[this.field3027 * this.field3025];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3026; var3++) {
            for (int var4 = 0; var4 < this.field3023; var4++) {
                var1[(this.field3022 + var3) * this.field3025 + this.field3021 + var4] = this.field3028[var2++];
            }
        }
        this.field3028 = var1;
        this.field3023 = this.field3025;
        this.field3026 = this.field3027;
        this.field3021 = 0;
        this.field3022 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 282)
    public class123() {
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(III)V", line = 284)
    private class123(int arg0, int arg1, int arg2) {
        this.field3025 = this.field3023 = arg0;
        this.field3027 = this.field3026 = arg1;
        this.field3021 = this.field3022 = 0;
        this.field3028 = new byte[arg0 * arg1];
        this.field3024 = new int[arg2];
    }
}
