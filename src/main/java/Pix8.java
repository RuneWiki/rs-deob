import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "w", descriptor = "Z")
    private boolean field671 = false;

    @OriginalMember(owner = "jb", name = "x", descriptor = "Z")
    private boolean field672 = false;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field674 = 9;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "jb", name = "B", descriptor = "[I")
    public int[] field676;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "jb", name = "C", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "jb", name = "A", descriptor = "[B")
    public byte[] field675;

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method298(arg1 + ".dat", null), true);
        Packet var5 = new Packet(arg0.method298("index.dat", null), true);
        var5.field714 = var4.method230();
        this.field681 = var5.method230();
        this.field682 = var5.method230();
        int var6 = var5.method228();
        this.field676 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field676[var7 + 1] = var5.method232();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field714 += 2;
            var4.field714 += var5.method230() * var5.method230();
            var5.field714++;
        }
        this.field679 = var5.method228();
        this.field680 = var5.method228();
        this.field677 = var5.method230();
        this.field678 = var5.method230();
        int var9 = var5.method228();
        int var10 = this.field678 * this.field677;
        this.field675 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field675[var11] = var4.method229();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field677; var12++) {
                for (int var13 = 0; var13 < this.field678; var13++) {
                    this.field675[this.field677 * var13 + var12] = var4.method229();
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Z)V")
    public void method193(boolean arg0) {
        this.field681 /= 2;
        this.field682 /= 2;
        byte[] var2 = new byte[this.field682 * this.field681];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field678; var4++) {
            for (int var5 = 0; var5 < this.field677; var5++) {
                var2[(this.field679 + var5 >> 1) + (this.field680 + var4 >> 1) * this.field681] = this.field675[var3++];
            }
        }
        this.field675 = var2;
        this.field677 = this.field681;
        this.field678 = this.field682;
        if (arg0) {
            this.field679 = 0;
            this.field680 = 0;
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method194(int arg0) {
        if (this.field681 == this.field677 && this.field682 == this.field678) {
            return;
        }
        byte[] var2 = new byte[this.field682 * this.field681];
        int var3 = 0;
        if (arg0 < this.field674 || arg0 > this.field674) {
            this.field673 = 393;
        }
        for (int var4 = 0; var4 < this.field678; var4++) {
            for (int var5 = 0; var5 < this.field677; var5++) {
                var2[(this.field680 + var4) * this.field681 + this.field679 + var5] = this.field675[var3++];
            }
        }
        this.field675 = var2;
        this.field677 = this.field681;
        this.field678 = this.field682;
        this.field679 = 0;
        this.field680 = 0;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(Z)V")
    public void method195(boolean arg0) {
        byte[] var2 = new byte[this.field678 * this.field677];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field678; var4++) {
            for (int var6 = this.field677 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field675[this.field677 * var4 + var6];
            }
        }
        this.field675 = var2;
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field679 = this.field681 - this.field677 - this.field679;
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "(I)V")
    public void method196(int arg0) {
        byte[] var2 = new byte[this.field678 * this.field677];
        int var3 = 0;
        for (int var4 = this.field678 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field677; var5++) {
                var2[var3++] = this.field675[this.field677 * var4 + var5];
            }
        }
        if (arg0 >= 0) {
            this.field672 = !this.field672;
        }
        this.field675 = var2;
        this.field680 = this.field682 - this.field678 - this.field680;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIB)V")
    public void method197(int arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < this.field676.length; var5++) {
            int var6 = this.field676[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field676[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field676[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field676[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3 == -38) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(BII)V")
    public void method198(byte arg0, int arg1, int arg2) {
        int var4 = this.field679 + arg1;
        int var5 = this.field680 + arg2;
        int var6 = Pix2D.field622 * var5 + var4;
        int var7 = 0;
        if (arg0 == 0) {
            boolean var8 = false;
        } else {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = this.field678;
        int var11 = this.field677;
        int var12 = Pix2D.field622 - var11;
        int var13 = 0;
        if (var5 < Pix2D.field624) {
            int var14 = Pix2D.field624 - var5;
            var10 -= var14;
            var5 = Pix2D.field624;
            var7 += var11 * var14;
            var6 += Pix2D.field622 * var14;
        }
        if (var5 + var10 > Pix2D.field625) {
            var10 -= var5 + var10 - Pix2D.field625;
        }
        if (var4 < Pix2D.field626) {
            int var15 = Pix2D.field626 - var4;
            var11 -= var15;
            var4 = Pix2D.field626;
            var7 += var15;
            var6 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var4 + var11 > Pix2D.field627) {
            int var16 = var4 + var11 - Pix2D.field627;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method199(this.field676, var11, this.field675, var6, true, var12, var10, Pix2D.field621, var7, var13);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([II[BIZII[III)V")
    private void method199(int[] arg0, int arg1, byte[] arg2, int arg3, boolean arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        if (!arg4) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = -(arg1 >> 2);
        int var13 = -(arg1 & 0x3);
        for (int var14 = -arg6; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                byte var18 = arg2[arg8++];
                if (var18 == 0) {
                    arg3++;
                } else {
                    arg7[arg3++] = arg0[var18 & 0xFF];
                }
                byte var19 = arg2[arg8++];
                if (var19 == 0) {
                    arg3++;
                } else {
                    arg7[arg3++] = arg0[var19 & 0xFF];
                }
                byte var20 = arg2[arg8++];
                if (var20 == 0) {
                    arg3++;
                } else {
                    arg7[arg3++] = arg0[var20 & 0xFF];
                }
                byte var21 = arg2[arg8++];
                if (var21 == 0) {
                    arg3++;
                } else {
                    arg7[arg3++] = arg0[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg2[arg8++];
                if (var17 == 0) {
                    arg3++;
                } else {
                    arg7[arg3++] = arg0[var17 & 0xFF];
                }
            }
            arg3 += arg5;
            arg8 += arg9;
        }
    }
}
