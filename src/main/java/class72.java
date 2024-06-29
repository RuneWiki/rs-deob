import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class72 extends class55 {

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "[B")
    public byte[] field1695;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "[I")
    public int[] field1694;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V", line = 7)
    public final void method497(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1694.length; var4++) {
            int var5 = this.field1694[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1694[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1694[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1694[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "()Lm;", line = 47)
    public final class72 method498() {
        class72 var1 = new class72(this.field1696, this.field1690, this.field1694.length);
        var1.field1692 = this.field1692;
        var1.field1689 = this.field1689;
        var1.field1693 = this.field1693;
        var1.field1691 = this.field1691;
        int var2 = this.field1695.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field1695[var3] = this.field1695[var3];
        }
        int var4 = this.field1694.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field1694[var5] = this.field1694[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "()V", line = 73)
    public final void method499() {
        byte[] var1 = new byte[this.field1696 * this.field1690];
        int var2 = 0;
        for (int var3 = this.field1690 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field1696; var4++) {
                var1[var2++] = this.field1695[this.field1696 * var3 + var4];
            }
        }
        this.field1695 = var1;
        this.field1691 = this.field1689 - this.field1690 - this.field1691;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "()V", line = 101)
    public final void method500() {
        byte[] var1 = new byte[this.field1696 * this.field1690];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1690; var3++) {
            for (int var4 = this.field1696 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field1695[this.field1696 * var3 + var4];
            }
        }
        this.field1695 = var1;
        this.field1693 = this.field1692 - this.field1696 - this.field1693;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([I[B[IIIIIII)V", line = 125)
    private static final void method501(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 194)
    public final void method502(int arg0, int arg1) {
        int var3 = this.field1693 + arg0;
        int var4 = this.field1691 + arg1;
        int var5 = class55.field1272 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1690;
        int var8 = this.field1696;
        int var9 = class55.field1272 - var8;
        int var10 = 0;
        if (var4 < class55.field1269) {
            int var11 = class55.field1269 - var4;
            var7 -= var11;
            var4 = class55.field1269;
            var6 += var8 * var11;
            var5 += class55.field1272 * var11;
        }
        if (var4 + var7 > class55.field1266) {
            var7 -= var4 + var7 - class55.field1266;
        }
        if (var3 < class55.field1270) {
            int var12 = class55.field1270 - var3;
            var8 -= var12;
            var3 = class55.field1270;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class55.field1268) {
            int var13 = var3 + var8 - class55.field1268;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method501(class55.field1271, this.field1695, this.field1694, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "()V", line = 251)
    public final void method503() {
        if (this.field1696 == this.field1692 && this.field1690 == this.field1689) {
            return;
        }
        byte[] var1 = new byte[this.field1692 * this.field1689];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1690; var3++) {
            for (int var4 = 0; var4 < this.field1696; var4++) {
                var1[(this.field1691 + var3) * this.field1692 + this.field1693 + var4] = this.field1695[var2++];
            }
        }
        this.field1695 = var1;
        this.field1696 = this.field1692;
        this.field1690 = this.field1689;
        this.field1693 = 0;
        this.field1691 = 0;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 281)
    public class72() {
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(III)V", line = 283)
    private class72(int arg0, int arg1, int arg2) {
        this.field1692 = this.field1696 = arg0;
        this.field1689 = this.field1690 = arg1;
        this.field1693 = this.field1691 = 0;
        this.field1695 = new byte[arg0 * arg1];
        this.field1694 = new int[arg2];
    }
}
