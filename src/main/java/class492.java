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

@OriginalClass("client!em")
public class class492 extends class78 implements ImageProducer {

    @OriginalMember(owner = "client!em", name = "G", descriptor = "Lpi;")
    public static class340 field7178 = new class340(21, 7);

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7192;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field7177;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field7179;

    @OriginalMember(owner = "client!em", name = "O", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field7186;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "[Lf;")
    public static class404[] field7189;

    @OriginalMember(owner = "client!em", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field7181;
        return this.field7186 == arg0;
    }

    @OriginalMember(owner = "client!em", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field7186 = arg0;
        ++field7180;
        arg0.setDimensions(super.field992, super.field991);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field7179);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method448(int arg0, byte arg1, Graphics arg2, int arg3) {
        this.method2943(true);
        if (arg1 != 39) {
            this.field7192 = null;
        }
        ++field7184;
        arg2.drawImage(this.field7177, arg0, arg3, this.field7192);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method454(int arg0, Canvas arg1) {
        this.field7192 = arg1;
        ++field7191;
        super.field992 = this.field7192.getSize().width;
        super.field991 = this.field7192.getSize().height;
        super.field996 = new int[super.field992 * super.field991];
        this.field7179 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field7177 = this.field7192.createImage(this);
        this.method2943(true);
        this.field7192.prepareImage(this.field7177, this.field7192);
        this.method2943(true);
        this.field7192.prepareImage(this.field7177, this.field7192);
        this.method2943(true);
        if (arg0 != 2) {
            this.field7186 = null;
        }
        this.field7192.prepareImage(this.field7177, this.field7192);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lsc;III)V")
    public static final void method2941(class265 arg0, int arg1, int arg2, int arg3) {
        long var4 = class83.field1033[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field3363 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field3359[arg0.field3363++] = class121.field1683[var8 - 1].field1155;
            var6 += 16L;
        }
        for (int var9 = arg0.field3363; var9 < 4; ++var9) {
            arg0.field3359[var9] = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field7187;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)V")
    public static void method2942(int arg0) {
        if (arg0 != 48) {
            field7189 = null;
        }
        field7178 = null;
        field7189 = null;
    }

    @OriginalMember(owner = "client!em", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field7182;
        if (this.field7186 == arg0) {
            this.field7186 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
    private final synchronized void method2943(boolean arg0) {
        ++field7183;
        if (this.field7186 != null) {
            if (arg0) {
                this.field7186.setPixels(0, 0, super.field992, super.field991, this.field7179, super.field996, 0, super.field992);
                this.field7186.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method453(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7188;
        this.method2944(arg2, arg1, arg3, -115, arg4);
        int var7 = 117 / ((47 - arg5) / 52);
        Shape var8 = arg0.getClip();
        arg0.clipRect(arg1, arg3, arg4, arg2);
        arg0.drawImage(this.field7177, 0, 0, this.field7192);
        arg0.setClip(var8);
    }

    @OriginalMember(owner = "client!em", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field7185;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method2944(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7190;
        if (this.field7186 != null) {
            this.field7186.setPixels(arg1, arg2, arg4, arg0, this.field7179, super.field996, super.field992 * arg2 + arg1, super.field992);
            int var6 = -32 / ((-79 - arg3) / 36);
            this.field7186.imageComplete(2);
        }
    }
}
