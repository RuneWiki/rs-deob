import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "A", descriptor = "Z")
    private boolean field659 = false;

    @OriginalMember(owner = "ib", name = "B", descriptor = "I")
    private int field660 = 387;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    private int field662 = 9;

    @OriginalMember(owner = "ib", name = "E", descriptor = "B")
    private byte field663 = 8;

    @OriginalMember(owner = "ib", name = "F", descriptor = "Z")
    private boolean field664 = true;

    @OriginalMember(owner = "ib", name = "G", descriptor = "[I")
    public int[] field665;

    @OriginalMember(owner = "ib", name = "L", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "ib", name = "M", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "ib", name = "K", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private int field658;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field665 = new int[arg0 * arg1];
        this.field666 = this.field670 = arg0;
        this.field667 = this.field671 = arg1;
        this.field668 = this.field669 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field666 = var3.getWidth(arg1);
            this.field667 = var3.getHeight(arg1);
            this.field670 = this.field666;
            this.field671 = this.field667;
            this.field668 = 0;
            this.field669 = 0;
            this.field665 = new int[this.field667 * this.field666];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field666, this.field667, this.field665, 0, this.field666);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method297(arg1 + ".dat", null), 15787);
        Packet var5 = new Packet(arg0.method297("index.dat", null), 15787);
        var5.field710 = var4.method229();
        this.field670 = var5.method229();
        this.field671 = var5.method229();
        int var6 = var5.method227();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method231();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field710 += 2;
            var4.field710 += var5.method229() * var5.method229();
            var5.field710++;
        }
        this.field668 = var5.method227();
        this.field669 = var5.method227();
        this.field666 = var5.method229();
        this.field667 = var5.method229();
        int var10 = var5.method227();
        int var11 = this.field667 * this.field666;
        this.field665 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field665[var12] = var7[var4.method227()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field666; var13++) {
                    for (int var14 = 0; var14 < this.field667; var14++) {
                        this.field665[this.field666 * var14 + var13] = var7[var4.method227()];
                    }
                }
            }
            if (Linkable.field361) {
            }
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(B)V")
    public void method180(byte arg0) {
        Pix2D.method151(-78, this.field665, this.field666, this.field667);
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field658 = 4;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IBII)V")
    public void method181(int arg0, byte arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field665.length; var5++) {
            int var7 = this.field665[var5];
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
                int var13 = arg3 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field665[var5] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
        if (arg1 == 3) {
            boolean var6 = false;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I)V")
    public void method182(int arg0) {
        int[] var2 = new int[this.field671 * this.field670];
        for (int var3 = 0; var3 < this.field667; var3++) {
            for (int var4 = 0; var4 < this.field666; var4++) {
                var2[(this.field669 + var3) * this.field670 + this.field668 + var4] = this.field665[this.field666 * var3 + var4];
            }
        }
        this.field665 = var2;
        this.field666 = this.field670;
        this.field667 = this.field671;
        this.field668 = 0;
        this.field669 = 0;
        if (arg0 != -15744) {
            this.field659 = !this.field659;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method183(int arg0, int arg1, int arg2) {
        int var4 = this.field668 + arg0;
        int var5 = this.field669 + arg1;
        int var6 = Pix2D.field621 * var5 + var4;
        int var7 = 0;
        int var8 = this.field667;
        int var9 = this.field666;
        int var10 = Pix2D.field621 - var9;
        int var11 = 0;
        if (arg2 != 8) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (var5 < Pix2D.field623) {
            int var13 = Pix2D.field623 - var5;
            var8 -= var13;
            var5 = Pix2D.field623;
            var7 += var9 * var13;
            var6 += Pix2D.field621 * var13;
        }
        if (var5 + var8 > Pix2D.field624) {
            var8 -= var5 + var8 - Pix2D.field624;
        }
        if (var4 < Pix2D.field625) {
            int var14 = Pix2D.field625 - var4;
            var9 -= var14;
            var4 = Pix2D.field625;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (var4 + var9 > Pix2D.field626) {
            int var15 = var4 + var9 - Pix2D.field626;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            this.method184(var7, Pix2D.field620, this.field665, var6, var9, var8, true, var10, var11);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I[I[IIIIZII)V")
    private void method184(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        int var10 = -(arg4 >> 2);
        int var11 = -(arg4 & 0x3);
        if (!arg6) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg1[arg3++] = arg2[arg0++];
                arg1[arg3++] = arg2[arg0++];
                arg1[arg3++] = arg2[arg0++];
                arg1[arg3++] = arg2[arg0++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg1[arg3++] = arg2[arg0++];
            }
            arg3 += arg7;
            arg0 += arg8;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IBI)V")
    public void method185(int arg0, byte arg1, int arg2) {
        int var4 = this.field668 + arg2;
        int var5 = this.field669 + arg0;
        int var6 = Pix2D.field621 * var5 + var4;
        int var7 = 0;
        int var8 = this.field667;
        int var9 = this.field666;
        int var10 = Pix2D.field621 - var9;
        int var11 = 0;
        if (arg1 != 1) {
            return;
        }
        if (var5 < Pix2D.field623) {
            int var12 = Pix2D.field623 - var5;
            var8 -= var12;
            var5 = Pix2D.field623;
            var7 += var9 * var12;
            var6 += Pix2D.field621 * var12;
        }
        if (var5 + var8 > Pix2D.field624) {
            var8 -= var5 + var8 - Pix2D.field624;
        }
        if (var4 < Pix2D.field625) {
            int var13 = Pix2D.field625 - var4;
            var9 -= var13;
            var4 = Pix2D.field625;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field626) {
            int var14 = var4 + var9 - Pix2D.field626;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method186(Pix2D.field620, this.field665, 0, var7, var6, var9, var8, var10, var11);
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
        int var5 = this.field668 + arg3;
        int var6 = 15 / arg1;
        int var7 = this.field669 + arg2;
        int var8 = Pix2D.field621 * var7 + var5;
        int var9 = 0;
        int var10 = this.field667;
        int var11 = this.field666;
        int var12 = Pix2D.field621 - var11;
        int var13 = 0;
        if (var7 < Pix2D.field623) {
            int var14 = Pix2D.field623 - var7;
            var10 -= var14;
            var7 = Pix2D.field623;
            var9 += var11 * var14;
            var8 += Pix2D.field621 * var14;
        }
        if (var7 + var10 > Pix2D.field624) {
            var10 -= var7 + var10 - Pix2D.field624;
        }
        if (var5 < Pix2D.field625) {
            int var15 = Pix2D.field625 - var5;
            var11 -= var15;
            var5 = Pix2D.field625;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field626) {
            int var16 = var5 + var11 - Pix2D.field626;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method188(var9, arg0, var8, var10, Pix2D.field620, this.field665, var12, var13, 0, var11, false);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII[I[IIIIIZ)V")
    private void method188(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        if (arg10) {
            return;
        }
        int var12 = 256 - arg1;
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = -arg9; var14 < 0; var14++) {
                int var15 = arg5[arg0++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg4[arg2];
                    arg4[arg2++] = ((var15 & 0xFF00FF) * arg1 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg1 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg6;
            arg0 += arg7;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([IIIIII[IIIII)V")
    public void method189(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg8 >= 0) {
            return;
        }
        try {
            int var12 = -arg7 / 2;
            int var13 = -arg5 / 2;
            int var14 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
            int var16 = arg3 * var14 >> 8;
            int var17 = arg3 * var15 >> 8;
            int var18 = (arg9 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg2 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field621 * arg1 + arg10;
            for (int var21 = 0; var21 < arg5; var21++) {
                int var22 = arg0[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg6[var21]; var26 < 0; var26++) {
                    Pix2D.field620[var23++] = this.field665[(var24 >> 16) + (var25 >> 16) * this.field666];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field621;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IDIIIIBII)V")
    public void method190(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (this.field663 == arg6) {
            boolean var11 = false;
        } else {
            this.field661 = -392;
        }
        try {
            int var12 = -arg2 / 2;
            int var13 = -arg7 / 2;
            int var14 = (int) (Math.sin(arg1) * 65536.0D);
            int var15 = (int) (Math.cos(arg1) * 65536.0D);
            int var16 = arg3 * var14 >> 8;
            int var17 = arg3 * var15 >> 8;
            int var18 = (arg0 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg4 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field621 * arg8 + arg5;
            for (int var21 = 0; var21 < arg7; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg2; var25 < 0; var25++) {
                    int var26 = this.field665[(var23 >> 16) + (var24 >> 16) * this.field666];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        Pix2D.field620[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field621;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ILjb;ZI)V")
    public void method191(int arg0, Pix8 arg1, boolean arg2, int arg3) {
        int var5 = this.field668 + arg0;
        int var6 = this.field669 + arg3;
        int var7 = Pix2D.field621 * var6 + var5;
        int var8 = 0;
        int var9 = this.field667;
        int var10 = this.field666;
        int var11 = Pix2D.field621 - var10;
        int var12 = 0;
        if (!arg2) {
            this.field664 = !this.field664;
        }
        if (var6 < Pix2D.field623) {
            int var13 = Pix2D.field623 - var6;
            var9 -= var13;
            var6 = Pix2D.field623;
            var8 += var10 * var13;
            var7 += Pix2D.field621 * var13;
        }
        if (var6 + var9 > Pix2D.field624) {
            var9 -= var6 + var9 - Pix2D.field624;
        }
        if (var5 < Pix2D.field625) {
            int var14 = Pix2D.field625 - var5;
            var10 -= var14;
            var5 = Pix2D.field625;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field626) {
            int var15 = var5 + var10 - Pix2D.field626;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method192(var8, var7, var12, arg1.field675, var10, var11, 0, var9, this.field665, true, Pix2D.field620);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III[BIIII[IZ[I)V")
    private void method192(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, boolean arg9, int[] arg10) {
        if (!arg9) {
            this.field662 = 207;
        }
        int var12 = -(arg4 >> 2);
        int var13 = -(arg4 & 0x3);
        for (int var14 = -arg7; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg8[arg0++];
                if (var18 != 0 && arg3[arg1] == 0) {
                    arg10[arg1++] = var18;
                } else {
                    arg1++;
                }
                int var19 = arg8[arg0++];
                if (var19 != 0 && arg3[arg1] == 0) {
                    arg10[arg1++] = var19;
                } else {
                    arg1++;
                }
                int var20 = arg8[arg0++];
                if (var20 != 0 && arg3[arg1] == 0) {
                    arg10[arg1++] = var20;
                } else {
                    arg1++;
                }
                int var21 = arg8[arg0++];
                if (var21 != 0 && arg3[arg1] == 0) {
                    arg10[arg1++] = var21;
                } else {
                    arg1++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg8[arg0++];
                if (var17 != 0 && arg3[arg1] == 0) {
                    arg10[arg1++] = var17;
                } else {
                    arg1++;
                }
            }
            arg1 += arg5;
            arg0 += arg2;
        }
    }
}
