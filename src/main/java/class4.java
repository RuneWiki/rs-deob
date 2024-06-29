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

@OriginalClass("client!vd")
public abstract class class4 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Z")
    private boolean field43 = false;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Z")
    public final boolean method37(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field38++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 < 113) {
                this.field43 = false;
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
                this.method38("invalidhost", (byte) -86);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method38(String arg0, byte arg1) {
        field37++;
        if (this.field43) {
            return;
        }
        if (arg1 > -5) {
            this.field43 = true;
        }
        this.field43 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public abstract void method39(int arg0);

    @OriginalMember(owner = "client!vd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field60++;
        if (class267.field4736 == null) {
            return class184.field3228 == null || class184.field3228.field2320 == this ? super.getCodeBase() : class184.field3228.field2320.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field59++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
    public static final void method40(byte arg0, int arg1) {
        if (arg0 != -66) {
            method45((byte) -21, 110, -40);
        }
        class197 var2 = class164.method1228(7, arg1, -1665874464);
        var2.method1407(arg0 ^ 0x28);
        field39++;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public abstract void method41(int arg0);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    private final void method42(int arg0) {
        field54++;
        long var2 = class217.field3750[class103.field1882];
        long var4 = class201.method1419(5);
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        int var6 = -114 % ((-arg0 - 25) / 40);
        class217.field3750[class103.field1882] = var4;
        class103.field1882 = class103.field1882 + 1 & 0x1F;
        synchronized (this) {
            class191.field3376 = class214.field3703;
        }
        this.method44(24973);
    }

    @OriginalMember(owner = "client!vd", name = "stop", descriptor = "()V")
    public final void stop() {
        field57++;
        if (class61.field1174 == this && !class182.field3181) {
            class151.field2686 = class201.method1419(5) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class214.field3703 = true;
        field51++;
        class245.field4330 = true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/String;BIIII)V")
    public final void method43(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field62++;
        try {
            class180.field3155 = arg4;
            class141.field2536 = arg4;
            class259.field4588 = 0;
            class267.field4745 = 0;
            class135.field2434 = arg3;
            class169.field2983 = arg3;
            int var8 = -92 / ((arg2 + 46) / 42);
            class61.field1174 = this;
            class37.field705 = arg5;
            class267.field4736 = new Frame();
            class267.field4736.setTitle("Jagex");
            class267.field4736.setResizable(true);
            class267.field4736.addWindowListener(this);
            class267.field4736.setVisible(true);
            class267.field4736.toFront();
            Insets var9 = class267.field4736.getInsets();
            class267.field4736.setSize(var9.right + var9.left + class141.field2536, class169.field2983 + var9.top + var9.bottom);
            class238.field4109 = class184.field3228 = new class129((Applet) null, arg6, arg1, arg0);
            class193 var10 = class184.field3228.method1019(this, (byte) 117, 1);
            while (var10.field3421 == 0) {
                class52.method417((byte) -115, 10L);
            }
        } catch (Exception var12) {
            class154.method1177(var12, (byte) -71, (String) null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field36++;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public abstract void method44(int arg0);

    @OriginalMember(owner = "client!vd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field55++;
        if (class267.field4736 == null) {
            return class184.field3228 == null || class184.field3228.field2320 == this ? super.getParameter(arg0) : class184.field3228.field2320.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field52++;
        if (class61.field1174 == this && !class182.field3181) {
            class151.field2686 = class201.method1419(5);
            class52.method417((byte) -115, 5000L);
            class238.field4109 = null;
            this.method48(false, 1000);
        }
    }

    @OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
    public final void run() {
        field50++;
        try {
            if (class129.field2324 != null) {
                String var1 = class129.field2324.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class129.field2323;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method38("wrongjava", (byte) -97);
                        return;
                    }
                    class197.field3521 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class129.field2323 == null || class129.field2323.equals("1.4.2"))) {
                    this.method38("wrongjava", (byte) -65);
                    return;
                }
            }
            if (class129.field2323 != null && class129.field2323.startsWith("1.")) {
                int var3 = 0;
                for (int var4 = 2; var4 < class129.field2323.length(); var4++) {
                    char var5 = class129.field2323.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class95.field1715 = true;
                }
            }
            if (class184.field3228.field2320 != null) {
                Method var6 = class129.field2332;
                if (var6 != null) {
                    try {
                        var6.invoke(class184.field3228.field2320, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method47(20008);
            class251.field4499 = class238.method1675(-914585204, class135.field2434, class180.field3155, class14.field307);
            this.method39(-1);
            class80.field1454 = class227.method1566(-22992);
            while (class151.field2686 == 0L || class201.method1419(5) < class151.field2686) {
                class275.field4833 = class80.field1454.method1561(class197.field3521, class116.field2068, (byte) 126);
                for (int var7 = 0; var7 < class275.field4833; var7++) {
                    this.method42(118);
                }
                this.method49((byte) 7);
                class121.method950(class184.field3228, (byte) -36, class14.field307);
            }
        } catch (Exception var10) {
            class154.method1177(var10, (byte) -80, (String) null);
            this.method38("crash", (byte) -107);
        }
        this.method48(true, 1000);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)V")
    public static final void method45(byte arg0, int arg1, int arg2) {
        class100 var3 = class172.method1264(false, arg1);
        field58++;
        int var4 = var3.field1853;
        int var5 = 3 % ((arg0 - 25) / 48);
        int var6 = var3.field1850;
        int var7 = var3.field1856;
        int var8 = class99.field1831[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        class255.method1792(var4, class99.field1838[var4] & ~var9 | arg2 << var6 & var9, 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIB)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field42++;
        try {
            if (arg4 != -6) {
                providesignlink((class129) null);
            }
            if (class61.field1174 == null) {
                class267.field4745 = 0;
                class37.field705 = arg3;
                class61.field1174 = this;
                class259.field4588 = 0;
                class180.field3155 = arg0;
                class141.field2536 = arg0;
                class135.field2434 = arg2;
                class169.field2983 = arg2;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class184.field3228 == null) {
                    class238.field4109 = class184.field3228 = new class129(this, arg1, (String) null, 0);
                }
                class193 var7 = class184.field3228.method1019(this, (byte) -95, 1);
                while (var7.field3421 == 0) {
                    class52.method417((byte) -115, 10L);
                }
            } else {
                class205.field3622++;
                if (class205.field3622 >= 3) {
                    this.method38("alreadyloaded", (byte) -82);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class154.method1177(var9, (byte) -124, (String) null);
            this.method38("crash", (byte) -53);
        }
    }

    @OriginalMember(owner = "client!vd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field35++;
        if (class267.field4736 == null) {
            return class184.field3228 == null || class184.field3228.field2320 == this ? super.getAppletContext() : class184.field3228.field2320.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public final synchronized void method47(int arg0) {
        if (class14.field307 != null) {
            class14.field307.removeFocusListener(this);
            class14.field307.getParent().remove(class14.field307);
        }
        field61++;
        Container var2;
        if (class108.field1952 != null) {
            var2 = class108.field1952;
        } else if (class267.field4736 == null) {
            var2 = class184.field3228.field2320;
        } else {
            var2 = class267.field4736;
        }
        var2.setLayout((LayoutManager) null);
        class14.field307 = new class144(this);
        var2.add(class14.field307);
        if (arg0 != 20008) {
            this.update((Graphics) null);
        }
        class14.field307.setSize(class180.field3155, class135.field2434);
        class14.field307.setVisible(true);
        if (class267.field4736 == var2) {
            Insets var3 = class267.field4736.getInsets();
            class14.field307.setLocation(class267.field4745 + var3.left, class259.field4588 + var3.top);
        } else {
            class14.field307.setLocation(class267.field4745, class259.field4588);
        }
        class14.field307.addFocusListener(this);
        class14.field307.requestFocus();
        class214.field3703 = true;
        class245.field4330 = true;
        class155.field2771 = false;
        class191.field3376 = true;
        class267.field4735 = class201.method1419(arg0 - 20003);
    }

    @OriginalMember(owner = "client!vd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V")
    private final void method48(boolean arg0, int arg1) {
        field34++;
        synchronized (this) {
            if (class182.field3181) {
                return;
            }
            class182.field3181 = true;
        }
        if (class184.field3228.field2320 != null) {
            class184.field3228.field2320.destroy();
        }
        try {
            if (arg1 != 1000) {
                this.field43 = false;
            }
            this.method41(0);
        } catch (Exception var9) {
        }
        if (class14.field307 != null) {
            try {
                class14.field307.removeFocusListener(this);
                class14.field307.getParent().remove(class14.field307);
            } catch (Exception var8) {
            }
        }
        if (class184.field3228 != null) {
            try {
                class184.field3228.method1016(arg1 ^ 0x3E8);
            } catch (Exception var7) {
            }
        }
        this.method51((byte) -69);
        if (class267.field4736 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!vd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field41++;
    }

    @OriginalMember(owner = "client!vd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field33++;
        class214.field3703 = false;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    private final void method49(byte arg0) {
        field40++;
        long var2 = class194.field3440[class219.field3774];
        long var4 = class201.method1419(5);
        class194.field3440[class219.field3774] = var4;
        if (arg0 != 7) {
            this.destroy();
        }
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class160.field2862 = ((var6 >> 1) + 32000) / var6;
        }
        class219.field3774 = class219.field3774 + 1 & 0x1F;
        if (class102.field1868++ > 50) {
            class245.field4330 = true;
            class102.field1868 -= 50;
            class14.field307.setSize(class180.field3155, class135.field2434);
            class14.field307.setVisible(true);
            if (class267.field4736 != null && class108.field1952 == null) {
                Insets var7 = class267.field4736.getInsets();
                class14.field307.setLocation(var7.left + class267.field4745, class259.field4588 + var7.top);
            } else {
                class14.field307.setLocation(class267.field4745, class259.field4588);
            }
        }
        this.method50(26145);
    }

    @OriginalMember(owner = "client!vd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field49++;
    }

    @OriginalMember(owner = "client!vd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field32++;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
    public abstract void method50(int arg0);

    @OriginalMember(owner = "client!vd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field47++;
        if (class267.field4736 == null) {
            return class184.field3228 == null || class184.field3228.field2320 == this ? super.getDocumentBase() : class184.field3228.field2320.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
    public abstract void method51(byte arg0);

    @OriginalMember(owner = "client!vd", name = "providesignlink", descriptor = "(Lfh;)V")
    public static final void providesignlink(class129 arg0) {
        class184.field3228 = arg0;
        class238.field4109 = arg0;
        field48++;
    }

    @OriginalMember(owner = "client!vd", name = "start", descriptor = "()V")
    public final void start() {
        field44++;
        if (class61.field1174 == this && !class182.field3181) {
            class151.field2686 = 0L;
        }
    }

    @OriginalMember(owner = "client!vd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field45++;
    }

    @OriginalMember(owner = "client!vd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field56++;
    }

    @OriginalMember(owner = "client!vd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field46++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field53++;
        if (class61.field1174 != this || class182.field3181) {
            return;
        }
        class245.field4330 = true;
        if (class95.field1715 && class201.method1419(5) - class267.field4735 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class141.field2536 <= var2.width && class169.field2983 <= var2.height) {
                class155.field2771 = true;
            }
        }
    }
}
