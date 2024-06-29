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

@OriginalClass("client!lf")
public class class111 extends class129 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "Ltg;")
    private static class184 field2002 = class135.method812("Your account is already logged in)3", 3);

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "Ltg;")
    public static class184 field1999 = field2002;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Lnd;")
    public static class127 field2009 = new class127(50);

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field2014 = 0;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "Ltg;")
    public static class184 field2015 = class135.method812("Nehmen", 3);

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "Ltg;")
    private static class184 field2016 = class135.method812("Your account has been disabled)3", 3);

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field2018 = 0;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "Ltg;")
    public static class184 field2021 = field2016;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "Ltg;")
    public static class184 field2020 = class135.method812(":chalreq:", 3);

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "Ltg;")
    public static class184 field2022 = class135.method812("logo", 3);

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "Lna;")
    public static class124 field2017;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Lud;")
    public static class190 field2013;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1995;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2000;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)Z")
    public static final boolean method683(int arg0, boolean arg1) {
        ++field1993;
        if (arg1) {
            field2011 = 28;
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([Ltg;B)[Ltg;")
    public static final class184[] method684(class184[] arg0, byte arg1) {
        ++field2006;
        class184[] var2 = new class184[5];
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = class144.method884(0, new class184[] { class170.method1060(var3, -120), class54.field968 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class144.method884(0, new class184[] { var2[var3], arg0[var3] });
            }
        }
        if (arg1 != 67) {
            field2009 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZIII)V")
    private final synchronized void method685(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field2010;
        if (this.field2000 != null) {
            if (arg1) {
                field2018 = 52;
            }
            this.field2000.setPixels(arg2, arg3, arg4, arg0, this.field1995, super.field2337, super.field2328 * arg3 - -arg2, super.field2328);
            this.field2000.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!lf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2001;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method686(byte arg0) {
        field2021 = null;
        field2016 = null;
        field1999 = null;
        field2009 = null;
        field2017 = null;
        field2020 = null;
        if (arg0 >= -51) {
            method684((class184[]) null, (byte) 115);
        }
        field2022 = null;
        field2013 = null;
        field2015 = null;
        field2002 = null;
    }

    @OriginalMember(owner = "client!lf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1997;
        return this.field2000 == arg0;
    }

    @OriginalMember(owner = "client!lf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2005;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method440(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 99) {
            field2022 = null;
        }
        this.method690(57);
        ++field2004;
        arg2.drawImage(super.field2332, arg3, arg1, this);
    }

    @OriginalMember(owner = "client!lf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2000 = arg0;
        arg0.setDimensions(super.field2328, super.field2339);
        ++field1992;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1995);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method441(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1994;
        this.method685(arg4, false, arg5, arg3, arg2);
        Shape var7 = arg0.getClip();
        if (arg1 != 3289) {
            this.method690(70);
        }
        arg0.clipRect(arg5, arg3, arg2, arg4);
        arg0.drawImage(super.field2332, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!lf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1991;
        if (this.field2000 == arg0) {
            this.field2000 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method442(int arg0, Component arg1, int arg2, int arg3) {
        super.field2339 = arg2;
        super.field2337 = new int[arg0 * arg2 + 1];
        ++field2008;
        super.field2328 = arg0;
        this.field1995 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2332 = arg1.createImage(this);
        this.method690(100);
        arg1.prepareImage(super.field2332, this);
        this.method690(104);
        arg1.prepareImage(super.field2332, this);
        this.method690(78);
        arg1.prepareImage(super.field2332, this);
        this.method787(arg3);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
    public static final void method687(int arg0, byte arg1) {
        ++field2003;
        class36 var2 = (class36) class179.field3417.method51((long) arg0, arg1 + 200);
        if (var2 != null) {
            var2.method797((byte) -87);
            if (arg1 != -98) {
                method689(85, 90, 11);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public static final void method688(int arg0) {
        ++field1998;
        try {
            if (class127.field2277 == 0) {
                if (class180.field3435 != null) {
                    class180.field3435.method515(-127);
                    class180.field3435 = null;
                }
                class107.field1941 = false;
                class127.field2277 = 1;
                class182.field3504 = null;
                class136.field2472 = 0;
            }
            if (~class127.field2277 == -2) {
                if (class182.field3504 == null) {
                    class182.field3504 = class98.field1841.method899(class159.field2871, class112.field2023, 107);
                }
                if (~class182.field3504.field1765 == -3) {
                    throw new IOException();
                }
                if (~class182.field3504.field1765 == -2) {
                    class180.field3435 = new class87((Socket) class182.field3504.field1767, class98.field1841);
                    class127.field2277 = 2;
                    class182.field3504 = null;
                }
            }
            if (~class127.field2277 == -3) {
                long var1 = class103.field1893 = class188.field3651.method1160(0);
                class117.field2122.field1834 = 0;
                class117.field2122.method583((byte) 14, 14);
                int var3 = (int) (31L & var1 >> 16);
                class117.field2122.method583((byte) 14, var3);
                class180.field3435.method514(2, 0, class117.field2122.field1809, -23422);
                class127.field2277 = 3;
                class21.field394.field1834 = 0;
            }
            if (~class127.field2277 == -4) {
                if (class157.field2820 != null) {
                    class157.field2820.method1337(false);
                }
                if (class90.field1667 != null) {
                    class90.field1667.method1337(false);
                }
                int var4 = class180.field3435.method518(0);
                if (class157.field2820 != null) {
                    class157.field2820.method1337(false);
                }
                if (class90.field1667 != null) {
                    class90.field1667.method1337(false);
                }
                if (var4 != 0) {
                    class79.method450((byte) -66, var4);
                    return;
                }
                class127.field2277 = 4;
                class21.field394.field1834 = 0;
            }
            if (class127.field2277 == 4) {
                if (class21.field394.field1834 < 8) {
                    int var5 = class180.field3435.method519((byte) -99);
                    if (-class21.field394.field1834 + 8 < var5) {
                        var5 = 8 - class21.field394.field1834;
                    }
                    if (~var5 < -1) {
                        class180.field3435.method520(var5, class21.field394.field1834, -1, class21.field394.field1809);
                        class21.field394.field1834 += var5;
                    }
                }
                if (~class21.field394.field1834 == -9) {
                    class21.field394.field1834 = 0;
                    class151.field2709 = class21.field394.method615(99);
                    class127.field2277 = 5;
                }
            }
            if (class127.field2277 == 5) {
                class117.field2122.field1834 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class151.field2709 >> 32), (int) class151.field2709 };
                class117.field2122.method583((byte) 14, 10);
                class117.field2122.method580(var6[0], false);
                class117.field2122.method580(var6[1], false);
                class117.field2122.method580(var6[2], false);
                class117.field2122.method580(var6[3], false);
                class117.field2122.method607(class188.field3651.method1160(0), 102);
                class117.field2122.method600(class188.field3626, 24);
                class117.field2122.method602(class114.field2058, 88, class204.field3932);
                class172.field3256.field1834 = 0;
                if (~class127.field2281 != -41) {
                    class172.field3256.method583((byte) 14, 16);
                } else {
                    class172.field3256.method583((byte) 14, 18);
                }
                class172.field3256.method583((byte) 14, class117.field2122.field1834 + 93);
                class172.field3256.method580(485, false);
                class172.field3256.method583((byte) 14, class55.field970 ? 1 : 0);
                class189.method1204(false, class172.field3256);
                class172.field3256.method580(class164.field2953.field3852, false);
                class172.field3256.method580(class200.field3884.field3852, false);
                class172.field3256.method580(class146.field2631.field3852, false);
                class172.field3256.method580(class170.field3229.field3852, false);
                class172.field3256.method580(class7.field128.field3852, false);
                class172.field3256.method580(class17.field324.field3852, false);
                class172.field3256.method580(class180.field3427.field3852, false);
                class172.field3256.method580(class3.field62.field3852, false);
                class172.field3256.method580(class117.field2124.field3852, false);
                class172.field3256.method580(class19.field355.field3852, false);
                class172.field3256.method580(class126.field2270.field3852, false);
                class172.field3256.method580(class14.field279.field3852, false);
                class172.field3256.method580(class174.field3291.field3852, false);
                class172.field3256.method580(field2013.field3852, false);
                class172.field3256.method580(class15.field296.field3852, false);
                class172.field3256.method580(class46.field868.field3852, false);
                class172.field3256.method604((byte) 61, 0, class117.field2122.field1834, class117.field2122.field1809);
                class180.field3435.method514(class172.field3256.field1834, 0, class172.field3256.field1809, -23422);
                class117.field2122.method108(var6, (byte) -100);
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    var6[var7] += 50;
                }
                class21.field394.method108(var6, (byte) -100);
                class127.field2277 = 6;
            }
            if (~class127.field2277 == -7 && class180.field3435.method519((byte) -99) > 0) {
                int var8 = class180.field3435.method518(0);
                if (~var8 == -22 && ~class127.field2281 == -21) {
                    class127.field2277 = 7;
                } else if (var8 == 2) {
                    class127.field2277 = 9;
                } else {
                    if (~var8 == -16 && class127.field2281 == 40) {
                        class122.method738(768);
                        return;
                    }
                    if (var8 != 23 || ~class41.field790 <= -2) {
                        class79.method450((byte) -66, var8);
                        return;
                    }
                    ++class41.field790;
                    class127.field2277 = 0;
                }
            }
            if (~class127.field2277 == -8 && ~class180.field3435.method519((byte) -99) < -1) {
                class47.field883 = 60 * (3 + class180.field3435.method518(0));
                class127.field2277 = 8;
            }
            if (arg0 != 3) {
                method688(10);
            }
            if (class127.field2277 == 8) {
                class136.field2472 = 0;
                class186.method1179(class60.field1119, class144.method884(0, new class184[] { class170.method1060(class47.field883 / 60, -126), class99.field1850 }), class47.field887, (byte) -120);
                if (--class47.field883 <= 0) {
                    class127.field2277 = 0;
                }
            } else {
                if (class127.field2277 == 9 && ~class180.field3435.method519((byte) -99) <= -10) {
                    class57.field1022 = class180.field3435.method518(0);
                    class138.field2510 = class180.field3435.method518(0);
                    class47.field884 = class180.field3435.method518(arg0 + -3) == 1;
                    class125.field2260 = class180.field3435.method518(arg0 + -3);
                    class125.field2260 <<= 8;
                    class125.field2260 += class180.field3435.method518(0);
                    class151.field2706 = class180.field3435.method518(0);
                    class180.field3435.method520(1, 0, -1, class21.field394.field1809);
                    class21.field394.field1834 = 0;
                    class105.field1909 = class21.field394.method112(true);
                    class180.field3435.method520(2, 0, -1, class21.field394.field1809);
                    class21.field394.field1834 = 0;
                    field2014 = class21.field394.method611(false);
                    class127.field2277 = 10;
                }
                if (class127.field2277 == 10) {
                    if (~class180.field3435.method519((byte) -99) <= ~field2014) {
                        class21.field394.field1834 = 0;
                        class180.field3435.method520(field2014, 0, arg0 ^ -4, class21.field394.field1809);
                        class179.method1095(90);
                        class38.field715 = -1;
                        class17.method114(0, false);
                        class105.field1909 = -1;
                    }
                } else {
                    ++class136.field2472;
                    if (class136.field2472 > 2000) {
                        if (class41.field790 < 1) {
                            ++class41.field790;
                            class127.field2277 = 0;
                            if (~class159.field2871 != ~class110.field1982) {
                                class159.field2871 = class110.field1982;
                            } else {
                                class159.field2871 = class212.field4103;
                            }
                        } else {
                            class79.method450((byte) -66, -3);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (~class41.field790 > -2) {
                if (class159.field2871 != class110.field1982) {
                    class159.field2871 = class110.field1982;
                } else {
                    class159.field2871 = class212.field4103;
                }
                ++class41.field790;
                class127.field2277 = 0;
            } else {
                class79.method450((byte) -66, -2);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public static final void method689(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class87.field1608; ++var3) {
            for (int var4 = 0; var4 < class8.field145; ++var4) {
                for (int var5 = 0; var5 < class159.field2853; ++var5) {
                    class90 var6 = class190.field3704[var3][var4][var5];
                    if (var6 != null) {
                        class50 var7 = var6.field1693;
                        if (var7 != null && var7.field918 instanceof class181) {
                            class181 var8 = (class181) var7.field918;
                            class108.method671(var8, var3, var4, var5, 1, 1);
                            if (var7.field930 instanceof class181) {
                                class181 var9 = (class181) var7.field930;
                                class108.method671(var9, var3, var4, var5, 1, 1);
                                class181.method1120(var8, var9, 0, 0, 0, false);
                                var7.field930 = var9.method1102(var9.field3458, var9.field3485, arg0, arg1, arg2, false, false);
                            }
                            var7.field918 = var8.method1102(var8.field3458, var8.field3485, arg0, arg1, arg2, false, false);
                        }
                        for (int var10 = 0; var10 < var6.field1680; ++var10) {
                            class164 var13 = var6.field1686[var10];
                            if (var13 != null && var13.field2951 instanceof class181) {
                                class181 var14 = (class181) var13.field2951;
                                class108.method671(var14, var3, var4, var5, var13.field2949 - var13.field2954 + 1, var13.field2957 - var13.field2945 + 1);
                                var13.field2951 = var14.method1102(var14.field3458, var14.field3485, arg0, arg1, arg2, false, false);
                            }
                        }
                        class88 var11 = var6.field1690;
                        if (var11 != null && var11.field1658 instanceof class181) {
                            class181 var12 = (class181) var11.field1658;
                            class35.method210(var12, var3, var4, var5);
                            var11.field1658 = var12.method1102(var12.field3458, var12.field3485, arg0, arg1, arg2, false, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2012;
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    private final synchronized void method690(int arg0) {
        if (arg0 > 53) {
            ++field1996;
            if (this.field2000 != null) {
                this.field2000.setPixels(0, 0, super.field2328, super.field2339, this.field1995, super.field2337, 0, super.field2328);
                this.field2000.imageComplete(2);
            }
        }
    }
}
