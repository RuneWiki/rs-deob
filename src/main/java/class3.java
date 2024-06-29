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

@OriginalClass("mapview!ab")
public abstract class class3 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ab", name = "e", descriptor = "Z")
    private boolean field56 = false;

    @OriginalMember(owner = "mapview!ab", name = "b", descriptor = "I")
    public static int field53 = 0;

    @OriginalMember(owner = "mapview!ab", name = "a", descriptor = "Lua;")
    public static class41 field52 = class16.method86("loc)3dat", true);

    @OriginalMember(owner = "mapview!ab", name = "f", descriptor = "Lua;")
    public static class41 field57 = class16.method86("Overview", true);

    @OriginalMember(owner = "mapview!ab", name = "g", descriptor = "Z")
    public static boolean field58 = true;

    @OriginalMember(owner = "mapview!ab", name = "d", descriptor = "I")
    public static int field55 = 0;

    @OriginalMember(owner = "mapview!ab", name = "c", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "mapview!ab", name = "h", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "mapview!ab", name = "a", descriptor = "(I)Lia;", line = 5)
    private static final class17 method20(int arg0) {
        try {
            if (arg0 != 7562) {
                field53 = -123;
            }
            return (class17) Class.forName("da").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class20();
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 18)
    public final URL getCodeBase() {
        if (class36.field454 == null) {
            return class43.field538 == null || class43.field538.field389 == this ? super.getCodeBase() : class43.field538.field389.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 34)
    public final void focusGained(FocusEvent arg0) {
        class36.field449 = true;
    }

    @OriginalMember(owner = "mapview!ab", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 41)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ab", name = "a", descriptor = "(B)V", line = 45)
    public static void method21(byte arg0) {
        if (arg0 >= -9) {
            providesignlink(null);
        }
        field52 = null;
        field57 = null;
    }

    @OriginalMember(owner = "mapview!ab", name = "stop", descriptor = "()V", line = 57)
    public final void stop() {
        if (class39.field489 == this && !class34.field429) {
            class19.field167 = class7.method45(-107) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 71)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ab", name = "a", descriptor = "(IIIIZ)V", line = 79)
    public final void method23(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            if (class39.field489 != null) {
                class19.field165++;
                if (class19.field165 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method28((byte) -61, "alreadyloaded");
                return;
            }
            if (!arg4) {
                providesignlink(null);
            }
            class34.field430 = arg2;
            field54 = arg3;
            class43.field531 = arg1;
            class39.field489 = this;
            if (class43.field538 == null) {
                class21.field221 = class43.field538 = new class30(false, this, arg0, null, 0);
            }
            class43.field538.method185((byte) 101, this, 1);
        } catch (Exception var7) {
            class26.method172(var7, null, -9068);
            this.method28((byte) -48, "crash");
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 131)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ab", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 141)
    public final AppletContext getAppletContext() {
        if (class36.field454 == null) {
            return class43.field538 == null || class43.field538.field389 == this ? super.getAppletContext() : class43.field538.field389.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "a", descriptor = "(ZB)V", line = 161)
    private final void method25(boolean arg0, byte arg1) {
        synchronized (this) {
            if (class34.field429) {
                return;
            }
            class34.field429 = true;
        }
        int var5 = -42 % ((-arg1 - 56) / 58);
        if (class43.field538.field389 != null) {
            class43.field538.field389.destroy();
        }
        if (class40.field497 != null) {
            try {
                class40.field497.removeFocusListener(this);
                Container var6;
                if (class36.field454 == null) {
                    var6 = class43.field538.field389;
                } else {
                    var6 = class36.field454;
                }
                var6.remove(class40.field497);
            } catch (Exception var14) {
            }
        }
        try {
            this.method27(true);
        } catch (Exception var13) {
        }
        if (class43.field538 != null) {
            try {
                class43.field538.method183(2);
            } catch (Exception var12) {
            }
        }
        this.method22(28665);
        if (class36.field454 != null) {
            try {
                System.exit(0);
            } catch (Throwable var11) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "mapview!ab", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 224)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ab", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 227)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ab", name = "c", descriptor = "(B)Z", line = 231)
    public final boolean method26(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 != 119) {
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
                this.method28((byte) -104, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "a", descriptor = "(BLjava/lang/String;)V", line = 268)
    public final void method28(byte arg0, String arg1) {
        if (this.field56) {
            return;
        }
        this.field56 = true;
        System.out.println("error_game_" + arg1);
        try {
            if (arg0 > -35) {
                return;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "providesignlink", descriptor = "(Lp;)V", line = 289)
    public static final void providesignlink(class30 arg0) {
        class43.field538 = arg0;
        class21.field221 = arg0;
    }

    @OriginalMember(owner = "mapview!ab", name = "b", descriptor = "(Z)V", line = 298)
    private final void method29(boolean arg0) {
        long var2 = class7.method45(-84);
        long var4 = class4.field63[class26.field362];
        if (var4 != 0L && var2 <= var4) {
        }
        if (arg0) {
            field52 = null;
        }
        class4.field63[class26.field362] = var2;
        class26.field362 = class26.field362 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method30(14559);
    }

    @OriginalMember(owner = "mapview!ab", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 326)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ab", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 333)
    public final URL getDocumentBase() {
        if (class36.field454 == null) {
            return class43.field538 == null || class43.field538.field389 == this ? super.getDocumentBase() : class43.field538.field389.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 348)
    public final synchronized void paint(Graphics arg0) {
        if (class39.field489 != this || class34.field429) {
            return;
        }
        class36.field449 = true;
        if (class30.field395 != null && class30.field395.startsWith("1.5") && class7.method45(-40) - class23.field234 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class34.field430 <= var2.width && var2.height >= field54) {
                class43.field537 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "destroy", descriptor = "()V", line = 374)
    public final void destroy() {
        if (class39.field489 == this && !class34.field429) {
            class19.field167 = class7.method45(89);
            class42.method249(-127, 5000L);
            class21.field221 = null;
            this.method25(false, (byte) -127);
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "run", descriptor = "()V", line = 390)
    public final void run() {
        try {
            if (class30.field391 != null) {
                String var1 = class30.field391.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class30.field395;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method28((byte) -40, "wrongjava");
                        return;
                    }
                    class37.field462 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class30.field395 == null || class30.field395.equals("1.4.2"))) {
                    this.method28((byte) -53, "wrongjava");
                    return;
                }
            }
            if (class43.field538.field389 != null) {
                Method var3 = class30.field403;
                if (var3 != null) {
                    try {
                        var3.invoke(class43.field538.field389, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method31(108);
            class23.field243 = class8.method47(class34.field430, field54, class40.field497, 47);
            this.method33(50);
            class26.field365 = method20(7562);
            while (class19.field167 == 0L || class19.field167 > class7.method45(114)) {
                class26.field370 = class26.field365.method89(true, class37.field462, class16.field137);
                for (int var5 = 0; var5 < class26.field370; var5++) {
                    this.method29(false);
                }
                this.method32(119);
                class29.method180(class40.field497, 113, class43.field538);
            }
        } catch (Exception var8) {
            class26.method172(var8, null, -9068);
            this.method28((byte) -49, "crash");
        }
        this.method25(true, (byte) -114);
    }

    @OriginalMember(owner = "mapview!ab", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 468)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ab", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 479)
    public final String getParameter(String arg0) {
        if (class36.field454 == null) {
            return class43.field538 == null || class43.field538.field389 == this ? super.getParameter(arg0) : class43.field538.field389.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "d", descriptor = "(I)V", line = 497)
    public final synchronized void method31(int arg0) {
        Container var2;
        if (class36.field454 == null) {
            var2 = class43.field538.field389;
        } else {
            var2 = class36.field454;
        }
        if (class40.field497 != null) {
            class40.field497.removeFocusListener(this);
            var2.remove(class40.field497);
        }
        class40.field497 = new class23(this);
        var2.add(class40.field497);
        class40.field497.setSize(class34.field430, field54);
        class40.field497.setVisible(true);
        if (class36.field454 == null) {
            class40.field497.setLocation(0, 0);
        } else {
            Insets var3 = class36.field454.getInsets();
            class40.field497.setLocation(var3.left, var3.top);
        }
        int var4 = -55 / ((36 - arg0) / 45);
        class40.field497.addFocusListener(this);
        class40.field497.requestFocus();
        class36.field449 = true;
        class43.field537 = false;
        class23.field234 = class7.method45(-63);
    }

    @OriginalMember(owner = "mapview!ab", name = "start", descriptor = "()V", line = 536)
    public final void start() {
        if (class39.field489 == this && !class34.field429) {
            class19.field167 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ab", name = "e", descriptor = "(I)V", line = 546)
    private final void method32(int arg0) {
        if (arg0 < 111) {
            this.method29(true);
        }
        long var2 = class7.method45(-87);
        long var4 = class28.field375[class29.field383];
        class28.field375[class29.field383] = var2;
        class29.field383 = class29.field383 + 1 & 0x1F;
        if (var4 != 0L && var4 >= var2) {
        }
        if (class21.field217++ > 50) {
            class36.field449 = true;
            class21.field217 -= 50;
            class40.field497.setSize(class34.field430, field54);
            class40.field497.setVisible(true);
            if (class36.field454 == null) {
                class40.field497.setLocation(0, 0);
            } else {
                Insets var6 = class36.field454.getInsets();
                class40.field497.setLocation(var6.left, var6.top);
            }
        }
        this.method24((byte) -126);
    }

    @OriginalMember(owner = "mapview!ab", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 594)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ab", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 598)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ab", name = "b", descriptor = "(I)V")
    public abstract void method22(int arg0);

    @OriginalMember(owner = "mapview!ab", name = "b", descriptor = "(B)V")
    public abstract void method24(byte arg0);

    @OriginalMember(owner = "mapview!ab", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!ab", name = "a", descriptor = "(Z)V")
    public abstract void method27(boolean arg0);

    @OriginalMember(owner = "mapview!ab", name = "c", descriptor = "(I)V")
    public abstract void method30(int arg0);

    @OriginalMember(owner = "mapview!ab", name = "f", descriptor = "(I)V")
    public abstract void method33(int arg0);
}
