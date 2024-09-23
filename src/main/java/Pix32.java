import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "hb", name = "v", descriptor = "Z")
    private boolean field569 = false;

    @OriginalMember(owner = "hb", name = "w", descriptor = "I")
    private int field570 = -107;

    @OriginalMember(owner = "hb", name = "x", descriptor = "Z")
    private boolean field571 = false;

    @OriginalMember(owner = "hb", name = "y", descriptor = "[I")
    public int[] field572;

    @OriginalMember(owner = "hb", name = "D", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "hb", name = "z", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "hb", name = "E", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "hb", name = "A", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "hb", name = "C", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "hb", name = "B", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field572 = new int[arg0 * arg1];
        this.field573 = this.field577 = arg0;
        this.field574 = this.field578 = arg1;
        this.field575 = this.field576 = 0;
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field573 = var3.getWidth(arg1);
            this.field574 = var3.getHeight(arg1);
            this.field577 = this.field573;
            this.field578 = this.field574;
            this.field575 = 0;
            this.field576 = 0;
            this.field572 = new int[this.field574 * this.field573];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field573, this.field574, this.field572, 0, this.field573);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(575, arg0.method250(null, 3, arg1 + ".dat"));
        Packet var5 = new Packet(575, arg0.method250(null, 3, "index.dat"));
        var5.field612 = var4.method211();
        this.field577 = var5.method211();
        this.field578 = var5.method211();
        int var6 = var5.method209();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method213();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field612 += 2;
            var4.field612 += var5.method211() * var5.method211();
            var5.field612++;
        }
        this.field575 = var5.method209();
        this.field576 = var5.method209();
        this.field573 = var5.method211();
        this.field574 = var5.method211();
        int var10 = var5.method209();
        int var11 = this.field574 * this.field573;
        this.field572 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field572[var12] = var7[var4.method209()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field573; var13++) {
                for (int var14 = 0; var14 < this.field574; var14++) {
                    this.field572[this.field573 * var14 + var13] = var7[var4.method209()];
                }
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I)V")
    public void method170(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Pix2D.method145(this.field574, this.field572, (byte) -67, this.field573);
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(III)V")
    public void method171(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = this.field575 + arg0;
        int var6 = this.field576 + arg2;
        int var7 = Pix2D.field533 * var6 + var5;
        int var8 = 0;
        int var9 = this.field574;
        int var10 = this.field573;
        int var11 = Pix2D.field533 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field535) {
            int var13 = Pix2D.field535 - var6;
            var9 -= var13;
            var6 = Pix2D.field535;
            var8 += var10 * var13;
            var7 += Pix2D.field533 * var13;
        }
        if (var6 + var9 > Pix2D.field536) {
            var9 -= var6 + var9 - Pix2D.field536;
        }
        if (var5 < Pix2D.field537) {
            int var14 = Pix2D.field537 - var5;
            var10 -= var14;
            var5 = Pix2D.field537;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field538) {
            int var15 = var5 + var10 - Pix2D.field538;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method172(true, var11, var12, Pix2D.field532, var9, var10, var7, var8, this.field572);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(ZII[IIIII[I)V")
    private void method172(boolean arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg4; var12 < 0; var12++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg3[arg6++] = arg8[arg7++];
                arg3[arg6++] = arg8[arg7++];
                arg3[arg6++] = arg8[arg7++];
                arg3[arg6++] = arg8[arg7++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg3[arg6++] = arg8[arg7++];
            }
            arg6 += arg1;
            arg7 += arg2;
        }
        if (!arg0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(III)V")
    public void method173(int arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        int var4 = this.field575 + arg0;
        int var5 = this.field576 + arg1;
        int var6 = Pix2D.field533 * var5 + var4;
        int var7 = 0;
        int var8 = this.field574;
        int var9 = this.field573;
        int var10 = Pix2D.field533 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field535) {
            int var12 = Pix2D.field535 - var5;
            var8 -= var12;
            var5 = Pix2D.field535;
            var7 += var9 * var12;
            var6 += Pix2D.field533 * var12;
        }
        if (var5 + var8 > Pix2D.field536) {
            var8 -= var5 + var8 - Pix2D.field536;
        }
        if (var4 < Pix2D.field537) {
            int var13 = Pix2D.field537 - var4;
            var9 -= var13;
            var4 = Pix2D.field537;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field538) {
            int var14 = var4 + var9 - Pix2D.field538;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method174(Pix2D.field532, this.field572, 0, var7, var6, var9, var8, var10, var11);
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

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIB)V")
    public void method175(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 == 8) {
            boolean var6 = false;
        } else {
            this.field569 = !this.field569;
        }
        try {
            int var7 = this.field573;
            int var8 = this.field574;
            int var9 = 0;
            int var10 = 0;
            int var11 = (var7 << 16) / arg1;
            int var12 = (var8 << 16) / arg0;
            int var13 = this.field577;
            int var14 = this.field578;
            int var15 = (var13 << 16) / arg1;
            int var16 = (var14 << 16) / arg0;
            int var17 = (this.field575 * arg1 + var13 - 1) / var13 + arg3;
            int var18 = (this.field576 * arg0 + var14 - 1) / var14 + arg2;
            if (this.field575 * arg1 % var13 != 0) {
                var9 = (var13 - this.field575 * arg1 % var13 << 16) / arg1;
            }
            if (this.field576 * arg0 % var14 != 0) {
                var10 = (var14 - this.field576 * arg0 % var14 << 16) / arg0;
            }
            int var19 = (this.field573 - (var9 >> 16)) * arg1 / var13;
            int var20 = (this.field574 - (var10 >> 16)) * arg0 / var14;
            int var21 = Pix2D.field533 * var18 + var17;
            int var22 = Pix2D.field533 - var19;
            if (var18 < Pix2D.field535) {
                int var23 = Pix2D.field535 - var18;
                var20 -= var23;
                var18 = 0;
                var21 += Pix2D.field533 * var23;
                var10 += var16 * var23;
            }
            if (var18 + var20 > Pix2D.field536) {
                var20 -= var18 + var20 - Pix2D.field536;
            }
            if (var17 < Pix2D.field537) {
                int var24 = Pix2D.field537 - var17;
                var19 -= var24;
                var17 = 0;
                var21 += var24;
                var9 += var15 * var24;
                var22 += var24;
            }
            if (var17 + var19 > Pix2D.field538) {
                int var25 = var17 + var19 - Pix2D.field538;
                var19 -= var25;
                var22 += var25;
            }
            this.method176(8, var7, var19, var22, var21, var15, var20, 0, this.field572, var9, Pix2D.field532, var16, var10);
        } catch (Exception var26) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIIII[II[III)V")
    private void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int[] arg10, int arg11, int arg12) {
        if (arg0 != 8) {
            this.field571 = !this.field571;
        }
        try {
            int var14 = arg9;
            for (int var15 = -arg6; var15 < 0; var15++) {
                int var16 = (arg12 >> 16) * arg1;
                for (int var17 = -arg2; var17 < 0; var17++) {
                    int var18 = arg8[(arg9 >> 16) + var16];
                    if (var18 == 0) {
                        arg4++;
                    } else {
                        arg10[arg4++] = var18;
                    }
                    arg9 += arg5;
                }
                arg12 += arg11;
                arg9 = var14;
                arg4 += arg3;
            }
        } catch (Exception var19) {
            System.out.println("error in plot_scale");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIII)V")
    public void method177(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field575 + arg0;
        int var6 = this.field576 + arg3;
        int var7 = Pix2D.field533 * var6 + var5;
        int var8 = 0;
        if (arg2 <= 0) {
            this.field571 = !this.field571;
        }
        int var9 = this.field574;
        int var10 = this.field573;
        int var11 = Pix2D.field533 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field535) {
            int var13 = Pix2D.field535 - var6;
            var9 -= var13;
            var6 = Pix2D.field535;
            var8 += var10 * var13;
            var7 += Pix2D.field533 * var13;
        }
        if (var6 + var9 > Pix2D.field536) {
            var9 -= var6 + var9 - Pix2D.field536;
        }
        if (var5 < Pix2D.field537) {
            int var14 = Pix2D.field537 - var5;
            var10 -= var14;
            var5 = Pix2D.field537;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field538) {
            int var15 = var5 + var10 - Pix2D.field538;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method178(var12, var10, true, var9, 0, arg1, this.field572, var7, var11, Pix2D.field532, var8);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIZIII[III[II)V")
    private void method178(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9, int arg10) {
        if (!arg2) {
            return;
        }
        int var12 = 256 - arg5;
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = arg6[arg10++];
                if (var15 == 0) {
                    arg7++;
                } else {
                    int var16 = arg9[arg7];
                    arg9[arg7++] = ((var15 & 0xFF00FF) * arg5 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg5 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg7 += arg8;
            arg10 += arg0;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(II[IIIII[IIII)V")
    public void method179(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg0 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg10 / 2;
            int var14 = -arg3 / 2;
            int var15 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var17 = arg8 * var15 >> 8;
            int var18 = arg8 * var16 >> 8;
            int var19 = (arg9 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg5 << 16) + (var14 * var18 - var13 * var17);
            int var21 = Pix2D.field533 * arg4 + arg1;
            for (int var22 = 0; var22 < arg3; var22++) {
                int var23 = arg2[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg7[var22]; var27 < 0; var27++) {
                    Pix2D.field532[var24++] = this.field572[(var25 >> 16) + (var26 >> 16) * this.field573];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += Pix2D.field533;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIILib;)V")
    public void method180(int arg0, int arg1, int arg2, Pix8 arg3) {
        int var5 = this.field575 + arg0;
        int var6 = this.field576 + arg2;
        if (arg1 != 9) {
            return;
        }
        int var7 = Pix2D.field533 * var6 + var5;
        int var8 = 0;
        int var9 = this.field574;
        int var10 = this.field573;
        int var11 = Pix2D.field533 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field535) {
            int var13 = Pix2D.field535 - var6;
            var9 -= var13;
            var6 = Pix2D.field535;
            var8 += var10 * var13;
            var7 += Pix2D.field533 * var13;
        }
        if (var6 + var9 > Pix2D.field536) {
            var9 -= var6 + var9 - Pix2D.field536;
        }
        if (var5 < Pix2D.field537) {
            int var14 = Pix2D.field537 - var5;
            var10 -= var14;
            var5 = Pix2D.field537;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field538) {
            int var15 = var5 + var10 - Pix2D.field538;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method181(var7, (byte) 1, var9, var11, var12, arg3.field582, var10, 0, this.field572, Pix2D.field532, var8);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IBIII[BII[I[II)V")
    private void method181(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int[] arg8, int[] arg9, int arg10) {
        int var12 = -(arg6 >> 2);
        if (arg1 == 1) {
            boolean var13 = false;
        } else {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        int var15 = -(arg6 & 0x3);
        for (int var16 = -arg2; var16 < 0; var16++) {
            for (int var17 = var12; var17 < 0; var17++) {
                int var20 = arg8[arg10++];
                if (var20 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var20;
                } else {
                    arg0++;
                }
                int var21 = arg8[arg10++];
                if (var21 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var21;
                } else {
                    arg0++;
                }
                int var22 = arg8[arg10++];
                if (var22 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var22;
                } else {
                    arg0++;
                }
                int var23 = arg8[arg10++];
                if (var23 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var23;
                } else {
                    arg0++;
                }
            }
            for (int var18 = var15; var18 < 0; var18++) {
                int var19 = arg8[arg10++];
                if (var19 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var19;
                } else {
                    arg0++;
                }
            }
            arg0 += arg3;
            arg10 += arg4;
        }
    }
}
