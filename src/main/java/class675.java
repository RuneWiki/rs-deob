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

@OriginalClass("client!lc")
public abstract class class675 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Z")
    private boolean field9374 = false;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
    private boolean field9371 = false;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field9387 = -1;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Z")
    public static boolean field9384 = false;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field9405;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "Z")
    public static boolean field9400;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "Z")
    public static boolean field9401;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Z")
    public static boolean field9402;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Z")
    public static boolean field9403;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "Z")
    public static boolean field9407;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "Z")
    public static boolean field9408;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "Z")
    public static boolean field9410;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "Z")
    public static boolean field9411;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "Z")
    public static boolean field9412;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "Z")
    public static boolean field9413;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public abstract void method2019(int arg0);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
    private final void method3799(int arg0, boolean arg1) {
        field9370++;
        synchronized (this) {
            if (class250.field3518) {
                return;
            }
            class250.field3518 = true;
            if (arg0 < 68) {
                field9384 = false;
            }
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class286.field3936 != null) {
            class286.field3936.destroy();
        }
        try {
            this.method2028((byte) 92);
        } catch (Exception var9) {
        }
        if (this.field9371) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field9371 = false;
        }
        class86.method686(true, true);
        class453.method2620(-13);
        if (class558.field7896 != null) {
            try {
                class558.field7896.removeFocusListener(this);
                class558.field7896.getParent().remove(class558.field7896);
            } catch (Exception var7) {
            }
        }
        if (class630.field8751 != null) {
            try {
                class630.field8751.method4120((byte) -25);
            } catch (Exception var6) {
            }
        }
        this.method2024(9);
        if (class194.field2956 != null) {
            class194.field2956.setVisible(false);
            class194.field2956.dispose();
            class194.field2956 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!lc", name = "start", descriptor = "()V")
    public final void start() {
        field9376++;
        if (class286.field3938 == this && !class250.field3518) {
            class762.field10488 = 0L;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method3800(boolean arg0, String arg1) {
        field9375++;
        if (this.field9374) {
            return;
        }
        this.field9374 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            class729.method4044(class286.field3936, 26693, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!lc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field9382++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public abstract void method2022(byte arg0);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public synchronized void method2017(int arg0) {
        field9395++;
        if (class558.field7896 != null) {
            class558.field7896.removeFocusListener(this);
            class558.field7896.getParent().setBackground(Color.black);
            class558.field7896.getParent().remove(class558.field7896);
        }
        if (arg0 != 29560) {
            this.method2022((byte) -128);
        }
        Container var2;
        if (class703.field9674 != null) {
            var2 = class703.field9674;
        } else if (class194.field2956 != null) {
            var2 = class194.field2956;
        } else if (class286.field3936 == null) {
            var2 = class286.field3938;
        } else {
            var2 = class286.field3936;
        }
        var2.setLayout(null);
        class558.field7896 = new class727(this);
        var2.add(class558.field7896);
        class558.field7896.setSize(class732.field10098, class108.field1697);
        class558.field7896.setVisible(true);
        if (class194.field2956 == var2) {
            Insets var3 = class194.field2956.getInsets();
            class558.field7896.setLocation(class596.field8354 + var3.left, var3.top - -class41.field665);
        } else {
            class558.field7896.setLocation(class596.field8354, class41.field665);
        }
        class558.field7896.addFocusListener(this);
        class558.field7896.requestFocus();
        class29.field539 = true;
        class284.field3931 = true;
        class711.field9797 = true;
        class768.field10590 = false;
        class157.field2549 = class197.method1423(arg0 ^ 0x7379);
    }

    @OriginalMember(owner = "client!lc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field9388++;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Ljava/lang/String;")
    public String method2008(byte arg0) {
        int var2 = 76 / ((-arg0 - 11) / 57);
        field9373++;
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field9361++;
    }

    @OriginalMember(owner = "client!lc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field9383++;
    }

    @OriginalMember(owner = "client!lc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field9385++;
    }

    @OriginalMember(owner = "client!lc", name = "stop", descriptor = "()V")
    public final void stop() {
        field9363++;
        if (class286.field3938 == this && !class250.field3518) {
            class762.field10488 = class197.method1423(1) + 4000L;
        }
    }

    @OriginalMember(owner = "client!lc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field9379++;
        if (class286.field3938 == this && !class250.field3518) {
            class762.field10488 = class197.method1423(1);
            class643.method3577(5000L, 0);
            class648.field8969 = null;
            this.method3799(75, false);
        }
    }

    @OriginalMember(owner = "client!lc", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        field9391++;
        class286.field3936 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    private final void method3801(int arg0) {
        field9393++;
        long var2 = class197.method1423(1);
        long var4 = class518.field7038[class411.field5622];
        class518.field7038[class411.field5622] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class698.field9637 = ((var6 >> 1) + 32000) / var6;
        }
        class411.field5622 = arg0 & class411.field5622 + 1;
        if (class727.field9989++ > 50) {
            class711.field9797 = true;
            class727.field9989 -= 50;
            class558.field7896.setSize(class732.field10098, class108.field1697);
            class558.field7896.setVisible(true);
            if (class194.field2956 != null && class703.field9674 == null) {
                Insets var7 = class194.field2956.getInsets();
                class558.field7896.setLocation(class596.field8354 + var7.left, class41.field665 + var7.top);
            } else {
                class558.field7896.setLocation(class596.field8354, class41.field665);
            }
        }
        this.method2020(511);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZIIILjava/lang/String;)V")
    public final void method3802(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, String arg7) {
        field9381++;
        try {
            class732.field10098 = arg4;
            class760.field10464 = arg4;
            class331.field4493 = null;
            class41.field665 = 0;
            class286.field3938 = this;
            class596.field8354 = 0;
            class251.field3528 = arg6;
            class108.field1697 = arg5;
            class540.field7360 = arg5;
            class194.field2956 = new Frame();
            class194.field2956.setTitle("Jagex");
            class194.field2956.setResizable(true);
            class194.field2956.addWindowListener(this);
            class194.field2956.setVisible(true);
            class194.field2956.toFront();
            Insets var9 = class194.field2956.getInsets();
            class194.field2956.setSize(class760.field10464 + var9.right + var9.left, class540.field7360 - -var9.top + var9.bottom);
            class648.field8969 = class630.field8751 = new class742(arg1, arg7, arg0, true);
            class545 var10 = class630.field8751.method4116(1, this, (byte) 124);
            while (var10.field7412 == 0) {
                class643.method3577(10L, arg2 - 10);
            }
            if (arg2 != 10) {
                this.windowActivated(null);
            }
        } catch (Exception var12) {
            class281.method1820(null, arg2 + 28385, var12);
        }
    }

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
    public final void run() {
        field9369++;
        try {
            if (class742.field10231 != null) {
                String var1 = class742.field10231.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class742.field10247;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3800(true, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class742.field10247 == null || class742.field10247.equals("1.4.2"))) {
                    this.method3800(true, "wrongjava");
                    return;
                }
            }
            if (class742.field10247 != null && class742.field10247.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class742.field10247.length()) {
                    char var5 = class742.field10247.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class584.field8266 = true;
                }
            }
            Applet var6 = class286.field3938;
            if (class286.field3936 != null) {
                var6 = class286.field3936;
            }
            Method var7 = class742.field10248;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class89.method727(-1096973000);
            class223.method1522(9563);
            this.method2017(29560);
            this.method2019(10018);
            class598.field8377 = class403.method2410((byte) -52);
            while (class762.field10488 == 0L || class762.field10488 > class197.method1423(1)) {
                class345.field4641 = class598.field8377.method2851(-1, class135.field2283);
                for (int var8 = 0; var8 < class345.field4641; var8++) {
                    this.method3808(31);
                }
                this.method3801(31);
                class719.method3992((byte) -53, class630.field8751, class558.field7896);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class281.method1820(this.method2008((byte) 117), 28395, var20);
            this.method3800(true, "crash");
        } finally {
            Object var13 = null;
            this.method3799(111, true);
        }
    }

    @OriginalMember(owner = "client!lc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Z")
    public final boolean method3803(int arg0) {
        if (arg0 == -58) {
            field9362++;
            return class35.method208((byte) 122, "jagtheora");
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field9368++;
        class284.field3931 = true;
        class711.field9797 = true;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)Z")
    public final boolean method3804(byte arg0) {
        if (arg0 < 54) {
            this.field9374 = true;
        }
        field9377++;
        return class35.method208((byte) 108, "jaclib");
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)V")
    public static final void method3805(int arg0, int arg1, int arg2, int arg3) {
        class549 var4 = class325.field4448[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class524 var5 = var4.field7464;
        class524 var6 = var4.field7467;
        if (var5 != null) {
            var5.field7125 = (short) (var5.field7125 * arg3 / (0x10 << class654.field9055 - 7));
            var5.field7120 = (short) (var5.field7120 * arg3 / (0x10 << class654.field9055 - 7));
        }
        if (var6 != null) {
            var6.field7125 = (short) (var6.field7125 * arg3 / (0x10 << class654.field9055 - 7));
            var6.field7120 = (short) (var6.field7120 * arg3 / (0x10 << class654.field9055 - 7));
        }
    }

    @OriginalMember(owner = "client!lc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field9378++;
        if (class194.field2956 == null) {
            return class286.field3936 == null || class286.field3936 == this ? super.getAppletContext() : class286.field3936.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Z")
    public final boolean method3806(int arg0) {
        if (arg0 == 1) {
            field9394++;
            return class35.method208((byte) -119, "jagmisc");
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    public abstract void method2024(int arg0);

    @OriginalMember(owner = "client!lc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field9386++;
        if (class194.field2956 == null) {
            return class286.field3936 == null || class286.field3936 == this ? super.getParameter(arg0) : class286.field3936.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field9364++;
        if (class286.field3938 != this || class250.field3518) {
            return;
        }
        class711.field9797 = true;
        if (class584.field8266 && class197.method1423(1) - class157.field2549 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class760.field10464 <= var2.width && var2.height >= class540.field7360) {
                class768.field10590 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field9372++;
        if (class194.field2956 == null) {
            return class286.field3936 == null || class286.field3936 == this ? super.getDocumentBase() : class286.field3936.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field9389++;
    }

    @OriginalMember(owner = "client!lc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class284.field3931 = false;
        field9365++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lkh;I)V")
    public static final void method3807(class17 arg0, int arg1) {
        if (arg1 > -42) {
            provideLoaderApplet(null);
        }
        if (arg0.field352 == 5 && arg0.field355 != -1) {
            class565.method3263(arg0, -84, class95.field1472);
        }
        field9380++;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    private final void method3808(int arg0) {
        field9396++;
        long var2 = class197.method1423(arg0 - 30);
        long var4 = class505.field6888[class483.field6527];
        class505.field6888[class483.field6527] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class483.field6527 = arg0 & class483.field6527 + 1;
        synchronized (this) {
            class29.field539 = class284.field3931;
        }
        this.method2022((byte) -127);
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
    public abstract void method2020(int arg0);

    @OriginalMember(owner = "client!lc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field9392++;
        if (class194.field2956 == null) {
            return class286.field3936 == null || class286.field3936 == this ? super.getCodeBase() : class286.field3936.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field9390++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method3809(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field9366++;
        try {
            if (class286.field3938 == null) {
                class732.field10098 = arg3;
                class760.field10464 = arg3;
                class108.field1697 = arg4;
                class540.field7360 = arg4;
                class331.field4493 = class286.field3936;
                class41.field665 = 0;
                class286.field3938 = this;
                class251.field3528 = arg1;
                class596.field8354 = 0;
                if (arg6 < 13) {
                    this.run();
                }
                class648.field8969 = class630.field8751 = new class742(arg2, arg5, arg0, class286.field3936 != null);
                class545 var8 = class630.field8751.method4116(1, this, (byte) 124);
                while (var8.field7412 == 0) {
                    class643.method3577(10L, 0);
                }
            } else {
                class673.field9348++;
                if (class673.field9348 >= 3) {
                    this.method3800(true, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class281.method1820(null, 28395, var10);
            this.method3800(true, "crash");
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V")
    public abstract void method2028(byte arg0);

    @OriginalMember(owner = "client!lc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field9367++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)Z")
    public final boolean method3810(int arg0) {
        field9360++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != 57) {
                this.getAppletContext();
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
                this.method3800(true, "invalidhost");
                return false;
            }
        }
    }
}
