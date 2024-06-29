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

@OriginalClass("client!df")
public abstract class class362 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Z")
    private boolean field5125 = false;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "Z")
    private boolean field5137 = false;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Z")
    public static boolean field5127 = false;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Lrha;")
    public static class455 field5131 = new class455();

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Z")
    public static boolean field5139;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "Z")
    public static boolean field5143;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "Z")
    public static boolean field5144;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Z")
    public static boolean field5148;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Z")
    public static boolean field5149;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "Z")
    public static boolean field5150;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "Z")
    public static boolean field5151;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "Z")
    public static boolean field5152;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "Z")
    public static boolean field5155;

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Z")
    public static boolean field5156;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "Z")
    public static boolean field5157;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "[I")
    public static int[] field5135;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public abstract void method895(byte arg0);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
    private final void method2171(boolean arg0, int arg1) {
        field5117++;
        synchronized (this) {
            if (class562.field7784) {
                return;
            }
            class562.field7784 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class343.field4881 != null) {
            class343.field4881.destroy();
        }
        try {
            this.method880(-11401);
        } catch (Exception var9) {
        }
        if (arg1 != 31) {
            return;
        }
        if (this.field5125) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field5125 = false;
        }
        class270.method1723(true, -121);
        class316.method1926(7957);
        if (class213.field3128 != null) {
            try {
                class213.field3128.removeFocusListener(this);
                class213.field3128.getParent().remove(class213.field3128);
            } catch (Exception var7) {
            }
        }
        if (class336.field4775 != null) {
            try {
                class336.field4775.method925(70);
            } catch (Exception var6) {
            }
        }
        this.method895((byte) -127);
        if (class410.field5617 != null) {
            class410.field5617.setVisible(false);
            class410.field5617.dispose();
            class410.field5617 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lkn;")
    public static final class340 method2172(int arg0, int arg1, int arg2) {
        field5133++;
        class340 var3 = new class340();
        var3.field4837 = -1;
        var3.field4832 = arg2 + arg1 + 5;
        var3.field4824 = -1;
        var3.field4827 = arg0 + 6;
        var3.field4822 = new int[var3.field4827][var3.field4832];
        var3.method2093(arg1 + 118);
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method2173(int arg0) {
        if (arg0 != -58) {
            method2173(8);
        }
        field5135 = null;
        field5131 = null;
    }

    @OriginalMember(owner = "client!df", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field5103++;
        if (class410.field5617 == null) {
            return class343.field4881 == null || class343.field4881 == this ? super.getCodeBase() : class343.field4881.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method2174(String arg0, byte arg1) {
        if (arg1 > -58) {
            field5138 = -54;
        }
        field5102++;
        if (this.field5137) {
            return;
        }
        this.field5137 = true;
        System.out.println("error_game_" + arg0);
        try {
            class154.method1204(class343.field4881, "loggedout", 22458);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/lang/String;IZII)V")
    public final void method2175(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field5115++;
        try {
            class149.field2396 = this;
            class518.field7115 = null;
            class424.field5897 = 0;
            class728.field10160 = 0;
            class448.field6174 = arg4;
            class668.field9393 = arg4;
            class178.field2665 = arg1;
            class709.field9923 = arg2;
            class688.field9724 = arg2;
            class410.field5617 = new Frame();
            class410.field5617.setTitle("Jagex");
            class410.field5617.setResizable(true);
            class410.field5617.addWindowListener(this);
            class410.field5617.setVisible(true);
            class410.field5617.toFront();
            Insets var9 = class410.field5617.getInsets();
            if (arg7 >= -21) {
                this.method2176(-92);
            }
            class410.field5617.setSize(var9.right + var9.left + class688.field9724, class668.field9393 + var9.bottom - -var9.top);
            class192.field2890 = class336.field4775 = new class111(arg0, arg3, arg6, true);
            class746 var10 = class336.field4775.method918(-6, 1, this);
            while (var10.field10365 == 0) {
                class579.method3405(10L, 10);
            }
        } catch (Exception var12) {
            class349.method2122(var12, null, 1);
        }
    }

    @OriginalMember(owner = "client!df", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field5129++;
    }

    @OriginalMember(owner = "client!df", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class343.field4881 = arg0;
        field5112++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
    public final boolean method2176(int arg0) {
        field5136++;
        if (arg0 != -58) {
            this.getParameter(null);
        }
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
                this.method2174("invalidhost", (byte) -126);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field5123++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method2177(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field5120++;
        try {
            if (class149.field2396 == null) {
                class518.field7115 = class343.field4881;
                class178.field2665 = arg0;
                class709.field9923 = arg6;
                class688.field9724 = arg6;
                class728.field10160 = 0;
                class149.field2396 = this;
                class448.field6174 = arg2;
                class668.field9393 = arg2;
                class424.field5897 = 0;
                int var8 = 63 / ((arg5 + 35) / 43);
                class192.field2890 = class336.field4775 = new class111(arg4, arg3, arg1, class343.field4881 != null);
                class746 var9 = class336.field4775.method918(-6, 1, this);
                while (var9.field10365 == 0) {
                    class579.method3405(10L, 10);
                }
            } else {
                class721.field10071++;
                if (class721.field10071 >= 3) {
                    this.method2174("alreadyloaded", (byte) -77);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var11) {
            class349.method2122(var11, null, 1);
            this.method2174("crash", (byte) -104);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public abstract void method897(int arg0);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)Z")
    public final boolean method2178(boolean arg0) {
        if (arg0) {
            field5110++;
            return class27.method224(97, "jagmisc");
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!df", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field5106++;
        if (class410.field5617 == null) {
            return class343.field4881 == null || class343.field4881 == this ? super.getAppletContext() : class343.field4881.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Z")
    public final boolean method2179(byte arg0) {
        if (arg0 >= -18) {
            this.field5125 = true;
        }
        field5132++;
        return class27.method224(123, "jagtheora");
    }

    @OriginalMember(owner = "client!df", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5116++;
        class366.field5185 = true;
        class291.field4243 = true;
    }

    @OriginalMember(owner = "client!df", name = "stop", descriptor = "()V")
    public final void stop() {
        field5134++;
        if (class149.field2396 == this && !class562.field7784) {
            class201.field2992 = class337.method2062(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
    public synchronized void method890(boolean arg0) {
        if (class213.field3128 != null) {
            class213.field3128.removeFocusListener(this);
            class213.field3128.getParent().setBackground(Color.black);
            class213.field3128.getParent().remove(class213.field3128);
        }
        field5107++;
        Container var2;
        if (class259.field3676 != null) {
            var2 = class259.field3676;
        } else if (class410.field5617 != null) {
            var2 = class410.field5617;
        } else if (class343.field4881 == null) {
            var2 = class149.field2396;
        } else {
            var2 = class343.field4881;
        }
        var2.setLayout(null);
        class213.field3128 = new class726(this);
        var2.add(class213.field3128);
        class213.field3128.setSize(class709.field9923, class448.field6174);
        class213.field3128.setVisible(true);
        if (class410.field5617 == var2) {
            Insets var3 = class410.field5617.getInsets();
            class213.field3128.setLocation(class728.field10160 + var3.left, class424.field5897 + var3.top);
        } else {
            class213.field3128.setLocation(class728.field10160, class424.field5897);
        }
        class213.field3128.addFocusListener(this);
        class213.field3128.requestFocus();
        class531.field7395 = arg0;
        class366.field5185 = true;
        class291.field4243 = true;
        class745.field10357 = false;
        class694.field9765 = class337.method2062(false);
    }

    @OriginalMember(owner = "client!df", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field5119++;
    }

    @OriginalMember(owner = "client!df", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field5113++;
        if (class410.field5617 == null) {
            return class343.field4881 == null || class343.field4881 == this ? super.getParameter(arg0) : class343.field4881.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    private final void method2180(int arg0) {
        field5126++;
        long var2 = class337.method2062(false);
        if (arg0 >= -23) {
            return;
        }
        long var4 = class467.field6367[class344.field4889];
        class467.field6367[class344.field4889] = var2;
        class344.field4889 = class344.field4889 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class531.field7395 = class366.field5185;
        }
        this.method897(-936);
    }

    @OriginalMember(owner = "client!df", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field5105++;
        if (class149.field2396 != this || class562.field7784) {
            return;
        }
        class291.field4243 = true;
        if (class303.field4345 && class337.method2062(false) - class694.field9765 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class688.field9724 && class668.field9393 <= var2.height) {
                class745.field10357 = true;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
    public static final boolean method2181(int arg0, int arg1) {
        field5121++;
        if (arg1 == -1) {
            return (arg0 & -arg0) == arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
    public abstract void method880(int arg0);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Z)V")
    public abstract void method900(boolean arg0);

    @OriginalMember(owner = "client!df", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field5101++;
    }

    @OriginalMember(owner = "client!df", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field5128++;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(Z)Z")
    public final boolean method2182(boolean arg0) {
        if (!arg0) {
            this.update(null);
        }
        field5114++;
        return class27.method224(114, "jaclib");
    }

    @OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
    public final void run() {
        field5104++;
        try {
            if (class111.field1591 != null) {
                String var1 = class111.field1591.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class111.field1592;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2174("wrongjava", (byte) -117);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class111.field1592 == null || class111.field1592.equals("1.4.2"))) {
                    this.method2174("wrongjava", (byte) -96);
                    return;
                }
            }
            if (class111.field1592 != null && class111.field1592.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class111.field1592.length()) {
                    char var5 = class111.field1592.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class303.field4345 = true;
                }
            }
            Applet var6 = class149.field2396;
            if (class343.field4881 != null) {
                var6 = class343.field4881;
            }
            Method var7 = class111.field1593;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class423.method2494((byte) -97);
            class179.method1298(0);
            this.method890(true);
            this.method891(123);
            class56.field876 = class728.method4044((byte) -92);
            while (class201.field2992 == 0L || class337.method2062(false) < class201.field2992) {
                class599.field8549 = class56.field876.method1414(class737.field10228, true);
                for (int var8 = 0; var8 < class599.field8549; var8++) {
                    this.method2180(-82);
                }
                this.method2183(-125);
                class697.method3912(4, class336.field4775, class213.field3128);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class349.method2122(var20, this.method898((byte) -113), 1);
            this.method2174("crash", (byte) -128);
        } finally {
            Object var13 = null;
            this.method2171(true, 31);
        }
    }

    @OriginalMember(owner = "client!df", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field5111++;
        if (class410.field5617 == null) {
            return class343.field4881 == null || class343.field4881 == this ? super.getDocumentBase() : class343.field4881.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!df", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field5100++;
    }

    @OriginalMember(owner = "client!df", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class366.field5185 = false;
        field5122++;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public abstract void method891(int arg0);

    @OriginalMember(owner = "client!df", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field5130++;
        if (class149.field2396 == this && !class562.field7784) {
            class201.field2992 = class337.method2062(false);
            class579.method3405(5000L, 10);
            class192.field2890 = null;
            this.method2171(false, 31);
        }
    }

    @OriginalMember(owner = "client!df", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field5108++;
        this.destroy();
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
    private final void method2183(int arg0) {
        field5118++;
        long var2 = class337.method2062(false);
        long var4 = class479.field6592[class14.field167];
        class479.field6592[class14.field167] = var2;
        class14.field167 = class14.field167 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class458.field6265 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class706.field9897++) > 50) {
            class291.field4243 = true;
            class706.field9897 -= 50;
            class213.field3128.setSize(class709.field9923, class448.field6174);
            class213.field3128.setVisible(true);
            if (class410.field5617 != null && class259.field3676 == null) {
                Insets var7 = class410.field5617.getInsets();
                class213.field3128.setLocation(class728.field10160 + var7.left, class424.field5897 + var7.top);
            } else {
                class213.field3128.setLocation(class728.field10160, class424.field5897);
            }
        }
        int var8 = 117 / ((arg0 + 73) / 45);
        this.method900(false);
    }

    @OriginalMember(owner = "client!df", name = "start", descriptor = "()V")
    public final void start() {
        field5109++;
        if (class149.field2396 == this && !class562.field7784) {
            class201.field2992 = 0L;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)Ljava/lang/String;")
    public String method898(byte arg0) {
        field5124++;
        if (arg0 > -92) {
            field5131 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!df", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field5099++;
    }
}
