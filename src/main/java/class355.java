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
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class355 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!km", name = "q", descriptor = "Z")
    private boolean field5004 = false;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "Z")
    private boolean field5014 = false;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!km", name = "ab", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!km", name = "cb", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!km", name = "eb", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!km", name = "gb", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "Lda;")
    public static class60 field5007;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "Z")
    public static boolean field5028;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "Z")
    public static boolean field5033;

    @OriginalMember(owner = "client!km", name = "U", descriptor = "Z")
    public static boolean field5034;

    @OriginalMember(owner = "client!km", name = "V", descriptor = "Z")
    public static boolean field5035;

    @OriginalMember(owner = "client!km", name = "W", descriptor = "Z")
    public static boolean field5036;

    @OriginalMember(owner = "client!km", name = "X", descriptor = "Z")
    public static boolean field5037;

    @OriginalMember(owner = "client!km", name = "Y", descriptor = "Z")
    public static boolean field5038;

    @OriginalMember(owner = "client!km", name = "Z", descriptor = "Z")
    public static boolean field5039;

    @OriginalMember(owner = "client!km", name = "bb", descriptor = "Z")
    public static boolean field5041;

    @OriginalMember(owner = "client!km", name = "db", descriptor = "Z")
    public static boolean field5043;

    @OriginalMember(owner = "client!km", name = "fb", descriptor = "Z")
    public static boolean field5045;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "[I")
    public static int[] field5025;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public abstract void method1973(int arg0);

    @OriginalMember(owner = "client!km", name = "stop", descriptor = "()V")
    public final void stop() {
        field5011++;
        if (class566.field7798 == this && !class327.field4547) {
            class536.field7413 = class554.method3190(-73) + 4000L;
        }
    }

    @OriginalMember(owner = "client!km", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4990++;
        if (class684.field9263 == null) {
            return class675.field9193 == null || class675.field9193 == this ? super.getParameter(arg0) : class675.field9193.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Ljava/lang/String;")
    public String method1991(byte arg0) {
        field4988++;
        if (arg0 <= 40) {
            this.run();
        }
        return null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2220(int arg0, String arg1) {
        int var3 = 88 / ((arg0 + 5) / 54);
        field5009++;
        if (this.field5014) {
            return;
        }
        this.field5014 = true;
        System.out.println("error_game_" + arg1);
        try {
            class43.method542((byte) 125, class675.field9193, "loggedout");
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!km", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field5003++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)Z")
    public final boolean method2221(boolean arg0) {
        if (!arg0) {
            this.getDocumentBase();
        }
        field4992++;
        return class98.method915(-30282, "jagmisc");
    }

    @OriginalMember(owner = "client!km", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field4996++;
        class630.field8674 = false;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    private final void method2222(int arg0) {
        field4995++;
        long var2 = class554.method3190(arg0 - 88);
        long var4 = class718.field9777[class638.field8765];
        class718.field9777[class638.field8765] = var2;
        class638.field8765 = class638.field8765 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class195.field2888 = class630.field8674;
        }
        this.method1977((byte) 93);
        if (arg0 != -1) {
            this.field5014 = true;
        }
    }

    @OriginalMember(owner = "client!km", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field5021++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILin;)V")
    public static final void method2223(int arg0, class91 arg1) {
        field5019++;
        class524.field7264 = arg1;
        if (arg0 != 0) {
            field5024 = 101;
        }
    }

    @OriginalMember(owner = "client!km", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field5002++;
        this.destroy();
    }

    @OriginalMember(owner = "client!km", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field5017++;
        if (class684.field9263 == null) {
            return class675.field9193 == null || class675.field9193 == this ? super.getDocumentBase() : class675.field9193.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2224(String arg0, int arg1) {
        field5000++;
        return arg1 == 0 ? class197.field2895.containsKey(arg0) : true;
    }

    @OriginalMember(owner = "client!km", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4999++;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public synchronized void method1988(byte arg0) {
        if (arg0 > -11) {
            this.paint(null);
        }
        if (class458.field6458 != null) {
            class458.field6458.removeFocusListener(this);
            class458.field6458.getParent().setBackground(Color.black);
            class458.field6458.getParent().remove(class458.field6458);
        }
        field4994++;
        Container var2;
        if (class699.field9455 != null) {
            var2 = class699.field9455;
        } else if (class684.field9263 != null) {
            var2 = class684.field9263;
        } else if (class675.field9193 == null) {
            var2 = class566.field7798;
        } else {
            var2 = class675.field9193;
        }
        var2.setLayout(null);
        class458.field6458 = new class53(this);
        var2.add(class458.field6458);
        class458.field6458.setSize(class467.field6559, class582.field7968);
        class458.field6458.setVisible(true);
        if (class684.field9263 == var2) {
            Insets var3 = class684.field9263.getInsets();
            class458.field6458.setLocation(class688.field9288 + var3.left, var3.top - -class14.field244);
        } else {
            class458.field6458.setLocation(class688.field9288, class14.field244);
        }
        class458.field6458.addFocusListener(this);
        class458.field6458.requestFocus();
        class630.field8674 = true;
        class195.field2888 = true;
        class647.field8905 = true;
        class209.field2985 = false;
        class682.field9244 = class554.method3190(-106);
    }

    @OriginalMember(owner = "client!km", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field5026++;
    }

    @OriginalMember(owner = "client!km", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field5005++;
        if (class566.field7798 != this || class327.field4547) {
            return;
        }
        class647.field8905 = true;
        if (class376.field5326 && (class554.method3190(-57) - class682.field9244) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class288.field4004 <= var2.width && var2.height >= class751.field10508) {
                class209.field2985 = true;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
    private final void method2225(int arg0) {
        field4989++;
        long var2 = class554.method3190(-119);
        long var4 = class215.field3118[class286.field3990];
        class215.field3118[class286.field3990] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class602.field8268 = ((var6 >> 1) + 32000) / var6;
        }
        class286.field3990 = class286.field3990 + 1 & 0x1F;
        if (class348.field4869++ > 50) {
            class348.field4869 -= 50;
            class647.field8905 = true;
            class458.field6458.setSize(class467.field6559, class582.field7968);
            class458.field6458.setVisible(true);
            if (class684.field9263 != null && class699.field9455 == null) {
                Insets var7 = class684.field9263.getInsets();
                class458.field6458.setLocation(var7.left + class688.field9288, class14.field244 + var7.top);
            } else {
                class458.field6458.setLocation(class688.field9288, class14.field244);
            }
        }
        this.method1983(-11018);
        if (arg0 > -107) {
            this.method2227(true, true);
        }
    }

    @OriginalMember(owner = "client!km", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field5022++;
    }

    @OriginalMember(owner = "client!km", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5010++;
        class630.field8674 = true;
        class647.field8905 = true;
    }

    @OriginalMember(owner = "client!km", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field5020++;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)Z")
    public final boolean method2226(int arg0) {
        field5027++;
        if (arg0 <= 19) {
            return true;
        }
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
                this.method2220(53, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZZ)V")
    private final void method2227(boolean arg0, boolean arg1) {
        field5013++;
        synchronized (this) {
            if (class327.field4547) {
                return;
            }
            class327.field4547 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class675.field9193 != null) {
            class675.field9193.destroy();
        }
        if (arg1) {
            this.field5004 = false;
        }
        try {
            this.method1973(0);
        } catch (Exception var9) {
        }
        if (this.field5004) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field5004 = false;
        }
        class305.method1995((byte) -128, true);
        class559.method3211(!arg1);
        if (class458.field6458 != null) {
            try {
                class458.field6458.removeFocusListener(this);
                class458.field6458.getParent().remove(class458.field6458);
            } catch (Exception var7) {
            }
        }
        if (class689.field9299 != null) {
            try {
                class689.field9299.method1208((byte) 103);
            } catch (Exception var6) {
            }
        }
        this.method1970((byte) 108);
        if (class684.field9263 != null) {
            class684.field9263.setVisible(false);
            class684.field9263.dispose();
            class684.field9263 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!km", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        field4998++;
        class675.field9193 = arg0;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(B)V")
    public abstract void method1970(byte arg0);

    @OriginalMember(owner = "client!km", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field5006++;
        if (class684.field9263 == null) {
            return class675.field9193 == null || class675.field9193 == this ? super.getAppletContext() : class675.field9193.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field5016++;
        if (class684.field9263 == null) {
            return class675.field9193 == null || class675.field9193 == this ? super.getCodeBase() : class675.field9193.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!km", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field5008++;
        if (class566.field7798 == this && !class327.field4547) {
            class536.field7413 = class554.method3190(-108);
            class700.method3916((byte) 77, 5000L);
            class623.field8469 = null;
            this.method2227(false, false);
        }
    }

    @OriginalMember(owner = "client!km", name = "run", descriptor = "()V")
    public final void run() {
        field5015++;
        try {
            if (class158.field2530 != null) {
                String var1 = class158.field2530.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class158.field2544;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2220(-119, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class158.field2544 == null || class158.field2544.equals("1.4.2"))) {
                    this.method2220(81, "wrongjava");
                    return;
                }
            }
            if (class158.field2544 != null && class158.field2544.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class158.field2544.length()) {
                    char var5 = class158.field2544.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 - (48 - var5);
                }
                if (var4 >= 5) {
                    class376.field5326 = true;
                }
            }
            Applet var6 = class566.field7798;
            if (class675.field9193 != null) {
                var6 = class675.field9193;
            }
            Method var7 = class158.field2534;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class301.method1961((byte) 103);
            class422.method2588(false);
            this.method1988((byte) -97);
            this.method1969(28740);
            class272.field3828 = class732.method4043(false);
            while (class536.field7413 == 0L || class536.field7413 > class554.method3190(-124)) {
                class81.field1484 = class272.field3828.method2505(0, class192.field2851);
                for (int var8 = 0; var8 < class81.field1484; var8++) {
                    this.method2222(-1);
                }
                this.method2225(-119);
                class392.method2468((byte) -42, class458.field6458, class689.field9299);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class444.method2672(this.method1991((byte) 109), var20, 15004);
            this.method2220(123, "crash");
        } finally {
            Object var13 = null;
            this.method2227(true, false);
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V")
    public abstract void method1969(int arg0);

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
    public abstract void method1983(int arg0);

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2228(String arg0, int arg1) {
        field4993++;
        if (class23.field723 == null) {
            class407.method2533(2);
        }
        class227.field3294.setTime(new Date(class554.method3190(-102)));
        int var2 = class227.field3294.get(11);
        int var3 = class227.field3294.get(12);
        int var4 = class227.field3294.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class728.method4031('\n', true, arg0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class605.field8302; var8 > 0; var8--) {
                class23.field723[var8] = class23.field723[var8 - 1];
            }
            class23.field723[0] = var5 + ": " + var6[var7];
            if (class3.field26 != null) {
                try {
                    class3.field26.write(class141.method1124(class23.field723[0] + "\n", (byte) -20));
                } catch (IOException var10) {
                }
            }
            if (class605.field8302 < (class23.field723.length - 1)) {
                class605.field8302++;
                if (class685.field9279 > 0) {
                    class685.field9279++;
                }
            }
        }
        int var9 = 85 / ((arg1 + 1) / 52);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method2229(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field5012++;
        try {
            if (class566.field7798 == null) {
                class688.field9288 = 0;
                class582.field7968 = arg2;
                class751.field10508 = arg2;
                class467.field6559 = arg0;
                class288.field4004 = arg0;
                class14.field244 = 0;
                class580.field7948 = arg1;
                class566.field7798 = this;
                class272.field3830 = class675.field9193;
                class623.field8469 = class689.field9299 = new class158(arg3, arg5, arg4, class675.field9193 != null);
                class622 var8 = class689.field9299.method1210(this, -10240, 1);
                if (arg6 != 50) {
                    field5024 = -13;
                }
                while (var8.field8462 == 0) {
                    class700.method3916((byte) -126, 10L);
                }
            } else {
                class322.field4449++;
                if (class322.field4449 >= 3) {
                    this.method2220(112, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class444.method2672(null, var10, 15004);
            this.method2220(52, "crash");
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
    public final void method2230(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            if (arg6 != 23499) {
                return;
            }
            class467.field6559 = arg1;
            class288.field4004 = arg1;
            class582.field7968 = arg7;
            class751.field10508 = arg7;
            class566.field7798 = this;
            class14.field244 = 0;
            class688.field9288 = 0;
            class580.field7948 = arg3;
            class272.field3830 = null;
            class684.field9263 = new Frame();
            class684.field9263.setTitle("Jagex");
            class684.field9263.setResizable(true);
            class684.field9263.addWindowListener(this);
            class684.field9263.setVisible(true);
            class684.field9263.toFront();
            Insets var9 = class684.field9263.getInsets();
            class684.field9263.setSize(class288.field4004 + var9.left + var9.right, class751.field10508 + var9.top + var9.bottom);
            class623.field8469 = class689.field9299 = new class158(arg0, arg5, arg4, true);
            class622 var10 = class689.field9299.method1210(this, arg6 - 33739, 1);
            while (var10.field8462 == 0) {
                class700.method3916((byte) 21, 10L);
            }
        } catch (Exception var12) {
            class444.method2672(null, var12, arg6 - 8495);
        }
        field5018++;
    }

    @OriginalMember(owner = "client!km", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field5001++;
    }

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(I)Z")
    public final boolean method2231(int arg0) {
        if (arg0 != -1) {
            this.method2225(-104);
        }
        field4991++;
        return class98.method915(-30282, "jaclib");
    }

    @OriginalMember(owner = "client!km", name = "h", descriptor = "(I)V")
    public static void method2232(int arg0) {
        field5025 = null;
        field5007 = null;
        if (arg0 != 32717) {
            method2224(null, 65);
        }
    }

    @OriginalMember(owner = "client!km", name = "start", descriptor = "()V")
    public final void start() {
        field5023++;
        if (class566.field7798 == this && !class327.field4547) {
            class536.field7413 = 0L;
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(B)V")
    public abstract void method1977(byte arg0);

    @OriginalMember(owner = "client!km", name = "i", descriptor = "(I)Z")
    public final boolean method2233(int arg0) {
        field4997++;
        return arg0 == 10 ? class98.method915(-30282, "jagtheora") : true;
    }
}
