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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public abstract class class10 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "Z")
    private boolean field135 = false;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Lh;")
    public static class15 field131 = class18.method153("Altar", 1);

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Lh;")
    public static class15 field133 = class18.method153("Magic Shop", 1);

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Lh;")
    public static class15 field132 = class18.method153("Pub)4Bar", 1);

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Lh;")
    public static class15 field134 = class18.method153("50(U", 1);

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "[I")
    public static int[] field136;

    @OriginalMember(owner = "mapview!ea", name = "destroy", descriptor = "()V", line = 6)
    public final void destroy() {
        if (class36.field450 == this && !class12.field183) {
            class31.field397 = System.currentTimeMillis();
            class5.method49(5000L, -100);
            class36.field454 = null;
            this.method88(120);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "run", descriptor = "()V", line = 21)
    public final void run() {
        try {
            if (class4.field67 != null) {
                String var1 = class4.field67.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class4.field76;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method86("wrongjava", -12383);
                        return;
                    }
                    class31.field399 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class4.field76 == null || class4.field76.equals("1.4.2"))) {
                    this.method86("wrongjava", -12383);
                    return;
                }
            }
            this.method89(4000);
            class36.field455 = class24.method186(0, class16.field236, class25.field340, class19.field268);
            this.method21((byte) 79);
            class25.field336 = class18.method156((byte) 9);
            class25.field336.method50(5);
            while (class31.field397 == 0L || System.currentTimeMillis() < class31.field397) {
                class9.field126 = class25.field336.method48(class31.field399, class5.field92, (byte) -104);
                for (int var3 = 0; var3 < class9.field126; var3++) {
                    this.method90(1);
                }
                this.method91(9044);
            }
        } catch (Exception var5) {
            class15.method140(null, var5, (byte) 69);
            this.method86("crash", -12383);
        }
        this.method88(-102);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IBIII)V", line = 88)
    public final void method83(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            if (class36.field450 != null) {
                this.method86("alreadyloaded", -12383);
                return;
            }
            class24.field325 = arg2;
            class19.field268 = arg3;
            class36.field450 = this;
            class16.field236 = arg4;
            if (class19.field266 == null) {
                class36.field454 = class19.field266 = new class4(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
            }
            class19.field266.method47(this, -116, 1);
            int var6 = 46 % ((53 - arg1) / 38);
        } catch (Exception var8) {
            class15.method140(null, var8, (byte) 101);
            this.method86("crash", -12383);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)Z", line = 118)
    public final boolean method84(int arg0) {
        if (arg0 != 9) {
            field132 = null;
        }
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
            } else {
                this.method86("invalidhost", -12383);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 147)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 164)
    public static final String method85(Throwable arg0, int arg1) throws IOException {
        String var3;
        if (arg0 instanceof class30) {
            class30 var2 = (class30) arg0;
            arg0 = var2.field393;
            var3 = var2.field390 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 < 111) {
            field134 = null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "stop", descriptor = "()V", line = 235)
    public final void stop() {
        if (class36.field450 == this && !class12.field183) {
            class31.field397 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 252)
    public final AppletContext getAppletContext() {
        if (class16.field244 == null) {
            return class19.field266 == null || class19.field266.field68 == this ? super.getAppletContext() : class19.field266.field68.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 265)
    public final void method86(String arg0, int arg1) {
        if (this.field135) {
            return;
        }
        this.field135 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
        if (arg1 != -12383) {
            this.method83(3, (byte) -106, -19, -111, -126);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 287)
    public final synchronized void paint(Graphics arg0) {
        if (class36.field450 != this || class12.field183) {
            return;
        }
        class30.field389 = true;
        if (class4.field76 != null && class4.field76.startsWith("1.5") && System.currentTimeMillis() - class20.field280 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class16.field236 <= var2.width && var2.height >= class19.field268) {
                class36.field453 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 313)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "(I)V", line = 320)
    public static void method87(int arg0) {
        field132 = null;
        field134 = null;
        if (arg0 != 5) {
            providesignlink(null);
        }
        field136 = null;
        field133 = null;
        field131 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 341)
    public final URL getDocumentBase() {
        if (class16.field244 == null) {
            return class19.field266 == null || class19.field266.field68 == this ? super.getDocumentBase() : class19.field266.field68.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 358)
    public final URL getCodeBase() {
        if (class16.field244 == null) {
            return class19.field266 == null || class19.field266.field68 == this ? super.getCodeBase() : class19.field266.field68.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "(I)V", line = 373)
    private final synchronized void method88(int arg0) {
        if (class12.field183) {
            return;
        }
        class12.field183 = true;
        int var2 = -91 / ((arg0 - 59) / 51);
        try {
            class25.field340.removeFocusListener(this);
        } catch (Exception var10) {
        }
        try {
            this.method7(188);
        } catch (Exception var9) {
        }
        if (class16.field244 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        if (class19.field266 != null) {
            try {
                class19.field266.method46(16530);
            } catch (Exception var7) {
            }
        }
        this.method4(-10021);
    }

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "(I)V", line = 420)
    public final synchronized void method89(int arg0) {
        Container var2;
        if (class16.field244 == null) {
            var2 = class19.field266.field68;
        } else {
            var2 = class16.field244;
        }
        if (class25.field340 != null) {
            class25.field340.removeFocusListener(this);
            var2.remove(class25.field340);
        }
        class25.field340 = new class21(this);
        var2.add(class25.field340);
        class25.field340.setSize(class16.field236, class19.field268);
        class25.field340.setVisible(true);
        if (class16.field244 == null) {
            class25.field340.setLocation(0, 0);
        } else {
            Insets var3 = class16.field244.getInsets();
            class25.field340.setLocation(var3.left, var3.top);
        }
        class25.field340.addFocusListener(this);
        class25.field340.requestFocus();
        if (arg0 == 4000) {
            class30.field389 = true;
            class36.field453 = false;
            class20.field280 = System.currentTimeMillis();
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 472)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "(I)V", line = 477)
    private final void method90(int arg0) {
        long var2 = System.currentTimeMillis();
        long var4 = class15.field221[mapview.field59];
        if (var4 != 0L && var4 >= var2) {
        }
        class15.field221[mapview.field59] = var2;
        mapview.field59 = mapview.field59 + arg0 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method27(46);
    }

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "(I)V", line = 507)
    private final void method91(int arg0) {
        long var2 = class32.field418[class31.field394];
        long var4 = System.currentTimeMillis();
        class32.field418[class31.field394] = var4;
        class31.field394 = class31.field394 + 1 & 0x1F;
        if (var2 != 0L && var4 <= var2) {
        }
        if (arg0 != 9044) {
            this.getAppletContext();
        }
        if (class14.field214++ > 50) {
            class30.field389 = true;
            class14.field214 -= 50;
            class25.field340.setSize(class16.field236, class19.field268);
            class25.field340.setVisible(true);
            if (class16.field244 == null) {
                class25.field340.setLocation(0, 0);
            } else {
                Insets var6 = class16.field244.getInsets();
                class25.field340.setLocation(var6.left, var6.top);
            }
        }
        this.method16(arg0 ^ 0x2276);
    }

    @OriginalMember(owner = "mapview!ea", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 550)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ea", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 556)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ea", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 560)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ea", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 568)
    public final void focusGained(FocusEvent arg0) {
        class30.field389 = true;
    }

    @OriginalMember(owner = "mapview!ea", name = "start", descriptor = "()V", line = 575)
    public final void start() {
        if (class36.field450 == this && !class12.field183) {
            class31.field397 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "providesignlink", descriptor = "(Lba;)V", line = 590)
    public static final void providesignlink(class4 arg0) {
        class19.field266 = arg0;
        class36.field454 = arg0;
    }

    @OriginalMember(owner = "mapview!ea", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 600)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ea", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 607)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ea", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 610)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ea", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 613)
    public final String getParameter(String arg0) {
        if (class16.field244 == null) {
            return class19.field266 == null || class19.field266.field68 == this ? super.getParameter(arg0) : class19.field266.field68.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(I)V")
    public abstract void method7(int arg0);

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(I)V")
    public abstract void method27(int arg0);

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)V")
    public abstract void method21(byte arg0);

    @OriginalMember(owner = "mapview!ea", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "(I)V")
    public abstract void method16(int arg0);

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "(I)V")
    public abstract void method4(int arg0);
}
