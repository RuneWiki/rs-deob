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

@OriginalClass("client!hl")
public class class296 extends class179 implements ImageProducer {

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "[[I")
    public static int[][] field3838 = new int[128][128];

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "Lkr;")
    public static class329 field3844;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3852;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field3836;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3846;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3837;

    @OriginalMember(owner = "client!hl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3837 == arg0) {
            this.field3837 = null;
        }
        ++field3850;
    }

    @OriginalMember(owner = "client!hl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3837 = arg0;
        ++field3848;
        arg0.setDimensions(super.field2302, super.field2303);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3846);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
    public final void method155(boolean arg0, Canvas arg1) {
        ++field3853;
        this.field3852 = arg1;
        super.field2302 = this.field3852.getSize().width;
        if (arg0) {
            this.addConsumer((ImageConsumer) null);
        }
        super.field2303 = this.field3852.getSize().height;
        super.field2308 = new int[super.field2303 * super.field2302];
        this.field3846 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3836 = this.field3852.createImage(this);
        this.method1819(-17764);
        this.field3852.prepareImage(this.field3836, this.field3852);
        this.method1819(-17764);
        this.field3852.prepareImage(this.field3836, this.field3852);
        this.method1819(-17764);
        this.field3852.prepareImage(this.field3836, this.field3852);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
    public static void method1817(boolean arg0) {
        if (arg0) {
            field3838 = null;
        }
        field3838 = null;
        field3844 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)Lqba;")
    public static final class541 method1818(int arg0, int arg1) {
        ++field3840;
        class311[] var2 = class75.field1023;
        synchronized (class75.field1023) {
            class541 var3;
            if (class75.field1023.length > arg1 && !class75.field1023[arg1].method1881(0)) {
                var3 = (class541) class75.field1023[arg1].method1875((byte) -15);
                var3.method3394(false);
                int var10002 = class516.field7208[arg1]--;
            } else {
                var3 = new class541();
                var3.field7564 = new class378[arg1];
                for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                    var3.field7564[var4] = new class378();
                }
            }
            if (arg0 != 16711680) {
                field3838 = null;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    private final synchronized void method1819(int arg0) {
        ++field3839;
        if (arg0 != -17764) {
            this.isConsumer((ImageConsumer) null);
        }
        if (this.field3837 != null) {
            this.field3837.setPixels(0, 0, super.field2302, super.field2303, this.field3846, super.field2308, 0, super.field2302);
            this.field3837.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method153(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 29235) {
            this.startProduction((ImageConsumer) null);
        }
        this.method1819(-17764);
        ++field3843;
        arg2.drawImage(this.field3836, arg3, arg1, this.field3852);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIIII)V")
    private final synchronized void method1820(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3854;
        if (this.field3837 != null) {
            this.field3837.setPixels(arg4, arg0, arg3, arg1, this.field3846, super.field2308, super.field2302 * arg0 + arg4, super.field2302);
            this.field3837.imageComplete(2);
            int var6 = 18 % ((arg2 - -36) / 45);
        }
    }

    @OriginalMember(owner = "client!hl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3841;
    }

    @OriginalMember(owner = "client!hl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3847;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3849;
        return this.field3837 == arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method154(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        ++field3851;
        this.method1820(arg2, arg0, arg5 ^ -118, arg4, arg1);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg1, arg2, arg4, arg0);
        if (arg5 == 2) {
            arg3.drawImage(this.field3836, 0, 0, this.field3852);
            arg3.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLqa;)V")
    public static final void method1821(byte arg0, class167 arg1) {
        ++field3845;
        if (~class370.field5155.method3176(false) != -1) {
            if (arg0 == 124) {
                if (class428.field5845 == 0) {
                    for (class526 var2 = (class526) class370.field5155.method3188((byte) -100); var2 != null; var2 = (class526) class370.field5155.method3182((byte) -73)) {
                        class98.field1307.method3382(arg1, false, var2.field7321, var2.field7323, var2.field7316, var2.field7318 ? class147.field1899.field274 : null, var2.field7322, class332.field4584, arg1, false, var2.field7315, (byte) 1);
                        var2.method589(-8880);
                    }
                    class145.method794((byte) 125);
                } else {
                    if (class287.field3757 == null) {
                        Canvas var3 = new Canvas();
                        var3.setSize(36, 32);
                        class287.field3757 = class167.method904(0, 0, var3, true, class615.field8870, class555.field7756);
                        class167.field2119 = class287.field3757.method982(class477.method2705(class39.field592, 0, (byte) -26, class532.field7434), class295.method1803(class24.field433, class39.field592, 0), true);
                    }
                    for (class526 var4 = (class526) class370.field5155.method3188((byte) -100); var4 != null; var4 = (class526) class370.field5155.method3182((byte) -82)) {
                        class98.field1307.method3382(arg1, false, var4.field7321, var4.field7323, var4.field7316, !var4.field7318 ? null : class147.field1899.field274, var4.field7322, class167.field2119, class287.field3757, false, var4.field7315, (byte) 1);
                        var4.method589(-8880);
                    }
                }
            }
        }
    }
}
