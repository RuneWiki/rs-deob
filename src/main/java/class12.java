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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public abstract class class12 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Z")
    private boolean field154 = false;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "[I")
    public static int[] field151 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "Lr;")
    public static class33 field156 = class29.method192("_", (byte) 126);

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "Lr;")
    public static class33 field155 = class29.method192("Spinning Wheel", (byte) 126);

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Lr;")
    public static class33 field153 = class29.method192("Fur Trader", (byte) 126);

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "Lr;")
    public static class33 field159 = class29.method192("overlay)3dat", (byte) 126);

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "I")
    public static int field157 = 50;

    @OriginalMember(owner = "mapview!fa", name = "l", descriptor = "Lr;")
    public static class33 field161 = class29.method192("Scimitar Shop", (byte) 126);

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Lr;")
    public static class33 field158 = class29.method192("Vegetable Store", (byte) 126);

    @OriginalMember(owner = "mapview!fa", name = "m", descriptor = "Lr;")
    public static class33 field162 = class29.method192("Loading", (byte) 126);

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "J")
    public static long field150;

    @OriginalMember(owner = "mapview!fa", name = "n", descriptor = "Z")
    public static boolean field163;

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "[I")
    public static int[] field160;

    @OriginalMember(owner = "mapview!fa", name = "stop", descriptor = "()V", line = 4)
    public final void stop() {
        if (class14.field171 == this && !class5.field62) {
            class33.field471 = class13.method94(-72) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 16)
    private final void method73(int arg0) {
        long var2 = class13.method94(-83);
        long var4 = class31.field437[class11.field142];
        if (var4 != 0L && var2 > var4) {
        }
        class31.field437[class11.field142] = var2;
        class11.field142 = class11.field142 + 1 & 0x1F;
        if (class23.field246++ > 50) {
            class23.field246 -= 50;
            class11.field147 = true;
            class31.field443.setSize(class23.field253, class23.field255);
            class31.field443.setVisible(true);
            if (class6.field79 == null) {
                class31.field443.setLocation(0, 0);
            } else {
                Insets var6 = class6.field79.getInsets();
                class31.field443.setLocation(var6.left, var6.top);
            }
        }
        this.method88((byte) 123);
        if (arg0 > -45) {
            field155 = null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 58)
    public final AppletContext getAppletContext() {
        if (class6.field79 == null) {
            return class38.field509 == null || class38.field509.field28 == this ? super.getAppletContext() : class38.field509.field28.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 71)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IILc;B)[Lh;", line = 81)
    private static final class15[] method75(int arg0, int arg1, class5 arg2, byte arg3) {
        if (arg3 > -88) {
            method86(105, (byte) 19, -85);
        }
        return class37.method252(arg1, -2, arg2, arg0) ? class22.method141((byte) -92) : null;
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(I)V", line = 95)
    public final synchronized void method76(int arg0) {
        Container var2;
        if (class6.field79 == null) {
            var2 = class38.field509.field28;
        } else {
            var2 = class6.field79;
        }
        if (arg0 <= 68) {
            this.method77(71);
        }
        if (class31.field443 != null) {
            class31.field443.removeFocusListener(this);
            var2.remove(class31.field443);
        }
        class31.field443 = new class21(this);
        var2.add(class31.field443);
        class31.field443.setSize(class23.field253, class23.field255);
        class31.field443.setVisible(true);
        if (class6.field79 == null) {
            class31.field443.setLocation(0, 0);
        } else {
            Insets var3 = class6.field79.getInsets();
            class31.field443.setLocation(var3.left, var3.top);
        }
        class31.field443.addFocusListener(this);
        class31.field443.requestFocus();
        class11.field147 = true;
        class33.field463 = false;
        class30.field429 = class13.method94(-123);
    }

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(I)V", line = 133)
    private final synchronized void method77(int arg0) {
        if (class5.field62) {
            return;
        }
        class5.field62 = true;
        try {
            class31.field443.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method79(arg0 ^ 0xFFFFFF84);
            if (arg0 != 70) {
                this.getDocumentBase();
            }
        } catch (Exception var8) {
        }
        if (class6.field79 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class38.field509 != null) {
            try {
                class38.field509.method18((byte) 122);
            } catch (Exception var6) {
            }
        }
        this.method74(true);
    }

    @OriginalMember(owner = "mapview!fa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 196)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 198)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "(I)V", line = 202)
    public static final void method78(int arg0) {
        if (arg0 <= 60) {
            field152 = -101;
        }
        class25 var1 = class35.field483;
        synchronized (class35.field483) {
            class35.field476 = class33.field472;
            if (class31.field447 >= 0) {
                while (class5.field42 != class31.field447) {
                    int var2 = class6.field70[class5.field42];
                    class5.field42 = class5.field42 + 1 & 0x7F;
                    if (var2 < 0) {
                        class30.field436[~var2] = false;
                    } else {
                        class30.field436[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class30.field436[var3] = false;
                }
                class31.field447 = class5.field42;
            }
            class33.field472 = class10.field132;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "run", descriptor = "()V", line = 244)
    public final void run() {
        try {
            if (class3.field19 != null) {
                String var1 = class3.field19.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class3.field20;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method83((byte) 107, "wrongjava");
                        return;
                    }
                    class6.field75 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class3.field20 == null || class3.field20.equals("1.4.2"))) {
                    this.method83((byte) 121, "wrongjava");
                    return;
                }
            }
            if (class38.field509.field28 != null) {
                Method var3 = class3.field17;
                if (var3 != null) {
                    try {
                        var3.invoke(class38.field509.field28, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method76(126);
            class11.field143 = class22.method149(class23.field255, class31.field443, class23.field253, (byte) -34);
            this.method82(false);
            class37.field505 = class30.method195(-9259);
            class37.field505.method25(0);
            while (class33.field471 == 0L || class33.field471 > class13.method94(-127)) {
                class36.field489 = class37.field505.method26(class6.field75, class36.field487, (byte) 68);
                for (int var5 = 0; var5 < class36.field489; var5++) {
                    this.method91(-107);
                }
                this.method73(-123);
            }
        } catch (Exception var8) {
            class37.method250(95, var8, null);
            this.method83((byte) 120, "crash");
        }
        this.method77(70);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IIZII)V", line = 323)
    public final void method80(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        try {
            if (class14.field171 != null) {
                class4.field33++;
                if (class4.field33 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                    return;
                }
                this.method83((byte) 75, "alreadyloaded");
                return;
            }
            class23.field255 = arg3;
            class23.field253 = arg1;
            if (arg2) {
                this.init();
            }
            class14.field171 = this;
            class8.field116 = arg0;
            if (class38.field509 == null) {
                class17.field187 = class38.field509 = new class3(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg4, null, 0);
            }
            class38.field509.method15(-123, 1, this);
        } catch (Exception var7) {
            class37.method250(95, var7, null);
            this.method83((byte) -96, "crash");
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 361)
    public final String getParameter(String arg0) {
        if (class6.field79 == null) {
            return class38.field509 == null || class38.field509.field28 == this ? super.getParameter(arg0) : class38.field509.field28.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 376)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(III)V", line = 383)
    public static final void method81(int arg0, int arg1, int arg2) {
        class5.field49 = arg1 & 0x3F;
        class20.field204 = arg2 & 0x3F;
        class26.field396 = (class20.field204 << 6) + class5.field49;
        class21.field216 = arg2 >> 6;
        if (arg0 <= -24) {
            class32.field454 = arg1 >> 6;
            class4.method27((byte) -5);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(BLjava/lang/String;)V", line = 403)
    public final void method83(byte arg0, String arg1) {
        if (this.field154) {
            return;
        }
        this.field154 = true;
        System.out.println("error_game_" + arg1);
        int var3 = 21 / ((-arg0 - 15) / 50);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(BLc;Lr;Lr;)[Lh;", line = 427)
    public static final class15[] method84(byte arg0, class5 arg1, class33 arg2, class33 arg3) {
        if (arg0 <= 43) {
            return (class15[]) null;
        } else {
            int var4 = arg1.method35(false, arg2);
            int var5 = arg1.method31(arg3, var4, -2);
            return method75(var5, var4, arg1, (byte) -128);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;", line = 446)
    public static final Object method85(boolean arg0, byte[] arg1, byte arg2) {
        if (arg1 == null) {
            return null;
        } else if (arg2 <= 46) {
            return (Object) null;
        } else {
            if (arg1.length > 136 && !class20.field208) {
                try {
                    class30 var3 = (class30) Class.forName("oa").getDeclaredConstructor().newInstance();
                    var3.method201((byte) 102, arg1);
                    return var3;
                } catch (Throwable var5) {
                    class20.field208 = true;
                }
            }
            return arg0 ? class32.method207(-112, arg1) : arg1;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IBI)B", line = 490)
    public static final byte method86(int arg0, byte arg1, int arg2) {
        int var3 = arg2 >> 6;
        int var4 = arg0 >> 6;
        if (arg1 != 24) {
            return -105;
        } else if (class24.field262[var4][var3] == null) {
            return 0;
        } else if (class24.field262[var4][var3].field481 == null) {
            return class24.field262[var4][var3].field480;
        } else {
            return class24.field262[var4][var3].field481[(arg0 & 0xFC0) + arg2 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "destroy", descriptor = "()V", line = 512)
    public final void destroy() {
        if (class14.field171 == this && !class5.field62) {
            class33.field471 = class13.method94(-103);
            class35.method240(false, 5000L);
            class17.field187 = null;
            this.method77(70);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)V", line = 528)
    public static void method87(byte arg0) {
        field153 = null;
        field156 = null;
        if (arg0 < 105) {
            method86(82, (byte) 0, 14);
        }
        field161 = null;
        field151 = null;
        field162 = null;
        field155 = null;
        field160 = null;
        field159 = null;
        field158 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 551)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 558)
    public final void focusGained(FocusEvent arg0) {
        class11.field147 = true;
    }

    @OriginalMember(owner = "mapview!fa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 566)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "start", descriptor = "()V", line = 569)
    public final void start() {
        if (class14.field171 == this && !class5.field62) {
            class33.field471 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 578)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 582)
    public final synchronized void paint(Graphics arg0) {
        if (class14.field171 != this || class5.field62) {
            return;
        }
        class11.field147 = true;
        if (class3.field20 != null && class3.field20.startsWith("1.5") && class13.method94(-67) - class30.field429 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class23.field253 && class23.field255 <= var2.height) {
                class33.field463 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 607)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "(I)Z", line = 615)
    public final boolean method90(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 <= 76) {
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
                this.method83((byte) -67, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 649)
    public final URL getDocumentBase() {
        if (class6.field79 == null) {
            return class38.field509 == null || class38.field509.field28 == this ? super.getDocumentBase() : class38.field509.field28.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 674)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "(I)V", line = 701)
    private final void method91(int arg0) {
        long var2 = class13.method94(-73);
        long var4 = class8.field112[class20.field211];
        class8.field112[class20.field211] = var2;
        if (var4 != 0L && var4 < var2) {
        }
        class20.field211 = class20.field211 + 1 & 0x1F;
        int var6 = -122 % ((arg0 + 58) / 43);
        synchronized (this) {
            ;
        }
        this.method89((byte) 35);
    }

    @OriginalMember(owner = "mapview!fa", name = "providesignlink", descriptor = "(Lb;)V", line = 731)
    public static final void providesignlink(class3 arg0) {
        class38.field509 = arg0;
        class17.field187 = arg0;
    }

    @OriginalMember(owner = "mapview!fa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 742)
    public final URL getCodeBase() {
        if (class6.field79 == null) {
            return class38.field509 == null || class38.field509.field28 == this ? super.getCodeBase() : class38.field509.field28.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Z)V")
    public abstract void method74(boolean arg0);

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "(I)V")
    public abstract void method79(int arg0);

    @OriginalMember(owner = "mapview!fa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(Z)V")
    public abstract void method82(boolean arg0);

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(B)V")
    public abstract void method88(byte arg0);

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(B)V")
    public abstract void method89(byte arg0);
}
