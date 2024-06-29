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

@OriginalClass("client!wk")
public abstract class class174 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Z")
    private boolean field2539 = false;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "Z")
    private boolean field2559 = false;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field2565 = 0;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Lof;")
    public static class328 field2538 = new class328(8);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Z")
    public static boolean field2567;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "Z")
    public static boolean field2570;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Ljava/lang/String;")
    public String method495(int arg0) {
        field2535++;
        if (arg0 > -110) {
            this.getCodeBase();
        }
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2532++;
    }

    @OriginalMember(owner = "client!wk", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2547++;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public abstract void method504(int arg0);

    @OriginalMember(owner = "client!wk", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2534++;
        if (class92.field1342 == null) {
            return class339.field5294 == null || class339.field5294.field27 == this ? super.getDocumentBase() : class339.field5294.field27.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2531++;
    }

    @OriginalMember(owner = "client!wk", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2544++;
    }

    @OriginalMember(owner = "client!wk", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2548++;
    }

    @OriginalMember(owner = "client!wk", name = "start", descriptor = "()V")
    public final void start() {
        field2561++;
        if (class516.field7658 == this && !class398.field6019) {
            class186.field2717 = 0L;
        }
    }

    @OriginalMember(owner = "client!wk", name = "stop", descriptor = "()V")
    public final void stop() {
        field2552++;
        if (class516.field7658 == this && !class398.field6019) {
            class186.field2717 = class246.method1705((byte) 28) + 4000L;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1089(String arg0, byte arg1) {
        field2550++;
        if (this.field2539) {
            return;
        }
        this.field2539 = true;
        System.out.println("error_game_" + arg0);
        try {
            class200.method1370(-11, class339.field5294.field27, "loggedout");
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
        int var3 = 63 % ((arg1 + 3) / 50);
    }

    @OriginalMember(owner = "client!wk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2545++;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
    public abstract void method514(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Li;III[Z)Z")
    public static final boolean method1090(class521 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class53.field732 != class103.field1520) {
            int var6 = class244.field3956[arg1].method692(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class223 var8 = class244.field3956[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method692(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method696(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method698(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wk", name = "providesignlink", descriptor = "(Lpb;)V")
    public static final void providesignlink(class2 arg0) {
        class339.field5294 = arg0;
        class243.field3945 = arg0;
        field2543++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z")
    public final boolean method1091(byte arg0) {
        field2560++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 < 66) {
            this.windowDeactivated(null);
        }
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
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
                this.method1089("invalidhost", (byte) 92);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
    public static final void method1092(int arg0, int arg1) {
        class388.field5920 = 100;
        class501.field7516 = -1;
        class52.field707 = 3;
        field2556++;
        if (arg1 < 0) {
            field2565 = 100;
        }
        class136.field1877 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "run", descriptor = "()V")
    public final void run() {
        field2555++;
        try {
            label110: {
                if (class2.field29 != null) {
                    String var1 = class2.field29.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class2.field10;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1089("wrongjava", (byte) -119);
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class2.field10 == null || class2.field10.equals("1.4.2"))) {
                        this.method1089("wrongjava", (byte) 100);
                        break label110;
                    }
                }
                if (class2.field10 != null && class2.field10.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class2.field10.length()) {
                        char var5 = class2.field10.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 - (48 - var5);
                        var3++;
                    }
                    if (var4 >= 5) {
                        class209.field3226 = true;
                    }
                }
                if (class339.field5294.field27 != null) {
                    Method var6 = class2.field33;
                    if (var6 != null) {
                        try {
                            var6.invoke(class339.field5294.field27, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class278.method1865((byte) 82);
                class82.method583((byte) -118);
                this.method1099(-24899);
                this.method1096(-2827);
                this.method510((byte) 110);
                class301.field4732 = class453.method2852(5);
                this.method1096(-2827);
                while (class186.field2717 == 0L || class246.method1705((byte) 28) < class186.field2717) {
                    class201.field3056 = class301.field4732.method170(114, class238.field3887);
                    for (int var7 = 0; var7 < class201.field3056; var7++) {
                        this.method1100(-71);
                    }
                    this.method1094((byte) 72);
                    class361.method2384(class339.field5294, class320.field4980, -82);
                }
            }
        } catch (Throwable var10) {
            class80.method575(var10, this.method495(-119), (byte) -117);
            this.method1089("crash", (byte) -112);
        }
        this.method1097((byte) 107, true);
    }

    @OriginalMember(owner = "client!wk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2551++;
        class332.field5195 = true;
        class372.field5718 = true;
    }

    @OriginalMember(owner = "client!wk", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!wk", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2549++;
    }

    @OriginalMember(owner = "client!wk", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2542++;
        if (class516.field7658 == this && !class398.field6019) {
            class186.field2717 = class246.method1705((byte) 28);
            class208.method1464((byte) -117, 5000L);
            class243.field3945 = null;
            this.method1097((byte) -108, false);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
    public abstract void method510(byte arg0);

    @OriginalMember(owner = "client!wk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2536++;
        class332.field5195 = false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V")
    public final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2554++;
        try {
            if (class516.field7658 == null) {
                class219.field3715 = arg4;
                class329.field5175 = arg4;
                class489.field7400 = arg2;
                class414.field6267 = arg2;
                class14.field149 = arg0;
                class150.field2016 = arg1;
                class50.field638 = 0;
                class516.field7658 = this;
                if (class339.field5294 == null) {
                    class243.field3945 = class339.field5294 = new class2(this, arg3, null, 0);
                }
                class495 var6 = class339.field5294.method7(this, (byte) 119, 1);
                while (var6.field7458 == 0) {
                    class208.method1464((byte) -58, 10L);
                }
            } else {
                class247.field4022++;
                if (class247.field4022 >= 3) {
                    this.method1089("alreadyloaded", (byte) -106);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class80.method575(var8, null, (byte) -56);
            this.method1089("crash", (byte) -101);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)V")
    private final void method1094(byte arg0) {
        field2553++;
        long var2 = class246.method1705((byte) 28);
        long var4 = class170.field2490[class247.field4023];
        class170.field2490[class247.field4023] = var2;
        class247.field4023 = class247.field4023 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class305.field4800 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != 72) {
            return;
        }
        if (class202.field3079++ > 50) {
            class372.field5718 = true;
            class202.field3079 -= 50;
            class320.field4980.setSize(class489.field7400, class219.field3715);
            class320.field4980.setVisible(true);
            if (class92.field1342 != null && class216.field3671 == null) {
                Insets var7 = class92.field1342.getInsets();
                class320.field4980.setLocation(class50.field638 + var7.left, class14.field149 + var7.top);
            } else {
                class320.field4980.setLocation(class50.field638, class14.field149);
            }
        }
        this.method514(3558);
    }

    @OriginalMember(owner = "client!wk", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2541++;
        if (class92.field1342 == null) {
            return class339.field5294 == null || class339.field5294.field27 == this ? super.getAppletContext() : class339.field5294.field27.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(B)V")
    public static void method1095(byte arg0) {
        field2538 = null;
        if (arg0 != 113) {
            providesignlink(null);
        }
    }

    @OriginalMember(owner = "client!wk", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2563++;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public final void method1096(int arg0) {
        field2540++;
        if (!this.field2559) {
            try {
                class495 var2 = class339.field5294.method14((byte) -106, class516.field7658.getClass());
                while (var2.field7458 == 0) {
                    class208.method1464((byte) -102, 100L);
                }
                if (var2.field7462 != null) {
                    throw (Throwable) var2.field7462;
                }
                jagmisc.init();
                this.field2559 = true;
                class301.field4732 = class453.method2852(5);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != -2827) {
            this.method1100(39);
        }
    }

    @OriginalMember(owner = "client!wk", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2558++;
        if (class92.field1342 == null) {
            return class339.field5294 == null || class339.field5294.field27 == this ? super.getCodeBase() : class339.field5294.field27.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
    public abstract void method496(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BZ)V")
    private final void method1097(byte arg0, boolean arg1) {
        field2533++;
        synchronized (this) {
            if (class398.field6019) {
                return;
            }
            class398.field6019 = true;
        }
        if (class339.field5294.field27 != null) {
            class339.field5294.field27.destroy();
        }
        try {
            this.method496(2);
        } catch (Exception var12) {
        }
        if (this.field2559) {
            try {
                jagmisc.quit();
            } catch (Throwable var11) {
            }
            this.field2559 = false;
        }
        int var4 = -99 / ((39 - arg0) / 59);
        class431.method2719(false, true);
        class495 var5 = class339.field5294.method21((byte) -115, class516.field7658.getClass());
        while (var5.field7458 == 0) {
            class208.method1464((byte) -102, 100L);
        }
        if (class320.field4980 != null) {
            try {
                class320.field4980.removeFocusListener(this);
                class320.field4980.getParent().remove(class320.field4980);
            } catch (Exception var10) {
            }
        }
        if (class339.field5294 != null) {
            try {
                class339.field5294.method27(117);
            } catch (Exception var9) {
            }
        }
        this.method504(9451);
        if (class92.field1342 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!wk", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2546++;
        if (class92.field1342 == null) {
            return class339.field5294 == null || class339.field5294.field27 == this ? super.getParameter(arg0) : class339.field5294.field27.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIZILjava/lang/String;I)V")
    public final void method1098(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, String arg6, int arg7) {
        try {
            class14.field149 = arg2;
            class516.field7658 = this;
            class219.field3715 = arg0;
            class329.field5175 = arg0;
            class50.field638 = 0;
            class489.field7400 = arg5;
            class414.field6267 = arg5;
            class150.field2016 = arg3;
            class92.field1342 = new Frame();
            class92.field1342.setTitle("Jagex");
            class92.field1342.setResizable(true);
            class92.field1342.addWindowListener(this);
            class92.field1342.setVisible(true);
            class92.field1342.toFront();
            Insets var9 = class92.field1342.getInsets();
            class92.field1342.setSize(class414.field6267 + var9.right + var9.left, class329.field5175 + var9.top + var9.bottom);
            class243.field3945 = class339.field5294 = new class2(null, arg1, arg6, arg7);
            class495 var10 = class339.field5294.method7(this, (byte) 108, 1);
            while (var10.field7458 == 0) {
                class208.method1464((byte) -119, 10L);
            }
        } catch (Exception var12) {
            class80.method575(var12, null, (byte) -55);
        }
        field2562++;
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V")
    public final synchronized void method1099(int arg0) {
        field2557++;
        if (class320.field4980 != null) {
            class320.field4980.removeFocusListener(this);
            class320.field4980.getParent().remove(class320.field4980);
        }
        Container var2;
        if (class216.field3671 != null) {
            var2 = class216.field3671;
        } else if (class92.field1342 == null) {
            var2 = class339.field5294.field27;
        } else {
            var2 = class92.field1342;
        }
        var2.setLayout(null);
        class320.field4980 = new class54(this);
        var2.add(class320.field4980);
        class320.field4980.setSize(class489.field7400, class219.field3715);
        if (arg0 != -24899) {
            this.field2559 = true;
        }
        class320.field4980.setVisible(true);
        if (class92.field1342 == var2) {
            Insets var3 = class92.field1342.getInsets();
            class320.field4980.setLocation(class50.field638 + var3.left, class14.field149 + var3.top);
        } else {
            class320.field4980.setLocation(class50.field638, class14.field149);
        }
        class320.field4980.addFocusListener(this);
        class320.field4980.requestFocus();
        class332.field5195 = true;
        class224.field3767 = true;
        class372.field5718 = true;
        class365.field5660 = false;
        class529.field7778 = class246.method1705((byte) 28);
    }

    @OriginalMember(owner = "client!wk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2537++;
        if (class516.field7658 != this || class398.field6019) {
            return;
        }
        class372.field5718 = true;
        if (class209.field3226 && (class246.method1705((byte) 28) - class529.field7778) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class414.field6267 && class329.field5175 <= var2.height) {
                class365.field5660 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V")
    private final void method1100(int arg0) {
        field2564++;
        int var2 = 8 / ((67 - arg0) / 59);
        long var3 = class246.method1705((byte) 28);
        long var5 = class88.field1277[class49.field625];
        class88.field1277[class49.field625] = var3;
        boolean var10000;
        if (var5 == 0L || var5 >= var3) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class49.field625 = class49.field625 + 1 & 0x1F;
        synchronized (this) {
            class224.field3767 = class332.field5195;
        }
        this.method490(false);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public abstract void method490(boolean arg0);
}
