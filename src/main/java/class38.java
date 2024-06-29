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

@OriginalClass("mapview!w")
public abstract class class38 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "Z")
    private boolean field504 = false;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "Ld;")
    public static class7 field502 = method251((byte) 88, "-5bersicht");

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "Z")
    public static volatile boolean field506 = false;

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "Ld;")
    public static class7 field507 = method251((byte) 69, "Guide");

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "Ld;")
    public static class7 field503 = method251((byte) -96, "Estate Agent");

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "Ld;")
    public static class7 field505 = method251((byte) 55, "Silver Shop");

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "Z")
    public static boolean field509;

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "[B")
    public static byte[] field508;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II)I", line = 4)
    public static int method243(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!w", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 11)
    public final String getParameter(String arg0) {
        if (class11.field129 == null) {
            return class28.field399 == null || class28.field399.field17 == this ? super.getParameter(arg0) : class28.field399.field17.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)V", line = 27)
    private final synchronized void method244(int arg0) {
        if (class28.field420) {
            return;
        }
        class28.field420 = true;
        try {
            class21.field237.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method189((byte) 97);
        } catch (Exception var8) {
        }
        if (class11.field129 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (arg0 != 0) {
            field505 = null;
        }
        if (class28.field399 != null) {
            try {
                class28.field399.method19((byte) 127);
            } catch (Exception var6) {
            }
        }
        this.method175(false);
    }

    @OriginalMember(owner = "mapview!w", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 76)
    public final synchronized void paint(Graphics arg0) {
        if (class31.field449 != this || class28.field420) {
            return;
        }
        class18.field194 = true;
        if (class3.field24 != null && class3.field24.startsWith("1.5") && class11.method103(18440) - class31.field444 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class23.field248 && class35.field465 <= var2.height) {
                field506 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!w", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 100)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!w", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 115)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(I)Z", line = 128)
    public final boolean method245(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else if (arg0 == -11267) {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method249("invalidhost", 119);
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "start", descriptor = "()V", line = 164)
    public final void start() {
        if (class31.field449 == this && !class28.field420) {
            class35.field468 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IBIII)V", line = 175)
    public final void method246(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            if (class31.field449 != null) {
                class26.field372++;
                if (class26.field372 >= 3) {
                    this.method249("alreadyloaded", arg1 + 47);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase());
                return;
            }
            class31.field449 = this;
            class23.field248 = arg0;
            class35.field465 = arg3;
            if (arg1 != 10) {
                field505 = null;
            }
            class11.field132 = arg4;
            if (class28.field399 == null) {
                class28.field392 = class28.field399 = new class3(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg2, null, 0);
            }
            class28.field399.method18(2, this, 1);
        } catch (Exception var7) {
            class26.method199(false, null, var7);
            this.method249("crash", arg1 ^ 0x38);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 215)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!w", name = "stop", descriptor = "()V", line = 222)
    public final void stop() {
        if (class31.field449 == this && !class28.field420) {
            class35.field468 = class11.method103(18440) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 233)
    public final URL getDocumentBase() {
        if (class11.field129 == null) {
            return class28.field399 == null || class28.field399.field17 == this ? super.getDocumentBase() : class28.field399.field17.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 247)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!w", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 260)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(I)V", line = 266)
    private final void method247(int arg0) {
        long var2 = class11.method103(18440);
        long var4 = class35.field474[mapview.field338];
        if (var4 != 0L && var4 >= var2) {
        }
        class35.field474[mapview.field338] = var2;
        mapview.field338 = arg0 & mapview.field338 + 1;
        synchronized (this) {
            ;
        }
        this.method192((byte) -80);
    }

    @OriginalMember(owner = "mapview!w", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 299)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!w", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 309)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!w", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 313)
    public final AppletContext getAppletContext() {
        if (class11.field129 == null) {
            return class28.field399 == null || class28.field399.field17 == this ? super.getAppletContext() : class28.field399.field17.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "run", descriptor = "()V", line = 331)
    public final void run() {
        try {
            if (class3.field25 != null) {
                String var1 = class3.field25.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class3.field24;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method249("wrongjava", 125);
                        return;
                    }
                    class8.field89 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class3.field24 == null || class3.field24.equals("1.4.2"))) {
                    this.method249("wrongjava", 50);
                    return;
                }
            }
            if (class28.field399.field17 != null) {
                Method var3 = class3.field20;
                if (var3 != null) {
                    try {
                        var3.invoke(class28.field399.field17, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method252(false);
            class4.field42 = class28.method208(class23.field248, (byte) 119, class35.field465, class21.field237);
            this.method185(true);
            class2.field8 = class5.method31((byte) 64);
            class2.field8.method122((byte) -109);
            while (class35.field468 == 0L || class11.method103(18440) < class35.field468) {
                class4.field41 = class2.field8.method120(-29158, class8.field89, class5.field63);
                for (int var5 = 0; var5 < class4.field41; var5++) {
                    this.method247(31);
                }
                this.method253(111);
            }
        } catch (Exception var8) {
            class26.method199(false, null, var8);
            this.method249("crash", 61);
        }
        this.method244(0);
    }

    @OriginalMember(owner = "mapview!w", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 408)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "(I)B", line = 411)
    public static final byte method248(int arg0) {
        if (arg0 != -11177) {
            providesignlink(null);
        }
        return class22.field246 == null ? 0 : class22.field246[class2.field10];
    }

    @OriginalMember(owner = "mapview!w", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 425)
    public final void focusGained(FocusEvent arg0) {
        class18.field194 = true;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 438)
    public final void method249(String arg0, int arg1) {
        if (this.field504 || arg1 <= 45) {
            return;
        }
        this.field504 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!w", name = "providesignlink", descriptor = "(Lb;)V", line = 458)
    public static final void providesignlink(class3 arg0) {
        class28.field399 = arg0;
        class28.field392 = arg0;
    }

    @OriginalMember(owner = "mapview!w", name = "destroy", descriptor = "()V", line = 465)
    public final void destroy() {
        if (class31.field449 == this && !class28.field420) {
            class35.field468 = class11.method103(18440);
            class28.method205(5000L, (byte) 122);
            class28.field392 = null;
            this.method244(0);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 480)
    public final URL getCodeBase() {
        if (class11.field129 == null) {
            return class28.field399 == null || class28.field399.field17 == this ? super.getCodeBase() : class28.field399.field17.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 492)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "(I)V", line = 496)
    public static void method250(int arg0) {
        if (arg0 != 0) {
            field502 = null;
        }
        field502 = null;
        field507 = null;
        field505 = null;
        field508 = null;
        field503 = null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(BLjava/lang/String;)Ld;", line = 512)
    public static final class7 method251(byte arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 57 % ((arg0 + 5) / 58);
        class7 var5 = new class7();
        var5.field75 = new byte[var3];
        int var6 = 0;
        while (var6 < var3) {
            int var7 = var2[var6++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var6 >= var3) {
                    break;
                }
                int var8 = var2[var6++] & 0xFF;
                var5.field75[var5.field76++] = (byte) (var7 * 43 + var8 - 1720 - 48);
            } else if (var7 != 0) {
                var5.field75[var5.field76++] = (byte) var7;
            }
        }
        var5.method78(26);
        return var5.method62(97);
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(Z)V", line = 555)
    public final synchronized void method252(boolean arg0) {
        Container var2;
        if (class11.field129 == null) {
            var2 = class28.field399.field17;
        } else {
            var2 = class11.field129;
        }
        if (class21.field237 != null) {
            class21.field237.removeFocusListener(this);
            var2.remove(class21.field237);
        }
        class21.field237 = new class37(this);
        var2.add(class21.field237);
        class21.field237.setSize(class23.field248, class35.field465);
        class21.field237.setVisible(true);
        if (class11.field129 == null) {
            class21.field237.setLocation(0, 0);
        } else {
            Insets var3 = class11.field129.getInsets();
            class21.field237.setLocation(var3.left, var3.top);
        }
        class21.field237.addFocusListener(this);
        class21.field237.requestFocus();
        class18.field194 = true;
        field506 = arg0;
        class31.field444 = class11.method103(18440);
    }

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "(I)V", line = 597)
    private final void method253(int arg0) {
        long var2 = class11.method103(18440);
        long var4 = class11.field131[class16.field182];
        class11.field131[class16.field182] = var2;
        if (var4 != 0L && var2 <= var4) {
        }
        if (arg0 <= 98) {
            this.windowOpened(null);
        }
        class16.field182 = class16.field182 + 1 & 0x1F;
        if (class37.field501++ > 50) {
            class37.field501 -= 50;
            class18.field194 = true;
            class21.field237.setSize(class23.field248, class35.field465);
            class21.field237.setVisible(true);
            if (class11.field129 == null) {
                class21.field237.setLocation(0, 0);
            } else {
                Insets var6 = class11.field129.getInsets();
                class21.field237.setLocation(var6.left, var6.top);
            }
        }
        this.method177(112);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(B)V")
    public abstract void method189(byte arg0);

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Z)V")
    public abstract void method185(boolean arg0);

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "(I)V")
    public abstract void method177(int arg0);

    @OriginalMember(owner = "mapview!w", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(Z)V")
    public abstract void method175(boolean arg0);

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(B)V")
    public abstract void method192(byte arg0);
}
