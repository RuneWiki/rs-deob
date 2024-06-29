import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class124 extends class677 implements ImageProducer {

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "Z")
    public static boolean field1614 = false;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "Ljo;")
    public static class351 field1618 = new class351(51, -1);

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "Lke;")
    public static class622 field1627 = new class622(129, 6);

    @OriginalMember(owner = "client!bba", name = "L", descriptor = "F")
    public static float field1630;

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!bba", name = "B", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!bba", name = "K", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "J")
    public static long field1628;

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1617;

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field1619;

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1612;

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1616;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/awt/Canvas;BI)V")
    public final void method909(int arg0, Canvas arg1, byte arg2, int arg3) {
        this.field1617 = arg1;
        int var5 = -66 % ((arg2 - -60) / 58);
        super.field9632 = arg0;
        super.field9635 = arg3;
        ++field1629;
        super.field9631 = new int[super.field9635 * super.field9632];
        this.field1612 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1619 = this.field1617.createImage(this);
        this.method910(1);
        this.field1617.prepareImage(this.field1619, this.field1617);
        this.method910(1);
        this.field1617.prepareImage(this.field1619, this.field1617);
        this.method910(1);
        this.field1617.prepareImage(this.field1619, this.field1617);
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
    private final synchronized void method910(int arg0) {
        if (arg0 != 1) {
            this.method910(3);
        }
        ++field1625;
        if (this.field1616 != null) {
            this.field1616.setPixels(0, 0, super.field9635, super.field9632, this.field1612, super.field9631, 0, super.field9635);
            this.field1616.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public final void method911(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        ++field1613;
        this.method912((byte) -104, arg6, arg3, arg2, arg7);
        Shape var9 = arg4.getClip();
        int var10 = 24 / ((-6 - arg5) / 54);
        arg4.clipRect(arg1, arg0, arg3, arg7);
        arg4.drawImage(this.field1619, arg1 - arg2, arg0 - arg6, this.field1617);
        arg4.setClip(var9);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(BIIII)V")
    private final synchronized void method912(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -97) {
            this.method910(49);
        }
        ++field1623;
        if (this.field1616 != null) {
            this.field1616.setPixels(arg3, arg1, arg2, arg4, this.field1612, super.field9631, super.field9635 * arg1 + arg3, super.field9635);
            this.field1616.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)I")
    public static final int method913(int arg0, int arg1) {
        ++field1610;
        if (~arg0 > -97) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            if (arg1 != -14660) {
                field1614 = false;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(I)V")
    public static final void method914(int arg0) {
        ++field1611;
        class449.method2699(arg0, class145.field1852.field9013.method2104((byte) -118) == 1, -91, 2);
        class262.field3703 = class276.method1783(0, class359.field5219, 22050, class27.field395, -1);
        class659.method3765(class405.method2439(true, (class110) null), true, true);
        class405.field5708 = class276.method1783(1, class359.field5219, 2048, class27.field395, -1);
        class229.field3307 = new class594();
        class405.field5708.method1649(-70, class229.field3307);
        class789.field10832 = new class549(22050, class110.field1367);
        class368.method2288(123);
    }

    @OriginalMember(owner = "client!bba", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1622;
    }

    @OriginalMember(owner = "client!bba", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1616 == arg0) {
            this.field1616 = null;
        }
        ++field1620;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
    public static void method915(byte arg0) {
        if (arg0 != 74) {
            field1627 = null;
        }
        field1627 = null;
        field1618 = null;
    }

    @OriginalMember(owner = "client!bba", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1626;
        this.field1616 = arg0;
        arg0.setDimensions(super.field9635, super.field9632);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1612);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bba", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1609;
        return this.field1616 == arg0;
    }

    @OriginalMember(owner = "client!bba", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1621;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(II)Z")
    public static final boolean method916(int arg0, int arg1) {
        if (arg1 < 21) {
            method916(-82, 43);
        }
        ++field1615;
        return arg0 == 0 || arg0 == 1 || ~arg0 == -3;
    }
}
