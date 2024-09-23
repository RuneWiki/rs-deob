import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TTFRDWZK")
public class class58 extends class12 {

    @OriginalMember(owner = "TTFRDWZK", name = "x", descriptor = "Z")
    private boolean field1490 = true;

    @OriginalMember(owner = "TTFRDWZK", name = "y", descriptor = "Z")
    private boolean field1491 = true;

    @OriginalMember(owner = "TTFRDWZK", name = "A", descriptor = "Z")
    private boolean field1493 = true;

    @OriginalMember(owner = "TTFRDWZK", name = "B", descriptor = "I")
    private int field1494 = -71;

    @OriginalMember(owner = "TTFRDWZK", name = "C", descriptor = "B")
    private byte field1495 = 7;

    @OriginalMember(owner = "TTFRDWZK", name = "D", descriptor = "I")
    private int field1496 = -180;

    @OriginalMember(owner = "TTFRDWZK", name = "E", descriptor = "I")
    private int field1497 = -16153;

    @OriginalMember(owner = "TTFRDWZK", name = "F", descriptor = "[I")
    public int[] field1498;

    @OriginalMember(owner = "TTFRDWZK", name = "K", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "TTFRDWZK", name = "G", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "TTFRDWZK", name = "L", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "TTFRDWZK", name = "H", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "TTFRDWZK", name = "J", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "TTFRDWZK", name = "I", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "TTFRDWZK", name = "z", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "TTFRDWZK", name = "<init>", descriptor = "(II)V")
    public class58(int arg0, int arg1) {
        this.field1498 = new int[arg0 * arg1];
        this.field1499 = this.field1503 = arg0;
        this.field1500 = this.field1504 = arg1;
        this.field1501 = this.field1502 = 0;
    }

    @OriginalMember(owner = "TTFRDWZK", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class58(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1499 = var3.getWidth(arg1);
            this.field1500 = var3.getHeight(arg1);
            this.field1503 = this.field1499;
            this.field1504 = this.field1500;
            this.field1501 = 0;
            this.field1502 = 0;
            this.field1498 = new int[this.field1500 * this.field1499];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1499, this.field1500, this.field1498, 0, this.field1499);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "<init>", descriptor = "(LTXPLZUUI;Ljava/lang/String;I)V")
    public class58(class60 arg0, String arg1, int arg2) {
        class43 var4 = new class43(arg0.method506(arg1 + ".dat", null), 0);
        class43 var5 = new class43(arg0.method506("index.dat", null), 0);
        var5.field1105 = var4.method332();
        this.field1503 = var5.method332();
        this.field1504 = var5.method332();
        int var6 = var5.method330();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method334();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1105 += 2;
            var4.field1105 += var5.method332() * var5.method332();
            var5.field1105++;
        }
        this.field1501 = var5.method330();
        this.field1502 = var5.method330();
        this.field1499 = var5.method332();
        this.field1500 = var5.method332();
        int var10 = var5.method330();
        int var11 = this.field1500 * this.field1499;
        this.field1498 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1498[var12] = var7[var4.method330()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field1499; var13++) {
                    for (int var14 = 0; var14 < this.field1500; var14++) {
                        this.field1498[this.field1499 * var14 + var13] = var7[var4.method330()];
                    }
                }
            }
            if (class27.field922) {
            }
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "c", descriptor = "(I)V")
    public void method492(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class12.method197(this.field1500, 4, this.field1499, this.field1498);
    }

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "(ZIII)V")
    public void method493(boolean arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1498.length; var5++) {
            int var6 = this.field1498[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg1 + var7;
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
                this.field1498[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg0) {
            this.field1491 = !this.field1491;
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "d", descriptor = "(I)V")
    public void method494(int arg0) {
        int[] var2 = new int[this.field1504 * this.field1503];
        for (int var3 = 0; var3 < this.field1500; var3++) {
            for (int var4 = 0; var4 < this.field1499; var4++) {
                var2[(this.field1502 + var3) * this.field1503 + this.field1501 + var4] = this.field1498[this.field1499 * var3 + var4];
            }
        }
        this.field1498 = var2;
        this.field1499 = this.field1503;
        if (arg0 != 0) {
            this.field1491 = !this.field1491;
        }
        this.field1500 = this.field1504;
        this.field1501 = 0;
        this.field1502 = 0;
    }

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "(III)V")
    public void method495(int arg0, int arg1, int arg2) {
        int var4 = this.field1501 + arg2;
        int var5 = this.field1502 + arg0;
        int var6 = class12.field635 * var5 + var4;
        int var7 = 0;
        if (arg1 >= 0) {
            return;
        }
        int var8 = this.field1500;
        int var9 = this.field1499;
        int var10 = class12.field635 - var9;
        int var11 = 0;
        if (var5 < class12.field637) {
            int var12 = class12.field637 - var5;
            var8 -= var12;
            var5 = class12.field637;
            var7 += var9 * var12;
            var6 += class12.field635 * var12;
        }
        if (var5 + var8 > class12.field638) {
            var8 -= var5 + var8 - class12.field638;
        }
        if (var4 < class12.field639) {
            int var13 = class12.field639 - var4;
            var9 -= var13;
            var4 = class12.field639;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class12.field640) {
            int var14 = var4 + var9 - class12.field640;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method496(var10, var6, var7, class12.field634, 9, var9, var11, var8, this.field1498);
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "(III[IIIII[I)V")
    private void method496(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        if (arg4 != 9) {
            return;
        }
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg3[arg1++] = arg8[arg2++];
                arg3[arg1++] = arg8[arg2++];
                arg3[arg1++] = arg8[arg2++];
                arg3[arg1++] = arg8[arg2++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg3[arg1++] = arg8[arg2++];
            }
            arg1 += arg0;
            arg2 += arg6;
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "b", descriptor = "(III)V")
    public void method497(int arg0, int arg1, int arg2) {
        int var4 = this.field1501 + arg0;
        if (arg2 != 30573) {
            return;
        }
        int var5 = this.field1502 + arg1;
        int var6 = class12.field635 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1500;
        int var9 = this.field1499;
        int var10 = class12.field635 - var9;
        int var11 = 0;
        if (var5 < class12.field637) {
            int var12 = class12.field637 - var5;
            var8 -= var12;
            var5 = class12.field637;
            var7 += var9 * var12;
            var6 += class12.field635 * var12;
        }
        if (var5 + var8 > class12.field638) {
            var8 -= var5 + var8 - class12.field638;
        }
        if (var4 < class12.field639) {
            int var13 = class12.field639 - var4;
            var9 -= var13;
            var4 = class12.field639;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class12.field640) {
            int var14 = var4 + var9 - class12.field640;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method498(class12.field634, this.field1498, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method498(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "(IIII)V")
    public void method499(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1501 + arg0;
        while (arg2 >= 0) {
            this.field1492 = -100;
        }
        int var6 = this.field1502 + arg1;
        int var7 = class12.field635 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1500;
        int var10 = this.field1499;
        int var11 = class12.field635 - var10;
        int var12 = 0;
        if (var6 < class12.field637) {
            int var13 = class12.field637 - var6;
            var9 -= var13;
            var6 = class12.field637;
            var8 += var10 * var13;
            var7 += class12.field635 * var13;
        }
        if (var6 + var9 > class12.field638) {
            var9 -= var6 + var9 - class12.field638;
        }
        if (var5 < class12.field639) {
            int var14 = class12.field639 - var5;
            var10 -= var14;
            var5 = class12.field639;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class12.field640) {
            int var15 = var5 + var10 - class12.field640;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method500(var11, var9, 0, -39397, var7, var12, this.field1498, var10, var8, arg3, class12.field634);
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "(IIIIII[IIII[I)V")
    private void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg9;
        if (arg3 != -39397) {
            this.field1497 = -335;
        }
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = -arg7; var14 < 0; var14++) {
                int var15 = arg6[arg8++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    int var16 = arg10[arg4];
                    arg10[arg4++] = ((var15 & 0xFF00FF) * arg9 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg9 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg0;
            arg8 += arg5;
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "(II[IIIII[IIZI)V")
    public void method501(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, boolean arg9, int arg10) {
        if (arg9) {
            return;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg8 / 2;
            int var14 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var16 = arg10 * var14 >> 8;
            int var17 = arg10 * var15 >> 8;
            int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg3 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class12.field635 * arg5 + arg6;
            for (int var21 = 0; var21 < arg8; var21++) {
                int var22 = arg7[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg2[var21]; var26 < 0; var26++) {
                    class12.field634[var23++] = this.field1498[(var24 >> 16) + (var25 >> 16) * this.field1499];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class12.field635;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "(IIDIIIIII)V")
    public void method502(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 0) {
            this.field1493 = !this.field1493;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg2) * 65536.0D);
            int var14 = (int) (Math.cos(arg2) * 65536.0D);
            int var15 = arg0 * var13 >> 8;
            int var16 = arg0 * var14 >> 8;
            int var17 = (arg3 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg1 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class12.field635 * arg5 + arg6;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg7; var24 < 0; var24++) {
                    int var25 = this.field1498[(var22 >> 16) + (var23 >> 16) * this.field1499];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class12.field634[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class12.field635;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "(ZIILSFAIBATY;)V")
    public void method503(boolean arg0, int arg1, int arg2, class53 arg3) {
        int var5 = this.field1501 + arg1;
        int var6 = this.field1502 + arg2;
        int var7 = class12.field635 * var6 + var5;
        int var8 = 0;
        if (!arg0) {
            this.field1491 = !this.field1491;
        }
        int var9 = this.field1500;
        int var10 = this.field1499;
        int var11 = class12.field635 - var10;
        int var12 = 0;
        if (var6 < class12.field637) {
            int var13 = class12.field637 - var6;
            var9 -= var13;
            var6 = class12.field637;
            var8 += var10 * var13;
            var7 += class12.field635 * var13;
        }
        if (var6 + var9 > class12.field638) {
            var9 -= var6 + var9 - class12.field638;
        }
        if (var5 < class12.field639) {
            int var14 = class12.field639 - var5;
            var10 -= var14;
            var5 = class12.field639;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class12.field640) {
            int var15 = var5 + var10 - class12.field640;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method504(var11, arg3.field1393, class12.field634, var12, 0, this.field1498, var9, var10, 0, var8, var7);
        }
    }

    @OriginalMember(owner = "TTFRDWZK", name = "a", descriptor = "(I[B[III[IIIIII)V")
    private void method504(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4 != 0) {
            this.field1492 = -178;
        }
        int var12 = -(arg7 >> 2);
        int var13 = -(arg7 & 0x3);
        for (int var14 = -arg6; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg5[arg9++];
                if (var18 != 0 && arg1[arg10] == 0) {
                    arg2[arg10++] = var18;
                } else {
                    arg10++;
                }
                int var19 = arg5[arg9++];
                if (var19 != 0 && arg1[arg10] == 0) {
                    arg2[arg10++] = var19;
                } else {
                    arg10++;
                }
                int var20 = arg5[arg9++];
                if (var20 != 0 && arg1[arg10] == 0) {
                    arg2[arg10++] = var20;
                } else {
                    arg10++;
                }
                int var21 = arg5[arg9++];
                if (var21 != 0 && arg1[arg10] == 0) {
                    arg2[arg10++] = var21;
                } else {
                    arg10++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg5[arg9++];
                if (var17 != 0 && arg1[arg10] == 0) {
                    arg2[arg10++] = var17;
                } else {
                    arg10++;
                }
            }
            arg10 += arg0;
            arg9 += arg3;
        }
    }
}
