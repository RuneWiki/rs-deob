import java.awt.Component;
import java.awt.Frame;
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

@OriginalClass("client!mf")
public class class10 extends class76 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "[[I")
    public static int[][] field79 = new int[5][5000];

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field88 = 3;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "Lab;")
    public static class142 field87;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "Ljava/awt/Frame;")
    public static Frame field85;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field78;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field82;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    private final synchronized void method45(byte arg0) {
        if (arg0 != -90) {
            this.method45((byte) -53);
        }
        ++field91;
        if (this.field82 != null) {
            this.field82.setPixels(0, 0, super.field1477, super.field1489, this.field78, super.field1487, 0, super.field1477);
            this.field82.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field83;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method46(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field81;
        this.method48(arg4, 14, arg5, arg1, arg2);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg5, arg4, arg2);
        arg0.drawImage(super.field1486, 0, 0, this);
        arg0.setClip(var7);
        if (arg3 != 1) {
            this.field78 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public static void method47(byte arg0) {
        int var1 = -72 / ((arg0 - -2) / 49);
        field79 = null;
        field85 = null;
        field87 = null;
    }

    @OriginalMember(owner = "client!mf", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field86;
        return true;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method48(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field80;
        if (arg1 == 14) {
            if (this.field82 != null) {
                this.field82.setPixels(arg3, arg2, arg0, arg4, this.field78, super.field1487, super.field1477 * arg2 - -arg3, super.field1477);
                this.field82.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field82 = arg0;
        ++field76;
        arg0.setDimensions(super.field1477, super.field1489);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field78);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!mf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field89;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method49(int arg0, int arg1, int arg2, Component arg3) {
        ++field90;
        super.field1489 = arg0;
        super.field1487 = new int[arg0 * arg2 + 1];
        super.field1477 = arg2;
        this.field78 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1486 = arg3.createImage(this);
        this.method45((byte) -90);
        if (arg1 == 26480) {
            arg3.prepareImage(super.field1486, this);
            this.method45((byte) -90);
            arg3.prepareImage(super.field1486, this);
            this.method45((byte) -90);
            arg3.prepareImage(super.field1486, this);
            this.method550(-125);
        }
    }

    @OriginalMember(owner = "client!mf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field84;
        return this.field82 == arg0;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public static final void method50(int arg0) {
        ++field77;
        int var1 = class180.method1310(-14234);
        if (arg0 >= -62) {
            field73 = 69;
        }
        if (var1 == 0) {
            class202.field3655 = null;
            class166.method1232(0, 1048575);
        } else if (var1 == 1) {
            class112.method829((byte) 0, -75);
            class166.method1232(512, 1048575);
            class53.method310(0);
        } else {
            class112.method829((byte) (class62.field1182 + -4 & 255), -89);
            class166.method1232(2, 1048575);
        }
    }

    @OriginalMember(owner = "client!mf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field82 == arg0) {
            this.field82 = null;
        }
        ++field74;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method51(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 == -3) {
            ++field75;
            this.method45((byte) -90);
            arg3.drawImage(super.field1486, arg0, arg1, this);
        }
    }
}
