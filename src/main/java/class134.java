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

@OriginalClass("client!qm")
public class class134 extends class348 implements ImageProducer {

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1627;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field1625;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1632;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1629;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method795(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.method867((byte) -87, arg0, arg3, arg4, arg1);
        ++field1634;
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg0, arg3, arg1, arg4);
        arg2.drawImage(this.field1625, 0, 0, this.field1627);
        int var8 = -30 / ((arg5 - 27) / 40);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!qm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1631;
    }

    @OriginalMember(owner = "client!qm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1635;
        this.field1629 = arg0;
        arg0.setDimensions(super.field4469, super.field4473);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1632);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BIIII)V")
    private final synchronized void method867(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1637;
        if (this.field1629 != null) {
            int var6 = 100 / ((arg0 - -25) / 62);
            this.field1629.setPixels(arg1, arg2, arg4, arg3, this.field1632, super.field4472, super.field4469 * arg2 - -arg1, super.field4469);
            this.field1629.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public final void method797(int arg0, Graphics arg1, byte arg2, int arg3) {
        this.method868(arg2 + 203);
        ++field1636;
        arg1.drawImage(this.field1625, arg3, arg0, this.field1627);
        if (arg2 != -119) {
            this.field1632 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method796(Canvas arg0, byte arg1) {
        ++field1626;
        this.field1627 = arg0;
        if (arg1 != 46) {
            this.field1627 = null;
        }
        super.field4469 = this.field1627.getSize().width;
        super.field4473 = this.field1627.getSize().height;
        super.field4472 = new int[super.field4473 * super.field4469];
        this.field1632 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1625 = this.field1627.createImage(this);
        this.method868(64);
        this.field1627.prepareImage(this.field1625, this.field1627);
        this.method868(103);
        this.field1627.prepareImage(this.field1625, this.field1627);
        this.method868(83);
        this.field1627.prepareImage(this.field1625, this.field1627);
    }

    @OriginalMember(owner = "client!qm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1630;
        if (this.field1629 == arg0) {
            this.field1629 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    private final synchronized void method868(int arg0) {
        if (arg0 >= 48) {
            ++field1628;
            if (this.field1629 != null) {
                this.field1629.setPixels(0, 0, super.field4469, super.field4473, this.field1632, super.field4472, 0, super.field4469);
                this.field1629.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1633;
    }

    @OriginalMember(owner = "client!qm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1624;
        return this.field1629 == arg0;
    }
}
