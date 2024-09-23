import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CUKAGIIJ")
public class class10 extends class46 {

    @OriginalMember(owner = "CUKAGIIJ", name = "z", descriptor = "I")
    private int field563 = -288;

    @OriginalMember(owner = "CUKAGIIJ", name = "A", descriptor = "B")
    private byte field564 = -27;

    @OriginalMember(owner = "CUKAGIIJ", name = "B", descriptor = "B")
    private byte field565 = -27;

    @OriginalMember(owner = "CUKAGIIJ", name = "C", descriptor = "I")
    private int field566 = -514;

    @OriginalMember(owner = "CUKAGIIJ", name = "D", descriptor = "Z")
    private boolean field567 = false;

    @OriginalMember(owner = "CUKAGIIJ", name = "E", descriptor = "Z")
    private boolean field568 = true;

    @OriginalMember(owner = "CUKAGIIJ", name = "G", descriptor = "Z")
    private boolean field570 = false;

    @OriginalMember(owner = "CUKAGIIJ", name = "H", descriptor = "Z")
    private boolean field571 = false;

    @OriginalMember(owner = "CUKAGIIJ", name = "I", descriptor = "[I")
    public int[] field572;

    @OriginalMember(owner = "CUKAGIIJ", name = "N", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "CUKAGIIJ", name = "J", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "CUKAGIIJ", name = "O", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "CUKAGIIJ", name = "K", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "CUKAGIIJ", name = "M", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "CUKAGIIJ", name = "L", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "CUKAGIIJ", name = "F", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "CUKAGIIJ", name = "<init>", descriptor = "(II)V")
    public class10(int arg0, int arg1) {
        this.field572 = new int[arg0 * arg1];
        this.field573 = this.field577 = arg0;
        this.field574 = this.field578 = arg1;
        this.field575 = this.field576 = 0;
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class10(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field573 = var3.getWidth(arg1);
            this.field574 = var3.getHeight(arg1);
            this.field577 = this.field573;
            this.field578 = this.field574;
            this.field575 = 0;
            this.field576 = 0;
            this.field572 = new int[this.field574 * this.field573];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field573, this.field574, this.field572, 0, this.field573);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "<init>", descriptor = "(LVSUYIIVA;Ljava/lang/String;I)V")
    public class10(class62 arg0, String arg1, int arg2) {
        class8 var4 = new class8(arg0.method570(arg1 + ".dat", null), 792);
        class8 var5 = new class8(arg0.method570("index.dat", null), 792);
        var5.field72 = var4.method32();
        this.field577 = var5.method32();
        this.field578 = var5.method32();
        int var6 = var5.method30();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method34();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field72 += 2;
            var4.field72 += var5.method32() * var5.method32();
            var5.field72++;
        }
        this.field575 = var5.method30();
        this.field576 = var5.method30();
        this.field573 = var5.method32();
        this.field574 = var5.method32();
        int var10 = var5.method30();
        int var11 = this.field574 * this.field573;
        this.field572 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field572[var12] = var7[var4.method30()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field573; var13++) {
                for (int var14 = 0; var14 < this.field574; var14++) {
                    this.field572[this.field573 * var14 + var13] = var7[var4.method30()];
                }
            }
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "b", descriptor = "(I)V")
    public void method218(int arg0) {
        class46.method431(true, this.field573, this.field574, this.field572);
        if (arg0 != -3747) {
            this.field571 = !this.field571;
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "(IIBI)V")
    public void method219(int arg0, int arg1, byte arg2, int arg3) {
        for (int var5 = 0; var5 < this.field572.length; var5++) {
            int var7 = this.field572[var5];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg1 + var8;
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
                int var13 = arg0 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field572[var5] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
        if (arg2 == 3) {
            boolean var6 = false;
        } else {
            this.field563 = 455;
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "c", descriptor = "(I)V")
    public void method220(int arg0) {
        int[] var2 = new int[this.field578 * this.field577];
        for (int var3 = 0; var3 < this.field574; var3++) {
            for (int var4 = 0; var4 < this.field573; var4++) {
                var2[(this.field576 + var3) * this.field577 + this.field575 + var4] = this.field572[this.field573 * var3 + var4];
            }
        }
        if (arg0 >= 0) {
            return;
        }
        this.field572 = var2;
        this.field573 = this.field577;
        this.field574 = this.field578;
        this.field575 = 0;
        this.field576 = 0;
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "(BII)V")
    public void method221(byte arg0, int arg1, int arg2) {
        int var4 = this.field575 + arg2;
        if (arg0 != 3) {
            return;
        }
        boolean var5 = false;
        int var6 = this.field576 + arg1;
        int var7 = class46.field1162 * var6 + var4;
        int var8 = 0;
        int var9 = this.field574;
        int var10 = this.field573;
        int var11 = class46.field1162 - var10;
        int var12 = 0;
        if (var6 < class46.field1164) {
            int var13 = class46.field1164 - var6;
            var9 -= var13;
            var6 = class46.field1164;
            var8 += var10 * var13;
            var7 += class46.field1162 * var13;
        }
        if (var6 + var9 > class46.field1165) {
            var9 -= var6 + var9 - class46.field1165;
        }
        if (var4 < class46.field1166) {
            int var14 = class46.field1166 - var4;
            var10 -= var14;
            var4 = class46.field1166;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class46.field1167) {
            int var15 = var4 + var10 - class46.field1167;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method222(var9, class46.field1161, var12, this.field572, var11, var10, 0, var8, var7);
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "(I[II[IIIIII)V")
    private void method222(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 < 0 || arg6 > 0) {
            return;
        }
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg1[arg8++] = arg3[arg7++];
                arg1[arg8++] = arg3[arg7++];
                arg1[arg8++] = arg3[arg7++];
                arg1[arg8++] = arg3[arg7++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg1[arg8++] = arg3[arg7++];
            }
            arg8 += arg4;
            arg7 += arg2;
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "(III)V")
    public void method223(int arg0, int arg1, int arg2) {
        int var4 = this.field575 + arg0;
        int var5 = this.field576 + arg1;
        int var6 = class46.field1162 * var5 + var4;
        int var7 = 0;
        int var8 = this.field574;
        int var9 = this.field573;
        int var10 = class46.field1162 - var9;
        int var11 = 0;
        if (var5 < class46.field1164) {
            int var12 = class46.field1164 - var5;
            var8 -= var12;
            var5 = class46.field1164;
            var7 += var9 * var12;
            var6 += class46.field1162 * var12;
        }
        if (var5 + var8 > class46.field1165) {
            var8 -= var5 + var8 - class46.field1165;
        }
        if (var4 < class46.field1166) {
            int var13 = class46.field1166 - var4;
            var9 -= var13;
            var4 = class46.field1166;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class46.field1167) {
            int var14 = var4 + var9 - class46.field1167;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        this.method224(class46.field1161, this.field572, 0, var7, var6, var9, var8, var10, var11);
        if (arg2 != 9) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method224(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "(IIII)V")
    public void method225(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field575 + arg1;
        int var7 = this.field576 + arg0;
        int var8 = class46.field1162 * var7 + var6;
        int var9 = 0;
        int var10 = this.field574;
        int var11 = this.field573;
        int var12 = class46.field1162 - var11;
        int var13 = 0;
        if (var7 < class46.field1164) {
            int var14 = class46.field1164 - var7;
            var10 -= var14;
            var7 = class46.field1164;
            var9 += var11 * var14;
            var8 += class46.field1162 * var14;
        }
        if (var7 + var10 > class46.field1165) {
            var10 -= var7 + var10 - class46.field1165;
        }
        if (var6 < class46.field1166) {
            int var15 = class46.field1166 - var6;
            var11 -= var15;
            var6 = class46.field1166;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class46.field1167) {
            int var16 = var6 + var11 - class46.field1167;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method226(this.field572, var12, var11, 0, class46.field1161, -514, var8, arg2, var9, var13, var10);
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "([IIII[IIIIIII)V")
    private void method226(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg7;
        for (int var13 = -arg10; var13 < 0; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = arg0[arg8++];
                if (var15 == 0) {
                    arg6++;
                } else {
                    int var16 = arg4[arg6];
                    arg4[arg6++] = ((var15 & 0xFF00FF) * arg7 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg7 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg6 += arg1;
            arg8 += arg9;
        }
        if (arg5 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "([III[IIIIIIII)V")
    public void method227(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg1 != 7) {
            this.field570 = !this.field570;
        }
        try {
            int var12 = -arg9 / 2;
            int var13 = -arg8 / 2;
            int var14 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var16 = arg5 * var14 >> 8;
            int var17 = arg5 * var15 >> 8;
            int var18 = (arg2 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg7 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class46.field1162 * arg10 + arg4;
            for (int var21 = 0; var21 < arg8; var21++) {
                int var22 = arg3[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg0[var21]; var26 < 0; var26++) {
                    class46.field1161[var23++] = this.field572[(var24 >> 16) + (var25 >> 16) * this.field573];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class46.field1162;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "(IIIDIIIII)V")
    public void method228(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 0) {
            this.field567 = !this.field567;
        }
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg0 / 2;
            int var13 = (int) (Math.sin(arg3) * 65536.0D);
            int var14 = (int) (Math.cos(arg3) * 65536.0D);
            int var15 = arg5 * var13 >> 8;
            int var16 = arg5 * var14 >> 8;
            int var17 = (arg7 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg4 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class46.field1162 * arg1 + arg8;
            for (int var20 = 0; var20 < arg0; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg2; var24 < 0; var24++) {
                    int var25 = this.field572[(var22 >> 16) + (var23 >> 16) * this.field573];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class46.field1161[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class46.field1162;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "(LFDCAWVRL;III)V")
    public void method229(class21 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field575 + arg3;
        int var6 = this.field576 + arg1;
        int var7 = class46.field1162 * var6 + var5;
        int var8 = 0;
        int var9 = this.field574;
        int var10 = this.field573;
        int var11 = class46.field1162 - var10;
        int var12 = 0;
        if (var6 < class46.field1164) {
            int var13 = class46.field1164 - var6;
            var9 -= var13;
            var6 = class46.field1164;
            var8 += var10 * var13;
            var7 += class46.field1162 * var13;
        }
        if (var6 + var9 > class46.field1165) {
            var9 -= var6 + var9 - class46.field1165;
        }
        if (var5 < class46.field1166) {
            int var14 = class46.field1166 - var5;
            var10 -= var14;
            var5 = class46.field1166;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class46.field1167) {
            int var15 = var5 + var10 - class46.field1167;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method230(var10, 0, this.field572, arg0.field703, var9, var8, class46.field1161, var11, var12, 0, var7);
            if (arg2 == 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "CUKAGIIJ", name = "a", descriptor = "(II[I[BII[IIIII)V")
    private void method230(int arg0, int arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg0 >> 2);
        int var13 = -(arg0 & 0x3);
        if (this.field569 != arg9) {
            this.field569 = -120;
        }
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg2[arg5++];
                if (var18 != 0 && arg3[arg10] == 0) {
                    arg6[arg10++] = var18;
                } else {
                    arg10++;
                }
                int var19 = arg2[arg5++];
                if (var19 != 0 && arg3[arg10] == 0) {
                    arg6[arg10++] = var19;
                } else {
                    arg10++;
                }
                int var20 = arg2[arg5++];
                if (var20 != 0 && arg3[arg10] == 0) {
                    arg6[arg10++] = var20;
                } else {
                    arg10++;
                }
                int var21 = arg2[arg5++];
                if (var21 != 0 && arg3[arg10] == 0) {
                    arg6[arg10++] = var21;
                } else {
                    arg10++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg2[arg5++];
                if (var17 != 0 && arg3[arg10] == 0) {
                    arg6[arg10++] = var17;
                } else {
                    arg10++;
                }
            }
            arg10 += arg7;
            arg5 += arg8;
        }
    }
}
