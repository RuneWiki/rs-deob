import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class68 {

    @OriginalMember(owner = "client!ab", name = "ib", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ab", name = "jb", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!ab", name = "hb", descriptor = "[B")
    public byte[] field35;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "[I")
    public int[] field31;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([I[B[IIIIIII)V", line = 10)
    private static final void method14(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V", line = 77)
    public final void method15() {
        byte[] var1 = new byte[this.field36 * this.field34];
        int var2 = 0;
        for (int var3 = this.field34 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field36; var4++) {
                var1[var2++] = this.field35[this.field36 * var3 + var4];
            }
        }
        this.field35 = var1;
        this.field37 = this.field32 - this.field34 - this.field37;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V", line = 100)
    public final void method16() {
        byte[] var1 = new byte[this.field36 * this.field34];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field34; var3++) {
            for (int var4 = this.field36 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field35[this.field36 * var3 + var4];
            }
        }
        this.field35 = var1;
        this.field33 = this.field30 - this.field36 - this.field33;
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()V", line = 123)
    public final void method17() {
        if (this.field36 == this.field30 && this.field34 == this.field32) {
            return;
        }
        byte[] var1 = new byte[this.field32 * this.field30];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field34; var3++) {
            for (int var4 = 0; var4 < this.field36; var4++) {
                var1[(this.field37 + var3) * this.field30 + this.field33 + var4] = this.field35[var2++];
            }
        }
        this.field35 = var1;
        this.field36 = this.field30;
        this.field34 = this.field32;
        this.field33 = 0;
        this.field37 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "()Lab;", line = 158)
    public final class3 method18() {
        class3 var1 = new class3(this.field36, this.field34, this.field31.length);
        var1.field30 = this.field30;
        var1.field32 = this.field32;
        var1.field33 = this.field33;
        var1.field37 = this.field37;
        int var2 = this.field35.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field35[var3] = this.field35[var3];
        }
        int var4 = this.field31.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field31[var5] = this.field31[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V", line = 186)
    public final void method19(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field31.length; var4++) {
            int var5 = this.field31[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field31[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field31[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field31[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V", line = 226)
    public final void method20(int arg0, int arg1) {
        int var3 = this.field33 + arg0;
        int var4 = this.field37 + arg1;
        int var5 = class68.field1628 * var4 + var3;
        int var6 = 0;
        int var7 = this.field34;
        int var8 = this.field36;
        int var9 = class68.field1628 - var8;
        int var10 = 0;
        if (var4 < class68.field1629) {
            int var11 = class68.field1629 - var4;
            var7 -= var11;
            var4 = class68.field1629;
            var6 += var8 * var11;
            var5 += class68.field1628 * var11;
        }
        if (var4 + var7 > class68.field1624) {
            var7 -= var4 + var7 - class68.field1624;
        }
        if (var3 < class68.field1627) {
            int var12 = class68.field1627 - var3;
            var8 -= var12;
            var3 = class68.field1627;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class68.field1626) {
            int var13 = var3 + var8 - class68.field1626;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method14(class68.field1630, this.field35, this.field31, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 281)
    public class3() {
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V", line = 284)
    private class3(int arg0, int arg1, int arg2) {
        this.field30 = this.field36 = arg0;
        this.field32 = this.field34 = arg1;
        this.field33 = this.field37 = 0;
        this.field35 = new byte[arg0 * arg1];
        this.field31 = new int[arg2];
    }
}
