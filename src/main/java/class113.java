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

@OriginalClass("client!sa")
public class class113 extends class57 implements ImageProducer {

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Z")
    public static boolean field1654 = true;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "[Lbl;")
    public static class387[] field1658 = new class387[14];

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1653;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field1660;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1656;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1655;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 8)
    public static final void method745(int arg0) {
        ++field1646;
        class197.field2735.method1243(1000);
        class410.field5951.method1243(1000);
        int var1 = -108 % ((arg0 - 51) / 58);
        class337.field4590.method1243(1000);
        class144.field2088.method1243(1000);
        class120.field1697.method1243(1000);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 23)
    public static void method746(byte arg0) {
        int var1 = -77 % ((arg0 - -13) / 43);
        field1658 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V", line = 34)
    public final void method375(int arg0, byte arg1, Graphics arg2, int arg3) {
        ++field1659;
        int var5 = -93 % ((arg1 - -53) / 49);
        this.method749(true);
        arg2.drawImage(this.field1660, arg0, arg3, this.field1653);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 45)
    public final void method380(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        ++field1657;
        this.method751(arg0, arg2, (byte) -87, arg3, arg5);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg5, arg3, arg0);
        int var8 = 111 / ((-32 - arg1) / 51);
        arg4.drawImage(this.field1660, 0, 0, this.field1653);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 62)
    public static final void method747(boolean arg0) {
        ++field1645;
        class308.field4230.method1826(((float) class326.field4453 * 0.1F + 0.7F) * 1.1523438F);
        class308.field4230.method1814(class262.field3584, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class308.field4230.method1787(class138.field1971, -1);
        if (arg0) {
            class308.field4230.method1756(class236.field3215);
        }
    }

    @OriginalMember(owner = "client!sa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 78)
    public final void startProduction(ImageConsumer arg0) {
        ++field1650;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 87)
    public final void method382(Canvas arg0, byte arg1) {
        this.field1653 = arg0;
        ++field1642;
        super.field816 = this.field1653.getSize().width;
        super.field820 = this.field1653.getSize().height;
        super.field819 = new int[super.field820 * super.field816];
        this.field1656 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 != -75) {
            method750(122);
        }
        this.field1660 = this.field1653.createImage(this);
        this.method749(true);
        this.field1653.prepareImage(this.field1660, this.field1653);
        this.method749(true);
        this.field1653.prepareImage(this.field1660, this.field1653);
        this.method749(true);
        this.field1653.prepareImage(this.field1660, this.field1653);
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 109)
    public static final void method748(int arg0) {
        ++field1648;
        class190 var1 = class395.field5772;
        synchronized (class395.field5772) {
            int var2 = -60 / ((79 - arg0) / 38);
            class395.field5772.method1249(1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 123)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1643;
        return this.field1655 == arg0;
    }

    @OriginalMember(owner = "client!sa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 133)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1644;
        this.field1655 = arg0;
        arg0.setDimensions(super.field816, super.field820);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1656);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V", line = 160)
    private final synchronized void method749(boolean arg0) {
        ++field1649;
        if (!arg0) {
            this.removeConsumer((ImageConsumer) null);
        }
        if (this.field1655 != null) {
            this.field1655.setPixels(0, 0, super.field816, super.field820, this.field1656, super.field819, 0, super.field816);
            this.field1655.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V", line = 175)
    public static final void method750(int arg0) {
        ++field1651;
        int var1 = arg0;
        for (int var2 = 0; ~var2 > ~class432.field6220; ++var2) {
            for (int var3 = 0; var3 < class267.field3646; ++var3) {
                if (class247.method1542(var3, true, var1, var2, class5.field79, 1)) {
                    ++var1;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBII)V", line = 210)
    private final synchronized void method751(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field1662;
        if (this.field1655 != null) {
            this.field1655.setPixels(arg1, arg4, arg3, arg0, this.field1656, super.field819, super.field816 * arg4 + arg1, super.field816);
            this.field1655.imageComplete(2);
            if (arg2 > -10) {
                this.field1655 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 225)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1655 == arg0) {
            this.field1655 = null;
        }
        ++field1647;
    }

    @OriginalMember(owner = "client!sa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 237)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1652;
    }
}
