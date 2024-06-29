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

@OriginalClass("mapview!ma")
public abstract class class24 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Z")
    private boolean field252 = false;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Lna;")
    public static class26 field253 = class33.method219("underlay)3dat", 79);

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lna;")
    public static class26 field256 = class33.method219("Overview", 117);

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "Z")
    public static boolean field257 = true;

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "I")
    private static int field254;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "J")
    public static long field258;

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "Laa;")
    public static class1 field255;

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "Z")
    public static boolean field259;

    @OriginalMember(owner = "mapview!ma", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 5)
    public final URL getCodeBase() {
        if (class29.field433 == null) {
            return class40.field531 == null || class40.field531.field142 == this ? super.getCodeBase() : class40.field531.field142.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "destroy", descriptor = "()V", line = 20)
    public final void destroy() {
        if (class12.field121 == this && !class39.field512) {
            class5.field58 = class10.method50(false);
            class34.method228(5000L, true);
            class38.field507 = null;
            this.method137((byte) -37);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 34)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)Z", line = 38)
    public final boolean method129(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 != 4000) {
            field258 = 49L;
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
                this.method136("invalidhost", 0);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 77)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(B)V", line = 83)
    private final void method130(byte arg0) {
        long var2 = class10.method50(false);
        long var4 = class20.field218[class5.field52];
        class20.field218[class5.field52] = var2;
        if (arg0 != 97) {
            field258 = 27L;
        }
        if (var4 != 0L && var2 <= var4) {
        }
        class5.field52 = class5.field52 + 1 & 0x1F;
        if (class1.field4++ > 50) {
            class27.field411 = true;
            class1.field4 -= 50;
            class32.field467.setSize(class6.field63, class5.field55);
            class32.field467.setVisible(true);
            if (class29.field433 == null) {
                class32.field467.setLocation(0, 0);
            } else {
                Insets var6 = class29.field433.getInsets();
                class32.field467.setLocation(var6.left, var6.top);
            }
        }
        this.method132(1);
    }

    @OriginalMember(owner = "mapview!ma", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 125)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "(B)V", line = 138)
    public final synchronized void method131(byte arg0) {
        Container var2;
        if (class29.field433 == null) {
            var2 = class40.field531.field142;
        } else {
            var2 = class29.field433;
        }
        if (class32.field467 != null) {
            class32.field467.removeFocusListener(this);
            var2.remove(class32.field467);
        }
        class32.field467 = new class28(this);
        var2.add(class32.field467);
        if (arg0 > -124) {
            this.focusGained(null);
        }
        class32.field467.setSize(class6.field63, class5.field55);
        class32.field467.setVisible(true);
        if (class29.field433 == null) {
            class32.field467.setLocation(0, 0);
        } else {
            Insets var3 = class29.field433.getInsets();
            class32.field467.setLocation(var3.left, var3.top);
        }
        class32.field467.addFocusListener(this);
        class32.field467.requestFocus();
        class27.field411 = true;
        class30.field457 = false;
        class10.field101 = class10.method50(false);
    }

    @OriginalMember(owner = "mapview!ma", name = "providesignlink", descriptor = "(Lh;)V", line = 178)
    public static final void providesignlink(class14 arg0) {
        class40.field531 = arg0;
        class38.field507 = arg0;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IZIII)V", line = 188)
    public final void method133(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        try {
            if (class12.field121 != null) {
                class3.field33++;
                if (class3.field33 >= 3) {
                    this.method136("alreadyloaded", 0);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class6.field63 = arg2;
            class12.field121 = this;
            class5.field55 = arg4;
            class12.field115 = arg0;
            if (class40.field531 == null) {
                class38.field507 = class40.field531 = new class14(false, this, arg3, null, 0);
            }
            if (!arg1) {
                this.start();
            }
            class40.field531.method81((byte) 115, 1, this);
        } catch (Exception var7) {
            class10.method49(var7, null, -87);
            this.method136("crash", 0);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "start", descriptor = "()V", line = 226)
    public final void start() {
        if (class12.field121 == this && !class39.field512) {
            class5.field58 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "stop", descriptor = "()V", line = 249)
    public final void stop() {
        if (class12.field121 == this && !class39.field512) {
            class5.field58 = class10.method50(false) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 260)
    public final synchronized void paint(Graphics arg0) {
        if (class12.field121 != this || class39.field512) {
            return;
        }
        class27.field411 = true;
        if (class14.field138 != null && class14.field138.startsWith("1.5") && class10.method50(false) - class10.field101 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class6.field63 && var2.height >= class5.field55) {
                class30.field457 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 290)
    public final URL getDocumentBase() {
        if (class29.field433 == null) {
            return class40.field531 == null || class40.field531.field142 == this ? super.getDocumentBase() : class40.field531.field142.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "(I)V", line = 304)
    public static final void method135(int arg0) {
        int var1 = -31 / ((24 - arg0) / 37);
        if (++class12.field119 >= 64) {
            class5.field53++;
            class12.field119 = 0;
            if (class39.field519 >> 6 > class5.field53) {
                class34.method226((byte) -76);
            }
        }
        class6.field65 = (class12.field119 << 6) + class3.field28;
    }

    @OriginalMember(owner = "mapview!ma", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 327)
    public final AppletContext getAppletContext() {
        if (class29.field433 == null) {
            return class40.field531 == null || class40.field531.field142 == this ? super.getAppletContext() : class40.field531.field142.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 340)
    public final void method136(String arg0, int arg1) {
        if (this.field252) {
            return;
        }
        this.field252 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != 0) {
                field253 = null;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 359)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 362)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 365)
    public final String getParameter(String arg0) {
        if (class29.field433 == null) {
            return class40.field531 == null || class40.field531.field142 == this ? super.getParameter(arg0) : class40.field531.field142.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 378)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "(B)V", line = 385)
    private final synchronized void method137(byte arg0) {
        if (class39.field512) {
            return;
        }
        class39.field512 = true;
        try {
            class32.field467.removeFocusListener(this);
        } catch (Exception var10) {
        }
        try {
            int var3 = 122 % ((51 - arg0) / 57);
            this.method140((byte) 67);
        } catch (Exception var9) {
        }
        if (class29.field433 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        if (class40.field531 != null) {
            try {
                class40.field531.method83(7555);
            } catch (Exception var7) {
            }
        }
        this.method134(6563);
    }

    @OriginalMember(owner = "mapview!ma", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 435)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 438)
    public final void focusGained(FocusEvent arg0) {
        class27.field411 = true;
    }

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "(I)V", line = 449)
    public static void method138(int arg0) {
        field256 = null;
        field255 = null;
        if (arg0 != 0) {
            method135(-95);
        }
        field253 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 463)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "run", descriptor = "()V", line = 469)
    public final void run() {
        try {
            if (class14.field141 != null) {
                String var1 = class14.field141.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class14.field138;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method136("wrongjava", 0);
                        return;
                    }
                    class22.field234 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class14.field138 == null || class14.field138.equals("1.4.2"))) {
                    this.method136("wrongjava", 0);
                    return;
                }
            }
            if (class40.field531.field142 != null) {
                Method var3 = class14.field136;
                if (var3 != null) {
                    try {
                        var3.invoke(class40.field531.field142, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method131((byte) -128);
            class21.field223 = class8.method39(class32.field467, class5.field55, class6.field63, 2);
            this.method127((byte) -121);
            class39.field516 = class2.method6(false);
            while (class5.field58 == 0L || class5.field58 > class10.method50(false)) {
                field254 = class39.field516.method193(0, class22.field234, class11.field108);
                for (int var5 = 0; var5 < field254; var5++) {
                    this.method139(127);
                }
                this.method130((byte) 97);
                class10.method51(class40.field531, class32.field467, -70);
            }
        } catch (Exception var8) {
            class10.method49(var8, null, 80);
            this.method136("crash", 0);
        }
        this.method137((byte) 122);
    }

    @OriginalMember(owner = "mapview!ma", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 548)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "(I)V", line = 552)
    private final void method139(int arg0) {
        if (arg0 < 50) {
            field257 = true;
        }
        long var2 = class10.method50(false);
        long var4 = class18.field173[class38.field511];
        if (var4 != 0L && var2 > var4) {
        }
        class18.field173[class38.field511] = var2;
        class38.field511 = class38.field511 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method128(-119);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)V")
    public abstract void method127(byte arg0);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V")
    public abstract void method128(int arg0);

    @OriginalMember(owner = "mapview!ma", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "(I)V")
    public abstract void method132(int arg0);

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "(I)V")
    public abstract void method134(int arg0);

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "(B)V")
    public abstract void method140(byte arg0);
}
