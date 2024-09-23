import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UFHMHWIH")
public class class55 extends class23 {

    @OriginalMember(owner = "UFHMHWIH", name = "w", descriptor = "Z")
    private boolean field1339 = true;

    @OriginalMember(owner = "UFHMHWIH", name = "x", descriptor = "I")
    private int field1340 = -99;

    @OriginalMember(owner = "UFHMHWIH", name = "y", descriptor = "I")
    private int field1341 = 696;

    @OriginalMember(owner = "UFHMHWIH", name = "z", descriptor = "I")
    private int field1342 = 821;

    @OriginalMember(owner = "UFHMHWIH", name = "A", descriptor = "Z")
    private boolean field1343 = true;

    @OriginalMember(owner = "UFHMHWIH", name = "B", descriptor = "[I")
    public int[] field1344;

    @OriginalMember(owner = "UFHMHWIH", name = "G", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "UFHMHWIH", name = "C", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "UFHMHWIH", name = "H", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "UFHMHWIH", name = "D", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "UFHMHWIH", name = "F", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "UFHMHWIH", name = "E", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "UFHMHWIH", name = "<init>", descriptor = "(II)V")
    public class55(int arg0, int arg1) {
        this.field1344 = new int[arg0 * arg1];
        this.field1345 = this.field1349 = arg0;
        this.field1346 = this.field1350 = arg1;
        this.field1347 = this.field1348 = 0;
    }

    @OriginalMember(owner = "UFHMHWIH", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class55(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1345 = var3.getWidth(arg1);
            this.field1346 = var3.getHeight(arg1);
            this.field1349 = this.field1345;
            this.field1350 = this.field1346;
            this.field1347 = 0;
            this.field1348 = 0;
            this.field1344 = new int[this.field1346 * this.field1345];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1345, this.field1346, this.field1344, 0, this.field1345);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "<init>", descriptor = "(LCXFTMSCH;Ljava/lang/String;I)V")
    public class55(class8 arg0, String arg1, int arg2) {
        class33 var4 = new class33(true, arg0.method176(arg1 + ".dat", null));
        class33 var5 = new class33(true, arg0.method176("index.dat", null));
        var5.field945 = var4.method327();
        this.field1349 = var5.method327();
        this.field1350 = var5.method327();
        int var6 = var5.method325();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method329();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field945 += 2;
            var4.field945 += var5.method327() * var5.method327();
            var5.field945++;
        }
        this.field1347 = var5.method325();
        this.field1348 = var5.method325();
        this.field1345 = var5.method327();
        this.field1346 = var5.method327();
        int var10 = var5.method325();
        int var11 = this.field1346 * this.field1345;
        this.field1344 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1344[var12] = var7[var4.method325()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field1345; var13++) {
                    for (int var14 = 0; var14 < this.field1346; var14++) {
                        this.field1344[this.field1345 * var14 + var13] = var7[var4.method325()];
                    }
                }
            }
            if (class53.field1329) {
            }
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "b", descriptor = "(I)V")
    public void method493(int arg0) {
        class23.method253(this.field1346, this.field1345, true, this.field1344);
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "(IIIB)V")
    public void method494(int arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < this.field1344.length; var5++) {
            int var6 = this.field1344[var5];
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
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1344[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg3 == -65) {
            ;
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "c", descriptor = "(I)V")
    public void method495(int arg0) {
        int[] var2 = new int[this.field1350 * this.field1349];
        for (int var3 = 0; var3 < this.field1346; var3++) {
            for (int var5 = 0; var5 < this.field1345; var5++) {
                var2[(this.field1348 + var3) * this.field1349 + this.field1347 + var5] = this.field1344[this.field1345 * var3 + var5];
            }
        }
        this.field1344 = var2;
        int var4 = 56 / arg0;
        this.field1345 = this.field1349;
        this.field1346 = this.field1350;
        this.field1347 = 0;
        this.field1348 = 0;
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "(IIZ)V")
    public void method496(int arg0, int arg1, boolean arg2) {
        int var4 = this.field1347 + arg1;
        int var5 = this.field1348 + arg0;
        int var6 = class23.field783 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1346;
        int var9 = this.field1345;
        int var10 = class23.field783 - var9;
        int var11 = 0;
        if (!arg2) {
            return;
        }
        if (var5 < class23.field785) {
            int var12 = class23.field785 - var5;
            var8 -= var12;
            var5 = class23.field785;
            var7 += var9 * var12;
            var6 += class23.field783 * var12;
        }
        if (var5 + var8 > class23.field786) {
            var8 -= var5 + var8 - class23.field786;
        }
        if (var4 < class23.field787) {
            int var13 = class23.field787 - var4;
            var9 -= var13;
            var4 = class23.field787;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class23.field788) {
            int var14 = var4 + var9 - class23.field788;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method497(var10, var9, 4, var6, var8, class23.field782, var7, var11, this.field1344);
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "(IIIII[III[I)V")
    private void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg1 >> 2);
        int var11 = -(arg1 & 0x3);
        if (arg2 < 4 || arg2 > 4) {
            return;
        }
        for (int var12 = -arg4; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg5[arg3++] = arg8[arg6++];
                arg5[arg3++] = arg8[arg6++];
                arg5[arg3++] = arg8[arg6++];
                arg5[arg3++] = arg8[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg5[arg3++] = arg8[arg6++];
            }
            arg3 += arg0;
            arg6 += arg7;
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "(III)V")
    public void method498(int arg0, int arg1, int arg2) {
        int var4 = this.field1347 + arg0;
        int var5 = this.field1348 + arg1;
        int var6 = class23.field783 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1346;
        int var9 = this.field1345;
        int var10 = class23.field783 - var9;
        int var11 = 0;
        if (var5 < class23.field785) {
            int var12 = class23.field785 - var5;
            var8 -= var12;
            var5 = class23.field785;
            var7 += var9 * var12;
            var6 += class23.field783 * var12;
        }
        if (var5 + var8 > class23.field786) {
            var8 -= var5 + var8 - class23.field786;
        }
        if (var4 < class23.field787) {
            int var13 = class23.field787 - var4;
            var9 -= var13;
            var4 = class23.field787;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class23.field788) {
            int var14 = var4 + var9 - class23.field788;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method499(class23.field782, this.field1344, 0, var7, var6, var9, var8, var10, var11);
            if (arg2 < 2 || arg2 > 2) {
                ;
            }
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method499(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "(IIII)V")
    public void method500(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1347 + arg2;
        int var6 = this.field1348 + arg3;
        int var7 = class23.field783 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1346;
        int var10 = this.field1345;
        int var11 = class23.field783 - var10;
        int var12 = 0;
        if (arg1 >= 0) {
            return;
        }
        if (var6 < class23.field785) {
            int var13 = class23.field785 - var6;
            var9 -= var13;
            var6 = class23.field785;
            var8 += var10 * var13;
            var7 += class23.field783 * var13;
        }
        if (var6 + var9 > class23.field786) {
            var9 -= var6 + var9 - class23.field786;
        }
        if (var5 < class23.field787) {
            int var14 = class23.field787 - var5;
            var10 -= var14;
            var5 = class23.field787;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class23.field788) {
            int var15 = var5 + var10 - class23.field788;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method501(this.field1344, var9, this.field1340, var10, 0, class23.field782, var11, arg0, var8, var7, var12);
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "([IIIII[IIIIII)V")
    private void method501(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg2 >= 0) {
            return;
        }
        int var12 = 256 - arg7;
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = arg0[arg8++];
                if (var15 == 0) {
                    arg9++;
                } else {
                    int var16 = arg5[arg9];
                    arg5[arg9++] = ((var15 & 0xFF00FF) * arg7 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg7 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg9 += arg6;
            arg8 += arg10;
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "(I[III[IIIIIII)V")
    public void method502(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 72 / arg2;
        try {
            int var13 = -arg5 / 2;
            int var14 = -arg6 / 2;
            int var15 = (int) (Math.sin((double) arg10 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg10 / 326.11D) * 65536.0D);
            int var17 = arg3 * var15 >> 8;
            int var18 = arg3 * var16 >> 8;
            int var19 = (arg0 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg7 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class23.field783 * arg8 + arg9;
            for (int var22 = 0; var22 < arg6; var22++) {
                int var23 = arg4[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg1[var22]; var27 < 0; var27++) {
                    class23.field782[var24++] = this.field1344[(var25 >> 16) + (var26 >> 16) * this.field1345];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class23.field783;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "(IIIIIIDII)V")
    public void method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7, int arg8) {
        if (arg3 != -47907) {
            return;
        }
        try {
            int var11 = -arg4 / 2;
            int var12 = -arg0 / 2;
            int var13 = (int) (Math.sin(arg6) * 65536.0D);
            int var14 = (int) (Math.cos(arg6) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg8 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg2 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class23.field783 * arg5 + arg1;
            for (int var20 = 0; var20 < arg0; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg4; var24 < 0; var24++) {
                    int var25 = this.field1344[(var22 >> 16) + (var23 >> 16) * this.field1345];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class23.field782[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class23.field783;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "(IZLHQETDHHW;I)V")
    public void method504(int arg0, boolean arg1, class20 arg2, int arg3) {
        int var5 = this.field1347 + arg0;
        int var6 = this.field1348 + arg3;
        int var7 = class23.field783 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1346;
        int var10 = this.field1345;
        int var11 = class23.field783 - var10;
        int var12 = 0;
        if (var6 < class23.field785) {
            int var13 = class23.field785 - var6;
            var9 -= var13;
            var6 = class23.field785;
            var8 += var10 * var13;
            var7 += class23.field783 * var13;
        }
        if (var6 + var9 > class23.field786) {
            var9 -= var6 + var9 - class23.field786;
        }
        if (var5 < class23.field787) {
            int var14 = class23.field787 - var5;
            var10 -= var14;
            var5 = class23.field787;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class23.field788) {
            int var15 = var5 + var10 - class23.field788;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method505(-9285, 0, var9, this.field1344, class23.field782, var12, arg2.field746, var7, var10, var11, var8);
            if (arg1) {
                ;
            }
        }
    }

    @OriginalMember(owner = "UFHMHWIH", name = "a", descriptor = "(III[I[II[BIIII)V")
    private void method505(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg8 >> 2);
        int var13 = -(arg8 & 0x3);
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg3[arg10++];
                if (var18 != 0 && arg6[arg7] == 0) {
                    arg4[arg7++] = var18;
                } else {
                    arg7++;
                }
                int var19 = arg3[arg10++];
                if (var19 != 0 && arg6[arg7] == 0) {
                    arg4[arg7++] = var19;
                } else {
                    arg7++;
                }
                int var20 = arg3[arg10++];
                if (var20 != 0 && arg6[arg7] == 0) {
                    arg4[arg7++] = var20;
                } else {
                    arg7++;
                }
                int var21 = arg3[arg10++];
                if (var21 != 0 && arg6[arg7] == 0) {
                    arg4[arg7++] = var21;
                } else {
                    arg7++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg3[arg10++];
                if (var17 != 0 && arg6[arg7] == 0) {
                    arg4[arg7++] = var17;
                } else {
                    arg7++;
                }
            }
            arg7 += arg9;
            arg10 += arg5;
        }
        if (arg0 == -9285) {
            ;
        }
    }
}
