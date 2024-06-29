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

@OriginalClass("mapview!m")
public abstract class class25 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Z")
    private boolean field241 = false;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "I")
    public static volatile int field238 = 0;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Lu;")
    public static class38 field239 = class28.method177("details)3dat", (byte) -84);

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Lu;")
    public static class38 field242 = class28.method177("mapfunction", (byte) -84);

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Lu;")
    public static class38 field240 = class28.method177("Helmet Shop", (byte) -84);

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "Lu;")
    public static class38 field243 = class28.method177("", (byte) -84);

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "Z")
    public static boolean field245;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "[I")
    public static int[] field244;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Z)V", line = 5)
    public static void method136(boolean arg0) {
        field243 = null;
        if (!arg0) {
            field240 = null;
        }
        field244 = null;
        field239 = null;
        field242 = null;
        field240 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IIIII)V", line = 20)
    public final void method137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class38.field482 != null) {
                class27.field346++;
                if (class27.field346 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method144((byte) 29, "alreadyloaded");
                return;
            }
            class28.field356 = arg0;
            class38.field482 = this;
            class4.field46 = arg4;
            class3.field34 = arg2;
            if (class29.field370 == null) {
                class38.field478 = class29.field370 = new class39(false, this, arg1, null, 0);
            }
            if (arg3 != -3469) {
                return;
            }
            class29.field370.method245(this, 2, 1);
        } catch (Exception var7) {
            class26.method155((byte) -107, null, var7);
            this.method144((byte) 29, "crash");
        }
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I)V", line = 60)
    public final synchronized void method138(int arg0) {
        Container var2;
        if (class24.field230 == null) {
            var2 = class29.field370.field514;
        } else {
            var2 = class24.field230;
        }
        if (class3.field36 != null) {
            class3.field36.removeFocusListener(this);
            var2.remove(class3.field36);
        }
        class3.field36 = new class26(this);
        var2.add(class3.field36);
        class3.field36.setSize(class3.field34, class4.field46);
        class3.field36.setVisible(true);
        if (class24.field230 == null) {
            class3.field36.setLocation(0, 0);
        } else {
            Insets var3 = class24.field230.getInsets();
            class3.field36.setLocation(var3.left, var3.top);
        }
        class3.field36.addFocusListener(this);
        class3.field36.requestFocus();
        if (arg0 != 0) {
            field240 = null;
        }
        class9.field89 = true;
        class18.field178 = false;
        class11.field101 = class18.method106(~arg0);
    }

    @OriginalMember(owner = "mapview!m", name = "stop", descriptor = "()V", line = 98)
    public final void stop() {
        if (class38.field482 == this && !class18.field182) {
            class27.field348 = class18.method106(-1) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BLjava/lang/Object;Z)[B", line = 114)
    public static final byte[] method139(byte arg0, Object arg1, boolean arg2) {
        int var3 = -81 / ((-arg0 - 62) / 44);
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return arg2 ? class32.method195(0, var4) : var4;
        } else if (arg1 instanceof class33) {
            class33 var5 = (class33) arg1;
            return var5.method198(13172);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!m", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 146)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!m", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 149)
    public final synchronized void paint(Graphics arg0) {
        if (class38.field482 != this || class18.field182) {
            return;
        }
        class9.field89 = true;
        if (class39.field501 != null && class39.field501.startsWith("1.5") && class18.method106(-1) - class11.field101 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class3.field34 <= var2.width && var2.height >= class4.field46) {
                class18.field178 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)[Lca;", line = 178)
    public static final class6[] method140(byte arg0) {
        class6[] var1 = new class6[class38.field479];
        if (arg0 != -6) {
            field238 = -55;
        }
        for (int var2 = 0; var2 < class38.field479; var2++) {
            class6 var3 = var1[var2] = new class6();
            var3.field57 = class8.field81;
            var3.field54 = class4.field49;
            var3.field58 = class17.field171[var2];
            var3.field55 = class18.field175[var2];
            var3.field52 = mapview.field339[var2];
            var3.field51 = class38.field485[var2];
            var3.field56 = class7.field62;
            var3.field53 = class16.field159[var2];
        }
        class24.method133((byte) -76);
        return var1;
    }

    @OriginalMember(owner = "mapview!m", name = "destroy", descriptor = "()V", line = 212)
    public final void destroy() {
        if (class38.field482 == this && !class18.field182) {
            class27.field348 = class18.method106(-1);
            class11.method53(0, 5000L);
            class38.field478 = null;
            this.method145(4000);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 227)
    public final String getParameter(String arg0) {
        if (class24.field230 == null) {
            return class29.field370 == null || class29.field370.field514 == this ? super.getParameter(arg0) : class29.field370.field514.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 243)
    public final URL getDocumentBase() {
        if (class24.field230 == null) {
            return class29.field370 == null || class29.field370.field514 == this ? super.getDocumentBase() : class29.field370.field514.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 263)
    public final AppletContext getAppletContext() {
        if (class24.field230 == null) {
            return class29.field370 == null || class29.field370.field514 == this ? super.getAppletContext() : class29.field370.field514.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 282)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!m", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 285)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!m", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 289)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!m", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 305)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "(I)V", line = 310)
    private final void method143(int arg0) {
        long var2 = class18.method106(-1);
        long var4 = class18.field187[class22.field216];
        class18.field187[class22.field216] = var2;
        if (var4 != 0L && var2 <= var4) {
        }
        class22.field216 = class22.field216 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 != 32304) {
                field240 = null;
            }
        }
        this.method149((byte) 38);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BLjava/lang/String;)V", line = 346)
    public final void method144(byte arg0, String arg1) {
        if (this.field241) {
            return;
        }
        this.field241 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 == 29) {
            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "(I)V", line = 367)
    private final synchronized void method145(int arg0) {
        if (class18.field182) {
            return;
        }
        class18.field182 = true;
        try {
            class3.field36.removeFocusListener(this);
        } catch (Exception var9) {
        }
        if (arg0 != 4000) {
            return;
        }
        try {
            this.method142(arg0 ^ 0xFEA);
        } catch (Exception var8) {
        }
        if (class24.field230 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class29.field370 != null) {
            try {
                class29.field370.method252((byte) -127);
            } catch (Exception var6) {
            }
        }
        this.method141((byte) -124);
    }

    @OriginalMember(owner = "mapview!m", name = "providesignlink", descriptor = "(Lua;)V", line = 414)
    public static final void providesignlink(class39 arg0) {
        class29.field370 = arg0;
        class38.field478 = arg0;
    }

    @OriginalMember(owner = "mapview!m", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 424)
    public final URL getCodeBase() {
        if (class24.field230 == null) {
            return class29.field370 == null || class29.field370.field514 == this ? super.getCodeBase() : class29.field370.field514.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 438)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!m", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 441)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "(B)V", line = 447)
    private final void method146(byte arg0) {
        long var2 = class19.field190[class17.field163];
        long var4 = class18.method106(-1);
        if (var2 != 0L && var4 <= var2) {
        }
        class19.field190[class17.field163] = var4;
        class17.field163 = class17.field163 + 1 & 0x1F;
        if (arg0 >= -20) {
            this.getDocumentBase();
        }
        if (class18.field181++ > 50) {
            class9.field89 = true;
            class18.field181 -= 50;
            class3.field36.setSize(class3.field34, class4.field46);
            class3.field36.setVisible(true);
            if (class24.field230 == null) {
                class3.field36.setLocation(0, 0);
            } else {
                Insets var6 = class24.field230.getInsets();
                class3.field36.setLocation(var6.left, var6.top);
            }
        }
        this.method135(18);
    }

    @OriginalMember(owner = "mapview!m", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 491)
    public final void focusGained(FocusEvent arg0) {
        class9.field89 = true;
    }

    @OriginalMember(owner = "mapview!m", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 505)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!m", name = "start", descriptor = "()V", line = 508)
    public final void start() {
        if (class38.field482 == this && !class18.field182) {
            class27.field348 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "run", descriptor = "()V", line = 519)
    public final void run() {
        try {
            if (class39.field499 != null) {
                String var1 = class39.field499.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class39.field501;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method144((byte) 29, "wrongjava");
                        return;
                    }
                    class23.field220 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class39.field501 == null || class39.field501.equals("1.4.2"))) {
                    this.method144((byte) 29, "wrongjava");
                    return;
                }
            }
            if (class29.field370.field514 != null) {
                Method var3 = class39.field506;
                if (var3 != null) {
                    try {
                        var3.invoke(class29.field370.field514, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method138(0);
            class16.field152 = class38.method240(class3.field34, class4.field46, class3.field36, (byte) -16);
            this.method147(9088);
            class18.field183 = class33.method196(25765);
            while (class27.field348 == 0L || class27.field348 > class18.method106(-1)) {
                class30.field374 = class18.field183.method2(class23.field220, -11235, class20.field206);
                for (int var5 = 0; var5 < class30.field374; var5++) {
                    this.method143(32304);
                }
                this.method146((byte) -70);
                class26.method154(class3.field36, false, class29.field370);
            }
        } catch (Exception var8) {
            class26.method155((byte) -17, null, var8);
            this.method144((byte) 29, "crash");
        }
        this.method145(4000);
    }

    @OriginalMember(owner = "mapview!m", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 602)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "(I)Z", line = 613)
    public final boolean method148(int arg0) {
        if (arg0 < 24) {
            this.start();
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
                this.method144((byte) 29, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V")
    public abstract void method135(int arg0);

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(B)V")
    public abstract void method141(byte arg0);

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "(I)V")
    public abstract void method142(int arg0);

    @OriginalMember(owner = "mapview!m", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "(B)V")
    public abstract void method149(byte arg0);
}
