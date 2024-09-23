import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "kb", name = "z", descriptor = "Z")
    private boolean field679 = true;

    @OriginalMember(owner = "kb", name = "A", descriptor = "I")
    private int field680 = 5;

    @OriginalMember(owner = "kb", name = "H", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "kb", name = "I", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "kb", name = "C", descriptor = "[I")
    public int[] field682;

    @OriginalMember(owner = "kb", name = "F", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "kb", name = "E", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "kb", name = "B", descriptor = "[B")
    public byte[] field681;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method309(arg1 + ".dat", null), 337);
        Packet var5 = new Packet(arg0.method309("index.dat", null), 337);
        var5.field710 = var4.method241();
        this.field687 = var5.method241();
        this.field688 = var5.method241();
        int var6 = var5.method239();
        this.field682 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field682[var7 + 1] = var5.method243();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field710 += 2;
            var4.field710 += var5.method241() * var5.method241();
            var5.field710++;
        }
        this.field685 = var5.method239();
        this.field686 = var5.method239();
        this.field683 = var5.method241();
        this.field684 = var5.method241();
        int var9 = var5.method239();
        int var10 = this.field684 * this.field683;
        this.field681 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field681[var11] = var4.method240();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field683; var12++) {
                for (int var13 = 0; var13 < this.field684; var13++) {
                    this.field681[this.field683 * var13 + var12] = var4.method240();
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method207(int arg0) {
        this.field687 /= 2;
        this.field688 /= 2;
        byte[] var2 = new byte[this.field688 * this.field687];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field684; var4++) {
            for (int var5 = 0; var5 < this.field683; var5++) {
                var2[(this.field685 + var5 >> 1) + (this.field686 + var4 >> 1) * this.field687] = this.field681[var3++];
            }
        }
        this.field681 = var2;
        this.field683 = this.field687;
        this.field684 = this.field688;
        this.field685 = 0;
        this.field686 = 0;
        if (arg0 != 9) {
            this.field679 = !this.field679;
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method208(int arg0) {
        if (this.field687 == this.field683 && this.field688 == this.field684) {
            return;
        }
        byte[] var2 = new byte[this.field688 * this.field687];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field684; var4++) {
            for (int var5 = 0; var5 < this.field683; var5++) {
                var2[(this.field686 + var4) * this.field687 + this.field685 + var5] = this.field681[var3++];
            }
        }
        if (arg0 != -38199) {
            return;
        }
        this.field681 = var2;
        this.field683 = this.field687;
        this.field684 = this.field688;
        this.field685 = 0;
        this.field686 = 0;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method209(int arg0) {
        byte[] var2 = new byte[this.field684 * this.field683];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field684; var4++) {
            for (int var6 = this.field683 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field681[this.field683 * var4 + var6];
            }
        }
        this.field681 = var2;
        if (arg0 < 3 || arg0 > 3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field685 = this.field687 - this.field683 - this.field685;
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(I)V")
    public void method210(int arg0) {
        byte[] var2 = new byte[this.field684 * this.field683];
        int var3 = 0;
        for (int var4 = this.field684 - 1; var4 >= 0; var4--) {
            for (int var6 = 0; var6 < this.field683; var6++) {
                var2[var3++] = this.field681[this.field683 * var4 + var6];
            }
        }
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field681 = var2;
        this.field686 = this.field688 - this.field684 - this.field686;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII)V")
    public void method211(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field682.length; var5++) {
            int var6 = this.field682[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field682[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field682[var5] & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field682[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg0 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III)V")
    public void method212(int arg0, int arg1, int arg2) {
        int var4 = this.field685 + arg2;
        int var5 = this.field686 + arg1;
        int var6 = Pix2D.field630 * var5 + var4;
        int var7 = 0;
        int var8 = this.field684;
        int var9 = this.field683;
        int var10 = Pix2D.field630 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field632) {
            int var12 = Pix2D.field632 - var5;
            var8 -= var12;
            var5 = Pix2D.field632;
            var7 += var9 * var12;
            var6 += Pix2D.field630 * var12;
        }
        if (var5 + var8 > Pix2D.field633) {
            var8 -= var5 + var8 - Pix2D.field633;
        }
        if (var4 < Pix2D.field634) {
            int var13 = Pix2D.field634 - var4;
            var9 -= var13;
            var4 = Pix2D.field634;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field635) {
            int var14 = var4 + var9 - Pix2D.field635;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method213(var9, (byte) -98, var11, this.field682, this.field681, var7, var8, var6, var10, Pix2D.field629);
            if (arg0 != 0) {
                this.field679 = !this.field679;
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IBI[I[BIIII[I)V")
    private void method213(int arg0, byte arg1, int arg2, int[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        int var11 = -(arg0 >> 2);
        int var12 = -(arg0 & 0x3);
        if (arg1 != -98) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        for (int var14 = -arg6; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg4[arg5++];
                if (var18 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg3[var18 & 0xFF];
                }
                byte var19 = arg4[arg5++];
                if (var19 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg3[var19 & 0xFF];
                }
                byte var20 = arg4[arg5++];
                if (var20 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg3[var20 & 0xFF];
                }
                byte var21 = arg4[arg5++];
                if (var21 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg3[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg4[arg5++];
                if (var17 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg3[var17 & 0xFF];
                }
            }
            arg7 += arg8;
            arg5 += arg2;
        }
    }
}
