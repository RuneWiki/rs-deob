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

@OriginalClass("client!kr")
public abstract class class6 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "Z")
    private boolean field68 = false;

    @OriginalMember(owner = "client!kr", name = "H", descriptor = "Z")
    private boolean field77 = false;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "[[I")
    public static int[][] field72 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!kr", name = "I", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!kr", name = "J", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!kr", name = "K", descriptor = "Z")
    public static boolean field80;

    @OriginalMember(owner = "client!kr", name = "L", descriptor = "Z")
    public static boolean field81;

    @OriginalMember(owner = "client!kr", name = "M", descriptor = "Z")
    public static boolean field82;

    @OriginalMember(owner = "client!kr", name = "N", descriptor = "Z")
    public static boolean field83;

    @OriginalMember(owner = "client!kr", name = "O", descriptor = "Z")
    public static boolean field84;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "[Lof;")
    public static class421[] field56;

    @OriginalMember(owner = "client!kr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field53++;
    }

    @OriginalMember(owner = "client!kr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field66++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    private final void method29(int arg0) {
        field71++;
        long var2 = class10.method63(-21149);
        long var4 = class40.field619[class275.field4141];
        class40.field619[class275.field4141] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class275.field4141 = class275.field4141 + 1 & 0x1F;
        synchronized (this) {
            class37.field533 = class276.field4157;
        }
        this.method37(600);
        if (arg0 != -31210) {
            this.field77 = true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method30(String arg0, int arg1) {
        field64++;
        if (this.field77) {
            return;
        }
        this.field77 = true;
        System.out.println("error_game_" + arg0);
        try {
            class412.method2587(class188.field2783.field2639, -98, "loggedout");
            if (arg1 != 16013) {
                this.field77 = false;
            }
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
    public abstract void method31(int arg0);

    @OriginalMember(owner = "client!kr", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
    public abstract void method32(int arg0);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    private final void method33(byte arg0) {
        field59++;
        long var2 = class10.method63(-21149);
        long var4 = class380.field5389[class452.field6580];
        class380.field5389[class452.field6580] = var2;
        if (arg0 >= -123) {
            return;
        }
        class452.field6580 = class452.field6580 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class60.field970 = ((var6 >> 1) + 32000) / var6;
        }
        if (class243.field3543++ > 50) {
            class243.field3543 -= 50;
            class188.field2786 = true;
            class33.field475.setSize(class113.field1819, class277.field4170);
            class33.field475.setVisible(true);
            if (class239.field3443 != null && class315.field4585 == null) {
                Insets var7 = class239.field3443.getInsets();
                class33.field475.setLocation(class358.field5107 + var7.left, class284.field4259 + var7.top);
            } else {
                class33.field475.setLocation(class358.field5107, class284.field4259);
            }
        }
        this.method45(-9);
    }

    @OriginalMember(owner = "client!kr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field54++;
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
    public static void method34(int arg0) {
        if (arg0 == 2) {
            field72 = null;
            field56 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field45++;
        if (class192.field2836 == this && !class85.field1392) {
            class239.field3460 = class10.method63(-21149);
            class134.method1106(5000L, 10);
            class157.field2394 = null;
            this.method40(false, -1);
        }
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V")
    public final synchronized void method35(int arg0) {
        field65++;
        if (arg0 < 98) {
            field57 = -97;
        }
        if (class33.field475 != null) {
            class33.field475.removeFocusListener(this);
            class33.field475.getParent().remove(class33.field475);
        }
        Container var2;
        if (class315.field4585 != null) {
            var2 = class315.field4585;
        } else if (class239.field3443 == null) {
            var2 = class188.field2783.field2639;
        } else {
            var2 = class239.field3443;
        }
        var2.setLayout((LayoutManager) null);
        class33.field475 = new class243(this);
        var2.add(class33.field475);
        class33.field475.setSize(class113.field1819, class277.field4170);
        class33.field475.setVisible(true);
        if (class239.field3443 == var2) {
            Insets var3 = class239.field3443.getInsets();
            class33.field475.setLocation(class358.field5107 + var3.left, class284.field4259 + var3.top);
        } else {
            class33.field475.setLocation(class358.field5107, class284.field4259);
        }
        class33.field475.addFocusListener(this);
        class33.field475.requestFocus();
        class276.field4157 = true;
        class37.field533 = true;
        class188.field2786 = true;
        class62.field995 = false;
        class452.field6571 = class10.method63(-21149);
    }

    @OriginalMember(owner = "client!kr", name = "stop", descriptor = "()V")
    public final void stop() {
        field67++;
        if (class192.field2836 == this && !class85.field1392) {
            class239.field3460 = class10.method63(-21149) + 4000L;
        }
    }

    @OriginalMember(owner = "client!kr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field52++;
        if (class239.field3443 == null) {
            return class188.field2783 == null || class188.field2783.field2639 == this ? super.getCodeBase() : class188.field2783.field2639.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method36(boolean arg0, Object arg1, int arg2) {
        field44++;
        if (arg1 == null) {
            return null;
        }
        int var3 = -9 / ((arg2 - 77) / 41);
        if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return arg0 ? class443.method2769(-113, var4) : var4;
        } else if (arg1 instanceof class190) {
            class190 var5 = (class190) arg1;
            return var5.method1472(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field62++;
    }

    @OriginalMember(owner = "client!kr", name = "start", descriptor = "()V")
    public final void start() {
        field58++;
        if (class192.field2836 == this && !class85.field1392) {
            class239.field3460 = 0L;
        }
    }

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "(I)V")
    public abstract void method37(int arg0);

    @OriginalMember(owner = "client!kr", name = "providesignlink", descriptor = "(Lvj;)V")
    public static final void providesignlink(class177 arg0) {
        class188.field2783 = arg0;
        class157.field2394 = arg0;
        field46++;
    }

    @OriginalMember(owner = "client!kr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field47++;
    }

    @OriginalMember(owner = "client!kr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class276.field4157 = false;
        field75++;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
    public final void method38(byte arg0) {
        field74++;
        if (!this.field68) {
            try {
                class131 var2 = class188.field2783.method1369(class192.field2836.getClass(), (byte) -14);
                while (var2.field2121 == 0) {
                    class134.method1106(100L, 10);
                }
                if (var2.field2125 != null) {
                    throw (Throwable) var2.field2125;
                }
                jagmisc.init();
                this.field68 = true;
                class200.field2916 = class102.method842(-86);
            } catch (Throwable var3) {
            }
        }
        if (arg0 <= 2) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIZ)V")
    public final void method39(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field50++;
        try {
            if (class192.field2836 == null) {
                class354.field5041 = arg0;
                class113.field1819 = arg1;
                class349.field4962 = arg1;
                class277.field4170 = arg3;
                class311.field4526 = arg3;
                class192.field2836 = this;
                class358.field5107 = 0;
                class284.field4259 = 0;
                if (class188.field2783 == null) {
                    class157.field2394 = class188.field2783 = new class177(this, arg2, (String) null, 0);
                }
                if (arg4) {
                    field57 = -1;
                }
                class131 var6 = class188.field2783.method1384(this, !arg4, 1);
                while (var6.field2121 == 0) {
                    class134.method1106(10L, 10);
                }
            } else {
                class372.field5287++;
                if (class372.field5287 >= 3) {
                    this.method30("alreadyloaded", 16013);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class282.method2003((String) null, -24830, var8);
            this.method30("crash", 16013);
        }
    }

    @OriginalMember(owner = "client!kr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field79++;
        if (class239.field3443 == null) {
            return class188.field2783 == null || class188.field2783.field2639 == this ? super.getAppletContext() : class188.field2783.field2639.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class276.field4157 = true;
        field69++;
        class188.field2786 = true;
    }

    @OriginalMember(owner = "client!kr", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label107: {
                if (class177.field2645 != null) {
                    String var1 = class177.field2645.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class177.field2646;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method30("wrongjava", 16013);
                            break label107;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class177.field2646 == null || class177.field2646.equals("1.4.2"))) {
                        this.method30("wrongjava", 16013);
                        break label107;
                    }
                }
                if (class177.field2646 != null && class177.field2646.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class177.field2646.length() > var3) {
                        char var5 = class177.field2646.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class46.field752 = true;
                    }
                }
                if (class188.field2783.field2639 != null) {
                    Method var6 = class177.field2653;
                    if (var6 != null) {
                        try {
                            var6.invoke(class188.field2783.field2639, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class398.method2541(0);
                this.method35(127);
                this.method43((byte) -120);
                class200.field2916 = class102.method842(-91);
                this.method38((byte) 78);
                while (class239.field3460 == 0L || class10.method63(-21149) < class239.field3460) {
                    class86.field1399 = class200.field2916.method100(99, class153.field2328);
                    for (int var7 = 0; var7 < class86.field1399; var7++) {
                        this.method29(-31210);
                    }
                    this.method33((byte) -124);
                    class360.method2311(611902952, class33.field475, class188.field2783);
                }
            }
        } catch (Exception var10) {
            class282.method2003((String) null, -24830, var10);
            this.method30("crash", 16013);
        }
        field49++;
        this.method40(true, -1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)V")
    private final void method40(boolean arg0, int arg1) {
        if (arg1 != -1) {
            this.getAppletContext();
        }
        field48++;
        synchronized (this) {
            if (class85.field1392) {
                return;
            }
            class85.field1392 = true;
        }
        if (class188.field2783.field2639 != null) {
            class188.field2783.field2639.destroy();
        }
        try {
            this.method31(4);
        } catch (Exception var11) {
        }
        if (this.field68) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field68 = false;
        }
        class131 var4 = class188.field2783.method1391((byte) -63, class192.field2836.getClass());
        while (var4.field2121 == 0) {
            class134.method1106(100L, 10);
        }
        if (class33.field475 != null) {
            try {
                class33.field475.removeFocusListener(this);
                class33.field475.getParent().remove(class33.field475);
            } catch (Exception var9) {
            }
        }
        if (class188.field2783 != null) {
            try {
                class188.field2783.method1370(arg1 ^ 0x69DE);
            } catch (Exception var8) {
            }
        }
        this.method32(-15849);
        if (class239.field3443 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;IIIZZI)V")
    public final void method41(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        try {
            class284.field4259 = 0;
            class113.field1819 = arg3;
            class349.field4962 = arg3;
            class192.field2836 = this;
            class354.field5041 = arg4;
            class277.field4170 = arg7;
            class311.field4526 = arg7;
            class358.field5107 = 0;
            class239.field3443 = new Frame();
            class239.field3443.setTitle("Jagex");
            class239.field3443.setResizable(true);
            class239.field3443.addWindowListener(this);
            class239.field3443.setVisible(true);
            class239.field3443.toFront();
            Insets var9 = class239.field3443.getInsets();
            class239.field3443.setSize(var9.right + var9.left + class349.field4962, class311.field4526 + var9.top + var9.bottom);
            class157.field2394 = class188.field2783 = new class177((Applet) null, arg2, arg1, arg0);
            class131 var10 = class188.field2783.method1384(this, arg5, 1);
            while (var10.field2121 == 0) {
                class134.method1106(10L, 10);
            }
        } catch (Exception var12) {
            class282.method2003((String) null, -24830, var12);
        }
        field60++;
    }

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)Z")
    public final boolean method42(int arg0) {
        field51++;
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
            if (arg0 != 1) {
                this.field68 = true;
            }
            this.method30("invalidhost", 16013);
            return false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field61++;
        if (class239.field3443 == null) {
            return class188.field2783 == null || class188.field2783.field2639 == this ? super.getDocumentBase() : class188.field2783.field2639.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field63++;
        if (class192.field2836 != this || class85.field1392) {
            return;
        }
        class188.field2786 = true;
        if (class46.field752 && (class10.method63(-21149) - class452.field6571) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class349.field4962 && var2.height >= class311.field4526) {
                class62.field995 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V")
    public abstract void method43(byte arg0);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(JB)V")
    public static final void method44(long arg0, byte arg1) {
        field78++;
        int var3 = class86.field1394.field6520 + class41.field632;
        int var4 = class398.field5855 + class86.field1394.field6519;
        if (class99.field1551 - var3 < -500 || (class99.field1551 - var3) > 500 || class392.field5729 - var4 < -500 || class392.field5729 - var4 > 500) {
            class392.field5729 = var4;
            class99.field1551 = var3;
        }
        if (class99.field1551 != var3) {
            int var5 = var3 - class99.field1551;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class99.field1551 += var6;
        }
        if (!class324.field4673) {
            class436.field6359 += (float) arg0 * class247.field3586 / 6.0F;
            class106.field1756 += (float) arg0 * class278.field4183 / 6.0F;
        }
        if (class392.field5729 != var4) {
            int var7 = var4 - class392.field5729;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class392.field5729 += var8;
        }
        class169.method1292((byte) 115);
        if (arg1 != 12) {
            field57 = -40;
        }
    }

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "(I)V")
    public abstract void method45(int arg0);

    @OriginalMember(owner = "client!kr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field73++;
        if (class239.field3443 == null) {
            return class188.field2783 == null || class188.field2783.field2639 == this ? super.getParameter(arg0) : class188.field2783.field2639.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field55++;
    }

    @OriginalMember(owner = "client!kr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field76++;
    }

    @OriginalMember(owner = "client!kr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field70++;
        this.paint(arg0);
    }
}
