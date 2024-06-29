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

@OriginalClass("client!bs")
public abstract class class631 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "Z")
    private boolean field8818 = false;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "Z")
    private boolean field8816 = false;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public static int field8808 = 0;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public static int field8829 = 100;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "Lfc;")
    public static class235 field8805 = new class235(69, 2);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!bs", name = "O", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!bs", name = "Q", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!bs", name = "T", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!bs", name = "U", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!bs", name = "W", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "Z")
    public static boolean field8834;

    @OriginalMember(owner = "client!bs", name = "R", descriptor = "Z")
    public static boolean field8840;

    @OriginalMember(owner = "client!bs", name = "S", descriptor = "Z")
    public static boolean field8841;

    @OriginalMember(owner = "client!bs", name = "V", descriptor = "Z")
    public static boolean field8844;

    @OriginalMember(owner = "client!bs", name = "X", descriptor = "Z")
    public static boolean field8846;

    @OriginalMember(owner = "client!bs", name = "Y", descriptor = "Z")
    public static boolean field8847;

    @OriginalMember(owner = "client!bs", name = "Z", descriptor = "Z")
    public static boolean field8848;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    private final void method3500(byte arg0) {
        field8804++;
        long var2 = class680.method3756(-109);
        long var4 = class453.field6319[class240.field3452];
        class453.field6319[class240.field3452] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class240.field3452 = class240.field3452 + 1 & 0x1F;
        synchronized (this) {
            class368.field5268 = class291.field4387;
        }
        this.method1662(false);
        if (arg0 < 65) {
            this.method1640((byte) -8);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
    public abstract void method1651(boolean arg0);

    @OriginalMember(owner = "client!bs", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!bs", name = "run", descriptor = "()V")
    public final void run() {
        field8828++;
        try {
            if (class79.field1093 != null) {
                String var1 = class79.field1093.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class79.field1096;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3510(10, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class79.field1096 == null || class79.field1096.equals("1.4.2"))) {
                    this.method3510(10, "wrongjava");
                    return;
                }
            }
            if (class79.field1096 != null && class79.field1096.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class79.field1096.length()) {
                    char var5 = class79.field1096.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class520.field7084 = true;
                }
            }
            Applet var6 = class374.field5299;
            if (class188.field2779 != null) {
                var6 = class188.field2779;
            }
            Method var7 = class79.field1098;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class225.method1434(119);
            class16.method80(0);
            this.method3503((byte) -128);
            this.method1649(500000);
            class258.field3683 = class336.method2027(0);
            while (class605.field8437 == 0L || class605.field8437 > class680.method3756(-35)) {
                class565.field7621 = class258.field3683.method2417(class173.field2588, 0);
                for (int var8 = 0; var8 < class565.field7621; var8++) {
                    this.method3500((byte) 76);
                }
                this.method3501((byte) 105);
                class88.method663(class105.field1413, class503.field6878, true);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class139.method985((byte) -52, this.method1659(11), var20);
            this.method3510(10, "crash");
        } finally {
            Object var13 = null;
            this.method3509(true, (byte) -48);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
    private final void method3501(byte arg0) {
        field8826++;
        long var2 = class680.method3756(-117);
        if (arg0 != 105) {
            this.focusGained(null);
        }
        long var4 = class46.field692[class417.field5878];
        class46.field692[class417.field5878] = var2;
        class417.field5878 = class417.field5878 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class454.field6343 = ((var6 >> 1) + 32000) / var6;
        }
        if (class448.field6273++ > 50) {
            class448.field6273 -= 50;
            class192.field2835 = true;
            class105.field1413.setSize(class547.field7412, class124.field1711);
            class105.field1413.setVisible(true);
            if (class166.field2513 != null && class164.field2504 == null) {
                Insets var7 = class166.field2513.getInsets();
                class105.field1413.setLocation(class486.field6753 + var7.left, class508.field6968 + var7.top);
            } else {
                class105.field1413.setLocation(class486.field6753, class508.field6968);
            }
        }
        this.method1651(true);
    }

    @OriginalMember(owner = "client!bs", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field8812++;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V")
    public abstract void method1640(byte arg0);

    @OriginalMember(owner = "client!bs", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field8821++;
    }

    @OriginalMember(owner = "client!bs", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field8811++;
        class291.field4387 = false;
    }

    @OriginalMember(owner = "client!bs", name = "stop", descriptor = "()V")
    public final void stop() {
        field8815++;
        if (class374.field5299 == this && !class605.field8416) {
            class605.field8437 = class680.method3756(-93) + 4000L;
        }
    }

    @OriginalMember(owner = "client!bs", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field8803++;
        if (class166.field2513 == null) {
            return class188.field2779 == null || class188.field2779 == this ? super.getAppletContext() : class188.field2779.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field8832++;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Z")
    public final boolean method3502(int arg0) {
        if (arg0 != 10) {
            this.method1662(true);
        }
        field8833++;
        return class307.method1881("jaclib", false);
    }

    @OriginalMember(owner = "client!bs", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class188.field2779 = arg0;
        field8822++;
    }

    @OriginalMember(owner = "client!bs", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field8809++;
        if (class374.field5299 != this || class605.field8416) {
            return;
        }
        class192.field2835 = true;
        if (class520.field7084 && (class680.method3756(-22) - class550.field7447) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class43.field650 <= var2.width && var2.height >= class693.field9716) {
                class76.field1043 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Ljava/lang/String;")
    public String method1659(int arg0) {
        if (arg0 == 11) {
            field8797++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)V")
    public final synchronized void method3503(byte arg0) {
        field8819++;
        if (class105.field1413 != null) {
            class105.field1413.removeFocusListener(this);
            class105.field1413.getParent().remove(class105.field1413);
        }
        Container var2;
        if (class164.field2504 != null) {
            var2 = class164.field2504;
        } else if (class166.field2513 != null) {
            var2 = class166.field2513;
        } else if (class188.field2779 == null) {
            var2 = class374.field5299;
        } else {
            var2 = class188.field2779;
        }
        var2.setLayout(null);
        class105.field1413 = new class316(this);
        if (arg0 >= -124) {
            field8829 = -5;
        }
        var2.add(class105.field1413);
        class105.field1413.setSize(class547.field7412, class124.field1711);
        class105.field1413.setVisible(true);
        if (class166.field2513 == var2) {
            Insets var3 = class166.field2513.getInsets();
            class105.field1413.setLocation(class486.field6753 + var3.left, class508.field6968 + var3.top);
        } else {
            class105.field1413.setLocation(class486.field6753, class508.field6968);
        }
        class105.field1413.addFocusListener(this);
        class105.field1413.requestFocus();
        class368.field5268 = true;
        class291.field4387 = true;
        class192.field2835 = true;
        class76.field1043 = false;
        class550.field7447 = class680.method3756(-77);
    }

    @OriginalMember(owner = "client!bs", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field8817++;
    }

    @OriginalMember(owner = "client!bs", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field8820++;
        if (class166.field2513 == null) {
            return class188.field2779 == null || class188.field2779 == this ? super.getCodeBase() : class188.field2779.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class291.field4387 = true;
        field8824++;
        class192.field2835 = true;
    }

    @OriginalMember(owner = "client!bs", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field8798++;
    }

    @OriginalMember(owner = "client!bs", name = "start", descriptor = "()V")
    public final void start() {
        field8810++;
        if (class374.field5299 == this && !class605.field8416) {
            class605.field8437 = 0L;
        }
    }

    @OriginalMember(owner = "client!bs", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field8813++;
    }

    @OriginalMember(owner = "client!bs", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field8806++;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIILjava/lang/String;ZII)V")
    public final void method3504(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5, int arg6) {
        field8830++;
        if (arg4) {
            return;
        }
        try {
            if (class374.field5299 == null) {
                class508.field6968 = 0;
                class547.field7412 = arg2;
                class43.field650 = arg2;
                class120.field1595 = class188.field2779;
                class486.field6753 = 0;
                class124.field1711 = arg1;
                class693.field9716 = arg1;
                class374.field5299 = this;
                class18.field266 = arg6;
                class694.field9752 = class503.field6878 = new class79(arg5, arg3, arg0, class188.field2779 != null);
                class260 var8 = class503.field6878.method625(1, this, (byte) -94);
                while (var8.field3702 == 0) {
                    class419.method2390(28, 10L);
                }
            } else {
                class136.field1925++;
                if (class136.field1925 >= 3) {
                    this.method3510(10, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class139.method985((byte) -118, null, var10);
            this.method3510(10, "crash");
        }
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V")
    public abstract void method1657(int arg0);

    @OriginalMember(owner = "client!bs", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field8807++;
        if (class166.field2513 == null) {
            return class188.field2779 == null || class188.field2779 == this ? super.getParameter(arg0) : class188.field2779.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILjava/lang/String;BIZII)V")
    public final void method3505(int arg0, int arg1, String arg2, byte arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field8800++;
        try {
            class508.field6968 = 0;
            class486.field6753 = 0;
            class124.field1711 = arg1;
            class693.field9716 = arg1;
            if (arg3 > 15) {
                class547.field7412 = arg4;
                class43.field650 = arg4;
                class18.field266 = arg6;
                class374.field5299 = this;
                class120.field1595 = null;
                class166.field2513 = new Frame();
                class166.field2513.setTitle("Jagex");
                class166.field2513.setResizable(true);
                class166.field2513.addWindowListener(this);
                class166.field2513.setVisible(true);
                class166.field2513.toFront();
                Insets var9 = class166.field2513.getInsets();
                class166.field2513.setSize(class43.field650 + var9.left + var9.right, var9.top + var9.bottom + class693.field9716);
                class694.field9752 = class503.field6878 = new class79(arg7, arg2, arg0, true);
                class260 var10 = class503.field6878.method625(1, this, (byte) -94);
                while (var10.field3702 == 0) {
                    class419.method2390(56, 10L);
                }
            }
        } catch (Exception var12) {
            class139.method985((byte) -88, null, var12);
        }
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)Z")
    public final boolean method3506(int arg0) {
        field8825++;
        int var2 = -86 / ((-arg0 - 67) / 57);
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        if (var3.equals("jagex.com") || var3.endsWith(".jagex.com")) {
            return true;
        } else if (var3.equals("runescape.com") || var3.endsWith(".runescape.com")) {
            return true;
        } else if (var3.equals("stellardawn.com") || var3.endsWith(".stellardawn.com")) {
            return true;
        } else if (var3.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var3.length() > 0 && var3.charAt(var3.length() - 1) >= '0' && var3.charAt(var3.length() - 1) <= '9') {
                var3 = var3.substring(0, var3.length() - 1);
            }
            if (var3.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method3510(10, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field8814++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lva;IIIIII)V")
    public static final void method3507(class457 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8801++;
        class223.method1431(arg3, arg1, arg2, arg0.field509, false, arg6, arg4, arg5, arg0.field514, arg0.field520);
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(B)Z")
    public final boolean method3508(byte arg0) {
        if (arg0 != 68) {
            this.method1651(false);
        }
        field8799++;
        return class307.method1881("jagmisc", false);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)V")
    public abstract void method1662(boolean arg0);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZB)V")
    private final void method3509(boolean arg0, byte arg1) {
        field8831++;
        if (arg1 != -48) {
            this.method3505(-109, -1, null, (byte) -72, 56, true, 122, 5);
        }
        synchronized (this) {
            if (class605.field8416) {
                return;
            }
            class605.field8416 = true;
        }
        if (class188.field2779 != null) {
            class188.field2779.destroy();
        }
        try {
            this.method1657(arg1 ^ 0x79);
        } catch (Exception var10) {
        }
        if (this.field8816) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field8816 = false;
        }
        class373.method2178(true, (byte) 82);
        class272.method1638(35);
        if (class105.field1413 != null) {
            try {
                class105.field1413.removeFocusListener(this);
                class105.field1413.getParent().remove(class105.field1413);
            } catch (Exception var8) {
            }
        }
        if (class503.field6878 != null) {
            try {
                class503.field6878.method617(-109);
            } catch (Exception var7) {
            }
        }
        this.method1640((byte) 58);
        if (class166.field2513 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
    public abstract void method1649(int arg0);

    @OriginalMember(owner = "client!bs", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field8827++;
        if (class374.field5299 == this && !class605.field8416) {
            class605.field8437 = class680.method3756(-30);
            class419.method2390(38, 5000L);
            class694.field9752 = null;
            this.method3509(false, (byte) -48);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method3510(int arg0, String arg1) {
        field8802++;
        if (this.field8818) {
            return;
        }
        this.field8818 = true;
        System.out.println("error_game_" + arg1);
        try {
            if (arg0 != 10) {
                this.field8816 = true;
            }
            class2.method11("loggedout", class188.field2779, 21190);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!bs", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field8823++;
        if (class166.field2513 == null) {
            return class188.field2779 == null || class188.field2779 == this ? super.getDocumentBase() : class188.field2779.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
    public static void method3511(int arg0) {
        field8805 = null;
        int var1 = 26 % ((27 - arg0) / 52);
    }
}
