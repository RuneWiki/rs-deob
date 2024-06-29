import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class124 extends class67 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "[Lra;")
    public static class154[] field2434 = new class154[32768];

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lb;")
    public static class11 field2441 = new class11(30);

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field2442 = 1;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "Lsd;")
    private static class166 field2443 = class135.method935("Connecting to update server", 0);

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "Lsd;")
    public static class166 field2444 = class135.method935("und die Schaltfl-=che (WSpielkonto erstellen(W am", 0);

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "Lsd;")
    public static class166 field2445 = field2443;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2428;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2435;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    private final synchronized void method886(int arg0) {
        ++field2431;
        if (this.field2435 != null) {
            if (arg0 > -4) {
                this.method891(-78, -105, -55, 110, -75);
            }
            this.field2435.setPixels(0, 0, super.field1354, super.field1361, this.field2428, super.field1369, 0, super.field1354);
            this.field2435.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public final void method545(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        this.method891(arg2, arg0, arg4, arg1, 12840);
        ++field2446;
        if (arg5 <= 90) {
            method887(78);
        }
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg1, arg4, arg2);
        arg3.drawImage(super.field1357, 0, 0, this);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
    public static void method887(int arg0) {
        field2443 = null;
        if (arg0 >= -75) {
            field2442 = 50;
        }
        field2445 = null;
        field2444 = null;
        field2441 = null;
        field2434 = null;
    }

    @OriginalMember(owner = "client!ng", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2435 == arg0) {
            this.field2435 = null;
        }
        ++field2433;
    }

    @OriginalMember(owner = "client!ng", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2429;
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)Z")
    public static final boolean method888(byte arg0, int arg1) {
        int var2 = 117 / ((57 - arg0) / 46);
        ++field2439;
        if (arg1 >= 97 && ~arg1 >= -123) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method548(int arg0, int arg1, int arg2, Component arg3) {
        super.field1361 = arg2;
        super.field1369 = new int[arg1 * arg2 + 1];
        ++field2426;
        super.field1354 = arg1;
        this.field2428 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1357 = arg3.createImage(this);
        this.method886(-44);
        arg3.prepareImage(super.field1357, this);
        this.method886(-85);
        arg3.prepareImage(super.field1357, this);
        this.method886(-19);
        arg3.prepareImage(super.field1357, this);
        this.method544(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ng", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2430;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lff;Z)V")
    public static final void method889(class53 arg0, boolean arg1) {
        ++field2437;
        byte[] var2 = new byte[24];
        if (class110.field2137 != null) {
            try {
                class110.field2137.method1259((byte) -60, 0L);
                class110.field2137.method1262(var2, (byte) 58);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method391(0, 0, var2, 24);
        if (!arg1) {
            field2444 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZII)I")
    public static final int method890(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field2427;
        if (!arg2) {
            return -112;
        } else {
            int var5 = -class40.field719[arg3 * 1024 / arg4] + 65536 >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!ng", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2447;
        return this.field2435 == arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method547(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method886(-37);
        ++field2432;
        arg3.drawImage(super.field1357, arg2, arg0, this);
        if (arg1 < 61) {
            this.field2435 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2438;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method891(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2440;
        if (this.field2435 != null) {
            if (arg4 == 12840) {
                this.field2435.setPixels(arg1, arg3, arg2, arg0, this.field2428, super.field1369, super.field1354 * arg3 + arg1, super.field1354);
                this.field2435.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2436;
        this.field2435 = arg0;
        arg0.setDimensions(super.field1354, super.field1361);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2428);
        arg0.setHints(14);
    }
}
