import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!p")
public abstract class class206 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Z")
    private boolean field2395 = false;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "Z")
    private boolean field2406 = false;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field2387 = -50;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lnfa;")
    public static class636 field2392;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Z")
    public static boolean field2373;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Z")
    public static boolean field2409;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "Z")
    public static boolean field2410;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "Z")
    public static boolean field2411;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "Z")
    public static boolean field2412;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "Z")
    public static boolean field2413;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Z")
    public static boolean field2417;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "Z")
    public static boolean field2419;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "Z")
    public static boolean field2420;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "Z")
    public static boolean field2422;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "Z")
    public static boolean field2423;

    @OriginalMember(owner = "client!p", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2378++;
        if (class338.field4326 == null) {
            return class95.field1241 == null || class95.field1241 == this ? super.getParameter(arg0) : class95.field1241.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        field2390++;
        class95.field1241 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2377++;
        if (class699.field9680 != this || class693.field9602) {
            return;
        }
        class118.field1468 = true;
        if (class616.field8364 && (class321.method1854(-101) - class339.field4327) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class578.field7765 <= var2.width && class200.field2327 <= var2.height) {
                class268.field3389 = true;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2400++;
        if (class338.field4326 == null) {
            return class95.field1241 == null || class95.field1241 == this ? super.getDocumentBase() : class95.field1241.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "stop", descriptor = "()V")
    public final void stop() {
        field2391++;
        if (class699.field9680 == this && !class693.field9602) {
            class372.field4792 = class321.method1854(-23) + 4000L;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1191(byte arg0, String arg1) {
        field2402++;
        int var3 = -118 % ((arg0 - 8) / 61);
        if (this.field2395) {
            return;
        }
        this.field2395 = true;
        System.out.println("error_game_" + arg1);
        try {
            class104.method744(class95.field1241, "loggedout", 119);
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
    public final void method1192(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field2376++;
        try {
            if (class699.field9680 == null) {
                class398.field5063 = 0;
                class309.field3890 = arg1;
                class578.field7765 = arg1;
                class491.field6129 = arg5;
                class200.field2327 = arg5;
                class699.field9680 = this;
                class292.field3702 = arg4;
                class151.field1799 = 0;
                class152.field1827 = class95.field1241;
                class112.field1400 = class386.field4955 = new class476(arg3, arg6, arg2, class95.field1241 != null);
                class218 var8 = class386.field4955.method2592(1, this, (byte) 104);
                while (var8.field2546 == 0) {
                    class700.method3867(29279, 10L);
                }
                if (arg0 > -54) {
                    field2373 = true;
                }
            } else {
                class689.field9548++;
                if (class689.field9548 >= 3) {
                    this.method1191((byte) -58, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class564.method2994((byte) 34, null, var10);
            this.method1191((byte) 109, "crash");
        }
    }

    @OriginalMember(owner = "client!p", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2393++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Z")
    public final boolean method1193(int arg0) {
        field2380++;
        int var2 = 112 / ((arg0 + 71) / 32);
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        if (var3.equals("jagex.com") || var3.endsWith(".jagex.com")) {
            return true;
        } else if (var3.equals("runescape.com") || var3.endsWith(".runescape.com")) {
            return true;
        } else if (var3.equals("stellardawn.com") || var3.endsWith(".stellardawn.com")) {
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
                this.method1191((byte) 112, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2385++;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public abstract void method1194(int arg0);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    private final void method1195(byte arg0) {
        field2397++;
        long var2 = class321.method1854(-79);
        long var4 = class11.field102[class608.field8284];
        class11.field102[class608.field8284] = var2;
        class608.field8284 = class608.field8284 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class205.field2372 = class560.field6993;
        }
        this.method1194(0);
        int var7 = -103 / ((arg0 - 6) / 38);
    }

    @OriginalMember(owner = "client!p", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2382++;
    }

    @OriginalMember(owner = "client!p", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2394++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public abstract void method1196(int arg0);

    @OriginalMember(owner = "client!p", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2388++;
        if (class699.field9680 == this && !class693.field9602) {
            class372.field4792 = class321.method1854(-69);
            class700.method3867(29279, 5000L);
            class112.field1400 = null;
            this.method1207(false, -21781);
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public abstract void method1197(int arg0);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Z")
    public final boolean method1198(boolean arg0) {
        field2403++;
        if (!arg0) {
            this.method1198(false);
        }
        return class362.method2099(34167, "jagmisc");
    }

    @OriginalMember(owner = "client!p", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2386++;
        if (class338.field4326 == null) {
            return class95.field1241 == null || class95.field1241 == this ? super.getCodeBase() : class95.field1241.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)Z")
    public final boolean method1199(byte arg0) {
        field2408++;
        int var2 = -2 % ((-arg0 - 9) / 60);
        return class362.method2099(34167, "jaclib");
    }

    @OriginalMember(owner = "client!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class560.field6993 = false;
        field2384++;
    }

    @OriginalMember(owner = "client!p", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2389++;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public abstract void method1200(int arg0);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    private final void method1201(byte arg0) {
        field2396++;
        long var2 = class321.method1854(-66);
        long var4 = class571.field7239[class301.field3833];
        class571.field7239[class301.field3833] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class442.field5548 = ((var6 >> 1) + 32000) / var6;
        }
        class301.field3833 = class301.field3833 + 1 & 0x1F;
        if (class374.field4823++ > 50) {
            class374.field4823 -= 50;
            class118.field1468 = true;
            class472.field5828.setSize(class309.field3890, class491.field6129);
            class472.field5828.setVisible(true);
            if (class338.field4326 != null && class90.field1174 == null) {
                Insets var7 = class338.field4326.getInsets();
                class472.field5828.setLocation(class151.field1799 + var7.left, class398.field5063 + var7.top);
            } else {
                class472.field5828.setLocation(class151.field1799, class398.field5063);
            }
        }
        this.method1203(false);
        int var8 = -54 % ((69 - arg0) / 34);
    }

    @OriginalMember(owner = "client!p", name = "start", descriptor = "()V")
    public final void start() {
        field2399++;
        if (class699.field9680 == this && !class693.field9602) {
            class372.field4792 = 0L;
        }
    }

    @OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
    public final void run() {
        field2407++;
        try {
            if (class476.field5923 != null) {
                String var1 = class476.field5923.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class476.field5918;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1191((byte) -122, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class476.field5918 == null || class476.field5918.equals("1.4.2"))) {
                    this.method1191((byte) 100, "wrongjava");
                    return;
                }
            }
            if (class476.field5918 != null && class476.field5918.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class476.field5918.length()) {
                    char var5 = class476.field5918.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class616.field8364 = true;
                }
            }
            Applet var6 = class699.field9680;
            if (class95.field1241 != null) {
                var6 = class95.field1241;
            }
            Method var7 = class476.field5915;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class437.method2403(true);
            class549.method2938(0);
            this.method1202((byte) 67);
            this.method1196(64);
            class71.field914 = class566.method3008(0);
            while (class372.field4792 == 0L || class321.method1854(-76) < class372.field4792) {
                class386.field4952 = class71.field914.method2227(class113.field1419, 0);
                for (int var8 = 0; var8 < class386.field4952; var8++) {
                    this.method1195((byte) 106);
                }
                this.method1201((byte) 104);
                class695.method3841(50, class472.field5828, class386.field4955);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class564.method2994((byte) 34, this.method1204(992), var20);
            this.method1191((byte) 116, "crash");
        } finally {
            Object var13 = null;
            this.method1207(true, -21781);
        }
    }

    @OriginalMember(owner = "client!p", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2374++;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    public synchronized void method1202(byte arg0) {
        if (class472.field5828 != null) {
            class472.field5828.removeFocusListener(this);
            class472.field5828.getParent().setBackground(Color.black);
            class472.field5828.getParent().remove(class472.field5828);
        }
        field2375++;
        Container var2;
        if (class90.field1174 != null) {
            var2 = class90.field1174;
        } else if (class338.field4326 != null) {
            var2 = class338.field4326;
        } else if (class95.field1241 == null) {
            var2 = class699.field9680;
        } else {
            var2 = class95.field1241;
        }
        var2.setLayout(null);
        class472.field5828 = new class499(this);
        var2.add(class472.field5828);
        if (arg0 != 67) {
            this.method1200(39);
        }
        class472.field5828.setSize(class309.field3890, class491.field6129);
        class472.field5828.setVisible(true);
        if (class338.field4326 == var2) {
            Insets var3 = class338.field4326.getInsets();
            class472.field5828.setLocation(class151.field1799 + var3.left, class398.field5063 + var3.top);
        } else {
            class472.field5828.setLocation(class151.field1799, class398.field5063);
        }
        class472.field5828.addFocusListener(this);
        class472.field5828.requestFocus();
        class205.field2372 = true;
        class560.field6993 = true;
        class118.field1468 = true;
        class268.field3389 = false;
        class339.field4327 = class321.method1854(-108);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
    public abstract void method1203(boolean arg0);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)Ljava/lang/String;")
    public String method1204(int arg0) {
        field2405++;
        if (arg0 != 992) {
            this.method1199((byte) -81);
        }
        return null;
    }

    @OriginalMember(owner = "client!p", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2401++;
        this.destroy();
    }

    @OriginalMember(owner = "client!p", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2398++;
        if (class338.field4326 == null) {
            return class95.field1241 == null || class95.field1241 == this ? super.getAppletContext() : class95.field1241.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;IBIZIII)V")
    public final void method1205(String arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        try {
            class491.field6129 = arg3;
            class200.field2327 = arg3;
            class151.field1799 = 0;
            class398.field5063 = 0;
            class292.field3702 = arg5;
            class699.field9680 = this;
            class152.field1827 = null;
            if (arg2 != -87) {
                return;
            }
            class309.field3890 = arg1;
            class578.field7765 = arg1;
            class338.field4326 = new Frame();
            class338.field4326.setTitle("Jagex");
            class338.field4326.setResizable(true);
            class338.field4326.addWindowListener(this);
            class338.field4326.setVisible(true);
            class338.field4326.toFront();
            Insets var9 = class338.field4326.getInsets();
            class338.field4326.setSize(class578.field7765 + var9.left + var9.right, class200.field2327 + var9.top - -var9.bottom);
            class112.field1400 = class386.field4955 = new class476(arg7, arg0, arg6, true);
            class218 var10 = class386.field4955.method2592(1, this, (byte) 104);
            while (var10.field2546 == 0) {
                class700.method3867(29279, 10L);
            }
        } catch (Exception var12) {
            class564.method2994((byte) 34, null, var12);
        }
        field2383++;
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
    public static void method1206(int arg0) {
        field2392 = null;
        if (arg0 <= 109) {
            provideLoaderApplet(null);
        }
    }

    @OriginalMember(owner = "client!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class560.field6993 = true;
        field2404++;
        class118.field1468 = true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)V")
    private final void method1207(boolean arg0, int arg1) {
        field2381++;
        synchronized (this) {
            if (class693.field9602) {
                return;
            }
            class693.field9602 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class95.field1241 != null) {
            class95.field1241.destroy();
        }
        try {
            this.method1200(-36);
        } catch (Exception var9) {
        }
        if (this.field2406) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field2406 = false;
        }
        class368.method2142(0, true);
        class251.method1512(true);
        if (class472.field5828 != null) {
            try {
                class472.field5828.removeFocusListener(this);
                class472.field5828.getParent().remove(class472.field5828);
            } catch (Exception var7) {
            }
        }
        if (class386.field4955 != null) {
            try {
                class386.field4955.method2588(-4877);
            } catch (Exception var6) {
            }
        }
        this.method1197(3650);
        if (class338.field4326 != null) {
            class338.field4326.setVisible(false);
            class338.field4326.dispose();
            class338.field4326 = null;
        }
        if (arg1 != -21781) {
            this.windowClosed(null);
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!p", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2379++;
    }
}
