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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class100 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "Z")
    private boolean field2499 = false;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Lv;")
    private static class122 field2476 = class55.method425(-85, "Loaded fonts");

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lv;")
    private static class122 field2462 = class55.method425(-80, "Private chat");

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lv;")
    public static class122 field2463 = field2476;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "Lv;")
    public static class122 field2502 = class55.method425(-50, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lv;")
    public static class122 field2464 = class55.method425(-114, "scrollbar");

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "Lv;")
    private static class122 field2493 = class55.method425(-98, "Use");

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lv;")
    public static class122 field2494 = class55.method425(-116, "lila:");

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Lv;")
    public static class122 field2491 = field2462;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lv;")
    public static class122 field2479 = class55.method425(-52, "(U(Y");

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "Lv;")
    public static class122 field2508 = class55.method425(-68, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "Lv;")
    public static class122 field2501 = class55.method425(-127, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "Lv;")
    public static class122 field2505 = field2493;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "Lv;")
    public static class122 field2513 = class55.method425(-53, "backtop1");

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lv;")
    public static class122 field2475 = class55.method425(-107, "sch\u001c1tteln:");

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Lv;")
    public static class122 field2482 = class55.method425(-60, "::fpsoff");

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Ljb;")
    public static class56 field2469 = new class56(64);

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Lab;")
    public static class3 field2466;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "Z")
    public static boolean field2516;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
    public static int[] field2484;

    @OriginalMember(owner = "client!qd", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field2498++;
        try {
            if (class57.field1506 != null) {
                String var1 = class57.field1506.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class57.field1493;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method763(-8240, "wrongjava");
                        return;
                    }
                    class81.field2115 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class57.field1493 == null || class57.field1493.equals("1.4.2"))) {
                    this.method763(-8240, "wrongjava");
                    return;
                }
            }
            this.method767((byte) -62);
            class47.field1223 = class74.method616(class54.field1411, class30.field767, class49.field1254, 1);
            this.method176((byte) -120);
            class131.field3140 = class119.method909((byte) 59);
            class131.field3140.method54(true);
            while (class102.field2537 == 0L || class102.field2537 > System.currentTimeMillis()) {
                class7.field173 = class131.field3140.method56(4, class42.field1118, class81.field2115);
                for (int var3 = 0; var3 < class7.field173; var3++) {
                    this.method770(31);
                }
                this.method771(-29126);
            }
        } catch (Exception var5) {
            class84.method678(null, var5, 1);
            this.method763(-8240, "crash");
        }
        this.method761(0);
    }

    @OriginalMember(owner = "client!qd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 68)
    public final String getParameter(String arg0) {
        field2497++;
        if (class29.field734 == null) {
            return class2.field70 == null || class2.field70.field1497 == this ? super.getParameter(arg0) : class2.field70.field1497.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "providesignlink", descriptor = "(Ljc;)V", line = 82)
    public static final void providesignlink(class57 arg0) {
        class2.field70 = arg0;
        class81.field2125 = arg0;
        field2481++;
    }

    @OriginalMember(owner = "client!qd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 96)
    public final URL getDocumentBase() {
        field2483++;
        if (class29.field734 == null) {
            return class2.field70 == null || class2.field70.field1497 == this ? super.getDocumentBase() : class2.field70.field1497.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 112)
    public final AppletContext getAppletContext() {
        field2503++;
        if (class29.field734 == null) {
            return class2.field70 == null || class2.field70.field1497 == this ? super.getAppletContext() : class2.field70.field1497.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 136)
    private final synchronized void method761(int arg0) {
        field2487++;
        if (class94.field2422) {
            return;
        }
        class94.field2422 = true;
        try {
            class54.field1411.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method183(false);
        } catch (Exception var4) {
        }
        if (class29.field734 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != 0) {
            field2508 = null;
        }
        if (class2.field70 != null) {
            try {
                class2.field70.method447(false);
            } catch (Exception var2) {
            }
        }
        this.method177(-3);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILmb;IBI)[B", line = 186)
    public static final byte[] method762(int arg0, class74 arg1, int arg2, byte arg3, int arg4) {
        field2467++;
        long var5 = ((long) arg4 << 32) + (long) (arg0 << 16) + (long) (arg0 * 37 - -arg2 & 0xFFFF);
        if (class113.field2754 != null) {
            class38 var7 = (class38) class113.field2754.method436(-127, var5);
            if (var7 != null) {
                return var7.field1000;
            }
        }
        if (arg3 != 47) {
            method772((byte) 77);
        }
        byte[] var8 = arg1.method611(0, arg0, arg2);
        if (var8 == null) {
            return null;
        } else {
            if (class113.field2754 != null) {
                class113.field2754.method437(var5, new class38(var8), (byte) 69);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;)V", line = 221)
    public final void method763(int arg0, String arg1) {
        if (arg0 != -8240) {
            return;
        }
        field2511++;
        if (this.field2499) {
            return;
        }
        this.field2499 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V", line = 242)
    public static final void method764(byte arg0) {
        class80.field2102 = 0;
        field2472++;
        class107.field2661 = 0;
        class103.method791(-7899);
        class29.method277(-14960);
        class61.method464(9042);
        for (int var1 = 0; var1 < class80.field2102; var1++) {
            int var3 = class126.field3067[var1];
            if (class16.field396 != class94.field2423[var3].field333) {
                class94.field2423[var3].field2089 = null;
                class94.field2423[var3] = null;
            }
        }
        if (class74.field1969 != class14.field372.field1617) {
            throw new RuntimeException("gnp1 pos:" + class14.field372.field1617 + " psize:" + class74.field1969);
        }
        if (arg0 < 98) {
            field2491 = null;
        }
        for (int var2 = 0; var2 < class49.field1245; var2++) {
            if (class94.field2423[class21.field581[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class49.field1245);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 292)
    public final void windowDeiconified(WindowEvent arg0) {
        field2507++;
    }

    @OriginalMember(owner = "client!qd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 301)
    public final void windowActivated(WindowEvent arg0) {
        field2492++;
    }

    @OriginalMember(owner = "client!qd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 311)
    public final void windowClosed(WindowEvent arg0) {
        field2465++;
    }

    @OriginalMember(owner = "client!qd", name = "start", descriptor = "()V", line = 324)
    public final void start() {
        field2488++;
        if (class6.field152 == this && !class94.field2422) {
            class102.field2537 = 0L;
        }
    }

    @OriginalMember(owner = "client!qd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 342)
    public final synchronized void paint(Graphics arg0) {
        field2470++;
        if (class6.field152 != this || class94.field2422) {
            return;
        }
        class81.field2121 = true;
        if (class57.field1493 == null || !class57.field1493.startsWith("1.5") || System.currentTimeMillis() - class50.field1275 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        if (var2 == null) {
            System.out.println("Rect: null");
        } else {
            System.out.println("Rect: " + var2.x + "," + var2.y + "," + var2.width + "," + var2.height);
        }
        if (var2 == null || class49.field1254 <= var2.width && class30.field767 <= var2.height) {
            class5.field133 = true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 375)
    public final void focusGained(FocusEvent arg0) {
        class37.field979 = true;
        class81.field2121 = true;
        field2485++;
    }

    @OriginalMember(owner = "client!qd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 385)
    public final void windowClosing(WindowEvent arg0) {
        field2477++;
        this.destroy();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V", line = 394)
    public final void method765(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -24) {
            return;
        }
        field2496++;
        try {
            if (class6.field152 == null) {
                class6.field152 = this;
                class83.field2163 = arg1;
                class30.field767 = arg2;
                class49.field1254 = arg4;
                if (class2.field70 == null) {
                    class81.field2125 = class2.field70 = new class57(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg3, null, 0);
                }
                class2.field70.method442(1, this, false);
            } else {
                this.method763(-8240, "alreadyloaded");
            }
        } catch (Exception var7) {
            class84.method678(null, var7, 1);
            this.method763(-8240, "crash");
        }
    }

    @OriginalMember(owner = "client!qd", name = "stop", descriptor = "()V", line = 434)
    public final void stop() {
        field2486++;
        if (class6.field152 == this && !class94.field2422) {
            class102.field2537 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;IBLjava/net/InetAddress;IIII)V", line = 448)
    public final void method766(String arg0, int arg1, byte arg2, InetAddress arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class49.field1254 = arg5;
            class30.field767 = arg7;
            class83.field2163 = arg6;
            if (arg2 != 15) {
                field2464 = null;
            }
            class6.field152 = this;
            class29.field734 = new Frame();
            class29.field734.setTitle("Jagex");
            class29.field734.setResizable(false);
            class29.field734.addWindowListener(this);
            class29.field734.setVisible(true);
            class29.field734.toFront();
            Insets var9 = class29.field734.getInsets();
            class29.field734.setSize(var9.left + arg5 + var9.right, var9.top + arg7 + var9.bottom);
            class81.field2125 = class2.field70 = new class57(true, null, arg3, arg1, arg0, arg4);
            class2.field70.method442(1, this, false);
        } catch (Exception var11) {
            class84.method678(null, var11, 1);
        }
        field2468++;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V", line = 484)
    public final synchronized void method767(byte arg0) {
        field2474++;
        if (arg0 > -41) {
            return;
        }
        System.out.println("addcanvas");
        Container var2;
        if (class29.field734 == null) {
            var2 = class2.field70.field1497;
        } else {
            var2 = class29.field734;
        }
        if (class54.field1411 != null) {
            class54.field1411.removeFocusListener(this);
            var2.remove(class54.field1411);
        }
        class54.field1411 = new class40(this);
        var2.add(class54.field1411);
        class54.field1411.setSize(class49.field1254, class30.field767);
        class54.field1411.setVisible(true);
        if (class29.field734 == null) {
            class54.field1411.setLocation(0, 0);
        } else {
            Insets var3 = class29.field734.getInsets();
            class54.field1411.setLocation(var3.left, var3.top);
        }
        class54.field1411.addFocusListener(this);
        class54.field1411.requestFocus();
        class81.field2121 = true;
        class5.field133 = false;
        class50.field1275 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!qd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 529)
    public final void windowIconified(WindowEvent arg0) {
        field2473++;
    }

    @OriginalMember(owner = "client!qd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 537)
    public final void focusLost(FocusEvent arg0) {
        class37.field979 = false;
        field2506++;
    }

    @OriginalMember(owner = "client!qd", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 556)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2490++;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)Z", line = 570)
    public final boolean method768(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field2471++;
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
            return true;
        } else if (arg0 != 48) {
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
                this.method763(-8240, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V", line = 604)
    public static void method769(int arg0) {
        field2463 = null;
        field2466 = null;
        field2462 = null;
        field2491 = null;
        field2513 = null;
        field2494 = null;
        field2476 = null;
        field2479 = null;
        if (arg0 < 85) {
            method772((byte) -26);
        }
        field2469 = null;
        field2493 = null;
        field2505 = null;
        field2475 = null;
        field2508 = null;
        field2482 = null;
        field2502 = null;
        field2464 = null;
        field2484 = null;
        field2501 = null;
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V", line = 641)
    private final void method770(int arg0) {
        field2504++;
        long var2 = System.currentTimeMillis();
        long var4 = class69.field1821[class8.field179];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class69.field1821[class8.field179] = var2;
        class8.field179 = arg0 & class8.field179 + 1;
        synchronized (this) {
            class55.field1428 = class37.field979;
        }
        this.method175(25);
    }

    @OriginalMember(owner = "client!qd", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 668)
    public final URL getCodeBase() {
        field2495++;
        if (class29.field734 == null) {
            return class2.field70 == null || class2.field70.field1497 == this ? super.getCodeBase() : class2.field70.field1497.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 687)
    public final void windowDeactivated(WindowEvent arg0) {
        field2478++;
    }

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)V", line = 694)
    private final void method771(int arg0) {
        field2514++;
        long var2 = class74.field1983[class10.field236];
        long var4 = System.currentTimeMillis();
        class74.field1983[class10.field236] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class120.field2903 = ((var6 >> 1) + 32000) / var6;
        }
        class10.field236 = class10.field236 + 1 & 0x1F;
        if (class75.field2008++ > 50) {
            class81.field2121 = true;
            class75.field2008 -= 50;
            class54.field1411.setSize(class49.field1254, class30.field767);
            class54.field1411.setVisible(true);
            if (class29.field734 == null) {
                class54.field1411.setLocation(0, 0);
            } else {
                Insets var7 = class29.field734.getInsets();
                class54.field1411.setLocation(var7.left, var7.top);
            }
        }
        this.method187(-103);
        if (arg0 != -29126) {
            field2508 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 746)
    public final void windowOpened(WindowEvent arg0) {
        field2500++;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)V", line = 762)
    public static final void method772(byte arg0) {
        class7.field162.method434((byte) -76);
        class122.field2981.method434((byte) -76);
        field2510++;
        if (arg0 < 81) {
            method762(74, null, 24, (byte) 58, 74);
        }
    }

    @OriginalMember(owner = "client!qd", name = "destroy", descriptor = "()V", line = 774)
    public final void destroy() {
        field2509++;
        if (class6.field152 == this && !class94.field2422) {
            class102.field2537 = System.currentTimeMillis();
            class30.method282((byte) -53, 5000L);
            class81.field2125 = null;
            this.method761(0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public abstract void method183(boolean arg0);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public abstract void method175(int arg0);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public abstract void method176(byte arg0);

    @OriginalMember(owner = "client!qd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public abstract void method187(int arg0);

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public abstract void method177(int arg0);
}
