import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 extends class20 {

    @OriginalMember(owner = "mapview!a", name = "x", descriptor = "Z")
    private boolean field70 = false;

    @OriginalMember(owner = "mapview!a", name = "z", descriptor = "I")
    private int field72 = 0;

    @OriginalMember(owner = "mapview!a", name = "w", descriptor = "[B")
    private byte[] field69 = new byte[100000];

    @OriginalMember(owner = "mapview!a", name = "y", descriptor = "[I")
    private static int[] field71 = new int[256];

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([I[BIIIIIII)V", line = 5)
    private final void method31(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "()I", line = 60)
    public final int method32() {
        return this.field69[6];
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Lk;IIIZ)V", line = 63)
    private final void method33(class21 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field70 || arg3 == 0) {
            arg4 = false;
        }
        for (int var6 = 0; var6 < arg0.method137((byte) -124); var6++) {
            int var7 = field71[arg0.method143(-119, var6)];
            if (arg4) {
                this.method34(var7, arg1 + 1, arg2, 0, this.field69);
                this.method34(var7, arg1, arg2 + 1, 0, this.field69);
            }
            this.method34(var7, arg1, arg2, arg3, this.field69);
            arg1 += this.field69[var7 + 7];
        }
    }

    @OriginalMember(owner = "mapview!a", name = "<init>", descriptor = "(IZLjava/awt/Component;)V", line = 445)
    public class1(int arg0, boolean arg1, Component arg2) {
        this.field72 = 855;
        this.field70 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < 95; var6++) {
            this.method40(var4, var5, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var6), var6, false);
        }
        if (arg1 && this.field70) {
            this.field72 = 855;
            this.field70 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < 95; var9++) {
                this.method40(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var9), var9, false);
            }
            if (!this.field70) {
                this.field72 = 855;
                this.field70 = false;
                for (int var10 = 0; var10 < 95; var10++) {
                    this.method40(var7, var8, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10), var10, true);
                }
            }
        }
        byte[] var11 = new byte[this.field72];
        for (int var12 = 0; var12 < this.field72; var12++) {
            var11[var12] = this.field69[var12];
        }
        this.field69 = var11;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIII[B)V", line = 92)
    private final void method34(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = arg4[arg0 + 5] + arg1;
        int var7 = arg2 - arg4[arg0 + 6];
        int var8 = arg4[arg0 + 3];
        int var9 = arg4[arg0 + 4];
        int var10 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var11 = class20.field248 * var7 + var6;
        int var12 = class20.field248 - var8;
        int var13 = 0;
        if (var7 < class20.field246) {
            int var14 = class20.field246 - var7;
            var9 -= var14;
            var7 = class20.field246;
            var10 += var8 * var14;
            var11 += class20.field248 * var14;
        }
        if (var7 + var9 >= class20.field249) {
            var9 -= var7 + var9 + 1 - class20.field249;
        }
        if (var6 < class20.field251) {
            int var15 = class20.field251 - var6;
            var8 -= var15;
            var6 = class20.field251;
            var10 += var15;
            var11 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var8 >= class20.field252) {
            int var16 = var6 + var8 + 1 - class20.field252;
            var8 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (this.field70) {
            this.method35(class20.field247, arg4, arg3, var10, var11, var8, var9, var12, var13);
        } else {
            this.method31(class20.field247, arg4, arg3, var10, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "([I[BIIIIIII)V", line = 154)
    private final void method35(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "()I", line = 189)
    public final int method36() {
        return this.field69[8] - 1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field71[var0] = var1 * 9;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Lk;)I", line = 196)
    private final int method37(class21 arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.method137((byte) 28); var3++) {
            if (arg0.method143(-111, var3) == 64 && var3 + 4 < arg0.method137((byte) 115) && arg0.method143(-123, var3 + 4) == 64) {
                var3 += 4;
            } else if (arg0.method143(-127, var3) == 126 && var3 + 4 < arg0.method137((byte) 95) && arg0.method143(-100, var3 + 4) == 126) {
                var3 += 4;
            } else {
                var2 += this.field69[field71[arg0.method143(-87, var3)] + 7];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "()V", line = 217)
    public static void method38() {
        field71 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(Lk;IIIZ)V", line = 221)
    public final void method39(class21 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method37(arg0) / 2;
        int var7 = this.method32();
        if (arg1 - var6 <= class20.field252 && (arg1 + var6 >= class20.field251 && (arg2 - var7 <= class20.field249 && arg2 >= 0))) {
            this.method33(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 240)
    private final void method40(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4) {
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
        Image var12 = class28.field348.createImage(var6, var10);
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
        this.field69[arg3 * 9] = (byte) (this.field72 / 16384);
        this.field69[arg3 * 9 + 1] = (byte) (this.field72 / 128 & 0x7F);
        this.field69[arg3 * 9 + 2] = (byte) (this.field72 & 0x7F);
        this.field69[arg3 * 9 + 3] = (byte) (var20 - var18);
        this.field69[arg3 * 9 + 4] = (byte) (var21 - var19);
        this.field69[arg3 * 9 + 5] = (byte) var18;
        this.field69[arg3 * 9 + 6] = (byte) (var9 - var19);
        this.field69[arg3 * 9 + 7] = (byte) var7;
        this.field69[arg3 * 9 + 8] = (byte) var11;
        for (int var34 = var19; var34 < var21; var34++) {
            for (int var35 = var18; var35 < var20; var35++) {
                int var36 = var14[var6 * var34 + var35] & 0xFF;
                if (var36 > 30 && var36 < 230) {
                    this.field70 = true;
                }
                this.field69[this.field72++] = (byte) var36;
            }
        }
    }
}
