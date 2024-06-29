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

@OriginalClass("client!h")
public class class42 extends class85 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Llc;")
    public static class69 field824 = class69.method470((byte) -119, "white:");

    @OriginalMember(owner = "client!h", name = "G", descriptor = "[Z")
    public static boolean[] field839 = new boolean[5];

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Llc;")
    public static class69 field823 = class69.method470((byte) -115, "backright1");

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
    public static int[] field834 = new int[1000];

    @OriginalMember(owner = "client!h", name = "C", descriptor = "Llc;")
    public static class69 field835 = class69.method470((byte) -128, "Too many connections from your address)3");

    @OriginalMember(owner = "client!h", name = "E", descriptor = "Llc;")
    public static class69 field837 = class69.method470((byte) -118, "::clientdrop");

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Lcc;")
    public static class16 field840;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field833;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field830;

    @OriginalMember(owner = "client!h", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field844;
        if (this.field830 == arg0) {
            this.field830 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field843;
    }

    @OriginalMember(owner = "client!h", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field830 = arg0;
        arg0.setDimensions(super.field1895, super.field1905);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field833);
        arg0.setHints(14);
        ++field842;
    }

    @OriginalMember(owner = "client!h", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field827;
        return this.field830 == arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Lda;")
    public static final class20 method247(boolean arg0) {
        ++field826;
        class20 var1 = new class20();
        var1.field434 = class19.field426;
        var1.field436 = class71.field1595;
        var1.field438 = class114.field2472[0];
        var1.field435 = class90.field1952[0];
        var1.field437 = class63.field1336[0];
        var1.field433 = class108.field2343[0];
        int var2 = var1.field437 * var1.field433;
        byte[] var3 = class91.field1994[0];
        var1.field439 = new int[var2];
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var1.field439[var4] = class80.field1829[class23.method151(255, var3[var4])];
        }
        class4.method21(-126);
        return !arg0 ? null : var1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public final void method69(Graphics arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.addConsumer((ImageConsumer) null);
        }
        ++field828;
        this.method248((byte) 100);
        arg0.drawImage(super.field1903, arg3, arg1, this);
    }

    @OriginalMember(owner = "client!h", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field822;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!h", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field838;
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    private final synchronized void method248(byte arg0) {
        ++field836;
        if (this.field830 != null) {
            this.field830.setPixels(0, 0, super.field1895, super.field1905, this.field833, super.field1907, 0, super.field1895);
            this.field830.imageComplete(2);
            if (arg0 != 100) {
                this.addConsumer((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method68(int arg0, int arg1, int arg2, Component arg3) {
        super.field1895 = arg1;
        super.field1905 = arg2;
        ++field831;
        super.field1907 = new int[arg1 * arg2 + 1];
        this.field833 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1903 = arg3.createImage(this);
        this.method248((byte) 100);
        if (arg0 != -13942) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        arg3.prepareImage(super.field1903, this);
        this.method248((byte) 100);
        arg3.prepareImage(super.field1903, this);
        this.method248((byte) 100);
        arg3.prepareImage(super.field1903, this);
        this.method606(-2);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lpd;II)Llc;")
    public static final class69 method249(class94 arg0, int arg1, int arg2) {
        ++field829;
        try {
            int var3 = 32 % ((19 - arg2) / 38);
            class69 var4 = new class69();
            var4.field1523 = arg0.method684(false);
            if (var4.field1523 > arg1) {
                var4.field1523 = arg1;
            }
            var4.field1488 = new byte[var4.field1523];
            arg0.field2061 += class64.field1354.method622(arg0.field2077, 0, var4.field1523, arg0.field2061, var4.field1488, 1);
            return var4;
        } catch (Exception var5) {
            return class103.field2237;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    public static void method250(byte arg0) {
        field837 = null;
        field840 = null;
        if (arg0 >= -10) {
            method249((class94) null, 101, 22);
        }
        field823 = null;
        field834 = null;
        field824 = null;
        field835 = null;
        field839 = null;
    }
}
