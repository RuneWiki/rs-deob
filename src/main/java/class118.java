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

@OriginalClass("client!m")
public abstract class class118 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Z")
    private boolean field1685 = false;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    private static int field1696 = 500;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Lwa;")
    public static class265 field1693 = new class265(0, 0);

    @OriginalMember(owner = "client!m", name = "I", descriptor = "[I")
    public static int[] field1711 = new int[14];

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Z")
    public static boolean field1715;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "[I")
    public static int[] field1706;

    @OriginalMember(owner = "client!m", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1681++;
    }

    @OriginalMember(owner = "client!m", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1686++;
        if (class85.field1240 == null) {
            return class138.field2241 == null || class138.field2241.field63 == this ? super.getParameter(arg0) : class138.field2241.field63.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1704++;
        if (class85.field1240 == null) {
            return class138.field2241 == null || class138.field2241.field63 == this ? super.getAppletContext() : class138.field2241.field63.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1689++;
        if (class85.field1240 == null) {
            return class138.field2241 == null || class138.field2241.field63 == this ? super.getCodeBase() : class138.field2241.field63.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBZILjava/lang/String;II)V")
    public final void method853(int arg0, int arg1, byte arg2, boolean arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class23.field265 = arg6;
            class80.field1168 = arg6;
            class178.field2886 = 0;
            class58.field824 = arg0;
            if (arg2 < 109) {
                field1711 = null;
            }
            class61.field853 = 0;
            class154.field2543 = arg1;
            class164.field2670 = arg1;
            class231.field3721 = this;
            class85.field1240 = new Frame();
            class85.field1240.setTitle("Jagex");
            class85.field1240.setResizable(true);
            class85.field1240.addWindowListener(this);
            class85.field1240.setVisible(true);
            class85.field1240.toFront();
            Insets var9 = class85.field1240.getInsets();
            class85.field1240.setSize(var9.right + var9.left + class80.field1168, class164.field2670 - -var9.bottom + var9.top);
            class193.field3101 = class138.field2241 = new class7((Applet) null, arg4, arg5, arg7);
            class278 var10 = class138.field2241.method53(1, this, -55);
            while (var10.field4450 == 0) {
                class43.method324(10L, 50);
            }
        } catch (Exception var12) {
            class191.method1422(var12, (String) null, (byte) 105);
        }
        field1683++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method854(String arg0, byte arg1) {
        field1713++;
        if (arg1 != 0 || this.field1685) {
            return;
        }
        this.field1685 = true;
        System.out.println("error_game_" + arg0);
        try {
            class54.method405((byte) 81, class138.field2241.field63, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!m", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1695++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public final synchronized void method855(int arg0) {
        if (class10.field89 != null) {
            class10.field89.removeFocusListener(this);
            class10.field89.getParent().remove(class10.field89);
        }
        if (arg0 != -32586) {
            providesignlink((class7) null);
        }
        field1712++;
        Container var2;
        if (class175.field2847 != null) {
            var2 = class175.field2847;
        } else if (class85.field1240 == null) {
            var2 = class138.field2241.field63;
        } else {
            var2 = class85.field1240;
        }
        var2.setLayout((LayoutManager) null);
        class10.field89 = new class85(this);
        var2.add(class10.field89);
        class10.field89.setSize(class23.field265, class154.field2543);
        class10.field89.setVisible(true);
        if (class85.field1240 == var2) {
            Insets var3 = class85.field1240.getInsets();
            class10.field89.setLocation(class61.field853 + var3.left, var3.top - -class178.field2886);
        } else {
            class10.field89.setLocation(class61.field853, class178.field2886);
        }
        class10.field89.addFocusListener(this);
        class10.field89.requestFocus();
        class152.field2464 = true;
        class125.field1822 = true;
        class208.field3341 = true;
        class29.field348 = false;
        class151.field2455 = class197.method1454((byte) -104);
    }

    @OriginalMember(owner = "client!m", name = "stop", descriptor = "()V")
    public final void stop() {
        field1690++;
        if (class231.field3721 == this && !class254.field4199) {
            class71.field1041 = class197.method1454((byte) -104) + 4000L;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public abstract void method856(int arg0);

    @OriginalMember(owner = "client!m", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1705++;
    }

    @OriginalMember(owner = "client!m", name = "providesignlink", descriptor = "(Lbh;)V")
    public static final void providesignlink(class7 arg0) {
        class138.field2241 = arg0;
        class193.field3101 = arg0;
        field1678++;
    }

    @OriginalMember(owner = "client!m", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1709++;
    }

    @OriginalMember(owner = "client!m", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1708++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public abstract void method857(byte arg0);

    @OriginalMember(owner = "client!m", name = "start", descriptor = "()V")
    public final void start() {
        field1679++;
        if (class231.field3721 == this && !class254.field4199) {
            class71.field1041 = 0L;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public static void method858(int arg0) {
        if (arg0 < 28) {
            method868(false);
        }
        field1706 = null;
        field1693 = null;
        field1711 = null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
    public abstract void method859(byte arg0);

    @OriginalMember(owner = "client!m", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1680++;
        if (class231.field3721 != this || class254.field4199) {
            return;
        }
        class208.field3341 = true;
        if (class6.field53 && (class197.method1454((byte) -104) - class151.field2455) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class80.field1168 <= var2.width && var2.height >= class164.field2670) {
                class29.field348 = true;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1677++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Llc;Llc;Llc;Llc;I)V")
    public static final void method860(class86 arg0, class86 arg1, class86 arg2, class86 arg3, int arg4) {
        if (arg4 >= -16) {
            return;
        }
        class135.field2207 = arg3;
        class10.field110 = arg1;
        field1701++;
        class186.field2996 = arg2;
        class169.field2729 = arg0;
        class113.field1631 = new class131[class10.field110.method631(-106)][];
        class90.field1339 = new boolean[class10.field110.method631(-127)];
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)Z")
    public final boolean method861(int arg0) {
        if (arg0 != 26445) {
            this.windowDeiconified((WindowEvent) null);
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1710++;
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
                this.method854("invalidhost", (byte) 0);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    private final void method862(boolean arg0) {
        field1688++;
        if (!arg0) {
            return;
        }
        long var2 = class197.method1454((byte) -104);
        long var4 = class83.field1199[class208.field3346];
        class83.field1199[class208.field3346] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class275.field4417 = ((var6 >> 1) + 32000) / var6;
        }
        class208.field3346 = class208.field3346 + 1 & 0x1F;
        if ((field1696++) > 50) {
            field1696 -= 50;
            class208.field3341 = true;
            class10.field89.setSize(class23.field265, class154.field2543);
            class10.field89.setVisible(true);
            if (class85.field1240 != null && class175.field2847 == null) {
                Insets var7 = class85.field1240.getInsets();
                class10.field89.setLocation(class61.field853 + var7.left, class178.field2886 + var7.top);
            } else {
                class10.field89.setLocation(class61.field853, class178.field2886);
            }
        }
        this.method856(4);
    }

    @OriginalMember(owner = "client!m", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class152.field2464 = true;
        class208.field3341 = true;
        field1694++;
    }

    @OriginalMember(owner = "client!m", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!m", name = "run", descriptor = "()V")
    public final void run() {
        field1703++;
        try {
            if (class7.field67 != null) {
                String var1 = class7.field67.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class7.field68;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method854("wrongjava", (byte) 0);
                        return;
                    }
                    class289.field4584 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class7.field68 == null || class7.field68.equals("1.4.2"))) {
                    this.method854("wrongjava", (byte) 0);
                    return;
                }
            }
            if (class7.field68 != null && class7.field68.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class7.field68.length()) {
                    char var5 = class7.field68.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class6.field53 = true;
                }
            }
            if (class138.field2241.field63 != null) {
                Method var6 = class7.field78;
                if (var6 != null) {
                    try {
                        var6.invoke(class138.field2241.field63, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class124.method898((byte) 119);
            this.method855(-32586);
            class29.field367 = class268.method1860(class154.field2543, class23.field265, 100, class10.field89);
            this.method863((byte) -94);
            class85.field1236 = class77.method555(17);
            while (class71.field1041 == 0L || class197.method1454((byte) -104) < class71.field1041) {
                class235.field3797 = class85.field1236.method915(class289.field4584, class101.field1490, 1);
                for (int var7 = 0; var7 < class235.field3797; var7++) {
                    this.method869((byte) -40);
                }
                this.method862(true);
                class162.method1207((byte) 63, class10.field89, class138.field2241);
            }
        } catch (Exception var10) {
            class191.method1422(var10, (String) null, (byte) -90);
            this.method854("crash", (byte) 0);
        }
        this.method866(true, 0);
    }

    @OriginalMember(owner = "client!m", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1684++;
        if (class85.field1240 == null) {
            return class138.field2241 == null || class138.field2241.field63 == this ? super.getDocumentBase() : class138.field2241.field63.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
    public abstract void method863(byte arg0);

    @OriginalMember(owner = "client!m", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1687++;
        class152.field2464 = false;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZZ)V")
    public static final void method864(boolean arg0, boolean arg1) {
        if (arg0) {
            return;
        }
        for (class23 var2 = (class23) class297.field4694.method1384(2); var2 != null; var2 = (class23) class297.field4694.method1388((byte) 127)) {
            if (var2.field251 != null) {
                class73.field1057.method795(var2.field251);
                var2.field251 = null;
            }
            if (var2.field261 != null) {
                class73.field1057.method795(var2.field261);
                var2.field261 = null;
            }
            var2.method1922(-1);
        }
        field1692++;
        if (!arg1) {
            return;
        }
        for (class23 var3 = (class23) class178.field2877.method1384(2); var3 != null; var3 = (class23) class178.field2877.method1388((byte) 94)) {
            if (var3.field251 != null) {
                class73.field1057.method795(var3.field251);
                var3.field251 = null;
            }
            var3.method1922(-1);
        }
        for (class23 var4 = (class23) class288.field4566.method1033(-9843); var4 != null; var4 = (class23) class288.field4566.method1031((byte) -7)) {
            if (var4.field251 != null) {
                class73.field1057.method795(var4.field251);
                var4.field251 = null;
            }
            var4.method1922(-1);
        }
    }

    @OriginalMember(owner = "client!m", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1697++;
    }

    @OriginalMember(owner = "client!m", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1691++;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public abstract void method865(byte arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V")
    private final void method866(boolean arg0, int arg1) {
        field1702++;
        synchronized (this) {
            if (class254.field4199) {
                return;
            }
            if (arg1 != 0) {
                return;
            }
            class254.field4199 = true;
        }
        if (class138.field2241.field63 != null) {
            class138.field2241.field63.destroy();
        }
        try {
            this.method859((byte) -121);
        } catch (Exception var11) {
        }
        if (class10.field89 != null) {
            try {
                class10.field89.removeFocusListener(this);
                class10.field89.getParent().remove(class10.field89);
            } catch (Exception var10) {
            }
        }
        if (class138.field2241 != null) {
            try {
                class138.field2241.method46(18);
            } catch (Exception var9) {
            }
        }
        this.method865((byte) 123);
        if (class85.field1240 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!m", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1698++;
        if (class231.field3721 == this && !class254.field4199) {
            class71.field1041 = class197.method1454((byte) -104);
            class43.method324(5000L, 71);
            class193.field3101 = null;
            this.method866(false, 0);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
    public final void method867(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1700++;
        try {
            if (class231.field3721 == null) {
                class23.field265 = arg0;
                class80.field1168 = arg0;
                class154.field2543 = arg2;
                class164.field2670 = arg2;
                class178.field2886 = 0;
                class58.field824 = arg1;
                class231.field3721 = this;
                class61.field853 = 0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class138.field2241 == null) {
                    class193.field3101 = class138.field2241 = new class7(this, arg4, (String) null, 0);
                }
                if (arg3 >= -28) {
                    this.method863((byte) -99);
                }
                class278 var7 = class138.field2241.method53(1, this, 123);
                while (var7.field4450 == 0) {
                    class43.method324(10L, -97);
                }
            } else {
                class115.field1665++;
                if (class115.field1665 >= 3) {
                    this.method854("alreadyloaded", (byte) 0);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class191.method1422(var9, (String) null, (byte) -52);
            this.method854("crash", (byte) 0);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public static final void method868(boolean arg0) {
        if (arg0) {
            method858(12);
        }
        field1682++;
        class81.field1171.method1556((byte) 126);
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
    private final void method869(byte arg0) {
        field1699++;
        long var2 = class91.field1356[class83.field1196];
        long var4 = class197.method1454((byte) -104);
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class91.field1356[class83.field1196] = var4;
        class83.field1196 = class83.field1196 + 1 & 0x1F;
        synchronized (this) {
            class125.field1822 = class152.field2464;
            if (arg0 != -40) {
                field1711 = null;
            }
        }
        this.method857((byte) 70);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIIII)V")
    public static final void method870(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            method868(true);
        }
        for (class23 var5 = (class23) class297.field4694.method1384(2); var5 != null; var5 = (class23) class297.field4694.method1388((byte) 80)) {
            class217.method1562(-1, arg1, arg2, arg4, arg3, var5);
        }
        for (class23 var6 = (class23) class178.field2877.method1384(2); var6 != null; var6 = (class23) class178.field2877.method1388((byte) 75)) {
            byte var11 = 1;
            class235 var12 = var6.field253.method917((byte) 122);
            if (var6.field253.field1966 == var12.field3760) {
                var11 = 0;
            } else if (var6.field253.field1966 == var12.field3783 || var6.field253.field1966 == var12.field3785 || var6.field253.field1966 == var12.field3793 || var6.field253.field1966 == var12.field3789) {
                var11 = 2;
            } else if (var6.field253.field1966 == var12.field3759 || var6.field253.field1966 == var12.field3767 || var6.field253.field1966 == var12.field3774 || var6.field253.field1966 == var12.field3770) {
                var11 = 3;
            }
            if (var6.field262 != var11) {
                int var13 = class287.method1954(var6.field253, -1);
                if (var6.field249 != var13) {
                    if (var6.field251 != null) {
                        class73.field1057.method795(var6.field251);
                        var6.field251 = null;
                    }
                    var6.field249 = var13;
                }
                var6.field262 = var11;
            }
            var6.field248 = var6.field253.field1979;
            var6.field247 = var6.field253.field1979 + var6.field253.method205(88) * 64;
            var6.field252 = var6.field253.field1910;
            var6.field266 = var6.field253.field1910 + (var6.field253.method205(-64) * 64);
            class217.method1562(-1, arg1, arg2, arg4, arg3, var6);
        }
        field1707++;
        for (class23 var7 = (class23) class288.field4566.method1033(-9843); var7 != null; var7 = (class23) class288.field4566.method1031((byte) -7)) {
            class235 var8 = var7.field270.method917((byte) 118);
            byte var9 = 1;
            if (var7.field270.field1966 == var8.field3760) {
                var9 = 0;
            } else if (var7.field270.field1966 == var8.field3783 || var7.field270.field1966 == var8.field3785 || var7.field270.field1966 == var8.field3793 || var7.field270.field1966 == var8.field3789) {
                var9 = 2;
            } else if (var7.field270.field1966 == var8.field3759 || var7.field270.field1966 == var8.field3767 || var7.field270.field1966 == var8.field3774 || var7.field270.field1966 == var8.field3770) {
                var9 = 3;
            }
            if (var7.field262 != var9) {
                int var10 = class122.method889((byte) -34, var7.field270);
                if (var7.field249 != var10) {
                    if (var7.field251 != null) {
                        class73.field1057.method795(var7.field251);
                        var7.field251 = null;
                    }
                    var7.field249 = var10;
                }
                var7.field262 = var9;
            }
            var7.field248 = var7.field270.field1979;
            var7.field247 = var7.field270.field1979 + var7.field270.method205(-92) * 64;
            var7.field252 = var7.field270.field1910;
            var7.field266 = var7.field270.field1910 + var7.field270.method205(-122) * 64;
            class217.method1562(-1, arg1, arg2, arg4, arg3, var7);
        }
    }
}
