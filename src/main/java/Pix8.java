import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "z", descriptor = "Z")
    private boolean field672 = false;

    @OriginalMember(owner = "jb", name = "A", descriptor = "Z")
    private boolean field673 = false;

    @OriginalMember(owner = "jb", name = "B", descriptor = "I")
    private int field674 = 9;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "jb", name = "J", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field676;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[B")
    public byte[] field675;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method297(arg1 + ".dat", null), 15787);
        Packet var5 = new Packet(arg0.method297("index.dat", null), 15787);
        var5.field710 = var4.method229();
        this.field681 = var5.method229();
        this.field682 = var5.method229();
        int var6 = var5.method227();
        this.field676 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field676[var7 + 1] = var5.method231();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field710 += 2;
            var4.field710 += var5.method229() * var5.method229();
            var5.field710++;
        }
        this.field679 = var5.method227();
        this.field680 = var5.method227();
        this.field677 = var5.method229();
        this.field678 = var5.method229();
        int var9 = var5.method227();
        int var10 = this.field678 * this.field677;
        this.field675 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field675[var11] = var4.method228();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field677; var12++) {
                for (int var13 = 0; var13 < this.field678; var13++) {
                    this.field675[this.field677 * var13 + var12] = var4.method228();
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I)V")
    public void method193(int arg0) {
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
        if (arg0 != 0) {
            this.field672 = !this.field672;
        }
        this.field678 = this.field682;
        this.field679 = 0;
        this.field680 = 0;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method194(int arg0) {
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
        if (arg0 < 9 || arg0 > 9) {
            this.field673 = !this.field673;
        }
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
        if (arg0 != 6) {
            this.field674 = 352;
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
        if (arg0 == 35509) {
            this.field675 = var2;
            this.field680 = this.field682 - this.field678 - this.field680;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IBII)V")
    public void method197(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field676.length; var6++) {
            int var7 = this.field676[var6] >> 16 & 0xFF;
            int var8 = arg0 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field676[var6] >> 8 & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field676[var6] & 0xFF;
            int var12 = arg3 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field676[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IBI)V")
    public void method198(int arg0, byte arg1, int arg2) {
        int var4 = this.field679 + arg2;
        int var5 = this.field680 + arg0;
        if (arg1 != 1) {
            return;
        }
        int var6 = Pix2D.field621 * var5 + var4;
        int var7 = 0;
        int var8 = this.field678;
        int var9 = this.field677;
        int var10 = Pix2D.field621 - var9;
        int var11 = 0;
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
            this.method199(var8, this.field676, var6, Pix2D.field620, var11, var10, (byte) 34, this.field675, var9, var7);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I[II[IIIB[BII)V")
    private void method199(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, byte arg6, byte[] arg7, int arg8, int arg9) {
        int var11 = -(arg8 >> 2);
        int var12 = -(arg8 & 0x3);
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg7[arg9++];
                if (var17 == 0) {
                    arg2++;
                } else {
                    arg3[arg2++] = arg1[var17 & 0xFF];
                }
                byte var18 = arg7[arg9++];
                if (var18 == 0) {
                    arg2++;
                } else {
                    arg3[arg2++] = arg1[var18 & 0xFF];
                }
                byte var19 = arg7[arg9++];
                if (var19 == 0) {
                    arg2++;
                } else {
                    arg3[arg2++] = arg1[var19 & 0xFF];
                }
                byte var20 = arg7[arg9++];
                if (var20 == 0) {
                    arg2++;
                } else {
                    arg3[arg2++] = arg1[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg7[arg9++];
                if (var16 == 0) {
                    arg2++;
                } else {
                    arg3[arg2++] = arg1[var16 & 0xFF];
                }
            }
            arg2 += arg5;
            arg9 += arg4;
        }
        if (arg6 == 34) {
            ;
        }
    }
}
