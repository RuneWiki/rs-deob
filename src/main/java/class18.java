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

@OriginalClass("mapview!k")
public abstract class class18 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "Z")
    private boolean field194 = false;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "Lv;")
    public static class40 field188 = class24.method170("Windmill", (byte) -85);

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "Lv;")
    public static class40 field189 = class24.method170("Pub)4Bar", (byte) -89);

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "Lv;")
    public static class40 field191 = class24.method170("sprites", (byte) -109);

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "Lv;")
    public static class40 field193 = class24.method170("Axe Shop", (byte) -92);

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "Lv;")
    public static class40 field196 = class24.method170("Silver Shop", (byte) -87);

    @OriginalMember(owner = "mapview!k", name = "j", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "Lv;")
    public static class40 field195 = class24.method170("Staff Shop", (byte) 105);

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "Lv;")
    public static class40 field198 = class24.method170(" map", (byte) 123);

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "Li;")
    public static class15 field190;

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "Z")
    public static boolean field199;

    @OriginalMember(owner = "mapview!k", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 11)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!k", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 30)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)V", line = 45)
    private final void method99(int arg0) {
        long var2 = class14.method78(0);
        long var4 = class30.field431[class5.field67];
        class30.field431[class5.field67] = var2;
        if (var4 != 0L && var2 > var4) {
        }
        int var6 = 49 % ((arg0 - 54) / 62);
        class5.field67 = class5.field67 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method106(-5);
    }

    @OriginalMember(owner = "mapview!k", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 72)
    public final URL getDocumentBase() {
        if (class1.field2 == null) {
            return class19.field210 == null || class19.field210.field170 == this ? super.getDocumentBase() : class19.field210.field170.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 87)
    public final synchronized void paint(Graphics arg0) {
        if (class12.field121 != this || class26.field389) {
            return;
        }
        class40.field525 = true;
        if (class17.field179 != null && class17.field179.startsWith("1.5") && class14.method78(0) - class7.field89 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class19.field201 <= var2.width && var2.height >= class5.field61) {
                class31.field435 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)Z", line = 119)
    public final boolean method102(int arg0) {
        if (arg0 != 17027) {
            field196 = null;
        }
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
            } else {
                this.method111(-10209, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!k", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 156)
    public final void focusGained(FocusEvent arg0) {
        class40.field525 = true;
    }

    @OriginalMember(owner = "mapview!k", name = "stop", descriptor = "()V", line = 163)
    public final void stop() {
        if (class12.field121 == this && !class26.field389) {
            class32.field446 = class14.method78(0) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ZI[BI)I", line = 174)
    public static final int method103(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (!arg0) {
            return 87;
        }
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class29.field418[(arg2[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!k", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 207)
    public final AppletContext getAppletContext() {
        if (class1.field2 == null) {
            return class19.field210 == null || class19.field210.field170 == this ? super.getAppletContext() : class19.field210.field170.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 220)
    public final String getParameter(String arg0) {
        if (class1.field2 == null) {
            return class19.field210 == null || class19.field210.field170 == this ? super.getParameter(arg0) : class19.field210.field170.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 239)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(I)V", line = 242)
    public static final void method104(int arg0) {
        class41.field532 = null;
        class16.field167 = null;
        if (arg0 != 0) {
            field195 = null;
        }
        class11.field116 = null;
        class15.field152 = null;
        class35.field465 = null;
        class8.field99 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 256)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!k", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 263)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!k", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 267)
    public final URL getCodeBase() {
        if (class1.field2 == null) {
            return class19.field210 == null || class19.field210.field170 == this ? super.getCodeBase() : class19.field210.field170.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(B)V", line = 282)
    private final synchronized void method105(byte arg0) {
        if (class26.field389) {
            return;
        }
        class26.field389 = true;
        try {
            class40.field509.removeFocusListener(this);
        } catch (Exception var10) {
        }
        try {
            this.method98(true);
        } catch (Exception var9) {
        }
        if (class1.field2 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        if (class19.field210 != null) {
            try {
                class19.field210.method91(5);
            } catch (Exception var7) {
            }
        }
        this.method100((byte) -109);
        int var6 = -95 / ((arg0 + 30) / 35);
    }

    @OriginalMember(owner = "mapview!k", name = "providesignlink", descriptor = "(Lj;)V", line = 336)
    public static final void providesignlink(class17 arg0) {
        class19.field210 = arg0;
        class27.field416 = arg0;
    }

    @OriginalMember(owner = "mapview!k", name = "destroy", descriptor = "()V", line = 347)
    public final void destroy() {
        if (class12.field121 == this && !class26.field389) {
            class32.field446 = class14.method78(0);
            class37.method226(303, 5000L);
            class27.field416 = null;
            this.method105((byte) -99);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 360)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!k", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 362)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!k", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 369)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IIIII)V", line = 373)
    public final void method107(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg2 != 31) {
                this.field194 = true;
            }
            if (class12.field121 != null) {
                class34.field460++;
                if (class34.field460 >= 3) {
                    this.method111(-10209, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class5.field61 = arg1;
            class32.field440 = arg4;
            class12.field121 = this;
            class19.field201 = arg0;
            if (class19.field210 == null) {
                class27.field416 = class19.field210 = new class17(false, this, arg3, null, 0);
            }
            class19.field210.method89(1, this, (byte) -101);
        } catch (Exception var7) {
            class36.method220(var7, 58, null);
            this.method111(arg2 ^ 0xFFFFD800, "crash");
        }
    }

    @OriginalMember(owner = "mapview!k", name = "run", descriptor = "()V", line = 412)
    public final void run() {
        try {
            if (class17.field176 != null) {
                String var1 = class17.field176.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class17.field179;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method111(-10209, "wrongjava");
                        return;
                    }
                    class5.field63 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class17.field179 == null || class17.field179.equals("1.4.2"))) {
                    this.method111(-10209, "wrongjava");
                    return;
                }
            }
            if (class19.field210.field170 != null) {
                Method var3 = class17.field177;
                if (var3 != null) {
                    try {
                        var3.invoke(class19.field210.field170, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method112(-1);
            class34.field457 = class29.method193(class19.field201, class5.field61, false, class40.field509);
            this.method101((byte) -48);
            class25.field378 = class32.method202((byte) -127);
            while (class32.field446 == 0L || class14.method78(0) < class32.field446) {
                class15.field147 = class25.field378.method59(-53, class12.field130, class5.field63);
                for (int var5 = 0; var5 < class15.field147; var5++) {
                    this.method99(127);
                }
                this.method109((byte) -104);
                class6.method47(class40.field509, 1001, class19.field210);
            }
        } catch (Exception var8) {
            class36.method220(var8, 58, null);
            this.method111(-10209, "crash");
        }
        this.method105((byte) 99);
    }

    @OriginalMember(owner = "mapview!k", name = "start", descriptor = "()V", line = 494)
    public final void start() {
        if (class12.field121 == this && !class26.field389) {
            class32.field446 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "(B)V", line = 508)
    public static void method108(byte arg0) {
        field189 = null;
        field190 = null;
        if (arg0 != 112) {
            return;
        }
        field191 = null;
        field198 = null;
        field195 = null;
        field196 = null;
        field193 = null;
        field188 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "(B)V", line = 529)
    private final void method109(byte arg0) {
        long var2 = class14.method78(0);
        if (arg0 >= -37) {
            this.field194 = true;
        }
        long var4 = class34.field462[class14.field141];
        if (var4 != 0L && var4 < var2) {
        }
        class34.field462[class14.field141] = var2;
        class14.field141 = class14.field141 + 1 & 0x1F;
        if (mapview.field279++ > 50) {
            mapview.field279 -= 50;
            class40.field525 = true;
            class40.field509.setSize(class19.field201, class5.field61);
            class40.field509.setVisible(true);
            if (class1.field2 == null) {
                class40.field509.setLocation(0, 0);
            } else {
                Insets var6 = class1.field2.getInsets();
                class40.field509.setLocation(var6.left, var6.top);
            }
        }
        this.method97(true);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(BI)Lv;", line = 572)
    public static final class40 method110(byte arg0, int arg1) {
        if (arg0 == -3) {
            class40 var2 = new class40();
            var2.field510 = 0;
            var2.field511 = new byte[arg1];
            return var2;
        } else {
            return (class40) null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 586)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ILjava/lang/String;)V", line = 593)
    public final void method111(int arg0, String arg1) {
        if (this.field194) {
            return;
        }
        this.field194 = true;
        System.out.println("error_game_" + arg1);
        try {
            if (arg0 != -10209) {
                return;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "(I)V", line = 615)
    public final synchronized void method112(int arg0) {
        Container var2;
        if (class1.field2 == null) {
            var2 = class19.field210.field170;
        } else {
            var2 = class1.field2;
        }
        if (class40.field509 != null) {
            class40.field509.removeFocusListener(this);
            var2.remove(class40.field509);
        }
        class40.field509 = new class34(this);
        var2.add(class40.field509);
        class40.field509.setSize(class19.field201, class5.field61);
        if (arg0 != -1) {
            return;
        }
        class40.field509.setVisible(true);
        if (class1.field2 == null) {
            class40.field509.setLocation(0, 0);
        } else {
            Insets var3 = class1.field2.getInsets();
            class40.field509.setLocation(var3.left, var3.top);
        }
        class40.field509.addFocusListener(this);
        class40.field509.requestFocus();
        class40.field525 = true;
        class31.field435 = false;
        class7.field89 = class14.method78(arg0 + 1);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Z)V")
    public abstract void method97(boolean arg0);

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(Z)V")
    public abstract void method98(boolean arg0);

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(B)V")
    public abstract void method100(byte arg0);

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(B)V")
    public abstract void method101(byte arg0);

    @OriginalMember(owner = "mapview!k", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "(I)V")
    public abstract void method106(int arg0);
}
