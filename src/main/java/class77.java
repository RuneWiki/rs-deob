import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.math.BigInteger;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class77 extends class206 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1078 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1083 = " has logged in.";

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "[Lui;")
    public static class266[] field1090 = new class266[28];

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public static int field1092 = 0;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1079;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1084;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V", line = 4)
    private final synchronized void method616(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 44) {
            field1090 = (class266[]) null;
        }
        field1080++;
        if (this.field1084 != null) {
            this.field1084.setPixels(arg4, arg0, arg1, arg3, this.field1079, this.field3257, this.field3261 * arg0 + arg4, this.field3261);
            this.field1084.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!vm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 20)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1084 == arg0) {
            this.field1084 = null;
        }
        field1091++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BIILjava/awt/Component;)V", line = 31)
    public final void method617(byte arg0, int arg1, int arg2, Component arg3) {
        this.field3257 = new int[arg1 * arg2 + 1];
        this.field3255 = arg2;
        field1085++;
        this.field3261 = arg1;
        this.field1079 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3262 = arg3.createImage(this);
        this.method622(arg0 + 378);
        arg3.prepareImage(this.field3262, this);
        this.method622(255);
        arg3.prepareImage(this.field3262, this);
        this.method622(255);
        arg3.prepareImage(this.field3262, this);
        this.method1474((byte) -105);
        if (arg0 != -123) {
            this.method617((byte) -8, 71, 4, (Component) null);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 54)
    public static final String method618(int arg0, String arg1) {
        field1096++;
        if (arg0 != 1) {
            field1090 = (class266[]) null;
        }
        String var2 = class188.method1358(95, class224.method1597(true, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 73)
    public final void method619(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method616(arg5, arg3, 109, arg0, arg2);
        field1077++;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg5, arg3, arg0);
        arg4.drawImage(this.field3262, 0, arg1, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!vm", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 85)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1088++;
        return true;
    }

    @OriginalMember(owner = "client!vm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 103)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1082++;
        return this.field1084 == arg0;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V", line = 111)
    public static final void method620(int arg0, int arg1) {
        field1094++;
        if (arg1 != 14837) {
            method620(-104, -20);
        }
        class297.field4655.method1429((byte) 127, arg0);
    }

    @OriginalMember(owner = "client!vm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 122)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1087++;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V", line = 129)
    public static void method621(byte arg0) {
        if (arg0 != 75) {
            method624(116, -77, 83);
        }
        field1083 = null;
        field1090 = null;
        field1078 = null;
    }

    @OriginalMember(owner = "client!vm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 142)
    public final void startProduction(ImageConsumer arg0) {
        field1093++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!vm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 161)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1084 = arg0;
        field1095++;
        arg0.setDimensions(this.field3261, this.field3255);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1079);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 183)
    private final synchronized void method622(int arg0) {
        if (arg0 != 255) {
            return;
        }
        field1081++;
        if (this.field1084 != null) {
            this.field1084.setPixels(0, 0, this.field3261, this.field3255, this.field1079, this.field3257, 0, this.field3261);
            this.field1084.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 204)
    public final void method623(int arg0, Graphics arg1, int arg2, int arg3) {
        field1089++;
        if (arg3 > -89) {
            field1092 = -9;
        }
        this.method622(255);
        arg1.drawImage(this.field3262, arg0, arg2, this);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)Lka;", line = 216)
    public static final class189 method624(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class189 var4 = var3.field1478;
            var3.field1478 = null;
            return var4;
        }
    }
}
