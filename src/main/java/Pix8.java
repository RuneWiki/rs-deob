import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "v", descriptor = "I")
    private int field669 = 4;

    @OriginalMember(owner = "jb", name = "w", descriptor = "I")
    private int field670 = 19987;

    @OriginalMember(owner = "jb", name = "x", descriptor = "B")
    private byte field671 = -37;

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field672 = 8;

    @OriginalMember(owner = "jb", name = "z", descriptor = "Z")
    private boolean field673 = false;

    @OriginalMember(owner = "jb", name = "A", descriptor = "Z")
    private boolean field674 = false;

    @OriginalMember(owner = "jb", name = "B", descriptor = "I")
    private int field675 = -760;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "jb", name = "J", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field677;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[B")
    public byte[] field676;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), 58);
        Packet var5 = new Packet(arg0.method299("index.dat", null), 58);
        var5.field711 = var4.method231();
        this.field682 = var5.method231();
        this.field683 = var5.method231();
        int var6 = var5.method229();
        this.field677 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field677[var7 + 1] = var5.method233();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field711 += 2;
            var4.field711 += var5.method231() * var5.method231();
            var5.field711++;
        }
        this.field680 = var5.method229();
        this.field681 = var5.method229();
        this.field678 = var5.method231();
        this.field679 = var5.method231();
        int var9 = var5.method229();
        int var10 = this.field679 * this.field678;
        this.field676 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field676[var11] = var4.method230();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field678; var12++) {
                for (int var13 = 0; var13 < this.field679; var13++) {
                    this.field676[this.field678 * var13 + var12] = var4.method230();
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(Z)V")
    public void method194(boolean arg0) {
        this.field682 /= 2;
        this.field683 /= 2;
        byte[] var2 = new byte[this.field683 * this.field682];
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        for (int var5 = 0; var5 < this.field679; var5++) {
            for (int var6 = 0; var6 < this.field678; var6++) {
                var2[(this.field680 + var6 >> 1) + (this.field681 + var5 >> 1) * this.field682] = this.field676[var4++];
            }
        }
        this.field676 = var2;
        this.field678 = this.field682;
        this.field679 = this.field683;
        this.field680 = 0;
        this.field681 = 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I)V")
    public void method195(int arg0) {
        if (this.field682 == this.field678 && this.field683 == this.field679) {
            return;
        }
        byte[] var2 = new byte[this.field683 * this.field682];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field679; var4++) {
            for (int var5 = 0; var5 < this.field678; var5++) {
                var2[(this.field681 + var4) * this.field682 + this.field680 + var5] = this.field676[var3++];
            }
        }
        this.field676 = var2;
        this.field678 = this.field682;
        this.field679 = this.field683;
        this.field680 = 0;
        if (arg0 < 0) {
            this.field681 = 0;
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method196(int arg0) {
        byte[] var2 = new byte[this.field679 * this.field678];
        if (arg0 != -3417) {
            this.field670 = -483;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field679; var4++) {
            for (int var5 = this.field678 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field676[this.field678 * var4 + var5];
            }
        }
        this.field676 = var2;
        this.field680 = this.field682 - this.field678 - this.field680;
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "(Z)V")
    public void method197(boolean arg0) {
        if (arg0) {
            return;
        }
        byte[] var2 = new byte[this.field679 * this.field678];
        int var3 = 0;
        for (int var4 = this.field679 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field678; var5++) {
                var2[var3++] = this.field676[this.field678 * var4 + var5];
            }
        }
        this.field676 = var2;
        this.field681 = this.field683 - this.field679 - this.field681;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method198(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -45258) {
            this.field673 = !this.field673;
        }
        for (int var5 = 0; var5 < this.field677.length; var5++) {
            int var6 = this.field677[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field677[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field677[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field677[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ZII)V")
    public void method199(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field670 = -278;
        }
        int var4 = this.field680 + arg1;
        int var5 = this.field681 + arg2;
        int var6 = Pix2D.field620 * var5 + var4;
        int var7 = 0;
        int var8 = this.field679;
        int var9 = this.field678;
        int var10 = Pix2D.field620 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field622) {
            int var12 = Pix2D.field622 - var5;
            var8 -= var12;
            var5 = Pix2D.field622;
            var7 += var9 * var12;
            var6 += Pix2D.field620 * var12;
        }
        if (var5 + var8 > Pix2D.field623) {
            var8 -= var5 + var8 - Pix2D.field623;
        }
        if (var4 < Pix2D.field624) {
            int var13 = Pix2D.field624 - var4;
            var9 -= var13;
            var4 = Pix2D.field624;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field625) {
            int var14 = var4 + var9 - Pix2D.field625;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method200(var10, Pix2D.field619, var7, var9, var8, var11, var6, this.field677, -96, this.field676);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I[IIIIII[II[B)V")
    private void method200(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, byte[] arg9) {
        int var11 = -(arg3 >> 2);
        int var12 = -(arg3 & 0x3);
        if (arg8 >= 0) {
            return;
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg9[arg2++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg7[var17 & 0xFF];
                }
                byte var18 = arg9[arg2++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg7[var18 & 0xFF];
                }
                byte var19 = arg9[arg2++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg7[var19 & 0xFF];
                }
                byte var20 = arg9[arg2++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg7[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg9[arg2++];
                if (var16 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg7[var16 & 0xFF];
                }
            }
            arg6 += arg0;
            arg2 += arg5;
        }
    }
}
