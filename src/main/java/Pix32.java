import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "hb", name = "x", descriptor = "Z")
    private boolean field572 = false;

    @OriginalMember(owner = "hb", name = "z", descriptor = "I")
    private int field574 = -359;

    @OriginalMember(owner = "hb", name = "A", descriptor = "B")
    private byte field575 = -100;

    @OriginalMember(owner = "hb", name = "B", descriptor = "B")
    private byte field576 = 3;

    @OriginalMember(owner = "hb", name = "C", descriptor = "B")
    private byte field577 = 5;

    @OriginalMember(owner = "hb", name = "D", descriptor = "I")
    private int field578 = 3;

    @OriginalMember(owner = "hb", name = "E", descriptor = "[I")
    public int[] field579;

    @OriginalMember(owner = "hb", name = "J", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "hb", name = "F", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "hb", name = "K", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "hb", name = "G", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "hb", name = "I", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "hb", name = "H", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "hb", name = "y", descriptor = "Z")
    private static boolean field573 = true;

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field579 = new int[arg0 * arg1];
        this.field580 = this.field584 = arg0;
        this.field581 = this.field585 = arg1;
        this.field582 = this.field583 = 0;
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field580 = var3.getWidth(arg1);
            this.field581 = var3.getHeight(arg1);
            this.field584 = this.field580;
            this.field585 = this.field581;
            this.field582 = 0;
            this.field583 = 0;
            this.field579 = new int[this.field581 * this.field580];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field580, this.field581, this.field579, 0, this.field580);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method249(arg1 + ".dat", true, null), field573);
        Packet var5 = new Packet(arg0.method249("index.dat", true, null), field573);
        var5.field622 = var4.method210();
        this.field584 = var5.method210();
        this.field585 = var5.method210();
        int var6 = var5.method208();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method212();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field622 += 2;
            var4.field622 += var5.method210() * var5.method210();
            var5.field622++;
        }
        this.field582 = var5.method208();
        this.field583 = var5.method208();
        this.field580 = var5.method210();
        this.field581 = var5.method210();
        int var10 = var5.method208();
        int var11 = this.field581 * this.field580;
        this.field579 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field579[var12] = var7[var4.method208()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field580; var13++) {
                for (int var14 = 0; var14 < this.field581; var14++) {
                    this.field579[this.field580 * var14 + var13] = var7[var4.method208()];
                }
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I)V")
    public void method169(int arg0) {
        Pix2D.method144(this.field580, true, this.field581, this.field579);
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(III)V")
    public void method170(int arg0, int arg1, int arg2) {
        int var4 = this.field582 + arg2;
        int var5 = this.field583 + arg1;
        int var6 = Pix2D.field535 * var5 + var4;
        int var7 = 0;
        int var8 = this.field581;
        int var9 = this.field580;
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
            this.method171(var9, var6, (byte) -100, this.field579, var10, var8, var11, var7, Pix2D.field534);
            while (arg0 >= 0) {
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIB[IIIII[I)V")
    private void method171(int arg0, int arg1, byte arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        if (this.field575 != arg2) {
            return;
        }
        for (int var12 = -arg5; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg8[arg1++] = arg3[arg7++];
                arg8[arg1++] = arg3[arg7++];
                arg8[arg1++] = arg3[arg7++];
                arg8[arg1++] = arg3[arg7++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg8[arg1++] = arg3[arg7++];
            }
            arg1 += arg4;
            arg7 += arg6;
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(III)V")
    public void method172(int arg0, int arg1, int arg2) {
        int var4 = this.field582 + arg0;
        int var5 = this.field583 + arg2;
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = Pix2D.field535 * var5 + var4;
        int var8 = 0;
        int var9 = this.field581;
        int var10 = this.field580;
        int var11 = Pix2D.field535 - var10;
        int var12 = 0;
        if (var5 < Pix2D.field537) {
            int var13 = Pix2D.field537 - var5;
            var9 -= var13;
            var5 = Pix2D.field537;
            var8 += var10 * var13;
            var7 += Pix2D.field535 * var13;
        }
        if (var5 + var9 > Pix2D.field538) {
            var9 -= var5 + var9 - Pix2D.field538;
        }
        if (var4 < Pix2D.field539) {
            int var14 = Pix2D.field539 - var4;
            var10 -= var14;
            var4 = Pix2D.field539;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field540) {
            int var15 = var4 + var10 - Pix2D.field540;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method173(Pix2D.field534, this.field579, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method173(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
    public void method174(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 == 7) {
            boolean var6 = false;
        }
        try {
            int var7 = this.field580;
            int var8 = this.field581;
            int var9 = 0;
            int var10 = 0;
            int var11 = (var7 << 16) / arg1;
            int var12 = (var8 << 16) / arg0;
            int var13 = this.field584;
            int var14 = this.field585;
            int var15 = (var13 << 16) / arg1;
            int var16 = (var14 << 16) / arg0;
            int var17 = (this.field582 * arg1 + var13 - 1) / var13 + arg3;
            int var18 = (this.field583 * arg0 + var14 - 1) / var14 + arg2;
            if (this.field582 * arg1 % var13 != 0) {
                var9 = (var13 - this.field582 * arg1 % var13 << 16) / arg1;
            }
            if (this.field583 * arg0 % var14 != 0) {
                var10 = (var14 - this.field583 * arg0 % var14 << 16) / arg0;
            }
            int var19 = (this.field580 - (var9 >> 16)) * arg1 / var13;
            int var20 = (this.field581 - (var10 >> 16)) * arg0 / var14;
            int var21 = Pix2D.field535 * var18 + var17;
            int var22 = Pix2D.field535 - var19;
            if (var18 < Pix2D.field537) {
                int var23 = Pix2D.field537 - var18;
                var20 -= var23;
                var18 = 0;
                var21 += Pix2D.field535 * var23;
                var10 += var16 * var23;
            }
            if (var18 + var20 > Pix2D.field538) {
                var20 -= var18 + var20 - Pix2D.field538;
            }
            if (var17 < Pix2D.field539) {
                int var24 = Pix2D.field539 - var17;
                var19 -= var24;
                var17 = 0;
                var21 += var24;
                var9 += var15 * var24;
                var22 += var24;
            }
            if (var17 + var19 > Pix2D.field540) {
                int var25 = var17 + var19 - Pix2D.field540;
                var19 -= var25;
                var22 += var25;
            }
            this.method175(var9, var22, Pix2D.field534, 0, this.field576, var10, var20, var19, var21, var16, this.field579, var7, var15);
        } catch (Exception var26) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(II[IIBIIIII[III)V")
    private void method175(int arg0, int arg1, int[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12) {
        if (arg4 != 3) {
            return;
        }
        boolean var14 = false;
        try {
            int var15 = arg0;
            for (int var16 = -arg6; var16 < 0; var16++) {
                int var17 = (arg5 >> 16) * arg11;
                for (int var18 = -arg7; var18 < 0; var18++) {
                    int var19 = arg10[(arg0 >> 16) + var17];
                    if (var19 == 0) {
                        arg8++;
                    } else {
                        arg2[arg8++] = var19;
                    }
                    arg0 += arg12;
                }
                arg5 += arg9;
                arg0 = var15;
                arg8 += arg1;
            }
        } catch (Exception var20) {
            System.out.println("error in plot_scale");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IBII)V")
    public void method176(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field577 == arg1) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = this.field582 + arg0;
        int var8 = this.field583 + arg2;
        int var9 = Pix2D.field535 * var8 + var7;
        int var10 = 0;
        int var11 = this.field581;
        int var12 = this.field580;
        int var13 = Pix2D.field535 - var12;
        int var14 = 0;
        if (var8 < Pix2D.field537) {
            int var15 = Pix2D.field537 - var8;
            var11 -= var15;
            var8 = Pix2D.field537;
            var10 += var12 * var15;
            var9 += Pix2D.field535 * var15;
        }
        if (var8 + var11 > Pix2D.field538) {
            var11 -= var8 + var11 - Pix2D.field538;
        }
        if (var7 < Pix2D.field539) {
            int var16 = Pix2D.field539 - var7;
            var12 -= var16;
            var7 = Pix2D.field539;
            var10 += var16;
            var9 += var16;
            var14 += var16;
            var13 += var16;
        }
        if (var7 + var12 > Pix2D.field540) {
            int var17 = var7 + var12 - Pix2D.field540;
            var12 -= var17;
            var14 += var17;
            var13 += var17;
        }
        if (var12 > 0 && var11 > 0) {
            this.method177(arg3, -583, var12, 0, var13, var11, this.field579, var10, Pix2D.field534, var9, var14);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIII[II[III)V")
    private void method177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg0;
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = arg6[arg7++];
                if (var15 == 0) {
                    arg9++;
                } else {
                    int var16 = arg8[arg9];
                    arg8[arg9++] = ((var15 & 0xFF00FF) * arg0 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg0 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg9 += arg4;
            arg7 += arg10;
        }
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I[IIIIIIII[I)V")
    public void method178(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        if (arg5 < 4 || arg5 > 4) {
            field573 = true;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg6 / 2;
            int var13 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
            int var15 = (arg0 << 16) + var11 * var14 + var12 * var13;
            int var16 = (arg4 << 16) + (var12 * var14 - var11 * var13);
            int var17 = Pix2D.field535 * arg3 + arg8;
            for (int var18 = 0; var18 < arg6; var18++) {
                int var19 = arg9[var18];
                int var20 = var17 + var19;
                int var21 = var14 * var19 + var15;
                int var22 = var16 - var13 * var19;
                for (int var23 = -arg1[var18]; var23 < 0; var23++) {
                    Pix2D.field534[var20++] = this.field579[(var21 >> 16) + (var22 >> 16) * this.field580];
                    var21 += var14;
                    var22 -= var13;
                }
                var15 += var13;
                var16 += var14;
                var17 += Pix2D.field535;
            }
        } catch (Exception var24) {
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(ILib;ZI)V")
    public void method179(int arg0, Pix8 arg1, boolean arg2, int arg3) {
        int var5 = this.field582 + arg3;
        int var6 = this.field583 + arg0;
        int var7 = Pix2D.field535 * var6 + var5;
        int var8 = 0;
        if (arg2) {
            return;
        }
        int var9 = this.field581;
        int var10 = this.field580;
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
            this.method180((byte) -20, var8, var12, arg1.field593, var7, var9, 0, var10, this.field579, Pix2D.field534, var11);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(BII[BIIII[I[II)V")
    private void method180(byte arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9, int arg10) {
        int var12 = -(arg7 >> 2);
        int var13 = -(arg7 & 0x3);
        if (arg0 != -20) {
            this.field572 = !this.field572;
        }
        for (int var14 = -arg5; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg8[arg1++];
                if (var18 != 0 && arg3[arg4] == 0) {
                    arg9[arg4++] = var18;
                } else {
                    arg4++;
                }
                int var19 = arg8[arg1++];
                if (var19 != 0 && arg3[arg4] == 0) {
                    arg9[arg4++] = var19;
                } else {
                    arg4++;
                }
                int var20 = arg8[arg1++];
                if (var20 != 0 && arg3[arg4] == 0) {
                    arg9[arg4++] = var20;
                } else {
                    arg4++;
                }
                int var21 = arg8[arg1++];
                if (var21 != 0 && arg3[arg4] == 0) {
                    arg9[arg4++] = var21;
                } else {
                    arg4++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg8[arg1++];
                if (var17 != 0 && arg3[arg4] == 0) {
                    arg9[arg4++] = var17;
                } else {
                    arg4++;
                }
            }
            arg4 += arg10;
            arg1 += arg2;
        }
    }
}
