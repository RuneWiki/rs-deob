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

@OriginalClass("client!ke")
public class class65 extends class86 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "[Ln;")
    public static class81[] field1576 = new class81[50];

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field1580 = 0;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "Lgd;")
    private static class40 field1582 = class14.method90(false, "Error loading your profile)3");

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field1583 = 0;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "Lgd;")
    public static class40 field1581 = field1582;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Lgd;")
    public static class40 field1579 = class14.method90(false, "Ignorieren");

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "[I")
    public static int[] field1589 = new int[1000];

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "Lgd;")
    public static class40 field1598 = class14.method90(false, "@gre@");

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "Lgd;")
    public static class40 field1595 = class14.method90(false, "Versteckt");

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "Lgd;")
    private static class40 field1602 = class14.method90(false, "red:");

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "Z")
    public static boolean field1601 = false;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "Lgd;")
    public static class40 field1591 = field1602;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "Ltd;")
    public static class118 field1590 = new class118();

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "Lrb;")
    public static class103 field1597;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "Lnd;")
    public static class82 field1588;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "Loc;")
    public static class86 field1574;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1584;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1592;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "[Lmb;")
    public static class73[] field1599;

    @OriginalMember(owner = "client!ke", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 10)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1577;
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 18)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1592 = arg0;
        arg0.setDimensions(super.field1926, super.field1929);
        arg0.setProperties((Hashtable) null);
        ++field1596;
        arg0.setColorModel(this.field1584);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 34)
    public final void method465(int arg0, int arg1, Graphics arg2, int arg3) {
        ++field1594;
        this.method469(true);
        arg2.drawImage(super.field1911, arg3, arg1, this);
        if (arg0 >= -50) {
            field1588 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 54)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1592 == arg0) {
            this.field1592 = null;
        }
        ++field1587;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 94)
    public static void method466(int arg0) {
        field1602 = null;
        field1582 = null;
        if (arg0 == 16) {
            field1579 = null;
            field1589 = null;
            field1588 = null;
            field1598 = null;
            field1591 = null;
            field1597 = null;
            field1590 = null;
            field1576 = null;
            field1574 = null;
            field1599 = null;
            field1581 = null;
            field1595 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V", line = 119)
    public static final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1593;
        int var6 = (arg4 + -32) * arg4 / arg3;
        class8.field220[0].method497(arg5, arg0);
        if (arg2 != 16) {
            method467(65, 77, -16, -49, 38, -128);
        }
        class8.field220[1].method497(arg5, arg0 - -arg4 - 16);
        class27.method164(arg5, arg0 + 16, 16, arg4 - 32, class8.field221);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (-var6 + arg4 + -32) * arg1 / (-arg4 + arg3);
        class27.method164(arg5, arg0 + 16 + var7, 16, var6, class11.field297);
        class27.method172(arg5, var7 + 16 + arg0, var6, class60.field1511);
        class27.method172(arg5 + 1, arg0 + 16 + var7, var6, class60.field1511);
        class27.method171(arg5, arg0 + var7 + 16, 16, class60.field1511);
        class27.method171(arg5, arg0 + 17 + var7, 16, class60.field1511);
        class27.method172(arg5 + 15, arg0 - -16 + var7, var6, class133.field3249);
        class27.method172(arg5 - -14, var7 + 17 + arg0, var6 + -1, class133.field3249);
        class27.method171(arg5, arg0 + var7 - -15 + var6, 16, class133.field3249);
        class27.method171(arg5 - -1, arg0 + var6 + var7 + 14, 15, class133.field3249);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILjava/awt/Component;B)V", line = 151)
    public final void method468(int arg0, int arg1, Component arg2, byte arg3) {
        super.field1926 = arg0;
        super.field1929 = arg1;
        super.field1925 = new int[arg0 * arg1 - -1];
        ++field1606;
        this.field1584 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg3 < -103) {
            super.field1911 = arg2.createImage(this);
            this.method469(true);
            arg2.prepareImage(super.field1911, this);
            this.method469(true);
            arg2.prepareImage(super.field1911, this);
            this.method469(true);
            arg2.prepareImage(super.field1911, this);
            this.method561((byte) -74);
        }
    }

    @OriginalMember(owner = "client!ke", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 174)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1604;
    }

    @OriginalMember(owner = "client!ke", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 192)
    public final void startProduction(ImageConsumer arg0) {
        ++field1585;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 202)
    private final synchronized void method469(boolean arg0) {
        ++field1605;
        if (this.field1592 != null) {
            if (arg0) {
                this.field1592.setPixels(0, 0, super.field1926, super.field1929, this.field1584, super.field1925, 0, super.field1926);
                this.field1592.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 246)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1603;
        return this.field1592 == arg0;
    }
}
