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

@OriginalClass("client!io")
public abstract class class303 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!io", name = "u", descriptor = "Z")
    private boolean field4020 = false;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Z")
    private boolean field4024 = false;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "Lho;")
    public static class103 field4034;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "Z")
    public static boolean field4037;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "Z")
    public static boolean field4038;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "Z")
    public static boolean field4039;

    @OriginalMember(owner = "client!io", name = "start", descriptor = "()V")
    public final void start() {
        field4022++;
        if (class327.field4349 == this && !class406.field5845) {
            class380.field5507 = 0L;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIFFLnk;IFBFIF)[B")
    public static final byte[] method1807(int arg0, int arg1, float arg2, float arg3, class505 arg4, int arg5, float arg6, byte arg7, float arg8, int arg9, float arg10) {
        field4029++;
        byte[] var11 = new byte[arg1 * arg5 * arg9];
        if (arg7 >= -74) {
            field4033 = -52;
        }
        class465.method2844(arg9, arg4, arg5, 0, arg3, arg10, arg0, arg8, arg2, arg6, false, arg1, var11);
        return var11;
    }

    @OriginalMember(owner = "client!io", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4008++;
        if (class173.field2224 == null) {
            return class381.field5518 == null || class381.field5518.field1828 == this ? super.getParameter(arg0) : class381.field5518.field1828.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4023++;
        if (class173.field2224 == null) {
            return class381.field5518 == null || class381.field5518.field1828 == this ? super.getAppletContext() : class381.field5518.field1828.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4015++;
        if (class173.field2224 == null) {
            return class381.field5518 == null || class381.field5518.field1828 == this ? super.getDocumentBase() : class381.field5518.field1828.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static void method1808(byte arg0) {
        field4034 = null;
        int var1 = 32 % ((44 - arg0) / 37);
    }

    @OriginalMember(owner = "client!io", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4003++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public abstract void method1243(int arg0);

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
    private final void method1809(byte arg0) {
        field4017++;
        long var2 = class45.method252((byte) -8);
        long var4 = class149.field1954[class233.field3120];
        class149.field1954[class233.field3120] = var2;
        class233.field3120 = class233.field3120 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class515.field7495 = ((var6 >> 1) + 32000) / var6;
        }
        if (class304.field4046++ > 50) {
            class306.field4108 = true;
            class304.field4046 -= 50;
            class60.field701.setSize(class372.field5051, class430.field6244);
            class60.field701.setVisible(true);
            if (class173.field2224 != null && class119.field1559 == null) {
                Insets var7 = class173.field2224.getInsets();
                class60.field701.setLocation(class470.field6965 + var7.left, var7.top - -class325.field4330);
            } else {
                class60.field701.setLocation(class470.field6965, class325.field4330);
            }
        }
        this.method1243(-96);
        if (arg0 > -20) {
            this.windowOpened(null);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1810(int arg0, String arg1) {
        field4025++;
        if (this.field4020) {
            return;
        }
        this.field4020 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 >= -100) {
            this.method1811(true, -87);
        }
        try {
            class400.method2475(class381.field5518.field1828, -19, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)V")
    private final void method1811(boolean arg0, int arg1) {
        field4026++;
        synchronized (this) {
            if (class406.field5845) {
                return;
            }
            class406.field5845 = true;
        }
        if (class381.field5518.field1828 != null) {
            class381.field5518.field1828.destroy();
        }
        try {
            this.method1255((byte) -102);
        } catch (Exception var11) {
        }
        if (this.field4024) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field4024 = false;
        }
        class269.method1638((byte) -113, true);
        if (arg1 != 0) {
            this.field4020 = false;
        }
        class236 var4 = class381.field5518.method847((byte) -109, class327.field4349.getClass());
        while (var4.field3149 == 0) {
            class316.method1873(100L, false);
        }
        if (class60.field701 != null) {
            try {
                class60.field701.removeFocusListener(this);
                class60.field701.getParent().remove(class60.field701);
            } catch (Exception var9) {
            }
        }
        if (class381.field5518 != null) {
            try {
                class381.field5518.method836(0);
            } catch (Exception var8) {
            }
        }
        this.method1266(25650);
        if (class173.field2224 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!io", name = "run", descriptor = "()V")
    public final void run() {
        field4005++;
        try {
            label116: {
                if (class137.field1837 != null) {
                    String var1 = class137.field1837.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class137.field1836;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1810(-113, "wrongjava");
                            break label116;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class137.field1836 == null || class137.field1836.equals("1.4.2"))) {
                        this.method1810(-104, "wrongjava");
                        break label116;
                    }
                }
                if (class137.field1836 != null && class137.field1836.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class137.field1836.length()) {
                        char var5 = class137.field1836.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class395.field5714 = true;
                    }
                }
                if (class381.field5518.field1828 != null) {
                    Method var6 = class137.field1844;
                    if (var6 != null) {
                        try {
                            var6.invoke(class381.field5518.field1828, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class415.method2542((byte) -121);
                class35.method192((byte) -35);
                this.method1817(6527);
                this.method1812(true);
                this.method1264(0);
                class309.field4144 = class321.method1903(0);
                this.method1812(true);
                while (class380.field5507 == 0L || class380.field5507 > class45.method252((byte) -8)) {
                    class1.field5 = class309.field4144.method990(class162.field2112, 1);
                    for (int var7 = 0; var7 < class1.field5; var7++) {
                        this.method1816(-118);
                    }
                    this.method1809((byte) -91);
                    client.method1259(class60.field701, class381.field5518, -25233);
                }
            }
        } catch (Throwable var10) {
            client.method1256(var10, -2020, this.method1262(-87));
            this.method1810(-121, "crash");
        }
        this.method1811(true, 0);
    }

    @OriginalMember(owner = "client!io", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4002++;
        if (class327.field4349 != this || class406.field5845) {
            return;
        }
        class306.field4108 = true;
        if (class395.field5714 && class45.method252((byte) -8) - class444.field6462 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class155.field2037 && class461.field6876 <= var2.height) {
                class482.field7117 = true;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4031++;
    }

    @OriginalMember(owner = "client!io", name = "stop", descriptor = "()V")
    public final void stop() {
        field4010++;
        if (class327.field4349 == this && !class406.field5845) {
            class380.field5507 = class45.method252((byte) -8) + 4000L;
        }
    }

    @OriginalMember(owner = "client!io", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4001++;
        if (class327.field4349 == this && !class406.field5845) {
            class380.field5507 = class45.method252((byte) -8);
            class316.method1873(5000L, false);
            class437.field6377 = null;
            this.method1811(false, 0);
        }
    }

    @OriginalMember(owner = "client!io", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4000++;
        if (class173.field2224 == null) {
            return class381.field5518 == null || class381.field5518.field1828 == this ? super.getCodeBase() : class381.field5518.field1828.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class75.field945 = true;
        field4012++;
        class306.field4108 = true;
    }

    @OriginalMember(owner = "client!io", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4021++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
    public final void method1812(boolean arg0) {
        field4007++;
        if (!this.field4024) {
            try {
                class236 var2 = class381.field5518.method831(class327.field4349.getClass(), 17761);
                while (var2.field3149 == 0) {
                    class316.method1873(100L, false);
                }
                if (var2.field3151 != null) {
                    throw (Throwable) var2.field3151;
                }
                jagmisc.init();
                this.field4024 = true;
                class309.field4144 = class321.method1903(0);
            } catch (Throwable var3) {
            }
        }
        if (!arg0) {
            this.field4020 = false;
        }
    }

    @OriginalMember(owner = "client!io", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4030++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Z")
    public final boolean method1813(int arg0) {
        field4019++;
        if (arg0 < 67) {
            return true;
        }
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
                this.method1810(-128, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(B)V")
    public abstract void method1255(byte arg0);

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
    public abstract void method1266(int arg0);

    @OriginalMember(owner = "client!io", name = "providesignlink", descriptor = "(Lfq;)V")
    public static final void providesignlink(class137 arg0) {
        field4011++;
        class381.field5518 = arg0;
        class437.field6377 = arg0;
    }

    @OriginalMember(owner = "client!io", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field4004++;
        class75.field945 = false;
    }

    @OriginalMember(owner = "client!io", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4028++;
    }

    @OriginalMember(owner = "client!io", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
    public abstract void method1240(boolean arg0);

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(I)Ljava/lang/String;")
    public String method1262(int arg0) {
        if (arg0 >= -10) {
            return null;
        } else {
            field4032++;
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4018++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZIIIIILjava/lang/String;)V")
    public final void method1814(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        if (arg4 != 5000) {
            this.method1812(false);
        }
        field4014++;
        try {
            class325.field4330 = 0;
            class430.field6244 = arg2;
            class461.field6876 = arg2;
            class470.field6965 = 0;
            class327.field4349 = this;
            class372.field5051 = arg0;
            class155.field2037 = arg0;
            class255.field3397 = arg3;
            class173.field2224 = new Frame();
            class173.field2224.setTitle("Jagex");
            class173.field2224.setResizable(true);
            class173.field2224.addWindowListener(this);
            class173.field2224.setVisible(true);
            class173.field2224.toFront();
            Insets var9 = class173.field2224.getInsets();
            class173.field2224.setSize(var9.right + var9.left + class155.field2037, class461.field6876 + var9.bottom + var9.top);
            class437.field6377 = class381.field5518 = new class137(null, arg5, arg7, arg6);
            class236 var10 = class381.field5518.method838(this, 1, (byte) -128);
            while (var10.field3149 == 0) {
                class316.method1873(10L, false);
            }
        } catch (Exception var12) {
            client.method1256(var12, -2020, null);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
    public final void method1815(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4009++;
        try {
            if (class327.field4349 == null) {
                class470.field6965 = arg2;
                class430.field6244 = arg3;
                class461.field6876 = arg3;
                class327.field4349 = this;
                class325.field4330 = 0;
                class255.field3397 = arg1;
                class372.field5051 = arg4;
                class155.field2037 = arg4;
                if (class381.field5518 == null) {
                    class437.field6377 = class381.field5518 = new class137(this, arg0, null, 0);
                }
                class236 var6 = class381.field5518.method838(this, 1, (byte) -128);
                while (var6.field3149 == 0) {
                    class316.method1873(10L, false);
                }
            } else {
                class339.field4487++;
                if (class339.field4487 >= 3) {
                    this.method1810(-126, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            client.method1256(var8, -2020, null);
            this.method1810(-111, "crash");
        }
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "(I)V")
    private final void method1816(int arg0) {
        field4016++;
        if (arg0 > -87) {
            this.method1817(-11);
        }
        long var2 = class45.method252((byte) -8);
        long var4 = class238.field3175[class523.field7693];
        class238.field3175[class523.field7693] = var2;
        class523.field7693 = class523.field7693 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class34.field346 = class75.field945;
        }
        this.method1240(true);
    }

    @OriginalMember(owner = "client!io", name = "f", descriptor = "(I)V")
    public final synchronized void method1817(int arg0) {
        field4013++;
        if (class60.field701 != null) {
            class60.field701.removeFocusListener(this);
            class60.field701.getParent().remove(class60.field701);
        }
        Container var2;
        if (class119.field1559 != null) {
            var2 = class119.field1559;
        } else if (class173.field2224 == null) {
            var2 = class381.field5518.field1828;
        } else {
            var2 = class173.field2224;
        }
        var2.setLayout(null);
        class60.field701 = new class91(this);
        var2.add(class60.field701);
        class60.field701.setSize(class372.field5051, class430.field6244);
        class60.field701.setVisible(true);
        if (class173.field2224 == var2) {
            Insets var3 = class173.field2224.getInsets();
            class60.field701.setLocation(class470.field6965 + var3.left, class325.field4330 + var3.top);
        } else {
            class60.field701.setLocation(class470.field6965, class325.field4330);
        }
        class60.field701.addFocusListener(this);
        class60.field701.requestFocus();
        class75.field945 = true;
        if (arg0 != 6527) {
            this.method1817(13);
        }
        class34.field346 = true;
        class306.field4108 = true;
        class482.field7117 = false;
        class444.field6462 = class45.method252((byte) -8);
    }

    @OriginalMember(owner = "client!io", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4027++;
    }

    @OriginalMember(owner = "client!io", name = "g", descriptor = "(I)V")
    public abstract void method1264(int arg0);

    @OriginalMember(owner = "client!io", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4006++;
    }

    static {
        new class305("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field4034 = new class103(26, 5);
    }
}
