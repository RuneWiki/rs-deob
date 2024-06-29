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

@OriginalClass("client!vt")
public abstract class class303 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vt", name = "B", descriptor = "Z")
    private boolean field4266 = false;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "Z")
    private boolean field4264 = false;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Lee;")
    public static class673 field4243 = new class673("WTI", 5);

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "[I")
    public static int[] field4275 = new int[1];

    @OriginalMember(owner = "client!vt", name = "I", descriptor = "Lqaa;")
    public static class27 field4273 = new class27(43, 3);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!vt", name = "C", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!vt", name = "D", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!vt", name = "E", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!vt", name = "G", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!vt", name = "N", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!vt", name = "Q", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!vt", name = "R", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!vt", name = "U", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!vt", name = "W", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!vt", name = "X", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!vt", name = "Y", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!vt", name = "Z", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!vt", name = "ab", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!vt", name = "cb", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!vt", name = "db", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!vt", name = "O", descriptor = "Z")
    public static boolean field4279;

    @OriginalMember(owner = "client!vt", name = "P", descriptor = "Z")
    public static boolean field4280;

    @OriginalMember(owner = "client!vt", name = "S", descriptor = "Z")
    public static boolean field4283;

    @OriginalMember(owner = "client!vt", name = "T", descriptor = "Z")
    public static boolean field4284;

    @OriginalMember(owner = "client!vt", name = "V", descriptor = "Z")
    public static boolean field4286;

    @OriginalMember(owner = "client!vt", name = "bb", descriptor = "Z")
    public static boolean field4292;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V", line = 5)
    public static void method1963(byte arg0) {
        field4243 = null;
        field4273 = null;
        field4275 = null;
        if (arg0 <= 36) {
            field4275 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "start", descriptor = "()V", line = 17)
    public final void start() {
        field4249++;
        if (class407.field5670 == this && !class566.field8004) {
            class498.field7095 = 0L;
        }
    }

    @OriginalMember(owner = "client!vt", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 31)
    public final void focusLost(FocusEvent arg0) {
        class262.field3825 = false;
        field4256++;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V", line = 44)
    public static final void method1964(byte arg0) {
        field4270++;
        if (arg0 > -48) {
            method1963((byte) 49);
        }
        class478.field6826 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IZ)V", line = 55)
    private final void method1965(int arg0, boolean arg1) {
        field4258++;
        synchronized (this) {
            if (class566.field8004) {
                return;
            }
            class566.field8004 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class476.field6812 != null) {
            class476.field6812.destroy();
        }
        try {
            this.method1932(false);
        } catch (Exception var9) {
        }
        if (arg0 != 57) {
            field4243 = null;
        }
        if (this.field4266) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field4266 = false;
        }
        class727.method4043(true, 115);
        class52.method478(arg0 + 5251);
        if (class567.field8085 != null) {
            try {
                class567.field8085.removeFocusListener(this);
                class567.field8085.getParent().remove(class567.field8085);
            } catch (Exception var7) {
            }
        }
        if (class341.field4796 != null) {
            try {
                class341.field4796.method2278(true);
            } catch (Exception var6) {
            }
        }
        this.method1938(-98);
        if (class754.field10504 != null) {
            class754.field10504.setVisible(false);
            class754.field10504.dispose();
            class754.field10504 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;)V", line = 130)
    public final void method1966(int arg0, String arg1) {
        field4254++;
        if (this.field4264) {
            return;
        }
        this.field4264 = true;
        if (arg0 != 0) {
            this.windowClosed(null);
        }
        System.out.println("error_game_" + arg1);
        try {
            class101.method889("loggedout", class476.field6812, -27420);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)V", line = 156)
    public synchronized void method1945(byte arg0) {
        field4276++;
        if (class567.field8085 != null) {
            class567.field8085.removeFocusListener(this);
            class567.field8085.getParent().setBackground(Color.black);
            class567.field8085.getParent().remove(class567.field8085);
        }
        Container var2;
        if (class330.field4654 != null) {
            var2 = class330.field4654;
        } else if (class754.field10504 != null) {
            var2 = class754.field10504;
        } else if (class476.field6812 == null) {
            var2 = class407.field5670;
        } else {
            var2 = class476.field6812;
        }
        var2.setLayout(null);
        class567.field8085 = new class279(this);
        var2.add(class567.field8085);
        class567.field8085.setSize(class206.field2956, class363.field5105);
        class567.field8085.setVisible(true);
        if (class754.field10504 == var2) {
            Insets var3 = class754.field10504.getInsets();
            class567.field8085.setLocation(class452.field6245 + var3.left, class57.field1060 + var3.top);
        } else {
            class567.field8085.setLocation(class452.field6245, class57.field1060);
        }
        class567.field8085.addFocusListener(this);
        class567.field8085.requestFocus();
        class33.field439 = true;
        class262.field3825 = true;
        class701.field9847 = true;
        if (arg0 != 2) {
            this.method1974(-47);
        }
        class206.field2957 = false;
        class262.field3826 = class742.method4128(1);
    }

    @OriginalMember(owner = "client!vt", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 212)
    public final URL getDocumentBase() {
        field4269++;
        if (class754.field10504 == null) {
            return class476.field6812 == null || class476.field6812 == this ? super.getDocumentBase() : class476.field6812.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 227)
    private final void method1967(int arg0) {
        field4253++;
        long var2 = class742.method4128(1);
        long var4 = class339.field4773[class113.field1809];
        class339.field4773[class113.field1809] = var2;
        if (arg0 <= 12) {
            this.method1966(-125, null);
        }
        class113.field1809 = class113.field1809 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class77.field1452 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class322.field4585++) > 50) {
            class701.field9847 = true;
            class322.field4585 -= 50;
            class567.field8085.setSize(class206.field2956, class363.field5105);
            class567.field8085.setVisible(true);
            if (class754.field10504 != null && class330.field4654 == null) {
                Insets var7 = class754.field10504.getInsets();
                class567.field8085.setLocation(class452.field6245 + var7.left, class57.field1060 + var7.top);
            } else {
                class567.field8085.setLocation(class452.field6245, class57.field1060);
            }
        }
        this.method1931((byte) 94);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIZIILjava/lang/String;)V", line = 278)
    public final void method1968(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, String arg7) {
        try {
            if (arg6 != 29553) {
                return;
            }
            class57.field1060 = 0;
            class81.field1504 = null;
            class363.field5105 = arg5;
            class194.field2788 = arg5;
            class206.field2956 = arg3;
            class556.field7778 = arg3;
            class407.field5670 = this;
            class452.field6245 = 0;
            class11.field146 = arg1;
            class754.field10504 = new Frame();
            class754.field10504.setTitle("Jagex");
            class754.field10504.setResizable(true);
            class754.field10504.addWindowListener(this);
            class754.field10504.setVisible(true);
            class754.field10504.toFront();
            Insets var9 = class754.field10504.getInsets();
            class754.field10504.setSize(class556.field7778 - (-var9.left - var9.right), var9.top + var9.bottom + class194.field2788);
            class159.field2373 = class341.field4796 = new class367(arg2, arg7, arg0, true);
            class637 var10 = class341.field4796.method2295(1, (byte) 20, this);
            while (var10.field9091 == 0) {
                class246.method1639(10L, (byte) -101);
            }
        } catch (Exception var12) {
            class621.method3591(null, var12, (byte) -128);
        }
        field4268++;
    }

    @OriginalMember(owner = "client!vt", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 321)
    public final void windowDeactivated(WindowEvent arg0) {
        field4250++;
    }

    @OriginalMember(owner = "client!vt", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 332)
    public static final void provideLoaderApplet(Applet arg0) {
        class476.field6812 = arg0;
        field4252++;
    }

    @OriginalMember(owner = "client!vt", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 341)
    public final void windowOpened(WindowEvent arg0) {
        field4239++;
    }

    @OriginalMember(owner = "client!vt", name = "destroy", descriptor = "()V", line = 351)
    public final void destroy() {
        field4261++;
        if (class407.field5670 == this && !class566.field8004) {
            class498.field7095 = class742.method4128(1);
            class246.method1639(5000L, (byte) -103);
            class159.field2373 = null;
            this.method1965(57, false);
        }
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)Z", line = 366)
    public final boolean method1969(int arg0) {
        if (arg0 >= -110) {
            this.getDocumentBase();
        }
        field4242++;
        return class96.method870(0, "jaclib");
    }

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)Z", line = 378)
    public final boolean method1970(int arg0) {
        field4240++;
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
                this.method1966(arg0 ^ arg0, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 411)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4272++;
    }

    @OriginalMember(owner = "client!vt", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 422)
    public final String getParameter(String arg0) {
        field4247++;
        if (class754.field10504 == null) {
            return class476.field6812 == null || class476.field6812 == this ? super.getParameter(arg0) : class476.field6812.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 437)
    public final AppletContext getAppletContext() {
        field4259++;
        if (class754.field10504 == null) {
            return class476.field6812 == null || class476.field6812 == this ? super.getAppletContext() : class476.field6812.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "(I)Z", line = 451)
    public final boolean method1971(int arg0) {
        field4244++;
        if (arg0 != -9198) {
            this.field4264 = true;
        }
        return class96.method870(0, "jagtheora");
    }

    @OriginalMember(owner = "client!vt", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 463)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4271++;
    }

    @OriginalMember(owner = "client!vt", name = "stop", descriptor = "()V", line = 471)
    public final void stop() {
        field4245++;
        if (class407.field5670 == this && !class566.field8004) {
            class498.field7095 = class742.method4128(1) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vt", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 486)
    public final void windowActivated(WindowEvent arg0) {
        field4257++;
    }

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)Ljava/lang/String;", line = 498)
    public String method1939(int arg0) {
        field4265++;
        return arg0 > -93 ? null : null;
    }

    @OriginalMember(owner = "client!vt", name = "run", descriptor = "()V", line = 513)
    public final void run() {
        field4255++;
        try {
            if (class367.field5127 != null) {
                String var1 = class367.field5127.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class367.field5129;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1966(0, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class367.field5129 == null || class367.field5129.equals("1.4.2"))) {
                    this.method1966(0, "wrongjava");
                    return;
                }
            }
            if (class367.field5129 != null && class367.field5129.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class367.field5129.length() > var3) {
                    char var5 = class367.field5129.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class218.field3120 = true;
                }
            }
            Applet var6 = class407.field5670;
            if (class476.field6812 != null) {
                var6 = class476.field6812;
            }
            Method var7 = class367.field5122;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class307.method1992((byte) 85);
            class698.method3919((byte) -62);
            this.method1945((byte) 2);
            this.method1954(0);
            class184.field2629 = class458.method2792(-77);
            while (class498.field7095 == 0L || class498.field7095 > class742.method4128(1)) {
                class701.field9843 = class184.field2629.method2637(class486.field6884, -26);
                for (int var8 = 0; var8 < class701.field9843; var8++) {
                    this.method1974(0);
                }
                this.method1967(115);
                class519.method3084(-128, class341.field4796, class567.field8085);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class621.method3591(this.method1939(-118), var20, (byte) -117);
            this.method1966(0, "crash");
        } finally {
            Object var13 = null;
            this.method1965(57, true);
        }
    }

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "(I)Z", line = 643)
    public final boolean method1972(int arg0) {
        field4260++;
        if (arg0 != 26089) {
            this.field4266 = false;
        }
        return class96.method870(arg0 ^ 0x65E9, "jagmisc");
    }

    @OriginalMember(owner = "client!vt", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 656)
    public final void focusGained(FocusEvent arg0) {
        class262.field3825 = true;
        field4267++;
        class701.field9847 = true;
    }

    @OriginalMember(owner = "client!vt", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 667)
    public final void windowClosed(WindowEvent arg0) {
        field4263++;
    }

    @OriginalMember(owner = "client!vt", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 674)
    public final synchronized void paint(Graphics arg0) {
        field4248++;
        if (class407.field5670 != this || class566.field8004) {
            return;
        }
        class701.field9847 = true;
        if (class218.field3120 && class742.method4128(1) - class262.field3826 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class556.field7778 <= var2.width && var2.height >= class194.field2788) {
                class206.field2957 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 695)
    public final URL getCodeBase() {
        field4274++;
        if (class754.field10504 == null) {
            return class476.field6812 == null || class476.field6812 == this ? super.getCodeBase() : class476.field6812.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 710)
    public final void method1973(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field4262++;
        try {
            if (class407.field5670 == null) {
                class11.field146 = arg0;
                class81.field1504 = class476.field6812;
                class407.field5670 = this;
                class452.field6245 = 0;
                class363.field5105 = arg2;
                class194.field2788 = arg2;
                class57.field1060 = 0;
                class206.field2956 = arg6;
                class556.field7778 = arg6;
                class159.field2373 = class341.field4796 = new class367(arg5, arg4, arg1, class476.field6812 != null);
                class637 var8 = class341.field4796.method2295(1, (byte) 18, this);
                if (arg3 == 3) {
                    while (var8.field9091 == 0) {
                        class246.method1639(10L, (byte) -67);
                    }
                }
            } else {
                class30.field400++;
                if (class30.field400 >= 3) {
                    this.method1966(0, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class621.method3591(null, var10, (byte) -113);
            this.method1966(0, "crash");
        }
    }

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "(I)V", line = 758)
    private final void method1974(int arg0) {
        field4251++;
        long var2 = class742.method4128(1);
        long var4 = class135.field2105[class178.field2569];
        if (arg0 != 0) {
            this.field4266 = true;
        }
        class135.field2105[class178.field2569] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class178.field2569 = class178.field2569 + 1 & 0x1F;
        synchronized (this) {
            class33.field439 = class262.field3825;
        }
        this.method1941(-90);
    }

    @OriginalMember(owner = "client!vt", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 790)
    public final void windowDeiconified(WindowEvent arg0) {
        field4246++;
    }

    @OriginalMember(owner = "client!vt", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 797)
    public final void windowIconified(WindowEvent arg0) {
        field4241++;
    }

    @OriginalMember(owner = "client!vt", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    public abstract void method1938(int arg0);

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V")
    public abstract void method1941(int arg0);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
    public abstract void method1932(boolean arg0);

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)V")
    public abstract void method1954(int arg0);

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(B)V")
    public abstract void method1931(byte arg0);
}
