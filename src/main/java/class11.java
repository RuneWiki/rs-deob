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

@OriginalClass("mapview!f")
public class class11 extends class29 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!f", name = "w", descriptor = "Z")
    public static volatile boolean field147 = true;

    @OriginalMember(owner = "mapview!f", name = "o", descriptor = "Lr;")
    public static class33 field139 = class29.method192("Windmill", (byte) 126);

    @OriginalMember(owner = "mapview!f", name = "t", descriptor = "Lr;")
    public static class33 field144 = class29.method192("Mining Site", (byte) 126);

    @OriginalMember(owner = "mapview!f", name = "y", descriptor = "Lr;")
    public static class33 field149 = class29.method192("Loading", (byte) 126);

    @OriginalMember(owner = "mapview!f", name = "q", descriptor = "Lr;")
    public static class33 field141 = class29.method192("null", (byte) 126);

    @OriginalMember(owner = "mapview!f", name = "r", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "mapview!f", name = "s", descriptor = "Lp;")
    public static class29 field143;

    @OriginalMember(owner = "mapview!f", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field140;

    @OriginalMember(owner = "mapview!f", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field148;

    @OriginalMember(owner = "mapview!f", name = "v", descriptor = "[I")
    public static int[] field146;

    @OriginalMember(owner = "mapview!f", name = "u", descriptor = "[Lr;")
    public static class33[] field145;

    @OriginalMember(owner = "mapview!f", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 8)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!f", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 16)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field148 = arg0;
        arg0.setDimensions(super.field415, super.field420);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field140);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(B)V", line = 42)
    private final synchronized void method68(byte arg0) {
        if (this.field148 != null) {
            this.field148.setPixels(0, 0, super.field415, super.field420, this.field140, super.field418, 0, super.field415);
            if (arg0 <= -122) {
                this.field148.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 65)
    public final void method69(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method68((byte) -128);
        arg1.drawImage(super.field419, arg3, arg0, this);
        if (arg2 != -28289) {
            this.addConsumer((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I[Lr;)Lr;", line = 76)
    public static final class33 method70(int arg0, class33[] arg1) {
        if (arg1.length >= 2) {
            if (arg0 != 0) {
                method71((byte) -42);
            }
            return class10.method59(arg1, 0, arg1.length, true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(B)V", line = 94)
    public static void method71(byte arg0) {
        field145 = null;
        int var1 = 95 / ((arg0 - 0) / 48);
        field144 = null;
        field141 = null;
        field139 = null;
        field143 = null;
        field146 = null;
        field149 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 109)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!f", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 116)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!f", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 131)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field148 == arg0) {
            this.field148 = null;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 142)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field148 == arg0;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 170)
    public final void method72(int arg0, Component arg1, int arg2, int arg3) {
        super.field420 = arg2;
        super.field418 = new int[arg2 * arg3 + 1];
        super.field415 = arg3;
        this.field140 = new DirectColorModel(32, 16711680, 65280, arg0);
        super.field419 = arg1.createImage(this);
        this.method68((byte) -123);
        arg1.prepareImage(super.field419, this);
        this.method68((byte) -123);
        arg1.prepareImage(super.field419, this);
        this.method68((byte) -126);
        arg1.prepareImage(super.field419, this);
        this.method194((byte) 68);
    }
}
