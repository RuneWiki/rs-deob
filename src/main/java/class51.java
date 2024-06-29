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

@OriginalClass("client!bq")
public class class51 extends class367 implements ImageProducer {

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "[B")
    public static byte[] field653;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field659;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field652;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field642;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field651;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field657;

    static {
        new class368("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field653 = new byte[520];
        field649 = -1;
        field659 = new String[8];
    }

    @OriginalMember(owner = "client!bq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 4)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field650;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIB)V", line = 12)
    private final synchronized void method412(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field654;
        if (arg4 != 3) {
            this.field652 = null;
        }
        if (this.field657 != null) {
            this.field657.setPixels(arg1, arg3, arg0, arg2, this.field651, super.field5087, super.field5092 * arg3 + arg1, super.field5092);
            this.field657.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIILjava/awt/Graphics;B)V", line = 29)
    public final void method413(int arg0, int arg1, int arg2, int arg3, Graphics arg4, byte arg5) {
        this.method412(arg0, arg3, arg2, arg1, (byte) 3);
        ++field643;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg1, arg0, arg2);
        arg4.drawImage(this.field642, 0, 0, this.field652);
        arg4.setClip(var7);
        if (arg5 <= 20) {
            this.removeConsumer((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 45)
    public final void method414(int arg0, int arg1, Graphics arg2, int arg3) {
        ++field644;
        this.method415((byte) 102);
        if (arg3 != 100) {
            this.field657 = null;
        }
        arg2.drawImage(this.field642, arg1, arg0, this.field652);
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V", line = 58)
    private final synchronized void method415(byte arg0) {
        ++field648;
        if (this.field657 != null) {
            int var2 = -100 % ((arg0 - -39) / 37);
            this.field657.setPixels(0, 0, super.field5092, super.field5088, this.field651, super.field5087, 0, super.field5092);
            this.field657.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 73)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field656;
        this.field657 = arg0;
        arg0.setDimensions(super.field5092, super.field5088);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field651);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 85)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field646;
        if (this.field657 == arg0) {
            this.field657 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 99)
    public final void startProduction(ImageConsumer arg0) {
        ++field647;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLjava/awt/Canvas;)V", line = 116)
    public final void method416(byte arg0, Canvas arg1) {
        this.field652 = arg1;
        ++field658;
        super.field5092 = this.field652.getSize().width;
        super.field5088 = this.field652.getSize().height;
        super.field5087 = new int[super.field5092 * super.field5088];
        this.field651 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field642 = this.field652.createImage(this);
        if (arg0 == -12) {
            this.method415((byte) 116);
            this.field652.prepareImage(this.field642, this.field652);
            this.method415((byte) 22);
            this.field652.prepareImage(this.field642, this.field652);
            this.method415((byte) 88);
            this.field652.prepareImage(this.field642, this.field652);
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V", line = 138)
    public static void method417(byte arg0) {
        field659 = null;
        if (arg0 == -74) {
            field653 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 149)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field655;
        return this.field657 == arg0;
    }
}
