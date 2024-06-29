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

@OriginalClass("client!le")
public abstract class class41 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
    private boolean field653 = false;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static volatile int field661 = -1;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "[Ljd;")
    public static class85[] field666;

    @OriginalMember(owner = "client!le", name = "run", descriptor = "()V")
    public final void run() {
        field659++;
        try {
            if (class81.field1477 != null) {
                String var1 = class81.field1477.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class81.field1463;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method273("wrongjava", false);
                        return;
                    }
                    class195.field3339 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class81.field1463 == null || class81.field1463.equals("1.4.2"))) {
                    this.method273("wrongjava", false);
                    return;
                }
            }
            if (class107.field1882.field1478 != null) {
                Method var3 = class81.field1481;
                if (var3 != null) {
                    try {
                        var3.invoke(class107.field1882.field1478, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method286(5000);
            class230.field3972 = class127.method857(class254.field4389, class154.field2664, class154.field2662, -109);
            this.method274((byte) -95);
            class108.field1903 = class203.method1391((byte) -63);
            while (class83.field1525 == 0L || class28.method200(-40) < class83.field1525) {
                class249.field4296 = class108.field1903.method203((byte) -41, class25.field383, class195.field3339);
                for (int var4 = 0; var4 < class249.field4296; var4++) {
                    this.method278(-86);
                }
                this.method285(4000);
                class74.method526(class107.field1882, class254.field4389, 90);
            }
        } catch (Exception var7) {
            class201.method1379(var7, (String) null, 2552);
            this.method273("crash", false);
        }
        this.method279(false, true);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method273(String arg0, boolean arg1) {
        field663++;
        if (this.field653) {
            return;
        }
        this.field653 = true;
        System.out.println("error_game_" + arg0);
        if (arg1) {
            this.field653 = false;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public abstract void method274(byte arg0);

    @OriginalMember(owner = "client!le", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field650++;
        if (class167.field2882 == null) {
            return class107.field1882 == null || class107.field1882.field1478 == this ? super.getParameter(arg0) : class107.field1882.field1478.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "stop", descriptor = "()V")
    public final void stop() {
        field648++;
        if (class185.field3165 == this && !class197.field3381) {
            class83.field1525 = class28.method200(-90) + 4000L;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIZ)V")
    public final void method275(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field674++;
        try {
            if (class185.field3165 == null) {
                class106.field1879 = 0;
                class90.field1668 = 0;
                class154.field2664 = arg1;
                class20.field292 = arg1;
                class94.field1712 = arg0;
                class185.field3165 = this;
                if (!arg4) {
                    class154.field2662 = arg3;
                    class95.field1744 = arg3;
                    String var6 = this.getParameter("openwinjs");
                    boolean var10000;
                    if (var6 != null && var6.equals("1")) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                    if (class107.field1882 == null) {
                        class104.field1835 = class107.field1882 = new class81(false, this, arg2, (String) null, 0);
                    }
                    class107.field1882.method555(-26915, 1, this);
                }
            } else {
                class156.field2681++;
                if (class156.field2681 >= 3) {
                    this.method273("alreadyloaded", arg4);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class201.method1379(var8, (String) null, 2552);
            this.method273("crash", arg4);
        }
    }

    @OriginalMember(owner = "client!le", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field655++;
        if (class185.field3165 != this || class197.field3381) {
            return;
        }
        class111.field1948 = true;
        if (class81.field1463 != null && class81.field1463.startsWith("1.5") && class28.method200(104) - class117.field2089 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class20.field292 <= var2.width && var2.height >= class95.field1744) {
                class168.field2894 = true;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!le", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field675++;
        if (class185.field3165 == this && !class197.field3381) {
            class83.field1525 = class28.method200(-78);
            class190.method1311(5000L, 1);
            class104.field1835 = null;
            this.method279(false, false);
        }
    }

    @OriginalMember(owner = "client!le", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field660++;
        if (class167.field2882 == null) {
            return class107.field1882 == null || class107.field1882.field1478 == this ? super.getCodeBase() : class107.field1882.field1478.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "providesignlink", descriptor = "(Lb;)V")
    public static final void providesignlink(class81 arg0) {
        field667++;
        class107.field1882 = arg0;
        class104.field1835 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method276(int arg0) {
        if (arg0 == -26012) {
            field666 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method277(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class94.field1712 = arg4;
            class154.field2664 = arg6;
            class20.field292 = arg6;
            class154.field2662 = arg0;
            class95.field1744 = arg0;
            int var8 = -118 / ((56 - arg3) / 43);
            class90.field1668 = 0;
            class185.field3165 = this;
            class106.field1879 = 0;
            class167.field2882 = new Frame();
            class167.field2882.setTitle("Jagex");
            class167.field2882.setResizable(true);
            class167.field2882.addWindowListener(this);
            class167.field2882.setVisible(true);
            class167.field2882.toFront();
            Insets var9 = class167.field2882.getInsets();
            class167.field2882.setSize(class20.field292 + var9.left + var9.right, class95.field1744 - -var9.top - -var9.bottom);
            class104.field1835 = class107.field1882 = new class81(true, (Applet) null, arg5, arg2, arg1);
            class107.field1882.method555(-26915, 1, this);
        } catch (Exception var11) {
            class201.method1379(var11, (String) null, 2552);
        }
        field652++;
    }

    @OriginalMember(owner = "client!le", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field657++;
        if (class167.field2882 == null) {
            return class107.field1882 == null || class107.field1882.field1478 == this ? super.getAppletContext() : class107.field1882.field1478.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field669++;
        if (class167.field2882 == null) {
            return class107.field1882 == null || class107.field1882.field1478 == this ? super.getDocumentBase() : class107.field1882.field1478.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field654++;
    }

    @OriginalMember(owner = "client!le", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field672++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    private final void method278(int arg0) {
        long var2 = class28.method200(127);
        long var4 = class153.field2637[class169.field2908];
        int var6 = 70 % ((50 - arg0) / 55);
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class153.field2637[class169.field2908] = var2;
        field647++;
        class169.field2908 = class169.field2908 + 1 & 0x1F;
        synchronized (this) {
            class8.field102 = class240.field4139;
        }
        this.method281((byte) 22);
    }

    @OriginalMember(owner = "client!le", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field656++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZ)V")
    private final void method279(boolean arg0, boolean arg1) {
        if (arg0) {
            return;
        }
        field670++;
        synchronized (this) {
            if (class197.field3381) {
                return;
            }
            class197.field3381 = true;
        }
        if (class107.field1882.field1478 != null) {
            class107.field1882.field1478.destroy();
        }
        try {
            this.method280(!arg0);
        } catch (Exception var9) {
        }
        if (class254.field4389 != null) {
            try {
                class254.field4389.removeFocusListener(this);
                class254.field4389.getParent().remove(class254.field4389);
            } catch (Exception var8) {
            }
        }
        if (class107.field1882 != null) {
            try {
                class107.field1882.method561(0);
            } catch (Exception var7) {
            }
        }
        this.method283((byte) -96);
        if (class167.field2882 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public abstract void method280(boolean arg0);

    @OriginalMember(owner = "client!le", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field658++;
    }

    @OriginalMember(owner = "client!le", name = "start", descriptor = "()V")
    public final void start() {
        field676++;
        if (class185.field3165 == this && !class197.field3381) {
            class83.field1525 = 0L;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public abstract void method281(byte arg0);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public abstract void method282(int arg0);

    @OriginalMember(owner = "client!le", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field671++;
        class240.field4139 = true;
        class111.field1948 = true;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V")
    public abstract void method283(byte arg0);

    @OriginalMember(owner = "client!le", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field665++;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Z")
    public final boolean method284(int arg0) {
        field649++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 != 0) {
            this.method286(-41);
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
                this.method273("invalidhost", false);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field677++;
    }

    @OriginalMember(owner = "client!le", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field673++;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
    private final void method285(int arg0) {
        long var2 = class28.method200(117);
        field662++;
        long var4 = class190.field3257[class112.field1955];
        class190.field3257[class112.field1955] = var2;
        if (arg0 != 4000) {
            this.method278(120);
        }
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class131.field2283 = ((var6 >> 1) + 32000) / var6;
        }
        class112.field1955 = class112.field1955 + 1 & 0x1F;
        if ((class255.field4498++) > 50) {
            class111.field1948 = true;
            class255.field4498 -= 50;
            class254.field4389.setSize(class154.field2664, class154.field2662);
            class254.field4389.setVisible(true);
            if (class167.field2882 != null && class207.field3620 == null) {
                Insets var7 = class167.field2882.getInsets();
                class254.field4389.setLocation(class90.field1668 + var7.left, var7.top - -class106.field1879);
            } else {
                class254.field4389.setLocation(class90.field1668, class106.field1879);
            }
        }
        this.method282(26646);
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
    public final synchronized void method286(int arg0) {
        field651++;
        if (class254.field4389 != null) {
            class254.field4389.removeFocusListener(this);
            class254.field4389.getParent().remove(class254.field4389);
        }
        Container var2;
        if (class207.field3620 != null) {
            var2 = class207.field3620;
        } else if (class167.field2882 == null) {
            var2 = class107.field1882.field1478;
        } else {
            var2 = class167.field2882;
        }
        var2.setLayout((LayoutManager) null);
        class254.field4389 = new class162(this);
        var2.add(class254.field4389);
        class254.field4389.setSize(class154.field2664, class154.field2662);
        class254.field4389.setVisible(true);
        if (arg0 != 5000) {
            return;
        }
        if (class167.field2882 == var2) {
            Insets var3 = class167.field2882.getInsets();
            class254.field4389.setLocation(class90.field1668 + var3.left, var3.top - -class106.field1879);
        } else {
            class254.field4389.setLocation(class90.field1668, class106.field1879);
        }
        class254.field4389.addFocusListener(this);
        class254.field4389.requestFocus();
        class240.field4139 = true;
        class8.field102 = true;
        class111.field1948 = true;
        class168.field2894 = false;
        class117.field2089 = class28.method200(arg0 - 4873);
    }

    @OriginalMember(owner = "client!le", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field664++;
    }

    @OriginalMember(owner = "client!le", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class240.field4139 = false;
        field668++;
    }
}
