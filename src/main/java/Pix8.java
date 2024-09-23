import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "w", descriptor = "I")
    private int field668 = -41441;

    @OriginalMember(owner = "jb", name = "x", descriptor = "Z")
    private boolean field669 = true;

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field670 = 35961;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field671 = -676;

    @OriginalMember(owner = "jb", name = "A", descriptor = "B")
    private byte field672 = 9;

    @OriginalMember(owner = "jb", name = "B", descriptor = "Z")
    private boolean field673 = true;

    @OriginalMember(owner = "jb", name = "J", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "jb", name = "K", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "jb", name = "E", descriptor = "[I")
    public int[] field676;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "jb", name = "D", descriptor = "[B")
    public byte[] field675;

    @OriginalMember(owner = "jb", name = "C", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method294(arg1 + ".dat", null), (byte) 1);
        Packet var5 = new Packet(arg0.method294("index.dat", null), (byte) 1);
        var5.field709 = var4.method226();
        this.field681 = var5.method226();
        this.field682 = var5.method226();
        int var6 = var5.method224();
        this.field676 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field676[var7 + 1] = var5.method228();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field709 += 2;
            var4.field709 += var5.method226() * var5.method226();
            var5.field709++;
        }
        this.field679 = var5.method224();
        this.field680 = var5.method224();
        this.field677 = var5.method226();
        this.field678 = var5.method226();
        int var9 = var5.method224();
        int var10 = this.field678 * this.field677;
        this.field675 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field675[var11] = var4.method225();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field677; var12++) {
                    for (int var13 = 0; var13 < this.field678; var13++) {
                        this.field675[this.field677 * var13 + var12] = var4.method225();
                    }
                }
            }
            if (Linkable.field365) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method193(byte arg0) {
        this.field681 /= 2;
        this.field682 /= 2;
        byte[] var2 = new byte[this.field682 * this.field681];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field678; var4++) {
            for (int var6 = 0; var6 < this.field677; var6++) {
                var2[(this.field679 + var6 >> 1) + (this.field680 + var4 >> 1) * this.field681] = this.field675[var3++];
            }
        }
        this.field675 = var2;
        this.field677 = this.field681;
        this.field678 = this.field682;
        this.field679 = 0;
        if (this.field672 == arg0) {
            boolean var5 = false;
            this.field680 = 0;
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method194(int arg0) {
        if (arg0 != 0) {
            this.field674 = 243;
        }
        if (this.field681 == this.field677 && this.field682 == this.field678) {
            return;
        }
        byte[] var2 = new byte[this.field682 * this.field681];
        int var3 = 0;
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

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method195(int arg0) {
        byte[] var2 = new byte[this.field678 * this.field677];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field678; var4++) {
            for (int var5 = this.field677 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field675[this.field677 * var4 + var5];
            }
        }
        this.field675 = var2;
        if (arg0 < 2 || arg0 > 2) {
            this.field674 = 97;
        }
        this.field679 = this.field681 - this.field677 - this.field679;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(B)V")
    public void method196(byte arg0) {
        byte[] var2 = new byte[this.field678 * this.field677];
        int var3 = 0;
        for (int var4 = this.field678 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field677; var5++) {
                var2[var3++] = this.field675[this.field677 * var4 + var5];
            }
        }
        if (arg0 == -36) {
            this.field675 = var2;
            this.field680 = this.field682 - this.field678 - this.field680;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method197(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field676.length; var5++) {
            int var6 = this.field676[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field676[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
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
        if (arg1 == 6) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(BII)V")
    public void method198(byte arg0, int arg1, int arg2) {
        int var4 = this.field679 + arg1;
        int var5 = this.field680 + arg2;
        int var6 = Pix2D.field616 * var5 + var4;
        int var7 = 0;
        int var8 = this.field678;
        int var9 = this.field677;
        int var10 = Pix2D.field616 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field618) {
            int var12 = Pix2D.field618 - var5;
            var8 -= var12;
            var5 = Pix2D.field618;
            var7 += var9 * var12;
            var6 += Pix2D.field616 * var12;
        }
        if (var5 + var8 > Pix2D.field619) {
            var8 -= var5 + var8 - Pix2D.field619;
        }
        if (var4 < Pix2D.field620) {
            int var13 = Pix2D.field620 - var4;
            var9 -= var13;
            var4 = Pix2D.field620;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field621) {
            int var14 = var4 + var9 - Pix2D.field621;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method199(var11, (byte) -55, var10, var7, var8, var9, Pix2D.field615, this.field675, var6, this.field676);
            if (arg0 != 7) {
                this.field668 = -485;
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IBIIII[I[BI[I)V")
    private void method199(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, byte[] arg7, int arg8, int[] arg9) {
        int var11 = -(arg5 >> 2);
        int var12 = -(arg5 & 0x3);
        if (arg1 != -55) {
            return;
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg7[arg3++];
                if (var17 == 0) {
                    arg8++;
                } else {
                    arg6[arg8++] = arg9[var17 & 0xFF];
                }
                byte var18 = arg7[arg3++];
                if (var18 == 0) {
                    arg8++;
                } else {
                    arg6[arg8++] = arg9[var18 & 0xFF];
                }
                byte var19 = arg7[arg3++];
                if (var19 == 0) {
                    arg8++;
                } else {
                    arg6[arg8++] = arg9[var19 & 0xFF];
                }
                byte var20 = arg7[arg3++];
                if (var20 == 0) {
                    arg8++;
                } else {
                    arg6[arg8++] = arg9[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg7[arg3++];
                if (var16 == 0) {
                    arg8++;
                } else {
                    arg6[arg8++] = arg9[var16 & 0xFF];
                }
            }
            arg8 += arg2;
            arg3 += arg0;
        }
    }
}
