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

@OriginalClass("mapview!ga")
public abstract class class14 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "Z")
    private boolean field151 = false;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "Ll;")
    public static class22 field146 = class33.method229("Farming shop", -76);

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "I")
    private static int field148 = 0;

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "Ll;")
    public static class22 field150 = class33.method229("Magic Shop", -77);

    @OriginalMember(owner = "mapview!ga", name = "g", descriptor = "Z")
    public static boolean field152 = false;

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "Ll;")
    public static class22 field149 = class33.method229("Key", -60);

    @OriginalMember(owner = "mapview!ga", name = "h", descriptor = "Li;")
    private static class17 field153;

    @OriginalMember(owner = "mapview!ga", name = "i", descriptor = "Z")
    public static boolean field154;

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "[I")
    public static int[] field147;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IIBII)V", line = 7)
    public final void method69(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            if (class19.field180 != null) {
                field148++;
                if (field148 >= 3) {
                    this.method79("alreadyloaded", 123);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase());
                return;
            }
            int var6 = -93 % ((-arg2 - 76) / 36);
            class10.field88 = arg0;
            class19.field180 = this;
            class38.field507 = arg4;
            mapview.field264 = arg3;
            if (class12.field129 == null) {
                class38.field504 = class12.field129 = new class26(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg1, null, 0);
            }
            class12.field129.method195(1, 84, this);
        } catch (Exception var8) {
            class2.method8(var8, null, 122);
            this.method79("crash", 124);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I)V", line = 46)
    public static void method70(int arg0) {
        field146 = null;
        if (arg0 <= 17) {
            providesignlink(null);
        }
        field149 = null;
        field153 = null;
        field147 = null;
        field150 = null;
    }

    @OriginalMember(owner = "mapview!ga", name = "destroy", descriptor = "()V", line = 61)
    public final void destroy() {
        if (class19.field180 == this && !class3.field19) {
            class10.field80 = class28.method202((byte) 125);
            class5.method26((byte) 29, 5000L);
            class38.field504 = null;
            this.method81((byte) -63);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 80)
    public final String getParameter(String arg0) {
        if (class12.field125 == null) {
            return class12.field129 == null || class12.field129.field355 == this ? super.getParameter(arg0) : class12.field129.field355.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 96)
    public final void focusGained(FocusEvent arg0) {
        class37.field495 = true;
    }

    @OriginalMember(owner = "mapview!ga", name = "start", descriptor = "()V", line = 104)
    public final void start() {
        if (class19.field180 == this && !class3.field19) {
            class10.field80 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(I)Z", line = 118)
    public final boolean method72(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 9619) {
                field153 = null;
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
                this.method79("invalidhost", arg0 - 9497);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 150)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 157)
    public final synchronized void paint(Graphics arg0) {
        if (class19.field180 != this || class3.field19) {
            return;
        }
        class37.field495 = true;
        if (class26.field347 != null && class26.field347.startsWith("1.5") && class28.method202((byte) 74) - class3.field27 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class38.field507 <= var2.width && var2.height >= mapview.field264) {
                class23.field230 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 186)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "(B)V", line = 191)
    public final synchronized void method75(byte arg0) {
        Container var2;
        if (class12.field125 == null) {
            var2 = class12.field129.field355;
        } else {
            var2 = class12.field125;
        }
        if (class17.field168 != null) {
            class17.field168.removeFocusListener(this);
            var2.remove(class17.field168);
        }
        class17.field168 = new class33(this);
        if (arg0 != -72) {
            this.getDocumentBase();
        }
        var2.add(class17.field168);
        class17.field168.setSize(class38.field507, mapview.field264);
        class17.field168.setVisible(true);
        if (class12.field125 == null) {
            class17.field168.setLocation(0, 0);
        } else {
            Insets var3 = class12.field125.getInsets();
            class17.field168.setLocation(var3.left, var3.top);
        }
        class17.field168.addFocusListener(this);
        class17.field168.requestFocus();
        class37.field495 = true;
        class23.field230 = false;
        class3.field27 = class28.method202((byte) 33);
    }

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "(B)V", line = 230)
    private final void method76(byte arg0) {
        long var2 = class28.method202((byte) -101);
        long var4 = class16.field163[class17.field165];
        if (var4 != 0L && var2 > var4) {
        }
        class16.field163[class17.field165] = var2;
        class17.field165 = class17.field165 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 != -106) {
                this.focusLost(null);
            }
        }
        this.method73(246);
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(ZJ)V", line = 261)
    public static final void method77(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        if (arg0) {
            providesignlink(null);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 279)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 282)
    public final URL getCodeBase() {
        if (class12.field125 == null) {
            return class12.field129 == null || class12.field129.field355 == this ? super.getCodeBase() : class12.field129.field355.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 295)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 306)
    public final void method79(String arg0, int arg1) {
        if (this.field151) {
            return;
        }
        this.field151 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 < 121) {
                field147 = null;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 327)
    public final AppletContext getAppletContext() {
        if (class12.field125 == null) {
            return class12.field129 == null || class12.field129.field355 == this ? super.getAppletContext() : class12.field129.field355.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(BIIII)V", line = 351)
    public static final void method80(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -29257) {
            field152 = false;
        }
        int var5 = arg2 >> 6;
        int var6 = arg4 >> 6;
        if (class34.field460[arg1][var5][var6] == null) {
            class34.field460[arg1][var5][var6] = new byte[4096];
        }
        class34.field460[arg1][var5][var6][class19.method119(4032, arg2 << 6) + class19.method119(63, arg4)] = arg0;
    }

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "(B)V", line = 369)
    private final synchronized void method81(byte arg0) {
        if (class3.field19) {
            return;
        }
        if (arg0 > -30) {
            field153 = null;
        }
        class3.field19 = true;
        try {
            class17.field168.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method71((byte) -116);
        } catch (Exception var8) {
        }
        if (class12.field125 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class12.field129 != null) {
            try {
                class12.field129.method193(0);
            } catch (Exception var6) {
            }
        }
        this.method68((byte) 127);
    }

    @OriginalMember(owner = "mapview!ga", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 418)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "stop", descriptor = "()V", line = 422)
    public final void stop() {
        if (class19.field180 == this && !class3.field19) {
            class10.field80 = class28.method202((byte) -76) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 432)
    public final URL getDocumentBase() {
        if (class12.field125 == null) {
            return class12.field129 == null || class12.field129.field355 == this ? super.getDocumentBase() : class12.field129.field355.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "(I)V", line = 449)
    private final void method82(int arg0) {
        long var2 = class28.method202((byte) 55);
        long var4 = class1.field5[class25.field248];
        if (var4 != 0L && var2 <= var4) {
        }
        class1.field5[class25.field248] = var2;
        class25.field248 = class25.field248 + 1 & 0x1F;
        if (class5.field47++ > 50) {
            class37.field495 = true;
            class5.field47 -= 50;
            class17.field168.setSize(class38.field507, mapview.field264);
            class17.field168.setVisible(true);
            if (class12.field125 == null) {
                class17.field168.setLocation(0, 0);
            } else {
                Insets var6 = class12.field125.getInsets();
                class17.field168.setLocation(var6.left, var6.top);
            }
        }
        if (arg0 != 28596) {
            field146 = null;
        }
        this.method74((byte) -26);
    }

    @OriginalMember(owner = "mapview!ga", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 495)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ga", name = "providesignlink", descriptor = "(Ln;)V", line = 504)
    public static final void providesignlink(class26 arg0) {
        class12.field129 = arg0;
        class38.field504 = arg0;
    }

    @OriginalMember(owner = "mapview!ga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 519)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 527)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "run", descriptor = "()V", line = 531)
    public final void run() {
        try {
            if (class26.field351 != null) {
                String var1 = class26.field351.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class26.field347;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method79("wrongjava", 124);
                        return;
                    }
                    class34.field459 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class26.field347 == null || class26.field347.equals("1.4.2"))) {
                    this.method79("wrongjava", 127);
                    return;
                }
            }
            if (class12.field129.field355 != null) {
                Method var3 = class26.field343;
                if (var3 != null) {
                    try {
                        var3.invoke(class12.field129.field355, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method75((byte) -72);
            class16.field160 = class19.method116(mapview.field264, class17.field168, class38.field507, 0);
            this.method78(124);
            field153 = class23.method158((byte) 62);
            field153.method97((byte) -127);
            while (class10.field80 == 0L || class10.field80 > class28.method202((byte) -101)) {
                class22.field218 = field153.method96(13306, class38.field502, class34.field459);
                for (int var5 = 0; var5 < class22.field218; var5++) {
                    this.method76((byte) -106);
                }
                this.method82(28596);
            }
        } catch (Exception var8) {
            class2.method8(var8, null, 12);
            this.method79("crash", 125);
        }
        this.method81((byte) -42);
    }

    @OriginalMember(owner = "mapview!ga", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 607)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(B)V")
    public abstract void method68(byte arg0);

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(B)V")
    public abstract void method71(byte arg0);

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "(I)V")
    public abstract void method73(int arg0);

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "(B)V")
    public abstract void method74(byte arg0);

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "(I)V")
    public abstract void method78(int arg0);

    @OriginalMember(owner = "mapview!ga", name = "init", descriptor = "()V")
    public abstract void init();
}
