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

@OriginalClass("client!gu")
public abstract class class529 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "Z")
    private boolean field7546 = false;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "Z")
    private boolean field7551 = false;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "[I")
    public static int[] field7537 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!gu", name = "L", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!gu", name = "P", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!gu", name = "Q", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!gu", name = "V", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!gu", name = "X", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!gu", name = "Y", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!gu", name = "M", descriptor = "Z")
    public static boolean field7575;

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "Z")
    public static boolean field7576;

    @OriginalMember(owner = "client!gu", name = "R", descriptor = "Z")
    public static boolean field7580;

    @OriginalMember(owner = "client!gu", name = "S", descriptor = "Z")
    public static boolean field7581;

    @OriginalMember(owner = "client!gu", name = "T", descriptor = "Z")
    public static boolean field7582;

    @OriginalMember(owner = "client!gu", name = "U", descriptor = "Z")
    public static boolean field7583;

    @OriginalMember(owner = "client!gu", name = "W", descriptor = "Z")
    public static boolean field7585;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    private final void method3010(byte arg0) {
        field7538++;
        long var2 = class641.method3604(false);
        long var4 = class690.field9739[class145.field1633];
        class690.field9739[class145.field1633] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class145.field1633 = class145.field1633 + 1 & 0x1F;
        synchronized (this) {
            class412.field5476 = class535.field7644;
            if (arg0 > -96) {
                this.run();
            }
        }
        this.method1544((byte) -72);
    }

    @OriginalMember(owner = "client!gu", name = "start", descriptor = "()V")
    public final void start() {
        field7568++;
        if (class663.field9432 == this && !class212.field2566) {
            class397.field5291 = 0L;
        }
    }

    @OriginalMember(owner = "client!gu", name = "stop", descriptor = "()V")
    public final void stop() {
        field7564++;
        if (class663.field9432 == this && !class212.field2566) {
            class397.field5291 = class641.method3604(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public abstract void method1532(int arg0);

    @OriginalMember(owner = "client!gu", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field7560++;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V")
    public final synchronized void method3011(byte arg0) {
        field7545++;
        if (class220.field2664 != null) {
            class220.field2664.removeFocusListener(this);
            class220.field2664.getParent().remove(class220.field2664);
        }
        Container var2;
        if (class680.field9649 != null) {
            var2 = class680.field9649;
        } else if (class77.field796 != null) {
            var2 = class77.field796;
        } else if (class485.field7068 == null) {
            var2 = class663.field9432;
        } else {
            var2 = class485.field7068;
        }
        var2.setLayout(null);
        class220.field2664 = new class526(this);
        var2.add(class220.field2664);
        class220.field2664.setSize(class399.field5336, class416.field5524);
        class220.field2664.setVisible(true);
        if (class77.field796 == var2) {
            Insets var3 = class77.field796.getInsets();
            class220.field2664.setLocation(class287.field3673 + var3.left, class600.field8523 + var3.top);
        } else {
            class220.field2664.setLocation(class287.field3673, class600.field8523);
        }
        class220.field2664.addFocusListener(this);
        class220.field2664.requestFocus();
        class535.field7644 = true;
        class412.field5476 = true;
        class229.field2914 = true;
        class422.field5615 = false;
        class457.field6384 = class641.method3604(false);
        if (arg0 != -41) {
            this.getAppletContext();
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Ljava/lang/String;")
    public String method1531(int arg0) {
        if (arg0 == -1) {
            field7540++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field7563++;
        class535.field7644 = false;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V")
    public abstract void method1535(byte arg0);

    @OriginalMember(owner = "client!gu", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field7556++;
    }

    @OriginalMember(owner = "client!gu", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field7544++;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
    public abstract void method1543(int arg0);

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)Z")
    public final boolean method3012(byte arg0) {
        field7559++;
        return arg0 == -107 ? class527.method2998("jaclib", (byte) 14) : true;
    }

    @OriginalMember(owner = "client!gu", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field7542++;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZZ)V")
    private final void method3013(boolean arg0, boolean arg1) {
        field7543++;
        synchronized (this) {
            if (class212.field2566) {
                return;
            }
            class212.field2566 = true;
        }
        if (class485.field7068 != null) {
            class485.field7068.destroy();
        }
        try {
            this.method1532(40);
        } catch (Exception var10) {
        }
        if (arg1) {
            method3023(-99, -119, false);
        }
        if (this.field7551) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field7551 = false;
        }
        class409.method2217(true, 127);
        class655.method3700((byte) -108);
        if (class220.field2664 != null) {
            try {
                class220.field2664.removeFocusListener(this);
                class220.field2664.getParent().remove(class220.field2664);
            } catch (Exception var8) {
            }
        }
        if (class623.field8837 != null) {
            try {
                class623.field8837.method3150(true);
            } catch (Exception var7) {
            }
        }
        this.method1535((byte) -103);
        if (class77.field796 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method3014(int arg0, String arg1) {
        field7566++;
        if (this.field7546) {
            return;
        }
        this.field7546 = true;
        System.out.println("error_game_" + arg1);
        try {
            class432.method2311(4975, "loggedout", class485.field7068);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            if (arg0 != 5998) {
                this.windowDeactivated(null);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(B)V")
    public static void method3015(byte arg0) {
        if (arg0 != 11) {
            field7537 = null;
        }
        field7537 = null;
    }

    @OriginalMember(owner = "client!gu", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class485.field7068 = arg0;
        field7573++;
    }

    @OriginalMember(owner = "client!gu", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field7554++;
    }

    @OriginalMember(owner = "client!gu", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field7565++;
        if (class663.field9432 == this && !class212.field2566) {
            class397.field5291 = class641.method3604(false);
            class370.method2025(-1, 5000L);
            class626.field8889 = null;
            this.method3013(false, false);
        }
    }

    @OriginalMember(owner = "client!gu", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field7547++;
    }

    @OriginalMember(owner = "client!gu", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field7571++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!gu", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field7569++;
        if (class77.field796 == null) {
            return class485.field7068 == null || class485.field7068 == this ? super.getParameter(arg0) : class485.field7068.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field7553++;
        if (class77.field796 == null) {
            return class485.field7068 == null || class485.field7068 == this ? super.getCodeBase() : class485.field7068.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILpi;IB)V")
    public static final void method3016(int arg0, class455 arg1, int arg2, byte arg3) {
        field7550++;
        if (arg1.field3778 == arg0 && arg0 != -1) {
            class576 var4 = class618.field8696.method124(24006, arg0);
            int var5 = var4.field8217;
            if (var5 == 1) {
                arg1.field3754 = 0;
                arg1.field3744 = 0;
                arg1.field3797 = arg2;
                arg1.field3810 = 0;
                arg1.field3758 = 1;
                class259.method1473(arg1.field4641, (byte) 1, var4, arg1.field4647, arg1.field4638, arg1.field3744, class377.field4914 == arg1);
            }
            if (var5 == 2) {
                arg1.field3754 = 0;
            }
        } else if (arg0 == -1 || arg1.field3778 == -1 || class618.field8696.method124(24006, arg0).field8222 >= class618.field8696.method124(24006, arg1.field3778).field8222) {
            arg1.field3797 = arg2;
            arg1.field3754 = 0;
            arg1.field3744 = 0;
            arg1.field3840 = arg1.field3835;
            arg1.field3778 = arg0;
            arg1.field3810 = 0;
            arg1.field3758 = 1;
            if (arg1.field3778 != -1) {
                class259.method1473(arg1.field4641, (byte) 1, class618.field8696.method124(arg3 + 24025, arg1.field3778), arg1.field4647, arg1.field4638, arg1.field3744, class377.field4914 == arg1);
            }
        }
        if (arg3 != -19) {
            field7537 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field7539++;
        if (class77.field796 == null) {
            return class485.field7068 == null || class485.field7068 == this ? super.getAppletContext() : class485.field7068.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field7562++;
        if (class77.field796 == null) {
            return class485.field7068 == null || class485.field7068 == this ? super.getDocumentBase() : class485.field7068.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZIIILjava/lang/String;I)V")
    public final void method3017(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        try {
            class623.field8832 = null;
            class663.field9432 = this;
            class416.field5524 = arg7;
            class680.field9645 = arg7;
            class399.field5336 = arg1;
            class433.field5699 = arg1;
            class600.field8523 = 0;
            class200.field2444 = arg5;
            class287.field3673 = 0;
            class77.field796 = new Frame();
            class77.field796.setTitle("Jagex");
            class77.field796.setResizable(true);
            class77.field796.addWindowListener(this);
            class77.field796.setVisible(true);
            class77.field796.toFront();
            Insets var9 = class77.field796.getInsets();
            class77.field796.setSize(class433.field5699 + var9.left + var9.right, class680.field9645 + var9.top - -var9.bottom);
            class626.field8889 = class623.field8837 = new class556(arg3, arg6, arg0, true);
            class199 var10 = class623.field8837.method3138(this, -37, 1);
            while (var10.field2437 == 0) {
                class370.method2025(-1, 10L);
            }
        } catch (Exception var12) {
            class150.method824(15, var12, null);
        }
        field7552++;
        if (arg4 != 4158) {
            this.windowClosed(null);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public final void method3018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field7555++;
        try {
            if (class663.field9432 == null) {
                class416.field5524 = arg2;
                class680.field9645 = arg2;
                class623.field8832 = class485.field7068;
                class287.field3673 = 0;
                class600.field8523 = 0;
                class663.field9432 = this;
                class399.field5336 = arg4;
                class433.field5699 = arg4;
                class200.field2444 = arg3;
                class626.field8889 = class623.field8837 = new class556(arg1, arg6, arg5, class485.field7068 != null);
                class199 var8 = class623.field8837.method3138(this, 68, 1);
                if (arg0 <= 95) {
                    this.getAppletContext();
                }
                while (var8.field2437 == 0) {
                    class370.method2025(-1, 10L);
                }
            } else {
                class117.field1352++;
                if (class117.field1352 >= 3) {
                    this.method3014(5998, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class150.method824(15, var10, null);
            this.method3014(5998, "crash");
        }
    }

    @OriginalMember(owner = "client!gu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field7572++;
        class535.field7644 = true;
        class229.field2914 = true;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
    private final void method3019(int arg0) {
        field7549++;
        long var2 = class641.method3604(false);
        long var4 = class41.field437[class86.field919];
        class41.field437[class86.field919] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class502.field7228 = ((var6 >> 1) + 32000) / var6;
        }
        class86.field919 = class86.field919 + 1 & 0x1F;
        if ((class318.field4123++) > 50) {
            class318.field4123 -= 50;
            class229.field2914 = true;
            class220.field2664.setSize(class399.field5336, class416.field5524);
            class220.field2664.setVisible(true);
            if (class77.field796 != null && class680.field9649 == null) {
                Insets var7 = class77.field796.getInsets();
                class220.field2664.setLocation(class287.field3673 + var7.left, var7.top - -class600.field8523);
            } else {
                class220.field2664.setLocation(class287.field3673, class600.field8523);
            }
        }
        this.method1545(2);
        if (arg0 >= -83) {
            this.method3018(12, 43, 122, 5, 126, 64, null);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3020(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method3023(65, -88, false);
        }
        field7561++;
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "(B)V")
    public abstract void method1544(byte arg0);

    @OriginalMember(owner = "client!gu", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!gu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field7567++;
        if (class663.field9432 != this || class212.field2566) {
            return;
        }
        class229.field2914 = true;
        if (class73.field772 && (class641.method3604(false) - class457.field6384) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class433.field5699 && var2.height >= class680.field9645) {
                class422.field5615 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "run", descriptor = "()V")
    public final void run() {
        field7557++;
        try {
            if (class556.field7919 != null) {
                String var1 = class556.field7919.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class556.field7918;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3014(5998, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class556.field7918 == null || class556.field7918.equals("1.4.2"))) {
                    this.method3014(5998, "wrongjava");
                    return;
                }
            }
            if (class556.field7918 != null && class556.field7918.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class556.field7918.length()) {
                    char var5 = class556.field7918.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class73.field772 = true;
                }
            }
            Applet var6 = class663.field9432;
            if (class485.field7068 != null) {
                var6 = class485.field7068;
            }
            Method var7 = class556.field7923;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class313.method1771((byte) -98);
            class588.method3304(true);
            this.method3011((byte) -41);
            this.method1543(115);
            class259.field3300 = class306.method1749(0);
            while (class397.field5291 == 0L || class641.method3604(false) < class397.field5291) {
                class359.field4707 = class259.field3300.method3356(17933, class455.field6330);
                for (int var8 = 0; var8 < class359.field4707; var8++) {
                    this.method3010((byte) -119);
                }
                this.method3019(-91);
                class183.method1063(-7901, class220.field2664, class623.field8837);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class150.method824(15, var20, this.method1531(-1));
            this.method3014(5998, "crash");
        } finally {
            Object var13 = null;
            this.method3013(true, false);
        }
    }

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "(B)Z")
    public final boolean method3021(byte arg0) {
        field7541++;
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
            int var3 = 46 % ((47 - arg0) / 54);
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method3014(5998, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V")
    public abstract void method1545(int arg0);

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)Z")
    public final boolean method3022(int arg0) {
        if (arg0 != 0) {
            this.method3017(-111, 28, false, 100, 20, 19, null, 102);
        }
        field7570++;
        return class527.method2998("jagmisc", (byte) 14);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZ)V")
    public static final void method3023(int arg0, int arg1, boolean arg2) {
        field7548++;
        class530 var3 = class242.method1402(-128, 15, 0);
        var3.method3025((byte) -69);
        var3.field7589 = arg0;
        if (!arg2) {
            var3.field7593 = arg1;
        }
    }

    @OriginalMember(owner = "client!gu", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field7558++;
    }
}
