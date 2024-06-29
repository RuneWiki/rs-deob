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

@OriginalClass("client!dg")
public abstract class class286 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "Z")
    private boolean field4321 = false;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Z")
    private boolean field4322 = false;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Los;")
    public static class309 field4313 = new class309("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "Z")
    public static boolean field4332;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "Z")
    public static boolean field4336;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "[I")
    public static int[] field4312;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 3)
    public final synchronized void method1788(int arg0) {
        field4327++;
        if (class262.field4007 != null) {
            class262.field4007.removeFocusListener(this);
            class262.field4007.getParent().remove(class262.field4007);
        }
        Container var2;
        if (class387.field5662 != null) {
            var2 = class387.field5662;
        } else if (class97.field1889 == null) {
            var2 = class497.field7305.field7072;
        } else {
            var2 = class97.field1889;
        }
        var2.setLayout(null);
        if (arg0 != 31) {
            providesignlink(null);
        }
        class262.field4007 = new class525(this);
        var2.add(class262.field4007);
        class262.field4007.setSize(class71.field1415, class65.field1330);
        class262.field4007.setVisible(true);
        if (class97.field1889 == var2) {
            Insets var3 = class97.field1889.getInsets();
            class262.field4007.setLocation(class376.field5503 + var3.left, class75.field1536 + var3.top);
        } else {
            class262.field4007.setLocation(class376.field5503, class75.field1536);
        }
        class262.field4007.addFocusListener(this);
        class262.field4007.requestFocus();
        class161.field2592 = true;
        class97.field1896 = true;
        class370.field5436 = true;
        class49.field997 = false;
        class99.field1919 = class423.method2578(arg0 - 19729);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIIIIZLjava/lang/String;)V", line = 55)
    public final void method1789(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, String arg7) {
        try {
            class71.field1415 = arg0;
            class322.field4917 = arg0;
            class189.field3039 = this;
            class154.field2509 = arg5;
            class75.field1536 = 0;
            class65.field1330 = arg2;
            class456.field6771 = arg2;
            class376.field5503 = 0;
            class97.field1889 = new Frame();
            class97.field1889.setTitle("Jagex");
            class97.field1889.setResizable(true);
            class97.field1889.addWindowListener(this);
            class97.field1889.setVisible(arg6);
            class97.field1889.toFront();
            Insets var9 = class97.field1889.getInsets();
            class97.field1889.setSize(class322.field4917 + var9.left + var9.right, class456.field6771 + var9.top + var9.bottom);
            class378.field5540 = class497.field7305 = new class480(null, arg4, arg7, arg3);
            class121 var10 = class497.field7305.method2860(-106, 1, this);
            while (var10.field2119 == 0) {
                class50.method470(10L, -5);
            }
        } catch (Exception var12) {
            class486.method2913(null, var12, (byte) -113);
        }
        field4326++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 95)
    public final void method1790(String arg0, boolean arg1) {
        field4320++;
        if (this.field4322) {
            return;
        }
        this.field4322 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1) {
                field4313 = null;
            }
            class227.method1509(class497.field7305.field7072, "loggedout", 29436);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)Z", line = 123)
    public final boolean method1791(boolean arg0) {
        if (!arg0) {
            this.method1790(null, false);
        }
        field4315++;
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
                this.method1790("invalidhost", false);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 161)
    private final void method1792(int arg0) {
        field4310++;
        long var2 = class423.method2578(-19698);
        long var4 = class492.field7215[class376.field5502];
        class492.field7215[class376.field5502] = var2;
        if (arg0 != -17003) {
            return;
        }
        class376.field5502 = class376.field5502 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class97.field1896 = class161.field2592;
        }
        this.method1366((byte) -116);
    }

    @OriginalMember(owner = "client!dg", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 194)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4302++;
    }

    @OriginalMember(owner = "client!dg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 202)
    public final void windowClosing(WindowEvent arg0) {
        field4300++;
        this.destroy();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBIII)V", line = 213)
    public final void method1793(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4323++;
        try {
            if (class189.field3039 == null) {
                class376.field5503 = 0;
                class75.field1536 = 0;
                if (arg1 != -102) {
                    this.field4321 = true;
                }
                class71.field1415 = arg2;
                class322.field4917 = arg2;
                class65.field1330 = arg4;
                class456.field6771 = arg4;
                class189.field3039 = this;
                class154.field2509 = arg3;
                if (class497.field7305 == null) {
                    class378.field5540 = class497.field7305 = new class480(this, arg0, null, 0);
                }
                class121 var6 = class497.field7305.method2860(-107, 1, this);
                while (var6.field2119 == 0) {
                    class50.method470(10L, -5);
                }
            } else {
                class372.field5459++;
                if (class372.field5459 >= 3) {
                    this.method1790("alreadyloaded", false);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class486.method2913(null, var8, (byte) -106);
            this.method1790("crash", false);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 261)
    private final void method1794(byte arg0) {
        field4330++;
        long var2 = class423.method2578(-19698);
        long var4 = class174.field2807[class285.field4287];
        class174.field2807[class285.field4287] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class506.field7385 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != -63) {
            this.field4321 = false;
        }
        class285.field4287 = class285.field4287 + 1 & 0x1F;
        if (class188.field3011++ > 50) {
            class370.field5436 = true;
            class188.field3011 -= 50;
            class262.field4007.setSize(class71.field1415, class65.field1330);
            class262.field4007.setVisible(true);
            if (class97.field1889 != null && class387.field5662 == null) {
                Insets var7 = class97.field1889.getInsets();
                class262.field4007.setLocation(var7.left + class376.field5503, var7.top - -class75.field1536);
            } else {
                class262.field4007.setLocation(class376.field5503, class75.field1536);
            }
        }
        this.method1379((byte) 1);
    }

    @OriginalMember(owner = "client!dg", name = "stop", descriptor = "()V", line = 305)
    public final void stop() {
        field4319++;
        if (class189.field3039 == this && !class304.field4555) {
            class505.field7369 = class423.method2578(-19698) + 4000L;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V", line = 317)
    private final void method1795(int arg0, boolean arg1) {
        field4299++;
        synchronized (this) {
            if (class304.field4555) {
                return;
            }
            class304.field4555 = true;
        }
        if (class497.field7305.field7072 != null) {
            class497.field7305.field7072.destroy();
        }
        try {
            this.method1363(true);
        } catch (Exception var11) {
        }
        if (this.field4321) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field4321 = false;
        }
        class157.method1136(true, -11498);
        class121 var4 = class497.field7305.method2888(true, class189.field3039.getClass());
        while (var4.field2119 == 0) {
            class50.method470(100L, -5);
        }
        if (class262.field4007 != null) {
            try {
                class262.field4007.removeFocusListener(this);
                class262.field4007.getParent().remove(class262.field4007);
            } catch (Exception var9) {
            }
        }
        if (class497.field7305 != null) {
            try {
                class497.field7305.method2865(arg0 ^ 0xFFFFFFD9);
            } catch (Exception var8) {
            }
        }
        this.method1364((byte) -21);
        if (class97.field1889 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (arg0 != 0) {
            field4313 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!dg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 402)
    public final void focusLost(FocusEvent arg0) {
        field4329++;
        class161.field2592 = false;
    }

    @OriginalMember(owner = "client!dg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 410)
    public final synchronized void paint(Graphics arg0) {
        field4314++;
        if (class189.field3039 != this || class304.field4555) {
            return;
        }
        class370.field5436 = true;
        if (class237.field3668 && (class423.method2578(-19698) - class99.field1919) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class322.field4917 <= var2.width && class456.field6771 <= var2.height) {
                class49.field997 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 431)
    public final String getParameter(String arg0) {
        field4311++;
        if (class97.field1889 == null) {
            return class497.field7305 == null || class497.field7305.field7072 == this ? super.getParameter(arg0) : class497.field7305.field7072.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "destroy", descriptor = "()V", line = 447)
    public final void destroy() {
        field4303++;
        if (class189.field3039 == this && !class304.field4555) {
            class505.field7369 = class423.method2578(-19698);
            class50.method470(5000L, -5);
            class378.field5540 = null;
            this.method1795(0, false);
        }
    }

    @OriginalMember(owner = "client!dg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 461)
    public final URL getDocumentBase() {
        field4301++;
        if (class97.field1889 == null) {
            return class497.field7305 == null || class497.field7305.field7072 == this ? super.getDocumentBase() : class497.field7305.field7072.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 480)
    public final void windowIconified(WindowEvent arg0) {
        field4306++;
    }

    @OriginalMember(owner = "client!dg", name = "start", descriptor = "()V", line = 487)
    public final void start() {
        field4324++;
        if (class189.field3039 == this && !class304.field4555) {
            class505.field7369 = 0L;
        }
    }

    @OriginalMember(owner = "client!dg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 502)
    public final void windowDeactivated(WindowEvent arg0) {
        field4308++;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)Ljava/lang/String;", line = 512)
    public String method1374(byte arg0) {
        int var2 = -37 / ((arg0 + 53) / 35);
        field4305++;
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 525)
    public final URL getCodeBase() {
        field4316++;
        if (class97.field1889 == null) {
            return class497.field7305 == null || class497.field7305.field7072 == this ? super.getCodeBase() : class497.field7305.field7072.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V", line = 542)
    public final void method1796(int arg0) {
        int var2 = 73 % ((arg0 + 66) / 53);
        field4318++;
        if (this.field4321) {
            return;
        }
        try {
            class121 var3 = class497.field7305.method2863(19986, class189.field3039.getClass());
            while (var3.field2119 == 0) {
                class50.method470(100L, -5);
            }
            if (var3.field2115 != null) {
                throw (Throwable) var3.field2115;
            }
            jagmisc.init();
            this.field4321 = true;
            class101.field1930 = class45.method451(0);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!dg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 573)
    public final AppletContext getAppletContext() {
        field4331++;
        if (class97.field1889 == null) {
            return class497.field7305 == null || class497.field7305.field7072 == this ? super.getAppletContext() : class497.field7305.field7072.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 590)
    public final void windowClosed(WindowEvent arg0) {
        field4328++;
    }

    @OriginalMember(owner = "client!dg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 598)
    public final void windowActivated(WindowEvent arg0) {
        field4317++;
    }

    @OriginalMember(owner = "client!dg", name = "run", descriptor = "()V", line = 608)
    public final void run() {
        field4304++;
        try {
            label110: {
                if (class480.field7074 != null) {
                    String var1 = class480.field7074.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class480.field7089;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1790("wrongjava", false);
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class480.field7089 == null || class480.field7089.equals("1.4.2"))) {
                        this.method1790("wrongjava", false);
                        break label110;
                    }
                }
                if (class480.field7089 != null && class480.field7089.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class480.field7089.length() > var3) {
                        char var5 = class480.field7089.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + (var5 - '0');
                        var3++;
                    }
                    if (var4 >= 5) {
                        class237.field3668 = true;
                    }
                }
                if (class497.field7305.field7072 != null) {
                    Method var6 = class480.field7093;
                    if (var6 != null) {
                        try {
                            var6.invoke(class497.field7305.field7072, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class320.method2055(0);
                class257.method1659((byte) 127);
                this.method1788(31);
                this.method1796(-119);
                this.method1368(-121);
                class101.field1930 = class45.method451(0);
                this.method1796(11);
                while (class505.field7369 == 0L || class423.method2578(-19698) < class505.field7369) {
                    class307.field4662 = class101.field1930.method1443(class381.field5579, 19116);
                    for (int var7 = 0; var7 < class307.field4662; var7++) {
                        this.method1792(-17003);
                    }
                    this.method1794((byte) -63);
                    class463.method2777(class497.field7305, class262.field4007, 1001);
                }
            }
        } catch (Throwable var10) {
            class486.method2913(this.method1374((byte) 106), var10, (byte) -119);
            this.method1790("crash", false);
        }
        this.method1795(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B[Lgh;I)V", line = 725)
    public static final void method1797(byte arg0, class388[] arg1, int arg2) {
        field4297++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class388 var5 = arg1[var3];
            if (var5 != null) {
                if (var5.field5784 == 0) {
                    if (var5.field5819 != null) {
                        method1797((byte) -68, var5.field5819, arg2);
                    }
                    class141 var6 = (class141) class470.field6975.method1622((long) var5.field5700, 29);
                    if (var6 != null) {
                        class187.method1277(var6.field2342, arg2, -3816);
                    }
                }
                if (arg2 == 0 && var5.field5703 != null) {
                    class322 var7 = new class322();
                    var7.field4911 = var5.field5703;
                    var7.field4918 = var5;
                    class495.method2982(var7);
                }
                if (arg2 == 1 && var5.field5772 != null) {
                    if (var5.field5777 >= 0) {
                        class388 var8 = class271.method1716(27411, var5.field5700);
                        if (var8 == null || var8.field5819 == null || var5.field5777 >= var8.field5819.length || var8.field5819[var5.field5777] != var5) {
                            continue;
                        }
                    }
                    class322 var9 = new class322();
                    var9.field4918 = var5;
                    var9.field4911 = var5.field5772;
                    class495.method2982(var9);
                }
            }
        }
        int var4 = -47 / ((20 - arg0) / 59);
    }

    @OriginalMember(owner = "client!dg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 793)
    public final void windowDeiconified(WindowEvent arg0) {
        field4325++;
    }

    @OriginalMember(owner = "client!dg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 805)
    public final void windowOpened(WindowEvent arg0) {
        field4309++;
    }

    @OriginalMember(owner = "client!dg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 814)
    public final void focusGained(FocusEvent arg0) {
        field4298++;
        class161.field2592 = true;
        class370.field5436 = true;
    }

    @OriginalMember(owner = "client!dg", name = "providesignlink", descriptor = "(Llt;)V", line = 823)
    public static final void providesignlink(class480 arg0) {
        class497.field7305 = arg0;
        class378.field5540 = arg0;
        field4307++;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V", line = 832)
    public static void method1798(int arg0) {
        field4313 = null;
        field4312 = null;
        if (arg0 >= -127) {
            method1797((byte) -4, null, 52);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
    public abstract void method1363(boolean arg0);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public abstract void method1366(byte arg0);

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
    public abstract void method1364(byte arg0);

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
    public abstract void method1379(byte arg0);

    @OriginalMember(owner = "client!dg", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public abstract void method1368(int arg0);
}
