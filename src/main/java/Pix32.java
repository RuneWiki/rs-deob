import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "jb", name = "x", descriptor = "Z")
    private boolean field664 = true;

    @OriginalMember(owner = "jb", name = "y", descriptor = "Z")
    private boolean field665 = true;

    @OriginalMember(owner = "jb", name = "z", descriptor = "Z")
    private boolean field666 = true;

    @OriginalMember(owner = "jb", name = "A", descriptor = "I")
    private int field667 = 784;

    @OriginalMember(owner = "jb", name = "B", descriptor = "I")
    private int field668 = -39218;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field669;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field669 = new int[arg0 * arg1];
        this.field670 = this.field674 = arg0;
        this.field671 = this.field675 = arg1;
        this.field672 = this.field673 = 0;
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field670 = var3.getWidth(arg1);
            this.field671 = var3.getHeight(arg1);
            this.field674 = this.field670;
            this.field675 = this.field671;
            this.field672 = 0;
            this.field673 = 0;
            this.field669 = new int[this.field671 * this.field670];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field670, this.field671, this.field669, 0, this.field670);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(16, arg0.method309(arg1 + ".dat", null));
        Packet var5 = new Packet(16, arg0.method309("index.dat", null));
        var5.field717 = var4.method241();
        this.field674 = var5.method241();
        this.field675 = var5.method241();
        int var6 = var5.method239();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method243();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field717 += 2;
            var4.field717 += var5.method241() * var5.method241();
            var5.field717++;
        }
        this.field672 = var5.method239();
        this.field673 = var5.method239();
        this.field670 = var5.method241();
        this.field671 = var5.method241();
        int var10 = var5.method239();
        int var11 = this.field671 * this.field670;
        this.field669 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field669[var12] = var7[var4.method239()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field670; var13++) {
                for (int var14 = 0; var14 < this.field671; var14++) {
                    this.field669[this.field670 * var14 + var13] = var7[var4.method239()];
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(Z)V")
    public void method194(boolean arg0) {
        if (!arg0) {
            Pix2D.method165(this.field671, this.field669, this.field670, this.field666);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method195(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field669.length; var5++) {
            int var7 = this.field669[var5];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg0 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg1 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var7 & 0xFF;
                int var13 = arg2 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field669[var5] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
        int var6 = 22 / arg3;
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "(Z)V")
    public void method196(boolean arg0) {
        int[] var2 = new int[this.field675 * this.field674];
        for (int var3 = 0; var3 < this.field671; var3++) {
            for (int var4 = 0; var4 < this.field670; var4++) {
                var2[(this.field673 + var3) * this.field674 + this.field672 + var4] = this.field669[this.field670 * var3 + var4];
            }
        }
        this.field669 = var2;
        this.field670 = this.field674;
        if (!arg0) {
            this.field667 = -25;
        }
        this.field671 = this.field675;
        this.field672 = 0;
        this.field673 = 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(BII)V")
    public void method197(byte arg0, int arg1, int arg2) {
        int var4 = this.field672 + arg2;
        int var5 = this.field673 + arg1;
        int var6 = Pix2D.field628 * var5 + var4;
        int var7 = 0;
        int var8 = this.field671;
        int var9 = this.field670;
        int var10 = Pix2D.field628 - var9;
        int var11 = 0;
        if (arg0 == 0) {
            boolean var12 = false;
        } else {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        if (var5 < Pix2D.field630) {
            int var14 = Pix2D.field630 - var5;
            var8 -= var14;
            var5 = Pix2D.field630;
            var7 += var9 * var14;
            var6 += Pix2D.field628 * var14;
        }
        if (var5 + var8 > Pix2D.field631) {
            var8 -= var5 + var8 - Pix2D.field631;
        }
        if (var4 < Pix2D.field632) {
            int var15 = Pix2D.field632 - var4;
            var9 -= var15;
            var4 = Pix2D.field632;
            var7 += var15;
            var6 += var15;
            var11 += var15;
            var10 += var15;
        }
        if (var4 + var9 > Pix2D.field633) {
            int var16 = var4 + var9 - Pix2D.field633;
            var9 -= var16;
            var11 += var16;
            var10 += var16;
        }
        if (var9 > 0 && var8 > 0) {
            this.method198(Pix2D.field627, var9, var11, var7, var10, var8, this.field669, var6, 267);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([IIIIII[III)V")
    private void method198(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg1 >> 2);
        int var11 = -(arg1 & 0x3);
        for (int var12 = -arg5; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg0[arg7++] = arg6[arg3++];
                arg0[arg7++] = arg6[arg3++];
                arg0[arg7++] = arg6[arg3++];
                arg0[arg7++] = arg6[arg3++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg0[arg7++] = arg6[arg3++];
            }
            arg7 += arg4;
            arg3 += arg2;
        }
        if (arg8 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method199(int arg0, int arg1, int arg2) {
        int var4 = this.field672 + arg0;
        int var5 = this.field673 + arg2;
        int var6 = Pix2D.field628 * var5 + var4;
        int var7 = 0;
        if (arg1 != -48420) {
            this.field665 = !this.field665;
        }
        int var8 = this.field671;
        int var9 = this.field670;
        int var10 = Pix2D.field628 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field630) {
            int var12 = Pix2D.field630 - var5;
            var8 -= var12;
            var5 = Pix2D.field630;
            var7 += var9 * var12;
            var6 += Pix2D.field628 * var12;
        }
        if (var5 + var8 > Pix2D.field631) {
            var8 -= var5 + var8 - Pix2D.field631;
        }
        if (var4 < Pix2D.field632) {
            int var13 = Pix2D.field632 - var4;
            var9 -= var13;
            var4 = Pix2D.field632;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field633) {
            int var14 = var4 + var9 - Pix2D.field633;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method200(Pix2D.field627, this.field669, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method200(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "jb", name = "b", descriptor = "(IIII)V")
    public void method201(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field672 + arg0;
        if (arg2 < 0 || arg2 > 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = this.field673 + arg3;
        int var8 = Pix2D.field628 * var7 + var5;
        int var9 = 0;
        int var10 = this.field671;
        int var11 = this.field670;
        int var12 = Pix2D.field628 - var11;
        int var13 = 0;
        if (var7 < Pix2D.field630) {
            int var14 = Pix2D.field630 - var7;
            var10 -= var14;
            var7 = Pix2D.field630;
            var9 += var11 * var14;
            var8 += Pix2D.field628 * var14;
        }
        if (var7 + var10 > Pix2D.field631) {
            var10 -= var7 + var10 - Pix2D.field631;
        }
        if (var5 < Pix2D.field632) {
            int var15 = Pix2D.field632 - var5;
            var11 -= var15;
            var5 = Pix2D.field632;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field633) {
            int var16 = var5 + var11 - Pix2D.field633;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method202(Pix2D.field627, var10, var12, arg1, 0, var13, var9, var11, this.field669, 0, var8);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([IIIIIIII[III)V")
    private void method202(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg3;
        if (arg4 != 0) {
            this.field668 = -156;
        }
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = -arg7; var14 < 0; var14++) {
                int var15 = arg8[arg6++];
                if (var15 == 0) {
                    arg10++;
                } else {
                    int var16 = arg0[arg10];
                    arg0[arg10++] = ((var15 & 0xFF00FF) * arg3 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg3 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg10 += arg2;
            arg6 += arg5;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([III[IIIIIIII)V")
    public void method203(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4 != 0) {
            this.field667 = -198;
        }
        try {
            int var12 = -arg10 / 2;
            int var13 = -arg9 / 2;
            int var14 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
            int var16 = arg7 * var14 >> 8;
            int var17 = arg7 * var15 >> 8;
            int var18 = (arg5 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg6 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field628 * arg1 + arg2;
            for (int var21 = 0; var21 < arg9; var21++) {
                int var22 = arg0[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg3[var21]; var26 < 0; var26++) {
                    Pix2D.field627[var23++] = this.field669[(var24 >> 16) + (var25 >> 16) * this.field670];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field628;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIZIIIIDI)V")
    public void method204(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, double arg7, int arg8) {
        if (!arg2) {
            return;
        }
        try {
            int var11 = -arg6 / 2;
            int var12 = -arg1 / 2;
            int var13 = (int) (Math.sin(arg7) * 65536.0D);
            int var14 = (int) (Math.cos(arg7) * 65536.0D);
            int var15 = arg3 * var13 >> 8;
            int var16 = arg3 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg8 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field628 * arg5 + arg0;
            for (int var20 = 0; var20 < arg1; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg6; var24 < 0; var24++) {
                    int var25 = this.field669[(var22 >> 16) + (var23 >> 16) * this.field670];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Pix2D.field627[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Pix2D.field628;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILkb;)V")
    public void method205(int arg0, int arg1, int arg2, Pix8 arg3) {
        int var5 = this.field672 + arg1;
        int var6 = this.field673 + arg0;
        int var7 = Pix2D.field628 * var6 + var5;
        int var8 = 0;
        if (arg2 != 0) {
            return;
        }
        int var9 = this.field671;
        int var10 = this.field670;
        int var11 = Pix2D.field628 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field630) {
            int var13 = Pix2D.field630 - var6;
            var9 -= var13;
            var6 = Pix2D.field630;
            var8 += var10 * var13;
            var7 += Pix2D.field628 * var13;
        }
        if (var6 + var9 > Pix2D.field631) {
            var9 -= var6 + var9 - Pix2D.field631;
        }
        if (var5 < Pix2D.field632) {
            int var14 = Pix2D.field632 - var5;
            var10 -= var14;
            var5 = Pix2D.field632;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field633) {
            int var15 = var5 + var10 - Pix2D.field633;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method206(var7, var10, var8, 0, var12, arg3.field682, this.field669, -395, var9, Pix2D.field627, var11);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIII[B[III[II)V")
    private void method206(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = -(arg1 >> 2);
        if (arg7 >= 0) {
            return;
        }
        int var13 = -(arg1 & 0x3);
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg6[arg2++];
                if (var18 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var18;
                } else {
                    arg0++;
                }
                int var19 = arg6[arg2++];
                if (var19 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var19;
                } else {
                    arg0++;
                }
                int var20 = arg6[arg2++];
                if (var20 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var20;
                } else {
                    arg0++;
                }
                int var21 = arg6[arg2++];
                if (var21 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var21;
                } else {
                    arg0++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg6[arg2++];
                if (var17 != 0 && arg5[arg0] == 0) {
                    arg9[arg0++] = var17;
                } else {
                    arg0++;
                }
            }
            arg0 += arg10;
            arg2 += arg4;
        }
    }
}
