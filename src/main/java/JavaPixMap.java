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

@OriginalClass("mapview!la")
public class JavaPixMap extends PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "Lv;")
    public static JagString field187 = class1.method2(255, "Mace Shop");

    @OriginalMember(owner = "mapview!la", name = "n", descriptor = "I")
    public static int field191 = 50;

    @OriginalMember(owner = "mapview!la", name = "o", descriptor = "Z")
    public static boolean field192 = false;

    @OriginalMember(owner = "mapview!la", name = "q", descriptor = "I")
    public static int field194 = -1;

    @OriginalMember(owner = "mapview!la", name = "m", descriptor = "Lv;")
    public static JagString field190 = class1.method2(255, "Apothecary");

    @OriginalMember(owner = "mapview!la", name = "p", descriptor = "Lv;")
    public static JagString field193 = class1.method2(255, "100(U");

    @OriginalMember(owner = "mapview!la", name = "r", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "mapview!la", name = "s", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel colorModel;

    @OriginalMember(owner = "mapview!la", name = "l", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer consumer;

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "[[Lq;")
    public static WorldmapOverlay[][] field188;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ZIILjava/awt/Component;)V", line = 4)
    public final void init(boolean arg0, int arg1, int arg2, Component arg3) {
        super.height = arg2;
        super.pixels = new int[arg1 * arg2 + 1];
        super.width = arg1;
        this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
        super.image = arg3.createImage(this);
        if (arg0) {
            field188 = (WorldmapOverlay[][]) ((WorldmapOverlay[][]) null);
        }
        this.setPixels(-7);
        arg3.prepareImage(super.image, this);
        this.setPixels(122);
        arg3.prepareImage(super.image, this);
        this.setPixels(125);
        arg3.prepareImage(super.image, this);
        this.bind(-114);
    }

    @OriginalMember(owner = "mapview!la", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 25)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!la", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 28)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.consumer = arg0;
        arg0.setDimensions(super.width, super.height);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.colorModel);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!la", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 39)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 54)
    public static final void method69(byte arg0, Component arg1) {
        Method var2 = Signlink.field456;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(StringNode.field81);
        arg1.addFocusListener(StringNode.field81);
        if (arg0 <= 19) {
            method73(69, 106);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V", line = 80)
    public final void drawImage(int arg0, Graphics arg1, boolean arg2, int arg3) {
        this.setPixels(-46);
        if (arg2) {
            this.isConsumer((ImageConsumer) null);
        }
        arg1.drawImage(super.image, arg0, arg3, this);
    }

    @OriginalMember(owner = "mapview!la", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 98)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.consumer == arg0) {
            this.consumer = null;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "(I)V", line = 112)
    public static void method71(int arg0) {
        field193 = null;
        field190 = null;
        field187 = null;
        field188 = (WorldmapOverlay[][]) null;
        if (arg0 > -91) {
            field194 = 126;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "(I)V", line = 126)
    private final synchronized void setPixels(int arg0) {
        int var2 = -47 / ((77 - arg0) / 45);
        if (this.consumer != null) {
            this.consumer.setPixels(0, 0, super.width, super.height, this.colorModel, super.pixels, 0, super.width);
            this.consumer.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(II)Lv;", line = 147)
    public static final JagString method73(int arg0, int arg1) {
        return arg0 != -1 ? (JagString) null : class4.method15((byte) 118, false, 10, arg1);
    }

    @OriginalMember(owner = "mapview!la", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 158)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!la", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 172)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.consumer == arg0;
    }
}
