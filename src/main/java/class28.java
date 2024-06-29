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

@OriginalClass("mapview!oa")
public abstract class class28 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "Z")
    private boolean field389 = false;

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "La;")
    public static class1 field388 = class3.method36(" )2 ", -90);

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "La;")
    public static class1 field391 = class3.method36("sprites", -107);

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Z")
    public static boolean field390 = true;

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "La;")
    public static class1 field393 = class3.method36("Enter place name to find", -99);

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "La;")
    public static class1 field394 = class3.method36("Scimitar Shop", -125);

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "mapview!oa", name = "k", descriptor = "Z")
    public static boolean field397;

    @OriginalMember(owner = "mapview!oa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 4)
    public final URL getDocumentBase() {
        if (class6.field62 == null) {
            return class35.field477 == null || class35.field477.field147 == this ? super.getDocumentBase() : class35.field477.field147.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(IIIII)V", line = 19)
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -81) {
            field388 = null;
        }
        try {
            if (class13.field121 != null) {
                class3.field35++;
                if (class3.field35 >= 3) {
                    this.method183(-1809, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class33.field458 = arg3;
            class13.field121 = this;
            class41.field525 = arg2;
            class29.field405 = arg4;
            if (class35.field477 == null) {
                class31.field427 = class35.field477 = new class17(false, this, arg0, null, 0);
            }
            class35.field477.method84(true, 1, this);
        } catch (Exception var7) {
            class29.method192(-109, var7, null);
            this.method183(-1809, "crash");
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V", line = 59)
    private final void method182(int arg0) {
        long var2 = class9.method60((byte) -96);
        long var4 = class6.field58[class10.field95];
        if (var4 != 0L && var4 >= var2) {
        }
        class6.field58[class10.field95] = var2;
        if (arg0 != -8502) {
            field391 = null;
        }
        class10.field95 = class10.field95 + 1 & 0x1F;
        if (class40.field506++ > 50) {
            class40.field506 -= 50;
            class41.field519 = true;
            class29.field402.setSize(class33.field458, class29.field405);
            class29.field402.setVisible(true);
            if (class6.field62 == null) {
                class29.field402.setLocation(0, 0);
            } else {
                Insets var6 = class6.field62.getInsets();
                class29.field402.setLocation(var6.left, var6.top);
            }
        }
        this.method154(9);
    }

    @OriginalMember(owner = "mapview!oa", name = "start", descriptor = "()V", line = 101)
    public final void start() {
        if (class13.field121 == this && !class30.field408) {
            class8.field77 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 112)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!oa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 123)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 130)
    public final void method183(int arg0, String arg1) {
        if (this.field389) {
            return;
        }
        this.field389 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var4) {
        }
        if (arg0 != -1809) {
            field390 = true;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Z)V", line = 156)
    private final void method184(boolean arg0) {
        if (arg0) {
            return;
        }
        long var2 = class24.field226[class24.field225];
        long var4 = class9.method60((byte) -53);
        if (var2 != 0L && var2 < var4) {
        }
        class24.field226[class24.field225] = var4;
        class24.field225 = class24.field225 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method157(-31981);
    }

    @OriginalMember(owner = "mapview!oa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 187)
    public final void focusGained(FocusEvent arg0) {
        class41.field519 = true;
    }

    @OriginalMember(owner = "mapview!oa", name = "run", descriptor = "()V", line = 195)
    public final void run() {
        try {
            if (class17.field146 != null) {
                String var1 = class17.field146.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class17.field156;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method183(-1809, "wrongjava");
                        return;
                    }
                    class10.field111 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class17.field156 == null || class17.field156.equals("1.4.2"))) {
                    this.method183(-1809, "wrongjava");
                    return;
                }
            }
            if (class35.field477.field147 != null) {
                Method var3 = class17.field151;
                if (var3 != null) {
                    try {
                        var3.invoke(class35.field477.field147, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method190(893);
            class21.field199 = class27.method180(class29.field402, 0, class29.field405, class33.field458);
            this.method162((byte) -79);
            class8.field85 = class25.method172(-32354);
            while (class8.field77 == 0L || class8.field77 > class9.method60((byte) -36)) {
                class9.field90 = class8.field85.method34((byte) 127, class10.field111, class36.field479);
                for (int var5 = 0; var5 < class9.field90; var5++) {
                    this.method184(false);
                }
                this.method182(-8502);
                class30.method194(class29.field402, class35.field477, (byte) 47);
            }
        } catch (Exception var8) {
            class29.method192(-119, var8, null);
            this.method183(-1809, "crash");
        }
        this.method187(-58);
    }

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(I)Z", line = 274)
    public final boolean method185(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != -24849) {
                field394 = null;
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
                this.method183(-1809, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "(I)V", line = 309)
    public static void method186(int arg0) {
        field393 = null;
        if (arg0 != -27613) {
            field395 = -37;
        }
        field391 = null;
        field394 = null;
        field388 = null;
    }

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "(I)V", line = 322)
    private final synchronized void method187(int arg0) {
        if (class30.field408) {
            return;
        }
        class30.field408 = true;
        try {
            class29.field402.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method160((byte) 111);
            if (arg0 >= -24) {
                field391 = null;
            }
        } catch (Exception var8) {
        }
        if (class6.field62 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class35.field477 != null) {
            try {
                class35.field477.method86((byte) -121);
            } catch (Exception var6) {
            }
        }
        this.method167((byte) 118);
    }

    @OriginalMember(owner = "mapview!oa", name = "stop", descriptor = "()V", line = 382)
    public final void stop() {
        if (class13.field121 == this && !class30.field408) {
            class8.field77 = class9.method60((byte) -46) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "destroy", descriptor = "()V", line = 393)
    public final void destroy() {
        if (class13.field121 == this && !class30.field408) {
            class8.field77 = class9.method60((byte) -39);
            class1.method11(5000L, (byte) -61);
            class31.field427 = null;
            this.method187(-117);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "providesignlink", descriptor = "(Lia;)V", line = 410)
    public static final void providesignlink(class17 arg0) {
        class35.field477 = arg0;
        class31.field427 = arg0;
    }

    @OriginalMember(owner = "mapview!oa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 417)
    public final URL getCodeBase() {
        if (class6.field62 == null) {
            return class35.field477 == null || class35.field477.field147 == this ? super.getCodeBase() : class35.field477.field147.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 431)
    public final synchronized void paint(Graphics arg0) {
        if (class13.field121 != this || class30.field408) {
            return;
        }
        class41.field519 = true;
        if (class17.field156 != null && class17.field156.startsWith("1.5") && class9.method60((byte) -86) - class2.field14 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class33.field458 <= var2.width && var2.height >= class29.field405) {
                class40.field502 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 456)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 464)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 469)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "([La;B)La;", line = 475)
    public static final class1 method188(class1[] arg0, byte arg1) {
        int var2 = -83 / ((-arg1 - 9) / 56);
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class1.method24(0, arg0.length, -108, arg0);
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(La;Lq;La;I)[Ls;", line = 492)
    public static final class34[] method189(class1 arg0, class31 arg1, class1 arg2, int arg3) {
        if (arg3 <= 29) {
            return (class34[]) null;
        } else {
            int var4 = arg1.method196(-2, arg2);
            int var5 = arg1.method201(0, var4, arg0);
            return class21.method108(arg1, var4, var5, 101);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 509)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "(I)V", line = 515)
    public final synchronized void method190(int arg0) {
        Container var2;
        if (class6.field62 == null) {
            var2 = class35.field477.field147;
        } else {
            var2 = class6.field62;
        }
        if (class29.field402 != null) {
            class29.field402.removeFocusListener(this);
            var2.remove(class29.field402);
        }
        if (arg0 != 893) {
            this.windowActivated(null);
        }
        class29.field402 = new class29(this);
        var2.add(class29.field402);
        class29.field402.setSize(class33.field458, class29.field405);
        class29.field402.setVisible(true);
        if (class6.field62 == null) {
            class29.field402.setLocation(0, 0);
        } else {
            Insets var3 = class6.field62.getInsets();
            class29.field402.setLocation(var3.left, var3.top);
        }
        class29.field402.addFocusListener(this);
        class29.field402.requestFocus();
        class41.field519 = true;
        class40.field502 = false;
        class2.field14 = class9.method60((byte) -59);
    }

    @OriginalMember(owner = "mapview!oa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 553)
    public final String getParameter(String arg0) {
        if (class6.field62 == null) {
            return class35.field477 == null || class35.field477.field147 == this ? super.getParameter(arg0) : class35.field477.field147.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 571)
    public final AppletContext getAppletContext() {
        if (class6.field62 == null) {
            return class35.field477 == null || class35.field477.field147 == this ? super.getAppletContext() : class35.field477.field147.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 584)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 594)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 597)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(I)V")
    public abstract void method154(int arg0);

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B)V")
    public abstract void method162(byte arg0);

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "(I)V")
    public abstract void method157(int arg0);

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(B)V")
    public abstract void method167(byte arg0);

    @OriginalMember(owner = "mapview!oa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(B)V")
    public abstract void method160(byte arg0);
}
