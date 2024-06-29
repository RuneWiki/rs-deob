import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KUDWIDHU")
public class class27 extends class5 {

    @OriginalMember(owner = "client!KUDWIDHU", name = "A", descriptor = "I")
    private int field789 = -1950;

    @OriginalMember(owner = "client!KUDWIDHU", name = "B", descriptor = "I")
    private int field790 = 899;

    @OriginalMember(owner = "client!KUDWIDHU", name = "C", descriptor = "B")
    private byte field791 = 5;

    @OriginalMember(owner = "client!KUDWIDHU", name = "D", descriptor = "I")
    private int field792 = -454;

    @OriginalMember(owner = "client!KUDWIDHU", name = "E", descriptor = "Z")
    private boolean field793 = false;

    @OriginalMember(owner = "client!KUDWIDHU", name = "F", descriptor = "Z")
    private boolean field794 = false;

    @OriginalMember(owner = "client!KUDWIDHU", name = "G", descriptor = "Z")
    private boolean field795 = false;

    @OriginalMember(owner = "client!KUDWIDHU", name = "H", descriptor = "[I")
    public int[] field796;

    @OriginalMember(owner = "client!KUDWIDHU", name = "M", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!KUDWIDHU", name = "I", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!KUDWIDHU", name = "N", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!KUDWIDHU", name = "J", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!KUDWIDHU", name = "L", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!KUDWIDHU", name = "K", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!KUDWIDHU", name = "z", descriptor = "Z")
    private static boolean field788 = true;

    @OriginalMember(owner = "client!KUDWIDHU", name = "<init>", descriptor = "(II)V")
    public class27(int arg0, int arg1) {
        this.field796 = new int[arg0 * arg1];
        this.field797 = this.field801 = arg0;
        this.field798 = this.field802 = arg1;
        this.field799 = this.field800 = 0;
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class27(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field797 = var3.getWidth(arg1);
            this.field798 = var3.getHeight(arg1);
            this.field801 = this.field797;
            this.field802 = this.field798;
            this.field799 = 0;
            this.field800 = 0;
            this.field796 = new int[this.field798 * this.field797];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field797, this.field798, this.field796, 0, this.field797);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "<init>", descriptor = "(LAKPFVPPG;Ljava/lang/String;I)V")
    public class27(class2 arg0, String arg1, int arg2) {
        class13 var4 = new class13(arg0.method7(arg1 + ".dat", null), (byte) 3);
        class13 var5 = new class13(arg0.method7("index.dat", null), (byte) 3);
        var5.field643 = var4.method215();
        this.field801 = var5.method215();
        this.field802 = var5.method215();
        int var6 = var5.method213();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method217();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field643 += 2;
            var4.field643 += var5.method215() * var5.method215();
            var5.field643++;
        }
        this.field799 = var5.method213();
        this.field800 = var5.method213();
        this.field797 = var5.method215();
        this.field798 = var5.method215();
        int var10 = var5.method213();
        int var11 = this.field798 * this.field797;
        this.field796 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field796[var12] = var7[var4.method213()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field797; var13++) {
                for (int var14 = 0; var14 < this.field798; var14++) {
                    this.field796[this.field797 * var14 + var13] = var7[var4.method213()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(I)V")
    public void method313(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class5.method28((byte) -2, this.field796, this.field798, this.field797);
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(ZIII)V")
    public void method314(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            return;
        }
        for (int var5 = 0; var5 < this.field796.length; var5++) {
            int var6 = this.field796[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg3 + var7;
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
                this.field796[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "b", descriptor = "(Z)V")
    public void method315(boolean arg0) {
        int[] var2 = new int[this.field802 * this.field801];
        for (int var3 = 0; var3 < this.field798; var3++) {
            for (int var4 = 0; var4 < this.field797; var4++) {
                var2[(this.field800 + var3) * this.field801 + this.field799 + var4] = this.field796[this.field797 * var3 + var4];
            }
        }
        this.field796 = var2;
        this.field797 = this.field801;
        if (!arg0) {
            this.field789 = 265;
        }
        this.field798 = this.field802;
        this.field799 = 0;
        this.field800 = 0;
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(III)V")
    public void method316(int arg0, int arg1, int arg2) {
        int var4 = this.field799 + arg0;
        int var5 = this.field800 + arg2;
        int var6 = class5.field46 * var5 + var4;
        int var7 = 0;
        int var8 = this.field798;
        int var9 = this.field797;
        int var10 = class5.field46 - var9;
        int var11 = 0;
        if (var5 < class5.field48) {
            int var12 = class5.field48 - var5;
            var8 -= var12;
            var5 = class5.field48;
            var7 += var9 * var12;
            var6 += class5.field46 * var12;
        }
        if (var5 + var8 > class5.field49) {
            var8 -= var5 + var8 - class5.field49;
        }
        if (var4 < class5.field50) {
            int var13 = class5.field50 - var4;
            var9 -= var13;
            var4 = class5.field50;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class5.field51) {
            int var14 = var4 + var9 - class5.field51;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method317(var10, var8, this.field796, var6, class5.field45, var7, (byte) 5, var11, var9);
            if (arg1 != 0) {
                this.field790 = 170;
            }
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(II[II[IIBII)V")
    private void method317(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, byte arg6, int arg7, int arg8) {
        int var10 = -(arg8 >> 2);
        if (this.field791 != arg6) {
            return;
        }
        boolean var11 = false;
        int var12 = -(arg8 & 0x3);
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg4[arg3++] = arg2[arg5++];
                arg4[arg3++] = arg2[arg5++];
                arg4[arg3++] = arg2[arg5++];
                arg4[arg3++] = arg2[arg5++];
            }
            for (int var15 = var12; var15 < 0; var15++) {
                arg4[arg3++] = arg2[arg5++];
            }
            arg3 += arg0;
            arg5 += arg7;
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "b", descriptor = "(III)V")
    public void method318(int arg0, int arg1, int arg2) {
        int var4 = this.field799 + arg1;
        int var5 = this.field800 + arg2;
        int var6 = class5.field46 * var5 + var4;
        int var7 = 0;
        int var8 = this.field798;
        int var9 = this.field797;
        int var10 = class5.field46 - var9;
        int var11 = 0;
        int var12 = 28 / arg0;
        if (var5 < class5.field48) {
            int var13 = class5.field48 - var5;
            var8 -= var13;
            var5 = class5.field48;
            var7 += var9 * var13;
            var6 += class5.field46 * var13;
        }
        if (var5 + var8 > class5.field49) {
            var8 -= var5 + var8 - class5.field49;
        }
        if (var4 < class5.field50) {
            int var14 = class5.field50 - var4;
            var9 -= var14;
            var4 = class5.field50;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (var4 + var9 > class5.field51) {
            int var15 = var4 + var9 - class5.field51;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            this.method319(class5.field45, this.field796, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method319(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(IIII)V")
    public void method320(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field799 + arg3;
        int var6 = this.field800 + arg1;
        int var7 = 47 / arg2;
        int var8 = class5.field46 * var6 + var5;
        int var9 = 0;
        int var10 = this.field798;
        int var11 = this.field797;
        int var12 = class5.field46 - var11;
        int var13 = 0;
        if (var6 < class5.field48) {
            int var14 = class5.field48 - var6;
            var10 -= var14;
            var6 = class5.field48;
            var9 += var11 * var14;
            var8 += class5.field46 * var14;
        }
        if (var6 + var10 > class5.field49) {
            var10 -= var6 + var10 - class5.field49;
        }
        if (var5 < class5.field50) {
            int var15 = class5.field50 - var5;
            var11 -= var15;
            var5 = class5.field50;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class5.field51) {
            int var16 = var5 + var11 - class5.field51;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method321(var12, arg0, var11, var13, 0, var8, class5.field45, -816, this.field796, var9, var10);
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(IIIIII[II[III)V")
    private void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg1;
        while (arg7 >= 0) {
            field788 = !field788;
        }
        for (int var13 = -arg10; var13 < 0; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = arg8[arg9++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    int var16 = arg6[arg5];
                    arg6[arg5++] = ((var15 & 0xFF00FF) * arg1 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg1 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg5 += arg0;
            arg9 += arg3;
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(III[II[IIIIII)V")
    public void method322(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg7 != 39461) {
            this.field795 = !this.field795;
        }
        try {
            int var12 = -arg4 / 2;
            int var13 = -arg0 / 2;
            int var14 = (int) (Math.sin((double) arg1 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg1 / 326.11D) * 65536.0D);
            int var16 = arg2 * var14 >> 8;
            int var17 = arg2 * var15 >> 8;
            int var18 = (arg8 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg9 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class5.field46 * arg6 + arg10;
            for (int var21 = 0; var21 < arg0; var21++) {
                int var22 = arg3[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg5[var21]; var26 < 0; var26++) {
                    class5.field45[var23++] = this.field796[(var24 >> 16) + (var25 >> 16) * this.field797];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class5.field46;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(IIIIDIIII)V")
    public void method323(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 != 0) {
            return;
        }
        try {
            int var11 = -arg0 / 2;
            int var12 = -arg7 / 2;
            int var13 = (int) (Math.sin(arg4) * 65536.0D);
            int var14 = (int) (Math.cos(arg4) * 65536.0D);
            int var15 = arg2 * var13 >> 8;
            int var16 = arg2 * var14 >> 8;
            int var17 = (arg6 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg8 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class5.field46 * arg1 + arg3;
            for (int var20 = 0; var20 < arg7; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg0; var24 < 0; var24++) {
                    int var25 = this.field796[(var22 >> 16) + (var23 >> 16) * this.field797];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class5.field45[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class5.field46;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(LITVAFKCK;III)V")
    public void method324(class22 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field799 + arg3;
        int var6 = this.field800 + arg1;
        int var7 = class5.field46 * var6 + var5;
        int var8 = 0;
        int var9 = this.field798;
        int var10 = this.field797;
        int var11 = class5.field46 - var10;
        int var12 = 0;
        if (arg2 >= 0) {
            return;
        }
        if (var6 < class5.field48) {
            int var13 = class5.field48 - var6;
            var9 -= var13;
            var6 = class5.field48;
            var8 += var10 * var13;
            var7 += class5.field46 * var13;
        }
        if (var6 + var9 > class5.field49) {
            var9 -= var6 + var9 - class5.field49;
        }
        if (var5 < class5.field50) {
            int var14 = class5.field50 - var5;
            var10 -= var14;
            var5 = class5.field50;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class5.field51) {
            int var15 = var5 + var10 - class5.field51;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method325(var12, var8, var10, arg0.field729, class5.field45, var11, var7, this.field796, 197, 0, var9);
        }
    }

    @OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(III[B[III[IIII)V")
    private void method325(int arg0, int arg1, int arg2, byte[] arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg2 >> 2);
        int var13 = -(arg2 & 0x3);
        if (arg8 <= 0) {
            return;
        }
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg7[arg1++];
                if (var18 != 0 && arg3[arg6] == 0) {
                    arg4[arg6++] = var18;
                } else {
                    arg6++;
                }
                int var19 = arg7[arg1++];
                if (var19 != 0 && arg3[arg6] == 0) {
                    arg4[arg6++] = var19;
                } else {
                    arg6++;
                }
                int var20 = arg7[arg1++];
                if (var20 != 0 && arg3[arg6] == 0) {
                    arg4[arg6++] = var20;
                } else {
                    arg6++;
                }
                int var21 = arg7[arg1++];
                if (var21 != 0 && arg3[arg6] == 0) {
                    arg4[arg6++] = var21;
                } else {
                    arg6++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg7[arg1++];
                if (var17 != 0 && arg3[arg6] == 0) {
                    arg4[arg6++] = var17;
                } else {
                    arg6++;
                }
            }
            arg6 += arg5;
            arg1 += arg0;
        }
    }
}
