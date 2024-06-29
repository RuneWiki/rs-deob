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

@OriginalClass("client!mq")
public class class59 extends class244 implements ImageProducer {

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field897 = new String[100];

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Lum;")
    public static class83 field895;

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "Lum;")
    public static class83 field910;

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "Ljava/awt/Canvas;")
    private Canvas field913;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field900;

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field912;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field902;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILjava/awt/Graphics;ZII)V", line = 7)
    public final void method381(int arg0, int arg1, Graphics arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            field897 = null;
        }
        this.method386(arg0, arg5, arg4, arg1, 56);
        ++field899;
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg1, arg0, arg4, arg5);
        arg2.drawImage(this.field900, 0, 0, this.field913);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!mq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 23)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field908;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 30)
    private final synchronized void method382(int arg0) {
        ++field914;
        if (this.field902 != null) {
            this.field902.setPixels(arg0, 0, super.field3687, super.field3685, this.field912, super.field3684, 0, super.field3687);
            this.field902.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 45)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field902 = arg0;
        ++field894;
        arg0.setDimensions(super.field3687, super.field3685);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field912);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!mq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 57)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field911;
        if (this.field902 == arg0) {
            this.field902 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLjava/awt/Canvas;)V", line = 72)
    public final void method383(boolean arg0, Canvas arg1) {
        this.field913 = arg1;
        ++field907;
        super.field3687 = this.field913.getSize().width;
        super.field3685 = this.field913.getSize().height;
        if (!arg0) {
            super.field3684 = new int[super.field3687 * super.field3685];
            this.field912 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field900 = this.field913.createImage(this);
            this.method382(0);
            this.field913.prepareImage(this.field900, this.field913);
            this.method382(0);
            this.field913.prepareImage(this.field900, this.field913);
            this.method382(0);
            this.field913.prepareImage(this.field900, this.field913);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BILjava/awt/Graphics;I)V", line = 95)
    public final void method384(byte arg0, int arg1, Graphics arg2, int arg3) {
        ++field903;
        if (arg0 == 124) {
            this.method382(0);
            arg2.drawImage(this.field900, arg1, arg3, this.field913);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V", line = 109)
    public static void method385(byte arg0) {
        int var1 = 59 % ((-10 - arg0) / 57);
        field910 = null;
        field897 = null;
        field895 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)V", line = 123)
    private final synchronized void method386(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field901;
        if (this.field902 != null) {
            this.field902.setPixels(arg3, arg0, arg2, arg1, this.field912, super.field3684, super.field3687 * arg0 + arg3, super.field3687);
            int var6 = -7 % ((arg4 - -14) / 46);
            this.field902.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 140)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field904;
        return this.field902 == arg0;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIII)V", line = 148)
    public static final void method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == 0) {
            ++field906;
            if (arg0 >= class232.field3492 && arg0 <= class36.field453) {
                int var5 = class306.method2023(5, class487.field7124, arg3, class232.field3493);
                int var6 = class306.method2023(5, class487.field7124, arg1, class232.field3493);
                class412.method2591(var6, arg4, arg0, var5, -74);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FBFF)F", line = 172)
    public static final float method388(float arg0, byte arg1, float arg2, float arg3) {
        int var4 = -63 / ((arg1 - -66) / 53);
        ++field905;
        return (arg3 - arg0) * arg2 + arg0;
    }

    @OriginalMember(owner = "client!mq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 182)
    public final void startProduction(ImageConsumer arg0) {
        ++field896;
        this.addConsumer(arg0);
    }
}
