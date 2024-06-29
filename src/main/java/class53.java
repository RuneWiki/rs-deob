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

@OriginalClass("client!hd")
public class class53 extends class87 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "Loa;")
    public static class98 field1177 = class38.method349(255, "backhmid1");

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Llb;")
    public static class78 field1166 = new class78();

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Ln;")
    public static class90 field1182 = new class90(64);

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "Loa;")
    public static class98 field1183 = class38.method349(255, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "Lja;")
    public static class63 field1184 = new class63();

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field1185 = 0;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Loa;")
    public static class98 field1186 = class38.method349(255, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1171;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1172;

    @OriginalMember(owner = "client!hd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1174;
    }

    @OriginalMember(owner = "client!hd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1178;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method407(Component arg0, int arg1, int arg2, int arg3) {
        ++field1179;
        super.field2001 = arg2;
        super.field1994 = new int[arg2 * arg3 + 1];
        super.field1988 = arg3;
        this.field1171 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1998 = arg0.createImage(this);
        this.method436(14);
        arg0.prepareImage(super.field1998, this);
        this.method436(14);
        arg0.prepareImage(super.field1998, this);
        this.method436(14);
        arg0.prepareImage(super.field1998, this);
        this.method714(5);
        if (arg1 < 51) {
            this.field1172 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method434(boolean arg0) {
        ++field1168;
        if (class80.field1780 >= 2 || class119.field2669 != 0 || class113.field2555) {
            class98 var1;
            if (~class119.field2669 == -2 && class80.field1780 < 2) {
                var1 = class102.method840(new class98[] { class71.field1448, class64.field1376, class102.field2354, client.field506 }, 10);
            } else if (class113.field2555 && class80.field1780 < 2) {
                var1 = class102.method840(new class98[] { class91.field2111, class64.field1376, class149.field3674, client.field506 }, 10);
            } else {
                var1 = class32.field781[class80.field1780 - 1];
            }
            if (class80.field1780 > 2) {
                var1 = class102.method840(new class98[] { var1, class147.field3597, class132.method1074(class80.field1780 + -2, (byte) -85), class88.field2010 }, 10);
            }
            class71.field1480.method399(var1, 4, 15, 16777215, arg0, class119.field2680 / 1000);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method406(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 != 32) {
            this.addConsumer((ImageConsumer) null);
        }
        this.method436(arg0 + -18);
        ++field1169;
        arg3.drawImage(super.field1998, arg2, arg1, this);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Lob;")
    public static final class99 method435(int arg0, int arg1) {
        ++field1175;
        class99 var2 = (class99) class6.field110.method730((byte) 35, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class58.field1297.method1058(arg0, -98, arg1);
            class99 var4 = new class99();
            if (var3 != null) {
                var4.method823(new class8(var3), -60);
            }
            class6.field110.method732(-1, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1170;
        this.field1172 = arg0;
        arg0.setDimensions(super.field2001, super.field1988);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1171);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1167;
        if (this.field1172 == arg0) {
            this.field1172 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    private final synchronized void method436(int arg0) {
        ++field1176;
        if (this.field1172 != null) {
            this.field1172.setPixels(0, 0, super.field2001, super.field1988, this.field1171, super.field1994, 0, super.field2001);
            this.field1172.imageComplete(2);
            if (arg0 != 14) {
                this.requestTopDownLeftRightResend((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1173;
        return this.field1172 == arg0;
    }

    @OriginalMember(owner = "client!hd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1181;
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static void method437(int arg0) {
        field1177 = null;
        field1186 = null;
        int var1 = -98 % ((arg0 - -70) / 54);
        field1184 = null;
        field1183 = null;
        field1166 = null;
        field1182 = null;
    }
}
