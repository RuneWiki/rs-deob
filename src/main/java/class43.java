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

@OriginalClass("client!dd")
public abstract class class43 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Z")
    private boolean field494 = false;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "[Lnb;")
    public static class208[] field508 = new class208[50];

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field516 = 20;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lkm;")
    public static class133 field499;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZIIIILjava/lang/String;I)V", line = 9)
    public final void method261(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field513++;
        try {
            class96.field1293 = this;
            if (arg7 != -1) {
                return;
            }
            class113.field1550 = 0;
            class64.field836 = arg3;
            class223.field3203 = arg3;
            class187.field2592 = arg2;
            class226.field3237 = arg2;
            class161.field2217 = arg5;
            class169.field2294 = 0;
            class138.field1898 = new Frame();
            class138.field1898.setTitle("Jagex");
            class138.field1898.setResizable(true);
            class138.field1898.addWindowListener(this);
            class138.field1898.setVisible(true);
            class138.field1898.toFront();
            Insets var9 = class138.field1898.getInsets();
            class138.field1898.setSize(var9.right + var9.left + class226.field3237, var9.top + var9.bottom + class223.field3203);
            class92.field1279 = class165.field2258 = new class80((Applet) null, arg4, arg6, arg0);
            class285 var10 = class165.field2258.method612(this, -17, 1);
            while (var10.field4241 == 0) {
                class186.method1304(10, 10L);
            }
            class117.field1594 = (Thread) var10.field4244;
        } catch (Exception var12) {
            class187.method1307((String) null, var12, 122);
        }
    }

    @OriginalMember(owner = "client!dd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 59)
    public final void windowDeactivated(WindowEvent arg0) {
        field497++;
    }

    @OriginalMember(owner = "client!dd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 69)
    public final void windowActivated(WindowEvent arg0) {
        field520++;
    }

    @OriginalMember(owner = "client!dd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 78)
    public final synchronized void paint(Graphics arg0) {
        field510++;
        if (class96.field1293 != this || class194.field2683) {
            return;
        }
        class276.field4134 = true;
        if (class230.field3256 && !class67.field908 && class29.method174(27763) - class96.field1307 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class226.field3237 <= var2.width && var2.height >= class223.field3203) {
                class340.field5112 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 104)
    public final void method265(String arg0, int arg1) {
        field504++;
        if (this.field494) {
            return;
        }
        this.field494 = true;
        System.out.println("error_game_" + arg0);
        int var3 = -11 % ((-arg1 - 26) / 53);
        try {
            class325.method2277(-21230, class165.field2258.field1157, "loggedout");
        } catch (Throwable var7) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 130)
    public static void method266(byte arg0) {
        field499 = null;
        field508 = null;
        int var1 = 24 / ((arg0 + 25) / 55);
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 140)
    public static final void method267(int arg0) {
        field518++;
        try {
            int var1 = 86 / ((-arg0 - 88) / 38);
            if (class278.field4179 == 1) {
                int var2 = class141.field1927.method585((byte) 63);
                if (var2 > 0 && class141.field1927.method566(103)) {
                    int var3 = var2 - class119.field1618;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class141.field1927.method598(var3, -21801);
                    return;
                }
                class141.field1927.method573((byte) -74);
                class141.field1927.method596(-24746);
                class85.field1216 = null;
                if (class100.field1383 == null) {
                    class278.field4179 = 0;
                } else {
                    class278.field4179 = 2;
                }
                class274.field4105 = null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class141.field1927.method573((byte) -90);
            class100.field1383 = null;
            class278.field4179 = 0;
            class274.field4105 = null;
            class85.field1216 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 186)
    public final URL getDocumentBase() {
        field498++;
        if (class138.field1898 == null) {
            return class165.field2258 == null || class165.field2258.field1157 == this ? super.getDocumentBase() : class165.field2258.field1157.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "stop", descriptor = "()V", line = 203)
    public final void stop() {
        field493++;
        if (class96.field1293 == this && !class194.field2683) {
            class8.field73 = class29.method174(27763) + 4000L;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)I", line = 216)
    public static final int method268(byte arg0, int arg1, int arg2) {
        if (arg0 <= 74) {
            return 68;
        } else {
            int var3 = arg2 >>> 31;
            field519++;
            return (arg2 + var3) / arg1 - var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 232)
    public final void update(Graphics arg0) {
        field507++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V", line = 240)
    public final void method270(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field487++;
        try {
            if (class96.field1293 != null) {
                class247.field3562++;
                if (class247.field3562 >= 3) {
                    this.method265("alreadyloaded", -105);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            if (arg0 != 5183) {
                field502 = -67;
            }
            class169.field2294 = 0;
            class64.field836 = arg2;
            class223.field3203 = arg2;
            class161.field2217 = arg1;
            class187.field2592 = arg4;
            class226.field3237 = arg4;
            class113.field1550 = 0;
            class96.field1293 = this;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class179.field2405 = true;
            } else {
                class179.field2405 = false;
            }
            if (class165.field2258 == null) {
                class92.field1279 = class165.field2258 = new class80(this, arg3, (String) null, 0);
            }
            class285 var7 = class165.field2258.method612(this, arg0 - 5094, 1);
            while (var7.field4241 == 0) {
                class186.method1304(arg0 ^ 0x1435, 10L);
            }
            class117.field1594 = (Thread) var7.field4244;
        } catch (Exception var9) {
            class187.method1307((String) null, var9, -88);
            this.method265("crash", arg0 ^ 0x1462);
        }
    }

    @OriginalMember(owner = "client!dd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 298)
    public final void windowOpened(WindowEvent arg0) {
        field503++;
    }

    @OriginalMember(owner = "client!dd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 305)
    public final void windowClosed(WindowEvent arg0) {
        field509++;
    }

    @OriginalMember(owner = "client!dd", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 313)
    public final URL getCodeBase() {
        field488++;
        if (class138.field1898 == null) {
            return class165.field2258 == null || class165.field2258.field1157 == this ? super.getCodeBase() : class165.field2258.field1157.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "destroy", descriptor = "()V", line = 328)
    public final void destroy() {
        field522++;
        if (class96.field1293 == this && !class194.field2683) {
            class8.field73 = class29.method174(27763);
            class186.method1304(10, 5000L);
            class92.field1279 = null;
            this.method274(false, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!dd", name = "run", descriptor = "()V", line = 342)
    public final void run() {
        field521++;
        try {
            if (class80.field1149 != null) {
                String var1 = class80.field1149.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class80.field1161;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method265("wrongjava", -119);
                        return;
                    }
                    class168.field2291 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class80.field1161 == null || class80.field1161.equals("1.4.2"))) {
                    this.method265("wrongjava", 60);
                    return;
                }
            }
            if (class80.field1161 != null && class80.field1161.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (var4 < class80.field1161.length()) {
                    char var5 = class80.field1161.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = -(-var5 - var3 * 10) - 48;
                }
                if (var3 >= 5) {
                    class230.field3256 = true;
                }
            }
            if (class165.field2258.field1157 != null) {
                Method var6 = class80.field1166;
                if (var6 != null) {
                    try {
                        var6.invoke(class165.field2258.field1157, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            method272(false);
            this.method278(2);
            class272.field4079 = class202.method1434(class150.field2079, class64.field836, class187.field2592, -56);
            this.method262(-46);
            class47.field580 = class296.method2016(32580);
            while (class8.field73 == 0L || class8.field73 > class29.method174(27763)) {
                class315.field4746 = class47.field580.method651(class168.field2291, field516, 26);
                for (int var8 = 0; var8 < class315.field4746; var8++) {
                    this.method273(24120);
                }
                this.method276(107);
                class342.method2360(class150.field2079, class165.field2258, 0);
            }
        } catch (Exception var11) {
            class187.method1307((String) null, var11, 118);
            this.method265("crash", -110);
        }
        this.method274(true, (byte) 49);
    }

    @OriginalMember(owner = "client!dd", name = "start", descriptor = "()V", line = 448)
    public final void start() {
        field523++;
        if (class96.field1293 == this && !class194.field2683) {
            class8.field73 = 0L;
        }
    }

    @OriginalMember(owner = "client!dd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 461)
    public final void focusGained(FocusEvent arg0) {
        field496++;
        class140.field1919 = true;
        class276.field4134 = true;
    }

    @OriginalMember(owner = "client!dd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 472)
    public final void windowDeiconified(WindowEvent arg0) {
        field505++;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)Z", line = 480)
    public final boolean method271(byte arg0) {
        field512++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 >= -99) {
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
                this.method265("invalidhost", 91);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 519)
    private static final void method272(boolean arg0) {
        field524++;
        try {
            if (arg0) {
                method267(7);
            }
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class78.field1137 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!dd", name = "providesignlink", descriptor = "(Lwa;)V", line = 546)
    public static final void providesignlink(class80 arg0) {
        class165.field2258 = arg0;
        class92.field1279 = arg0;
        field515++;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V", line = 561)
    private final void method273(int arg0) {
        field492++;
        long var2 = class134.field1855[class295.field4377];
        long var4 = class29.method174(27763);
        if (var2 != 0L && var2 < var4) {
        }
        class134.field1855[class295.field4377] = var4;
        class295.field4377 = class295.field4377 + 1 & 0x1F;
        synchronized (this) {
            class290.field4332 = class140.field1919;
        }
        if (arg0 != 24120) {
            this.method278(29);
        }
        this.method264(arg0 - 24256);
    }

    @OriginalMember(owner = "client!dd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 592)
    public final void windowIconified(WindowEvent arg0) {
        field490++;
    }

    @OriginalMember(owner = "client!dd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 600)
    public final void windowClosing(WindowEvent arg0) {
        field525++;
        this.destroy();
    }

    @OriginalMember(owner = "client!dd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 614)
    public final AppletContext getAppletContext() {
        field511++;
        if (class138.field1898 == null) {
            return class165.field2258 == null || class165.field2258.field1157 == this ? super.getAppletContext() : class165.field2258.field1157.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 629)
    public final String getParameter(String arg0) {
        field514++;
        if (class138.field1898 == null) {
            return class165.field2258 == null || class165.field2258.field1157 == this ? super.getParameter(arg0) : class165.field2258.field1157.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZB)V", line = 645)
    private final void method274(boolean arg0, byte arg1) {
        field501++;
        synchronized (this) {
            if (class194.field2683) {
                return;
            }
            class194.field2683 = true;
        }
        if (class165.field2258.field1157 != null) {
            class165.field2258.field1157.destroy();
        }
        try {
            this.method263(73);
        } catch (Exception var13) {
        }
        if (class150.field2079 != null) {
            try {
                class150.field2079.removeFocusListener(this);
                class150.field2079.getParent().remove(class150.field2079);
            } catch (Exception var12) {
            }
        }
        int var7 = 16 % ((-arg1 - 30) / 42);
        if (class165.field2258 != null) {
            try {
                class165.field2258.method629(true);
            } catch (Exception var11) {
            }
        }
        this.method275((byte) 108);
        if (class138.field1898 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V", line = 707)
    private final void method276(int arg0) {
        field506++;
        long var2 = class29.method174(27763);
        long var4 = class254.field3642[class33.field398];
        class254.field3642[class33.field398] = var2;
        class33.field398 = class33.field398 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class201.field2858 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class55.field739++) > 50) {
            class276.field4134 = true;
            class55.field739 -= 50;
            class150.field2079.setSize(class187.field2592, class64.field836);
            class150.field2079.setVisible(true);
            if (class138.field1898 != null && class329.field4964 == null) {
                Insets var7 = class138.field1898.getInsets();
                class150.field2079.setLocation(class113.field1550 + var7.left, class169.field2294 + var7.top);
            } else {
                class150.field2079.setLocation(class113.field1550, class169.field2294);
            }
        }
        int var8 = -7 % ((arg0 + 7) / 61);
        this.method269((byte) -108);
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V", line = 749)
    public static final void method277(byte arg0) {
        class207 var1 = class171.field2336;
        synchronized (class171.field2336) {
            class54.field731 = class248.field3570;
            class334.field5050++;
            if (class160.field2184 >= 0) {
                while (class307.field4598 != class160.field2184) {
                    int var2 = class338.field5082[class307.field4598];
                    class307.field4598 = class307.field4598 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class149.field2067[var2] = true;
                    } else {
                        class149.field2067[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class149.field2067[var3] = false;
                }
                class160.field2184 = class307.field4598;
            }
            class248.field3570 = class309.field4671;
        }
        if (arg0 != 35) {
            field508 = (class208[]) null;
        }
        field517++;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V", line = 794)
    public final synchronized void method278(int arg0) {
        field500++;
        if (class150.field2079 != null) {
            class150.field2079.removeFocusListener(this);
            class150.field2079.getParent().remove(class150.field2079);
        }
        Container var2;
        if (class329.field4964 != null) {
            var2 = class329.field4964;
        } else if (class138.field1898 == null) {
            var2 = class165.field2258.field1157;
        } else {
            var2 = class138.field1898;
        }
        var2.setLayout((LayoutManager) null);
        if (arg0 != 2) {
            this.windowClosed((WindowEvent) null);
        }
        class150.field2079 = new class165(this);
        var2.add(class150.field2079);
        class150.field2079.setSize(class187.field2592, class64.field836);
        class150.field2079.setVisible(true);
        if (class138.field1898 == var2) {
            Insets var3 = class138.field1898.getInsets();
            class150.field2079.setLocation(var3.left + class113.field1550, class169.field2294 + var3.top);
        } else {
            class150.field2079.setLocation(class113.field1550, class169.field2294);
        }
        class150.field2079.addFocusListener(this);
        class150.field2079.requestFocus();
        class290.field4332 = true;
        class140.field1919 = true;
        class276.field4134 = true;
        class340.field5112 = false;
        class96.field1307 = class29.method174(arg0 ^ 0x6C71);
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V", line = 844)
    public static final void method279(int arg0) {
        field489++;
        class255.method1741(class134.field1852, false);
        class42.field483++;
        if (class259.field3816 && class262.field3855) {
            int var1 = class206.field2962;
            int var2 = class134.field1852.field5355;
            int var3 = var1 - class112.field1527;
            int var4 = class282.field4220;
            if (var3 < class130.field1788) {
                var3 = class130.field1788;
            }
            if (class130.field1788 + class21.field281.field5334 < class134.field1852.field5334 + var3) {
                var3 = class130.field1788 + class21.field281.field5334 - class134.field1852.field5334;
            }
            int var5 = var4 - class172.field2346;
            int var6 = var3 - class23.field296;
            if (arg0 > -7) {
                method277((byte) 15);
            }
            if (class31.field377 > var5) {
                var5 = class31.field377;
            }
            if ((class134.field1852.field5293 + var5) > (class31.field377 + class21.field281.field5293)) {
                var5 = class31.field377 + class21.field281.field5293 - class134.field1852.field5293;
            }
            int var7 = var3 + class21.field281.field5203 - class130.field1788;
            int var8 = var5 - class262.field3842;
            int var9 = var5 - (class31.field377 - class21.field281.field5195);
            if (class42.field483 > class134.field1852.field5262 && (var6 > var2 || (-var2) > var6 || var8 > var2 || var8 < -var2)) {
                class174.field2373 = true;
            }
            if (class134.field1852.field5182 != null && class174.field2373) {
                class171 var10 = new class171();
                var10.field2344 = var7;
                var10.field2341 = class134.field1852;
                var10.field2333 = class134.field1852.field5182;
                var10.field2342 = var9;
                class314.method2145(-77, var10);
            }
            if (class337.field5067 == 0) {
                if (class174.field2373) {
                    if (class134.field1852.field5342 != null) {
                        class171 var11 = new class171();
                        var11.field2341 = class134.field1852;
                        var11.field2331 = class82.field1193;
                        var11.field2344 = var7;
                        var11.field2342 = var9;
                        var11.field2333 = class134.field1852.field5342;
                        class314.method2145(-35, var11);
                    }
                    if (class82.field1193 != null && client.method818(class134.field1852) != null) {
                        class11.field116++;
                        class90.field1264.method2238(174, (byte) -128);
                        class90.field1264.method2188(255, class134.field1852.field5206);
                        class90.field1264.method2187(class82.field1193.field5206, -1);
                        class90.field1264.method2169(true, class134.field1852.field5275);
                        class90.field1264.method2206(class82.field1193.field5275, -128);
                    }
                } else if ((class252.field3616 == 1 || class85.method664(class204.field2938 - 1, 2000)) && class204.field2938 > 2) {
                    class231.method1600((byte) -124);
                } else if (class204.field2938 > 0) {
                    class138.method1001(2);
                }
                class134.field1852 = null;
            }
        } else if (class42.field483 > 1) {
            class134.field1852 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 963)
    public final void focusLost(FocusEvent arg0) {
        field495++;
        class140.field1919 = false;
    }

    @OriginalMember(owner = "client!dd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public abstract void method262(int arg0);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public abstract void method263(int arg0);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public abstract void method264(int arg0);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public abstract void method269(byte arg0);

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
    public abstract void method275(byte arg0);
}
