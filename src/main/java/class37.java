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

@OriginalClass("client!qe")
public abstract class class37 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "Z")
    private boolean field585 = false;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field558 = 0;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Z")
    public static boolean field559 = false;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field572 = null;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[I")
    public static int[] field561 = new int[32];

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field586 = 2;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Ll;")
    public static class133 field571;

    @OriginalMember(owner = "client!qe", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 5)
    public final AppletContext getAppletContext() {
        field563++;
        if (class92.field1464 == null) {
            return class32.field471 == null || class32.field471.field2721 == this ? super.getAppletContext() : class32.field471.field2721.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 20)
    public final void windowIconified(WindowEvent arg0) {
        field589++;
    }

    @OriginalMember(owner = "client!qe", name = "run", descriptor = "()V", line = 27)
    public final void run() {
        field583++;
        try {
            if (class180.field2706 != null) {
                String var1 = class180.field2706.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class180.field2705;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method301("wrongjava", 31261);
                        return;
                    }
                    class98.field1567 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class180.field2705 == null || class180.field2705.equals("1.4.2"))) {
                    this.method301("wrongjava", 31261);
                    return;
                }
            }
            if (class180.field2705 != null && class180.field2705.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class180.field2705.length()) {
                    char var5 = class180.field2705.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + (var5 - '0');
                }
                if (var4 >= 5) {
                    class284.field4403 = true;
                }
            }
            if (class32.field471.field2721 != null) {
                Method var6 = class180.field2722;
                if (var6 != null) {
                    try {
                        var6.invoke(class32.field471.field2721, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class227.method1604(1048576);
            this.method307((byte) -8);
            class175.field2644 = class98.method727(class322.field5024, (byte) -92, class188.field2816, class238.field3782);
            this.method308(83);
            class192.field2881 = class270.method1857((byte) -62);
            while (class264.field4110 == 0L || class102.method743((byte) 127) < class264.field4110) {
                class169.field2559 = class192.field2881.method643(class98.field1567, class235.field3745, true);
                for (int var8 = 0; var8 < class169.field2559; var8++) {
                    this.method299(1);
                }
                this.method303((byte) 67);
                class315.method2135(class238.field3782, -9352, class32.field471);
            }
        } catch (Exception var11) {
            class184.method1322(var11, (String) null, (byte) -24);
            this.method301("crash", 31261);
        }
        this.method298(-65, true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)V", line = 140)
    private final void method298(int arg0, boolean arg1) {
        field575++;
        if (arg0 >= -55) {
            this.method301((String) null, 45);
        }
        synchronized (this) {
            if (class338.field5292) {
                return;
            }
            class338.field5292 = true;
        }
        if (class32.field471.field2721 != null) {
            class32.field471.field2721.destroy();
        }
        try {
            this.method302((byte) -104);
        } catch (Exception var12) {
        }
        if (class238.field3782 != null) {
            try {
                class238.field3782.removeFocusListener(this);
                class238.field3782.getParent().remove(class238.field3782);
            } catch (Exception var11) {
            }
        }
        if (class32.field471 != null) {
            try {
                class32.field471.method1285(114);
            } catch (Exception var10) {
            }
        }
        this.method306((byte) -95);
        if (class92.field1464 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 202)
    private final void method299(int arg0) {
        long var2 = class131.field2057[class194.field2904];
        long var4 = class102.method743((byte) 111);
        field566++;
        if (var2 != 0L && var4 > var2) {
        }
        class131.field2057[class194.field2904] = var4;
        class194.field2904 = class194.field2904 + arg0 & 0x1F;
        synchronized (this) {
            class163.field2458 = class125.field1961;
        }
        this.method300(-14201);
    }

    @OriginalMember(owner = "client!qe", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 228)
    public final void windowDeactivated(WindowEvent arg0) {
        field579++;
    }

    @OriginalMember(owner = "client!qe", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 240)
    public final void windowClosed(WindowEvent arg0) {
        field564++;
    }

    @OriginalMember(owner = "client!qe", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 250)
    public final void windowOpened(WindowEvent arg0) {
        field581++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 261)
    public final void method301(String arg0, int arg1) {
        field594++;
        if (this.field585 || arg1 != 31261) {
            return;
        }
        this.field585 = true;
        System.out.println("error_game_" + arg0);
        try {
            class3.method16("loggedout", class32.field471.field2721, arg1 - 31371);
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qe", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 288)
    public final synchronized void paint(Graphics arg0) {
        field570++;
        if (class212.field3231 != this || class338.field5292) {
            return;
        }
        client.field722 = true;
        if (class284.field4403 && !class94.field1516 && class102.method743((byte) 88) - class31.field454 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class284.field4427 <= var2.width && var2.height >= class284.field4387) {
                class48.field780 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 318)
    private final void method303(byte arg0) {
        field595++;
        long var2 = class102.method743((byte) 98);
        long var4 = class132.field2086[class149.field2265];
        if (arg0 < 60) {
            providesignlink((class180) null);
        }
        class132.field2086[class149.field2265] = var2;
        class149.field2265 = class149.field2265 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class292.field4541 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class282.field4352++) > 50) {
            class282.field4352 -= 50;
            client.field722 = true;
            class238.field3782.setSize(class188.field2816, class322.field5024);
            class238.field3782.setVisible(true);
            if (class92.field1464 != null && class195.field2917 == null) {
                Insets var7 = class92.field1464.getInsets();
                class238.field3782.setLocation(class81.field1283 + var7.left, class53.field895 + var7.top);
            } else {
                class238.field3782.setLocation(class81.field1283, class53.field895);
            }
        }
        this.method314(false);
    }

    @OriginalMember(owner = "client!qe", name = "providesignlink", descriptor = "(Lki;)V", line = 364)
    public static final void providesignlink(class180 arg0) {
        field587++;
        class32.field471 = arg0;
        class308.field4791 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "start", descriptor = "()V", line = 374)
    public final void start() {
        field565++;
        if (class212.field3231 == this && !class338.field5292) {
            class264.field4110 = 0L;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 387)
    public static void method304(int arg0) {
        int var1 = -48 % ((-arg0 - 10) / 54);
        field572 = null;
        field561 = null;
        field571 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLl;)V", line = 397)
    public static final void method305(byte arg0, class133 arg1) {
        field584++;
        class61.field990 = arg1.method970("p11_full", (byte) -10);
        class11.field170 = arg1.method970("p12_full", (byte) -10);
        class105.field1627 = arg1.method970("b12_full", (byte) -10);
        int var2 = -125 % ((arg0 - 65) / 43);
        class339.field5301 = arg1.method970("mapfunction", (byte) -10);
        class258.field4041 = arg1.method970("hitmarks", (byte) -10);
        class58.field937 = arg1.method970("hitbar_default", (byte) -10);
        class90.field1443 = arg1.method970("headicons_pk", (byte) -10);
        class238.field3781 = arg1.method970("headicons_prayer", (byte) -10);
        class204.field3071 = arg1.method970("hint_headicons", (byte) -10);
        class188.field2811 = arg1.method970("hint_mapmarkers", (byte) -10);
        class316.field4935 = arg1.method970("mapflag", (byte) -10);
        class150.field2270 = arg1.method970("cross", (byte) -10);
        class181.field2729 = arg1.method970("mapdots", (byte) -10);
        class131.field2061 = arg1.method970("scrollbar", (byte) -10);
        class212.field3227 = arg1.method970("name_icons", (byte) -10);
        class344.field5337 = arg1.method970("floorshadows", (byte) -10);
        class222.field3542 = arg1.method970("compass", (byte) -10);
        class32.field460 = arg1.method970("hint_mapedge", (byte) -10);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V", line = 427)
    public final synchronized void method307(byte arg0) {
        field577++;
        if (class238.field3782 != null) {
            class238.field3782.removeFocusListener(this);
            class238.field3782.getParent().remove(class238.field3782);
        }
        Container var2;
        if (class195.field2917 != null) {
            var2 = class195.field2917;
        } else if (class92.field1464 == null) {
            var2 = class32.field471.field2721;
        } else {
            var2 = class92.field1464;
        }
        var2.setLayout((LayoutManager) null);
        class238.field3782 = new class116(this);
        var2.add(class238.field3782);
        if (arg0 != -8) {
            this.field585 = true;
        }
        class238.field3782.setSize(class188.field2816, class322.field5024);
        class238.field3782.setVisible(true);
        if (class92.field1464 == var2) {
            Insets var3 = class92.field1464.getInsets();
            class238.field3782.setLocation(class81.field1283 + var3.left, class53.field895 + var3.top);
        } else {
            class238.field3782.setLocation(class81.field1283, class53.field895);
        }
        class238.field3782.addFocusListener(this);
        class238.field3782.requestFocus();
        class163.field2458 = true;
        class125.field1961 = true;
        client.field722 = true;
        class48.field780 = false;
        class31.field454 = class102.method743((byte) 101);
    }

    @OriginalMember(owner = "client!qe", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 474)
    public final URL getCodeBase() {
        field574++;
        if (class92.field1464 == null) {
            return class32.field471 == null || class32.field471.field2721 == this ? super.getCodeBase() : class32.field471.field2721.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 495)
    public final void focusLost(FocusEvent arg0) {
        class125.field1961 = false;
        field588++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIBII)I", line = 503)
    public static final int method309(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg3;
            arg3 = var7;
        }
        field590++;
        int var8 = arg1 & 0x3;
        if (arg4 >= -92) {
            field572 = (String[]) null;
        }
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return (7 - arg2) + 1 - arg0;
        } else {
            return 1 + 7 - arg3 - arg6;
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V", line = 534)
    public static final void method310(int arg0) {
        class34.field509 = arg0;
        class224.field3568 = 0;
        class158.field2379 = false;
        class108.field1692 = 0;
        class239.field3798 = -3;
        field580++;
        class235.field3755 = 0;
        class117.field1789 = -1;
    }

    @OriginalMember(owner = "client!qe", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 548)
    public final void windowDeiconified(WindowEvent arg0) {
        field593++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V", line = 555)
    public final void method311(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field591++;
        try {
            if (class212.field3231 != null) {
                class202.field3031++;
                if (class202.field3031 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method301("alreadyloaded", 31261);
                return;
            }
            class188.field2816 = arg2;
            class284.field4427 = arg2;
            class81.field1283 = 0;
            class53.field895 = 0;
            class291.field4520 = arg1;
            class212.field3231 = this;
            class322.field5024 = arg4;
            class284.field4387 = arg4;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class341.field5317 = true;
            } else {
                class341.field5317 = false;
            }
            if (class32.field471 == null) {
                class308.field4791 = class32.field471 = new class180(this, arg3, (String) null, 0);
            }
            class197 var7 = class32.field471.method1291(1, 24229, this);
            while (var7.field2956 == 0) {
                class5.method26(0, 10L);
            }
            if (arg0 > -60) {
                field558 = -108;
            }
            class304.field4754 = (Thread) var7.field2959;
        } catch (Exception var9) {
            class184.method1322(var9, (String) null, (byte) -24);
            this.method301("crash", 31261);
        }
    }

    @OriginalMember(owner = "client!qe", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 611)
    public final void windowActivated(WindowEvent arg0) {
        field592++;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Z", line = 628)
    public final boolean method312(int arg0) {
        field596++;
        if (arg0 != -49) {
            this.method314(true);
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
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
                this.method301("invalidhost", 31261);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 663)
    public final String getParameter(String arg0) {
        field567++;
        if (class92.field1464 == null) {
            return class32.field471 == null || class32.field471.field2721 == this ? super.getParameter(arg0) : class32.field471.field2721.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 691)
    public static final void method313(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        if (arg1 == 8) {
            arg1 = 4;
        }
        if (arg1 == 4 && !class300.field4691) {
            arg0 = 2;
            arg1 = 2;
        }
        field560++;
        if (class115.field1766 != arg1) {
            if (class174.field2641) {
                return;
            }
            if (class115.field1766 != 0) {
                class11.field177[class115.field1766].method454();
            }
            if (arg1 != 0) {
                class246 var3 = class11.field177[arg1];
                var3.method458();
                var3.method457(arg0);
            }
            class115.field1766 = arg1;
            class244.field3905 = arg0;
        } else if (arg1 != 0 && class244.field3905 != arg0) {
            class11.field177[arg1].method457(arg0);
            class244.field3905 = arg0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "destroy", descriptor = "()V", line = 740)
    public final void destroy() {
        field569++;
        if (class212.field3231 == this && !class338.field5292) {
            class264.field4110 = class102.method743((byte) 85);
            class5.method26(0, 5000L);
            class308.field4791 = null;
            this.method298(-66, false);
        }
    }

    @OriginalMember(owner = "client!qe", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 756)
    public final void update(Graphics arg0) {
        field578++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIZILjava/lang/String;II)V", line = 776)
    public final void method315(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class188.field2816 = arg7;
            class284.field4427 = arg7;
            if (arg4 <= 2) {
                this.method298(48, true);
            }
            class212.field3231 = this;
            class53.field895 = 0;
            class322.field5024 = arg1;
            class284.field4387 = arg1;
            class291.field4520 = arg0;
            class81.field1283 = 0;
            class92.field1464 = new Frame();
            class92.field1464.setTitle("Jagex");
            class92.field1464.setResizable(true);
            class92.field1464.addWindowListener(this);
            class92.field1464.setVisible(true);
            class92.field1464.toFront();
            Insets var9 = class92.field1464.getInsets();
            class92.field1464.setSize(class284.field4427 + var9.left + var9.right, class284.field4387 - -var9.bottom + var9.top);
            class308.field4791 = class32.field471 = new class180((Applet) null, arg6, arg5, arg2);
            class197 var10 = class32.field471.method1291(1, 24229, this);
            while (var10.field2956 == 0) {
                class5.method26(0, 10L);
            }
            class304.field4754 = (Thread) var10.field2959;
        } catch (Exception var12) {
            class184.method1322(var12, (String) null, (byte) -24);
        }
        field568++;
    }

    @OriginalMember(owner = "client!qe", name = "stop", descriptor = "()V", line = 817)
    public final void stop() {
        field562++;
        if (class212.field3231 == this && !class338.field5292) {
            class264.field4110 = class102.method743((byte) 121) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qe", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 829)
    public final URL getDocumentBase() {
        field573++;
        if (class92.field1464 == null) {
            return class32.field471 == null || class32.field471.field2721 == this ? super.getDocumentBase() : class32.field471.field2721.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 844)
    public final void focusGained(FocusEvent arg0) {
        class125.field1961 = true;
        field576++;
        client.field722 = true;
    }

    @OriginalMember(owner = "client!qe", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 858)
    public final void windowClosing(WindowEvent arg0) {
        field582++;
        this.destroy();
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public abstract void method300(int arg0);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public abstract void method302(byte arg0);

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
    public abstract void method306(byte arg0);

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public abstract void method308(int arg0);

    @OriginalMember(owner = "client!qe", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public abstract void method314(boolean arg0);
}
