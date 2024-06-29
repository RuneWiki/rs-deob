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

@OriginalClass("client!jc")
public abstract class class291 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Z")
    private boolean field4412 = false;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Z")
    private boolean field4424 = false;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Z")
    public static boolean field4410 = false;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "[[B")
    public static byte[][] field4423 = new byte[50][];

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "Lnd;")
    public static class366 field4437;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lll;")
    public static class235 field4413;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "Z")
    public static boolean field4441;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "Z")
    public static boolean field4442;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "Z")
    public static boolean field4443;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "Z")
    public static boolean field4445;

    @OriginalMember(owner = "client!jc", name = "providesignlink", descriptor = "(Lhf;)V")
    public static final void providesignlink(class260 arg0) {
        field4425++;
        class7.field86 = arg0;
        class498.field7547 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public abstract void method1169(int arg0);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public abstract void method1181(int arg0);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1770(byte arg0, String arg1) {
        field4428++;
        if (this.field4412) {
            return;
        }
        this.field4412 = true;
        System.out.println("error_game_" + arg1);
        try {
            int var3 = -112 % ((arg0 - 8) / 34);
            class209.method1278(5633, class7.field86.field3929, "loggedout");
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!jc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4436++;
    }

    @OriginalMember(owner = "client!jc", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label113: {
                if (class260.field3947 != null) {
                    String var1 = class260.field3947.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class260.field3935;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1770((byte) 82, "wrongjava");
                            break label113;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class260.field3935 == null || class260.field3935.equals("1.4.2"))) {
                        this.method1770((byte) -46, "wrongjava");
                        break label113;
                    }
                }
                if (class260.field3935 != null && class260.field3935.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class260.field3935.length() > var3) {
                        char var5 = class260.field3935.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + (var5 - '0');
                    }
                    if (var4 >= 5) {
                        class296.field4495 = true;
                    }
                }
                if (class7.field86.field3929 != null) {
                    Method var6 = class260.field3950;
                    if (var6 != null) {
                        try {
                            var6.invoke(class7.field86.field3929, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class402.method2385((byte) -128);
                class306.method1837(1);
                this.method1774(59);
                this.method1175(256);
                class138.field2275 = class157.method1004(true);
                this.method1771((byte) -96);
                while (class106.field1857 == 0L || class106.field1857 > class344.method2111((byte) -81)) {
                    class505.field7626 = class138.field2275.method65(class164.field2559, (byte) -104);
                    for (int var7 = 0; var7 < class505.field7626; var7++) {
                        this.method1780(0);
                    }
                    this.method1779(29046);
                    class49.method347(0, class257.field3919, class7.field86);
                }
            }
        } catch (Throwable var10) {
            class32.method177(var10, (byte) -103, null);
            this.method1770((byte) -91, "crash");
        }
        field4434++;
        this.method1773(true, (byte) -111);
    }

    @OriginalMember(owner = "client!jc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4411++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public final void method1771(byte arg0) {
        field4433++;
        if (!this.field4424) {
            try {
                class180 var2 = class7.field86.method1566((byte) 122, class481.field7351.getClass());
                while (var2.field2802 == 0) {
                    class414.method2437(100L, (byte) -122);
                }
                if (var2.field2803 != null) {
                    throw (Throwable) var2.field2803;
                }
                jagmisc.init();
                this.field4424 = true;
                class138.field2275 = class157.method1004(true);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != -96) {
            field4437 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIII)V")
    public final void method1772(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -90) {
            field4435 = -74;
        }
        field4417++;
        try {
            if (class481.field7351 == null) {
                class483.field7376 = 0;
                class411.field5963 = 0;
                class481.field7351 = this;
                class213.field3310 = arg4;
                class482.field7368 = arg3;
                class135.field2212 = arg3;
                class147.field2384 = arg2;
                class292.field4453 = arg2;
                if (class7.field86 == null) {
                    class498.field7547 = class7.field86 = new class260(this, arg0, null, 0);
                }
                class180 var6 = class7.field86.method1579(1, this, 2);
                while (var6.field2802 == 0) {
                    class414.method2437(10L, (byte) -122);
                }
            } else {
                class386.field5594++;
                if (class386.field5594 >= 3) {
                    this.method1770((byte) 96, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class32.method177(var8, (byte) -128, null);
            this.method1770((byte) 111, "crash");
        }
    }

    @OriginalMember(owner = "client!jc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZB)V")
    private final void method1773(boolean arg0, byte arg1) {
        field4439++;
        synchronized (this) {
            if (class429.field6301) {
                return;
            }
            class429.field6301 = true;
        }
        if (class7.field86.field3929 != null) {
            class7.field86.field3929.destroy();
        }
        try {
            this.method1184(true);
        } catch (Exception var11) {
        }
        if (this.field4424) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field4424 = false;
        }
        class180 var4 = class7.field86.method1569(-31, class481.field7351.getClass());
        while (var4.field2802 == 0) {
            class414.method2437(100L, (byte) -122);
        }
        if (class257.field3919 != null) {
            try {
                class257.field3919.removeFocusListener(this);
                class257.field3919.getParent().remove(class257.field3919);
            } catch (Exception var9) {
            }
        }
        if (class7.field86 != null) {
            try {
                class7.field86.method1584(true);
            } catch (Exception var8) {
            }
        }
        this.method1181(48);
        if (class174.field2726 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (arg1 == -111) {
            System.out.println("Shutdown complete - clean:" + arg0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4421++;
        if (class174.field2726 == null) {
            return class7.field86 == null || class7.field86.field3929 == this ? super.getAppletContext() : class7.field86.field3929.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4418++;
    }

    @OriginalMember(owner = "client!jc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class116.field1957 = false;
        field4432++;
    }

    @OriginalMember(owner = "client!jc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4404++;
        if (class174.field2726 == null) {
            return class7.field86 == null || class7.field86.field3929 == this ? super.getParameter(arg0) : class7.field86.field3929.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public final synchronized void method1774(int arg0) {
        int var2 = -56 / ((-arg0 - 8) / 49);
        field4438++;
        if (class257.field3919 != null) {
            class257.field3919.removeFocusListener(this);
            class257.field3919.getParent().remove(class257.field3919);
        }
        Container var3;
        if (class201.field3190 != null) {
            var3 = class201.field3190;
        } else if (class174.field2726 == null) {
            var3 = class7.field86.field3929;
        } else {
            var3 = class174.field2726;
        }
        var3.setLayout(null);
        class257.field3919 = new class483(this);
        var3.add(class257.field3919);
        class257.field3919.setSize(class482.field7368, class147.field2384);
        class257.field3919.setVisible(true);
        if (class174.field2726 == var3) {
            Insets var4 = class174.field2726.getInsets();
            class257.field3919.setLocation(class483.field7376 + var4.left, var4.top - -class411.field5963);
        } else {
            class257.field3919.setLocation(class483.field7376, class411.field5963);
        }
        class257.field3919.addFocusListener(this);
        class257.field3919.requestFocus();
        class116.field1957 = true;
        class410.field5946 = true;
        class345.field5120 = true;
        class232.field3527 = false;
        class442.field6682 = class344.method2111((byte) -28);
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    public abstract void method1175(int arg0);

    @OriginalMember(owner = "client!jc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4419++;
    }

    @OriginalMember(owner = "client!jc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class116.field1957 = true;
        field4426++;
        class345.field5120 = true;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z")
    public final boolean method1775(byte arg0) {
        field4431++;
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
                this.method1770((byte) 73, "invalidhost");
                return arg0 <= 28 ? false : false;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public static void method1776(int arg0) {
        field4413 = null;
        field4437 = null;
        if (arg0 > 103) {
            field4423 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4409++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLha;)Llr;")
    public static final class508 method1777(byte arg0, class40 arg1) {
        field4407++;
        class508 var2 = new class508();
        var2.field7682 = arg1.method254((byte) -63);
        if (arg0 < 125) {
            method1776(-30);
        }
        var2.field7680 = class47.field721.method1063(0, var2.field7682);
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "start", descriptor = "()V")
    public final void start() {
        field4427++;
        if (class481.field7351 == this && !class429.field6301) {
            class106.field1857 = 0L;
        }
    }

    @OriginalMember(owner = "client!jc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4406++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIZLjava/lang/String;III)V")
    public final void method1778(byte arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5, int arg6, int arg7) {
        field4415++;
        try {
            class411.field5963 = 0;
            class482.field7368 = arg6;
            class135.field2212 = arg6;
            class147.field2384 = arg7;
            class292.field4453 = arg7;
            if (arg0 != 119) {
                field4413 = null;
            }
            class483.field7376 = 0;
            class481.field7351 = this;
            class213.field3310 = arg2;
            class174.field2726 = new Frame();
            class174.field2726.setTitle("Jagex");
            class174.field2726.setResizable(true);
            class174.field2726.addWindowListener(this);
            class174.field2726.setVisible(true);
            class174.field2726.toFront();
            Insets var9 = class174.field2726.getInsets();
            class174.field2726.setSize(var9.right + var9.left + class135.field2212, class292.field4453 + var9.top - -var9.bottom);
            class498.field7547 = class7.field86 = new class260(null, arg5, arg4, arg1);
            class180 var10 = class7.field86.method1579(1, this, 2);
            while (var10.field2802 == 0) {
                class414.method2437(10L, (byte) -122);
            }
        } catch (Exception var12) {
            class32.method177(var12, (byte) -105, null);
        }
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public abstract void method1178(int arg0);

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
    private final void method1779(int arg0) {
        field4408++;
        long var2 = class344.method2111((byte) -93);
        long var4 = class4.field44[class460.field7089];
        class4.field44[class460.field7089] = var2;
        if (arg0 != 29046) {
            return;
        }
        class460.field7089 = class460.field7089 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class49.field756 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class151.field2426++) > 50) {
            class151.field2426 -= 50;
            class345.field5120 = true;
            class257.field3919.setSize(class482.field7368, class147.field2384);
            class257.field3919.setVisible(true);
            if (class174.field2726 != null && class201.field3190 == null) {
                Insets var7 = class174.field2726.getInsets();
                class257.field3919.setLocation(var7.left + class483.field7376, class411.field5963 + var7.top);
            } else {
                class257.field3919.setLocation(class483.field7376, class411.field5963);
            }
        }
        this.method1178(arg0 ^ 0x13F6);
    }

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
    private final void method1780(int arg0) {
        field4414++;
        long var2 = class344.method2111((byte) -15);
        long var4 = class370.field5439[class100.field1814];
        class370.field5439[class100.field1814] = var2;
        class100.field1814 = class100.field1814 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class410.field5946 = class116.field1957;
        }
        this.method1169(15290);
        if (arg0 != 0) {
            this.method1773(false, (byte) -33);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public abstract void method1184(boolean arg0);

    @OriginalMember(owner = "client!jc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4430++;
        if (class481.field7351 != this || class429.field6301) {
            return;
        }
        class345.field5120 = true;
        if (class296.field4495 && (class344.method2111((byte) -94) - class442.field6682) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class135.field2212 && var2.height >= class292.field4453) {
                class232.field3527 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "stop", descriptor = "()V")
    public final void stop() {
        field4416++;
        if (class481.field7351 == this && !class429.field6301) {
            class106.field1857 = class344.method2111((byte) -93) + 4000L;
        }
    }

    @OriginalMember(owner = "client!jc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4440++;
        if (class174.field2726 == null) {
            return class7.field86 == null || class7.field86.field3929 == this ? super.getDocumentBase() : class7.field86.field3929.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4405++;
        if (class174.field2726 == null) {
            return class7.field86 == null || class7.field86.field3929 == this ? super.getCodeBase() : class7.field86.field3929.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4422++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4420++;
        if (class481.field7351 == this && !class429.field6301) {
            class106.field1857 = class344.method2111((byte) -19);
            class414.method2437(5000L, (byte) -122);
            class498.field7547 = null;
            this.method1773(false, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!jc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4429++;
    }

    static {
        new class423("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field4437 = new class366(2, 6);
    }
}
