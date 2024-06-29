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

@OriginalClass("client!qn")
public abstract class class526 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Z")
    private boolean field7776 = false;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Z")
    private boolean field7793 = false;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "[I")
    public static int[] field7779 = new int[200];

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "Z")
    public static boolean field7809;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "Z")
    public static boolean field7810;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "Z")
    public static boolean field7812;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "Z")
    public static boolean field7813;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "Z")
    public static boolean field7816;

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "Z")
    public static boolean field7817;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "[I")
    public static int[] field7774;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "[[[Lsk;")
    public static class415[][][] field7777;

    @OriginalMember(owner = "client!qn", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field7795++;
        if (class248.field3628 == null) {
            return class328.field4850 == null || class328.field4850.field5129 == this ? super.getAppletContext() : class328.field4850.field5129.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field7808++;
        if (class248.field3628 == null) {
            return class328.field4850 == null || class328.field4850.field5129 == this ? super.getDocumentBase() : class328.field4850.field5129.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field7802++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public final synchronized void method3097(int arg0) {
        field7785++;
        if (class110.field1401 != null) {
            class110.field1401.removeFocusListener(this);
            class110.field1401.getParent().remove(class110.field1401);
        }
        Container var2;
        if (class644.field9345 != null) {
            var2 = class644.field9345;
        } else if (class248.field3628 == null) {
            var2 = class328.field4850.field5129;
        } else {
            var2 = class248.field3628;
        }
        var2.setLayout(null);
        class110.field1401 = new class462(this);
        var2.add(class110.field1401);
        class110.field1401.setSize(class522.field7735, class337.field4944);
        class110.field1401.setVisible(true);
        if (class248.field3628 == var2) {
            Insets var3 = class248.field3628.getInsets();
            class110.field1401.setLocation(class124.field1632 + var3.left, class467.field6748 + var3.top);
        } else {
            class110.field1401.setLocation(class124.field1632, class467.field6748);
        }
        class110.field1401.addFocusListener(this);
        class110.field1401.requestFocus();
        class446.field6550 = true;
        class85.field989 = true;
        class534.field7901 = true;
        class492.field7436 = false;
        class34.field369 = class450.method2719((byte) 123);
        if (arg0 != 3) {
            this.init();
        }
    }

    @OriginalMember(owner = "client!qn", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label108: {
                if (class353.field5127 != null) {
                    String var1 = class353.field5127.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class353.field5138;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method3108("wrongjava", -1);
                            break label108;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class353.field5138 == null || class353.field5138.equals("1.4.2"))) {
                        this.method3108("wrongjava", -1);
                        break label108;
                    }
                }
                if (class353.field5138 != null && class353.field5138.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class353.field5138.length() > var3) {
                        char var5 = class353.field5138.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class309.field4504 = true;
                    }
                }
                if (class328.field4850.field5129 != null) {
                    Method var6 = class353.field5149;
                    if (var6 != null) {
                        try {
                            var6.invoke(class328.field4850.field5129, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class366.method2236(2);
                class310.method1902((byte) 125);
                this.method3097(3);
                this.method3110(-3);
                class207.field3082 = class385.method2335((byte) 57);
                while (class584.field8684 == 0L || class584.field8684 > class450.method2719((byte) 124)) {
                    class613.field8994 = class207.field3082.method390((byte) 27, class574.field8471);
                    for (int var7 = 0; var7 < class613.field8994; var7++) {
                        this.method3100(true);
                    }
                    this.method3111(117);
                    class513.method3057(class328.field4850, (byte) -42, class110.field1401);
                }
            }
        } catch (Throwable var10) {
            class31.method140(this.method3113((byte) -118), -117, var10);
            this.method3108("crash", -1);
        }
        field7797++;
        this.method3103(false, true);
    }

    @OriginalMember(owner = "client!qn", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field7773++;
    }

    @OriginalMember(owner = "client!qn", name = "providesignlink", descriptor = "(Luf;)V")
    public static final void providesignlink(class353 arg0) {
        field7784++;
        class328.field4850 = arg0;
        class97.field1217 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
    public abstract void method3098(int arg0);

    @OriginalMember(owner = "client!qn", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field7801++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)Z")
    public final boolean method3099(int arg0) {
        if (arg0 < 17) {
            return false;
        } else {
            field7772++;
            return class53.method271((byte) -125, "jagmisc");
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
    private final void method3100(boolean arg0) {
        field7794++;
        long var2 = class450.method2719((byte) -63);
        if (!arg0) {
            return;
        }
        long var4 = class433.field6337[class203.field3032];
        class433.field6337[class203.field3032] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class203.field3032 = class203.field3032 + 1 & 0x1F;
        synchronized (this) {
            class85.field989 = class446.field6550;
        }
        this.method3112((byte) -90);
    }

    @OriginalMember(owner = "client!qn", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field7803++;
        if (class156.field1994 == this && !class281.field4175) {
            class584.field8684 = class450.method2719((byte) 127);
            class428.method2624(1, 5000L);
            class97.field1217 = null;
            this.method3103(false, false);
        }
    }

    @OriginalMember(owner = "client!qn", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field7775++;
        if (class248.field3628 == null) {
            return class328.field4850 == null || class328.field4850.field5129 == this ? super.getCodeBase() : class328.field4850.field5129.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Z")
    public final boolean method3101(int arg0) {
        field7804++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
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
                this.method3108("invalidhost", arg0);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class446.field6550 = true;
        field7782++;
        class534.field7901 = true;
    }

    @OriginalMember(owner = "client!qn", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field7792++;
    }

    @OriginalMember(owner = "client!qn", name = "start", descriptor = "()V")
    public final void start() {
        field7805++;
        if (class156.field1994 == this && !class281.field4175) {
            class584.field8684 = 0L;
        }
    }

    @OriginalMember(owner = "client!qn", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field7778++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
    public static void method3102(byte arg0) {
        if (arg0 >= -11) {
            providesignlink(null);
        }
        field7774 = null;
        field7777 = null;
        field7779 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZZ)V")
    private final void method3103(boolean arg0, boolean arg1) {
        field7780++;
        if (arg0) {
            this.method3100(true);
        }
        synchronized (this) {
            if (class281.field4175) {
                return;
            }
            class281.field4175 = true;
        }
        if (class328.field4850.field5129 != null) {
            class328.field4850.field5129.destroy();
        }
        try {
            this.method3109((byte) 116);
        } catch (Exception var10) {
        }
        if (this.field7793) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field7793 = false;
        }
        class75.method438(-21406, true);
        class390.method2359(14306);
        if (class110.field1401 != null) {
            try {
                class110.field1401.removeFocusListener(this);
                class110.field1401.getParent().remove(class110.field1401);
            } catch (Exception var8) {
            }
        }
        if (class328.field4850 != null) {
            try {
                class328.field4850.method2171(54);
            } catch (Exception var7) {
            }
        }
        this.method3104(arg0);
        if (class248.field3628 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
    public abstract void method3104(boolean arg0);

    @OriginalMember(owner = "client!qn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field7799++;
        class446.field6550 = false;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIII)V")
    public final void method3105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7798++;
        try {
            if (class156.field1994 == null) {
                class124.field1632 = 0;
                class156.field1994 = this;
                class566.field8405 = arg3;
                class467.field6748 = arg0;
                class337.field4944 = arg4;
                class564.field8356 = arg4;
                class522.field7735 = arg1;
                class507.field7548 = arg1;
                if (class328.field4850 == null) {
                    class97.field1217 = class328.field4850 = new class353(this, arg2, null, 0);
                }
                class286 var6 = class328.field4850.method2159(1, (byte) 26, this);
                while (var6.field4208 == 0) {
                    class428.method2624(1, 10L);
                }
            } else {
                class533.field7892++;
                if (class533.field7892 >= 3) {
                    this.method3108("alreadyloaded", -1);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class31.method140(null, arg0 - 115, var8);
            this.method3108("crash", arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZLjava/lang/String;IIBI)V")
    public final void method3106(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5, byte arg6, int arg7) {
        field7800++;
        try {
            class522.field7735 = arg5;
            class507.field7548 = arg5;
            class337.field4944 = arg7;
            class564.field8356 = arg7;
            class467.field6748 = 0;
            class566.field8405 = arg1;
            class124.field1632 = 0;
            class156.field1994 = this;
            class248.field3628 = new Frame();
            class248.field3628.setTitle("Jagex");
            class248.field3628.setResizable(true);
            class248.field3628.addWindowListener(this);
            class248.field3628.setVisible(true);
            class248.field3628.toFront();
            Insets var9 = class248.field3628.getInsets();
            class248.field3628.setSize(class507.field7548 + var9.left + var9.right, class564.field8356 - -var9.top + var9.bottom);
            class97.field1217 = class328.field4850 = new class353(null, arg0, arg3, arg4);
            class286 var10 = class328.field4850.method2159(1, (byte) 26, this);
            if (arg6 >= -48) {
                field7774 = null;
            }
            while (var10.field4208 == 0) {
                class428.method2624(1, 10L);
            }
        } catch (Exception var12) {
            class31.method140(null, -102, var12);
        }
    }

    @OriginalMember(owner = "client!qn", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field7783++;
        if (class248.field3628 == null) {
            return class328.field4850 == null || class328.field4850.field5129 == this ? super.getParameter(arg0) : class328.field4850.field5129.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field7789++;
    }

    @OriginalMember(owner = "client!qn", name = "stop", descriptor = "()V")
    public final void stop() {
        field7788++;
        if (class156.field1994 == this && !class281.field4175) {
            class584.field8684 = class450.method2719((byte) 125) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)Z")
    public static final boolean method3107(int arg0, byte arg1) {
        if (arg1 <= 74) {
            providesignlink(null);
        }
        field7790++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method3108(String arg0, int arg1) {
        field7806++;
        if (this.field7776) {
            return;
        }
        this.field7776 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != -1) {
                this.init();
            }
            class222.method1460(false, "loggedout", class328.field4850.field5129);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
    public abstract void method3109(byte arg0);

    @OriginalMember(owner = "client!qn", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field7791++;
    }

    @OriginalMember(owner = "client!qn", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field7807++;
        if (class156.field1994 != this || class281.field4175) {
            return;
        }
        class534.field7901 = true;
        if (class309.field4504 && (class450.method2719((byte) -29) - class34.field369) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class507.field7548 <= var2.width && class564.field8356 <= var2.height) {
                class492.field7436 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
    public abstract void method3110(int arg0);

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
    private final void method3111(int arg0) {
        field7781++;
        long var2 = class450.method2719((byte) -97);
        long var4 = class530.field7867[class349.field5068];
        class530.field7867[class349.field5068] = var2;
        class349.field5068 = class349.field5068 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class553.field8230 = ((var6 >> 1) + 32000) / var6;
        }
        if (class200.field3001++ > 50) {
            class534.field7901 = true;
            class200.field3001 -= 50;
            class110.field1401.setSize(class522.field7735, class337.field4944);
            class110.field1401.setVisible(true);
            if (class248.field3628 != null && class644.field9345 == null) {
                Insets var7 = class248.field3628.getInsets();
                class110.field1401.setLocation(class124.field1632 + var7.left, class467.field6748 + var7.top);
            } else {
                class110.field1401.setLocation(class124.field1632, class467.field6748);
            }
        }
        this.method3098(68);
        int var8 = 8 % ((18 - arg0) / 54);
    }

    @OriginalMember(owner = "client!qn", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field7796++;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)V")
    public abstract void method3112(byte arg0);

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)Ljava/lang/String;")
    public String method3113(byte arg0) {
        field7787++;
        return arg0 > -40 ? null : null;
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)Z")
    public final boolean method3114(int arg0) {
        if (arg0 > -34) {
            method3107(-33, (byte) -67);
        }
        field7786++;
        return class53.method271((byte) -114, "jaclib");
    }
}
