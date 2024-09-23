import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field665 = 584;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field666 = 4697;

    @OriginalMember(owner = "jb", name = "A", descriptor = "Z")
    private boolean field667 = false;

    @OriginalMember(owner = "jb", name = "B", descriptor = "Z")
    private boolean field668 = true;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "jb", name = "J", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field670;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[B")
    public byte[] field669;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet((byte) 3, arg0.method294(arg1 + ".dat", null));
        Packet var5 = new Packet((byte) 3, arg0.method294("index.dat", null));
        var5.field702 = var4.method226();
        this.field675 = var5.method226();
        this.field676 = var5.method226();
        int var6 = var5.method224();
        this.field670 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field670[var7 + 1] = var5.method228();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field702 += 2;
            var4.field702 += var5.method226() * var5.method226();
            var5.field702++;
        }
        this.field673 = var5.method224();
        this.field674 = var5.method224();
        this.field671 = var5.method226();
        this.field672 = var5.method226();
        int var9 = var5.method224();
        int var10 = this.field672 * this.field671;
        this.field669 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field669[var11] = var4.method225();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field671; var12++) {
                    for (int var13 = 0; var13 < this.field672; var13++) {
                        this.field669[this.field671 * var13 + var12] = var4.method225();
                    }
                }
            }
            if (Linkable.field360) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(Z)V")
    public void method193(boolean arg0) {
        this.field675 /= 2;
        this.field676 /= 2;
        byte[] var2 = new byte[this.field676 * this.field675];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field672; var4++) {
            for (int var5 = 0; var5 < this.field671; var5++) {
                var2[(this.field673 + var5 >> 1) + (this.field674 + var4 >> 1) * this.field675] = this.field669[var3++];
            }
        }
        this.field669 = var2;
        this.field671 = this.field675;
        this.field672 = this.field676;
        this.field673 = 0;
        if (arg0) {
            this.field674 = 0;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method194(byte arg0) {
        if (this.field675 == this.field671 && this.field676 == this.field672) {
            return;
        }
        byte[] var2 = new byte[this.field676 * this.field675];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field672; var4++) {
            for (int var5 = 0; var5 < this.field671; var5++) {
                var2[(this.field674 + var4) * this.field675 + this.field673 + var5] = this.field669[var3++];
            }
        }
        this.field669 = var2;
        if (arg0 == 103) {
            this.field671 = this.field675;
            this.field672 = this.field676;
            this.field673 = 0;
            this.field674 = 0;
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method195(int arg0) {
        byte[] var2 = new byte[this.field672 * this.field671];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field672; var4++) {
            for (int var5 = this.field671 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field669[this.field671 * var4 + var5];
            }
        }
        this.field669 = var2;
        this.field673 = this.field675 - this.field671 - this.field673;
        if (arg0 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method196(int arg0) {
        byte[] var2 = new byte[this.field672 * this.field671];
        int var3 = 0;
        for (int var4 = this.field672 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field671; var5++) {
                var2[var3++] = this.field669[this.field671 * var4 + var5];
            }
        }
        this.field669 = var2;
        this.field674 = this.field676 - this.field672 - this.field674;
        if (arg0 != -43068) {
            this.field668 = !this.field668;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIZI)V")
    public void method197(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field667 = !this.field667;
        }
        for (int var5 = 0; var5 < this.field670.length; var5++) {
            int var6 = this.field670[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field670[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field670[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field670[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method198(int arg0, int arg1, int arg2) {
        int var4 = this.field673 + arg1;
        int var5 = this.field674 + arg0;
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = Pix2D.field615 * var5 + var4;
        int var8 = 0;
        int var9 = this.field672;
        int var10 = this.field671;
        int var11 = Pix2D.field615 - var10;
        int var12 = 0;
        if (var5 < Pix2D.field617) {
            int var13 = Pix2D.field617 - var5;
            var9 -= var13;
            var5 = Pix2D.field617;
            var8 += var10 * var13;
            var7 += Pix2D.field615 * var13;
        }
        if (var5 + var9 > Pix2D.field618) {
            var9 -= var5 + var9 - Pix2D.field618;
        }
        if (var4 < Pix2D.field619) {
            int var14 = Pix2D.field619 - var4;
            var10 -= var14;
            var4 = Pix2D.field619;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field620) {
            int var15 = var4 + var10 - Pix2D.field620;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method199(this.field669, (byte) -84, Pix2D.field614, var10, this.field670, var11, var8, var7, var9, var12);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([BB[II[IIIIII)V")
    private void method199(byte[] arg0, byte arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != -84) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = -(arg3 >> 2);
        int var13 = -(arg3 & 0x3);
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                byte var18 = arg0[arg6++];
                if (var18 == 0) {
                    arg7++;
                } else {
                    arg2[arg7++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg0[arg6++];
                if (var19 == 0) {
                    arg7++;
                } else {
                    arg2[arg7++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg0[arg6++];
                if (var20 == 0) {
                    arg7++;
                } else {
                    arg2[arg7++] = arg4[var20 & 0xFF];
                }
                byte var21 = arg0[arg6++];
                if (var21 == 0) {
                    arg7++;
                } else {
                    arg2[arg7++] = arg4[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg0[arg6++];
                if (var17 == 0) {
                    arg7++;
                } else {
                    arg2[arg7++] = arg4[var17 & 0xFF];
                }
            }
            arg7 += arg5;
            arg6 += arg9;
        }
    }
}
