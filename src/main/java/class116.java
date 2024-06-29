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

@OriginalClass("client!vd")
public abstract class class116 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Z")
    private boolean field2056 = false;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Llc;")
    public static class143 field2043 = class66.method374("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -1);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Llc;")
    public static class143 field2033 = class66.method374("mem=", -1);

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Llc;")
    private static class143 field2046 = class66.method374(" from your ignore list first)3", -1);

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "Z")
    public static boolean field2070 = true;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Llc;")
    public static class143 field2039 = field2046;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Lfd;")
    public static class213 field2068;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lgf;")
    public static class7 field2036;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "Z")
    public static boolean field2076;

    @OriginalMember(owner = "client!vd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2035++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2059++;
    }

    @OriginalMember(owner = "client!vd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2053++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public abstract void method701(int arg0);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public abstract void method702(int arg0);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIILjava/lang/String;IIB)V")
    public final void method703(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, byte arg6) {
        field2066++;
        try {
            class141.field2459 = 0;
            if (arg6 > -56) {
                this.method714(false);
            }
            class257.field4620 = 0;
            class269.field4820 = arg5;
            class217.field3979 = arg5;
            class10.field222 = arg0;
            class159.field2883 = arg0;
            class47.field921 = this;
            class67.field1262 = arg4;
            class8.field155 = new Frame();
            class8.field155.setTitle("Jagex");
            class8.field155.setResizable(true);
            class8.field155.addWindowListener(this);
            class8.field155.setVisible(true);
            class8.field155.toFront();
            Insets var8 = class8.field155.getInsets();
            class8.field155.setSize(class159.field2883 + var8.left + var8.right, class217.field3979 + var8.top + var8.bottom);
            class8.field152 = class4.field62 = new class81((Applet) null, arg2, arg3, arg1);
            class181 var9 = class4.field62.method460(this, (byte) 102, 1);
            while (var9.field3241 == 0) {
                class61.method347(10L, 1);
            }
        } catch (Exception var11) {
            class255.method1689(103, (String) null, var11);
        }
    }

    @OriginalMember(owner = "client!vd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2071++;
        if (class8.field155 == null) {
            return class4.field62 == null || class4.field62.field1469 == this ? super.getParameter(arg0) : class4.field62.field1469.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2040++;
    }

    @OriginalMember(owner = "client!vd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2047++;
        this.destroy();
    }

    @OriginalMember(owner = "client!vd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2058++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static final void method704(byte arg0) {
        if (arg0 != -63) {
            return;
        }
        class285.field5010.method799(103, 121);
        for (class163 var1 = (class163) class212.field3942.method1818(false); var1 != null; var1 = (class163) class212.field3942.method1834((byte) -13)) {
            if (var1.field2921 == 0) {
                class17.method128(0, true, var1);
            }
        }
        if (class281.field4937 != null) {
            class141.method844((byte) -121, class281.field4937);
            class281.field4937 = null;
        }
        field2055++;
        class68.field1291++;
    }

    @OriginalMember(owner = "client!vd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2073++;
        if (class8.field155 == null) {
            return class4.field62 == null || class4.field62.field1469 == this ? super.getAppletContext() : class4.field62.field1469.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2065++;
        if (class47.field921 != this || class110.field1936) {
            return;
        }
        class105.field1851 = true;
        if (class262.field4671 && (class205.method1403(-49) - class206.field3738) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class159.field2883 <= var2.width && var2.height >= class217.field3979) {
                class201.field3672 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)V")
    public static final void method705(int arg0, byte arg1, int arg2) {
        field2064++;
        class227.field4096 = arg2 - class245.field4412;
        int var3 = class227.field4096 - ((int) ((float) class12.field236.field735 / class5.field80));
        class147.field2651 = class236.field4298 + class25.field426 - arg0 - 1;
        int var4 = (int) ((float) class12.field236.field735 / class5.field80) + class227.field4096;
        int var5 = class147.field2651 - (int) ((float) class12.field236.field831 / class5.field80);
        if (var3 < 0) {
            class227.field4096 = (int) ((float) class12.field236.field735 / class5.field80);
        }
        if (class169.field3009 < var4) {
            class227.field4096 = class169.field3009 - ((int) ((float) class12.field236.field735 / class5.field80));
        }
        int var6 = (int) ((float) class12.field236.field831 / class5.field80) + class147.field2651;
        int var7 = 57 % ((arg1 - 58) / 42);
        if (var5 < 0) {
            class147.field2651 = (int) ((float) class12.field236.field831 / class5.field80);
        }
        if (class25.field426 < var6) {
            class147.field2651 = class25.field426 - (int) ((float) class12.field236.field831 / class5.field80);
        }
    }

    @OriginalMember(owner = "client!vd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2048++;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public static final void method706(int arg0) {
        if (class221.field4004 != null) {
            class161 var1 = class221.field4004;
            synchronized (class221.field4004) {
                class221.field4004 = null;
            }
        }
        field2069++;
        if (arg0 != -1) {
            field2070 = true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "providesignlink", descriptor = "(Lq;)V")
    public static final void providesignlink(class81 arg0) {
        class4.field62 = arg0;
        class8.field152 = arg0;
        field2061++;
    }

    @OriginalMember(owner = "client!vd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2032++;
        class12.field235 = true;
        class105.field1851 = true;
    }

    @OriginalMember(owner = "client!vd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2051++;
        if (class47.field921 == this && !class110.field1936) {
            class184.field3334 = class205.method1403(57);
            class61.method347(5000L, 1);
            class8.field152 = null;
            this.method707(false, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!vd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2067++;
        class12.field235 = false;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZB)V")
    private final void method707(boolean arg0, byte arg1) {
        field2045++;
        int var3 = -89 / ((arg1 + 45) / 59);
        synchronized (this) {
            if (class110.field1936) {
                return;
            }
            class110.field1936 = true;
        }
        if (class4.field62.field1469 != null) {
            class4.field62.field1469.destroy();
        }
        try {
            this.method701(22818);
        } catch (Exception var10) {
        }
        if (class155.field2792 != null) {
            try {
                class155.field2792.removeFocusListener(this);
                class155.field2792.getParent().remove(class155.field2792);
            } catch (Exception var9) {
            }
        }
        if (class4.field62 != null) {
            try {
                class4.field62.method467(115);
            } catch (Exception var8) {
            }
        }
        this.method709(-118);
        if (class8.field155 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)Z")
    public final boolean method708(int arg0) {
        field2052++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        int var3 = -115 / ((-arg0 - 9) / 57);
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
                this.method713("invalidhost", 121);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2031++;
        if (class8.field155 == null) {
            return class4.field62 == null || class4.field62.field1469 == this ? super.getDocumentBase() : class4.field62.field1469.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public abstract void method709(int arg0);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method710(byte arg0) {
        field2046 = null;
        field2039 = null;
        field2043 = null;
        if (arg0 <= 27) {
            field2034 = 64;
        }
        field2033 = null;
        field2068 = null;
        field2036 = null;
    }

    @OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
    public final void run() {
        field2072++;
        try {
            if (class81.field1465 != null) {
                String var1 = class81.field1465.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class81.field1474;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method713("wrongjava", 127);
                        return;
                    }
                    class164.field2935 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class81.field1474 == null || class81.field1474.equals("1.4.2"))) {
                    this.method713("wrongjava", 127);
                    return;
                }
            }
            if (class81.field1474 != null && class81.field1474.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class81.field1474.length() > var3) {
                    char var5 = class81.field1474.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class262.field4671 = true;
                }
            }
            if (class4.field62.field1469 != null) {
                Method var6 = class81.field1485;
                if (var6 != null) {
                    try {
                        var6.invoke(class4.field62.field1469, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method719(94);
            class35.field608 = class269.method1784(6985, class10.field222, class269.field4820, class155.field2792);
            this.method716((byte) -34);
            class147.field2663 = class39.method251(5601);
            while (class184.field3334 == 0L || class184.field3334 > class205.method1403(126)) {
                class230.field4212 = class147.field2663.method101(class164.field2935, class265.field4772, 13855);
                for (int var7 = 0; var7 < class230.field4212; var7++) {
                    this.method717(0);
                }
                this.method711(127);
                class9.method69(class4.field62, 126, class155.field2792);
            }
        } catch (Exception var10) {
            class255.method1689(91, (String) null, var10);
            this.method713("crash", 127);
        }
        this.method707(true, (byte) -104);
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
    private final void method711(int arg0) {
        field2042++;
        if (arg0 <= 104) {
            return;
        }
        long var2 = class188.field3411[class20.field329];
        long var4 = class205.method1403(61);
        class188.field3411[class20.field329] = var4;
        class20.field329 = class20.field329 + 1 & 0x1F;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class250.field4507 = ((var6 >> 1) + 32000) / var6;
        }
        if (class227.field4104++ > 50) {
            class105.field1851 = true;
            class227.field4104 -= 50;
            class155.field2792.setSize(class10.field222, class269.field4820);
            class155.field2792.setVisible(true);
            if (class8.field155 != null && class23.field384 == null) {
                Insets var7 = class8.field155.getInsets();
                class155.field2792.setLocation(var7.left + class141.field2459, var7.top - -class257.field4620);
            } else {
                class155.field2792.setLocation(class141.field2459, class257.field4620);
            }
        }
        this.method702(0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZII)V")
    public static final void method712(boolean arg0, int arg1, int arg2) {
        field2041++;
        class166 var3 = class262.method1746(85, arg2, 5);
        var3.method1097((byte) -74);
        if (arg0) {
            method710((byte) 67);
        }
        var3.field2978 = arg1;
    }

    @OriginalMember(owner = "client!vd", name = "stop", descriptor = "()V")
    public final void stop() {
        field2063++;
        if (class47.field921 == this && !class110.field1936) {
            class184.field3334 = class205.method1403(80) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2037++;
        if (class8.field155 == null) {
            return class4.field62 == null || class4.field62.field1469 == this ? super.getCodeBase() : class4.field62.field1469.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method713(String arg0, int arg1) {
        field2049++;
        if (this.field2056) {
            return;
        }
        this.field2056 = true;
        System.out.println("error_game_" + arg0);
        if (arg1 <= 120) {
            this.focusGained((FocusEvent) null);
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!vd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2074++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public abstract void method714(boolean arg0);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIBII)V")
    public final void method715(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2050++;
        try {
            if (class47.field921 == null) {
                class257.field4620 = 0;
                class47.field921 = this;
                class269.field4820 = arg3;
                class217.field3979 = arg3;
                class10.field222 = arg0;
                class159.field2883 = arg0;
                class67.field1262 = arg4;
                class141.field2459 = 0;
                if (arg2 >= -89) {
                    this.windowDeactivated((WindowEvent) null);
                }
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class4.field62 == null) {
                    class8.field152 = class4.field62 = new class81(this, arg1, (String) null, 0);
                }
                class181 var7 = class4.field62.method460(this, (byte) 104, 1);
                while (var7.field3241 == 0) {
                    class61.method347(10L, 1);
                }
            } else {
                class29.field456++;
                if (class29.field456 >= 3) {
                    this.method713("alreadyloaded", 126);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class255.method1689(125, (String) null, var9);
            this.method713("crash", 122);
        }
    }

    @OriginalMember(owner = "client!vd", name = "start", descriptor = "()V")
    public final void start() {
        field2044++;
        if (class47.field921 == this && !class110.field1936) {
            class184.field3334 = 0L;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
    public abstract void method716(byte arg0);

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
    private final void method717(int arg0) {
        field2038++;
        long var2 = class205.method1403(108);
        long var4 = class226.field4089[class245.field4405];
        class226.field4089[class245.field4405] = var2;
        class245.field4405 = class245.field4405 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 == 0) {
            synchronized (this) {
                class201.field3671 = class12.field235;
            }
            this.method714(false);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lqg;)V")
    public static final void method718(class211 arg0) {
        for (int var1 = arg0.field3931; var1 <= arg0.field3933; var1++) {
            for (int var2 = arg0.field3919; var2 <= arg0.field3918; var2++) {
                class120 var3 = class7.field122[arg0.field3915][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2134; var4++) {
                        if (var3.field2144[var4] == arg0) {
                            var3.field2134--;
                            for (int var5 = var4; var5 < var3.field2134; var5++) {
                                var3.field2144[var5] = var3.field2144[var5 + 1];
                                var3.field2128[var5] = var3.field2128[var5 + 1];
                            }
                            var3.field2144[var3.field2134] = null;
                            break;
                        }
                    }
                    var3.field2122 = 0;
                    for (int var6 = 0; var6 < var3.field2134; var6++) {
                        var3.field2122 |= var3.field2128[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)V")
    public final synchronized void method719(int arg0) {
        if (class155.field2792 != null) {
            class155.field2792.removeFocusListener(this);
            class155.field2792.getParent().remove(class155.field2792);
        }
        field2054++;
        Container var2;
        if (class23.field384 != null) {
            var2 = class23.field384;
        } else if (class8.field155 == null) {
            var2 = class4.field62.field1469;
        } else {
            var2 = class8.field155;
        }
        var2.setLayout((LayoutManager) null);
        class155.field2792 = new class262(this);
        int var3 = -101 % ((arg0 + 38) / 49);
        var2.add(class155.field2792);
        class155.field2792.setSize(class10.field222, class269.field4820);
        class155.field2792.setVisible(true);
        if (class8.field155 == var2) {
            Insets var4 = class8.field155.getInsets();
            class155.field2792.setLocation(class141.field2459 + var4.left, var4.top - -class257.field4620);
        } else {
            class155.field2792.setLocation(class141.field2459, class257.field4620);
        }
        class155.field2792.addFocusListener(this);
        class155.field2792.requestFocus();
        class12.field235 = true;
        class201.field3671 = true;
        class105.field1851 = true;
        class201.field3672 = false;
        class206.field3738 = class205.method1403(-116);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V")
    public static final void method720(int arg0, byte arg1) {
        if (arg1 != -26) {
            field2060 = 71;
        }
        class265.field4772 = 1000 / arg0;
        field2057++;
    }
}
