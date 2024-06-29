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

@OriginalClass("client!rd")
public class class122 extends class70 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Ltd;")
    public static class136 field2819 = class145.method1172("Hidden)2use", 45);

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field2824 = (int) (17.0D * Math.random()) - 8;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Ltd;")
    public static class136 field2827 = class145.method1172("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 45);

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "Lue;")
    public static class143 field2832 = new class143(30);

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "Ltd;")
    private static class136 field2838 = class145.method1172("Jul", 45);

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "Ltd;")
    private static class136 field2842 = class145.method1172("Apr", 45);

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "[Lje;")
    public static class67[] field2846 = new class67[32768];

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "Ltd;")
    private static class136 field2850 = class145.method1172("Mar", 45);

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field2839 = -1;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "Ltd;")
    private static class136 field2848 = class145.method1172("Jun", 45);

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field2853 = -1;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "Ltd;")
    private static class136 field2852 = class145.method1172("Unexpected loginserver response)3", 45);

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "Ltd;")
    private static class136 field2854 = class145.method1172("Jan", 45);

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "Ltd;")
    public static class136 field2847 = field2852;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Ltd;")
    public static class136 field2841 = class145.method1172("(Udns", 45);

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "Ltd;")
    private static class136 field2856 = class145.method1172("Feb", 45);

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "Ltd;")
    private static class136 field2845 = class145.method1172("Dec", 45);

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "Ltd;")
    public static class136 field2857 = class145.method1172("Registrierter Benutzer", 45);

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "Ltd;")
    private static class136 field2837 = class145.method1172("Nov", 45);

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "Ltd;")
    private static class136 field2859 = class145.method1172("May", 45);

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "Ltd;")
    private static class136 field2849 = class145.method1172("Aug", 45);

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "Ltd;")
    private static class136 field2855 = class145.method1172("Sep", 45);

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "Ltd;")
    private static class136 field2858 = class145.method1172("Oct", 45);

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "[Ltd;")
    public static class136[] field2840 = new class136[] { field2854, field2856, field2850, field2842, field2859, field2848, field2838, field2849, field2855, field2858, field2837, field2845 };

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Lpd;")
    public static class108 field2844;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "Lpd;")
    public static class108 field2851;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2828;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2834;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "[I")
    public static int[] field2843;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method952(int arg0) {
        field2842 = null;
        field2855 = null;
        field2841 = null;
        field2856 = null;
        field2840 = null;
        field2847 = null;
        field2859 = null;
        field2838 = null;
        field2848 = null;
        field2851 = null;
        field2858 = null;
        field2837 = null;
        field2850 = null;
        field2846 = null;
        field2852 = null;
        field2854 = null;
        field2827 = null;
        field2832 = null;
        field2845 = null;
        field2819 = null;
        if (arg0 != 0) {
            method955(-52, -67);
        }
        field2843 = null;
        field2857 = null;
        field2849 = null;
        field2844 = null;
    }

    @OriginalMember(owner = "client!rd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2823;
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBII)V")
    private final synchronized void method953(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 44) {
            this.method522((Component) null, 83, -13, (byte) 82);
        }
        ++field2835;
        if (this.field2834 != null) {
            this.field2834.setPixels(arg1, arg4, arg0, arg3, this.field2828, super.field1473, super.field1470 * arg4 + arg1, super.field1470);
            this.field2834.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2834 == arg0) {
            this.field2834 = null;
        }
        ++field2829;
    }

    @OriginalMember(owner = "client!rd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2834 = arg0;
        ++field2836;
        arg0.setDimensions(super.field1470, super.field1479);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2828);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!rd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2831;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method522(Component arg0, int arg1, int arg2, byte arg3) {
        int var5 = -51 % ((arg3 - 40) / 40);
        super.field1470 = arg2;
        ++field2821;
        super.field1473 = new int[arg1 * arg2 - -1];
        super.field1479 = arg1;
        this.field2828 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1469 = arg0.createImage(this);
        this.method954(4693);
        arg0.prepareImage(super.field1469, this);
        this.method954(4693);
        arg0.prepareImage(super.field1469, this);
        this.method954(4693);
        arg0.prepareImage(super.field1469, this);
        this.method524(0);
    }

    @OriginalMember(owner = "client!rd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2825;
        return this.field2834 == arg0;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    private final synchronized void method954(int arg0) {
        ++field2826;
        if (this.field2834 != null) {
            this.field2834.setPixels(0, 0, super.field1470, super.field1479, this.field2828, super.field1473, 0, super.field1470);
            this.field2834.imageComplete(2);
            if (arg0 != 4693) {
                this.method953(-10, -8, (byte) -23, 104, -3);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2830;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BIIILjava/awt/Graphics;I)V")
    public final void method523(byte arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method953(arg5, arg2, (byte) 44, arg1, arg3);
        int var7 = -99 % ((-75 - arg0) / 32);
        ++field2833;
        Shape var8 = arg4.getClip();
        arg4.clipRect(arg2, arg3, arg5, arg1);
        arg4.drawImage(super.field1469, 0, 0, this);
        arg4.setClip(var8);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
    public static final int method955(int arg0, int arg1) {
        ++field2820;
        if (arg0 != 129516) {
            field2840 = null;
        }
        return (129516 & arg1) >> 11;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method521(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field2822;
        if (arg2 != 0) {
            field2842 = null;
        }
        this.method954(4693);
        arg3.drawImage(super.field1469, arg1, arg0, this);
    }
}
