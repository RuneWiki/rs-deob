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
public abstract class class27 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "Lra;")
    public static class33 field374 = new class33();

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "Lw;")
    public static class38 field380 = class35.method219("Mining Shop", true);

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "Lw;")
    public static class38 field379 = class35.method219("Please wait)3)3)3 Rendering Map", true);

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "Lw;")
    public static class38 field376 = class35.method219("Makeover Mage", true);

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "Lw;")
    public static class38 field382 = class35.method219("Prev page", true);

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "Lw;")
    public static class38 field381 = class35.method219("Crafting Shop", true);

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "Lw;")
    public static class38 field383 = class35.method219("map", true);

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "mapview!oa", name = "k", descriptor = "Z")
    public static boolean field384;

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "[B")
    public static byte[] field378;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 6)
    public final void method166(boolean arg0, String arg1) {
        if (arg0) {
            method173(true);
        }
        if (this.field375) {
            return;
        }
        this.field375 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 28)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(IIIII)V", line = 33)
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class5.field32 != null) {
                class37.field498++;
                if (class37.field498 >= 3) {
                    this.method166(false, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase());
                return;
            }
            int var6 = -22 % ((arg0 - 67) / 42);
            class5.field32 = this;
            class10.field89 = arg4;
            class16.field153 = arg2;
            class12.field106 = arg3;
            if (class24.field338 == null) {
                class6.field44 = class24.field338 = new class22(false, this, arg1, null, 0);
            }
            class24.field338.method128(1, this, (byte) 46);
        } catch (Exception var8) {
            class26.method165(null, -78, var8);
            this.method166(false, "crash");
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 75)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 80)
    public final URL getCodeBase() {
        if (class4.field24 == null) {
            return class24.field338 == null || class24.field338.field230 == this ? super.getCodeBase() : class24.field338.field230.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 97)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!oa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 108)
    public final String getParameter(String arg0) {
        if (class4.field24 == null) {
            return class24.field338 == null || class24.field338.field230 == this ? super.getParameter(arg0) : class24.field338.field230.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B)V", line = 123)
    public static final void method168(byte arg0) {
        class35.field480 = null;
        class1.field6 = null;
        class23.field242 = null;
        class32.field418 = null;
        if (arg0 <= 80) {
            providesignlink(null);
        }
        class38.field505 = null;
        class31.field401 = null;
    }

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(B)Z", line = 153)
    public final boolean method169(byte arg0) {
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
            if (arg0 > -3) {
                this.paint(null);
            }
            this.method166(false, "invalidhost");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "stop", descriptor = "()V", line = 185)
    public final void stop() {
        if (class5.field32 == this && !mapview.field289) {
            class16.field146 = class6.method25(-58) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 196)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 204)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 210)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(I)V", line = 214)
    private final synchronized void method170(int arg0) {
        if (mapview.field289) {
            return;
        }
        mapview.field289 = true;
        try {
            if (arg0 != 0) {
                return;
            }
            class31.field397.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method145(5565);
        } catch (Exception var8) {
        }
        if (class4.field24 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class24.field338 != null) {
            try {
                class24.field338.method124(true);
            } catch (Exception var6) {
            }
        }
        this.method142(arg0 + 20);
    }

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(I)B", line = 264)
    public static final byte method171(int arg0) {
        if (arg0 != 0) {
            field382 = null;
        }
        return field378 == null ? 0 : field378[mapview.field257];
    }

    @OriginalMember(owner = "mapview!oa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 280)
    public final void focusGained(FocusEvent arg0) {
        class32.field417 = true;
    }

    @OriginalMember(owner = "mapview!oa", name = "providesignlink", descriptor = "(Lm;)V", line = 287)
    public static final void providesignlink(class22 arg0) {
        class24.field338 = arg0;
        class6.field44 = arg0;
    }

    @OriginalMember(owner = "mapview!oa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 294)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "destroy", descriptor = "()V", line = 297)
    public final void destroy() {
        if (class5.field32 == this && !mapview.field289) {
            class16.field146 = class6.method25(-55);
            class8.method36(5000L, 10);
            class6.field44 = null;
            this.method170(0);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 317)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!oa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 328)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "(B)V", line = 332)
    private final void method172(byte arg0) {
        long var2 = class6.method25(-30);
        long var4 = class36.field490[class24.field336];
        class36.field490[class24.field336] = var2;
        class24.field336 = class24.field336 + 1 & 0x1F;
        synchronized (this) {
            int var7 = -52 / ((arg0 + 28) / 41);
        }
        if (var4 != 0L && var2 > var4) {
        }
        this.method143((byte) -74);
    }

    @OriginalMember(owner = "mapview!oa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 361)
    public final AppletContext getAppletContext() {
        if (class4.field24 == null) {
            return class24.field338 == null || class24.field338.field230 == this ? super.getAppletContext() : class24.field338.field230.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 380)
    public final URL getDocumentBase() {
        if (class4.field24 == null) {
            return class24.field338 == null || class24.field338.field230 == this ? super.getDocumentBase() : class24.field338.field230.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Z)V", line = 396)
    public static void method173(boolean arg0) {
        field374 = null;
        field380 = null;
        field378 = null;
        field381 = null;
        field376 = null;
        if (!arg0) {
            method171(11);
        }
        field379 = null;
        field382 = null;
        field383 = null;
    }

    @OriginalMember(owner = "mapview!oa", name = "start", descriptor = "()V", line = 415)
    public final void start() {
        if (class5.field32 == this && !mapview.field289) {
            class16.field146 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "run", descriptor = "()V", line = 429)
    public final void run() {
        try {
            if (class22.field224 != null) {
                String var1 = class22.field224.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class22.field222;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method166(false, "wrongjava");
                        return;
                    }
                    class26.field370 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class22.field222 == null || class22.field222.equals("1.4.2"))) {
                    this.method166(false, "wrongjava");
                    return;
                }
            }
            if (class24.field338.field230 != null) {
                Method var3 = class22.field228;
                if (var3 != null) {
                    try {
                        var3.invoke(class24.field338.field230, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method174(1);
            class16.field154 = class25.method162(class31.field397, class12.field106, 0, class16.field153);
            this.method136((byte) 84);
            class34.field453 = class8.method34(10);
            class34.field453.method132(0);
            while (class16.field146 == 0L || class16.field146 > class6.method25(-121)) {
                class35.field485 = class34.field453.method133((byte) -70, class16.field145, class26.field370);
                for (int var5 = 0; var5 < class35.field485; var5++) {
                    this.method172((byte) -119);
                }
                this.method175(-6895);
                class19.method116(-124, true);
            }
        } catch (Exception var8) {
            class26.method165(null, -109, var8);
            this.method166(false, "crash");
        }
        this.method170(0);
    }

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "(I)V", line = 513)
    public final synchronized void method174(int arg0) {
        Container var2;
        if (class4.field24 == null) {
            var2 = class24.field338.field230;
        } else {
            var2 = class4.field24;
        }
        if (class31.field397 != null) {
            class31.field397.removeFocusListener(this);
            var2.remove(class31.field397);
        }
        class31.field397 = new class4(this);
        var2.add(class31.field397);
        class31.field397.setSize(class12.field106, class16.field153);
        class31.field397.setVisible(true);
        if (class4.field24 == null) {
            class31.field397.setLocation(0, 0);
        } else {
            Insets var3 = class4.field24.getInsets();
            class31.field397.setLocation(var3.left, var3.top);
        }
        class31.field397.addFocusListener(this);
        class31.field397.requestFocus();
        class32.field417 = true;
        class35.field470 = false;
        class12.field98 = class6.method25(-16);
        if (arg0 != 1) {
            this.method145(3);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "(I)V", line = 557)
    private final void method175(int arg0) {
        long var2 = class6.method25(-124);
        long var4 = class25.field351[class10.field85];
        if (var4 != 0L && var4 < var2) {
        }
        class25.field351[class10.field85] = var2;
        class10.field85 = class10.field85 + 1 & 0x1F;
        if (arg0 != -6895) {
            return;
        }
        if (class11.field96++ > 50) {
            class32.field417 = true;
            class11.field96 -= 50;
            class31.field397.setSize(class12.field106, class16.field153);
            class31.field397.setVisible(true);
            if (class4.field24 == null) {
                class31.field397.setLocation(0, 0);
            } else {
                Insets var6 = class4.field24.getInsets();
                class31.field397.setLocation(var6.left, var6.top);
            }
        }
        this.method151(arg0 ^ 0x1AEE);
    }

    @OriginalMember(owner = "mapview!oa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 603)
    public final synchronized void paint(Graphics arg0) {
        if (class5.field32 != this || mapview.field289) {
            return;
        }
        class32.field417 = true;
        if (class22.field222 != null && class22.field222.startsWith("1.5") && class6.method25(-96) - class12.field98 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class12.field106 && class16.field153 <= var2.height) {
                class35.field470 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V")
    public abstract void method145(int arg0);

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(B)V")
    public abstract void method136(byte arg0);

    @OriginalMember(owner = "mapview!oa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "(B)V")
    public abstract void method143(byte arg0);

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "(I)V")
    public abstract void method151(int arg0);

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "(I)V")
    public abstract void method142(int arg0);
}
