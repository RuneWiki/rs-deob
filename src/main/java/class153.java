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

@OriginalClass("client!wc")
public class class153 extends class249 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "J")
    public static long field2240 = 0L;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2238;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2242;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Z")
    public static boolean field2239;

    @OriginalMember(owner = "client!wc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2246;
    }

    @OriginalMember(owner = "client!wc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2235;
        return this.field2242 == arg0;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    private final synchronized void method1038(int arg0) {
        ++field2237;
        if (this.field2242 != null) {
            this.field2242.setPixels(0, 0, super.field3863, super.field3856, this.field2238, super.field3861, 0, super.field3863);
            if (arg0 < -76) {
                this.field2242.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2247;
        if (this.field2242 == arg0) {
            this.field2242 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method695(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        this.method1041(arg5, arg1, arg3, arg0, -27759);
        if (arg4 < 9) {
            this.method694(49, (byte) 86, 18, (Component) null);
        }
        Shape var7 = arg2.getClip();
        ++field2234;
        arg2.clipRect(arg0, arg3, arg1, arg5);
        arg2.drawImage(super.field3858, 0, 0, this);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!wc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2245;
        this.field2242 = arg0;
        arg0.setDimensions(super.field3863, super.field3856);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2238);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ldd;Ldd;I)V")
    public static final void method1039(class259 arg0, class259 arg1, int arg2) {
        ++field2244;
        if (arg0.field3973 != null) {
            arg0.method1746(-102);
        }
        arg0.field3972 = arg1.field3972;
        arg0.field3973 = arg1;
        arg0.field3973.field3972 = arg0;
        arg0.field3972.field3973 = arg0;
        if (arg2 != 14) {
            field2240 = -93L;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public final void method696(int arg0, int arg1, Graphics arg2, boolean arg3) {
        ++field2250;
        this.method1038(-80);
        arg2.drawImage(super.field3858, arg0, arg1, this);
        if (!arg3) {
            field2240 = -24L;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Lri;")
    public static final class176 method1040(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class176 var4 = var3.field3024;
            var3.field3024 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2233;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1041(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == -27759) {
            ++field2248;
            if (this.field2242 != null) {
                this.field2242.setPixels(arg3, arg2, arg1, arg0, this.field2238, super.field3861, super.field3863 * arg2 + arg3, super.field3863);
                this.field2242.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public final void method694(int arg0, byte arg1, int arg2, Component arg3) {
        ++field2243;
        super.field3863 = arg0;
        super.field3856 = arg2;
        super.field3861 = new int[arg0 * arg2 + 1];
        this.field2238 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3858 = arg3.createImage(this);
        this.method1038(-91);
        arg3.prepareImage(super.field3858, this);
        this.method1038(-84);
        int var5 = -82 / ((arg1 - 46) / 55);
        arg3.prepareImage(super.field3858, this);
        this.method1038(-114);
        arg3.prepareImage(super.field3858, this);
        this.method1703(5061);
    }

    @OriginalMember(owner = "client!wc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2236;
        return true;
    }
}
