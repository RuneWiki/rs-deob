import jagex3.jagmisc.jagmisc;
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

@OriginalClass("client!cm")
public abstract class class522 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "Z")
    private boolean field7631 = false;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "Z")
    private boolean field7617 = false;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "[Lwp;")
    public static class122[] field7633 = new class122[5];

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field7648;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cm", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field7644;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "Z")
    public static boolean field7645;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "Z")
    public static boolean field7647;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "Z")
    public static boolean field7649;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    private final void method3095(int arg0) {
        if (arg0 != -11731) {
            this.method3105(-40, -49, -80, -72, (byte) -29);
        }
        field7616++;
        long var2 = class165.method1188((byte) 26);
        long var4 = class245.field3673[class238.field3600];
        class245.field3673[class238.field3600] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class238.field3600 = class238.field3600 + 1 & 0x1F;
        synchronized (this) {
            class111.field1640 = class180.field2665;
        }
        this.method1394((byte) 63);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public abstract void method1383(int arg0);

    @OriginalMember(owner = "client!cm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class180.field2665 = true;
        field7634++;
        class304.field4511 = true;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
    public abstract void method1379(int arg0);

    @OriginalMember(owner = "client!cm", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field7637++;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
    public static void method3096(int arg0) {
        if (arg0 == -22095) {
            field7633 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field7624++;
        if (class15.field178 != this || class4.field20) {
            return;
        }
        class304.field4511 = true;
        if (class328.field4821 && class165.method1188((byte) 26) - class72.field1163 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class228.field3431 <= var2.width && class299.field4463 <= var2.height) {
                class487.field7053 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!cm", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field7629++;
    }

    @OriginalMember(owner = "client!cm", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field7614++;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
    private final void method3097(int arg0) {
        field7643++;
        long var2 = class165.method1188((byte) 26);
        long var4 = class327.field4813[class86.field1399];
        class327.field4813[class86.field1399] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class264.field3984 = ((var6 >> 1) + 32000) / var6;
        }
        class86.field1399 = class86.field1399 + 1 & 0x1F;
        if ((class403.field5727++) > 50) {
            class403.field5727 -= 50;
            class304.field4511 = true;
            class481.field6991.setSize(class50.field927, class76.field1247);
            class481.field6991.setVisible(true);
            if (class70.field1153 != null && class230.field3443 == null) {
                Insets var7 = class70.field1153.getInsets();
                class481.field6991.setLocation(class360.field5250 + var7.left, class245.field3670 + var7.top);
            } else {
                class481.field6991.setLocation(class360.field5250, class245.field3670);
            }
        }
        this.method1383(-12690);
        if (arg0 >= -28) {
            this.getDocumentBase();
        }
    }

    @OriginalMember(owner = "client!cm", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field7615++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)Z")
    public final boolean method3098(int arg0) {
        if (arg0 != -49) {
            this.destroy();
        }
        field7640++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
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
                this.method3101("invalidhost", 3);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)V")
    public abstract void method1386(int arg0);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Ljava/lang/String;")
    public String method1374(byte arg0) {
        if (arg0 == -113) {
            field7636++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBZIILjava/lang/String;II)V")
    public final void method3099(int arg0, byte arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class76.field1247 = arg7;
            class299.field4463 = arg7;
            class360.field5250 = 0;
            class13.field136 = arg3;
            class50.field927 = arg6;
            class228.field3431 = arg6;
            class15.field178 = this;
            class245.field3670 = 0;
            class70.field1153 = new Frame();
            class70.field1153.setTitle("Jagex");
            class70.field1153.setResizable(true);
            class70.field1153.addWindowListener(this);
            class70.field1153.setVisible(true);
            class70.field1153.toFront();
            Insets var9 = class70.field1153.getInsets();
            if (arg1 > -71) {
                return;
            }
            class70.field1153.setSize(class228.field3431 + var9.left + var9.right, class299.field4463 - -var9.top + var9.bottom);
            class366.field5301 = class280.field4173 = new class411(null, arg0, arg5, arg4);
            class81 var10 = class280.field4173.method2436(this, 24305, 1);
            while (var10.field1314 == 0) {
                class477.method2826(10L, 0);
            }
        } catch (Exception var12) {
            class266.method1710((byte) 81, var12, null);
        }
        field7626++;
    }

    @OriginalMember(owner = "client!cm", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label113: {
                if (class411.field5811 != null) {
                    String var1 = class411.field5811.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class411.field5816;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method3101("wrongjava", 3);
                            break label113;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class411.field5816 == null || class411.field5816.equals("1.4.2"))) {
                        this.method3101("wrongjava", 3);
                        break label113;
                    }
                }
                if (class411.field5816 != null && class411.field5816.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class411.field5816.length() > var3) {
                        char var5 = class411.field5816.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var5 - (48 - var4 * 10);
                        var3++;
                    }
                    if (var4 >= 5) {
                        class328.field4821 = true;
                    }
                }
                if (class280.field4173.field5824 != null) {
                    Method var6 = class411.field5826;
                    if (var6 != null) {
                        try {
                            var6.invoke(class280.field4173.field5824, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class202.method1398((byte) 85);
                class242.method1595(0);
                this.method3100(44);
                this.method3103(4);
                this.method1376((byte) 87);
                class375.field5394 = class134.method978(657);
                this.method3103(4);
                while (class333.field4942 == 0L || class165.method1188((byte) 26) < class333.field4942) {
                    class96.field1524 = class375.field5394.method536(16711935, class519.field7579);
                    for (int var7 = 0; var7 < class96.field1524; var7++) {
                        this.method3095(-11731);
                    }
                    this.method3097(-51);
                    class117.method846(0, class481.field6991, class280.field4173);
                }
            }
        } catch (Throwable var10) {
            class266.method1710((byte) 81, var10, this.method1374((byte) -113));
            this.method3101("crash", 3);
        }
        field7632++;
        this.method3102(-30104, true);
    }

    @OriginalMember(owner = "client!cm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field7639++;
        class180.field2665 = false;
    }

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "(I)V")
    public final synchronized void method3100(int arg0) {
        if (class481.field6991 != null) {
            class481.field6991.removeFocusListener(this);
            class481.field6991.getParent().remove(class481.field6991);
        }
        field7635++;
        Container var2;
        if (class230.field3443 != null) {
            var2 = class230.field3443;
        } else if (class70.field1153 == null) {
            var2 = class280.field4173.field5824;
        } else {
            var2 = class70.field1153;
        }
        var2.setLayout(null);
        class481.field6991 = new class254(this);
        var2.add(class481.field6991);
        class481.field6991.setSize(class50.field927, class76.field1247);
        class481.field6991.setVisible(true);
        if (class70.field1153 == var2) {
            Insets var3 = class70.field1153.getInsets();
            class481.field6991.setLocation(class360.field5250 + var3.left, class245.field3670 + var3.top);
        } else {
            class481.field6991.setLocation(class360.field5250, class245.field3670);
        }
        class481.field6991.addFocusListener(this);
        class481.field6991.requestFocus();
        if (arg0 <= 36) {
            return;
        }
        class111.field1640 = true;
        class180.field2665 = true;
        class304.field4511 = true;
        class487.field7053 = false;
        class72.field1163 = class165.method1188((byte) 26);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method3101(String arg0, int arg1) {
        field7618++;
        if (this.field7631) {
            return;
        }
        if (arg1 != 3) {
            this.focusLost(null);
        }
        this.field7631 = true;
        System.out.println("error_game_" + arg0);
        try {
            class325.method2066(class280.field4173.field5824, (byte) -68, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
    public abstract void method1394(byte arg0);

    @OriginalMember(owner = "client!cm", name = "providesignlink", descriptor = "(Lul;)V")
    public static final void providesignlink(class411 arg0) {
        field7621++;
        class280.field4173 = arg0;
        class366.field5301 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field7610++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)V")
    private final void method3102(int arg0, boolean arg1) {
        field7625++;
        synchronized (this) {
            if (class4.field20) {
                return;
            }
            class4.field20 = true;
        }
        if (class280.field4173.field5824 != null) {
            class280.field4173.field5824.destroy();
        }
        try {
            this.method1386(29);
        } catch (Exception var11) {
        }
        if (this.field7617) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field7617 = false;
        }
        class493.method2894(0, true);
        class81 var4 = class280.field4173.method2443(class15.field178.getClass(), 0);
        while (var4.field1314 == 0) {
            class477.method2826(100L, 0);
        }
        if (class481.field6991 != null) {
            try {
                class481.field6991.removeFocusListener(this);
                class481.field6991.getParent().remove(class481.field6991);
            } catch (Exception var9) {
            }
        }
        if (class280.field4173 != null) {
            try {
                class280.field4173.method2451(false);
            } catch (Exception var8) {
            }
        }
        this.method1379(64);
        if (arg0 != -30104) {
            this.method1383(124);
        }
        if (class70.field1153 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!cm", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field7628++;
        if (class70.field1153 == null) {
            return class280.field4173 == null || class280.field4173.field5824 == this ? super.getDocumentBase() : class280.field4173.field5824.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field7642++;
        this.destroy();
    }

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "(I)V")
    public final void method3103(int arg0) {
        field7611++;
        if (arg0 != 4) {
            field7633 = null;
        }
        if (this.field7617) {
            return;
        }
        try {
            class81 var2 = class280.field4173.method2461(class15.field178.getClass(), -4);
            while (var2.field1314 == 0) {
                class477.method2826(100L, 0);
            }
            if (var2.field1311 != null) {
                throw (Throwable) var2.field1311;
            }
            jagmisc.init();
            this.field7617 = true;
            class375.field5394 = class134.method978(arg0 ^ 0x295);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!cm", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field7613++;
        if (class70.field1153 == null) {
            return class280.field4173 == null || class280.field4173.field5824 == this ? super.getParameter(arg0) : class280.field4173.field5824.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "stop", descriptor = "()V")
    public final void stop() {
        field7641++;
        if (class15.field178 == this && !class4.field20) {
            class333.field4942 = class165.method1188((byte) 26) + 4000L;
        }
    }

    @OriginalMember(owner = "client!cm", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field7612++;
        if (class70.field1153 == null) {
            return class280.field4173 == null || class280.field4173.field5824 == this ? super.getCodeBase() : class280.field4173.field5824.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field7609++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBLqa;)Z")
    public static final boolean method3104(int arg0, byte arg1, class167 arg2) {
        field7619++;
        int var3 = (class69.field1139 - 104) / 2;
        int var4 = (class255.field3763 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var52 = var4; var52 < var4 + 104; var52++) {
                for (int var53 = arg0; var53 <= 3; var53++) {
                    if (class380.method2312(var6, var53, var52, (byte) -85, arg0)) {
                        int var54 = var53;
                        if (class195.method1322(var6, var52, 28946)) {
                            var54 = var53 - 1;
                        }
                        if (var54 >= 0) {
                            var5 &= class79.method606(var54, var6, 96, var52);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class524.field7654 = arg2.method284(var7, 0, 512, 512, 512);
        int var9 = 26 / ((6 - arg1) / 55);
        class245.method1609(2048);
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
        int var11 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xA82CFF00) << 16;
        int var12 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var13 = new boolean[class336.field4975][class336.field4975];
        for (int var14 = var3; var14 < (var3 + 104); var14 += class336.field4975) {
            for (int var37 = var4; var37 < var4 + 104; var37 += class336.field4975) {
                arg2.method345(0, 0, class336.field4975 * 4, class336.field4975 * 4);
                arg2.method233(-16777216);
                for (int var38 = arg0; var38 <= 3; var38++) {
                    for (int var45 = 0; var45 < class336.field4975; var45++) {
                        for (int var51 = 0; var51 < class336.field4975; var51++) {
                            var13[var45][var51] = class380.method2312(var14 + var45, var38, var37 + var51, (byte) -85, arg0);
                        }
                    }
                    class393.field5594[var38].method146(0, 0, 1024, var14, var37, var14 + class336.field4975, var37 - -class336.field4975, var13);
                    if (!class358.field5202) {
                        for (int var46 = -4; var46 < class336.field4975; var46++) {
                            for (int var47 = -4; var47 < class336.field4975; var47++) {
                                int var48 = var14 + var46;
                                int var49 = var37 + var47;
                                if (var3 <= var48 && var4 <= var49 && class380.method2312(var48, var38, var49, (byte) -85, arg0)) {
                                    int var50 = var38;
                                    if (class195.method1322(var48, var49, 28946)) {
                                        var50 = var38 - 1;
                                    }
                                    if (var50 >= 0) {
                                        class84.method618(var48, var10, var49, (class336.field4975 - var47) * 4 - 4, var11, arg2, (byte) 77, var50, var46 * 4);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class358.field5202) {
                    class159 var39 = class19.field213[arg0];
                    for (int var40 = 0; var40 < class336.field4975; var40++) {
                        for (int var41 = 0; var41 < class336.field4975; var41++) {
                            int var42 = var14 + var40;
                            int var43 = var37 + var41;
                            int var44 = var39.field2427[var42 - var39.field2440][var43 - var39.field2437];
                            if ((var44 & 0x40240000) != 0) {
                                arg2.method1193(1, (class336.field4975 - var41) * 4 - 4, var40 * 4, 4, 4, -1713569622);
                            } else if ((var44 & 0x800000) != 0) {
                                arg2.method1191((class336.field4975 - var41) * 4 - 4, -1713569622, -256, var40 * 4, 4);
                            } else if ((var44 & 0x2000000) != 0) {
                                arg2.method1199((class336.field4975 - var41) * 4 - 4, -1713569622, var40 * 4 + 3, 17136, 4);
                            } else if ((var44 & 0x8000000) != 0) {
                                arg2.method1191((class336.field4975 - var41) * 4 + 3 - 4, -1713569622, -256, var40 * 4, 4);
                            } else if ((var44 & 0x20000000) != 0) {
                                arg2.method1199((class336.field4975 - var41) * 4 - 4, -1713569622, var40 * 4, 17136, 4);
                            }
                        }
                    }
                }
                arg2.method215(0, 0, class336.field4975 * 4, class336.field4975 * 4, var12, 2);
                class524.field7654.method365((var14 - var3) * 4 + 48, -((var37 - var4) * 4) - class336.field4975 * 4 + 464, class336.field4975 * 4, class336.field4975 * 4, 0, 0);
            }
        }
        arg2.method179();
        arg2.method233(-16777215);
        class531.method3148(-73);
        class58.field1051 = 0;
        class13.field142.method861(-1);
        if (!class358.field5202) {
            for (int var15 = var3; var15 < (var3 + 104); var15++) {
                for (int var21 = var4; var21 < var4 + 104; var21++) {
                    for (int var22 = arg0; arg0 + 1 >= var22 && var22 <= 3; var22++) {
                        if (class380.method2312(var15, var22, var21, (byte) -85, arg0)) {
                            class534 var23 = (class534) class388.method2347(var22, var15, var21);
                            if (var23 == null) {
                                var23 = (class534) class413.method2470(var22, var15, var21, field7644 == null ? (field7644 = method3106("wo")) : field7644);
                            }
                            if (var23 == null) {
                                var23 = (class534) class500.method2921(var22, var15, var21);
                            }
                            if (var23 == null) {
                                var23 = (class534) class415.method2475(var22, var15, var21);
                            }
                            if (var23 != null) {
                                class261 var24 = class277.field4139.method569((byte) 65, var23.method561((byte) -85));
                                if (!var24.field3873 || class258.field3827) {
                                    int var25 = var24.field3878;
                                    if (var24.field3926 != null) {
                                        for (int var26 = 0; var26 < var24.field3926.length; var26++) {
                                            if (var24.field3926[var26] != -1) {
                                                class261 var27 = class277.field4139.method569((byte) 66, var24.field3926[var26]);
                                                if (var27.field3878 >= 0) {
                                                    var25 = var27.field3878;
                                                }
                                            }
                                        }
                                    }
                                    if (var25 >= 0) {
                                        boolean var28 = false;
                                        if (var25 >= 0) {
                                            class463 var29 = class506.field7320.method1429(var25, -3708);
                                            if (var29 != null && var29.field6713) {
                                                var28 = true;
                                            }
                                        }
                                        int var30 = var15;
                                        int var31 = var21;
                                        if (var28) {
                                            int[][] var32 = class19.field213[var22].field2427;
                                            int var33 = class19.field213[var22].field2440;
                                            int var34 = class19.field213[var22].field2437;
                                            for (int var35 = 0; var35 < 10; var35++) {
                                                int var36 = (int) (Math.random() * 4.0D);
                                                if (var36 == 0 && var30 > var3 && var30 > (var15 - 3) && (var32[var30 - var33 - 1][var31 - var34] & 0x2C0108) == 0) {
                                                    var30--;
                                                }
                                                if (var36 == 1 && var30 < var3 + 104 - 1 && var30 < var15 + 3 && (var32[var30 + 1 - var33][var31 - var34] & 0x2C0180) == 0) {
                                                    var30++;
                                                }
                                                if (var36 == 2 && var31 > var4 && var31 > (var21 - 3) && (var32[var30 - var33][var31 - var34 - 1] & 0x2C0102) == 0) {
                                                    var31--;
                                                }
                                                if (var36 == 3 && var31 < var4 + 104 - 1 && var31 < var21 + 3 && (var32[var30 - var33][var31 + 1 - var34] & 0x2C0120) == 0) {
                                                    var31++;
                                                }
                                            }
                                        }
                                        class57.field1017[class58.field1051] = var24.field3882;
                                        class80.field1308[class58.field1051] = var30;
                                        class329.field4841[class58.field1051] = var31;
                                        class58.field1051++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class136.field2109 != null) {
                class468.field6795.field4741 = 1;
                class506.field7320.method1430(64, 1024, -28705);
                for (int var16 = 0; var16 < class136.field2109.field1994; var16++) {
                    int var17 = class136.field2109.field1995[var16];
                    if ((var17 >> 28) == class364.field5293.field6956) {
                        int var18 = ((var17 & 0xFFFC5E7) >> 14) - class82.field1315;
                        int var19 = (var17 & 0x3FFF) - class501.field7240;
                        if (var18 >= 0 && var18 < class69.field1139 && var19 >= 0 && class255.field3763 > var19) {
                            class13.field142.method866((byte) 10, new class175(var16));
                        } else {
                            class463 var20 = class506.field7320.method1429(class136.field2109.field1993[var16], -3708);
                            if (var20.field6697 != null && var20.field6714 + var18 >= 0 && class69.field1139 > var20.field6694 + var18 && var20.field6733 + var19 >= 0 && var20.field6702 + var19 < class255.field3763) {
                                class13.field142.method866((byte) 10, new class175(var16));
                            }
                        }
                    }
                }
                class506.field7320.method1430(64, 128, -28705);
                class468.field6795.field4741 = 2;
                class468.field6795.method2034(-1);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cm", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field7622++;
        if (class70.field1153 == null) {
            return class280.field4173 == null || class280.field4173.field5824 == this ? super.getAppletContext() : class280.field4173.field5824.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "start", descriptor = "()V")
    public final void start() {
        field7627++;
        if (class15.field178 == this && !class4.field20) {
            class333.field4942 = 0L;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)V")
    public abstract void method1376(byte arg0);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIB)V")
    public final void method3105(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field7620++;
        try {
            if (class15.field178 == null) {
                class245.field3670 = 0;
                class76.field1247 = arg0;
                class299.field4463 = arg0;
                class360.field5250 = 0;
                class15.field178 = this;
                class13.field136 = arg3;
                class50.field927 = arg2;
                class228.field3431 = arg2;
                if (class280.field4173 == null) {
                    class366.field5301 = class280.field4173 = new class411(this, arg1, null, 0);
                }
                class81 var6 = class280.field4173.method2436(this, 24305, 1);
                int var7 = 124 / ((arg4 - 11) / 44);
                while (var6.field1314 == 0) {
                    class477.method2826(10L, 0);
                }
            } else {
                class389.field5529++;
                if (class389.field5529 >= 3) {
                    this.method3101("alreadyloaded", 3);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var9) {
            class266.method1710((byte) 81, var9, null);
            this.method3101("crash", 3);
        }
    }

    @OriginalMember(owner = "client!cm", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field7630++;
        if (class15.field178 == this && !class4.field20) {
            class333.field4942 = class165.method1188((byte) 26);
            class477.method2826(5000L, 0);
            class366.field5301 = null;
            this.method3102(-30104, false);
        }
    }

    @OriginalMember(owner = "client!cm", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field7623++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3106(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        for (int var0 = 0; var0 < field7633.length; var0++) {
            field7633[var0] = new class122();
        }
        field7638 = -1;
    }
}
