import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class194 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
    private boolean field3760 = false;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Leh;")
    private static class47 field3766 = class195.method1282((byte) -4, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "Leh;")
    public static class47 field3782 = field3766;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    private final void method1270(byte arg0) {
        int var2 = -22 % (-arg0 / 34);
        field3754++;
        long var3 = class201.method1313(29);
        long var5 = class174.field3361[class186.field3579];
        boolean var10000;
        if (var5 == 0L || var5 >= var3) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class174.field3361[class186.field3579] = var3;
        class186.field3579 = class186.field3579 + 1 & 0x1F;
        synchronized (this) {
            class61.field1278 = class136.field2663;
        }
        this.method259(24);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1271(int arg0) {
        field3784++;
        int var1 = class22.field418.method655(8, 720);
        if (class130.field2575 > var1) {
            for (int var2 = var1; var2 < class130.field2575; var2++) {
                class107.field2230[class92.field1925++] = class146.field2853[var2];
            }
        }
        if (var1 > class130.field2575) {
            throw new RuntimeException("gppov1");
        }
        class130.field2575 = 0;
        int var3 = 28 / ((arg0 - 66) / 36);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class146.field2853[var4];
            class32 var6 = class40.field795[var5];
            int var7 = class22.field418.method655(1, 720);
            if (var7 == 0) {
                class146.field2853[class130.field2575++] = var5;
                var6.field3326 = class18.field362;
            } else {
                int var8 = class22.field418.method655(2, 720);
                if (var8 == 0) {
                    class146.field2853[class130.field2575++] = var5;
                    var6.field3326 = class18.field362;
                    class196.field3810[class94.field1942++] = var5;
                } else if (var8 == 1) {
                    class146.field2853[class130.field2575++] = var5;
                    var6.field3326 = class18.field362;
                    int var9 = class22.field418.method655(3, 720);
                    var6.method1161(var9, false, 16437);
                    int var10 = class22.field418.method655(1, 720);
                    if (var10 == 1) {
                        class196.field3810[class94.field1942++] = var5;
                    }
                } else if (var8 == 2) {
                    class146.field2853[class130.field2575++] = var5;
                    var6.field3326 = class18.field362;
                    int var11 = class22.field418.method655(3, 720);
                    var6.method1161(var11, true, 16437);
                    int var12 = class22.field418.method655(3, 720);
                    var6.method1161(var12, true, 16437);
                    int var13 = class22.field418.method655(1, 720);
                    if (var13 == 1) {
                        class196.field3810[class94.field1942++] = var5;
                    }
                } else if (var8 == 3) {
                    class107.field2230[class92.field1925++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3757++;
    }

    @OriginalMember(owner = "client!ve", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3763++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public abstract void method256(boolean arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIBLjava/lang/String;II)V")
    public final void method1272(int arg0, int arg1, int arg2, byte arg3, String arg4, int arg5, int arg6) {
        field3767++;
        try {
            class149.field2922 = this;
            class19.field370 = arg1;
            if (arg3 != -95) {
                field3787 = 109;
            }
            class123.field2486 = arg5;
            class37.field716 = arg6;
            class34.field655 = new Frame();
            class34.field655.setTitle("Jagex");
            class34.field655.setResizable(false);
            class34.field655.addWindowListener(this);
            class34.field655.setVisible(true);
            class34.field655.toFront();
            Insets var8 = class34.field655.getInsets();
            class34.field655.setSize(arg1 + var8.right + var8.left, var8.bottom + arg5 - -var8.top);
            class127.field2542 = class142.field2782 = new class150(true, null, arg0, arg4, arg2);
            class142.field2782.method1052(2, 1, this);
        } catch (Exception var10) {
            class167.method1131((byte) -93, var10, null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIBI)V")
    public final void method1273(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3765++;
        try {
            if (class149.field2922 == null) {
                class37.field716 = arg1;
                class19.field370 = arg0;
                class149.field2922 = this;
                class123.field2486 = arg2;
                if (arg3 != -61) {
                    this.stop();
                }
                if (class142.field2782 == null) {
                    class127.field2542 = class142.field2782 = new class150(false, this, arg4, null, 0);
                }
                class142.field2782.method1052(arg3 ^ 0xFFFFFFC1, 1, this);
            } else {
                class140.field2745++;
                if (class140.field2745 >= 3) {
                    this.method1274(true, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class167.method1131((byte) -73, var7, null);
            this.method1274(true, "crash");
        }
    }

    @OriginalMember(owner = "client!ve", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3785++;
        if (class34.field655 == null) {
            return class142.field2782 == null || class142.field2782.field2947 == this ? super.getDocumentBase() : class142.field2782.field2947.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3773++;
    }

    @OriginalMember(owner = "client!ve", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3780++;
    }

    @OriginalMember(owner = "client!ve", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class136.field2663 = true;
        class63.field1346 = true;
        field3771++;
    }

    @OriginalMember(owner = "client!ve", name = "providesignlink", descriptor = "(Lqf;)V")
    public static final void providesignlink(class150 arg0) {
        class142.field2782 = arg0;
        class127.field2542 = arg0;
        field3762++;
    }

    @OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
    public final void run() {
        field3772++;
        try {
            if (class150.field2948 != null) {
                String var1 = class150.field2948.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class150.field2937;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1274(true, "wrongjava");
                        return;
                    }
                    class78.field1689 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class150.field2937 == null || class150.field2937.equals("1.4.2"))) {
                    this.method1274(true, "wrongjava");
                    return;
                }
            }
            if (class142.field2782.field2947 != null) {
                Method var3 = class150.field2946;
                if (var3 != null) {
                    try {
                        var3.invoke(class142.field2782.field2947, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1277(0);
            class79.field1714 = class114.method901(class47.field949, class19.field370, class123.field2486, (byte) 123);
            this.method256(true);
            class137.field2685 = class98.method799((byte) -118);
            while (class196.field3832 == 0L || class201.method1313(29) < class196.field3832) {
                class192.field3718 = class137.field2685.method86(class142.field2801, class78.field1689, 19845);
                for (int var4 = 0; var4 < class192.field3718; var4++) {
                    this.method1270((byte) 105);
                }
                this.method1278((byte) -109);
                class90.method727(class47.field949, (byte) 118, class142.field2782);
            }
        } catch (Exception var7) {
            class167.method1131((byte) -54, var7, null);
            this.method1274(true, "crash");
        }
        this.method1280(112);
    }

    @OriginalMember(owner = "client!ve", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3788++;
        if (class34.field655 == null) {
            return class142.field2782 == null || class142.field2782.field2947 == this ? super.getAppletContext() : class142.field2782.field2947.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3761++;
        if (class149.field2922 != this || class179.field3426) {
            return;
        }
        class63.field1346 = true;
        if (class150.field2937 != null && class150.field2937.startsWith("1.5") && class201.method1313(29) - class146.field2864 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class19.field370 && var2.height >= class123.field2486) {
                class197.field3845 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
    public abstract void method257(boolean arg0);

    @OriginalMember(owner = "client!ve", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method1274(boolean arg0, String arg1) {
        field3779++;
        if (this.field3760) {
            return;
        }
        this.field3760 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public abstract void method259(int arg0);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static void method1275(byte arg0) {
        field3782 = null;
        field3766 = null;
        int var1 = 121 % ((-arg0 - 59) / 61);
    }

    @OriginalMember(owner = "client!ve", name = "stop", descriptor = "()V")
    public final void stop() {
        field3758++;
        if (class149.field2922 == this && !class179.field3426) {
            class196.field3832 = class201.method1313(29) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZJ)V")
    public static final void method1276(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (!arg0) {
                method1276(true, -103L);
            }
        } catch (InterruptedException var3) {
        }
        field3756++;
    }

    @OriginalMember(owner = "client!ve", name = "start", descriptor = "()V")
    public final void start() {
        field3770++;
        if (class149.field2922 == this && !class179.field3426) {
            class196.field3832 = 0L;
        }
    }

    @OriginalMember(owner = "client!ve", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3774++;
        if (class34.field655 == null) {
            return class142.field2782 == null || class142.field2782.field2947 == this ? super.getParameter(arg0) : class142.field2782.field2947.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public abstract void method254(int arg0);

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public final synchronized void method1277(int arg0) {
        field3778++;
        Container var2;
        if (class34.field655 == null) {
            var2 = class142.field2782.field2947;
        } else {
            var2 = class34.field655;
        }
        if (class47.field949 != null) {
            class47.field949.removeFocusListener(this);
            var2.remove(class47.field949);
        }
        class47.field949 = new class118(this);
        var2.add(class47.field949);
        class47.field949.setSize(class19.field370, class123.field2486);
        if (arg0 != 0) {
            return;
        }
        class47.field949.setVisible(true);
        if (class34.field655 == null) {
            class47.field949.setLocation(0, 0);
        } else {
            Insets var3 = class34.field655.getInsets();
            class47.field949.setLocation(var3.left, var3.top);
        }
        class47.field949.addFocusListener(this);
        class47.field949.requestFocus();
        class63.field1346 = true;
        class197.field3845 = false;
        class146.field2864 = class201.method1313(arg0 + 29);
    }

    @OriginalMember(owner = "client!ve", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3789++;
    }

    @OriginalMember(owner = "client!ve", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3769++;
        if (class34.field655 == null) {
            return class142.field2782 == null || class142.field2782.field2947 == this ? super.getCodeBase() : class142.field2782.field2947.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    private final void method1278(byte arg0) {
        long var2 = class201.method1313(29);
        long var4 = class156.field3050[class5.field83];
        class156.field3050[class5.field83] = var2;
        int var6 = -85 % ((arg0 - 23) / 49);
        if (var4 != 0L && var2 > var4) {
            int var7 = (int) (var2 - var4);
            class51.field993 = ((var7 >> 1) + 32000) / var7;
        }
        field3764++;
        class5.field83 = class5.field83 + 1 & 0x1F;
        if (class187.field3608++ > 50) {
            class187.field3608 -= 50;
            class63.field1346 = true;
            class47.field949.setSize(class19.field370, class123.field2486);
            class47.field949.setVisible(true);
            if (class34.field655 == null) {
                class47.field949.setLocation(0, 0);
            } else {
                Insets var8 = class34.field655.getInsets();
                class47.field949.setLocation(var8.left, var8.top);
            }
        }
        this.method257(false);
    }

    @OriginalMember(owner = "client!ve", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3776++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public abstract void method262(int arg0);

    @OriginalMember(owner = "client!ve", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3783++;
        if (class149.field2922 == this && !class179.field3426) {
            class196.field3832 = class201.method1313(29);
            class76.method666(5000L, 1);
            class127.field2542 = null;
            this.method1280(101);
        }
    }

    @OriginalMember(owner = "client!ve", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3768++;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)Z")
    public final boolean method1279(byte arg0) {
        if (arg0 != 31) {
            return true;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field3775++;
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
            } else {
                this.method1274(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
    private final synchronized void method1280(int arg0) {
        field3755++;
        if (class179.field3426) {
            return;
        }
        class179.field3426 = true;
        try {
            class47.field949.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method254(0);
            if (arg0 < 59) {
                field3759 = 62;
            }
        } catch (Exception var4) {
        }
        if (class34.field655 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class142.field2782 != null) {
            try {
                class142.field2782.method1056((byte) -104);
            } catch (Exception var2) {
            }
        }
        this.method262(1);
    }

    @OriginalMember(owner = "client!ve", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class136.field2663 = false;
        field3781++;
    }

    @OriginalMember(owner = "client!ve", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3786++;
    }
}
