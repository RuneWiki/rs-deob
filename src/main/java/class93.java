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

@OriginalClass("client!vh")
public abstract class class93 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "Z")
    private boolean field1545 = false;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "Z")
    private boolean field1550 = false;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "Lvv;")
    public static class313 field1554;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "Lnk;")
    public static class326 field1555;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "F")
    public static float field1558;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "Z")
    public static boolean field1559;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "Z")
    public static boolean field1563;

    @OriginalMember(owner = "client!vh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1551++;
        class209.field3318 = false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public abstract void method479(int arg0);

    @OriginalMember(owner = "client!vh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1539++;
    }

    @OriginalMember(owner = "client!vh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class209.field3318 = true;
        field1532++;
        class45.field740 = true;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public abstract void method483(int arg0);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
    public final void method640(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1527++;
        try {
            if (class193.field3003 == null) {
                class358.field5581 = arg3;
                class412.field6245 = arg3;
                class296.field4764 = arg0;
                class49.field825 = arg2;
                class314.field4950 = arg2;
                class197.field3137 = 0;
                class193.field3003 = this;
                class311.field4923 = 0;
                if (class419.field6342 == null) {
                    class445.field6657 = class419.field6342 = new class493(this, arg1, null, 0);
                }
                if (arg4 == 9001) {
                    class169 var6 = class419.field6342.method2874(arg4 ^ 0x235C, this, 1);
                    while (var6.field2692 == 0) {
                        class444.method2667(arg4 - 37211, 10L);
                    }
                }
            } else {
                class162.field2579++;
                if (class162.field2579 >= 3) {
                    this.method646((byte) -76, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class502.method2968(null, (byte) -94, var8);
            this.method646((byte) -115, "crash");
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Ljava/lang/String;")
    public String method465(byte arg0) {
        field1524++;
        int var2 = 118 / ((arg0 - 76) / 41);
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1553++;
        if (class346.field5450 == null) {
            return class419.field6342 == null || class419.field6342.field7203 == this ? super.getAppletContext() : class419.field6342.field7203.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public abstract void method468(byte arg0);

    @OriginalMember(owner = "client!vh", name = "run", descriptor = "()V")
    public final void run() {
        field1538++;
        try {
            label110: {
                if (class493.field7193 != null) {
                    String var1 = class493.field7193.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class493.field7199;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method646((byte) -108, "wrongjava");
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class493.field7199 == null || class493.field7199.equals("1.4.2"))) {
                        this.method646((byte) -74, "wrongjava");
                        break label110;
                    }
                }
                if (class493.field7199 != null && class493.field7199.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class493.field7199.length() > var3) {
                        char var5 = class493.field7199.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class484.field7110 = true;
                    }
                }
                if (class419.field6342.field7203 != null) {
                    Method var6 = class493.field7208;
                    if (var6 != null) {
                        try {
                            var6.invoke(class419.field6342.field7203, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class438.method2651((byte) -58);
                class504.method2973(0);
                this.method641(118);
                this.method647((byte) 75);
                this.method483(121);
                class162.field2584 = class506.method2976((byte) -26);
                this.method647((byte) 88);
                while (class44.field730 == 0L || class19.method91((byte) 83) < class44.field730) {
                    class374.field5808 = class162.field2584.method262(class223.field3850, true);
                    for (int var7 = 0; var7 < class374.field5808; var7++) {
                        this.method645(112);
                    }
                    this.method648((byte) -89);
                    class177.method1196(class270.field4495, -111, class419.field6342);
                }
            }
        } catch (Throwable var10) {
            class502.method2968(this.method465((byte) 119), (byte) -96, var10);
            this.method646((byte) -74, "crash");
        }
        this.method642((byte) -13, true);
    }

    @OriginalMember(owner = "client!vh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1548++;
        if (class346.field5450 == null) {
            return class419.field6342 == null || class419.field6342.field7203 == this ? super.getDocumentBase() : class419.field6342.field7203.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
    public final synchronized void method641(int arg0) {
        if (class270.field4495 != null) {
            class270.field4495.removeFocusListener(this);
            class270.field4495.getParent().remove(class270.field4495);
        }
        field1526++;
        Container var2;
        if (class422.field6374 != null) {
            var2 = class422.field6374;
        } else if (class346.field5450 == null) {
            var2 = class419.field6342.field7203;
        } else {
            var2 = class346.field5450;
        }
        var2.setLayout(null);
        class270.field4495 = new class230(this);
        var2.add(class270.field4495);
        class270.field4495.setSize(class358.field5581, class49.field825);
        class270.field4495.setVisible(true);
        if (class346.field5450 == var2) {
            Insets var3 = class346.field5450.getInsets();
            class270.field4495.setLocation(class311.field4923 + var3.left, class197.field3137 + var3.top);
        } else {
            class270.field4495.setLocation(class311.field4923, class197.field3137);
        }
        class270.field4495.addFocusListener(this);
        class270.field4495.requestFocus();
        class131.field2248 = true;
        class209.field3318 = true;
        class45.field740 = true;
        class178.field2827 = false;
        if (arg0 > 102) {
            class224.field3873 = class19.method91((byte) 87);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)V")
    private final void method642(byte arg0, boolean arg1) {
        field1525++;
        synchronized (this) {
            if (class428.field6424) {
                return;
            }
            class428.field6424 = true;
        }
        if (class419.field6342.field7203 != null) {
            class419.field6342.field7203.destroy();
        }
        try {
            this.method479(503);
        } catch (Exception var11) {
        }
        if (this.field1550) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field1550 = false;
        }
        class248.method1685(true, false);
        class169 var4 = class419.field6342.method2896(0, class193.field3003.getClass());
        while (var4.field2692 == 0) {
            class444.method2667(-28210, 100L);
        }
        if (arg0 != -13) {
            this.run();
        }
        if (class270.field4495 != null) {
            try {
                class270.field4495.removeFocusListener(this);
                class270.field4495.getParent().remove(class270.field4495);
            } catch (Exception var9) {
            }
        }
        if (class419.field6342 != null) {
            try {
                class419.field6342.method2875((byte) 126);
            } catch (Exception var8) {
            }
        }
        this.method463(false);
        if (class346.field5450 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!vh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1540++;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
    public static void method643(int arg0) {
        if (arg0 > -6) {
            providesignlink(null);
        }
        field1555 = null;
        field1554 = null;
    }

    @OriginalMember(owner = "client!vh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1531++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!vh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1542++;
        if (class346.field5450 == null) {
            return class419.field6342 == null || class419.field6342.field7203 == this ? super.getCodeBase() : class419.field6342.field7203.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1543++;
        if (class193.field3003 != this || class428.field6424) {
            return;
        }
        class45.field740 = true;
        if (class484.field7110 && class19.method91((byte) 104) - class224.field3873 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class412.field6245 <= var2.width && var2.height >= class314.field4950) {
                class178.field2827 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1536++;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)Z")
    public final boolean method644(byte arg0) {
        field1522++;
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
            if (arg0 < 64) {
                this.start();
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method646((byte) -103, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "providesignlink", descriptor = "(Lnv;)V")
    public static final void providesignlink(class493 arg0) {
        class419.field6342 = arg0;
        class445.field6657 = arg0;
        field1530++;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)V")
    public abstract void method464(byte arg0);

    @OriginalMember(owner = "client!vh", name = "start", descriptor = "()V")
    public final void start() {
        field1552++;
        if (class193.field3003 == this && !class428.field6424) {
            class44.field730 = 0L;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
    private final void method645(int arg0) {
        if (arg0 <= 0) {
            this.method479(-66);
        }
        field1533++;
        long var2 = class19.method91((byte) 99);
        long var4 = class335.field5259[class162.field2573];
        class335.field5259[class162.field2573] = var2;
        class162.field2573 = class162.field2573 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class131.field2248 = class209.field3318;
        }
        this.method464((byte) 10);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method646(byte arg0, String arg1) {
        field1546++;
        if (this.field1545) {
            return;
        }
        this.field1545 = true;
        System.out.println("error_game_" + arg1);
        try {
            class456.method2735(-27001, "loggedout", class419.field6342.field7203);
        } catch (Throwable var4) {
        }
        try {
            if (arg0 > -73) {
                this.init();
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!vh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1541++;
    }

    @OriginalMember(owner = "client!vh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1529++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public abstract void method463(boolean arg0);

    @OriginalMember(owner = "client!vh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1537++;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)V")
    public final void method647(byte arg0) {
        field1523++;
        if (arg0 < 71 || this.field1550) {
            return;
        }
        try {
            class169 var2 = class419.field6342.method2872(16, class193.field3003.getClass());
            while (var2.field2692 == 0) {
                class444.method2667(-28210, 100L);
            }
            if (var2.field2695 != null) {
                throw (Throwable) var2.field2695;
            }
            jagmisc.init();
            this.field1550 = true;
            class162.field2584 = class506.method2976((byte) -26);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(B)V")
    private final void method648(byte arg0) {
        field1547++;
        long var2 = class19.method91((byte) 112);
        long var4 = class320.field5025[class189.field2956];
        if (arg0 > -46) {
            field1558 = -0.4139804F;
        }
        class320.field5025[class189.field2956] = var2;
        class189.field2956 = class189.field2956 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class247.field4240 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class436.field6518++) > 50) {
            class436.field6518 -= 50;
            class45.field740 = true;
            class270.field4495.setSize(class358.field5581, class49.field825);
            class270.field4495.setVisible(true);
            if (class346.field5450 != null && class422.field6374 == null) {
                Insets var7 = class346.field5450.getInsets();
                class270.field4495.setLocation(class311.field4923 + var7.left, class197.field3137 + var7.top);
            } else {
                class270.field4495.setLocation(class311.field4923, class197.field3137);
            }
        }
        this.method468((byte) 81);
    }

    @OriginalMember(owner = "client!vh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1534++;
    }

    @OriginalMember(owner = "client!vh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1535++;
        if (class346.field5450 == null) {
            return class419.field6342 == null || class419.field6342.field7203 == this ? super.getParameter(arg0) : class419.field6342.field7203.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1549++;
        if (class193.field3003 == this && !class428.field6424) {
            class44.field730 = class19.method91((byte) 79);
            class444.method2667(-28210, 5000L);
            class445.field6657 = null;
            this.method642((byte) -13, false);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZILjava/lang/String;ZIIII)V")
    public final void method649(boolean arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class193.field3003 = this;
            class49.field825 = arg6;
            class314.field4950 = arg6;
            class296.field4764 = arg7;
            class197.field3137 = 0;
            class311.field4923 = 0;
            class358.field5581 = arg5;
            class412.field6245 = arg5;
            class346.field5450 = new Frame();
            class346.field5450.setTitle("Jagex");
            class346.field5450.setResizable(true);
            class346.field5450.addWindowListener(this);
            class346.field5450.setVisible(arg3);
            class346.field5450.toFront();
            Insets var9 = class346.field5450.getInsets();
            class346.field5450.setSize(class412.field6245 + var9.left + var9.right, class314.field4950 + var9.bottom + var9.top);
            class445.field6657 = class419.field6342 = new class493(null, arg4, arg2, arg1);
            class169 var10 = class419.field6342.method2874(101, this, 1);
            while (var10.field2692 == 0) {
                class444.method2667(-28210, 10L);
            }
        } catch (Exception var12) {
            class502.method2968(null, (byte) -103, var12);
        }
        field1544++;
    }

    @OriginalMember(owner = "client!vh", name = "stop", descriptor = "()V")
    public final void stop() {
        field1521++;
        if (class193.field3003 == this && !class428.field6424) {
            class44.field730 = class19.method91((byte) 87) + 4000L;
        }
    }

    static {
        new class306(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field1554 = new class313(34, 2);
        field1555 = new class326(40, 2);
    }
}
