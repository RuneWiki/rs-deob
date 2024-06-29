import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!hu")
public abstract class class225 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "Z")
    private boolean field3333 = false;

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "Z")
    private boolean field3346 = false;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "Lgr;")
    public static class530 field3319 = new class530(11, 3);

    @OriginalMember(owner = "client!hu", name = "M", descriptor = "Lak;")
    public static class498 field3348 = new class498();

    @OriginalMember(owner = "client!hu", name = "O", descriptor = "I")
    public static int field3350 = 0;

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "Ldj;")
    public static class703 field3349 = new class703(8, 0, 4, 1);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!hu", name = "L", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!hu", name = "Q", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!hu", name = "R", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!hu", name = "U", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!hu", name = "V", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!hu", name = "Y", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!hu", name = "ab", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!hu", name = "bb", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!hu", name = "cb", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!hu", name = "db", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!hu", name = "eb", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!hu", name = "gb", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!hu", name = "hb", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!hu", name = "P", descriptor = "Lla;")
    public static class423 field3351;

    @OriginalMember(owner = "client!hu", name = "S", descriptor = "Z")
    public static boolean field3354;

    @OriginalMember(owner = "client!hu", name = "T", descriptor = "Z")
    public static boolean field3355;

    @OriginalMember(owner = "client!hu", name = "W", descriptor = "Z")
    public static boolean field3358;

    @OriginalMember(owner = "client!hu", name = "X", descriptor = "Z")
    public static boolean field3359;

    @OriginalMember(owner = "client!hu", name = "Z", descriptor = "Z")
    public static boolean field3361;

    @OriginalMember(owner = "client!hu", name = "fb", descriptor = "Z")
    public static boolean field3367;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Ljava/lang/String;")
    public String method1556(int arg0) {
        if (arg0 != 9) {
            this.method1568(false);
        }
        field3343++;
        return null;
    }

    @OriginalMember(owner = "client!hu", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3315++;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
    public abstract void method1557(int arg0);

    @OriginalMember(owner = "client!hu", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3312++;
    }

    @OriginalMember(owner = "client!hu", name = "start", descriptor = "()V")
    public final void start() {
        field3339++;
        if (class181.field2502 == this && !class386.field5580) {
            class456.field6494 = 0L;
        }
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)Z")
    public final boolean method1558(int arg0) {
        field3345++;
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
                int var3 = -76 / ((arg0 - 14) / 55);
                this.method1575(-13658, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
    public abstract void method1559(boolean arg0);

    @OriginalMember(owner = "client!hu", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3342++;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(Z)V")
    public abstract void method1560(boolean arg0);

    @OriginalMember(owner = "client!hu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3329++;
        class378.field5489 = false;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)Z")
    public final boolean method1561(byte arg0) {
        field3311++;
        int var2 = 10 / ((arg0 + 45) / 63);
        return class151.method1095("jaclib", 3);
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)V")
    public static void method1562(int arg0) {
        field3349 = null;
        if (arg0 != -1) {
            field3319 = null;
        }
        field3351 = null;
        field3319 = null;
        field3348 = null;
    }

    @OriginalMember(owner = "client!hu", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3325++;
        if (class696.field9834 == null) {
            return class486.field6999 == null || class486.field6999 == this ? super.getCodeBase() : class486.field6999.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V")
    public abstract void method1563(int arg0);

    @OriginalMember(owner = "client!hu", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3326++;
        this.destroy();
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII)Lss;")
    public static final class506 method1564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3347++;
        long var7 = (long) arg4 * 76724863L ^ (long) arg6 * 32147369L ^ (long) arg3 * 986053L ^ (long) arg5 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L;
        if (arg0 != 4) {
            provideLoaderApplet(null);
        }
        class506 var9 = (class506) class716.field10105.method2216(0, var7);
        if (var9 == null) {
            class506 var10 = class751.field10467.method298(arg5, arg1, arg2, arg3, arg6, arg4);
            class716.field10105.method2213((byte) -16, var7, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIILjava/lang/String;IIII)V")
    public final void method1565(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field3317++;
        try {
            class648.field9336 = arg2;
            class181.field2502 = this;
            class68.field1042 = arg4;
            class291.field4016 = arg4;
            class26.field232 = 0;
            class658.field9423 = 0;
            class718.field10127 = null;
            class565.field8187 = arg5;
            class443.field6318 = arg5;
            class696.field9834 = new Frame();
            class696.field9834.setTitle("Jagex");
            class696.field9834.setResizable(true);
            class696.field9834.addWindowListener(this);
            class696.field9834.setVisible(true);
            class696.field9834.toFront();
            Insets var9 = class696.field9834.getInsets();
            class696.field9834.setSize(class291.field4016 + var9.left + var9.right, class443.field6318 + var9.top + var9.bottom);
            class321.field4370 = class345.field4749 = new class300(arg6, arg3, arg1, true);
            class432 var10 = class345.field4749.method1872(1, false, this);
            while (var10.field6198 == 0) {
                class363.method2283(10L, -24244);
            }
            if (arg7 > -104) {
                this.init();
            }
        } catch (Exception var12) {
            class705.method3952(null, var12, -29913);
        }
    }

    @OriginalMember(owner = "client!hu", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3341++;
    }

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)Z")
    public final boolean method1566(int arg0) {
        if (arg0 == 12000) {
            field3328++;
            return class151.method1095("jagtheora", arg0 ^ 0x2EE3);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hu", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3316++;
    }

    @OriginalMember(owner = "client!hu", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBIZ)V")
    public static final void method1567(int arg0, byte arg1, int arg2, boolean arg3) {
        if (class186.field2611.method4020((long) arg0, (byte) -112) == null) {
            if (class228.field3406) {
                class394 var4 = new class394(arg0, new class345(4096, class640.field9116, arg0), arg2, arg3);
                var4.field5658.method3991(1, class683.field9695[class45.field748]);
                class186.field2611.method4022(var4, -54, (long) arg0);
            } else {
                class264.method1745(arg0, true, arg3);
            }
        }
        field3338++;
        if (arg1 > -127) {
            field3350 = -45;
        }
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(Z)V")
    private final void method1568(boolean arg0) {
        field3314++;
        long var2 = class465.method2818(255);
        long var4 = class390.field5619[class603.field8544];
        class390.field5619[class603.field8544] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class162.field2322 = ((var6 >> 1) + 32000) / var6;
        }
        if (!arg0) {
            return;
        }
        class603.field8544 = class603.field8544 + 1 & 0x1F;
        if (class365.field5356++ > 50) {
            class123.field1699 = true;
            class365.field5356 -= 50;
            class95.field1383.setSize(class68.field1042, class565.field8187);
            class95.field1383.setVisible(true);
            if (class696.field9834 != null && class214.field3211 == null) {
                Insets var7 = class696.field9834.getInsets();
                class95.field1383.setLocation(class658.field9423 + var7.left, var7.top - -class26.field232);
            } else {
                class95.field1383.setLocation(class658.field9423, class26.field232);
            }
        }
        this.method1559(false);
    }

    @OriginalMember(owner = "client!hu", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3327++;
        if (class181.field2502 == this && !class386.field5580) {
            class456.field6494 = class465.method2818(255);
            class363.method2283(5000L, -24244);
            class321.field4370 = null;
            this.method1574(0, false);
        }
    }

    @OriginalMember(owner = "client!hu", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3323++;
        if (class696.field9834 == null) {
            return class486.field6999 == null || class486.field6999 == this ? super.getAppletContext() : class486.field6999.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3334++;
    }

    @OriginalMember(owner = "client!hu", name = "stop", descriptor = "()V")
    public final void stop() {
        field3337++;
        if (class181.field2502 == this && !class386.field5580) {
            class456.field6494 = class465.method2818(255) + 4000L;
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)Z")
    public final boolean method1569(byte arg0) {
        field3340++;
        return arg0 == 119 ? class151.method1095("jagmisc", 3) : false;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method1570(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3320++;
        try {
            if (class181.field2502 == null) {
                class718.field10127 = class486.field6999;
                class565.field8187 = arg6;
                class443.field6318 = arg6;
                class181.field2502 = this;
                class648.field9336 = arg2;
                class26.field232 = 0;
                class68.field1042 = arg5;
                class291.field4016 = arg5;
                class658.field9423 = 0;
                class321.field4370 = class345.field4749 = new class300(arg0, arg1, arg4, class486.field6999 != null);
                class432 var8 = class345.field4749.method1872(arg3, false, this);
                while (var8.field6198 == 0) {
                    class363.method2283(10L, -24244);
                }
            } else {
                class563.field8153++;
                if (class563.field8153 >= 3) {
                    this.method1575(-13658, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class705.method3952(null, var10, -29913);
            this.method1575(-13658, "crash");
        }
    }

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "(I)V")
    private final void method1571(int arg0) {
        field3332++;
        long var2 = class465.method2818(255);
        long var4 = class548.field7952[class527.field7681];
        class548.field7952[class527.field7681] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class527.field7681 = class527.field7681 + 1 & 0x1F;
        synchronized (this) {
            class240.field3557 = class378.field5489;
        }
        this.method1573(-99);
        if (arg0 != 18454) {
            this.windowClosed(null);
        }
    }

    @OriginalMember(owner = "client!hu", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3313++;
        if (class696.field9834 == null) {
            return class486.field6999 == null || class486.field6999 == this ? super.getDocumentBase() : class486.field6999.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "(I)V")
    public synchronized void method1572(int arg0) {
        if (class95.field1383 != null) {
            class95.field1383.removeFocusListener(this);
            class95.field1383.getParent().setBackground(Color.black);
            class95.field1383.getParent().remove(class95.field1383);
        }
        field3324++;
        Container var2;
        if (class214.field3211 != null) {
            var2 = class214.field3211;
        } else if (class696.field9834 != null) {
            var2 = class696.field9834;
        } else if (class486.field6999 == null) {
            var2 = class181.field2502;
        } else {
            var2 = class486.field6999;
        }
        var2.setLayout(null);
        class95.field1383 = new class596(this);
        var2.add(class95.field1383);
        class95.field1383.setSize(class68.field1042, class565.field8187);
        class95.field1383.setVisible(true);
        if (class696.field9834 == var2) {
            Insets var3 = class696.field9834.getInsets();
            class95.field1383.setLocation(class658.field9423 + var3.left, class26.field232 + var3.top);
        } else {
            class95.field1383.setLocation(class658.field9423, class26.field232);
        }
        class95.field1383.addFocusListener(this);
        if (arg0 != -1) {
            this.field3346 = true;
        }
        class95.field1383.requestFocus();
        class240.field3557 = true;
        class378.field5489 = true;
        class123.field1699 = true;
        class590.field8391 = false;
        class530.field7723 = class465.method2818(255);
    }

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "(I)V")
    public abstract void method1573(int arg0);

    @OriginalMember(owner = "client!hu", name = "run", descriptor = "()V")
    public final void run() {
        field3335++;
        try {
            if (class300.field4086 != null) {
                String var1 = class300.field4086.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class300.field4095;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1575(-13658, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class300.field4095 == null || class300.field4095.equals("1.4.2"))) {
                    this.method1575(-13658, "wrongjava");
                    return;
                }
            }
            if (class300.field4095 != null && class300.field4095.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class300.field4095.length()) {
                    char var5 = class300.field4095.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
                if (var4 >= 5) {
                    class442.field6291 = true;
                }
            }
            Applet var6 = class181.field2502;
            if (class486.field6999 != null) {
                var6 = class486.field6999;
            }
            Method var7 = class300.field4102;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class715.method4016((byte) 38);
            class215.method1517(31964);
            this.method1572(-1);
            this.method1563(-128);
            class169.field2396 = class321.method1995(-2048);
            while (class456.field6494 == 0L || class456.field6494 > class465.method2818(255)) {
                class257.field3683 = class169.field2396.method1454(100, class346.field4930);
                for (int var8 = 0; var8 < class257.field3683; var8++) {
                    this.method1571(18454);
                }
                this.method1568(true);
                class402.method2443(-80, class345.field4749, class95.field1383);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class705.method3952(this.method1556(9), var20, -29913);
            this.method1575(-13658, "crash");
        } finally {
            Object var13 = null;
            this.method1574(0, true);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V")
    private final void method1574(int arg0, boolean arg1) {
        field3321++;
        synchronized (this) {
            if (class386.field5580) {
                return;
            }
            class386.field5580 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (arg0 != 0) {
            this.getAppletContext();
        }
        if (class486.field6999 != null) {
            class486.field6999.destroy();
        }
        try {
            this.method1560(true);
        } catch (Exception var9) {
        }
        if (this.field3346) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field3346 = false;
        }
        class260.method1723(false, true);
        class641.method3703((byte) 89);
        if (class95.field1383 != null) {
            try {
                class95.field1383.removeFocusListener(this);
                class95.field1383.getParent().remove(class95.field1383);
            } catch (Exception var7) {
            }
        }
        if (class345.field4749 != null) {
            try {
                class345.field4749.method1868((byte) -120);
            } catch (Exception var6) {
            }
        }
        this.method1557(arg0 - 14530);
        if (class696.field9834 != null) {
            class696.field9834.setVisible(false);
            class696.field9834.dispose();
            class696.field9834 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1575(int arg0, String arg1) {
        if (arg0 != -13658) {
            return;
        }
        field3318++;
        if (this.field3333) {
            return;
        }
        this.field3333 = true;
        System.out.println("error_game_" + arg1);
        try {
            class665.method3803(class486.field6999, "loggedout", (byte) 78);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!hu", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3331++;
        if (class696.field9834 == null) {
            return class486.field6999 == null || class486.field6999 == this ? super.getParameter(arg0) : class486.field6999.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class378.field5489 = true;
        field3330++;
        class123.field1699 = true;
    }

    @OriginalMember(owner = "client!hu", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3336++;
    }

    @OriginalMember(owner = "client!hu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3322++;
        if (class181.field2502 != this || class386.field5580) {
            return;
        }
        class123.field1699 = true;
        if (class442.field6291 && (class465.method2818(255) - class530.field7723) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class291.field4016 <= var2.width && var2.height >= class443.field6318) {
                class590.field8391 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class486.field6999 = arg0;
        field3344++;
    }
}
