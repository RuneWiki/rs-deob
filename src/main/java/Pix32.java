import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "w", descriptor = "Z")
    private boolean field657 = false;

    @OriginalMember(owner = "ib", name = "x", descriptor = "I")
    private int field658 = 328;

    @OriginalMember(owner = "ib", name = "y", descriptor = "I")
    private int field659 = 1;

    @OriginalMember(owner = "ib", name = "z", descriptor = "B")
    private byte field660 = 1;

    @OriginalMember(owner = "ib", name = "A", descriptor = "B")
    private byte field661 = 100;

    @OriginalMember(owner = "ib", name = "B", descriptor = "Z")
    private boolean field662 = true;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    private int field663 = 3;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    private int field664 = 646;

    @OriginalMember(owner = "ib", name = "E", descriptor = "Z")
    private boolean field665 = false;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    private int field666 = -31809;

    @OriginalMember(owner = "ib", name = "G", descriptor = "[I")
    public int[] field667;

    @OriginalMember(owner = "ib", name = "L", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "ib", name = "M", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "ib", name = "K", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field667 = new int[arg0 * arg1];
        this.field668 = this.field672 = arg0;
        this.field669 = this.field673 = arg1;
        this.field670 = this.field671 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field668 = var3.getWidth(arg1);
            this.field669 = var3.getHeight(arg1);
            this.field672 = this.field668;
            this.field673 = this.field669;
            this.field670 = 0;
            this.field671 = 0;
            this.field667 = new int[this.field669 * this.field668];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field668, this.field669, this.field667, 0, this.field668);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), -26728);
        Packet var5 = new Packet(arg0.method299("index.dat", null), -26728);
        var5.field717 = var4.method231();
        this.field672 = var5.method231();
        this.field673 = var5.method231();
        int var6 = var5.method229();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method233();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field717 += 2;
            var4.field717 += var5.method231() * var5.method231();
            var5.field717++;
        }
        this.field670 = var5.method229();
        this.field671 = var5.method229();
        this.field668 = var5.method231();
        this.field669 = var5.method231();
        int var10 = var5.method229();
        int var11 = this.field669 * this.field668;
        this.field667 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field667[var12] = var7[var4.method229()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field668; var13++) {
                for (int var14 = 0; var14 < this.field669; var14++) {
                    this.field667[this.field668 * var14 + var13] = var7[var4.method229()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(I)V")
    public void method181(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Pix2D.method152(this.field667, this.field669, this.field668, 234);
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method182(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field667.length; var5++) {
            int var6 = this.field667[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg1 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg2 + var9;
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
                this.field667[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method183(int arg0) {
        int[] var2 = new int[this.field673 * this.field672];
        for (int var3 = 0; var3 < this.field669; var3++) {
            for (int var5 = 0; var5 < this.field668; var5++) {
                var2[(this.field671 + var3) * this.field672 + this.field670 + var5] = this.field667[this.field668 * var3 + var5];
            }
        }
        int var4 = 71 / arg0;
        this.field667 = var2;
        this.field668 = this.field672;
        this.field669 = this.field673;
        this.field670 = 0;
        this.field671 = 0;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method184(int arg0, int arg1, int arg2) {
        int var4 = this.field670 + arg0;
        int var5 = this.field671 + arg1;
        int var6 = Pix2D.field622 * var5 + var4;
        int var7 = 0;
        if (this.field659 != arg2) {
            this.field659 = -35;
        }
        int var8 = this.field669;
        int var9 = this.field668;
        int var10 = Pix2D.field622 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field624) {
            int var12 = Pix2D.field624 - var5;
            var8 -= var12;
            var5 = Pix2D.field624;
            var7 += var9 * var12;
            var6 += Pix2D.field622 * var12;
        }
        if (var5 + var8 > Pix2D.field625) {
            var8 -= var5 + var8 - Pix2D.field625;
        }
        if (var4 < Pix2D.field626) {
            int var13 = Pix2D.field626 - var4;
            var9 -= var13;
            var4 = Pix2D.field626;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field627) {
            int var14 = var4 + var9 - Pix2D.field627;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method185(var9, var11, (byte) 1, var8, var6, var10, var7, Pix2D.field621, this.field667);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIBIIII[I[I)V")
    private void method185(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8) {
        int var10 = -(arg0 >> 2);
        if (this.field660 != arg2) {
            this.field666 = -225;
        }
        int var11 = -(arg0 & 0x3);
        for (int var12 = -arg3; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg7[arg4++] = arg8[arg6++];
                arg7[arg4++] = arg8[arg6++];
                arg7[arg4++] = arg8[arg6++];
                arg7[arg4++] = arg8[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg7[arg4++] = arg8[arg6++];
            }
            arg4 += arg5;
            arg6 += arg1;
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(III)V")
    public void method186(int arg0, int arg1, int arg2) {
        if (arg2 != 37651) {
            return;
        }
        int var4 = this.field670 + arg0;
        int var5 = this.field671 + arg1;
        int var6 = Pix2D.field622 * var5 + var4;
        int var7 = 0;
        int var8 = this.field669;
        int var9 = this.field668;
        int var10 = Pix2D.field622 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field624) {
            int var12 = Pix2D.field624 - var5;
            var8 -= var12;
            var5 = Pix2D.field624;
            var7 += var9 * var12;
            var6 += Pix2D.field622 * var12;
        }
        if (var5 + var8 > Pix2D.field625) {
            var8 -= var5 + var8 - Pix2D.field625;
        }
        if (var4 < Pix2D.field626) {
            int var13 = Pix2D.field626 - var4;
            var9 -= var13;
            var4 = Pix2D.field626;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field627) {
            int var14 = var4 + var9 - Pix2D.field627;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method187(Pix2D.field621, this.field667, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method187(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ZIII)V")
    public void method188(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field670 + arg3;
        int var6 = this.field671 + arg1;
        int var7 = Pix2D.field622 * var6 + var5;
        int var8 = 0;
        int var9 = this.field669;
        int var10 = this.field668;
        int var11 = Pix2D.field622 - var10;
        int var12 = 0;
        if (arg0) {
            this.field665 = !this.field665;
        }
        if (var6 < Pix2D.field624) {
            int var13 = Pix2D.field624 - var6;
            var9 -= var13;
            var6 = Pix2D.field624;
            var8 += var10 * var13;
            var7 += Pix2D.field622 * var13;
        }
        if (var6 + var9 > Pix2D.field625) {
            var9 -= var6 + var9 - Pix2D.field625;
        }
        if (var5 < Pix2D.field626) {
            int var14 = Pix2D.field626 - var5;
            var10 -= var14;
            var5 = Pix2D.field626;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field627) {
            int var15 = var5 + var10 - Pix2D.field627;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method189(Pix2D.field621, true, var8, this.field667, var9, var7, var12, var11, arg2, var10, 0);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([IZI[IIIIIIII)V")
    private void method189(int[] arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg8;
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = -arg9; var14 < 0; var14++) {
                int var15 = arg3[arg2++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    int var16 = arg0[arg5];
                    arg0[arg5++] = ((var15 & 0xFF00FF) * arg8 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg8 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg5 += arg7;
            arg2 += arg6;
        }
        if (!arg1) {
            this.field662 = !this.field662;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIII[IB[IIII)V")
    public void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg6 != 8) {
            return;
        }
        try {
            int var12 = -arg3 / 2;
            int var13 = -arg1 / 2;
            int var14 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
            int var16 = arg8 * var14 >> 8;
            int var17 = arg8 * var15 >> 8;
            int var18 = (arg2 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg10 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field622 * arg0 + arg9;
            for (int var21 = 0; var21 < arg1; var21++) {
                int var22 = arg5[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg7[var21]; var26 < 0; var26++) {
                    Pix2D.field621[var23++] = this.field667[(var24 >> 16) + (var25 >> 16) * this.field668];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field622;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIIDIBI)V")
    public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, byte arg7, int arg8) {
        if (arg7 != 114) {
            this.field658 = -324;
        }
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg8 / 2;
            int var13 = (int) (Math.sin(arg5) * 65536.0D);
            int var14 = (int) (Math.cos(arg5) * 65536.0D);
            int var15 = arg6 * var13 >> 8;
            int var16 = arg6 * var14 >> 8;
            int var17 = (arg0 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg1 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field622 * arg3 + arg4;
            for (int var20 = 0; var20 < arg8; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg2; var24 < 0; var24++) {
                    int var25 = this.field667[(var22 >> 16) + (var23 >> 16) * this.field668];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Pix2D.field621[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Pix2D.field622;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ILjb;II)V")
    public void method192(int arg0, Pix8 arg1, int arg2, int arg3) {
        int var5 = this.field670 + arg0;
        int var6 = this.field671 + arg2;
        int var7 = Pix2D.field622 * var6 + var5;
        int var8 = 0;
        if (arg3 != 0) {
            this.field657 = !this.field657;
        }
        int var9 = this.field669;
        int var10 = this.field668;
        int var11 = Pix2D.field622 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field624) {
            int var13 = Pix2D.field624 - var6;
            var9 -= var13;
            var6 = Pix2D.field624;
            var8 += var10 * var13;
            var7 += Pix2D.field622 * var13;
        }
        if (var6 + var9 > Pix2D.field625) {
            var9 -= var6 + var9 - Pix2D.field625;
        }
        if (var5 < Pix2D.field626) {
            int var14 = Pix2D.field626 - var5;
            var10 -= var14;
            var5 = Pix2D.field626;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field627) {
            int var15 = var5 + var10 - Pix2D.field627;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method193(var7, var9, 646, Pix2D.field621, this.field667, 0, var8, var10, var11, var12, arg1.field679);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III[I[IIIIII[B)V")
    private void method193(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        if (arg2 <= 0) {
            this.field665 = !this.field665;
        }
        int var12 = -(arg7 >> 2);
        int var13 = -(arg7 & 0x3);
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg4[arg6++];
                if (var18 != 0 && arg10[arg0] == 0) {
                    arg3[arg0++] = var18;
                } else {
                    arg0++;
                }
                int var19 = arg4[arg6++];
                if (var19 != 0 && arg10[arg0] == 0) {
                    arg3[arg0++] = var19;
                } else {
                    arg0++;
                }
                int var20 = arg4[arg6++];
                if (var20 != 0 && arg10[arg0] == 0) {
                    arg3[arg0++] = var20;
                } else {
                    arg0++;
                }
                int var21 = arg4[arg6++];
                if (var21 != 0 && arg10[arg0] == 0) {
                    arg3[arg0++] = var21;
                } else {
                    arg0++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg4[arg6++];
                if (var17 != 0 && arg10[arg0] == 0) {
                    arg3[arg0++] = var17;
                } else {
                    arg0++;
                }
            }
            arg0 += arg8;
            arg6 += arg9;
        }
    }
}
