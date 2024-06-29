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

@OriginalClass("client!lr")
public abstract class class448 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "Z")
    private boolean field6447 = false;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Z")
    private boolean field6448 = false;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "Ljava/lang/String;")
    public static String field6451 = "Loaded title screen";

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "Ljava/lang/String;")
    public static String field6466 = " from your ignore list first.";

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "Ljava/lang/String;")
    public static String field6482 = "Please wait...";

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    public static int field6481 = 0;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "Ltc;")
    public static class196 field6462;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "Lqj;")
    public static class296 field6473;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "Lqj;")
    public static class296 field6484;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "Z")
    public static boolean field6490;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "Z")
    public static boolean field6491;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "Z")
    public static boolean field6492;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "Z")
    public static boolean field6493;

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "Z")
    public static boolean field6494;

    @OriginalMember(owner = "client!lr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field6455++;
    }

    @OriginalMember(owner = "client!lr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6478++;
        class30.field467 = true;
        class289.field3995 = true;
    }

    @OriginalMember(owner = "client!lr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field6468++;
        if (class194.field2694 != this || class34.field538) {
            return;
        }
        class289.field3995 = true;
        if (class394.field5762 && (class224.method1425(-26805) - class382.field5414) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class33.field502 <= var2.width && class358.field5043 <= var2.height) {
                class79.field1232 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field6461++;
        if (class393.field5746 == null) {
            return class204.field2772 == null || class204.field2772.field4888 == this ? super.getParameter(arg0) : class204.field2772.field4888.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field6458++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static final void method2789(int arg0) {
        class240.field3335.method1243(1000);
        field6459++;
        class167.field2391.method1243(1000);
        int var1 = 117 % ((arg0 - 34) / 52);
    }

    @OriginalMember(owner = "client!lr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field6476++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public abstract void method1105(byte arg0);

    @OriginalMember(owner = "client!lr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field6453++;
        if (class393.field5746 == null) {
            return class204.field2772 == null || class204.field2772.field4888 == this ? super.getAppletContext() : class204.field2772.field4888.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "providesignlink", descriptor = "(Lkq;)V")
    public static final void providesignlink(class351 arg0) {
        class204.field2772 = arg0;
        class359.field5058 = arg0;
        field6475++;
    }

    @OriginalMember(owner = "client!lr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field6487++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    private final void method2790(boolean arg0) {
        field6485++;
        long var2 = class224.method1425(-26805);
        long var4 = class54.field798[class401.field5858];
        if (arg0) {
            field6484 = null;
        }
        class54.field798[class401.field5858] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class62.field978 = ((var6 >> 1) + 32000) / var6;
        }
        class401.field5858 = class401.field5858 + 1 & 0x1F;
        if (class10.field145++ > 50) {
            class10.field145 -= 50;
            class289.field3995 = true;
            class41.field617.setSize(class194.field2696, class243.field3359);
            class41.field617.setVisible(true);
            if (class393.field5746 != null && class227.field3044 == null) {
                Insets var7 = class393.field5746.getInsets();
                class41.field617.setLocation(class364.field5104 + var7.left, class63.field985 + var7.top);
            } else {
                class41.field617.setLocation(class364.field5104, class63.field985);
            }
        }
        this.method1109(true);
    }

    @OriginalMember(owner = "client!lr", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field6469++;
        if (class194.field2694 == this && !class34.field538) {
            class24.field331 = class224.method1425(-26805);
            class4.method28(5000L, -105);
            class359.field5058 = null;
            this.method2800(true, false);
        }
    }

    @OriginalMember(owner = "client!lr", name = "stop", descriptor = "()V")
    public final void stop() {
        field6464++;
        if (class194.field2694 == this && !class34.field538) {
            class24.field331 = class224.method1425(-26805) + 4000L;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public abstract void method1097(int arg0);

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V")
    public abstract void method1109(boolean arg0);

    @OriginalMember(owner = "client!lr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field6471++;
        if (class393.field5746 == null) {
            return class204.field2772 == null || class204.field2772.field4888 == this ? super.getCodeBase() : class204.field2772.field4888.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class30.field467 = false;
        field6489++;
    }

    @OriginalMember(owner = "client!lr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field6463++;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
    private final void method2791(int arg0) {
        field6474++;
        long var2 = class224.method1425(-26805);
        long var4 = class300.field4154[class286.field3945];
        class300.field4154[class286.field3945] = var2;
        class286.field3945 = class286.field3945 + 1 & 0x1F;
        boolean var10000;
        if ((long) arg0 == var4 || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class182.field2540 = class30.field467;
        }
        this.method1120(40);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method2792(byte arg0, String arg1) {
        field6456++;
        if (this.field6448) {
            return;
        }
        this.field6448 = true;
        System.out.println("error_game_" + arg1);
        try {
            class274.method1687(class204.field2772.field4888, -5778, "loggedout");
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            int var3 = -93 % ((arg0 - 31) / 36);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!lr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field6465++;
        if (class393.field5746 == null) {
            return class204.field2772 == null || class204.field2772.field4888 == this ? super.getDocumentBase() : class204.field2772.field4888.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field6467++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZIIBLjava/lang/String;I)V")
    public final void method2793(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, String arg6, int arg7) {
        try {
            class194.field2696 = arg0;
            class33.field502 = arg0;
            class243.field3359 = arg3;
            class358.field5043 = arg3;
            int var9 = 57 % ((arg5 - 11) / 60);
            class194.field2694 = this;
            class364.field5104 = 0;
            class364.field5101 = arg7;
            class63.field985 = 0;
            class393.field5746 = new Frame();
            class393.field5746.setTitle("Jagex");
            class393.field5746.setResizable(true);
            class393.field5746.addWindowListener(this);
            class393.field5746.setVisible(true);
            class393.field5746.toFront();
            Insets var10 = class393.field5746.getInsets();
            class393.field5746.setSize(class33.field502 + var10.left + var10.right, class358.field5043 + var10.top + var10.bottom);
            class359.field5058 = class204.field2772 = new class351((Applet) null, arg4, arg6, arg1);
            class295 var11 = class204.field2772.method2261(1, 29171, this);
            while (var11.field4068 == 0) {
                class4.method28(10L, 105);
            }
        } catch (Exception var13) {
            class184.method1214(106, (String) null, var13);
        }
        field6457++;
    }

    @OriginalMember(owner = "client!lr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field6479++;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
    public abstract void method1120(int arg0);

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
    public static void method2794(byte arg0) {
        field6482 = null;
        field6462 = null;
        field6466 = null;
        if (arg0 == 88) {
            field6484 = null;
            field6451 = null;
            field6473 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label110: {
                if (class351.field4903 != null) {
                    String var1 = class351.field4903.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class351.field4897;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2792((byte) 94, "wrongjava");
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class351.field4897 == null || class351.field4897.equals("1.4.2"))) {
                        this.method2792((byte) 112, "wrongjava");
                        break label110;
                    }
                }
                if (class351.field4897 != null && class351.field4897.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class351.field4897.length()) {
                        char var5 = class351.field4897.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + (var5 - 48);
                    }
                    if (var4 >= 5) {
                        class394.field5762 = true;
                    }
                }
                if (class204.field2772.field4888 != null) {
                    Method var6 = class351.field4904;
                    if (var6 != null) {
                        try {
                            var6.invoke(class204.field2772.field4888, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class337.method2096(96);
                class10.method64(122);
                this.method2797(31);
                this.method1108((byte) -116);
                class24.field340 = class162.method1070(126);
                this.method2795(true);
                while (class24.field331 == 0L || class24.field331 > class224.method1425(-26805)) {
                    class189.field2619 = class24.field340.method493((byte) -126, class162.field2273);
                    for (int var7 = 0; var7 < class189.field2619; var7++) {
                        this.method2791(0);
                    }
                    this.method2790(false);
                    if (class181.field2530 == 1) {
                        class4.method28(5L, 123);
                    }
                    class288.method1862(class41.field617, class204.field2772, (byte) 24);
                }
            }
        } catch (Exception var10) {
            class184.method1214(106, (String) null, var10);
            this.method2792((byte) -82, "crash");
        }
        field6450++;
        this.method2800(true, true);
    }

    @OriginalMember(owner = "client!lr", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(Z)V")
    public final void method2795(boolean arg0) {
        field6486++;
        if (!this.field6447) {
            try {
                class295 var2 = class204.field2772.method2259(-13, class194.field2694.getClass());
                while (var2.field4068 == 0) {
                    class4.method28(100L, 47);
                }
                if (var2.field4070 != null) {
                    throw (Throwable) var2.field4070;
                }
                jagmisc.init();
                this.field6447 = true;
                class24.field340 = class162.method1070(118);
            } catch (Throwable var3) {
            }
        }
        if (!arg0) {
            this.focusLost((FocusEvent) null);
        }
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)Z")
    public final boolean method2796(int arg0) {
        if (arg0 != 10) {
            return true;
        }
        field6488++;
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
                this.method2792((byte) 99, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
    public final synchronized void method2797(int arg0) {
        field6449++;
        if (class41.field617 != null) {
            class41.field617.removeFocusListener(this);
            class41.field617.getParent().remove(class41.field617);
        }
        Container var2;
        if (class227.field3044 != null) {
            var2 = class227.field3044;
        } else if (class393.field5746 == null) {
            var2 = class204.field2772.field4888;
        } else {
            var2 = class393.field5746;
        }
        var2.setLayout((LayoutManager) null);
        class41.field617 = new class418(this);
        var2.add(class41.field617);
        class41.field617.setSize(class194.field2696, class243.field3359);
        class41.field617.setVisible(true);
        if (class393.field5746 == var2) {
            Insets var3 = class393.field5746.getInsets();
            class41.field617.setLocation(class364.field5104 + var3.left, class63.field985 + var3.top);
        } else {
            class41.field617.setLocation(class364.field5104, class63.field985);
        }
        class41.field617.addFocusListener(this);
        class41.field617.requestFocus();
        class30.field467 = true;
        class182.field2540 = true;
        if (arg0 != 31) {
            this.windowActivated((WindowEvent) null);
        }
        class289.field3995 = true;
        class79.field1232 = false;
        class382.field5414 = class224.method1425(-26805);
    }

    @OriginalMember(owner = "client!lr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field6454++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
    public static final Object method2798(byte arg0, boolean arg1, byte[] arg2) {
        field6483++;
        if (arg2 == null) {
            return null;
        }
        int var3 = 3 % ((arg0 - 78) / 40);
        if (arg2.length > 136 && !class25.field364) {
            try {
                class364 var4 = (class364) Class.forName("me").getDeclaredConstructor().newInstance();
                var4.method722(arg2, 23067);
                return var4;
            } catch (Throwable var5) {
                class25.field364 = true;
            }
        }
        return arg1 ? class431.method2710(arg2, (byte) 88) : arg2;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V")
    public final void method2799(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6452++;
        try {
            if (class194.field2694 == null) {
                class63.field985 = 0;
                class194.field2696 = arg3;
                class33.field502 = arg3;
                class194.field2694 = this;
                class243.field3359 = arg0;
                class358.field5043 = arg0;
                class364.field5101 = arg4;
                class364.field5104 = arg1;
                if (class204.field2772 == null) {
                    class359.field5058 = class204.field2772 = new class351(this, arg2, (String) null, 0);
                }
                class295 var6 = class204.field2772.method2261(1, arg1 + 29171, this);
                while (var6.field4068 == 0) {
                    class4.method28(10L, arg1 ^ 0xFFFFFFA5);
                }
            } else {
                client.field2328++;
                if (client.field2328 >= 3) {
                    this.method2792((byte) -119, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class184.method1214(-108, (String) null, var8);
            this.method2792((byte) 117, "crash");
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZZ)V")
    private final void method2800(boolean arg0, boolean arg1) {
        field6477++;
        synchronized (this) {
            if (class34.field538) {
                return;
            }
            class34.field538 = arg0;
        }
        if (class204.field2772.field4888 != null) {
            class204.field2772.field4888.destroy();
        }
        try {
            this.method1105((byte) -91);
        } catch (Exception var11) {
        }
        if (this.field6447) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field6447 = false;
        }
        class295 var4 = class204.field2772.method2250(class194.field2694.getClass(), -2);
        while (var4.field4068 == 0) {
            class4.method28(100L, 97);
        }
        if (class41.field617 != null) {
            try {
                class41.field617.removeFocusListener(this);
                class41.field617.getParent().remove(class41.field617);
            } catch (Exception var9) {
            }
        }
        if (class204.field2772 != null) {
            try {
                class204.field2772.method2262((byte) 90);
            } catch (Exception var8) {
            }
        }
        this.method1097(-112);
        if (class393.field5746 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!lr", name = "start", descriptor = "()V")
    public final void start() {
        field6470++;
        if (class194.field2694 == this && !class34.field538) {
            class24.field331 = 0L;
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
    public abstract void method1108(byte arg0);
}
