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

@OriginalClass("client!qh")
public abstract class class287 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Z")
    private boolean field4920 = false;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lve;")
    public static class255 field4918 = class87.method607(110, "Card:");

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[I")
    public static int[] field4910 = new int[500];

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "Lve;")
    public static class255 field4947 = class87.method607(63, "null");

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field4922 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!qh", name = "destroy", descriptor = "()V", line = 7)
    public final void destroy() {
        field4941++;
        if (class293.field5025 == this && !class209.field3575) {
            class47.field713 = class218.method1541(111);
            class137.method1027(5000L, 0);
            class305.field5214 = null;
            this.method2027(true, false);
        }
    }

    @OriginalMember(owner = "client!qh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 22)
    public final void focusGained(FocusEvent arg0) {
        field4948++;
        class13.field186 = true;
        class17.field254 = true;
    }

    @OriginalMember(owner = "client!qh", name = "run", descriptor = "()V", line = 36)
    public final void run() {
        field4930++;
        try {
            if (class40.field620 != null) {
                String var1 = class40.field620.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class40.field629;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2039(false, "wrongjava");
                        return;
                    }
                    class247.field4146 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class40.field629 == null || class40.field629.equals("1.4.2"))) {
                    this.method2039(false, "wrongjava");
                    return;
                }
            }
            if (class40.field629 != null && class40.field629.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class40.field629.length()) {
                    char var5 = class40.field629.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class131.field2154 = true;
                }
            }
            if (class221.field3728.field626 != null) {
                Method var6 = class40.field635;
                if (var6 != null) {
                    try {
                        var6.invoke(class221.field3728.field626, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method2036(-88);
            class69.field1033 = class17.method84(class210.field3589, (byte) 122, class240.field3999, class201.field3479);
            this.method1675(-30330);
            class292.field5020 = class186.method1301(2030220976);
            while (class47.field713 == 0L || class218.method1541(31) < class47.field713) {
                class251.field4241 = class292.field5020.method57(class247.field4146, 32493, class107.field1807);
                for (int var8 = 0; var8 < class251.field4241; var8++) {
                    this.method2028(-43);
                }
                this.method2040(-110);
                class78.method544(89, class221.field3728, class240.field3999);
            }
        } catch (Exception var11) {
            class195.method1393(var11, 0, (String) null);
            this.method2039(false, "crash");
        }
        this.method2027(true, true);
    }

    @OriginalMember(owner = "client!qh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 147)
    public final void windowIconified(WindowEvent arg0) {
        field4914++;
    }

    @OriginalMember(owner = "client!qh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 156)
    public final void windowClosed(WindowEvent arg0) {
        field4925++;
    }

    @OriginalMember(owner = "client!qh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 163)
    public final synchronized void paint(Graphics arg0) {
        field4923++;
        if (class293.field5025 != this || class209.field3575) {
            return;
        }
        class17.field254 = true;
        if (class131.field2154 && !class281.field4827 && class218.method1541(-47) - class234.field3861 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class289.field4980 <= var2.width && class107.field1790 <= var2.height) {
                class37.field570 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZZ)V", line = 185)
    private final void method2027(boolean arg0, boolean arg1) {
        field4937++;
        synchronized (this) {
            if (class209.field3575) {
                return;
            }
            class209.field3575 = arg0;
        }
        if (class221.field3728.field626 != null) {
            class221.field3728.field626.destroy();
        }
        try {
            this.method1676(-87);
        } catch (Exception var12) {
        }
        if (class240.field3999 != null) {
            try {
                class240.field3999.removeFocusListener(this);
                class240.field3999.getParent().remove(class240.field3999);
            } catch (Exception var11) {
            }
        }
        if (class221.field3728 != null) {
            try {
                class221.field3728.method239((byte) -123);
            } catch (Exception var10) {
            }
        }
        this.method1670(-12578);
        if (class37.field561 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 246)
    private final void method2028(int arg0) {
        field4942++;
        long var2 = class218.method1541(-48);
        long var4 = class136.field2260[class258.field4384];
        if (var4 != 0L && var2 > var4) {
        }
        class136.field2260[class258.field4384] = var2;
        class258.field4384 = class258.field4384 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 > -40) {
                method2031(false);
            }
            class23.field353 = class13.field186;
        }
        this.method1666(86);
    }

    @OriginalMember(owner = "client!qh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 274)
    public final void windowDeactivated(WindowEvent arg0) {
        field4911++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lli;Lli;I)V", line = 284)
    public static final void method2029(class208 arg0, class208 arg1, int arg2) {
        field4929++;
        if (arg2 < 100) {
            method2031(false);
        }
        if (arg0.field3566 != null) {
            arg0.method1502((byte) -82);
        }
        arg0.field3566 = arg1.field3566;
        arg0.field3563 = arg1;
        arg0.field3566.field3563 = arg0;
        arg0.field3563.field3566 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)I", line = 302)
    public static final int method2030(byte arg0) {
        field4935++;
        if (class187.field3011 == 0) {
            return 0;
        } else if (arg0 == -126) {
            return class145.field2426[class187.field3011].method117();
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!qh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 317)
    public final String getParameter(String arg0) {
        field4946++;
        if (class37.field561 == null) {
            return class221.field3728 == null || class221.field3728.field626 == this ? super.getParameter(arg0) : class221.field3728.field626.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 334)
    public final void windowActivated(WindowEvent arg0) {
        field4913++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 346)
    public static void method2031(boolean arg0) {
        field4918 = null;
        field4910 = null;
        field4947 = null;
        if (arg0) {
            method2033(-51, 22);
        }
    }

    @OriginalMember(owner = "client!qh", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 366)
    public final URL getCodeBase() {
        field4921++;
        if (class37.field561 == null) {
            return class221.field3728 == null || class221.field3728.field626 == this ? super.getCodeBase() : class221.field3728.field626.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 382)
    public final void windowDeiconified(WindowEvent arg0) {
        field4928++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZII)I", line = 391)
    public static final int method2032(boolean arg0, int arg1, int arg2) {
        field4939++;
        if (arg2 == -2) {
            return 12345678;
        } else if (!arg0) {
            return 13;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "stop", descriptor = "()V", line = 426)
    public final void stop() {
        field4934++;
        if (class293.field5025 == this && !class209.field3575) {
            class47.field713 = class218.method1541(-58) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I", line = 438)
    public static final int method2033(int arg0, int arg1) {
        field4944++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 == -1410546649) {
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return -29;
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Z", line = 458)
    public final boolean method2034(int arg0) {
        field4940++;
        if (arg0 != 1) {
            return false;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
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
                this.method2039(false, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "start", descriptor = "()V", line = 493)
    public final void start() {
        field4926++;
        if (class293.field5025 == this && !class209.field3575) {
            class47.field713 = 0L;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BZ)V", line = 515)
    public static final void method2035(byte arg0, boolean arg1) {
        if ((class276.field4742.field5130 >> 7) == class113.field1918 && (class276.field4742.field5173 >> 7) == class15.field225) {
            class113.field1918 = 0;
        }
        if (arg0 > -34) {
            field4924 = 12;
        }
        int var2 = class309.field5269;
        field4945++;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class242 var6;
            if (arg1) {
                var6 = class276.field4742;
                var4 = 8791798054912L;
            } else {
                var4 = (long) class259.field4398[var3] << 32;
                var6 = class151.field2555[class259.field4398[var3]];
            }
            if (var6 != null && var6.method1302(1)) {
                var6.field4062 = false;
                int var7 = var6.field5173 >> 7;
                if ((class314.field5328 && class309.field5269 > 200 || class309.field5269 > 50) && !arg1 && var6.field5114 == var6.field5113) {
                    var6.field4062 = true;
                }
                int var8 = var6.field5130 >> 7;
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var6.field4055 == null || var6.field4088 > class277.field4768 || var6.field4078 <= class277.field4768) {
                        if (var6.method1680(-101) == 1 && (var6.field5130 & 0x7F) == 64 && (var6.field5173 & 0x7F) == 64) {
                            if (class78.field1273[var8][var7] == class93.field1600) {
                                continue;
                            }
                            class78.field1273[var8][var7] = class93.field1600;
                        }
                        var6.field5131 = class113.method861((byte) -65, var6.field5130, var6.field5173, client.field4039);
                        class112.method856(client.field4039, var6.field5130, var6.field5173, var6.field5131, (var6.method1680(-128) * 64 - 64) + 60, var6, var6.field5157, var4, var6.field5156);
                    } else {
                        var6.field4062 = false;
                        var6.field5131 = class113.method861((byte) 122, var6.field5130, var6.field5173, client.field4039);
                        class82.method563(client.field4039, var6.field5130, var6.field5173, var6.field5131, var6, var6.field5157, var4, var6.field4073, var6.field4059, var6.field4072, var6.field4063);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V", line = 599)
    public final synchronized void method2036(int arg0) {
        if (class240.field3999 != null) {
            class240.field3999.removeFocusListener(this);
            class240.field3999.getParent().remove(class240.field3999);
        }
        Container var2;
        if (class307.field5221 != null) {
            var2 = class307.field5221;
        } else if (class37.field561 == null) {
            var2 = class221.field3728.field626;
        } else {
            var2 = class37.field561;
        }
        var2.setLayout((LayoutManager) null);
        class240.field3999 = new class296(this);
        field4917++;
        var2.add(class240.field3999);
        class240.field3999.setSize(class210.field3589, class201.field3479);
        class240.field3999.setVisible(true);
        if (class37.field561 == var2) {
            Insets var3 = class37.field561.getInsets();
            class240.field3999.setLocation(var3.left + class64.field965, var3.top - -class162.field2728);
        } else {
            class240.field3999.setLocation(class64.field965, class162.field2728);
        }
        class240.field3999.addFocusListener(this);
        class240.field3999.requestFocus();
        class23.field353 = true;
        class13.field186 = true;
        if (arg0 >= -84) {
            field4922 = -95;
        }
        class17.field254 = true;
        class37.field570 = false;
        class234.field3861 = class218.method1541(-59);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V", line = 650)
    public final void method2037(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4943++;
        try {
            if (class293.field5025 != null) {
                class279.field4785++;
                if (class279.field4785 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method2039(false, "alreadyloaded");
                return;
            }
            class293.field5025 = this;
            class210.field3589 = arg0;
            class289.field4980 = arg0;
            class222.field3731 = arg4;
            class201.field3479 = arg1;
            class107.field1790 = arg1;
            class64.field965 = 0;
            class162.field2728 = arg3;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class9.field127 = true;
            } else {
                class9.field127 = false;
            }
            if (class221.field3728 == null) {
                class305.field5214 = class221.field3728 = new class40(this, arg2, (String) null, 0);
            }
            class169 var7 = class221.field3728.method241(8851, 1, this);
            while (var7.field2833 == 0) {
                class137.method1027(10L, arg3 ^ 0x0);
            }
            class97.field1680 = (Thread) var7.field2832;
        } catch (Exception var9) {
            class195.method1393(var9, 0, (String) null);
            this.method2039(false, "crash");
        }
    }

    @OriginalMember(owner = "client!qh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 705)
    public final AppletContext getAppletContext() {
        field4938++;
        if (class37.field561 == null) {
            return class221.field3728 == null || class221.field3728.field626 == this ? super.getAppletContext() : class221.field3728.field626.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 721)
    public final void focusLost(FocusEvent arg0) {
        class13.field186 = false;
        field4919++;
    }

    @OriginalMember(owner = "client!qh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 734)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4912++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 743)
    public final void method2038(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class293.field5025 = this;
            class210.field3589 = arg3;
            class289.field4980 = arg3;
            class64.field965 = 0;
            class201.field3479 = arg5;
            class107.field1790 = arg5;
            class162.field2728 = 0;
            class222.field3731 = arg6;
            class37.field561 = new Frame();
            class37.field561.setTitle("Jagex");
            class37.field561.setResizable(true);
            class37.field561.addWindowListener(this);
            class37.field561.setVisible(true);
            class37.field561.toFront();
            Insets var8 = class37.field561.getInsets();
            class37.field561.setSize(var8.right + var8.left + class289.field4980, class107.field1790 - (-var8.top - var8.bottom));
            class305.field5214 = class221.field3728 = new class40((Applet) null, arg4, arg2, arg0);
            class169 var9 = class221.field3728.method241(8851, arg1, this);
            while (var9.field2833 == 0) {
                class137.method1027(10L, arg1 ^ 0x1);
            }
            class97.field1680 = (Thread) var9.field2832;
        } catch (Exception var11) {
            class195.method1393(var11, 0, (String) null);
        }
        field4916++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 780)
    public final void method2039(boolean arg0, String arg1) {
        field4933++;
        if (arg0) {
            field4910 = (int[]) null;
        }
        if (this.field4920) {
            return;
        }
        this.field4920 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!qh", name = "providesignlink", descriptor = "(Lfk;)V", line = 803)
    public static final void providesignlink(class40 arg0) {
        field4927++;
        class221.field3728 = arg0;
        class305.field5214 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 812)
    public final void windowClosing(WindowEvent arg0) {
        field4932++;
        this.destroy();
    }

    @OriginalMember(owner = "client!qh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 821)
    public final URL getDocumentBase() {
        field4931++;
        if (class37.field561 == null) {
            return class221.field3728 == null || class221.field3728.field626 == this ? super.getDocumentBase() : class221.field3728.field626.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 838)
    private final void method2040(int arg0) {
        field4915++;
        long var2 = class218.method1541(-93);
        int var4 = 37 % ((-arg0 - 39) / 62);
        long var5 = class112.field1893[class218.field3697];
        class112.field1893[class218.field3697] = var2;
        class218.field3697 = class218.field3697 + 1 & 0x1F;
        if (var5 != 0L && var5 < var2) {
            int var7 = (int) (var2 - var5);
            class59.field913 = ((var7 >> 1) + 32000) / var7;
        }
        if ((class313.field5311++) > 50) {
            class17.field254 = true;
            class313.field5311 -= 50;
            class240.field3999.setSize(class210.field3589, class201.field3479);
            class240.field3999.setVisible(true);
            if (class37.field561 != null && class307.field5221 == null) {
                Insets var8 = class37.field561.getInsets();
                class240.field3999.setLocation(var8.left + class64.field965, var8.top - -class162.field2728);
            } else {
                class240.field3999.setLocation(class64.field965, class162.field2728);
            }
        }
        this.method1677((byte) 105);
    }

    @OriginalMember(owner = "client!qh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 895)
    public final void windowOpened(WindowEvent arg0) {
        field4936++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public abstract void method1675(int arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public abstract void method1677(byte arg0);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    public abstract void method1676(int arg0);

    @OriginalMember(owner = "client!qh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V")
    public abstract void method1666(int arg0);

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
    public abstract void method1670(int arg0);
}
