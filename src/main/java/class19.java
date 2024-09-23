import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FCRLGSQA")
public class class19 extends class26 {

    @OriginalMember(owner = "FCRLGSQA", name = "x", descriptor = "Z")
    private boolean field793 = false;

    @OriginalMember(owner = "FCRLGSQA", name = "y", descriptor = "I")
    private int field794 = 1914;

    @OriginalMember(owner = "FCRLGSQA", name = "z", descriptor = "I")
    private int field795 = 9;

    @OriginalMember(owner = "FCRLGSQA", name = "A", descriptor = "I")
    private int field796 = 9;

    @OriginalMember(owner = "FCRLGSQA", name = "B", descriptor = "Z")
    private boolean field797 = true;

    @OriginalMember(owner = "FCRLGSQA", name = "I", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "FCRLGSQA", name = "J", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "FCRLGSQA", name = "D", descriptor = "[I")
    public int[] field799;

    @OriginalMember(owner = "FCRLGSQA", name = "G", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "FCRLGSQA", name = "H", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "FCRLGSQA", name = "E", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "FCRLGSQA", name = "F", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "FCRLGSQA", name = "C", descriptor = "[B")
    public byte[] field798;

    @OriginalMember(owner = "FCRLGSQA", name = "<init>", descriptor = "(LBBMKAXRK;Ljava/lang/String;I)V")
    public class19(class6 arg0, String arg1, int arg2) {
        class17 var4 = new class17(arg0.method30(arg1 + ".dat", null), -26583);
        class17 var5 = new class17(arg0.method30("index.dat", null), -26583);
        var5.field779 = var4.method226();
        this.field804 = var5.method226();
        this.field805 = var5.method226();
        int var6 = var5.method224();
        this.field799 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field799[var7 + 1] = var5.method228();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field779 += 2;
            var4.field779 += var5.method226() * var5.method226();
            var5.field779++;
        }
        this.field802 = var5.method224();
        this.field803 = var5.method224();
        this.field800 = var5.method226();
        this.field801 = var5.method226();
        int var9 = var5.method224();
        int var10 = this.field801 * this.field800;
        this.field798 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field798[var11] = var4.method225();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field800; var12++) {
                for (int var13 = 0; var13 < this.field801; var13++) {
                    this.field798[this.field800 * var13 + var12] = var4.method225();
                }
            }
        }
    }

    @OriginalMember(owner = "FCRLGSQA", name = "a", descriptor = "(Z)V")
    public void method265(boolean arg0) {
        this.field804 /= 2;
        this.field805 /= 2;
        byte[] var2 = new byte[this.field805 * this.field804];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field801; var4++) {
            for (int var5 = 0; var5 < this.field800; var5++) {
                var2[(this.field802 + var5 >> 1) + (this.field803 + var4 >> 1) * this.field804] = this.field798[var3++];
            }
        }
        this.field798 = var2;
        this.field800 = this.field804;
        this.field801 = this.field805;
        if (!arg0) {
            this.field794 = 383;
        }
        this.field802 = 0;
        this.field803 = 0;
    }

    @OriginalMember(owner = "FCRLGSQA", name = "b", descriptor = "(B)V")
    public void method266(byte arg0) {
        if (arg0 != 1) {
            this.field793 = !this.field793;
        }
        if (this.field804 == this.field800 && this.field805 == this.field801) {
            return;
        }
        byte[] var2 = new byte[this.field805 * this.field804];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field801; var4++) {
            for (int var5 = 0; var5 < this.field800; var5++) {
                var2[(this.field803 + var4) * this.field804 + this.field802 + var5] = this.field798[var3++];
            }
        }
        this.field798 = var2;
        this.field800 = this.field804;
        this.field801 = this.field805;
        this.field802 = 0;
        this.field803 = 0;
    }

    @OriginalMember(owner = "FCRLGSQA", name = "b", descriptor = "(I)V")
    public void method267(int arg0) {
        byte[] var2 = new byte[this.field801 * this.field800];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field801; var4++) {
            for (int var5 = this.field800 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field798[this.field800 * var4 + var5];
            }
        }
        this.field798 = var2;
        this.field802 = this.field804 - this.field800 - this.field802;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "FCRLGSQA", name = "c", descriptor = "(I)V")
    public void method268(int arg0) {
        byte[] var2 = new byte[this.field801 * this.field800];
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        for (int var5 = this.field801 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field800; var6++) {
                var2[var4++] = this.field798[this.field800 * var5 + var6];
            }
        }
        this.field798 = var2;
        this.field803 = this.field805 - this.field801 - this.field803;
    }

    @OriginalMember(owner = "FCRLGSQA", name = "a", descriptor = "(IIII)V")
    public void method269(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -35373) {
            return;
        }
        for (int var5 = 0; var5 < this.field799.length; var5++) {
            int var6 = this.field799[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field799[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field799[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field799[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "FCRLGSQA", name = "a", descriptor = "(III)V")
    public void method270(int arg0, int arg1, int arg2) {
        int var4 = this.field802 + arg0;
        int var5 = this.field803 + arg2;
        if (arg1 <= 0) {
            return;
        }
        int var6 = class26.field877 * var5 + var4;
        int var7 = 0;
        int var8 = this.field801;
        int var9 = this.field800;
        int var10 = class26.field877 - var9;
        int var11 = 0;
        if (var5 < class26.field879) {
            int var12 = class26.field879 - var5;
            var8 -= var12;
            var5 = class26.field879;
            var7 += var9 * var12;
            var6 += class26.field877 * var12;
        }
        if (var5 + var8 > class26.field880) {
            var8 -= var5 + var8 - class26.field880;
        }
        if (var4 < class26.field881) {
            int var13 = class26.field881 - var4;
            var9 -= var13;
            var4 = class26.field881;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class26.field882) {
            int var14 = var4 + var9 - class26.field882;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method271(853, class26.field876, var6, var8, this.field798, var7, var10, var9, this.field799, var11);
        }
    }

    @OriginalMember(owner = "FCRLGSQA", name = "a", descriptor = "(I[III[BIII[II)V")
    private void method271(int arg0, int[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        int var11 = -(arg7 >> 2);
        int var12 = 33 / arg0;
        int var13 = -(arg7 & 0x3);
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg4[arg5++];
                if (var18 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg8[var18 & 0xFF];
                }
                byte var19 = arg4[arg5++];
                if (var19 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg8[var19 & 0xFF];
                }
                byte var20 = arg4[arg5++];
                if (var20 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg8[var20 & 0xFF];
                }
                byte var21 = arg4[arg5++];
                if (var21 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg8[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg4[arg5++];
                if (var17 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg8[var17 & 0xFF];
                }
            }
            arg2 += arg6;
            arg5 += arg9;
        }
    }
}
