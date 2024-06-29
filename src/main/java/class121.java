import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class121 extends class142 {

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public int field2897;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "[B")
    public byte[] field2903;

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "[I")
    public int[] field2902;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "()V")
    public final void method978() {
        byte[] var1 = new byte[this.field2904 * this.field2898];
        int var2 = 0;
        for (int var3 = this.field2898 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2904; var4++) {
                var1[var2++] = this.field2903[this.field2904 * var3 + var4];
            }
        }
        this.field2903 = var1;
        this.field2899 = this.field2901 - this.field2898 - this.field2899;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
    public final void method979(int arg0, int arg1) {
        int var3 = this.field2900 + arg0;
        int var4 = this.field2899 + arg1;
        int var5 = class142.field3422 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2898;
        int var8 = this.field2904;
        int var9 = class142.field3422 - var8;
        int var10 = 0;
        if (var4 < class142.field3424) {
            int var11 = class142.field3424 - var4;
            var7 -= var11;
            var4 = class142.field3424;
            var6 += var8 * var11;
            var5 += class142.field3422 * var11;
        }
        if (var4 + var7 > class142.field3420) {
            var7 -= var4 + var7 - class142.field3420;
        }
        if (var3 < class142.field3421) {
            int var12 = class142.field3421 - var3;
            var8 -= var12;
            var3 = class142.field3421;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class142.field3423) {
            int var13 = var3 + var8 - class142.field3423;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method984(class142.field3426, this.field2903, this.field2902, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "()V")
    public final void method980() {
        byte[] var1 = new byte[this.field2904 * this.field2898];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2898; var3++) {
            for (int var4 = this.field2904 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2903[this.field2904 * var3 + var4];
            }
        }
        this.field2903 = var1;
        this.field2900 = this.field2897 - this.field2904 - this.field2900;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public final void method981(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2902.length; var4++) {
            int var5 = this.field2902[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2902[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2902[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2902[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "()V")
    public final void method982() {
        if (this.field2904 == this.field2897 && this.field2901 == this.field2898) {
            return;
        }
        byte[] var1 = new byte[this.field2901 * this.field2897];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2898; var3++) {
            for (int var4 = 0; var4 < this.field2904; var4++) {
                var1[(this.field2899 + var3) * this.field2897 + this.field2900 + var4] = this.field2903[var2++];
            }
        }
        this.field2903 = var1;
        this.field2904 = this.field2897;
        this.field2898 = this.field2901;
        this.field2900 = 0;
        this.field2899 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "()Lsc;")
    public final class121 method983() {
        class121 var1 = new class121(this.field2904, this.field2898, this.field2902.length);
        var1.field2897 = this.field2897;
        var1.field2901 = this.field2901;
        var1.field2900 = this.field2900;
        var1.field2899 = this.field2899;
        int var2 = this.field2903.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2903[var3] = this.field2903[var3];
        }
        int var4 = this.field2902.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2902[var5] = this.field2902[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method984(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class121() {
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V")
    private class121(int arg0, int arg1, int arg2) {
        this.field2897 = this.field2904 = arg0;
        this.field2901 = this.field2898 = arg1;
        this.field2900 = this.field2899 = 0;
        this.field2903 = new byte[arg0 * arg1];
        this.field2902 = new int[arg2];
    }
}
