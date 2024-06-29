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
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class19 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Z")
    private boolean field300 = false;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Ljava/lang/String;")
    public static String field282 = "rating: ";

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field291 = 2;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "[I")
    public static int[] field299 = new int[2];

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "Lsb;")
    public static class124 field304;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "Z")
    public static boolean field305;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[I")
    public static int[] field268;

    @OriginalMember(owner = "client!ak", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class187.field3073 = false;
        field288++;
    }

    @OriginalMember(owner = "client!ak", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public abstract void method149(byte arg0);

    @OriginalMember(owner = "client!ak", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field301++;
        if (class207.field3327 == null) {
            return class205.field3294 == null || class205.field3294.field1291 == this ? super.getAppletContext() : class205.field3294.field1291.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field296++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
    private final void method150(int arg0, boolean arg1) {
        field289++;
        synchronized (this) {
            if (class227.field3603) {
                return;
            }
            class227.field3603 = true;
        }
        if (arg0 != 0) {
            field268 = null;
        }
        if (class205.field3294.field1291 != null) {
            class205.field3294.field1291.destroy();
        }
        try {
            this.method152(-64);
        } catch (Exception var9) {
        }
        if (class22.field340 != null) {
            try {
                class22.field340.removeFocusListener(this);
                class22.field340.getParent().remove(class22.field340);
            } catch (Exception var8) {
            }
        }
        if (class205.field3294 != null) {
            try {
                class205.field3294.method639(0);
            } catch (Exception var7) {
            }
        }
        this.method153((byte) 118);
        if (class207.field3327 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ak", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field281++;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    private final void method151(byte arg0) {
        long var2 = class62.method472(117);
        field274++;
        long var4 = class273.field4371[class25.field427];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class273.field4371[class25.field427] = var2;
        class25.field427 = class25.field427 + 1 & 0x1F;
        synchronized (this) {
            class228.field3626 = class187.field3073;
        }
        this.method156((byte) -121);
        if (arg0 >= -109) {
            field282 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!ak", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field295++;
        if (class207.field3327 == null) {
            return class205.field3294 == null || class205.field3294.field1291 == this ? super.getParameter(arg0) : class205.field3294.field1291.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field287++;
    }

    @OriginalMember(owner = "client!ak", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field292++;
        if (class207.field3327 == null) {
            return class205.field3294 == null || class205.field3294.field1291 == this ? super.getDocumentBase() : class205.field3294.field1291.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public abstract void method153(byte arg0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/String;BIIZ)V")
    public final void method154(int arg0, int arg1, int arg2, String arg3, byte arg4, int arg5, int arg6, boolean arg7) {
        if (arg4 < 11) {
            this.method156((byte) 81);
        }
        try {
            class75.field1226 = this;
            class287.field4595 = 0;
            class256.field4079 = arg6;
            class137.field2301 = arg5;
            class205.field3297 = arg5;
            class33.field557 = arg2;
            class56.field991 = arg2;
            class22.field339 = 0;
            class207.field3327 = new Frame();
            class207.field3327.setTitle("Jagex");
            class207.field3327.setResizable(true);
            class207.field3327.addWindowListener(this);
            class207.field3327.setVisible(true);
            class207.field3327.toFront();
            Insets var9 = class207.field3327.getInsets();
            class207.field3327.setSize(class205.field3297 + var9.left + var9.right, class56.field991 - -var9.top - -var9.bottom);
            class6.field69 = class205.field3294 = new class78((Applet) null, arg0, arg3, arg1);
            class115 var10 = class205.field3294.method628(1, this, (byte) 82);
            while (var10.field1937 == 0) {
                class234.method1550(-28773, 10L);
            }
        } catch (Exception var12) {
            class161.method1167(var12, -128, (String) null);
        }
        field279++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZIII)V")
    public final void method155(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field269++;
        try {
            if (class75.field1226 == null) {
                class33.field557 = arg0;
                class56.field991 = arg0;
                class137.field2301 = arg2;
                class205.field3297 = arg2;
                class75.field1226 = this;
                if (!arg1) {
                    class256.field4079 = arg4;
                    class287.field4595 = 0;
                    class22.field339 = 0;
                    String var6 = this.getParameter("openwinjs");
                    boolean var10000;
                    if (var6 != null && var6.equals("1")) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                    if (class205.field3294 == null) {
                        class6.field69 = class205.field3294 = new class78(this, arg3, (String) null, 0);
                    }
                    class115 var7 = class205.field3294.method628(1, this, (byte) 82);
                    while (var7.field1937 == 0) {
                        class234.method1550(-28773, 10L);
                    }
                }
            } else {
                class80.field1331++;
                if (class80.field1331 >= 3) {
                    this.method163("alreadyloaded", -2);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class161.method1167(var9, -121, (String) null);
            this.method163("crash", -2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
    public abstract void method156(byte arg0);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static final void method157(int arg0) {
        field285++;
        for (int var1 = arg0; var1 < class144.field2386; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class279.field4431[var1];
            }
            class213 var3 = class191.field3129[var2];
            if (var3 != null) {
                class149.method1094(arg0 ^ 0x52, var3, var3.method1226((byte) -99));
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field271++;
        if (class75.field1226 != this || class227.field3603) {
            return;
        }
        class285.field4540 = true;
        if (class11.field149 && (class62.method472(64) - class276.field4396) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class205.field3297 && class56.field991 <= var2.height) {
                class179.field2975 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "start", descriptor = "()V")
    public final void start() {
        field275++;
        if (class75.field1226 == this && !class227.field3603) {
            class269.field4318 = 0L;
        }
    }

    @OriginalMember(owner = "client!ak", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class187.field3073 = true;
        field298++;
        class285.field4540 = true;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    private final void method158(int arg0) {
        field286++;
        long var2 = class76.field1242[class186.field3048];
        long var4 = class62.method472(100);
        class76.field1242[class186.field3048] = var4;
        class186.field3048 = class186.field3048 + 1 & 0x1F;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class127.field2093 = ((var6 >> 1) + 32000) / var6;
        }
        if (class263.field4176++ > 50) {
            class285.field4540 = true;
            class263.field4176 -= 50;
            class22.field340.setSize(class137.field2301, class33.field557);
            class22.field340.setVisible(true);
            if (class207.field3327 != null && class201.field3273 == null) {
                Insets var7 = class207.field3327.getInsets();
                class22.field340.setLocation(class287.field4595 + var7.left, class22.field339 + var7.top);
            } else {
                class22.field340.setLocation(class287.field4595, class22.field339);
            }
        }
        this.method149((byte) 37);
        if (arg0 != -14763) {
            this.windowDeactivated((WindowEvent) null);
        }
    }

    @OriginalMember(owner = "client!ak", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field303++;
        if (class207.field3327 == null) {
            return class205.field3294 == null || class205.field3294.field1291 == this ? super.getCodeBase() : class205.field3294.field1291.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "run", descriptor = "()V")
    public final void run() {
        field297++;
        try {
            if (class78.field1297 != null) {
                String var1 = class78.field1297.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class78.field1296;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method163("wrongjava", -2);
                        return;
                    }
                    class193.field3159 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class78.field1296 == null || class78.field1296.equals("1.4.2"))) {
                    this.method163("wrongjava", -2);
                    return;
                }
            }
            if (class78.field1296 != null && class78.field1296.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class78.field1296.length()) {
                    char var5 = class78.field1296.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var5 - (48 - var4 * 10);
                    var3++;
                }
                if (var4 >= 5) {
                    class11.field149 = true;
                }
            }
            if (class205.field3294.field1291 != null) {
                Method var6 = class78.field1309;
                if (var6 != null) {
                    try {
                        var6.invoke(class205.field3294.field1291, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class163.method1177((byte) -123);
            this.method162(3282);
            class263.field4173 = class293.method1965(class33.field557, class22.field340, -86, class137.field2301);
            this.method160((byte) 107);
            class100.field1533 = class45.method388(true);
            while (class269.field4318 == 0L || class62.method472(26) < class269.field4318) {
                class100.field1514 = class100.field1533.method921(class137.field2298, 6, class193.field3159);
                for (int var7 = 0; var7 < class100.field1514; var7++) {
                    this.method151((byte) -122);
                }
                this.method158(-14763);
                class66.method512(class205.field3294, class22.field340, (byte) 43);
            }
        } catch (Exception var10) {
            class161.method1167(var10, -125, (String) null);
            this.method163("crash", -2);
        }
        this.method150(0, true);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)Z")
    public final boolean method159(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field272++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 >= -46) {
            field304 = null;
        }
        if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method163("invalidhost", -2);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
    public abstract void method160(byte arg0);

    @OriginalMember(owner = "client!ak", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field284++;
    }

    @OriginalMember(owner = "client!ak", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field280++;
    }

    @OriginalMember(owner = "client!ak", name = "stop", descriptor = "()V")
    public final void stop() {
        field283++;
        if (class75.field1226 == this && !class227.field3603) {
            class269.field4318 = class62.method472(42) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
    public static void method161(int arg0) {
        field268 = null;
        if (arg0 >= 123) {
            field299 = null;
            field282 = null;
            field304 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field293++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ak", name = "providesignlink", descriptor = "(Lne;)V")
    public static final void providesignlink(class78 arg0) {
        field273++;
        class205.field3294 = arg0;
        class6.field69 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field276++;
    }

    @OriginalMember(owner = "client!ak", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field294++;
        if (class75.field1226 == this && !class227.field3603) {
            class269.field4318 = class62.method472(26);
            class234.method1550(-28773, 5000L);
            class6.field69 = null;
            this.method150(0, false);
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field270++;
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V")
    public final synchronized void method162(int arg0) {
        if (class22.field340 != null) {
            class22.field340.removeFocusListener(this);
            class22.field340.getParent().remove(class22.field340);
        }
        field278++;
        Container var2;
        if (class201.field3273 != null) {
            var2 = class201.field3273;
        } else if (class207.field3327 == null) {
            var2 = class205.field3294.field1291;
        } else {
            var2 = class207.field3327;
        }
        var2.setLayout((LayoutManager) null);
        class22.field340 = new class269(this);
        var2.add(class22.field340);
        class22.field340.setSize(class137.field2301, class33.field557);
        class22.field340.setVisible(true);
        if (class207.field3327 == var2) {
            Insets var3 = class207.field3327.getInsets();
            class22.field340.setLocation(var3.left + class287.field4595, class22.field339 + var3.top);
        } else {
            class22.field340.setLocation(class287.field4595, class22.field339);
        }
        class22.field340.addFocusListener(this);
        class22.field340.requestFocus();
        class187.field3073 = true;
        class228.field3626 = true;
        class285.field4540 = true;
        if (arg0 != 3282) {
            field291 = -5;
        }
        class179.field2975 = false;
        class276.field4396 = class62.method472(75);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method163(String arg0, int arg1) {
        field277++;
        if (this.field300) {
            return;
        }
        this.field300 = true;
        if (arg1 != -2) {
            return;
        }
        System.out.println("error_game_" + arg0);
        try {
            class120.method877(class205.field3294.field1291, arg1 ^ 0xFFFF9B88, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(B)V")
    public static final void method164(byte arg0) {
        field290++;
        if (class69.field1167 == 0) {
            return;
        }
        try {
            if (++class130.field2157 > 2000) {
                if (class23.field360 != null) {
                    class23.field360.method294((byte) -26);
                    class23.field360 = null;
                }
                if (class97.field1504 >= 1) {
                    class285.field4532 = -5;
                    class69.field1167 = 0;
                    return;
                }
                class97.field1504++;
                class69.field1167 = 1;
                class130.field2157 = 0;
                if (class194.field3176 == class113.field1741) {
                    class194.field3176 = class236.field3735;
                } else {
                    class194.field3176 = class113.field1741;
                }
            }
            if (class69.field1167 == 1) {
                class239.field3767 = class205.field3294.method637(class130.field2153, class194.field3176, (byte) -109);
                class69.field1167 = 2;
            }
            if (class69.field1167 == 2) {
                if (class239.field3767.field1937 == 2) {
                    throw new IOException();
                }
                if (class239.field3767.field1937 != 1) {
                    return;
                }
                class23.field360 = new class35((Socket) class239.field3767.field1936, class205.field3294);
                class239.field3767 = null;
                class23.field360.method301(class87.field1405.field2231, 0, class87.field1405.field2263, (byte) -117);
                if (class165.field2709 != null) {
                    class165.field2709.method1600(arg0 ^ 0xFFFFF1B1);
                }
                if (class212.field3396 != null) {
                    class212.field3396.method1600(-3624);
                }
                int var1 = class23.field360.method295(-8922);
                if (class165.field2709 != null) {
                    class165.field2709.method1600(-3624);
                }
                if (class212.field3396 != null) {
                    class212.field3396.method1600(-3624);
                }
                if (var1 != 21) {
                    class285.field4532 = var1;
                    class69.field1167 = 0;
                    class23.field360.method294((byte) 122);
                    class23.field360 = null;
                    return;
                }
                class69.field1167 = 3;
            }
            if (class69.field1167 == 3) {
                if (class23.field360.method296(-53) < 1) {
                    return;
                }
                class250.field3985 = new String[class23.field360.method295(-8922)];
                class69.field1167 = 4;
            }
            if (arg0 != 105) {
                field282 = null;
            }
            if (class69.field1167 == 4 && class23.field360.method296(-96) >= (class250.field3985.length * 8)) {
                class143.field2360.field2231 = 0;
                class23.field360.method303(-1, class250.field3985.length * 8, class143.field2360.field2263, 0);
                for (int var2 = 0; var2 < class250.field3985.length; var2++) {
                    class250.field3985[var2] = class296.method1985(class143.field2360.method983(class172.method1232(arg0, 29923)), 3026);
                }
                class285.field4532 = 21;
                class69.field1167 = 0;
                class23.field360.method294((byte) 106);
                class23.field360 = null;
            }
        } catch (IOException var3) {
            if (class23.field360 != null) {
                class23.field360.method294((byte) 108);
                class23.field360 = null;
            }
            if (class97.field1504 < 1) {
                class130.field2157 = 0;
                class97.field1504++;
                class69.field1167 = 1;
                if (class194.field3176 == class113.field1741) {
                    class194.field3176 = class236.field3735;
                } else {
                    class194.field3176 = class113.field1741;
                }
            } else {
                class285.field4532 = -4;
                class69.field1167 = 0;
            }
        }
    }
}
