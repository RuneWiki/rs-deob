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

@OriginalClass("client!g")
public abstract class class299 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Z")
    private boolean field4883 = false;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Z")
    private boolean field4888 = false;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "[I")
    public static int[] field4906 = new int[14];

    @OriginalMember(owner = "client!g", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4911 = "level: ";

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "Lwe;")
    public static class16 field4907;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "Z")
    public static boolean field4912;

    @OriginalMember(owner = "client!g", name = "start", descriptor = "()V")
    public final void start() {
        field4909++;
        if (class18.field329 == this && !class128.field2042) {
            class269.field4342 = 0L;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public abstract void method1133(byte arg0);

    @OriginalMember(owner = "client!g", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4876++;
        if (class18.field329 == this && !class128.field2042) {
            class269.field4342 = class264.method1778(6573);
            class33.method250(5000L, 256);
            class148.field2372 = null;
            this.method2055(false, 0);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public abstract void method1120(byte arg0);

    @OriginalMember(owner = "client!g", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4895++;
        if (class53.field776 == null) {
            return class44.field659 == null || class44.field659.field1105 == this ? super.getCodeBase() : class44.field659.field1105.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
    public final synchronized void method2048(byte arg0) {
        field4878++;
        if (class122.field1926 != null) {
            class122.field1926.removeFocusListener(this);
            class122.field1926.getParent().remove(class122.field1926);
        }
        if (arg0 != -61) {
            field4911 = null;
        }
        Container var2;
        if (class200.field3207 != null) {
            var2 = class200.field3207;
        } else if (class53.field776 == null) {
            var2 = class44.field659.field1105;
        } else {
            var2 = class53.field776;
        }
        var2.setLayout((LayoutManager) null);
        class122.field1926 = new class111(this);
        var2.add(class122.field1926);
        class122.field1926.setSize(class154.field2463, class195.field3161);
        class122.field1926.setVisible(true);
        if (class53.field776 == var2) {
            Insets var3 = class53.field776.getInsets();
            class122.field1926.setLocation(var3.left + class108.field1681, class60.field869 + var3.top);
        } else {
            class122.field1926.setLocation(class108.field1681, class60.field869);
        }
        class122.field1926.addFocusListener(this);
        class122.field1926.requestFocus();
        class80.field1281 = true;
        class233.field3650 = true;
        class97.field1528 = false;
        class83.field1332 = true;
        class125.field1996 = class264.method1778(6573);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method2049(int arg0) {
        field4907 = null;
        if (arg0 != 1) {
            field4911 = null;
        }
        field4911 = null;
        field4906 = null;
    }

    @OriginalMember(owner = "client!g", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4902++;
        if (class53.field776 == null) {
            return class44.field659 == null || class44.field659.field1105 == this ? super.getParameter(arg0) : class44.field659.field1105.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "providesignlink", descriptor = "(Ltl;)V")
    public static final void providesignlink(class69 arg0) {
        field4885++;
        class44.field659 = arg0;
        class148.field2372 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    private final void method2050(byte arg0) {
        long var2 = class264.method1778(6573);
        field4880++;
        long var4 = class173.field2898[class271.field4365];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class173.field2898[class271.field4365] = var2;
        class271.field4365 = class271.field4365 + 1 & 0x1F;
        synchronized (this) {
            class83.field1332 = class80.field1281;
        }
        this.method1138(0);
        if (arg0 >= -75) {
            this.windowClosed((WindowEvent) null);
        }
    }

    @OriginalMember(owner = "client!g", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4891++;
        if (class53.field776 == null) {
            return class44.field659 == null || class44.field659.field1105 == this ? super.getDocumentBase() : class44.field659.field1105.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
    public final void method2051(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4894++;
        try {
            if (class18.field329 == null) {
                class195.field3161 = arg2;
                class132.field2124 = arg2;
                class154.field2463 = arg3;
                class74.field1185 = arg3;
                class205.field3295 = arg4;
                class60.field869 = 0;
                if (arg0 != 10) {
                    this.field4883 = true;
                }
                class108.field1681 = 0;
                class18.field329 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class44.field659 == null) {
                    class148.field2372 = class44.field659 = new class69(this, arg1, (String) null, 0);
                }
                class301 var7 = class44.field659.method487(-20349, 1, this);
                while (var7.field4929 == 0) {
                    class33.method250(10L, 256);
                }
            } else {
                class18.field328++;
                if (class18.field328 >= 3) {
                    this.method2052("alreadyloaded", 7718);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class284.method1930(104, (String) null, var9);
            this.method2052("crash", 7718);
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
    public abstract void method1128(byte arg0);

    @OriginalMember(owner = "client!g", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4886++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method2052(String arg0, int arg1) {
        field4890++;
        if (this.field4883) {
            return;
        }
        this.field4883 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != 7718) {
                return;
            }
            class216.method1481(-93, class44.field659.field1105, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!g", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4901++;
    }

    @OriginalMember(owner = "client!g", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4893++;
    }

    @OriginalMember(owner = "client!g", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4908++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public abstract void method1138(int arg0);

    @OriginalMember(owner = "client!g", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4910++;
    }

    @OriginalMember(owner = "client!g", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class80.field1281 = false;
        field4898++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIILjava/lang/String;Z)V")
    public final void method2053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, boolean arg7) {
        field4904++;
        try {
            class60.field869 = arg3;
            class18.field329 = this;
            class205.field3295 = arg4;
            class108.field1681 = 0;
            class195.field3161 = arg2;
            class132.field2124 = arg2;
            class154.field2463 = arg1;
            class74.field1185 = arg1;
            class53.field776 = new Frame();
            class53.field776.setTitle("Jagex");
            class53.field776.setResizable(true);
            class53.field776.addWindowListener(this);
            class53.field776.setVisible(true);
            class53.field776.toFront();
            Insets var9 = class53.field776.getInsets();
            class53.field776.setSize(class74.field1185 - (-var9.left - var9.right), class132.field2124 + var9.top - -var9.bottom);
            class148.field2372 = class44.field659 = new class69((Applet) null, arg0, arg6, arg5);
            class301 var10 = class44.field659.method487(arg3 - 20349, 1, this);
            while (var10.field4929 == 0) {
                class33.method250(10L, 256);
            }
        } catch (Exception var12) {
            class284.method1930(-68, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public abstract void method1135(boolean arg0);

    @OriginalMember(owner = "client!g", name = "stop", descriptor = "()V")
    public final void stop() {
        field4879++;
        if (class18.field329 == this && !class128.field2042) {
            class269.field4342 = class264.method1778(6573) + 4000L;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    private final void method2054(int arg0) {
        long var2 = class264.method1778(6573);
        long var4 = class175.field2917[class180.field2976];
        class175.field2917[class180.field2976] = var2;
        class180.field2976 = class180.field2976 + 1 & 0x1F;
        field4899++;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class132.field2121 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 > ~(class296.field4825++)) {
            class233.field3650 = true;
            class296.field4825 -= 50;
            class122.field1926.setSize(class154.field2463, class195.field3161);
            class122.field1926.setVisible(true);
            if (class53.field776 != null && class200.field3207 == null) {
                Insets var7 = class53.field776.getInsets();
                class122.field1926.setLocation(var7.left + class108.field1681, var7.top - -class60.field869);
            } else {
                class122.field1926.setLocation(class108.field1681, class60.field869);
            }
        }
        this.method1133((byte) 90);
    }

    @OriginalMember(owner = "client!g", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4889++;
    }

    @OriginalMember(owner = "client!g", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4897++;
        if (class18.field329 != this || class128.field2042) {
            return;
        }
        class233.field3650 = true;
        if (class65.field1053 && class264.method1778(6573) - class125.field1996 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class74.field1185 <= var2.width && class132.field2124 <= var2.height) {
                class97.field1528 = true;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
    private final void method2055(boolean arg0, int arg1) {
        field4882++;
        synchronized (this) {
            if (class128.field2042) {
                return;
            }
            class128.field2042 = true;
        }
        if (arg1 != 0) {
            this.method2056((byte) -89);
        }
        if (class44.field659.field1105 != null) {
            class44.field659.field1105.destroy();
        }
        try {
            this.method1128((byte) 51);
        } catch (Exception var10) {
        }
        if (this.field4888) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field4888 = false;
        }
        class44.field659.method476(class18.field329.getClass(), (byte) -128);
        if (class122.field1926 != null) {
            try {
                class122.field1926.removeFocusListener(this);
                class122.field1926.getParent().remove(class122.field1926);
            } catch (Exception var8) {
            }
        }
        if (class44.field659 != null) {
            try {
                class44.field659.method482(0);
            } catch (Exception var7) {
            }
        }
        this.method1120((byte) -67);
        if (class53.field776 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!g", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4881++;
        if (class53.field776 == null) {
            return class44.field659 == null || class44.field659.field1105 == this ? super.getAppletContext() : class44.field659.field1105.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(B)Z")
    public final boolean method2056(byte arg0) {
        field4896++;
        int var2 = 49 / ((arg0 + 48) / 60);
        String var3 = this.getDocumentBase().getHost().toLowerCase();
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
                this.method2052("invalidhost", 7718);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
    public static final void method2057(byte arg0, int arg1) {
        field4884++;
        class63.field1010.method1880(-121, arg1);
        if (arg0 <= 69) {
            field4911 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class80.field1281 = true;
        class233.field3650 = true;
        field4887++;
    }

    @OriginalMember(owner = "client!g", name = "run", descriptor = "()V")
    public final void run() {
        field4900++;
        try {
            if (class69.field1097 != null) {
                String var1 = class69.field1097.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class69.field1110;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2052("wrongjava", 7718);
                        return;
                    }
                    class269.field4344 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class69.field1110 == null || class69.field1110.equals("1.4.2"))) {
                    this.method2052("wrongjava", 7718);
                    return;
                }
            }
            if (class69.field1110 != null && class69.field1110.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (var4 < class69.field1110.length()) {
                    char var5 = class69.field1110.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 - (48 - var5);
                }
                if (var3 >= 5) {
                    class65.field1053 = true;
                }
            }
            if (class44.field659.field1105 != null) {
                Method var6 = class69.field1114;
                if (var6 != null) {
                    try {
                        var6.invoke(class44.field659.field1105, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class308.method2093(0);
            this.method2048((byte) -61);
            class296.field4829 = class147.method1002(class154.field2463, class122.field1926, class195.field3161, -110);
            this.method1135(false);
            class195.field3156 = class309.method2098(1995949479);
            this.method2058(100);
            while (class269.field4342 == 0L || class269.field4342 > class264.method1778(6573)) {
                class173.field2901 = class195.field3156.method276(class251.field4117, (byte) -97, class269.field4344);
                for (int var7 = 0; var7 < class173.field2901; var7++) {
                    this.method2050((byte) -103);
                }
                this.method2054(-51);
                class161.method1109(class122.field1926, class44.field659, (byte) 31);
            }
        } catch (Exception var10) {
            class284.method1930(-60, (String) null, var10);
            this.method2052("crash", 7718);
        }
        this.method2055(true, 0);
    }

    @OriginalMember(owner = "client!g", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4903++;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public final void method2058(int arg0) {
        field4875++;
        if (arg0 != 100) {
            this.field4883 = true;
        }
        if (this.field4888) {
            return;
        }
        try {
            class301 var2 = class44.field659.method481(-125, class18.field329.getClass());
            while (var2.field4929 == 0) {
                class33.method250(100L, 256);
            }
            if (var2.field4930 != null) {
                throw (Throwable) var2.field4930;
            }
            jagmisc.init();
            this.field4888 = true;
            class195.field3156 = class309.method2098(1995949479);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!g", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4905++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
    public static final int method2059(int arg0, int arg1) {
        if (arg1 == -14505) {
            field4877++;
            return arg0 >>> 8;
        } else {
            return 71;
        }
    }
}
