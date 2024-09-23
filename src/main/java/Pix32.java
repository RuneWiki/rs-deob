import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "jb", name = "x", descriptor = "I")
    private int field646 = -25580;

    @OriginalMember(owner = "jb", name = "y", descriptor = "Z")
    private boolean field647 = false;

    @OriginalMember(owner = "jb", name = "z", descriptor = "Z")
    private boolean field648 = true;

    @OriginalMember(owner = "jb", name = "A", descriptor = "Z")
    private boolean field649 = false;

    @OriginalMember(owner = "jb", name = "B", descriptor = "I")
    private int field650 = 668;

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field651;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field651 = new int[arg0 * arg1];
        this.field652 = this.field656 = arg0;
        this.field653 = this.field657 = arg1;
        this.field654 = this.field655 = 0;
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field652 = var3.getWidth(arg1);
            this.field653 = var3.getHeight(arg1);
            this.field656 = this.field652;
            this.field657 = this.field653;
            this.field654 = 0;
            this.field655 = 0;
            this.field651 = new int[this.field653 * this.field652];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field652, this.field653, this.field651, 0, this.field652);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(699, arg0.method295(arg1 + ".dat", null));
        Packet var5 = new Packet(699, arg0.method295("index.dat", null));
        var5.field694 = var4.method233();
        this.field656 = var5.method233();
        this.field657 = var5.method233();
        int var6 = var5.method231();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method235();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field694 += 2;
            var4.field694 += var5.method233() * var5.method233();
            var5.field694++;
        }
        this.field654 = var5.method231();
        this.field655 = var5.method231();
        this.field652 = var5.method233();
        this.field653 = var5.method233();
        int var10 = var5.method231();
        int var11 = this.field653 * this.field652;
        this.field651 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field651[var12] = var7[var4.method231()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field652; var13++) {
                    for (int var14 = 0; var14 < this.field653; var14++) {
                        this.field651[this.field652 * var14 + var13] = var7[var4.method231()];
                    }
                }
            }
            if (Linkable.field365) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method186(byte arg0) {
        Pix2D.method161(this.field653, (byte) 102, this.field652, this.field651);
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            this.field650 = 321;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method187(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field651.length; var5++) {
            int var6 = this.field651[var5];
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
                int var12 = arg2 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field651[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg3 != 0) {
            this.field649 = !this.field649;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method188(int arg0, int arg1, int arg2) {
        int var4 = this.field654 + arg0;
        int var5 = this.field655 + arg1;
        int var6 = Pix2D.field609 * var5 + var4;
        int var7 = 0;
        int var8 = this.field653;
        int var9 = this.field652;
        int var10 = Pix2D.field609 - var9;
        int var11 = 0;
        if (arg2 != -7650) {
            return;
        }
        if (var5 < Pix2D.field611) {
            int var12 = Pix2D.field611 - var5;
            var8 -= var12;
            var5 = Pix2D.field611;
            var7 += var9 * var12;
            var6 += Pix2D.field609 * var12;
        }
        if (var5 + var8 > Pix2D.field612) {
            var8 -= var5 + var8 - Pix2D.field612;
        }
        if (var4 < Pix2D.field613) {
            int var13 = Pix2D.field613 - var4;
            var9 -= var13;
            var4 = Pix2D.field613;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field614) {
            int var14 = var4 + var9 - Pix2D.field614;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method189(var8, var7, var6, 0, var9, var10, var11, this.field651, Pix2D.field608);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIIII[I[I)V")
    private void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8) {
        int var10 = -(arg4 >> 2);
        int var11 = -(arg4 & 0x3);
        if (arg3 != 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg8[arg2++] = arg7[arg1++];
                arg8[arg2++] = arg7[arg1++];
                arg8[arg2++] = arg7[arg1++];
                arg8[arg2++] = arg7[arg1++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg8[arg2++] = arg7[arg1++];
            }
            arg2 += arg5;
            arg1 += arg6;
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(III)V")
    public void method190(int arg0, int arg1, int arg2) {
        int var4 = this.field654 + arg0;
        if (arg2 <= 0) {
            return;
        }
        int var5 = this.field655 + arg1;
        int var6 = Pix2D.field609 * var5 + var4;
        int var7 = 0;
        int var8 = this.field653;
        int var9 = this.field652;
        int var10 = Pix2D.field609 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field611) {
            int var12 = Pix2D.field611 - var5;
            var8 -= var12;
            var5 = Pix2D.field611;
            var7 += var9 * var12;
            var6 += Pix2D.field609 * var12;
        }
        if (var5 + var8 > Pix2D.field612) {
            var8 -= var5 + var8 - Pix2D.field612;
        }
        if (var4 < Pix2D.field613) {
            int var13 = Pix2D.field613 - var4;
            var9 -= var13;
            var4 = Pix2D.field613;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field614) {
            int var14 = var4 + var9 - Pix2D.field614;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method191(Pix2D.field608, this.field651, 0, var7, var6, var9, var8, var10, var11);
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

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIII)V")
    public void method192(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0) {
            return;
        }
        try {
            int var6 = this.field652;
            int var7 = this.field653;
            int var8 = 0;
            int var9 = 0;
            int var10 = (var6 << 16) / arg3;
            int var11 = (var7 << 16) / arg0;
            int var12 = this.field656;
            int var13 = this.field657;
            int var14 = (var12 << 16) / arg3;
            int var15 = (var13 << 16) / arg0;
            int var16 = (this.field654 * arg3 + var12 - 1) / var12 + arg4;
            int var17 = (this.field655 * arg0 + var13 - 1) / var13 + arg1;
            if (this.field654 * arg3 % var12 != 0) {
                var8 = (var12 - this.field654 * arg3 % var12 << 16) / arg3;
            }
            if (this.field655 * arg0 % var13 != 0) {
                var9 = (var13 - this.field655 * arg0 % var13 << 16) / arg0;
            }
            int var18 = (this.field652 - (var8 >> 16)) * arg3 / var12;
            int var19 = (this.field653 - (var9 >> 16)) * arg0 / var13;
            int var20 = Pix2D.field609 * var17 + var16;
            int var21 = Pix2D.field609 - var18;
            if (var17 < Pix2D.field611) {
                int var22 = Pix2D.field611 - var17;
                var19 -= var22;
                var17 = 0;
                var20 += Pix2D.field609 * var22;
                var9 += var15 * var22;
            }
            if (var17 + var19 > Pix2D.field612) {
                var19 -= var17 + var19 - Pix2D.field612;
            }
            if (var16 < Pix2D.field613) {
                int var23 = Pix2D.field613 - var16;
                var18 -= var23;
                var16 = 0;
                var20 += var23;
                var8 += var14 * var23;
                var21 += var23;
            }
            if (var16 + var18 > Pix2D.field614) {
                int var24 = var16 + var18 - Pix2D.field614;
                var18 -= var24;
                var21 += var24;
            }
            this.method193(Pix2D.field608, var21, var9, var18, 0, var20, var8, this.field651, var6, var19, var15, true, var14);
        } catch (Exception var25) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([IIIIIII[IIIIZI)V")
    private void method193(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        if (!arg11) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        try {
            int var15 = arg6;
            for (int var16 = -arg9; var16 < 0; var16++) {
                int var17 = (arg2 >> 16) * arg8;
                for (int var18 = -arg3; var18 < 0; var18++) {
                    int var19 = arg7[(arg6 >> 16) + var17];
                    if (var19 == 0) {
                        arg5++;
                    } else {
                        arg0[arg5++] = var19;
                    }
                    arg6 += arg12;
                }
                arg2 += arg10;
                arg6 = var15;
                arg5 += arg1;
            }
        } catch (Exception var20) {
            System.out.println("error in plot_scale");
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(IIII)V")
    public void method194(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field654 + arg1;
        int var7 = this.field655 + arg2;
        int var8 = Pix2D.field609 * var7 + var6;
        int var9 = 0;
        int var10 = this.field653;
        int var11 = this.field652;
        int var12 = Pix2D.field609 - var11;
        int var13 = 0;
        if (var7 < Pix2D.field611) {
            int var14 = Pix2D.field611 - var7;
            var10 -= var14;
            var7 = Pix2D.field611;
            var9 += var11 * var14;
            var8 += Pix2D.field609 * var14;
        }
        if (var7 + var10 > Pix2D.field612) {
            var10 -= var7 + var10 - Pix2D.field612;
        }
        if (var6 < Pix2D.field613) {
            int var15 = Pix2D.field613 - var6;
            var11 -= var15;
            var6 = Pix2D.field613;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > Pix2D.field614) {
            int var16 = var6 + var11 - Pix2D.field614;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method195((byte) 34, var12, var10, var9, var11, 0, var13, Pix2D.field608, this.field651, var8, arg0);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(BIIIIII[I[III)V")
    private void method195(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg10;
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                int var15 = arg8[arg3++];
                if (var15 == 0) {
                    arg9++;
                } else {
                    int var16 = arg7[arg9];
                    arg7[arg9++] = ((var15 & 0xFF00FF) * arg10 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg10 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg9 += arg1;
            arg3 += arg6;
        }
        if (arg0 == 34) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I[IIIII[IIIII)V")
    public void method196(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg8 / 2;
            int var14 = -arg5 / 2;
            int var15 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
            int var17 = arg0 * var15 >> 8;
            int var18 = arg0 * var16 >> 8;
            int var19 = (arg2 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg3 << 16) + (var14 * var18 - var13 * var17);
            int var21 = Pix2D.field609 * arg10 + arg4;
            for (int var22 = 0; var22 < arg5; var22++) {
                int var23 = arg6[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg1[var22]; var27 < 0; var27++) {
                    Pix2D.field608[var24++] = this.field651[(var25 >> 16) + (var26 >> 16) * this.field652];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += Pix2D.field609;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Lkb;ZII)V")
    public void method197(Pix8 arg0, boolean arg1, int arg2, int arg3) {
        int var5 = this.field654 + arg2;
        if (!arg1) {
            this.field646 = -218;
        }
        int var6 = this.field655 + arg3;
        int var7 = Pix2D.field609 * var6 + var5;
        int var8 = 0;
        int var9 = this.field653;
        int var10 = this.field652;
        int var11 = Pix2D.field609 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field611) {
            int var13 = Pix2D.field611 - var6;
            var9 -= var13;
            var6 = Pix2D.field611;
            var8 += var10 * var13;
            var7 += Pix2D.field609 * var13;
        }
        if (var6 + var9 > Pix2D.field612) {
            var9 -= var6 + var9 - Pix2D.field612;
        }
        if (var5 < Pix2D.field613) {
            int var14 = Pix2D.field613 - var5;
            var10 -= var14;
            var5 = Pix2D.field613;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field614) {
            int var15 = var5 + var10 - Pix2D.field614;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method198(var8, var7, var10, (byte) 69, Pix2D.field608, var9, 0, var11, this.field651, arg0.field660, var12);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIB[IIII[I[BI)V")
    private void method198(int arg0, int arg1, int arg2, byte arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9, int arg10) {
        int var12 = -(arg2 >> 2);
        int var13 = -(arg2 & 0x3);
        if (arg3 != 69) {
            this.field650 = 249;
        }
        for (int var14 = -arg5; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg8[arg0++];
                if (var18 != 0 && arg9[arg1] == 0) {
                    arg4[arg1++] = var18;
                } else {
                    arg1++;
                }
                int var19 = arg8[arg0++];
                if (var19 != 0 && arg9[arg1] == 0) {
                    arg4[arg1++] = var19;
                } else {
                    arg1++;
                }
                int var20 = arg8[arg0++];
                if (var20 != 0 && arg9[arg1] == 0) {
                    arg4[arg1++] = var20;
                } else {
                    arg1++;
                }
                int var21 = arg8[arg0++];
                if (var21 != 0 && arg9[arg1] == 0) {
                    arg4[arg1++] = var21;
                } else {
                    arg1++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg8[arg0++];
                if (var17 != 0 && arg9[arg1] == 0) {
                    arg4[arg1++] = var17;
                } else {
                    arg1++;
                }
            }
            arg1 += arg7;
            arg0 += arg10;
        }
    }
}
