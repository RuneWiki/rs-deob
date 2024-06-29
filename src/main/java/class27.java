import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 extends class17 {

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "[B")
    public byte[] field771;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "[I")
    public int[] field773;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V")
    public final void method208(int arg0, int arg1) {
        int var3 = this.field775 + arg0;
        int var4 = this.field776 + arg1;
        int var5 = class17.field503 * var4 + var3;
        int var6 = 0;
        int var7 = this.field774;
        int var8 = this.field772;
        int var9 = class17.field503 - var8;
        int var10 = 0;
        if (var4 < class17.field504) {
            int var11 = class17.field504 - var4;
            var7 -= var11;
            var4 = class17.field504;
            var6 += var8 * var11;
            var5 += class17.field503 * var11;
        }
        if (var4 + var7 > class17.field501) {
            var7 -= var4 + var7 - class17.field501;
        }
        if (var3 < class17.field502) {
            int var12 = class17.field502 - var3;
            var8 -= var12;
            var3 = class17.field502;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class17.field507) {
            int var13 = var3 + var8 - class17.field507;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method210(class17.field506, this.field771, this.field773, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()Lde;")
    public final class27 method209() {
        class27 var1 = new class27(this.field772, this.field774, this.field773.length);
        var1.field778 = this.field778;
        var1.field777 = this.field777;
        var1.field775 = this.field775;
        var1.field776 = this.field776;
        int var2 = this.field771.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field771[var3] = this.field771[var3];
        }
        int var4 = this.field773.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field773[var5] = this.field773[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method210(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
    public final void method211() {
        byte[] var1 = new byte[this.field774 * this.field772];
        int var2 = 0;
        for (int var3 = this.field774 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field772; var4++) {
                var1[var2++] = this.field771[this.field772 * var3 + var4];
            }
        }
        this.field771 = var1;
        this.field776 = this.field777 - this.field774 - this.field776;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "()V")
    public final void method212() {
        byte[] var1 = new byte[this.field774 * this.field772];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field774; var3++) {
            for (int var4 = this.field772 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field771[this.field772 * var3 + var4];
            }
        }
        this.field771 = var1;
        this.field775 = this.field778 - this.field772 - this.field775;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "()V")
    public final void method213() {
        if (this.field778 == this.field772 && this.field777 == this.field774) {
            return;
        }
        byte[] var1 = new byte[this.field778 * this.field777];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field774; var3++) {
            for (int var4 = 0; var4 < this.field772; var4++) {
                var1[(this.field776 + var3) * this.field778 + this.field775 + var4] = this.field771[var2++];
            }
        }
        this.field771 = var1;
        this.field772 = this.field778;
        this.field774 = this.field777;
        this.field775 = 0;
        this.field776 = 0;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class27() {
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(III)V")
    private class27(int arg0, int arg1, int arg2) {
        this.field778 = this.field772 = arg0;
        this.field777 = this.field774 = arg1;
        this.field775 = this.field776 = 0;
        this.field771 = new byte[arg0 * arg1];
        this.field773 = new int[arg2];
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
    public final void method214(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field773.length; var4++) {
            int var5 = this.field773[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field773[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field773[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field773[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }
}
