import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class114 extends class145 {

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "[B")
    public byte[] field2797;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "[I")
    public int[] field2796;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()V")
    public final void method924() {
        if (this.field2800 == this.field2799 && this.field2802 == this.field2798) {
            return;
        }
        byte[] var1 = new byte[this.field2802 * this.field2799];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2798; var3++) {
            for (int var4 = 0; var4 < this.field2800; var4++) {
                var1[(this.field2801 + var3) * this.field2799 + this.field2795 + var4] = this.field2797[var2++];
            }
        }
        this.field2797 = var1;
        this.field2800 = this.field2799;
        this.field2798 = this.field2802;
        this.field2795 = 0;
        this.field2801 = 0;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "()V")
    public final void method925() {
        byte[] var1 = new byte[this.field2800 * this.field2798];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2798; var3++) {
            for (int var4 = this.field2800 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2797[this.field2800 * var3 + var4];
            }
        }
        this.field2797 = var1;
        this.field2795 = this.field2799 - this.field2800 - this.field2795;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method926(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "()V")
    public final void method927() {
        byte[] var1 = new byte[this.field2800 * this.field2798];
        int var2 = 0;
        for (int var3 = this.field2798 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2800; var4++) {
                var1[var2++] = this.field2797[this.field2800 * var3 + var4];
            }
        }
        this.field2797 = var1;
        this.field2801 = this.field2802 - this.field2798 - this.field2801;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V")
    public final void method928(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2796.length; var4++) {
            int var5 = this.field2796[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2796[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2796[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2796[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public final void method929(int arg0, int arg1) {
        int var3 = this.field2795 + arg0;
        int var4 = this.field2801 + arg1;
        int var5 = class145.field3552 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2798;
        int var8 = this.field2800;
        int var9 = class145.field3552 - var8;
        int var10 = 0;
        if (var4 < class145.field3553) {
            int var11 = class145.field3553 - var4;
            var7 -= var11;
            var4 = class145.field3553;
            var6 += var8 * var11;
            var5 += class145.field3552 * var11;
        }
        if (var4 + var7 > class145.field3551) {
            var7 -= var4 + var7 - class145.field3551;
        }
        if (var3 < class145.field3550) {
            int var12 = class145.field3550 - var3;
            var8 -= var12;
            var3 = class145.field3550;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class145.field3549) {
            int var13 = var3 + var8 - class145.field3549;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method926(class145.field3548, this.field2797, this.field2796, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "()Lra;")
    public final class114 method930() {
        class114 var1 = new class114(this.field2800, this.field2798, this.field2796.length);
        var1.field2799 = this.field2799;
        var1.field2802 = this.field2802;
        var1.field2795 = this.field2795;
        var1.field2801 = this.field2801;
        int var2 = this.field2797.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2797[var3] = this.field2797[var3];
        }
        int var4 = this.field2796.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2796[var5] = this.field2796[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class114() {
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(III)V")
    private class114(int arg0, int arg1, int arg2) {
        this.field2799 = this.field2800 = arg0;
        this.field2802 = this.field2798 = arg1;
        this.field2795 = this.field2801 = 0;
        this.field2797 = new byte[arg0 * arg1];
        this.field2796 = new int[arg2];
    }
}
