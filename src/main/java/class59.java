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

@OriginalClass("client!hc")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Z")
    private boolean field850 = false;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Ljava/lang/String;")
    public static String field853 = "rating: ";

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[C")
    public static char[] field856 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "[Lnm;")
    public static class212[] field870 = new class212[32768];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!hc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 13)
    public final void windowIconified(WindowEvent arg0) {
        field864++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 20)
    public final synchronized void method478(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field842++;
        if (class116.field1615 != null) {
            class116.field1615.removeFocusListener(this);
            class116.field1615.getParent().remove(class116.field1615);
        }
        Container var2;
        if (class134.field1966 != null) {
            var2 = class134.field1966;
        } else if (class184.field2976 == null) {
            var2 = class42.field581.field2181;
        } else {
            var2 = class184.field2976;
        }
        var2.setLayout((LayoutManager) null);
        class116.field1615 = new class222(this);
        var2.add(class116.field1615);
        class116.field1615.setSize(class127.field1841, class95.field1258);
        class116.field1615.setVisible(true);
        if (class184.field2976 == var2) {
            Insets var3 = class184.field2976.getInsets();
            class116.field1615.setLocation(class333.field5186 + var3.left, class200.field3208 + var3.top);
        } else {
            class116.field1615.setLocation(class333.field5186, class200.field3208);
        }
        class116.field1615.addFocusListener(this);
        class116.field1615.requestFocus();
        class290.field4477 = true;
        class230.field3596 = true;
        class256.field4051 = true;
        class333.field5183 = false;
        class80.field1091 = class219.method1609(-898);
    }

    @OriginalMember(owner = "client!hc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 67)
    public final void windowActivated(WindowEvent arg0) {
        field869++;
    }

    @OriginalMember(owner = "client!hc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 75)
    public final void focusGained(FocusEvent arg0) {
        field865++;
        class290.field4477 = true;
        class256.field4051 = true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V", line = 84)
    public final void method479(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field874++;
        if (arg4 <= 11) {
            this.method479(29, 104, -127, 115, 3);
        }
        try {
            if (class164.field2658 != null) {
                class345.field5350++;
                if (class345.field5350 >= 3) {
                    this.method488(-128, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class200.field3208 = 0;
            class127.field1841 = arg3;
            class287.field4434 = arg3;
            class333.field5186 = 0;
            class55.field769 = arg1;
            class164.field2658 = this;
            class95.field1258 = arg2;
            class333.field5181 = arg2;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class293.field4538 = true;
            } else {
                class293.field4538 = false;
            }
            if (class42.field581 == null) {
                class80.field1090 = class42.field581 = new class137(this, arg0, (String) null, 0);
            }
            class114 var7 = class42.field581.method1014(this, 6, 1);
            while (var7.field1595 == 0) {
                class272.method1918((byte) 22, 10L);
            }
            class246.field3842 = (Thread) var7.field1591;
        } catch (Exception var9) {
            client.method949((String) null, var9, 24);
            this.method488(-99, "crash");
        }
    }

    @OriginalMember(owner = "client!hc", name = "start", descriptor = "()V", line = 142)
    public final void start() {
        field868++;
        if (class164.field2658 == this && !class171.field2824) {
            class60.field878 = 0L;
        }
    }

    @OriginalMember(owner = "client!hc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 153)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field854++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 162)
    public static final void method480(boolean arg0) {
        field844++;
        if (class333.field5184 == null || class282.field4363 == null) {
            class333.field5184 = new int[256];
            class282.field4363 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class333.field5184[var1] = (int) (Math.sin(var2) * 4096.0D);
                class282.field4363[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (!arg0) {
            field856 = (char[]) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V", line = 202)
    private final void method481(int arg0, boolean arg1) {
        field858++;
        synchronized (this) {
            if (class171.field2824) {
                return;
            }
            class171.field2824 = true;
        }
        if (class42.field581.field2181 != null) {
            class42.field581.field2181.destroy();
        }
        try {
            this.method482(-82);
        } catch (Exception var12) {
        }
        if (class116.field1615 != null) {
            try {
                class116.field1615.removeFocusListener(this);
                class116.field1615.getParent().remove(class116.field1615);
            } catch (Exception var11) {
            }
        }
        if (arg0 != -26595) {
            this.windowClosing((WindowEvent) null);
        }
        if (class42.field581 != null) {
            try {
                class42.field581.method1020((byte) 110);
            } catch (Exception var10) {
            }
        }
        this.method477((byte) 118);
        if (class184.field2976 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!hc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 263)
    public final void windowOpened(WindowEvent arg0) {
        field849++;
    }

    @OriginalMember(owner = "client!hc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 276)
    public final void windowDeiconified(WindowEvent arg0) {
        field847++;
    }

    @OriginalMember(owner = "client!hc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 287)
    public final URL getCodeBase() {
        field855++;
        if (class184.field2976 == null) {
            return class42.field581 == null || class42.field581.field2181 == this ? super.getCodeBase() : class42.field581.field2181.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BB)V", line = 302)
    public static final void method483(byte arg0, byte arg1) {
        field863++;
        if (class214.field3376 == null) {
            class214.field3376 = new byte[4][104][104];
        }
        int var2 = 109 / ((24 - arg1) / 40);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    class214.field3376[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "run", descriptor = "()V", line = 338)
    public final void run() {
        field845++;
        try {
            if (class137.field2192 != null) {
                String var1 = class137.field2192.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class137.field2180;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method488(85, "wrongjava");
                        return;
                    }
                    class167.field2746 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class137.field2180 == null || class137.field2180.equals("1.4.2"))) {
                    this.method488(80, "wrongjava");
                    return;
                }
            }
            if (class137.field2180 != null && class137.field2180.startsWith("1.")) {
                int var3 = 0;
                for (int var4 = 2; class137.field2180.length() > var4; var4++) {
                    char var5 = class137.field2180.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class284.field4406 = true;
                }
            }
            if (class42.field581.field2181 != null) {
                Method var6 = class137.field2196;
                if (var6 != null) {
                    try {
                        var6.invoke(class42.field581.field2181, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class191.method1411((byte) -84);
            this.method478(0);
            class42.field583 = class29.method261(0, class116.field1615, class95.field1258, class127.field1841);
            this.method490(11);
            class56.field778 = class197.method1458(true);
            while (class60.field878 == 0L || class219.method1609(-898) < class60.field878) {
                class283.field4376 = class56.field778.method244(15, class167.field2746, class272.field4215);
                for (int var8 = 0; var8 < class283.field4376; var8++) {
                    this.method484(-100);
                }
                this.method491(0);
                class325.method2283((byte) -122, class116.field1615, class42.field581);
            }
        } catch (Exception var11) {
            client.method949((String) null, var11, 24);
            this.method488(-126, "crash");
        }
        this.method481(-26595, true);
    }

    @OriginalMember(owner = "client!hc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 446)
    public final AppletContext getAppletContext() {
        field873++;
        if (class184.field2976 == null) {
            return class42.field581 == null || class42.field581.field2181 == this ? super.getAppletContext() : class42.field581.field2181.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "stop", descriptor = "()V", line = 460)
    public final void stop() {
        field851++;
        if (class164.field2658 == this && !class171.field2824) {
            class60.field878 = class219.method1609(-898) + 4000L;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 473)
    private final void method484(int arg0) {
        if (arg0 > -74) {
            field856 = (char[]) null;
        }
        field871++;
        long var2 = class219.method1609(-898);
        long var4 = class94.field1245[class185.field3007];
        class94.field1245[class185.field3007] = var2;
        if (var4 != 0L && var2 <= var4) {
        }
        class185.field3007 = class185.field3007 + 1 & 0x1F;
        synchronized (this) {
            class230.field3596 = class290.field4477;
        }
        this.method489(-112);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V", line = 508)
    public static void method485(boolean arg0) {
        field853 = null;
        field870 = null;
        if (!arg0) {
            method483((byte) -71, (byte) 45);
        }
        field856 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIIILjava/lang/String;IIZ)V", line = 523)
    public final void method486(boolean arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, boolean arg7) {
        field872++;
        try {
            class127.field1841 = arg5;
            class287.field4434 = arg5;
            class55.field769 = arg2;
            class333.field5186 = 0;
            class95.field1258 = arg6;
            class333.field5181 = arg6;
            class200.field3208 = 0;
            class164.field2658 = this;
            class184.field2976 = new Frame();
            class184.field2976.setTitle("Jagex");
            class184.field2976.setResizable(true);
            class184.field2976.addWindowListener(this);
            class184.field2976.setVisible(arg7);
            class184.field2976.toFront();
            Insets var9 = class184.field2976.getInsets();
            class184.field2976.setSize(class287.field4434 + var9.right + var9.left, class333.field5181 + var9.bottom - -var9.top);
            class80.field1090 = class42.field581 = new class137((Applet) null, arg1, arg4, arg3);
            class114 var10 = class42.field581.method1014(this, 6, 1);
            while (var10.field1595 == 0) {
                class272.method1918((byte) 22, 10L);
            }
            class246.field3842 = (Thread) var10.field1591;
        } catch (Exception var12) {
            client.method949((String) null, var12, 24);
        }
    }

    @OriginalMember(owner = "client!hc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 562)
    public final void focusLost(FocusEvent arg0) {
        field867++;
        class290.field4477 = false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/lang/String;)V", line = 573)
    public final void method488(int arg0, String arg1) {
        field859++;
        if (this.field850) {
            return;
        }
        this.field850 = true;
        System.out.println("error_game_" + arg1);
        try {
            class209.method1531("loggedout", 10, class42.field581.field2181);
        } catch (Throwable var7) {
        }
        int var4 = 61 % ((-arg0 - 23) / 43);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!hc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 605)
    public final void windowDeactivated(WindowEvent arg0) {
        field846++;
    }

    @OriginalMember(owner = "client!hc", name = "providesignlink", descriptor = "(Lvc;)V", line = 612)
    public static final void providesignlink(class137 arg0) {
        class42.field581 = arg0;
        class80.field1090 = arg0;
        field852++;
    }

    @OriginalMember(owner = "client!hc", name = "destroy", descriptor = "()V", line = 620)
    public final void destroy() {
        field841++;
        if (class164.field2658 == this && !class171.field2824) {
            class60.field878 = class219.method1609(-898);
            class272.method1918((byte) 22, 5000L);
            class80.field1090 = null;
            this.method481(-26595, false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 634)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field843++;
    }

    @OriginalMember(owner = "client!hc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 642)
    public final void windowClosed(WindowEvent arg0) {
        field848++;
    }

    @OriginalMember(owner = "client!hc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 649)
    public final String getParameter(String arg0) {
        field857++;
        if (class184.field2976 == null) {
            return class42.field581 == null || class42.field581.field2181 == this ? super.getParameter(arg0) : class42.field581.field2181.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V", line = 665)
    private final void method491(int arg0) {
        long var2 = class219.method1609(-898);
        if (arg0 != 0) {
            return;
        }
        field862++;
        long var4 = class272.field4225[class66.field942];
        class272.field4225[class66.field942] = var2;
        class66.field942 = class66.field942 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class246.field3834 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class191.field3039++) > 50) {
            class191.field3039 -= 50;
            class256.field4051 = true;
            class116.field1615.setSize(class127.field1841, class95.field1258);
            class116.field1615.setVisible(true);
            if (class184.field2976 != null && class134.field1966 == null) {
                Insets var7 = class184.field2976.getInsets();
                class116.field1615.setLocation(class333.field5186 + var7.left, class200.field3208 + var7.top);
            } else {
                class116.field1615.setLocation(class333.field5186, class200.field3208);
            }
        }
        this.method487((byte) -49);
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)Z", line = 709)
    public final boolean method492(int arg0) {
        field866++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 1) {
                field870 = (class212[]) null;
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method488(-110, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 744)
    public final URL getDocumentBase() {
        field860++;
        if (class184.field2976 == null) {
            return class42.field581 == null || class42.field581.field2181 == this ? super.getDocumentBase() : class42.field581.field2181.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 761)
    public final synchronized void paint(Graphics arg0) {
        field861++;
        if (class164.field2658 != this || class171.field2824) {
            return;
        }
        class256.field4051 = true;
        if (class284.field4406 && !class109.field1458 && (class219.method1609(-898) - class80.field1091) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class287.field4434 && class333.field5181 <= var2.height) {
                class333.field5183 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public abstract void method477(byte arg0);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public abstract void method482(int arg0);

    @OriginalMember(owner = "client!hc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public abstract void method487(byte arg0);

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public abstract void method489(int arg0);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
    public abstract void method490(int arg0);
}
