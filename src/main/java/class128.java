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

@OriginalClass("client!qo")
public class class128 extends class165 implements ImageProducer {

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "Z")
    public static boolean field1746 = false;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public static int field1750 = -1;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "[I")
    public static int[] field1758 = new int[50];

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1751;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field1743;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1753;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1738;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    private final synchronized void method960(int arg0) {
        ++field1756;
        if (arg0 == -19384) {
            if (this.field1738 != null) {
                this.field1738.setPixels(0, 0, super.field2401, super.field2398, this.field1753, super.field2400, 0, super.field2401);
                this.field1738.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILvc;J)V")
    public static final void method961(int arg0, class89 arg1, long arg2) {
        class368.field5057 = class414.field5682;
        ++field1741;
        class406.field5540 = 0;
        class414.field5682 = 0;
        long var4 = class10.method51(-3183);
        if (arg0 != 16711680) {
            field1749 = 87;
        }
        for (class113 var6 = (class113) class384.field5274.method1763((byte) -45); var6 != null; var6 = (class113) class384.field5274.method1767(true)) {
            if (var6.method898(arg1, arg2)) {
                ++class406.field5540;
            }
        }
        if (class187.field2802 && ~(arg2 % 100L) == -1L) {
            System.out.println("Particle system count: " + class384.field5274.method1771(arg0 + -16711680) + ", running: " + class406.field5540 + ". Particles: " + class414.field5682 + ". Time taken: " + (class10.method51(-3183) + -var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method962(int arg0, Canvas arg1) {
        this.field1751 = arg1;
        ++field1744;
        super.field2401 = this.field1751.getSize().width;
        super.field2398 = this.field1751.getSize().height;
        super.field2400 = new int[super.field2401 * super.field2398];
        this.field1753 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1743 = this.field1751.createImage(this);
        this.method960(-19384);
        this.field1751.prepareImage(this.field1743, this.field1751);
        this.method960(-19384);
        this.field1751.prepareImage(this.field1743, this.field1751);
        this.method960(-19384);
        if (arg0 >= -47) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        this.field1751.prepareImage(this.field1743, this.field1751);
    }

    @OriginalMember(owner = "client!qo", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1745;
    }

    @OriginalMember(owner = "client!qo", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1738 == arg0) {
            this.field1738 = null;
        }
        ++field1747;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public static void method963(int arg0) {
        field1758 = null;
        if (arg0 != 16711680) {
            method963(-108);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
    public final void method964(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method965(100, arg2, arg3, arg0, arg5);
        if (arg4 >= 43) {
            ++field1754;
            Shape var7 = arg1.getClip();
            arg1.clipRect(arg2, arg0, arg3, arg5);
            arg1.drawImage(this.field1743, 0, 0, this.field1751);
            arg1.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1757;
        if (this.field1738 != null) {
            if (arg0 == 100) {
                this.field1738.setPixels(arg1, arg3, arg2, arg4, this.field1753, super.field2400, super.field2401 * arg3 + arg1, super.field2401);
                this.field1738.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1752;
        return this.field1738 == arg0;
    }

    @OriginalMember(owner = "client!qo", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1742;
        this.field1738 = arg0;
        arg0.setDimensions(super.field2401, super.field2398);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1753);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method966(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 != 5) {
            this.field1751 = null;
        }
        this.method960(-19384);
        ++field1739;
        arg3.drawImage(this.field1743, arg1, arg0, this.field1751);
    }

    @OriginalMember(owner = "client!qo", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1748;
        this.addConsumer(arg0);
    }
}
