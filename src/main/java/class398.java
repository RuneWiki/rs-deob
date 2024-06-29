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

@OriginalClass("client!ll")
public abstract class class398 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
    private boolean field5801 = false;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "Z")
    private boolean field5826 = false;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "Ljava/lang/String;")
    public static String field5822 = "glow1:";

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "Luc;")
    public static class51 field5828 = new class51(4);

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5835 = "Stellar Dawn is loading - please wait...";

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "[I")
    public static int[] field5836 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
    public static int field5838 = -1;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "Luc;")
    public static class51 field5839 = new class51(16);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "Lir;")
    public static class185 field5833;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "Z")
    public static boolean field5840;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "Z")
    public static boolean field5841;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 3)
    public static void method2552(int arg0) {
        field5822 = null;
        if (arg0 != 8) {
            method2563(-94, -60, 111, false, (class298) null, -53, -31, (class280[]) null, 49, (byte[]) null, -93, 100);
        }
        field5828 = null;
        field5835 = null;
        field5833 = null;
        field5836 = null;
        field5839 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 18)
    public final void method2553(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field5813++;
        if (this.field5826) {
            return;
        }
        try {
            class225 var2 = class63.field948.method2406(class131.field1721.getClass(), 13);
            while (var2.field3104 == 0) {
                class31.method245(100L, 110);
            }
            if (var2.field3105 != null) {
                throw (Throwable) var2.field3105;
            }
            jagmisc.init();
            this.field5826 = true;
            class92.field1263 = class20.method179((byte) 126);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 59)
    public final void method2554(String arg0, int arg1) {
        field5800++;
        if (this.field5801) {
            return;
        }
        this.field5801 = true;
        System.out.println("error_game_" + arg0);
        try {
            class177.method1170(71, "loggedout", class63.field948.field5381);
        } catch (Throwable var4) {
        }
        try {
            if (arg1 == 63) {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ll", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 85)
    public final void windowDeactivated(WindowEvent arg0) {
        field5815++;
    }

    @OriginalMember(owner = "client!ll", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 95)
    public final String getParameter(String arg0) {
        field5817++;
        if (class428.field6222 == null) {
            return class63.field948 == null || class63.field948.field5381 == this ? super.getParameter(arg0) : class63.field948.field5381.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 110)
    public final URL getDocumentBase() {
        field5830++;
        if (class428.field6222 == null) {
            return class63.field948 == null || class63.field948.field5381 == this ? super.getDocumentBase() : class63.field948.field5381.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V", line = 125)
    public static final void method2555(int arg0, int arg1) {
        class159.field2043 = new class51(arg1);
        int var2 = 73 / ((-arg0 - 16) / 53);
        field5803++;
    }

    @OriginalMember(owner = "client!ll", name = "destroy", descriptor = "()V", line = 135)
    public final void destroy() {
        field5802++;
        if (class131.field1721 == this && !class409.field5948) {
            class131.field1717 = class98.method768((byte) 100);
            class31.method245(5000L, -94);
            class280.field4126 = null;
            this.method2560(false, false);
        }
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V", line = 149)
    public final synchronized void method2556(int arg0) {
        field5812++;
        if (arg0 != -19821) {
            return;
        }
        if (class422.field6138 != null) {
            class422.field6138.removeFocusListener(this);
            class422.field6138.getParent().remove(class422.field6138);
        }
        Container var2;
        if (class211.field2872 != null) {
            var2 = class211.field2872;
        } else if (class428.field6222 == null) {
            var2 = class63.field948.field5381;
        } else {
            var2 = class428.field6222;
        }
        var2.setLayout((LayoutManager) null);
        class422.field6138 = new class353(this);
        var2.add(class422.field6138);
        class422.field6138.setSize(class357.field5298, class435.field6313);
        class422.field6138.setVisible(true);
        if (class428.field6222 == var2) {
            Insets var3 = class428.field6222.getInsets();
            class422.field6138.setLocation(class420.field6109 + var3.left, var3.top - -class244.field3436);
        } else {
            class422.field6138.setLocation(class420.field6109, class244.field3436);
        }
        class422.field6138.addFocusListener(this);
        class422.field6138.requestFocus();
        class104.field1363 = true;
        class72.field1018 = true;
        class381.field5586 = true;
        class97.field1314 = false;
        class447.field6428 = class98.method768((byte) -106);
    }

    @OriginalMember(owner = "client!ll", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 196)
    public final void focusGained(FocusEvent arg0) {
        field5810++;
        class72.field1018 = true;
        class381.field5586 = true;
    }

    @OriginalMember(owner = "client!ll", name = "stop", descriptor = "()V", line = 211)
    public final void stop() {
        field5829++;
        if (class131.field1721 == this && !class409.field5948) {
            class131.field1717 = class98.method768((byte) 68) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ll", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 222)
    public final void windowIconified(WindowEvent arg0) {
        field5825++;
    }

    @OriginalMember(owner = "client!ll", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 229)
    public final void windowClosed(WindowEvent arg0) {
        field5804++;
    }

    @OriginalMember(owner = "client!ll", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 239)
    public final synchronized void paint(Graphics arg0) {
        field5818++;
        if (class131.field1721 != this || class409.field5948) {
            return;
        }
        class381.field5586 = true;
        if (class155.field1971 && (class98.method768((byte) 62) - class447.field6428) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class159.field2075 && var2.height >= class331.field4882) {
                class97.field1314 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "(I)V", line = 260)
    private final void method2557(int arg0) {
        field5820++;
        if (arg0 >= -49) {
            field5833 = null;
        }
        long var2 = class98.method768((byte) 31);
        long var4 = class296.field4466[class191.field2658];
        class296.field4466[class191.field2658] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class258.field3781 = ((var6 >> 1) + 32000) / var6;
        }
        class191.field2658 = class191.field2658 + 1 & 0x1F;
        if ((class335.field4959++) > 50) {
            class335.field4959 -= 50;
            class381.field5586 = true;
            class422.field6138.setSize(class357.field5298, class435.field6313);
            class422.field6138.setVisible(true);
            if (class428.field6222 != null && class211.field2872 == null) {
                Insets var7 = class428.field6222.getInsets();
                class422.field6138.setLocation(class420.field6109 + var7.left, class244.field3436 + var7.top);
            } else {
                class422.field6138.setLocation(class420.field6109, class244.field3436);
            }
        }
        this.method411((byte) 122);
    }

    @OriginalMember(owner = "client!ll", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 305)
    public final void windowDeiconified(WindowEvent arg0) {
        field5831++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIZILjava/lang/String;III)V", line = 312)
    public final void method2558(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        try {
            class420.field6109 = 0;
            class342.field5104 = arg0;
            class435.field6313 = arg5;
            class331.field4882 = arg5;
            class357.field5298 = arg1;
            class159.field2075 = arg1;
            class131.field1721 = this;
            class244.field3436 = 0;
            class428.field6222 = new Frame();
            class428.field6222.setTitle("Jagex");
            class428.field6222.setResizable(true);
            class428.field6222.addWindowListener(this);
            class428.field6222.setVisible(true);
            class428.field6222.toFront();
            Insets var9 = class428.field6222.getInsets();
            class428.field6222.setSize(class159.field2075 + var9.left + var9.right, class331.field4882 + var9.top + var9.bottom);
            class280.field4126 = class63.field948 = new class364((Applet) null, arg3, arg4, arg6);
            if (arg7 != -1) {
                return;
            }
            class225 var10 = class63.field948.method2397(this, false, 1);
            while (var10.field3104 == 0) {
                class31.method245(10L, arg7 - 74);
            }
        } catch (Exception var12) {
            class266.method1780(1, (String) null, var12);
        }
        field5824++;
    }

    @OriginalMember(owner = "client!ll", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 355)
    public final URL getCodeBase() {
        field5827++;
        if (class428.field6222 == null) {
            return class63.field948 == null || class63.field948.field5381 == this ? super.getCodeBase() : class63.field948.field5381.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "providesignlink", descriptor = "(Lde;)V", line = 374)
    public static final void providesignlink(class364 arg0) {
        field5809++;
        class63.field948 = arg0;
        class280.field4126 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 383)
    public final void update(Graphics arg0) {
        field5837++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ll", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 391)
    public final void windowActivated(WindowEvent arg0) {
        field5823++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)V", line = 400)
    public final void method2559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5819++;
        try {
            if (class131.field1721 == null) {
                class420.field6109 = 0;
                class244.field3436 = arg0;
                class357.field5298 = arg3;
                class159.field2075 = arg3;
                class435.field6313 = arg4;
                class331.field4882 = arg4;
                class131.field1721 = this;
                class342.field5104 = arg1;
                if (class63.field948 == null) {
                    class280.field4126 = class63.field948 = new class364(this, arg2, (String) null, 0);
                }
                class225 var6 = class63.field948.method2397(this, false, 1);
                while (var6.field3104 == 0) {
                    class31.method245(10L, 96);
                }
            } else {
                class268.field3974++;
                if (class268.field3974 >= 3) {
                    this.method2554("alreadyloaded", 63);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class266.method1780(arg0 + 1, (String) null, var8);
            this.method2554("crash", arg0 ^ 0x3F);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZ)V", line = 445)
    private final void method2560(boolean arg0, boolean arg1) {
        field5834++;
        synchronized (this) {
            if (class409.field5948) {
                return;
            }
            class409.field5948 = true;
        }
        if (class63.field948.field5381 != null) {
            class63.field948.field5381.destroy();
        }
        try {
            this.method407(123);
        } catch (Exception var11) {
        }
        if (this.field5826) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field5826 = false;
        }
        class225 var4 = class63.field948.method2405(true, class131.field1721.getClass());
        while (var4.field3104 == 0) {
            class31.method245(100L, 102);
        }
        if (arg1) {
            field5836 = null;
        }
        if (class422.field6138 != null) {
            try {
                class422.field6138.removeFocusListener(this);
                class422.field6138.getParent().remove(class422.field6138);
            } catch (Exception var9) {
            }
        }
        if (class63.field948 != null) {
            try {
                class63.field948.method2388(0);
            } catch (Exception var8) {
            }
        }
        this.method404(-6613);
        if (class428.field6222 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "(I)V", line = 530)
    private final void method2561(int arg0) {
        field5807++;
        long var2 = class98.method768((byte) -105);
        long var4 = class406.field5914[class295.field4454];
        class406.field5914[class295.field4454] = var2;
        class295.field4454 = class295.field4454 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class104.field1363 = class72.field1018;
        }
        int var7 = 46 / ((arg0 + 46) / 47);
        this.method395(-24551);
    }

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "(I)Z", line = 563)
    public final boolean method2562(int arg0) {
        int var2 = 29 % ((arg0 + 32) / 50);
        field5806++;
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
                this.method2554("invalidhost", 63);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "start", descriptor = "()V", line = 600)
    public final void start() {
        field5816++;
        if (class131.field1721 == this && !class409.field5948) {
            class131.field1717 = 0L;
        }
    }

    @OriginalMember(owner = "client!ll", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 621)
    public final void windowOpened(WindowEvent arg0) {
        field5821++;
    }

    @OriginalMember(owner = "client!ll", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 629)
    public final AppletContext getAppletContext() {
        field5811++;
        if (class428.field6222 == null) {
            return class63.field948 == null || class63.field948.field5381 == this ? super.getAppletContext() : class63.field948.field5381.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 651)
    public final void focusLost(FocusEvent arg0) {
        class72.field1018 = false;
        field5832++;
    }

    @OriginalMember(owner = "client!ll", name = "run", descriptor = "()V", line = 660)
    public final void run() {
        try {
            label111: {
                if (class364.field5386 != null) {
                    String var1 = class364.field5386.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class364.field5376;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2554("wrongjava", 63);
                            break label111;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class364.field5376 == null || class364.field5376.equals("1.4.2"))) {
                        this.method2554("wrongjava", 63);
                        break label111;
                    }
                }
                if (class364.field5376 != null && class364.field5376.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class364.field5376.length()) {
                        char var5 = class364.field5376.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 - (48 - var5);
                        var3++;
                    }
                    if (var4 >= 5) {
                        class155.field1971 = true;
                    }
                }
                if (class63.field948.field5381 != null) {
                    Method var6 = class364.field5391;
                    if (var6 != null) {
                        try {
                            var6.invoke(class63.field948.field5381, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class3.method18(true);
                this.method2556(-19821);
                this.method414(2);
                class92.field1263 = class20.method179((byte) 127);
                this.method2553(0);
                while (class131.field1717 == 0L || class131.field1717 > class98.method768((byte) -84)) {
                    class422.field6131 = class92.field1263.method337(class163.field2227, true);
                    for (int var7 = 0; var7 < class422.field6131; var7++) {
                        this.method2561(53);
                    }
                    this.method2557(-66);
                    class321.method2115(class63.field948, -27, class422.field6138);
                }
            }
        } catch (Exception var10) {
            class266.method1780(1, (String) null, var10);
            this.method2554("crash", 63);
        }
        field5805++;
        this.method2560(true, false);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIZLtj;II[Lao;I[BII)V", line = 783)
    public static final void method2563(int arg0, int arg1, int arg2, boolean arg3, class298 arg4, int arg5, int arg6, class280[] arg7, int arg8, byte[] arg9, int arg10, int arg11) {
        field5808++;
        if (arg6 != 31) {
            return;
        }
        class341 var12 = new class341(arg9);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2236(-31885);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2223(-1);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method2233((byte) 104);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg0 == var19 && arg8 <= var18 && var18 < arg8 + 8 && arg10 <= var17 && arg10 + 8 > var17) {
                    class212 var23 = class372.method2447(var13, (byte) -98);
                    int var24 = class47.method336(18315, var23.field2970, var23.field2946, var17 & 0x7, var22, var18 & 0x7, arg2) + arg1;
                    int var25 = arg11 + class157.method1044(var22, arg2, var18 & 0x7, var23.field2946, (byte) -108, var17 & 0x7, var23.field2970);
                    if (var24 > 0 && var25 > 0 && var24 < class351.field5217 - 1 && (class143.field1815 - 1) > var25) {
                        class280 var26 = null;
                        if (!arg3) {
                            int var27 = arg5;
                            if ((class406.field5912[1][var24][var25] & 0x2) == 2) {
                                var27 = arg5 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg7[var27];
                            }
                        }
                        class143.method989(arg5, (byte) 57, arg5, var21, var24, arg4, arg3, -1, var25, arg2 + var22 & 0x3, var13, true, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 874)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field5814++;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public abstract void method395(int arg0);

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V")
    public abstract void method404(int arg0);

    @OriginalMember(owner = "client!ll", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public abstract void method411(byte arg0);

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(I)V")
    public abstract void method407(int arg0);

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "(I)V")
    public abstract void method414(int arg0);
}
