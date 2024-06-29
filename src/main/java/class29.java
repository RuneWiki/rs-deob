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

@OriginalClass("client!be")
public class class29 extends class257 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Ljava/lang/String;")
    public static String field454 = "Unable to find ";

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "[Z")
    public static boolean[] field467 = new boolean[200];

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[[S")
    public static short[][] field450 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field465;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field457;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method231(int arg0) {
        if (arg0 == 4707) {
            field454 = null;
            field467 = null;
            field450 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method232(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 != 27378) {
            method231(-34);
        }
        this.method236((byte) 126);
        ++field455;
        arg3.drawImage(super.field3942, arg2, arg1, this);
    }

    @OriginalMember(owner = "client!be", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field469;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBZI)Ljava/lang/String;")
    public static final String method233(int arg0, byte arg1, boolean arg2, int arg3) {
        ++field468;
        if (~arg0 <= -3 && ~arg0 >= -37) {
            if (arg2 && arg3 >= 0) {
                int var4 = 2;
                for (int var5 = arg3 / arg0; ~var5 != -1; var5 /= arg0) {
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                if (arg1 < 18) {
                    method233(36, (byte) 7, true, 56);
                }
                for (int var7 = var4 - 1; ~var7 < -1; --var7) {
                    int var8 = arg3;
                    arg3 /= arg0;
                    int var9 = -(arg0 * arg3) + var8;
                    if (var9 < 10) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg3, arg0);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!be", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field461;
        return this.field457 == arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public final void method234(byte arg0, int arg1, Component arg2, int arg3) {
        ++field456;
        super.field3940 = new int[arg1 * arg3 + 1];
        super.field3938 = arg3;
        int var5 = -79 / ((-42 - arg0) / 34);
        super.field3941 = arg1;
        this.field465 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3942 = arg2.createImage(this);
        this.method236((byte) 91);
        arg2.prepareImage(super.field3942, this);
        this.method236((byte) 115);
        arg2.prepareImage(super.field3942, this);
        this.method236((byte) 71);
        arg2.prepareImage(super.field3942, this);
        this.method1710(18814);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
    public final void method235(int arg0, Graphics arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 == -104) {
            ++field449;
            this.method238(arg2, false, arg0, arg3, arg4);
            Shape var7 = arg1.getClip();
            arg1.clipRect(arg2, arg3, arg4, arg0);
            arg1.drawImage(super.field3942, 0, 0, this);
            arg1.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    private final synchronized void method236(byte arg0) {
        ++field464;
        if (this.field457 != null) {
            this.field457.setPixels(0, 0, super.field3941, super.field3938, this.field465, super.field3940, 0, super.field3941);
            if (arg0 > 69) {
                this.field457.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field453;
        this.field457 = arg0;
        arg0.setDimensions(super.field3941, super.field3938);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field465);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!be", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field460;
    }

    @OriginalMember(owner = "client!be", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field452;
        if (this.field457 == arg0) {
            this.field457 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static final void method237(byte arg0) {
        class294.field4625.method1783(0);
        class134.field2087.method1783(0);
        ++field459;
        int var1 = -62 / ((arg0 - -22) / 35);
        class8.field176.method1783(0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZIII)V")
    private final synchronized void method238(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field466;
        if (this.field457 != null) {
            this.field457.setPixels(arg0, arg3, arg4, arg2, this.field465, super.field3940, super.field3941 * arg3 + arg0, super.field3941);
            if (arg1) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field457.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!be", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field462;
        return true;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
    public static final void method239(byte arg0) {
        ++field458;
        if (arg0 == -115) {
            if (!class223.method1487(-91) && ~class274.field4318 != ~class210.field3264) {
                class291.method1960(class274.field4318, class272.field4298, 112, class261.field4058.field4143[0], class147.field2279, class261.field4058.field4204[0], false, false);
            } else if (class274.field4318 != class208.field3233 && class147.method1004(-122, class274.field4318)) {
                class208.field3233 = class274.field4318;
                class121.method865(arg0 + 112);
            }
        }
    }
}
