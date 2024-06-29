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

@OriginalClass("client!eb")
public abstract class class39 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Z")
    private boolean field859 = false;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lea;")
    public static class38 field841 = class9.method46((byte) 109, "huffman");

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Lea;")
    private static class38 field862 = class9.method46((byte) 115, "flash2:");

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lea;")
    public static class38 field842 = field862;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field851 = 0;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field846 = 0;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "[Lja;")
    public static class81[] field874 = new class81[4];

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "[I")
    public static int[] field868 = new int[1000];

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Lea;")
    public static class38 field873 = field862;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "Lfd;")
    public static class50 field876;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "Z")
    public static boolean field881;

    @OriginalMember(owner = "client!eb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field867++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    private final void method286(int arg0) {
        field864++;
        if (arg0 < 37) {
            this.paint(null);
        }
        long var2 = class166.method1184((byte) -80);
        long var4 = class4.field124[class197.field3881];
        class4.field124[class197.field3881] = var2;
        class197.field3881 = class197.field3881 + 1 & 0x1F;
        synchronized (this) {
            class183.field3664 = class194.field3819;
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        this.method158((byte) -98);
    }

    @OriginalMember(owner = "client!eb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field875++;
    }

    @OriginalMember(owner = "client!eb", name = "stop", descriptor = "()V")
    public final void stop() {
        field845++;
        if (class66.field1588 == this && !class46.field1122) {
            class4.field117 = class166.method1184((byte) -80) + 4000L;
        }
    }

    @OriginalMember(owner = "client!eb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field839++;
        if (class96.field2151 == null) {
            return class186.field3708 == null || class186.field3708.field2772 == this ? super.getDocumentBase() : class186.field3708.field2772.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Z")
    public final boolean method287(int arg0) {
        field869++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 11641) {
                this.windowOpened(null);
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
                this.method288("invalidhost", arg0 ^ 0x2D78);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field879++;
        if (class96.field2151 == null) {
            return class186.field3708 == null || class186.field3708.field2772 == this ? super.getParameter(arg0) : class186.field3708.field2772.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class194.field3819 = false;
        field863++;
    }

    @OriginalMember(owner = "client!eb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field871++;
    }

    @OriginalMember(owner = "client!eb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field844++;
        if (class96.field2151 == null) {
            return class186.field3708 == null || class186.field3708.field2772 == this ? super.getAppletContext() : class186.field3708.field2772.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method288(String arg0, int arg1) {
        field848++;
        if (this.field859) {
            return;
        }
        this.field859 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != 1) {
                this.windowOpened(null);
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIB)V")
    public final void method289(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field865++;
        try {
            if (class66.field1588 == null) {
                class117.field2554 = arg1;
                class172.field3528 = arg3;
                class197.field3878 = arg0;
                if (arg4 != -17) {
                    this.windowDeactivated(null);
                }
                class66.field1588 = this;
                if (class186.field3708 == null) {
                    class113.field2523 = class186.field3708 = new class129(false, this, arg2, null, 0);
                }
                class186.field3708.method953(this, 1, (byte) 65);
            } else {
                class3.field103++;
                if (class3.field103 >= 3) {
                    this.method288("alreadyloaded", 1);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class17.method95(arg4 ^ 0x63, null, var7);
            this.method288("crash", 1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field870++;
        if (class96.field2151 == null) {
            return class186.field3708 == null || class186.field3708.field2772 == this ? super.getCodeBase() : class186.field3708.field2772.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field880++;
    }

    @OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
    public final void run() {
        field854++;
        try {
            if (class129.field2766 != null) {
                String var1 = class129.field2766.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class129.field2760;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method288("wrongjava", 1);
                        return;
                    }
                    class199.field3935 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class129.field2760 == null || class129.field2760.equals("1.4.2"))) {
                    this.method288("wrongjava", 1);
                    return;
                }
            }
            if (class186.field3708.field2772 != null) {
                Method var3 = class129.field2771;
                if (var3 != null) {
                    try {
                        var3.invoke(class186.field3708.field2772, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method295((byte) 69);
            class57.field1443 = class40.method302(class172.field3528, class117.field2554, (byte) 88, class51.field1313);
            this.method157((byte) -89);
            class193.field3809 = class67.method537(121);
            while (class4.field117 == 0L || class166.method1184((byte) -80) < class4.field117) {
                class124.field2669 = class193.field3809.method926(class199.field3935, (byte) 119, class97.field2169);
                for (int var4 = 0; var4 < class124.field2669; var4++) {
                    this.method286(60);
                }
                this.method296(-10949);
                class202.method1328((byte) -86, class51.field1313, class186.field3708);
            }
        } catch (Exception var7) {
            class17.method95(-113, null, var7);
            this.method288("crash", 1);
        }
        this.method294(0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public abstract void method157(byte arg0);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public abstract void method158(byte arg0);

    @OriginalMember(owner = "client!eb", name = "start", descriptor = "()V")
    public final void start() {
        field852++;
        if (class66.field1588 == this && !class46.field1122) {
            class4.field117 = 0L;
        }
    }

    @OriginalMember(owner = "client!eb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field843++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;IIIIIB)V")
    public final void method290(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        try {
            class172.field3528 = arg5;
            class197.field3878 = arg4;
            if (arg6 > -66) {
                return;
            }
            class66.field1588 = this;
            class117.field2554 = arg1;
            class96.field2151 = new Frame();
            class96.field2151.setTitle("Jagex");
            class96.field2151.setResizable(false);
            class96.field2151.addWindowListener(this);
            class96.field2151.setVisible(true);
            class96.field2151.toFront();
            Insets var8 = class96.field2151.getInsets();
            class96.field2151.setSize(var8.right + var8.left + arg5, var8.top + var8.bottom + arg1);
            class113.field2523 = class186.field3708 = new class129(true, null, arg3, arg0, arg2);
            class186.field3708.method953(this, 1, (byte) 65);
        } catch (Exception var10) {
            class17.method95(-92, null, var10);
        }
        field857++;
    }

    @OriginalMember(owner = "client!eb", name = "providesignlink", descriptor = "(Lod;)V")
    public static final void providesignlink(class129 arg0) {
        field860++;
        class186.field3708 = arg0;
        class113.field2523 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field853++;
        if (class66.field1588 == this && !class46.field1122) {
            class4.field117 = class166.method1184((byte) -80);
            class132.method969(5000L, (byte) 58);
            class113.field2523 = null;
            this.method294(0);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ldd;BLdd;)V")
    public static final void method291(class32 arg0, byte arg1, class32 arg2) {
        if (arg1 != 93) {
            method291(null, (byte) -4, null);
        }
        class172.field3524 = arg0;
        class30.field592 = arg2;
        field840++;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public abstract void method165(int arg0);

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public static void method292(int arg0) {
        field841 = null;
        field874 = null;
        int var1 = 39 % ((-arg0 - 51) / 49);
        field873 = null;
        field876 = null;
        field862 = null;
        field868 = null;
        field842 = null;
    }

    @OriginalMember(owner = "client!eb", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public abstract void method163(int arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static final void method293(boolean arg0) {
        field877++;
        if (class50.field1244[98]) {
            class54.field1377 += (12 - class54.field1377) / 2;
        } else if (class50.field1244[99]) {
            class54.field1377 += (-class54.field1377 - 12) / 2;
        } else {
            class54.field1377 /= 2;
        }
        class177.field3596 += class54.field1377 / 2;
        if (class50.field1244[96]) {
            class42.field927 += (-class42.field927 - 24) / 2;
        } else if (class50.field1244[97]) {
            class42.field927 += (24 - class42.field927) / 2;
        } else {
            class42.field927 /= 2;
        }
        if (arg0) {
            return;
        }
        int var1 = class84.field1984 + class195.field3842.field406;
        if (class177.field3596 < 128) {
            class177.field3596 = 128;
        }
        if (class177.field3596 > 383) {
            class177.field3596 = 383;
        }
        class114.field2534 = class42.field927 / 2 + class114.field2534 & 0x7FF;
        int var2 = class195.field3842.field382 + class148.field3081;
        if (class119.field2575 - var1 < -500 || class119.field2575 - var1 > 500 || class148.field3079 - var2 < -500 || class148.field3079 - var2 > 500) {
            class148.field3079 = var2;
            class119.field2575 = var1;
        }
        int var3 = 0;
        if (class148.field3079 != var2) {
            class148.field3079 += (var2 - class148.field3079) / 16;
        }
        if (class119.field2575 != var1) {
            class119.field2575 += (var1 - class119.field2575) / 16;
        }
        int var4 = class119.field2575 >> 7;
        int var5 = class148.field3079 >> 7;
        int var6 = class38.method257(class10.field224, -169496123, class148.field3079, class119.field2575);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class10.field224;
                    if (var9 < 3 && (class3.field104[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class154.field3209[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class70.field1737 < var11) {
            class70.field1737 += (var11 - class70.field1737) / 24;
        } else if (class70.field1737 > var11) {
            class70.field1737 += (var11 - class70.field1737) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!eb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field856++;
    }

    @OriginalMember(owner = "client!eb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field849++;
        if (class66.field1588 != this || class46.field1122) {
            return;
        }
        class11.field235 = true;
        if (class129.field2760 != null && class129.field2760.startsWith("1.5") && class166.method1184((byte) -80) - class126.field2702 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class172.field3528 <= var2.width && var2.height >= class117.field2554) {
                class151.field3124 = true;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field861++;
        class194.field3819 = true;
        class11.field235 = true;
    }

    @OriginalMember(owner = "client!eb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field847++;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    public abstract void method162(int arg0);

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
    private final synchronized void method294(int arg0) {
        field872++;
        if (class46.field1122) {
            return;
        }
        class46.field1122 = true;
        if (arg0 != 0) {
            return;
        }
        try {
            class51.field1313.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method162(-14749);
        } catch (Exception var4) {
        }
        if (class96.field2151 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class186.field3708 != null) {
            try {
                class186.field3708.method959((byte) -111);
            } catch (Exception var2) {
            }
        }
        this.method163(43594);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
    public final synchronized void method295(byte arg0) {
        Container var2;
        if (class96.field2151 == null) {
            var2 = class186.field3708.field2772;
        } else {
            var2 = class96.field2151;
        }
        if (class51.field1313 != null) {
            class51.field1313.removeFocusListener(this);
            var2.remove(class51.field1313);
        }
        class51.field1313 = new class80(this);
        field878++;
        var2.add(class51.field1313);
        class51.field1313.setSize(class172.field3528, class117.field2554);
        class51.field1313.setVisible(true);
        if (class96.field2151 == null) {
            class51.field1313.setLocation(0, 0);
        } else {
            Insets var3 = class96.field2151.getInsets();
            class51.field1313.setLocation(var3.left, var3.top);
        }
        class51.field1313.addFocusListener(this);
        class51.field1313.requestFocus();
        class11.field235 = true;
        int var4 = 114 / ((7 - arg0) / 37);
        class151.field3124 = false;
        class126.field2702 = class166.method1184((byte) -80);
    }

    @OriginalMember(owner = "client!eb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field855++;
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)V")
    private final void method296(int arg0) {
        long var2 = class23.field496[class154.field3206];
        if (arg0 != -10949) {
            this.method163(82);
        }
        field866++;
        long var4 = class166.method1184((byte) -80);
        class23.field496[class154.field3206] = var4;
        class154.field3206 = class154.field3206 + 1 & 0x1F;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            field851 = ((var6 >> 1) + 32000) / var6;
        }
        if (class5.field148++ > 50) {
            class11.field235 = true;
            class5.field148 -= 50;
            class51.field1313.setSize(class172.field3528, class117.field2554);
            class51.field1313.setVisible(true);
            if (class96.field2151 == null) {
                class51.field1313.setLocation(0, 0);
            } else {
                Insets var7 = class96.field2151.getInsets();
                class51.field1313.setLocation(var7.left, var7.top);
            }
        }
        this.method165(22001);
    }
}
