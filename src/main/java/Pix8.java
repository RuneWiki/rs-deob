import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field681 = -971;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field682 = -182;

    @OriginalMember(owner = "jb", name = "A", descriptor = "Z")
    private boolean field683 = false;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field685;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "jb", name = "B", descriptor = "[B")
    public byte[] field684;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(false, arg0.method299(arg1 + ".dat", null));
        Packet var5 = new Packet(false, arg0.method299("index.dat", null));
        var5.field716 = var4.method231();
        this.field690 = var5.method231();
        this.field691 = var5.method231();
        int var6 = var5.method229();
        this.field685 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field685[var7 + 1] = var5.method233();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field716 += 2;
            var4.field716 += var5.method231() * var5.method231();
            var5.field716++;
        }
        this.field688 = var5.method229();
        this.field689 = var5.method229();
        this.field686 = var5.method231();
        this.field687 = var5.method231();
        int var9 = var5.method229();
        int var10 = this.field687 * this.field686;
        this.field684 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field684[var11] = var4.method230();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field686; var12++) {
                for (int var13 = 0; var13 < this.field687; var13++) {
                    this.field684[this.field686 * var13 + var12] = var4.method230();
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method194(byte arg0) {
        this.field690 /= 2;
        this.field691 /= 2;
        byte[] var2 = new byte[this.field691 * this.field690];
        int var3 = 0;
        if (arg0 == 8) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field687; var6++) {
            for (int var7 = 0; var7 < this.field686; var7++) {
                var2[(this.field688 + var7 >> 1) + (this.field689 + var6 >> 1) * this.field690] = this.field684[var3++];
            }
        }
        this.field684 = var2;
        this.field686 = this.field690;
        this.field687 = this.field691;
        this.field688 = 0;
        this.field689 = 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Z)V")
    public void method195(boolean arg0) {
        if (this.field690 == this.field686 && this.field691 == this.field687) {
            return;
        }
        byte[] var2 = new byte[this.field691 * this.field690];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field687; var4++) {
            for (int var5 = 0; var5 < this.field686; var5++) {
                var2[(this.field689 + var4) * this.field690 + this.field688 + var5] = this.field684[var3++];
            }
        }
        this.field684 = var2;
        this.field686 = this.field690;
        this.field687 = this.field691;
        this.field688 = 0;
        this.field689 = 0;
        if (!arg0) {
            this.field681 = -59;
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(Z)V")
    public void method196(boolean arg0) {
        byte[] var2 = new byte[this.field687 * this.field686];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field687; var4++) {
            for (int var5 = this.field686 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field684[this.field686 * var4 + var5];
            }
        }
        if (!arg0) {
            this.field684 = var2;
            this.field688 = this.field690 - this.field686 - this.field688;
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(B)V")
    public void method197(byte arg0) {
        byte[] var2 = new byte[this.field687 * this.field686];
        int var3 = 0;
        for (int var4 = this.field687 - 1; var4 >= 0; var4--) {
            for (int var6 = 0; var6 < this.field686; var6++) {
                var2[var3++] = this.field684[this.field686 * var4 + var6];
            }
        }
        this.field684 = var2;
        if (arg0 != -127) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field689 = this.field691 - this.field687 - this.field689;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method198(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field685.length; var5++) {
            int var6 = this.field685[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field685[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field685[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field685[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg2 != 0) {
            this.field681 = -452;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method199(int arg0, int arg1, int arg2) {
        int var4 = this.field688 + arg1;
        int var5 = this.field689 + arg0;
        int var6 = Pix2D.field633 * var5 + var4;
        int var7 = 0;
        int var8 = this.field687;
        int var9 = this.field686;
        int var10 = Pix2D.field633 - var9;
        int var11 = 0;
        if (arg2 != -47687) {
            return;
        }
        if (var5 < Pix2D.field635) {
            int var12 = Pix2D.field635 - var5;
            var8 -= var12;
            var5 = Pix2D.field635;
            var7 += var9 * var12;
            var6 += Pix2D.field633 * var12;
        }
        if (var5 + var8 > Pix2D.field636) {
            var8 -= var5 + var8 - Pix2D.field636;
        }
        if (var4 < Pix2D.field637) {
            int var13 = Pix2D.field637 - var4;
            var9 -= var13;
            var4 = Pix2D.field637;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field638) {
            int var14 = var4 + var9 - Pix2D.field638;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method200(false, var6, var11, var10, var8, var9, this.field684, this.field685, Pix2D.field632, var7);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ZIIIII[B[I[II)V")
    private void method200(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7, int[] arg8, int arg9) {
        int var11 = -(arg5 >> 2);
        int var12 = -(arg5 & 0x3);
        if (arg0) {
            return;
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg6[arg9++];
                if (var17 == 0) {
                    arg1++;
                } else {
                    arg8[arg1++] = arg7[var17 & 0xFF];
                }
                byte var18 = arg6[arg9++];
                if (var18 == 0) {
                    arg1++;
                } else {
                    arg8[arg1++] = arg7[var18 & 0xFF];
                }
                byte var19 = arg6[arg9++];
                if (var19 == 0) {
                    arg1++;
                } else {
                    arg8[arg1++] = arg7[var19 & 0xFF];
                }
                byte var20 = arg6[arg9++];
                if (var20 == 0) {
                    arg1++;
                } else {
                    arg8[arg1++] = arg7[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg6[arg9++];
                if (var16 == 0) {
                    arg1++;
                } else {
                    arg8[arg1++] = arg7[var16 & 0xFF];
                }
            }
            arg1 += arg3;
            arg9 += arg2;
        }
    }
}
