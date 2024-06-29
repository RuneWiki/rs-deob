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

@OriginalClass("client!ii")
public abstract class class407 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "Z")
    private boolean field5652 = false;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "Z")
    private boolean field5662 = false;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "J")
    public static long field5638 = -1L;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Z")
    public static boolean field5666;

    static {
        new class368("From", "Von:", "De", "De");
    }

    @OriginalMember(owner = "client!ii", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final void update(Graphics arg0) {
        field5633++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ii", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 14)
    public final String getParameter(String arg0) {
        field5645++;
        if (class323.field4392 == null) {
            return class122.field1839 == null || class122.field1839.field1086 == this ? super.getParameter(arg0) : class122.field1839.field1086.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 34)
    public final void windowOpened(WindowEvent arg0) {
        field5659++;
    }

    @OriginalMember(owner = "client!ii", name = "stop", descriptor = "()V", line = 41)
    public final void stop() {
        field5632++;
        if (class244.field3447 == this && !class31.field421) {
            class66.field926 = class199.method1372(30938) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ii", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 56)
    public final void windowIconified(WindowEvent arg0) {
        field5648++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BIIII)V", line = 63)
    public final void method2509(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5663++;
        try {
            if (class244.field3447 == null) {
                class396.field5493 = arg1;
                class350.field4718 = arg1;
                class13.field116 = 0;
                class244.field3447 = this;
                class373.field5174 = arg3;
                class72.field1041 = arg3;
                class383.field5271 = arg4;
                class193.field2798 = 0;
                if (arg0 < 77) {
                    this.field5662 = false;
                }
                if (class122.field1839 == null) {
                    class117.field1779 = class122.field1839 = new class76(this, arg2, (String) null, 0);
                }
                class285 var6 = class122.field1839.method586(this, (byte) 103, 1);
                while (var6.field3875 == 0) {
                    class328.method1999(0, 10L);
                }
            } else {
                class367.field5099++;
                if (class367.field5099 >= 3) {
                    this.method2517("alreadyloaded", true);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class48.method399((byte) 86, var8, (String) null);
            this.method2517("crash", true);
        }
    }

    @OriginalMember(owner = "client!ii", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 111)
    public final synchronized void paint(Graphics arg0) {
        field5650++;
        if (class244.field3447 != this || class31.field421) {
            return;
        }
        class147.field2136 = true;
        if (class363.field4996 && class199.method1372(30938) - class189.field2730 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class72.field1041 <= var2.width && var2.height >= class350.field4718) {
                class192.field2776 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 142)
    public final void focusLost(FocusEvent arg0) {
        field5647++;
        class416.field5768 = false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BZIIILjava/lang/String;II)V", line = 150)
    public final void method2510(byte arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field5646++;
        try {
            class193.field2798 = 0;
            class244.field3447 = this;
            class396.field5493 = arg7;
            class350.field4718 = arg7;
            class13.field116 = 0;
            class373.field5174 = arg2;
            class72.field1041 = arg2;
            class383.field5271 = arg3;
            class323.field4392 = new Frame();
            class323.field4392.setTitle("Jagex");
            class323.field4392.setResizable(true);
            class323.field4392.addWindowListener(this);
            class323.field4392.setVisible(true);
            class323.field4392.toFront();
            Insets var9 = class323.field4392.getInsets();
            class323.field4392.setSize(class72.field1041 - (-var9.right - var9.left), class350.field4718 + var9.top + var9.bottom);
            class117.field1779 = class122.field1839 = new class76((Applet) null, arg4, arg5, arg6);
            class285 var10 = class122.field1839.method586(this, (byte) 103, 1);
            while (var10.field3875 == 0) {
                class328.method1999(0, 10L);
            }
        } catch (Exception var12) {
            class48.method399((byte) 86, var12, (String) null);
        }
        if (arg0 != -12) {
            this.field5652 = false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)I", line = 191)
    public static final int method2511(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 29743) {
            method2515(-107, 43, 98, 20, -52);
        }
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        field5656++;
        return ((arg1 >> 2 & 0x3F) << 10) + ((arg3 >> 5 << 7) + (arg0 >> 1));
    }

    @OriginalMember(owner = "client!ii", name = "start", descriptor = "()V", line = 218)
    public final void start() {
        field5644++;
        if (class244.field3447 == this && !class31.field421) {
            class66.field926 = 0L;
        }
    }

    @OriginalMember(owner = "client!ii", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 229)
    public final AppletContext getAppletContext() {
        field5658++;
        if (class323.field4392 == null) {
            return class122.field1839 == null || class122.field1839.field1086 == this ? super.getAppletContext() : class122.field1839.field1086.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V", line = 243)
    public final synchronized void method2512(byte arg0) {
        if (class104.field1447 != null) {
            class104.field1447.removeFocusListener(this);
            class104.field1447.getParent().remove(class104.field1447);
        }
        field5643++;
        Container var2;
        if (class261.field3604 != null) {
            var2 = class261.field3604;
        } else if (class323.field4392 == null) {
            var2 = class122.field1839.field1086;
        } else {
            var2 = class323.field4392;
        }
        var2.setLayout((LayoutManager) null);
        class104.field1447 = new class361(this);
        if (arg0 >= -118) {
            this.method1642((byte) -43);
        }
        var2.add(class104.field1447);
        class104.field1447.setSize(class373.field5174, class396.field5493);
        class104.field1447.setVisible(true);
        if (class323.field4392 == var2) {
            Insets var3 = class323.field4392.getInsets();
            class104.field1447.setLocation(class193.field2798 + var3.left, var3.top - -class13.field116);
        } else {
            class104.field1447.setLocation(class193.field2798, class13.field116);
        }
        class104.field1447.addFocusListener(this);
        class104.field1447.requestFocus();
        class416.field5768 = true;
        class29.field409 = true;
        class147.field2136 = true;
        class192.field2776 = false;
        class189.field2730 = class199.method1372(30938);
    }

    @OriginalMember(owner = "client!ii", name = "destroy", descriptor = "()V", line = 290)
    public final void destroy() {
        field5649++;
        if (class244.field3447 == this && !class31.field421) {
            class66.field926 = class199.method1372(30938);
            class328.method1999(0, 5000L);
            class117.field1779 = null;
            this.method2514(false, 0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 308)
    public final void windowActivated(WindowEvent arg0) {
        field5639++;
    }

    @OriginalMember(owner = "client!ii", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 315)
    public final URL getCodeBase() {
        field5653++;
        if (class323.field4392 == null) {
            return class122.field1839 == null || class122.field1839.field1086 == this ? super.getCodeBase() : class122.field1839.field1086.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "run", descriptor = "()V", line = 335)
    public final void run() {
        field5651++;
        try {
            label114: {
                if (class76.field1074 != null) {
                    String var1 = class76.field1074.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class76.field1090;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2517("wrongjava", true);
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class76.field1090 == null || class76.field1090.equals("1.4.2"))) {
                        this.method2517("wrongjava", true);
                        break label114;
                    }
                }
                if (class76.field1090 != null && class76.field1090.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class76.field1090.length() > var3) {
                        char var5 = class76.field1090.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class363.field4996 = true;
                    }
                }
                if (class122.field1839.field1086 != null) {
                    Method var6 = class76.field1094;
                    if (var6 != null) {
                        try {
                            var6.invoke(class122.field1839.field1086, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class431.method2654(12661);
                class22.method127(-17608);
                this.method2512((byte) -126);
                this.method1642((byte) 76);
                class254.field3522 = class11.method58((byte) 1);
                this.method2519(-23821);
                while (class66.field926 == 0L || class66.field926 > class199.method1372(30938)) {
                    class18.field245 = class254.field3522.method553(4970, class104.field1452);
                    for (int var7 = 0; var7 < class18.field245; var7++) {
                        this.method2513(false);
                    }
                    this.method2516((byte) 100);
                    class229.method1499(class122.field1839, class104.field1447, 22);
                }
            }
        } catch (Exception var10) {
            class48.method399((byte) 86, var10, (String) null);
            this.method2517("crash", true);
        }
        this.method2514(true, 0);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V", line = 453)
    private final void method2513(boolean arg0) {
        field5660++;
        long var2 = class199.method1372(30938);
        if (arg0) {
            field5638 = -45L;
        }
        long var4 = class229.field3226[class155.field2214];
        class229.field3226[class155.field2214] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class155.field2214 = class155.field2214 + 1 & 0x1F;
        synchronized (this) {
            class29.field409 = class416.field5768;
        }
        this.method1646(83);
    }

    @OriginalMember(owner = "client!ii", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 490)
    public final void focusGained(FocusEvent arg0) {
        class416.field5768 = true;
        field5634++;
        class147.field2136 = true;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V", line = 506)
    private final void method2514(boolean arg0, int arg1) {
        field5655++;
        synchronized (this) {
            if (class31.field421) {
                return;
            }
            class31.field421 = true;
        }
        if (class122.field1839.field1086 != null) {
            class122.field1839.field1086.destroy();
        }
        try {
            this.method1647(false);
        } catch (Exception var11) {
        }
        if (this.field5662) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field5662 = false;
        }
        if (arg1 != 0) {
            this.getDocumentBase();
        }
        class285 var4 = class122.field1839.method607(arg1 ^ 0x9, class244.field3447.getClass());
        while (var4.field3875 == 0) {
            class328.method1999(0, 100L);
        }
        if (class104.field1447 != null) {
            try {
                class104.field1447.removeFocusListener(this);
                class104.field1447.getParent().remove(class104.field1447);
            } catch (Exception var9) {
            }
        }
        if (class122.field1839 != null) {
            try {
                class122.field1839.method590(false);
            } catch (Exception var8) {
            }
        }
        this.method1629(78);
        if (class323.field4392 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V", line = 587)
    public static final void method2515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5661++;
        int var5 = 0;
        int var6 = arg2;
        if (arg1 != 1) {
            field5638 = 89L;
        }
        int var7 = -arg2;
        class149.method1112(arg3, arg0 + arg2, 8, arg0 - arg2, class83.field1157[arg4]);
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class83.field1157[arg4 + var6];
                int[] var10 = class83.field1157[arg4 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class149.method1112(arg3, var11, 8, var12, var9);
                class149.method1112(arg3, var11, 8, var12, var10);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class83.field1157[arg4 + var5];
            int[] var16 = class83.field1157[arg4 - var5];
            class149.method1112(arg3, var13, arg1 ^ 0x9, var14, var15);
            class149.method1112(arg3, var13, 8, var14, var16);
        }
    }

    @OriginalMember(owner = "client!ii", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 641)
    public final void windowDeiconified(WindowEvent arg0) {
        field5636++;
    }

    @OriginalMember(owner = "client!ii", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 648)
    public final void windowDeactivated(WindowEvent arg0) {
        field5642++;
    }

    @OriginalMember(owner = "client!ii", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 663)
    public final URL getDocumentBase() {
        field5635++;
        if (class323.field4392 == null) {
            return class122.field1839 == null || class122.field1839.field1086 == this ? super.getDocumentBase() : class122.field1839.field1086.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V", line = 679)
    private final void method2516(byte arg0) {
        field5640++;
        if (arg0 < 51) {
            this.windowDeiconified((WindowEvent) null);
        }
        long var2 = class199.method1372(30938);
        long var4 = class417.field5775[class388.field5398];
        class417.field5775[class388.field5398] = var2;
        class388.field5398 = class388.field5398 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class84.field1181 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class203.field2893++) > 50) {
            class203.field2893 -= 50;
            class147.field2136 = true;
            class104.field1447.setSize(class373.field5174, class396.field5493);
            class104.field1447.setVisible(true);
            if (class323.field4392 != null && class261.field3604 == null) {
                Insets var7 = class323.field4392.getInsets();
                class104.field1447.setLocation(class193.field2798 + var7.left, class13.field116 + var7.top);
            } else {
                class104.field1447.setLocation(class193.field2798, class13.field116);
            }
        }
        this.method1632(29);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 727)
    public final void method2517(String arg0, boolean arg1) {
        field5654++;
        if (this.field5652) {
            return;
        }
        this.field5652 = arg1;
        System.out.println("error_game_" + arg0);
        try {
            class9.method49(class122.field1839.field1086, "loggedout", -107);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)Z", line = 751)
    public final boolean method2518(byte arg0) {
        field5630++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 <= 21) {
                field5638 = -99L;
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method2517("invalidhost", true);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 787)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field5637++;
    }

    @OriginalMember(owner = "client!ii", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 798)
    public final void windowClosed(WindowEvent arg0) {
        field5641++;
    }

    @OriginalMember(owner = "client!ii", name = "providesignlink", descriptor = "(Lne;)V", line = 805)
    public static final void providesignlink(class76 arg0) {
        field5631++;
        class122.field1839 = arg0;
        class117.field1779 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V", line = 819)
    public final void method2519(int arg0) {
        field5657++;
        if (!this.field5662) {
            try {
                class285 var2 = class122.field1839.method605(true, class244.field3447.getClass());
                while (var2.field3875 == 0) {
                    class328.method1999(arg0 + 23821, 100L);
                }
                if (var2.field3871 != null) {
                    throw (Throwable) var2.field3871;
                }
                jagmisc.init();
                this.field5662 = true;
                class254.field3522 = class11.method58((byte) 107);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != -23821) {
            this.field5652 = true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public abstract void method1629(int arg0);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public abstract void method1646(int arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public abstract void method1642(byte arg0);

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
    public abstract void method1632(int arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public abstract void method1647(boolean arg0);

    @OriginalMember(owner = "client!ii", name = "init", descriptor = "()V")
    public abstract void init();
}
