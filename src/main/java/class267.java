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

@OriginalClass("client!un")
public abstract class class267 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!un", name = "w", descriptor = "Z")
    private boolean field3541 = false;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "Z")
    private boolean field3528 = false;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "Lh;")
    public static class434 field3534 = new class434(57, 12);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "Lr;")
    public static class110 field3552;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "Lcc;")
    public static class474 field3553;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
    public static boolean field3526;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "Z")
    public static boolean field3556;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "Z")
    public static boolean field3557;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "Z")
    public static boolean field3559;

    @OriginalMember(owner = "client!un", name = "providesignlink", descriptor = "(Lml;)V", line = 3)
    public static final void providesignlink(class241 arg0) {
        field3519++;
        class251.field3359 = arg0;
        class291.field3909 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 13)
    public final void windowActivated(WindowEvent arg0) {
        field3525++;
    }

    @OriginalMember(owner = "client!un", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 20)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3546++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 28)
    public final synchronized void method1504(int arg0) {
        if (class28.field378 != null) {
            class28.field378.removeFocusListener(this);
            class28.field378.getParent().remove(class28.field378);
        }
        field3531++;
        Container var2;
        if (class94.field1398 != null) {
            var2 = class94.field1398;
        } else if (class492.field6883 == null) {
            var2 = class251.field3359.field3209;
        } else {
            var2 = class492.field6883;
        }
        var2.setLayout((LayoutManager) null);
        class28.field378 = new class483(this);
        var2.add(class28.field378);
        class28.field378.setSize(class424.field5738, class72.field986);
        class28.field378.setVisible(true);
        if (class492.field6883 == var2) {
            Insets var3 = class492.field6883.getInsets();
            class28.field378.setLocation(var3.left + class178.field2416, class145.field2091 + var3.top);
        } else {
            class28.field378.setLocation(class178.field2416, class145.field2091);
        }
        class28.field378.addFocusListener(this);
        class28.field378.requestFocus();
        class31.field423 = true;
        class39.field569 = true;
        class251.field3346 = true;
        if (arg0 != -1) {
            field3534 = null;
        }
        class434.field5906 = false;
        class300.field4008 = class440.method2583(arg0 ^ 0xFFFF9D4C);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 75)
    public static void method1505(byte arg0) {
        if (arg0 <= -51) {
            field3552 = null;
            field3534 = null;
            field3553 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIZZ)V", line = 88)
    public static final void method1506(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class302.field4025 = arg0;
        class230.field3020 = 0x1 << class302.field4025;
        class235.field3119 = class230.field3020 >> 1;
        class175.field2389 = (int) Math.sqrt((double) (class235.field3119 * class235.field3119 + class235.field3119 * class235.field3119));
        class143.field2058 = arg2;
        class91.field1344 = arg3;
        class314.field4169 = arg4;
        class109.field1637 = new class491[arg1][class143.field2058][class91.field1344];
        class289.field3896 = new class177[arg1];
        if (arg5) {
            class136.field1977 = new int[class143.field2058][class91.field1344];
            class56.field768 = new byte[class143.field2058][class91.field1344];
            class246.field3284 = new byte[class143.field2058][class91.field1344];
            class308.field4077 = new class491[1][class143.field2058][class91.field1344];
            class312.field4112 = new class177[1];
        } else {
            class136.field1977 = null;
            class56.field768 = null;
            class246.field3284 = null;
            class308.field4077 = null;
            class312.field4112 = null;
        }
        if (arg6) {
            class132.field1943 = new long[arg1][arg2][arg3];
            class276.field3652 = new class263[65535];
            class363.field4975 = new boolean[65535];
            class162.field2259 = 0;
        } else {
            class132.field1943 = null;
            class276.field3652 = null;
            class363.field4975 = null;
            class162.field2259 = 0;
        }
        class410.method2459(false);
        class123.field1800 = new class143[500];
        class398.field5490 = 0;
        class51.field676 = new class143[500];
        class466.field6457 = 0;
        class448.field6103 = new int[arg1][class143.field2058 + 1][class91.field1344 + 1];
        class480.field6635 = new class471[5000];
        class400.field5504 = 0;
        class150.field2125 = new boolean[class314.field4169 + class314.field4169 + 1][class314.field4169 + class314.field4169 + 1];
        class37.field552 = new boolean[class314.field4169 + class314.field4169 + 2][class314.field4169 + class314.field4169 + 2];
        class67.field913 = null;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 142)
    public final void method1507(int arg0) {
        if (arg0 != 17220) {
            field3534 = null;
        }
        field3550++;
        if (this.field3528) {
            return;
        }
        try {
            class474 var2 = class251.field3359.method1334(arg0 - 17220, class235.field3117.getClass());
            while (var2.field6534 == 0) {
                class374.method2298(-28114, 100L);
            }
            if (var2.field6529 != null) {
                throw (Throwable) var2.field6529;
            }
            jagmisc.init();
            this.field3528 = true;
            class250.field3335 = class453.method2662((byte) -115);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZIILjava/lang/String;II)V", line = 173)
    public final void method1508(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field3538++;
        try {
            class178.field2416 = 0;
            class235.field3117 = this;
            class270.field3609 = arg6;
            if (arg0 != -4078) {
                this.method1037(-8);
            }
            class424.field5738 = arg1;
            class383.field5274 = arg1;
            class72.field986 = arg4;
            class152.field2139 = arg4;
            class145.field2091 = 0;
            class492.field6883 = new Frame();
            class492.field6883.setTitle("Jagex");
            class492.field6883.setResizable(true);
            class492.field6883.addWindowListener(this);
            class492.field6883.setVisible(true);
            class492.field6883.toFront();
            Insets var9 = class492.field6883.getInsets();
            class492.field6883.setSize(class383.field5274 + var9.left + var9.right, var9.top + var9.bottom + class152.field2139);
            class291.field3909 = class251.field3359 = new class241((Applet) null, arg7, arg5, arg3);
            class474 var10 = class251.field3359.method1351(1, arg0 + 11078, this);
            while (var10.field6534 == 0) {
                class374.method2298(-28114, 10L);
            }
        } catch (Exception var12) {
            class228.method1278(var12, (String) null, -30116);
        }
    }

    @OriginalMember(owner = "client!un", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 218)
    public final URL getCodeBase() {
        field3545++;
        if (class492.field6883 == null) {
            return class251.field3359 == null || class251.field3359.field3209 == this ? super.getCodeBase() : class251.field3359.field3209.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!un", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 234)
    public final void windowClosed(WindowEvent arg0) {
        field3543++;
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(I)Z", line = 251)
    public final boolean method1509(int arg0) {
        field3539++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 >= -112) {
            method1513(false, (class32) null);
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
                this.method1512(1, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 285)
    public final String getParameter(String arg0) {
        field3521++;
        if (class492.field6883 == null) {
            return class251.field3359 == null || class251.field3359.field3209 == this ? super.getParameter(arg0) : class251.field3359.field3209.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V", line = 302)
    private final void method1510(int arg0) {
        if (arg0 != 0) {
            this.windowClosed((WindowEvent) null);
        }
        field3554++;
        long var2 = class440.method2583(25267);
        long var4 = class45.field617[class172.field2355];
        class45.field617[class172.field2355] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class172.field2355 = class172.field2355 + 1 & 0x1F;
        synchronized (this) {
            class39.field569 = class31.field423;
        }
        this.method1041(false);
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V", line = 334)
    private final void method1511(int arg0) {
        field3532++;
        long var2 = class440.method2583(25267);
        long var4 = class102.field1470[class62.field824];
        class102.field1470[class62.field824] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class437.field5935 = ((var6 >> 1) + 32000) / var6;
        }
        class62.field824 = class62.field824 + 1 & 0x1F;
        if (class91.field1327++ > 50) {
            class251.field3346 = true;
            class91.field1327 -= 50;
            class28.field378.setSize(class424.field5738, class72.field986);
            class28.field378.setVisible(true);
            if (class492.field6883 != null && class94.field1398 == null) {
                Insets var7 = class492.field6883.getInsets();
                class28.field378.setLocation(class178.field2416 + var7.left, class145.field2091 + var7.top);
            } else {
                class28.field378.setLocation(class178.field2416, class145.field2091);
            }
        }
        this.method1037(-102);
        if (arg0 < 84) {
            this.method1514(1, -103, -46, -18, -8);
        }
    }

    @OriginalMember(owner = "client!un", name = "destroy", descriptor = "()V", line = 379)
    public final void destroy() {
        field3523++;
        if (class235.field3117 == this && !class462.field6262) {
            class219.field2926 = class440.method2583(25267);
            class374.method2298(-28114, 5000L);
            class291.field3909 = null;
            this.method1515((byte) 82, false);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;)V", line = 395)
    public final void method1512(int arg0, String arg1) {
        field3527++;
        if (this.field3541) {
            return;
        }
        this.field3541 = true;
        if (arg0 != 1) {
            this.field3528 = true;
        }
        System.out.println("error_game_" + arg1);
        try {
            class361.method2207(class251.field3359.field3209, "loggedout", (byte) -84);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!un", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 420)
    public final void windowDeactivated(WindowEvent arg0) {
        field3536++;
    }

    @OriginalMember(owner = "client!un", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 433)
    public final void windowIconified(WindowEvent arg0) {
        field3551++;
    }

    @OriginalMember(owner = "client!un", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 441)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3537++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZLbt;)Loq;", line = 455)
    public static final class220 method1513(boolean arg0, class32 arg1) {
        if (arg0) {
            field3542++;
            return new class220(arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method219(-112), arg1.method201((byte) -111));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!un", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 467)
    public final void windowOpened(WindowEvent arg0) {
        field3548++;
    }

    @OriginalMember(owner = "client!un", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 478)
    public final URL getDocumentBase() {
        field3522++;
        if (class492.field6883 == null) {
            return class251.field3359 == null || class251.field3359.field3209 == this ? super.getDocumentBase() : class251.field3359.field3209.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V", line = 496)
    public final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3535++;
        try {
            if (arg3 < 58) {
                this.windowClosed((WindowEvent) null);
            }
            if (class235.field3117 == null) {
                class72.field986 = arg4;
                class152.field2139 = arg4;
                class270.field3609 = arg1;
                class178.field2416 = 0;
                class235.field3117 = this;
                class145.field2091 = 0;
                class424.field5738 = arg0;
                class383.field5274 = arg0;
                if (class251.field3359 == null) {
                    class291.field3909 = class251.field3359 = new class241(this, arg2, (String) null, 0);
                }
                class474 var6 = class251.field3359.method1351(1, 7000, this);
                while (var6.field6534 == 0) {
                    class374.method2298(-28114, 10L);
                }
            } else {
                class295.field3946++;
                if (class295.field3946 >= 3) {
                    this.method1512(1, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class228.method1278(var8, (String) null, -30116);
            this.method1512(1, "crash");
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BZ)V", line = 543)
    private final void method1515(byte arg0, boolean arg1) {
        field3533++;
        synchronized (this) {
            if (class462.field6262) {
                return;
            }
            class462.field6262 = true;
        }
        if (class251.field3359.field3209 != null) {
            class251.field3359.field3209.destroy();
        }
        try {
            this.method1056(18);
        } catch (Exception var11) {
        }
        if (this.field3528) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3528 = false;
        }
        class474 var4 = class251.field3359.method1353(11, class235.field3117.getClass());
        while (var4.field6534 == 0) {
            class374.method2298(-28114, 100L);
        }
        if (class28.field378 != null) {
            try {
                class28.field378.removeFocusListener(this);
                class28.field378.getParent().remove(class28.field378);
            } catch (Exception var9) {
            }
        }
        if (class251.field3359 != null) {
            try {
                class251.field3359.method1350(0);
            } catch (Exception var8) {
            }
        }
        if (arg0 != 82) {
            return;
        }
        this.method1043((byte) -59);
        if (class492.field6883 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!un", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 622)
    public final AppletContext getAppletContext() {
        field3549++;
        if (class492.field6883 == null) {
            return class251.field3359 == null || class251.field3359.field3209 == this ? super.getAppletContext() : class251.field3359.field3209.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!un", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 638)
    public final void focusLost(FocusEvent arg0) {
        field3529++;
        class31.field423 = false;
    }

    @OriginalMember(owner = "client!un", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 646)
    public final void windowDeiconified(WindowEvent arg0) {
        field3547++;
    }

    @OriginalMember(owner = "client!un", name = "run", descriptor = "()V", line = 654)
    public final void run() {
        field3520++;
        try {
            label115: {
                if (class241.field3213 != null) {
                    String var1 = class241.field3213.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class241.field3216;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1512(1, "wrongjava");
                            break label115;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class241.field3216 == null || class241.field3216.equals("1.4.2"))) {
                        this.method1512(1, "wrongjava");
                        break label115;
                    }
                }
                if (class241.field3216 != null && class241.field3216.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class241.field3216.length()) {
                        char var5 = class241.field3216.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class187.field2562 = true;
                    }
                }
                if (class251.field3359.field3209 != null) {
                    Method var6 = class241.field3225;
                    if (var6 != null) {
                        try {
                            var6.invoke(class251.field3359.field3209, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class252.method1413(-67);
                class73.method474(0);
                this.method1504(-1);
                this.method1052((byte) -97);
                class250.field3335 = class453.method2662((byte) -123);
                this.method1507(17220);
                while (class219.field2926 == 0L || class440.method2583(25267) < class219.field2926) {
                    class188.field2576 = class250.field3335.method136(false, class160.field2211);
                    for (int var7 = 0; var7 < class188.field2576; var7++) {
                        this.method1510(0);
                    }
                    this.method1511(94);
                    class47.method339(class251.field3359, class28.field378, 0);
                }
            }
        } catch (Exception var10) {
            class228.method1278(var10, (String) null, -30116);
            this.method1512(1, "crash");
        }
        this.method1515((byte) 82, true);
    }

    @OriginalMember(owner = "client!un", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 770)
    public final void focusGained(FocusEvent arg0) {
        class31.field423 = true;
        field3530++;
        class251.field3346 = true;
    }

    @OriginalMember(owner = "client!un", name = "start", descriptor = "()V", line = 788)
    public final void start() {
        field3524++;
        if (class235.field3117 == this && !class462.field6262) {
            class219.field2926 = 0L;
        }
    }

    @OriginalMember(owner = "client!un", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 802)
    public final synchronized void paint(Graphics arg0) {
        field3544++;
        if (class235.field3117 != this || class462.field6262) {
            return;
        }
        class251.field3346 = true;
        if (class187.field2562 && (class440.method2583(25267) - class300.field4008) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class383.field5274 <= var2.width && class152.field2139 <= var2.height) {
                class434.field5906 = true;
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "stop", descriptor = "()V", line = 827)
    public final void stop() {
        field3540++;
        if (class235.field3117 == this && !class462.field6262) {
            class219.field2926 = class440.method2583(25267) + 4000L;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
    public abstract void method1041(boolean arg0);

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
    public abstract void method1037(int arg0);

    @OriginalMember(owner = "client!un", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
    public abstract void method1056(int arg0);

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
    public abstract void method1052(byte arg0);

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V")
    public abstract void method1043(byte arg0);
}
