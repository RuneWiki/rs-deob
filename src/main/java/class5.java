import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class130 {

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "[B")
    public byte[] field105;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "[I")
    public int[] field106;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([I[B[IIIIIII)V", line = 4)
    private static final void method28(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()V", line = 70)
    public final void method29() {
        if (this.field108 == this.field102 && this.field107 == this.field103) {
            return;
        }
        byte[] var1 = new byte[this.field108 * this.field103];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field107; var3++) {
            for (int var4 = 0; var4 < this.field102; var4++) {
                var1[(this.field104 + var3) * this.field108 + this.field101 + var4] = this.field105[var2++];
            }
        }
        this.field105 = var1;
        this.field102 = this.field108;
        this.field107 = this.field103;
        this.field101 = 0;
        this.field104 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "()Lad;", line = 104)
    public final class5 method30() {
        class5 var1 = new class5(this.field102, this.field107, this.field106.length);
        var1.field108 = this.field108;
        var1.field103 = this.field103;
        var1.field101 = this.field101;
        var1.field104 = this.field104;
        int var2 = this.field105.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field105[var3] = this.field105[var3];
        }
        int var4 = this.field106.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field106[var5] = this.field106[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "()V", line = 134)
    public final void method31() {
        byte[] var1 = new byte[this.field107 * this.field102];
        int var2 = 0;
        for (int var3 = this.field107 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field102; var4++) {
                var1[var2++] = this.field105[this.field102 * var3 + var4];
            }
        }
        this.field105 = var1;
        this.field104 = this.field103 - this.field107 - this.field104;
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "()V", line = 164)
    public final void method32() {
        byte[] var1 = new byte[this.field107 * this.field102];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field107; var3++) {
            for (int var4 = this.field102 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field105[this.field102 * var3 + var4];
            }
        }
        this.field105 = var1;
        this.field101 = this.field108 - this.field102 - this.field101;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 185)
    public class5() {
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(III)V", line = 187)
    private class5(int arg0, int arg1, int arg2) {
        this.field108 = this.field102 = arg0;
        this.field103 = this.field107 = arg1;
        this.field101 = this.field104 = 0;
        this.field105 = new byte[arg0 * arg1];
        this.field106 = new int[arg2];
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V", line = 196)
    public final void method33(int arg0, int arg1) {
        int var3 = this.field101 + arg0;
        int var4 = this.field104 + arg1;
        int var5 = class130.field3239 * var4 + var3;
        int var6 = 0;
        int var7 = this.field107;
        int var8 = this.field102;
        int var9 = class130.field3239 - var8;
        int var10 = 0;
        if (var4 < class130.field3241) {
            int var11 = class130.field3241 - var4;
            var7 -= var11;
            var4 = class130.field3241;
            var6 += var8 * var11;
            var5 += class130.field3239 * var11;
        }
        if (var4 + var7 > class130.field3243) {
            var7 -= var4 + var7 - class130.field3243;
        }
        if (var3 < class130.field3238) {
            int var12 = class130.field3238 - var3;
            var8 -= var12;
            var3 = class130.field3238;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class130.field3240) {
            int var13 = var3 + var8 - class130.field3240;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method28(class130.field3242, this.field105, this.field106, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 252)
    public final void method34(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field106.length; var4++) {
            int var5 = this.field106[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field106[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field106[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field106[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }
}
