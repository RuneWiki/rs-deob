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

@OriginalClass("client!bh")
public abstract class class265 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Z")
    private boolean field4438 = false;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field4462 = 127;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Lvm;")
    public static class202 field4460 = new class202(64);

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field4470 = -1;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 5)
    public final void method1842(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field4469++;
        try {
            class266.field4484 = arg0;
            class53.field754 = arg0;
            class282.field4668 = arg6;
            class273.field4567 = arg2;
            class15.field177 = arg2;
            class124.field2085 = this;
            class253.field4224 = 0;
            class324.field5540 = 0;
            class160.field2590 = new Frame();
            class160.field2590.setTitle("Jagex");
            class160.field2590.setResizable(true);
            class160.field2590.addWindowListener(this);
            class160.field2590.setVisible(true);
            class160.field2590.toFront();
            Insets var8 = class160.field2590.getInsets();
            class160.field2590.setSize(class15.field177 + var8.left + var8.right, class53.field754 - -var8.top + var8.bottom);
            class332.field5646 = class249.field4143 = new class92((Applet) null, arg1, arg3, arg5);
            if (arg4 != -2963) {
                this.method1846((String) null, (byte) -56);
            }
            class247 var9 = class249.field4143.method685(1, this, (byte) 117);
            while (var9.field4125 == 0) {
                class288.method1976((byte) 91, 10L);
            }
            class204.field3364 = (Thread) var9.field4123;
        } catch (Exception var11) {
            class110.method834((String) null, var11, -1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Z", line = 55)
    public final boolean method1843(byte arg0) {
        field4455++;
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
            if (arg0 != -84) {
                this.focusGained((FocusEvent) null);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1846("invalidhost", (byte) -33);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "run", descriptor = "()V", line = 95)
    public final void run() {
        field4456++;
        try {
            if (class92.field1549 != null) {
                String var1 = class92.field1549.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class92.field1559;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1846("wrongjava", (byte) -33);
                        return;
                    }
                    class156.field2542 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class92.field1559 == null || class92.field1559.equals("1.4.2"))) {
                    this.method1846("wrongjava", (byte) -33);
                    return;
                }
            }
            if (class92.field1559 != null && class92.field1559.startsWith("1.")) {
                int var3 = 0;
                for (int var4 = 2; var4 < class92.field1559.length(); var4++) {
                    char var5 = class92.field1559.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class219.field3605 = true;
                }
            }
            if (class249.field4143.field1561 != null) {
                Method var6 = class92.field1568;
                if (var6 != null) {
                    try {
                        var6.invoke(class249.field4143.field1561, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class72.method565(-20913);
            this.method1851((byte) 115);
            class156.field2534 = class229.method1594(class266.field4484, class214.field3526, class273.field4567, -5059);
            this.method1856(28);
            class27.field408 = class277.method1914(1);
            while (class180.field2947 == 0L || class130.method935(false) < class180.field2947) {
                class167.field2732 = class27.field408.method277(74, class262.field4372, class156.field2542);
                for (int var8 = 0; var8 < class167.field2732; var8++) {
                    this.method1857((byte) 113);
                }
                this.method1855(32000);
                class71.method555(class249.field4143, 1, class214.field3526);
            }
        } catch (Exception var11) {
            class110.method834((String) null, var11, -1);
            this.method1846("crash", (byte) -33);
        }
        this.method1844(true, true);
    }

    @OriginalMember(owner = "client!bh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 201)
    public final void windowClosed(WindowEvent arg0) {
        field4459++;
    }

    @OriginalMember(owner = "client!bh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 209)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4467++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZZ)V", line = 217)
    private final void method1844(boolean arg0, boolean arg1) {
        field4439++;
        synchronized (this) {
            if (class120.field2014) {
                return;
            }
            class120.field2014 = arg1;
        }
        if (class249.field4143.field1561 != null) {
            class249.field4143.field1561.destroy();
        }
        try {
            this.method1852((byte) 75);
        } catch (Exception var12) {
        }
        if (class214.field3526 != null) {
            try {
                class214.field3526.removeFocusListener(this);
                class214.field3526.getParent().remove(class214.field3526);
            } catch (Exception var11) {
            }
        }
        if (class249.field4143 != null) {
            try {
                class249.field4143.method693((byte) 110);
            } catch (Exception var10) {
            }
        }
        this.method1845(122);
        if (class160.field2590 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!bh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 276)
    public final String getParameter(String arg0) {
        field4463++;
        if (class160.field2590 == null) {
            return class249.field4143 == null || class249.field4143.field1561 == this ? super.getParameter(arg0) : class249.field4143.field1561.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 292)
    public final void focusGained(FocusEvent arg0) {
        field4453++;
        class143.field2323 = true;
        class67.field1070 = true;
    }

    @OriginalMember(owner = "client!bh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 301)
    public final void windowOpened(WindowEvent arg0) {
        field4457++;
    }

    @OriginalMember(owner = "client!bh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 313)
    public final void windowActivated(WindowEvent arg0) {
        field4452++;
    }

    @OriginalMember(owner = "client!bh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 332)
    public final void focusLost(FocusEvent arg0) {
        field4441++;
        class143.field2323 = false;
    }

    @OriginalMember(owner = "client!bh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 341)
    public final void windowDeactivated(WindowEvent arg0) {
        field4451++;
    }

    @OriginalMember(owner = "client!bh", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 351)
    public final URL getCodeBase() {
        field4443++;
        if (class160.field2590 == null) {
            return class249.field4143 == null || class249.field4143.field1561 == this ? super.getCodeBase() : class249.field4143.field1561.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 366)
    public final void method1846(String arg0, byte arg1) {
        field4444++;
        if (arg1 != -33) {
            this.field4438 = true;
        }
        if (this.field4438) {
            return;
        }
        this.field4438 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!bh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 387)
    public final void windowIconified(WindowEvent arg0) {
        field4461++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBIII)V", line = 395)
    public final void method1847(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4447++;
        if (arg1 != -126) {
            field4458 = 0;
        }
        try {
            if (class124.field2085 != null) {
                class155.field2522++;
                if (class155.field2522 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1846("alreadyloaded", (byte) -33);
                return;
            }
            class282.field4668 = arg0;
            class124.field2085 = this;
            class266.field4484 = arg3;
            class53.field754 = arg3;
            class253.field4224 = 0;
            class324.field5540 = 0;
            class273.field4567 = arg2;
            class15.field177 = arg2;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class239.field3958 = true;
            } else {
                class239.field3958 = false;
            }
            if (class249.field4143 == null) {
                class332.field5646 = class249.field4143 = new class92(this, arg4, (String) null, 0);
            }
            class247 var7 = class249.field4143.method685(1, this, (byte) 89);
            while (var7.field4125 == 0) {
                class288.method1976((byte) 104, 10L);
            }
            class204.field3364 = (Thread) var7.field4123;
        } catch (Exception var9) {
            class110.method834((String) null, var9, -1);
            this.method1846("crash", (byte) -33);
        }
    }

    @OriginalMember(owner = "client!bh", name = "stop", descriptor = "()V", line = 452)
    public final void stop() {
        field4471++;
        if (class124.field2085 == this && !class120.field2014) {
            class180.field2947 = class130.method935(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lsi;I)I", line = 465)
    public static final int method1848(class66 arg0, int arg1) {
        field4450++;
        int var2 = arg1;
        if (arg0.method494(class225.field3704, false)) {
            var2 = arg1 + 1;
        }
        if (arg0.method494(class156.field2527, false)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "start", descriptor = "()V", line = 482)
    public final void start() {
        field4449++;
        if (class124.field2085 == this && !class120.field2014) {
            class180.field2947 = 0L;
        }
    }

    @OriginalMember(owner = "client!bh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 505)
    public final URL getDocumentBase() {
        field4472++;
        if (class160.field2590 == null) {
            return class249.field4143 == null || class249.field4143.field1561 == this ? super.getDocumentBase() : class249.field4143.field1561.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 520)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4445++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V", line = 528)
    public static void method1850(boolean arg0) {
        if (!arg0) {
            providesignlink((class92) null);
        }
        field4460 = null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V", line = 557)
    public final synchronized void method1851(byte arg0) {
        if (class214.field3526 != null) {
            class214.field3526.removeFocusListener(this);
            class214.field3526.getParent().remove(class214.field3526);
        }
        field4440++;
        Container var2;
        if (class325.field5569 != null) {
            var2 = class325.field5569;
        } else if (class160.field2590 == null) {
            var2 = class249.field4143.field1561;
        } else {
            var2 = class160.field2590;
        }
        var2.setLayout((LayoutManager) null);
        class214.field3526 = new class187(this);
        var2.add(class214.field3526);
        class214.field3526.setSize(class273.field4567, class266.field4484);
        class214.field3526.setVisible(true);
        if (class160.field2590 == var2) {
            Insets var3 = class160.field2590.getInsets();
            class214.field3526.setLocation(var3.left + class253.field4224, var3.top - -class324.field5540);
        } else {
            class214.field3526.setLocation(class253.field4224, class324.field5540);
        }
        class214.field3526.addFocusListener(this);
        class214.field3526.requestFocus();
        class293.field4783 = true;
        class143.field2323 = true;
        class67.field1070 = true;
        client.field5431 = false;
        if (arg0 < 24) {
            field4470 = 107;
        }
        class82.field1352 = class130.method935(false);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Z", line = 604)
    public static final boolean method1853(int arg0, int arg1, int arg2) {
        field4468++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg2 != 27887) {
            field4470 = -67;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class83 var3 = class260.method1807(false, arg0);
        return var3.method615(arg2 - 34540, arg1);
    }

    @OriginalMember(owner = "client!bh", name = "providesignlink", descriptor = "(Lwe;)V", line = 624)
    public static final void providesignlink(class92 arg0) {
        class249.field4143 = arg0;
        class332.field5646 = arg0;
        field4446++;
    }

    @OriginalMember(owner = "client!bh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 635)
    public final synchronized void paint(Graphics arg0) {
        field4442++;
        if (class124.field2085 != this || class120.field2014) {
            return;
        }
        class67.field1070 = true;
        if (class219.field3605 && !class99.field1675 && (class130.method935(false) - class82.field1352) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class15.field177 <= var2.width && class53.field754 <= var2.height) {
                client.field5431 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V", line = 665)
    private final void method1855(int arg0) {
        long var2 = class130.method935(false);
        field4448++;
        if (arg0 != 32000) {
            this.field4438 = true;
        }
        long var4 = class203.field3343[class100.field1718];
        class203.field3343[class100.field1718] = var2;
        class100.field1718 = class100.field1718 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class16.field189 = ((var6 >> 1) + 32000) / var6;
        }
        if (class93.field1569++ > 50) {
            class67.field1070 = true;
            class93.field1569 -= 50;
            class214.field3526.setSize(class273.field4567, class266.field4484);
            class214.field3526.setVisible(true);
            if (class160.field2590 != null && class325.field5569 == null) {
                Insets var7 = class160.field2590.getInsets();
                class214.field3526.setLocation(class253.field4224 + var7.left, class324.field5540 + var7.top);
            } else {
                class214.field3526.setLocation(class253.field4224, class324.field5540);
            }
        }
        this.method1854(500);
    }

    @OriginalMember(owner = "client!bh", name = "destroy", descriptor = "()V", line = 709)
    public final void destroy() {
        field4464++;
        if (class124.field2085 == this && !class120.field2014) {
            class180.field2947 = class130.method935(false);
            class288.method1976((byte) 41, 5000L);
            class332.field5646 = null;
            this.method1844(false, true);
        }
    }

    @OriginalMember(owner = "client!bh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 726)
    public final void windowDeiconified(WindowEvent arg0) {
        field4466++;
    }

    @OriginalMember(owner = "client!bh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 733)
    public final AppletContext getAppletContext() {
        field4465++;
        if (class160.field2590 == null) {
            return class249.field4143 == null || class249.field4143.field1561 == this ? super.getAppletContext() : class249.field4143.field1561.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V", line = 750)
    private final void method1857(byte arg0) {
        long var2 = class130.method935(false);
        field4454++;
        long var4 = class24.field313[class312.field5252];
        if (arg0 < 100) {
            providesignlink((class92) null);
        }
        if (var4 != 0L && var4 >= var2) {
        }
        class24.field313[class312.field5252] = var2;
        class312.field5252 = class312.field5252 + 1 & 0x1F;
        synchronized (this) {
            class293.field4783 = class143.field2323;
        }
        this.method1849(true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public abstract void method1845(int arg0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public abstract void method1849(boolean arg0);

    @OriginalMember(owner = "client!bh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
    public abstract void method1852(byte arg0);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public abstract void method1854(int arg0);

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public abstract void method1856(int arg0);
}
