import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[J")
    public static long[] field1318 = new long[32];

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lr;")
    public static class118 field1314 = class153.method1136(102, "null");

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lr;")
    public static class118 field1328 = class153.method1136(99, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lr;")
    public static class118 field1312 = class153.method1136(86, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lr;")
    public static class118 field1324 = class153.method1136(81, "blinken1:");

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1322 = 0;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1316 = 0;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lr;")
    public static class118 field1321 = class153.method1136(89, "m");

    @OriginalMember(owner = "client!i", name = "x", descriptor = "Lr;")
    public static class118 field1334 = null;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lff;")
    public static class42 field1323;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
    public static int[] field1313;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "[[B")
    public static byte[][] field1335;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "[[I")
    public static int[][] field1337;

    @OriginalMember(owner = "client!i", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1320++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method498(int arg0) {
        field1321 = null;
        field1323 = null;
        if (arg0 != -26550) {
            field1335 = null;
        }
        field1313 = null;
        field1334 = null;
        field1328 = null;
        field1312 = null;
        field1324 = null;
        field1318 = null;
        field1335 = null;
        field1337 = null;
        field1314 = null;
    }

    @OriginalMember(owner = "client!i", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1329++;
        if (class4.field68 != null) {
            class69.field1614 = 0;
            class158.field3635 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method499(int arg0, int arg1) {
        field1327++;
        if (class65.field1486 == 0) {
            class131.field2991.method113(arg0, (byte) -20);
        } else {
            class69.field1593 = arg0;
        }
        if (arg1 != -9620) {
            field1334 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1315++;
        if (class4.field68 != null) {
            class69.field1614 = 0;
            class34.field853 = arg0.getX();
            class80.field1933 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method500(byte arg0) {
        field1330++;
        class88 var1 = (class88) class99.field2289.method889(-112);
        if (arg0 >= -116) {
            method502(34);
        }
        while (var1 != null) {
            if (class106.field2468 != var1.field2139 || var1.field2130) {
                var1.method768(-1);
            } else if (class65.field1479 >= var1.field2120) {
                var1.method710(class9.field212, 0);
                if (var1.field2130) {
                    var1.method768(-1);
                } else {
                    class68.field1583.method1191(var1.field2139, var1.field2122, var1.field2134, var1.field2129, 60, var1, 0, -1, false);
                }
            }
            var1 = (class88) class99.field2289.method884(true);
        }
    }

    @OriginalMember(owner = "client!i", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class4.field68 != null) {
            class69.field1614 = 0;
            class34.field853 = -1;
            class80.field1933 = -1;
        }
        field1326++;
    }

    @OriginalMember(owner = "client!i", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1325++;
        if (class4.field68 != null) {
            class69.field1614 = 0;
            class33.field837 = arg0.getX();
            class126.field2875 = arg0.getY();
            class32.field824 = class120.method945(20794);
            if (arg0.isMetaDown()) {
                class1.field11 = 2;
                class158.field3635 = 2;
            } else {
                class1.field11 = 1;
                class158.field3635 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!i", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class4.field68 != null) {
            class158.field3635 = 0;
        }
        field1319++;
    }

    @OriginalMember(owner = "client!i", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class4.field68 != null) {
            class69.field1614 = 0;
            class34.field853 = arg0.getX();
            class80.field1933 = arg0.getY();
        }
        field1331++;
    }

    @OriginalMember(owner = "client!i", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class4.field68 != null) {
            class69.field1614 = 0;
            class34.field853 = arg0.getX();
            class80.field1933 = arg0.getY();
        }
        field1317++;
    }

    @OriginalMember(owner = "client!i", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1333++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpa;Lvf;IZ)V")
    public static final void method501(class105 arg0, class152 arg1, int arg2, boolean arg3) {
        class103 var4 = new class103();
        var4.field2366 = arg0.method831((byte) 76);
        field1332++;
        var4.field2374 = arg0.method821((byte) 106);
        var4.field2373 = new int[var4.field2366];
        var4.field2376 = new int[var4.field2366];
        var4.field2386 = new int[var4.field2366];
        var4.field2385 = new class12[var4.field2366];
        var4.field2379 = new class12[var4.field2366];
        var4.field2382 = new byte[var4.field2366][][];
        if (arg3) {
            method502(127);
        }
        for (int var5 = 0; var5 < var4.field2366; var5++) {
            try {
                int var6 = arg0.method831((byte) 76);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var17 = 0;
                    String var18 = new String(arg0.method810(1347010600).method921(20377));
                    String var19 = new String(arg0.method810(1347010600).method921(20377));
                    if (var6 == 1) {
                        var17 = arg0.method821((byte) 95);
                    }
                    var4.field2386[var5] = var6;
                    var4.field2376[var5] = var17;
                    var4.field2379[var5] = arg1.method1130(class121.method956(var18, arg3), var19, -125);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method810(1347010600).method921(20377));
                    String var8 = new String(arg0.method810(1347010600).method921(20377));
                    int var9 = arg0.method831((byte) 76);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method810(1347010600).method921(20377));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method821((byte) 51);
                            var12[var13] = new byte[var14];
                            arg0.method809(-25066, var12[var13], 0, var14);
                        }
                    }
                    var4.field2386[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class121.method956(var10[var16], false);
                    }
                    var4.field2385[var5] = arg1.method1126(var15, -31554, class121.method956(var7, false), var8);
                    var4.field2382[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2373[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2373[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2373[var5] = -3;
            } catch (Exception var23) {
                var4.field2373[var5] = -4;
            } catch (Throwable var24) {
                var4.field2373[var5] = -5;
            }
        }
        class85.field2050.method883(var4, -26866);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static final void method502(int arg0) {
        field1336++;
        try {
            if (arg0 == -3) {
                if (class94.field2238 == 0) {
                    if (class127.field2915 != null) {
                        class127.field2915.method408((byte) 123);
                        class127.field2915 = null;
                    }
                    class153.field3470 = 0;
                    class92.field2197 = false;
                    class140.field3189 = null;
                    class94.field2238 = 1;
                }
                if (class94.field2238 == 1) {
                    if (class140.field3189 == null) {
                        class140.field3189 = class95.field2247.method1127(class33.field839, (byte) -128, class87.field2105);
                    }
                    if (class140.field3189.field268 == 2) {
                        throw new IOException();
                    }
                    if (class140.field3189.field268 == 1) {
                        class127.field2915 = new class48((Socket) class140.field3189.field269, class95.field2247);
                        class140.field3189 = null;
                        class94.field2238 = 2;
                    }
                }
                if (class94.field2238 == 2) {
                    long var1 = class34.field852 = class132.field3022.method925(arg0 + 3);
                    class1.field22.field2404 = 0;
                    class1.field22.method800(arg0 ^ 0xFFFFFF86, 14);
                    int var3 = (int) (var1 >> 16 & 0x1FL);
                    class1.field22.method800(arg0 ^ 0xFFFFFF86, var3);
                    class127.field2915.method409((byte) -100, class1.field22.field2405, 0, 2);
                    class94.field2238 = 3;
                    class53.field1253.field2404 = 0;
                }
                if (class94.field2238 == 3) {
                    if (class47.field1134 != null) {
                        class47.field1134.method373(arg0 + 17179);
                    }
                    if (class127.field2902 != null) {
                        class127.field2902.method373(17176);
                    }
                    int var4 = class127.field2915.method400(-71);
                    if (class47.field1134 != null) {
                        class47.field1134.method373(17176);
                    }
                    if (class127.field2902 != null) {
                        class127.field2902.method373(17176);
                    }
                    if (var4 != 0) {
                        class74.method626(var4, arg0 ^ 0x3);
                        return;
                    }
                    class53.field1253.field2404 = 0;
                    class94.field2238 = 4;
                }
                if (class94.field2238 == 4) {
                    if (class53.field1253.field2404 < 8) {
                        int var5 = class127.field2915.method406(-121);
                        if (8 - class53.field1253.field2404 < var5) {
                            var5 = 8 - class53.field1253.field2404;
                        }
                        if (var5 > 0) {
                            class127.field2915.method402(class53.field1253.field2405, class53.field1253.field2404, (byte) -62, var5);
                            class53.field1253.field2404 += var5;
                        }
                    }
                    if (class53.field1253.field2404 == 8) {
                        class53.field1253.field2404 = 0;
                        class92.field2200 = class53.field1253.method792(18352);
                        class94.field2238 = 5;
                    }
                }
                if (class94.field2238 == 5) {
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), 0, (int) class92.field2200 };
                    class1.field22.field2404 = 0;
                    var6[2] = (int) (class92.field2200 >> 32);
                    class1.field22.method800(-106, 10);
                    class1.field22.method811(var6[0], 2073135696);
                    class1.field22.method811(var6[1], 2073135696);
                    class1.field22.method811(var6[2], 2073135696);
                    class1.field22.method811(var6[3], 2073135696);
                    class1.field22.method824(class132.field3022.method925(0), true);
                    class1.field22.method843(class132.field3021, (byte) 123);
                    class1.field22.method795(arg0 ^ 0xFFFFFFFD, class134.field3048, class125.field2862);
                    class94.field2223.field2404 = 0;
                    if (class26.field631 == 40) {
                        class94.field2223.method800(16, 18);
                    } else {
                        class94.field2223.method800(arg0 - 104, 16);
                    }
                    class94.field2223.method800(58, class1.field22.field2404 + 93);
                    class94.field2223.method811(471, 2073135696);
                    class94.field2223.method800(-118, class68.field1582 ? 1 : 0);
                    class26.method233((byte) -33, class94.field2223);
                    class94.field2223.method811(class55.field1309.field1005, 2073135696);
                    class94.field2223.method811(class70.field1633.field1005, 2073135696);
                    class94.field2223.method811(class19.field470.field1005, 2073135696);
                    class94.field2223.method811(class4.field79.field1005, 2073135696);
                    class94.field2223.method811(class91.field2189.field1005, 2073135696);
                    class94.field2223.method811(class51.field1223.field1005, 2073135696);
                    class94.field2223.method811(class46.field1113.field1005, 2073135696);
                    class94.field2223.method811(class159.field3658.field1005, 2073135696);
                    class94.field2223.method811(class53.field1263.field1005, 2073135696);
                    class94.field2223.method811(class92.field2220.field1005, arg0 + 2073135699);
                    class94.field2223.method811(class55.field1305.field1005, 2073135696);
                    class94.field2223.method811(client.field518.field1005, 2073135696);
                    class94.field2223.method811(class142.field3221.field1005, 2073135696);
                    class94.field2223.method811(class159.field3664.field1005, 2073135696);
                    class94.field2223.method811(class71.field1664.field1005, 2073135696);
                    class94.field2223.method811(class85.field2091.field1005, 2073135696);
                    class94.field2223.method844(class1.field22.field2404, class1.field22.field2405, (byte) -14, 0);
                    class127.field2915.method409((byte) -100, class94.field2223.field2405, 0, class94.field2223.field2404);
                    class1.field22.method723(-1, var6);
                    for (int var7 = 0; var7 < 4; var7++) {
                        var6[var7] += 50;
                    }
                    class53.field1253.method723(-1, var6);
                    class94.field2238 = 6;
                }
                if (class94.field2238 == 6 && class127.field2915.method406(arg0 ^ 0x25) > 0) {
                    int var8 = class127.field2915.method400(123);
                    if (var8 == 21 && class26.field631 == 20) {
                        class94.field2238 = 7;
                    } else if (var8 == 2) {
                        class94.field2238 = 9;
                    } else if (var8 == 15 && class26.field631 == 40) {
                        class92.method741(arg0 ^ 0x2);
                        return;
                    } else if (var8 == 23 && class120.field2788 < 1) {
                        class94.field2238 = 0;
                        class120.field2788++;
                    } else {
                        class74.method626(var8, -2);
                        return;
                    }
                }
                if (class94.field2238 == 7 && class127.field2915.method406(-40) > 0) {
                    class85.field2087 = class127.field2915.method400(50) * 60 + 180;
                    class94.field2238 = 8;
                }
                if (class94.field2238 == 8) {
                    class153.field3470 = 0;
                    class26.method230(class144.method1066(true, new class118[] { class43.method359(class85.field2087 / 60, (byte) -122), class75.field1857 }), class4.field77, class85.field2089, true);
                    if (--class85.field2087 <= 0) {
                        class94.field2238 = 0;
                    }
                } else {
                    if (class94.field2238 == 9 && class127.field2915.method406(-74) >= 8) {
                        class48.field1170 = class127.field2915.method400(-75);
                        class141.field3203 = class127.field2915.method400(89) == 1;
                        class94.field2240 = class127.field2915.method400(arg0 ^ 0x3D);
                        class94.field2240 <<= 0x8;
                        class94.field2240 += class127.field2915.method400(49);
                        class44.field1053 = class127.field2915.method400(-112);
                        class127.field2915.method402(class53.field1253.field2405, 0, (byte) -62, 1);
                        class53.field1253.field2404 = 0;
                        class80.field1947 = class53.field1253.method724(255);
                        class127.field2915.method402(class53.field1253.field2405, 0, (byte) -62, 2);
                        class53.field1253.field2404 = 0;
                        class88.field2140 = class53.field1253.method838((byte) 5);
                        class94.field2238 = 10;
                    }
                    if (class94.field2238 != 10) {
                        class153.field3470++;
                        if (class153.field3470 > 2000) {
                            if (class120.field2788 < 1) {
                                class120.field2788++;
                                if (class87.field2105 == class126.field2897) {
                                    class87.field2105 = class151.field3420;
                                } else {
                                    class87.field2105 = class126.field2897;
                                }
                                class94.field2238 = 0;
                            } else {
                                class74.method626(-3, arg0 + 1);
                            }
                        }
                    } else if (class127.field2915.method406(arg0 - 89) >= class88.field2140) {
                        class53.field1253.field2404 = 0;
                        class127.field2915.method402(class53.field1253.field2405, 0, (byte) -62, class88.field2140);
                        class114.method896(false);
                        class126.field2896 = -1;
                        class158.method1227(false, 8);
                        class80.field1947 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class120.field2788 < 1) {
                class94.field2238 = 0;
                if (class87.field2105 == class126.field2897) {
                    class87.field2105 = class151.field3420;
                } else {
                    class87.field2105 = class126.field2897;
                }
                class120.field2788++;
            } else {
                class74.method626(-2, -2);
            }
        }
    }
}
