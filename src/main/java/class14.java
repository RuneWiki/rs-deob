import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public abstract class class14 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Z")
    private boolean field137 = false;

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Ll;")
    public static class21 field135 = class28.method185(-20839, "Requesting map");

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "I")
    public static int field138 = 0;

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Ll;")
    public static class21 field136 = class28.method185(-20839, "mapfunction");

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "Ll;")
    public static class21 field140 = class28.method185(-20839, "Shield Shop");

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "Ll;")
    public static class21 field139 = class28.method185(-20839, "Vegetable Store");

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Ll;")
    public static class21 field134 = class28.method185(-20839, "floorcol)3dat");

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "Ll;")
    public static class21 field141 = class28.method185(-20839, "Platebody Shop");

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "Ll;")
    public static class21 field142 = class28.method185(-20839, "Pub)4Bar");

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field133;

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "Z")
    public static boolean field143;

    @OriginalMember(owner = "mapview!ha", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 3)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(B)V", line = 17)
    private final void method43(byte arg0) {
        long var2 = System.currentTimeMillis();
        long var4 = class27.field326[class34.field391];
        if (arg0 <= 98) {
            return;
        }
        class27.field326[class34.field391] = var2;
        class34.field391 = class34.field391 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
        }
        if (class20.field179++ > 50) {
            class31.field364 = true;
            class20.field179 -= 50;
            class27.field324.setSize(mapview.field260, class27.field321);
            class27.field324.setVisible(true);
            if (class4.field26 == null) {
                class27.field324.setLocation(0, 0);
            } else {
                Insets var6 = class4.field26.getInsets();
                class27.field324.setLocation(var6.left, var6.top);
            }
        }
        this.method53(2);
    }

    @OriginalMember(owner = "mapview!ha", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 57)
    public final AppletContext getAppletContext() {
        if (class4.field26 == null) {
            return class21.field211 == null || class21.field211.field375 == this ? super.getAppletContext() : class21.field211.field375.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 75)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 80)
    public final URL getDocumentBase() {
        if (class4.field26 == null) {
            return class21.field211 == null || class21.field211.field375 == this ? super.getDocumentBase() : class21.field211.field375.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 97)
    public final synchronized void paint(Graphics arg0) {
        if (class21.field201 != this || class21.field199) {
            return;
        }
        class31.field364 = true;
        if (class32.field382 == null || !class32.field382.startsWith("1.5") || System.currentTimeMillis() - class30.field351 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        if (var2 == null) {
            System.out.println("Rect: null");
        } else {
            System.out.println("Rect: " + var2.x + "," + var2.y + "," + var2.width + "," + var2.height);
        }
        if (var2 == null || mapview.field260 <= var2.width && class27.field321 <= var2.height) {
            class27.field322 = true;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 127)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 130)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "(B)V", line = 135)
    private final void method45(byte arg0) {
        long var2 = System.currentTimeMillis();
        long var4 = class26.field313[class4.field34];
        if (arg0 != -25) {
            field140 = null;
        }
        class26.field313[class4.field34] = var2;
        if (var4 != 0L && var2 > var4) {
        }
        class4.field34 = class4.field34 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method56((byte) 119);
    }

    @OriginalMember(owner = "mapview!ha", name = "stop", descriptor = "()V", line = 163)
    public final void stop() {
        if (class21.field201 == this && !class21.field199) {
            class6.field47 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 177)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Z)V", line = 180)
    public static void method46(boolean arg0) {
        field136 = null;
        field134 = null;
        field140 = null;
        field133 = null;
        field142 = null;
        field135 = null;
        field141 = null;
        if (!arg0) {
            field141 = null;
        }
        field139 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(I)Z", line = 199)
    public final boolean method47(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        int var3 = 56 / ((-arg0 - 26) / 60);
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
                this.method57("invalidhost", -117);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 228)
    public final String getParameter(String arg0) {
        if (class4.field26 == null) {
            return class21.field211 == null || class21.field211.field375 == this ? super.getParameter(arg0) : class21.field211.field375.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "(I)[Lk;", line = 244)
    public static final class19[] method48(int arg0) {
        class19[] var1 = new class19[class21.field203];
        int var2 = 124 % ((arg0 - 9) / 60);
        for (int var3 = 0; var3 < class21.field203; var3++) {
            class19 var4 = var1[var3] = new class19();
            var4.field170 = class30.field357;
            var4.field166 = class6.field48;
            var4.field167 = class30.field355[var3];
            var4.field169 = class29.field344[var3];
            var4.field171 = class2.field12[var3];
            var4.field165 = class18.field161[var3];
            var4.field168 = class34.field389;
            var4.field164 = class31.field359[var3];
        }
        class29.method188(true);
        return var1;
    }

    @OriginalMember(owner = "mapview!ha", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 272)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 285)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(ILjava/lang/String;)Ll;", line = 295)
    public static final class21 method49(int arg0, String arg1) {
        if (arg0 >= -68) {
            method54(-84, 90);
        }
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class21 var4 = new class21();
        var4.field204 = 0;
        var4.field197 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field204++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ha", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 328)
    public final URL getCodeBase() {
        if (class4.field26 == null) {
            return class21.field211 == null || class21.field211.field375 == this ? super.getCodeBase() : class21.field211.field375.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 351)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "(I)V", line = 361)
    private final synchronized void method51(int arg0) {
        if (class21.field199) {
            return;
        }
        class21.field199 = true;
        try {
            class27.field324.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method50(-5758);
        } catch (Exception var8) {
        }
        if (class4.field26 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (arg0 != 2429) {
            return;
        }
        if (class21.field211 != null) {
            try {
                class21.field211.method203(32);
            } catch (Exception var6) {
            }
        }
        this.method44(-1);
    }

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "(I)V", line = 418)
    public final synchronized void method52(int arg0) {
        System.out.println("addcanvas");
        Container var2;
        if (class4.field26 == null) {
            var2 = class21.field211.field375;
        } else {
            var2 = class4.field26;
        }
        if (class27.field324 != null) {
            class27.field324.removeFocusListener(this);
            var2.remove(class27.field324);
        }
        if (arg0 > -46) {
            this.field137 = false;
        }
        class27.field324 = new class3(this);
        var2.add(class27.field324);
        class27.field324.setSize(mapview.field260, class27.field321);
        class27.field324.setVisible(true);
        if (class4.field26 == null) {
            class27.field324.setLocation(0, 0);
        } else {
            Insets var3 = class4.field26.getInsets();
            class27.field324.setLocation(var3.left, var3.top);
        }
        class27.field324.addFocusListener(this);
        class27.field324.requestFocus();
        class31.field364 = true;
        class27.field322 = false;
        class30.field351 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "mapview!ha", name = "start", descriptor = "()V", line = 464)
    public final void start() {
        if (class21.field201 == this && !class21.field199) {
            class6.field47 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(II)Ll;", line = 478)
    public static final class21 method54(int arg0, int arg1) {
        if (arg0 != 10) {
            method49(57, null);
        }
        return class10.method27(arg1, 10, (byte) -94, false);
    }

    @OriginalMember(owner = "mapview!ha", name = "providesignlink", descriptor = "(Lu;)V", line = 488)
    public static final void providesignlink(class32 arg0) {
        class21.field211 = arg0;
        class31.field363 = arg0;
    }

    @OriginalMember(owner = "mapview!ha", name = "destroy", descriptor = "()V", line = 499)
    public final void destroy() {
        if (class21.field201 == this && !class21.field199) {
            class6.field47 = System.currentTimeMillis();
            class2.method4(5000L, 106);
            class31.field363 = null;
            this.method51(2429);
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 521)
    public final void focusGained(FocusEvent arg0) {
        class31.field364 = true;
    }

    @OriginalMember(owner = "mapview!ha", name = "run", descriptor = "()V", line = 537)
    public final void run() {
        try {
            if (class32.field380 != null) {
                String var1 = class32.field380.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class32.field382;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method57("wrongjava", -104);
                        return;
                    }
                    class28.field335 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class32.field382 == null || class32.field382.equals("1.4.2"))) {
                    this.method57("wrongjava", -120);
                    return;
                }
            }
            this.method52(-128);
            class10.drawArea = class18.method80(class27.field324, class27.field321, 0, mapview.field260);
            this.method42((byte) 70);
            class11.field85 = class5.method14((byte) 77);
            class11.field85.method32(124);
            while (class6.field47 == 0L || System.currentTimeMillis() < class6.field47) {
                class3.field20 = class11.field85.method30(class28.field335, -3566, class28.field331);
                for (int var3 = 0; var3 < class3.field20; var3++) {
                    this.method45((byte) -25);
                }
                this.method43((byte) 120);
            }
        } catch (Exception var5) {
            class17.method77(null, var5, (byte) 78);
            this.method57("crash", -122);
        }
        this.method51(2429);
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIIB)V", line = 601)
    public final void method55(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            if (class21.field201 != null) {
                this.method57("alreadyloaded", arg4 - 165);
                return;
            }
            mapview.field260 = arg3;
            class21.field201 = this;
            class27.field321 = arg1;
            class20.field185 = arg2;
            if (class21.field211 == null) {
                class31.field363 = class21.field211 = new class32(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
            }
            if (arg4 != 55) {
                field133 = null;
            }
            class21.field211.method202(1, (byte) 120, this);
        } catch (Exception var7) {
            class17.method77(null, var7, (byte) 52);
            this.method57("crash", -111);
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 631)
    public final void method57(String arg0, int arg1) {
        if (this.field137) {
            return;
        }
        this.field137 = true;
        if (arg1 >= -103) {
            this.getParameter(null);
        }
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 651)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V")
    public abstract void method42(byte arg0);

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V")
    public abstract void method44(int arg0);

    @OriginalMember(owner = "mapview!ha", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "(I)V")
    public abstract void method50(int arg0);

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "(I)V")
    public abstract void method53(int arg0);

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "(B)V")
    public abstract void method56(byte arg0);
}
