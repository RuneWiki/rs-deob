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

@OriginalClass("client!pd")
public class class94 extends class90 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lke;")
    public static class65 field2476 = class1.method17("backvmid2", -118);

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Lke;")
    public static class65 field2484 = class1.method17("Die Verbindung konnte", -122);

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "[Lga;")
    public static class37[] field2481 = new class37[4];

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Lqd;")
    public static class100 field2474 = new class100(50);

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field2492 = -1;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Lke;")
    public static class65 field2490 = class1.method17("null", -121);

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "Lke;")
    private static class65 field2493 = class1.method17("Please contact customer support)3", -117);

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Lke;")
    public static class65 field2495 = field2493;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Lke;")
    public static class65 field2498 = class1.method17("System)2Update in: ", -123);

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lke;")
    public static class65 field2491 = class1.method17("oberen Rand der Webseite ausw-=hlen)3", -124);

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field2499 = 0;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Lv;")
    public static class125 field2494;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2478;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2486;

    @OriginalMember(owner = "client!pd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 3)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2486 = arg0;
        ++field2487;
        arg0.setDimensions(super.field2387, super.field2382);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2478);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!pd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 21)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2488;
        return this.field2486 == arg0;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 30)
    public static void method807(byte arg0) {
        field2493 = null;
        field2476 = null;
        field2494 = null;
        field2495 = null;
        if (arg0 != 29) {
            method807((byte) -73);
        }
        field2491 = null;
        field2498 = null;
        field2481 = null;
        field2484 = null;
        field2490 = null;
        field2474 = null;
    }

    @OriginalMember(owner = "client!pd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 51)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2473;
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V", line = 66)
    private final synchronized void method808(boolean arg0) {
        ++field2479;
        if (!arg0) {
            field2484 = null;
        }
        if (this.field2486 != null) {
            this.field2486.setPixels(0, 0, super.field2387, super.field2382, this.field2478, super.field2385, 0, super.field2387);
            this.field2486.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 94)
    public final void method790(int arg0, int arg1, Graphics arg2, int arg3) {
        ++field2482;
        int var5 = 7 / ((arg3 - 25) / 61);
        this.method808(true);
        arg2.drawImage(super.field2389, arg0, arg1, this);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 106)
    public final void method789(int arg0, int arg1, int arg2, Component arg3) {
        ++field2489;
        super.field2382 = arg1;
        super.field2385 = new int[arg1 * arg2 + 1];
        super.field2387 = arg2;
        this.field2478 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2389 = arg3.createImage(this);
        this.method808(true);
        arg3.prepareImage(super.field2389, this);
        this.method808(true);
        arg3.prepareImage(super.field2389, this);
        this.method808(true);
        arg3.prepareImage(super.field2389, this);
        if (arg0 != 23124) {
            this.isConsumer((ImageConsumer) null);
        }
        this.method793(-109);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lke;", line = 128)
    public static final class65 method809(int arg0, int arg1) {
        ++field2483;
        if (arg0 != 3662) {
            field2499 = 107;
        }
        return ~arg1 > -1000000000 ? class39.method320(arg1, (byte) -36) : class110.field2719;
    }

    @OriginalMember(owner = "client!pd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 148)
    public final void startProduction(ImageConsumer arg0) {
        ++field2477;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 171)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2475;
    }

    @OriginalMember(owner = "client!pd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 183)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2486 == arg0) {
            this.field2486 = null;
        }
        ++field2480;
    }
}
