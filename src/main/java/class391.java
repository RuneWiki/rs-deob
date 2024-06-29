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

@OriginalClass("client!fi")
public class class391 extends class228 implements ImageProducer {

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field5253 = new String[100];

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "Lkg;")
    public static class179 field5261;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5256;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field5251;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5258;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5259;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method1387(Canvas arg0, int arg1) {
        this.field5256 = arg0;
        ++field5252;
        super.field2917 = this.field5256.getSize().width;
        super.field2918 = this.field5256.getSize().height;
        super.field2920 = new int[super.field2918 * super.field2917];
        this.field5258 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5251 = this.field5256.createImage(this);
        if (arg1 != 0) {
            this.isConsumer((ImageConsumer) null);
        }
        this.method2220(false);
        this.field5256.prepareImage(this.field5251, this.field5256);
        this.method2220(false);
        this.field5256.prepareImage(this.field5251, this.field5256);
        this.method2220(false);
        this.field5256.prepareImage(this.field5251, this.field5256);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method2218(byte arg0) {
        field5253 = null;
        if (arg0 != 71) {
            field5262 = -29;
        }
        field5261 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lpc;BLga;ILjava/awt/Canvas;)Lya;")
    public static final class38 method2219(class476 arg0, byte arg1, class278 arg2, int arg3, Canvas arg4) {
        ++field5254;
        return arg1 != 64 ? null : new class164(arg3, arg4, arg2, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5249;
        return this.field5259 == arg0;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)V")
    private final synchronized void method2220(boolean arg0) {
        ++field5247;
        if (this.field5259 != null) {
            this.field5259.setPixels(0, 0, super.field2917, super.field2918, this.field5258, super.field2920, 0, super.field2917);
            this.field5259.imageComplete(2);
            if (arg0) {
                this.field5258 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method2221(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5248;
        if (this.field5259 != null) {
            this.field5259.setPixels(arg2, arg0, arg1, arg4, this.field5258, super.field2920, super.field2917 * arg0 + arg2, super.field2917);
            this.field5259.imageComplete(2);
            if (arg3 < 55) {
                field5262 = -8;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method1389(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        ++field5246;
        this.method2221(arg2, arg4, arg0, 81, arg5);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg2, arg4, arg5);
        if (arg1 != 255) {
            field5262 = -126;
        }
        arg3.drawImage(this.field5251, 0, 0, this.field5256);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!fi", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field5259 == arg0) {
            this.field5259 = null;
        }
        ++field5245;
    }

    @OriginalMember(owner = "client!fi", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field5259 = arg0;
        ++field5260;
        arg0.setDimensions(super.field2917, super.field2918);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5258);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method1385(int arg0, Graphics arg1, int arg2, int arg3) {
        ++field5257;
        this.method2220(false);
        arg1.drawImage(this.field5251, arg3, arg2, this.field5256);
        if (arg0 != 28525) {
            this.field5251 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5250;
    }

    @OriginalMember(owner = "client!fi", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field5255;
    }

    static {
        new class335("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field5261 = new class179(79, 7);
    }
}
