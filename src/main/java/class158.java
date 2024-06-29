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
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class class158 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Z")
    private boolean field3605 = false;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lhe;")
    public static class54 field3588 = class6.method58("Willkommen auf RuneScape", false);

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3592 = 0;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lhe;")
    public static class54 field3601 = class6.method58("headicons_hint", false);

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Lhe;")
    public static class54 field3606 = class6.method58("und die Schaltfl-=che (WSpielkonto erstellen(W am", false);

    @OriginalMember(owner = "client!we", name = "B", descriptor = "Lhe;")
    private static class54 field3614 = class6.method58("wishes to trade with you)3", false);

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3598 = 0;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Lhe;")
    public static class54 field3611 = class6.method58("logo", false);

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lhe;")
    public static class54 field3597 = field3614;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "Z")
    public static boolean field3630;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "[Lce;")
    public static class20[] field3629;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "[[B")
    public static byte[][] field3612;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public final synchronized void method1210(int arg0) {
        Container var2;
        if (class54.field1306 == null) {
            var2 = class80.field1963.field3349;
        } else {
            var2 = class54.field1306;
        }
        field3620++;
        if (class70.field1753 != null) {
            class70.field1753.removeFocusListener(this);
            var2.remove(class70.field1753);
        }
        class70.field1753 = new class99(this);
        var2.add(class70.field1753);
        class70.field1753.setSize(class115.field2726, class111.field2666);
        class70.field1753.setVisible(true);
        if (class54.field1306 == null) {
            class70.field1753.setLocation(0, 0);
        } else {
            Insets var3 = class54.field1306.getInsets();
            class70.field1753.setLocation(var3.left, var3.top);
        }
        int var4 = 6 % ((55 - arg0) / 57);
        class70.field1753.addFocusListener(this);
        class70.field1753.requestFocus();
        class27.field716 = true;
        class146.field3300 = false;
        class15.field461 = class102.method801((byte) -42);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    private final void method1211(byte arg0) {
        long var2 = class102.method801((byte) -42);
        if (arg0 < 6) {
            field3609 = -110;
        }
        field3593++;
        long var4 = class64.field1552[class78.field1928];
        class64.field1552[class78.field1928] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class146.field3302 = ((var6 >> 1) + 32000) / var6;
        }
        class78.field1928 = class78.field1928 + 1 & 0x1F;
        if (class57.field1443++ > 50) {
            class27.field716 = true;
            class57.field1443 -= 50;
            class70.field1753.setSize(class115.field2726, class111.field2666);
            class70.field1753.setVisible(true);
            if (class54.field1306 == null) {
                class70.field1753.setLocation(0, 0);
            } else {
                Insets var7 = class54.field1306.getInsets();
                class70.field1753.setLocation(var7.left, var7.top);
            }
        }
        this.method170((byte) -103);
    }

    @OriginalMember(owner = "client!we", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3602++;
        if (class54.field1306 == null) {
            return class80.field1963 == null || class80.field1963.field3349 == this ? super.getParameter(arg0) : class80.field1963.field3349.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public abstract void method170(byte arg0);

    @OriginalMember(owner = "client!we", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3618++;
    }

    @OriginalMember(owner = "client!we", name = "providesignlink", descriptor = "(Lvb;)V")
    public static final void providesignlink(class148 arg0) {
        field3591++;
        class80.field1963 = arg0;
        class150.field3402 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3624++;
        if (class54.field1306 == null) {
            return class80.field1963 == null || class80.field1963.field3349 == this ? super.getCodeBase() : class80.field1963.field3349.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIILjava/lang/String;ZI)V")
    public final void method1212(int arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, int arg6) {
        try {
            class44.field1130 = arg3;
            class111.field2666 = arg2;
            class138.field3168 = this;
            class115.field2726 = arg1;
            class54.field1306 = new Frame();
            class54.field1306.setTitle("Jagex");
            class54.field1306.setResizable(arg5);
            class54.field1306.addWindowListener(this);
            class54.field1306.setVisible(true);
            class54.field1306.toFront();
            Insets var8 = class54.field1306.getInsets();
            class54.field1306.setSize(var8.right + arg1 + var8.left, arg2 - -var8.top + var8.bottom);
            class150.field3402 = class80.field1963 = new class148(true, null, arg6, arg4, arg0);
            class80.field1963.method1121(this, 1, 66);
        } catch (Exception var10) {
            class48.method345(var10, -77, null);
        }
        field3621++;
    }

    @OriginalMember(owner = "client!we", name = "start", descriptor = "()V")
    public final void start() {
        field3617++;
        if (class138.field3168 == this && !class57.field1434) {
            class94.field2390 = 0L;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static void method1213(int arg0) {
        field3606 = null;
        field3601 = null;
        field3597 = null;
        field3612 = null;
        field3629 = null;
        if (arg0 >= -62) {
            field3612 = null;
        }
        field3611 = null;
        field3614 = null;
        field3588 = null;
    }

    @OriginalMember(owner = "client!we", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3590++;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public abstract void method173(int arg0);

    @OriginalMember(owner = "client!we", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class64.field1555 = true;
        field3613++;
        class27.field716 = true;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public abstract void method167(int arg0);

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
    private final synchronized void method1214(int arg0) {
        field3600++;
        if (class57.field1434) {
            return;
        }
        class57.field1434 = true;
        try {
            if (arg0 != 1000) {
                field3607 = -113;
            }
            class70.field1753.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method176(arg0 - 19075);
        } catch (Exception var4) {
        }
        if (class54.field1306 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class80.field1963 != null) {
            try {
                class80.field1963.method1123(0);
            } catch (Exception var2) {
            }
        }
        this.method173(-107);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1215(byte arg0, String arg1) {
        field3610++;
        if (this.field3605) {
            return;
        }
        this.field3605 = true;
        System.out.println("error_game_" + arg1);
        try {
            int var3 = -74 % ((arg0 + 12) / 33);
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!we", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3599++;
    }

    @OriginalMember(owner = "client!we", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3626++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILhe;ZILhe;Lef;)V")
    public static final void method1216(int arg0, class54 arg1, boolean arg2, int arg3, class54 arg4, class35 arg5) {
        field3616++;
        if (arg3 == 21332) {
            int var6 = arg5.method273(arg1, arg3 - 21331);
            int var7 = arg5.method267(false, arg4, var6);
            class137.method1068(arg0, -2, arg5, var7, var6, arg2);
        }
    }

    @OriginalMember(owner = "client!we", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3625++;
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
    public abstract void method176(int arg0);

    @OriginalMember(owner = "client!we", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3622++;
        if (class138.field3168 == this && !class57.field1434) {
            class94.field2390 = class102.method801((byte) -42);
            class50.method360(5000L, 10);
            class150.field3402 = null;
            this.method1214(1000);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    private final void method1217(byte arg0) {
        field3595++;
        long var2 = class102.method801((byte) -42);
        if (arg0 < 25) {
            field3592 = 88;
        }
        long var4 = class80.field1972[class7.field217];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class80.field1972[class7.field217] = var2;
        class7.field217 = class7.field217 + 1 & 0x1F;
        synchronized (this) {
            class4.field130 = class64.field1555;
        }
        this.method171(-19134);
    }

    @OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
    public final void run() {
        field3603++;
        try {
            if (class148.field3334 != null) {
                String var1 = class148.field3334.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class148.field3343;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1215((byte) 22, "wrongjava");
                        return;
                    }
                    class121.field2812 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class148.field3343 == null || class148.field3343.equals("1.4.2"))) {
                    this.method1215((byte) 89, "wrongjava");
                    return;
                }
            }
            if (class80.field1963.field3349 != null) {
                Method var3 = class148.field3345;
                if (var3 != null) {
                    try {
                        var3.invoke(class80.field1963.field3349, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1210(-3);
            class124.field2852 = class125.method960(-113, class115.field2726, class70.field1753, class111.field2666);
            this.method167(0);
            class95.field2413 = class86.method690(-98);
            while (class94.field2390 == 0L || class94.field2390 > class102.method801((byte) -42)) {
                class72.field1782 = class95.field2413.method143(true, class121.field2812, class63.field1544);
                for (int var4 = 0; var4 < class72.field1782; var4++) {
                    this.method1217((byte) 65);
                }
                this.method1211((byte) 77);
                class48.method347((byte) -48, class70.field1753, class80.field1963);
            }
        } catch (Exception var7) {
            class48.method345(var7, -52, null);
            this.method1215((byte) -127, "crash");
        }
        this.method1214(1000);
    }

    @OriginalMember(owner = "client!we", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3596++;
        if (class54.field1306 == null) {
            return class80.field1963 == null || class80.field1963.field3349 == this ? super.getDocumentBase() : class80.field1963.field3349.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBII)V")
    public final void method1218(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3619++;
        try {
            if (class138.field3168 == null) {
                class138.field3168 = this;
                class111.field2666 = arg1;
                int var6 = 92 / ((arg2 + 61) / 36);
                class44.field1130 = arg0;
                class115.field2726 = arg3;
                if (class80.field1963 == null) {
                    class150.field3402 = class80.field1963 = new class148(false, this, arg4, null, 0);
                }
                class80.field1963.method1121(this, 1, 14);
            } else {
                class84.field2097++;
                if (class84.field2097 >= 3) {
                    this.method1215((byte) 100, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class48.method345(var8, -53, null);
            this.method1215((byte) 40, "crash");
        }
    }

    @OriginalMember(owner = "client!we", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class64.field1555 = false;
        field3587++;
    }

    @OriginalMember(owner = "client!we", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3604++;
        if (class138.field3168 != this || class57.field1434) {
            return;
        }
        class27.field716 = true;
        if (class148.field3343 != null && class148.field3343.startsWith("1.5") && class102.method801((byte) -42) - class15.field461 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class115.field2726 && class111.field2666 <= var2.height) {
                class146.field3300 = true;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3627++;
        this.destroy();
    }

    @OriginalMember(owner = "client!we", name = "stop", descriptor = "()V")
    public final void stop() {
        field3594++;
        if (class138.field3168 == this && !class57.field1434) {
            class94.field2390 = class102.method801((byte) -42) + 4000L;
        }
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)Z")
    public final boolean method1219(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field3589++;
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
            }
            if (arg0 != 0) {
                this.windowDeiconified(null);
            }
            this.method1215((byte) -87, "invalidhost");
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3623++;
    }

    @OriginalMember(owner = "client!we", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3628++;
        if (class54.field1306 == null) {
            return class80.field1963 == null || class80.field1963.field3349 == this ? super.getAppletContext() : class80.field1963.field3349.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3608++;
    }

    @OriginalMember(owner = "client!we", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V")
    public abstract void method171(int arg0);
}
