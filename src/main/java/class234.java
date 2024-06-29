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

@OriginalClass("client!ue")
public abstract class class234 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Z")
    private boolean field3054 = false;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Z")
    private boolean field3045 = false;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "Z")
    public static boolean field3065;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Z")
    public static boolean field3066;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Z")
    public static boolean field3068;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "Z")
    public static boolean field3072;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "Z")
    public static boolean field3076;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "Z")
    public static boolean field3077;

    @OriginalMember(owner = "client!ue", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void update(Graphics arg0) {
        field3062++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z", line = 16)
    public final boolean method1395(int arg0) {
        if (arg0 != 0) {
            this.windowActivated(null);
        }
        field3028++;
        return class492.method2758("jagmisc", (byte) -36);
    }

    @OriginalMember(owner = "client!ue", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 28)
    public final void windowClosed(WindowEvent arg0) {
        field3055++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)I", line = 36)
    public static final int method1396(int arg0, byte arg1, int arg2) {
        field3043++;
        if (arg1 != -9) {
            method1411(null, -42, null, -65, 42, 54, -75, 7, null, false, -21, 124, 62, -66, 123);
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method1397(int arg0) {
        field3051++;
        if (arg0 != -21568) {
            this.field3054 = true;
        }
        return class492.method2758("jaclib", (byte) -36);
    }

    @OriginalMember(owner = "client!ue", name = "destroy", descriptor = "()V", line = 67)
    public final void destroy() {
        field3032++;
        if (class561.field7928 == this && !class422.field5911) {
            class471.field6527 = class538.method2963(-47);
            class267.method1599(0, 5000L);
            class450.field6290 = null;
            this.method1413(false, 18192);
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 81)
    public final void windowIconified(WindowEvent arg0) {
        field3046++;
    }

    @OriginalMember(owner = "client!ue", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 90)
    public final void windowOpened(WindowEvent arg0) {
        field3031++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Z", line = 99)
    public final boolean method1398(boolean arg0) {
        if (!arg0) {
            this.field3045 = false;
        }
        field3039++;
        return class492.method2758("jagtheora", (byte) -36);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 110)
    public final void method1399(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field3060++;
        try {
            if (class561.field7928 == null) {
                class159.field2003 = arg0;
                class646.field8991 = class144.field1868;
                class546.field7710 = arg6;
                class496.field6749 = arg6;
                class512.field6932 = arg1;
                class305.field4136 = arg1;
                class294.field3959 = 0;
                if (arg2 == 4) {
                    class56.field575 = 0;
                    class561.field7928 = this;
                    class450.field6290 = class287.field3823 = new class739(arg5, arg4, arg3, class144.field1868 != null);
                    class107 var8 = class287.field3823.method4126(1, this, arg2 - 3);
                    while (var8.field1419 == 0) {
                        class267.method1599(0, 10L);
                    }
                }
            } else {
                class106.field1412++;
                if (class106.field1412 >= 3) {
                    this.method1412((byte) 74, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class760.method4223(var10, -128, null);
            this.method1412((byte) -50, "crash");
        }
    }

    @OriginalMember(owner = "client!ue", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 160)
    public final String getParameter(String arg0) {
        field3044++;
        if (class271.field3587 == null) {
            return class144.field1868 == null || class144.field1868 == this ? super.getParameter(arg0) : class144.field1868.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 175)
    public final void windowActivated(WindowEvent arg0) {
        field3063++;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 182)
    private final void method1400(int arg0) {
        if (arg0 != 6341) {
            field3049 = -22;
        }
        field3048++;
        long var2 = class538.method2963(-47);
        long var4 = class636.field8841[class46.field484];
        class636.field8841[class46.field484] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class46.field484 = class46.field484 + 1 & 0x1F;
        synchronized (this) {
            class51.field539 = class256.field3319;
        }
        this.method1401((byte) -6);
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 219)
    public synchronized void method1402(int arg0) {
        if (class725.field10121 != null) {
            class725.field10121.removeFocusListener(this);
            class725.field10121.getParent().setBackground(Color.black);
            class725.field10121.getParent().remove(class725.field10121);
        }
        field3036++;
        Container var2;
        if (class526.field7067 != null) {
            var2 = class526.field7067;
        } else if (class271.field3587 != null) {
            var2 = class271.field3587;
        } else if (class144.field1868 == null) {
            var2 = class561.field7928;
        } else {
            var2 = class144.field1868;
        }
        var2.setLayout(null);
        class725.field10121 = new class445(this);
        var2.add(class725.field10121);
        class725.field10121.setSize(class546.field7710, class512.field6932);
        class725.field10121.setVisible(true);
        if (class271.field3587 == var2) {
            Insets var3 = class271.field3587.getInsets();
            class725.field10121.setLocation(class294.field3959 + var3.left, class56.field575 + var3.top);
        } else {
            class725.field10121.setLocation(class294.field3959, class56.field575);
        }
        class725.field10121.addFocusListener(this);
        class725.field10121.requestFocus();
        class51.field539 = true;
        class256.field3319 = true;
        class468.field6471 = true;
        class689.field9654 = false;
        if (arg0 != 0) {
            this.field3054 = true;
        }
        client.field4106 = class538.method2963(-47);
    }

    @OriginalMember(owner = "client!ue", name = "start", descriptor = "()V", line = 272)
    public final void start() {
        field3040++;
        if (class561.field7928 == this && !class422.field5911) {
            class471.field6527 = 0L;
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 286)
    public final void windowDeiconified(WindowEvent arg0) {
        field3029++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLjava/lang/String;IIIZII)V", line = 294)
    public final void method1403(boolean arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            class561.field7928 = this;
            class294.field3959 = 0;
            class512.field6932 = arg3;
            class305.field4136 = arg3;
            class546.field7710 = arg7;
            class496.field6749 = arg7;
            class646.field8991 = null;
            class56.field575 = 0;
            class159.field2003 = arg6;
            class271.field3587 = new Frame();
            class271.field3587.setTitle("Jagex");
            class271.field3587.setResizable(true);
            class271.field3587.addWindowListener(this);
            class271.field3587.setVisible(true);
            class271.field3587.toFront();
            Insets var9 = class271.field3587.getInsets();
            class271.field3587.setSize(class496.field6749 + var9.right + var9.left, class305.field4136 - -var9.top + var9.bottom);
            class450.field6290 = class287.field3823 = new class739(arg4, arg1, arg2, arg5);
            class107 var10 = class287.field3823.method4126(1, this, 1);
            while (var10.field1419 == 0) {
                class267.method1599(0, 10L);
            }
        } catch (Exception var12) {
            class760.method4223(var12, -128, null);
        }
        field3061++;
    }

    @OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 337)
    public final void focusLost(FocusEvent arg0) {
        class256.field3319 = false;
        field3041++;
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V", line = 345)
    public final void run() {
        field3052++;
        try {
            if (class739.field10304 != null) {
                String var1 = class739.field10304.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class739.field10300;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1412((byte) 88, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class739.field10300 == null || class739.field10300.equals("1.4.2"))) {
                    this.method1412((byte) 87, "wrongjava");
                    return;
                }
            }
            if (class739.field10300 != null && class739.field10300.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class739.field10300.length()) {
                    char var5 = class739.field10300.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class655.field9126 = true;
                }
            }
            Applet var6 = class561.field7928;
            if (class144.field1868 != null) {
                var6 = class144.field1868;
            }
            Method var7 = class739.field10286;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class123.method794(107);
            class382.method2246(12345);
            this.method1402(0);
            this.method1410(-13395);
            class414.field5854 = class581.method3251(72);
            while (class471.field6527 == 0L || class538.method2963(-47) < class471.field6527) {
                class616.field8646 = class414.field5854.method3998(0, class491.field6702);
                for (int var8 = 0; var8 < class616.field8646; var8++) {
                    this.method1400(6341);
                }
                this.method1406(784382337);
                class407.method2351(class287.field3823, 31668, class725.field10121);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class760.method4223(var20, -123, this.method1409(0));
            this.method1412((byte) -88, "crash");
        } finally {
            Object var13 = null;
            this.method1413(true, 18192);
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)Z", line = 472)
    public final boolean method1404(int arg0) {
        field3035++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (arg0 != 31) {
            return false;
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
                this.method1412((byte) 112, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 512)
    public static final void provideLoaderApplet(Applet arg0) {
        field3027++;
        class144.field1868 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V", line = 522)
    private final void method1406(int arg0) {
        field3037++;
        long var2 = class538.method2963(arg0 - 784382384);
        long var4 = class734.field10230[class634.field8806];
        class734.field10230[class634.field8806] = var2;
        if (arg0 != 784382337) {
            this.windowOpened(null);
        }
        class634.field8806 = class634.field8806 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class573.field8071 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class414.field5846++) > 50) {
            class468.field6471 = true;
            class414.field5846 -= 50;
            class725.field10121.setSize(class546.field7710, class512.field6932);
            class725.field10121.setVisible(true);
            if (class271.field3587 != null && class526.field7067 == null) {
                Insets var7 = class271.field3587.getInsets();
                class725.field10121.setLocation(class294.field3959 + var7.left, class56.field575 + var7.top);
            } else {
                class725.field10121.setLocation(class294.field3959, class56.field575);
            }
        }
        this.method1408(arg0 - 784382227);
    }

    @OriginalMember(owner = "client!ue", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 572)
    public final URL getDocumentBase() {
        field3057++;
        if (class271.field3587 == null) {
            return class144.field1868 == null || class144.field1868 == this ? super.getDocumentBase() : class144.field1868.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 590)
    public final AppletContext getAppletContext() {
        field3042++;
        if (class271.field3587 == null) {
            return class144.field1868 == null || class144.field1868 == this ? super.getAppletContext() : class144.field1868.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 606)
    public final URL getCodeBase() {
        field3034++;
        if (class271.field3587 == null) {
            return class144.field1868 == null || class144.field1868 == this ? super.getCodeBase() : class144.field1868.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "stop", descriptor = "()V", line = 626)
    public final void stop() {
        field3053++;
        if (class561.field7928 == this && !class422.field5911) {
            class471.field6527 = class538.method2963(-47) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 640)
    public final void windowDeactivated(WindowEvent arg0) {
        field3059++;
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)Ljava/lang/String;", line = 647)
    public String method1409(int arg0) {
        field3056++;
        if (arg0 != 0) {
            this.field3045 = true;
        }
        return null;
    }

    @OriginalMember(owner = "client!ue", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 658)
    public final void windowClosing(WindowEvent arg0) {
        field3030++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ue", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 666)
    public final synchronized void paint(Graphics arg0) {
        field3058++;
        if (class561.field7928 != this || class422.field5911) {
            return;
        }
        class468.field6471 = true;
        if (class655.field9126 && class538.method2963(-47) - client.field4106 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class496.field6749 && var2.height >= class305.field4136) {
                class689.field9654 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lpfa;I[IIIIII[IZIIIII)I", line = 692)
    public static final int method1411(class298 arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field3038++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class244.field3173[var15][var35] = 0;
                class525.field7061[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg1 == 1) {
            var16 = class638.method3588(arg11, 14664, arg6, arg13, arg3, arg10, arg0, arg5, arg4, arg14, arg7);
        } else if (arg1 == 2) {
            var16 = class381.method2236(arg0, arg6, arg14, arg3, arg11, arg4, arg13, arg12 ^ 0x29DDF632, arg5, arg10, arg7);
        } else {
            var16 = class294.method1757(arg1, arg6, arg13, arg4, arg7, (byte) 20, arg11, arg3, arg14, arg10, arg5, arg0);
        }
        int var17 = arg13 - 64;
        int var18 = arg7 - 64;
        if (arg12 != 48) {
            field3049 = -57;
        }
        int var19 = class301.field4076;
        int var20 = class378.field5253;
        if (!var16) {
            if (!arg9) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg10 - var23; var24 <= (arg10 + var23); var24++) {
                for (int var25 = arg5 - var23; var25 <= arg5 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class525.field7061[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg10 > var24) {
                            var28 = arg10 - var24;
                        } else if (arg14 + arg10 - 1 < var24) {
                            var28 = var24 + 1 - arg10 - arg14;
                        }
                        int var29 = 0;
                        if (arg5 > var25) {
                            var29 = arg5 - var25;
                        } else if (var25 > arg5 + arg6 - 1) {
                            var29 = var25 + 1 - arg5 - arg6;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && class525.field7061[var26][var27] < var22) {
                            var20 = var25;
                            var19 = var24;
                            var21 = var30;
                            var22 = class525.field7061[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg13 == var19 && arg7 == var20) {
            return 0;
        }
        byte var31 = 0;
        class43.field472[var31] = var19;
        int var37 = var31 + 1;
        class386.field5451[var31] = var20;
        int var32;
        int var33 = var32 = class244.field3173[var19 - var17][var20 - var18];
        while (arg13 != var19 || arg7 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class43.field472[var37] = var19;
                class386.field5451[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class244.field3173[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg2[var34] = class43.field472[var37];
            arg8[var34++] = class386.field5451[var37];
            if (arg2.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 877)
    public final void focusGained(FocusEvent arg0) {
        class256.field3319 = true;
        field3033++;
        class468.field6471 = true;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjava/lang/String;)V", line = 886)
    public final void method1412(byte arg0, String arg1) {
        int var3 = -103 / ((arg0 - 15) / 56);
        field3047++;
        if (this.field3054) {
            return;
        }
        this.field3054 = true;
        System.out.println("error_game_" + arg1);
        try {
            class679.method3851("loggedout", class144.field1868, -26978);
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V", line = 911)
    private final void method1413(boolean arg0, int arg1) {
        field3050++;
        synchronized (this) {
            if (class422.field5911) {
                return;
            }
            if (arg1 != 18192) {
                return;
            }
            class422.field5911 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class144.field1868 != null) {
            class144.field1868.destroy();
        }
        try {
            this.method1407(false);
        } catch (Exception var11) {
        }
        if (this.field3045) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3045 = false;
        }
        class280.method1678(-87, true);
        class363.method2078(-91);
        if (class725.field10121 != null) {
            try {
                class725.field10121.removeFocusListener(this);
                class725.field10121.getParent().remove(class725.field10121);
            } catch (Exception var9) {
            }
        }
        if (class287.field3823 != null) {
            try {
                class287.field3823.method4142(103);
            } catch (Exception var8) {
            }
        }
        this.method1405(0);
        if (class271.field3587 != null) {
            class271.field3587.setVisible(false);
            class271.field3587.dispose();
            class271.field3587 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public abstract void method1401(byte arg0);

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
    public abstract void method1405(int arg0);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
    public abstract void method1407(boolean arg0);

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
    public abstract void method1408(int arg0);

    @OriginalMember(owner = "client!ue", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "(I)V")
    public abstract void method1410(int arg0);
}
