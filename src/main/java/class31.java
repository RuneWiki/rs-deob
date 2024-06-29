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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public abstract class class31 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Z")
    private boolean field395 = false;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Lj;")
    public static class17 field394 = class30.method190(-114, "Guide");

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "Lj;")
    public static class17 field392 = class30.method190(-118, "Makeover Mage");

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lj;")
    public static class17 field393 = class30.method190(-95, "Dairy Churn");

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "Lj;")
    public static class17 field391 = class30.method190(-126, "Tannery");

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "[I")
    public static int[] field396;

    @OriginalMember(owner = "mapview!q", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        try {
            if (class7.field141 != null) {
                String var1 = class7.field141.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class7.field140;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method200("wrongjava", 50);
                        return;
                    }
                    class29.field379 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class7.field140 == null || class7.field140.equals("1.4.2"))) {
                    this.method200("wrongjava", 50);
                    return;
                }
            }
            if (class32.field403.field139 != null) {
                Method var3 = class7.field151;
                if (var3 != null) {
                    try {
                        var3.invoke(class32.field403.field139, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method197(2641);
            class26.field333 = class18.method140(class1.field77, class23.field306, class33.field411, (byte) -126);
            this.method19(-35);
            class23.field301 = class23.method158(false);
            class23.field301.method31(-12745);
            while (class4.field109 == 0L || class4.field109 > class20.method149((byte) 23)) {
                class8.field175 = class23.field301.method32(class29.field379, class4.field108, -13659);
                for (int var5 = 0; var5 < class8.field175; var5++) {
                    this.method196((byte) 91);
                }
                this.method198((byte) -85);
            }
        } catch (Exception var8) {
            class15.method108(null, 65, var8);
            this.method200("crash", 50);
        }
        this.method202(0);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(BIIII)V", line = 84)
    public final void method195(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class18.field277 != null) {
                this.method200("alreadyloaded", 50);
                return;
            }
            class1.field77 = arg3;
            if (arg0 != -62) {
                method204((byte) 100, -102L);
            }
            class6.field125 = arg2;
            class18.field277 = this;
            class23.field306 = arg4;
            if (class32.field403 == null) {
                class17.field258 = class32.field403 = new class7(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg1, null, 0);
            }
            class32.field403.method68(1, 10448, this);
        } catch (Exception var7) {
            class15.method108(null, 86, var7);
            this.method200("crash", 50);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 117)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!q", name = "start", descriptor = "()V", line = 121)
    public final void start() {
        if (class18.field277 == this && !class16.field256) {
            class4.field109 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 131)
    public final synchronized void paint(Graphics arg0) {
        if (class18.field277 != this || class16.field256) {
            return;
        }
        class28.field369 = true;
        if (class7.field140 != null && class7.field140.startsWith("1.5") && class20.method149((byte) -1) - class24.field314 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class1.field77 && class23.field306 <= var2.height) {
                class24.field317 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!q", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 154)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 159)
    private final void method196(byte arg0) {
        long var2 = class20.method149((byte) 28);
        long var4 = class15.field246[class1.field67];
        class15.field246[class1.field67] = var2;
        if (var4 != 0L && var2 > var4) {
        }
        class1.field67 = class1.field67 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method3(111);
        if (arg0 <= 72) {
            this.stop();
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 188)
    public final synchronized void method197(int arg0) {
        Container var2;
        if (class29.field378 == null) {
            var2 = class32.field403.field139;
        } else {
            var2 = class29.field378;
        }
        if (class33.field411 != null) {
            class33.field411.removeFocusListener(this);
            var2.remove(class33.field411);
        }
        class33.field411 = new class15(this);
        var2.add(class33.field411);
        class33.field411.setSize(class1.field77, class23.field306);
        class33.field411.setVisible(true);
        if (class29.field378 == null) {
            class33.field411.setLocation(0, 0);
        } else {
            Insets var3 = class29.field378.getInsets();
            class33.field411.setLocation(var3.left, var3.top);
        }
        class33.field411.addFocusListener(this);
        class33.field411.requestFocus();
        class28.field369 = true;
        class24.field317 = false;
        class24.field314 = class20.method149((byte) 59);
        if (arg0 != 2641) {
            field393 = null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 226)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(B)V", line = 232)
    private final void method198(byte arg0) {
        long var2 = class20.method149((byte) -12);
        long var4 = class1.field72[class32.field405];
        class1.field72[class32.field405] = var2;
        class32.field405 = class32.field405 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
        }
        if (class33.field421++ > 50) {
            class28.field369 = true;
            class33.field421 -= 50;
            class33.field411.setSize(class1.field77, class23.field306);
            class33.field411.setVisible(true);
            if (class29.field378 == null) {
                class33.field411.setLocation(0, 0);
            } else {
                Insets var6 = class29.field378.getInsets();
                class33.field411.setLocation(var6.left, var6.top);
            }
        }
        this.method16(471);
        if (arg0 != -85) {
            this.getDocumentBase();
        }
    }

    @OriginalMember(owner = "mapview!q", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 273)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!q", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 276)
    public final void focusGained(FocusEvent arg0) {
        class28.field369 = true;
    }

    @OriginalMember(owner = "mapview!q", name = "providesignlink", descriptor = "(Ld;)V", line = 285)
    public static final void providesignlink(class7 arg0) {
        class32.field403 = arg0;
        class17.field258 = arg0;
    }

    @OriginalMember(owner = "mapview!q", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 292)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!q", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 302)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!q", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 308)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Z)Z", line = 316)
    public final boolean method199(boolean arg0) {
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
            if (var2.endsWith("192.168.1.")) {
                return true;
            }
            if (arg0) {
                method203(34);
            }
            this.method200("invalidhost", 50);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 344)
    public final void method200(String arg0, int arg1) {
        if (this.field395) {
            return;
        }
        this.field395 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
        if (arg1 != 50) {
            this.run();
        }
    }

    @OriginalMember(owner = "mapview!q", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 374)
    public final URL getCodeBase() {
        if (class29.field378 == null) {
            return class32.field403 == null || class32.field403.field139 == this ? super.getCodeBase() : class32.field403.field139.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 388)
    public final AppletContext getAppletContext() {
        if (class29.field378 == null) {
            return class32.field403 == null || class32.field403.field139 == this ? super.getAppletContext() : class32.field403.field139.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "(I)V", line = 413)
    public static void method201(int arg0) {
        field391 = null;
        field396 = null;
        field393 = null;
        field392 = null;
        field394 = null;
        if (arg0 != 0) {
            field394 = null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "(I)V", line = 427)
    private final synchronized void method202(int arg0) {
        if (class16.field256) {
            return;
        }
        class16.field256 = true;
        try {
            class33.field411.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method11(~arg0);
        } catch (Exception var8) {
        }
        if (class29.field378 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class32.field403 != null) {
            try {
                class32.field403.method73((byte) -61);
            } catch (Exception var6) {
            }
        }
        this.method20(-17393);
        if (arg0 != 0) {
            field394 = null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "(I)I", line = 482)
    public static final int method203(int arg0) {
        if (arg0 != 0) {
            field396 = null;
        }
        if (class1.field78 == null) {
            return 0;
        } else if (class1.field78.field366 == null) {
            return class11.field220[class1.field78.field362 & 0xFF];
        } else {
            return class11.field220[class1.field78.field366[class13.field234] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!q", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 502)
    public final URL getDocumentBase() {
        if (class29.field378 == null) {
            return class32.field403 == null || class32.field403.field139 == this ? super.getDocumentBase() : class32.field403.field139.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "stop", descriptor = "()V", line = 519)
    public final void stop() {
        if (class18.field277 == this && !class16.field256) {
            class4.field109 = class20.method149((byte) 12) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 528)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!q", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 532)
    public final String getParameter(String arg0) {
        if (class29.field378 == null) {
            return class32.field403 == null || class32.field403.field139 == this ? super.getParameter(arg0) : class32.field403.field139.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "destroy", descriptor = "()V", line = 554)
    public final void destroy() {
        if (class18.field277 == this && !class16.field256) {
            class4.field109 = class20.method149((byte) 108);
            class26.method177(25, 5000L);
            class17.field258 = null;
            this.method202(0);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 568)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(BJ)V", line = 583)
    public static final void method204(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 != 92) {
                method204((byte) -88, -10L);
            }
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(I)V")
    public abstract void method16(int arg0);

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "(I)V")
    public abstract void method3(int arg0);

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "(I)V")
    public abstract void method20(int arg0);

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "(I)V")
    public abstract void method11(int arg0);

    @OriginalMember(owner = "mapview!q", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "(I)V")
    public abstract void method19(int arg0);
}
