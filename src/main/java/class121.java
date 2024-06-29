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

@OriginalClass("client!rc")
public abstract class class121 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Z")
    private boolean field2684 = false;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field2655 = 0;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
    public static int[] field2656 = new int[128];

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Lod;")
    public static class101 field2673 = class46.method335(119, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field2678 = -1;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "[I")
    public static int[] field2666 = new int[25];

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "[[B")
    public static byte[][] field2674 = new byte[250][];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "Z")
    public static boolean field2688;

    @OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Lve;)V")
    public static final void providesignlink(class151 arg0) {
        class129.field2954 = arg0;
        class20.field441 = arg0;
        field2679++;
    }

    @OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2664++;
        if (class23.field547 == null) {
            return class129.field2954 == null || class129.field2954.field3453 == this ? super.getParameter(arg0) : class129.field2954.field3453.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2675++;
        if (class23.field547 == null) {
            return class129.field2954 == null || class129.field2954.field3453 == this ? super.getDocumentBase() : class129.field2954.field3453.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    private final void method902(int arg0) {
        if (arg0 != -14557) {
            return;
        }
        field2652++;
        long var2 = class10.method47(arg0 + 33446);
        long var4 = class24.field621[class146.field3355];
        class24.field621[class146.field3355] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class146.field3355 = class146.field3355 + 1 & 0x1F;
        synchronized (this) {
            class119.field2624 = class87.field1912;
        }
        this.method175(-26);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public final synchronized void method903(byte arg0) {
        if (arg0 < 72) {
            this.method910(49, null);
        }
        Container var2;
        if (class23.field547 == null) {
            var2 = class129.field2954.field3453;
        } else {
            var2 = class23.field547;
        }
        if (class134.field3062 != null) {
            class134.field3062.removeFocusListener(this);
            var2.remove(class134.field3062);
        }
        field2663++;
        class134.field3062 = new class41(this);
        var2.add(class134.field3062);
        class134.field3062.setSize(class75.field1599, class137.field3130);
        class134.field3062.setVisible(true);
        if (class23.field547 == null) {
            class134.field3062.setLocation(0, 0);
        } else {
            Insets var3 = class23.field547.getInsets();
            class134.field3062.setLocation(var3.left, var3.top);
        }
        class134.field3062.addFocusListener(this);
        class134.field3062.requestFocus();
        class22.field492 = true;
        class102.field2247 = false;
        class61.field1370 = class10.method47(18889);
    }

    @OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2681++;
        if (class127.field2886 != this || class156.field3588) {
            return;
        }
        class22.field492 = true;
        if (class151.field3454 != null && class151.field3454.startsWith("1.5") && class10.method47(18889) - class61.field1370 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class75.field1599 <= var2.width && class137.field3130 <= var2.height) {
                class102.field2247 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2659++;
        if (class127.field2886 == this && !class156.field3588) {
            class147.field3361 = class10.method47(18889);
            class127.method981((byte) -86, 5000L);
            class20.field441 = null;
            this.method911(0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public abstract void method170(int arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
    public final void method904(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2687++;
        try {
            if (arg0 >= -41) {
                field2655 = -107;
            }
            if (class127.field2886 == null) {
                class127.field2886 = this;
                class13.field286 = arg4;
                class137.field3130 = arg3;
                class75.field1599 = arg2;
                if (class129.field2954 == null) {
                    class20.field441 = class129.field2954 = new class151(false, this, arg1, null, 0);
                }
                class129.field2954.method1170(1, 20919, this);
            } else {
                class47.field1101++;
                if (class47.field1101 >= 3) {
                    this.method910(0, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class142.method1130(null, var7, 7565);
            this.method910(0, "crash");
        }
    }

    @OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Z")
    public final boolean method905(byte arg0) {
        field2657++;
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
            if (arg0 > -81) {
                field2666 = null;
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method910(0, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "start", descriptor = "()V")
    public final void start() {
        field2658++;
        if (class127.field2886 == this && !class156.field3588) {
            class147.field3361 = 0L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2676++;
    }

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2683++;
        class87.field1912 = false;
    }

    @OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2685++;
        if (class23.field547 == null) {
            return class129.field2954 == null || class129.field2954.field3453 == this ? super.getCodeBase() : class129.field2954.field3453.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V")
    public final void stop() {
        field2669++;
        if (class127.field2886 == this && !class156.field3588) {
            class147.field3361 = class10.method47(18889) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2672++;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public abstract void method171(int arg0);

    @OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2671++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIBLt;Z)V")
    public static final void method906(int arg0, int arg1, int arg2, int arg3, byte arg4, class132 arg5, boolean arg6) {
        field2670++;
        long var7 = (long) ((arg1 << 16) + arg3);
        class87 var9 = (class87) class46.field1089.method1141(var7, -1);
        if (var9 != null) {
            return;
        }
        class87 var10 = (class87) class157.field3602.method1141(var7, -1);
        if (var10 != null) {
            return;
        }
        class87 var11 = (class87) class119.field2617.method1141(var7, arg0 + 32406);
        if (var11 == null) {
            if (arg0 != -32407) {
                field2674 = null;
            }
            if (!arg6) {
                class87 var12 = (class87) class29.field766.method1141(var7, -1);
                if (var12 != null) {
                    return;
                }
            }
            class87 var13 = new class87();
            var13.field1918 = arg2;
            var13.field1914 = arg5;
            var13.field1920 = arg4;
            if (arg6) {
                class46.field1089.method1137((byte) -89, var7, var13);
                class112.field2417++;
            } else {
                class67.field1504.method690(var13, 0);
                class119.field2617.method1137((byte) -89, var7, var13);
                class35.field901++;
            }
        } else if (arg6) {
            var11.method517(87);
            class46.field1089.method1137((byte) -89, var7, var11);
            class112.field2417++;
            class35.field901--;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2654++;
    }

    @OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2665++;
        this.destroy();
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    private final void method907(int arg0) {
        field2668++;
        long var2 = class10.method47(18889);
        long var4 = class131.field2991[class44.field1050];
        class131.field2991[class44.field1050] = var2;
        class44.field1050 = class44.field1050 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class131.field3003 = ((var6 >> 1) + 32000) / var6;
        }
        if (class54.field1217++ > 50) {
            class54.field1217 -= 50;
            class22.field492 = true;
            class134.field3062.setSize(class75.field1599, class137.field3130);
            class134.field3062.setVisible(true);
            if (class23.field547 == null) {
                class134.field3062.setLocation(0, 0);
            } else {
                Insets var7 = class23.field547.getInsets();
                class134.field3062.setLocation(var7.left, var7.top);
            }
        }
        this.method171(16097);
        int var8 = 66 % ((arg0 + 5) / 60);
    }

    @OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2653++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIBILjava/lang/String;)V")
    public final void method908(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, String arg6) {
        field2680++;
        if (arg4 != 85) {
            this.start();
        }
        try {
            class137.field3130 = arg0;
            class13.field286 = arg3;
            class75.field1599 = arg5;
            class127.field2886 = this;
            class23.field547 = new Frame();
            class23.field547.setTitle("Jagex");
            class23.field547.setResizable(false);
            class23.field547.addWindowListener(this);
            class23.field547.setVisible(true);
            class23.field547.toFront();
            Insets var8 = class23.field547.getInsets();
            class23.field547.setSize(var8.left + arg5 + var8.right, var8.top + arg0 + var8.bottom);
            class20.field441 = class129.field2954 = new class151(true, null, arg2, arg6, arg1);
            class129.field2954.method1170(1, 20919, this);
        } catch (Exception var10) {
            class142.method1130(null, var10, 7565);
        }
    }

    @OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2662++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class87.field1912 = true;
        field2660++;
        class22.field492 = true;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public abstract void method175(int arg0);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public abstract void method169(byte arg0);

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
    public final void run() {
        field2686++;
        try {
            if (class151.field3463 != null) {
                String var1 = class151.field3463.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class151.field3454;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method910(0, "wrongjava");
                        return;
                    }
                    class44.field1059 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class151.field3454 == null || class151.field3454.equals("1.4.2"))) {
                    this.method910(0, "wrongjava");
                    return;
                }
            }
            if (class129.field2954.field3453 != null) {
                Method var3 = class151.field3461;
                if (var3 != null) {
                    try {
                        var3.invoke(class129.field2954.field3453, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method903((byte) 120);
            class106.field2294 = class52.method379(class137.field3130, class134.field3062, class75.field1599, (byte) 125);
            this.method169((byte) -109);
            class98.field2114 = class15.method121((byte) -94);
            while (class147.field3361 == 0L || class10.method47(18889) < class147.field3361) {
                class57.field1326 = class98.field2114.method13(128, class65.field1482, class44.field1059);
                for (int var4 = 0; var4 < class57.field1326; var4++) {
                    this.method902(-14557);
                }
                this.method907(89);
                class65.method450(class134.field3062, -104, class129.field2954);
            }
        } catch (Exception var7) {
            class142.method1130(null, var7, 7565);
            this.method910(0, "crash");
        }
        this.method911(0);
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public abstract void method173(int arg0);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    public static void method909(int arg0) {
        if (arg0 != 5) {
            providesignlink(null);
        }
        field2673 = null;
        field2656 = null;
        field2674 = null;
        field2666 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method910(int arg0, String arg1) {
        field2677++;
        if (this.field2684) {
            return;
        }
        this.field2684 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 == 0) {
            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2682++;
    }

    @OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2661++;
        if (class23.field547 == null) {
            return class129.field2954 == null || class129.field2954.field3453 == this ? super.getAppletContext() : class129.field2954.field3453.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)V")
    private final synchronized void method911(int arg0) {
        field2667++;
        if (class156.field3588) {
            return;
        }
        class156.field3588 = true;
        try {
            class134.field3062.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method170(arg0 + arg0);
        } catch (Exception var4) {
        }
        if (class23.field547 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class129.field2954 != null) {
            try {
                class129.field2954.method1174(0);
            } catch (Exception var2) {
            }
        }
        this.method173(-618353250);
    }
}
