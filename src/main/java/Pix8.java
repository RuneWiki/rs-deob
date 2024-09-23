import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DSMJIEPN")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "DSMJIEPN", name = "y", descriptor = "Z")
    private boolean _flowObfuscator10 = false;

    @OriginalMember(owner = "DSMJIEPN", name = "z", descriptor = "I")
    private int _flowObfuscator11 = 360;

    @OriginalMember(owner = "DSMJIEPN", name = "A", descriptor = "B")
    private byte _flowObfuscator12 = 3;

    @OriginalMember(owner = "DSMJIEPN", name = "H", descriptor = "I")
    public int width;

    @OriginalMember(owner = "DSMJIEPN", name = "I", descriptor = "I")
    public int height;

    @OriginalMember(owner = "DSMJIEPN", name = "C", descriptor = "[I")
    public int[] palette;

    @OriginalMember(owner = "DSMJIEPN", name = "F", descriptor = "I")
    public int cropLeft;

    @OriginalMember(owner = "DSMJIEPN", name = "G", descriptor = "I")
    public int cropTop;

    @OriginalMember(owner = "DSMJIEPN", name = "D", descriptor = "I")
    public int cropRight;

    @OriginalMember(owner = "DSMJIEPN", name = "E", descriptor = "I")
    public int cropBottom;

    @OriginalMember(owner = "DSMJIEPN", name = "B", descriptor = "[B")
    public byte[] pixels;

    @OriginalMember(owner = "DSMJIEPN", name = "x", descriptor = "I")
    private int _flowObfuscator9;

    @OriginalMember(owner = "DSMJIEPN", name = "<init>", descriptor = "(LXTGLDHGX;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.read(arg1 + ".dat", null), 891);
        Packet var5 = new Packet(arg0.read("index.dat", null), 891);
        var5.pos = var4.g2();
        this.width = var5.g2();
        this.height = var5.g2();
        int var6 = var5.g1();
        this.palette = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.palette[var7 + 1] = var5.g3();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.pos += 2;
            var4.pos += var5.g2() * var5.g2();
            var5.pos++;
        }
        this.cropLeft = var5.g1();
        this.cropTop = var5.g1();
        this.cropRight = var5.g2();
        this.cropBottom = var5.g2();
        int var9 = var5.g1();
        int var10 = this.cropRight * this.cropBottom;
        this.pixels = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.pixels[var11] = var4.g1b();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.cropRight; var12++) {
                for (int var13 = 0; var13 < this.cropBottom; var13++) {
                    this.pixels[this.cropRight * var13 + var12] = var4.g1b();
                }
            }
        }
    }

    @OriginalMember(owner = "DSMJIEPN", name = "b", descriptor = "(Z)V")
    public void shrink(boolean arg0) {
        this.width /= 2;
        this.height /= 2;
        byte[] var2 = new byte[this.width * this.height];
        int var3 = 0;
        for (int var4 = 0; var4 < this.cropBottom; var4++) {
            for (int var5 = 0; var5 < this.cropRight; var5++) {
                var2[(this.cropLeft + var5 >> 1) + (this.cropTop + var4 >> 1) * this.width] = this.pixels[var3++];
            }
        }
        this.pixels = var2;
        this.cropRight = this.width;
        this.cropBottom = this.height;
        this.cropLeft = 0;
        if (!arg0) {
            this.cropTop = 0;
        }
    }

    @OriginalMember(owner = "DSMJIEPN", name = "c", descriptor = "(Z)V")
    public void crop(boolean arg0) {
        if (this.width == this.cropRight && this.height == this.cropBottom) {
            return;
        }
        byte[] var2 = new byte[this.width * this.height];
        if (arg0) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.cropBottom; var4++) {
            for (int var5 = 0; var5 < this.cropRight; var5++) {
                var2[(this.cropTop + var4) * this.width + this.cropLeft + var5] = this.pixels[var3++];
            }
        }
        this.pixels = var2;
        this.cropRight = this.width;
        this.cropBottom = this.height;
        this.cropLeft = 0;
        this.cropTop = 0;
    }

    @OriginalMember(owner = "DSMJIEPN", name = "b", descriptor = "(I)V")
    public void hflip(int arg0) {
        if (arg0 != 0) {
            return;
        }
        byte[] var2 = new byte[this.cropRight * this.cropBottom];
        int var3 = 0;
        for (int var4 = 0; var4 < this.cropBottom; var4++) {
            for (int var5 = this.cropRight - 1; var5 >= 0; var5--) {
                var2[var3++] = this.pixels[this.cropRight * var4 + var5];
            }
        }
        this.pixels = var2;
        this.cropLeft = this.width - this.cropRight - this.cropLeft;
    }

    @OriginalMember(owner = "DSMJIEPN", name = "d", descriptor = "(Z)V")
    public void vflip(boolean arg0) {
        byte[] var2 = new byte[this.cropRight * this.cropBottom];
        int var3 = 0;
        for (int var4 = this.cropBottom - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.cropRight; var5++) {
                var2[var3++] = this.pixels[this.cropRight * var4 + var5];
            }
        }
        this.pixels = var2;
        if (!arg0) {
            this._flowObfuscator9 = -48;
        }
        this.cropTop = this.height - this.cropBottom - this.cropTop;
    }

    @OriginalMember(owner = "DSMJIEPN", name = "a", descriptor = "(IIII)V")
    public void translate(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.palette.length; var5++) {
            int var6 = this.palette[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.palette[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.palette[var5] & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.palette[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3 != 0) {
            this._flowObfuscator9 = 69;
        }
    }

    @OriginalMember(owner = "DSMJIEPN", name = "a", descriptor = "(III)V")
    public void plot(int arg0, int arg1, int arg2) {
        int var4 = this.cropLeft + arg0;
        int var5 = this.cropTop + arg2;
        int var6 = Pix2D.width2d * var5 + var4;
        int var7 = 0;
        if (arg1 != 16083) {
            return;
        }
        int var8 = this.cropBottom;
        int var9 = this.cropRight;
        int var10 = Pix2D.width2d - var9;
        int var11 = 0;
        if (var5 < Pix2D.boundTop) {
            int var12 = Pix2D.boundTop - var5;
            var8 -= var12;
            var5 = Pix2D.boundTop;
            var7 += var9 * var12;
            var6 += Pix2D.width2d * var12;
        }
        if (var5 + var8 > Pix2D.boundBottom) {
            var8 -= var5 + var8 - Pix2D.boundBottom;
        }
        if (var4 < Pix2D.boundLeft) {
            int var13 = Pix2D.boundLeft - var4;
            var9 -= var13;
            var4 = Pix2D.boundLeft;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.boundRight) {
            int var14 = var4 + var9 - Pix2D.boundRight;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.copyPixels(var8, (byte) 9, Pix2D.data, this.pixels, var10, var6, var9, var7, this.palette, var11);
        }
    }

    @OriginalMember(owner = "DSMJIEPN", name = "a", descriptor = "(IB[I[BIIII[II)V")
    private void copyPixels(int arg0, byte arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        if (arg1 != 9) {
            this._flowObfuscator10 = !this._flowObfuscator10;
        }
        int var11 = -(arg6 >> 2);
        int var12 = -(arg6 & 0x3);
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg3[arg7++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var17 & 0xFF];
                }
                byte var18 = arg3[arg7++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var18 & 0xFF];
                }
                byte var19 = arg3[arg7++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var19 & 0xFF];
                }
                byte var20 = arg3[arg7++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg3[arg7++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var16 & 0xFF];
                }
            }
            arg5 += arg4;
            arg7 += arg9;
        }
    }
}
