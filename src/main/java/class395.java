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

@OriginalClass("client!wg")
public abstract class class395 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
    private boolean field5211 = false;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Z")
    private boolean field5227 = false;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Ldb;")
    public static class298 field5204 = new class298(65, 4);

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "Lcu;")
    public static class206 field5236 = new class206(18, 4);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "Z")
    public static boolean field5240;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Z")
    public static boolean field5241;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "Z")
    public static boolean field5242;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "Z")
    public static boolean field5243;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "Z")
    public static boolean field5244;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Z")
    public static boolean field5248;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "Z")
    public static boolean field5250;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "Z")
    public static boolean field5251;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "Z")
    public static boolean field5253;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "Z")
    public static boolean field5254;

    @OriginalMember(owner = "client!wg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 4)
    public final void windowOpened(WindowEvent arg0) {
        field5230++;
    }

    @OriginalMember(owner = "client!wg", name = "destroy", descriptor = "()V", line = 11)
    public final void destroy() {
        field5213++;
        if (class619.field8207 == this && !class126.field2120) {
            class356.field4831 = class681.method3802(-23600);
            class486.method2722(0, 5000L);
            class48.field694 = null;
            this.method2264(false, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!wg", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 26)
    public final void update(Graphics arg0) {
        field5225++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z", line = 34)
    public final boolean method2262(int arg0) {
        field5214++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 >= -94) {
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
                this.method2267("invalidhost", 114);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 75)
    public final void focusGained(FocusEvent arg0) {
        class696.field9772 = true;
        field5238++;
        class617.field8185 = true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILoa;)V", line = 87)
    public static final void method2263(int arg0, class651 arg1) {
        class511.field6819 = new class305[class201.field2935.length];
        field5232++;
        for (int var2 = 0; var2 < class201.field2935.length; var2++) {
            int var3 = class201.field2935[var2];
            class511 var4 = class154.method1084(class172.field2652, (byte) 40, var3);
            class200 var5 = arg1.method389(var4, class500.method2769(class484.field6544, var3), true);
            class511.field6819[var2] = new class305(var5, var4);
        }
        if (arg0 != -22082) {
            field5236 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZB)V", line = 113)
    private final void method2264(boolean arg0, byte arg1) {
        field5216++;
        synchronized (this) {
            if (class126.field2120) {
                return;
            }
            class126.field2120 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        int var4 = 85 % ((arg1 - 15) / 44);
        if (class486.field6574 != null) {
            class486.field6574.destroy();
        }
        try {
            this.method1689(true);
        } catch (Exception var10) {
        }
        if (this.field5227) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field5227 = false;
        }
        class550.method3053(true, 245);
        class42.method306((byte) 105);
        if (class443.field6072 != null) {
            try {
                class443.field6072.removeFocusListener(this);
                class443.field6072.getParent().remove(class443.field6072);
            } catch (Exception var8) {
            }
        }
        if (class688.field9669 != null) {
            try {
                class688.field9669.method2899(-76);
            } catch (Exception var7) {
            }
        }
        this.method1685(97);
        if (class490.field6611 != null) {
            class490.field6611.setVisible(false);
            class490.field6611.dispose();
            class490.field6611 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!wg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 187)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field5212++;
    }

    @OriginalMember(owner = "client!wg", name = "start", descriptor = "()V", line = 198)
    public final void start() {
        field5237++;
        if (class619.field8207 == this && !class126.field2120) {
            class356.field4831 = 0L;
        }
    }

    @OriginalMember(owner = "client!wg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 211)
    public final String getParameter(String arg0) {
        field5220++;
        if (class490.field6611 == null) {
            return class486.field6574 == null || class486.field6574 == this ? super.getParameter(arg0) : class486.field6574.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 227)
    public static void method2265(int arg0) {
        field5236 = null;
        if (arg0 >= 2) {
            field5204 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 249)
    public synchronized void method1686(boolean arg0) {
        field5215++;
        if (class443.field6072 != null) {
            class443.field6072.removeFocusListener(this);
            class443.field6072.getParent().setBackground(Color.black);
            class443.field6072.getParent().remove(class443.field6072);
        }
        Container var2;
        if (class216.field3087 != null) {
            var2 = class216.field3087;
        } else if (class490.field6611 != null) {
            var2 = class490.field6611;
        } else if (class486.field6574 == null) {
            var2 = class619.field8207;
        } else {
            var2 = class486.field6574;
        }
        var2.setLayout(null);
        class443.field6072 = new class277(this);
        var2.add(class443.field6072);
        class443.field6072.setSize(class627.field8461, class149.field2387);
        class443.field6072.setVisible(true);
        if (class490.field6611 == var2) {
            Insets var3 = class490.field6611.getInsets();
            class443.field6072.setLocation(class367.field4976 + var3.left, class251.field3464 + var3.top);
        } else {
            class443.field6072.setLocation(class367.field4976, class251.field3464);
        }
        class443.field6072.addFocusListener(this);
        class443.field6072.requestFocus();
        class277.field3867 = true;
        class696.field9772 = true;
        class617.field8185 = arg0;
        class171.field2634 = false;
        class374.field5049 = class681.method3802(-23600);
    }

    @OriginalMember(owner = "client!wg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 301)
    public final void focusLost(FocusEvent arg0) {
        class696.field9772 = false;
        field5226++;
    }

    @OriginalMember(owner = "client!wg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 312)
    public final void windowActivated(WindowEvent arg0) {
        field5234++;
    }

    @OriginalMember(owner = "client!wg", name = "run", descriptor = "()V", line = 321)
    public final void run() {
        field5208++;
        try {
            if (class519.field6928 != null) {
                String var1 = class519.field6928.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class519.field6920;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2267("wrongjava", 33);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class519.field6920 == null || class519.field6920.equals("1.4.2"))) {
                    this.method2267("wrongjava", 26);
                    return;
                }
            }
            if (class519.field6920 != null && class519.field6920.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class519.field6920.length() > var3) {
                    char var5 = class519.field6920.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class190.field2801 = true;
                }
            }
            Applet var6 = class619.field8207;
            if (class486.field6574 != null) {
                var6 = class486.field6574;
            }
            Method var7 = class519.field6916;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class344.method2068((byte) -124);
            class639.method3522(true);
            this.method1686(true);
            this.method1694(true);
            class433.field5920 = class225.method1416(102);
            while (class356.field4831 == 0L || class681.method3802(-23600) < class356.field4831) {
                class510.field6796 = class433.field5920.method1816(class374.field5050, true);
                for (int var8 = 0; var8 < class510.field6796; var8++) {
                    this.method2271(58);
                }
                this.method2268(true);
                class119.method928(class443.field6072, (byte) -60, class688.field9669);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class259.method1586(var20, this.method1703(256), (byte) 8);
            this.method2267("crash", -121);
        } finally {
            Object var13 = null;
            this.method2264(true, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 442)
    public final void method2266(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field5231++;
        try {
            if (class619.field8207 == null) {
                class367.field4976 = 0;
                class193.field2829 = class486.field6574;
                class149.field2387 = arg2;
                class164.field2569 = arg2;
                class619.field8207 = this;
                class627.field8461 = arg3;
                class559.field7427 = arg3;
                class251.field3464 = 0;
                if (arg6 < 100) {
                    provideLoaderApplet(null);
                }
                class224.field3162 = arg1;
                class48.field694 = class688.field9669 = new class519(arg0, arg4, arg5, class486.field6574 != null);
                class192 var8 = class688.field9669.method2904(this, 1, (byte) 120);
                while (var8.field2816 == 0) {
                    class486.method2722(0, 10L);
                }
            } else {
                class316.field4351++;
                if (class316.field4351 >= 3) {
                    this.method2267("alreadyloaded", -124);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class259.method1586(var10, null, (byte) 8);
            this.method2267("crash", -118);
        }
    }

    @OriginalMember(owner = "client!wg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 494)
    public final synchronized void paint(Graphics arg0) {
        field5206++;
        if (class619.field8207 != this || class126.field2120) {
            return;
        }
        class617.field8185 = true;
        if (class190.field2801 && (class681.method3802(-23600) - class374.field5049) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class559.field7427 <= var2.width && class164.field2569 <= var2.height) {
                class171.field2634 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 517)
    public static final void provideLoaderApplet(Applet arg0) {
        class486.field6574 = arg0;
        field5235++;
    }

    @OriginalMember(owner = "client!wg", name = "stop", descriptor = "()V", line = 525)
    public final void stop() {
        field5210++;
        if (class619.field8207 == this && !class126.field2120) {
            class356.field4831 = class681.method3802(-23600) + 4000L;
        }
    }

    @OriginalMember(owner = "client!wg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 537)
    public final AppletContext getAppletContext() {
        field5207++;
        if (class490.field6611 == null) {
            return class486.field6574 == null || class486.field6574 == this ? super.getAppletContext() : class486.field6574.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 553)
    public final void windowIconified(WindowEvent arg0) {
        field5233++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 560)
    public final void method2267(String arg0, int arg1) {
        field5228++;
        if (this.field5211) {
            return;
        }
        this.field5211 = true;
        System.out.println("error_game_" + arg0);
        int var3 = -44 / ((-arg1 - 52) / 63);
        try {
            class594.method3267("loggedout", -17670, class486.field6574);
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!wg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 585)
    public final void windowDeactivated(WindowEvent arg0) {
        field5221++;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(Z)V", line = 592)
    private final void method2268(boolean arg0) {
        field5239++;
        long var2 = class681.method3802(-23600);
        long var4 = class38.field574[class191.field2809];
        class38.field574[class191.field2809] = var2;
        class191.field2809 = class191.field2809 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class244.field3415 = ((var6 >> 1) + 32000) / var6;
        }
        if (class70.field1046++ > 50) {
            class617.field8185 = true;
            class70.field1046 -= 50;
            class443.field6072.setSize(class627.field8461, class149.field2387);
            class443.field6072.setVisible(true);
            if (class490.field6611 != null && class216.field3087 == null) {
                Insets var7 = class490.field6611.getInsets();
                class443.field6072.setLocation(class367.field4976 + var7.left, class251.field3464 + var7.top);
            } else {
                class443.field6072.setLocation(class367.field4976, class251.field3464);
            }
        }
        if (arg0) {
            this.method1687(false);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Z", line = 637)
    public final boolean method2269(byte arg0) {
        if (arg0 != -23) {
            this.method1686(false);
        }
        field5229++;
        return class275.method1669(0, "jaclib");
    }

    @OriginalMember(owner = "client!wg", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 650)
    public final URL getCodeBase() {
        field5209++;
        if (class490.field6611 == null) {
            return class486.field6574 == null || class486.field6574 == this ? super.getCodeBase() : class486.field6574.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;IIBIIIZ)V", line = 666)
    public final void method2270(String arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field5222++;
        try {
            class193.field2829 = null;
            class224.field3162 = arg4;
            class627.field8461 = arg6;
            class559.field7427 = arg6;
            class149.field2387 = arg5;
            class164.field2569 = arg5;
            class367.field4976 = 0;
            class251.field3464 = 0;
            class619.field8207 = this;
            class490.field6611 = new Frame();
            class490.field6611.setTitle("Jagex");
            class490.field6611.setResizable(true);
            class490.field6611.addWindowListener(this);
            class490.field6611.setVisible(true);
            class490.field6611.toFront();
            if (arg3 >= 39) {
                Insets var9 = class490.field6611.getInsets();
                class490.field6611.setSize(class559.field7427 - (-var9.left - var9.right), class164.field2569 - -var9.top + var9.bottom);
                class48.field694 = class688.field9669 = new class519(arg2, arg0, arg1, true);
                class192 var10 = class688.field9669.method2904(this, 1, (byte) 109);
                while (var10.field2816 == 0) {
                    class486.method2722(0, 10L);
                }
            }
        } catch (Exception var12) {
            class259.method1586(var12, null, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 711)
    private final void method2271(int arg0) {
        field5218++;
        long var2 = class681.method3802(-23600);
        if (arg0 < 15) {
            field5236 = null;
        }
        long var4 = class597.field7935[class695.field9754];
        class597.field7935[class695.field9754] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class695.field9754 = class695.field9754 + 1 & 0x1F;
        synchronized (this) {
            class277.field3867 = class696.field9772;
        }
        this.method1679(20309);
    }

    @OriginalMember(owner = "client!wg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 746)
    public final URL getDocumentBase() {
        field5205++;
        if (class490.field6611 == null) {
            return class486.field6574 == null || class486.field6574 == this ? super.getDocumentBase() : class486.field6574.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)Ljava/lang/String;", line = 761)
    public String method1703(int arg0) {
        field5224++;
        if (arg0 != 256) {
            this.method2267(null, 111);
        }
        return null;
    }

    @OriginalMember(owner = "client!wg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 776)
    public final void windowDeiconified(WindowEvent arg0) {
        field5217++;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)Z", line = 787)
    public final boolean method2272(byte arg0) {
        field5219++;
        int var2 = 48 / ((39 - arg0) / 33);
        return class275.method1669(0, "jagmisc");
    }

    @OriginalMember(owner = "client!wg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 800)
    public final void windowClosed(WindowEvent arg0) {
        field5223++;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public abstract void method1679(int arg0);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V")
    public abstract void method1687(boolean arg0);

    @OriginalMember(owner = "client!wg", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(Z)V")
    public abstract void method1689(boolean arg0);

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(Z)V")
    public abstract void method1694(boolean arg0);

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public abstract void method1685(int arg0);
}
