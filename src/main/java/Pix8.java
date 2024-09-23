import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "kb", name = "A", descriptor = "I")
    private int field677 = 2;

    @OriginalMember(owner = "kb", name = "B", descriptor = "B")
    private byte field678 = 9;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Z")
    private boolean field679 = false;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    private int field680 = 35546;

    @OriginalMember(owner = "kb", name = "E", descriptor = "Z")
    private boolean field681 = true;

    @OriginalMember(owner = "kb", name = "F", descriptor = "Z")
    private boolean field682 = true;

    @OriginalMember(owner = "kb", name = "M", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "kb", name = "N", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "kb", name = "H", descriptor = "[I")
    public int[] field684;

    @OriginalMember(owner = "kb", name = "K", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "kb", name = "L", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "kb", name = "I", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "kb", name = "J", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "kb", name = "G", descriptor = "[B")
    public byte[] field683;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet((byte) -109, arg0.method308(arg1 + ".dat", null));
        Packet var5 = new Packet((byte) -109, arg0.method308("index.dat", null));
        var5.field719 = var4.method240();
        this.field689 = var5.method240();
        this.field690 = var5.method240();
        int var6 = var5.method238();
        this.field684 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field684[var7 + 1] = var5.method242();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field719 += 2;
            var4.field719 += var5.method240() * var5.method240();
            var5.field719++;
        }
        this.field687 = var5.method238();
        this.field688 = var5.method238();
        this.field685 = var5.method240();
        this.field686 = var5.method240();
        int var9 = var5.method238();
        int var10 = this.field686 * this.field685;
        this.field683 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field683[var11] = var4.method239();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field685; var12++) {
                for (int var13 = 0; var13 < this.field686; var13++) {
                    this.field683[this.field685 * var13 + var12] = var4.method239();
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method206(int arg0) {
        this.field689 /= 2;
        this.field690 /= 2;
        byte[] var2 = new byte[this.field690 * this.field689];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field686; var4++) {
            for (int var5 = 0; var5 < this.field685; var5++) {
                var2[(this.field687 + var5 >> 1) + (this.field688 + var4 >> 1) * this.field689] = this.field683[var3++];
            }
        }
        this.field683 = var2;
        this.field685 = this.field689;
        if (arg0 != 3206) {
            this.field681 = !this.field681;
        }
        this.field686 = this.field690;
        this.field687 = 0;
        this.field688 = 0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Z)V")
    public void method207(boolean arg0) {
        if (this.field689 == this.field685 && this.field690 == this.field686) {
            return;
        }
        byte[] var2 = new byte[this.field690 * this.field689];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field686; var4++) {
            for (int var6 = 0; var6 < this.field685; var6++) {
                var2[(this.field688 + var4) * this.field689 + this.field687 + var6] = this.field683[var3++];
            }
        }
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field683 = var2;
        this.field685 = this.field689;
        this.field686 = this.field690;
        this.field687 = 0;
        this.field688 = 0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method208(int arg0) {
        byte[] var2 = new byte[this.field686 * this.field685];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field686; var4++) {
            for (int var5 = this.field685 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field683[this.field685 * var4 + var5];
            }
        }
        if (arg0 >= 4 && arg0 <= 4) {
            this.field683 = var2;
            this.field687 = this.field689 - this.field685 - this.field687;
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method209(int arg0) {
        byte[] var2 = new byte[this.field686 * this.field685];
        if (this.field680 != arg0) {
            this.field677 = 314;
        }
        int var3 = 0;
        for (int var4 = this.field686 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field685; var5++) {
                var2[var3++] = this.field683[this.field685 * var4 + var5];
            }
        }
        this.field683 = var2;
        this.field688 = this.field690 - this.field686 - this.field688;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII)V")
    public void method210(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field684.length; var5++) {
            int var6 = this.field684[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field684[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field684[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field684[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg2 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BII)V")
    public void method211(byte arg0, int arg1, int arg2) {
        int var4 = this.field687 + arg1;
        int var5 = this.field688 + arg2;
        int var6 = Pix2D.field628 * var5 + var4;
        int var7 = 0;
        int var8 = this.field686;
        int var9 = this.field685;
        int var10 = Pix2D.field628 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field630) {
            int var12 = Pix2D.field630 - var5;
            var8 -= var12;
            var5 = Pix2D.field630;
            var7 += var9 * var12;
            var6 += Pix2D.field628 * var12;
        }
        if (var5 + var8 > Pix2D.field631) {
            var8 -= var5 + var8 - Pix2D.field631;
        }
        if (var4 < Pix2D.field632) {
            int var13 = Pix2D.field632 - var4;
            var9 -= var13;
            var4 = Pix2D.field632;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field633) {
            int var14 = var4 + var9 - Pix2D.field633;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method212(-228, var11, var8, var10, Pix2D.field627, var6, this.field683, this.field684, var9, var7);
            if (this.field678 == arg0) {
                boolean var15 = false;
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII[II[B[III)V")
    private void method212(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte[] arg6, int[] arg7, int arg8, int arg9) {
        int var11 = -(arg8 >> 2);
        while (arg0 >= 0) {
            this.field682 = !this.field682;
        }
        int var12 = -(arg8 & 0x3);
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg6[arg9++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg4[arg5++] = arg7[var17 & 0xFF];
                }
                byte var18 = arg6[arg9++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg4[arg5++] = arg7[var18 & 0xFF];
                }
                byte var19 = arg6[arg9++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg4[arg5++] = arg7[var19 & 0xFF];
                }
                byte var20 = arg6[arg9++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg4[arg5++] = arg7[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg6[arg9++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg4[arg5++] = arg7[var16 & 0xFF];
                }
            }
            arg5 += arg3;
            arg9 += arg1;
        }
    }
}
