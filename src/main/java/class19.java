import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
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

@OriginalClass("mapview!ja")
public abstract class class19 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "Z")
    private boolean field175 = false;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "I")
    public static int field174 = -1;

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "Lf;")
    public static class10 field176 = class23.method139("Cooking Range", (byte) -109);

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "Lf;")
    public static class10 field178 = class23.method139("Mining Shop", (byte) -91);

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "Lf;")
    public static class10 field181 = class23.method139(" ", (byte) -73);

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "Lf;")
    public static class10 field179 = class23.method139("Scimitar Shop", (byte) -100);

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "I")
    public static volatile int field177 = 0;

    @OriginalMember(owner = "mapview!ja", name = "i", descriptor = "Z")
    public static boolean field182;

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "[I")
    public static int[] field180;

    @OriginalMember(owner = "mapview!ja", name = "start", descriptor = "()V", line = 4)
    public final void start() {
        if (class30.field405 == this && !class6.field58) {
            class36.field507 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIIIZ)V", line = 15)
    public final void method115(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            if (class30.field405 != null) {
                class28.field394++;
                if (class28.field394 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method118("alreadyloaded", (byte) -77);
                return;
            }
            class24.field262 = arg0;
            if (arg4) {
                field174 = 88;
            }
            class35.field494 = arg1;
            class17.field156 = arg3;
            class30.field405 = this;
            if (class22.field242 == null) {
                class6.field56 = class22.field242 = new class9(false, this, arg2, null, 0);
            }
            class22.field242.method52(115, 1, this);
        } catch (Exception var7) {
            class35.method230(null, 24789, var7);
            this.method118("crash", (byte) -86);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 56)
    public final URL getCodeBase() {
        if (class2.field13 == null) {
            return class22.field242 == null || class22.field242.field84 == this ? super.getCodeBase() : class22.field242.field84.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 73)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 76)
    public final void method118(String arg0, byte arg1) {
        if (this.field175) {
            return;
        }
        this.field175 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
            if (arg1 >= -51) {
                field178 = null;
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 97)
    public final String getParameter(String arg0) {
        if (class2.field13 == null) {
            return class22.field242 == null || class22.field242.field84 == this ? super.getParameter(arg0) : class22.field242.field84.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(B)V", line = 116)
    private final void method119(byte arg0) {
        long var2 = class22.method134((byte) -87);
        long var4 = class17.field159[class18.field162];
        if (var4 != 0L && var4 >= var2) {
        }
        class17.field159[class18.field162] = var2;
        class18.field162 = class18.field162 + 1 & 0x1F;
        synchronized (this) {
            int var7 = 27 / ((-arg0 - 59) / 60);
        }
        this.method121((byte) -128);
    }

    @OriginalMember(owner = "mapview!ja", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 148)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ja", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 162)
    public final URL getDocumentBase() {
        if (class2.field13 == null) {
            return class22.field242 == null || class22.field242.field84 == this ? super.getDocumentBase() : class22.field242.field84.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "(B)V", line = 177)
    public static final void method120(byte arg0) {
        if (class7.field65 != null) {
            class2 var1 = class7.field65;
            synchronized (class7.field65) {
                class7.field65 = null;
            }
        }
        int var3 = -67 / ((arg0 - 70) / 36);
    }

    @OriginalMember(owner = "mapview!ja", name = "providesignlink", descriptor = "(Lea;)V", line = 197)
    public static final void providesignlink(class9 arg0) {
        class22.field242 = arg0;
        class6.field56 = arg0;
    }

    @OriginalMember(owner = "mapview!ja", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 208)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ja", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 222)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IZ)V", line = 225)
    private final void method122(int arg0, boolean arg1) {
        synchronized (this) {
            if (class6.field58) {
                return;
            }
            class6.field58 = true;
        }
        if (class22.field242.field84 != null) {
            class22.field242.field84.destroy();
        }
        if (class10.field107 != null) {
            try {
                class10.field107.removeFocusListener(this);
                Container var5;
                if (class2.field13 == null) {
                    var5 = class22.field242.field84;
                } else {
                    var5 = class2.field13;
                }
                var5.remove(class10.field107);
            } catch (Exception var13) {
            }
        }
        if (arg0 <= 85) {
            return;
        }
        try {
            this.method124((byte) -114);
        } catch (Exception var12) {
        }
        if (class22.field242 != null) {
            try {
                class22.field242.method51(0);
            } catch (Exception var11) {
            }
        }
        this.method116((byte) 126);
        if (class2.field13 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "mapview!ja", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 300)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ja", name = "stop", descriptor = "()V", line = 303)
    public final void stop() {
        if (class30.field405 == this && !class6.field58) {
            class36.field507 = class22.method134((byte) -87) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 324)
    public final synchronized void paint(Graphics arg0) {
        if (class30.field405 != this || class6.field58) {
            return;
        }
        class25.field279 = true;
        if (class9.field98 != null && class9.field98.startsWith("1.5") && class22.method134((byte) -87) - class15.field138 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class35.field494 <= var2.width && var2.height >= class24.field262) {
                class18.field167 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "run", descriptor = "()V", line = 351)
    public final void run() {
        try {
            if (class9.field89 != null) {
                String var1 = class9.field89.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class9.field98;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method118("wrongjava", (byte) -110);
                        return;
                    }
                    class21.field222 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class9.field98 == null || class9.field98.equals("1.4.2"))) {
                    this.method118("wrongjava", (byte) -110);
                    return;
                }
            }
            if (class22.field242.field84 != null) {
                Method var3 = class9.field91;
                if (var3 != null) {
                    try {
                        var3.invoke(class22.field242.field84, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method127(0);
            class36.field505 = class22.method135(class35.field494, class24.field262, (byte) 5, class10.field107);
            this.method117((byte) 91);
            class4.field20 = class7.method39(true);
            while (class36.field507 == 0L || class36.field507 > class22.method134((byte) -87)) {
                class24.field256 = class4.field20.method235(class21.field222, class35.field495, false);
                for (int var5 = 0; var5 < class24.field256; var5++) {
                    this.method119((byte) 115);
                }
                this.method125(50);
                class15.method106(26972, class22.field242, class10.field107);
            }
        } catch (Exception var8) {
            class35.method230(null, 24789, var8);
            this.method118("crash", (byte) -123);
        }
        this.method122(127, true);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I)V", line = 435)
    private final void method125(int arg0) {
        long var2 = class22.method134((byte) -87);
        long var4 = class20.field187[class17.field158];
        if (var4 != 0L && var4 >= var2) {
        }
        class20.field187[class17.field158] = var2;
        class17.field158 = class17.field158 + 1 & 0x1F;
        if (arg0 < class2.field16++) {
            class2.field16 -= 50;
            class25.field279 = true;
            class10.field107.setSize(class35.field494, class24.field262);
            class10.field107.setVisible(true);
            if (class2.field13 == null) {
                class10.field107.setLocation(0, 0);
            } else {
                Insets var6 = class2.field13.getInsets();
                class10.field107.setLocation(var6.left, var6.top);
            }
        }
        this.method123((byte) 77);
    }

    @OriginalMember(owner = "mapview!ja", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 479)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ja", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 486)
    public final void focusGained(FocusEvent arg0) {
        class25.field279 = true;
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(I)V", line = 502)
    public static void method126(int arg0) {
        field176 = null;
        field180 = null;
        field178 = null;
        field179 = null;
        if (arg0 != 0) {
            providesignlink(null);
        }
        field181 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "destroy", descriptor = "()V", line = 524)
    public final void destroy() {
        if (class30.field405 == this && !class6.field58) {
            class36.field507 = class22.method134((byte) -87);
            class24.method142(118, 5000L);
            class6.field56 = null;
            this.method122(95, false);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 541)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ja", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 547)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ja", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 553)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(I)V", line = 557)
    public final synchronized void method127(int arg0) {
        Container var2;
        if (class2.field13 == null) {
            var2 = class22.field242.field84;
        } else {
            var2 = class2.field13;
        }
        if (class10.field107 != null) {
            class10.field107.removeFocusListener(this);
            var2.remove(class10.field107);
        }
        if (arg0 != 0) {
            field180 = null;
        }
        class10.field107 = new class7(this);
        var2.add(class10.field107);
        class10.field107.setSize(class35.field494, class24.field262);
        class10.field107.setVisible(true);
        if (class2.field13 == null) {
            class10.field107.setLocation(0, 0);
        } else {
            Insets var3 = class2.field13.getInsets();
            class10.field107.setLocation(var3.left, var3.top);
        }
        class10.field107.addFocusListener(this);
        class10.field107.requestFocus();
        class25.field279 = true;
        class18.field167 = false;
        class15.field138 = class22.method134((byte) -87);
    }

    @OriginalMember(owner = "mapview!ja", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 599)
    public final AppletContext getAppletContext() {
        if (class2.field13 == null) {
            return class22.field242 == null || class22.field242.field84 == this ? super.getAppletContext() : class22.field242.field84.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "(I)Z", line = 614)
    public final boolean method128(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (arg0 != -32241) {
            return false;
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
                this.method118("invalidhost", (byte) -84);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(B)V")
    public abstract void method116(byte arg0);

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(B)V")
    public abstract void method117(byte arg0);

    @OriginalMember(owner = "mapview!ja", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "(B)V")
    public abstract void method121(byte arg0);

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "(B)V")
    public abstract void method123(byte arg0);

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "(B)V")
    public abstract void method124(byte arg0);
}
