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

@OriginalClass("client!mha")
public abstract class class414 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "Z")
    private boolean field5649 = false;

    @OriginalMember(owner = "client!mha", name = "p", descriptor = "Z")
    private boolean field5645 = false;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!mha", name = "o", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!mha", name = "v", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!mha", name = "w", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!mha", name = "x", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!mha", name = "y", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!mha", name = "A", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!mha", name = "B", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!mha", name = "C", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!mha", name = "D", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!mha", name = "F", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!mha", name = "G", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!mha", name = "H", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!mha", name = "I", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!mha", name = "J", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!mha", name = "K", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!mha", name = "M", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!mha", name = "N", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!mha", name = "O", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!mha", name = "P", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!mha", name = "X", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!mha", name = "Z", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!mha", name = "bb", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!mha", name = "db", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!mha", name = "L", descriptor = "Z")
    public static boolean field5666;

    @OriginalMember(owner = "client!mha", name = "Q", descriptor = "Z")
    public static boolean field5671;

    @OriginalMember(owner = "client!mha", name = "R", descriptor = "Z")
    public static boolean field5672;

    @OriginalMember(owner = "client!mha", name = "S", descriptor = "Z")
    public static boolean field5673;

    @OriginalMember(owner = "client!mha", name = "T", descriptor = "Z")
    public static boolean field5674;

    @OriginalMember(owner = "client!mha", name = "U", descriptor = "Z")
    public static boolean field5675;

    @OriginalMember(owner = "client!mha", name = "V", descriptor = "Z")
    public static boolean field5676;

    @OriginalMember(owner = "client!mha", name = "W", descriptor = "Z")
    public static boolean field5677;

    @OriginalMember(owner = "client!mha", name = "Y", descriptor = "Z")
    public static boolean field5679;

    @OriginalMember(owner = "client!mha", name = "ab", descriptor = "Z")
    public static boolean field5681;

    @OriginalMember(owner = "client!mha", name = "cb", descriptor = "Z")
    public static boolean field5683;

    @OriginalMember(owner = "client!mha", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field5653++;
        if (class537.field7761 == null) {
            return class255.field3123 == null || class255.field3123 == this ? super.getAppletContext() : class255.field3123.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!mha", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field5662++;
    }

    @OriginalMember(owner = "client!mha", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field5661++;
    }

    @OriginalMember(owner = "client!mha", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field5665++;
        if (class537.field7761 == null) {
            return class255.field3123 == null || class255.field3123 == this ? super.getDocumentBase() : class255.field3123.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Z)Z")
    public final boolean method2529(boolean arg0) {
        field5652++;
        return arg0 ? class79.method555(33, "jagtheora") : false;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class210[] var7 = class115.field1203;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class210 var9 = var7[var8];
            if (var9 != null && var9.field2471 == 2) {
                class344.method2051(arg6 >> 1, arg3 >> 1, var9.field2479, var9.field2483 * 2, -14870, var9.field2478, arg0, arg4, var9.field2470);
                if (class595.field8399[0] > -1 && class392.field5398 % 20 < 10) {
                    class131 var10 = class255.field3121[var9.field2480];
                    int var11 = class595.field8399[0] + arg2 - 12;
                    int var12 = arg5 + class595.field8399[1] - 28;
                    var10.method824(var11, var12);
                    class16.method75(var12, (byte) 36, var10.method510() + var12, var11, var11 + var10.method501());
                }
            }
        }
        if (arg1 == 32268) {
            field5641++;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
    public abstract void method1793(int arg0);

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method2531(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field5660++;
        int var8 = 71 / ((15 - arg4) / 48);
        try {
            if (class471.field6735 == null) {
                class476.field6777 = arg6;
                class217.field2523 = arg6;
                class631.field9067 = arg2;
                class208.field2452 = class255.field3123;
                class93.field979 = 0;
                class471.field6735 = this;
                class705.field9926 = arg3;
                class71.field758 = arg3;
                class504.field7104 = 0;
                class239.field2847 = class289.field3549 = new class546(arg0, arg5, arg1, class255.field3123 != null);
                class290 var9 = class289.field3549.method3215(1, this, 2);
                while (var9.field3573 == 0) {
                    class524.method3076(1, 10L);
                }
            } else {
                class649.field9277++;
                if (class649.field9277 >= 3) {
                    this.method2532(0, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var11) {
            class151.method936(null, var11, 113);
            this.method2532(0, "crash");
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2532(int arg0, String arg1) {
        field5663++;
        if (this.field5645) {
            return;
        }
        this.field5645 = true;
        System.out.println("error_game_" + arg1);
        try {
            class393.method2415("loggedout", 21, class255.field3123);
            if (arg0 != 0) {
                this.method2533((byte) 92);
            }
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!mha", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field5664++;
    }

    @OriginalMember(owner = "client!mha", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field5643++;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V")
    private final void method2533(byte arg0) {
        field5651++;
        long var2 = class652.method3700(-1);
        long var4 = class718.field10078[class79.field828];
        class718.field10078[class79.field828] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class79.field828 = class79.field828 + 1 & 0x1F;
        synchronized (this) {
            class579.field8197 = class591.field8340;
            if (arg0 <= 106) {
                this.update(null);
            }
        }
        this.method1782((byte) -94);
    }

    @OriginalMember(owner = "client!mha", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field5654++;
        if (class537.field7761 == null) {
            return class255.field3123 == null || class255.field3123 == this ? super.getParameter(arg0) : class255.field3123.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field5642++;
        if (class537.field7761 == null) {
            return class255.field3123 == null || class255.field3123 == this ? super.getCodeBase() : class255.field3123.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "stop", descriptor = "()V")
    public final void stop() {
        field5634++;
        if (class471.field6735 == this && !class409.field5592) {
            class261.field3240 = class652.method3700(-1) + 4000L;
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(B)V")
    public synchronized void method1777(byte arg0) {
        if (arg0 != -4) {
            return;
        }
        if (class618.field8849 != null) {
            class618.field8849.removeFocusListener(this);
            class618.field8849.getParent().setBackground(Color.black);
            class618.field8849.getParent().remove(class618.field8849);
        }
        field5657++;
        Container var2;
        if (class370.field4740 != null) {
            var2 = class370.field4740;
        } else if (class537.field7761 != null) {
            var2 = class537.field7761;
        } else if (class255.field3123 == null) {
            var2 = class471.field6735;
        } else {
            var2 = class255.field3123;
        }
        var2.setLayout(null);
        class618.field8849 = new class142(this);
        var2.add(class618.field8849);
        class618.field8849.setSize(class705.field9926, class476.field6777);
        class618.field8849.setVisible(true);
        if (class537.field7761 == var2) {
            Insets var3 = class537.field7761.getInsets();
            class618.field8849.setLocation(class93.field979 + var3.left, class504.field7104 + var3.top);
        } else {
            class618.field8849.setLocation(class93.field979, class504.field7104);
        }
        class618.field8849.addFocusListener(this);
        class618.field8849.requestFocus();
        class579.field8197 = true;
        class591.field8340 = true;
        class237.field2828 = true;
        class681.field9645 = false;
        class331.field4301 = class652.method3700(-1);
    }

    @OriginalMember(owner = "client!mha", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field5656++;
        this.destroy();
    }

    @OriginalMember(owner = "client!mha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class591.field8340 = true;
        field5631++;
        class237.field2828 = true;
    }

    @OriginalMember(owner = "client!mha", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field5659++;
        if (class471.field6735 == this && !class409.field5592) {
            class261.field3240 = class652.method3700(-1);
            class524.method3076(1, 5000L);
            class239.field2847 = null;
            this.method2536(false, -92);
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)Z")
    public final boolean method2534(int arg0) {
        field5644++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (arg0 != -25706) {
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
                this.method2532(0, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(I)V")
    public abstract void method1787(int arg0);

    @OriginalMember(owner = "client!mha", name = "start", descriptor = "()V")
    public final void start() {
        field5658++;
        if (class471.field6735 == this && !class409.field5592) {
            class261.field3240 = 0L;
        }
    }

    @OriginalMember(owner = "client!mha", name = "run", descriptor = "()V")
    public final void run() {
        field5632++;
        try {
            if (class546.field7837 != null) {
                String var1 = class546.field7837.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class546.field7856;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2532(0, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class546.field7856 == null || class546.field7856.equals("1.4.2"))) {
                    this.method2532(0, "wrongjava");
                    return;
                }
            }
            if (class546.field7856 != null && class546.field7856.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class546.field7856.length()) {
                    char var5 = class546.field7856.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class94.field988 = true;
                }
            }
            Applet var6 = class471.field6735;
            if (class255.field3123 != null) {
                var6 = class255.field3123;
            }
            Method var7 = class546.field7854;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class165.method1029((byte) -49);
            class735.method4100((byte) -125);
            this.method1777((byte) -4);
            this.method1781((byte) -56);
            class635.field9137 = class379.method2332(-1);
            while (class261.field3240 == 0L || class261.field3240 > class652.method3700(-1)) {
                class5.field39 = class635.field9137.method315(1, class90.field936);
                for (int var8 = 0; var8 < class5.field39; var8++) {
                    this.method2533((byte) 107);
                }
                this.method2537(false);
                class141.method885(class289.field3549, class618.field8849, (byte) 104);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class151.method936(this.method1797((byte) 25), var20, 89);
            this.method2532(0, "crash");
        } finally {
            Object var13 = null;
            this.method2536(true, -66);
        }
    }

    @OriginalMember(owner = "client!mha", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field5637++;
        if (class471.field6735 != this || class409.field5592) {
            return;
        }
        class237.field2828 = true;
        if (class94.field988 && class652.method3700(-1) - class331.field4301 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class71.field758 && class217.field2523 <= var2.height) {
                class681.field9645 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(B)V")
    public abstract void method1782(byte arg0);

    @OriginalMember(owner = "client!mha", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field5655++;
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(Z)Z")
    public final boolean method2535(boolean arg0) {
        field5633++;
        if (!arg0) {
            this.method1777((byte) -21);
        }
        return class79.method555(33, "jaclib");
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(B)Ljava/lang/String;")
    public String method1797(byte arg0) {
        if (arg0 != 25) {
            this.method2532(-23, null);
        }
        field5646++;
        return null;
    }

    @OriginalMember(owner = "client!mha", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field5636++;
    }

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "(B)V")
    public abstract void method1781(byte arg0);

    @OriginalMember(owner = "client!mha", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field5638++;
    }

    @OriginalMember(owner = "client!mha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class591.field8340 = false;
        field5635++;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZI)V")
    private final void method2536(boolean arg0, int arg1) {
        field5630++;
        synchronized (this) {
            if (class409.field5592) {
                return;
            }
            class409.field5592 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class255.field3123 != null) {
            class255.field3123.destroy();
        }
        try {
            this.method1796(true);
        } catch (Exception var10) {
        }
        if (this.field5649) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field5649 = false;
        }
        int var4 = -97 / ((arg1 - 39) / 53);
        class684.method3874((byte) 8, true);
        class323.method1927(35632);
        if (class618.field8849 != null) {
            try {
                class618.field8849.removeFocusListener(this);
                class618.field8849.getParent().remove(class618.field8849);
            } catch (Exception var8) {
            }
        }
        if (class289.field3549 != null) {
            try {
                class289.field3549.method3208(0);
            } catch (Exception var7) {
            }
        }
        this.method1787(15600);
        if (class537.field7761 != null) {
            class537.field7761.setVisible(false);
            class537.field7761.dispose();
            class537.field7761 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(Z)V")
    private final void method2537(boolean arg0) {
        field5640++;
        if (arg0) {
            return;
        }
        long var2 = class652.method3700(-1);
        long var4 = class421.field6091[class68.field699];
        class421.field6091[class68.field699] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class429.field6239 = ((var6 >> 1) + 32000) / var6;
        }
        class68.field699 = class68.field699 + 1 & 0x1F;
        if (class176.field2067++ > 50) {
            class237.field2828 = true;
            class176.field2067 -= 50;
            class618.field8849.setSize(class705.field9926, class476.field6777);
            class618.field8849.setVisible(true);
            if (class537.field7761 != null && class370.field4740 == null) {
                Insets var7 = class537.field7761.getInsets();
                class618.field8849.setLocation(class93.field979 + var7.left, class504.field7104 + var7.top);
            } else {
                class618.field8849.setLocation(class93.field979, class504.field7104);
            }
        }
        this.method1793(-3);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZIIIILjava/lang/String;I)V")
    public final void method2538(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field5648++;
        try {
            class208.field2452 = null;
            class705.field9926 = arg5;
            class71.field758 = arg5;
            class631.field9067 = arg7;
            class471.field6735 = this;
            class93.field979 = 0;
            class504.field7104 = 0;
            class476.field6777 = arg3;
            class217.field2523 = arg3;
            class537.field7761 = new Frame();
            class537.field7761.setTitle("Jagex");
            class537.field7761.setResizable(true);
            class537.field7761.addWindowListener(this);
            class537.field7761.setVisible(true);
            class537.field7761.toFront();
            Insets var9 = class537.field7761.getInsets();
            class537.field7761.setSize(class71.field758 + var9.left + var9.right, class217.field2523 + var9.top + var9.bottom);
            if (arg2 < -27) {
                class239.field2847 = class289.field3549 = new class546(arg4, arg6, arg0, true);
                class290 var10 = class289.field3549.method3215(1, this, 2);
                while (var10.field3573 == 0) {
                    class524.method3076(1, 10L);
                }
            }
        } catch (Exception var12) {
            class151.method936(null, var12, 65);
        }
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(I)Z")
    public final boolean method2539(int arg0) {
        field5647++;
        return arg0 == -32067 ? class79.method555(33, "jagmisc") : true;
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(Z)V")
    public abstract void method1796(boolean arg0);

    @OriginalMember(owner = "client!mha", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        field5650++;
        class255.field3123 = arg0;
    }
}
