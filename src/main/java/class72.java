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

@OriginalClass("client!gg")
public abstract class class72 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "Z")
    private boolean field1421 = false;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lvd;")
    private static class222 field1400 = class212.method1357("Nov", 10731);

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lvd;")
    private static class222 field1410 = class212.method1357("Feb", 10731);

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "Lvd;")
    private static class222 field1413 = class212.method1357("Apr", 10731);

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Lvd;")
    private static class222 field1411 = class212.method1357("Oct", 10731);

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lvd;")
    private static class222 field1394 = class212.method1357("Jan", 10731);

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "Lvd;")
    private static class222 field1419 = class212.method1357("May", 10731);

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static volatile int field1424 = -1;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "Lvd;")
    private static class222 field1429 = class212.method1357("Jul", 10731);

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "Lvd;")
    private static class222 field1425 = class212.method1357("Sep", 10731);

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lvd;")
    public static class222 field1391 = class212.method1357("Wordpack geladen)3", 10731);

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "Lvd;")
    private static class222 field1426 = class212.method1357("Aug", 10731);

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Lvd;")
    private static class222 field1430 = class212.method1357("Mar", 10731);

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "Lvd;")
    private static class222 field1422 = class212.method1357("Dec", 10731);

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Z")
    public static boolean field1406 = true;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "[Lvd;")
    public static class222[] field1434 = new class222[500];

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "Lvd;")
    private static class222 field1432 = class212.method1357("Jun", 10731);

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "[Lvd;")
    public static class222[] field1408 = new class222[] { field1394, field1410, field1430, field1413, field1419, field1432, field1429, field1426, field1425, field1411, field1400, field1422 };

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Lbh;")
    public static class20 field1407;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "Z")
    public static boolean field1436;

    @OriginalMember(owner = "client!gg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1427++;
        class192.field3529 = true;
        class87.field1637 = true;
    }

    @OriginalMember(owner = "client!gg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1428++;
    }

    @OriginalMember(owner = "client!gg", name = "providesignlink", descriptor = "(Ld;)V")
    public static final void providesignlink(class33 arg0) {
        field1392++;
        class191.field3509 = arg0;
        class23.field542 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method487(int arg0) {
        field1413 = null;
        field1425 = null;
        field1429 = null;
        field1434 = null;
        field1432 = null;
        field1430 = null;
        field1391 = null;
        field1394 = null;
        field1422 = null;
        field1408 = null;
        field1410 = null;
        field1419 = null;
        field1407 = null;
        field1411 = null;
        if (arg0 == -1) {
            field1426 = null;
            field1400 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1423++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public abstract void method267(byte arg0);

    @OriginalMember(owner = "client!gg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1390++;
        if (class13.field342 == null) {
            return class191.field3509 == null || class191.field3509.field730 == this ? super.getDocumentBase() : class191.field3509.field730.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1396++;
        if (class22.field530 != this || class83.field1596) {
            return;
        }
        class87.field1637 = true;
        if (class33.field715 == null || !class33.field715.startsWith("1.5") || class135.method849(true) - class193.field3550 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        boolean var10000;
        if (var2 == null || class70.field1315 <= var2.width && class122.field2321 <= var2.height) {
            var10000 = true;
        } else {
            var10000 = false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1415++;
    }

    @OriginalMember(owner = "client!gg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1389++;
    }

    @OriginalMember(owner = "client!gg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1402++;
        if (class13.field342 == null) {
            return class191.field3509 == null || class191.field3509.field730 == this ? super.getCodeBase() : class191.field3509.field730.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method488(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1418++;
        try {
            class70.field1315 = arg5;
            class151.field2932 = arg3;
            if (arg6 >= -37) {
                this.windowIconified(null);
            }
            class122.field2321 = arg2;
            class22.field530 = this;
            class13.field342 = new Frame();
            class13.field342.setTitle("Jagex");
            class13.field342.setResizable(false);
            class13.field342.addWindowListener(this);
            class13.field342.setVisible(true);
            class13.field342.toFront();
            Insets var8 = class13.field342.getInsets();
            class13.field342.setSize(var8.left + arg5 + var8.right, var8.top + var8.bottom + arg2);
            class23.field542 = class191.field3509 = new class33(true, null, arg0, arg1, arg4);
            class191.field3509.method283(this, 1, 0);
        } catch (Exception var10) {
            class68.method464(var10, 128, null);
        }
    }

    @OriginalMember(owner = "client!gg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1397++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZB)V")
    private final void method489(boolean arg0, byte arg1) {
        field1431++;
        synchronized (this) {
            if (class83.field1596) {
                return;
            }
            class83.field1596 = true;
        }
        if (arg1 != 90) {
            return;
        }
        if (class191.field3509.field730 != null) {
            class191.field3509.field730.destroy();
        }
        if (class130.field2523 != null) {
            try {
                class130.field2523.removeFocusListener(this);
                Container var4;
                if (class13.field342 == null) {
                    var4 = class191.field3509.field730;
                } else {
                    var4 = class13.field342;
                }
                var4.remove(class130.field2523);
            } catch (Exception var10) {
            }
        }
        try {
            this.method266(true);
        } catch (Exception var9) {
        }
        if (class191.field3509 != null) {
            try {
                class191.field3509.method281(true);
            } catch (Exception var8) {
            }
        }
        this.method275(100);
        if (class13.field342 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public abstract void method266(boolean arg0);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public abstract void method275(int arg0);

    @OriginalMember(owner = "client!gg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1393++;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V")
    public abstract void method272(boolean arg0);

    @OriginalMember(owner = "client!gg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1417++;
        if (class13.field342 == null) {
            return class191.field3509 == null || class191.field3509.field730 == this ? super.getAppletContext() : class191.field3509.field730.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1404++;
    }

    @OriginalMember(owner = "client!gg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1416++;
        class192.field3529 = false;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BIIII)V")
    public final void method490(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1435++;
        try {
            if (class22.field530 != null) {
                class124.field2372++;
                if (class124.field2372 >= 3) {
                    this.method492("alreadyloaded", 99);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class70.field1315 = arg3;
            class122.field2321 = arg4;
            class151.field2932 = arg1;
            class22.field530 = this;
            if (class191.field3509 == null) {
                class23.field542 = class191.field3509 = new class33(false, this, arg2, null, 0);
            }
            class191.field3509.method283(this, 1, 0);
        } catch (Exception var7) {
            class68.method464(var7, 128, null);
            this.method492("crash", 107);
        }
        if (arg0 != 109) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!gg", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1398++;
        if (class22.field530 == this && !class83.field1596) {
            class161.field3076 = class135.method849(true);
            class225.method1471(5000L, -23364);
            class23.field542 = null;
            this.method489(false, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    private final void method491(byte arg0) {
        field1409++;
        long var2 = class112.field2115[class81.field1565];
        long var4 = class135.method849(true);
        class112.field2115[class81.field1565] = var4;
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class81.field1565 = class81.field1565 + 1 & 0x1F;
        synchronized (this) {
            class60.field1116 = class192.field3529;
            if (arg0 != -2) {
                field1432 = null;
            }
        }
        this.method272(false);
    }

    @OriginalMember(owner = "client!gg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1401++;
        if (class13.field342 == null) {
            return class191.field3509 == null || class191.field3509.field730 == this ? super.getParameter(arg0) : class191.field3509.field730.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public abstract void method271(int arg0);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method492(String arg0, int arg1) {
        field1395++;
        if (this.field1421) {
            return;
        }
        this.field1421 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
            if (arg1 < 89) {
                this.method272(false);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!gg", name = "run", descriptor = "()V")
    public final void run() {
        field1433++;
        try {
            if (class33.field729 != null) {
                String var1 = class33.field729.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class33.field715;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method492("wrongjava", 100);
                        return;
                    }
                    class80.field1545 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class33.field715 == null || class33.field715.equals("1.4.2"))) {
                    this.method492("wrongjava", 100);
                    return;
                }
            }
            if (class191.field3509.field730 != null) {
                Method var3 = class33.field713;
                if (var3 != null) {
                    try {
                        var3.invoke(class191.field3509.field730, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method495((byte) -48);
            class93.field1750 = class14.method120(class70.field1315, class122.field2321, (byte) -34, class130.field2523);
            this.method271(-126);
            class192.field3531 = class127.method801(false);
            while (class161.field3076 == 0L || class161.field3076 > class135.method849(true)) {
                class159.field3025 = class192.field3531.method459(class80.field1545, class23.field547, (byte) 85);
                for (int var4 = 0; var4 < class159.field3025; var4++) {
                    this.method491((byte) -2);
                }
                this.method494(0);
                class181.method1139(class130.field2523, (byte) 127, class191.field3509);
            }
        } catch (Exception var7) {
            class68.method464(var7, 128, null);
            this.method492("crash", 115);
        }
        this.method489(true, (byte) 90);
    }

    @OriginalMember(owner = "client!gg", name = "start", descriptor = "()V")
    public final void start() {
        field1403++;
        if (class22.field530 == this && !class83.field1596) {
            class161.field3076 = 0L;
        }
    }

    @OriginalMember(owner = "client!gg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1405++;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)Z")
    public final boolean method493(int arg0) {
        field1420++;
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
            }
            if (arg0 != 0) {
                this.getParameter(null);
            }
            this.method492("invalidhost", arg0 ^ 0x5A);
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "stop", descriptor = "()V")
    public final void stop() {
        field1399++;
        if (class22.field530 == this && !class83.field1596) {
            class161.field3076 = class135.method849(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    private final void method494(int arg0) {
        long var2 = class135.method849(true);
        field1412++;
        long var4 = class75.field1477[class222.field4138];
        class75.field1477[class222.field4138] = var2;
        if (arg0 != 0) {
            return;
        }
        class222.field4138 = class222.field4138 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class50.field973 = ((var6 >> 1) + 32000) / var6;
        }
        if (class160.field3043++ > 50) {
            class160.field3043 -= 50;
            class87.field1637 = true;
            class130.field2523.setSize(class70.field1315, class122.field2321);
            class130.field2523.setVisible(true);
            if (class13.field342 == null) {
                class130.field2523.setLocation(0, 0);
            } else {
                Insets var7 = class13.field342.getInsets();
                class130.field2523.setLocation(var7.left, var7.top);
            }
        }
        this.method267((byte) -85);
    }

    @OriginalMember(owner = "client!gg", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
    private final synchronized void method495(byte arg0) {
        field1414++;
        Container var2;
        if (class13.field342 == null) {
            var2 = class191.field3509.field730;
        } else {
            var2 = class13.field342;
        }
        if (class130.field2523 != null) {
            class130.field2523.removeFocusListener(this);
            var2.remove(class130.field2523);
        }
        class130.field2523 = new class217(this);
        if (arg0 != -48) {
            this.focusGained(null);
        }
        var2.add(class130.field2523);
        class130.field2523.setSize(class70.field1315, class122.field2321);
        class130.field2523.setVisible(true);
        if (class13.field342 == null) {
            class130.field2523.setLocation(0, 0);
        } else {
            Insets var3 = class13.field342.getInsets();
            class130.field2523.setLocation(var3.left, var3.top);
        }
        class130.field2523.addFocusListener(this);
        class130.field2523.requestFocus();
        class87.field1637 = true;
        class193.field3550 = class135.method849(true);
    }
}
