import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "kb", name = "z", descriptor = "Z")
    private boolean field673 = false;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "kb", name = "H", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "kb", name = "B", descriptor = "[I")
    public int[] field675;

    @OriginalMember(owner = "kb", name = "E", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "kb", name = "F", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "kb", name = "C", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "kb", name = "A", descriptor = "[B")
    public byte[] field674;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method309(arg1 + ".dat", null), (byte) 3);
        Packet var5 = new Packet(arg0.method309("index.dat", null), (byte) 3);
        var5.field711 = var4.method241();
        this.field680 = var5.method241();
        this.field681 = var5.method241();
        int var6 = var5.method239();
        this.field675 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field675[var7 + 1] = var5.method243();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field711 += 2;
            var4.field711 += var5.method241() * var5.method241();
            var5.field711++;
        }
        this.field678 = var5.method239();
        this.field679 = var5.method239();
        this.field676 = var5.method241();
        this.field677 = var5.method241();
        int var9 = var5.method239();
        int var10 = this.field677 * this.field676;
        this.field674 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field674[var11] = var4.method240();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field676; var12++) {
                for (int var13 = 0; var13 < this.field677; var13++) {
                    this.field674[this.field676 * var13 + var12] = var4.method240();
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Z)V")
    public void method207(boolean arg0) {
        this.field680 /= 2;
        this.field681 /= 2;
        byte[] var2 = new byte[this.field681 * this.field680];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field677; var4++) {
            for (int var5 = 0; var5 < this.field676; var5++) {
                var2[(this.field678 + var5 >> 1) + (this.field679 + var4 >> 1) * this.field680] = this.field674[var3++];
            }
        }
        this.field674 = var2;
        this.field676 = this.field680;
        this.field677 = this.field681;
        this.field678 = 0;
        if (!arg0) {
            this.field673 = !this.field673;
        }
        this.field679 = 0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)V")
    public void method208(byte arg0) {
        if (this.field680 == this.field676 && this.field681 == this.field677) {
            return;
        }
        byte[] var2 = new byte[this.field681 * this.field680];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field677; var4++) {
            for (int var5 = 0; var5 < this.field676; var5++) {
                var2[(this.field679 + var4) * this.field680 + this.field678 + var5] = this.field674[var3++];
            }
        }
        if (arg0 != -86) {
            this.field673 = !this.field673;
        }
        this.field674 = var2;
        this.field676 = this.field680;
        this.field677 = this.field681;
        this.field678 = 0;
        this.field679 = 0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(B)V")
    public void method209(byte arg0) {
        byte[] var2 = new byte[this.field677 * this.field676];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field677; var4++) {
            for (int var6 = this.field676 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field674[this.field676 * var4 + var6];
            }
        }
        this.field674 = var2;
        if (arg0 != 15) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field678 = this.field680 - this.field676 - this.field678;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Z)V")
    public void method210(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        byte[] var3 = new byte[this.field677 * this.field676];
        int var4 = 0;
        for (int var5 = this.field677 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field676; var6++) {
                var3[var4++] = this.field674[this.field676 * var5 + var6];
            }
        }
        this.field674 = var3;
        this.field679 = this.field681 - this.field677 - this.field679;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII)V")
    public void method211(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field675.length; var5++) {
            int var6 = this.field675[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field675[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field675[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field675[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg0 < 0 || arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III)V")
    public void method212(int arg0, int arg1, int arg2) {
        int var4 = this.field678 + arg1;
        int var5 = this.field679 + arg2;
        int var6 = Pix2D.field624 * var5 + var4;
        int var7 = 0;
        int var8 = this.field677;
        int var9 = this.field676;
        int var10 = Pix2D.field624 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field626) {
            int var12 = Pix2D.field626 - var5;
            var8 -= var12;
            var5 = Pix2D.field626;
            var7 += var9 * var12;
            var6 += Pix2D.field624 * var12;
        }
        if (var5 + var8 > Pix2D.field627) {
            var8 -= var5 + var8 - Pix2D.field627;
        }
        if (var4 < Pix2D.field628) {
            int var13 = Pix2D.field628 - var4;
            var9 -= var13;
            var4 = Pix2D.field628;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field629) {
            int var14 = var4 + var9 - Pix2D.field629;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method213(this.field674, -107, Pix2D.field623, var7, var11, this.field675, var8, var9, var10, var6);
            if (arg0 < 1 || arg0 > 1) {
                ;
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BI[III[IIIII)V")
    private void method213(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 >= 0) {
            return;
        }
        int var11 = -(arg7 >> 2);
        int var12 = -(arg7 & 0x3);
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg0[arg3++];
                if (var17 == 0) {
                    arg9++;
                } else {
                    arg2[arg9++] = arg5[var17 & 0xFF];
                }
                byte var18 = arg0[arg3++];
                if (var18 == 0) {
                    arg9++;
                } else {
                    arg2[arg9++] = arg5[var18 & 0xFF];
                }
                byte var19 = arg0[arg3++];
                if (var19 == 0) {
                    arg9++;
                } else {
                    arg2[arg9++] = arg5[var19 & 0xFF];
                }
                byte var20 = arg0[arg3++];
                if (var20 == 0) {
                    arg9++;
                } else {
                    arg2[arg9++] = arg5[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg0[arg3++];
                if (var16 == 0) {
                    arg9++;
                } else {
                    arg2[arg9++] = arg5[var16 & 0xFF];
                }
            }
            arg9 += arg8;
            arg3 += arg4;
        }
    }
}
