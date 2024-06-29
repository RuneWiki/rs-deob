import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 extends class49 {

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "[B")
    public byte[] field2833;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "[I")
    public int[] field2831;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
    public final void method947(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2831.length; var4++) {
            int var5 = this.field2831[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2831[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2831[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2831[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
    public final void method948() {
        if (this.field2835 == this.field2830 && this.field2836 == this.field2832) {
            return;
        }
        byte[] var1 = new byte[this.field2836 * this.field2830];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2832; var3++) {
            for (int var4 = 0; var4 < this.field2835; var4++) {
                var1[(this.field2837 + var3) * this.field2830 + this.field2834 + var4] = this.field2833[var2++];
            }
        }
        this.field2833 = var1;
        this.field2835 = this.field2830;
        this.field2832 = this.field2836;
        this.field2834 = 0;
        this.field2837 = 0;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
    public final void method949() {
        byte[] var1 = new byte[this.field2835 * this.field2832];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2832; var3++) {
            for (int var4 = this.field2835 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2833[this.field2835 * var3 + var4];
            }
        }
        this.field2833 = var1;
        this.field2834 = this.field2830 - this.field2835 - this.field2834;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method950(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
    public final void method951(int arg0, int arg1) {
        int var3 = this.field2834 + arg0;
        int var4 = this.field2837 + arg1;
        int var5 = class49.field1033 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2832;
        int var8 = this.field2835;
        int var9 = class49.field1033 - var8;
        int var10 = 0;
        if (var4 < class49.field1030) {
            int var11 = class49.field1030 - var4;
            var7 -= var11;
            var4 = class49.field1030;
            var6 += var8 * var11;
            var5 += class49.field1033 * var11;
        }
        if (var4 + var7 > class49.field1029) {
            var7 -= var4 + var7 - class49.field1029;
        }
        if (var3 < class49.field1034) {
            int var12 = class49.field1034 - var3;
            var8 -= var12;
            var3 = class49.field1034;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class49.field1035) {
            int var13 = var3 + var8 - class49.field1035;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method950(class49.field1032, this.field2833, this.field2831, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Lr;")
    public final class118 method952() {
        class118 var1 = new class118(this.field2835, this.field2832, this.field2831.length);
        var1.field2830 = this.field2830;
        var1.field2836 = this.field2836;
        var1.field2834 = this.field2834;
        var1.field2837 = this.field2837;
        int var2 = this.field2833.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2833[var3] = this.field2833[var3];
        }
        int var4 = this.field2831.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2831[var5] = this.field2831[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
    public final void method953() {
        byte[] var1 = new byte[this.field2835 * this.field2832];
        int var2 = 0;
        for (int var3 = this.field2832 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2835; var4++) {
                var1[var2++] = this.field2833[this.field2835 * var3 + var4];
            }
        }
        this.field2833 = var1;
        this.field2837 = this.field2836 - this.field2832 - this.field2837;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class118() {
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(III)V")
    private class118(int arg0, int arg1, int arg2) {
        this.field2830 = this.field2835 = arg0;
        this.field2836 = this.field2832 = arg1;
        this.field2834 = this.field2837 = 0;
        this.field2833 = new byte[arg0 * arg1];
        this.field2831 = new int[arg2];
    }
}
