import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("INVDQNJU")
public class class26 extends class50 {

    @OriginalMember(owner = "INVDQNJU", name = "C", descriptor = "I")
    private int field886 = -5004;

    @OriginalMember(owner = "INVDQNJU", name = "D", descriptor = "Z")
    private boolean field887 = false;

    @OriginalMember(owner = "INVDQNJU", name = "E", descriptor = "I")
    private int field888 = 7;

    @OriginalMember(owner = "INVDQNJU", name = "F", descriptor = "I")
    private int field889 = 104;

    @OriginalMember(owner = "INVDQNJU", name = "G", descriptor = "I")
    private int field890 = 2;

    @OriginalMember(owner = "INVDQNJU", name = "H", descriptor = "I")
    private int field891 = 44822;

    @OriginalMember(owner = "INVDQNJU", name = "I", descriptor = "Z")
    private boolean field892 = false;

    @OriginalMember(owner = "INVDQNJU", name = "J", descriptor = "I")
    private int field893 = 1;

    @OriginalMember(owner = "INVDQNJU", name = "K", descriptor = "[I")
    public int[] field894;

    @OriginalMember(owner = "INVDQNJU", name = "P", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "INVDQNJU", name = "L", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "INVDQNJU", name = "Q", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "INVDQNJU", name = "M", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "INVDQNJU", name = "O", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "INVDQNJU", name = "N", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "INVDQNJU", name = "<init>", descriptor = "(II)V")
    public class26(int arg0, int arg1) {
        this.field894 = new int[arg0 * arg1];
        this.field895 = this.field899 = arg0;
        this.field896 = this.field900 = arg1;
        this.field897 = this.field898 = 0;
    }

    @OriginalMember(owner = "INVDQNJU", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class26(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field895 = var3.getWidth(arg1);
            this.field896 = var3.getHeight(arg1);
            this.field899 = this.field895;
            this.field900 = this.field896;
            this.field897 = 0;
            this.field898 = 0;
            this.field894 = new int[this.field896 * this.field895];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field895, this.field896, this.field894, 0, this.field895);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "<init>", descriptor = "(LXRWUKRPO;Ljava/lang/String;I)V")
    public class26(class65 arg0, String arg1, int arg2) {
        class21 var4 = new class21(arg0.method581(arg1 + ".dat", null), -49015);
        class21 var5 = new class21(arg0.method581("index.dat", null), -49015);
        var5.field818 = var4.method246();
        this.field899 = var5.method246();
        this.field900 = var5.method246();
        int var6 = var5.method244();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method248();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field818 += 2;
            var4.field818 += var5.method246() * var5.method246();
            var5.field818++;
        }
        this.field897 = var5.method244();
        this.field898 = var5.method244();
        this.field895 = var5.method246();
        this.field896 = var5.method246();
        int var10 = var5.method244();
        int var11 = this.field896 * this.field895;
        this.field894 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field894[var12] = var7[var4.method244()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field895; var13++) {
                for (int var14 = 0; var14 < this.field896; var14++) {
                    this.field894[this.field895 * var14 + var13] = var7[var4.method244()];
                }
            }
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "c", descriptor = "(I)V")
    public void method326(int arg0) {
        if (arg0 != 1) {
            this.field887 = !this.field887;
        }
        class50.method473(this.field896, this.field895, 3, this.field894);
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "(IIIB)V")
    public void method327(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -77) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field894.length; var6++) {
            int var7 = this.field894[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg2 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg1 + var10;
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
                this.field894[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "(Z)V")
    public void method328(boolean arg0) {
        int[] var2 = new int[this.field900 * this.field899];
        for (int var3 = 0; var3 < this.field896; var3++) {
            for (int var4 = 0; var4 < this.field895; var4++) {
                var2[(this.field898 + var3) * this.field899 + this.field897 + var4] = this.field894[this.field895 * var3 + var4];
            }
        }
        if (arg0) {
            this.field892 = !this.field892;
        }
        this.field894 = var2;
        this.field895 = this.field899;
        this.field896 = this.field900;
        this.field897 = 0;
        this.field898 = 0;
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "(IIB)V")
    public void method329(int arg0, int arg1, byte arg2) {
        if (arg2 != -73) {
            return;
        }
        int var4 = this.field897 + arg0;
        int var5 = this.field898 + arg1;
        int var6 = class50.field1279 * var5 + var4;
        int var7 = 0;
        int var8 = this.field896;
        int var9 = this.field895;
        int var10 = class50.field1279 - var9;
        int var11 = 0;
        if (var5 < class50.field1281) {
            int var12 = class50.field1281 - var5;
            var8 -= var12;
            var5 = class50.field1281;
            var7 += var9 * var12;
            var6 += class50.field1279 * var12;
        }
        if (var5 + var8 > class50.field1282) {
            var8 -= var5 + var8 - class50.field1282;
        }
        if (var4 < class50.field1283) {
            int var13 = class50.field1283 - var4;
            var9 -= var13;
            var4 = class50.field1283;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class50.field1284) {
            int var14 = var4 + var9 - class50.field1284;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method330(class50.field1278, this.field894, var7, var10, var6, var9, var11, 495, var8);
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method330(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg0[arg4++] = arg1[arg2++];
                arg0[arg4++] = arg1[arg2++];
                arg0[arg4++] = arg1[arg2++];
                arg0[arg4++] = arg1[arg2++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg0[arg4++] = arg1[arg2++];
            }
            arg4 += arg3;
            arg2 += arg6;
        }
        if (arg7 <= 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "(III)V")
    public void method331(int arg0, int arg1, int arg2) {
        int var4 = this.field897 + arg0;
        int var5 = this.field898 + arg2;
        int var6 = 66 / arg1;
        int var7 = class50.field1279 * var5 + var4;
        int var8 = 0;
        int var9 = this.field896;
        int var10 = this.field895;
        int var11 = class50.field1279 - var10;
        int var12 = 0;
        if (var5 < class50.field1281) {
            int var13 = class50.field1281 - var5;
            var9 -= var13;
            var5 = class50.field1281;
            var8 += var10 * var13;
            var7 += class50.field1279 * var13;
        }
        if (var5 + var9 > class50.field1282) {
            var9 -= var5 + var9 - class50.field1282;
        }
        if (var4 < class50.field1283) {
            int var14 = class50.field1283 - var4;
            var10 -= var14;
            var4 = class50.field1283;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class50.field1284) {
            int var15 = var4 + var10 - class50.field1284;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method332(class50.field1278, this.field894, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "b", descriptor = "([I[IIIIIIII)V")
    private void method332(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "(IIZI)V")
    public void method333(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = this.field897 + arg1;
        int var6 = this.field898 + arg3;
        int var7 = class50.field1279 * var6 + var5;
        int var8 = 0;
        if (!arg2) {
            this.field892 = !this.field892;
        }
        int var9 = this.field896;
        int var10 = this.field895;
        int var11 = class50.field1279 - var10;
        int var12 = 0;
        if (var6 < class50.field1281) {
            int var13 = class50.field1281 - var6;
            var9 -= var13;
            var6 = class50.field1281;
            var8 += var10 * var13;
            var7 += class50.field1279 * var13;
        }
        if (var6 + var9 > class50.field1282) {
            var9 -= var6 + var9 - class50.field1282;
        }
        if (var5 < class50.field1283) {
            int var14 = class50.field1283 - var5;
            var10 -= var14;
            var5 = class50.field1283;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class50.field1284) {
            int var15 = var5 + var10 - class50.field1284;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method334(this.field894, class50.field1278, var12, var8, var10, 0, 197, var7, var9, var11, arg0);
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "([I[IIIIIIIIII)V")
    private void method334(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg10;
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var15 = -arg4; var15 < 0; var15++) {
                int var16 = arg0[arg3++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    int var17 = arg1[arg7];
                    arg1[arg7++] = ((var16 & 0xFF00FF) * arg10 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg10 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg7 += arg9;
            arg3 += arg2;
        }
        if (arg6 <= 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "([IIIIII[IIIII)V")
    public void method335(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg2 != 1) {
            this.field893 = -284;
        }
        try {
            int var12 = -arg10 / 2;
            int var13 = -arg4 / 2;
            int var14 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
            int var16 = arg7 * var14 >> 8;
            int var17 = arg7 * var15 >> 8;
            int var18 = (arg3 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg8 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class50.field1279 * arg1 + arg9;
            for (int var21 = 0; var21 < arg4; var21++) {
                int var22 = arg0[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg6[var21]; var26 < 0; var26++) {
                    class50.field1278[var23++] = this.field894[(var24 >> 16) + (var25 >> 16) * this.field895];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class50.field1279;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "(IIIIIDIII)V")
    public void method336(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7, int arg8) {
        if (this.field890 != arg3) {
            this.field890 = 125;
        }
        try {
            int var11 = -arg6 / 2;
            int var12 = -arg0 / 2;
            int var13 = (int) (Math.sin(arg5) * 65536.0D);
            int var14 = (int) (Math.cos(arg5) * 65536.0D);
            int var15 = arg1 * var13 >> 8;
            int var16 = arg1 * var14 >> 8;
            int var17 = (arg7 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg8 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class50.field1279 * arg4 + arg2;
            for (int var20 = 0; var20 < arg0; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg6; var24 < 0; var24++) {
                    int var25 = this.field894[(var22 >> 16) + (var23 >> 16) * this.field895];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class50.field1278[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class50.field1279;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "(LVUMXQDFQ;IIZ)V")
    public void method337(class57 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field888 = 270;
        }
        int var5 = this.field897 + arg1;
        int var6 = this.field898 + arg2;
        int var7 = class50.field1279 * var6 + var5;
        int var8 = 0;
        int var9 = this.field896;
        int var10 = this.field895;
        int var11 = class50.field1279 - var10;
        int var12 = 0;
        if (var6 < class50.field1281) {
            int var13 = class50.field1281 - var6;
            var9 -= var13;
            var6 = class50.field1281;
            var8 += var10 * var13;
            var7 += class50.field1279 * var13;
        }
        if (var6 + var9 > class50.field1282) {
            var9 -= var6 + var9 - class50.field1282;
        }
        if (var5 < class50.field1283) {
            int var14 = class50.field1283 - var5;
            var10 -= var14;
            var5 = class50.field1283;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class50.field1284) {
            int var15 = var5 + var10 - class50.field1284;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method338(0, class50.field1278, 44822, var10, var9, arg0.field1472, var8, this.field894, var12, var7, var11);
        }
    }

    @OriginalMember(owner = "INVDQNJU", name = "a", descriptor = "(I[IIII[BI[IIII)V")
    private void method338(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg3 >> 2);
        int var13 = -(arg3 & 0x3);
        if (this.field891 != arg2) {
            this.field889 = 430;
        }
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg7[arg6++];
                if (var18 != 0 && arg5[arg9] == 0) {
                    arg1[arg9++] = var18;
                } else {
                    arg9++;
                }
                int var19 = arg7[arg6++];
                if (var19 != 0 && arg5[arg9] == 0) {
                    arg1[arg9++] = var19;
                } else {
                    arg9++;
                }
                int var20 = arg7[arg6++];
                if (var20 != 0 && arg5[arg9] == 0) {
                    arg1[arg9++] = var20;
                } else {
                    arg9++;
                }
                int var21 = arg7[arg6++];
                if (var21 != 0 && arg5[arg9] == 0) {
                    arg1[arg9++] = var21;
                } else {
                    arg9++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg7[arg6++];
                if (var17 != 0 && arg5[arg9] == 0) {
                    arg1[arg9++] = var17;
                } else {
                    arg9++;
                }
            }
            arg9 += arg10;
            arg6 += arg8;
        }
    }
}
