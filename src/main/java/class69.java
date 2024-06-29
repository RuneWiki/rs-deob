import java.applet.Applet;
import java.applet.AppletContext;
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
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class69 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Z")
    private boolean field1447 = false;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[[[Lad;")
    public static class5[][][] field1434 = new class5[4][104][104];

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[S")
    public static short[] field1442 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1466 = new CRC32();

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Z")
    public static boolean field1440;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Z")
    public static boolean field1471;

    @OriginalMember(owner = "client!h", name = "start", descriptor = "()V")
    public final void start() {
        field1454++;
        if (class125.field2604 == this && !class89.field1934) {
            class92.field2008 = 0L;
        }
    }

    @OriginalMember(owner = "client!h", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1444++;
    }

    @OriginalMember(owner = "client!h", name = "stop", descriptor = "()V")
    public final void stop() {
        field1463++;
        if (class125.field2604 == this && !class89.field1934) {
            class92.field2008 = class155.method994(65) + 4000L;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    private final void method488(byte arg0) {
        field1438++;
        long var2 = class155.method994(35);
        long var4 = class103.field2169[class97.field2074];
        class103.field2169[class97.field2074] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class118.field2505 = ((var6 >> 1) + 32000) / var6;
        }
        class97.field2074 = class97.field2074 + 1 & 0x1F;
        if (class200.field3952++ > 50) {
            class200.field3952 -= 50;
            class12.field238 = true;
            class25.field445.setSize(class170.field3460, class6.field125);
            class25.field445.setVisible(true);
            if (class141.field2907 == null) {
                class25.field445.setLocation(0, 0);
            } else {
                Insets var7 = class141.field2907.getInsets();
                class25.field445.setLocation(var7.left, var7.top);
            }
        }
        if (arg0 > 20) {
            this.method199(126);
        }
    }

    @OriginalMember(owner = "client!h", name = "run", descriptor = "()V")
    public final void run() {
        field1459++;
        try {
            if (class67.field1411 != null) {
                String var1 = class67.field1411.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class67.field1421;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method489("wrongjava", -108);
                        return;
                    }
                    class82.field1659 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class67.field1421 == null || class67.field1421.equals("1.4.2"))) {
                    this.method489("wrongjava", -111);
                    return;
                }
            }
            if (class10.field197.field1414 != null) {
                Method var3 = class67.field1416;
                if (var3 != null) {
                    try {
                        var3.invoke(class10.field197.field1414, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method495(0);
            class31.field622 = class138.method906(class25.field445, class170.field3460, -84, class6.field125);
            this.method200((byte) -124);
            class102.field2145 = class170.method1148(true);
            while (class92.field2008 == 0L || class92.field2008 > class155.method994(112)) {
                class109.field2315 = class102.field2145.method221(class138.field2849, 1, class82.field1659);
                for (int var4 = 0; var4 < class109.field2315; var4++) {
                    this.method496(14572);
                }
                this.method488((byte) 74);
                class89.method621(class10.field197, 1001, class25.field445);
            }
        } catch (Exception var7) {
            class152.method980(var7, null, true);
            this.method489("crash", -105);
        }
        this.method499(0);
    }

    @OriginalMember(owner = "client!h", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1453++;
        if (class141.field2907 == null) {
            return class10.field197 == null || class10.field197.field1414 == this ? super.getParameter(arg0) : class10.field197.field1414.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method489(String arg0, int arg1) {
        field1469++;
        if (this.field1447) {
            return;
        }
        this.field1447 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
        if (arg1 >= -84) {
            this.method202((byte) 35);
        }
    }

    @OriginalMember(owner = "client!h", name = "providesignlink", descriptor = "(Lgg;)V")
    public static final void providesignlink(class67 arg0) {
        field1458++;
        class10.field197 = arg0;
        class71.field1497 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static final void method490(int arg0) {
        if (arg0 != 0) {
            method494(-66, 78, 61, (byte) 7, 75, 111, 30, null);
        }
        field1462++;
        for (class64 var1 = (class64) class15.field266.method46(56); var1 != null; var1 = (class64) class15.field266.method53(arg0 ^ 0x766654)) {
            if (var1.field1352 == -1) {
                var1.field1361 = 0;
                class143.method930((byte) -30, var1);
            } else {
                var1.method630(50);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1456++;
        if (class141.field2907 == null) {
            return class10.field197 == null || class10.field197.field1414 == this ? super.getCodeBase() : class10.field197.field1414.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!h", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1441++;
        if (class141.field2907 == null) {
            return class10.field197 == null || class10.field197.field1414 == this ? super.getAppletContext() : class10.field197.field1414.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1436++;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public abstract void method197(int arg0);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    public abstract void method200(byte arg0);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Z")
    public final boolean method491(boolean arg0) {
        field1464++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (!arg0) {
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
                this.method489("invalidhost", -93);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BIILjava/lang/String;III)V")
    public final void method492(byte arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field1439++;
        try {
            class125.field2604 = this;
            class170.field3460 = arg6;
            class6.field125 = arg1;
            class52.field1078 = arg4;
            class141.field2907 = new Frame();
            class141.field2907.setTitle("Jagex");
            class141.field2907.setResizable(false);
            class141.field2907.addWindowListener(this);
            if (arg0 == -29) {
                class141.field2907.setVisible(true);
                class141.field2907.toFront();
                Insets var8 = class141.field2907.getInsets();
                class141.field2907.setSize(var8.left + arg6 + var8.right, arg1 - (-var8.top + -var8.bottom));
                class71.field1497 = class10.field197 = new class67(true, null, arg5, arg3, arg2);
                class10.field197.method481(1, this, (byte) 88);
            }
        } catch (Exception var10) {
            class152.method980(var10, null, true);
        }
    }

    @OriginalMember(owner = "client!h", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1467++;
    }

    @OriginalMember(owner = "client!h", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class73.field1528 = true;
        field1455++;
        class12.field238 = true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
    public static final boolean method493(int arg0, int arg1) {
        if (arg1 == 5000) {
            field1451++;
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!h", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1445++;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public abstract void method195(int arg0);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBIIILig;)V")
    public static final void method494(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class84 arg7) {
        if (class101.field2121) {
            class154.field3204 = 32;
        } else {
            class154.field3204 = 0;
        }
        class101.field2121 = false;
        field1460++;
        if (class117.field2476 != 0) {
            if (arg0 >= arg5 && arg5 + 16 > arg0 && arg1 >= arg6 && arg6 + 16 > arg1) {
                arg7.field1747 -= 4;
                class194.method1295((byte) -125, arg7);
            } else if (arg0 >= arg5 && arg5 + 16 > arg0 && arg1 >= arg4 + arg6 - 16 && arg4 + arg6 > arg1) {
                arg7.field1747 += 4;
                class194.method1295((byte) 18, arg7);
            } else if (arg5 - class154.field3204 <= arg0 && arg0 < arg5 + class154.field3204 + 16 && arg6 + 16 <= arg1 && arg6 + arg4 - 16 > arg1) {
                int var8 = (arg4 - 32) * arg4 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg1 - arg6 - var8 / 2 - 16;
                int var10 = arg4 - var8 - 32;
                arg7.field1747 = (arg2 - arg4) * var9 / var10;
                class194.method1295((byte) -116, arg7);
                class101.field2121 = true;
            }
        }
        int var11 = 103 / ((-arg3 - 70) / 37);
        if (class85.field1867 == 0) {
            return;
        }
        int var12 = arg7.field1746;
        if (arg5 - var12 <= arg0 && arg1 >= arg6 && arg5 + 16 > arg0 && arg4 + arg6 >= arg1) {
            arg7.field1747 += class85.field1867 * 45;
            class194.method1295((byte) -125, arg7);
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public final synchronized void method495(int arg0) {
        field1443++;
        if (arg0 != 0) {
            field1470 = 12;
        }
        Container var2;
        if (class141.field2907 == null) {
            var2 = class10.field197.field1414;
        } else {
            var2 = class141.field2907;
        }
        if (class25.field445 != null) {
            class25.field445.removeFocusListener(this);
            var2.remove(class25.field445);
        }
        class25.field445 = new class143(this);
        var2.add(class25.field445);
        class25.field445.setSize(class170.field3460, class6.field125);
        class25.field445.setVisible(true);
        if (class141.field2907 == null) {
            class25.field445.setLocation(0, 0);
        } else {
            Insets var3 = class141.field2907.getInsets();
            class25.field445.setLocation(var3.left, var3.top);
        }
        class25.field445.addFocusListener(this);
        class25.field445.requestFocus();
        class12.field238 = true;
        class5.field102 = false;
        class86.field1877 = class155.method994(82);
    }

    @OriginalMember(owner = "client!h", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1457++;
    }

    @OriginalMember(owner = "client!h", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1449++;
        class73.field1528 = false;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    private final void method496(int arg0) {
        field1461++;
        long var2 = class155.method994(119);
        long var4 = class88.field1927[class41.field837];
        class88.field1927[class41.field837] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class41.field837 = class41.field837 + 1 & 0x1F;
        synchronized (this) {
            class189.field3755 = class73.field1528;
        }
        if (arg0 == 14572) {
            this.method195(40);
        }
    }

    @OriginalMember(owner = "client!h", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1468++;
        if (class141.field2907 == null) {
            return class10.field197 == null || class10.field197.field1414 == this ? super.getDocumentBase() : class10.field197.field1414.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
    public abstract void method199(int arg0);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIB)V")
    public final void method497(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = 75 / ((arg4 + 45) / 57);
        field1446++;
        try {
            if (class125.field2604 == null) {
                class170.field3460 = arg1;
                class52.field1078 = arg2;
                class6.field125 = arg0;
                class125.field2604 = this;
                if (class10.field197 == null) {
                    class71.field1497 = class10.field197 = new class67(false, this, arg3, null, 0);
                }
                class10.field197.method481(1, this, (byte) 64);
            } else {
                class48.field941++;
                if (class48.field941 >= 3) {
                    this.method489("alreadyloaded", -86);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class152.method980(var8, null, true);
            this.method489("crash", -106);
        }
    }

    @OriginalMember(owner = "client!h", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1465++;
    }

    @OriginalMember(owner = "client!h", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1450++;
        if (class125.field2604 != this || class89.field1934) {
            return;
        }
        class12.field238 = true;
        if (class67.field1421 != null && class67.field1421.startsWith("1.5") && class155.method994(75) - class86.field1877 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class170.field3460 && var2.height >= class6.field125) {
                class5.field102 = true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1437++;
        if (class125.field2604 == this && !class89.field1934) {
            class92.field2008 = class155.method994(11);
            class25.method151(5000L, (byte) 0);
            class71.field1497 = null;
            this.method499(0);
        }
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
    public static void method498(int arg0) {
        field1434 = null;
        if (arg0 != 28347) {
            method498(-109);
        }
        field1466 = null;
        field1442 = null;
    }

    @OriginalMember(owner = "client!h", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1452++;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
    public abstract void method202(byte arg0);

    @OriginalMember(owner = "client!h", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1448++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
    private final synchronized void method499(int arg0) {
        field1435++;
        if (class89.field1934) {
            return;
        }
        class89.field1934 = true;
        try {
            class25.field445.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            if (arg0 != 0) {
                this.method495(-43);
            }
            this.method197(70);
        } catch (Exception var4) {
        }
        if (class141.field2907 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class10.field197 != null) {
            try {
                class10.field197.method482(6);
            } catch (Exception var2) {
            }
        }
        this.method202((byte) 92);
    }
}
