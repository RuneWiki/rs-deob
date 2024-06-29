import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 extends class29 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "I")
    public static int field92 = -1;

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "Lt;")
    public static class31 field95 = class11.method64(-44, "Rare Trees");

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "I")
    public static int field96 = 0;

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "Lt;")
    public static class31 field94 = class11.method64(-70, "null");

    @OriginalMember(owner = "mapview!b", name = "p", descriptor = "Lt;")
    public static class31 field100 = class11.method64(106, "50(U");

    @OriginalMember(owner = "mapview!b", name = "t", descriptor = "Lt;")
    public static class31 field104 = class11.method64(-103, "Fur Trader");

    @OriginalMember(owner = "mapview!b", name = "q", descriptor = "Lt;")
    public static class31 field101 = class11.method64(105, "Scimitar Shop");

    @OriginalMember(owner = "mapview!b", name = "n", descriptor = "Z")
    public static boolean field98 = false;

    @OriginalMember(owner = "mapview!b", name = "o", descriptor = "Lt;")
    public static class31 field99 = class11.method64(84, "Amulet Shop");

    @OriginalMember(owner = "mapview!b", name = "s", descriptor = "[[B")
    public static byte[][] field103 = new byte[50][];

    @OriginalMember(owner = "mapview!b", name = "r", descriptor = "Ln;")
    public static class26 field102;

    @OriginalMember(owner = "mapview!b", name = "m", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field97;

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field93;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 4)
    public final void method38(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 9) {
            this.imageUpdate((Image) null, -29, 116, -90, 37, 92);
        }
        this.method42((byte) -44);
        arg0.drawImage(super.field324, arg1, arg2, this);
    }

    @OriginalMember(owner = "mapview!b", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 15)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 23)
    public static void method39(int arg0) {
        if (arg0 != 23721) {
            method41((Component) null, -45);
        }
        field95 = null;
        field99 = null;
        field94 = null;
        field103 = (byte[][]) null;
        field102 = null;
        field101 = null;
        field104 = null;
        field100 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 41)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field93 == arg0) {
            this.field93 = null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 53)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field93 == arg0;
    }

    @OriginalMember(owner = "mapview!b", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 60)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 69)
    public final void method40(int arg0, Component arg1, int arg2, int arg3) {
        super.field321 = new int[arg2 * arg3 + 1];
        super.field323 = arg3;
        super.field320 = arg2;
        this.field97 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field324 = arg1.createImage(this);
        if (arg0 >= -40) {
            field94 = (class31) null;
        }
        this.method42((byte) 125);
        arg1.prepareImage(super.field324, this);
        this.method42((byte) 8);
        arg1.prepareImage(super.field324, this);
        this.method42((byte) -98);
        arg1.prepareImage(super.field324, this);
        this.method156((byte) -105);
    }

    @OriginalMember(owner = "mapview!b", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 107)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 116)
    public static final void method41(Component arg0, int arg1) {
        try {
            Method var2 = class12.field193;
            if (var2 != null) {
                var2.invoke(arg0, Boolean.FALSE);
            }
        } catch (Throwable var4) {
        }
        if (arg1 != 32) {
            field99 = (class31) null;
        }
        arg0.addKeyListener(class11.field186);
        arg0.addFocusListener(class11.field186);
    }

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "(B)V", line = 150)
    private final synchronized void method42(byte arg0) {
        if (this.field93 != null) {
            this.field93.setPixels(0, 0, super.field323, super.field320, this.field97, super.field321, 0, super.field323);
            this.field93.imageComplete(2);
            int var2 = -112 / ((arg0 - 75) / 46);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 180)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field93 = arg0;
        arg0.setDimensions(super.field323, super.field320);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field97);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(II)I", line = 197)
    public static int method43(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
