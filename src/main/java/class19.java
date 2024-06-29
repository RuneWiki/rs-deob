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
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class19 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Z")
    private boolean field448 = false;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field442 = 0;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Lgg;")
    private static class63 field449 = class116.method911(43, "This computers address has been blocked");

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "Lgg;")
    public static class63 field462 = class116.method911(43, "headicons_prayer");

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lgg;")
    public static class63 field447 = field449;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Lgg;")
    public static class63 field458 = class116.method911(43, "welle:");

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[I")
    public static int[] field452;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
    public static final int method195(int arg0, int arg1) {
        if (arg1 > -66) {
            return 115;
        }
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        field467++;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!bh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field461++;
        if (class153.field3193 == null) {
            return class79.field1924 == null || class79.field1924.field3145 == this ? super.getDocumentBase() : class79.field1924.field3145.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
    public static final void method196(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field476++;
        for (int var5 = 0; var5 < class202.field4005; var5++) {
            if (class97.field2307[var5] + class27.field606[var5] > arg2 && class27.field606[var5] < arg2 + arg3 && arg1 < class98.field2322[var5] + class110.field2481[var5] && class110.field2481[var5] < arg0 + arg1) {
                class135.field2927[var5] = true;
            }
        }
        if (arg4 != -51) {
            field452 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field439++;
        if (class153.field3193 == null) {
            return class79.field1924 == null || class79.field1924.field3145 == this ? super.getAppletContext() : class79.field1924.field3145.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method197(String arg0, int arg1) {
        field438++;
        if (this.field448) {
            return;
        }
        this.field448 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
        if (arg1 != 11692) {
            field447 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Leg;")
    public static final class46 method198(int arg0, int arg1) {
        class46 var2 = (class46) class170.field3500.method289((long) arg1, -130079263);
        field471++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field370.method745(13, arg1, 0);
        if (arg0 <= 0) {
            providesignlink(null);
        }
        class46 var4 = new class46();
        var4.field1078 = arg1;
        if (var3 != null) {
            var4.method461(new class3(var3), -13087);
        }
        class170.field3500.method293(false, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "start", descriptor = "()V")
    public final void start() {
        field475++;
        if (class81.field1956 == this && !class10.field239) {
            class83.field1971 = 0L;
        }
    }

    @OriginalMember(owner = "client!bh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field463++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIIII)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field479++;
        try {
            if (class81.field1956 == null) {
                class81.field1956 = this;
                class84.field2000 = arg4;
                class164.field3379 = arg3;
                if (arg0 != 0) {
                    this.field448 = true;
                }
                class121.field2685 = arg2;
                if (class79.field1924 == null) {
                    class108.field2447 = class79.field1924 = new class149(false, this, arg1, null, 0);
                }
                class79.field1924.method1045(this, (byte) 88, 1);
            } else {
                class105.field2410++;
                if (class105.field2410 >= 3) {
                    this.method197("alreadyloaded", arg0 + 11692);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class199.method1302(null, var7, true);
            this.method197("crash", 11692);
        }
    }

    @OriginalMember(owner = "client!bh", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field464++;
        if (class81.field1956 == this && !class10.field239) {
            class83.field1971 = class198.method1295((byte) 110);
            class196.method1281((byte) -8, 5000L);
            class108.field2447 = null;
            this.method203((byte) 102);
        }
    }

    @OriginalMember(owner = "client!bh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field446++;
        if (class81.field1956 != this || class10.field239) {
            return;
        }
        class127.field2796 = true;
        if (class149.field3141 != null && class149.field3141.startsWith("1.5") && class198.method1295((byte) 101) - class74.field1835 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class84.field2000 <= var2.width && var2.height >= class121.field2685) {
                class24.field554 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class60.field1530 = false;
        field451++;
    }

    @OriginalMember(owner = "client!bh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field470++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public abstract void method200(int arg0);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public abstract void method201(int arg0);

    @OriginalMember(owner = "client!bh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field444++;
        if (class153.field3193 == null) {
            return class79.field1924 == null || class79.field1924.field3145 == this ? super.getCodeBase() : class79.field1924.field3145.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "providesignlink", descriptor = "(Lqe;)V")
    public static final void providesignlink(class149 arg0) {
        field443++;
        class79.field1924 = arg0;
        class108.field2447 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field441++;
    }

    @OriginalMember(owner = "client!bh", name = "run", descriptor = "()V")
    public final void run() {
        field455++;
        try {
            if (class149.field3134 != null) {
                String var1 = class149.field3134.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class149.field3141;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method197("wrongjava", 11692);
                        return;
                    }
                    class206.field4054 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class149.field3141 == null || class149.field3141.equals("1.4.2"))) {
                    this.method197("wrongjava", 11692);
                    return;
                }
            }
            if (class79.field1924.field3145 != null) {
                Method var3 = class149.field3148;
                if (var3 != null) {
                    try {
                        var3.invoke(class79.field1924.field3145, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method209((byte) 104);
            class63.field1621 = class49.method479(class121.field2685, class49.field1193, class84.field2000, true);
            this.method212(false);
            class32.field781 = class88.method768(true);
            while (class83.field1971 == 0L || class83.field1971 > class198.method1295((byte) 83)) {
                class21.field509 = class32.field781.method4(class206.field4054, class96.field2287, -7604);
                for (int var4 = 0; var4 < class21.field509; var4++) {
                    this.method210(true);
                }
                this.method206((byte) -97);
                class136.method996(class49.field1193, -964, class79.field1924);
            }
        } catch (Exception var7) {
            class199.method1302(null, var7, true);
            this.method197("crash", 11692);
        }
        this.method203((byte) -87);
    }

    @OriginalMember(owner = "client!bh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field473++;
    }

    @OriginalMember(owner = "client!bh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field454++;
    }

    @OriginalMember(owner = "client!bh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field472++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Z")
    public final boolean method202(byte arg0) {
        field466++;
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
            int var3 = 114 % ((arg0 - 76) / 47);
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method197("invalidhost", 11692);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    private final synchronized void method203(byte arg0) {
        field459++;
        int var2 = -113 / ((arg0 - 53) / 46);
        if (class10.field239) {
            return;
        }
        class10.field239 = true;
        try {
            class49.field1193.removeFocusListener(this);
        } catch (Exception var6) {
        }
        try {
            this.method211(-98);
        } catch (Exception var5) {
        }
        if (class153.field3193 != null) {
            try {
                System.exit(0);
            } catch (Throwable var4) {
            }
        }
        if (class79.field1924 != null) {
            try {
                class79.field1924.method1042(92);
            } catch (Exception var3) {
            }
        }
        this.method200(6000);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static void method204(int arg0) {
        field462 = null;
        field447 = null;
        field452 = null;
        field458 = null;
        field449 = null;
        if (arg0 < 12) {
            field442 = -125;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Z")
    public static final boolean method205(int arg0) {
        field468++;
        try {
            if (class42.field971 == 2) {
                if (class22.field516 == null) {
                    class22.field516 = class194.method1272(class49.field1187, class97.field2308, class150.field3156);
                    if (class22.field516 == null) {
                        return false;
                    }
                }
                if (class108.field2433 == null) {
                    class108.field2433 = new class84(class94.field2248, class143.field3073);
                }
                if (class182.field3698.method385(22050, -119, class108.field2433, class190.field3872, class22.field516)) {
                    class182.field3698.method402(101);
                    class182.field3698.method389(class101.field2368, 2);
                    class182.field3698.method390(0, class22.field516, class90.field2110);
                    class42.field971 = 0;
                    class108.field2433 = null;
                    class22.field516 = null;
                    class49.field1187 = null;
                    return true;
                }
            }
            if (arg0 != 8550) {
                providesignlink(null);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class182.field3698.method386(false);
            class22.field516 = null;
            class108.field2433 = null;
            class42.field971 = 0;
            class49.field1187 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field477++;
        class60.field1530 = true;
        class127.field2796 = true;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
    private final void method206(byte arg0) {
        field445++;
        long var2 = class198.method1295((byte) 49);
        long var4 = class99.field2343[class9.field193];
        if (arg0 != -97) {
            method205(92);
        }
        class99.field2343[class9.field193] = var2;
        class9.field193 = class9.field193 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class84.field1999 = ((var6 >> 1) + 32000) / var6;
        }
        if (class169.field3488++ > 50) {
            class127.field2796 = true;
            class169.field3488 -= 50;
            class49.field1193.setSize(class84.field2000, class121.field2685);
            class49.field1193.setVisible(true);
            if (class153.field3193 == null) {
                class49.field1193.setLocation(0, 0);
            } else {
                Insets var7 = class153.field3193.getInsets();
                class49.field1193.setLocation(var7.left, var7.top);
            }
        }
        this.method201(26);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)Z")
    public static final boolean method207(boolean arg0, int arg1) {
        field440++;
        if (arg0) {
            field452 = null;
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V")
    public final void method208(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        try {
            class84.field2000 = arg2;
            class81.field1956 = this;
            class121.field2685 = arg1;
            class164.field3379 = arg5;
            class153.field3193 = new Frame();
            class153.field3193.setTitle("Jagex");
            class153.field3193.setResizable(false);
            if (arg4 != -46) {
                field452 = null;
            }
            class153.field3193.addWindowListener(this);
            class153.field3193.setVisible(true);
            class153.field3193.toFront();
            Insets var8 = class153.field3193.getInsets();
            class153.field3193.setSize(var8.right + arg2 + var8.left, var8.top + var8.bottom + arg1);
            class108.field2447 = class79.field1924 = new class149(true, null, arg3, arg0, arg6);
            class79.field1924.method1045(this, (byte) 103, 1);
        } catch (Exception var10) {
            class199.method1302(null, var10, true);
        }
        field465++;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
    public final synchronized void method209(byte arg0) {
        field453++;
        if (arg0 <= 99) {
            return;
        }
        Container var2;
        if (class153.field3193 == null) {
            var2 = class79.field1924.field3145;
        } else {
            var2 = class153.field3193;
        }
        if (class49.field1193 != null) {
            class49.field1193.removeFocusListener(this);
            var2.remove(class49.field1193);
        }
        class49.field1193 = new class177(this);
        var2.add(class49.field1193);
        class49.field1193.setSize(class84.field2000, class121.field2685);
        class49.field1193.setVisible(true);
        if (class153.field3193 == null) {
            class49.field1193.setLocation(0, 0);
        } else {
            Insets var3 = class153.field3193.getInsets();
            class49.field1193.setLocation(var3.left, var3.top);
        }
        class49.field1193.addFocusListener(this);
        class49.field1193.requestFocus();
        class127.field2796 = true;
        class24.field554 = false;
        class74.field1835 = class198.method1295((byte) 95);
    }

    @OriginalMember(owner = "client!bh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field474++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    private final void method210(boolean arg0) {
        long var2 = class198.method1295((byte) 36);
        field478++;
        long var4 = class78.field1889[class127.field2800];
        class78.field1889[class127.field2800] = var2;
        class127.field2800 = class127.field2800 + 1 & 0x1F;
        synchronized (this) {
            class144.field3080 = class60.field1530;
        }
        if (!arg0) {
            field442 = -20;
        }
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        this.method213(28051);
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
    public abstract void method211(int arg0);

    @OriginalMember(owner = "client!bh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field457++;
        this.destroy();
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
    public abstract void method212(boolean arg0);

    @OriginalMember(owner = "client!bh", name = "stop", descriptor = "()V")
    public final void stop() {
        field450++;
        if (class81.field1956 == this && !class10.field239) {
            class83.field1971 = class198.method1295((byte) 49) + 4000L;
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public abstract void method213(int arg0);

    @OriginalMember(owner = "client!bh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field460++;
        if (class153.field3193 == null) {
            return class79.field1924 == null || class79.field1924.field3145 == this ? super.getParameter(arg0) : class79.field1924.field3145.getParameter(arg0);
        } else {
            return null;
        }
    }
}
