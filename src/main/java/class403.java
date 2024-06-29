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

@OriginalClass("client!cr")
public abstract class class403 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "Z")
    private boolean field5919 = false;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "Z")
    private boolean field5940 = false;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field5907 = 52;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    public static int field5926 = -1;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!cr", name = "Q", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "Z")
    public static boolean field5948;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "[I")
    public static int[] field5925;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "[Lcp;")
    public static class507[] field5924;

    @OriginalMember(owner = "client!cr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field5910++;
        if (class409.field6029 == null) {
            return class112.field1785 == null || class112.field1785.field4458 == this ? super.getCodeBase() : class112.field1785.field4458.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public abstract void method1342(int arg0);

    @OriginalMember(owner = "client!cr", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!cr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field5906++;
        if (class298.field4256 != this || class76.field1284) {
            return;
        }
        class245.field3532 = true;
        if (class244.field3522 && (class464.method2773((byte) 103) - class250.field3613) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class382.field5683 <= var2.width && class183.field2752 <= var2.height) {
                class425.field6241 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "run", descriptor = "()V")
    public final void run() {
        field5942++;
        try {
            label116: {
                if (class312.field4475 != null) {
                    String var1 = class312.field4475.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class312.field4470;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2505(-1, "wrongjava");
                            break label116;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class312.field4470 == null || class312.field4470.equals("1.4.2"))) {
                        this.method2505(-1, "wrongjava");
                        break label116;
                    }
                }
                if (class312.field4470 != null && class312.field4470.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class312.field4470.length() > var3) {
                        char var5 = class312.field4470.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + (var5 - 48);
                    }
                    if (var4 >= 5) {
                        class244.field3522 = true;
                    }
                }
                if (class112.field1785.field4458 != null) {
                    Method var6 = class312.field4482;
                    if (var6 != null) {
                        try {
                            var6.invoke(class112.field1785.field4458, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class259.method1638((byte) -29);
                class386.method2427((byte) 102);
                this.method2507(0);
                this.method1340(3756);
                class44.field674 = class294.method1818(116);
                this.method2510((byte) -31);
                while (class216.field3121 == 0L || class464.method2773((byte) 103) < class216.field3121) {
                    class18.field276 = class44.field674.method1029(class220.field3181, -101);
                    for (int var7 = 0; var7 < class18.field276; var7++) {
                        this.method2517(-121);
                    }
                    this.method2516((byte) -58);
                    class444.method2701(class112.field1785, (byte) 98, class31.field503);
                }
            }
        } catch (Throwable var10) {
            class169.method1200(this.method1335(-58), var10, (byte) -113);
            this.method2505(-1, "crash");
        }
        this.method2508(true, (byte) -64);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
    public abstract void method1354(int arg0);

    @OriginalMember(owner = "client!cr", name = "stop", descriptor = "()V")
    public final void stop() {
        field5912++;
        if (class298.field4256 == this && !class76.field1284) {
            class216.field3121 = class464.method2773((byte) 103) + 4000L;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
    public static final void method2504(int arg0, int arg1) {
        field5914++;
        class434 var2 = class483.method2888(arg1, 74, 11);
        if (arg0 != 5565) {
            providesignlink(null);
        }
        var2.method2628(11);
    }

    @OriginalMember(owner = "client!cr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field5916++;
        if (class409.field6029 == null) {
            return class112.field1785 == null || class112.field1785.field4458 == this ? super.getDocumentBase() : class112.field1785.field4458.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field5918++;
    }

    @OriginalMember(owner = "client!cr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field5939++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!cr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field5913++;
        if (class409.field6029 == null) {
            return class112.field1785 == null || class112.field1785.field4458 == this ? super.getParameter(arg0) : class112.field1785.field4458.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2505(int arg0, String arg1) {
        field5923++;
        if (arg0 != -1) {
            this.run();
        }
        if (this.field5919) {
            return;
        }
        this.field5919 = true;
        System.out.println("error_game_" + arg1);
        try {
            class426.method2606("loggedout", class112.field1785.field4458, 21615);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!cr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5931++;
        class20.field288 = true;
        class245.field3532 = true;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2506(String arg0, int arg1) {
        field5921++;
        int var2 = arg0.length();
        if (arg1 != 50) {
            field5925 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class167.method1189(arg0.charAt(var4), 26421) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
    public abstract void method1340(int arg0);

    @OriginalMember(owner = "client!cr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field5905++;
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)V")
    public final synchronized void method2507(int arg0) {
        if (class31.field503 != null) {
            class31.field503.removeFocusListener(this);
            class31.field503.getParent().remove(class31.field503);
        }
        field5909++;
        Container var2;
        if (class320.field4577 != null) {
            var2 = class320.field4577;
        } else if (class409.field6029 == null) {
            var2 = class112.field1785.field4458;
        } else {
            var2 = class409.field6029;
        }
        var2.setLayout(null);
        class31.field503 = new class99(this);
        var2.add(class31.field503);
        class31.field503.setSize(class112.field1780, class477.field7003);
        if (arg0 != 0) {
            field5907 = 63;
        }
        class31.field503.setVisible(true);
        if (class409.field6029 == var2) {
            Insets var3 = class409.field6029.getInsets();
            class31.field503.setLocation(class79.field1315 + var3.left, class381.field5677 + var3.top);
        } else {
            class31.field503.setLocation(class79.field1315, class381.field5677);
        }
        class31.field503.addFocusListener(this);
        class31.field503.requestFocus();
        class407.field5987 = true;
        class20.field288 = true;
        class245.field3532 = true;
        class425.field6241 = false;
        class250.field3613 = class464.method2773((byte) 103);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZB)V")
    private final void method2508(boolean arg0, byte arg1) {
        field5915++;
        synchronized (this) {
            if (class76.field1284) {
                return;
            }
            class76.field1284 = true;
        }
        if (class112.field1785.field4458 != null) {
            class112.field1785.field4458.destroy();
        }
        int var4 = -4 / ((arg1 - 59) / 48);
        try {
            this.method1342(1);
        } catch (Exception var12) {
        }
        if (this.field5940) {
            try {
                jagmisc.quit();
            } catch (Throwable var11) {
            }
            this.field5940 = false;
        }
        class100 var5 = class112.field1785.method1961(114, class298.field4256.getClass());
        while (var5.field1604 == 0) {
            class185.method1285(120, 100L);
        }
        if (class31.field503 != null) {
            try {
                class31.field503.removeFocusListener(this);
                class31.field503.getParent().remove(class31.field503);
            } catch (Exception var10) {
            }
        }
        if (class112.field1785 != null) {
            try {
                class112.field1785.method1965(-54);
            } catch (Exception var9) {
            }
        }
        this.method1354(-122);
        if (class409.field6029 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!cr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field5933++;
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V")
    public static final void method2509(int arg0) {
        field5927++;
        class460.field6787.method2476(arg0 ^ arg0);
        class53.field777.method2476(0);
    }

    @OriginalMember(owner = "client!cr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field5911++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public final void method2510(byte arg0) {
        field5943++;
        int var2 = 94 % ((arg0 - 45) / 42);
        if (this.field5940) {
            return;
        }
        try {
            class100 var3 = class112.field1785.method1952(22, class298.field4256.getClass());
            while (var3.field1604 == 0) {
                class185.method1285(117, 100L);
            }
            if (var3.field1608 != null) {
                throw (Throwable) var3.field1608;
            }
            jagmisc.init();
            this.field5940 = true;
            class44.field674 = class294.method1818(111);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)Z")
    public final boolean method2511(byte arg0) {
        if (arg0 < 55) {
            field5928 = 116;
        }
        field5920++;
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
                this.method2505(-1, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
    public abstract void method1337(int arg0);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIZI)V")
    public final void method2512(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5941++;
        try {
            if (class298.field4256 == null) {
                class381.field5677 = 0;
                class432.field6301 = arg0;
                class79.field1315 = 0;
                class477.field7003 = arg1;
                class183.field2752 = arg1;
                class112.field1780 = arg2;
                class382.field5683 = arg2;
                class298.field4256 = this;
                if (class112.field1785 == null) {
                    class401.field5879 = class112.field1785 = new class312(this, arg4, null, 0);
                }
                class100 var6 = class112.field1785.method1959(-111, 1, this);
                while (var6.field1604 == 0) {
                    class185.method1285(114, 10L);
                }
                if (!arg3) {
                    this.windowClosing(null);
                }
            } else {
                class334.field5134++;
                if (class334.field5134 >= 3) {
                    this.method2505(-1, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class169.method1200(null, var8, (byte) -113);
            this.method2505(-1, "crash");
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;IZIIIIZ)V")
    public final void method2513(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field5934++;
        try {
            class477.field7003 = arg4;
            class183.field2752 = arg4;
            class112.field1780 = arg3;
            class382.field5683 = arg3;
            class381.field5677 = 0;
            class79.field1315 = 0;
            class298.field4256 = this;
            class432.field6301 = arg1;
            class409.field6029 = new Frame();
            class409.field6029.setTitle("Jagex");
            class409.field6029.setResizable(arg2);
            class409.field6029.addWindowListener(this);
            class409.field6029.setVisible(true);
            class409.field6029.toFront();
            Insets var9 = class409.field6029.getInsets();
            class409.field6029.setSize(var9.right + var9.left + class382.field5683, class183.field2752 - (-var9.top - var9.bottom));
            class401.field5879 = class112.field1785 = new class312(null, arg5, arg0, arg6);
            class100 var10 = class112.field1785.method1959(-110, 1, this);
            while (var10.field1604 == 0) {
                class185.method1285(115, 10L);
            }
        } catch (Exception var12) {
            class169.method1200(null, var12, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!cr", name = "start", descriptor = "()V")
    public final void start() {
        field5946++;
        if (class298.field4256 == this && !class76.field1284) {
            class216.field3121 = 0L;
        }
    }

    @OriginalMember(owner = "client!cr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field5929++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BII)V")
    public static final void method2514(byte arg0, int arg1, int arg2) {
        if (arg0 <= 123) {
            method2514((byte) -70, -33, 82);
        }
        field5917++;
        class434 var3 = class483.method2888(arg2, 105, 6);
        var3.method2632((byte) 81);
        var3.field6310 = arg1;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
    public static void method2515(boolean arg0) {
        field5924 = null;
        field5925 = null;
        if (arg0) {
            method2504(98, -63);
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V")
    private final void method2516(byte arg0) {
        field5932++;
        long var2 = class464.method2773((byte) 103);
        long var4 = class489.field7144[class324.field4965];
        class489.field7144[class324.field4965] = var2;
        class324.field4965 = class324.field4965 + 1 & 0x1F;
        if (arg0 != -58) {
            method2515(false);
        }
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class285.field4133 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class254.field3677++) > 50) {
            class245.field3532 = true;
            class254.field3677 -= 50;
            class31.field503.setSize(class112.field1780, class477.field7003);
            class31.field503.setVisible(true);
            if (class409.field6029 != null && class320.field4577 == null) {
                Insets var7 = class409.field6029.getInsets();
                class31.field503.setLocation(var7.left + class79.field1315, var7.top - -class381.field5677);
            } else {
                class31.field503.setLocation(class79.field1315, class381.field5677);
            }
        }
        this.method1351(-1);
    }

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "(I)V")
    public abstract void method1351(int arg0);

    @OriginalMember(owner = "client!cr", name = "providesignlink", descriptor = "(Lci;)V")
    public static final void providesignlink(class312 arg0) {
        class112.field1785 = arg0;
        class401.field5879 = arg0;
        field5930++;
    }

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "(I)V")
    private final void method2517(int arg0) {
        int var2 = 102 / ((arg0 + 16) / 54);
        field5945++;
        long var3 = class464.method2773((byte) 103);
        long var5 = class109.field1736[class11.field191];
        class109.field1736[class11.field191] = var3;
        boolean var10000;
        if (var5 == 0L || var3 <= var5) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class11.field191 = class11.field191 + 1 & 0x1F;
        synchronized (this) {
            class407.field5987 = class20.field288;
        }
        this.method1337(120);
    }

    @OriginalMember(owner = "client!cr", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field5922++;
        if (class298.field4256 == this && !class76.field1284) {
            class216.field3121 = class464.method2773((byte) 103);
            class185.method1285(124, 5000L);
            class401.field5879 = null;
            this.method2508(false, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!cr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field5938++;
        this.destroy();
    }

    @OriginalMember(owner = "client!cr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field5908++;
    }

    @OriginalMember(owner = "client!cr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class20.field288 = false;
        field5935++;
    }

    @OriginalMember(owner = "client!cr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field5936++;
        if (class409.field6029 == null) {
            return class112.field1785 == null || class112.field1785.field4458 == this ? super.getAppletContext() : class112.field1785.field4458.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "(I)Ljava/lang/String;")
    public String method1335(int arg0) {
        field5937++;
        if (arg0 != -58) {
            this.field5940 = true;
        }
        return null;
    }
}
