import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class70 {

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "[B")
    public byte[] field137;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
    public int[] field131;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
    public final void method25() {
        byte[] var1 = new byte[this.field134 * this.field132];
        int var2 = 0;
        for (int var3 = this.field134 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field132; var4++) {
                var1[var2++] = this.field137[this.field132 * var3 + var4];
            }
        }
        this.field137 = var1;
        this.field135 = this.field136 - this.field134 - this.field135;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "()V")
    public final void method26() {
        if (this.field133 == this.field132 && this.field136 == this.field134) {
            return;
        }
        byte[] var1 = new byte[this.field136 * this.field133];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field134; var3++) {
            for (int var4 = 0; var4 < this.field132; var4++) {
                var1[(this.field135 + var3) * this.field133 + this.field138 + var4] = this.field137[var2++];
            }
        }
        this.field137 = var1;
        this.field132 = this.field133;
        this.field134 = this.field136;
        this.field138 = 0;
        this.field135 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
    public final void method27(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field131.length; var4++) {
            int var5 = this.field131[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field131[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field131[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field131[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "()Lae;")
    public final class6 method28() {
        class6 var1 = new class6(this.field132, this.field134, this.field131.length);
        var1.field133 = this.field133;
        var1.field136 = this.field136;
        var1.field138 = this.field138;
        var1.field135 = this.field135;
        int var2 = this.field137.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field137[var3] = this.field137[var3];
        }
        int var4 = this.field131.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field131[var5] = this.field131[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
    public final void method29(int arg0, int arg1) {
        int var3 = this.field138 + arg0;
        int var4 = this.field135 + arg1;
        int var5 = class70.field1717 * var4 + var3;
        int var6 = 0;
        int var7 = this.field134;
        int var8 = this.field132;
        int var9 = class70.field1717 - var8;
        int var10 = 0;
        if (var4 < class70.field1720) {
            int var11 = class70.field1720 - var4;
            var7 -= var11;
            var4 = class70.field1720;
            var6 += var8 * var11;
            var5 += class70.field1717 * var11;
        }
        if (var4 + var7 > class70.field1719) {
            var7 -= var4 + var7 - class70.field1719;
        }
        if (var3 < class70.field1716) {
            int var12 = class70.field1716 - var3;
            var8 -= var12;
            var3 = class70.field1716;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class70.field1718) {
            int var13 = var3 + var8 - class70.field1718;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method30(class70.field1714, this.field137, this.field131, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method30(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "()V")
    public final void method31() {
        byte[] var1 = new byte[this.field134 * this.field132];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field134; var3++) {
            for (int var4 = this.field132 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field137[this.field132 * var3 + var4];
            }
        }
        this.field137 = var1;
        this.field138 = this.field133 - this.field132 - this.field138;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class6() {
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(III)V")
    private class6(int arg0, int arg1, int arg2) {
        this.field133 = this.field132 = arg0;
        this.field136 = this.field134 = arg1;
        this.field138 = this.field135 = 0;
        this.field137 = new byte[arg0 * arg1];
        this.field131 = new int[arg2];
    }
}
