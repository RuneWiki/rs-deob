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

@OriginalClass("client!sg")
public class class38 extends class274 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Lfj;")
    public static class243 field523;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field537;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field527;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 8)
    public static void method255(int arg0) {
        if (arg0 != 0) {
            field523 = (class243) null;
        }
        field523 = null;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V", line = 18)
    public static final void method256(int arg0) {
        class256.field4471.method1427(39, 0);
        class256.field4471.method1735((byte) -44, 0L);
        int var1 = -73 % ((3 - arg0) / 57);
        field526++;
        class154.field2778++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 33)
    public final void method257(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 1) {
            method259(40, (byte) -53, -43);
        }
        this.method260(arg4, arg5, arg3, arg1, 2047);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg4, arg1, arg5);
        arg0.drawImage(this.field4816, 0, 0, this);
        field525++;
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLqj;)V", line = 52)
    public static final void method258(boolean arg0, class256 arg1) {
        field529++;
        if (arg1.field4510 == 0) {
            return;
        }
        if (arg1.field4522 != -1 && arg1.field4522 < 32768) {
            class45 var2 = class159.field2863[arg1.field4522];
            if (var2 != null) {
                int var3 = arg1.field4452 - var2.field4452;
                int var4 = arg1.field4457 - var2.field4457;
                if (var3 != 0 || var4 != 0) {
                    arg1.field4486 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field4522 >= 32768) {
            int var5 = arg1.field4522 - 32768;
            if (class185.field3409 == var5) {
                var5 = 2047;
            }
            class51 var6 = class96.field1558[var5];
            if (var6 != null) {
                int var7 = arg1.field4457 - var6.field4457;
                int var8 = arg1.field4452 - var6.field4452;
                if (var8 != 0 || var7 != 0) {
                    arg1.field4486 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0) {
            field523 = (class243) null;
        }
        if ((arg1.field4448 != 0 || arg1.field4508 != 0) && (arg1.field4487 == 0 || arg1.field4515 > 0)) {
            int var9 = arg1.field4452 + ((arg1.method363((byte) -59) - 1) * 64 - (arg1.field4448 - class305.field5295 - class305.field5295) * 64);
            int var10 = arg1.field4457 - ((-class137.field2421 + arg1.field4508 + -class137.field2421) * 64 + 64 - (arg1.method363((byte) -126) * 64));
            if (var9 != 0 || var10 != 0) {
                arg1.field4486 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field4508 = 0;
            arg1.field4448 = 0;
        }
        int var11 = arg1.field4486 - arg1.field4518 & 0x7FF;
        if (var11 == 0) {
            arg1.field4502 = 0;
            return;
        }
        arg1.field4502++;
        if (var11 > 1024) {
            boolean var12 = true;
            arg1.field4518 -= arg1.field4510;
            if (arg1.field4510 > var11 || 2048 - arg1.field4510 < var11) {
                arg1.field4518 = arg1.field4486;
                var12 = false;
            }
            if (arg1.field4472 == arg1.field4455 && (arg1.field4502 > 25 || var12)) {
                if (arg1.field4496 == -1) {
                    arg1.field4472 = arg1.field4449;
                } else {
                    arg1.field4472 = arg1.field4496;
                }
            }
        } else {
            arg1.field4518 += arg1.field4510;
            boolean var13 = true;
            if (var11 < arg1.field4510 || (2048 - arg1.field4510) < var11) {
                arg1.field4518 = arg1.field4486;
                var13 = false;
            }
            if (arg1.field4472 == arg1.field4455 && (arg1.field4502 > 25 || var13)) {
                if (arg1.field4465 == -1) {
                    arg1.field4472 = arg1.field4449;
                } else {
                    arg1.field4472 = arg1.field4465;
                }
            }
        }
        arg1.field4518 &= 0x7FF;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI)V", line = 187)
    public static final void method259(int arg0, byte arg1, int arg2) {
        class271.field4734[arg2] = arg0;
        field536++;
        class83 var3 = (class83) class155.field2792.method1676((long) arg2, (byte) -82);
        int var4 = 46 / ((62 - arg1) / 33);
        if (var3 == null) {
            class83 var5 = new class83(4611686018427387905L);
            class155.field2792.method1681(1, var5, (long) arg2);
        } else if (var3.field1292 != 4611686018427387905L) {
            var3.field1292 = class118.method835(-1272) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIIII)V", line = 212)
    private final synchronized void method260(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field531++;
        if (this.field527 == null) {
            return;
        }
        if (arg4 != 2047) {
            this.field527 = (ImageConsumer) null;
        }
        this.field527.setPixels(arg2, arg0, arg3, arg1, this.field537, this.field4811, this.field4819 * arg0 + arg2, this.field4819);
        this.field527.imageComplete(2);
    }

    @OriginalMember(owner = "client!sg", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 232)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field524++;
    }

    @OriginalMember(owner = "client!sg", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 239)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field527 = arg0;
        field530++;
        arg0.setDimensions(this.field4819, this.field4810);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field537);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)V", line = 251)
    private final synchronized void method261(byte arg0) {
        field521++;
        if (this.field527 != null) {
            this.field527.setPixels(0, 0, this.field4819, this.field4810, this.field537, this.field4811, 0, this.field4819);
            if (arg0 == -24) {
                this.field527.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 270)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field532++;
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 284)
    public final void method262(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method261((byte) -24);
        arg1.drawImage(this.field4816, arg3, arg0, this);
        if (arg2 != -8278) {
            method258(true, (class256) null);
        }
        field534++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIILjava/awt/Component;)V", line = 296)
    public final void method263(byte arg0, int arg1, int arg2, Component arg3) {
        this.field4819 = arg2;
        this.field4811 = new int[arg1 * arg2 + 1];
        this.field4810 = arg1;
        field528++;
        this.field537 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4816 = arg3.createImage(this);
        this.method261((byte) -24);
        arg3.prepareImage(this.field4816, this);
        this.method261((byte) -24);
        arg3.prepareImage(this.field4816, this);
        this.method261((byte) -24);
        arg3.prepareImage(this.field4816, this);
        this.method1978((byte) -105);
        int var5 = 55 % ((arg0 - 63) / 57);
    }

    @OriginalMember(owner = "client!sg", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 320)
    public final void startProduction(ImageConsumer arg0) {
        field533++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!sg", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 329)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field535++;
        if (this.field527 == arg0) {
            this.field527 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 344)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field522++;
        return this.field527 == arg0;
    }
}
