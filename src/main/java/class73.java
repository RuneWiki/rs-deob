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

@OriginalClass("client!vg")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Z")
    private boolean field1311 = false;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Z")
    public static boolean field1314 = false;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Lcf;")
    private static class93 field1316 = class147.method1066("Loaded fonts", -48);

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field1323 = 0;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[[I")
    public static int[][] field1305 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "[J")
    public static long[] field1319 = new long[500];

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "Lcf;")
    public static class93 field1337 = field1316;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Lcf;")
    public static class93 field1321 = class147.method1066("Sprites geladen)3", -48);

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field1322 = 2;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "Lcf;")
    public static class93 field1343 = class147.method1066("Gestionnaire de saisie charg-B", -48);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lhg;")
    public static class177 field1312;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "Z")
    public static boolean field1346;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "[Lnf;")
    public static class158[] field1324;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public abstract void method484(byte arg0);

    @OriginalMember(owner = "client!vg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1315++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1341++;
        if (class246.field4432 == null) {
            return class169.field2967 == null || class169.field2967.field5113 == this ? super.getParameter(arg0) : class169.field2967.field5113.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1345++;
        if (class51.field843 == this && !class208.field3721) {
            class5.field75 = class28.method155((byte) -91);
            class53.method290(5000L, true);
            class110.field1873 = null;
            this.method486(false, -72);
        }
    }

    @OriginalMember(owner = "client!vg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class61.field1035 = false;
        field1309++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public abstract void method485(int arg0);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)V")
    private final void method486(boolean arg0, int arg1) {
        field1339++;
        synchronized (this) {
            if (class208.field3721) {
                return;
            }
            class208.field3721 = true;
        }
        if (class169.field2967.field5113 != null) {
            class169.field2967.field5113.destroy();
        }
        try {
            this.method499(5);
            if (arg1 >= -24) {
                field1322 = 2;
            }
        } catch (Exception var9) {
        }
        if (class190.field3481 != null) {
            try {
                class190.field3481.removeFocusListener(this);
                class190.field3481.getParent().remove(class190.field3481);
            } catch (Exception var8) {
            }
        }
        if (class169.field2967 != null) {
            try {
                class169.field2967.method1955(false);
            } catch (Exception var7) {
            }
        }
        this.method485(127);
        if (class246.field4432 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!vg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1330++;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    private final void method487(int arg0) {
        field1318++;
        long var2 = class28.method155((byte) -41);
        long var4 = class124.field2205[class39.field599];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class124.field2205[class39.field599] = var2;
        class39.field599 = class39.field599 + 1 & 0x1F;
        int var6 = 118 / ((36 - arg0) / 61);
        synchronized (this) {
            class32.field513 = class61.field1035;
        }
        this.method484((byte) -120);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static void method488(int arg0) {
        field1319 = null;
        if (arg0 < 11) {
            field1321 = null;
        }
        field1305 = null;
        field1324 = null;
        field1312 = null;
        field1316 = null;
        field1337 = null;
        field1343 = null;
        field1321 = null;
    }

    @OriginalMember(owner = "client!vg", name = "start", descriptor = "()V")
    public final void start() {
        field1334++;
        if (class51.field843 == this && !class208.field3721) {
            class5.field75 = 0L;
        }
    }

    @OriginalMember(owner = "client!vg", name = "providesignlink", descriptor = "(Llh;)V")
    public static final void providesignlink(class286 arg0) {
        class169.field2967 = arg0;
        class110.field1873 = arg0;
        field1333++;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V")
    public abstract void method489(int arg0);

    @OriginalMember(owner = "client!vg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1332++;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public abstract void method490(byte arg0);

    @OriginalMember(owner = "client!vg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1336++;
        if (class246.field4432 == null) {
            return class169.field2967 == null || class169.field2967.field5113 == this ? super.getCodeBase() : class169.field2967.field5113.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "stop", descriptor = "()V")
    public final void stop() {
        field1344++;
        if (class51.field843 == this && !class208.field3721) {
            class5.field75 = class28.method155((byte) 110) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vg", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1331++;
    }

    @OriginalMember(owner = "client!vg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1304++;
        if (class246.field4432 == null) {
            return class169.field2967 == null || class169.field2967.field5113 == this ? super.getDocumentBase() : class169.field2967.field5113.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    private final void method491(int arg0) {
        field1325++;
        long var2 = class28.method155((byte) -42);
        long var4 = class94.field1706[class251.field4524];
        class94.field1706[class251.field4524] = var2;
        class251.field4524 = class251.field4524 + 1 & 0x1F;
        int var6 = -114 % ((12 - arg0) / 55);
        if (var4 != 0L && var2 > var4) {
            int var7 = (int) (var2 - var4);
            class156.field2765 = ((var7 >> 1) + 32000) / var7;
        }
        if (class67.field1234++ > 50) {
            class282.field5062 = true;
            class67.field1234 -= 50;
            class190.field3481.setSize(class150.field2629, class169.field2968);
            class190.field3481.setVisible(true);
            if (class246.field4432 != null && class126.field2236 == null) {
                Insets var8 = class246.field4432.getInsets();
                class190.field3481.setLocation(class112.field1920 + var8.left, var8.top - -class34.field537);
            } else {
                class190.field3481.setLocation(class112.field1920, class34.field537);
            }
        }
        this.method489(1);
    }

    @OriginalMember(owner = "client!vg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1303++;
    }

    @OriginalMember(owner = "client!vg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1338++;
        if (class246.field4432 == null) {
            return class169.field2967 == null || class169.field2967.field5113 == this ? super.getAppletContext() : class169.field2967.field5113.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Z")
    public final boolean method492(boolean arg0) {
        field1320++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (!arg0) {
                this.method487(6);
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
                this.method498("invalidhost", -95);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1326++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1307++;
        try {
            if (class51.field843 == null) {
                class169.field2968 = arg0;
                class47.field756 = arg0;
                class112.field1920 = 0;
                class150.field2629 = arg3;
                class189.field3465 = arg3;
                class50.field828 = arg4;
                class34.field537 = 0;
                class51.field843 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (arg2 != 57) {
                    this.method498((String) null, 57);
                }
                if (class169.field2967 == null) {
                    class110.field1873 = class169.field2967 = new class286(this, arg1, (String) null, 0);
                }
                class22 var7 = class169.field2967.method1960(1, this, (byte) -83);
                while (var7.field290 == 0) {
                    class53.method290(10L, true);
                }
            } else {
                class105.field1822++;
                if (class105.field1822 >= 3) {
                    this.method498("alreadyloaded", -97);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class127.method931((byte) -124, (String) null, var9);
            this.method498("crash", arg2 + 25);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Z")
    public static final boolean method494(int arg0, int arg1) {
        field1327++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 != -1) {
            method494(-49, 124);
        }
        int var2 = class216.field3942[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1007;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
    public final synchronized void method495(int arg0) {
        field1313++;
        if (class190.field3481 != null) {
            class190.field3481.removeFocusListener(this);
            class190.field3481.getParent().remove(class190.field3481);
        }
        Container var2;
        if (class126.field2236 != null) {
            var2 = class126.field2236;
        } else if (class246.field4432 == null) {
            var2 = class169.field2967.field5113;
        } else {
            var2 = class246.field4432;
        }
        if (arg0 != -13039) {
            this.method490((byte) -57);
        }
        var2.setLayout((LayoutManager) null);
        class190.field3481 = new class187(this);
        var2.add(class190.field3481);
        class190.field3481.setSize(class150.field2629, class169.field2968);
        class190.field3481.setVisible(true);
        if (class246.field4432 == var2) {
            Insets var3 = class246.field4432.getInsets();
            class190.field3481.setLocation(class112.field1920 + var3.left, class34.field537 + var3.top);
        } else {
            class190.field3481.setLocation(class112.field1920, class34.field537);
        }
        class190.field3481.addFocusListener(this);
        class190.field3481.requestFocus();
        class32.field513 = true;
        class61.field1035 = true;
        class282.field5062 = true;
        class157.field2791 = false;
        class146.field2579 = class28.method155((byte) 121);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lee;I)Lsc;")
    public static final class248 method496(class280 arg0, int arg1) {
        if (arg1 >= -28) {
            method488(-25);
        }
        field1306++;
        return new class248(arg0.method1914((byte) 54), arg0.method1914((byte) 65), arg0.method1914((byte) 47), arg0.method1914((byte) 114), arg0.method1914((byte) 77), arg0.method1914((byte) 118), arg0.method1914((byte) 49), arg0.method1914((byte) 105), arg0.method1893((byte) 85), arg0.method1907(16832));
    }

    @OriginalMember(owner = "client!vg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1340++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;ZIIIIII)V")
    public final void method497(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 8) {
            method494(-109, 1);
        }
        try {
            class112.field1920 = 0;
            class169.field2968 = arg7;
            class47.field756 = arg7;
            class150.field2629 = arg6;
            class189.field3465 = arg6;
            class50.field828 = arg2;
            class34.field537 = 0;
            class51.field843 = this;
            class246.field4432 = new Frame();
            class246.field4432.setTitle("Jagex");
            class246.field4432.setResizable(true);
            class246.field4432.addWindowListener(this);
            class246.field4432.setVisible(true);
            class246.field4432.toFront();
            Insets var9 = class246.field4432.getInsets();
            class246.field4432.setSize(var9.right + var9.left + class189.field3465, class47.field756 + var9.top + var9.bottom);
            class110.field1873 = class169.field2967 = new class286((Applet) null, arg4, arg0, arg5);
            class22 var10 = class169.field2967.method1960(1, this, (byte) -128);
            while (var10.field290 == 0) {
                class53.method290(10L, true);
            }
        } catch (Exception var12) {
            class127.method931((byte) -124, (String) null, var12);
        }
        field1342++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method498(String arg0, int arg1) {
        field1329++;
        if (this.field1311) {
            return;
        }
        this.field1311 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            int var3 = -104 / ((arg1 + 44) / 50);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!vg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1310++;
    }

    @OriginalMember(owner = "client!vg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1308++;
        if (class51.field843 != this || class208.field3721) {
            return;
        }
        class282.field5062 = true;
        if (class138.field2402 && class28.method155((byte) -106) - class146.field2579 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class189.field3465 && class47.field756 <= var2.height) {
                class157.field2791 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class61.field1035 = true;
        class282.field5062 = true;
        field1335++;
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
    public abstract void method499(int arg0);

    @OriginalMember(owner = "client!vg", name = "run", descriptor = "()V")
    public final void run() {
        field1328++;
        try {
            if (class286.field5126 != null) {
                String var1 = class286.field5126.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class286.field5114;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method498("wrongjava", -98);
                        return;
                    }
                    class53.field869 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class286.field5114 == null || class286.field5114.equals("1.4.2"))) {
                    this.method498("wrongjava", -128);
                    return;
                }
            }
            if (class286.field5114 != null && class286.field5114.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class286.field5114.length() > var3) {
                    char var5 = class286.field5114.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class138.field2402 = true;
                }
            }
            if (class169.field2967.field5113 != null) {
                Method var6 = class286.field5131;
                if (var6 != null) {
                    try {
                        var6.invoke(class169.field2967.field5113, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class95.method699((byte) 75);
            this.method495(-13039);
            class159.field2799 = class15.method66(class169.field2968, class190.field3481, false, class150.field2629);
            this.method490((byte) -119);
            class57.field945 = class85.method590(1077250604);
            while (class5.field75 == 0L || class5.field75 > class28.method155((byte) -8)) {
                class93.field1655 = class57.field945.method978(class60.field1021, 4, class53.field869);
                for (int var7 = 0; var7 < class93.field1655; var7++) {
                    this.method487(109);
                }
                this.method491(-126);
                class191.method1376(class190.field3481, (byte) 29, class169.field2967);
            }
        } catch (Exception var10) {
            class127.method931((byte) -124, (String) null, var10);
            this.method498("crash", 125);
        }
        this.method486(true, -83);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 <= 22) {
            method488(71);
        }
        field1317++;
        if (arg6 < 1 || arg4 < 1 || arg6 > 102 || arg4 > 102) {
            return;
        }
        if (!class13.method57(2357) && (class4.field53[0][arg6][arg4] & 0x2) == 0) {
            int var8 = arg3;
            if ((class4.field53[arg3][arg6][arg4] & 0x8) != 0) {
                var8 = 0;
            }
            if (class47.field767 != var8) {
                return;
            }
        }
        int var9 = arg3;
        if (arg3 < 3 && (class4.field53[1][arg6][arg4] & 0x2) == 2) {
            var9 = arg3 + 1;
        }
        class143.method1041(arg2, arg4, arg3, var9, arg6, (byte) -42, class148.field2605[arg3]);
        if (arg0 < 0) {
            return;
        }
        boolean var10 = class154.field2704;
        class154.field2704 = true;
        class90.method627(arg3, class148.field2605[arg3], arg1, -128, var9, arg6, arg7, false, arg0, false, arg4);
        class154.field2704 = var10;
        return;
    }
}
