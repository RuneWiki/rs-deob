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

@OriginalClass("client!gj")
public abstract class class39 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Z")
    private boolean field548 = false;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Z")
    private boolean field549 = false;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Z")
    public static boolean field542 = false;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "Ldk;")
    public static class251 field566;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "Z")
    public static boolean field583;

    @OriginalMember(owner = "client!gj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field551++;
    }

    @OriginalMember(owner = "client!gj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field557++;
    }

    @OriginalMember(owner = "client!gj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field567++;
    }

    @OriginalMember(owner = "client!gj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field574++;
        if (class92.field1494 == null) {
            return class268.field4323 == null || class268.field4323.field751 == this ? super.getDocumentBase() : class268.field4323.field751.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
    public final void method240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field580++;
        try {
            if (class56.field933 == null) {
                class310.field4964 = arg1;
                class153.field2387 = arg1;
                class56.field933 = this;
                class294.field4709 = arg0;
                class66.field1099 = arg0;
                class46.field784 = arg2;
                if (arg4 != 32000) {
                    this.windowIconified((WindowEvent) null);
                }
                class6.field59 = 0;
                class238.field3822 = 0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class268.field4323 == null) {
                    class34.field520 = class268.field4323 = new class45(this, arg3, (String) null, 0);
                }
                class172 var7 = class268.field4323.method319(1, this, (byte) -92);
                while (var7.field2814 == 0) {
                    class262.method1758(10L, 29552);
                }
            } else {
                class128.field2020++;
                if (class128.field2020 >= 3) {
                    this.method253(arg4 ^ 0x7D40, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class19.method94(-108, var9, (String) null);
            this.method253(64, "crash");
        }
    }

    @OriginalMember(owner = "client!gj", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!gj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field579++;
        if (class92.field1494 == null) {
            return class268.field4323 == null || class268.field4323.field751 == this ? super.getCodeBase() : class268.field4323.field751.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        field555++;
        if (arg0 > -77 || this.field548) {
            return;
        }
        try {
            class172 var2 = class268.field4323.method321(class56.field933.getClass(), (byte) 115);
            while (var2.field2814 == 0) {
                class262.method1758(100L, 29552);
            }
            if (var2.field2817 != null) {
                throw (Throwable) var2.field2817;
            }
            jagmisc.init();
            this.field548 = true;
            class309.field4932 = class287.method1912(-768);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
    private final void method242(int arg0, boolean arg1) {
        field550++;
        synchronized (this) {
            if (class176.field2881) {
                return;
            }
            class176.field2881 = true;
        }
        if (class268.field4323.field751 != null) {
            class268.field4323.field751.destroy();
        }
        try {
            this.method257(-94);
        } catch (Exception var10) {
        }
        if (this.field548) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field548 = false;
        }
        class268.field4323.method325(class56.field933.getClass(), arg0 - 128);
        if (class131.field2064 != null) {
            try {
                class131.field2064.removeFocusListener(this);
                class131.field2064.getParent().remove(class131.field2064);
            } catch (Exception var8) {
            }
        }
        if (class268.field4323 != null) {
            try {
                class268.field4323.method311(-113);
            } catch (Exception var7) {
            }
        }
        this.method251((byte) 112);
        if (arg0 != 0) {
            this.getParameter((String) null);
        }
        if (class92.field1494 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!gj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field547++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z")
    public final boolean method243(byte arg0) {
        field558++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = -83 / ((-arg0 - 57) / 50);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method253(64, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field571++;
        if (class56.field933 == this && !class176.field2881) {
            class228.field3674 = class191.method1350((byte) 121);
            class262.method1758(5000L, 29552);
            class34.field520 = null;
            this.method242(0, false);
        }
    }

    @OriginalMember(owner = "client!gj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field578++;
        if (class92.field1494 == null) {
            return class268.field4323 == null || class268.field4323.field751 == this ? super.getAppletContext() : class268.field4323.field751.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I")
    public static final int method244(int arg0, int arg1, int arg2) {
        field554++;
        if (arg1 != 1) {
            method252(19, (String) null);
        }
        class227 var3 = (class227) class1.field14.method1059(0, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field3666.length > arg0) {
            return var3.field3666[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BII)I")
    public static final int method245(byte[] arg0, int arg1, int arg2) {
        field573++;
        if (arg2 >= -99) {
            method247(111);
        }
        return class96.method665((byte) -93, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!gj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field543++;
    }

    @OriginalMember(owner = "client!gj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field563++;
        class174.field2852 = false;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    public static void method246(byte arg0) {
        field566 = null;
        if (arg0 < 122) {
            method244(80, -106, 111);
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static final void method247(int arg0) {
        field572++;
        if (class13.field139 == -1 || class264.field4238 == -1) {
            return;
        }
        int var1 = ((class78.field1298 - class190.field3077) * class13.field138 >> 16) + class190.field3077;
        float[] var2 = new float[3];
        class13.field138 += var1;
        if (class13.field138 < 65535) {
            class163.field2641 = false;
            class139.field2205 = false;
        } else {
            class13.field138 = 65535;
            if (class139.field2205) {
                class163.field2641 = false;
            } else {
                class163.field2641 = true;
            }
            class139.field2205 = true;
        }
        int var3 = class108.field1734 * 2;
        float var4 = (float) class13.field138 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class262.field4217[class13.field139][var3][var5] * 3;
            int var22 = class262.field4217[class13.field139][var3 + 1][var5] * 3;
            int var23 = class262.field4217[class13.field139][var3][var5];
            int var24 = var22 - var21;
            int var25 = (class262.field4217[class13.field139][var3 + 2][var5] + class262.field4217[class13.field139][var3 + 2][var5] - class262.field4217[class13.field139][var3 + 3][var5]) * 3;
            int var26 = class262.field4217[class13.field139][var3 + 2][var5] + var22 - var23 - var25;
            int var27 = var21 + var25 - var22 * 2;
            var2[var5] = (((float) var26 * var4 + (float) var27) * var4 + (float) var24) * var4 + (float) var23;
        }
        class46.field776 = (int) var2[1] * -1;
        class148.field2314 = (int) var2[0] - (class276.field4438 * 128);
        class104.field1666 = (int) var2[2] - (class108.field1732 * 128);
        if (arg0 != 10) {
            method244(18, 117, -42);
        }
        float[] var6 = new float[3];
        int var7 = class238.field3817 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class262.field4217[class264.field4238][var7][var8] * 3;
            int var15 = class262.field4217[class264.field4238][var7 + 1][var8] * 3;
            int var16 = (class262.field4217[class264.field4238][var7 + 2][var8] - (class262.field4217[class264.field4238][var7 + 3][var8] - class262.field4217[class264.field4238][var7 + 2][var8])) * 3;
            int var17 = class262.field4217[class264.field4238][var7][var8];
            int var18 = var15 - var14;
            int var19 = class262.field4217[class264.field4238][var7 + 2][var8] + var15 - var17 - var16;
            int var20 = var14 + var16 - var15 * 2;
            var6[var8] = (((float) var19 * var4 + (float) var20) * var4 + (float) var18) * var4 + (float) var17;
        }
        float var9 = (var6[1] - var2[1]) * -1.0F;
        float var10 = var6[0] - var2[0];
        float var11 = var6[2] - var2[2];
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class173.field2833 = (float) Math.atan2((double) var9, var12);
        class251.field4006 = -((float) Math.atan2((double) var10, (double) var11));
        class71.field1207 = (int) ((double) class251.field4006 * 325.949D) & 0x7FF;
        class264.field4245 = (int) ((double) class173.field2833 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    private final void method248(int arg0) {
        field553++;
        long var2 = class256.field4151[class266.field4293];
        long var4 = class191.method1350((byte) 80);
        class256.field4151[class266.field4293] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class269.field4332 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 < 93) {
            this.method254(118);
        }
        class266.field4293 = class266.field4293 + 1 & 0x1F;
        if ((class295.field4716++) > 50) {
            class32.field468 = true;
            class295.field4716 -= 50;
            class131.field2064.setSize(class294.field4709, class310.field4964);
            class131.field2064.setVisible(true);
            if (class92.field1494 != null && class259.field4184 == null) {
                Insets var7 = class92.field1494.getInsets();
                class131.field2064.setLocation(class6.field59 + var7.left, var7.top - -class238.field3822);
            } else {
                class131.field2064.setLocation(class6.field59, class238.field3822);
            }
        }
        this.method255(Integer.MAX_VALUE);
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    public abstract void method249(int arg0);

    @OriginalMember(owner = "client!gj", name = "stop", descriptor = "()V")
    public final void stop() {
        field559++;
        if (class56.field933 == this && !class176.field2881) {
            class228.field3674 = class191.method1350((byte) 112) + 4000L;
        }
    }

    @OriginalMember(owner = "client!gj", name = "providesignlink", descriptor = "(Lrm;)V")
    public static final void providesignlink(class45 arg0) {
        field552++;
        class268.field4323 = arg0;
        class34.field520 = arg0;
    }

    @OriginalMember(owner = "client!gj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field564++;
        if (class56.field933 != this || class176.field2881) {
            return;
        }
        class32.field468 = true;
        if (class184.field3018 && (class191.method1350((byte) -88) - class141.field2260) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class66.field1099 && var2.height >= class153.field2387) {
                class43.field642 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V")
    public abstract void method250(byte arg0);

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)V")
    public abstract void method251(byte arg0);

    @OriginalMember(owner = "client!gj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field565++;
        if (class92.field1494 == null) {
            return class268.field4323 == null || class268.field4323.field751 == this ? super.getParameter(arg0) : class268.field4323.field751.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field556++;
        class174.field2852 = true;
        class32.field468 = true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method252(int arg0, String arg1) {
        field546++;
        if (arg1.equals("")) {
            return;
        }
        class67.field1117++;
        class314.field5061.method828(106, 64);
        class314.field5061.method1108(class230.method1551(arg1, (byte) -87), true);
        if (arg0 < 119) {
            field562 = -20;
        }
        class314.field5061.method1148((byte) -99, arg1);
    }

    @OriginalMember(owner = "client!gj", name = "run", descriptor = "()V")
    public final void run() {
        field570++;
        try {
            if (class45.field754 != null) {
                String var1 = class45.field754.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class45.field753;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method253(64, "wrongjava");
                        return;
                    }
                    class60.field975 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class45.field753 == null || class45.field753.equals("1.4.2"))) {
                    this.method253(64, "wrongjava");
                    return;
                }
            }
            if (class45.field753 != null && class45.field753.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (var4 < class45.field753.length()) {
                    char var5 = class45.field753.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = -(-var5 - var3 * 10) - 48;
                }
                if (var3 >= 5) {
                    class184.field3018 = true;
                }
            }
            if (class268.field4323.field751 != null) {
                Method var6 = class45.field765;
                if (var6 != null) {
                    try {
                        var6.invoke(class268.field4323.field751, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class134.method944(21);
            this.method258((byte) -71);
            class112.field1757 = class295.method1961(class310.field4964, class294.field4709, 500, class131.field2064);
            this.method249(86);
            class309.field4932 = class287.method1912(-768);
            this.method241(-119);
            while (class228.field3674 == 0L || class228.field3674 > class191.method1350((byte) 100)) {
                class276.field4435 = class309.field4932.method152(class168.field2745, -119, class60.field975);
                for (int var7 = 0; var7 < class276.field4435; var7++) {
                    this.method254(-118);
                }
                this.method248(96);
                class199.method1385(class131.field2064, class268.field4323, true);
            }
        } catch (Exception var10) {
            class19.method94(-103, var10, (String) null);
            this.method253(64, "crash");
        }
        this.method242(0, true);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(ILjava/lang/String;)V")
    public final void method253(int arg0, String arg1) {
        field569++;
        if (this.field549) {
            return;
        }
        this.field549 = true;
        System.out.println("error_game_" + arg1);
        try {
            class297.method1967(false, "loggedout", class268.field4323.field751);
            if (arg0 != 64) {
                field562 = 32;
            }
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
    private final void method254(int arg0) {
        long var2 = class308.field4928[class168.field2734];
        long var4 = class191.method1350((byte) 110);
        class308.field4928[class168.field2734] = var4;
        class168.field2734 = class168.field2734 + 1 & 0x1F;
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        field545++;
        synchronized (this) {
            class198.field3186 = class174.field2852;
        }
        this.method250((byte) -71);
        int var7 = 93 / ((-arg0 - 12) / 62);
    }

    @OriginalMember(owner = "client!gj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field575++;
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public abstract void method255(int arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBZIILjava/lang/String;I)V")
    public final void method256(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, String arg6, int arg7) {
        try {
            class310.field4964 = arg0;
            class153.field2387 = arg0;
            class6.field59 = 0;
            class46.field784 = arg4;
            class56.field933 = this;
            class238.field3822 = 0;
            class294.field4709 = arg1;
            class66.field1099 = arg1;
            class92.field1494 = new Frame();
            class92.field1494.setTitle("Jagex");
            class92.field1494.setResizable(true);
            class92.field1494.addWindowListener(this);
            int var9 = -65 % ((arg2 - 27) / 60);
            class92.field1494.setVisible(true);
            class92.field1494.toFront();
            Insets var10 = class92.field1494.getInsets();
            class92.field1494.setSize(class66.field1099 + var10.right + var10.left, class153.field2387 + var10.bottom + var10.top);
            class34.field520 = class268.field4323 = new class45((Applet) null, arg5, arg6, arg7);
            class172 var11 = class268.field4323.method319(1, this, (byte) -86);
            while (var11.field2814 == 0) {
                class262.method1758(10L, 29552);
            }
        } catch (Exception var13) {
            class19.method94(-116, var13, (String) null);
        }
        field560++;
    }

    @OriginalMember(owner = "client!gj", name = "start", descriptor = "()V")
    public final void start() {
        field541++;
        if (class56.field933 == this && !class176.field2881) {
            class228.field3674 = 0L;
        }
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
    public abstract void method257(int arg0);

    @OriginalMember(owner = "client!gj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field577++;
    }

    @OriginalMember(owner = "client!gj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field568++;
        this.destroy();
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V")
    public final synchronized void method258(byte arg0) {
        if (class131.field2064 != null) {
            class131.field2064.removeFocusListener(this);
            class131.field2064.getParent().remove(class131.field2064);
        }
        field544++;
        Container var2;
        if (class259.field4184 != null) {
            var2 = class259.field4184;
        } else if (class92.field1494 == null) {
            var2 = class268.field4323.field751;
        } else {
            var2 = class92.field1494;
        }
        var2.setLayout((LayoutManager) null);
        class131.field2064 = new class11(this);
        var2.add(class131.field2064);
        class131.field2064.setSize(class294.field4709, class310.field4964);
        class131.field2064.setVisible(true);
        if (class92.field1494 == var2) {
            Insets var3 = class92.field1494.getInsets();
            class131.field2064.setLocation(class6.field59 + var3.left, class238.field3822 + var3.top);
        } else {
            class131.field2064.setLocation(class6.field59, class238.field3822);
        }
        class131.field2064.addFocusListener(this);
        class131.field2064.requestFocus();
        class174.field2852 = true;
        class32.field468 = true;
        class43.field642 = false;
        if (arg0 >= -66) {
            method252(44, (String) null);
        }
        class198.field3186 = true;
        class141.field2260 = class191.method1350((byte) -59);
    }
}
