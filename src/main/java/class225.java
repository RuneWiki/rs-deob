import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class225 extends class174 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3363 = "scroll:";

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3367 = "Please wait...";

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field3371 = 0;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field3364 = 0;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public static int field3379 = -1;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3366;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3376;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field3359;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field3374;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILpf;B)Z")
    public static final boolean method1431(int arg0, class294 arg1, byte arg2) {
        ++field3368;
        byte[] var3 = arg1.method1942(arg0, 27157);
        if (var3 == null) {
            return false;
        } else {
            class6.method29(var3, 114);
            if (arg2 <= 11) {
                method1437(-52);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3375;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!hi", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3356;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
    public static final void method1432(byte arg0) {
        ++field3365;
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class7.field105[var1] = true;
        }
        int var2 = -65 / ((arg0 - 42) / 48);
    }

    @OriginalMember(owner = "client!hi", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3357;
        if (this.field3376 == arg0) {
            this.field3376 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
    public static final void method1433(int arg0) {
        ++field3358;
        class153.field2236.method1775(27147);
        int var1 = 43 / ((arg0 - -37) / 62);
    }

    @OriginalMember(owner = "client!hi", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3362;
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3360;
        return this.field3376 == arg0;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V")
    private final synchronized void method1434(byte arg0) {
        ++field3381;
        if (this.field3376 != null) {
            this.field3376.setPixels(0, 0, super.field2656, super.field2650, this.field3366, super.field2647, 0, super.field2656);
            this.field3376.imageComplete(2);
            if (arg0 < 89) {
                method1436(-119);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B[Ljava/lang/String;[S)V")
    public static final void method1435(byte arg0, String[] arg1, short[] arg2) {
        if (arg0 >= 124) {
            class71.method480(arg1, (byte) -94, 0, arg1.length + -1, arg2);
            ++field3369;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method1072(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method1438(arg2, arg3, arg4, -128, arg0);
        ++field3377;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg4, arg3, arg2, arg0);
        arg5.drawImage(super.field2654, 0, 0, this);
        if (arg1 <= 72) {
            this.method1072(56, -101, 94, -51, 86, (Graphics) null);
        }
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!hi", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3376 = arg0;
        ++field3370;
        arg0.setDimensions(super.field2656, super.field2650);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3366);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V")
    public static final void method1436(int arg0) {
        ++field3380;
        if (arg0 < 113) {
            method1437(122);
        }
        Container var1;
        if (class244.field3657 != null) {
            var1 = class244.field3657;
        } else if (class210.field3152 == null) {
            var1 = class209.field3147.field150;
        } else {
            var1 = class210.field3152;
        }
        class107.field1676 = var1.getSize().width;
        class26.field321 = var1.getSize().height;
        if (class210.field3152 == var1) {
            Insets var2 = class210.field3152.getInsets();
            class26.field321 -= var2.top + var2.bottom;
            class107.field1676 -= var2.right + var2.left;
        }
        if (class13.method75(0) >= 2) {
            class180.field2748 = class26.field321;
            class272.field4090 = 0;
            class214.field3191 = 0;
            class77.field1245 = class107.field1676;
        } else {
            class180.field2748 = 503;
            class77.field1245 = 765;
            class272.field4090 = (class107.field1676 - 765) / 2;
            class214.field3191 = 0;
        }
        class47.field762.setSize(class77.field1245, class180.field2748);
        if (class210.field3152 == var1) {
            Insets var3 = class210.field3152.getInsets();
            class47.field762.setLocation(class272.field4090 + var3.left, var3.top - -class214.field3191);
        } else {
            class47.field762.setLocation(class272.field4090, class214.field3191);
        }
        if (~class136.field1987 != 0) {
            class282.method1859((byte) -92, true);
        }
        class53.method362((byte) 36);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public final void method1078(int arg0, byte arg1, int arg2, Component arg3) {
        super.field2650 = arg2;
        if (arg1 <= -122) {
            ++field3373;
            super.field2647 = new int[arg0 * arg2 + 1];
            super.field2656 = arg0;
            this.field3366 = new DirectColorModel(32, 16711680, 65280, 255);
            super.field2654 = arg3.createImage(this);
            this.method1434((byte) 112);
            arg3.prepareImage(super.field2654, this);
            this.method1434((byte) 92);
            arg3.prepareImage(super.field2654, this);
            this.method1434((byte) 122);
            arg3.prepareImage(super.field2654, this);
            this.method1077(36);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method1074(int arg0, int arg1, Graphics arg2, byte arg3) {
        ++field3378;
        if (arg3 >= -48) {
            this.method1434((byte) 25);
        }
        this.method1434((byte) 94);
        arg2.drawImage(super.field2654, arg1, arg0, this);
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field3374 = null;
        field3363 = null;
        if (arg0 <= -92) {
            field3359 = null;
            field3367 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1438(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3372;
        if (arg3 >= -126) {
            this.field3376 = null;
        }
        if (this.field3376 != null) {
            this.field3376.setPixels(arg2, arg1, arg0, arg4, this.field3366, super.field2647, super.field2656 * arg1 + arg2, super.field2656);
            this.field3376.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public static final void method1439(int arg0, int arg1, int arg2) {
        ++field3361;
        if (arg2 <= 64) {
            method1433(-114);
        }
        int var3 = class284.field4248 * arg0 >> 8;
        if (arg1 == -1 && !class254.field3869) {
            class239.method1517(119);
        } else if (~arg1 != 0 && (class150.field2168 != arg1 || !class293.method1941(-30235)) && var3 != 0 && !class254.field3869) {
            client.method961(arg1, class143.field2090, false, (byte) -101, 2, 0, var3);
        }
        class150.field2168 = arg1;
    }
}
