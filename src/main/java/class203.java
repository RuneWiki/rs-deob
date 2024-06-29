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

@OriginalClass("client!of")
public abstract class class203 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
    private boolean field3475 = false;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "Luh;")
    public static class146 field3486 = new class146();

    @OriginalMember(owner = "client!of", name = "G", descriptor = "Lsc;")
    public static class56 field3494 = new class56(4096);

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static volatile int field3497 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Lmb;")
    public static class178 field3493;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "Llc;")
    public static class90 field3496;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "Z")
    public static boolean field3498;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "Z")
    public static boolean field3500;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public final synchronized void method1361(boolean arg0) {
        if (class156.field2728 != null) {
            class156.field2728.removeFocusListener(this);
            class156.field2728.getParent().remove(class156.field2728);
        }
        field3487++;
        if (class133.field2383 != null) {
            class133.field2383.getParent().remove(class133.field2383);
            class133.field2383 = null;
        }
        Container var2;
        if (class182.field3158 != null) {
            var2 = class182.field3158;
        } else if (class220.field3728 == null) {
            var2 = class72.field1404.field1855;
        } else {
            var2 = class220.field3728;
        }
        var2.setLayout((LayoutManager) null);
        if (class78.field1517 != 0) {
            class133.field2383 = new class93(this);
            var2.add(class133.field2383);
            class133.field2383.setSize(class12.field241, class78.field1517);
            class133.field2383.setVisible(true);
            if (class220.field3728 == var2) {
                Insets var3 = class220.field3728.getInsets();
                class133.field2383.setLocation(var3.left, var3.top);
            } else {
                class133.field2383.setLocation(0, 0);
            }
        }
        class156.field2728 = new class93(this);
        var2.add(class156.field2728);
        class156.field2728.setSize(class12.field241, class166.field2897);
        class156.field2728.setVisible(true);
        if (class220.field3728 == var2) {
            Insets var4 = class220.field3728.getInsets();
            class156.field2728.setLocation(var4.left, class78.field1517 + var4.top);
        } else {
            class156.field2728.setLocation(0, class78.field1517);
        }
        class156.field2728.addFocusListener(this);
        class156.field2728.requestFocus();
        class178.field3087 = true;
        class59.field1248 = true;
        class139.field2478 = arg0;
        class172.field2953 = false;
        class253.field4341 = class80.method600(-59);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public abstract void method585(int arg0);

    @OriginalMember(owner = "client!of", name = "run", descriptor = "()V")
    public final void run() {
        field3468++;
        try {
            if (class100.field1840 != null) {
                String var1 = class100.field1840.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class100.field1841;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1363("wrongjava", 120);
                        return;
                    }
                    class103.field1907 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class100.field1841 == null || class100.field1841.equals("1.4.2"))) {
                    this.method1363("wrongjava", 102);
                    return;
                }
            }
            if (class72.field1404.field1855 != null) {
                Method var3 = class100.field1851;
                if (var3 != null) {
                    try {
                        var3.invoke(class72.field1404.field1855, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1361(true);
            class256.field4387 = class184.method1257(class12.field241, class166.field2897, class156.field2728, true);
            this.method593(false);
            class258.field4482 = class11.method124((byte) -109);
            while (class222.field3756 == 0L || class80.method600(-120) < class222.field3756) {
                class138.field2468 = class258.field4482.method176(-125, class103.field1907, class15.field341);
                for (int var4 = 0; var4 < class138.field2468; var4++) {
                    this.method1366((byte) -75);
                }
                this.method1369((byte) -93);
                class210.method1410(class156.field2728, class72.field1404, (byte) 15);
            }
        } catch (Exception var7) {
            class198.method1325((String) null, var7, -41);
            this.method1363("crash", -58);
        }
        this.method1368(true, 4096);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z")
    public final boolean method1362(int arg0) {
        if (arg0 != -30302) {
            this.run();
        }
        field3488++;
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
                this.method1363("invalidhost", 101);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3465++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1363(String arg0, int arg1) {
        field3491++;
        if (this.field3475) {
            return;
        }
        this.field3475 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
        int var3 = -56 % ((50 - arg1) / 32);
    }

    @OriginalMember(owner = "client!of", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3467++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method1364(byte arg0) {
        field3494 = null;
        field3493 = null;
        if (arg0 >= 46) {
            field3486 = null;
            field3496 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3478++;
        if (class239.field4113 != this || class194.field3298) {
            return;
        }
        class139.field2478 = true;
        if (class100.field1841 != null && class100.field1841.startsWith("1.5") && class80.method600(-51) - class253.field4341 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class12.field241 && var2.height >= class166.field2897) {
                class172.field2953 = true;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIIILjava/lang/String;II)V")
    public final void method1365(boolean arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field3481++;
        try {
            class12.field241 = arg5;
            class239.field4113 = this;
            class134.field2393 = arg2;
            class166.field2897 = arg1;
            class220.field3728 = new Frame();
            class220.field3728.setTitle("Jagex");
            class220.field3728.setResizable(arg0);
            class220.field3728.addWindowListener(this);
            class220.field3728.setVisible(true);
            class220.field3728.toFront();
            Insets var8 = class220.field3728.getInsets();
            class220.field3728.setSize(var8.left + arg5 + var8.right, arg1 - -var8.top + var8.bottom);
            class233.field4017 = class72.field1404 = new class100(true, (Applet) null, arg6, arg4, arg3);
            class72.field1404.method710(this, (byte) -121, 1);
        } catch (Exception var10) {
            class198.method1325((String) null, var10, -66);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public abstract void method580(byte arg0);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    private final void method1366(byte arg0) {
        if (arg0 != -75) {
            return;
        }
        long var2 = class80.method600(-44);
        field3480++;
        long var4 = class104.field1938[class72.field1403];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class104.field1938[class72.field1403] = var2;
        class72.field1403 = class72.field1403 + 1 & 0x1F;
        synchronized (this) {
            class59.field1248 = class178.field3087;
        }
        this.method578(true);
    }

    @OriginalMember(owner = "client!of", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3472++;
        if (class220.field3728 == null) {
            return class72.field1404 == null || class72.field1404.field1855 == this ? super.getParameter(arg0) : class72.field1404.field1855.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
    public abstract void method589(byte arg0);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
    public abstract void method578(boolean arg0);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
    public final void method1367(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3466++;
        try {
            if (class239.field4113 == null) {
                if (arg4 != -58) {
                    field3493 = null;
                }
                class239.field4113 = this;
                class12.field241 = arg1;
                class166.field2897 = arg0;
                class134.field2393 = arg2;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class72.field1404 == null) {
                    class233.field4017 = class72.field1404 = new class100(false, this, arg3, (String) null, 0);
                }
                class72.field1404.method710(this, (byte) -121, 1);
            } else {
                class76.field1488++;
                if (class76.field1488 >= 3) {
                    this.method1363("alreadyloaded", arg4 ^ 0x46);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class198.method1325((String) null, var8, -26);
            this.method1363("crash", arg4 + 145);
        }
    }

    @OriginalMember(owner = "client!of", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3482++;
    }

    @OriginalMember(owner = "client!of", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3476++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
    private final void method1368(boolean arg0, int arg1) {
        field3473++;
        synchronized (this) {
            if (class194.field3298) {
                return;
            }
            class194.field3298 = true;
        }
        if (class72.field1404.field1855 != null) {
            class72.field1404.field1855.destroy();
        }
        try {
            this.method580((byte) -77);
        } catch (Exception var9) {
        }
        if (class156.field2728 != null) {
            try {
                class156.field2728.removeFocusListener(this);
                class156.field2728.getParent().remove(class156.field2728);
            } catch (Exception var8) {
            }
        }
        if (class72.field1404 != null) {
            try {
                class72.field1404.method721(true);
            } catch (Exception var7) {
            }
        }
        this.method589((byte) 97);
        if (class220.field3728 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
        if (arg1 != 4096) {
            this.field3475 = true;
        }
    }

    @OriginalMember(owner = "client!of", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class178.field3087 = true;
        class139.field2478 = true;
        field3464++;
    }

    @OriginalMember(owner = "client!of", name = "stop", descriptor = "()V")
    public final void stop() {
        field3479++;
        if (class239.field4113 == this && !class194.field3298) {
            class222.field3756 = class80.method600(-107) + 4000L;
        }
    }

    @OriginalMember(owner = "client!of", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3483++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
    public abstract void method593(boolean arg0);

    @OriginalMember(owner = "client!of", name = "providesignlink", descriptor = "(Lmi;)V")
    public static final void providesignlink(class100 arg0) {
        class72.field1404 = arg0;
        class233.field4017 = arg0;
        field3471++;
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
    private final void method1369(byte arg0) {
        field3469++;
        long var2 = class80.method600(-50);
        long var4 = class225.field3786[class94.field1773];
        class225.field3786[class94.field1773] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class70.field1387 = ((var6 >> 1) + 32000) / var6;
        }
        class94.field1773 = class94.field1773 + 1 & 0x1F;
        if (class244.field4228++ > 50) {
            class139.field2478 = true;
            class244.field4228 -= 50;
            class156.field2728.setSize(class12.field241, class166.field2897);
            class156.field2728.setVisible(true);
            if (class220.field3728 != null && class182.field3158 == null) {
                Insets var7 = class220.field3728.getInsets();
                class156.field2728.setLocation(var7.left, class78.field1517 + var7.top);
            } else {
                class156.field2728.setLocation(0, class78.field1517);
            }
        }
        int var8 = 1 / ((arg0 + 7) / 41);
        this.method585(-6539);
    }

    @OriginalMember(owner = "client!of", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!of", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3489++;
    }

    @OriginalMember(owner = "client!of", name = "start", descriptor = "()V")
    public final void start() {
        field3485++;
        if (class239.field4113 == this && !class194.field3298) {
            class222.field3756 = 0L;
        }
    }

    @OriginalMember(owner = "client!of", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3470++;
    }

    @OriginalMember(owner = "client!of", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3492++;
        if (class220.field3728 == null) {
            return class72.field1404 == null || class72.field1404.field1855 == this ? super.getDocumentBase() : class72.field1404.field1855.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3477++;
        if (class220.field3728 == null) {
            return class72.field1404 == null || class72.field1404.field1855 == this ? super.getAppletContext() : class72.field1404.field1855.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lk;B)Lia;")
    public static final class257 method1370(class152 arg0, byte arg1) {
        if (arg1 != -68) {
            field3497 = 15;
        }
        field3490++;
        return class78.method569(32767, arg0, -100);
    }

    @OriginalMember(owner = "client!of", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3463++;
        if (class239.field4113 == this && !class194.field3298) {
            class222.field3756 = class80.method600(-119);
            class33.method283(-121, 5000L);
            class233.field4017 = null;
            this.method1368(false, 4096);
        }
    }

    @OriginalMember(owner = "client!of", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class178.field3087 = false;
        field3462++;
    }

    @OriginalMember(owner = "client!of", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3474++;
    }

    @OriginalMember(owner = "client!of", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3484++;
        if (class220.field3728 == null) {
            return class72.field1404 == null || class72.field1404.field1855 == this ? super.getCodeBase() : class72.field1404.field1855.getCodeBase();
        } else {
            return null;
        }
    }
}
