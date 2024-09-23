import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private int field677 = -31767;

    @OriginalMember(owner = "ib", name = "A", descriptor = "Z")
    private boolean field678 = true;

    @OriginalMember(owner = "ib", name = "B", descriptor = "Z")
    private boolean field679 = false;

    @OriginalMember(owner = "ib", name = "C", descriptor = "Z")
    private boolean field680 = true;

    @OriginalMember(owner = "ib", name = "D", descriptor = "[I")
    public int[] field681;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field681 = new int[arg0 * arg1];
        this.field682 = this.field686 = arg0;
        this.field683 = this.field687 = arg1;
        this.field684 = this.field685 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field682 = var3.getWidth(arg1);
            this.field683 = var3.getHeight(arg1);
            this.field686 = this.field682;
            this.field687 = this.field683;
            this.field684 = 0;
            this.field685 = 0;
            this.field681 = new int[this.field683 * this.field682];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field682, this.field683, this.field681, 0, this.field682);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(-49365, arg0.method299(arg1 + ".dat", null));
        Packet var5 = new Packet(-49365, arg0.method299("index.dat", null));
        var5.field722 = var4.method231();
        this.field686 = var5.method231();
        this.field687 = var5.method231();
        int var6 = var5.method229();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method233();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field722 += 2;
            var4.field722 += var5.method231() * var5.method231();
            var5.field722++;
        }
        this.field684 = var5.method229();
        this.field685 = var5.method229();
        this.field682 = var5.method231();
        this.field683 = var5.method231();
        int var10 = var5.method229();
        int var11 = this.field683 * this.field682;
        this.field681 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field681[var12] = var7[var4.method229()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field682; var13++) {
                for (int var14 = 0; var14 < this.field683; var14++) {
                    this.field681[this.field682 * var14 + var13] = var7[var4.method229()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I)V")
    public void method181(int arg0) {
        if (arg0 != 6745) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Pix2D.method152(-682, this.field682, this.field681, this.field683);
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method182(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 2 / arg3;
        for (int var6 = 0; var6 < this.field681.length; var6++) {
            int var7 = this.field681[var6];
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
                this.field681[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(Z)V")
    public void method183(boolean arg0) {
        int[] var2 = new int[this.field687 * this.field686];
        for (int var3 = 0; var3 < this.field683; var3++) {
            for (int var5 = 0; var5 < this.field682; var5++) {
                var2[(this.field685 + var3) * this.field686 + this.field684 + var5] = this.field681[this.field682 * var3 + var5];
            }
        }
        this.field681 = var2;
        this.field682 = this.field686;
        this.field683 = this.field687;
        this.field684 = 0;
        this.field685 = 0;
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method184(int arg0, int arg1, int arg2) {
        int var4 = this.field684 + arg1;
        int var5 = this.field685 + arg2;
        int var6 = Pix2D.field640 * var5 + var4;
        int var7 = 0;
        int var8 = this.field683;
        int var9 = this.field682;
        int var10 = Pix2D.field640 - var9;
        int var11 = 0;
        if (arg0 != -30783) {
            this.field679 = !this.field679;
        }
        if (var5 < Pix2D.field642) {
            int var12 = Pix2D.field642 - var5;
            var8 -= var12;
            var5 = Pix2D.field642;
            var7 += var9 * var12;
            var6 += Pix2D.field640 * var12;
        }
        if (var5 + var8 > Pix2D.field643) {
            var8 -= var5 + var8 - Pix2D.field643;
        }
        if (var4 < Pix2D.field644) {
            int var13 = Pix2D.field644 - var4;
            var9 -= var13;
            var4 = Pix2D.field644;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field645) {
            int var14 = var4 + var9 - Pix2D.field645;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method185(var8, var6, 0, var7, var10, Pix2D.field639, this.field681, var9, var11);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIII[I[III)V")
    private void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        if (arg2 != 0) {
            this.field678 = !this.field678;
        }
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg5[arg1++] = arg6[arg3++];
                arg5[arg1++] = arg6[arg3++];
                arg5[arg1++] = arg6[arg3++];
                arg5[arg1++] = arg6[arg3++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg5[arg1++] = arg6[arg3++];
            }
            arg1 += arg4;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IZI)V")
    public void method186(int arg0, boolean arg1, int arg2) {
        int var4 = this.field684 + arg0;
        int var5 = this.field685 + arg2;
        int var6 = Pix2D.field640 * var5 + var4;
        int var7 = 0;
        if (!arg1) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = this.field683;
        int var10 = this.field682;
        int var11 = Pix2D.field640 - var10;
        int var12 = 0;
        if (var5 < Pix2D.field642) {
            int var13 = Pix2D.field642 - var5;
            var9 -= var13;
            var5 = Pix2D.field642;
            var7 += var10 * var13;
            var6 += Pix2D.field640 * var13;
        }
        if (var5 + var9 > Pix2D.field643) {
            var9 -= var5 + var9 - Pix2D.field643;
        }
        if (var4 < Pix2D.field644) {
            int var14 = Pix2D.field644 - var4;
            var10 -= var14;
            var4 = Pix2D.field644;
            var7 += var14;
            var6 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field645) {
            int var15 = var4 + var10 - Pix2D.field645;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method187(Pix2D.field639, this.field681, 0, var7, var6, var10, var9, var11, var12);
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIB)V")
    public void method188(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field684 + arg0;
        int var6 = this.field685 + arg2;
        int var7 = Pix2D.field640 * var6 + var5;
        int var8 = 0;
        if (arg3 != 6) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = this.field683;
        int var11 = this.field682;
        int var12 = Pix2D.field640 - var11;
        int var13 = 0;
        if (var6 < Pix2D.field642) {
            int var14 = Pix2D.field642 - var6;
            var10 -= var14;
            var6 = Pix2D.field642;
            var8 += var11 * var14;
            var7 += Pix2D.field640 * var14;
        }
        if (var6 + var10 > Pix2D.field643) {
            var10 -= var6 + var10 - Pix2D.field643;
        }
        if (var5 < Pix2D.field644) {
            int var15 = Pix2D.field644 - var5;
            var11 -= var15;
            var5 = Pix2D.field644;
            var8 += var15;
            var7 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field645) {
            int var16 = var5 + var11 - Pix2D.field645;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method189(var7, arg1, var8, var12, this.field681, 0, false, Pix2D.field639, var11, var13, var10);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII[IIZ[IIII)V")
    private void method189(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg6) {
            return;
        }
        int var12 = 256 - arg1;
        for (int var13 = -arg10; var13 < 0; var13++) {
            for (int var14 = -arg8; var14 < 0; var14++) {
                int var15 = arg4[arg2++];
                if (var15 == 0) {
                    arg0++;
                } else {
                    int var16 = arg7[arg0];
                    arg7[arg0++] = ((var15 & 0xFF00FF) * arg1 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg1 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg0 += arg3;
            arg2 += arg9;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III[IIIII[III)V")
    public void method190(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg4 != 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg1 / 2;
            int var14 = -arg10 / 2;
            int var15 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var17 = arg6 * var15 >> 8;
            int var18 = arg6 * var16 >> 8;
            int var19 = (arg7 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg2 << 16) + (var14 * var18 - var13 * var17);
            int var21 = Pix2D.field640 * arg9 + arg5;
            for (int var22 = 0; var22 < arg10; var22++) {
                int var23 = arg3[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg8[var22]; var27 < 0; var27++) {
                    Pix2D.field639[var24++] = this.field681[(var25 >> 16) + (var26 >> 16) * this.field682];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += Pix2D.field640;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIIIDII)V")
    public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7, int arg8) {
        if (arg7 != 0) {
            this.field679 = !this.field679;
        }
        try {
            int var11 = -arg0 / 2;
            int var12 = -arg2 / 2;
            int var13 = (int) (Math.sin(arg6) * 65536.0D);
            int var14 = (int) (Math.cos(arg6) * 65536.0D);
            int var15 = arg4 * var13 >> 8;
            int var16 = arg4 * var14 >> 8;
            int var17 = (arg1 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg3 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field640 * arg8 + arg5;
            for (int var20 = 0; var20 < arg2; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg0; var24 < 0; var24++) {
                    int var25 = this.field681[(var22 >> 16) + (var23 >> 16) * this.field682];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Pix2D.field639[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Pix2D.field640;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ILjb;BI)V")
    public void method192(int arg0, Pix8 arg1, byte arg2, int arg3) {
        int var5 = this.field684 + arg3;
        int var6 = this.field685 + arg0;
        if (arg2 != 7) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = Pix2D.field640 * var6 + var5;
        int var9 = 0;
        int var10 = this.field683;
        int var11 = this.field682;
        int var12 = Pix2D.field640 - var11;
        int var13 = 0;
        if (var6 < Pix2D.field642) {
            int var14 = Pix2D.field642 - var6;
            var10 -= var14;
            var6 = Pix2D.field642;
            var9 += var11 * var14;
            var8 += Pix2D.field640 * var14;
        }
        if (var6 + var10 > Pix2D.field643) {
            var10 -= var6 + var10 - Pix2D.field643;
        }
        if (var5 < Pix2D.field644) {
            int var15 = Pix2D.field644 - var5;
            var11 -= var15;
            var5 = Pix2D.field644;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field645) {
            int var16 = var5 + var11 - Pix2D.field645;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method193(var13, Pix2D.field639, 80, this.field681, 0, var9, var8, var11, arg1.field692, var12, var10);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I[II[IIIII[BII)V")
    private void method193(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        int var12 = 7 / arg2;
        int var13 = -(arg7 >> 2);
        int var14 = -(arg7 & 0x3);
        for (int var15 = -arg10; var15 < 0; var15++) {
            for (int var16 = var13; var16 < 0; var16++) {
                int var19 = arg3[arg5++];
                if (var19 != 0 && arg8[arg6] == 0) {
                    arg1[arg6++] = var19;
                } else {
                    arg6++;
                }
                int var20 = arg3[arg5++];
                if (var20 != 0 && arg8[arg6] == 0) {
                    arg1[arg6++] = var20;
                } else {
                    arg6++;
                }
                int var21 = arg3[arg5++];
                if (var21 != 0 && arg8[arg6] == 0) {
                    arg1[arg6++] = var21;
                } else {
                    arg6++;
                }
                int var22 = arg3[arg5++];
                if (var22 != 0 && arg8[arg6] == 0) {
                    arg1[arg6++] = var22;
                } else {
                    arg6++;
                }
            }
            for (int var17 = var14; var17 < 0; var17++) {
                int var18 = arg3[arg5++];
                if (var18 != 0 && arg8[arg6] == 0) {
                    arg1[arg6++] = var18;
                } else {
                    arg6++;
                }
            }
            arg6 += arg9;
            arg5 += arg0;
        }
    }
}
