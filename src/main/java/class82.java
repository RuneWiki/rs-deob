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
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class82 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
    private boolean field1888 = false;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Lec;")
    public static class32 field1892 = class73.method594("Geben Sie Ihren Benutzernamen", true);

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "Lec;")
    public static class32 field1907 = class73.method594("title)3jpg", true);

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Lja;")
    public static class63 field1915 = new class63(64);

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "Z")
    public static boolean field1919 = false;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static volatile int field1918 = 0;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Lec;")
    private static class32 field1920 = class73.method594("Please subscribe)1 or use a different world)3", true);

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Lec;")
    public static class32 field1917 = field1920;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Lga;")
    public static class44 field1921;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Z")
    public static boolean field1922;

    @OriginalMember(owner = "client!lf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1896++;
    }

    @OriginalMember(owner = "client!lf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1886++;
        class27.field484 = false;
    }

    @OriginalMember(owner = "client!lf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1912++;
    }

    @OriginalMember(owner = "client!lf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1905++;
        if (class11.field184 == null) {
            return class154.field3518 == null || class154.field3518.field458 == this ? super.getParameter(arg0) : class154.field3518.field458.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public abstract void method145(int arg0);

    @OriginalMember(owner = "client!lf", name = "start", descriptor = "()V")
    public final void start() {
        field1890++;
        if (class62.field1387 == this && !class62.field1390) {
            class53.field1249 = 0L;
        }
    }

    @OriginalMember(owner = "client!lf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1882++;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z")
    public final boolean method640(int arg0) {
        field1881++;
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
            if (arg0 != 30360) {
                field1892 = null;
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method650((byte) 53, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1887++;
        if (class11.field184 == null) {
            return class154.field3518 == null || class154.field3518.field458 == this ? super.getCodeBase() : class154.field3518.field458.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public abstract void method154(byte arg0);

    @OriginalMember(owner = "client!lf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1913++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method641(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field1893++;
        try {
            class62.field1387 = this;
            class33.field697 = arg5;
            class117.field2814 = arg2;
            class144.field3294 = arg4;
            class11.field184 = new Frame();
            class11.field184.setTitle("Jagex");
            class11.field184.setResizable(false);
            class11.field184.addWindowListener(this);
            class11.field184.setVisible(true);
            class11.field184.toFront();
            Insets var8 = class11.field184.getInsets();
            class11.field184.setSize(var8.right + var8.left + arg4, arg5 - -var8.top + var8.bottom);
            class86.field2011 = class154.field3518 = new class25(true, null, arg6, arg3, arg0);
            class154.field3518.method175(arg1, this, arg1 ^ 0x67);
        } catch (Exception var10) {
            class110.method872(var10, null, 95);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Lba;")
    private static final class9 method642(byte arg0) {
        field1894++;
        if (arg0 < 119) {
            return null;
        }
        try {
            return (class9) Class.forName("pd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class81();
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "client!lf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1884++;
        if (class11.field184 == null) {
            return class154.field3518 == null || class154.field3518.field458 == this ? super.getAppletContext() : class154.field3518.field458.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1910++;
    }

    @OriginalMember(owner = "client!lf", name = "stop", descriptor = "()V")
    public final void stop() {
        field1897++;
        if (class62.field1387 == this && !class62.field1390) {
            class53.field1249 = class52.method408((byte) -88) + 4000L;
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    private final synchronized void method643(int arg0) {
        field1906++;
        if (class62.field1390) {
            return;
        }
        class62.field1390 = true;
        try {
            class107.field2541.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method153(false);
            if (arg0 != 25302) {
                this.windowClosed(null);
            }
        } catch (Exception var4) {
        }
        if (class11.field184 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class154.field3518 != null) {
            try {
                class154.field3518.method176(arg0 - 25298);
            } catch (Exception var2) {
            }
        }
        this.method147(5);
    }

    @OriginalMember(owner = "client!lf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1900++;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
    private final void method644(byte arg0) {
        field1889++;
        long var2 = class52.method408((byte) -119);
        long var4 = class125.field2905[class146.field3323];
        if (arg0 >= -55) {
            this.windowActivated(null);
        }
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class125.field2905[class146.field3323] = var2;
        class146.field3323 = class146.field3323 + 1 & 0x1F;
        synchronized (this) {
            class126.field2928 = class27.field484;
        }
        this.method145(1000);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public abstract void method153(boolean arg0);

    @OriginalMember(owner = "client!lf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class27.field484 = true;
        field1916++;
        class1.field3 = true;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    public static final void method645(byte arg0) {
        field1914++;
        if (arg0 >= -54) {
            field1919 = false;
        }
        for (class144 var1 = (class144) class109.field2573.method1205((byte) 91); var1 != null; var1 = (class144) class109.field2573.method1201(-118)) {
            int var2 = var1.field3282;
            if (class28.method192(var2, -18020)) {
                boolean var3 = true;
                class36[] var4 = class79.field1826[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field849;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field3326;
                    class36 var7 = class128.method993(var6, 86);
                    if (var7 != null) {
                        class132.method1010(var7, (byte) -124);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1908++;
        if (class62.field1387 != this || class62.field1390) {
            return;
        }
        class1.field3 = true;
        if (class25.field457 != null && class25.field457.startsWith("1.5") && class52.method408((byte) -47) - class63.field1444 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class144.field3294 && class33.field697 <= var2.height) {
                class158.field3621 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "providesignlink", descriptor = "(Ldc;)V")
    public static final void providesignlink(class25 arg0) {
        field1895++;
        class154.field3518 = arg0;
        class86.field2011 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "run", descriptor = "()V")
    public final void run() {
        field1901++;
        try {
            if (class25.field464 != null) {
                String var1 = class25.field464.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class25.field457;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method650((byte) 53, "wrongjava");
                        return;
                    }
                    class74.field1738 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class25.field457 == null || class25.field457.equals("1.4.2"))) {
                    this.method650((byte) 53, "wrongjava");
                    return;
                }
            }
            if (class154.field3518.field458 != null) {
                Method var3 = class25.field466;
                if (var3 != null) {
                    try {
                        var3.invoke(class154.field3518.field458, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method646(-29492);
            class50.field1158 = class132.method1013(class33.field697, class144.field3294, class107.field2541, 44);
            this.method154((byte) 85);
            class85.field1982 = method642((byte) 121);
            while (class53.field1249 == 0L || class52.method408((byte) -126) < class53.field1249) {
                class105.field2490 = class85.field1982.method58(class97.field2242, 1, class74.field1738);
                for (int var4 = 0; var4 < class105.field2490; var4++) {
                    this.method644((byte) -77);
                }
                this.method647(0);
                class56.method442(class107.field2541, class154.field3518, 1);
            }
        } catch (Exception var7) {
            class110.method872(var7, null, 95);
            this.method650((byte) 53, "crash");
        }
        this.method643(25302);
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public final synchronized void method646(int arg0) {
        field1899++;
        Container var2;
        if (class11.field184 == null) {
            var2 = class154.field3518.field458;
        } else {
            var2 = class11.field184;
        }
        if (arg0 != -29492) {
            method649(true);
        }
        if (class107.field2541 != null) {
            class107.field2541.removeFocusListener(this);
            var2.remove(class107.field2541);
        }
        class107.field2541 = new class54(this);
        var2.add(class107.field2541);
        class107.field2541.setSize(class144.field3294, class33.field697);
        class107.field2541.setVisible(true);
        if (class11.field184 == null) {
            class107.field2541.setLocation(0, 0);
        } else {
            Insets var3 = class11.field184.getInsets();
            class107.field2541.setLocation(var3.left, var3.top);
        }
        class107.field2541.addFocusListener(this);
        class107.field2541.requestFocus();
        class1.field3 = true;
        class158.field3621 = false;
        class63.field1444 = class52.method408((byte) -111);
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    private final void method647(int arg0) {
        field1880++;
        long var2 = class52.method408((byte) -62);
        if (arg0 != 0) {
            field1921 = null;
        }
        long var4 = class44.field1030[class111.field2613];
        class44.field1030[class111.field2613] = var2;
        class111.field2613 = class111.field2613 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class98.field2272 = ((var6 >> 1) + 32000) / var6;
        }
        if (class113.field2640++ > 50) {
            class1.field3 = true;
            class113.field2640 -= 50;
            class107.field2541.setSize(class144.field3294, class33.field697);
            class107.field2541.setVisible(true);
            if (class11.field184 == null) {
                class107.field2541.setLocation(0, 0);
            } else {
                Insets var7 = class11.field184.getInsets();
                class107.field2541.setLocation(var7.left, var7.top);
            }
        }
        this.method150(2);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public final void method648(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1903++;
        try {
            if (arg0 == 0) {
                if (class62.field1387 == null) {
                    class62.field1387 = this;
                    class144.field3294 = arg2;
                    class33.field697 = arg3;
                    class117.field2814 = arg4;
                    if (class154.field3518 == null) {
                        class86.field2011 = class154.field3518 = new class25(false, this, arg1, null, 0);
                    }
                    class154.field3518.method175(1, this, arg0 + 109);
                } else {
                    class158.field3639++;
                    if (class158.field3639 >= 3) {
                        this.method650((byte) 53, "alreadyloaded");
                    } else {
                        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    }
                }
            }
        } catch (Exception var7) {
            class110.method872(var7, null, 95);
            this.method650((byte) 53, "crash");
        }
    }

    @OriginalMember(owner = "client!lf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1883++;
        this.destroy();
    }

    @OriginalMember(owner = "client!lf", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!lf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1902++;
        if (class11.field184 == null) {
            return class154.field3518 == null || class154.field3518.field458 == this ? super.getDocumentBase() : class154.field3518.field458.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
    public static void method649(boolean arg0) {
        field1917 = null;
        field1907 = null;
        field1921 = null;
        if (arg0) {
            field1907 = null;
        }
        field1915 = null;
        field1892 = null;
        field1920 = null;
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
    public abstract void method150(int arg0);

    @OriginalMember(owner = "client!lf", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1898++;
        if (class62.field1387 == this && !class62.field1390) {
            class53.field1249 = class52.method408((byte) -47);
            class54.method427(5000L, -27166);
            class86.field2011 = null;
            this.method643(25302);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method650(byte arg0, String arg1) {
        field1891++;
        if (arg0 != 53) {
            field1915 = null;
        }
        if (this.field1888) {
            return;
        }
        this.field1888 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!lf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1885++;
        this.paint(arg0);
    }
}
