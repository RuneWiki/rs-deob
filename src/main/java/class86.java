import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class86 {

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    private int field1584 = 0;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Z")
    private boolean field1585 = false;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[B")
    private byte[] field1583 = new byte[100000];

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Ljava/lang/String;")
    private static String field1586 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| " + String.valueOf('Ä') + 'Ë' + 'Ï' + 'Ö' + 'Ü' + 'ä' + 'ë' + 'ï' + 'ö' + 'ü' + 'ÿ' + 'ß';

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    private static int field1587 = field1586.length();

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[I")
    private static int[] field1588 = new int[256];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lpj;IIIZ)V")
    public final void method652(class237 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method655(arg0) / 2;
        int var7 = this.method654();
        if (arg1 - var6 <= class192.field3333 && arg1 + var6 >= class192.field3334 && arg2 - var7 <= class192.field3331 && arg2 >= 0) {
            this.method661(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
    public static void method653() {
        field1586 = null;
        field1588 = null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()I")
    public final int method654() {
        return this.field1583[6];
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lpj;)I")
    private final int method655(class237 arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.method1588(false); var3++) {
            if (arg0.method1607((byte) -91, var3) == 64 && var3 + 4 < arg0.method1588(false) && arg0.method1607((byte) -91, var3 + 4) == 64) {
                var3 += 4;
            } else if (arg0.method1607((byte) -91, var3) == 126 && var3 + 4 < arg0.method1588(false) && arg0.method1607((byte) -91, var3 + 4) == 126) {
                var3 += 4;
            } else {
                var2 += this.field1583[field1588[arg0.method1607((byte) -91, var3)] + 7];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
    private final void method656(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4) {
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
            } catch (Exception var36) {
            }
        }
        int var8 = arg1.getMaxAscent();
        int var9 = arg1.getMaxAscent() + arg1.getMaxDescent();
        int var10 = arg1.getHeight();
        Image var11 = class20.field379.createImage(var6, var9);
        Graphics var12 = var11.getGraphics();
        var12.setColor(Color.black);
        var12.fillRect(0, 0, var6, var9);
        var12.setColor(Color.white);
        var12.setFont(arg0);
        var12.drawString(String.valueOf(arg2), 0, var8);
        if (arg4) {
            var12.drawString(String.valueOf(arg2), 1, var8);
        }
        int[] var13 = new int[var6 * var9];
        PixelGrabber var14 = new PixelGrabber(var11, 0, 0, var6, var9, var13, 0, var6);
        try {
            var14.grabPixels();
        } catch (Exception var35) {
        }
        var11.flush();
        Object var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = var6;
        int var19 = var9;
        label143: for (int var20 = 0; var20 < var9; var20++) {
            for (int var21 = 0; var21 < var6; var21++) {
                int var22 = var13[var6 * var20 + var21];
                if ((var22 & 0xFFFFFF) != 0) {
                    var17 = var20;
                    break label143;
                }
            }
        }
        label129: for (int var23 = 0; var23 < var6; var23++) {
            for (int var24 = 0; var24 < var9; var24++) {
                int var25 = var13[var6 * var24 + var23];
                if ((var25 & 0xFFFFFF) != 0) {
                    var16 = var23;
                    break label129;
                }
            }
        }
        label115: for (int var26 = var9 - 1; var26 >= 0; var26--) {
            for (int var27 = 0; var27 < var6; var27++) {
                int var28 = var13[var6 * var26 + var27];
                if ((var28 & 0xFFFFFF) != 0) {
                    var19 = var26 + 1;
                    break label115;
                }
            }
        }
        label101: for (int var29 = var6 - 1; var29 >= 0; var29--) {
            for (int var30 = 0; var30 < var9; var30++) {
                int var31 = var13[var6 * var30 + var29];
                if ((var31 & 0xFFFFFF) != 0) {
                    var18 = var29 + 1;
                    break label101;
                }
            }
        }
        this.field1583[arg3 * 9] = (byte) (this.field1584 / 16384);
        this.field1583[arg3 * 9 + 1] = (byte) (this.field1584 / 128 & 0x7F);
        this.field1583[arg3 * 9 + 2] = (byte) (this.field1584 & 0x7F);
        this.field1583[arg3 * 9 + 3] = (byte) (var18 - var16);
        this.field1583[arg3 * 9 + 4] = (byte) (var19 - var17);
        this.field1583[arg3 * 9 + 5] = (byte) var16;
        this.field1583[arg3 * 9 + 6] = (byte) (var8 - var17);
        this.field1583[arg3 * 9 + 7] = (byte) var7;
        this.field1583[arg3 * 9 + 8] = (byte) var10;
        for (int var32 = var17; var32 < var19; var32++) {
            for (int var33 = var16; var33 < var18; var33++) {
                int var34 = var13[var6 * var32 + var33] & 0xFF;
                if (var34 > 30 && var34 < 230) {
                    this.field1585 = true;
                }
                this.field1583[this.field1584++] = (byte) var34;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([I[BIIIIIII)V")
    private final void method657(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII[B)V")
    private final void method658(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = arg4[arg0 + 5] + arg1;
        int var7 = arg2 - arg4[arg0 + 6];
        int var8 = arg4[arg0 + 3];
        int var9 = arg4[arg0 + 4];
        int var10 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var11 = class192.field3335 * var7 + var6;
        int var12 = class192.field3335 - var8;
        int var13 = 0;
        if (var7 < class192.field3336) {
            int var14 = class192.field3336 - var7;
            var9 -= var14;
            var7 = class192.field3336;
            var10 += var8 * var14;
            var11 += class192.field3335 * var14;
        }
        if (var7 + var9 >= class192.field3331) {
            var9 -= var7 + var9 + 1 - class192.field3331;
        }
        if (var6 < class192.field3334) {
            int var15 = class192.field3334 - var6;
            var8 -= var15;
            var6 = class192.field3334;
            var10 += var15;
            var11 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var8 >= class192.field3333) {
            int var16 = var6 + var8 + 1 - class192.field3333;
            var8 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (this.field1585) {
            this.method657(class192.field3330, arg4, arg3, var10, var11, var8, var9, var12, var13);
            return;
        }
        this.method659(class192.field3330, arg4, arg3, var10, var11, var8, var9, var12, var13);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "([I[BIIIIIII)V")
    private final void method659(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()I")
    public final int method660() {
        return this.field1583[8] - 1;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Lpj;IIIZ)V")
    private final void method661(class237 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field1585 || arg3 == 0) {
            arg4 = false;
        }
        for (int var6 = 0; var6 < arg0.method1588(false); var6++) {
            int var7 = field1588[arg0.method1607((byte) -91, var6)];
            if (arg4) {
                this.method658(var7, arg1 + 1, arg2, 1, this.field1583);
                this.method658(var7, arg1, arg2 + 1, 1, this.field1583);
            }
            this.method658(var7, arg1, arg2, arg3, this.field1583);
            arg1 += this.field1583[var7 + 7];
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IZLjava/awt/Component;)V")
    public class86(int arg0, boolean arg1, Component arg2) {
        this.field1584 = field1587 * 9;
        this.field1585 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < field1587; var6++) {
            this.method656(var4, var5, field1586.charAt(var6), var6, false);
        }
        if (arg1 && this.field1585) {
            this.field1584 = field1587 * 9;
            this.field1585 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < field1587; var9++) {
                this.method656(var7, var8, field1586.charAt(var9), var9, false);
            }
            if (!this.field1585) {
                this.field1584 = field1587 * 9;
                this.field1585 = false;
                for (int var10 = 0; var10 < field1587; var10++) {
                    this.method656(var7, var8, field1586.charAt(var10), var10, true);
                }
            }
        }
        byte[] var11 = new byte[this.field1584];
        for (int var12 = 0; var12 < this.field1584; var12++) {
            var11[var12] = this.field1583[var12];
        }
        this.field1583 = var11;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = field1586.indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field1588[var0] = var1 * 9;
        }
    }
}
