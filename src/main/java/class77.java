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

@OriginalClass("client!tn")
public class class77 extends class416 implements ImageProducer {

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "Lqfa;")
    public static class85 field1563;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "J")
    public static long field1564;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "Lla;")
    public static class421 field1562;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1559;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field1548;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1565;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1553;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "[[Z")
    public static boolean[][] field1549;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V")
    public static void method815(int arg0) {
        field1549 = null;
        field1562 = null;
        if (arg0 != 14) {
            method816(23, 11);
        }
        field1563 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V")
    public static final void method816(int arg0, int arg1) {
        ++field1560;
        if (arg1 == -11876) {
            class19 var2 = class373.method2355(103, arg0, 4);
            var2.method438(arg1 ^ -11590);
        }
    }

    @OriginalMember(owner = "client!tn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1553 == arg0) {
            this.field1553 = null;
        }
        ++field1561;
    }

    @OriginalMember(owner = "client!tn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1547;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    private final synchronized void method817(byte arg0) {
        ++field1551;
        if (this.field1553 != null) {
            int var2 = 124 % ((64 - arg0) / 34);
            this.field1553.setPixels(0, 0, super.field6015, super.field6019, this.field1565, super.field6016, 0, super.field6015);
            this.field1553.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1553 = arg0;
        ++field1556;
        arg0.setDimensions(super.field6015, super.field6019);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1565);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method818(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1555;
        if (this.field1553 != null) {
            int var6 = 11 / ((32 - arg1) / 62);
            this.field1553.setPixels(arg4, arg2, arg3, arg0, this.field1565, super.field6016, super.field6015 * arg2 + arg4, super.field6015);
            this.field1553.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method819(Canvas arg0, int arg1) {
        this.field1559 = arg0;
        ++field1552;
        super.field6015 = this.field1559.getSize().width;
        super.field6019 = this.field1559.getSize().height;
        super.field6016 = new int[super.field6019 * super.field6015];
        this.field1565 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1548 = this.field1559.createImage(this);
        this.method817((byte) 126);
        if (arg1 != 1) {
            this.field1565 = null;
        }
        this.field1559.prepareImage(this.field1548, this.field1559);
        this.method817((byte) -33);
        this.field1559.prepareImage(this.field1548, this.field1559);
        this.method817((byte) 113);
        this.field1559.prepareImage(this.field1548, this.field1559);
    }

    @OriginalMember(owner = "client!tn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1557;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!tn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1558;
        return this.field1553 == arg0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method820(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method818(arg1, 113, arg0, arg3, arg5);
        ++field1550;
        Shape var7 = arg4.getClip();
        if (arg2 >= -37) {
            this.field1553 = null;
        }
        arg4.clipRect(arg5, arg0, arg3, arg1);
        arg4.drawImage(this.field1548, 0, 0, this.field1559);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method821(int arg0, byte arg1, int arg2, Graphics arg3) {
        if (arg1 != 78) {
            this.field1565 = null;
        }
        ++field1554;
        this.method817((byte) -18);
        arg3.drawImage(this.field1548, arg2, arg0, this.field1559);
    }

    static {
        new class571("", 73);
        field1563 = new class85(41, 7);
        field1564 = 0L;
    }
}
