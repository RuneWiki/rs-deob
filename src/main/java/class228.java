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

@OriginalClass("client!va")
public class class228 extends class169 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Z")
    public static boolean field3597 = false;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "F")
    public static float field3578;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lnm;")
    public static class221 field3579;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Llm;")
    public static class230 field3583;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3595;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3582;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3581;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Z")
    public static boolean field3587;

    @OriginalMember(owner = "client!va", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 4)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field3590++;
        return this.field3582 == arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 13)
    public final void method1165(int arg0, int arg1, int arg2, Component arg3) {
        this.field2644 = arg0;
        this.field2643 = new int[arg0 * arg2 + 1];
        field3577++;
        this.field2646 = arg2;
        this.field3595 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2642 = arg3.createImage(this);
        this.method1551(125);
        arg3.prepareImage(this.field2642, this);
        if (arg1 != 4) {
            this.imageUpdate((Image) null, -34, 98, 102, 118, 80);
        }
        this.method1551(112);
        arg3.prepareImage(this.field2642, this);
        this.method1551(111);
        arg3.prepareImage(this.field2642, this);
        this.method1169(0);
    }

    @OriginalMember(owner = "client!va", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 36)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3598++;
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V", line = 47)
    private final synchronized void method1548(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3576++;
        if (this.field3582 != null && arg4 == -14581) {
            this.field3582.setPixels(arg3, arg2, arg0, arg1, this.field3595, this.field2643, this.field2644 * arg2 + arg3, this.field2644);
            this.field3582.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 63)
    public final void method1167(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method1548(arg2, arg5, arg0, arg1, -14581);
        field3591++;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg0, arg2, arg5);
        arg4.drawImage(this.field2642, 0, arg3, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILnm;Lnm;)V", line = 75)
    public static final void method1549(int arg0, class221 arg1, class221 arg2) {
        if (arg0 != 10225) {
            field3587 = false;
        }
        class306.field4999 = arg2;
        class269.field4434 = arg1;
        field3575++;
        class306.field4999.method1486(36, arg0 ^ 0xFFFFB45B);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 91)
    public static final void method1550(int arg0) {
        class100.field1452.method644((byte) -79);
        if (arg0 != 18152) {
            field3584 = -33;
        }
        field3596++;
    }

    @OriginalMember(owner = "client!va", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 105)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3582 == arg0) {
            this.field3582 = null;
        }
        field3585++;
    }

    @OriginalMember(owner = "client!va", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 117)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field3589++;
        this.field3582 = arg0;
        arg0.setDimensions(this.field2644, this.field2646);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3595);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V", line = 131)
    private final synchronized void method1551(int arg0) {
        int var2 = -70 % ((38 - arg0) / 51);
        field3592++;
        if (this.field3582 != null) {
            this.field3582.setPixels(0, 0, this.field2644, this.field2646, this.field3595, this.field2643, 0, this.field2644);
            this.field3582.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!va", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 148)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field3593++;
    }

    @OriginalMember(owner = "client!va", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 158)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field3594++;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)Lbb;", line = 167)
    public static final class148 method1552(boolean arg0) {
        field3586++;
        if (!arg0) {
            method1553(40);
        }
        if (class88.field1258 == null) {
            return null;
        }
        for (class148 var1 = (class148) class47.field686.method2010(126); var1 != null; var1 = (class148) class47.field686.method2010(127)) {
            class312 var2 = class165.method1150(var1.field2378, (byte) 94);
            if (var2 != null && var2.field5088 && var2.method2179(11902)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V", line = 201)
    public final void method1166(boolean arg0, int arg1, int arg2, Graphics arg3) {
        field3588++;
        this.method1551(-90);
        if (arg0) {
            field3579 = (class221) null;
        }
        arg3.drawImage(this.field2642, arg1, arg2, this);
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 213)
    public static final void method1553(int arg0) {
        if (arg0 != 36) {
            field3583 = (class230) null;
        }
        class153.field2480.method651(0);
        field3574++;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V", line = 225)
    public static final void method1554(int arg0) {
        if (arg0 >= -44) {
            field3578 = 1.1058884F;
        }
        if (class300.field4960 != null) {
            class199 var1 = class300.field4960;
            synchronized (class300.field4960) {
                class300.field4960 = null;
            }
        }
        field3580++;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V", line = 243)
    public static void method1555(int arg0) {
        field3581 = null;
        field3583 = null;
        field3579 = null;
        if (arg0 != 5316) {
            method1553(-117);
        }
    }
}
