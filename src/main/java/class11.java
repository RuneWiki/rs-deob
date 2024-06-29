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

@OriginalClass("mapview!fa")
public abstract class class11 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "Z")
    private boolean field79 = false;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "Lia;")
    public static class17 field78 = new class17();

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "Lt;")
    public static class31 field80 = class14.method84(110, "Stonemason");

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "Lt;")
    public static class31 field85 = class14.method84(127, "Prev page");

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "Lt;")
    public static class31 field84 = class14.method84(127, "Water Source");

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Lt;")
    public static class31 field82 = class14.method84(112, "");

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "Lt;")
    public static class31 field87 = class14.method84(125, "Shield Shop");

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "Lt;")
    public static class31 field88 = class14.method84(108, "_");

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "Lt;")
    public static class31 field83 = class14.method84(117, "Skirt Shop");

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Ljava/awt/Frame;")
    private static Frame field86;

    @OriginalMember(owner = "mapview!fa", name = "l", descriptor = "Z")
    public static boolean field89;

    @OriginalMember(owner = "mapview!fa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 8)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 10)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "run", descriptor = "()V", line = 21)
    public final void run() {
        try {
            if (class16.field137 != null) {
                String var1 = class16.field137.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class16.field134;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method69((byte) -62, "wrongjava");
                        return;
                    }
                    class22.field193 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class16.field134 == null || class16.field134.equals("1.4.2"))) {
                    this.method69((byte) -75, "wrongjava");
                    return;
                }
            }
            this.method65(-94);
            class34.field384 = class13.method75(true, class18.field160, class17.field146, class12.field90);
            this.method59((byte) 66);
            class22.field191 = class17.method97((byte) -112);
            class22.field191.method1(false);
            while (class1.field3 == 0L || System.currentTimeMillis() < class1.field3) {
                class26.field302 = class22.field191.method4(class25.field285, class22.field193, -101);
                for (int var3 = 0; var3 < class26.field302; var3++) {
                    this.method63(-108);
                }
                this.method72(-107);
            }
        } catch (Exception var5) {
            class22.method130(-1, var5, null);
            this.method69((byte) -114, "crash");
        }
        this.method71(-100);
    }

    @OriginalMember(owner = "mapview!fa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 88)
    public final synchronized void paint(Graphics arg0) {
        if (class1.field17 != this || class1.field6) {
            return;
        }
        class1.field16 = true;
        if (class16.field134 == null || !class16.field134.startsWith("1.5") || System.currentTimeMillis() - class26.field298 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        if (var2 == null) {
            System.out.println("Rect: null");
        } else {
            System.out.println("Rect: " + var2.x + "," + var2.y + "," + var2.width + "," + var2.height);
        }
        if (var2 == null || var2.width >= class17.field146 && class18.field160 <= var2.height) {
            class14.field114 = true;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "start", descriptor = "()V", line = 117)
    public final void start() {
        if (class1.field17 == this && !class1.field6) {
            class1.field3 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(I)V", line = 129)
    public static final void method61(int arg0) {
        if (arg0 != 19624) {
            field81 = 8;
        }
        if (class16.field137.toLowerCase().indexOf("microsoft") != -1) {
            class22.field186[186] = 57;
            class22.field186[187] = 27;
            class22.field186[188] = 71;
            class22.field186[189] = 26;
            class22.field186[190] = 72;
            class22.field186[191] = 73;
            class22.field186[192] = 58;
            class22.field186[219] = 42;
            class22.field186[220] = 74;
            class22.field186[221] = 43;
            class22.field186[222] = 59;
            class22.field186[223] = 28;
            return;
        }
        class22.field186[44] = 71;
        class22.field186[45] = 26;
        class22.field186[46] = 72;
        class22.field186[47] = 73;
        class22.field186[59] = 57;
        class22.field186[61] = 27;
        class22.field186[91] = 42;
        class22.field186[92] = 74;
        class22.field186[93] = 43;
        if (class16.field126 == null) {
            class22.field186[192] = 58;
            class22.field186[222] = 59;
        } else {
            class22.field186[192] = 28;
            class22.field186[222] = 58;
            class22.field186[520] = 59;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(II)I", line = 178)
    public static int method62(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!fa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 185)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "(I)V", line = 193)
    private final void method63(int arg0) {
        long var2 = System.currentTimeMillis();
        long var4 = class24.field202[class30.field332];
        if (arg0 > -104) {
            field86 = null;
        }
        if (var4 != 0L && var4 >= var2) {
        }
        class24.field202[class30.field332] = var2;
        class30.field332 = class30.field332 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method68(-101);
    }

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "(I)V", line = 222)
    public static void method64(int arg0) {
        field82 = null;
        field80 = null;
        field87 = null;
        field85 = null;
        field84 = null;
        field78 = null;
        field83 = null;
        if (arg0 != 7202) {
            field80 = null;
        }
        field88 = null;
        field86 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 242)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 245)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!fa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 253)
    public final String getParameter(String arg0) {
        if (field86 == null) {
            return class20.field177 == null || class20.field177.field132 == this ? super.getParameter(arg0) : class20.field177.field132.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "(I)V", line = 267)
    public final synchronized void method65(int arg0) {
        System.out.println("addcanvas");
        Container var2;
        if (field86 == null) {
            var2 = class20.field177.field132;
        } else {
            var2 = field86;
        }
        if (class12.field90 != null) {
            class12.field90.removeFocusListener(this);
            var2.remove(class12.field90);
        }
        class12.field90 = new class7(this);
        if (arg0 > -50) {
            return;
        }
        var2.add(class12.field90);
        class12.field90.setSize(class17.field146, class18.field160);
        class12.field90.setVisible(true);
        if (field86 == null) {
            class12.field90.setLocation(0, 0);
        } else {
            Insets var3 = field86.getInsets();
            class12.field90.setLocation(var3.left, var3.top);
        }
        class12.field90.addFocusListener(this);
        class12.field90.requestFocus();
        class1.field16 = true;
        class14.field114 = false;
        class26.field298 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "mapview!fa", name = "destroy", descriptor = "()V", line = 308)
    public final void destroy() {
        if (class1.field17 == this && !class1.field6) {
            class1.field3 = System.currentTimeMillis();
            mapview.method145(5000L, -98);
            class13.field98 = null;
            this.method71(-101);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 321)
    public final URL getCodeBase() {
        if (field86 == null) {
            return class20.field177 == null || class20.field177.field132 == this ? super.getCodeBase() : class20.field177.field132.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 335)
    public final URL getDocumentBase() {
        if (field86 == null) {
            return class20.field177 == null || class20.field177.field132 == this ? super.getDocumentBase() : class20.field177.field132.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "(I)Z", line = 354)
    public final boolean method66(int arg0) {
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
            if (arg0 > -7) {
                return false;
            } else if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method69((byte) -57, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 384)
    public final AppletContext getAppletContext() {
        if (field86 == null) {
            return class20.field177 == null || class20.field177.field132 == this ? super.getAppletContext() : class20.field177.field132.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 404)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IIIII)V", line = 409)
    public final void method67(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class1.field17 != null) {
                this.method69((byte) -92, "alreadyloaded");
                return;
            }
            class18.field160 = arg4;
            class17.field146 = arg0;
            class14.field109 = arg2;
            class1.field17 = this;
            if (class20.field177 == null) {
                class13.field98 = class20.field177 = new class16(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg3, null, 0);
            }
            class20.field177.method89(1, false, this);
            int var6 = -123 / ((arg1 + 77) / 43);
        } catch (Exception var8) {
            class22.method130(-1, var8, null);
            this.method69((byte) -75, "crash");
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "providesignlink", descriptor = "(Li;)V", line = 440)
    public static final void providesignlink(class16 arg0) {
        class20.field177 = arg0;
        class13.field98 = arg0;
    }

    @OriginalMember(owner = "mapview!fa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 454)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(BLjava/lang/String;)V", line = 458)
    public final void method69(byte arg0, String arg1) {
        if (this.field79) {
            return;
        }
        this.field79 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var4) {
        }
        if (arg0 >= -45) {
            field85 = null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 478)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "stop", descriptor = "()V", line = 484)
    public final void stop() {
        if (class1.field17 == this && !class1.field6) {
            class1.field3 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 496)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "(I)V", line = 502)
    private final synchronized void method71(int arg0) {
        if (class1.field6) {
            return;
        }
        class1.field6 = true;
        try {
            if (arg0 >= -84) {
                this.windowIconified(null);
            }
            class12.field90.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method70((byte) -20);
        } catch (Exception var8) {
        }
        if (field86 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class20.field177 != null) {
            try {
                class20.field177.method88((byte) 84);
            } catch (Exception var6) {
            }
        }
        this.method58(-86);
    }

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "(I)V", line = 554)
    private final void method72(int arg0) {
        long var2 = System.currentTimeMillis();
        long var4 = class14.field117[class25.field291];
        int var6 = -86 / ((9 - arg0) / 56);
        if (var4 != 0L && var2 > var4) {
        }
        class14.field117[class25.field291] = var2;
        class25.field291 = class25.field291 + 1 & 0x1F;
        if (class4.field27++ > 50) {
            class1.field16 = true;
            class4.field27 -= 50;
            class12.field90.setSize(class17.field146, class18.field160);
            class12.field90.setVisible(true);
            if (field86 == null) {
                class12.field90.setLocation(0, 0);
            } else {
                Insets var7 = field86.getInsets();
                class12.field90.setLocation(var7.left, var7.top);
            }
        }
        this.method60(30);
    }

    @OriginalMember(owner = "mapview!fa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 599)
    public final void focusGained(FocusEvent arg0) {
        class1.field16 = true;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V")
    public abstract void method58(int arg0);

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)V")
    public abstract void method59(byte arg0);

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(I)V")
    public abstract void method60(int arg0);

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "(I)V")
    public abstract void method68(int arg0);

    @OriginalMember(owner = "mapview!fa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(B)V")
    public abstract void method70(byte arg0);
}
