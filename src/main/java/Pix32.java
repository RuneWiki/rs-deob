import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "v", descriptor = "I")
    private int field657 = -398;

    @OriginalMember(owner = "ib", name = "w", descriptor = "I")
    private int field658 = 48925;

    @OriginalMember(owner = "ib", name = "x", descriptor = "B")
    private byte field659 = 4;

    @OriginalMember(owner = "ib", name = "y", descriptor = "I")
    private int field660 = -32563;

    @OriginalMember(owner = "ib", name = "z", descriptor = "B")
    private byte field661 = 57;

    @OriginalMember(owner = "ib", name = "A", descriptor = "[I")
    public int[] field662;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "ib", name = "B", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field662 = new int[arg0 * arg1];
        this.field663 = this.field667 = arg0;
        this.field664 = this.field668 = arg1;
        this.field665 = this.field666 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field663 = var3.getWidth(arg1);
            this.field664 = var3.getHeight(arg1);
            this.field667 = this.field663;
            this.field668 = this.field664;
            this.field665 = 0;
            this.field666 = 0;
            this.field662 = new int[this.field664 * this.field663];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field663, this.field664, this.field662, 0, this.field663);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), 58);
        Packet var5 = new Packet(arg0.method299("index.dat", null), 58);
        var5.field711 = var4.method231();
        this.field667 = var5.method231();
        this.field668 = var5.method231();
        int var6 = var5.method229();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method233();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field711 += 2;
            var4.field711 += var5.method231() * var5.method231();
            var5.field711++;
        }
        this.field665 = var5.method229();
        this.field666 = var5.method229();
        this.field663 = var5.method231();
        this.field664 = var5.method231();
        int var10 = var5.method229();
        int var11 = this.field664 * this.field663;
        this.field662 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field662[var12] = var7[var4.method229()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field663; var13++) {
                for (int var14 = 0; var14 < this.field664; var14++) {
                    this.field662[this.field663 * var14 + var13] = var7[var4.method229()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(B)V")
    public void method181(byte arg0) {
        if (this.field659 == arg0) {
            Pix2D.method152(this.field663, 501, this.field664, this.field662);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method182(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -45258) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field662.length; var6++) {
            int var7 = this.field662[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg0 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg2 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var7 & 0xFF;
                int var13 = arg1 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field662[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I)V")
    public void method183(int arg0) {
        int[] var2 = new int[this.field668 * this.field667];
        for (int var3 = 0; var3 < this.field664; var3++) {
            for (int var4 = 0; var4 < this.field663; var4++) {
                var2[(this.field666 + var3) * this.field667 + this.field665 + var4] = this.field662[this.field663 * var3 + var4];
            }
        }
        this.field662 = var2;
        if (this.field660 == arg0) {
            this.field663 = this.field667;
            this.field664 = this.field668;
            this.field665 = 0;
            this.field666 = 0;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method184(int arg0, int arg1, int arg2) {
        if (arg0 != -1127) {
            return;
        }
        int var4 = this.field665 + arg2;
        int var5 = this.field666 + arg1;
        int var6 = Pix2D.field620 * var5 + var4;
        int var7 = 0;
        int var8 = this.field664;
        int var9 = this.field663;
        int var10 = Pix2D.field620 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field622) {
            int var12 = Pix2D.field622 - var5;
            var8 -= var12;
            var5 = Pix2D.field622;
            var7 += var9 * var12;
            var6 += Pix2D.field620 * var12;
        }
        if (var5 + var8 > Pix2D.field623) {
            var8 -= var5 + var8 - Pix2D.field623;
        }
        if (var4 < Pix2D.field624) {
            int var13 = Pix2D.field624 - var4;
            var9 -= var13;
            var4 = Pix2D.field624;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field625) {
            int var14 = var4 + var9 - Pix2D.field625;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method185(var7, var11, var6, var8, Pix2D.field619, 820, this.field662, var10, var9);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII[II[III)V")
    private void method185(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8) {
        if (arg5 <= 0) {
            this.field660 = -494;
        }
        int var10 = -(arg8 >> 2);
        int var11 = -(arg8 & 0x3);
        for (int var12 = -arg3; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg4[arg2++] = arg6[arg0++];
                arg4[arg2++] = arg6[arg0++];
                arg4[arg2++] = arg6[arg0++];
                arg4[arg2++] = arg6[arg0++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg4[arg2++] = arg6[arg0++];
            }
            arg2 += arg7;
            arg0 += arg1;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ZII)V")
    public void method186(boolean arg0, int arg1, int arg2) {
        int var4 = this.field665 + arg1;
        int var5 = this.field666 + arg2;
        if (!arg0) {
            return;
        }
        int var6 = Pix2D.field620 * var5 + var4;
        int var7 = 0;
        int var8 = this.field664;
        int var9 = this.field663;
        int var10 = Pix2D.field620 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field622) {
            int var12 = Pix2D.field622 - var5;
            var8 -= var12;
            var5 = Pix2D.field622;
            var7 += var9 * var12;
            var6 += Pix2D.field620 * var12;
        }
        if (var5 + var8 > Pix2D.field623) {
            var8 -= var5 + var8 - Pix2D.field623;
        }
        if (var4 < Pix2D.field624) {
            int var13 = Pix2D.field624 - var4;
            var9 -= var13;
            var4 = Pix2D.field624;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field625) {
            int var14 = var4 + var9 - Pix2D.field625;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method187(Pix2D.field619, this.field662, 0, var7, var6, var9, var8, var10, var11);
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIZ)V")
    public void method188(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field665 + arg1;
        int var6 = this.field666 + arg2;
        int var7 = Pix2D.field620 * var6 + var5;
        int var8 = 0;
        int var9 = this.field664;
        int var10 = this.field663;
        int var11 = Pix2D.field620 - var10;
        int var12 = 0;
        if (!arg3) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        if (var6 < Pix2D.field622) {
            int var14 = Pix2D.field622 - var6;
            var9 -= var14;
            var6 = Pix2D.field622;
            var8 += var10 * var14;
            var7 += Pix2D.field620 * var14;
        }
        if (var6 + var9 > Pix2D.field623) {
            var9 -= var6 + var9 - Pix2D.field623;
        }
        if (var5 < Pix2D.field624) {
            int var15 = Pix2D.field624 - var5;
            var10 -= var15;
            var5 = Pix2D.field624;
            var8 += var15;
            var7 += var15;
            var12 += var15;
            var11 += var15;
        }
        if (var5 + var10 > Pix2D.field625) {
            int var16 = var5 + var10 - Pix2D.field625;
            var10 -= var16;
            var12 += var16;
            var11 += var16;
        }
        if (var10 > 0 && var9 > 0) {
            this.method189(var7, this.field662, var12, var9, var8, Pix2D.field619, arg0, var10, var11, 0, 28593);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I[IIII[IIIIII)V")
    private void method189(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg6;
        if (arg10 != 28593) {
            return;
        }
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = -arg7; var14 < 0; var14++) {
                int var15 = arg1[arg4++];
                if (var15 == 0) {
                    arg0++;
                } else {
                    int var16 = arg5[arg0];
                    arg5[arg0++] = ((var15 & 0xFF00FF) * arg6 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg6 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg0 += arg8;
            arg4 += arg2;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII[III[IIII)V")
    public void method190(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 12 / arg0;
        try {
            int var13 = -arg5 / 2;
            int var14 = -arg8 / 2;
            int var15 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var17 = arg10 * var15 >> 8;
            int var18 = arg10 * var16 >> 8;
            int var19 = (arg6 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg2 << 16) + (var14 * var18 - var13 * var17);
            int var21 = Pix2D.field620 * arg3 + arg1;
            for (int var22 = 0; var22 < arg8; var22++) {
                int var23 = arg7[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg4[var22]; var27 < 0; var27++) {
                    Pix2D.field619[var24++] = this.field662[(var25 >> 16) + (var26 >> 16) * this.field663];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += Pix2D.field620;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIIIIID)V")
    public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, double arg8) {
        if (arg6 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg7 / 2;
            int var13 = -arg5 / 2;
            int var14 = (int) (Math.sin(arg8) * 65536.0D);
            int var15 = (int) (Math.cos(arg8) * 65536.0D);
            int var16 = arg2 * var14 >> 8;
            int var17 = arg2 * var15 >> 8;
            int var18 = (arg1 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg0 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field620 * arg4 + arg3;
            for (int var21 = 0; var21 < arg5; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg7; var25 < 0; var25++) {
                    int var26 = this.field662[(var23 >> 16) + (var24 >> 16) * this.field663];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        Pix2D.field619[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field620;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Ljb;IIB)V")
    public void method192(Pix8 arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field665 + arg2;
        int var6 = this.field666 + arg1;
        int var7 = Pix2D.field620 * var6 + var5;
        int var8 = 0;
        if (arg3 != -63) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = this.field664;
        int var11 = this.field663;
        int var12 = Pix2D.field620 - var11;
        int var13 = 0;
        if (var6 < Pix2D.field622) {
            int var14 = Pix2D.field622 - var6;
            var10 -= var14;
            var6 = Pix2D.field622;
            var8 += var11 * var14;
            var7 += Pix2D.field620 * var14;
        }
        if (var6 + var10 > Pix2D.field623) {
            var10 -= var6 + var10 - Pix2D.field623;
        }
        if (var5 < Pix2D.field624) {
            int var15 = Pix2D.field624 - var5;
            var11 -= var15;
            var5 = Pix2D.field624;
            var8 += var15;
            var7 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field625) {
            int var16 = var5 + var11 - Pix2D.field625;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method193(var8, 0, this.field662, Pix2D.field619, arg0.field676, var13, var12, var10, var11, (byte) 5, var7);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(II[I[I[BIIIIBI)V")
    private void method193(int arg0, int arg1, int[] arg2, int[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        if (arg9 == 5) {
            boolean var12 = false;
        } else {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = -(arg8 >> 2);
        int var15 = -(arg8 & 0x3);
        for (int var16 = -arg7; var16 < 0; var16++) {
            for (int var17 = var14; var17 < 0; var17++) {
                int var20 = arg2[arg0++];
                if (var20 != 0 && arg4[arg10] == 0) {
                    arg3[arg10++] = var20;
                } else {
                    arg10++;
                }
                int var21 = arg2[arg0++];
                if (var21 != 0 && arg4[arg10] == 0) {
                    arg3[arg10++] = var21;
                } else {
                    arg10++;
                }
                int var22 = arg2[arg0++];
                if (var22 != 0 && arg4[arg10] == 0) {
                    arg3[arg10++] = var22;
                } else {
                    arg10++;
                }
                int var23 = arg2[arg0++];
                if (var23 != 0 && arg4[arg10] == 0) {
                    arg3[arg10++] = var23;
                } else {
                    arg10++;
                }
            }
            for (int var18 = var15; var18 < 0; var18++) {
                int var19 = arg2[arg0++];
                if (var19 != 0 && arg4[arg10] == 0) {
                    arg3[arg10++] = var19;
                } else {
                    arg10++;
                }
            }
            arg10 += arg6;
            arg0 += arg5;
        }
    }
}
