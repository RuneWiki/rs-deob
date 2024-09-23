import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "w", descriptor = "Z")
    private boolean field674 = false;

    @OriginalMember(owner = "jb", name = "x", descriptor = "Z")
    private boolean field675 = false;

    @OriginalMember(owner = "jb", name = "z", descriptor = "Z")
    private boolean field677 = true;

    @OriginalMember(owner = "jb", name = "A", descriptor = "Z")
    private boolean field678 = false;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field680;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "jb", name = "B", descriptor = "[B")
    public byte[] field679;

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), -26728);
        Packet var5 = new Packet(arg0.method299("index.dat", null), -26728);
        var5.field717 = var4.method231();
        this.field685 = var5.method231();
        this.field686 = var5.method231();
        int var6 = var5.method229();
        this.field680 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field680[var7 + 1] = var5.method233();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field717 += 2;
            var4.field717 += var5.method231() * var5.method231();
            var5.field717++;
        }
        this.field683 = var5.method229();
        this.field684 = var5.method229();
        this.field681 = var5.method231();
        this.field682 = var5.method231();
        int var9 = var5.method229();
        int var10 = this.field682 * this.field681;
        this.field679 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field679[var11] = var4.method230();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field681; var12++) {
                for (int var13 = 0; var13 < this.field682; var13++) {
                    this.field679[this.field681 * var13 + var12] = var4.method230();
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method194(int arg0) {
        this.field685 /= 2;
        this.field686 /= 2;
        byte[] var2 = new byte[this.field686 * this.field685];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field682; var4++) {
            for (int var5 = 0; var5 < this.field681; var5++) {
                var2[(this.field683 + var5 >> 1) + (this.field684 + var4 >> 1) * this.field685] = this.field679[var3++];
            }
        }
        this.field679 = var2;
        this.field681 = this.field685;
        this.field682 = this.field686;
        this.field683 = 0;
        if (arg0 != 34694) {
            this.field676 = 378;
        }
        this.field684 = 0;
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method195(int arg0) {
        if (this.field685 == this.field681 && this.field686 == this.field682) {
            return;
        }
        byte[] var2 = new byte[this.field686 * this.field685];
        if (arg0 != 2) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field682; var4++) {
            for (int var5 = 0; var5 < this.field681; var5++) {
                var2[(this.field684 + var4) * this.field685 + this.field683 + var5] = this.field679[var3++];
            }
        }
        this.field679 = var2;
        this.field681 = this.field685;
        this.field682 = this.field686;
        this.field683 = 0;
        this.field684 = 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method196(byte arg0) {
        if (arg0 != -72) {
            this.field678 = !this.field678;
        }
        byte[] var2 = new byte[this.field682 * this.field681];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field682; var4++) {
            for (int var5 = this.field681 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field679[this.field681 * var4 + var5];
            }
        }
        this.field679 = var2;
        this.field683 = this.field685 - this.field681 - this.field683;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(B)V")
    public void method197(byte arg0) {
        byte[] var2 = new byte[this.field682 * this.field681];
        int var3 = 0;
        if (arg0 != -107) {
            return;
        }
        for (int var4 = this.field682 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field681; var5++) {
                var2[var3++] = this.field679[this.field681 * var4 + var5];
            }
        }
        this.field679 = var2;
        this.field684 = this.field686 - this.field682 - this.field684;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method198(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field680.length; var5++) {
            int var6 = this.field680[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field680[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field680[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field680[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3 != 0) {
            this.field676 = -441;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method199(int arg0, int arg1, int arg2) {
        int var4 = this.field683 + arg0;
        if (arg2 != 37651) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field684 + arg1;
        int var7 = Pix2D.field622 * var6 + var4;
        int var8 = 0;
        int var9 = this.field682;
        int var10 = this.field681;
        int var11 = Pix2D.field622 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field624) {
            int var13 = Pix2D.field624 - var6;
            var9 -= var13;
            var6 = Pix2D.field624;
            var8 += var10 * var13;
            var7 += Pix2D.field622 * var13;
        }
        if (var6 + var9 > Pix2D.field625) {
            var9 -= var6 + var9 - Pix2D.field625;
        }
        if (var4 < Pix2D.field626) {
            int var14 = Pix2D.field626 - var4;
            var10 -= var14;
            var4 = Pix2D.field626;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field627) {
            int var15 = var4 + var10 - Pix2D.field627;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method200(var11, Pix2D.field621, this.field680, this.field679, (byte) 94, var10, var7, var12, var8, var9);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I[I[I[BBIIIII)V")
    private void method200(int arg0, int[] arg1, int[] arg2, byte[] arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg5 >> 2);
        int var12 = -(arg5 & 0x3);
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg3[arg8++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg3[arg8++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg3[arg8++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg3[arg8++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg2[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg3[arg8++];
                if (var16 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg2[var16 & 0xFF];
                }
            }
            arg6 += arg0;
            arg8 += arg7;
        }
        if (arg4 == 94) {
            ;
        }
    }
}
