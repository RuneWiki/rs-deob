import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!td")
public abstract class class417 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!td", name = "v", descriptor = "Z")
    private boolean field6067 = false;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "Z")
    private boolean field6080 = false;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "Z")
    public static boolean field6081;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "Z")
    public static boolean field6082;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "Z")
    public static boolean field6085;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "Z")
    public static boolean field6087;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Z")
    public static boolean field6088;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "Z")
    public static boolean field6089;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "Z")
    public static boolean field6095;

    @OriginalMember(owner = "client!td", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 3)
    public final void windowDeactivated(WindowEvent arg0) {
        field6073++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 12)
    public final void method2509(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field6056++;
        try {
            if (class108.field1660 == null) {
                class31.field494 = arg6;
                class443.field6457 = arg6;
                class142.field2102 = 0;
                class487.field6930 = arg0;
                class319.field4702 = arg0;
                class525.field7410 = arg5;
                class612.field8577 = arg4;
                class608.field8561 = class421.field6129;
                class108.field1660 = this;
                class271.field4077 = class368.field5267 = new class4(arg1, arg2, arg3, class421.field6129 != null);
                class494 var8 = class368.field5267.method22(this, 1, (byte) -124);
                while (var8.field7024 == 0) {
                    class561.method3202(10L, (byte) -66);
                }
            } else {
                class109.field1677++;
                if (class109.field1677 >= 3) {
                    this.method2511(arg5 ^ 0xFFFFFF81, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class699.method3896(73, var10, null);
            this.method2511(arg5 ^ 0xFFFFFF81, "crash");
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z", line = 56)
    public final boolean method2510(int arg0) {
        field6062++;
        if (arg0 != -49) {
            field6075 = -93;
        }
        return class271.method1788("jagmisc", -52);
    }

    @OriginalMember(owner = "client!td", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 67)
    public final void windowActivated(WindowEvent arg0) {
        field6061++;
    }

    @OriginalMember(owner = "client!td", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 74)
    public final synchronized void paint(Graphics arg0) {
        field6079++;
        if (class108.field1660 != this || class519.field7320) {
            return;
        }
        class245.field3808 = true;
        if (class158.field2281 && class490.method2840(true) - class448.field6478 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class319.field4702 <= var2.width && var2.height >= class443.field6457) {
                class153.field2211 = true;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;)V", line = 97)
    public final void method2511(int arg0, String arg1) {
        field6051++;
        if (this.field6080) {
            return;
        }
        if (arg0 > -125) {
            this.windowIconified(null);
        }
        this.field6080 = true;
        System.out.println("error_game_" + arg1);
        try {
            class556.method3150(-21295, class421.field6129, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!td", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 125)
    public final void focusGained(FocusEvent arg0) {
        field6068++;
        class657.field9209 = true;
        class245.field3808 = true;
    }

    @OriginalMember(owner = "client!td", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 134)
    public final void focusLost(FocusEvent arg0) {
        class657.field9209 = false;
        field6046++;
    }

    @OriginalMember(owner = "client!td", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 142)
    public final void windowClosed(WindowEvent arg0) {
        field6058++;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 150)
    private final void method2512(int arg0) {
        field6047++;
        long var2 = class490.method2840(true);
        if (arg0 != 10483) {
            return;
        }
        long var4 = class492.field7001[class483.field6871];
        class492.field7001[class483.field6871] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class697.field9864 = ((var6 >> 1) + 32000) / var6;
        }
        class483.field6871 = class483.field6871 + 1 & 0x1F;
        if ((class141.field2083++) > 50) {
            class141.field2083 -= 50;
            class245.field3808 = true;
            class31.field486.setSize(class487.field6930, class31.field494);
            class31.field486.setVisible(true);
            if (class683.field9634 != null && class554.field7847 == null) {
                Insets var7 = class683.field9634.getInsets();
                class31.field486.setLocation(class142.field2102 + var7.left, class525.field7410 + var7.top);
            } else {
                class31.field486.setLocation(class142.field2102, class525.field7410);
            }
        }
        this.method1771(arg0 ^ 0x289B);
    }

    @OriginalMember(owner = "client!td", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 195)
    public final void windowIconified(WindowEvent arg0) {
        field6057++;
    }

    @OriginalMember(owner = "client!td", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 203)
    public final String getParameter(String arg0) {
        field6048++;
        if (class683.field9634 == null) {
            return class421.field6129 == null || class421.field6129 == this ? super.getParameter(arg0) : class421.field6129.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 220)
    public static final void method2513(int arg0, int arg1) {
        if (arg0 == 0) {
            class485.field6902.method2290(false, arg1);
            field6074++;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)Z", line = 231)
    public final boolean method2514(int arg0) {
        field6054++;
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
            }
            this.method2511(-128, "invalidhost");
            if (arg0 != 1) {
                field6075 = 122;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)Z", line = 269)
    public final boolean method2515(int arg0) {
        if (arg0 != 0) {
            field6075 = 91;
        }
        field6070++;
        return class271.method1788("jaclib", -117);
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Ljava/lang/String;", line = 282)
    public String method1774(int arg0) {
        field6053++;
        int var2 = -81 / ((arg0 - 27) / 50);
        return null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V", line = 292)
    private final void method2516(int arg0, boolean arg1) {
        field6077++;
        synchronized (this) {
            if (class519.field7320) {
                return;
            }
            class519.field7320 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class421.field6129 != null) {
            class421.field6129.destroy();
        }
        try {
            this.method1782(35);
        } catch (Exception var9) {
        }
        if (arg0 != 0) {
            this.init();
        }
        if (this.field6067) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field6067 = false;
        }
        class509.method2923(true, (byte) -123);
        class466.method2758(97);
        if (class31.field486 != null) {
            try {
                class31.field486.removeFocusListener(this);
                class31.field486.getParent().remove(class31.field486);
            } catch (Exception var7) {
            }
        }
        if (class368.field5267 != null) {
            try {
                class368.field5267.method17(125);
            } catch (Exception var6) {
            }
        }
        this.method1765(-1);
        if (class683.field9634 != null) {
            class683.field9634.setVisible(false);
            class683.field9634.dispose();
            class683.field9634 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!td", name = "start", descriptor = "()V", line = 368)
    public final void start() {
        field6055++;
        if (class108.field1660 == this && !class519.field7320) {
            class190.field2737 = 0L;
        }
    }

    @OriginalMember(owner = "client!td", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 383)
    public final URL getCodeBase() {
        field6059++;
        if (class683.field9634 == null) {
            return class421.field6129 == null || class421.field6129 == this ? super.getCodeBase() : class421.field6129.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 401)
    public final void update(Graphics arg0) {
        field6049++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 409)
    private final void method2517(byte arg0) {
        field6050++;
        if (arg0 != 89) {
            return;
        }
        long var2 = class490.method2840(true);
        long var4 = class307.field4550[class277.field4190];
        class307.field4550[class277.field4190] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class277.field4190 = class277.field4190 + 1 & 0x1F;
        synchronized (this) {
            class67.field1229 = class657.field9209;
        }
        this.method1784(-59);
    }

    @OriginalMember(owner = "client!td", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 452)
    public final URL getDocumentBase() {
        field6072++;
        if (class683.field9634 == null) {
            return class421.field6129 == null || class421.field6129 == this ? super.getDocumentBase() : class421.field6129.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "stop", descriptor = "()V", line = 466)
    public final void stop() {
        field6076++;
        if (class108.field1660 == this && !class519.field7320) {
            class190.field2737 = class490.method2840(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!td", name = "destroy", descriptor = "()V", line = 477)
    public final void destroy() {
        field6066++;
        if (class108.field1660 == this && !class519.field7320) {
            class190.field2737 = class490.method2840(true);
            class561.method3202(5000L, (byte) -41);
            class271.field4077 = null;
            this.method2516(0, false);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIIIIIILjava/lang/String;)V", line = 492)
    public final void method2518(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        try {
            class108.field1660 = this;
            class487.field6930 = arg6;
            class319.field4702 = arg6;
            class31.field494 = arg5;
            class443.field6457 = arg5;
            class608.field8561 = null;
            int var9 = 59 / ((-arg4 - 16) / 60);
            class612.field8577 = arg3;
            class525.field7410 = 0;
            class142.field2102 = 0;
            class683.field9634 = new Frame();
            class683.field9634.setTitle("Jagex");
            class683.field9634.setResizable(true);
            class683.field9634.addWindowListener(this);
            class683.field9634.setVisible(true);
            class683.field9634.toFront();
            Insets var10 = class683.field9634.getInsets();
            class683.field9634.setSize(class319.field4702 + var10.left + var10.right, class443.field6457 - (-var10.top - var10.bottom));
            class271.field4077 = class368.field5267 = new class4(arg1, arg7, arg2, true);
            class494 var11 = class368.field5267.method22(this, 1, (byte) -122);
            while (var11.field7024 == 0) {
                class561.method3202(10L, (byte) -124);
            }
        } catch (Exception var13) {
            class699.method3896(70, var13, null);
        }
        field6069++;
    }

    @OriginalMember(owner = "client!td", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 535)
    public final AppletContext getAppletContext() {
        field6052++;
        if (class683.field9634 == null) {
            return class421.field6129 == null || class421.field6129 == this ? super.getAppletContext() : class421.field6129.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 554)
    public final void windowDeiconified(WindowEvent arg0) {
        field6065++;
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V", line = 561)
    public synchronized void method1781(int arg0) {
        field6064++;
        if (class31.field486 != null) {
            class31.field486.removeFocusListener(this);
            class31.field486.getParent().setBackground(Color.black);
            class31.field486.getParent().remove(class31.field486);
        }
        Container var2;
        if (class554.field7847 != null) {
            var2 = class554.field7847;
        } else if (class683.field9634 != null) {
            var2 = class683.field9634;
        } else if (class421.field6129 == null) {
            var2 = class108.field1660;
        } else {
            var2 = class421.field6129;
        }
        var2.setLayout(null);
        class31.field486 = new class130(this);
        var2.add(class31.field486);
        if (arg0 != 2) {
            this.focusLost(null);
        }
        class31.field486.setSize(class487.field6930, class31.field494);
        class31.field486.setVisible(true);
        if (class683.field9634 == var2) {
            Insets var3 = class683.field9634.getInsets();
            class31.field486.setLocation(var3.left + class142.field2102, var3.top - -class525.field7410);
        } else {
            class31.field486.setLocation(class142.field2102, class525.field7410);
        }
        class31.field486.addFocusListener(this);
        class31.field486.requestFocus();
        class657.field9209 = true;
        class67.field1229 = true;
        class245.field3808 = true;
        class153.field2211 = false;
        class448.field6478 = class490.method2840(true);
    }

    @OriginalMember(owner = "client!td", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 616)
    public static final void provideLoaderApplet(Applet arg0) {
        field6071++;
        class421.field6129 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 637)
    public final void windowOpened(WindowEvent arg0) {
        field6078++;
    }

    @OriginalMember(owner = "client!td", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 646)
    public final void windowClosing(WindowEvent arg0) {
        field6060++;
        this.destroy();
    }

    @OriginalMember(owner = "client!td", name = "run", descriptor = "()V", line = 654)
    public final void run() {
        field6063++;
        try {
            if (class4.field28 != null) {
                String var1 = class4.field28.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class4.field35;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2511(-126, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class4.field35 == null || class4.field35.equals("1.4.2"))) {
                    this.method2511(-126, "wrongjava");
                    return;
                }
            }
            if (class4.field35 != null && class4.field35.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class4.field35.length() > var3) {
                    char var5 = class4.field35.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var5 - (48 - var4 * 10);
                    var3++;
                }
                if (var4 >= 5) {
                    class158.field2281 = true;
                }
            }
            Applet var6 = class108.field1660;
            if (class421.field6129 != null) {
                var6 = class421.field6129;
            }
            Method var7 = class4.field38;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class235.method1607(false);
            class40.method456(-100);
            this.method1781(2);
            this.method1773(3541);
            class458.field6557 = class20.method233(3095);
            while (class190.field2737 == 0L || class490.method2840(true) < class190.field2737) {
                class37.field633 = class458.field6557.method1101(class259.field3942, -94);
                for (int var8 = 0; var8 < class37.field633; var8++) {
                    this.method2517((byte) 89);
                }
                this.method2512(10483);
                class182.method1231(class368.field5267, (byte) -86, class31.field486);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class699.method3896(90, var20, this.method1774(80));
            this.method2511(-127, "crash");
        } finally {
            Object var13 = null;
            this.method2516(0, true);
        }
    }

    @OriginalMember(owner = "client!td", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    public abstract void method1771(int arg0);

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    public abstract void method1765(int arg0);

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
    public abstract void method1784(int arg0);

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V")
    public abstract void method1782(int arg0);

    @OriginalMember(owner = "client!td", name = "k", descriptor = "(I)V")
    public abstract void method1773(int arg0);
}
