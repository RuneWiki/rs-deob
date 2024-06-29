import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 extends class2 {

    @OriginalMember(owner = "mapview!b", name = "z", descriptor = "Z")
    private boolean field51 = false;

    @OriginalMember(owner = "mapview!b", name = "y", descriptor = "I")
    private int field50 = 0;

    @OriginalMember(owner = "mapview!b", name = "A", descriptor = "[B")
    private byte[] field52 = new byte[100000];

    @OriginalMember(owner = "mapview!b", name = "x", descriptor = "Ljava/lang/String;")
    private static String field49 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| " + String.valueOf('Ä') + 'Ë' + 'Ï' + 'Ö' + 'Ü' + 'ä' + 'ë' + 'ï' + 'ö' + 'ü' + 'ÿ' + 'ß';

    @OriginalMember(owner = "mapview!b", name = "B", descriptor = "I")
    private static int field53 = field49.length();

    @OriginalMember(owner = "mapview!b", name = "C", descriptor = "[I")
    private static int[] field54 = new int[256];

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 4)
    private final void method18(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4) {
        int var6 = arg1.charWidth(arg2);
        int var7 = var6;
        if (arg4) {
            try {
                if (arg2 == '/') {
                    arg4 = false;
                }
                if (arg2 == 'f' || arg2 == 't' || arg2 == 'w' || arg2 == 'v' || arg2 == 'k' || arg2 == 'x' || arg2 == 'y' || arg2 == 'A' || arg2 == 'V' || arg2 == 'W') {
                    var6++;
                }
            } catch (Exception var38) {
            }
        }
        int var9 = arg1.getMaxAscent();
        int var10 = arg1.getMaxAscent() + arg1.getMaxDescent();
        int var11 = arg1.getHeight();
        Image var12 = class40.field509.createImage(var6, var10);
        Graphics var13 = var12.getGraphics();
        var13.setColor(Color.black);
        var13.fillRect(0, 0, var6, var10);
        var13.setColor(Color.white);
        var13.setFont(arg0);
        var13.drawString(arg2 + "", 0, var9);
        if (arg4) {
            var13.drawString(arg2 + "", 1, var9);
        }
        int[] var14 = new int[var6 * var10];
        PixelGrabber var15 = new PixelGrabber(var12, 0, 0, var6, var10, var14, 0, var6);
        try {
            var15.grabPixels();
        } catch (Exception var37) {
        }
        var12.flush();
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = var6;
        int var21 = var10;
        label135: for (int var22 = 0; var22 < var10; var22++) {
            for (int var23 = 0; var23 < var6; var23++) {
                int var24 = var14[var6 * var22 + var23];
                if ((var24 & 0xFFFFFF) != 0) {
                    var19 = var22;
                    break label135;
                }
            }
        }
        label123: for (int var25 = 0; var25 < var6; var25++) {
            for (int var26 = 0; var26 < var10; var26++) {
                int var27 = var14[var6 * var26 + var25];
                if ((var27 & 0xFFFFFF) != 0) {
                    var18 = var25;
                    break label123;
                }
            }
        }
        label111: for (int var28 = var10 - 1; var28 >= 0; var28--) {
            for (int var29 = 0; var29 < var6; var29++) {
                int var30 = var14[var6 * var28 + var29];
                if ((var30 & 0xFFFFFF) != 0) {
                    var21 = var28 + 1;
                    break label111;
                }
            }
        }
        label99: for (int var31 = var6 - 1; var31 >= 0; var31--) {
            for (int var32 = 0; var32 < var10; var32++) {
                int var33 = var14[var6 * var32 + var31];
                if ((var33 & 0xFFFFFF) != 0) {
                    var20 = var31 + 1;
                    break label99;
                }
            }
        }
        this.field52[arg3 * 9] = (byte) (this.field50 / 16384);
        this.field52[arg3 * 9 + 1] = (byte) (this.field50 / 128 & 0x7F);
        this.field52[arg3 * 9 + 2] = (byte) (this.field50 & 0x7F);
        this.field52[arg3 * 9 + 3] = (byte) (var20 - var18);
        this.field52[arg3 * 9 + 4] = (byte) (var21 - var19);
        this.field52[arg3 * 9 + 5] = (byte) var18;
        this.field52[arg3 * 9 + 6] = (byte) (var9 - var19);
        this.field52[arg3 * 9 + 7] = (byte) var7;
        this.field52[arg3 * 9 + 8] = (byte) var11;
        for (int var34 = var19; var34 < var21; var34++) {
            for (int var35 = var18; var35 < var20; var35++) {
                int var36 = var14[var6 * var34 + var35] & 0xFF;
                if (var36 > 30 && var36 < 230) {
                    this.field51 = true;
                }
                this.field52[this.field50++] = (byte) var36;
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([I[BIIIIIII)V", line = 191)
    private final void method19(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var10 = -arg6; var10 < 0; var10++) {
            for (int var11 = -arg5; var11 < 0; var11++) {
                int var12 = arg1[arg3++] & 0xFF;
                if (var12 <= 30) {
                    arg4++;
                } else if (var12 >= 230) {
                    arg0[arg4++] = arg2;
                } else {
                    int var13 = arg0[arg4];
                    arg0[arg4++] = ((arg2 & 0xFF00FF) * var12 + (var13 & 0xFF00FF) * (256 - var12) & 0xFF00FF00) + ((arg2 & 0xFF00) * var12 + (var13 & 0xFF00) * (256 - var12) & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "([I[BIIIIIII)V", line = 227)
    private final void method20(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Lv;IIIZ)V", line = 282)
    private final void method21(class40 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field51 || arg3 == 0) {
            arg4 = false;
        }
        for (int var6 = 0; var6 < arg0.method262(736276196); var6++) {
            int var7 = field54[arg0.method254(-57, var6)];
            if (arg4) {
                this.method27(var7, arg1 + 1, arg2, 0, this.field52);
                this.method27(var7, arg1, arg2 + 1, 0, this.field52);
            }
            this.method27(var7, arg1, arg2, arg3, this.field52);
            arg1 += this.field52[var7 + 7];
        }
    }

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "()V", line = 305)
    public static void method22() {
        field49 = null;
        field54 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "()I", line = 311)
    public final int method23() {
        return this.field52[8] - 1;
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(Lv;IIIZ)V", line = 315)
    public final void method24(class40 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method25(arg0) / 2;
        int var7 = this.method26();
        if (arg1 - var6 <= class2.field46 && (arg1 + var6 >= class2.field42 && (arg2 - var7 <= class2.field43 && arg2 >= 0))) {
            this.method21(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Lv;)I", line = 334)
    private final int method25(class40 arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.method262(736276196); var3++) {
            if (arg0.method254(-117, var3) == 64 && var3 + 4 < arg0.method262(736276196) && arg0.method254(66, var3 + 4) == 64) {
                var3 += 4;
            } else if (arg0.method254(-55, var3) == 126 && var3 + 4 < arg0.method262(736276196) && arg0.method254(-89, var3 + 4) == 126) {
                var3 += 4;
            } else {
                var2 += this.field52[field54[arg0.method254(-108, var3)] + 7];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "()I", line = 355)
    public final int method26() {
        return this.field52[6];
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IIII[B)V", line = 360)
    private final void method27(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = arg4[arg0 + 5] + arg1;
        int var7 = arg2 - arg4[arg0 + 6];
        int var8 = arg4[arg0 + 3];
        int var9 = arg4[arg0 + 4];
        int var10 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var11 = class2.field45 * var7 + var6;
        int var12 = class2.field45 - var8;
        int var13 = 0;
        if (var7 < class2.field44) {
            int var14 = class2.field44 - var7;
            var9 -= var14;
            var7 = class2.field44;
            var10 += var8 * var14;
            var11 += class2.field45 * var14;
        }
        if (var7 + var9 >= class2.field43) {
            var9 -= var7 + var9 + 1 - class2.field43;
        }
        if (var6 < class2.field42) {
            int var15 = class2.field42 - var6;
            var8 -= var15;
            var6 = class2.field42;
            var10 += var15;
            var11 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var8 >= class2.field46) {
            int var16 = var6 + var8 + 1 - class2.field46;
            var8 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (this.field51) {
            this.method19(class2.field48, arg4, arg3, var10, var11, var8, var9, var12, var13);
        } else {
            this.method20(class2.field48, arg4, arg3, var10, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(IZLjava/awt/Component;)V", line = 453)
    public class3(int arg0, boolean arg1, Component arg2) {
        this.field50 = field53 * 9;
        this.field51 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < field53; var6++) {
            this.method18(var4, var5, field49.charAt(var6), var6, false);
        }
        if (arg1 && this.field51) {
            this.field50 = field53 * 9;
            this.field51 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < field53; var9++) {
                this.method18(var7, var8, field49.charAt(var9), var9, false);
            }
            if (!this.field51) {
                this.field50 = field53 * 9;
                this.field51 = false;
                for (int var10 = 0; var10 < field53; var10++) {
                    this.method18(var7, var8, field49.charAt(var10), var10, true);
                }
            }
        }
        byte[] var11 = new byte[this.field50];
        for (int var12 = 0; var12 < this.field50; var12++) {
            var11[var12] = this.field52[var12];
        }
        this.field52 = var11;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = field49.indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field54[var0] = var1 * 9;
        }
    }
}
