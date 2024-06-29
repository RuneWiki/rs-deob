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

@OriginalClass("client!ak")
public abstract class class128 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "Z")
    private boolean field1997 = false;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field1988 = 0;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Lng;")
    public static class245 field2001;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "[[[I")
    public static int[][][] field1993;

    @OriginalMember(owner = "client!ak", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 4)
    public final void windowDeactivated(WindowEvent arg0) {
        field2000++;
    }

    @OriginalMember(owner = "client!ak", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 12)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1998++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 20)
    public final synchronized void method860(int arg0) {
        field2016++;
        if (class302.field4665 != null) {
            class302.field4665.removeFocusListener(this);
            class302.field4665.getParent().remove(class302.field4665);
        }
        Container var2;
        if (class63.field919 != null) {
            var2 = class63.field919;
        } else if (class261.field4045 == null) {
            var2 = class89.field1359.field3569;
        } else {
            var2 = class261.field4045;
        }
        var2.setLayout((LayoutManager) null);
        class302.field4665 = new class299(this);
        var2.add(class302.field4665);
        class302.field4665.setSize(class334.field5203, class174.field2644);
        class302.field4665.setVisible(true);
        if (arg0 != 0) {
            field1988 = 31;
        }
        if (class261.field4045 == var2) {
            Insets var3 = class261.field4045.getInsets();
            class302.field4665.setLocation(class143.field2278 + var3.left, field1996 + var3.top);
        } else {
            class302.field4665.setLocation(class143.field2278, field1996);
        }
        class302.field4665.addFocusListener(this);
        class302.field4665.requestFocus();
        class174.field2673 = true;
        class2.field8 = true;
        class245.field3840 = true;
        class280.field4325 = false;
        class265.field4097 = class195.method1322(122);
    }

    @OriginalMember(owner = "client!ak", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 68)
    public final URL getDocumentBase() {
        field1989++;
        if (class261.field4045 == null) {
            return class89.field1359 == null || class89.field1359.field3569 == this ? super.getDocumentBase() : class89.field1359.field3569.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)V", line = 83)
    private final void method861(byte arg0, boolean arg1) {
        field2005++;
        synchronized (this) {
            if (class233.field3747) {
                return;
            }
            class233.field3747 = true;
        }
        if (class89.field1359.field3569 != null) {
            class89.field1359.field3569.destroy();
        }
        try {
            this.method876((byte) 100);
        } catch (Exception var12) {
        }
        if (class302.field4665 != null) {
            try {
                class302.field4665.removeFocusListener(this);
                class302.field4665.getParent().remove(class302.field4665);
            } catch (Exception var11) {
            }
        }
        if (arg0 < 112) {
            field1996 = 87;
        }
        if (class89.field1359 != null) {
            try {
                class89.field1359.method1514(true);
            } catch (Exception var10) {
            }
        }
        this.method868((byte) -99);
        if (class261.field4045 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ak", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 145)
    public final synchronized void paint(Graphics arg0) {
        field2011++;
        if (class294.field4541 != this || class233.field3747) {
            return;
        }
        class245.field3840 = true;
        if (class71.field1064 && !class333.field5166 && (class195.method1322(119) - class265.field4097) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class312.field4943 <= var2.width && var2.height >= class136.field2112) {
                class280.field4325 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 167)
    public final void windowActivated(WindowEvent arg0) {
        field1984++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V", line = 175)
    public static final void method862(String arg0, String arg1, int arg2, boolean arg3, String arg4, int arg5) {
        field2015++;
        if (!arg3) {
            field1993 = (int[][][]) ((int[][][]) null);
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class163.field2520[var6] = class163.field2520[var6 - 1];
            class192.field2905[var6] = class192.field2905[var6 - 1];
            class226.field3615[var6] = class226.field3615[var6 - 1];
            class343.field5336[var6] = class343.field5336[var6 - 1];
            class247.field3884[var6] = class247.field3884[var6 - 1];
        }
        class192.field2905[0] = arg0;
        class226.field3615[0] = arg4;
        class163.field2520[0] = arg5;
        class343.field5336[0] = arg1;
        class228.field3669++;
        class247.field3884[0] = arg2;
        class121.field1871 = class71.field1068;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 214)
    public static void method864(int arg0) {
        if (arg0 < 4) {
            method864(-111);
        }
        field2001 = null;
        field1993 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 225)
    public final void method865(boolean arg0, String arg1) {
        field1999++;
        if (this.field1997) {
            return;
        }
        this.field1997 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            class254.method1715("loggedout", (byte) -88, class89.field1359.field3569);
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 248)
    public final void windowDeiconified(WindowEvent arg0) {
        field1990++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIII)V", line = 257)
    public final void method866(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -19 / ((arg4 + 73) / 51);
        field1982++;
        try {
            if (class294.field4541 != null) {
                class10.field107++;
                if (class10.field107 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method865(true, "alreadyloaded");
                return;
            }
            class143.field2278 = 0;
            class174.field2644 = arg2;
            class136.field2112 = arg2;
            class215.field3400 = arg3;
            class334.field5203 = arg0;
            class312.field4943 = arg0;
            class294.field4541 = this;
            field1996 = 0;
            String var7 = this.getParameter("openwinjs");
            if (var7 != null && var7.equals("1")) {
                class74.field1096 = true;
            } else {
                class74.field1096 = false;
            }
            if (class89.field1359 == null) {
                class121.field1867 = class89.field1359 = new class224(this, arg1, (String) null, 0);
            }
            class252 var8 = class89.field1359.method1515(1, (byte) -5, this);
            while (var8.field3931 == 0) {
                class96.method657(10L, (byte) -115);
            }
            class92.field1427 = (Thread) var8.field3929;
        } catch (Exception var10) {
            class291.method1892((String) null, var10, -2);
            this.method865(true, "crash");
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 312)
    private final void method867(byte arg0) {
        long var2 = class195.method1322(121);
        field1994++;
        long var4 = class229.field3692[class204.field3086];
        class229.field3692[class204.field3086] = var2;
        class204.field3086 = class204.field3086 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class240.field3813 = ((var6 >> 1) + 32000) / var6;
        }
        if (class132.field2072++ > 50) {
            class132.field2072 -= 50;
            class245.field3840 = true;
            class302.field4665.setSize(class334.field5203, class174.field2644);
            class302.field4665.setVisible(true);
            if (class261.field4045 != null && class63.field919 == null) {
                Insets var7 = class261.field4045.getInsets();
                class302.field4665.setLocation(class143.field2278 + var7.left, field1996 + var7.top);
            } else {
                class302.field4665.setLocation(class143.field2278, field1996);
            }
        }
        if (arg0 <= 66) {
            field1993 = (int[][][]) ((int[][][]) null);
        }
        this.method863(false);
    }

    @OriginalMember(owner = "client!ak", name = "providesignlink", descriptor = "(Lwe;)V", line = 356)
    public static final void providesignlink(class224 arg0) {
        field1983++;
        class89.field1359 = arg0;
        class121.field1867 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 368)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1987++;
    }

    @OriginalMember(owner = "client!ak", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 377)
    public final void focusLost(FocusEvent arg0) {
        field1985++;
        class174.field2673 = false;
    }

    @OriginalMember(owner = "client!ak", name = "destroy", descriptor = "()V", line = 385)
    public final void destroy() {
        field2002++;
        if (class294.field4541 == this && !class233.field3747) {
            class131.field2060 = class195.method1322(125);
            class96.method657(5000L, (byte) -115);
            class121.field1867 = null;
            this.method861((byte) 118, false);
        }
    }

    @OriginalMember(owner = "client!ak", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 406)
    public final URL getCodeBase() {
        field1995++;
        if (class261.field4045 == null) {
            return class89.field1359 == null || class89.field1359.field3569 == this ? super.getCodeBase() : class89.field1359.field3569.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Lcb;", line = 423)
    public static final class37 method869(int arg0) {
        if (arg0 != 10) {
            field2001 = (class245) null;
        }
        field2009++;
        try {
            return (class37) Class.forName("ie").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 445)
    public final void windowOpened(WindowEvent arg0) {
        field2010++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)Z", line = 452)
    public static final boolean method870(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field2001 = (class245) null;
        }
        field2004++;
        boolean var2 = class279.method1836();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class279.method1838();
        } else if (!class279.method1834() || !class279.method1841() || !class279.method1837()) {
            arg1 = false;
        }
        class268.field4135 = arg1;
        class268.method1777(-27637, class89.field1359);
        if (arg1 == var2) {
            return false;
        } else {
            ((class97) class12.field126).method672(arg0 - 105);
            return true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "run", descriptor = "()V", line = 490)
    public final void run() {
        field2008++;
        try {
            if (class224.field3571 != null) {
                String var1 = class224.field3571.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class224.field3565;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method865(true, "wrongjava");
                        return;
                    }
                    class280.field4327 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class224.field3565 == null || class224.field3565.equals("1.4.2"))) {
                    this.method865(true, "wrongjava");
                    return;
                }
            }
            if (class224.field3565 != null && class224.field3565.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class224.field3565.length() > var3) {
                    char var5 = class224.field3565.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class71.field1064 = true;
                }
            }
            if (class89.field1359.field3569 != null) {
                Method var6 = class224.field3582;
                if (var6 != null) {
                    try {
                        var6.invoke(class89.field1359.field3569, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class288.method1881(1);
            this.method860(0);
            class42.field594 = class192.method1312(class302.field4665, class174.field2644, 1, class334.field5203);
            this.method873(14);
            class63.field950 = class42.method305((byte) -24);
            while (class131.field2060 == 0L || class131.field2060 > class195.method1322(122)) {
                class33.field429 = class63.field950.method495(false, class71.field1063, class280.field4327);
                for (int var8 = 0; var8 < class33.field429; var8++) {
                    this.method871((byte) -115);
                }
                this.method867((byte) 91);
                class220.method1468(1001, class89.field1359, class302.field4665);
            }
        } catch (Exception var11) {
            class291.method1892((String) null, var11, -2);
            this.method865(true, "crash");
        }
        this.method861((byte) 127, true);
    }

    @OriginalMember(owner = "client!ak", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 599)
    public final AppletContext getAppletContext() {
        field1991++;
        if (class261.field4045 == null) {
            return class89.field1359 == null || class89.field1359.field3569 == this ? super.getAppletContext() : class89.field1359.field3569.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V", line = 620)
    private final void method871(byte arg0) {
        field2014++;
        long var2 = class195.method1322(121);
        if (arg0 >= -98) {
            return;
        }
        long var4 = class29.field364[class334.field5202];
        class29.field364[class334.field5202] = var2;
        if (var4 != 0L && var4 < var2) {
        }
        class334.field5202 = class334.field5202 + 1 & 0x1F;
        synchronized (this) {
            class2.field8 = class174.field2673;
        }
        this.method872(93);
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Z", line = 664)
    public final boolean method874(int arg0) {
        if (arg0 != 0) {
            field1988 = -32;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1981++;
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
                this.method865(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 699)
    public final String getParameter(String arg0) {
        field2003++;
        if (class261.field4045 == null) {
            return class89.field1359 == null || class89.field1359.field3569 == this ? super.getParameter(arg0) : class89.field1359.field3569.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 714)
    public final void focusGained(FocusEvent arg0) {
        class174.field2673 = true;
        field2013++;
        class245.field3840 = true;
    }

    @OriginalMember(owner = "client!ak", name = "start", descriptor = "()V", line = 723)
    public final void start() {
        field1992++;
        if (class294.field4541 == this && !class233.field3747) {
            class131.field2060 = 0L;
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 737)
    public final void windowIconified(WindowEvent arg0) {
        field2006++;
    }

    @OriginalMember(owner = "client!ak", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 747)
    public final void windowClosed(WindowEvent arg0) {
        field2012++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIZLjava/lang/String;III)V", line = 759)
    public final void method875(int arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5, int arg6, int arg7) {
        field2007++;
        try {
            class215.field3400 = arg6;
            class174.field2644 = arg7;
            class136.field2112 = arg7;
            field1996 = 0;
            class143.field2278 = 0;
            class334.field5203 = arg5;
            class312.field4943 = arg5;
            class294.field4541 = this;
            int var9 = 68 / ((30 - arg1) / 57);
            class261.field4045 = new Frame();
            class261.field4045.setTitle("Jagex");
            class261.field4045.setResizable(true);
            class261.field4045.addWindowListener(this);
            class261.field4045.setVisible(true);
            class261.field4045.toFront();
            Insets var10 = class261.field4045.getInsets();
            class261.field4045.setSize(class312.field4943 + var10.right + var10.left, class136.field2112 + var10.top + var10.bottom);
            class121.field1867 = class89.field1359 = new class224((Applet) null, arg2, arg4, arg0);
            class252 var11 = class89.field1359.method1515(1, (byte) -5, this);
            while (var11.field3931 == 0) {
                class96.method657(10L, (byte) -115);
            }
            class92.field1427 = (Thread) var11.field3929;
        } catch (Exception var13) {
            class291.method1892((String) null, var13, -2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "stop", descriptor = "()V", line = 808)
    public final void stop() {
        field1986++;
        if (class294.field4541 == this && !class233.field3747) {
            class131.field2060 = class195.method1322(121) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public abstract void method863(boolean arg0);

    @OriginalMember(owner = "client!ak", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public abstract void method868(byte arg0);

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public abstract void method872(int arg0);

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
    public abstract void method873(int arg0);

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
    public abstract void method876(byte arg0);
}
