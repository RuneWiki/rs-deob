import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class124 extends class117 {

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "[I")
    public int[] field3023;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIDI)V", line = 5)
    public final void method974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
        try {
            int var10 = -arg2 / 2;
            int var11 = -arg3 / 2;
            int var12 = (int) (Math.sin(arg6) * 65536.0D);
            int var13 = (int) (Math.cos(arg6) * 65536.0D);
            int var14 = arg7 * var12 >> 8;
            int var15 = arg7 * var13 >> 8;
            int var16 = (arg4 << 16) + var10 * var15 + var11 * var14;
            int var17 = (arg5 << 16) + (var11 * var15 - var10 * var14);
            int var18 = class117.field2834 * arg1 + arg0;
            for (int var19 = 0; var19 < arg3; var19++) {
                int var20 = var18;
                int var21 = var16;
                int var22 = var17;
                for (int var23 = -arg2; var23 < 0; var23++) {
                    int var24 = this.field3023[(var21 >> 16) + (var22 >> 16) * this.field3021];
                    if (var24 == 0) {
                        var20++;
                    } else {
                        class117.field2833[var20++] = var24;
                    }
                    var21 += var15;
                    var22 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += class117.field2834;
            }
        } catch (Exception var25) {
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V", line = 65)
    public final void method975(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3023.length; var4++) {
            int var5 = this.field3023[var4];
            if (var5 != 0) {
                int var6 = var5 >> 16 & 0xFF;
                int var7 = arg0 + var6;
                if (var7 < 1) {
                    var7 = 1;
                } else if (var7 > 255) {
                    var7 = 255;
                }
                int var8 = var5 >> 8 & 0xFF;
                int var9 = arg1 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var5 & 0xFF;
                int var11 = arg2 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                this.field3023[var4] = (var7 << 16) + (var9 << 8) + var11;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII[I[I)V", line = 123)
    public final void method976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class117.field2834 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; var25++) {
                    class117.field2833[var22++] = this.field3023[(var23 >> 16) + (var24 >> 16) * this.field3021];
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class117.field2834;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIII)V", line = 181)
    private static final void method977(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; var8++) {
            int var9 = arg3 + arg4 - 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
            }
            var9 += 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lab;II)V", line = 212)
    public final void method978(class3 arg0, int arg1, int arg2) {
        int var4 = this.field3018 + arg1;
        int var5 = this.field3019 + arg2;
        int var6 = class117.field2834 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3020;
        int var9 = this.field3021;
        int var10 = class117.field2834 - var9;
        int var11 = 0;
        if (var5 < class117.field2832) {
            int var12 = class117.field2832 - var5;
            var8 -= var12;
            var5 = class117.field2832;
            var7 += var9 * var12;
            var6 += class117.field2834 * var12;
        }
        if (var5 + var8 > class117.field2836) {
            var8 -= var5 + var8 - class117.field2836;
        }
        if (var4 < class117.field2830) {
            int var13 = class117.field2830 - var4;
            var9 -= var13;
            var4 = class117.field2830;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class117.field2831) {
            int var14 = var4 + var9 - class117.field2831;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method980(class117.field2833, this.field3023, 0, var7, var6, var9, var8, var10, var11, arg0.field98);
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "()V", line = 273)
    public final void method979() {
        class117.method898(this.field3023, this.field3021, this.field3020);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIII[B)V", line = 280)
    private static final void method980(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                int var16 = arg1[arg3++];
                if (var16 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var16;
                } else {
                    arg4++;
                }
                int var17 = arg1[arg3++];
                if (var17 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var17;
                } else {
                    arg4++;
                }
                int var18 = arg1[arg3++];
                if (var18 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var18;
                } else {
                    arg4++;
                }
                int var19 = arg1[arg3++];
                if (var19 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var19;
                } else {
                    arg4++;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                int var15 = arg1[arg3++];
                if (var15 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var15;
                } else {
                    arg4++;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "()V", line = 342)
    public final void method981() {
        if (this.field3022 == this.field3021 && this.field3024 == this.field3020) {
            return;
        }
        int[] var1 = new int[this.field3024 * this.field3022];
        for (int var2 = 0; var2 < this.field3020; var2++) {
            for (int var3 = 0; var3 < this.field3021; var3++) {
                var1[(this.field3019 + var2) * this.field3022 + this.field3018 + var3] = this.field3023[this.field3021 * var2 + var3];
            }
        }
        this.field3023 = var1;
        this.field3021 = this.field3022;
        this.field3020 = this.field3024;
        this.field3018 = 0;
        this.field3019 = 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIII)V", line = 373)
    private static final void method982(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
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
            }
            for (int var13 = var10; var13 < 0; var13++) {
                int var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var14;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIIII)V", line = 434)
    private static final void method983(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                int var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = ((var13 & 0xFF00FF) * arg9 + (var14 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 + (var14 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V", line = 470)
    public final void method984(int arg0, int arg1, int arg2) {
        int var4 = this.field3018 + arg0;
        int var5 = this.field3019 + arg1;
        int var6 = class117.field2834 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3020;
        int var9 = this.field3021;
        int var10 = class117.field2834 - var9;
        int var11 = 0;
        if (var5 < class117.field2832) {
            int var12 = class117.field2832 - var5;
            var8 -= var12;
            var5 = class117.field2832;
            var7 += var9 * var12;
            var6 += class117.field2834 * var12;
        }
        if (var5 + var8 > class117.field2836) {
            var8 -= var5 + var8 - class117.field2836;
        }
        if (var4 < class117.field2830) {
            int var13 = class117.field2830 - var4;
            var9 -= var13;
            var4 = class117.field2830;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class117.field2831) {
            int var14 = var4 + var9 - class117.field2831;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method983(class117.field2833, this.field3023, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 525)
    public final void method985(int arg0, int arg1) {
        int var3 = this.field3018 + arg0;
        int var4 = this.field3019 + arg1;
        int var5 = class117.field2834 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3020;
        int var8 = this.field3021;
        int var9 = class117.field2834 - var8;
        int var10 = 0;
        if (var4 < class117.field2832) {
            int var11 = class117.field2832 - var4;
            var7 -= var11;
            var4 = class117.field2832;
            var6 += var8 * var11;
            var5 += class117.field2834 * var11;
        }
        if (var4 + var7 > class117.field2836) {
            var7 -= var4 + var7 - class117.field2836;
        }
        if (var3 < class117.field2830) {
            int var12 = class117.field2830 - var3;
            var8 -= var12;
            var3 = class117.field2830;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class117.field2831) {
            int var13 = var3 + var8 - class117.field2831;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method982(class117.field2833, this.field3023, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V", line = 587)
    public final void method986(int arg0, int arg1) {
        int var3 = this.field3018 + arg0;
        int var4 = this.field3019 + arg1;
        int var5 = class117.field2834 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3020;
        int var8 = this.field3021;
        int var9 = class117.field2834 - var8;
        int var10 = 0;
        if (var4 < class117.field2832) {
            int var11 = class117.field2832 - var4;
            var7 -= var11;
            var4 = class117.field2832;
            var6 += var8 * var11;
            var5 += class117.field2834 * var11;
        }
        if (var4 + var7 > class117.field2836) {
            var7 -= var4 + var7 - class117.field2836;
        }
        if (var3 < class117.field2830) {
            int var12 = class117.field2830 - var3;
            var8 -= var12;
            var3 = class117.field2830;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class117.field2831) {
            int var13 = var3 + var8 - class117.field2831;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method977(class117.field2833, this.field3023, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 644)
    public class124() {
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V", line = 646)
    public class124(int arg0, int arg1) {
        this.field3023 = new int[arg0 * arg1];
        this.field3021 = this.field3022 = arg0;
        this.field3020 = this.field3024 = arg1;
        this.field3018 = this.field3019 = 0;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLjava/awt/Component;)V", line = 652)
    public class124(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field3021 = var3.getWidth(arg1);
            this.field3020 = var3.getHeight(arg1);
            this.field3022 = this.field3021;
            this.field3024 = this.field3020;
            this.field3018 = 0;
            this.field3019 = 0;
            this.field3023 = new int[this.field3021 * this.field3020];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field3021, this.field3020, this.field3023, 0, this.field3021);
            var5.grabPixels();
        } catch (InterruptedException var6) {
        }
    }
}
