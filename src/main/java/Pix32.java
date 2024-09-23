import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "hb", name = "x", descriptor = "I")
    private int field583 = -339;

    @OriginalMember(owner = "hb", name = "y", descriptor = "Z")
    private boolean field584 = true;

    @OriginalMember(owner = "hb", name = "z", descriptor = "Z")
    private boolean field585 = true;

    @OriginalMember(owner = "hb", name = "A", descriptor = "Z")
    private boolean field586 = true;

    @OriginalMember(owner = "hb", name = "B", descriptor = "[I")
    public int[] field587;

    @OriginalMember(owner = "hb", name = "G", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "hb", name = "C", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "hb", name = "H", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "hb", name = "D", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "hb", name = "F", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "hb", name = "E", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field587 = new int[arg0 * arg1];
        this.field588 = this.field592 = arg0;
        this.field589 = this.field593 = arg1;
        this.field590 = this.field591 = 0;
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field588 = var3.getWidth(arg1);
            this.field589 = var3.getHeight(arg1);
            this.field592 = this.field588;
            this.field593 = this.field589;
            this.field590 = 0;
            this.field591 = 0;
            this.field587 = new int[this.field589 * this.field588];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field588, this.field589, this.field587, 0, this.field588);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet((byte) 64, arg0.method257(null, arg1 + ".dat", -31149));
        Packet var5 = new Packet((byte) 64, arg0.method257(null, "index.dat", -31149));
        var5.field624 = var4.method218();
        this.field592 = var5.method218();
        this.field593 = var5.method218();
        int var6 = var5.method216();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method220();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field624 += 2;
            var4.field624 += var5.method218() * var5.method218();
            var5.field624++;
        }
        this.field590 = var5.method216();
        this.field591 = var5.method216();
        this.field588 = var5.method218();
        this.field589 = var5.method218();
        int var10 = var5.method216();
        int var11 = this.field589 * this.field588;
        this.field587 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field587[var12] = var7[var4.method216()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field588; var13++) {
                for (int var14 = 0; var14 < this.field589; var14++) {
                    this.field587[this.field588 * var14 + var13] = var7[var4.method216()];
                }
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(Z)V")
    public void method171(boolean arg0) {
        if (!arg0) {
            Pix2D.method146(this.field589, 0, this.field587, this.field588);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIII)V")
    public void method172(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field587.length; var5++) {
            int var6 = this.field587[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg3 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg1 + var9;
                if (var10 < 1) {
                    var10 = 1;
                } else if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = var6 & 0xFF;
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field587[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg2 != 9) {
            this.field584 = !this.field584;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(III)V")
    public void method173(int arg0, int arg1, int arg2) {
        int var4 = this.field590 + arg0;
        int var5 = this.field591 + arg2;
        int var6 = Pix2D.field545 * var5 + var4;
        int var7 = 0;
        int var8 = this.field589;
        int var9 = this.field588;
        int var10 = Pix2D.field545 - var9;
        int var11 = 0;
        if (arg1 != 0) {
            this.field583 = 419;
        }
        if (var5 < Pix2D.field547) {
            int var12 = Pix2D.field547 - var5;
            var8 -= var12;
            var5 = Pix2D.field547;
            var7 += var9 * var12;
            var6 += Pix2D.field545 * var12;
        }
        if (var5 + var8 > Pix2D.field548) {
            var8 -= var5 + var8 - Pix2D.field548;
        }
        if (var4 < Pix2D.field549) {
            int var13 = Pix2D.field549 - var4;
            var9 -= var13;
            var4 = Pix2D.field549;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field550) {
            int var14 = var4 + var9 - Pix2D.field550;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method174(this.field587, true, var8, var6, var7, Pix2D.field544, var10, var9, var11);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IZIII[IIII)V")
    private void method174(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
        if (!arg1) {
            return;
        }
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg2; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg5[arg3++] = arg0[arg4++];
                arg5[arg3++] = arg0[arg4++];
                arg5[arg3++] = arg0[arg4++];
                arg5[arg3++] = arg0[arg4++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg5[arg3++] = arg0[arg4++];
            }
            arg3 += arg6;
            arg4 += arg8;
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(III)V")
    public void method175(int arg0, int arg1, int arg2) {
        int var4 = this.field590 + arg2;
        int var5 = this.field591 + arg0;
        while (arg1 >= 0) {
            this.field585 = !this.field585;
        }
        int var6 = Pix2D.field545 * var5 + var4;
        int var7 = 0;
        int var8 = this.field589;
        int var9 = this.field588;
        int var10 = Pix2D.field545 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field547) {
            int var12 = Pix2D.field547 - var5;
            var8 -= var12;
            var5 = Pix2D.field547;
            var7 += var9 * var12;
            var6 += Pix2D.field545 * var12;
        }
        if (var5 + var8 > Pix2D.field548) {
            var8 -= var5 + var8 - Pix2D.field548;
        }
        if (var4 < Pix2D.field549) {
            int var13 = Pix2D.field549 - var4;
            var9 -= var13;
            var4 = Pix2D.field549;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field550) {
            int var14 = var4 + var9 - Pix2D.field550;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method176(Pix2D.field544, this.field587, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method176(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
                int var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var17;
                }
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
                int var19 = arg1[arg3++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var19;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "hb", name = "d", descriptor = "(IIIII)V")
    public void method177(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var7 = this.field588;
            int var8 = this.field589;
            int var9 = 0;
            int var10 = 0;
            int var11 = (var7 << 16) / arg3;
            int var12 = (var8 << 16) / arg4;
            int var13 = this.field592;
            int var14 = this.field593;
            int var15 = (var13 << 16) / arg3;
            int var16 = (var14 << 16) / arg4;
            int var17 = (this.field590 * arg3 + var13 - 1) / var13 + arg0;
            int var18 = (this.field591 * arg4 + var14 - 1) / var14 + arg2;
            if (this.field590 * arg3 % var13 != 0) {
                var9 = (var13 - this.field590 * arg3 % var13 << 16) / arg3;
            }
            if (this.field591 * arg4 % var14 != 0) {
                var10 = (var14 - this.field591 * arg4 % var14 << 16) / arg4;
            }
            int var19 = (this.field588 - (var9 >> 16)) * arg3 / var13;
            int var20 = (this.field589 - (var10 >> 16)) * arg4 / var14;
            int var21 = Pix2D.field545 * var18 + var17;
            int var22 = Pix2D.field545 - var19;
            if (var18 < Pix2D.field547) {
                int var23 = Pix2D.field547 - var18;
                var20 -= var23;
                var18 = 0;
                var21 += Pix2D.field545 * var23;
                var10 += var16 * var23;
            }
            if (var18 + var20 > Pix2D.field548) {
                var20 -= var18 + var20 - Pix2D.field548;
            }
            if (var17 < Pix2D.field549) {
                int var24 = Pix2D.field549 - var17;
                var19 -= var24;
                var17 = 0;
                var21 += var24;
                var9 += var15 * var24;
                var22 += var24;
            }
            if (var17 + var19 > Pix2D.field550) {
                int var25 = var17 + var19 - Pix2D.field550;
                var19 -= var25;
                var22 += var25;
            }
            this.method178(Pix2D.field544, var9, true, var21, var7, this.field587, var15, var19, var10, var16, 0, var22, var20);
        } catch (Exception var26) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IIZII[IIIIIIII)V")
    private void method178(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (!arg2) {
            this.field583 = 14;
        }
        try {
            int var14 = arg1;
            for (int var15 = -arg12; var15 < 0; var15++) {
                int var16 = (arg8 >> 16) * arg4;
                for (int var17 = -arg7; var17 < 0; var17++) {
                    int var18 = arg5[(arg1 >> 16) + var16];
                    if (var18 == 0) {
                        arg3++;
                    } else {
                        arg0[arg3++] = var18;
                    }
                    arg1 += arg6;
                }
                arg8 += arg9;
                arg1 = var14;
                arg3 += arg11;
            }
        } catch (Exception var19) {
            System.out.println("error in plot_scale");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IBII)V")
    public void method179(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = this.field590 + arg0;
        int var6 = this.field591 + arg2;
        int var7 = Pix2D.field545 * var6 + var5;
        int var8 = 0;
        if (arg1 != 34) {
            this.field586 = !this.field586;
        }
        int var9 = this.field589;
        int var10 = this.field588;
        int var11 = Pix2D.field545 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field547) {
            int var13 = Pix2D.field547 - var6;
            var9 -= var13;
            var6 = Pix2D.field547;
            var8 += var10 * var13;
            var7 += Pix2D.field545 * var13;
        }
        if (var6 + var9 > Pix2D.field548) {
            var9 -= var6 + var9 - Pix2D.field548;
        }
        if (var5 < Pix2D.field549) {
            int var14 = Pix2D.field549 - var5;
            var10 -= var14;
            var5 = Pix2D.field549;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field550) {
            int var15 = var5 + var10 - Pix2D.field550;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method180(var10, var8, false, var12, var9, arg3, var7, 0, Pix2D.field544, var11, this.field587);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIZIIIII[II[I)V")
    private void method180(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg5;
        if (arg2) {
            return;
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                int var15 = arg10[arg1++];
                if (var15 == 0) {
                    arg6++;
                } else {
                    int var16 = arg8[arg6];
                    arg8[arg6++] = ((var15 & 0xFF00FF) * arg5 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg5 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg6 += arg9;
            arg1 += arg3;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIII[IIIII[I)V")
    public void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        if (arg4 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg8 / 2;
            int var14 = -arg7 / 2;
            int var15 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var17 = arg6 * var15 >> 8;
            int var18 = arg6 * var16 >> 8;
            int var19 = (arg1 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg3 << 16) + (var14 * var18 - var13 * var17);
            int var21 = Pix2D.field545 * arg9 + arg2;
            for (int var22 = 0; var22 < arg7; var22++) {
                int var23 = arg10[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg5[var22]; var27 < 0; var27++) {
                    Pix2D.field544[var24++] = this.field587[(var25 >> 16) + (var26 >> 16) * this.field588];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += Pix2D.field545;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(ZLib;II)V")
    public void method182(boolean arg0, Pix8 arg1, int arg2, int arg3) {
        int var5 = this.field590 + arg2;
        int var6 = this.field591 + arg3;
        int var7 = Pix2D.field545 * var6 + var5;
        int var8 = 0;
        if (arg0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = this.field589;
        int var11 = this.field588;
        int var12 = Pix2D.field545 - var11;
        int var13 = 0;
        if (var6 < Pix2D.field547) {
            int var14 = Pix2D.field547 - var6;
            var10 -= var14;
            var6 = Pix2D.field547;
            var8 += var11 * var14;
            var7 += Pix2D.field545 * var14;
        }
        if (var6 + var10 > Pix2D.field548) {
            var10 -= var6 + var10 - Pix2D.field548;
        }
        if (var5 < Pix2D.field549) {
            int var15 = Pix2D.field549 - var5;
            var11 -= var15;
            var5 = Pix2D.field549;
            var8 += var15;
            var7 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field550) {
            int var16 = var5 + var11 - Pix2D.field550;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method183(var10, 0, var11, var12, -10520, var7, this.field587, var13, arg1.field597, Pix2D.field544, var8);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIII[II[B[II)V")
    private void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, byte[] arg8, int[] arg9, int arg10) {
        int var12 = -(arg2 >> 2);
        int var13 = -(arg2 & 0x3);
        if (arg4 != -10520) {
            this.field585 = !this.field585;
        }
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg6[arg10++];
                if (var18 != 0 && arg8[arg5] == 0) {
                    arg9[arg5++] = var18;
                } else {
                    arg5++;
                }
                int var19 = arg6[arg10++];
                if (var19 != 0 && arg8[arg5] == 0) {
                    arg9[arg5++] = var19;
                } else {
                    arg5++;
                }
                int var20 = arg6[arg10++];
                if (var20 != 0 && arg8[arg5] == 0) {
                    arg9[arg5++] = var20;
                } else {
                    arg5++;
                }
                int var21 = arg6[arg10++];
                if (var21 != 0 && arg8[arg5] == 0) {
                    arg9[arg5++] = var21;
                } else {
                    arg5++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg6[arg10++];
                if (var17 != 0 && arg8[arg5] == 0) {
                    arg9[arg5++] = var17;
                } else {
                    arg5++;
                }
            }
            arg5 += arg3;
            arg10 += arg7;
        }
    }
}
