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

@OriginalClass("client!gk")
public abstract class class255 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Z")
    private boolean field3705 = false;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Z")
    private boolean field3717 = false;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field3722 = 0;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "Z")
    public static boolean field3741;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "Z")
    public static boolean field3742;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "Z")
    public static boolean field3743;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "Z")
    public static boolean field3744;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "Z")
    public static boolean field3745;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 3)
    private final void method1598(byte arg0) {
        field3731++;
        long var2 = class55.method375(-3913);
        long var4 = class100.field1346[class432.field6377];
        class100.field1346[class432.field6377] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class33.field551 = ((var6 >> 1) + 32000) / var6;
        }
        class432.field6377 = class432.field6377 + 1 & 0x1F;
        if ((class66.field944++) > 50) {
            class395.field5927 = true;
            class66.field944 -= 50;
            class319.field4561.setSize(class345.field5120, class274.field4034);
            class319.field4561.setVisible(true);
            if (class238.field3346 != null && class106.field1428 == null) {
                Insets var7 = class238.field3346.getInsets();
                class319.field4561.setLocation(class367.field5459 + var7.left, class7.field68 + var7.top);
            } else {
                class319.field4561.setLocation(class367.field5459, class7.field68);
            }
        }
        if (arg0 == -11) {
            this.method1582((byte) -88);
        }
    }

    @OriginalMember(owner = "client!gk", name = "stop", descriptor = "()V", line = 50)
    public final void stop() {
        field3734++;
        if (class116.field1570 == this && !class337.field4977) {
            class77.field1057 = class55.method375(-3913) + 4000L;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBIII)V", line = 61)
    public final void method1599(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3711++;
        try {
            if (class116.field1570 == null) {
                class367.field5459 = 0;
                class345.field5120 = arg3;
                class100.field1338 = arg3;
                class7.field68 = 0;
                class116.field1570 = this;
                class274.field4034 = arg0;
                class384.field5739 = arg0;
                class413.field6167 = arg4;
                int var6 = -24 / ((arg1 + 22) / 36);
                if (class361.field5285 == null) {
                    class363.field5304 = class361.field5285 = new class2(this, arg2, (String) null, 0);
                }
                class296 var7 = class361.field5285.method25((byte) 107, this, 1);
                while (var7.field4259 == 0) {
                    class404.method2628(-37, 10L);
                }
            } else {
                class171.field2256++;
                if (class171.field2256 >= 3) {
                    this.method1608(1, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class226.method1406((String) null, var9, 0);
            this.method1608(1, "crash");
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 110)
    public static final void method1600(byte arg0) {
        field3736++;
        if (arg0 != 63) {
            return;
        }
        if (class91.field1254 && class1.field5[81] && class10.field97 > 2) {
            class237.method1449((class259) class373.field5574.field6108.field5898.field5898, 94);
        } else {
            class237.method1449((class259) class373.field5574.field6108.field5898, 80);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 130)
    public final void method1601(int arg0) {
        field3715++;
        if (!this.field3717) {
            try {
                class296 var2 = class361.field5285.method27(98, class116.field1570.getClass());
                while (var2.field4259 == 0) {
                    class404.method2628(-80, 100L);
                }
                if (var2.field4262 != null) {
                    throw (Throwable) var2.field4262;
                }
                jagmisc.init();
                this.field3717 = true;
                class232.field3272 = class324.method2003(0);
            } catch (Throwable var3) {
            }
        }
        if (arg0 > -17) {
            this.field3717 = true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)I", line = 161)
    public static final int method1602(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            field3722 = 108;
        }
        field3719++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 184)
    public final void update(Graphics arg0) {
        field3726++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!gk", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 193)
    public final void windowActivated(WindowEvent arg0) {
        field3735++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BIIIIZILjava/lang/String;)V", line = 200)
    public final void method1603(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, String arg7) {
        try {
            class345.field5120 = arg6;
            class100.field1338 = arg6;
            class367.field5459 = 0;
            class413.field6167 = arg1;
            class274.field4034 = arg4;
            class384.field5739 = arg4;
            class7.field68 = 0;
            class116.field1570 = this;
            class238.field3346 = new Frame();
            class238.field3346.setTitle("Jagex");
            class238.field3346.setResizable(true);
            class238.field3346.addWindowListener(this);
            class238.field3346.setVisible(true);
            class238.field3346.toFront();
            Insets var9 = class238.field3346.getInsets();
            class238.field3346.setSize(class100.field1338 + var9.right + var9.left, class384.field5739 - -var9.top - -var9.bottom);
            class363.field5304 = class361.field5285 = new class2((Applet) null, arg3, arg7, arg2);
            class296 var10 = class361.field5285.method25((byte) 107, this, 1);
            if (arg0 != 39) {
                this.stop();
            }
            while (var10.field4259 == 0) {
                class404.method2628(-128, 10L);
            }
        } catch (Exception var12) {
            class226.method1406((String) null, var12, 0);
        }
        field3707++;
    }

    @OriginalMember(owner = "client!gk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 242)
    public final void focusGained(FocusEvent arg0) {
        field3713++;
        class196.field2806 = true;
        class395.field5927 = true;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V", line = 253)
    private final void method1604(byte arg0) {
        field3729++;
        long var2 = class55.method375(-3913);
        long var4 = class34.field561[class392.field5872];
        class34.field561[class392.field5872] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class392.field5872 = class392.field5872 + 1 & 0x1F;
        synchronized (this) {
            class123.field1648 = class196.field2806;
        }
        this.method1568((byte) 77);
        if (arg0 != -22) {
            this.windowActivated((WindowEvent) null);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 284)
    public final synchronized void method1605(int arg0) {
        if (class319.field4561 != null) {
            class319.field4561.removeFocusListener(this);
            class319.field4561.getParent().remove(class319.field4561);
        }
        field3725++;
        Container var2;
        if (class106.field1428 != null) {
            var2 = class106.field1428;
        } else if (class238.field3346 == null) {
            var2 = class361.field5285.field29;
        } else {
            var2 = class238.field3346;
        }
        var2.setLayout((LayoutManager) null);
        class319.field4561 = new class409(this);
        var2.add(class319.field4561);
        class319.field4561.setSize(class345.field5120, class274.field4034);
        class319.field4561.setVisible(true);
        if (arg0 != -15896) {
            this.field3705 = true;
        }
        if (class238.field3346 == var2) {
            Insets var3 = class238.field3346.getInsets();
            class319.field4561.setLocation(var3.left + class367.field5459, class7.field68 + var3.top);
        } else {
            class319.field4561.setLocation(class367.field5459, class7.field68);
        }
        class319.field4561.addFocusListener(this);
        class319.field4561.requestFocus();
        class196.field2806 = true;
        class123.field1648 = true;
        class395.field5927 = true;
        class220.field3134 = false;
        class139.field1862 = class55.method375(-3913);
    }

    @OriginalMember(owner = "client!gk", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 337)
    public final URL getCodeBase() {
        field3712++;
        if (class238.field3346 == null) {
            return class361.field5285 == null || class361.field5285.field29 == this ? super.getCodeBase() : class361.field5285.field29.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 353)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3740++;
    }

    @OriginalMember(owner = "client!gk", name = "destroy", descriptor = "()V", line = 363)
    public final void destroy() {
        field3723++;
        if (class116.field1570 == this && !class337.field4977) {
            class77.field1057 = class55.method375(-3913);
            class404.method2628(-56, 5000L);
            class363.field5304 = null;
            this.method1606(false, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!gk", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 377)
    public final void windowOpened(WindowEvent arg0) {
        field3732++;
    }

    @OriginalMember(owner = "client!gk", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 384)
    public final void windowDeiconified(WindowEvent arg0) {
        field3727++;
    }

    @OriginalMember(owner = "client!gk", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 392)
    public final AppletContext getAppletContext() {
        field3710++;
        if (class238.field3346 == null) {
            return class361.field5285 == null || class361.field5285.field29 == this ? super.getAppletContext() : class361.field5285.field29.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZB)V", line = 406)
    private final void method1606(boolean arg0, byte arg1) {
        field3739++;
        synchronized (this) {
            if (class337.field4977) {
                return;
            }
            class337.field4977 = true;
        }
        if (class361.field5285.field29 != null) {
            class361.field5285.field29.destroy();
        }
        try {
            this.method1564(2);
        } catch (Exception var11) {
        }
        if (this.field3717) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3717 = false;
        }
        if (arg1 > -56) {
            return;
        }
        class296 var4 = class361.field5285.method21(class116.field1570.getClass(), 97);
        while (var4.field4259 == 0) {
            class404.method2628(-87, 100L);
        }
        if (class319.field4561 != null) {
            try {
                class319.field4561.removeFocusListener(this);
                class319.field4561.getParent().remove(class319.field4561);
            } catch (Exception var9) {
            }
        }
        if (class361.field5285 != null) {
            try {
                class361.field5285.method30(0);
            } catch (Exception var8) {
            }
        }
        this.method1578(-4187);
        if (class238.field3346 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)V", line = 484)
    public static final void method1607(byte arg0) {
        if (arg0 >= -123) {
            method1602(-123, 37, -119, 2);
        }
        class146[] var1 = class308.field4401;
        synchronized (class308.field4401) {
            int var2 = 0;
            while (true) {
                if (class308.field4401.length <= var2) {
                    break;
                }
                class308.field4401[var2] = new class146();
                class151.field1980[var2] = 0;
                var2++;
            }
        }
        field3720++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 509)
    public final void method1608(int arg0, String arg1) {
        field3708++;
        if (arg0 != 1) {
            field3722 = -97;
        }
        if (this.field3705) {
            return;
        }
        this.field3705 = true;
        System.out.println("error_game_" + arg1);
        try {
            class67.method434(class361.field5285.field29, (byte) -100, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!gk", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 545)
    public final String getParameter(String arg0) {
        field3718++;
        if (class238.field3346 == null) {
            return class361.field5285 == null || class361.field5285.field29 == this ? super.getParameter(arg0) : class361.field5285.field29.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "providesignlink", descriptor = "(Lud;)V", line = 559)
    public static final void providesignlink(class2 arg0) {
        field3709++;
        class361.field5285 = arg0;
        class363.field5304 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "start", descriptor = "()V", line = 567)
    public final void start() {
        field3721++;
        if (class116.field1570 == this && !class337.field4977) {
            class77.field1057 = 0L;
        }
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(B)Z", line = 588)
    public final boolean method1609(byte arg0) {
        field3716++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 != -61) {
            return false;
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
                this.method1608(1, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 623)
    public final void focusLost(FocusEvent arg0) {
        field3738++;
        class196.field2806 = false;
    }

    @OriginalMember(owner = "client!gk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 635)
    public final synchronized void paint(Graphics arg0) {
        field3706++;
        if (class116.field1570 != this || class337.field4977) {
            return;
        }
        class395.field5927 = true;
        if (class246.field3433 && (class55.method375(-3913) - class139.field1862) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class100.field1338 <= var2.width && class384.field5739 <= var2.height) {
                class220.field3134 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)Z", line = 664)
    public static final boolean method1610(int arg0) {
        field3733++;
        if (arg0 != 13026) {
            return false;
        }
        if (class231.field3265) {
            try {
                if ((Boolean) class67.method434(class361.field5285.field29, (byte) -100, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 691)
    public final URL getDocumentBase() {
        field3724++;
        if (class238.field3346 == null) {
            return class361.field5285 == null || class361.field5285.field29 == this ? super.getDocumentBase() : class361.field5285.field29.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "run", descriptor = "()V", line = 709)
    public final void run() {
        try {
            label116: {
                if (class2.field13 != null) {
                    String var1 = class2.field13.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class2.field30;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1608(1, "wrongjava");
                            break label116;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class2.field30 == null || class2.field30.equals("1.4.2"))) {
                        this.method1608(1, "wrongjava");
                        break label116;
                    }
                }
                if (class2.field30 != null && class2.field30.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class2.field30.length()) {
                        char var5 = class2.field30.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + (var5 - '0');
                    }
                    if (var4 >= 5) {
                        class246.field3433 = true;
                    }
                }
                if (class361.field5285.field29 != null) {
                    Method var6 = class2.field34;
                    if (var6 != null) {
                        try {
                            var6.invoke(class361.field5285.field29, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class300.method1896(1);
                class34.method279((byte) -61);
                this.method1605(-15896);
                this.method1560(true);
                class232.field3272 = class324.method2003(0);
                this.method1601(-85);
                while (class77.field1057 == 0L || class77.field1057 > class55.method375(-3913)) {
                    class394.field5919 = class232.field3272.method40(class310.field4439, -122);
                    for (int var7 = 0; var7 < class394.field5919; var7++) {
                        this.method1604((byte) -22);
                    }
                    this.method1598((byte) -11);
                    if (class413.field6187 == 1) {
                        class404.method2628(-94, 5L);
                    }
                    client.method1574(class319.field4561, 101, class361.field5285);
                }
            }
        } catch (Exception var10) {
            class226.method1406((String) null, var10, 0);
            this.method1608(1, "crash");
        }
        field3714++;
        this.method1606(true, (byte) -74);
    }

    @OriginalMember(owner = "client!gk", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 830)
    public final void windowClosed(WindowEvent arg0) {
        field3730++;
    }

    @OriginalMember(owner = "client!gk", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 837)
    public final void windowDeactivated(WindowEvent arg0) {
        field3728++;
    }

    @OriginalMember(owner = "client!gk", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 846)
    public final void windowIconified(WindowEvent arg0) {
        field3737++;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)V")
    public abstract void method1568(byte arg0);

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public abstract void method1564(int arg0);

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V")
    public abstract void method1578(int arg0);

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)V")
    public abstract void method1582(byte arg0);

    @OriginalMember(owner = "client!gk", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public abstract void method1560(boolean arg0);
}
