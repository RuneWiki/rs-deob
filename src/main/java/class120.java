import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.io.File;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class120 extends class333 implements ImageProducer {

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1657;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1644;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "Llga;")
    public static class663 field1658;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "F")
    public static float field1659;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1652;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Ljava/awt/Image;")
    private Image field1653;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1649;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1651;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field1657 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field1644 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field1658 = new class663(32);
    }

    @OriginalMember(owner = "client!wf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 4)
    public final void startProduction(ImageConsumer arg0) {
        ++field1645;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)V", line = 12)
    private final synchronized void method859(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -109) {
            field1659 = -1.1424642F;
        }
        ++field1655;
        if (this.field1651 != null) {
            this.field1651.setPixels(arg0, arg4, arg2, arg1, this.field1649, super.field4492, super.field4487 * arg4 + arg0, super.field4487);
            this.field1651.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 28)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1656;
        return this.field1651 == arg0;
    }

    @OriginalMember(owner = "client!wf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 36)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1646;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILjava/awt/Graphics;III)V", line = 43)
    public final void method860(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.method859(arg4, arg5, arg1, -113, arg0);
        ++field1647;
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg4, arg0, arg1, arg5);
        arg2.drawImage(this.field1653, 0, 0, this.field1652);
        if (arg3 != 16) {
            this.field1652 = null;
        }
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!wf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 60)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1643;
        this.field1651 = arg0;
        arg0.setDimensions(super.field4487, super.field4493);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1649);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 73)
    public static void method861(int arg0) {
        field1657 = null;
        field1658 = null;
        field1644 = null;
        if (arg0 != -10735) {
            method861(17);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V", line = 87)
    public final void method862(Graphics arg0, boolean arg1, int arg2, int arg3) {
        ++field1642;
        this.method863((byte) -127);
        if (arg1) {
            arg0.drawImage(this.field1653, arg2, arg3, this.field1652);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 107)
    private final synchronized void method863(byte arg0) {
        ++field1650;
        if (this.field1651 != null) {
            if (arg0 <= -111) {
                this.field1651.setPixels(0, 0, super.field4487, super.field4493, this.field1649, super.field4492, 0, super.field4487);
                this.field1651.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 125)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1648;
        if (this.field1651 == arg0) {
            this.field1651 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 140)
    public final void method864(int arg0, Canvas arg1) {
        this.field1652 = arg1;
        ++field1654;
        super.field4487 = this.field1652.getSize().width;
        super.field4493 = this.field1652.getSize().height;
        super.field4492 = new int[super.field4493 * super.field4487];
        if (arg0 != 0) {
            method861(-15);
        }
        this.field1649 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1653 = this.field1652.createImage(this);
        this.method863((byte) -114);
        this.field1652.prepareImage(this.field1653, this.field1652);
        this.method863((byte) -121);
        this.field1652.prepareImage(this.field1653, this.field1652);
        this.method863((byte) -117);
        this.field1652.prepareImage(this.field1653, this.field1652);
    }
}
