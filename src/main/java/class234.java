import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class234 extends class112 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "Lha;")
    public static class46 field4070 = class271.method1828("Lade Texturen )2 ", -46);

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "[I")
    public static int[] field4064 = new int[2000];

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4071;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4063;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "[I")
    public static int[] field4061;

    @OriginalMember(owner = "client!oh", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field4063 == arg0) {
            this.field4063 = null;
        }
        ++field4069;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method682(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method1588((byte) 112);
        ++field4075;
        arg3.drawImage(super.field2122, arg1, arg0, this);
        if (arg2 != 128) {
            field4061 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4072;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)I")
    public static final int method1587(int arg0, int arg1) {
        if (arg0 > -30) {
            method1590((byte) 86);
        }
        ++field4065;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    private final synchronized void method1588(byte arg0) {
        ++field4076;
        if (this.field4063 != null) {
            this.field4063.setPixels(0, 0, super.field2130, super.field2128, this.field4071, super.field2126, 0, super.field2130);
            this.field4063.imageComplete(2);
            int var2 = -20 % ((arg0 - 42) / 63);
        }
    }

    @OriginalMember(owner = "client!oh", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4062;
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4067;
        if (this.field4063 != null) {
            this.field4063.setPixels(arg0, arg1, arg2, arg3, this.field4071, super.field2126, super.field2130 * arg1 + arg0, super.field2130);
            this.field4063.imageComplete(arg4);
        }
    }

    @OriginalMember(owner = "client!oh", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4077;
        this.field4063 = arg0;
        arg0.setDimensions(super.field2130, super.field2128);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4071);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public final void method684(byte arg0, int arg1, Component arg2, int arg3) {
        int var5 = -18 % ((arg0 - 47) / 37);
        super.field2126 = new int[arg1 * arg3 + 1];
        super.field2130 = arg3;
        ++field4066;
        super.field2128 = arg1;
        this.field4071 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2122 = arg2.createImage(this);
        this.method1588((byte) -110);
        arg2.prepareImage(super.field2122, this);
        this.method1588((byte) 122);
        arg2.prepareImage(super.field2122, this);
        this.method1588((byte) 126);
        arg2.prepareImage(super.field2122, this);
        this.method914(37);
    }

    @OriginalMember(owner = "client!oh", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4078;
        return this.field4063 == arg0;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
    public static void method1590(byte arg0) {
        field4064 = null;
        field4070 = null;
        if (arg0 >= 24) {
            field4061 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method683(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        ++field4074;
        if (arg0 <= 108) {
            field4070 = null;
        }
        this.method1589(arg2, arg3, arg5, arg1, 2);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg3, arg5, arg1);
        arg4.drawImage(super.field2122, 0, 0, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!oh", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4060;
    }
}
