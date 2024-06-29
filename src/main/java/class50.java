import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TFHGRYAS")
public class class50 extends class2 {

    @OriginalMember(owner = "client!TFHGRYAS", name = "y", descriptor = "Z")
    private boolean field1339 = false;

    @OriginalMember(owner = "client!TFHGRYAS", name = "z", descriptor = "Z")
    private boolean field1340 = true;

    @OriginalMember(owner = "client!TFHGRYAS", name = "B", descriptor = "I")
    private int field1342 = -224;

    @OriginalMember(owner = "client!TFHGRYAS", name = "D", descriptor = "Z")
    private boolean field1344 = true;

    @OriginalMember(owner = "client!TFHGRYAS", name = "E", descriptor = "[I")
    public int[] field1345;

    @OriginalMember(owner = "client!TFHGRYAS", name = "J", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!TFHGRYAS", name = "F", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!TFHGRYAS", name = "K", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!TFHGRYAS", name = "G", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!TFHGRYAS", name = "I", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!TFHGRYAS", name = "H", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!TFHGRYAS", name = "A", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!TFHGRYAS", name = "C", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!TFHGRYAS", name = "<init>", descriptor = "(II)V")
    public class50(int arg0, int arg1) {
        this.field1345 = new int[arg0 * arg1];
        this.field1346 = this.field1350 = arg0;
        this.field1347 = this.field1351 = arg1;
        this.field1348 = this.field1349 = 0;
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class50(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1346 = var3.getWidth(arg1);
            this.field1347 = var3.getHeight(arg1);
            this.field1350 = this.field1346;
            this.field1351 = this.field1347;
            this.field1348 = 0;
            this.field1349 = 0;
            this.field1345 = new int[this.field1347 * this.field1346];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1346, this.field1347, this.field1345, 0, this.field1346);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "<init>", descriptor = "(LMAARFNGV;Ljava/lang/String;I)V")
    public class50(class29 arg0, String arg1, int arg2) {
        class14 var4 = new class14(arg0.method332(arg1 + ".dat", null), true);
        class14 var5 = new class14(arg0.method332("index.dat", null), true);
        var5.field707 = var4.method219();
        this.field1350 = var5.method219();
        this.field1351 = var5.method219();
        int var6 = var5.method217();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method221();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field707 += 2;
            var4.field707 += var5.method219() * var5.method219();
            var5.field707++;
        }
        this.field1348 = var5.method217();
        this.field1349 = var5.method217();
        this.field1346 = var5.method219();
        this.field1347 = var5.method219();
        int var10 = var5.method217();
        int var11 = this.field1347 * this.field1346;
        this.field1345 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1345[var12] = var7[var4.method217()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field1346; var13++) {
                    for (int var14 = 0; var14 < this.field1347; var14++) {
                        this.field1345[this.field1346 * var14 + var13] = var7[var4.method217()];
                    }
                }
            }
            if (class34.field1027) {
            }
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "b", descriptor = "(I)V")
    public void method419(int arg0) {
        class2.method12(this.field1346, this.field1347, this.field1345, false);
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIZI)V")
    public void method420(int arg0, int arg1, boolean arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1345.length; var5++) {
            int var6 = this.field1345[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg0 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg3 + var9;
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
                this.field1345[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg2) {
            this.field1343 = -270;
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(B)V")
    public void method421(byte arg0) {
        if (arg0 != 6) {
            return;
        }
        boolean var2 = false;
        int[] var3 = new int[this.field1351 * this.field1350];
        for (int var4 = 0; var4 < this.field1347; var4++) {
            for (int var5 = 0; var5 < this.field1346; var5++) {
                var3[(this.field1349 + var4) * this.field1350 + this.field1348 + var5] = this.field1345[this.field1346 * var4 + var5];
            }
        }
        this.field1345 = var3;
        this.field1346 = this.field1350;
        this.field1347 = this.field1351;
        this.field1348 = 0;
        this.field1349 = 0;
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(III)V")
    public void method422(int arg0, int arg1, int arg2) {
        if (arg0 <= 0) {
            this.field1343 = -153;
        }
        int var4 = this.field1348 + arg1;
        int var5 = this.field1349 + arg2;
        int var6 = class2.field58 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1347;
        int var9 = this.field1346;
        int var10 = class2.field58 - var9;
        int var11 = 0;
        if (var5 < class2.field60) {
            int var12 = class2.field60 - var5;
            var8 -= var12;
            var5 = class2.field60;
            var7 += var9 * var12;
            var6 += class2.field58 * var12;
        }
        if (var5 + var8 > class2.field61) {
            var8 -= var5 + var8 - class2.field61;
        }
        if (var4 < class2.field62) {
            int var13 = class2.field62 - var4;
            var9 -= var13;
            var4 = class2.field62;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class2.field63) {
            int var14 = var4 + var9 - class2.field63;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method423(class2.field57, var9, var7, this.field1345, var8, var10, var11, var6, -18757);
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "([III[IIIIII)V")
    private void method423(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg1 >> 2);
        int var11 = -(arg1 & 0x3);
        if (arg8 != -18757) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg0[arg7++] = arg3[arg2++];
                arg0[arg7++] = arg3[arg2++];
                arg0[arg7++] = arg3[arg2++];
                arg0[arg7++] = arg3[arg2++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg0[arg7++] = arg3[arg2++];
            }
            arg7 += arg5;
            arg2 += arg6;
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "b", descriptor = "(III)V")
    public void method424(int arg0, int arg1, int arg2) {
        int var4 = this.field1348 + arg1;
        int var5 = this.field1349 + arg2;
        int var6 = class2.field58 * var5 + var4;
        int var7 = 0;
        if (arg0 != -24669) {
            this.field1343 = -385;
        }
        int var8 = this.field1347;
        int var9 = this.field1346;
        int var10 = class2.field58 - var9;
        int var11 = 0;
        if (var5 < class2.field60) {
            int var12 = class2.field60 - var5;
            var8 -= var12;
            var5 = class2.field60;
            var7 += var9 * var12;
            var6 += class2.field58 * var12;
        }
        if (var5 + var8 > class2.field61) {
            var8 -= var5 + var8 - class2.field61;
        }
        if (var4 < class2.field62) {
            int var13 = class2.field62 - var4;
            var9 -= var13;
            var4 = class2.field62;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class2.field63) {
            int var14 = var4 + var9 - class2.field63;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method425(class2.field57, this.field1345, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method425(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIBI)V")
    public void method426(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = this.field1348 + arg0;
        int var6 = this.field1349 + arg3;
        int var7 = class2.field58 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1347;
        int var10 = this.field1346;
        int var11 = class2.field58 - var10;
        int var12 = 0;
        if (arg2 != 5) {
            return;
        }
        if (var6 < class2.field60) {
            int var13 = class2.field60 - var6;
            var9 -= var13;
            var6 = class2.field60;
            var8 += var10 * var13;
            var7 += class2.field58 * var13;
        }
        if (var6 + var9 > class2.field61) {
            var9 -= var6 + var9 - class2.field61;
        }
        if (var5 < class2.field62) {
            int var14 = class2.field62 - var5;
            var10 -= var14;
            var5 = class2.field62;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class2.field63) {
            int var15 = var5 + var10 - class2.field63;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method427(var8, 0, var9, arg1, this.field1345, var10, var7, class2.field57, var12, false, var11);
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIII[III[IIZI)V")
    private void method427(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, boolean arg9, int arg10) {
        if (arg9) {
            return;
        }
        int var12 = 256 - arg3;
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = arg4[arg0++];
                if (var15 == 0) {
                    arg6++;
                } else {
                    int var16 = arg7[arg6];
                    arg7[arg6++] = ((var15 & 0xFF00FF) * arg3 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg3 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg6 += arg10;
            arg0 += arg8;
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIII[IIIIBI[I)V")
    public void method428(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int[] arg10) {
        if (arg8 == 7) {
            boolean var12 = false;
        } else {
            this.field1343 = 267;
        }
        try {
            int var13 = -arg3 / 2;
            int var14 = -arg5 / 2;
            int var15 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var17 = arg9 * var15 >> 8;
            int var18 = arg9 * var16 >> 8;
            int var19 = (arg6 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg2 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class2.field58 * arg1 + arg7;
            for (int var22 = 0; var22 < arg5; var22++) {
                int var23 = arg4[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg10[var22]; var27 < 0; var27++) {
                    class2.field57[var24++] = this.field1345[(var25 >> 16) + (var26 >> 16) * this.field1346];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class2.field58;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIIIIIIDI)V")
    public void method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7, int arg8) {
        if (arg2 != 0) {
            this.field1342 = 211;
        }
        try {
            int var11 = -arg3 / 2;
            int var12 = -arg6 / 2;
            int var13 = (int) (Math.sin(arg7) * 65536.0D);
            int var14 = (int) (Math.cos(arg7) * 65536.0D);
            int var15 = arg4 * var13 >> 8;
            int var16 = arg4 * var14 >> 8;
            int var17 = (arg1 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg0 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class2.field58 * arg8 + arg5;
            for (int var20 = 0; var20 < arg6; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg3; var24 < 0; var24++) {
                    int var25 = this.field1345[(var22 >> 16) + (var23 >> 16) * this.field1346];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class2.field57[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class2.field58;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IILCMELCUKG;I)V")
    public void method430(int arg0, int arg1, class8 arg2, int arg3) {
        int var5 = this.field1348 + arg1;
        int var6 = this.field1349 + arg3;
        int var7 = class2.field58 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1347;
        int var10 = this.field1346;
        int var11 = class2.field58 - var10;
        int var12 = 0;
        if (arg0 != 0) {
            this.field1343 = -393;
        }
        if (var6 < class2.field60) {
            int var13 = class2.field60 - var6;
            var9 -= var13;
            var6 = class2.field60;
            var8 += var10 * var13;
            var7 += class2.field58 * var13;
        }
        if (var6 + var9 > class2.field61) {
            var9 -= var6 + var9 - class2.field61;
        }
        if (var5 < class2.field62) {
            int var14 = class2.field62 - var5;
            var10 -= var14;
            var5 = class2.field62;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class2.field63) {
            int var15 = var5 + var10 - class2.field63;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method431(var8, var9, 0, var10, var7, var11, class2.field57, 0, var12, arg2.field645, this.field1345);
        }
    }

    @OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIIIII[III[B[I)V")
    private void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, byte[] arg9, int[] arg10) {
        int var12 = -(arg3 >> 2);
        int var13 = -(arg3 & 0x3);
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg10[arg0++];
                if (var18 != 0 && arg9[arg4] == 0) {
                    arg6[arg4++] = var18;
                } else {
                    arg4++;
                }
                int var19 = arg10[arg0++];
                if (var19 != 0 && arg9[arg4] == 0) {
                    arg6[arg4++] = var19;
                } else {
                    arg4++;
                }
                int var20 = arg10[arg0++];
                if (var20 != 0 && arg9[arg4] == 0) {
                    arg6[arg4++] = var20;
                } else {
                    arg4++;
                }
                int var21 = arg10[arg0++];
                if (var21 != 0 && arg9[arg4] == 0) {
                    arg6[arg4++] = var21;
                } else {
                    arg4++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg10[arg0++];
                if (var17 != 0 && arg9[arg4] == 0) {
                    arg6[arg4++] = var17;
                } else {
                    arg4++;
                }
            }
            arg4 += arg5;
            arg0 += arg8;
        }
        if (arg2 != 0) {
            this.field1341 = 26;
        }
    }
}
