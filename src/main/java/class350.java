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

@OriginalClass("client!ea")
public abstract class class350 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Z")
    private boolean field5561 = false;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Z")
    private boolean field5557 = false;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field5549 = 0;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5559 = "Prepared sound engine";

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5582 = " from your ignore list first.";

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lwm;")
    public static class96 field5571;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "Z")
    public static boolean field5587;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "Z")
    public static boolean field5588;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "Z")
    public static boolean field5589;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[Lho;")
    public static class215[] field5563;

    @OriginalMember(owner = "client!ea", name = "destroy", descriptor = "()V", line = 4)
    public final void destroy() {
        field5570++;
        if (class78.field1135 == this && !class208.field3208) {
            class224.field3487 = class156.method1273((byte) -102);
            class188.method1443(10, 5000L);
            class71.field1063 = null;
            this.method2462(128, false);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)I", line = 24)
    public static final int method2454(int arg0, byte arg1) {
        int var2 = 41 / ((arg1 - 79) / 45);
        field5584++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ea", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 38)
    public final void windowIconified(WindowEvent arg0) {
        field5577++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 46)
    public static void method2455(int arg0) {
        field5582 = null;
        field5571 = null;
        field5563 = null;
        field5559 = null;
        int var1 = 63 / ((arg0 - 23) / 46);
    }

    @OriginalMember(owner = "client!ea", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 59)
    public final void windowActivated(WindowEvent arg0) {
        field5574++;
    }

    @OriginalMember(owner = "client!ea", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 67)
    public final void windowClosing(WindowEvent arg0) {
        field5567++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V", line = 79)
    public final void method2456(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5583++;
        try {
            if (class78.field1135 != null) {
                class303.field4724++;
                if (class303.field4724 >= 3) {
                    this.method2460("alreadyloaded", -6835);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class126.field2113 = arg4;
            class101.field1528 = arg4;
            class144.field2359 = arg0;
            class78.field1135 = this;
            class362.field5740 = arg1;
            class277.field4283 = arg1;
            class166.field2645 = 0;
            class138.field2290 = 0;
            String var6 = this.getParameter("openwinjs");
            int var7 = -76 / ((arg3 + 15) / 55);
            if (var6 != null && var6.equals("1")) {
                class158.field2528 = true;
            } else {
                class158.field2528 = false;
            }
            if (class340.field5234 == null) {
                class71.field1063 = class340.field5234 = new class323(this, arg2, (String) null, 0);
            }
            class95 var8 = class340.field5234.method2290((byte) -111, this, 1);
            while (var8.field1447 == 0) {
                class188.method1443(10, 10L);
            }
            class160.field2565 = (Thread) var8.field1446;
        } catch (Exception var10) {
            client.method1023((byte) -93, (String) null, var10);
            this.method2460("crash", -6835);
        }
    }

    @OriginalMember(owner = "client!ea", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 140)
    public final void windowOpened(WindowEvent arg0) {
        field5585++;
    }

    @OriginalMember(owner = "client!ea", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 150)
    public final void windowDeactivated(WindowEvent arg0) {
        field5562++;
    }

    @OriginalMember(owner = "client!ea", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 159)
    public final void windowDeiconified(WindowEvent arg0) {
        field5560++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)Z", line = 178)
    public static final boolean method2457(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        }
        field5581++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class356.field5670[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1007;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Z", line = 204)
    public final boolean method2458(byte arg0) {
        field5564++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        int var3 = -74 / ((60 - arg0) / 42);
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
                this.method2460("invalidhost", -6835);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILjava/lang/String;IZI)V", line = 240)
    public final void method2459(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, boolean arg6, int arg7) {
        try {
            class144.field2359 = arg2;
            class78.field1135 = this;
            class166.field2645 = 0;
            class138.field2290 = 0;
            class126.field2113 = arg1;
            class101.field1528 = arg1;
            class362.field5740 = arg5;
            class277.field4283 = arg5;
            class67.field1028 = new Frame();
            class67.field1028.setTitle("Jagex");
            if (arg0 > -50) {
                return;
            }
            class67.field1028.setResizable(true);
            class67.field1028.addWindowListener(this);
            class67.field1028.setVisible(true);
            class67.field1028.toFront();
            Insets var9 = class67.field1028.getInsets();
            class67.field1028.setSize(class101.field1528 + var9.left + var9.right, class277.field4283 + var9.bottom - -var9.top);
            class71.field1063 = class340.field5234 = new class323((Applet) null, arg3, arg4, arg7);
            class95 var10 = class340.field5234.method2290((byte) -119, this, 1);
            while (var10.field1447 == 0) {
                class188.method1443(10, 10L);
            }
            class160.field2565 = (Thread) var10.field1446;
        } catch (Exception var12) {
            client.method1023((byte) -97, (String) null, var12);
        }
        field5550++;
    }

    @OriginalMember(owner = "client!ea", name = "run", descriptor = "()V", line = 283)
    public final void run() {
        field5555++;
        try {
            if (class323.field4966 != null) {
                String var1 = class323.field4966.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class323.field4969;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2460("wrongjava", -6835);
                        return;
                    }
                    class106.field1601 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class323.field4969 == null || class323.field4969.equals("1.4.2"))) {
                    this.method2460("wrongjava", -6835);
                    return;
                }
            }
            if (class323.field4969 != null && class323.field4969.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class323.field4969.length() > var3) {
                    char var5 = class323.field4969.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
                if (var4 >= 5) {
                    class126.field2111 = true;
                }
            }
            if (class340.field5234.field4975 != null) {
                Method var6 = class323.field4978;
                if (var6 != null) {
                    try {
                        var6.invoke(class340.field5234.field4975, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class314.method2218(-99);
            this.method2465(10162);
            class42.field665 = class264.method1949(class64.field974, -89, class362.field5740, class126.field2113);
            this.method1044(-53);
            class66.field1019 = class158.method1283(true);
            this.method2463(126);
            while (class224.field3487 == 0L || class224.field3487 > class156.method1273((byte) -60)) {
                class98.field1477 = class66.field1019.method4(class119.field1824, class106.field1601, 2);
                for (int var8 = 0; var8 < class98.field1477; var8++) {
                    this.method2461(120);
                }
                this.method2464(50);
                class202.method1509(27949, class340.field5234, class64.field974);
            }
        } catch (Exception var11) {
            client.method1023((byte) -114, (String) null, var11);
            this.method2460("crash", -6835);
        }
        this.method2462(128, true);
    }

    @OriginalMember(owner = "client!ea", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 393)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field5558++;
    }

    @OriginalMember(owner = "client!ea", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 406)
    public final String getParameter(String arg0) {
        field5552++;
        if (class67.field1028 == null) {
            return class340.field5234 == null || class340.field5234.field4975 == this ? super.getParameter(arg0) : class340.field5234.field4975.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 420)
    public final void method2460(String arg0, int arg1) {
        field5566++;
        if (this.field5561) {
            return;
        }
        this.field5561 = true;
        System.out.println("error_game_" + arg0);
        try {
            class141.method1176(class340.field5234.field4975, true, "loggedout");
        } catch (Throwable var6) {
        }
        if (arg1 == -6835) {
            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            } catch (Exception var5) {
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 445)
    public final synchronized void paint(Graphics arg0) {
        field5553++;
        if (class78.field1135 != this || class208.field3208) {
            return;
        }
        class208.field3207 = true;
        if (class126.field2111 && !class240.field3737 && class156.method1273((byte) -69) - class55.field814 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class101.field1528 && var2.height >= class277.field4283) {
                class309.field4776 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 470)
    public final AppletContext getAppletContext() {
        field5556++;
        if (class67.field1028 == null) {
            return class340.field5234 == null || class340.field5234.field4975 == this ? super.getAppletContext() : class340.field5234.field4975.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V", line = 487)
    private final void method2461(int arg0) {
        long var2 = class22.field350[class297.field4613];
        long var4 = class156.method1273((byte) -51);
        if (var2 != 0L && var2 < var4) {
        }
        field5548++;
        class22.field350[class297.field4613] = var4;
        class297.field4613 = class297.field4613 + 1 & 0x1F;
        synchronized (this) {
            class64.field985 = class268.field4136;
        }
        if (arg0 < 118) {
            field5582 = (String) null;
        }
        this.method1036(-127);
    }

    @OriginalMember(owner = "client!ea", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 519)
    public final void focusLost(FocusEvent arg0) {
        class268.field4136 = false;
        field5579++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V", line = 527)
    private final void method2462(int arg0, boolean arg1) {
        field5578++;
        synchronized (this) {
            if (class208.field3208) {
                return;
            }
            class208.field3208 = true;
        }
        if (class340.field5234.field4975 != null) {
            class340.field5234.field4975.destroy();
        }
        try {
            this.method1035(-32769);
        } catch (Exception var14) {
        }
        if (this.field5557) {
            try {
                jagmisc.quit();
            } catch (Throwable var13) {
            }
            this.field5557 = false;
        }
        class340.field5234.method2289((byte) -87, class78.field1135.getClass());
        if (arg0 != 128) {
            this.paint((Graphics) null);
        }
        if (class64.field974 != null) {
            try {
                class64.field974.removeFocusListener(this);
                class64.field974.getParent().remove(class64.field974);
            } catch (Exception var12) {
            }
        }
        if (class340.field5234 != null) {
            try {
                class340.field5234.method2293(0);
            } catch (Exception var11) {
            }
        }
        this.method1032(6);
        if (class67.field1028 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)V", line = 601)
    public final void method2463(int arg0) {
        int var2 = 9 / ((arg0 + 28) / 60);
        field5565++;
        if (this.field5557) {
            return;
        }
        try {
            class95 var3 = class340.field5234.method2275(class78.field1135.getClass(), 20);
            while (var3.field1447 == 0) {
                class188.method1443(10, 100L);
            }
            if (var3.field1446 != null) {
                throw (Throwable) var3.field1446;
            }
            jagmisc.init();
            this.field5557 = true;
            class66.field1019 = class158.method1283(true);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!ea", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 631)
    public final URL getDocumentBase() {
        field5586++;
        if (class67.field1028 == null) {
            return class340.field5234 == null || class340.field5234.field4975 == this ? super.getDocumentBase() : class340.field5234.field4975.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "start", descriptor = "()V", line = 648)
    public final void start() {
        field5575++;
        if (class78.field1135 == this && !class208.field3208) {
            class224.field3487 = 0L;
        }
    }

    @OriginalMember(owner = "client!ea", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 660)
    public final void windowClosed(WindowEvent arg0) {
        field5572++;
    }

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)V", line = 667)
    private final void method2464(int arg0) {
        field5580++;
        long var2 = class156.method1273((byte) -36);
        long var4 = class120.field1866[class44.field706];
        class120.field1866[class44.field706] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class101.field1522 = ((var6 >> 1) + 32000) / var6;
        }
        class44.field706 = class44.field706 + 1 & 0x1F;
        if (arg0 < class25.field451++) {
            class208.field3207 = true;
            class25.field451 -= 50;
            class64.field974.setSize(class126.field2113, class362.field5740);
            class64.field974.setVisible(true);
            if (class67.field1028 != null && class212.field3321 == null) {
                Insets var7 = class67.field1028.getInsets();
                class64.field974.setLocation(var7.left + class138.field2290, var7.top - -class166.field2645);
            } else {
                class64.field974.setLocation(class138.field2290, class166.field2645);
            }
        }
        this.method1042(0);
    }

    @OriginalMember(owner = "client!ea", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 708)
    public final URL getCodeBase() {
        field5554++;
        if (class67.field1028 == null) {
            return class340.field5234 == null || class340.field5234.field4975 == this ? super.getCodeBase() : class340.field5234.field4975.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "(I)V", line = 726)
    public final synchronized void method2465(int arg0) {
        field5576++;
        if (class64.field974 != null) {
            class64.field974.removeFocusListener(this);
            class64.field974.getParent().remove(class64.field974);
        }
        if (arg0 != 10162) {
            this.field5561 = true;
        }
        Container var2;
        if (class212.field3321 != null) {
            var2 = class212.field3321;
        } else if (class67.field1028 == null) {
            var2 = class340.field5234.field4975;
        } else {
            var2 = class67.field1028;
        }
        var2.setLayout((LayoutManager) null);
        class64.field974 = new class234(this);
        var2.add(class64.field974);
        class64.field974.setSize(class126.field2113, class362.field5740);
        class64.field974.setVisible(true);
        if (class67.field1028 == var2) {
            Insets var3 = class67.field1028.getInsets();
            class64.field974.setLocation(class138.field2290 + var3.left, class166.field2645 + var3.top);
        } else {
            class64.field974.setLocation(class138.field2290, class166.field2645);
        }
        class64.field974.addFocusListener(this);
        class64.field974.requestFocus();
        class268.field4136 = true;
        class64.field985 = true;
        class208.field3207 = true;
        class309.field4776 = false;
        class55.field814 = class156.method1273((byte) -96);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V", line = 774)
    public static final void method2466(byte arg0) {
        field5573++;
        int var1 = class300.field4650 * 128 + 64;
        int var2 = class187.field2934 * 128 + 64;
        int var3 = class193.method1469(var1, var2, (byte) -47, class119.field1826) - class100.field1513;
        if (class236.field3671 >= 100) {
            class151.field2465 = class187.field2934 * 128 + 64;
            class10.field143 = class300.field4650 * 128 + 64;
            class64.field975 = class193.method1469(class10.field143, class151.field2465, (byte) -47, class119.field1826) - class100.field1513;
        } else {
            if (class64.field975 < var3) {
                class64.field975 += (var3 - class64.field975) * class236.field3671 / 1000 + class279.field4305;
                if (class64.field975 > var3) {
                    class64.field975 = var3;
                }
            }
            if (var2 > class151.field2465) {
                class151.field2465 += (var2 - class151.field2465) * class236.field3671 / 1000 + class279.field4305;
                if (var2 < class151.field2465) {
                    class151.field2465 = var2;
                }
            }
            if (var1 > class10.field143) {
                class10.field143 += class279.field4305 + ((var1 - class10.field143) * class236.field3671 / 1000);
                if (class10.field143 > var1) {
                    class10.field143 = var1;
                }
            }
            if (var1 < class10.field143) {
                class10.field143 -= (class10.field143 - var1) * class236.field3671 / 1000 + class279.field4305;
                if (class10.field143 < var1) {
                    class10.field143 = var1;
                }
            }
            if (var3 < class64.field975) {
                class64.field975 -= (class64.field975 - var3) * class236.field3671 / 1000 + class279.field4305;
                if (var3 > class64.field975) {
                    class64.field975 = var3;
                }
            }
            if (class151.field2465 > var2) {
                class151.field2465 -= (class151.field2465 - var2) * class236.field3671 / 1000 + class279.field4305;
                if (var2 > class151.field2465) {
                    class151.field2465 = var2;
                }
            }
        }
        int var4 = class162.field2579 * 128 + 64;
        int var5 = class249.field3860 * 128 + 64;
        if (arg0 <= 41) {
            return;
        }
        int var6 = class193.method1469(var5, var4, (byte) -47, class119.field1826) - class287.field4450;
        int var7 = var4 - class151.field2465;
        int var8 = var5 - class10.field143;
        int var9 = var6 - class64.field975;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var7, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class15.field248;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class191.field3005 < var11) {
            class191.field3005 += (var11 - class191.field3005) * class98.field1482 / 1000 + class29.field476;
            if (class191.field3005 > var11) {
                class191.field3005 = var11;
            }
        }
        if (class191.field3005 > var11) {
            class191.field3005 -= (class191.field3005 - var11) * class98.field1482 / 1000 + class29.field476;
            if (var11 > class191.field3005) {
                class191.field3005 = var11;
            }
        }
        if (var13 > 0) {
            class15.field248 += class98.field1482 * var13 / 1000 + class29.field476;
            class15.field248 &= 0x7FF;
        }
        if (var13 < 0) {
            class15.field248 -= -var13 * class98.field1482 / 1000 + class29.field476;
            class15.field248 &= 0x7FF;
        }
        int var14 = var12 - class15.field248;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class15.field248 = var12;
        }
    }

    @OriginalMember(owner = "client!ea", name = "stop", descriptor = "()V", line = 931)
    public final void stop() {
        field5551++;
        if (class78.field1135 == this && !class208.field3208) {
            class224.field3487 = class156.method1273((byte) -63) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ea", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 943)
    public final void focusGained(FocusEvent arg0) {
        class268.field4136 = true;
        field5568++;
        class208.field3207 = true;
    }

    @OriginalMember(owner = "client!ea", name = "providesignlink", descriptor = "(Lua;)V", line = 952)
    public static final void providesignlink(class323 arg0) {
        field5569++;
        class340.field5234 = arg0;
        class71.field1063 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public abstract void method1044(int arg0);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public abstract void method1032(int arg0);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public abstract void method1035(int arg0);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public abstract void method1036(int arg0);

    @OriginalMember(owner = "client!ea", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
    public abstract void method1042(int arg0);
}
