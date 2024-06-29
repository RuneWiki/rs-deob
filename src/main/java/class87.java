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

@OriginalClass("client!hj")
public abstract class class87 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "Z")
    private boolean field1582 = false;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "S")
    public static short field1578 = 1;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Li;")
    public static class88 field1573 = class208.method1425(105, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "Li;")
    private static class88 field1590 = class208.method1425(105, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "Li;")
    public static class88 field1591 = field1590;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    private static int field1575 = 500;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field1581 = -1;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Loc;")
    public static class155 field1572 = new class155(0, 0);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "[[S")
    public static short[][] field1596;

    @OriginalMember(owner = "client!hj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1564++;
        this.destroy();
    }

    @OriginalMember(owner = "client!hj", name = "start", descriptor = "()V")
    public final void start() {
        field1558++;
        if (class55.field1032 == this && !class48.field909) {
            class35.field602 = 0L;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public abstract void method225(int arg0);

    @OriginalMember(owner = "client!hj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1577++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILq;)Lq;")
    public static final class174 method583(int arg0, class174 arg1) {
        field1595++;
        int var2 = class17.method81((byte) -98, class80.method530(-881710560, arg1));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = arg0; var3 < var2; var3++) {
            arg1 = class239.method1581(-64, arg1.field3506);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class118.field2145 = false;
        field1567++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    private final void method584(byte arg0) {
        long var2 = class206.method1420(false);
        long var4 = class48.field903[class103.field1876];
        field1576++;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class48.field903[class103.field1876] = var2;
        class103.field1876 = class103.field1876 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 <= 110) {
                this.focusLost(null);
            }
            class175.field3522 = class118.field2145;
        }
        this.method222((byte) -18);
    }

    @OriginalMember(owner = "client!hj", name = "stop", descriptor = "()V")
    public final void stop() {
        field1574++;
        if (class55.field1032 == this && !class48.field909) {
            class35.field602 = class206.method1420(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!hj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1570++;
        if (class201.field3834 == null) {
            return class126.field2326 == null || class126.field2326.field3599 == this ? super.getCodeBase() : class126.field2326.field3599.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
    private final synchronized void method585(byte arg0) {
        field1571++;
        Container var2;
        if (class201.field3834 == null) {
            var2 = class126.field2326.field3599;
        } else {
            var2 = class201.field3834;
        }
        if (class154.field2977 != null) {
            class154.field2977.removeFocusListener(this);
            var2.remove(class154.field2977);
        }
        if (arg0 < 33) {
            return;
        }
        class154.field2977 = new class66(this);
        var2.add(class154.field2977);
        class154.field2977.setSize(class222.field4194, class145.field2727);
        class154.field2977.setVisible(true);
        if (class201.field3834 == null) {
            class154.field2977.setLocation(0, 0);
        } else {
            Insets var3 = class201.field3834.getInsets();
            class154.field2977.setLocation(var3.left, var3.top);
        }
        class154.field2977.addFocusListener(this);
        class154.field2977.requestFocus();
        class53.field971 = true;
        class116.field2093 = class206.method1420(false);
    }

    @OriginalMember(owner = "client!hj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1559++;
        if (class55.field1032 != this || class48.field909) {
            return;
        }
        class53.field971 = true;
        if (class181.field3593 == null || !class181.field3593.startsWith("1.5") || class206.method1420(false) - class116.field2093 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        boolean var10000;
        if (var2 == null || var2.width >= class222.field4194 && class145.field2727 <= var2.height) {
            var10000 = true;
        } else {
            var10000 = false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field1568++;
        try {
            if (arg5 != -11124) {
                field1573 = null;
            }
            class222.field4194 = arg2;
            class55.field1032 = this;
            class145.field2727 = arg1;
            class225.field4228 = arg3;
            class201.field3834 = new Frame();
            class201.field3834.setTitle("Jagex");
            class201.field3834.setResizable(false);
            class201.field3834.addWindowListener(this);
            class201.field3834.setVisible(true);
            class201.field3834.toFront();
            Insets var8 = class201.field3834.getInsets();
            class201.field3834.setSize(var8.left + arg2 + var8.right, var8.bottom + arg1 - -var8.top);
            class6.field93 = class126.field2326 = new class181(true, null, arg4, arg6, arg0);
            class126.field2326.method1289(arg5 + 11126, this, 1);
        } catch (Exception var10) {
            class221.method1490((byte) 0, null, var10);
        }
    }

    @OriginalMember(owner = "client!hj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1569++;
    }

    @OriginalMember(owner = "client!hj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1594++;
    }

    @OriginalMember(owner = "client!hj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1565++;
        if (class201.field3834 == null) {
            return class126.field2326 == null || class126.field2326.field3599 == this ? super.getAppletContext() : class126.field2326.field3599.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public abstract void method214(int arg0);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
    private final void method587(int arg0, boolean arg1) {
        field1593++;
        synchronized (this) {
            if (class48.field909) {
                return;
            }
            class48.field909 = true;
        }
        if (class126.field2326.field3599 != null) {
            class126.field2326.field3599.destroy();
        }
        if (class154.field2977 != null) {
            try {
                class154.field2977.removeFocusListener(this);
                Container var4;
                if (class201.field3834 == null) {
                    var4 = class126.field2326.field3599;
                } else {
                    var4 = class201.field3834;
                }
                var4.remove(class154.field2977);
            } catch (Exception var10) {
            }
        }
        try {
            this.method218(arg0 ^ 0x65);
        } catch (Exception var9) {
        }
        if (class126.field2326 != null) {
            try {
                class126.field2326.method1291(-108);
            } catch (Exception var8) {
            }
        }
        this.method225(100);
        if (arg0 != 0) {
            field1591 = null;
        }
        if (class201.field3834 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method588(byte arg0, String arg1) {
        field1562++;
        if (this.field1582) {
            return;
        }
        this.field1582 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 != -49) {
            this.method222((byte) 104);
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!hj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1584++;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    private final void method589(int arg0) {
        field1587++;
        long var2 = class206.method1420(false);
        long var4 = class89.field1697[class116.field2103];
        class89.field1697[class116.field2103] = var2;
        class116.field2103 = class116.field2103 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class13.field192 = ((var6 >> 1) + 32000) / var6;
        }
        if (field1575++ > 50) {
            field1575 -= 50;
            class53.field971 = true;
            class154.field2977.setSize(class222.field4194, class145.field2727);
            class154.field2977.setVisible(true);
            if (class201.field3834 == null) {
                class154.field2977.setLocation(0, 0);
            } else {
                Insets var7 = class201.field3834.getInsets();
                class154.field2977.setLocation(var7.left, var7.top);
            }
        }
        this.method220(15729);
        if (arg0 != -23496) {
            this.stop();
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    public abstract void method218(int arg0);

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public abstract void method220(int arg0);

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)Z")
    public final boolean method590(int arg0) {
        field1583++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 22541) {
                this.windowDeactivated(null);
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
                this.method588((byte) -49, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1588++;
    }

    @OriginalMember(owner = "client!hj", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
    public static void method591(int arg0) {
        field1573 = null;
        field1590 = null;
        field1596 = null;
        field1591 = null;
        field1572 = null;
        if (arg0 != 19966) {
            field1590 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "providesignlink", descriptor = "(Lqg;)V")
    public static final void providesignlink(class181 arg0) {
        field1563++;
        class126.field2326 = arg0;
        class6.field93 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1560++;
        if (class201.field3834 == null) {
            return class126.field2326 == null || class126.field2326.field3599 == this ? super.getParameter(arg0) : class126.field2326.field3599.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public static final int method592(int arg0, int arg1) {
        if (arg0 == 1281959627) {
            field1580++;
            return arg1 >> 11 & 0x3F;
        } else {
            return -47;
        }
    }

    @OriginalMember(owner = "client!hj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1585++;
    }

    @OriginalMember(owner = "client!hj", name = "run", descriptor = "()V")
    public final void run() {
        field1561++;
        try {
            if (class181.field3596 != null) {
                String var1 = class181.field3596.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class181.field3593;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method588((byte) -49, "wrongjava");
                        return;
                    }
                    class130.field2444 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class181.field3593 == null || class181.field3593.equals("1.4.2"))) {
                    this.method588((byte) -49, "wrongjava");
                    return;
                }
            }
            if (class126.field2326.field3599 != null) {
                Method var3 = class181.field3583;
                if (var3 != null) {
                    try {
                        var3.invoke(class126.field2326.field3599, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method585((byte) 40);
            class202.field3854 = class176.method1261(2, class222.field4194, class154.field2977, class145.field2727);
            this.method214(100);
            class143.field2656 = class196.method1360(0);
            while (class35.field602 == 0L || class35.field602 > class206.method1420(false)) {
                class153.field2962 = class143.field2656.method204(class130.field2444, 89, class165.field3147);
                for (int var4 = 0; var4 < class153.field2962; var4++) {
                    this.method584((byte) 115);
                }
                this.method589(-23496);
                class149.method1008(-1, class154.field2977, class126.field2326);
            }
        } catch (Exception var7) {
            class221.method1490((byte) 0, null, var7);
            this.method588((byte) -49, "crash");
        }
        this.method587(0, true);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
    public abstract void method222(byte arg0);

    @OriginalMember(owner = "client!hj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1592++;
        class118.field2145 = true;
        class53.field971 = true;
    }

    @OriginalMember(owner = "client!hj", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1579++;
        if (class55.field1032 == this && !class48.field909) {
            class35.field602 = class206.method1420(false);
            class21.method98(5000L, (byte) 38);
            class6.field93 = null;
            this.method587(0, false);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BIIII)V")
    public final void method593(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1586++;
        try {
            if (class55.field1032 != null) {
                class8.field121++;
                if (class8.field121 >= 3) {
                    this.method588((byte) -49, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            } else if (arg0 == -49) {
                class222.field4194 = arg4;
                class55.field1032 = this;
                class145.field2727 = arg3;
                class225.field4228 = arg1;
                if (class126.field2326 == null) {
                    class6.field93 = class126.field2326 = new class181(false, this, arg2, null, 0);
                }
                class126.field2326.method1289(2, this, 1);
            }
        } catch (Exception var7) {
            class221.method1490((byte) 0, null, var7);
            this.method588((byte) -49, "crash");
        }
    }

    @OriginalMember(owner = "client!hj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1589++;
        if (class201.field3834 == null) {
            return class126.field2326 == null || class126.field2326.field3599 == this ? super.getDocumentBase() : class126.field2326.field3599.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1566++;
    }
}
