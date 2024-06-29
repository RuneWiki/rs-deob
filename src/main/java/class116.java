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

@OriginalClass("client!nq")
public abstract class class116 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "Z")
    private boolean field1629 = false;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "Z")
    private boolean field1636 = false;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public static int field1625 = 1;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "Lui;")
    public static class375 field1617 = new class375("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "Z")
    public static boolean field1641;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "Z")
    public static boolean field1642;

    static {
        new class375("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIZILjava/lang/String;II)V", line = 4)
    public final void method748(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class7.field112 = arg1;
            class503.field7496 = arg1;
            class486.field7136 = arg6;
            class529.field7811 = arg6;
            class272.field3781 = 0;
            class266.field3712 = this;
            class341.field5383 = 0;
            class339.field5363 = arg2;
            class452.field6646 = new Frame();
            class452.field6646.setTitle("Jagex");
            class452.field6646.setResizable(true);
            class452.field6646.addWindowListener(this);
            class452.field6646.setVisible(true);
            class452.field6646.toFront();
            Insets var9 = class452.field6646.getInsets();
            class452.field6646.setSize(var9.right + var9.left + class503.field7496, class529.field7811 + var9.top + var9.bottom);
            class440.field6549 = class419.field6254 = new class469(null, arg7, arg5, arg4);
            class125 var10 = class419.field6254.method2792(1, this, -10265);
            if (arg0) {
                field1617 = null;
            }
            while (var10.field1791 == 0) {
                class106.method710(10L, (byte) 6);
            }
        } catch (Exception var12) {
            class438.method2644(null, -1, var12);
        }
        field1609++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 46)
    public String method464(boolean arg0) {
        if (arg0) {
            field1620++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z", line = 57)
    public final boolean method749(byte arg0) {
        field1610++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = 90 / (arg0 / 59);
            if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
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
                    this.method752((byte) -96, "invalidhost");
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "start", descriptor = "()V", line = 98)
    public final void start() {
        field1632++;
        if (class266.field3712 == this && !class251.field3480) {
            class31.field470 = 0L;
        }
    }

    @OriginalMember(owner = "client!nq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 111)
    public final synchronized void paint(Graphics arg0) {
        field1614++;
        if (class266.field3712 != this || class251.field3480) {
            return;
        }
        class471.field6883 = true;
        if (class457.field6702 && class264.method1698(true) - class391.field5941 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class503.field7496 && var2.height >= class529.field7811) {
                class315.field4814 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 133)
    public final void focusGained(FocusEvent arg0) {
        class308.field4556 = true;
        field1615++;
        class471.field6883 = true;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V", line = 142)
    public final synchronized void method750(int arg0) {
        if (class245.field3430 != null) {
            class245.field3430.removeFocusListener(this);
            class245.field3430.getParent().remove(class245.field3430);
        }
        field1616++;
        Container var2;
        if (class260.field3628 != null) {
            var2 = class260.field3628;
        } else if (class452.field6646 == null) {
            var2 = class419.field6254.field6861;
        } else {
            var2 = class452.field6646;
        }
        var2.setLayout(null);
        class245.field3430 = new class274(this);
        var2.add(class245.field3430);
        class245.field3430.setSize(class7.field112, class486.field7136);
        class245.field3430.setVisible(true);
        if (class452.field6646 == var2) {
            Insets var3 = class452.field6646.getInsets();
            class245.field3430.setLocation(class272.field3781 + var3.left, var3.top - -class341.field5383);
        } else {
            class245.field3430.setLocation(class272.field3781, class341.field5383);
        }
        class245.field3430.addFocusListener(this);
        class245.field3430.requestFocus();
        class289.field4300 = true;
        class308.field4556 = true;
        if (arg0 != 0) {
            this.method755(false, (byte) 36);
        }
        class471.field6883 = true;
        class315.field4814 = false;
        class391.field5941 = class264.method1698(true);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V", line = 192)
    public static void method751(boolean arg0) {
        field1617 = null;
        if (!arg0) {
            field1617 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 202)
    public final void windowActivated(WindowEvent arg0) {
        field1621++;
    }

    @OriginalMember(owner = "client!nq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 213)
    public final void focusLost(FocusEvent arg0) {
        field1633++;
        class308.field4556 = false;
    }

    @OriginalMember(owner = "client!nq", name = "stop", descriptor = "()V", line = 221)
    public final void stop() {
        field1631++;
        if (class266.field3712 == this && !class251.field3480) {
            class31.field470 = class264.method1698(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!nq", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 235)
    public final URL getCodeBase() {
        field1630++;
        if (class452.field6646 == null) {
            return class419.field6254 == null || class419.field6254.field6861 == this ? super.getCodeBase() : class419.field6254.field6861.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 253)
    public final String getParameter(String arg0) {
        field1627++;
        if (class452.field6646 == null) {
            return class419.field6254 == null || class419.field6254.field6861 == this ? super.getParameter(arg0) : class419.field6254.field6861.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 268)
    public final void windowIconified(WindowEvent arg0) {
        field1605++;
    }

    @OriginalMember(owner = "client!nq", name = "destroy", descriptor = "()V", line = 276)
    public final void destroy() {
        field1603++;
        if (class266.field3712 == this && !class251.field3480) {
            class31.field470 = class264.method1698(true);
            class106.method710(5000L, (byte) 6);
            class440.field6549 = null;
            this.method755(false, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!nq", name = "providesignlink", descriptor = "(Lhu;)V", line = 290)
    public static final void providesignlink(class469 arg0) {
        class419.field6254 = arg0;
        class440.field6549 = arg0;
        field1608++;
    }

    @OriginalMember(owner = "client!nq", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 298)
    public final void windowDeiconified(WindowEvent arg0) {
        field1628++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLjava/lang/String;)V", line = 313)
    public final void method752(byte arg0, String arg1) {
        field1613++;
        if (this.field1636) {
            return;
        }
        this.field1636 = true;
        if (arg0 >= -6) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            class131.method841(class419.field6254.field6861, -14144, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!nq", name = "run", descriptor = "()V", line = 339)
    public final void run() {
        try {
            label108: {
                if (class469.field6855 != null) {
                    String var1 = class469.field6855.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class469.field6851;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method752((byte) -116, "wrongjava");
                            break label108;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class469.field6851 == null || class469.field6851.equals("1.4.2"))) {
                        this.method752((byte) -80, "wrongjava");
                        break label108;
                    }
                }
                if (class469.field6851 != null && class469.field6851.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class469.field6851.length() > var3) {
                        char var5 = class469.field6851.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class457.field6702 = true;
                    }
                }
                if (class419.field6254.field6861 != null) {
                    Method var6 = class469.field6865;
                    if (var6 != null) {
                        try {
                            var6.invoke(class419.field6254.field6861, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class363.method2292((byte) 57);
                class1.method3(13);
                this.method750(0);
                this.method469(0);
                class211.field2976 = class180.method1291(false);
                this.method754(true);
                while (class31.field470 == 0L || class264.method1698(true) < class31.field470) {
                    class473.field6911 = class211.field2976.method337(class24.field360, 8);
                    for (int var7 = 0; var7 < class473.field6911; var7++) {
                        this.method756(0);
                    }
                    this.method757(-128);
                    class194.method1368(class245.field3430, 60, class419.field6254);
                }
            }
        } catch (Throwable var10) {
            class438.method2644(this.method464(true), -1, var10);
            this.method752((byte) -116, "crash");
        }
        field1637++;
        this.method755(true, (byte) -116);
    }

    @OriginalMember(owner = "client!nq", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 454)
    public final void windowClosed(WindowEvent arg0) {
        field1606++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZIII)V", line = 463)
    public final void method753(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1634++;
        try {
            if (class266.field3712 == null) {
                class339.field5363 = arg0;
                if (!arg1) {
                    class7.field112 = arg4;
                    class503.field7496 = arg4;
                    class266.field3712 = this;
                    class272.field3781 = 0;
                    class486.field7136 = arg3;
                    class529.field7811 = arg3;
                    class341.field5383 = 0;
                    if (class419.field6254 == null) {
                        class440.field6549 = class419.field6254 = new class469(this, arg2, null, 0);
                    }
                    class125 var6 = class419.field6254.method2792(1, this, -10265);
                    while (var6.field1791 == 0) {
                        class106.method710(10L, (byte) 6);
                    }
                }
            } else {
                class233.field3308++;
                if (class233.field3308 >= 3) {
                    this.method752((byte) -106, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class438.method2644(null, -1, var8);
            this.method752((byte) -76, "crash");
        }
    }

    @OriginalMember(owner = "client!nq", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 519)
    public final URL getDocumentBase() {
        field1619++;
        if (class452.field6646 == null) {
            return class419.field6254 == null || class419.field6254.field6861 == this ? super.getDocumentBase() : class419.field6254.field6861.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 539)
    public final AppletContext getAppletContext() {
        field1604++;
        if (class452.field6646 == null) {
            return class419.field6254 == null || class419.field6254.field6861 == this ? super.getAppletContext() : class419.field6254.field6861.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 554)
    public final void windowDeactivated(WindowEvent arg0) {
        field1623++;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(Z)V", line = 561)
    public final void method754(boolean arg0) {
        field1622++;
        if (!arg0 || this.field1629) {
            return;
        }
        try {
            class125 var2 = class419.field6254.method2811(class266.field3712.getClass(), 0);
            while (var2.field1791 == 0) {
                class106.method710(100L, (byte) 6);
            }
            if (var2.field1793 != null) {
                throw (Throwable) var2.field1793;
            }
            jagmisc.init();
            this.field1629 = true;
            class211.field2976 = class180.method1291(false);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZB)V", line = 595)
    private final void method755(boolean arg0, byte arg1) {
        field1611++;
        synchronized (this) {
            if (class251.field3480) {
                return;
            }
            class251.field3480 = true;
        }
        if (class419.field6254.field6861 != null) {
            class419.field6254.field6861.destroy();
        }
        try {
            this.method467(116);
        } catch (Exception var11) {
        }
        if (arg1 >= -114) {
            return;
        }
        if (this.field1629) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field1629 = false;
        }
        class125 var4 = class419.field6254.method2809(class266.field3712.getClass(), -31183);
        while (var4.field1791 == 0) {
            class106.method710(100L, (byte) 6);
        }
        if (class245.field3430 != null) {
            try {
                class245.field3430.removeFocusListener(this);
                class245.field3430.getParent().remove(class245.field3430);
            } catch (Exception var9) {
            }
        }
        if (class419.field6254 != null) {
            try {
                class419.field6254.method2793(3584);
            } catch (Exception var8) {
            }
        }
        this.method451((byte) 114);
        if (class452.field6646 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!nq", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 676)
    public final void update(Graphics arg0) {
        field1618++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V", line = 684)
    private final void method756(int arg0) {
        field1607++;
        long var2 = class264.method1698(true);
        long var4 = class479.field7004[class398.field6055];
        class479.field7004[class398.field6055] = var2;
        class398.field6055 = class398.field6055 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            if (arg0 != 0) {
                return;
            }
            class289.field4300 = class308.field4556;
        }
        this.method471(false);
    }

    @OriginalMember(owner = "client!nq", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 716)
    public final void windowOpened(WindowEvent arg0) {
        field1624++;
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V", line = 724)
    private final void method757(int arg0) {
        int var2 = 20 % ((arg0 + 84) / 36);
        field1626++;
        long var3 = class264.method1698(true);
        long var5 = class498.field7276[class62.field887];
        class498.field7276[class62.field887] = var3;
        if (var5 != 0L && var5 < var3) {
            int var7 = (int) (var3 - var5);
            class167.field2433 = ((var7 >> 1) + 32000) / var7;
        }
        class62.field887 = class62.field887 + 1 & 0x1F;
        if (class326.field4999++ > 50) {
            class471.field6883 = true;
            class326.field4999 -= 50;
            class245.field3430.setSize(class7.field112, class486.field7136);
            class245.field3430.setVisible(true);
            if (class452.field6646 != null && class260.field3628 == null) {
                Insets var8 = class452.field6646.getInsets();
                class245.field3430.setLocation(var8.left + class272.field3781, class341.field5383 + var8.top);
            } else {
                class245.field3430.setLocation(class272.field3781, class341.field5383);
            }
        }
        this.method468(6417);
    }

    @OriginalMember(owner = "client!nq", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 776)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1612++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public abstract void method469(int arg0);

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    public abstract void method467(int arg0);

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(Z)V")
    public abstract void method471(boolean arg0);

    @OriginalMember(owner = "client!nq", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V")
    public abstract void method468(int arg0);

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
    public abstract void method451(byte arg0);
}
