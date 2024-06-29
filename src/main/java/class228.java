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

@OriginalClass("client!tk")
public abstract class class228 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "Z")
    private boolean field3392 = false;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "Z")
    private boolean field3399 = false;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3367 = 10;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "Lri;")
    public static class73 field3398 = new class73(22, -2);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "Z")
    public static boolean field3407;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "Z")
    public static boolean field3408;

    @OriginalMember(owner = "client!tk", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3389++;
        if (class214.field3119 == null) {
            return class483.field7077 == null || class483.field7077.field6462 == this ? super.getDocumentBase() : class483.field7077.field6462.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIILjava/lang/String;BZI)V")
    public final void method1556(int arg0, int arg1, int arg2, int arg3, String arg4, byte arg5, boolean arg6, int arg7) {
        try {
            class320.field4580 = 0;
            class4.field57 = arg7;
            class293.field4195 = arg7;
            class527.field7802 = arg0;
            class500.field7363 = 0;
            class468.field6899 = this;
            class116.field1743 = arg2;
            class453.field6721 = arg2;
            class214.field3119 = new Frame();
            class214.field3119.setTitle("Jagex");
            class214.field3119.setResizable(true);
            class214.field3119.addWindowListener(this);
            class214.field3119.setVisible(true);
            class214.field3119.toFront();
            Insets var9 = class214.field3119.getInsets();
            class214.field3119.setSize(class293.field4195 + var9.left + var9.right, class453.field6721 - -var9.top + var9.bottom);
            class183.field2679 = class483.field7077 = new class432(null, arg1, arg4, arg3);
            class281 var10 = class483.field7077.method2595(this, 1, 121);
            if (arg5 <= 2) {
                this.getCodeBase();
            }
            while (var10.field4032 == 0) {
                class246.method1659((byte) 117, 10L);
            }
        } catch (Exception var12) {
            class235.method1598(var12, null, (byte) 70);
        }
        field3382++;
    }

    @OriginalMember(owner = "client!tk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3400++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public abstract void method1334(byte arg0);

    @OriginalMember(owner = "client!tk", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3375++;
        if (class214.field3119 == null) {
            return class483.field7077 == null || class483.field7077.field6462 == this ? super.getAppletContext() : class483.field7077.field6462.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "providesignlink", descriptor = "(Lji;)V")
    public static final void providesignlink(class432 arg0) {
        class483.field7077 = arg0;
        class183.field2679 = arg0;
        field3391++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z")
    public final boolean method1557(int arg0) {
        field3385++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != -1) {
                this.method1558((byte) 113);
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
                this.method1567("invalidhost", (byte) 113);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3380++;
    }

    @OriginalMember(owner = "client!tk", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3402++;
    }

    @OriginalMember(owner = "client!tk", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3366++;
    }

    @OriginalMember(owner = "client!tk", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3397++;
        this.destroy();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public abstract void method1326(boolean arg0);

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
    public final synchronized void method1558(byte arg0) {
        field3369++;
        if (arg0 != -25) {
            this.focusLost(null);
        }
        if (class364.field5570 != null) {
            class364.field5570.removeFocusListener(this);
            class364.field5570.getParent().remove(class364.field5570);
        }
        Container var2;
        if (class82.field1255 != null) {
            var2 = class82.field1255;
        } else if (class214.field3119 == null) {
            var2 = class483.field7077.field6462;
        } else {
            var2 = class214.field3119;
        }
        var2.setLayout(null);
        class364.field5570 = new class361(this);
        var2.add(class364.field5570);
        class364.field5570.setSize(class4.field57, class116.field1743);
        class364.field5570.setVisible(true);
        if (class214.field3119 == var2) {
            Insets var3 = class214.field3119.getInsets();
            class364.field5570.setLocation(class320.field4580 + var3.left, class500.field7363 + var3.top);
        } else {
            class364.field5570.setLocation(class320.field4580, class500.field7363);
        }
        class364.field5570.addFocusListener(this);
        class364.field5570.requestFocus();
        class521.field7697 = true;
        class464.field6875 = true;
        class155.field2286 = true;
        class291.field4174 = false;
        class2.field35 = class256.method1708((byte) 118);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)V")
    private final void method1559(int arg0, boolean arg1) {
        field3383++;
        synchronized (this) {
            if (class502.field7366) {
                return;
            }
            class502.field7366 = true;
            if (arg0 > -66) {
                this.windowActivated(null);
            }
        }
        if (class483.field7077.field6462 != null) {
            class483.field7077.field6462.destroy();
        }
        try {
            this.method1315(58);
        } catch (Exception var11) {
        }
        if (this.field3392) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3392 = false;
        }
        class281 var4 = class483.field7077.method2572(class468.field6899.getClass(), 0);
        while (var4.field4032 == 0) {
            class246.method1659((byte) 117, 100L);
        }
        if (class364.field5570 != null) {
            try {
                class364.field5570.removeFocusListener(this);
                class364.field5570.getParent().remove(class364.field5570);
            } catch (Exception var9) {
            }
        }
        if (class483.field7077 != null) {
            try {
                class483.field7077.method2578(109);
            } catch (Exception var8) {
            }
        }
        this.method1320(-11);
        if (class214.field3119 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)Ljava/lang/String;")
    public String method1319(byte arg0) {
        field3372++;
        if (arg0 != -96) {
            this.method1334((byte) -74);
        }
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3384++;
        class464.field6875 = false;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public abstract void method1320(int arg0);

    @OriginalMember(owner = "client!tk", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V")
    public static void method1560(boolean arg0) {
        if (arg0) {
            field3398 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3395++;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
    public final void method1561(int arg0) {
        field3378++;
        if (!this.field3392) {
            try {
                class281 var2 = class483.field7077.method2592(class468.field6899.getClass(), true);
                while (var2.field4032 == 0) {
                    class246.method1659((byte) 117, 100L);
                }
                if (var2.field4030 != null) {
                    throw (Throwable) var2.field4030;
                }
                jagmisc.init();
                this.field3392 = true;
                class134.field2050 = class495.method2970(8);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != -1) {
            this.field3392 = true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3368++;
    }

    @OriginalMember(owner = "client!tk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3374++;
        if (class468.field6899 != this || class502.field7366) {
            return;
        }
        class155.field2286 = true;
        if (class331.field4688 && (class256.method1708((byte) 118) - class2.field35) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class293.field4195 <= var2.width && class453.field6721 <= var2.height) {
                class291.field4174 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
    public abstract void method1325(int arg0);

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
    public abstract void method1315(int arg0);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(JZZII)Ljava/lang/String;")
    public static final String method1562(long arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field3377++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        if (!arg2) {
            return null;
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)V")
    public static final void method1563(byte arg0, int arg1) {
        field3388++;
        int var2 = class317.field4559 - class86.field1320;
        if (var2 >= 100) {
            class140.field2103 = 1;
            return;
        }
        int var3 = (int) class24.field262;
        if (class378.field5767 >> 8 > var3) {
            var3 = class378.field5767 >> 8;
        }
        if (class189.field2793[4] && var3 < (class441.field6592[4] + 128)) {
            var3 = class441.field6592[4] + 128;
        }
        int var4 = (int) class382.field5792 + class333.field4696 & 0x3FFF;
        if (arg0 != -3) {
            field3367 = -76;
        }
        class306.method1928(class366.field5598, 34235791, var4, (var3 >> 3) * 3 + 600 << 0, class377.method2316(class500.field7365.field1769, false, class500.field7365.field1763, class79.field1192) - 50, class48.field774, arg1, var3);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class260.field3827 = (int) ((float) (class260.field3827 - class235.field3485) * var5 + (float) class235.field3485);
        class18.field195 = (int) ((float) (class18.field195 - class261.field3838) * var5 + (float) class261.field3838);
        class24.field258 = (int) ((float) (class24.field258 - class38.field465) * var5 + (float) class38.field465);
        class291.field4175 = (int) ((float) (class291.field4175 - class485.field7116) * var5 + (float) class485.field7116);
        int var6 = class259.field3812 - class19.field216;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class259.field3812 = (int) ((float) var6 * var5 + (float) class19.field216);
        class259.field3812 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!tk", name = "stop", descriptor = "()V")
    public final void stop() {
        field3370++;
        if (class468.field6899 == this && !class502.field7366) {
            class115.field1734 = class256.method1708((byte) 118) + 4000L;
        }
    }

    @OriginalMember(owner = "client!tk", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3371++;
        if (class468.field6899 == this && !class502.field7366) {
            class115.field1734 = class256.method1708((byte) 118);
            class246.method1659((byte) 117, 5000L);
            class183.field2679 = null;
            this.method1559(-70, false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
    private final void method1564(byte arg0) {
        if (arg0 > 0) {
            this.start();
        }
        field3386++;
        long var2 = class256.method1708((byte) 118);
        long var4 = class88.field1341[class363.field5569];
        class88.field1341[class363.field5569] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class33.field348 = ((var6 >> 1) + 32000) / var6;
        }
        class363.field5569 = class363.field5569 + 1 & 0x1F;
        if (class308.field4442++ > 50) {
            class308.field4442 -= 50;
            class155.field2286 = true;
            class364.field5570.setSize(class4.field57, class116.field1743);
            class364.field5570.setVisible(true);
            if (class214.field3119 != null && class82.field1255 == null) {
                Insets var7 = class214.field3119.getInsets();
                class364.field5570.setLocation(var7.left + class320.field4580, class500.field7363 + var7.top);
            } else {
                class364.field5570.setLocation(class320.field4580, class500.field7363);
            }
        }
        this.method1334((byte) -93);
    }

    @OriginalMember(owner = "client!tk", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3401++;
        if (class214.field3119 == null) {
            return class483.field7077 == null || class483.field7077.field6462 == this ? super.getParameter(arg0) : class483.field7077.field6462.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label108: {
                if (class432.field6461 != null) {
                    String var1 = class432.field6461.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class432.field6457;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1567("wrongjava", (byte) 113);
                            break label108;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class432.field6457 == null || class432.field6457.equals("1.4.2"))) {
                        this.method1567("wrongjava", (byte) 113);
                        break label108;
                    }
                }
                if (class432.field6457 != null && class432.field6457.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class432.field6457.length()) {
                        char var5 = class432.field6457.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = -(-var5 - var4 * 10) - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class331.field4688 = true;
                    }
                }
                if (class483.field7077.field6462 != null) {
                    Method var6 = class432.field6476;
                    if (var6 != null) {
                        try {
                            var6.invoke(class483.field7077.field6462, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class425.method2550(0);
                class385.method2353(13400);
                this.method1558((byte) -25);
                this.method1326(false);
                class134.field2050 = class495.method2970(8);
                this.method1561(-1);
                while (class115.field1734 == 0L || class256.method1708((byte) 118) < class115.field1734) {
                    class69.field1043 = class134.field2050.method842((byte) 101, class65.field974);
                    for (int var7 = 0; var7 < class69.field1043; var7++) {
                        this.method1565(0);
                    }
                    this.method1564((byte) -34);
                    class382.method2329((byte) 73, class483.field7077, class364.field5570);
                }
            }
        } catch (Throwable var10) {
            class235.method1598(var10, this.method1319((byte) -96), (byte) 43);
            this.method1567("crash", (byte) 113);
        }
        field3403++;
        this.method1559(-94, true);
    }

    @OriginalMember(owner = "client!tk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class464.field6875 = true;
        field3396++;
        class155.field2286 = true;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
    private final void method1565(int arg0) {
        field3376++;
        long var2 = class256.method1708((byte) 118);
        long var4 = class377.field5759[class341.field4860];
        class377.field5759[class341.field4860] = var2;
        class341.field4860 = class341.field4860 + 1 & 0x1F;
        boolean var10000;
        if ((long) arg0 == var4 || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class521.field7697 = class464.field6875;
        }
        this.method1325(12647);
    }

    @OriginalMember(owner = "client!tk", name = "start", descriptor = "()V")
    public final void start() {
        field3394++;
        if (class468.field6899 == this && !class502.field7366) {
            class115.field1734 = 0L;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIB)V")
    public final void method1566(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3393++;
        try {
            if (class468.field6899 == null) {
                class4.field57 = arg1;
                class293.field4195 = arg1;
                class320.field4580 = 0;
                class527.field7802 = arg0;
                class468.field6899 = this;
                class500.field7363 = 0;
                class116.field1743 = arg3;
                class453.field6721 = arg3;
                if (arg4 <= 96) {
                    field3379 = -103;
                }
                if (class483.field7077 == null) {
                    class183.field2679 = class483.field7077 = new class432(this, arg2, null, 0);
                }
                class281 var6 = class483.field7077.method2595(this, 1, 82);
                while (var6.field4032 == 0) {
                    class246.method1659((byte) 117, 10L);
                }
            } else {
                class79.field1195++;
                if (class79.field1195 >= 3) {
                    this.method1567("alreadyloaded", (byte) 113);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class235.method1598(var8, null, (byte) 58);
            this.method1567("crash", (byte) 113);
        }
    }

    @OriginalMember(owner = "client!tk", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3390++;
        if (class214.field3119 == null) {
            return class483.field7077 == null || class483.field7077.field6462 == this ? super.getCodeBase() : class483.field7077.field6462.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1567(String arg0, byte arg1) {
        field3373++;
        if (this.field3399) {
            return;
        }
        if (arg1 != 113) {
            this.field3399 = false;
        }
        this.field3399 = true;
        System.out.println("error_game_" + arg0);
        try {
            class501.method2995("loggedout", (byte) -37, class483.field7077.field6462);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!tk", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3381++;
    }

    static {
        new class475(null, "geschickt werden.", null, null);
    }
}
