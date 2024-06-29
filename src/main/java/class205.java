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

@OriginalClass("client!w")
public abstract class class205 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Z")
    private boolean field4067 = false;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4071 = 2;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4077 = -1;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Ldd;")
    public static class35 field4088 = class180.method1196((byte) -73, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Ldd;")
    public static class35 field4086 = class180.method1196((byte) -10, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field4098 = -1;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "Le;")
    public static class41 field4102;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Z")
    public static boolean field4106;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[Lba;")
    public static class12[] field4076;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[Lbg;")
    public static class18[] field4074;

    @OriginalMember(owner = "client!w", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4069++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Z")
    public final boolean method1354(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field4090++;
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
                this.method1356("invalidhost", (byte) -109);
                int var3 = 14 % ((arg0 - 68) / 57);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4091++;
        if (class109.field2415 == null) {
            return class182.field3734 == null || class182.field3734.field907 == this ? super.getAppletContext() : class182.field3734.field907.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "run", descriptor = "()V")
    public final void run() {
        field4081++;
        try {
            if (class41.field899 != null) {
                String var1 = class41.field899.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class41.field905;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1356("wrongjava", (byte) 112);
                        return;
                    }
                    class209.field4149 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class41.field905 == null || class41.field905.equals("1.4.2"))) {
                    this.method1356("wrongjava", (byte) 72);
                    return;
                }
            }
            if (class182.field3734.field907 != null) {
                Method var3 = class41.field910;
                if (var3 != null) {
                    try {
                        var3.invoke(class182.field3734.field907, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1363(-14307);
            class97.field2141 = class160.method1063(class197.field3938, class55.field1334, (byte) 127, class118.field2618);
            this.method278(-6);
            class208.field4130 = class61.method518((byte) -123);
            while (class95.field2087 == 0L || class95.field2087 > class190.method1253((byte) 18)) {
                class78.field1814 = class208.field4130.method1018(class173.field3469, (byte) -67, class209.field4149);
                for (int var4 = 0; var4 < class78.field1814; var4++) {
                    this.method1364(-6170);
                }
                this.method1360(82);
                class51.method453(class182.field3734, class118.field2618, (byte) -118);
            }
        } catch (Exception var7) {
            class173.method1145((byte) -65, null, var7);
            this.method1356("crash", (byte) -86);
        }
        this.method1361(-127);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZII)V")
    public final void method1355(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4099++;
        try {
            if (class36.field795 == null) {
                class55.field1334 = arg3;
                class5.field91 = arg0;
                class197.field3938 = arg1;
                class36.field795 = this;
                if (class182.field3734 == null) {
                    field4102 = class182.field3734 = new class41(false, this, arg4, null, 0);
                }
                class182.field3734.method387(this, false, 1);
                if (!arg2) {
                    field4071 = 76;
                }
            } else {
                class74.field1760++;
                if (class74.field1760 >= 3) {
                    this.method1356("alreadyloaded", (byte) 78);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class173.method1145((byte) -65, null, var7);
            this.method1356("crash", (byte) -125);
        }
    }

    @OriginalMember(owner = "client!w", name = "stop", descriptor = "()V")
    public final void stop() {
        field4092++;
        if (class36.field795 == this && !class161.field3282) {
            class95.field2087 = class190.method1253((byte) 18) + 4000L;
        }
    }

    @OriginalMember(owner = "client!w", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4082++;
    }

    @OriginalMember(owner = "client!w", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1356(String arg0, byte arg1) {
        field4094++;
        if (this.field4067) {
            return;
        }
        this.field4067 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var4) {
        }
        int var3 = 29 / ((-arg1 - 10) / 62);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
    public static final int method1357(byte arg0) {
        if (arg0 != 91) {
            method1359((byte) 67);
        }
        field4078++;
        return class53.field1202++;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public abstract void method280(int arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lgi;B)V")
    public static final void method1358(class69 arg0, byte arg1) {
        field4097++;
        if (class89.field1988 == arg0.field1634 || arg0.field1610 == -1 || arg0.field1647 != 0 || arg0.field1608 + 1 > class160.method1070((byte) -37, arg0.field1610).field1159[arg0.field1654]) {
            int var2 = arg0.field1634 - arg0.field1650;
            int var3 = class89.field1988 - arg0.field1650;
            int var4 = arg0.field1662 * 128 + arg0.field1644 * 64;
            int var5 = arg0.field1657 * 128 + arg0.field1644 * 64;
            int var6 = arg0.field1644 * 64 + arg0.field1639 * 128;
            int var7 = arg0.field1644 * 64 + arg0.field1604 * 128;
            arg0.field1664 = ((var2 - var3) * var4 + var3 * var7) / var2;
            arg0.field1676 = ((var2 - var3) * var5 + var3 * var6) / var2;
        }
        if (arg0.field1669 == 0) {
            arg0.field1613 = 1024;
        }
        if (arg0.field1669 == 1) {
            arg0.field1613 = 1536;
        }
        arg0.field1617 = 0;
        if (arg0.field1669 == 2) {
            arg0.field1613 = 0;
        }
        if (arg0.field1669 == 3) {
            arg0.field1613 = 512;
        }
        if (arg1 < 106) {
            method1359((byte) 77);
        }
        arg0.field1618 = arg0.field1613;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
    public static void method1359(byte arg0) {
        field4074 = null;
        if (arg0 <= 85) {
            providesignlink(null);
        }
        field4102 = null;
        field4086 = null;
        field4088 = null;
        field4076 = null;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    private final void method1360(int arg0) {
        field4080++;
        if (arg0 <= 52) {
            this.method280(-105);
        }
        long var2 = class190.method1253((byte) 18);
        long var4 = class24.field464[class190.field3831];
        class24.field464[class190.field3831] = var2;
        class190.field3831 = class190.field3831 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class69.field1675 = ((var6 >> 1) + 32000) / var6;
        }
        if (class35.field761++ > 50) {
            class17.field335 = true;
            class35.field761 -= 50;
            class118.field2618.setSize(class55.field1334, class197.field3938);
            class118.field2618.setVisible(true);
            if (class109.field2415 == null) {
                class118.field2618.setLocation(0, 0);
            } else {
                Insets var7 = class109.field2415.getInsets();
                class118.field2618.setLocation(var7.left, var7.top);
            }
        }
        this.method284((byte) -78);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public abstract void method287(int arg0);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    private final synchronized void method1361(int arg0) {
        int var2 = 89 % ((-arg0 - 25) / 38);
        field4085++;
        if (class161.field3282) {
            return;
        }
        class161.field3282 = true;
        try {
            class118.field2618.removeFocusListener(this);
        } catch (Exception var6) {
        }
        try {
            this.method279(0);
        } catch (Exception var5) {
        }
        if (class109.field2415 != null) {
            try {
                System.exit(0);
            } catch (Throwable var4) {
            }
        }
        if (class182.field3734 != null) {
            try {
                class182.field3734.method392((byte) -81);
            } catch (Exception var3) {
            }
        }
        this.method280(5);
    }

    @OriginalMember(owner = "client!w", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4089++;
    }

    @OriginalMember(owner = "client!w", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field4105++;
        this.destroy();
    }

    @OriginalMember(owner = "client!w", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4093++;
        if (class109.field2415 == null) {
            return class182.field3734 == null || class182.field3734.field907 == this ? super.getDocumentBase() : class182.field3734.field907.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
    public abstract void method284(byte arg0);

    @OriginalMember(owner = "client!w", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4068++;
    }

    @OriginalMember(owner = "client!w", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4100++;
        if (class109.field2415 == null) {
            return class182.field3734 == null || class182.field3734.field907 == this ? super.getParameter(arg0) : class182.field3734.field907.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "providesignlink", descriptor = "(Le;)V")
    public static final void providesignlink(class41 arg0) {
        field4087++;
        class182.field3734 = arg0;
        field4102 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public abstract void method279(int arg0);

    @OriginalMember(owner = "client!w", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4084++;
        if (class36.field795 == this && !class161.field3282) {
            class95.field2087 = class190.method1253((byte) 18);
            class204.method1347(5000L, false);
            field4102 = null;
            this.method1361(-118);
        }
    }

    @OriginalMember(owner = "client!w", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4072++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!w", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class152.field3153 = false;
        field4101++;
    }

    @OriginalMember(owner = "client!w", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4104++;
        if (class109.field2415 == null) {
            return class182.field3734 == null || class182.field3734.field907 == this ? super.getCodeBase() : class182.field3734.field907.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4083++;
        if (class36.field795 != this || class161.field3282) {
            return;
        }
        class17.field335 = true;
        if (class41.field905 != null && class41.field905.startsWith("1.5") && class190.method1253((byte) 18) - class67.field1583 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class55.field1334 && var2.height >= class197.field3938) {
                class29.field591 = true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4070++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1362(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field4079++;
        try {
            class55.field1334 = arg0;
            if (arg6 != -15145) {
                this.method1355(-97, -124, true, -71, -46);
            }
            class36.field795 = this;
            class197.field3938 = arg2;
            class5.field91 = arg5;
            class109.field2415 = new Frame();
            class109.field2415.setTitle("Jagex");
            class109.field2415.setResizable(false);
            class109.field2415.addWindowListener(this);
            class109.field2415.setVisible(true);
            class109.field2415.toFront();
            Insets var8 = class109.field2415.getInsets();
            class109.field2415.setSize(arg0 + var8.right + var8.left, var8.bottom + arg2 + var8.top);
            field4102 = class182.field3734 = new class41(true, null, arg4, arg3, arg1);
            class182.field3734.method387(this, false, 1);
        } catch (Exception var10) {
            class173.method1145((byte) -65, null, var10);
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
    public final synchronized void method1363(int arg0) {
        field4095++;
        Container var2;
        if (class109.field2415 == null) {
            var2 = class182.field3734.field907;
        } else {
            var2 = class109.field2415;
        }
        if (class118.field2618 != null) {
            class118.field2618.removeFocusListener(this);
            var2.remove(class118.field2618);
        }
        class118.field2618 = new class146(this);
        var2.add(class118.field2618);
        class118.field2618.setSize(class55.field1334, class197.field3938);
        class118.field2618.setVisible(true);
        if (class109.field2415 == null) {
            class118.field2618.setLocation(0, 0);
        } else {
            Insets var3 = class109.field2415.getInsets();
            class118.field2618.setLocation(var3.left, var3.top);
        }
        class118.field2618.addFocusListener(this);
        class118.field2618.requestFocus();
        class17.field335 = true;
        class29.field591 = false;
        class67.field1583 = class190.method1253((byte) 18);
        if (arg0 != -14307) {
            field4088 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
    public abstract void method278(int arg0);

    @OriginalMember(owner = "client!w", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4103++;
    }

    @OriginalMember(owner = "client!w", name = "start", descriptor = "()V")
    public final void start() {
        field4075++;
        if (class36.field795 == this && !class161.field3282) {
            class95.field2087 = 0L;
        }
    }

    @OriginalMember(owner = "client!w", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4096++;
        class152.field3153 = true;
        class17.field335 = true;
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "(I)V")
    private final void method1364(int arg0) {
        field4073++;
        long var2 = class190.method1253((byte) 18);
        long var4 = class154.field3172[class127.field2761];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class154.field3172[class127.field2761] = var2;
        if (arg0 != -6170) {
            field4074 = null;
        }
        class127.field2761 = class127.field2761 + 1 & 0x1F;
        synchronized (this) {
            class48.field1056 = class152.field3153;
        }
        this.method287(-73);
    }
}
