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

@OriginalClass("client!bda")
public abstract class class441 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "Z")
    private boolean field6188 = false;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "Z")
    private boolean field6208 = false;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!bda", name = "G", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!bda", name = "H", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!bda", name = "I", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!bda", name = "J", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!bda", name = "M", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!bda", name = "N", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!bda", name = "P", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!bda", name = "T", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!bda", name = "U", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!bda", name = "V", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!bda", name = "W", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!bda", name = "X", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!bda", name = "K", descriptor = "Z")
    public static boolean field6221;

    @OriginalMember(owner = "client!bda", name = "L", descriptor = "Z")
    public static boolean field6222;

    @OriginalMember(owner = "client!bda", name = "O", descriptor = "Z")
    public static boolean field6225;

    @OriginalMember(owner = "client!bda", name = "Q", descriptor = "Z")
    public static boolean field6227;

    @OriginalMember(owner = "client!bda", name = "R", descriptor = "Z")
    public static boolean field6228;

    @OriginalMember(owner = "client!bda", name = "S", descriptor = "Z")
    public static boolean field6229;

    @OriginalMember(owner = "client!bda", name = "Y", descriptor = "Z")
    public static boolean field6235;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field6209;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    private final void method2544(int arg0) {
        field6194++;
        long var2 = class557.method3157(-75);
        long var4 = class221.field2712[class72.field722];
        class221.field2712[class72.field722] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class72.field722 = class72.field722 + arg0 & 0x1F;
        synchronized (this) {
            class32.field310 = class24.field192;
        }
        this.method2547(-1892);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
    public abstract void method2545(byte arg0);

    @OriginalMember(owner = "client!bda", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field6195++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!bda", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field6193++;
        this.destroy();
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V")
    private final void method2546(int arg0) {
        field6213++;
        long var2 = class557.method3157(arg0 + 31259);
        long var4 = class173.field1937[class29.field290];
        class173.field1937[class29.field290] = var2;
        class29.field290 = class29.field290 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class359.field4816 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class44.field433++) > 50) {
            class316.field3929 = true;
            class44.field433 -= 50;
            class41.field407.setSize(class146.field1618, class338.field4244);
            class41.field407.setVisible(true);
            if (class503.field7242 != null && class619.field8759 == null) {
                Insets var7 = class503.field7242.getInsets();
                class41.field407.setLocation(class5.field57 + var7.left, class434.field6130 + var7.top);
            } else {
                class41.field407.setLocation(class5.field57, class434.field6130);
            }
        }
        if (arg0 == -31356) {
            this.method2555(-102);
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
    public abstract void method2547(int arg0);

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
    public abstract void method2548(byte arg0);

    @OriginalMember(owner = "client!bda", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field6214++;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)Z")
    public static final boolean method2549(int arg0, int arg1) {
        if (arg0 > -8) {
            field6217 = 81;
        }
        field6192++;
        return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!bda", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class24.field192 = false;
        field6212++;
    }

    @OriginalMember(owner = "client!bda", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field6207++;
    }

    @OriginalMember(owner = "client!bda", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field6204++;
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V")
    public abstract void method2550(byte arg0);

    @OriginalMember(owner = "client!bda", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field6189++;
    }

    @OriginalMember(owner = "client!bda", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field6190++;
        if (class503.field7242 == null) {
            return class591.field8347 == null || class591.field8347 == this ? super.getParameter(arg0) : class591.field8347.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)V")
    public synchronized void method2551(boolean arg0) {
        if (class41.field407 != null) {
            class41.field407.removeFocusListener(this);
            class41.field407.getParent().setBackground(Color.black);
            class41.field407.getParent().remove(class41.field407);
        }
        field6220++;
        Container var2;
        if (class619.field8759 != null) {
            var2 = class619.field8759;
        } else if (class503.field7242 != null) {
            var2 = class503.field7242;
        } else if (class591.field8347 == null) {
            var2 = class188.field2161;
        } else {
            var2 = class591.field8347;
        }
        var2.setLayout(null);
        class41.field407 = new class694(this);
        var2.add(class41.field407);
        class41.field407.setSize(class146.field1618, class338.field4244);
        class41.field407.setVisible(true);
        if (class503.field7242 == var2) {
            Insets var3 = class503.field7242.getInsets();
            class41.field407.setLocation(class5.field57 + var3.left, class434.field6130 + var3.top);
        } else {
            class41.field407.setLocation(class5.field57, class434.field6130);
        }
        class41.field407.addFocusListener(this);
        class41.field407.requestFocus();
        class24.field192 = true;
        class32.field310 = arg0;
        class316.field3929 = true;
        class626.field8845 = false;
        class477.field6873 = class557.method3157(-56);
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)V")
    public static void method2552(boolean arg0) {
        field6209 = null;
        if (!arg0) {
            provideLoaderApplet(null);
        }
    }

    @OriginalMember(owner = "client!bda", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        field6185++;
        class591.field8347 = arg0;
    }

    @OriginalMember(owner = "client!bda", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field6218++;
        if (class188.field2161 != this || class13.field114) {
            return;
        }
        class316.field3929 = true;
        if (class528.field7443 && class557.method3157(-55) - class477.field6873 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class338.field4245 <= var2.width && class533.field7491 <= var2.height) {
                class626.field8845 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(B)Z")
    public final boolean method2553(byte arg0) {
        if (arg0 < 89) {
            this.destroy();
        }
        field6216++;
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
                this.method2561((byte) -33, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(I)Z")
    public final boolean method2554(int arg0) {
        if (arg0 <= 109) {
            this.field6188 = false;
        }
        field6200++;
        return class166.method908("jagmisc", (byte) 101);
    }

    @OriginalMember(owner = "client!bda", name = "stop", descriptor = "()V")
    public final void stop() {
        field6197++;
        if (class188.field2161 == this && !class13.field114) {
            class91.field913 = class557.method3157(-116) + 4000L;
        }
    }

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(I)V")
    public abstract void method2555(int arg0);

    @OriginalMember(owner = "client!bda", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field6203++;
        if (class503.field7242 == null) {
            return class591.field8347 == null || class591.field8347 == this ? super.getAppletContext() : class591.field8347.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method2556(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field6205++;
        try {
            if (arg2 == -29341) {
                if (class188.field2161 == null) {
                    class434.field6130 = 0;
                    class205.field2428 = class591.field8347;
                    class338.field4244 = arg0;
                    class533.field7491 = arg0;
                    class106.field1139 = arg4;
                    class5.field57 = 0;
                    class188.field2161 = this;
                    class146.field1618 = arg1;
                    class338.field4245 = arg1;
                    class334.field4184 = class353.field4757 = new class464(arg5, arg3, arg6, class591.field8347 != null);
                    class88 var8 = class353.field4757.method2668(this, 1, -103);
                    while (var8.field884 == 0) {
                        class452.method2602(10L, (byte) -97);
                    }
                } else {
                    class616.field8688++;
                    if (class616.field8688 >= 3) {
                        this.method2561((byte) -24, "alreadyloaded");
                    } else {
                        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    }
                }
            }
        } catch (Throwable var10) {
            class333.method1923(var10, true, null);
            this.method2561((byte) -31, "crash");
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZ)V")
    private final void method2557(int arg0, boolean arg1) {
        field6210++;
        synchronized (this) {
            if (class13.field114) {
                return;
            }
            class13.field114 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class591.field8347 != null) {
            class591.field8347.destroy();
        }
        try {
            this.method2548((byte) -83);
        } catch (Exception var9) {
        }
        if (this.field6208) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field6208 = false;
        }
        class402.method2263(true, -83);
        class226.method1363(64);
        if (class41.field407 != null) {
            try {
                class41.field407.removeFocusListener(this);
                class41.field407.getParent().remove(class41.field407);
            } catch (Exception var7) {
            }
        }
        if (class353.field4757 != null) {
            try {
                class353.field4757.method2669((byte) 84);
            } catch (Exception var6) {
            }
        }
        this.method2550((byte) 116);
        if (class503.field7242 != null) {
            class503.field7242.setVisible(false);
            class503.field7242.dispose();
            class503.field7242 = null;
        }
        if (arg0 == 0) {
            System.out.println("Shutdown complete - clean:" + arg1);
        }
    }

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(B)Z")
    public final boolean method2558(byte arg0) {
        field6206++;
        return arg0 == 4 ? class166.method908("jaclib", (byte) 127) : false;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/String;IIIBZII)V")
    public final void method2559(String arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7) {
        field6215++;
        try {
            class5.field57 = 0;
            class338.field4244 = arg6;
            class533.field7491 = arg6;
            class434.field6130 = 0;
            class106.field1139 = arg7;
            class188.field2161 = this;
            class146.field1618 = arg3;
            class338.field4245 = arg3;
            class205.field2428 = null;
            class503.field7242 = new Frame();
            class503.field7242.setTitle("Jagex");
            class503.field7242.setResizable(true);
            class503.field7242.addWindowListener(this);
            class503.field7242.setVisible(true);
            class503.field7242.toFront();
            Insets var9 = class503.field7242.getInsets();
            class503.field7242.setSize(var9.right + var9.left + class338.field4245, class533.field7491 + var9.bottom - -var9.top);
            class334.field4184 = class353.field4757 = new class464(arg1, arg0, arg2, true);
            if (arg4 <= 20) {
                this.method2550((byte) 86);
            }
            class88 var10 = class353.field4757.method2668(this, 1, 11);
            while (var10.field884 == 0) {
                class452.method2602(10L, (byte) -97);
            }
        } catch (Exception var12) {
            class333.method1923(var12, true, null);
        }
    }

    @OriginalMember(owner = "client!bda", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class24.field192 = true;
        field6211++;
        class316.field3929 = true;
    }

    @OriginalMember(owner = "client!bda", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field6186++;
        if (class188.field2161 == this && !class13.field114) {
            class91.field913 = class557.method3157(-61);
            class452.method2602(5000L, (byte) -97);
            class334.field4184 = null;
            this.method2557(0, false);
        }
    }

    @OriginalMember(owner = "client!bda", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field6202++;
        if (class503.field7242 == null) {
            return class591.field8347 == null || class591.field8347 == this ? super.getCodeBase() : class591.field8347.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field6199++;
        if (class503.field7242 == null) {
            return class591.field8347 == null || class591.field8347 == this ? super.getDocumentBase() : class591.field8347.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field6201++;
    }

    @OriginalMember(owner = "client!bda", name = "start", descriptor = "()V")
    public final void start() {
        field6196++;
        if (class188.field2161 == this && !class13.field114) {
            class91.field913 = 0L;
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public String method2560(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field6187++;
            return null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method2561(byte arg0, String arg1) {
        field6198++;
        if (this.field6188) {
            return;
        }
        if (arg0 >= -8) {
            this.windowActivated(null);
        }
        this.field6188 = true;
        System.out.println("error_game_" + arg1);
        try {
            class627.method3524("loggedout", class591.field8347, 23421);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!bda", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!bda", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field6191++;
    }

    @OriginalMember(owner = "client!bda", name = "run", descriptor = "()V")
    public final void run() {
        field6219++;
        try {
            if (class464.field6613 != null) {
                String var1 = class464.field6613.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class464.field6615;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2561((byte) -103, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class464.field6615 == null || class464.field6615.equals("1.4.2"))) {
                    this.method2561((byte) -105, "wrongjava");
                    return;
                }
            }
            if (class464.field6615 != null && class464.field6615.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class464.field6615.length() > var3) {
                    char var5 = class464.field6615.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class528.field7443 = true;
                }
            }
            Applet var6 = class188.field2161;
            if (class591.field8347 != null) {
                var6 = class591.field8347;
            }
            Method var7 = class464.field6632;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class652.method3632(false);
            class151.method820((byte) -40);
            this.method2551(true);
            this.method2545((byte) -62);
            class386.field5208 = class465.method2687(-109);
            while (class91.field913 == 0L || class91.field913 > class557.method3157(-76)) {
                class395.field5352 = class386.field5208.method375(class44.field425, 26);
                for (int var8 = 0; var8 < class395.field5352; var8++) {
                    this.method2544(1);
                }
                this.method2546(-31356);
                class496.method2868(class41.field407, (byte) 67, class353.field4757);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class333.method1923(var20, true, this.method2560(false));
            this.method2561((byte) -73, "crash");
        } finally {
            Object var13 = null;
            this.method2557(0, true);
        }
    }
}
