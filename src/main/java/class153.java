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

@OriginalClass("client!ib")
public abstract class class153 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Z")
    private boolean field2784 = false;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[I")
    public static int[] field2763 = new int[1000];

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field2772 = 0;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field2781 = 0;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lcc;")
    private static class209 field2770 = class95.method669(122, "Hidden");

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "[I")
    public static int[] field2790 = new int[50];

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Lcc;")
    public static class209 field2795 = field2770;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lsj;")
    public static class49 field2769;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "Z")
    public static boolean field2801;

    @OriginalMember(owner = "client!ib", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2786++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V")
    private final void method1052(boolean arg0, int arg1) {
        field2765++;
        synchronized (this) {
            if (class108.field2147) {
                return;
            }
            class108.field2147 = true;
        }
        if (class230.field4187.field2638 != null) {
            class230.field4187.field2638.destroy();
        }
        try {
            this.method1058(127);
        } catch (Exception var9) {
        }
        if (class122.field2411 != null) {
            try {
                class122.field2411.removeFocusListener(this);
                class122.field2411.getParent().remove(class122.field2411);
            } catch (Exception var8) {
            }
        }
        if (class230.field4187 != null) {
            try {
                class230.field4187.method998((byte) -96);
            } catch (Exception var7) {
            }
        }
        this.method1059((byte) 117);
        if (arg1 != 23835) {
            this.windowDeiconified((WindowEvent) null);
        }
        if (class230.field4176 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ib", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2771++;
    }

    @OriginalMember(owner = "client!ib", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2768++;
    }

    @OriginalMember(owner = "client!ib", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ib", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2794++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public final synchronized void method1053(int arg0) {
        field2782++;
        if (class122.field2411 != null) {
            class122.field2411.removeFocusListener(this);
            class122.field2411.getParent().remove(class122.field2411);
        }
        Container var2;
        if (class84.field1682 != null) {
            var2 = class84.field1682;
        } else if (class230.field4176 == null) {
            var2 = class230.field4187.field2638;
        } else {
            var2 = class230.field4176;
        }
        var2.setLayout((LayoutManager) null);
        class122.field2411 = new class246(this);
        var2.add(class122.field2411);
        class122.field2411.setSize(class25.field442, class50.field981);
        class122.field2411.setVisible(true);
        if (class230.field4176 == var2) {
            Insets var3 = class230.field4176.getInsets();
            class122.field2411.setLocation(class209.field3779 + var3.left, class50.field989 + var3.top);
        } else {
            class122.field2411.setLocation(class209.field3779, class50.field989);
        }
        int var4 = 87 % ((arg0 + 27) / 55);
        class122.field2411.addFocusListener(this);
        class122.field2411.requestFocus();
        class271.field4806 = true;
        class97.field1900 = true;
        class155.field2841 = true;
        class76.field1429 = false;
        class76.field1423 = class180.method1236(117);
    }

    @OriginalMember(owner = "client!ib", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2777++;
        class97.field1900 = false;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z")
    public final boolean method1054(byte arg0) {
        field2787++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = -59 / ((43 - arg0) / 45);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1062("invalidhost", (byte) 102);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method1055(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class23.field435 = this;
            class25.field442 = arg4;
            class117.field2337 = arg4;
            class50.field981 = arg0;
            class234.field4220 = arg0;
            class209.field3779 = 0;
            if (arg6 < 106) {
                return;
            }
            class237.field4301 = arg1;
            class50.field989 = 0;
            class230.field4176 = new Frame();
            class230.field4176.setTitle("Jagex");
            class230.field4176.setResizable(true);
            class230.field4176.addWindowListener(this);
            class230.field4176.setVisible(true);
            class230.field4176.toFront();
            Insets var8 = class230.field4176.getInsets();
            class230.field4176.setSize(class117.field2337 + var8.right + var8.left, var8.top + var8.bottom + class234.field4220);
            class171.field3130 = class230.field4187 = new class143((Applet) null, arg5, arg2, arg3);
            class203 var9 = class230.field4187.method996(this, 1, false);
            while (var9.field3646 == 0) {
                class174.method1196((byte) 124, 10L);
            }
        } catch (Exception var11) {
            class78.method548((byte) -17, (String) null, var11);
        }
        field2780++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    private final void method1056(byte arg0) {
        field2775++;
        if (arg0 > -127) {
            this.method1054((byte) -124);
        }
        long var2 = class180.method1236(113);
        long var4 = class88.field1746[class186.field3361];
        class88.field1746[class186.field3361] = var2;
        class186.field3361 = class186.field3361 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class30.field549 = ((var6 >> 1) + 32000) / var6;
        }
        if (class40.field672++ > 50) {
            class40.field672 -= 50;
            class155.field2841 = true;
            class122.field2411.setSize(class25.field442, class50.field981);
            class122.field2411.setVisible(true);
            if (class230.field4176 != null && class84.field1682 == null) {
                Insets var7 = class230.field4176.getInsets();
                class122.field2411.setLocation(class209.field3779 + var7.left, var7.top - -class50.field989);
            } else {
                class122.field2411.setLocation(class209.field3779, class50.field989);
            }
        }
        this.method1066((byte) -124);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public abstract void method1057(byte arg0);

    @OriginalMember(owner = "client!ib", name = "providesignlink", descriptor = "(Lw;)V")
    public static final void providesignlink(class143 arg0) {
        class230.field4187 = arg0;
        class171.field3130 = arg0;
        field2793++;
    }

    @OriginalMember(owner = "client!ib", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2778++;
        if (class230.field4176 == null) {
            return class230.field4187 == null || class230.field4187.field2638 == this ? super.getParameter(arg0) : class230.field4187.field2638.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2791++;
    }

    @OriginalMember(owner = "client!ib", name = "start", descriptor = "()V")
    public final void start() {
        field2785++;
        if (class23.field435 == this && !class108.field2147) {
            class42.field695 = 0L;
        }
    }

    @OriginalMember(owner = "client!ib", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2788++;
        if (class230.field4176 == null) {
            return class230.field4187 == null || class230.field4187.field2638 == this ? super.getDocumentBase() : class230.field4187.field2638.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public abstract void method1058(int arg0);

    @OriginalMember(owner = "client!ib", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2792++;
        class97.field1900 = true;
        class155.field2841 = true;
    }

    @OriginalMember(owner = "client!ib", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2776++;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)V")
    public abstract void method1059(byte arg0);

    @OriginalMember(owner = "client!ib", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2797++;
        if (class230.field4176 == null) {
            return class230.field4187 == null || class230.field4187.field2638 == this ? super.getAppletContext() : class230.field4187.field2638.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2783++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ib", name = "run", descriptor = "()V")
    public final void run() {
        field2766++;
        try {
            if (class143.field2643 != null) {
                String var1 = class143.field2643.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class143.field2637;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1062("wrongjava", (byte) 31);
                        return;
                    }
                    class237.field4254 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class143.field2637 == null || class143.field2637.equals("1.4.2"))) {
                    this.method1062("wrongjava", (byte) 127);
                    return;
                }
            }
            if (class143.field2637 != null && class143.field2637.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class143.field2637.length() > var3) {
                    char var5 = class143.field2637.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 - (48 - var5);
                }
                if (var4 >= 5) {
                    class237.field4289 = true;
                }
            }
            if (class230.field4187.field2638 != null) {
                Method var6 = class143.field2648;
                if (var6 != null) {
                    try {
                        var6.invoke(class230.field4187.field2638, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method1053(-100);
            class187.field3374 = class6.method59(class25.field442, class122.field2411, class50.field981, 39);
            this.method1057((byte) 107);
            class37.field636 = class173.method1193(-123);
            while (class42.field695 == 0L || class42.field695 > class180.method1236(-57)) {
                class103.field1995 = class37.field636.method169(class268.field4800, class237.field4254, (byte) -34);
                for (int var7 = 0; var7 < class103.field1995; var7++) {
                    this.method1060((byte) -112);
                }
                this.method1056((byte) -128);
                class288.method1937((byte) -126, class122.field2411, class230.field4187);
            }
        } catch (Exception var10) {
            class78.method548((byte) -17, (String) null, var10);
            this.method1062("crash", (byte) 92);
        }
        this.method1052(true, 23835);
    }

    @OriginalMember(owner = "client!ib", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2799++;
    }

    @OriginalMember(owner = "client!ib", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2767++;
        if (class230.field4176 == null) {
            return class230.field4187 == null || class230.field4187.field2638 == this ? super.getCodeBase() : class230.field4187.field2638.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "stop", descriptor = "()V")
    public final void stop() {
        field2798++;
        if (class23.field435 == this && !class108.field2147) {
            class42.field695 = class180.method1236(93) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(B)V")
    private final void method1060(byte arg0) {
        long var2 = class180.method1236(115);
        long var4 = class20.field386[class99.field1934];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 >= -104) {
            this.field2784 = false;
        }
        class20.field386[class99.field1934] = var2;
        field2779++;
        class99.field1934 = class99.field1934 + 1 & 0x1F;
        synchronized (this) {
            class271.field4806 = class97.field1900;
        }
        this.method1063(6);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
    public final void method1061(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2764++;
        try {
            if (class23.field435 == null) {
                class237.field4301 = arg0;
                class50.field989 = 0;
                class25.field442 = arg1;
                class117.field2337 = arg1;
                class23.field435 = this;
                class50.field981 = arg3;
                class234.field4220 = arg3;
                class209.field3779 = arg2;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class230.field4187 == null) {
                    class171.field3130 = class230.field4187 = new class143(this, arg4, (String) null, 0);
                }
                class203 var7 = class230.field4187.method996(this, 1, false);
                while (var7.field3646 == 0) {
                    class174.method1196((byte) 111, 10L);
                }
            } else {
                class84.field1680++;
                if (class84.field1680 >= 3) {
                    this.method1062("alreadyloaded", (byte) 35);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class78.method548((byte) -17, (String) null, var9);
            this.method1062("crash", (byte) 65);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1062(String arg0, byte arg1) {
        field2796++;
        if (this.field2784 || arg1 < 30) {
            return;
        }
        this.field2784 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public abstract void method1063(int arg0);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static void method1064(boolean arg0) {
        field2763 = null;
        field2770 = null;
        if (!arg0) {
            field2790 = null;
        }
        field2769 = null;
        field2790 = null;
        field2795 = null;
    }

    @OriginalMember(owner = "client!ib", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2774++;
        if (class23.field435 != this || class108.field2147) {
            return;
        }
        class155.field2841 = true;
        if (class237.field4289 && (class180.method1236(107) - class76.field1423) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class117.field2337 <= var2.width && class234.field4220 <= var2.height) {
                class76.field1429 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
    public static final int method1065(int arg0, int arg1) {
        field2773++;
        if (arg1 != 915968114) {
            method1065(-3, -8);
        }
        return arg0 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(B)V")
    public abstract void method1066(byte arg0);

    @OriginalMember(owner = "client!ib", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2789++;
        if (class23.field435 == this && !class108.field2147) {
            class42.field695 = class180.method1236(114);
            class174.method1196((byte) 111, 5000L);
            class171.field3130 = null;
            this.method1052(false, 23835);
        }
    }
}
