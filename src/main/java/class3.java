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
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public abstract class class3 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "Z")
    private boolean field109 = false;

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Lh;")
    public static class15 field108 = class26.method190(true, "Prev page");

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Lh;")
    public static class15 field113 = class26.method190(true, "Overview");

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "Lh;")
    public static class15 field114 = class26.method190(true, "mapfunction");

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "Lh;")
    public static class15 field107 = class26.method190(true, "Magic Shop");

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Lh;")
    public static class15 field105 = class26.method190(true, "Silk Trader");

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Lh;")
    public static class15 field110 = class26.method190(true, "Chainmail Shop");

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Lh;")
    public static class15 field112 = class26.method190(true, "Estate Agent");

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "Lp;")
    public static class30 field115;

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "Ljava/awt/Frame;")
    private static Frame field111;

    @OriginalMember(owner = "mapview!b", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 4)
    public final URL getDocumentBase() {
        if (field111 == null) {
            return class35.field446 == null || class35.field446.field370 == this ? super.getDocumentBase() : class35.field446.field370.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "start", descriptor = "()V", line = 19)
    public final void start() {
        if (class15.field257 == this && !class6.field128) {
            class28.field379 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 30)
    private static final void method46(int arg0, Throwable arg1, String arg2) {
        if (arg0 != 0) {
            return;
        }
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class2.method33(-116, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class20 var8 = class22.field323.method195(new URL(class22.field323.field370.getCodeBase(), "clienterror.ws?c=" + class2.field82 + "&u=" + class19.field295 + "&v1=" + class27.field368 + "&v2=" + class27.field373 + "&e=" + var7), -31561);
            while (var8.field301 == 0) {
                class36.method239(arg0 ^ 0xFFFFFF8B, 1L);
            }
            if (var8.field301 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field298;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(BI)Lh;", line = 76)
    public static final class15 method47(byte arg0, int arg1) {
        if (arg0 != -109) {
            method46(98, null, null);
        }
        return class30.method224(10, false, arg1, -11342);
    }

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "(I)V", line = 89)
    private final void method48(int arg0) {
        if (arg0 != -15064) {
            return;
        }
        long var2 = System.currentTimeMillis();
        long var4 = class11.field206[class31.field422];
        if (var4 != 0L && var2 <= var4) {
        }
        class11.field206[class31.field422] = var2;
        class31.field422 = class31.field422 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method23(-9577);
    }

    @OriginalMember(owner = "mapview!b", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 126)
    public final String getParameter(String arg0) {
        if (field111 == null) {
            return class35.field446 == null || class35.field446.field370 == this ? super.getParameter(arg0) : class35.field446.field370.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lba;", line = 142)
    public static final class4 method49(Throwable arg0, String arg1) {
        class4 var2;
        if (arg0 instanceof class4) {
            var2 = (class4) arg0;
            var2.field121 = var2.field121 + ' ' + arg1;
        } else {
            var2 = new class4(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Z)Z", line = 159)
    public final boolean method50(boolean arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            }
            if (!arg0) {
                this.method23(108);
            }
            this.method51((byte) -112, "invalidhost");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 191)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!b", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 206)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!b", name = "providesignlink", descriptor = "(Lna;)V", line = 221)
    public static final void providesignlink(class27 arg0) {
        class35.field446 = arg0;
        class22.field323 = arg0;
    }

    @OriginalMember(owner = "mapview!b", name = "stop", descriptor = "()V", line = 230)
    public final void stop() {
        if (class15.field257 == this && !class6.field128) {
            class28.field379 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 241)
    public final URL getCodeBase() {
        if (field111 == null) {
            return class35.field446 == null || class35.field446.field370 == this ? super.getCodeBase() : class35.field446.field370.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(BLjava/lang/String;)V", line = 255)
    public final void method51(byte arg0, String arg1) {
        if (this.field109) {
            return;
        }
        this.field109 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
            int var3 = 101 / ((arg0 + 38) / 49);
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "mapview!b", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 274)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "(I)V", line = 283)
    public final synchronized void method52(int arg0) {
        Container var2;
        if (field111 == null) {
            var2 = class35.field446.field370;
        } else {
            var2 = field111;
        }
        if (class31.field430 != null) {
            class31.field430.removeFocusListener(this);
            var2.remove(class31.field430);
        }
        class31.field430 = new class36(this);
        var2.add(class31.field430);
        class31.field430.setSize(class16.field271, class21.field308);
        class31.field430.setVisible(true);
        if (arg0 != 0) {
            return;
        }
        if (field111 == null) {
            class31.field430.setLocation(0, 0);
        } else {
            Insets var3 = field111.getInsets();
            class31.field430.setLocation(var3.left, var3.top);
        }
        class31.field430.addFocusListener(this);
        class31.field430.requestFocus();
        class28.field385 = true;
        class21.field310 = false;
        class35.field449 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "mapview!b", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 322)
    public final void focusGained(FocusEvent arg0) {
        class28.field385 = true;
    }

    @OriginalMember(owner = "mapview!b", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 335)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!b", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 337)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!b", name = "destroy", descriptor = "()V", line = 340)
    public final void destroy() {
        if (class15.field257 == this && !class6.field128) {
            class28.field379 = System.currentTimeMillis();
            class36.method239(-117, 5000L);
            class22.field323 = null;
            this.method54((byte) -121);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 355)
    public final AppletContext getAppletContext() {
        if (field111 == null) {
            return class35.field446 == null || class35.field446.field370 == this ? super.getAppletContext() : class35.field446.field370.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "run", descriptor = "()V", line = 374)
    public final void run() {
        try {
            if (class27.field368 != null) {
                String var1 = class27.field368.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class27.field373;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method51((byte) 48, "wrongjava");
                        return;
                    }
                    class29.field388 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class27.field373 == null || class27.field373.equals("1.4.2"))) {
                    this.method51((byte) 92, "wrongjava");
                    return;
                }
            }
            this.method52(0);
            class36.field457 = class2.method37(class16.field271, (byte) -99, class31.field430, class21.field308);
            this.method9(64);
            class36.field454 = class11.method89(false);
            class36.field454.method25(188);
            while (class28.field379 == 0L || class28.field379 > System.currentTimeMillis()) {
                class9.field148 = class36.field454.method30(class1.field74, (byte) 61, class29.field388);
                for (int var3 = 0; var3 < class9.field148; var3++) {
                    this.method48(-15064);
                }
                this.method53((byte) -116);
            }
        } catch (Exception var5) {
            method46(0, var5, null);
            this.method51((byte) 101, "crash");
        }
        this.method54((byte) -121);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B)V", line = 447)
    private final void method53(byte arg0) {
        long var2 = System.currentTimeMillis();
        long var4 = class14.field244[class31.field416];
        if (var4 != 0L && var2 <= var4) {
        }
        class14.field244[class31.field416] = var2;
        class31.field416 = class31.field416 + 1 & 0x1F;
        if (class17.field282++ > 50) {
            class28.field385 = true;
            class17.field282 -= 50;
            class31.field430.setSize(class16.field271, class21.field308);
            class31.field430.setVisible(true);
            if (field111 == null) {
                class31.field430.setLocation(0, 0);
            } else {
                Insets var6 = field111.getInsets();
                class31.field430.setLocation(var6.left, var6.top);
            }
        }
        this.method16(21583);
        int var7 = -126 / ((-arg0 - 32) / 55);
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(B)V", line = 488)
    private final synchronized void method54(byte arg0) {
        if (class6.field128) {
            return;
        }
        class6.field128 = true;
        try {
            class31.field430.removeFocusListener(this);
        } catch (Exception var9) {
        }
        if (arg0 != -121) {
            return;
        }
        try {
            this.method18(87);
        } catch (Exception var8) {
        }
        if (field111 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class35.field446 != null) {
            try {
                class35.field446.method198(22442);
            } catch (Exception var6) {
            }
        }
        this.method15(arg0 ^ 0x7A5D);
    }

    @OriginalMember(owner = "mapview!b", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 547)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "(I)V", line = 552)
    public static void method55(int arg0) {
        field111 = null;
        field113 = null;
        field105 = null;
        field107 = null;
        field114 = null;
        field112 = null;
        field108 = null;
        if (arg0 != 9) {
            field110 = null;
        }
        field110 = null;
        field115 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 575)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!b", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 579)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B[B)[B", line = 592)
    public static final byte[] method56(byte arg0, byte[] arg1) {
        if (arg0 <= 116) {
            field112 = null;
        }
        class18 var2 = new class18(arg1);
        int var3 = var2.method148((byte) 115);
        int var4 = var2.method156(127);
        if (var4 < 0 || class19.field294 != 0 && var4 > class19.field294) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var9 = new byte[var4];
            var2.method149(0, (byte) -117, var4, var9);
            return var9;
        } else {
            int var5 = var2.method156(127);
            if (var5 < 0 || class19.field294 != 0 && var5 > class19.field294) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class5.method66(var6, var5, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var7.readFully(var6);
                    var7.close();
                } catch (IOException var10) {
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 653)
    public final synchronized void paint(Graphics arg0) {
        if (class15.field257 != this || class6.field128) {
            return;
        }
        class28.field385 = true;
        if (class27.field373 != null && class27.field373.startsWith("1.5") && System.currentTimeMillis() - class35.field449 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class16.field271 && var2.height >= class21.field308) {
                class21.field310 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 678)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IBIII)V", line = 685)
    public final void method57(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            if (class15.field257 != null) {
                this.method51((byte) -113, "alreadyloaded");
                return;
            }
            class21.field308 = arg4;
            class16.field271 = arg2;
            int var6 = 14 % ((54 - arg1) / 59);
            class2.field82 = arg0;
            class15.field257 = this;
            if (class35.field446 == null) {
                class22.field323 = class35.field446 = new class27(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg3, null, 0);
            }
            class35.field446.method202(274507376, 1, this);
        } catch (Exception var8) {
            method46(0, var8, null);
            this.method51((byte) -88, "crash");
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V")
    public abstract void method16(int arg0);

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(I)V")
    public abstract void method9(int arg0);

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "(I)V")
    public abstract void method15(int arg0);

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "(I)V")
    public abstract void method18(int arg0);

    @OriginalMember(owner = "mapview!b", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "(I)V")
    public abstract void method23(int arg0);
}
