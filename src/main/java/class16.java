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

@OriginalClass("mapview!i")
public class class16 extends class21 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!i", name = "q", descriptor = "Ld;")
    public static class7 field160 = class37.method242(" map", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "r", descriptor = "Z")
    public static boolean field161 = true;

    @OriginalMember(owner = "mapview!i", name = "s", descriptor = "Ld;")
    public static class7 field162 = class37.method242("Quest Start", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "p", descriptor = "Ld;")
    public static class7 field159 = class37.method242("Platelegs Shop", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "z", descriptor = "Ld;")
    public static class7 field169 = class37.method242("loc)3dat", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "y", descriptor = "Ld;")
    public static class7 field168 = class37.method242("details)3dat", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "x", descriptor = "Ld;")
    public static class7 field167 = class37.method242("General Store", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "u", descriptor = "Ld;")
    public static class7 field164 = class37.method242("b12_full", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "v", descriptor = "Ld;")
    public static class7 field165 = class37.method242("(U", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "B", descriptor = "[I")
    public static int[] field171 = new int[128];

    @OriginalMember(owner = "mapview!i", name = "C", descriptor = "I")
    public static volatile int field172 = -1;

    @OriginalMember(owner = "mapview!i", name = "A", descriptor = "Ld;")
    public static class7 field170 = class37.method242("codeversion", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "F", descriptor = "Ld;")
    public static class7 field175 = class37.method242("-5bersicht", 1333943984);

    @OriginalMember(owner = "mapview!i", name = "o", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "mapview!i", name = "w", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "mapview!i", name = "t", descriptor = "Lka;")
    public static class21 field163;

    @OriginalMember(owner = "mapview!i", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field174;

    @OriginalMember(owner = "mapview!i", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field173;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 7)
    private final synchronized void method113(byte arg0) {
        if (arg0 != 88) {
            this.method113((byte) 21);
        }
        if (this.field173 != null) {
            this.field173.setPixels(0, 0, super.field201, super.field204, this.field174, super.field200, 0, super.field201);
            this.field173.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IIBLjava/awt/Component;)V", line = 27)
    public final void method114(int arg0, int arg1, byte arg2, Component arg3) {
        super.field200 = new int[arg0 * arg1 - -1];
        super.field201 = arg1;
        super.field204 = arg0;
        this.field174 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field210 = arg3.createImage(this);
        this.method113((byte) 88);
        arg3.prepareImage(super.field210, this);
        this.method113((byte) 88);
        arg3.prepareImage(super.field210, this);
        this.method113((byte) 88);
        int var5 = 74 % ((55 - arg2) / 39);
        arg3.prepareImage(super.field210, this);
        this.method146(0);
    }

    @OriginalMember(owner = "mapview!i", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 48)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BLjava/awt/Graphics;II)V", line = 55)
    public final void method115(byte arg0, Graphics arg1, int arg2, int arg3) {
        this.method113((byte) 88);
        if (arg0 >= 3) {
            arg1.drawImage(super.field210, arg2, arg3, this);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 67)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field173 == arg0;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Z)B", line = 85)
    public static final byte method116(boolean arg0) {
        if (arg0) {
            field165 = (class7) null;
        }
        return class14.field146 == null ? 0 : class14.field146[field166];
    }

    @OriginalMember(owner = "mapview!i", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 109)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field173 = arg0;
        arg0.setDimensions(super.field201, super.field204);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field174);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "(I)V", line = 131)
    public static void method117(int arg0) {
        field171 = null;
        field160 = null;
        field168 = null;
        field170 = null;
        field162 = null;
        field163 = null;
        field159 = null;
        field164 = null;
        if (arg0 <= 80) {
            method118(false, 34, -6);
        }
        field175 = null;
        field165 = null;
        field167 = null;
        field169 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 159)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ZII)B", line = 178)
    public static final byte method118(boolean arg0, int arg1, int arg2) {
        int var3 = arg1 >> 6;
        int var4 = arg2 >> 6;
        if (!arg0) {
            field166 = 108;
        }
        if (class36.field497[var4][var3] != null) {
            return class36.field497[var4][var3].field461 == null ? class36.field497[var4][var3].field469 : class36.field497[var4][var3].field461[63 & (4032 & arg2) - -arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 205)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field173 == arg0) {
            this.field173 = null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 223)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }
}
