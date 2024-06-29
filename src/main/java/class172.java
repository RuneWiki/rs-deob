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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class172 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Z")
    private boolean field3318 = false;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "J")
    public static long field3324 = 0L;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "[Lwa;")
    public static class217[] field3326 = new class217[50];

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Lrd;")
    public static class173 field3346 = class133.method843("welle:", 30);

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "[Lad;")
    public static class5[] field3345 = new class5[5000];

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lrd;")
    public static class173 field3322 = class133.method843("<col=ffff00>", 124);

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "[I")
    public static int[] field3344 = new int[2000];

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field3328 = 0;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "Lrd;")
    private static class173 field3356 = class133.method843("Please subscribe)1 or use a different world)3", -76);

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field3343 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lrd;")
    public static class173 field3316 = field3356;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field3362 = -1;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field3361 = 0;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "Z")
    public static boolean field3364;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "[Lfd;")
    public static class55[] field3352;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1103(String arg0, byte arg1) {
        field3327++;
        if (this.field3318) {
            return;
        }
        this.field3318 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
        if (arg1 != 55) {
            field3343 = 102;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZIII)V")
    public final void method1104(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3351++;
        try {
            if (class174.field3436 == null) {
                class3.field26 = arg4;
                class97.field1771 = arg3;
                class174.field3436 = this;
                class204.field4001 = arg2;
                if (class64.field1264 == null) {
                    class82.field1610 = class64.field1264 = new class130(false, this, arg0, null, 0);
                }
                if (!arg1) {
                    class64.field1264.method835(1, -24542, this);
                }
            } else {
                class46.field970++;
                if (class46.field970 >= 3) {
                    this.method1103("alreadyloaded", (byte) 55);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class74.method461((byte) -124, var7, null);
            this.method1103("crash", (byte) 55);
        }
    }

    @OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3353++;
        if (class174.field3436 == this && !class110.field2045) {
            class8.field155 = class97.method599(5);
            class151.method996(12121, 5000L);
            class82.field1610 = null;
            this.method1113(0, false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3355++;
        class202.field3917 = false;
    }

    @OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3337++;
        if (class174.field3436 != this || class110.field2045) {
            return;
        }
        class202.field3912 = true;
        if (class130.field2453 != null && class130.field2453.startsWith("1.5") && class97.method599(5) - class81.field1592 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class204.field4001 && var2.height >= class97.field1771) {
                class22.field483 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3332++;
    }

    @OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3341++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method1105(int arg0) {
        field3358++;
        if (class57.field1143 == null || class54.field1079 == null) {
            class54.field1079 = new int[256];
            class57.field1143 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class57.field1143[var1] = (int) (Math.sin(var2) * 4096.0D);
                class54.field1079[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 5000) {
            method1107(124, -90L);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method1106(byte arg0) {
        field3346 = null;
        field3322 = null;
        field3352 = null;
        field3326 = null;
        field3344 = null;
        if (arg0 <= 50) {
            field3352 = null;
        }
        field3356 = null;
        field3345 = null;
        field3316 = null;
    }

    @OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3339++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3325++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IJ)V")
    public static final void method1107(int arg0, long arg1) {
        field3333++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg0 != -1) {
            field3356 = null;
        }
        while (class129.field2442 > var3) {
            if (class209.field4061[var3] == arg1) {
                class129.field2442--;
                for (int var4 = var3; var4 < class129.field2442; var4++) {
                    class159.field2972[var4] = class159.field2972[var4 + 1];
                    class181.field3557[var4] = class181.field3557[var4 + 1];
                    class62.field1228[var4] = class62.field1228[var4 + 1];
                    class209.field4061[var4] = class209.field4061[var4 + 1];
                    class207.field4031[var4] = class207.field4031[var4 + 1];
                }
                class189.field3692 = class34.field741;
                class165.field3175.method1023(52, arg0 - 21821);
                class165.field3175.method756(arg1, arg0 + 95);
                class205.field4006++;
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3354++;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public abstract void method243(byte arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIILjava/lang/String;BI)V")
    public final void method1108(int arg0, int arg1, int arg2, int arg3, String arg4, byte arg5, int arg6) {
        field3320++;
        try {
            class204.field4001 = arg6;
            class174.field3436 = this;
            if (arg5 > -6) {
                this.method1104(119, true, 66, 22, 113);
            }
            class3.field26 = arg0;
            class97.field1771 = arg2;
            class31.field653 = new Frame();
            class31.field653.setTitle("Jagex");
            class31.field653.setResizable(false);
            class31.field653.addWindowListener(this);
            class31.field653.setVisible(true);
            class31.field653.toFront();
            Insets var8 = class31.field653.getInsets();
            class31.field653.setSize(var8.left + arg6 + var8.right, arg2 - (-var8.top - var8.bottom));
            class82.field1610 = class64.field1264 = new class130(true, null, arg1, arg4, arg3);
            class64.field1264.method835(1, -24542, this);
        } catch (Exception var10) {
            class74.method461((byte) -121, var10, null);
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3330++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILde;)V")
    public static final void method1109(int arg0, class36 arg1) {
        if (arg0 != 0) {
            field3361 = -126;
        }
        class25.field534 = arg1;
        field3342++;
    }

    @OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3349++;
    }

    @OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3319++;
        if (class31.field653 == null) {
            return class64.field1264 == null || class64.field1264.field2465 == this ? super.getParameter(arg0) : class64.field1264.field2465.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "start", descriptor = "()V")
    public final void start() {
        field3321++;
        if (class174.field3436 == this && !class110.field2045) {
            class8.field155 = 0L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public abstract void method246(int arg0);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    private final void method1110(int arg0) {
        long var2 = class97.method599(arg0 - 11518);
        long var4 = class46.field955[class114.field2101];
        field3317++;
        class46.field955[class114.field2101] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class114.field2101 = class114.field2101 + 1 & 0x1F;
        synchronized (this) {
            class135.field2556 = class202.field3917;
        }
        this.method246(140);
        if (arg0 != 11523) {
            field3361 = -78;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public abstract void method245(byte arg0);

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class202.field3917 = true;
        class202.field3912 = true;
        field3350++;
    }

    @OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3360++;
        if (class31.field653 == null) {
            return class64.field1264 == null || class64.field1264.field2465 == this ? super.getCodeBase() : class64.field1264.field2465.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Lna;)V")
    public static final void providesignlink(class130 arg0) {
        class64.field1264 = arg0;
        class82.field1610 = arg0;
        field3331++;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    public abstract void method248(byte arg0);

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V")
    private final void method1111(byte arg0) {
        if (arg0 <= 88) {
            method1109(-42, null);
        }
        field3363++;
        long var2 = class97.method599(5);
        long var4 = class9.field168[class190.field3717];
        class9.field168[class190.field3717] = var2;
        class190.field3717 = class190.field3717 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class139.field2601 = ((var6 >> 1) + 32000) / var6;
        }
        if (class135.field2567++ > 50) {
            class202.field3912 = true;
            class135.field2567 -= 50;
            class165.field3183.setSize(class204.field4001, class97.field1771);
            class165.field3183.setVisible(true);
            if (class31.field653 == null) {
                class165.field3183.setLocation(0, 0);
            } else {
                Insets var7 = class31.field653.getInsets();
                class165.field3183.setLocation(var7.left, var7.top);
            }
        }
        this.method243((byte) 70);
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(B)V")
    public final synchronized void method1112(byte arg0) {
        field3334++;
        Container var2;
        if (class31.field653 == null) {
            var2 = class64.field1264.field2465;
        } else {
            var2 = class31.field653;
        }
        if (class165.field3183 != null) {
            class165.field3183.removeFocusListener(this);
            var2.remove(class165.field3183);
        }
        class165.field3183 = new class158(this);
        if (arg0 != -42) {
            return;
        }
        var2.add(class165.field3183);
        class165.field3183.setSize(class204.field4001, class97.field1771);
        class165.field3183.setVisible(true);
        if (class31.field653 == null) {
            class165.field3183.setLocation(0, 0);
        } else {
            Insets var3 = class31.field653.getInsets();
            class165.field3183.setLocation(var3.left, var3.top);
        }
        class165.field3183.addFocusListener(this);
        class165.field3183.requestFocus();
        class202.field3912 = true;
        class22.field483 = false;
        class81.field1592 = class97.method599(5);
    }

    @OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3335++;
        if (class31.field653 == null) {
            return class64.field1264 == null || class64.field1264.field2465 == this ? super.getDocumentBase() : class64.field1264.field2465.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)V")
    private final void method1113(int arg0, boolean arg1) {
        field3340++;
        synchronized (this) {
            if (class110.field2045) {
                return;
            }
            class110.field2045 = true;
        }
        if (class64.field1264.field2465 != null) {
            class64.field1264.field2465.destroy();
        }
        if (class165.field3183 != null) {
            try {
                class165.field3183.removeFocusListener(this);
                Container var4;
                if (class31.field653 == null) {
                    var4 = class64.field1264.field2465;
                } else {
                    var4 = class31.field653;
                }
                var4.remove(class165.field3183);
            } catch (Exception var10) {
            }
        }
        try {
            this.method245((byte) 123);
        } catch (Exception var9) {
        }
        if (class64.field1264 != null) {
            try {
                class64.field1264.method827(0);
            } catch (Exception var8) {
            }
        }
        this.method248((byte) 88);
        if (arg0 != 0) {
            this.getAppletContext();
        }
        if (class31.field653 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3359++;
    }

    @OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3336++;
        if (class31.field653 == null) {
            return class64.field1264 == null || class64.field1264.field2465 == this ? super.getAppletContext() : class64.field1264.field2465.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)Z")
    public final boolean method1114(int arg0) {
        field3323++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 != -1) {
            return false;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1103("invalidhost", (byte) 55);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
    public final void run() {
        field3348++;
        try {
            if (class130.field2456 != null) {
                String var1 = class130.field2456.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class130.field2453;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1103("wrongjava", (byte) 55);
                        return;
                    }
                    class34.field742 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class130.field2453 == null || class130.field2453.equals("1.4.2"))) {
                    this.method1103("wrongjava", (byte) 55);
                    return;
                }
            }
            if (class64.field1264.field2465 != null) {
                Method var3 = class130.field2449;
                if (var3 != null) {
                    try {
                        var3.invoke(class64.field1264.field2465, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1112((byte) -42);
            class67.field1307 = class153.method1013(class97.field1771, class165.field3183, class204.field4001, (byte) -72);
            this.method249(-20);
            class103.field1918 = class199.method1319(true);
            while (class8.field155 == 0L || class8.field155 > class97.method599(5)) {
                class8.field147 = class103.field1918.method286(true, class67.field1312, class34.field742);
                for (int var4 = 0; var4 < class8.field147; var4++) {
                    this.method1110(11523);
                }
                this.method1111((byte) 89);
                class140.method869(class165.field3183, false, class64.field1264);
            }
        } catch (Exception var7) {
            class74.method461((byte) -117, var7, null);
            this.method1103("crash", (byte) 55);
        }
        this.method1113(0, true);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1115(int arg0, Throwable arg1) throws IOException {
        field3357++;
        String var2;
        if (arg1 instanceof class17) {
            class17 var3 = (class17) arg1;
            var2 = var3.field369 + " | ";
            arg1 = var3.field359;
        } else {
            var2 = "";
        }
        if (arg0 != 32533) {
            field3328 = 46;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V")
    public final void stop() {
        field3338++;
        if (class174.field3436 == this && !class110.field2045) {
            class8.field155 = class97.method599(5) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public abstract void method249(int arg0);
}
