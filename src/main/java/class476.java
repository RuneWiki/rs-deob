import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!oga")
public abstract class class476 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "Z")
    private boolean field6426 = false;

    @OriginalMember(owner = "client!oga", name = "J", descriptor = "Z")
    private boolean field6436 = false;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "Lpfa;")
    public static class299 field6418 = new class299();

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!oga", name = "v", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!oga", name = "w", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!oga", name = "x", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!oga", name = "y", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!oga", name = "A", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!oga", name = "C", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!oga", name = "D", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!oga", name = "E", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!oga", name = "F", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!oga", name = "G", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!oga", name = "I", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!oga", name = "L", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!oga", name = "M", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!oga", name = "N", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!oga", name = "O", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!oga", name = "Q", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!oga", name = "R", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!oga", name = "T", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!oga", name = "X", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!oga", name = "Y", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!oga", name = "Z", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!oga", name = "ab", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!oga", name = "cb", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!oga", name = "H", descriptor = "Lhu;")
    public static class134 field6434;

    @OriginalMember(owner = "client!oga", name = "K", descriptor = "Z")
    public static boolean field6437;

    @OriginalMember(owner = "client!oga", name = "P", descriptor = "Z")
    public static boolean field6442;

    @OriginalMember(owner = "client!oga", name = "S", descriptor = "Z")
    public static boolean field6445;

    @OriginalMember(owner = "client!oga", name = "U", descriptor = "Z")
    public static boolean field6447;

    @OriginalMember(owner = "client!oga", name = "V", descriptor = "Z")
    public static boolean field6448;

    @OriginalMember(owner = "client!oga", name = "W", descriptor = "Z")
    public static boolean field6449;

    @OriginalMember(owner = "client!oga", name = "bb", descriptor = "Z")
    public static boolean field6454;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V", line = 3)
    private final void method2719(byte arg0) {
        field6403++;
        long var2 = class446.method2525(500);
        long var4 = class275.field3453[class452.field5986];
        class275.field3453[class452.field5986] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class452.field5986 = class452.field5986 + 1 & 0x1F;
        synchronized (this) {
            class430.field5752 = class647.field8959;
            if (arg0 >= -14) {
                this.paint(null);
            }
        }
        this.method1819(false);
    }

    @OriginalMember(owner = "client!oga", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 34)
    public final void windowDeactivated(WindowEvent arg0) {
        field6429++;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BZ)V", line = 42)
    private final void method2720(byte arg0, boolean arg1) {
        field6428++;
        int var3 = 69 / ((33 - arg0) / 63);
        synchronized (this) {
            if (class650.field9031) {
                return;
            }
            class650.field9031 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class64.field900 != null) {
            class64.field900.destroy();
        }
        try {
            this.method1822(0);
        } catch (Exception var10) {
        }
        if (this.field6436) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field6436 = false;
        }
        class166.method1164(true, (byte) -113);
        class391.method2215(50);
        if (class262.field3311 != null) {
            try {
                class262.field3311.removeFocusListener(this);
                class262.field3311.getParent().remove(class262.field3311);
            } catch (Exception var8) {
            }
        }
        if (class162.field2227 != null) {
            try {
                class162.field2227.method2648(true);
            } catch (Exception var7) {
            }
        }
        this.method1829(-25241);
        if (class731.field10179 != null) {
            class731.field10179.setVisible(false);
            class731.field10179.dispose();
            class731.field10179 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!oga", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 118)
    public final void windowOpened(WindowEvent arg0) {
        field6423++;
    }

    @OriginalMember(owner = "client!oga", name = "stop", descriptor = "()V", line = 125)
    public final void stop() {
        field6430++;
        if (class319.field4123 == this && !class650.field9031) {
            class713.field9904 = class446.method2525(500) + 4000L;
        }
    }

    @OriginalMember(owner = "client!oga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 136)
    public final void focusGained(FocusEvent arg0) {
        field6407++;
        class647.field8959 = true;
        class10.field134 = true;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V", line = 151)
    private final void method2721(int arg0) {
        field6431++;
        if (arg0 != 32000) {
            this.paint(null);
        }
        long var2 = class446.method2525(500);
        long var4 = class353.field4543[class197.field2686];
        class353.field4543[class197.field2686] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class5.field54 = ((var6 >> 1) + 32000) / var6;
        }
        class197.field2686 = class197.field2686 + 1 & 0x1F;
        if (class446.field5929++ > 50) {
            class446.field5929 -= 50;
            class10.field134 = true;
            class262.field3311.setSize(class356.field4586, class466.field6263);
            class262.field3311.setVisible(true);
            if (class731.field10179 != null && class353.field4533 == null) {
                Insets var7 = class731.field10179.getInsets();
                class262.field3311.setLocation(class489.field6951 + var7.left, var7.top - -class288.field3772);
            } else {
                class262.field3311.setLocation(class489.field6951, class288.field3772);
            }
        }
        this.method1834((byte) -91);
    }

    @OriginalMember(owner = "client!oga", name = "run", descriptor = "()V", line = 198)
    public final void run() {
        field6414++;
        try {
            if (class465.field6245 != null) {
                String var1 = class465.field6245.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class465.field6239;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2726("wrongjava", 57);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class465.field6239 == null || class465.field6239.equals("1.4.2"))) {
                    this.method2726("wrongjava", 57);
                    return;
                }
            }
            if (class465.field6239 != null && class465.field6239.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class465.field6239.length()) {
                    char var5 = class465.field6239.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class593.field8288 = true;
                }
            }
            Applet var6 = class319.field4123;
            if (class64.field900 != null) {
                var6 = class64.field900;
            }
            Method var7 = class465.field6252;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class82.method685(28);
            class98.method788((byte) 127);
            this.method1831(1);
            this.method1820((byte) -10);
            class194.field2660 = class706.method3953((byte) -116);
            while (class713.field9904 == 0L || class713.field9904 > class446.method2525(500)) {
                class143.field2026 = class194.field2660.method1329(class679.field9483, 104);
                for (int var8 = 0; var8 < class143.field2026; var8++) {
                    this.method2719((byte) -87);
                }
                this.method2721(32000);
                class720.method4024((byte) -108, class262.field3311, class162.field2227);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class684.method3842(1, var20, this.method1814((byte) -89));
            this.method2726("crash", 57);
        } finally {
            Object var13 = null;
            this.method2720((byte) 125, true);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 325)
    public final void method2722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field6410++;
        try {
            if (class319.field4123 == null) {
                class587.field8227 = class64.field900;
                class356.field4586 = arg4;
                class754.field10526 = arg4;
                class466.field6263 = arg5;
                class317.field4108 = arg5;
                class755.field10536 = arg1;
                class288.field3772 = 0;
                class489.field6951 = 0;
                class319.field4123 = this;
                class320.field4129 = class162.field2227 = new class465(arg3, arg6, arg0, class64.field900 != null);
                if (arg2 == 3261) {
                    class181 var8 = class162.field2227.method2643(1, this, (byte) 82);
                    while (var8.field2538 == 0) {
                        class149.method1052(10L, true);
                    }
                }
            } else {
                class754.field10509++;
                if (class754.field10509 >= 3) {
                    this.method2726("alreadyloaded", 57);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class684.method3842(1, var10, null);
            this.method2726("crash", 57);
        }
    }

    @OriginalMember(owner = "client!oga", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 378)
    public static final void provideLoaderApplet(Applet arg0) {
        field6416++;
        class64.field900 = arg0;
    }

    @OriginalMember(owner = "client!oga", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 387)
    public final URL getDocumentBase() {
        field6421++;
        if (class731.field10179 == null) {
            return class64.field900 == null || class64.field900 == this ? super.getDocumentBase() : class64.field900.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 403)
    public final void windowDeiconified(WindowEvent arg0) {
        field6425++;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)Z", line = 410)
    public final boolean method2723(int arg0) {
        field6427++;
        if (arg0 != 0) {
            this.getDocumentBase();
        }
        return class633.method3549("jagmisc", 99);
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V", line = 422)
    public static void method2724(byte arg0) {
        field6434 = null;
        field6418 = null;
        int var1 = -126 / ((-arg0 - 16) / 52);
    }

    @OriginalMember(owner = "client!oga", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 432)
    public final void windowActivated(WindowEvent arg0) {
        field6409++;
    }

    @OriginalMember(owner = "client!oga", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 441)
    public final void update(Graphics arg0) {
        field6405++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!oga", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 449)
    public final String getParameter(String arg0) {
        field6401++;
        if (class731.field10179 == null) {
            return class64.field900 == null || class64.field900 == this ? super.getParameter(arg0) : class64.field900.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "start", descriptor = "()V", line = 465)
    public final void start() {
        field6432++;
        if (class319.field4123 == this && !class650.field9031) {
            class713.field9904 = 0L;
        }
    }

    @OriginalMember(owner = "client!oga", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 478)
    public final void windowClosed(WindowEvent arg0) {
        field6406++;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(Z)Z", line = 488)
    public final boolean method2725(boolean arg0) {
        field6435++;
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
            if (arg0) {
                this.field6426 = true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method2726("invalidhost", 57);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 525)
    public final URL getCodeBase() {
        field6433++;
        if (class731.field10179 == null) {
            return class64.field900 == null || class64.field900 == this ? super.getCodeBase() : class64.field900.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 541)
    public final AppletContext getAppletContext() {
        field6422++;
        if (class731.field10179 == null) {
            return class64.field900 == null || class64.field900 == this ? super.getAppletContext() : class64.field900.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 556)
    public final void method2726(String arg0, int arg1) {
        field6402++;
        if (this.field6426) {
            return;
        }
        this.field6426 = true;
        System.out.println("error_game_" + arg0);
        try {
            class568.method3263("loggedout", class64.field900, false);
        } catch (Throwable var4) {
        }
        try {
            if (arg1 != 57) {
                this.method2725(false);
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!oga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 584)
    public final synchronized void paint(Graphics arg0) {
        field6413++;
        if (class319.field4123 != this || class650.field9031) {
            return;
        }
        class10.field134 = true;
        if (class593.field8288 && class446.method2525(500) - class337.field4279 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class754.field10526 <= var2.width && class317.field4108 <= var2.height) {
                class461.field6211 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "(I)Z", line = 606)
    public final boolean method2727(int arg0) {
        field6408++;
        int var2 = -5 / ((arg0 + 2) / 51);
        return class633.method3549("jagtheora", 99);
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(B)Ljava/lang/String;", line = 626)
    public String method1814(byte arg0) {
        if (arg0 >= -75) {
            return null;
        } else {
            field6419++;
            return null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)Z", line = 641)
    public final boolean method2728(int arg0) {
        if (arg0 >= -46) {
            this.field6436 = true;
        }
        field6415++;
        return class633.method3549("jaclib", 99);
    }

    @OriginalMember(owner = "client!oga", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 652)
    public final void windowClosing(WindowEvent arg0) {
        field6417++;
        this.destroy();
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IBILjava/lang/String;IIIZ)V", line = 661)
    public final void method2729(int arg0, byte arg1, int arg2, String arg3, int arg4, int arg5, int arg6, boolean arg7) {
        try {
            class356.field4586 = arg0;
            class754.field10526 = arg0;
            class489.field6951 = 0;
            class288.field3772 = 0;
            class755.field10536 = arg2;
            class466.field6263 = arg4;
            class317.field4108 = arg4;
            class319.field4123 = this;
            class587.field8227 = null;
            class731.field10179 = new Frame();
            class731.field10179.setTitle("Jagex");
            class731.field10179.setResizable(true);
            class731.field10179.addWindowListener(this);
            class731.field10179.setVisible(true);
            class731.field10179.toFront();
            Insets var9 = class731.field10179.getInsets();
            class731.field10179.setSize(class754.field10526 - (-var9.right - var9.left), class317.field4108 + var9.top - -var9.bottom);
            int var10 = -102 / ((arg1 + 21) / 62);
            class320.field4129 = class162.field2227 = new class465(arg5, arg3, arg6, true);
            class181 var11 = class162.field2227.method2643(1, this, (byte) 82);
            while (var11.field2538 == 0) {
                class149.method1052(10L, true);
            }
        } catch (Exception var13) {
            class684.method3842(1, var13, null);
        }
        field6404++;
    }

    @OriginalMember(owner = "client!oga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 702)
    public final void focusLost(FocusEvent arg0) {
        field6420++;
        class647.field8959 = false;
    }

    @OriginalMember(owner = "client!oga", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 710)
    public final void windowIconified(WindowEvent arg0) {
        field6412++;
    }

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "(I)V", line = 719)
    public synchronized void method1831(int arg0) {
        field6411++;
        if (class262.field3311 != null) {
            class262.field3311.removeFocusListener(this);
            class262.field3311.getParent().setBackground(Color.black);
            class262.field3311.getParent().remove(class262.field3311);
        }
        Container var2;
        if (class353.field4533 != null) {
            var2 = class353.field4533;
        } else if (class731.field10179 != null) {
            var2 = class731.field10179;
        } else if (class64.field900 == null) {
            var2 = class319.field4123;
        } else {
            var2 = class64.field900;
        }
        var2.setLayout(null);
        class262.field3311 = new class431(this);
        var2.add(class262.field3311);
        class262.field3311.setSize(class356.field4586, class466.field6263);
        class262.field3311.setVisible(true);
        if (class731.field10179 == var2) {
            Insets var3 = class731.field10179.getInsets();
            class262.field3311.setLocation(var3.left + class489.field6951, class288.field3772 + var3.top);
        } else {
            class262.field3311.setLocation(class489.field6951, class288.field3772);
        }
        class262.field3311.addFocusListener(this);
        class262.field3311.requestFocus();
        class430.field5752 = true;
        class647.field8959 = true;
        class10.field134 = true;
        class461.field6211 = false;
        class337.field4279 = class446.method2525(500);
        if (arg0 != 1) {
            this.method2723(-79);
        }
    }

    @OriginalMember(owner = "client!oga", name = "destroy", descriptor = "()V", line = 776)
    public final void destroy() {
        field6424++;
        if (class319.field4123 == this && !class650.field9031) {
            class713.field9904 = class446.method2525(500);
            class149.method1052(5000L, true);
            class320.field4129 = null;
            this.method2720((byte) -38, false);
        }
    }

    @OriginalMember(owner = "client!oga", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)V")
    public abstract void method1819(boolean arg0);

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)V")
    public abstract void method1829(int arg0);

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "(I)V")
    public abstract void method1822(int arg0);

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "(B)V")
    public abstract void method1820(byte arg0);

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "(B)V")
    public abstract void method1834(byte arg0);
}
