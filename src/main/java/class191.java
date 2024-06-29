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

@OriginalClass("client!vc")
public abstract class class191 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
    private boolean field3045 = false;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3070 = "glow2:";

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Llb;")
    public static class211 field3053;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Z")
    public static boolean field3078;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Z")
    public static boolean field3079;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V", line = 5)
    private final void method1374(int arg0, boolean arg1) {
        field3054++;
        synchronized (this) {
            if (class326.field5067) {
                return;
            }
            if (arg0 != 0) {
                this.method1381((String) null, -109);
            }
            class326.field5067 = true;
        }
        if (class301.field4715.field285 != null) {
            class301.field4715.field285.destroy();
        }
        try {
            this.method1375((byte) 57);
        } catch (Exception var12) {
        }
        if (class171.field2548 != null) {
            try {
                class171.field2548.removeFocusListener(this);
                class171.field2548.getParent().remove(class171.field2548);
            } catch (Exception var11) {
            }
        }
        if (class301.field4715 != null) {
            try {
                class301.field4715.method160(0);
            } catch (Exception var10) {
            }
        }
        this.method1385((byte) -62);
        if (class184.field2857 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!vc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 64)
    public final void windowClosed(WindowEvent arg0) {
        field3049++;
    }

    @OriginalMember(owner = "client!vc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 71)
    public final URL getCodeBase() {
        field3059++;
        if (class184.field2857 == null) {
            return class301.field4715 == null || class301.field4715.field285 == this ? super.getCodeBase() : class301.field4715.field285.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 86)
    public final void windowDeiconified(WindowEvent arg0) {
        field3065++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;ZIIIIII)V", line = 100)
    public final void method1379(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3051++;
        try {
            class207.field3267 = 0;
            class210.field3314 = arg7;
            class255.field3814 = arg7;
            class125.field1972 = arg2;
            class99.field1461 = arg2;
            class298.field4673 = 0;
            if (arg5 > -82) {
                return;
            }
            class175.field2585 = arg4;
            class262.field3908 = this;
            class184.field2857 = new Frame();
            class184.field2857.setTitle("Jagex");
            class184.field2857.setResizable(true);
            class184.field2857.addWindowListener(this);
            class184.field2857.setVisible(true);
            class184.field2857.toFront();
            Insets var9 = class184.field2857.getInsets();
            class184.field2857.setSize(class99.field1461 + var9.right + var9.left, class255.field3814 + var9.bottom + var9.top);
            class150.field2272 = class301.field4715 = new class26((Applet) null, arg3, arg0, arg6);
            class233 var10 = class301.field4715.method163(1, (byte) -49, this);
            while (var10.field3585 == 0) {
                class97.method768(10L, 44);
            }
            class311.field4844 = (Thread) var10.field3590;
        } catch (Exception var12) {
            class50.method464((byte) 45, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!vc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 142)
    public final void focusGained(FocusEvent arg0) {
        class66.field973 = true;
        field3056++;
        class188.field2994 = true;
    }

    @OriginalMember(owner = "client!vc", name = "stop", descriptor = "()V", line = 151)
    public final void stop() {
        field3067++;
        if (class262.field3908 == this && !class326.field5067) {
            class174.field2572 = class234.method1650((byte) -117) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V", line = 163)
    public static final void method1380(int arg0, int arg1, int arg2) {
        class267.field4007 = class170.field2537[arg0][arg2].field2577;
        class315.field4913 = class170.field2537[arg0][arg2].field2582;
        if (arg1 == 23348) {
            field3073++;
            class291.field4572 = class170.field2537[arg0][arg2].field2571;
            class264.method1822((float) class267.field4007, (float) class315.field4913, (float) class291.field4572);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 177)
    public final void method1381(String arg0, int arg1) {
        field3075++;
        if (this.field3045) {
            return;
        }
        this.field3045 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != 0) {
                return;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!vc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 202)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3060++;
    }

    @OriginalMember(owner = "client!vc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 211)
    public final void focusLost(FocusEvent arg0) {
        field3066++;
        class66.field973 = false;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V", line = 227)
    private final void method1382(int arg0) {
        field3063++;
        long var2 = class234.method1650((byte) -105);
        if (arg0 != -27988) {
            this.start();
        }
        long var4 = class328.field5079[class305.field4777];
        class328.field5079[class305.field4777] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class96.field1424 = ((var6 >> 1) + 32000) / var6;
        }
        class305.field4777 = class305.field4777 + 1 & 0x1F;
        if (class156.field2348++ > 50) {
            class156.field2348 -= 50;
            class188.field2994 = true;
            class171.field2548.setSize(class125.field1972, class210.field3314);
            class171.field2548.setVisible(true);
            if (class184.field2857 != null && class63.field951 == null) {
                Insets var7 = class184.field2857.getInsets();
                class171.field2548.setLocation(class298.field4673 + var7.left, class207.field3267 + var7.top);
            } else {
                class171.field2548.setLocation(class298.field4673, class207.field3267);
            }
        }
        this.method1378(0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V", line = 272)
    public final void method1383(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3057++;
        try {
            if (class262.field3908 != null) {
                class167.field2516++;
                if (class167.field2516 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1381("alreadyloaded", 0);
                return;
            }
            class262.field3908 = this;
            class207.field3267 = 0;
            class175.field2585 = arg1;
            class210.field3314 = arg4;
            class255.field3814 = arg4;
            if (arg3 <= 42) {
                return;
            }
            class125.field1972 = arg0;
            class99.field1461 = arg0;
            class298.field4673 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class302.field4729 = true;
            } else {
                class302.field4729 = false;
            }
            if (class301.field4715 == null) {
                class150.field2272 = class301.field4715 = new class26(this, arg2, (String) null, 0);
            }
            class233 var7 = class301.field4715.method163(1, (byte) -91, this);
            while (var7.field3585 == 0) {
                class97.method768(10L, 78);
            }
            class311.field4844 = (Thread) var7.field3590;
        } catch (Exception var9) {
            class50.method464((byte) 45, (String) null, var9);
            this.method1381("crash", 0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 330)
    public final AppletContext getAppletContext() {
        field3068++;
        if (class184.field2857 == null) {
            return class301.field4715 == null || class301.field4715.field285 == this ? super.getAppletContext() : class301.field4715.field285.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "providesignlink", descriptor = "(Lna;)V", line = 346)
    public static final void providesignlink(class26 arg0) {
        class301.field4715 = arg0;
        class150.field2272 = arg0;
        field3044++;
    }

    @OriginalMember(owner = "client!vc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 361)
    public final URL getDocumentBase() {
        field3077++;
        if (class184.field2857 == null) {
            return class301.field4715 == null || class301.field4715.field285 == this ? super.getDocumentBase() : class301.field4715.field285.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILgd;Lgd;IIJ)V", line = 376)
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, class310 arg4, class310 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class10 var10 = new class10();
        var10.field91 = arg8;
        var10.field92 = arg1 * 128 + 64;
        var10.field96 = arg2 * 128 + 64;
        var10.field99 = arg3;
        var10.field98 = arg4;
        var10.field94 = arg5;
        var10.field90 = arg6;
        var10.field101 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class250.field3746[var11][arg1][arg2] == null) {
                class250.field3746[var11][arg1][arg2] = new class99(var11, arg1, arg2);
            }
        }
        class250.field3746[arg0][arg1][arg2].field1486 = var10;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)Z", line = 406)
    public final boolean method1386(int arg0) {
        field3046++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
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
            } else {
                this.method1381("invalidhost", arg0);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 437)
    public final void windowActivated(WindowEvent arg0) {
        field3048++;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V", line = 444)
    private final void method1387(byte arg0) {
        field3076++;
        long var2 = class234.method1650((byte) 96);
        if (arg0 <= 61) {
            field3070 = (String) null;
        }
        long var4 = class130.field2030[class167.field2511];
        class130.field2030[class167.field2511] = var2;
        class167.field2511 = class167.field2511 + 1 & 0x1F;
        synchronized (this) {
            class28.field321 = class66.field973;
        }
        this.method1377(-29461);
        if (var4 != 0L && var2 <= var4) {
        }
    }

    @OriginalMember(owner = "client!vc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 477)
    public final String getParameter(String arg0) {
        field3069++;
        if (class184.field2857 == null) {
            return class301.field4715 == null || class301.field4715.field285 == this ? super.getParameter(arg0) : class301.field4715.field285.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILek;)Lek;", line = 496)
    public static final class184 method1388(int arg0, class184 arg1) {
        field3055++;
        class184 var2 = client.method1770(arg1);
        if (arg0 == -24504) {
            if (var2 == null) {
                var2 = arg1.field2844;
            }
            return var2;
        } else {
            return (class184) null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V", line = 516)
    public static void method1389(int arg0) {
        field3070 = null;
        field3053 = null;
        int var1 = 92 / ((arg0 + 7) / 55);
    }

    @OriginalMember(owner = "client!vc", name = "destroy", descriptor = "()V", line = 527)
    public final void destroy() {
        field3052++;
        if (class262.field3908 == this && !class326.field5067) {
            class174.field2572 = class234.method1650((byte) -103);
            class97.method768(5000L, 102);
            class150.field2272 = null;
            this.method1374(0, false);
        }
    }

    @OriginalMember(owner = "client!vc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 543)
    public final void update(Graphics arg0) {
        field3043++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V", line = 555)
    public final synchronized void method1390(int arg0) {
        field3061++;
        if (class171.field2548 != null) {
            class171.field2548.removeFocusListener(this);
            class171.field2548.getParent().remove(class171.field2548);
        }
        Container var2;
        if (class63.field951 != null) {
            var2 = class63.field951;
        } else if (class184.field2857 == null) {
            var2 = class301.field4715.field285;
        } else {
            var2 = class184.field2857;
        }
        var2.setLayout((LayoutManager) null);
        class171.field2548 = new class293(this);
        var2.add(class171.field2548);
        class171.field2548.setSize(class125.field1972, class210.field3314);
        class171.field2548.setVisible(true);
        if (class184.field2857 == var2) {
            Insets var3 = class184.field2857.getInsets();
            class171.field2548.setLocation(class298.field4673 + var3.left, class207.field3267 + var3.top);
        } else {
            class171.field2548.setLocation(class298.field4673, class207.field3267);
        }
        class171.field2548.addFocusListener(this);
        class171.field2548.requestFocus();
        class66.field973 = true;
        class28.field321 = true;
        class188.field2994 = true;
        class79.field1114 = false;
        if (arg0 == -14426) {
            class262.field3905 = class234.method1650((byte) 68);
        }
    }

    @OriginalMember(owner = "client!vc", name = "run", descriptor = "()V", line = 605)
    public final void run() {
        field3071++;
        try {
            if (class26.field297 != null) {
                String var1 = class26.field297.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class26.field290;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1381("wrongjava", 0);
                        return;
                    }
                    class40.field599 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class26.field290 == null || class26.field290.equals("1.4.2"))) {
                    this.method1381("wrongjava", 0);
                    return;
                }
            }
            if (class26.field290 != null && class26.field290.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class26.field290.length() > var3) {
                    char var5 = class26.field290.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class113.field1784 = true;
                }
            }
            if (class301.field4715.field285 != null) {
                Method var6 = class26.field302;
                if (var6 != null) {
                    try {
                        var6.invoke(class301.field4715.field285, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class224.method1599(-92);
            this.method1390(-14426);
            class128.field2023 = class253.method1757(class125.field1972, (byte) -34, class210.field3314, class171.field2548);
            this.method1376(-29);
            class96.field1405 = class213.method1538(95);
            while (class174.field2572 == 0L || class174.field2572 > class234.method1650((byte) -103)) {
                class178.field2668 = class96.field1405.method1144(-223016735, class40.field599, class80.field1124);
                for (int var8 = 0; var8 < class178.field2668; var8++) {
                    this.method1387((byte) 85);
                }
                this.method1382(-27988);
                class308.method2133(class171.field2548, true, class301.field4715);
            }
        } catch (Exception var11) {
            class50.method464((byte) 45, (String) null, var11);
            this.method1381("crash", 0);
        }
        this.method1374(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 715)
    public final synchronized void paint(Graphics arg0) {
        field3050++;
        if (class262.field3908 != this || class326.field5067) {
            return;
        }
        class188.field2994 = true;
        if (class113.field1784 && !class36.field534 && class234.method1650((byte) 87) - class262.field3905 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class99.field1461 && var2.height >= class255.field3814) {
                class79.field1114 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 736)
    public final void windowOpened(WindowEvent arg0) {
        field3047++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)I", line = 749)
    public static final int method1391(byte arg0, int arg1, int arg2) {
        field3064++;
        if (arg0 != 38) {
            providesignlink((class26) null);
        }
        int var3 = class274.method1902(arg2 - 1, arg1 + -1, arg0 ^ 0x467E) + class274.method1902(arg2 + 1, arg1 + -1, 18008) + (class274.method1902(arg2 - 1, arg1 - -1, 18008) - -class274.method1902(arg2 + 1, arg1 + 1, 18008));
        int var4 = class274.method1902(arg2 - 1, arg1, 18008) + (class274.method1902(arg2 + 1, arg1, arg0 + 17970) + class274.method1902(arg2, arg1 - 1, arg0 + 17970) + class274.method1902(arg2, arg1 + 1, 18008));
        int var5 = class274.method1902(arg2, arg1, 18008);
        return var3 / 16 + var4 / 8 + (var5 / 4);
    }

    @OriginalMember(owner = "client!vc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 767)
    public final void windowIconified(WindowEvent arg0) {
        field3072++;
    }

    @OriginalMember(owner = "client!vc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 774)
    public final void windowDeactivated(WindowEvent arg0) {
        field3058++;
    }

    @OriginalMember(owner = "client!vc", name = "start", descriptor = "()V", line = 782)
    public final void start() {
        field3062++;
        if (class262.field3908 == this && !class326.field5067) {
            class174.field2572 = 0L;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public abstract void method1375(byte arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public abstract void method1376(int arg0);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public abstract void method1377(int arg0);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public abstract void method1378(int arg0);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public abstract void method1385(byte arg0);

    @OriginalMember(owner = "client!vc", name = "init", descriptor = "()V")
    public abstract void init();
}
