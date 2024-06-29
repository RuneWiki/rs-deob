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

@OriginalClass("client!hp")
public class class87 extends class441 implements ImageProducer {

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "Z")
    public static boolean field977 = false;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "[I")
    public static int[] field982 = new int[32];

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "[I")
    public static int[] field981 = new int[6];

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "Luc;")
    public static class58 field970 = new class58(16);

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public static int field989 = 0;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "Ljava/lang/String;")
    public static String field990 = "scroll:";

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "Ljava/awt/Canvas;")
    private Canvas field971;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field980;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field984;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field975;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 4)
    public static final void method471(int arg0) {
        int var1 = -83 / ((arg0 - -70) / 44);
        class114 var2 = class204.field2762;
        synchronized (class204.field2762) {
            class204.field2762.method613(true);
        }
        ++field974;
        class114 var3 = class104.field1286;
        synchronized (class104.field1286) {
            class104.field1286.method613(true);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lor;IIIII)V", line = 21)
    public static final void method472(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4008 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field3999[var6] != null) {
                ++arg0.field4008;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field4008; ++var7) {
            int var8 = class396.field5706[arg1][arg2][arg3];
            while (var8 != 0) {
                class106 var12 = class227.field3090[(var8 & 255) - 1];
                var8 >>>= 8;
                if (arg0.field3999[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class396.field5706[arg1][arg4][arg5];
            while (var9 != 0) {
                class106 var11 = class227.field3090[(var9 & 255) - 1];
                var9 >>>= 8;
                if (arg0.field3999[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field4008 - 1; ++var10) {
                arg0.field3999[var10] = arg0.field3999[var10 + 1];
            }
            --arg0.field4008;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V", line = 76)
    private final synchronized void method473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field968;
        if (this.field975 != null) {
            this.field975.setPixels(arg1, arg4, arg3, arg0, this.field984, super.field6443, super.field6440 * arg4 + arg1, super.field6440);
            this.field975.imageComplete(2);
            if (arg2 != 30231) {
                field977 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V", line = 93)
    public static final void method474(byte arg0, int arg1) {
        ++field979;
        class88.field995.method614(-126, arg1);
        if (arg0 < 125) {
            field970 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 104)
    public final void method475(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        ++field987;
        this.method473(arg0, arg1, 30231, arg3, arg2);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg2, arg3, arg0);
        arg4.drawImage(this.field980, 0, 0, this.field971);
        if (arg5 == -14212) {
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V", line = 123)
    public static final void method476(int arg0) {
        ++field983;
        for (int var1 = 0; class282.field3872.length > var1; ++var1) {
            for (int var2 = 0; var2 < class282.field3872[0].length; ++var2) {
                for (int var3 = 0; class282.field3872[0][0].length > var3; ++var3) {
                    class282.field3872[var1][var2][var3] = 0;
                }
            }
        }
        if (arg0 != -31154) {
            field970 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 158)
    public final void startProduction(ImageConsumer arg0) {
        ++field978;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!hp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 168)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field969;
        if (this.field975 == arg0) {
            this.field975 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V", line = 181)
    public static void method477(int arg0) {
        field982 = null;
        field981 = null;
        field970 = null;
        field990 = null;
        if (arg0 != 0) {
            field981 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 194)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field966;
        return this.field975 == arg0;
    }

    @OriginalMember(owner = "client!hp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 218)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field972;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 227)
    public final void method478(Canvas arg0, int arg1) {
        this.field971 = arg0;
        ++field973;
        super.field6440 = this.field971.getSize().width;
        super.field6438 = this.field971.getSize().height;
        super.field6443 = new int[super.field6440 * super.field6438];
        this.field984 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field980 = this.field971.createImage(this);
        this.method480((byte) 45);
        this.field971.prepareImage(this.field980, this.field971);
        this.method480((byte) 45);
        this.field971.prepareImage(this.field980, this.field971);
        this.method480((byte) 45);
        if (arg1 == 2) {
            this.field971.prepareImage(this.field980, this.field971);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 250)
    public final void method479(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method480((byte) 45);
        ++field986;
        arg1.drawImage(this.field980, arg0, arg3, this.field971);
        if (arg2 != -23932) {
            this.method475(-95, -75, 125, -90, (Graphics) null, 103);
        }
    }

    @OriginalMember(owner = "client!hp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 272)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field976;
        this.field975 = arg0;
        arg0.setDimensions(super.field6440, super.field6438);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field984);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 284)
    private final synchronized void method480(byte arg0) {
        ++field967;
        if (this.field975 != null) {
            this.field975.setPixels(0, 0, super.field6440, super.field6438, this.field984, super.field6443, 0, super.field6440);
            this.field975.imageComplete(2);
            if (arg0 != 45) {
                field970 = null;
            }
        }
    }
}
