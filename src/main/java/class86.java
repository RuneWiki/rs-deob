import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.InetAddress;
import java.net.URL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class86 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Z")
    private boolean field2280 = false;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2259 = new CRC32();

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Lke;")
    private static class65 field2277 = class1.method17("You need a members account to login to this world)3", -124);

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lke;")
    public static class65 field2272 = field2277;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Lke;")
    public static class65 field2291 = class1.method17("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>", -122);

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "[Lke;")
    public static class65[] field2286 = new class65[200];

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "Lke;")
    private static class65 field2285 = class1.method17("Bad session id)3", -122);

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "[I")
    public static int[] field2294 = new int[256];

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "Lke;")
    public static class65 field2300 = field2285;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "Lke;")
    public static class65 field2297 = class1.method17("Die Adresse dieses Computers wurde gesperrt)1", -112);

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "Lke;")
    private static class65 field2301 = class1.method17("The server is being updated)3", -128);

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "Lke;")
    public static class65 field2292 = field2301;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "Lpa;")
    public static class90 field2290;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "Z")
    public static boolean field2303;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "[Lkb;")
    public static class61[] field2278;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V", line = 6)
    private final void method761(byte arg0) {
        long var2 = System.currentTimeMillis();
        field2255++;
        long var4 = class41.field1054[class93.field2461];
        class41.field1054[class93.field2461] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class31.field822 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 < 25) {
            this.start();
        }
        class93.field2461 = class93.field2461 + 1 & 0x1F;
        if (class79.field2102++ > 50) {
            class79.field2102 -= 50;
            class5.field90 = true;
            class10.field210.setSize(class23.field566, class31.field818);
            class10.field210.setVisible(true);
            if (class87.field2330 == null) {
                class10.field210.setLocation(0, 0);
            } else {
                Insets var7 = class87.field2330.getInsets();
                class10.field210.setLocation(var7.left, var7.top);
            }
        }
        this.method143(-119);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 49)
    public final void method762(String arg0, byte arg1) {
        field2283++;
        if (this.field2280) {
            return;
        }
        this.field2280 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
        int var3 = -80 % ((arg1 - 71) / 47);
    }

    @OriginalMember(owner = "client!oc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 73)
    public final void focusLost(FocusEvent arg0) {
        field2264++;
        class55.field1414 = false;
    }

    @OriginalMember(owner = "client!oc", name = "start", descriptor = "()V", line = 83)
    public final void start() {
        field2282++;
        if (class73.field1958 == this && !class117.field2938) {
            class31.field816 = 0L;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 99)
    public static void method763(int arg0) {
        field2301 = null;
        field2259 = null;
        field2277 = null;
        field2290 = null;
        field2294 = null;
        int var1 = -103 / ((36 - arg0) / 42);
        field2297 = null;
        field2300 = null;
        field2285 = null;
        field2286 = null;
        field2292 = null;
        field2272 = null;
        field2291 = null;
        field2278 = null;
    }

    @OriginalMember(owner = "client!oc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 120)
    public final URL getDocumentBase() {
        field2281++;
        if (class87.field2330 == null) {
            return class72.field1891 == null || class72.field1891.field316 == this ? super.getDocumentBase() : class72.field1891.field316.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V", line = 134)
    public final void method764(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2269++;
        try {
            if (class73.field1958 == null) {
                client.field397 = arg0;
                class73.field1958 = this;
                if (arg3 != 0) {
                    this.stop();
                }
                class31.field818 = arg1;
                class23.field566 = arg4;
                if (class72.field1891 == null) {
                    class21.field515 = class72.field1891 = new class15(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg2, null, 0);
                }
                class72.field1891.method95((byte) 21, this, 1);
            } else {
                this.method762("alreadyloaded", (byte) 122);
            }
        } catch (Exception var7) {
            class129.method1015(-118, var7, null);
            this.method762("crash", (byte) 124);
        }
    }

    @OriginalMember(owner = "client!oc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 166)
    public final void windowDeactivated(WindowEvent arg0) {
        field2288++;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V", line = 183)
    private final void method765(byte arg0) {
        field2289++;
        long var2 = System.currentTimeMillis();
        long var4 = class9.field163[class48.field1260];
        if (arg0 > -102) {
            this.paint(null);
        }
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class9.field163[class48.field1260] = var2;
        class48.field1260 = class48.field1260 + 1 & 0x1F;
        synchronized (this) {
            class101.field2632 = class55.field1414;
        }
        this.method145((byte) 125);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V", line = 217)
    public static final void method766(byte arg0, int arg1) {
        if (arg1 == -3) {
            class78.method684((byte) 10, class113.field2807, class48.field1253, class72.field1905);
        } else if (arg1 == -2) {
            class78.method684((byte) 10, class72.field1917, class70.field1795, class72.field1912);
        } else if (arg1 == -1) {
            class78.method684((byte) 10, class112.field2772, class48.field1249, class72.field1913);
        } else if (arg1 == 3) {
            class78.method684((byte) 10, class72.field1926, class77.field2055, class72.field1915);
        } else if (arg1 == 4) {
            class78.method684((byte) 10, class28.field751, class104.field2693, class72.field1908);
        } else if (arg1 == 5) {
            class78.method684((byte) 10, class99.field2570, class102.field2649, class72.field1911);
        } else if (arg1 == 6) {
            class78.method684((byte) 10, class70.field1822, class73.field1939, class72.field1898);
        } else if (arg1 == 7) {
            class78.method684((byte) 10, class3.field53, class24.field613, class72.field1916);
        } else if (arg1 == 8) {
            class78.method684((byte) 10, class50.field1268, class39.field1017, class72.field1907);
        } else if (arg1 == 9) {
            class78.method684((byte) 10, class29.field779, class78.field2089, class72.field1918);
        } else if (arg1 == 10) {
            class78.method684((byte) 10, class50.field1271, field2300, class72.field1910);
        } else if (arg1 == 11) {
            class78.method684((byte) 10, class22.field542, class111.field2747, class72.field1909);
        } else if (arg1 == 12) {
            class78.method684((byte) 10, field2272, class97.field2506, class72.field1920);
        } else if (arg1 == 13) {
            class78.method684((byte) 10, class99.field2558, class48.field1251, class72.field1924);
        } else if (arg1 == 14) {
            class78.method684((byte) 10, field2292, class91.field2416, class72.field1929);
        } else if (arg1 == 16) {
            class78.method684((byte) 10, class111.field2745, class91.field2419, class72.field1919);
        } else if (arg1 == 17) {
            class78.method684((byte) 10, class1.field39, class81.field2160, class72.field1923);
        } else if (arg1 == 18) {
            class78.method684((byte) 10, class53.field1350, class73.field1943, class72.field1899);
        } else if (arg1 == 20) {
            class78.method684((byte) 10, class129.field3112, class48.field1250, class72.field1902);
        } else if (arg1 == 22) {
            class78.method684((byte) 10, class46.field1212, class17.field362, class72.field1922);
        } else if (arg1 == 23) {
            class78.method684((byte) 10, class22.field532, class91.field2415, class72.field1928);
        } else if (arg1 == 24) {
            class78.method684((byte) 10, class93.field2454, class94.field2495, class72.field1901);
        } else if (arg1 == 25) {
            class78.method684((byte) 10, class55.field1438, class48.field1248, class72.field1930);
        } else if (arg1 == 26) {
            class78.method684((byte) 10, class52.field1332, class33.field867, class72.field1914);
        } else {
            class78.method684((byte) 10, class131.field3188, class48.field1258, class72.field1904);
        }
        class75.method663((byte) -127, 10);
        if (arg0 < 76) {
            field2272 = null;
        }
        field2276++;
    }

    @OriginalMember(owner = "client!oc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 326)
    public final String getParameter(String arg0) {
        field2284++;
        if (class87.field2330 == null) {
            return class72.field1891 == null || class72.field1891.field316 == this ? super.getParameter(arg0) : class72.field1891.field316.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 342)
    public final void windowActivated(WindowEvent arg0) {
        field2268++;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V", line = 351)
    public static final void method767(byte arg0) {
        int var1 = 51 / ((-arg0 - 67) / 55);
        field2293++;
        if (class46.field1215 != 1) {
            return;
        }
        if (class1.field42 >= 539 && class1.field42 <= 573 && class115.field2901 >= 169 && class115.field2901 < 205 && class27.field728[0] != -1) {
            class89.field2368 = 0;
            class116.field2910 = true;
            class128.field3089 = true;
        }
        if (class1.field42 >= 569 && class1.field42 <= 599 && class115.field2901 >= 168 && class115.field2901 < 205 && class27.field728[1] != -1) {
            class116.field2910 = true;
            class128.field3089 = true;
            class89.field2368 = 1;
        }
        if (class1.field42 >= 597 && class1.field42 <= 627 && class115.field2901 >= 168 && class115.field2901 < 205 && class27.field728[2] != -1) {
            class128.field3089 = true;
            class116.field2910 = true;
            class89.field2368 = 2;
        }
        if (class1.field42 >= 625 && class1.field42 <= 669 && class115.field2901 >= 168 && class115.field2901 < 203 && class27.field728[3] != -1) {
            class89.field2368 = 3;
            class116.field2910 = true;
            class128.field3089 = true;
        }
        if (class1.field42 >= 666 && class1.field42 <= 696 && class115.field2901 >= 168 && class115.field2901 < 205 && class27.field728[4] != -1) {
            class116.field2910 = true;
            class128.field3089 = true;
            class89.field2368 = 4;
        }
        if (class1.field42 >= 694 && class1.field42 <= 724 && class115.field2901 >= 168 && class115.field2901 < 205 && class27.field728[5] != -1) {
            class128.field3089 = true;
            class89.field2368 = 5;
            class116.field2910 = true;
        }
        if (class1.field42 >= 722 && class1.field42 <= 756 && class115.field2901 >= 169 && class115.field2901 < 205 && class27.field728[6] != -1) {
            class116.field2910 = true;
            class89.field2368 = 6;
            class128.field3089 = true;
        }
        if (class1.field42 >= 540 && class1.field42 <= 574 && class115.field2901 >= 466 && class115.field2901 < 502 && class27.field728[7] != -1) {
            class128.field3089 = true;
            class89.field2368 = 7;
            class116.field2910 = true;
        }
        if (class1.field42 >= 572 && class1.field42 <= 602 && class115.field2901 >= 466 && class115.field2901 < 503 && class27.field728[8] != -1) {
            class89.field2368 = 8;
            class116.field2910 = true;
            class128.field3089 = true;
        }
        if (class1.field42 >= 599 && class1.field42 <= 629 && class115.field2901 >= 466 && class115.field2901 < 503 && class27.field728[9] != -1) {
            class128.field3089 = true;
            class116.field2910 = true;
            class89.field2368 = 9;
        }
        if (class1.field42 >= 627 && class1.field42 <= 671 && class115.field2901 >= 467 && class115.field2901 < 502 && class27.field728[10] != -1) {
            class89.field2368 = 10;
            class128.field3089 = true;
            class116.field2910 = true;
        }
        if (class1.field42 >= 669 && class1.field42 <= 699 && class115.field2901 >= 466 && class115.field2901 < 503 && class27.field728[11] != -1) {
            class116.field2910 = true;
            class128.field3089 = true;
            class89.field2368 = 11;
        }
        if (class1.field42 >= 696 && class1.field42 <= 726 && class115.field2901 >= 466 && class115.field2901 < 503 && class27.field728[12] != -1) {
            class128.field3089 = true;
            class89.field2368 = 12;
            class116.field2910 = true;
        }
        if (class1.field42 >= 724 && class1.field42 <= 758 && class115.field2901 >= 466 && class115.field2901 < 502 && class27.field728[13] != -1) {
            class116.field2910 = true;
            class128.field3089 = true;
            class89.field2368 = 13;
            return;
        }
    }

    @OriginalMember(owner = "client!oc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 471)
    public final AppletContext getAppletContext() {
        field2256++;
        if (class87.field2330 == null) {
            return class72.field1891 == null || class72.field1891.field316 == this ? super.getAppletContext() : class72.field1891.field316.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 487)
    public final URL getCodeBase() {
        field2274++;
        if (class87.field2330 == null) {
            return class72.field1891 == null || class72.field1891.field316 == this ? super.getCodeBase() : class72.field1891.field316.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 501)
    public final void windowIconified(WindowEvent arg0) {
        field2254++;
    }

    @OriginalMember(owner = "client!oc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 509)
    public final void windowOpened(WindowEvent arg0) {
        field2265++;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 516)
    private final synchronized void method768(int arg0) {
        field2267++;
        if (class117.field2938) {
            return;
        }
        class117.field2938 = true;
        try {
            if (arg0 != 0) {
                field2300 = null;
            }
            class10.field210.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method150(-114);
        } catch (Exception var4) {
        }
        if (class87.field2330 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class72.field1891 != null) {
            try {
                class72.field1891.method97(true);
            } catch (Exception var2) {
            }
        }
        this.method146(0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;IILjava/net/InetAddress;IIBI)V", line = 573)
    public final void method769(String arg0, int arg1, int arg2, InetAddress arg3, int arg4, int arg5, byte arg6, int arg7) {
        try {
            class23.field566 = arg5;
            class31.field818 = arg2;
            client.field397 = arg7;
            if (arg6 != -92) {
                field2294 = null;
            }
            class73.field1958 = this;
            class87.field2330 = new Frame();
            class87.field2330.setTitle("Jagex");
            class87.field2330.setResizable(false);
            class87.field2330.addWindowListener(this);
            class87.field2330.setVisible(true);
            class87.field2330.toFront();
            Insets var9 = class87.field2330.getInsets();
            class87.field2330.setSize(arg5 + var9.left + var9.right, var9.top + var9.bottom + arg2);
            class21.field515 = class72.field1891 = new class15(true, null, arg3, arg1, arg0, arg4);
            class72.field1891.method95((byte) 21, this, 1);
        } catch (Exception var11) {
            class129.method1015(arg6 ^ 0xC, var11, null);
        }
        field2299++;
    }

    @OriginalMember(owner = "client!oc", name = "run", descriptor = "()V", line = 608)
    public final void run() {
        field2275++;
        try {
            if (class15.field312 != null) {
                String var1 = class15.field312.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class15.field297;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method762("wrongjava", (byte) -63);
                        return;
                    }
                    class80.field2133 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class15.field297 == null || class15.field297.equals("1.4.2"))) {
                    this.method762("wrongjava", (byte) -64);
                    return;
                }
            }
            this.method773(-3);
            class22.field535 = class87.method776(class23.field566, class31.field818, class10.field210, 125);
            this.method151(true);
            class113.field2816 = class43.method373(65);
            class113.field2816.method62(103);
            while (class31.field816 == 0L || class31.field816 > System.currentTimeMillis()) {
                class21.field500 = class113.field2816.method61(true, class80.field2133, class4.field80);
                for (int var3 = 0; var3 < class21.field500; var3++) {
                    this.method765((byte) -119);
                }
                this.method761((byte) 110);
            }
        } catch (Exception var5) {
            class129.method1015(-112, var5, null);
            this.method762("crash", (byte) 125);
        }
        this.method768(0);
    }

    @OriginalMember(owner = "client!oc", name = "destroy", descriptor = "()V", line = 678)
    public final void destroy() {
        field2257++;
        if (class73.field1958 == this && !class117.field2938) {
            class31.field816 = System.currentTimeMillis();
            class58.method498(5000L, 10);
            class21.field515 = null;
            this.method768(0);
        }
    }

    @OriginalMember(owner = "client!oc", name = "providesignlink", descriptor = "(Lcc;)V", line = 695)
    public static final void providesignlink(class15 arg0) {
        field2260++;
        class72.field1891 = arg0;
        class21.field515 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 709)
    public final void windowDeiconified(WindowEvent arg0) {
        field2271++;
    }

    @OriginalMember(owner = "client!oc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 717)
    public final synchronized void paint(Graphics arg0) {
        field2287++;
        if (class73.field1958 != this || class117.field2938) {
            return;
        }
        class5.field90 = true;
        if (class15.field297 == null || !class15.field297.startsWith("1.5") || System.currentTimeMillis() - class56.field1460 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        if (var2 == null) {
            System.out.println("Rect: null");
        } else {
            System.out.println("Rect: " + var2.x + "," + var2.y + "," + var2.width + "," + var2.height);
        }
        if (var2 == null || var2.width >= class23.field566 && class31.field818 <= var2.height) {
            class19.field411 = true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 747)
    public final void windowClosing(WindowEvent arg0) {
        field2262++;
        this.destroy();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 756)
    public static final void method770(Component arg0, int arg1) {
        field2261++;
        if (arg1 != 168) {
            method772(11, -10, 56, 101, 63);
        }
        arg0.removeKeyListener(class52.field1327);
        arg0.removeFocusListener(class52.field1327);
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Z", line = 771)
    public final boolean method771(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        int var3 = 48 % ((-arg0 - 83) / 36);
        field2266++;
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
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method762("invalidhost", (byte) -117);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 805)
    public final void update(Graphics arg0) {
        field2273++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!oc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 813)
    public final void windowClosed(WindowEvent arg0) {
        field2296++;
    }

    @OriginalMember(owner = "client!oc", name = "stop", descriptor = "()V", line = 820)
    public final void stop() {
        field2298++;
        if (class73.field1958 == this && !class117.field2938) {
            class31.field816 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "client!oc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 841)
    public final void focusGained(FocusEvent arg0) {
        field2270++;
        class55.field1414 = true;
        class5.field90 = true;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIIII)V", line = 867)
    public static final void method772(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2258++;
        int var5 = arg4;
        if (arg1 != -1) {
            return;
        }
        while (var5 <= arg4 + arg3) {
            for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class76.field2039[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class24.field611[0][var6][var5] = class24.field611[0][var6 - 1][var5];
                    }
                    if (arg0 + arg2 == var6 && var6 < 103) {
                        class24.field611[0][var6][var5] = class24.field611[0][var6 + 1][var5];
                    }
                    if (arg4 == var5 && var5 > 0) {
                        class24.field611[0][var6][var5] = class24.field611[0][var6][var5 - 1];
                    }
                    if (arg3 + arg4 == var5 && var5 < 103) {
                        class24.field611[0][var6][var5] = class24.field611[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V", line = 917)
    public final synchronized void method773(int arg0) {
        field2279++;
        System.out.println("addcanvas");
        if (arg0 != -3) {
            field2286 = null;
        }
        Container var2;
        if (class87.field2330 == null) {
            var2 = class72.field1891.field316;
        } else {
            var2 = class87.field2330;
        }
        if (class10.field210 != null) {
            class10.field210.removeFocusListener(this);
            var2.remove(class10.field210);
        }
        class10.field210 = new class56(this);
        var2.add(class10.field210);
        class10.field210.setSize(class23.field566, class31.field818);
        class10.field210.setVisible(true);
        if (class87.field2330 == null) {
            class10.field210.setLocation(0, 0);
        } else {
            Insets var3 = class87.field2330.getInsets();
            class10.field210.setLocation(var3.left, var3.top);
        }
        class10.field210.addFocusListener(this);
        class10.field210.requestFocus();
        class5.field90 = true;
        class19.field411 = false;
        class56.field1460 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public abstract void method145(byte arg0);

    @OriginalMember(owner = "client!oc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public abstract void method151(boolean arg0);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public abstract void method143(int arg0);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    public abstract void method150(int arg0);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public abstract void method146(int arg0);
}
