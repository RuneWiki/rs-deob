import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class523 implements class298 {

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "[[I")
    public static int[][] field7608 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "Ljava/lang/String;")
    public static String field7609 = null;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    private int field7579;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    private int field7584;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    private int field7586;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    private int field7592;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    private int field7594;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
    private int field7603;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "I")
    private int field7610;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
    private int field7613;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
    private int field7614;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!pu", name = "Q", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!pu", name = "R", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!pu", name = "H", descriptor = "Ljava/awt/Color;")
    private Color field7611;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "Ljava/awt/Font;")
    private Font field7588;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field7595;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field7585;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field7589;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field7593;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field7596;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field7601;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field7604;

    @OriginalMember(owner = "client!pu", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field7605;

    @OriginalMember(owner = "client!pu", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field7607;

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field7616;

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field7618;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "Z")
    private boolean field7590;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "Z")
    private boolean field7597;

    @OriginalMember(owner = "client!pu", name = "B", descriptor = "Z")
    private boolean field7606;

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "[Laq;")
    public static class146[] field7617;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/Object;Ljava/lang/String;)Z")
    private final boolean method3145(Class arg0, int arg1, Object arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field7600++;
        if (arg1 != 2) {
            this.field7592 = 86;
        }
        Field var5 = arg0.getDeclaredField(arg3);
        return var5.getBoolean(arg2);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public final void method2066(int arg0) {
        if (arg0 == 25766) {
            field7587++;
        }
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V")
    private final void method3146(int arg0) {
        field7620++;
        class647.method3741(class572.field8179[class677.field9526], class204.field3327.method2930((byte) -36), 0, class320.field5011[class677.field9526], class413.field6331[class677.field9526], class204.field3327.method2928((byte) -77));
        if (arg0 != -23280) {
            this.field7603 = 55;
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)I")
    public final int method2067(int arg0) {
        if (arg0 != 3185) {
            this.field7597 = true;
        }
        field7591++;
        return 0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)I")
    public final int method2064(int arg0) {
        field7582++;
        int var2 = -87 / ((-arg0 - 30) / 51);
        return 100;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;")
    private final Object method3147(Class arg0, String arg1, byte arg2) throws IllegalAccessException, NoSuchFieldException {
        field7581++;
        Field var4 = arg0.getDeclaredField(arg1);
        if (arg2 <= 85) {
            return null;
        } else {
            Object var5 = var4.get(class450.field6772);
            var4.set(class450.field6772, null);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(Ljava/lang/Class;ILjava/lang/Object;Ljava/lang/String;)I")
    private final int method3148(Class arg0, int arg1, Object arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg1 == 2) {
            field7602++;
            Field var5 = arg0.getDeclaredField(arg3);
            return var5.getInt(arg2);
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZ)V")
    public final void method2069(boolean arg0, boolean arg1) {
        if (!this.field7597) {
            if (class450.field6772 == null) {
                this.field7597 = true;
            } else if (this.field7588 == null) {
                try {
                    this.method3152((byte) -42);
                } catch (Exception var43) {
                    this.field7597 = true;
                }
            }
        }
        field7619++;
        if (this.field7597) {
            this.method3146(-23280);
        } else if (arg0) {
            Graphics var3 = class271.field4377.getGraphics();
            if (var3 == null) {
                class271.field4377.repaint();
            } else {
                try {
                    int var4 = class204.field3327.method2930((byte) -36);
                    String var5 = class204.field3327.method2928((byte) -77);
                    if (class518.field7504 == null) {
                        class518.field7504 = class271.field4377.createImage(class56.field732, class259.field4147);
                    }
                    Graphics var6 = class518.field7504.getGraphics();
                    int var7 = this.field7618.getWidth(null);
                    int var8 = this.field7616.getWidth(null);
                    int var9 = this.field7604.getWidth(null);
                    int var10 = this.field7618.getHeight(null);
                    int var11 = this.field7616.getHeight(null);
                    int var12 = this.field7604.getHeight(null);
                    var6.drawImage(this.field7618, this.method3149(var7, -29) + this.field7586 - (this.field7610 / 2), this.method3150(var10, (byte) -88) - -this.field7594, null);
                    int var13 = this.field7586 + var7 - (this.field7610 / 2);
                    int var14 = this.field7586 + (this.field7610 / 2);
                    for (int var15 = var13; var15 <= var14; var15 += var9) {
                        var6.drawImage(this.field7604, this.method3149(var7, -128) + this.field7586 + var15, this.method3150(var12, (byte) -82) - -this.field7594, null);
                    }
                    var6.drawImage(this.field7616, this.method3149(var8, -56) - (-this.field7586 - this.field7610 / 2), this.method3150(var11, (byte) -101) + this.field7594, null);
                    int var16 = this.field7607.getWidth(null);
                    int var17 = this.field7607.getHeight(null);
                    int var18 = this.field7585.getWidth(null);
                    int var19 = this.field7585.getHeight(null);
                    int var20 = this.field7596.getHeight(null);
                    int var21 = this.field7593.getWidth(null);
                    int var22 = this.field7593.getHeight(null);
                    int var23 = this.field7596.getWidth(null);
                    int var24 = this.field7589.getWidth(null);
                    int var25 = this.field7601.getWidth(null);
                    int var26 = this.method3149(this.field7579, -24) + this.field7584;
                    int var27 = this.method3150(this.field7592, (byte) -104) + this.field7614;
                    var6.drawImage(this.field7607, var26, (this.field7592 - var17) / 2 + var27, null);
                    var6.drawImage(this.field7585, this.field7579 + var26 - var18, (-var19 + this.field7592) / 2 + var27, null);
                    if (this.field7605 == null) {
                        this.field7605 = class271.field4377.createImage(this.field7579 - var16 - var18, this.field7592);
                    }
                    Graphics var28 = this.field7605.getGraphics();
                    for (int var29 = 0; var29 < this.field7579 - var16 - var18; var29 += var21) {
                        var28.drawImage(this.field7593, var29, 0, null);
                    }
                    for (int var30 = 0; var30 < this.field7579 - var16 - var18; var30 += var23) {
                        var28.drawImage(this.field7596, var30, this.field7592 - var20, null);
                    }
                    int var31 = (this.field7579 - var16 - var18) * var4 / 100;
                    if (var31 > 0) {
                        Image var32 = class271.field4377.createImage(var31, this.field7592 - var20 - var22);
                        int var33 = var32.getWidth(null);
                        Graphics var34 = var32.getGraphics();
                        int var35 = this.field7613 * class183.method1491(-86) / 10 % var24;
                        for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                            var34.drawImage(this.field7589, var36, 0, null);
                        }
                        var28.drawImage(var32, 0, var22, null);
                    }
                    int var38 = this.field7579 - var16 - var18 - var31;
                    if (var38 > 0) {
                        Image var39 = class271.field4377.createImage(var38, this.field7592 - var20 - var22);
                        int var40 = var39.getWidth(null);
                        Graphics var41 = var39.getGraphics();
                        for (int var42 = 0; var42 < var40; var42 += var25) {
                            var41.drawImage(this.field7601, var42, 0, null);
                        }
                        var28.drawImage(var39, var31, var22, null);
                    }
                    var6.drawImage(this.field7605, var16 + var26, var27, null);
                    var6.setFont(this.field7588);
                    var6.setColor(this.field7611);
                    var6.drawString(var5, var26 + ((this.field7579 - this.field7595.stringWidth(var5)) / 2), this.field7603 + var27 - (-(this.field7592 / 2) + -4));
                    var3.drawImage(class518.field7504, 0, 0, null);
                } catch (Exception var44) {
                    this.field7597 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I")
    private final int method3149(int arg0, int arg1) {
        field7615++;
        if (this.field7606) {
            return (class56.field732 - arg0) / 2;
        } else if (arg1 > -21) {
            return -27;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IJ)Z")
    public final boolean method2065(int arg0, long arg1) {
        field7583++;
        return arg0 == 26711 ? true : true;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)I")
    private final int method3150(int arg0, byte arg1) {
        field7599++;
        if (this.field7590) {
            return (class259.field4147 - arg0) / 2;
        } else {
            if (arg1 > -29) {
                this.field7584 = 23;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)V")
    public final void method2068(int arg0) {
        field7612++;
        class532.method3220(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)V")
    public static void method3151(int arg0) {
        field7608 = null;
        field7617 = null;
        field7609 = null;
        if (arg0 >= -62) {
            field7617 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    private final void method3152(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field7580++;
        Class var2 = class450.field6772.getClass();
        this.field7589 = (Image) this.method3147(var2, "bar", (byte) 127);
        this.field7601 = (Image) this.method3147(var2, "background", (byte) 109);
        this.field7607 = (Image) this.method3147(var2, "left", (byte) 87);
        this.field7585 = (Image) this.method3147(var2, "right", (byte) 102);
        this.field7593 = (Image) this.method3147(var2, "top", (byte) 110);
        this.field7596 = (Image) this.method3147(var2, "bottom", (byte) 121);
        this.field7618 = (Image) this.method3147(var2, "bodyLeft", (byte) 103);
        this.field7616 = (Image) this.method3147(var2, "bodyRight", (byte) 86);
        this.field7604 = (Image) this.method3147(var2, "bodyFill", (byte) 119);
        this.field7588 = (Font) this.method3147(var2, "bf", (byte) 124);
        this.field7595 = (FontMetrics) this.method3147(var2, "bfm", (byte) 127);
        this.field7611 = (Color) this.method3147(var2, "colourtext", (byte) 94);
        Object var3 = this.method3147(var2, "lb", (byte) 94);
        Class var4 = var3.getClass();
        this.field7606 = this.method3145(var4, 2, var3, "xMiddle");
        this.field7590 = this.method3145(var4, 2, var3, "yMiddle");
        this.field7584 = this.method3148(var4, 2, var3, "xOffset");
        this.field7614 = this.method3148(var4, 2, var3, "yOffset");
        this.field7579 = this.method3148(var4, 2, var3, "width");
        this.field7592 = this.method3148(var4, 2, var3, "height");
        this.field7586 = this.method3148(var4, 2, var3, "boxXOffset");
        this.field7594 = this.method3148(var4, 2, var3, "boxYOffset");
        this.field7610 = this.method3148(var4, 2, var3, "boxWidth");
        this.field7603 = this.method3148(var4, 2, var3, "textYOffset");
        if (arg0 < -10) {
            this.field7613 = this.method3148(var4, 2, var3, "offsetPerTenCycles");
        }
    }
}
