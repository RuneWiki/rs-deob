import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public abstract class class342 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "Z")
    private boolean field4827 = false;

    @OriginalMember(owner = "client!wha", name = "C", descriptor = "Z")
    private boolean field4852 = false;

    @OriginalMember(owner = "client!wha", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field4854 = new String[200];

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!wha", name = "p", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!wha", name = "q", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!wha", name = "r", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!wha", name = "s", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!wha", name = "t", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!wha", name = "u", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!wha", name = "v", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!wha", name = "w", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!wha", name = "x", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!wha", name = "y", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!wha", name = "z", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!wha", name = "A", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!wha", name = "B", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!wha", name = "D", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!wha", name = "F", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!wha", name = "G", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!wha", name = "H", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!wha", name = "I", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!wha", name = "J", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!wha", name = "M", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!wha", name = "Q", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!wha", name = "R", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!wha", name = "S", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!wha", name = "V", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!wha", name = "W", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!wha", name = "X", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!wha", name = "Y", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!wha", name = "Z", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!wha", name = "ab", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!wha", name = "bb", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!wha", name = "db", descriptor = "I")
    public static int field4879;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wha", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field4860;

    @OriginalMember(owner = "client!wha", name = "L", descriptor = "Z")
    public static boolean field4861;

    @OriginalMember(owner = "client!wha", name = "N", descriptor = "Z")
    public static boolean field4863;

    @OriginalMember(owner = "client!wha", name = "O", descriptor = "Z")
    public static boolean field4864;

    @OriginalMember(owner = "client!wha", name = "P", descriptor = "Z")
    public static boolean field4865;

    @OriginalMember(owner = "client!wha", name = "T", descriptor = "Z")
    public static boolean field4869;

    @OriginalMember(owner = "client!wha", name = "U", descriptor = "Z")
    public static boolean field4870;

    @OriginalMember(owner = "client!wha", name = "cb", descriptor = "Z")
    public static boolean field4878;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2192(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wha", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 5)
    public final void windowOpened(WindowEvent arg0) {
        field4853++;
    }

    @OriginalMember(owner = "client!wha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 13)
    public final void focusGained(FocusEvent arg0) {
        class744.field10236 = true;
        field4845++;
        class256.field3725 = true;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V", line = 23)
    private final void method2173(byte arg0) {
        field4842++;
        if (arg0 >= -92) {
            this.field4852 = true;
        }
        long var2 = class97.method664((byte) -50);
        long var4 = class537.field7443[class196.field2636];
        class537.field7443[class196.field2636] = var2;
        class196.field2636 = class196.field2636 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class494.field6926 = ((var6 >> 1) + 32000) / var6;
        }
        if (class72.field1092++ > 50) {
            class72.field1092 -= 50;
            class256.field3725 = true;
            class570.field7875.setSize(class118.field1561, class553.field7716);
            class570.field7875.setVisible(true);
            if (class553.field7717 != null && class178.field2452 == null) {
                Insets var7 = class553.field7717.getInsets();
                class570.field7875.setLocation(class555.field7740 + var7.left, class320.field4452 + var7.top);
            } else {
                class570.field7875.setLocation(class555.field7740, class320.field4452);
            }
        }
        this.method2182(-3);
    }

    @OriginalMember(owner = "client!wha", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 67)
    public final void windowDeiconified(WindowEvent arg0) {
        field4849++;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)Z", line = 75)
    public final boolean method2174(boolean arg0) {
        field4857++;
        if (!arg0) {
            this.field4827 = false;
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
                this.method2190(5, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)V", line = 111)
    public synchronized void method2175(byte arg0) {
        if (class570.field7875 != null) {
            class570.field7875.removeFocusListener(this);
            class570.field7875.getParent().setBackground(Color.black);
            class570.field7875.getParent().remove(class570.field7875);
        }
        field4841++;
        Container var2;
        if (class178.field2452 != null) {
            var2 = class178.field2452;
        } else if (class553.field7717 != null) {
            var2 = class553.field7717;
        } else if (class320.field4445 == null) {
            var2 = class109.field1462;
        } else {
            var2 = class320.field4445;
        }
        var2.setLayout(null);
        class570.field7875 = new class468(this);
        var2.add(class570.field7875);
        class570.field7875.setSize(class118.field1561, class553.field7716);
        class570.field7875.setVisible(true);
        if (class553.field7717 == var2) {
            Insets var3 = class553.field7717.getInsets();
            class570.field7875.setLocation(class555.field7740 + var3.left, var3.top - -class320.field4452);
        } else {
            class570.field7875.setLocation(class555.field7740, class320.field4452);
        }
        if (arg0 != 46) {
            this.field4852 = false;
        }
        class570.field7875.addFocusListener(this);
        class570.field7875.requestFocus();
        class121.field1585 = true;
        class744.field10236 = true;
        class256.field3725 = true;
        class670.field9263 = false;
        class625.field8417 = class97.method664((byte) -50);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V", line = 169)
    private final void method2176(int arg0) {
        field4834++;
        long var2 = class97.method664((byte) -50);
        long var4 = class473.field6561[class455.field6308];
        class473.field6561[class455.field6308] = var2;
        class455.field6308 = arg0 & class455.field6308 + 1;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class121.field1585 = class744.field10236;
        }
        this.method2180((byte) -109);
    }

    @OriginalMember(owner = "client!wha", name = "start", descriptor = "()V", line = 199)
    public final void start() {
        field4850++;
        if (class109.field1462 == this && !class166.field2279) {
            class138.field1962 = 0L;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(BZ)V", line = 210)
    private final void method2177(byte arg0, boolean arg1) {
        field4851++;
        synchronized (this) {
            if (class166.field2279) {
                return;
            }
            class166.field2279 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class320.field4445 != null) {
            class320.field4445.destroy();
        }
        try {
            this.method2178((byte) -125);
        } catch (Exception var10) {
        }
        if (this.field4827) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field4827 = false;
        }
        class556.method3280(true, (byte) -79);
        class384.method2412((byte) -75);
        if (class570.field7875 != null) {
            try {
                class570.field7875.removeFocusListener(this);
                class570.field7875.getParent().remove(class570.field7875);
            } catch (Exception var8) {
            }
        }
        if (class159.field2227 != null) {
            try {
                class159.field2227.method860(0);
            } catch (Exception var7) {
            }
        }
        int var4 = 95 / ((22 - arg0) / 43);
        this.method2186(0);
        if (class553.field7717 != null) {
            class553.field7717.setVisible(false);
            class553.field7717.dispose();
            class553.field7717 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(BZLjava/awt/Component;)Lfn;", line = 286)
    public static final class233 method2179(byte arg0, boolean arg1, Component arg2) {
        field4859++;
        try {
            Constructor var3 = Class.forName("fa").getDeclaredConstructor(field4860 == null ? (field4860 = method2192("java.awt.Component")) : field4860, Boolean.TYPE);
            if (arg0 != 92) {
                field4854 = null;
            }
            return (class233) var3.newInstance(arg2, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            return new class388(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIZLjava/lang/String;ZII)V", line = 305)
    public final void method2181(int arg0, int arg1, int arg2, boolean arg3, String arg4, boolean arg5, int arg6, int arg7) {
        try {
            class118.field1561 = arg0;
            class374.field5260 = arg0;
            class379.field5422 = arg1;
            class553.field7716 = arg7;
            class648.field8690 = arg7;
            class109.field1462 = this;
            class320.field4452 = 0;
            class445.field6182 = null;
            class555.field7740 = 0;
            class553.field7717 = new Frame();
            class553.field7717.setTitle("Jagex");
            class553.field7717.setResizable(true);
            class553.field7717.addWindowListener(this);
            class553.field7717.setVisible(true);
            class553.field7717.toFront();
            Insets var9 = class553.field7717.getInsets();
            class553.field7717.setSize(class374.field5260 + var9.right + var9.left, class648.field8690 + var9.top + var9.bottom);
            class585.field7974 = class159.field2227 = new class135(arg2, arg4, arg6, arg5);
            class246 var10 = class159.field2227.method872(1, (byte) 56, this);
            while (var10.field3633 == 0) {
                class688.method3874(10L, -7375);
            }
        } catch (Exception var12) {
            class31.method172(var12, null, 0);
        }
        field4838++;
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)Ljava/lang/String;", line = 352)
    public String method2183(int arg0) {
        if (arg0 < 73) {
            this.field4852 = true;
        }
        field4826++;
        return null;
    }

    @OriginalMember(owner = "client!wha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 366)
    public final void focusLost(FocusEvent arg0) {
        class744.field10236 = false;
        field4837++;
    }

    @OriginalMember(owner = "client!wha", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 375)
    public final AppletContext getAppletContext() {
        field4825++;
        if (class553.field7717 == null) {
            return class320.field4445 == null || class320.field4445 == this ? super.getAppletContext() : class320.field4445.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 394)
    public final void windowClosed(WindowEvent arg0) {
        field4824++;
    }

    @OriginalMember(owner = "client!wha", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 401)
    public final void update(Graphics arg0) {
        field4858++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!wha", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 409)
    public final URL getCodeBase() {
        field4830++;
        if (class553.field7717 == null) {
            return class320.field4445 == null || class320.field4445 == this ? super.getCodeBase() : class320.field4445.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "stop", descriptor = "()V", line = 425)
    public final void stop() {
        field4848++;
        if (class109.field1462 == this && !class166.field2279) {
            class138.field1962 = class97.method664((byte) -50) + 4000L;
        }
    }

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "(I)Z", line = 438)
    public final boolean method2185(int arg0) {
        field4829++;
        if (arg0 != 32471) {
            this.getCodeBase();
        }
        return class715.method4015("jaclib", -1);
    }

    @OriginalMember(owner = "client!wha", name = "destroy", descriptor = "()V", line = 449)
    public final void destroy() {
        field4828++;
        if (class109.field1462 == this && !class166.field2279) {
            class138.field1962 = class97.method664((byte) -50);
            class688.method3874(5000L, -7375);
            class585.field7974 = null;
            this.method2177((byte) -24, false);
        }
    }

    @OriginalMember(owner = "client!wha", name = "run", descriptor = "()V", line = 467)
    public final void run() {
        field4856++;
        try {
            if (class135.field1915 != null) {
                String var1 = class135.field1915.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class135.field1938;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2190(5, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class135.field1938 == null || class135.field1938.equals("1.4.2"))) {
                    this.method2190(5, "wrongjava");
                    return;
                }
            }
            if (class135.field1938 != null && class135.field1938.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class135.field1938.length() > var3) {
                    char var5 = class135.field1938.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class166.field2312 = true;
                }
            }
            Applet var6 = class109.field1462;
            if (class320.field4445 != null) {
                var6 = class320.field4445;
            }
            Method var7 = class135.field1918;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class532.method3160((byte) 49);
            class644.method3596(425152012);
            this.method2175((byte) 46);
            this.method2184((byte) -114);
            class67.field1033 = class303.method1993((byte) -90);
            while (class138.field1962 == 0L || class138.field1962 > class97.method664((byte) -50)) {
                class751.field10328 = class67.field1033.method3210(class230.field3127, (byte) 98);
                for (int var8 = 0; var8 < class751.field10328; var8++) {
                    this.method2176(31);
                }
                this.method2173((byte) -116);
                class192.method1184(class159.field2227, class570.field7875, 25475);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class31.method172(var20, this.method2183(108), 0);
            this.method2190(5, "crash");
        } finally {
            Object var13 = null;
            this.method2177((byte) 108, true);
        }
    }

    @OriginalMember(owner = "client!wha", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 591)
    public final URL getDocumentBase() {
        field4832++;
        if (class553.field7717 == null) {
            return class320.field4445 == null || class320.field4445 == this ? super.getDocumentBase() : class320.field4445.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 608)
    public final synchronized void paint(Graphics arg0) {
        field4855++;
        if (class109.field1462 != this || class166.field2279) {
            return;
        }
        class256.field3725 = true;
        if (class166.field2312 && (class97.method664((byte) -50) - class625.field8417) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class374.field5260 && class648.field8690 <= var2.height) {
                class670.field9263 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "(B)Z", line = 631)
    public final boolean method2187(byte arg0) {
        if (arg0 >= -54) {
            return true;
        } else {
            field4846++;
            return class715.method4015("jagtheora", -1);
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(Z)V", line = 643)
    public static void method2188(boolean arg0) {
        if (!arg0) {
            provideLoaderApplet(null);
        }
        field4854 = null;
    }

    @OriginalMember(owner = "client!wha", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 658)
    public final void windowActivated(WindowEvent arg0) {
        field4833++;
    }

    @OriginalMember(owner = "client!wha", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 666)
    public static final void provideLoaderApplet(Applet arg0) {
        class320.field4445 = arg0;
        field4839++;
    }

    @OriginalMember(owner = "client!wha", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 675)
    public final void windowClosing(WindowEvent arg0) {
        field4836++;
        this.destroy();
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 683)
    public final void method2189(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field4840++;
        try {
            if (class109.field1462 == null) {
                class379.field5422 = arg2;
                class118.field1561 = arg0;
                class374.field5260 = arg0;
                class553.field7716 = arg3;
                class648.field8690 = arg3;
                class445.field6182 = class320.field4445;
                class320.field4452 = 0;
                class109.field1462 = this;
                class555.field7740 = 0;
                class585.field7974 = class159.field2227 = new class135(arg1, arg4, arg5, class320.field4445 != null);
                if (arg6 <= 11) {
                    field4854 = null;
                }
                class246 var8 = class159.field2227.method872(1, (byte) -110, this);
                while (var8.field3633 == 0) {
                    class688.method3874(10L, -7375);
                }
            } else {
                class330.field4692++;
                if (class330.field4692 >= 3) {
                    this.method2190(5, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class31.method172(var10, null, 0);
            this.method2190(5, "crash");
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILjava/lang/String;)V", line = 730)
    public final void method2190(int arg0, String arg1) {
        field4844++;
        if (this.field4852) {
            return;
        }
        this.field4852 = true;
        if (arg0 != 5) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            class69.method540("loggedout", class320.field4445, -125);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "(I)Z", line = 756)
    public final boolean method2191(int arg0) {
        field4835++;
        return arg0 == -1 ? class715.method4015("jagmisc", -1) : true;
    }

    @OriginalMember(owner = "client!wha", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 767)
    public final void windowIconified(WindowEvent arg0) {
        field4831++;
    }

    @OriginalMember(owner = "client!wha", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 780)
    public final void windowDeactivated(WindowEvent arg0) {
        field4843++;
    }

    @OriginalMember(owner = "client!wha", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 787)
    public final String getParameter(String arg0) {
        field4847++;
        if (class553.field7717 == null) {
            return class320.field4445 == null || class320.field4445 == this ? super.getParameter(arg0) : class320.field4445.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(B)V")
    public abstract void method2178(byte arg0);

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "(B)V")
    public abstract void method2180(byte arg0);

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
    public abstract void method2182(int arg0);

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "(B)V")
    public abstract void method2184(byte arg0);

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "(I)V")
    public abstract void method2186(int arg0);

    @OriginalMember(owner = "client!wha", name = "init", descriptor = "()V")
    public abstract void init();
}
