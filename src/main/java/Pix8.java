import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "A", descriptor = "Z")
    private boolean field670 = true;

    @OriginalMember(owner = "jb", name = "B", descriptor = "I")
    private int field671 = -567;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "jb", name = "J", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field673;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[B")
    public byte[] field672;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private static int field669 = 1000;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(field669, arg0.method299(arg1 + ".dat", null));
        Packet var5 = new Packet(field669, arg0.method299("index.dat", null));
        var5.field703 = var4.method231();
        this.field678 = var5.method231();
        this.field679 = var5.method231();
        int var6 = var5.method229();
        this.field673 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field673[var7 + 1] = var5.method233();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field703 += 2;
            var4.field703 += var5.method231() * var5.method231();
            var5.field703++;
        }
        this.field676 = var5.method229();
        this.field677 = var5.method229();
        this.field674 = var5.method231();
        this.field675 = var5.method231();
        int var9 = var5.method229();
        int var10 = this.field675 * this.field674;
        this.field672 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field672[var11] = var4.method230();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field674; var12++) {
                for (int var13 = 0; var13 < this.field675; var13++) {
                    this.field672[this.field674 * var13 + var12] = var4.method230();
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method194(int arg0) {
        this.field678 /= 2;
        this.field679 /= 2;
        byte[] var2 = new byte[this.field679 * this.field678];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field675; var4++) {
            for (int var6 = 0; var6 < this.field674; var6++) {
                var2[(this.field676 + var6 >> 1) + (this.field677 + var4 >> 1) * this.field678] = this.field672[var3++];
            }
        }
        this.field672 = var2;
        this.field674 = this.field678;
        this.field675 = this.field679;
        this.field676 = 0;
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field677 = 0;
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "(I)V")
    public void method195(int arg0) {
        if (this.field678 == this.field674 && this.field679 == this.field675) {
            return;
        }
        byte[] var2 = new byte[this.field679 * this.field678];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field675; var4++) {
            for (int var5 = 0; var5 < this.field674; var5++) {
                var2[(this.field677 + var4) * this.field678 + this.field676 + var5] = this.field672[var3++];
            }
        }
        this.field672 = var2;
        this.field674 = this.field678;
        this.field675 = this.field679;
        this.field676 = 0;
        this.field677 = 0;
        if (arg0 == -49794) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "e", descriptor = "(I)V")
    public void method196(int arg0) {
        byte[] var2 = new byte[this.field675 * this.field674];
        int var3 = 0;
        int var4 = 94 / arg0;
        for (int var5 = 0; var5 < this.field675; var5++) {
            for (int var6 = this.field674 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field672[this.field674 * var5 + var6];
            }
        }
        this.field672 = var2;
        this.field676 = this.field678 - this.field674 - this.field676;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Z)V")
    public void method197(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        byte[] var3 = new byte[this.field675 * this.field674];
        int var4 = 0;
        for (int var5 = this.field675 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field674; var6++) {
                var3[var4++] = this.field672[this.field674 * var5 + var6];
            }
        }
        this.field672 = var3;
        this.field677 = this.field679 - this.field675 - this.field677;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method198(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field673.length; var5++) {
            int var6 = this.field673[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field673[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field673[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field673[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg2 != 3) {
            this.field670 = !this.field670;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIZ)V")
    public void method199(int arg0, int arg1, boolean arg2) {
        int var4 = this.field676 + arg0;
        int var5 = this.field677 + arg1;
        int var6 = Pix2D.field621 * var5 + var4;
        int var7 = 0;
        int var8 = this.field675;
        int var9 = this.field674;
        int var10 = Pix2D.field621 - var9;
        int var11 = 0;
        if (arg2) {
            return;
        }
        if (var5 < Pix2D.field623) {
            int var12 = Pix2D.field623 - var5;
            var8 -= var12;
            var5 = Pix2D.field623;
            var7 += var9 * var12;
            var6 += Pix2D.field621 * var12;
        }
        if (var5 + var8 > Pix2D.field624) {
            var8 -= var5 + var8 - Pix2D.field624;
        }
        if (var4 < Pix2D.field625) {
            int var13 = Pix2D.field625 - var4;
            var9 -= var13;
            var4 = Pix2D.field625;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field626) {
            int var14 = var4 + var9 - Pix2D.field626;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method200(var9, Pix2D.field620, var6, var10, this.field672, var8, var11, 10230, var7, this.field673);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I[III[BIIII[I)V")
    private void method200(int arg0, int[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        int var11 = -(arg0 >> 2);
        int var12 = -(arg0 & 0x3);
        if (arg7 != 10230) {
            this.field670 = !this.field670;
        }
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg4[arg8++];
                if (var17 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg9[var17 & 0xFF];
                }
                byte var18 = arg4[arg8++];
                if (var18 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg9[var18 & 0xFF];
                }
                byte var19 = arg4[arg8++];
                if (var19 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg9[var19 & 0xFF];
                }
                byte var20 = arg4[arg8++];
                if (var20 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg9[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg4[arg8++];
                if (var16 == 0) {
                    arg2++;
                } else {
                    arg1[arg2++] = arg9[var16 & 0xFF];
                }
            }
            arg2 += arg3;
            arg8 += arg6;
        }
    }
}
