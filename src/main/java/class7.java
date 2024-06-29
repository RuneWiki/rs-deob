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

@OriginalClass("mapview!d")
public class class7 extends class6 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!d", name = "o", descriptor = "I")
    public static volatile int field137 = -1;

    @OriginalMember(owner = "mapview!d", name = "r", descriptor = "Lh;")
    public static class15 field140 = class26.method190(true, "Spice Shop");

    @OriginalMember(owner = "mapview!d", name = "v", descriptor = "Lh;")
    public static class15 field144 = class26.method190(true, "Dairy Churn");

    @OriginalMember(owner = "mapview!d", name = "u", descriptor = "Lh;")
    public static class15 field143 = class26.method190(true, "Platebody Shop");

    @OriginalMember(owner = "mapview!d", name = "t", descriptor = "Lh;")
    public static class15 field142 = class26.method190(true, "b12_full");

    @OriginalMember(owner = "mapview!d", name = "q", descriptor = "I")
    public static int field139 = 0;

    @OriginalMember(owner = "mapview!d", name = "w", descriptor = "Z")
    public static boolean field145 = false;

    @OriginalMember(owner = "mapview!d", name = "p", descriptor = "Lo;")
    public static class28 field138;

    @OriginalMember(owner = "mapview!d", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field141;

    @OriginalMember(owner = "mapview!d", name = "n", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field136;

    @OriginalMember(owner = "mapview!d", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 7)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field136 == arg0) {
            this.field136 = null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 16)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field136 = arg0;
        arg0.setDimensions(super.field132, super.field126);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field141);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!d", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 27)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!d", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 40)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field136 == arg0;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 52)
    public final void method72(int arg0, Component arg1, int arg2, int arg3) {
        super.field127 = new int[arg0 * arg3 - -1];
        super.field126 = arg0;
        super.field132 = arg3;
        this.field141 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field131 = arg1.createImage(this);
        this.method74(26824);
        if (arg2 < -126) {
            arg1.prepareImage(super.field131, this);
            this.method74(26824);
            arg1.prepareImage(super.field131, this);
            this.method74(26824);
            arg1.prepareImage(super.field131, this);
            this.method69((byte) -126);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 77)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!d", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 91)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(B)V", line = 100)
    public static final void method73(byte arg0) {
        int var1 = 14 % ((arg0 - -40) / 60);
        class21 var2 = class26.field354;
        synchronized (class26.field354) {
            class6.field134 = class17.field274;
            if (class31.field420 < 0) {
                for (int var3 = 0; var3 < 112; ++var3) {
                    class18.field287[var3] = false;
                }
                class31.field420 = class15.field253;
            } else {
                while (~class31.field420 != ~class15.field253) {
                    int var4 = class35.field443[class15.field253];
                    class15.field253 = 127 & class15.field253 - -1;
                    if (var4 >= 0) {
                        class18.field287[var4] = true;
                    } else {
                        class18.field287[~var4] = false;
                    }
                }
            }
            class17.field274 = class11.field181;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 143)
    private final synchronized void method74(int arg0) {
        if (this.field136 != null) {
            this.field136.setPixels(0, 0, super.field132, super.field126, this.field141, super.field127, 0, super.field132);
            if (arg0 != 26824) {
                field145 = false;
            }
            this.field136.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(I)V", line = 180)
    public static void method75(int arg0) {
        field144 = null;
        field142 = null;
        if (arg0 == 5901) {
            field143 = null;
            field138 = null;
            field140 = null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V", line = 201)
    public final void method71(int arg0, Graphics arg1, byte arg2, int arg3) {
        this.method74(26824);
        if (arg2 != -72) {
            this.field141 = (ColorModel) null;
        }
        arg1.drawImage(super.field131, arg3, arg0, this);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(III)B", line = 213)
    public static final byte method76(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 6;
        if (arg1 != -8316) {
            field144 = (class15) null;
        }
        int var4 = arg0 >> 6;
        if (class16.field268[var4][var3] == null) {
            return 0;
        } else {
            return class16.field268[var4][var3].field380 == null ? class16.field268[var4][var3].field384 : class16.field268[var4][var3].field380[(arg0 & 4032) + arg2 & 63];
        }
    }
}
