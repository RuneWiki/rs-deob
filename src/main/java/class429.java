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

@OriginalClass("client!ko")
public abstract class class429 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Z")
    private boolean field6083 = false;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "Z")
    private boolean field6107 = false;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "Z")
    public static boolean field6115;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "Z")
    public static boolean field6116;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "Z")
    public static boolean field6118;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "Z")
    public static boolean field6119;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "Z")
    public static boolean field6122;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "Z")
    public static boolean field6123;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Ljava/lang/String;")
    public String method1553(int arg0) {
        if (arg0 >= -39) {
            return null;
        } else {
            field6106++;
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public final synchronized void method2545(byte arg0) {
        field6105++;
        if (class166.field2390 != null) {
            class166.field2390.removeFocusListener(this);
            class166.field2390.getParent().remove(class166.field2390);
        }
        Container var2;
        if (class87.field1383 != null) {
            var2 = class87.field1383;
        } else if (class233.field3284 == null) {
            var2 = class500.field6968.field3975;
        } else {
            var2 = class233.field3284;
        }
        var2.setLayout(null);
        class166.field2390 = new class137(this);
        var2.add(class166.field2390);
        class166.field2390.setSize(class387.field5196, class134.field2128);
        class166.field2390.setVisible(true);
        if (class233.field3284 == var2) {
            Insets var3 = class233.field3284.getInsets();
            class166.field2390.setLocation(var3.left + class32.field519, class272.field3787 + var3.top);
        } else {
            class166.field2390.setLocation(class32.field519, class272.field3787);
        }
        class166.field2390.addFocusListener(this);
        class166.field2390.requestFocus();
        int var4 = -96 / ((81 - arg0) / 35);
        class408.field5783 = true;
        class248.field3446 = true;
        class190.field2693 = true;
        class640.field9316 = false;
        class175.field2513 = class488.method2835(30160);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZBIIILjava/lang/String;I)V")
    public final void method2546(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        try {
            class272.field3787 = 0;
            class399.field5693 = arg5;
            class263.field3681 = this;
            class134.field2128 = arg7;
            class178.field2543 = arg7;
            class32.field519 = 0;
            class387.field5196 = arg0;
            class342.field4611 = arg0;
            class233.field3284 = new Frame();
            class233.field3284.setTitle("Jagex");
            class233.field3284.setResizable(true);
            class233.field3284.addWindowListener(this);
            class233.field3284.setVisible(true);
            if (arg2 < 71) {
                this.method2550(-78, 101, 93, true, -33);
            }
            class233.field3284.toFront();
            Insets var9 = class233.field3284.getInsets();
            class233.field3284.setSize(var9.right + var9.left + class342.field4611, class178.field2543 + var9.bottom - -var9.top);
            class93.field1435 = class500.field6968 = new class288(null, arg4, arg6, arg3);
            class382 var10 = class500.field6968.method1848(-10, this, 1);
            while (var10.field5134 == 0) {
                class21.method220(0, 10L);
            }
        } catch (Exception var12) {
            class235.method1474(var12, null, (byte) 115);
        }
        field6095++;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Z")
    public final boolean method2547(byte arg0) {
        field6108++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 > -33) {
            return true;
        } else if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
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
                this.method2555(-64, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field6103++;
    }

    @OriginalMember(owner = "client!ko", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field6112++;
        if (class263.field3681 != this || class352.field4738) {
            return;
        }
        class190.field2693 = true;
        if (class443.field6313 && (class488.method2835(30160) - class175.field2513) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class342.field4611 <= var2.width && class178.field2543 <= var2.height) {
                class640.field9316 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field6111++;
        class248.field3446 = false;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
    public abstract void method1559(int arg0);

    @OriginalMember(owner = "client!ko", name = "providesignlink", descriptor = "(Ldj;)V")
    public static final void providesignlink(class288 arg0) {
        field6091++;
        class500.field6968 = arg0;
        class93.field1435 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field6100++;
        if (class233.field3284 == null) {
            return class500.field6968 == null || class500.field6968.field3975 == this ? super.getParameter(arg0) : class500.field6968.field3975.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field6089++;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
    public abstract void method1548(byte arg0);

    @OriginalMember(owner = "client!ko", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field6087++;
        if (class233.field3284 == null) {
            return class500.field6968 == null || class500.field6968.field3975 == this ? super.getDocumentBase() : class500.field6968.field3975.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field6092++;
    }

    @OriginalMember(owner = "client!ko", name = "run", descriptor = "()V")
    public final void run() {
        field6082++;
        try {
            label114: {
                if (class288.field3963 != null) {
                    String var1 = class288.field3963.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class288.field3976;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2555(-106, "wrongjava");
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class288.field3976 == null || class288.field3976.equals("1.4.2"))) {
                        this.method2555(-100, "wrongjava");
                        break label114;
                    }
                }
                if (class288.field3976 != null && class288.field3976.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class288.field3976.length() > var3) {
                        char var5 = class288.field3976.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + (var5 - '0');
                        var3++;
                    }
                    if (var4 >= 5) {
                        class443.field6313 = true;
                    }
                }
                if (class500.field6968.field3975 != null) {
                    Method var6 = class288.field3982;
                    if (var6 != null) {
                        try {
                            var6.invoke(class500.field6968.field3975, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class90.method653(-18808);
                class278.method1788(0);
                this.method2545((byte) 124);
                this.method1559(19611);
                class96.field1459 = class244.method1515((byte) 121);
                while (class21.field317 == 0L || class488.method2835(30160) < class21.field317) {
                    class49.field959 = class96.field1459.method1198(32625, class107.field1637);
                    for (int var7 = 0; var7 < class49.field959; var7++) {
                        this.method2552(0);
                    }
                    this.method2556(50);
                    class103.method729(class166.field2390, class500.field6968, -3);
                }
            }
        } catch (Throwable var10) {
            class235.method1474(var10, this.method1553(-93), (byte) 115);
            this.method2555(-84, "crash");
        }
        this.method2553(-115, true);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([[BBLgn;)V")
    public static final void method2548(byte[][] arg0, byte arg1, class600 arg2) {
        field6090++;
        if (arg1 != 36) {
            method2548(null, (byte) 61, null);
        }
        for (int var3 = 0; var3 < arg2.field1142; var3++) {
            class184.method1146(126);
            for (int var4 = 0; var4 < (class32.field513 >> 3); var4++) {
                for (int var5 = 0; var5 < (class611.field8786 >> 3); var5++) {
                    int var6 = class104.field1573[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x39203FE) >> 24;
                        if (!arg2.field1124 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FF9) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class183.field2585.length; var12++) {
                                if (class183.field2585[var12] == var11 && arg0[var12] != null) {
                                    arg2.method3541(var8, (var9 & 0x7) * 8, arg0[var12], var3, var7, var5 * 8, false, class69.field1165, class428.field6075, (var10 & 0x7) * 8, var4 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)Z")
    public final boolean method2549(int arg0) {
        if (arg0 >= -106) {
            this.field6083 = false;
        }
        field6114++;
        return class336.method2038(false, "jagmisc");
    }

    @OriginalMember(owner = "client!ko", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field6099++;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIZI)V")
    public final void method2550(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6085++;
        try {
            if (class263.field3681 == null) {
                class263.field3681 = this;
                if (arg3) {
                    this.field6107 = true;
                }
                class399.field5693 = arg4;
                class134.field2128 = arg2;
                class178.field2543 = arg2;
                class387.field5196 = arg1;
                class342.field4611 = arg1;
                class272.field3787 = 0;
                class32.field519 = 0;
                if (class500.field6968 == null) {
                    class93.field1435 = class500.field6968 = new class288(this, arg0, null, 0);
                }
                class382 var6 = class500.field6968.method1848(-10, this, 1);
                while (var6.field5134 == 0) {
                    class21.method220(0, 10L);
                }
            } else {
                class341.field4601++;
                if (class341.field4601 >= 3) {
                    this.method2555(-87, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class235.method1474(var8, null, (byte) 115);
            this.method2555(-109, "crash");
        }
    }

    @OriginalMember(owner = "client!ko", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field6093++;
    }

    @OriginalMember(owner = "client!ko", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ko", name = "stop", descriptor = "()V")
    public final void stop() {
        field6084++;
        if (class263.field3681 == this && !class352.field4738) {
            class21.field317 = class488.method2835(30160) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ko", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field6081++;
        if (class263.field3681 == this && !class352.field4738) {
            class21.field317 = class488.method2835(30160);
            class21.method220(0, 5000L);
            class93.field1435 = null;
            this.method2553(-124, false);
        }
    }

    @OriginalMember(owner = "client!ko", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field6101++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
    public abstract void method1552(int arg0);

    @OriginalMember(owner = "client!ko", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field6104++;
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)Z")
    public final boolean method2551(int arg0) {
        if (arg0 != 0) {
            this.stop();
        }
        field6098++;
        return class336.method2038(false, "jaclib");
    }

    @OriginalMember(owner = "client!ko", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field6088++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V")
    private final void method2552(int arg0) {
        field6113++;
        long var2 = class488.method2835(30160);
        long var4 = class394.field5553[class444.field6325];
        class394.field5553[class444.field6325] = var2;
        class444.field6325 = class444.field6325 + 1 & 0x1F;
        boolean var10000;
        if ((long) arg0 == var4 || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class408.field5783 = class248.field3446;
        }
        this.method1560((byte) 7);
    }

    @OriginalMember(owner = "client!ko", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field6102++;
        if (class233.field3284 == null) {
            return class500.field6968 == null || class500.field6968.field3975 == this ? super.getAppletContext() : class500.field6968.field3975.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V")
    private final void method2553(int arg0, boolean arg1) {
        field6109++;
        synchronized (this) {
            if (arg0 > -112) {
                return;
            }
            if (class352.field4738) {
                return;
            }
            class352.field4738 = true;
        }
        if (class500.field6968.field3975 != null) {
            class500.field6968.field3975.destroy();
        }
        try {
            this.method1552(4);
        } catch (Exception var12) {
        }
        if (this.field6107) {
            try {
                jagmisc.quit();
            } catch (Throwable var11) {
            }
            this.field6107 = false;
        }
        class138.method922(true, 123);
        class113.method785(0);
        if (class166.field2390 != null) {
            try {
                class166.field2390.removeFocusListener(this);
                class166.field2390.getParent().remove(class166.field2390);
            } catch (Exception var10) {
            }
        }
        if (class500.field6968 != null) {
            try {
                class500.field6968.method1844((byte) 55);
            } catch (Exception var9) {
            }
        }
        this.method1548((byte) 53);
        if (class233.field3284 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2554(int arg0, int arg1) {
        field6086++;
        String var2 = Integer.toString(arg1);
        if (arg0 != 0) {
            method2554(14, 90);
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class315.field4239.method739(class173.field2491, -80) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class306.field4160.method739(class173.field2491, 121) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ko", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field6094++;
        if (class233.field3284 == null) {
            return class500.field6968 == null || class500.field6968.field3975 == this ? super.getCodeBase() : class500.field6968.field3975.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "start", descriptor = "()V")
    public final void start() {
        field6110++;
        if (class263.field3681 == this && !class352.field4738) {
            class21.field317 = 0L;
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
    public abstract void method1560(byte arg0);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2555(int arg0, String arg1) {
        if (arg0 >= -60) {
            return;
        }
        field6080++;
        if (this.field6083) {
            return;
        }
        this.field6083 = true;
        System.out.println("error_game_" + arg1);
        try {
            class54.method508((byte) 56, class500.field6968.field3975, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
    private final void method2556(int arg0) {
        field6097++;
        long var2 = class488.method2835(arg0 ^ 0x75E2);
        long var4 = class31.field505[class167.field2396];
        class31.field505[class167.field2396] = var2;
        class167.field2396 = class167.field2396 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class583.field8079 = ((var6 >> 1) + 32000) / var6;
        }
        if (class2.field29++ > arg0) {
            class2.field29 -= 50;
            class190.field2693 = true;
            class166.field2390.setSize(class387.field5196, class134.field2128);
            class166.field2390.setVisible(true);
            if (class233.field3284 != null && class87.field1383 == null) {
                Insets var7 = class233.field3284.getInsets();
                class166.field2390.setLocation(var7.left + class32.field519, class272.field3787 + var7.top);
            } else {
                class166.field2390.setLocation(class32.field519, class272.field3787);
            }
        }
        this.method1537(arg0 ^ 0xFFFFFFCF);
    }

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "(I)V")
    public abstract void method1537(int arg0);

    @OriginalMember(owner = "client!ko", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class248.field3446 = true;
        field6096++;
        class190.field2693 = true;
    }
}
