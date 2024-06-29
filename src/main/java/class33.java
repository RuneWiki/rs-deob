import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.DataInputStream;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class33 extends class4 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!r", name = "r", descriptor = "Lna;")
    public static class26 field477 = method219("Jewellery", 105);

    @OriginalMember(owner = "mapview!r", name = "v", descriptor = "Lna;")
    public static class26 field481 = method219("Loading", 111);

    @OriginalMember(owner = "mapview!r", name = "q", descriptor = "Ljava/awt/Font;")
    private static Font field476;

    @OriginalMember(owner = "mapview!r", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field480;

    @OriginalMember(owner = "mapview!r", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field479;

    @OriginalMember(owner = "mapview!r", name = "s", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field478;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 9)
    public static void method216(int arg0) {
        field481 = null;
        if (arg0 != 30) {
            field481 = (class26) null;
        }
        field478 = null;
        field476 = null;
        field477 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 22)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(BLna;Ljava/awt/Color;I)V", line = 31)
    public static final void method217(byte arg0, class26 arg1, Color arg2, int arg3) {
        try {
            Graphics var4 = class32.field467.getGraphics();
            if (field476 == null) {
                field476 = new Font("Helvetica", 1, 13);
                class1.field1 = class32.field467.getFontMetrics(field476);
            }
            if (class27.field411) {
                class27.field411 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class6.field63, class5.field55);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class23.field247 == null) {
                    class23.field247 = class32.field467.createImage(304, 34);
                }
                Graphics var5 = class23.field247.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(field476);
                var5.setColor(Color.white);
                arg1.method170((304 - arg1.method175(0, class1.field1)) / 2, (byte) 96, 22, var5);
                var4.drawImage(class23.field247, class6.field63 / 2 + -152, class5.field55 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = class6.field63 / 2 + -152;
                int var8 = class5.field55 / 2 + -18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 - -1, var8 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - arg3 * 3, 30);
                var4.setFont(field476);
                var4.setColor(Color.white);
                arg1.method170((-arg1.method175(0, class1.field1) + 304) / 2 + var7, (byte) 73, var8 - -22, var4);
            }
            if (arg0 != 85) {
                field476 = (Font) null;
            }
        } catch (Exception var11) {
            class32.field467.repaint();
        }
    }

    @OriginalMember(owner = "mapview!r", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 104)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field479 == arg0;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(II)I", line = 111)
    public static int method218(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!r", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 120)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field479 = arg0;
        arg0.setDimensions(super.field51, super.field36);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field480);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Ljava/lang/String;I)Lna;", line = 151)
    public static final class26 method219(String arg0, int arg1) {
        if (arg1 <= 76) {
            method217((byte) -74, (class26) null, (Color) null, -75);
        }
        int var2 = 0;
        byte[] var3 = arg0.getBytes();
        int var4 = var3.length;
        class26 var5 = new class26();
        var5.field405 = new byte[var4];
        while (var2 < var4) {
            int var6 = var3[var2++] & 255;
            if (~var6 >= -46 && 40 <= var6) {
                if (~var2 <= ~var4) {
                    break;
                }
                int var7 = 255 & var3[var2++];
                var5.field405[var5.field404++] = (byte) ((var6 - 40) * 43 + (var7 - 48));
            } else if (var6 != 0) {
                var5.field405[var5.field404++] = (byte) var6;
            }
        }
        var5.method176(-2);
        return var5.method191((byte) -82);
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)I", line = 190)
    public static final int method220(int arg0) {
        if (arg0 != 1) {
            field478 = (DataInputStream) null;
        }
        if (class23.field245 == null) {
            return 0;
        } else {
            return class23.field245.field503 != null ? class12.field118[class23.field245.field503[class6.field65] & 255] : class12.field118[class23.field245.field505 & 255];
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 209)
    public final void method31(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method223((byte) -8);
        if (arg2 > 72) {
            arg3.drawImage(super.field41, arg1, arg0, this);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 220)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 224)
    public static final int method221(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        if (arg0 != 128) {
            method216(32);
        }
        if (~var2 == -8365) {
            return 128;
        } else {
            if (~var2 >= -1 || 256 <= var2) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Ljava/awt/Component;BII)V", line = 242)
    public final void method25(Component arg0, byte arg1, int arg2, int arg3) {
        super.field50 = new int[arg2 * arg3 + 1];
        super.field36 = arg2;
        super.field51 = arg3;
        this.field480 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field41 = arg0.createImage(this);
        this.method223((byte) -22);
        arg0.prepareImage(super.field41, this);
        this.method223((byte) -124);
        if (arg1 < 44) {
            this.field480 = (ColorModel) null;
        }
        arg0.prepareImage(super.field41, this);
        this.method223((byte) -121);
        arg0.prepareImage(super.field41, this);
        this.method28((byte) 107);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIILp;)Z", line = 265)
    public static final boolean method222(int arg0, int arg1, int arg2, class29 arg3) {
        int var4 = 11 % ((arg0 - 23) / 60);
        byte[] var5 = arg3.method200(arg1, 11808, arg2);
        if (var5 != null) {
            class26.method177(-114, var5);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(B)V", line = 279)
    private final synchronized void method223(byte arg0) {
        if (this.field479 != null) {
            this.field479.setPixels(0, 0, super.field51, super.field36, this.field480, super.field50, 0, super.field51);
            this.field479.imageComplete(2);
            int var2 = 13 % ((-84 - arg0) / 34);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 297)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!r", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 308)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field479 == arg0) {
            this.field479 = null;
        }
    }
}
