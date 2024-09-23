import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "w", descriptor = "I")
    private int field660 = 35985;

    @OriginalMember(owner = "ib", name = "x", descriptor = "I")
    private int field661 = 743;

    @OriginalMember(owner = "ib", name = "y", descriptor = "I")
    private int field662 = -24;

    @OriginalMember(owner = "ib", name = "z", descriptor = "Z")
    private boolean field663 = false;

    @OriginalMember(owner = "ib", name = "A", descriptor = "[I")
    public int[] field664;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "ib", name = "B", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field664 = new int[arg0 * arg1];
        this.field665 = this.field669 = arg0;
        this.field666 = this.field670 = arg1;
        this.field667 = this.field668 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field665 = var3.getWidth(arg1);
            this.field666 = var3.getHeight(arg1);
            this.field669 = this.field665;
            this.field670 = this.field666;
            this.field667 = 0;
            this.field668 = 0;
            this.field664 = new int[this.field666 * this.field665];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field665, this.field666, this.field664, 0, this.field665);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method298(arg1 + ".dat", null), true);
        Packet var5 = new Packet(arg0.method298("index.dat", null), true);
        var5.field714 = var4.method230();
        this.field669 = var5.method230();
        this.field670 = var5.method230();
        int var6 = var5.method228();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method232();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field714 += 2;
            var4.field714 += var5.method230() * var5.method230();
            var5.field714++;
        }
        this.field667 = var5.method228();
        this.field668 = var5.method228();
        this.field665 = var5.method230();
        this.field666 = var5.method230();
        int var10 = var5.method228();
        int var11 = this.field666 * this.field665;
        this.field664 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field664[var12] = var7[var4.method228()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field665; var13++) {
                for (int var14 = 0; var14 < this.field666; var14++) {
                    this.field664[this.field665 * var14 + var13] = var7[var4.method228()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method180(int arg0) {
        Pix2D.method151(this.field662, this.field664, this.field665, this.field666);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIB)V")
    public void method181(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -38) {
            return;
        }
        for (int var5 = 0; var5 < this.field664.length; var5++) {
            int var6 = this.field664[var5];
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
                this.field664[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Z)V")
    public void method182(boolean arg0) {
        int[] var2 = new int[this.field670 * this.field669];
        for (int var3 = 0; var3 < this.field666; var3++) {
            for (int var4 = 0; var4 < this.field665; var4++) {
                var2[(this.field668 + var3) * this.field669 + this.field667 + var4] = this.field664[this.field665 * var3 + var4];
            }
        }
        this.field664 = var2;
        this.field665 = this.field669;
        this.field666 = this.field670;
        this.field667 = 0;
        this.field668 = 0;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method183(int arg0, int arg1, int arg2) {
        int var4 = this.field667 + arg1;
        int var5 = this.field668 + arg0;
        int var6 = Pix2D.field622 * var5 + var4;
        int var7 = 0;
        int var8 = this.field666;
        int var9 = this.field665;
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
            this.method184(var11, var10, 875, var9, Pix2D.field621, var7, this.field664, var8, var6);
            if (arg2 == 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII[II[III)V")
    private void method184(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg3 >> 2);
        int var11 = 18 / arg2;
        int var12 = -(arg3 & 0x3);
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg4[arg8++] = arg6[arg5++];
                arg4[arg8++] = arg6[arg5++];
                arg4[arg8++] = arg6[arg5++];
                arg4[arg8++] = arg6[arg5++];
            }
            for (int var15 = var12; var15 < 0; var15++) {
                arg4[arg8++] = arg6[arg5++];
            }
            arg8 += arg1;
            arg5 += arg0;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(BII)V")
    public void method185(byte arg0, int arg1, int arg2) {
        int var4 = this.field667 + arg1;
        int var5 = this.field668 + arg2;
        int var6 = Pix2D.field622 * var5 + var4;
        int var7 = 0;
        if (arg0 != 0) {
            return;
        }
        boolean var8 = false;
        int var9 = this.field666;
        int var10 = this.field665;
        int var11 = Pix2D.field622 - var10;
        int var12 = 0;
        if (var5 < Pix2D.field624) {
            int var13 = Pix2D.field624 - var5;
            var9 -= var13;
            var5 = Pix2D.field624;
            var7 += var10 * var13;
            var6 += Pix2D.field622 * var13;
        }
        if (var5 + var9 > Pix2D.field625) {
            var9 -= var5 + var9 - Pix2D.field625;
        }
        if (var4 < Pix2D.field626) {
            int var14 = Pix2D.field626 - var4;
            var10 -= var14;
            var4 = Pix2D.field626;
            var7 += var14;
            var6 += var14;
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
            this.method186(Pix2D.field621, this.field664, 0, var7, var6, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method186(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method187(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field667 + arg0;
        int var6 = this.field668 + arg2;
        int var7 = Pix2D.field622 * var6 + var5;
        int var8 = 0;
        if (arg3 != 23391) {
            this.field662 = 148;
        }
        int var9 = this.field666;
        int var10 = this.field665;
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
            this.method188(Pix2D.field621, arg1, (byte) 6, 0, var10, var11, var12, var9, var7, this.field664, var8);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([IIBIIIIII[II)V")
    private void method188(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        if (arg2 != 6) {
            this.field660 = -158;
        }
        int var12 = 256 - arg1;
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                int var15 = arg9[arg10++];
                if (var15 == 0) {
                    arg8++;
                } else {
                    int var16 = arg0[arg8];
                    arg0[arg8++] = ((var15 & 0xFF00FF) * arg1 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg1 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg8 += arg5;
            arg10 += arg6;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIII[II[IIII)V")
    public void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg1 != 9271) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg6 / 2;
            int var14 = -arg10 / 2;
            int var15 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
            int var17 = arg0 * var15 >> 8;
            int var18 = arg0 * var16 >> 8;
            int var19 = (arg3 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg4 << 16) + (var14 * var18 - var13 * var17);
            int var21 = Pix2D.field622 * arg8 + arg9;
            for (int var22 = 0; var22 < arg10; var22++) {
                int var23 = arg5[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg7[var22]; var27 < 0; var27++) {
                    Pix2D.field621[var24++] = this.field664[(var25 >> 16) + (var26 >> 16) * this.field665];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += Pix2D.field622;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IDZIIIIII)V")
    public void method190(int arg0, double arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2) {
            this.field661 = -302;
        }
        try {
            int var11 = -arg5 / 2;
            int var12 = -arg0 / 2;
            int var13 = (int) (Math.sin(arg1) * 65536.0D);
            int var14 = (int) (Math.cos(arg1) * 65536.0D);
            int var15 = arg8 * var13 >> 8;
            int var16 = arg8 * var14 >> 8;
            int var17 = (arg7 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg4 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field622 * arg3 + arg6;
            for (int var20 = 0; var20 < arg0; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg5; var24 < 0; var24++) {
                    int var25 = this.field664[(var22 >> 16) + (var23 >> 16) * this.field665];
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IILjb;I)V")
    public void method191(int arg0, int arg1, Pix8 arg2, int arg3) {
        int var5 = this.field667 + arg1;
        if (arg3 < 1 || arg3 > 1) {
            return;
        }
        int var6 = this.field668 + arg0;
        int var7 = Pix2D.field622 * var6 + var5;
        int var8 = 0;
        int var9 = this.field666;
        int var10 = this.field665;
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
            this.method192(var10, var9, var7, var11, this.field664, arg2.field675, 0, Pix2D.field621, var12, -6210, var8);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII[I[BI[IIII)V")
    private void method192(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg9 != -6210) {
            return;
        }
        int var12 = -(arg0 >> 2);
        int var13 = -(arg0 & 0x3);
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg4[arg10++];
                if (var18 != 0 && arg5[arg2] == 0) {
                    arg7[arg2++] = var18;
                } else {
                    arg2++;
                }
                int var19 = arg4[arg10++];
                if (var19 != 0 && arg5[arg2] == 0) {
                    arg7[arg2++] = var19;
                } else {
                    arg2++;
                }
                int var20 = arg4[arg10++];
                if (var20 != 0 && arg5[arg2] == 0) {
                    arg7[arg2++] = var20;
                } else {
                    arg2++;
                }
                int var21 = arg4[arg10++];
                if (var21 != 0 && arg5[arg2] == 0) {
                    arg7[arg2++] = var21;
                } else {
                    arg2++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg4[arg10++];
                if (var17 != 0 && arg5[arg2] == 0) {
                    arg7[arg2++] = var17;
                } else {
                    arg2++;
                }
            }
            arg2 += arg3;
            arg10 += arg8;
        }
    }
}
