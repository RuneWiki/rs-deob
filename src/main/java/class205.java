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

@OriginalClass("client!va")
public abstract class class205 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Z")
    private boolean field3505 = false;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lfg;")
    public static class48 field3503 = new class48(64);

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field3517 = 0;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Lce;")
    public static class126 field3521 = class206.method1445(-7923, "mapflag");

    @OriginalMember(owner = "client!va", name = "G", descriptor = "[I")
    public static int[] field3520 = new int[4096];

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Lce;")
    public static class126 field3522 = class206.method1445(-7923, "p12_full");

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field3523 = 127;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "Lce;")
    public static class126 field3518 = class206.method1445(-7923, " s(West connect-B)3");

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "Z")
    public static boolean field3524;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Z")
    public static boolean field3525;

    @OriginalMember(owner = "client!va", name = "destroy", descriptor = "()V", line = 7)
    public final void destroy() {
        field3513++;
        if (class123.field2087 == this && !class173.field3068) {
            class317.field5438 = class261.method1765(16299);
            class313.method2158(5000L, true);
            class152.field2788 = null;
            this.method1441(0, false);
        }
    }

    @OriginalMember(owner = "client!va", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 27)
    public final void windowClosed(WindowEvent arg0) {
        field3501++;
    }

    @OriginalMember(owner = "client!va", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 34)
    public final void windowDeiconified(WindowEvent arg0) {
        field3514++;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V", line = 41)
    public static void method1436(byte arg0) {
        field3520 = null;
        field3503 = null;
        field3522 = null;
        field3518 = null;
        field3521 = null;
        if (arg0 != 63) {
            method1436((byte) -51);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 63)
    private final void method1437(int arg0) {
        field3516++;
        long var2 = class261.method1765(arg0 ^ 0x3F99);
        if (arg0 != 50) {
            return;
        }
        long var4 = class315.field5418[class262.field4380];
        class315.field5418[class262.field4380] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class262.field4383 = ((var6 >> 1) + 32000) / var6;
        }
        class262.field4380 = class262.field4380 + 1 & 0x1F;
        if ((class262.field4378++) > 50) {
            class111.field1751 = true;
            class262.field4378 -= 50;
            class24.field342.setSize(class7.field87, class1.field6);
            class24.field342.setVisible(true);
            if (class253.field4250 != null && class45.field693 == null) {
                Insets var7 = class253.field4250.getInsets();
                class24.field342.setLocation(var7.left + class134.field2292, class70.field1154 + var7.top);
            } else {
                class24.field342.setLocation(class134.field2292, class70.field1154);
            }
        }
        this.method816((byte) -124);
    }

    @OriginalMember(owner = "client!va", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 111)
    public final void focusGained(FocusEvent arg0) {
        class174.field3078 = true;
        field3495++;
        class111.field1751 = true;
    }

    @OriginalMember(owner = "client!va", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 120)
    public final URL getCodeBase() {
        field3500++;
        if (class253.field4250 == null) {
            return class161.field2907 == null || class161.field2907.field2705 == this ? super.getCodeBase() : class161.field2907.field2705.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 134)
    public final void focusLost(FocusEvent arg0) {
        class174.field3078 = false;
        field3512++;
    }

    @OriginalMember(owner = "client!va", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 147)
    public final synchronized void paint(Graphics arg0) {
        field3508++;
        if (class123.field2087 != this || class173.field3068) {
            return;
        }
        class111.field1751 = true;
        if (class163.field2925 && !class56.field846 && class261.method1765(16299) - class272.field4582 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class9.field117 <= var2.width && var2.height >= class22.field307) {
                class139.field2538 = true;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 171)
    public final URL getDocumentBase() {
        field3507++;
        if (class253.field4250 == null) {
            return class161.field2907 == null || class161.field2907.field2705 == this ? super.getDocumentBase() : class161.field2907.field2705.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V", line = 185)
    public final synchronized void method1438(byte arg0) {
        field3511++;
        if (class24.field342 != null) {
            class24.field342.removeFocusListener(this);
            class24.field342.getParent().remove(class24.field342);
        }
        Container var2;
        if (class45.field693 != null) {
            var2 = class45.field693;
        } else if (class253.field4250 == null) {
            var2 = class161.field2907.field2705;
        } else {
            var2 = class253.field4250;
        }
        var2.setLayout((LayoutManager) null);
        class24.field342 = new class119(this);
        var2.add(class24.field342);
        class24.field342.setSize(class7.field87, class1.field6);
        class24.field342.setVisible(true);
        if (class253.field4250 == var2) {
            Insets var3 = class253.field4250.getInsets();
            class24.field342.setLocation(class134.field2292 + var3.left, class70.field1154 + var3.top);
        } else {
            class24.field342.setLocation(class134.field2292, class70.field1154);
        }
        if (arg0 != 82) {
            return;
        }
        class24.field342.addFocusListener(this);
        class24.field342.requestFocus();
        class174.field3078 = true;
        class111.field1751 = true;
        class317.field5443 = true;
        class139.field2538 = false;
        class272.field4582 = class261.method1765(arg0 + 16217);
    }

    @OriginalMember(owner = "client!va", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 233)
    public final String getParameter(String arg0) {
        field3494++;
        if (class253.field4250 == null) {
            return class161.field2907 == null || class161.field2907.field2705 == this ? super.getParameter(arg0) : class161.field2907.field2705.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "providesignlink", descriptor = "(Lvh;)V", line = 252)
    public static final void providesignlink(class147 arg0) {
        class161.field2907 = arg0;
        class152.field2788 = arg0;
        field3488++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 260)
    public final void method1439(boolean arg0, String arg1) {
        field3498++;
        if (this.field3505) {
            return;
        }
        this.field3505 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!va", name = "run", descriptor = "()V", line = 280)
    public final void run() {
        field3496++;
        try {
            if (class147.field2706 != null) {
                String var1 = class147.field2706.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class147.field2711;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1439(true, "wrongjava");
                        return;
                    }
                    class288.field4782 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class147.field2711 == null || class147.field2711.equals("1.4.2"))) {
                    this.method1439(true, "wrongjava");
                    return;
                }
            }
            if (class147.field2711 != null && class147.field2711.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class147.field2711.length()) {
                    char var5 = class147.field2711.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class163.field2925 = true;
                }
            }
            if (class161.field2907.field2705 != null) {
                Method var6 = class147.field2726;
                if (var6 != null) {
                    try {
                        var6.invoke(class161.field2907.field2705, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class241.method1658((byte) -41);
            this.method1438((byte) 82);
            class106.field1668 = class118.method772((byte) -103, class1.field6, class24.field342, class7.field87);
            this.method819((byte) 19);
            class157.field2817 = class9.method54((byte) 118);
            while (class317.field5438 == 0L || class261.method1765(16299) < class317.field5438) {
                class10.field126 = class157.field2817.method112(class249.field4165, class288.field4782, -128);
                for (int var8 = 0; var8 < class10.field126; var8++) {
                    this.method1440(0);
                }
                this.method1437(50);
                class187.method1349((byte) 107, class161.field2907, class24.field342);
            }
        } catch (Exception var11) {
            class54.method345((String) null, -117, var11);
            this.method1439(true, "crash");
        }
        this.method1441(0, true);
    }

    @OriginalMember(owner = "client!va", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 390)
    public final void windowOpened(WindowEvent arg0) {
        field3489++;
    }

    @OriginalMember(owner = "client!va", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 399)
    public final void windowActivated(WindowEvent arg0) {
        field3504++;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V", line = 409)
    private final void method1440(int arg0) {
        long var2 = class261.method1765(16299);
        field3509++;
        long var4 = class127.field2194[class302.field5029];
        if ((long) arg0 != var4 && var4 >= var2) {
        }
        class127.field2194[class302.field5029] = var2;
        class302.field5029 = class302.field5029 + 1 & 0x1F;
        synchronized (this) {
            class317.field5443 = class174.field3078;
        }
        this.method810((byte) -123);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V", line = 436)
    private final void method1441(int arg0, boolean arg1) {
        field3502++;
        synchronized (this) {
            if (class173.field3068) {
                return;
            }
            class173.field3068 = true;
        }
        if (class161.field2907.field2705 != null) {
            class161.field2907.field2705.destroy();
        }
        try {
            this.method813((byte) 125);
        } catch (Exception var12) {
        }
        if (class24.field342 != null) {
            try {
                class24.field342.removeFocusListener(this);
                class24.field342.getParent().remove(class24.field342);
            } catch (Exception var11) {
            }
        }
        if (class161.field2907 != null) {
            try {
                class161.field2907.method1091(16);
            } catch (Exception var10) {
            }
        }
        this.method808(127);
        if (class253.field4250 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        if (arg0 != 0) {
            this.getDocumentBase();
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!va", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 500)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3499++;
    }

    @OriginalMember(owner = "client!va", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 509)
    public final AppletContext getAppletContext() {
        field3497++;
        if (class253.field4250 == null) {
            return class161.field2907 == null || class161.field2907.field2705 == this ? super.getAppletContext() : class161.field2907.field2705.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/String;IIIZII)V", line = 524)
    public final void method1442(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            class7.field87 = arg6;
            class9.field117 = arg6;
            class134.field2292 = 0;
            class70.field1154 = arg7;
            class1.field6 = arg4;
            class22.field307 = arg4;
            class123.field2087 = this;
            class73.field1177 = arg2;
            class253.field4250 = new Frame();
            class253.field4250.setTitle("Jagex");
            class253.field4250.setResizable(true);
            class253.field4250.addWindowListener(this);
            class253.field4250.setVisible(true);
            class253.field4250.toFront();
            Insets var9 = class253.field4250.getInsets();
            class253.field4250.setSize(var9.left + var9.right + class9.field117, class22.field307 + var9.bottom + var9.top);
            class152.field2788 = class161.field2907 = new class147((Applet) null, arg3, arg1, arg0);
            class60 var10 = class161.field2907.method1105(8, this, 1);
            while (var10.field965 == 0) {
                class313.method2158(10L, true);
            }
            class189.field3248 = (Thread) var10.field967;
        } catch (Exception var12) {
            class54.method345((String) null, -62, var12);
        }
        field3492++;
    }

    @OriginalMember(owner = "client!va", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 568)
    public final void windowIconified(WindowEvent arg0) {
        field3491++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V", line = 579)
    public final void method1443(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -1) {
            return;
        }
        field3490++;
        try {
            if (class123.field2087 != null) {
                class11.field153++;
                if (class11.field153 >= 3) {
                    this.method1439(true, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class7.field87 = arg2;
            class9.field117 = arg2;
            class123.field2087 = this;
            class134.field2292 = 0;
            class1.field6 = arg4;
            class22.field307 = arg4;
            class73.field1177 = arg3;
            class70.field1154 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class186.field3221 = true;
            } else {
                class186.field3221 = false;
            }
            if (class161.field2907 == null) {
                class152.field2788 = class161.field2907 = new class147(this, arg1, (String) null, 0);
            }
            class60 var7 = class161.field2907.method1105(8, this, 1);
            while (var7.field965 == 0) {
                class313.method2158(10L, true);
            }
            class189.field3248 = (Thread) var7.field967;
        } catch (Exception var9) {
            class54.method345((String) null, -73, var9);
            this.method1439(true, "crash");
        }
    }

    @OriginalMember(owner = "client!va", name = "stop", descriptor = "()V", line = 637)
    public final void stop() {
        field3519++;
        if (class123.field2087 == this && !class173.field3068) {
            class317.field5438 = class261.method1765(16299) + 4000L;
        }
    }

    @OriginalMember(owner = "client!va", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 655)
    public final void windowDeactivated(WindowEvent arg0) {
        field3493++;
    }

    @OriginalMember(owner = "client!va", name = "start", descriptor = "()V", line = 670)
    public final void start() {
        field3515++;
        if (class123.field2087 == this && !class173.field3068) {
            class317.field5438 = 0L;
        }
    }

    @OriginalMember(owner = "client!va", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 694)
    public final void windowClosing(WindowEvent arg0) {
        field3506++;
        this.destroy();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)Z", line = 703)
    public final boolean method1444(boolean arg0) {
        field3510++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0) {
                this.getAppletContext();
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
                this.method1439(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public abstract void method819(byte arg0);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public abstract void method808(int arg0);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
    public abstract void method813(byte arg0);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
    public abstract void method810(byte arg0);

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(B)V")
    public abstract void method816(byte arg0);

    @OriginalMember(owner = "client!va", name = "init", descriptor = "()V")
    public abstract void init();
}
