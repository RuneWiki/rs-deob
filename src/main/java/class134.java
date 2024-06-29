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

@OriginalClass("client!dd")
public abstract class class134 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "Z")
    private boolean field2101 = false;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field2085 = 50;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2092 = "red:";

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "[I")
    public static int[] field2097 = new int[64];

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lta;")
    public static class262 field2087 = new class262(50);

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2103 = "cyan:";

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "F")
    public static float field2075;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "Z")
    public static boolean field2104;

    @OriginalMember(owner = "client!dd", name = "run", descriptor = "()V")
    public final void run() {
        field2088++;
        try {
            if (class59.field923 != null) {
                String var1 = class59.field923.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class59.field938;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method947(23681, "wrongjava");
                        return;
                    }
                    class8.field180 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class59.field938 == null || class59.field938.equals("1.4.2"))) {
                    this.method947(23681, "wrongjava");
                    return;
                }
            }
            if (class59.field938 != null && class59.field938.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class59.field938.length() > var3) {
                    char var5 = class59.field938.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
                if (var4 >= 5) {
                    class176.field2608 = true;
                }
            }
            if (class22.field329.field934 != null) {
                Method var6 = class59.field943;
                if (var6 != null) {
                    try {
                        var6.invoke(class22.field329.field934, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class111.method823(-10224);
            this.method948((byte) -41);
            class223.field3508 = class117.method848(-115, class189.field3021, class277.field4369, class35.field573);
            this.method945(true);
            class188.field3006 = class158.method1073((byte) 48);
            while (class228.field3575 == 0L || class269.method1823(-19) < class228.field3575) {
                class113.field1778 = class188.field3006.method807(class221.field3455, class8.field180, 24874);
                for (int var7 = 0; var7 < class113.field1778; var7++) {
                    this.method935((byte) -127);
                }
                this.method937(113);
                class6.method73(class189.field3021, class22.field329, false);
            }
        } catch (Exception var10) {
            class223.method1490(var10, (String) null, (byte) -61);
            this.method947(23681, "crash");
        }
        this.method936(true, false);
    }

    @OriginalMember(owner = "client!dd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2081++;
        if (class239.field3716 == null) {
            return class22.field329 == null || class22.field329.field934 == this ? super.getParameter(arg0) : class22.field329.field934.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method933(int arg0) {
        field2087 = null;
        field2097 = null;
        field2103 = null;
        if (arg0 <= -47) {
            field2092 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2080++;
        this.destroy();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 > -38) {
            field2092 = null;
        }
        class151.method1021(arg6, (byte) -48);
        field2071++;
        int var7 = 0;
        int var8 = arg6 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg6;
        int var10 = arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int[] var14 = class156.field2379[arg3];
        int var15 = arg2 - var8;
        int var16 = -1;
        class263.method1788(arg2 - arg6, -18732, arg1, var14, var15);
        int var17 = arg2 + var8;
        class263.method1788(var15, -18732, arg4, var14, var17);
        class263.method1788(var17, -18732, arg1, var14, arg2 + arg6);
        while (var10 > var7) {
            var13 += 2;
            var9 += var13;
            var16 += 2;
            var12 += var16;
            if (var12 >= 0 && var11 >= 1) {
                class189.field3018[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                if (var10 < var8) {
                    int[] var18 = class156.field2379[arg3 + var10];
                    int[] var19 = class156.field2379[arg3 - var10];
                    int var20 = arg2 + var7;
                    int var21 = class189.field3018[var10];
                    int var22 = arg2 + var21;
                    int var23 = arg2 - var7;
                    int var24 = arg2 - var21;
                    class263.method1788(var23, -18732, arg1, var18, var24);
                    class263.method1788(var24, -18732, arg4, var18, var22);
                    class263.method1788(var22, -18732, arg1, var18, var20);
                    class263.method1788(var23, -18732, arg1, var19, var24);
                    class263.method1788(var24, -18732, arg4, var19, var22);
                    class263.method1788(var22, -18732, arg1, var19, var20);
                } else {
                    int[] var25 = class156.field2379[arg3 + var10];
                    int[] var26 = class156.field2379[arg3 - var10];
                    int var27 = arg2 - var7;
                    int var28 = arg2 + var7;
                    class263.method1788(var27, -18732, arg1, var25, var28);
                    class263.method1788(var27, -18732, arg1, var26, var28);
                }
                var9 -= var10 << 1;
            }
            int[] var29 = class156.field2379[arg3 + var7];
            int[] var30 = class156.field2379[arg3 - var7];
            int var31 = arg2 + var10;
            int var32 = arg2 - var10;
            if (var7 >= var8) {
                class263.method1788(var32, -18732, arg1, var29, var31);
                class263.method1788(var32, -18732, arg1, var30, var31);
            } else {
                int var33 = var11 < var7 ? class189.field3018[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class263.method1788(var32, -18732, arg1, var29, var35);
                class263.method1788(var35, -18732, arg4, var29, var34);
                class263.method1788(var34, -18732, arg1, var29, var31);
                class263.method1788(var32, -18732, arg1, var30, var35);
                class263.method1788(var35, -18732, arg4, var30, var34);
                class263.method1788(var34, -18732, arg1, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    private final void method935(byte arg0) {
        field2086++;
        long var2 = class269.method1823(-97);
        if (arg0 >= -59) {
            return;
        }
        long var4 = class197.field3095[class31.field506];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class197.field3095[class31.field506] = var2;
        class31.field506 = class31.field506 + 1 & 0x1F;
        synchronized (this) {
            client.field2407 = class88.field1437;
        }
        this.method940((byte) 30);
    }

    @OriginalMember(owner = "client!dd", name = "start", descriptor = "()V")
    public final void start() {
        field2084++;
        if (class179.field2677 == this && !class223.field3515) {
            class228.field3575 = 0L;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZZ)V")
    private final void method936(boolean arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field2082++;
        synchronized (this) {
            if (class223.field3515) {
                return;
            }
            class223.field3515 = true;
        }
        if (class22.field329.field934 != null) {
            class22.field329.field934.destroy();
        }
        try {
            this.method941(106);
        } catch (Exception var9) {
        }
        if (class189.field3021 != null) {
            try {
                class189.field3021.removeFocusListener(this);
                class189.field3021.getParent().remove(class189.field3021);
            } catch (Exception var8) {
            }
        }
        if (class22.field329 != null) {
            try {
                class22.field329.method475(false);
            } catch (Exception var7) {
            }
        }
        this.method944((byte) -124);
        if (class239.field3716 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!dd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2073++;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    private final void method937(int arg0) {
        field2076++;
        long var2 = class202.field3155[class297.field4688];
        long var4 = class269.method1823(-24);
        class202.field3155[class297.field4688] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class175.field2607 = ((var6 >> 1) + 32000) / var6;
        }
        class297.field4688 = class297.field4688 + 1 & 0x1F;
        if (arg0 < 88) {
            return;
        }
        if (class100.field1605++ > 50) {
            class100.field1605 -= 50;
            class126.field1987 = true;
            class189.field3021.setSize(class35.field573, class277.field4369);
            class189.field3021.setVisible(true);
            if (class239.field3716 != null && class6.field114 == null) {
                Insets var7 = class239.field3716.getInsets();
                class189.field3021.setLocation(class93.field1509 + var7.left, class62.field994 + var7.top);
            } else {
                class189.field3021.setLocation(class93.field1509, class62.field994);
            }
        }
        this.method942((byte) 111);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZIB)V")
    public static final void method938(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field2070++;
        int var5 = -29 % ((arg4 + 67) / 47);
        if (class103.method784(-1, arg0)) {
            class79.method627(arg3, arg1, false, class261.field4006[arg0], arg2, -1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
    public final void method939(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2074++;
        try {
            if (class179.field2677 == null) {
                class277.field4369 = arg1;
                class205.field3183 = arg1;
                if (arg2 < -32) {
                    class35.field573 = arg4;
                    class237.field3656 = arg4;
                    class179.field2677 = this;
                    class62.field994 = 0;
                    class93.field1509 = 0;
                    class39.field660 = arg0;
                    String var6 = this.getParameter("openwinjs");
                    boolean var10000;
                    if (var6 != null && var6.equals("1")) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                    if (class22.field329 == null) {
                        class155.field2365 = class22.field329 = new class59(this, arg3, (String) null, 0);
                    }
                    class248 var7 = class22.field329.method467(1, this, true);
                    while (var7.field3828 == 0) {
                        class42.method354(10L, false);
                    }
                }
            } else {
                class153.field2347++;
                if (class153.field2347 >= 3) {
                    this.method947(23681, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class223.method1490(var9, (String) null, (byte) -73);
            this.method947(23681, "crash");
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public abstract void method940(byte arg0);

    @OriginalMember(owner = "client!dd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2079++;
        if (class179.field2677 == this && !class223.field3515) {
            class228.field3575 = class269.method1823(-56);
            class42.method354(5000L, false);
            class155.field2365 = null;
            this.method936(false, false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "providesignlink", descriptor = "(Lja;)V")
    public static final void providesignlink(class59 arg0) {
        class22.field329 = arg0;
        class155.field2365 = arg0;
        field2094++;
    }

    @OriginalMember(owner = "client!dd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2072++;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public abstract void method941(int arg0);

    @OriginalMember(owner = "client!dd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2067++;
    }

    @OriginalMember(owner = "client!dd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class88.field1437 = true;
        class126.field1987 = true;
        field2093++;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public abstract void method942(byte arg0);

    @OriginalMember(owner = "client!dd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2078++;
        class88.field1437 = false;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)Z")
    public final boolean method943(int arg0) {
        if (arg0 >= -111) {
            field2103 = null;
        }
        field2102++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
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
                this.method947(23681, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2099++;
    }

    @OriginalMember(owner = "client!dd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2096++;
        if (class239.field3716 == null) {
            return class22.field329 == null || class22.field329.field934 == this ? super.getCodeBase() : class22.field329.field934.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2068++;
        if (class239.field3716 == null) {
            return class22.field329 == null || class22.field329.field934 == this ? super.getDocumentBase() : class22.field329.field934.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
    public abstract void method944(byte arg0);

    @OriginalMember(owner = "client!dd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2077++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public abstract void method945(boolean arg0);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZILjava/lang/String;IIII)V")
    public final void method946(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class179.field2677 = this;
            class39.field660 = arg7;
            class62.field994 = 0;
            class277.field4369 = arg4;
            class205.field3183 = arg4;
            class35.field573 = arg6;
            class237.field3656 = arg6;
            class93.field1509 = 0;
            class239.field3716 = new Frame();
            class239.field3716.setTitle("Jagex");
            class239.field3716.setResizable(true);
            class239.field3716.addWindowListener(this);
            class239.field3716.setVisible(true);
            class239.field3716.toFront();
            if (arg0 >= -6) {
                this.destroy();
            }
            Insets var9 = class239.field3716.getInsets();
            class239.field3716.setSize(class237.field3656 + var9.left + var9.right, var9.top + var9.bottom + class205.field3183);
            class155.field2365 = class22.field329 = new class59((Applet) null, arg5, arg3, arg2);
            class248 var10 = class22.field329.method467(1, this, true);
            while (var10.field3828 == 0) {
                class42.method354(10L, false);
            }
        } catch (Exception var12) {
            class223.method1490(var12, (String) null, (byte) -62);
        }
        field2090++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method947(int arg0, String arg1) {
        if (arg0 != 23681) {
            this.windowActivated((WindowEvent) null);
        }
        field2089++;
        if (this.field2101) {
            return;
        }
        this.field2101 = true;
        System.out.println("error_game_" + arg1);
        try {
            class138.method959("loggedout", (byte) -72, class22.field329.field934);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!dd", name = "stop", descriptor = "()V")
    public final void stop() {
        field2091++;
        if (class179.field2677 == this && !class223.field3515) {
            class228.field3575 = class269.method1823(-65) + 4000L;
        }
    }

    @OriginalMember(owner = "client!dd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!dd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2083++;
    }

    @OriginalMember(owner = "client!dd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2095++;
        if (class239.field3716 == null) {
            return class22.field329 == null || class22.field329.field934 == this ? super.getAppletContext() : class22.field329.field934.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
    public final synchronized void method948(byte arg0) {
        if (class189.field3021 != null) {
            class189.field3021.removeFocusListener(this);
            class189.field3021.getParent().remove(class189.field3021);
        }
        field2069++;
        Container var2;
        if (class6.field114 != null) {
            var2 = class6.field114;
        } else if (class239.field3716 == null) {
            var2 = class22.field329.field934;
        } else {
            var2 = class239.field3716;
        }
        var2.setLayout((LayoutManager) null);
        class189.field3021 = new class53(this);
        var2.add(class189.field3021);
        class189.field3021.setSize(class35.field573, class277.field4369);
        class189.field3021.setVisible(true);
        if (class239.field3716 == var2) {
            Insets var3 = class239.field3716.getInsets();
            class189.field3021.setLocation(var3.left + class93.field1509, class62.field994 + var3.top);
        } else {
            class189.field3021.setLocation(class93.field1509, class62.field994);
        }
        class189.field3021.addFocusListener(this);
        class189.field3021.requestFocus();
        client.field2407 = true;
        class88.field1437 = true;
        class126.field1987 = true;
        class30.field478 = false;
        class78.field1310 = class269.method1823(-72);
        if (arg0 != -41) {
            field2085 = -112;
        }
    }

    @OriginalMember(owner = "client!dd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2098++;
    }

    @OriginalMember(owner = "client!dd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2100++;
        if (class179.field2677 != this || class223.field3515) {
            return;
        }
        class126.field1987 = true;
        if (class176.field2608 && (class269.method1823(-31) - class78.field1310) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class237.field3656 && var2.height >= class205.field3183) {
                class30.field478 = true;
            }
        }
    }
}
