import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FKNRMZJV")
public class class13 extends class61 {

    @OriginalMember(owner = "client!FKNRMZJV", name = "C", descriptor = "Z")
    private boolean field659 = false;

    @OriginalMember(owner = "client!FKNRMZJV", name = "D", descriptor = "Z")
    private boolean field660 = true;

    @OriginalMember(owner = "client!FKNRMZJV", name = "E", descriptor = "I")
    private int field661 = 7;

    @OriginalMember(owner = "client!FKNRMZJV", name = "H", descriptor = "[I")
    public int[] field664;

    @OriginalMember(owner = "client!FKNRMZJV", name = "M", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!FKNRMZJV", name = "I", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!FKNRMZJV", name = "N", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!FKNRMZJV", name = "J", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!FKNRMZJV", name = "L", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!FKNRMZJV", name = "K", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!FKNRMZJV", name = "B", descriptor = "Z")
    private static boolean field658 = true;

    @OriginalMember(owner = "client!FKNRMZJV", name = "F", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!FKNRMZJV", name = "G", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!FKNRMZJV", name = "<init>", descriptor = "(II)V")
    public class13(int arg0, int arg1) {
        this.field664 = new int[arg0 * arg1];
        this.field665 = this.field669 = arg0;
        this.field666 = this.field670 = arg1;
        this.field667 = this.field668 = 0;
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class13(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field665 = var3.getWidth(arg1);
            this.field666 = var3.getHeight(arg1);
            this.field669 = this.field665;
            this.field670 = this.field666;
            this.field667 = 0;
            this.field668 = 0;
            this.field664 = new int[this.field666 * this.field665];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field665, this.field666, this.field664, 0, this.field665);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "<init>", descriptor = "(LRSPRYUFS;Ljava/lang/String;I)V")
    public class13(class49 arg0, String arg1, int arg2) {
        class36 var4 = new class36(-587, arg0.method427(arg1 + ".dat", null));
        class36 var5 = new class36(-587, arg0.method427("index.dat", null));
        var5.field1072 = var4.method341();
        this.field669 = var5.method341();
        this.field670 = var5.method341();
        int var6 = var5.method339();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method343();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1072 += 2;
            var4.field1072 += var5.method341() * var5.method341();
            var5.field1072++;
        }
        this.field667 = var5.method339();
        this.field668 = var5.method339();
        this.field665 = var5.method341();
        this.field666 = var5.method341();
        int var10 = var5.method339();
        int var11 = this.field666 * this.field665;
        this.field664 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field664[var12] = var7[var4.method339()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field665; var13++) {
                for (int var14 = 0; var14 < this.field666; var14++) {
                    this.field664[this.field665 * var14 + var13] = var7[var4.method339()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(Z)V")
    public void method180(boolean arg0) {
        if (!arg0) {
            this.field661 = 85;
        }
        class61.method542(this.field666, this.field665, -47390, this.field664);
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IIII)V")
    public void method181(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field664.length; var5++) {
            int var6 = this.field664[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg3 + var7;
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
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field664[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "b", descriptor = "(I)V")
    public void method182(int arg0) {
        int[] var2 = new int[this.field670 * this.field669];
        for (int var3 = 0; var3 < this.field666; var3++) {
            for (int var4 = 0; var4 < this.field665; var4++) {
                var2[(this.field668 + var3) * this.field669 + this.field667 + var4] = this.field664[this.field665 * var3 + var4];
            }
        }
        this.field664 = var2;
        this.field665 = this.field669;
        if (arg0 <= 0) {
            this.field661 = -497;
        }
        this.field666 = this.field670;
        this.field667 = 0;
        this.field668 = 0;
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IBI)V")
    public void method183(int arg0, byte arg1, int arg2) {
        int var4 = this.field667 + arg0;
        if (arg1 == 0) {
            boolean var5 = false;
        } else {
            this.field659 = !this.field659;
        }
        int var6 = this.field668 + arg2;
        int var7 = class61.field1499 * var6 + var4;
        int var8 = 0;
        int var9 = this.field666;
        int var10 = this.field665;
        int var11 = class61.field1499 - var10;
        int var12 = 0;
        if (var6 < class61.field1501) {
            int var13 = class61.field1501 - var6;
            var9 -= var13;
            var6 = class61.field1501;
            var8 += var10 * var13;
            var7 += class61.field1499 * var13;
        }
        if (var6 + var9 > class61.field1502) {
            var9 -= var6 + var9 - class61.field1502;
        }
        if (var4 < class61.field1503) {
            int var14 = class61.field1503 - var4;
            var10 -= var14;
            var4 = class61.field1503;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class61.field1504) {
            int var15 = var4 + var10 - class61.field1504;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method184(var9, class61.field1498, 549, var12, this.field664, var8, var7, var11, var10);
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(I[III[IIIII)V")
    private void method184(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg8 >> 2);
        int var11 = 96 / arg2;
        int var12 = -(arg8 & 0x3);
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg1[arg6++] = arg4[arg5++];
                arg1[arg6++] = arg4[arg5++];
                arg1[arg6++] = arg4[arg5++];
                arg1[arg6++] = arg4[arg5++];
            }
            for (int var15 = var12; var15 < 0; var15++) {
                arg1[arg6++] = arg4[arg5++];
            }
            arg6 += arg7;
            arg5 += arg3;
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(III)V")
    public void method185(int arg0, int arg1, int arg2) {
        int var4 = this.field667 + arg2;
        int var5 = this.field668 + arg1;
        if (arg0 != 3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = class61.field1499 * var5 + var4;
        int var8 = 0;
        int var9 = this.field666;
        int var10 = this.field665;
        int var11 = class61.field1499 - var10;
        int var12 = 0;
        if (var5 < class61.field1501) {
            int var13 = class61.field1501 - var5;
            var9 -= var13;
            var5 = class61.field1501;
            var8 += var10 * var13;
            var7 += class61.field1499 * var13;
        }
        if (var5 + var9 > class61.field1502) {
            var9 -= var5 + var9 - class61.field1502;
        }
        if (var4 < class61.field1503) {
            int var14 = class61.field1503 - var4;
            var10 -= var14;
            var4 = class61.field1503;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class61.field1504) {
            int var15 = var4 + var10 - class61.field1504;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method186(class61.field1498, this.field664, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "([I[IIIIIIII)V")
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

    @OriginalMember(owner = "client!FKNRMZJV", name = "b", descriptor = "(IIII)V")
    public void method187(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field667 + arg1;
        int var6 = this.field668 + arg2;
        int var7 = class61.field1499 * var6 + var5;
        int var8 = 0;
        int var9 = this.field666;
        int var10 = this.field665;
        int var11 = class61.field1499 - var10;
        int var12 = 0;
        if (arg0 != 17120) {
            return;
        }
        if (var6 < class61.field1501) {
            int var13 = class61.field1501 - var6;
            var9 -= var13;
            var6 = class61.field1501;
            var8 += var10 * var13;
            var7 += class61.field1499 * var13;
        }
        if (var6 + var9 > class61.field1502) {
            var9 -= var6 + var9 - class61.field1502;
        }
        if (var5 < class61.field1503) {
            int var14 = class61.field1503 - var5;
            var10 -= var14;
            var5 = class61.field1503;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class61.field1504) {
            int var15 = var5 + var10 - class61.field1504;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method188(var10, 0, arg3, var8, var11, var7, var9, 23782, var12, class61.field1498, this.field664);
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IIIIIIIII[I[I)V")
    private void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int[] arg10) {
        int var12 = 256 - arg2;
        if (arg7 != 23782) {
            this.field663 = 62;
        }
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                int var15 = arg10[arg3++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    int var16 = arg9[arg5];
                    arg9[arg5++] = ((var15 & 0xFF00FF) * arg2 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg2 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg5 += arg4;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "b", descriptor = "(IIIIIIIII[I[I)V")
    public void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int[] arg10) {
        while (arg1 >= 0) {
            this.field663 = -364;
        }
        try {
            int var12 = -arg4 / 2;
            int var13 = -arg2 / 2;
            int var14 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
            int var16 = arg7 * var14 >> 8;
            int var17 = arg7 * var15 >> 8;
            int var18 = (arg3 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg5 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class61.field1499 * arg0 + arg6;
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = arg10[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg9[var21]; var26 < 0; var26++) {
                    class61.field1498[var23++] = this.field664[(var24 >> 16) + (var25 >> 16) * this.field665];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class61.field1499;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IIIIIIIID)V")
    public void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, double arg8) {
        if (arg0 != -44232) {
            return;
        }
        try {
            int var11 = -arg3 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg8) * 65536.0D);
            int var14 = (int) (Math.cos(arg8) * 65536.0D);
            int var15 = arg2 * var13 >> 8;
            int var16 = arg2 * var14 >> 8;
            int var17 = (arg5 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg6 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class61.field1499 * arg1 + arg7;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg3; var24 < 0; var24++) {
                    int var25 = this.field664[(var22 >> 16) + (var23 >> 16) * this.field665];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class61.field1498[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class61.field1499;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IIBLUZETOFZZ;)V")
    public void method191(int arg0, int arg1, byte arg2, class59 arg3) {
        int var5 = this.field667 + arg0;
        int var6 = this.field668 + arg1;
        int var7 = class61.field1499 * var6 + var5;
        int var8 = 0;
        int var9 = this.field666;
        int var10 = this.field665;
        int var11 = class61.field1499 - var10;
        int var12 = 0;
        if (var6 < class61.field1501) {
            int var13 = class61.field1501 - var6;
            var9 -= var13;
            var6 = class61.field1501;
            var8 += var10 * var13;
            var7 += class61.field1499 * var13;
        }
        if (var6 + var9 > class61.field1502) {
            var9 -= var6 + var9 - class61.field1502;
        }
        if (var5 < class61.field1503) {
            int var14 = class61.field1503 - var5;
            var10 -= var14;
            var5 = class61.field1503;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class61.field1504) {
            int var15 = var5 + var10 - class61.field1504;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method192(class61.field1498, true, var9, var11, var8, 0, var7, this.field664, arg3.field1407, var12, var10);
            if (arg2 != 40) {
                this.field662 = -22;
            }
        }
    }

    @OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "([IZIIIII[I[BII)V")
    private void method192(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, byte[] arg8, int arg9, int arg10) {
        int var12 = -(arg10 >> 2);
        if (!arg1) {
            this.field661 = -403;
        }
        int var13 = -(arg10 & 0x3);
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg7[arg4++];
                if (var18 != 0 && arg8[arg6] == 0) {
                    arg0[arg6++] = var18;
                } else {
                    arg6++;
                }
                int var19 = arg7[arg4++];
                if (var19 != 0 && arg8[arg6] == 0) {
                    arg0[arg6++] = var19;
                } else {
                    arg6++;
                }
                int var20 = arg7[arg4++];
                if (var20 != 0 && arg8[arg6] == 0) {
                    arg0[arg6++] = var20;
                } else {
                    arg6++;
                }
                int var21 = arg7[arg4++];
                if (var21 != 0 && arg8[arg6] == 0) {
                    arg0[arg6++] = var21;
                } else {
                    arg6++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg7[arg4++];
                if (var17 != 0 && arg8[arg6] == 0) {
                    arg0[arg6++] = var17;
                } else {
                    arg6++;
                }
            }
            arg6 += arg3;
            arg4 += arg9;
        }
    }
}
