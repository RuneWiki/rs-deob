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

@OriginalClass("client!nl")
public abstract class class94 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Z")
    private boolean field1665 = false;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Lqk;")
    public static class207 field1676 = class24.method212(255, ")2");

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "Z")
    public static boolean field1685;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V")
    public final void method668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1668++;
        try {
            if (class12.field173 == null) {
                class12.field173 = this;
                class31.field625 = arg3;
                class182.field3246 = arg3;
                class107.field1906 = 0;
                class244.field4428 = arg4;
                class215.field3821 = arg4;
                class260.field4638 = arg0;
                class17.field267 = 0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class20.field326 == null) {
                    class4.field67 = class20.field326 = new class229(this, arg2, (String) null, 0);
                }
                class96 var7 = class20.field326.method1636(false, arg1, this);
                while (var7.field1696 == 0) {
                    class153.method1098((byte) 76, 10L);
                }
            } else {
                class129.field2241++;
                if (class129.field2241 >= 3) {
                    this.method671(0, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class202.method1402((String) null, 32701, var9);
            this.method671(0, "crash");
        }
    }

    @OriginalMember(owner = "client!nl", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!nl", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1669++;
        if (class272.field4794 == null) {
            return class20.field326 == null || class20.field326.field4207 == this ? super.getDocumentBase() : class20.field326.field4207.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1677++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public abstract void method669(byte arg0);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
    public abstract void method670(boolean arg0);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method671(int arg0, String arg1) {
        if (arg0 != 0) {
            return;
        }
        field1673++;
        if (this.field1665) {
            return;
        }
        this.field1665 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    private final void method672(int arg0) {
        long var2 = class53.method405(arg0 ^ 0xFFFF8ADF);
        if (arg0 != -30043) {
            this.method679(75);
        }
        long var4 = class215.field3825[class100.field1805];
        class215.field3825[class100.field1805] = var2;
        field1679++;
        class100.field1805 = class100.field1805 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class8.field110 = ((var6 >> 1) + 32000) / var6;
        }
        if ((client.field2692++) > 50) {
            client.field2692 -= 50;
            class57.field1053 = true;
            class112.field1949.setSize(class31.field625, class244.field4428);
            class112.field1949.setVisible(true);
            if (class272.field4794 != null && class126.field2189 == null) {
                Insets var7 = class272.field4794.getInsets();
                class112.field1949.setLocation(var7.left + class17.field267, class107.field1906 + var7.top);
            } else {
                class112.field1949.setLocation(class17.field267, class107.field1906);
            }
        }
        this.method678(false);
    }

    @OriginalMember(owner = "client!nl", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1671++;
    }

    @OriginalMember(owner = "client!nl", name = "providesignlink", descriptor = "(Lwc;)V")
    public static final void providesignlink(class229 arg0) {
        field1655++;
        class20.field326 = arg0;
        class4.field67 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    private final void method673(int arg0) {
        long var2 = class53.method405(56);
        field1653++;
        long var4 = class250.field4518[class51.field996];
        class250.field4518[class51.field996] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class51.field996 = class51.field996 + 1 & 0x1F;
        if (arg0 >= 70) {
            synchronized (this) {
                class150.field2631 = class98.field1737;
            }
            this.method669((byte) 6);
        }
    }

    @OriginalMember(owner = "client!nl", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1666++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!nl", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1664++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V")
    private final void method674(boolean arg0, int arg1) {
        field1670++;
        synchronized (this) {
            if (class228.field4189) {
                return;
            }
            class228.field4189 = true;
        }
        if (class20.field326.field4207 != null) {
            class20.field326.field4207.destroy();
        }
        try {
            this.method670(true);
        } catch (Exception var9) {
        }
        if (class112.field1949 != null) {
            try {
                class112.field1949.removeFocusListener(this);
                class112.field1949.getParent().remove(class112.field1949);
            } catch (Exception var8) {
            }
        }
        if (class20.field326 != null) {
            try {
                class20.field326.method1639(true);
            } catch (Exception var7) {
            }
        }
        if (arg1 != 0) {
            this.focusLost((FocusEvent) null);
        }
        this.method681(15);
        if (class272.field4794 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!nl", name = "start", descriptor = "()V")
    public final void start() {
        field1682++;
        if (class12.field173 == this && !class228.field4189) {
            class83.field1534 = 0L;
        }
    }

    @OriginalMember(owner = "client!nl", name = "run", descriptor = "()V")
    public final void run() {
        field1683++;
        try {
            if (class229.field4206 != null) {
                String var1 = class229.field4206.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class229.field4195;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method671(0, "wrongjava");
                        return;
                    }
                    class153.field2654 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class229.field4195 == null || class229.field4195.equals("1.4.2"))) {
                    this.method671(0, "wrongjava");
                    return;
                }
            }
            if (class229.field4195 != null && class229.field4195.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class229.field4195.length()) {
                    char var5 = class229.field4195.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
                if (var4 >= 5) {
                    class233.field4280 = true;
                }
            }
            if (class20.field326.field4207 != null) {
                Method var6 = class229.field4212;
                if (var6 != null) {
                    try {
                        var6.invoke(class20.field326.field4207, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class54.method407(-11863);
            this.method683(false);
            class86.field1565 = class62.method456(class244.field4428, class112.field1949, class31.field625, 0);
            this.method675(1000);
            class150.field2637 = class55.method411(-19536);
            while (class83.field1534 == 0L || class53.method405(17) < class83.field1534) {
                class97.field1716 = class150.field2637.method257(class159.field2813, class153.field2654, true);
                for (int var7 = 0; var7 < class97.field1716; var7++) {
                    this.method673(83);
                }
                this.method672(-30043);
                class74.method536(class20.field326, true, class112.field1949);
            }
        } catch (Exception var10) {
            class202.method1402((String) null, 32701, var10);
            this.method671(0, "crash");
        }
        this.method674(true, 0);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public abstract void method675(int arg0);

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static void method676(int arg0) {
        if (arg0 == -8760) {
            field1676 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1667++;
        class98.field1737 = true;
        class57.field1053 = true;
    }

    @OriginalMember(owner = "client!nl", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1661++;
        if (class272.field4794 == null) {
            return class20.field326 == null || class20.field326.field4207 == this ? super.getParameter(arg0) : class20.field326.field4207.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1663++;
        if (class272.field4794 == null) {
            return class20.field326 == null || class20.field326.field4207 == this ? super.getAppletContext() : class20.field326.field4207.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)V")
    public abstract void method678(boolean arg0);

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)Z")
    public final boolean method679(int arg0) {
        field1658++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 != 4000) {
            return true;
        } else if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
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
                this.method671(0, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1672++;
        if (class12.field173 == this && !class228.field4189) {
            class83.field1534 = class53.method405(53);
            class153.method1098((byte) 76, 5000L);
            class4.field67 = null;
            this.method674(false, 0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "stop", descriptor = "()V")
    public final void stop() {
        field1656++;
        if (class12.field173 == this && !class228.field4189) {
            class83.field1534 = class53.method405(92) + 4000L;
        }
    }

    @OriginalMember(owner = "client!nl", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1654++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLjava/lang/String;IBIIII)V")
    public final void method680(boolean arg0, String arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1675++;
        try {
            class31.field625 = arg5;
            class182.field3246 = arg5;
            class17.field267 = 0;
            if (arg3 <= 111) {
                field1684 = 71;
            }
            class260.field4638 = arg2;
            class12.field173 = this;
            class244.field4428 = arg4;
            class215.field3821 = arg4;
            class107.field1906 = 0;
            class272.field4794 = new Frame();
            class272.field4794.setTitle("Jagex");
            class272.field4794.setResizable(true);
            class272.field4794.addWindowListener(this);
            class272.field4794.setVisible(true);
            class272.field4794.toFront();
            Insets var9 = class272.field4794.getInsets();
            class272.field4794.setSize(class182.field3246 + var9.left + var9.right, class215.field3821 + var9.top + var9.bottom);
            class4.field67 = class20.field326 = new class229((Applet) null, arg6, arg1, arg7);
            class96 var10 = class20.field326.method1636(false, 1, this);
            while (var10.field1696 == 0) {
                class153.method1098((byte) 76, 10L);
            }
        } catch (Exception var12) {
            class202.method1402((String) null, 32701, var12);
        }
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V")
    public abstract void method681(int arg0);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)Lod;")
    public static final class90 method682(byte arg0) {
        if (arg0 != 88) {
            return null;
        }
        field1680++;
        class90 var1 = (class90) class174.field3129.method391(arg0 ^ 0xFFA7);
        if (var1 != null) {
            var1.method1346((byte) -16);
            var1.method244(-10368);
            return var1;
        }
        class90 var2;
        do {
            var2 = (class90) class277.field4861.method391(65535);
            if (var2 == null) {
                return null;
            }
            if (var2.method647((byte) 123) > class53.method405(75)) {
                return null;
            }
            var2.method1346((byte) -16);
            var2.method244(-10368);
        } while ((Long.MIN_VALUE & var2.field643) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1678++;
        class98.field1737 = false;
    }

    @OriginalMember(owner = "client!nl", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1674++;
        if (class12.field173 != this || class228.field4189) {
            return;
        }
        class57.field1053 = true;
        if (class233.field4280 && (class53.method405(121) - class260.field4632) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class182.field3246 <= var2.width && var2.height >= class215.field3821) {
                class227.field4166 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(Z)V")
    public final synchronized void method683(boolean arg0) {
        field1657++;
        if (class112.field1949 != null) {
            class112.field1949.removeFocusListener(this);
            class112.field1949.getParent().remove(class112.field1949);
        }
        Container var2;
        if (class126.field2189 != null) {
            var2 = class126.field2189;
        } else if (class272.field4794 == null) {
            var2 = class20.field326.field4207;
        } else {
            var2 = class272.field4794;
        }
        var2.setLayout((LayoutManager) null);
        class112.field1949 = new class250(this);
        var2.add(class112.field1949);
        class112.field1949.setSize(class31.field625, class244.field4428);
        class112.field1949.setVisible(true);
        if (class272.field4794 == var2) {
            Insets var3 = class272.field4794.getInsets();
            class112.field1949.setLocation(class17.field267 + var3.left, class107.field1906 + var3.top);
        } else {
            class112.field1949.setLocation(class17.field267, class107.field1906);
        }
        class112.field1949.addFocusListener(this);
        class112.field1949.requestFocus();
        class150.field2631 = true;
        class98.field1737 = true;
        class57.field1053 = true;
        class227.field4166 = arg0;
        class260.field4632 = class53.method405(120);
    }

    @OriginalMember(owner = "client!nl", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1662++;
    }

    @OriginalMember(owner = "client!nl", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1681++;
        if (class272.field4794 == null) {
            return class20.field326 == null || class20.field326.field4207 == this ? super.getCodeBase() : class20.field326.field4207.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1660++;
    }

    @OriginalMember(owner = "client!nl", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1659++;
    }
}
