import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lv;")
    private class120 field1724 = new class120();

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lva;")
    private static class121 field1720 = class107.method797("Username: ", -10983);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lva;")
    public static class121 field1719 = class107.method797("@gr2@", -10983);

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lva;")
    private static class121 field1731 = class107.method797("Friends", -10983);

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
    public static boolean field1723 = false;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lva;")
    public static class121 field1737 = class107.method797("scape main", -10983);

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lva;")
    public static class121 field1733 = field1731;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lva;")
    public static class121 field1734 = field1720;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lbe;")
    public static class12 field1721;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lm;")
    public static class72 field1736;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
    public static int[] field1732;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[Lbc;")
    public static class10[] field1722;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I", line = 10)
    public static final int method517(int arg0, int arg1, int arg2) {
        field1738++;
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 != 18963) {
            method522((byte) 114);
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lv;I)V", line = 45)
    public final void method518(class120 arg0, int arg1) {
        if (arg0.field2772 != null) {
            arg0.method926(true);
        }
        arg0.field2770 = this.field1724.field2770;
        arg0.field2772 = this.field1724;
        arg0.field2772.field2770 = arg0;
        if (arg1 == 4) {
            arg0.field2770.field2772 = arg0;
            field1727++;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lv;", line = 64)
    public final class120 method519(int arg0) {
        if (arg0 == 0) {
            field1729++;
            class120 var2 = this.field1724.field2770;
            return this.field1724 == var2 ? null : var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 514)
    public class75() {
        this.field1724.field2772 = this.field1724;
        this.field1724.field2770 = this.field1724;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 97)
    public static void method520(int arg0) {
        field1737 = null;
        field1736 = null;
        if (arg0 != 10227) {
            method522((byte) 44);
        }
        field1721 = null;
        field1732 = null;
        field1719 = null;
        field1731 = null;
        field1734 = null;
        field1722 = null;
        field1733 = null;
        field1720 = null;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 117)
    public static final void method521(int arg0) {
        field1725++;
        try {
            if (class120.field2765 == 0) {
                class40.field899 = null;
                class119.field2740 = null;
                class120.field2765 = 1;
                field1723 = false;
                class82.field1915 = 0;
            }
            if (class120.field2765 == 1) {
                if (class40.field899 == null) {
                    class40.field899 = class1.field18.method783(class114.field2593, (byte) 120);
                }
                if (class40.field899.field795 == 2) {
                    throw new IOException();
                }
                if (class40.field899.field795 == 1) {
                    class119.field2740 = new class44((Socket) class40.field899.field800, class1.field18);
                    class120.field2765 = 2;
                    class40.field899 = null;
                }
            }
            if (class120.field2765 == 2) {
                long var1 = class56.field1312 = class18.field365.method932(122);
                class60.field1437.field2507 = 0;
                class60.field1437.method836(0, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class60.field1437.method836(0, var3);
                class119.field2740.method296(class60.field1437.field2512, 2, 0, true);
                class120.field2765 = 3;
                class66.field1578.field2507 = 0;
            }
            if (class120.field2765 == 3) {
                int var4 = class119.field2740.method295(5000);
                if (var4 != 0) {
                    class107.method798(103, var4);
                    return;
                }
                class120.field2765 = 4;
                class66.field1578.field2507 = 0;
            }
            if (class120.field2765 == 4) {
                if (class66.field1578.field2507 < 8) {
                    int var5 = class119.field2740.method291(false);
                    if (var5 > 8 - class66.field1578.field2507) {
                        var5 = 8 - class66.field1578.field2507;
                    }
                    if (var5 > 0) {
                        class119.field2740.method292((byte) 32, var5, class66.field1578.field2512, class66.field1578.field2507);
                        class66.field1578.field2507 += var5;
                    }
                }
                if (class66.field1578.field2507 == 8) {
                    class66.field1578.field2507 = 0;
                    class59.field1394 = class66.field1578.method854(123);
                    class120.field2765 = 5;
                }
            }
            if (class120.field2765 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class59.field1394 >> 32), (int) class59.field1394 };
                class60.field1437.field2507 = 0;
                class60.field1437.method836(0, 10);
                class60.field1437.method867((byte) -66, var6[0]);
                class60.field1437.method867((byte) -66, var6[1]);
                class60.field1437.method867((byte) -66, var6[2]);
                class60.field1437.method867((byte) -66, var6[3]);
                class60.field1437.method867((byte) -66, class1.field18.field2422);
                class60.field1437.method835(false, class18.field365.method932(109));
                class60.field1437.method826(class18.field406, (byte) -112);
                class60.field1437.method858(class33.field809, class100.field2219, (byte) -29);
                class52.field1208.field2507 = 0;
                if (class14.field253 == 40) {
                    class52.field1208.method836(0, 18);
                } else {
                    class52.field1208.method836(0, 16);
                }
                class52.field1208.method836(0, class60.field1437.field2507 + 53);
                class52.field1208.method867((byte) -66, 414);
                class52.field1208.method836(0, class38.field879 ? 1 : 0);
                class52.field1208.method867((byte) -66, class60.field1435.field1111);
                class52.field1208.method867((byte) -66, class12.field199.field1111);
                class52.field1208.method867((byte) -66, class33.field807.field1111);
                class52.field1208.method867((byte) -66, class43.field990.field1111);
                class52.field1208.method867((byte) -66, class125.field2844.field1111);
                class52.field1208.method867((byte) -66, class69.field1665.field1111);
                class52.field1208.method867((byte) -66, class128.field2956.field1111);
                class52.field1208.method867((byte) -66, class126.field2882.field1111);
                class52.field1208.method867((byte) -66, field1721.field1111);
                class52.field1208.method867((byte) -66, class25.field644.field1111);
                class52.field1208.method867((byte) -66, class128.field2936.field1111);
                class52.field1208.method867((byte) -66, class119.field2756.field1111);
                class52.field1208.method868(-8366, class60.field1437.field2512, class60.field1437.field2507, 0);
                class119.field2740.method296(class52.field1208.field2512, class52.field1208.field2507, 0, true);
                class60.field1437.method627(var6, false);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class66.field1578.method627(var6, false);
                class120.field2765 = 6;
            }
            if (class120.field2765 == 6 && class119.field2740.method291(false) > 0) {
                int var8 = class119.field2740.method295(5000);
                if (var8 == 21 && class14.field253 == 20) {
                    class120.field2765 = 7;
                } else if (var8 == 2) {
                    class120.field2765 = 9;
                } else if (var8 == 15 && class14.field253 == 40) {
                    class96.method649(false);
                    return;
                } else if (var8 == 23 && class45.field1056 < 1) {
                    class45.field1056++;
                    class120.field2765 = 0;
                } else {
                    class107.method798(65, var8);
                    return;
                }
            }
            if (class120.field2765 == 7 && class119.field2740.method291(false) > 0) {
                class67.field1619 = (class119.field2740.method295(5000) + 3) * 60;
                class120.field2765 = 8;
            }
            int var9 = 113 / ((67 - arg0) / 57);
            if (class120.field2765 == 8) {
                class82.field1915 = 0;
                class56.method410(class113.method866((byte) -128, new class121[] { class35.method242(class67.field1619 / 60, 10), class81.field1877 }), class1.field9, class97.field2176, -4774);
                if (--class67.field1619 <= 0) {
                    class120.field2765 = 0;
                }
            } else {
                if (class120.field2765 == 9 && class119.field2740.method291(false) >= 8) {
                    class54.field1257 = class119.field2740.method295(5000);
                    class59.field1413 = class119.field2740.method295(5000) == 1;
                    class101.field2257 = class119.field2740.method295(5000);
                    class101.field2257 <<= 0x8;
                    class101.field2257 += class119.field2740.method295(5000);
                    class85.field1967 = class119.field2740.method295(5000);
                    class119.field2740.method292((byte) 32, 1, class66.field1578.field2512, 0);
                    class66.field1578.field2507 = 0;
                    class116.field2640 = class66.field1578.method621(-65);
                    class119.field2740.method292((byte) 32, 2, class66.field1578.field2512, 0);
                    class66.field1578.field2507 = 0;
                    class5.field90 = class66.field1578.method870(-1);
                    class120.field2765 = 10;
                }
                if (class120.field2765 != 10) {
                    class82.field1915++;
                    if (class82.field1915 > 2000) {
                        if (class45.field1056 < 1) {
                            class45.field1056++;
                            if (class96.field2155 == class114.field2593) {
                                class114.field2593 = class22.field590;
                            } else {
                                class114.field2593 = class96.field2155;
                            }
                            class120.field2765 = 0;
                        } else {
                            class107.method798(69, -3);
                        }
                    }
                } else if (class119.field2740.method291(false) >= class5.field90) {
                    class66.field1578.field2507 = 0;
                    class119.field2740.method292((byte) 32, class5.field90, class66.field1578.field2512, 0);
                    class34.method239(0);
                    class60.field1448 = -1;
                    class27.method212(101, false);
                    class116.field2640 = -1;
                }
            }
        } catch (IOException var10) {
            if (class45.field1056 < 1) {
                if (class96.field2155 == class114.field2593) {
                    class114.field2593 = class22.field590;
                } else {
                    class114.field2593 = class96.field2155;
                }
                class120.field2765 = 0;
                class45.field1056++;
            } else {
                class107.method798(113, -2);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 417)
    public static final void method522(byte arg0) {
        class121.field2805.method347(true);
        field1735++;
        class33.field814.method347(true);
        class86.field1992.method347(true);
        class77.field1776.method347(true);
        int var1 = 17 % ((65 - arg0) / 36);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILv;)V", line = 436)
    public final void method523(int arg0, class120 arg1) {
        field1728++;
        if (arg1.field2772 != null) {
            arg1.method926(true);
        }
        arg1.field2772 = this.field1724.field2772;
        if (arg0 != 3) {
            this.method523(15, null);
        }
        arg1.field2770 = this.field1724;
        arg1.field2772.field2770 = arg1;
        arg1.field2770.field2772 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lv;", line = 459)
    public final class120 method524(int arg0) {
        if (arg0 >= -63) {
            this.method523(59, null);
        }
        field1726++;
        class120 var2 = this.field1724.field2770;
        if (this.field1724 == var2) {
            return null;
        } else {
            var2.method926(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)I", line = 479)
    public static final int method525(int arg0, int arg1, int arg2) {
        if (arg1 != -15225) {
            field1720 = null;
        }
        int var3 = class120.method929(arg2 + 45365, 4, arg0 + 91923, -20648) + (class120.method929(arg2 + 10294, 2, arg0 + 37821, -20648) - 128 >> 1) + (class120.method929(arg2, 1, arg0, arg1 ^ 0x6BDF) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        field1730++;
        return var4;
    }
}
