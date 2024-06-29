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

@OriginalClass("mapview!l")
public class class23 extends class31 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "I")
    public static int field220 = 1;

    @OriginalMember(owner = "mapview!l", name = "j", descriptor = "Lu;")
    public static class38 field219 = class28.method177("Mace Shop", (byte) -84);

    @OriginalMember(owner = "mapview!l", name = "m", descriptor = "Lu;")
    public static class38 field222 = class28.method177("download", (byte) -84);

    @OriginalMember(owner = "mapview!l", name = "n", descriptor = "Lu;")
    public static class38 field223 = class28.method177("Quest Start", (byte) -84);

    @OriginalMember(owner = "mapview!l", name = "o", descriptor = "Lu;")
    public static class38 field224 = class28.method177("Key", (byte) -84);

    @OriginalMember(owner = "mapview!l", name = "r", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "mapview!l", name = "p", descriptor = "I")
    public static int field225 = 0;

    @OriginalMember(owner = "mapview!l", name = "l", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field221;

    @OriginalMember(owner = "mapview!l", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field226;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 18)
    public final void method128(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != -12218) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        this.method132(2);
        arg2.drawImage(super.field390, arg3, arg1, this);
    }

    @OriginalMember(owner = "mapview!l", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 42)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field226 == arg0;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I[B)V", line = 50)
    public static final void method129(int arg0, byte[] arg1) {
        class19 var2 = new class19(arg1);
        var2.field196 = arg1.length - 2;
        class38.field479 = var2.method119((byte) 112);
        class38.field485 = new int[class38.field479];
        class18.field175 = new int[class38.field479];
        class17.field171 = new int[class38.field479];
        mapview.field339 = new int[class38.field479];
        class16.field159 = new byte[class38.field479][];
        var2.field196 = arg1.length + -7 + -(class38.field479 * 8);
        if (arg0 >= -52) {
            field222 = (class38) null;
        }
        class8.field81 = var2.method119((byte) 127);
        class4.field49 = var2.method119((byte) 125);
        int var3 = (var2.method115(-2) & 255) + 1;
        for (int var4 = 0; ~var4 > ~class38.field479; ++var4) {
            class17.field171[var4] = var2.method119((byte) 118);
        }
        for (int var5 = 0; class38.field479 > var5; ++var5) {
            class18.field175[var5] = var2.method119((byte) 123);
        }
        for (int var6 = 0; ~class38.field479 < ~var6; ++var6) {
            mapview.field339[var6] = var2.method119((byte) 118);
        }
        for (int var7 = 0; ~class38.field479 < ~var7; ++var7) {
            class38.field485[var7] = var2.method119((byte) 109);
        }
        var2.field196 = -((var3 + -1) * 3) + -(class38.field479 * 8) + arg1.length + -7;
        class7.field62 = new int[var3];
        for (int var8 = 1; ~var8 > ~var3; ++var8) {
            class7.field62[var8] = var2.method112(30419);
            if (class7.field62[var8] == 0) {
                class7.field62[var8] = 1;
            }
        }
        var2.field196 = 0;
        for (int var9 = 0; var9 < class38.field479; ++var9) {
            int var10 = mapview.field339[var9];
            int var11 = class38.field485[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class16.field159[var9] = var13;
            int var14 = var2.method115(-2);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; ++var15) {
                    var13[var15] = var2.method120(true);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; ++var16) {
                    for (int var17 = 0; ~var11 < ~var17; ++var17) {
                        var13[var10 * var17 + var16] = var2.method120(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!l", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 172)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field226 = arg0;
        arg0.setDimensions(super.field386, super.field387);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field221);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!l", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 188)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(I)V", line = 207)
    public static void method130(int arg0) {
        if (arg0 == 0) {
            field222 = null;
            field223 = null;
            field224 = null;
            field219 = null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 226)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!l", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 233)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field226 == arg0) {
            this.field226 = null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 246)
    public final void method131(Component arg0, int arg1, int arg2, int arg3) {
        super.field388 = new int[arg1 * arg2 - -1];
        super.field386 = arg1;
        super.field387 = arg2;
        if (arg3 < -36) {
            this.field221 = new DirectColorModel(32, 16711680, 65280, 255);
            super.field390 = arg0.createImage(this);
            this.method132(2);
            arg0.prepareImage(super.field390, this);
            this.method132(2);
            arg0.prepareImage(super.field390, this);
            this.method132(2);
            arg0.prepareImage(super.field390, this);
            this.method187(0);
        }
    }

    @OriginalMember(owner = "mapview!l", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 271)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "(I)V", line = 282)
    private final synchronized void method132(int arg0) {
        if (this.field226 != null) {
            this.field226.setPixels(0, 0, super.field386, super.field387, this.field221, super.field388, 0, super.field386);
            this.field226.imageComplete(arg0);
        }
    }
}
