import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "hb", name = "v", descriptor = "Z")
    private boolean field572 = false;

    @OriginalMember(owner = "hb", name = "x", descriptor = "Z")
    private boolean field574 = false;

    @OriginalMember(owner = "hb", name = "y", descriptor = "I")
    private int field575 = 15223;

    @OriginalMember(owner = "hb", name = "z", descriptor = "B")
    private byte field576 = 5;

    @OriginalMember(owner = "hb", name = "A", descriptor = "[I")
    public int[] field577;

    @OriginalMember(owner = "hb", name = "F", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "hb", name = "B", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "hb", name = "G", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "hb", name = "C", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "hb", name = "E", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "hb", name = "D", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "hb", name = "w", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field577 = new int[arg0 * arg1];
        this.field578 = this.field582 = arg0;
        this.field579 = this.field583 = arg1;
        this.field580 = this.field581 = 0;
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field578 = var3.getWidth(arg1);
            this.field579 = var3.getHeight(arg1);
            this.field582 = this.field578;
            this.field583 = this.field579;
            this.field580 = 0;
            this.field581 = 0;
            this.field577 = new int[this.field579 * this.field578];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field578, this.field579, this.field577, 0, this.field578);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(363, arg0.read(arg1 + ".dat", null, (byte) 2));
        Packet var5 = new Packet(363, arg0.read("index.dat", null, (byte) 2));
        var5.field622 = var4.method218();
        this.field582 = var5.method218();
        this.field583 = var5.method218();
        int var6 = var5.method216();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method220();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field622 += 2;
            var4.field622 += var5.method218() * var5.method218();
            var5.field622++;
        }
        this.field580 = var5.method216();
        this.field581 = var5.method216();
        this.field578 = var5.method218();
        this.field579 = var5.method218();
        int var10 = var5.method216();
        int var11 = this.field579 * this.field578;
        this.field577 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field577[var12] = var7[var4.method216()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field578; var13++) {
                for (int var14 = 0; var14 < this.field579; var14++) {
                    this.field577[this.field578 * var14 + var13] = var7[var4.method216()];
                }
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(B)V")
    public void method171(byte arg0) {
        if (arg0 != 62) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Pix2D.method146(this.field578, this.field577, -657, this.field579);
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIZ)V")
    public void method172(int arg0, int arg1, int arg2, boolean arg3) {
        for (int var5 = 0; var5 < this.field577.length; var5++) {
            int var6 = this.field577[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg0 + var7;
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
                int var12 = arg2 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field577[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg3) {
            ;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(III)V")
    public void method173(int arg0, int arg1, int arg2) {
        int var4 = this.field580 + arg1;
        int var5 = this.field581 + arg2;
        int var6 = Pix2D.field534 * var5 + var4;
        int var7 = 0;
        int var8 = this.field579;
        int var9 = this.field578;
        int var10 = Pix2D.field534 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field536) {
            int var12 = Pix2D.field536 - var5;
            var8 -= var12;
            var5 = Pix2D.field536;
            var7 += var9 * var12;
            var6 += Pix2D.field534 * var12;
        }
        if (var5 + var8 > Pix2D.field537) {
            var8 -= var5 + var8 - Pix2D.field537;
        }
        if (var4 < Pix2D.field538) {
            int var13 = Pix2D.field538 - var4;
            var9 -= var13;
            var4 = Pix2D.field538;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field539) {
            int var14 = var4 + var9 - Pix2D.field539;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method174(15223, this.field577, var10, var8, var7, var11, var6, var9, Pix2D.field533);
            if (arg0 != 34676) {
                this.field573 = 117;
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I[IIIIIII[I)V")
    private void method174(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg3; var12 < 0; var12++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg8[arg6++] = arg1[arg4++];
                arg8[arg6++] = arg1[arg4++];
                arg8[arg6++] = arg1[arg4++];
                arg8[arg6++] = arg1[arg4++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg8[arg6++] = arg1[arg4++];
            }
            arg6 += arg2;
            arg4 += arg5;
        }
        if (this.field575 != arg0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIZ)V")
    public void method175(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field575 = 32;
        }
        int var4 = this.field580 + arg1;
        int var5 = this.field581 + arg0;
        int var6 = Pix2D.field534 * var5 + var4;
        int var7 = 0;
        int var8 = this.field579;
        int var9 = this.field578;
        int var10 = Pix2D.field534 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field536) {
            int var12 = Pix2D.field536 - var5;
            var8 -= var12;
            var5 = Pix2D.field536;
            var7 += var9 * var12;
            var6 += Pix2D.field534 * var12;
        }
        if (var5 + var8 > Pix2D.field537) {
            var8 -= var5 + var8 - Pix2D.field537;
        }
        if (var4 < Pix2D.field538) {
            int var13 = Pix2D.field538 - var4;
            var9 -= var13;
            var4 = Pix2D.field538;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field539) {
            int var14 = var4 + var9 - Pix2D.field539;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method176(Pix2D.field533, this.field577, 0, var7, var6, var9, var8, var10, var11);
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
        if (arg3 != 17713) {
            return;
        }
        try {
            int var6 = this.field578;
            int var7 = this.field579;
            int var8 = 0;
            int var9 = 0;
            int var10 = (var6 << 16) / arg2;
            int var11 = (var7 << 16) / arg0;
            int var12 = this.field582;
            int var13 = this.field583;
            int var14 = (var12 << 16) / arg2;
            int var15 = (var13 << 16) / arg0;
            int var16 = (this.field580 * arg2 + var12 - 1) / var12 + arg4;
            int var17 = (this.field581 * arg0 + var13 - 1) / var13 + arg1;
            if (this.field580 * arg2 % var12 != 0) {
                var8 = (var12 - this.field580 * arg2 % var12 << 16) / arg2;
            }
            if (this.field581 * arg0 % var13 != 0) {
                var9 = (var13 - this.field581 * arg0 % var13 << 16) / arg0;
            }
            int var18 = (this.field578 - (var8 >> 16)) * arg2 / var12;
            int var19 = (this.field579 - (var9 >> 16)) * arg0 / var13;
            int var20 = Pix2D.field534 * var17 + var16;
            int var21 = Pix2D.field534 - var18;
            if (var17 < Pix2D.field536) {
                int var22 = Pix2D.field536 - var17;
                var19 -= var22;
                var17 = 0;
                var20 += Pix2D.field534 * var22;
                var9 += var15 * var22;
            }
            if (var17 + var19 > Pix2D.field537) {
                var19 -= var17 + var19 - Pix2D.field537;
            }
            if (var16 < Pix2D.field538) {
                int var23 = Pix2D.field538 - var16;
                var18 -= var23;
                var16 = 0;
                var20 += var23;
                var8 += var14 * var23;
                var21 += var23;
            }
            if (var16 + var18 > Pix2D.field539) {
                int var24 = var16 + var18 - Pix2D.field539;
                var18 -= var24;
                var21 += var24;
            }
            this.method178(var8, var14, Pix2D.field533, 0, var15, var9, 0, this.field577, var21, var20, var19, var6, var18);
        } catch (Exception var25) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(II[IIIII[IIIIII)V")
    private void method178(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg6 != 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        try {
            int var15 = arg0;
            for (int var16 = -arg10; var16 < 0; var16++) {
                int var17 = (arg5 >> 16) * arg11;
                for (int var18 = -arg12; var18 < 0; var18++) {
                    int var19 = arg7[(arg0 >> 16) + var17];
                    if (var19 == 0) {
                        arg9++;
                    } else {
                        arg2[arg9++] = var19;
                    }
                    arg0 += arg1;
                }
                arg5 += arg4;
                arg0 = var15;
                arg9 += arg8;
            }
        } catch (Exception var20) {
            System.out.println("error in plot_scale");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIB)V")
    public void method179(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -26) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field580 + arg1;
        int var7 = this.field581 + arg2;
        int var8 = Pix2D.field534 * var7 + var6;
        int var9 = 0;
        int var10 = this.field579;
        int var11 = this.field578;
        int var12 = Pix2D.field534 - var11;
        int var13 = 0;
        if (var7 < Pix2D.field536) {
            int var14 = Pix2D.field536 - var7;
            var10 -= var14;
            var7 = Pix2D.field536;
            var9 += var11 * var14;
            var8 += Pix2D.field534 * var14;
        }
        if (var7 + var10 > Pix2D.field537) {
            var10 -= var7 + var10 - Pix2D.field537;
        }
        if (var6 < Pix2D.field538) {
            int var15 = Pix2D.field538 - var6;
            var11 -= var15;
            var6 = Pix2D.field538;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > Pix2D.field539) {
            int var16 = var6 + var11 - Pix2D.field539;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method180(var8, 0, this.field577, arg0, var10, Pix2D.field533, var9, (byte) 8, var11, var12, var13);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(II[III[IIBIII)V")
    private void method180(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg3;
        if (arg7 != 8) {
            this.field572 = !this.field572;
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = -arg8; var14 < 0; var14++) {
                int var15 = arg2[arg6++];
                if (var15 == 0) {
                    arg0++;
                } else {
                    int var16 = arg5[arg0];
                    arg5[arg0++] = ((var15 & 0xFF00FF) * arg3 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg3 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg0 += arg9;
            arg6 += arg10;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(II[IIIIIIIZ[I)V")
    public void method181(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int[] arg10) {
        if (arg9) {
            this.field574 = !this.field574;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var16 = arg5 * var14 >> 8;
            int var17 = arg5 * var15 >> 8;
            int var18 = (arg6 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg4 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field534 * arg8 + arg7;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg2[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg10[var21]; var26 < 0; var26++) {
                    Pix2D.field533[var23++] = this.field577[(var24 >> 16) + (var25 >> 16) * this.field578];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field534;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(Lib;IIB)V")
    public void method182(Pix8 arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field580 + arg2;
        int var6 = this.field581 + arg1;
        int var7 = Pix2D.field534 * var6 + var5;
        int var8 = 0;
        if (arg3 != -15) {
            return;
        }
        int var9 = this.field579;
        int var10 = this.field578;
        int var11 = Pix2D.field534 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field536) {
            int var13 = Pix2D.field536 - var6;
            var9 -= var13;
            var6 = Pix2D.field536;
            var8 += var10 * var13;
            var7 += Pix2D.field534 * var13;
        }
        if (var6 + var9 > Pix2D.field537) {
            var9 -= var6 + var9 - Pix2D.field537;
        }
        if (var5 < Pix2D.field538) {
            int var14 = Pix2D.field538 - var5;
            var10 -= var14;
            var5 = Pix2D.field538;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field539) {
            int var15 = var5 + var10 - Pix2D.field539;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method183(var10, var12, 0, -478, var9, var8, Pix2D.field533, this.field577, var7, arg0.field588, var11);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIII[I[II[BI)V")
    private void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, byte[] arg9, int arg10) {
        if (arg3 >= 0) {
            return;
        }
        int var12 = -(arg0 >> 2);
        int var13 = -(arg0 & 0x3);
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg7[arg5++];
                if (var18 != 0 && arg9[arg8] == 0) {
                    arg6[arg8++] = var18;
                } else {
                    arg8++;
                }
                int var19 = arg7[arg5++];
                if (var19 != 0 && arg9[arg8] == 0) {
                    arg6[arg8++] = var19;
                } else {
                    arg8++;
                }
                int var20 = arg7[arg5++];
                if (var20 != 0 && arg9[arg8] == 0) {
                    arg6[arg8++] = var20;
                } else {
                    arg8++;
                }
                int var21 = arg7[arg5++];
                if (var21 != 0 && arg9[arg8] == 0) {
                    arg6[arg8++] = var21;
                } else {
                    arg8++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg7[arg5++];
                if (var17 != 0 && arg9[arg8] == 0) {
                    arg6[arg8++] = var17;
                } else {
                    arg8++;
                }
            }
            arg8 += arg10;
            arg5 += arg1;
        }
    }
}
