import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class664 implements class722 {

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field9315 = new CRC32();

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    private int field9298;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    private int field9303;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    private int field9304;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
    private int field9310;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
    private int field9314;

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "I")
    private int field9323;

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
    private int field9329;

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "I")
    private int field9333;

    @OriginalMember(owner = "client!rda", name = "O", descriptor = "I")
    private int field9336;

    @OriginalMember(owner = "client!rda", name = "D", descriptor = "Ljava/awt/Color;")
    private Color field9325;

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "Ljava/awt/Font;")
    private Font field9330;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field9307;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field9296;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field9299;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "Ljava/awt/Image;")
    private Image field9305;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field9309;

    @OriginalMember(owner = "client!rda", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field9324;

    @OriginalMember(owner = "client!rda", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field9328;

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field9332;

    @OriginalMember(owner = "client!rda", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field9334;

    @OriginalMember(owner = "client!rda", name = "N", descriptor = "Ljava/awt/Image;")
    private Image field9335;

    @OriginalMember(owner = "client!rda", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field9337;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "Z")
    private boolean field9297;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "Z")
    private boolean field9306;

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "Z")
    private boolean field9327;

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "[[I")
    public static int[][] field9322;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IJ)Z")
    public final boolean method2063(int arg0, long arg1) {
        if (arg0 >= -87) {
            this.field9334 = null;
        }
        field9301++;
        return true;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)I")
    public final int method2064(int arg0) {
        field9300++;
        if (arg0 < 44) {
            this.field9334 = null;
        }
        return 100;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public final void method2067(int arg0) {
        if (arg0 > 86) {
            class176.method1255((byte) -84);
            field9326++;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)I")
    private final int method3814(int arg0, int arg1) {
        if (arg0 != 2) {
            field9315 = null;
        }
        field9308++;
        return this.field9306 ? (class510.field7263 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
    private final void method3815(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field9317++;
        Class var2 = class466.field6830.getClass();
        this.field9324 = (Image) this.method3817(var2, "bar", 103);
        this.field9334 = (Image) this.method3817(var2, "background", 107);
        this.field9328 = (Image) this.method3817(var2, "left", arg0 ^ 0x7BC7);
        this.field9337 = (Image) this.method3817(var2, "right", 122);
        this.field9309 = (Image) this.method3817(var2, "top", 115);
        this.field9296 = (Image) this.method3817(var2, "bottom", arg0 - 31542);
        this.field9335 = (Image) this.method3817(var2, "bodyLeft", 110);
        if (arg0 != 31663) {
            this.method3814(-89, -2);
        }
        this.field9305 = (Image) this.method3817(var2, "bodyRight", 114);
        this.field9299 = (Image) this.method3817(var2, "bodyFill", 124);
        this.field9330 = (Font) this.method3817(var2, "bf", arg0 - 31550);
        this.field9307 = (FontMetrics) this.method3817(var2, "bfm", 121);
        this.field9325 = (Color) this.method3817(var2, "colourtext", 117);
        Object var3 = this.method3817(var2, "lb", 117);
        Class var4 = var3.getClass();
        this.field9297 = this.method3820(var4, var3, "xMiddle", -1);
        this.field9306 = this.method3820(var4, var3, "yMiddle", -1);
        this.field9310 = this.method3819(9868, "xOffset", var3, var4);
        this.field9298 = this.method3819(9868, "yOffset", var3, var4);
        this.field9336 = this.method3819(9868, "width", var3, var4);
        this.field9333 = this.method3819(9868, "height", var3, var4);
        this.field9329 = this.method3819(9868, "boxXOffset", var3, var4);
        this.field9314 = this.method3819(9868, "boxYOffset", var3, var4);
        this.field9323 = this.method3819(9868, "boxWidth", var3, var4);
        this.field9304 = this.method3819(arg0 ^ 0x5D23, "textYOffset", var3, var4);
        this.field9303 = this.method3819(arg0 ^ 0x5D23, "offsetPerTenCycles", var3, var4);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)V")
    public final void method2066(boolean arg0) {
        if (!arg0) {
            this.method2063(-101, 25L);
        }
        field9313++;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)I")
    private final int method3816(int arg0, byte arg1) {
        field9321++;
        if (arg1 < 5) {
            return -33;
        } else if (this.field9297) {
            return (class501.field7123 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
    private final Object method3817(Class arg0, String arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        field9318++;
        Field var4 = arg0.getDeclaredField(arg1);
        if (arg2 <= 99) {
            this.method2064(-84);
        }
        Object var5 = var4.get(class466.field6830);
        var4.set(class466.field6830, null);
        return var5;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)V")
    private final void method3818(boolean arg0) {
        class35.method184(class311.field4401.method3369(false), class384.field5807[class73.field1026], (byte) 126, class311.field4401.method3381(-107), class742.field10410[class73.field1026], class13.field178[class73.field1026]);
        field9316++;
        if (!arg0) {
            this.field9299 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)I")
    public final int method2069(byte arg0) {
        field9320++;
        if (arg0 != 82) {
            this.method2063(56, -125L);
        }
        return 0;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BZ)V")
    public final void method2070(byte arg0, boolean arg1) {
        if (!this.field9327) {
            if (class466.field6830 == null) {
                this.field9327 = true;
            } else if (this.field9330 == null) {
                try {
                    this.method3815(31663);
                } catch (Exception var43) {
                    this.field9327 = true;
                }
            }
        }
        field9331++;
        if (this.field9327) {
            this.method3818(true);
            return;
        }
        Graphics var3 = class106.field1476.getGraphics();
        if (var3 == null) {
            class106.field1476.repaint();
        } else {
            try {
                int var4 = class311.field4401.method3369(false);
                String var5 = class311.field4401.method3381(arg0 - 210);
                if (class457.field6742 == null) {
                    class457.field6742 = class106.field1476.createImage(class501.field7123, class510.field7263);
                }
                Graphics var6 = class457.field6742.getGraphics();
                var6.clearRect(0, 0, class501.field7123, class510.field7263);
                int var7 = this.field9335.getWidth(null);
                int var8 = this.field9305.getWidth(null);
                int var9 = this.field9299.getWidth(null);
                int var10 = this.field9335.getHeight(null);
                int var11 = this.field9305.getHeight(null);
                int var12 = this.field9299.getHeight(null);
                var6.drawImage(this.field9335, this.method3816(var7, (byte) 8) + (this.field9329 - this.field9323 / 2), this.method3814(2, var10) + this.field9314, null);
                int var13 = this.field9329 + var7 - (this.field9323 / 2);
                int var14 = this.field9323 / 2 + this.field9329;
                for (int var15 = var13; var15 <= var14; var15 += var9) {
                    var6.drawImage(this.field9299, var15 + (this.method3816(var7, (byte) 58) + this.field9329), this.method3814(2, var12) + this.field9314, null);
                }
                var6.drawImage(this.field9305, this.method3816(var8, (byte) 118) + (this.field9329 + (this.field9323 / 2)), this.method3814(2, var11) - -this.field9314, null);
                int var16 = this.field9328.getWidth(null);
                int var17 = this.field9328.getHeight(null);
                int var18 = this.field9337.getWidth(null);
                int var19 = this.field9337.getHeight(null);
                int var20 = this.field9296.getHeight(null);
                int var21 = this.field9309.getWidth(null);
                int var22 = this.field9309.getHeight(null);
                int var23 = this.field9296.getWidth(null);
                int var24 = this.field9324.getWidth(null);
                int var25 = this.field9334.getWidth(null);
                int var26 = this.method3816(this.field9336, (byte) 120) + this.field9310;
                int var27 = this.method3814(2, this.field9333) + this.field9298;
                var6.drawImage(this.field9328, var26, var27 + ((this.field9333 - var17) / 2), null);
                var6.drawImage(this.field9337, this.field9336 + var26 - var18, (-var19 + this.field9333) / 2 + var27, null);
                if (this.field9332 == null) {
                    this.field9332 = class106.field1476.createImage(this.field9336 - var16 - var18, this.field9333);
                }
                Graphics var28 = this.field9332.getGraphics();
                for (int var29 = 0; var29 < this.field9336 - var16 - var18; var29 += var21) {
                    var28.drawImage(this.field9309, var29, 0, null);
                }
                for (int var30 = 0; var30 < (this.field9336 - var18 - var16); var30 += var23) {
                    var28.drawImage(this.field9296, var30, this.field9333 - var20, null);
                }
                int var31 = (this.field9336 - var16 - var18) * var4 / 100;
                if (var31 > 0) {
                    Image var32 = class106.field1476.createImage(var31, this.field9333 - var22 - var20);
                    int var33 = var32.getWidth(null);
                    Graphics var34 = var32.getGraphics();
                    int var35 = this.field9303 * class689.method3911(0) / 10 % var24;
                    for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                        var34.drawImage(this.field9324, var36, 0, null);
                    }
                    var28.drawImage(var32, 0, var22, null);
                }
                int var38 = this.field9336 - (var16 + var18 + var31);
                if (var38 > 0) {
                    Image var39 = class106.field1476.createImage(var38, this.field9333 - var22 - var20);
                    int var40 = var39.getWidth(null);
                    Graphics var41 = var39.getGraphics();
                    for (int var42 = 0; var42 < var40; var42 += var25) {
                        var41.drawImage(this.field9334, var42, 0, null);
                    }
                    var28.drawImage(var39, var31, var22, null);
                }
                var6.drawImage(this.field9332, var16 + var26, var27, null);
                var6.setFont(this.field9330);
                var6.setColor(this.field9325);
                var6.drawString(var5, var26 + ((this.field9336 - this.field9307.stringWidth(var5)) / 2), this.field9333 / 2 + var27 + 4 + this.field9304);
                var3.drawImage(class457.field6742, 0, 0, null);
            } catch (Exception var44) {
                this.field9327 = true;
            }
        }
        if (arg0 != 99) {
            this.method2069((byte) 9);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)I")
    private final int method3819(int arg0, String arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field9319++;
        if (arg0 == 9868) {
            Field var5 = arg3.getDeclaredField(arg1);
            return var5.getInt(arg2);
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;I)Z")
    private final boolean method3820(Class arg0, Object arg1, String arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        field9312++;
        if (arg3 != -1) {
            this.method2064(66);
        }
        Field var5 = arg0.getDeclaredField(arg2);
        return var5.getBoolean(arg1);
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)V")
    public static void method3821(int arg0) {
        field9322 = null;
        field9315 = null;
        if (arg0 != 0) {
            method3821(-15);
        }
    }
}
