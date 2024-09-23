import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private int field676 = 1;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private int field677 = 8;

    @OriginalMember(owner = "kb", name = "z", descriptor = "Z")
    private boolean field678 = true;

    @OriginalMember(owner = "kb", name = "A", descriptor = "Z")
    private boolean field679 = false;

    @OriginalMember(owner = "kb", name = "B", descriptor = "Z")
    private boolean field680 = false;

    @OriginalMember(owner = "kb", name = "J", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "kb", name = "K", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "kb", name = "E", descriptor = "[I")
    public int[] field683;

    @OriginalMember(owner = "kb", name = "H", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "kb", name = "I", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "kb", name = "F", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "kb", name = "D", descriptor = "[B")
    public byte[] field682;

    @OriginalMember(owner = "kb", name = "C", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(16, arg0.method309(arg1 + ".dat", null));
        Packet var5 = new Packet(16, arg0.method309("index.dat", null));
        var5.field717 = var4.method241();
        this.field688 = var5.method241();
        this.field689 = var5.method241();
        int var6 = var5.method239();
        this.field683 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field683[var7 + 1] = var5.method243();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field717 += 2;
            var4.field717 += var5.method241() * var5.method241();
            var5.field717++;
        }
        this.field686 = var5.method239();
        this.field687 = var5.method239();
        this.field684 = var5.method241();
        this.field685 = var5.method241();
        int var9 = var5.method239();
        int var10 = this.field685 * this.field684;
        this.field682 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field682[var11] = var4.method240();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field684; var12++) {
                    for (int var13 = 0; var13 < this.field685; var13++) {
                        this.field682[this.field684 * var13 + var12] = var4.method240();
                    }
                }
            }
            if (Linkable.field377) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method207(int arg0) {
        this.field688 /= 2;
        this.field689 /= 2;
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
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method208(int arg0) {
        if (this.field688 == this.field684 && this.field689 == this.field685) {
            return;
        }
        byte[] var2 = new byte[this.field689 * this.field688];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field685; var4++) {
            for (int var5 = 0; var5 < this.field684; var5++) {
                var2[(this.field687 + var4) * this.field688 + this.field686 + var5] = this.field682[var3++];
            }
        }
        if (arg0 != 33684) {
            this.field680 = !this.field680;
        }
        this.field682 = var2;
        this.field684 = this.field688;
        this.field685 = this.field689;
        this.field686 = 0;
        this.field687 = 0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)V")
    public void method209(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            this.field681 = -82;
        }
        byte[] var3 = new byte[this.field685 * this.field684];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field685; var5++) {
            for (int var6 = this.field684 - 1; var6 >= 0; var6--) {
                var3[var4++] = this.field682[this.field684 * var5 + var6];
            }
        }
        this.field682 = var3;
        this.field686 = this.field688 - this.field684 - this.field686;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method210(int arg0) {
        byte[] var2 = new byte[this.field685 * this.field684];
        int var3 = 0;
        for (int var4 = this.field685 - 1; var4 >= 0; var4--) {
            for (int var6 = 0; var6 < this.field684; var6++) {
                var2[var3++] = this.field682[this.field684 * var4 + var6];
            }
        }
        this.field682 = var2;
        this.field687 = this.field689 - this.field685 - this.field687;
        int var5 = 86 / arg0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII)V")
    public void method211(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            return;
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
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field683[var5] & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field683[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III)V")
    public void method212(int arg0, int arg1, int arg2) {
        int var4 = this.field686 + arg0;
        int var5 = this.field687 + arg2;
        int var6 = Pix2D.field628 * var5 + var4;
        int var7 = 0;
        int var8 = this.field685;
        int var9 = this.field684;
        int var10 = Pix2D.field628 - var9;
        int var11 = 0;
        if (arg1 != -48420) {
            return;
        }
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
            this.method213(var6, var9, var10, this.field683, this.field682, Pix2D.field627, var7, -126, var11, var8);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III[I[B[IIIII)V")
    private void method213(int arg0, int arg1, int arg2, int[] arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg1 >> 2);
        int var12 = -(arg1 & 0x3);
        while (arg7 >= 0) {
            this.field681 = -248;
        }
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg4[arg6++];
                if (var17 == 0) {
                    arg0++;
                } else {
                    arg5[arg0++] = arg3[var17 & 0xFF];
                }
                byte var18 = arg4[arg6++];
                if (var18 == 0) {
                    arg0++;
                } else {
                    arg5[arg0++] = arg3[var18 & 0xFF];
                }
                byte var19 = arg4[arg6++];
                if (var19 == 0) {
                    arg0++;
                } else {
                    arg5[arg0++] = arg3[var19 & 0xFF];
                }
                byte var20 = arg4[arg6++];
                if (var20 == 0) {
                    arg0++;
                } else {
                    arg5[arg0++] = arg3[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg4[arg6++];
                if (var16 == 0) {
                    arg0++;
                } else {
                    arg5[arg0++] = arg3[var16 & 0xFF];
                }
            }
            arg0 += arg2;
            arg6 += arg8;
        }
    }
}
