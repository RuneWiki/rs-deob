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

@OriginalClass("client!e")
public abstract class class29 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
    private boolean field667 = false;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[[I")
    public static int[][] field674 = new int[104][104];

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lr;")
    public static class118 field672 = class153.method1136(104, "runes");

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lr;")
    private static class118 field681 = class153.method1136(113, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!e", name = "N", descriptor = "Lr;")
    public static class118 field705 = field681;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "[I")
    public static int[] field695 = new int[2000];

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field701 = 0;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "Z")
    public static boolean field707;

    @OriginalMember(owner = "client!e", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field692++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    private final synchronized void method240(byte arg0) {
        field666++;
        if (class122.field2822) {
            return;
        }
        class122.field2822 = true;
        try {
            if (arg0 != 5) {
                method245(false, null, null, null);
            }
            class4.field70.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method199((byte) 102);
        } catch (Exception var4) {
        }
        if (class87.field2117 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class95.field2247 != null) {
            try {
                class95.field2247.method1129(true);
            } catch (Exception var2) {
            }
        }
        this.method203((byte) 116);
    }

    @OriginalMember(owner = "client!e", name = "start", descriptor = "()V")
    public final void start() {
        field700++;
        if (class67.field1556 == this && !class122.field2822) {
            class74.field1837 = 0L;
        }
    }

    @OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
    public final void run() {
        field691++;
        try {
            if (class152.field3435 != null) {
                String var1 = class152.field3435.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class152.field3440;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method243(false, "wrongjava");
                        return;
                    }
                    class66.field1509 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class152.field3440 == null || class152.field3440.equals("1.4.2"))) {
                    this.method243(false, "wrongjava");
                    return;
                }
            }
            if (class95.field2247.field3430 != null) {
                Method var3 = class152.field3439;
                if (var3 != null) {
                    try {
                        var3.invoke(class95.field2247.field3430, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method249(true);
            class13.field291 = class27.method239(class4.field70, class82.field1981, -116, class4.field64);
            this.method202((byte) -17);
            class134.field3052 = class89.method714(-19193);
            while (class74.field1837 == 0L || class74.field1837 > class120.method945(20794)) {
                class125.field2865 = class134.field3052.method665(class139.field3165, class66.field1509, (byte) 121);
                for (int var4 = 0; var4 < class125.field2865; var4++) {
                    this.method242(-32404);
                }
                this.method250(8308);
                class142.method1055(class4.field70, 27114, class95.field2247);
            }
        } catch (Exception var7) {
            class23.method212(null, (byte) 117, var7);
            this.method243(false, "crash");
        }
        this.method240((byte) 5);
    }

    @OriginalMember(owner = "client!e", name = "stop", descriptor = "()V")
    public final void stop() {
        field702++;
        if (class67.field1556 == this && !class122.field2822) {
            class74.field1837 = class120.method945(20794) + 4000L;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public abstract void method202(byte arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
    public static final int method241(int arg0, int arg1) {
        int var2 = -35 / ((-arg1 - 31) / 40);
        field685++;
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    private final void method242(int arg0) {
        long var2 = class131.field2983[class48.field1157];
        long var4 = class120.method945(20794);
        class131.field2983[class48.field1157] = var4;
        class48.field1157 = class48.field1157 + 1 & 0x1F;
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        field676++;
        synchronized (this) {
            if (arg0 != -32404) {
                return;
            }
            class67.field1558 = class83.field1997;
        }
        this.method194(114);
    }

    @OriginalMember(owner = "client!e", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!e", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field697++;
    }

    @OriginalMember(owner = "client!e", name = "providesignlink", descriptor = "(Lvf;)V")
    public static final void providesignlink(class152 arg0) {
        class95.field2247 = arg0;
        class144.field3238 = arg0;
        field689++;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public abstract void method195(int arg0);

    @OriginalMember(owner = "client!e", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field668++;
        if (class87.field2117 == null) {
            return class95.field2247 == null || class95.field2247.field3430 == this ? super.getCodeBase() : class95.field2247.field3430.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field703++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method243(boolean arg0, String arg1) {
        field706++;
        if (this.field667) {
            return;
        }
        this.field667 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
        if (arg0) {
            field681 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)Z")
    public final boolean method244(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field684++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 >= -45) {
                this.focusLost(null);
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
                this.method243(false, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class83.field1997 = false;
        field683++;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
    public abstract void method203(byte arg0);

    @OriginalMember(owner = "client!e", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field690++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLr;Lff;Lr;)Lvd;")
    public static final class150 method245(boolean arg0, class118 arg1, class42 arg2, class118 arg3) {
        field696++;
        int var4 = arg2.method356(arg3, 0);
        if (arg0) {
            int var5 = arg2.method351(5, arg1, var4);
            return class73.method615((byte) 93, var5, arg2, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field687++;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public abstract void method194(int arg0);

    @OriginalMember(owner = "client!e", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field678++;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V")
    public abstract void method199(byte arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method246(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 33 / ((arg5 - 7) / 47);
        try {
            class4.field64 = arg4;
            class67.field1556 = this;
            class82.field1981 = arg3;
            class115.field2703 = arg6;
            class87.field2117 = new Frame();
            class87.field2117.setTitle("Jagex");
            class87.field2117.setResizable(false);
            class87.field2117.addWindowListener(this);
            class87.field2117.setVisible(true);
            class87.field2117.toFront();
            Insets var9 = class87.field2117.getInsets();
            class87.field2117.setSize(var9.right + arg4 + var9.left, var9.top + arg3 - -var9.bottom);
            class144.field3238 = class95.field2247 = new class152(true, null, arg0, arg1, arg2);
            class95.field2247.method1128(-17306, this, 1);
        } catch (Exception var11) {
            class23.method212(null, (byte) 91, var11);
        }
        field679++;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(B)V")
    public static void method247(byte arg0) {
        field674 = null;
        field695 = null;
        field705 = null;
        field672 = null;
        field681 = null;
        if (arg0 < 27) {
            field674 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIBI)V")
    public final void method248(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field675++;
        try {
            if (class67.field1556 == null) {
                class67.field1556 = this;
                class4.field64 = arg4;
                int var6 = -9 % ((5 - arg3) / 63);
                class82.field1981 = arg2;
                class115.field2703 = arg0;
                if (class95.field2247 == null) {
                    class144.field3238 = class95.field2247 = new class152(false, this, arg1, null, 0);
                }
                class95.field2247.method1128(-17306, this, 1);
            } else {
                class158.field3644++;
                if (class158.field3644 >= 3) {
                    this.method243(false, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class23.method212(null, (byte) 111, var8);
            this.method243(false, "crash");
        }
    }

    @OriginalMember(owner = "client!e", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field699++;
        if (class67.field1556 != this || class122.field2822) {
            return;
        }
        class65.field1491 = true;
        if (class152.field3440 != null && class152.field3440.startsWith("1.5") && class120.method945(20794) - class79.field1924 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class4.field64 <= var2.width && class82.field1981 <= var2.height) {
                class133.field3042 = true;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public final synchronized void method249(boolean arg0) {
        Container var2;
        if (class87.field2117 == null) {
            var2 = class95.field2247.field3430;
        } else {
            var2 = class87.field2117;
        }
        field669++;
        if (class4.field70 != null) {
            class4.field70.removeFocusListener(this);
            var2.remove(class4.field70);
        }
        class4.field70 = new class100(this);
        var2.add(class4.field70);
        class4.field70.setSize(class4.field64, class82.field1981);
        class4.field70.setVisible(true);
        if (class87.field2117 == null) {
            class4.field70.setLocation(0, 0);
        } else {
            Insets var3 = class87.field2117.getInsets();
            class4.field70.setLocation(var3.left, var3.top);
        }
        class4.field70.addFocusListener(this);
        class4.field70.requestFocus();
        class65.field1491 = arg0;
        class133.field3042 = false;
        class79.field1924 = class120.method945(20794);
    }

    @OriginalMember(owner = "client!e", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field704++;
        if (class87.field2117 == null) {
            return class95.field2247 == null || class95.field2247.field3430 == this ? super.getAppletContext() : class95.field2247.field3430.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    private final void method250(int arg0) {
        long var2 = class56.field1318[class84.field2019];
        long var4 = class120.method945(20794);
        class56.field1318[class84.field2019] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class1.field23 = ((var6 >> 1) + 32000) / var6;
        }
        class84.field2019 = class84.field2019 + 1 & 0x1F;
        field680++;
        if (class48.field1168++ > 50) {
            class65.field1491 = true;
            class48.field1168 -= 50;
            class4.field70.setSize(class4.field64, class82.field1981);
            class4.field70.setVisible(true);
            if (class87.field2117 == null) {
                class4.field70.setLocation(0, 0);
            } else {
                Insets var7 = class87.field2117.getInsets();
                class4.field70.setLocation(var7.left, var7.top);
            }
        }
        if (arg0 == 8308) {
            this.method195(2);
        }
    }

    @OriginalMember(owner = "client!e", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field693++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!e", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field694++;
        if (class87.field2117 == null) {
            return class95.field2247 == null || class95.field2247.field3430 == this ? super.getDocumentBase() : class95.field2247.field3430.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class83.field1997 = true;
        class65.field1491 = true;
        field686++;
    }

    @OriginalMember(owner = "client!e", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field670++;
        if (class87.field2117 == null) {
            return class95.field2247 == null || class95.field2247.field3430 == this ? super.getParameter(arg0) : class95.field2247.field3430.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field673++;
    }

    @OriginalMember(owner = "client!e", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field671++;
        if (class67.field1556 == this && !class122.field2822) {
            class74.field1837 = class120.method945(20794);
            class139.method1042(-124, 5000L);
            class144.field3238 = null;
            this.method240((byte) 5);
        }
    }
}
