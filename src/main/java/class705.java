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

@OriginalClass("client!dj")
public abstract class class705 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Z")
    private boolean field9808 = false;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "Z")
    private boolean field9827 = false;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lqk;")
    public static class148 field9801 = new class148(70, 3);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field9824;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    public static int field9845;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "Z")
    public static boolean field9831;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "Z")
    public static boolean field9836;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "Z")
    public static boolean field9837;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "Z")
    public static boolean field9838;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "Z")
    public static boolean field9839;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "Z")
    public static boolean field9840;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "Z")
    public static boolean field9841;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "Z")
    public static boolean field9842;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "Z")
    public static boolean field9844;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "Z")
    public static boolean field9846;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "Z")
    public static boolean field9848;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method3960(byte arg0) {
        field9806++;
        if (arg0 != -35) {
            this.windowOpened(null);
        }
        return class389.method2365("jaclib", (byte) 106);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 14)
    public static void method3961(int arg0) {
        if (arg0 == 50) {
            field9801 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 26)
    public final AppletContext getAppletContext() {
        field9805++;
        if (class244.field3384 == null) {
            return class622.field8847 == null || class622.field8847 == this ? super.getAppletContext() : class622.field8847.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 44)
    public final void focusLost(FocusEvent arg0) {
        class345.field4403 = false;
        field9819++;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method3962(int arg0) {
        field9800++;
        return arg0 == 19111 ? class389.method2365("jagtheora", (byte) -117) : false;
    }

    @OriginalMember(owner = "client!dj", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 67)
    public static final void provideLoaderApplet(Applet arg0) {
        class622.field8847 = arg0;
        field9796++;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 75)
    private final void method3963(byte arg0) {
        field9813++;
        long var2 = class224.method1457((byte) -62);
        long var4 = class413.field5757[class693.field9693];
        class413.field5757[class693.field9693] = var2;
        class693.field9693 = class693.field9693 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class614.field8741 = class345.field4403;
        }
        int var7 = 72 % ((60 - arg0) / 49);
        this.method2684((byte) 19);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIB)Z", line = 107)
    public static final boolean method3964(int arg0, int arg1, byte arg2) {
        if (arg2 <= 66) {
            return true;
        } else {
            field9799++;
            return (class104.method702((byte) 118, arg1, arg0) | class555.method3302(arg0, 16, arg1) | class453.method2727(86, arg1, arg0)) & class321.method1875(arg0, arg1, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)Ljava/lang/String;", line = 118)
    public String method2686(byte arg0) {
        field9818++;
        int var2 = -102 % ((52 - arg0) / 53);
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)V", line = 130)
    private final void method3965(boolean arg0, int arg1) {
        field9822++;
        synchronized (this) {
            if (class518.field7227) {
                return;
            }
            if (arg1 != 24513) {
                this.field9808 = false;
            }
            class518.field7227 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class622.field8847 != null) {
            class622.field8847.destroy();
        }
        try {
            this.method2667(arg1 ^ 0x2298);
        } catch (Exception var9) {
        }
        if (this.field9827) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field9827 = false;
        }
        class301.method1763(true, -120);
        class466.method2779(false);
        if (class438.field6016 != null) {
            try {
                class438.field6016.removeFocusListener(this);
                class438.field6016.getParent().remove(class438.field6016);
            } catch (Exception var7) {
            }
        }
        if (class379.field5339 != null) {
            try {
                class379.field5339.method3591(1048576);
            } catch (Exception var6) {
            }
        }
        this.method2672((byte) 76);
        if (class244.field3384 != null) {
            class244.field3384.setVisible(false);
            class244.field3384.dispose();
            class244.field3384 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!dj", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 207)
    public final URL getCodeBase() {
        field9803++;
        if (class244.field3384 == null) {
            return class622.field8847 == null || class622.field8847 == this ? super.getCodeBase() : class622.field8847.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 225)
    public final void focusGained(FocusEvent arg0) {
        field9817++;
        class345.field4403 = true;
        class686.field9628 = true;
    }

    @OriginalMember(owner = "client!dj", name = "start", descriptor = "()V", line = 238)
    public final void start() {
        field9828++;
        if (class128.field1752 == this && !class518.field7227) {
            class455.field6266 = 0L;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 250)
    public final void method3966(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -4) {
            return;
        }
        field9814++;
        try {
            if (class128.field1752 == null) {
                class693.field9694 = arg0;
                class128.field1752 = this;
                class485.field6558 = class622.field8847;
                class614.field8750 = 0;
                class582.field8281 = arg1;
                class611.field8696 = arg1;
                class305.field3963 = 0;
                class58.field807 = arg5;
                class389.field5428 = arg5;
                class746.field10394 = class379.field5339 = new class613(arg3, arg2, arg4, class622.field8847 != null);
                class436 var8 = class379.field5339.method3580(this, arg6 + 61, 1);
                while (var8.field5975 == 0) {
                    class740.method4124(10L, 89);
                }
            } else {
                class79.field1089++;
                if (class79.field1089 >= 3) {
                    this.method3970("alreadyloaded", 10);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class233.method1495((byte) -126, var10, null);
            this.method3970("crash", 10);
        }
    }

    @OriginalMember(owner = "client!dj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 298)
    public final void windowActivated(WindowEvent arg0) {
        field9798++;
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(B)V", line = 305)
    public synchronized void method2690(byte arg0) {
        if (class438.field6016 != null) {
            class438.field6016.removeFocusListener(this);
            class438.field6016.getParent().setBackground(Color.black);
            class438.field6016.getParent().remove(class438.field6016);
        }
        field9829++;
        Container var2;
        if (class455.field6257 != null) {
            var2 = class455.field6257;
        } else if (class244.field3384 != null) {
            var2 = class244.field3384;
        } else if (class622.field8847 == null) {
            var2 = class128.field1752;
        } else {
            var2 = class622.field8847;
        }
        var2.setLayout(null);
        if (arg0 <= 21) {
            field9801 = null;
        }
        class438.field6016 = new class231(this);
        var2.add(class438.field6016);
        class438.field6016.setSize(class58.field807, class582.field8281);
        class438.field6016.setVisible(true);
        if (class244.field3384 == var2) {
            Insets var3 = class244.field3384.getInsets();
            class438.field6016.setLocation(class305.field3963 + var3.left, class614.field8750 + var3.top);
        } else {
            class438.field6016.setLocation(class305.field3963, class614.field8750);
        }
        class438.field6016.addFocusListener(this);
        class438.field6016.requestFocus();
        class614.field8741 = true;
        class345.field4403 = true;
        class686.field9628 = true;
        class626.field8944 = false;
        class298.field3888 = class224.method1457((byte) -62);
    }

    @OriginalMember(owner = "client!dj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 359)
    public final synchronized void paint(Graphics arg0) {
        field9794++;
        if (class128.field1752 != this || class518.field7227) {
            return;
        }
        class686.field9628 = true;
        if (class354.field4555 && class224.method1457((byte) -62) - class298.field3888 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class389.field5428 <= var2.width && class611.field8696 <= var2.height) {
                class626.field8944 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIILjava/lang/String;ZIII)V", line = 384)
    public final void method3967(boolean arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field9810++;
        try {
            class58.field807 = arg1;
            class389.field5428 = arg1;
            class614.field8750 = 0;
            class693.field9694 = arg7;
            class128.field1752 = this;
            class485.field6558 = null;
            class305.field3963 = 0;
            class582.field8281 = arg6;
            class611.field8696 = arg6;
            class244.field3384 = new Frame();
            class244.field3384.setTitle("Jagex");
            class244.field3384.setResizable(arg4);
            class244.field3384.addWindowListener(this);
            class244.field3384.setVisible(true);
            class244.field3384.toFront();
            Insets var9 = class244.field3384.getInsets();
            class244.field3384.setSize(class389.field5428 + var9.left + var9.right, class611.field8696 - (-var9.top - var9.bottom));
            class746.field10394 = class379.field5339 = new class613(arg5, arg3, arg2, true);
            class436 var10 = class379.field5339.method3580(this, 75, 1);
            while (var10.field5975 == 0) {
                class740.method4124(10L, 74);
            }
        } catch (Exception var12) {
            class233.method1495((byte) 52, var12, null);
        }
    }

    @OriginalMember(owner = "client!dj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 432)
    public final void windowClosing(WindowEvent arg0) {
        field9802++;
        this.destroy();
    }

    @OriginalMember(owner = "client!dj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 443)
    public final void windowIconified(WindowEvent arg0) {
        field9807++;
    }

    @OriginalMember(owner = "client!dj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 450)
    public final void windowDeactivated(WindowEvent arg0) {
        field9795++;
    }

    @OriginalMember(owner = "client!dj", name = "stop", descriptor = "()V", line = 458)
    public final void stop() {
        field9821++;
        if (class128.field1752 == this && !class518.field7227) {
            class455.field6266 = class224.method1457((byte) -62) + 4000L;
        }
    }

    @OriginalMember(owner = "client!dj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 473)
    public final String getParameter(String arg0) {
        field9824++;
        if (class244.field3384 == null) {
            return class622.field8847 == null || class622.field8847 == this ? super.getParameter(arg0) : class622.field8847.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "(B)V", line = 491)
    private final void method3968(byte arg0) {
        field9826++;
        long var2 = class224.method1457((byte) -62);
        long var4 = class583.field8289[class240.field3351];
        class583.field8289[class240.field3351] = var2;
        if (arg0 > -95) {
            this.start();
        }
        class240.field3351 = class240.field3351 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class38.field527 = ((var6 >> 1) + 32000) / var6;
        }
        if (class524.field7350++ > 50) {
            class524.field7350 -= 50;
            class686.field9628 = true;
            class438.field6016.setSize(class58.field807, class582.field8281);
            class438.field6016.setVisible(true);
            if (class244.field3384 != null && class455.field6257 == null) {
                Insets var7 = class244.field3384.getInsets();
                class438.field6016.setLocation(class305.field3963 + var7.left, class614.field8750 + var7.top);
            } else {
                class438.field6016.setLocation(class305.field3963, class614.field8750);
            }
        }
        this.method2669((byte) -27);
    }

    @OriginalMember(owner = "client!dj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 536)
    public final void windowDeiconified(WindowEvent arg0) {
        field9809++;
    }

    @OriginalMember(owner = "client!dj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 543)
    public final URL getDocumentBase() {
        field9820++;
        if (class244.field3384 == null) {
            return class622.field8847 == null || class622.field8847 == this ? super.getDocumentBase() : class622.field8847.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "run", descriptor = "()V", line = 558)
    public final void run() {
        field9816++;
        try {
            if (class613.field8724 != null) {
                String var1 = class613.field8724.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class613.field8723;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3970("wrongjava", 10);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class613.field8723 == null || class613.field8723.equals("1.4.2"))) {
                    this.method3970("wrongjava", 10);
                    return;
                }
            }
            if (class613.field8723 != null && class613.field8723.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class613.field8723.length()) {
                    char var5 = class613.field8723.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class354.field4555 = true;
                }
            }
            Applet var6 = class128.field1752;
            if (class622.field8847 != null) {
                var6 = class622.field8847;
            }
            Method var7 = class613.field8712;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class604.method3543(-20352);
            class688.method3918(100);
            this.method2690((byte) 43);
            this.method2688((byte) 123);
            class465.field6357 = class741.method4129((byte) 89);
            while (class455.field6266 == 0L || class455.field6266 > class224.method1457((byte) -62)) {
                class133.field1800 = class465.field6357.method828(35140984, class230.field3201);
                for (int var8 = 0; var8 < class133.field1800; var8++) {
                    this.method3963((byte) -26);
                }
                this.method3968((byte) -112);
                class187.method1254(class438.field6016, class379.field5339, false);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class233.method1495((byte) 38, var20, this.method2686((byte) 118));
            this.method3970("crash", 10);
        } finally {
            Object var13 = null;
            this.method3965(true, 24513);
        }
    }

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "(B)Z", line = 682)
    public final boolean method3969(byte arg0) {
        field9830++;
        if (arg0 < 48) {
            field9812 = -25;
        }
        return class389.method2365("jagmisc", (byte) 62);
    }

    @OriginalMember(owner = "client!dj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 698)
    public final void windowClosed(WindowEvent arg0) {
        field9823++;
    }

    @OriginalMember(owner = "client!dj", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 705)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field9811++;
    }

    @OriginalMember(owner = "client!dj", name = "destroy", descriptor = "()V", line = 724)
    public final void destroy() {
        field9804++;
        if (class128.field1752 == this && !class518.field7227) {
            class455.field6266 = class224.method1457((byte) -62);
            class740.method4124(5000L, 58);
            class746.field10394 = null;
            this.method3965(false, 24513);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 739)
    public final void method3970(String arg0, int arg1) {
        field9825++;
        if (arg1 != 10) {
            this.method3962(-50);
        }
        if (this.field9808) {
            return;
        }
        this.field9808 = true;
        System.out.println("error_game_" + arg0);
        try {
            class208.method1378("loggedout", class622.field8847, -9875);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!dj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 764)
    public final void windowOpened(WindowEvent arg0) {
        field9815++;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Z", line = 777)
    public final boolean method3971(int arg0) {
        field9797++;
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
            }
            this.method3970("invalidhost", 10);
            if (arg0 != -1) {
                field9812 = -121;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
    public abstract void method2688(byte arg0);

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V")
    public abstract void method2684(byte arg0);

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(B)V")
    public abstract void method2672(byte arg0);

    @OriginalMember(owner = "client!dj", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(B)V")
    public abstract void method2669(byte arg0);

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public abstract void method2667(int arg0);
}
