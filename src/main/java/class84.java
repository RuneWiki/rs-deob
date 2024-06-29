import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class84 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lvc;")
    public static class137 field1877 = class45.method325(":0", -46);

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lvc;")
    public static class137 field1889 = class45.method325("::noclip", -46);

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field1882 = 7759444;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lqa;")
    public static class105 field1894 = new class105(64);

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Lvc;")
    public static class137 field1898 = class45.method325("runes", -46);

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Lvc;")
    private static class137 field1901 = class45.method325("Loading interfaces )2 ", -46);

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lvc;")
    public static class137 field1902 = class45.method325("Bitte warten Sie eine Minute", -46);

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    private static int field1904 = 0;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lvc;")
    public static class137 field1905 = class45.method325("nicht hergestellt werden)3", -46);

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lvc;")
    public static class137 field1897 = field1901;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lrb;")
    public static class112 field1899 = new class112(32);

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Lvc;")
    public static class137 field1907 = class45.method325("@cr2@", -46);

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Lvc;")
    public static class137 field1908 = class45.method325("Entfernen", -46);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "Luc;")
    public static class131 field1906;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Loa;")
    public static class93 field1903;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "[[[B")
    public static byte[][][] field1896;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method609(boolean arg0) {
        field1888++;
        if (!arg0) {
            return;
        }
        if (field1904 == 0) {
            class10.field220 = new class74(4, 104, 104, class61.field1329);
            for (int var1 = 0; var1 < 4; var1++) {
                class131.field3046[var1] = new class59(104, 104);
            }
            class95.field2238 = new class138(512, 512);
            class67.field1389 = 5;
            class115.field2733 = class47.field1047;
            field1904 = 20;
        } else if (field1904 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class97.field2258[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class74.method529(var2, 500, 800, 512, 334);
            field1904 = 30;
            class67.field1389 = 10;
            class115.field2733 = class1.field15;
        } else if (field1904 == 30) {
            class21.field458 = class108.method785(0, (byte) 93, false, true, true);
            class105.field2431 = class108.method785(1, (byte) -52, false, true, true);
            class83.field1869 = class108.method785(2, (byte) -84, true, false, true);
            class71.field1494 = class108.method785(3, (byte) 76, false, true, true);
            class105.field2450 = class108.method785(4, (byte) 71, false, true, true);
            class22.field518 = class108.method785(5, (byte) 67, true, true, true);
            class23.field553 = class108.method785(6, (byte) 69, true, true, false);
            class98.field2285 = class108.method785(7, (byte) -102, false, true, true);
            class58.field1248 = class108.method785(8, (byte) 78, false, true, true);
            class75.field1699 = class108.method785(9, (byte) -107, false, true, true);
            class36.field793 = class108.method785(10, (byte) -99, false, true, true);
            class93.field2195 = class108.method785(11, (byte) 119, false, true, true);
            class6.field108 = class108.method785(12, (byte) -80, false, true, true);
            class38.field838 = class108.method785(13, (byte) -109, true, false, true);
            field1904 = 40;
            class67.field1389 = 20;
            class115.field2733 = class21.field428;
        } else if (field1904 == 40) {
            byte var7 = 0;
            int var8 = var7 + class21.field458.method282(-54) * 5 / 100;
            int var9 = var8 + class105.field2431.method282(-54) * 5 / 100;
            int var10 = var9 + class83.field1869.method282(-54) * 5 / 100;
            int var11 = var10 + class71.field1494.method282(-54) * 5 / 100;
            int var12 = var11 + class105.field2450.method282(-54) * 5 / 100;
            int var13 = var12 + class22.field518.method282(-54) * 5 / 100;
            int var14 = var13 + class23.field553.method282(-54) * 5 / 100;
            int var15 = var14 + class98.field2285.method282(-54) * 40 / 100;
            int var16 = var15 + class58.field1248.method282(-54) * 5 / 100;
            int var17 = var16 + class75.field1699.method282(-54) * 3 / 100;
            int var18 = var17 + class36.field793.method282(-54) * 5 / 100;
            int var19 = var18 + class93.field2195.method282(-54) * 5 / 100;
            int var20 = var19 + class6.field108.method282(-54) * 5 / 100;
            int var21 = var20 + class38.field838.method282(-54) * 2 / 100;
            if (var21 == 100) {
                class115.field2733 = class71.field1511;
                class67.field1389 = 30;
                field1904 = 45;
            } else {
                if (var21 != 0) {
                    class115.field2733 = class88.method666(127, new class137[] { class22.field519, class61.method435(var21, 84), class114.field2713 });
                }
                class67.field1389 = 30;
            }
        } else if (field1904 == 45) {
            class102.method747(0, class131.field3048, (byte) 122, !class25.field603);
            class23.field560 = class108.method789(class124.field2871, class131.field3048, false, 27473, 22050);
            class29.field654 = new class99(22050, class85.field2025);
            class115.field2733 = class100.field2326;
            field1904 = 50;
            class67.field1389 = 35;
        } else if (field1904 == 50) {
            int var22 = 0;
            if (class10.field206 == null) {
                class10.field206 = class78.method576(class58.field1248, class142.field3344, (byte) 94, class45.field999);
            } else {
                var22++;
            }
            if (class75.field1695 == null) {
                class75.field1695 = class78.method576(class58.field1248, class32.field692, (byte) 108, class45.field999);
            } else {
                var22++;
            }
            if (class42.field925 == null) {
                class42.field925 = class78.method576(class58.field1248, class121.field2825, (byte) 110, class45.field999);
            } else {
                var22++;
            }
            if (var22 < 3) {
                class115.field2733 = class88.method666(-33, new class137[] { class126.field2916, class61.method435(var22 * 100 / 3, 116), class114.field2713 });
                class67.field1389 = 40;
            } else {
                class115.field2733 = class125.field2886;
                field1904 = 60;
                class67.field1389 = 40;
            }
        } else if (field1904 == 60) {
            int var23 = class19.method167(false, class58.field1248, class36.field793);
            int var24 = class4.method26((byte) -35);
            if (var23 < var24) {
                class115.field2733 = class88.method666(122, new class137[] { class104.field2410, class61.method435(var23 * 100 / var24, 80), class114.field2713 });
                class67.field1389 = 50;
            } else {
                class115.field2733 = class99.field2316;
                class67.field1389 = 50;
                class33.method245(5, -100);
                field1904 = 70;
            }
        } else if (field1904 == 70) {
            if (class83.field1869.method662(true)) {
                class111.method861(class83.field1869, (byte) -107);
                class45.method331(-1, class83.field1869);
                class12.method79(true, class83.field1869, class98.field2285);
                class40.method291(false, class83.field1869, class98.field2285, class25.field603);
                class82.method600(1, class98.field2285, class83.field1869);
                class115.method893(10, class98.field2285, class10.field206, class73.field1559, class83.field1869);
                class77.method573(class21.field458, (byte) -90, class83.field1869, class105.field2431);
                class122.method920((byte) 89, class98.field2285, class83.field1869);
                class42.method296(11765, class83.field1869);
                class7.method41((byte) 66, class83.field1869);
                class114.method889(class71.field1494, class98.field2285, -123, class58.field1248);
                class37.method267(-31797, class83.field1869);
                class67.field1389 = 60;
                class115.field2733 = class68.field1397;
                field1904 = 80;
            } else {
                class115.field2733 = class88.method666(115, new class137[] { class58.field1232, class61.method435(class83.field1869.method287((byte) 59), 110), class114.field2713 });
                class67.field1389 = 60;
            }
        } else if (field1904 == 80) {
            int var25 = 0;
            if (class44.field965 == null) {
                class44.field965 = class98.method708(class45.field999, class107.field2483, class58.field1248, false);
            } else {
                var25++;
            }
            if (class102.field2366 == null) {
                class102.field2366 = class98.method708(class45.field999, class98.field2281, class58.field1248, !arg0);
            } else {
                var25++;
            }
            if (class80.field1829 == null) {
                class80.field1829 = class129.method961(class58.field1248, class45.field999, class32.field694, -78);
            } else {
                var25++;
            }
            if (class8.field180 == null) {
                class8.field180 = class40.method292(class58.field1248, class45.field999, class77.field1719, -12785);
            } else {
                var25++;
            }
            if (class32.field684 == null) {
                class32.field684 = class40.method292(class58.field1248, class45.field999, class77.field1710, -12785);
            } else {
                var25++;
            }
            if (class137.field3163 == null) {
                class137.field3163 = class40.method292(class58.field1248, class45.field999, class128.field3014, -12785);
            } else {
                var25++;
            }
            if (class108.field2523 == null) {
                class108.field2523 = class40.method292(class58.field1248, class45.field999, class34.field724, -12785);
            } else {
                var25++;
            }
            if (class88.field2113 == null) {
                class88.field2113 = class40.method292(class58.field1248, class45.field999, class92.field2173, -12785);
            } else {
                var25++;
            }
            if (class33.field699 == null) {
                class33.field699 = class98.method708(class45.field999, class102.field2357, class58.field1248, false);
            } else {
                var25++;
            }
            if (class11.field248 == null) {
                class11.field248 = class40.method292(class58.field1248, class45.field999, class123.field2857, -12785);
            } else {
                var25++;
            }
            if (class23.field563 == null) {
                class23.field563 = class40.method292(class58.field1248, class45.field999, class80.field1814, -12785);
            } else {
                var25++;
            }
            if (class12.field262 == null) {
                class12.field262 = class40.method292(class58.field1248, class45.field999, class23.field557, -12785);
            } else {
                var25++;
            }
            if (class30.field663 == null) {
                class30.field663 = class129.method961(class58.field1248, class45.field999, class122.field2839, -83);
            } else {
                var25++;
            }
            if (class86.field2047 == null) {
                class86.field2047 = class129.method961(class58.field1248, class45.field999, class95.field2243, -82);
            } else {
                var25++;
            }
            if (var25 < 14) {
                class115.field2733 = class88.method666(116, new class137[] { class80.field1818, class61.method435(var25 * 100 / 14, 115), class114.field2713 });
                class67.field1389 = 70;
            } else {
                class102.field2366.method1040();
                int var26 = (int) (Math.random() * 21.0D) - 10;
                int var27 = (int) (Math.random() * 41.0D) - 20;
                int var28 = (int) (Math.random() * 21.0D) - 10;
                int var29 = (int) (Math.random() * 21.0D) - 10;
                for (int var30 = 0; var30 < class8.field180.length; var30++) {
                    class8.field180[var30].method1052(var27 + var28, var27 + var29, var26 + var27);
                }
                class80.field1829[0].method395(var27 + var28, var27 + var29, var26 + var27);
                field1904 = 85;
                class115.field2733 = class71.field1509;
                class67.field1389 = 70;
            }
        } else if (field1904 == 85) {
            int var31 = class132.method965(class58.field1248, 0);
            int var32 = class8.method53(1);
            if (var32 > var31) {
                class115.field2733 = class88.method666(111, new class137[] { class114.field2699, class61.method435(var31 * 100 / var32, 111), class114.field2713 });
                class67.field1389 = 80;
            } else {
                field1904 = 90;
                class115.field2733 = class114.field2721;
                class67.field1389 = 80;
            }
        } else if (field1904 == 90) {
            if (class75.field1699.method662(true)) {
                class1 var33 = new class1(class75.field1699, class58.field1248, 20, 0.8D, class25.field603 ? 64 : 128);
                class97.method695(var33);
                class97.method692(0.8D);
                class67.field1389 = 90;
                class115.field2733 = class19.field403;
                field1904 = 110;
            } else {
                class115.field2733 = class88.method666(117, new class137[] { class142.field3343, class61.method435(class75.field1699.method287((byte) 69), 113), class114.field2713 });
                class67.field1389 = 90;
            }
        } else if (field1904 == 110) {
            class47.field1050 = new class19();
            class131.field3048.method358(class47.field1050, 10, 0);
            class67.field1389 = 94;
            field1904 = 120;
            class115.field2733 = class121.field2820;
        } else if (field1904 == 120) {
            if (class36.field793.method660(99, class40.field890, class45.field999)) {
                class36 var34 = new class36(class36.field793.method669(class45.field999, class40.field890, 1));
                class112.method868(0, var34);
                class115.field2733 = class142.field3345;
                class67.field1389 = 96;
                field1904 = 130;
            } else {
                class115.field2733 = class88.method666(121, new class137[] { class95.field2242, class70.field1472 });
                class67.field1389 = 96;
            }
        } else if (field1904 == 130) {
            if (!class71.field1494.method662(true)) {
                class115.field2733 = class88.method666(-11, new class137[] { field1897, class61.method435(class71.field1494.method287((byte) 62) * 4 / 5, 119), class114.field2713 });
                class67.field1389 = 100;
            } else if (!class6.field108.method662(true)) {
                class115.field2733 = class88.method666(-49, new class137[] { field1897, class61.method435(class6.field108.method287((byte) -125) / 6 + 80, 74), class114.field2713 });
                class67.field1389 = 100;
            } else if (class38.field838.method662(true)) {
                class67.field1389 = 100;
                class115.field2733 = class11.field233;
                field1904 = 140;
            } else {
                class115.field2733 = class88.method666(-119, new class137[] { field1897, class61.method435(class38.field838.method287((byte) 96) / 20 + 96, 97), class114.field2713 });
                class67.field1389 = 100;
            }
        } else if (field1904 == 140) {
            class33.method245(10, -124);
        }
    }

    @OriginalMember(owner = "client!md", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1884++;
        if (class48.field1071 != null) {
            class112.field2686 = 0;
            class78.field1748 = arg0.getX();
            class127.field2993 = arg0.getY();
            class129.field3018 = class60.method432(true);
            if (arg0.isMetaDown()) {
                client.field493 = 2;
                class12.field256 = 2;
            } else {
                client.field493 = 1;
                class12.field256 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!md", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class48.field1071 != null) {
            class112.field2686 = 0;
            class110.field2605 = arg0.getX();
            class78.field1736 = arg0.getY();
        }
        field1892++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method610(int arg0) {
        field1908 = null;
        field1898 = null;
        field1907 = null;
        field1877 = null;
        field1897 = null;
        field1899 = null;
        field1889 = null;
        field1902 = null;
        field1905 = null;
        field1901 = null;
        if (arg0 != 100) {
            field1877 = null;
        }
        field1903 = null;
        field1896 = null;
        field1894 = null;
        field1906 = null;
    }

    @OriginalMember(owner = "client!md", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class48.field1071 != null) {
            class12.field256 = 0;
        }
        field1879++;
    }

    @OriginalMember(owner = "client!md", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1895++;
    }

    @OriginalMember(owner = "client!md", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class48.field1071 != null) {
            class112.field2686 = 0;
            class110.field2605 = -1;
            class78.field1736 = -1;
        }
        field1893++;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method611(int arg0) {
        class25.field603 = false;
        class74.field1593 = false;
        field1880++;
        if (arg0 != 11) {
            field1894 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Component;Lnb;)V")
    public static final void method612(int arg0, Component arg1, class88 arg2) {
        field1890++;
        if (class7.field148) {
            return;
        }
        class48.field1081 = class99.method718(arg2, class106.field2479, class143.field3393, -27880);
        class72.field1522 = class99.method718(arg2, class12.field255, class143.field3393, -27880);
        class6.field121 = class99.method718(arg2, class2.field43, class143.field3393, -27880);
        class99.field2305 = class99.method718(arg2, class88.field2082, class143.field3393, -27880);
        class11.field222 = class99.method718(arg2, class89.field2130, class143.field3393, -27880);
        class59.field1272 = class99.method718(arg2, class142.field3356, class143.field3393, -27880);
        class28.field620 = class44.method311(479, -105, 96, arg1);
        class72.field1522.method394(0, 0);
        field1903 = class44.method311(172, -117, 156, arg1);
        class62.method451();
        class6.field121.method394(0, 0);
        class10.field208 = class44.method311(190, -121, 261, arg1);
        class48.field1081.method394(0, 0);
        class4.field104 = class44.method311(512, -105, 334, arg1);
        class62.method451();
        class93.field2213 = class44.method311(496, -109, 50, arg1);
        class21.field426 = class44.method311(269, -109, 37, arg1);
        class75.field1690 = class44.method311(249, arg0 - 7759548, 45, arg1);
        class138 var3 = class98.method708(class143.field3393, class48.field1082, arg2, false);
        class107.field2482 = class44.method311(var3.field3194, -119, var3.field3191, arg1);
        var3.method1057(0, 0);
        class138 var4 = class98.method708(class143.field3393, class109.field2554, arg2, false);
        class73.field1544 = class44.method311(var4.field3194, -127, var4.field3191, arg1);
        var4.method1057(0, 0);
        class138 var5 = class98.method708(class143.field3393, class39.field879, arg2, false);
        class49.field1104 = class44.method311(var5.field3194, -121, var5.field3191, arg1);
        var5.method1057(0, 0);
        class138 var6 = class98.method708(class143.field3393, class63.field1346, arg2, false);
        class13.field290 = class44.method311(var6.field3194, -113, var6.field3191, arg1);
        var6.method1057(0, 0);
        class138 var7 = class98.method708(class143.field3393, class104.field2417, arg2, false);
        class120.field2805 = class44.method311(var7.field3194, -121, var7.field3191, arg1);
        var7.method1057(0, 0);
        class138 var8 = class98.method708(class143.field3393, class109.field2570, arg2, false);
        class105.field2428 = class44.method311(var8.field3194, -104, var8.field3191, arg1);
        var8.method1057(0, 0);
        class138 var9 = class98.method708(class143.field3393, class60.field1293, arg2, false);
        class103.field2398 = class44.method311(var9.field3194, arg0 - 7759551, var9.field3191, arg1);
        var9.method1057(0, 0);
        class138 var10 = class98.method708(class143.field3393, class119.field2791, arg2, false);
        class19.field410 = class44.method311(var10.field3194, -120, var10.field3191, arg1);
        var10.method1057(0, 0);
        class138 var11 = class98.method708(class143.field3393, class132.field3063, arg2, false);
        class116.field2766 = class44.method311(var11.field3194, -120, var11.field3191, arg1);
        var11.method1057(0, 0);
        class105.field2427 = class99.method718(arg2, class63.field1339, class143.field3393, -27880);
        class43.field931 = class99.method718(arg2, class93.field2208, class143.field3393, -27880);
        client.field490 = class99.method718(arg2, class45.field1017, class143.field3393, -27880);
        class4.field105 = class105.field2427.method389();
        class4.field105.method391();
        class115.field2745 = class43.field931.method389();
        class115.field2745.method391();
        class95.field2244 = class105.field2427.method389();
        class95.field2244.method393();
        class92.field2178 = class43.field931.method389();
        class92.field2178.method393();
        class110.field2599 = client.field490.method389();
        class110.field2599.method393();
        class98.field2282 = class105.field2427.method389();
        class98.field2282.method391();
        class98.field2282.method393();
        class6.field115 = class43.field931.method389();
        class6.field115.method391();
        class6.field115.method393();
        class134.field3107 = class129.method961(arg2, class143.field3393, class78.field1734, arg0 ^ 0xFF8999FD);
        if (arg0 != 7759444) {
            method612(101, null, null);
        }
        class48.field1079 = new int[151];
        class91.field2157 = new int[33];
        class33.field707 = new int[151];
        class8.field186 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class6.field121.field1204[class6.field121.field1205 * var12 + var19] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class8.field186[var12] = var17;
            class91.field2157[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class6.field121.field1204[class6.field121.field1205 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class48.field1079[var13 - 5] = var14 - 25;
            class33.field707[var13 - 5] = var15 - var14;
        }
        class7.field148 = true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Z")
    public static final boolean method613(int arg0, int arg1) {
        if (arg0 != 0) {
            field1905 = null;
        }
        field1891++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!md", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class48.field1071 != null) {
            class112.field2686 = 0;
            class12.field256 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1887++;
    }

    @OriginalMember(owner = "client!md", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1883++;
        if (class48.field1071 != null) {
            class112.field2686 = 0;
            class110.field2605 = arg0.getX();
            class78.field1736 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!md", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1878++;
        if (class48.field1071 != null) {
            class112.field2686 = 0;
            class110.field2605 = arg0.getX();
            class78.field1736 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIII)V")
    public static final void method614(boolean arg0, int arg1, int arg2, int arg3) {
        field1886++;
        if (arg0) {
            method612(-38, null, null);
        }
        class85 var4 = class28.method223(arg3, 31229, arg1);
        if (var4 != null && var4.field1922 != null) {
            class63.method461(0, null, var4.field1922, 0, (byte) 90, 0, var4);
        }
        class13.field285 = arg1;
        class39.field865 = true;
        class29.field653 = arg2;
        class119.field2780 = arg3;
    }

    @OriginalMember(owner = "client!md", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1881++;
    }
}
