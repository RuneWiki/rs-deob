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

@OriginalClass("mapview!w")
public class class41 extends class18 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "Lna;")
    public static class26 field524 = class30.method205((byte) 100, "details)3dat");

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "[I")
    public static int[] field525 = new int[128];

    @OriginalMember(owner = "mapview!w", name = "p", descriptor = "J")
    public static long field523 = 0L;

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "Z")
    public static boolean field526 = false;

    @OriginalMember(owner = "mapview!w", name = "n", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "mapview!w", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field527;

    @OriginalMember(owner = "mapview!w", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field522;

    @OriginalMember(owner = "mapview!w", name = "m", descriptor = "[[[I")
    public static int[][][] field520;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Z)V", line = 8)
    public static void method260(boolean arg0) {
        field524 = null;
        if (arg0) {
            field520 = (int[][][]) null;
            field525 = null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 20)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(B)[Lna;", line = 30)
    public static final class26[] method261(byte arg0) {
        if (arg0 != 59) {
            field523 = 60L;
        }
        class26[] var10000 = new class26[] { class33.field439, class37.field476, class13.field200, class17.field222, class37.field472, class12.field187, class26.field368, class25.field344, class31.field417, class34.field448, class12.field185, class1.field105, class5.field144, class3.field130, class13.field197, class19.field240, class12.field182, class12.field180, class33.field432, class25.field357, class39.field501, class13.field199, class19.field241, class34.field444, class32.field429, class18.field230, class25.field352, class34.field447, class12.field186, class5.field142, mapview.field2, class32.field420, class18.field234, class7.field168, class9.field178, class29.field391, class30.field400, class17.field223, class34.field449, class6.field158, class6.field156, class27.field372, class30.field403, class30.field404, class9.field179, class15.field215, class16.field216, class29.field388, class33.field436, class25.field349, class15.field205, class20.field246, class13.field198, mapview.field73, class32.field428, class13.field188, class20.field255, class4.field137, class3.field112, class12.field184, class25.field354, class39.field499, class18.field238, class25.field355, class18.field238, class39.field495, class18.field238, class9.field175, class15.field214, class18.field238, class6.field152, class4.field140, class18.field238, class32.field425, class1.field106, class18.field238, class18.field238 };
        if (class30.field406) {
        }
        return var10000;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/awt/Component;BII)V", line = 45)
    public final void method117(Component arg0, byte arg1, int arg2, int arg3) {
        int var5 = 53 / ((34 - arg1) / 55);
        super.field233 = arg3;
        super.field235 = arg2;
        super.field227 = new int[arg2 * arg3 - -1];
        this.field527 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field228 = arg0.createImage(this);
        this.method264(10);
        arg0.prepareImage(super.field228, this);
        this.method264(124);
        arg0.prepareImage(super.field228, this);
        this.method264(-61);
        arg0.prepareImage(super.field228, this);
        this.method114((byte) 110);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(ZII)V", line = 67)
    public static final void method262(boolean arg0, int arg1, int arg2) {
        class1.field104 = 63 & arg1;
        class27.field373 = arg2 >> 6;
        class20.field286 = arg2 & 63;
        class19.field239 = (class1.field104 << 6) + class20.field286;
        if (arg0) {
            field521 = -54;
        }
        class1.field102 = arg1 >> 6;
        class35.method224(300);
    }

    @OriginalMember(owner = "mapview!w", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 82)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V", line = 89)
    public final void method116(Graphics arg0, int arg1, int arg2, boolean arg3) {
        this.method264(-120);
        if (arg3) {
            this.method117((Component) null, (byte) -68, 59, 3);
        }
        arg0.drawImage(super.field228, arg2, arg1, this);
    }

    @OriginalMember(owner = "mapview!w", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 101)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!w", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 108)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field522 == arg0) {
            this.field522 = null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 121)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field522 == arg0;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II[BI)Lna;", line = 129)
    public static final class26 method263(int arg0, int arg1, byte[] arg2, int arg3) {
        class26 var4 = new class26();
        var4.field358 = new byte[arg0];
        var4.field367 = 0;
        for (int var5 = arg3; ~var5 > ~(arg0 + arg3); ++var5) {
            if (~arg2[var5] != -1) {
                var4.field358[var4.field367++] = arg2[var5];
            }
        }
        if (arg1 > -24) {
            field521 = 112;
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(I)V", line = 153)
    private final synchronized void method264(int arg0) {
        if (this.field522 != null) {
            int var2 = -13 % ((82 - arg0) / 42);
            this.field522.setPixels(0, 0, super.field233, super.field235, this.field527, super.field227, 0, super.field233);
            this.field522.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(I)B", line = 169)
    public static final byte method265(int arg0) {
        if (arg0 <= 44) {
            method263(-9, 72, (byte[]) null, 104);
        }
        return class4.field139 != null ? class4.field139[class19.field239] : 0;
    }

    @OriginalMember(owner = "mapview!w", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 196)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field522 = arg0;
        arg0.setDimensions(super.field233, super.field235);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field527);
        arg0.setHints(14);
    }
}
