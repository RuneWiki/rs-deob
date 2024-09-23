import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "jb", name = "v", descriptor = "Z")
    private boolean field667 = true;

    @OriginalMember(owner = "jb", name = "w", descriptor = "I")
    private int field668 = -11252;

    @OriginalMember(owner = "jb", name = "y", descriptor = "[I")
    public int[] field670;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "jb", name = "A", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "jb", name = "C", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "jb", name = "B", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "jb", name = "x", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field670 = new int[arg0 * arg1];
        this.field671 = this.field675 = arg0;
        this.field672 = this.field676 = arg1;
        this.field673 = this.field674 = 0;
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
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

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method308(arg1 + ".dat", null), false);
        Packet var5 = new Packet(arg0.method308("index.dat", null), false);
        var5.field713 = var4.method240();
        this.field675 = var5.method240();
        this.field676 = var5.method240();
        int var6 = var5.method238();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method242();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field713 += 2;
            var4.field713 += var5.method240() * var5.method240();
            var5.field713++;
        }
        this.field673 = var5.method238();
        this.field674 = var5.method238();
        this.field671 = var5.method240();
        this.field672 = var5.method240();
        int var10 = var5.method238();
        int var11 = this.field672 * this.field671;
        this.field670 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field670[var12] = var7[var4.method238()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field671; var13++) {
                for (int var14 = 0; var14 < this.field672; var14++) {
                    this.field670[this.field671 * var14 + var13] = var7[var4.method238()];
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method193(byte arg0) {
        Pix2D.method164(this.field670, -258, this.field671, this.field672);
        if (arg0 != -41) {
            this.field669 = -444;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IZII)V")
    public void method194(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field669 = 345;
        }
        for (int var5 = 0; var5 < this.field670.length; var5++) {
            int var6 = this.field670[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg0 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg2 + var9;
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
                this.field670[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I)V")
    public void method195(int arg0) {
        int[] var2 = new int[this.field676 * this.field675];
        for (int var3 = 0; var3 < this.field672; var3++) {
            for (int var4 = 0; var4 < this.field671; var4++) {
                var2[(this.field674 + var3) * this.field675 + this.field673 + var4] = this.field670[this.field671 * var3 + var4];
            }
        }
        this.field670 = var2;
        this.field671 = this.field675;
        if (arg0 < 0) {
            this.field672 = this.field676;
            this.field673 = 0;
            this.field674 = 0;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method196(int arg0, int arg1, int arg2) {
        if (arg1 != 49740) {
            this.field669 = -155;
        }
        int var4 = this.field673 + arg0;
        int var5 = this.field674 + arg2;
        int var6 = Pix2D.field631 * var5 + var4;
        int var7 = 0;
        int var8 = this.field672;
        int var9 = this.field671;
        int var10 = Pix2D.field631 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field633) {
            int var12 = Pix2D.field633 - var5;
            var8 -= var12;
            var5 = Pix2D.field633;
            var7 += var9 * var12;
            var6 += Pix2D.field631 * var12;
        }
        if (var5 + var8 > Pix2D.field634) {
            var8 -= var5 + var8 - Pix2D.field634;
        }
        if (var4 < Pix2D.field635) {
            int var13 = Pix2D.field635 - var4;
            var9 -= var13;
            var4 = Pix2D.field635;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field636) {
            int var14 = var4 + var9 - Pix2D.field636;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method197(var10, var9, var7, Pix2D.field630, var11, this.field670, var6, true, var8);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III[II[IIZI)V")
    private void method197(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8) {
        if (!arg7) {
            this.field668 = 457;
        }
        int var10 = -(arg1 >> 2);
        int var11 = -(arg1 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg3[arg6++] = arg5[arg2++];
                arg3[arg6++] = arg5[arg2++];
                arg3[arg6++] = arg5[arg2++];
                arg3[arg6++] = arg5[arg2++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg3[arg6++] = arg5[arg2++];
            }
            arg6 += arg0;
            arg2 += arg4;
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(III)V")
    public void method198(int arg0, int arg1, int arg2) {
        int var4 = this.field673 + arg0;
        int var5 = this.field674 + arg2;
        if (arg1 <= 0) {
            return;
        }
        int var6 = Pix2D.field631 * var5 + var4;
        int var7 = 0;
        int var8 = this.field672;
        int var9 = this.field671;
        int var10 = Pix2D.field631 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field633) {
            int var12 = Pix2D.field633 - var5;
            var8 -= var12;
            var5 = Pix2D.field633;
            var7 += var9 * var12;
            var6 += Pix2D.field631 * var12;
        }
        if (var5 + var8 > Pix2D.field634) {
            var8 -= var5 + var8 - Pix2D.field634;
        }
        if (var4 < Pix2D.field635) {
            int var13 = Pix2D.field635 - var4;
            var9 -= var13;
            var4 = Pix2D.field635;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field636) {
            int var14 = var4 + var9 - Pix2D.field636;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method199(Pix2D.field630, this.field670, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method199(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method200(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field673 + arg3;
        int var6 = this.field674 + arg2;
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = Pix2D.field631 * var6 + var5;
        int var9 = 0;
        int var10 = this.field672;
        int var11 = this.field671;
        int var12 = Pix2D.field631 - var11;
        int var13 = 0;
        if (var6 < Pix2D.field633) {
            int var14 = Pix2D.field633 - var6;
            var10 -= var14;
            var6 = Pix2D.field633;
            var9 += var11 * var14;
            var8 += Pix2D.field631 * var14;
        }
        if (var6 + var10 > Pix2D.field634) {
            var10 -= var6 + var10 - Pix2D.field634;
        }
        if (var5 < Pix2D.field635) {
            int var15 = Pix2D.field635 - var5;
            var11 -= var15;
            var5 = Pix2D.field635;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field636) {
            int var16 = var5 + var11 - Pix2D.field636;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method201(var8, var13, var12, var10, (byte) 6, this.field670, 0, var9, arg1, Pix2D.field630, var11);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIB[IIII[II)V")
    private void method201(int arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = 256 - arg8;
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var15 = -arg10; var15 < 0; var15++) {
                int var16 = arg5[arg7++];
                if (var16 == 0) {
                    arg0++;
                } else {
                    int var17 = arg9[arg0];
                    arg9[arg0++] = ((var16 & 0xFF00FF) * arg8 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg8 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg0 += arg2;
            arg7 += arg1;
        }
        if (arg4 == 6) {
            boolean var14 = false;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([IZ[IIIIIIIII)V")
    public void method202(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (!arg1) {
            return;
        }
        try {
            int var12 = -arg8 / 2;
            int var13 = -arg6 / 2;
            int var14 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var16 = arg3 * var14 >> 8;
            int var17 = arg3 * var15 >> 8;
            int var18 = (arg5 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg7 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field631 * arg4 + arg10;
            for (int var21 = 0; var21 < arg6; var21++) {
                int var22 = arg0[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg2[var21]; var26 < 0; var26++) {
                    Pix2D.field630[var23++] = this.field670[(var24 >> 16) + (var25 >> 16) * this.field671];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field631;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIIIZDI)V")
    public void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, double arg7, int arg8) {
        if (!arg6) {
            this.field667 = !this.field667;
        }
        try {
            int var11 = -arg8 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg7) * 65536.0D);
            int var14 = (int) (Math.cos(arg7) * 65536.0D);
            int var15 = arg1 * var13 >> 8;
            int var16 = arg1 * var14 >> 8;
            int var17 = (arg0 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg2 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Pix2D.field631 * arg5 + arg3;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg8; var24 < 0; var24++) {
                    int var25 = this.field670[(var22 >> 16) + (var23 >> 16) * this.field671];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Pix2D.field630[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Pix2D.field631;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ILkb;IB)V")
    public void method204(int arg0, Pix8 arg1, int arg2, byte arg3) {
        int var5 = this.field673 + arg0;
        int var6 = this.field674 + arg2;
        int var7 = Pix2D.field631 * var6 + var5;
        int var8 = 0;
        int var9 = this.field672;
        int var10 = this.field671;
        int var11 = Pix2D.field631 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field633) {
            int var13 = Pix2D.field633 - var6;
            var9 -= var13;
            var6 = Pix2D.field633;
            var8 += var10 * var13;
            var7 += Pix2D.field631 * var13;
        }
        if (var6 + var9 > Pix2D.field634) {
            var9 -= var6 + var9 - Pix2D.field634;
        }
        if (var5 < Pix2D.field635) {
            int var14 = Pix2D.field635 - var5;
            var10 -= var14;
            var5 = Pix2D.field635;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field636) {
            int var15 = var5 + var10 - Pix2D.field636;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method205(var8, var9, arg1.field682, var10, Pix2D.field630, 0, this.field670, var12, var11, var7, (byte) -75);
            if (arg3 != 2) {
                this.field669 = 429;
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II[BI[II[IIIIB)V")
    private void method205(int arg0, int arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, byte arg10) {
        int var12 = -(arg3 >> 2);
        int var13 = -(arg3 & 0x3);
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg6[arg0++];
                if (var18 != 0 && arg2[arg9] == 0) {
                    arg4[arg9++] = var18;
                } else {
                    arg9++;
                }
                int var19 = arg6[arg0++];
                if (var19 != 0 && arg2[arg9] == 0) {
                    arg4[arg9++] = var19;
                } else {
                    arg9++;
                }
                int var20 = arg6[arg0++];
                if (var20 != 0 && arg2[arg9] == 0) {
                    arg4[arg9++] = var20;
                } else {
                    arg9++;
                }
                int var21 = arg6[arg0++];
                if (var21 != 0 && arg2[arg9] == 0) {
                    arg4[arg9++] = var21;
                } else {
                    arg9++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg6[arg0++];
                if (var17 != 0 && arg2[arg9] == 0) {
                    arg4[arg9++] = var17;
                } else {
                    arg9++;
                }
            }
            arg9 += arg8;
            arg0 += arg7;
        }
        if (arg10 != -75) {
            this.field669 = -276;
        }
    }
}
