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

@OriginalClass("client!nd")
public class class285 extends class152 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field4620 = 0;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4623 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "Lvd;")
    public static class4 field4627;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4617;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4609;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public static final void method1932(int arg0, int arg1) {
        class170.field2793.method1880(arg0 ^ -32500, arg1);
        ++field4614;
        if (arg0 != 32441) {
            field4620 = -46;
        }
    }

    @OriginalMember(owner = "client!nd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4628;
        return this.field4609 == arg0;
    }

    @OriginalMember(owner = "client!nd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4624;
    }

    @OriginalMember(owner = "client!nd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4618;
        this.field4609 = arg0;
        arg0.setDimensions(super.field2427, super.field2437);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4617);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!nd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4611;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method975(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4625;
        this.method1933(arg3, 1, arg0, arg4, arg2);
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg4, arg2, arg0, arg3);
        arg1.drawImage(super.field2430, 0, 0, this);
        arg1.setClip(var7);
        if (arg5 >= -101) {
            field4623 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1933(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4612;
        if (this.field4609 != null) {
            if (arg1 != 1) {
                method1936(-20);
            }
            this.field4609.setPixels(arg3, arg4, arg2, arg0, this.field4617, super.field2436, super.field2427 * arg4 + arg3, super.field2427);
            this.field4609.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public final void method974(int arg0, Component arg1, int arg2, byte arg3) {
        super.field2437 = arg0;
        super.field2427 = arg2;
        super.field2436 = new int[arg0 * arg2 + 1];
        ++field4626;
        this.field4617 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2430 = arg1.createImage(this);
        this.method1934(26838);
        arg1.prepareImage(super.field2430, this);
        this.method1934(26838);
        if (arg3 == 115) {
            arg1.prepareImage(super.field2430, this);
            this.method1934(26838);
            arg1.prepareImage(super.field2430, this);
            this.method1034((byte) 77);
        }
    }

    @OriginalMember(owner = "client!nd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field4609 == arg0) {
            this.field4609 = null;
        }
        ++field4619;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    private final synchronized void method1934(int arg0) {
        ++field4615;
        if (this.field4609 != null) {
            this.field4609.setPixels(0, 0, super.field2427, super.field2437, this.field4617, super.field2436, 0, super.field2427);
            this.field4609.imageComplete(2);
            if (arg0 != 26838) {
                this.field4609 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public final void method973(int arg0, Graphics arg1, int arg2, boolean arg3) {
        ++field4621;
        this.method1934(26838);
        if (!arg3) {
            arg1.drawImage(super.field2430, arg2, arg0, this);
        }
    }

    @OriginalMember(owner = "client!nd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4613;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public static final void method1935(int arg0) {
        class311.field5027.method2081(false, 248);
        ++field4610;
        ++class95.field1511;
        class109 var1 = (class109) class74.field1192.method379(-21146);
        if (arg0 != 0) {
            method1936(-112);
        }
        while (var1 != null) {
            if (var1.field1693 == 0) {
                class8.method78(-9, true, var1);
            }
            var1 = (class109) class74.field1192.method369(true);
        }
        if (class221.field3485 != null) {
            class111.method776(class221.field3485, (byte) 25);
            class221.field3485 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public static void method1936(int arg0) {
        field4627 = null;
        if (arg0 == 0) {
            field4623 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 1) {
            field4620 = -68;
        }
        ++field4616;
        int var6 = class268.method1789(class191.field3112, arg3 + 72, arg1, class52.field766);
        int var7 = class268.method1789(class191.field3112, 44, arg0, class52.field766);
        int var8 = class268.method1789(class148.field2371, arg3 ^ 43, arg5, class34.field561);
        int var9 = class268.method1789(class148.field2371, -118, arg2, class34.field561);
        for (int var10 = var6; var10 <= var7; ++var10) {
            class309.method2096(arg4, var9, (byte) -117, class232.field3629[var10], var8);
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public static final void method1938(int arg0) {
        if (class122.field1939 != null) {
            class122.field1939.method114((byte) -116);
        }
        ++field4622;
        if (class80.field1296 != null) {
            class80.field1296.method114((byte) -118);
        }
        class217.method1484(class127.field2032, 2, 91, arg0);
        class122.field1939 = class33.method248(arg0 ^ -22051, 0, 22050, class122.field1926, class44.field659);
        class122.field1939.method117(class286.field4634, arg0 ^ 22136);
        class80.field1296 = class33.method248(-1, 1, 2048, class122.field1926, class44.field659);
        class80.field1296.method117(class89.field1397, 81);
    }
}
