import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "jb", name = "x", descriptor = "I")
    private int field652 = 397;

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field653 = 945;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field654 = -66;

    @OriginalMember(owner = "jb", name = "A", descriptor = "I")
    private int field655 = 663;

    @OriginalMember(owner = "jb", name = "B", descriptor = "Z")
    private boolean field656 = true;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field657;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field657 = new int[arg0 * arg1];
        this.field658 = this.field662 = arg0;
        this.field659 = this.field663 = arg1;
        this.field660 = this.field661 = 0;
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field658 = var3.getWidth(arg1);
            this.field659 = var3.getHeight(arg1);
            this.field662 = this.field658;
            this.field663 = this.field659;
            this.field660 = 0;
            this.field661 = 0;
            this.field657 = new int[this.field659 * this.field658];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field658, this.field659, this.field657, 0, this.field658);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), true);
        Packet var5 = new Packet(arg0.method299("index.dat", null), true);
        var5.field698 = var4.method233();
        this.field662 = var5.method233();
        this.field663 = var5.method233();
        int var6 = var5.method231();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method235();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field698 += 2;
            var4.field698 += var5.method233() * var5.method233();
            var5.field698++;
        }
        this.field660 = var5.method231();
        this.field661 = var5.method231();
        this.field658 = var5.method233();
        this.field659 = var5.method233();
        int var10 = var5.method231();
        int var11 = this.field659 * this.field658;
        this.field657 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field657[var12] = var7[var4.method231()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field658; var13++) {
                for (int var14 = 0; var14 < this.field659; var14++) {
                    this.field657[this.field658 * var14 + var13] = var7[var4.method231()];
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method186(byte arg0) {
        if (arg0 != 1) {
            this.field655 = -1;
        }
        Pix2D.method161(this.field657, this.field659, this.field658, 7);
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IBII)V")
    public void method187(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field657.length; var6++) {
            int var7 = this.field657[var6];
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
                this.field657[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method188(int arg0, int arg1, int arg2) {
        int var4 = this.field660 + arg2;
        int var5 = this.field661 + arg1;
        int var6 = Pix2D.field617 * var5 + var4;
        int var7 = 0;
        int var8 = this.field659;
        int var9 = this.field658;
        int var10 = Pix2D.field617 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field619) {
            int var12 = Pix2D.field619 - var5;
            var8 -= var12;
            var5 = Pix2D.field619;
            var7 += var9 * var12;
            var6 += Pix2D.field617 * var12;
        }
        if (var5 + var8 > Pix2D.field620) {
            var8 -= var5 + var8 - Pix2D.field620;
        }
        if (var4 < Pix2D.field621) {
            int var13 = Pix2D.field621 - var4;
            var9 -= var13;
            var4 = Pix2D.field621;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field622) {
            int var14 = var4 + var9 - Pix2D.field622;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method189(this.field657, 0, var10, Pix2D.field616, var8, var9, var7, var11, var6);
            if (arg0 != 8) {
                this.field652 = -42;
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([III[IIIIII)V")
    private void method189(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg4; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg3[arg8++] = arg0[arg6++];
                arg3[arg8++] = arg0[arg6++];
                arg3[arg8++] = arg0[arg6++];
                arg3[arg8++] = arg0[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg3[arg8++] = arg0[arg6++];
            }
            arg8 += arg2;
            arg6 += arg7;
        }
        if (arg1 < 0 || arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(III)V")
    public void method190(int arg0, int arg1, int arg2) {
        int var4 = 65 / arg1;
        int var5 = this.field660 + arg2;
        int var6 = this.field661 + arg0;
        int var7 = Pix2D.field617 * var6 + var5;
        int var8 = 0;
        int var9 = this.field659;
        int var10 = this.field658;
        int var11 = Pix2D.field617 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field619) {
            int var13 = Pix2D.field619 - var6;
            var9 -= var13;
            var6 = Pix2D.field619;
            var8 += var10 * var13;
            var7 += Pix2D.field617 * var13;
        }
        if (var6 + var9 > Pix2D.field620) {
            var9 -= var6 + var9 - Pix2D.field620;
        }
        if (var5 < Pix2D.field621) {
            int var14 = Pix2D.field621 - var5;
            var10 -= var14;
            var5 = Pix2D.field621;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field622) {
            int var15 = var5 + var10 - Pix2D.field622;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method191(Pix2D.field616, this.field657, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method191(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIZ)V")
    public void method192(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            return;
        }
        try {
            int var6 = this.field658;
            int var7 = this.field659;
            int var8 = 0;
            int var9 = 0;
            int var10 = (var6 << 16) / arg2;
            int var11 = (var7 << 16) / arg3;
            int var12 = this.field662;
            int var13 = this.field663;
            int var14 = (var12 << 16) / arg2;
            int var15 = (var13 << 16) / arg3;
            int var16 = (this.field660 * arg2 + var12 - 1) / var12 + arg0;
            int var17 = (this.field661 * arg3 + var13 - 1) / var13 + arg1;
            if (this.field660 * arg2 % var12 != 0) {
                var8 = (var12 - this.field660 * arg2 % var12 << 16) / arg2;
            }
            if (this.field661 * arg3 % var13 != 0) {
                var9 = (var13 - this.field661 * arg3 % var13 << 16) / arg3;
            }
            int var18 = (this.field658 - (var8 >> 16)) * arg2 / var12;
            int var19 = (this.field659 - (var9 >> 16)) * arg3 / var13;
            int var20 = Pix2D.field617 * var17 + var16;
            int var21 = Pix2D.field617 - var18;
            if (var17 < Pix2D.field619) {
                int var22 = Pix2D.field619 - var17;
                var19 -= var22;
                var17 = 0;
                var20 += Pix2D.field617 * var22;
                var9 += var15 * var22;
            }
            if (var17 + var19 > Pix2D.field620) {
                var19 -= var17 + var19 - Pix2D.field620;
            }
            if (var16 < Pix2D.field621) {
                int var23 = Pix2D.field621 - var16;
                var18 -= var23;
                var16 = 0;
                var20 += var23;
                var8 += var14 * var23;
                var21 += var23;
            }
            if (var16 + var18 > Pix2D.field622) {
                int var24 = var16 + var18 - Pix2D.field622;
                var18 -= var24;
                var21 += var24;
            }
            this.method193(0, var14, var6, 945, var19, var18, var21, this.field657, var20, Pix2D.field616, var9, var15, var8);
        } catch (Exception var25) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIIII[II[IIII)V")
    private void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12) {
        int var14 = 9 / arg3;
        try {
            int var15 = arg12;
            for (int var16 = -arg4; var16 < 0; var16++) {
                int var17 = (arg10 >> 16) * arg2;
                for (int var18 = -arg5; var18 < 0; var18++) {
                    int var19 = arg7[(arg12 >> 16) + var17];
                    if (var19 == 0) {
                        arg8++;
                    } else {
                        arg9[arg8++] = var19;
                    }
                    arg12 += arg1;
                }
                arg10 += arg11;
                arg12 = var15;
                arg8 += arg6;
            }
        } catch (Exception var20) {
            System.out.println("error in plot_scale");
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method194(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field660 + arg1;
        if (arg2 != 0) {
            this.field656 = !this.field656;
        }
        int var6 = this.field661 + arg3;
        int var7 = Pix2D.field617 * var6 + var5;
        int var8 = 0;
        int var9 = this.field659;
        int var10 = this.field658;
        int var11 = Pix2D.field617 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field619) {
            int var13 = Pix2D.field619 - var6;
            var9 -= var13;
            var6 = Pix2D.field619;
            var8 += var10 * var13;
            var7 += Pix2D.field617 * var13;
        }
        if (var6 + var9 > Pix2D.field620) {
            var9 -= var6 + var9 - Pix2D.field620;
        }
        if (var5 < Pix2D.field621) {
            int var14 = Pix2D.field621 - var5;
            var10 -= var14;
            var5 = Pix2D.field621;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field622) {
            int var15 = var5 + var10 - Pix2D.field622;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method195(var10, var11, 0, var7, var8, this.field657, Pix2D.field616, true, var12, arg0, var9);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIII[I[IZIII)V")
    private void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, boolean arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg9;
        if (!arg7) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = -arg0; var15 < 0; var15++) {
                int var16 = arg5[arg4++];
                if (var16 == 0) {
                    arg3++;
                } else {
                    int var17 = arg6[arg3];
                    arg6[arg3++] = ((var16 & 0xFF00FF) * arg9 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg9 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg3 += arg1;
            arg4 += arg8;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIZI[II[III)V")
    public void method196(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (!arg4) {
            this.field656 = !this.field656;
        }
        try {
            int var12 = -arg2 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var16 = arg10 * var14 >> 8;
            int var17 = arg10 * var15 >> 8;
            int var18 = (arg1 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg0 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field617 * arg5 + arg7;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg8[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg6[var21]; var26 < 0; var26++) {
                    Pix2D.field616[var23++] = this.field657[(var24 >> 16) + (var25 >> 16) * this.field658];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field617;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILkb;)V")
    public void method197(int arg0, int arg1, int arg2, Pix8 arg3) {
        if (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field660 + arg1;
        int var7 = this.field661 + arg2;
        int var8 = Pix2D.field617 * var7 + var6;
        int var9 = 0;
        int var10 = this.field659;
        int var11 = this.field658;
        int var12 = Pix2D.field617 - var11;
        int var13 = 0;
        if (var7 < Pix2D.field619) {
            int var14 = Pix2D.field619 - var7;
            var10 -= var14;
            var7 = Pix2D.field619;
            var9 += var11 * var14;
            var8 += Pix2D.field617 * var14;
        }
        if (var7 + var10 > Pix2D.field620) {
            var10 -= var7 + var10 - Pix2D.field620;
        }
        if (var6 < Pix2D.field621) {
            int var15 = Pix2D.field621 - var6;
            var11 -= var15;
            var6 = Pix2D.field621;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > Pix2D.field622) {
            int var16 = var6 + var11 - Pix2D.field622;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method198(0, var11, var9, Pix2D.field616, var10, var13, 0, this.field657, arg3.field671, var12, var8);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III[IIII[I[BII)V")
    private void method198(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, byte[] arg8, int arg9, int arg10) {
        int var12 = -(arg1 >> 2);
        int var13 = -(arg1 & 0x3);
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg7[arg2++];
                if (var19 != 0 && arg8[arg10] == 0) {
                    arg3[arg10++] = var19;
                } else {
                    arg10++;
                }
                int var20 = arg7[arg2++];
                if (var20 != 0 && arg8[arg10] == 0) {
                    arg3[arg10++] = var20;
                } else {
                    arg10++;
                }
                int var21 = arg7[arg2++];
                if (var21 != 0 && arg8[arg10] == 0) {
                    arg3[arg10++] = var21;
                } else {
                    arg10++;
                }
                int var22 = arg7[arg2++];
                if (var22 != 0 && arg8[arg10] == 0) {
                    arg3[arg10++] = var22;
                } else {
                    arg10++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg7[arg2++];
                if (var18 != 0 && arg8[arg10] == 0) {
                    arg3[arg10++] = var18;
                } else {
                    arg10++;
                }
            }
            arg10 += arg9;
            arg2 += arg5;
        }
        if (arg0 < 0 || arg0 > 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }
}
