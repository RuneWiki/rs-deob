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
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class39 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Z")
    private boolean field889 = false;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field866 = 0;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Z")
    public static boolean field861 = false;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lmb;")
    public static class84 field871 = class79.method672(true, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[[[Lca;")
    public static class16[][][] field875 = new class16[4][104][104];

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lmb;")
    private static class84 field868 = class79.method672(true, "Too many connections from your address)3");

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lmb;")
    public static class84 field862 = field868;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field864 = 0;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "[I")
    public static int[] field888 = new int[50];

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "Lmb;")
    private static class84 field896 = class79.method672(true, "Click to continue");

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Lmb;")
    public static class84 field872 = field896;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Ldf;")
    public static class28 field877;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "Z")
    public static boolean field901;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public abstract void method143(byte arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static void method288(boolean arg0) {
        field862 = null;
        field871 = null;
        field872 = null;
        field868 = null;
        if (!arg0) {
            field896 = null;
            field888 = null;
            field875 = null;
            field877 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method289(byte arg0, String arg1) {
        field876++;
        if (this.field889) {
            return;
        }
        this.field889 = true;
        if (arg0 < 63) {
            this.start();
        }
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    private final void method290(int arg0) {
        field885++;
        long var2 = class77.method657(3745);
        long var4 = class126.field3040[class51.field1110];
        class126.field3040[class51.field1110] = var2;
        if ((long) arg0 != var4 && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class83.field2048 = ((var6 >> 1) + 32000) / var6;
        }
        class51.field1110 = class51.field1110 + 1 & 0x1F;
        if (class69.field1694++ > 50) {
            class69.field1694 -= 50;
            class24.field572 = true;
            class92.field2296.setSize(class72.field1768, client.field489);
            class92.field2296.setVisible(true);
            if (class46.field1001 == null) {
                class92.field2296.setLocation(0, 0);
            } else {
                Insets var7 = class46.field1001.getInsets();
                class92.field2296.setLocation(var7.left, var7.top);
            }
        }
        this.method136(false);
    }

    @OriginalMember(owner = "client!fc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field863++;
        if (class46.field1001 == null) {
            return class115.field2770 == null || class115.field2770.field3610 == this ? super.getParameter(arg0) : class115.field2770.field3610.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field887++;
    }

    @OriginalMember(owner = "client!fc", name = "start", descriptor = "()V")
    public final void start() {
        field900++;
        if (class52.field1173 == this && !class27.field650) {
            class37.field819 = 0L;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    private final void method291(int arg0) {
        field899++;
        long var2 = class77.method657(3745);
        long var4 = class69.field1672[class106.field2566];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class69.field1672[class106.field2566] = var2;
        class106.field2566 = class106.field2566 + 1 & 0x1F;
        synchronized (this) {
            class106.field2573 = class92.field2284;
            if (arg0 != -49) {
                this.focusLost(null);
            }
        }
        this.method145(20);
    }

    @OriginalMember(owner = "client!fc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field891++;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public final synchronized void method292(byte arg0) {
        field886++;
        Container var2;
        if (class46.field1001 == null) {
            var2 = class115.field2770.field3610;
        } else {
            var2 = class46.field1001;
        }
        if (class92.field2296 != null) {
            class92.field2296.removeFocusListener(this);
            var2.remove(class92.field2296);
        }
        class92.field2296 = new class69(this);
        var2.add(class92.field2296);
        class92.field2296.setSize(class72.field1768, client.field489);
        class92.field2296.setVisible(true);
        if (class46.field1001 == null) {
            class92.field2296.setLocation(0, 0);
        } else {
            Insets var3 = class46.field1001.getInsets();
            class92.field2296.setLocation(var3.left, var3.top);
        }
        class92.field2296.addFocusListener(this);
        class92.field2296.requestFocus();
        class24.field572 = true;
        if (arg0 <= 32) {
            field894 = 102;
        }
        class59.field1476 = false;
        class75.field1836 = class77.method657(3745);
    }

    @OriginalMember(owner = "client!fc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field865++;
        class92.field2284 = true;
        class24.field572 = true;
    }

    @OriginalMember(owner = "client!fc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field873++;
        if (class46.field1001 == null) {
            return class115.field2770 == null || class115.field2770.field3610 == this ? super.getAppletContext() : class115.field2770.field3610.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
    public abstract void method136(boolean arg0);

    @OriginalMember(owner = "client!fc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field882++;
        if (class46.field1001 == null) {
            return class115.field2770 == null || class115.field2770.field3610 == this ? super.getCodeBase() : class115.field2770.field3610.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field859++;
        if (class46.field1001 == null) {
            return class115.field2770 == null || class115.field2770.field3610 == this ? super.getDocumentBase() : class115.field2770.field3610.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "stop", descriptor = "()V")
    public final void stop() {
        field897++;
        if (class52.field1173 == this && !class27.field650) {
            class37.field819 = class77.method657(3745) + 4000L;
        }
    }

    @OriginalMember(owner = "client!fc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field867++;
    }

    @OriginalMember(owner = "client!fc", name = "providesignlink", descriptor = "(Lwe;)V")
    public static final void providesignlink(class147 arg0) {
        class115.field2770 = arg0;
        class75.field1856 = arg0;
        field893++;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    private final synchronized void method293(int arg0) {
        field884++;
        if (class27.field650) {
            return;
        }
        class27.field650 = true;
        try {
            class92.field2296.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method138((byte) 121);
            if (arg0 != 0) {
                field875 = null;
            }
        } catch (Exception var4) {
        }
        if (class46.field1001 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class115.field2770 != null) {
            try {
                class115.field2770.method1195(true);
            } catch (Exception var2) {
            }
        }
        this.method143((byte) 93);
    }

    @OriginalMember(owner = "client!fc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field892++;
    }

    @OriginalMember(owner = "client!fc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field895++;
        if (class52.field1173 != this || class27.field650) {
            return;
        }
        class24.field572 = true;
        if (class147.field3612 != null && class147.field3612.startsWith("1.5") && class77.method657(3745) - class75.field1836 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class72.field1768 && var2.height >= client.field489) {
                class59.field1476 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Z")
    public final boolean method294(int arg0) {
        if (arg0 != 0) {
            this.method147(85);
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field898++;
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
                this.method289((byte) 89, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field881++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILsd;)V")
    public static final void method295(int arg0, class122 arg1) {
        class44.field971 = arg1;
        field890++;
        if (arg0 > -31) {
            field877 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field870++;
        if (class52.field1173 == this && !class27.field650) {
            class37.field819 = class77.method657(3745);
            class22.method149(52, 5000L);
            class75.field1856 = null;
            this.method293(0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field878++;
        this.destroy();
    }

    @OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
    public final void run() {
        field880++;
        try {
            if (class147.field3603 != null) {
                String var1 = class147.field3603.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class147.field3612;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method289((byte) 106, "wrongjava");
                        return;
                    }
                    class11.field192 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class147.field3612 == null || class147.field3612.equals("1.4.2"))) {
                    this.method289((byte) 76, "wrongjava");
                    return;
                }
            }
            if (class115.field2770.field3610 != null) {
                Method var3 = class147.field3611;
                if (var3 != null) {
                    try {
                        var3.invoke(class115.field2770.field3610, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method292((byte) 37);
            class54.field1240 = class70.method619(class72.field1768, client.field489, 4, class92.field2296);
            this.method147(16952);
            class145.field3523 = class63.method576(17);
            class145.field3523.method27((byte) -31);
            while (class37.field819 == 0L || class77.method657(3745) < class37.field819) {
                class106.field2576 = class145.field3523.method26(class11.field192, class144.field3472, 70);
                for (int var4 = 0; var4 < class106.field2576; var4++) {
                    this.method291(-49);
                }
                this.method290(0);
            }
        } catch (Exception var7) {
            class68.method604(20233, null, var7);
            this.method289((byte) 86, "crash");
        }
        this.method293(0);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
    public abstract void method138(byte arg0);

    @OriginalMember(owner = "client!fc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class92.field2284 = false;
        field858++;
    }

    @OriginalMember(owner = "client!fc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field874++;
    }

    @OriginalMember(owner = "client!fc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field860++;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
    public abstract void method145(int arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILjava/net/InetAddress;ILjava/lang/String;II)V")
    public final void method296(int arg0, int arg1, int arg2, InetAddress arg3, int arg4, String arg5, int arg6, int arg7) {
        field879++;
        try {
            class72.field1768 = arg0;
            if (arg7 <= 81) {
                this.focusGained(null);
            }
            class52.field1173 = this;
            client.field489 = arg6;
            class126.field3057 = arg2;
            class46.field1001 = new Frame();
            class46.field1001.setTitle("Jagex");
            class46.field1001.setResizable(false);
            class46.field1001.addWindowListener(this);
            class46.field1001.setVisible(true);
            class46.field1001.toFront();
            Insets var9 = class46.field1001.getInsets();
            class46.field1001.setSize(var9.left + arg0 + var9.right, var9.top + arg6 - -var9.bottom);
            class75.field1856 = class115.field2770 = new class147(true, null, arg3, arg4, arg5, arg1);
            class115.field2770.method1198(this, false, 1);
        } catch (Exception var11) {
            class68.method604(20233, null, var11);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZII)V")
    public final void method297(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field883++;
        try {
            if (class52.field1173 == null) {
                class52.field1173 = this;
                class72.field1768 = arg0;
                class126.field3057 = arg3;
                client.field489 = arg4;
                if (class115.field2770 == null) {
                    class75.field1856 = class115.field2770 = new class147(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg1, null, 0);
                }
                class115.field2770.method1198(this, arg2, 1);
                if (arg2) {
                    field866 = 57;
                }
            } else {
                class72.field1778++;
                if (class72.field1778 >= 3) {
                    this.method289((byte) 74, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            }
        } catch (Exception var7) {
            class68.method604(20233, null, var7);
            this.method289((byte) 66, "crash");
        }
    }

    @OriginalMember(owner = "client!fc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field869++;
        if (arg5 != 0) {
            field871 = null;
        }
        if (class47.method338(arg5 - 121, arg7)) {
            class41.method315(class24.field557[arg7], arg4, arg3, arg8, arg2, arg5 - 127, arg6, 0, arg1, 0, -1, arg0);
        }
    }
}
