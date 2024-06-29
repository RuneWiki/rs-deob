import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class25 extends class111 {

    @OriginalMember(owner = "client!e", name = "zb", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!e", name = "Bb", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!e", name = "Eb", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!e", name = "Cb", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!e", name = "Fb", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!e", name = "Gb", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!e", name = "Db", descriptor = "[B")
    public byte[] field749;

    @OriginalMember(owner = "client!e", name = "Ab", descriptor = "[I")
    public int[] field746;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()Le;", line = 5)
    public final class25 method329() {
        class25 var1 = new class25(this.field745, this.field750, this.field746.length);
        var1.field747 = this.field747;
        var1.field748 = this.field748;
        var1.field752 = this.field752;
        var1.field751 = this.field751;
        int var2 = this.field749.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field749[var3] = this.field749[var3];
        }
        int var4 = this.field746.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field746[var5] = this.field746[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V", line = 32)
    public final void method330(int arg0, int arg1) {
        int var3 = this.field752 + arg0;
        int var4 = this.field751 + arg1;
        int var5 = class111.field2752 * var4 + var3;
        int var6 = 0;
        int var7 = this.field750;
        int var8 = this.field745;
        int var9 = class111.field2752 - var8;
        int var10 = 0;
        if (var4 < class111.field2751) {
            int var11 = class111.field2751 - var4;
            var7 -= var11;
            var4 = class111.field2751;
            var6 += var8 * var11;
            var5 += class111.field2752 * var11;
        }
        if (var4 + var7 > class111.field2754) {
            var7 -= var4 + var7 - class111.field2754;
        }
        if (var3 < class111.field2755) {
            int var12 = class111.field2755 - var3;
            var8 -= var12;
            var3 = class111.field2755;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class111.field2756) {
            int var13 = var3 + var8 - class111.field2756;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method331(class111.field2750, this.field749, this.field746, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([I[B[IIIIIII)V", line = 88)
    private static final void method331(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!e", name = "e", descriptor = "()V", line = 150)
    public final void method332() {
        if (this.field747 == this.field745 && this.field750 == this.field748) {
            return;
        }
        byte[] var1 = new byte[this.field748 * this.field747];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field750; var3++) {
            for (int var4 = 0; var4 < this.field745; var4++) {
                var1[(this.field751 + var3) * this.field747 + this.field752 + var4] = this.field749[var2++];
            }
        }
        this.field749 = var1;
        this.field745 = this.field747;
        this.field750 = this.field748;
        this.field752 = 0;
        this.field751 = 0;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "()V", line = 183)
    public final void method333() {
        byte[] var1 = new byte[this.field750 * this.field745];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field750; var3++) {
            for (int var4 = this.field745 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field749[this.field745 * var3 + var4];
            }
        }
        this.field749 = var1;
        this.field752 = this.field747 - this.field745 - this.field752;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "()V", line = 206)
    public final void method334() {
        byte[] var1 = new byte[this.field750 * this.field745];
        int var2 = 0;
        for (int var3 = this.field750 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field745; var4++) {
                var1[var2++] = this.field749[this.field745 * var3 + var4];
            }
        }
        this.field749 = var1;
        this.field751 = this.field748 - this.field750 - this.field751;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V", line = 232)
    public final void method335(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field746.length; var4++) {
            int var5 = this.field746[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field746[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field746[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field746[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 281)
    public class25() {
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(III)V", line = 284)
    private class25(int arg0, int arg1, int arg2) {
        this.field747 = this.field745 = arg0;
        this.field748 = this.field750 = arg1;
        this.field752 = this.field751 = 0;
        this.field749 = new byte[arg0 * arg1];
        this.field746 = new int[arg2];
    }
}
