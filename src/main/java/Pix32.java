import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "A", descriptor = "Z")
    private boolean field657 = true;

    @OriginalMember(owner = "ib", name = "B", descriptor = "Z")
    private boolean field658 = true;

    @OriginalMember(owner = "ib", name = "D", descriptor = "Z")
    private boolean field660 = false;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    private int field661 = -567;

    @OriginalMember(owner = "ib", name = "F", descriptor = "[I")
    public int[] field662;

    @OriginalMember(owner = "ib", name = "K", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "ib", name = "L", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private static int field656 = 1000;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    private int field659;

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
        Packet var4 = new Packet(field656, arg0.method299(arg1 + ".dat", null));
        Packet var5 = new Packet(field656, arg0.method299("index.dat", null));
        var5.field703 = var4.method231();
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
            var5.field703 += 2;
            var4.field703 += var5.method231() * var5.method231();
            var5.field703++;
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
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field663; var13++) {
                    for (int var14 = 0; var14 < this.field664; var14++) {
                        this.field662[this.field663 * var14 + var13] = var7[var4.method229()];
                    }
                }
            }
            if (Linkable.field362) {
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(B)V")
    public void method181(byte arg0) {
        Pix2D.method152(this.field664, 637, this.field663, this.field662);
        if (arg0 == -127) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method182(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field662.length; var5++) {
            int var6 = this.field662[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg1 + var7;
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
                int var12 = arg3 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field662[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg2 < 3 || arg2 > 3) {
            field656 = -97;
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method183(int arg0) {
        if (arg0 != 0) {
            this.field657 = !this.field657;
        }
        int[] var2 = new int[this.field668 * this.field667];
        for (int var3 = 0; var3 < this.field664; var3++) {
            for (int var4 = 0; var4 < this.field663; var4++) {
                var2[(this.field666 + var3) * this.field667 + this.field665 + var4] = this.field662[this.field663 * var3 + var4];
            }
        }
        this.field662 = var2;
        this.field663 = this.field667;
        this.field664 = this.field668;
        this.field665 = 0;
        this.field666 = 0;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method184(int arg0, int arg1, int arg2) {
        int var4 = this.field665 + arg2;
        int var5 = this.field666 + arg1;
        int var6 = Pix2D.field621 * var5 + var4;
        int var7 = 0;
        int var8 = this.field664;
        int var9 = this.field663;
        int var10 = Pix2D.field621 - var9;
        int var11 = 0;
        if (arg0 != -8550) {
            this.field661 = -477;
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
            this.method185(var11, false, var6, var7, var10, Pix2D.field620, var9, this.field662, var8);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IZIII[II[II)V")
    private void method185(int arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg5[arg2++] = arg7[arg3++];
                arg5[arg2++] = arg7[arg3++];
                arg5[arg2++] = arg7[arg3++];
                arg5[arg2++] = arg7[arg3++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg5[arg2++] = arg7[arg3++];
            }
            arg2 += arg4;
            arg3 += arg0;
        }
        if (arg1) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIZ)V")
    public void method186(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field659 = -110;
        }
        int var4 = this.field665 + arg0;
        int var5 = this.field666 + arg1;
        int var6 = Pix2D.field621 * var5 + var4;
        int var7 = 0;
        int var8 = this.field664;
        int var9 = this.field663;
        int var10 = Pix2D.field621 - var9;
        int var11 = 0;
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
            this.method187(Pix2D.field620, this.field662, 0, var7, var6, var9, var8, var10, var11);
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IZII)V")
    public void method188(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = this.field665 + arg2;
        int var6 = this.field666 + arg0;
        int var7 = Pix2D.field621 * var6 + var5;
        int var8 = 0;
        if (arg1) {
            this.field658 = !this.field658;
        }
        int var9 = this.field664;
        int var10 = this.field663;
        int var11 = Pix2D.field621 - var10;
        int var12 = 0;
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
            this.method189(this.field662, arg3, var11, var12, -120, var7, var10, var8, Pix2D.field620, 0, var9);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([IIIIIIII[III)V")
    private void method189(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        while (arg4 >= 0) {
            this.field661 = -347;
        }
        int var12 = 256 - arg1;
        for (int var13 = -arg10; var13 < 0; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = arg0[arg7++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    int var16 = arg8[arg5];
                    arg8[arg5++] = ((var15 & 0xFF00FF) * arg1 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg1 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg5 += arg2;
            arg7 += arg3;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([I[IIIIIZIIII)V")
    public void method190(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg6) {
            this.field660 = !this.field660;
        }
        try {
            int var12 = -arg5 / 2;
            int var13 = -arg10 / 2;
            int var14 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg8 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg9 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field621 * arg3 + arg7;
            for (int var21 = 0; var21 < arg10; var21++) {
                int var22 = arg0[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg1[var21]; var26 < 0; var26++) {
                    Pix2D.field620[var23++] = this.field662[(var24 >> 16) + (var25 >> 16) * this.field663];
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(DIIIIIIII)V")
    public void method191(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 45109) {
            return;
        }
        try {
            int var11 = -arg3 / 2;
            int var12 = -arg5 / 2;
            int var13 = (int) (Math.sin(arg0) * 65536.0D);
            int var14 = (int) (Math.cos(arg0) * 65536.0D);
            int var15 = arg6 * var13 >> 8;
            int var16 = arg6 * var14 >> 8;
            int var17 = (arg2 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg1 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field621 * arg7 + arg4;
            for (int var20 = 0; var20 < arg5; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg3; var24 < 0; var24++) {
                    int var25 = this.field662[(var22 >> 16) + (var23 >> 16) * this.field663];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Pix2D.field620[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Pix2D.field621;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ILjb;II)V")
    public void method192(int arg0, Pix8 arg1, int arg2, int arg3) {
        if (arg2 != 28501) {
            return;
        }
        int var5 = this.field665 + arg0;
        int var6 = this.field666 + arg3;
        int var7 = Pix2D.field621 * var6 + var5;
        int var8 = 0;
        int var9 = this.field664;
        int var10 = this.field663;
        int var11 = Pix2D.field621 - var10;
        int var12 = 0;
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
            this.method193(var10, 0, var12, arg1.field672, var7, this.field662, Pix2D.field620, var8, var11, var9, false);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III[BI[I[IIIIZ)V")
    private void method193(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9, boolean arg10) {
        if (arg10) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = -(arg0 >> 2);
        int var14 = -(arg0 & 0x3);
        for (int var15 = -arg9; var15 < 0; var15++) {
            for (int var16 = var13; var16 < 0; var16++) {
                int var19 = arg5[arg7++];
                if (var19 != 0 && arg3[arg4] == 0) {
                    arg6[arg4++] = var19;
                } else {
                    arg4++;
                }
                int var20 = arg5[arg7++];
                if (var20 != 0 && arg3[arg4] == 0) {
                    arg6[arg4++] = var20;
                } else {
                    arg4++;
                }
                int var21 = arg5[arg7++];
                if (var21 != 0 && arg3[arg4] == 0) {
                    arg6[arg4++] = var21;
                } else {
                    arg4++;
                }
                int var22 = arg5[arg7++];
                if (var22 != 0 && arg3[arg4] == 0) {
                    arg6[arg4++] = var22;
                } else {
                    arg4++;
                }
            }
            for (int var17 = var14; var17 < 0; var17++) {
                int var18 = arg5[arg7++];
                if (var18 != 0 && arg3[arg4] == 0) {
                    arg6[arg4++] = var18;
                } else {
                    arg4++;
                }
            }
            arg4 += arg8;
            arg7 += arg2;
        }
    }
}
