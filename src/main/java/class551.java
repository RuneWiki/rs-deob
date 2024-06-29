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

@OriginalClass("client!tc")
public class class551 extends class453 implements ImageProducer {

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field7807 = 0;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field7801 = -2;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Lbv;")
    public static class567 field7810 = new class567("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "Liu;")
    public static class517 field7814 = new class517(31, 6);

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7800;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field7811;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field7809;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field7806;

    @OriginalMember(owner = "client!tc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 3)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field7808;
        this.field7806 = arg0;
        arg0.setDimensions(super.field6565, super.field6566);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field7809);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 18)
    public static void method3096(int arg0) {
        int var1 = 90 / ((57 - arg0) / 45);
        field7810 = null;
        field7814 = null;
    }

    @OriginalMember(owner = "client!tc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 30)
    public final void startProduction(ImageConsumer arg0) {
        ++field7802;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!tc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 43)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field7812;
    }

    @OriginalMember(owner = "client!tc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 50)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field7806 == arg0) {
            this.field7806 = null;
        }
        ++field7798;
    }

    @OriginalMember(owner = "client!tc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 61)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field7815;
        return this.field7806 == arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLjava/awt/Canvas;)V", line = 70)
    public final void method1289(byte arg0, Canvas arg1) {
        ++field7813;
        this.field7800 = arg1;
        super.field6565 = this.field7800.getSize().width;
        super.field6566 = this.field7800.getSize().height;
        super.field6564 = new int[super.field6566 * super.field6565];
        this.field7809 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field7811 = this.field7800.createImage(this);
        this.method3099((byte) -108);
        this.field7800.prepareImage(this.field7811, this.field7800);
        if (arg0 != -72) {
            field7814 = null;
        }
        this.method3099((byte) -108);
        this.field7800.prepareImage(this.field7811, this.field7800);
        this.method3099((byte) -128);
        this.field7800.prepareImage(this.field7811, this.field7800);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZII)V", line = 92)
    private final synchronized void method3097(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            ++field7805;
            if (this.field7806 != null) {
                this.field7806.setPixels(arg3, arg4, arg0, arg1, this.field7809, super.field6564, super.field6565 * arg4 - -arg3, super.field6565);
                this.field7806.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Lbr;", line = 110)
    public static final class184 method3098(int arg0, int arg1, int arg2) {
        if (class277.field4051[arg0][arg1][arg2] == null) {
            boolean var3 = class277.field4051[0][arg1][arg2] != null && class277.field4051[0][arg1][arg2].field2667 != null;
            if (var3 && arg0 >= class146.field2246 - 1) {
                return null;
            }
            class636.method3673(arg0, arg1, arg2);
        }
        return class277.field4051[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 126)
    private final synchronized void method3099(byte arg0) {
        ++field7803;
        if (this.field7806 != null) {
            this.field7806.setPixels(0, 0, super.field6565, super.field6566, this.field7809, super.field6564, 0, super.field6565);
            if (arg0 <= -86) {
                this.field7806.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 146)
    public final void method1290(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method3097(arg1, arg5, false, arg2, arg0);
        if (arg3 != -9600) {
            this.addConsumer((ImageConsumer) null);
        }
        ++field7799;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg0, arg1, arg5);
        arg4.drawImage(this.field7811, 0, 0, this.field7800);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 169)
    public final void method1291(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method3099((byte) -113);
        if (arg2 != 26356) {
            this.startProduction((ImageConsumer) null);
        }
        ++field7804;
        arg1.drawImage(this.field7811, arg3, arg0, this.field7800);
    }
}
