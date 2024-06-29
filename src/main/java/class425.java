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

@OriginalClass("client!re")
public class class425 extends class185 implements ImageProducer {

    @OriginalMember(owner = "client!re", name = "N", descriptor = "Lsl;")
    public static class318 field6284;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Lji;")
    public static class432 field6285;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6277;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "Ljava/awt/Image;")
    private Image field6282;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field6274;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field6271;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2598(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            ++field6275;
            return class513.method3050(arg2, arg0, (byte) -55) | ~(2048 & arg2) != -1 || class66.method645(-20147, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!re", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field6271 == arg0) {
            this.field6271 = null;
        }
        ++field6267;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    private final synchronized void method2599(int arg0) {
        ++field6281;
        if (this.field6271 != null) {
            this.field6271.setPixels(arg0, 0, super.field2590, super.field2589, this.field6274, super.field2588, 0, super.field2590);
            this.field6271.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZIII)V")
    private final synchronized void method2600(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field6279;
        if (this.field6271 != null) {
            this.field6271.setPixels(arg2, arg3, arg4, arg0, this.field6274, super.field2588, super.field2590 * arg3 - -arg2, super.field2590);
            this.field6271.imageComplete(2);
            if (!arg1) {
                this.isConsumer((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field6273;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1301(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field6268;
        if (arg0 == -10312) {
            this.method2599(0);
            arg3.drawImage(this.field6282, arg1, arg2, this.field6277);
        }
    }

    @OriginalMember(owner = "client!re", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field6269;
        return this.field6271 == arg0;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public static void method2601(int arg0) {
        field6285 = null;
        if (arg0 != 2) {
            field6285 = null;
        }
        field6284 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
    public final void method1294(int arg0, int arg1, int arg2, Graphics arg3, byte arg4, int arg5) {
        this.method2600(arg5, true, arg2, arg0, arg1);
        ++field6272;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg2, arg0, arg1, arg5);
        arg3.drawImage(this.field6282, 0, 0, this.field6277);
        arg3.setClip(var7);
        if (arg4 >= -1) {
            method2598(-14, false, -78);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public final void method1299(byte arg0, Canvas arg1) {
        this.field6277 = arg1;
        ++field6270;
        super.field2590 = this.field6277.getSize().width;
        super.field2589 = this.field6277.getSize().height;
        super.field2588 = new int[super.field2590 * super.field2589];
        this.field6274 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field6282 = this.field6277.createImage(this);
        this.method2599(0);
        this.field6277.prepareImage(this.field6282, this.field6277);
        this.method2599(0);
        this.field6277.prepareImage(this.field6282, this.field6277);
        this.method2599(0);
        this.field6277.prepareImage(this.field6282, this.field6277);
        if (arg0 != 66) {
            this.field6271 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field6271 = arg0;
        ++field6276;
        arg0.setDimensions(super.field2590, super.field2589);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field6274);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!re", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field6280;
    }

    static {
        new class331("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6284 = new class318(34, 11);
    }
}
