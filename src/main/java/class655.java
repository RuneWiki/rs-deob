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

@OriginalClass("client!nv")
public abstract class class655 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "Z")
    private boolean field9113 = false;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "Z")
    private boolean field9121 = false;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Ltc;")
    public static class477 field9114 = null;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "Z")
    public static boolean field9124 = true;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!nv", name = "Q", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!nv", name = "S", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!nv", name = "T", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!nv", name = "V", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!nv", name = "Z", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "Z")
    public static boolean field9141;

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "Z")
    public static boolean field9142;

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "Z")
    public static boolean field9143;

    @OriginalMember(owner = "client!nv", name = "R", descriptor = "Z")
    public static boolean field9145;

    @OriginalMember(owner = "client!nv", name = "U", descriptor = "Z")
    public static boolean field9148;

    @OriginalMember(owner = "client!nv", name = "W", descriptor = "Z")
    public static boolean field9150;

    @OriginalMember(owner = "client!nv", name = "X", descriptor = "Z")
    public static boolean field9151;

    @OriginalMember(owner = "client!nv", name = "Y", descriptor = "Z")
    public static boolean field9152;

    @OriginalMember(owner = "client!nv", name = "ab", descriptor = "Z")
    public static boolean field9154;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method3600(byte arg0, String arg1) {
        field9105++;
        if (this.field9113) {
            return;
        }
        this.field9113 = true;
        System.out.println("error_game_" + arg1);
        try {
            if (arg0 >= -92) {
                return;
            }
            class92.method688(-13381, "loggedout", class348.field4462);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZIIILjava/lang/String;II)V")
    public final void method3601(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field9117++;
        try {
            class519.field6796 = arg2;
            class544.field7066 = arg2;
            class50.field706 = this;
            class349.field4470 = 0;
            class103.field1376 = arg0;
            class461.field6047 = arg6;
            class207.field2669 = arg6;
            if (arg4 == -31476) {
                class289.field3729 = 0;
                class227.field3003 = null;
                class425.field5520 = new Frame();
                class425.field5520.setTitle("Jagex");
                class425.field5520.setResizable(true);
                class425.field5520.addWindowListener(this);
                class425.field5520.setVisible(true);
                class425.field5520.toFront();
                Insets var9 = class425.field5520.getInsets();
                class425.field5520.setSize(class544.field7066 + var9.left + var9.right, class207.field2669 + var9.top + var9.bottom);
                class499.field6559 = class688.field9413 = new class140(arg7, arg5, arg3, true);
                class548 var10 = class688.field9413.method1057(this, 1, (byte) 106);
                while (var10.field7108 == 0) {
                    class122.method905(10L, arg4 + 25331);
                }
            }
        } catch (Exception var12) {
            class698.method3809(null, (byte) 112, var12);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public abstract void method693(byte arg0);

    @OriginalMember(owner = "client!nv", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field9103++;
        if (class50.field706 == this && !class48.field678) {
            class127.field1639 = class584.method3191(1);
            class122.method905(5000L, -6145);
            class499.field6559 = null;
            this.method3604((byte) -61, false);
        }
    }

    @OriginalMember(owner = "client!nv", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field9107++;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public static void method3602(boolean arg0) {
        if (arg0) {
            field9114 = null;
        }
        field9114 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z")
    public final boolean method3603(int arg0) {
        if (arg0 >= -98) {
            return false;
        } else {
            field9112++;
            return client.method709("jagmisc", (byte) -28);
        }
    }

    @OriginalMember(owner = "client!nv", name = "run", descriptor = "()V")
    public final void run() {
        field9138++;
        try {
            if (class140.field1834 != null) {
                String var1 = class140.field1834.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class140.field1837;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3600((byte) -104, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class140.field1837 == null || class140.field1837.equals("1.4.2"))) {
                    this.method3600((byte) -110, "wrongjava");
                    return;
                }
            }
            if (class140.field1837 != null && class140.field1837.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class140.field1837.length()) {
                    char var5 = class140.field1837.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
                if (var4 >= 5) {
                    class667.field9254 = true;
                }
            }
            Applet var6 = class50.field706;
            if (class348.field4462 != null) {
                var6 = class348.field4462;
            }
            Method var7 = class140.field1835;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class578.method3167(-107);
            class15.method89(0);
            this.method695((byte) -86);
            this.method698(121);
            class492.field6520 = class22.method119((byte) -128);
            while (class127.field1639 == 0L || class584.method3191(1) < class127.field1639) {
                class259.field3498 = class492.field6520.method3536(class270.field3589, 16);
                for (int var8 = 0; var8 < class259.field3498; var8++) {
                    this.method3607(false);
                }
                this.method3610(0);
                class371.method2138(class688.field9413, 0, class524.field6827);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class698.method3809(this.method711((byte) -16), (byte) 125, var20);
            this.method3600((byte) -104, "crash");
        } finally {
            Object var13 = null;
            this.method3604((byte) 127, true);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BZ)V")
    private final void method3604(byte arg0, boolean arg1) {
        field9116++;
        synchronized (this) {
            if (class48.field678) {
                return;
            }
            class48.field678 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class348.field4462 != null) {
            class348.field4462.destroy();
        }
        try {
            this.method704((byte) -17);
        } catch (Exception var10) {
        }
        if (this.field9121) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field9121 = false;
        }
        class29.method238(true, 0);
        class323.method1868((byte) 2);
        if (class524.field6827 != null) {
            try {
                class524.field6827.removeFocusListener(this);
                class524.field6827.getParent().remove(class524.field6827);
            } catch (Exception var8) {
            }
        }
        int var4 = -34 / ((arg0 - 69) / 47);
        if (class688.field9413 != null) {
            try {
                class688.field9413.method1046((byte) -107);
            } catch (Exception var7) {
            }
        }
        this.method708(115);
        if (class425.field5520 != null) {
            class425.field5520.setVisible(false);
            class425.field5520.dispose();
            class425.field5520 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
    public synchronized void method695(byte arg0) {
        field9127++;
        if (class524.field6827 != null) {
            class524.field6827.removeFocusListener(this);
            class524.field6827.getParent().setBackground(Color.black);
            class524.field6827.getParent().remove(class524.field6827);
        }
        Container var2;
        if (class114.field1483 != null) {
            var2 = class114.field1483;
        } else if (class425.field5520 != null) {
            var2 = class425.field5520;
        } else if (class348.field4462 == null) {
            var2 = class50.field706;
        } else {
            var2 = class348.field4462;
        }
        var2.setLayout(null);
        class524.field6827 = new class283(this);
        var2.add(class524.field6827);
        class524.field6827.setSize(class519.field6796, class461.field6047);
        class524.field6827.setVisible(true);
        if (class425.field5520 == var2) {
            Insets var3 = class425.field5520.getInsets();
            class524.field6827.setLocation(class289.field3729 + var3.left, var3.top - -class349.field4470);
        } else {
            class524.field6827.setLocation(class289.field3729, class349.field4470);
        }
        class524.field6827.addFocusListener(this);
        class524.field6827.requestFocus();
        if (arg0 != -86) {
            field9124 = false;
        }
        class681.field9383 = true;
        class164.field2043 = true;
        class539.field7014 = true;
        class665.field9229 = false;
        class53.field727 = class584.method3191(arg0 ^ 0xFFFFFFAB);
    }

    @OriginalMember(owner = "client!nv", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field9135++;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z")
    public final boolean method3605(int arg0) {
        field9106++;
        if (arg0 != 16) {
            field9114 = null;
        }
        return client.method709("jaclib", (byte) 118);
    }

    @OriginalMember(owner = "client!nv", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field9137++;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
    public abstract void method698(int arg0);

    @OriginalMember(owner = "client!nv", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field9128++;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z")
    public final boolean method3606(int arg0) {
        field9115++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != -23175) {
                this.field9113 = false;
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
                this.method3600((byte) -114, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "start", descriptor = "()V")
    public final void start() {
        field9139++;
        if (class50.field706 == this && !class48.field678) {
            class127.field1639 = 0L;
        }
    }

    @OriginalMember(owner = "client!nv", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field9129++;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
    public abstract void method699(byte arg0);

    @OriginalMember(owner = "client!nv", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!nv", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class348.field4462 = arg0;
        field9104++;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Z)V")
    private final void method3607(boolean arg0) {
        field9109++;
        long var2 = class584.method3191(1);
        long var4 = class3.field22[class423.field5478];
        if (arg0) {
            return;
        }
        class3.field22[class423.field5478] = var2;
        class423.field5478 = class423.field5478 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class164.field2043 = class681.field9383;
        }
        this.method693((byte) -82);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBILjava/lang/String;III)V")
    public final void method3608(int arg0, byte arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field9132++;
        try {
            if (class50.field706 == null) {
                class519.field6796 = arg5;
                class544.field7066 = arg5;
                class103.field1376 = arg2;
                int var8 = -97 % ((5 - arg1) / 35);
                class227.field3003 = class348.field4462;
                class289.field3729 = 0;
                class461.field6047 = arg0;
                class207.field2669 = arg0;
                class50.field706 = this;
                class349.field4470 = 0;
                class499.field6559 = class688.field9413 = new class140(arg4, arg3, arg6, class348.field4462 != null);
                class548 var9 = class688.field9413.method1057(this, 1, (byte) 110);
                while (var9.field7108 == 0) {
                    class122.method905(10L, -6145);
                }
            } else {
                class472.field6147++;
                if (class472.field6147 >= 3) {
                    this.method3600((byte) -122, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var11) {
            class698.method3809(null, (byte) 118, var11);
            this.method3600((byte) -127, "crash");
        }
    }

    @OriginalMember(owner = "client!nv", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field9136++;
        if (class425.field5520 == null) {
            return class348.field4462 == null || class348.field4462 == this ? super.getParameter(arg0) : class348.field4462.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class681.field9383 = false;
        field9118++;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lmea;)V")
    public static final void method3609(class357 arg0) {
        if (class421.field5444 >= 65535) {
            return;
        }
        class296 var1 = arg0.field4631;
        class421.field5440[class421.field5444] = arg0;
        class252.field3442[class421.field5444] = false;
        class421.field5444++;
        int var2 = arg0.field4632;
        if (arg0.field4630) {
            var2 = 0;
        }
        int var3 = arg0.field4632;
        if (arg0.field4633) {
            var3 = class20.field223 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1755(111) + class57.field768 - var1.method1752(39) >> class291.field3760;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1755(107) + var1.method1752(66) - class57.field768 >> class291.field3760;
            if (var7 >= class151.field1933) {
                var7 = class151.field1933 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field4629[var5++];
                int var10 = (var1.method1754(43) + class57.field768 - var1.method1752(115) >> class291.field3760) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class590.field8010) {
                    var11 = class590.field8010 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class283.field3689[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class283.field3689[var4][var12][var8] = var13 | (long) class421.field5444;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class283.field3689[var4][var12][var8] = var13 | (long) class421.field5444 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class283.field3689[var4][var12][var8] = var13 | (long) class421.field5444 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class283.field3689[var4][var12][var8] = var13 | (long) class421.field5444 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field9131++;
        if (class425.field5520 == null) {
            return class348.field4462 == null || class348.field4462 == this ? super.getCodeBase() : class348.field4462.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field9126++;
        if (class425.field5520 == null) {
            return class348.field4462 == null || class348.field4462 == this ? super.getDocumentBase() : class348.field4462.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)Ljava/lang/String;")
    public String method711(byte arg0) {
        field9122++;
        if (arg0 != -16) {
            field9120 = -120;
        }
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field9123++;
    }

    @OriginalMember(owner = "client!nv", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field9134++;
        if (class50.field706 != this || class48.field678) {
            return;
        }
        class539.field7014 = true;
        if (class667.field9254 && (class584.method3191(1) - class53.field727) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class544.field7066 <= var2.width && class207.field2669 <= var2.height) {
                class665.field9229 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field9133++;
        if (class425.field5520 == null) {
            return class348.field4462 == null || class348.field4462 == this ? super.getAppletContext() : class348.field4462.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field9130++;
    }

    @OriginalMember(owner = "client!nv", name = "stop", descriptor = "()V")
    public final void stop() {
        field9125++;
        if (class50.field706 == this && !class48.field678) {
            class127.field1639 = class584.method3191(1) + 4000L;
        }
    }

    @OriginalMember(owner = "client!nv", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class681.field9383 = true;
        field9111++;
        class539.field7014 = true;
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
    public abstract void method704(byte arg0);

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
    private final void method3610(int arg0) {
        field9108++;
        long var2 = class584.method3191(1);
        long var4 = class103.field1372[class640.field8898];
        class103.field1372[class640.field8898] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class486.field6471 = ((var6 >> 1) + 32000) / var6;
        }
        class640.field8898 = class640.field8898 + 1 & 0x1F;
        if ((class153.field1946++) > 50) {
            class539.field7014 = true;
            class153.field1946 -= 50;
            class524.field6827.setSize(class519.field6796, class461.field6047);
            class524.field6827.setVisible(true);
            if (class425.field5520 != null && class114.field1483 == null) {
                Insets var7 = class425.field5520.getInsets();
                class524.field6827.setLocation(var7.left + class289.field3729, class349.field4470 + var7.top);
            } else {
                class524.field6827.setLocation(class289.field3729, class349.field4470);
            }
        }
        this.method699((byte) 100);
        if (arg0 != 0) {
            this.focusLost(null);
        }
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)V")
    public abstract void method708(int arg0);

    @OriginalMember(owner = "client!nv", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field9119++;
    }
}
