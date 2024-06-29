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

@OriginalClass("client!r")
public abstract class class121 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Z")
    private boolean field1780 = false;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Z")
    private boolean field1808 = false;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Ldi;")
    public static class83 field1790 = new class83(27, 15);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "Lqu;")
    public static class64 field1817;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Z")
    public static boolean field1822;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "Z")
    public static boolean field1823;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "[I")
    public static int[] field1816;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public final synchronized void method839(int arg0) {
        field1778++;
        if (class426.field6248 != null) {
            class426.field6248.removeFocusListener(this);
            class426.field6248.getParent().remove(class426.field6248);
        }
        Container var2;
        if (class147.field2140 != null) {
            var2 = class147.field2140;
        } else if (class367.field5383 == null) {
            var2 = class202.field2840.field7425;
        } else {
            var2 = class367.field5383;
        }
        var2.setLayout(null);
        class426.field6248 = new class99(this);
        var2.add(class426.field6248);
        class426.field6248.setSize(class117.field1754, class27.field359);
        class426.field6248.setVisible(true);
        if (class367.field5383 == var2) {
            Insets var3 = class367.field5383.getInsets();
            class426.field6248.setLocation(class195.field2780 + var3.left, class445.field6563 + var3.top);
        } else {
            class426.field6248.setLocation(class195.field2780, class445.field6563);
        }
        class426.field6248.addFocusListener(this);
        class426.field6248.requestFocus();
        class424.field6226 = true;
        class30.field399 = true;
        class292.field4042 = true;
        class223.field3175 = false;
        if (arg0 == -1) {
            class526.field7793 = class246.method1483(5957);
        }
    }

    @OriginalMember(owner = "client!r", name = "providesignlink", descriptor = "(Ldr;)V")
    public static final void providesignlink(class504 arg0) {
        class202.field2840 = arg0;
        class515.field7618 = arg0;
        field1809++;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static void method840(int arg0) {
        field1790 = null;
        field1816 = null;
        field1817 = null;
        if (arg0 != -48) {
            method845(null, -86);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)[Ljt;")
    public static final class68[] method841(int arg0) {
        if (arg0 >= -4) {
            method841(127);
        }
        if (class372.field5458 == null) {
            class68[] var1 = class90.method675(46, class202.field2840);
            class68[] var2 = new class68[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class68 var8 = var1[var4];
                if ((var8.field925 <= 0 || var8.field925 >= 24) && var8.field924 >= 800 && var8.field928 >= 600 && (class261.field3627 >= 96 || class152.field2332 != 0 || var8.field924 <= 1024 && var8.field928 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class68 var10 = var2[var9];
                        if (var8.field924 == var10.field924 && var8.field928 == var10.field928) {
                            if (var8.field925 > var10.field925) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class372.field5458 = new class68[var3];
            class91.method679(var2, 0, class372.field5458, 0, var3);
            int[] var5 = new int[class372.field5458.length];
            for (int var6 = 0; var6 < class372.field5458.length; var6++) {
                class68 var7 = class372.field5458[var6];
                var5[var6] = var7.field928 * var7.field924;
            }
            class437.method2572(var5, class372.field5458, 26439);
        }
        field1804++;
        return class372.field5458;
    }

    @OriginalMember(owner = "client!r", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1795++;
        if (class367.field5383 == null) {
            return class202.field2840 == null || class202.field2840.field7425 == this ? super.getCodeBase() : class202.field2840.field7425.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1779++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BI[BIIIIBI)V")
    public static final void method842(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 >= -3) {
            field1798 = 77;
        }
        field1785++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg2[var10001] += arg0[arg6++];
                int var14 = arg4++;
                arg2[var14] += arg0[arg6++];
                int var15 = arg4++;
                arg2[var15] += arg0[arg6++];
                int var16 = arg4++;
                arg2[var16] += arg0[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg2[var10001] += arg0[arg6++];
            }
            arg4 += arg1;
            arg6 += arg3;
        }
    }

    @OriginalMember(owner = "client!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class30.field399 = false;
        field1781++;
    }

    @OriginalMember(owner = "client!r", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1812++;
        this.destroy();
    }

    @OriginalMember(owner = "client!r", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1800++;
    }

    @OriginalMember(owner = "client!r", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1788++;
    }

    @OriginalMember(owner = "client!r", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1784++;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method843(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZII)V")
    public final void method844(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1811++;
        try {
            if (class162.field2439 == null) {
                class27.field359 = arg3;
                class480.field7020 = arg3;
                if (!arg2) {
                    this.stop();
                }
                class445.field6563 = 0;
                class210.field2936 = arg4;
                class195.field2780 = 0;
                class117.field1754 = arg1;
                class105.field1586 = arg1;
                class162.field2439 = this;
                if (class202.field2840 == null) {
                    class515.field7618 = class202.field2840 = new class504(this, arg0, null, 0);
                }
                class56 var6 = class202.field2840.method2971(this, 1, 0);
                while (var6.field667 == 0) {
                    class157.method1046(-128, 10L);
                }
            } else {
                class489.field7141++;
                if (class489.field7141 >= 3) {
                    this.method850(1000, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class320.method1861(var8, (byte) -74, null);
            this.method850(1000, "crash");
        }
    }

    @OriginalMember(owner = "client!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class30.field399 = true;
        field1797++;
        class292.field4042 = true;
    }

    @OriginalMember(owner = "client!r", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1807++;
        if (class162.field2439 != this || class82.field1241) {
            return;
        }
        class292.field4042 = true;
        if (class531.field7826 && (class246.method1483(5957) - class526.field7793) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class105.field1586 <= var2.width && var2.height >= class480.field7020) {
                class223.field3175 = true;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1787++;
        if (class367.field5383 == null) {
            return class202.field2840 == null || class202.field2840.field7425 == this ? super.getDocumentBase() : class202.field2840.field7425.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!r", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1783++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!r", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1810++;
        if (class367.field5383 == null) {
            return class202.field2840 == null || class202.field2840.field7425 == this ? super.getParameter(arg0) : class202.field2840.field7425.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BI)Z")
    public static final boolean method845(byte[] arg0, int arg1) {
        field1806++;
        class391 var2 = new class391(arg0);
        int var3 = var2.method2348(-2);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method2348(-2) == 1;
        if (var4) {
            class408.method2443(true, var2);
        }
        if (arg1 == -20307) {
            class335.method1919(var2, (byte) -10);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public abstract void method846(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZB)V")
    private final void method847(boolean arg0, byte arg1) {
        field1792++;
        synchronized (this) {
            if (class82.field1241) {
                return;
            }
            class82.field1241 = true;
        }
        if (class202.field2840.field7425 != null) {
            class202.field2840.field7425.destroy();
        }
        try {
            this.method848(7);
        } catch (Exception var11) {
        }
        if (this.field1780) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field1780 = false;
        }
        class56 var4 = class202.field2840.method2976(class162.field2439.getClass(), (byte) -108);
        while (var4.field667 == 0) {
            class157.method1046(-128, 100L);
        }
        if (class426.field6248 != null) {
            try {
                class426.field6248.removeFocusListener(this);
                class426.field6248.getParent().remove(class426.field6248);
            } catch (Exception var9) {
            }
        }
        if (class202.field2840 != null) {
            try {
                class202.field2840.method2950((byte) -115);
            } catch (Exception var8) {
            }
        }
        this.method859(false);
        if (class367.field5383 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
        if (arg1 != -29) {
            this.getParameter(null);
        }
    }

    @OriginalMember(owner = "client!r", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label113: {
                if (class504.field7426 != null) {
                    String var1 = class504.field7426.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class504.field7428;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method850(1000, "wrongjava");
                            break label113;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class504.field7428 == null || class504.field7428.equals("1.4.2"))) {
                        this.method850(1000, "wrongjava");
                        break label113;
                    }
                }
                if (class504.field7428 != null && class504.field7428.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class504.field7428.length()) {
                        char var5 = class504.field7428.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class531.field7826 = true;
                    }
                }
                if (class202.field2840.field7425 != null) {
                    Method var6 = class504.field7430;
                    if (var6 != null) {
                        try {
                            var6.invoke(class202.field2840.field7425, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class502.method2945((byte) 20);
                class93.method687((byte) 94);
                this.method839(-1);
                this.method843(26);
                class141.field2029 = class517.method3080((byte) 121);
                this.method855((byte) 118);
                while (class285.field3968 == 0L || class285.field3968 > class246.method1483(5957)) {
                    class398.field5826 = class141.field2029.method708(class315.field4321, -1);
                    for (int var7 = 0; var7 < class398.field5826; var7++) {
                        this.method852(false);
                    }
                    this.method851(21048);
                    class249.method1496(class202.field2840, 50, class426.field6248);
                }
            }
        } catch (Throwable var10) {
            class320.method1861(var10, (byte) -89, this.method858(false));
            this.method850(1000, "crash");
        }
        field1813++;
        this.method847(true, (byte) -29);
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    public abstract void method848(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method849(byte arg0, String[] arg1) {
        field1799++;
        int var2 = -97 % ((arg0 + 25) / 58);
        String[] var3 = new String[5];
        for (int var4 = 0; var4 < 5; var4++) {
            var3[var4] = var4 + ": ";
            if (arg1 != null && arg1[var4] != null) {
                var3[var4] = var3[var4] + arg1[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "stop", descriptor = "()V")
    public final void stop() {
        field1777++;
        if (class162.field2439 == this && !class82.field1241) {
            class285.field3968 = class246.method1483(5957) + 4000L;
        }
    }

    @OriginalMember(owner = "client!r", name = "start", descriptor = "()V")
    public final void start() {
        field1789++;
        if (class162.field2439 == this && !class82.field1241) {
            class285.field3968 = 0L;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method850(int arg0, String arg1) {
        field1802++;
        if (this.field1808) {
            return;
        }
        this.field1808 = true;
        System.out.println("error_game_" + arg1);
        try {
            class390.method2298("loggedout", class202.field2840.field7425, (byte) 81);
            if (arg0 != 1000) {
                this.field1780 = true;
            }
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    private final void method851(int arg0) {
        field1793++;
        long var2 = class246.method1483(5957);
        long var4 = class200.field2828[class265.field3660];
        class200.field2828[class265.field3660] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class244.field3417 = ((var6 >> 1) + 32000) / var6;
        }
        class265.field3660 = class265.field3660 + 1 & 0x1F;
        if (class282.field3866++ > 50) {
            class282.field3866 -= 50;
            class292.field4042 = true;
            class426.field6248.setSize(class117.field1754, class27.field359);
            class426.field6248.setVisible(true);
            if (class367.field5383 != null && class147.field2140 == null) {
                Insets var7 = class367.field5383.getInsets();
                class426.field6248.setLocation(class195.field2780 + var7.left, class445.field6563 + var7.top);
            } else {
                class426.field6248.setLocation(class195.field2780, class445.field6563);
            }
        }
        if (arg0 != 21048) {
            this.init();
        }
        this.method856(0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    private final void method852(boolean arg0) {
        field1814++;
        long var2 = class246.method1483(5957);
        long var4 = client.field2811[class199.field2818];
        client.field2811[class199.field2818] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class199.field2818 = class199.field2818 + 1 & 0x1F;
        if (!arg0) {
            synchronized (this) {
                class424.field6226 = class30.field399;
            }
            this.method846(5369);
        }
    }

    @OriginalMember(owner = "client!r", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1801++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)Z")
    public static final boolean method853(int arg0, byte arg1, int arg2) {
        field1815++;
        if (arg1 >= -39) {
            field1818 = -109;
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjava/lang/String;IIIIII)V")
    public final void method854(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1803++;
        try {
            class117.field1754 = arg3;
            class105.field1586 = arg3;
            class210.field2936 = arg7;
            class445.field6563 = 0;
            class162.field2439 = this;
            class195.field2780 = 0;
            class27.field359 = arg5;
            class480.field7020 = arg5;
            class367.field5383 = new Frame();
            class367.field5383.setTitle("Jagex");
            class367.field5383.setResizable(true);
            class367.field5383.addWindowListener(this);
            class367.field5383.setVisible(true);
            class367.field5383.toFront();
            Insets var9 = class367.field5383.getInsets();
            class367.field5383.setSize(var9.right + var9.left + class105.field1586, class480.field7020 + var9.top + var9.bottom);
            class515.field7618 = class202.field2840 = new class504(null, arg2, arg1, arg4);
            class56 var10 = class202.field2840.method2971(this, 1, 0);
            int var11 = 71 / ((arg6 + 46) / 59);
            while (var10.field667 == 0) {
                class157.method1046(-128, 10L);
            }
        } catch (Exception var13) {
            class320.method1861(var13, (byte) -80, null);
        }
    }

    @OriginalMember(owner = "client!r", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1791++;
        if (class367.field5383 == null) {
            return class202.field2840 == null || class202.field2840.field7425 == this ? super.getAppletContext() : class202.field2840.field7425.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public final void method855(byte arg0) {
        field1796++;
        if (arg0 != 118 || this.field1780) {
            return;
        }
        try {
            class56 var2 = class202.field2840.method2959(-6986, class162.field2439.getClass());
            while (var2.field667 == 0) {
                class157.method1046(-128, 100L);
            }
            if (var2.field670 != null) {
                throw (Throwable) var2.field670;
            }
            jagmisc.init();
            this.field1780 = true;
            class141.field2029 = class517.method3080((byte) 122);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
    public abstract void method856(int arg0);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(I)Z")
    public final boolean method857(int arg0) {
        field1782++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
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
            }
            if (arg0 != -18671) {
                this.field1780 = true;
            }
            this.method850(1000, "invalidhost");
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public String method858(boolean arg0) {
        field1805++;
        if (arg0) {
            this.field1780 = false;
        }
        return null;
    }

    @OriginalMember(owner = "client!r", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1786++;
        if (class162.field2439 == this && !class82.field1241) {
            class285.field3968 = class246.method1483(5957);
            class157.method1046(-128, 5000L);
            class515.field7618 = null;
            this.method847(false, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!r", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1794++;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
    public abstract void method859(boolean arg0);
}
