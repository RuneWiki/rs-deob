import jagex3.jagmisc.jagmisc;
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

@OriginalClass("client!te")
public abstract class class437 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Z")
    private boolean field6261 = false;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Z")
    private boolean field6246 = false;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Lek;")
    public static class352 field6263 = new class352(16);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "Z")
    public static boolean field6277;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "Z")
    public static boolean field6279;

    @OriginalMember(owner = "client!te", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6245++;
        class290.field3700 = true;
        class140.field1805 = true;
    }

    @OriginalMember(owner = "client!te", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field6275++;
    }

    @OriginalMember(owner = "client!te", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field6272++;
        if (class123.field1656 == null) {
            return class219.field2794 == null || class219.field2794.field6891 == this ? super.getParameter(arg0) : class219.field2794.field6891.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public final synchronized void method2563(byte arg0) {
        if (arg0 != 115) {
            return;
        }
        if (class8.field71 != null) {
            class8.field71.removeFocusListener(this);
            class8.field71.getParent().remove(class8.field71);
        }
        field6244++;
        Container var2;
        if (class24.field347 != null) {
            var2 = class24.field347;
        } else if (class123.field1656 == null) {
            var2 = class219.field2794.field6891;
        } else {
            var2 = class123.field1656;
        }
        var2.setLayout(null);
        class8.field71 = new class222(this);
        var2.add(class8.field71);
        class8.field71.setSize(class174.field2262, class390.field5236);
        class8.field71.setVisible(true);
        if (class123.field1656 == var2) {
            Insets var3 = class123.field1656.getInsets();
            class8.field71.setLocation(var3.left + class468.field6762, var3.top - -class252.field3218);
        } else {
            class8.field71.setLocation(class468.field6762, class252.field3218);
        }
        class8.field71.addFocusListener(this);
        class8.field71.requestFocus();
        class534.field7855 = true;
        class290.field3700 = true;
        class140.field1805 = true;
        class83.field1046 = false;
        class303.field3889 = class504.method3034((byte) -97);
    }

    @OriginalMember(owner = "client!te", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class290.field3700 = false;
        field6254++;
    }

    @OriginalMember(owner = "client!te", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field6273++;
        if (class123.field1656 == null) {
            return class219.field2794 == null || class219.field2794.field6891 == this ? super.getDocumentBase() : class219.field2794.field6891.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field6242++;
        if (class123.field1656 == null) {
            return class219.field2794 == null || class219.field2794.field6891 == this ? super.getCodeBase() : class219.field2794.field6891.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field6252++;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    private final void method2564(byte arg0) {
        if (arg0 != -96) {
            return;
        }
        field6247++;
        long var2 = class504.method3034((byte) -99);
        long var4 = class28.field392[class349.field4494];
        class28.field392[class349.field4494] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class349.field4494 = class349.field4494 + 1 & 0x1F;
        synchronized (this) {
            class534.field7855 = class290.field3700;
        }
        this.method1239(-105);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public abstract void method1230(int arg0);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)Z")
    public final boolean method2565(byte arg0) {
        field6255++;
        if (arg0 != 38) {
            return false;
        }
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
                this.method2571("invalidhost", 74);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    private final void method2566(int arg0) {
        field6256++;
        long var2 = class504.method3034((byte) -104);
        long var4 = class469.field6798[class401.field5719];
        class469.field6798[class401.field5719] = var2;
        if ((long) arg0 != var4 && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class189.field2474 = ((var6 >> 1) + 32000) / var6;
        }
        class401.field5719 = class401.field5719 + 1 & 0x1F;
        if (class502.field7255++ > 50) {
            class140.field1805 = true;
            class502.field7255 -= 50;
            class8.field71.setSize(class174.field2262, class390.field5236);
            class8.field71.setVisible(true);
            if (class123.field1656 != null && class24.field347 == null) {
                Insets var7 = class123.field1656.getInsets();
                class8.field71.setLocation(class468.field6762 + var7.left, class252.field3218 + var7.top);
            } else {
                class8.field71.setLocation(class468.field6762, class252.field3218);
            }
        }
        this.method1227(arg0 - 29156);
    }

    @OriginalMember(owner = "client!te", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field6253++;
        if (class123.field1656 == null) {
            return class219.field2794 == null || class219.field2794.field6891 == this ? super.getAppletContext() : class219.field2794.field6891.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public String method1235(boolean arg0) {
        field6268++;
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public final void method2567(int arg0) {
        field6250++;
        if (arg0 != 16 || this.field6261) {
            return;
        }
        try {
            class121 var2 = class219.field2794.method2886((byte) 75, class449.field6432.getClass());
            while (var2.field1628 == 0) {
                class199.method1251(100L, (byte) -42);
            }
            if (var2.field1627 != null) {
                throw (Throwable) var2.field1627;
            }
            jagmisc.init();
            this.field6261 = true;
            class479.field7013 = class350.method2012(-122);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!te", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field6249++;
    }

    @OriginalMember(owner = "client!te", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field6251++;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public abstract void method1239(int arg0);

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
    public abstract void method1229(byte arg0);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZBIIILjava/lang/String;)V")
    public final void method2568(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6, String arg7) {
        try {
            class407.field5823 = arg0;
            class252.field3218 = 0;
            if (arg3 != 20) {
                this.paint(null);
            }
            class390.field5236 = arg1;
            class3.field33 = arg1;
            class468.field6762 = 0;
            class449.field6432 = this;
            class174.field2262 = arg5;
            class250.field3209 = arg5;
            class123.field1656 = new Frame();
            class123.field1656.setTitle("Jagex");
            class123.field1656.setResizable(true);
            class123.field1656.addWindowListener(this);
            class123.field1656.setVisible(true);
            class123.field1656.toFront();
            Insets var9 = class123.field1656.getInsets();
            class123.field1656.setSize(class250.field3209 + var9.left + var9.right, class3.field33 + var9.bottom + var9.top);
            class123.field1651 = class219.field2794 = new class476(null, arg6, arg7, arg4);
            class121 var10 = class219.field2794.method2870(false, 1, this);
            while (var10.field1628 == 0) {
                class199.method1251(10L, (byte) 34);
            }
        } catch (Exception var12) {
            class461.method2719(var12, null, 1);
        }
        field6266++;
    }

    @OriginalMember(owner = "client!te", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field6243++;
        if (class449.field6432 == this && !class424.field5999) {
            class290.field3698 = class504.method3034((byte) -105);
            class199.method1251(5000L, (byte) -108);
            class123.field1651 = null;
            this.method2569(108, false);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
    private final void method2569(int arg0, boolean arg1) {
        field6274++;
        synchronized (this) {
            if (class424.field5999) {
                return;
            }
            class424.field5999 = true;
        }
        if (class219.field2794.field6891 != null) {
            class219.field2794.field6891.destroy();
        }
        try {
            this.method1229((byte) -88);
        } catch (Exception var12) {
        }
        if (this.field6261) {
            try {
                jagmisc.quit();
            } catch (Throwable var11) {
            }
            this.field6261 = false;
        }
        class121 var4 = class219.field2794.method2873(0, class449.field6432.getClass());
        while (var4.field1628 == 0) {
            class199.method1251(100L, (byte) 118);
        }
        if (class8.field71 != null) {
            try {
                class8.field71.removeFocusListener(this);
                class8.field71.getParent().remove(class8.field71);
            } catch (Exception var10) {
            }
        }
        if (class219.field2794 != null) {
            try {
                class219.field2794.method2890(27251);
            } catch (Exception var9) {
            }
        }
        this.method1230(123);
        if (class123.field1656 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
        int var5 = 75 / ((arg0 - 60) / 42);
    }

    @OriginalMember(owner = "client!te", name = "stop", descriptor = "()V")
    public final void stop() {
        field6265++;
        if (class449.field6432 == this && !class424.field5999) {
            class290.field3698 = class504.method3034((byte) -114) + 4000L;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public abstract void method1227(int arg0);

    @OriginalMember(owner = "client!te", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field6262++;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public static void method2570(int arg0) {
        field6263 = null;
        int var1 = -79 / ((-arg0 - 65) / 51);
    }

    @OriginalMember(owner = "client!te", name = "run", descriptor = "()V")
    public final void run() {
        field6271++;
        try {
            label114: {
                if (class476.field6887 != null) {
                    String var1 = class476.field6887.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class476.field6899;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2571("wrongjava", -101);
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class476.field6899 == null || class476.field6899.equals("1.4.2"))) {
                        this.method2571("wrongjava", 103);
                        break label114;
                    }
                }
                if (class476.field6899 != null && class476.field6899.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class476.field6899.length()) {
                        char var5 = class476.field6899.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class511.field7419 = true;
                    }
                }
                if (class219.field2794.field6891 != null) {
                    Method var6 = class476.field6911;
                    if (var6 != null) {
                        try {
                            var6.invoke(class219.field2794.field6891, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class407.method2406(8);
                class91.method709((byte) 123);
                this.method2563((byte) 115);
                this.method2567(16);
                this.method1225(8216);
                class479.field7013 = class350.method2012(93);
                this.method2567(16);
                while (class290.field3698 == 0L || class290.field3698 > class504.method3034((byte) -109)) {
                    class226.field2879 = class479.field7013.method544(-126, class500.field7237);
                    for (int var7 = 0; var7 < class226.field2879; var7++) {
                        this.method2564((byte) -96);
                    }
                    this.method2566(0);
                    class156.method1016(class219.field2794, class8.field71, (byte) -92);
                }
            }
        } catch (Throwable var10) {
            class461.method2719(var10, this.method1235(true), 1);
            this.method2571("crash", 61);
        }
        this.method2569(109, true);
    }

    @OriginalMember(owner = "client!te", name = "start", descriptor = "()V")
    public final void start() {
        field6257++;
        if (class449.field6432 == this && !class424.field5999) {
            class290.field3698 = 0L;
        }
    }

    @OriginalMember(owner = "client!te", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field6269++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method2571(String arg0, int arg1) {
        field6258++;
        if (this.field6246) {
            return;
        }
        int var3 = -36 / ((4 - arg1) / 44);
        this.field6246 = true;
        System.out.println("error_game_" + arg0);
        try {
            class114.method825("loggedout", 13324, class219.field2794.field6891);
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!te", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field6248++;
        if (class449.field6432 != this || class424.field5999) {
            return;
        }
        class140.field1805 = true;
        if (class511.field7419 && class504.method3034((byte) -116) - class303.field3889 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class250.field3209 <= var2.width && class3.field33 <= var2.height) {
                class83.field1046 = true;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "providesignlink", descriptor = "(Lpc;)V")
    public static final void providesignlink(class476 arg0) {
        field6259++;
        class219.field2794 = arg0;
        class123.field1651 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
    public final void method2572(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6267++;
        try {
            if (class449.field6432 == null) {
                class449.field6432 = this;
                class390.field5236 = arg1;
                class3.field33 = arg1;
                class407.field5823 = arg3;
                if (arg0 == -21734) {
                    class252.field3218 = 0;
                    class468.field6762 = 0;
                    class174.field2262 = arg4;
                    class250.field3209 = arg4;
                    if (class219.field2794 == null) {
                        class123.field1651 = class219.field2794 = new class476(this, arg2, null, 0);
                    }
                    class121 var6 = class219.field2794.method2870(false, 1, this);
                    while (var6.field1628 == 0) {
                        class199.method1251(10L, (byte) 101);
                    }
                }
            } else {
                class361.field4662++;
                if (class361.field4662 >= 3) {
                    this.method2571("alreadyloaded", -114);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class461.method2719(var8, null, 1);
            this.method2571("crash", -40);
        }
    }

    @OriginalMember(owner = "client!te", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field6270++;
    }

    @OriginalMember(owner = "client!te", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
    public abstract void method1225(int arg0);

    @OriginalMember(owner = "client!te", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field6264++;
    }
}
