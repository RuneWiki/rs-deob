import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class class291 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!li", name = "t", descriptor = "Z")
    private boolean field5117 = false;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field5106 = 0;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Loa;")
    public static class99 field5103 = class221.method1463(2844, "S-Blectionner");

    @OriginalMember(owner = "client!li", name = "D", descriptor = "Loa;")
    public static class99 field5127 = class221.method1463(2844, "<col=ff7000>");

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field5115 = 0;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "Z")
    public static boolean field5134;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[[[I")
    public static int[][][] field5100;

    @OriginalMember(owner = "client!li", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field5109++;
        if (class75.field1281 == null) {
            return class24.field368 == null || class24.field368.field1493 == this ? super.getAppletContext() : class24.field368.field1493.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public abstract void method1057(boolean arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public abstract void method1060(int arg0);

    @OriginalMember(owner = "client!li", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIBILjava/lang/String;I)V")
    public final void method1946(int arg0, int arg1, int arg2, byte arg3, int arg4, String arg5, int arg6) {
        field5102++;
        try {
            class2.field16 = 0;
            int var8 = 17 / ((-arg3 - 30) / 63);
            class199.field3458 = arg1;
            class254.field4390 = arg1;
            class277.field4874 = arg2;
            class24.field373 = arg6;
            class280.field4901 = arg6;
            class252.field4368 = 0;
            class63.field1064 = this;
            class75.field1281 = new Frame();
            class75.field1281.setTitle("Jagex");
            class75.field1281.setResizable(true);
            class75.field1281.addWindowListener(this);
            class75.field1281.setVisible(true);
            class75.field1281.toFront();
            Insets var9 = class75.field1281.getInsets();
            class75.field1281.setSize(class254.field4390 + var9.left + var9.right, class280.field4901 - (-var9.top + -var9.bottom));
            class137.field2408 = class24.field368 = new class87((Applet) null, arg4, arg5, arg0);
            class275 var10 = class24.field368.method594(-30175, this, 1);
            while (var10.field4844 == 0) {
                class100.method711(0, 10L);
            }
        } catch (Exception var12) {
            class196.method1315(false, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!li", name = "start", descriptor = "()V")
    public final void start() {
        field5131++;
        if (class63.field1064 == this && !class28.field529) {
            class103.field1743 = 0L;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public final synchronized void method1947(byte arg0) {
        field5120++;
        if (class166.field2951 != null) {
            class166.field2951.removeFocusListener(this);
            class166.field2951.getParent().remove(class166.field2951);
        }
        Container var2;
        if (class253.field4377 != null) {
            var2 = class253.field4377;
        } else if (class75.field1281 == null) {
            var2 = class24.field368.field1493;
        } else {
            var2 = class75.field1281;
        }
        var2.setLayout((LayoutManager) null);
        class166.field2951 = new class149(this);
        var2.add(class166.field2951);
        class166.field2951.setSize(class199.field3458, class24.field373);
        class166.field2951.setVisible(true);
        if (arg0 < 87) {
            this.field5117 = true;
        }
        if (class75.field1281 == var2) {
            Insets var3 = class75.field1281.getInsets();
            class166.field2951.setLocation(class252.field4368 + var3.left, var3.top - -class2.field16);
        } else {
            class166.field2951.setLocation(class252.field4368, class2.field16);
        }
        class166.field2951.addFocusListener(this);
        class166.field2951.requestFocus();
        class152.field2666 = true;
        class179.field3116 = true;
        class125.field2193 = true;
        class41.field698 = false;
        class97.field1634 = class231.method1513(-124);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    private final void method1948(byte arg0) {
        field5122++;
        long var2 = class231.method1513(-126);
        long var4 = class76.field1352[class100.field1708];
        class76.field1352[class100.field1708] = var2;
        class100.field1708 = class100.field1708 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class194.field3409 = ((var6 >> 1) + 32000) / var6;
        }
        int var7 = 103 / ((arg0 + 59) / 52);
        if ((class56.field922++) > 50) {
            class125.field2193 = true;
            class56.field922 -= 50;
            class166.field2951.setSize(class199.field3458, class24.field373);
            class166.field2951.setVisible(true);
            if (class75.field1281 != null && class253.field4377 == null) {
                Insets var8 = class75.field1281.getInsets();
                class166.field2951.setLocation(class252.field4368 + var8.left, class2.field16 + var8.top);
            } else {
                class166.field2951.setLocation(class252.field4368, class2.field16);
            }
        }
        this.method1060(28);
    }

    @OriginalMember(owner = "client!li", name = "run", descriptor = "()V")
    public final void run() {
        field5105++;
        try {
            if (class87.field1506 != null) {
                String var1 = class87.field1506.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class87.field1511;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1953("wrongjava", 0);
                        return;
                    }
                    class268.field4713 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class87.field1511 == null || class87.field1511.equals("1.4.2"))) {
                    this.method1953("wrongjava", 0);
                    return;
                }
            }
            if (class87.field1511 != null && class87.field1511.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class87.field1511.length()) {
                    char var5 = class87.field1511.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var5 - (48 - var4 * 10);
                    var3++;
                }
                if (var4 >= 5) {
                    class90.field1542 = true;
                }
            }
            if (class24.field368.field1493 != null) {
                Method var6 = class87.field1512;
                if (var6 != null) {
                    try {
                        var6.invoke(class24.field368.field1493, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class38.method295(57);
            this.method1947((byte) 95);
            class123.field2156 = class40.method309(class199.field3458, class24.field373, class166.field2951, 114);
            this.method1063((byte) -61);
            class120.field2121 = class99.method671((byte) 71);
            while (class103.field1743 == 0L || class103.field1743 > class231.method1513(-60)) {
                class212.field3670 = class120.field2121.method330(class179.field3123, class268.field4713, 10931);
                for (int var7 = 0; var7 < class212.field3670; var7++) {
                    this.method1954(1);
                }
                this.method1948((byte) 0);
                class123.method813(false, class24.field368, class166.field2951);
            }
        } catch (Exception var10) {
            class196.method1315(false, var10, (String) null);
            this.method1953("crash", 0);
        }
        this.method1956(true, (byte) -123);
    }

    @OriginalMember(owner = "client!li", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field5099++;
        if (class75.field1281 == null) {
            return class24.field368 == null || class24.field368.field1493 == this ? super.getParameter(arg0) : class24.field368.field1493.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field5129++;
        if (class75.field1281 == null) {
            return class24.field368 == null || class24.field368.field1493 == this ? super.getDocumentBase() : class24.field368.field1493.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5118++;
        class152.field2666 = true;
        class125.field2193 = true;
    }

    @OriginalMember(owner = "client!li", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field5128++;
        class152.field2666 = false;
    }

    @OriginalMember(owner = "client!li", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field5112++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lg;")
    public static final class278 method1949(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class278 var4 = var3.field3757;
            var3.field3757 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!li", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field5104++;
        if (class63.field1064 != this || class28.field529) {
            return;
        }
        class125.field2193 = true;
        if (class90.field1542 && (class231.method1513(52) - class97.field1634) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class254.field4390 && class280.field4901 <= var2.height) {
                class41.field698 = true;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field5119++;
    }

    @OriginalMember(owner = "client!li", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field5121++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIBII)V")
    public final void method1950(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5130++;
        try {
            if (class63.field1064 == null) {
                class2.field16 = 0;
                class277.field4874 = arg1;
                class63.field1064 = this;
                class252.field4368 = 0;
                class24.field373 = arg3;
                class280.field4901 = arg3;
                class199.field3458 = arg4;
                class254.field4390 = arg4;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class24.field368 == null) {
                    class137.field2408 = class24.field368 = new class87(this, arg0, (String) null, 0);
                }
                class275 var7 = class24.field368.method594(-30175, this, 1);
                while (var7.field4844 == 0) {
                    class100.method711(0, 10L);
                }
                if (arg2 >= -40) {
                    field5106 = 2;
                }
            } else {
                class151.field2658++;
                if (class151.field2658 >= 3) {
                    this.method1953("alreadyloaded", 0);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class196.method1315(false, var9, (String) null);
            this.method1953("crash", 0);
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
    public abstract void method1063(byte arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ltg;I)V")
    public static final void method1951(class182 arg0, int arg1) {
        class187.field3321 = arg0;
        if (arg1 == 1000) {
            field5126++;
        }
    }

    @OriginalMember(owner = "client!li", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field5124++;
    }

    @OriginalMember(owner = "client!li", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field5110++;
    }

    @OriginalMember(owner = "client!li", name = "providesignlink", descriptor = "(Ljd;)V")
    public static final void providesignlink(class87 arg0) {
        class24.field368 = arg0;
        class137.field2408 = arg0;
        field5113++;
    }

    @OriginalMember(owner = "client!li", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field5132++;
    }

    @OriginalMember(owner = "client!li", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field5107++;
        this.destroy();
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Z")
    public final boolean method1952(int arg0) {
        field5101++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 >= -19) {
                field5115 = 69;
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
                this.method1953("invalidhost", 0);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field5114++;
        if (class63.field1064 == this && !class28.field529) {
            class103.field1743 = class231.method1513(-107);
            class100.method711(0, 5000L);
            class137.field2408 = null;
            this.method1956(false, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!li", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field5123++;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public abstract void method1053(int arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1953(String arg0, int arg1) {
        field5116++;
        if (this.field5117) {
            return;
        }
        this.field5117 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg1 != 0) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    private final void method1954(int arg0) {
        long var2 = class231.method1513(arg0 ^ 0x40);
        long var4 = class107.field1863[class206.field3562];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        field5111++;
        class107.field1863[class206.field3562] = var2;
        class206.field3562 = class206.field3562 + arg0 & 0x1F;
        synchronized (this) {
            class179.field3116 = class152.field2666;
        }
        this.method1057(true);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)V")
    public static void method1955(byte arg0) {
        field5100 = null;
        field5127 = null;
        field5103 = null;
        if (arg0 >= -115) {
            providesignlink((class87) null);
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(B)V")
    public abstract void method1051(byte arg0);

    @OriginalMember(owner = "client!li", name = "stop", descriptor = "()V")
    public final void stop() {
        field5108++;
        if (class63.field1064 == this && !class28.field529) {
            class103.field1743 = class231.method1513(92) + 4000L;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZB)V")
    private final void method1956(boolean arg0, byte arg1) {
        field5125++;
        synchronized (this) {
            if (class28.field529) {
                return;
            }
            class28.field529 = true;
        }
        if (class24.field368.field1493 != null) {
            class24.field368.field1493.destroy();
        }
        try {
            this.method1051((byte) -83);
        } catch (Exception var9) {
        }
        if (arg1 >= -67) {
            method1949(48, 57, 3);
        }
        if (class166.field2951 != null) {
            try {
                class166.field2951.removeFocusListener(this);
                class166.field2951.getParent().remove(class166.field2951);
            } catch (Exception var8) {
            }
        }
        if (class24.field368 != null) {
            try {
                class24.field368.method598(9054);
            } catch (Exception var7) {
            }
        }
        this.method1053(127);
        if (class75.field1281 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!li", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field5098++;
        if (class75.field1281 == null) {
            return class24.field368 == null || class24.field368.field1493 == this ? super.getCodeBase() : class24.field368.field1493.getCodeBase();
        } else {
            return null;
        }
    }
}
