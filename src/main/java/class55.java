import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PDMJJHOP")
public class class55 extends class24 {

    @OriginalMember(owner = "PDMJJHOP", name = "x", descriptor = "Z")
    private boolean field1302 = true;

    @OriginalMember(owner = "PDMJJHOP", name = "y", descriptor = "I")
    private int field1303 = 936;

    @OriginalMember(owner = "PDMJJHOP", name = "z", descriptor = "I")
    private int field1304 = 3;

    @OriginalMember(owner = "PDMJJHOP", name = "A", descriptor = "I")
    private int field1305 = -46326;

    @OriginalMember(owner = "PDMJJHOP", name = "B", descriptor = "I")
    private int field1306 = -34;

    @OriginalMember(owner = "PDMJJHOP", name = "C", descriptor = "[I")
    public int[] field1307;

    @OriginalMember(owner = "PDMJJHOP", name = "H", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "PDMJJHOP", name = "D", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "PDMJJHOP", name = "I", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "PDMJJHOP", name = "E", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "PDMJJHOP", name = "G", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "PDMJJHOP", name = "F", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "PDMJJHOP", name = "<init>", descriptor = "(II)V")
    public class55(int arg0, int arg1) {
        this.field1307 = new int[arg0 * arg1];
        this.field1308 = this.field1312 = arg0;
        this.field1309 = this.field1313 = arg1;
        this.field1310 = this.field1311 = 0;
    }

    @OriginalMember(owner = "PDMJJHOP", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class55(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1308 = var3.getWidth(arg1);
            this.field1309 = var3.getHeight(arg1);
            this.field1312 = this.field1308;
            this.field1313 = this.field1309;
            this.field1310 = 0;
            this.field1311 = 0;
            this.field1307 = new int[this.field1309 * this.field1308];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1308, this.field1309, this.field1307, 0, this.field1308);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "<init>", descriptor = "(LMJLXHQTQ;Ljava/lang/String;I)V")
    public class55(class44 arg0, String arg1, int arg2) {
        class69 var4 = new class69(arg0.method317(arg1 + ".dat", null), -82);
        class69 var5 = new class69(arg0.method317("index.dat", null), -82);
        var5.field1652 = var4.method467();
        this.field1312 = var5.method467();
        this.field1313 = var5.method467();
        int var6 = var5.method465();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method469();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1652 += 2;
            var4.field1652 += var5.method467() * var5.method467();
            var5.field1652++;
        }
        this.field1310 = var5.method465();
        this.field1311 = var5.method465();
        this.field1308 = var5.method467();
        this.field1309 = var5.method467();
        int var10 = var5.method465();
        int var11 = this.field1309 * this.field1308;
        this.field1307 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1307[var12] = var7[var4.method465()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1308; var13++) {
                for (int var14 = 0; var14 < this.field1309; var14++) {
                    this.field1307[this.field1308 * var14 + var13] = var7[var4.method465()];
                }
            }
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "b", descriptor = "(I)V")
    public void method335(int arg0) {
        if (arg0 == 2) {
            class24.method240(this.field1307, (byte) 4, this.field1308, this.field1309);
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "(IZII)V")
    public void method336(int arg0, boolean arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1307.length; var5++) {
            int var6 = this.field1307[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg2 + var7;
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
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1307[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (!arg1) {
            this.field1306 = 139;
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "c", descriptor = "(I)V")
    public void method337(int arg0) {
        int[] var2 = new int[this.field1313 * this.field1312];
        for (int var3 = 0; var3 < this.field1309; var3++) {
            for (int var5 = 0; var5 < this.field1308; var5++) {
                var2[(this.field1311 + var3) * this.field1312 + this.field1310 + var5] = this.field1307[this.field1308 * var3 + var5];
            }
        }
        this.field1307 = var2;
        this.field1308 = this.field1312;
        if (arg0 != 18860) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1309 = this.field1313;
        this.field1310 = 0;
        this.field1311 = 0;
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "(III)V")
    public void method338(int arg0, int arg1, int arg2) {
        int var4 = this.field1310 + arg1;
        int var5 = this.field1311 + arg0;
        int var6 = class24.field898 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1309;
        int var9 = this.field1308;
        int var10 = class24.field898 - var9;
        int var11 = 0;
        if (arg2 <= 0) {
            this.field1302 = !this.field1302;
        }
        if (var5 < class24.field900) {
            int var12 = class24.field900 - var5;
            var8 -= var12;
            var5 = class24.field900;
            var7 += var9 * var12;
            var6 += class24.field898 * var12;
        }
        if (var5 + var8 > class24.field901) {
            var8 -= var5 + var8 - class24.field901;
        }
        if (var4 < class24.field902) {
            int var13 = class24.field902 - var4;
            var9 -= var13;
            var4 = class24.field902;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class24.field903) {
            int var14 = var4 + var9 - class24.field903;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method339(var6, var10, var8, var11, (byte) 55, var7, class24.field897, this.field1307, var9);
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "(IIIIBI[I[II)V")
    private void method339(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int[] arg6, int[] arg7, int arg8) {
        int var10 = -(arg8 >> 2);
        if (arg4 != 55) {
            this.field1302 = !this.field1302;
        }
        int var11 = -(arg8 & 0x3);
        for (int var12 = -arg2; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg6[arg0++] = arg7[arg5++];
                arg6[arg0++] = arg7[arg5++];
                arg6[arg0++] = arg7[arg5++];
                arg6[arg0++] = arg7[arg5++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg6[arg0++] = arg7[arg5++];
            }
            arg0 += arg1;
            arg5 += arg3;
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "(IZI)V")
    public void method340(int arg0, boolean arg1, int arg2) {
        int var4 = this.field1310 + arg2;
        int var5 = this.field1311 + arg0;
        int var6 = class24.field898 * var5 + var4;
        int var7 = 0;
        if (arg1) {
            return;
        }
        int var8 = this.field1309;
        int var9 = this.field1308;
        int var10 = class24.field898 - var9;
        int var11 = 0;
        if (var5 < class24.field900) {
            int var12 = class24.field900 - var5;
            var8 -= var12;
            var5 = class24.field900;
            var7 += var9 * var12;
            var6 += class24.field898 * var12;
        }
        if (var5 + var8 > class24.field901) {
            var8 -= var5 + var8 - class24.field901;
        }
        if (var4 < class24.field902) {
            int var13 = class24.field902 - var4;
            var9 -= var13;
            var4 = class24.field902;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class24.field903) {
            int var14 = var4 + var9 - class24.field903;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method341(class24.field897, this.field1307, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method341(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "(IIII)V")
    public void method342(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1310 + arg2;
        int var6 = this.field1311 + arg0;
        int var7 = 31 / arg1;
        int var8 = class24.field898 * var6 + var5;
        int var9 = 0;
        int var10 = this.field1309;
        int var11 = this.field1308;
        int var12 = class24.field898 - var11;
        int var13 = 0;
        if (var6 < class24.field900) {
            int var14 = class24.field900 - var6;
            var10 -= var14;
            var6 = class24.field900;
            var9 += var11 * var14;
            var8 += class24.field898 * var14;
        }
        if (var6 + var10 > class24.field901) {
            var10 -= var6 + var10 - class24.field901;
        }
        if (var5 < class24.field902) {
            int var15 = class24.field902 - var5;
            var11 -= var15;
            var5 = class24.field902;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class24.field903) {
            int var16 = var5 + var11 - class24.field903;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method343(class24.field897, 0, var9, var10, var8, this.field1307, var11, var12, arg3, var13, (byte) 21);
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "([IIIII[IIIIIB)V")
    private void method343(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        if (arg10 != 21) {
            return;
        }
        int var12 = 256 - arg8;
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = arg5[arg2++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    int var16 = arg0[arg4];
                    arg0[arg4++] = ((var15 & 0xFF00FF) * arg8 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg8 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg2 += arg9;
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "(III[IIIIIII[I)V")
    public void method344(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        if (this.field1305 != arg9) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg5 / 2;
            int var14 = -arg0 / 2;
            int var15 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
            int var17 = arg7 * var15 >> 8;
            int var18 = arg7 * var16 >> 8;
            int var19 = (arg2 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg1 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class24.field898 * arg6 + arg4;
            for (int var22 = 0; var22 < arg0; var22++) {
                int var23 = arg3[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg10[var22]; var27 < 0; var27++) {
                    class24.field897[var24++] = this.field1307[(var25 >> 16) + (var26 >> 16) * this.field1308];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class24.field898;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "(IIIIIZDII)V")
    public void method345(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, double arg6, int arg7, int arg8) {
        if (!arg5) {
            return;
        }
        try {
            int var11 = -arg1 / 2;
            int var12 = -arg7 / 2;
            int var13 = (int) (Math.sin(arg6) * 65536.0D);
            int var14 = (int) (Math.cos(arg6) * 65536.0D);
            int var15 = arg4 * var13 >> 8;
            int var16 = arg4 * var14 >> 8;
            int var17 = (arg3 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg8 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class24.field898 * arg0 + arg2;
            for (int var20 = 0; var20 < arg7; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg1; var24 < 0; var24++) {
                    int var25 = this.field1307[(var22 >> 16) + (var23 >> 16) * this.field1308];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class24.field897[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class24.field898;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "(ILVSJQVIFL;II)V")
    public void method346(int arg0, class63 arg1, int arg2, int arg3) {
        int var5 = this.field1310 + arg3;
        int var6 = this.field1311 + arg0;
        if (arg2 != 0) {
            this.field1303 = 231;
        }
        int var7 = class24.field898 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1309;
        int var10 = this.field1308;
        int var11 = class24.field898 - var10;
        int var12 = 0;
        if (var6 < class24.field900) {
            int var13 = class24.field900 - var6;
            var9 -= var13;
            var6 = class24.field900;
            var8 += var10 * var13;
            var7 += class24.field898 * var13;
        }
        if (var6 + var9 > class24.field901) {
            var9 -= var6 + var9 - class24.field901;
        }
        if (var5 < class24.field902) {
            int var14 = class24.field902 - var5;
            var10 -= var14;
            var5 = class24.field902;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class24.field903) {
            int var15 = var5 + var10 - class24.field903;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method347(var8, var9, var7, this.field1307, var12, class24.field897, var10, arg1.field1355, var11, 0, (byte) -102);
        }
    }

    @OriginalMember(owner = "PDMJJHOP", name = "a", descriptor = "(III[II[II[BIIB)V")
    private void method347(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, byte[] arg7, int arg8, int arg9, byte arg10) {
        int var12 = -(arg6 >> 2);
        if (arg10 != -102) {
            return;
        }
        int var13 = -(arg6 & 0x3);
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg3[arg0++];
                if (var18 != 0 && arg7[arg2] == 0) {
                    arg5[arg2++] = var18;
                } else {
                    arg2++;
                }
                int var19 = arg3[arg0++];
                if (var19 != 0 && arg7[arg2] == 0) {
                    arg5[arg2++] = var19;
                } else {
                    arg2++;
                }
                int var20 = arg3[arg0++];
                if (var20 != 0 && arg7[arg2] == 0) {
                    arg5[arg2++] = var20;
                } else {
                    arg2++;
                }
                int var21 = arg3[arg0++];
                if (var21 != 0 && arg7[arg2] == 0) {
                    arg5[arg2++] = var21;
                } else {
                    arg2++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg3[arg0++];
                if (var17 != 0 && arg7[arg2] == 0) {
                    arg5[arg2++] = var17;
                } else {
                    arg2++;
                }
            }
            arg2 += arg8;
            arg0 += arg4;
        }
    }
}
