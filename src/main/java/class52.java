import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TTWFVYGB")
public class class52 extends class67 {

    @OriginalMember(owner = "TTWFVYGB", name = "y", descriptor = "I")
    private int field1431 = -47744;

    @OriginalMember(owner = "TTWFVYGB", name = "z", descriptor = "Z")
    private boolean field1432 = false;

    @OriginalMember(owner = "TTWFVYGB", name = "A", descriptor = "Z")
    private boolean field1433 = true;

    @OriginalMember(owner = "TTWFVYGB", name = "B", descriptor = "[I")
    public int[] field1434;

    @OriginalMember(owner = "TTWFVYGB", name = "G", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "TTWFVYGB", name = "C", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "TTWFVYGB", name = "H", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "TTWFVYGB", name = "D", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "TTWFVYGB", name = "F", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "TTWFVYGB", name = "E", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "TTWFVYGB", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        this.field1434 = new int[arg0 * arg1];
        this.field1435 = this.field1439 = arg0;
        this.field1436 = this.field1440 = arg1;
        this.field1437 = this.field1438 = 0;
    }

    @OriginalMember(owner = "TTWFVYGB", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class52(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1435 = var3.getWidth(arg1);
            this.field1436 = var3.getHeight(arg1);
            this.field1439 = this.field1435;
            this.field1440 = this.field1436;
            this.field1437 = 0;
            this.field1438 = 0;
            this.field1434 = new int[this.field1436 * this.field1435];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1435, this.field1436, this.field1434, 0, this.field1435);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "<init>", descriptor = "(LQDHHNYHL;Ljava/lang/String;I)V")
    public class52(class44 arg0, String arg1, int arg2) {
        class42 var4 = new class42(5, arg0.method488(arg1 + ".dat", null));
        class42 var5 = new class42(5, arg0.method488("index.dat", null));
        var5.field1250 = var4.method422();
        this.field1439 = var5.method422();
        this.field1440 = var5.method422();
        int var6 = var5.method420();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method424();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1250 += 2;
            var4.field1250 += var5.method422() * var5.method422();
            var5.field1250++;
        }
        this.field1437 = var5.method420();
        this.field1438 = var5.method420();
        this.field1435 = var5.method422();
        this.field1436 = var5.method422();
        int var10 = var5.method420();
        int var11 = this.field1436 * this.field1435;
        this.field1434 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1434[var12] = var7[var4.method420()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1435; var13++) {
                for (int var14 = 0; var14 < this.field1436; var14++) {
                    this.field1434[this.field1435 * var14 + var13] = var7[var4.method420()];
                }
            }
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "b", descriptor = "(Z)V")
    public void method506(boolean arg0) {
        class67.method576(this.field1434, this.field1436, true, this.field1435);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "(IIIB)V")
    public void method507(int arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < this.field1434.length; var5++) {
            int var7 = this.field1434[var5];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg0 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg2 + var10;
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
                this.field1434[var5] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
        if (arg3 == 0) {
            boolean var6 = false;
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "c", descriptor = "(Z)V")
    public void method508(boolean arg0) {
        int[] var2 = new int[this.field1440 * this.field1439];
        for (int var3 = 0; var3 < this.field1436; var3++) {
            for (int var4 = 0; var4 < this.field1435; var4++) {
                var2[(this.field1438 + var3) * this.field1439 + this.field1437 + var4] = this.field1434[this.field1435 * var3 + var4];
            }
        }
        this.field1434 = var2;
        this.field1435 = this.field1439;
        this.field1436 = this.field1440;
        if (arg0) {
            this.field1433 = !this.field1433;
        }
        this.field1437 = 0;
        this.field1438 = 0;
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "(III)V")
    public void method509(int arg0, int arg1, int arg2) {
        int var4 = 45 / arg1;
        int var5 = this.field1437 + arg0;
        int var6 = this.field1438 + arg2;
        int var7 = class67.field1671 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1436;
        int var10 = this.field1435;
        int var11 = class67.field1671 - var10;
        int var12 = 0;
        if (var6 < class67.field1673) {
            int var13 = class67.field1673 - var6;
            var9 -= var13;
            var6 = class67.field1673;
            var8 += var10 * var13;
            var7 += class67.field1671 * var13;
        }
        if (var6 + var9 > class67.field1674) {
            var9 -= var6 + var9 - class67.field1674;
        }
        if (var5 < class67.field1675) {
            int var14 = class67.field1675 - var5;
            var10 -= var14;
            var5 = class67.field1675;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class67.field1676) {
            int var15 = var5 + var10 - class67.field1676;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method510(var12, var7, var8, class67.field1670, var11, true, var10, var9, this.field1434);
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "(III[IIZII[I)V")
    private void method510(int arg0, int arg1, int arg2, int[] arg3, int arg4, boolean arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        if (!arg5) {
            this.field1431 = -349;
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
            arg1 += arg4;
            arg2 += arg0;
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "(IIZ)V")
    public void method511(int arg0, int arg1, boolean arg2) {
        int var4 = this.field1437 + arg0;
        int var5 = this.field1438 + arg1;
        int var6 = class67.field1671 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1436;
        int var9 = this.field1435;
        int var10 = class67.field1671 - var9;
        int var11 = 0;
        if (arg2) {
            return;
        }
        if (var5 < class67.field1673) {
            int var12 = class67.field1673 - var5;
            var8 -= var12;
            var5 = class67.field1673;
            var7 += var9 * var12;
            var6 += class67.field1671 * var12;
        }
        if (var5 + var8 > class67.field1674) {
            var8 -= var5 + var8 - class67.field1674;
        }
        if (var4 < class67.field1675) {
            int var13 = class67.field1675 - var4;
            var9 -= var13;
            var4 = class67.field1675;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class67.field1676) {
            int var14 = var4 + var9 - class67.field1676;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method512(class67.field1670, this.field1434, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method512(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "TTWFVYGB", name = "b", descriptor = "(IIIB)V")
    public void method513(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field1437 + arg1;
        int var6 = this.field1438 + arg2;
        int var7 = class67.field1671 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1436;
        int var10 = this.field1435;
        int var11 = class67.field1671 - var10;
        int var12 = 0;
        if (var6 < class67.field1673) {
            int var13 = class67.field1673 - var6;
            var9 -= var13;
            var6 = class67.field1673;
            var8 += var10 * var13;
            var7 += class67.field1671 * var13;
        }
        if (var6 + var9 > class67.field1674) {
            var9 -= var6 + var9 - class67.field1674;
        }
        if (var5 < class67.field1675) {
            int var14 = class67.field1675 - var5;
            var10 -= var14;
            var5 = class67.field1675;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class67.field1676) {
            int var15 = var5 + var10 - class67.field1676;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return;
        }
        this.method514(var7, var8, class67.field1670, this.field1434, arg0, var9, var12, var10, var11, 0, 546);
        if (arg3 == 0) {
            boolean var16 = false;
        } else {
            this.field1431 = 247;
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "(II[I[IIIIIIII)V")
    private void method514(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg4;
        int var13 = 8 / arg10;
        for (int var14 = -arg5; var14 < 0; var14++) {
            for (int var15 = -arg7; var15 < 0; var15++) {
                int var16 = arg3[arg1++];
                if (var16 == 0) {
                    arg0++;
                } else {
                    int var17 = arg2[arg0];
                    arg2[arg0++] = ((var16 & 0xFF00FF) * arg4 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg4 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg0 += arg8;
            arg1 += arg6;
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "(II[IIIIII[III)V")
    public void method515(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg7 >= 0) {
            return;
        }
        try {
            int var12 = -arg9 / 2;
            int var13 = -arg5 / 2;
            int var14 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var16 = arg6 * var14 >> 8;
            int var17 = arg6 * var15 >> 8;
            int var18 = (arg3 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg1 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class67.field1671 * arg10 + arg4;
            for (int var21 = 0; var21 < arg5; var21++) {
                int var22 = arg2[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg8[var21]; var26 < 0; var26++) {
                    class67.field1670[var23++] = this.field1434[(var24 >> 16) + (var25 >> 16) * this.field1435];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class67.field1671;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "(IIIIDIZII)V")
    public void method516(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (!arg6) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg7 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin(arg4) * 65536.0D);
            int var15 = (int) (Math.cos(arg4) * 65536.0D);
            int var16 = arg1 * var14 >> 8;
            int var17 = arg1 * var15 >> 8;
            int var18 = (arg2 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg0 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class67.field1671 * arg8 + arg5;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg7; var25 < 0; var25++) {
                    int var26 = this.field1434[(var23 >> 16) + (var24 >> 16) * this.field1435];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class67.field1670[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class67.field1671;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "(IIILKWBPZBYX;)V")
    public void method517(int arg0, int arg1, int arg2, class30 arg3) {
        int var5 = this.field1437 + arg1;
        int var6 = this.field1438 + arg0;
        if (arg2 <= 0) {
            return;
        }
        int var7 = class67.field1671 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1436;
        int var10 = this.field1435;
        int var11 = class67.field1671 - var10;
        int var12 = 0;
        if (var6 < class67.field1673) {
            int var13 = class67.field1673 - var6;
            var9 -= var13;
            var6 = class67.field1673;
            var8 += var10 * var13;
            var7 += class67.field1671 * var13;
        }
        if (var6 + var9 > class67.field1674) {
            var9 -= var6 + var9 - class67.field1674;
        }
        if (var5 < class67.field1675) {
            int var14 = class67.field1675 - var5;
            var10 -= var14;
            var5 = class67.field1675;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class67.field1676) {
            int var15 = var5 + var10 - class67.field1676;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method518(0, var9, var8, class67.field1670, var7, var10, arg3.field1037, this.field1434, 2, var11, var12);
        }
    }

    @OriginalMember(owner = "TTWFVYGB", name = "a", descriptor = "(III[III[B[IIII)V")
    private void method518(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg5 >> 2);
        int var13 = -(arg5 & 0x3);
        if (arg8 != 2) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        for (int var15 = -arg1; var15 < 0; var15++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg7[arg2++];
                if (var19 != 0 && arg6[arg4] == 0) {
                    arg3[arg4++] = var19;
                } else {
                    arg4++;
                }
                int var20 = arg7[arg2++];
                if (var20 != 0 && arg6[arg4] == 0) {
                    arg3[arg4++] = var20;
                } else {
                    arg4++;
                }
                int var21 = arg7[arg2++];
                if (var21 != 0 && arg6[arg4] == 0) {
                    arg3[arg4++] = var21;
                } else {
                    arg4++;
                }
                int var22 = arg7[arg2++];
                if (var22 != 0 && arg6[arg4] == 0) {
                    arg3[arg4++] = var22;
                } else {
                    arg4++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg7[arg2++];
                if (var18 != 0 && arg6[arg4] == 0) {
                    arg3[arg4++] = var18;
                } else {
                    arg4++;
                }
            }
            arg4 += arg9;
            arg2 += arg10;
        }
    }
}
