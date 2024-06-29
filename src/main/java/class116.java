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

@OriginalClass("client!ne")
public abstract class class116 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Z")
    private boolean field2027 = false;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[[I")
    public static int[][] field2023 = new int[104][104];

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lij;")
    public static class50 field2021 = class78.method578(127, "<img=1>");

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Lda;")
    public static class22 field2047;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "Z")
    public static boolean field2056;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Z")
    public static boolean field2058;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILjava/lang/String;IBI)V")
    public final void method830(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5, int arg6) {
        try {
            class1.field1 = arg2;
            class136.field2370 = arg6;
            class182.field3004 = this;
            class74.field1402 = arg0;
            class251.field4357 = new Frame();
            class251.field4357.setTitle("Jagex");
            class251.field4357.setResizable(false);
            class251.field4357.addWindowListener(this);
            class251.field4357.setVisible(true);
            class251.field4357.toFront();
            Insets var8 = class251.field4357.getInsets();
            class251.field4357.setSize(var8.left + arg2 + var8.right, var8.bottom + arg6 + var8.top);
            class233.field3910 = class186.field3058 = new class138(true, (Applet) null, arg1, arg3, arg4);
            class186.field3058.method956(this, (byte) -128, 1);
            if (arg5 < 89) {
                this.field2027 = false;
            }
        } catch (Exception var10) {
            class121.method883((String) null, (byte) -86, var10);
        }
        field2052++;
    }

    @OriginalMember(owner = "client!ne", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2033++;
        class17.field374 = false;
    }

    @OriginalMember(owner = "client!ne", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2039++;
        if (class251.field4357 == null) {
            return class186.field3058 == null || class186.field3058.field2408 == this ? super.getCodeBase() : class186.field3058.field2408.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2035++;
        class17.field374 = true;
        class28.field599 = true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILda;)Lea;")
    public static final class67 method831(int arg0, int arg1, int arg2, class22 arg3) {
        field2031++;
        if (arg1 == -1) {
            return class79.method581((byte) -118, arg2, arg3, arg0) ? class82.method595((byte) 1) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "run", descriptor = "()V")
    public final void run() {
        field2051++;
        try {
            if (class138.field2397 != null) {
                String var1 = class138.field2397.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class138.field2390;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method835("wrongjava", false);
                        return;
                    }
                    class68.field1275 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class138.field2390 == null || class138.field2390.equals("1.4.2"))) {
                    this.method835("wrongjava", false);
                    return;
                }
            }
            if (class186.field3058.field2408 != null) {
                Method var3 = class138.field2403;
                if (var3 != null) {
                    try {
                        var3.invoke(class186.field3058.field2408, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method841(-80);
            class221.field3725 = class252.method1709(class228.field3834, (byte) 98, class136.field2370, class1.field1);
            this.method613(true);
            class6.field73 = class142.method991(-94);
            while (class26.field558 == 0L || class26.field558 > class104.method785(-1)) {
                class17.field381 = class6.field73.method1032(class68.field1275, client.field1535, -17244);
                for (int var4 = 0; var4 < class17.field381; var4++) {
                    this.method832((byte) -113);
                }
                this.method833((byte) -104);
                class10.method69(class228.field3834, 1001, class186.field3058);
            }
        } catch (Exception var7) {
            class121.method883((String) null, (byte) -116, var7);
            this.method835("crash", false);
        }
        this.method840(16040, true);
    }

    @OriginalMember(owner = "client!ne", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2042++;
    }

    @OriginalMember(owner = "client!ne", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2049++;
        if (class251.field4357 == null) {
            return class186.field3058 == null || class186.field3058.field2408 == this ? super.getAppletContext() : class186.field3058.field2408.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    private final void method832(byte arg0) {
        field2053++;
        long var2 = class104.method785(-1);
        long var4 = class26.field559[class87.field1686];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class26.field559[class87.field1686] = var2;
        class87.field1686 = class87.field1686 + 1 & 0x1F;
        if (arg0 != -113) {
            this.field2027 = false;
        }
        synchronized (this) {
            class191.field3185 = class17.field374;
        }
        this.method604((byte) 79);
    }

    @OriginalMember(owner = "client!ne", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2034++;
    }

    @OriginalMember(owner = "client!ne", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2045++;
        if (class251.field4357 == null) {
            return class186.field3058 == null || class186.field3058.field2408 == this ? super.getDocumentBase() : class186.field3058.field2408.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public abstract void method611(byte arg0);

    @OriginalMember(owner = "client!ne", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2030++;
        if (class182.field3004 == this && !class203.field3378) {
            class26.field558 = class104.method785(-1);
            class162.method1137(-80, 5000L);
            class233.field3910 = null;
            this.method840(16040, false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2046++;
        if (class182.field3004 != this || class203.field3378) {
            return;
        }
        class28.field599 = true;
        if (class138.field2390 != null && class138.field2390.startsWith("1.5") && class104.method785(-1) - class108.field1935 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class1.field1 && var2.height >= class136.field2370) {
                class27.field579 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    private final void method833(byte arg0) {
        if (arg0 >= -82) {
            this.field2027 = true;
        }
        field2041++;
        long var2 = class104.method785(-1);
        long var4 = class3.field42[class259.field4507];
        class3.field42[class259.field4507] = var2;
        class259.field4507 = class259.field4507 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class227.field3825 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class222.field3734++) > 50) {
            class28.field599 = true;
            class222.field3734 -= 50;
            class228.field3834.setSize(class1.field1, class136.field2370);
            class228.field3834.setVisible(true);
            if (class251.field4357 != null && class126.field2211 == null) {
                Insets var7 = class251.field4357.getInsets();
                class228.field3834.setLocation(var7.left, class90.field1717 + var7.top);
            } else {
                class228.field3834.setLocation(0, class90.field1717);
            }
        }
        this.method620(-1);
    }

    @OriginalMember(owner = "client!ne", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2043++;
    }

    @OriginalMember(owner = "client!ne", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ne", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2028++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public abstract void method613(boolean arg0);

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    public static void method834(byte arg0) {
        field2023 = null;
        if (arg0 <= 32) {
            method837(true);
        }
        field2021 = null;
        field2047 = null;
    }

    @OriginalMember(owner = "client!ne", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2038++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method835(String arg0, boolean arg1) {
        field2020++;
        if (this.field2027) {
            return;
        }
        this.field2027 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg1) {
            this.getParameter((String) null);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
    public final void method836(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2025++;
        try {
            if (class182.field3004 == null) {
                class74.field1402 = arg3;
                class182.field3004 = this;
                class136.field2370 = arg2;
                class1.field1 = arg0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class186.field3058 == null) {
                    class233.field3910 = class186.field3058 = new class138(false, this, arg1, (String) null, 0);
                }
                class186.field3058.method956(this, (byte) -124, 1);
                if (arg4 != -4) {
                    this.focusGained((FocusEvent) null);
                }
            } else {
                class57.field1033++;
                if (class57.field1033 >= 3) {
                    this.method835("alreadyloaded", false);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class121.method883((String) null, (byte) -108, var8);
            this.method835("crash", false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2032++;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V")
    public static final void method837(boolean arg0) {
        class227.field3816++;
        class190.field3141.method1598((byte) -97, 38);
        for (class87 var1 = (class87) class132.field2304.method446(1); var1 != null; var1 = (class87) class132.field2304.method448((byte) 63)) {
            if (var1.field1676 == 0) {
                class69.method529(var1, 107, true);
            }
        }
        if (class220.field3676 != null) {
            class140.method979((byte) 28, class220.field3676);
            class220.field3676 = null;
        }
        if (arg0) {
            field2055++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2040++;
        if (class251.field4357 == null) {
            return class186.field3058 == null || class186.field3058.field2408 == this ? super.getParameter(arg0) : class186.field3058.field2408.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2029++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
    public final boolean method838(int arg0) {
        field2048++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 <= 105) {
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
                this.method835("invalidhost", false);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)V")
    public abstract void method604(byte arg0);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLda;)V")
    public static final void method839(byte arg0, class22 arg1) {
        field2036++;
        class155.field2706 = arg1;
        if (arg0 != -107) {
            field2024 = 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "stop", descriptor = "()V")
    public final void stop() {
        field2050++;
        if (class182.field3004 == this && !class203.field3378) {
            class26.field558 = class104.method785(-1) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ne", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2022++;
    }

    @OriginalMember(owner = "client!ne", name = "providesignlink", descriptor = "(Ln;)V")
    public static final void providesignlink(class138 arg0) {
        field2026++;
        class186.field3058 = arg0;
        class233.field3910 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
    private final void method840(int arg0, boolean arg1) {
        field2037++;
        synchronized (this) {
            if (class203.field3378) {
                return;
            }
            class203.field3378 = true;
        }
        if (class186.field3058.field2408 != null) {
            class186.field3058.field2408.destroy();
        }
        try {
            this.method611((byte) 77);
        } catch (Exception var9) {
        }
        if (class228.field3834 != null) {
            try {
                class228.field3834.removeFocusListener(this);
                class228.field3834.getParent().remove(class228.field3834);
            } catch (Exception var8) {
            }
        }
        if (class186.field3058 != null) {
            try {
                class186.field3058.method958(77);
            } catch (Exception var7) {
            }
        }
        this.method607((byte) -111);
        if (class251.field4357 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (arg0 != 16040) {
            method834((byte) -55);
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ne", name = "start", descriptor = "()V")
    public final void start() {
        field2044++;
        if (class182.field3004 == this && !class203.field3378) {
            class26.field558 = 0L;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public abstract void method620(int arg0);

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(B)V")
    public abstract void method607(byte arg0);

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public final synchronized void method841(int arg0) {
        if (arg0 > -68) {
            this.method832((byte) -84);
        }
        if (class228.field3834 != null) {
            class228.field3834.removeFocusListener(this);
            class228.field3834.getParent().remove(class228.field3834);
        }
        if (class120.field2116 != null) {
            class120.field2116.getParent().remove(class120.field2116);
            class120.field2116 = null;
        }
        Container var2;
        if (class126.field2211 != null) {
            var2 = class126.field2211;
        } else if (class251.field4357 == null) {
            var2 = class186.field3058.field2408;
        } else {
            var2 = class251.field4357;
        }
        field2054++;
        var2.setLayout((LayoutManager) null);
        if (class90.field1717 != 0) {
            class120.field2116 = new class250(this);
            var2.add(class120.field2116);
            class120.field2116.setSize(class1.field1, class90.field1717);
            class120.field2116.setVisible(true);
            if (class251.field4357 == var2) {
                Insets var3 = class251.field4357.getInsets();
                class120.field2116.setLocation(var3.left, var3.top);
            } else {
                class120.field2116.setLocation(0, 0);
            }
        }
        class228.field3834 = new class250(this);
        var2.add(class228.field3834);
        class228.field3834.setSize(class1.field1, class136.field2370);
        class228.field3834.setVisible(true);
        if (class251.field4357 == var2) {
            Insets var4 = class251.field4357.getInsets();
            class228.field3834.setLocation(var4.left, class90.field1717 + var4.top);
        } else {
            class228.field3834.setLocation(0, class90.field1717);
        }
        class228.field3834.addFocusListener(this);
        class228.field3834.requestFocus();
        class191.field3185 = true;
        class17.field374 = true;
        class28.field599 = true;
        class27.field579 = false;
        class108.field1935 = class104.method785(-1);
    }
}
