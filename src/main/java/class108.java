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

@OriginalClass("client!ju")
public abstract class class108 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "Z")
    private boolean field1304 = false;

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "Z")
    private boolean field1307 = false;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ju", name = "A", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ju", name = "B", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ju", name = "D", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ju", name = "F", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!ju", name = "G", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!ju", name = "J", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ju", name = "L", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!ju", name = "T", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!ju", name = "U", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ju", name = "W", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ju", name = "Y", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ju", name = "Z", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "Loa;")
    public static class605 field1302;

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "Ldba;")
    public static class79 field1317;

    @OriginalMember(owner = "client!ju", name = "M", descriptor = "Z")
    public static boolean field1321;

    @OriginalMember(owner = "client!ju", name = "N", descriptor = "Z")
    public static boolean field1322;

    @OriginalMember(owner = "client!ju", name = "O", descriptor = "Z")
    public static boolean field1323;

    @OriginalMember(owner = "client!ju", name = "P", descriptor = "Z")
    public static boolean field1324;

    @OriginalMember(owner = "client!ju", name = "Q", descriptor = "Z")
    public static boolean field1325;

    @OriginalMember(owner = "client!ju", name = "S", descriptor = "Z")
    public static boolean field1327;

    @OriginalMember(owner = "client!ju", name = "X", descriptor = "Z")
    public static boolean field1332;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    private final void method660(byte arg0) {
        field1288++;
        long var2 = class84.method550((byte) -82);
        long var4 = class488.field7122[class305.field4487];
        class488.field7122[class305.field4487] = var2;
        class305.field4487 = class305.field4487 + 1 & 0x1F;
        if (arg0 != -14) {
            return;
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class44.field466 = class509.field7405;
        }
        this.method665((byte) 98);
    }

    @OriginalMember(owner = "client!ju", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class635.field9135 = arg0;
        field1286++;
    }

    @OriginalMember(owner = "client!ju", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1290++;
        if (class114.field1430 == null) {
            return class635.field9135 == null || class635.field9135 == this ? super.getDocumentBase() : class635.field9135.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1291++;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Z")
    public final boolean method661(int arg0) {
        if (arg0 == -1) {
            field1300++;
            return class636.method3630(arg0 + 119, "jaclib");
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ju", name = "start", descriptor = "()V")
    public final void start() {
        field1318++;
        if (class385.field5811 == this && !class362.field5303) {
            class449.field6708 = 0L;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)Z")
    public final boolean method662(int arg0) {
        field1289++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 != 22656) {
            this.field1307 = false;
        }
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
                this.method667("invalidhost", arg0 ^ 0x58B5);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1303++;
    }

    @OriginalMember(owner = "client!ju", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1287++;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V")
    private final void method663(byte arg0) {
        field1298++;
        long var2 = class84.method550((byte) -114);
        long var4 = class565.field8056[class66.field725];
        class565.field8056[class66.field725] = var2;
        if (arg0 <= 86) {
            return;
        }
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class439.field6545 = ((var6 >> 1) + 32000) / var6;
        }
        class66.field725 = class66.field725 + 1 & 0x1F;
        if (class459.field6853++ > 50) {
            class630.field9093 = true;
            class459.field6853 -= 50;
            class30.field348.setSize(class581.field8366, class298.field4407);
            class30.field348.setVisible(true);
            if (class114.field1430 != null && class375.field5714 == null) {
                Insets var7 = class114.field1430.getInsets();
                class30.field348.setLocation(var7.left + class324.field4678, class59.field674 + var7.top);
            } else {
                class30.field348.setLocation(class324.field4678, class59.field674);
            }
        }
        this.method669(false);
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
    public final synchronized void method664(int arg0) {
        if (class30.field348 != null) {
            class30.field348.removeFocusListener(this);
            class30.field348.getParent().remove(class30.field348);
        }
        field1320++;
        Container var2;
        if (class375.field5714 != null) {
            var2 = class375.field5714;
        } else if (class114.field1430 != null) {
            var2 = class114.field1430;
        } else if (class635.field9135 == null) {
            var2 = class385.field5811;
        } else {
            var2 = class635.field9135;
        }
        var2.setLayout(null);
        class30.field348 = new class304(this);
        var2.add(class30.field348);
        class30.field348.setSize(class581.field8366, class298.field4407);
        class30.field348.setVisible(true);
        if (class114.field1430 == var2) {
            Insets var3 = class114.field1430.getInsets();
            class30.field348.setLocation(class324.field4678 + var3.left, class59.field674 + var3.top);
        } else {
            class30.field348.setLocation(class324.field4678, class59.field674);
        }
        class30.field348.addFocusListener(this);
        class30.field348.requestFocus();
        if (arg0 != -19285) {
            field1313 = -119;
        }
        class44.field466 = true;
        class509.field7405 = true;
        class630.field9093 = true;
        class27.field292 = false;
        class141.field1739 = class84.method550((byte) -121);
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)V")
    public abstract void method665(byte arg0);

    @OriginalMember(owner = "client!ju", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1314++;
    }

    @OriginalMember(owner = "client!ju", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1312++;
        if (class114.field1430 == null) {
            return class635.field9135 == null || class635.field9135 == this ? super.getAppletContext() : class635.field9135.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIILjava/lang/String;IB)V")
    public final void method666(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, byte arg6) {
        field1311++;
        try {
            if (class385.field5811 == null) {
                if (arg6 != 109) {
                    this.method672(true, (byte) -125);
                }
                class324.field4678 = 0;
                class59.field679 = class635.field9135;
                class59.field674 = 0;
                class298.field4407 = arg0;
                class434.field6446 = arg0;
                class581.field8366 = arg3;
                class477.field7037 = arg3;
                class508.field7387 = arg5;
                class385.field5811 = this;
                class32.field356 = class20.field197 = new class545(arg2, arg4, arg1, class635.field9135 != null);
                class175 var8 = class20.field197.method3177(1, -127, this);
                while (var8.field2138 == 0) {
                    class646.method3696(1, 10L);
                }
            } else {
                class232.field3249++;
                if (class232.field3249 >= 3) {
                    this.method667("alreadyloaded", 62);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class630.method3607(7, var10, null);
            this.method667("crash", arg6 ^ 0x47);
        }
    }

    @OriginalMember(owner = "client!ju", name = "run", descriptor = "()V")
    public final void run() {
        field1309++;
        try {
            label110: {
                if (class545.field7798 != null) {
                    String var1 = class545.field7798.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class545.field7787;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method667("wrongjava", 21);
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class545.field7787 == null || class545.field7787.equals("1.4.2"))) {
                        this.method667("wrongjava", 50);
                        break label110;
                    }
                }
                if (class545.field7787 != null && class545.field7787.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class545.field7787.length()) {
                        char var5 = class545.field7787.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class517.field7524 = true;
                    }
                }
                if (class635.field9135 != null) {
                    Method var6 = class545.field7790;
                    if (var6 != null) {
                        try {
                            var6.invoke(class635.field9135, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class322.method2100(96);
                class633.method3614(0);
                this.method664(-19285);
                this.method678((byte) 31);
                class51.field544 = class467.method2854(-65);
                while (class449.field6708 == 0L || class84.method550((byte) -126) < class449.field6708) {
                    class613.field8914 = class51.field544.method3187(-127, class114.field1426);
                    for (int var7 = 0; var7 < class613.field8914; var7++) {
                        this.method660((byte) -14);
                    }
                    this.method663((byte) 103);
                    class119.method743(class20.field197, class30.field348, -51);
                }
            }
        } catch (Throwable var10) {
            class630.method3607(7, var10, this.method668((byte) 85));
            this.method667("crash", 84);
        }
        this.method672(true, (byte) 117);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method667(String arg0, int arg1) {
        field1306++;
        if (this.field1307) {
            return;
        }
        this.field1307 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 < 15) {
                this.getCodeBase();
            }
            class314.method2067(-24319, "loggedout", class635.field9135);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(B)Ljava/lang/String;")
    public String method668(byte arg0) {
        int var2 = -103 / ((7 - arg0) / 38);
        field1283++;
        return null;
    }

    @OriginalMember(owner = "client!ju", name = "stop", descriptor = "()V")
    public final void stop() {
        field1294++;
        if (class385.field5811 == this && !class362.field5303) {
            class449.field6708 = class84.method550((byte) -107) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ju", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1299++;
        if (class114.field1430 == null) {
            return class635.field9135 == null || class635.field9135 == this ? super.getCodeBase() : class635.field9135.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1284++;
        if (class385.field5811 != this || class362.field5303) {
            return;
        }
        class630.field9093 = true;
        if (class517.field7524 && (class84.method550((byte) -128) - class141.field1739) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class477.field7037 && class434.field6446 <= var2.height) {
                class27.field292 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class509.field7405 = true;
        field1297++;
        class630.field9093 = true;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
    public abstract void method669(boolean arg0);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIIZLjava/lang/String;I)V")
    public final void method670(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, String arg6, int arg7) {
        try {
            class298.field4407 = arg2;
            class434.field6446 = arg2;
            class59.field679 = null;
            class324.field4678 = 0;
            class385.field5811 = this;
            class59.field674 = arg4;
            class508.field7387 = arg3;
            class581.field8366 = arg0;
            class477.field7037 = arg0;
            class114.field1430 = new Frame();
            class114.field1430.setTitle("Jagex");
            class114.field1430.setResizable(true);
            class114.field1430.addWindowListener(this);
            class114.field1430.setVisible(true);
            class114.field1430.toFront();
            Insets var9 = class114.field1430.getInsets();
            class114.field1430.setSize(class477.field7037 + var9.right + var9.left, class434.field6446 + var9.top + var9.bottom);
            class32.field356 = class20.field197 = new class545(arg7, arg6, arg1, true);
            class175 var10 = class20.field197.method3177(1, -127, this);
            while (var10.field2138 == 0) {
                class646.method3696(1, 10L);
            }
        } catch (Exception var12) {
            class630.method3607(7, var12, null);
        }
        field1301++;
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
    public static void method671(int arg0) {
        field1317 = null;
        field1302 = null;
        if (arg0 != 10) {
            field1317 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1295++;
        if (class385.field5811 == this && !class362.field5303) {
            class449.field6708 = class84.method550((byte) -115);
            class646.method3696(1, 5000L);
            class32.field356 = null;
            this.method672(false, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZB)V")
    private final void method672(boolean arg0, byte arg1) {
        field1316++;
        synchronized (this) {
            if (class362.field5303) {
                return;
            }
            class362.field5303 = true;
        }
        if (class635.field9135 != null) {
            class635.field9135.destroy();
        }
        try {
            this.method674(0);
        } catch (Exception var10) {
        }
        if (this.field1304) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field1304 = false;
        }
        class284.method1835(-2662, true);
        class320.method2085(0);
        if (arg1 <= 66) {
            return;
        }
        if (class30.field348 != null) {
            try {
                class30.field348.removeFocusListener(this);
                class30.field348.getParent().remove(class30.field348);
            } catch (Exception var8) {
            }
        }
        if (class20.field197 != null) {
            try {
                class20.field197.method3172(125);
            } catch (Exception var7) {
            }
        }
        this.method673(false);
        if (class114.field1430 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ju", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1315++;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)V")
    public abstract void method673(boolean arg0);

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)V")
    public abstract void method674(int arg0);

    @OriginalMember(owner = "client!ju", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1310++;
        if (class114.field1430 == null) {
            return class635.field9135 == null || class635.field9135 == this ? super.getParameter(arg0) : class635.field9135.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1292++;
    }

    @OriginalMember(owner = "client!ju", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(Z)Z")
    public final boolean method675(boolean arg0) {
        field1319++;
        return arg0 ? class636.method3630(104, "jagmisc") : true;
    }

    @OriginalMember(owner = "client!ju", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1285++;
    }

    @OriginalMember(owner = "client!ju", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class509.field7405 = false;
        field1308++;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lkr;Z)V")
    public static final void method676(class645 arg0, boolean arg1) {
        if (arg1) {
            field1302 = null;
        }
        field1305++;
        for (int var2 = 0; var2 < class344.field4914; var2++) {
            int var3 = class224.field3146[var2];
            class655 var4 = class142.field1749[var3];
            int var5 = arg0.method1177(255);
            if ((var5 & 0x20) != 0) {
                var5 += arg0.method1177(255) << 8;
            }
            if ((var5 & 0x800) != 0) {
                var5 += arg0.method1177(255) << 16;
            }
            class94.method595(var4, arg0, var3, true, var5);
        }
    }

    @OriginalMember(owner = "client!ju", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1296++;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lad;[BIIIIIZ)Lah;")
    public static final class325 method677(class362 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg5 != 19124) {
            field1317 = null;
        }
        field1293++;
        if (!arg0.field5433 && (!class229.method1482(arg4, 73) || !class229.method1482(arg6, arg5 - 19053))) {
            return arg0.field5473 ? new class325(arg0, 34037, arg2, arg4, arg6, arg7, arg1, arg3) : new class325(arg0, arg2, arg4, arg6, class367.method2354(-224121456, arg4), class367.method2354(-224121456, arg6), arg1, arg3);
        } else {
            return new class325(arg0, 3553, arg2, arg4, arg6, arg7, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "(B)V")
    public abstract void method678(byte arg0);

    static {
        new class474(" days.", " Tage.", " jours.", " dias.");
    }
}
