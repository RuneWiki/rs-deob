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

@OriginalClass("client!se")
public class class11 extends class264 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field168 = 0;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Ljf;")
    public static class216 field172 = new class216(50);

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field177;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field166;

    @OriginalMember(owner = "client!se", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field176;
        this.field166 = arg0;
        arg0.setDimensions(super.field4292, super.field4285);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field177);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    private final synchronized void method63(byte arg0) {
        ++field173;
        if (this.field166 != null) {
            this.field166.setPixels(0, 0, super.field4292, super.field4285, this.field177, super.field4293, 0, super.field4292);
            this.field166.imageComplete(2);
            int var2 = -81 % ((arg0 - -62) / 37);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public final void method64(byte arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 > -32) {
            this.field166 = null;
        }
        ++field174;
        this.method63((byte) 60);
        arg1.drawImage(super.field4291, arg3, arg2, this);
    }

    @OriginalMember(owner = "client!se", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field171;
    }

    @OriginalMember(owner = "client!se", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field169;
        return true;
    }

    @OriginalMember(owner = "client!se", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field175;
    }

    @OriginalMember(owner = "client!se", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field178;
        return this.field166 == arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public final void method65(int arg0, int arg1, boolean arg2, Component arg3) {
        super.field4292 = arg1;
        super.field4293 = new int[arg0 * arg1 - -1];
        super.field4285 = arg0;
        this.field177 = new DirectColorModel(32, 16711680, 65280, 255);
        ++field167;
        super.field4291 = arg3.createImage(this);
        this.method63((byte) 18);
        arg3.prepareImage(super.field4291, this);
        this.method63((byte) -106);
        arg3.prepareImage(super.field4291, this);
        this.method63((byte) -108);
        arg3.prepareImage(super.field4291, this);
        this.method1849(arg2);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static void method66(byte arg0) {
        field172 = null;
        if (arg0 != -6) {
            method66((byte) -100);
        }
    }

    @OriginalMember(owner = "client!se", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field179;
        if (this.field166 == arg0) {
            this.field166 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method67(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field165;
        if (this.field166 != null) {
            if (arg3 < 105) {
                this.field177 = null;
            }
            this.field166.setPixels(arg1, arg0, arg4, arg2, this.field177, super.field4293, super.field4292 * arg0 + arg1, super.field4292);
            this.field166.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
    public final void method68(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5) {
        ++field170;
        this.method67(arg0, arg5, arg1, (byte) 117, arg4);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg0, arg4, arg1);
        arg3.drawImage(super.field4291, 0, 0, this);
        arg3.setClip(var7);
        if (!arg2) {
            this.imageUpdate((Image) null, 110, -2, 107, 95, -5);
        }
    }
}
