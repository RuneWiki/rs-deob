import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EPQDEJTO")
public class Pix24 extends Draw2D {

    @OriginalMember(owner = "client!EPQDEJTO", name = "w", descriptor = "I")
    private int field673 = -235;

    @OriginalMember(owner = "client!EPQDEJTO", name = "x", descriptor = "Z")
    private boolean field674 = true;

    @OriginalMember(owner = "client!EPQDEJTO", name = "y", descriptor = "B")
    private byte field675 = 5;

    @OriginalMember(owner = "client!EPQDEJTO", name = "z", descriptor = "I")
    private int field676 = -3539;

    @OriginalMember(owner = "client!EPQDEJTO", name = "A", descriptor = "I")
    private int field677 = -766;

    @OriginalMember(owner = "client!EPQDEJTO", name = "B", descriptor = "I")
    private int field678 = -766;

    @OriginalMember(owner = "client!EPQDEJTO", name = "C", descriptor = "I")
    private int field679 = 1;

    @OriginalMember(owner = "client!EPQDEJTO", name = "D", descriptor = "Z")
    private boolean field680 = true;

    @OriginalMember(owner = "client!EPQDEJTO", name = "E", descriptor = "Z")
    private boolean field681 = false;

    @OriginalMember(owner = "client!EPQDEJTO", name = "F", descriptor = "Z")
    private boolean field682 = false;

    @OriginalMember(owner = "client!EPQDEJTO", name = "G", descriptor = "Z")
    private boolean field683 = true;

    @OriginalMember(owner = "client!EPQDEJTO", name = "H", descriptor = "I")
    private int field684 = 3600;

    @OriginalMember(owner = "client!EPQDEJTO", name = "I", descriptor = "[I")
    public int[] field685;

    @OriginalMember(owner = "client!EPQDEJTO", name = "N", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!EPQDEJTO", name = "J", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!EPQDEJTO", name = "O", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!EPQDEJTO", name = "K", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!EPQDEJTO", name = "M", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!EPQDEJTO", name = "L", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!EPQDEJTO", name = "<init>", descriptor = "(II)V")
    public Pix24(int arg0, int arg1) {
        this.field685 = new int[arg0 * arg1];
        this.field686 = this.field690 = arg0;
        this.field687 = this.field691 = arg1;
        this.field688 = this.field689 = 0;
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix24(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field686 = var3.getWidth(arg1);
            this.field687 = var3.getHeight(arg1);
            this.field690 = this.field686;
            this.field691 = this.field687;
            this.field688 = 0;
            this.field689 = 0;
            this.field685 = new int[this.field687 * this.field686];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field686, this.field687, this.field685, 0, this.field686);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "<init>", descriptor = "(LATJMVOZR;Ljava/lang/String;I)V")
    public Pix24(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(true, arg0.method2(arg1 + ".dat", null));
        Packet var5 = new Packet(true, arg0.method2("index.dat", null));
        var5.pos = var4.g2();
        this.field690 = var5.g2();
        this.field691 = var5.g2();
        int var6 = var5.g1();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.g3();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.pos += 2;
            var4.pos += var5.g2() * var5.g2();
            var5.pos++;
        }
        this.field688 = var5.g1();
        this.field689 = var5.g1();
        this.field686 = var5.g2();
        this.field687 = var5.g2();
        int var10 = var5.g1();
        int var11 = this.field687 * this.field686;
        this.field685 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field685[var12] = var7[var4.g1()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field686; var13++) {
                for (int var14 = 0; var14 < this.field687; var14++) {
                    this.field685[this.field686 * var14 + var13] = var7[var4.g1()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(Z)V")
    public void method190(boolean arg0) {
        if (!arg0) {
            Draw2D.method332(this.field683, this.field686, this.field687, this.field685);
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(IIII)V")
    public void method191(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field685.length; var5++) {
            int var6 = this.field685[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg2 + var7;
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
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field685[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (this.field673 != arg3) {
            this.field683 = !this.field683;
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "b", descriptor = "(I)V")
    public void method192(int arg0) {
        int[] var2 = new int[this.field691 * this.field690];
        for (int var3 = 0; var3 < this.field687; var3++) {
            for (int var4 = 0; var4 < this.field686; var4++) {
                var2[(this.field689 + var3) * this.field690 + this.field688 + var4] = this.field685[this.field686 * var3 + var4];
            }
        }
        this.field685 = var2;
        this.field686 = this.field690;
        this.field687 = this.field691;
        this.field688 = 0;
        this.field689 = 0;
        if (arg0 == 1790) {
            ;
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(III)V")
    public void method193(int arg0, int arg1, int arg2) {
        int var4 = this.field688 + arg2;
        int var5 = this.field689 + arg0;
        int var6 = Draw2D.field1095 * var5 + var4;
        int var7 = 0;
        int var8 = this.field687;
        int var9 = this.field686;
        int var10 = Draw2D.field1095 - var9;
        int var11 = 0;
        if (var5 < Draw2D.field1097) {
            int var12 = Draw2D.field1097 - var5;
            var8 -= var12;
            var5 = Draw2D.field1097;
            var7 += var9 * var12;
            var6 += Draw2D.field1095 * var12;
        }
        if (var5 + var8 > Draw2D.field1098) {
            var8 -= var5 + var8 - Draw2D.field1098;
        }
        if (var4 < Draw2D.field1099) {
            int var13 = Draw2D.field1099 - var4;
            var9 -= var13;
            var4 = Draw2D.field1099;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Draw2D.field1100) {
            int var14 = var4 + var9 - Draw2D.field1100;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method194(var9, var10, var8, this.field685, var7, var11, var6, (byte) -39, Draw2D.field1094);
            if (arg1 >= 0) {
                this.field683 = !this.field683;
            }
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(III[IIIIB[I)V")
    private void method194(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, byte arg7, int[] arg8) {
        int var10 = -(arg0 >> 2);
        if (arg7 != -39) {
            this.field684 = 201;
        }
        int var11 = -(arg0 & 0x3);
        for (int var12 = -arg2; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg8[arg6++] = arg3[arg4++];
                arg8[arg6++] = arg3[arg4++];
                arg8[arg6++] = arg3[arg4++];
                arg8[arg6++] = arg3[arg4++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg8[arg6++] = arg3[arg4++];
            }
            arg6 += arg1;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "b", descriptor = "(III)V")
    public void method195(int arg0, int arg1, int arg2) {
        int var4 = this.field688 + arg1;
        if (arg2 >= 0) {
            return;
        }
        int var5 = this.field689 + arg0;
        int var6 = Draw2D.field1095 * var5 + var4;
        int var7 = 0;
        int var8 = this.field687;
        int var9 = this.field686;
        int var10 = Draw2D.field1095 - var9;
        int var11 = 0;
        if (var5 < Draw2D.field1097) {
            int var12 = Draw2D.field1097 - var5;
            var8 -= var12;
            var5 = Draw2D.field1097;
            var7 += var9 * var12;
            var6 += Draw2D.field1095 * var12;
        }
        if (var5 + var8 > Draw2D.field1098) {
            var8 -= var5 + var8 - Draw2D.field1098;
        }
        if (var4 < Draw2D.field1099) {
            int var13 = Draw2D.field1099 - var4;
            var9 -= var13;
            var4 = Draw2D.field1099;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Draw2D.field1100) {
            int var14 = var4 + var9 - Draw2D.field1100;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method196(Draw2D.field1094, this.field685, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method196(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!EPQDEJTO", name = "b", descriptor = "(IIII)V")
    public void method197(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field688 + arg1;
        int var6 = this.field689 + arg2;
        int var7 = Draw2D.field1095 * var6 + var5;
        int var8 = 0;
        if (arg0 != 0) {
            return;
        }
        int var9 = this.field687;
        int var10 = this.field686;
        int var11 = Draw2D.field1095 - var10;
        int var12 = 0;
        if (var6 < Draw2D.field1097) {
            int var13 = Draw2D.field1097 - var6;
            var9 -= var13;
            var6 = Draw2D.field1097;
            var8 += var10 * var13;
            var7 += Draw2D.field1095 * var13;
        }
        if (var6 + var9 > Draw2D.field1098) {
            var9 -= var6 + var9 - Draw2D.field1098;
        }
        if (var5 < Draw2D.field1099) {
            int var14 = Draw2D.field1099 - var5;
            var10 -= var14;
            var5 = Draw2D.field1099;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Draw2D.field1100) {
            int var15 = var5 + var10 - Draw2D.field1100;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method198(var10, var12, 0, var11, var8, this.field677, arg3, var7, var9, Draw2D.field1094, this.field685);
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(IIIIIIIII[I[I)V")
    private void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int[] arg10) {
        int var12 = 256 - arg6;
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                int var15 = arg10[arg4++];
                if (var15 == 0) {
                    arg7++;
                } else {
                    int var16 = arg9[arg7];
                    arg9[arg7++] = ((var15 & 0xFF00FF) * arg6 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg6 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg7 += arg3;
            arg4 += arg1;
        }
        if (arg5 >= 0) {
            this.field674 = !this.field674;
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(IIIII[IIII[II)V")
    public void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = 36 / arg1;
        try {
            int var13 = -arg4 / 2;
            int var14 = -arg2 / 2;
            int var15 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
            int var17 = arg8 * var15 >> 8;
            int var18 = arg8 * var16 >> 8;
            int var19 = (arg3 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg10 << 16) + (var14 * var18 - var13 * var17);
            int var21 = Draw2D.field1095 * arg0 + arg6;
            for (int var22 = 0; var22 < arg2; var22++) {
                int var23 = arg9[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg5[var22]; var27 < 0; var27++) {
                    Draw2D.field1094[var24++] = this.field685[(var25 >> 16) + (var26 >> 16) * this.field686];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += Draw2D.field1095;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(IIIIIIIDI)V")
    public void method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7, int arg8) {
        if (arg5 != -30658) {
            return;
        }
        try {
            int var11 = -arg6 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg7) * 65536.0D);
            int var14 = (int) (Math.cos(arg7) * 65536.0D);
            int var15 = arg0 * var13 >> 8;
            int var16 = arg0 * var14 >> 8;
            int var17 = (arg1 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg3 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Draw2D.field1095 * arg8 + arg2;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg6; var24 < 0; var24++) {
                    int var25 = this.field685[(var22 >> 16) + (var23 >> 16) * this.field686];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        Draw2D.field1094[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Draw2D.field1095;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(LWRRBQEHV;III)V")
    public void method201(Pix8 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -49993) {
            return;
        }
        int var5 = this.field688 + arg3;
        int var6 = this.field689 + arg1;
        int var7 = Draw2D.field1095 * var6 + var5;
        int var8 = 0;
        int var9 = this.field687;
        int var10 = this.field686;
        int var11 = Draw2D.field1095 - var10;
        int var12 = 0;
        if (var6 < Draw2D.field1097) {
            int var13 = Draw2D.field1097 - var6;
            var9 -= var13;
            var6 = Draw2D.field1097;
            var8 += var10 * var13;
            var7 += Draw2D.field1095 * var13;
        }
        if (var6 + var9 > Draw2D.field1098) {
            var9 -= var6 + var9 - Draw2D.field1098;
        }
        if (var5 < Draw2D.field1099) {
            int var14 = Draw2D.field1099 - var5;
            var10 -= var14;
            var5 = Draw2D.field1099;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Draw2D.field1100) {
            int var15 = var5 + var10 - Draw2D.field1100;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method202(var7, var11, this.field685, var10, Draw2D.field1094, arg0.field1548, 40303, var9, var8, 0, var12);
        }
    }

    @OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(II[II[I[BIIIII)V")
    private void method202(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg3 >> 2);
        if (arg6 != 40303) {
            this.field682 = !this.field682;
        }
        int var13 = -(arg3 & 0x3);
        for (int var14 = -arg7; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg2[arg8++];
                if (var18 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var18;
                } else {
                    arg0++;
                }
                int var19 = arg2[arg8++];
                if (var19 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var19;
                } else {
                    arg0++;
                }
                int var20 = arg2[arg8++];
                if (var20 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var20;
                } else {
                    arg0++;
                }
                int var21 = arg2[arg8++];
                if (var21 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var21;
                } else {
                    arg0++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg2[arg8++];
                if (var17 != 0 && arg5[arg0] == 0) {
                    arg4[arg0++] = var17;
                } else {
                    arg0++;
                }
            }
            arg0 += arg1;
            arg8 += arg10;
        }
    }
}
