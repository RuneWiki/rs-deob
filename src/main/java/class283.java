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

@OriginalClass("client!dk")
public class class283 extends class16 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static volatile int field4496 = 0;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "Led;")
    public static class187 field4507 = new class187();

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4499;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4490;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "[[B")
    public static byte[][] field4500;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method114(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method1935(2838);
        arg2.drawImage(super.field180, arg3, arg1, this);
        ++field4492;
        if (arg0 != -2377) {
            field4507 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method117(int arg0, int arg1, int arg2, Component arg3) {
        ++field4498;
        super.field179 = arg2;
        super.field181 = new int[arg0 * arg2 - -1];
        super.field175 = arg0;
        this.field4499 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field180 = arg3.createImage(this);
        this.method1935(2838);
        arg3.prepareImage(super.field180, this);
        if (arg1 != 3) {
            this.method116(118, 79, (Graphics) null, -127, -27, -103);
        }
        this.method1935(arg1 ^ 2837);
        arg3.prepareImage(super.field180, this);
        this.method1935(2838);
        arg3.prepareImage(super.field180, this);
        this.method111((byte) 50);
    }

    @OriginalMember(owner = "client!dk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4501;
        return this.field4490 == arg0;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V")
    public static final void method1931(int arg0) {
        ++field4505;
        if (class186.field2993 != null && ~(class186.field2993.field1979 + 64 + -(64 * class186.field2993.method205(-90)) >> 7) == ~class288.field4580 && class186.field2993.field1910 + -(64 * class186.field2993.method205(77)) - -64 >> 7 == class49.field704) {
            class288.field4580 = 0;
        }
        for (int var1 = 0; ~var1 > -105; ++var1) {
            for (int var6 = 0; var6 < 104; ++var6) {
                class267.field4316[var1][var6] = 0;
            }
        }
        for (int var2 = 0; class121.field1772 > var2; ++var2) {
            class29 var5 = class92.field1374[class207.field3326[var2]];
            if (var5 != null) {
                var5.field1922 = false;
            }
        }
        for (int var3 = 0; ~class21.field235 < ~var3; ++var3) {
            class18 var4 = class169.field2730[class39.field556[var3]];
            if (var4 != null) {
                var4.field1922 = false;
            }
        }
        if (arg0 != -22278) {
            field4500 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4502;
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field4506;
        if (this.field4490 == arg0) {
            this.field4490 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLv;)V")
    public static final void method1932(byte arg0, class152 arg1) {
        while (~arg1.field2511 > ~arg1.field2523.length) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg1.method1111(255) == 1) {
                var2 = true;
                var3 = arg1.method1111(255);
                var4 = arg1.method1111(255);
            }
            int var5 = arg1.method1111(255);
            int var6 = arg1.method1111(255);
            int var7 = var5 * 64 - class227.field3636;
            int var8 = class122.field1786 - var6 * 64 + class52.field753 + -1;
            if (~var7 <= -1 && var8 + -63 >= 0 && ~(var7 + 63) > ~class85.field1245 && var8 < class52.field753) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; ++var11) {
                    for (int var12 = 0; ~var12 > -65; ++var12) {
                        if (!var2 || var3 * 8 <= var11 && ~var11 > ~(var3 * 8 + 8) && ~(var4 * 8) >= ~var12 && ~(var4 * 8 + 8) < ~var12) {
                            byte var13 = arg1.method1092((byte) -62);
                            if (~var13 != -1) {
                                if (class267.field4310[var9][var10] == null) {
                                    class267.field4310[var9][var10] = new byte[4096];
                                }
                                class267.field4310[var9][var10][(-var12 + 63 << 6) + var11] = var13;
                                byte var14 = arg1.method1092((byte) -62);
                                if (class33.field417[var9][var10] == null) {
                                    class33.field417[var9][var10] = new byte[4096];
                                }
                                class33.field417[var9][var10][(-var12 + 63 << 6) + var11] = var14;
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; ~var15 > ~(var2 ? 64 : 4096); ++var15) {
                    byte var16 = arg1.method1092((byte) -62);
                    if (var16 != 0) {
                        ++arg1.field2511;
                    }
                }
            }
        }
        ++field4497;
        if (arg0 >= -114) {
            method1931(17);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1933(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4495;
        if (this.field4490 != null) {
            this.field4490.setPixels(arg1, arg2, arg0, arg3, this.field4499, super.field181, super.field175 * arg2 + arg1, super.field175);
            if (arg4 <= 66) {
                field4507 = null;
            }
            this.field4490.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!dk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4503;
    }

    @OriginalMember(owner = "client!dk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4494;
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)V")
    public static void method1934(int arg0) {
        field4507 = null;
        field4500 = null;
        if (arg0 != 8203) {
            method1934(78);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method116(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.method1933(arg0, arg3, arg5, arg1, 78);
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg3, arg5, arg0, arg1);
        ++field4491;
        arg2.drawImage(super.field180, 0, 0, this);
        int var8 = -72 % ((-69 - arg4) / 54);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    private final synchronized void method1935(int arg0) {
        ++field4504;
        if (arg0 != 2838) {
            this.addConsumer((ImageConsumer) null);
        }
        if (this.field4490 != null) {
            this.field4490.setPixels(0, 0, super.field175, super.field179, this.field4499, super.field181, 0, super.field175);
            this.field4490.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!dk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4493;
        this.field4490 = arg0;
        arg0.setDimensions(super.field175, super.field179);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4499);
        arg0.setHints(14);
    }
}
