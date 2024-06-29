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

@OriginalClass("client!ia")
public class class49 extends class62 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Ljb;")
    public static class56 field1239 = new class56(64);

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Lv;")
    public static class122 field1243 = class55.method425(-69, "@yel@*V");

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Lv;")
    public static class122 field1244 = class55.method425(-120, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field1250 = -1;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field1249 = 0;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    public static int field1252 = 0;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "Lv;")
    public static class122 field1255 = class55.method425(-103, "Lade Schrifts\u001c1tze )2 ");

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "Lv;")
    private static class122 field1256 = class55.method425(-104, "scroll:");

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Lv;")
    public static class122 field1247 = field1256;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1241;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1230;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "[Lvb;")
    public static class124[] field1248;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I", line = 3)
    public static final int method393(int arg0, int arg1, int arg2) {
        ++field1235;
        if (~arg1 == 1) {
            return 12345678;
        } else if (~arg1 == 0) {
            if (~arg0 <= -1) {
                if (~arg0 < -128) {
                    arg0 = 127;
                }
            } else {
                arg0 = 0;
            }
            return -arg0 + 127;
        } else {
            int var4 = (arg1 & 127) * arg0 / 128;
            if (~var4 > -3) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            if (arg2 != 32) {
                method395(110);
            }
            return (65408 & arg1) + var4;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V", line = 42)
    private final synchronized void method394(int arg0) {
        if (arg0 == 126) {
            ++field1240;
            if (this.field1230 != null) {
                this.field1230.setPixels(0, 0, super.field1579, super.field1593, this.field1241, super.field1591, 0, super.field1579);
                this.field1230.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V", line = 60)
    public static void method395(int arg0) {
        field1239 = null;
        field1244 = null;
        field1243 = null;
        field1256 = null;
        field1255 = null;
        if (arg0 != 0) {
            method393(-97, 71, -109);
        }
        field1248 = null;
        field1247 = null;
    }

    @OriginalMember(owner = "client!ia", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 76)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1230 = arg0;
        arg0.setDimensions(super.field1579, super.field1593);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1241);
        arg0.setHints(14);
        ++field1253;
    }

    @OriginalMember(owner = "client!ia", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 89)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1242;
        return this.field1230 == arg0;
    }

    @OriginalMember(owner = "client!ia", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 97)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1236;
        if (this.field1230 == arg0) {
            this.field1230 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 108)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1232;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 117)
    public final void method122(int arg0, Graphics arg1, int arg2, int arg3) {
        int var5 = 68 % ((71 - arg0) / 43);
        ++field1238;
        this.method394(126);
        arg1.drawImage(super.field1580, arg2, arg3, this);
    }

    @OriginalMember(owner = "client!ia", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 133)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1229;
    }

    @OriginalMember(owner = "client!ia", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 145)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1231;
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;IBI)V", line = 172)
    public final void method123(Component arg0, int arg1, byte arg2, int arg3) {
        super.field1591 = new int[arg1 * arg3 - -1];
        super.field1593 = arg3;
        ++field1237;
        super.field1579 = arg1;
        this.field1241 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1580 = arg0.createImage(this);
        this.method394(126);
        arg0.prepareImage(super.field1580, this);
        if (arg2 > 0) {
            this.method394(126);
            arg0.prepareImage(super.field1580, this);
            this.method394(126);
            arg0.prepareImage(super.field1580, this);
            this.method473((byte) -4);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 210)
    public static final void method396(boolean arg0) {
        ++field1234;
        if (!arg0) {
            method395(-106);
        }
        while (true) {
            class34 var1 = class54.field1409;
            class95 var2;
            synchronized (class54.field1409) {
                var2 = (class95) class47.field1211.method304((byte) -90);
            }
            if (var2 == null) {
                return;
            }
            var2.field2440.method820((int) var2.field644, 16711680, var2.field2441, false, var2.field2445);
        }
    }
}
