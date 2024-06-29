import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class70 extends class342 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field1216 = 0;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "[C")
    public static char[] field1230 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "Lth;")
    public static class57 field1217;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "Lth;")
    public static class57 field1229;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1212;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1220;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "[I")
    public static int[] field1223;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 9)
    public static void method595(boolean arg0) {
        field1229 = null;
        field1230 = null;
        field1217 = null;
        field1223 = null;
        if (arg0) {
            method600(29);
        }
    }

    @OriginalMember(owner = "client!kl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 24)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field1209++;
        this.field1220 = arg0;
        arg0.setDimensions(this.field5453, this.field5457);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1212);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 36)
    public static final int method596(String arg0, int arg1) {
        field1219++;
        int var2 = 0;
        int var3 = arg0.length();
        if (arg1 == -28712) {
            for (int var4 = 0; var4 < var3; var4++) {
                var2 = class162.method1258(arg0.charAt(var4), -8226) + (var2 << 5) - var2;
            }
            return var2;
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!kl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 64)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1220 == arg0) {
            this.field1220 = null;
        }
        field1227++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 77)
    public static final void method597(Object[] arg0, long[] arg1, int arg2) {
        class329.method2319(arg1.length - 1, arg0, 0, arg1, arg2 + 662);
        field1226++;
        if (arg2 != -537) {
            method597((Object[]) null, (long[]) null, -57);
        }
    }

    @OriginalMember(owner = "client!kl", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 89)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1221++;
        return true;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 97)
    public final void method572(int arg0, int arg1, byte arg2, Graphics arg3) {
        this.method599((byte) 124);
        arg3.drawImage(this.field5456, arg0, arg1, this);
        field1210++;
        if (arg2 > -120) {
            method597((Object[]) null, (long[]) null, 89);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILug;I)V", line = 110)
    public static final void method598(int arg0, class220 arg1, int arg2) {
        if (arg2 != 13402) {
            field1230 = (char[]) null;
        }
        field1213++;
        if (class332.field5261 < arg1.field3515) {
            class213.method1613(arg2 ^ 0x34DA, arg1);
        } else if (arg1.field3479 >= class332.field5261) {
            class305.method2176(arg1, 65);
        } else {
            class75.method627(arg1, arg2 ^ 0x347D);
        }
        if (arg1.field3577 < 128 || arg1.field3511 < 128 || arg1.field3577 >= 13184 || arg1.field3511 >= 13184) {
            arg1.field3552 = -1;
            arg1.field3479 = 0;
            arg1.field3515 = 0;
            arg1.field3547 = -1;
            arg1.field3577 = arg1.field3519[0] * 128 + (arg1.method1634(-1) * 64);
            arg1.field3511 = arg1.field3553[0] * 128 + arg1.method1634(-1) * 64;
            arg1.method1632((byte) -115);
        }
        if (class6.field55 == arg1 && (arg1.field3577 < 1536 || arg1.field3511 < 1536 || arg1.field3577 >= 11776 || arg1.field3511 >= 11776)) {
            arg1.field3547 = -1;
            arg1.field3552 = -1;
            arg1.field3515 = 0;
            arg1.field3479 = 0;
            arg1.field3577 = arg1.field3519[0] * 128 + arg1.method1634(-1) * 64;
            arg1.field3511 = arg1.field3553[0] * 128 + arg1.method1634(-1) * 64;
            arg1.method1632((byte) -115);
        }
        class220.method1643(arg1, true);
        class134.method1025(-1, arg1);
    }

    @OriginalMember(owner = "client!kl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 160)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1214++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 169)
    private final synchronized void method599(byte arg0) {
        field1215++;
        if (this.field1220 == null) {
            return;
        }
        if (arg0 < 89) {
            this.field1212 = (ColorModel) null;
        }
        this.field1220.setPixels(0, 0, this.field5453, this.field5457, this.field1212, this.field5447, 0, this.field5453);
        this.field1220.imageComplete(2);
    }

    @OriginalMember(owner = "client!kl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 187)
    public final void startProduction(ImageConsumer arg0) {
        field1228++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 195)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1231++;
        return this.field1220 == arg0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 207)
    public final void method573(Component arg0, int arg1, int arg2, int arg3) {
        field1224++;
        this.field5457 = arg2;
        this.field5453 = arg3;
        this.field5447 = new int[arg2 * arg3 + 1];
        this.field1212 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5456 = arg0.createImage(this);
        this.method599((byte) 115);
        arg0.prepareImage(this.field5456, this);
        this.method599((byte) 104);
        arg0.prepareImage(this.field5456, this);
        this.method599((byte) 95);
        int var5 = -77 / ((62 - arg1) / 58);
        arg0.prepareImage(this.field5456, this);
        this.method2415(-1);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 232)
    public static final void method600(int arg0) {
        class343.field5466 = null;
        class240.field3961 = null;
        class71.field1243 = null;
        class48.field771 = null;
        class258.field4354 = null;
        class34.field504 = null;
        field1211++;
        class54.field892 = null;
        class286.field4663 = null;
        class98.field1641 = null;
        class205.field3240 = null;
        class240.field3964 = null;
        if (arg0 != 382) {
            return;
        }
        class32.field458 = null;
        class87.field1487 = null;
        class109.field1792 = null;
        class238.field3928 = null;
        class104.field1678 = null;
        class156.field2469 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIBII)V", line = 263)
    private final synchronized void method601(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1225++;
        if (arg2 >= -125) {
            field1217 = (class57) null;
        }
        if (this.field1220 != null) {
            this.field1220.setPixels(arg3, arg0, arg1, arg4, this.field1212, this.field5447, this.field5453 * arg0 + arg3, this.field5453);
            this.field1220.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V", line = 278)
    public final void method571(Graphics arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.method601(arg1, arg3, (byte) -127, arg2, arg4);
        field1222++;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg1, arg3, arg4);
        arg0.drawImage(this.field5456, 0, 0, this);
        if (arg5 != -84) {
            field1218 = -25;
        }
        arg0.setClip(var7);
    }
}
