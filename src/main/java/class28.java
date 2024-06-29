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

@OriginalClass("mapview!o")
public class class28 extends class12 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "Lu;")
    public static class38 field343 = class9.method45(-41, "Kebab Seller");

    @OriginalMember(owner = "mapview!o", name = "r", descriptor = "Lu;")
    public static class38 field352 = class9.method45(-41, "overlay)3dat");

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "Lu;")
    public static class38 field344 = class9.method45(-41, "Cooking Range");

    @OriginalMember(owner = "mapview!o", name = "q", descriptor = "Lu;")
    public static class38 field351 = class9.method45(-41, "Chainmail Shop");

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "Lu;")
    public static class38 field346 = class9.method45(-41, "Dairy Churn");

    @OriginalMember(owner = "mapview!o", name = "o", descriptor = "Lu;")
    public static class38 field349 = class9.method45(-41, "Silver Shop");

    @OriginalMember(owner = "mapview!o", name = "n", descriptor = "Lu;")
    public static class38 field348 = class9.method45(-41, "Requesting");

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "Lu;")
    public static class38 field345 = class9.method45(-41, "Altar");

    @OriginalMember(owner = "mapview!o", name = "p", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "mapview!o", name = "s", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "mapview!o", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field355;

    @OriginalMember(owner = "mapview!o", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field354;

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "[[Ls;")
    public static class35[][] field347;

    @OriginalMember(owner = "mapview!o", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 11)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(III)V", line = 19)
    public static final void method161(int arg0, int arg1, int arg2) {
        class30.field365 = arg1 >> 6;
        if (arg0 <= 76) {
            field349 = (class38) null;
        }
        class11.field103 = 63 & arg2;
        class18.field159 = arg2 >> 6;
        class22.field206 = arg1 & 63;
        class14.field139 = (class22.field206 << 6) + class11.field103;
        class8.method33((byte) 86);
    }

    @OriginalMember(owner = "mapview!o", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 49)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field354 == arg0) {
            this.field354 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(B)V", line = 61)
    public static void method162(byte arg0) {
        field347 = (class35[][]) null;
        field352 = null;
        field343 = null;
        field345 = null;
        field349 = null;
        field348 = null;
        field344 = null;
        if (arg0 > 89) {
            field346 = null;
            field351 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "(B)V", line = 90)
    private final synchronized void method163(byte arg0) {
        if (this.field354 != null) {
            this.field354.setPixels(0, 0, super.field118, super.field117, this.field355, super.field120, 0, super.field118);
            this.field354.imageComplete(2);
            if (arg0 < 14) {
                field343 = (class38) null;
            }
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(BLjava/awt/Graphics;II)V", line = 108)
    public final void method66(byte arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != 16) {
            this.method63(54, (Component) null, -99, -50);
        }
        this.method163((byte) 80);
        arg1.drawImage(super.field121, arg3, arg2, this);
    }

    @OriginalMember(owner = "mapview!o", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 123)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!o", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 131)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!o", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 142)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field354 == arg0;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(II)Lu;", line = 162)
    public static final class38 method164(int arg0, int arg1) {
        class38 var2 = new class38();
        var2.field492 = 0;
        var2.field487 = new byte[arg1];
        if (arg0 != -25600) {
            method161(18, -53, -115);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!o", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 175)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field354 = arg0;
        arg0.setDimensions(super.field118, super.field117);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field355);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 189)
    public final void method63(int arg0, Component arg1, int arg2, int arg3) {
        super.field118 = arg2;
        super.field120 = new int[arg0 * arg2 + 1];
        super.field117 = arg0;
        this.field355 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field121 = arg1.createImage(this);
        this.method163((byte) 104);
        arg1.prepareImage(super.field121, this);
        this.method163((byte) 63);
        arg1.prepareImage(super.field121, this);
        this.method163((byte) 102);
        if (arg3 != 15564) {
            this.removeConsumer((ImageConsumer) null);
        }
        arg1.prepareImage(super.field121, this);
        this.method65(true);
    }
}
