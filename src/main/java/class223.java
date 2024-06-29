import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class223 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!si", name = "z", descriptor = "Z")
    private boolean field3678 = false;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Ljf;")
    public static class82 field3662;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lii;B)V", line = 6)
    public static final void method1573(class221 arg0, byte arg1) {
        byte[] var2 = new byte[24];
        field3688++;
        if (arg1 >= -83) {
            field3662 = (class82) null;
        }
        if (class113.field1689 != null) {
            try {
                class113.field1689.method198((byte) -113, 0L);
                class113.field1689.method196(-16607, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1531(0, -84, 24, var2);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I", line = 52)
    public static final int method1574(int arg0, int arg1) {
        field3668++;
        return arg0 > -18 ? -8 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!si", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 63)
    public final void windowDeiconified(WindowEvent arg0) {
        field3665++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZB)V", line = 70)
    private final void method1575(boolean arg0, byte arg1) {
        field3685++;
        synchronized (this) {
            if (class141.field2077) {
                return;
            }
            int var4 = 79 / ((arg1 - 28) / 43);
            class141.field2077 = true;
        }
        if (class267.field4597.field2262 != null) {
            class267.field4597.field2262.destroy();
        }
        try {
            this.method765((byte) 83);
        } catch (Exception var13) {
        }
        if (class147.field2141 != null) {
            try {
                class147.field2141.removeFocusListener(this);
                class147.field2141.getParent().remove(class147.field2141);
            } catch (Exception var12) {
            }
        }
        if (class267.field4597 != null) {
            try {
                class267.field4597.method985(-104);
            } catch (Exception var11) {
            }
        }
        this.method762(true);
        if (class81.field1263 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)J", line = 133)
    public static final long method1576(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        return var3 == null || var3.field3149 == null ? 0L : var3.field3149.field1335;
    }

    @OriginalMember(owner = "client!si", name = "run", descriptor = "()V", line = 142)
    public final void run() {
        field3664++;
        try {
            if (class154.field2280 != null) {
                String var1 = class154.field2280.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class154.field2271;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1577((byte) -53, "wrongjava");
                        return;
                    }
                    class235.field3885 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class154.field2271 == null || class154.field2271.equals("1.4.2"))) {
                    this.method1577((byte) -53, "wrongjava");
                    return;
                }
            }
            if (class267.field4597.field2262 != null) {
                Method var3 = class154.field2270;
                if (var3 != null) {
                    try {
                        var3.invoke(class267.field4597.field2262, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method1586(108);
            this.method764((byte) -120);
            class9.field139 = class202.method1344(25238);
            while (class196.field3096 == 0L || class196.field3096 > class212.method1404((byte) -121)) {
                class18.field319 = class9.field139.method1729(class235.field3885, class133.field1969, (byte) 26);
                for (int var5 = 0; var5 < class18.field319; var5++) {
                    this.method1585(0);
                }
                this.method1584(false);
                class113.method745((byte) -9, class147.field2141, class267.field4597);
            }
        } catch (Exception var8) {
            class98.method630((String) null, -121, var8);
            this.method1577((byte) -53, "crash");
        }
        this.method1575(true, (byte) 125);
    }

    @OriginalMember(owner = "client!si", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 225)
    public final void focusLost(FocusEvent arg0) {
        class31.field489 = false;
        field3680++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLjava/lang/String;)V", line = 236)
    public final void method1577(byte arg0, String arg1) {
        if (arg0 != -53) {
            this.windowIconified((WindowEvent) null);
        }
        field3671++;
        if (this.field3678) {
            return;
        }
        this.field3678 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z", line = 260)
    public final boolean method1578(boolean arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field3660++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0) {
                this.method1586(-106);
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
                this.method1577((byte) -53, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V", line = 292)
    public final void method1579(String arg0, String arg1, boolean arg2) {
        field3666++;
        if (this.field3678) {
            return;
        }
        this.field3678 = arg2;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!si", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 311)
    public final void focusGained(FocusEvent arg0) {
        field3659++;
        class31.field489 = true;
        class236.field3900 = true;
    }

    @OriginalMember(owner = "client!si", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 320)
    public final void windowDeactivated(WindowEvent arg0) {
        field3663++;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V", line = 328)
    public static void method1580(byte arg0) {
        field3662 = null;
        if (arg0 > -6) {
            method1573((class221) null, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!si", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 339)
    public final void windowOpened(WindowEvent arg0) {
        field3654++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 347)
    public final void method1581(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class240.field3982 = this;
            class288.field4880 = 0;
            class230.field3823 = arg3;
            class255.field4362 = arg6;
            class48.field739 = arg6;
            class156.field2314 = arg4;
            class239.field3977 = arg4;
            class60.field932 = 0;
            class81.field1263 = new Frame();
            if (arg0 < 38) {
                field3662 = (class82) null;
            }
            class81.field1263.setTitle("Jagex");
            class81.field1263.setResizable(true);
            class81.field1263.addWindowListener(this);
            class81.field1263.setVisible(true);
            class81.field1263.toFront();
            Insets var8 = class81.field1263.getInsets();
            class81.field1263.setSize(class48.field739 + var8.left + var8.right, var8.top + var8.bottom + class239.field3977);
            class230.field3813 = class267.field4597 = new class154(true, (Applet) null, arg1, arg2, arg5);
            class267.field4597.method991(this, false, 5);
        } catch (Exception var10) {
            class98.method630((String) null, -111, var10);
        }
        field3672++;
    }

    @OriginalMember(owner = "client!si", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 383)
    public final void update(Graphics arg0) {
        field3675++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)I", line = 391)
    public static final int method1582(int arg0, boolean arg1) {
        if (!arg1) {
            field3687 = -21;
        }
        field3674++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!si", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 402)
    public final URL getCodeBase() {
        field3655++;
        if (class81.field1263 == null) {
            return class267.field4597 == null || class267.field4597.field2262 == this ? super.getCodeBase() : class267.field4597.field2262.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lfi;", line = 424)
    public static final class222 method1583(int arg0) {
        int var1 = class179.field2718[0] * class112.field1665[0];
        field3683++;
        byte[] var2 = class37.field590[0];
        class222 var5;
        if (class70.field1115[arg0]) {
            int[] var6 = new int[var1];
            byte[] var7 = class67.field1047[0];
            for (int var8 = 0; var8 < var1; var8++) {
                var6[var8] = class264.method1820(class268.field4610[class204.method1354(255, var2[var8])], class204.method1354(-16777216, var7[var8] << 24));
            }
            var5 = new class285(class282.field4786, class281.field4765, class88.field1315[0], class287.field4836[0], class112.field1665[0], class179.field2718[0], var6);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class268.field4610[class204.method1354(255, var2[var4])];
            }
            var5 = new class222(class282.field4786, class281.field4765, class88.field1315[0], class287.field4836[0], class112.field1665[0], class179.field2718[0], var3);
        }
        class207.method1365(9);
        return var5;
    }

    @OriginalMember(owner = "client!si", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 472)
    public final void windowClosed(WindowEvent arg0) {
        field3679++;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V", line = 481)
    private final void method1584(boolean arg0) {
        field3677++;
        long var2 = class212.method1404((byte) -105);
        long var4 = class167.field2548[class212.field3380];
        class167.field2548[class212.field3380] = var2;
        class212.field3380 = class212.field3380 + 1 & 0x1F;
        if (arg0) {
            return;
        }
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class266.field4545 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class92.field1402++) > 50) {
            class236.field3900 = true;
            class92.field1402 -= 50;
            class147.field2141.setSize(class255.field4362, class156.field2314);
            class147.field2141.setVisible(true);
            if (class81.field1263 != null && class207.field3291 == null) {
                Insets var7 = class81.field1263.getInsets();
                class147.field2141.setLocation(var7.left + class288.field4880, class60.field932 + var7.top);
            } else {
                class147.field2141.setLocation(class288.field4880, class60.field932);
            }
        }
        this.method773((byte) -77);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 522)
    private final void method1585(int arg0) {
        field3684++;
        long var2 = class212.method1404((byte) -98);
        long var4 = class200.field3173[class171.field2628];
        if ((long) arg0 != var4 && var2 <= var4) {
        }
        class200.field3173[class171.field2628] = var2;
        class171.field2628 = class171.field2628 + 1 & 0x1F;
        synchronized (this) {
            class290.field4938 = class31.field489;
        }
        this.method768(-72);
    }

    @OriginalMember(owner = "client!si", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 552)
    public final void windowActivated(WindowEvent arg0) {
        field3673++;
    }

    @OriginalMember(owner = "client!si", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 560)
    public final synchronized void paint(Graphics arg0) {
        field3658++;
        if (class240.field3982 == this && !class141.field2077) {
            class236.field3900 = true;
            if (class154.field2271 != null && class154.field2271.startsWith("1.5")) {
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 594)
    public final void windowIconified(WindowEvent arg0) {
        field3667++;
    }

    @OriginalMember(owner = "client!si", name = "providesignlink", descriptor = "(Lhf;)V", line = 602)
    public static final void providesignlink(class154 arg0) {
        field3670++;
        class267.field4597 = arg0;
        class230.field3813 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "stop", descriptor = "()V", line = 613)
    public final void stop() {
        field3653++;
        if (class240.field3982 == this && !class141.field2077) {
            class196.field3096 = class212.method1404((byte) -123) + 4000L;
        }
    }

    @OriginalMember(owner = "client!si", name = "start", descriptor = "()V", line = 625)
    public final void start() {
        field3689++;
        if (class240.field3982 == this && !class141.field2077) {
            class196.field3096 = 0L;
        }
    }

    @OriginalMember(owner = "client!si", name = "destroy", descriptor = "()V", line = 637)
    public final void destroy() {
        field3686++;
        if (class240.field3982 == this && !class141.field2077) {
            class196.field3096 = class212.method1404((byte) -94);
            class116.method759(-1, 5000L);
            class230.field3813 = null;
            this.method1575(false, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 654)
    public final synchronized void method1586(int arg0) {
        if (class147.field2141 != null) {
            class147.field2141.removeFocusListener(this);
            class147.field2141.getParent().remove(class147.field2141);
        }
        field3681++;
        Container var2;
        if (class207.field3291 != null) {
            var2 = class207.field3291;
        } else if (class81.field1263 == null) {
            var2 = class267.field4597.field2262;
        } else {
            var2 = class81.field1263;
        }
        var2.setLayout((LayoutManager) null);
        class147.field2141 = new class192(this);
        class147.field2141.setIgnoreRepaint(true);
        var2.add(class147.field2141);
        class147.field2141.setSize(class255.field4362, class156.field2314);
        class147.field2141.setVisible(true);
        if (class81.field1263 == var2) {
            Insets var3 = class81.field1263.getInsets();
            class147.field2141.setLocation(class288.field4880 + var3.left, class60.field932 + var3.top);
        } else {
            class147.field2141.setLocation(class288.field4880, class60.field932);
        }
        class147.field2141.addFocusListener(this);
        class147.field2141.requestFocus();
        class290.field4938 = true;
        class31.field489 = true;
        if (arg0 < 55) {
            field3662 = (class82) null;
        }
        class236.field3900 = true;
        class170.field2613 = false;
        class18.field320 = class212.method1404((byte) -121);
    }

    @OriginalMember(owner = "client!si", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 704)
    public final void windowClosing(WindowEvent arg0) {
        field3656++;
        this.destroy();
    }

    @OriginalMember(owner = "client!si", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 714)
    public final URL getDocumentBase() {
        field3657++;
        if (class81.field1263 == null) {
            return class267.field4597 == null || class267.field4597.field2262 == this ? super.getDocumentBase() : class267.field4597.field2262.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V", line = 728)
    public final void method1587(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3661++;
        try {
            if (class240.field3982 != null) {
                class275.field4689++;
                if (class275.field4689 >= 3) {
                    this.method1577((byte) -53, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class255.field4362 = arg2;
            class48.field739 = arg2;
            class156.field2314 = arg3;
            class239.field3977 = arg3;
            class288.field4880 = 0;
            class60.field932 = 0;
            class240.field3982 = this;
            class230.field3823 = arg4;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class219.field3548 = true;
            } else {
                class219.field3548 = false;
            }
            if (class267.field4597 == null) {
                class230.field3813 = class267.field4597 = new class154(false, this, arg1, (String) null, 0);
            }
            class267.field4597.method991(this, false, 5);
        } catch (Exception var8) {
            class98.method630((String) null, arg0 - 77, var8);
            this.method1577((byte) -53, "crash");
        }
        if (arg0 != -4) {
            this.update((Graphics) null);
        }
    }

    @OriginalMember(owner = "client!si", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 784)
    public final AppletContext getAppletContext() {
        field3676++;
        if (class81.field1263 == null) {
            return class267.field4597 == null || class267.field4597.field2262 == this ? super.getAppletContext() : class267.field4597.field2262.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 800)
    public final String getParameter(String arg0) {
        field3682++;
        if (class81.field1263 == null) {
            return class267.field4597 == null || class267.field4597.field2262 == this ? super.getParameter(arg0) : class267.field4597.field2262.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public abstract void method764(byte arg0);

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
    public abstract void method765(byte arg0);

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(Z)V")
    public abstract void method762(boolean arg0);

    @OriginalMember(owner = "client!si", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
    public abstract void method768(int arg0);

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(B)V")
    public abstract void method773(byte arg0);
}
