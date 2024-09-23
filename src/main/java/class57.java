import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VDSDFSIV")
public class class57 extends class29 {

    @OriginalMember(owner = "VDSDFSIV", name = "w", descriptor = "I")
    private int field1523 = 34021;

    @OriginalMember(owner = "VDSDFSIV", name = "x", descriptor = "I")
    private int field1524 = -10464;

    @OriginalMember(owner = "VDSDFSIV", name = "y", descriptor = "Z")
    private boolean field1525 = false;

    @OriginalMember(owner = "VDSDFSIV", name = "z", descriptor = "I")
    private int field1526 = -2130;

    @OriginalMember(owner = "VDSDFSIV", name = "A", descriptor = "Z")
    private boolean field1527 = true;

    @OriginalMember(owner = "VDSDFSIV", name = "B", descriptor = "[I")
    public int[] field1528;

    @OriginalMember(owner = "VDSDFSIV", name = "G", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "VDSDFSIV", name = "C", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "VDSDFSIV", name = "H", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "VDSDFSIV", name = "D", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "VDSDFSIV", name = "F", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "VDSDFSIV", name = "E", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "VDSDFSIV", name = "<init>", descriptor = "(II)V")
    public class57(int arg0, int arg1) {
        this.field1528 = new int[arg0 * arg1];
        this.field1529 = this.field1533 = arg0;
        this.field1530 = this.field1534 = arg1;
        this.field1531 = this.field1532 = 0;
    }

    @OriginalMember(owner = "VDSDFSIV", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class57(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1529 = var3.getWidth(arg1);
            this.field1530 = var3.getHeight(arg1);
            this.field1533 = this.field1529;
            this.field1534 = this.field1530;
            this.field1531 = 0;
            this.field1532 = 0;
            this.field1528 = new int[this.field1530 * this.field1529];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1529, this.field1530, this.field1528, 0, this.field1529);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "<init>", descriptor = "(LCVNWKEAW;Ljava/lang/String;I)V")
    public class57(class7 arg0, String arg1, int arg2) {
        class62 var4 = new class62(-417, arg0.method180(arg1 + ".dat", null));
        class62 var5 = new class62(-417, arg0.method180("index.dat", null));
        var5.field1579 = var4.method523();
        this.field1533 = var5.method523();
        this.field1534 = var5.method523();
        int var6 = var5.method521();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method525();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1579 += 2;
            var4.field1579 += var5.method523() * var5.method523();
            var5.field1579++;
        }
        this.field1531 = var5.method521();
        this.field1532 = var5.method521();
        this.field1529 = var5.method523();
        this.field1530 = var5.method523();
        int var10 = var5.method521();
        int var11 = this.field1530 * this.field1529;
        this.field1528 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1528[var12] = var7[var4.method521()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1529; var13++) {
                for (int var14 = 0; var14 < this.field1530; var14++) {
                    this.field1528[this.field1529 * var14 + var13] = var7[var4.method521()];
                }
            }
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "c", descriptor = "(I)V")
    public void method494(int arg0) {
        class29.method317(this.field1528, this.field1530, this.field1529, true);
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(ZIII)V")
    public void method495(boolean arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1528.length; var5++) {
            int var6 = this.field1528[var5];
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
                int var12 = arg3 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1528[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg0) {
            this.field1523 = -187;
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "d", descriptor = "(I)V")
    public void method496(int arg0) {
        if (arg0 != -10854) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int[] var3 = new int[this.field1534 * this.field1533];
        for (int var4 = 0; var4 < this.field1530; var4++) {
            for (int var5 = 0; var5 < this.field1529; var5++) {
                var3[(this.field1532 + var4) * this.field1533 + this.field1531 + var5] = this.field1528[this.field1529 * var4 + var5];
            }
        }
        this.field1528 = var3;
        this.field1529 = this.field1533;
        this.field1530 = this.field1534;
        this.field1531 = 0;
        this.field1532 = 0;
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(IIB)V")
    public void method497(int arg0, int arg1, byte arg2) {
        int var4 = this.field1531 + arg0;
        int var5 = this.field1532 + arg1;
        int var6 = class29.field943 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1530;
        int var9 = this.field1529;
        int var10 = class29.field943 - var9;
        int var11 = 0;
        if (arg2 != -58) {
            return;
        }
        if (var5 < class29.field945) {
            int var12 = class29.field945 - var5;
            var8 -= var12;
            var5 = class29.field945;
            var7 += var9 * var12;
            var6 += class29.field943 * var12;
        }
        if (var5 + var8 > class29.field946) {
            var8 -= var5 + var8 - class29.field946;
        }
        if (var4 < class29.field947) {
            int var13 = class29.field947 - var4;
            var9 -= var13;
            var4 = class29.field947;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class29.field948) {
            int var14 = var4 + var9 - class29.field948;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method498(var8, this.field1528, var6, var10, var9, var11, var7, -675, class29.field942);
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(I[IIIIIII[I)V")
    private void method498(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg4 >> 2);
        if (arg7 >= 0) {
            return;
        }
        int var11 = -(arg4 & 0x3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg8[arg2++] = arg1[arg6++];
                arg8[arg2++] = arg1[arg6++];
                arg8[arg2++] = arg1[arg6++];
                arg8[arg2++] = arg1[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg8[arg2++] = arg1[arg6++];
            }
            arg2 += arg3;
            arg6 += arg5;
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(III)V")
    public void method499(int arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = this.field1531 + arg1;
        int var6 = this.field1532 + arg0;
        int var7 = class29.field943 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1530;
        int var10 = this.field1529;
        int var11 = class29.field943 - var10;
        int var12 = 0;
        if (var6 < class29.field945) {
            int var13 = class29.field945 - var6;
            var9 -= var13;
            var6 = class29.field945;
            var8 += var10 * var13;
            var7 += class29.field943 * var13;
        }
        if (var6 + var9 > class29.field946) {
            var9 -= var6 + var9 - class29.field946;
        }
        if (var5 < class29.field947) {
            int var14 = class29.field947 - var5;
            var10 -= var14;
            var5 = class29.field947;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class29.field948) {
            int var15 = var5 + var10 - class29.field948;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method500(class29.field942, this.field1528, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method500(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(IIII)V")
    public void method501(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1531 + arg0;
        int var6 = this.field1532 + arg3;
        int var7 = class29.field943 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1530;
        int var10 = this.field1529;
        int var11 = class29.field943 - var10;
        int var12 = 0;
        if (arg2 != 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        if (var6 < class29.field945) {
            int var14 = class29.field945 - var6;
            var9 -= var14;
            var6 = class29.field945;
            var8 += var10 * var14;
            var7 += class29.field943 * var14;
        }
        if (var6 + var9 > class29.field946) {
            var9 -= var6 + var9 - class29.field946;
        }
        if (var5 < class29.field947) {
            int var15 = class29.field947 - var5;
            var10 -= var15;
            var5 = class29.field947;
            var8 += var15;
            var7 += var15;
            var12 += var15;
            var11 += var15;
        }
        if (var5 + var10 > class29.field948) {
            int var16 = var5 + var10 - class29.field948;
            var10 -= var16;
            var12 += var16;
            var11 += var16;
        }
        if (var10 > 0 && var9 > 0) {
            this.method502(var9, var10, var7, class29.field942, var8, var12, var11, 0, (byte) -75, arg1, this.field1528);
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(III[IIIIIBI[I)V")
    private void method502(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg9;
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = arg10[arg4++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg3[arg2];
                    arg3[arg2++] = ((var15 & 0xFF00FF) * arg9 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg9 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg6;
            arg4 += arg5;
        }
        if (arg8 != -75) {
            this.field1525 = !this.field1525;
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(IIIIIIIII[I[I)V")
    public void method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int[] arg10) {
        if (arg0 != 31473) {
            this.field1525 = !this.field1525;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg4 / 2;
            int var14 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
            int var16 = arg7 * var14 >> 8;
            int var17 = arg7 * var15 >> 8;
            int var18 = (arg5 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg6 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class29.field943 * arg2 + arg8;
            for (int var21 = 0; var21 < arg4; var21++) {
                int var22 = arg9[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg10[var21]; var26 < 0; var26++) {
                    class29.field942[var23++] = this.field1528[(var24 >> 16) + (var25 >> 16) * this.field1529];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class29.field943;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(IIIIIIIID)V")
    public void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, double arg8) {
        while (arg3 >= 0) {
            this.field1527 = !this.field1527;
        }
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg5 / 2;
            int var13 = (int) (Math.sin(arg8) * 65536.0D);
            int var14 = (int) (Math.cos(arg8) * 65536.0D);
            int var15 = arg1 * var13 >> 8;
            int var16 = arg1 * var14 >> 8;
            int var17 = (arg0 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg6 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class29.field943 * arg4 + arg7;
            for (int var20 = 0; var20 < arg5; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg2; var24 < 0; var24++) {
                    int var25 = this.field1528[(var22 >> 16) + (var23 >> 16) * this.field1529];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class29.field942[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class29.field943;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(ILDNACUOZQ;II)V")
    public void method505(int arg0, class10 arg1, int arg2, int arg3) {
        int var5 = this.field1531 + arg0;
        int var6 = this.field1532 + arg2;
        int var7 = class29.field943 * var6 + var5;
        int var8 = 0;
        if (arg3 != 0) {
            return;
        }
        int var9 = this.field1530;
        int var10 = this.field1529;
        int var11 = class29.field943 - var10;
        int var12 = 0;
        if (var6 < class29.field945) {
            int var13 = class29.field945 - var6;
            var9 -= var13;
            var6 = class29.field945;
            var8 += var10 * var13;
            var7 += class29.field943 * var13;
        }
        if (var6 + var9 > class29.field946) {
            var9 -= var6 + var9 - class29.field946;
        }
        if (var5 < class29.field947) {
            int var14 = class29.field947 - var5;
            var10 -= var14;
            var5 = class29.field947;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class29.field948) {
            int var15 = var5 + var10 - class29.field948;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method506(var10, 0, var11, var8, 884, arg1.field595, var7, this.field1528, var12, var9, class29.field942);
        }
    }

    @OriginalMember(owner = "VDSDFSIV", name = "a", descriptor = "(IIIII[BI[III[I)V")
    private void method506(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int arg9, int[] arg10) {
        int var12 = -(arg0 >> 2);
        int var13 = -(arg0 & 0x3);
        for (int var14 = -arg9; var14 < 0; var14++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg7[arg3++];
                if (var19 != 0 && arg5[arg6] == 0) {
                    arg10[arg6++] = var19;
                } else {
                    arg6++;
                }
                int var20 = arg7[arg3++];
                if (var20 != 0 && arg5[arg6] == 0) {
                    arg10[arg6++] = var20;
                } else {
                    arg6++;
                }
                int var21 = arg7[arg3++];
                if (var21 != 0 && arg5[arg6] == 0) {
                    arg10[arg6++] = var21;
                } else {
                    arg6++;
                }
                int var22 = arg7[arg3++];
                if (var22 != 0 && arg5[arg6] == 0) {
                    arg10[arg6++] = var22;
                } else {
                    arg6++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg7[arg3++];
                if (var18 != 0 && arg5[arg6] == 0) {
                    arg10[arg6++] = var18;
                } else {
                    arg6++;
                }
            }
            arg6 += arg2;
            arg3 += arg8;
        }
        int var15 = 53 / arg4;
    }
}
