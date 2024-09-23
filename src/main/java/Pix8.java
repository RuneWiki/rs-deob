import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "kb", name = "w", descriptor = "I")
    private int field678 = 626;

    @OriginalMember(owner = "kb", name = "x", descriptor = "Z")
    private boolean field679 = false;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private int field680 = 68;

    @OriginalMember(owner = "kb", name = "z", descriptor = "Z")
    private boolean field681 = false;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "kb", name = "H", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "kb", name = "B", descriptor = "[I")
    public int[] field683;

    @OriginalMember(owner = "kb", name = "E", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "kb", name = "F", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "kb", name = "C", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "kb", name = "A", descriptor = "[B")
    public byte[] field682;

    @OriginalMember(owner = "kb", name = "v", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method308(arg1 + ".dat", null), false);
        Packet var5 = new Packet(arg0.method308("index.dat", null), false);
        var5.field713 = var4.method240();
        this.field688 = var5.method240();
        this.field689 = var5.method240();
        int var6 = var5.method238();
        this.field683 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field683[var7 + 1] = var5.method242();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field713 += 2;
            var4.field713 += var5.method240() * var5.method240();
            var5.field713++;
        }
        this.field686 = var5.method238();
        this.field687 = var5.method238();
        this.field684 = var5.method240();
        this.field685 = var5.method240();
        int var9 = var5.method238();
        int var10 = this.field685 * this.field684;
        this.field682 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field682[var11] = var4.method239();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field684; var12++) {
                for (int var13 = 0; var13 < this.field685; var13++) {
                    this.field682[this.field684 * var13 + var12] = var4.method239();
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method206(int arg0) {
        this.field688 /= 2;
        this.field689 /= 2;
        if (arg0 >= 0) {
            return;
        }
        byte[] var2 = new byte[this.field689 * this.field688];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field685; var4++) {
            for (int var5 = 0; var5 < this.field684; var5++) {
                var2[(this.field686 + var5 >> 1) + (this.field687 + var4 >> 1) * this.field688] = this.field682[var3++];
            }
        }
        this.field682 = var2;
        this.field684 = this.field688;
        this.field685 = this.field689;
        this.field686 = 0;
        this.field687 = 0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)V")
    public void method207(byte arg0) {
        if (this.field688 == this.field684 && this.field689 == this.field685) {
            return;
        }
        byte[] var2 = new byte[this.field689 * this.field688];
        if (arg0 != 3) {
            this.field677 = -375;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field685; var4++) {
            for (int var5 = 0; var5 < this.field684; var5++) {
                var2[(this.field687 + var4) * this.field688 + this.field686 + var5] = this.field682[var3++];
            }
        }
        this.field682 = var2;
        this.field684 = this.field688;
        this.field685 = this.field689;
        this.field686 = 0;
        this.field687 = 0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method208(int arg0) {
        byte[] var2 = new byte[this.field685 * this.field684];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field685; var4++) {
            for (int var6 = this.field684 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field682[this.field684 * var4 + var6];
            }
        }
        if (arg0 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field682 = var2;
        this.field686 = this.field688 - this.field684 - this.field686;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method209(int arg0) {
        byte[] var2 = new byte[this.field685 * this.field684];
        if (arg0 != 0) {
            this.field681 = !this.field681;
        }
        int var3 = 0;
        for (int var4 = this.field685 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field684; var5++) {
                var2[var3++] = this.field682[this.field684 * var4 + var5];
            }
        }
        this.field682 = var2;
        this.field687 = this.field689 - this.field685 - this.field687;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IZII)V")
    public void method210(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field677 = -88;
        }
        for (int var5 = 0; var5 < this.field683.length; var5++) {
            int var6 = this.field683[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field683[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field683[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field683[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III)V")
    public void method211(int arg0, int arg1, int arg2) {
        int var4 = this.field686 + arg0;
        int var5 = this.field687 + arg2;
        int var6 = Pix2D.field631 * var5 + var4;
        int var7 = 0;
        int var8 = 58 / arg1;
        int var9 = this.field685;
        int var10 = this.field684;
        int var11 = Pix2D.field631 - var10;
        int var12 = 0;
        if (var5 < Pix2D.field633) {
            int var13 = Pix2D.field633 - var5;
            var9 -= var13;
            var5 = Pix2D.field633;
            var7 += var10 * var13;
            var6 += Pix2D.field631 * var13;
        }
        if (var5 + var9 > Pix2D.field634) {
            var9 -= var5 + var9 - Pix2D.field634;
        }
        if (var4 < Pix2D.field635) {
            int var14 = Pix2D.field635 - var4;
            var10 -= var14;
            var4 = Pix2D.field635;
            var7 += var14;
            var6 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field636) {
            int var15 = var4 + var10 - Pix2D.field636;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method212(this.field683, var9, this.field682, Pix2D.field630, 68, var12, var6, var7, var10, var11);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([II[B[IIIIIII)V")
    private void method212(int[] arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg8 >> 2);
        int var12 = -(arg8 & 0x3);
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg2[arg7++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var17 & 0xFF];
                }
                byte var18 = arg2[arg7++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var18 & 0xFF];
                }
                byte var19 = arg2[arg7++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var19 & 0xFF];
                }
                byte var20 = arg2[arg7++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg2[arg7++];
                if (var16 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var16 & 0xFF];
                }
            }
            arg6 += arg9;
            arg7 += arg5;
        }
        if (arg4 <= 0) {
            this.field679 = !this.field679;
        }
    }
}
