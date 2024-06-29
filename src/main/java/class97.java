import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class97 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Z")
    private boolean field1797 = false;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lkb;")
    public static class93 field1803 = class76.method390("oberen Rand der Webseite ausw-=hlen)3", 0);

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field1824 = -1;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field1826 = 0;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lnc;")
    public static class121 field1812 = new class121();

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lob;")
    public static class129 field1794;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "Z")
    public static boolean field1827;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[I")
    public static int[] field1808;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "[I")
    public static int[] field1818;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V")
    public final void method540(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1806++;
        try {
            if (arg4 == -25760) {
                if (class117.field2190 == null) {
                    class154.field3041 = arg0;
                    class50.field802 = arg2;
                    class138.field2665 = arg3;
                    class117.field2190 = this;
                    if (class77.field1393 == null) {
                        class28.field457 = class77.field1393 = new class149(false, this, arg1, null, 0);
                    }
                    class77.field1393.method909(arg4 ^ 0x7254, this, 1);
                } else {
                    class70.field1297++;
                    if (class70.field1297 >= 3) {
                        this.method545("alreadyloaded", arg4 + 25770);
                    } else {
                        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    }
                }
            }
        } catch (Exception var7) {
            class141.method882(true, null, var7);
            this.method545("crash", 81);
        }
    }

    @OriginalMember(owner = "client!kf", name = "start", descriptor = "()V")
    public final void start() {
        field1810++;
        if (class117.field2190 == this && !class124.field2317) {
            class117.field2192 = 0L;
        }
    }

    @OriginalMember(owner = "client!kf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1822++;
        if (class68.field1262 == null) {
            return class77.field1393 == null || class77.field1393.field2873 == this ? super.getDocumentBase() : class77.field1393.field2873.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!kf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class80.field1417 = true;
        class180.field3572 = true;
        field1809++;
    }

    @OriginalMember(owner = "client!kf", name = "stop", descriptor = "()V")
    public final void stop() {
        field1821++;
        if (class117.field2190 == this && !class124.field2317) {
            class117.field2192 = class171.method1146((byte) -109) + 4000L;
        }
    }

    @OriginalMember(owner = "client!kf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1791++;
        if (class68.field1262 == null) {
            return class77.field1393 == null || class77.field1393.field2873 == this ? super.getCodeBase() : class77.field1393.field2873.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public abstract void method172(boolean arg0);

    @OriginalMember(owner = "client!kf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1799++;
    }

    @OriginalMember(owner = "client!kf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1798++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public final synchronized void method541(int arg0) {
        field1811++;
        Container var2;
        if (class68.field1262 == null) {
            var2 = class77.field1393.field2873;
        } else {
            var2 = class68.field1262;
        }
        if (class115.field2147 != null) {
            class115.field2147.removeFocusListener(this);
            var2.remove(class115.field2147);
        }
        class115.field2147 = new class7(this);
        var2.add(class115.field2147);
        class115.field2147.setSize(class138.field2665, class50.field802);
        class115.field2147.setVisible(true);
        if (class68.field1262 == null) {
            class115.field2147.setLocation(0, 0);
        } else {
            Insets var3 = class68.field1262.getInsets();
            class115.field2147.setLocation(var3.left, var3.top);
        }
        class115.field2147.addFocusListener(this);
        class115.field2147.requestFocus();
        class180.field3572 = true;
        class28.field462 = false;
        if (arg0 == 25430) {
            class76.field1377 = class171.method1146((byte) 119);
        }
    }

    @OriginalMember(owner = "client!kf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1792++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method542(boolean arg0, int arg1, Object arg2) {
        field1820++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class207.method1349(var3, (byte) 81) : var3;
        } else if (arg2 instanceof class23) {
            class23 var4 = (class23) arg2;
            return var4.method135((byte) 7);
        } else if (arg1 == 31) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "run", descriptor = "()V")
    public final void run() {
        field1801++;
        try {
            if (class149.field2878 != null) {
                String var1 = class149.field2878.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class149.field2883;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method545("wrongjava", -91);
                        return;
                    }
                    class102.field1887 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class149.field2883 == null || class149.field2883.equals("1.4.2"))) {
                    this.method545("wrongjava", -101);
                    return;
                }
            }
            if (class77.field1393.field2873 != null) {
                Method var3 = class149.field2868;
                if (var3 != null) {
                    try {
                        var3.invoke(class77.field1393.field2873, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method541(25430);
            class157.field3113 = class204.method1323(class115.field2147, (byte) -63, class138.field2665, class50.field802);
            this.method173(-105);
            class167.field3336 = class120.method677(0);
            while (class117.field2192 == 0L || class171.method1146((byte) 116) < class117.field2192) {
                class75.field1361 = class167.field3336.method307((byte) -44, class102.field1887, class91.field1660);
                for (int var4 = 0; var4 < class75.field1361; var4++) {
                    this.method543((byte) 123);
                }
                this.method544(-18914);
                class43.method232(class115.field2147, class77.field1393, 62);
            }
        } catch (Exception var7) {
            class141.method882(true, null, var7);
            this.method545("crash", 30);
        }
        this.method546(0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    private final void method543(byte arg0) {
        if (arg0 != 123) {
            return;
        }
        field1790++;
        long var2 = class171.method1146((byte) 113);
        long var4 = class183.field3613[class139.field2686];
        class183.field3613[class139.field2686] = var2;
        class139.field2686 = class139.field2686 + 1 & 0x1F;
        synchronized (this) {
            class102.field1888 = class80.field1417;
        }
        this.method169(-382);
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    private final void method544(int arg0) {
        field1817++;
        long var2 = class171.method1146((byte) -116);
        long var4 = class176.field3507[class16.field284];
        class176.field3507[class16.field284] = var2;
        class16.field284 = class16.field284 + 1 & 0x1F;
        if (arg0 != -18914) {
            return;
        }
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class182.field3598 = ((var6 >> 1) + 32000) / var6;
        }
        if (class98.field1832++ > 50) {
            class98.field1832 -= 50;
            class180.field3572 = true;
            class115.field2147.setSize(class138.field2665, class50.field802);
            class115.field2147.setVisible(true);
            if (class68.field1262 == null) {
                class115.field2147.setLocation(0, 0);
            } else {
                Insets var7 = class68.field1262.getInsets();
                class115.field2147.setLocation(var7.left, var7.top);
            }
        }
        this.method172(false);
    }

    @OriginalMember(owner = "client!kf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1793++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public abstract void method170(byte arg0);

    @OriginalMember(owner = "client!kf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1795++;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public abstract void method169(int arg0);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method545(String arg0, int arg1) {
        field1800++;
        if (this.field1797) {
            return;
        }
        int var3 = -33 / ((arg1 + 48) / 32);
        this.field1797 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
    public abstract void method168(boolean arg0);

    @OriginalMember(owner = "client!kf", name = "providesignlink", descriptor = "(Lqd;)V")
    public static final void providesignlink(class149 arg0) {
        class77.field1393 = arg0;
        class28.field457 = arg0;
        field1802++;
    }

    @OriginalMember(owner = "client!kf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1804++;
        this.destroy();
    }

    @OriginalMember(owner = "client!kf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1815++;
        if (class117.field2190 != this || class124.field2317) {
            return;
        }
        class180.field3572 = true;
        if (class149.field2883 != null && class149.field2883.startsWith("1.5") && class171.method1146((byte) 22) - class76.field1377 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class138.field2665 && class50.field802 <= var2.height) {
                class28.field462 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1814++;
        if (class117.field2190 == this && !class124.field2317) {
            class117.field2192 = class171.method1146((byte) 121);
            class39.method212(75, 5000L);
            class28.field457 = null;
            this.method546(0);
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    private final synchronized void method546(int arg0) {
        field1823++;
        if (class124.field2317 || arg0 != 0) {
            return;
        }
        class124.field2317 = true;
        try {
            class115.field2147.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method168(true);
        } catch (Exception var4) {
        }
        if (class68.field1262 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class77.field1393 != null) {
            try {
                class77.field1393.method907((byte) -66);
            } catch (Exception var2) {
            }
        }
        this.method170((byte) -115);
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(Z)Z")
    public final boolean method547(boolean arg0) {
        field1819++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (!arg0) {
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
                this.method545("invalidhost", -82);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1805++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!kf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class80.field1417 = false;
        field1796++;
    }

    @OriginalMember(owner = "client!kf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1813++;
        if (class68.field1262 == null) {
            return class77.field1393 == null || class77.field1393.field2873 == this ? super.getParameter(arg0) : class77.field1393.field2873.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(Z)V")
    public static void method548(boolean arg0) {
        field1812 = null;
        field1794 = null;
        field1818 = null;
        if (!arg0) {
            method548(false);
        }
        field1808 = null;
        field1803 = null;
    }

    @OriginalMember(owner = "client!kf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1807++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method549(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        try {
            class50.field802 = arg0;
            class138.field2665 = arg5;
            class154.field3041 = arg2;
            class117.field2190 = this;
            class68.field1262 = new Frame();
            class68.field1262.setTitle("Jagex");
            class68.field1262.setResizable(false);
            class68.field1262.addWindowListener(this);
            class68.field1262.setVisible(true);
            class68.field1262.toFront();
            Insets var8 = class68.field1262.getInsets();
            class68.field1262.setSize(arg5 + var8.right + var8.left, var8.bottom + arg0 + var8.top);
            class28.field457 = class77.field1393 = new class149(true, null, arg6, arg3, arg1);
            class77.field1393.method909(-5836, this, arg4);
        } catch (Exception var10) {
            class141.method882(true, null, var10);
        }
        field1816++;
    }

    @OriginalMember(owner = "client!kf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1825++;
        if (class68.field1262 == null) {
            return class77.field1393 == null || class77.field1393.field2873 == this ? super.getAppletContext() : class77.field1393.field2873.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
    public abstract void method173(int arg0);
}
