import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Font;
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

@OriginalClass("client!ma")
public abstract class class84 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Z")
    private boolean field1872 = false;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lsc;")
    public static class128 field1863 = class129.method1017(false, "mod_icons");

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lsc;")
    public static class128 field1875 = class129.method1017(false, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lsc;")
    private static class128 field1869 = class129.method1017(false, "Continue");

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lsc;")
    public static class128 field1867 = class129.method1017(false, "(Y<)4col>");

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "Lsc;")
    public static class128 field1877 = field1869;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "Lsc;")
    public static class128 field1891 = class129.method1017(false, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "Lsf;")
    public static class131 field1889;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Ldc;")
    public static class25 field1873;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Ljava/awt/Font;")
    public static Font field1883;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "Z")
    public static boolean field1894;

    @OriginalMember(owner = "client!ma", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1882++;
        if (class115.field2577 == null) {
            return class144.field3353 == null || class144.field3353.field159 == this ? super.getParameter(arg0) : class144.field3353.field159.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public final synchronized void method610(int arg0) {
        Container var2;
        if (class115.field2577 == null) {
            var2 = class144.field3353.field159;
        } else {
            var2 = class115.field2577;
        }
        field1874++;
        if (class127.field2888 != null) {
            class127.field2888.removeFocusListener(this);
            var2.remove(class127.field2888);
        }
        class127.field2888 = new class62(this);
        var2.add(class127.field2888);
        class127.field2888.setSize(class89.field2036, class6.field99);
        class127.field2888.setVisible(true);
        if (class115.field2577 == null) {
            class127.field2888.setLocation(0, 0);
        } else {
            Insets var3 = class115.field2577.getInsets();
            class127.field2888.setLocation(var3.left, var3.top);
        }
        class127.field2888.addFocusListener(this);
        if (arg0 != 6513) {
            field1875 = null;
        }
        class127.field2888.requestFocus();
        class121.field2755 = true;
        class106.field2409 = false;
        class152.field3505 = class68.method516(false);
    }

    @OriginalMember(owner = "client!ma", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1893++;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public abstract void method184(int arg0);

    @OriginalMember(owner = "client!ma", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1859++;
        if (class6.field86 != this || class68.field1522) {
            return;
        }
        class121.field2755 = true;
        if (class10.field170 != null && class10.field170.startsWith("1.5") && class68.method516(false) - class152.field3505 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class89.field2036 && var2.height >= class6.field99) {
                class106.field2409 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    private final void method611(int arg0) {
        field1854++;
        int var2 = 97 % ((arg0 + 72) / 34);
        long var3 = class137.field3245[class94.field2214];
        long var5 = class68.method516(false);
        class137.field3245[class94.field2214] = var5;
        class94.field2214 = class94.field2214 + 1 & 0x1F;
        if (var3 != 0L && var3 < var5) {
            int var7 = (int) (var5 - var3);
            class68.field1527 = ((var7 >> 1) + 32000) / var7;
        }
        if (class141.field3318++ > 50) {
            class121.field2755 = true;
            class141.field3318 -= 50;
            class127.field2888.setSize(class89.field2036, class6.field99);
            class127.field2888.setVisible(true);
            if (class115.field2577 == null) {
                class127.field2888.setLocation(0, 0);
            } else {
                Insets var8 = class115.field2577.getInsets();
                class127.field2888.setLocation(var8.left, var8.top);
            }
        }
        this.method186(true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method612(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field1886++;
        try {
            class6.field86 = this;
            class89.field2036 = arg6;
            class6.field99 = arg1;
            class159.field3648 = arg4;
            class115.field2577 = new Frame();
            class115.field2577.setTitle("Jagex");
            class115.field2577.setResizable(false);
            class115.field2577.addWindowListener(this);
            class115.field2577.setVisible(true);
            class115.field2577.toFront();
            Insets var8 = class115.field2577.getInsets();
            class115.field2577.setSize(var8.left + arg6 + var8.right, var8.top + arg1 - -var8.bottom);
            class25.field503 = class144.field3353 = new class10(true, null, arg0, arg3, arg2);
            class144.field3353.method86(this, 108, 1);
            if (arg5 != 0) {
                this.destroy();
            }
        } catch (Exception var10) {
            class116.method895(~arg5, var10, null);
        }
    }

    @OriginalMember(owner = "client!ma", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1885++;
        if (class115.field2577 == null) {
            return class144.field3353 == null || class144.field3353.field159 == this ? super.getCodeBase() : class144.field3353.field159.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZIII)V")
    public final void method613(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1853++;
        if (arg1) {
            return;
        }
        try {
            if (class6.field86 == null) {
                class6.field86 = this;
                class159.field3648 = arg0;
                class89.field2036 = arg2;
                class6.field99 = arg3;
                if (class144.field3353 == null) {
                    class25.field503 = class144.field3353 = new class10(false, this, arg4, null, 0);
                }
                class144.field3353.method86(this, 124, 1);
            } else {
                class1.field12++;
                if (class1.field12 >= 3) {
                    this.method618(-29434, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class116.method895(-1, var7, null);
            this.method618(-29434, "crash");
        }
    }

    @OriginalMember(owner = "client!ma", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1881++;
    }

    @OriginalMember(owner = "client!ma", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1890++;
        class143.field3343 = true;
        class121.field2755 = true;
    }

    @OriginalMember(owner = "client!ma", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1887++;
        if (class115.field2577 == null) {
            return class144.field3353 == null || class144.field3353.field159 == this ? super.getDocumentBase() : class144.field3353.field159.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1888++;
        if (class6.field86 == this && !class68.field1522) {
            class40.field754 = class68.method516(false);
            class18.method164(false, 5000L);
            class25.field503 = null;
            this.method617(1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class143.field3343 = false;
        field1861++;
    }

    @OriginalMember(owner = "client!ma", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1855++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ma", name = "start", descriptor = "()V")
    public final void start() {
        field1876++;
        if (class6.field86 == this && !class68.field1522) {
            class40.field754 = 0L;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
    public abstract void method188(int arg0);

    @OriginalMember(owner = "client!ma", name = "run", descriptor = "()V")
    public final void run() {
        field1871++;
        try {
            if (class10.field173 != null) {
                String var1 = class10.field173.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class10.field170;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method618(-29434, "wrongjava");
                        return;
                    }
                    class54.field1181 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class10.field170 == null || class10.field170.equals("1.4.2"))) {
                    this.method618(-29434, "wrongjava");
                    return;
                }
            }
            if (class144.field3353.field159 != null) {
                Method var3 = class10.field157;
                if (var3 != null) {
                    try {
                        var3.invoke(class144.field3353.field159, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method610(6513);
            class5.field51 = class44.method313(class127.field2888, (byte) 55, class89.field2036, class6.field99);
            this.method182(-1);
            class20.field367 = class106.method789(true);
            while (class40.field754 == 0L || class68.method516(false) < class40.field754) {
                class86.field1952 = class20.field367.method151(class63.field1352, 5000, class54.field1181);
                for (int var4 = 0; var4 < class86.field1952; var4++) {
                    this.method615(true);
                }
                this.method611(108);
                class116.method894(-13960, class127.field2888, class144.field3353);
            }
        } catch (Exception var7) {
            class116.method895(-1, var7, null);
            this.method618(-29434, "crash");
        }
        this.method617(1);
    }

    @OriginalMember(owner = "client!ma", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1858++;
    }

    @OriginalMember(owner = "client!ma", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1866++;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public static void method614(int arg0) {
        field1863 = null;
        field1891 = null;
        if (arg0 < 35) {
            field1877 = null;
        }
        field1873 = null;
        field1869 = null;
        field1877 = null;
        field1867 = null;
        field1875 = null;
        field1889 = null;
        field1883 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    private final void method615(boolean arg0) {
        field1884++;
        long var2 = class68.method516(!arg0);
        long var4 = class113.field2548[class102.field2335];
        if (!arg0) {
            this.focusGained(null);
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class113.field2548[class102.field2335] = var2;
        class102.field2335 = class102.field2335 + 1 & 0x1F;
        synchronized (this) {
            class21.field396 = class143.field3343;
        }
        this.method185(-8);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Lkc;")
    public static final class72 method616(int arg0, int arg1) {
        field1880++;
        class72 var2 = (class72) class71.field1591.method917((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class140.field3260.method1023(arg1, 16, (byte) -35);
        class72 var4 = new class72();
        if (arg0 > -39) {
            return null;
        }
        if (var3 != null) {
            var4.method545((byte) 57, new class86(var3));
        }
        class71.field1591.method913((long) arg1, var4, (byte) -88);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1857++;
        if (class115.field2577 == null) {
            return class144.field3353 == null || class144.field3353.field159 == this ? super.getAppletContext() : class144.field3353.field159.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "stop", descriptor = "()V")
    public final void stop() {
        field1878++;
        if (class6.field86 == this && !class68.field1522) {
            class40.field754 = class68.method516(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
    public abstract void method182(int arg0);

    @OriginalMember(owner = "client!ma", name = "providesignlink", descriptor = "(Lbb;)V")
    public static final void providesignlink(class10 arg0) {
        field1852++;
        class144.field3353 = arg0;
        class25.field503 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    private final synchronized void method617(int arg0) {
        field1851++;
        if (class68.field1522) {
            return;
        }
        class68.field1522 = true;
        try {
            class127.field2888.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method184(-79);
        } catch (Exception var4) {
        }
        if (class115.field2577 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class144.field3353 != null) {
            try {
                class144.field3353.method79(arg0 ^ 0x1);
            } catch (Exception var2) {
            }
        }
        if (arg0 == 1) {
            this.method188(arg0 ^ 0x1BA);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method618(int arg0, String arg1) {
        field1865++;
        if (arg0 != -29434) {
            field1867 = null;
        }
        if (this.field1872) {
            return;
        }
        this.field1872 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)V")
    public abstract void method185(int arg0);

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(I)Z")
    public final boolean method619(int arg0) {
        int var2 = 120 % ((arg0 + 8) / 61);
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        field1856++;
        if (var3.equals("jagex.com") || var3.endsWith(".jagex.com")) {
            return true;
        } else if (var3.equals("runescape.com") || var3.endsWith(".runescape.com")) {
            return true;
        } else if (var3.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var3.length() > 0 && var3.charAt(var3.length() - 1) >= '0' && var3.charAt(var3.length() - 1) <= '9') {
                var3 = var3.substring(0, var3.length() - 1);
            }
            if (var3.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method618(-29434, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1892++;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
    public abstract void method186(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1864++;
    }

    @OriginalMember(owner = "client!ma", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1870++;
    }
}
