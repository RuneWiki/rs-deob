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

@OriginalClass("client!cl")
public abstract class class132 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "Z")
    private boolean field2030 = false;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "Lwm;")
    public static class152 field2027 = class157.method1048("n", 122);

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "Lvg;")
    public static class263 field2033 = null;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "Lah;")
    public static class205 field2022;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "Z")
    public static boolean field2040;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[Z")
    public static boolean[] field2005;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 9)
    public static void method832(byte arg0) {
        field2005 = null;
        field2027 = null;
        field2022 = null;
        field2033 = null;
        if (arg0 > -103) {
            field2033 = (class263) null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 24)
    public final synchronized void paint(Graphics arg0) {
        field2034++;
        if (class286.field4846 != this || class42.field673) {
            return;
        }
        class49.field770 = true;
        if (class204.field3305 && !class217.field3516 && class76.method507(-30994) - class122.field1717 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class205.field3350 <= var2.width && var2.height >= class81.field1137) {
                class137.field2102 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 47)
    public final URL getCodeBase() {
        field2016++;
        if (class85.field1201 == null) {
            return class34.field572 == null || class34.field572.field2359 == this ? super.getCodeBase() : class34.field572.field2359.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 64)
    public final AppletContext getAppletContext() {
        field2029++;
        if (class85.field1201 == null) {
            return class34.field572 == null || class34.field572.field2359 == this ? super.getAppletContext() : class34.field572.field2359.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 85)
    private final void method835(int arg0) {
        field2004++;
        long var2 = class76.method507(-30994);
        long var4 = class249.field4181[class142.field2184];
        class249.field4181[class142.field2184] = var2;
        class142.field2184 = class142.field2184 + 1 & 0x1F;
        if (arg0 != 32000) {
            method832((byte) -109);
        }
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class160.field2555 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class146.field2246++) > 50) {
            class49.field770 = true;
            class146.field2246 -= 50;
            class224.field3648.setSize(class172.field2757, class227.field3709);
            class224.field3648.setVisible(true);
            if (class85.field1201 != null && class23.field397 == null) {
                Insets var7 = class85.field1201.getInsets();
                class224.field3648.setLocation(var7.left + class137.field2100, class172.field2739 + var7.top);
            } else {
                class224.field3648.setLocation(class137.field2100, class172.field2739);
            }
        }
        this.method834(14934);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V", line = 132)
    public final void method836(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2023++;
        try {
            if (class286.field4846 != null) {
                class199.field3205++;
                if (class199.field3205 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method842(-120, "alreadyloaded");
                return;
            }
            class172.field2739 = 0;
            class172.field2757 = arg1;
            class205.field3350 = arg1;
            class5.field83 = arg3;
            class227.field3709 = arg4;
            class81.field1137 = arg4;
            class286.field4846 = this;
            if (arg0 <= 93) {
                this.init();
            }
            class137.field2100 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class72.field1052 = true;
            } else {
                class72.field1052 = false;
            }
            if (class34.field572 == null) {
                class175.field2821 = class34.field572 = new class151(this, arg2, (String) null, 0);
            }
            class188 var7 = class34.field572.method956(1, 0, this);
            while (var7.field2980 == 0) {
                class4.method19(0, 10L);
            }
            class312.field5368 = (Thread) var7.field2977;
        } catch (Exception var9) {
            class169.method1109(var9, (byte) -80, (String) null);
            this.method842(-95, "crash");
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Loe;", line = 188)
    public static final class127 method837(int arg0, int arg1, int arg2) {
        class127 var3 = class11.method54(false, arg1);
        field2010++;
        if (~arg0 == arg2) {
            return var3;
        } else if (var3 == null || var3.field1937 == null || var3.field1937.length <= arg0) {
            return null;
        } else {
            return var3.field1937[arg0];
        }
    }

    @OriginalMember(owner = "client!cl", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 204)
    public final URL getDocumentBase() {
        field2037++;
        if (class85.field1201 == null) {
            return class34.field572 == null || class34.field572.field2359 == this ? super.getDocumentBase() : class34.field572.field2359.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 219)
    public final void windowDeiconified(WindowEvent arg0) {
        field2025++;
    }

    @OriginalMember(owner = "client!cl", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 227)
    public final void windowActivated(WindowEvent arg0) {
        field2038++;
    }

    @OriginalMember(owner = "client!cl", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 238)
    public final void windowDeactivated(WindowEvent arg0) {
        field2012++;
    }

    @OriginalMember(owner = "client!cl", name = "run", descriptor = "()V", line = 247)
    public final void run() {
        field2009++;
        try {
            if (class151.field2349 != null) {
                String var1 = class151.field2349.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class151.field2362;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method842(-89, "wrongjava");
                        return;
                    }
                    class196.field3144 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class151.field2362 == null || class151.field2362.equals("1.4.2"))) {
                    this.method842(-106, "wrongjava");
                    return;
                }
            }
            if (class151.field2362 != null && class151.field2362.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class151.field2362.length()) {
                    char var5 = class151.field2362.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class204.field3305 = true;
                }
            }
            if (class34.field572.field2359 != null) {
                Method var6 = class151.field2368;
                if (var6 != null) {
                    try {
                        var6.invoke(class34.field572.field2359, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class172.method1149((byte) 69);
            this.method847(-1);
            class311.field5322 = class195.method1303(23229, class172.field2757, class227.field3709, class224.field3648);
            this.method839((byte) 96);
            class134.field2051 = class124.method791((byte) 13);
            while (class200.field3231 == 0L || class76.method507(-30994) < class200.field3231) {
                class61.field931 = class134.field2051.method273(class196.field3144, -199, class268.field4521);
                for (int var8 = 0; var8 < class61.field931; var8++) {
                    this.method845(false);
                }
                this.method835(32000);
                class267.method1830(class224.field3648, class34.field572, (byte) 53);
            }
        } catch (Exception var11) {
            class169.method1109(var11, (byte) 82, (String) null);
            this.method842(-97, "crash");
        }
        this.method840(true, 0);
    }

    @OriginalMember(owner = "client!cl", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 353)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2024++;
    }

    @OriginalMember(owner = "client!cl", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 364)
    public final void windowOpened(WindowEvent arg0) {
        field2035++;
    }

    @OriginalMember(owner = "client!cl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 371)
    public final void focusLost(FocusEvent arg0) {
        field2013++;
        class311.field5337 = false;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)V", line = 379)
    private final void method840(boolean arg0, int arg1) {
        field2015++;
        synchronized (this) {
            if (arg1 != 0) {
                return;
            }
            if (class42.field673) {
                return;
            }
            class42.field673 = true;
        }
        if (class34.field572.field2359 != null) {
            class34.field572.field2359.destroy();
        }
        try {
            this.method833((byte) 116);
        } catch (Exception var12) {
        }
        if (class224.field3648 != null) {
            try {
                class224.field3648.removeFocusListener(this);
                class224.field3648.getParent().remove(class224.field3648);
            } catch (Exception var11) {
            }
        }
        if (class34.field572 != null) {
            try {
                class34.field572.method965(false);
            } catch (Exception var10) {
            }
        }
        this.method846(3000);
        if (class85.field1201 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!cl", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 438)
    public final void windowClosed(WindowEvent arg0) {
        field2031++;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V", line = 446)
    public static final void method841(byte arg0) {
        class8.field106 = null;
        class134.field2070 = null;
        int var1 = 83 / ((-arg0 - 62) / 42);
        class23.field403 = (byte[][]) null;
        class180.field2865 = null;
        field2008++;
        class253.field4383 = null;
        class179.field2856 = null;
    }

    @OriginalMember(owner = "client!cl", name = "providesignlink", descriptor = "(Ldi;)V", line = 463)
    public static final void providesignlink(class151 arg0) {
        class34.field572 = arg0;
        class175.field2821 = arg0;
        field2032++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)V", line = 471)
    public final void method842(int arg0, String arg1) {
        field2011++;
        if (this.field2030) {
            return;
        }
        if (arg0 >= -81) {
            this.method843((String) null, 69, false, -30, (byte) -24, -7, -122, 31);
        }
        this.field2030 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!cl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 496)
    public final void focusGained(FocusEvent arg0) {
        field2028++;
        class311.field5337 = true;
        class49.field770 = true;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;IZIBIII)V", line = 505)
    public final void method843(String arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2006++;
        try {
            class172.field2739 = 0;
            class172.field2757 = arg6;
            class205.field3350 = arg6;
            class137.field2100 = 0;
            class286.field4846 = this;
            class5.field83 = arg1;
            class227.field3709 = arg3;
            class81.field1137 = arg3;
            class85.field1201 = new Frame();
            class85.field1201.setTitle("Jagex");
            class85.field1201.setResizable(true);
            class85.field1201.addWindowListener(this);
            class85.field1201.setVisible(true);
            class85.field1201.toFront();
            if (arg4 != 103) {
                this.init();
            }
            Insets var9 = class85.field1201.getInsets();
            class85.field1201.setSize(class205.field3350 + var9.right + var9.left, class81.field1137 + var9.top + var9.bottom);
            class175.field2821 = class34.field572 = new class151((Applet) null, arg7, arg0, arg5);
            class188 var10 = class34.field572.method956(1, arg4 ^ 0x67, this);
            while (var10.field2980 == 0) {
                class4.method19(arg4 - 103, 10L);
            }
            class312.field5368 = (Thread) var10.field2977;
        } catch (Exception var12) {
            class169.method1109(var12, (byte) 80, (String) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)Z", line = 557)
    public final boolean method844(int arg0) {
        field2019++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 4000) {
                field2022 = (class205) null;
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
                this.method842(arg0 ^ 0xFFFFF02D, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 593)
    private final void method845(boolean arg0) {
        field2036++;
        if (arg0) {
            return;
        }
        long var2 = class203.field3287[class194.field3093];
        long var4 = class76.method507(-30994);
        if (var2 != 0L && var2 >= var4) {
        }
        class203.field3287[class194.field3093] = var4;
        class194.field3093 = class194.field3093 + 1 & 0x1F;
        synchronized (this) {
            class290.field4932 = class311.field5337;
        }
        this.method838(-23797);
    }

    @OriginalMember(owner = "client!cl", name = "destroy", descriptor = "()V", line = 628)
    public final void destroy() {
        field2018++;
        if (class286.field4846 == this && !class42.field673) {
            class200.field3231 = class76.method507(-30994);
            class4.method19(0, 5000L);
            class175.field2821 = null;
            this.method840(false, 0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V", line = 644)
    public final synchronized void method847(int arg0) {
        if (class224.field3648 != null) {
            class224.field3648.removeFocusListener(this);
            class224.field3648.getParent().remove(class224.field3648);
        }
        Container var2;
        if (class23.field397 != null) {
            var2 = class23.field397;
        } else if (class85.field1201 == null) {
            var2 = class34.field572.field2359;
        } else {
            var2 = class85.field1201;
        }
        var2.setLayout((LayoutManager) null);
        class224.field3648 = new class240(this);
        var2.add(class224.field3648);
        class224.field3648.setSize(class172.field2757, class227.field3709);
        class224.field3648.setVisible(true);
        if (class85.field1201 == var2) {
            Insets var3 = class85.field1201.getInsets();
            class224.field3648.setLocation(var3.left + class137.field2100, class172.field2739 + var3.top);
        } else {
            class224.field3648.setLocation(class137.field2100, class172.field2739);
        }
        class224.field3648.addFocusListener(this);
        field2017++;
        class224.field3648.requestFocus();
        class290.field4932 = true;
        class311.field5337 = true;
        if (arg0 != -1) {
            field2033 = (class263) null;
        }
        class49.field770 = true;
        class137.field2102 = false;
        class122.field1717 = class76.method507(-30994);
    }

    @OriginalMember(owner = "client!cl", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 694)
    public final void update(Graphics arg0) {
        field2014++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!cl", name = "stop", descriptor = "()V", line = 704)
    public final void stop() {
        field2007++;
        if (class286.field4846 == this && !class42.field673) {
            class200.field3231 = class76.method507(-30994) + 4000L;
        }
    }

    @OriginalMember(owner = "client!cl", name = "start", descriptor = "()V", line = 723)
    public final void start() {
        field2003++;
        if (class286.field4846 == this && !class42.field673) {
            class200.field3231 = 0L;
        }
    }

    @OriginalMember(owner = "client!cl", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 739)
    public final String getParameter(String arg0) {
        field2020++;
        if (class85.field1201 == null) {
            return class34.field572 == null || class34.field572.field2359 == this ? super.getParameter(arg0) : class34.field572.field2359.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 758)
    public final void windowIconified(WindowEvent arg0) {
        field2021++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public abstract void method833(byte arg0);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public abstract void method834(int arg0);

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public abstract void method838(int arg0);

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
    public abstract void method839(byte arg0);

    @OriginalMember(owner = "client!cl", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
    public abstract void method846(int arg0);
}
