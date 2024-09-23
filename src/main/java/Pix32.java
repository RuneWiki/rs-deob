import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "w", descriptor = "I")
    private int field651 = -407;

    @OriginalMember(owner = "ib", name = "x", descriptor = "Z")
    private boolean field652 = true;

    @OriginalMember(owner = "ib", name = "y", descriptor = "B")
    private byte field653 = -65;

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private int field654 = 35961;

    @OriginalMember(owner = "ib", name = "A", descriptor = "I")
    private int field655 = -676;

    @OriginalMember(owner = "ib", name = "C", descriptor = "B")
    private byte field657 = 3;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    private int field658 = -582;

    @OriginalMember(owner = "ib", name = "E", descriptor = "Z")
    private boolean field659 = false;

    @OriginalMember(owner = "ib", name = "F", descriptor = "Z")
    private boolean field660 = false;

    @OriginalMember(owner = "ib", name = "G", descriptor = "[I")
    public int[] field661;

    @OriginalMember(owner = "ib", name = "L", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "ib", name = "M", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "ib", name = "K", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "ib", name = "B", descriptor = "I")
    private int field656;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field661 = new int[arg0 * arg1];
        this.field662 = this.field666 = arg0;
        this.field663 = this.field667 = arg1;
        this.field664 = this.field665 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field662 = var3.getWidth(arg1);
            this.field663 = var3.getHeight(arg1);
            this.field666 = this.field662;
            this.field667 = this.field663;
            this.field664 = 0;
            this.field665 = 0;
            this.field661 = new int[this.field663 * this.field662];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field662, this.field663, this.field661, 0, this.field662);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method294(arg1 + ".dat", null), (byte) 1);
        Packet var5 = new Packet(arg0.method294("index.dat", null), (byte) 1);
        var5.field709 = var4.method226();
        this.field666 = var5.method226();
        this.field667 = var5.method226();
        int var6 = var5.method224();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method228();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field709 += 2;
            var4.field709 += var5.method226() * var5.method226();
            var5.field709++;
        }
        this.field664 = var5.method224();
        this.field665 = var5.method224();
        this.field662 = var5.method226();
        this.field663 = var5.method226();
        int var10 = var5.method224();
        int var11 = this.field663 * this.field662;
        this.field661 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field661[var12] = var7[var4.method224()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field662; var13++) {
                for (int var14 = 0; var14 < this.field663; var14++) {
                    this.field661[this.field662 * var14 + var13] = var7[var4.method224()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(Z)V")
    public void method180(boolean arg0) {
        if (!arg0) {
            this.field651 = 192;
        }
        Pix2D.method151(this.field662, this.field663, this.field661, 9);
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method181(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 6 || arg1 > 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field661.length; var6++) {
            int var7 = this.field661[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg2 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg3 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var7 & 0xFF;
                int var13 = arg0 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field661[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(B)V")
    public void method182(byte arg0) {
        int[] var2 = new int[this.field667 * this.field666];
        for (int var3 = 0; var3 < this.field663; var3++) {
            for (int var5 = 0; var5 < this.field662; var5++) {
                var2[(this.field665 + var3) * this.field666 + this.field664 + var5] = this.field661[this.field662 * var3 + var5];
            }
        }
        if (arg0 == 3) {
            boolean var4 = false;
        } else {
            this.field659 = !this.field659;
        }
        this.field661 = var2;
        this.field662 = this.field666;
        this.field663 = this.field667;
        this.field664 = 0;
        this.field665 = 0;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IZI)V")
    public void method183(int arg0, boolean arg1, int arg2) {
        int var4 = this.field664 + arg2;
        int var5 = this.field665 + arg0;
        int var6 = Pix2D.field616 * var5 + var4;
        int var7 = 0;
        if (arg1) {
            return;
        }
        int var8 = this.field663;
        int var9 = this.field662;
        int var10 = Pix2D.field616 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field618) {
            int var12 = Pix2D.field618 - var5;
            var8 -= var12;
            var5 = Pix2D.field618;
            var7 += var9 * var12;
            var6 += Pix2D.field616 * var12;
        }
        if (var5 + var8 > Pix2D.field619) {
            var8 -= var5 + var8 - Pix2D.field619;
        }
        if (var4 < Pix2D.field620) {
            int var13 = Pix2D.field620 - var4;
            var9 -= var13;
            var4 = Pix2D.field620;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field621) {
            int var14 = var4 + var9 - Pix2D.field621;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method184(var11, var7, this.field661, this.field652, var8, var9, var10, var6, Pix2D.field615);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(II[IZIIII[I)V")
    private void method184(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg5 >> 2);
        if (!arg3) {
            this.field651 = 362;
        }
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg4; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg8[arg7++] = arg2[arg1++];
                arg8[arg7++] = arg2[arg1++];
                arg8[arg7++] = arg2[arg1++];
                arg8[arg7++] = arg2[arg1++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg8[arg7++] = arg2[arg1++];
            }
            arg7 += arg6;
            arg1 += arg0;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(BII)V")
    public void method185(byte arg0, int arg1, int arg2) {
        int var4 = this.field664 + arg1;
        int var5 = this.field665 + arg2;
        int var6 = Pix2D.field616 * var5 + var4;
        int var7 = 0;
        if (arg0 != 7) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = this.field663;
        int var10 = this.field662;
        int var11 = Pix2D.field616 - var10;
        int var12 = 0;
        if (var5 < Pix2D.field618) {
            int var13 = Pix2D.field618 - var5;
            var9 -= var13;
            var5 = Pix2D.field618;
            var7 += var10 * var13;
            var6 += Pix2D.field616 * var13;
        }
        if (var5 + var9 > Pix2D.field619) {
            var9 -= var5 + var9 - Pix2D.field619;
        }
        if (var4 < Pix2D.field620) {
            int var14 = Pix2D.field620 - var4;
            var10 -= var14;
            var4 = Pix2D.field620;
            var7 += var14;
            var6 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field621) {
            int var15 = var4 + var10 - Pix2D.field621;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method186(Pix2D.field615, this.field661, 0, var7, var6, var10, var9, var11, var12);
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

    @OriginalMember(owner = "ib", name = "b", descriptor = "(IIII)V")
    public void method187(int arg0, int arg1, int arg2, int arg3) {
        while (arg2 >= 0) {
            this.field652 = !this.field652;
        }
        int var5 = this.field664 + arg1;
        int var6 = this.field665 + arg0;
        int var7 = Pix2D.field616 * var6 + var5;
        int var8 = 0;
        int var9 = this.field663;
        int var10 = this.field662;
        int var11 = Pix2D.field616 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field618) {
            int var13 = Pix2D.field618 - var6;
            var9 -= var13;
            var6 = Pix2D.field618;
            var8 += var10 * var13;
            var7 += Pix2D.field616 * var13;
        }
        if (var6 + var9 > Pix2D.field619) {
            var9 -= var6 + var9 - Pix2D.field619;
        }
        if (var5 < Pix2D.field620) {
            int var14 = Pix2D.field620 - var5;
            var10 -= var14;
            var5 = Pix2D.field620;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field621) {
            int var15 = var5 + var10 - Pix2D.field621;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method188(var11, var12, arg3, var10, Pix2D.field615, 0, var7, this.field656, var8, var9, this.field661);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII[IIIIII[I)V")
    private void method188(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg2;
        if (arg7 != 0) {
            this.field660 = !this.field660;
        }
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = arg10[arg8++];
                if (var15 == 0) {
                    arg6++;
                } else {
                    int var16 = arg4[arg6];
                    arg4[arg6++] = ((var15 & 0xFF00FF) * arg2 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg2 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg6 += arg0;
            arg8 += arg1;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIII[II[IIII)V")
    public void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg8 >= 0) {
            return;
        }
        try {
            int var12 = -arg2 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var16 = arg0 * var14 >> 8;
            int var17 = arg0 * var15 >> 8;
            int var18 = (arg1 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg6 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field616 * arg10 + arg4;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg7[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg5[var21]; var26 < 0; var26++) {
                    Pix2D.field615[var23++] = this.field661[(var24 >> 16) + (var25 >> 16) * this.field662];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field616;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIDIBII)V")
    public void method190(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (arg6 != -32) {
            this.field660 = !this.field660;
        }
        try {
            int var11 = -arg8 / 2;
            int var12 = -arg1 / 2;
            int var13 = (int) (Math.sin(arg4) * 65536.0D);
            int var14 = (int) (Math.cos(arg4) * 65536.0D);
            int var15 = arg5 * var13 >> 8;
            int var16 = arg5 * var14 >> 8;
            int var17 = (arg0 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg7 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field616 * arg3 + arg2;
            for (int var20 = 0; var20 < arg1; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg8; var24 < 0; var24++) {
                    int var25 = this.field661[(var22 >> 16) + (var23 >> 16) * this.field662];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Pix2D.field615[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Pix2D.field616;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IILjb;I)V")
    public void method191(int arg0, int arg1, Pix8 arg2, int arg3) {
        if (arg0 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field664 + arg1;
        int var7 = this.field665 + arg3;
        int var8 = Pix2D.field616 * var7 + var6;
        int var9 = 0;
        int var10 = this.field663;
        int var11 = this.field662;
        int var12 = Pix2D.field616 - var11;
        int var13 = 0;
        if (var7 < Pix2D.field618) {
            int var14 = Pix2D.field618 - var7;
            var10 -= var14;
            var7 = Pix2D.field618;
            var9 += var11 * var14;
            var8 += Pix2D.field616 * var14;
        }
        if (var7 + var10 > Pix2D.field619) {
            var10 -= var7 + var10 - Pix2D.field619;
        }
        if (var6 < Pix2D.field620) {
            int var15 = Pix2D.field620 - var6;
            var11 -= var15;
            var6 = Pix2D.field620;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > Pix2D.field621) {
            int var16 = var6 + var11 - Pix2D.field621;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method192(Pix2D.field615, var8, var9, var10, 5, var13, var11, 0, arg2.field675, var12, this.field661);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([IIIIIIII[BI[I)V")
    private void method192(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int[] arg10) {
        int var12 = -(arg6 >> 2);
        int var13 = -(arg6 & 0x3);
        if (arg4 != 5) {
            this.field659 = !this.field659;
        }
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg10[arg2++];
                if (var18 != 0 && arg8[arg1] == 0) {
                    arg0[arg1++] = var18;
                } else {
                    arg1++;
                }
                int var19 = arg10[arg2++];
                if (var19 != 0 && arg8[arg1] == 0) {
                    arg0[arg1++] = var19;
                } else {
                    arg1++;
                }
                int var20 = arg10[arg2++];
                if (var20 != 0 && arg8[arg1] == 0) {
                    arg0[arg1++] = var20;
                } else {
                    arg1++;
                }
                int var21 = arg10[arg2++];
                if (var21 != 0 && arg8[arg1] == 0) {
                    arg0[arg1++] = var21;
                } else {
                    arg1++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg10[arg2++];
                if (var17 != 0 && arg8[arg1] == 0) {
                    arg0[arg1++] = var17;
                } else {
                    arg1++;
                }
            }
            arg1 += arg9;
            arg2 += arg5;
        }
    }
}
