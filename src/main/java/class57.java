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

@OriginalClass("client!pj")
public class class57 extends class159 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "[I")
    public static int[] field1033 = new int[2];

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "Lke;")
    public static class256 field1048 = class316.method2202("Continuer", 27626);

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "Lke;")
    public static class256 field1046 = class316.method2202("Hierhin drehen", 27626);

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Lke;")
    private static class256 field1047 = class316.method2202("Connecting to update server", 27626);

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "Lke;")
    public static class256 field1043 = field1047;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "Lij;")
    public static class175 field1038 = new class175();

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "Lke;")
    public static class256 field1050 = class316.method2202("cross", 27626);

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    public static int field1052 = 0;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field1053 = 1;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1044;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1029;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "[Lj;")
    public static class227[] field1037;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "[Lke;")
    public static class256[] field1036;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V", line = 6)
    public static void method445(int arg0) {
        field1050 = null;
        field1047 = null;
        field1036 = null;
        field1033 = null;
        field1046 = null;
        field1043 = null;
        field1038 = null;
        if (arg0 <= 34) {
            method445(45);
        }
        field1048 = null;
        field1037 = null;
    }

    @OriginalMember(owner = "client!pj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 34)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1035++;
    }

    @OriginalMember(owner = "client!pj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 41)
    public final void startProduction(ImageConsumer arg0) {
        field1028++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 50)
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method451((byte) -109, arg2, arg4, arg3, arg0);
        field1031++;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg2, arg0, arg4);
        arg5.drawImage(this.field2837, 0, 0, this);
        arg5.setClip(var7);
        if (arg1 > -87) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!pj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 72)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field1049++;
        this.field1029 = arg0;
        arg0.setDimensions(this.field2839, this.field2834);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1044);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V", line = 84)
    public static final void method447(int arg0) {
        class30.field444++;
        if (arg0 >= 87) {
            field1041++;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Z", line = 95)
    public static final boolean method448(int arg0, int arg1) {
        if (arg0 != -1506623691) {
            method445(82);
        }
        field1030++;
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIII)V", line = 106)
    public static final void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class256.field4428 = arg2;
        if (arg5 != -1459) {
            return;
        }
        class74.field1353 = arg1;
        class98.field1752 = arg3;
        class191.field3496 = arg4;
        field1027++;
        class284.field4934 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILjava/awt/Component;I)V", line = 121)
    public final void method450(byte arg0, int arg1, Component arg2, int arg3) {
        field1040++;
        this.field2833 = new int[arg1 * arg3 + 1];
        this.field2834 = arg3;
        this.field2839 = arg1;
        this.field1044 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2837 = arg2.createImage(this);
        this.method453(arg0 ^ 0xFFFFFF88);
        arg2.prepareImage(this.field2837, this);
        this.method453(118);
        arg2.prepareImage(this.field2837, this);
        this.method453(64);
        arg2.prepareImage(this.field2837, this);
        if (arg0 != -91) {
            this.field1029 = (ImageConsumer) null;
        }
        this.method1182(48);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BIIII)V", line = 143)
    private final synchronized void method451(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1045++;
        if (this.field1029 == null) {
            return;
        }
        if (arg0 >= -94) {
            method449(-119, -57, -99, 89, 0, 125);
        }
        this.field1029.setPixels(arg3, arg1, arg4, arg2, this.field1044, this.field2833, this.field2839 * arg1 + arg3, this.field2839);
        this.field1029.imageComplete(2);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 160)
    public final void method452(int arg0, byte arg1, int arg2, Graphics arg3) {
        field1042++;
        if (arg1 != -16) {
            this.startProduction((ImageConsumer) null);
        }
        this.method453(-75);
        arg3.drawImage(this.field2837, arg0, arg2, this);
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V", line = 181)
    private final synchronized void method453(int arg0) {
        field1034++;
        if (this.field1029 != null) {
            int var2 = 71 / ((-arg0 - 21) / 51);
            this.field1029.setPixels(0, 0, this.field2839, this.field2834, this.field1044, this.field2833, 0, this.field2839);
            this.field1029.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 200)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1026++;
        return this.field1029 == arg0;
    }

    @OriginalMember(owner = "client!pj", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 218)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1039++;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 229)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field1025++;
        if (this.field1029 == arg0) {
            this.field1029 = null;
        }
    }
}
