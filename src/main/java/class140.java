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

@OriginalClass("client!faa")
public class class140 extends class335 implements ImageProducer {

    @OriginalMember(owner = "client!faa", name = "L", descriptor = "Lhga;")
    public static class158 field2358 = new class158(45, -2);

    @OriginalMember(owner = "client!faa", name = "R", descriptor = "Lsba;")
    public static class200 field2364 = new class200(16);

    @OriginalMember(owner = "client!faa", name = "A", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!faa", name = "B", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!faa", name = "D", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!faa", name = "E", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!faa", name = "F", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!faa", name = "G", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!faa", name = "I", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!faa", name = "J", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!faa", name = "M", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!faa", name = "N", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!faa", name = "O", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!faa", name = "P", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!faa", name = "Q", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!faa", name = "S", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!faa", name = "C", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2349;

    @OriginalMember(owner = "client!faa", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field2346;

    @OriginalMember(owner = "client!faa", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2354;

    @OriginalMember(owner = "client!faa", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2357;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V", line = 4)
    public static void method1190(byte arg0) {
        if (arg0 > -81) {
            method1195(-9, (byte[]) null, 37, 41, -115, (byte) -36);
        }
        field2364 = null;
        field2358 = null;
    }

    @OriginalMember(owner = "client!faa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 15)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2352;
        return this.field2357 == arg0;
    }

    @OriginalMember(owner = "client!faa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 25)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2355;
        this.field2357 = arg0;
        arg0.setDimensions(super.field5476, super.field5480);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2354);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 39)
    public final void method1191(Graphics arg0, byte arg1, int arg2, int arg3) {
        this.method1193(7682);
        ++field2353;
        int var5 = 72 % ((-4 - arg1) / 52);
        arg0.drawImage(this.field2346, arg3, arg2, this.field2349);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 55)
    public final void method1192(Canvas arg0, int arg1) {
        this.field2349 = arg0;
        ++field2347;
        super.field5476 = this.field2349.getSize().width;
        super.field5480 = this.field2349.getSize().height;
        super.field5477 = new int[super.field5480 * super.field5476];
        this.field2354 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2346 = this.field2349.createImage(this);
        this.method1193(7682);
        this.field2349.prepareImage(this.field2346, this.field2349);
        this.method1193(7682);
        this.field2349.prepareImage(this.field2346, this.field2349);
        if (arg1 == 35) {
            this.method1193(arg1 + 7647);
            this.field2349.prepareImage(this.field2346, this.field2349);
        }
    }

    @OriginalMember(owner = "client!faa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 79)
    public final void startProduction(ImageConsumer arg0) {
        ++field2360;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V", line = 96)
    private final synchronized void method1193(int arg0) {
        if (arg0 != 7682) {
            this.method1193(-122);
        }
        ++field2351;
        if (this.field2357 != null) {
            this.field2357.setPixels(0, 0, super.field5476, super.field5480, this.field2354, super.field5477, 0, super.field5476);
            this.field2357.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIII)V", line = 111)
    private final synchronized void method1194(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 65) {
            this.method1197(-62, -110, 31, (Graphics) null, 20, -69);
        }
        ++field2356;
        if (this.field2357 != null) {
            this.field2357.setPixels(arg0, arg2, arg1, arg3, this.field2354, super.field5477, super.field5476 * arg2 + arg0, super.field5476);
            this.field2357.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I[BIIIB)V", line = 126)
    public static final void method1195(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field2359;
        if (arg3 > arg4) {
            if (arg5 == 52) {
                int var6 = arg2 + arg4;
                int var7 = -arg4 + arg3 >> 2;
                while (true) {
                    --var7;
                    if (~var7 > -1) {
                        int var8 = 3 & -arg4 + arg3;
                        while (true) {
                            --var8;
                            if (~var8 > -1) {
                                return;
                            }
                            arg1[var6++] = 1;
                        }
                    }
                    arg1[var6++] = 1;
                    arg1[var6++] = 1;
                    arg1[var6++] = 1;
                    arg1[var6++] = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILpca;)Lpca;", line = 156)
    public static final class665 method1196(int arg0, class665 arg1) {
        ++field2361;
        if (arg1.field9401 != -1) {
            return class326.method2197(false, arg1.field9401);
        } else {
            int var2 = arg1.field9400 >>> 16;
            class174 var3 = new class174(class486.field7115);
            for (class102 var4 = (class102) var3.method1416((byte) 116); var4 != null; var4 = (class102) var3.method1419((byte) 120)) {
                if (~var4.field1687 == ~var2) {
                    return class326.method2197(false, (int) var4.field844);
                }
            }
            if (arg0 > -33) {
                method1190((byte) 93);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 189)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2362;
        if (this.field2357 == arg0) {
            this.field2357 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 202)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2348;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 209)
    public final void method1197(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        ++field2363;
        this.method1194(arg1, arg4, arg0, arg2, arg5 + 114);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg1, arg0, arg4, arg2);
        arg3.drawImage(this.field2346, 0, arg5, this.field2349);
        arg3.setClip(var7);
    }
}
