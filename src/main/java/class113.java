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

@OriginalClass("client!ic")
public abstract class class113 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "Z")
    private boolean field1830 = false;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Z")
    public static boolean field1800 = false;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lok;")
    public static class146 field1803 = class235.method1724(-12908, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field1811 = 1;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Lok;")
    public static class146 field1826 = class235.method1724(-12908, "<col=00ff00>");

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lok;")
    public static class146 field1795 = class235.method1724(-12908, " s(West d-Bconnect-B)3");

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "[Z")
    public static boolean[] field1813 = new boolean[112];

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1834 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "Lqd;")
    public static class40 field1827;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Z")
    public static boolean field1835;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Z")
    public static boolean field1836;

    @OriginalMember(owner = "client!ic", name = "start", descriptor = "()V", line = 5)
    public final void start() {
        field1799++;
        if (class138.field2291 == this && !class274.field4719) {
            class214.field3541 = 0L;
        }
    }

    @OriginalMember(owner = "client!ic", name = "destroy", descriptor = "()V", line = 25)
    public final void destroy() {
        field1820++;
        if (class138.field2291 == this && !class274.field4719) {
            class214.field3541 = class67.method501(-96);
            class281.method2041((byte) 97, 5000L);
            class7.field149 = null;
            this.method763(0, false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;)V", line = 41)
    public final void method760(int arg0, String arg1) {
        field1823++;
        if (this.field1830) {
            return;
        }
        this.field1830 = true;
        if (arg0 != 0) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ic", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 64)
    public final void focusLost(FocusEvent arg0) {
        field1796++;
        class295.field4997 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBI)V", line = 73)
    public final void method761(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1828++;
        try {
            if (class138.field2291 != null) {
                class180.field3026++;
                if (class180.field3026 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method760(arg3 + 34, "alreadyloaded");
                return;
            }
            class310.field5284 = 0;
            class138.field2291 = this;
            class56.field997 = arg2;
            class248.field4170 = arg2;
            class63.field1091 = 0;
            class96.field1563 = arg4;
            class148.field2518 = arg1;
            class72.field1173 = arg1;
            if (arg3 != -34) {
                field1811 = -128;
            }
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class50.field902 = true;
            } else {
                class50.field902 = false;
            }
            if (class232.field3876 == null) {
                class7.field149 = class232.field3876 = new class129(this, arg0, (String) null, 0);
            }
            class256 var7 = class232.field3876.method920(this, 1, arg3 ^ 0xFFFFFFDE);
            while (var7.field4265 == 0) {
                class281.method2041((byte) 110, 10L);
            }
            class316.field5367 = (Thread) var7.field4269;
        } catch (Exception var9) {
            class245.method1771(var9, (String) null, 0);
            this.method760(arg3 + 34, "crash");
        }
    }

    @OriginalMember(owner = "client!ic", name = "providesignlink", descriptor = "(Lml;)V", line = 129)
    public static final void providesignlink(class129 arg0) {
        field1812++;
        class232.field3876 = arg0;
        class7.field149 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLof;Lof;)V", line = 137)
    public static final void method762(byte arg0, class232 arg1, class232 arg2) {
        if (arg0 >= -17) {
            return;
        }
        field1802++;
        if (arg1.field3869 != null) {
            arg1.method1703((byte) -88);
        }
        arg1.field3869 = arg2;
        arg1.field3871 = arg2.field3871;
        arg1.field3869.field3871 = arg1;
        arg1.field3871.field3869 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
    public final void focusGained(FocusEvent arg0) {
        field1831++;
        class295.field4997 = true;
        class133.field2236 = true;
    }

    @OriginalMember(owner = "client!ic", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 172)
    public final void windowDeactivated(WindowEvent arg0) {
        field1818++;
    }

    @OriginalMember(owner = "client!ic", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 183)
    public final void windowActivated(WindowEvent arg0) {
        field1824++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V", line = 192)
    private final void method763(int arg0, boolean arg1) {
        field1819++;
        synchronized (this) {
            if (arg0 != 0) {
                this.focusGained((FocusEvent) null);
            }
            if (class274.field4719) {
                return;
            }
            class274.field4719 = true;
        }
        if (class232.field3876.field2162 != null) {
            class232.field3876.field2162.destroy();
        }
        try {
            this.method767(-141);
        } catch (Exception var12) {
        }
        if (class75.field1228 != null) {
            try {
                class75.field1228.removeFocusListener(this);
                class75.field1228.getParent().remove(class75.field1228);
            } catch (Exception var11) {
            }
        }
        if (class232.field3876 != null) {
            try {
                class232.field3876.method919((byte) -45);
            } catch (Exception var10) {
            }
        }
        this.method771(false);
        if (class144.field2418 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z", line = 262)
    public final boolean method766(byte arg0) {
        field1825++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 >= -3) {
            return false;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method760(0, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 306)
    public final void update(Graphics arg0) {
        field1829++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ic", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 315)
    public final void windowDeiconified(WindowEvent arg0) {
        field1814++;
    }

    @OriginalMember(owner = "client!ic", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 322)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1797++;
    }

    @OriginalMember(owner = "client!ic", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 332)
    public final void windowClosed(WindowEvent arg0) {
        field1801++;
    }

    @OriginalMember(owner = "client!ic", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 345)
    public final synchronized void paint(Graphics arg0) {
        field1815++;
        if (class138.field2291 != this || class274.field4719) {
            return;
        }
        class133.field2236 = true;
        if (class319.field5461 && !class271.field4640 && class67.method501(-110) - class235.field3931 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class72.field1173 && class248.field4170 <= var2.height) {
                class312.field5308 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 367)
    public final void windowIconified(WindowEvent arg0) {
        field1807++;
    }

    @OriginalMember(owner = "client!ic", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 375)
    public final String getParameter(String arg0) {
        field1806++;
        if (class144.field2418 == null) {
            return class232.field3876 == null || class232.field3876.field2162 == this ? super.getParameter(arg0) : class232.field3876.field2162.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 393)
    public final URL getDocumentBase() {
        field1822++;
        if (class144.field2418 == null) {
            return class232.field3876 == null || class232.field3876.field2162 == this ? super.getDocumentBase() : class232.field3876.field2162.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 408)
    public final AppletContext getAppletContext() {
        field1816++;
        if (class144.field2418 == null) {
            return class232.field3876 == null || class232.field3876.field2162 == this ? super.getAppletContext() : class232.field3876.field2162.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 423)
    public final void windowOpened(WindowEvent arg0) {
        field1810++;
    }

    @OriginalMember(owner = "client!ic", name = "run", descriptor = "()V", line = 430)
    public final void run() {
        field1798++;
        try {
            if (class129.field2156 != null) {
                String var1 = class129.field2156.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class129.field2153;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method760(0, "wrongjava");
                        return;
                    }
                    class86.field1366 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class129.field2153 == null || class129.field2153.equals("1.4.2"))) {
                    this.method760(0, "wrongjava");
                    return;
                }
            }
            if (class129.field2153 != null && class129.field2153.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class129.field2153.length() > var3) {
                    char var5 = class129.field2153.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
                if (var4 >= 5) {
                    class319.field5461 = true;
                }
            }
            if (class232.field3876.field2162 != null) {
                Method var6 = class129.field2169;
                if (var6 != null) {
                    try {
                        var6.invoke(class232.field3876.field2162, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class237.method1733(0);
            this.method769(false);
            class139.field2307 = class57.method453(class75.field1228, class148.field2518, class56.field997, 0);
            this.method764(-107);
            class20.field387 = class173.method1340((byte) -13);
            while (class214.field3541 == 0L || class214.field3541 > class67.method501(-106)) {
                class86.field1368 = class20.field387.method493(class86.field1366, -74, class76.field1239);
                for (int var8 = 0; var8 < class86.field1368; var8++) {
                    this.method770(0);
                }
                this.method774((byte) 64);
                class23.method165(class232.field3876, class75.field1228, (byte) -125);
            }
        } catch (Exception var11) {
            class245.method1771(var11, (String) null, 0);
            this.method760(0, "crash");
        }
        this.method763(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "stop", descriptor = "()V", line = 538)
    public final void stop() {
        field1832++;
        if (class138.field2291 == this && !class274.field4719) {
            class214.field3541 = class67.method501(-97) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V", line = 552)
    public final synchronized void method769(boolean arg0) {
        field1804++;
        if (class75.field1228 != null) {
            class75.field1228.removeFocusListener(this);
            class75.field1228.getParent().remove(class75.field1228);
        }
        Container var2;
        if (class18.field358 != null) {
            var2 = class18.field358;
        } else if (class144.field2418 == null) {
            var2 = class232.field3876.field2162;
        } else {
            var2 = class144.field2418;
        }
        var2.setLayout((LayoutManager) null);
        class75.field1228 = new class98(this);
        var2.add(class75.field1228);
        class75.field1228.setSize(class148.field2518, class56.field997);
        class75.field1228.setVisible(true);
        if (class144.field2418 == var2) {
            Insets var3 = class144.field2418.getInsets();
            class75.field1228.setLocation(class63.field1091 + var3.left, class310.field5284 + var3.top);
        } else {
            class75.field1228.setLocation(class63.field1091, class310.field5284);
        }
        if (arg0) {
            field1821 = -10;
        }
        class75.field1228.addFocusListener(this);
        class75.field1228.requestFocus();
        class295.field4997 = true;
        class83.field1328 = true;
        class133.field2236 = true;
        class312.field5308 = false;
        class235.field3931 = class67.method501(-97);
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 602)
    private final void method770(int arg0) {
        field1794++;
        long var2 = class67.method501(-116);
        long var4 = class27.field477[class292.field4963];
        class27.field477[class292.field4963] = var2;
        if (var4 != 0L && var4 >= var2) {
        }
        class292.field4963 = class292.field4963 + 1 & 0x1F;
        synchronized (this) {
            class83.field1328 = class295.field4997;
        }
        this.method765(arg0);
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V", line = 631)
    public static void method772(int arg0) {
        field1795 = null;
        field1803 = null;
        field1826 = null;
        field1827 = null;
        field1813 = null;
        if (arg0 != 14777) {
            method775(-53, 122);
        }
    }

    @OriginalMember(owner = "client!ic", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 646)
    public final URL getCodeBase() {
        field1808++;
        if (class144.field2418 == null) {
            return class232.field3876 == null || class232.field3876.field2162 == this ? super.getCodeBase() : class232.field3876.field2162.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZILjava/lang/String;IIIIB)V", line = 662)
    public final void method773(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1809++;
        try {
            class56.field997 = arg6;
            class248.field4170 = arg6;
            class96.field1563 = arg4;
            class138.field2291 = this;
            class63.field1091 = 0;
            class310.field5284 = 0;
            class148.field2518 = arg1;
            class72.field1173 = arg1;
            class144.field2418 = new Frame();
            class144.field2418.setTitle("Jagex");
            class144.field2418.setResizable(true);
            class144.field2418.addWindowListener(this);
            class144.field2418.setVisible(true);
            class144.field2418.toFront();
            Insets var9 = class144.field2418.getInsets();
            class144.field2418.setSize(class72.field1173 + var9.left + var9.right, class248.field4170 + var9.top + var9.bottom);
            class7.field149 = class232.field3876 = new class129((Applet) null, arg3, arg2, arg5);
            class256 var10 = class232.field3876.method920(this, 1, 0);
            while (var10.field4265 == 0) {
                class281.method2041((byte) 119, 10L);
            }
            int var11 = 64 / ((arg7 - 11) / 42);
            class316.field5367 = (Thread) var10.field4269;
        } catch (Exception var13) {
            class245.method1771(var13, (String) null, 0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V", line = 708)
    private final void method774(byte arg0) {
        field1833++;
        if (arg0 != 64) {
            field1813 = (boolean[]) null;
        }
        long var2 = class187.field3119[class51.field925];
        long var4 = class67.method501(arg0 ^ 0xFFFFFFC7);
        class187.field3119[class51.field925] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            client.field4083 = ((var6 >> 1) + 32000) / var6;
        }
        class51.field925 = class51.field925 + 1 & 0x1F;
        if ((class101.field1635++) > 50) {
            class101.field1635 -= 50;
            class133.field2236 = true;
            class75.field1228.setSize(class148.field2518, class56.field997);
            class75.field1228.setVisible(true);
            if (class144.field2418 != null && class18.field358 == null) {
                Insets var7 = class144.field2418.getInsets();
                class75.field1228.setLocation(class63.field1091 + var7.left, class310.field5284 + var7.top);
            } else {
                class75.field1228.setLocation(class63.field1091, class310.field5284);
            }
        }
        this.method768(true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lok;", line = 755)
    public static final class146 method775(int arg0, int arg1) {
        field1805++;
        class146 var2 = class82.method585(arg1 ^ 0x399E, arg0);
        if (arg1 != 6) {
            field1813 = (boolean[]) null;
        }
        for (int var3 = var2.method1094((byte) -27) - 3; var3 > 0; var3 -= 3) {
            var2 = class112.method758(-48, new class146[] { var2.method1078(0, var3, false), class232.field3881, var2.method1111(-78, var3) });
        }
        if (var2.method1094((byte) -37) <= 9) {
            return var2.method1094((byte) -58) > 6 ? class112.method758(-81, new class146[] { class3.field20, var2.method1078(0, var2.method1094((byte) -122) - 4, false), class171.field2890, class265.field4560, var2, class31.field582 }) : class112.method758(120, new class146[] { class60.field1031, var2, class199.field3326 });
        } else {
            return class112.method758(-36, new class146[] { class112.field1793, var2.method1078(0, var2.method1094((byte) -112) - 8, false), class191.field3163, class265.field4560, var2, class31.field582 });
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public abstract void method764(int arg0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public abstract void method765(int arg0);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public abstract void method767(int arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public abstract void method768(boolean arg0);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V")
    public abstract void method771(boolean arg0);

    @OriginalMember(owner = "client!ic", name = "init", descriptor = "()V")
    public abstract void init();
}
