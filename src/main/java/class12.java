import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 {

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static volatile int field256 = 0;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lvc;")
    public static class137 field255 = class45.method325("chatback", -46);

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lvc;")
    public static class137 field261 = class45.method325("welle2:", -46);

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "[Lvc;")
    public static class137[] field274 = new class137[100];

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lvc;")
    private static class137 field271 = class45.method325("and choose the (Wcreate account(W", -46);

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lvc;")
    public static class137 field257 = field271;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field275 = 0;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lqa;")
    public static class105 field266 = new class105(64);

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Lvc;")
    private static class137 field276 = class45.method325("skill)2", -46);

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field277 = 127;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lvc;")
    public static class137 field278 = field276;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lnb;")
    public static class88 field253;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "[B")
    public static byte[] field273;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "[Lvd;")
    public static class138[] field262;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "[[I")
    public static int[][] field272;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIZI[B)V")
    public static final void method74(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        int var5 = 38 / ((arg0 - 36) / 50);
        field258++;
        if (class143.field3362 == null) {
            return;
        }
        if (class142.field3352 >= 0) {
            arg3 -= 20;
            if (arg3 < 1) {
                arg3 = 1;
            }
            class47.field1055 = arg3;
            if (class142.field3352 == 0) {
                class60.field1295 = 0;
            } else {
                int var6 = class28.method224(7470, class142.field3352);
                int var7 = var6 - field259;
                class60.field1295 = (var7 + arg3 + 3600 - 1) / arg3;
            }
            class121.field2816 = arg1;
            class127.field2999 = arg2;
            field273 = arg4;
        } else if (class47.field1055 == 0) {
            class107.method779((byte) 71, arg4, arg2, arg1);
        } else {
            class127.field2999 = arg2;
            field273 = arg4;
            class121.field2816 = arg1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)Z")
    public static final boolean method75(int arg0, byte arg1, int arg2) {
        field260++;
        int var3 = 85 / ((31 - arg1) / 34);
        if (arg0 == 0 && class44.field981 == arg2) {
            return true;
        } else if (arg0 == 1 && class48.field1086 == arg2) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class86.field2042 == arg2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method76(int arg0) {
        if (class86.field2058) {
            class86.field2058 = false;
            class70.method494((byte) -23);
            class21.field439 = true;
            class116.field2762 = true;
            class34.field737 = true;
            class80.field1825 = true;
        }
        class121.method912(false);
        field269++;
        if (class77.field1718 && class107.field2486 == 1) {
            class34.field737 = true;
        }
        if (arg0 != -25045) {
            return;
        }
        if (class112.field2670 != -1) {
            boolean var1 = class85.method628(class112.field2670, (byte) 108);
            if (var1) {
                class34.field737 = true;
            }
        }
        if (class58.field1249 == 2) {
            class34.field737 = true;
        }
        if (class89.field2134 == 2) {
            class34.field737 = true;
        }
        if (class34.field737) {
            class34.field737 = false;
            class132.method974(true);
        }
        if (class73.field1543 == -1) {
            class45.field1021.field1927 = class78.field1733 - class40.field912 - 77;
            if (class126.field2956 > 17 && class126.field2956 < 560 && class32.field693 > 332) {
                class112.method870(class45.field1021, 77, class78.field1733, 463, -1, class32.field693 - 357, (byte) -83, class126.field2956 - 17, 0);
            }
            int var2 = class78.field1733 - class45.field1021.field1927 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class78.field1733 - 77) {
                var2 = class78.field1733 - 77;
            }
            if (class40.field912 != var2) {
                class80.field1825 = true;
                class40.field912 = var2;
            }
        }
        if (class73.field1543 == -1 && class92.field2185 == 3) {
            class45.field1021.field1927 = class115.field2736;
            int var3 = class38.field847 * 14 + 7;
            if (class126.field2956 > 17 && class126.field2956 < 560 && class32.field693 > 332) {
                class112.method870(class45.field1021, 77, var3, 463, -1, class32.field693 - 357, (byte) -83, class126.field2956 - 17, 0);
            }
            int var4 = class45.field1021.field1927;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class115.field2736 != var4) {
                class115.field2736 = var4;
                class80.field1825 = true;
            }
        }
        if (class73.field1543 != -1) {
            boolean var5 = class85.method628(class73.field1543, (byte) 109);
            if (var5) {
                class80.field1825 = true;
            }
        }
        if (class58.field1249 == 3) {
            class80.field1825 = true;
        }
        if (class89.field2134 == 3) {
            class80.field1825 = true;
        }
        if (class58.field1247 != null) {
            class80.field1825 = true;
        }
        if (class77.field1718 && class107.field2486 == 2) {
            class80.field1825 = true;
        }
        if (class80.field1825) {
            class80.field1825 = false;
            class68.method485((byte) -49);
        }
        class39.method279(60);
        if (class82.field1843 != -1) {
            class21.field439 = true;
        }
        if (class21.field439) {
            if (class82.field1843 != -1 && class82.field1843 == class75.field1691) {
                class82.field1843 = -1;
                class46.field1028++;
                class72.field1527.method845(104, 100);
                class72.field1527.method837(arg0 + 25118, class75.field1691);
            }
            class21.field439 = false;
            class68.field1413 = true;
            class106.method771(class112.field2667 % 20 < 10 ? -1 : class82.field1843, 9, class112.field2670 == -1, class75.field1691, class32.field679);
        }
        if (class116.field2762) {
            class68.field1413 = true;
            class116.field2762 = false;
            class70.method493(class71.field1510, class110.field2606, class75.field1695, (byte) -79, class21.field453);
        }
        class4.method29(0, class104.field2412.field1646, class28.field627, class69.field1438, class104.field2412.field1672);
        class69.field1438 = 0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static void method77(int arg0) {
        field274 = null;
        field271 = null;
        field266 = null;
        field253 = null;
        field255 = null;
        field261 = null;
        field272 = null;
        field276 = null;
        if (arg0 != -77) {
            field275 = 81;
        }
        field257 = null;
        field273 = null;
        field278 = null;
        field262 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method78(Component arg0, byte arg1) {
        if (arg1 >= -21) {
            method78(null, (byte) 125);
        }
        field263++;
        arg0.removeMouseListener(class48.field1071);
        arg0.removeMouseMotionListener(class48.field1071);
        arg0.removeFocusListener(class48.field1071);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLnb;Lnb;)V")
    public static final void method79(boolean arg0, class88 arg1, class88 arg2) {
        class33.field700 = arg1;
        class70.field1480 = arg2;
        if (!arg0) {
            field257 = null;
        }
        class115.field2743 = class33.field700.method651(3, true);
        field254++;
    }
}
