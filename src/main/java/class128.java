import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class class128 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!li", name = "E", descriptor = "Z")
    private boolean field2409 = false;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Ldc;")
    public static class37 field2382 = class185.method1233((byte) 86, "Art");

    @OriginalMember(owner = "client!li", name = "B", descriptor = "[Llg;")
    public static class126[] field2406 = new class126[4];

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Ldc;")
    public static class37 field2410 = class185.method1233((byte) 86, "Registrierter Benutzer");

    @OriginalMember(owner = "client!li", name = "j", descriptor = "[Ldc;")
    public static class37[] field2388 = new class37[100];

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field2412 = 0;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "Ldc;")
    private static class37 field2413 = class185.method1233((byte) 86, "Select");

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Ldc;")
    public static class37 field2394 = field2413;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "[I")
    public static int[] field2420 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Ldc;")
    public static class37 field2421 = class185.method1233((byte) 86, "hitmarks");

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "Z")
    public static boolean field2422;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIILjava/lang/String;ZI)V")
    public final void method894(int arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, int arg6) {
        try {
            class104.field1796 = this;
            class115.field2063 = arg3;
            class224.field4156 = arg1;
            class103.field1770 = arg6;
            class131.field2451 = new Frame();
            class131.field2451.setTitle("Jagex");
            class131.field2451.setResizable(false);
            class131.field2451.addWindowListener(this);
            class131.field2451.setVisible(arg5);
            class131.field2451.toFront();
            Insets var8 = class131.field2451.getInsets();
            class131.field2451.setSize(var8.right + arg3 + var8.left, arg6 - -var8.top + var8.bottom);
            class177.field3342 = class10.field130 = new class21(true, null, arg0, arg4, arg2);
            class10.field130.method141(1, this, (byte) 72);
        } catch (Exception var10) {
            class60.method455(95, var10, null);
        }
        field2383++;
    }

    @OriginalMember(owner = "client!li", name = "start", descriptor = "()V")
    public final void start() {
        field2385++;
        if (class104.field1796 == this && !class6.field63) {
            class62.field1143 = 0L;
        }
    }

    @OriginalMember(owner = "client!li", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class16.field255 = false;
        field2389++;
    }

    @OriginalMember(owner = "client!li", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class16.field255 = true;
        field2381++;
        class194.field3617 = true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public abstract void method286(byte arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public abstract void method275(int arg0);

    @OriginalMember(owner = "client!li", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2411++;
        if (class131.field2451 == null) {
            return class10.field130 == null || class10.field130.field347 == this ? super.getDocumentBase() : class10.field130.field347.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2405++;
        if (class131.field2451 == null) {
            return class10.field130 == null || class10.field130.field347 == this ? super.getAppletContext() : class10.field130.field347.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "stop", descriptor = "()V")
    public final void stop() {
        field2416++;
        if (class104.field1796 == this && !class6.field63) {
            class62.field1143 = class214.method1416(22624) + 4000L;
        }
    }

    @OriginalMember(owner = "client!li", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2397++;
        if (class131.field2451 == null) {
            return class10.field130 == null || class10.field130.field347 == this ? super.getParameter(arg0) : class10.field130.field347.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    private final void method895(int arg0) {
        field2401++;
        long var2 = class214.method1416(22624);
        long var4 = class83.field1477[class84.field1485];
        class83.field1477[class84.field1485] = var2;
        class84.field1485 = class84.field1485 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class3.field25 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 >= -5) {
            field2420 = null;
        }
        if (class62.field1141++ > 50) {
            class194.field3617 = true;
            class62.field1141 -= 50;
            class225.field4158.setSize(class115.field2063, class103.field1770);
            class225.field4158.setVisible(true);
            if (class131.field2451 == null) {
                class225.field4158.setLocation(0, 0);
            } else {
                Insets var7 = class131.field2451.getInsets();
                class225.field4158.setLocation(var7.left, var7.top);
            }
        }
        this.method279(true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
    private final void method896(boolean arg0, int arg1) {
        field2396++;
        synchronized (this) {
            if (class6.field63) {
                return;
            }
            class6.field63 = true;
        }
        if (class10.field130.field347 != null) {
            class10.field130.field347.destroy();
        }
        if (class225.field4158 != null) {
            try {
                class225.field4158.removeFocusListener(this);
                Container var4;
                if (class131.field2451 == null) {
                    var4 = class10.field130.field347;
                } else {
                    var4 = class131.field2451;
                }
                var4.remove(class225.field4158);
            } catch (Exception var10) {
            }
        }
        try {
            this.method277((byte) 20);
        } catch (Exception var9) {
        }
        if (class10.field130 != null) {
            try {
                class10.field130.method136(65);
            } catch (Exception var8) {
            }
        }
        this.method286((byte) 56);
        if (class131.field2451 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (arg1 == 0) {
            System.out.println("Shutdown complete - clean:" + arg0);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method897(boolean arg0) {
        field2410 = null;
        field2388 = null;
        field2421 = null;
        field2406 = null;
        if (!arg0) {
            field2394 = null;
            field2382 = null;
            field2413 = null;
            field2420 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2392++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    public abstract void method282(byte arg0);

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
    public abstract void method277(byte arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)Lb;")
    public static final class12 method898(int arg0, boolean arg1) {
        field2419++;
        class12 var2 = (class12) class95.field1673.method87(-77, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class158.field3002.method1547(arg0, 0, 4);
        class12 var4 = new class12();
        if (var3 != null) {
            var4.method77(3, new class28(var3), arg0);
        }
        if (!arg1) {
            providesignlink(null);
        }
        class95.field1673.method92((long) arg0, var4, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V")
    private final void method899(boolean arg0) {
        if (!arg0) {
            field2394 = null;
        }
        field2404++;
        long var2 = class214.method1416(22624);
        long var4 = class62.field1147[class29.field543];
        class62.field1147[class29.field543] = var2;
        class29.field543 = class29.field543 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class224.field4155 = class16.field255;
        }
        this.method275(45);
    }

    @OriginalMember(owner = "client!li", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2380++;
        if (class104.field1796 == this && !class6.field63) {
            class62.field1143 = class214.method1416(22624);
            class238.method1548((byte) -98, 5000L);
            class177.field3342 = null;
            this.method896(false, 0);
        }
    }

    @OriginalMember(owner = "client!li", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2403++;
    }

    @OriginalMember(owner = "client!li", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2414++;
        if (class131.field2451 == null) {
            return class10.field130 == null || class10.field130.field347 == this ? super.getCodeBase() : class10.field130.field347.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    private final synchronized void method900(int arg0) {
        field2395++;
        Container var2;
        if (class131.field2451 == null) {
            var2 = class10.field130.field347;
        } else {
            var2 = class131.field2451;
        }
        if (class225.field4158 != null) {
            class225.field4158.removeFocusListener(this);
            var2.remove(class225.field4158);
        }
        class225.field4158 = new class240(this);
        var2.add(class225.field4158);
        class225.field4158.setSize(class115.field2063, class103.field1770);
        class225.field4158.setVisible(true);
        if (class131.field2451 == null) {
            class225.field4158.setLocation(0, 0);
        } else {
            Insets var3 = class131.field2451.getInsets();
            class225.field4158.setLocation(var3.left, var3.top);
        }
        class225.field4158.addFocusListener(this);
        if (arg0 == 0) {
            class225.field4158.requestFocus();
            class194.field3617 = true;
            class96.field1688 = class214.method1416(22624);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Z")
    public static final boolean method901(int arg0, int arg1, int arg2) {
        int var3 = -113 / ((arg2 + 13) / 62);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        field2399++;
        class30 var4 = class73.method519(arg0, -21035);
        return var4.method257(arg1, 5836);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILse;)V")
    public static final void method902(boolean arg0, int arg1, class201 arg2) {
        field2390++;
        if (arg1 != -28361) {
            field2410 = null;
        }
        int var3 = arg2.field3746;
        int var4 = (int) arg2.field1066;
        arg2.method433(0);
        if (arg0) {
            class106.method696((byte) 9, var3);
        }
        class7.method51(0, var3);
        class136 var5 = class180.method1200(var4, (byte) 111);
        if (var5 != null) {
            class210.method1395((byte) 29, var5);
        }
        class118.field2114 = false;
        class97.field1701 = 0;
        class241.method1579(class225.field4164, class149.field2826, class246.field4491, class10.field141, true);
        if (class149.field2828 != -1) {
            class142.method987(class149.field2828, 1, false);
        }
    }

    @OriginalMember(owner = "client!li", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2391++;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(Z)V")
    public abstract void method279(boolean arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/Color;IIZLdc;)V")
    public static final void method903(Color arg0, int arg1, int arg2, boolean arg3, class37 arg4) {
        try {
            Graphics var5 = class225.field4158.getGraphics();
            if (class38.field801 == null) {
                class38.field801 = new Font("Helvetica", 1, 13);
                class32.field660 = class225.field4158.getFontMetrics(class38.field801);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class115.field2063, class103.field1770);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class246.field4497 == null) {
                    class246.field4497 = class225.field4158.createImage(304, 34);
                }
                Graphics var6 = class246.field4497.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                if (arg1 != 5000) {
                    field2420 = null;
                }
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var6.setFont(class38.field801);
                var6.setColor(Color.white);
                arg4.method327(22, 22218, var6, (304 - arg4.method304(class32.field660, -32)) / 2);
                var5.drawImage(class246.field4497, class115.field2063 / 2 - 152, class103.field1770 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class115.field2063 / 2 - 152;
                int var8 = class103.field1770 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 - -1, 301, 31);
                var5.fillRect(arg2 * 3 + var7 + 2, var8 - -2, 300 - arg2 * 3, 30);
                var5.setFont(class38.field801);
                var5.setColor(Color.white);
                arg4.method327(var8 + 22, 22218, var5, var7 + (304 - arg4.method304(class32.field660, -32)) / 2);
            }
            if (class131.field2459 != null) {
                var5.setFont(class38.field801);
                var5.setColor(Color.white);
                class131.field2459.method327(class103.field1770 / 2 - 26, arg1 ^ 0x4542, var5, class115.field2063 / 2 - class131.field2459.method304(class32.field660, arg1 ^ 0xFFFFEC68) / 2);
            }
        } catch (Exception var10) {
            class225.field4158.repaint();
        }
        field2387++;
    }

    @OriginalMember(owner = "client!li", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2418++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
    public final void method904(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2407++;
        try {
            if (class104.field1796 == null) {
                if (arg0 != -16273) {
                    this.method904(-64, 20, -124, 30, -79);
                }
                class103.field1770 = arg3;
                class115.field2063 = arg4;
                class104.field1796 = this;
                class224.field4156 = arg1;
                if (class10.field130 == null) {
                    class177.field3342 = class10.field130 = new class21(false, this, arg2, null, 0);
                }
                class10.field130.method141(1, this, (byte) 72);
            } else {
                class127.field2375++;
                if (class127.field2375 >= 3) {
                    this.method907(arg0 ^ 0xFFFFC055, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class60.method455(95, var7, null);
            this.method907(-82, "crash");
        }
    }

    @OriginalMember(owner = "client!li", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2400++;
    }

    @OriginalMember(owner = "client!li", name = "providesignlink", descriptor = "(Lbi;)V")
    public static final void providesignlink(class21 arg0) {
        class10.field130 = arg0;
        class177.field3342 = arg0;
        field2417++;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(Z)Z")
    public final boolean method905(boolean arg0) {
        field2379++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (!arg0) {
            return false;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method907(101, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2393++;
    }

    @OriginalMember(owner = "client!li", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2402++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lwa;II)Z")
    public static final boolean method906(class238 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            method902(false, -105, null);
        }
        field2408++;
        byte[] var3 = arg0.method1536(arg1, 18808);
        if (var3 == null) {
            return false;
        } else {
            class35.method292(var3, 1);
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method907(int arg0, String arg1) {
        field2398++;
        if (this.field2409) {
            return;
        }
        this.field2409 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var4) {
        }
        int var3 = 106 % ((17 - arg0) / 38);
    }

    @OriginalMember(owner = "client!li", name = "run", descriptor = "()V")
    public final void run() {
        field2384++;
        try {
            if (class21.field357 != null) {
                String var1 = class21.field357.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class21.field343;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method907(-103, "wrongjava");
                        return;
                    }
                    class92.field1576 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class21.field343 == null || class21.field343.equals("1.4.2"))) {
                    this.method907(85, "wrongjava");
                    return;
                }
            }
            if (class10.field130.field347 != null) {
                Method var3 = class21.field342;
                if (var3 != null) {
                    try {
                        var3.invoke(class10.field130.field347, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method900(0);
            class224.field4151 = class155.method1054(class225.field4158, false, class115.field2063, class103.field1770);
            this.method282((byte) 121);
            class61.field1128 = class68.method500((byte) -88);
            while (class62.field1143 == 0L || class62.field1143 > class214.method1416(22624)) {
                class145.field2784 = class61.field1128.method85(class210.field3942, (byte) 66, class92.field1576);
                for (int var4 = 0; var4 < class145.field2784; var4++) {
                    this.method899(true);
                }
                this.method895(-70);
                class197.method1312(class225.field4158, 0, class10.field130);
            }
        } catch (Exception var7) {
            class60.method455(95, var7, null);
            this.method907(-112, "crash");
        }
        this.method896(true, 0);
    }

    @OriginalMember(owner = "client!li", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2386++;
        if (class104.field1796 != this || class6.field63) {
            return;
        }
        class194.field3617 = true;
        if (class21.field343 == null || !class21.field343.startsWith("1.5") || class214.method1416(22624) - class96.field1688 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        boolean var10000;
        if (var2 == null || var2.width >= class115.field2063 && var2.height >= class103.field1770) {
            var10000 = true;
        } else {
            var10000 = false;
        }
    }

    @OriginalMember(owner = "client!li", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2415++;
    }
}
