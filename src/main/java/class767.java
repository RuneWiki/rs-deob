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

@OriginalClass("client!au")
public abstract class class767 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!au", name = "r", descriptor = "Z")
    private boolean field10538 = false;

    @OriginalMember(owner = "client!au", name = "H", descriptor = "Z")
    private boolean field10554 = false;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field10544 = 0;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field10522;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field10524;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field10527;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field10528;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public static int field10531;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public static int field10532;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field10533;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field10534;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field10535;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field10536;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field10539;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    public static int field10542;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field10545;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "I")
    public static int field10546;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public static int field10549;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    public static int field10550;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!au", name = "G", descriptor = "I")
    public static int field10553;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "I")
    public static int field10555;

    @OriginalMember(owner = "client!au", name = "J", descriptor = "I")
    public static int field10556;

    @OriginalMember(owner = "client!au", name = "K", descriptor = "I")
    public static int field10557;

    @OriginalMember(owner = "client!au", name = "L", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!au", name = "N", descriptor = "I")
    public static int field10560;

    @OriginalMember(owner = "client!au", name = "O", descriptor = "I")
    public static int field10561;

    @OriginalMember(owner = "client!au", name = "P", descriptor = "I")
    public static int field10562;

    @OriginalMember(owner = "client!au", name = "S", descriptor = "I")
    public static int field10565;

    @OriginalMember(owner = "client!au", name = "T", descriptor = "I")
    public static int field10566;

    @OriginalMember(owner = "client!au", name = "U", descriptor = "I")
    public static int field10567;

    @OriginalMember(owner = "client!au", name = "ab", descriptor = "I")
    public static int field10573;

    @OriginalMember(owner = "client!au", name = "bb", descriptor = "I")
    public static int field10574;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "Lhh;")
    public static class140 field10537;

    @OriginalMember(owner = "client!au", name = "M", descriptor = "Z")
    public static boolean field10559;

    @OriginalMember(owner = "client!au", name = "Q", descriptor = "Z")
    public static boolean field10563;

    @OriginalMember(owner = "client!au", name = "R", descriptor = "Z")
    public static boolean field10564;

    @OriginalMember(owner = "client!au", name = "V", descriptor = "Z")
    public static boolean field10568;

    @OriginalMember(owner = "client!au", name = "W", descriptor = "Z")
    public static boolean field10569;

    @OriginalMember(owner = "client!au", name = "X", descriptor = "Z")
    public static boolean field10570;

    @OriginalMember(owner = "client!au", name = "Y", descriptor = "Z")
    public static boolean field10571;

    @OriginalMember(owner = "client!au", name = "Z", descriptor = "Z")
    public static boolean field10572;

    @OriginalMember(owner = "client!au", name = "cb", descriptor = "Z")
    public static boolean field10575;

    @OriginalMember(owner = "client!au", name = "db", descriptor = "Z")
    public static boolean field10576;

    @OriginalMember(owner = "client!au", name = "eb", descriptor = "Z")
    public static boolean field10577;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "[[[Z")
    public static boolean[][][] field10529;

    @OriginalMember(owner = "client!au", name = "destroy", descriptor = "()V", line = 3)
    public final void destroy() {
        field10528++;
        if (class468.field6609 == this && !class746.field10063) {
            class210.field2702 = class401.method2440(false);
            class171.method1152(5000L, false);
            class58.field762 = null;
            this.method4221((byte) 73, false);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 23)
    public final void method4215(String arg0, int arg1) {
        field10535++;
        if (this.field10538) {
            return;
        }
        this.field10538 = true;
        System.out.println("error_game_" + arg0);
        try {
            class376.method2358(class552.field7624, 3860, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg1 != 1000) {
            field10537 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Z", line = 49)
    public final boolean method4216(int arg0) {
        if (arg0 != 32387) {
            this.windowActivated(null);
        }
        field10539++;
        return class289.method1854((byte) 65, "jaclib");
    }

    @OriginalMember(owner = "client!au", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 61)
    public final void focusLost(FocusEvent arg0) {
        class465.field6594 = false;
        field10536++;
    }

    @OriginalMember(owner = "client!au", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 69)
    public final void windowOpened(WindowEvent arg0) {
        field10522++;
    }

    @OriginalMember(owner = "client!au", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 77)
    public final AppletContext getAppletContext() {
        field10542++;
        if (class639.field8606 == null) {
            return class552.field7624 == null || class552.field7624 == this ? super.getAppletContext() : class552.field7624.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V", line = 94)
    public static final void method4217(int arg0, int arg1) {
        field10526++;
        int var2 = class572.field7788 - class126.field1724;
        if (var2 >= 100) {
            class609.field8242 = -1;
            class702.field9303 = -1;
            class697.field9252 = 1;
            return;
        }
        int var3 = (int) class294.field4169;
        if (var3 < class335.field4729 >> 8) {
            var3 = class335.field4729 >> 8;
        }
        if (class422.field6068[4] && var3 < (class572.field7795[4] + 128)) {
            var3 = class572.field7795[4] + 128;
        }
        int var4 = (int) class514.field7144 + class571.field7780 & arg1;
        class476.method2823(100, (var3 >> 3) * 3 + 600 << 2, var3, var4, class400.field5722, class439.field6328, arg0, class778.method4273(class625.field8475.field2810, (byte) -72, class625.field8475.field2802, class184.field2420) - 200);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class269.field3926 = (int) ((float) (class269.field3926 - class194.field2520) * var5 + (float) class194.field2520);
        class435.field6273 = (int) ((float) (class435.field6273 - class500.field7000) * var5 + (float) class500.field7000);
        class74.field1000 = (int) ((float) (class74.field1000 - class446.field6420) * var5 + (float) class446.field6420);
        class223.field2892 = (int) ((float) (class223.field2892 - class4.field29) * var5 + (float) class4.field29);
        int var6 = class41.field442 - class692.field9220;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class41.field442 = (int) ((float) var6 * var5 + (float) class692.field9220);
        class41.field442 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V", line = 142)
    public static void method4218(int arg0) {
        if (arg0 == 10) {
            field10537 = null;
            field10529 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 154)
    public static final void provideLoaderApplet(Applet arg0) {
        field10533++;
        class552.field7624 = arg0;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Z", line = 163)
    public final boolean method4219(byte arg0) {
        field10534++;
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
            if (arg0 != 48) {
                field10537 = null;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method4215("invalidhost", 1000);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 199)
    public final URL getDocumentBase() {
        field10530++;
        if (class639.field8606 == null) {
            return class552.field7624 == null || class552.field7624 == this ? super.getDocumentBase() : class552.field7624.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZILjava/lang/String;IIIII)V", line = 216)
    public final void method4220(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class589.field8043 = 0;
            class115.field1559 = arg4;
            class460.field6558 = arg7;
            class358.field5218 = arg7;
            class21.field194 = null;
            class693.field9222 = arg5;
            class482.field6754 = arg5;
            class523.field7268 = 0;
            class468.field6609 = this;
            class639.field8606 = new Frame();
            class639.field8606.setTitle("Jagex");
            class639.field8606.setResizable(true);
            class639.field8606.addWindowListener(this);
            class639.field8606.setVisible(true);
            class639.field8606.toFront();
            int var9 = 56 % ((77 - arg3) / 46);
            Insets var10 = class639.field8606.getInsets();
            class639.field8606.setSize(class358.field5218 - (-var10.left - var10.right), var10.top + var10.bottom + class482.field6754);
            class58.field762 = class786.field10800 = new class248(arg6, arg2, arg1, true);
            class621 var11 = class786.field10800.method1538(this, (byte) -56, 1);
            while (var11.field8405 == 0) {
                class171.method1152(10L, false);
            }
        } catch (Exception var13) {
            class607.method3379(null, var13, true);
        }
        field10525++;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BZ)V", line = 257)
    private final void method4221(byte arg0, boolean arg1) {
        field10521++;
        synchronized (this) {
            if (class746.field10063) {
                return;
            }
            class746.field10063 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class552.field7624 != null) {
            class552.field7624.destroy();
        }
        try {
            this.method2057(82);
        } catch (Exception var10) {
        }
        if (this.field10554) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field10554 = false;
        }
        int var4 = -87 / ((arg0 + 6) / 58);
        class766.method4213(true, -128);
        class507.method2950(0);
        if (class669.field8962 != null) {
            try {
                class669.field8962.removeFocusListener(this);
                class669.field8962.getParent().remove(class669.field8962);
            } catch (Exception var8) {
            }
        }
        if (class786.field10800 != null) {
            try {
                class786.field10800.method1549(14909);
            } catch (Exception var7) {
            }
        }
        this.method2051(true);
        if (class639.field8606 != null) {
            class639.field8606.setVisible(false);
            class639.field8606.dispose();
            class639.field8606 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!au", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 329)
    public final synchronized void paint(Graphics arg0) {
        field10551++;
        if (class468.field6609 != this || class746.field10063) {
            return;
        }
        class317.field4490 = true;
        if (class537.field7441 && (class401.method2440(false) - class651.field8778) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class358.field5218 <= var2.width && var2.height >= class482.field6754) {
                class319.field4532 = true;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 361)
    public final void windowIconified(WindowEvent arg0) {
        field10546++;
    }

    @OriginalMember(owner = "client!au", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 371)
    public final void windowClosed(WindowEvent arg0) {
        field10556++;
    }

    @OriginalMember(owner = "client!au", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 379)
    public final String getParameter(String arg0) {
        field10557++;
        if (class639.field8606 == null) {
            return class552.field7624 == null || class552.field7624 == this ? super.getParameter(arg0) : class552.field7624.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "(I)Z", line = 407)
    public final boolean method4222(int arg0) {
        int var2 = 65 / ((arg0 - 63) / 49);
        field10543++;
        return class289.method1854((byte) -106, "jagmisc");
    }

    @OriginalMember(owner = "client!au", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 418)
    public final void focusGained(FocusEvent arg0) {
        field10549++;
        class465.field6594 = true;
        class317.field4490 = true;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIZILjava/lang/String;I)V", line = 427)
    public final void method4223(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5, int arg6) {
        field10524++;
        try {
            if (class468.field6609 != null) {
                class518.field7219++;
                if (class518.field7219 >= 3) {
                    this.method4215("alreadyloaded", 1000);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            } else if (arg3) {
                class589.field8043 = 0;
                class523.field7268 = 0;
                class115.field1559 = arg6;
                class693.field9222 = arg4;
                class482.field6754 = arg4;
                class21.field194 = class552.field7624;
                class468.field6609 = this;
                class460.field6558 = arg1;
                class358.field5218 = arg1;
                class58.field762 = class786.field10800 = new class248(arg2, arg5, arg0, class552.field7624 != null);
                class621 var8 = class786.field10800.method1538(this, (byte) -106, 1);
                while (var8.field8405 == 0) {
                    class171.method1152(10L, false);
                }
            }
        } catch (Throwable var10) {
            class607.method3379(null, var10, arg3);
            this.method4215("crash", 1000);
        }
    }

    @OriginalMember(owner = "client!au", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 476)
    public final void update(Graphics arg0) {
        field10532++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(B)Z", line = 487)
    public final boolean method4224(byte arg0) {
        field10541++;
        return arg0 < 91 ? false : class289.method1854((byte) 24, "jagtheora");
    }

    @OriginalMember(owner = "client!au", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 498)
    public final URL getCodeBase() {
        field10523++;
        if (class639.field8606 == null) {
            return class552.field7624 == null || class552.field7624 == this ? super.getCodeBase() : class552.field7624.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 514)
    public final void windowActivated(WindowEvent arg0) {
        field10540++;
    }

    @OriginalMember(owner = "client!au", name = "run", descriptor = "()V", line = 524)
    public final void run() {
        field10553++;
        try {
            if (class248.field3246 != null) {
                String var1 = class248.field3246.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class248.field3250;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method4215("wrongjava", 1000);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class248.field3250 == null || class248.field3250.equals("1.4.2"))) {
                    this.method4215("wrongjava", 1000);
                    return;
                }
            }
            if (class248.field3250 != null && class248.field3250.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class248.field3250.length()) {
                    char var5 = class248.field3250.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class537.field7441 = true;
                }
            }
            Applet var6 = class468.field6609;
            if (class552.field7624 != null) {
                var6 = class552.field7624;
            }
            Method var7 = class248.field3243;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class645.method3572(-57);
            class351.method2241(14);
            this.method2039((byte) -23);
            this.method2043(40000);
            class719.field9773 = class735.method4050((byte) 3);
            while (class210.field2702 == 0L || class401.method2440(false) < class210.field2702) {
                class477.field6696 = class719.field9773.method3443(class674.field9021, (byte) 113);
                for (int var8 = 0; var8 < class477.field6696; var8++) {
                    this.method4225((byte) -23);
                }
                this.method4226(0);
                class265.method1778(-51, class669.field8962, class786.field10800);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class607.method3379(this.method2031(-31064), var20, true);
            this.method4215("crash", 1000);
        } finally {
            Object var13 = null;
            this.method4221((byte) -118, true);
        }
    }

    @OriginalMember(owner = "client!au", name = "f", descriptor = "(I)Ljava/lang/String;", line = 645)
    public String method2031(int arg0) {
        if (arg0 != -31064) {
            field10544 = -122;
        }
        field10527++;
        return null;
    }

    @OriginalMember(owner = "client!au", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 656)
    public final void windowDeactivated(WindowEvent arg0) {
        field10531++;
    }

    @OriginalMember(owner = "client!au", name = "start", descriptor = "()V", line = 665)
    public final void start() {
        field10547++;
        if (class468.field6609 == this && !class746.field10063) {
            class210.field2702 = 0L;
        }
    }

    @OriginalMember(owner = "client!au", name = "stop", descriptor = "()V", line = 679)
    public final void stop() {
        field10548++;
        if (class468.field6609 == this && !class746.field10063) {
            class210.field2702 = class401.method2440(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!au", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 693)
    public final void windowClosing(WindowEvent arg0) {
        field10550++;
        this.destroy();
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(B)V", line = 701)
    private final void method4225(byte arg0) {
        field10552++;
        long var2 = class401.method2440(false);
        long var4 = class384.field5584[class56.field670];
        class384.field5584[class56.field670] = var2;
        class56.field670 = class56.field670 + 1 & 0x1F;
        if (arg0 != -23) {
            field10537 = null;
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class95.field1347 = class465.field6594;
        }
        this.method2054((byte) 70);
    }

    @OriginalMember(owner = "client!au", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 733)
    public final void windowDeiconified(WindowEvent arg0) {
        field10555++;
    }

    @OriginalMember(owner = "client!au", name = "g", descriptor = "(I)V", line = 741)
    private final void method4226(int arg0) {
        field10545++;
        long var2 = class401.method2440(false);
        long var4 = class83.field1166[class538.field7450];
        class83.field1166[class538.field7450] = var2;
        class538.field7450 = class538.field7450 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class697.field9248 = ((var6 >> 1) + 32000) / var6;
        }
        if (class515.field7184++ > 50) {
            class317.field4490 = true;
            class515.field7184 -= 50;
            class669.field8962.setSize(class460.field6558, class693.field9222);
            class669.field8962.setVisible(true);
            if (class639.field8606 != null && class393.field5661 == null) {
                Insets var7 = class639.field8606.getInsets();
                class669.field8962.setLocation(class523.field7268 + var7.left, class589.field8043 + var7.top);
            } else {
                class669.field8962.setLocation(class523.field7268, class589.field8043);
            }
        }
        this.method2038(true);
        if (arg0 != 0) {
            this.windowClosed(null);
        }
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "(B)V", line = 785)
    public synchronized void method2039(byte arg0) {
        field10558++;
        if (class669.field8962 != null) {
            class669.field8962.removeFocusListener(this);
            class669.field8962.getParent().setBackground(Color.black);
            class669.field8962.getParent().remove(class669.field8962);
        }
        Container var2;
        if (class393.field5661 != null) {
            var2 = class393.field5661;
        } else if (class639.field8606 != null) {
            var2 = class639.field8606;
        } else if (class552.field7624 == null) {
            var2 = class468.field6609;
        } else {
            var2 = class552.field7624;
        }
        var2.setLayout(null);
        if (arg0 != -23) {
            this.field10538 = true;
        }
        class669.field8962 = new class712(this);
        var2.add(class669.field8962);
        class669.field8962.setSize(class460.field6558, class693.field9222);
        class669.field8962.setVisible(true);
        if (class639.field8606 == var2) {
            Insets var3 = class639.field8606.getInsets();
            class669.field8962.setLocation(class523.field7268 + var3.left, class589.field8043 + var3.top);
        } else {
            class669.field8962.setLocation(class523.field7268, class589.field8043);
        }
        class669.field8962.addFocusListener(this);
        class669.field8962.requestFocus();
        class95.field1347 = true;
        class465.field6594 = true;
        class317.field4490 = true;
        class319.field4532 = false;
        class651.field8778 = class401.method2440(false);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public abstract void method2057(int arg0);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
    public abstract void method2051(boolean arg0);

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
    public abstract void method2054(byte arg0);

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V")
    public abstract void method2043(int arg0);

    @OriginalMember(owner = "client!au", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)V")
    public abstract void method2038(boolean arg0);
}
