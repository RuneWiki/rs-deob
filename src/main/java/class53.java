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

@OriginalClass("client!gv")
public abstract class class53 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "Z")
    private boolean field787 = false;

    @OriginalMember(owner = "client!gv", name = "F", descriptor = "Z")
    private boolean field812 = false;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public static int field795 = 2;

    @OriginalMember(owner = "client!gv", name = "M", descriptor = "[I")
    public static int[] field819 = new int[100];

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "Liu;")
    public static class390 field806 = new class390(83, 8);

    @OriginalMember(owner = "client!gv", name = "O", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!gv", name = "A", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!gv", name = "B", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!gv", name = "G", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!gv", name = "I", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!gv", name = "J", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!gv", name = "K", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!gv", name = "L", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!gv", name = "S", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!gv", name = "N", descriptor = "Lke;")
    public static class406 field820;

    @OriginalMember(owner = "client!gv", name = "P", descriptor = "Z")
    public static boolean field822;

    @OriginalMember(owner = "client!gv", name = "Q", descriptor = "Z")
    public static boolean field823;

    @OriginalMember(owner = "client!gv", name = "R", descriptor = "Z")
    public static boolean field824;

    @OriginalMember(owner = "client!gv", name = "T", descriptor = "Z")
    public static boolean field826;

    @OriginalMember(owner = "client!gv", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 6)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field810++;
    }

    @OriginalMember(owner = "client!gv", name = "destroy", descriptor = "()V", line = 24)
    public final void destroy() {
        field796++;
        if (class190.field2699 == this && !class391.field5797) {
            class259.field3713 = class109.method653(false);
            class322.method1935(true, 5000L);
            class259.field3712 = null;
            this.method403(false, false);
        }
    }

    @OriginalMember(owner = "client!gv", name = "start", descriptor = "()V", line = 38)
    public final void start() {
        field813++;
        if (class190.field2699 == this && !class391.field5797) {
            class259.field3713 = 0L;
        }
    }

    @OriginalMember(owner = "client!gv", name = "providesignlink", descriptor = "(Lqn;)V", line = 50)
    public static final void providesignlink(class44 arg0) {
        class86.field1182 = arg0;
        class259.field3712 = arg0;
        field798++;
    }

    @OriginalMember(owner = "client!gv", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 60)
    public final synchronized void paint(Graphics arg0) {
        field793++;
        if (class190.field2699 != this || class391.field5797) {
            return;
        }
        class442.field6466 = true;
        if (class211.field2991 && (class109.method653(false) - class17.field242) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class452.field6577 && var2.height >= class380.field5667) {
                class115.field1479 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIII)V", line = 89)
    public final void method392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field805++;
        try {
            if (class190.field2699 == null) {
                if (arg4 != -25607) {
                    field819 = null;
                }
                class190.field2699 = this;
                class103.field1387 = 0;
                class207.field2874 = arg0;
                class380.field5667 = arg0;
                class223.field3156 = arg2;
                class452.field6577 = arg2;
                class323.field4734 = 0;
                class95.field1273 = arg3;
                if (class86.field1182 == null) {
                    class259.field3712 = class86.field1182 = new class44(this, arg1, null, 0);
                }
                class439 var6 = class86.field1182.method332(this, arg4 + 25609, 1);
                while (var6.field6417 == 0) {
                    class322.method1935(true, 10L);
                }
            } else {
                class324.field4741++;
                if (class324.field4741 >= 3) {
                    this.method408("alreadyloaded", true);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class356.method2169(var8, null, (byte) 34);
            this.method408("crash", true);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLts;B)V", line = 136)
    public static final void method393(boolean arg0, class356 arg1, byte arg2) {
        field817++;
        int var3 = arg1.field5147 == 0 ? arg1.field5168 : arg1.field5147;
        int var4 = arg1.field5235 == 0 ? arg1.field5169 : arg1.field5235;
        class376.method2279(var4, arg0, var3, class181.field2591[arg1.field5185 >> 16], arg1.field5185, (byte) 121);
        if (arg1.field5151 != null) {
            class376.method2279(var4, arg0, var3, arg1.field5151, arg1.field5185, (byte) -18);
        }
        class311 var5 = (class311) class213.field3010.method2310((byte) 94, (long) arg1.field5185);
        if (var5 != null) {
            class334.method2018(arg0, var4, var3, var5.field4525, 27714);
        }
        if (arg2 != -81) {
            method404(-19);
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V", line = 161)
    public final void method394(int arg0) {
        field802++;
        if (arg0 != -22907) {
            field819 = null;
        }
        if (this.field812) {
            return;
        }
        try {
            class439 var2 = class86.field1182.method342(class190.field2699.getClass(), (byte) 64);
            while (var2.field6417 == 0) {
                class322.method1935(true, 100L);
            }
            if (var2.field6416 != null) {
                throw (Throwable) var2.field6416;
            }
            jagmisc.init();
            this.field812 = true;
            class298.field4335 = class325.method1949(false);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!gv", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 194)
    public final void windowClosing(WindowEvent arg0) {
        field800++;
        this.destroy();
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V", line = 203)
    public static void method395(boolean arg0) {
        field819 = null;
        field820 = null;
        field806 = null;
        if (!arg0) {
            providesignlink(null);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLhe;)V", line = 215)
    public static final void method396(boolean arg0, class239 arg1) {
        field799++;
        class110.field1444 = 0;
        if (arg0) {
            field806 = null;
        }
        class354.field5115 = 0;
        class156.field1989 = new class30();
        class173.field2373 = new class241[1024];
        class33.method280(-4924, arg1);
        class54.method413(arg1, (byte) 12);
    }

    @OriginalMember(owner = "client!gv", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 231)
    public final URL getDocumentBase() {
        field788++;
        if (class75.field1066 == null) {
            return class86.field1182 == null || class86.field1182.field668 == this ? super.getDocumentBase() : class86.field1182.field668.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 247)
    public final void windowClosed(WindowEvent arg0) {
        field794++;
    }

    @OriginalMember(owner = "client!gv", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 254)
    public final void focusGained(FocusEvent arg0) {
        field809++;
        class30.field511 = true;
        class442.field6466 = true;
    }

    @OriginalMember(owner = "client!gv", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 263)
    public final String getParameter(String arg0) {
        field786++;
        if (class75.field1066 == null) {
            return class86.field1182 == null || class86.field1182.field668 == this ? super.getParameter(arg0) : class86.field1182.field668.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 280)
    public final void windowDeiconified(WindowEvent arg0) {
        field797++;
    }

    @OriginalMember(owner = "client!gv", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 289)
    public final void focusLost(FocusEvent arg0) {
        field818++;
        class30.field511 = false;
    }

    @OriginalMember(owner = "client!gv", name = "stop", descriptor = "()V", line = 303)
    public final void stop() {
        field791++;
        if (class190.field2699 == this && !class391.field5797) {
            class259.field3713 = class109.method653(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V", line = 316)
    public static final void method397(byte arg0) {
        field816++;
        class507.field7737.method38((byte) -9);
        if (arg0 != 2) {
            method397((byte) -88);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLjava/lang/String;IIIIII)V", line = 328)
    public final void method398(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class223.field3156 = arg5;
            class452.field6577 = arg5;
            class323.field4734 = 0;
            class207.field2874 = arg4;
            class380.field5667 = arg4;
            class190.field2699 = this;
            class95.field1273 = arg2;
            class103.field1387 = 0;
            class75.field1066 = new Frame();
            class75.field1066.setTitle("Jagex");
            class75.field1066.setResizable(true);
            class75.field1066.addWindowListener(this);
            if (arg6 != -25609) {
                this.focusLost(null);
            }
            class75.field1066.setVisible(true);
            class75.field1066.toFront();
            Insets var9 = class75.field1066.getInsets();
            class75.field1066.setSize(var9.right + var9.left + class452.field6577, class380.field5667 + var9.top + var9.bottom);
            class259.field3712 = class86.field1182 = new class44(null, arg3, arg1, arg7);
            class439 var10 = class86.field1182.method332(this, 2, 1);
            while (var10.field6417 == 0) {
                class322.method1935(true, 10L);
            }
        } catch (Exception var12) {
            class356.method2169(var12, null, (byte) 34);
        }
        field801++;
    }

    @OriginalMember(owner = "client!gv", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 369)
    public final URL getCodeBase() {
        field815++;
        if (class75.field1066 == null) {
            return class86.field1182 == null || class86.field1182.field668 == this ? super.getCodeBase() : class86.field1182.field668.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V", line = 386)
    private final void method399(byte arg0) {
        field811++;
        long var2 = class109.method653(false);
        long var4 = class278.field3966[class202.field2808];
        class278.field3966[class202.field2808] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 <= 107) {
            field819 = null;
        }
        class202.field2808 = class202.field2808 + 1 & 0x1F;
        synchronized (this) {
            class145.field1886 = class30.field511;
        }
        this.method401(-28451);
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "(B)V", line = 417)
    public static final void method400(byte arg0) {
        if (class121.field1587 != null) {
            class121.field1587.method1706(85);
        }
        field783++;
        if (arg0 != -71) {
            field821 = 39;
        }
        if (class342.field4970 != null) {
            class342.field4970.method1706(arg0 + 182);
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(Z)V", line = 440)
    public final synchronized void method402(boolean arg0) {
        field814++;
        if (class498.field7590 != null) {
            class498.field7590.removeFocusListener(this);
            class498.field7590.getParent().remove(class498.field7590);
        }
        Container var2;
        if (class217.field3043 != null) {
            var2 = class217.field3043;
        } else if (class75.field1066 == null) {
            var2 = class86.field1182.field668;
        } else {
            var2 = class75.field1066;
        }
        var2.setLayout(null);
        class498.field7590 = new class226(this);
        var2.add(class498.field7590);
        class498.field7590.setSize(class223.field3156, class207.field2874);
        class498.field7590.setVisible(true);
        if (class75.field1066 == var2) {
            Insets var3 = class75.field1066.getInsets();
            class498.field7590.setLocation(class103.field1387 + var3.left, class323.field4734 + var3.top);
        } else {
            class498.field7590.setLocation(class103.field1387, class323.field4734);
        }
        class498.field7590.addFocusListener(this);
        class498.field7590.requestFocus();
        class30.field511 = true;
        class145.field1886 = arg0;
        class442.field6466 = true;
        class115.field1479 = false;
        class17.field242 = class109.method653(!arg0);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZZ)V", line = 484)
    private final void method403(boolean arg0, boolean arg1) {
        field804++;
        synchronized (this) {
            if (class391.field5797) {
                return;
            }
            class391.field5797 = true;
        }
        if (class86.field1182.field668 != null) {
            class86.field1182.field668.destroy();
        }
        try {
            this.method405((byte) 36);
        } catch (Exception var11) {
        }
        if (this.field812) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field812 = false;
        }
        class439 var4 = class86.field1182.method324(class190.field2699.getClass(), arg0);
        while (var4.field6417 == 0) {
            class322.method1935(!arg0, 100L);
        }
        if (class498.field7590 != null) {
            try {
                class498.field7590.removeFocusListener(this);
                class498.field7590.getParent().remove(class498.field7590);
            } catch (Exception var9) {
            }
        }
        if (class86.field1182 != null) {
            try {
                class86.field1182.method331(79);
            } catch (Exception var8) {
            }
        }
        this.method391((byte) -32);
        if (class75.field1066 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)Z", line = 559)
    public static final boolean method404(int arg0) {
        field785++;
        class262 var1 = (class262) class230.field3220.field5018.field1173;
        if (var1 == null || class230.field3220.field5018 == var1) {
            return false;
        }
        if (var1.field3737 >= 2000) {
            var1.field3737 -= 2000;
        }
        if (var1.field3737 == 1011) {
            return true;
        } else {
            if (arg0 != -1) {
                method404(15);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gv", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 582)
    public final void windowDeactivated(WindowEvent arg0) {
        field784++;
    }

    @OriginalMember(owner = "client!gv", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 598)
    public final AppletContext getAppletContext() {
        field808++;
        if (class75.field1066 == null) {
            return class86.field1182 == null || class86.field1182.field668 == this ? super.getAppletContext() : class86.field1182.field668.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 620)
    public final void windowActivated(WindowEvent arg0) {
        field807++;
    }

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "(I)V", line = 627)
    private final void method406(int arg0) {
        field781++;
        long var2 = class109.method653(false);
        long var4 = class14.field213[class460.field6691];
        class14.field213[class460.field6691] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class35.field556 = ((var6 >> 1) + 32000) / var6;
        }
        class460.field6691 = class460.field6691 + 1 & arg0;
        if ((class95.field1281++) > 50) {
            class95.field1281 -= 50;
            class442.field6466 = true;
            class498.field7590.setSize(class223.field3156, class207.field2874);
            class498.field7590.setVisible(true);
            if (class75.field1066 != null && class217.field3043 == null) {
                Insets var7 = class75.field1066.getInsets();
                class498.field7590.setLocation(var7.left + class103.field1387, class323.field4734 + var7.top);
            } else {
                class498.field7590.setLocation(class103.field1387, class323.field4734);
            }
        }
        this.method407(0);
    }

    @OriginalMember(owner = "client!gv", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 668)
    public final void windowIconified(WindowEvent arg0) {
        field790++;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 681)
    public final void method408(String arg0, boolean arg1) {
        field782++;
        if (this.field787) {
            return;
        }
        this.field787 = arg1;
        System.out.println("error_game_" + arg0);
        try {
            class123.method697((byte) 124, "loggedout", class86.field1182.field668);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!gv", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 705)
    public final void windowOpened(WindowEvent arg0) {
        field789++;
    }

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)Z", line = 721)
    public final boolean method409(int arg0) {
        field803++;
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
            this.method408("invalidhost", true);
            if (arg0 > -58) {
                this.run();
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gv", name = "run", descriptor = "()V", line = 758)
    public final void run() {
        try {
            label108: {
                if (class44.field659 != null) {
                    String var1 = class44.field659.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class44.field669;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method408("wrongjava", true);
                            break label108;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class44.field669 == null || class44.field669.equals("1.4.2"))) {
                        this.method408("wrongjava", true);
                        break label108;
                    }
                }
                if (class44.field669 != null && class44.field669.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class44.field669.length() > var3) {
                        char var5 = class44.field669.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class211.field2991 = true;
                    }
                }
                if (class86.field1182.field668 != null) {
                    Method var6 = class44.field676;
                    if (var6 != null) {
                        try {
                            var6.invoke(class86.field1182.field668, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class342.method2072(true);
                class274.method1682(false);
                this.method402(true);
                this.method390(-30681);
                class298.field4335 = class325.method1949(false);
                this.method394(-22907);
                while (class259.field3713 == 0L || class109.method653(false) < class259.field3713) {
                    class91.field1246 = class298.field4335.method238(100, class406.field5965);
                    for (int var7 = 0; var7 < class91.field1246; var7++) {
                        this.method399((byte) 112);
                    }
                    this.method406(31);
                    class445.method2599(class498.field7590, -7105, class86.field1182);
                }
            }
        } catch (Throwable var10) {
            class356.method2169(var10, null, (byte) 34);
            this.method408("crash", true);
        }
        field792++;
        this.method403(false, true);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public abstract void method390(int arg0);

    @OriginalMember(owner = "client!gv", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public abstract void method391(byte arg0);

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)V")
    public abstract void method401(int arg0);

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "(B)V")
    public abstract void method405(byte arg0);

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "(I)V")
    public abstract void method407(int arg0);
}
