import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field666 = 2;

    @OriginalMember(owner = "jb", name = "A", descriptor = "I")
    private int field667 = 859;

    @OriginalMember(owner = "jb", name = "B", descriptor = "B")
    private byte field668 = -107;

    @OriginalMember(owner = "jb", name = "C", descriptor = "Z")
    private boolean field669 = true;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    private int field670 = 2;

    @OriginalMember(owner = "jb", name = "E", descriptor = "Z")
    private boolean field671 = false;

    @OriginalMember(owner = "jb", name = "F", descriptor = "[I")
    public int[] field672;

    @OriginalMember(owner = "jb", name = "K", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "jb", name = "L", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "jb", name = "J", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field672 = new int[arg0 * arg1];
        this.field673 = this.field677 = arg0;
        this.field674 = this.field678 = arg1;
        this.field675 = this.field676 = 0;
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field673 = var3.getWidth(arg1);
            this.field674 = var3.getHeight(arg1);
            this.field677 = this.field673;
            this.field678 = this.field674;
            this.field675 = 0;
            this.field676 = 0;
            this.field672 = new int[this.field674 * this.field673];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field673, this.field674, this.field672, 0, this.field673);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method309(arg1 + ".dat", null), 337);
        Packet var5 = new Packet(arg0.method309("index.dat", null), 337);
        var5.field710 = var4.method241();
        this.field677 = var5.method241();
        this.field678 = var5.method241();
        int var6 = var5.method239();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method243();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field710 += 2;
            var4.field710 += var5.method241() * var5.method241();
            var5.field710++;
        }
        this.field675 = var5.method239();
        this.field676 = var5.method239();
        this.field673 = var5.method241();
        this.field674 = var5.method241();
        int var10 = var5.method239();
        int var11 = this.field674 * this.field673;
        this.field672 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field672[var12] = var7[var4.method239()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field673; var13++) {
                for (int var14 = 0; var14 < this.field674; var14++) {
                    this.field672[this.field673 * var14 + var13] = var7[var4.method239()];
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method194(int arg0) {
        if (arg0 >= 3 && arg0 <= 3) {
            Pix2D.method165(this.field672, this.field673, this.field674, (byte) -59);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method195(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 7) {
            return;
        }
        for (int var5 = 0; var5 < this.field672.length; var5++) {
            int var6 = this.field672[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg3 + var7;
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
                int var12 = arg2 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field672[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method196(int arg0) {
        int[] var2 = new int[this.field678 * this.field677];
        for (int var3 = 0; var3 < this.field674; var3++) {
            for (int var4 = 0; var4 < this.field673; var4++) {
                var2[(this.field676 + var3) * this.field677 + this.field675 + var4] = this.field672[this.field673 * var3 + var4];
            }
        }
        if (arg0 < 9 || arg0 > 9) {
            return;
        }
        this.field672 = var2;
        this.field673 = this.field677;
        this.field674 = this.field678;
        this.field675 = 0;
        this.field676 = 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIZ)V")
    public void method197(int arg0, int arg1, boolean arg2) {
        int var4 = this.field675 + arg0;
        int var5 = this.field676 + arg1;
        int var6 = Pix2D.field630 * var5 + var4;
        int var7 = 0;
        int var8 = this.field674;
        int var9 = this.field673;
        int var10 = Pix2D.field630 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field632) {
            int var12 = Pix2D.field632 - var5;
            var8 -= var12;
            var5 = Pix2D.field632;
            var7 += var9 * var12;
            var6 += Pix2D.field630 * var12;
        }
        if (var5 + var8 > Pix2D.field633) {
            var8 -= var5 + var8 - Pix2D.field633;
        }
        if (var4 < Pix2D.field634) {
            int var13 = Pix2D.field634 - var4;
            var9 -= var13;
            var4 = Pix2D.field634;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field635) {
            int var14 = var4 + var9 - Pix2D.field635;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method198(Pix2D.field629, var6, (byte) 3, var8, var10, var7, this.field672, var11, var9);
            if (arg2) {
                this.field666 = -314;
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([IIBIII[III)V")
    private void method198(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg8 >> 2);
        int var11 = -(arg8 & 0x3);
        for (int var12 = -arg3; var12 < 0; var12++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg0[arg1++] = arg6[arg5++];
                arg0[arg1++] = arg6[arg5++];
                arg0[arg1++] = arg6[arg5++];
                arg0[arg1++] = arg6[arg5++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg0[arg1++] = arg6[arg5++];
            }
            arg1 += arg4;
            arg5 += arg7;
        }
        if (arg2 != 3) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method199(int arg0, int arg1, int arg2) {
        int var4 = this.field675 + arg2;
        int var5 = this.field676 + arg1;
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = Pix2D.field630 * var5 + var4;
        int var8 = 0;
        int var9 = this.field674;
        int var10 = this.field673;
        int var11 = Pix2D.field630 - var10;
        int var12 = 0;
        if (var5 < Pix2D.field632) {
            int var13 = Pix2D.field632 - var5;
            var9 -= var13;
            var5 = Pix2D.field632;
            var8 += var10 * var13;
            var7 += Pix2D.field630 * var13;
        }
        if (var5 + var9 > Pix2D.field633) {
            var9 -= var5 + var9 - Pix2D.field633;
        }
        if (var4 < Pix2D.field634) {
            int var14 = Pix2D.field634 - var4;
            var10 -= var14;
            var4 = Pix2D.field634;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field635) {
            int var15 = var4 + var10 - Pix2D.field635;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method200(Pix2D.field629, this.field672, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method200(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "jb", name = "b", descriptor = "(IIII)V")
    public void method201(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field675 + arg1;
        if (arg2 != 25372) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = this.field676 + arg3;
        int var8 = Pix2D.field630 * var7 + var5;
        int var9 = 0;
        int var10 = this.field674;
        int var11 = this.field673;
        int var12 = Pix2D.field630 - var11;
        int var13 = 0;
        if (var7 < Pix2D.field632) {
            int var14 = Pix2D.field632 - var7;
            var10 -= var14;
            var7 = Pix2D.field632;
            var9 += var11 * var14;
            var8 += Pix2D.field630 * var14;
        }
        if (var7 + var10 > Pix2D.field633) {
            var10 -= var7 + var10 - Pix2D.field633;
        }
        if (var5 < Pix2D.field634) {
            int var15 = Pix2D.field634 - var5;
            var11 -= var15;
            var5 = Pix2D.field634;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field635) {
            int var16 = var5 + var11 - Pix2D.field635;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method202(var13, arg0, var8, 0, var11, Pix2D.field629, false, var12, var9, var10, this.field672);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIII[IZIII[I)V")
    private void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg1;
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var15 = -arg4; var15 < 0; var15++) {
                int var16 = arg10[arg8++];
                if (var16 == 0) {
                    arg2++;
                } else {
                    int var17 = arg5[arg2];
                    arg5[arg2++] = ((var16 & 0xFF00FF) * arg1 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg1 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg7;
            arg8 += arg0;
        }
        if (arg6) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I[IIIIIII[III)V")
    public void method203(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg4 <= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg5 / 2;
            int var14 = -arg3 / 2;
            int var15 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var17 = arg10 * var15 >> 8;
            int var18 = arg10 * var16 >> 8;
            int var19 = (arg2 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg6 << 16) + (var14 * var18 - var13 * var17);
            int var21 = Pix2D.field630 * arg0 + arg7;
            for (int var22 = 0; var22 < arg3; var22++) {
                int var23 = arg8[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg1[var22]; var27 < 0; var27++) {
                    Pix2D.field629[var24++] = this.field672[(var25 >> 16) + (var26 >> 16) * this.field673];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += Pix2D.field630;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIDIIIB)V")
    public void method204(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (this.field668 != arg8) {
            return;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin(arg4) * 65536.0D);
            int var14 = (int) (Math.cos(arg4) * 65536.0D);
            int var15 = arg0 * var13 >> 8;
            int var16 = arg0 * var14 >> 8;
            int var17 = (arg5 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg1 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field630 * arg6 + arg2;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg7; var24 < 0; var24++) {
                    int var25 = this.field672[(var22 >> 16) + (var23 >> 16) * this.field673];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Pix2D.field629[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Pix2D.field630;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IBILkb;)V")
    public void method205(int arg0, byte arg1, int arg2, Pix8 arg3) {
        if (arg1 == 4) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = this.field675 + arg2;
        int var8 = this.field676 + arg0;
        int var9 = Pix2D.field630 * var8 + var7;
        int var10 = 0;
        int var11 = this.field674;
        int var12 = this.field673;
        int var13 = Pix2D.field630 - var12;
        int var14 = 0;
        if (var8 < Pix2D.field632) {
            int var15 = Pix2D.field632 - var8;
            var11 -= var15;
            var8 = Pix2D.field632;
            var10 += var12 * var15;
            var9 += Pix2D.field630 * var15;
        }
        if (var8 + var11 > Pix2D.field633) {
            var11 -= var8 + var11 - Pix2D.field633;
        }
        if (var7 < Pix2D.field634) {
            int var16 = Pix2D.field634 - var7;
            var12 -= var16;
            var7 = Pix2D.field634;
            var10 += var16;
            var9 += var16;
            var14 += var16;
            var13 += var16;
        }
        if (var7 + var12 > Pix2D.field635) {
            int var17 = var7 + var12 - Pix2D.field635;
            var12 -= var17;
            var14 += var17;
            var13 += var17;
        }
        if (var12 > 0 && var11 > 0) {
            this.method206(var14, var9, Pix2D.field629, var13, this.field672, var12, 0, var10, arg3.field681, var11, 770);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II[II[IIII[BII)V")
    private void method206(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        int var12 = -(arg5 >> 2);
        int var13 = -(arg5 & 0x3);
        int var14 = 16 / arg10;
        for (int var15 = -arg9; var15 < 0; var15++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg4[arg7++];
                if (var19 != 0 && arg8[arg1] == 0) {
                    arg2[arg1++] = var19;
                } else {
                    arg1++;
                }
                int var20 = arg4[arg7++];
                if (var20 != 0 && arg8[arg1] == 0) {
                    arg2[arg1++] = var20;
                } else {
                    arg1++;
                }
                int var21 = arg4[arg7++];
                if (var21 != 0 && arg8[arg1] == 0) {
                    arg2[arg1++] = var21;
                } else {
                    arg1++;
                }
                int var22 = arg4[arg7++];
                if (var22 != 0 && arg8[arg1] == 0) {
                    arg2[arg1++] = var22;
                } else {
                    arg1++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg4[arg7++];
                if (var18 != 0 && arg8[arg1] == 0) {
                    arg2[arg1++] = var18;
                } else {
                    arg1++;
                }
            }
            arg1 += arg3;
            arg7 += arg0;
        }
    }
}
