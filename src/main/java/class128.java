import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class128 extends class120 {

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "[B")
    public byte[] field2754;

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "[I")
    public int[] field2760;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()V")
    public final void method973() {
        byte[] var1 = new byte[this.field2759 * this.field2756];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2759; var3++) {
            for (int var4 = this.field2756 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2754[this.field2756 * var3 + var4];
            }
        }
        this.field2754 = var1;
        this.field2757 = this.field2758 - this.field2756 - this.field2757;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "()V")
    public final void method974() {
        if (this.field2758 == this.field2756 && this.field2761 == this.field2759) {
            return;
        }
        byte[] var1 = new byte[this.field2761 * this.field2758];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2759; var3++) {
            for (int var4 = 0; var4 < this.field2756; var4++) {
                var1[(this.field2755 + var3) * this.field2758 + this.field2757 + var4] = this.field2754[var2++];
            }
        }
        this.field2754 = var1;
        this.field2756 = this.field2758;
        this.field2759 = this.field2761;
        this.field2757 = 0;
        this.field2755 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "()V")
    public final void method975() {
        byte[] var1 = new byte[this.field2759 * this.field2756];
        int var2 = 0;
        for (int var3 = this.field2759 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2756; var4++) {
                var1[var2++] = this.field2754[this.field2756 * var3 + var4];
            }
        }
        this.field2754 = var1;
        this.field2755 = this.field2761 - this.field2759 - this.field2755;
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "()Lwc;")
    public final class128 method976() {
        class128 var1 = new class128(this.field2756, this.field2759, this.field2760.length);
        var1.field2758 = this.field2758;
        var1.field2761 = this.field2761;
        var1.field2757 = this.field2757;
        var1.field2755 = this.field2755;
        int var2 = this.field2754.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2754[var3] = this.field2754[var3];
        }
        int var4 = this.field2760.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2760[var5] = this.field2760[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V")
    public final void method977(int arg0, int arg1) {
        int var3 = this.field2757 + arg0;
        int var4 = this.field2755 + arg1;
        int var5 = class120.field2591 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2759;
        int var8 = this.field2756;
        int var9 = class120.field2591 - var8;
        int var10 = 0;
        if (var4 < class120.field2593) {
            int var11 = class120.field2593 - var4;
            var7 -= var11;
            var4 = class120.field2593;
            var6 += var8 * var11;
            var5 += class120.field2591 * var11;
        }
        if (var4 + var7 > class120.field2592) {
            var7 -= var4 + var7 - class120.field2592;
        }
        if (var3 < class120.field2596) {
            int var12 = class120.field2596 - var3;
            var8 -= var12;
            var3 = class120.field2596;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class120.field2590) {
            int var13 = var3 + var8 - class120.field2590;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method978(class120.field2594, this.field2754, this.field2760, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method978(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
    public final void method979(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2760.length; var4++) {
            int var5 = this.field2760[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2760[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2760[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2760[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class128() {
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(III)V")
    private class128(int arg0, int arg1, int arg2) {
        this.field2758 = this.field2756 = arg0;
        this.field2761 = this.field2759 = arg1;
        this.field2757 = this.field2755 = 0;
        this.field2754 = new byte[arg0 * arg1];
        this.field2760 = new int[arg2];
    }
}
