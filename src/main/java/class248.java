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

@OriginalClass("client!gh")
public abstract class class248 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Z")
    private boolean field3734 = false;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "[Lbd;")
    public static class28[] field3749 = new class28[14];

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field3745 = 0;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "[I")
    public static int[] field3739 = new int[1000];

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field3754 = 0;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "[J")
    public static long[] field3728 = new long[32];

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3731 = 0;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Z")
    public static boolean field3729;

    @OriginalMember(owner = "client!gh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 11)
    public final URL getDocumentBase() {
        field3759++;
        if (class254.field3878 == null) {
            return class330.field5074 == null || class330.field5074.field95 == this ? super.getDocumentBase() : class330.field5074.field95.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 26)
    public final void windowActivated(WindowEvent arg0) {
        field3758++;
    }

    @OriginalMember(owner = "client!gh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 36)
    public final void focusGained(FocusEvent arg0) {
        field3746++;
        class330.field5086 = true;
        class177.field2828 = true;
    }

    @OriginalMember(owner = "client!gh", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 47)
    public final URL getCodeBase() {
        field3750++;
        if (class254.field3878 == null) {
            return class330.field5074 == null || class330.field5074.field95 == this ? super.getCodeBase() : class330.field5074.field95.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V", line = 61)
    public final void method1690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3730++;
        try {
            if (class214.field3283 != null) {
                class172.field2781++;
                if (class172.field2781 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1698(arg3 - 10086, "alreadyloaded");
                return;
            }
            class151.field2281 = arg0;
            class312.field4843 = arg0;
            if (arg3 != 3) {
                this.method1009(false);
            }
            class144.field2211 = arg2;
            class214.field3283 = this;
            class176.field2818 = 0;
            class135.field2052 = 0;
            class215.field3300 = arg1;
            class242.field3687 = arg1;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class5.field80 = true;
            } else {
                class5.field80 = false;
            }
            if (class330.field5074 == null) {
                class51.field692 = class330.field5074 = new class6(this, arg4, (String) null, 0);
            }
            class208 var7 = class330.field5074.method57(this, (byte) 9, 1);
            while (var7.field3185 == 0) {
                class324.method2252(-24861, 10L);
            }
            class163.field2634 = (Thread) var7.field3186;
        } catch (Exception var9) {
            class189.method1401(true, var9, (String) null);
            this.method1698(arg3 ^ 0xFFFFD89E, "crash");
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 116)
    private final void method1691(byte arg0) {
        field3755++;
        long var2 = class305.field4772[class323.field4994];
        long var4 = class105.method789((byte) 55);
        class305.field4772[class323.field4994] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class2.field31 = ((var6 >> 1) + 32000) / var6;
        }
        class323.field4994 = class323.field4994 + 1 & 0x1F;
        if (class134.field2039++ > 50) {
            class134.field2039 -= 50;
            class177.field2828 = true;
            class102.field1480.setSize(class151.field2281, class215.field3300);
            class102.field1480.setVisible(true);
            if (class254.field3878 != null && class170.field2747 == null) {
                Insets var7 = class254.field3878.getInsets();
                class102.field1480.setLocation(class176.field2818 + var7.left, var7.top - -class135.field2052);
            } else {
                class102.field1480.setLocation(class176.field2818, class135.field2052);
            }
        }
        int var8 = -37 % ((arg0 - 64) / 50);
        this.method1013(0);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 159)
    public static final void method1692(int arg0) {
        field3720++;
        if (class39.field575 != null && (class39.field575.field4713 + (64 - (class39.field575.method1897(8) * 64)) >> 7) == class163.field2641 && (class39.field575.field4731 - ((class39.field575.method1897(8) - 1) * 64) >> 7) == class260.field3999) {
            class163.field2641 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class112.field1694[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class234.field3563; var3++) {
            class270 var4 = class201.field3096[class291.field4475[var3]];
            if (var4 != null) {
                var4.field4755 = false;
            }
        }
        if (arg0 < 83) {
            field3745 = 79;
        }
        for (int var5 = 0; var5 < class52.field702; var5++) {
            class76 var6 = class264.field4064[class272.field4252[var5]];
            if (var6 != null) {
                var6.field4755 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 223)
    public final String getParameter(String arg0) {
        field3742++;
        if (class254.field3878 == null) {
            return class330.field5074 == null || class330.field5074.field95 == this ? super.getParameter(arg0) : class330.field5074.field95.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V", line = 239)
    public final synchronized void method1693(byte arg0) {
        if (class102.field1480 != null) {
            class102.field1480.removeFocusListener(this);
            class102.field1480.getParent().remove(class102.field1480);
        }
        field3760++;
        Container var2;
        if (class170.field2747 != null) {
            var2 = class170.field2747;
        } else if (class254.field3878 == null) {
            var2 = class330.field5074.field95;
        } else {
            var2 = class254.field3878;
        }
        var2.setLayout((LayoutManager) null);
        class102.field1480 = new class152(this);
        var2.add(class102.field1480);
        class102.field1480.setSize(class151.field2281, class215.field3300);
        class102.field1480.setVisible(true);
        if (class254.field3878 == var2) {
            Insets var3 = class254.field3878.getInsets();
            class102.field1480.setLocation(class176.field2818 + var3.left, class135.field2052 + var3.top);
        } else {
            class102.field1480.setLocation(class176.field2818, class135.field2052);
        }
        class102.field1480.addFocusListener(this);
        class102.field1480.requestFocus();
        class330.field5086 = true;
        if (arg0 != 96) {
            this.method1699((byte) -30);
        }
        class313.field4857 = true;
        class177.field2828 = true;
        class229.field3496 = false;
        class108.field1641 = class105.method789((byte) 55);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 285)
    public static void method1694(int arg0) {
        field3739 = null;
        field3728 = null;
        field3749 = null;
        int var1 = -81 / ((3 - arg0) / 60);
    }

    @OriginalMember(owner = "client!gh", name = "destroy", descriptor = "()V", line = 299)
    public final void destroy() {
        field3725++;
        if (class214.field3283 == this && !class78.field1138) {
            class273.field4261 = class105.method789((byte) 55);
            class324.method2252(-24861, 5000L);
            class51.field692 = null;
            this.method1697(false, -103);
        }
    }

    @OriginalMember(owner = "client!gh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 313)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3732++;
    }

    @OriginalMember(owner = "client!gh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 330)
    public final void focusLost(FocusEvent arg0) {
        class330.field5086 = false;
        field3744++;
    }

    @OriginalMember(owner = "client!gh", name = "stop", descriptor = "()V", line = 338)
    public final void stop() {
        field3723++;
        if (class214.field3283 == this && !class78.field1138) {
            class273.field4261 = class105.method789((byte) 55) + 4000L;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 352)
    private final void method1695(int arg0) {
        field3721++;
        long var2 = class105.method789((byte) 55);
        long var4 = field3728[class299.field4610];
        if ((long) arg0 != var4 && var2 <= var4) {
        }
        field3728[class299.field4610] = var2;
        class299.field4610 = class299.field4610 + 1 & 0x1F;
        synchronized (this) {
            class313.field4857 = class330.field5086;
        }
        this.method1007(true);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;IIZIIIB)V", line = 386)
    public final void method1696(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3740++;
        try {
            class151.field2281 = arg1;
            class312.field4843 = arg1;
            class214.field3283 = this;
            class135.field2052 = 0;
            class144.field2211 = arg4;
            class215.field3300 = arg5;
            class242.field3687 = arg5;
            class176.field2818 = 0;
            class254.field3878 = new Frame();
            class254.field3878.setTitle("Jagex");
            class254.field3878.setResizable(true);
            class254.field3878.addWindowListener(this);
            class254.field3878.setVisible(true);
            class254.field3878.toFront();
            Insets var9 = class254.field3878.getInsets();
            class254.field3878.setSize(class312.field4843 + var9.left + var9.right, class242.field3687 + var9.bottom - -var9.top);
            class51.field692 = class330.field5074 = new class6((Applet) null, arg2, arg0, arg6);
            class208 var10 = class330.field5074.method57(this, (byte) 9, 1);
            while (var10.field3185 == 0) {
                class324.method2252(-24861, 10L);
            }
            class163.field2634 = (Thread) var10.field3186;
            int var11 = 123 / ((-arg7 - 51) / 44);
        } catch (Exception var13) {
            class189.method1401(true, var13, (String) null);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V", line = 434)
    private final void method1697(boolean arg0, int arg1) {
        field3735++;
        synchronized (this) {
            if (class78.field1138) {
                return;
            }
            class78.field1138 = true;
        }
        if (class330.field5074.field95 != null) {
            class330.field5074.field95.destroy();
        }
        try {
            if (arg1 >= -68) {
                return;
            }
            this.method1009(true);
        } catch (Exception var12) {
        }
        if (class102.field1480 != null) {
            try {
                class102.field1480.removeFocusListener(this);
                class102.field1480.getParent().remove(class102.field1480);
            } catch (Exception var11) {
            }
        }
        if (class330.field5074 != null) {
            try {
                class330.field5074.method66(2095);
            } catch (Exception var10) {
            }
        }
        this.method1004(0);
        if (class254.field3878 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!gh", name = "start", descriptor = "()V", line = 504)
    public final void start() {
        field3757++;
        if (class214.field3283 == this && !class78.field1138) {
            class273.field4261 = 0L;
        }
    }

    @OriginalMember(owner = "client!gh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 517)
    public final void windowDeactivated(WindowEvent arg0) {
        field3733++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)V", line = 524)
    public final void method1698(int arg0, String arg1) {
        field3722++;
        if (this.field3734) {
            return;
        }
        this.field3734 = true;
        System.out.println("error_game_" + arg1);
        try {
            class199.method1445(arg0 + 9955, "loggedout", class330.field5074.field95);
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var5) {
        }
        if (arg0 != -10083) {
            providesignlink((class6) null);
        }
    }

    @OriginalMember(owner = "client!gh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 550)
    public final void windowDeiconified(WindowEvent arg0) {
        field3724++;
    }

    @OriginalMember(owner = "client!gh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 561)
    public final void update(Graphics arg0) {
        field3738++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!gh", name = "run", descriptor = "()V", line = 569)
    public final void run() {
        field3752++;
        try {
            if (class6.field90 != null) {
                String var1 = class6.field90.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class6.field99;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1698(-10083, "wrongjava");
                        return;
                    }
                    class230.field3506 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class6.field99 == null || class6.field99.equals("1.4.2"))) {
                    this.method1698(-10083, "wrongjava");
                    return;
                }
            }
            if (class6.field99 != null && class6.field99.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class6.field99.length()) {
                    char var5 = class6.field99.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class75.field1094 = true;
                }
            }
            if (class330.field5074.field95 != null) {
                Method var6 = class6.field104;
                if (var6 != null) {
                    try {
                        var6.invoke(class330.field5074.field95, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class258.method1821(false);
            this.method1693((byte) 96);
            class13.field186 = class198.method1440(class215.field3300, class151.field2281, class102.field1480, 6);
            this.method996(false);
            class49.field670 = class4.method27(false);
            while (class273.field4261 == 0L || class273.field4261 > class105.method789((byte) 55)) {
                class25.field280 = class49.field670.method190(class230.field3506, class111.field1676, (byte) 91);
                for (int var8 = 0; var8 < class25.field280; var8++) {
                    this.method1695(0);
                }
                this.method1691((byte) -105);
                class69.method491(class102.field1480, class330.field5074, 0);
            }
        } catch (Exception var11) {
            class189.method1401(true, var11, (String) null);
            this.method1698(-10083, "crash");
        }
        this.method1697(true, -123);
    }

    @OriginalMember(owner = "client!gh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 683)
    public final void windowClosed(WindowEvent arg0) {
        field3747++;
    }

    @OriginalMember(owner = "client!gh", name = "providesignlink", descriptor = "(Lvl;)V", line = 690)
    public static final void providesignlink(class6 arg0) {
        class330.field5074 = arg0;
        class51.field692 = arg0;
        field3743++;
    }

    @OriginalMember(owner = "client!gh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 704)
    public final AppletContext getAppletContext() {
        field3741++;
        if (class254.field3878 == null) {
            return class330.field5074 == null || class330.field5074.field95 == this ? super.getAppletContext() : class330.field5074.field95.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 722)
    public final void windowOpened(WindowEvent arg0) {
        field3753++;
    }

    @OriginalMember(owner = "client!gh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 729)
    public final void windowIconified(WindowEvent arg0) {
        field3751++;
    }

    @OriginalMember(owner = "client!gh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 736)
    public final synchronized void paint(Graphics arg0) {
        field3737++;
        if (class214.field3283 != this || class78.field1138) {
            return;
        }
        class177.field2828 = true;
        if (class75.field1094 && !class73.field1058 && (class105.method789((byte) 55) - class108.field1641) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class312.field4843 && class242.field3687 <= var2.height) {
                class229.field3496 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)Z", line = 769)
    public final boolean method1699(byte arg0) {
        field3727++;
        if (arg0 < 60) {
            field3728 = (long[]) null;
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
                this.method1698(-10083, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public abstract void method1009(boolean arg0);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public abstract void method1004(int arg0);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)V")
    public abstract void method996(boolean arg0);

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)V")
    public abstract void method1007(boolean arg0);

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
    public abstract void method1013(int arg0);

    @OriginalMember(owner = "client!gh", name = "init", descriptor = "()V")
    public abstract void init();
}
