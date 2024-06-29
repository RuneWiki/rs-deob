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

@OriginalClass("client!df")
public class class261 extends class411 implements ImageProducer {

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Lfn;")
    public static class52 field3628 = new class52(5, -1);

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field3640 = 0;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Ltm;")
    public static class112 field3630 = new class112("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Lfn;")
    public static class52 field3642 = new class52(12, 6);

    @OriginalMember(owner = "client!df", name = "J", descriptor = "Lid;")
    public static class400 field3643 = null;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Ldu;")
    public static class479 field3644 = new class479();

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3632;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field3626;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3641;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3621;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1610(byte arg0) {
        ++field3633;
        class104 var1 = class152.field2155;
        synchronized (class152.field2155) {
            if (arg0 != -35) {
                field3643 = null;
            }
            class152.field2155.method654(false);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 20)
    public final void method1611(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != 100) {
            field3643 = null;
        }
        this.method1617(true);
        ++field3624;
        arg1.drawImage(this.field3626, arg3, arg0, this.field3632);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 32)
    public static final boolean method1612(String arg0, boolean arg1) {
        ++field3635;
        if (arg0 == null) {
            return false;
        } else {
            if (arg1) {
                method1616(-30, 116, false);
            }
            for (int var2 = 0; var2 < class161.field2315; ++var2) {
                if (arg0.equalsIgnoreCase(class353.field4928[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class374.field5296[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 63)
    public static void method1613(byte arg0) {
        field3644 = null;
        field3642 = null;
        field3643 = null;
        if (arg0 > -60) {
            method1612((String) null, false);
        }
        field3630 = null;
        field3628 = null;
    }

    @OriginalMember(owner = "client!df", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 78)
    public final void startProduction(ImageConsumer arg0) {
        ++field3625;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IIII)V", line = 86)
    public static final void method1614(int arg0, int arg1, int arg2, int arg3) {
        ++field3636;
        if (arg1 != 32524) {
            method1610((byte) 120);
        }
        if (~arg0 == -1010) {
            class212.method1332(class202.field2896, arg2, arg3);
        } else if (~arg0 != -1004) {
            if (arg0 == 1006) {
                class212.method1332(class353.field4927, arg2, arg3);
            } else {
                if (arg0 != 1008) {
                    if (arg0 == 1012) {
                        class212.method1332(class239.field3375, arg2, arg3);
                        return;
                    }
                } else {
                    class212.method1332(class123.field1708, arg2, arg3);
                }
            }
        } else {
            class212.method1332(class243.field3440, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILjava/awt/Graphics;III)V", line = 116)
    public final void method1615(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        ++field3627;
        this.method1618(arg4, arg3, arg5, (byte) -54, arg1);
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg5, arg3, arg1, arg4);
        if (arg0 != 512) {
            method1616(-99, -105, true);
        }
        arg2.drawImage(this.field3626, 0, 0, this.field3632);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZ)V", line = 133)
    public static final void method1616(int arg0, int arg1, boolean arg2) {
        ++field3631;
        class454 var3 = new class454(16);
        for (class418 var4 = (class418) class135.field1898.method2615((byte) -18); var4 != null; var4 = (class418) class135.field1898.method2619((byte) -98)) {
            var4.method1182(28818);
            int var5 = (int) (var4.field2608 >> 28);
            int var6 = (int) (var4.field2608 >> 14 & 16383L) - arg0;
            int var7 = (int) (16383L & var4.field2608) - arg1;
            if (var7 >= 0 && var6 >= 0 && ~var7 > ~class200.field2875 && class422.field5811 > var6) {
                var3.method2620((long) (var7 | var5 << 28 | var6 << 14), var4, false);
            }
        }
        class135.field1898 = var3;
        if (arg2) {
            method1612((String) null, true);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 166)
    private final synchronized void method1617(boolean arg0) {
        ++field3639;
        if (!arg0) {
            this.field3626 = null;
        }
        if (this.field3621 != null) {
            this.field3621.setPixels(0, 0, super.field5694, super.field5702, this.field3641, super.field5701, 0, super.field5694);
            this.field3621.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!df", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 187)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3622;
        this.field3621 = arg0;
        arg0.setDimensions(super.field5694, super.field5702);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3641);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!df", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 199)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3637;
        if (this.field3621 == arg0) {
            this.field3621 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIBI)V", line = 210)
    private final synchronized void method1618(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var6 = 36 / ((-14 - arg3) / 38);
        ++field3629;
        if (this.field3621 != null) {
            this.field3621.setPixels(arg2, arg1, arg4, arg0, this.field3641, super.field5701, super.field5694 * arg1 + arg2, super.field5694);
            this.field3621.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!df", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 230)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3634;
    }

    @OriginalMember(owner = "client!df", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 248)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3638;
        return this.field3621 == arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLjava/awt/Canvas;)V", line = 261)
    public final void method1619(boolean arg0, Canvas arg1) {
        ++field3623;
        this.field3632 = arg1;
        super.field5694 = this.field3632.getSize().width;
        super.field5702 = this.field3632.getSize().height;
        if (!arg0) {
            super.field5701 = new int[super.field5702 * super.field5694];
            this.field3641 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field3626 = this.field3632.createImage(this);
            this.method1617(true);
            this.field3632.prepareImage(this.field3626, this.field3632);
            this.method1617(!arg0);
            this.field3632.prepareImage(this.field3626, this.field3632);
            this.method1617(!arg0);
            this.field3632.prepareImage(this.field3626, this.field3632);
        }
    }
}
