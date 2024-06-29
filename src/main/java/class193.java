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
import java.net.Socket;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class193 extends class163 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Lai;")
    public static class10 field3681 = class44.method278("blaugr-Un:", 106);

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field3679 = 0;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lta;")
    public static class173 field3667;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3687;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3664;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "[Lbf;")
    public static class17[] field3675;

    @OriginalMember(owner = "client!vc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3664 = arg0;
        ++field3669;
        arg0.setDimensions(super.field3116, super.field3120);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3687);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!vc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3676;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!vc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3684;
    }

    @OriginalMember(owner = "client!vc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3685;
        return this.field3664 == arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
    public static final boolean method1233(int arg0, byte arg1) {
        ++field3686;
        if (arg1 != 127) {
            field3679 = -121;
        }
        return arg0 >= 48 && ~arg0 >= -58;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method967(int arg0, Component arg1, int arg2, int arg3) {
        super.field3122 = new int[arg2 * arg3 - -1];
        if (arg0 != 1) {
            field3675 = null;
        }
        ++field3678;
        super.field3116 = arg3;
        super.field3120 = arg2;
        this.field3687 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3127 = arg1.createImage(this);
        this.method1236(125);
        arg1.prepareImage(super.field3127, this);
        this.method1236(-88);
        arg1.prepareImage(super.field3127, this);
        this.method1236(arg0 ^ -114);
        arg1.prepareImage(super.field3127, this);
        this.method1079(28);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[Lai;I)Lai;")
    public static final class10 method1234(int arg0, int arg1, class10[] arg2, int arg3) {
        int var4 = 0;
        ++field3673;
        for (int var5 = 0; var5 < arg1; ++var5) {
            if (arg2[arg3 + var5] == null) {
                arg2[arg3 + var5] = class182.field3466;
            }
            var4 += arg2[arg3 + var5].field118;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; ~var8 > ~arg1; ++var8) {
            class10 var11 = arg2[arg3 + var8];
            class12.method81(var11.field160, 0, var6, var7, var11.field118);
            var7 += var11.field118;
        }
        int var9 = -34 % ((arg0 - -42) / 60);
        class10 var10 = new class10();
        var10.field118 = var4;
        var10.field160 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!vc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3683;
        if (this.field3664 == arg0) {
            this.field3664 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3672;
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)Lq;")
    public static final class145 method1235(boolean arg0, int arg1) {
        ++field3666;
        class145 var2 = (class145) class99.field1823.method222(-65, (long) arg1);
        if (!arg0) {
            return null;
        } else if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class104.field1952.method159((byte) 98, arg1, 4);
            class145 var4 = new class145();
            if (var3 != null) {
                var4.method1004(-102, new class114(var3), arg1);
            }
            class99.field1823.method225(-21284, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    private final synchronized void method1236(int arg0) {
        ++field3680;
        int var2 = -85 % ((arg0 - -7) / 36);
        if (this.field3664 != null) {
            this.field3664.setPixels(0, 0, super.field3116, super.field3120, this.field3687, super.field3122, 0, super.field3116);
            this.field3664.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method968(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1239(arg3, arg5, -1, arg2, arg1);
        ++field3665;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg3, arg1, arg2);
        arg0.drawImage(super.field3127, 0, arg4, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static final void method1237(byte arg0) {
        ++field3682;
        try {
            if (class170.field3285 == 0) {
                if (class188.field3593 != null) {
                    class188.field3593.method552(-5034);
                    class188.field3593 = null;
                }
                class201.field3949 = null;
                class157.field3030 = 0;
                class170.field3285 = 1;
                class172.field3322 = false;
            }
            if (~class170.field3285 == -2) {
                if (class201.field3949 == null) {
                    class201.field3949 = class120.field2313.method499(class186.field3546, class11.field179, -3);
                }
                if (class201.field3949.field352 == 2) {
                    throw new IOException();
                }
                if (class201.field3949.field352 == 1) {
                    class188.field3593 = new class91((Socket) class201.field3949.field353, class120.field2313);
                    class170.field3285 = 2;
                    class201.field3949 = null;
                }
            }
            if (class170.field3285 == 2) {
                long var1 = class75.field1304 = class10.field123.method62((byte) -111);
                class76.field1323.field2170 = 0;
                class76.field1323.method781(0, 14);
                int var3 = (int) (var1 >> 16 & 31L);
                class76.field1323.method781(0, var3);
                class188.field3593.method557(2, class76.field1323.field2160, 0, 119);
                class170.field3285 = 3;
                class74.field1273.field2170 = 0;
            }
            if (class170.field3285 == 3) {
                if (class153.field2950 != null) {
                    class153.field2950.method1326((byte) -114);
                }
                if (class180.field3418 != null) {
                    class180.field3418.method1326((byte) -80);
                }
                int var4 = class188.field3593.method554((byte) 17);
                if (class153.field2950 != null) {
                    class153.field2950.method1326((byte) -83);
                }
                if (class180.field3418 != null) {
                    class180.field3418.method1326((byte) -65);
                }
                if (var4 != 0) {
                    class117.method839(-104, var4);
                    return;
                }
                class170.field3285 = 4;
                class74.field1273.field2170 = 0;
            }
            if (~class170.field3285 == -5) {
                if (class74.field1273.field2170 < 8) {
                    int var5 = class188.field3593.method551(false);
                    if (~(-class74.field1273.field2170 + 8) > ~var5) {
                        var5 = -class74.field1273.field2170 + 8;
                    }
                    if (~var5 < -1) {
                        class188.field3593.method556((byte) 123, var5, class74.field1273.field2160, class74.field1273.field2170);
                        class74.field1273.field2170 += var5;
                    }
                }
                if (class74.field1273.field2170 == 8) {
                    class74.field1273.field2170 = 0;
                    class74.field1264 = class74.field1273.method811(115);
                    class170.field3285 = 5;
                }
            }
            if (class170.field3285 == 5) {
                class76.field1323.field2170 = 0;
                int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D), (int) (class74.field1264 >> 32), (int) class74.field1264 };
                class76.field1323.method781(0, 10);
                class76.field1323.method786(var6[0], (byte) -66);
                class76.field1323.method786(var6[1], (byte) -45);
                class76.field1323.method786(var6[2], (byte) -98);
                class76.field1323.method786(var6[3], (byte) -114);
                class76.field1323.method783(class10.field123.method62((byte) -117), -114);
                class76.field1323.method769(0, class10.field162);
                class76.field1323.method803(class174.field3345, class124.field2368, 122);
                class124.field2378.field2170 = 0;
                if (~class174.field3353 == -41) {
                    class124.field2378.method781(arg0 ^ -68, 18);
                } else {
                    class124.field2378.method781(0, 16);
                }
                class124.field2378.method781(0, 93 - -class76.field1323.field2170);
                class124.field2378.method786(477, (byte) -123);
                class124.field2378.method781(arg0 ^ -68, !class126.field2406 ? 0 : 1);
                class94.method618(class124.field2378, (byte) 122);
                class124.field2378.method786(class192.field3655.field320, (byte) -63);
                class124.field2378.method786(class169.field3271.field320, (byte) -125);
                class124.field2378.method786(class54.field973.field320, (byte) -88);
                class124.field2378.method786(class101.field1903.field320, (byte) -59);
                class124.field2378.method786(class151.field2912.field320, (byte) -99);
                class124.field2378.method786(class186.field3538.field320, (byte) -78);
                class124.field2378.method786(class5.field67.field320, (byte) -114);
                class124.field2378.method786(class67.field1183.field320, (byte) -105);
                class124.field2378.method786(class146.field2800.field320, (byte) -91);
                class124.field2378.method786(class159.field3060.field320, (byte) -104);
                class124.field2378.method786(class6.field75.field320, (byte) -87);
                class124.field2378.method786(class200.field3892.field320, (byte) -85);
                class124.field2378.method786(class137.field2581.field320, (byte) -102);
                class124.field2378.method786(class140.field2640.field320, (byte) -73);
                class124.field2378.method786(class4.field38.field320, (byte) -93);
                class124.field2378.method786(class40.field670.field320, (byte) -67);
                class124.field2378.method785((byte) 118, 0, class76.field1323.field2170, class76.field1323.field2160);
                class188.field3593.method557(class124.field2378.field2170, class124.field2378.field2160, 0, 121);
                class76.field1323.method636(var6, (byte) 0);
                for (int var7 = 0; var7 < 4; ++var7) {
                    var6[var7] += 50;
                }
                class74.field1273.method636(var6, (byte) 0);
                class170.field3285 = 6;
            }
            if (class170.field3285 == 6 && class188.field3593.method551(false) > 0) {
                int var8 = class188.field3593.method554((byte) 17);
                if (var8 == 21 && class174.field3353 == 20) {
                    class170.field3285 = 7;
                } else if (var8 != 2) {
                    if (~var8 == -16 && ~class174.field3353 == -41) {
                        class71.method453((byte) 79);
                        return;
                    }
                    if (var8 != 23 || ~class47.field793 <= -2) {
                        class117.method839(arg0 ^ 46, var8);
                        return;
                    }
                    ++class47.field793;
                    class170.field3285 = 0;
                } else {
                    class170.field3285 = 9;
                }
            }
            if (class170.field3285 == 7 && ~class188.field3593.method551(false) < -1) {
                class124.field2376 = 60 * (class188.field3593.method554((byte) 17) + 3);
                class170.field3285 = 8;
            }
            if (class170.field3285 == 8) {
                class157.field3030 = 0;
                class151.method1032(class67.method440(0, new class10[] { class119.method846(0, class124.field2376 / 60), class163.field3119 }), class56.field987, (byte) 99, class148.field2833);
                if (~(--class124.field2376) >= -1) {
                    class170.field3285 = 0;
                }
            } else {
                if (arg0 != -68) {
                    method1233(76, (byte) -35);
                }
                if (~class170.field3285 == -10 && ~class188.field3593.method551(false) <= -10) {
                    class111.field2057 = class188.field3593.method554((byte) 17);
                    class109.field2024 = class188.field3593.method554((byte) 17);
                    class2.field8 = ~class188.field3593.method554((byte) 17) == -2;
                    class78.field1370 = class188.field3593.method554((byte) 17);
                    class78.field1370 <<= 8;
                    class78.field1370 += class188.field3593.method554((byte) 17);
                    class109.field2020 = class188.field3593.method554((byte) 17);
                    class188.field3593.method556((byte) -86, 1, class74.field1273.field2160, 0);
                    class74.field1273.field2170 = 0;
                    class98.field1818 = class74.field1273.method631(-126);
                    class188.field3593.method556((byte) 102, 2, class74.field1273.field2160, 0);
                    class74.field1273.field2170 = 0;
                    class154.field2972 = class74.field1273.method762((byte) 102);
                    class170.field3285 = 10;
                }
                if (class170.field3285 == 10) {
                    if (class188.field3593.method551(false) >= class154.field2972) {
                        class74.field1273.field2170 = 0;
                        class188.field3593.method556((byte) 106, class154.field2972, class74.field1273.field2160, 0);
                        class184.method1191(23606);
                        class159.field3054 = -1;
                        class172.method1132((byte) -78, false);
                        class98.field1818 = -1;
                    }
                } else {
                    ++class157.field3030;
                    if (class157.field3030 > 2000) {
                        if (class47.field793 < 1) {
                            ++class47.field793;
                            if (~class186.field3546 != ~class133.field2494) {
                                class186.field3546 = class133.field2494;
                            } else {
                                class186.field3546 = class146.field2785;
                            }
                            class170.field3285 = 0;
                        } else {
                            class117.method839(-36, -3);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (~class47.field793 > -2) {
                ++class47.field793;
                class170.field3285 = 0;
                if (~class186.field3546 == ~class133.field2494) {
                    class186.field3546 = class146.field2785;
                } else {
                    class186.field3546 = class133.field2494;
                }
            } else {
                class117.method839(-93, -2);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Llg;")
    public static final class107 method1238(int arg0, int arg1) {
        class107 var2 = (class107) class185.field3519.method222(arg1 ^ 111, (long) arg0);
        if (arg1 != 1) {
            return null;
        } else {
            ++field3677;
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class203.field3964.method159((byte) 112, arg0, 5);
                class107 var4 = new class107();
                if (var3 != null) {
                    var4.method691(new class114(var3), (byte) 125);
                }
                class185.field3519.method225(-21284, (long) arg0, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1239(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1) {
            field3679 = 88;
        }
        ++field3671;
        if (this.field3664 != null) {
            this.field3664.setPixels(arg1, arg0, arg4, arg3, this.field3687, super.field3122, super.field3116 * arg0 - -arg1, super.field3116);
            this.field3664.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    public static void method1240(int arg0) {
        field3681 = null;
        field3667 = null;
        field3675 = null;
        if (arg0 != 9) {
            field3679 = -86;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method969(int arg0, Graphics arg1, int arg2, int arg3) {
        ++field3668;
        this.method1236(34);
        arg1.drawImage(super.field3127, arg0, arg3, this);
        if (arg2 != 13) {
            field3675 = null;
        }
    }
}
