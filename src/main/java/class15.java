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

@OriginalClass("mapview!h")
public abstract class class15 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "Z")
    private boolean field195 = false;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Lba;")
    public static class4 field192 = class14.method105((byte) -89, "b12_full");

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "Z")
    public static boolean field196 = false;

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "Lba;")
    public static class4 field200 = class14.method105((byte) -117, "Vegetable Store");

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "[[B")
    public static byte[][] field199 = new byte[1000][];

    @OriginalMember(owner = "mapview!h", name = "k", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "J")
    public static long field194;

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "Lq;")
    public static class32 field197;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Z")
    public static boolean field193;

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "[B")
    public static byte[] field198;

    @OriginalMember(owner = "mapview!h", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 3)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 8)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "run", descriptor = "()V", line = 17)
    public final void run() {
        try {
            if (class8.field146 != null) {
                String var1 = class8.field146.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class8.field131;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method114("wrongjava", (byte) -42);
                        return;
                    }
                    class29.field359 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class8.field131 == null || class8.field131.equals("1.4.2"))) {
                    this.method114("wrongjava", (byte) -42);
                    return;
                }
            }
            if (class30.field381.field130 != null) {
                Method var3 = class8.field141;
                if (var3 != null) {
                    try {
                        var3.invoke(class30.field381.field130, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method111(-105);
            class22.field267 = class12.method97(class27.field317, -106, class34.field433, mapview.field26);
            this.method14((byte) -125);
            class20.field232 = class31.method191((byte) 97);
            class20.field232.method166(0);
            while (class17.field216 == 0L || class17.field216 > class35.method226(-41)) {
                class20.field235 = class20.field232.method168(class29.field359, (byte) 127, class31.field390);
                for (int var5 = 0; var5 < class20.field235; var5++) {
                    this.method113((byte) 118);
                }
                this.method110(false);
            }
        } catch (Exception var8) {
            class27.method175(var8, (byte) 100, null);
            this.method114("crash", (byte) -42);
        }
        this.method112((byte) 32);
    }

    @OriginalMember(owner = "mapview!h", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 95)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "stop", descriptor = "()V", line = 103)
    public final void stop() {
        if (class12.field166 == this && !class20.field227) {
            class17.field216 = class35.method226(-112) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "start", descriptor = "()V", line = 113)
    public final void start() {
        if (class12.field166 == this && !class20.field227) {
            class17.field216 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "destroy", descriptor = "()V", line = 124)
    public final void destroy() {
        if (class12.field166 == this && !class20.field227) {
            class17.field216 = class35.method226(-52);
            class35.method225(5000L, 91);
            class9.field148 = null;
            this.method112((byte) 32);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)Z", line = 139)
    public final boolean method108(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
            return true;
        } else if (arg0 < 108) {
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
                this.method114("invalidhost", (byte) -42);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)I", line = 183)
    public static final int method109(boolean arg0) {
        if (arg0) {
            providesignlink(null);
        }
        if (class9.field155 == null) {
            return 0;
        } else if (class9.field155.field362 == null) {
            return class27.field311[class9.field155.field367 & 0xFF];
        } else {
            return class27.field311[class9.field155.field362[class12.field172] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!h", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 201)
    public final String getParameter(String arg0) {
        if (class4.field88 == null) {
            return class30.field381 == null || class30.field381.field130 == this ? super.getParameter(arg0) : class30.field381.field130.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(Z)V", line = 218)
    private final void method110(boolean arg0) {
        long var2 = class35.method226(-51);
        long var4 = class36.field448[class31.field398];
        if (var4 != 0L && var4 >= var2) {
        }
        class36.field448[class31.field398] = var2;
        class31.field398 = class31.field398 + 1 & 0x1F;
        if (arg0) {
            return;
        }
        if (class5.field108++ > 50) {
            class5.field108 -= 50;
            class29.field365 = true;
            class27.field317.setSize(mapview.field26, class34.field433);
            class27.field317.setVisible(true);
            if (class4.field88 == null) {
                class27.field317.setLocation(0, 0);
            } else {
                Insets var6 = class4.field88.getInsets();
                class27.field317.setLocation(var6.left, var6.top);
            }
        }
        this.method11(115);
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)V", line = 265)
    public final synchronized void method111(int arg0) {
        Container var2;
        if (class4.field88 == null) {
            var2 = class30.field381.field130;
        } else {
            var2 = class4.field88;
        }
        if (class27.field317 != null) {
            class27.field317.removeFocusListener(this);
            var2.remove(class27.field317);
        }
        class27.field317 = new class26(this);
        var2.add(class27.field317);
        int var3 = 32 / ((67 - arg0) / 44);
        class27.field317.setSize(mapview.field26, class34.field433);
        class27.field317.setVisible(true);
        if (class4.field88 == null) {
            class27.field317.setLocation(0, 0);
        } else {
            Insets var4 = class4.field88.getInsets();
            class27.field317.setLocation(var4.left, var4.top);
        }
        class27.field317.addFocusListener(this);
        class27.field317.requestFocus();
        class29.field365 = true;
        mapview.field3 = false;
        class9.field154 = class35.method226(-117);
    }

    @OriginalMember(owner = "mapview!h", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 304)
    public final synchronized void paint(Graphics arg0) {
        if (class12.field166 != this || class20.field227) {
            return;
        }
        class29.field365 = true;
        if (class8.field131 != null && class8.field131.startsWith("1.5") && class35.method226(-52) - class9.field154 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= mapview.field26 && class34.field433 <= var2.height) {
                mapview.field3 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 333)
    public final URL getDocumentBase() {
        if (class4.field88 == null) {
            return class30.field381 == null || class30.field381.field130 == this ? super.getDocumentBase() : class30.field381.field130.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 346)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 354)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "(B)V", line = 359)
    private final synchronized void method112(byte arg0) {
        if (class20.field227) {
            return;
        }
        if (arg0 != 32) {
            this.method112((byte) -2);
        }
        class20.field227 = true;
        try {
            class27.field317.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method13((byte) 13);
        } catch (Exception var8) {
        }
        if (class4.field88 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class30.field381 != null) {
            try {
                class30.field381.method81(-722);
            } catch (Exception var6) {
            }
        }
        this.method15((byte) -100);
    }

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "(B)V", line = 408)
    private final void method113(byte arg0) {
        if (arg0 < 76) {
            return;
        }
        long var2 = class35.method226(-87);
        long var4 = class16.field208[class12.field173];
        class16.field208[class12.field173] = var2;
        class12.field173 = class12.field173 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
        }
        synchronized (this) {
            ;
        }
        this.method20(92);
    }

    @OriginalMember(owner = "mapview!h", name = "providesignlink", descriptor = "(Lda;)V", line = 438)
    public static final void providesignlink(class8 arg0) {
        class30.field381 = arg0;
        class9.field148 = arg0;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 447)
    public final void method114(String arg0, byte arg1) {
        if (this.field195) {
            return;
        }
        this.field195 = true;
        if (arg1 != -42) {
            this.method13((byte) 57);
        }
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!h", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 466)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(IIIBI)V", line = 473)
    public final void method115(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            if (class12.field166 != null) {
                this.method114("alreadyloaded", (byte) -42);
                return;
            }
            mapview.field26 = arg2;
            class34.field433 = arg0;
            class12.field166 = this;
            class26.field305 = arg4;
            if (arg3 != 121) {
                field194 = -74L;
            }
            if (class30.field381 == null) {
                class9.field148 = class30.field381 = new class8(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg1, null, 0);
            }
            class30.field381.method83(1, this, 2);
        } catch (Exception var7) {
            class27.method175(var7, (byte) 100, null);
            this.method114("crash", (byte) -42);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 502)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 509)
    public final void focusGained(FocusEvent arg0) {
        class29.field365 = true;
    }

    @OriginalMember(owner = "mapview!h", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 516)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "(I)B", line = 524)
    public static final byte method116(int arg0) {
        if (arg0 == 7393) {
            return class31.field400 == null ? 0 : class31.field400[class12.field172];
        } else {
            return -65;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 539)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!h", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 546)
    public final AppletContext getAppletContext() {
        if (class4.field88 == null) {
            return class30.field381 == null || class30.field381.field130 == this ? super.getAppletContext() : class30.field381.field130.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "(B)V", line = 571)
    public static void method117(byte arg0) {
        field199 = null;
        if (arg0 >= -93) {
            field198 = null;
        }
        field200 = null;
        field198 = null;
        field192 = null;
        field197 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 595)
    public final URL getCodeBase() {
        if (class4.field88 == null) {
            return class30.field381 == null || class30.field381.field130 == this ? super.getCodeBase() : class30.field381.field130.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)V")
    public abstract void method20(int arg0);

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(B)V")
    public abstract void method14(byte arg0);

    @OriginalMember(owner = "mapview!h", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(B)V")
    public abstract void method15(byte arg0);

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(I)V")
    public abstract void method11(int arg0);

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "(B)V")
    public abstract void method13(byte arg0);
}
