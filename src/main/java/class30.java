import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
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

@OriginalClass("mapview!pa")
public abstract class class30 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "Z")
    private boolean field397 = false;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "Lna;")
    public static class26 field394 = method205((byte) 38, " )2 ");

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "Lna;")
    public static class26 field400 = method205((byte) 37, "Food Shop");

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "I")
    public static volatile int field402 = 0;

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "[J")
    private static long[] field395 = new long[32];

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "Lna;")
    public static class26 field404 = method205((byte) 37, "Windmill");

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "Lna;")
    public static class26 field403 = method205((byte) 26, "Potters Wheel");

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "I")
    public static volatile int field399 = 0;

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "mapview!pa", name = "m", descriptor = "Z")
    public static boolean field406;

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "[[B")
    public static byte[][] field396;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Z)V", line = 5)
    public final synchronized void method197(boolean arg0) {
        Container var2;
        if (class35.field453 == null) {
            var2 = class13.field191.field511;
        } else {
            var2 = class35.field453;
        }
        if (class33.field435 != null) {
            class33.field435.removeFocusListener(this);
            var2.remove(class33.field435);
        }
        class33.field435 = new class25(this);
        var2.add(class33.field435);
        class33.field435.setSize(field405, class31.field413);
        class33.field435.setVisible(true);
        if (class35.field453 == null) {
            class33.field435.setLocation(0, 0);
        } else {
            Insets var3 = class35.field453.getInsets();
            class33.field435.setLocation(var3.left, var3.top);
        }
        class33.field435.addFocusListener(this);
        class33.field435.requestFocus();
        mapview.field7 = true;
        class15.field206 = arg0;
        class15.field211 = class13.method85(5);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 41)
    public final void method198(String arg0, byte arg1) {
        if (this.field397) {
            return;
        }
        this.field397 = true;
        int var3 = 60 / ((63 - arg1) / 63);
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 61)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!pa", name = "stop", descriptor = "()V", line = 72)
    public final void stop() {
        if (class6.field145 == this && !class31.field411) {
            class41.field523 = class13.method85(98) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)V", line = 85)
    public static void method199(int arg0) {
        field396 = null;
        field400 = null;
        field403 = null;
        field394 = null;
        field404 = null;
        if (arg0 < 14) {
            field395 = null;
        }
        field395 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 102)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B)V", line = 109)
    private final synchronized void method200(byte arg0) {
        if (class31.field411) {
            return;
        }
        class31.field411 = true;
        try {
            class33.field435.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method16((byte) 110);
        } catch (Exception var8) {
        }
        if (arg0 != 11) {
            return;
        }
        if (class35.field453 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class13.field191 != null) {
            try {
                class13.field191.method255(10);
            } catch (Exception var6) {
            }
        }
        this.method10(6);
    }

    @OriginalMember(owner = "mapview!pa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 160)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 165)
    public final void focusGained(FocusEvent arg0) {
        mapview.field7 = true;
    }

    @OriginalMember(owner = "mapview!pa", name = "run", descriptor = "()V", line = 178)
    public final void run() {
        try {
            if (class40.field503 != null) {
                String var1 = class40.field503.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class40.field509;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method198("wrongjava", (byte) 127);
                        return;
                    }
                    class37.field484 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class40.field509 == null || class40.field509.equals("1.4.2"))) {
                    this.method198("wrongjava", (byte) -114);
                    return;
                }
            }
            if (class13.field191.field511 != null) {
                Method var3 = class40.field512;
                if (var3 != null) {
                    try {
                        var3.invoke(class13.field191.field511, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method197(false);
            class12.field181 = class33.method215(class33.field435, field405, 0, class31.field413);
            this.method18((byte) 22);
            class35.field455 = class20.method127(-34);
            while (class41.field523 == 0L || class13.method85(-96) < class41.field523) {
                class32.field430 = class35.field455.method209(class26.field369, 0, class37.field484);
                for (int var5 = 0; var5 < class32.field430; var5++) {
                    this.method203(40);
                }
                this.method202(-10329);
                class16.method106(class13.field191, 122, class33.field435);
            }
        } catch (Exception var8) {
            class37.method237(null, 97, var8);
            this.method198("crash", (byte) -55);
        }
        this.method200((byte) 11);
    }

    @OriginalMember(owner = "mapview!pa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 259)
    public final String getParameter(String arg0) {
        if (class35.field453 == null) {
            return class13.field191 == null || class13.field191.field511 == this ? super.getParameter(arg0) : class13.field191.field511.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "([Lna;III)V", line = 273)
    private static final void method201(class26[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 == arg3) {
            arg0[0].method171(0);
        } else {
            class15.method101(arg0, arg2, false, arg1).method171(0);
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "(I)V", line = 289)
    private final void method202(int arg0) {
        long var2 = class13.method85(arg0 + 10278);
        long var4 = field395[class13.field195];
        field395[class13.field195] = var2;
        class13.field195 = class13.field195 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
        }
        if (arg0 != -10329) {
            return;
        }
        if (class27.field378++ > 50) {
            class27.field378 -= 50;
            mapview.field7 = true;
            class33.field435.setSize(field405, class31.field413);
            class33.field435.setVisible(true);
            if (class35.field453 == null) {
                class33.field435.setLocation(0, 0);
            } else {
                Insets var6 = class35.field453.getInsets();
                class33.field435.setLocation(var6.left, var6.top);
            }
        }
        this.method20(109);
    }

    @OriginalMember(owner = "mapview!pa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 329)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "destroy", descriptor = "()V", line = 333)
    public final void destroy() {
        if (class6.field145 == this && !class31.field411) {
            class41.field523 = class13.method85(-121);
            class33.method218(5000L, 10);
            class32.field418 = null;
            this.method200((byte) 11);
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 358)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "(I)V", line = 365)
    private final void method203(int arg0) {
        long var2 = class13.method85(arg0 ^ 0xFFFFFFFB);
        long var4 = class32.field427[class37.field474];
        if (var4 != 0L && var2 <= var4) {
        }
        class32.field427[class37.field474] = var2;
        class37.field474 = class37.field474 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 != 40) {
                return;
            }
        }
        this.method15(-84);
    }

    @OriginalMember(owner = "mapview!pa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 393)
    public final URL getCodeBase() {
        if (class35.field453 == null) {
            return class13.field191 == null || class13.field191.field511 == this ? super.getCodeBase() : class13.field191.field511.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "start", descriptor = "()V", line = 408)
    public final void start() {
        if (class6.field145 == this && !class31.field411) {
            class41.field523 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 423)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "providesignlink", descriptor = "(Lv;)V", line = 431)
    public static final void providesignlink(class40 arg0) {
        class13.field191 = arg0;
        class32.field418 = arg0;
    }

    @OriginalMember(owner = "mapview!pa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 437)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "([BI)V", line = 444)
    public static final void method204(byte[] arg0, int arg1) {
        class4 var2 = new class4(arg0);
        var2.field132 = arg0.length - 2;
        field398 = var2.method47((byte) 114);
        if (arg1 > -56) {
            return;
        }
        class13.field192 = new int[field398];
        class37.field479 = new int[field398];
        class17.field224 = new int[field398];
        class31.field408 = new int[field398];
        field396 = new byte[field398][];
        var2.field132 = arg0.length - field398 * 8 - 7;
        class7.field167 = var2.method47((byte) 112);
        mapview.field1 = var2.method47((byte) 71);
        int var3 = (var2.method49((byte) 67) & 0xFF) + 1;
        for (int var4 = 0; var4 < field398; var4++) {
            class17.field224[var4] = var2.method47((byte) 112);
        }
        for (int var5 = 0; var5 < field398; var5++) {
            class13.field192[var5] = var2.method47((byte) 124);
        }
        for (int var6 = 0; var6 < field398; var6++) {
            class31.field408[var6] = var2.method47((byte) 64);
        }
        for (int var7 = 0; var7 < field398; var7++) {
            class37.field479[var7] = var2.method47((byte) 127);
        }
        var2.field132 = arg0.length - field398 * 8 - (var3 + -1) * 3 - 7;
        class29.field385 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class29.field385[var8] = var2.method42(11737);
            if (class29.field385[var8] == 0) {
                class29.field385[var8] = 1;
            }
        }
        var2.field132 = 0;
        for (int var9 = 0; var9 < field398; var9++) {
            int var10 = class31.field408[var9];
            int var11 = class37.field479[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            field396[var9] = var13;
            int var14 = var2.method49((byte) 102);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method51((byte) -83);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method51((byte) -83);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(BLjava/lang/String;)Lna;", line = 567)
    public static final class26 method205(byte arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        if (arg0 < 13) {
            field404 = null;
        }
        int var3 = 0;
        int var4 = var2.length;
        class26 var5 = new class26();
        var5.field358 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field358[var5.field367++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field358[var5.field367++] = (byte) var6;
            }
        }
        var5.method184(-1);
        return var5.method177(4096);
    }

    @OriginalMember(owner = "mapview!pa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 616)
    public final AppletContext getAppletContext() {
        if (class35.field453 == null) {
            return class13.field191 == null || class13.field191.field511 == this ? super.getAppletContext() : class13.field191.field511.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 628)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 632)
    public final URL getDocumentBase() {
        if (class35.field453 == null) {
            return class13.field191 == null || class13.field191.field511 == this ? super.getDocumentBase() : class13.field191.field511.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "(B)Z", line = 647)
    public final boolean method206(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 < 62) {
            field405 = 8;
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
                this.method198("invalidhost", (byte) 126);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 685)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!pa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 692)
    public final synchronized void paint(Graphics arg0) {
        if (class6.field145 != this || class31.field411) {
            return;
        }
        mapview.field7 = true;
        if (class40.field509 != null && class40.field509.startsWith("1.5") && class13.method85(-82) - class15.field211 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= field405 && var2.height >= class31.field413) {
                class15.field206 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I[Lna;)V", line = 718)
    public static final void method207(int arg0, class26[] arg1) {
        method201(arg1, arg1.length, arg0, arg0 ^ 0x1);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IIIIB)V", line = 726)
    public final void method208(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            if (class6.field145 != null) {
                class37.field482++;
                if (class37.field482 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method198("alreadyloaded", (byte) 126);
                return;
            }
            class31.field413 = arg2;
            class6.field145 = this;
            field405 = arg0;
            class25.field345 = arg1;
            if (class13.field191 == null) {
                class32.field418 = class13.field191 = new class40(false, this, arg3, null, 0);
            }
            class13.field191.method252(1, 0, this);
        } catch (Exception var7) {
            class37.method237(null, 125, var7);
            this.method198("crash", (byte) 127);
        }
        if (arg4 != 121) {
            field400 = null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(I)V")
    public abstract void method10(int arg0);

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "(I)V")
    public abstract void method20(int arg0);

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(B)V")
    public abstract void method18(byte arg0);

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "(I)V")
    public abstract void method15(int arg0);

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "(B)V")
    public abstract void method16(byte arg0);
}
