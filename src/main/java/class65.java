import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class65 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "Z")
    private boolean field1625 = false;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lu;")
    public static class135 field1607 = class87.method676((byte) -111, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field1614 = -1;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lu;")
    private static class135 field1613 = class87.method676((byte) -40, "Service unavailable)3");

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "Lu;")
    public static class135 field1630 = class87.method676((byte) -47, "@lre@");

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "Z")
    public static boolean field1634 = false;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Lu;")
    private static class135 field1616 = class87.method676((byte) -102, "Error connecting to server)3");

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Lu;")
    public static class135 field1622 = field1616;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[[I")
    public static int[][] field1624 = new int[104][104];

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "Lu;")
    public static class135 field1629 = class87.method676((byte) -115, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lu;")
    public static class135 field1617 = class87.method676((byte) -59, ":0");

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[I")
    public static int[] field1632 = new int[500];

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Lu;")
    public static class135 field1641 = class87.method676((byte) -39, "(U4");

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "Lu;")
    public static class135 field1647 = field1613;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lpe;")
    public static class109 field1601;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lse;")
    public static class128 field1598;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Lvc;")
    public static class144 field1645;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[I")
    public static int[] field1608;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "[Lbc;")
    public static class11[] field1623;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public abstract void method164(int arg0);

    @OriginalMember(owner = "client!jc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1605++;
        if (class55.field1307 == null) {
            return class41.field965 == null || class41.field965.field654 == this ? super.getCodeBase() : class41.field965.field654.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "run", descriptor = "()V")
    public final void run() {
        field1642++;
        try {
            if (class27.field655 != null) {
                String var1 = class27.field655.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class27.field649;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method534("wrongjava", 20906);
                        return;
                    }
                    class78.field1850 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class27.field649 == null || class27.field649.equals("1.4.2"))) {
                    this.method534("wrongjava", 20906);
                    return;
                }
            }
            if (class41.field965.field654 != null) {
                Method var3 = class27.field648;
                if (var3 != null) {
                    try {
                        var3.invoke(class41.field965.field654, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method540(0);
            class143.field3498 = class96.method788(class60.field1530, 17433, class145.field3525, class59.field1484);
            this.method168((byte) -76);
            class79.field1879 = class107.method868((byte) -124);
            class79.field1879.method54((byte) 123);
            while (class151.field3734 == 0L || class14.method95(-23) < class151.field3734) {
                class116.field2772 = class79.field1879.method52(class78.field1850, 94, class120.field2912);
                for (int var4 = 0; var4 < class116.field2772; var4++) {
                    this.method541(97);
                }
                this.method538(true);
                class100.method824(true, -51);
            }
        } catch (Exception var7) {
            class34.method267(null, 35, var7);
            this.method534("crash", 20906);
        }
        this.method530((byte) 69);
    }

    @OriginalMember(owner = "client!jc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1627++;
    }

    @OriginalMember(owner = "client!jc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!jc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class116.field2764 = false;
        field1636++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static final void method529(byte arg0) {
        field1606++;
        class123.field2938.method234(-22666);
        if (arg0 != 118) {
            providesignlink(null);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public abstract void method165(int arg0);

    @OriginalMember(owner = "client!jc", name = "providesignlink", descriptor = "(Lde;)V")
    public static final void providesignlink(class27 arg0) {
        field1639++;
        class41.field965 = arg0;
        class111.field2690 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "start", descriptor = "()V")
    public final void start() {
        field1604++;
        if (class76.field1789 == this && !class101.field2439) {
            class151.field3734 = 0L;
        }
    }

    @OriginalMember(owner = "client!jc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1618++;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    private final synchronized void method530(byte arg0) {
        field1633++;
        if (class101.field2439) {
            return;
        }
        class101.field2439 = true;
        try {
            class59.field1484.removeFocusListener(this);
            if (arg0 != 69) {
                providesignlink(null);
            }
        } catch (Exception var5) {
        }
        try {
            this.method172(-86);
        } catch (Exception var4) {
        }
        if (class55.field1307 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class41.field965 != null) {
            try {
                class41.field965.method217(arg0 - 69);
            } catch (Exception var2) {
            }
        }
        this.method165(-51);
    }

    @OriginalMember(owner = "client!jc", name = "stop", descriptor = "()V")
    public final void stop() {
        field1640++;
        if (class76.field1789 == this && !class101.field2439) {
            class151.field3734 = class14.method95(-14) + 4000L;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lde;IIILjava/awt/Component;)Lkf;")
    public static final class75 method531(class27 arg0, int arg1, int arg2, int arg3, Component arg4) {
        field1621++;
        if (class138.field3361 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class75 var5 = (class75) Class.forName("f").getDeclaredConstructor().newInstance();
                var5.field1748 = new int[(class125.field2990 ? 2 : 1) * 256];
                var5.field1778 = arg3;
                if (arg1 != 5) {
                    field1607 = null;
                }
                var5.method278(arg4);
                var5.field1774 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field1774 > 16384) {
                    var5.field1774 = 16384;
                }
                var5.method279(var5.field1774);
                if (class95.field2315 > 0 && class22.field543 == null) {
                    class22.field543 = new class48();
                    arg0.method220(class95.field2315, false, class22.field543);
                }
                if (class22.field543 != null) {
                    if (class22.field543.field1128[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class22.field543.field1128[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class89 var6 = new class89(arg0, arg2);
                    var6.field1748 = new int[(class125.field2990 ? 2 : 1) * 256];
                    var6.field1778 = arg3;
                    var6.method278(arg4);
                    var6.field1774 = 16384;
                    var6.method279(var6.field1774);
                    if (class95.field2315 > 0 && class22.field543 == null) {
                        class22.field543 = new class48();
                        arg0.method220(class95.field2315, false, class22.field543);
                    }
                    if (class22.field543 != null) {
                        if (class22.field543.field1128[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class22.field543.field1128[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class75();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1643++;
        if (class55.field1307 == null) {
            return class41.field965 == null || class41.field965.field654 == this ? super.getParameter(arg0) : class41.field965.field654.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public abstract void method172(int arg0);

    @OriginalMember(owner = "client!jc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1611++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Z")
    public final boolean method532(boolean arg0) {
        field1620++;
        if (!arg0) {
            this.focusGained(null);
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
                this.method534("invalidhost", 20906);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1615++;
    }

    @OriginalMember(owner = "client!jc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1609++;
        if (class55.field1307 == null) {
            return class41.field965 == null || class41.field965.field654 == this ? super.getAppletContext() : class41.field965.field654.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lve;I)Z")
    public static final boolean method533(class146 arg0, int arg1) {
        field1644++;
        if (arg0.field3567 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field3567.length; var2++) {
            int var3 = class141.method1142(arg0, var2, -16647);
            int var4 = arg0.field3640[var2];
            if (arg0.field3567[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field3567[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field3567[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg1 < 110) {
            providesignlink(null);
        }
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1637++;
        if (class76.field1789 != this || class101.field2439) {
            return;
        }
        class53.field1258 = true;
        if (class27.field649 != null && class27.field649.startsWith("1.5") && class14.method95(-57) - class28.field682 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class145.field3525 <= var2.width && class60.field1530 <= var2.height) {
                class145.field3540 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method534(String arg0, int arg1) {
        field1631++;
        if (this.field1625) {
            return;
        }
        this.field1625 = true;
        System.out.println("error_game_" + arg0);
        if (arg1 != 20906) {
            this.destroy();
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIII)V")
    public final void method535(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1628++;
        try {
            if (class76.field1789 == null) {
                class99.field2390 = arg3;
                class145.field3525 = arg2;
                class60.field1530 = arg4;
                if (arg1 >= -59) {
                    field1641 = null;
                }
                class76.field1789 = this;
                if (class41.field965 == null) {
                    class111.field2690 = class41.field965 = new class27(false, this, arg0, null, 0);
                }
                class41.field965.method220(1, false, this);
            } else {
                class105.field2517++;
                if (class105.field2517 >= 3) {
                    this.method534("alreadyloaded", 20906);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            }
        } catch (Exception var7) {
            class34.method267(null, 35, var7);
            this.method534("crash", 20906);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
    public final void method536(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        try {
            class60.field1530 = arg3;
            class76.field1789 = this;
            class99.field2390 = arg2;
            class145.field3525 = arg5;
            class55.field1307 = new Frame();
            if (arg0 < 115) {
                return;
            }
            class55.field1307.setTitle("Jagex");
            class55.field1307.setResizable(false);
            class55.field1307.addWindowListener(this);
            class55.field1307.setVisible(true);
            class55.field1307.toFront();
            Insets var8 = class55.field1307.getInsets();
            class55.field1307.setSize(var8.left + arg5 + var8.right, var8.bottom + arg3 + var8.top);
            class111.field2690 = class41.field965 = new class27(true, null, arg4, arg6, arg1);
            class41.field965.method220(1, false, this);
        } catch (Exception var10) {
            class34.method267(null, 35, var10);
        }
        field1603++;
    }

    @OriginalMember(owner = "client!jc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1600++;
    }

    @OriginalMember(owner = "client!jc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class116.field2764 = true;
        field1646++;
        class53.field1258 = true;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
    public abstract void method168(byte arg0);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    public static final void method537(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        if (arg0 > 1) {
            System.exit(1);
            field1626++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1638++;
    }

    @OriginalMember(owner = "client!jc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1602++;
        if (class76.field1789 == this && !class101.field2439) {
            class151.field3734 = class14.method95(-55);
            class96.method795(5000L, 83);
            class111.field2690 = null;
            this.method530((byte) 69);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
    private final void method538(boolean arg0) {
        field1599++;
        long var2 = class14.method95(-115);
        long var4 = class143.field3496[class20.field447];
        class143.field3496[class20.field447] = var2;
        if (!arg0) {
            this.method536((byte) 16, -126, 126, 103, -101, -117, null);
        }
        class20.field447 = class20.field447 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class116.field2770 = ((var6 >> 1) + 32000) / var6;
        }
        if (class106.field2545++ > 50) {
            class53.field1258 = true;
            class106.field2545 -= 50;
            class59.field1484.setSize(class145.field3525, class60.field1530);
            class59.field1484.setVisible(true);
            if (class55.field1307 == null) {
                class59.field1484.setLocation(0, 0);
            } else {
                Insets var7 = class55.field1307.getInsets();
                class59.field1484.setLocation(var7.left, var7.top);
            }
        }
        this.method164(30500);
    }

    @OriginalMember(owner = "client!jc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1612++;
    }

    @OriginalMember(owner = "client!jc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1635++;
    }

    @OriginalMember(owner = "client!jc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1597++;
        if (class55.field1307 == null) {
            return class41.field965 == null || class41.field965.field654 == this ? super.getDocumentBase() : class41.field965.field654.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public static void method539(int arg0) {
        field1616 = null;
        field1598 = null;
        field1645 = null;
        field1608 = null;
        field1647 = null;
        field1617 = null;
        field1607 = null;
        if (arg0 != 31715) {
            field1616 = null;
        }
        field1630 = null;
        field1601 = null;
        field1613 = null;
        field1629 = null;
        field1624 = null;
        field1622 = null;
        field1632 = null;
        field1641 = null;
        field1623 = null;
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public final synchronized void method540(int arg0) {
        if (arg0 != 0) {
            this.windowClosed(null);
        }
        field1619++;
        Container var2;
        if (class55.field1307 == null) {
            var2 = class41.field965.field654;
        } else {
            var2 = class55.field1307;
        }
        if (class59.field1484 != null) {
            class59.field1484.removeFocusListener(this);
            var2.remove(class59.field1484);
        }
        class59.field1484 = new class78(this);
        var2.add(class59.field1484);
        class59.field1484.setSize(class145.field3525, class60.field1530);
        class59.field1484.setVisible(true);
        if (class55.field1307 == null) {
            class59.field1484.setLocation(0, 0);
        } else {
            Insets var3 = class55.field1307.getInsets();
            class59.field1484.setLocation(var3.left, var3.top);
        }
        class59.field1484.addFocusListener(this);
        class59.field1484.requestFocus();
        class53.field1258 = true;
        class145.field3540 = false;
        class28.field682 = class14.method95(arg0 ^ 0x5D);
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
    public abstract void method169(int arg0);

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
    private final void method541(int arg0) {
        field1610++;
        long var2 = class14.method95(100);
        long var4 = client.field510[class130.field3114];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        client.field510[class130.field3114] = var2;
        class130.field3114 = class130.field3114 + 1 & 0x1F;
        synchronized (this) {
            int var7 = 6 / ((arg0 + 60) / 48);
            class96.field2331 = class116.field2764;
        }
        this.method169(-41);
    }
}
