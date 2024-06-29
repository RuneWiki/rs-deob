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

@OriginalClass("client!pq")
public abstract class class71 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
    private boolean field938 = false;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "Z")
    private boolean field933 = false;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "Lim;")
    public static class353 field960 = new class353(6, -1);

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field964 = new String[200];

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "Lim;")
    public static class353 field963 = new class353(95, 0);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!pq", name = "O", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!pq", name = "R", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!pq", name = "T", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!pq", name = "U", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!pq", name = "V", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "Z")
    public static boolean field968;

    @OriginalMember(owner = "client!pq", name = "S", descriptor = "Z")
    public static boolean field971;

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "[Z")
    public static boolean[] field965;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Ljava/lang/String;")
    public String method404(int arg0) {
        field941++;
        if (arg0 != -15238) {
            this.method409((byte) -18);
        }
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)V")
    private final void method405(boolean arg0, int arg1) {
        field953++;
        synchronized (this) {
            if (class195.field2530) {
                return;
            }
            class195.field2530 = true;
        }
        if (class31.field488.field3644 != null) {
            class31.field488.field3644.destroy();
        }
        if (arg1 <= 15) {
            this.method405(true, 65);
        }
        try {
            this.method414(1200);
        } catch (Exception var10) {
        }
        if (this.field933) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field933 = false;
        }
        class243.method1509(true, -107);
        class513.method2860(0);
        if (class141.field1806 != null) {
            try {
                class141.field1806.removeFocusListener(this);
                class141.field1806.getParent().remove(class141.field1806);
            } catch (Exception var8) {
            }
        }
        if (class31.field488 != null) {
            try {
                class31.field488.method1737((byte) -120);
            } catch (Exception var7) {
            }
        }
        this.method417(-95);
        if (class247.field3111 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!pq", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field932++;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
    private final void method406(int arg0) {
        field949++;
        long var2 = class348.method2175(-126);
        long var4 = class150.field1956[class339.field4729];
        class150.field1956[class339.field4729] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class10.field92 = ((var6 >> 1) + 32000) / var6;
        }
        class339.field4729 = class339.field4729 + 1 & 0x1F;
        if (arg0 > -76) {
            this.method410(78, -110, 124, -39, 86);
        }
        if ((class171.field2179++) > 50) {
            class503.field7003 = true;
            class171.field2179 -= 50;
            class141.field1806.setSize(class502.field6955, class604.field8711);
            class141.field1806.setVisible(true);
            if (class247.field3111 != null && class558.field7815 == null) {
                Insets var7 = class247.field3111.getInsets();
                class141.field1806.setLocation(class223.field2857 + var7.left, class221.field2819 + var7.top);
            } else {
                class141.field1806.setLocation(class223.field2857, class221.field2819);
            }
        }
        this.method419(-85);
    }

    @OriginalMember(owner = "client!pq", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field950++;
    }

    @OriginalMember(owner = "client!pq", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field944++;
        if (class392.field5440 == this && !class195.field2530) {
            class423.field5736 = class348.method2175(-127);
            class353.method2204(5000L, 7806);
            class78.field1062 = null;
            this.method405(false, 124);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Z")
    public final boolean method407(byte arg0) {
        if (arg0 < 84) {
            field964 = null;
        }
        field958++;
        return class558.method3140("jaclib", (byte) -46);
    }

    @OriginalMember(owner = "client!pq", name = "run", descriptor = "()V")
    public final void run() {
        field961++;
        try {
            label110: {
                if (class279.field3645 != null) {
                    String var1 = class279.field3645.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class279.field3630;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method420(29509, "wrongjava");
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class279.field3630 == null || class279.field3630.equals("1.4.2"))) {
                        this.method420(29509, "wrongjava");
                        break label110;
                    }
                }
                if (class279.field3630 != null && class279.field3630.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class279.field3630.length()) {
                        char var5 = class279.field3630.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class373.field5191 = true;
                    }
                }
                if (class31.field488.field3644 != null) {
                    Method var6 = class279.field3652;
                    if (var6 != null) {
                        try {
                            var6.invoke(class31.field488.field3644, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class85.method480(false);
                class285.method1772((byte) -4);
                this.method415(-19900);
                this.method412(true);
                class521.field7263 = class150.method825((byte) 94);
                while (class423.field5736 == 0L || class348.method2175(-125) < class423.field5736) {
                    class174.field2252 = class521.field7263.method2007(class209.field2713, (byte) 42);
                    for (int var7 = 0; var7 < class174.field2252; var7++) {
                        this.method416(0);
                    }
                    this.method406(-86);
                    class333.method2104(-55, class141.field1806, class31.field488);
                }
            }
        } catch (Throwable var10) {
            class447.method2602(var10, 101, this.method404(-15238));
            this.method420(29509, "crash");
        }
        this.method405(true, 40);
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
    public static void method408(int arg0) {
        field963 = null;
        field964 = null;
        field965 = null;
        if (arg0 == 1) {
            field960 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field940++;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)Z")
    public final boolean method409(byte arg0) {
        field945++;
        if (arg0 >= -100) {
            field964 = null;
        }
        return class558.method3140("jagmisc", (byte) -46);
    }

    @OriginalMember(owner = "client!pq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field936++;
        class111.field1443 = true;
        class503.field7003 = true;
    }

    @OriginalMember(owner = "client!pq", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field957++;
    }

    @OriginalMember(owner = "client!pq", name = "providesignlink", descriptor = "(Lgaa;)V")
    public static final void providesignlink(class279 arg0) {
        field928++;
        class31.field488 = arg0;
        class78.field1062 = arg0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIII)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field947++;
        try {
            if (class392.field5440 != null) {
                class538.field7523++;
                if (class538.field7523 >= 3) {
                    this.method420(29509, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class392.field5440 = this;
            class221.field2819 = 0;
            class223.field2857 = 0;
            class604.field8711 = arg0;
            class322.field4443 = arg0;
            class539.field7546 = arg3;
            class502.field6955 = arg2;
            class611.field8788 = arg2;
            if (class31.field488 == null) {
                class78.field1062 = class31.field488 = new class279(this, arg1, null, 0);
            }
            class441 var6 = class31.field488.method1730(1, 2, this);
            while (var6.field6001 == 0) {
                class353.method2204(10L, 7806);
            }
        } catch (Throwable var9) {
            class447.method2602(var9, 66, null);
            this.method420(29509, "crash");
        }
        int var8 = 121 / ((73 - arg4) / 51);
    }

    @OriginalMember(owner = "client!pq", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field937++;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZIILjava/lang/String;IIBI)V")
    public final void method411(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5, byte arg6, int arg7) {
        try {
            class223.field2857 = 0;
            class502.field6955 = arg5;
            class611.field8788 = arg5;
            if (arg6 != 16) {
                return;
            }
            class604.field8711 = arg7;
            class322.field4443 = arg7;
            class539.field7546 = arg1;
            class221.field2819 = 0;
            class392.field5440 = this;
            class247.field3111 = new Frame();
            class247.field3111.setTitle("Jagex");
            class247.field3111.setResizable(true);
            class247.field3111.addWindowListener(this);
            class247.field3111.setVisible(true);
            class247.field3111.toFront();
            Insets var9 = class247.field3111.getInsets();
            class247.field3111.setSize(class611.field8788 + var9.left + var9.right, class322.field4443 + var9.top + var9.bottom);
            class78.field1062 = class31.field488 = new class279(null, arg2, arg3, arg4);
            class441 var10 = class31.field488.method1730(1, arg6 - 14, this);
            while (var10.field6001 == 0) {
                class353.method2204(10L, 7806);
            }
        } catch (Exception var12) {
            class447.method2602(var12, 103, null);
        }
        field943++;
    }

    @OriginalMember(owner = "client!pq", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field935++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!pq", name = "start", descriptor = "()V")
    public final void start() {
        field952++;
        if (class392.field5440 == this && !class195.field2530) {
            class423.field5736 = 0L;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public abstract void method412(boolean arg0);

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
    public abstract void method413(int arg0);

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)V")
    public abstract void method414(int arg0);

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "(I)V")
    public final synchronized void method415(int arg0) {
        field934++;
        if (class141.field1806 != null) {
            class141.field1806.removeFocusListener(this);
            class141.field1806.getParent().remove(class141.field1806);
        }
        Container var2;
        if (class558.field7815 != null) {
            var2 = class558.field7815;
        } else if (class247.field3111 == null) {
            var2 = class31.field488.field3644;
        } else {
            var2 = class247.field3111;
        }
        var2.setLayout(null);
        class141.field1806 = new class244(this);
        var2.add(class141.field1806);
        class141.field1806.setSize(class502.field6955, class604.field8711);
        class141.field1806.setVisible(true);
        if (class247.field3111 == var2) {
            Insets var3 = class247.field3111.getInsets();
            class141.field1806.setLocation(class223.field2857 + var3.left, var3.top - -class221.field2819);
        } else {
            class141.field1806.setLocation(class223.field2857, class221.field2819);
        }
        class141.field1806.addFocusListener(this);
        class141.field1806.requestFocus();
        class70.field921 = true;
        if (arg0 == -19900) {
            class111.field1443 = true;
            class503.field7003 = true;
            class485.field6770 = false;
            class26.field443 = class348.method2175(-121);
        }
    }

    @OriginalMember(owner = "client!pq", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field959++;
    }

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "(I)V")
    private final void method416(int arg0) {
        field930++;
        long var2 = class348.method2175(arg0 - 121);
        long var4 = class6.field56[class407.field5591];
        class6.field56[class407.field5591] = var2;
        class407.field5591 = class407.field5591 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class70.field921 = class111.field1443;
        }
        this.method413(arg0);
    }

    @OriginalMember(owner = "client!pq", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field946++;
        if (class247.field3111 == null) {
            return class31.field488 == null || class31.field488.field3644 == this ? super.getCodeBase() : class31.field488.field3644.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!pq", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field929++;
        if (class247.field3111 == null) {
            return class31.field488 == null || class31.field488.field3644 == this ? super.getAppletContext() : class31.field488.field3644.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field951++;
        if (class247.field3111 == null) {
            return class31.field488 == null || class31.field488.field3644 == this ? super.getParameter(arg0) : class31.field488.field3644.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field939++;
        if (class392.field5440 != this || class195.field2530) {
            return;
        }
        class503.field7003 = true;
        if (class373.field5191 && (class348.method2175(-126) - class26.field443) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class611.field8788 <= var2.width && class322.field4443 <= var2.height) {
                class485.field6770 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "(I)V")
    public abstract void method417(int arg0);

    @OriginalMember(owner = "client!pq", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field956++;
        if (class247.field3111 == null) {
            return class31.field488 == null || class31.field488.field3644 == this ? super.getDocumentBase() : class31.field488.field3644.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field948++;
    }

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "(I)Z")
    public final boolean method418(int arg0) {
        field955++;
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
            if (arg0 >= -92) {
                this.update(null);
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method420(29509, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "(I)V")
    public abstract void method419(int arg0);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method420(int arg0, String arg1) {
        field962++;
        if (this.field938) {
            return;
        }
        if (arg0 != 29509) {
            this.field933 = false;
        }
        this.field938 = true;
        System.out.println("error_game_" + arg1);
        try {
            class499.method2793("loggedout", (byte) 96, class31.field488.field3644);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!pq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class111.field1443 = false;
        field954++;
    }

    @OriginalMember(owner = "client!pq", name = "stop", descriptor = "()V")
    public final void stop() {
        field931++;
        if (class392.field5440 == this && !class195.field2530) {
            class423.field5736 = class348.method2175(-118) + 4000L;
        }
    }
}
