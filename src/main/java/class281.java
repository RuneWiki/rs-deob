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

@OriginalClass("client!qu")
public abstract class class281 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Z")
    private boolean field3714 = false;

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "Z")
    private boolean field3741 = false;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "[[I")
    public static int[][] field3718 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "Lau;")
    public static class692 field3727 = new class692(64);

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "B")
    public static byte field3746;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!qu", name = "N", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!qu", name = "O", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!qu", name = "R", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!qu", name = "T", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!qu", name = "U", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!qu", name = "Y", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!qu", name = "bb", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!qu", name = "P", descriptor = "Z")
    public static boolean field3753;

    @OriginalMember(owner = "client!qu", name = "S", descriptor = "Z")
    public static boolean field3756;

    @OriginalMember(owner = "client!qu", name = "V", descriptor = "Z")
    public static boolean field3759;

    @OriginalMember(owner = "client!qu", name = "W", descriptor = "Z")
    public static boolean field3760;

    @OriginalMember(owner = "client!qu", name = "X", descriptor = "Z")
    public static boolean field3761;

    @OriginalMember(owner = "client!qu", name = "Z", descriptor = "Z")
    public static boolean field3763;

    @OriginalMember(owner = "client!qu", name = "ab", descriptor = "Z")
    public static boolean field3764;

    @OriginalMember(owner = "client!qu", name = "cb", descriptor = "Z")
    public static boolean field3766;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)Ljava/lang/String;", line = 6)
    public String method567(int arg0) {
        if (arg0 > -79) {
            return null;
        } else {
            field3739++;
            return null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 17)
    public static final void provideLoaderApplet(Applet arg0) {
        field3738++;
        class551.field8116 = arg0;
    }

    @OriginalMember(owner = "client!qu", name = "stop", descriptor = "()V", line = 26)
    public final void stop() {
        field3743++;
        if (class679.field9602 == this && !class233.field3079) {
            class478.field6844 = class60.method371(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qu", name = "start", descriptor = "()V", line = 40)
    public final void start() {
        field3749++;
        if (class679.field9602 == this && !class233.field3079) {
            class478.field6844 = 0L;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V", line = 51)
    private final void method1659(int arg0) {
        field3742++;
        long var2 = class60.method371(false);
        long var4 = class249.field3278[class62.field984];
        class249.field3278[class62.field984] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class116.field1741 = ((var6 >> 1) + 32000) / var6;
        }
        class62.field984 = class62.field984 + 1 & 0x1F;
        if ((class119.field1778++) > 50) {
            class471.field6786 = true;
            class119.field1778 -= 50;
            class410.field6110.setSize(class454.field6538, class425.field6218);
            class410.field6110.setVisible(true);
            if (class388.field5808 != null && class348.field5160 == null) {
                Insets var7 = class388.field5808.getInsets();
                class410.field6110.setLocation(class189.field2573 + var7.left, class356.field5273 + var7.top);
            } else {
                class410.field6110.setLocation(class189.field2573, class356.field5273);
            }
        }
        if (arg0 != -10384) {
            field3735 = -68;
        }
        this.method576(false);
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)Z", line = 95)
    public final boolean method1660(int arg0) {
        field3724++;
        int var2 = 55 % ((arg0 + 10) / 34);
        return class436.method2588("jaclib", (byte) 70);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 106)
    public final void method1661(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3713++;
        try {
            if (class679.field9602 == null) {
                class454.field6538 = arg3;
                class173.field2443 = arg3;
                class478.field6848 = class551.field8116;
                class679.field9602 = this;
                class189.field2573 = 0;
                class425.field6218 = arg2;
                class300.field4447 = arg2;
                class72.field1148 = arg5;
                class356.field5273 = 0;
                class454.field6550 = class61.field978 = new class226(arg6, arg0, arg1, class551.field8116 != null);
                class254 var8 = class61.field978.method1414(arg4 ^ 0x11, this, arg4);
                while (var8.field3311 == 0) {
                    class687.method3846(10L, -60);
                }
            } else {
                class352.field5237++;
                if (class352.field5237 >= 3) {
                    this.method1665(true, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class118.method869(var10, (byte) -128, null);
            this.method1665(true, "crash");
        }
    }

    @OriginalMember(owner = "client!qu", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 150)
    public final String getParameter(String arg0) {
        field3728++;
        if (class388.field5808 == null) {
            return class551.field8116 == null || class551.field8116 == this ? super.getParameter(arg0) : class551.field8116.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 167)
    private final void method1662(byte arg0) {
        if (arg0 != -39) {
            field3717 = -16;
        }
        field3751++;
        long var2 = class60.method371(false);
        long var4 = class209.field2840[class389.field5821];
        class209.field2840[class389.field5821] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class389.field5821 = class389.field5821 + 1 & 0x1F;
        synchronized (this) {
            class696.field9809 = class297.field4373;
        }
        this.method578((byte) -51);
    }

    @OriginalMember(owner = "client!qu", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 203)
    public final void windowIconified(WindowEvent arg0) {
        field3722++;
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V", line = 210)
    public static void method1663(int arg0) {
        field3718 = null;
        if (arg0 != -4) {
            method1671(null, null, -5, null);
        }
        field3727 = null;
    }

    @OriginalMember(owner = "client!qu", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 221)
    public final void update(Graphics arg0) {
        field3734++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!qu", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 230)
    public final void windowActivated(WindowEvent arg0) {
        field3750++;
    }

    @OriginalMember(owner = "client!qu", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 237)
    public final void windowClosed(WindowEvent arg0) {
        field3730++;
    }

    @OriginalMember(owner = "client!qu", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 247)
    public final URL getDocumentBase() {
        field3736++;
        if (class388.field5808 == null) {
            return class551.field8116 == null || class551.field8116 == this ? super.getDocumentBase() : class551.field8116.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)V", line = 262)
    public synchronized void method575(int arg0) {
        if (class410.field6110 != null) {
            class410.field6110.removeFocusListener(this);
            class410.field6110.getParent().setBackground(Color.black);
            class410.field6110.getParent().remove(class410.field6110);
        }
        field3731++;
        Container var2;
        if (class348.field5160 != null) {
            var2 = class348.field5160;
        } else if (class388.field5808 != null) {
            var2 = class388.field5808;
        } else if (class551.field8116 == null) {
            var2 = class679.field9602;
        } else {
            var2 = class551.field8116;
        }
        var2.setLayout(null);
        class410.field6110 = new class45(this);
        var2.add(class410.field6110);
        class410.field6110.setSize(class454.field6538, class425.field6218);
        if (arg0 != 511) {
            this.method1667(-9, 74, -45, null, -71, 88, false, 73);
        }
        class410.field6110.setVisible(true);
        if (class388.field5808 == var2) {
            Insets var3 = class388.field5808.getInsets();
            class410.field6110.setLocation(class189.field2573 + var3.left, var3.top - -class356.field5273);
        } else {
            class410.field6110.setLocation(class189.field2573, class356.field5273);
        }
        class410.field6110.addFocusListener(this);
        class410.field6110.requestFocus();
        class696.field9809 = true;
        class297.field4373 = true;
        class471.field6786 = true;
        class128.field1845 = false;
        class311.field4579 = class60.method371(false);
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)Z", line = 314)
    public final boolean method1664(byte arg0) {
        field3732++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 > -11) {
            return false;
        } else if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
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
                this.method1665(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 353)
    public final AppletContext getAppletContext() {
        field3712++;
        if (class388.field5808 == null) {
            return class551.field8116 == null || class551.field8116 == this ? super.getAppletContext() : class551.field8116.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 376)
    public final void method1665(boolean arg0, String arg1) {
        field3716++;
        if (this.field3714) {
            return;
        }
        this.field3714 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            class101.method727("loggedout", -121, class551.field8116);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qu", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 404)
    public final void windowDeactivated(WindowEvent arg0) {
        field3733++;
    }

    @OriginalMember(owner = "client!qu", name = "destroy", descriptor = "()V", line = 412)
    public final void destroy() {
        field3721++;
        if (class679.field9602 == this && !class233.field3079) {
            class478.field6844 = class60.method371(false);
            class687.method3846(5000L, -36);
            class454.field6550 = null;
            this.method1670(false, 1024);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILps;)I", line = 429)
    public static final int method1666(int arg0, int arg1, class5 arg2) {
        field3745++;
        if (arg1 != -132) {
            return 70;
        } else if (!client.method564(arg2).method456(arg0, -128) && arg2.field70 == null) {
            return -1;
        } else if (arg2.field60 == null || arg2.field60.length <= arg0) {
            return -1;
        } else {
            return arg2.field60[arg0];
        }
    }

    @OriginalMember(owner = "client!qu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 448)
    public final void focusLost(FocusEvent arg0) {
        field3752++;
        class297.field4373 = false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIILjava/lang/String;IIZI)V", line = 457)
    public final void method1667(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field3747++;
        try {
            class189.field2573 = 0;
            class356.field5273 = 0;
            class72.field1148 = arg4;
            class679.field9602 = this;
            class454.field6538 = arg0;
            class173.field2443 = arg0;
            class478.field6848 = null;
            class425.field6218 = arg1;
            class300.field4447 = arg1;
            class388.field5808 = new Frame();
            class388.field5808.setTitle("Jagex");
            class388.field5808.setResizable(true);
            class388.field5808.addWindowListener(this);
            class388.field5808.setVisible(true);
            class388.field5808.toFront();
            Insets var9 = class388.field5808.getInsets();
            class388.field5808.setSize(class173.field2443 + var9.left + var9.right, class300.field4447 - -var9.top + var9.bottom);
            class454.field6550 = class61.field978 = new class226(arg7, arg3, arg5, true);
            if (arg2 > -109) {
                field3735 = 119;
            }
            class254 var10 = class61.field978.method1414(16, this, 1);
            while (var10.field3311 == 0) {
                class687.method3846(10L, -51);
            }
        } catch (Exception var12) {
            class118.method869(var12, (byte) -128, null);
        }
    }

    @OriginalMember(owner = "client!qu", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 503)
    public final URL getCodeBase() {
        field3726++;
        if (class388.field5808 == null) {
            return class551.field8116 == null || class551.field8116 == this ? super.getCodeBase() : class551.field8116.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 518)
    public final void windowDeiconified(WindowEvent arg0) {
        field3729++;
    }

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)Z", line = 532)
    public final boolean method1668(int arg0) {
        field3748++;
        if (arg0 != 0) {
            this.method1670(true, 26);
        }
        return class436.method2588("jagmisc", (byte) 95);
    }

    @OriginalMember(owner = "client!qu", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 545)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3740++;
    }

    @OriginalMember(owner = "client!qu", name = "run", descriptor = "()V", line = 554)
    public final void run() {
        field3723++;
        try {
            if (class226.field3006 != null) {
                String var1 = class226.field3006.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class226.field2986;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1665(true, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class226.field2986 == null || class226.field2986.equals("1.4.2"))) {
                    this.method1665(true, "wrongjava");
                    return;
                }
            }
            if (class226.field2986 != null && class226.field2986.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class226.field2986.length() > var3) {
                    char var5 = class226.field2986.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - 48);
                    var3++;
                }
                if (var4 >= 5) {
                    class300.field4449 = true;
                }
            }
            Applet var6 = class679.field9602;
            if (class551.field8116 != null) {
                var6 = class551.field8116;
            }
            Method var7 = class226.field3005;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class92.method511(0);
            class14.method99(-103);
            this.method575(511);
            this.method566((byte) -128);
            class639.field9177 = class399.method2475((byte) -109);
            while (class478.field6844 == 0L || class478.field6844 > class60.method371(false)) {
                class216.field2891 = class639.field9177.method2532(19, class643.field9237);
                for (int var8 = 0; var8 < class216.field2891; var8++) {
                    this.method1662((byte) -39);
                }
                this.method1659(-10384);
                class415.method2530(122, class410.field6110, class61.field978);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class118.method869(var20, (byte) -128, this.method567(-107));
            this.method1665(true, "crash");
        } finally {
            Object var13 = null;
            this.method1670(true, 1024);
        }
    }

    @OriginalMember(owner = "client!qu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 678)
    public final void focusGained(FocusEvent arg0) {
        class297.field4373 = true;
        field3719++;
        class471.field6786 = true;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIIIIII)V", line = 687)
    public static final void method1669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3725++;
        if (~arg8 > arg6 || arg9 < 512 || arg8 > class72.field1144 * 512 - 1024 || arg9 > class668.field9444 * 512 - 1024) {
            class194.field2602[0] = class194.field2602[1] = -1;
            return;
        }
        int var10 = class504.method2870((byte) -116, arg9, arg8, arg2) - arg3;
        class242.field3215.method893(arg0, 0, 0);
        class332.field4821.method616(class242.field3215);
        class332.field4821.method629(arg8, var10, arg9, class194.field2602);
        class242.field3215.method893(-arg0, 0, 0);
        class332.field4821.method616(class242.field3215);
    }

    @OriginalMember(owner = "client!qu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 716)
    public final synchronized void paint(Graphics arg0) {
        field3744++;
        if (class679.field9602 != this || class233.field3079) {
            return;
        }
        class471.field6786 = true;
        if (class300.field4449 && class60.method371(false) - class311.field4579 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class173.field2443 && var2.height >= class300.field4447) {
                class128.field1845 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)V", line = 742)
    private final void method1670(boolean arg0, int arg1) {
        field3720++;
        synchronized (this) {
            if (class233.field3079) {
                return;
            }
            class233.field3079 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class551.field8116 != null) {
            class551.field8116.destroy();
        }
        try {
            this.method584(true);
        } catch (Exception var9) {
        }
        if (this.field3741) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field3741 = false;
        }
        class493.method2819(118, true);
        class28.method180((byte) 109);
        if (arg1 != 1024) {
            field3717 = 87;
        }
        if (class410.field6110 != null) {
            try {
                class410.field6110.removeFocusListener(this);
                class410.field6110.getParent().remove(class410.field6110);
            } catch (Exception var7) {
            }
        }
        if (class61.field978 != null) {
            try {
                class61.field978.method1405((byte) -75);
            } catch (Exception var6) {
            }
        }
        this.method559(96);
        if (class388.field5808 != null) {
            class388.field5808.setVisible(false);
            class388.field5808.dispose();
            class388.field5808 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!qu", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 819)
    public final void windowOpened(WindowEvent arg0) {
        field3715++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lr;Lhi;ILhh;)V", line = 826)
    public static final void method1671(class98 arg0, class415 arg1, int arg2, class168 arg3) {
        field3737++;
        class256 var4 = arg3.method1167(true, arg0);
        if (arg2 > -27) {
            field3746 = -104;
        }
        if (var4 == null) {
            return;
        }
        int var5 = var4.method48();
        if (var5 < var4.method56()) {
            var5 = var4.method56();
        }
        byte var6 = 10;
        int var7 = arg1.field6139;
        int var8 = arg1.field6146;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field2372 != null) {
            var9 = class446.field6477.method3459(null, class194.field2605, null, arg3.field2372, -50);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class194.field2605[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class267.field3489.method2545(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class267.field3489.method2549() + class267.field3489.method2547() / 2;
        }
        int var15 = var5 / 2 + arg1.field6139;
        if (var7 < class55.field858 + var5) {
            var15 = var10 / 2 + (var5 / 2 + class55.field858 - (-var6 - 5));
            var7 = class55.field858;
        } else if (var7 > class55.field862 - var5) {
            var15 = class55.field862 - (var5 / 2) - var6 - (var10 / 2) - 5;
            var7 = class55.field862 - var5;
        }
        int var16 = arg1.field6146;
        if (var8 < class55.field867 + var5) {
            var16 = var5 / 2 + class55.field867 + var6;
            var8 = class55.field867;
        } else if ((class55.field854 - var5) < var8) {
            var8 = class55.field854 - var5;
            var16 = class55.field854 - var5 / 2 - var6 - var11;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field6139), (double) (var8 - arg1.field6146)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method1527((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field2372 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2 + 5);
            var21 = var16 + class267.field3489.method2549() * var9 + 3;
            var20 = var10 + var18 + 10;
            if (arg3.field2346 != 0) {
                arg0.method710(var16, 22339, arg3.field2346, var20 - var18, var18, var21 - var16);
            }
            if (arg3.field2341 != 0) {
                arg0.method714(arg3.field2341, 12844, var21 - var16, -var18 + var20, var16, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class194.field2605[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class267.field3489.method2550(arg0, var23, var15, var16, arg3.field2360, true);
                var16 += class267.field3489.method2549();
            }
        }
        if (arg3.field2379 == -1 && arg3.field2372 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class51 var25 = new class51(arg1);
        var25.field795 = var19;
        var25.field799 = var21;
        var25.field794 = var7 - var24;
        var25.field786 = var7 + var24;
        var25.field789 = var8 - var24;
        var25.field800 = var18;
        var25.field793 = var8 + var24;
        var25.field792 = var20;
        class507.field7162.method1909(var25, (byte) -81);
    }

    @OriginalMember(owner = "client!qu", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)V")
    public abstract void method566(byte arg0);

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
    public abstract void method576(boolean arg0);

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V")
    public abstract void method584(boolean arg0);

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(B)V")
    public abstract void method578(byte arg0);

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V")
    public abstract void method559(int arg0);
}
