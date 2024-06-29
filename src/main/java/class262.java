import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class262 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    private int field3802 = 0;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
    private boolean field3804 = false;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[B")
    private byte[] field3806 = new byte[100000];

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    private static int field3803 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".length();

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
    private static int[] field3805 = new int[256];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public static void method1673() {
        field3805 = null;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()I")
    public final int method1674() {
        return this.field3806[8] - 1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
    private final void method1675(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4) {
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
        Image var11 = class181.field2574.createImage(var6, var9);
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
        this.field3806[arg3 * 9] = (byte) (this.field3802 / 16384);
        this.field3806[arg3 * 9 + 1] = (byte) (this.field3802 / 128 & 0x7F);
        this.field3806[arg3 * 9 + 2] = (byte) (this.field3802 & 0x7F);
        this.field3806[arg3 * 9 + 3] = (byte) (var18 - var16);
        this.field3806[arg3 * 9 + 4] = (byte) (var19 - var17);
        this.field3806[arg3 * 9 + 5] = (byte) var16;
        this.field3806[arg3 * 9 + 6] = (byte) (var8 - var17);
        this.field3806[arg3 * 9 + 7] = (byte) var7;
        this.field3806[arg3 * 9 + 8] = (byte) var10;
        for (int var32 = var17; var32 < var19; var32++) {
            for (int var33 = var16; var33 < var18; var33++) {
                int var34 = var13[var6 * var32 + var33] & 0xFF;
                if (var34 > 30 && var34 < 230) {
                    this.field3804 = true;
                }
                this.field3806[this.field3802++] = (byte) var34;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;IIIZ)V")
    private final void method1676(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field3804 || arg3 == 0) {
            arg4 = false;
        }
        for (int var6 = 0; var6 < arg0.length(); var6++) {
            int var7 = field3805[arg0.charAt(var6)];
            if (arg4) {
                this.method1682(var7, arg1 + 1, arg2, 1, this.field3806);
                this.method1682(var7, arg1, arg2 + 1, 1, this.field3806);
            }
            this.method1682(var7, arg1, arg2, arg3, this.field3806);
            arg1 += this.field3806[var7 + 7];
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([I[BIIIIIII)V")
    private final void method1677(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Ljava/lang/String;IIIZ)V")
    public final void method1678(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method1679(arg0) / 2;
        int var7 = this.method1681();
        if (arg1 - var6 <= class155.field2246 && arg1 + var6 >= class155.field2248 && arg2 - var7 <= class155.field2241 && arg2 >= 0) {
            this.method1676(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;)I")
    private final int method1679(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
                var3 += 4;
            } else if (arg0.charAt(var3) == '~' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '~') {
                var3 += 4;
            } else {
                var2 += this.field3806[field3805[arg0.charAt(var3)] + 7];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([I[BIIIIIII)V")
    private final void method1680(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!b", name = "c", descriptor = "()I")
    public final int method1681() {
        return this.field3806[6];
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII[B)V")
    private final void method1682(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = arg4[arg0 + 5] + arg1;
        int var7 = arg2 - arg4[arg0 + 6];
        int var8 = arg4[arg0 + 3];
        int var9 = arg4[arg0 + 4];
        int var10 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var11 = class155.field2244 * var7 + var6;
        int var12 = class155.field2244 - var8;
        int var13 = 0;
        if (var7 < class155.field2240) {
            int var14 = class155.field2240 - var7;
            var9 -= var14;
            var7 = class155.field2240;
            var10 += var8 * var14;
            var11 += class155.field2244 * var14;
        }
        if (var7 + var9 >= class155.field2241) {
            var9 -= var7 + var9 + 1 - class155.field2241;
        }
        if (var6 < class155.field2248) {
            int var15 = class155.field2248 - var6;
            var8 -= var15;
            var6 = class155.field2248;
            var10 += var15;
            var11 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var8 >= class155.field2246) {
            int var16 = var6 + var8 + 1 - class155.field2246;
            var8 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (this.field3804) {
            this.method1680(class155.field2242, arg4, arg3, var10, var11, var8, var9, var12, var13);
            return;
        }
        this.method1677(class155.field2242, arg4, arg3, var10, var11, var8, var9, var12, var13);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IZLjava/awt/Component;)V")
    public class262(int arg0, boolean arg1, Component arg2) {
        this.field3802 = field3803 * 9;
        this.field3804 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < field3803; var6++) {
            this.method1675(var4, var5, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".charAt(var6), var6, false);
        }
        if (arg1 && this.field3804) {
            this.field3802 = field3803 * 9;
            this.field3804 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < field3803; var9++) {
                this.method1675(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".charAt(var9), var9, false);
            }
            if (!this.field3804) {
                this.field3802 = field3803 * 9;
                this.field3804 = false;
                for (int var10 = 0; var10 < field3803; var10++) {
                    this.method1675(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".charAt(var10), var10, true);
                }
            }
        }
        byte[] var11 = new byte[this.field3802];
        for (int var12 = 0; var12 < this.field3802; var12++) {
            var11[var12] = this.field3806[var12];
        }
        this.field3806 = var11;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field3805[var0] = var1 * 9;
        }
    }
}
