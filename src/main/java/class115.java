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

@OriginalClass("client!th")
public abstract class class115 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!th", name = "C", descriptor = "Z")
    private boolean field2178 = false;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "[J")
    public static long[] field2171 = new long[32];

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Lhh;")
    public static class163 field2179 = class137.method1065("p11_full", 17);

    @OriginalMember(owner = "client!th", name = "N", descriptor = "Lhh;")
    private static class163 field2189 = class137.method1065("slide:", 17);

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Lhh;")
    public static class163 field2187 = field2189;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "Lhh;")
    public static class163 field2170 = field2189;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lah;")
    public static class23 field2154 = new class23();

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "Lhh;")
    public static class163 field2192 = class137.method1065("Lade Wordpack )2 ", 17);

    @OriginalMember(owner = "client!th", name = "O", descriptor = "Loj;")
    public static class17 field2190 = new class17(5);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "Lpa;")
    public static class123 field2193;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Lok;")
    public static class92 field2191;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "Z")
    public static boolean field2194;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "Z")
    public static boolean field2195;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "Z")
    public static boolean field2196;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method911(byte arg0, String arg1) {
        field2158++;
        if (this.field2178) {
            return;
        }
        this.field2178 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 < -127) {
            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2166++;
        if (class45.field754 == null) {
            return class169.field3090 == null || class169.field3090.field3055 == this ? super.getDocumentBase() : class169.field3090.field3055.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2186++;
    }

    @OriginalMember(owner = "client!th", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2173++;
        if (class45.field754 == null) {
            return class169.field3090 == null || class169.field3090.field3055 == this ? super.getCodeBase() : class169.field3090.field3055.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2164++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!th", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!th", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2161++;
        if (class45.field754 == null) {
            return class169.field3090 == null || class169.field3090.field3055 == this ? super.getAppletContext() : class169.field3090.field3055.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2183++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
    private final void method912(int arg0, boolean arg1) {
        field2185++;
        synchronized (this) {
            if (class208.field3779) {
                return;
            }
            class208.field3779 = true;
        }
        if (class169.field3090.field3055 != null) {
            class169.field3090.field3055.destroy();
        }
        try {
            if (arg0 != 0) {
                this.start();
            }
            this.method829(-27504);
        } catch (Exception var9) {
        }
        if (class202.field3675 != null) {
            try {
                class202.field3675.removeFocusListener(this);
                class202.field3675.getParent().remove(class202.field3675);
            } catch (Exception var8) {
            }
        }
        if (class169.field3090 != null) {
            try {
                class169.field3090.method1254((byte) -125);
            } catch (Exception var7) {
            }
        }
        this.method835((byte) 105);
        if (class45.field754 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLhd;B)V")
    public static final void method913(boolean arg0, class222 arg1, byte arg2) {
        int var3 = (int) arg1.field2641;
        field2176++;
        int var4 = arg1.field4049;
        arg1.method1063(98);
        if (arg0) {
            class33.method197(var4, -1);
        }
        class76.method557((byte) 19, var4);
        class69 var5 = class124.method989((byte) 125, var3);
        if (var5 != null) {
            class213.method1517((byte) 11, var5);
        }
        class202.field3647 = 0;
        class130.field2530 = false;
        class89.method690(class190.field3484, class239.field4247, class153.field2867, 0, class14.field221);
        if (class193.field3521 != -1) {
            class146.method1102(1, class193.field3521, -1458);
        }
        if (arg2 <= 75) {
            method922((class123) null, -16, false);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public abstract void method828(int arg0);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public static void method914(boolean arg0) {
        field2187 = null;
        field2189 = null;
        field2193 = null;
        field2171 = null;
        field2179 = null;
        field2191 = null;
        field2192 = null;
        field2154 = null;
        if (arg0) {
            method913(true, (class222) null, (byte) -13);
        }
        field2170 = null;
        field2190 = null;
    }

    @OriginalMember(owner = "client!th", name = "start", descriptor = "()V")
    public final void start() {
        field2168++;
        if (class163.field3008 == this && !class208.field3779) {
            class201.field3607 = 0L;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lbg;B)V")
    public static final void method915(class250 arg0, byte arg1) {
        field2160++;
        long var2 = 0L;
        int var4 = -1;
        if (arg0.field4398 == 0) {
            var2 = class243.method1681(arg0.field4391, arg0.field4396, arg0.field4397);
        }
        if (arg0.field4398 == 1) {
            var2 = class255.method1731(arg0.field4391, arg0.field4396, arg0.field4397);
        }
        if (arg0.field4398 == 2) {
            var2 = class19.method134(arg0.field4391, arg0.field4396, arg0.field4397);
        }
        int var5 = 0;
        if (arg0.field4398 == 3) {
            var2 = class219.method1553(arg0.field4391, arg0.field4396, arg0.field4397);
        }
        if (arg1 != 29) {
            return;
        }
        int var6 = 0;
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7D229) >> 14;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg0.field4390 = var5;
        arg0.field4393 = var6;
        arg0.field4392 = var4;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public abstract void method830(int arg0);

    @OriginalMember(owner = "client!th", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2150++;
        if (class163.field3008 == this && !class208.field3779) {
            class201.field3607 = class7.method55(0);
            class107.method866(0, 5000L);
            class56.field930 = null;
            this.method912(0, false);
        }
    }

    @OriginalMember(owner = "client!th", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2184++;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public final synchronized void method916(int arg0) {
        if (class202.field3675 != null) {
            class202.field3675.removeFocusListener(this);
            class202.field3675.getParent().remove(class202.field3675);
        }
        if (class1.field2 != null) {
            class1.field2.getParent().remove(class1.field2);
            class1.field2 = null;
        }
        if (arg0 < 79) {
            this.field2178 = true;
        }
        Container var2;
        if (class132.field2563 != null) {
            var2 = class132.field2563;
        } else if (class45.field754 == null) {
            var2 = class169.field3090.field3055;
        } else {
            var2 = class45.field754;
        }
        field2157++;
        var2.setLayout((LayoutManager) null);
        if (class236.field4213 != 0) {
            class1.field2 = new class205(this);
            var2.add(class1.field2);
            class1.field2.setSize(class233.field4160, class236.field4213);
            class1.field2.setVisible(true);
            if (class45.field754 == var2) {
                Insets var3 = class45.field754.getInsets();
                class1.field2.setLocation(var3.left, var3.top);
            } else {
                class1.field2.setLocation(0, 0);
            }
        }
        class202.field3675 = new class205(this);
        var2.add(class202.field3675);
        class202.field3675.setSize(class233.field4160, class205.field3706);
        class202.field3675.setVisible(true);
        if (class45.field754 == var2) {
            Insets var4 = class45.field754.getInsets();
            class202.field3675.setLocation(var4.left, var4.top + class236.field4213);
        } else {
            class202.field3675.setLocation(0, class236.field4213);
        }
        class202.field3675.addFocusListener(this);
        class202.field3675.requestFocus();
        class259.field4534 = true;
        class38.field637 = true;
        class99.field1857 = false;
        class211.field3816 = true;
        class172.field3149 = class7.method55(0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
    public final boolean method917(byte arg0) {
        field2153++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 < 48) {
                this.getCodeBase();
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
                this.method911((byte) -128, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2156++;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public abstract void method829(int arg0);

    @OriginalMember(owner = "client!th", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2182++;
        class259.field4534 = false;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    private final void method918(byte arg0) {
        field2180++;
        long var2 = field2171[class104.field2009];
        long var4 = class7.method55(0);
        field2171[class104.field2009] = var4;
        class104.field2009 = class104.field2009 + 1 & 0x1F;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class52.field879 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class18.field290++) > 50) {
            class38.field637 = true;
            class18.field290 -= 50;
            class202.field3675.setSize(class233.field4160, class205.field3706);
            class202.field3675.setVisible(true);
            if (class45.field754 != null && class132.field2563 == null) {
                Insets var7 = class45.field754.getInsets();
                class202.field3675.setLocation(var7.left, class236.field4213 + var7.top);
            } else {
                class202.field3675.setLocation(0, class236.field4213);
            }
        }
        this.method840(-3);
        if (arg0 != -7) {
            this.paint((Graphics) null);
        }
    }

    @OriginalMember(owner = "client!th", name = "stop", descriptor = "()V")
    public final void stop() {
        field2175++;
        if (class163.field3008 == this && !class208.field3779) {
            class201.field3607 = class7.method55(0) + 4000L;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lba;")
    public static final class95 method919(int arg0, int arg1) {
        if (arg1 > -3) {
            field2189 = null;
        }
        field2159++;
        class95 var2 = (class95) class250.field4400.method114((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class59.field965.method973(1, true, arg0);
        class95 var4 = new class95();
        if (var3 != null) {
            var4.method753(true, arg0, new class81(var3));
        }
        class250.field4400.method117(var4, false, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
    public abstract void method835(byte arg0);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V")
    public static final void method920(byte arg0, int arg1) {
        if (arg0 > -89) {
            field2154 = null;
        }
        field2163++;
        class260.method1763(0);
        class23.method156((byte) -105);
        int var2 = class64.method449(arg1, (byte) 85).field1417;
        if (var2 == 0) {
            return;
        }
        int var3 = class119.field2252[arg1];
        if (var2 == 6) {
            class68.field1151 = var3;
        }
        if (var2 == 5) {
            class221.field4017 = var3;
        }
        if (var2 == 9) {
            class231.field4153 = var3;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
    public final void method921(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2169++;
        try {
            if (class163.field3008 != null) {
                class153.field2862++;
                if (class153.field2862 >= 3) {
                    this.method911((byte) -128, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class233.field4160 = arg3;
            class170.field3112 = arg1;
            class205.field3706 = arg4;
            class163.field3008 = this;
            String var6 = this.getParameter("openwinjs");
            boolean var10000;
            if (var6 != null && var6.equals("1")) {
                var10000 = true;
            } else {
                var10000 = false;
            }
            if (class169.field3090 == null) {
                class56.field930 = class169.field3090 = new class166(false, this, arg0, (String) null, 0);
            }
            class169.field3090.method1253(this, 1, 2244);
        } catch (Exception var8) {
            class107.method865(-117, var8, (String) null);
            this.method911((byte) -128, "crash");
        }
        if (arg2 != 0) {
            field2193 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2155++;
    }

    @OriginalMember(owner = "client!th", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2177++;
        if (class45.field754 == null) {
            return class169.field3090 == null || class169.field3090.field3055 == this ? super.getParameter(arg0) : class169.field3090.field3055.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2165++;
    }

    @OriginalMember(owner = "client!th", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2188++;
        if (class163.field3008 != this || class208.field3779) {
            return;
        }
        class38.field637 = true;
        if (class166.field3070 != null && class166.field3070.startsWith("1.5") && class7.method55(0) - class172.field3149 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class233.field4160 <= var2.width && class205.field3706 <= var2.height) {
                class99.field1857 = true;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2181++;
        class259.field4534 = true;
        class38.field637 = true;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lpa;IZ)[Lrh;")
    public static final class242[] method922(class123 arg0, int arg1, boolean arg2) {
        field2174++;
        if (class131.method1038(5825, arg1, arg0)) {
            return arg2 ? null : class84.method675((byte) -85);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
    private final void method923(int arg0) {
        field2172++;
        long var2 = class7.field128[class172.field3160];
        long var4 = class7.method55(0);
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class7.field128[class172.field3160] = var4;
        class172.field3160 = class172.field3160 + 1 & arg0;
        synchronized (this) {
            class211.field3816 = class259.field4534;
        }
        this.method828(arg0 - 128);
    }

    @OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
    public final void run() {
        field2152++;
        try {
            if (class166.field3067 != null) {
                String var1 = class166.field3067.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class166.field3070;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method911((byte) -128, "wrongjava");
                        return;
                    }
                    class127.field2475 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class166.field3070 == null || class166.field3070.equals("1.4.2"))) {
                    this.method911((byte) -128, "wrongjava");
                    return;
                }
            }
            if (class169.field3090.field3055 != null) {
                Method var3 = class166.field3057;
                if (var3 != null) {
                    try {
                        var3.invoke(class169.field3090.field3055, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method916(84);
            class128.field2496 = class186.method1376(class202.field3675, class205.field3706, class233.field4160, 2047);
            this.method830(0);
            class188.field3445 = class165.method1243(69);
            while (class201.field3607 == 0L || class7.method55(0) < class201.field3607) {
                class141.field2693 = class188.field3445.method841(class190.field3458, 320, class127.field2475);
                for (int var4 = 0; var4 < class141.field2693; var4++) {
                    this.method923(31);
                }
                this.method918((byte) -7);
                class29.method181(0, class202.field3675, class169.field3090);
            }
        } catch (Exception var7) {
            class107.method865(-104, var7, (String) null);
            this.method911((byte) -128, "crash");
        }
        this.method912(0, true);
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public abstract void method840(int arg0);

    @OriginalMember(owner = "client!th", name = "providesignlink", descriptor = "(Lpc;)V")
    public static final void providesignlink(class166 arg0) {
        class169.field3090 = arg0;
        class56.field930 = arg0;
        field2151++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIILjava/lang/String;Z)V")
    public final void method924(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, boolean arg6) {
        try {
            class163.field3008 = this;
            class205.field3706 = arg3;
            class233.field4160 = arg2;
            class170.field3112 = arg0;
            class45.field754 = new Frame();
            class45.field754.setTitle("Jagex");
            class45.field754.setResizable(arg6);
            class45.field754.addWindowListener(this);
            class45.field754.setVisible(true);
            class45.field754.toFront();
            Insets var8 = class45.field754.getInsets();
            class45.field754.setSize(var8.left + arg2 + var8.right, var8.bottom + arg3 - -var8.top);
            class56.field930 = class169.field3090 = new class166(true, (Applet) null, arg4, arg5, arg1);
            class169.field3090.method1253(this, 1, 2244);
        } catch (Exception var10) {
            class107.method865(-121, var10, (String) null);
        }
        field2162++;
    }

    @OriginalMember(owner = "client!th", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2167++;
    }
}
