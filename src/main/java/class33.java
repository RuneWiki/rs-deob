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
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public abstract class class33 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!u", name = "i", descriptor = "Z")
    private boolean field397 = false;

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Lk;")
    public static class21 field391 = class14.method92((byte) 57, "Crafting Shop");

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "Lk;")
    public static class21 field389 = class14.method92((byte) 57, "Overview");

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "Lk;")
    public static class21 field394 = class14.method92((byte) 57, "Pub)4Bar");

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "Lk;")
    public static class21 field392 = class14.method92((byte) 57, "Switch to ");

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Lk;")
    public static class21 field395 = class14.method92((byte) 57, "Helmet Shop");

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Li;")
    public static class17 field390;

    @OriginalMember(owner = "mapview!u", name = "j", descriptor = "Z")
    public static boolean field398;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)V", line = 6)
    public final synchronized void method192(byte arg0) {
        int var2 = -45 % ((47 - arg0) / 61);
        Container var3;
        if (class26.field332 == null) {
            var3 = class8.field148.field227;
        } else {
            var3 = class26.field332;
        }
        if (class28.field348 != null) {
            class28.field348.removeFocusListener(this);
            var3.remove(class28.field348);
        }
        class28.field348 = new class22(this);
        var3.add(class28.field348);
        class28.field348.setSize(mapview.field14, field396);
        class28.field348.setVisible(true);
        if (class26.field332 == null) {
            class28.field348.setLocation(0, 0);
        } else {
            Insets var4 = class26.field332.getInsets();
            class28.field348.setLocation(var4.left, var4.top);
        }
        class28.field348.addFocusListener(this);
        class28.field348.requestFocus();
        class10.field156 = true;
        class28.field343 = false;
        class24.field297 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "mapview!u", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 42)
    public final void focusGained(FocusEvent arg0) {
        class10.field156 = true;
    }

    @OriginalMember(owner = "mapview!u", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 51)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(I)Z", line = 55)
    public final boolean method193(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            if (arg0 != 0) {
                this.paint(null);
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method198("invalidhost", (byte) 123);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!u", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 88)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(Z)V", line = 96)
    private final synchronized void method194(boolean arg0) {
        if (class3.field89) {
            return;
        }
        class3.field89 = true;
        try {
            class28.field348.removeFocusListener(this);
            if (arg0) {
                field393 = 81;
            }
        } catch (Exception var9) {
        }
        try {
            this.method14(arg0);
        } catch (Exception var8) {
        }
        if (class26.field332 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class8.field148 != null) {
            try {
                class8.field148.method110(0);
            } catch (Exception var6) {
            }
        }
        this.method18(-1);
    }

    @OriginalMember(owner = "mapview!u", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 143)
    public final String getParameter(String arg0) {
        if (class26.field332 == null) {
            return class8.field148 == null || class8.field148.field227 == this ? super.getParameter(arg0) : class8.field148.field227.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!u", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 172)
    public final synchronized void paint(Graphics arg0) {
        if (class15.field196 != this || class3.field89) {
            return;
        }
        class10.field156 = true;
        if (class18.field222 != null && class18.field222.startsWith("1.5") && System.currentTimeMillis() - class24.field297 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || mapview.field14 <= var2.width && field396 <= var2.height) {
                class28.field343 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!u", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 197)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!u", name = "destroy", descriptor = "()V", line = 204)
    public final void destroy() {
        if (class15.field196 == this && !class3.field89) {
            class28.field349 = System.currentTimeMillis();
            class10.method67(1, 5000L);
            class30.field371 = null;
            this.method194(false);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 218)
    public final URL getDocumentBase() {
        if (class26.field332 == null) {
            return class8.field148 == null || class8.field148.field227 == this ? super.getDocumentBase() : class8.field148.field227.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "providesignlink", descriptor = "(Lia;)V", line = 243)
    public static final void providesignlink(class18 arg0) {
        class8.field148 = arg0;
        class30.field371 = arg0;
    }

    @OriginalMember(owner = "mapview!u", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 249)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!u", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 252)
    public final AppletContext getAppletContext() {
        if (class26.field332 == null) {
            return class8.field148 == null || class8.field148.field227 == this ? super.getAppletContext() : class8.field148.field227.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(BLjava/lang/String;)Lk;", line = 270)
    public static final class21 method195(byte arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var2 = arg1.getBytes();
        }
        class21 var4 = new class21();
        var4.field256 = 0;
        int var5 = 11 / ((42 - arg0) / 61);
        var4.field259 = var2;
        for (int var6 = 0; var6 < var2.length; var6++) {
            if (var2[var6] != 0) {
                var2[var4.field256++] = var2[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!u", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 301)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!u", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 309)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!u", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 317)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!u", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 322)
    public final URL getCodeBase() {
        if (class26.field332 == null) {
            return class8.field148 == null || class8.field148.field227 == this ? super.getCodeBase() : class8.field148.field227.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "(I)V", line = 340)
    private final void method196(int arg0) {
        long var2 = System.currentTimeMillis();
        long var4 = class21.field265[class23.field278];
        class21.field265[class23.field278] = var2;
        if (var4 != 0L && var2 <= var4) {
        }
        class23.field278 = class23.field278 - arg0 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method25(25);
    }

    @OriginalMember(owner = "mapview!u", name = "stop", descriptor = "()V", line = 369)
    public final void stop() {
        if (class15.field196 == this && !class3.field89) {
            class28.field349 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "(I)V", line = 381)
    public static void method197(int arg0) {
        if (arg0 != 0) {
            method195((byte) -67, null);
        }
        field394 = null;
        field390 = null;
        field389 = null;
        field391 = null;
        field392 = null;
        field395 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "run", descriptor = "()V", line = 402)
    public final void run() {
        try {
            if (class18.field229 != null) {
                String var1 = class18.field229.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class18.field222;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method198("wrongjava", (byte) -36);
                        return;
                    }
                    class28.field346 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class18.field222 == null || class18.field222.equals("1.4.2"))) {
                    this.method198("wrongjava", (byte) 121);
                    return;
                }
            }
            this.method192((byte) 113);
            field390 = class32.method187(class28.field348, (byte) 14, field396, mapview.field14);
            this.method29(-3540);
            class28.field350 = class6.method55(16);
            class28.field350.method69((byte) -3);
            while (class28.field349 == 0L || System.currentTimeMillis() < class28.field349) {
                class30.field373 = class28.field350.method68(class28.field346, class8.field146, 3);
                for (int var3 = 0; var3 < class30.field373; var3++) {
                    this.method196(-1);
                }
                this.method199(-6079);
            }
        } catch (Exception var5) {
            class11.method71(var5, 95, null);
            this.method198("crash", (byte) -104);
        }
        this.method194(false);
    }

    @OriginalMember(owner = "mapview!u", name = "start", descriptor = "()V", line = 464)
    public final void start() {
        if (class15.field196 == this && !class3.field89) {
            class28.field349 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 477)
    public final void method198(String arg0, byte arg1) {
        if (this.field397) {
            return;
        }
        this.field397 = true;
        int var3 = -30 % ((61 - arg1) / 57);
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "(I)V", line = 501)
    private final void method199(int arg0) {
        long var2 = System.currentTimeMillis();
        if (arg0 != -6079) {
            return;
        }
        long var4 = class28.field347[class19.field245];
        if (var4 != 0L && var2 <= var4) {
        }
        class28.field347[class19.field245] = var2;
        class19.field245 = class19.field245 + 1 & 0x1F;
        if (class26.field325++ > 50) {
            class10.field156 = true;
            class26.field325 -= 50;
            class28.field348.setSize(mapview.field14, field396);
            class28.field348.setVisible(true);
            if (class26.field332 == null) {
                class28.field348.setLocation(0, 0);
            } else {
                Insets var6 = class26.field332.getInsets();
                class28.field348.setLocation(var6.left, var6.top);
            }
        }
        this.method1((byte) -69);
    }

    @OriginalMember(owner = "mapview!u", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 546)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IIIII)V", line = 553)
    public final void method200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 1) {
            return;
        }
        try {
            if (class15.field196 != null) {
                this.method198("alreadyloaded", (byte) 0);
                return;
            }
            class32.field387 = arg2;
            class15.field196 = this;
            field396 = arg1;
            mapview.field14 = arg3;
            if (class8.field148 == null) {
                class30.field371 = class8.field148 = new class18(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg4, null, 0);
            }
            class8.field148.method106(this, 108, 1);
        } catch (Exception var7) {
            class11.method71(var7, 95, null);
            this.method198("crash", (byte) 1);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)V")
    public abstract void method18(int arg0);

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Z)V")
    public abstract void method14(boolean arg0);

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(B)V")
    public abstract void method1(byte arg0);

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "(I)V")
    public abstract void method29(int arg0);

    @OriginalMember(owner = "mapview!u", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "(I)V")
    public abstract void method25(int arg0);
}
