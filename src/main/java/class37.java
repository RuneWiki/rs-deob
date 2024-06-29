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

@OriginalClass("mapview!v")
public class class37 extends class19 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!v", name = "t", descriptor = "Ll;")
    public static class22 field488 = class33.method229("Transportation", -114);

    @OriginalMember(owner = "mapview!v", name = "s", descriptor = "Ll;")
    public static class22 field487 = class33.method229("_", -77);

    @OriginalMember(owner = "mapview!v", name = "A", descriptor = "Z")
    public static volatile boolean field495 = true;

    @OriginalMember(owner = "mapview!v", name = "w", descriptor = "Ll;")
    public static class22 field491 = class33.method229("uitext has incorrect number of strings", -114);

    @OriginalMember(owner = "mapview!v", name = "x", descriptor = "Ll;")
    public static class22 field492 = class33.method229("Hair Dressers", -92);

    @OriginalMember(owner = "mapview!v", name = "B", descriptor = "Ll;")
    public static class22 field496 = class33.method229("Platelegs Shop", -112);

    @OriginalMember(owner = "mapview!v", name = "u", descriptor = "Ll;")
    public static class22 field489 = class33.method229("Suchen", -114);

    @OriginalMember(owner = "mapview!v", name = "y", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "mapview!v", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field494;

    @OriginalMember(owner = "mapview!v", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field490;

    @OriginalMember(owner = "mapview!v", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 6)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field490 == arg0;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(BIILjava/awt/Graphics;)V", line = 16)
    public final void method112(byte arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 == 102) {
            this.method241(true);
            arg3.drawImage(super.field185, arg1, arg2, this);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 26)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(BILjava/awt/Component;I)V", line = 38)
    public final void method117(byte arg0, int arg1, Component arg2, int arg3) {
        super.field189 = new int[arg1 * arg3 - -1];
        super.field184 = arg3;
        super.field187 = arg1;
        this.field494 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field185 = arg2.createImage(this);
        this.method241(true);
        arg2.prepareImage(super.field185, this);
        this.method241(true);
        arg2.prepareImage(super.field185, this);
        this.method241(true);
        int var5 = 75 % ((35 - arg0) / 43);
        arg2.prepareImage(super.field185, this);
        this.method118(0);
    }

    @OriginalMember(owner = "mapview!v", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 60)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(I)V", line = 74)
    public static void method239(int arg0) {
        field489 = null;
        field491 = null;
        field488 = null;
        field496 = null;
        if (arg0 == 0) {
            field487 = null;
            field492 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 89)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field490 = arg0;
        arg0.setDimensions(super.field184, super.field187);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field494);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!v", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 110)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!v", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 137)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field490 == arg0) {
            this.field490 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(II[Ll;I)V", line = 153)
    public static final void method240(int arg0, int arg1, class22[] arg2, int arg3) {
        if (arg1 != 1) {
            class12.method60(arg1, arg2, arg0, arg3 ^ -1799).method130(arg3 + -103);
        } else {
            arg2[0].method130(43);
        }
        if (arg3 != 0) {
            method239(-77);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Z)V", line = 167)
    private final synchronized void method241(boolean arg0) {
        if (this.field490 != null) {
            this.field490.setPixels(0, 0, super.field184, super.field187, this.field494, super.field189, 0, super.field184);
            if (!arg0) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field490.imageComplete(2);
        }
    }
}
