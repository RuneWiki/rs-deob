import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public abstract class class15 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Z")
    private boolean field222 = false;

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Lt;")
    public static class31 field219 = class11.method64(-120, "Windmill");

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Lt;")
    public static class31 field218 = class11.method64(-90, "???");

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "Lt;")
    public static class31 field223 = class11.method64(105, "Altar");

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Lt;")
    public static class31 field221 = class11.method64(-50, "Spinning Wheel");

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "I")
    public static int field225 = 0;

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "I")
    public static volatile int field224 = 0;

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Ljava/awt/Frame;")
    private static Frame field220;

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field226;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Ljava/lang/String;")
    public static String field217;

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "Z")
    public static boolean field227;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 11)
    public final synchronized void method82(int arg0) {
        Container var2;
        if (field220 == null) {
            var2 = class17.field243.field191;
        } else {
            var2 = field220;
        }
        if (class28.field311 != null) {
            class28.field311.removeFocusListener(this);
            var2.remove(class28.field311);
        }
        class28.field311 = new class9(this);
        var2.add(class28.field311);
        class28.field311.setSize(class28.field319, class31.field350);
        int var3 = -83 % ((2 - arg0) / 47);
        class28.field311.setVisible(true);
        if (field220 == null) {
            class28.field311.setLocation(0, 0);
        } else {
            Insets var4 = field220.getInsets();
            class28.field311.setLocation(var4.left, var4.top);
        }
        class28.field311.addFocusListener(this);
        class28.field311.requestFocus();
        class10.field181 = true;
        class2.field81 = false;
        class6.field114 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Z)V", line = 50)
    public static void method83(boolean arg0) {
        if (!arg0) {
            return;
        }
        field223 = null;
        field217 = null;
        field219 = null;
        field226 = null;
        field220 = null;
        field221 = null;
        field218 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 67)
    public final URL getDocumentBase() {
        if (field220 == null) {
            return class17.field243 == null || class17.field243.field191 == this ? super.getDocumentBase() : class17.field243.field191.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 80)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(II[BI)I", line = 84)
    public static final int method84(int arg0, int arg1, byte[] arg2, int arg3) {
        int var4 = -1;
        if (arg0 == 61694024) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                var4 = class30.field327[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        } else {
            return 96;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 105)
    public static final void method85(Component arg0, int arg1) {
        if (arg1 != 0) {
            providesignlink(null);
        }
        arg0.addMouseListener(class27.field301);
        arg0.addMouseMotionListener(class27.field301);
    }

    @OriginalMember(owner = "mapview!ha", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 121)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 124)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "providesignlink", descriptor = "(Lg;)V", line = 129)
    public static final void providesignlink(class12 arg0) {
        class17.field243 = arg0;
        class25.field287 = arg0;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)Ld;", line = 137)
    public static final class7 method86(byte arg0) {
        if (arg0 >= -72) {
            field220 = null;
        }
        class7 var1 = new class7(class10.field166, class32.field364, class18.field245, class33.field390, class28.field309);
        class17.method99((byte) 95);
        return var1;
    }

    @OriginalMember(owner = "mapview!ha", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 151)
    public final URL getCodeBase() {
        if (field220 == null) {
            return class17.field243 == null || class17.field243.field191 == this ? super.getCodeBase() : class17.field243.field191.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 165)
    public final void focusGained(FocusEvent arg0) {
        class10.field181 = true;
    }

    @OriginalMember(owner = "mapview!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 181)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "(I)V", line = 186)
    private final void method87(int arg0) {
        long var2 = System.currentTimeMillis();
        long var4 = class17.field237[class31.field354];
        if (var4 != 0L && var4 >= var2) {
        }
        class17.field237[class31.field354] = var2;
        class31.field354 = class31.field354 + 1 & 0x1F;
        if (class30.field339++ > 50) {
            class10.field181 = true;
            class30.field339 -= 50;
            class28.field311.setSize(class28.field319, class31.field350);
            class28.field311.setVisible(true);
            if (field220 == null) {
                class28.field311.setLocation(0, 0);
            } else {
                Insets var6 = field220.getInsets();
                class28.field311.setLocation(var6.left, var6.top);
            }
        }
        this.method28(92);
        if (arg0 > -87) {
            field226 = null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "start", descriptor = "()V", line = 229)
    public final void start() {
        if (class1.field75 == this && !class4.field108) {
            class25.field278 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 241)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ha", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 250)
    public final synchronized void paint(Graphics arg0) {
        if (class1.field75 != this || class4.field108) {
            return;
        }
        class10.field181 = true;
        if (class12.field196 != null && class12.field196.startsWith("1.5") && System.currentTimeMillis() - class6.field114 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class28.field319 <= var2.width && class31.field350 <= var2.height) {
                class2.field81 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Lv;BII)Z", line = 276)
    public static final boolean method88(class33 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 84) {
            return true;
        }
        byte[] var4 = arg0.method192(arg2, arg3, (byte) 109);
        if (var4 == null) {
            return false;
        } else {
            class30.method161(98, var4);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "(I)Z", line = 293)
    public final boolean method89(int arg0) {
        if (arg0 != 13003) {
            return true;
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
                this.method94("invalidhost", (byte) -47);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "destroy", descriptor = "()V", line = 324)
    public final void destroy() {
        if (class1.field75 == this && !class4.field108) {
            class25.field278 = System.currentTimeMillis();
            class22.method111(0, 5000L);
            class25.field287 = null;
            this.method90(-117);
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "(I)V", line = 341)
    private final synchronized void method90(int arg0) {
        if (class4.field108) {
            return;
        }
        class4.field108 = true;
        try {
            class28.field311.removeFocusListener(this);
            if (arg0 >= -7) {
                field223 = null;
            }
        } catch (Exception var9) {
        }
        try {
            this.method21(-504);
        } catch (Exception var8) {
        }
        if (field220 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class17.field243 != null) {
            try {
                class17.field243.method68((byte) 101);
            } catch (Exception var6) {
            }
        }
        this.method11(-1);
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIII)V", line = 394)
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class1.field75 != null) {
                this.method94("alreadyloaded", (byte) -47);
                return;
            }
            class1.field75 = this;
            class31.field350 = arg3;
            class33.field380 = arg4;
            class28.field319 = arg1;
            if (arg2 != 0) {
                return;
            }
            if (class17.field243 == null) {
                class25.field287 = class17.field243 = new class12(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
            }
            class17.field243.method70(this, true, 1);
        } catch (Exception var7) {
            class2.method35(null, 12895, var7);
            this.method94("crash", (byte) -47);
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(ZIILv;)[Lja;", line = 427)
    public static final class19[] method92(boolean arg0, int arg1, int arg2, class33 arg3) {
        if (method88(arg3, (byte) 88, arg2, arg1)) {
            if (arg0) {
                providesignlink(null);
            }
            return class25.method137(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 454)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 462)
    public final AppletContext getAppletContext() {
        if (field220 == null) {
            return class17.field243 == null || class17.field243.field191 == this ? super.getAppletContext() : class17.field243.field191.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 479)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "run", descriptor = "()V", line = 484)
    public final void run() {
        try {
            if (class12.field202 != null) {
                String var1 = class12.field202.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class12.field196;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method94("wrongjava", (byte) -47);
                        return;
                    }
                    class31.field348 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class12.field196 == null || class12.field196.equals("1.4.2"))) {
                    this.method94("wrongjava", (byte) -47);
                    return;
                }
            }
            this.method82(-47);
            class22.field268 = class32.method183((byte) -117, class31.field350, class28.field319, class28.field311);
            this.method12(10);
            class27.field306 = class33.method190(1);
            class27.field306.method59(-1);
            while (class25.field278 == 0L || System.currentTimeMillis() < class25.field278) {
                class22.field267 = class27.field306.method60(class28.field315, 113, class31.field348);
                for (int var3 = 0; var3 < class22.field267; var3++) {
                    this.method93(1);
                }
                this.method87(-110);
            }
        } catch (Exception var5) {
            class2.method35(null, 12895, var5);
            this.method94("crash", (byte) -47);
        }
        this.method90(-78);
    }

    @OriginalMember(owner = "mapview!ha", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 547)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "stop", descriptor = "()V", line = 554)
    public final void stop() {
        if (class1.field75 == this && !class4.field108) {
            class25.field278 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "(I)V", line = 567)
    private final void method93(int arg0) {
        long var2 = class6.field126[class17.field241];
        long var4 = System.currentTimeMillis();
        class6.field126[class17.field241] = var4;
        if (var2 != 0L && var2 >= var4) {
        }
        class17.field241 = class17.field241 + arg0 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method20(true);
    }

    @OriginalMember(owner = "mapview!ha", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 595)
    public final String getParameter(String arg0) {
        if (field220 == null) {
            return class17.field243 == null || class17.field243.field191 == this ? super.getParameter(arg0) : class17.field243.field191.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 609)
    public final void method94(String arg0, byte arg1) {
        if (this.field222) {
            return;
        }
        this.field222 = true;
        System.out.println("error_game_" + arg0);
        if (arg1 != -47) {
            field223 = null;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "(Z)V", line = 633)
    public static final void method95(boolean arg0) {
        class1 var1 = class27.field301;
        synchronized (class27.field301) {
            class22.field266 = class26.field289;
            class30.field332 = class30.field334;
            class2.field88 = mapview.field4;
            class2.field85 = class6.field118;
            class25.field277 = field224;
            class32.field373 = class10.field167;
            class6.field118 = 0;
        }
        if (!arg0) {
            field218 = null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 659)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(I)V")
    public abstract void method12(int arg0);

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "(I)V")
    public abstract void method11(int arg0);

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "(I)V")
    public abstract void method28(int arg0);

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "(I)V")
    public abstract void method21(int arg0);

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(Z)V")
    public abstract void method20(boolean arg0);

    @OriginalMember(owner = "mapview!ha", name = "init", descriptor = "()V")
    public abstract void init();
}
