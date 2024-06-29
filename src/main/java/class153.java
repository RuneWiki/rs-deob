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

@OriginalClass("client!ac")
public class class153 extends class240 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "J")
    public static long field2596 = 0L;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lve;")
    public static class255 field2603 = class87.method607(126, "http:)4)4");

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field2611 = 0;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "J")
    public static long field2605;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2610;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2602;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "[Lwi;")
    public static class251[] field2594;

    @OriginalMember(owner = "client!ac", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 15)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2613++;
    }

    @OriginalMember(owner = "client!ac", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 24)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2602 = arg0;
        field2609++;
        arg0.setDimensions(this.field4002, this.field4006);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2610);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 36)
    public static void method1122(byte arg0) {
        field2603 = null;
        field2594 = null;
        int var1 = 32 % ((arg0 - 41) / 63);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V", line = 51)
    public final void method1123(int arg0, Graphics arg1, byte arg2, int arg3) {
        if (arg2 < 51) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        this.method1130((byte) -93);
        arg1.drawImage(this.field3998, arg3, arg0, this);
        field2615++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 72)
    public final void method1124(Component arg0, int arg1, int arg2, int arg3) {
        this.field4002 = arg3;
        field2606++;
        this.field4003 = new int[arg1 * arg3 + 1];
        this.field4006 = arg1;
        this.field2610 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3998 = arg0.createImage(this);
        this.method1130((byte) -57);
        arg0.prepareImage(this.field3998, this);
        this.method1130((byte) -69);
        arg0.prepareImage(this.field3998, this);
        this.method1130((byte) -48);
        arg0.prepareImage(this.field3998, this);
        this.method1657(arg2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([IB)[I", line = 93)
    public static final int[] method1125(int[] arg0, byte arg1) {
        field2593++;
        if (arg1 <= 68) {
            return (int[]) null;
        } else if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class36.method217(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBIII)V", line = 112)
    private final synchronized void method1126(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2592++;
        if (arg1 == -109 && this.field2602 != null) {
            this.field2602.setPixels(arg3, arg2, arg4, arg0, this.field2610, this.field4003, this.field4002 * arg2 + arg3, this.field4002);
            this.field2602.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V", line = 134)
    public static final void method1127(byte arg0) {
        class150.field2550.method553(-122);
        if (arg0 < 84) {
            field2603 = (class255) null;
        }
        class130.field2144.method553(112);
        class145.field2421.method553(112);
        field2591++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILjava/awt/Graphics;IIB)V", line = 147)
    public final void method1128(int arg0, int arg1, Graphics arg2, int arg3, int arg4, byte arg5) {
        this.method1126(arg4, (byte) -109, arg1, arg3, arg0);
        field2598++;
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg3, arg1, arg0, arg4);
        arg2.drawImage(this.field3998, 0, 0, this);
        arg2.setClip(var7);
        if (arg5 != 62) {
            method1129(-3, 18);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V", line = 164)
    public static final void method1129(int arg0, int arg1) {
        class249 var2 = class118.field1984[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class249 var4 = class118.field1984[var3][arg0][arg1] = class118.field1984[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4202--;
                for (int var5 = 0; var5 < var4.field4188; var5++) {
                    class250 var6 = var4.field4182[var5];
                    if ((var6.field4206 >> 29 & 0x3L) == 2L && var6.field4212 == arg0 && var6.field4216 == arg1) {
                        var6.field4211--;
                    }
                }
            }
        }
        if (class118.field1984[0][arg0][arg1] == null) {
            class118.field1984[0][arg0][arg1] = new class249(0, arg0, arg1);
        }
        class118.field1984[0][arg0][arg1].field4197 = var2;
        class118.field1984[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ac", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 208)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field2600++;
    }

    @OriginalMember(owner = "client!ac", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 220)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2602 == arg0) {
            this.field2602 = null;
        }
        field2612++;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V", line = 244)
    private final synchronized void method1130(byte arg0) {
        field2614++;
        if (this.field2602 != null) {
            this.field2602.setPixels(0, 0, this.field4002, this.field4006, this.field2610, this.field4003, 0, this.field4002);
            if (arg0 <= -40) {
                this.field2602.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 263)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2604++;
        return this.field2602 == arg0;
    }

    @OriginalMember(owner = "client!ac", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 271)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2601++;
        return true;
    }
}
