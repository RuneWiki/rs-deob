import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.FontMetrics;
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

@OriginalClass("client!vj")
public abstract class class115 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Z")
    private boolean field1861 = false;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Z")
    public static boolean field1849 = false;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field1873 = -1;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1846 = 2;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1871;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "[[B")
    public static byte[][] field1862;

    @OriginalMember(owner = "client!vj", name = "providesignlink", descriptor = "(Lbk;)V", line = 13)
    public static final void providesignlink(class69 arg0) {
        class92.field1484 = arg0;
        class141.field2280 = arg0;
        field1863++;
    }

    @OriginalMember(owner = "client!vj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 23)
    public final void focusGained(FocusEvent arg0) {
        field1859++;
        class1.field43 = true;
        class49.field752 = true;
    }

    @OriginalMember(owner = "client!vj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 32)
    public final synchronized void paint(Graphics arg0) {
        field1866++;
        if (class99.field1590 != this || class121.field1978) {
            return;
        }
        class49.field752 = true;
        if (class270.field4159 && !class162.field2623 && (class212.method1543(22326) - class156.field2556) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class1.field46 && class294.field4625 <= var2.height) {
                class313.field4930 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "run", descriptor = "()V", line = 55)
    public final void run() {
        field1842++;
        try {
            if (class69.field1054 != null) {
                String var1 = class69.field1054.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class69.field1049;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method902((byte) 21, "wrongjava");
                        return;
                    }
                    client.field4130 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class69.field1049 == null || class69.field1049.equals("1.4.2"))) {
                    this.method902((byte) 21, "wrongjava");
                    return;
                }
            }
            if (class69.field1049 != null && class69.field1049.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (class69.field1049.length() > var4) {
                    char var5 = class69.field1049.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 + (var5 - 48);
                }
                if (var3 >= 5) {
                    class270.field4159 = true;
                }
            }
            if (class92.field1484.field1037 != null) {
                Method var6 = class69.field1055;
                if (var6 != null) {
                    try {
                        var6.invoke(class92.field1484.field1037, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class286.method2001(1);
            this.method905(0);
            class101.field1666 = class80.method631(class334.field5197, class338.field5219, class211.field3314, (byte) -97);
            this.method911((byte) -28);
            class19.field357 = class227.method1658(-1);
            while (class11.field243 == 0L || class11.field243 > class212.method1543(22326)) {
                class112.field1818 = class19.field357.method184(false, class301.field4801, client.field4130);
                for (int var8 = 0; var8 < class112.field1818; var8++) {
                    this.method906((byte) 93);
                }
                this.method899(10470);
                class182.method1329(class92.field1484, 1001, class334.field5197);
            }
        } catch (Exception var11) {
            class79.method622((String) null, var11, -652852820);
            this.method902((byte) 21, "crash");
        }
        this.method903(true, 118);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 166)
    private final void method899(int arg0) {
        field1872++;
        long var2 = class212.method1543(arg0 + 11856);
        long var4 = class326.field5093[class185.field2925];
        class326.field5093[class185.field2925] = var2;
        class185.field2925 = class185.field2925 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class337.field5211 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class168.field2702++) > 50) {
            class49.field752 = true;
            class168.field2702 -= 50;
            class334.field5197.setSize(class211.field3314, class338.field5219);
            class334.field5197.setVisible(true);
            if (class139.field2247 != null && class244.field3646 == null) {
                Insets var7 = class139.field2247.getInsets();
                class334.field5197.setLocation(class299.field4789 + var7.left, class142.field2301 + var7.top);
            } else {
                class334.field5197.setLocation(class299.field4789, class142.field2301);
            }
        }
        this.method900((byte) 92);
        if (arg0 != 10470) {
            this.stop();
        }
    }

    @OriginalMember(owner = "client!vj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 211)
    public final void windowClosed(WindowEvent arg0) {
        field1851++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 223)
    public static final void method901(int arg0, int arg1, int arg2, String arg3, String arg4, String arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class118.field1916[var6] = class118.field1916[var6 - 1];
            class195.field3016[var6] = class195.field3016[var6 - 1];
            class82.field1270[var6] = class82.field1270[var6 - 1];
            class297.field4777[var6] = class297.field4777[var6 - 1];
            class274.field4291[var6] = class274.field4291[var6 - 1];
        }
        field1874++;
        class326.field5090 = class200.field3060;
        class118.field1916[0] = arg0;
        class274.field4291[0] = arg2;
        int var7 = 21 / ((-arg1 - 28) / 41);
        class89.field1423++;
        class195.field3016[0] = arg3;
        class82.field1270[0] = arg4;
        class297.field4777[0] = arg5;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLjava/lang/String;)V", line = 250)
    public final void method902(byte arg0, String arg1) {
        field1843++;
        if (this.field1861) {
            return;
        }
        this.field1861 = true;
        System.out.println("error_game_" + arg1);
        try {
            class51.method419((byte) -125, class92.field1484.field1037, "loggedout");
        } catch (Throwable var6) {
        }
        try {
            if (arg0 != 21) {
                field1862 = (byte[][]) ((byte[][]) null);
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V", line = 280)
    private final void method903(boolean arg0, int arg1) {
        field1850++;
        synchronized (this) {
            if (class121.field1978) {
                return;
            }
            if (arg1 < 53) {
                return;
            }
            class121.field1978 = true;
        }
        if (class92.field1484.field1037 != null) {
            class92.field1484.field1037.destroy();
        }
        try {
            this.method908((byte) 30);
        } catch (Exception var12) {
        }
        if (class334.field5197 != null) {
            try {
                class334.field5197.removeFocusListener(this);
                class334.field5197.getParent().remove(class334.field5197);
            } catch (Exception var11) {
            }
        }
        if (class92.field1484 != null) {
            try {
                class92.field1484.method556((byte) -123);
            } catch (Exception var10) {
            }
        }
        this.method914((byte) 113);
        if (class139.field2247 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!vj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 345)
    public final void windowDeiconified(WindowEvent arg0) {
        field1853++;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 353)
    public static void method904(int arg0) {
        int var1 = 18 % ((6 - arg0) / 38);
        field1871 = null;
        field1862 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!vj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 362)
    public final AppletContext getAppletContext() {
        field1845++;
        if (class139.field2247 == null) {
            return class92.field1484 == null || class92.field1484.field1037 == this ? super.getAppletContext() : class92.field1484.field1037.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V", line = 381)
    public final synchronized void method905(int arg0) {
        field1840++;
        if (class334.field5197 != null) {
            class334.field5197.removeFocusListener(this);
            class334.field5197.getParent().remove(class334.field5197);
        }
        Container var2;
        if (class244.field3646 != null) {
            var2 = class244.field3646;
        } else if (class139.field2247 == null) {
            var2 = class92.field1484.field1037;
        } else {
            var2 = class139.field2247;
        }
        var2.setLayout((LayoutManager) null);
        class334.field5197 = new class342(this);
        var2.add(class334.field5197);
        class334.field5197.setSize(class211.field3314, class338.field5219);
        class334.field5197.setVisible(true);
        if (class139.field2247 == var2) {
            Insets var3 = class139.field2247.getInsets();
            class334.field5197.setLocation(class299.field4789 + var3.left, class142.field2301 + var3.top);
        } else {
            class334.field5197.setLocation(class299.field4789, class142.field2301);
        }
        if (arg0 != 0) {
            return;
        }
        class334.field5197.addFocusListener(this);
        class334.field5197.requestFocus();
        class1.field43 = true;
        class281.field4413 = true;
        class49.field752 = true;
        class313.field4930 = false;
        class156.field2556 = class212.method1543(arg0 + 22326);
    }

    @OriginalMember(owner = "client!vj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 428)
    public final void focusLost(FocusEvent arg0) {
        class1.field43 = false;
        field1852++;
    }

    @OriginalMember(owner = "client!vj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 437)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1870++;
    }

    @OriginalMember(owner = "client!vj", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 446)
    public final void update(Graphics arg0) {
        field1868++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 458)
    private final void method906(byte arg0) {
        field1848++;
        long var2 = class212.method1543(22326);
        long var4 = class150.field2460[class185.field2928];
        class150.field2460[class185.field2928] = var2;
        class185.field2928 = class185.field2928 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
        }
        synchronized (this) {
            if (arg0 <= 74) {
                this.windowDeiconified((WindowEvent) null);
            }
            class281.field4413 = class1.field43;
        }
        this.method910(49);
    }

    @OriginalMember(owner = "client!vj", name = "start", descriptor = "()V", line = 488)
    public final void start() {
        field1857++;
        if (class99.field1590 == this && !class121.field1978) {
            class11.field243 = 0L;
        }
    }

    @OriginalMember(owner = "client!vj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 500)
    public final void windowActivated(WindowEvent arg0) {
        field1839++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZIII)V", line = 508)
    public final void method907(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1841++;
        try {
            if (class99.field1590 != null) {
                class314.field4939++;
                if (class314.field4939 >= 3) {
                    this.method902((byte) 21, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class211.field3314 = arg3;
            class1.field46 = arg3;
            class299.field4789 = 0;
            class142.field2301 = 0;
            class154.field2502 = arg2;
            class99.field1590 = this;
            class338.field5219 = arg4;
            class294.field4625 = arg4;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class253.field3719 = true;
            } else {
                class253.field3719 = false;
            }
            if (!arg1) {
                return;
            }
            if (class92.field1484 == null) {
                class141.field2280 = class92.field1484 = new class69(this, arg0, (String) null, 0);
            }
            class23 var7 = class92.field1484.method553(this, (byte) 88, 1);
            while (var7.field405 == 0) {
                class245.method1729(120, 10L);
            }
            class165.field2672 = (Thread) var7.field409;
        } catch (Exception var9) {
            class79.method622((String) null, var9, -652852820);
            this.method902((byte) 21, "crash");
        }
    }

    @OriginalMember(owner = "client!vj", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 566)
    public final URL getCodeBase() {
        field1869++;
        if (class139.field2247 == null) {
            return class92.field1484 == null || class92.field1484.field1037 == this ? super.getCodeBase() : class92.field1484.field1037.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "destroy", descriptor = "()V", line = 583)
    public final void destroy() {
        field1856++;
        if (class99.field1590 == this && !class121.field1978) {
            class11.field243 = class212.method1543(22326);
            class245.method1729(121, 5000L);
            class141.field2280 = null;
            this.method903(false, 77);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/lang/String;IIIIII)V", line = 598)
    public final void method909(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class211.field3314 = arg4;
            class1.field46 = arg4;
            class154.field2502 = arg3;
            class142.field2301 = 0;
            class299.field4789 = arg5;
            class99.field1590 = this;
            class338.field5219 = arg7;
            class294.field4625 = arg7;
            class139.field2247 = new Frame();
            class139.field2247.setTitle("Jagex");
            class139.field2247.setResizable(true);
            class139.field2247.addWindowListener(this);
            class139.field2247.setVisible(true);
            class139.field2247.toFront();
            Insets var9 = class139.field2247.getInsets();
            class139.field2247.setSize(class1.field46 + var9.left + var9.right, class294.field4625 + var9.bottom - -var9.top);
            class141.field2280 = class92.field1484 = new class69((Applet) null, arg2, arg1, arg6);
            class23 var10 = class92.field1484.method553(this, (byte) 76, 1);
            while (var10.field405 == 0) {
                class245.method1729(126, 10L);
            }
            class165.field2672 = (Thread) var10.field409;
        } catch (Exception var12) {
            class79.method622((String) null, var12, arg5 - 652852820);
        }
        field1860++;
    }

    @OriginalMember(owner = "client!vj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 636)
    public final void windowOpened(WindowEvent arg0) {
        field1847++;
    }

    @OriginalMember(owner = "client!vj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 647)
    public final void windowDeactivated(WindowEvent arg0) {
        field1855++;
    }

    @OriginalMember(owner = "client!vj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 656)
    public final URL getDocumentBase() {
        field1867++;
        if (class139.field2247 == null) {
            return class92.field1484 == null || class92.field1484.field1037 == this ? super.getDocumentBase() : class92.field1484.field1037.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)V", line = 674)
    public static final void method912(byte arg0) {
        field1854++;
        class304.field4842.method2282((byte) -124);
        if (arg0 <= 88) {
            method912((byte) 85);
        }
    }

    @OriginalMember(owner = "client!vj", name = "stop", descriptor = "()V", line = 685)
    public final void stop() {
        field1864++;
        if (class99.field1590 == this && !class121.field1978) {
            class11.field243 = class212.method1543(22326) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 697)
    public final void windowIconified(WindowEvent arg0) {
        field1865++;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)Z", line = 705)
    public final boolean method913(int arg0) {
        if (arg0 != 28030) {
            this.destroy();
        }
        field1858++;
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
                this.method902((byte) 21, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 745)
    public final String getParameter(String arg0) {
        field1844++;
        if (class139.field2247 == null) {
            return class92.field1484 == null || class92.field1484.field1037 == this ? super.getParameter(arg0) : class92.field1484.field1037.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public abstract void method900(byte arg0);

    @OriginalMember(owner = "client!vj", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
    public abstract void method908(byte arg0);

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
    public abstract void method910(int arg0);

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V")
    public abstract void method911(byte arg0);

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(B)V")
    public abstract void method914(byte arg0);
}
