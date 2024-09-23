import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "y", descriptor = "Z")
    private boolean field652 = true;

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private int field653 = -328;

    @OriginalMember(owner = "ib", name = "A", descriptor = "I")
    private int field654 = 7;

    @OriginalMember(owner = "ib", name = "B", descriptor = "Z")
    private boolean field655 = false;

    @OriginalMember(owner = "ib", name = "C", descriptor = "B")
    private byte field656 = -52;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    private int field657 = 539;

    @OriginalMember(owner = "ib", name = "E", descriptor = "[I")
    public int[] field658;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "ib", name = "K", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field658 = new int[arg0 * arg1];
        this.field659 = this.field663 = arg0;
        this.field660 = this.field664 = arg1;
        this.field661 = this.field662 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field659 = var3.getWidth(arg1);
            this.field660 = var3.getHeight(arg1);
            this.field663 = this.field659;
            this.field664 = this.field660;
            this.field661 = 0;
            this.field662 = 0;
            this.field658 = new int[this.field660 * this.field659];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field659, this.field660, this.field658, 0, this.field659);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet((byte) 3, arg0.method294(arg1 + ".dat", null));
        Packet var5 = new Packet((byte) 3, arg0.method294("index.dat", null));
        var5.field702 = var4.method226();
        this.field663 = var5.method226();
        this.field664 = var5.method226();
        int var6 = var5.method224();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method228();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field702 += 2;
            var4.field702 += var5.method226() * var5.method226();
            var5.field702++;
        }
        this.field661 = var5.method224();
        this.field662 = var5.method224();
        this.field659 = var5.method226();
        this.field660 = var5.method226();
        int var10 = var5.method224();
        int var11 = this.field660 * this.field659;
        this.field658 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field658[var12] = var7[var4.method224()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field659; var13++) {
                for (int var14 = 0; var14 < this.field660; var14++) {
                    this.field658[this.field659 * var14 + var13] = var7[var4.method224()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(I)V")
    public void method180(int arg0) {
        Pix2D.method151(this.field658, this.field660, this.field659, -578);
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIZI)V")
    public void method181(int arg0, int arg1, boolean arg2, int arg3) {
        for (int var5 = 0; var5 < this.field658.length; var5++) {
            int var6 = this.field658[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg0 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg1 + var9;
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
                this.field658[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method182(int arg0) {
        int[] var2 = new int[this.field664 * this.field663];
        for (int var3 = 0; var3 < this.field660; var3++) {
            for (int var4 = 0; var4 < this.field659; var4++) {
                var2[(this.field662 + var3) * this.field663 + this.field661 + var4] = this.field658[this.field659 * var3 + var4];
            }
        }
        if (arg0 < 2 || arg0 > 2) {
            this.field653 = 407;
        }
        this.field658 = var2;
        this.field659 = this.field663;
        this.field660 = this.field664;
        this.field661 = 0;
        this.field662 = 0;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method183(int arg0, int arg1, int arg2) {
        int var4 = this.field661 + arg2;
        int var5 = this.field662 + arg1;
        int var6 = Pix2D.field615 * var5 + var4;
        int var7 = 0;
        if (arg0 != -47173) {
            return;
        }
        int var8 = this.field660;
        int var9 = this.field659;
        int var10 = Pix2D.field615 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field617) {
            int var12 = Pix2D.field617 - var5;
            var8 -= var12;
            var5 = Pix2D.field617;
            var7 += var9 * var12;
            var6 += Pix2D.field615 * var12;
        }
        if (var5 + var8 > Pix2D.field618) {
            var8 -= var5 + var8 - Pix2D.field618;
        }
        if (var4 < Pix2D.field619) {
            int var13 = Pix2D.field619 - var4;
            var9 -= var13;
            var4 = Pix2D.field619;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field620) {
            int var14 = var4 + var9 - Pix2D.field620;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method184(var7, Pix2D.field614, this.field658, var6, var11, var10, -39661, var9, var8);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I[I[IIIIIII)V")
    private void method184(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg1[arg3++] = arg2[arg0++];
                arg1[arg3++] = arg2[arg0++];
                arg1[arg3++] = arg2[arg0++];
                arg1[arg3++] = arg2[arg0++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg1[arg3++] = arg2[arg0++];
            }
            arg3 += arg5;
            arg0 += arg4;
        }
        if (arg6 == -39661) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(III)V")
    public void method185(int arg0, int arg1, int arg2) {
        int var4 = this.field661 + arg1;
        if (arg2 != 0) {
            return;
        }
        int var5 = this.field662 + arg0;
        int var6 = Pix2D.field615 * var5 + var4;
        int var7 = 0;
        int var8 = this.field660;
        int var9 = this.field659;
        int var10 = Pix2D.field615 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field617) {
            int var12 = Pix2D.field617 - var5;
            var8 -= var12;
            var5 = Pix2D.field617;
            var7 += var9 * var12;
            var6 += Pix2D.field615 * var12;
        }
        if (var5 + var8 > Pix2D.field618) {
            var8 -= var5 + var8 - Pix2D.field618;
        }
        if (var4 < Pix2D.field619) {
            int var13 = Pix2D.field619 - var4;
            var9 -= var13;
            var4 = Pix2D.field619;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field620) {
            int var14 = var4 + var9 - Pix2D.field620;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method186(Pix2D.field614, this.field658, 0, var7, var6, var9, var8, var10, var11);
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIB)V")
    public void method187(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field661 + arg0;
        int var6 = this.field662 + arg2;
        if (arg3 != -113) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = Pix2D.field615 * var6 + var5;
        int var9 = 0;
        int var10 = this.field660;
        int var11 = this.field659;
        int var12 = Pix2D.field615 - var11;
        int var13 = 0;
        if (var6 < Pix2D.field617) {
            int var14 = Pix2D.field617 - var6;
            var10 -= var14;
            var6 = Pix2D.field617;
            var9 += var11 * var14;
            var8 += Pix2D.field615 * var14;
        }
        if (var6 + var10 > Pix2D.field618) {
            var10 -= var6 + var10 - Pix2D.field618;
        }
        if (var5 < Pix2D.field619) {
            int var15 = Pix2D.field619 - var5;
            var11 -= var15;
            var5 = Pix2D.field619;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field620) {
            int var16 = var5 + var11 - Pix2D.field620;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method188(0, var12, this.field654, arg1, var9, this.field658, Pix2D.field614, var10, var11, var13, var8);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIII[I[IIIII)V")
    private void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg3;
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = -arg8; var14 < 0; var14++) {
                int var15 = arg5[arg4++];
                if (var15 == 0) {
                    arg10++;
                } else {
                    int var16 = arg6[arg10];
                    arg6[arg10++] = ((var15 & 0xFF00FF) * arg3 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg3 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg10 += arg1;
            arg4 += arg9;
        }
        if (arg2 != 7) {
            this.field653 = -435;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII[IIIIII[I)V")
    public void method189(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        if (arg0 != -11653) {
            this.field657 = -81;
        }
        try {
            int var12 = -arg8 / 2;
            int var13 = -arg2 / 2;
            int var14 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
            int var16 = arg5 * var14 >> 8;
            int var17 = arg5 * var15 >> 8;
            int var18 = (arg1 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg9 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field615 * arg3 + arg6;
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = arg10[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg4[var21]; var26 < 0; var26++) {
                    Pix2D.field614[var23++] = this.field658[(var24 >> 16) + (var25 >> 16) * this.field659];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field615;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIBIIIID)V")
    public void method190(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, double arg8) {
        if (arg3 != 61) {
            return;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg8) * 65536.0D);
            int var14 = (int) (Math.cos(arg8) * 65536.0D);
            int var15 = arg5 * var13 >> 8;
            int var16 = arg5 * var14 >> 8;
            int var17 = (arg2 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg6 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field615 * arg1 + arg0;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg7; var24 < 0; var24++) {
                    int var25 = this.field658[(var22 >> 16) + (var23 >> 16) * this.field659];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Pix2D.field614[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Pix2D.field615;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIILjb;)V")
    public void method191(int arg0, int arg1, int arg2, Pix8 arg3) {
        int var5 = this.field661 + arg1;
        int var6 = this.field662 + arg0;
        int var7 = Pix2D.field615 * var6 + var5;
        int var8 = 0;
        int var9 = this.field660;
        int var10 = this.field659;
        int var11 = Pix2D.field615 - var10;
        int var12 = 0;
        if (arg2 <= 0) {
            return;
        }
        if (var6 < Pix2D.field617) {
            int var13 = Pix2D.field617 - var6;
            var9 -= var13;
            var6 = Pix2D.field617;
            var8 += var10 * var13;
            var7 += Pix2D.field615 * var13;
        }
        if (var6 + var9 > Pix2D.field618) {
            var9 -= var6 + var9 - Pix2D.field618;
        }
        if (var5 < Pix2D.field619) {
            int var14 = Pix2D.field619 - var5;
            var10 -= var14;
            var5 = Pix2D.field619;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field620) {
            int var15 = var5 + var10 - Pix2D.field620;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method192(0, this.field658, var10, var9, -968, var12, arg3.field669, Pix2D.field614, var11, var7, var8);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I[IIIII[B[IIII)V")
    private void method192(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg2 >> 2);
        int var13 = -(arg2 & 0x3);
        if (arg4 >= 0) {
            this.field653 = 451;
        }
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg1[arg10++];
                if (var18 != 0 && arg6[arg9] == 0) {
                    arg7[arg9++] = var18;
                } else {
                    arg9++;
                }
                int var19 = arg1[arg10++];
                if (var19 != 0 && arg6[arg9] == 0) {
                    arg7[arg9++] = var19;
                } else {
                    arg9++;
                }
                int var20 = arg1[arg10++];
                if (var20 != 0 && arg6[arg9] == 0) {
                    arg7[arg9++] = var20;
                } else {
                    arg9++;
                }
                int var21 = arg1[arg10++];
                if (var21 != 0 && arg6[arg9] == 0) {
                    arg7[arg9++] = var21;
                } else {
                    arg9++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg1[arg10++];
                if (var17 != 0 && arg6[arg9] == 0) {
                    arg7[arg9++] = var17;
                } else {
                    arg9++;
                }
            }
            arg9 += arg8;
            arg10 += arg5;
        }
    }
}
