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

@OriginalClass("client!ef")
public abstract class class213 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "Z")
    private boolean field3622 = false;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lda;")
    private static class275 field3598 = class255.method1672(92, "May");

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lda;")
    private static class275 field3596 = class255.method1672(121, "Jul");

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lda;")
    private static class275 field3593 = class255.method1672(107, "Feb");

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lda;")
    private static class275 field3594 = class255.method1672(120, "Aug");

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lda;")
    private static class275 field3612 = class255.method1672(109, "Nov");

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Lda;")
    private static class275 field3618 = class255.method1672(122, "Mar");

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Z")
    public static boolean field3595 = true;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field3617 = 0;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lda;")
    private static class275 field3603 = class255.method1672(116, "Apr");

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Lda;")
    private static class275 field3611 = class255.method1672(105, "Jan");

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Lda;")
    private static class275 field3634 = class255.method1672(104, "Sep");

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Lda;")
    private static class275 field3626 = class255.method1672(107, "Jun");

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lda;")
    private static class275 field3635 = class255.method1672(106, "Dec");

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Lda;")
    private static class275 field3637 = class255.method1672(92, "Oct");

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "[Lda;")
    public static class275[] field3627 = new class275[] { field3611, field3593, field3618, field3603, field3598, field3626, field3596, field3594, field3634, field3637, field3612, field3635 };

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lda;")
    public static class275 field3638 = class255.method1672(96, "");

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "Lma;")
    public static class105 field3621;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "Lwb;")
    public static class179 field3633;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Z")
    public static boolean field3642;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Z")
    public static boolean field3643;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "[[[B")
    public static byte[][][] field3640;

    @OriginalMember(owner = "client!ef", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3610++;
    }

    @OriginalMember(owner = "client!ef", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3619++;
        if (class92.field1560 != this || class224.field3782) {
            return;
        }
        class161.field2816 = true;
        if (class230.field4030 && class121.method888((byte) -119) - class32.field481 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class244.field4258 && class63.field1054 <= var2.height) {
                class114.field2025 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "stop", descriptor = "()V")
    public final void stop() {
        field3601++;
        if (class92.field1560 == this && !class224.field3782) {
            class193.field3323 = class121.method888((byte) -119) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ef", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3615++;
        if (class165.field2870 == null) {
            return class3.field24 == null || class3.field24.field970 == this ? super.getAppletContext() : class3.field24.field970.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public abstract void method634(byte arg0);

    @OriginalMember(owner = "client!ef", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3613++;
        if (class165.field2870 == null) {
            return class3.field24 == null || class3.field24.field970 == this ? super.getDocumentBase() : class3.field24.field970.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public abstract void method630(byte arg0);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1365(byte arg0, String arg1) {
        field3629++;
        if (this.field3622) {
            return;
        }
        this.field3622 = true;
        int var3 = -95 % ((arg0 - 35) / 45);
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
    public final boolean method1366(int arg0) {
        field3597++;
        if (arg0 <= 1) {
            this.init();
        }
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
                this.method1365((byte) 84, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public abstract void method643(int arg0);

    @OriginalMember(owner = "client!ef", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ef", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3605++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
    private final void method1367(boolean arg0, int arg1) {
        field3620++;
        synchronized (this) {
            if (class224.field3782) {
                return;
            }
            class224.field3782 = true;
        }
        if (class3.field24.field970 != null) {
            class3.field24.field970.destroy();
        }
        try {
            this.method643(arg1);
        } catch (Exception var9) {
        }
        if (class93.field1601 != null) {
            try {
                class93.field1601.removeFocusListener(this);
                class93.field1601.getParent().remove(class93.field1601);
            } catch (Exception var8) {
            }
        }
        if (class3.field24 != null) {
            try {
                class3.field24.method366((byte) 88);
            } catch (Exception var7) {
            }
        }
        this.method634((byte) 120);
        if (class165.field2870 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ef", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3630++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ef", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3606++;
        if (class165.field2870 == null) {
            return class3.field24 == null || class3.field24.field970 == this ? super.getParameter(arg0) : class3.field24.field970.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public abstract void method636(byte arg0);

    @OriginalMember(owner = "client!ef", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3609++;
    }

    @OriginalMember(owner = "client!ef", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3600++;
        if (class92.field1560 == this && !class224.field3782) {
            class193.field3323 = class121.method888((byte) -119);
            class250.method1640(5000L, 122);
            class46.field762 = null;
            this.method1367(false, 0);
        }
    }

    @OriginalMember(owner = "client!ef", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3614++;
        class175.field3034 = false;
    }

    @OriginalMember(owner = "client!ef", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3625++;
    }

    @OriginalMember(owner = "client!ef", name = "start", descriptor = "()V")
    public final void start() {
        field3631++;
        if (class92.field1560 == this && !class224.field3782) {
            class193.field3323 = 0L;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public static void method1368(byte arg0) {
        field3596 = null;
        field3593 = null;
        field3611 = null;
        field3637 = null;
        field3627 = null;
        if (arg0 >= -36) {
            return;
        }
        field3618 = null;
        field3635 = null;
        field3638 = null;
        field3626 = null;
        field3594 = null;
        field3612 = null;
        field3621 = null;
        field3633 = null;
        field3634 = null;
        field3640 = null;
        field3598 = null;
        field3603 = null;
    }

    @OriginalMember(owner = "client!ef", name = "run", descriptor = "()V")
    public final void run() {
        field3602++;
        try {
            if (class58.field983 != null) {
                String var1 = class58.field983.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class58.field967;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1365((byte) -117, "wrongjava");
                        return;
                    }
                    class156.field2734 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class58.field967 == null || class58.field967.equals("1.4.2"))) {
                    this.method1365((byte) -25, "wrongjava");
                    return;
                }
            }
            if (class58.field967 != null && class58.field967.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class58.field967.length()) {
                    char var5 = class58.field967.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class230.field4030 = true;
                }
            }
            if (class3.field24.field970 != null) {
                Method var6 = class58.field987;
                if (var6 != null) {
                    try {
                        var6.invoke(class3.field24.field970, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method1372(true);
            class240.field4215 = class177.method1193(class93.field1601, class249.field4391, (byte) -15, class212.field3587);
            this.method637(-3);
            class71.field1160 = class251.method1653((byte) -51);
            while (class193.field3323 == 0L || class121.method888((byte) -119) < class193.field3323) {
                class166.field2883 = class71.field1160.method276(class156.field2734, 0, class70.field1151);
                for (int var7 = 0; var7 < class166.field2883; var7++) {
                    this.method1374((byte) -127);
                }
                this.method1373((byte) 123);
                client.method644(class3.field24, (byte) -47, class93.field1601);
            }
        } catch (Exception var10) {
            class1.method1(var10, (String) null, false);
            this.method1365((byte) 87, "crash");
        }
        this.method1367(true, 0);
    }

    @OriginalMember(owner = "client!ef", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3628++;
    }

    @OriginalMember(owner = "client!ef", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3599++;
        if (class165.field2870 == null) {
            return class3.field24 == null || class3.field24.field970 == this ? super.getCodeBase() : class3.field24.field970.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3607++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1369(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class250.field4422 = arg5;
            class42.field709 = 0;
            class92.field1560 = this;
            class249.field4391 = arg1;
            class244.field4258 = arg1;
            class212.field3587 = arg6;
            class63.field1054 = arg6;
            class19.field264 = arg2;
            class165.field2870 = new Frame();
            class165.field2870.setTitle("Jagex");
            class165.field2870.setResizable(true);
            class165.field2870.addWindowListener(this);
            class165.field2870.setVisible(true);
            class165.field2870.toFront();
            Insets var8 = class165.field2870.getInsets();
            class165.field2870.setSize(class244.field4258 + var8.right + var8.left, class63.field1054 - (-var8.top + -var8.bottom));
            class46.field762 = class3.field24 = new class58((Applet) null, arg3, arg0, arg4);
            class266 var9 = class3.field24.method368((byte) -125, 1, this);
            while (var9.field4623 == 0) {
                class250.method1640(10L, -7);
            }
        } catch (Exception var11) {
            class1.method1(var11, (String) null, false);
        }
        field3624++;
    }

    @OriginalMember(owner = "client!ef", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3608++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
    public final void method1370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3604++;
        try {
            if (class92.field1560 == null) {
                class250.field4422 = arg2;
                class249.field4391 = arg0;
                class244.field4258 = arg0;
                class92.field1560 = this;
                if (arg3 == -14747) {
                    class42.field709 = 0;
                    class19.field264 = 0;
                    class212.field3587 = arg4;
                    class63.field1054 = arg4;
                    String var6 = this.getParameter("openwinjs");
                    boolean var10000;
                    if (var6 != null && var6.equals("1")) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                    if (class3.field24 == null) {
                        class46.field762 = class3.field24 = new class58(this, arg1, (String) null, 0);
                    }
                    class266 var7 = class3.field24.method368((byte) -127, 1, this);
                    while (var7.field4623 == 0) {
                        class250.method1640(10L, -123);
                    }
                }
            } else {
                class13.field199++;
                if (class13.field199 >= 3) {
                    this.method1365((byte) -57, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class1.method1(var9, (String) null, false);
            this.method1365((byte) 126, "crash");
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(DI)V")
    public static final void method1371(double arg0, int arg1) {
        if (class35.field577 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class40.field668[var3] = var4 > 255 ? 255 : var4;
            }
            class35.field577 = arg0;
        }
        field3632++;
        if (arg1 != -4) {
            field3638 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class175.field3034 = true;
        field3623++;
        class161.field2816 = true;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public abstract void method637(int arg0);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public final synchronized void method1372(boolean arg0) {
        if (class93.field1601 != null) {
            class93.field1601.removeFocusListener(this);
            class93.field1601.getParent().remove(class93.field1601);
        }
        Container var2;
        if (class276.field4821 != null) {
            var2 = class276.field4821;
        } else if (class165.field2870 == null) {
            var2 = class3.field24.field970;
        } else {
            var2 = class165.field2870;
        }
        var2.setLayout((LayoutManager) null);
        field3616++;
        class93.field1601 = new class36(this);
        var2.add(class93.field1601);
        class93.field1601.setSize(class249.field4391, class212.field3587);
        class93.field1601.setVisible(true);
        if (class165.field2870 == var2) {
            Insets var3 = class165.field2870.getInsets();
            class93.field1601.setLocation(var3.left + class19.field264, class42.field709 + var3.top);
        } else {
            class93.field1601.setLocation(class19.field264, class42.field709);
        }
        class93.field1601.addFocusListener(this);
        class93.field1601.requestFocus();
        class175.field3034 = true;
        class161.field2816 = true;
        class36.field600 = arg0;
        class114.field2025 = false;
        class32.field481 = class121.method888((byte) -119);
    }

    @OriginalMember(owner = "client!ef", name = "providesignlink", descriptor = "(Ljk;)V")
    public static final void providesignlink(class58 arg0) {
        field3636++;
        class3.field24 = arg0;
        class46.field762 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V")
    private final void method1373(byte arg0) {
        field3639++;
        long var2 = class121.method888((byte) -119);
        if (arg0 <= 61) {
            this.windowDeiconified((WindowEvent) null);
        }
        long var4 = class181.field3110[class51.field857];
        class181.field3110[class51.field857] = var2;
        class51.field857 = class51.field857 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class138.field2415 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class267.field4645++) > 50) {
            class267.field4645 -= 50;
            class161.field2816 = true;
            class93.field1601.setSize(class249.field4391, class212.field3587);
            class93.field1601.setVisible(true);
            if (class165.field2870 != null && class276.field4821 == null) {
                Insets var7 = class165.field2870.getInsets();
                class93.field1601.setLocation(class19.field264 + var7.left, var7.top - -class42.field709);
            } else {
                class93.field1601.setLocation(class19.field264, class42.field709);
            }
        }
        this.method636((byte) -2);
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(B)V")
    private final void method1374(byte arg0) {
        long var2 = class121.method888((byte) -119);
        field3641++;
        if (arg0 != -127) {
            return;
        }
        long var4 = class251.field4456[class241.field4229];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class251.field4456[class241.field4229] = var2;
        class241.field4229 = class241.field4229 + 1 & 0x1F;
        synchronized (this) {
            class36.field600 = class175.field3034;
        }
        this.method630((byte) 55);
    }
}
