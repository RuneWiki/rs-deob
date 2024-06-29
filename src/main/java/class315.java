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
public abstract class class315 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Z")
    private boolean field5353 = false;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Z")
    public static boolean field5319 = false;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "[I")
    public static int[] field5327 = new int[5];

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "Lqd;")
    public static class40 field5350 = class147.method1106("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", (byte) -105);

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "[[I")
    public static int[][] field5347 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field5349 = -1;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lrb;")
    public static class213 field5324;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lkg;")
    public static class70 field5321;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "Z")
    public static boolean field5360;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "Z")
    public static boolean field5361;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "[I")
    public static int[] field5338;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "[I")
    public static int[] field5345;

    @OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 5)
    public final void windowDeactivated(WindowEvent arg0) {
        field5352++;
    }

    @OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V", line = 15)
    public final void stop() {
        field5329++;
        if (class92.field1664 == this && !class178.field2930) {
            class153.field2597 = class69.method535(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 29)
    public final URL getDocumentBase() {
        field5326++;
        if (class106.field1867 == null) {
            return class275.field4573 == null || class275.field4573.field1876 == this ? super.getDocumentBase() : class275.field4573.field1876.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 44)
    private final void method2175(int arg0) {
        field5355++;
        long var2 = class163.field2711[class275.field4575];
        long var4 = class69.method535(true);
        if (arg0 <= 107) {
            this.method2181(98, (String) null);
        }
        class163.field2711[class275.field4575] = var4;
        if (var2 != 0L && var2 >= var4) {
        }
        class275.field4575 = class275.field4575 + 1 & 0x1F;
        synchronized (this) {
            class227.field3755 = class62.field1173;
        }
        this.method1728(-2192);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V", line = 75)
    public final void method2176(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5358++;
        try {
            if (class92.field1664 != null) {
                class121.field2100++;
                if (class121.field2100 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method2181(127, "alreadyloaded");
                return;
            }
            class299.field5008 = arg4;
            class110.field1921 = arg1;
            class33.field663 = 0;
            class73.field1287 = arg3;
            class182.field2955 = arg3;
            class92.field1664 = this;
            class112.field1945 = arg0;
            class59.field1139 = arg0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class264.field4417 = true;
            } else {
                class264.field4417 = false;
            }
            if (class275.field4573 == null) {
                class25.field442 = class275.field4573 = new class107(this, arg2, (String) null, 0);
            }
            class70 var7 = class275.field4573.method800(arg1 ^ 0xFFFFFFBC, this, 1);
            while (var7.field1258 == 0) {
                class160.method1227(10L, false);
            }
            class8.field112 = (Thread) var7.field1260;
        } catch (Exception var9) {
            class44.method412(var9, -14997, (String) null);
            this.method2181(93, "crash");
        }
    }

    @OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V", line = 139)
    public final void destroy() {
        field5328++;
        if (class92.field1664 == this && !class178.field2930) {
            class153.field2597 = class69.method535(true);
            class160.method1227(5000L, false);
            class25.field442 = null;
            this.method2185(false, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 154)
    public static final void method2177(byte arg0) {
        if (arg0 < 86) {
            return;
        }
        field5330++;
        while (class95.field1715.method1456(class202.field3201, 128) >= 27) {
            int var1 = class95.field1715.method1466(-5582, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class91.field1656[var1] == null) {
                class91.field1656[var1] = new class42();
                var2 = true;
            }
            class42 var3 = class91.field1656[var1];
            class65.field1229[class177.field2923++] = var1;
            var3.field1509 = class256.field4266;
            if (var3.field796 != null && var3.field796.method917(96)) {
                class58.method483(false, var3);
            }
            int var4 = class95.field1715.method1466(-5582, 1);
            if (var4 == 1) {
                class301.field5048[class87.field1555++] = var1;
            }
            int var5 = class95.field1715.method1466(-5582, 1);
            int var6 = class95.field1715.method1466(-5582, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class95.field1715.method1466(-5582, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field796 = class246.method1740(class95.field1715.method1466(-5582, 14), (byte) -32);
            int var8 = class232.field3801[class95.field1715.method1466(-5582, 3)];
            if (var2) {
                var3.field1521 = var3.field1507 = var8;
            }
            var3.method658((byte) -32, var3.field796.field2089);
            var3.field1510 = var3.field796.field2069;
            var3.field1500 = var3.field796.field2107;
            var3.field1533 = var3.field796.field2078;
            var3.field1545 = var3.field796.field2103;
            var3.field1482 = var3.field796.field2090;
            var3.field1542 = var3.field796.field2101;
            var3.field1498 = var3.field796.field2077;
            var3.field1538 = var3.field796.field2067;
            if (var3.field1542 == 0) {
                var3.field1507 = 0;
            }
            var3.method660(var5 == 1, class255.field4233.field1489[0] + var6, var3.method666(24207), 128, class255.field4233.field1532[0] + var7);
            if (var3.field796.method917(122)) {
                class31.method281(class160.field2671, var3.field1532[0], var3, 128, var3.field1489[0], 0, (class258) null, (class27) null);
            }
        }
        class95.field1715.method1459(128);
    }

    @OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 239)
    public final void update(Graphics arg0) {
        field5351++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "start", descriptor = "()V", line = 249)
    public final void start() {
        field5357++;
        if (class92.field1664 == this && !class178.field2930) {
            class153.field2597 = 0L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V", line = 260)
    public final void run() {
        field5333++;
        try {
            if (class107.field1885 != null) {
                String var1 = class107.field1885.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class107.field1869;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2181(119, "wrongjava");
                        return;
                    }
                    class280.field4732 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class107.field1869 == null || class107.field1869.equals("1.4.2"))) {
                    this.method2181(113, "wrongjava");
                    return;
                }
            }
            if (class107.field1869 != null && class107.field1869.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class107.field1869.length() > var3) {
                    char var5 = class107.field1869.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class96.field1722 = true;
                }
            }
            if (class275.field4573.field1876 != null) {
                Method var6 = class107.field1887;
                if (var6 != null) {
                    try {
                        var6.invoke(class275.field4573.field1876, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method2183(true);
            class237.field3903 = class48.method428(class213.field3470, class112.field1945, -112, class73.field1287);
            this.method1727(-17636);
            class157.field2637 = class267.method1860(74);
            while (class153.field2597 == 0L || class69.method535(true) < class153.field2597) {
                class308.field5175 = class157.field2637.method275(class280.field4732, class92.field1674, 114);
                for (int var8 = 0; var8 < class308.field5175; var8++) {
                    this.method2175(114);
                }
                this.method2179((byte) 121);
                class147.method1109(class213.field3470, class275.field4573, 50);
            }
        } catch (Exception var11) {
            class44.method412(var11, -14997, (String) null);
            this.method2181(115, "crash");
        }
        this.method2185(true, (byte) -57);
    }

    @OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 368)
    public final void windowIconified(WindowEvent arg0) {
        field5323++;
    }

    @OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 376)
    public final void windowClosed(WindowEvent arg0) {
        field5356++;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V", line = 384)
    public static final void method2178(int arg0) {
        field5340++;
        if (arg0 == -11528) {
            class310.field5202.method1349(true);
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V", line = 400)
    private final void method2179(byte arg0) {
        field5343++;
        if (arg0 < 116) {
            return;
        }
        long var2 = class69.method535(true);
        long var4 = class225.field3719[class297.field4962];
        class225.field3719[class297.field4962] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class81.field1422 = ((var6 >> 1) + 32000) / var6;
        }
        class297.field4962 = class297.field4962 + 1 & 0x1F;
        if ((class125.field2166++) > 50) {
            class125.field2166 -= 50;
            class280.field4714 = true;
            class213.field3470.setSize(class112.field1945, class73.field1287);
            class213.field3470.setVisible(true);
            if (class106.field1867 != null && class271.field4503 == null) {
                Insets var7 = class106.field1867.getInsets();
                class213.field3470.setLocation(var7.left + class110.field1921, class33.field663 + var7.top);
            } else {
                class213.field3470.setLocation(class110.field1921, class33.field663);
            }
        }
        this.method1719(-128);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)Z", line = 446)
    public final boolean method2180(byte arg0) {
        field5348++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 96) {
                this.getParameter((String) null);
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
                this.method2181(arg0 ^ 0x19, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;)V", line = 482)
    public final void method2181(int arg0, String arg1) {
        field5332++;
        if (this.field5353) {
            return;
        }
        this.field5353 = true;
        if (arg0 < 90) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;IIIZI)V", line = 507)
    public final void method2182(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field5322++;
        try {
            class112.field1945 = arg0;
            class59.field1139 = arg0;
            class92.field1664 = this;
            if (arg5) {
                this.method1728(-31);
            }
            class110.field1921 = 0;
            class299.field5008 = arg2;
            class73.field1287 = arg4;
            class182.field2955 = arg4;
            class33.field663 = 0;
            class106.field1867 = new Frame();
            class106.field1867.setTitle("Jagex");
            class106.field1867.setResizable(true);
            class106.field1867.addWindowListener(this);
            class106.field1867.setVisible(true);
            class106.field1867.toFront();
            Insets var8 = class106.field1867.getInsets();
            class106.field1867.setSize(class59.field1139 + var8.right + var8.left, class182.field2955 + var8.bottom - -var8.top);
            class25.field442 = class275.field4573 = new class107((Applet) null, arg3, arg1, arg6);
            class70 var9 = class275.field4573.method800(-71, this, 1);
            while (var9.field1258 == 0) {
                class160.method1227(10L, false);
            }
            class8.field112 = (Thread) var9.field1260;
        } catch (Exception var11) {
            class44.method412(var11, -14997, (String) null);
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 554)
    public final void windowClosing(WindowEvent arg0) {
        field5316++;
        this.destroy();
    }

    @OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 563)
    public final String getParameter(String arg0) {
        field5334++;
        if (class106.field1867 == null) {
            return class275.field4573 == null || class275.field4573.field1876 == this ? super.getParameter(arg0) : class275.field4573.field1876.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 578)
    public final void focusLost(FocusEvent arg0) {
        field5318++;
        class62.field1173 = false;
    }

    @OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 588)
    public final void windowOpened(WindowEvent arg0) {
        field5346++;
    }

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 595)
    public final void focusGained(FocusEvent arg0) {
        field5320++;
        class62.field1173 = true;
        class280.field4714 = true;
    }

    @OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 608)
    public final synchronized void paint(Graphics arg0) {
        field5342++;
        if (class92.field1664 != this || class178.field2930) {
            return;
        }
        class280.field4714 = true;
        if (class96.field1722 && !class21.field350 && (class69.method535(true) - class46.field892) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class59.field1139 <= var2.width && class182.field2955 <= var2.height) {
                class156.field2617 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 628)
    public final URL getCodeBase() {
        field5354++;
        if (class106.field1867 == null) {
            return class275.field4573 == null || class275.field4573.field1876 == this ? super.getCodeBase() : class275.field4573.field1876.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Lke;)V", line = 645)
    public static final void providesignlink(class107 arg0) {
        class275.field4573 = arg0;
        class25.field442 = arg0;
        field5359++;
    }

    @OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 659)
    public final void windowDeiconified(WindowEvent arg0) {
        field5336++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 666)
    public final synchronized void method2183(boolean arg0) {
        if (class213.field3470 != null) {
            class213.field3470.removeFocusListener(this);
            class213.field3470.getParent().remove(class213.field3470);
        }
        field5335++;
        Container var2;
        if (class271.field4503 != null) {
            var2 = class271.field4503;
        } else if (class106.field1867 == null) {
            var2 = class275.field4573.field1876;
        } else {
            var2 = class106.field1867;
        }
        var2.setLayout((LayoutManager) null);
        class213.field3470 = new class123(this);
        var2.add(class213.field3470);
        class213.field3470.setSize(class112.field1945, class73.field1287);
        class213.field3470.setVisible(true);
        if (class106.field1867 == var2) {
            Insets var3 = class106.field1867.getInsets();
            class213.field3470.setLocation(var3.left + class110.field1921, class33.field663 + var3.top);
        } else {
            class213.field3470.setLocation(class110.field1921, class33.field663);
        }
        class213.field3470.addFocusListener(this);
        class213.field3470.requestFocus();
        class227.field3755 = arg0;
        class62.field1173 = true;
        class280.field4714 = true;
        class156.field2617 = false;
        class46.field892 = class69.method535(true);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V", line = 711)
    public static final void method2184(int arg0) {
        if (arg0 != 96) {
            method2187(6);
        }
        class72.field1276++;
        field5331++;
    }

    @OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 722)
    public final void windowActivated(WindowEvent arg0) {
        field5325++;
    }

    @OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 730)
    public final AppletContext getAppletContext() {
        field5317++;
        if (class106.field1867 == null) {
            return class275.field4573 == null || class275.field4573.field1876 == this ? super.getAppletContext() : class275.field4573.field1876.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZB)V", line = 746)
    private final void method2185(boolean arg0, byte arg1) {
        field5344++;
        synchronized (this) {
            if (class178.field2930) {
                return;
            }
            int var4 = -17 / ((arg1 + 8) / 46);
            class178.field2930 = true;
        }
        if (class275.field4573.field1876 != null) {
            class275.field4573.field1876.destroy();
        }
        try {
            this.method1721((byte) -34);
        } catch (Exception var13) {
        }
        if (class213.field3470 != null) {
            try {
                class213.field3470.removeFocusListener(this);
                class213.field3470.getParent().remove(class213.field3470);
            } catch (Exception var12) {
            }
        }
        if (class275.field4573 != null) {
            try {
                class275.field4573.method813(0);
            } catch (Exception var11) {
            }
        }
        this.method1718((byte) -87);
        if (class106.field1867 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)I", line = 806)
    public static final int method2186(int arg0, byte arg1) {
        field5339++;
        if (arg1 >= -27) {
            field5338 = (int[]) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V", line = 823)
    public static void method2187(int arg0) {
        field5324 = null;
        field5350 = null;
        if (arg0 >= -54) {
            field5341 = -90;
        }
        field5321 = null;
        field5327 = null;
        field5338 = null;
        field5347 = (int[][]) null;
        field5345 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public abstract void method1721(byte arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public abstract void method1719(int arg0);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public abstract void method1727(int arg0);

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    public abstract void method1718(byte arg0);

    @OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    public abstract void method1728(int arg0);
}
