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

@OriginalClass("mapview!s")
public abstract class class34 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Z")
    private boolean field441 = false;

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "I")
    public static volatile int field438 = 0;

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "Lna;")
    public static class26 field437 = class6.method40("Potters Wheel", 48);

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Lna;")
    public static class26 field440 = class6.method40("Bank", 48);

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "Lna;")
    public static class26 field443 = class6.method40("Altar", 48);

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "Lna;")
    public static class26 field442 = class6.method40("Guide", 48);

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "I")
    private static int field445;

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "mapview!s", name = "m", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "[I")
    public static int[] field436;

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "[[Lba;")
    public static class4[][] field447;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Z)V", line = 4)
    public static void method238(boolean arg0) {
        field437 = null;
        field440 = null;
        field442 = null;
        field436 = null;
        field447 = null;
        field443 = null;
        if (arg0) {
            field447 = null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 20)
    public final URL getDocumentBase() {
        if (class2.field32 == null) {
            return class4.field50 == null || class4.field50.field187 == this ? super.getDocumentBase() : class4.field50.field187.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 37)
    public final AppletContext getAppletContext() {
        if (class2.field32 == null) {
            return class4.field50 == null || class4.field50.field187 == this ? super.getAppletContext() : class4.field50.field187.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 50)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!s", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 57)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!s", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 61)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!s", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 68)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 76)
    public final synchronized void method239(int arg0) {
        Container var2;
        if (class2.field32 == null) {
            var2 = class4.field50.field187;
        } else {
            var2 = class2.field32;
        }
        if (class4.field44 != null) {
            class4.field44.removeFocusListener(this);
            var2.remove(class4.field44);
        }
        class4.field44 = new class9(this);
        var2.add(class4.field44);
        class4.field44.setSize(class38.field479, class32.field417);
        class4.field44.setVisible(true);
        if (class2.field32 == null) {
            class4.field44.setLocation(0, 0);
        } else {
            Insets var3 = class2.field32.getInsets();
            class4.field44.setLocation(var3.left, var3.top);
        }
        class4.field44.addFocusListener(this);
        class4.field44.requestFocus();
        class4.field54 = true;
        if (arg0 > 116) {
            class19.field202 = false;
            class33.field429 = class32.method229(-1);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IIIII)V", line = 116)
    public final void method240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class21.field219 != null) {
                class26.field374++;
                if (class26.field374 >= 3) {
                    this.method241("alreadyloaded", 4196);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase());
                return;
            }
            class21.field219 = this;
            class31.field407 = arg2;
            class38.field479 = arg4;
            class32.field417 = arg1;
            if (arg0 != 0) {
                this.method168(-111);
            }
            if (class4.field50 == null) {
                class38.field482 = class4.field50 = new class16(false, this, arg3, null, 0);
            }
            class4.field50.method100(1, this, (byte) 125);
        } catch (Exception var7) {
            class2.method17(var7, null, -127);
            this.method241("crash", 4196);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "destroy", descriptor = "()V", line = 154)
    public final void destroy() {
        if (class21.field219 == this && !class11.field127) {
            class1.field21 = class32.method229(-1);
            class23.method135(-24879, 5000L);
            class38.field482 = null;
            this.method244((byte) -119);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 172)
    public final URL getCodeBase() {
        if (class2.field32 == null) {
            return class4.field50 == null || class4.field50.field187 == this ? super.getCodeBase() : class4.field50.field187.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 187)
    public final void method241(String arg0, int arg1) {
        if (this.field441) {
            return;
        }
        if (arg1 != 4196) {
            this.windowActivated(null);
        }
        this.field441 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!s", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 208)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(I)V", line = 219)
    private final void method242(int arg0) {
        long var2 = class32.method229(-1);
        long var4 = class19.field203[field445];
        if (var4 != 0L && var4 >= var2) {
        }
        class19.field203[field445] = var2;
        field445 = field445 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        if (arg0 != -30832) {
            field444 = -80;
        }
        this.method153(0);
    }

    @OriginalMember(owner = "mapview!s", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 268)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!s", name = "providesignlink", descriptor = "(Lia;)V", line = 273)
    public static final void providesignlink(class16 arg0) {
        class4.field50 = arg0;
        class38.field482 = arg0;
    }

    @OriginalMember(owner = "mapview!s", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 280)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!s", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 284)
    public final String getParameter(String arg0) {
        if (class2.field32 == null) {
            return class4.field50 == null || class4.field50.field187 == this ? super.getParameter(arg0) : class4.field50.field187.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(B)Z", line = 310)
    public final boolean method243(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 > -94) {
                field438 = 86;
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method241("invalidhost", 4196);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!s", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 347)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(B)V", line = 351)
    private final synchronized void method244(byte arg0) {
        if (class11.field127) {
            return;
        }
        class11.field127 = true;
        try {
            class4.field44.removeFocusListener(this);
            if (arg0 >= -98) {
                field439 = 75;
            }
        } catch (Exception var9) {
        }
        try {
            this.method168(-1);
        } catch (Exception var8) {
        }
        if (class2.field32 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class4.field50 != null) {
            try {
                class4.field50.method104((byte) -28);
            } catch (Exception var6) {
            }
        }
        this.method165(17);
    }

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "(I)V", line = 399)
    public static final void method245(int arg0) {
        if (class7.field88[0][class1.field20][field439] == null) {
            class23.field238 = null;
        } else {
            class23.field238 = class7.field88[0][class1.field20][field439];
        }
        if (class7.field88[arg0][class1.field20][field439] == null) {
            class1.field8 = null;
        } else {
            class1.field8 = class7.field88[1][class1.field20][field439];
        }
        if (class7.field88[2][class1.field20][field439] == null) {
            class14.field167 = null;
        } else {
            class14.field167 = class7.field88[2][class1.field20][field439];
        }
        if (class7.field88[3][class1.field20][field439] == null) {
            class8.field95 = null;
        } else {
            class8.field95 = class7.field88[3][class1.field20][field439];
        }
        if (class7.field88[4][class1.field20][field439] == null) {
            class4.field42 = null;
        } else {
            class4.field42 = class7.field88[4][class1.field20][field439];
        }
        if (field447[class1.field20][field439] == null) {
            class38.field464 = null;
        } else {
            class38.field464 = field447[class1.field20][field439];
        }
        if (class12.field146[class1.field20][field439] == null) {
            class6.field82 = null;
        } else {
            class6.field82 = class12.field146[class1.field20][field439];
        }
        if (class26.field372[class1.field20][field439] == null) {
            class10.field111 = null;
        } else {
            class10.field111 = class26.field372[class1.field20][field439];
        }
    }

    @OriginalMember(owner = "mapview!s", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 445)
    public final void focusGained(FocusEvent arg0) {
        class4.field54 = true;
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(Z)V", line = 461)
    private final void method246(boolean arg0) {
        long var2 = class32.method229(-1);
        if (arg0) {
            return;
        }
        long var4 = class33.field435[class10.field116];
        if (var4 != 0L && var4 < var2) {
        }
        class33.field435[class10.field116] = var2;
        class10.field116 = class10.field116 + 1 & 0x1F;
        if (class8.field98++ > 50) {
            class4.field54 = true;
            class8.field98 -= 50;
            class4.field44.setSize(class38.field479, class32.field417);
            class4.field44.setVisible(true);
            if (class2.field32 == null) {
                class4.field44.setLocation(0, 0);
            } else {
                Insets var6 = class2.field32.getInsets();
                class4.field44.setLocation(var6.left, var6.top);
            }
        }
        this.method166(-98);
    }

    @OriginalMember(owner = "mapview!s", name = "stop", descriptor = "()V", line = 506)
    public final void stop() {
        if (class21.field219 == this && !class11.field127) {
            class1.field21 = class32.method229(-1) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "run", descriptor = "()V", line = 523)
    public final void run() {
        try {
            if (class16.field189 != null) {
                String var1 = class16.field189.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class16.field180;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method241("wrongjava", 4196);
                        return;
                    }
                    class14.field169 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class16.field180 == null || class16.field180.equals("1.4.2"))) {
                    this.method241("wrongjava", 4196);
                    return;
                }
            }
            if (class4.field50.field187 != null) {
                Method var3 = class16.field184;
                if (var3 != null) {
                    try {
                        var3.invoke(class4.field50.field187, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method239(124);
            class12.field153 = mapview.method160(class4.field44, class32.field417, (byte) 79, class38.field479);
            this.method158(50);
            class21.field220 = class2.method14(-24788);
            class21.field220.method75((byte) 84);
            while (class1.field21 == 0L || class1.field21 > class32.method229(-1)) {
                class8.field94 = class21.field220.method73(class14.field169, class13.field158, 128);
                for (int var5 = 0; var5 < class8.field94; var5++) {
                    this.method242(-30832);
                }
                this.method246(false);
                class8.method54(true, (byte) -16);
            }
        } catch (Exception var8) {
            class2.method17(var8, null, -124);
            this.method241("crash", 4196);
        }
        this.method244((byte) -119);
    }

    @OriginalMember(owner = "mapview!s", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 606)
    public final synchronized void paint(Graphics arg0) {
        if (class21.field219 != this || class11.field127) {
            return;
        }
        class4.field54 = true;
        if (class16.field180 != null && class16.field180.startsWith("1.5") && class32.method229(-1) - class33.field429 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class38.field479 <= var2.width && var2.height >= class32.field417) {
                class19.field202 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!s", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 630)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!s", name = "start", descriptor = "()V", line = 637)
    public final void start() {
        if (class21.field219 == this && !class11.field127) {
            class1.field21 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "(I)V")
    public abstract void method166(int arg0);

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "(I)V")
    public abstract void method168(int arg0);

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "(I)V")
    public abstract void method153(int arg0);

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "(I)V")
    public abstract void method158(int arg0);

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "(I)V")
    public abstract void method165(int arg0);
}
