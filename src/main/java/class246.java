import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class246 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
    private boolean field4057 = false;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    private int field4058 = 0;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[B")
    private byte[] field4056 = new byte[100000];

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Ljava/lang/String;")
    private static String field4059 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| " + String.valueOf('Ä') + 'Ë' + 'Ï' + 'Ö' + 'Ü' + 'ä' + 'ë' + 'ï' + 'ö' + 'ü' + 'ÿ' + 'ß' + 'Á' + 'À' + 'É' + 'È' + 'Í' + 'Ì' + 'Ó' + 'Ò' + 'Ú' + 'Ù' + 'á' + 'à' + 'é' + 'è' + 'í' + 'ì' + 'ó' + 'ò' + 'ú' + 'ù' + 'Â' + 'Ê' + 'Î' + 'Ô' + 'Û' + 'â' + 'ê' + 'î' + 'ô' + 'û' + 'Æ' + 'æ';

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    private static int field4060 = field4059.length();

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[I")
    private static int[] field4061 = new int[256];

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()I", line = 4)
    public final int method1778() {
        return this.field4056[8] - 1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII[B)V", line = 8)
    private final void method1779(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = arg4[arg0 + 5] + arg1;
        int var7 = arg2 - arg4[arg0 + 6];
        int var8 = arg4[arg0 + 3];
        int var9 = arg4[arg0 + 4];
        int var10 = arg4[arg0 + 1] * 128 + arg4[arg0] * 16384 + arg4[arg0 + 2];
        int var11 = class181.field3034 * var7 + var6;
        int var12 = class181.field3034 - var8;
        int var13 = 0;
        if (var7 < class181.field3036) {
            int var14 = class181.field3036 - var7;
            var9 -= var14;
            var7 = class181.field3036;
            var10 += var8 * var14;
            var11 += class181.field3034 * var14;
        }
        if (var7 + var9 >= class181.field3041) {
            var9 -= var7 + var9 + 1 - class181.field3041;
        }
        if (var6 < class181.field3038) {
            int var15 = class181.field3038 - var6;
            var8 -= var15;
            var6 = class181.field3038;
            var10 += var15;
            var11 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var8 >= class181.field3033) {
            int var16 = var6 + var8 + 1 - class181.field3033;
            var8 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (this.field4057) {
            this.method1781(class181.field3040, arg4, arg3, var10, var11, var8, var9, var12, var13);
        } else {
            this.method1782(class181.field3040, arg4, arg3, var10, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()I", line = 68)
    public final int method1780() {
        return this.field4056[6];
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([I[BIIIIIII)V", line = 73)
    private final void method1781(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "([I[BIIIIIII)V", line = 110)
    private final void method1782(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IZLjava/awt/Component;)V", line = 414)
    public class246(int arg0, boolean arg1, Component arg2) {
        this.field4058 = field4060 * 9;
        this.field4057 = false;
        Font var4 = new Font("Helvetica", arg1 ? 1 : 0, arg0);
        FontMetrics var5 = arg2.getFontMetrics(var4);
        for (int var6 = 0; var6 < field4060; var6++) {
            this.method1784(var4, var5, field4059.charAt(var6), var6, false);
        }
        if (arg1 && this.field4057) {
            this.field4058 = field4060 * 9;
            this.field4057 = false;
            Font var7 = new Font("Helvetica", 0, arg0);
            FontMetrics var8 = arg2.getFontMetrics(var7);
            for (int var9 = 0; var9 < field4060; var9++) {
                this.method1784(var7, var8, field4059.charAt(var9), var9, false);
            }
            if (!this.field4057) {
                this.field4058 = field4060 * 9;
                this.field4057 = false;
                for (int var10 = 0; var10 < field4060; var10++) {
                    this.method1784(var7, var8, field4059.charAt(var10), var10, true);
                }
            }
        }
        byte[] var11 = new byte[this.field4058];
        for (int var12 = 0; var12 < this.field4058; var12++) {
            var11[var12] = this.field4056[var12];
        }
        this.field4056 = var11;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lok;)I", line = 171)
    private final int method1783(class146 arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.method1094((byte) -22); var3++) {
            if (arg0.method1115(var3, (byte) 127) == 64 && var3 + 4 < arg0.method1094((byte) -126) && arg0.method1115(var3 + 4, (byte) 127) == 64) {
                var3 += 4;
            } else if (arg0.method1115(var3, (byte) 127) == 126 && var3 + 4 < arg0.method1094((byte) -62) && arg0.method1115(var3 + 4, (byte) 127) == 126) {
                var3 += 4;
            } else {
                var2 += this.field4056[field4061[arg0.method1115(var3, (byte) 127)] + 7];
            }
        }
        return var2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = field4059.indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field4061[var0] = var1 * 9;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V", line = 199)
    private final void method1784(Font arg0, FontMetrics arg1, char arg2, int arg3, boolean arg4) {
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
        Image var12 = class75.field1228.createImage(var6, var10);
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
        this.field4056[arg3 * 9] = (byte) (this.field4058 / 16384);
        this.field4056[arg3 * 9 + 1] = (byte) (this.field4058 / 128 & 0x7F);
        this.field4056[arg3 * 9 + 2] = (byte) (this.field4058 & 0x7F);
        this.field4056[arg3 * 9 + 3] = (byte) (var20 - var18);
        this.field4056[arg3 * 9 + 4] = (byte) (var21 - var19);
        this.field4056[arg3 * 9 + 5] = (byte) var18;
        this.field4056[arg3 * 9 + 6] = (byte) (var9 - var19);
        this.field4056[arg3 * 9 + 7] = (byte) var7;
        this.field4056[arg3 * 9 + 8] = (byte) var11;
        for (int var34 = var19; var34 < var21; var34++) {
            for (int var35 = var18; var35 < var20; var35++) {
                int var36 = var14[var6 * var34 + var35] & 0xFF;
                if (var36 > 30 && var36 < 230) {
                    this.field4057 = true;
                }
                this.field4056[this.field4058++] = (byte) var36;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()V", line = 384)
    public static void method1785() {
        field4059 = null;
        field4061 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lok;IIIZ)V", line = 392)
    private final void method1786(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field4057 || arg3 == 0) {
            arg4 = false;
        }
        for (int var6 = 0; var6 < arg0.method1094((byte) -123); var6++) {
            int var7 = field4061[arg0.method1115(var6, (byte) 127)];
            if (arg4) {
                this.method1779(var7, arg1 + 1, arg2, 1, this.field4056);
                this.method1779(var7, arg1, arg2 + 1, 1, this.field4056);
            }
            this.method1779(var7, arg1, arg2, arg3, this.field4056);
            arg1 += this.field4056[var7 + 7];
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Lok;IIIZ)V", line = 470)
    public final void method1787(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.method1783(arg0) / 2;
        int var7 = this.method1780();
        if (arg1 - var6 <= class181.field3033 && arg1 + var6 >= class181.field3038 && arg2 - var7 <= class181.field3041 && arg2 >= 0) {
            this.method1786(arg0, arg1 - var6, arg2, arg3, arg4);
        }
    }
}
