import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class194 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "Z")
    private boolean field3502 = false;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field3509 = 0;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "[I")
    public static int[] field3511 = new int[2048];

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[Z")
    public static boolean[] field3486;

    @OriginalMember(owner = "client!gl", name = "destroy", descriptor = "()V", line = 9)
    public final void destroy() {
        field3505++;
        if (class143.field2518 == this && !class320.field5481) {
            class74.field1135 = class118.method835(-1272);
            class83.method556(5000L, 125);
            class137.field2428 = null;
            this.method1385(false, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 34)
    public final void method1372(String arg0, boolean arg1) {
        field3517++;
        if (this.field3502) {
            return;
        }
        this.field3502 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1) {
                field3493 = -79;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z", line = 61)
    public final boolean method1373(byte arg0) {
        field3518++;
        if (arg0 < 123) {
            return false;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method1372("invalidhost", false);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 97)
    public final void windowClosed(WindowEvent arg0) {
        field3496++;
    }

    @OriginalMember(owner = "client!gl", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 104)
    public final void windowDeactivated(WindowEvent arg0) {
        field3513++;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V", line = 120)
    public final synchronized void method1376(byte arg0) {
        if (class13.field158 != null) {
            class13.field158.removeFocusListener(this);
            class13.field158.getParent().remove(class13.field158);
        }
        field3492++;
        if (arg0 < 49) {
            field3493 = -15;
        }
        Container var2;
        if (class168.field3026 != null) {
            var2 = class168.field3026;
        } else if (class273.field4805 == null) {
            var2 = class289.field5052.field2441;
        } else {
            var2 = class273.field4805;
        }
        var2.setLayout((LayoutManager) null);
        class13.field158 = new class70(this);
        var2.add(class13.field158);
        class13.field158.setSize(class73.field1110, class21.field331);
        class13.field158.setVisible(true);
        if (class273.field4805 == var2) {
            Insets var3 = class273.field4805.getInsets();
            class13.field158.setLocation(class81.field1266 + var3.left, class87.field1379 + var3.top);
        } else {
            class13.field158.setLocation(class81.field1266, class87.field1379);
        }
        class13.field158.addFocusListener(this);
        class13.field158.requestFocus();
        class47.field699 = true;
        class249.field4354 = true;
        class291.field5086 = true;
        class126.field2126 = false;
        class260.field4581 = class118.method835(-1272);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V", line = 168)
    public static void method1377(byte arg0) {
        field3486 = null;
        field3511 = null;
        int var1 = 69 / ((-arg0 - 12) / 63);
    }

    @OriginalMember(owner = "client!gl", name = "start", descriptor = "()V", line = 181)
    public final void start() {
        field3510++;
        if (class143.field2518 == this && !class320.field5481) {
            class74.field1135 = 0L;
        }
    }

    @OriginalMember(owner = "client!gl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 195)
    public final void focusGained(FocusEvent arg0) {
        class249.field4354 = true;
        field3495++;
        class291.field5086 = true;
    }

    @OriginalMember(owner = "client!gl", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 205)
    public final void windowActivated(WindowEvent arg0) {
        field3487++;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V", line = 219)
    private final void method1379(byte arg0) {
        long var2 = class118.method835(-1272);
        field3512++;
        long var4 = class229.field3993[class168.field3017];
        class229.field3993[class168.field3017] = var2;
        if (arg0 <= 18) {
            this.method1376((byte) 63);
        }
        if (var4 != 0L && var4 < var2) {
        }
        class168.field3017 = class168.field3017 + 1 & 0x1F;
        synchronized (this) {
            class47.field699 = class249.field4354;
        }
        this.method1375(2);
    }

    @OriginalMember(owner = "client!gl", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 254)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3491++;
    }

    @OriginalMember(owner = "client!gl", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 262)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3515++;
    }

    @OriginalMember(owner = "client!gl", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 272)
    public final URL getCodeBase() {
        field3507++;
        if (class273.field4805 == null) {
            return class289.field5052 == null || class289.field5052.field2441 == this ? super.getCodeBase() : class289.field5052.field2441.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 286)
    public final String getParameter(String arg0) {
        field3500++;
        if (class273.field4805 == null) {
            return class289.field5052 == null || class289.field5052.field2441 == this ? super.getParameter(arg0) : class289.field5052.field2441.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V", line = 301)
    public static final void method1382(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class60.field893; var3++) {
            for (int var4 = 0; var4 < class320.field5489; var4++) {
                for (int var5 = 0; var5 < class325.field5535; var5++) {
                    class74 var6 = class99.field1759[var3][var4][var5];
                    if (var6 != null) {
                        class174 var7 = var6.field1117;
                        if (var7 != null && var7.field3183.method1029()) {
                            class13.method86(var7.field3183, var3, var4, var5, 1, 1);
                            if (var7.field3173 != null && var7.field3173.method1029()) {
                                class13.method86(var7.field3173, var3, var4, var5, 1, 1);
                                var7.field3183.method1035(var7.field3173, 0, 0, 0, false);
                                var7.field3173 = var7.field3173.method1031(arg0, arg1, arg2);
                            }
                            var7.field3183 = var7.field3183.method1031(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1119; var8++) {
                            class326 var9 = var6.field1118[var8];
                            if (var9 != null && var9.field5570.method1029()) {
                                class13.method86(var9.field5570, var3, var4, var5, var9.field5568 + 1 - var9.field5575, var9.field5561 - var9.field5576 + 1);
                                var9.field5570 = var9.field5570.method1031(arg0, arg1, arg2);
                            }
                        }
                        class258 var10 = var6.field1141;
                        if (var10 != null && var10.field4557.method1029()) {
                            class136.method934(var10.field4557, var3, var4, var5);
                            var10.field4557 = var10.field4557.method1031(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 371)
    public final AppletContext getAppletContext() {
        field3514++;
        if (class273.field4805 == null) {
            return class289.field5052 == null || class289.field5052.field2441 == this ? super.getAppletContext() : class289.field5052.field2441.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "providesignlink", descriptor = "(Lla;)V", line = 386)
    public static final void providesignlink(class139 arg0) {
        class289.field5052 = arg0;
        class137.field2428 = arg0;
        field3508++;
    }

    @OriginalMember(owner = "client!gl", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 395)
    public final void windowOpened(WindowEvent arg0) {
        field3506++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 405)
    public final void method1383(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field3488++;
        try {
            class46.field689 = arg4;
            class81.field1266 = 0;
            class143.field2518 = this;
            if (arg6 <= 54) {
                return;
            }
            class73.field1110 = arg1;
            class9.field104 = arg1;
            class21.field331 = arg0;
            class297.field5176 = arg0;
            class87.field1379 = 0;
            class273.field4805 = new Frame();
            class273.field4805.setTitle("Jagex");
            class273.field4805.setResizable(true);
            class273.field4805.addWindowListener(this);
            class273.field4805.setVisible(true);
            class273.field4805.toFront();
            Insets var8 = class273.field4805.getInsets();
            class273.field4805.setSize(class9.field104 - (-var8.right - var8.left), class297.field5176 + var8.bottom - -var8.top);
            class137.field2428 = class289.field5052 = new class139((Applet) null, arg5, arg3, arg2);
            class205 var9 = class289.field5052.method954(this, 1, 1);
            while (var9.field3686 == 0) {
                class83.method556(10L, 123);
            }
            class303.field5264 = (Thread) var9.field3685;
        } catch (Exception var11) {
            class171.method1188(64, (String) null, var11);
        }
    }

    @OriginalMember(owner = "client!gl", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 448)
    public final synchronized void paint(Graphics arg0) {
        field3504++;
        if (class143.field2518 != this || class320.field5481) {
            return;
        }
        class291.field5086 = true;
        if (class29.field433 && !class231.field4051 && class118.method835(-1272) - class260.field4581 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class9.field104 <= var2.width && class297.field5176 <= var2.height) {
                class126.field2126 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BIIII)V", line = 472)
    public final void method1384(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3503++;
        try {
            if (class143.field2518 != null) {
                class233.field4122++;
                if (class233.field4122 >= 3) {
                    this.method1372("alreadyloaded", false);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class73.field1110 = arg2;
            class9.field104 = arg2;
            class21.field331 = arg4;
            class297.field5176 = arg4;
            class81.field1266 = 0;
            class87.field1379 = 0;
            if (arg0 != -74) {
                field3509 = 91;
            }
            class46.field689 = arg1;
            class143.field2518 = this;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class132.field2263 = true;
            } else {
                class132.field2263 = false;
            }
            if (class289.field5052 == null) {
                class137.field2428 = class289.field5052 = new class139(this, arg3, (String) null, 0);
            }
            class205 var7 = class289.field5052.method954(this, 1, 1);
            while (var7.field3686 == 0) {
                class83.method556(10L, 123);
            }
            class303.field5264 = (Thread) var7.field3685;
        } catch (Exception var9) {
            class171.method1188(64, (String) null, var9);
            this.method1372("crash", false);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)V", line = 528)
    private final void method1385(boolean arg0, byte arg1) {
        field3516++;
        synchronized (this) {
            if (class320.field5481) {
                return;
            }
            class320.field5481 = true;
        }
        if (class289.field5052.field2441 != null) {
            class289.field5052.field2441.destroy();
        }
        try {
            this.method1374(-31013);
        } catch (Exception var13) {
        }
        if (class13.field158 != null) {
            try {
                class13.field158.removeFocusListener(this);
                class13.field158.getParent().remove(class13.field158);
            } catch (Exception var12) {
            }
        }
        if (class289.field5052 != null) {
            try {
                class289.field5052.method962(0);
            } catch (Exception var11) {
            }
        }
        this.method1381((byte) -112);
        if (class273.field4805 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
        int var9 = -4 % ((16 - arg1) / 62);
    }

    @OriginalMember(owner = "client!gl", name = "run", descriptor = "()V", line = 588)
    public final void run() {
        field3497++;
        try {
            if (class139.field2455 != null) {
                String var1 = class139.field2455.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class139.field2451;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1372("wrongjava", false);
                        return;
                    }
                    class202.field3654 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class139.field2451 == null || class139.field2451.equals("1.4.2"))) {
                    this.method1372("wrongjava", false);
                    return;
                }
            }
            if (class139.field2451 != null && class139.field2451.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (var4 < class139.field2451.length()) {
                    char var5 = class139.field2451.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class29.field433 = true;
                }
            }
            if (class289.field5052.field2441 != null) {
                Method var6 = class139.field2457;
                if (var6 != null) {
                    try {
                        var6.invoke(class289.field5052.field2441, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class92.method622(1829);
            this.method1376((byte) 118);
            class216.field3833 = class172.method1220(0, class73.field1110, class21.field331, class13.field158);
            this.method1380(-3);
            class272.field4751 = class221.method1514(1);
            while (class74.field1135 == 0L || class74.field1135 > class118.method835(-1272)) {
                class91.field1438 = class272.field4751.method141(-4, class167.field3013, class202.field3654);
                for (int var8 = 0; var8 < class91.field1438; var8++) {
                    this.method1379((byte) 53);
                }
                this.method1387(1);
                method1386(class289.field5052, class13.field158, -93);
            }
        } catch (Exception var11) {
            class171.method1188(64, (String) null, var11);
            this.method1372("crash", false);
        }
        this.method1385(true, (byte) 96);
    }

    @OriginalMember(owner = "client!gl", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 695)
    public final URL getDocumentBase() {
        field3494++;
        if (class273.field4805 == null) {
            return class289.field5052 == null || class289.field5052.field2441 == this ? super.getDocumentBase() : class289.field5052.field2441.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 713)
    public final void focusLost(FocusEvent arg0) {
        class249.field4354 = false;
        field3490++;
    }

    @OriginalMember(owner = "client!gl", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 726)
    public final void windowIconified(WindowEvent arg0) {
        field3499++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lla;Ljava/lang/Object;I)V", line = 733)
    public static final void method1386(class139 arg0, Object arg1, int arg2) {
        if (arg2 > -26) {
            return;
        }
        field3498++;
        if (arg0.field2440 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2440.peekEvent() != null; var3++) {
            class83.method556(1L, 124);
        }
        if (arg1 != null) {
            arg0.field2440.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!gl", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 760)
    public final void windowDeiconified(WindowEvent arg0) {
        field3489++;
    }

    @OriginalMember(owner = "client!gl", name = "stop", descriptor = "()V", line = 769)
    public final void stop() {
        field3485++;
        if (class143.field2518 == this && !class320.field5481) {
            class74.field1135 = class118.method835(-1272) + 4000L;
        }
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V", line = 786)
    private final void method1387(int arg0) {
        long var2 = class118.method835(-1272);
        field3501++;
        long var4 = class52.field775[class129.field2207];
        class52.field775[class129.field2207] = var2;
        class129.field2207 = class129.field2207 + arg0 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class160.field2876 = ((var6 >> 1) + 32000) / var6;
        }
        if (class157.field2837++ > 50) {
            class157.field2837 -= 50;
            class291.field5086 = true;
            class13.field158.setSize(class73.field1110, class21.field331);
            class13.field158.setVisible(true);
            if (class273.field4805 != null && class168.field3026 == null) {
                Insets var7 = class273.field4805.getInsets();
                class13.field158.setLocation(class81.field1266 + var7.left, var7.top - -class87.field1379);
            } else {
                class13.field158.setLocation(class81.field1266, class87.field1379);
            }
        }
        this.method1378(3);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public abstract void method1374(int arg0);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public abstract void method1375(int arg0);

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public abstract void method1378(int arg0);

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public abstract void method1380(int arg0);

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(B)V")
    public abstract void method1381(byte arg0);

    @OriginalMember(owner = "client!gl", name = "init", descriptor = "()V")
    public abstract void init();
}
