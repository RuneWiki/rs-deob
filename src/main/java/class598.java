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

@OriginalClass("client!lca")
public abstract class class598 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "Z")
    private boolean field8494 = false;

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "Z")
    private boolean field8497 = false;

    @OriginalMember(owner = "client!lca", name = "C", descriptor = "I")
    public static int field8498 = 0;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!lca", name = "A", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!lca", name = "D", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!lca", name = "E", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!lca", name = "F", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!lca", name = "G", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!lca", name = "H", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!lca", name = "I", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!lca", name = "J", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!lca", name = "L", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!lca", name = "M", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!lca", name = "O", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!lca", name = "P", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!lca", name = "R", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!lca", name = "S", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!lca", name = "W", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!lca", name = "Z", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field8470;

    @OriginalMember(owner = "client!lca", name = "N", descriptor = "Z")
    public static boolean field8508;

    @OriginalMember(owner = "client!lca", name = "Q", descriptor = "Z")
    public static boolean field8511;

    @OriginalMember(owner = "client!lca", name = "T", descriptor = "Z")
    public static boolean field8514;

    @OriginalMember(owner = "client!lca", name = "U", descriptor = "Z")
    public static boolean field8515;

    @OriginalMember(owner = "client!lca", name = "V", descriptor = "Z")
    public static boolean field8516;

    @OriginalMember(owner = "client!lca", name = "X", descriptor = "Z")
    public static boolean field8518;

    @OriginalMember(owner = "client!lca", name = "Y", descriptor = "Z")
    public static boolean field8519;

    @OriginalMember(owner = "client!lca", name = "ab", descriptor = "Z")
    public static boolean field8521;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "[Lpca;")
    public static class665[] field8488;

    @OriginalMember(owner = "client!lca", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6)
    public final void windowActivated(WindowEvent arg0) {
        field8481++;
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V", line = 14)
    private final void method3485(int arg0) {
        field8478++;
        long var2 = class112.method1033(-11752);
        long var4 = class485.field7106[class424.field6451];
        class485.field7106[class424.field6451] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 >= -14) {
            return;
        }
        class424.field6451 = class424.field6451 + 1 & 0x1F;
        synchronized (this) {
            class437.field6669 = class636.field8939;
        }
        this.method1937(124);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V", line = 47)
    public synchronized void method1946(boolean arg0) {
        if (class271.field4377 != null) {
            class271.field4377.removeFocusListener(this);
            class271.field4377.getParent().setBackground(Color.black);
            class271.field4377.getParent().remove(class271.field4377);
        }
        field8485++;
        Container var2;
        if (class476.field7061 != null) {
            var2 = class476.field7061;
        } else if (field8470 != null) {
            var2 = field8470;
        } else if (class450.field6772 == null) {
            var2 = class64.field825;
        } else {
            var2 = class450.field6772;
        }
        var2.setLayout(null);
        class271.field4377 = new class396(this);
        var2.add(class271.field4377);
        class271.field4377.setSize(class56.field732, class259.field4147);
        class271.field4377.setVisible(true);
        if (field8470 == var2) {
            Insets var3 = field8470.getInsets();
            class271.field4377.setLocation(var3.left + class290.field4596, var3.top - -class425.field6468);
        } else {
            class271.field4377.setLocation(class290.field4596, class425.field6468);
        }
        class271.field4377.addFocusListener(this);
        class271.field4377.requestFocus();
        class437.field6669 = true;
        class636.field8939 = true;
        class245.field3910 = true;
        class335.field5479 = arg0;
        class68.field872 = class112.method1033(-11752);
    }

    @OriginalMember(owner = "client!lca", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 97)
    public final void update(Graphics arg0) {
        field8479++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!lca", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 107)
    public final AppletContext getAppletContext() {
        field8476++;
        if (field8470 == null) {
            return class450.field6772 == null || class450.field6772 == this ? super.getAppletContext() : class450.field6772.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 123)
    public final synchronized void paint(Graphics arg0) {
        field8480++;
        if (class64.field825 != this || class634.field8909) {
            return;
        }
        class245.field3910 = true;
        if (class418.field6405 && (class112.method1033(-11752) - class68.field872) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class235.field3727 <= var2.width && class101.field1659 <= var2.height) {
                class335.field5479 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZZIIILjava/lang/String;I)V", line = 146)
    public final void method3486(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field8473++;
        try {
            class56.field732 = arg0;
            class235.field3727 = arg0;
            class290.field4596 = 0;
            class64.field825 = this;
            class259.field4147 = arg7;
            class101.field1659 = arg7;
            class425.field6468 = 0;
            class166.field2794 = null;
            class591.field8392 = arg3;
            field8470 = new Frame();
            field8470.setTitle("Jagex");
            field8470.setResizable(true);
            field8470.addWindowListener(this);
            field8470.setVisible(true);
            field8470.toFront();
            Insets var9 = field8470.getInsets();
            field8470.setSize(class235.field3727 - (-var9.right - var9.left), class101.field1659 + var9.bottom - -var9.top);
            class546.field7949 = class402.field6207 = new class525(arg5, arg6, arg4, true);
            class701 var10 = class402.field6207.method3180(this, arg1, 1);
            while (var10.field9884 == 0) {
                class549.method3313(10L, 126);
            }
        } catch (Exception var12) {
            class660.method3790(10216, var12, null);
        }
    }

    @OriginalMember(owner = "client!lca", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 187)
    public final URL getCodeBase() {
        field8499++;
        if (field8470 == null) {
            return class450.field6772 == null || class450.field6772 == this ? super.getCodeBase() : class450.field6772.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 203)
    public static final void provideLoaderApplet(Applet arg0) {
        class450.field6772 = arg0;
        field8496++;
    }

    @OriginalMember(owner = "client!lca", name = "stop", descriptor = "()V", line = 212)
    public final void stop() {
        field8507++;
        if (class64.field825 == this && !class634.field8909) {
            class245.field3905 = class112.method1033(-11752) + 4000L;
        }
    }

    @OriginalMember(owner = "client!lca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 229)
    public final void focusLost(FocusEvent arg0) {
        class636.field8939 = false;
        field8493++;
    }

    @OriginalMember(owner = "client!lca", name = "destroy", descriptor = "()V", line = 238)
    public final void destroy() {
        field8502++;
        if (class64.field825 == this && !class634.field8909) {
            class245.field3905 = class112.method1033(-11752);
            class549.method3313(5000L, 127);
            class546.field7949 = null;
            this.method3492(false, 117);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 264)
    public final void method3487(boolean arg0, String arg1) {
        field8489++;
        if (this.field8497) {
            return;
        }
        this.field8497 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            class358.method2403("loggedout", class450.field6772, -29103);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "(I)Z", line = 286)
    public final boolean method3488(int arg0) {
        field8487++;
        return arg0 == -4744 ? class106.method1005("jagmisc", (byte) -81) : true;
    }

    @OriginalMember(owner = "client!lca", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 299)
    public final void windowDeiconified(WindowEvent arg0) {
        field8505++;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V", line = 307)
    private final void method3489(byte arg0) {
        field8490++;
        int var2 = -42 % ((-arg0 - 4) / 35);
        long var3 = class112.method1033(-11752);
        long var5 = class426.field6471[class354.field5653];
        class426.field6471[class354.field5653] = var3;
        class354.field5653 = class354.field5653 + 1 & 0x1F;
        if (var5 != 0L && var5 < var3) {
            int var7 = (int) (var3 - var5);
            class41.field583 = ((var7 >> 1) + 32000) / var7;
        }
        if (class359.field5699++ > 50) {
            class245.field3910 = true;
            class359.field5699 -= 50;
            class271.field4377.setSize(class56.field732, class259.field4147);
            class271.field4377.setVisible(true);
            if (field8470 != null && class476.field7061 == null) {
                Insets var8 = field8470.getInsets();
                class271.field4377.setLocation(class290.field4596 + var8.left, var8.top - -class425.field6468);
            } else {
                class271.field4377.setLocation(class290.field4596, class425.field6468);
            }
        }
        this.method1945(2);
    }

    @OriginalMember(owner = "client!lca", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 350)
    public final void windowClosed(WindowEvent arg0) {
        field8484++;
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(B)V", line = 357)
    public static void method3490(byte arg0) {
        field8488 = null;
        field8470 = null;
        if (arg0 != 101) {
            field8470 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "start", descriptor = "()V", line = 368)
    public final void start() {
        field8506++;
        if (class64.field825 == this && !class634.field8909) {
            class245.field3905 = 0L;
        }
    }

    @OriginalMember(owner = "client!lca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 380)
    public final void focusGained(FocusEvent arg0) {
        field8504++;
        class636.field8939 = true;
        class245.field3910 = true;
    }

    @OriginalMember(owner = "client!lca", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 389)
    public final URL getDocumentBase() {
        field8500++;
        if (field8470 == null) {
            return class450.field6772 == null || class450.field6772 == this ? super.getDocumentBase() : class450.field6772.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(B)Z", line = 405)
    public final boolean method3491(byte arg0) {
        field8503++;
        if (arg0 >= -78) {
            field8498 = -67;
        }
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
            } else {
                this.method3487(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 443)
    public final void windowClosing(WindowEvent arg0) {
        field8474++;
        this.destroy();
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZI)V", line = 452)
    private final void method3492(boolean arg0, int arg1) {
        field8477++;
        synchronized (this) {
            if (class634.field8909) {
                return;
            }
            if (arg1 <= 51) {
                this.getParameter(null);
            }
            class634.field8909 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class450.field6772 != null) {
            class450.field6772.destroy();
        }
        try {
            this.method1954(-3);
        } catch (Exception var9) {
        }
        if (this.field8494) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field8494 = false;
        }
        class222.method1637(0, true);
        class676.method3867((byte) 126);
        if (class271.field4377 != null) {
            try {
                class271.field4377.removeFocusListener(this);
                class271.field4377.getParent().remove(class271.field4377);
            } catch (Exception var7) {
            }
        }
        if (class402.field6207 != null) {
            try {
                class402.field6207.method3184(5);
            } catch (Exception var6) {
            }
        }
        this.method1957((byte) 120);
        if (field8470 != null) {
            field8470.setVisible(false);
            field8470.dispose();
            field8470 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 528)
    public final void method3493(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field8491++;
        if (arg5 < 82) {
            return;
        }
        try {
            if (class64.field825 == null) {
                class591.field8392 = arg0;
                class259.field4147 = arg6;
                class101.field1659 = arg6;
                class64.field825 = this;
                class290.field4596 = 0;
                class425.field6468 = 0;
                class56.field732 = arg1;
                class235.field3727 = arg1;
                class166.field2794 = class450.field6772;
                class546.field7949 = class402.field6207 = new class525(arg3, arg2, arg4, class450.field6772 != null);
                class701 var8 = class402.field6207.method3180(this, false, 1);
                while (var8.field9884 == 0) {
                    class549.method3313(10L, 124);
                }
            } else {
                class609.field8650++;
                if (class609.field8650 >= 3) {
                    this.method3487(true, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class660.method3790(10216, var10, null);
            this.method3487(true, "crash");
        }
    }

    @OriginalMember(owner = "client!lca", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 574)
    public final void windowIconified(WindowEvent arg0) {
        field8471++;
    }

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "(I)Ljava/lang/String;", line = 582)
    public String method1941(int arg0) {
        field8495++;
        int var2 = 62 % ((arg0 + 26) / 63);
        return null;
    }

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "(B)Lcca;", line = 594)
    public static final class226 method3494(byte arg0) {
        field8483++;
        if (arg0 != 81) {
            field8470 = null;
        }
        return class231.field3683.length > class508.field7437 ? class231.field3683[class508.field7437++] : null;
    }

    @OriginalMember(owner = "client!lca", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 608)
    public final void windowOpened(WindowEvent arg0) {
        field8486++;
    }

    @OriginalMember(owner = "client!lca", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 630)
    public final String getParameter(String arg0) {
        field8482++;
        if (field8470 == null) {
            return class450.field6772 == null || class450.field6772 == this ? super.getParameter(arg0) : class450.field6772.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lie;I)Lada;", line = 646)
    public static final class149 method3495(class6 arg0, int arg1) {
        field8475++;
        int var2 = arg0.method67(12021);
        if (arg1 >= -119) {
            provideLoaderApplet(null);
        }
        return new class149(var2);
    }

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "(B)Z", line = 659)
    public final boolean method3496(byte arg0) {
        field8501++;
        if (arg0 > -88) {
            this.stop();
        }
        return class106.method1005("jaclib", (byte) 4);
    }

    @OriginalMember(owner = "client!lca", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 681)
    public final void windowDeactivated(WindowEvent arg0) {
        field8472++;
    }

    @OriginalMember(owner = "client!lca", name = "run", descriptor = "()V", line = 688)
    public final void run() {
        field8492++;
        try {
            if (class525.field7663 != null) {
                String var1 = class525.field7663.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class525.field7670;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3487(true, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class525.field7670 == null || class525.field7670.equals("1.4.2"))) {
                    this.method3487(true, "wrongjava");
                    return;
                }
            }
            if (class525.field7670 != null && class525.field7670.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class525.field7670.length()) {
                    char var5 = class525.field7670.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
                if (var4 >= 5) {
                    class418.field6405 = true;
                }
            }
            Applet var6 = class64.field825;
            if (class450.field6772 != null) {
                var6 = class450.field6772;
            }
            Method var7 = class525.field7650;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class343.method2336(17712);
            class538.method3268((byte) 9);
            this.method1946(false);
            this.method1940(255);
            class11.field183 = class238.method1715((byte) -40);
            while (class245.field3905 == 0L || class112.method1033(-11752) < class245.field3905) {
                class607.field8624 = class11.field183.method2899(true, class544.field7918);
                for (int var8 = 0; var8 < class607.field8624; var8++) {
                    this.method3485(-21);
                }
                this.method3489((byte) 58);
                class390.method2533((byte) 67, class402.field6207, class271.field4377);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class660.method3790(10216, var20, this.method1941(87));
            this.method3487(true, "crash");
        } finally {
            Object var13 = null;
            this.method3492(true, 110);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
    public abstract void method1954(int arg0);

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
    public abstract void method1940(int arg0);

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
    public abstract void method1957(byte arg0);

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)V")
    public abstract void method1945(int arg0);

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "(I)V")
    public abstract void method1937(int arg0);

    @OriginalMember(owner = "client!lca", name = "init", descriptor = "()V")
    public abstract void init();
}
