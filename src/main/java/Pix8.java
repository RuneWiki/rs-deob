import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "kb", name = "y", descriptor = "Z")
    private boolean field665 = true;

    @OriginalMember(owner = "kb", name = "A", descriptor = "I")
    private int field667 = 945;

    @OriginalMember(owner = "kb", name = "B", descriptor = "I")
    private int field668 = -66;

    @OriginalMember(owner = "kb", name = "C", descriptor = "I")
    private int field669 = 1;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    private int field670 = -902;

    @OriginalMember(owner = "kb", name = "K", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "kb", name = "L", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "kb", name = "F", descriptor = "[I")
    public int[] field672;

    @OriginalMember(owner = "kb", name = "I", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "kb", name = "J", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "kb", name = "H", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "kb", name = "E", descriptor = "[B")
    public byte[] field671;

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private int field664;

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), true);
        Packet var5 = new Packet(arg0.method299("index.dat", null), true);
        var5.field698 = var4.method233();
        this.field677 = var5.method233();
        this.field678 = var5.method233();
        int var6 = var5.method231();
        this.field672 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field672[var7 + 1] = var5.method235();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field698 += 2;
            var4.field698 += var5.method233() * var5.method233();
            var5.field698++;
        }
        this.field675 = var5.method231();
        this.field676 = var5.method231();
        this.field673 = var5.method233();
        this.field674 = var5.method233();
        int var9 = var5.method231();
        int var10 = this.field674 * this.field673;
        this.field671 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field671[var11] = var4.method232();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field673; var12++) {
                for (int var13 = 0; var13 < this.field674; var13++) {
                    this.field671[this.field673 * var13 + var12] = var4.method232();
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method199(int arg0) {
        this.field677 /= 2;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field678 /= 2;
        byte[] var3 = new byte[this.field678 * this.field677];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field674; var5++) {
            for (int var6 = 0; var6 < this.field673; var6++) {
                var3[(this.field675 + var6 >> 1) + (this.field676 + var5 >> 1) * this.field677] = this.field671[var4++];
            }
        }
        this.field671 = var3;
        this.field673 = this.field677;
        this.field674 = this.field678;
        this.field675 = 0;
        this.field676 = 0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Z)V")
    public void method200(boolean arg0) {
        if (this.field677 == this.field673 && this.field678 == this.field674) {
            return;
        }
        byte[] var2 = new byte[this.field678 * this.field677];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field674; var4++) {
            for (int var6 = 0; var6 < this.field673; var6++) {
                var2[(this.field676 + var4) * this.field677 + this.field675 + var6] = this.field671[var3++];
            }
        }
        this.field671 = var2;
        this.field673 = this.field677;
        this.field674 = this.field678;
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field675 = 0;
        this.field676 = 0;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method201(int arg0) {
        byte[] var2 = new byte[this.field674 * this.field673];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field674; var4++) {
            for (int var5 = this.field673 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field671[this.field673 * var4 + var5];
            }
        }
        this.field671 = var2;
        this.field675 = this.field677 - this.field673 - this.field675;
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(I)V")
    public void method202(int arg0) {
        byte[] var2 = new byte[this.field674 * this.field673];
        if (arg0 != -21472) {
            this.field664 = 234;
        }
        int var3 = 0;
        for (int var4 = this.field674 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field673; var5++) {
                var2[var3++] = this.field671[this.field673 * var4 + var5];
            }
        }
        this.field671 = var2;
        this.field676 = this.field678 - this.field674 - this.field676;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IBII)V")
    public void method203(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 3) {
            boolean var5 = false;
        } else {
            this.field666 = 40;
        }
        for (int var6 = 0; var6 < this.field672.length; var6++) {
            int var7 = this.field672[var6] >> 16 & 0xFF;
            int var8 = arg0 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field672[var6] >> 8 & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field672[var6] & 0xFF;
            int var12 = arg3 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field672[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III)V")
    public void method204(int arg0, int arg1, int arg2) {
        int var4 = this.field675 + arg2;
        int var5 = 58 / arg1;
        int var6 = this.field676 + arg0;
        int var7 = Pix2D.field617 * var6 + var4;
        int var8 = 0;
        int var9 = this.field674;
        int var10 = this.field673;
        int var11 = Pix2D.field617 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field619) {
            int var13 = Pix2D.field619 - var6;
            var9 -= var13;
            var6 = Pix2D.field619;
            var8 += var10 * var13;
            var7 += Pix2D.field617 * var13;
        }
        if (var6 + var9 > Pix2D.field620) {
            var9 -= var6 + var9 - Pix2D.field620;
        }
        if (var4 < Pix2D.field621) {
            int var14 = Pix2D.field621 - var4;
            var10 -= var14;
            var4 = Pix2D.field621;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field622) {
            int var15 = var4 + var10 - Pix2D.field622;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method205(var10, this.field671, var11, var12, 0, Pix2D.field616, var7, var9, this.field672, var8);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[BIII[III[II)V")
    private void method205(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int[] arg8, int arg9) {
        int var11 = -(arg0 >> 2);
        int var12 = -(arg0 & 0x3);
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg1[arg9++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg8[var17 & 0xFF];
                }
                byte var18 = arg1[arg9++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg8[var18 & 0xFF];
                }
                byte var19 = arg1[arg9++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg8[var19 & 0xFF];
                }
                byte var20 = arg1[arg9++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg8[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg1[arg9++];
                if (var16 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg8[var16 & 0xFF];
                }
            }
            arg6 += arg2;
            arg9 += arg3;
        }
        if (arg4 != 0) {
            this.field665 = !this.field665;
        }
    }
}
