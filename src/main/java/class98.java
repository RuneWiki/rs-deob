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

@OriginalClass("client!uh")
public abstract class class98 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Z")
    private boolean field1831 = false;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "Lhj;")
    public static class69 field1842 = class181.method1318("Ladevorgang )2 bitte warten Sie)3", (byte) -125);

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Lhj;")
    public static class69 field1846 = class181.method1318(" zuerst von Ihrer Freunde)2Liste(Q", (byte) -112);

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field1852 = 0;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "Lhj;")
    private static class69 field1854 = class181.method1318("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", (byte) -115);

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[I")
    public static int[] field1838 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lhj;")
    public static class69 field1819 = field1854;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lta;")
    public static class241 field1826 = new class241(50);

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field1856 = 0;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "Lhj;")
    public static class69 field1857 = class181.method1318("<col=ffff00>", (byte) -117);

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "Lhj;")
    private static class69 field1861 = class181.method1318("flash3:", (byte) -123);

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "[[I")
    public static int[][] field1862 = new int[104][104];

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "Lhj;")
    public static class69 field1858 = field1861;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Lhj;")
    public static class69 field1855 = field1861;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "Lhj;")
    public static class69 field1864 = class181.method1318("unzap", (byte) -109);

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "Lka;")
    public static class243 field1860 = new class243();

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "Lvc;")
    public static class185 field1839;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "Lnc;")
    public static class83 field1859;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "Lnc;")
    public static class83 field1863;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)V")
    public static final void method718(int arg0, byte arg1) {
        field1845++;
        if (arg1 > -79) {
            field1858 = null;
        }
        class65 var2 = (class65) class4.field25.method769(true, (long) arg0);
        if (var2 != null) {
            var2.method632(-8296);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    private final void method719(int arg0) {
        field1837++;
        long var2 = class223.method1584(-25392);
        long var4 = class136.field2549[class268.field4759];
        class136.field2549[class268.field4759] = var2;
        class268.field4759 = class268.field4759 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class233.field4256 = class81.field1563;
            if (arg0 != 16083) {
                this.run();
            }
        }
        this.method734((byte) 126);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public final synchronized void method720(byte arg0) {
        if (class212.field3862 != null) {
            class212.field3862.removeFocusListener(this);
            class212.field3862.getParent().remove(class212.field3862);
        }
        field1822++;
        Container var2;
        if (class47.field680 != null) {
            var2 = class47.field680;
        } else if (class10.field85 == null) {
            var2 = class36.field508.field601;
        } else {
            var2 = class10.field85;
        }
        var2.setLayout((LayoutManager) null);
        class212.field3862 = new class216(this);
        var2.add(class212.field3862);
        int var3 = -3 / ((arg0 - 36) / 60);
        class212.field3862.setSize(class66.field1278, class20.field287);
        class212.field3862.setVisible(true);
        if (class10.field85 == var2) {
            Insets var4 = class10.field85.getInsets();
            class212.field3862.setLocation(class39.field549 + var4.left, var4.top - -class17.field224);
        } else {
            class212.field3862.setLocation(class39.field549, class17.field224);
        }
        class212.field3862.addFocusListener(this);
        class212.field3862.requestFocus();
        class233.field4256 = true;
        class81.field1563 = true;
        class57.field1031 = true;
        class73.field1409 = false;
        class122.field2278 = class223.method1584(-25392);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)Lwh;")
    public static final class188 method721(int arg0, boolean arg1) {
        field1818++;
        class188 var2 = (class188) class259.field4642.method1448((long) arg0, (byte) -40);
        if (arg1) {
            method727(69, 86);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class189.field3435.method590(arg0, 26, 0);
        class188 var4 = new class188();
        if (var3 != null) {
            var4.method1368(0, new class128(var3));
        }
        class259.field4642.method1453(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILnc;BI)Lhk;")
    public static final class121 method722(int arg0, class83 arg1, byte arg2, int arg3) {
        if (arg2 == 24) {
            field1833++;
            return class244.method1735(arg1, 0, arg3, arg0) ? class194.method1413((byte) -116) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
    public final void method723(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1820++;
        if (arg3 > -104) {
            return;
        }
        try {
            if (class255.field4584 == null) {
                class39.field549 = 0;
                class66.field1278 = arg1;
                class46.field667 = arg1;
                class17.field224 = 0;
                class255.field4594 = arg2;
                class255.field4584 = this;
                class20.field287 = arg4;
                class11.field104 = arg4;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class36.field508 == null) {
                    class164.field3029 = class36.field508 = new class42(false, this, arg0, (String) null, 0);
                }
                class36.field508.method232(this, 1, (byte) 107);
            } else {
                class206.field3757++;
                if (class206.field3757 >= 3) {
                    this.method730(1, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class222.method1575((String) null, var8, 59);
            this.method730(1, "crash");
        }
    }

    @OriginalMember(owner = "client!uh", name = "stop", descriptor = "()V")
    public final void stop() {
        field1832++;
        if (class255.field4584 == this && !class139.field2591) {
            class36.field498 = class223.method1584(-25392) + 4000L;
        }
    }

    @OriginalMember(owner = "client!uh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1827++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZ)V")
    private final void method724(byte arg0, boolean arg1) {
        field1835++;
        synchronized (this) {
            if (class139.field2591) {
                return;
            }
            class139.field2591 = true;
        }
        if (class36.field508.field601 != null) {
            class36.field508.field601.destroy();
        }
        try {
            if (arg0 < 111) {
                field1852 = -64;
            }
            this.method732(127);
        } catch (Exception var9) {
        }
        if (class212.field3862 != null) {
            try {
                class212.field3862.removeFocusListener(this);
                class212.field3862.getParent().remove(class212.field3862);
            } catch (Exception var8) {
            }
        }
        if (class36.field508 != null) {
            try {
                class36.field508.method241(0);
            } catch (Exception var7) {
            }
        }
        this.method725((byte) 119);
        if (class10.field85 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!uh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class81.field1563 = false;
        field1829++;
    }

    @OriginalMember(owner = "client!uh", name = "start", descriptor = "()V")
    public final void start() {
        field1825++;
        if (class255.field4584 == this && !class139.field2591) {
            class36.field498 = 0L;
        }
    }

    @OriginalMember(owner = "client!uh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1850++;
    }

    @OriginalMember(owner = "client!uh", name = "run", descriptor = "()V")
    public final void run() {
        field1840++;
        try {
            if (class42.field607 != null) {
                String var1 = class42.field607.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class42.field591;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method730(1, "wrongjava");
                        return;
                    }
                    class263.field4700 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class42.field591 == null || class42.field591.equals("1.4.2"))) {
                    this.method730(1, "wrongjava");
                    return;
                }
            }
            if (class36.field508.field601 != null) {
                Method var3 = class42.field609;
                if (var3 != null) {
                    try {
                        var3.invoke(class36.field508.field601, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method720((byte) 99);
            class84.field1623 = class132.method973(class66.field1278, class212.field3862, (byte) -114, class20.field287);
            this.method726((byte) 110);
            class59.field1075 = class108.method815(36);
            while (class36.field498 == 0L || class223.method1584(-25392) < class36.field498) {
                class85.field1659 = class59.field1075.method163(5, class268.field4767, class263.field4700);
                for (int var4 = 0; var4 < class85.field1659; var4++) {
                    this.method719(16083);
                }
                this.method731((byte) -61);
                class203.method1473(class36.field508, -41, class212.field3862);
            }
        } catch (Exception var7) {
            class222.method1575((String) null, var7, -81);
            this.method730(1, "crash");
        }
        this.method724((byte) 127, true);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public abstract void method725(byte arg0);

    @OriginalMember(owner = "client!uh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1847++;
    }

    @OriginalMember(owner = "client!uh", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1853++;
        if (class255.field4584 == this && !class139.field2591) {
            class36.field498 = class223.method1584(-25392);
            class59.method356(false, 5000L);
            class164.field3029 = null;
            this.method724((byte) 116, false);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
    public abstract void method726(byte arg0);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lhj;")
    public static final class69 method727(int arg0, int arg1) {
        if (arg0 != -229) {
            field1856 = 7;
        }
        field1841++;
        return class26.method147(false, 10, 116, arg1);
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)Z")
    public final boolean method728(byte arg0) {
        field1851++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 <= 3) {
                this.method720((byte) -65);
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
                this.method730(1, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static void method729(boolean arg0) {
        field1858 = null;
        field1842 = null;
        field1838 = null;
        field1855 = null;
        field1826 = null;
        field1839 = null;
        field1862 = null;
        if (arg0) {
            field1860 = null;
        }
        field1859 = null;
        field1846 = null;
        field1819 = null;
        field1854 = null;
        field1863 = null;
        field1857 = null;
        field1860 = null;
        field1864 = null;
        field1861 = null;
    }

    @OriginalMember(owner = "client!uh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1849++;
        if (class10.field85 == null) {
            return class36.field508 == null || class36.field508.field601 == this ? super.getDocumentBase() : class36.field508.field601.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1836++;
        class81.field1563 = true;
        class57.field1031 = true;
    }

    @OriginalMember(owner = "client!uh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1816++;
        if (class10.field85 == null) {
            return class36.field508 == null || class36.field508.field601 == this ? super.getParameter(arg0) : class36.field508.field601.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method730(int arg0, String arg1) {
        field1823++;
        if (this.field1831) {
            return;
        }
        this.field1831 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            if (arg0 != 1) {
                field1842 = null;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!uh", name = "providesignlink", descriptor = "(Lsd;)V")
    public static final void providesignlink(class42 arg0) {
        field1843++;
        class36.field508 = arg0;
        class164.field3029 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1815++;
        if (class255.field4584 != this || class139.field2591) {
            return;
        }
        class57.field1031 = true;
        if (class42.field591 != null && class42.field591.startsWith("1.5") && class223.method1584(-25392) - class122.field2278 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class46.field667 <= var2.width && var2.height >= class11.field104) {
                class73.field1409 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1834++;
        if (class10.field85 == null) {
            return class36.field508 == null || class36.field508.field601 == this ? super.getAppletContext() : class36.field508.field601.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1830++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!uh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1824++;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V")
    private final void method731(byte arg0) {
        int var2 = 102 % ((arg0 - 74) / 37);
        field1848++;
        long var3 = class223.method1584(-25392);
        long var5 = class163.field3008[class11.field94];
        class163.field3008[class11.field94] = var3;
        class11.field94 = class11.field94 + 1 & 0x1F;
        if (var5 != 0L && var5 < var3) {
            int var7 = (int) (var3 - var5);
            class211.field3839 = ((var7 >> 1) + 32000) / var7;
        }
        if (class179.field3255++ > 50) {
            class57.field1031 = true;
            class179.field3255 -= 50;
            class212.field3862.setSize(class66.field1278, class20.field287);
            class212.field3862.setVisible(true);
            if (class10.field85 != null && class47.field680 == null) {
                Insets var8 = class10.field85.getInsets();
                class212.field3862.setLocation(class39.field549 + var8.left, class17.field224 + var8.top);
            } else {
                class212.field3862.setLocation(class39.field549, class17.field224);
            }
        }
        this.method733((byte) 59);
    }

    @OriginalMember(owner = "client!uh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1814++;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public abstract void method732(int arg0);

    @OriginalMember(owner = "client!uh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1821++;
        if (class10.field85 == null) {
            return class36.field508 == null || class36.field508.field601 == this ? super.getCodeBase() : class36.field508.field601.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(B)V")
    public abstract void method733(byte arg0);

    @OriginalMember(owner = "client!uh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1844++;
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(B)V")
    public abstract void method734(byte arg0);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method735(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class255.field4594 = arg6;
            class39.field549 = 0;
            class17.field224 = arg4;
            class255.field4584 = this;
            class66.field1278 = arg3;
            class46.field667 = arg3;
            class20.field287 = arg1;
            class11.field104 = arg1;
            class10.field85 = new Frame();
            class10.field85.setTitle("Jagex");
            class10.field85.setResizable(true);
            class10.field85.addWindowListener(this);
            class10.field85.setVisible(true);
            class10.field85.toFront();
            Insets var8 = class10.field85.getInsets();
            class10.field85.setSize(class46.field667 + var8.left + var8.right, class11.field104 + var8.top + var8.bottom);
            class164.field3029 = class36.field508 = new class42(true, (Applet) null, arg2, arg0, arg5);
            class36.field508.method232(this, 1, (byte) 107);
        } catch (Exception var10) {
            class222.method1575((String) null, var10, arg4 ^ 0xFFFFFFC3);
        }
        field1817++;
    }

    @OriginalMember(owner = "client!uh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1828++;
    }
}
