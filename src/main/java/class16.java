import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EFVUNBHT")
public class class16 extends class5 {

    @OriginalMember(owner = "client!EFVUNBHT", name = "x", descriptor = "I")
    private int field750 = -29787;

    @OriginalMember(owner = "client!EFVUNBHT", name = "y", descriptor = "Z")
    private boolean field751 = false;

    @OriginalMember(owner = "client!EFVUNBHT", name = "z", descriptor = "I")
    private int field752 = 7;

    @OriginalMember(owner = "client!EFVUNBHT", name = "A", descriptor = "I")
    private int field753 = -32457;

    @OriginalMember(owner = "client!EFVUNBHT", name = "B", descriptor = "B")
    private byte field754 = 3;

    @OriginalMember(owner = "client!EFVUNBHT", name = "C", descriptor = "I")
    private int field755 = 850;

    @OriginalMember(owner = "client!EFVUNBHT", name = "D", descriptor = "B")
    private byte field756 = -55;

    @OriginalMember(owner = "client!EFVUNBHT", name = "E", descriptor = "Z")
    private boolean field757 = false;

    @OriginalMember(owner = "client!EFVUNBHT", name = "F", descriptor = "I")
    private int field758 = 398;

    @OriginalMember(owner = "client!EFVUNBHT", name = "G", descriptor = "[I")
    public int[] field759;

    @OriginalMember(owner = "client!EFVUNBHT", name = "L", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!EFVUNBHT", name = "H", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!EFVUNBHT", name = "M", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!EFVUNBHT", name = "I", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!EFVUNBHT", name = "K", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!EFVUNBHT", name = "J", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!EFVUNBHT", name = "<init>", descriptor = "(II)V")
    public class16(int arg0, int arg1) {
        this.field759 = new int[arg0 * arg1];
        this.field760 = this.field764 = arg0;
        this.field761 = this.field765 = arg1;
        this.field762 = this.field763 = 0;
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class16(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field760 = var3.getWidth(arg1);
            this.field761 = var3.getHeight(arg1);
            this.field764 = this.field760;
            this.field765 = this.field761;
            this.field762 = 0;
            this.field763 = 0;
            this.field759 = new int[this.field761 * this.field760];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field760, this.field761, this.field759, 0, this.field760);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "<init>", descriptor = "(LHBJEXSJX;Ljava/lang/String;I)V")
    public class16(class24 arg0, String arg1, int arg2) {
        class18 var4 = new class18(arg0.method348(arg1 + ".dat", null), 0);
        class18 var5 = new class18(arg0.method348("index.dat", null), 0);
        var5.field794 = var4.method241();
        this.field764 = var5.method241();
        this.field765 = var5.method241();
        int var6 = var5.method239();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method243();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field794 += 2;
            var4.field794 += var5.method241() * var5.method241();
            var5.field794++;
        }
        this.field762 = var5.method239();
        this.field763 = var5.method239();
        this.field760 = var5.method241();
        this.field761 = var5.method241();
        int var10 = var5.method239();
        int var11 = this.field761 * this.field760;
        this.field759 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field759[var12] = var7[var4.method239()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field760; var13++) {
                for (int var14 = 0; var14 < this.field761; var14++) {
                    this.field759[this.field760 * var14 + var13] = var7[var4.method239()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "c", descriptor = "(I)V")
    public void method210(int arg0) {
        class5.method24(this.field760, this.field761, this.field759, true);
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(IIIB)V")
    public void method211(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -108) {
            return;
        }
        for (int var5 = 0; var5 < this.field759.length; var5++) {
            int var6 = this.field759[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg2 + var7;
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
                this.field759[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "d", descriptor = "(I)V")
    public void method212(int arg0) {
        int[] var2 = new int[this.field765 * this.field764];
        for (int var3 = 0; var3 < this.field761; var3++) {
            for (int var4 = 0; var4 < this.field760; var4++) {
                var2[(this.field763 + var3) * this.field764 + this.field762 + var4] = this.field759[this.field760 * var3 + var4];
            }
        }
        this.field759 = var2;
        this.field760 = this.field764;
        this.field761 = this.field765;
        this.field762 = 0;
        if (this.field753 == arg0) {
            this.field763 = 0;
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(III)V")
    public void method213(int arg0, int arg1, int arg2) {
        int var4 = this.field762 + arg2;
        int var5 = this.field763 + arg1;
        int var6 = class5.field61 * var5 + var4;
        int var7 = 0;
        int var8 = this.field761;
        int var9 = this.field760;
        int var10 = class5.field61 - var9;
        int var11 = 0;
        if (var5 < class5.field63) {
            int var12 = class5.field63 - var5;
            var8 -= var12;
            var5 = class5.field63;
            var7 += var9 * var12;
            var6 += class5.field61 * var12;
        }
        if (var5 + var8 > class5.field64) {
            var8 -= var5 + var8 - class5.field64;
        }
        if (var4 < class5.field65) {
            int var13 = class5.field65 - var4;
            var9 -= var13;
            var4 = class5.field65;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class5.field66) {
            int var14 = var4 + var9 - class5.field66;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method214(var9, var7, var8, this.field759, 5, var6, var10, class5.field60, var11);
            if (arg0 >= 0) {
                this.field751 = !this.field751;
            }
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(III[IIII[II)V")
    private void method214(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        for (int var12 = -arg2; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg7[arg5++] = arg3[arg1++];
                arg7[arg5++] = arg3[arg1++];
                arg7[arg5++] = arg3[arg1++];
                arg7[arg5++] = arg3[arg1++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg7[arg5++] = arg3[arg1++];
            }
            arg5 += arg6;
            arg1 += arg8;
        }
        if (arg4 != 5) {
            this.field753 = 476;
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "b", descriptor = "(III)V")
    public void method215(int arg0, int arg1, int arg2) {
        int var4 = this.field762 + arg1;
        int var5 = this.field763 + arg2;
        int var6 = class5.field61 * var5 + var4;
        int var7 = 0;
        int var8 = this.field761;
        int var9 = this.field760;
        int var10 = class5.field61 - var9;
        int var11 = 0;
        if (arg0 < 1 || arg0 > 1) {
            this.field750 = -37;
        }
        if (var5 < class5.field63) {
            int var12 = class5.field63 - var5;
            var8 -= var12;
            var5 = class5.field63;
            var7 += var9 * var12;
            var6 += class5.field61 * var12;
        }
        if (var5 + var8 > class5.field64) {
            var8 -= var5 + var8 - class5.field64;
        }
        if (var4 < class5.field65) {
            int var13 = class5.field65 - var4;
            var9 -= var13;
            var4 = class5.field65;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class5.field66) {
            int var14 = var4 + var9 - class5.field66;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method216(class5.field60, this.field759, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method216(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(IIIZ)V")
    public void method217(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field762 + arg1;
        if (arg3) {
            return;
        }
        int var6 = this.field763 + arg0;
        int var7 = class5.field61 * var6 + var5;
        int var8 = 0;
        int var9 = this.field761;
        int var10 = this.field760;
        int var11 = class5.field61 - var10;
        int var12 = 0;
        if (var6 < class5.field63) {
            int var13 = class5.field63 - var6;
            var9 -= var13;
            var6 = class5.field63;
            var8 += var10 * var13;
            var7 += class5.field61 * var13;
        }
        if (var6 + var9 > class5.field64) {
            var9 -= var6 + var9 - class5.field64;
        }
        if (var5 < class5.field65) {
            int var14 = class5.field65 - var5;
            var10 -= var14;
            var5 = class5.field65;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class5.field66) {
            int var15 = var5 + var10 - class5.field66;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method218(var7, var8, 0, 0, this.field759, var9, var11, var10, arg2, class5.field60, var12);
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(IIII[IIIII[II)V")
    private void method218(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = 256 - arg8;
        if (arg2 != 0) {
            this.field758 = 269;
        }
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = -arg7; var14 < 0; var14++) {
                int var15 = arg4[arg1++];
                if (var15 == 0) {
                    arg0++;
                } else {
                    int var16 = arg9[arg0];
                    arg9[arg0++] = ((var15 & 0xFF00FF) * arg8 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg8 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg0 += arg6;
            arg1 += arg10;
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(I[IIII[IZIIII)V")
    public void method219(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        if (!arg6) {
            this.field751 = !this.field751;
        }
        try {
            int var12 = -arg0 / 2;
            int var13 = -arg4 / 2;
            int var14 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var16 = arg7 * var14 >> 8;
            int var17 = arg7 * var15 >> 8;
            int var18 = (arg3 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg10 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class5.field61 * arg8 + arg2;
            for (int var21 = 0; var21 < arg4; var21++) {
                int var22 = arg5[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg1[var21]; var26 < 0; var26++) {
                    class5.field60[var23++] = this.field759[(var24 >> 16) + (var25 >> 16) * this.field760];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class5.field61;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(IIIIIDIII)V")
    public void method220(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7, int arg8) {
        int var11 = 88 / arg2;
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin(arg5) * 65536.0D);
            int var15 = (int) (Math.cos(arg5) * 65536.0D);
            int var16 = arg6 * var14 >> 8;
            int var17 = arg6 * var15 >> 8;
            int var18 = (arg0 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg4 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class5.field61 * arg7 + arg8;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg1; var25 < 0; var25++) {
                    int var26 = this.field759[(var23 >> 16) + (var24 >> 16) * this.field760];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class5.field60[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class5.field61;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(LMRCVLIXG;IIB)V")
    public void method221(class38 arg0, int arg1, int arg2, byte arg3) {
        if (this.field756 != arg3) {
            return;
        }
        int var5 = this.field762 + arg1;
        int var6 = this.field763 + arg2;
        int var7 = class5.field61 * var6 + var5;
        int var8 = 0;
        int var9 = this.field761;
        int var10 = this.field760;
        int var11 = class5.field61 - var10;
        int var12 = 0;
        if (var6 < class5.field63) {
            int var13 = class5.field63 - var6;
            var9 -= var13;
            var6 = class5.field63;
            var8 += var10 * var13;
            var7 += class5.field61 * var13;
        }
        if (var6 + var9 > class5.field64) {
            var9 -= var6 + var9 - class5.field64;
        }
        if (var5 < class5.field65) {
            int var14 = class5.field65 - var5;
            var10 -= var14;
            var5 = class5.field65;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class5.field66) {
            int var15 = var5 + var10 - class5.field66;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method222(var7, var12, var10, class5.field60, var11, 0, 0, var9, this.field759, arg0.field1142, var8);
        }
    }

    @OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(III[IIIII[I[BI)V")
    private void method222(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9, int arg10) {
        if (arg6 != 0) {
            return;
        }
        int var12 = -(arg2 >> 2);
        int var13 = -(arg2 & 0x3);
        for (int var14 = -arg7; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg8[arg10++];
                if (var18 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var18;
                } else {
                    arg0++;
                }
                int var19 = arg8[arg10++];
                if (var19 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var19;
                } else {
                    arg0++;
                }
                int var20 = arg8[arg10++];
                if (var20 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var20;
                } else {
                    arg0++;
                }
                int var21 = arg8[arg10++];
                if (var21 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var21;
                } else {
                    arg0++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg8[arg10++];
                if (var17 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var17;
                } else {
                    arg0++;
                }
            }
            arg0 += arg4;
            arg10 += arg1;
        }
    }
}
