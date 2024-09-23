import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "A", descriptor = "I")
    private int field657 = 1525;

    @OriginalMember(owner = "ib", name = "B", descriptor = "I")
    private int field658 = 864;

    @OriginalMember(owner = "ib", name = "C", descriptor = "Z")
    private boolean field659 = false;

    @OriginalMember(owner = "ib", name = "D", descriptor = "Z")
    private boolean field660 = false;

    @OriginalMember(owner = "ib", name = "E", descriptor = "B")
    private byte field661 = 5;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    private int field662 = 545;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    private int field663 = 8;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    private int field664 = 8;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    private int field665 = -957;

    @OriginalMember(owner = "ib", name = "K", descriptor = "Z")
    private boolean field667 = false;

    @OriginalMember(owner = "ib", name = "L", descriptor = "[I")
    public int[] field668;

    @OriginalMember(owner = "ib", name = "Q", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "ib", name = "M", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "ib", name = "R", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "ib", name = "N", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "ib", name = "P", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "ib", name = "O", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field668 = new int[arg0 * arg1];
        this.field669 = this.field673 = arg0;
        this.field670 = this.field674 = arg1;
        this.field671 = this.field672 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field669 = var3.getWidth(arg1);
            this.field670 = var3.getHeight(arg1);
            this.field673 = this.field669;
            this.field674 = this.field670;
            this.field671 = 0;
            this.field672 = 0;
            this.field668 = new int[this.field670 * this.field669];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field669, this.field670, this.field668, 0, this.field669);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), (byte) -93);
        Packet var5 = new Packet(arg0.method299("index.dat", null), (byte) -93);
        var5.field713 = var4.method231();
        this.field673 = var5.method231();
        this.field674 = var5.method231();
        int var6 = var5.method229();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method233();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field713 += 2;
            var4.field713 += var5.method231() * var5.method231();
            var5.field713++;
        }
        this.field671 = var5.method229();
        this.field672 = var5.method229();
        this.field669 = var5.method231();
        this.field670 = var5.method231();
        int var10 = var5.method229();
        int var11 = this.field670 * this.field669;
        this.field668 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field668[var12] = var7[var4.method229()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field669; var13++) {
                for (int var14 = 0; var14 < this.field670; var14++) {
                    this.field668[this.field669 * var14 + var13] = var7[var4.method229()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(I)V")
    public void method181(int arg0) {
        Pix2D.method152(this.field669, this.field670, (byte) 7, this.field668);
        if (arg0 < 1 || arg0 > 1) {
            this.field666 = -2;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method182(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 3 || arg2 > 3) {
            this.field657 = 219;
        }
        for (int var5 = 0; var5 < this.field668.length; var5++) {
            int var6 = this.field668[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg3 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg0 + var9;
                if (var10 < 1) {
                    var10 = 1;
                } else if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = var6 & 0xFF;
                int var12 = arg1 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field668[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(Z)V")
    public void method183(boolean arg0) {
        int[] var2 = new int[this.field674 * this.field673];
        for (int var3 = 0; var3 < this.field670; var3++) {
            for (int var4 = 0; var4 < this.field669; var4++) {
                var2[(this.field672 + var3) * this.field673 + this.field671 + var4] = this.field668[this.field669 * var3 + var4];
            }
        }
        this.field668 = var2;
        if (arg0) {
            this.field669 = this.field673;
            this.field670 = this.field674;
            this.field671 = 0;
            this.field672 = 0;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIZ)V")
    public void method184(int arg0, int arg1, boolean arg2) {
        int var4 = this.field671 + arg0;
        int var5 = this.field672 + arg1;
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = Pix2D.field622 * var5 + var4;
        int var8 = 0;
        int var9 = this.field670;
        int var10 = this.field669;
        int var11 = Pix2D.field622 - var10;
        int var12 = 0;
        if (var5 < Pix2D.field624) {
            int var13 = Pix2D.field624 - var5;
            var9 -= var13;
            var5 = Pix2D.field624;
            var8 += var10 * var13;
            var7 += Pix2D.field622 * var13;
        }
        if (var5 + var9 > Pix2D.field625) {
            var9 -= var5 + var9 - Pix2D.field625;
        }
        if (var4 < Pix2D.field626) {
            int var14 = Pix2D.field626 - var4;
            var10 -= var14;
            var4 = Pix2D.field626;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field627) {
            int var15 = var4 + var10 - Pix2D.field627;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method185(var7, var8, false, this.field668, var10, var9, Pix2D.field621, var11, var12);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIZ[III[III)V")
    private void method185(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg4 >> 2);
        if (arg2) {
            this.field659 = !this.field659;
        }
        int var11 = -(arg4 & 0x3);
        for (int var12 = -arg5; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg6[arg0++] = arg3[arg1++];
                arg6[arg0++] = arg3[arg1++];
                arg6[arg0++] = arg3[arg1++];
                arg6[arg0++] = arg3[arg1++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg6[arg0++] = arg3[arg1++];
            }
            arg0 += arg7;
            arg1 += arg8;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method186(int arg0, int arg1, int arg2) {
        int var4 = this.field671 + arg0;
        int var5 = this.field672 + arg2;
        int var6 = Pix2D.field622 * var5 + var4;
        int var7 = 0;
        int var8 = this.field670;
        int var9 = this.field669;
        int var10 = Pix2D.field622 - var9;
        int var11 = 0;
        if (arg1 != 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (var5 < Pix2D.field624) {
            int var13 = Pix2D.field624 - var5;
            var8 -= var13;
            var5 = Pix2D.field624;
            var7 += var9 * var13;
            var6 += Pix2D.field622 * var13;
        }
        if (var5 + var8 > Pix2D.field625) {
            var8 -= var5 + var8 - Pix2D.field625;
        }
        if (var4 < Pix2D.field626) {
            int var14 = Pix2D.field626 - var4;
            var9 -= var14;
            var4 = Pix2D.field626;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (var4 + var9 > Pix2D.field627) {
            int var15 = var4 + var9 - Pix2D.field627;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            this.method187(Pix2D.field621, this.field668, 0, var7, var6, var9, var8, var10, var11);
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

    @OriginalMember(owner = "ib", name = "b", descriptor = "(IIII)V")
    public void method188(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field671 + arg1;
        if (arg2 != 7) {
            this.field666 = -235;
        }
        int var6 = this.field672 + arg0;
        int var7 = Pix2D.field622 * var6 + var5;
        int var8 = 0;
        int var9 = this.field670;
        int var10 = this.field669;
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
            this.method189(var11, var7, 0, var8, Pix2D.field621, this.field668, var12, 0, var9, var10, arg3);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII[I[IIIIII)V")
    private void method189(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg7 != 0) {
            return;
        }
        int var12 = 256 - arg10;
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = -arg9; var14 < 0; var14++) {
                int var15 = arg5[arg3++];
                if (var15 == 0) {
                    arg1++;
                } else {
                    int var16 = arg4[arg1];
                    arg4[arg1++] = ((var15 & 0xFF00FF) * arg10 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg10 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg1 += arg0;
            arg3 += arg6;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III[IB[IIIIII)V")
    public void method190(int arg0, int arg1, int arg2, int[] arg3, byte arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4 != 6) {
            return;
        }
        try {
            int var12 = -arg6 / 2;
            int var13 = -arg2 / 2;
            int var14 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
            int var16 = arg7 * var14 >> 8;
            int var17 = arg7 * var15 >> 8;
            int var18 = (arg10 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg9 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field622 * arg0 + arg1;
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = arg5[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg3[var21]; var26 < 0; var26++) {
                    Pix2D.field621[var23++] = this.field668[(var24 >> 16) + (var25 >> 16) * this.field669];
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIIDIII)V")
    public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7, int arg8) {
        if (arg2 <= 0) {
            this.field660 = !this.field660;
        }
        try {
            int var11 = -arg1 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin(arg5) * 65536.0D);
            int var14 = (int) (Math.cos(arg5) * 65536.0D);
            int var15 = arg0 * var13 >> 8;
            int var16 = arg0 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg6 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field622 * arg8 + arg7;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg1; var24 < 0; var24++) {
                    int var25 = this.field668[(var22 >> 16) + (var23 >> 16) * this.field669];
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIILjb;)V")
    public void method192(int arg0, int arg1, int arg2, Pix8 arg3) {
        int var5 = this.field671 + arg0;
        int var6 = this.field672 + arg2;
        int var7 = Pix2D.field622 * var6 + var5;
        int var8 = 0;
        int var9 = this.field670;
        int var10 = this.field669;
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
            this.method193(var9, this.field665, var11, var12, var8, this.field668, 0, arg3.field680, Pix2D.field621, var10, var7);
            if (arg1 < 4 || arg1 > 4) {
                this.field660 = !this.field660;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIII[II[B[III)V")
    private void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, byte[] arg7, int[] arg8, int arg9, int arg10) {
        int var12 = -(arg9 >> 2);
        int var13 = -(arg9 & 0x3);
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg5[arg4++];
                if (var18 != 0 && arg7[arg10] == 0) {
                    arg8[arg10++] = var18;
                } else {
                    arg10++;
                }
                int var19 = arg5[arg4++];
                if (var19 != 0 && arg7[arg10] == 0) {
                    arg8[arg10++] = var19;
                } else {
                    arg10++;
                }
                int var20 = arg5[arg4++];
                if (var20 != 0 && arg7[arg10] == 0) {
                    arg8[arg10++] = var20;
                } else {
                    arg10++;
                }
                int var21 = arg5[arg4++];
                if (var21 != 0 && arg7[arg10] == 0) {
                    arg8[arg10++] = var21;
                } else {
                    arg10++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg5[arg4++];
                if (var17 != 0 && arg7[arg10] == 0) {
                    arg8[arg10++] = var17;
                } else {
                    arg10++;
                }
            }
            arg10 += arg2;
            arg4 += arg3;
        }
        if (arg1 < 0) {
            ;
        }
    }
}
