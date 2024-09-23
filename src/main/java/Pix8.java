import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private int field658 = 22986;

    @OriginalMember(owner = "kb", name = "y", descriptor = "Z")
    private boolean field659 = true;

    @OriginalMember(owner = "kb", name = "F", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "kb", name = "A", descriptor = "[I")
    public int[] field661;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "kb", name = "E", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "kb", name = "B", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "kb", name = "C", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "kb", name = "z", descriptor = "[B")
    public byte[] field660;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(699, arg0.method295(arg1 + ".dat", null));
        Packet var5 = new Packet(699, arg0.method295("index.dat", null));
        var5.field694 = var4.method233();
        this.field666 = var5.method233();
        this.field667 = var5.method233();
        int var6 = var5.method231();
        this.field661 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field661[var7 + 1] = var5.method235();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field694 += 2;
            var4.field694 += var5.method233() * var5.method233();
            var5.field694++;
        }
        this.field664 = var5.method231();
        this.field665 = var5.method231();
        this.field662 = var5.method233();
        this.field663 = var5.method233();
        int var9 = var5.method231();
        int var10 = this.field663 * this.field662;
        this.field660 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field660[var11] = var4.method232();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field662; var12++) {
                for (int var13 = 0; var13 < this.field663; var13++) {
                    this.field660[this.field662 * var13 + var12] = var4.method232();
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Z)V")
    public void method199(boolean arg0) {
        this.field666 /= 2;
        if (!arg0) {
            return;
        }
        this.field667 /= 2;
        byte[] var2 = new byte[this.field667 * this.field666];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field663; var4++) {
            for (int var5 = 0; var5 < this.field662; var5++) {
                var2[(this.field664 + var5 >> 1) + (this.field665 + var4 >> 1) * this.field666] = this.field660[var3++];
            }
        }
        this.field660 = var2;
        this.field662 = this.field666;
        this.field663 = this.field667;
        this.field664 = 0;
        this.field665 = 0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method200(int arg0) {
        if (this.field666 == this.field662 && this.field667 == this.field663) {
            return;
        }
        byte[] var2 = new byte[this.field667 * this.field666];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field663; var4++) {
            for (int var5 = 0; var5 < this.field662; var5++) {
                var2[(this.field665 + var4) * this.field666 + this.field664 + var5] = this.field660[var3++];
            }
        }
        if (arg0 != 0) {
            return;
        }
        this.field660 = var2;
        this.field662 = this.field666;
        this.field663 = this.field667;
        this.field664 = 0;
        this.field665 = 0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)V")
    public void method201(byte arg0) {
        byte[] var2 = new byte[this.field663 * this.field662];
        int var3 = 0;
        if (arg0 != 123) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < this.field663; var5++) {
            for (int var6 = this.field662 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field660[this.field662 * var5 + var6];
            }
        }
        this.field660 = var2;
        this.field664 = this.field666 - this.field662 - this.field664;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method202(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        byte[] var3 = new byte[this.field663 * this.field662];
        int var4 = 0;
        for (int var5 = this.field663 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field662; var6++) {
                var3[var4++] = this.field660[this.field662 * var5 + var6];
            }
        }
        this.field660 = var3;
        this.field665 = this.field667 - this.field663 - this.field665;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII)V")
    public void method203(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field661.length; var5++) {
            int var6 = this.field661[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field661[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field661[var5] & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field661[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III)V")
    public void method204(int arg0, int arg1, int arg2) {
        int var4 = this.field664 + arg0;
        int var5 = 63 / arg2;
        int var6 = this.field665 + arg1;
        int var7 = Pix2D.field609 * var6 + var4;
        int var8 = 0;
        int var9 = this.field663;
        int var10 = this.field662;
        int var11 = Pix2D.field609 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field611) {
            int var13 = Pix2D.field611 - var6;
            var9 -= var13;
            var6 = Pix2D.field611;
            var8 += var10 * var13;
            var7 += Pix2D.field609 * var13;
        }
        if (var6 + var9 > Pix2D.field612) {
            var9 -= var6 + var9 - Pix2D.field612;
        }
        if (var4 < Pix2D.field613) {
            int var14 = Pix2D.field613 - var4;
            var10 -= var14;
            var4 = Pix2D.field613;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field614) {
            int var15 = var4 + var10 - Pix2D.field614;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method205((byte) 115, Pix2D.field608, var9, this.field660, var7, var8, var10, this.field661, var11, var12);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B[II[BIII[III)V")
    private void method205(byte arg0, int[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        int var11 = -(arg6 >> 2);
        int var12 = -(arg6 & 0x3);
        if (arg0 != 115) {
            return;
        }
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg3[arg5++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg7[var17 & 0xFF];
                }
                byte var18 = arg3[arg5++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg7[var18 & 0xFF];
                }
                byte var19 = arg3[arg5++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg7[var19 & 0xFF];
                }
                byte var20 = arg3[arg5++];
                if (var20 == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg7[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg3[arg5++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg7[var16 & 0xFF];
                }
            }
            arg4 += arg8;
            arg5 += arg9;
        }
    }
}
