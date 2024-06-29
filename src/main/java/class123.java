import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class123 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lqc;")
    public static class97 field2748 = new class97(64);

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Lo;")
    public static class84 field2758 = class15.method124("On", 255);

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field2756 = 0;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field2759 = -1;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lo;")
    public static class84 field2757 = class15.method124("Connection lost", 255);

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static volatile int field2763 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Lud;")
    public static class118 field2755;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Lfc;")
    public static class34 field2762;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lqb;")
    public static class96 field2752;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "[I")
    public static int[] field2761;

    @OriginalMember(owner = "client!vd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class99.field2104 != null) {
            class67.field1472 = 0;
            class118.field2615 = arg0.getX();
            class78.field1669 = arg0.getY();
        }
        field2750++;
    }

    @OriginalMember(owner = "client!vd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 21)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2742++;
        if (class99.field2104 != null) {
            class67.field1472 = 0;
            class118.field2615 = arg0.getX();
            class78.field1669 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lo;Lo;ILud;)Lvb;", line = 36)
    public static final class121 method958(class84 arg0, class84 arg1, int arg2, class118 arg3) {
        field2737++;
        int var4 = arg3.method921((byte) -18, arg0);
        int var5 = arg3.method913(false, arg1, var4);
        return arg2 > -47 ? null : class45.method397((byte) -127, arg3, var4, var5);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lcc;", line = 59)
    public static final class16 method959(Throwable arg0, String arg1) {
        field2739++;
        class16 var2;
        if (arg0 instanceof class16) {
            var2 = (class16) arg0;
            var2.field287 = var2.field287 + ' ' + arg1;
        } else {
            var2 = new class16(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 80)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2746++;
        if (class99.field2104 != null) {
            class67.field1472 = 0;
            class118.field2615 = -1;
            class78.field1669 = -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 101)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class99.field2104 != null) {
            class67.field1472 = 0;
            class45.field942 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2751++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILvb;II)V", line = 121)
    public static final void method960(int arg0, class121 arg1, int arg2, int arg3) {
        field2744++;
        int var4 = arg2 * arg2 + arg3 * arg3;
        if (var4 > 4225 && var4 < 90000) {
            int var5 = class79.field1680 + class103.field2176 & 0x7FF;
            int var6 = class83.field1835[var5];
            int var7 = var6 * 256 / (class17.field302 + 256);
            int var8 = class83.field1857[var5];
            int var9 = var8 * 256 / (class17.field302 + 256);
            int var10 = arg2 * var7 + arg3 * var9 >> 16;
            int var11 = arg2 * var9 - arg3 * var7 >> 16;
            double var12 = Math.atan2((double) var10, (double) var11);
            int var14 = (int) (Math.sin(var12) * 63.0D);
            int var15 = (int) (Math.cos(var12) * 57.0D);
            class125.field2776.method946(var14 + 94 + 4 - 10, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
        } else {
            class109.method847(arg3, -21346, arg1, arg2);
        }
        if (arg0 != 256) {
            method958(null, null, -55, null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 167)
    public static final void method961(byte arg0) {
        field2738++;
        if (class50.field1081 == 0) {
            class112.field2427 = new class108(4, 104, 104, class110.field2377);
            for (int var1 = 0; var1 < 4; var1++) {
                class93.field2034[var1] = new class33(104, 104);
            }
            class112.field2432 = new class121(512, 512);
            class117.field2571 = class73.field1525;
            class50.field1081 = 20;
            class113.field2458 = 5;
        } else if (class50.field1081 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = class7.field128[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class108.method808(var2, 500, 800, 512, 334);
            class50.field1081 = 25;
            class117.field2571 = class128.field2828;
            class113.field2458 = 10;
        } else {
            try {
                if (class50.field1081 == 25) {
                    if (class11.field220 != null && class78.field1666 != null && class78.field1666.method161(102) < 60000L) {
                        class38.field736 = new class15[5];
                        for (int var7 = 0; var7 < 5; var7++) {
                            class38.field736[var7] = new class15(var7 + 1, class11.field220, class40.field817[var7], 500000);
                        }
                        class21.field389 = new class15[12];
                        for (int var8 = 0; var8 < 12; var8++) {
                            class21.field389[var8] = new class15(var8, class78.field1666, class3.field40[var8], 500000);
                        }
                        class119.field2647 = 0;
                        class117.field2571 = class27.field526;
                        class113.field2458 = 15;
                        class50.field1081 = 26;
                        return;
                    }
                    class113.field2458 = 15;
                    class50.field1081 = 30;
                    class117.field2571 = class26.field459;
                    return;
                }
                if (class50.field1081 == 26) {
                    while (class119.field2647 < 65535) {
                        class33.method307(class38.field736[1], class21.field389[7], (byte) -28, class119.field2647++);
                        if ((class119.field2647 & 0xFF) == 0) {
                            class117.field2571 = class97.method746(0, new class84[] { class127.field2805, class62.method489(class119.field2647 * 100 / 65536, (byte) -124), class69.field1484 });
                            class113.field2458 = 15;
                            return;
                        }
                    }
                    class113.field2458 = 15;
                    class50.field1081 = 27;
                    class119.field2647 = 0;
                    class117.field2571 = class26.field456;
                    return;
                }
                if (class50.field1081 == 27) {
                    while (class119.field2647 < 65535) {
                        class33.method307(class38.field736[3], class21.field389[6], (byte) -43, class119.field2647++);
                        if ((class119.field2647 & 0xFF) == 0) {
                            class117.field2571 = class97.method746(0, new class84[] { class107.field2275, class62.method489(class119.field2647 * 100 / 65536, (byte) -124), class69.field1484 });
                            class113.field2458 = 15;
                            return;
                        }
                    }
                    class117.field2571 = class84.field1879;
                    class113.field2458 = 15;
                    class50.field1081 = 28;
                    class119.field2647 = 0;
                    return;
                }
                if (class50.field1081 == 28) {
                    while (class119.field2647 < 65535) {
                        class33.method307(class38.field736[4], class21.field389[5], (byte) -79, class119.field2647++);
                        if ((class119.field2647 & 0xFF) == 0) {
                            class117.field2571 = class97.method746(0, new class84[] { class104.field2189, class62.method489(class119.field2647 * 100 / 65536, (byte) -124), class69.field1484 });
                            class113.field2458 = 15;
                            return;
                        }
                    }
                    class50.field1081 = 30;
                    class117.field2571 = class80.field1714;
                    class113.field2458 = 15;
                    return;
                }
            } catch (Exception var35) {
                if (class50.field1081 < 30) {
                    class50.field1081 = 30;
                }
            }
            if (class50.field1081 == 30) {
                class50.field1076 = class84.method658(false, 0, (byte) 99, true, true);
                class106.field2244 = class84.method658(false, 1, (byte) 99, true, true);
                class6.field111 = class84.method658(true, 2, (byte) 99, true, false);
                class33.field641 = class84.method658(false, 3, (byte) 99, true, true);
                class41.field831 = class84.method658(false, 4, (byte) 99, true, true);
                class42.field867 = class84.method658(true, 5, (byte) 99, true, true);
                class104.field2197 = class84.method658(true, 6, (byte) 99, false, true);
                class31.field602 = class84.method658(false, 7, (byte) 99, true, true);
                class100.field2122 = class84.method658(false, 8, (byte) 99, true, true);
                class41.field828 = class84.method658(false, 9, (byte) 99, true, true);
                class99.field2108 = class84.method658(false, 10, (byte) 99, true, true);
                class86.field1970 = class84.method658(false, 11, (byte) 99, true, true);
                class117.field2571 = class119.field2651;
                class113.field2458 = 20;
                class50.field1081 = 40;
            } else if (class50.field1081 == 40) {
                byte var9 = 0;
                int var10 = var9 + class50.field1076.method27((byte) 107) * 5 / 100;
                int var11 = var10 + class106.field2244.method27((byte) 117) * 5 / 100;
                int var12 = var11 + class6.field111.method27((byte) 87) * 5 / 100;
                int var13 = var12 + class33.field641.method27((byte) 62) * 5 / 100;
                int var14 = var13 + class41.field831.method27((byte) 96) * 5 / 100;
                int var15 = var14 + class42.field867.method27((byte) 127) * 5 / 100;
                int var16 = var15 + class104.field2197.method27((byte) 68) * 5 / 100;
                int var17 = var16 + class31.field602.method27((byte) 41) * 45 / 100;
                int var18 = var17 + class100.field2122.method27((byte) 54) * 5 / 100;
                int var19 = var18 + class41.field828.method27((byte) 125) * 5 / 100;
                int var20 = var19 + class99.field2108.method27((byte) 83) * 5 / 100;
                int var21 = var20 + class86.field1970.method27((byte) 120) * 5 / 100;
                if (var21 == 100) {
                    class113.field2458 = 30;
                    class50.field1081 = 45;
                    class117.field2571 = class105.field2205;
                } else {
                    if (var21 != 0) {
                        class117.field2571 = class97.method746(0, new class84[] { class99.field2106, class62.method489(var21, (byte) -125), class69.field1484 });
                    }
                    class113.field2458 = 30;
                }
            } else if (class50.field1081 == 45) {
                class106.method786(true, 0, class118.field2627, !class1.field23);
                class107.field2284 = class44.method382(false, class118.field2627, class8.method61(-94));
                class12.field239 = new class109(22050, class14.field251);
                class113.field2458 = 35;
                class50.field1081 = 50;
                class117.field2571 = class112.field2438;
            } else if (class50.field1081 == 50) {
                int var22 = 0;
                if (class89.field2022 == null) {
                    class89.field2022 = class64.method499(class100.field2122, class73.field1524, class111.field2409, true);
                } else {
                    var22++;
                }
                if (field2762 == null) {
                    field2762 = class64.method499(class100.field2122, class73.field1524, class126.field2782, true);
                } else {
                    var22++;
                }
                if (class16.field291 == null) {
                    class16.field291 = class64.method499(class100.field2122, class73.field1524, class12.field232, true);
                } else {
                    var22++;
                }
                if (class49.field1020 == null) {
                    class49.field1020 = class64.method499(class100.field2122, class73.field1524, class93.field2036, true);
                } else {
                    var22++;
                }
                if (var22 < 4) {
                    class117.field2571 = class97.method746(0, new class84[] { class6.field120, class62.method489(var22 * 100 / 4, (byte) -126), class69.field1484 });
                    class113.field2458 = 40;
                } else {
                    class50.field1081 = 60;
                    class113.field2458 = 40;
                    class58.field1195 = new class34[] { class89.field2022, field2762, class16.field291, class49.field1020 };
                    class117.field2571 = class122.field2729;
                }
            } else if (class50.field1081 == 60) {
                int var23 = class120.method937(0, class100.field2122, class99.field2108);
                int var24 = class6.method40(31);
                if (var23 < var24) {
                    class117.field2571 = class97.method746(0, new class84[] { class71.field1509, class62.method489(var23 * 100 / var24, (byte) -128), class69.field1484 });
                    class113.field2458 = 50;
                } else {
                    class117.field2571 = class85.field1938;
                    class113.field2458 = 50;
                    class8.method63(5, false);
                    class50.field1081 = 70;
                }
            } else if (class50.field1081 == 70) {
                if (class6.field111.method919(true)) {
                    class118.method916(arg0 + 27552, class6.field111);
                    class6.method37(class6.field111, (byte) -70);
                    class38.method336(class31.field602, 3, class6.field111);
                    class114.method880(true, class1.field23, class31.field602, class6.field111);
                    method965(class6.field111, (byte) -94, class31.field602);
                    class127.method984(class31.field602, class6.field111, (byte) -123, class21.field390);
                    class115.method885(class106.field2244, arg0 + 15, class50.field1076, class6.field111);
                    class97.method741(class6.field111, class31.field602, -24414);
                    client.method146(class6.field111, 4);
                    class111.method862(class6.field111, false);
                    class110.method857(class100.field2122, class33.field641, (byte) -127, class31.field602);
                    class117.field2571 = class75.field1608;
                    class50.field1081 = 80;
                    class113.field2458 = 60;
                } else {
                    class117.field2571 = class97.method746(0, new class84[] { class89.field2024, class62.method489(class6.field111.method25((byte) 126), (byte) -124), class69.field1484 });
                    class113.field2458 = 60;
                }
            } else if (class50.field1081 == 80) {
                int var25 = 0;
                if (class15.field282 == null) {
                    class15.field282 = method958(class48.field1011, class73.field1524, -72, class100.field2122);
                } else {
                    var25++;
                }
                if (class125.field2776 == null) {
                    class125.field2776 = method958(class114.field2487, class73.field1524, -88, class100.field2122);
                } else {
                    var25++;
                }
                if (class65.field1446 == null) {
                    class65.field1446 = class5.method22(class100.field2122, class85.field1948, (byte) -58, class73.field1524);
                } else {
                    var25++;
                }
                if (class118.field2626 == null) {
                    class118.field2626 = class42.method364(0, class100.field2122, class115.field2508, class73.field1524);
                } else {
                    var25++;
                }
                if (class35.field702 == null) {
                    class35.field702 = class42.method364(0, class100.field2122, class118.field2605, class73.field1524);
                } else {
                    var25++;
                }
                if (class51.field1102 == null) {
                    class51.field1102 = class42.method364(0, class100.field2122, class107.field2288, class73.field1524);
                } else {
                    var25++;
                }
                if (class67.field1465 == null) {
                    class67.field1465 = class42.method364(0, class100.field2122, class71.field1508, class73.field1524);
                } else {
                    var25++;
                }
                if (class120.field2661 == null) {
                    class120.field2661 = class42.method364(0, class100.field2122, class116.field2533, class73.field1524);
                } else {
                    var25++;
                }
                if (class50.field1084 == null) {
                    class50.field1084 = method958(class118.field2599, class73.field1524, -72, class100.field2122);
                } else {
                    var25++;
                }
                if (class15.field276 == null) {
                    class15.field276 = class42.method364(0, class100.field2122, class80.field1695, class73.field1524);
                } else {
                    var25++;
                }
                if (class63.field1316 == null) {
                    class63.field1316 = class42.method364(0, class100.field2122, class51.field1096, class73.field1524);
                } else {
                    var25++;
                }
                if (class36.field709 == null) {
                    class36.field709 = class42.method364(0, class100.field2122, class126.field2788, class73.field1524);
                } else {
                    var25++;
                }
                if (class112.field2437 == null) {
                    class112.field2437 = class5.method22(class100.field2122, class114.field2471, (byte) -58, class73.field1524);
                } else {
                    var25++;
                }
                if (class82.field1770 == null) {
                    class82.field1770 = class5.method22(class100.field2122, class36.field708, (byte) -58, class73.field1524);
                } else {
                    var25++;
                }
                if (var25 < 14) {
                    class117.field2571 = class97.method746(0, new class84[] { class17.field317, class62.method489(var25 * 100 / 14, (byte) -126), class69.field1484 });
                    class113.field2458 = 70;
                } else {
                    class125.field2776.method943();
                    int var26 = (int) (Math.random() * 21.0D) - 10;
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    int var28 = (int) (Math.random() * 41.0D) - 20;
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    for (int var30 = 0; var30 < class118.field2626.length; var30++) {
                        class118.field2626[var30].method944(var26 + var28, var27 + var28, var28 + var29);
                    }
                    class65.field1446[0].method733(var26 + var28, var27 + var28, var29 + var28);
                    class117.field2571 = class75.field1580;
                    class50.field1081 = 85;
                    class113.field2458 = 70;
                }
            } else if (class50.field1081 == 85) {
                int var31 = class21.method169(class100.field2122, (byte) -79);
                int var32 = class11.method104((byte) -61);
                if (var32 > var31) {
                    class117.field2571 = class97.method746(0, new class84[] { class12.field228, class62.method489(var31 * 100 / var32, (byte) -128), class69.field1484 });
                    class113.field2458 = 80;
                } else {
                    class113.field2458 = 80;
                    class50.field1081 = 90;
                    class117.field2571 = class19.field347;
                }
            } else if (class50.field1081 == 90) {
                if (class41.field828.method919(true)) {
                    class26 var33 = new class26(class41.field828, class100.field2122, 20, 0.8D, class1.field23 ? 64 : 128);
                    class7.method49(var33);
                    class7.method44(0.8D);
                    class113.field2458 = 90;
                    class50.field1081 = 110;
                    class117.field2571 = class85.field1926;
                } else {
                    class117.field2571 = class97.method746(0, new class84[] { class88.field1982, class62.method489(class41.field828.method25((byte) 82), (byte) -124), class69.field1484 });
                    class113.field2458 = 90;
                }
            } else if (class50.field1081 == 110) {
                class51.field1095 = new class103();
                class118.field2627.method83(10, class51.field1095, (byte) 31);
                class113.field2458 = 94;
                class50.field1081 = 120;
                class117.field2571 = class27.field527;
            } else if (class50.field1081 == 120) {
                if (class99.field2108.method914(class73.field1524, 0, class25.field417)) {
                    class86 var34 = new class86(class99.field2108.method910(class25.field417, (byte) 112, class73.field1524));
                    class106.method783(var34, -123);
                    class50.field1081 = 130;
                    class117.field2571 = class75.field1619;
                    class113.field2458 = 96;
                } else {
                    class113.field2458 = 96;
                    class117.field2571 = class30.field585;
                }
            } else if (class50.field1081 == 130) {
                if (class33.field641.method919(true)) {
                    class113.field2458 = 100;
                    class50.field1081 = 140;
                    class117.field2571 = class85.field1943;
                } else {
                    class117.field2571 = class97.method746(0, new class84[] { class111.field2407, class62.method489(class33.field641.method25((byte) 86), (byte) -128), class69.field1484 });
                    class113.field2458 = 100;
                }
            } else if (class50.field1081 == 140) {
                class8.method63(10, false);
            } else if (arg0 != -15) {
                field2748 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 685)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class99.field2104 != null) {
            class67.field1472 = 0;
            class118.field2615 = arg0.getX();
            class78.field1669 = arg0.getY();
        }
        field2753++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 701)
    public static final void method962(int arg0, int arg1) {
        field2741++;
        if (!class128.method998(arg0, -20142)) {
            return;
        }
        if (arg1 >= -18) {
            method964(1, -61, -60, 107, -100, 41, 47);
        }
        class75[] var2 = class60.field1254[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class75 var4 = var2[var3];
            if (var4 != null) {
                var4.field1596 = 0;
                var4.field1556 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILke;)V", line = 734)
    public static final void method963(int arg0, int arg1, class65 arg2) {
        field2743++;
        if (arg1 >= 31) {
            class125.method968(arg0, arg2.field1380, arg2.field1391, -1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 747)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class99.field2104 != null) {
            class67.field1472 = 0;
            class60.field1259 = arg0.getX();
            field2763 = arg0.getY();
            class55.field1143 = System.currentTimeMillis();
            if (arg0.isMetaDown()) {
                class126.field2784 = 2;
                class45.field942 = 2;
            } else {
                class126.field2784 = 1;
                class45.field942 = 1;
            }
        }
        field2747++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)I", line = 776)
    public static final int method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg1;
            arg1 = var7;
        }
        int var8 = arg3 & 0x3;
        field2754++;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 8 - arg5 - arg0;
        } else {
            if (arg4 != -2091) {
                method962(-50, 0);
            }
            return 1 + 7 - arg1 - arg2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lud;BLud;)V", line = 808)
    private static final void method965(class118 arg0, byte arg1, class118 arg2) {
        field2740++;
        if (arg1 != -94) {
            field2755 = null;
        }
        field2755 = arg2;
        class40.field813 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 821)
    public final void mouseClicked(MouseEvent arg0) {
        field2745++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V", line = 832)
    public static void method966(byte arg0) {
        field2748 = null;
        field2762 = null;
        field2757 = null;
        field2758 = null;
        field2752 = null;
        field2755 = null;
        if (arg0 > -43) {
            field2763 = 111;
        }
        field2761 = null;
    }
}
