import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!hp")
public abstract class class350 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "Z")
    private boolean field4556 = false;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "Z")
    private boolean field4544 = false;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "[[I")
    public static int[][] field4545 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!hp", name = "T", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!hp", name = "U", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!hp", name = "V", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!hp", name = "Y", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!hp", name = "Z", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!hp", name = "ab", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!hp", name = "bb", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!hp", name = "cb", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "Z")
    public static boolean field4562;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "Z")
    public static boolean field4563;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "Z")
    public static boolean field4565;

    @OriginalMember(owner = "client!hp", name = "S", descriptor = "Z")
    public static boolean field4569;

    @OriginalMember(owner = "client!hp", name = "W", descriptor = "Z")
    public static boolean field4573;

    @OriginalMember(owner = "client!hp", name = "X", descriptor = "Z")
    public static boolean field4574;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Z")
    public final boolean method2048(boolean arg0) {
        field4558++;
        if (arg0) {
            this.windowClosed(null);
        }
        return class10.method50("jaclib", (byte) -72);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Z")
    public final boolean method2049(int arg0) {
        field4560++;
        if (arg0 != 2) {
            field4545 = null;
        }
        return class10.method50("jagtheora", (byte) -72);
    }

    @OriginalMember(owner = "client!hp", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hp", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4549++;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
    private final void method2050(int arg0) {
        field4543++;
        long var2 = class97.method654((byte) 70);
        long var4 = class650.field8934[class416.field5918];
        class650.field8934[class416.field5918] = var2;
        class416.field5918 = class416.field5918 + arg0 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class758.field10550 = class446.field6283;
        }
        this.method700((byte) -74);
    }

    @OriginalMember(owner = "client!hp", name = "stop", descriptor = "()V")
    public final void stop() {
        field4537++;
        if (class689.field9789 == this && !class431.field6104) {
            class708.field9970 = class97.method654((byte) 122) + 4000L;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public static void method2051(byte arg0) {
        int var1 = -51 / (arg0 / 47);
        field4545 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
    public final void method2052(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class652.field8972 = 0;
            class5.field61 = arg3;
            class204.field2591 = 0;
            class689.field9789 = this;
            class599.field8320 = arg1;
            class538.field7556 = arg1;
            class415.field5911 = null;
            class84.field1083 = arg4;
            class706.field9947 = arg4;
            class95.field1205 = new Frame();
            int var9 = -81 / ((arg6 - 36) / 60);
            class95.field1205.setTitle("Jagex");
            class95.field1205.setResizable(true);
            class95.field1205.addWindowListener(this);
            class95.field1205.setVisible(true);
            class95.field1205.toFront();
            Insets var10 = class95.field1205.getInsets();
            class95.field1205.setSize(class538.field7556 + var10.right + var10.left, var10.top + var10.bottom + class706.field9947);
            class160.field2049 = class681.field9312 = new class256(arg7, arg5, arg0, true);
            class435 var11 = class681.field9312.method1555(1, true, this);
            while (var11.field6124 == 0) {
                class517.method2965(10L, -115);
            }
        } catch (Exception var13) {
            class486.method2844((byte) -1, null, var13);
        }
        field4542++;
    }

    @OriginalMember(owner = "client!hp", name = "run", descriptor = "()V")
    public final void run() {
        field4529++;
        try {
            if (class256.field3243 != null) {
                String var1 = class256.field3243.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class256.field3267;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2059(false, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class256.field3267 == null || class256.field3267.equals("1.4.2"))) {
                    this.method2059(false, "wrongjava");
                    return;
                }
            }
            if (class256.field3267 != null && class256.field3267.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class256.field3267.length() > var3) {
                    char var5 = class256.field3267.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = -(-var5 - var4 * 10) - 48;
                }
                if (var4 >= 5) {
                    class24.field421 = true;
                }
            }
            Applet var6 = class689.field9789;
            if (class745.field10393 != null) {
                var6 = class745.field10393;
            }
            Method var7 = class256.field3256;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class604.method3321(0);
            class340.method1993(true);
            this.method712(false);
            this.method713(1);
            class508.field7188 = class43.method364((byte) 9);
            while (class708.field9970 == 0L || class97.method654((byte) 103) < class708.field9970) {
                class331.field4198 = class508.field7188.method2680((byte) -98, class236.field3056);
                for (int var8 = 0; var8 < class331.field4198; var8++) {
                    this.method2050(1);
                }
                this.method2057((byte) -53);
                class643.method3491((byte) 62, class681.field9312, class68.field939);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class486.method2844((byte) -1, this.method714(47), var20);
            this.method2059(false, "crash");
        } finally {
            Object var13 = null;
            this.method2058(-115, true);
        }
    }

    @OriginalMember(owner = "client!hp", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4527++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method2053(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field4547++;
        try {
            if (class689.field9789 == null) {
                class652.field8972 = 0;
                if (arg1 != 16484) {
                    this.method2048(false);
                }
                class84.field1083 = arg6;
                class706.field9947 = arg6;
                class689.field9789 = this;
                class5.field61 = arg3;
                class599.field8320 = arg4;
                class538.field7556 = arg4;
                class415.field5911 = class745.field10393;
                class204.field2591 = 0;
                class160.field2049 = class681.field9312 = new class256(arg0, arg2, arg5, class745.field10393 != null);
                class435 var8 = class681.field9312.method1555(1, true, this);
                while (var8.field6124 == 0) {
                    class517.method2965(10L, arg1 - 16594);
                }
            } else {
                class621.field8685++;
                if (class621.field8685 >= 3) {
                    this.method2059(false, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class486.method2844((byte) -1, null, var10);
            this.method2059(false, "crash");
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)Z")
    public final boolean method2054(int arg0) {
        field4555++;
        return arg0 == -22991 ? class10.method50("jagmisc", (byte) -72) : true;
    }

    @OriginalMember(owner = "client!hp", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4540++;
        if (class95.field1205 == null) {
            return class745.field10393 == null || class745.field10393 == this ? super.getAppletContext() : class745.field10393.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)Z")
    public final boolean method2055(int arg0) {
        if (arg0 != 17802) {
            this.windowClosed(null);
        }
        field4528++;
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
            } else {
                this.method2059(false, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)V")
    public abstract void method702(byte arg0);

    @OriginalMember(owner = "client!hp", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4541++;
        if (class95.field1205 == null) {
            return class745.field10393 == null || class745.field10393 == this ? super.getDocumentBase() : class745.field10393.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(Z)V")
    public static final void method2056(boolean arg0) {
        field4530++;
        if (!arg0) {
            return;
        }
        class676.method3638(-1, false);
        if (class269.field3403 >= 0 && class269.field3403 != 0) {
            class462.method2730(1, false, class269.field3403);
            class269.field3403 = -1;
        }
    }

    @OriginalMember(owner = "client!hp", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field4525++;
        this.destroy();
    }

    @OriginalMember(owner = "client!hp", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4534++;
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(Z)V")
    public abstract void method699(boolean arg0);

    @OriginalMember(owner = "client!hp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4551++;
        class446.field6283 = true;
        class336.field4342 = true;
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(Z)V")
    public abstract void method696(boolean arg0);

    @OriginalMember(owner = "client!hp", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4539++;
    }

    @OriginalMember(owner = "client!hp", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4533++;
        if (class95.field1205 == null) {
            return class745.field10393 == null || class745.field10393 == this ? super.getParameter(arg0) : class745.field10393.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4532++;
        if (class689.field9789 == this && !class431.field6104) {
            class708.field9970 = class97.method654((byte) 82);
            class517.method2965(5000L, -72);
            class160.field2049 = null;
            this.method2058(-114, false);
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)V")
    private final void method2057(byte arg0) {
        field4559++;
        if (arg0 != -53) {
            return;
        }
        long var2 = class97.method654((byte) 95);
        long var4 = class601.field8358[class363.field5158];
        class601.field8358[class363.field5158] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class423.field6018 = ((var6 >> 1) + 32000) / var6;
        }
        class363.field5158 = class363.field5158 + 1 & 0x1F;
        if (class421.field5982++ > 50) {
            class421.field5982 -= 50;
            class336.field4342 = true;
            class68.field939.setSize(class599.field8320, class84.field1083);
            class68.field939.setVisible(true);
            if (class95.field1205 != null && class627.field8740 == null) {
                Insets var7 = class95.field1205.getInsets();
                class68.field939.setLocation(var7.left + class204.field2591, class652.field8972 + var7.top);
            } else {
                class68.field939.setLocation(class204.field2591, class652.field8972);
            }
        }
        this.method696(false);
    }

    @OriginalMember(owner = "client!hp", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        field4550++;
        class745.field10393 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4546++;
        if (class95.field1205 == null) {
            return class745.field10393 == null || class745.field10393 == this ? super.getCodeBase() : class745.field10393.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "start", descriptor = "()V")
    public final void start() {
        field4554++;
        if (class689.field9789 == this && !class431.field6104) {
            class708.field9970 = 0L;
        }
    }

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)V")
    public abstract void method713(int arg0);

    @OriginalMember(owner = "client!hp", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4536++;
        if (class689.field9789 != this || class431.field6104) {
            return;
        }
        class336.field4342 = true;
        if (class24.field421 && class97.method654((byte) 51) - class504.field7091 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class538.field7556 && var2.height >= class706.field9947) {
                class93.field1185 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field4535++;
        class446.field6283 = false;
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)V")
    public abstract void method700(byte arg0);

    @OriginalMember(owner = "client!hp", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4538++;
    }

    @OriginalMember(owner = "client!hp", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4552++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
    private final void method2058(int arg0, boolean arg1) {
        field4531++;
        synchronized (this) {
            if (class431.field6104) {
                return;
            }
            class431.field6104 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class745.field10393 != null) {
            class745.field10393.destroy();
        }
        try {
            this.method699(true);
        } catch (Exception var9) {
        }
        if (this.field4544) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field4544 = false;
        }
        if (arg0 > -110) {
            return;
        }
        class133.method839(126, true);
        class286.method1710((byte) 51);
        if (class68.field939 != null) {
            try {
                class68.field939.removeFocusListener(this);
                class68.field939.getParent().remove(class68.field939);
            } catch (Exception var7) {
            }
        }
        if (class681.field9312 != null) {
            try {
                class681.field9312.method1546((byte) 48);
            } catch (Exception var6) {
            }
        }
        this.method702((byte) -101);
        if (class95.field1205 != null) {
            class95.field1205.setVisible(false);
            class95.field1205.dispose();
            class95.field1205 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)Ljava/lang/String;")
    public String method714(int arg0) {
        if (arg0 < 15) {
            this.field4556 = true;
        }
        field4553++;
        return null;
    }

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "(Z)V")
    public synchronized void method712(boolean arg0) {
        if (class68.field939 != null) {
            class68.field939.removeFocusListener(this);
            class68.field939.getParent().setBackground(Color.black);
            class68.field939.getParent().remove(class68.field939);
        }
        field4548++;
        Container var2;
        if (class627.field8740 != null) {
            var2 = class627.field8740;
        } else if (class95.field1205 != null) {
            var2 = class95.field1205;
        } else if (class745.field10393 == null) {
            var2 = class689.field9789;
        } else {
            var2 = class745.field10393;
        }
        var2.setLayout(null);
        class68.field939 = new class574(this);
        var2.add(class68.field939);
        class68.field939.setSize(class599.field8320, class84.field1083);
        class68.field939.setVisible(true);
        if (class95.field1205 == var2) {
            Insets var3 = class95.field1205.getInsets();
            class68.field939.setLocation(var3.left + class204.field2591, class652.field8972 + var3.top);
        } else {
            class68.field939.setLocation(class204.field2591, class652.field8972);
        }
        class68.field939.addFocusListener(this);
        class68.field939.requestFocus();
        class758.field10550 = true;
        class446.field6283 = true;
        class336.field4342 = true;
        class93.field1185 = arg0;
        class504.field7091 = class97.method654((byte) 70);
    }

    @OriginalMember(owner = "client!hp", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4557++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method2059(boolean arg0, String arg1) {
        field4526++;
        if (this.field4556 || arg0) {
            return;
        }
        this.field4556 = true;
        System.out.println("error_game_" + arg1);
        try {
            class193.method1213(-13481, "loggedout", class745.field10393);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }
}
