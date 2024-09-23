import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "hb", name = "x", descriptor = "Z")
    private boolean field576 = false;

    @OriginalMember(owner = "hb", name = "z", descriptor = "Z")
    private boolean field578 = true;

    @OriginalMember(owner = "hb", name = "A", descriptor = "I")
    private int field579 = 5;

    @OriginalMember(owner = "hb", name = "B", descriptor = "[I")
    public int[] field580;

    @OriginalMember(owner = "hb", name = "G", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "hb", name = "C", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "hb", name = "H", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "hb", name = "D", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "hb", name = "F", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "hb", name = "E", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "hb", name = "w", descriptor = "B")
    private static byte field575 = 4;

    @OriginalMember(owner = "hb", name = "y", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field580 = new int[arg0 * arg1];
        this.field581 = this.field585 = arg0;
        this.field582 = this.field586 = arg1;
        this.field583 = this.field584 = 0;
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field581 = var3.getWidth(arg1);
            this.field582 = var3.getHeight(arg1);
            this.field585 = this.field581;
            this.field586 = this.field582;
            this.field583 = 0;
            this.field584 = 0;
            this.field580 = new int[this.field582 * this.field581];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field581, this.field582, this.field580, 0, this.field581);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method250(field575, arg1 + ".dat", null), 0);
        Packet var5 = new Packet(arg0.method250(field575, "index.dat", null), 0);
        var5.field623 = var4.method211();
        this.field585 = var5.method211();
        this.field586 = var5.method211();
        int var6 = var5.method209();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method213();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field623 += 2;
            var4.field623 += var5.method211() * var5.method211();
            var5.field623++;
        }
        this.field583 = var5.method209();
        this.field584 = var5.method209();
        this.field581 = var5.method211();
        this.field582 = var5.method211();
        int var10 = var5.method209();
        int var11 = this.field582 * this.field581;
        this.field580 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field580[var12] = var7[var4.method209()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field581; var13++) {
                for (int var14 = 0; var14 < this.field582; var14++) {
                    this.field580[this.field581 * var14 + var13] = var7[var4.method209()];
                }
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I)V")
    public void method170(int arg0) {
        Pix2D.method145(this.field580, this.field581, this.field582, (byte) 6);
        if (this.field577 != arg0) {
            this.field579 = -430;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIZ)V")
    public void method171(int arg0, int arg1, boolean arg2) {
        int var4 = this.field583 + arg1;
        int var5 = this.field584 + arg0;
        int var6 = Pix2D.field540 * var5 + var4;
        int var7 = 0;
        int var8 = this.field582;
        int var9 = this.field581;
        int var10 = Pix2D.field540 - var9;
        int var11 = 0;
        if (!arg2) {
            this.field579 = -492;
        }
        if (var5 < Pix2D.field542) {
            int var12 = Pix2D.field542 - var5;
            var8 -= var12;
            var5 = Pix2D.field542;
            var7 += var9 * var12;
            var6 += Pix2D.field540 * var12;
        }
        if (var5 + var8 > Pix2D.field543) {
            var8 -= var5 + var8 - Pix2D.field543;
        }
        if (var4 < Pix2D.field544) {
            int var13 = Pix2D.field544 - var4;
            var9 -= var13;
            var4 = Pix2D.field544;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field545) {
            int var14 = var4 + var9 - Pix2D.field545;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method172(var8, var11, var10, var6, (byte) 5, this.field580, var7, Pix2D.field539, var9);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIB[II[II)V")
    private void method172(int arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, int[] arg7, int arg8) {
        int var10 = -(arg8 >> 2);
        int var11 = -(arg8 & 0x3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg7[arg3++] = arg5[arg6++];
                arg7[arg3++] = arg5[arg6++];
                arg7[arg3++] = arg5[arg6++];
                arg7[arg3++] = arg5[arg6++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg7[arg3++] = arg5[arg6++];
            }
            arg3 += arg2;
            arg6 += arg1;
        }
        if (arg4 == 5) {
            boolean var13 = false;
        } else {
            this.field578 = !this.field578;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IZI)V")
    public void method173(int arg0, boolean arg1, int arg2) {
        int var4 = this.field583 + arg2;
        int var5 = this.field584 + arg0;
        int var6 = Pix2D.field540 * var5 + var4;
        int var7 = 0;
        if (!arg1) {
            return;
        }
        int var8 = this.field582;
        int var9 = this.field581;
        int var10 = Pix2D.field540 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field542) {
            int var12 = Pix2D.field542 - var5;
            var8 -= var12;
            var5 = Pix2D.field542;
            var7 += var9 * var12;
            var6 += Pix2D.field540 * var12;
        }
        if (var5 + var8 > Pix2D.field543) {
            var8 -= var5 + var8 - Pix2D.field543;
        }
        if (var4 < Pix2D.field544) {
            int var13 = Pix2D.field544 - var4;
            var9 -= var13;
            var4 = Pix2D.field544;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field545) {
            int var14 = var4 + var9 - Pix2D.field545;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method174(Pix2D.field539, this.field580, 0, var7, var6, var9, var8, var10, var11);
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

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIZI)V")
    public void method175(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            return;
        }
        try {
            int var6 = this.field581;
            int var7 = this.field582;
            int var8 = 0;
            int var9 = 0;
            int var10 = (var6 << 16) / arg0;
            int var11 = (var7 << 16) / arg4;
            int var12 = this.field585;
            int var13 = this.field586;
            int var14 = (var12 << 16) / arg0;
            int var15 = (var13 << 16) / arg4;
            int var16 = (this.field583 * arg0 + var12 - 1) / var12 + arg2;
            int var17 = (this.field584 * arg4 + var13 - 1) / var13 + arg1;
            if (this.field583 * arg0 % var12 != 0) {
                var8 = (var12 - this.field583 * arg0 % var12 << 16) / arg0;
            }
            if (this.field584 * arg4 % var13 != 0) {
                var9 = (var13 - this.field584 * arg4 % var13 << 16) / arg4;
            }
            int var18 = (this.field581 - (var8 >> 16)) * arg0 / var12;
            int var19 = (this.field582 - (var9 >> 16)) * arg4 / var13;
            int var20 = Pix2D.field540 * var17 + var16;
            int var21 = Pix2D.field540 - var18;
            if (var17 < Pix2D.field542) {
                int var22 = Pix2D.field542 - var17;
                var19 -= var22;
                var17 = 0;
                var20 += Pix2D.field540 * var22;
                var9 += var15 * var22;
            }
            if (var17 + var19 > Pix2D.field543) {
                var19 -= var17 + var19 - Pix2D.field543;
            }
            if (var16 < Pix2D.field544) {
                int var23 = Pix2D.field544 - var16;
                var18 -= var23;
                var16 = 0;
                var20 += var23;
                var8 += var14 * var23;
                var21 += var23;
            }
            if (var16 + var18 > Pix2D.field545) {
                int var24 = var16 + var18 - Pix2D.field545;
                var18 -= var24;
                var21 += var24;
            }
            this.method176(var15, false, var9, var19, var8, var18, Pix2D.field539, var14, this.field580, var21, 0, var6, var20);
        } catch (Exception var25) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IZIIII[II[IIIII)V")
    private void method176(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg1) {
            this.field578 = !this.field578;
        }
        try {
            int var14 = arg4;
            for (int var15 = -arg3; var15 < 0; var15++) {
                int var16 = (arg2 >> 16) * arg11;
                for (int var17 = -arg5; var17 < 0; var17++) {
                    int var18 = arg8[(arg4 >> 16) + var16];
                    if (var18 == 0) {
                        arg12++;
                    } else {
                        arg6[arg12++] = var18;
                    }
                    arg4 += arg7;
                }
                arg2 += arg0;
                arg4 = var14;
                arg12 += arg9;
            }
        } catch (Exception var19) {
            System.out.println("error in plot_scale");
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIZ)V")
    public void method177(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return;
        }
        int var5 = this.field583 + arg0;
        int var6 = this.field584 + arg2;
        int var7 = Pix2D.field540 * var6 + var5;
        int var8 = 0;
        int var9 = this.field582;
        int var10 = this.field581;
        int var11 = Pix2D.field540 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field542) {
            int var13 = Pix2D.field542 - var6;
            var9 -= var13;
            var6 = Pix2D.field542;
            var8 += var10 * var13;
            var7 += Pix2D.field540 * var13;
        }
        if (var6 + var9 > Pix2D.field543) {
            var9 -= var6 + var9 - Pix2D.field543;
        }
        if (var5 < Pix2D.field544) {
            int var14 = Pix2D.field544 - var5;
            var10 -= var14;
            var5 = Pix2D.field544;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field545) {
            int var15 = var5 + var10 - Pix2D.field545;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method178((byte) 0, var8, var7, var11, this.field580, Pix2D.field539, var10, var12, var9, 0, arg1);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(BIII[I[IIIIII)V")
    private void method178(byte arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg10;
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = arg4[arg1++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg5[arg2];
                    arg5[arg2++] = ((var15 & 0xFF00FF) * arg10 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg10 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg3;
            arg1 += arg7;
        }
        if (arg0 != 0) {
            this.field578 = !this.field578;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IIIIIII[IIII)V")
    public void method179(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg8 != 0) {
            return;
        }
        try {
            int var12 = -arg10 / 2;
            int var13 = -arg1 / 2;
            int var14 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var16 = arg2 * var14 >> 8;
            int var17 = arg2 * var15 >> 8;
            int var18 = (arg5 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg3 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field540 * arg4 + arg6;
            for (int var21 = 0; var21 < arg1; var21++) {
                int var22 = arg7[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg0[var21]; var26 < 0; var26++) {
                    Pix2D.field539[var23++] = this.field580[(var24 >> 16) + (var25 >> 16) * this.field581];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field540;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(ILib;II)V")
    public void method180(int arg0, Pix8 arg1, int arg2, int arg3) {
        if (arg0 >= 0) {
            return;
        }
        int var5 = this.field583 + arg3;
        int var6 = this.field584 + arg2;
        int var7 = Pix2D.field540 * var6 + var5;
        int var8 = 0;
        int var9 = this.field582;
        int var10 = this.field581;
        int var11 = Pix2D.field540 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field542) {
            int var13 = Pix2D.field542 - var6;
            var9 -= var13;
            var6 = Pix2D.field542;
            var8 += var10 * var13;
            var7 += Pix2D.field540 * var13;
        }
        if (var6 + var9 > Pix2D.field543) {
            var9 -= var6 + var9 - Pix2D.field543;
        }
        if (var5 < Pix2D.field544) {
            int var14 = Pix2D.field544 - var5;
            var10 -= var14;
            var5 = Pix2D.field544;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field545) {
            int var15 = var5 + var10 - Pix2D.field545;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method181(this.field580, var11, arg1.field591, (byte) 8, var10, var7, var12, 0, Pix2D.field539, var8, var9);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([II[BBIIII[III)V")
    private void method181(int[] arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg3 == 8) {
            boolean var12 = false;
        } else {
            this.field576 = !this.field576;
        }
        int var13 = -(arg4 >> 2);
        int var14 = -(arg4 & 0x3);
        for (int var15 = -arg10; var15 < 0; var15++) {
            for (int var16 = var13; var16 < 0; var16++) {
                int var19 = arg0[arg9++];
                if (var19 != 0 && arg2[arg5] == 0) {
                    arg8[arg5++] = var19;
                } else {
                    arg5++;
                }
                int var20 = arg0[arg9++];
                if (var20 != 0 && arg2[arg5] == 0) {
                    arg8[arg5++] = var20;
                } else {
                    arg5++;
                }
                int var21 = arg0[arg9++];
                if (var21 != 0 && arg2[arg5] == 0) {
                    arg8[arg5++] = var21;
                } else {
                    arg5++;
                }
                int var22 = arg0[arg9++];
                if (var22 != 0 && arg2[arg5] == 0) {
                    arg8[arg5++] = var22;
                } else {
                    arg5++;
                }
            }
            for (int var17 = var14; var17 < 0; var17++) {
                int var18 = arg0[arg9++];
                if (var18 != 0 && arg2[arg5] == 0) {
                    arg8[arg5++] = var18;
                } else {
                    arg5++;
                }
            }
            arg5 += arg1;
            arg9 += arg6;
        }
    }
}
