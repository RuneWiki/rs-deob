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

@OriginalClass("client!nl")
public class class27 extends class173 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Lqd;")
    public static class37 field384 = new class37(64);

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "Ldb;")
    public static class161 field388;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "Lij;")
    public static class69 field398;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field391;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field394;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "[Lqe;")
    public static class162[] field401;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static final void method199(int arg0) {
        ++field393;
        class166.field2407.method260(arg0);
    }

    @OriginalMember(owner = "client!nl", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field397;
        return true;
    }

    @OriginalMember(owner = "client!nl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field394 == arg0) {
            this.field394 = null;
        }
        ++field390;
    }

    @OriginalMember(owner = "client!nl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field385;
        return this.field394 == arg0;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V")
    public static final void method200(byte arg0) {
        if (class107.field1553 != null) {
            class210 var1 = class107.field1553;
            synchronized (class107.field1553) {
                class107.field1553 = null;
            }
        }
        if (arg0 <= 29) {
            field398 = null;
        }
        ++field402;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public final void method201(byte arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 < -78) {
            ++field403;
            this.method202((byte) 117);
            arg1.drawImage(super.field2472, arg3, arg2, this);
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)V")
    private final synchronized void method202(byte arg0) {
        ++field392;
        if (this.field394 != null) {
            this.field394.setPixels(0, 0, super.field2482, super.field2477, this.field391, super.field2476, 0, super.field2482);
            this.field394.imageComplete(2);
            int var2 = -65 % ((arg0 - -2) / 44);
        }
    }

    @OriginalMember(owner = "client!nl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field394 = arg0;
        ++field396;
        arg0.setDimensions(super.field2482, super.field2477);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field391);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(B)V")
    public static void method203(byte arg0) {
        field398 = null;
        field388 = null;
        if (arg0 > -30) {
            method203((byte) -23);
        }
        field401 = null;
        field384 = null;
    }

    @OriginalMember(owner = "client!nl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field395;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method204(int arg0, int arg1, int arg2, Component arg3) {
        super.field2477 = arg0;
        super.field2482 = arg2;
        super.field2476 = new int[arg0 * arg2 + 1];
        this.field391 = new DirectColorModel(32, 16711680, 65280, 255);
        ++field386;
        super.field2472 = arg3.createImage(this);
        this.method202((byte) 65);
        arg3.prepareImage(super.field2472, this);
        this.method202((byte) 66);
        arg3.prepareImage(super.field2472, this);
        this.method202((byte) -47);
        arg3.prepareImage(super.field2472, this);
        this.method1142(25);
        if (arg1 > -24) {
            this.method206(2, -64, (byte) 125, 41, (Graphics) null, -85);
        }
    }

    @OriginalMember(owner = "client!nl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field387;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field389;
        if (this.field394 != null) {
            this.field394.setPixels(arg4, arg2, arg0, arg1, this.field391, super.field2476, super.field2482 * arg2 + arg4, super.field2482);
            this.field394.imageComplete(arg3);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
    public final void method206(int arg0, int arg1, byte arg2, int arg3, Graphics arg4, int arg5) {
        this.method205(arg0, arg1, arg3, 2, arg5);
        ++field400;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg5, arg3, arg0, arg1);
        arg4.drawImage(super.field2472, 0, 0, this);
        arg4.setClip(var7);
        if (arg2 >= -49) {
            method203((byte) 7);
        }
    }
}
