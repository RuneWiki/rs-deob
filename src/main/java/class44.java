import jagex3.jagmisc.jagmisc;
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

@OriginalClass("client!q")
public abstract class class44 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Z")
    private boolean field678 = false;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "Z")
    private boolean field692 = false;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Ljava/lang/String;")
    public static String field675 = "Loading sprites - ";

    @OriginalMember(owner = "client!q", name = "C", descriptor = "Ljava/lang/String;")
    public static String field689 = "Connecting to update server";

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Laj;")
    public static class151 field681;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Z")
    public static boolean field699;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method260(boolean arg0, String arg1, byte arg2) {
        field679++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class169.field2732.method1223(arg1, 250);
        int var7 = class169.field2732.method1216(arg1, 250) * 13;
        class211.method1483(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 - -var3, 0);
        class211.method1477(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, 16777215);
        if (arg2 < 8) {
            field681 = null;
        }
        class169.field2732.method1214(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class244.method1748(var3 + var7 + var3, (byte) -93, var3 + var6 + var3, -var3 + var5, var4 - var3);
        if (!arg0) {
            class158.method1183(var4, -108, var7, var5, var6);
            return;
        }
        try {
            Graphics var8 = class5.field125.getGraphics();
            class7.field152.method1004(-6187, 0, 0, var8);
        } catch (Exception var9) {
            class5.field125.repaint();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public abstract void method261(int arg0);

    @OriginalMember(owner = "client!q", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field695++;
        if (class64.field1086 == null) {
            return class142.field2344 == null || class142.field2344.field1380 == this ? super.getDocumentBase() : class142.field2344.field1380.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)Z")
    public final boolean method262(int arg0) {
        field684++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = 0 / ((arg0 - 3) / 36);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method266(250, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "stop", descriptor = "()V")
    public final void stop() {
        field668++;
        if (class154.field2556 == this && !class314.field5065) {
            class163.field2657 = class188.method1355(-66) + 4000L;
        }
    }

    @OriginalMember(owner = "client!q", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field662++;
        class253.field4283 = false;
    }

    @OriginalMember(owner = "client!q", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field682++;
        if (class64.field1086 == null) {
            return class142.field2344 == null || class142.field2344.field1380 == this ? super.getParameter(arg0) : class142.field2344.field1380.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!q", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field685++;
    }

    @OriginalMember(owner = "client!q", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field676++;
    }

    @OriginalMember(owner = "client!q", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field674++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public final void method263(byte arg0) {
        field687++;
        if (!this.field692) {
            try {
                class191 var2 = class142.field2344.method574((byte) 19, class154.field2556.getClass());
                while (var2.field3091 == 0) {
                    class28.method182(100L, true);
                }
                if (var2.field3089 != null) {
                    throw (Throwable) var2.field3089;
                }
                jagmisc.init();
                this.field692 = true;
                class137.field2255 = class63.method432(0);
            } catch (Throwable var3) {
            }
        }
        if (arg0 <= 19) {
            this.method266(114, (String) null);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    private final void method264(byte arg0) {
        int var2 = -125 % ((arg0 - 60) / 62);
        field677++;
        long var3 = class188.method1355(97);
        long var5 = class45.field705[class207.field3350];
        class45.field705[class207.field3350] = var3;
        if (var5 != 0L && var3 > var5) {
            int var7 = (int) (var3 - var5);
            class306.field4957 = ((var7 >> 1) + 32000) / var7;
        }
        class207.field3350 = class207.field3350 + 1 & 0x1F;
        if ((class67.field1118++) > 50) {
            class67.field1118 -= 50;
            class101.field1603 = true;
            class5.field125.setSize(class155.field2567, class182.field2901);
            class5.field125.setVisible(true);
            if (class64.field1086 != null && class218.field3682 == null) {
                Insets var8 = class64.field1086.getInsets();
                class5.field125.setLocation(class49.field838 + var8.left, class171.field2775 + var8.top);
            } else {
                class5.field125.setLocation(class49.field838, class171.field2775);
            }
        }
        this.method268((byte) -127);
    }

    @OriginalMember(owner = "client!q", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!q", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field671++;
    }

    @OriginalMember(owner = "client!q", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field683++;
        if (class64.field1086 == null) {
            return class142.field2344 == null || class142.field2344.field1380 == this ? super.getCodeBase() : class142.field2344.field1380.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!q", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field667++;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    private final void method265(int arg0) {
        field690++;
        long var2 = class158.field2589[class116.field1979];
        long var4 = class188.method1355(arg0 - 23686);
        if (arg0 != 23616) {
            return;
        }
        class158.field2589[class116.field1979] = var4;
        class116.field1979 = class116.field1979 + 1 & 0x1F;
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class195.field3153 = class253.field4283;
        }
        this.method273(arg0 - 23616);
    }

    @OriginalMember(owner = "client!q", name = "run", descriptor = "()V")
    public final void run() {
        field669++;
        try {
            if (class83.field1375 != null) {
                String var1 = class83.field1375.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class83.field1368;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method266(250, "wrongjava");
                        return;
                    }
                    class283.field4689 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class83.field1368 == null || class83.field1368.equals("1.4.2"))) {
                    this.method266(250, "wrongjava");
                    return;
                }
            }
            if (class83.field1368 != null && class83.field1368.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class83.field1368.length()) {
                    char var5 = class83.field1368.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
                if (var4 >= 5) {
                    class11.field196 = true;
                }
            }
            if (class142.field2344.field1380 != null) {
                Method var6 = class83.field1382;
                if (var6 != null) {
                    try {
                        var6.invoke(class142.field2344.field1380, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class284.method1983(-101);
            this.method272(23017);
            class7.field152 = class119.method896(class155.field2567, (byte) 121, class182.field2901, class5.field125);
            this.method274((byte) -123);
            class137.field2255 = class63.method432(0);
            this.method263((byte) 49);
            while (class163.field2657 == 0L || class188.method1355(-93) < class163.field2657) {
                class174.field2797 = class137.field2255.method420(class283.field4689, 0, class147.field2421);
                for (int var7 = 0; var7 < class174.field2797; var7++) {
                    this.method265(23616);
                }
                this.method264((byte) -78);
                class180.method1310(class5.field125, class142.field2344, 29616);
            }
        } catch (Exception var10) {
            class84.method595(14117, (String) null, var10);
            this.method266(250, "crash");
        }
        this.method271(true, (byte) 25);
    }

    @OriginalMember(owner = "client!q", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field663++;
        if (class154.field2556 == this && !class314.field5065) {
            class163.field2657 = class188.method1355(-90);
            class28.method182(5000L, true);
            class159.field2595 = null;
            this.method271(false, (byte) 25);
        }
    }

    @OriginalMember(owner = "client!q", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field688++;
        if (class154.field2556 != this || class314.field5065) {
            return;
        }
        class101.field1603 = true;
        if (class11.field196 && class188.method1355(-125) - class219.field3697 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class61.field1051 <= var2.width && class145.field2390 <= var2.height) {
                class217.field3669 = true;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method266(int arg0, String arg1) {
        field696++;
        if (this.field678) {
            return;
        }
        this.field678 = true;
        System.out.println("error_game_" + arg1);
        try {
            class288.method2005(class142.field2344.field1380, (byte) 100, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            if (arg0 != 250) {
                field675 = null;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIBI)V")
    public final void method267(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field680++;
        try {
            if (class154.field2556 == null) {
                if (arg3 < 13) {
                    this.focusGained((FocusEvent) null);
                }
                class171.field2775 = 0;
                class155.field2567 = arg4;
                class61.field1051 = arg4;
                class182.field2901 = arg1;
                class145.field2390 = arg1;
                class49.field838 = 0;
                class30.field498 = arg0;
                class154.field2556 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class142.field2344 == null) {
                    class159.field2595 = class142.field2344 = new class83(this, arg2, (String) null, 0);
                }
                class191 var7 = class142.field2344.method583((byte) -53, this, 1);
                while (var7.field3091 == 0) {
                    class28.method182(10L, true);
                }
            } else {
                class105.field1732++;
                if (class105.field1732 >= 3) {
                    this.method266(250, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class84.method595(14117, (String) null, var9);
            this.method266(250, "crash");
        }
    }

    @OriginalMember(owner = "client!q", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field670++;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
    public abstract void method268(byte arg0);

    @OriginalMember(owner = "client!q", name = "start", descriptor = "()V")
    public final void start() {
        field691++;
        if (class154.field2556 == this && !class314.field5065) {
            class163.field2657 = 0L;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static void method269(boolean arg0) {
        if (!arg0) {
            field675 = null;
        }
        field675 = null;
        field689 = null;
        field681 = null;
    }

    @OriginalMember(owner = "client!q", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field665++;
    }

    @OriginalMember(owner = "client!q", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field666++;
        class253.field4283 = true;
        class101.field1603 = true;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILjava/lang/String;ZII)V")
    public final void method270(int arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, int arg6, int arg7) {
        field694++;
        try {
            if (arg2 != 10) {
                this.method266(90, (String) null);
            }
            class49.field838 = 0;
            class30.field498 = arg7;
            class182.field2901 = arg3;
            class145.field2390 = arg3;
            class171.field2775 = 0;
            class155.field2567 = arg1;
            class61.field1051 = arg1;
            class154.field2556 = this;
            class64.field1086 = new Frame();
            class64.field1086.setTitle("Jagex");
            class64.field1086.setResizable(true);
            class64.field1086.addWindowListener(this);
            class64.field1086.setVisible(true);
            class64.field1086.toFront();
            Insets var9 = class64.field1086.getInsets();
            class64.field1086.setSize(class61.field1051 + var9.right + var9.left, class145.field2390 + var9.top - -var9.bottom);
            class159.field2595 = class142.field2344 = new class83((Applet) null, arg6, arg4, arg0);
            class191 var10 = class142.field2344.method583((byte) 109, this, 1);
            while (var10.field3091 == 0) {
                class28.method182(10L, true);
            }
        } catch (Exception var12) {
            class84.method595(arg2 ^ 0x372F, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZB)V")
    private final void method271(boolean arg0, byte arg1) {
        field672++;
        if (arg1 != 25) {
            return;
        }
        synchronized (this) {
            if (class314.field5065) {
                return;
            }
            class314.field5065 = true;
        }
        if (class142.field2344.field1380 != null) {
            class142.field2344.field1380.destroy();
        }
        try {
            this.method275(arg1 - 27);
        } catch (Exception var10) {
        }
        if (this.field692) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field692 = false;
        }
        class142.field2344.method577(class154.field2556.getClass(), (byte) 87);
        if (class5.field125 != null) {
            try {
                class5.field125.removeFocusListener(this);
                class5.field125.getParent().remove(class5.field125);
            } catch (Exception var8) {
            }
        }
        if (class142.field2344 != null) {
            try {
                class142.field2344.method581(arg1 - 153);
            } catch (Exception var7) {
            }
        }
        this.method261(-107);
        if (class64.field1086 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
    public final synchronized void method272(int arg0) {
        if (arg0 != 23017) {
            return;
        }
        if (class5.field125 != null) {
            class5.field125.removeFocusListener(this);
            class5.field125.getParent().remove(class5.field125);
        }
        Container var2;
        if (class218.field3682 != null) {
            var2 = class218.field3682;
        } else if (class64.field1086 == null) {
            var2 = class142.field2344.field1380;
        } else {
            var2 = class64.field1086;
        }
        var2.setLayout((LayoutManager) null);
        class5.field125 = new class289(this);
        var2.add(class5.field125);
        class5.field125.setSize(class155.field2567, class182.field2901);
        class5.field125.setVisible(true);
        field686++;
        if (class64.field1086 == var2) {
            Insets var3 = class64.field1086.getInsets();
            class5.field125.setLocation(class49.field838 + var3.left, class171.field2775 + var3.top);
        } else {
            class5.field125.setLocation(class49.field838, class171.field2775);
        }
        class5.field125.addFocusListener(this);
        class5.field125.requestFocus();
        class253.field4283 = true;
        class101.field1603 = true;
        class195.field3153 = true;
        class217.field3669 = false;
        class219.field3697 = class188.method1355(108);
    }

    @OriginalMember(owner = "client!q", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field673++;
        this.destroy();
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V")
    public abstract void method273(int arg0);

    @OriginalMember(owner = "client!q", name = "providesignlink", descriptor = "(Lci;)V")
    public static final void providesignlink(class83 arg0) {
        class142.field2344 = arg0;
        class159.field2595 = arg0;
        field664++;
    }

    @OriginalMember(owner = "client!q", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field693++;
        if (class64.field1086 == null) {
            return class142.field2344 == null || class142.field2344.field1380 == this ? super.getAppletContext() : class142.field2344.field1380.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
    public abstract void method274(byte arg0);

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
    public abstract void method275(int arg0);
}
