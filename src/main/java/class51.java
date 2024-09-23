import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SWNASVGQ")
public class class51 extends class56 {

    @OriginalMember(owner = "SWNASVGQ", name = "y", descriptor = "I")
    private int field1430 = 1;

    @OriginalMember(owner = "SWNASVGQ", name = "z", descriptor = "I")
    private int field1431 = -770;

    @OriginalMember(owner = "SWNASVGQ", name = "A", descriptor = "Z")
    private boolean field1432 = true;

    @OriginalMember(owner = "SWNASVGQ", name = "B", descriptor = "Z")
    private boolean field1433 = true;

    @OriginalMember(owner = "SWNASVGQ", name = "C", descriptor = "Z")
    private boolean field1434 = false;

    @OriginalMember(owner = "SWNASVGQ", name = "D", descriptor = "I")
    private int field1435 = -29;

    @OriginalMember(owner = "SWNASVGQ", name = "E", descriptor = "[I")
    public int[] field1436;

    @OriginalMember(owner = "SWNASVGQ", name = "J", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "SWNASVGQ", name = "F", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "SWNASVGQ", name = "K", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "SWNASVGQ", name = "G", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "SWNASVGQ", name = "I", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "SWNASVGQ", name = "H", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "SWNASVGQ", name = "<init>", descriptor = "(II)V")
    public class51(int arg0, int arg1) {
        this.field1436 = new int[arg0 * arg1];
        this.field1437 = this.field1441 = arg0;
        this.field1438 = this.field1442 = arg1;
        this.field1439 = this.field1440 = 0;
    }

    @OriginalMember(owner = "SWNASVGQ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class51(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1437 = var3.getWidth(arg1);
            this.field1438 = var3.getHeight(arg1);
            this.field1441 = this.field1437;
            this.field1442 = this.field1438;
            this.field1439 = 0;
            this.field1440 = 0;
            this.field1436 = new int[this.field1438 * this.field1437];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1437, this.field1438, this.field1436, 0, this.field1437);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "<init>", descriptor = "(LGWOEELWB;Ljava/lang/String;I)V")
    public class51(class18 arg0, String arg1, int arg2) {
        class30 var4 = new class30(true, arg0.method249(arg1 + ".dat", null));
        class30 var5 = new class30(true, arg0.method249("index.dat", null));
        var5.field1092 = var4.method298();
        this.field1441 = var5.method298();
        this.field1442 = var5.method298();
        int var6 = var5.method296();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method300();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1092 += 2;
            var4.field1092 += var5.method298() * var5.method298();
            var5.field1092++;
        }
        this.field1439 = var5.method296();
        this.field1440 = var5.method296();
        this.field1437 = var5.method298();
        this.field1438 = var5.method298();
        int var10 = var5.method296();
        int var11 = this.field1438 * this.field1437;
        this.field1436 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1436[var12] = var7[var4.method296()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1437; var13++) {
                for (int var14 = 0; var14 < this.field1438; var14++) {
                    this.field1436[this.field1437 * var14 + var13] = var7[var4.method296()];
                }
            }
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "b", descriptor = "(I)V")
    public void method469(int arg0) {
        class56.method541(this.field1437, this.field1436, (byte) 0, this.field1438);
        if (arg0 != 0) {
            this.field1435 = 320;
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "(IIII)V")
    public void method470(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 40 / arg1;
        for (int var6 = 0; var6 < this.field1436.length; var6++) {
            int var7 = this.field1436[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg3 + var8;
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
                int var13 = arg0 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field1436[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "c", descriptor = "(I)V")
    public void method471(int arg0) {
        int[] var2 = new int[this.field1442 * this.field1441];
        for (int var3 = 0; var3 < this.field1438; var3++) {
            for (int var5 = 0; var5 < this.field1437; var5++) {
                var2[(this.field1440 + var3) * this.field1441 + this.field1439 + var5] = this.field1436[this.field1437 * var3 + var5];
            }
        }
        this.field1436 = var2;
        this.field1437 = this.field1441;
        this.field1438 = this.field1442;
        if (arg0 < 9 || arg0 > 9) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1439 = 0;
        this.field1440 = 0;
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "(IIZ)V")
    public void method472(int arg0, int arg1, boolean arg2) {
        int var4 = this.field1439 + arg0;
        int var5 = this.field1440 + arg1;
        int var6 = class56.field1556 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1438;
        int var9 = this.field1437;
        int var10 = class56.field1556 - var9;
        int var11 = 0;
        if (var5 < class56.field1558) {
            int var12 = class56.field1558 - var5;
            var8 -= var12;
            var5 = class56.field1558;
            var7 += var9 * var12;
            var6 += class56.field1556 * var12;
        }
        if (var5 + var8 > class56.field1559) {
            var8 -= var5 + var8 - class56.field1559;
        }
        if (var4 < class56.field1560) {
            int var13 = class56.field1560 - var4;
            var9 -= var13;
            var4 = class56.field1560;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class56.field1561) {
            int var14 = var4 + var9 - class56.field1561;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method473(var9, class56.field1555, var6, var10, this.field1436, var7, 58, var8, var11);
            if (arg2) {
                ;
            }
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "(I[III[IIIII)V")
    private void method473(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg0 >> 2);
        int var11 = 10 / arg6;
        int var12 = -(arg0 & 0x3);
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg1[arg2++] = arg4[arg5++];
                arg1[arg2++] = arg4[arg5++];
                arg1[arg2++] = arg4[arg5++];
                arg1[arg2++] = arg4[arg5++];
            }
            for (int var15 = var12; var15 < 0; var15++) {
                arg1[arg2++] = arg4[arg5++];
            }
            arg2 += arg3;
            arg5 += arg8;
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "(IIB)V")
    public void method474(int arg0, int arg1, byte arg2) {
        int var4 = this.field1439 + arg0;
        int var5 = this.field1440 + arg1;
        int var6 = class56.field1556 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1438;
        int var9 = this.field1437;
        int var10 = class56.field1556 - var9;
        int var11 = 0;
        if (var5 < class56.field1558) {
            int var12 = class56.field1558 - var5;
            var8 -= var12;
            var5 = class56.field1558;
            var7 += var9 * var12;
            var6 += class56.field1556 * var12;
        }
        if (var5 + var8 > class56.field1559) {
            var8 -= var5 + var8 - class56.field1559;
        }
        if (var4 < class56.field1560) {
            int var13 = class56.field1560 - var4;
            var9 -= var13;
            var4 = class56.field1560;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class56.field1561) {
            int var14 = var4 + var9 - class56.field1561;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method475(class56.field1555, this.field1436, 0, var7, var6, var9, var8, var10, var11);
            if (arg2 == 2) {
                boolean var15 = false;
            }
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method475(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "SWNASVGQ", name = "b", descriptor = "(IIII)V")
    public void method476(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1439 + arg0;
        int var6 = this.field1440 + arg1;
        int var7 = class56.field1556 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1438;
        int var10 = this.field1437;
        int var11 = class56.field1556 - var10;
        int var12 = 0;
        while (arg3 >= 0) {
            this.field1434 = !this.field1434;
        }
        if (var6 < class56.field1558) {
            int var13 = class56.field1558 - var6;
            var9 -= var13;
            var6 = class56.field1558;
            var8 += var10 * var13;
            var7 += class56.field1556 * var13;
        }
        if (var6 + var9 > class56.field1559) {
            var9 -= var6 + var9 - class56.field1559;
        }
        if (var5 < class56.field1560) {
            int var14 = class56.field1560 - var5;
            var10 -= var14;
            var5 = class56.field1560;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class56.field1561) {
            int var15 = var5 + var10 - class56.field1561;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method477(class56.field1555, arg2, var8, var7, true, 0, var9, this.field1436, var10, var11, var12);
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "([IIIIZII[IIII)V")
    private void method477(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg1;
        if (!arg4) {
            return;
        }
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg8; var14 < 0; var14++) {
                int var15 = arg7[arg2++];
                if (var15 == 0) {
                    arg3++;
                } else {
                    int var16 = arg0[arg3];
                    arg0[arg3++] = ((var15 & 0xFF00FF) * arg1 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg1 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg3 += arg9;
            arg2 += arg10;
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "([I[IIIIIIIIII)V")
    public void method478(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg6 != 0) {
            this.field1432 = !this.field1432;
        }
        try {
            int var12 = -arg8 / 2;
            int var13 = -arg10 / 2;
            int var14 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var16 = arg3 * var14 >> 8;
            int var17 = arg3 * var15 >> 8;
            int var18 = (arg5 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg7 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class56.field1556 * arg2 + arg4;
            for (int var21 = 0; var21 < arg10; var21++) {
                int var22 = arg0[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg1[var21]; var26 < 0; var26++) {
                    class56.field1555[var23++] = this.field1436[(var24 >> 16) + (var25 >> 16) * this.field1437];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class56.field1556;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "(IIDBIIIII)V")
    public void method479(int arg0, int arg1, double arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 8) {
            return;
        }
        boolean var11 = false;
        try {
            int var12 = -arg4 / 2;
            int var13 = -arg1 / 2;
            int var14 = (int) (Math.sin(arg2) * 65536.0D);
            int var15 = (int) (Math.cos(arg2) * 65536.0D);
            int var16 = arg6 * var14 >> 8;
            int var17 = arg6 * var15 >> 8;
            int var18 = (arg7 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg5 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class56.field1556 * arg8 + arg0;
            for (int var21 = 0; var21 < arg1; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg4; var25 < 0; var25++) {
                    int var26 = this.field1436[(var23 >> 16) + (var24 >> 16) * this.field1437];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class56.field1555[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class56.field1556;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "(IIILNUXLZYAZ;)V")
    public void method480(int arg0, int arg1, int arg2, class33 arg3) {
        int var5 = this.field1439 + arg2;
        int var6 = this.field1440 + arg1;
        int var7 = class56.field1556 * var6 + var5;
        int var8 = 0;
        if (arg0 >= 0) {
            this.field1432 = !this.field1432;
        }
        int var9 = this.field1438;
        int var10 = this.field1437;
        int var11 = class56.field1556 - var10;
        int var12 = 0;
        if (var6 < class56.field1558) {
            int var13 = class56.field1558 - var6;
            var9 -= var13;
            var6 = class56.field1558;
            var8 += var10 * var13;
            var7 += class56.field1556 * var13;
        }
        if (var6 + var9 > class56.field1559) {
            var9 -= var6 + var9 - class56.field1559;
        }
        if (var5 < class56.field1560) {
            int var14 = class56.field1560 - var5;
            var10 -= var14;
            var5 = class56.field1560;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class56.field1561) {
            int var15 = var5 + var10 - class56.field1561;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method481(var9, var10, 4, class56.field1555, var11, arg3.field1125, this.field1436, 0, var7, var12, var8);
        }
    }

    @OriginalMember(owner = "SWNASVGQ", name = "a", descriptor = "(III[II[B[IIIII)V")
    private void method481(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg2 != 4) {
            return;
        }
        int var12 = -(arg1 >> 2);
        int var13 = -(arg1 & 0x3);
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg6[arg10++];
                if (var18 != 0 && arg5[arg8] == 0) {
                    arg3[arg8++] = var18;
                } else {
                    arg8++;
                }
                int var19 = arg6[arg10++];
                if (var19 != 0 && arg5[arg8] == 0) {
                    arg3[arg8++] = var19;
                } else {
                    arg8++;
                }
                int var20 = arg6[arg10++];
                if (var20 != 0 && arg5[arg8] == 0) {
                    arg3[arg8++] = var20;
                } else {
                    arg8++;
                }
                int var21 = arg6[arg10++];
                if (var21 != 0 && arg5[arg8] == 0) {
                    arg3[arg8++] = var21;
                } else {
                    arg8++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg6[arg10++];
                if (var17 != 0 && arg5[arg8] == 0) {
                    arg3[arg8++] = var17;
                } else {
                    arg8++;
                }
            }
            arg8 += arg4;
            arg10 += arg9;
        }
    }
}
