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

@OriginalClass("client!vf")
public abstract class class39 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Z")
    private boolean field537 = false;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Loh;")
    public static class258 field544 = class153.method1046("Card:", 99);

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Z")
    public static boolean field551 = true;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field561 = 0;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "[I")
    public static int[] field557 = new int[128];

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Lgb;")
    public static class213 field560;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "Z")
    public static boolean field563;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "Z")
    public static boolean field564;

    @OriginalMember(owner = "client!vf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 5)
    public final void windowClosed(WindowEvent arg0) {
        field531++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILjava/lang/String;IB)V", line = 12)
    public final void method294(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, byte arg6) {
        field548++;
        if (arg6 <= 114) {
            this.windowDeactivated((WindowEvent) null);
        }
        try {
            class252.field4344 = this;
            class42.field577 = arg2;
            class314.field5326 = arg2;
            class115.field2052 = 0;
            class218.field3773 = arg3;
            class276.field4762 = arg3;
            class226.field3892 = arg1;
            class63.field1098 = 0;
            class284.field4882 = new Frame();
            class284.field4882.setTitle("Jagex");
            class284.field4882.setResizable(true);
            class284.field4882.addWindowListener(this);
            class284.field4882.setVisible(true);
            class284.field4882.toFront();
            Insets var8 = class284.field4882.getInsets();
            class284.field4882.setSize(class276.field4762 + var8.left + var8.right, class314.field5326 - -var8.bottom + var8.top);
            class45.field681 = class297.field5086 = new class295((Applet) null, arg0, arg4, arg5);
            class116 var9 = class297.field5086.method2070(1, this, -99);
            while (var9.field2067 == 0) {
                class237.method1628((byte) -88, 10L);
            }
            class121.field2126 = (Thread) var9.field2063;
        } catch (Exception var11) {
            class107.method796(var11, (byte) -20, (String) null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 52)
    public final synchronized void paint(Graphics arg0) {
        field535++;
        if (class252.field4344 != this || class103.field1880) {
            return;
        }
        class243.field4227 = true;
        if (class102.field1861 && !class257.field4390 && class25.method197(-3418) - class277.field4766 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class276.field4762 && class314.field5326 <= var2.height) {
                class311.field5265 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 73)
    public final void windowActivated(WindowEvent arg0) {
        field541++;
    }

    @OriginalMember(owner = "client!vf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 93)
    public final void focusLost(FocusEvent arg0) {
        class167.field2828 = false;
        field553++;
    }

    @OriginalMember(owner = "client!vf", name = "destroy", descriptor = "()V", line = 109)
    public final void destroy() {
        field555++;
        if (class252.field4344 == this && !class103.field1880) {
            class167.field2835 = class25.method197(-3418);
            class237.method1628((byte) -88, 5000L);
            class45.field681 = null;
            this.method304((byte) 53, false);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLjava/lang/String;)V", line = 125)
    public final void method295(byte arg0, String arg1) {
        field556++;
        if (this.field537) {
            return;
        }
        if (arg0 != -40) {
            this.windowDeiconified((WindowEvent) null);
        }
        this.field537 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!vf", name = "start", descriptor = "()V", line = 147)
    public final void start() {
        field538++;
        if (class252.field4344 == this && !class103.field1880) {
            class167.field2835 = 0L;
        }
    }

    @OriginalMember(owner = "client!vf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 160)
    public final void focusGained(FocusEvent arg0) {
        field530++;
        class167.field2828 = true;
        class243.field4227 = true;
    }

    @OriginalMember(owner = "client!vf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 169)
    public final void windowOpened(WindowEvent arg0) {
        field562++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 180)
    public final synchronized void method296(int arg0) {
        field542++;
        if (class5.field67 != null) {
            class5.field67.removeFocusListener(this);
            class5.field67.getParent().remove(class5.field67);
        }
        Container var2;
        if (class71.field1253 != null) {
            var2 = class71.field1253;
        } else if (class284.field4882 == null) {
            var2 = class297.field5086.field5061;
        } else {
            var2 = class284.field4882;
        }
        var2.setLayout((LayoutManager) null);
        class5.field67 = new class99(this);
        var2.add(class5.field67);
        class5.field67.setSize(class218.field3773, class42.field577);
        class5.field67.setVisible(true);
        if (class284.field4882 == var2) {
            Insets var3 = class284.field4882.getInsets();
            class5.field67.setLocation(var3.left + class115.field2052, class63.field1098 + var3.top);
        } else {
            class5.field67.setLocation(class115.field2052, class63.field1098);
        }
        class5.field67.addFocusListener(this);
        class5.field67.requestFocus();
        class124.field2200 = true;
        class167.field2828 = true;
        if (arg0 == -1) {
            class243.field4227 = true;
            class311.field5265 = false;
            class277.field4766 = class25.method197(-3418);
        }
    }

    @OriginalMember(owner = "client!vf", name = "stop", descriptor = "()V", line = 232)
    public final void stop() {
        field545++;
        if (class252.field4344 == this && !class103.field1880) {
            class167.field2835 = class25.method197(-3418) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vf", name = "run", descriptor = "()V", line = 246)
    public final void run() {
        field543++;
        try {
            if (class295.field5075 != null) {
                String var1 = class295.field5075.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class295.field5073;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method295((byte) -40, "wrongjava");
                        return;
                    }
                    class36.field477 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class295.field5073 == null || class295.field5073.equals("1.4.2"))) {
                    this.method295((byte) -40, "wrongjava");
                    return;
                }
            }
            if (class295.field5073 != null && class295.field5073.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class295.field5073.length()) {
                    char var5 = class295.field5073.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 - (48 - var5);
                }
                if (var4 >= 5) {
                    class102.field1861 = true;
                }
            }
            if (class297.field5086.field5061 != null) {
                Method var6 = class295.field5079;
                if (var6 != null) {
                    try {
                        var6.invoke(class297.field5086.field5061, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method296(-1);
            class83.field1407 = class108.method799(15, class42.field577, class5.field67, class218.field3773);
            this.method301(0);
            class317.field5349 = class47.method387((byte) -114);
            while (class167.field2835 == 0L || class25.method197(-3418) < class167.field2835) {
                class265.field4624 = class317.field5349.method432((byte) -125, class36.field477, class265.field4614);
                for (int var8 = 0; var8 < class265.field4624; var8++) {
                    this.method303(true);
                }
                this.method300(-21204);
                class68.method510(class297.field5086, class5.field67, false);
            }
        } catch (Exception var11) {
            class107.method796(var11, (byte) -27, (String) null);
            this.method295((byte) -40, "crash");
        }
        this.method304((byte) 53, true);
    }

    @OriginalMember(owner = "client!vf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 355)
    public final String getParameter(String arg0) {
        field552++;
        if (class284.field4882 == null) {
            return class297.field5086 == null || class297.field5086.field5061 == this ? super.getParameter(arg0) : class297.field5086.field5061.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 371)
    public final void windowIconified(WindowEvent arg0) {
        field540++;
    }

    @OriginalMember(owner = "client!vf", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 379)
    public final URL getCodeBase() {
        field558++;
        if (class284.field4882 == null) {
            return class297.field5086 == null || class297.field5086.field5061 == this ? super.getCodeBase() : class297.field5086.field5061.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Z", line = 396)
    public final boolean method298(int arg0) {
        field536++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 23009) {
                field544 = (class258) null;
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
                this.method295((byte) -40, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 437)
    public final void update(Graphics arg0) {
        field539++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V", line = 445)
    public static void method299(int arg0) {
        field557 = null;
        field544 = null;
        if (arg0 == -1) {
            field560 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V", line = 458)
    private final void method300(int arg0) {
        field559++;
        long var2 = class25.method197(-3418);
        long var4 = class242.field4200[class226.field3894];
        class242.field4200[class226.field3894] = var2;
        if (arg0 != -21204) {
            this.method298(-55);
        }
        class226.field3894 = class226.field3894 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class149.field2533 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class90.field1589++) > 50) {
            class90.field1589 -= 50;
            class243.field4227 = true;
            class5.field67.setSize(class218.field3773, class42.field577);
            class5.field67.setVisible(true);
            if (class284.field4882 != null && class71.field1253 == null) {
                Insets var7 = class284.field4882.getInsets();
                class5.field67.setLocation(class115.field2052 + var7.left, class63.field1098 + var7.top);
            } else {
                class5.field67.setLocation(class115.field2052, class63.field1098);
            }
        }
        this.method302(-111);
    }

    @OriginalMember(owner = "client!vf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 503)
    public final void windowClosing(WindowEvent arg0) {
        field528++;
        this.destroy();
    }

    @OriginalMember(owner = "client!vf", name = "providesignlink", descriptor = "(Lme;)V", line = 513)
    public static final void providesignlink(class295 arg0) {
        field532++;
        class297.field5086 = arg0;
        class45.field681 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 521)
    public final AppletContext getAppletContext() {
        field547++;
        if (class284.field4882 == null) {
            return class297.field5086 == null || class297.field5086.field5061 == this ? super.getAppletContext() : class297.field5086.field5061.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 538)
    public final URL getDocumentBase() {
        field554++;
        if (class284.field4882 == null) {
            return class297.field5086 == null || class297.field5086.field5061 == this ? super.getDocumentBase() : class297.field5086.field5061.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 556)
    private final void method303(boolean arg0) {
        field549++;
        long var2 = class25.method197(-3418);
        if (!arg0) {
            return;
        }
        long var4 = class60.field998[class57.field906];
        if (var4 != 0L && var2 <= var4) {
        }
        class60.field998[class57.field906] = var2;
        class57.field906 = class57.field906 + 1 & 0x1F;
        synchronized (this) {
            class124.field2200 = class167.field2828;
        }
        this.method305((byte) -116);
    }

    @OriginalMember(owner = "client!vf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 587)
    public final void windowDeiconified(WindowEvent arg0) {
        field529++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BZ)V", line = 594)
    private final void method304(byte arg0, boolean arg1) {
        if (arg0 != 53) {
            method299(-128);
        }
        field550++;
        synchronized (this) {
            if (class103.field1880) {
                return;
            }
            class103.field1880 = true;
        }
        if (class297.field5086.field5061 != null) {
            class297.field5086.field5061.destroy();
        }
        try {
            this.method307((byte) -70);
        } catch (Exception var12) {
        }
        if (class5.field67 != null) {
            try {
                class5.field67.removeFocusListener(this);
                class5.field67.getParent().remove(class5.field67);
            } catch (Exception var11) {
            }
        }
        if (class297.field5086 != null) {
            try {
                class297.field5086.method2065(1958);
            } catch (Exception var10) {
            }
        }
        this.method297(1);
        if (class284.field4882 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V", line = 662)
    public static final void method306(int arg0) {
        if (class73.field1289 != null) {
            class73.field1289.method1122(-1);
            class73.field1289 = null;
        }
        class182.method1242(0);
        field534++;
        class171.method1144();
        for (int var1 = 0; var1 < 4; var1++) {
            class243.field4216[var1].method1673((byte) -104);
        }
        class45.method375((byte) -112);
        System.gc();
        class233.method1556(2, -1);
        class106.field1898 = false;
        class2.field36 = -1;
        class82.method597(6, true);
        class11.field142 = false;
        class229.field3955 = 0;
        class311.field5271 = 0;
        for (int var2 = 0; var2 < class76.field1320.length; var2++) {
            class76.field1320[var2] = null;
        }
        class226.field3895 = 0;
        class14.field177 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class38.field527[var3] = null;
            class26.field303[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class16.field214[var4] = null;
        }
        if (arg0 >= -20) {
            return;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class82.field1386[var5][var6][var7] = null;
                }
            }
        }
        class294.method2061(true);
        class301.field5145 = 0;
        class238.method1633(true, 0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V", line = 751)
    public final void method308(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field533++;
        try {
            if (class252.field4344 != null) {
                class243.field4220++;
                if (class243.field4220 >= 3) {
                    this.method295((byte) -40, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            if (arg3 != -1) {
                field551 = false;
            }
            class218.field3773 = arg0;
            class276.field4762 = arg0;
            class63.field1098 = 0;
            class252.field4344 = this;
            class42.field577 = arg4;
            class314.field5326 = arg4;
            class115.field2052 = 0;
            class226.field3892 = arg2;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class65.field1139 = true;
            } else {
                class65.field1139 = false;
            }
            if (class297.field5086 == null) {
                class45.field681 = class297.field5086 = new class295(this, arg1, (String) null, 0);
            }
            class116 var7 = class297.field5086.method2070(1, this, -126);
            while (var7.field2067 == 0) {
                class237.method1628((byte) -88, 10L);
            }
            class121.field2126 = (Thread) var7.field2063;
        } catch (Exception var9) {
            class107.method796(var9, (byte) 109, (String) null);
            this.method295((byte) -40, "crash");
        }
    }

    @OriginalMember(owner = "client!vf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 814)
    public final void windowDeactivated(WindowEvent arg0) {
        field546++;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public abstract void method297(int arg0);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public abstract void method301(int arg0);

    @OriginalMember(owner = "client!vf", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
    public abstract void method302(int arg0);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public abstract void method305(byte arg0);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public abstract void method307(byte arg0);
}
