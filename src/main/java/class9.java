import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class9 extends class102 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "[Ltc;")
    public static class129[] field217 = new class129[4];

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Z")
    public static boolean field226 = false;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "[J")
    public static long[] field229 = new long[100];

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field219 = 2301979;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field230 = 0;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "[I")
    public static int[] field232 = new int[32768];

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "Loc;")
    public static class99 field240 = class48.method402((byte) -104, " )2> @cya@");

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Loe;")
    public static class102 field236;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "Lpc;")
    public static class105 field235;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field224;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field220;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[[[B")
    public static byte[][][] field227;

    @OriginalMember(owner = "client!bb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field220 == arg0) {
            this.field220 = null;
        }
        ++field234;
    }

    @OriginalMember(owner = "client!bb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field222;
    }

    @OriginalMember(owner = "client!bb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field237;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method107(int arg0, int arg1, Component arg2, int arg3) {
        ++field238;
        super.field2478 = new int[arg1 * arg3 + 1];
        super.field2491 = arg1;
        super.field2486 = arg3;
        this.field224 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2479 = arg2.createImage(this);
        this.method111((byte) 93);
        arg2.prepareImage(super.field2479, this);
        this.method111((byte) 79);
        arg2.prepareImage(super.field2479, this);
        this.method111((byte) 118);
        arg2.prepareImage(super.field2479, this);
        if (arg0 != 0) {
            this.field220 = null;
        }
        this.method874((byte) 30);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method108(int arg0) {
        ++field225;
        ++class81.field2012;
        class49.method406(true, 60);
        class4.method27(true, 67);
        if (arg0 == -2910) {
            class49.method406(false, 92);
            class4.method27(false, arg0 + 3016);
            class63.method555(2923);
            class105.method886((byte) 82);
            if (!class122.field2982) {
                int var1 = class67.field1717;
                int var2 = 2047 & class94.field2296 + class140.field3478;
                if (class48.field1175 / 256 > var1) {
                    var1 = class48.field1175 / 256;
                }
                if (class81.field2024[4] && ~var1 > ~(class7.field210[4] + 128)) {
                    var1 = class7.field210[4] + 128;
                }
                client.method205(-12664, var2, class133.field3253, class88.field2184, var1 * 3 + 600, var1, -50 + class137.method1144(true, class69.field1770.field3115, class69.field1770.field3077, class84.field2116));
            }
            int var3;
            if (class122.field2982) {
                var3 = class60.method537((byte) -92);
            } else {
                var3 = class43.method370(-17546);
            }
            int var4 = class145.field3611;
            int var5 = class94.field2290;
            int var6 = class12.field266;
            int var7 = class32.field754;
            int var8 = class94.field2288;
            for (int var9 = 0; ~var9 > -6; ++var9) {
                if (class81.field2024[var9]) {
                    int var10 = (int) ((double) (-class48.field1173[var9]) + (double) (class48.field1173[var9] * 2 + 1) * Math.random() + Math.sin((double) class49.field1192[var9] / 100.0D * (double) class47.field1148[var9]) * (double) class7.field210[var9]);
                    if (~var9 == -3) {
                        class94.field2290 += var10;
                    }
                    if (~var9 == -2) {
                        class12.field266 += var10;
                    }
                    if (~var9 == -1) {
                        class145.field3611 += var10;
                    }
                    if (~var9 == -4) {
                        class94.field2288 = 2047 & class94.field2288 + var10;
                    }
                    if (~var9 == -5) {
                        class32.field754 += var10;
                        if (~class32.field754 > -129) {
                            class32.field754 = 128;
                        }
                        if (~class32.field754 < -384) {
                            class32.field754 = 383;
                        }
                    }
                }
            }
            class5.method28(arg0 + 3015);
            class26.field649 = class80.field1969 + -4;
            class26.field638 = true;
            class26.field627 = 0;
            class26.field639 = class148.field3656 - 4;
            class111.method949(18645);
            class96.method787();
            class111.method949(18645);
            class68.field1757.method45(class145.field3611, class12.field266, class94.field2290, class32.field754, class94.field2288, var3);
            class111.method949(18645);
            class68.field1757.method59();
            class31.method271(50);
            class60.method533(116);
            ((class79) class40.field989).method690((byte) 67, class143.field3566);
            class58.method525((byte) 38);
            if (class143.field3587 && ~class49.method413(false, true, arg0 + 2917) == -1) {
                class143.field3587 = false;
            }
            if (class143.field3587) {
                class5.method28(22);
                class96.method787();
                class53.method437(class61.field1638, false, (byte) 87, (class99) null);
            }
            class111.method949(18645);
            class89.method747(arg0 ^ -2910);
            class32.field754 = var7;
            class12.field266 = var6;
            class94.field2290 = var5;
            class145.field3611 = var4;
            class94.field2288 = var8;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method109(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field218;
        if (arg2 != 0) {
            field232 = null;
        }
        this.method111((byte) 78);
        arg3.drawImage(super.field2479, arg0, arg1, this);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILjc;I)V")
    public static final void method110(int arg0, int arg1, class64 arg2, int arg3) {
        ++field223;
        int var4 = arg1 * arg1 + arg3 * arg3;
        int var5 = -91 / ((arg0 - -28) / 56);
        if (var4 > 4225 && ~var4 > -90001) {
            int var6 = 2047 & class140.field3478 - -class32.field777;
            int var7 = class40.field982[var6];
            int var8 = var7 * 256 / (class23.field556 + 256);
            int var9 = class40.field981[var6];
            int var10 = var9 * 256 / (class23.field556 + 256);
            int var11 = arg3 * var10 + -(arg1 * var8) >> 16;
            int var12 = arg1 * var10 + arg3 * var8 >> 16;
            double var13 = Math.atan2((double) var12, (double) var11);
            int var15 = (int) (63.0D * Math.sin(var13));
            int var16 = (int) (57.0D * Math.cos(var13));
            class2.field26.method571(var15 + 94 + -6, -var16 + -20 + 83, 20, 20, 15, 15, var13, 256);
        } else {
            class126.method1035((byte) 78, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!bb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field231;
        return true;
    }

    @OriginalMember(owner = "client!bb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field239;
        return this.field220 == arg0;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    private final synchronized void method111(byte arg0) {
        ++field228;
        if (this.field220 != null) {
            this.field220.setPixels(0, 0, super.field2486, super.field2491, this.field224, super.field2478, 0, super.field2486);
            this.field220.imageComplete(2);
            if (arg0 <= 74) {
                method110(40, -112, (class64) null, 89);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static void method112(boolean arg0) {
        field232 = null;
        field227 = null;
        field240 = null;
        field229 = null;
        field235 = null;
        if (arg0) {
            field230 = 25;
        }
        field236 = null;
        field217 = null;
    }

    @OriginalMember(owner = "client!bb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field221;
        this.field220 = arg0;
        arg0.setDimensions(super.field2486, super.field2491);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field224);
        arg0.setHints(14);
    }
}
