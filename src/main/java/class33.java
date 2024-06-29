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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public abstract class class33 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!r", name = "m", descriptor = "Z")
    private boolean field419 = false;

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "Lt;")
    public static class35 field410 = class3.method28(false, " map");

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "I")
    private static int field413 = 1;

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "Lt;")
    public static class35 field409 = class3.method28(false, "overlay2)3dat");

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "Z")
    public static boolean field412 = true;

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "Lt;")
    public static class35 field414 = class3.method28(false, "Platebody Shop");

    @OriginalMember(owner = "mapview!r", name = "l", descriptor = "Lt;")
    public static class35 field418 = class3.method28(false, "details)3dat");

    @OriginalMember(owner = "mapview!r", name = "n", descriptor = "Lt;")
    public static class35 field420 = class3.method28(false, "mapfunction");

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "I")
    public static volatile int field416 = 0;

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "mapview!r", name = "o", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "Lq;")
    public static class32 field415;

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "Ljava/awt/Frame;")
    private static Frame field411;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "[Lt;")
    public static class35[] field407;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 4)
    public final void method191(boolean arg0, String arg1) {
        if (this.field419) {
            return;
        }
        this.field419 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 23)
    private final synchronized void method192(int arg0) {
        if (class7.field120) {
            return;
        }
        class7.field120 = true;
        try {
            if (arg0 != 0) {
                return;
            }
            class27.field306.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method16(16098);
        } catch (Exception var8) {
        }
        if (field411 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class27.field310 != null) {
            try {
                class27.field310.method72(arg0 ^ 0x6C);
            } catch (Exception var6) {
            }
        }
        this.method20(635);
    }

    @OriginalMember(owner = "mapview!r", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 77)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!r", name = "destroy", descriptor = "()V", line = 84)
    public final void destroy() {
        if (class27.field311 == this && !class7.field120) {
            class15.field182 = class19.method119(62);
            class27.method152((byte) -126, 5000L);
            class19.field216 = null;
            this.method192(0);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)V", line = 101)
    private final void method193(int arg0) {
        long var2 = class19.method119(42);
        long var4 = class29.field321[class23.field265];
        if (var4 != 0L && var2 > var4) {
        }
        class29.field321[class23.field265] = var2;
        if (arg0 != 10313) {
            return;
        }
        class23.field265 = class23.field265 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method3(false);
    }

    @OriginalMember(owner = "mapview!r", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 130)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!r", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 134)
    public final synchronized void paint(Graphics arg0) {
        if (class27.field311 != this || class7.field120) {
            return;
        }
        class3.field76 = true;
        if (class10.field151 != null && class10.field151.startsWith("1.5") && class19.method119(19) - class29.field325 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class35.field431 && class2.field68 <= var2.height) {
                class7.field124 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 159)
    public final URL getDocumentBase() {
        if (field411 == null) {
            return class27.field310 == null || class27.field310.field145 == this ? super.getDocumentBase() : class27.field310.field145.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "run", descriptor = "()V", line = 175)
    public final void run() {
        try {
            if (class10.field139 != null) {
                String var1 = class10.field139.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class10.field151;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method191(true, "wrongjava");
                        return;
                    }
                    field413 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class10.field151 == null || class10.field151.equals("1.4.2"))) {
                    this.method191(true, "wrongjava");
                    return;
                }
            }
            if (class27.field310.field145 != null) {
                Method var3 = class10.field148;
                if (var3 != null) {
                    try {
                        var3.invoke(class27.field310.field145, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method199((byte) -13);
            class6.field107 = class27.method155(class27.field306, class2.field68, class35.field431, 4032);
            this.method12(114);
            class27.field313 = class34.method202((byte) -128);
            class27.field313.method124((byte) 104);
            while (class15.field182 == 0L || class19.method119(63) < class15.field182) {
                class7.field116 = class27.field313.method125(class21.field242, (byte) 1, field413);
                for (int var5 = 0; var5 < class7.field116; var5++) {
                    this.method193(10313);
                }
                this.method197((byte) 96);
            }
        } catch (Exception var8) {
            class17.method102(null, var8, -16715);
            this.method191(true, "crash");
        }
        this.method192(0);
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(I)Z", line = 255)
    public final boolean method194(int arg0) {
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
            if (arg0 != 596) {
                this.focusGained(null);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method191(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 284)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIILpa;)Z", line = 288)
    public static final boolean method195(int arg0, int arg1, int arg2, class31 arg3) {
        byte[] var4 = arg3.method175(arg1, arg0, -111);
        if (var4 == null) {
            return false;
        }
        if (arg2 > -77) {
            method196((byte) -58);
        }
        class17.method100((byte) -114, var4);
        return true;
    }

    @OriginalMember(owner = "mapview!r", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 303)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!r", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 309)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 316)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!r", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 320)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!r", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 337)
    public final String getParameter(String arg0) {
        if (field411 == null) {
            return class27.field310 == null || class27.field310.field145 == this ? super.getParameter(arg0) : class27.field310.field145.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B)V", line = 367)
    public static void method196(byte arg0) {
        field420 = null;
        field409 = null;
        field414 = null;
        field407 = null;
        field411 = null;
        field418 = null;
        if (arg0 >= -114) {
            field410 = null;
        }
        field410 = null;
        field415 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "stop", descriptor = "()V", line = 385)
    public final void stop() {
        if (class27.field311 == this && !class7.field120) {
            class15.field182 = class19.method119(9) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(B)V", line = 399)
    private final void method197(byte arg0) {
        if (arg0 != 96) {
            field412 = true;
        }
        long var2 = class16.field186[class2.field70];
        long var4 = class19.method119(67);
        if (var2 != 0L && var2 < var4) {
        }
        class16.field186[class2.field70] = var4;
        class2.field70 = class2.field70 + 1 & 0x1F;
        if (class16.field190++ > 50) {
            class16.field190 -= 50;
            class3.field76 = true;
            class27.field306.setSize(class35.field431, class2.field68);
            class27.field306.setVisible(true);
            if (field411 == null) {
                class27.field306.setLocation(0, 0);
            } else {
                Insets var6 = field411.getInsets();
                class27.field306.setLocation(var6.left, var6.top);
            }
        }
        this.method8(true);
    }

    @OriginalMember(owner = "mapview!r", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 442)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIIII)V", line = 451)
    public final void method198(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class27.field311 != null) {
                this.method191(true, "alreadyloaded");
                return;
            }
            class2.field68 = arg1;
            class7.field115 = arg4;
            class35.field431 = arg0;
            class27.field311 = this;
            if (arg2 != 0) {
                return;
            }
            if (class27.field310 == null) {
                class19.field216 = class27.field310 = new class10(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg3, null, 0);
            }
            class27.field310.method68(this, arg2 + 22781, 1);
        } catch (Exception var7) {
            class17.method102(null, var7, -16715);
            this.method191(true, "crash");
        }
    }

    @OriginalMember(owner = "mapview!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 490)
    public final void focusGained(FocusEvent arg0) {
        class3.field76 = true;
    }

    @OriginalMember(owner = "mapview!r", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 498)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!r", name = "start", descriptor = "()V", line = 501)
    public final void start() {
        if (class27.field311 == this && !class7.field120) {
            class15.field182 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(B)V", line = 519)
    public final synchronized void method199(byte arg0) {
        Container var2;
        if (field411 == null) {
            var2 = class27.field310.field145;
        } else {
            var2 = field411;
        }
        if (class27.field306 != null) {
            class27.field306.removeFocusListener(this);
            var2.remove(class27.field306);
        }
        if (arg0 > -7) {
            this.method8(false);
        }
        class27.field306 = new class11(this);
        var2.add(class27.field306);
        class27.field306.setSize(class35.field431, class2.field68);
        class27.field306.setVisible(true);
        if (field411 == null) {
            class27.field306.setLocation(0, 0);
        } else {
            Insets var3 = field411.getInsets();
            class27.field306.setLocation(var3.left, var3.top);
        }
        class27.field306.addFocusListener(this);
        class27.field306.requestFocus();
        class3.field76 = true;
        class7.field124 = false;
        class29.field325 = class19.method119(74);
    }

    @OriginalMember(owner = "mapview!r", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 565)
    public final AppletContext getAppletContext() {
        if (field411 == null) {
            return class27.field310 == null || class27.field310.field145 == this ? super.getAppletContext() : class27.field310.field145.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "providesignlink", descriptor = "(Lea;)V", line = 590)
    public static final void providesignlink(class10 arg0) {
        class27.field310 = arg0;
        class19.field216 = arg0;
    }

    @OriginalMember(owner = "mapview!r", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 598)
    public final URL getCodeBase() {
        if (field411 == null) {
            return class27.field310 == null || class27.field310.field145 == this ? super.getCodeBase() : class27.field310.field145.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "(I)V")
    public abstract void method16(int arg0);

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Z)V")
    public abstract void method3(boolean arg0);

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "(I)V")
    public abstract void method12(int arg0);

    @OriginalMember(owner = "mapview!r", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(Z)V")
    public abstract void method8(boolean arg0);

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "(I)V")
    public abstract void method20(int arg0);
}
