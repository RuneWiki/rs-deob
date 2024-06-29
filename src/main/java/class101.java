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

@OriginalClass("client!oa")
public class class101 extends class296 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Llc;")
    public static class86 field1406 = new class86(64);

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "[I")
    public static int[] field1420 = new int[100];

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1421 = "level: ";

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "[I")
    public static int[] field1423 = new int[5];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1405;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1415;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static final void method660(int arg0) {
        ++field1404;
        int var1 = class146.method981(-24191);
        if (var1 != 0) {
            if (var1 == 1) {
                class110.method703((byte) 0, (byte) -98);
                class129.method881(-4415, 512);
                class198.method1263((byte) -96);
            } else {
                class110.method703((byte) (class159.field2222 - 4 & 255), (byte) -82);
                class129.method881(-4415, 2);
            }
        } else {
            class86.field1176 = null;
            class129.method881(-4415, 0);
        }
        if (arg0 < 30) {
            field1406 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method661(int arg0, int arg1, Component arg2, int arg3) {
        super.field4661 = arg0;
        ++field1413;
        super.field4660 = new int[arg0 * arg1 + 1];
        if (arg3 != -45301402) {
            field1423 = null;
        }
        super.field4656 = arg1;
        this.field1405 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field4655 = arg2.createImage(this);
        this.method668((byte) 93);
        arg2.prepareImage(super.field4655, this);
        this.method668((byte) 99);
        arg2.prepareImage(super.field4655, this);
        this.method668((byte) 39);
        arg2.prepareImage(super.field4655, this);
        this.method1979((byte) -92);
    }

    @OriginalMember(owner = "client!oa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1419;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public final void method662(int arg0, int arg1, byte arg2, Graphics arg3) {
        ++field1412;
        this.method668((byte) 73);
        arg3.drawImage(super.field4655, arg0, arg1, this);
        if (arg2 != -69) {
            method664((byte) 100, (class235) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method663(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.method666(arg0, arg4, false, arg5, arg3);
        if (arg1 != 100) {
            field1420 = null;
        }
        ++field1417;
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg5, arg4, arg0, arg3);
        arg2.drawImage(super.field4655, 0, 0, this);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!oa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1414;
        if (this.field1415 == arg0) {
            this.field1415 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1418;
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLhc;)V")
    public static final void method664(byte arg0, class235 arg1) {
        class242.field3713 = arg1;
        if (arg0 == 0) {
            ++field1410;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhc;IB)Lag;")
    public static final class189 method665(class235 arg0, int arg1, byte arg2) {
        ++field1416;
        if (!class294.method1972(arg0, -51, arg1)) {
            return null;
        } else {
            if (arg2 < 21) {
                field1423 = null;
            }
            return class53.method330(5996);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZII)V")
    private final synchronized void method666(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field1403;
        if (this.field1415 != null) {
            if (arg2) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field1415.setPixels(arg3, arg1, arg0, arg4, this.field1405, super.field4660, super.field4661 * arg1 + arg3, super.field4661);
            this.field1415.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!oa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1424;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public static final void method667(int arg0, int arg1, int arg2, int arg3) {
        class89 var4 = class194.field2682[arg0][arg1][arg2];
        if (var4 != null) {
            class228 var5 = var4.field1235;
            if (var5 != null) {
                var5.field3446 = var5.field3446 * arg3 / 16;
                var5.field3457 = var5.field3457 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    private final synchronized void method668(byte arg0) {
        ++field1411;
        if (this.field1415 != null) {
            this.field1415.setPixels(0, 0, super.field4661, super.field4656, this.field1405, super.field4660, 0, super.field4661);
            this.field1415.imageComplete(2);
            if (arg0 <= 32) {
                method664((byte) 36, (class235) null);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1402;
        return this.field1415 == arg0;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    public static final void method669(byte arg0) {
        ++field1407;
        if (!class36.field556) {
            if (class297.field4681) {
                class68.field912 = (float) ((int) class68.field912 + -65 & -128);
            } else {
                class144.field1996 += (-class144.field1996 + -24.0F) / 2.0F;
            }
            class36.field556 = true;
            class20.field291 = true;
            if (arg0 != 28) {
                method664((byte) 42, (class235) null);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V")
    public static final void method670(byte arg0, int arg1) {
        class41.field611.method536(83, arg1);
        ++field1409;
        int var2 = -12 / ((33 - arg0) / 49);
    }

    @OriginalMember(owner = "client!oa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1408;
        this.field1415 = arg0;
        arg0.setDimensions(super.field4661, super.field4656);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1405);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
    public static void method671(byte arg0) {
        field1421 = null;
        field1423 = null;
        if (arg0 != 84) {
            field1422 = -25;
        }
        field1420 = null;
        field1406 = null;
    }
}
