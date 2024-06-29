import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 extends class112 {

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "[B")
    public byte[] field2122;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
    public int[] field2129;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V", line = 4)
    public final void method677() {
        byte[] var1 = new byte[this.field2127 * this.field2125];
        int var2 = 0;
        for (int var3 = this.field2125 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2127; var4++) {
                var1[var2++] = this.field2122[this.field2127 * var3 + var4];
            }
        }
        this.field2122 = var1;
        this.field2123 = this.field2126 - this.field2125 - this.field2123;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V", line = 29)
    public final void method678(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2129.length; var4++) {
            int var5 = this.field2129[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2129[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2129[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2129[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([I[B[IIIIIII)V", line = 75)
    private static final void method679(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 138)
    public final void method680(int arg0, int arg1) {
        int var3 = this.field2128 + arg0;
        int var4 = this.field2123 + arg1;
        int var5 = class112.field2773 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2125;
        int var8 = this.field2127;
        int var9 = class112.field2773 - var8;
        int var10 = 0;
        if (var4 < class112.field2775) {
            int var11 = class112.field2775 - var4;
            var7 -= var11;
            var4 = class112.field2775;
            var6 += var8 * var11;
            var5 += class112.field2773 * var11;
        }
        if (var4 + var7 > class112.field2771) {
            var7 -= var4 + var7 - class112.field2771;
        }
        if (var3 < class112.field2772) {
            int var12 = class112.field2772 - var3;
            var8 -= var12;
            var3 = class112.field2772;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class112.field2774) {
            int var13 = var3 + var8 - class112.field2774;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method679(class112.field2776, this.field2122, this.field2129, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()V", line = 192)
    public final void method681() {
        if (this.field2127 == this.field2124 && this.field2126 == this.field2125) {
            return;
        }
        byte[] var1 = new byte[this.field2126 * this.field2124];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2125; var3++) {
            for (int var4 = 0; var4 < this.field2127; var4++) {
                var1[(this.field2123 + var3) * this.field2124 + this.field2128 + var4] = this.field2122[var2++];
            }
        }
        this.field2122 = var1;
        this.field2127 = this.field2124;
        this.field2125 = this.field2126;
        this.field2128 = 0;
        this.field2123 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()Lne;", line = 227)
    public final class83 method682() {
        class83 var1 = new class83(this.field2127, this.field2125, this.field2129.length);
        var1.field2124 = this.field2124;
        var1.field2126 = this.field2126;
        var1.field2128 = this.field2128;
        var1.field2123 = this.field2123;
        int var2 = this.field2122.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2122[var3] = this.field2122[var3];
        }
        int var4 = this.field2129.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2129[var5] = this.field2129[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "()V", line = 258)
    public final void method683() {
        byte[] var1 = new byte[this.field2127 * this.field2125];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2125; var3++) {
            for (int var4 = this.field2127 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2122[this.field2127 * var3 + var4];
            }
        }
        this.field2122 = var1;
        this.field2128 = this.field2124 - this.field2127 - this.field2128;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 281)
    public class83() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V", line = 283)
    private class83(int arg0, int arg1, int arg2) {
        this.field2124 = this.field2127 = arg0;
        this.field2126 = this.field2125 = arg1;
        this.field2128 = this.field2123 = 0;
        this.field2122 = new byte[arg0 * arg1];
        this.field2129 = new int[arg2];
    }
}
