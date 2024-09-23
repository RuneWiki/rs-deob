import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "jb", name = "w", descriptor = "I")
    private int field670 = 986;

    @OriginalMember(owner = "jb", name = "x", descriptor = "I")
    private int field671 = 5;

    @OriginalMember(owner = "jb", name = "y", descriptor = "Z")
    private boolean field672 = true;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "jb", name = "A", descriptor = "[I")
    public int[] field674;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "jb", name = "B", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "jb", name = "C", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "jb", name = "z", descriptor = "[B")
    public byte[] field673;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method295(arg1 + ".dat", null), 185);
        Packet var5 = new Packet(arg0.method295("index.dat", null), 185);
        var5.field708 = var4.method227();
        this.field679 = var5.method227();
        this.field680 = var5.method227();
        int var6 = var5.method225();
        this.field674 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field674[var7 + 1] = var5.method229();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field708 += 2;
            var4.field708 += var5.method227() * var5.method227();
            var5.field708++;
        }
        this.field677 = var5.method225();
        this.field678 = var5.method225();
        this.field675 = var5.method227();
        this.field676 = var5.method227();
        int var9 = var5.method225();
        int var10 = this.field676 * this.field675;
        this.field673 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field673[var11] = var4.method226();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field675; var12++) {
                    for (int var13 = 0; var13 < this.field676; var13++) {
                        this.field673[this.field675 * var13 + var12] = var4.method226();
                    }
                }
            }
            if (Linkable.field360) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I)V")
    public void method193(int arg0) {
        this.field679 /= 2;
        this.field680 /= 2;
        byte[] var2 = new byte[this.field680 * this.field679];
        int var3 = 59 / arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field676; var5++) {
            for (int var6 = 0; var6 < this.field675; var6++) {
                var2[(this.field677 + var6 >> 1) + (this.field678 + var5 >> 1) * this.field679] = this.field673[var4++];
            }
        }
        this.field673 = var2;
        this.field675 = this.field679;
        this.field676 = this.field680;
        this.field677 = 0;
        this.field678 = 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method194(byte arg0) {
        if (arg0 != 4) {
            this.field671 = -49;
        }
        if (this.field679 == this.field675 && this.field680 == this.field676) {
            return;
        }
        byte[] var2 = new byte[this.field680 * this.field679];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field676; var4++) {
            for (int var5 = 0; var5 < this.field675; var5++) {
                var2[(this.field678 + var4) * this.field679 + this.field677 + var5] = this.field673[var3++];
            }
        }
        this.field673 = var2;
        this.field675 = this.field679;
        this.field676 = this.field680;
        this.field677 = 0;
        this.field678 = 0;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method195(int arg0) {
        byte[] var2 = new byte[this.field676 * this.field675];
        if (arg0 <= 0) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field676; var4++) {
            for (int var5 = this.field675 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field673[this.field675 * var4 + var5];
            }
        }
        this.field673 = var2;
        this.field677 = this.field679 - this.field675 - this.field677;
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method196(int arg0) {
        if (arg0 != 0) {
            this.field670 = 33;
        }
        byte[] var2 = new byte[this.field676 * this.field675];
        int var3 = 0;
        for (int var4 = this.field676 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field675; var5++) {
                var2[var3++] = this.field673[this.field675 * var4 + var5];
            }
        }
        this.field673 = var2;
        this.field678 = this.field680 - this.field676 - this.field678;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIZI)V")
    public void method197(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field670 = 50;
        }
        for (int var5 = 0; var5 < this.field674.length; var5++) {
            int var6 = this.field674[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field674[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field674[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field674[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IBI)V")
    public void method198(int arg0, byte arg1, int arg2) {
        int var4 = this.field677 + arg0;
        if (arg1 == 1) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = this.field678 + arg2;
        int var8 = Pix2D.field621 * var7 + var4;
        int var9 = 0;
        int var10 = this.field676;
        int var11 = this.field675;
        int var12 = Pix2D.field621 - var11;
        int var13 = 0;
        if (var7 < Pix2D.field623) {
            int var14 = Pix2D.field623 - var7;
            var10 -= var14;
            var7 = Pix2D.field623;
            var9 += var11 * var14;
            var8 += Pix2D.field621 * var14;
        }
        if (var7 + var10 > Pix2D.field624) {
            var10 -= var7 + var10 - Pix2D.field624;
        }
        if (var4 < Pix2D.field625) {
            int var15 = Pix2D.field625 - var4;
            var11 -= var15;
            var4 = Pix2D.field625;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var4 + var11 > Pix2D.field626) {
            int var16 = var4 + var11 - Pix2D.field626;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method199(Pix2D.field620, var8, var10, var12, var13, this.field674, var11, 6, this.field673, var9);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([IIIII[III[BI)V")
    private void method199(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        int var11 = -(arg6 >> 2);
        if (arg7 < 6 || arg7 > 6) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = -(arg6 & 0x3);
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg8[arg9++];
                if (var18 == 0) {
                    arg1++;
                } else {
                    arg0[arg1++] = arg5[var18 & 0xFF];
                }
                byte var19 = arg8[arg9++];
                if (var19 == 0) {
                    arg1++;
                } else {
                    arg0[arg1++] = arg5[var19 & 0xFF];
                }
                byte var20 = arg8[arg9++];
                if (var20 == 0) {
                    arg1++;
                } else {
                    arg0[arg1++] = arg5[var20 & 0xFF];
                }
                byte var21 = arg8[arg9++];
                if (var21 == 0) {
                    arg1++;
                } else {
                    arg0[arg1++] = arg5[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg8[arg9++];
                if (var17 == 0) {
                    arg1++;
                } else {
                    arg0[arg1++] = arg5[var17 & 0xFF];
                }
            }
            arg1 += arg3;
            arg9 += arg4;
        }
    }
}
