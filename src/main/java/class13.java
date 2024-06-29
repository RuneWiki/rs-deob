import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class13 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[Lpd;")
    public static class94[] field322 = new class94[100];

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[Lgb;")
    public static class38[] field328 = new class38[50];

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field324 = 0;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
    public static int[] field314 = new int[5];

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lpd;")
    public static class94 field327 = class28.method249(-122, "Handel)4Duell");

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lla;")
    public static class66 field319;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lmb;")
    public static class73 field317;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "[I")
    public static int[] field331;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ls;I)V", line = 8)
    public static final void method79(class111 arg0, int arg1) {
        if (arg1 != 0) {
            method79(null, -30);
        }
        class120.field2982 = arg0;
        field330++;
    }

    @OriginalMember(owner = "client!ca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 23)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class100.field2526 != null) {
            class107.field2665 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class86.field2196.length > var2) {
                var3 = class86.field2196[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class7.method40((byte) 63, arg0);
            }
            if (class6.field126 >= 0 && var3 >= 0) {
                class86.field2192[class6.field126] = var3;
                class6.field126 = class6.field126 + 1 & 0x7F;
                if (class80.field2048 == class6.field126) {
                    class6.field126 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class1.field14 + 1 & 0x7F;
                if (class43.field1081 != var5) {
                    class82.field2084[class1.field14] = var3;
                    class105.field2629[class1.field14] = var4;
                    class1.field14 = var5;
                }
            }
        }
        field318++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 84)
    public static void method80(byte arg0) {
        if (arg0 != 90) {
            return;
        }
        field328 = null;
        field331 = null;
        field319 = null;
        field322 = null;
        field317 = null;
        field327 = null;
        field314 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 109)
    public static final void method81(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field325++;
        try {
            if (class74.field1817 == 0) {
                if (class1.field47 != null) {
                    class1.field47.method636(1);
                    class1.field47 = null;
                }
                class67.field1651 = false;
                class74.field1817 = 1;
                field324 = 0;
                class25.field689 = null;
            }
            if (class74.field1817 == 1) {
                if (class25.field689 == null) {
                    class25.field689 = class112.field2832.method65(class64.field1588, 1);
                }
                if (class25.field689.field2944 == 2) {
                    throw new IOException();
                }
                if (class25.field689.field2944 == 1) {
                    class1.field47 = new class87((Socket) class25.field689.field2946, class112.field2832);
                    class25.field689 = null;
                    class74.field1817 = 2;
                }
            }
            if (class74.field1817 == 2) {
                long var1 = class94.field2404 = client.field499.method709((byte) 77);
                class107.field2670.field3047 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class107.field2670.method916(-2, 14);
                class107.field2670.method916(-2, var3);
                class1.field47.method639(class107.field2670.field3074, 1885, 2, 0);
                class74.field1817 = 3;
                class99.field2502.field3047 = 0;
            }
            if (class74.field1817 == 3) {
                int var4 = class1.field47.method641(0);
                if (var4 != 0) {
                    class89.method663(117, var4);
                    return;
                }
                class99.field2502.field3047 = 0;
                class74.field1817 = 4;
            }
            if (class74.field1817 == 4) {
                if (class99.field2502.field3047 < 8) {
                    int var5 = class1.field47.method637(1);
                    if (var5 > 8 - class99.field2502.field3047) {
                        var5 = 8 - class99.field2502.field3047;
                    }
                    if (var5 > 0) {
                        class1.field47.method642(arg0 - 24993, var5, class99.field2502.field3047, class99.field2502.field3074);
                        class99.field2502.field3047 += var5;
                    }
                }
                if (class99.field2502.field3047 == 8) {
                    class99.field2502.field3047 = 0;
                    class73.field1767 = class99.field2502.method918((byte) 1);
                    class74.field1817 = 5;
                }
            }
            if (class74.field1817 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class73.field1767 >> 32), (int) class73.field1767 };
                class107.field2670.field3047 = 0;
                class107.field2670.method916(-2, 10);
                class107.field2670.method917(var6[0], true);
                class107.field2670.method917(var6[1], true);
                class107.field2670.method917(var6[2], true);
                class107.field2670.method917(var6[3], true);
                class107.field2670.method917(class112.field2832.field286, true);
                class107.field2670.method965(-125, client.field499.method709((byte) 105));
                class107.field2670.method922(2, client.field491);
                class107.field2670.method955(arg0 - 6342, class117.field2935, class99.field2506);
                class20.field546.field3047 = 0;
                if (class115.field2922 == 40) {
                    class20.field546.method916(-2, 18);
                } else {
                    class20.field546.method916(arg0 - 2, 16);
                }
                class20.field546.method916(arg0 - 2, 57 - -class107.field2670.field3047);
                class20.field546.method917(440, true);
                class20.field546.method916(-2, class115.field2912 ? 1 : 0);
                class20.field546.method917(class95.field2445.field2766, true);
                class20.field546.method917(client.field486.field2766, true);
                class20.field546.method917(class9.field247.field2766, true);
                class20.field546.method917(class80.field2032.field2766, true);
                class20.field546.method917(class30.field867.field2766, true);
                class20.field546.method917(class8.field213.field2766, true);
                class20.field546.method917(class77.field1978.field2766, true);
                class20.field546.method917(class7.field149.field2766, true);
                class20.field546.method917(class95.field2448.field2766, true);
                class20.field546.method917(class120.field3014.field2766, true);
                class20.field546.method917(class126.field3168.field2766, true);
                class20.field546.method917(class115.field2919.field2766, true);
                class20.field546.method917(field317.field2766, true);
                class20.field546.method936(class107.field2670.field3074, class107.field2670.field3047, -120, 0);
                class1.field47.method639(class20.field546.field3074, arg0 + 1885, class20.field546.field3047, 0);
                class107.field2670.method324(var6, -22668);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class99.field2502.method324(var6, arg0 ^ 0xFFFFA774);
                class74.field1817 = 6;
            }
            if (class74.field1817 == 6 && class1.field47.method637(arg0 ^ 0x1) > 0) {
                int var8 = class1.field47.method641(0);
                if (var8 == 21 && class115.field2922 == 20) {
                    class74.field1817 = 7;
                } else if (var8 == 2) {
                    class74.field1817 = 9;
                } else if (var8 == 15 && class115.field2922 == 40) {
                    class19.method147((byte) -18);
                    return;
                } else if (var8 == 23 && class64.field1583 < 1) {
                    class74.field1817 = 0;
                    class64.field1583++;
                } else {
                    class89.method663(122, var8);
                    return;
                }
            }
            if (class74.field1817 == 7 && class1.field47.method637(1) > 0) {
                class51.field1266 = class1.field47.method641(0) * 60 + 180;
                class74.field1817 = 8;
            }
            if (class74.field1817 == 8) {
                field324 = 0;
                class108.method789((byte) 96, class123.field3129, class4.method20(new class94[] { class51.method403(class51.field1266 / 60, true), class99.field2515 }, true), class57.field1449);
                if (--class51.field1266 <= 0) {
                    class74.field1817 = 0;
                }
            } else {
                if (class74.field1817 == 9 && class1.field47.method637(1) >= 8) {
                    class73.field1784 = class1.field47.method641(0);
                    class74.field1814 = class1.field47.method641(0) == 1;
                    class30.field860 = class1.field47.method641(0);
                    class30.field860 <<= 0x8;
                    class30.field860 += class1.field47.method641(0);
                    class110.field2730 = class1.field47.method641(arg0);
                    class1.field47.method642(-24993, 1, 0, class99.field2502.field3074);
                    class99.field2502.field3047 = 0;
                    class90.field2336 = class99.field2502.method320(101);
                    class1.field47.method642(-24993, 2, 0, class99.field2502.field3074);
                    class99.field2502.field3047 = 0;
                    class95.field2443 = class99.field2502.method938((byte) 105);
                    class74.field1817 = 10;
                }
                if (class74.field1817 != 10) {
                    field324++;
                    if (field324 > 2000) {
                        if (class64.field1583 < 1) {
                            class64.field1583++;
                            if (class64.field1588 == class54.field1352) {
                                class64.field1588 = class63.field1525;
                            } else {
                                class64.field1588 = class54.field1352;
                            }
                            class74.field1817 = 0;
                        } else {
                            class89.method663(-78, -3);
                        }
                    }
                } else if (class1.field47.method637(1) >= class95.field2443) {
                    class99.field2502.field3047 = 0;
                    class1.field47.method642(-24993, class95.field2443, 0, class99.field2502.field3074);
                    class57.method457(false);
                    class19.field522 = -1;
                    class94.method712(false, true);
                    class90.field2336 = -1;
                }
            }
        } catch (IOException var9) {
            if (class64.field1583 < 1) {
                class64.field1583++;
                if (class64.field1588 == class54.field1352) {
                    class64.field1588 = class63.field1525;
                } else {
                    class64.field1588 = class54.field1352;
                }
                class74.field1817 = 0;
            } else {
                class89.method663(121, -2);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 437)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field321++;
        if (class100.field2526 != null) {
            class107.field2665 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class86.field2196.length > var2) {
                var3 = class86.field2196[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class6.field126 >= 0 && var3 >= 0) {
                class86.field2192[class6.field126] = ~var3;
                class6.field126 = class6.field126 + 1 & 0x7F;
                if (class80.field2048 == class6.field126) {
                    class6.field126 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 479)
    public final synchronized void focusLost(FocusEvent arg0) {
        field323++;
        if (class100.field2526 != null) {
            class6.field126 = -1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 492)
    public final void keyTyped(KeyEvent arg0) {
        field326++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 559)
    public final void focusGained(FocusEvent arg0) {
        field315++;
    }
}
