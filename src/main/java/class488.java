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

@OriginalClass("client!bg")
public abstract class class488 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Z")
    private boolean field6879 = false;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "Z")
    private boolean field6900 = false;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lok;")
    public static class266 field6868 = new class266();

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field6901 = 0;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "Lok;")
    public static class266 field6903 = new class266();

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!bg", name = "lb", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!bg", name = "mb", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "Ljd;")
    public static class241 field6897;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "Lwia;")
    public static class791 field6899;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "Z")
    public static boolean field6898;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "Z")
    public static boolean field6910;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "Z")
    public static boolean field6911;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "Z")
    public static boolean field6912;

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "Z")
    public static boolean field6913;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "Z")
    public static boolean field6917;

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "Z")
    public static boolean field6918;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "Z")
    public static boolean field6920;

    @OriginalMember(owner = "client!bg", name = "ib", descriptor = "Z")
    public static boolean field6921;

    @OriginalMember(owner = "client!bg", name = "jb", descriptor = "Z")
    public static boolean field6922;

    @OriginalMember(owner = "client!bg", name = "kb", descriptor = "Z")
    public static boolean field6923;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
    private final void method2900(int arg0, boolean arg1) {
        field6892++;
        synchronized (this) {
            if (class516.field7299) {
                return;
            }
            class516.field7299 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class319.field4527 != null) {
            class319.field4527.destroy();
        }
        try {
            this.method2029((byte) 113);
        } catch (Exception var9) {
        }
        if (this.field6900) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field6900 = false;
        }
        class196.method1357(true, -1);
        class743.method4137(arg0 - 155);
        if (class629.field8819 != null) {
            try {
                class629.field8819.removeFocusListener(this);
                class629.field8819.getParent().remove(class629.field8819);
            } catch (Exception var7) {
            }
        }
        if (class519.field7328 != null) {
            try {
                class519.field7328.method2846(true);
            } catch (Exception var6) {
            }
        }
        if (arg0 != 50) {
            field6868 = null;
        }
        this.method2035(true);
        if (class384.field5278 != null) {
            class384.field5278.setVisible(false);
            class384.field5278.dispose();
            class384.field5278 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!bg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field6889++;
        if (class384.field5278 == null) {
            return class319.field4527 == null || class319.field4527 == this ? super.getParameter(arg0) : class319.field4527.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
    public final boolean method2901(int arg0) {
        if (arg0 == -4932) {
            field6895++;
            return class581.method3402("jagtheora", (byte) -18);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field6887++;
        if (class742.field10293 != this || class516.field7299) {
            return;
        }
        class599.field8412 = true;
        if (class326.field4563 && (class459.method2731(104) - class458.field6410) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class179.field2787 <= var2.width && var2.height >= class63.field759) {
                class629.field8822 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6871++;
        class311.field4437 = true;
        class599.field8412 = true;
    }

    @OriginalMember(owner = "client!bg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class311.field4437 = false;
        field6878++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Z")
    public final boolean method2902(boolean arg0) {
        field6884++;
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
            if (!arg0) {
                this.method2906(-97, -32, -86, 88, 22, null, 28);
            }
            this.method2903(-1, "invalidhost");
            return false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field6905++;
    }

    @OriginalMember(owner = "client!bg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field6867++;
        this.destroy();
    }

    @OriginalMember(owner = "client!bg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field6864++;
        if (class384.field5278 == null) {
            return class319.field4527 == null || class319.field4527 == this ? super.getDocumentBase() : class319.field4527.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field6896++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2903(int arg0, String arg1) {
        field6883++;
        if (this.field6879) {
            return;
        }
        this.field6879 = true;
        if (arg0 != -1) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            class323.method2083(-10217, "loggedout", class319.field4527);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!bg", name = "stop", descriptor = "()V")
    public final void stop() {
        field6870++;
        if (class742.field10293 == this && !class516.field7299) {
            class712.field9882 = class459.method2731(127) + 4000L;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;ILso;)I")
    public static final int method2904(String arg0, int arg1, class494 arg2) {
        field6875++;
        int var3 = arg2.field7042;
        int var4 = 83 / ((-arg1 - 39) / 61);
        byte[] var5 = class518.method3119((byte) -86, arg0);
        arg2.method2961((byte) -104, var5.length);
        arg2.field7042 += class166.field2626.method1647(arg2.field7050, false, var5.length, arg2.field7042, 0, var5);
        return arg2.field7042 - var3;
    }

    @OriginalMember(owner = "client!bg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field6880++;
    }

    @OriginalMember(owner = "client!bg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field6872++;
        if (class384.field5278 == null) {
            return class319.field4527 == null || class319.field4527 == this ? super.getCodeBase() : class319.field4527.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field6866++;
    }

    @OriginalMember(owner = "client!bg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field6882++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public abstract void method2044(byte arg0);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public abstract void method2049(int arg0);

    @OriginalMember(owner = "client!bg", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field6861++;
        if (class742.field10293 == this && !class516.field7299) {
            class712.field9882 = class459.method2731(118);
            class107.method828(5000L, (byte) -87);
            class330.field4656 = null;
            this.method2900(50, false);
        }
    }

    @OriginalMember(owner = "client!bg", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        field6865++;
        class319.field4527 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    private final void method2905(int arg0) {
        field6891++;
        long var2 = class459.method2731(arg0 ^ 0x39B6);
        long var4 = class454.field6360[class597.field8398];
        if (arg0 != 14792) {
            return;
        }
        class454.field6360[class597.field8398] = var2;
        class597.field8398 = class597.field8398 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class694.field9696 = ((var6 >> 1) + 32000) / var6;
        }
        if (class123.field1913++ > 50) {
            class123.field1913 -= 50;
            class599.field8412 = true;
            class629.field8819.setSize(class428.field5825, class714.field9895);
            class629.field8819.setVisible(true);
            if (class384.field5278 != null && class161.field2561 == null) {
                Insets var7 = class384.field5278.getInsets();
                class629.field8819.setLocation(class270.field3918 + var7.left, class423.field5786 + var7.top);
            } else {
                class629.field8819.setLocation(class270.field3918, class423.field5786);
            }
        }
        this.method2042((byte) -120);
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Ljava/lang/String;")
    public String method2039(int arg0) {
        if (arg0 != 1001) {
            this.method2902(false);
        }
        field6902++;
        return null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public abstract void method2029(byte arg0);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method2906(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field6876++;
        try {
            if (class742.field10293 == null) {
                class428.field5825 = arg3;
                class179.field2787 = arg3;
                class742.field10293 = this;
                class35.field472 = arg1;
                class270.field3918 = 0;
                class688.field9558 = class319.field4527;
                class423.field5786 = 0;
                class714.field9895 = arg0;
                class63.field759 = arg0;
                if (arg6 == -2783) {
                    class330.field4656 = class519.field7328 = new class477(arg2, arg5, arg4, class319.field4527 != null);
                    class141 var8 = class519.field7328.method2850(1, this, 17);
                    while (var8.field2089 == 0) {
                        class107.method828(10L, (byte) 49);
                    }
                }
            } else {
                class548.field7877++;
                if (class548.field7877 >= 3) {
                    this.method2903(-1, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class678.method3848(null, var10, false);
            this.method2903(-1, "crash");
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Z")
    public static final boolean method2907(int arg0, int arg1, int arg2) {
        field6894++;
        if (arg0 != 26018) {
            method2904(null, 77, null);
        }
        return class371.method2310(arg2, arg1, true) | (arg2 & 0x70000) != 0 || class759.method4216(true, arg2, arg1);
    }

    @OriginalMember(owner = "client!bg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field6862++;
        if (class384.field5278 == null) {
            return class319.field4527 == null || class319.field4527 == this ? super.getAppletContext() : class319.field4527.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
    public static final void method2908(byte arg0) {
        class622.method3585();
        field6877++;
        if (arg0 < 3) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class346.field4838[var1].method1772(24754);
        }
        class515.method3108(21704);
        class449.method2678(0);
        class132.method980(-120);
        System.gc();
        class37.field491.method518();
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)Z")
    public final boolean method2909(byte arg0) {
        if (arg0 != -2) {
            field6898 = false;
        }
        field6873++;
        return class581.method3402("jagmisc", (byte) -18);
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
    public synchronized void method2052(int arg0) {
        if (class629.field8819 != null) {
            class629.field8819.removeFocusListener(this);
            class629.field8819.getParent().setBackground(Color.black);
            class629.field8819.getParent().remove(class629.field8819);
        }
        field6893++;
        Container var2;
        if (class161.field2561 != null) {
            var2 = class161.field2561;
        } else if (class384.field5278 != null) {
            var2 = class384.field5278;
        } else if (class319.field4527 == null) {
            var2 = class742.field10293;
        } else {
            var2 = class319.field4527;
        }
        var2.setLayout(null);
        class629.field8819 = new class777(this);
        var2.add(class629.field8819);
        class629.field8819.setSize(class428.field5825, class714.field9895);
        if (arg0 != 50) {
            field6906 = 12;
        }
        class629.field8819.setVisible(true);
        if (class384.field5278 == var2) {
            Insets var3 = class384.field5278.getInsets();
            class629.field8819.setLocation(class270.field3918 + var3.left, class423.field5786 + var3.top);
        } else {
            class629.field8819.setLocation(class270.field3918, class423.field5786);
        }
        class629.field8819.addFocusListener(this);
        class629.field8819.requestFocus();
        class311.field4437 = true;
        class319.field4529 = true;
        class599.field8412 = true;
        class629.field8822 = false;
        class458.field6410 = class459.method2731(115);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
    public abstract void method2035(boolean arg0);

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(B)Z")
    public final boolean method2910(byte arg0) {
        if (arg0 != 57) {
            method2907(36, -45, -57);
        }
        field6869++;
        return class581.method3402("jaclib", (byte) -18);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZIIILjava/lang/String;II)V")
    public final void method2911(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class35.field472 = arg3;
            class270.field3918 = 0;
            class423.field5786 = 0;
            class714.field9895 = arg0;
            class63.field759 = arg0;
            class688.field9558 = null;
            class742.field10293 = this;
            class428.field5825 = arg7;
            class179.field2787 = arg7;
            class384.field5278 = new Frame();
            int var9 = -91 % ((arg2 + 66) / 38);
            class384.field5278.setTitle("Jagex");
            class384.field5278.setResizable(true);
            class384.field5278.addWindowListener(this);
            class384.field5278.setVisible(true);
            class384.field5278.toFront();
            Insets var10 = class384.field5278.getInsets();
            class384.field5278.setSize(class179.field2787 + var10.right + var10.left, class63.field759 + var10.top + var10.bottom);
            class330.field4656 = class519.field7328 = new class477(arg4, arg5, arg6, true);
            class141 var11 = class519.field7328.method2850(1, this, 68);
            while (var11.field2089 == 0) {
                class107.method828(10L, (byte) -112);
            }
        } catch (Exception var13) {
            class678.method3848(null, var13, false);
        }
        field6888++;
    }

    @OriginalMember(owner = "client!bg", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!bg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field6874++;
    }

    @OriginalMember(owner = "client!bg", name = "start", descriptor = "()V")
    public final void start() {
        field6863++;
        if (class742.field10293 == this && !class516.field7299) {
            class712.field9882 = 0L;
        }
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(B)V")
    public abstract void method2042(byte arg0);

    @OriginalMember(owner = "client!bg", name = "run", descriptor = "()V")
    public final void run() {
        field6885++;
        try {
            if (class477.field6679 != null) {
                String var1 = class477.field6679.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class477.field6682;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2903(-1, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class477.field6682 == null || class477.field6682.equals("1.4.2"))) {
                    this.method2903(-1, "wrongjava");
                    return;
                }
            }
            if (class477.field6682 != null && class477.field6682.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class477.field6682.length() > var3) {
                    char var5 = class477.field6682.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var5 - (48 - var4 * 10);
                    var3++;
                }
                if (var4 >= 5) {
                    class326.field4563 = true;
                }
            }
            Applet var6 = class742.field10293;
            if (class319.field4527 != null) {
                var6 = class319.field4527;
            }
            Method var7 = class477.field6680;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class365.method2292(false);
            class670.method3804(false);
            this.method2052(50);
            this.method2049(3172);
            class263.field3855 = class93.method687(0);
            while (class712.field9882 == 0L || class712.field9882 > class459.method2731(121)) {
                class485.field6821 = class263.field3855.method1820(-124, class437.field5904);
                for (int var8 = 0; var8 < class485.field6821; var8++) {
                    this.method2914(true);
                }
                this.method2905(14792);
                class745.method4151(class519.field7328, class629.field8819, 3);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class678.method3848(this.method2039(1001), var20, false);
            this.method2903(-1, "crash");
        } finally {
            Object var13 = null;
            this.method2900(50, true);
        }
    }

    @OriginalMember(owner = "client!bg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field6886++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lwia;BII)Ldba;")
    public static final class100 method2912(class791 arg0, byte arg1, int arg2, int arg3) {
        field6881++;
        int var4 = -96 % ((-arg1 - 57) / 48);
        byte[] var5 = arg0.method4339(arg3, 0, arg2);
        return var5 == null ? null : new class100(var5);
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
    public static void method2913(int arg0) {
        if (arg0 != 1) {
            field6898 = true;
        }
        field6899 = null;
        field6903 = null;
        field6897 = null;
        field6868 = null;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)V")
    private final void method2914(boolean arg0) {
        field6890++;
        long var2 = class459.method2731(124);
        long var4 = class740.field10199[class619.field8650];
        class740.field10199[class619.field8650] = var2;
        if (!arg0) {
            this.field6879 = false;
        }
        class619.field8650 = class619.field8650 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class319.field4529 = class311.field4437;
        }
        this.method2044((byte) -109);
    }
}
