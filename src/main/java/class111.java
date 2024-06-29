import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class111 extends class89 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lqc;")
    public static class97 field2391 = new class97(500);

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Lo;")
    public static class84 field2393 = class15.method124("Ok", 255);

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Lo;")
    public static class84 field2398 = class15.method124("System update in: ", 255);

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "Lo;")
    public static class84 field2407 = class15.method124("Loading interfaces )2 ", 255);

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Lo;")
    public static class84 field2409 = class15.method124("p11_full", 255);

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "Lod;")
    public static class88 field2404 = new class88();

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "Lo;")
    public static class84 field2410 = class15.method124("To switch to a members)2only world:*6n1(Y Logout and return to the world selection page)3*6n2(Y Choose one of the members world with a gold star next to it(Ws name)3*6n*6nIf you prefer you can continue to use this world)1*6nbut members only features will be unavailable here)3", 255);

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Z")
    public static boolean field2411 = false;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field2414 = 0;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "Lo;")
    public static class84 field2412 = class15.method124("@cr2@", 255);

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "Lud;")
    public static class118 field2402;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lp;")
    public static class89 field2419;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2395;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2406;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "[I")
    public static int[] field2416;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "[Z")
    public static boolean[] field2418;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 9)
    public static final void method858(int arg0) {
        if (class79.field1686 > 0) {
            --class79.field1686;
        }
        ++field2390;
        if (class103.field2169 > 1) {
            --class103.field2169;
        }
        if (class89.field2009) {
            class89.field2009 = false;
            class40.method357(-19030);
        } else {
            for (int var1 = 0; var1 < 100 && class3.method12((byte) -98); ++var1) {
            }
            if (~class51.field1088 == -31 || ~class51.field1088 == -36) {
                if (class88.field1993 && ~class51.field1088 == -31) {
                    class105.field2225 = 0;
                    field2414 = 0;
                    while (class116.method890(-14465)) {
                    }
                    for (int var2 = 0; ~var2 > ~class119.field2631.length; ++var2) {
                        class119.field2631[var2] = false;
                    }
                }
                class80.method591(class97.field2070, (byte) 31, 149);
                Object var3 = class51.field1095.field2179;
                synchronized (class51.field1095.field2179) {
                    if (!class50.field1078) {
                        class51.field1095.field2181 = 0;
                    } else if (class105.field2225 != 0 || class51.field1095.field2181 >= 40) {
                        ++class27.field499;
                        class97.field2070.method979(1, 94);
                        class97.field2070.method226(-9646, 0);
                        int var4 = 0;
                        int var5 = class97.field2070.field482;
                        for (int var6 = 0; ~var6 > ~class51.field1095.field2181 && -var5 + class97.field2070.field482 < 240; ++var6) {
                            ++var4;
                            int var7 = class51.field1095.field2182[var6];
                            if (var7 >= 0) {
                                if (~var7 < -765) {
                                    var7 = 764;
                                }
                            } else {
                                var7 = 0;
                            }
                            int var8 = class51.field1095.field2184[var6];
                            if (~var8 <= -1) {
                                if (~var8 < -503) {
                                    var8 = 502;
                                }
                            } else {
                                var8 = 0;
                            }
                            int var9 = var8 * 765 + var7;
                            if (class51.field1095.field2184[var6] == -1 && ~class51.field1095.field2182[var6] == 0) {
                                var7 = -1;
                                var8 = -1;
                                var9 = 524287;
                            }
                            if (~class93.field2040 == ~var7 && class24.field407 == var8) {
                                if (class75.field1626 < 2047) {
                                    ++class75.field1626;
                                }
                            } else {
                                int var10 = -class93.field2040 + var7;
                                class93.field2040 = var7;
                                int var11 = -class24.field407 + var8;
                                class24.field407 = var8;
                                if (class75.field1626 < 8 && ~var10 <= 31 && var10 <= 31 && var11 >= -32 && ~var11 >= -32) {
                                    var10 += 32;
                                    var11 += 32;
                                    class97.field2070.method217((class75.field1626 << 12) + (var10 << 6) - -var11, 769666216);
                                    class75.field1626 = 0;
                                } else if (~class75.field1626 > -9) {
                                    class97.field2070.method211((byte) -48, (class75.field1626 << 19) + 8388608 + var9);
                                    class75.field1626 = 0;
                                } else {
                                    class97.field2070.method248((class75.field1626 << 19) + var9 + -1073741824, -2147393384);
                                    class75.field1626 = 0;
                                }
                            }
                        }
                        class97.field2070.method254(-128, -var5 + class97.field2070.field482);
                        if (var4 < class51.field1095.field2181) {
                            class51.field1095.field2181 -= var4;
                            for (int var12 = 0; ~class51.field1095.field2181 < ~var12; ++var12) {
                                class51.field1095.field2182[var12] = class51.field1095.field2182[var4 + var12];
                                class51.field1095.field2184[var12] = class51.field1095.field2184[var4 + var12];
                            }
                        } else {
                            class51.field1095.field2181 = 0;
                        }
                    }
                }
                if (~class105.field2225 != -1) {
                    long var13 = (class1.field19 - class6.field101) / 50L;
                    ++class27.field500;
                    if (var13 > 4095L) {
                        var13 = 4095L;
                    }
                    class6.field101 = class1.field19;
                    byte var15 = 0;
                    int var16 = class109.field2367;
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 502) {
                        var16 = 502;
                    }
                    if (~class105.field2225 == -3) {
                        var15 = 1;
                    }
                    int var17 = class128.field2820;
                    int var18 = (int) var13;
                    class97.field2070.method979(1, 55);
                    if (~var17 <= -1) {
                        if (var17 > 764) {
                            var17 = 764;
                        }
                    } else {
                        var17 = 0;
                    }
                    int var19 = var16 * 765 + var17;
                    class97.field2070.method220(12470, (var15 << 19) + (var18 << 20) + var19);
                }
                if (~class1.field14 < -1) {
                    --class1.field14;
                }
                if (class119.field2631[96] || class119.field2631[97] || class119.field2631[98] || class119.field2631[99]) {
                    class73.field1543 = true;
                }
                if (class73.field1543 && class1.field14 <= 0) {
                    class1.field14 = 20;
                    class73.field1543 = false;
                    class97.field2070.method979(1, 2);
                    class97.field2070.method230(-67, class79.field1680);
                    ++class37.field724;
                    class97.field2070.method243(class112.field2425, -1);
                }
                if (class116.field2513 && !class14.field248) {
                    class14.field248 = true;
                    class97.field2070.method979(1, 99);
                    ++class62.field1286;
                    class97.field2070.method226(-9646, 1);
                }
                if (!class116.field2513 && class14.field248) {
                    ++class62.field1286;
                    class14.field248 = false;
                    class97.field2070.method979(1, 99);
                    class97.field2070.method226(-9646, 0);
                }
                class93.method720(true);
                if (class51.field1088 == 30 || ~class51.field1088 == -36) {
                    class86.method680(true);
                    class42.method363((byte) -122);
                    ++class8.field145;
                    if (arg0 >= 15) {
                        if (class8.field145 > 750) {
                            class40.method357(-19030);
                        } else {
                            class84.method667((byte) -118);
                            class88.method698(0);
                            class3.method9(-31470);
                            ++class54.field1126;
                            if (~class54.field1128 != -1) {
                                class120.field2674 += 20;
                                if (class120.field2674 >= 400) {
                                    class54.field1128 = 0;
                                }
                            }
                            if (~class26.field444 != -1) {
                                ++class35.field700;
                                if (~class35.field700 <= -16) {
                                    if (~class26.field444 == -4) {
                                        class85.field1927 = true;
                                    }
                                    if (class26.field444 == 2) {
                                        class39.field798 = true;
                                    }
                                    class26.field444 = 0;
                                }
                            }
                            if (class107.field2268 != 0) {
                                ++class1.field20;
                                if (~class38.field748 < ~(class15.field281 - -5) || class15.field281 + -5 > class38.field748 || ~class119.field2644 < ~(class75.field1560 - -5) || class75.field1560 + -5 > class119.field2644) {
                                    class84.field1880 = true;
                                }
                                if (field2414 == 0) {
                                    if (~class107.field2268 == -3) {
                                        class39.field798 = true;
                                    }
                                    if (class107.field2268 == 3) {
                                        class85.field1927 = true;
                                    }
                                    class107.field2268 = 0;
                                    if (class84.field1880 && ~class1.field20 <= -6) {
                                        class80.field1721 = -1;
                                        class25.method189(-127);
                                        if (class97.field2064 == class80.field1721 && ~class21.field391 != ~class114.field2488) {
                                            ++class45.field959;
                                            byte var20 = 0;
                                            class75 var21 = class99.method752(class97.field2064, 694);
                                            if (class6.field123 == 1 && var21.field1624 == 206) {
                                                var20 = 1;
                                            }
                                            if (var21.field1614[class21.field391] <= 0) {
                                                var20 = 0;
                                            }
                                            if (var21.field1563) {
                                                int var22 = class114.field2488;
                                                int var23 = class21.field391;
                                                var21.field1614[var23] = var21.field1614[var22];
                                                var21.field1576[var23] = var21.field1576[var22];
                                                var21.field1614[var22] = -1;
                                                var21.field1576[var22] = 0;
                                            } else if (~var20 != -2) {
                                                var21.method557(class21.field391, true, class114.field2488);
                                            } else {
                                                int var24 = class21.field391;
                                                int var25 = class114.field2488;
                                                while (~var24 != ~var25) {
                                                    if (var24 < var25) {
                                                        var21.method557(var25 + -1, true, var25);
                                                        --var25;
                                                    } else if (~var24 < ~var25) {
                                                        var21.method557(var25 + 1, true, var25);
                                                        ++var25;
                                                    }
                                                }
                                            }
                                            class97.field2070.method979(1, 125);
                                            class97.field2070.method243(class114.field2488, -1);
                                            class97.field2070.method234(class21.field391, -3420);
                                            class97.field2070.method220(12470, class97.field2064);
                                            class97.field2070.method239(false, var20);
                                        }
                                    } else if ((~class11.field224 == -2 || class41.method360(class40.field805 + -1, (byte) -7)) && ~class40.field805 < -3) {
                                        class35.method328(false);
                                    } else if (~class40.field805 < -1) {
                                        class115.method883((byte) -107, class40.field805 + -1);
                                    }
                                    class105.field2225 = 0;
                                    class35.field700 = 10;
                                }
                            }
                            if (class108.field2307 != -1) {
                                int var26 = class108.field2300;
                                int var27 = class108.field2307;
                                boolean var28 = class101.method761(var26, (byte) 117, 0, class107.field2271.field1374[0], 0, 0, 0, true, 0, class107.field2271.field1436[0], 0, var27);
                                class108.field2307 = -1;
                                if (var28) {
                                    class74.field1553 = class128.field2820;
                                    class54.field1128 = 1;
                                    class120.field2674 = 0;
                                    class122.field2717 = class109.field2367;
                                }
                            }
                            if (~class105.field2225 == -2 && class19.field339 != null) {
                                class105.field2225 = 0;
                                class85.field1927 = true;
                                class19.field339 = null;
                            }
                            class75.method563(-24);
                            if (~class103.field2165 == 0) {
                                class105.method781((byte) -85);
                                class99.method749(false);
                                class97.method743((byte) 83);
                            }
                            if (field2414 == 1 || ~class105.field2225 == -2) {
                                ++class65.field1444;
                            }
                            if (class69.field1477 == -1 && ~class115.field2509 == 0 && ~class48.field1003 == 0) {
                                if (~class78.field1647 < -1) {
                                    --class78.field1647;
                                }
                            } else if (class78.field1647 < 100) {
                                ++class78.field1647;
                                if (class78.field1647 == 100) {
                                    if (class115.field2509 != -1) {
                                        class39.field798 = true;
                                    }
                                    if (class69.field1477 != -1) {
                                        class85.field1927 = true;
                                    }
                                }
                            }
                            class21.method168((byte) -125);
                            if (class8.field159) {
                                class101.method760(1000);
                            }
                            for (int var29 = 0; ~var29 > -6; ++var29) {
                                int var10002 = class93.field2031[var29]++;
                            }
                            class127.method983(1);
                            int var30 = class40.method354(22987);
                            int var31 = class89.method708((byte) 119);
                            if (~var30 < -4501 && ~var31 < -4501) {
                                class79.field1686 = 250;
                                ++class106.field2248;
                                class44.method387(4000, (byte) 80);
                                class97.field2070.method979(1, 247);
                            }
                            ++class110.field2388;
                            ++class35.field694;
                            ++class101.field2157;
                            if (class35.field694 > 500) {
                                class35.field694 = 0;
                                int var32 = (int) (8.0D * Math.random());
                                if ((4 & var32) == 4) {
                                    class11.field219 += class65.field1413;
                                }
                                if (~(1 & var32) == -2) {
                                    class125.field2777 += class84.field1901;
                                }
                                if (~(2 & var32) == -3) {
                                    class117.field2568 += class31.field618;
                                }
                            }
                            if (~class101.field2157 < -501) {
                                class101.field2157 = 0;
                                int var33 = (int) (Math.random() * 8.0D);
                                if ((2 & var33) == 2) {
                                    class17.field302 += class40.field806;
                                }
                                if (~(var33 & 1) == -2) {
                                    class103.field2176 += class40.field814;
                                }
                            }
                            if (class17.field302 < -20) {
                                class40.field806 = 1;
                            }
                            if (class11.field219 < -40) {
                                class65.field1413 = 1;
                            }
                            if (~class103.field2176 > 59) {
                                class40.field814 = 2;
                            }
                            if (~class103.field2176 < -61) {
                                class40.field814 = -2;
                            }
                            if (class125.field2777 < -50) {
                                class84.field1901 = 2;
                            }
                            if (class117.field2568 < -55) {
                                class31.field618 = 2;
                            }
                            if (~class125.field2777 < -51) {
                                class84.field1901 = -2;
                            }
                            if (~class17.field302 < -11) {
                                class40.field806 = -1;
                            }
                            if (~class11.field219 < -41) {
                                class65.field1413 = -1;
                            }
                            if (class117.field2568 > 55) {
                                class31.field618 = -2;
                            }
                            if (~class110.field2388 < -51) {
                                class97.field2070.method979(1, 217);
                                ++class78.field1654;
                            }
                            try {
                                if (class82.field1764 != null && class97.field2070.field482 > 0) {
                                    class82.field1764.method396(class97.field2070.field502, class97.field2070.field482, 0, true);
                                    class97.field2070.field482 = 0;
                                    class110.field2388 = 0;
                                }
                            } catch (IOException var34) {
                                class40.method357(-19030);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 589)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2403;
        return this.field2406 == arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILjava/awt/Component;I)V", line = 602)
    public final void method704(int arg0, int arg1, Component arg2, int arg3) {
        if (arg1 > -88) {
            method862((class118) null, false);
        }
        super.field2014 = arg3;
        ++field2389;
        super.field2015 = new int[arg0 * arg3 + 1];
        super.field2008 = arg0;
        this.field2395 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2005 = arg2.createImage(this);
        this.method860(-87);
        arg2.prepareImage(super.field2005, this);
        this.method860(-83);
        arg2.prepareImage(super.field2005, this);
        this.method860(-81);
        arg2.prepareImage(super.field2005, this);
        this.method707(-124);
    }

    @OriginalMember(owner = "client!tb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 633)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2406 = arg0;
        arg0.setDimensions(super.field2008, super.field2014);
        ++field2399;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2395);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 645)
    public static final void method859(int arg0) {
        ++field2396;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
        System.exit(1);
        if (arg0 != 12726) {
            method863(8, -42, (class118) null, 117);
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 659)
    private final synchronized void method860(int arg0) {
        if (arg0 >= -68) {
            method861((byte) 115);
        }
        ++field2394;
        if (this.field2406 != null) {
            this.field2406.setPixels(0, 0, super.field2008, super.field2014, this.field2395, super.field2015, 0, super.field2008);
            this.field2406.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 675)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2413;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 691)
    public final void method705(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method860(-85);
        ++field2405;
        if (arg0 == 0) {
            arg1.drawImage(super.field2005, arg2, arg3, this);
        }
    }

    @OriginalMember(owner = "client!tb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 711)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2415;
        if (this.field2406 == arg0) {
            this.field2406 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 733)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2401;
    }

    @OriginalMember(owner = "client!tb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 748)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2397;
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 761)
    public static void method861(byte arg0) {
        field2393 = null;
        field2404 = null;
        field2409 = null;
        field2402 = null;
        field2407 = null;
        field2412 = null;
        if (arg0 > -36) {
            method858(29);
        }
        field2419 = null;
        field2416 = null;
        field2418 = null;
        field2398 = null;
        field2410 = null;
        field2391 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lud;Z)V", line = 783)
    public static final void method862(class118 arg0, boolean arg1) {
        ++field2392;
        class33.field663 = arg0;
        if (!arg1) {
            class69.field1483 = class33.field663.method917(16, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILud;I)Z", line = 795)
    public static final boolean method863(int arg0, int arg1, class118 arg2, int arg3) {
        ++field2400;
        byte[] var4 = arg2.method909((byte) -126, arg0, arg3);
        if (var4 == null) {
            return false;
        } else {
            if (arg1 != -29446) {
                method862((class118) null, true);
            }
            class105.method779(0, var4);
            return true;
        }
    }
}
