import jagex3.jagmisc.jagmisc;
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

@OriginalClass("client!od")
public abstract class class471 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Z")
    private boolean field6886 = false;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Z")
    private boolean field6898 = false;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field6900 = 4;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field6897 = 0;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "Z")
    public static boolean field6924;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Z")
    public static boolean field6925;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "Z")
    public static boolean field6926;

    @OriginalMember(owner = "client!od", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 5)
    public final void windowDeactivated(WindowEvent arg0) {
        field6899++;
    }

    @OriginalMember(owner = "client!od", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 12)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field6910++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V", line = 21)
    private final void method2787(boolean arg0, int arg1) {
        field6911++;
        synchronized (this) {
            if (class280.field4226) {
                return;
            }
            class280.field4226 = true;
        }
        if (class25.field375.field1611 != null) {
            class25.field375.field1611.destroy();
        }
        try {
            this.method2786(-37);
        } catch (Exception var11) {
        }
        if (this.field6886) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field6886 = false;
        }
        if (arg1 <= 112) {
            field6897 = 107;
        }
        class533 var4 = class25.field375.method842((byte) -108, class24.field359.getClass());
        while (var4.field7848 == 0) {
            class389.method2332(-116, 100L);
        }
        if (class357.field5469 != null) {
            try {
                class357.field5469.removeFocusListener(this);
                class357.field5469.getParent().remove(class357.field5469);
            } catch (Exception var9) {
            }
        }
        if (class25.field375 != null) {
            try {
                class25.field375.method836(122);
            } catch (Exception var8) {
            }
        }
        this.method2798(17477);
        if (class176.field2596 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Z", line = 103)
    public final boolean method2788(byte arg0) {
        field6918++;
        if (arg0 != 37) {
            field6897 = -85;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
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
                this.method2799(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 141)
    public final String getParameter(String arg0) {
        field6906++;
        if (class176.field2596 == null) {
            return class25.field375 == null || class25.field375.field1611 == this ? super.getParameter(arg0) : class25.field375.field1611.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 155)
    public final AppletContext getAppletContext() {
        field6919++;
        if (class176.field2596 == null) {
            return class25.field375 == null || class25.field375.field1611 == this ? super.getAppletContext() : class25.field375.field1611.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 173)
    public final void windowDeiconified(WindowEvent arg0) {
        field6893++;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 181)
    private final void method2791(int arg0) {
        field6915++;
        if (arg0 != 2047) {
            this.method2797(true);
        }
        long var2 = class381.method2281((byte) -124);
        long var4 = class59.field816[class408.field6152];
        class59.field816[class408.field6152] = var2;
        class408.field6152 = class408.field6152 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class41.field537 = ((var6 >> 1) + 32000) / var6;
        }
        if (class487.field7254++ > 50) {
            class426.field6352 = true;
            class487.field7254 -= 50;
            class357.field5469.setSize(class155.field2347, class413.field6241);
            class357.field5469.setVisible(true);
            if (class176.field2596 != null && class237.field3314 == null) {
                Insets var7 = class176.field2596.getInsets();
                class357.field5469.setLocation(class252.field3438 + var7.left, class33.field457 + var7.top);
            } else {
                class357.field5469.setLocation(class252.field3438, class33.field457);
            }
        }
        this.method2790(0);
    }

    @OriginalMember(owner = "client!od", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 227)
    public final void windowActivated(WindowEvent arg0) {
        field6892++;
    }

    @OriginalMember(owner = "client!od", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 235)
    public final URL getCodeBase() {
        field6891++;
        if (class176.field2596 == null) {
            return class25.field375 == null || class25.field375.field1611 == this ? super.getCodeBase() : class25.field375.field1611.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 251)
    public final void windowIconified(WindowEvent arg0) {
        field6901++;
    }

    @OriginalMember(owner = "client!od", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 261)
    public final synchronized void paint(Graphics arg0) {
        field6894++;
        if (class24.field359 != this || class280.field4226) {
            return;
        }
        class426.field6352 = true;
        if (class180.field2663 && (class381.method2281((byte) -107) - class107.field1598) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class455.field6669 && class69.field921 <= var2.height) {
                class242.field3362 = true;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 283)
    public final void update(Graphics arg0) {
        field6888++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!od", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 294)
    public final void focusGained(FocusEvent arg0) {
        field6896++;
        class88.field1378 = true;
        class426.field6352 = true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI)V", line = 304)
    public static final void method2793(int arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            class407.field6147 = class11.method76(arg2, class274.field4096, 8, class357.field5469, class25.field375, class454.field6661.field993 * 2);
        } else {
            if (arg1) {
                class407.field6147 = class11.method76(0, class274.field4096, 8, class357.field5469, class25.field375, 0);
                class407.field6147.method85(0);
                class443 var3 = class19.method210(class529.field7795, 0, class89.field1391, (byte) 89);
                class307 var4 = class407.field6147.method61(var3, class319.method1995(class142.field2146, class89.field1391, 0), true);
                class351.method2123((byte) -87, var4, class221.field3157.method2103(class30.field430, (byte) 34), true);
                class407.field6147.method161();
                class111.method864(-11481);
                class407.field6147.method111(1);
            }
            try {
                class407.field6147 = class11.method76(arg2, class274.field4096, 8, class357.field5469, class25.field375, class454.field6661.field993 * 2);
                if (class407.field6147.method97()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class346 var6;
                    if (var5) {
                        var6 = class407.field6147.method151(146800640);
                    } else {
                        var6 = class407.field6147.method151(104857600);
                    }
                    class407.field6147.method137(var6);
                }
            } catch (Throwable var8) {
                arg2 = 0;
                class407.field6147 = class11.method76(0, class274.field4096, 8, class357.field5469, class25.field375, 0);
            }
        }
        field6921++;
        class113.field1723 = arg2;
        class264.method1652((byte) 70);
        if (!class407.field6147.method65()) {
            class336.field5185 = 1;
        }
        class407.field6147.method144(class336.field5185);
        class407.field6147.method145(0);
        class407.field6147.method143(8);
        class151.field2293 = class407.field6147.method75();
        class398.field5943 = class407.field6147.method75();
        if (arg0 != -7150) {
            return;
        }
        class270.method1681(0);
        class407.field6147.method57(!class454.field6661.field981);
        if (class407.field6147.method125()) {
            class439.method2574(class454.field6661.field997, 114);
        }
        class385.method2307(arg0 ^ 0xFFFFE41E, class407.field6147, class448.field6611 >> 3, class50.field640 >> 3);
        class398.method2388((byte) 111);
        class273.field4068 = false;
    }

    @OriginalMember(owner = "client!od", name = "stop", descriptor = "()V", line = 384)
    public final void stop() {
        field6890++;
        if (class24.field359 == this && !class280.field4226) {
            class291.field4367 = class381.method2281((byte) 122) + 4000L;
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 395)
    private final void method2794(int arg0) {
        field6920++;
        if (arg0 != 3674) {
            this.field6886 = false;
        }
        long var2 = class381.method2281((byte) 13);
        long var4 = class53.field676[class65.field888];
        class53.field676[class65.field888] = var2;
        class65.field888 = class65.field888 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class394.field5908 = class88.field1378;
        }
        this.method2789(114);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B[BLjava/lang/String;I)I", line = 427)
    public static final int method2795(byte arg0, byte[] arg1, String arg2, int arg3) {
        if (arg0 != 104) {
            method2795((byte) -116, null, null, 62);
        }
        field6905++;
        int var4 = arg2.length();
        int var5 = arg3;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 <= '\u007F') {
                arg1[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg1[var5++] = (byte) class390.method2340(192, var7 >> 6);
                arg1[var5++] = (byte) class390.method2340(128, class140.method1023(63, var7));
            } else {
                arg1[var5++] = (byte) (class390.method2340(var7, 920814) >> 12);
                arg1[var5++] = (byte) class390.method2340(class140.method1023(var7 >> 6, 63), 128);
                arg1[var5++] = (byte) class390.method2340(class140.method1023(63, var7), 128);
            }
        }
        return var5 - arg3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 471)
    public final void method2796(boolean arg0) {
        if (!arg0) {
            this.field6898 = false;
        }
        field6914++;
        if (this.field6886) {
            return;
        }
        try {
            class533 var2 = class25.field375.method826(0, class24.field359.getClass());
            while (var2.field7848 == 0) {
                class389.method2332(83, 100L);
            }
            if (var2.field7849 != null) {
                throw (Throwable) var2.field7849;
            }
            jagmisc.init();
            this.field6886 = true;
            class222.field3158 = class398.method2398(106);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V", line = 505)
    public final synchronized void method2797(boolean arg0) {
        if (class357.field5469 != null) {
            class357.field5469.removeFocusListener(this);
            class357.field5469.getParent().remove(class357.field5469);
        }
        field6902++;
        Container var2;
        if (class237.field3314 != null) {
            var2 = class237.field3314;
        } else if (class176.field2596 == null) {
            var2 = class25.field375.field1611;
        } else {
            var2 = class176.field2596;
        }
        var2.setLayout(null);
        class357.field5469 = new class47(this);
        var2.add(class357.field5469);
        class357.field5469.setSize(class155.field2347, class413.field6241);
        class357.field5469.setVisible(true);
        if (class176.field2596 == var2) {
            Insets var3 = class176.field2596.getInsets();
            class357.field5469.setLocation(class252.field3438 + var3.left, class33.field457 + var3.top);
        } else {
            class357.field5469.setLocation(class252.field3438, class33.field457);
        }
        class357.field5469.addFocusListener(this);
        class357.field5469.requestFocus();
        class394.field5908 = true;
        class88.field1378 = true;
        class426.field6352 = true;
        class242.field3362 = arg0;
        class107.field1598 = class381.method2281((byte) 34);
    }

    @OriginalMember(owner = "client!od", name = "destroy", descriptor = "()V", line = 550)
    public final void destroy() {
        field6887++;
        if (class24.field359 == this && !class280.field4226) {
            class291.field4367 = class381.method2281((byte) -118);
            class389.method2332(101, 5000L);
            class384.field5797 = null;
            this.method2787(false, 120);
        }
    }

    @OriginalMember(owner = "client!od", name = "run", descriptor = "()V", line = 567)
    public final void run() {
        field6912++;
        try {
            label110: {
                if (class109.field1628 != null) {
                    String var1 = class109.field1628.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class109.field1609;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2799(true, "wrongjava");
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class109.field1609 == null || class109.field1609.equals("1.4.2"))) {
                        this.method2799(true, "wrongjava");
                        break label110;
                    }
                }
                if (class109.field1609 != null && class109.field1609.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class109.field1609.length()) {
                        char var5 = class109.field1609.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 - (48 - var5);
                    }
                    if (var4 >= 5) {
                        class180.field2663 = true;
                    }
                }
                if (class25.field375.field1611 != null) {
                    Method var6 = class109.field1632;
                    if (var6 != null) {
                        try {
                            var6.invoke(class25.field375.field1611, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class413.method2474((byte) 56);
                class312.method1968(255);
                this.method2797(false);
                this.method2796(true);
                this.method2792(7);
                class222.field3158 = class398.method2398(92);
                this.method2796(true);
                while (class291.field4367 == 0L || class381.method2281((byte) 77) < class291.field4367) {
                    class345.field5322 = class222.field3158.method1(5309, class350.field5385);
                    for (int var7 = 0; var7 < class345.field5322; var7++) {
                        this.method2794(3674);
                    }
                    this.method2791(2047);
                    class502.method2976(class357.field5469, 1, class25.field375);
                }
            }
        } catch (Throwable var10) {
            class488.method2913(0, var10, this.method2801(false));
            this.method2799(true, "crash");
        }
        this.method2787(true, 113);
    }

    @OriginalMember(owner = "client!od", name = "providesignlink", descriptor = "(Lec;)V", line = 687)
    public static final void providesignlink(class109 arg0) {
        field6904++;
        class25.field375 = arg0;
        class384.field5797 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 695)
    public final void focusLost(FocusEvent arg0) {
        field6913++;
        class88.field1378 = false;
    }

    @OriginalMember(owner = "client!od", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 703)
    public final void windowClosed(WindowEvent arg0) {
        field6903++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 714)
    public final void method2799(boolean arg0, String arg1) {
        field6889++;
        if (this.field6898) {
            return;
        }
        this.field6898 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            class331.method2049(class25.field375.field1611, "loggedout", -3460);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V", line = 737)
    public final void method2800(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6907++;
        try {
            if (class24.field359 != null) {
                class486.field7241++;
                if (class486.field7241 >= 3) {
                    this.method2799(true, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class202.field2944 = arg0;
            class413.field6241 = arg2;
            class69.field921 = arg2;
            class252.field3438 = 0;
            class24.field359 = this;
            class155.field2347 = arg3;
            class455.field6669 = arg3;
            class33.field457 = 0;
            if (class25.field375 == null) {
                class384.field5797 = class25.field375 = new class109(this, arg4, null, 0);
            }
            class533 var6 = class25.field375.method828(this, 46, 1);
            while (var6.field7848 == 0) {
                class389.method2332(arg1 ^ 0x4E8D, 10L);
            }
        } catch (Throwable var8) {
            class488.method2913(0, var8, null);
            this.method2799(true, "crash");
        }
        if (arg1 != 20197) {
            this.field6898 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 790)
    public String method2801(boolean arg0) {
        field6916++;
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I", line = 809)
    public static final int method2802(int arg0, int arg1) {
        return class521.field7668 == null ? 0 : class521.field7668[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!od", name = "start", descriptor = "()V", line = 812)
    public final void start() {
        field6908++;
        if (class24.field359 == this && !class280.field4226) {
            class291.field4367 = 0L;
        }
    }

    @OriginalMember(owner = "client!od", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 826)
    public final void windowOpened(WindowEvent arg0) {
        field6909++;
    }

    @OriginalMember(owner = "client!od", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 837)
    public final URL getDocumentBase() {
        field6895++;
        if (class176.field2596 == null) {
            return class25.field375 == null || class25.field375.field1611 == this ? super.getDocumentBase() : class25.field375.field1611.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZLjava/lang/String;IIII)V", line = 854)
    public final void method2803(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class413.field6241 = arg6;
            class69.field921 = arg6;
            class202.field2944 = arg7;
            class155.field2347 = arg1;
            class455.field6669 = arg1;
            class24.field359 = this;
            class33.field457 = 0;
            class252.field3438 = 0;
            class176.field2596 = new Frame();
            class176.field2596.setTitle("Jagex");
            class176.field2596.setResizable(true);
            class176.field2596.addWindowListener(this);
            class176.field2596.setVisible(true);
            class176.field2596.toFront();
            Insets var9 = class176.field2596.getInsets();
            class176.field2596.setSize(class455.field6669 + var9.right + var9.left, class69.field921 + var9.bottom + var9.top);
            class384.field5797 = class25.field375 = new class109(null, arg4, arg3, arg0);
            if (arg5 != 10) {
                return;
            }
            class533 var10 = class25.field375.method828(this, arg5 ^ 0x70, 1);
            while (var10.field7848 == 0) {
                class389.method2332(arg5 ^ 0xFFFFFF9D, 10L);
            }
        } catch (Exception var12) {
            class488.method2913(0, var12, null);
        }
        field6917++;
    }

    @OriginalMember(owner = "client!od", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public abstract void method2786(int arg0);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public abstract void method2789(int arg0);

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public abstract void method2790(int arg0);

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    public abstract void method2792(int arg0);

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
    public abstract void method2798(int arg0);
}
