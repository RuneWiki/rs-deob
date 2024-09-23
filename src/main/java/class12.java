import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EYTQJNEM")
public class class12 extends class1 {

    @OriginalMember(owner = "EYTQJNEM", name = "D", descriptor = "Z")
    private boolean field629 = true;

    @OriginalMember(owner = "EYTQJNEM", name = "E", descriptor = "B")
    private byte field630 = 21;

    @OriginalMember(owner = "EYTQJNEM", name = "F", descriptor = "Z")
    private boolean field631 = false;

    @OriginalMember(owner = "EYTQJNEM", name = "G", descriptor = "Z")
    private boolean field632 = true;

    @OriginalMember(owner = "EYTQJNEM", name = "H", descriptor = "[I")
    public int[] field633;

    @OriginalMember(owner = "EYTQJNEM", name = "M", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "EYTQJNEM", name = "I", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "EYTQJNEM", name = "N", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "EYTQJNEM", name = "J", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "EYTQJNEM", name = "L", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "EYTQJNEM", name = "K", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "EYTQJNEM", name = "C", descriptor = "I")
    private static int field628 = 8;

    @OriginalMember(owner = "EYTQJNEM", name = "<init>", descriptor = "(II)V")
    public class12(int arg0, int arg1) {
        this.field633 = new int[arg0 * arg1];
        this.field634 = this.field638 = arg0;
        this.field635 = this.field639 = arg1;
        this.field636 = this.field637 = 0;
    }

    @OriginalMember(owner = "EYTQJNEM", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class12(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field634 = var3.getWidth(arg1);
            this.field635 = var3.getHeight(arg1);
            this.field638 = this.field634;
            this.field639 = this.field635;
            this.field636 = 0;
            this.field637 = 0;
            this.field633 = new int[this.field635 * this.field634];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field634, this.field635, this.field633, 0, this.field634);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "<init>", descriptor = "(LFIGUVTWB;Ljava/lang/String;I)V")
    public class12(class15 arg0, String arg1, int arg2) {
        class33 var4 = new class33(field628, arg0.method209(arg1 + ".dat", null));
        class33 var5 = new class33(field628, arg0.method209("index.dat", null));
        var5.field954 = var4.method294();
        this.field638 = var5.method294();
        this.field639 = var5.method294();
        int var6 = var5.method292();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method296();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field954 += 2;
            var4.field954 += var5.method294() * var5.method294();
            var5.field954++;
        }
        this.field636 = var5.method292();
        this.field637 = var5.method292();
        this.field634 = var5.method294();
        this.field635 = var5.method294();
        int var10 = var5.method292();
        int var11 = this.field635 * this.field634;
        this.field633 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field633[var12] = var7[var4.method292()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field634; var13++) {
                    for (int var14 = 0; var14 < this.field635; var14++) {
                        this.field633[this.field634 * var14 + var13] = var7[var4.method292()];
                    }
                }
            }
            if (class37.field1083) {
            }
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "b", descriptor = "(B)V")
    public void method188(byte arg0) {
        class1.method1(this.field635, this.field633, 7, this.field634);
        if (arg0 != -36) {
            field628 = 148;
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "(IIZI)V")
    public void method189(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field633.length; var6++) {
            int var7 = this.field633[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg0 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg3 + var10;
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
                this.field633[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "b", descriptor = "(I)V")
    public void method190(int arg0) {
        int[] var2 = new int[this.field639 * this.field638];
        if (arg0 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < this.field635; var3++) {
            for (int var4 = 0; var4 < this.field634; var4++) {
                var2[(this.field637 + var3) * this.field638 + this.field636 + var4] = this.field633[this.field634 * var3 + var4];
            }
        }
        this.field633 = var2;
        this.field634 = this.field638;
        this.field635 = this.field639;
        this.field636 = 0;
        this.field637 = 0;
    }

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "(III)V")
    public void method191(int arg0, int arg1, int arg2) {
        int var4 = this.field636 + arg2;
        int var5 = this.field637 + arg1;
        int var6 = class1.field10 * var5 + var4;
        int var7 = 0;
        int var8 = this.field635;
        int var9 = this.field634;
        int var10 = class1.field10 - var9;
        int var11 = 0;
        while (arg0 >= 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        if (var5 < class1.field12) {
            int var12 = class1.field12 - var5;
            var8 -= var12;
            var5 = class1.field12;
            var7 += var9 * var12;
            var6 += class1.field10 * var12;
        }
        if (var5 + var8 > class1.field13) {
            var8 -= var5 + var8 - class1.field13;
        }
        if (var4 < class1.field14) {
            int var13 = class1.field14 - var4;
            var9 -= var13;
            var4 = class1.field14;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class1.field15) {
            int var14 = var4 + var9 - class1.field15;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method192(var6, this.field633, class1.field9, 0, var10, var8, var7, var9, var11);
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "(I[I[IIIIIII)V")
    private void method192(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg7 >> 2);
        if (arg3 != 0) {
            return;
        }
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg5; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg2[arg0++] = arg1[arg6++];
                arg2[arg0++] = arg1[arg6++];
                arg2[arg0++] = arg1[arg6++];
                arg2[arg0++] = arg1[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg2[arg0++] = arg1[arg6++];
            }
            arg0 += arg4;
            arg6 += arg8;
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "b", descriptor = "(III)V")
    public void method193(int arg0, int arg1, int arg2) {
        int var4 = this.field636 + arg0;
        int var5 = this.field637 + arg2;
        int var6 = class1.field10 * var5 + var4;
        int var7 = 0;
        int var8 = this.field635;
        int var9 = this.field634;
        int var10 = class1.field10 - var9;
        int var11 = 0;
        if (var5 < class1.field12) {
            int var12 = class1.field12 - var5;
            var8 -= var12;
            var5 = class1.field12;
            var7 += var9 * var12;
            var6 += class1.field10 * var12;
        }
        if (var5 + var8 > class1.field13) {
            var8 -= var5 + var8 - class1.field13;
        }
        if (var4 < class1.field14) {
            int var13 = class1.field14 - var4;
            var9 -= var13;
            var4 = class1.field14;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class1.field15) {
            int var14 = var4 + var9 - class1.field15;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method194(class1.field9, this.field633, 0, var7, var6, var9, var8, var10, var11);
            int var15 = 0 / arg1;
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method194(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "(IIII)V")
    public void method195(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 82 / arg2;
        int var6 = this.field636 + arg0;
        int var7 = this.field637 + arg1;
        int var8 = class1.field10 * var7 + var6;
        int var9 = 0;
        int var10 = this.field635;
        int var11 = this.field634;
        int var12 = class1.field10 - var11;
        int var13 = 0;
        if (var7 < class1.field12) {
            int var14 = class1.field12 - var7;
            var10 -= var14;
            var7 = class1.field12;
            var9 += var11 * var14;
            var8 += class1.field10 * var14;
        }
        if (var7 + var10 > class1.field13) {
            var10 -= var7 + var10 - class1.field13;
        }
        if (var6 < class1.field14) {
            int var15 = class1.field14 - var6;
            var11 -= var15;
            var6 = class1.field14;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class1.field15) {
            int var16 = var6 + var11 - class1.field15;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method196(arg3, class1.field9, 0, var8, var12, this.field633, (byte) 21, var10, var9, var11, var13);
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "(I[IIII[IBIIII)V")
    private void method196(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg0;
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = -arg9; var14 < 0; var14++) {
                int var15 = arg5[arg8++];
                if (var15 == 0) {
                    arg3++;
                } else {
                    int var16 = arg1[arg3];
                    arg1[arg3++] = ((var15 & 0xFF00FF) * arg0 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg0 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg3 += arg4;
            arg8 += arg10;
        }
        if (this.field630 == arg6) {
            ;
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "(I[III[IIIIIII)V")
    public void method197(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 != 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg3 / 2;
            int var14 = -arg10 / 2;
            int var15 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var17 = arg7 * var15 >> 8;
            int var18 = arg7 * var16 >> 8;
            int var19 = (arg8 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg5 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class1.field10 * arg2 + arg6;
            for (int var22 = 0; var22 < arg10; var22++) {
                int var23 = arg1[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg4[var22]; var27 < 0; var27++) {
                    class1.field9[var24++] = this.field633[(var25 >> 16) + (var26 >> 16) * this.field634];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class1.field10;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "(IIIDIIIII)V")
    public void method198(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 6) {
            return;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg8 / 2;
            int var13 = (int) (Math.sin(arg3) * 65536.0D);
            int var14 = (int) (Math.cos(arg3) * 65536.0D);
            int var15 = arg1 * var13 >> 8;
            int var16 = arg1 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg2 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class1.field10 * arg5 + arg0;
            for (int var20 = 0; var20 < arg8; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg7; var24 < 0; var24++) {
                    int var25 = this.field633[(var22 >> 16) + (var23 >> 16) * this.field634];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class1.field9[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class1.field10;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "(ILTOROBAKX;II)V")
    public void method199(int arg0, class59 arg1, int arg2, int arg3) {
        int var5 = 21 / arg0;
        int var6 = this.field636 + arg2;
        int var7 = this.field637 + arg3;
        int var8 = class1.field10 * var7 + var6;
        int var9 = 0;
        int var10 = this.field635;
        int var11 = this.field634;
        int var12 = class1.field10 - var11;
        int var13 = 0;
        if (var7 < class1.field12) {
            int var14 = class1.field12 - var7;
            var10 -= var14;
            var7 = class1.field12;
            var9 += var11 * var14;
            var8 += class1.field10 * var14;
        }
        if (var7 + var10 > class1.field13) {
            var10 -= var7 + var10 - class1.field13;
        }
        if (var6 < class1.field14) {
            int var15 = class1.field14 - var6;
            var11 -= var15;
            var6 = class1.field14;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class1.field15) {
            int var16 = var6 + var11 - class1.field15;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method200(var11, this.field633, 0, class1.field9, var9, var8, var12, true, var10, var13, arg1.field1474);
        }
    }

    @OriginalMember(owner = "EYTQJNEM", name = "a", descriptor = "(I[II[IIIIZII[B)V")
    private void method200(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, byte[] arg10) {
        int var12 = -(arg0 >> 2);
        int var13 = -(arg0 & 0x3);
        if (!arg7) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        for (int var15 = -arg8; var15 < 0; var15++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg1[arg4++];
                if (var19 != 0 && arg10[arg5] == 0) {
                    arg3[arg5++] = var19;
                } else {
                    arg5++;
                }
                int var20 = arg1[arg4++];
                if (var20 != 0 && arg10[arg5] == 0) {
                    arg3[arg5++] = var20;
                } else {
                    arg5++;
                }
                int var21 = arg1[arg4++];
                if (var21 != 0 && arg10[arg5] == 0) {
                    arg3[arg5++] = var21;
                } else {
                    arg5++;
                }
                int var22 = arg1[arg4++];
                if (var22 != 0 && arg10[arg5] == 0) {
                    arg3[arg5++] = var22;
                } else {
                    arg5++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg1[arg4++];
                if (var18 != 0 && arg10[arg5] == 0) {
                    arg3[arg5++] = var18;
                } else {
                    arg5++;
                }
            }
            arg5 += arg6;
            arg4 += arg9;
        }
    }
}
