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

@OriginalClass("client!om")
public abstract class class256 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
    private boolean field3796 = false;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "Z")
    private boolean field3804 = false;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "Lkn;")
    public static class530 field3785 = new class530("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "Loq;")
    public static class244 field3814;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "Loi;")
    public static class53 field3817;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "Z")
    public static boolean field3819;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "Z")
    public static boolean field3822;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method1647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3799++;
        class373[] var7 = class20.field234;
        for (int var8 = arg4; var8 < var7.length; var8++) {
            class373 var9 = var7[var8];
            if (var9 != null && var9.field5302 == 2) {
                class531.method3123(arg1 >> 1, (byte) -62, var9.field5307, arg5, var9.field5305, var9.field5303 * 2, arg6 >> 1, arg0, var9.field5308);
                if (class153.field2194[0] > -1 && (class390.field5481 % 20) < 10) {
                    class536.field7852[var9.field5306].method151(arg2 - (12 - class153.field2194[0]), arg3 + -28 - -class153.field2194[1]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 34)
    public final synchronized void method1648(int arg0) {
        field3784++;
        if (class487.field6799 != null) {
            class487.field6799.removeFocusListener(this);
            class487.field6799.getParent().remove(class487.field6799);
        }
        Container var2;
        if (class258.field3835 != null) {
            var2 = class258.field3835;
        } else if (class81.field1052 == null) {
            var2 = class268.field3914.field2165;
        } else {
            var2 = class81.field1052;
        }
        var2.setLayout(null);
        class487.field6799 = new class127(this);
        var2.add(class487.field6799);
        class487.field6799.setSize(class147.field1956, class273.field4048);
        class487.field6799.setVisible(true);
        if (class81.field1052 == var2) {
            Insets var3 = class81.field1052.getInsets();
            class487.field6799.setLocation(class205.field2971 + var3.left, class226.field3256 + var3.top);
        } else {
            class487.field6799.setLocation(class205.field2971, class226.field3256);
        }
        class487.field6799.addFocusListener(this);
        class487.field6799.requestFocus();
        class60.field745 = true;
        class186.field2688 = true;
        class376.field5333 = true;
        if (arg0 != -1) {
            this.focusLost(null);
        }
        class5.field82 = false;
        class426.field5991 = class465.method2699((byte) 14);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Ljj;", line = 84)
    public static final class77 method1649(int arg0) {
        field3795++;
        class77 var1 = (class77) class64.field811.method2745(-106);
        if (var1 == null) {
            int var2 = -52 / ((13 - arg0) / 34);
            return new class77();
        } else {
            class197.field2809--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!om", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 105)
    public final void focusLost(FocusEvent arg0) {
        class186.field2688 = false;
        field3810++;
    }

    @OriginalMember(owner = "client!om", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 114)
    public final void windowDeactivated(WindowEvent arg0) {
        field3791++;
    }

    @OriginalMember(owner = "client!om", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 122)
    public final synchronized void paint(Graphics arg0) {
        field3797++;
        if (class98.field1324 != this || class468.field6547) {
            return;
        }
        class376.field5333 = true;
        if (class511.field7565 && class465.method2699((byte) 14) - class426.field5991 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class47.field542 && var2.height >= class285.field4177) {
                class5.field82 = true;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 144)
    public final void focusGained(FocusEvent arg0) {
        class186.field2688 = true;
        field3792++;
        class376.field5333 = true;
    }

    @OriginalMember(owner = "client!om", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 154)
    public final URL getCodeBase() {
        field3798++;
        if (class81.field1052 == null) {
            return class268.field3914 == null || class268.field3914.field2165 == this ? super.getCodeBase() : class268.field3914.field2165.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "destroy", descriptor = "()V", line = 171)
    public final void destroy() {
        field3800++;
        if (class98.field1324 == this && !class468.field6547) {
            class110.field1500 = class465.method2699((byte) 14);
            class52.method411(5000L, (byte) 109);
            class518.field7636 = null;
            this.method1655(false, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!om", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 185)
    public final void windowClosed(WindowEvent arg0) {
        field3811++;
    }

    @OriginalMember(owner = "client!om", name = "providesignlink", descriptor = "(Lnt;)V", line = 195)
    public static final void providesignlink(class151 arg0) {
        field3803++;
        class268.field3914 = arg0;
        class518.field7636 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBI)V", line = 203)
    public static final void method1650(int arg0, byte arg1, int arg2) {
        int var3 = -3 % ((arg1 + 29) / 62);
        field3793++;
        class45 var4 = class354.method2094(arg0, (byte) -125, 1);
        var4.method260(9188);
        var4.field504 = arg2;
    }

    @OriginalMember(owner = "client!om", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 216)
    public final String getParameter(String arg0) {
        field3808++;
        if (class81.field1052 == null) {
            return class268.field3914 == null || class268.field3914.field2165 == this ? super.getParameter(arg0) : class268.field3914.field2165.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "run", descriptor = "()V", line = 235)
    public final void run() {
        field3802++;
        try {
            label114: {
                if (class151.field2167 != null) {
                    String var1 = class151.field2167.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class151.field2164;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1656(false, "wrongjava");
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class151.field2164 == null || class151.field2164.equals("1.4.2"))) {
                        this.method1656(false, "wrongjava");
                        break label114;
                    }
                }
                if (class151.field2164 != null && class151.field2164.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class151.field2164.length() > var3) {
                        char var5 = class151.field2164.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class511.field7565 = true;
                    }
                }
                if (class268.field3914.field2165 != null) {
                    Method var6 = class151.field2175;
                    if (var6 != null) {
                        try {
                            var6.invoke(class268.field3914.field2165, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class316.method1900(-3889);
                class392.method2270(-119);
                this.method1648(-1);
                this.method1653(100);
                this.method1272(-121);
                class3.field65 = class224.method1380(76);
                this.method1653(100);
                while (class110.field1500 == 0L || class465.method2699((byte) 14) < class110.field1500) {
                    client.field2867 = class3.field65.method265((byte) 119, class145.field1917);
                    for (int var7 = 0; var7 < client.field2867; var7++) {
                        this.method1651((byte) -95);
                    }
                    this.method1658((byte) 98);
                    class325.method1958(class487.field6799, class268.field3914, -3138);
                }
            }
        } catch (Throwable var10) {
            class406.method2409(3896, var10, this.method1269((byte) 19));
            this.method1656(false, "crash");
        }
        this.method1655(true, (byte) 50);
    }

    @OriginalMember(owner = "client!om", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 354)
    public final void windowDeiconified(WindowEvent arg0) {
        field3807++;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 364)
    private final void method1651(byte arg0) {
        field3788++;
        long var2 = class465.method2699((byte) 14);
        long var4 = class493.field6971[class267.field3904];
        class493.field6971[class267.field3904] = var2;
        if (arg0 > -79) {
            this.windowClosed(null);
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class267.field3904 = class267.field3904 + 1 & 0x1F;
        synchronized (this) {
            class60.field745 = class186.field2688;
        }
        this.method1280((byte) 36);
    }

    @OriginalMember(owner = "client!om", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 396)
    public final void windowIconified(WindowEvent arg0) {
        field3813++;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V", line = 403)
    public static void method1652(byte arg0) {
        field3817 = null;
        field3785 = null;
        if (arg0 != -38) {
            method1649(110);
        }
        field3814 = null;
    }

    @OriginalMember(owner = "client!om", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 415)
    public final AppletContext getAppletContext() {
        field3816++;
        if (class81.field1052 == null) {
            return class268.field3914 == null || class268.field3914.field2165 == this ? super.getAppletContext() : class268.field3914.field2165.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 430)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3806++;
    }

    @OriginalMember(owner = "client!om", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 444)
    public final URL getDocumentBase() {
        field3786++;
        if (class81.field1052 == null) {
            return class268.field3914 == null || class268.field3914.field2165 == this ? super.getDocumentBase() : class268.field3914.field2165.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "start", descriptor = "()V", line = 459)
    public final void start() {
        field3780++;
        if (class98.field1324 == this && !class468.field6547) {
            class110.field1500 = 0L;
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V", line = 471)
    public final void method1653(int arg0) {
        field3789++;
        if (arg0 != 100 || this.field3804) {
            return;
        }
        try {
            class370 var2 = class268.field3914.method951(false, class98.field1324.getClass());
            while (var2.field5277 == 0) {
                class52.method411(100L, (byte) 109);
            }
            if (var2.field5274 != null) {
                throw (Throwable) var2.field5274;
            }
            jagmisc.init();
            this.field3804 = true;
            class3.field65 = class224.method1380(42);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!om", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 518)
    public final void windowActivated(WindowEvent arg0) {
        field3815++;
    }

    @OriginalMember(owner = "client!om", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 529)
    public final void windowOpened(WindowEvent arg0) {
        field3781++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V", line = 537)
    public final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3812++;
        try {
            if (class98.field1324 == null) {
                class98.field1324 = this;
                class325.field4744 = arg1;
                class205.field2971 = 0;
                class147.field1956 = arg2;
                class47.field542 = arg2;
                class226.field3256 = 0;
                class273.field4048 = arg0;
                class285.field4177 = arg0;
                if (arg3 != 12865) {
                    field3785 = null;
                }
                if (class268.field3914 == null) {
                    class518.field7636 = class268.field3914 = new class151(this, arg4, null, 0);
                }
                class370 var6 = class268.field3914.method958((byte) 103, this, 1);
                while (var6.field5277 == 0) {
                    class52.method411(10L, (byte) 124);
                }
            } else {
                class23.field304++;
                if (class23.field304 >= 3) {
                    this.method1656(false, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class406.method2409(3896, var8, null);
            this.method1656(false, "crash");
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZB)V", line = 584)
    private final void method1655(boolean arg0, byte arg1) {
        field3809++;
        synchronized (this) {
            if (class468.field6547) {
                return;
            }
            class468.field6547 = true;
        }
        if (class268.field3914.field2165 != null) {
            class268.field3914.field2165.destroy();
        }
        try {
            this.method1274(1);
        } catch (Exception var11) {
        }
        if (this.field3804) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3804 = false;
        }
        if (arg1 != 50) {
            this.method1654(-101, -62, 61, -101, -45);
        }
        class512.method3055(true, (byte) 114);
        class370 var4 = class268.field3914.method964(false, class98.field1324.getClass());
        while (var4.field5277 == 0) {
            class52.method411(100L, (byte) 120);
        }
        if (class487.field6799 != null) {
            try {
                class487.field6799.removeFocusListener(this);
                class487.field6799.getParent().remove(class487.field6799);
            } catch (Exception var9) {
            }
        }
        if (class268.field3914 != null) {
            try {
                class268.field3914.method947((byte) -94);
            } catch (Exception var8) {
            }
        }
        this.method1279((byte) -97);
        if (class81.field1052 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 664)
    public final void method1656(boolean arg0, String arg1) {
        field3783++;
        if (this.field3796) {
            return;
        }
        this.field3796 = true;
        System.out.println("error_game_" + arg1);
        try {
            class297.method1826("loggedout", -14648, class268.field3914.field2165);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            if (arg0) {
                field3817 = null;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!om", name = "stop", descriptor = "()V", line = 694)
    public final void stop() {
        field3801++;
        if (class98.field1324 == this && !class468.field6547) {
            class110.field1500 = class465.method2699((byte) 14) + 4000L;
        }
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)Z", line = 707)
    public final boolean method1657(int arg0) {
        if (arg0 != 48) {
            field3785 = null;
        }
        field3787++;
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
                this.method1656(false, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 747)
    public final void windowClosing(WindowEvent arg0) {
        field3805++;
        this.destroy();
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)V", line = 755)
    private final void method1658(byte arg0) {
        field3790++;
        int var2 = 85 % ((31 - arg0) / 58);
        long var3 = class465.method2699((byte) 14);
        long var5 = class497.field7043[class250.field3728];
        class497.field7043[class250.field3728] = var3;
        class250.field3728 = class250.field3728 + 1 & 0x1F;
        if (var5 != 0L && var5 < var3) {
            int var7 = (int) (var3 - var5);
            class530.field7764 = ((var7 >> 1) + 32000) / var7;
        }
        if ((class258.field3833++) > 50) {
            class376.field5333 = true;
            class258.field3833 -= 50;
            class487.field6799.setSize(class147.field1956, class273.field4048);
            class487.field6799.setVisible(true);
            if (class81.field1052 != null && class258.field3835 == null) {
                Insets var8 = class81.field1052.getInsets();
                class487.field6799.setLocation(var8.left + class205.field2971, class226.field3256 + var8.top);
            } else {
                class487.field6799.setLocation(class205.field2971, class226.field3256);
            }
        }
        this.method1271(0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLjava/lang/String;IZIIII)V", line = 802)
    public final void method1659(boolean arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field3782++;
        try {
            class325.field4744 = arg5;
            class98.field1324 = this;
            class205.field2971 = 0;
            class147.field1956 = arg7;
            class47.field542 = arg7;
            if (arg3) {
                field3814 = null;
            }
            class226.field3256 = 0;
            class273.field4048 = arg6;
            class285.field4177 = arg6;
            class81.field1052 = new Frame();
            class81.field1052.setTitle("Jagex");
            class81.field1052.setResizable(true);
            class81.field1052.addWindowListener(this);
            class81.field1052.setVisible(true);
            class81.field1052.toFront();
            Insets var9 = class81.field1052.getInsets();
            class81.field1052.setSize(class47.field542 + var9.left + var9.right, var9.top + var9.bottom + class285.field4177);
            class518.field7636 = class268.field3914 = new class151(null, arg2, arg1, arg4);
            class370 var10 = class268.field3914.method958((byte) 75, this, 1);
            while (var10.field5277 == 0) {
                class52.method411(10L, (byte) 125);
            }
        } catch (Exception var12) {
            class406.method2409(3896, var12, null);
        }
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(B)Ljava/lang/String;", line = 845)
    public String method1269(byte arg0) {
        if (arg0 == 19) {
            field3794++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public abstract void method1279(byte arg0);

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public abstract void method1272(int arg0);

    @OriginalMember(owner = "client!om", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
    public abstract void method1271(int arg0);

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
    public abstract void method1274(int arg0);

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V")
    public abstract void method1280(byte arg0);
}
