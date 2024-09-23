import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "hb", name = "x", descriptor = "Z")
    private boolean field573 = false;

    @OriginalMember(owner = "hb", name = "y", descriptor = "B")
    private byte field574 = 120;

    @OriginalMember(owner = "hb", name = "z", descriptor = "I")
    private int field575 = 1;

    @OriginalMember(owner = "hb", name = "A", descriptor = "I")
    private int field576 = 48612;

    @OriginalMember(owner = "hb", name = "B", descriptor = "Z")
    private boolean field577 = false;

    @OriginalMember(owner = "hb", name = "C", descriptor = "[I")
    public int[] field578;

    @OriginalMember(owner = "hb", name = "H", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "hb", name = "D", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "hb", name = "I", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "hb", name = "E", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "hb", name = "G", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "hb", name = "F", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field578 = new int[arg0 * arg1];
        this.field579 = this.field583 = arg0;
        this.field580 = this.field584 = arg1;
        this.field581 = this.field582 = 0;
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field579 = var3.getWidth(arg1);
            this.field580 = var3.getHeight(arg1);
            this.field583 = this.field579;
            this.field584 = this.field580;
            this.field581 = 0;
            this.field582 = 0;
            this.field578 = new int[this.field580 * this.field579];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field579, this.field580, this.field578, 0, this.field579);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(0, arg0.method250(arg1 + ".dat", null, 8));
        Packet var5 = new Packet(0, arg0.method250("index.dat", null, 8));
        var5.field621 = var4.method211();
        this.field583 = var5.method211();
        this.field584 = var5.method211();
        int var6 = var5.method209();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method213();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field621 += 2;
            var4.field621 += var5.method211() * var5.method211();
            var5.field621++;
        }
        this.field581 = var5.method209();
        this.field582 = var5.method209();
        this.field579 = var5.method211();
        this.field580 = var5.method211();
        int var10 = var5.method209();
        int var11 = this.field580 * this.field579;
        this.field578 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field578[var12] = var7[var4.method209()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field579; var13++) {
                for (int var14 = 0; var14 < this.field580; var14++) {
                    this.field578[this.field579 * var14 + var13] = var7[var4.method209()];
                }
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(B)V")
    public void method170(byte arg0) {
        if (this.field574 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Pix2D.method145((byte) 2, this.field580, this.field578, this.field579);
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IZI)V")
    public void method171(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field576 = -119;
        }
        int var4 = this.field581 + arg0;
        int var5 = this.field582 + arg2;
        int var6 = Pix2D.field535 * var5 + var4;
        int var7 = 0;
        int var8 = this.field580;
        int var9 = this.field579;
        int var10 = Pix2D.field535 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field537) {
            int var12 = Pix2D.field537 - var5;
            var8 -= var12;
            var5 = Pix2D.field537;
            var7 += var9 * var12;
            var6 += Pix2D.field535 * var12;
        }
        if (var5 + var8 > Pix2D.field538) {
            var8 -= var5 + var8 - Pix2D.field538;
        }
        if (var4 < Pix2D.field539) {
            int var13 = Pix2D.field539 - var4;
            var9 -= var13;
            var4 = Pix2D.field539;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field540) {
            int var14 = var4 + var9 - Pix2D.field540;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method172(Pix2D.field534, var8, var6, var10, (byte) 3, var11, this.field578, var9, var7);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IIIIBI[III)V")
    private void method172(int[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        if (arg4 == 3) {
            boolean var12 = false;
        } else {
            this.field576 = -315;
        }
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg0[arg2++] = arg6[arg8++];
                arg0[arg2++] = arg6[arg8++];
                arg0[arg2++] = arg6[arg8++];
                arg0[arg2++] = arg6[arg8++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg0[arg2++] = arg6[arg8++];
            }
            arg2 += arg3;
            arg8 += arg5;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(III)V")
    public void method173(int arg0, int arg1, int arg2) {
        int var4 = this.field581 + arg1;
        int var5 = this.field582 + arg2;
        int var6 = Pix2D.field535 * var5 + var4;
        int var7 = 0;
        int var8 = this.field580;
        int var9 = this.field579;
        int var10 = Pix2D.field535 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field537) {
            int var12 = Pix2D.field537 - var5;
            var8 -= var12;
            var5 = Pix2D.field537;
            var7 += var9 * var12;
            var6 += Pix2D.field535 * var12;
        }
        if (var5 + var8 > Pix2D.field538) {
            var8 -= var5 + var8 - Pix2D.field538;
        }
        if (var4 < Pix2D.field539) {
            int var13 = Pix2D.field539 - var4;
            var9 -= var13;
            var4 = Pix2D.field539;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field540) {
            int var14 = var4 + var9 - Pix2D.field540;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method174(Pix2D.field534, this.field578, 0, var7, var6, var9, var8, var10, var11);
            if (arg0 < 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method174(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIBII)V")
    public void method175(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 4) {
            return;
        }
        try {
            int var6 = this.field579;
            int var7 = this.field580;
            int var8 = 0;
            int var9 = 0;
            int var10 = (var6 << 16) / arg4;
            int var11 = (var7 << 16) / arg3;
            int var12 = this.field583;
            int var13 = this.field584;
            int var14 = (var12 << 16) / arg4;
            int var15 = (var13 << 16) / arg3;
            int var16 = (this.field581 * arg4 + var12 - 1) / var12 + arg0;
            int var17 = (this.field582 * arg3 + var13 - 1) / var13 + arg1;
            if (this.field581 * arg4 % var12 != 0) {
                var8 = (var12 - this.field581 * arg4 % var12 << 16) / arg4;
            }
            if (this.field582 * arg3 % var13 != 0) {
                var9 = (var13 - this.field582 * arg3 % var13 << 16) / arg3;
            }
            int var18 = (this.field579 - (var8 >> 16)) * arg4 / var12;
            int var19 = (this.field580 - (var9 >> 16)) * arg3 / var13;
            int var20 = Pix2D.field535 * var17 + var16;
            int var21 = Pix2D.field535 - var18;
            if (var17 < Pix2D.field537) {
                int var22 = Pix2D.field537 - var17;
                var19 -= var22;
                var17 = 0;
                var20 += Pix2D.field535 * var22;
                var9 += var15 * var22;
            }
            if (var17 + var19 > Pix2D.field538) {
                var19 -= var17 + var19 - Pix2D.field538;
            }
            if (var16 < Pix2D.field539) {
                int var23 = Pix2D.field539 - var16;
                var18 -= var23;
                var16 = 0;
                var20 += var23;
                var8 += var14 * var23;
                var21 += var23;
            }
            if (var16 + var18 > Pix2D.field540) {
                int var24 = var16 + var18 - Pix2D.field540;
                var18 -= var24;
                var21 += var24;
            }
            this.method176(var9, var14, var19, var21, var6, var20, -984, Pix2D.field534, var18, var8, var15, 0, this.field578);
        } catch (Exception var25) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIII[IIIII[I)V")
    private void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12) {
        if (arg6 >= 0) {
            return;
        }
        try {
            int var14 = arg9;
            for (int var15 = -arg2; var15 < 0; var15++) {
                int var16 = (arg0 >> 16) * arg4;
                for (int var17 = -arg8; var17 < 0; var17++) {
                    int var18 = arg12[(arg9 >> 16) + var16];
                    if (var18 == 0) {
                        arg5++;
                    } else {
                        arg7[arg5++] = var18;
                    }
                    arg9 += arg1;
                }
                arg0 += arg10;
                arg9 = var14;
                arg5 += arg3;
            }
        } catch (Exception var19) {
            System.out.println("error in plot_scale");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIZ)V")
    public void method177(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field581 + arg1;
        int var6 = this.field582 + arg0;
        if (arg3) {
            return;
        }
        int var7 = Pix2D.field535 * var6 + var5;
        int var8 = 0;
        int var9 = this.field580;
        int var10 = this.field579;
        int var11 = Pix2D.field535 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field537) {
            int var13 = Pix2D.field537 - var6;
            var9 -= var13;
            var6 = Pix2D.field537;
            var8 += var10 * var13;
            var7 += Pix2D.field535 * var13;
        }
        if (var6 + var9 > Pix2D.field538) {
            var9 -= var6 + var9 - Pix2D.field538;
        }
        if (var5 < Pix2D.field539) {
            int var14 = Pix2D.field539 - var5;
            var10 -= var14;
            var5 = Pix2D.field539;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field540) {
            int var15 = var5 + var10 - Pix2D.field540;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method178(var9, var10, var8, this.field578, false, var7, Pix2D.field534, arg2, var12, 0, var11);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(III[IZI[IIIII)V")
    private void method178(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg7;
        if (arg4) {
            return;
        }
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = arg3[arg2++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    int var16 = arg6[arg5];
                    arg6[arg5++] = ((var15 & 0xFF00FF) * arg7 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg7 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg5 += arg10;
            arg2 += arg8;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIIII[I[II)V")
    public void method179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9, int arg10) {
        if (arg4 != 0) {
            return;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg10 / 2;
            int var14 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
            int var16 = arg6 * var14 >> 8;
            int var17 = arg6 * var15 >> 8;
            int var18 = (arg0 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg3 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field535 * arg7 + arg2;
            for (int var21 = 0; var21 < arg10; var21++) {
                int var22 = arg9[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg8[var21]; var26 < 0; var26++) {
                    Pix2D.field534[var23++] = this.field578[(var24 >> 16) + (var25 >> 16) * this.field579];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field535;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IILib;I)V")
    public void method180(int arg0, int arg1, Pix8 arg2, int arg3) {
        int var5 = this.field581 + arg0;
        int var6 = this.field582 + arg1;
        int var7 = Pix2D.field535 * var6 + var5;
        int var8 = 0;
        int var9 = this.field580;
        int var10 = this.field579;
        int var11 = Pix2D.field535 - var10;
        int var12 = 0;
        if (this.field575 != arg3) {
            return;
        }
        if (var6 < Pix2D.field537) {
            int var13 = Pix2D.field537 - var6;
            var9 -= var13;
            var6 = Pix2D.field537;
            var8 += var10 * var13;
            var7 += Pix2D.field535 * var13;
        }
        if (var6 + var9 > Pix2D.field538) {
            var9 -= var6 + var9 - Pix2D.field538;
        }
        if (var5 < Pix2D.field539) {
            int var14 = Pix2D.field539 - var5;
            var10 -= var14;
            var5 = Pix2D.field539;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field540) {
            int var15 = var5 + var10 - Pix2D.field540;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method181(var7, 0, (byte) 0, this.field578, Pix2D.field534, arg2.field590, var11, var10, var9, var12, var8);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIB[I[I[BIIIII)V")
    private void method181(int arg0, int arg1, byte arg2, int[] arg3, int[] arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg2 != 0) {
            return;
        }
        int var12 = -(arg7 >> 2);
        int var13 = -(arg7 & 0x3);
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg3[arg10++];
                if (var18 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var18;
                } else {
                    arg0++;
                }
                int var19 = arg3[arg10++];
                if (var19 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var19;
                } else {
                    arg0++;
                }
                int var20 = arg3[arg10++];
                if (var20 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var20;
                } else {
                    arg0++;
                }
                int var21 = arg3[arg10++];
                if (var21 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var21;
                } else {
                    arg0++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg3[arg10++];
                if (var17 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var17;
                } else {
                    arg0++;
                }
            }
            arg0 += arg6;
            arg10 += arg9;
        }
    }
}
