import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "jb", name = "w", descriptor = "Z")
    private boolean field680 = false;

    @OriginalMember(owner = "jb", name = "x", descriptor = "Z")
    private boolean field681 = false;

    @OriginalMember(owner = "jb", name = "y", descriptor = "Z")
    private boolean field682 = true;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field683 = -43533;

    @OriginalMember(owner = "jb", name = "A", descriptor = "I")
    private int field684 = 7;

    @OriginalMember(owner = "jb", name = "B", descriptor = "B")
    private byte field685 = 90;

    @OriginalMember(owner = "jb", name = "C", descriptor = "I")
    private int field686 = 2;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    private int field687 = -302;

    @OriginalMember(owner = "jb", name = "E", descriptor = "[I")
    public int[] field688;

    @OriginalMember(owner = "jb", name = "J", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "jb", name = "K", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field688 = new int[arg0 * arg1];
        this.field689 = this.field693 = arg0;
        this.field690 = this.field694 = arg1;
        this.field691 = this.field692 = 0;
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field689 = var3.getWidth(arg1);
            this.field690 = var3.getHeight(arg1);
            this.field693 = this.field689;
            this.field694 = this.field690;
            this.field691 = 0;
            this.field692 = 0;
            this.field688 = new int[this.field690 * this.field689];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field689, this.field690, this.field688, 0, this.field689);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(45427, arg0.method309(arg1 + ".dat", null));
        Packet var5 = new Packet(45427, arg0.method309("index.dat", null));
        var5.field736 = var4.method241();
        this.field693 = var5.method241();
        this.field694 = var5.method241();
        int var6 = var5.method239();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method243();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field736 += 2;
            var4.field736 += var5.method241() * var5.method241();
            var5.field736++;
        }
        this.field691 = var5.method239();
        this.field692 = var5.method239();
        this.field689 = var5.method241();
        this.field690 = var5.method241();
        int var10 = var5.method239();
        int var11 = this.field690 * this.field689;
        this.field688 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field688[var12] = var7[var4.method239()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field689; var13++) {
                for (int var14 = 0; var14 < this.field690; var14++) {
                    this.field688[this.field689 * var14 + var13] = var7[var4.method239()];
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method194(int arg0) {
        Pix2D.method165(this.field688, 741, this.field689, this.field690);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIII)V")
    public void method195(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field688.length; var5++) {
            int var7 = this.field688[var5];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg3 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg0 + var10;
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
                this.field688[var5] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)V")
    public void method196(byte arg0) {
        int[] var2 = new int[this.field694 * this.field693];
        if (arg0 != 8) {
            return;
        }
        for (int var3 = 0; var3 < this.field690; var3++) {
            for (int var4 = 0; var4 < this.field689; var4++) {
                var2[(this.field692 + var3) * this.field693 + this.field691 + var4] = this.field688[this.field689 * var3 + var4];
            }
        }
        this.field688 = var2;
        this.field689 = this.field693;
        this.field690 = this.field694;
        this.field691 = 0;
        this.field692 = 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public void method197(int arg0, int arg1, int arg2) {
        int var4 = this.field691 + arg2;
        int var5 = this.field692 + arg1;
        int var6 = Pix2D.field645 * var5 + var4;
        int var7 = 0;
        if (arg0 <= 0) {
            this.field680 = !this.field680;
        }
        int var8 = this.field690;
        int var9 = this.field689;
        int var10 = Pix2D.field645 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field647) {
            int var12 = Pix2D.field647 - var5;
            var8 -= var12;
            var5 = Pix2D.field647;
            var7 += var9 * var12;
            var6 += Pix2D.field645 * var12;
        }
        if (var5 + var8 > Pix2D.field648) {
            var8 -= var5 + var8 - Pix2D.field648;
        }
        if (var4 < Pix2D.field649) {
            int var13 = Pix2D.field649 - var4;
            var9 -= var13;
            var4 = Pix2D.field649;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field650) {
            int var14 = var4 + var9 - Pix2D.field650;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method198(this.field688, var6, Pix2D.field644, var11, var8, var9, var7, true, var10);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([II[IIIIIZI)V")
    private void method198(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg4; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg2[arg1++] = arg0[arg6++];
                arg2[arg1++] = arg0[arg6++];
                arg2[arg1++] = arg0[arg6++];
                arg2[arg1++] = arg0[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg2[arg1++] = arg0[arg6++];
            }
            arg1 += arg8;
            arg6 += arg3;
        }
        if (arg7) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(III)V")
    public void method199(int arg0, int arg1, int arg2) {
        int var4 = this.field691 + arg2;
        int var5 = this.field692 + arg0;
        int var6 = Pix2D.field645 * var5 + var4;
        int var7 = 0;
        int var8 = this.field690;
        int var9 = this.field689;
        int var10 = Pix2D.field645 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field647) {
            int var12 = Pix2D.field647 - var5;
            var8 -= var12;
            var5 = Pix2D.field647;
            var7 += var9 * var12;
            var6 += Pix2D.field645 * var12;
        }
        if (var5 + var8 > Pix2D.field648) {
            var8 -= var5 + var8 - Pix2D.field648;
        }
        if (var4 < Pix2D.field649) {
            int var13 = Pix2D.field649 - var4;
            var9 -= var13;
            var4 = Pix2D.field649;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field650) {
            int var14 = var4 + var9 - Pix2D.field650;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        this.method200(Pix2D.field644, this.field688, 0, var7, var6, var9, var8, var10, var11);
        if (this.field683 != arg1) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
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
        int var5 = this.field691 + arg0;
        int var6 = this.field692 + arg1;
        int var7 = Pix2D.field645 * var6 + var5;
        int var8 = 0;
        if (arg3 != 2) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = this.field690;
        int var11 = this.field689;
        int var12 = Pix2D.field645 - var11;
        int var13 = 0;
        if (var6 < Pix2D.field647) {
            int var14 = Pix2D.field647 - var6;
            var10 -= var14;
            var6 = Pix2D.field647;
            var8 += var11 * var14;
            var7 += Pix2D.field645 * var14;
        }
        if (var6 + var10 > Pix2D.field648) {
            var10 -= var6 + var10 - Pix2D.field648;
        }
        if (var5 < Pix2D.field649) {
            int var15 = Pix2D.field649 - var5;
            var11 -= var15;
            var5 = Pix2D.field649;
            var8 += var15;
            var7 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > Pix2D.field650) {
            int var16 = var5 + var11 - Pix2D.field650;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method202(var7, (byte) -100, Pix2D.field644, var11, 0, var10, var8, this.field688, var13, var12, arg2);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IB[IIIII[IIII)V")
    private void method202(int arg0, byte arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg1 != -100) {
            this.field682 = !this.field682;
        }
        int var12 = 256 - arg10;
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = arg7[arg6++];
                if (var15 == 0) {
                    arg0++;
                } else {
                    int var16 = arg2[arg0];
                    arg2[arg0++] = ((var15 & 0xFF00FF) * arg10 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg10 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg0 += arg9;
            arg6 += arg8;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II[IZIIIIII[I)V")
    public void method203(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        if (!arg3) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg5 / 2;
            int var14 = -arg4 / 2;
            int var15 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
            int var17 = arg9 * var15 >> 8;
            int var18 = arg9 * var16 >> 8;
            int var19 = (arg1 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg6 << 16) + (var14 * var18 - var13 * var17);
            int var21 = Pix2D.field645 * arg0 + arg8;
            for (int var22 = 0; var22 < arg4; var22++) {
                int var23 = arg2[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg10[var22]; var27 < 0; var27++) {
                    Pix2D.field644[var24++] = this.field688[(var25 >> 16) + (var26 >> 16) * this.field689];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += Pix2D.field645;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIIDBII)V")
    public void method204(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, byte arg6, int arg7, int arg8) {
        if (arg6 != -83) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg3 / 2;
            int var13 = -arg4 / 2;
            int var14 = (int) (Math.sin(arg5) * 65536.0D);
            int var15 = (int) (Math.cos(arg5) * 65536.0D);
            int var16 = arg8 * var14 >> 8;
            int var17 = arg8 * var15 >> 8;
            int var18 = (arg1 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg7 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field645 * arg0 + arg2;
            for (int var21 = 0; var21 < arg4; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg3; var25 < 0; var25++) {
                    int var26 = this.field688[(var23 >> 16) + (var24 >> 16) * this.field689];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        Pix2D.field644[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field645;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILkb;)V")
    public void method205(int arg0, int arg1, int arg2, Pix8 arg3) {
        int var5 = this.field691 + arg0;
        int var6 = this.field692 + arg1;
        int var7 = Pix2D.field645 * var6 + var5;
        int var8 = 0;
        int var9 = this.field690;
        int var10 = this.field689;
        int var11 = Pix2D.field645 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field647) {
            int var13 = Pix2D.field647 - var6;
            var9 -= var13;
            var6 = Pix2D.field647;
            var8 += var10 * var13;
            var7 += Pix2D.field645 * var13;
        }
        if (var6 + var9 > Pix2D.field648) {
            var9 -= var6 + var9 - Pix2D.field648;
        }
        if (var5 < Pix2D.field649) {
            int var14 = Pix2D.field649 - var5;
            var10 -= var14;
            var5 = Pix2D.field649;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field650) {
            int var15 = var5 + var10 - Pix2D.field650;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method206(var12, var10, var9, arg3.field700, var7, this.field688, 0, var11, var8, this.field686, Pix2D.field644);
            if (arg2 != 0) {
                this.field687 = 28;
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III[BI[IIIII[I)V")
    private void method206(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = -(arg1 >> 2);
        int var13 = -(arg1 & 0x3);
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg5[arg8++];
                if (var18 != 0 && arg3[arg4] == 0) {
                    arg10[arg4++] = var18;
                } else {
                    arg4++;
                }
                int var19 = arg5[arg8++];
                if (var19 != 0 && arg3[arg4] == 0) {
                    arg10[arg4++] = var19;
                } else {
                    arg4++;
                }
                int var20 = arg5[arg8++];
                if (var20 != 0 && arg3[arg4] == 0) {
                    arg10[arg4++] = var20;
                } else {
                    arg4++;
                }
                int var21 = arg5[arg8++];
                if (var21 != 0 && arg3[arg4] == 0) {
                    arg10[arg4++] = var21;
                } else {
                    arg4++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg5[arg8++];
                if (var17 != 0 && arg3[arg4] == 0) {
                    arg10[arg4++] = var17;
                } else {
                    arg4++;
                }
            }
            arg4 += arg7;
            arg8 += arg0;
        }
        if (arg9 != 2) {
            this.field681 = !this.field681;
        }
    }
}
