import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field678 = 11239;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field679 = 160;

    @OriginalMember(owner = "jb", name = "A", descriptor = "Z")
    private boolean field680 = true;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field682;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "jb", name = "B", descriptor = "[B")
    public byte[] field681;

    @OriginalMember(owner = "jb", name = "x", descriptor = "Z")
    private static boolean field677;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), field677);
        Packet var5 = new Packet(arg0.method299("index.dat", null), field677);
        var5.field712 = var4.method231();
        this.field687 = var5.method231();
        this.field688 = var5.method231();
        int var6 = var5.method229();
        this.field682 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field682[var7 + 1] = var5.method233();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field712 += 2;
            var4.field712 += var5.method231() * var5.method231();
            var5.field712++;
        }
        this.field685 = var5.method229();
        this.field686 = var5.method229();
        this.field683 = var5.method231();
        this.field684 = var5.method231();
        int var9 = var5.method229();
        int var10 = this.field684 * this.field683;
        this.field681 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field681[var11] = var4.method230();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field683; var12++) {
                for (int var13 = 0; var13 < this.field684; var13++) {
                    this.field681[this.field683 * var13 + var12] = var4.method230();
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(B)V")
    public void method194(byte arg0) {
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field687 /= 2;
        this.field688 /= 2;
        byte[] var3 = new byte[this.field688 * this.field687];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field684; var5++) {
            for (int var6 = 0; var6 < this.field683; var6++) {
                var3[(this.field685 + var6 >> 1) + (this.field686 + var5 >> 1) * this.field687] = this.field681[var4++];
            }
        }
        this.field681 = var3;
        this.field683 = this.field687;
        this.field684 = this.field688;
        this.field685 = 0;
        this.field686 = 0;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method195(int arg0) {
        if (this.field687 == this.field683 && this.field688 == this.field684) {
            return;
        }
        byte[] var2 = new byte[this.field688 * this.field687];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field684; var4++) {
            for (int var6 = 0; var6 < this.field683; var6++) {
                var2[(this.field686 + var4) * this.field687 + this.field685 + var6] = this.field681[var3++];
            }
        }
        int var5 = 45 / arg0;
        this.field681 = var2;
        this.field683 = this.field687;
        this.field684 = this.field688;
        this.field685 = 0;
        this.field686 = 0;
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method196(int arg0) {
        byte[] var2 = new byte[this.field684 * this.field683];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field684; var4++) {
            for (int var5 = this.field683 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field681[this.field683 * var4 + var5];
            }
        }
        this.field681 = var2;
        if (arg0 == 4) {
            this.field685 = this.field687 - this.field683 - this.field685;
        }
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "(I)V")
    public void method197(int arg0) {
        byte[] var2 = new byte[this.field684 * this.field683];
        int var3 = 0;
        if (arg0 >= 0) {
            this.field680 = !this.field680;
        }
        for (int var4 = this.field684 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field683; var5++) {
                var2[var3++] = this.field681[this.field683 * var4 + var5];
            }
        }
        this.field681 = var2;
        this.field686 = this.field688 - this.field684 - this.field686;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(BIII)V")
    public void method198(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 3) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < this.field682.length; var7++) {
            int var8 = this.field682[var7] >> 16 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field682[var7] >> 8 & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            int var12 = this.field682[var7] & 0xFF;
            int var13 = arg1 + var12;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 255) {
                var13 = 255;
            }
            this.field682[var7] = (var9 << 16) + (var11 << 8) + var13;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIZ)V")
    public void method199(int arg0, int arg1, boolean arg2) {
        int var4 = this.field685 + arg0;
        int var5 = this.field686 + arg1;
        if (arg2) {
            this.field680 = !this.field680;
        }
        int var6 = Pix2D.field628 * var5 + var4;
        int var7 = 0;
        int var8 = this.field684;
        int var9 = this.field683;
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
            this.method200(this.field682, var10, var8, true, var7, var6, var9, this.field681, var11, Pix2D.field627);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([IIIZIII[BI[I)V")
    private void method200(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int[] arg9) {
        if (!arg3) {
            return;
        }
        int var11 = -(arg6 >> 2);
        int var12 = -(arg6 & 0x3);
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg7[arg4++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var17 & 0xFF];
                }
                byte var18 = arg7[arg4++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var18 & 0xFF];
                }
                byte var19 = arg7[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var19 & 0xFF];
                }
                byte var20 = arg7[arg4++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg7[arg4++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var16 & 0xFF];
                }
            }
            arg5 += arg1;
            arg4 += arg8;
        }
    }
}
