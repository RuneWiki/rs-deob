import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "w", descriptor = "I")
    private int field657 = 499;

    @OriginalMember(owner = "ib", name = "x", descriptor = "Z")
    private boolean field658 = true;

    @OriginalMember(owner = "ib", name = "y", descriptor = "B")
    private byte field659 = -95;

    @OriginalMember(owner = "ib", name = "z", descriptor = "Z")
    private boolean field660 = true;

    @OriginalMember(owner = "ib", name = "A", descriptor = "I")
    private int field661 = 5;

    @OriginalMember(owner = "ib", name = "B", descriptor = "Z")
    private boolean field662 = false;

    @OriginalMember(owner = "ib", name = "C", descriptor = "[I")
    public int[] field663;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field663 = new int[arg0 * arg1];
        this.field664 = this.field668 = arg0;
        this.field665 = this.field669 = arg1;
        this.field666 = this.field667 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field664 = var3.getWidth(arg1);
            this.field665 = var3.getHeight(arg1);
            this.field668 = this.field664;
            this.field669 = this.field665;
            this.field666 = 0;
            this.field667 = 0;
            this.field663 = new int[this.field665 * this.field664];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field664, this.field665, this.field663, 0, this.field664);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method295(arg1 + ".dat", null), 185);
        Packet var5 = new Packet(arg0.method295("index.dat", null), 185);
        var5.field708 = var4.method227();
        this.field668 = var5.method227();
        this.field669 = var5.method227();
        int var6 = var5.method225();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method229();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field708 += 2;
            var4.field708 += var5.method227() * var5.method227();
            var5.field708++;
        }
        this.field666 = var5.method225();
        this.field667 = var5.method225();
        this.field664 = var5.method227();
        this.field665 = var5.method227();
        int var10 = var5.method225();
        int var11 = this.field665 * this.field664;
        this.field663 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field663[var12] = var7[var4.method225()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field664; var13++) {
                for (int var14 = 0; var14 < this.field665; var14++) {
                    this.field663[this.field664 * var14 + var13] = var7[var4.method225()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I)V")
    public void method180(int arg0) {
        if (arg0 <= 0) {
            this.field661 = 67;
        }
        Pix2D.method151(this.field664, this.field665, this.field663, false);
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIZI)V")
    public void method181(int arg0, int arg1, boolean arg2, int arg3) {
        for (int var5 = 0; var5 < this.field663.length; var5++) {
            int var6 = this.field663[var5];
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
                this.field663[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(Z)V")
    public void method182(boolean arg0) {
        int[] var2 = new int[this.field669 * this.field668];
        for (int var3 = 0; var3 < this.field665; var3++) {
            for (int var4 = 0; var4 < this.field664; var4++) {
                var2[(this.field667 + var3) * this.field668 + this.field666 + var4] = this.field663[this.field664 * var3 + var4];
            }
        }
        if (arg0) {
            this.field662 = !this.field662;
        }
        this.field663 = var2;
        this.field664 = this.field668;
        this.field665 = this.field669;
        this.field666 = 0;
        this.field667 = 0;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method183(int arg0, int arg1, int arg2) {
        int var4 = this.field666 + arg2;
        if (arg1 != 5) {
            return;
        }
        int var5 = this.field667 + arg0;
        int var6 = Pix2D.field621 * var5 + var4;
        int var7 = 0;
        int var8 = this.field665;
        int var9 = this.field664;
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
            this.method184(var9, var7, Pix2D.field620, this.field663, var6, var8, var10, var11, (byte) -25);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(II[I[IIIIIB)V")
    private void method184(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        if (arg8 != -25) {
            return;
        }
        for (int var12 = -arg5; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg2[arg4++] = arg3[arg1++];
                arg2[arg4++] = arg3[arg1++];
                arg2[arg4++] = arg3[arg1++];
                arg2[arg4++] = arg3[arg1++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg2[arg4++] = arg3[arg1++];
            }
            arg4 += arg6;
            arg1 += arg7;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IBI)V")
    public void method185(int arg0, byte arg1, int arg2) {
        int var4 = this.field666 + arg0;
        int var5 = this.field667 + arg2;
        int var6 = Pix2D.field621 * var5 + var4;
        int var7 = 0;
        int var8 = this.field665;
        int var9 = this.field664;
        int var10 = Pix2D.field621 - var9;
        int var11 = 0;
        if (arg1 == 1) {
            boolean var12 = false;
        } else {
            this.field662 = !this.field662;
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
            this.method186(Pix2D.field620, this.field663, 0, var7, var6, var9, var8, var10, var11);
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
        int var5 = this.field666 + arg1;
        int var6 = this.field667 + arg2;
        int var7 = Pix2D.field621 * var6 + var5;
        int var8 = 0;
        int var9 = this.field665;
        int var10 = this.field664;
        int var11 = Pix2D.field621 - var10;
        int var12 = 0;
        if (arg3 != -6626) {
            this.field658 = !this.field658;
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
            this.method188(arg0, 15681, var7, var10, 0, var9, var12, var8, var11, Pix2D.field620, this.field663);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIIIIII[I[I)V")
    private void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int[] arg10) {
        int var12 = 256 - arg0;
        if (arg1 != 15681) {
            this.field658 = !this.field658;
        }
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = arg10[arg7++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg9[arg2];
                    arg9[arg2++] = ((var15 & 0xFF00FF) * arg0 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg0 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg8;
            arg7 += arg6;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III[II[IIIIII)V")
    public void method189(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg1 >= 0) {
            this.field658 = !this.field658;
        }
        try {
            int var12 = -arg0 / 2;
            int var13 = -arg7 / 2;
            int var14 = (int) (Math.sin((double) arg10 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg10 / 326.11D) * 65536.0D);
            int var16 = arg8 * var14 >> 8;
            int var17 = arg8 * var15 >> 8;
            int var18 = (arg2 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg4 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field621 * arg6 + arg9;
            for (int var21 = 0; var21 < arg7; var21++) {
                int var22 = arg5[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg3[var21]; var26 < 0; var26++) {
                    Pix2D.field620[var23++] = this.field663[(var24 >> 16) + (var25 >> 16) * this.field664];
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IDIIIIIII)V")
    public void method190(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg0 / 2;
            int var13 = -arg7 / 2;
            int var14 = (int) (Math.sin(arg1) * 65536.0D);
            int var15 = (int) (Math.cos(arg1) * 65536.0D);
            int var16 = arg8 * var14 >> 8;
            int var17 = arg8 * var15 >> 8;
            int var18 = (arg3 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg4 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field621 * arg5 + arg2;
            for (int var21 = 0; var21 < arg7; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg0; var25 < 0; var25++) {
                    int var26 = this.field663[(var23 >> 16) + (var24 >> 16) * this.field664];
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IBILjb;)V")
    public void method191(int arg0, byte arg1, int arg2, Pix8 arg3) {
        int var5 = this.field666 + arg0;
        if (arg1 != 0) {
            return;
        }
        int var6 = this.field667 + arg2;
        int var7 = Pix2D.field621 * var6 + var5;
        int var8 = 0;
        int var9 = this.field665;
        int var10 = this.field664;
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
            this.method192(this.field663, 0, arg3.field673, var10, var7, var9, 0, var8, Pix2D.field620, var12, var11);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([II[BIIIII[III)V")
    private void method192(int[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg1 < 0 || arg1 > 0) {
            return;
        }
        int var12 = -(arg3 >> 2);
        int var13 = -(arg3 & 0x3);
        for (int var14 = -arg5; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg0[arg7++];
                if (var18 != 0 && arg2[arg4] == 0) {
                    arg8[arg4++] = var18;
                } else {
                    arg4++;
                }
                int var19 = arg0[arg7++];
                if (var19 != 0 && arg2[arg4] == 0) {
                    arg8[arg4++] = var19;
                } else {
                    arg4++;
                }
                int var20 = arg0[arg7++];
                if (var20 != 0 && arg2[arg4] == 0) {
                    arg8[arg4++] = var20;
                } else {
                    arg4++;
                }
                int var21 = arg0[arg7++];
                if (var21 != 0 && arg2[arg4] == 0) {
                    arg8[arg4++] = var21;
                } else {
                    arg4++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg0[arg7++];
                if (var17 != 0 && arg2[arg4] == 0) {
                    arg8[arg4++] = var17;
                } else {
                    arg4++;
                }
            }
            arg4 += arg10;
            arg7 += arg9;
        }
    }
}
