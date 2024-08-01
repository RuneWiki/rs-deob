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

@OriginalClass("mc")
public class class115 extends class48 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mc", name = "p", descriptor = "I")
    public static int field2272 = 0;

    @OriginalMember(owner = "mc", name = "x", descriptor = "I")
    public static int field2280 = 0;

    @OriginalMember(owner = "mc", name = "y", descriptor = "Llf;")
    public static class109 field2281 = class35.method275(" )2> ", 2);

    @OriginalMember(owner = "mc", name = "z", descriptor = "[Llf;")
    public static class109[] field2282 = new class109[500];

    @OriginalMember(owner = "mc", name = "A", descriptor = "I")
    public static int field2283 = 0;

    @OriginalMember(owner = "mc", name = "m", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "mc", name = "n", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "mc", name = "o", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "mc", name = "q", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "mc", name = "r", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "mc", name = "t", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "mc", name = "u", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "mc", name = "v", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "mc", name = "w", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "mc", name = "C", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "mc", name = "D", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "mc", name = "E", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "mc", name = "F", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "mc", name = "G", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "mc", name = "H", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "mc", name = "I", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "mc", name = "J", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "mc", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2284;

    @OriginalMember(owner = "mc", name = "l", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2268;

    @OriginalMember(owner = "mc", name = "s", descriptor = "[I")
    public static int[] field2275;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IIII)I")
    public static final int method845(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 24916) {
            method849((byte) 83, 14);
        }
        ++field2277;
        int var4 = arg3 & arg1 + -1;
        int var5 = arg2 & arg1 + -1;
        int var6 = arg2 / arg1;
        int var7 = arg3 / arg1;
        int var8 = class69.method447(var6, var7, (byte) -118);
        int var9 = class69.method447(var6, var7 + 1, (byte) -108);
        int var10 = class69.method447(var6 + 1, var7, (byte) -42);
        int var11 = class69.method447(var6 + 1, var7 - -1, (byte) -70);
        int var12 = class39.method290(arg1, var9, arg0 + 6330, var8, var4);
        int var13 = class39.method290(arg1, var11, arg0 + 6330, var10, var4);
        return class39.method290(arg1, var13, arg0 ^ 7002, var12, var5);
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(I)V")
    private final synchronized void method846(int arg0) {
        if (arg0 <= 107) {
            this.field2284 = null;
        }
        ++field2278;
        if (this.field2268 != null) {
            this.field2268.setPixels(0, 0, super.field992, super.field987, this.field2284, super.field986, 0, super.field992);
            this.field2268.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IIIZI)V")
    private final synchronized void method847(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field2276;
        if (this.field2268 != null) {
            this.field2268.setPixels(arg4, arg2, arg0, arg1, this.field2284, super.field986, super.field992 * arg2 + arg4, super.field992);
            if (arg3) {
                this.field2268.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "mc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2279;
        return true;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Llf;Llf;ILlf;I)V")
    public static final void method848(class109 arg0, class109 arg1, int arg2, class109 arg3, int arg4) {
        ++field2289;
        for (int var5 = 99; var5 > 0; --var5) {
            class106.field2109[var5] = class106.field2109[var5 + -1];
            class116.field2303[var5] = class116.field2303[var5 + -1];
            class88.field1841[var5] = class88.field1841[var5 + -1];
            class75.field1450[var5] = class75.field1450[var5 + -1];
        }
        class116.field2303[0] = arg0;
        class88.field1841[0] = arg3;
        class106.field2109[0] = arg2;
        class182.field3428 = class75.field1442;
        class75.field1450[0] = arg1;
        ++class5.field78;
        if (arg4 < 76) {
            field2272 = -114;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BI)I")
    public static final int method849(byte arg0, int arg1) {
        class161 var2 = class123.method883(true, arg1);
        int var3 = var2.field3019;
        ++field2273;
        int var4 = var2.field3026;
        int var5 = var2.field3024;
        int var6 = client.field676[-var5 + var4];
        return arg0 < 98 ? 26 : class187.field3564[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "mc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2268 == arg0) {
            this.field2268 = null;
        }
        ++field2292;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method327(int arg0, int arg1, Component arg2, int arg3) {
        ++field2269;
        super.field986 = new int[arg1 * arg3 - -1];
        super.field992 = arg1;
        int var5 = 100 % ((82 - arg0) / 42);
        super.field987 = arg3;
        this.field2284 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field991 = arg2.createImage(this);
        this.method846(124);
        arg2.prepareImage(super.field991, this);
        this.method846(127);
        arg2.prepareImage(super.field991, this);
        this.method846(123);
        arg2.prepareImage(super.field991, this);
        this.method325((byte) 10);
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "(I)V")
    public static void method850(int arg0) {
        if (arg0 < 98) {
            method848((class109) null, (class109) null, 87, (class109) null, 2);
        }
        field2282 = null;
        field2275 = null;
        field2281 = null;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method329(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.method847(arg1, arg0, arg4, true, arg5);
        Shape var7 = arg3.getClip();
        ++field2286;
        arg3.clipRect(arg5, arg4, arg1, arg0);
        arg3.drawImage(super.field991, arg2, 0, this);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "mc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2285;
        this.field2268 = arg0;
        arg0.setDimensions(super.field992, super.field987);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2284);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lvg;I)V")
    public static final void method851(class200 arg0, int arg1) {
        if (~class105.field2067 == ~arg0.field3920) {
            class194.field3721[arg0.field3855] = true;
        }
        if (arg1 != -23101) {
            field2283 = -49;
        }
        ++field2270;
    }

    @OriginalMember(owner = "mc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2290;
        return this.field2268 == arg0;
    }

    @OriginalMember(owner = "mc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2287;
    }

    @OriginalMember(owner = "mc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2288;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method328(int arg0, byte arg1, Graphics arg2, int arg3) {
        ++field2291;
        if (arg1 >= -21) {
            method850(-53);
        }
        this.method846(125);
        arg2.drawImage(super.field991, arg0, arg3, this);
    }
}
