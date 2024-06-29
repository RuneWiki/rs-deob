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

@OriginalClass("client!td")
public abstract class class208 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Z")
    private boolean field3889 = false;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3879 = 2;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lqe;")
    public static class179 field3890 = class206.method1380("Spieler kann nicht gefunden werden: ", (byte) -128);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Z")
    public static boolean field3880 = false;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Leb;")
    public static class46 field3883;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Lae;")
    public static class6 field3895;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Z")
    public static boolean field3917;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "Z")
    public static boolean field3918;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lqe;")
    public static final class179 method1387(int arg0, int arg1) {
        field3899++;
        if (arg0 > arg1) {
            return class78.method502((byte) -88, new class179[] { class40.field871, class148.method949((byte) -14, arg1), class180.field3343 });
        } else if (arg1 < 10000000) {
            return class78.method502((byte) -119, new class179[] { class23.field566, class148.method949((byte) -14, arg1 / 1000), class194.field3602, class180.field3343 });
        } else {
            return class78.method502((byte) -119, new class179[] { class195.field3631, class148.method949((byte) -14, arg1 / 1000000), class164.field2973, class180.field3343 });
        }
    }

    @OriginalMember(owner = "client!td", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3905++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method1388(int arg0) {
        if (arg0 != 4878) {
            field3890 = null;
        }
        field3883 = null;
        field3895 = null;
        field3890 = null;
    }

    @OriginalMember(owner = "client!td", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3915++;
        if (class44.field957 == this && !class7.field233) {
            class215.field3982 = class80.method504(-1);
            class137.method873(5000L, -967787128);
            class217.field4017 = null;
            this.method1389(111, false);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
    private final void method1389(int arg0, boolean arg1) {
        field3898++;
        synchronized (this) {
            if (class7.field233) {
                return;
            }
            if (arg0 <= 38) {
                return;
            }
            class7.field233 = true;
        }
        if (class25.field588.field7 != null) {
            class25.field588.field7.destroy();
        }
        if (class81.field1571 != null) {
            try {
                class81.field1571.removeFocusListener(this);
                Container var4;
                if (class78.field1523 == null) {
                    var4 = class25.field588.field7;
                } else {
                    var4 = class78.field1523;
                }
                var4.remove(class81.field1571);
            } catch (Exception var12) {
            }
        }
        try {
            this.method208(497);
        } catch (Exception var11) {
        }
        if (class25.field588 != null) {
            try {
                class25.field588.method9(14336);
            } catch (Exception var10) {
            }
        }
        this.method216(88);
        if (class78.field1523 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!td", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3900++;
    }

    @OriginalMember(owner = "client!td", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3891++;
        class16.field437 = true;
        class18.field473 = true;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public abstract void method217(int arg0);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public abstract void method208(int arg0);

    @OriginalMember(owner = "client!td", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3902++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method1390(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field3903++;
        if (arg6 != -1) {
            field3890 = null;
        }
        try {
            class238.field4392 = arg1;
            class102.field1962 = arg4;
            class44.field957 = this;
            class216.field4001 = arg0;
            class78.field1523 = new Frame();
            class78.field1523.setTitle("Jagex");
            class78.field1523.setResizable(false);
            class78.field1523.addWindowListener(this);
            class78.field1523.setVisible(true);
            class78.field1523.toFront();
            Insets var8 = class78.field1523.getInsets();
            class78.field1523.setSize(arg4 + var8.right + var8.left, var8.bottom + arg0 + var8.top);
            class217.field4017 = class25.field588 = new class1(true, null, arg3, arg2, arg5);
            class25.field588.method8(0, this, 1);
        } catch (Exception var10) {
            class214.method1406(null, true, var10);
        }
    }

    @OriginalMember(owner = "client!td", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3907++;
    }

    @OriginalMember(owner = "client!td", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3885++;
        if (class78.field1523 == null) {
            return class25.field588 == null || class25.field588.field7 == this ? super.getParameter(arg0) : class25.field588.field7.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3881++;
        class16.field437 = false;
    }

    @OriginalMember(owner = "client!td", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static final void method1391(byte arg0) {
        class205.field3838 = new class36();
        field3908++;
        if (arg0 != 57) {
            field3883 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    private final void method1392(boolean arg0) {
        field3892++;
        long var2 = class80.method504(-1);
        long var4 = class189.field3521[class163.field2948];
        class189.field3521[class163.field2948] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class163.field2948 = class163.field2948 + 1 & 0x1F;
        synchronized (this) {
            class97.field1825 = class16.field437;
            if (!arg0) {
                field3879 = -14;
            }
        }
        this.method212(-6377);
    }

    @OriginalMember(owner = "client!td", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3914++;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)Z")
    public final boolean method1393(int arg0) {
        field3884++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 != 48) {
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
                this.method1397("invalidhost", arg0 ^ 0x7D30);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    public abstract void method212(int arg0);

    @OriginalMember(owner = "client!td", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3910++;
        if (class78.field1523 == null) {
            return class25.field588 == null || class25.field588.field7 == this ? super.getDocumentBase() : class25.field588.field7.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
    public final void method1394(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3897++;
        try {
            if (class44.field957 != null) {
                class135.field2503++;
                if (class135.field2503 >= 3) {
                    this.method1397("alreadyloaded", arg1 + 14515);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class102.field1962 = arg0;
            class238.field4392 = arg2;
            class44.field957 = this;
            class216.field4001 = arg4;
            if (class25.field588 == null) {
                class217.field4017 = class25.field588 = new class1(false, this, arg3, null, 0);
            }
            class25.field588.method8(0, this, 1);
        } catch (Exception var7) {
            class214.method1406(null, true, var7);
            this.method1397("crash", 32000);
        }
        if (arg1 != 17485) {
            field3880 = true;
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    public abstract void method216(int arg0);

    @OriginalMember(owner = "client!td", name = "stop", descriptor = "()V")
    public final void stop() {
        field3904++;
        if (class44.field957 == this && !class7.field233) {
            class215.field3982 = class80.method504(-1) + 4000L;
        }
    }

    @OriginalMember(owner = "client!td", name = "start", descriptor = "()V")
    public final void start() {
        field3888++;
        if (class44.field957 == this && !class7.field233) {
            class215.field3982 = 0L;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    private final void method1395(int arg0) {
        field3911++;
        long var2 = class80.method504(-1);
        long var4 = class206.field3852[class124.field2288];
        class206.field3852[class124.field2288] = var2;
        int var6 = -122 % ((5 - arg0) / 57);
        if (var4 != 0L && var2 > var4) {
            int var7 = (int) (var2 - var4);
            class149.field2689 = ((var7 >> 1) + 32000) / var7;
        }
        class124.field2288 = class124.field2288 + 1 & 0x1F;
        if (class30.field662++ > 50) {
            class18.field473 = true;
            class30.field662 -= 50;
            class81.field1571.setSize(class102.field1962, class216.field4001);
            class81.field1571.setVisible(true);
            if (class78.field1523 == null) {
                class81.field1571.setLocation(0, 0);
            } else {
                Insets var8 = class78.field1523.getInsets();
                class81.field1571.setLocation(var8.left, var8.top);
            }
        }
        this.method217(-94);
    }

    @OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
    public final void run() {
        field3886++;
        try {
            if (class1.field13 != null) {
                String var1 = class1.field13.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class1.field12;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1397("wrongjava", 32000);
                        return;
                    }
                    class141.field2585 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class1.field12 == null || class1.field12.equals("1.4.2"))) {
                    this.method1397("wrongjava", 32000);
                    return;
                }
            }
            if (class25.field588.field7 != null) {
                Method var3 = class1.field8;
                if (var3 != null) {
                    try {
                        var3.invoke(class25.field588.field7, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1396(false);
            class217.field4010 = class117.method761(0, class102.field1962, class81.field1571, class216.field4001);
            this.method218((byte) 102);
            class215.field3991 = class211.method1402((byte) -114);
            while (class215.field3982 == 0L || class215.field3982 > class80.method504(-1)) {
                class182.field3366 = class215.field3991.method573(-128, class49.field1064, class141.field2585);
                for (int var4 = 0; var4 < class182.field3366; var4++) {
                    this.method1392(true);
                }
                this.method1395(89);
                class93.method607(-15266, class25.field588, class81.field1571);
            }
        } catch (Exception var7) {
            class214.method1406(null, true, var7);
            this.method1397("crash", 32000);
        }
        this.method1389(85, true);
    }

    @OriginalMember(owner = "client!td", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3909++;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public abstract void method218(byte arg0);

    @OriginalMember(owner = "client!td", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3896++;
        if (class78.field1523 == null) {
            return class25.field588 == null || class25.field588.field7 == this ? super.getAppletContext() : class25.field588.field7.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
    private final synchronized void method1396(boolean arg0) {
        Container var2;
        if (class78.field1523 == null) {
            var2 = class25.field588.field7;
        } else {
            var2 = class78.field1523;
        }
        if (class81.field1571 != null) {
            class81.field1571.removeFocusListener(this);
            var2.remove(class81.field1571);
        }
        field3906++;
        class81.field1571 = new class182(this);
        var2.add(class81.field1571);
        class81.field1571.setSize(class102.field1962, class216.field4001);
        if (arg0) {
            field3895 = null;
        }
        class81.field1571.setVisible(true);
        if (class78.field1523 == null) {
            class81.field1571.setLocation(0, 0);
        } else {
            Insets var3 = class78.field1523.getInsets();
            class81.field1571.setLocation(var3.left, var3.top);
        }
        class81.field1571.addFocusListener(this);
        class81.field1571.requestFocus();
        class18.field473 = true;
        class207.field3870 = class80.method504(-1);
    }

    @OriginalMember(owner = "client!td", name = "providesignlink", descriptor = "(La;)V")
    public static final void providesignlink(class1 arg0) {
        class25.field588 = arg0;
        class217.field4017 = arg0;
        field3878++;
    }

    @OriginalMember(owner = "client!td", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3882++;
    }

    @OriginalMember(owner = "client!td", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3894++;
        if (class78.field1523 == null) {
            return class25.field588 == null || class25.field588.field7 == this ? super.getCodeBase() : class25.field588.field7.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3901++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1397(String arg0, int arg1) {
        field3893++;
        if (this.field3889) {
            return;
        }
        this.field3889 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
            if (arg1 != 32000) {
                this.stop();
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!td", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3887++;
        if (class44.field957 != this || class7.field233) {
            return;
        }
        class18.field473 = true;
        if (class1.field12 == null || !class1.field12.startsWith("1.5") || class80.method504(-1) - class207.field3870 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        boolean var10000;
        if (var2 == null || class102.field1962 <= var2.width && var2.height >= class216.field4001) {
            var10000 = true;
        } else {
            var10000 = false;
        }
    }
}
