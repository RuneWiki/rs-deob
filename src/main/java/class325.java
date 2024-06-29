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

@OriginalClass("client!rc")
public abstract class class325 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Z")
    private boolean field5605 = false;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Lna;")
    private static class26 field5625 = class69.method505(" from your ignore list first)3", (byte) -128);

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Lna;")
    public static class26 field5633 = class69.method505(" s(West d-Bconnect-B)3", (byte) -123);

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lna;")
    public static class26 field5622 = field5625;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field5619 = 0;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "Lna;")
    public static class26 field5638 = class69.method505(")3)3)3", (byte) -128);

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "Lna;")
    public static class26 field5640 = class69.method505("::rect_debug", (byte) -128);

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Lna;")
    public static class26 field5636 = class69.method505("", (byte) -118);

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Z")
    public static boolean field5642 = false;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "Z")
    public static boolean field5632 = false;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Z")
    public static boolean field5647;

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 9)
    public final void focusLost(FocusEvent arg0) {
        field5606++;
        class252.field4129 = false;
    }

    @OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 27)
    public final void windowClosing(WindowEvent arg0) {
        field5624++;
        this.destroy();
    }

    @OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 35)
    public final void windowIconified(WindowEvent arg0) {
        field5623++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 42)
    public static void method2253(int arg0) {
        if (arg0 < 15) {
            method2254((class26) null, true);
        }
        field5633 = null;
        field5636 = null;
        field5640 = null;
        field5638 = null;
        field5625 = null;
        field5622 = null;
    }

    @OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 59)
    public final void windowDeactivated(WindowEvent arg0) {
        field5645++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lna;Z)Lna;", line = 67)
    public static final class26 method2254(class26 arg0, boolean arg1) {
        field5628++;
        if (!arg1) {
            method2253(-78);
        }
        int var2 = class24.method150(0, arg0);
        return var2 == -1 ? class94.field1541 : class298.field5133.field166[var2].method191(class20.field270, true, class103.field1649);
    }

    @OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 86)
    public final AppletContext getAppletContext() {
        field5607++;
        if (class142.field2172 == null) {
            return class45.field712 == null || class45.field712.field2431 == this ? super.getAppletContext() : class45.field712.field2431.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 103)
    public final void focusGained(FocusEvent arg0) {
        field5612++;
        class252.field4129 = true;
        class198.field3066 = true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 112)
    public static final void method2255(boolean arg0) {
        field5635++;
        class207.field3216.method1987(3);
        if (!arg0) {
            field5642 = false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 123)
    public final void windowClosed(WindowEvent arg0) {
        field5613++;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Z", line = 132)
    public final boolean method2256(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field5617++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 27496) {
                field5640 = (class26) null;
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
                this.method2258("invalidhost", arg0 - 27544);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 169)
    public final synchronized void method2257(byte arg0) {
        if (class250.field4085 != null) {
            class250.field4085.removeFocusListener(this);
            class250.field4085.getParent().remove(class250.field4085);
        }
        field5641++;
        Container var2;
        if (class198.field3075 != null) {
            var2 = class198.field3075;
        } else if (class142.field2172 == null) {
            var2 = class45.field712.field2431;
        } else {
            var2 = class142.field2172;
        }
        var2.setLayout((LayoutManager) null);
        class250.field4085 = new class71(this);
        if (arg0 < 30) {
            return;
        }
        var2.add(class250.field4085);
        class250.field4085.setSize(class38.field622, class141.field2153);
        class250.field4085.setVisible(true);
        if (class142.field2172 == var2) {
            Insets var3 = class142.field2172.getInsets();
            class250.field4085.setLocation(class124.field1928 + var3.left, class25.field362 + var3.top);
        } else {
            class250.field4085.setLocation(class124.field1928, class25.field362);
        }
        class250.field4085.addFocusListener(this);
        class250.field4085.requestFocus();
        class252.field4129 = true;
        class198.field3066 = true;
        class98.field1598 = true;
        class132.field2016 = false;
        class249.field4047 = class128.method869((byte) -55);
    }

    @OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V", line = 217)
    public final void destroy() {
        field5630++;
        if (class56.field919 == this && !class167.field2582) {
            class224.field3538 = class128.method869((byte) -55);
            class126.method862(5000L, 64);
            class198.field3079 = null;
            this.method2260(46, false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 231)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field5644++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 239)
    public final void method2258(String arg0, int arg1) {
        field5611++;
        if (this.field5605) {
            return;
        }
        this.field5605 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != -48) {
                field5622 = (class26) null;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 267)
    public final URL getDocumentBase() {
        field5609++;
        if (class142.field2172 == null) {
            return class45.field712 == null || class45.field712.field2431 == this ? super.getDocumentBase() : class45.field712.field2431.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 281)
    public final synchronized void paint(Graphics arg0) {
        field5629++;
        if (class56.field919 != this || class167.field2582) {
            return;
        }
        class198.field3066 = true;
        if (class40.field663 && !class255.field4184 && (class128.method869((byte) -55) - class249.field4047) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class224.field3562 && class267.field4407 <= var2.height) {
                class132.field2016 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 302)
    public final void windowDeiconified(WindowEvent arg0) {
        field5643++;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V", line = 310)
    public static final void method2259(int arg0) {
        if (class166.field2580 != null) {
            class166.field2580.method397(false);
        }
        field5620++;
        if (arg0 != -32589) {
            method2253(-25);
        }
        if (class23.field329 != null) {
            class23.field329.method397(false);
        }
        class109.method771(256, 2, 22050, class303.field5227);
        class166.field2580 = class258.method1816(22050, class45.field712, class250.field4085, 0, 14);
        class166.field2580.method388(114, class218.field3493);
        class23.field329 = class258.method1816(2048, class45.field712, class250.field4085, 1, 14);
        class23.field329.method388(-126, class301.field5195);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)V", line = 334)
    private final void method2260(int arg0, boolean arg1) {
        field5615++;
        synchronized (this) {
            if (class167.field2582) {
                return;
            }
            class167.field2582 = true;
        }
        if (class45.field712.field2431 != null) {
            class45.field712.field2431.destroy();
        }
        try {
            this.method1727((byte) 23);
        } catch (Exception var12) {
        }
        if (class250.field4085 != null) {
            try {
                class250.field4085.removeFocusListener(this);
                class250.field4085.getParent().remove(class250.field4085);
            } catch (Exception var11) {
            }
        }
        if (class45.field712 != null) {
            try {
                class45.field712.method1057(0);
            } catch (Exception var10) {
            }
        }
        this.method1729(126);
        if (arg0 <= 31) {
            this.method2263(78, -50, false, -104, (String) null, -76, -61, 49);
        }
        if (class142.field2172 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 393)
    public final void windowActivated(WindowEvent arg0) {
        field5621++;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V", line = 403)
    private final void method2261(boolean arg0) {
        field5616++;
        long var2 = class128.method869((byte) -55);
        long var4 = class287.field4807[class266.field4394];
        class287.field4807[class266.field4394] = var2;
        class266.field4394 = class266.field4394 + 1 & 0x1F;
        synchronized (this) {
            if (!arg0) {
                this.start();
            }
            class98.field1598 = class252.field4129;
        }
        this.method1739((byte) 107);
        if (var4 != 0L && var2 <= var4) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Lll;)V", line = 435)
    public static final void providesignlink(class156 arg0) {
        field5614++;
        class45.field712 = arg0;
        class198.field3079 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V", line = 444)
    private final void method2262(int arg0) {
        long var2 = class128.method869((byte) -55);
        long var4 = class205.field3202[class212.field3285];
        if (arg0 != 0) {
            field5633 = (class26) null;
        }
        field5604++;
        class205.field3202[class212.field3285] = var2;
        class212.field3285 = class212.field3285 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class249.field4066 = ((var6 >> 1) + 32000) / var6;
        }
        if (class230.field3657++ > 50) {
            class198.field3066 = true;
            class230.field3657 -= 50;
            class250.field4085.setSize(class38.field622, class141.field2153);
            class250.field4085.setVisible(true);
            if (class142.field2172 != null && class198.field3075 == null) {
                Insets var7 = class142.field2172.getInsets();
                class250.field4085.setLocation(class124.field1928 + var7.left, class25.field362 + var7.top);
            } else {
                class250.field4085.setLocation(class124.field1928, class25.field362);
            }
        }
        this.method1724(40);
    }

    @OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 494)
    public final URL getCodeBase() {
        field5634++;
        if (class142.field2172 == null) {
            return class45.field712 == null || class45.field712.field2431 == this ? super.getCodeBase() : class45.field712.field2431.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V", line = 513)
    public final void run() {
        field5626++;
        try {
            if (class156.field2423 != null) {
                String var1 = class156.field2423.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class156.field2437;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2258("wrongjava", -48);
                        return;
                    }
                    class108.field1695 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class156.field2437 == null || class156.field2437.equals("1.4.2"))) {
                    this.method2258("wrongjava", -48);
                    return;
                }
            }
            if (class156.field2437 != null && class156.field2437.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class156.field2437.length()) {
                    char var5 = class156.field2437.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class40.field663 = true;
                }
            }
            if (class45.field712.field2431 != null) {
                Method var6 = class156.field2443;
                if (var6 != null) {
                    try {
                        var6.invoke(class45.field712.field2431, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class27.method217(0);
            this.method2257((byte) 120);
            class134.field2040 = class76.method546(class141.field2153, class38.field622, true, class250.field4085);
            this.method1728(2);
            class186.field2893 = class260.method1833((byte) -31);
            while (class224.field3538 == 0L || class224.field3538 > class128.method869((byte) -55)) {
                class37.field615 = class186.field2893.method369(-1, class108.field1695, class166.field2578);
                for (int var8 = 0; var8 < class37.field615; var8++) {
                    this.method2261(true);
                }
                this.method2262(0);
                class138.method924(class45.field712, class250.field4085, -80);
            }
        } catch (Exception var11) {
            class302.method2124((String) null, var11, (byte) 127);
            this.method2258("crash", -48);
        }
        this.method2260(107, true);
    }

    @OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 621)
    public final String getParameter(String arg0) {
        field5639++;
        if (class142.field2172 == null) {
            return class45.field712 == null || class45.field712.field2431 == this ? super.getParameter(arg0) : class45.field712.field2431.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V", line = 647)
    public final void stop() {
        field5610++;
        if (class56.field919 == this && !class167.field2582) {
            class224.field3538 = class128.method869((byte) -55) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZILjava/lang/String;III)V", line = 685)
    public final void method2263(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -8057) {
            this.method1724(12);
        }
        try {
            class141.field2153 = arg5;
            class267.field4407 = arg5;
            class124.field1928 = 0;
            class76.field1150 = arg1;
            class38.field622 = arg3;
            class224.field3562 = arg3;
            class25.field362 = 0;
            class56.field919 = this;
            class142.field2172 = new Frame();
            class142.field2172.setTitle("Jagex");
            class142.field2172.setResizable(true);
            class142.field2172.addWindowListener(this);
            class142.field2172.setVisible(true);
            class142.field2172.toFront();
            Insets var9 = class142.field2172.getInsets();
            class142.field2172.setSize(class224.field3562 + var9.right + var9.left, class267.field4407 + var9.top + var9.bottom);
            class198.field3079 = class45.field712 = new class156((Applet) null, arg0, arg4, arg7);
            class180 var10 = class45.field712.method1054(0, 1, this);
            while (var10.field2811 == 0) {
                class126.method862(10L, 64);
            }
            class192.field2997 = (Thread) var10.field2812;
        } catch (Exception var12) {
            class302.method2124((String) null, var12, (byte) 115);
        }
        field5618++;
    }

    @OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 739)
    public final void windowOpened(WindowEvent arg0) {
        field5631++;
    }

    @OriginalMember(owner = "client!rc", name = "start", descriptor = "()V", line = 749)
    public final void start() {
        field5627++;
        if (class56.field919 == this && !class167.field2582) {
            class224.field3538 = 0L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIIII)V", line = 760)
    public final void method2264(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5637++;
        try {
            if (class56.field919 != null) {
                class260.field4256++;
                if (class260.field4256 >= 3) {
                    this.method2258("alreadyloaded", -48);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class56.field919 = this;
            class25.field362 = 0;
            class76.field1150 = arg3;
            if (arg0 >= -23) {
                field5625 = (class26) null;
            }
            class38.field622 = arg1;
            class224.field3562 = arg1;
            class124.field1928 = 0;
            class141.field2153 = arg4;
            class267.field4407 = arg4;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class120.field1869 = true;
            } else {
                class120.field1869 = false;
            }
            if (class45.field712 == null) {
                class198.field3079 = class45.field712 = new class156(this, arg2, (String) null, 0);
            }
            class180 var7 = class45.field712.method1054(0, 1, this);
            while (var7.field2811 == 0) {
                class126.method862(10L, 64);
            }
            class192.field2997 = (Thread) var7.field2812;
        } catch (Exception var9) {
            class302.method2124((String) null, var9, (byte) 113);
            this.method2258("crash", -48);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public abstract void method1739(byte arg0);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public abstract void method1727(byte arg0);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public abstract void method1729(int arg0);

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public abstract void method1724(int arg0);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    public abstract void method1728(int arg0);

    @OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
    public abstract void init();
}
