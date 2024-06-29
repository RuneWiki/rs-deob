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

@OriginalClass("client!ed")
public abstract class class96 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Z")
    private boolean field1672 = false;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field1664 = 1;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Lub;")
    public static class227 field1675 = class257.method1749(" )2> <col=ffffff>", 17263);

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Lub;")
    public static class227 field1682 = class257.method1749("loc)3dat", 17263);

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Lrb;")
    public static class254 field1681 = new class254(30);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "Z")
    public static boolean field1691;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "Z")
    public static boolean field1693;

    @OriginalMember(owner = "client!ed", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1665++;
        if (class130.field2272 == null) {
            return class61.field1123 == null || class61.field1123.field4153 == this ? super.getParameter(arg0) : class61.field1123.field4153.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1678++;
    }

    @OriginalMember(owner = "client!ed", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1668++;
    }

    @OriginalMember(owner = "client!ed", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1662++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public final synchronized void method588(int arg0) {
        field1663++;
        if (class172.field2875 != null) {
            class172.field2875.removeFocusListener(this);
            class172.field2875.getParent().remove(class172.field2875);
        }
        if (class12.field237 != null) {
            class12.field237.getParent().remove(class12.field237);
            class12.field237 = null;
        }
        Container var2;
        if (class20.field359 != null) {
            var2 = class20.field359;
        } else if (class130.field2272 == null) {
            var2 = class61.field1123.field4153;
        } else {
            var2 = class130.field2272;
        }
        var2.setLayout((LayoutManager) null);
        if (class4.field91 != 0) {
            class12.field237 = new class120(this);
            var2.add(class12.field237);
            class12.field237.setSize(class49.field867, class4.field91);
            class12.field237.setVisible(true);
            if (class130.field2272 == var2) {
                Insets var3 = class130.field2272.getInsets();
                class12.field237.setLocation(var3.left, var3.top);
            } else {
                class12.field237.setLocation(0, 0);
            }
        }
        class172.field2875 = new class120(this);
        var2.add(class172.field2875);
        class172.field2875.setSize(class49.field867, class208.field3538);
        class172.field2875.setVisible(true);
        if (class130.field2272 == var2) {
            Insets var4 = class130.field2272.getInsets();
            class172.field2875.setLocation(var4.left, var4.top + class4.field91);
        } else {
            class172.field2875.setLocation(0, class4.field91);
        }
        class172.field2875.addFocusListener(this);
        if (arg0 >= -56) {
            return;
        }
        class172.field2875.requestFocus();
        class73.field1280 = true;
        class65.field1194 = true;
        class174.field2903 = true;
        class5.field114 = false;
        class88.field1525 = class12.method57(-106);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lub;I)Lbk;")
    public static final class194 method589(class227 arg0, int arg1) {
        field1684++;
        if (arg0.method1521((byte) 74) == 0) {
            return null;
        }
        for (class194 var2 = (class194) class30.field482.method1277(94); var2 != null; var2 = (class194) class30.field482.method1271(250)) {
            if (var2.field3302.method1516((byte) 53, arg0)) {
                return var2;
            }
        }
        if (arg1 <= 107) {
            providesignlink((class239) null);
        }
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1686++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method590(byte arg0) {
        field1681 = null;
        field1675 = null;
        if (arg0 > -11) {
            method590((byte) 18);
        }
        field1682 = null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    private final void method591(int arg0) {
        field1658++;
        if (arg0 >= -7) {
            return;
        }
        long var2 = class12.method57(-111);
        long var4 = class251.field4340[class138.field2407];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class251.field4340[class138.field2407] = var2;
        class138.field2407 = class138.field2407 + 1 & 0x1F;
        synchronized (this) {
            class65.field1194 = class73.field1280;
        }
        this.method504(-116);
    }

    @OriginalMember(owner = "client!ed", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ed", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class73.field1280 = false;
        field1683++;
    }

    @OriginalMember(owner = "client!ed", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1670++;
        if (class130.field2272 == null) {
            return class61.field1123 == null || class61.field1123.field4153 == this ? super.getAppletContext() : class61.field1123.field4153.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1688++;
        if (class130.field2272 == null) {
            return class61.field1123 == null || class61.field1123.field4153 == this ? super.getCodeBase() : class61.field1123.field4153.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public abstract void method489(boolean arg0);

    @OriginalMember(owner = "client!ed", name = "providesignlink", descriptor = "(Lth;)V")
    public static final void providesignlink(class239 arg0) {
        class61.field1123 = arg0;
        class165.field2766 = arg0;
        field1657++;
    }

    @OriginalMember(owner = "client!ed", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1689++;
        class73.field1280 = true;
        class174.field2903 = true;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Z")
    public final boolean method592(byte arg0) {
        field1680++;
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
            }
            this.method597("invalidhost", true);
            if (arg0 != -127) {
                this.destroy();
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "run", descriptor = "()V")
    public final void run() {
        field1687++;
        try {
            if (class239.field4166 != null) {
                String var1 = class239.field4166.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class239.field4152;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method597("wrongjava", true);
                        return;
                    }
                    class192.field3271 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class239.field4152 == null || class239.field4152.equals("1.4.2"))) {
                    this.method597("wrongjava", true);
                    return;
                }
            }
            if (class61.field1123.field4153 != null) {
                Method var3 = class239.field4155;
                if (var3 != null) {
                    try {
                        var3.invoke(class61.field1123.field4153, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method588(-95);
            class14.field263 = class182.method1162(class172.field2875, class49.field867, class208.field3538, -95);
            this.method488(false);
            class176.field2938 = class34.method179(0);
            while (class42.field687 == 0L || class12.method57(-91) < class42.field687) {
                class66.field1199 = class176.field2938.method535(6724, class192.field3271, class235.field4077);
                for (int var4 = 0; var4 < class66.field1199; var4++) {
                    this.method591(-63);
                }
                this.method595((byte) -3);
                class148.method937(class172.field2875, (byte) 78, class61.field1123);
            }
        } catch (Exception var7) {
            class149.method949((String) null, var7, -121);
            this.method597("crash", true);
        }
        this.method596(true, -5808);
    }

    @OriginalMember(owner = "client!ed", name = "start", descriptor = "()V")
    public final void start() {
        field1661++;
        if (class59.field1098 == this && !class161.field2735) {
            class42.field687 = 0L;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
    public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1656++;
        try {
            if (class59.field1098 == null) {
                class208.field3538 = arg0;
                if (arg3 != -7101) {
                    field1675 = null;
                }
                class49.field867 = arg4;
                class59.field1098 = this;
                class58.field1071 = arg2;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class61.field1123 == null) {
                    class165.field2766 = class61.field1123 = new class239(false, this, arg1, (String) null, 0);
                }
                class61.field1123.method1596(1, 0, this);
            } else {
                class203.field3468++;
                if (class203.field3468 >= 3) {
                    this.method597("alreadyloaded", true);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class149.method949((String) null, var8, -117);
            this.method597("crash", true);
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public abstract void method504(int arg0);

    @OriginalMember(owner = "client!ed", name = "stop", descriptor = "()V")
    public final void stop() {
        field1677++;
        if (class59.field1098 == this && !class161.field2735) {
            class42.field687 = class12.method57(-102) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ed", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1671++;
        if (class59.field1098 == this && !class161.field2735) {
            class42.field687 = class12.method57(-83);
            class171.method1088(91, 5000L);
            class165.field2766 = null;
            this.method596(false, -5808);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field1666++;
        class49 var10 = null;
        for (class49 var11 = (class49) class190.field3214.method1277(98); var11 != null; var11 = (class49) class190.field3214.method1271(250)) {
            if (var11.field873 == arg8 && var11.field856 == arg9 && var11.field866 == arg7 && var11.field860 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class49();
            var10.field856 = arg9;
            var10.field873 = arg8;
            var10.field860 = arg3;
            var10.field866 = arg7;
            class197.method1264(var10, (byte) -6);
            class190.field3214.method1272(5664, var10);
        }
        var10.field870 = arg2;
        var10.field865 = arg1;
        var10.field861 = arg5;
        if (arg6 != -109) {
            field1675 = null;
        }
        var10.field859 = arg4;
        var10.field862 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1660++;
    }

    @OriginalMember(owner = "client!ed", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1690++;
    }

    @OriginalMember(owner = "client!ed", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1655++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ed", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1654++;
        if (class130.field2272 == null) {
            return class61.field1123 == null || class61.field1123.field4153 == this ? super.getDocumentBase() : class61.field1123.field4153.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public abstract void method497(int arg0);

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V")
    private final void method595(byte arg0) {
        if (arg0 != -3) {
            field1681 = null;
        }
        field1676++;
        long var2 = class12.method57(-104);
        long var4 = class214.field3616[class228.field3987];
        class214.field3616[class228.field3987] = var2;
        class228.field3987 = class228.field3987 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class188.field3203 = ((var6 >> 1) + 32000) / var6;
        }
        if (class91.field1561++ > 50) {
            class174.field2903 = true;
            class91.field1561 -= 50;
            class172.field2875.setSize(class49.field867, class208.field3538);
            class172.field2875.setVisible(true);
            if (class130.field2272 != null && class20.field359 == null) {
                Insets var7 = class130.field2272.getInsets();
                class172.field2875.setLocation(var7.left, class4.field91 + var7.top);
            } else {
                class172.field2875.setLocation(0, class4.field91);
            }
        }
        this.method489(true);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)V")
    private final void method596(boolean arg0, int arg1) {
        field1685++;
        synchronized (this) {
            if (class161.field2735) {
                return;
            }
            class161.field2735 = true;
        }
        if (class61.field1123.field4153 != null) {
            class61.field1123.field4153.destroy();
        }
        try {
            this.method499((byte) -44);
        } catch (Exception var9) {
        }
        if (arg1 != -5808) {
            return;
        }
        if (class172.field2875 != null) {
            try {
                class172.field2875.removeFocusListener(this);
                class172.field2875.getParent().remove(class172.field2875);
            } catch (Exception var8) {
            }
        }
        if (class61.field1123 != null) {
            try {
                class61.field1123.method1594(arg1 ^ 0xFFFFE93D);
            } catch (Exception var7) {
            }
        }
        this.method497(-26);
        if (class130.field2272 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ed", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1673++;
        if (class59.field1098 != this || class161.field2735) {
            return;
        }
        class174.field2903 = true;
        if (class239.field4152 != null && class239.field4152.startsWith("1.5") && class12.method57(-91) - class88.field1525 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class49.field867 <= var2.width && var2.height >= class208.field3538) {
                class5.field114 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
    public abstract void method499(byte arg0);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
    public abstract void method488(boolean arg0);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method597(String arg0, boolean arg1) {
        field1669++;
        if (this.field1672) {
            return;
        }
        this.field1672 = arg1;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ed", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1679++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;IIIIIZ)V")
    public final void method598(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1659++;
        try {
            class59.field1098 = this;
            class208.field3538 = arg1;
            class49.field867 = arg3;
            class58.field1071 = arg4;
            class130.field2272 = new Frame();
            class130.field2272.setTitle("Jagex");
            class130.field2272.setResizable(arg6);
            class130.field2272.addWindowListener(this);
            class130.field2272.setVisible(true);
            class130.field2272.toFront();
            Insets var8 = class130.field2272.getInsets();
            class130.field2272.setSize(var8.right + arg3 + var8.left, var8.bottom + arg1 + var8.top);
            class165.field2766 = class61.field1123 = new class239(true, (Applet) null, arg2, arg0, arg5);
            class61.field1123.method1596(1, 0, this);
        } catch (Exception var10) {
            class149.method949((String) null, var10, -125);
        }
    }
}
