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

@OriginalClass("client!he")
public abstract class class108 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
    private boolean field1957 = false;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Z")
    private boolean field1969 = false;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Lsf;")
    public static class124 field1986 = new class124(30);

    @OriginalMember(owner = "client!he", name = "N", descriptor = "[Leb;")
    public static class133[] field1992 = new class133[14];

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "Lto;")
    public static class268 field1995 = null;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Lek;")
    public static class206 field1993;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "Z")
    public static boolean field1996;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "Z")
    public static boolean field1997;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Z")
    public static boolean field1998;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "[I")
    public static int[] field1988;

    @OriginalMember(owner = "client!he", name = "providesignlink", descriptor = "(Lla;)V", line = 6)
    public static final void providesignlink(class157 arg0) {
        class59.field1164 = arg0;
        class20.field535 = arg0;
        field1983++;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 20)
    public static final void method795(int arg0) {
        if (arg0 <= 41) {
            field1993 = (class206) null;
        }
        field1984++;
        for (class90 var1 = (class90) class181.field3121.method431(0); var1 != null; var1 = (class90) class181.field3121.method439(-28512)) {
            class176 var2 = var1.field1605;
            if (class276.field4506 != var2.field2915 || var2.field2917) {
                var1.method535(-2801);
            } else if (var2.field2900 <= class267.field4371) {
                var2.method1248(class197.field3303, 23301);
                if (var2.field2917) {
                    var1.method535(-2801);
                } else {
                    class198.method1350(var2.field2915, var2.field2908, var2.field2901, var2.field2921, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZ)V", line = 58)
    private final void method797(boolean arg0, boolean arg1) {
        field1990++;
        synchronized (this) {
            if (class223.field3695) {
                return;
            }
            class223.field3695 = arg1;
        }
        if (class59.field1164.field2658 != null) {
            class59.field1164.field2658.destroy();
        }
        try {
            this.method794(-30542);
        } catch (Exception var14) {
        }
        if (this.field1969) {
            try {
                jagmisc.quit();
            } catch (Throwable var13) {
            }
            this.field1969 = false;
        }
        class59.field1164.method1114(0, class248.field4065.getClass());
        if (class209.field3489 != null) {
            try {
                class209.field3489.removeFocusListener(this);
                class209.field3489.getParent().remove(class209.field3489);
            } catch (Exception var12) {
            }
        }
        if (class59.field1164 != null) {
            try {
                class59.field1164.method1115(0);
            } catch (Exception var11) {
            }
        }
        this.method803((byte) 23);
        if (class274.field4469 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!he", name = "destroy", descriptor = "()V", line = 127)
    public final void destroy() {
        field1953++;
        if (class248.field4065 == this && !class223.field3695) {
            class223.field3688 = class218.method1520((byte) 96);
            class122.method881(-82, 5000L);
            class20.field535 = null;
            this.method797(false, true);
        }
    }

    @OriginalMember(owner = "client!he", name = "stop", descriptor = "()V", line = 142)
    public final void stop() {
        field1976++;
        if (class248.field4065 == this && !class223.field3695) {
            class223.field3688 = class218.method1520((byte) 97) + 4000L;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z", line = 156)
    public final boolean method798(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1965++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 <= 60) {
            this.getParameter((String) null);
        }
        if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method811(-112, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 190)
    public final void focusLost(FocusEvent arg0) {
        field1963++;
        class124.field2174 = false;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V", line = 202)
    private final void method800(byte arg0) {
        long var2 = class291.field4722[class311.field5069];
        field1970++;
        long var4 = class218.method1520((byte) 40);
        class291.field4722[class311.field5069] = var4;
        class311.field5069 = class311.field5069 + 1 & 0x1F;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class194.field3264 = ((var6 >> 1) + 32000) / var6;
        }
        int var7 = 6 % ((-arg0 - 44) / 37);
        if ((class358.field5700++) > 50) {
            class205.field3412 = true;
            class358.field5700 -= 50;
            class209.field3489.setSize(class133.field2287, class287.field4696);
            class209.field3489.setVisible(true);
            if (class274.field4469 != null && class202.field3384 == null) {
                Insets var8 = class274.field4469.getInsets();
                class209.field3489.setLocation(var8.left + class332.field5298, class355.field5659 + var8.top);
            } else {
                class209.field3489.setLocation(class332.field5298, class355.field5659);
            }
        }
        this.method796((byte) 47);
    }

    @OriginalMember(owner = "client!he", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 244)
    public final AppletContext getAppletContext() {
        field1966++;
        if (class274.field4469 == null) {
            return class59.field1164 == null || class59.field1164.field2658 == this ? super.getAppletContext() : class59.field1164.field2658.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 258)
    public final void windowActivated(WindowEvent arg0) {
        field1972++;
    }

    @OriginalMember(owner = "client!he", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 266)
    public final void focusGained(FocusEvent arg0) {
        class124.field2174 = true;
        class205.field3412 = true;
        field1985++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIIII)V", line = 276)
    public final void method801(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1981++;
        try {
            if (class248.field4065 != null) {
                class296.field4837++;
                if (class296.field4837 >= 3) {
                    this.method811(-64, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class287.field4696 = arg2;
            class332.field5302 = arg2;
            class133.field2287 = arg1;
            class276.field4505 = arg1;
            class348.field5575 = arg4;
            if (!arg0) {
                field1989 = -63;
            }
            class248.field4065 = this;
            class355.field5659 = 0;
            class332.field5298 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class358.field5687 = true;
            } else {
                class358.field5687 = false;
            }
            if (class59.field1164 == null) {
                class20.field535 = class59.field1164 = new class157(this, arg3, (String) null, 0);
            }
            class210 var7 = class59.field1164.method1132(1, 0, this);
            while (var7.field3504 == 0) {
                class122.method881(24, 10L);
            }
            class164.field2750 = (Thread) var7.field3501;
        } catch (Exception var9) {
            class348.method2493(-26700, var9, (String) null);
            this.method811(126, "crash");
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V", line = 335)
    private final void method802(int arg0) {
        long var2 = class218.method1520((byte) 110);
        int var4 = 85 / ((23 - arg0) / 47);
        field1974++;
        long var5 = class177.field2935[class257.field4200];
        class177.field2935[class257.field4200] = var2;
        if (var5 != 0L && var2 <= var5) {
        }
        class257.field4200 = class257.field4200 + 1 & 0x1F;
        synchronized (this) {
            class274.field4470 = class124.field2174;
        }
        this.method799(-25993);
    }

    @OriginalMember(owner = "client!he", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 366)
    public final void windowDeactivated(WindowEvent arg0) {
        field1962++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 374)
    public static final void method805(String arg0, int arg1) {
        field1959++;
        if (class300.field4883 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class191.method1322(arg1 - 5388);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class172.method1225("mem=" + var4 + "k", 0);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class191.method1322(-5388);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class172.method1225("Memory before cleanup=" + var7 + "k", 0);
                class123.method884(false);
                class191.method1322(arg1 ^ 0xFFFFEAF4);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class172.method1225("Memory after cleanup=" + var9 + "k", 0);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class172.method1225("Number of player models in cache:" + class78.method589(-74), 0);
            }
            if (class241.field4016 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class239.field3978);
                System.out.println("oncard_2d:" + class239.field3976);
                System.out.println("oncard_texture:" + class239.field3975);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class359.method2538(0);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class90.field1608.method2471((byte) 109);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class90.field1608.method2475(-76);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class59.field1164.method1112(3916);
                class127.field2224.method1644(-26255);
                class90.field1608.method2481((byte) -79);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class284.field4635 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class311.method2260(25, -19880);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class36.field786 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class36.field786 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class145.method986(0, -1, -1, false, false);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class145.method986(1, -1, -1, false, false);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class145.method986(2, -1, -1, false, false);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class145.method986(3, 768, 1024, false, false);
            }
            if (arg0.startsWith("::setba")) {
                class248.field4071 = class86.method656(arg0.substring(8), (byte) -105);
                class235.method1634(class59.field1164, (byte) -77);
                class224.field3696 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class214.method1488(class86.method656(arg0.substring(15), (byte) -70));
                class235.method1634(class59.field1164, (byte) 109);
                class224.field3696 = false;
            }
            if (arg0.startsWith("::fps ") && class39.field848 != 0) {
                class302.method2161(class86.method656(arg0.substring(6), (byte) -95), false);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class346.field5524 = class86.method656(arg0.substring(12).trim(), (byte) -51);
                class172.method1225("rect_debug=" + class346.field5524, 0);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class323.field5230 = true;
            }
            if (arg0.startsWith("::hdr") && class241.field4016 && !class194.method1342(-123, !class163.method1173())) {
                class172.method1225("Failed to enable hdr", 0);
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class139.field2362) {
                    class139.field2362 = false;
                    class172.method1225("Forced tweening disabled.", arg1 ^ 0x0);
                } else {
                    class139.field2362 = true;
                    class172.method1225("Forced tweening ENABLED!", arg1);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class274.field4473) {
                    System.out.println("Shift-click disabled.");
                    class274.field4473 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class274.field4473 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class172.method1225("x:" + (class96.field1750.field199 >> 7) + " z:" + (class96.field1750.field213 >> 7) + " groundh:" + class144.field2427[class276.field4506][class96.field1750.field199 >> 7][class96.field1750.field213 >> 7], 0);
            }
            if (arg0.equalsIgnoreCase("::getheight")) {
                class172.method1225("Height: " + class144.field2427[class276.field4506][class96.field1750.field199 >> 7][class96.field1750.field213 >> 7], 0);
            }
        }
        class51.field1038.method291((byte) -85, 130);
        class51.field1038.method1027(arg0.length() - 1, arg1 + -20374);
        if (arg1 != 0) {
            field1992 = (class133[]) null;
        }
        class51.field1038.method1012(arg0.substring(2), (byte) 74);
        class208.field3478++;
    }

    @OriginalMember(owner = "client!he", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 600)
    public final void windowClosed(WindowEvent arg0) {
        field1975++;
    }

    @OriginalMember(owner = "client!he", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 607)
    public final synchronized void paint(Graphics arg0) {
        field1960++;
        if (class248.field4065 != this || class223.field3695) {
            return;
        }
        class205.field3412 = true;
        if (class220.field3653 && !class241.field4016 && class218.method1520((byte) 113) - class39.field856 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class276.field4505 && class332.field5302 <= var2.height) {
                class284.field4635 = true;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "run", descriptor = "()V", line = 628)
    public final void run() {
        field1978++;
        try {
            if (class157.field2651 != null) {
                String var1 = class157.field2651.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class157.field2652;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method811(125, "wrongjava");
                        return;
                    }
                    class21.field546 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class157.field2652 == null || class157.field2652.equals("1.4.2"))) {
                    this.method811(110, "wrongjava");
                    return;
                }
            }
            if (class157.field2652 != null && class157.field2652.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class157.field2652.length() > var3) {
                    char var5 = class157.field2652.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class220.field3653 = true;
                }
            }
            if (class59.field1164.field2658 != null) {
                Method var6 = class157.field2667;
                if (var6 != null) {
                    try {
                        var6.invoke(class59.field1164.field2658, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class308.method2247((byte) -121);
            this.method808(-10374);
            class285.field4666 = class15.method161(class287.field4696, -98, class133.field2287, class209.field3489);
            this.method804(-10002);
            class244.field4056 = class20.method183(200000);
            this.method809(24991);
            while (class223.field3688 == 0L || class223.field3688 > class218.method1520((byte) 44)) {
                class355.field5660 = class244.field4056.method38(-128, class101.field1840, class21.field546);
                for (int var8 = 0; var8 < class355.field5660; var8++) {
                    this.method802(98);
                }
                this.method800((byte) 117);
                class363.method2547(0, class209.field3489, class59.field1164);
            }
        } catch (Exception var11) {
            class348.method2493(-26700, var11, (String) null);
            this.method811(120, "crash");
        }
        this.method797(true, true);
    }

    @OriginalMember(owner = "client!he", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 742)
    public final void windowOpened(WindowEvent arg0) {
        field1973++;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V", line = 755)
    public static void method806(int arg0) {
        field1992 = null;
        field1986 = null;
        field1995 = null;
        field1993 = null;
        if (arg0 >= 98) {
            field1988 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 769)
    public final String getParameter(String arg0) {
        field1968++;
        if (class274.field4469 == null) {
            return class59.field1164 == null || class59.field1164.field2658 == this ? super.getParameter(arg0) : class59.field1164.field2658.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZIIILjava/lang/String;I)V", line = 787)
    public final void method807(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        try {
            class332.field5298 = 0;
            class348.field5575 = arg3;
            class248.field4065 = this;
            class355.field5659 = 0;
            class287.field4696 = arg7;
            class332.field5302 = arg7;
            class133.field2287 = arg5;
            class276.field4505 = arg5;
            class274.field4469 = new Frame();
            class274.field4469.setTitle("Jagex");
            class274.field4469.setResizable(true);
            class274.field4469.addWindowListener(this);
            class274.field4469.setVisible(true);
            class274.field4469.toFront();
            Insets var9 = class274.field4469.getInsets();
            class274.field4469.setSize(class276.field4505 + var9.left + var9.right, class332.field5302 + var9.top + var9.bottom);
            class20.field535 = class59.field1164 = new class157((Applet) null, arg1, arg6, arg4);
            class210 var10 = class59.field1164.method1132(1, arg0, this);
            while (var10.field3504 == 0) {
                class122.method881(-64, 10L);
            }
            class164.field2750 = (Thread) var10.field3501;
        } catch (Exception var12) {
            class348.method2493(-26700, var12, (String) null);
        }
        field1979++;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V", line = 827)
    public final synchronized void method808(int arg0) {
        field1991++;
        if (class209.field3489 != null) {
            class209.field3489.removeFocusListener(this);
            class209.field3489.getParent().remove(class209.field3489);
        }
        Container var2;
        if (class202.field3384 != null) {
            var2 = class202.field3384;
        } else if (class274.field4469 == null) {
            var2 = class59.field1164.field2658;
        } else {
            var2 = class274.field4469;
        }
        var2.setLayout((LayoutManager) null);
        class209.field3489 = new class138(this);
        var2.add(class209.field3489);
        class209.field3489.setSize(class133.field2287, class287.field4696);
        class209.field3489.setVisible(true);
        if (class274.field4469 == var2) {
            Insets var3 = class274.field4469.getInsets();
            class209.field3489.setLocation(var3.left + class332.field5298, class355.field5659 + var3.top);
        } else {
            class209.field3489.setLocation(class332.field5298, class355.field5659);
        }
        class209.field3489.addFocusListener(this);
        class209.field3489.requestFocus();
        class124.field2174 = true;
        class274.field4470 = true;
        class205.field3412 = true;
        class284.field4635 = false;
        class39.field856 = class218.method1520((byte) 77);
        if (arg0 != -10374) {
            method810(75, -40, 1, 119, -119, 57, -120);
        }
    }

    @OriginalMember(owner = "client!he", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 876)
    public final void windowIconified(WindowEvent arg0) {
        field1982++;
    }

    @OriginalMember(owner = "client!he", name = "start", descriptor = "()V", line = 884)
    public final void start() {
        field1987++;
        if (class248.field4065 == this && !class223.field3695) {
            class223.field3688 = 0L;
        }
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V", line = 895)
    public final void method809(int arg0) {
        if (arg0 != 24991) {
            this.method802(-4);
        }
        field1954++;
        if (this.field1969) {
            return;
        }
        try {
            class210 var2 = class59.field1164.method1123(0, class248.field4065.getClass());
            while (var2.field3504 == 0) {
                class122.method881(106, 100L);
            }
            if (var2.field3501 != null) {
                throw (Throwable) var2.field3501;
            }
            jagmisc.init();
            this.field1969 = true;
            class244.field4056 = class20.method183(200000);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!he", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 926)
    public final void windowClosing(WindowEvent arg0) {
        field1977++;
        this.destroy();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)I", line = 934)
    public static final int method810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1964++;
        if ((arg3 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg6;
            arg6 = var7;
        }
        int var8 = 80 % ((arg2 + 29) / 33);
        int var9 = arg1 & 0x3;
        if (var9 == 0) {
            return arg0;
        } else if (var9 == 1) {
            return arg5;
        } else if (var9 == 2) {
            return 7 - arg0 - (arg4 - 1);
        } else {
            return 1 + 7 - arg6 - arg5;
        }
    }

    @OriginalMember(owner = "client!he", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 963)
    public final URL getDocumentBase() {
        field1967++;
        if (class274.field4469 == null) {
            return class59.field1164 == null || class59.field1164.field2658 == this ? super.getDocumentBase() : class59.field1164.field2658.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 979)
    public final void windowDeiconified(WindowEvent arg0) {
        field1971++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;)V", line = 993)
    public final void method811(int arg0, String arg1) {
        field1958++;
        if (this.field1957) {
            return;
        }
        this.field1957 = true;
        System.out.println("error_game_" + arg1);
        int var3 = 61 % ((30 - arg0) / 51);
        try {
            class186.method1305(class59.field1164.field2658, false, "loggedout");
        } catch (Throwable var7) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!he", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 1017)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1955++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V", line = 1036)
    public static final void method812(boolean arg0, int arg1) {
        field1961++;
        byte[][] var2;
        byte var3;
        if (class241.field4016 && arg0) {
            var2 = class21.field540;
            var3 = 1;
        } else {
            var2 = class341.field5405;
            var3 = 4;
        }
        int[] var4 = null;
        for (int var5 = arg1; var5 < var3; var5++) {
            class119.method865(-4097);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class71.field1308[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 0x6) >> 1;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x3FFA) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class127.field2221.length; var15++) {
                                if (class127.field2221[var15] == var14 && var2[var15] != null) {
                                    int[] var16 = class363.method2546(var12, arg0, var11, -100, var13, var7 * 8, var6 * 8, class23.field576, var2[var15], var10, var5);
                                    var8 = true;
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class359.method2537(var6 * 8, var7 * 8, var5, 8, 8, 3220);
                    }
                }
            }
        }
        if (var4 == null) {
            class86.field1494 = -1;
            return;
        }
        class86.field1494 = var4[0];
        class109.field2000 = var4[2];
        class162.field2724 = var4[3];
        class316.field5150 = var4[4];
        class25.field650 = var4[1];
    }

    @OriginalMember(owner = "client!he", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 1143)
    public final URL getCodeBase() {
        field1980++;
        if (class274.field4469 == null) {
            return class59.field1164 == null || class59.field1164.field2658 == this ? super.getCodeBase() : class59.field1164.field2658.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLek;II)[Lob;", line = 1160)
    public static final class323[] method813(byte arg0, class206 arg1, int arg2, int arg3) {
        if (arg0 != 117) {
            field1994 = 120;
        }
        field1956++;
        return class76.method581(arg1, 60, arg2, arg3) ? class130.method923(-38) : null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public abstract void method794(int arg0);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public abstract void method796(byte arg0);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public abstract void method799(int arg0);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
    public abstract void method803(byte arg0);

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public abstract void method804(int arg0);

    @OriginalMember(owner = "client!he", name = "init", descriptor = "()V")
    public abstract void init();
}
