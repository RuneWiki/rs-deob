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

@OriginalClass("client!gp")
public class class43 extends class558 implements ImageProducer {

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "Lmf;")
    public static class354 field347 = new class354();

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    public static int field353 = -1;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field340;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field348;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field349;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field352;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "[Lha;")
    public static class52[] field350;

    static {
        new class180("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V", line = 4)
    private final synchronized void method224(int arg0) {
        ++field345;
        if (this.field352 != null) {
            this.field352.setPixels(0, 0, super.field8218, super.field8219, this.field349, super.field8221, 0, super.field8218);
            this.field352.imageComplete(2);
            if (arg0 != 10795) {
                method225(30);
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 22)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field344;
        return this.field352 == arg0;
    }

    @OriginalMember(owner = "client!gp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 35)
    public final void startProduction(ImageConsumer arg0) {
        ++field351;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V", line = 43)
    public static void method225(int arg0) {
        field347 = null;
        field350 = null;
        if (arg0 != 14) {
            method225(104);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILjava/awt/Graphics;B)V", line = 58)
    public final void method226(int arg0, int arg1, Graphics arg2, byte arg3) {
        this.method224(10795);
        ++field338;
        arg2.drawImage(this.field348, arg0, arg1, this.field340);
        if (arg3 <= 106) {
            this.method228(0, 78, -114, -110, -125);
        }
    }

    @OriginalMember(owner = "client!gp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 70)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field339;
        if (this.field352 == arg0) {
            this.field352 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V", line = 80)
    public final void method227(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        this.method228(arg0, -16578, arg1, arg5, arg3);
        if (arg4 != 7) {
            field347 = null;
        }
        ++field342;
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg5, arg3, arg0, arg1);
        arg2.drawImage(this.field348, 0, 0, this.field340);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V", line = 97)
    private final synchronized void method228(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field337;
        if (this.field352 != null) {
            if (arg1 != -16578) {
                this.field340 = null;
            }
            this.field352.setPixels(arg3, arg4, arg0, arg2, this.field349, super.field8221, super.field8218 * arg4 + arg3, super.field8218);
            this.field352.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!gp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 112)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field341;
        this.field352 = arg0;
        arg0.setDimensions(super.field8218, super.field8219);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field349);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!gp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 128)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field346;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZLjava/awt/Canvas;)V", line = 135)
    public final void method229(boolean arg0, Canvas arg1) {
        this.field340 = arg1;
        ++field336;
        super.field8218 = this.field340.getSize().width;
        super.field8219 = this.field340.getSize().height;
        super.field8221 = new int[super.field8219 * super.field8218];
        this.field349 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field348 = this.field340.createImage(this);
        this.method224(10795);
        this.field340.prepareImage(this.field348, this.field340);
        if (!arg0) {
            this.field352 = null;
        }
        this.method224(10795);
        this.field340.prepareImage(this.field348, this.field340);
        this.method224(10795);
        this.field340.prepareImage(this.field348, this.field340);
    }
}
