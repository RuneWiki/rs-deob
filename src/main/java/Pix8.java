import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "z", descriptor = "Z")
    private boolean field688 = true;

    @OriginalMember(owner = "jb", name = "A", descriptor = "I")
    private int field689 = 315;

    @OriginalMember(owner = "jb", name = "B", descriptor = "I")
    private int field690 = -46;

    @OriginalMember(owner = "jb", name = "C", descriptor = "I")
    private int field691 = -112;

    @OriginalMember(owner = "jb", name = "J", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "jb", name = "K", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "jb", name = "E", descriptor = "[I")
    public int[] field693;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "jb", name = "D", descriptor = "[B")
    public byte[] field692;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(-49365, arg0.method299(arg1 + ".dat", null));
        Packet var5 = new Packet(-49365, arg0.method299("index.dat", null));
        var5.field722 = var4.method231();
        this.field698 = var5.method231();
        this.field699 = var5.method231();
        int var6 = var5.method229();
        this.field693 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field693[var7 + 1] = var5.method233();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field722 += 2;
            var4.field722 += var5.method231() * var5.method231();
            var5.field722++;
        }
        this.field696 = var5.method229();
        this.field697 = var5.method229();
        this.field694 = var5.method231();
        this.field695 = var5.method231();
        int var9 = var5.method229();
        int var10 = this.field695 * this.field694;
        this.field692 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field692[var11] = var4.method230();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field694; var12++) {
                    for (int var13 = 0; var13 < this.field695; var13++) {
                        this.field692[this.field694 * var13 + var12] = var4.method230();
                    }
                }
            }
            if (Linkable.field367) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(Z)V")
    public void method194(boolean arg0) {
        this.field698 /= 2;
        this.field699 /= 2;
        byte[] var2 = new byte[this.field699 * this.field698];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field695; var4++) {
            for (int var5 = 0; var5 < this.field694; var5++) {
                var2[(this.field696 + var5 >> 1) + (this.field697 + var4 >> 1) * this.field698] = this.field692[var3++];
            }
        }
        this.field692 = var2;
        if (arg0) {
            this.field691 = -71;
        }
        this.field694 = this.field698;
        this.field695 = this.field699;
        this.field696 = 0;
        this.field697 = 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I)V")
    public void method195(int arg0) {
        if (this.field698 == this.field694 && this.field699 == this.field695) {
            return;
        }
        byte[] var2 = new byte[this.field699 * this.field698];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field695; var4++) {
            for (int var6 = 0; var6 < this.field694; var6++) {
                var2[(this.field697 + var4) * this.field698 + this.field696 + var6] = this.field692[var3++];
            }
        }
        this.field692 = var2;
        this.field694 = this.field698;
        this.field695 = this.field699;
        this.field696 = 0;
        this.field697 = 0;
        if (arg0 != 33065) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method196(byte arg0) {
        byte[] var2 = new byte[this.field695 * this.field694];
        if (arg0 != 3) {
            return;
        }
        boolean var3 = false;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field695; var5++) {
            for (int var6 = this.field694 - 1; var6 >= 0; var6--) {
                var2[var4++] = this.field692[this.field694 * var5 + var6];
            }
        }
        this.field692 = var2;
        this.field696 = this.field698 - this.field694 - this.field696;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(B)V")
    public void method197(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field688 = !this.field688;
        }
        byte[] var3 = new byte[this.field695 * this.field694];
        int var4 = 0;
        for (int var5 = this.field695 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field694; var6++) {
                var3[var4++] = this.field692[this.field694 * var5 + var6];
            }
        }
        this.field692 = var3;
        this.field697 = this.field699 - this.field695 - this.field697;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method198(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            this.field690 = 90;
        }
        for (int var5 = 0; var5 < this.field693.length; var5++) {
            int var6 = this.field693[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field693[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field693[var5] & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field693[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IZI)V")
    public void method199(int arg0, boolean arg1, int arg2) {
        int var4 = this.field696 + arg0;
        int var5 = this.field697 + arg2;
        int var6 = Pix2D.field640 * var5 + var4;
        int var7 = 0;
        if (!arg1) {
            return;
        }
        int var8 = this.field695;
        int var9 = this.field694;
        int var10 = Pix2D.field640 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field642) {
            int var12 = Pix2D.field642 - var5;
            var8 -= var12;
            var5 = Pix2D.field642;
            var7 += var9 * var12;
            var6 += Pix2D.field640 * var12;
        }
        if (var5 + var8 > Pix2D.field643) {
            var8 -= var5 + var8 - Pix2D.field643;
        }
        if (var4 < Pix2D.field644) {
            int var13 = Pix2D.field644 - var4;
            var9 -= var13;
            var4 = Pix2D.field644;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field645) {
            int var14 = var4 + var9 - Pix2D.field645;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method200(var7, var8, this.field693, var6, (byte) 7, this.field692, var10, var9, Pix2D.field639, var11);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II[IIB[BII[II)V")
    private void method200(int arg0, int arg1, int[] arg2, int arg3, byte arg4, byte[] arg5, int arg6, int arg7, int[] arg8, int arg9) {
        int var11 = -(arg7 >> 2);
        if (arg4 != 7) {
            this.field689 = 430;
        }
        int var12 = -(arg7 & 0x3);
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg5[arg0++];
                if (var17 == 0) {
                    arg3++;
                } else {
                    arg8[arg3++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg5[arg0++];
                if (var18 == 0) {
                    arg3++;
                } else {
                    arg8[arg3++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg5[arg0++];
                if (var19 == 0) {
                    arg3++;
                } else {
                    arg8[arg3++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg5[arg0++];
                if (var20 == 0) {
                    arg3++;
                } else {
                    arg8[arg3++] = arg2[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg5[arg0++];
                if (var16 == 0) {
                    arg3++;
                } else {
                    arg8[arg3++] = arg2[var16 & 0xFF];
                }
            }
            arg3 += arg6;
            arg0 += arg9;
        }
    }
}
