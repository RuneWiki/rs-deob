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

@OriginalClass("client!rc")
public abstract class class21 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Z")
    private boolean field386 = false;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Z")
    private boolean field404 = false;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field393 = 0;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "[I")
    public static int[] field391 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "[I")
    public static int[] field397 = new int[16384];

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
    public static int[] field385 = new int[16384];

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "[[I")
    public static int[][] field405;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "F")
    public static float field406;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "Z")
    public static boolean field411;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "Z")
    public static boolean field412;

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class481.field7012 = false;
        field382++;
    }

    @OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field392++;
        if (class516.field7590 == null) {
            return class172.field2221 == null || class172.field2221.field6139 == this ? super.getParameter(arg0) : class172.field2221.field6139.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZII)V")
    public final void method137(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field380++;
        try {
            if (class405.field5435 == null) {
                class92.field1281 = arg0;
                class18.field303 = arg0;
                class351.field4495 = 0;
                class23.field419 = arg3;
                class403.field5424 = arg3;
                class405.field5435 = this;
                class509.field7474 = 0;
                class284.field3628 = arg4;
                if (class172.field2221 == null) {
                    class449.field6252 = class172.field2221 = new class441(this, arg1, null, 0);
                }
                if (arg2) {
                    class277 var6 = class172.field2221.method2620(this, 1, 83);
                    while (var6.field3542 == 0) {
                        class463.method2773(10L, -10);
                    }
                }
            } else {
                class222.field2868++;
                if (class222.field2868 >= 3) {
                    this.method144("alreadyloaded", 11);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class375.method2192((byte) -89, var8, null);
            this.method144("crash", 11);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public final void method138(byte arg0) {
        if (arg0 >= -57) {
            this.destroy();
        }
        field373++;
        if (this.field386) {
            return;
        }
        try {
            class277 var2 = class172.field2221.method2615(true, class405.field5435.getClass());
            while (var2.field3542 == 0) {
                class463.method2773(100L, -116);
            }
            if (var2.field3541 != null) {
                throw (Throwable) var2.field3541;
            }
            jagmisc.init();
            this.field386 = true;
            class353.field4530 = class395.method2343((byte) -80);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    private final void method139(int arg0) {
        field403++;
        long var2 = class173.method1134(true);
        long var4 = class489.field7138[class428.field5869];
        class489.field7138[class428.field5869] = var2;
        class428.field5869 = class428.field5869 + arg0 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class130.field1775 = ((var6 >> 1) + 32000) / var6;
        }
        if (class44.field665++ > 50) {
            class436.field5982 = true;
            class44.field665 -= 50;
            class272.field3454.setSize(class23.field419, class92.field1281);
            class272.field3454.setVisible(true);
            if (class516.field7590 != null && class460.field6432 == null) {
                Insets var7 = class516.field7590.getInsets();
                class272.field3454.setLocation(class351.field4495 + var7.left, class509.field7474 + var7.top);
            } else {
                class272.field3454.setLocation(class351.field4495, class509.field7474);
            }
        }
        this.method146(0);
    }

    @OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field379++;
    }

    @OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field388++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BZI)V")
    public static final void method140(byte arg0, boolean arg1, int arg2) {
        field374++;
        class378 var3 = class188.method1235(arg1, (byte) -122, arg2);
        int var4 = -95 % ((-arg0 - 61) / 50);
        if (var3 != null) {
            var3.method3021(35);
        }
    }

    @OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field387++;
        if (class516.field7590 == null) {
            return class172.field2221 == null || class172.field2221.field6139 == this ? super.getAppletContext() : class172.field2221.field6139.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field372++;
        this.destroy();
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Z")
    public final boolean method141(int arg0) {
        field369++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 > -102) {
            field397 = null;
        }
        if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method144("invalidhost", 11);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field368++;
    }

    @OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field402++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public abstract void method142(boolean arg0);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public final synchronized void method143(int arg0) {
        field381++;
        if (class272.field3454 != null) {
            class272.field3454.removeFocusListener(this);
            class272.field3454.getParent().remove(class272.field3454);
        }
        if (arg0 <= 23) {
            return;
        }
        Container var2;
        if (class460.field6432 != null) {
            var2 = class460.field6432;
        } else if (class516.field7590 == null) {
            var2 = class172.field2221.field6139;
        } else {
            var2 = class516.field7590;
        }
        var2.setLayout(null);
        class272.field3454 = new class285(this);
        var2.add(class272.field3454);
        class272.field3454.setSize(class23.field419, class92.field1281);
        class272.field3454.setVisible(true);
        if (class516.field7590 == var2) {
            Insets var3 = class516.field7590.getInsets();
            class272.field3454.setLocation(var3.left + class351.field4495, var3.top - -class509.field7474);
        } else {
            class272.field3454.setLocation(class351.field4495, class509.field7474);
        }
        class272.field3454.addFocusListener(this);
        class272.field3454.requestFocus();
        class481.field7012 = true;
        class35.field546 = true;
        class436.field5982 = true;
        class108.field1481 = false;
        class495.field7243 = class173.method1134(true);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method144(String arg0, int arg1) {
        field400++;
        if (this.field404) {
            return;
        }
        this.field404 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != 11) {
                this.method151(-12);
            }
            class425.method2515(class172.field2221.field6139, "loggedout", -27401);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public abstract void method145(byte arg0);

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public abstract void method146(int arg0);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static void method147(byte arg0) {
        field385 = null;
        field397 = null;
        field391 = null;
        if (arg0 != -61) {
            method140((byte) -81, true, -27);
        }
        field405 = null;
    }

    @OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field371++;
        if (class405.field5435 == this && !class77.field985) {
            class386.field5078 = class173.method1134(true);
            class463.method2773(5000L, 121);
            class449.field6252 = null;
            this.method150(false, 127);
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    public static final void method148(byte arg0) {
        class198.field2557 = null;
        if (arg0 != -109) {
            method153(true);
        }
        class202.field2648 = -1;
        field394++;
    }

    @OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field399++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public abstract void method149(int arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
    private final void method150(boolean arg0, int arg1) {
        field384++;
        synchronized (this) {
            if (class77.field985) {
                return;
            }
            class77.field985 = true;
        }
        if (class172.field2221.field6139 != null) {
            class172.field2221.field6139.destroy();
        }
        try {
            this.method142(true);
        } catch (Exception var12) {
        }
        if (this.field386) {
            try {
                jagmisc.quit();
            } catch (Throwable var11) {
            }
            this.field386 = false;
        }
        int var4 = -2 / ((42 - arg1) / 47);
        class277 var5 = class172.field2221.method2627((byte) -98, class405.field5435.getClass());
        while (var5.field3542 == 0) {
            class463.method2773(100L, 58);
        }
        if (class272.field3454 != null) {
            try {
                class272.field3454.removeFocusListener(this);
                class272.field3454.getParent().remove(class272.field3454);
            } catch (Exception var10) {
            }
        }
        if (class172.field2221 != null) {
            try {
                class172.field2221.method2626(-14823);
            } catch (Exception var9) {
            }
        }
        this.method149(-100);
        if (class516.field7590 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!rc", name = "start", descriptor = "()V")
    public final void start() {
        field377++;
        if (class405.field5435 == this && !class77.field985) {
            class386.field5078 = 0L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
    public final void run() {
        field367++;
        try {
            label114: {
                if (class441.field6146 != null) {
                    String var1 = class441.field6146.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class441.field6142;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method144("wrongjava", 11);
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class441.field6142 == null || class441.field6142.equals("1.4.2"))) {
                        this.method144("wrongjava", 11);
                        break label114;
                    }
                }
                if (class441.field6142 != null && class441.field6142.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class441.field6142.length() > var3) {
                        char var5 = class441.field6142.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class513.field7547 = true;
                    }
                }
                if (class172.field2221.field6139 != null) {
                    Method var6 = class441.field6157;
                    if (var6 != null) {
                        try {
                            var6.invoke(class172.field2221.field6139, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class408.method2423(-457);
                class221.method1403(-4498);
                this.method143(105);
                this.method155(9);
                class353.field4530 = class395.method2343((byte) -45);
                this.method138((byte) -103);
                while (class386.field5078 == 0L || class173.method1134(true) < class386.field5078) {
                    class382.field5032 = class353.field4530.method299(class448.field6231, true);
                    for (int var7 = 0; var7 < class382.field5032; var7++) {
                        this.method151(31);
                    }
                    this.method139(1);
                    class104.method696(class172.field2221, class272.field3454, -51);
                }
            }
        } catch (Throwable var10) {
            class375.method2192((byte) -9, var10, null);
            this.method144("crash", 11);
        }
        this.method150(true, -51);
    }

    @OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V")
    public final void stop() {
        field375++;
        if (class405.field5435 == this && !class77.field985) {
            class386.field5078 = class173.method1134(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field378++;
        if (class516.field7590 == null) {
            return class172.field2221 == null || class172.field2221.field6139 == this ? super.getDocumentBase() : class172.field2221.field6139.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field383++;
        if (class405.field5435 != this || class77.field985) {
            return;
        }
        class436.field5982 = true;
        if (class513.field7547 && class173.method1134(true) - class495.field7243 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class403.field5424 <= var2.width && var2.height >= class18.field303) {
                class108.field1481 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    private final void method151(int arg0) {
        field396++;
        long var2 = class173.method1134(true);
        long var4 = class141.field1869[class529.field7806];
        class141.field1869[class529.field7806] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class529.field7806 = arg0 & class529.field7806 + 1;
        synchronized (this) {
            class35.field546 = class481.field7012;
        }
        this.method145((byte) 117);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lsc;IIIII)V")
    public static final void method152(class265 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3363 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class83.field1033[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class86 var13 = class121.field1683[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field3363; var14++) {
                            if (arg0.field3359[var14] == var13.field1155) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field3359[arg0.field3363++] = var13.field1155;
                        if (arg0.field3363 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field3363; var15 < 4; var15++) {
            arg0.field3359[var15] = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field401++;
        class481.field7012 = true;
        class436.field5982 = true;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public static final void method153(boolean arg0) {
        field398++;
        if (class163.field2110 < 1024.0F) {
            class163.field2110 = 1024.0F;
        }
        while (class244.field3138 >= 16384.0F) {
            class244.field3138 -= 16384.0F;
        }
        if (class163.field2110 > 3072.0F) {
            class163.field2110 = 3072.0F;
        }
        while (class244.field3138 < 0.0F) {
            class244.field3138 += 16384.0F;
        }
        int var1 = class73.field926 >> 7;
        int var2 = class293.field3801 >> 7;
        int var3 = class366.method2145(class366.field4715, (byte) 113, class73.field926, class293.field3801);
        int var4 = 0;
        if (!arg0) {
            field405 = null;
        }
        if (var1 > 3 && var2 > 3 && class200.field2594 - 4 > var1 && var2 < (class118.field1647 - 4)) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class366.field4715;
                    if (var7 < 3 && class402.method2389((byte) 93, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class204.field2671.field2835 != null && class204.field2671.field2835[var7] != null) {
                        var8 = (class204.field2671.field2835[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class92.field1285[var7].method1187(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > field393) {
            field393 += (var10 - field393) / 24;
        } else if (field393 > var10) {
            field393 += (var10 - field393) / 80;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field370++;
    }

    @OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field395++;
    }

    @OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Lhs;)V")
    public static final void providesignlink(class441 arg0) {
        class172.field2221 = arg0;
        class449.field6252 = arg0;
        field376++;
    }

    @OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field390++;
        if (class516.field7590 == null) {
            return class172.field2221 == null || class172.field2221.field6139 == this ? super.getCodeBase() : class172.field2221.field6139.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;ZIIIIB)V")
    public final void method154(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        try {
            class92.field1281 = arg6;
            class18.field303 = arg6;
            class284.field3628 = arg3;
            class351.field4495 = 0;
            class405.field5435 = this;
            class23.field419 = arg4;
            class403.field5424 = arg4;
            class509.field7474 = 0;
            class516.field7590 = new Frame();
            class516.field7590.setTitle("Jagex");
            class516.field7590.setResizable(true);
            class516.field7590.addWindowListener(this);
            class516.field7590.setVisible(true);
            class516.field7590.toFront();
            int var9 = 91 % ((arg7 + 63) / 58);
            Insets var10 = class516.field7590.getInsets();
            class516.field7590.setSize(class403.field5424 + var10.left + var10.right, class18.field303 + var10.top + var10.bottom);
            class449.field6252 = class172.field2221 = new class441(null, arg0, arg1, arg5);
            class277 var11 = class172.field2221.method2620(this, 1, 82);
            while (var11.field3542 == 0) {
                class463.method2773(10L, -124);
            }
        } catch (Exception var13) {
            class375.method2192((byte) 23, var13, null);
        }
        field389++;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    public abstract void method155(int arg0);

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field385[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field397[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field405 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
        field407 = 0;
    }
}
