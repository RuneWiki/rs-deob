import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class448 implements class130 {

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "Lde;")
    public static class556 field6129 = new class556();

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    private int field6094;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    private int field6106;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    private int field6107;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    private int field6109;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    private int field6110;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    private int field6112;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    private int field6117;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    private int field6124;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    private int field6125;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Ljava/awt/Color;")
    private Color field6101;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Ljava/awt/Font;")
    private Font field6116;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field6133;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field6102;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field6104;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field6108;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field6111;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field6113;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field6115;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field6118;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field6130;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Ljava/awt/Image;")
    private Image field6131;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field6132;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Z")
    private boolean field6100;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "Z")
    private boolean field6121;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "Z")
    private boolean field6127;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V")
    public static void method2668(boolean arg0) {
        field6129 = null;
        if (arg0) {
            method2668(false);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZB)V")
    public final void method968(boolean arg0, byte arg1) {
        field6098++;
        if (!this.field6127) {
            if (class319.field4527 == null) {
                this.field6127 = true;
            } else if (this.field6116 == null) {
                try {
                    this.method2673(-58);
                } catch (Exception var43) {
                    this.field6127 = true;
                }
            }
        }
        if (this.field6127) {
            this.method2674(arg1 ^ 0x31);
            return;
        }
        Graphics var3 = class629.field8819.getGraphics();
        if (arg1 != -84) {
            this.method967(79, -121L);
        }
        if (var3 == null) {
            class629.field8819.repaint();
            return;
        }
        try {
            int var4 = class590.field8323.method3144(arg1 + 5292);
            String var5 = class590.field8323.method3145(true);
            if (class687.field9549 == null) {
                class687.field9549 = class629.field8819.createImage(class428.field5825, class714.field9895);
            }
            Graphics var6 = class687.field9549.getGraphics();
            var6.clearRect(0, 0, class428.field5825, class714.field9895);
            int var7 = this.field6111.getWidth(null);
            int var8 = this.field6130.getWidth(null);
            int var9 = this.field6102.getWidth(null);
            int var10 = this.field6111.getHeight(null);
            int var11 = this.field6130.getHeight(null);
            int var12 = this.field6102.getHeight(null);
            var6.drawImage(this.field6111, this.method2669(var7, -98) + this.field6112 - this.field6110 / 2, this.method2675((byte) -92, var10) - -this.field6109, null);
            int var13 = this.field6112 + var7 - (this.field6110 / 2);
            int var14 = this.field6110 / 2 + this.field6112;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field6102, var15 + this.method2669(var7, -81) + this.field6112, this.method2675((byte) -124, var12) - -this.field6109, null);
            }
            var6.drawImage(this.field6130, this.method2669(var8, arg1 ^ 0x62) + (this.field6112 + (this.field6110 / 2)), this.method2675((byte) -110, var11) + this.field6109, null);
            int var16 = this.field6104.getWidth(null);
            int var17 = this.field6104.getHeight(null);
            int var18 = this.field6115.getWidth(null);
            int var19 = this.field6115.getHeight(null);
            int var20 = this.field6108.getHeight(null);
            int var21 = this.field6113.getWidth(null);
            int var22 = this.field6113.getHeight(null);
            int var23 = this.field6108.getWidth(null);
            int var24 = this.field6132.getWidth(null);
            int var25 = this.field6118.getWidth(null);
            int var26 = this.method2669(this.field6125, -9) + this.field6124;
            int var27 = this.method2675((byte) -126, this.field6094) + this.field6106;
            var6.drawImage(this.field6104, var26, (this.field6094 - var17) / 2 + var27, null);
            var6.drawImage(this.field6115, this.field6125 + var26 - var18, var27 - -((this.field6094 - var19) / 2), null);
            if (this.field6131 == null) {
                this.field6131 = class629.field8819.createImage(this.field6125 - var16 - var18, this.field6094);
            }
            Graphics var28 = this.field6131.getGraphics();
            for (int var29 = 0; var29 < this.field6125 - var16 - var18; var29 += var21) {
                var28.drawImage(this.field6113, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field6125 - var16 - var18); var30 += var23) {
                var28.drawImage(this.field6108, var30, this.field6094 - var20, null);
            }
            int var31 = (this.field6125 - (var16 + var18)) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class629.field8819.createImage(var31, this.field6094 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field6117 * class246.method1630((byte) 120) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field6132, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field6125 - var16 - var18 - var31;
            if (var38 > 0) {
                Image var39 = class629.field8819.createImage(var38, this.field6094 - var20 - var22);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field6118, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field6131, var16 + var26, var27, null);
            var6.setFont(this.field6116);
            var6.setColor(this.field6101);
            var6.drawString(var5, var26 + (this.field6125 - this.field6133.stringWidth(var5)) / 2, var27 - -this.field6107 + this.field6094 / 2 + 4);
            var3.drawImage(class687.field9549, 0, 0, null);
        } catch (Exception var44) {
            this.field6127 = true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
    private final int method2669(int arg0, int arg1) {
        field6128++;
        if (arg1 >= -1) {
            this.method2674(44);
        }
        return this.field6121 ? (class428.field5825 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;B)Z")
    private final boolean method2670(Object arg0, String arg1, Class arg2, byte arg3) throws IllegalAccessException, NoSuchFieldException {
        field6119++;
        Field var5 = arg2.getDeclaredField(arg1);
        if (arg3 != -64) {
            this.method968(false, (byte) -3);
        }
        return var5.getBoolean(arg0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Object;")
    private final Object method2671(String arg0, int arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
        field6099++;
        Field var4 = arg2.getDeclaredField(arg0);
        Object var5 = var4.get(class319.field4527);
        var4.set(class319.field4527, null);
        return arg1 == -1485 ? var5 : null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)I")
    public final int method970(boolean arg0) {
        if (!arg0) {
            this.field6111 = null;
        }
        field6095++;
        return 100;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZIII)V")
    public static final void method2672(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (class161.field2561 != null && (arg3 != 3 || class257.field3773 != arg1 || class317.field4520 != arg0)) {
            class432.method2587(class161.field2561, -4286143, class519.field7328);
            class161.field2561 = null;
        }
        if (arg4 != 2) {
            return;
        }
        field6097++;
        if (arg3 == 3 && class161.field2561 == null) {
            class161.field2561 = class104.method733(class519.field7328, 0, 0, arg0, (byte) 120, arg1);
            if (class161.field2561 != null) {
                class257.field3773 = arg1;
                class317.field4520 = arg0;
                class580.method3397((byte) 13);
            }
        }
        if (arg3 == 3 && class161.field2561 == null) {
            method2672(-1, -1, true, class21.field353.field10097.method3352(-71), 2, arg5);
            return;
        }
        Container var6;
        if (class161.field2561 != null) {
            var6 = class161.field2561;
            class179.field2787 = arg1;
            class63.field759 = arg0;
        } else if (class384.field5278 == null) {
            if (class319.field4527 == null) {
                var6 = class742.field10293;
            } else {
                var6 = class319.field4527;
            }
            class179.field2787 = var6.getSize().width;
            class63.field759 = var6.getSize().height;
        } else {
            Insets var7 = class384.field5278.getInsets();
            class179.field2787 = class384.field5278.getSize().width - var7.left - var7.right;
            class63.field759 = class384.field5278.getSize().height - var7.top - var7.bottom;
            var6 = class384.field5278;
        }
        if (arg3 == 1) {
            class714.field9895 = class296.field4307;
            class270.field3918 = (class179.field2787 - class527.field7532) / 2;
            class423.field5786 = 0;
            class428.field5825 = class527.field7532;
        } else {
            class666.method3796((byte) 29);
        }
        if (class622.field8739 != class300.field4326) {
            boolean var10000;
            if (class428.field5825 < 1024 && class714.field9895 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg2) {
            class467.method2789(arg4 + 122);
        } else {
            class629.field8819.setSize(class428.field5825, class714.field9895);
            if (class195.field2997) {
                class512.method3093(class629.field8819, (byte) -26);
            } else {
                class37.field491.method475(class629.field8819, class428.field5825, class714.field9895);
            }
            if (class384.field5278 == var6) {
                Insets var8 = class384.field5278.getInsets();
                class629.field8819.setLocation(class270.field3918 + var8.left, class423.field5786 + var8.top);
            } else {
                class629.field8819.setLocation(class270.field3918, class423.field5786);
            }
        }
        if (arg3 < 2) {
            class710.field9871 = false;
        } else {
            class710.field9871 = true;
        }
        if (class371.field5137 != -1) {
            class661.method3773(true, -65);
        }
        if (class527.field7529 != null && class695.method3923(class266.field3873, false)) {
            class301.method1949(-102);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class698.field9719[var9] = true;
        }
        class599.field8412 = true;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    private final void method2673(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field6122++;
        Class var2 = class319.field4527.getClass();
        this.field6132 = (Image) this.method2671("bar", -1485, var2);
        this.field6118 = (Image) this.method2671("background", -1485, var2);
        this.field6104 = (Image) this.method2671("left", -1485, var2);
        this.field6115 = (Image) this.method2671("right", -1485, var2);
        this.field6113 = (Image) this.method2671("top", -1485, var2);
        this.field6108 = (Image) this.method2671("bottom", -1485, var2);
        this.field6111 = (Image) this.method2671("bodyLeft", -1485, var2);
        this.field6130 = (Image) this.method2671("bodyRight", -1485, var2);
        this.field6102 = (Image) this.method2671("bodyFill", -1485, var2);
        this.field6116 = (Font) this.method2671("bf", -1485, var2);
        this.field6133 = (FontMetrics) this.method2671("bfm", -1485, var2);
        this.field6101 = (Color) this.method2671("colourtext", -1485, var2);
        Object var3 = this.method2671("lb", -1485, var2);
        Class var4 = var3.getClass();
        this.field6121 = this.method2670(var3, "xMiddle", var4, (byte) -64);
        this.field6100 = this.method2670(var3, "yMiddle", var4, (byte) -64);
        if (arg0 >= -14) {
            this.field6130 = null;
        }
        this.field6124 = this.method2676(0, var4, var3, "xOffset");
        this.field6106 = this.method2676(0, var4, var3, "yOffset");
        this.field6125 = this.method2676(0, var4, var3, "width");
        this.field6094 = this.method2676(0, var4, var3, "height");
        this.field6112 = this.method2676(0, var4, var3, "boxXOffset");
        this.field6109 = this.method2676(0, var4, var3, "boxYOffset");
        this.field6110 = this.method2676(0, var4, var3, "boxWidth");
        this.field6107 = this.method2676(0, var4, var3, "textYOffset");
        this.field6117 = this.method2676(0, var4, var3, "offsetPerTenCycles");
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public final void method969(byte arg0) {
        field6120++;
        if (arg0 <= 66) {
            this.method968(true, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public final void method971(int arg0) {
        if (arg0 == 4005) {
            field6123++;
            class227.method1548(arg0 - 4126);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IJ)Z")
    public final boolean method967(int arg0, long arg1) {
        field6114++;
        if (arg0 != -30245) {
            this.field6111 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
    public final int method966(int arg0) {
        if (arg0 != 9619) {
            this.field6121 = true;
        }
        field6105++;
        return 0;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    private final void method2674(int arg0) {
        field6126++;
        int var2 = 109 % ((arg0 + 14) / 63);
        class269.method1745(301, class590.field8323.method3145(true), class590.field8323.method3144(5208), class688.field9562[class222.field3426], class727.field10045[class222.field3426], class98.field1116[class222.field3426]);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)I")
    private final int method2675(byte arg0, int arg1) {
        if (arg0 >= -77) {
            this.method966(118);
        }
        field6103++;
        return this.field6100 ? (class714.field9895 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I")
    private final int method2676(int arg0, Class arg1, Object arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field6096++;
        Field var5 = arg1.getDeclaredField(arg3);
        if (arg0 != 0) {
            this.method968(true, (byte) 29);
        }
        return var5.getInt(arg2);
    }
}
