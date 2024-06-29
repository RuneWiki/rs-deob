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

@OriginalClass("mapview!a")
public abstract class class1 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Z")
    private boolean field7 = false;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "Ld;")
    public static class7 field1 = class37.method242("sprites", 1333943984);

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "I")
    public static int field2 = 0;

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "Ld;")
    public static class7 field3 = class37.method242("Agility Training", 1333943984);

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "[I")
    public static int[] field6 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "Ld;")
    public static class7 field5 = class37.method242("Brewery", 1333943984);

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Z)V", line = 15)
    public final synchronized void method2(boolean arg0) {
        Container var2;
        if (class14.field136 == null) {
            var2 = class25.field247.field66;
        } else {
            var2 = class14.field136;
        }
        if (class20.field190 != null) {
            class20.field190.removeFocusListener(this);
            var2.remove(class20.field190);
        }
        class20.field190 = new class36(this);
        var2.add(class20.field190);
        class20.field190.setSize(class15.field157, class29.field427);
        class20.field190.setVisible(arg0);
        if (class14.field136 == null) {
            class20.field190.setLocation(0, 0);
        } else {
            Insets var3 = class14.field136.getInsets();
            class20.field190.setLocation(var3.left, var3.top);
        }
        class20.field190.addFocusListener(this);
        class20.field190.requestFocus();
        class28.field397 = true;
        class28.field417 = false;
        class32.field462 = class24.method157((byte) -117);
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(Z)V", line = 58)
    private final void method4(boolean arg0) {
        long var2 = class24.method157((byte) -117);
        long var4 = class27.field369[class8.field100];
        if (var4 != 0L && var2 <= var4) {
        }
        class27.field369[class8.field100] = var2;
        class8.field100 = class8.field100 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method12(-99);
        if (!arg0) {
            this.field7 = false;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 86)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "run", descriptor = "()V", line = 95)
    public final void run() {
        try {
            if (class5.field77 != null) {
                String var1 = class5.field77.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class5.field71;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method10((byte) 101, "wrongjava");
                        return;
                    }
                    class2.field16 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class5.field71 == null || class5.field71.equals("1.4.2"))) {
                    this.method10((byte) -45, "wrongjava");
                    return;
                }
            }
            if (class25.field247.field66 != null) {
                Method var3 = class5.field58;
                if (var3 != null) {
                    try {
                        var3.invoke(class25.field247.field66, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method2(true);
            class16.field163 = class25.method162(class20.field190, class15.field157, class29.field427, 125);
            this.method16(120);
            class36.field495 = method13(126);
            class36.field495.method101((byte) 79);
            while (class27.field375 == 0L || class24.method157((byte) -117) < class27.field375) {
                class35.field491 = class36.field495.method103(class2.field16, class14.field142, (byte) 118);
                for (int var5 = 0; var5 < class35.field491; var5++) {
                    this.method4(true);
                }
                this.method7(0);
            }
        } catch (Exception var8) {
            class15.method110(null, (byte) -34, var8);
            this.method10((byte) -89, "crash");
        }
        this.method14(25533);
    }

    @OriginalMember(owner = "mapview!a", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 180)
    public final URL getCodeBase() {
        if (class14.field136 == null) {
            return class25.field247 == null || class25.field247.field66 == this ? super.getCodeBase() : class25.field247.field66.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 194)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "(I)[Lla;", line = 198)
    public static final class23[] method6(int arg0) {
        class23[] var1 = new class23[class36.field502];
        int var2 = -41 % ((arg0 - 26) / 32);
        for (int var3 = 0; var3 < class36.field502; var3++) {
            class23 var4 = var1[var3] = new class23();
            var4.field224 = class2.field9;
            var4.field221 = class3.field27;
            var4.field226 = class11.field117[var3];
            var4.field220 = class7.field81[var3];
            var4.field222 = class32.field467[var3];
            var4.field219 = class14.field139[var3];
            var4.field223 = class25.field242;
            var4.field225 = class4.field56[var3];
        }
        class31.method216(60);
        return var1;
    }

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "(I)V", line = 234)
    private final void method7(int arg0) {
        long var2 = class24.method157((byte) -117);
        long var4 = class15.field153[class29.field439];
        if (var4 != 0L && var2 <= var4) {
        }
        if (arg0 != 0) {
            this.focusLost(null);
        }
        class15.field153[class29.field439] = var2;
        class29.field439 = class29.field439 + 1 & 0x1F;
        if (class15.field155++ > 50) {
            class28.field397 = true;
            class15.field155 -= 50;
            class20.field190.setSize(class15.field157, class29.field427);
            class20.field190.setVisible(true);
            if (class14.field136 == null) {
                class20.field190.setLocation(0, 0);
            } else {
                Insets var6 = class14.field136.getInsets();
                class20.field190.setLocation(var6.left, var6.top);
            }
        }
        this.method3(107);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IJ)V", line = 277)
    public static final void method8(int arg0, long arg1) {
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class14.method106(arg1 - 1L, true);
            class14.method106(1L, true);
        } else {
            class14.method106(arg1, true);
        }
        if (arg0 < 54) {
            field4 = 73;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 298)
    public final String getParameter(String arg0) {
        if (class14.field136 == null) {
            return class25.field247 == null || class25.field247.field66 == this ? super.getParameter(arg0) : class25.field247.field66.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "destroy", descriptor = "()V", line = 311)
    public final void destroy() {
        if (class28.field410 == this && !class25.field240) {
            class27.field375 = class24.method157((byte) -117);
            method8(57, 5000L);
            class28.field398 = null;
            this.method14(25533);
        }
    }

    @OriginalMember(owner = "mapview!a", name = "providesignlink", descriptor = "(Lc;)V", line = 325)
    public static final void providesignlink(class5 arg0) {
        class25.field247 = arg0;
        class28.field398 = arg0;
    }

    @OriginalMember(owner = "mapview!a", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 332)
    public final AppletContext getAppletContext() {
        if (class14.field136 == null) {
            return class25.field247 == null || class25.field247.field66 == this ? super.getAppletContext() : class25.field247.field66.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 346)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!a", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 357)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 361)
    public final URL getDocumentBase() {
        if (class14.field136 == null) {
            return class25.field247 == null || class25.field247.field66 == this ? super.getDocumentBase() : class25.field247.field66.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "start", descriptor = "()V", line = 375)
    public final void start() {
        if (class28.field410 == this && !class25.field240) {
            class27.field375 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "stop", descriptor = "()V", line = 387)
    public final void stop() {
        if (class28.field410 == this && !class25.field240) {
            class27.field375 = class24.method157((byte) -117) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIIII)V", line = 400)
    public final void method9(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class28.field410 != null) {
                class8.field99++;
                if (class8.field99 >= 3) {
                    this.method10((byte) 111, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase());
                return;
            }
            class15.field157 = arg2;
            class29.field431 = arg4;
            class28.field410 = this;
            int var6 = 37 / ((arg3 - 72) / 33);
            class29.field427 = arg0;
            if (class25.field247 == null) {
                class28.field398 = class25.field247 = new class5(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg1, null, 0);
            }
            class25.field247.method38(1, this, true);
        } catch (Exception var8) {
            class15.method110(null, (byte) -34, var8);
            this.method10((byte) -50, "crash");
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(BLjava/lang/String;)V", line = 441)
    public final void method10(byte arg0, String arg1) {
        if (this.field7) {
            return;
        }
        this.field7 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var5) {
        }
        int var4 = 20 % ((arg0 - 50) / 41);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 468)
    public static void method11(byte arg0) {
        field6 = null;
        field3 = null;
        field5 = null;
        field1 = null;
        if (arg0 != 115) {
            method6(8);
        }
    }

    @OriginalMember(owner = "mapview!a", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 480)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 487)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "(I)Lp;", line = 492)
    private static final class29 method13(int arg0) {
        try {
            if (arg0 <= 74) {
                method11((byte) 85);
            }
            return (class29) Class.forName("ha").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class13();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "(I)V", line = 506)
    private final synchronized void method14(int arg0) {
        if (class25.field240) {
            return;
        }
        class25.field240 = true;
        if (arg0 != 25533) {
            field2 = 39;
        }
        try {
            class20.field190.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method5(-1);
        } catch (Exception var8) {
        }
        if (class14.field136 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class25.field247 != null) {
            try {
                class25.field247.method40(-33);
            } catch (Exception var6) {
            }
        }
        this.method1(24858);
    }

    @OriginalMember(owner = "mapview!a", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 551)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 554)
    public final synchronized void paint(Graphics arg0) {
        if (class28.field410 != this || class25.field240) {
            return;
        }
        class28.field397 = true;
        if (class5.field71 != null && class5.field71.startsWith("1.5") && class24.method157((byte) -117) - class32.field462 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class15.field157 <= var2.width && class29.field427 <= var2.height) {
                class28.field417 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "(I)Z", line = 583)
    public final boolean method15(int arg0) {
        if (arg0 > -23) {
            field3 = null;
        }
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
            } else {
                this.method10((byte) 120, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 615)
    public final void focusGained(FocusEvent arg0) {
        class28.field397 = true;
    }

    @OriginalMember(owner = "mapview!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 635)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 640)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!a", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V")
    public abstract void method1(int arg0);

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(I)V")
    public abstract void method3(int arg0);

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "(I)V")
    public abstract void method5(int arg0);

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "(I)V")
    public abstract void method12(int arg0);

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "(I)V")
    public abstract void method16(int arg0);
}
