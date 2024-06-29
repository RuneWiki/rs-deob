import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Component;
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

@OriginalClass("client!qj")
public abstract class class263 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "Z")
    private boolean field4020 = false;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "Z")
    private boolean field4034 = false;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "Lth;")
    public static class57 field4030 = new class57(128);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "Z")
    public static boolean field4035;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "Z")
    public static boolean field4036;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "Z")
    public static boolean field4037;

    @OriginalMember(owner = "client!qj", name = "run", descriptor = "()V", line = 7)
    public final void run() {
        field4009++;
        try {
            if (class61.field882 != null) {
                String var1 = class61.field882.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class61.field879;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1950("wrongjava", 10);
                        return;
                    }
                    class27.field374 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class61.field879 == null || class61.field879.equals("1.4.2"))) {
                    this.method1950("wrongjava", 10);
                    return;
                }
            }
            if (class61.field879 != null && class61.field879.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class61.field879.length() > var3) {
                    char var5 = class61.field879.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
                if (var4 >= 5) {
                    class102.field1459 = true;
                }
            }
            if (class54.field787.field878 != null) {
                Method var6 = class61.field897;
                if (var6 != null) {
                    try {
                        var6.invoke(class54.field787.field878, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class262.method1945((byte) -108);
            this.method1957((byte) -111);
            class356.field5460 = class2.method12((byte) 22, class286.field4312, class19.field301, class306.field4585);
            this.method344(50000);
            class329.field4952 = class128.method948(1);
            this.method1953((byte) 91);
            while (class353.field5433 == 0L || class353.field5433 > class176.method1234(5574)) {
                class32.field470 = class329.field4952.method43(-86, class27.field374, class335.field5215);
                for (int var8 = 0; var8 < class32.field470; var8++) {
                    this.method1960((byte) 123);
                }
                this.method1956((byte) 85);
                class252.method1848(class54.field787, 109, class306.field4585);
            }
        } catch (Exception var11) {
            class343.method2402((String) null, var11, -2);
            this.method1950("crash", 10);
        }
        this.method1954(4000, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 117)
    public static final void method1949(int arg0, Component arg1) {
        field4027++;
        arg1.addMouseListener(class255.field3805);
        if (arg0 != 1) {
            method1952((byte) -19);
        }
        arg1.addMouseMotionListener(class255.field3805);
        arg1.addFocusListener(class255.field3805);
    }

    @OriginalMember(owner = "client!qj", name = "start", descriptor = "()V", line = 137)
    public final void start() {
        field4016++;
        if (class27.field363 == this && !class135.field1972) {
            class353.field5433 = 0L;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 152)
    public final void method1950(String arg0, int arg1) {
        field4006++;
        if (this.field4020) {
            return;
        }
        this.field4020 = true;
        System.out.println("error_game_" + arg0);
        try {
            class114.method858("loggedout", (byte) -67, class54.field787.field878);
        } catch (Throwable var6) {
        }
        if (arg1 != 10) {
            this.field4034 = true;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 178)
    public final void focusLost(FocusEvent arg0) {
        field4028++;
        class12.field184 = false;
    }

    @OriginalMember(owner = "client!qj", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 189)
    public final void update(Graphics arg0) {
        field4013++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 201)
    public final String getParameter(String arg0) {
        field4001++;
        if (class131.field1905 == null) {
            return class54.field787 == null || class54.field787.field878 == this ? super.getParameter(arg0) : class54.field787.field878.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 215)
    public final synchronized void paint(Graphics arg0) {
        field4005++;
        if (class27.field363 != this || class135.field1972) {
            return;
        }
        class267.field4069 = true;
        if (class102.field1459 && !class141.field2031 && (class176.method1234(5574) - class121.field1711) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class212.field3069 && class98.field1389 <= var2.height) {
                class11.field178 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLsb;)Lwn;", line = 239)
    public static final class264 method1951(byte arg0, class190 arg1) {
        int var2 = 29 % ((-arg0 - 61) / 62);
        field4007++;
        return new class264(arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1312(80), arg1.method1312(59), arg1.method1319(255));
    }

    @OriginalMember(owner = "client!qj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 248)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4025++;
    }

    @OriginalMember(owner = "client!qj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 258)
    public final void windowActivated(WindowEvent arg0) {
        field4004++;
    }

    @OriginalMember(owner = "client!qj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 265)
    public final void windowOpened(WindowEvent arg0) {
        field4010++;
    }

    @OriginalMember(owner = "client!qj", name = "stop", descriptor = "()V", line = 273)
    public final void stop() {
        field4024++;
        if (class27.field363 == this && !class135.field1972) {
            class353.field5433 = class176.method1234(5574) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qj", name = "destroy", descriptor = "()V", line = 286)
    public final void destroy() {
        field4014++;
        if (class27.field363 == this && !class135.field1972) {
            class353.field5433 = class176.method1234(5574);
            class184.method1283(5000L, 10);
            class144.field2087 = null;
            this.method1954(4000, false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 302)
    public final void windowIconified(WindowEvent arg0) {
        field4000++;
    }

    @OriginalMember(owner = "client!qj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 310)
    public final AppletContext getAppletContext() {
        field4015++;
        if (class131.field1905 == null) {
            return class54.field787 == null || class54.field787.field878 == this ? super.getAppletContext() : class54.field787.field878.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 325)
    public final URL getDocumentBase() {
        field4029++;
        if (class131.field1905 == null) {
            return class54.field787 == null || class54.field787.field878 == this ? super.getDocumentBase() : class54.field787.field878.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 349)
    public static void method1952(byte arg0) {
        field4030 = null;
        if (arg0 >= -32) {
            field4032 = 34;
        }
    }

    @OriginalMember(owner = "client!qj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 359)
    public final void windowClosed(WindowEvent arg0) {
        field4022++;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V", line = 372)
    public final void method1953(byte arg0) {
        int var2 = -69 / ((arg0 - 37) / 45);
        field4018++;
        if (this.field4034) {
            return;
        }
        try {
            class210 var3 = class54.field787.method498(true, class27.field363.getClass());
            while (var3.field3056 == 0) {
                class184.method1283(100L, 10);
            }
            if (var3.field3058 != null) {
                throw (Throwable) var3.field3058;
            }
            jagmisc.init();
            this.field4034 = true;
            class329.field4952 = class128.method948(1);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "providesignlink", descriptor = "(Lnf;)V", line = 401)
    public static final void providesignlink(class61 arg0) {
        class54.field787 = arg0;
        class144.field2087 = arg0;
        field4021++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V", line = 413)
    private final void method1954(int arg0, boolean arg1) {
        field4017++;
        synchronized (this) {
            if (class135.field1972) {
                return;
            }
            class135.field1972 = true;
        }
        if (class54.field787.field878 != null) {
            class54.field787.field878.destroy();
        }
        try {
            this.method362(arg0 ^ 0xFFFFF029);
        } catch (Exception var14) {
        }
        if (this.field4034) {
            try {
                jagmisc.quit();
            } catch (Throwable var13) {
            }
            this.field4034 = false;
        }
        class54.field787.method494(class27.field363.getClass(), false);
        if (arg0 != 4000) {
            this.destroy();
        }
        if (class306.field4585 != null) {
            try {
                class306.field4585.removeFocusListener(this);
                class306.field4585.getParent().remove(class306.field4585);
            } catch (Exception var12) {
            }
        }
        if (class54.field787 != null) {
            try {
                class54.field787.method481((byte) 94);
            } catch (Exception var11) {
            }
        }
        this.method349(916);
        if (class131.field1905 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Z", line = 487)
    public final boolean method1955(int arg0) {
        field4003++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 <= 53) {
                this.windowIconified((WindowEvent) null);
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
                this.method1950("invalidhost", 10);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 522)
    public final void windowDeiconified(WindowEvent arg0) {
        field4026++;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V", line = 533)
    private final void method1956(byte arg0) {
        field4033++;
        long var2 = class176.method1234(5574);
        if (arg0 < 63) {
            field4032 = -84;
        }
        long var4 = class112.field1625[class321.field4831];
        class112.field1625[class321.field4831] = var2;
        class321.field4831 = class321.field4831 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class19.field306 = ((var6 >> 1) + 32000) / var6;
        }
        if (class236.field3543++ > 50) {
            class267.field4069 = true;
            class236.field3543 -= 50;
            class306.field4585.setSize(class286.field4312, class19.field301);
            class306.field4585.setVisible(true);
            if (class131.field1905 != null && class124.field1809 == null) {
                Insets var7 = class131.field1905.getInsets();
                class306.field4585.setLocation(class329.field4954 + var7.left, class354.field5445 + var7.top);
            } else {
                class306.field4585.setLocation(class329.field4954, class354.field5445);
            }
        }
        this.method367(-1);
    }

    @OriginalMember(owner = "client!qj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 581)
    public final void focusGained(FocusEvent arg0) {
        class12.field184 = true;
        class267.field4069 = true;
        field4011++;
    }

    @OriginalMember(owner = "client!qj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 591)
    public final void windowDeactivated(WindowEvent arg0) {
        field4031++;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V", line = 599)
    public final synchronized void method1957(byte arg0) {
        if (class306.field4585 != null) {
            class306.field4585.removeFocusListener(this);
            class306.field4585.getParent().remove(class306.field4585);
        }
        if (arg0 > -94) {
            this.focusLost((FocusEvent) null);
        }
        Container var2;
        if (class124.field1809 != null) {
            var2 = class124.field1809;
        } else if (class131.field1905 == null) {
            var2 = class54.field787.field878;
        } else {
            var2 = class131.field1905;
        }
        field3999++;
        var2.setLayout((LayoutManager) null);
        class306.field4585 = new class32(this);
        var2.add(class306.field4585);
        class306.field4585.setSize(class286.field4312, class19.field301);
        class306.field4585.setVisible(true);
        if (class131.field1905 == var2) {
            Insets var3 = class131.field1905.getInsets();
            class306.field4585.setLocation(var3.left + class329.field4954, class354.field5445 + var3.top);
        } else {
            class306.field4585.setLocation(class329.field4954, class354.field5445);
        }
        class306.field4585.addFocusListener(this);
        class306.field4585.requestFocus();
        class12.field184 = true;
        class213.field3078 = true;
        class267.field4069 = true;
        class11.field178 = false;
        class121.field1711 = class176.method1234(5574);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZLjava/lang/String;BIIII)V", line = 652)
    public final void method1958(int arg0, boolean arg1, String arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class27.field363 = this;
            class354.field5445 = 0;
            class286.field4312 = arg5;
            class212.field3069 = arg5;
            class19.field301 = arg4;
            class98.field1389 = arg4;
            class12.field187 = arg7;
            class329.field4954 = 0;
            class131.field1905 = new Frame();
            class131.field1905.setTitle("Jagex");
            class131.field1905.setResizable(true);
            class131.field1905.addWindowListener(this);
            class131.field1905.setVisible(true);
            class131.field1905.toFront();
            Insets var9 = class131.field1905.getInsets();
            class131.field1905.setSize(class212.field3069 + var9.left + var9.right, class98.field1389 - -var9.top + var9.bottom);
            if (arg3 <= 18) {
                field4032 = 17;
            }
            class144.field2087 = class54.field787 = new class61((Applet) null, arg6, arg2, arg0);
            class210 var10 = class54.field787.method490(2, 1, this);
            while (var10.field3056 == 0) {
                class184.method1283(10L, 10);
            }
            class274.field4154 = (Thread) var10.field3058;
        } catch (Exception var12) {
            class343.method2402((String) null, var12, -2);
        }
        field4019++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIBI)V", line = 693)
    public final void method1959(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4012++;
        try {
            if (class27.field363 != null) {
                class28.field389++;
                if (class28.field389 >= 3) {
                    this.method1950("alreadyloaded", 10);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class27.field363 = this;
            class19.field301 = arg4;
            class98.field1389 = arg4;
            class354.field5445 = 0;
            class329.field4954 = 0;
            class286.field4312 = arg0;
            class212.field3069 = arg0;
            class12.field187 = arg2;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class321.field4841 = true;
            } else {
                class321.field4841 = false;
            }
            if (class54.field787 == null) {
                class144.field2087 = class54.field787 = new class61(this, arg1, (String) null, 0);
            }
            class210 var7 = class54.field787.method490(2, 1, this);
            while (var7.field3056 == 0) {
                class184.method1283(10L, 10);
            }
            class274.field4154 = (Thread) var7.field3058;
        } catch (Exception var9) {
            class343.method2402((String) null, var9, -2);
            this.method1950("crash", 10);
        }
        if (arg3 != -110) {
            this.field4034 = false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 749)
    public final URL getCodeBase() {
        field4008++;
        if (class131.field1905 == null) {
            return class54.field787 == null || class54.field787.field878 == this ? super.getCodeBase() : class54.field787.field878.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)V", line = 769)
    private final void method1960(byte arg0) {
        if (arg0 <= 62) {
            this.field4034 = true;
        }
        long var2 = class176.method1234(5574);
        field4023++;
        long var4 = class303.field4526[class270.field4107];
        if (var4 != 0L && var4 < var2) {
        }
        class303.field4526[class270.field4107] = var2;
        class270.field4107 = class270.field4107 + 1 & 0x1F;
        synchronized (this) {
            class213.field3078 = class12.field184;
        }
        this.method368(93);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public abstract void method367(int arg0);

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public abstract void method362(int arg0);

    @OriginalMember(owner = "client!qj", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
    public abstract void method349(int arg0);

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
    public abstract void method344(int arg0);

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
    public abstract void method368(int arg0);
}
