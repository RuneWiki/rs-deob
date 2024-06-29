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

@OriginalClass("client!mc")
public class class122 extends class106 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lob;")
    public static class141 field2336 = class175.method1195(40, ")2");

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Lvc;")
    public static class212 field2335 = new class212(5);

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2339;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2347;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBIII)V")
    private final synchronized void method788(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field2345;
        if (this.field2347 != null) {
            this.field2347.setPixels(arg3, arg2, arg0, arg4, this.field2339, super.field2047, super.field2035 * arg2 + arg3, super.field2035);
            if (arg1 != 28) {
                this.requestTopDownLeftRightResend((ImageConsumer) null);
            }
            this.field2347.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method655(int arg0, Graphics arg1, int arg2, int arg3) {
        ++field2350;
        this.method789((byte) 97);
        int var5 = 64 % ((arg3 - -12) / 34);
        arg1.drawImage(super.field2045, arg0, arg2, this);
    }

    @OriginalMember(owner = "client!mc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2340;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method656(int arg0, int arg1, Component arg2, int arg3) {
        super.field2038 = arg0;
        ++field2344;
        super.field2035 = arg3;
        super.field2047 = new int[arg0 * arg3 - -1];
        this.field2339 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 == 20053) {
            super.field2045 = arg2.createImage(this);
            this.method789((byte) 66);
            arg2.prepareImage(super.field2045, this);
            this.method789((byte) 47);
            arg2.prepareImage(super.field2045, this);
            this.method789((byte) 73);
            arg2.prepareImage(super.field2045, this);
            this.method704(-5);
        }
    }

    @OriginalMember(owner = "client!mc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2343;
        return this.field2347 == arg0;
    }

    @OriginalMember(owner = "client!mc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2348;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
    private final synchronized void method789(byte arg0) {
        ++field2338;
        if (this.field2347 != null) {
            if (arg0 < 9) {
                this.method789((byte) -3);
            }
            this.field2347.setPixels(0, 0, super.field2035, super.field2038, this.field2339, super.field2047, 0, super.field2035);
            this.field2347.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method657(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        int var7 = -34 % ((-40 - arg0) / 37);
        this.method788(arg1, (byte) 28, arg4, arg2, arg5);
        ++field2337;
        Shape var8 = arg3.getClip();
        arg3.clipRect(arg2, arg4, arg1, arg5);
        arg3.drawImage(super.field2045, 0, 0, this);
        arg3.setClip(var8);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static void method790(int arg0) {
        field2336 = null;
        field2335 = null;
        if (arg0 != 0) {
            field2335 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2341;
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2349;
        if (this.field2347 == arg0) {
            this.field2347 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2342;
        this.field2347 = arg0;
        arg0.setDimensions(super.field2035, super.field2038);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2339);
        arg0.setHints(14);
    }
}
