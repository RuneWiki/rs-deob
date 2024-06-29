import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class146 extends class66 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lmb;")
    private static class84 field3567 = class79.method672(true, "Message");

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lmb;")
    public static class84 field3581 = class79.method672(true, "mapscene");

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "Lmb;")
    private static class84 field3577 = class79.method672(true, "System update in: ");

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Lmb;")
    private static class84 field3571 = class79.method672(true, "Loaded config");

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lmb;")
    public static class84 field3585 = class79.method672(true, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field3566 = 0;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "Lmb;")
    public static class84 field3590 = class79.method672(true, "Lade Freunde)2Liste)3)3)3");

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Lmb;")
    public static class84 field3569 = field3571;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field3586 = 0;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lmb;")
    public static class84 field3594 = class79.method672(true, "(U2");

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Lmb;")
    private static class84 field3587 = class79.method672(true, "Loading textures )2 ");

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Lmb;")
    public static class84 field3589 = field3577;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lmb;")
    public static class84 field3596 = field3567;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Lmb;")
    private static class84 field3572 = class79.method672(true, "Select");

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Lmb;")
    public static class84 field3573 = field3572;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lmb;")
    public static class84 field3599 = field3587;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "Lmb;")
    private static class84 field3588 = class79.method672(true, "button near the top of that page)3");

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lmb;")
    public static class84 field3601 = class79.method672(true, "weiss:");

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "Lmb;")
    public static class84 field3578 = field3588;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "Lhd;")
    public static class53 field3591;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3600;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3576;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field3573 = null;
        if (arg0 != 13) {
            method1189(4);
        }
        field3591 = null;
        field3577 = null;
        field3596 = null;
        field3567 = null;
        field3571 = null;
        field3601 = null;
        field3587 = null;
        field3569 = null;
        field3588 = null;
        field3581 = null;
        field3572 = null;
        field3578 = null;
        field3589 = null;
        field3599 = null;
        field3594 = null;
        field3585 = null;
        field3590 = null;
    }

    @OriginalMember(owner = "client!wd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3579;
        return this.field3576 == arg0;
    }

    @OriginalMember(owner = "client!wd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3597;
        this.field3576 = arg0;
        arg0.setDimensions(super.field1641, super.field1632);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3600);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method123(int arg0, int arg1, int arg2, Component arg3) {
        super.field1623 = new int[arg0 * arg1 + 1];
        ++field3598;
        super.field1632 = arg0;
        super.field1641 = arg1;
        this.field3600 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1622 = arg3.createImage(this);
        int var5 = -44 / ((arg2 - -35) / 63);
        this.method1192(9);
        arg3.prepareImage(super.field1622, this);
        this.method1192(108);
        arg3.prepareImage(super.field1622, this);
        this.method1192(123);
        arg3.prepareImage(super.field1622, this);
        this.method599(-99);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lia;Z)Lia;")
    public static final class57 method1188(class57 arg0, boolean arg1) {
        ++field3570;
        int var2 = class71.method628(class91.method780(-150310624, arg0), 2);
        if (~var2 == -1) {
            return null;
        } else if (!arg1) {
            return null;
        } else {
            for (int var3 = 0; var3 < var2; ++var3) {
                arg0 = class97.method805(-894550512, arg0.field1443);
                if (arg0 == null) {
                    return null;
                }
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public static final void method1189(int arg0) {
        class63.method575(false, arg0 ^ 132);
        class39.field866 = 0;
        ++field3593;
        boolean var1 = true;
        int var2 = 0;
        if (arg0 != 255) {
            field3596 = null;
        }
        while (var2 < class40.field917.length) {
            if (class93.field2319[var2] != -1 && class40.field917[var2] == null) {
                class40.field917[var2] = class59.field1462.method986(0, class93.field2319[var2], (byte) 67);
                if (class40.field917[var2] == null) {
                    ++class39.field866;
                    var1 = false;
                }
            }
            if (~class79.field1964[var2] != 0 && class96.field2391[var2] == null) {
                class96.field2391[var2] = class59.field1462.method1009(0, class79.field1964[var2], (byte) -25, class88.field2202[var2]);
                if (class96.field2391[var2] == null) {
                    ++class39.field866;
                    var1 = false;
                }
            }
            ++var2;
        }
        if (!var1) {
            class92.field2303 = 1;
        } else {
            boolean var3 = true;
            class95.field2371 = 0;
            for (int var4 = 0; ~var4 > ~class40.field917.length; ++var4) {
                byte[] var56 = class96.field2391[var4];
                if (var56 != null) {
                    int var57 = (class43.field955[var4] >> 8) * 64 + -class95.field2359;
                    int var58 = (255 & class43.field955[var4]) * 64 + -class10.field159;
                    if (class2.field43) {
                        var57 = 10;
                        var58 = 10;
                    }
                    var3 &= class125.method1030(var58, 0, var57, var56);
                }
            }
            if (!var3) {
                class92.field2303 = 2;
            } else {
                if (~class92.field2303 != -1) {
                    class74.method645(class98.field2421, 16777215, class134.field3214, true);
                }
                class125.method1027(116);
                class87.method746((byte) -105);
                class125.method1027(110);
                class133.field3173.method485();
                class125.method1027(116);
                System.gc();
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    class65.field1603[var5].method592(-59);
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var54 = 0; ~var54 > -105; ++var54) {
                        for (int var55 = 0; ~var55 > -105; ++var55) {
                            class62.field1540[var6][var54][var55] = 0;
                        }
                    }
                }
                class125.method1027(arg0 ^ 152);
                class133.method1072((byte) 86);
                int var7 = class40.field917.length;
                class120.method972(1);
                class63.method575(true, arg0 ^ 143);
                if (!class2.field43) {
                    for (int var8 = 0; ~var7 < ~var8; ++var8) {
                        int var17 = (class43.field955[var8] >> 8) * 64 + -class95.field2359;
                        byte[] var18 = class40.field917[var8];
                        int var19 = (255 & class43.field955[var8]) * 64 - class10.field159;
                        if (var18 != null) {
                            class125.method1027(127);
                            class37.method278(class65.field1603, class54.field1252 * 8 + -48, var18, 0, var17, var19, class53.field1191 * 8 - 48);
                        }
                    }
                    for (int var9 = 0; var9 < var7; ++var9) {
                        int var14 = (class43.field955[var9] >> 8) * 64 + -class95.field2359;
                        int var15 = (255 & class43.field955[var9]) * 64 + -class10.field159;
                        byte[] var16 = class40.field917[var9];
                        if (var16 == null && ~class54.field1252 > -801) {
                            class125.method1027(110);
                            class77.method664(var14, 64, 64, (byte) -54, var15);
                        }
                    }
                    class63.method575(true, 106);
                    for (int var10 = 0; ~var10 > ~var7; ++var10) {
                        byte[] var11 = class96.field2391[var10];
                        if (var11 != null) {
                            int var12 = (class43.field955[var10] >> 8) * 64 + -class95.field2359;
                            int var13 = (class43.field955[var10] & 255) * 64 + -class10.field159;
                            class125.method1027(112);
                            class57.method502(var13, var11, var12, class65.field1603, class133.field3173, (byte) -82);
                        }
                    }
                }
                if (class2.field43) {
                    for (int var20 = 0; ~var20 > -5; ++var20) {
                        class125.method1027(89);
                        for (int var34 = 0; var34 < 13; ++var34) {
                            for (int var35 = 0; var35 < 13; ++var35) {
                                boolean var36 = false;
                                int var37 = class90.field2258[var20][var34][var35];
                                if (var37 != -1) {
                                    int var38 = (var37 & 61166189) >> 24;
                                    int var39 = (var37 & 6) >> 1;
                                    int var40 = (16383 & var37) >> 3;
                                    int var41 = 1023 & var37 >> 14;
                                    int var42 = (var41 / 8 << 8) + var40 / 8;
                                    for (int var43 = 0; class43.field955.length > var43; ++var43) {
                                        if (class43.field955[var43] == var42 && class40.field917[var43] != null) {
                                            class105.method877(var20, var39, var34 * 8, var35 * 8, var38, (7 & var40) * 8, class40.field917[var43], 100, class65.field1603, (7 & var41) * 8);
                                            var36 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var36) {
                                    class145.method1177(0, var34 * 8, var20, var35 * 8);
                                }
                            }
                        }
                    }
                    for (int var21 = 0; var21 < 13; ++var21) {
                        for (int var32 = 0; var32 < 13; ++var32) {
                            int var33 = class90.field2258[0][var21][var32];
                            if (var33 == -1) {
                                class77.method664(var21 * 8, 8, 8, (byte) -54, var32 * 8);
                            }
                        }
                    }
                    class63.method575(true, 118);
                    for (int var22 = 0; ~var22 > -5; ++var22) {
                        class125.method1027(102);
                        for (int var23 = 0; var23 < 13; ++var23) {
                            for (int var24 = 0; ~var24 > -14; ++var24) {
                                int var25 = class90.field2258[var22][var23][var24];
                                if (var25 != -1) {
                                    int var26 = (7 & var25) >> 1;
                                    int var27 = (var25 & 16766800) >> 14;
                                    int var28 = var25 >> 24 & 3;
                                    int var29 = (var25 & 16383) >> 3;
                                    int var30 = (var27 / 8 << 8) + var29 / 8;
                                    for (int var31 = 0; ~class43.field955.length < ~var31; ++var31) {
                                        if (class43.field955[var31] == var30 && class96.field2391[var31] != null) {
                                            class109.method890(var28, var26, (byte) 89, (7 & var29) * 8, (7 & var27) * 8, class96.field2391[var31], var24 * 8, class65.field1603, var23 * 8, class133.field3173, var22);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class63.method575(true, 103);
                class87.method746((byte) -88);
                class125.method1027(arg0 ^ 142);
                class115.method942(class133.field3173, -125, class65.field1603);
                class63.method575(true, 102);
                int var44 = class41.field928;
                if (~class13.field251 > ~var44) {
                    var44 = class13.field251;
                }
                if (~var44 > ~(class13.field251 + -1)) {
                    int var45 = class13.field251 + -1;
                }
                if (!class124.field3012) {
                    class133.field3173.method481(0);
                } else {
                    class133.field3173.method481(class41.field928);
                }
                for (int var46 = 0; var46 < 104; ++var46) {
                    for (int var53 = 0; ~var53 > -105; ++var53) {
                        class98.method816(var53, (byte) -126, var46);
                    }
                }
                class125.method1027(87);
                class95.method797((byte) 111);
                class144.field3480.method966(false);
                if (class46.field1001 != null) {
                    ++class144.field3467;
                    class80.field1978.method769((byte) -95, 218);
                    class80.field1978.method378(arg0 + -253, 1057001181);
                }
                if (!class2.field43) {
                    int var47 = (class53.field1191 + -6) / 8;
                    int var48 = (class53.field1191 - -6) / 8;
                    int var49 = (class54.field1252 + -6) / 8;
                    int var50 = (class54.field1252 + 6) / 8;
                    for (int var51 = var47 + -1; ~(var48 - -1) <= ~var51; ++var51) {
                        for (int var52 = var49 + -1; ~var52 >= ~(var50 + 1); ++var52) {
                            if (var51 < var47 || var48 < var51 || ~var52 > ~var49 || ~var52 < ~var50) {
                                class59.field1462.method999(arg0 + -255, class51.method408(new class84[] { class15.field326, class93.method787(22245, var51), class98.field2417, class93.method787(22245, var52) }, 110));
                                class59.field1462.method999(0, class51.method408(new class84[] { class115.field2751, class93.method787(arg0 ^ 22042, var51), class98.field2417, class93.method787(22245, var52) }, 125));
                            }
                        }
                    }
                }
                if (class122.field2948 == -1) {
                    class51.method387(48, 30);
                } else {
                    class51.method387(19, 35);
                }
                class125.method1027(91);
                class40.method301((byte) 98);
                class80.field1978.method769((byte) -120, 193);
                class107.method887(arg0 + -255);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3576 == arg0) {
            this.field3576 = null;
        }
        ++field3580;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method1190(int arg0, int arg1) {
        ++field3568;
        if (arg0 != 17170) {
            field3586 = -21;
        }
        if (~class58.field1453 == -1) {
            class69.field1689.method1088(arg1, (byte) 106);
        } else {
            class65.field1597 = arg1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3592;
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3595;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method122(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method1192(-113);
        ++field3575;
        if (arg3 != 0) {
            method1189(40);
        }
        arg0.drawImage(super.field1622, arg1, arg2, this);
    }

    @OriginalMember(owner = "client!wd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3583;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lsd;IB)Lkb;")
    public static final class71 method1191(class122 arg0, int arg1, byte arg2) {
        ++field3574;
        if (arg2 <= 64) {
            method1189(62);
        }
        byte[] var3 = arg0.method996(arg1, (byte) -95);
        return var3 == null ? null : new class71(var3);
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    private final synchronized void method1192(int arg0) {
        ++field3584;
        int var2 = 36 / ((64 - arg0) / 36);
        if (this.field3576 != null) {
            this.field3576.setPixels(0, 0, super.field1641, super.field1632, this.field3600, super.field1623, 0, super.field1641);
            this.field3576.imageComplete(2);
        }
    }
}
