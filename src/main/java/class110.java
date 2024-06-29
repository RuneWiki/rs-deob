import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class110 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!r", name = "N", descriptor = "Z")
    private boolean field2569 = false;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lrd;")
    public static class114 field2540 = class84.method656("Ung-Ultiges Anmelde)2Paket)3", (byte) 123);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Lrd;")
    private static class114 field2533 = class84.method656("Loaded title screen", (byte) 117);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lrd;")
    public static class114 field2543 = field2533;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "Lrd;")
    public static class114 field2568 = class84.method656("M", (byte) 118);

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Ldd;")
    public static class26 field2561 = new class26(260);

    @OriginalMember(owner = "client!r", name = "S", descriptor = "Lrd;")
    public static class114 field2574 = class84.method656("@gr3@", (byte) 117);

    @OriginalMember(owner = "client!r", name = "R", descriptor = "[I")
    public static int[] field2573 = new int[2048];

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field2575 = 0;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "Z")
    public static boolean field2577;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static final void method830(byte arg0) {
        field2551++;
        try {
            if (class84.field1883 == 0) {
                if (class18.field343 != null) {
                    class18.field343.method292(25830);
                    class18.field343 = null;
                }
                class52.field1096 = null;
                class84.field1883 = 1;
                class121.field2824 = 0;
                class62.field1339 = false;
            }
            if (class84.field1883 == 1) {
                if (class52.field1096 == null) {
                    class52.field1096 = class36.field764.method304(0, class127.field3044);
                }
                if (class52.field1096.field1826 == 2) {
                    throw new IOException();
                }
                if (class52.field1096.field1826 == 1) {
                    class18.field343 = new class42((Socket) class52.field1096.field1823, class36.field764);
                    class84.field1883 = 2;
                    class52.field1096 = null;
                }
            }
            if (arg0 == -80) {
                if (class84.field1883 == 2) {
                    long var1 = class8.field114 = class42.field850.method877(arg0 + 29566);
                    class61.field1303.field1227 = 0;
                    int var3 = (int) (var1 >> 16 & 0x1FL);
                    class61.field1303.method478((byte) 90, 14);
                    class61.field1303.method478((byte) -86, var3);
                    class18.field343.method290(false, 2, 0, class61.field1303.field1248);
                    class84.field1883 = 3;
                    class77.field1752.field1227 = 0;
                }
                if (class84.field1883 == 3) {
                    int var4 = class18.field343.method297(arg0 + 205);
                    if (var4 != 0) {
                        class5.method54(var4, (byte) 34);
                        return;
                    }
                    class84.field1883 = 4;
                    class77.field1752.field1227 = 0;
                }
                if (class84.field1883 == 4) {
                    if (class77.field1752.field1227 < 8) {
                        int var5 = class18.field343.method289((byte) -113);
                        if (var5 > 8 - class77.field1752.field1227) {
                            var5 = 8 - class77.field1752.field1227;
                        }
                        if (var5 > 0) {
                            class18.field343.method293(class77.field1752.field1227, class77.field1752.field1248, var5, 0);
                            class77.field1752.field1227 += var5;
                        }
                    }
                    if (class77.field1752.field1227 == 8) {
                        class77.field1752.field1227 = 0;
                        class84.field1878 = class77.field1752.method490(false);
                        class84.field1883 = 5;
                    }
                }
                if (class84.field1883 == 5) {
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), 0, 0 };
                    class61.field1303.field1227 = 0;
                    var6[2] = (int) (class84.field1878 >> 32);
                    var6[3] = (int) class84.field1878;
                    class61.field1303.method478((byte) -30, 10);
                    class61.field1303.method476(-7155, var6[0]);
                    class61.field1303.method476(-7155, var6[1]);
                    class61.field1303.method476(-7155, var6[2]);
                    class61.field1303.method476(-7155, var6[3]);
                    class61.field1303.method476(-7155, class36.field764.field883);
                    class61.field1303.method455(class42.field850.method877(29486), 2);
                    class61.field1303.method452(arg0 - 6515, class42.field867);
                    class61.field1303.method461(class67.field1451, class55.field1153, true);
                    class86.field1938.field1227 = 0;
                    if (class77.field1764 == 40) {
                        class86.field1938.method478((byte) 94, 18);
                    } else {
                        class86.field1938.method478((byte) 118, 16);
                    }
                    class86.field1938.method478((byte) -58, class61.field1303.field1227 + 61);
                    class86.field1938.method476(-7155, 449);
                    class86.field1938.method478((byte) -106, class64.field1370 ? 1 : 0);
                    class86.field1938.method476(-7155, class112.field2617.field2272);
                    class86.field1938.method476(arg0 ^ 0x1BBD, class48.field989.field2272);
                    class86.field1938.method476(arg0 ^ 0x1BBD, class117.field2738.field2272);
                    class86.field1938.method476(arg0 - 7075, class47.field963.field2272);
                    class86.field1938.method476(-7155, class12.field280.field2272);
                    class86.field1938.method476(-7155, class100.field2298.field2272);
                    class86.field1938.method476(arg0 - 7075, class137.field3318.field2272);
                    class86.field1938.method476(-7155, class116.field2699.field2272);
                    class86.field1938.method476(-7155, class104.field2423.field2272);
                    class86.field1938.method476(arg0 ^ 0x1BBD, class31.field636.field2272);
                    class86.field1938.method476(-7155, class128.field3074.field2272);
                    class86.field1938.method476(-7155, class55.field1162.field2272);
                    class86.field1938.method476(arg0 - 7075, class26.field537.field2272);
                    class86.field1938.method476(-7155, class80.field1811.field2272);
                    class86.field1938.method483(class61.field1303.field1248, (byte) -67, class61.field1303.field1227, 0);
                    class18.field343.method290(false, class86.field1938.field1227, 0, class86.field1938.field1248);
                    class61.field1303.method1052(var6, true);
                    for (int var7 = 0; var7 < 4; var7++) {
                        var6[var7] += 50;
                    }
                    class77.field1752.method1052(var6, true);
                    class84.field1883 = 6;
                }
                if (class84.field1883 == 6 && class18.field343.method289((byte) -89) > 0) {
                    int var8 = class18.field343.method297(arg0 ^ 0xFFFFFFDC);
                    if (var8 == 21 && class77.field1764 == 20) {
                        class84.field1883 = 7;
                    } else if (var8 == 2) {
                        class84.field1883 = 9;
                    } else if (var8 == 15 && class77.field1764 == 40) {
                        class48.method347((byte) 123);
                        return;
                    } else if (var8 == 23 && class145.field3463 < 1) {
                        class84.field1883 = 0;
                        class145.field3463++;
                    } else {
                        class5.method54(var8, (byte) 91);
                        return;
                    }
                }
                if (class84.field1883 == 7 && class18.field343.method289((byte) -57) > 0) {
                    class12.field268 = (class18.field343.method297(126) + 3) * 60;
                    class84.field1883 = 8;
                }
                if (class84.field1883 == 8) {
                    class121.field2824 = 0;
                    class13.method111(0, class101.method786((byte) 125, new class114[] { class14.method113(class12.field268 / 60, arg0 ^ 0x7C5A), class12.field274 }), class135.field3300, class62.field1327);
                    if (--class12.field268 <= 0) {
                        class84.field1883 = 0;
                    }
                } else {
                    if (class84.field1883 == 9 && class18.field343.method289((byte) -98) >= 8) {
                        class58.field1205 = class18.field343.method297(104);
                        class96.field2208 = class18.field343.method297(117) == 1;
                        class77.field1762 = class18.field343.method297(124);
                        class77.field1762 <<= 0x8;
                        class77.field1762 += class18.field343.method297(108);
                        class130.field3142 = class18.field343.method297(108);
                        class18.field343.method293(0, class77.field1752.field1248, 1, 0);
                        class77.field1752.field1227 = 0;
                        class66.field1423 = class77.field1752.method1051(50);
                        class18.field343.method293(0, class77.field1752.field1248, 2, 0);
                        class77.field1752.field1227 = 0;
                        class74.field1697 = class77.field1752.method467(255);
                        class84.field1883 = 10;
                    }
                    if (class84.field1883 != 10) {
                        class121.field2824++;
                        if (class121.field2824 > 2000) {
                            if (class145.field3463 < 1) {
                                class145.field3463++;
                                class84.field1883 = 0;
                                if (class60.field1241 == class127.field3044) {
                                    class127.field3044 = class86.field1929;
                                } else {
                                    class127.field3044 = class60.field1241;
                                }
                            } else {
                                class5.method54(-3, (byte) 105);
                            }
                        }
                    } else if (class18.field343.method289((byte) -62) >= class74.field1697) {
                        class77.field1752.field1227 = 0;
                        class18.field343.method293(0, class77.field1752.field1248, class74.field1697, 0);
                        class107.method818(true);
                        class130.field3145 = -1;
                        class42.method294(false, (byte) -85);
                        class66.field1423 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class145.field3463 < 1) {
                class145.field3463++;
                class84.field1883 = 0;
                if (class60.field1241 == class127.field3044) {
                    class127.field3044 = class86.field1929;
                } else {
                    class127.field3044 = class60.field1241;
                }
            } else {
                class5.method54(-2, (byte) 39);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public final synchronized void method831(byte arg0) {
        field2572++;
        if (arg0 != 75) {
            return;
        }
        Container var2;
        if (class32.field657 == null) {
            var2 = class36.field764.field882;
        } else {
            var2 = class32.field657;
        }
        if (class114.field2678 != null) {
            class114.field2678.removeFocusListener(this);
            var2.remove(class114.field2678);
        }
        class114.field2678 = new class38(this);
        var2.add(class114.field2678);
        class114.field2678.setSize(class99.field2243, class69.field1524);
        class114.field2678.setVisible(true);
        if (class32.field657 == null) {
            class114.field2678.setLocation(0, 0);
        } else {
            Insets var3 = class32.field657.getInsets();
            class114.field2678.setLocation(var3.left, var3.top);
        }
        class114.field2678.addFocusListener(this);
        class114.field2678.requestFocus();
        class34.field678 = true;
        class49.field1013 = false;
        class25.field490 = class99.method747(0);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public static final void method832(byte arg0) {
        if (arg0 != 20) {
            return;
        }
        field2534++;
        class140 var1 = class90.field2084;
        synchronized (class90.field2084) {
            class117.field2733 = class90.field2131;
            if (class98.field2235 >= 0) {
                while (class98.field2235 != class12.field236) {
                    int var2 = class72.field1609[class12.field236];
                    class12.field236 = class12.field236 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class101.field2339[var2] = true;
                    } else {
                        class101.field2339[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class101.field2339[var3] = false;
                }
                class98.field2235 = class12.field236;
            }
            class90.field2131 = client.field398;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    public abstract void method147(byte arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIBILjava/lang/String;ILjava/net/InetAddress;)V")
    public final void method833(int arg0, int arg1, int arg2, byte arg3, int arg4, String arg5, int arg6, InetAddress arg7) {
        try {
            class116.field2693 = arg0;
            int var9 = 118 / ((49 - arg3) / 57);
            class99.field2243 = arg2;
            class36.field769 = this;
            class69.field1524 = arg4;
            class32.field657 = new Frame();
            class32.field657.setTitle("Jagex");
            class32.field657.setResizable(false);
            class32.field657.addWindowListener(this);
            class32.field657.setVisible(true);
            class32.field657.toFront();
            Insets var10 = class32.field657.getInsets();
            class32.field657.setSize(arg2 + var10.left + var10.right, var10.top - -var10.bottom + arg4);
            class72.field1603 = class36.field764 = new class43(true, null, arg7, arg6, arg5, arg1);
            class36.field764.method309(1, (byte) -108, this);
        } catch (Exception var12) {
            class121.method943((byte) 103, var12, null);
        }
        field2547++;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V")
    private final void method834(byte arg0) {
        if (arg0 != 110) {
            return;
        }
        field2560++;
        long var2 = class99.method747(0);
        long var4 = class24.field467[class101.field2317];
        class24.field467[class101.field2317] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class101.field2317 = class101.field2317 + 1 & 0x1F;
        synchronized (this) {
            class121.field2835 = class85.field1895;
        }
        this.method147((byte) 117);
    }

    @OriginalMember(owner = "client!r", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2557++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    private final synchronized void method835(int arg0) {
        field2553++;
        if (class116.field2698) {
            return;
        }
        class116.field2698 = true;
        try {
            class114.field2678.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method152(arg0);
        } catch (Exception var4) {
        }
        if (class32.field657 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class36.field764 != null) {
            try {
                class36.field764.method299(arg0 + 67);
            } catch (Exception var2) {
            }
        }
        this.method143(arg0 - 3);
    }

    @OriginalMember(owner = "client!r", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2554++;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2565++;
        class85.field1895 = true;
        class34.field678 = true;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Z")
    public final boolean method836(int arg0) {
        field2567++;
        if (arg0 != 14) {
            return true;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method841(77, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2535++;
        if (class36.field769 != this || class116.field2698) {
            return;
        }
        class34.field678 = true;
        if (class43.field887 != null && class43.field887.startsWith("1.5") && class99.method747(0) - class25.field490 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class99.field2243 <= var2.width && class69.field1524 <= var2.height) {
                class49.field1013 = true;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method143(int arg0);

    @OriginalMember(owner = "client!r", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2530++;
        if (class32.field657 == null) {
            return class36.field764 == null || class36.field764.field882 == this ? super.getDocumentBase() : class36.field764.field882.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2558++;
    }

    @OriginalMember(owner = "client!r", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!r", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2559++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!r", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2541++;
        this.destroy();
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(B)V")
    public abstract void method149(byte arg0);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(B)V")
    private final void method837(byte arg0) {
        field2542++;
        long var2 = class99.method747(0);
        long var4 = class32.field659[class46.field944];
        int var6 = -11 % ((arg0 - 22) / 41);
        class32.field659[class46.field944] = var2;
        class46.field944 = class46.field944 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var7 = (int) (var2 - var4);
            class143.field3405 = ((var7 >> 1) + 32000) / var7;
        }
        if (class14.field310++ > 50) {
            class34.field678 = true;
            class14.field310 -= 50;
            class114.field2678.setSize(class99.field2243, class69.field1524);
            class114.field2678.setVisible(true);
            if (class32.field657 == null) {
                class114.field2678.setLocation(0, 0);
            } else {
                Insets var8 = class32.field657.getInsets();
                class114.field2678.setLocation(var8.left, var8.top);
            }
        }
        this.method144(-103);
    }

    @OriginalMember(owner = "client!r", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2550++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public static final void method838(boolean arg0) {
        field2546++;
        class75.field1738 = true;
        if (arg0) {
            method830((byte) -51);
        }
        class36.method253((byte) 74);
        if (class5.field75) {
            client.field399.method337(class72.field1614, 239, 40, 0);
            client.field399.method337(class101.method786((byte) 125, new class114[] { class72.field1619, class79.field1795 }), 239, 60, 128);
        } else if (class142.field3382 == 1) {
            client.field399.method337(class11.field201, 239, 40, 0);
            client.field399.method337(class101.method786((byte) 127, new class114[] { class72.field1612, class79.field1795 }), 239, 60, 128);
        } else if (class142.field3382 == 2) {
            client.field399.method337(class46.field953, 239, 40, 0);
            client.field399.method337(class101.method786((byte) 127, new class114[] { class72.field1612, class79.field1795 }), 239, 60, 128);
        } else if (class142.field3382 == 3) {
            if (class72.field1613 != class72.field1612) {
                class24.method180(class72.field1612, arg0);
                class72.field1613 = class72.field1612;
            }
            class45 var1 = class5.field54;
            class59.method428(0, 0, 463, 77);
            for (int var2 = 0; var2 < class26.field543; var2++) {
                int var3 = var2 * 14 + 18 - class96.field2206;
                if (var3 > 0 && var3 < 110) {
                    var1.method337(class8.field115[var2], 239, var3, 0);
                }
            }
            class59.method426();
            if (class26.field543 > 5) {
                class132.method1059(class96.field2206, 463, class26.field543 * 14 + 7, 77, (byte) 74, 0);
            }
            if (class72.field1612.method854(-29348) == 0) {
                client.field399.method337(class21.field387, 239, 40, 255);
            } else if (class26.field543 == 0) {
                client.field399.method337(class39.field827, 239, 40, 0);
            }
            var1.method337(class101.method786((byte) 127, new class114[] { class72.field1612, class79.field1795 }), 239, 90, 0);
            class59.method432(0, 77, 479, 0);
        } else if (class142.field3382 == 4) {
            client.field399.method337(class72.field1615, 239, 40, 0);
            client.field399.method337(class101.method786((byte) 125, new class114[] { class72.field1612, class79.field1795 }), 239, 60, 128);
        } else if (class60.field1250 != null) {
            client.field399.method330(class60.field1250, 10, 20, 459, 40, 0, false, 1, 1, 0);
            client.field399.method337(class29.field590, 239, 80, 128);
        } else if (class123.field2899 != -1) {
            boolean var19 = class144.method1147(0, 96, 479, 0, false, 2, class123.field2899);
            if (!var19) {
                class140.field3335 = true;
            }
        } else if (class8.field120 == -1) {
            class45 var5 = class5.field54;
            class59.method428(0, 0, 463, 77);
            int var6 = 0;
            for (int var7 = 0; var7 < 100; var7++) {
                if (class144.field3425[var7] != null) {
                    int var9 = class28.field557[var7];
                    class114 var10 = class28.field563[var7];
                    int var11 = class52.field1114 + 70 - var6 * 14;
                    byte var12 = 0;
                    if (var10 != null && var10.method864(27, class50.field1035)) {
                        var10 = var10.method866(false, 5);
                        var12 = 1;
                    }
                    if (var10 != null && var10.method864(27, class79.field1788)) {
                        var10 = var10.method866(arg0, 5);
                        var12 = 2;
                    }
                    if (var9 == 0) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method333(class144.field3425[var7], 4, var11, 0);
                        }
                        var6++;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || class12.field253 == 0 || class12.field253 == 1 && class24.method175((byte) 32, var10))) {
                        if (var11 > 0 && var11 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                class109.field2528[0].method722(var13, var11 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                class109.field2528[1].method722(var13, var11 - 12);
                                var13 += 14;
                            }
                            var5.method333(class101.method786((byte) 126, new class114[] { var10, class101.field2323 }), var13, var11, 0);
                            int var14 = var13 + var5.method326(var10) + 8;
                            var5.method333(class144.field3425[var7], var14, var11, 255);
                        }
                        var6++;
                    }
                    if ((var9 == 3 || var9 == 7) && class26.field532 == 0 && (var9 == 7 || class130.field3149 == 0 || class130.field3149 == 1 && class24.method175((byte) 32, var10))) {
                        var6++;
                        if (var11 > 0 && var11 < 110) {
                            byte var15 = 4;
                            var5.method333(class70.field1537, var15, var11, 0);
                            int var16 = var15 + var5.method326(class70.field1537);
                            int var17 = var16 + var5.method327(32);
                            if (var12 == 1) {
                                class109.field2528[0].method722(var17, var11 - 12);
                                var17 += 14;
                            }
                            if (var12 == 2) {
                                class109.field2528[1].method722(var17, var11 - 12);
                                var17 += 14;
                            }
                            var5.method333(class101.method786((byte) 125, new class114[] { var10, class101.field2323 }), var17, var11, 0);
                            int var18 = var17 + var5.method326(var10) + 8;
                            var5.method333(class144.field3425[var7], var18, var11, 8388608);
                        }
                    }
                    if (var9 == 4 && (class99.field2255 == 0 || class99.field2255 == 1 && class24.method175((byte) 32, var10))) {
                        var6++;
                        if (var11 > 0 && var11 < 110) {
                            var5.method333(class101.method786((byte) 126, new class114[] { var10, class141.field3362, class144.field3425[var7] }), 4, var11, 8388736);
                        }
                    }
                    if (var9 == 5 && class26.field532 == 0 && class130.field3149 < 2) {
                        var6++;
                        if (var11 > 0 && var11 < 110) {
                            var5.method333(class144.field3425[var7], 4, var11, 8388608);
                        }
                    }
                    if (var9 == 6 && class26.field532 == 0 && class130.field3149 < 2) {
                        var6++;
                        if (var11 > 0 && var11 < 110) {
                            var5.method333(class101.method786((byte) 127, new class114[] { class20.field366, class141.field3362, var10, class101.field2323 }), 4, var11, 0);
                            var5.method333(class144.field3425[var7], var5.method326(class101.method786((byte) 125, new class114[] { class20.field366, class141.field3362, var10 })) + 12, var11, 8388608);
                        }
                    }
                    if (var9 == 8 && (class99.field2255 == 0 || class99.field2255 == 1 && class24.method175((byte) 32, var10))) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method333(class101.method786((byte) 126, new class114[] { var10, class141.field3362, class144.field3425[var7] }), 4, var11, 8270336);
                        }
                        var6++;
                    }
                }
            }
            class59.method426();
            class85.field1888 = var6 * 14 + 7;
            if (class85.field1888 < 78) {
                class85.field1888 = 78;
            }
            class132.method1059(class85.field1888 - class52.field1114 - 77, 463, class85.field1888, 77, (byte) 110, 0);
            class114 var8;
            if (class7.field103 == null || class7.field103.field3018 == null) {
                var8 = class42.field850;
            } else {
                var8 = class7.field103.field3018;
            }
            var5.method333(class101.method786((byte) 125, new class114[] { var8, class101.field2323 }), 4, 90, 0);
            var5.method333(class101.method786((byte) 126, new class114[] { class72.field1618, class79.field1795 }), var5.method326(class101.method786((byte) 127, new class114[] { var8, class137.field3320 })) + 6, 90, 255);
            class59.method432(0, 77, 479, 0);
        } else {
            boolean var4 = class144.method1147(0, 96, 479, 0, false, 3, class8.field120);
            if (!var4) {
                class140.field3335 = true;
            }
        }
        if (class116.field2714 && class14.field304 == 2) {
            class24.method171(-7);
        }
        class92.method718(357);
    }

    @OriginalMember(owner = "client!r", name = "run", descriptor = "()V")
    public final void run() {
        field2562++;
        try {
            if (class43.field881 != null) {
                String var1 = class43.field881.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class43.field887;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method841(77, "wrongjava");
                        return;
                    }
                    class29.field577 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class43.field887 == null || class43.field887.equals("1.4.2"))) {
                    this.method841(77, "wrongjava");
                    return;
                }
            }
            if (class36.field764.field882 != null) {
                Method var3 = class43.field900;
                if (var3 != null) {
                    try {
                        var3.invoke(class36.field764.field882, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method831((byte) 75);
            class143.field3402 = class67.method538(-59, class99.field2243, class69.field1524, class114.field2678);
            this.method149((byte) -110);
            class11.field204 = class140.method1119(-128);
            class11.field204.method8(15);
            while (class21.field379 == 0L || class21.field379 > class99.method747(0)) {
                class79.field1800 = class11.field204.method6(class29.field577, class25.field507, 64);
                for (int var4 = 0; var4 < class79.field1800; var4++) {
                    this.method834((byte) 110);
                }
                this.method837((byte) 109);
            }
        } catch (Exception var7) {
            class121.method943((byte) -92, var7, null);
            this.method841(77, "crash");
        }
        this.method835(0);
    }

    @OriginalMember(owner = "client!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2552++;
        class85.field1895 = false;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public static final void method839(int arg0) {
        class65 var1 = (class65) class111.field2601.method654((byte) 89);
        int var2 = -83 / ((67 - arg0) / 56);
        while (var1 != null) {
            if (var1.field1386 != null) {
                class29.field614.method894(var1.field1386);
                var1.field1386 = null;
            }
            if (var1.field1390 != null) {
                class29.field614.method894(var1.field1390);
                var1.field1390 = null;
            }
            var1 = (class65) class111.field2601.method644((byte) -68);
        }
        field2538++;
        class111.field2601.method648(-118);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public final void method840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2536++;
        try {
            if (class36.field769 == null) {
                class116.field2693 = arg4;
                class69.field1524 = arg2;
                class36.field769 = this;
                class99.field2243 = arg0;
                if (class36.field764 == null) {
                    class72.field1603 = class36.field764 = new class43(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg1, null, 0);
                }
                class36.field764.method309(1, (byte) -118, this);
                if (arg3 != 14) {
                    field2540 = null;
                }
            } else {
                class112.field2612++;
                if (class112.field2612 >= 3) {
                    this.method841(77, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            }
        } catch (Exception var7) {
            class121.method943((byte) -101, var7, null);
            this.method841(77, "crash");
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method841(int arg0, String arg1) {
        field2564++;
        if (this.field2569) {
            return;
        }
        this.field2569 = true;
        if (arg0 != 77) {
            this.method841(-8, null);
        }
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    public static void method842(int arg0) {
        field2573 = null;
        field2561 = null;
        if (arg0 != -15040) {
            return;
        }
        field2543 = null;
        field2540 = null;
        field2574 = null;
        field2533 = null;
        field2568 = null;
    }

    @OriginalMember(owner = "client!r", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2545++;
        if (class32.field657 == null) {
            return class36.field764 == null || class36.field764.field882 == this ? super.getCodeBase() : class36.field764.field882.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2531++;
        if (class32.field657 == null) {
            return class36.field764 == null || class36.field764.field882 == this ? super.getParameter(arg0) : class36.field764.field882.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "start", descriptor = "()V")
    public final void start() {
        field2549++;
        if (class36.field769 == this && !class116.field2698) {
            class21.field379 = 0L;
        }
    }

    @OriginalMember(owner = "client!r", name = "stop", descriptor = "()V")
    public final void stop() {
        field2539++;
        if (class36.field769 == this && !class116.field2698) {
            class21.field379 = class99.method747(0) + 4000L;
        }
    }

    @OriginalMember(owner = "client!r", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2537++;
    }

    @OriginalMember(owner = "client!r", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2532++;
        if (class36.field769 == this && !class116.field2698) {
            class21.field379 = class99.method747(0);
            class141.method1122(17525, 5000L);
            class72.field1603 = null;
            this.method835(0);
        }
    }

    @OriginalMember(owner = "client!r", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2544++;
        if (class32.field657 == null) {
            return class36.field764 == null || class36.field764.field882 == this ? super.getAppletContext() : class36.field764.field882.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "providesignlink", descriptor = "(Lg;)V")
    public static final void providesignlink(class43 arg0) {
        class36.field764 = arg0;
        class72.field1603 = arg0;
        field2563++;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method144(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lnd;B)V")
    public static final void method843(class90 arg0, byte arg1) {
        if (arg1 != -57) {
            field2561 = null;
        }
        int var2 = arg0.field2060 >> 16;
        if (class123.field2899 == var2 || class8.field120 == var2) {
            class140.field3335 = true;
        }
        if (class123.field2905 == var2 || class123.field2906[class102.field2351] == var2) {
            class24.field460 = true;
        }
        field2548++;
    }

    @OriginalMember(owner = "client!r", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2566++;
    }
}
