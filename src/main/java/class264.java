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

@OriginalClass("client!ma")
public class class264 extends class261 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Loh;")
    public static class258 field4600 = class153.method1046("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 90);

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field4595 = 0;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4593;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4594;

    @OriginalMember(owner = "client!ma", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 4)
    public final void startProduction(ImageConsumer arg0) {
        field4590++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 12)
    public final void method785(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg1 != 128) {
            this.method783(-41, (Graphics) null, (byte) -100, -37, -8, 49);
        }
        field4602++;
        this.method1848(91);
        arg3.drawImage(this.field4535, arg2, arg0, this);
    }

    @OriginalMember(owner = "client!ma", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 26)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field4596++;
    }

    @OriginalMember(owner = "client!ma", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 34)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field4589++;
        if (this.field4594 == arg0) {
            this.field4594 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIBLjava/awt/Component;)V", line = 48)
    public final void method784(int arg0, int arg1, byte arg2, Component arg3) {
        field4601++;
        this.field4536 = arg1;
        this.field4537 = arg0;
        this.field4531 = new int[arg0 * arg1 + 1];
        this.field4593 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4535 = arg3.createImage(this);
        this.method1848(arg2 ^ 0xFFFFFFB6);
        arg3.prepareImage(this.field4535, this);
        this.method1848(69);
        if (arg2 != -59) {
            field4598 = 59;
        }
        arg3.prepareImage(this.field4535, this);
        this.method1848(arg2 - 67);
        arg3.prepareImage(this.field4535, this);
        this.method1836(6932);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIZ)V", line = 71)
    private final synchronized void method1847(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            return;
        }
        field4591++;
        if (this.field4594 != null) {
            this.field4594.setPixels(arg1, arg0, arg3, arg2, this.field4593, this.field4531, this.field4536 * arg0 + arg1, this.field4536);
            this.field4594.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 88)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4586++;
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 96)
    private final synchronized void method1848(int arg0) {
        field4588++;
        if (this.field4594 != null) {
            this.field4594.setPixels(0, 0, this.field4536, this.field4537, this.field4593, this.field4531, 0, this.field4536);
            int var2 = 106 / ((arg0 + 6) / 57);
            this.field4594.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 123)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field4597++;
        return this.field4594 == arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/awt/Graphics;BIII)V", line = 132)
    public final void method783(int arg0, Graphics arg1, byte arg2, int arg3, int arg4, int arg5) {
        this.method1847(arg4, arg0, arg3, arg5, false);
        if (arg2 != 13) {
            field4600 = (class258) null;
        }
        Shape var7 = arg1.getClip();
        field4599++;
        arg1.clipRect(arg0, arg4, arg5, arg3);
        arg1.drawImage(this.field4535, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILpd;)V", line = 152)
    public static final void method1849(int arg0, class254 arg1) {
        field4587++;
        if (arg1.field4366 != null) {
            arg1.field4366.field4675 = 0;
        }
        arg1.field4365 = false;
        if (arg0 != -12030) {
            field4598 = -51;
        }
        for (class254 var2 = arg1.method121(); var2 != null; var2 = arg1.method110()) {
            method1849(-12030, var2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 182)
    public static void method1850(int arg0) {
        field4600 = null;
        if (arg0 != 32) {
            field4598 = -47;
        }
    }

    @OriginalMember(owner = "client!ma", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 192)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field4594 = arg0;
        arg0.setDimensions(this.field4536, this.field4537);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4593);
        arg0.setHints(14);
        field4592++;
    }
}
