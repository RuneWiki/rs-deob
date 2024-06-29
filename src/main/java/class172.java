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

@OriginalClass("client!ad")
public abstract class class172 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Z")
    private boolean field2594 = false;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Z")
    private boolean field2618 = false;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "[I")
    public static int[] field2606 = new int[32];

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "[I")
    public static int[] field2626;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "[[I")
    public static int[][] field2628;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "[I")
    public static int[] field2625;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "[I")
    public static int[] field2631;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lba;")
    public static class157 field2601;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Z")
    public static boolean field2634;

    @OriginalMember(owner = "client!ad", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2630++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method1216(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class91.field1452[var1] = true;
        }
        if (arg0 != -101) {
            field2629 = -40;
        }
        field2614++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public abstract void method902(byte arg0);

    @OriginalMember(owner = "client!ad", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2602++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public static final void method1217(int arg0, int arg1) {
        class207.field3062 = 1;
        class286.field4588 = null;
        class192.field2833 = -1;
        if (arg0 != 11) {
            method1219((byte) -89);
        }
        class35.field451 = false;
        field2617++;
        class287.field4604 = -1;
        class263.field4133 = 0;
        class210.field3103 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public abstract void method914(int arg0);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1218(int arg0, String arg1) {
        field2598++;
        if (this.field2618) {
            return;
        }
        this.field2618 = true;
        System.out.println("error_game_" + arg1);
        try {
            class150.method1120(class273.field4426.field2020, false, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg0 != 2) {
            this.method1225(true, 101);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)I")
    public static final int method1219(byte arg0) {
        if (arg0 == -105) {
            field2616++;
            return class225.field3307 && class82.field1326[81] && class147.field2360 > 2 ? class149.field2385[class147.field2360 - 2] : class149.field2385[class147.field2360 - 1];
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!ad", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2604++;
    }

    @OriginalMember(owner = "client!ad", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2619++;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Z")
    public final boolean method1220(byte arg0) {
        if (arg0 <= 63) {
            return false;
        }
        field2622++;
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
                this.method1218(2, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public final synchronized void method1221(byte arg0) {
        if (arg0 > -75) {
            this.stop();
        }
        if (class12.field136 != null) {
            class12.field136.removeFocusListener(this);
            class12.field136.getParent().remove(class12.field136);
        }
        field2615++;
        Container var2;
        if (class268.field4312 != null) {
            var2 = class268.field4312;
        } else if (class195.field2881 == null) {
            var2 = class273.field4426.field2020;
        } else {
            var2 = class195.field2881;
        }
        var2.setLayout((LayoutManager) null);
        class12.field136 = new class131(this);
        var2.add(class12.field136);
        class12.field136.setSize(class179.field2677, class137.field2230);
        class12.field136.setVisible(true);
        if (class195.field2881 == var2) {
            Insets var3 = class195.field2881.getInsets();
            class12.field136.setLocation(class169.field2571 + var3.left, var3.top - -class305.field4931);
        } else {
            class12.field136.setLocation(class169.field2571, class305.field4931);
        }
        class12.field136.addFocusListener(this);
        class12.field136.requestFocus();
        class77.field1223 = true;
        class296.field4757 = true;
        class180.field2715 = true;
        class302.field4887 = false;
        class201.field2954 = class3.method14(29853);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method1222(boolean arg0) {
        field2631 = null;
        field2628 = null;
        field2606 = null;
        if (!arg0) {
            field2626 = null;
            field2601 = null;
            field2625 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
    public abstract void method916(boolean arg0);

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public final void method1223(int arg0) {
        field2605++;
        int var2 = -54 / ((42 - arg0) / 44);
        if (this.field2594) {
            return;
        }
        try {
            class60 var3 = class273.field4426.method939(true, class93.field1507.getClass());
            while (var3.field936 == 0) {
                class155.method1130(1, 100L);
            }
            if (var3.field932 != null) {
                throw (Throwable) var3.field932;
            }
            jagmisc.init();
            this.field2594 = true;
            class248.field3656 = class206.method1459((byte) -115);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!ad", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2624++;
        if (class195.field2881 == null) {
            return class273.field4426 == null || class273.field4426.field2020 == this ? super.getAppletContext() : class273.field4426.field2020.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2623++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I")
    public static final int method1224(int arg0, int arg1) {
        field2620++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1 == -45054224) {
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!ad", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2596++;
        if (class195.field2881 == null) {
            return class273.field4426 == null || class273.field4426.field2020 == this ? super.getParameter(arg0) : class273.field4426.field2020.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "run", descriptor = "()V")
    public final void run() {
        field2608++;
        try {
            if (class122.field2014 != null) {
                String var1 = class122.field2014.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class122.field2028;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1218(2, "wrongjava");
                        return;
                    }
                    class49.field678 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class122.field2028 == null || class122.field2028.equals("1.4.2"))) {
                    this.method1218(2, "wrongjava");
                    return;
                }
            }
            if (class122.field2028 != null && class122.field2028.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class122.field2028.length() > var3) {
                    char var5 = class122.field2028.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class34.field435 = true;
                }
            }
            if (class273.field4426.field2020 != null) {
                Method var6 = class122.field2031;
                if (var6 != null) {
                    try {
                        var6.invoke(class273.field4426.field2020, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class253.method1741((byte) 53);
            this.method1221((byte) -85);
            class112.field1865 = class240.method1644(class12.field136, class137.field2230, -121, class179.field2677);
            this.method914(-136);
            class248.field3656 = class206.method1459((byte) -76);
            this.method1223(117);
            while (class236.field3458 == 0L || class3.method14(29853) < class236.field3458) {
                class113.field1876 = class248.field3656.method127(class200.field2944, (byte) 122, class49.field678);
                for (int var7 = 0; var7 < class113.field1876; var7++) {
                    this.method1227((byte) 122);
                }
                this.method1226((byte) 45);
                class219.method1528((byte) 101, class273.field4426, class12.field136);
            }
        } catch (Exception var10) {
            class5.method27(-19, (String) null, var10);
            this.method1218(2, "crash");
        }
        this.method1225(true, 0);
    }

    @OriginalMember(owner = "client!ad", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2607++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V")
    private final void method1225(boolean arg0, int arg1) {
        field2621++;
        if (arg1 != 0) {
            return;
        }
        synchronized (this) {
            if (class34.field432) {
                return;
            }
            class34.field432 = true;
        }
        if (class273.field4426.field2020 != null) {
            class273.field4426.field2020.destroy();
        }
        try {
            this.method902((byte) -109);
        } catch (Exception var10) {
        }
        if (this.field2594) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field2594 = false;
        }
        class273.field4426.method928(class93.field1507.getClass(), -11628);
        if (class12.field136 != null) {
            try {
                class12.field136.removeFocusListener(this);
                class12.field136.getParent().remove(class12.field136);
            } catch (Exception var8) {
            }
        }
        if (class273.field4426 != null) {
            try {
                class273.field4426.method943(-6112);
            } catch (Exception var7) {
            }
        }
        this.method916(false);
        if (class195.field2881 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ad", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2627++;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
    public abstract void method919(int arg0);

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V")
    private final void method1226(byte arg0) {
        long var2 = class3.method14(29853);
        field2603++;
        long var4 = class165.field2536[class160.field2486];
        class165.field2536[class160.field2486] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class199.field2940 = ((var6 >> 1) + 32000) / var6;
        }
        class160.field2486 = class160.field2486 + 1 & 0x1F;
        if (arg0 != 45) {
            return;
        }
        if (class19.field194++ > 50) {
            class19.field194 -= 50;
            class180.field2715 = true;
            class12.field136.setSize(class179.field2677, class137.field2230);
            class12.field136.setVisible(true);
            if (class195.field2881 != null && class268.field4312 == null) {
                Insets var7 = class195.field2881.getInsets();
                class12.field136.setLocation(class169.field2571 + var7.left, class305.field4931 + var7.top);
            } else {
                class12.field136.setLocation(class169.field2571, class305.field4931);
            }
        }
        this.method918(1);
    }

    @OriginalMember(owner = "client!ad", name = "start", descriptor = "()V")
    public final void start() {
        field2599++;
        if (class93.field1507 == this && !class34.field432) {
            class236.field3458 = 0L;
        }
    }

    @OriginalMember(owner = "client!ad", name = "stop", descriptor = "()V")
    public final void stop() {
        field2600++;
        if (class93.field1507 == this && !class34.field432) {
            class236.field3458 = class3.method14(29853) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public abstract void method918(int arg0);

    @OriginalMember(owner = "client!ad", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2632++;
        if (class195.field2881 == null) {
            return class273.field4426 == null || class273.field4426.field2020 == this ? super.getCodeBase() : class273.field4426.field2020.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2611++;
        if (class195.field2881 == null) {
            return class273.field4426 == null || class273.field4426.field2020 == this ? super.getDocumentBase() : class273.field4426.field2020.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V")
    private final void method1227(byte arg0) {
        field2633++;
        long var2 = class64.field975[class106.field1817];
        long var4 = class3.method14(29853);
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        int var6 = -102 / ((arg0 - 10) / 58);
        class64.field975[class106.field1817] = var4;
        class106.field1817 = class106.field1817 + 1 & 0x1F;
        synchronized (this) {
            class296.field4757 = class77.field1223;
        }
        this.method919(-3036);
    }

    @OriginalMember(owner = "client!ad", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZIIILjava/lang/String;I)V")
    public final void method1228(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        try {
            class137.field2230 = arg4;
            class40.field536 = arg4;
            if (arg1 != 10) {
                return;
            }
            class155.field2412 = arg0;
            class93.field1507 = this;
            class169.field2571 = 0;
            class179.field2677 = arg7;
            class123.field2039 = arg7;
            class305.field4931 = 0;
            class195.field2881 = new Frame();
            class195.field2881.setTitle("Jagex");
            class195.field2881.setResizable(true);
            class195.field2881.addWindowListener(this);
            class195.field2881.setVisible(true);
            class195.field2881.toFront();
            Insets var9 = class195.field2881.getInsets();
            class195.field2881.setSize(class123.field2039 + var9.left + var9.right, class40.field536 - -var9.top - -var9.bottom);
            class221.field3222 = class273.field4426 = new class122((Applet) null, arg5, arg6, arg3);
            class60 var10 = class273.field4426.method941(1, 89, this);
            while (var10.field936 == 0) {
                class155.method1130(1, 10L);
            }
        } catch (Exception var12) {
            class5.method27(127, (String) null, var12);
        }
        field2591++;
    }

    @OriginalMember(owner = "client!ad", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class77.field1223 = true;
        field2613++;
        class180.field2715 = true;
    }

    @OriginalMember(owner = "client!ad", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2609++;
        class77.field1223 = false;
    }

    @OriginalMember(owner = "client!ad", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2612++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
    public static final void method1229(int arg0) {
        if (arg0 != 12) {
            providesignlink((class122) null);
        }
        field2595++;
        if (class126.field2127 == 5) {
            class126.field2127 = 6;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
    public final void method1230(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2590++;
        try {
            if (class93.field1507 == null) {
                class305.field4931 = 0;
                class169.field2571 = 0;
                class155.field2412 = arg1;
                class93.field1507 = this;
                class179.field2677 = arg4;
                class123.field2039 = arg4;
                class137.field2230 = arg0;
                class40.field536 = arg0;
                String var6 = this.getParameter("openwinjs");
                if (arg3 != 10) {
                    field2631 = null;
                }
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class273.field4426 == null) {
                    class221.field3222 = class273.field4426 = new class122(this, arg2, (String) null, 0);
                }
                class60 var7 = class273.field4426.method941(1, arg3 + 93, this);
                while (var7.field936 == 0) {
                    class155.method1130(1, 10L);
                }
            } else {
                class243.field3573++;
                if (class243.field3573 >= 3) {
                    this.method1218(arg3 ^ 0x8, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class5.method27(arg3 ^ 0x70, (String) null, var9);
            this.method1218(arg3 ^ 0x8, "crash");
        }
    }

    @OriginalMember(owner = "client!ad", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2610++;
        if (class93.field1507 != this || class34.field432) {
            return;
        }
        class180.field2715 = true;
        if (class34.field435 && class3.method14(29853) - class201.field2954 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class123.field2039 <= var2.width && var2.height >= class40.field536) {
                class302.field4887 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "providesignlink", descriptor = "(Lca;)V")
    public static final void providesignlink(class122 arg0) {
        field2597++;
        class273.field4426 = arg0;
        class221.field3222 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2592++;
        if (class93.field1507 == this && !class34.field432) {
            class236.field3458 = class3.method14(29853);
            class155.method1130(1, 5000L);
            class221.field3222 = null;
            this.method1225(false, 0);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2606[var1] = var0 - 1;
            var0 += var0;
        }
        field2626 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
        field2628 = new int[5][5000];
        field2625 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
        field2631 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }
}
