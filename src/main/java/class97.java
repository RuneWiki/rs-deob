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

@OriginalClass("client!cf")
public abstract class class97 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
    private boolean field1445 = false;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Z")
    private boolean field1436 = false;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lec;")
    public static class25 field1437 = new class25(64);

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public static int field1457 = 0;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "[I")
    public static int[] field1459 = new int[256];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "Z")
    public static boolean field1462;

    @OriginalMember(owner = "client!cf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1431++;
        if (class179.field2788 != this || class57.field770) {
            return;
        }
        class120.field1850 = true;
        if (class86.field1354 && class267.method1841((byte) 112) - class211.field3382 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class143.field2233 && var2.height >= class131.field2013) {
                class296.field4864 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1453++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!cf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1440++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILjava/lang/String;ZZIII)V")
    public final void method617(int arg0, int arg1, String arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1432++;
        try {
            class35.field438 = 0;
            class283.field4739 = arg5;
            class179.field2788 = this;
            class187.field2896 = 0;
            if (arg4) {
                this.field1445 = true;
            }
            class79.field1254 = arg7;
            class131.field2013 = arg7;
            class169.field2644 = arg0;
            class143.field2233 = arg0;
            class224.field3565 = new Frame();
            class224.field3565.setTitle("Jagex");
            class224.field3565.setResizable(true);
            class224.field3565.addWindowListener(this);
            class224.field3565.setVisible(true);
            class224.field3565.toFront();
            Insets var9 = class224.field3565.getInsets();
            class224.field3565.setSize(class143.field2233 + var9.right + var9.left, class131.field2013 + var9.top - -var9.bottom);
            class231.field3702 = class259.field4254 = new class255((Applet) null, arg1, arg2, arg6);
            class54 var10 = class259.field4254.method1777(1, this, 2);
            while (var10.field725 == 0) {
                class96.method614(0, 10L);
            }
        } catch (Exception var12) {
            class159.method1055((String) null, -17731, var12);
        }
    }

    @OriginalMember(owner = "client!cf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1438++;
        this.destroy();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZZ)V")
    private final void method618(boolean arg0, boolean arg1) {
        field1458++;
        synchronized (this) {
            if (class57.field770) {
                return;
            }
            class57.field770 = arg1;
        }
        if (class259.field4254.field4211 != null) {
            class259.field4254.field4211.destroy();
        }
        try {
            this.method625(-106);
        } catch (Exception var10) {
        }
        if (this.field1445) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field1445 = false;
        }
        class259.field4254.method1784(-26948, class179.field2788.getClass());
        if (class113.field1701 != null) {
            try {
                class113.field1701.removeFocusListener(this);
                class113.field1701.getParent().remove(class113.field1701);
            } catch (Exception var8) {
            }
        }
        if (class259.field4254 != null) {
            try {
                class259.field4254.method1780(-67);
            } catch (Exception var7) {
            }
        }
        this.method629(112);
        if (class224.field3565 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public final synchronized void method619(int arg0) {
        if (arg0 != 1) {
            field1459 = null;
        }
        field1442++;
        if (class113.field1701 != null) {
            class113.field1701.removeFocusListener(this);
            class113.field1701.getParent().remove(class113.field1701);
        }
        Container var2;
        if (class180.field2797 != null) {
            var2 = class180.field2797;
        } else if (class224.field3565 == null) {
            var2 = class259.field4254.field4211;
        } else {
            var2 = class224.field3565;
        }
        var2.setLayout((LayoutManager) null);
        class113.field1701 = new class235(this);
        var2.add(class113.field1701);
        class113.field1701.setSize(class169.field2644, class79.field1254);
        class113.field1701.setVisible(true);
        if (class224.field3565 == var2) {
            Insets var3 = class224.field3565.getInsets();
            class113.field1701.setLocation(class187.field2896 + var3.left, class35.field438 + var3.top);
        } else {
            class113.field1701.setLocation(class187.field2896, class35.field438);
        }
        class113.field1701.addFocusListener(this);
        class113.field1701.requestFocus();
        class9.field113 = true;
        class304.field4968 = true;
        class120.field1850 = true;
        class296.field4864 = false;
        class211.field3382 = class267.method1841((byte) 102);
    }

    @OriginalMember(owner = "client!cf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1452++;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public final void method620(int arg0) {
        int var2 = 29 / ((53 - arg0) / 41);
        field1456++;
        if (this.field1445) {
            return;
        }
        try {
            class54 var3 = class259.field4254.method1783(class179.field2788.getClass(), (byte) -91);
            while (var3.field725 == 0) {
                class96.method614(0, 100L);
            }
            if (var3.field723 != null) {
                throw (Throwable) var3.field723;
            }
            jagmisc.init();
            this.field1445 = true;
            class41.field513 = class296.method2061(25666);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -98 % ((arg0 - 38) / 60);
        field1447++;
        try {
            if (class179.field2788 == null) {
                class169.field2644 = arg1;
                class143.field2233 = arg1;
                class79.field1254 = arg4;
                class131.field2013 = arg4;
                class179.field2788 = this;
                class35.field438 = 0;
                class187.field2896 = 0;
                class283.field4739 = arg3;
                String var7 = this.getParameter("openwinjs");
                boolean var10000;
                if (var7 != null && var7.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class259.field4254 == null) {
                    class231.field3702 = class259.field4254 = new class255(this, arg2, (String) null, 0);
                }
                class54 var8 = class259.field4254.method1777(1, this, 2);
                while (var8.field725 == 0) {
                    class96.method614(0, 10L);
                }
            } else {
                class216.field3440++;
                if (class216.field3440 >= 3) {
                    this.method627(-439, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var10) {
            class159.method1055((String) null, -17731, var10);
            this.method627(-439, "crash");
        }
    }

    @OriginalMember(owner = "client!cf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class9.field113 = false;
        field1441++;
    }

    @OriginalMember(owner = "client!cf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1446++;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Z")
    public final boolean method622(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1450++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 != -49) {
            return false;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method627(-439, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public abstract void method623(boolean arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    private final void method624(byte arg0) {
        if (arg0 != 75) {
            this.init();
        }
        field1427++;
        long var2 = class267.method1841((byte) 125);
        long var4 = class211.field3384[class193.field3059];
        class211.field3384[class193.field3059] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class202.field3216 = ((var6 >> 1) + 32000) / var6;
        }
        class193.field3059 = class193.field3059 + 1 & 0x1F;
        if (class146.field2297++ > 50) {
            class120.field1850 = true;
            class146.field2297 -= 50;
            class113.field1701.setSize(class169.field2644, class79.field1254);
            class113.field1701.setVisible(true);
            if (class224.field3565 != null && class180.field2797 == null) {
                Insets var7 = class224.field3565.getInsets();
                class113.field1701.setLocation(class187.field2896 + var7.left, var7.top - -class35.field438);
            } else {
                class113.field1701.setLocation(class187.field2896, class35.field438);
            }
        }
        this.method623(true);
    }

    @OriginalMember(owner = "client!cf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1448++;
        if (class224.field3565 == null) {
            return class259.field4254 == null || class259.field4254.field4211 == this ? super.getDocumentBase() : class259.field4254.field4211.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public abstract void method625(int arg0);

    @OriginalMember(owner = "client!cf", name = "providesignlink", descriptor = "(Lgj;)V")
    public static final void providesignlink(class255 arg0) {
        field1434++;
        class259.field4254 = arg0;
        class231.field3702 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1443++;
        if (class224.field3565 == null) {
            return class259.field4254 == null || class259.field4254.field4211 == this ? super.getCodeBase() : class259.field4254.field4211.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLfa;BLfa;)V")
    public static final void method626(boolean arg0, class273 arg1, byte arg2, class273 arg3) {
        if (arg2 > 29) {
            class8.field76 = arg0;
            field1426++;
            class223.field3555 = arg1;
            class292.field4815 = arg3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method627(int arg0, String arg1) {
        field1425++;
        if (this.field1436) {
            return;
        }
        this.field1436 = true;
        if (arg0 != -439) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            class291.method2038("loggedout", 20042, class259.field4254.field4211);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public abstract void method628(int arg0);

    @OriginalMember(owner = "client!cf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1428++;
    }

    @OriginalMember(owner = "client!cf", name = "start", descriptor = "()V")
    public final void start() {
        field1430++;
        if (class179.field2788 == this && !class57.field770) {
            class313.field5038 = 0L;
        }
    }

    @OriginalMember(owner = "client!cf", name = "stop", descriptor = "()V")
    public final void stop() {
        field1435++;
        if (class179.field2788 == this && !class57.field770) {
            class313.field5038 = class267.method1841((byte) 98) + 4000L;
        }
    }

    @OriginalMember(owner = "client!cf", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
    public abstract void method629(int arg0);

    @OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
    public final void run() {
        field1433++;
        try {
            if (class255.field4208 != null) {
                String var1 = class255.field4208.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class255.field4215;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method627(-439, "wrongjava");
                        return;
                    }
                    class193.field3054 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class255.field4215 == null || class255.field4215.equals("1.4.2"))) {
                    this.method627(-439, "wrongjava");
                    return;
                }
            }
            if (class255.field4215 != null && class255.field4215.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class255.field4215.length() > var3) {
                    char var5 = class255.field4215.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class86.field1354 = true;
                }
            }
            if (class259.field4254.field4211 != null) {
                Method var6 = class255.field4221;
                if (var6 != null) {
                    try {
                        var6.invoke(class259.field4254.field4211, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class314.method2125((byte) 42);
            this.method619(1);
            class301.field4942 = class262.method1818(class169.field2644, class113.field1701, class79.field1254, (byte) 95);
            this.method630(9);
            class41.field513 = class296.method2061(25666);
            this.method620(115);
            while (class313.field5038 == 0L || class313.field5038 > class267.method1841((byte) 108)) {
                class113.field1708 = class41.field513.method135((byte) -33, class125.field1920, class193.field3054);
                for (int var7 = 0; var7 < class113.field1708; var7++) {
                    this.method631(31);
                }
                this.method624((byte) 75);
                class63.method410((byte) 65, class113.field1701, class259.field4254);
            }
        } catch (Exception var10) {
            class159.method1055((String) null, -17731, var10);
            this.method627(-439, "crash");
        }
        this.method618(true, true);
    }

    @OriginalMember(owner = "client!cf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1439++;
        class9.field113 = true;
        class120.field1850 = true;
    }

    @OriginalMember(owner = "client!cf", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1455++;
        if (class179.field2788 == this && !class57.field770) {
            class313.field5038 = class267.method1841((byte) 122);
            class96.method614(0, 5000L);
            class231.field3702 = null;
            this.method618(false, true);
        }
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V")
    public abstract void method630(int arg0);

    @OriginalMember(owner = "client!cf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1444++;
    }

    @OriginalMember(owner = "client!cf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1449++;
    }

    @OriginalMember(owner = "client!cf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1451++;
        if (class224.field3565 == null) {
            return class259.field4254 == null || class259.field4254.field4211 == this ? super.getAppletContext() : class259.field4254.field4211.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)V")
    private final void method631(int arg0) {
        field1429++;
        long var2 = class267.method1841((byte) 118);
        long var4 = class194.field3070[class164.field2593];
        class194.field3070[class164.field2593] = var2;
        class164.field2593 = arg0 & class164.field2593 + 1;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class304.field4968 = class9.field113;
        }
        this.method628(arg0 - 31);
    }

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1437 = null;
        if (arg0 != 27441) {
            field1459 = null;
        }
        field1459 = null;
    }

    @OriginalMember(owner = "client!cf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1454++;
        if (class224.field3565 == null) {
            return class259.field4254 == null || class259.field4254.field4211 == this ? super.getParameter(arg0) : class259.field4254.field4211.getParameter(arg0);
        } else {
            return null;
        }
    }
}
