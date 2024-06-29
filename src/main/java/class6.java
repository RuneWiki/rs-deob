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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public abstract class class6 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Z")
    private boolean field144 = false;

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "[I")
    public static int[] field145 = new int[256];

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Z")
    public static boolean field148;

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "Ln;")
    public static class26 field150;

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Z")
    public static volatile boolean field149;

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "Ln;")
    public static class26 field152;

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Ln;")
    public static class26 field154;

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Ljava/awt/Frame;")
    private static Frame field147;

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "[I")
    public static int[] field146;

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "[Lq;")
    public static class32[] field153;

    @OriginalMember(owner = "mapview!ca", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 11)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(B)Z", line = 21)
    public final boolean method64(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            if (arg0 > -46) {
                field148 = false;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method72("invalidhost", 32358);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "providesignlink", descriptor = "(Laa;)V", line = 51)
    public static final void providesignlink(class2 arg0) {
        class28.field369 = arg0;
        class30.field386 = arg0;
    }

    @OriginalMember(owner = "mapview!ca", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 65)
    public final URL getDocumentBase() {
        if (field147 == null) {
            return class28.field369 == null || class28.field369.field89 == this ? super.getDocumentBase() : class28.field369.field89.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 79)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ca", name = "destroy", descriptor = "()V", line = 86)
    public final void destroy() {
        if (class15.field238 == this && !class4.field104) {
            class11.field208 = class16.method115((byte) 74);
            class18.method137(5000L, (byte) 117);
            class30.field386 = null;
            this.method66(-29907);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "run", descriptor = "()V", line = 100)
    public final void run() {
        try {
            if (class2.field91 != null) {
                String var1 = class2.field91.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class2.field95;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method72("wrongjava", 32358);
                        return;
                    }
                    class29.field380 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class2.field95 == null || class2.field95.equals("1.4.2"))) {
                    this.method72("wrongjava", 32358);
                    return;
                }
            }
            if (class28.field369.field89 != null) {
                Method var3 = class2.field96;
                if (var3 != null) {
                    try {
                        var3.invoke(class28.field369.field89, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method67(0);
            class11.field210 = class10.method86(-31295, class4.field119, class14.field228, class16.field248);
            this.method6(26002);
            class26.field349 = class30.method210(true);
            class26.field349.method62(22083);
            while (class11.field208 == 0L || class16.method115((byte) 74) < class11.field208) {
                class26.field353 = class26.field349.method63(true, class29.field380, class19.field268);
                for (int var5 = 0; var5 < class26.field353; var5++) {
                    this.method65(58);
                }
                this.method68(false);
            }
        } catch (Exception var8) {
            class35.method240(var8, null, 95);
            this.method72("crash", 32358);
        }
        this.method66(-29907);
    }

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "(I)V", line = 194)
    private final void method65(int arg0) {
        long var2 = class16.method115((byte) 74);
        long var4 = class5.field128[class21.field307];
        class5.field128[class21.field307] = var2;
        class21.field307 = class21.field307 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 != 58) {
                field152 = null;
            }
        }
        this.method19(0);
        if (var4 != 0L && var2 > var4) {
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 221)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 230)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ca", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 234)
    public final URL getCodeBase() {
        if (field147 == null) {
            return class28.field369 == null || class28.field369.field89 == this ? super.getCodeBase() : class28.field369.field89.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 250)
    public final void focusGained(FocusEvent arg0) {
        field149 = true;
    }

    @OriginalMember(owner = "mapview!ca", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 257)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "(I)V", line = 262)
    private final synchronized void method66(int arg0) {
        if (class4.field104) {
            return;
        }
        class4.field104 = true;
        try {
            class4.field119.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method2(arg0 ^ 0x74D2);
        } catch (Exception var8) {
        }
        if (arg0 != -29907) {
            this.method66(7);
        }
        if (field147 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class28.field369 != null) {
            try {
                class28.field369.method43(true);
            } catch (Exception var6) {
            }
        }
        this.method4(26);
    }

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "(I)V", line = 310)
    public final synchronized void method67(int arg0) {
        Container var2;
        if (field147 == null) {
            var2 = class28.field369.field89;
        } else {
            var2 = field147;
        }
        if (class4.field119 != null) {
            class4.field119.removeFocusListener(this);
            var2.remove(class4.field119);
        }
        class4.field119 = new class10(this);
        var2.add(class4.field119);
        class4.field119.setSize(class14.field228, class16.field248);
        class4.field119.setVisible(true);
        if (field147 == null) {
            class4.field119.setLocation(0, 0);
        } else {
            Insets var3 = field147.getInsets();
            class4.field119.setLocation(var3.left, var3.top);
        }
        class4.field119.addFocusListener(this);
        class4.field119.requestFocus();
        field149 = true;
        if (arg0 != 0) {
            this.method2(30);
        }
        class30.field387 = false;
        class15.field232 = class16.method115((byte) 74);
    }

    @OriginalMember(owner = "mapview!ca", name = "start", descriptor = "()V", line = 349)
    public final void start() {
        if (class15.field238 == this && !class4.field104) {
            class11.field208 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 361)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(Z)V", line = 368)
    private final void method68(boolean arg0) {
        if (arg0) {
            return;
        }
        long var2 = class16.method115((byte) 74);
        long var4 = class15.field237[class4.field107];
        class15.field237[class4.field107] = var2;
        class4.field107 = class4.field107 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
        }
        if (class11.field197++ > 50) {
            field149 = true;
            class11.field197 -= 50;
            class4.field119.setSize(class14.field228, class16.field248);
            class4.field119.setVisible(true);
            if (field147 == null) {
                class4.field119.setLocation(0, 0);
            } else {
                Insets var6 = field147.getInsets();
                class4.field119.setLocation(var6.left, var6.top);
            }
        }
        this.method9(false);
    }

    @OriginalMember(owner = "mapview!ca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 413)
    public final synchronized void paint(Graphics arg0) {
        if (class15.field238 != this || class4.field104) {
            return;
        }
        field149 = true;
        if (class2.field95 != null && class2.field95.startsWith("1.5") && class16.method115((byte) 74) - class15.field232 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class14.field228 <= var2.width && class16.field248 <= var2.height) {
                class30.field387 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 441)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "(I)V", line = 445)
    public static void method69(int arg0) {
        field150 = null;
        field145 = null;
        if (arg0 <= 96) {
            return;
        }
        field152 = null;
        field147 = null;
        field153 = null;
        field146 = null;
        field154 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(B)V", line = 461)
    public static final void method70(byte arg0) {
        if (class2.field91.toLowerCase().indexOf("microsoft") == -1) {
            class16.field245[44] = 71;
            class16.field245[45] = 26;
            class16.field245[46] = 72;
            class16.field245[47] = 73;
            class16.field245[59] = 57;
            class16.field245[61] = 27;
            class16.field245[91] = 42;
            class16.field245[92] = 74;
            class16.field245[93] = 43;
            if (class2.field87 == null) {
                class16.field245[192] = 58;
                class16.field245[222] = 59;
            } else {
                class16.field245[192] = 28;
                class16.field245[222] = 58;
                class16.field245[520] = 59;
            }
        } else {
            class16.field245[186] = 57;
            class16.field245[187] = 27;
            class16.field245[188] = 71;
            class16.field245[189] = 26;
            class16.field245[190] = 72;
            class16.field245[191] = 73;
            class16.field245[192] = 58;
            class16.field245[219] = 42;
            class16.field245[220] = 74;
            class16.field245[221] = 43;
            class16.field245[222] = 59;
            class16.field245[223] = 28;
        }
        if (arg0 != 96) {
            method69(-68);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIIII)V", line = 518)
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class15.field238 != null) {
                this.method72("alreadyloaded", 32358);
                return;
            }
            class14.field228 = arg2;
            class16.field248 = arg0;
            if (arg1 <= 47) {
                this.focusGained(null);
            }
            class15.field238 = this;
            class21.field308 = arg3;
            if (class28.field369 == null) {
                class30.field386 = class28.field369 = new class2(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg4, null, 0);
            }
            class28.field369.method49(this, (byte) 69, 1);
        } catch (Exception var7) {
            class35.method240(var7, null, 95);
            this.method72("crash", 32358);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 547)
    public final AppletContext getAppletContext() {
        if (field147 == null) {
            return class28.field369 == null || class28.field369.field89 == this ? super.getAppletContext() : class28.field369.field89.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 563)
    public final void method72(String arg0, int arg1) {
        if (this.field144 || arg1 != 32358) {
            return;
        }
        this.field144 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field145[var0] = var1;
        }
        field148 = true;
        field150 = class9.method82(255, "Staff Shop");
        field149 = true;
        field152 = class9.method82(255, "Platelegs Shop");
        field151 = -1;
        field154 = class9.method82(255, "Dungeon");
    }

    @OriginalMember(owner = "mapview!ca", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 589)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ca", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 593)
    public final String getParameter(String arg0) {
        if (field147 == null) {
            return class28.field369 == null || class28.field369.field89 == this ? super.getParameter(arg0) : class28.field369.field89.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "stop", descriptor = "()V", line = 607)
    public final void stop() {
        if (class15.field238 == this && !class4.field104) {
            class11.field208 = class16.method115((byte) 74) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 659)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V")
    public abstract void method6(int arg0);

    @OriginalMember(owner = "mapview!ca", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(I)V")
    public abstract void method2(int arg0);

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Z)V")
    public abstract void method9(boolean arg0);

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "(I)V")
    public abstract void method19(int arg0);

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "(I)V")
    public abstract void method4(int arg0);
}
