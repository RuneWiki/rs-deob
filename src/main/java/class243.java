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

@OriginalClass("client!pr")
public abstract class class243 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "Z")
    private boolean field3651 = false;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "Z")
    private boolean field3653 = false;

    @OriginalMember(owner = "client!pr", name = "J", descriptor = "Ljp;")
    public static class55 field3676;

    @OriginalMember(owner = "client!pr", name = "K", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "I")
    public static int field3682;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pr", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field3678;

    @OriginalMember(owner = "client!pr", name = "M", descriptor = "Z")
    public static boolean field3679;

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "Z")
    public static boolean field3681;

    @OriginalMember(owner = "client!pr", name = "Q", descriptor = "Z")
    public static boolean field3683;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BZ)V")
    private final void method1641(byte arg0, boolean arg1) {
        field3646++;
        synchronized (this) {
            if (arg0 != -106) {
                this.getDocumentBase();
            }
            if (class408.field6040) {
                return;
            }
            class408.field6040 = true;
        }
        if (class122.field1844.field1062 != null) {
            class122.field1844.field1062.destroy();
        }
        try {
            this.method1643((byte) -107);
        } catch (Exception var11) {
        }
        if (this.field3651) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3651 = false;
        }
        class45.method301(-18620, true);
        class329 var4 = class122.field1844.method449(26530, class205.field3157.getClass());
        while (var4.field4974 == 0) {
            class468.method2848(100L, (byte) 119);
        }
        if (class342.field5114 != null) {
            try {
                class342.field5114.removeFocusListener(this);
                class342.field5114.getParent().remove(class342.field5114);
            } catch (Exception var9) {
            }
        }
        if (class122.field1844 != null) {
            try {
                class122.field1844.method459((byte) 117);
            } catch (Exception var8) {
            }
        }
        this.method1658(124);
        if (class237.field3564 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!pr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3660++;
    }

    @OriginalMember(owner = "client!pr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3650++;
        if (class205.field3157 != this || class408.field6040) {
            return;
        }
        class144.field2124 = true;
        if (class18.field196 && (class375.method2397((byte) -75) - class276.field4335) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class100.field1538 <= var2.width && var2.height >= class228.field3453) {
                class5.field72 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "start", descriptor = "()V")
    public final void start() {
        field3659++;
        if (class205.field3157 == this && !class408.field6040) {
            class263.field4180 = 0L;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lam;B)V")
    public static final void method1642(class541 arg0, byte arg1) {
        field3656++;
        if (class348.field5192 == null || arg1 != -65) {
            return;
        }
        class161 var2 = null;
        if (arg0.field7920 == 0) {
            var2 = (class161) class454.method2781(arg0.field7918, arg0.field7927, arg0.field7925);
        }
        if (arg0.field7920 == 1) {
            var2 = (class161) class124.method921(arg0.field7918, arg0.field7927, arg0.field7925);
        }
        if (arg0.field7920 == 2) {
            var2 = (class161) class35.method217(arg0.field7918, arg0.field7927, arg0.field7925, field3678 == null ? (field3678 = method1659("bs")) : field3678);
        }
        if (arg0.field7920 == 3) {
            var2 = (class161) class404.method2542(arg0.field7918, arg0.field7927, arg0.field7925);
        }
        if (var2 == null) {
            arg0.field7921 = 0;
            arg0.field7919 = -1;
            arg0.field7917 = 0;
        } else {
            arg0.field7919 = var2.method99((byte) -107);
            arg0.field7921 = var2.method103(-81);
            arg0.field7917 = var2.method97(arg1 ^ 0xFFFFFFC9);
        }
    }

    @OriginalMember(owner = "client!pr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3648++;
    }

    @OriginalMember(owner = "client!pr", name = "stop", descriptor = "()V")
    public final void stop() {
        field3674++;
        if (class205.field3157 == this && !class408.field6040) {
            class263.field4180 = class375.method2397((byte) -75) + 4000L;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public abstract void method1643(byte arg0);

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
    public static final void method1644(byte arg0) {
        field3670++;
        class120.method899();
        if (arg0 != 36) {
            method1650(79);
        }
    }

    @OriginalMember(owner = "client!pr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3673++;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
    public final boolean method1645(int arg0) {
        field3644++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != -48) {
                this.method1646(45);
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
                this.method1648(31418, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!pr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3668++;
        if (class237.field3564 == null) {
            return class122.field1844 == null || class122.field1844.field1062 == this ? super.getDocumentBase() : class122.field1844.field1062.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3663++;
    }

    @OriginalMember(owner = "client!pr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class232.field3491 = true;
        field3657++;
        class144.field2124 = true;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
    public abstract void method1646(int arg0);

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V")
    public abstract void method1647(byte arg0);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1648(int arg0, String arg1) {
        field3671++;
        if (this.field3653) {
            return;
        }
        this.field3653 = true;
        System.out.println("error_game_" + arg1);
        try {
            class220.method1510(arg0 - 31522, "loggedout", class122.field1844.field1062);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            if (arg0 != 31418) {
                this.field3653 = true;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!pr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class232.field3491 = false;
        field3672++;
    }

    @OriginalMember(owner = "client!pr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3662++;
    }

    @OriginalMember(owner = "client!pr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3643++;
        if (class237.field3564 == null) {
            return class122.field1844 == null || class122.field1844.field1062 == this ? super.getAppletContext() : class122.field1844.field1062.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3655++;
        if (class205.field3157 == this && !class408.field6040) {
            class263.field4180 = class375.method2397((byte) -75);
            class468.method2848(5000L, (byte) -116);
            class227.field3445 = null;
            this.method1641((byte) -106, false);
        }
    }

    @OriginalMember(owner = "client!pr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3641++;
        if (class237.field3564 == null) {
            return class122.field1844 == null || class122.field1844.field1062 == this ? super.getCodeBase() : class122.field1844.field1062.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3642++;
        if (class237.field3564 == null) {
            return class122.field1844 == null || class122.field1844.field1062 == this ? super.getParameter(arg0) : class122.field1844.field1062.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(B)V")
    public abstract void method1649(byte arg0);

    @OriginalMember(owner = "client!pr", name = "run", descriptor = "()V")
    public final void run() {
        field3669++;
        try {
            label116: {
                if (class66.field1040 != null) {
                    String var1 = class66.field1040.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class66.field1046;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1648(31418, "wrongjava");
                            break label116;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class66.field1046 == null || class66.field1046.equals("1.4.2"))) {
                        this.method1648(31418, "wrongjava");
                        break label116;
                    }
                }
                if (class66.field1046 != null && class66.field1046.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class66.field1046.length()) {
                        char var5 = class66.field1046.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = -(-var5 - var4 * 10) - 48;
                    }
                    if (var4 >= 5) {
                        class18.field196 = true;
                    }
                }
                if (class122.field1844.field1062 != null) {
                    Method var6 = class66.field1060;
                    if (var6 != null) {
                        try {
                            var6.invoke(class122.field1844.field1062, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class22.method138(31);
                class269.method1861(540800);
                this.method1653(46);
                this.method1655(32000);
                this.method1649((byte) 99);
                class308.field4705 = class234.method1583((byte) -7);
                this.method1655(32000);
                while (class263.field4180 == 0L || class375.method2397((byte) -75) < class263.field4180) {
                    class272.field4288 = class308.field4705.method1431(class16.field169, false);
                    for (int var7 = 0; var7 < class272.field4288; var7++) {
                        this.method1654((byte) -118);
                    }
                    this.method1656(0);
                    class488.method2947(class342.field5114, class122.field1844, 86);
                }
            }
        } catch (Throwable var10) {
            class197.method1407(true, this.method1657((byte) -69), var10);
            this.method1648(31418, "crash");
        }
        this.method1641((byte) -106, true);
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
    public static void method1650(int arg0) {
        field3676 = null;
        if (arg0 != 2) {
            field3677 = 111;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZIII)V")
    public final void method1651(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3658++;
        try {
            if (class205.field3157 == null) {
                class525.field7700 = 0;
                class360.field5313 = arg4;
                class228.field3453 = arg4;
                class169.field2570 = arg3;
                class100.field1538 = arg3;
                if (!arg1) {
                    field3677 = 45;
                }
                class338.field5079 = 0;
                class20.field225 = arg0;
                class205.field3157 = this;
                if (class122.field1844 == null) {
                    class227.field3445 = class122.field1844 = new class66(this, arg2, null, 0);
                }
                class329 var6 = class122.field1844.method448(1, this, (byte) 84);
                while (var6.field4974 == 0) {
                    class468.method2848(10L, (byte) 121);
                }
            } else {
                class529.field7738++;
                if (class529.field7738 >= 3) {
                    this.method1648(31418, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class197.method1407(true, null, var8);
            this.method1648(31418, "crash");
        }
    }

    @OriginalMember(owner = "client!pr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3645++;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIILjava/lang/String;ZII)V")
    public final void method1652(int arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, int arg6, int arg7) {
        field3666++;
        try {
            class525.field7700 = 0;
            class169.field2570 = arg2;
            class100.field1538 = arg2;
            class205.field3157 = this;
            class20.field225 = arg3;
            class360.field5313 = arg0;
            class228.field3453 = arg0;
            class338.field5079 = 0;
            class237.field3564 = new Frame();
            class237.field3564.setTitle("Jagex");
            class237.field3564.setResizable(true);
            class237.field3564.addWindowListener(this);
            class237.field3564.setVisible(true);
            class237.field3564.toFront();
            Insets var9 = class237.field3564.getInsets();
            class237.field3564.setSize(class100.field1538 + var9.left + var9.right, class228.field3453 + var9.bottom + var9.top);
            class227.field3445 = class122.field1844 = new class66(null, arg6, arg4, arg1);
            class329 var10 = class122.field1844.method448(arg7, this, (byte) 103);
            while (var10.field4974 == 0) {
                class468.method2848(10L, (byte) -108);
            }
        } catch (Exception var12) {
            class197.method1407(true, null, var12);
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
    public final synchronized void method1653(int arg0) {
        if (class342.field5114 != null) {
            class342.field5114.removeFocusListener(this);
            class342.field5114.getParent().remove(class342.field5114);
        }
        field3675++;
        Container var2;
        if (class337.field5072 != null) {
            var2 = class337.field5072;
        } else if (class237.field3564 == null) {
            var2 = class122.field1844.field1062;
        } else {
            var2 = class237.field3564;
        }
        var2.setLayout(null);
        class342.field5114 = new class73(this);
        var2.add(class342.field5114);
        class342.field5114.setSize(class169.field2570, class360.field5313);
        class342.field5114.setVisible(true);
        if (class237.field3564 == var2) {
            Insets var3 = class237.field3564.getInsets();
            class342.field5114.setLocation(class338.field5079 + var3.left, class525.field7700 + var3.top);
        } else {
            class342.field5114.setLocation(class338.field5079, class525.field7700);
        }
        class342.field5114.addFocusListener(this);
        class342.field5114.requestFocus();
        class232.field3491 = true;
        class356.field5272 = true;
        class144.field2124 = true;
        class5.field72 = false;
        if (arg0 > 15) {
            class276.field4335 = class375.method2397((byte) -75);
        }
    }

    @OriginalMember(owner = "client!pr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3652++;
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(B)V")
    private final void method1654(byte arg0) {
        field3667++;
        if (arg0 >= -114) {
            return;
        }
        long var2 = class375.method2397((byte) -75);
        long var4 = class517.field7517[class533.field7785];
        class517.field7517[class533.field7785] = var2;
        class533.field7785 = class533.field7785 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class356.field5272 = class232.field3491;
        }
        this.method1647((byte) 87);
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)V")
    public final void method1655(int arg0) {
        field3647++;
        if (!this.field3651) {
            try {
                class329 var2 = class122.field1844.method470(-94, class205.field3157.getClass());
                while (var2.field4974 == 0) {
                    class468.method2848(100L, (byte) -76);
                }
                if (var2.field4975 != null) {
                    throw (Throwable) var2.field4975;
                }
                jagmisc.init();
                this.field3651 = true;
                class308.field4705 = class234.method1583((byte) -7);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != 32000) {
            method1642(null, (byte) 16);
        }
    }

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)V")
    private final void method1656(int arg0) {
        field3661++;
        long var2 = class375.method2397((byte) -75);
        long var4 = class263.field4179[class413.field6089];
        class263.field4179[class413.field6089] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class324.field4916 = ((var6 >> 1) + 32000) / var6;
        }
        class413.field6089 = class413.field6089 + 1 & 0x1F;
        if (class321.field4866++ > 50) {
            class144.field2124 = true;
            class321.field4866 -= 50;
            class342.field5114.setSize(class169.field2570, class360.field5313);
            class342.field5114.setVisible(true);
            if (class237.field3564 != null && class337.field5072 == null) {
                Insets var7 = class237.field3564.getInsets();
                class342.field5114.setLocation(class338.field5079 + var7.left, class525.field7700 + var7.top);
            } else {
                class342.field5114.setLocation(class338.field5079, class525.field7700);
            }
        }
        this.method1646(arg0);
    }

    @OriginalMember(owner = "client!pr", name = "providesignlink", descriptor = "(Lgt;)V")
    public static final void providesignlink(class66 arg0) {
        field3649++;
        class122.field1844 = arg0;
        class227.field3445 = arg0;
    }

    @OriginalMember(owner = "client!pr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3654++;
        this.destroy();
    }

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "(B)Ljava/lang/String;")
    public String method1657(byte arg0) {
        field3665++;
        if (arg0 > -20) {
            this.init();
        }
        return null;
    }

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V")
    public abstract void method1658(int arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1659(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class179("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field3676 = new class55(55, -2);
        field3677 = 0;
    }
}
