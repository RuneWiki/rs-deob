import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class239 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Z")
    private boolean field4226 = false;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field4224 = 0;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "Le;")
    private static class191 field4254 = class54.method368("level)2", 2047);

    @OriginalMember(owner = "client!og", name = "z", descriptor = "Le;")
    public static class191 field4245 = field4254;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Le;")
    public static class191 field4227 = class54.method368("<br>", 2047);

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Lef;")
    public static class175 field4240 = new class175();

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "[I")
    public static int[] field4256 = new int[25];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!og", name = "stop", descriptor = "()V")
    public final void stop() {
        field4220++;
        if (class162.field2751 == this && !class142.field2367) {
            class14.field168 = class27.method198((byte) -120) + 4000L;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public abstract void method657(int arg0);

    @OriginalMember(owner = "client!og", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4249++;
        if (class114.field1884 == null) {
            return class167.field2820 == null || class167.field2820.field4379 == this ? super.getCodeBase() : class167.field2820.field4379.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4232++;
        if (class162.field2751 != this || class142.field2367) {
            return;
        }
        class163.field2761 = true;
        if (class247.field4370 != null && class247.field4370.startsWith("1.5") && (class27.method198((byte) -116) - class75.field1285) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class133.field2240 <= var2.width && class249.field4434 <= var2.height) {
                class268.field4728 = true;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4221++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!og", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4241++;
        if (class114.field1884 == null) {
            return class167.field2820 == null || class167.field2820.field4379 == this ? super.getAppletContext() : class167.field2820.field4379.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public abstract void method664(byte arg0);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static void method1673(int arg0) {
        if (arg0 != -20584) {
            field4245 = null;
        }
        field4240 = null;
        field4254 = null;
        field4256 = null;
        field4245 = null;
        field4227 = null;
    }

    @OriginalMember(owner = "client!og", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4228++;
        class138.field2314 = true;
        class163.field2761 = true;
    }

    @OriginalMember(owner = "client!og", name = "run", descriptor = "()V")
    public final void run() {
        field4222++;
        try {
            if (class247.field4378 != null) {
                String var1 = class247.field4378.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class247.field4370;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1674(2, "wrongjava");
                        return;
                    }
                    class50.field905 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class247.field4370 == null || class247.field4370.equals("1.4.2"))) {
                    this.method1674(2, "wrongjava");
                    return;
                }
            }
            if (class167.field2820.field4379 != null) {
                Method var3 = class247.field4385;
                if (var3 != null) {
                    try {
                        var3.invoke(class167.field2820.field4379, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1682(0);
            class42.field740 = class68.method450(class51.field909, class200.field3584, false, class190.field3337);
            this.method663((byte) -90);
            class70.field1233 = class50.method334((byte) -104);
            while (class14.field168 == 0L || class14.field168 > class27.method198((byte) -117)) {
                class181.field3111 = class70.field1233.method5(class151.field2589, class50.field905, -405);
                for (int var4 = 0; var4 < class181.field3111; var4++) {
                    this.method1675(-111);
                }
                this.method1678(1);
                class234.method1654(class51.field909, class167.field2820, -112);
            }
        } catch (Exception var7) {
            class25.method182(var7, (String) null, true);
            this.method1674(2, "crash");
        }
        this.method1681((byte) 124, true);
    }

    @OriginalMember(owner = "client!og", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4246++;
        if (class114.field1884 == null) {
            return class167.field2820 == null || class167.field2820.field4379 == this ? super.getDocumentBase() : class167.field2820.field4379.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public abstract void method663(byte arg0);

    @OriginalMember(owner = "client!og", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4231++;
    }

    @OriginalMember(owner = "client!og", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4238++;
        if (class114.field1884 == null) {
            return class167.field2820 == null || class167.field2820.field4379 == this ? super.getParameter(arg0) : class167.field2820.field4379.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1674(int arg0, String arg1) {
        field4235++;
        if (arg0 != 2) {
            this.destroy();
        }
        if (this.field4226) {
            return;
        }
        this.field4226 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!og", name = "providesignlink", descriptor = "(Lt;)V")
    public static final void providesignlink(class247 arg0) {
        class167.field2820 = arg0;
        class83.field1392 = arg0;
        field4252++;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    private final void method1675(int arg0) {
        int var2 = -11 / ((arg0 + 31) / 58);
        long var3 = class95.field1544[class88.field1433];
        long var5 = class27.method198((byte) -123);
        field4229++;
        class95.field1544[class88.field1433] = var5;
        boolean var10000;
        if (var3 == 0L || var5 <= var3) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class88.field1433 = class88.field1433 + 1 & 0x1F;
        synchronized (this) {
            class81.field1367 = class138.field2314;
        }
        this.method666(7);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)Z")
    public final boolean method1676(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field4253++;
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
            if (arg0 != -22) {
                this.getDocumentBase();
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1674(2, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4243++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
    public final void method1677(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4255++;
        try {
            if (class162.field2751 == null) {
                class118.field1941 = arg4;
                class200.field3584 = arg1;
                class133.field2240 = arg1;
                class162.field2751 = this;
                class143.field2373 = arg2;
                class17.field232 = 0;
                class190.field3337 = arg0;
                class249.field4434 = arg0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class167.field2820 == null) {
                    class83.field1392 = class167.field2820 = new class247(false, this, arg3, (String) null, 0);
                }
                class167.field2820.method1715(1, -95, this);
            } else {
                class111.field1873++;
                if (class111.field1873 >= 3) {
                    this.method1674(2, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class25.method182(var8, (String) null, true);
            this.method1674(arg4 ^ 0x2, "crash");
        }
    }

    @OriginalMember(owner = "client!og", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4242++;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    public abstract void method662(int arg0);

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    private final void method1678(int arg0) {
        field4250++;
        long var2 = class57.field1064[class258.field4585];
        long var4 = class27.method198((byte) -120);
        class57.field1064[class258.field4585] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class199.field3548 = ((var6 >> 1) + 32000) / var6;
        }
        class258.field4585 = class258.field4585 + arg0 & 0x1F;
        if ((class110.field1834++) > 50) {
            class163.field2761 = true;
            class110.field1834 -= 50;
            class51.field909.setSize(class200.field3584, class190.field3337);
            class51.field909.setVisible(true);
            if (class114.field1884 != null && class141.field2362 == null) {
                Insets var7 = class114.field1884.getInsets();
                class51.field909.setLocation(var7.left + class17.field232, var7.top - -class118.field1941);
            } else {
                class51.field909.setLocation(class17.field232, class118.field1941);
            }
        }
        this.method657(46);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIBIILjava/lang/String;I)V")
    public final void method1679(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5, int arg6) {
        field4248++;
        try {
            class17.field232 = 0;
            class118.field1941 = 0;
            class190.field3337 = arg6;
            class249.field4434 = arg6;
            class143.field2373 = arg4;
            class200.field3584 = arg3;
            class133.field2240 = arg3;
            class162.field2751 = this;
            class114.field1884 = new Frame();
            class114.field1884.setTitle("Jagex");
            class114.field1884.setResizable(true);
            class114.field1884.addWindowListener(this);
            class114.field1884.setVisible(true);
            class114.field1884.toFront();
            Insets var8 = class114.field1884.getInsets();
            class114.field1884.setSize(var8.right + var8.left + class133.field2240, class249.field4434 + var8.top - -var8.bottom);
            if (arg2 == -111) {
                class83.field1392 = class167.field2820 = new class247(true, (Applet) null, arg0, arg5, arg1);
                class167.field2820.method1715(1, arg2 + 29, this);
            }
        } catch (Exception var10) {
            class25.method182(var10, (String) null, true);
        }
    }

    @OriginalMember(owner = "client!og", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4230++;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public abstract void method666(int arg0);

    @OriginalMember(owner = "client!og", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4223++;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
    public static final void method1680(byte arg0) {
        field4234++;
        if (arg0 <= 10) {
            return;
        }
        int var1 = class107.field1776.method1099((byte) 120, 8);
        if (var1 < class260.field4586) {
            for (int var2 = var1; var2 < class260.field4586; var2++) {
                class54.field1012[class79.field1350++] = class73.field1271[var2];
            }
        }
        if (var1 > class260.field4586) {
            throw new RuntimeException("gppov1");
        }
        class260.field4586 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class73.field1271[var3];
            class76 var5 = class245.field4357[var4];
            int var6 = class107.field1776.method1099((byte) 126, 1);
            if (var6 == 0) {
                class73.field1271[class260.field4586++] = var4;
                var5.field2992 = class135.field2267;
            } else {
                int var7 = class107.field1776.method1099((byte) 116, 2);
                if (var7 == 0) {
                    class73.field1271[class260.field4586++] = var4;
                    var5.field2992 = class135.field2267;
                    class18.field247[class90.field1460++] = var4;
                } else if (var7 == 1) {
                    class73.field1271[class260.field4586++] = var4;
                    var5.field2992 = class135.field2267;
                    int var8 = class107.field1776.method1099((byte) 121, 3);
                    var5.method1190(true, false, var8);
                    int var9 = class107.field1776.method1099((byte) 124, 1);
                    if (var9 == 1) {
                        class18.field247[class90.field1460++] = var4;
                    }
                } else if (var7 == 2) {
                    class73.field1271[class260.field4586++] = var4;
                    var5.field2992 = class135.field2267;
                    int var10 = class107.field1776.method1099((byte) 121, 3);
                    var5.method1190(true, true, var10);
                    int var11 = class107.field1776.method1099((byte) 118, 3);
                    var5.method1190(true, true, var11);
                    int var12 = class107.field1776.method1099((byte) 119, 1);
                    if (var12 == 1) {
                        class18.field247[class90.field1460++] = var4;
                    }
                } else if (var7 == 3) {
                    class54.field1012[class79.field1350++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "start", descriptor = "()V")
    public final void start() {
        field4225++;
        if (class162.field2751 == this && !class142.field2367) {
            class14.field168 = 0L;
        }
    }

    @OriginalMember(owner = "client!og", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4239++;
    }

    @OriginalMember(owner = "client!og", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4236++;
        if (class162.field2751 == this && !class142.field2367) {
            class14.field168 = class27.method198((byte) -119);
            class18.method142(true, 5000L);
            class83.field1392 = null;
            this.method1681((byte) 127, false);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BZ)V")
    private final void method1681(byte arg0, boolean arg1) {
        field4247++;
        synchronized (this) {
            if (class142.field2367) {
                return;
            }
            class142.field2367 = true;
        }
        if (class167.field2820.field4379 != null) {
            class167.field2820.field4379.destroy();
        }
        try {
            this.method662(-110);
        } catch (Exception var9) {
        }
        if (arg0 <= 117) {
            this.method1678(-80);
        }
        if (class51.field909 != null) {
            try {
                class51.field909.removeFocusListener(this);
                class51.field909.getParent().remove(class51.field909);
            } catch (Exception var8) {
            }
        }
        if (class167.field2820 != null) {
            try {
                class167.field2820.method1716(0);
            } catch (Exception var7) {
            }
        }
        this.method664((byte) -128);
        if (class114.field1884 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!og", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4237++;
    }

    @OriginalMember(owner = "client!og", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class138.field2314 = false;
        field4233++;
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
    public final synchronized void method1682(int arg0) {
        field4251++;
        if (arg0 != 0) {
            this.field4226 = true;
        }
        if (class51.field909 != null) {
            class51.field909.removeFocusListener(this);
            class51.field909.getParent().remove(class51.field909);
        }
        Container var2;
        if (class141.field2362 != null) {
            var2 = class141.field2362;
        } else if (class114.field1884 == null) {
            var2 = class167.field2820.field4379;
        } else {
            var2 = class114.field1884;
        }
        var2.setLayout((LayoutManager) null);
        class51.field909 = new class211(this);
        var2.add(class51.field909);
        class51.field909.setSize(class200.field3584, class190.field3337);
        class51.field909.setVisible(true);
        if (class114.field1884 == var2) {
            Insets var3 = class114.field1884.getInsets();
            class51.field909.setLocation(class17.field232 + var3.left, class118.field1941 + var3.top);
        } else {
            class51.field909.setLocation(class17.field232, class118.field1941);
        }
        class51.field909.addFocusListener(this);
        class51.field909.requestFocus();
        class81.field1367 = true;
        class138.field2314 = true;
        class163.field2761 = true;
        class268.field4728 = false;
        class75.field1285 = class27.method198((byte) -124);
    }
}
