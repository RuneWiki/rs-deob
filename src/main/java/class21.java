import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GPLGZASP")
public class class21 extends class57 {

    @OriginalMember(owner = "client!GPLGZASP", name = "w", descriptor = "Z")
    private boolean field771 = true;

    @OriginalMember(owner = "client!GPLGZASP", name = "x", descriptor = "I")
    private int field772 = 534;

    @OriginalMember(owner = "client!GPLGZASP", name = "y", descriptor = "I")
    private int field773 = -81;

    @OriginalMember(owner = "client!GPLGZASP", name = "z", descriptor = "Z")
    private boolean field774 = false;

    @OriginalMember(owner = "client!GPLGZASP", name = "A", descriptor = "Z")
    private boolean field775 = false;

    @OriginalMember(owner = "client!GPLGZASP", name = "B", descriptor = "Z")
    private boolean field776 = false;

    @OriginalMember(owner = "client!GPLGZASP", name = "C", descriptor = "[I")
    public int[] field777;

    @OriginalMember(owner = "client!GPLGZASP", name = "H", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!GPLGZASP", name = "D", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!GPLGZASP", name = "I", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!GPLGZASP", name = "E", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!GPLGZASP", name = "G", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!GPLGZASP", name = "F", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!GPLGZASP", name = "<init>", descriptor = "(II)V")
    public class21(int arg0, int arg1) {
        this.field777 = new int[arg0 * arg1];
        this.field778 = this.field782 = arg0;
        this.field779 = this.field783 = arg1;
        this.field780 = this.field781 = 0;
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class21(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field778 = var3.getWidth(arg1);
            this.field779 = var3.getHeight(arg1);
            this.field782 = this.field778;
            this.field783 = this.field779;
            this.field780 = 0;
            this.field781 = 0;
            this.field777 = new int[this.field779 * this.field778];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field778, this.field779, this.field777, 0, this.field778);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "<init>", descriptor = "(LAWEEREDT;Ljava/lang/String;I)V")
    public class21(class2 arg0, String arg1, int arg2) {
        class25 var4 = new class25(arg0.method14(arg1 + ".dat", null), 713);
        class25 var5 = new class25(arg0.method14("index.dat", null), 713);
        var5.field837 = var4.method247();
        this.field782 = var5.method247();
        this.field783 = var5.method247();
        int var6 = var5.method245();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method249();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field837 += 2;
            var4.field837 += var5.method247() * var5.method247();
            var5.field837++;
        }
        this.field780 = var5.method245();
        this.field781 = var5.method245();
        this.field778 = var5.method247();
        this.field779 = var5.method247();
        int var10 = var5.method245();
        int var11 = this.field779 * this.field778;
        this.field777 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field777[var12] = var7[var4.method245()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field778; var13++) {
                    for (int var14 = 0; var14 < this.field779; var14++) {
                        this.field777[this.field778 * var14 + var13] = var7[var4.method245()];
                    }
                }
            }
            if (class71.field1729) {
            }
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "c", descriptor = "(I)V")
    public void method215(int arg0) {
        class57.method487(this.field778, this.field779, this.field777, 430);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIII)V")
    public void method216(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 0) {
            return;
        }
        for (int var5 = 0; var5 < this.field777.length; var5++) {
            int var6 = this.field777[var5];
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
                this.field777[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(Z)V")
    public void method217(boolean arg0) {
        int[] var2 = new int[this.field783 * this.field782];
        for (int var3 = 0; var3 < this.field779; var3++) {
            for (int var4 = 0; var4 < this.field778; var4++) {
                var2[(this.field781 + var3) * this.field782 + this.field780 + var4] = this.field777[this.field778 * var3 + var4];
            }
        }
        if (!arg0) {
            return;
        }
        this.field777 = var2;
        this.field778 = this.field782;
        this.field779 = this.field783;
        this.field780 = 0;
        this.field781 = 0;
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IZI)V")
    public void method218(int arg0, boolean arg1, int arg2) {
        int var4 = this.field780 + arg0;
        int var5 = this.field781 + arg2;
        if (arg1) {
            return;
        }
        int var6 = class57.field1530 * var5 + var4;
        int var7 = 0;
        int var8 = this.field779;
        int var9 = this.field778;
        int var10 = class57.field1530 - var9;
        int var11 = 0;
        if (var5 < class57.field1532) {
            int var12 = class57.field1532 - var5;
            var8 -= var12;
            var5 = class57.field1532;
            var7 += var9 * var12;
            var6 += class57.field1530 * var12;
        }
        if (var5 + var8 > class57.field1533) {
            var8 -= var5 + var8 - class57.field1533;
        }
        if (var4 < class57.field1534) {
            int var13 = class57.field1534 - var4;
            var9 -= var13;
            var4 = class57.field1534;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class57.field1535) {
            int var14 = var4 + var9 - class57.field1535;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method219(class57.field1529, var9, var8, 668, var7, this.field777, var10, var11, var6);
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "([IIIII[IIII)V")
    private void method219(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
        int var10 = 15 / arg3;
        int var11 = -(arg1 >> 2);
        int var12 = -(arg1 & 0x3);
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                arg0[arg8++] = arg5[arg4++];
                arg0[arg8++] = arg5[arg4++];
                arg0[arg8++] = arg5[arg4++];
                arg0[arg8++] = arg5[arg4++];
            }
            for (int var15 = var12; var15 < 0; var15++) {
                arg0[arg8++] = arg5[arg4++];
            }
            arg8 += arg6;
            arg4 += arg7;
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(III)V")
    public void method220(int arg0, int arg1, int arg2) {
        if (arg0 != -40219) {
            this.field776 = !this.field776;
        }
        int var4 = this.field780 + arg2;
        int var5 = this.field781 + arg1;
        int var6 = class57.field1530 * var5 + var4;
        int var7 = 0;
        int var8 = this.field779;
        int var9 = this.field778;
        int var10 = class57.field1530 - var9;
        int var11 = 0;
        if (var5 < class57.field1532) {
            int var12 = class57.field1532 - var5;
            var8 -= var12;
            var5 = class57.field1532;
            var7 += var9 * var12;
            var6 += class57.field1530 * var12;
        }
        if (var5 + var8 > class57.field1533) {
            var8 -= var5 + var8 - class57.field1533;
        }
        if (var4 < class57.field1534) {
            int var13 = class57.field1534 - var4;
            var9 -= var13;
            var4 = class57.field1534;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class57.field1535) {
            int var14 = var4 + var9 - class57.field1535;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method221(class57.field1529, this.field777, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method221(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIIZ)V")
    public void method222(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field780 + arg1;
        int var6 = this.field781 + arg0;
        if (arg3) {
            this.field772 = 452;
        }
        int var7 = class57.field1530 * var6 + var5;
        int var8 = 0;
        int var9 = this.field779;
        int var10 = this.field778;
        int var11 = class57.field1530 - var10;
        int var12 = 0;
        if (var6 < class57.field1532) {
            int var13 = class57.field1532 - var6;
            var9 -= var13;
            var6 = class57.field1532;
            var8 += var10 * var13;
            var7 += class57.field1530 * var13;
        }
        if (var6 + var9 > class57.field1533) {
            var9 -= var6 + var9 - class57.field1533;
        }
        if (var5 < class57.field1534) {
            int var14 = class57.field1534 - var5;
            var10 -= var14;
            var5 = class57.field1534;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class57.field1535) {
            int var15 = var5 + var10 - class57.field1535;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method223(var7, arg2, var9, var12, var10, var8, var11, class57.field1529, this.field777, 0, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIIIIII[I[IIB)V")
    private void method223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8, int arg9, byte arg10) {
        int var12 = 256 - arg1;
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var16 = -arg4; var16 < 0; var16++) {
                int var17 = arg8[arg5++];
                if (var17 == 0) {
                    arg0++;
                } else {
                    int var18 = arg7[arg0];
                    arg7[arg0++] = ((var17 & 0xFF00FF) * arg1 + (var18 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var17 & 0xFF00) * arg1 + (var18 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg0 += arg6;
            arg5 += arg3;
        }
        if (arg10 == 1) {
            boolean var14 = false;
        } else {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(III[II[IIIIII)V")
    public void method224(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg1 <= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg6 / 2;
            int var14 = -arg7 / 2;
            int var15 = (int) (Math.sin((double) arg10 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg10 / 326.11D) * 65536.0D);
            int var17 = arg2 * var15 >> 8;
            int var18 = arg2 * var16 >> 8;
            int var19 = (arg8 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg9 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class57.field1530 * arg4 + arg0;
            for (int var22 = 0; var22 < arg7; var22++) {
                int var23 = arg5[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg3[var22]; var27 < 0; var27++) {
                    class57.field1529[var24++] = this.field777[(var25 >> 16) + (var26 >> 16) * this.field778];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class57.field1530;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIIIZIDII)V")
    public void method225(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, double arg6, int arg7, int arg8) {
        if (arg4) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg2 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin(arg6) * 65536.0D);
            int var15 = (int) (Math.cos(arg6) * 65536.0D);
            int var16 = arg0 * var14 >> 8;
            int var17 = arg0 * var15 >> 8;
            int var18 = (arg7 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg1 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class57.field1530 * arg8 + arg5;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg2; var25 < 0; var25++) {
                    int var26 = this.field777[(var23 >> 16) + (var24 >> 16) * this.field778];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class57.field1529[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class57.field1530;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IBILSFVBUBEZ;)V")
    public void method226(int arg0, byte arg1, int arg2, class52 arg3) {
        int var5 = this.field780 + arg0;
        int var6 = this.field781 + arg2;
        int var7 = class57.field1530 * var6 + var5;
        int var8 = 0;
        if (arg1 != 52) {
            return;
        }
        int var9 = this.field779;
        int var10 = this.field778;
        int var11 = class57.field1530 - var10;
        int var12 = 0;
        if (var6 < class57.field1532) {
            int var13 = class57.field1532 - var6;
            var9 -= var13;
            var6 = class57.field1532;
            var8 += var10 * var13;
            var7 += class57.field1530 * var13;
        }
        if (var6 + var9 > class57.field1533) {
            var9 -= var6 + var9 - class57.field1533;
        }
        if (var5 < class57.field1534) {
            int var14 = class57.field1534 - var5;
            var10 -= var14;
            var5 = class57.field1534;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class57.field1535) {
            int var15 = var5 + var10 - class57.field1535;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method227(var10, var8, var7, var12, var11, this.field777, -16955, class57.field1529, var9, arg3.field1449, 0);
        }
    }

    @OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIIII[II[II[BI)V")
    private void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, byte[] arg9, int arg10) {
        if (arg6 != -16955) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = -(arg0 >> 2);
        int var14 = -(arg0 & 0x3);
        for (int var15 = -arg8; var15 < 0; var15++) {
            for (int var16 = var13; var16 < 0; var16++) {
                int var19 = arg5[arg1++];
                if (var19 != 0 && arg9[arg2] == 0) {
                    arg7[arg2++] = var19;
                } else {
                    arg2++;
                }
                int var20 = arg5[arg1++];
                if (var20 != 0 && arg9[arg2] == 0) {
                    arg7[arg2++] = var20;
                } else {
                    arg2++;
                }
                int var21 = arg5[arg1++];
                if (var21 != 0 && arg9[arg2] == 0) {
                    arg7[arg2++] = var21;
                } else {
                    arg2++;
                }
                int var22 = arg5[arg1++];
                if (var22 != 0 && arg9[arg2] == 0) {
                    arg7[arg2++] = var22;
                } else {
                    arg2++;
                }
            }
            for (int var17 = var14; var17 < 0; var17++) {
                int var18 = arg5[arg1++];
                if (var18 != 0 && arg9[arg2] == 0) {
                    arg7[arg2++] = var18;
                } else {
                    arg2++;
                }
            }
            arg2 += arg4;
            arg1 += arg3;
        }
    }
}
