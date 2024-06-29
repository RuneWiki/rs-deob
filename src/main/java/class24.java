import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class24 extends class17 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!la", name = "q", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "mapview!la", name = "s", descriptor = "Lk;")
    public static class21 field292 = class14.method92((byte) 57, "Brewery");

    @OriginalMember(owner = "mapview!la", name = "p", descriptor = "Lk;")
    public static class21 field289 = class14.method92((byte) 57, "Vegetable Store");

    @OriginalMember(owner = "mapview!la", name = "o", descriptor = "Lk;")
    public static class21 field288 = class14.method92((byte) 57, "Mining Shop");

    @OriginalMember(owner = "mapview!la", name = "v", descriptor = "Lk;")
    public static class21 field295 = class14.method92((byte) 57, "Silk Trader");

    @OriginalMember(owner = "mapview!la", name = "w", descriptor = "Lk;")
    public static class21 field296 = class14.method92((byte) 57, "Spinning Wheel");

    @OriginalMember(owner = "mapview!la", name = "z", descriptor = "Lk;")
    public static class21 field299 = class14.method92((byte) 57, "Shield Shop");

    @OriginalMember(owner = "mapview!la", name = "x", descriptor = "J")
    public static volatile long field297 = 0L;

    @OriginalMember(owner = "mapview!la", name = "n", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "mapview!la", name = "t", descriptor = "Lt;")
    public static class32 field293;

    @OriginalMember(owner = "mapview!la", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field291;

    @OriginalMember(owner = "mapview!la", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field294;

    @OriginalMember(owner = "mapview!la", name = "y", descriptor = "[B")
    public static byte[] field298;

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "(I)V", line = 4)
    private final synchronized void method157(int arg0) {
        if (this.field294 != null) {
            this.field294.setPixels(0, 0, super.field211, super.field215, this.field291, super.field217, 0, super.field211);
            if (arg0 <= -30) {
                this.field294.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "mapview!la", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 24)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field294 == arg0;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Z)V", line = 47)
    public static void method158(boolean arg0) {
        field292 = null;
        field289 = null;
        field293 = null;
        field288 = null;
        field295 = null;
        field298 = null;
        if (arg0) {
            field287 = -43;
        }
        field296 = null;
        field299 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 64)
    public final void method98(int arg0, Component arg1, int arg2, int arg3) {
        if (arg0 != 127) {
            this.addConsumer((ImageConsumer) null);
        }
        super.field217 = new int[arg2 * arg3 + 1];
        super.field215 = arg2;
        super.field211 = arg3;
        this.field291 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field210 = arg1.createImage(this);
        this.method157(-117);
        arg1.prepareImage(super.field210, this);
        this.method157(-64);
        arg1.prepareImage(super.field210, this);
        this.method157(-105);
        arg1.prepareImage(super.field210, this);
        this.method101(128);
    }

    @OriginalMember(owner = "mapview!la", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 86)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!la", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 93)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 100)
    public final void method95(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method157(-97);
        if (arg0 < 15) {
            field299 = (class21) null;
        }
        arg1.drawImage(super.field210, arg2, arg3, this);
    }

    @OriginalMember(owner = "mapview!la", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 119)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field294 = arg0;
        arg0.setDimensions(super.field211, super.field215);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field291);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!la", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 131)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field294 == arg0) {
            this.field294 = null;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 151)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "(I)V", line = 163)
    public static final void method159(int arg0) {
        if (class15.field195 != null) {
            class8 var1 = class15.field195;
            synchronized (class15.field195) {
                class15.field195 = null;
            }
        }
        if (arg0 != 32) {
            method159(-74);
        }
    }
}
