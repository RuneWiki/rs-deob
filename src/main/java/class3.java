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

@OriginalClass("mapview!b")
public class class3 extends class36 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!b", name = "p", descriptor = "Z")
    public static volatile boolean field76 = true;

    @OriginalMember(owner = "mapview!b", name = "n", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "mapview!b", name = "m", descriptor = "I")
    public static volatile int field73 = 0;

    @OriginalMember(owner = "mapview!b", name = "o", descriptor = "I")
    public static int field75 = -1;

    @OriginalMember(owner = "mapview!b", name = "t", descriptor = "Lt;")
    public static class35 field80 = method28(false, "Vegetable Store");

    @OriginalMember(owner = "mapview!b", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field77;

    @OriginalMember(owner = "mapview!b", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field78;

    @OriginalMember(owner = "mapview!b", name = "s", descriptor = "[B")
    public static byte[] field79;

    @OriginalMember(owner = "mapview!b", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 7)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!b", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 18)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field78 == arg0;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 34)
    public static void method26(int arg0) {
        field80 = null;
        if (arg0 == 255) {
            field79 = null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 44)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 48)
    public final void method27(Component arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            this.addConsumer((ImageConsumer) null);
        }
        super.field449 = new int[arg2 * arg3 + 1];
        super.field446 = arg3;
        super.field447 = arg2;
        this.field77 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field444 = arg0.createImage(this);
        this.method30(23614);
        arg0.prepareImage(super.field444, this);
        this.method30(23614);
        arg0.prepareImage(super.field444, this);
        this.method30(23614);
        arg0.prepareImage(super.field444, this);
        this.method231((byte) -68);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ZLjava/lang/String;)Lt;", line = 71)
    public static final class35 method28(boolean arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        if (arg0) {
            return (class35) null;
        } else {
            int var3 = var2.length;
            class35 var4 = new class35();
            var4.field433 = new byte[var3];
            int var5 = 0;
            while (var3 > var5) {
                int var6 = 255 & var2[var5++];
                if (-46 <= ~var6 && 40 <= var6) {
                    if (var5 >= var3) {
                        break;
                    }
                    int var7 = var2[var5++] & 255;
                    var4.field433[var4.field434++] = (byte) ((var6 + -40) * 43 - 48 + var7);
                } else if (var6 != 0) {
                    var4.field433[var4.field434++] = (byte) var6;
                }
            }
            var4.method210((byte) 116);
            return var4.method214((byte) 111);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(III[B)I", line = 111)
    public static final int method29(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; ++var5) {
            var4 = class21.field235[(arg3[var5] ^ var4) & 255] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        if (arg1 != 14) {
            method26(-76);
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!b", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 163)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field78 = arg0;
        arg0.setDimensions(super.field447, super.field446);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field77);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(I)V", line = 177)
    private final synchronized void method30(int arg0) {
        if (this.field78 != null) {
            this.field78.setPixels(0, 0, super.field447, super.field446, this.field77, super.field449, 0, super.field447);
            this.field78.imageComplete(2);
            if (arg0 != 23614) {
                this.startProduction((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 194)
    public final void method31(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method30(arg0 ^ 23615);
        if (arg0 != 1) {
            field79 = (byte[]) null;
        }
        arg2.drawImage(super.field444, arg3, arg1, this);
    }

    @OriginalMember(owner = "mapview!b", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 206)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!b", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 214)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field78 == arg0) {
            this.field78 = null;
        }
    }
}
