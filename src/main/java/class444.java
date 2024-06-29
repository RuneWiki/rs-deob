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

@OriginalClass("client!ib")
public abstract class class444 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Z")
    private boolean field6319 = false;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
    private boolean field6330 = false;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lrc;")
    public static class108 field6315 = new class108(56, 8);

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "[I")
    public static int[] field6331 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lap;")
    public static class310 field6327 = new class310(80, 7);

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field6338 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "Lor;")
    public static class275 field6339;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lnl;")
    public static class435 field6306;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Z")
    public static boolean field6340;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Z")
    public static boolean field6341;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "Z")
    public static boolean field6342;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Z")
    public static boolean field6343;

    @OriginalMember(owner = "client!ib", name = "providesignlink", descriptor = "(Lis;)V")
    public static final void providesignlink(class65 arg0) {
        field6314++;
        class436.field6206 = arg0;
        class15.field148 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field6320++;
        if (class99.field1397 == this && !class232.field3388) {
            class361.field4966 = class10.method51(-3183);
            class89.method752(0, 5000L);
            class15.field148 = null;
            this.method2701(2100, false);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public abstract void method541(int arg0);

    @OriginalMember(owner = "client!ib", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ib", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field6310++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public final synchronized void method2692(int arg0) {
        if (class33.field338 != null) {
            class33.field338.removeFocusListener(this);
            class33.field338.getParent().remove(class33.field338);
        }
        field6328++;
        Container var2;
        if (class273.field3967 != null) {
            var2 = class273.field3967;
        } else if (class467.field6587 == null) {
            var2 = class436.field6206.field960;
        } else {
            var2 = class467.field6587;
        }
        var2.setLayout((LayoutManager) null);
        class33.field338 = new class138(this);
        var2.add(class33.field338);
        class33.field338.setSize(class364.field5007, class431.field6099);
        class33.field338.setVisible(true);
        if (class467.field6587 == var2) {
            Insets var3 = class467.field6587.getInsets();
            class33.field338.setLocation(class97.field1357 + var3.left, var3.top - -class394.field5444);
        } else {
            class33.field338.setLocation(class97.field1357, class394.field5444);
        }
        class33.field338.addFocusListener(this);
        class33.field338.requestFocus();
        class491.field6932 = true;
        class190.field2853 = true;
        class464.field6540 = true;
        class124.field1680 = false;
        class363.field5002 = class10.method51(-3183);
        if (arg0 != 0) {
            this.getAppletContext();
        }
    }

    @OriginalMember(owner = "client!ib", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field6324++;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public final void method2693(int arg0) {
        if (arg0 != 7608) {
            this.start();
        }
        field6335++;
        if (this.field6319) {
            return;
        }
        try {
            class275 var2 = class436.field6206.method601(class99.field1397.getClass(), (byte) 69);
            while (var2.field3979 == 0) {
                class89.method752(0, 100L);
            }
            if (var2.field3984 != null) {
                throw (Throwable) var2.field3984;
            }
            jagmisc.init();
            this.field6319 = true;
            class350.field4812 = class207.method1417(arg0 ^ 0x1DB8);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!ib", name = "run", descriptor = "()V")
    public final void run() {
        field6333++;
        try {
            label110: {
                if (class65.field958 != null) {
                    String var1 = class65.field958.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class65.field954;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2699(0, "wrongjava");
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class65.field954 == null || class65.field954.equals("1.4.2"))) {
                        this.method2699(0, "wrongjava");
                        break label110;
                    }
                }
                if (class65.field954 != null && class65.field954.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class65.field954.length()) {
                        char var5 = class65.field954.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + (var5 - '0');
                        var3++;
                    }
                    if (var4 >= 5) {
                        class344.field4753 = true;
                    }
                }
                if (class436.field6206.field960 != null) {
                    Method var6 = class65.field962;
                    if (var6 != null) {
                        try {
                            var6.invoke(class436.field6206.field960, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class204.method1407(1048576);
                class143.method1030(10);
                this.method2692(0);
                this.method534(-27541);
                class350.field4812 = class207.method1417(0);
                this.method2693(7608);
                while (class361.field4966 == 0L || class361.field4966 > class10.method51(-3183)) {
                    class102.field1432 = class350.field4812.method457((byte) 119, class365.field5020);
                    for (int var7 = 0; var7 < class102.field1432; var7++) {
                        this.method2698((byte) 118);
                    }
                    this.method2695(7);
                    class347.method2155(-114, class33.field338, class436.field6206);
                }
            }
        } catch (Exception var10) {
            class83.method704((byte) 117, var10, (String) null);
            this.method2699(0, "crash");
        }
        this.method2701(2100, true);
    }

    @OriginalMember(owner = "client!ib", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field6308++;
        if (class99.field1397 != this || class232.field3388) {
            return;
        }
        class464.field6540 = true;
        if (class344.field4753 && class10.method51(-3183) - class363.field5002 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class59.field847 <= var2.width && class297.field4191 <= var2.height) {
                class124.field1680 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field6329++;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public abstract void method543(int arg0);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIZI)V")
    public final void method2694(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6334++;
        try {
            if (class99.field1397 == null) {
                if (!arg3) {
                    field6327 = null;
                }
                class364.field5007 = arg1;
                class59.field847 = arg1;
                class394.field5444 = 0;
                class53.field774 = arg0;
                class99.field1397 = this;
                class97.field1357 = 0;
                class431.field6099 = arg4;
                class297.field4191 = arg4;
                if (class436.field6206 == null) {
                    class15.field148 = class436.field6206 = new class65(this, arg2, (String) null, 0);
                }
                class275 var6 = class436.field6206.method616(this, 1, 1);
                while (var6.field3979 == 0) {
                    class89.method752(0, 10L);
                }
            } else {
                class73.field1056++;
                if (class73.field1056 >= 3) {
                    this.method2699(0, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class83.method704((byte) 105, var8, (String) null);
            this.method2699(0, "crash");
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    private final void method2695(int arg0) {
        field6321++;
        if (arg0 != 7) {
            this.windowActivated((WindowEvent) null);
        }
        long var2 = class10.method51(arg0 ^ 0xFFFFF396);
        long var4 = class297.field4203[class8.field56];
        class297.field4203[class8.field56] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class59.field851 = ((var6 >> 1) + 32000) / var6;
        }
        class8.field56 = class8.field56 + 1 & 0x1F;
        if ((class135.field1879++) > 50) {
            class464.field6540 = true;
            class135.field1879 -= 50;
            class33.field338.setSize(class364.field5007, class431.field6099);
            class33.field338.setVisible(true);
            if (class467.field6587 != null && class273.field3967 == null) {
                Insets var7 = class467.field6587.getInsets();
                class33.field338.setLocation(var7.left + class97.field1357, class394.field5444 + var7.top);
            } else {
                class33.field338.setLocation(class97.field1357, class394.field5444);
            }
        }
        this.method541(-69);
    }

    @OriginalMember(owner = "client!ib", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field6316++;
    }

    @OriginalMember(owner = "client!ib", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field6305++;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
    public abstract void method534(int arg0);

    @OriginalMember(owner = "client!ib", name = "stop", descriptor = "()V")
    public final void stop() {
        field6307++;
        if (class99.field1397 == this && !class232.field3388) {
            class361.field4966 = class10.method51(-3183) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)Z")
    public final boolean method2696(int arg0) {
        field6309++;
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
            this.method2699(0, "invalidhost");
            if (arg0 != -12061) {
                this.field6319 = true;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field6318++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;IIIZII)V")
    public final void method2697(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            class431.field6099 = arg2;
            class297.field4191 = arg2;
            class99.field1397 = this;
            class364.field5007 = arg0;
            class59.field847 = arg0;
            class97.field1357 = 0;
            class53.field774 = arg4;
            class394.field5444 = arg3;
            class467.field6587 = new Frame();
            class467.field6587.setTitle("Jagex");
            class467.field6587.setResizable(true);
            class467.field6587.addWindowListener(this);
            class467.field6587.setVisible(true);
            class467.field6587.toFront();
            Insets var9 = class467.field6587.getInsets();
            class467.field6587.setSize(class59.field847 - (-var9.right - var9.left), class297.field4191 - -var9.top + var9.bottom);
            class15.field148 = class436.field6206 = new class65((Applet) null, arg7, arg1, arg6);
            class275 var10 = class436.field6206.method616(this, arg3 ^ 0x1, 1);
            while (var10.field3979 == 0) {
                class89.method752(0, 10L);
            }
        } catch (Exception var12) {
            class83.method704((byte) 112, var12, (String) null);
        }
        field6303++;
    }

    @OriginalMember(owner = "client!ib", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field6317++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    private final void method2698(byte arg0) {
        if (arg0 <= 100) {
            return;
        }
        field6304++;
        long var2 = class10.method51(-3183);
        long var4 = class124.field1687[class430.field5989];
        class124.field1687[class430.field5989] = var2;
        class430.field5989 = class430.field5989 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class190.field2853 = class491.field6932;
        }
        this.method543(250);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2699(int arg0, String arg1) {
        field6332++;
        if (this.field6330) {
            return;
        }
        this.field6330 = true;
        System.out.println("error_game_" + arg1);
        try {
            class32.method200("loggedout", (byte) -64, class436.field6206.field960);
        } catch (Throwable var4) {
        }
        try {
            if (arg0 != 0) {
                field6306 = null;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ib", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field6313++;
        class491.field6932 = false;
    }

    @OriginalMember(owner = "client!ib", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field6326++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ib", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field6311++;
        if (class467.field6587 == null) {
            return class436.field6206 == null || class436.field6206.field960 == this ? super.getDocumentBase() : class436.field6206.field960.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field6325++;
        if (class467.field6587 == null) {
            return class436.field6206 == null || class436.field6206.field960 == this ? super.getCodeBase() : class436.field6206.field960.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public abstract void method533(byte arg0);

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
    public abstract void method540(int arg0);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static void method2700(boolean arg0) {
        field6327 = null;
        field6331 = null;
        field6306 = null;
        field6339 = null;
        if (!arg0) {
            field6339 = null;
        }
        field6315 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V")
    private final void method2701(int arg0, boolean arg1) {
        field6322++;
        synchronized (this) {
            if (class232.field3388) {
                return;
            }
            if (arg0 != 2100) {
                return;
            }
            class232.field3388 = true;
        }
        if (class436.field6206.field960 != null) {
            class436.field6206.field960.destroy();
        }
        try {
            this.method540(160);
        } catch (Exception var13) {
        }
        if (this.field6319) {
            try {
                jagmisc.quit();
            } catch (Throwable var12) {
            }
            this.field6319 = false;
        }
        class275 var4 = class436.field6206.method600(arg0 - 2100, class99.field1397.getClass());
        while (var4.field3979 == 0) {
            class89.method752(0, 100L);
        }
        if (class33.field338 != null) {
            try {
                class33.field338.removeFocusListener(this);
                class33.field338.getParent().remove(class33.field338);
            } catch (Exception var11) {
            }
        }
        if (class436.field6206 != null) {
            try {
                class436.field6206.method603(arg0 ^ 0xFFFFF7B0);
            } catch (Exception var10) {
            }
        }
        this.method533((byte) -28);
        if (class467.field6587 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ib", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field6323++;
        if (class467.field6587 == null) {
            return class436.field6206 == null || class436.field6206.field960 == this ? super.getAppletContext() : class436.field6206.field960.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field6336++;
        if (class467.field6587 == null) {
            return class436.field6206 == null || class436.field6206.field960 == this ? super.getParameter(arg0) : class436.field6206.field960.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "start", descriptor = "()V")
    public final void start() {
        field6312++;
        if (class99.field1397 == this && !class232.field3388) {
            class361.field4966 = 0L;
        }
    }

    @OriginalMember(owner = "client!ib", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6337++;
        class491.field6932 = true;
        class464.field6540 = true;
    }
}
