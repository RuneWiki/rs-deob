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

@OriginalClass("client!ni")
public class class291 extends class24 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4608;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4607;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method1950(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field4609;
        if (this.field4607 != null) {
            if (arg4 <= 81) {
                this.field4607 = null;
            }
            this.field4607.setPixels(arg2, arg0, arg1, arg3, this.field4608, super.field288, super.field287 * arg0 - -arg2, super.field287);
            this.field4607.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(JI)V")
    public static final void method1951(long arg0, int arg1) {
        ++field4615;
        if (arg0 != 0L) {
            if (arg1 == 20697) {
                for (int var3 = 0; ~class185.field2675 < ~var3; ++var3) {
                    if (class209.field2945[var3] == arg0) {
                        ++class263.field3810;
                        --class185.field2675;
                        for (int var4 = var3; ~var4 > ~class185.field2675; ++var4) {
                            class209.field2945[var4] = class209.field2945[var4 + 1];
                            class199.field2835[var4] = class199.field2835[var4 + 1];
                            class260.field3781[var4] = class260.field3781[var4 + 1];
                        }
                        class79.field934 = class176.field2500;
                        class94.field1259.method592(85, false);
                        class94.field1259.method1379(-23, arg0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
    private final synchronized void method1952(byte arg0) {
        ++field4617;
        if (this.field4607 != null) {
            this.field4607.setPixels(0, 0, super.field287, super.field296, this.field4608, super.field288, 0, super.field287);
            if (arg0 != -25) {
                this.requestTopDownLeftRightResend((ImageConsumer) null);
            }
            this.field4607.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method150(int arg0, int arg1, Component arg2, int arg3) {
        super.field296 = arg0;
        super.field288 = new int[arg0 * arg1 + 1];
        ++field4605;
        super.field287 = arg1;
        this.field4608 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field295 = arg2.createImage(this);
        this.method1952((byte) -25);
        arg2.prepareImage(super.field295, this);
        this.method1952((byte) -25);
        arg2.prepareImage(super.field295, this);
        this.method1952((byte) -25);
        if (arg3 != 10572) {
            this.field4607 = null;
        }
        arg2.prepareImage(super.field295, this);
        this.method147(-93);
    }

    @OriginalMember(owner = "client!ni", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4606;
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method1950(arg2, arg0, arg3, arg4, (byte) 86);
        ++field4618;
        if (arg1 == 21) {
            Shape var7 = arg5.getClip();
            arg5.clipRect(arg3, arg2, arg0, arg4);
            arg5.drawImage(super.field295, 0, 0, this);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ni", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field4607 = arg0;
        arg0.setDimensions(super.field287, super.field296);
        ++field4610;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4608);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ni", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4612;
    }

    @OriginalMember(owner = "client!ni", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4614;
        return this.field4607 == arg0;
    }

    @OriginalMember(owner = "client!ni", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field4611;
        if (this.field4607 == arg0) {
            this.field4607 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method149(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 > -15) {
            this.imageUpdate((Image) null, -103, 56, -34, 75, -118);
        }
        this.method1952((byte) -25);
        arg2.drawImage(super.field295, arg1, arg0, this);
        ++field4613;
    }

    @OriginalMember(owner = "client!ni", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4616;
    }
}
