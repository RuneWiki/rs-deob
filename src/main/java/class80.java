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

@OriginalClass("client!ld")
public abstract class class80 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Z")
    private boolean field1752 = false;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Loa;")
    public static class98 field1760 = class38.method349(255, "");

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Loa;")
    public static class98 field1748 = field1760;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "Loa;")
    public static class98 field1776 = field1760;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Loa;")
    public static class98 field1759 = field1760;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1780 = 0;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1749 = 0;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field1792 = 99;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "Loa;")
    private static class98 field1779 = class38.method349(255, "flash3:");

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Loa;")
    public static class98 field1773 = field1779;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Loa;")
    public static class98 field1766 = field1760;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "Loa;")
    public static class98 field1791 = class38.method349(255, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Loa;")
    private static class98 field1750 = class38.method349(255, "Accept trade");

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "Loa;")
    private static class98 field1782 = class38.method349(255, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "Loa;")
    public static class98 field1795 = field1779;

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "Loa;")
    public static class98 field1799 = field1782;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Loa;")
    public static class98 field1777 = field1760;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "[[[B")
    public static byte[][][] field1771 = new byte[4][104][104];

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "Loa;")
    public static class98 field1774 = field1750;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Loa;")
    public static class98 field1744 = field1760;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Lrc;")
    public static class119 field1775;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "Z")
    public static boolean field1800;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "[I")
    public static int[] field1763;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Z")
    public static final boolean method634(int arg0, int arg1, int arg2) {
        field1783++;
        if (arg2 == 0 && class94.field2152 == arg0) {
            return true;
        } else if (arg2 == 1 && class123.field2739 == arg0) {
            return true;
        } else {
            if (arg1 != 23979) {
                field1775 = null;
            }
            return (arg2 == 2 || arg2 == 3) && class64.field1366 == arg0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1758++;
        if (class96.field2206 == null) {
            return class10.field203 == null || class10.field203.field1492 == this ? super.getParameter(arg0) : class10.field203.field1492.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1781++;
        if (class96.field2206 == null) {
            return class10.field203 == null || class10.field203.field1492 == this ? super.getCodeBase() : class10.field203.field1492.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBII)V")
    public final void method635(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1764++;
        if (arg2 > -69) {
            field1799 = null;
        }
        try {
            if (class129.field2983 == null) {
                class36.field891 = arg3;
                class30.field700 = arg4;
                class6.field112 = arg1;
                class129.field2983 = this;
                if (class10.field203 == null) {
                    class106.field2433 = class10.field203 = new class72(false, this, arg0, null, 0);
                }
                class10.field203.method581(1, 25093, this);
            } else {
                class54.field1199++;
                if (class54.field1199 >= 3) {
                    this.method642("alreadyloaded", 119);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            }
        } catch (Exception var7) {
            class75.method617(58, null, var7);
            this.method642("crash", 84);
        }
    }

    @OriginalMember(owner = "client!ld", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1755++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public abstract void method207(int arg0);

    @OriginalMember(owner = "client!ld", name = "start", descriptor = "()V")
    public final void start() {
        field1769++;
        if (class129.field2983 == this && !class101.field2339) {
            class124.field2765 = 0L;
        }
    }

    @OriginalMember(owner = "client!ld", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1798++;
    }

    @OriginalMember(owner = "client!ld", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1789++;
        if (class96.field2206 == null) {
            return class10.field203 == null || class10.field203.field1492 == this ? super.getDocumentBase() : class10.field203.field1492.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1793++;
        if (class129.field2983 != this || class101.field2339) {
            return;
        }
        class97.field2220 = true;
        if (class72.field1500 != null && class72.field1500.startsWith("1.5") && class44.method375((byte) 7) - class67.field1432 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class36.field891 <= var2.width && var2.height >= class30.field700) {
                class106.field2439 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    private final synchronized void method636(byte arg0) {
        field1751++;
        if (class101.field2339) {
            return;
        }
        if (arg0 != 96) {
            field1777 = null;
        }
        class101.field2339 = true;
        try {
            class73.field1506.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method207(12015);
        } catch (Exception var4) {
        }
        if (class96.field2206 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class10.field203 != null) {
            try {
                class10.field203.method580(true);
            } catch (Exception var2) {
            }
        }
        this.method201(true);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    private final void method637(int arg0) {
        field1784++;
        long var2 = class44.method375((byte) 36);
        long var4 = class124.field2778[class76.field1674];
        if (arg0 > -108) {
            field1795 = null;
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class124.field2778[class76.field1674] = var2;
        class76.field1674 = class76.field1674 + 1 & 0x1F;
        synchronized (this) {
            class99.field2318 = class37.field929;
        }
        this.method210(true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public abstract void method201(boolean arg0);

    @OriginalMember(owner = "client!ld", name = "providesignlink", descriptor = "(Lkc;)V")
    public static final void providesignlink(class72 arg0) {
        class10.field203 = arg0;
        class106.field2433 = arg0;
        field1747++;
    }

    @OriginalMember(owner = "client!ld", name = "stop", descriptor = "()V")
    public final void stop() {
        field1787++;
        if (class129.field2983 == this && !class101.field2339) {
            class124.field2765 = class44.method375((byte) 3) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ld", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1743++;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public abstract void method203(int arg0);

    @OriginalMember(owner = "client!ld", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1797++;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
    public final synchronized void method638(int arg0) {
        Container var2;
        if (class96.field2206 == null) {
            var2 = class10.field203.field1492;
        } else {
            var2 = class96.field2206;
        }
        field1790++;
        if (class73.field1506 != null) {
            class73.field1506.removeFocusListener(this);
            var2.remove(class73.field1506);
        }
        class73.field1506 = new class135(this);
        var2.add(class73.field1506);
        class73.field1506.setSize(class36.field891, class30.field700);
        class73.field1506.setVisible(true);
        if (class96.field2206 == null) {
            class73.field1506.setLocation(0, 0);
        } else {
            Insets var3 = class96.field2206.getInsets();
            class73.field1506.setLocation(var3.left, var3.top);
        }
        if (arg0 != 0) {
            field1771 = null;
        }
        class73.field1506.addFocusListener(this);
        class73.field1506.requestFocus();
        class97.field2220 = true;
        class106.field2439 = false;
        class67.field1432 = class44.method375((byte) 5);
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
    private final void method639(int arg0) {
        field1767++;
        long var2 = class132.field3121[class140.field3426];
        long var4 = class44.method375((byte) 46);
        class132.field3121[class140.field3426] = var4;
        if ((long) arg0 != var2 && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class101.field2333 = ((var6 >> 1) + 32000) / var6;
        }
        class140.field3426 = class140.field3426 + 1 & 0x1F;
        if (class77.field1685++ > 50) {
            class97.field2220 = true;
            class77.field1685 -= 50;
            class73.field1506.setSize(class36.field891, class30.field700);
            class73.field1506.setVisible(true);
            if (class96.field2206 == null) {
                class73.field1506.setLocation(0, 0);
            } else {
                Insets var7 = class96.field2206.getInsets();
                class73.field1506.setLocation(var7.left, var7.top);
            }
        }
        this.method203(30);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ltb;ZLtb;Ltb;)V")
    public static final void method640(class130 arg0, boolean arg1, class130 arg2, class130 arg3) {
        class130.field3053 = arg3;
        class4.field70 = arg0;
        field1768++;
        class71.field1452 = arg2;
        if (!arg1) {
            field1780 = 70;
        }
        class36.field901 = new class132[class71.field1452.method1055((byte) 53)][];
        class119.field2682 = new boolean[class71.field1452.method1055((byte) 53)];
    }

    @OriginalMember(owner = "client!ld", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ld", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1754++;
    }

    @OriginalMember(owner = "client!ld", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1756++;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static void method641(byte arg0) {
        field1791 = null;
        field1777 = null;
        field1750 = null;
        field1763 = null;
        field1774 = null;
        field1782 = null;
        field1773 = null;
        field1759 = null;
        field1748 = null;
        field1775 = null;
        field1795 = null;
        field1760 = null;
        if (arg0 != 89) {
            return;
        }
        field1799 = null;
        field1766 = null;
        field1771 = null;
        field1776 = null;
        field1779 = null;
        field1744 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method642(String arg0, int arg1) {
        field1796++;
        if (this.field1752) {
            return;
        }
        this.field1752 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
            if (arg1 <= 80) {
                field1776 = null;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
    public abstract void method210(boolean arg0);

    @OriginalMember(owner = "client!ld", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1770++;
        if (class96.field2206 == null) {
            return class10.field203 == null || class10.field203.field1492 == this ? super.getAppletContext() : class10.field203.field1492.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)Z")
    public final boolean method643(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1746++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 10373) {
                providesignlink(null);
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
                this.method642("invalidhost", 109);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1765++;
        if (class129.field2983 == this && !class101.field2339) {
            class124.field2765 = class44.method375((byte) 76);
            class82.method691(5000L, (byte) -127);
            class106.field2433 = null;
            this.method636((byte) 96);
        }
    }

    @OriginalMember(owner = "client!ld", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1762++;
    }

    @OriginalMember(owner = "client!ld", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1772++;
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)Lhe;")
    private static final class54 method644(int arg0) {
        field1788++;
        try {
            if (arg0 != -29192) {
                field1760 = null;
            }
            return (class54) Class.forName("mb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class102();
        }
    }

    @OriginalMember(owner = "client!ld", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1778++;
        class37.field929 = false;
    }

    @OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
    public final void run() {
        field1786++;
        try {
            if (class72.field1503 != null) {
                String var1 = class72.field1503.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class72.field1500;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method642("wrongjava", 106);
                        return;
                    }
                    class137.field3313 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class72.field1500 == null || class72.field1500.equals("1.4.2"))) {
                    this.method642("wrongjava", 109);
                    return;
                }
            }
            if (class10.field203.field1492 != null) {
                Method var3 = class72.field1490;
                if (var3 != null) {
                    try {
                        var3.invoke(class10.field203.field1492, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method638(0);
            class62.field1328 = class14.method148(class30.field700, class73.field1506, class36.field891, -27261);
            this.method205(1);
            class19.field416 = method644(-29192);
            class19.field416.method441(-102);
            while (class124.field2765 == 0L || class44.method375((byte) 89) < class124.field2765) {
                class19.field421 = class19.field416.method444(class137.field3313, -16207, class111.field2486);
                for (int var4 = 0; var4 < class19.field421; var4++) {
                    this.method637(-121);
                }
                this.method639(0);
                class137.method1108(13170, true);
            }
        } catch (Exception var7) {
            class75.method617(58, null, var7);
            this.method642("crash", 92);
        }
        this.method636((byte) 96);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIII)V")
    public static final void method645(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            method641((byte) 9);
        }
        field1761++;
        for (int var5 = arg1; var5 <= arg1 + arg4; var5++) {
            for (int var6 = arg2; var6 <= arg2 + arg3; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class139.field3392[0][var6][var5] = 127;
                    if (arg2 == var6 && var6 > 0) {
                        class25.field616[0][var6][var5] = class25.field616[0][var6 - 1][var5];
                    }
                    if (arg2 + arg3 == var6 && var6 < 103) {
                        class25.field616[0][var6][var5] = class25.field616[0][var6 + 1][var5];
                    }
                    if (arg1 == var5 && var5 > 0) {
                        class25.field616[0][var6][var5] = class25.field616[0][var6][var5 - 1];
                    }
                    if (arg1 + arg4 == var5 && var5 < 103) {
                        class25.field616[0][var6][var5] = class25.field616[0][var6][var5 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)V")
    public abstract void method205(int arg0);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;IBIIII)V")
    public final void method646(String arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1785++;
        try {
            class129.field2983 = this;
            class6.field112 = arg1;
            class36.field891 = arg3;
            class30.field700 = arg6;
            class96.field2206 = new Frame();
            class96.field2206.setTitle("Jagex");
            class96.field2206.setResizable(false);
            class96.field2206.addWindowListener(this);
            if (arg2 < 46) {
                field1759 = null;
            }
            class96.field2206.setVisible(true);
            class96.field2206.toFront();
            Insets var8 = class96.field2206.getInsets();
            class96.field2206.setSize(var8.right + arg3 + var8.left, arg6 - -var8.top - -var8.bottom);
            class106.field2433 = class10.field203 = new class72(true, null, arg5, arg0, arg4);
            class10.field203.method581(1, 25093, this);
        } catch (Exception var10) {
            class75.method617(58, null, var10);
        }
    }

    @OriginalMember(owner = "client!ld", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class37.field929 = true;
        class97.field2220 = true;
        field1745++;
    }
}
