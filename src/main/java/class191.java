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

@OriginalClass("client!rg")
public abstract class class191 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "Z")
    private boolean field3573 = false;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lmb;")
    public static class132 field3532 = class166.method1092("::tele 0)1", 125);

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Z")
    public static boolean field3555 = false;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Lmb;")
    private static class132 field3558 = class166.method1092("flash1:", 124);

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "Lmb;")
    public static class132 field3571 = field3558;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Lmb;")
    public static class132 field3552 = class166.method1092(")2", 115);

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Lmb;")
    public static class132 field3549 = class166.method1092("(U0a )2 in: ", 119);

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lmb;")
    public static class132 field3535 = class166.method1092("<col=ffff00>", 112);

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Lmb;")
    public static class132 field3545 = field3558;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Lch;")
    public static class31 field3540;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "Z")
    public static boolean field3575;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "Z")
    public static boolean field3576;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1215(byte arg0) {
        field3540 = null;
        field3552 = null;
        field3535 = null;
        field3558 = null;
        field3532 = null;
        field3571 = null;
        if (arg0 >= -22) {
            method1215((byte) -107);
        }
        field3545 = null;
        field3549 = null;
    }

    @OriginalMember(owner = "client!rg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3566++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILmf;IJIIII)Z")
    public static final boolean method1216(int arg0, int arg1, int arg2, int arg3, class136 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class123.method814(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!rg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3539++;
    }

    @OriginalMember(owner = "client!rg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3541++;
        if (class230.field4151 != this || class41.field662) {
            return;
        }
        class222.field4051 = true;
        if (class83.field1390 == null || !class83.field1390.startsWith("1.5") || class113.method769(39) - class219.field3995 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        boolean var10000;
        if (var2 == null || class187.field3461 <= var2.width && var2.height >= class47.field813) {
            var10000 = true;
        } else {
            var10000 = false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBIII)V")
    public final void method1217(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3533++;
        try {
            if (class230.field4151 == null) {
                if (arg1 > -40) {
                    this.run();
                }
                class160.field2912 = arg0;
                class230.field4151 = this;
                class47.field813 = arg2;
                class187.field3461 = arg3;
                if (class189.field3482 == null) {
                    class37.field614 = class189.field3482 = new class83(false, this, arg4, null, 0);
                }
                class189.field3482.method505(this, 1, -4263);
            } else {
                class65.field1078++;
                if (class65.field1078 >= 3) {
                    this.method1218(31, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class92.method571(null, var7, 85);
            this.method1218(31, "crash");
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public abstract void method237(int arg0);

    @OriginalMember(owner = "client!rg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class160.field2909 = true;
        field3572++;
        class222.field4051 = true;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1218(int arg0, String arg1) {
        field3551++;
        if (this.field3573) {
            return;
        }
        this.field3573 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 != 31) {
            field3537 = -125;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!rg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3547++;
        if (class125.field2322 == null) {
            return class189.field3482 == null || class189.field3482.field1405 == this ? super.getParameter(arg0) : class189.field3482.field1405.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3556++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    private final void method1219(boolean arg0) {
        field3565++;
        long var2 = class113.method769(79);
        long var4 = class208.field3787[class134.field2528];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class208.field3787[class134.field2528] = var2;
        class134.field2528 = class134.field2528 + 1 & 0x1F;
        synchronized (this) {
            class52.field888 = class160.field2909;
            if (arg0) {
                method1222(false);
            }
        }
        this.method238(true);
    }

    @OriginalMember(owner = "client!rg", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!rg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3562++;
    }

    @OriginalMember(owner = "client!rg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3550++;
    }

    @OriginalMember(owner = "client!rg", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3544++;
        if (class230.field4151 == this && !class41.field662) {
            class156.field2848 = class113.method769(67);
            class130.method856(1, 5000L);
            class37.field614 = null;
            this.method1223(0, false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public abstract void method240(int arg0);

    @OriginalMember(owner = "client!rg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class160.field2909 = false;
        field3574++;
    }

    @OriginalMember(owner = "client!rg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3542++;
        if (class125.field2322 == null) {
            return class189.field3482 == null || class189.field3482.field1405 == this ? super.getDocumentBase() : class189.field3482.field1405.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "stop", descriptor = "()V")
    public final void stop() {
        field3563++;
        if (class230.field4151 == this && !class41.field662) {
            class156.field2848 = class113.method769(41) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3559++;
        if (class125.field2322 == null) {
            return class189.field3482 == null || class189.field3482.field1405 == this ? super.getAppletContext() : class189.field3482.field1405.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
    public abstract void method238(boolean arg0);

    @OriginalMember(owner = "client!rg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3543++;
        this.destroy();
    }

    @OriginalMember(owner = "client!rg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3568++;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)Z")
    public final boolean method1220(boolean arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field3553++;
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
            } else if (arg0) {
                this.method1218(31, "invalidhost");
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    private final synchronized void method1221(byte arg0) {
        Container var2;
        if (class125.field2322 == null) {
            var2 = class189.field3482.field1405;
        } else {
            var2 = class125.field2322;
        }
        if (class154.field2814 != null) {
            class154.field2814.removeFocusListener(this);
            var2.remove(class154.field2814);
        }
        field3560++;
        class154.field2814 = new class6(this);
        var2.add(class154.field2814);
        if (arg0 != 87) {
            return;
        }
        class154.field2814.setSize(class187.field3461, class47.field813);
        class154.field2814.setVisible(true);
        if (class125.field2322 == null) {
            class154.field2814.setLocation(0, 0);
        } else {
            Insets var3 = class125.field2322.getInsets();
            class154.field2814.setLocation(var3.left, var3.top);
        }
        class154.field2814.addFocusListener(this);
        class154.field2814.requestFocus();
        class222.field4051 = true;
        class219.field3995 = class113.method769(110);
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(Z)V")
    public static final void method1222(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class174.field3239 == null || class69.field1151 == null) {
            class69.field1151 = new int[256];
            class174.field3239 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class174.field3239[var1] = (int) (Math.sin(var2) * 4096.0D);
                class69.field1151[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field3546++;
    }

    @OriginalMember(owner = "client!rg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3554++;
        if (class125.field2322 == null) {
            return class189.field3482 == null || class189.field3482.field1405 == this ? super.getCodeBase() : class189.field3482.field1405.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3564++;
    }

    @OriginalMember(owner = "client!rg", name = "providesignlink", descriptor = "(Lhf;)V")
    public static final void providesignlink(class83 arg0) {
        field3567++;
        class189.field3482 = arg0;
        class37.field614 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
    private final void method1223(int arg0, boolean arg1) {
        field3538++;
        synchronized (this) {
            if (class41.field662) {
                return;
            }
            class41.field662 = true;
        }
        if (class189.field3482.field1405 != null) {
            class189.field3482.field1405.destroy();
        }
        if (class154.field2814 != null) {
            try {
                class154.field2814.removeFocusListener(this);
                Container var4;
                if (class125.field2322 == null) {
                    var4 = class189.field3482.field1405;
                } else {
                    var4 = class125.field2322;
                }
                var4.remove(class154.field2814);
            } catch (Exception var10) {
            }
        }
        try {
            this.method237(-128);
        } catch (Exception var9) {
        }
        if (class189.field3482 != null) {
            try {
                class189.field3482.method504(77);
            } catch (Exception var8) {
            }
        }
        this.method240(arg0 + 800);
        if (class125.field2322 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (arg0 != 0) {
            this.field3573 = false;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!rg", name = "start", descriptor = "()V")
    public final void start() {
        field3561++;
        if (class230.field4151 == this && !class41.field662) {
            class156.field2848 = 0L;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1224(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        try {
            class47.field813 = arg2;
            class187.field3461 = arg3;
            class230.field4151 = this;
            class160.field2912 = arg6;
            class125.field2322 = new Frame();
            class125.field2322.setTitle("Jagex");
            class125.field2322.setResizable(false);
            class125.field2322.addWindowListener(this);
            class125.field2322.setVisible(true);
            class125.field2322.toFront();
            Insets var8 = class125.field2322.getInsets();
            if (arg0 != 15327) {
                return;
            }
            class125.field2322.setSize(arg3 + var8.right + var8.left, var8.top + arg2 - -var8.bottom);
            class37.field614 = class189.field3482 = new class83(true, null, arg1, arg4, arg5);
            class189.field3482.method505(this, 1, arg0 - 19590);
        } catch (Exception var10) {
            class92.method571(null, var10, 40);
        }
        field3548++;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(Z)V")
    public abstract void method244(boolean arg0);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public abstract void method243(byte arg0);

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    private final void method1225(byte arg0) {
        field3570++;
        long var2 = class108.field2047[class200.field3701];
        long var4 = class113.method769(84);
        if (arg0 <= 67) {
            return;
        }
        class108.field2047[class200.field3701] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class183.field3377 = ((var6 >> 1) + 32000) / var6;
        }
        class200.field3701 = class200.field3701 + 1 & 0x1F;
        if (class93.field1639++ > 50) {
            class93.field1639 -= 50;
            class222.field4051 = true;
            class154.field2814.setSize(class187.field3461, class47.field813);
            class154.field2814.setVisible(true);
            if (class125.field2322 == null) {
                class154.field2814.setLocation(0, 0);
            } else {
                Insets var7 = class125.field2322.getInsets();
                class154.field2814.setLocation(var7.left, var7.top);
            }
        }
        this.method243((byte) 42);
    }

    @OriginalMember(owner = "client!rg", name = "run", descriptor = "()V")
    public final void run() {
        field3534++;
        try {
            if (class83.field1404 != null) {
                String var1 = class83.field1404.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class83.field1390;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1218(31, "wrongjava");
                        return;
                    }
                    class17.field257 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class83.field1390 == null || class83.field1390.equals("1.4.2"))) {
                    this.method1218(31, "wrongjava");
                    return;
                }
            }
            if (class189.field3482.field1405 != null) {
                Method var3 = class83.field1393;
                if (var3 != null) {
                    try {
                        var3.invoke(class189.field3482.field1405, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1221((byte) 87);
            class140.field2628 = class64.method406(class187.field3461, class47.field813, class154.field2814, true);
            this.method244(false);
            class153.field2795 = class231.method1466((byte) -43);
            while (class156.field2848 == 0L || class156.field2848 > class113.method769(75)) {
                class34.field552 = class153.field2795.method41(class17.field257, -1, class43.field754);
                for (int var4 = 0; var4 < class34.field552; var4++) {
                    this.method1219(false);
                }
                this.method1225((byte) 121);
                class45.method304(class154.field2814, class189.field3482, 1);
            }
        } catch (Exception var7) {
            class92.method571(null, var7, 80);
            this.method1218(31, "crash");
        }
        this.method1223(0, true);
    }
}
