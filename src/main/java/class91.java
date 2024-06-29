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
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class91 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "Z")
    private boolean field2161 = false;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public static int field2154 = 0;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Lad;")
    public static class5 field2149 = class88.method674("Handel)4Duell", -111);

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lad;")
    public static class5 field2141 = class88.method674("b12_full", -77);

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "Lad;")
    private static class5 field2170 = class88.method674("Please try using a different world)3", -64);

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Lad;")
    public static class5 field2151 = field2170;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Lad;")
    public static class5 field2164 = field2170;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "Lad;")
    public static class5 field2177 = field2170;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "Lad;")
    private static class5 field2171 = class88.method674("white:", 30);

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "Lad;")
    public static class5 field2175 = field2170;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "Lad;")
    public static class5 field2176 = class88.method674("Handel akzeptieren", -81);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lad;")
    public static class5 field2128 = field2171;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "Lad;")
    public static class5 field2174 = class88.method674("m", -68);

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lad;")
    public static class5 field2143 = field2170;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lad;")
    public static class5 field2145 = field2170;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field2178 = -1;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "Z")
    public static boolean field2180;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[Lub;")
    public static class122[] field2130;

    @OriginalMember(owner = "client!pa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final synchronized void paint(Graphics arg0) {
        field2127++;
        if (class116.field2869 != this || class63.field1543) {
            return;
        }
        class120.field2979 = true;
        if (class2.field20 != null && class2.field20.startsWith("1.5") && class95.method728(128) - class75.field1787 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class7.field270 && var2.height >= class46.field1218) {
                class80.field1890 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 30)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2156++;
    }

    @OriginalMember(owner = "client!pa", name = "stop", descriptor = "()V", line = 44)
    public final void stop() {
        field2169++;
        if (class116.field2869 == this && !class63.field1543) {
            class100.field2438 = class95.method728(128) + 4000L;
        }
    }

    @OriginalMember(owner = "client!pa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 56)
    public final void focusLost(FocusEvent arg0) {
        class121.field3011 = false;
        field2150++;
    }

    @OriginalMember(owner = "client!pa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 65)
    public final void windowDeactivated(WindowEvent arg0) {
        field2146++;
    }

    @OriginalMember(owner = "client!pa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 72)
    public final void windowActivated(WindowEvent arg0) {
        field2134++;
    }

    @OriginalMember(owner = "client!pa", name = "providesignlink", descriptor = "(Laa;)V", line = 79)
    public static final void providesignlink(class2 arg0) {
        field2136++;
        class25.field631 = arg0;
        class87.field2044 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 89)
    public final void windowIconified(WindowEvent arg0) {
        field2173++;
    }

    @OriginalMember(owner = "client!pa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 102)
    public final void windowOpened(WindowEvent arg0) {
        field2147++;
    }

    @OriginalMember(owner = "client!pa", name = "run", descriptor = "()V", line = 109)
    public final void run() {
        field2162++;
        try {
            if (class2.field36 != null) {
                String var1 = class2.field36.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class2.field20;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method692("wrongjava", 119);
                        return;
                    }
                    class102.field2483 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class2.field20 == null || class2.field20.equals("1.4.2"))) {
                    this.method692("wrongjava", 125);
                    return;
                }
            }
            if (class25.field631.field34 != null) {
                Method var3 = class2.field28;
                if (var3 != null) {
                    try {
                        var3.invoke(class25.field631.field34, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method699((byte) 40);
            class4.field127 = class12.method112((byte) -50, class9.field305, class7.field270, class46.field1218);
            this.method152(-118);
            class70.field1709 = class101.method809((byte) 98);
            class70.field1709.method91(1);
            while (class100.field2438 == 0L || class95.method728(128) < class100.field2438) {
                class70.field1652 = class70.field1709.method92(class102.field2483, false, class52.field1306);
                for (int var4 = 0; var4 < class70.field1652; var4++) {
                    this.method690((byte) -75);
                }
                this.method688(267);
            }
        } catch (Exception var7) {
            class118.method932(var7, null, 1);
            this.method692("crash", 82);
        }
        this.method694(0);
    }

    @OriginalMember(owner = "client!pa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 191)
    public final void focusGained(FocusEvent arg0) {
        class121.field3011 = true;
        field2129++;
        class120.field2979 = true;
    }

    @OriginalMember(owner = "client!pa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 207)
    public final void windowDeiconified(WindowEvent arg0) {
        field2140++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 221)
    private final void method688(int arg0) {
        if (arg0 != 267) {
            return;
        }
        long var2 = class95.method728(128);
        field2152++;
        long var4 = class42.field1073[class50.field1287];
        class42.field1073[class50.field1287] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class135.field3274 = ((var6 >> 1) + 32000) / var6;
        }
        class50.field1287 = class50.field1287 + 1 & 0x1F;
        if (class83.field1949++ > 50) {
            class120.field2979 = true;
            class83.field1949 -= 50;
            class9.field305.setSize(class7.field270, class46.field1218);
            class9.field305.setVisible(true);
            if (class80.field1882 == null) {
                class9.field305.setLocation(0, 0);
            } else {
                Insets var7 = class80.field1882.getInsets();
                class9.field305.setLocation(var7.left, var7.top);
            }
        }
        this.method147(false);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Z", line = 263)
    public final boolean method689(int arg0) {
        field2155++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (arg0 != -1) {
                return false;
            } else if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method692("invalidhost", 70);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 308)
    private final void method690(byte arg0) {
        long var2 = class95.method728(128);
        field2158++;
        if (arg0 > -49) {
            return;
        }
        long var4 = class95.field2276[class38.field948];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class95.field2276[class38.field948] = var2;
        class38.field948 = class38.field948 + 1 & 0x1F;
        synchronized (this) {
            class77.field1811 = class121.field3011;
        }
        this.method153(17879);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lrc;I)V", line = 339)
    public static final void method691(class105 arg0, int arg1) {
        field2165++;
        if (arg1 != -1) {
            field2128 = null;
        }
        int var2 = arg0.field2558;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class63.field1518 == 0) {
                arg0.field2604 = 0;
                arg0.field2625 = class92.field2200;
            } else if (var2 == 1 && class63.field1518 == 1) {
                arg0.field2625 = class116.field2848;
                arg0.field2604 = 0;
            } else if (var2 == 2 && class63.field1518 != 2) {
                arg0.field2625 = class80.field1883;
                arg0.field2604 = 0;
            } else {
                if (var2 > 700) {
                    var2 -= 601;
                } else {
                    var2--;
                }
                int var3 = class100.field2437;
                if (class63.field1518 != 2) {
                    var3 = 0;
                }
                if (var2 >= var3) {
                    arg0.field2625 = class135.field3269;
                    arg0.field2604 = 0;
                } else {
                    arg0.field2625 = class21.field543[var2];
                    arg0.field2604 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class100.field2437;
            if (class63.field1518 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field2625 = class135.field3269;
                arg0.field2604 = 0;
            } else {
                if (class40.field1040[var2] == 0) {
                    arg0.field2625 = class69.method546(true, new class5[] { class121.field3006, class100.field2434 });
                } else if (class40.field1040[var2] < 5000) {
                    if (class40.field1040[var2] == class5.field210) {
                        arg0.field2625 = class69.method546(true, new class5[] { class38.field946, class120.field2986, class106.method864(18413, class40.field1040[var2]) });
                    } else {
                        arg0.field2625 = class69.method546(true, new class5[] { class75.field1801, class120.field2986, class106.method864(18413, class40.field1040[var2]) });
                    }
                } else if (class40.field1040[var2] == class5.field210) {
                    arg0.field2625 = class69.method546(true, new class5[] { class38.field946, class59.field1453, class106.method864(18413, class40.field1040[var2] - 5000) });
                } else {
                    arg0.field2625 = class69.method546(true, new class5[] { class75.field1801, class59.field1453, class106.method864(18413, class40.field1040[var2] - 5000) });
                }
                arg0.field2604 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class100.field2437;
            if (class63.field1518 != 2) {
                var5 = 0;
            }
            arg0.field2538 = var5 * 15 + 20;
            if (arg0.field2611 >= arg0.field2538) {
                arg0.field2538 = arg0.field2611 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class63.field1518 == 0) {
                arg0.field2625 = class129.field3129;
                arg0.field2604 = 0;
            } else if (var2 == 1 && class63.field1518 == 0) {
                arg0.field2625 = class80.field1883;
                arg0.field2604 = 0;
            } else {
                int var6 = class32.field769;
                if (class63.field1518 == 0) {
                    var6 = 0;
                }
                if (var2 >= var6) {
                    arg0.field2604 = 0;
                    arg0.field2625 = class135.field3269;
                } else {
                    arg0.field2625 = class110.method891(class14.field400[var2], -30523).method45((byte) -60);
                    arg0.field2604 = 1;
                }
            }
        } else if (var2 == 503) {
            arg0.field2538 = class32.field769 * 15 + 20;
            if (arg0.field2538 <= arg0.field2611) {
                arg0.field2538 = arg0.field2611 + 1;
            }
        } else if (var2 == 324) {
            if (class61.field1510 == -1) {
                class94.field2227 = arg0.field2590;
                class61.field1510 = arg0.field2542;
            }
            if (class34.field826.field1471) {
                arg0.field2542 = class61.field1510;
            } else {
                arg0.field2542 = class94.field2227;
            }
        } else if (var2 == 325) {
            if (class61.field1510 == -1) {
                class61.field1510 = arg0.field2542;
                class94.field2227 = arg0.field2590;
            }
            if (class34.field826.field1471) {
                arg0.field2542 = class94.field2227;
            } else {
                arg0.field2542 = class61.field1510;
            }
        } else if (var2 == 327) {
            arg0.field2622 = 150;
            arg0.field2623 = (int) (Math.sin((double) class69.field1636 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2587 = 5;
            arg0.field2602 = 0;
        } else if (var2 == 328) {
            arg0.field2622 = 150;
            arg0.field2623 = (int) (Math.sin((double) class69.field1636 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2587 = 5;
            arg0.field2602 = 1;
        } else if (var2 == 600) {
            arg0.field2625 = class69.method546(true, new class5[] { class135.field3261, class129.field3134 });
        } else if (var2 == 620) {
            if (class78.field1848 < 1) {
                arg0.field2625 = class135.field3269;
            } else if (class81.field1909) {
                arg0.field2637 = 16711680;
                arg0.field2625 = class133.field3218;
            } else {
                arg0.field2625 = class52.field1297;
                arg0.field2637 = 16777215;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 594)
    public final void method692(String arg0, int arg1) {
        field2163++;
        if (this.field2161) {
            return;
        }
        this.field2161 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
            if (arg1 < 65) {
                field2176 = null;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V", line = 624)
    public static void method693(int arg0) {
        field2164 = null;
        field2145 = null;
        field2170 = null;
        field2171 = null;
        field2130 = null;
        field2141 = null;
        field2149 = null;
        field2176 = null;
        field2177 = null;
        field2143 = null;
        if (arg0 >= -24) {
            field2177 = null;
        }
        field2175 = null;
        field2174 = null;
        field2128 = null;
        field2151 = null;
    }

    @OriginalMember(owner = "client!pa", name = "start", descriptor = "()V", line = 658)
    public final void start() {
        field2166++;
        if (class116.field2869 == this && !class63.field1543) {
            class100.field2438 = 0L;
        }
    }

    @OriginalMember(owner = "client!pa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 670)
    public final AppletContext getAppletContext() {
        field2160++;
        if (class80.field1882 == null) {
            return class25.field631 == null || class25.field631.field34 == this ? super.getAppletContext() : class25.field631.field34.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 696)
    public final void windowClosed(WindowEvent arg0) {
        field2142++;
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V", line = 710)
    private final synchronized void method694(int arg0) {
        field2167++;
        if (class63.field1543) {
            return;
        }
        class63.field1543 = true;
        try {
            class9.field305.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method148((byte) 9);
        } catch (Exception var4) {
        }
        if (arg0 != 0) {
            this.windowDeactivated(null);
        }
        if (class80.field1882 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class25.field631 != null) {
            try {
                class25.field631.method11(0);
            } catch (Exception var2) {
            }
        }
        this.method154(765);
    }

    @OriginalMember(owner = "client!pa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 762)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2138++;
    }

    @OriginalMember(owner = "client!pa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 771)
    public final URL getDocumentBase() {
        field2144++;
        if (class80.field1882 == null) {
            return class25.field631 == null || class25.field631.field34 == this ? super.getDocumentBase() : class25.field631.field34.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIBI)V", line = 785)
    public final void method695(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2132++;
        try {
            if (class116.field2869 == null) {
                if (arg3 > -109) {
                    this.windowClosing(null);
                }
                class118.field2912 = arg2;
                class46.field1218 = arg1;
                class7.field270 = arg0;
                class116.field2869 = this;
                if (class25.field631 == null) {
                    class87.field2044 = class25.field631 = new class2(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg4, null, 0);
                }
                class25.field631.method13(1, this, 0);
            } else {
                this.method692("alreadyloaded", 68);
            }
        } catch (Exception var7) {
            class118.method932(var7, null, 1);
            this.method692("crash", 98);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[B)Lad;", line = 824)
    public static final class5 method696(int arg0, int arg1, int arg2, byte[] arg3) {
        field2172++;
        class5 var4 = new class5();
        var4.field183 = arg2;
        var4.field164 = new byte[arg1];
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field164[var4.field183++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)V", line = 851)
    public static final void method697(int arg0) {
        field2139++;
        class36.field907.method213(8);
        int var1 = class36.field907.method207((byte) 80, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class36.field907.method207((byte) 80, 2);
        if (arg0 != 17143) {
            providesignlink(null);
        }
        if (var2 == 0) {
            class13.field380[class109.field2727++] = 2047;
        } else if (var2 == 1) {
            int var3 = class36.field907.method207((byte) 80, 3);
            class82.field1932.method22((byte) -124, false, var3);
            int var4 = class36.field907.method207((byte) 80, 1);
            if (var4 == 1) {
                class13.field380[class109.field2727++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class36.field907.method207((byte) 80, 3);
            class82.field1932.method22((byte) -116, true, var5);
            int var6 = class36.field907.method207((byte) 80, 3);
            class82.field1932.method22((byte) -112, true, var6);
            int var7 = class36.field907.method207((byte) 80, 1);
            if (var7 == 1) {
                class13.field380[class109.field2727++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class36.field907.method207((byte) 80, 1);
            if (var8 == 1) {
                class13.field380[class109.field2727++] = 2047;
            }
            class54.field1344 = class36.field907.method207((byte) 80, 2);
            int var9 = class36.field907.method207((byte) 80, 1);
            int var10 = class36.field907.method207((byte) 80, 7);
            int var11 = class36.field907.method207((byte) 80, 7);
            class82.field1932.method24(var10, (byte) -28, var9 == 1, var11);
        }
    }

    @OriginalMember(owner = "client!pa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 940)
    public final String getParameter(String arg0) {
        field2135++;
        if (class80.field1882 == null) {
            return class25.field631 == null || class25.field631.field34 == this ? super.getParameter(arg0) : class25.field631.field34.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/lang/String;IIIIILjava/net/InetAddress;)V", line = 955)
    public final void method698(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, InetAddress arg7) {
        field2133++;
        try {
            class118.field2912 = arg0;
            class116.field2869 = this;
            class7.field270 = arg3;
            class46.field1218 = arg6;
            int var9 = 27 % ((57 - arg4) / 53);
            class80.field1882 = new Frame();
            class80.field1882.setTitle("Jagex");
            class80.field1882.setResizable(false);
            class80.field1882.addWindowListener(this);
            class80.field1882.setVisible(true);
            class80.field1882.toFront();
            Insets var10 = class80.field1882.getInsets();
            class80.field1882.setSize(var10.left + arg3 + var10.right, var10.top + arg6 + var10.bottom);
            class87.field2044 = class25.field631 = new class2(true, null, arg7, arg5, arg1, arg2);
            class25.field631.method13(1, this, 0);
        } catch (Exception var12) {
            class118.method932(var12, null, 1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V", line = 985)
    public final synchronized void method699(byte arg0) {
        field2137++;
        Container var2;
        if (class80.field1882 == null) {
            var2 = class25.field631.field34;
        } else {
            var2 = class80.field1882;
        }
        if (class9.field305 != null) {
            class9.field305.removeFocusListener(this);
            var2.remove(class9.field305);
        }
        class9.field305 = new class52(this);
        var2.add(class9.field305);
        class9.field305.setSize(class7.field270, class46.field1218);
        if (arg0 != 40) {
            method697(-39);
        }
        class9.field305.setVisible(true);
        if (class80.field1882 == null) {
            class9.field305.setLocation(0, 0);
        } else {
            Insets var3 = class80.field1882.getInsets();
            class9.field305.setLocation(var3.left, var3.top);
        }
        class9.field305.addFocusListener(this);
        class9.field305.requestFocus();
        class120.field2979 = true;
        class80.field1890 = false;
        class75.field1787 = class95.method728(128);
    }

    @OriginalMember(owner = "client!pa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 1038)
    public final URL getCodeBase() {
        field2168++;
        if (class80.field1882 == null) {
            return class25.field631 == null || class25.field631.field34 == this ? super.getCodeBase() : class25.field631.field34.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "destroy", descriptor = "()V", line = 1056)
    public final void destroy() {
        field2153++;
        if (class116.field2869 == this && !class63.field1543) {
            class100.field2438 = class95.method728(128);
            class121.method958(5000L, (byte) 67);
            class87.field2044 = null;
            this.method694(0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public abstract void method153(int arg0);

    @OriginalMember(owner = "client!pa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public abstract void method154(int arg0);

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public abstract void method148(byte arg0);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public abstract void method147(boolean arg0);
}
