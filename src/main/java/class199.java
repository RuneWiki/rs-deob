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

@OriginalClass("client!sb")
public abstract class class199 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "Z")
    private boolean field3600 = false;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lkh;")
    public static class117 field3564 = class224.method1450((byte) 126, "::fps ");

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "Lkh;")
    public static class117 field3588 = class224.method1450((byte) -113, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lkh;")
    private static class117 field3573 = class224.method1450((byte) -106, "Choose Option");

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "Lkh;")
    public static class117 field3598 = field3573;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lje;")
    public static class103 field3581 = new class103();

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Lkh;")
    private static class117 field3606 = class224.method1450((byte) -25, "No response from server)3");

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "S")
    public static short field3605 = 1;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "Lkh;")
    public static class117 field3604 = field3606;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "Lmg;")
    public static class138 field3603;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    private final synchronized void method1318(boolean arg0) {
        Container var2;
        if (class108.field2011 == null) {
            var2 = class130.field2397.field2423;
        } else {
            var2 = class108.field2011;
        }
        if (class85.field1608 != null) {
            class85.field1608.removeFocusListener(this);
            var2.remove(class85.field1608);
        }
        class85.field1608 = new class6(this);
        field3585++;
        var2.add(class85.field1608);
        class85.field1608.setSize(class97.field1793, class124.field2324);
        class85.field1608.setVisible(true);
        if (class108.field2011 == null) {
            class85.field1608.setLocation(0, 0);
        } else {
            Insets var3 = class108.field2011.getInsets();
            class85.field1608.setLocation(var3.left, var3.top);
        }
        class85.field1608.addFocusListener(this);
        class85.field1608.requestFocus();
        class54.field1110 = arg0;
        class18.field527 = class4.method31((byte) 47);
    }

    @OriginalMember(owner = "client!sb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3597++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1319(int arg0, String arg1) {
        field3590++;
        if (this.field3600) {
            return;
        }
        if (arg0 <= 11) {
            field3606 = null;
        }
        this.field3600 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!sb", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    private final void method1320(byte arg0) {
        if (arg0 != 34) {
            field3604 = null;
        }
        field3568++;
        long var2 = class4.method31((byte) 47);
        long var4 = class194.field3465[class7.field116];
        class194.field3465[class7.field116] = var2;
        class7.field116 = class7.field116 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class37.field855 = ((var6 >> 1) + 32000) / var6;
        }
        if (class11.field372++ > 50) {
            class11.field372 -= 50;
            class54.field1110 = true;
            class85.field1608.setSize(class97.field1793, class124.field2324);
            class85.field1608.setVisible(true);
            if (class108.field2011 == null) {
                class85.field1608.setLocation(0, 0);
            } else {
                Insets var7 = class108.field2011.getInsets();
                class85.field1608.setLocation(var7.left, var7.top);
            }
        }
        this.method295(true);
    }

    @OriginalMember(owner = "client!sb", name = "providesignlink", descriptor = "(Lmc;)V")
    public static final void providesignlink(class134 arg0) {
        class130.field2397 = arg0;
        class154.field2787 = arg0;
        field3565++;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Z")
    public final boolean method1321(boolean arg0) {
        field3578++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (!arg0) {
                field3581 = null;
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1319(21, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3567++;
    }

    @OriginalMember(owner = "client!sb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3579++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
    public static final int method1322(int arg0, int arg1, int arg2, int arg3) {
        field3592++;
        int var4 = arg3 - arg0;
        return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    private final void method1323(int arg0) {
        field3596++;
        long var2 = class4.method31((byte) 47);
        long var4 = class127.field2358[class85.field1614];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class127.field2358[class85.field1614] = var2;
        class85.field1614 = class85.field1614 + 1 & 0x1F;
        synchronized (this) {
            class228.field4106 = class133.field2405;
        }
        this.method300((byte) 123);
        if (arg0 < 67) {
            this.method1319(5, null);
        }
    }

    @OriginalMember(owner = "client!sb", name = "start", descriptor = "()V")
    public final void start() {
        field3580++;
        if (class146.field2685 == this && !class80.field1503) {
            class5.field72 = 0L;
        }
    }

    @OriginalMember(owner = "client!sb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3563++;
        if (class108.field2011 == null) {
            return class130.field2397 == null || class130.field2397.field2423 == this ? super.getParameter(arg0) : class130.field2397.field2423.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZ)V")
    private final void method1324(byte arg0, boolean arg1) {
        field3576++;
        synchronized (this) {
            if (class80.field1503) {
                return;
            }
            class80.field1503 = true;
        }
        if (class130.field2397.field2423 != null) {
            class130.field2397.field2423.destroy();
        }
        if (class85.field1608 != null) {
            try {
                class85.field1608.removeFocusListener(this);
                Container var4;
                if (class108.field2011 == null) {
                    var4 = class130.field2397.field2423;
                } else {
                    var4 = class108.field2011;
                }
                var4.remove(class85.field1608);
            } catch (Exception var10) {
            }
        }
        try {
            this.method299(arg0 + 105);
        } catch (Exception var9) {
        }
        if (class130.field2397 != null) {
            try {
                class130.field2397.method898(arg0 ^ 0x32A2);
            } catch (Exception var8) {
            }
        }
        if (arg0 != -105) {
            this.method1321(true);
        }
        this.method297((byte) -101);
        if (class108.field2011 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!sb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3570++;
        if (class108.field2011 == null) {
            return class130.field2397 == null || class130.field2397.field2423 == this ? super.getDocumentBase() : class130.field2397.field2423.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1325(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        try {
            class124.field2324 = arg2;
            class53.field1093 = arg5;
            class97.field1793 = arg6;
            class146.field2685 = this;
            class108.field2011 = new Frame();
            class108.field2011.setTitle("Jagex");
            class108.field2011.setResizable(false);
            class108.field2011.addWindowListener(this);
            class108.field2011.setVisible(true);
            class108.field2011.toFront();
            Insets var8 = class108.field2011.getInsets();
            class108.field2011.setSize(var8.right + arg6 + var8.left, var8.bottom + arg2 + var8.top);
            class154.field2787 = class130.field2397 = new class134(true, null, arg1, arg3, arg0);
            class130.field2397.method890((byte) 23, arg4, this);
        } catch (Exception var10) {
            class147.method1055(6678, null, var10);
        }
        field3583++;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static final void method1326(byte arg0) {
        class191.field3408.method503(10);
        if (arg0 == -94) {
            field3572++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
    public abstract void method297(byte arg0);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public abstract void method299(int arg0);

    @OriginalMember(owner = "client!sb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3586++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLai;I)[Lo;")
    public static final class153[] method1327(byte arg0, class10 arg1, int arg2) {
        if (arg0 < 15) {
            field3581 = null;
        }
        field3584++;
        return class71.method502(arg1, arg2, (byte) 26) ? class115.method768(51) : null;
    }

    @OriginalMember(owner = "client!sb", name = "stop", descriptor = "()V")
    public final void stop() {
        field3575++;
        if (class146.field2685 == this && !class80.field1503) {
            class5.field72 = class4.method31((byte) 47) + 4000L;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
    public abstract void method300(byte arg0);

    @OriginalMember(owner = "client!sb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3599++;
        if (class108.field2011 == null) {
            return class130.field2397 == null || class130.field2397.field2423 == this ? super.getAppletContext() : class130.field2397.field2423.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class133.field2405 = false;
        field3593++;
    }

    @OriginalMember(owner = "client!sb", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3601++;
        if (class146.field2685 == this && !class80.field1503) {
            class5.field72 = class4.method31((byte) 47);
            class165.method1167(-22942, 5000L);
            class154.field2787 = null;
            this.method1324((byte) -105, false);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBII)V")
    public final void method1328(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3577++;
        try {
            if (class146.field2685 == null) {
                class146.field2685 = this;
                class53.field1093 = arg0;
                class97.field1793 = arg4;
                class124.field2324 = arg3;
                if (class130.field2397 == null) {
                    class154.field2787 = class130.field2397 = new class134(false, this, arg1, null, 0);
                }
                if (arg2 < 20) {
                    field3606 = null;
                }
                class130.field2397.method890((byte) 120, 1, this);
            } else {
                class92.field1692++;
                if (class92.field1692 >= 3) {
                    this.method1319(125, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class147.method1055(6678, null, var7);
            this.method1319(74, "crash");
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(Z)V")
    public abstract void method292(boolean arg0);

    @OriginalMember(owner = "client!sb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3591++;
    }

    @OriginalMember(owner = "client!sb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3569++;
    }

    @OriginalMember(owner = "client!sb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3594++;
        class133.field2405 = true;
        class54.field1110 = true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1329(int arg0, int arg1, int arg2, long arg3) {
        class170 var5 = class109.field2063[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3062 != null && var5.field3062.field1670 == arg3) {
            return true;
        } else if (var5.field3073 != null && var5.field3073.field4326 == arg3) {
            return true;
        } else if (var5.field3074 != null && var5.field3074.field687 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3065; var6++) {
                if (var5.field3063[var6].field1171 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3589++;
        if (class108.field2011 == null) {
            return class130.field2397 == null || class130.field2397.field2423 == this ? super.getCodeBase() : class130.field2397.field2423.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3587++;
    }

    @OriginalMember(owner = "client!sb", name = "run", descriptor = "()V")
    public final void run() {
        field3602++;
        try {
            if (class134.field2407 != null) {
                String var1 = class134.field2407.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class134.field2409;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1319(32, "wrongjava");
                        return;
                    }
                    class75.field1433 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class134.field2409 == null || class134.field2409.equals("1.4.2"))) {
                    this.method1319(103, "wrongjava");
                    return;
                }
            }
            if (class130.field2397.field2423 != null) {
                Method var3 = class134.field2413;
                if (var3 != null) {
                    try {
                        var3.invoke(class130.field2397.field2423, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1318(true);
            class23.field588 = class104.method702(class85.field1608, class97.field1793, 3, class124.field2324);
            this.method292(true);
            class206.field3706 = class211.method1387(4811);
            while (class5.field72 == 0L || class5.field72 > class4.method31((byte) 47)) {
                class7.field106 = class206.field3706.method386(class75.field1433, class200.field3639, -19769);
                for (int var4 = 0; var4 < class7.field106; var4++) {
                    this.method1323(80);
                }
                this.method1320((byte) 34);
                class157.method1115(class85.field1608, -2228, class130.field2397);
            }
        } catch (Exception var7) {
            class147.method1055(6678, null, var7);
            this.method1319(56, "crash");
        }
        this.method1324((byte) -105, true);
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(Z)V")
    public abstract void method295(boolean arg0);

    @OriginalMember(owner = "client!sb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3566++;
    }

    @OriginalMember(owner = "client!sb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3574++;
        if (class146.field2685 != this || class80.field1503) {
            return;
        }
        class54.field1110 = true;
        if (class134.field2409 == null || !class134.field2409.startsWith("1.5") || class4.method31((byte) 47) - class18.field527 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        boolean var10000;
        if (var2 == null || var2.width >= class97.field1793 && class124.field2324 <= var2.height) {
            var10000 = true;
        } else {
            var10000 = false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)V")
    public static void method1330(byte arg0) {
        field3573 = null;
        field3564 = null;
        field3604 = null;
        field3598 = null;
        field3581 = null;
        field3603 = null;
        field3588 = null;
        int var1 = 120 / ((52 - arg0) / 50);
        field3606 = null;
    }
}
