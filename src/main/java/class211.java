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

@OriginalClass("client!ua")
public abstract class class211 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Z")
    private boolean field3791 = false;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[B")
    public static byte[] field3767 = new byte[520];

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[[[I")
    public static int[][][] field3771 = new int[4][105][105];

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Ldj;")
    public static class44 field3768 = class89.method650(255, "(U2");

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Ldj;")
    private static class44 field3764 = class89.method650(255, "Please contact customer support)3");

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ldj;")
    public static class44 field3760 = field3764;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "Lnf;")
    public static class147 field3797;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lve;")
    public static class225 field3773;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "Z")
    public static boolean field3798;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "[Lle;")
    public static class125[] field3785;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "[Lod;")
    public static class155[] field3796;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public abstract void method236(int arg0);

    @OriginalMember(owner = "client!ua", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3793++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1361(int arg0, String arg1) {
        field3759++;
        if (this.field3791) {
            return;
        }
        this.field3791 = true;
        System.out.println("error_game_" + arg1);
        try {
            if (arg0 <= 4) {
                field3771 = null;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ua", name = "stop", descriptor = "()V")
    public final void stop() {
        field3778++;
        if (class216.field3926 == this && !class74.field1433) {
            class118.field2113 = class27.method193((byte) 95) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ua", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3786++;
    }

    @OriginalMember(owner = "client!ua", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3782++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public abstract void method232(boolean arg0);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    private final void method1362(byte arg0) {
        long var2 = class27.method193((byte) 95);
        field3792++;
        long var4 = class17.field300[class64.field1181];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class17.field300[class64.field1181] = var2;
        class64.field1181 = class64.field1181 + 1 & 0x1F;
        synchronized (this) {
            class184.field3199 = class228.field4277;
        }
        this.method232(true);
        if (arg0 != -94) {
            this.windowDeiconified(null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public abstract void method235(int arg0);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIIII)V")
    public final void method1363(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3772++;
        try {
            if (class216.field3926 != null) {
                class27.field478++;
                if (class27.field478 >= 3) {
                    this.method1361(83, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class130.field2313 = arg3;
            class216.field3926 = this;
            class169.field2926 = arg1;
            class234.field4356 = arg4;
            if (class83.field1627 == null) {
                class94.field1751 = class83.field1627 = new class229(false, this, arg2, null, 0);
            }
            class83.field1627.method1501(1, this, arg0);
        } catch (Exception var7) {
            class173.method1099(127, null, var7);
            this.method1361(32, "crash");
        }
        if (arg0) {
            field3768 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    private final synchronized void method1364(int arg0) {
        if (arg0 < 124) {
            this.windowClosing(null);
        }
        field3777++;
        Container var2;
        if (class35.field620 == null) {
            var2 = class83.field1627.field4301;
        } else {
            var2 = class35.field620;
        }
        if (class8.field172 != null) {
            class8.field172.removeFocusListener(this);
            var2.remove(class8.field172);
        }
        class8.field172 = new class40(this);
        var2.add(class8.field172);
        class8.field172.setSize(class130.field2313, class169.field2926);
        class8.field172.setVisible(true);
        if (class35.field620 == null) {
            class8.field172.setLocation(0, 0);
        } else {
            Insets var3 = class35.field620.getInsets();
            class8.field172.setLocation(var3.left, var3.top);
        }
        class8.field172.addFocusListener(this);
        class8.field172.requestFocus();
        class70.field1345 = true;
        class186.field3216 = class27.method193((byte) 103);
    }

    @OriginalMember(owner = "client!ua", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3788++;
    }

    @OriginalMember(owner = "client!ua", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3763++;
        if (class35.field620 == null) {
            return class83.field1627 == null || class83.field1627.field4301 == this ? super.getDocumentBase() : class83.field1627.field4301.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3766++;
        if (class216.field3926 == this && !class74.field1433) {
            class118.field2113 = class27.method193((byte) 122);
            class82.method617((byte) 31, 5000L);
            class94.field1751 = null;
            this.method1367(false, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!ua", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3758++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public static void method1365(boolean arg0) {
        field3771 = null;
        field3797 = null;
        field3768 = null;
        field3760 = null;
        field3796 = null;
        field3773 = null;
        field3785 = null;
        field3764 = null;
        field3767 = null;
        if (!arg0) {
            field3785 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "start", descriptor = "()V")
    public final void start() {
        field3762++;
        if (class216.field3926 == this && !class74.field1433) {
            class118.field2113 = 0L;
        }
    }

    @OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
    public final void run() {
        field3761++;
        try {
            if (class229.field4294 != null) {
                String var1 = class229.field4294.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class229.field4303;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1361(111, "wrongjava");
                        return;
                    }
                    class48.field894 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class229.field4303 == null || class229.field4303.equals("1.4.2"))) {
                    this.method1361(104, "wrongjava");
                    return;
                }
            }
            if (class83.field1627.field4301 != null) {
                Method var3 = class229.field4305;
                if (var3 != null) {
                    try {
                        var3.invoke(class83.field1627.field4301, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1364(127);
            class28.field493 = class45.method345(-26981, class8.field172, class130.field2313, class169.field2926);
            this.method235(21937);
            class200.field3547 = class72.method564(-6);
            while (class118.field2113 == 0L || class118.field2113 > class27.method193((byte) 114)) {
                class118.field2106 = class200.field3547.method25((byte) 53, class117.field2080, class48.field894);
                for (int var4 = 0; var4 < class118.field2106; var4++) {
                    this.method1362((byte) -94);
                }
                this.method1369(82);
                class220.method1425(class8.field172, -70, class83.field1627);
            }
        } catch (Exception var7) {
            class173.method1099(118, null, var7);
            this.method1361(38, "crash");
        }
        this.method1367(true, (byte) 9);
    }

    @OriginalMember(owner = "client!ua", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3790++;
        if (class216.field3926 != this || class74.field1433) {
            return;
        }
        class70.field1345 = true;
        if (class229.field4303 == null || !class229.field4303.startsWith("1.5") || class27.method193((byte) 110) - class186.field3216 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        boolean var10000;
        if (var2 == null || class130.field2313 <= var2.width && class169.field2926 <= var2.height) {
            var10000 = true;
        } else {
            var10000 = false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3769++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ua", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3784++;
        class228.field4277 = false;
    }

    @OriginalMember(owner = "client!ua", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3779++;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)Z")
    public final boolean method1366(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field3780++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            if (arg0 != -80) {
                this.windowClosing(null);
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1361(120, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class228.field4277 = true;
        field3774++;
        class70.field1345 = true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZB)V")
    private final void method1367(boolean arg0, byte arg1) {
        field3795++;
        synchronized (this) {
            if (class74.field1433) {
                return;
            }
            class74.field1433 = true;
        }
        if (class83.field1627.field4301 != null) {
            class83.field1627.field4301.destroy();
        }
        if (class8.field172 != null) {
            try {
                class8.field172.removeFocusListener(this);
                Container var4;
                if (class35.field620 == null) {
                    var4 = class83.field1627.field4301;
                } else {
                    var4 = class35.field620;
                }
                var4.remove(class8.field172);
            } catch (Exception var10) {
            }
        }
        try {
            this.method226(arg1 - 8758);
        } catch (Exception var9) {
        }
        if (class83.field1627 != null) {
            try {
                class83.field1627.method1500((byte) 39);
            } catch (Exception var8) {
            }
        }
        if (arg1 != 9) {
            return;
        }
        this.method234(-93);
        if (class35.field620 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1368(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3789++;
        try {
            class234.field4356 = arg5;
            class216.field3926 = this;
            class169.field2926 = arg3;
            class130.field2313 = arg2;
            class35.field620 = new Frame();
            class35.field620.setTitle("Jagex");
            class35.field620.setResizable(false);
            class35.field620.addWindowListener(this);
            class35.field620.setVisible(true);
            class35.field620.toFront();
            Insets var8 = class35.field620.getInsets();
            class35.field620.setSize(var8.left + arg2 + var8.right, var8.bottom + arg3 - -var8.top);
            class94.field1751 = class83.field1627 = new class229(true, null, arg6, arg0, arg1);
            class83.field1627.method1501(arg4, this, false);
        } catch (Exception var10) {
            class173.method1099(arg4 + 106, null, var10);
        }
    }

    @OriginalMember(owner = "client!ua", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3787++;
        if (class35.field620 == null) {
            return class83.field1627 == null || class83.field1627.field4301 == this ? super.getCodeBase() : class83.field1627.field4301.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    private final void method1369(int arg0) {
        field3783++;
        if (arg0 <= 57) {
            this.method1366((byte) -122);
        }
        long var2 = class27.method193((byte) 103);
        long var4 = class147.field2586[class36.field643];
        class147.field2586[class36.field643] = var2;
        class36.field643 = class36.field643 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class220.field3995 = ((var6 >> 1) + 32000) / var6;
        }
        if (class7.field152++ > 50) {
            class70.field1345 = true;
            class7.field152 -= 50;
            class8.field172.setSize(class130.field2313, class169.field2926);
            class8.field172.setVisible(true);
            if (class35.field620 == null) {
                class8.field172.setLocation(0, 0);
            } else {
                Insets var7 = class35.field620.getInsets();
                class8.field172.setLocation(var7.left, var7.top);
            }
        }
        this.method236(-31);
    }

    @OriginalMember(owner = "client!ua", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3781++;
        if (class35.field620 == null) {
            return class83.field1627 == null || class83.field1627.field4301 == this ? super.getAppletContext() : class83.field1627.field4301.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public abstract void method226(int arg0);

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
    public abstract void method234(int arg0);

    @OriginalMember(owner = "client!ua", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3770++;
    }

    @OriginalMember(owner = "client!ua", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3794++;
        if (class35.field620 == null) {
            return class83.field1627 == null || class83.field1627.field4301 == this ? super.getParameter(arg0) : class83.field1627.field4301.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "providesignlink", descriptor = "(Lvi;)V")
    public static final void providesignlink(class229 arg0) {
        class83.field1627 = arg0;
        class94.field1751 = arg0;
        field3765++;
    }
}
