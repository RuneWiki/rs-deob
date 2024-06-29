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
import java.net.InetAddress;
import java.net.URL;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class87 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Z")
    private boolean field1947 = false;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Z")
    public static boolean field1957 = false;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lgd;")
    public static class40 field1969 = class14.method90(false, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!o", name = "s", descriptor = "[I")
    public static int[] field1954 = new int[50];

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Lgd;")
    private static class40 field1950 = class14.method90(false, "Error connecting to server)3");

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Lgd;")
    public static class40 field1952 = class14.method90(false, "_");

    @OriginalMember(owner = "client!o", name = "P", descriptor = "Lgd;")
    public static class40 field1976 = class14.method90(false, "Fertigkeit)2");

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lgd;")
    public static class40 field1939 = field1950;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "Lgd;")
    public static class40 field1977 = class14.method90(false, "Wir vermuten ihr Spielkonto wurde gestohlen");

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1972 = Calendar.getInstance();

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Z")
    public static boolean field1981;

    @OriginalMember(owner = "client!o", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 7)
    public final void focusGained(FocusEvent arg0) {
        field1965++;
        class104.field2551 = true;
        class64.field1571 = true;
    }

    @OriginalMember(owner = "client!o", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 19)
    public final void windowClosing(WindowEvent arg0) {
        field1945++;
        this.destroy();
    }

    @OriginalMember(owner = "client!o", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 27)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1955++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Z", line = 36)
    public final boolean method567(int arg0) {
        field1961++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
            return true;
        } else {
            if (arg0 != 15731) {
                this.method577(9, null);
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
                this.method577(arg0 - 15703, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/net/InetAddress;IIIILjava/lang/String;I)V", line = 67)
    public final void method568(int arg0, InetAddress arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field1968++;
        try {
            if (arg2 != 41) {
                field1954 = null;
            }
            class80.field1838 = arg7;
            class113.field2732 = arg0;
            class29.field624 = this;
            class92.field2105 = arg3;
            class74.field1717 = new Frame();
            class74.field1717.setTitle("Jagex");
            class74.field1717.setResizable(false);
            class74.field1717.addWindowListener(this);
            class74.field1717.setVisible(true);
            class74.field1717.toFront();
            Insets var9 = class74.field1717.getInsets();
            class74.field1717.setSize(var9.left + arg7 + var9.right, var9.top + arg3 + var9.bottom);
            class98.field2315 = class30.field737 = new class102(true, null, arg1, arg5, arg6, arg4);
            class30.field737.method725((byte) -68, 1, this);
        } catch (Exception var11) {
            class50.method392(116, null, var11);
        }
    }

    @OriginalMember(owner = "client!o", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 106)
    public final synchronized void paint(Graphics arg0) {
        field1959++;
        if (class29.field624 != this || class9.field232) {
            return;
        }
        class64.field1571 = true;
        if (class102.field2430 != null && class102.field2430.startsWith("1.5") && class98.method683(0) - class60.field1509 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class80.field1838 && var2.height >= class92.field2105) {
                class8.field201 = true;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "run", descriptor = "()V", line = 131)
    public final void run() {
        field1964++;
        try {
            if (class102.field2428 != null) {
                String var1 = class102.field2428.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class102.field2430;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method577(28, "wrongjava");
                        return;
                    }
                    class10.field253 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class102.field2430 == null || class102.field2430.equals("1.4.2"))) {
                    this.method577(28, "wrongjava");
                    return;
                }
            }
            if (class30.field737.field2435 != null) {
                Method var3 = class102.field2432;
                if (var3 != null) {
                    try {
                        var3.invoke(class30.field737.field2435, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method569((byte) -7);
            class94.field2169 = class136.method1072(120, class80.field1838, class30.field761, class92.field2105);
            this.method111((byte) -33);
            class86.field1933 = class79.method531((byte) -125);
            class86.field1933.method233(0);
            while (class130.field3147 == 0L || class130.field3147 > class98.method683(0)) {
                class94.field2168 = class86.field1933.method231(-105, class4.field115, class10.field253);
                for (int var4 = 0; var4 < class94.field2168; var4++) {
                    this.method576((byte) -28);
                }
                this.method572(false);
            }
        } catch (Exception var7) {
            class50.method392(58, null, var7);
            this.method577(28, "crash");
        }
        this.method571((byte) 70);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 211)
    public final synchronized void method569(byte arg0) {
        field1980++;
        Container var2;
        if (class74.field1717 == null) {
            var2 = class30.field737.field2435;
        } else {
            var2 = class74.field1717;
        }
        if (class30.field761 != null) {
            class30.field761.removeFocusListener(this);
            var2.remove(class30.field761);
        }
        class30.field761 = new class134(this);
        var2.add(class30.field761);
        class30.field761.setSize(class80.field1838, class92.field2105);
        class30.field761.setVisible(true);
        if (class74.field1717 == null) {
            class30.field761.setLocation(0, 0);
        } else {
            Insets var3 = class74.field1717.getInsets();
            class30.field761.setLocation(var3.left, var3.top);
        }
        class30.field761.addFocusListener(this);
        int var4 = 14 % ((67 - arg0) / 36);
        class30.field761.requestFocus();
        class64.field1571 = true;
        class8.field201 = false;
        class60.field1509 = class98.method683(0);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 255)
    public static final void method570(int arg0) {
        class120.field2816.method40((byte) -101);
        if (arg0 != 1) {
            field1939 = null;
        }
        field1962++;
    }

    @OriginalMember(owner = "client!o", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 276)
    public final void windowDeiconified(WindowEvent arg0) {
        field1960++;
    }

    @OriginalMember(owner = "client!o", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 287)
    public final void windowOpened(WindowEvent arg0) {
        field1937++;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 306)
    private final synchronized void method571(byte arg0) {
        if (arg0 != 70) {
            this.update(null);
        }
        field1943++;
        if (class9.field232) {
            return;
        }
        class9.field232 = true;
        try {
            class30.field761.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method116((byte) -89);
        } catch (Exception var4) {
        }
        if (class74.field1717 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class30.field737 != null) {
            try {
                class30.field737.method721(0);
            } catch (Exception var2) {
            }
        }
        this.method110((byte) 26);
    }

    @OriginalMember(owner = "client!o", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 360)
    public final String getParameter(String arg0) {
        field1958++;
        if (class74.field1717 == null) {
            return class30.field737 == null || class30.field737.field2435 == this ? super.getParameter(arg0) : class30.field737.field2435.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 382)
    private final void method572(boolean arg0) {
        field1949++;
        long var2 = class16.field422[class76.field1755];
        long var4 = class98.method683(0);
        class16.field422[class76.field1755] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class1.field22 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0) {
            return;
        }
        class76.field1755 = class76.field1755 + 1 & 0x1F;
        if (class56.field1455++ > 50) {
            class64.field1571 = true;
            class56.field1455 -= 50;
            class30.field761.setSize(class80.field1838, class92.field2105);
            class30.field761.setVisible(true);
            if (class74.field1717 == null) {
                class30.field761.setLocation(0, 0);
            } else {
                Insets var7 = class74.field1717.getInsets();
                class30.field761.setLocation(var7.left, var7.top);
            }
        }
        this.method112(46);
    }

    @OriginalMember(owner = "client!o", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 424)
    public final URL getDocumentBase() {
        field1946++;
        if (class74.field1717 == null) {
            return class30.field737 == null || class30.field737.field2435 == this ? super.getDocumentBase() : class30.field737.field2435.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 448)
    public final void focusLost(FocusEvent arg0) {
        class104.field2551 = false;
        field1973++;
    }

    @OriginalMember(owner = "client!o", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 456)
    public final AppletContext getAppletContext() {
        field1938++;
        if (class74.field1717 == null) {
            return class30.field737 == null || class30.field737.field2435 == this ? super.getAppletContext() : class30.field737.field2435.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIILhe;I)V", line = 474)
    public static final void method573(boolean arg0, int arg1, int arg2, class47 arg3, int arg4) {
        class130.field3128.method561((byte) -74);
        field1944++;
        class43.field1092.method497(0, 0);
        arg3.method364(class16.field427, 55, 28, 16777215, arg0);
        if (arg2 == 0) {
            arg3.method364(class114.field2743, 55, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg3.method364(class89.field2020, 55, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg3.method364(class80.field1836, 55, 41, 16711680, true);
        }
        if (arg2 == 3) {
            arg3.method364(class79.field1793, 55, 41, 65535, true);
        }
        arg3.method364(class98.field2326, 184, 28, 16777215, true);
        if (arg4 == 0) {
            arg3.method364(class114.field2743, 184, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg3.method364(class89.field2020, 184, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg3.method364(class80.field1836, 184, 41, 16711680, true);
        }
        arg3.method364(class41.field1019, 324, 28, 16777215, true);
        if (arg1 == 0) {
            arg3.method364(class114.field2743, 324, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg3.method364(class89.field2020, 324, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg3.method364(class80.field1836, 324, 41, 16711680, true);
        }
        arg3.method366(class128.field3061, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class30.field761.getGraphics();
            class130.field3128.method465(-111, 453, var5, 0);
        } catch (Exception var6) {
            class30.field761.repaint();
        }
    }

    @OriginalMember(owner = "client!o", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 534)
    public final URL getCodeBase() {
        field1971++;
        if (class74.field1717 == null) {
            return class30.field737 == null || class30.field737.field2435 == this ? super.getCodeBase() : class30.field737.field2435.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "destroy", descriptor = "()V", line = 551)
    public final void destroy() {
        field1978++;
        if (class29.field624 == this && !class9.field232) {
            class130.field3147 = class98.method683(0);
            class51.method400((byte) 28, 5000L);
            class98.field2315 = null;
            this.method571((byte) 70);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I", line = 567)
    public static final int method574(int arg0, int arg1, int arg2) {
        field1940++;
        int var3 = 97 / ((arg0 - 42) / 61);
        class133 var4 = (class133) class10.field259.method142((long) arg1, 23056);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field3244.length > arg2) {
            return var4.field3244[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!o", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 595)
    public final void windowActivated(WindowEvent arg0) {
        field1979++;
    }

    @OriginalMember(owner = "client!o", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 604)
    public final void windowDeactivated(WindowEvent arg0) {
        field1974++;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 615)
    public static void method575(int arg0) {
        field1977 = null;
        if (arg0 != 0) {
            return;
        }
        field1954 = null;
        field1969 = null;
        field1972 = null;
        field1976 = null;
        field1952 = null;
        field1939 = null;
        field1950 = null;
    }

    @OriginalMember(owner = "client!o", name = "start", descriptor = "()V", line = 633)
    public final void start() {
        field1963++;
        if (class29.field624 == this && !class9.field232) {
            class130.field3147 = 0L;
        }
    }

    @OriginalMember(owner = "client!o", name = "stop", descriptor = "()V", line = 646)
    public final void stop() {
        field1941++;
        if (class29.field624 == this && !class9.field232) {
            class130.field3147 = class98.method683(0) + 4000L;
        }
    }

    @OriginalMember(owner = "client!o", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 661)
    public final void windowIconified(WindowEvent arg0) {
        field1970++;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(B)V", line = 682)
    private final void method576(byte arg0) {
        if (arg0 != -28) {
            return;
        }
        field1975++;
        long var2 = class98.method683(0);
        long var4 = class106.field2573[class59.field1498];
        class106.field2573[class59.field1498] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class59.field1498 = class59.field1498 + 1 & 0x1F;
        synchronized (this) {
            class89.field2014 = class104.field2551;
        }
        this.method107(-4026);
    }

    @OriginalMember(owner = "client!o", name = "providesignlink", descriptor = "(Lra;)V", line = 713)
    public static final void providesignlink(class102 arg0) {
        class30.field737 = arg0;
        class98.field2315 = arg0;
        field1953++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/lang/String;)V", line = 721)
    public final void method577(int arg0, String arg1) {
        field1966++;
        if (this.field1947) {
            return;
        }
        this.field1947 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 != 28) {
            this.windowActivated(null);
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!o", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 746)
    public final void windowClosed(WindowEvent arg0) {
        field1936++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V", line = 757)
    public final void method578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1951++;
        try {
            if (class29.field624 == null) {
                class29.field624 = this;
                class92.field2105 = arg1;
                class113.field2732 = arg2;
                int var6 = 23 / ((arg0 + 66) / 49);
                class80.field1838 = arg3;
                if (class30.field737 == null) {
                    class98.field2315 = class30.field737 = new class102(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg4, null, 0);
                }
                class30.field737.method725((byte) 93, 1, this);
            } else {
                this.method577(28, "alreadyloaded");
            }
        } catch (Exception var8) {
            class50.method392(47, null, var8);
            this.method577(28, "crash");
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public abstract void method112(int arg0);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public abstract void method116(byte arg0);

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public abstract void method110(byte arg0);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
    public abstract void method111(byte arg0);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public abstract void method107(int arg0);

    @OriginalMember(owner = "client!o", name = "init", descriptor = "()V")
    public abstract void init();
}
