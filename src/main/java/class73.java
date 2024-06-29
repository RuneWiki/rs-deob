import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class73 extends class27 {

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "[B")
    public byte[] field1711;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "[I")
    public int[] field1705;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([I[B[IIIIIII)V", line = 5)
    private static final void method494(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()V", line = 70)
    public final void method495() {
        byte[] var1 = new byte[this.field1712 * this.field1706];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1712; var3++) {
            for (int var4 = this.field1706 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field1711[this.field1706 * var3 + var4];
            }
        }
        this.field1711 = var1;
        this.field1707 = this.field1710 - this.field1706 - this.field1707;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V", line = 97)
    public final void method496(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1705.length; var4++) {
            int var5 = this.field1705[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1705[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1705[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1705[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 138)
    public final void method497(int arg0, int arg1) {
        int var3 = this.field1707 + arg0;
        int var4 = this.field1709 + arg1;
        int var5 = class27.field601 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1712;
        int var8 = this.field1706;
        int var9 = class27.field601 - var8;
        int var10 = 0;
        if (var4 < class27.field602) {
            int var11 = class27.field602 - var4;
            var7 -= var11;
            var4 = class27.field602;
            var6 += var8 * var11;
            var5 += class27.field601 * var11;
        }
        if (var4 + var7 > class27.field603) {
            var7 -= var4 + var7 - class27.field603;
        }
        if (var3 < class27.field604) {
            int var12 = class27.field604 - var3;
            var8 -= var12;
            var3 = class27.field604;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class27.field600) {
            int var13 = var3 + var8 - class27.field600;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method494(class27.field605, this.field1711, this.field1705, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "()Lmb;", line = 193)
    public final class73 method498() {
        class73 var1 = new class73(this.field1706, this.field1712, this.field1705.length);
        var1.field1710 = this.field1710;
        var1.field1708 = this.field1708;
        var1.field1707 = this.field1707;
        var1.field1709 = this.field1709;
        int var2 = this.field1711.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field1711[var3] = this.field1711[var3];
        }
        int var4 = this.field1705.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field1705[var5] = this.field1705[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "()V", line = 220)
    public final void method499() {
        if (this.field1710 == this.field1706 && this.field1712 == this.field1708) {
            return;
        }
        byte[] var1 = new byte[this.field1710 * this.field1708];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1712; var3++) {
            for (int var4 = 0; var4 < this.field1706; var4++) {
                var1[(this.field1709 + var3) * this.field1710 + this.field1707 + var4] = this.field1711[var2++];
            }
        }
        this.field1711 = var1;
        this.field1706 = this.field1710;
        this.field1712 = this.field1708;
        this.field1707 = 0;
        this.field1709 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 255)
    public class73() {
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(III)V", line = 258)
    private class73(int arg0, int arg1, int arg2) {
        this.field1710 = this.field1706 = arg0;
        this.field1708 = this.field1712 = arg1;
        this.field1707 = this.field1709 = 0;
        this.field1711 = new byte[arg0 * arg1];
        this.field1705 = new int[arg2];
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "()V", line = 270)
    public final void method500() {
        byte[] var1 = new byte[this.field1712 * this.field1706];
        int var2 = 0;
        for (int var3 = this.field1712 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field1706; var4++) {
                var1[var2++] = this.field1711[this.field1706 * var3 + var4];
            }
        }
        this.field1711 = var1;
        this.field1709 = this.field1708 - this.field1712 - this.field1709;
    }
}
