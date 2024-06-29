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

@OriginalClass("client!d")
public class class19 extends class93 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!d", name = "F", descriptor = "Lhb;")
    private static class44 field403 = class102.method810("Close", -28606);

    @OriginalMember(owner = "client!d", name = "z", descriptor = "[I")
    public static int[] field397 = new int[25];

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lhb;")
    private static class44 field393 = class102.method810("Create a free account", -28606);

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lhb;")
    private static class44 field416 = class102.method810(" from your ignore list first", -28606);

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Lhb;")
    public static class44 field399 = field403;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Lhb;")
    private static class44 field395 = class102.method810("wave:", -28606);

    @OriginalMember(owner = "client!d", name = "D", descriptor = "Lhb;")
    public static class44 field401 = class102.method810("mapmarker", -28606);

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field418 = 2;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "Lhb;")
    public static class44 field410 = field395;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "Lhb;")
    private static class44 field412 = class102.method810("Choose Option", -28606);

    @OriginalMember(owner = "client!d", name = "R", descriptor = "Lhb;")
    public static class44 field415 = class102.method810("Wordpack geladen)3", -28606);

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Lhb;")
    public static class44 field405 = field393;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "Lhb;")
    public static class44 field422 = field416;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "Lhb;")
    public static class44 field411 = field412;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "Ltd;")
    public static class116 field421;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field414;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field406;

    @OriginalMember(owner = "client!d", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 11)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field407;
        if (this.field406 == arg0) {
            this.field406 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 22)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field409;
    }

    @OriginalMember(owner = "client!d", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 36)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field413;
        return this.field406 == arg0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 44)
    public final void method142(int arg0, int arg1, int arg2, Component arg3) {
        super.field2353 = new int[arg0 * arg1 + 1];
        super.field2366 = arg1;
        super.field2358 = arg0;
        this.field414 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2363 = arg3.createImage(this);
        ++field402;
        if (arg2 != 3651) {
            field405 = null;
        }
        this.method149((byte) 40);
        arg3.prepareImage(super.field2363, this);
        this.method149((byte) 126);
        arg3.prepareImage(super.field2363, this);
        this.method149((byte) -118);
        arg3.prepareImage(super.field2363, this);
        this.method747(17);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 68)
    public final void method143(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method149((byte) 77);
        if (arg2 == -10166) {
            ++field394;
            arg1.drawImage(super.field2363, arg0, arg3, this);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 80)
    public static final void method144(int arg0) {
        class93.field2360 = new int[104];
        class85.field2169 = new byte[4][104][104];
        class93.field2357 = new int[105][105];
        class94.field2405 = 99;
        class67.field1681 = new byte[4][104][104];
        class1.field27 = new int[104];
        class77.field1921 = new int[104];
        class96.field2435 = new byte[4][105][105];
        class4.field105 = new int[104];
        ++field419;
        if (arg0 != 0) {
            method146(53);
        }
        class55.field1394 = new byte[4][104][104];
        class15.field301 = new int[104];
        class101.field2563 = new int[4][105][105];
        class80.field2046 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!d", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 105)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field417;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lhb;", line = 114)
    public static final class44 method145(int arg0, int arg1) {
        int var2 = -32 % ((73 - arg0) / 52);
        ++field420;
        return ~arg1 > -1000000000 ? class116.method893(10, arg1) : class5.field129;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V", line = 142)
    public static final void method146(int arg0) {
        if (class107.field2711 != null) {
            class107.field2711.method328(256);
            class107.field2711 = null;
        }
        class128.method956(0);
        ++field408;
        class89.field2283.method262();
        if (arg0 == 10) {
            for (int var1 = 0; ~var1 > -5; ++var1) {
                class67.field1678[var1].method740(-105);
            }
            System.gc();
            class1.method6(arg0 ^ 10, 10);
            class15.field286 = -1;
            class117.field2858 = 0;
            class40.method347(true);
            class131.method1009(10, arg0 + -58);
        }
    }

    @OriginalMember(owner = "client!d", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 177)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field398;
        return true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I", line = 193)
    public static final int method147(int arg0, int arg1, int arg2) {
        ++field404;
        if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (arg1 & 127) * arg0 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            int var4 = -25 % ((arg2 - -22) / 40);
            return (arg1 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V", line = 225)
    public static void method148(int arg0) {
        field399 = null;
        field416 = null;
        field411 = null;
        field422 = null;
        field412 = null;
        field401 = null;
        if (arg0 != 104) {
            field418 = -98;
        }
        field421 = null;
        field405 = null;
        field410 = null;
        field415 = null;
        field395 = null;
        field393 = null;
        field397 = null;
        field403 = null;
    }

    @OriginalMember(owner = "client!d", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 273)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field406 = arg0;
        arg0.setDimensions(super.field2366, super.field2358);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field414);
        ++field400;
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 285)
    private final synchronized void method149(byte arg0) {
        ++field396;
        if (this.field406 != null) {
            this.field406.setPixels(0, 0, super.field2366, super.field2358, this.field414, super.field2353, 0, super.field2366);
            this.field406.imageComplete(2);
            int var2 = -109 % ((arg0 - -13) / 50);
        }
    }
}
