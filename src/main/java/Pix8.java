import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "B", descriptor = "Z")
    private boolean field676 = true;

    @OriginalMember(owner = "jb", name = "C", descriptor = "B")
    private byte field677 = 5;

    @OriginalMember(owner = "jb", name = "D", descriptor = "Z")
    private boolean field678 = true;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    private int field679 = 465;

    @OriginalMember(owner = "jb", name = "L", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "jb", name = "M", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "jb", name = "G", descriptor = "[I")
    public int[] field681;

    @OriginalMember(owner = "jb", name = "J", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "jb", name = "K", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "jb", name = "F", descriptor = "[B")
    public byte[] field680;

    @OriginalMember(owner = "jb", name = "A", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), (byte) -93);
        Packet var5 = new Packet(arg0.method299("index.dat", null), (byte) -93);
        var5.field713 = var4.method231();
        this.field686 = var5.method231();
        this.field687 = var5.method231();
        int var6 = var5.method229();
        this.field681 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field681[var7 + 1] = var5.method233();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field713 += 2;
            var4.field713 += var5.method231() * var5.method231();
            var5.field713++;
        }
        this.field684 = var5.method229();
        this.field685 = var5.method229();
        this.field682 = var5.method231();
        this.field683 = var5.method231();
        int var9 = var5.method229();
        int var10 = this.field683 * this.field682;
        this.field680 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field680[var11] = var4.method230();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field682; var12++) {
                for (int var13 = 0; var13 < this.field683; var13++) {
                    this.field680[this.field682 * var13 + var12] = var4.method230();
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(Z)V")
    public void method194(boolean arg0) {
        this.field686 /= 2;
        this.field687 /= 2;
        byte[] var2 = new byte[this.field687 * this.field686];
        int var3 = 0;
        if (!arg0) {
            return;
        }
        for (int var4 = 0; var4 < this.field683; var4++) {
            for (int var5 = 0; var5 < this.field682; var5++) {
                var2[(this.field684 + var5 >> 1) + (this.field685 + var4 >> 1) * this.field686] = this.field680[var3++];
            }
        }
        this.field680 = var2;
        this.field682 = this.field686;
        this.field683 = this.field687;
        this.field684 = 0;
        this.field685 = 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method195(byte arg0) {
        if (this.field686 == this.field682 && this.field687 == this.field683) {
            return;
        }
        byte[] var2 = new byte[this.field687 * this.field686];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field683; var4++) {
            for (int var6 = 0; var6 < this.field682; var6++) {
                var2[(this.field685 + var4) * this.field686 + this.field684 + var6] = this.field680[var3++];
            }
        }
        this.field680 = var2;
        this.field682 = this.field686;
        if (arg0 != 7) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field683 = this.field687;
        this.field684 = 0;
        this.field685 = 0;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method196(int arg0) {
        byte[] var2 = new byte[this.field683 * this.field682];
        int var3 = 0;
        if (arg0 < 1 || arg0 > 1) {
            this.field675 = -81;
        }
        for (int var4 = 0; var4 < this.field683; var4++) {
            for (int var5 = this.field682 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field680[this.field682 * var4 + var5];
            }
        }
        this.field680 = var2;
        this.field684 = this.field686 - this.field682 - this.field684;
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method197(int arg0) {
        byte[] var2 = new byte[this.field683 * this.field682];
        if (arg0 <= 0) {
            return;
        }
        int var3 = 0;
        for (int var4 = this.field683 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field682; var5++) {
                var2[var3++] = this.field680[this.field682 * var4 + var5];
            }
        }
        this.field680 = var2;
        this.field685 = this.field687 - this.field683 - this.field685;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method198(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 3 || arg2 > 3) {
            this.field676 = !this.field676;
        }
        for (int var5 = 0; var5 < this.field681.length; var5++) {
            int var6 = this.field681[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field681[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field681[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field681[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method199(int arg0, int arg1, int arg2) {
        int var4 = this.field684 + arg0;
        int var5 = this.field685 + arg2;
        int var6 = Pix2D.field622 * var5 + var4;
        int var7 = 0;
        int var8 = this.field683;
        int var9 = this.field682;
        int var10 = Pix2D.field622 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field624) {
            int var12 = Pix2D.field624 - var5;
            var8 -= var12;
            var5 = Pix2D.field624;
            var7 += var9 * var12;
            var6 += Pix2D.field622 * var12;
        }
        if (var5 + var8 > Pix2D.field625) {
            var8 -= var5 + var8 - Pix2D.field625;
        }
        if (var4 < Pix2D.field626) {
            int var13 = Pix2D.field626 - var4;
            var9 -= var13;
            var4 = Pix2D.field626;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field627) {
            int var14 = var4 + var9 - Pix2D.field627;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        this.method200(this.field680, var8, false, var6, this.field681, var7, Pix2D.field621, var11, var10, var9);
        if (arg1 != 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([BIZI[II[IIII)V")
    private void method200(byte[] arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg9 >> 2);
        int var12 = -(arg9 & 0x3);
        if (arg2) {
            this.field679 = 118;
        }
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg0[arg5++];
                if (var17 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var17 & 0xFF];
                }
                byte var18 = arg0[arg5++];
                if (var18 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg0[arg5++];
                if (var19 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg0[arg5++];
                if (var20 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg0[arg5++];
                if (var16 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var16 & 0xFF];
                }
            }
            arg3 += arg8;
            arg5 += arg7;
        }
    }
}
