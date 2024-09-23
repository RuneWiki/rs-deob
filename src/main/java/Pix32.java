import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "y", descriptor = "Z")
    private boolean field663 = true;

    @OriginalMember(owner = "ib", name = "A", descriptor = "Z")
    private boolean field665 = true;

    @OriginalMember(owner = "ib", name = "B", descriptor = "Z")
    private boolean field666 = true;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    private int field667 = 43821;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    private int field669 = -906;

    @OriginalMember(owner = "ib", name = "F", descriptor = "[I")
    public int[] field670;

    @OriginalMember(owner = "ib", name = "K", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "ib", name = "L", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private int field664;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "ib", name = "x", descriptor = "Z")
    private static boolean field662;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field670 = new int[arg0 * arg1];
        this.field671 = this.field675 = arg0;
        this.field672 = this.field676 = arg1;
        this.field673 = this.field674 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field671 = var3.getWidth(arg1);
            this.field672 = var3.getHeight(arg1);
            this.field675 = this.field671;
            this.field676 = this.field672;
            this.field673 = 0;
            this.field674 = 0;
            this.field670 = new int[this.field672 * this.field671];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field671, this.field672, this.field670, 0, this.field671);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method299(arg1 + ".dat", null), field662);
        Packet var5 = new Packet(arg0.method299("index.dat", null), field662);
        var5.field712 = var4.method231();
        this.field675 = var5.method231();
        this.field676 = var5.method231();
        int var6 = var5.method229();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method233();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field712 += 2;
            var4.field712 += var5.method231() * var5.method231();
            var5.field712++;
        }
        this.field673 = var5.method229();
        this.field674 = var5.method229();
        this.field671 = var5.method231();
        this.field672 = var5.method231();
        int var10 = var5.method229();
        int var11 = this.field672 * this.field671;
        this.field670 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field670[var12] = var7[var4.method229()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field671; var13++) {
                for (int var14 = 0; var14 < this.field672; var14++) {
                    this.field670[this.field671 * var14 + var13] = var7[var4.method229()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Z)V")
    public void method181(boolean arg0) {
        Pix2D.method152(this.field672, this.field671, this.field670, 97);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(BIII)V")
    public void method182(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field670.length; var6++) {
            int var7 = this.field670[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg3 + var8;
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
                this.field670[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(I)V")
    public void method183(int arg0) {
        int[] var2 = new int[this.field676 * this.field675];
        for (int var3 = 0; var3 < this.field672; var3++) {
            for (int var4 = 0; var4 < this.field671; var4++) {
                var2[(this.field674 + var3) * this.field675 + this.field673 + var4] = this.field670[this.field671 * var3 + var4];
            }
        }
        this.field670 = var2;
        this.field671 = this.field675;
        this.field672 = this.field676;
        this.field673 = 0;
        if (arg0 == 0) {
            this.field674 = 0;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ZII)V")
    public void method184(boolean arg0, int arg1, int arg2) {
        int var4 = this.field673 + arg1;
        int var5 = this.field674 + arg2;
        if (!arg0) {
            this.field663 = !this.field663;
        }
        int var6 = Pix2D.field628 * var5 + var4;
        int var7 = 0;
        int var8 = this.field672;
        int var9 = this.field671;
        int var10 = Pix2D.field628 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field630) {
            int var12 = Pix2D.field630 - var5;
            var8 -= var12;
            var5 = Pix2D.field630;
            var7 += var9 * var12;
            var6 += Pix2D.field628 * var12;
        }
        if (var5 + var8 > Pix2D.field631) {
            var8 -= var5 + var8 - Pix2D.field631;
        }
        if (var4 < Pix2D.field632) {
            int var13 = Pix2D.field632 - var4;
            var9 -= var13;
            var4 = Pix2D.field632;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field633) {
            int var14 = var4 + var9 - Pix2D.field633;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method185(this.field670, var8, Pix2D.field627, -99, var10, var11, var6, var9, var7);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([II[IIIIIII)V")
    private void method185(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        while (arg3 >= 0) {
            field662 = !field662;
        }
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg1; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg2[arg6++] = arg0[arg8++];
                arg2[arg6++] = arg0[arg8++];
                arg2[arg6++] = arg0[arg8++];
                arg2[arg6++] = arg0[arg8++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg2[arg6++] = arg0[arg8++];
            }
            arg6 += arg4;
            arg8 += arg5;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIZ)V")
    public void method186(int arg0, int arg1, boolean arg2) {
        int var4 = this.field673 + arg0;
        int var5 = this.field674 + arg1;
        int var6 = Pix2D.field628 * var5 + var4;
        int var7 = 0;
        if (arg2) {
            field662 = !field662;
        }
        int var8 = this.field672;
        int var9 = this.field671;
        int var10 = Pix2D.field628 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field630) {
            int var12 = Pix2D.field630 - var5;
            var8 -= var12;
            var5 = Pix2D.field630;
            var7 += var9 * var12;
            var6 += Pix2D.field628 * var12;
        }
        if (var5 + var8 > Pix2D.field631) {
            var8 -= var5 + var8 - Pix2D.field631;
        }
        if (var4 < Pix2D.field632) {
            int var13 = Pix2D.field632 - var4;
            var9 -= var13;
            var4 = Pix2D.field632;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field633) {
            int var14 = var4 + var9 - Pix2D.field633;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method187(Pix2D.field627, this.field670, 0, var7, var6, var9, var8, var10, var11);
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

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method188(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field673 + arg3;
        int var6 = this.field674 + arg0;
        int var7 = Pix2D.field628 * var6 + var5;
        int var8 = 0;
        int var9 = this.field672;
        int var10 = this.field671;
        int var11 = Pix2D.field628 - var10;
        int var12 = 0;
        if (arg1 != 47048) {
            this.field663 = !this.field663;
        }
        if (var6 < Pix2D.field630) {
            int var13 = Pix2D.field630 - var6;
            var9 -= var13;
            var6 = Pix2D.field630;
            var8 += var10 * var13;
            var7 += Pix2D.field628 * var13;
        }
        if (var6 + var9 > Pix2D.field631) {
            var9 -= var6 + var9 - Pix2D.field631;
        }
        if (var5 < Pix2D.field632) {
            int var14 = Pix2D.field632 - var5;
            var10 -= var14;
            var5 = Pix2D.field632;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field633) {
            int var15 = var5 + var10 - Pix2D.field633;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method189(arg2, var12, var9, var7, var8, var11, 0, var10, this.field670, Pix2D.field627, (byte) 50);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIIIII[I[IB)V")
    private void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9, byte arg10) {
        if (arg10 != 50) {
            return;
        }
        int var12 = 256 - arg0;
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = -arg7; var14 < 0; var14++) {
                int var15 = arg8[arg4++];
                if (var15 == 0) {
                    arg3++;
                } else {
                    int var16 = arg9[arg3];
                    arg9[arg3++] = ((var15 & 0xFF00FF) * arg0 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg0 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg3 += arg5;
            arg4 += arg1;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIII[III[III)V")
    public void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg9 <= 0) {
            return;
        }
        try {
            int var12 = -arg0 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg10 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg10 / 326.11D) * 65536.0D);
            int var16 = arg2 * var14 >> 8;
            int var17 = arg2 * var15 >> 8;
            int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg1 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field628 * arg7 + arg6;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg8[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg5[var21]; var26 < 0; var26++) {
                    Pix2D.field627[var23++] = this.field670[(var24 >> 16) + (var25 >> 16) * this.field671];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field628;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIIDIII)V")
    public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7, int arg8) {
        if (arg1 >= 0) {
            this.field664 = 341;
        }
        try {
            int var11 = -arg8 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin(arg5) * 65536.0D);
            int var14 = (int) (Math.cos(arg5) * 65536.0D);
            int var15 = arg4 * var13 >> 8;
            int var16 = arg4 * var14 >> 8;
            int var17 = (arg0 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg2 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field628 * arg7 + arg6;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg8; var24 < 0; var24++) {
                    int var25 = this.field670[(var22 >> 16) + (var23 >> 16) * this.field671];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Pix2D.field627[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Pix2D.field628;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIBLjb;)V")
    public void method192(int arg0, int arg1, byte arg2, Pix8 arg3) {
        int var5 = this.field673 + arg0;
        int var6 = this.field674 + arg1;
        int var7 = Pix2D.field628 * var6 + var5;
        int var8 = 0;
        int var9 = this.field672;
        int var10 = this.field671;
        int var11 = Pix2D.field628 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field630) {
            int var13 = Pix2D.field630 - var6;
            var9 -= var13;
            var6 = Pix2D.field630;
            var8 += var10 * var13;
            var7 += Pix2D.field628 * var13;
        }
        if (var6 + var9 > Pix2D.field631) {
            var9 -= var6 + var9 - Pix2D.field631;
        }
        if (var5 < Pix2D.field632) {
            int var14 = Pix2D.field632 - var5;
            var10 -= var14;
            var5 = Pix2D.field632;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field633) {
            int var15 = var5 + var10 - Pix2D.field633;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method193(this.field668, var9, arg3.field681, var8, var10, var7, Pix2D.field627, this.field670, var12, var11, 0);
            if (arg2 == 53) {
                ;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(II[BIII[I[IIII)V")
    private void method193(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg4 >> 2);
        int var13 = -(arg4 & 0x3);
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg7[arg3++];
                if (var18 != 0 && arg2[arg5] == 0) {
                    arg6[arg5++] = var18;
                } else {
                    arg5++;
                }
                int var19 = arg7[arg3++];
                if (var19 != 0 && arg2[arg5] == 0) {
                    arg6[arg5++] = var19;
                } else {
                    arg5++;
                }
                int var20 = arg7[arg3++];
                if (var20 != 0 && arg2[arg5] == 0) {
                    arg6[arg5++] = var20;
                } else {
                    arg5++;
                }
                int var21 = arg7[arg3++];
                if (var21 != 0 && arg2[arg5] == 0) {
                    arg6[arg5++] = var21;
                } else {
                    arg5++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg7[arg3++];
                if (var17 != 0 && arg2[arg5] == 0) {
                    arg6[arg5++] = var17;
                } else {
                    arg5++;
                }
            }
            arg5 += arg9;
            arg3 += arg8;
        }
        if (arg0 == 0) {
            ;
        }
    }
}
