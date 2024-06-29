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
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class109 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Z")
    private boolean field2684 = false;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Loc;")
    private static class99 field2665 = class48.method402((byte) -104, " million");

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "Loc;")
    public static class99 field2685 = field2665;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "Loc;")
    public static class99 field2694 = class48.method402((byte) -104, "backvmid2");

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lrd;")
    public static class119 field2668 = new class119(512);

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Loc;")
    public static class99 field2698 = class48.method402((byte) -104, " )2> ");

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "Loc;")
    public static class99 field2703 = class48.method402((byte) -104, "");

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "Loc;")
    private static class99 field2701 = class48.method402((byte) -104, "World");

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Loc;")
    public static class99 field2697 = class48.method402((byte) -104, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "Loc;")
    public static class99 field2704 = field2703;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "[[S")
    public static short[][] field2696 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "Loc;")
    public static class99 field2702 = field2703;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "Loc;")
    public static class99 field2708 = field2701;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "Loc;")
    public static class99 field2707 = field2703;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Loc;")
    public static class99 field2709 = field2703;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field2699 = 0;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "Loc;")
    public static class99 field2710 = field2703;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Loc;")
    public static class99 field2711 = field2703;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "Loc;")
    public static class99 field2700 = field2701;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "Lpc;")
    public static class105 field2706;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Lne;")
    public static class95 field2695;

    @OriginalMember(owner = "client!qa", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2667++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method202(int arg0);

    @OriginalMember(owner = "client!qa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2678++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Component;IZILhb;)Lub;")
    public static final class134 method930(Component arg0, int arg1, boolean arg2, int arg3, class50 arg4) {
        field2661++;
        if (class33.field792 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class134 var5 = (class134) Class.forName("rc").getDeclaredConstructor().newInstance();
                var5.field3265 = new int[(class130.field3203 ? 2 : 1) * 256];
                var5.field3287 = arg1;
                var5.method551(arg0);
                var5.field3286 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field3286 > 16384) {
                    var5.field3286 = 16384;
                }
                var5.method545(var5.field3286);
                if (arg2) {
                    method937(62);
                }
                if (class63.field1673 > 0 && class67.field1730 == null) {
                    class67.field1730 = new class69();
                    arg4.method424((byte) 50, class67.field1730, class63.field1673);
                }
                if (class67.field1730 != null) {
                    if (class67.field1730.field1787[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class67.field1730.field1787[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class62 var6 = new class62(arg4, arg3);
                    var6.field3287 = arg1;
                    var6.field3265 = new int[(class130.field3203 ? 2 : 1) * 256];
                    var6.method551(arg0);
                    var6.field3286 = 16384;
                    var6.method545(var6.field3286);
                    if (class63.field1673 > 0 && class67.field1730 == null) {
                        class67.field1730 = new class69();
                        arg4.method424((byte) 85, class67.field1730, class63.field1673);
                    }
                    if (class67.field1730 != null) {
                        if (class67.field1730.field1787[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class67.field1730.field1787[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class134();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2692++;
        if (class142.field3507 == null) {
            return class43.field1058 == null || class43.field1058.field1214 == this ? super.getParameter(arg0) : class43.field1058.field1214.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2676++;
    }

    @OriginalMember(owner = "client!qa", name = "stop", descriptor = "()V")
    public final void stop() {
        field2679++;
        if (class34.field857 == this && !class63.field1677) {
            class68.field1755 = class60.method535(2) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2690++;
        if (class142.field3507 == null) {
            return class43.field1058 == null || class43.field1058.field1214 == this ? super.getAppletContext() : class43.field1058.field1214.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class141.field3496 = true;
        field2681++;
        class80.field1971 = true;
    }

    @OriginalMember(owner = "client!qa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2675++;
        if (class34.field857 != this || class63.field1677) {
            return;
        }
        class80.field1971 = true;
        if (class50.field1213 != null && class50.field1213.startsWith("1.5") && class60.method535(2) - class17.field449 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class145.field3614 <= var2.width && class99.field2404 <= var2.height) {
                class74.field1872 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method931(int arg0, String arg1) {
        field2674++;
        if (this.field2684) {
            return;
        }
        this.field2684 = true;
        if (arg0 > -56) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public final synchronized void method932(int arg0) {
        if (arg0 != 4783) {
            return;
        }
        Container var2;
        if (class142.field3507 == null) {
            var2 = class43.field1058.field1214;
        } else {
            var2 = class142.field3507;
        }
        field2671++;
        if (class5.field99 != null) {
            class5.field99.removeFocusListener(this);
            var2.remove(class5.field99);
        }
        class5.field99 = new class82(this);
        var2.add(class5.field99);
        class5.field99.setSize(class145.field3614, class99.field2404);
        class5.field99.setVisible(true);
        if (class142.field3507 == null) {
            class5.field99.setLocation(0, 0);
        } else {
            Insets var3 = class142.field3507.getInsets();
            class5.field99.setLocation(var3.left, var3.top);
        }
        class5.field99.addFocusListener(this);
        class5.field99.requestFocus();
        class80.field1971 = true;
        class74.field1872 = false;
        class17.field449 = class60.method535(2);
    }

    @OriginalMember(owner = "client!qa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2687++;
        this.destroy();
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public static final void method933(int arg0) {
        for (int var1 = arg0; var1 < class86.field2151; var1++) {
            int var2 = class9.field232[var1];
            class149 var3 = class149.field3691[var2];
            if (var3 != null) {
                class107.method916(var3.field3689.field1095, (byte) 14, var3);
            }
        }
        field2688++;
    }

    @OriginalMember(owner = "client!qa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2691++;
    }

    @OriginalMember(owner = "client!qa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class141.field3496 = false;
        field2660++;
    }

    @OriginalMember(owner = "client!qa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2663++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    private final void method934(byte arg0) {
        field2670++;
        long var2 = class60.method535(2);
        if (arg0 <= 64) {
            return;
        }
        long var4 = class93.field2275[class11.field262];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class93.field2275[class11.field262] = var2;
        class11.field262 = class11.field262 + 1 & 0x1F;
        synchronized (this) {
            class89.field2207 = class141.field3496;
        }
        this.method198(false);
    }

    @OriginalMember(owner = "client!qa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2673++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIII)V")
    public final void method935(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2662++;
        try {
            if (class34.field857 == null) {
                class34.field857 = this;
                class99.field2404 = arg0;
                class18.field474 = arg4;
                class145.field3614 = arg3;
                if (class43.field1058 == null) {
                    class104.field2537 = class43.field1058 = new class50(false, this, arg2, null, 0);
                }
                class43.field1058.method424((byte) 84, this, 1);
                if (arg1 > -3) {
                    this.getParameter(null);
                }
            } else {
                class5.field112++;
                if (class5.field112 >= 3) {
                    this.method931(-69, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            }
        } catch (Exception var7) {
            class72.method659(var7, (byte) 122, null);
            this.method931(-114, "crash");
        }
    }

    @OriginalMember(owner = "client!qa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2693++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public abstract void method204(byte arg0);

    @OriginalMember(owner = "client!qa", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2689++;
        if (class142.field3507 == null) {
            return class43.field1058 == null || class43.field1058.field1214 == this ? super.getCodeBase() : class43.field1058.field1214.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2686++;
        if (class142.field3507 == null) {
            return class43.field1058 == null || class43.field1058.field1214 == this ? super.getDocumentBase() : class43.field1058.field1214.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "start", descriptor = "()V")
    public final void start() {
        field2664++;
        if (class34.field857 == this && !class63.field1677) {
            class68.field1755 = 0L;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)Z")
    public final boolean method936(byte arg0) {
        field2682++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 <= 87) {
            field2711 = null;
        }
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
                this.method931(-115, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method197(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method199(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static void method937(int arg0) {
        field2701 = null;
        field2709 = null;
        field2694 = null;
        field2703 = null;
        field2700 = null;
        field2697 = null;
        field2665 = null;
        field2668 = null;
        field2698 = null;
        field2696 = null;
        field2695 = null;
        field2702 = null;
        field2706 = null;
        field2704 = null;
        field2685 = null;
        field2708 = null;
        field2711 = null;
        if (arg0 >= -116) {
            method933(35);
        }
        field2710 = null;
        field2707 = null;
    }

    @OriginalMember(owner = "client!qa", name = "run", descriptor = "()V")
    public final void run() {
        field2658++;
        try {
            if (class50.field1220 != null) {
                String var1 = class50.field1220.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class50.field1213;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method931(-115, "wrongjava");
                        return;
                    }
                    class141.field3499 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class50.field1213 == null || class50.field1213.equals("1.4.2"))) {
                    this.method931(-112, "wrongjava");
                    return;
                }
            }
            if (class43.field1058.field1214 != null) {
                Method var3 = class50.field1218;
                if (var3 != null) {
                    try {
                        var3.invoke(class43.field1058.field1214, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method932(4783);
            class46.field1129 = class59.method531(class99.field2404, false, class145.field3614, class5.field99);
            this.method199(true);
            class140.field3456 = class108.method920((byte) 8);
            class140.field3456.method18(-15127);
            while (class68.field1755 == 0L || class68.field1755 > class60.method535(2)) {
                class133.field3252 = class140.field3456.method19(class81.field2021, 9, class141.field3499);
                for (int var4 = 0; var4 < class133.field3252; var4++) {
                    this.method934((byte) 70);
                }
                this.method940(122);
                class86.method737(116, true);
            }
        } catch (Exception var7) {
            class72.method659(var7, (byte) 111, null);
            this.method931(-79, "crash");
        }
        this.method938(75);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    private final synchronized void method938(int arg0) {
        field2672++;
        if (class63.field1677) {
            return;
        }
        class63.field1677 = true;
        try {
            class5.field99.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method197(true);
        } catch (Exception var4) {
        }
        if (class142.field3507 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (arg0 < 25) {
            this.init();
        }
        if (class43.field1058 != null) {
            try {
                class43.field1058.method417(-122);
            } catch (Exception var2) {
            }
        }
        this.method204((byte) -32);
    }

    @OriginalMember(owner = "client!qa", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2677++;
        if (class34.field857 == this && !class63.field1677) {
            class68.field1755 = class60.method535(2);
            class57.method509(-127, 5000L);
            class104.field2537 = null;
            this.method938(28);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method939(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2659++;
        try {
            class18.field474 = arg3;
            class145.field3614 = arg5;
            class34.field857 = this;
            class99.field2404 = arg1;
            class142.field3507 = new Frame();
            class142.field3507.setTitle("Jagex");
            class142.field3507.setResizable(false);
            class142.field3507.addWindowListener(this);
            class142.field3507.setVisible(true);
            if (arg2 == 1) {
                class142.field3507.toFront();
                Insets var8 = class142.field3507.getInsets();
                class142.field3507.setSize(var8.right + arg5 + var8.left, var8.top + arg1 + var8.bottom);
                class104.field2537 = class43.field1058 = new class50(true, null, arg4, arg0, arg6);
                class43.field1058.method424((byte) 77, this, 1);
            }
        } catch (Exception var10) {
            class72.method659(var10, (byte) 117, null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method198(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "providesignlink", descriptor = "(Lhb;)V")
    public static final void providesignlink(class50 arg0) {
        class43.field1058 = arg0;
        class104.field2537 = arg0;
        field2666++;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    private final void method940(int arg0) {
        field2669++;
        long var2 = class60.method535(2);
        long var4 = class141.field3497[class66.field1702];
        class141.field3497[class66.field1702] = var2;
        class66.field1702 = class66.field1702 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class32.field779 = ((var6 >> 1) + 32000) / var6;
        }
        if (class114.field2840++ > 50) {
            class80.field1971 = true;
            class114.field2840 -= 50;
            class5.field99.setSize(class145.field3614, class99.field2404);
            class5.field99.setVisible(true);
            if (class142.field3507 == null) {
                class5.field99.setLocation(0, 0);
            } else {
                Insets var7 = class142.field3507.getInsets();
                class5.field99.setLocation(var7.left, var7.top);
            }
        }
        this.method202(-41);
        int var8 = 48 % ((51 - arg0) / 49);
    }
}
