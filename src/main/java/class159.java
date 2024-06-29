import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class159 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Z")
    private boolean field2840 = false;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Ltg;")
    private static class184 field2851 = class135.method812("Please wait )2 attempting to reestablish)3", 3);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    private static int field2841 = 0;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Ltg;")
    public static class184 field2866 = class135.method812("(U", 3);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2849 = 7759444;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Ltg;")
    public static class184 field2844 = class135.method812("::qa_op_test", 3);

    @OriginalMember(owner = "client!r", name = "K", descriptor = "Ltg;")
    private static class184 field2873 = class135.method812("shake:", 3);

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Ltg;")
    public static class184 field2868 = field2851;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "Ltg;")
    public static class184 field2870 = field2873;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Ltg;")
    private static class184 field2839 = class135.method812("Please enter your username)3", 3);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Z")
    public static boolean field2856 = false;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Ltg;")
    public static class184 field2865 = field2873;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "[Lgf;")
    public static class65[] field2883 = new class65[4];

    @OriginalMember(owner = "client!r", name = "W", descriptor = "Ltg;")
    public static class184 field2885 = class135.method812("nav", 3);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Ltg;")
    public static class184 field2842 = field2839;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method188(boolean arg0);

    @OriginalMember(owner = "client!r", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2846++;
        if (class43.field827 == null) {
            return class98.field1841 == null || class98.field1841.field2658 == this ? super.getParameter(arg0) : class98.field1841.field2658.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2862++;
    }

    @OriginalMember(owner = "client!r", name = "run", descriptor = "()V")
    public final void run() {
        field2845++;
        try {
            if (class147.field2651 != null) {
                String var1 = class147.field2651.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class147.field2652;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method962(true, "wrongjava");
                        return;
                    }
                    class187.field3616 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class147.field2652 == null || class147.field2652.equals("1.4.2"))) {
                    this.method962(true, "wrongjava");
                    return;
                }
            }
            if (class98.field1841.field2658 != null) {
                Method var3 = class147.field2661;
                if (var3 != null) {
                    try {
                        var3.invoke(class98.field1841.field2658, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method958((byte) -124);
            class168.field3139 = class161.method973(4080, class185.field3577, class129.field2344, class3.field67);
            this.method192((byte) 123);
            class107.field1944 = class123.method750(9);
            while (class32.field564 == 0L || class32.field564 > class24.method165(128)) {
                class2.field56 = class107.field1944.method452((byte) 38, class150.field2697, class187.field3616);
                for (int var4 = 0; var4 < class2.field56; var4++) {
                    this.method967(1536);
                }
                this.method963((byte) -112);
                class123.method751((byte) -71, class129.field2344, class98.field1841);
            }
        } catch (Exception var7) {
            class5.method38((byte) -112, null, var7);
            this.method962(true, "crash");
        }
        this.method956((byte) 118);
    }

    @OriginalMember(owner = "client!r", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2875++;
        this.destroy();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    private final synchronized void method956(byte arg0) {
        field2864++;
        if (class164.field2938) {
            return;
        }
        class164.field2938 = true;
        try {
            class129.field2344.removeFocusListener(this);
            if (arg0 <= 76) {
                this.method962(true, null);
            }
        } catch (Exception var5) {
        }
        try {
            this.method191(0);
        } catch (Exception var4) {
        }
        if (class43.field827 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class98.field1841 != null) {
            try {
                class98.field1841.method900(3);
            } catch (Exception var2) {
            }
        }
        this.method190(-104);
    }

    @OriginalMember(owner = "client!r", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2858++;
    }

    @OriginalMember(owner = "client!r", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2869++;
        if (class43.field827 == null) {
            return class98.field1841 == null || class98.field1841.field2658 == this ? super.getCodeBase() : class98.field1841.field2658.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public abstract void method192(byte arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Z")
    public final boolean method957(int arg0) {
        if (arg0 != -1) {
            return true;
        }
        field2881++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method962(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2848++;
        class162.field2924 = false;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public final synchronized void method958(byte arg0) {
        field2859++;
        int var2 = 10 % ((-arg0 - 46) / 34);
        Container var3;
        if (class43.field827 == null) {
            var3 = class98.field1841.field2658;
        } else {
            var3 = class43.field827;
        }
        if (class129.field2344 != null) {
            class129.field2344.removeFocusListener(this);
            var3.remove(class129.field2344);
        }
        class129.field2344 = new class76(this);
        var3.add(class129.field2344);
        class129.field2344.setSize(class185.field3577, class3.field67);
        class129.field2344.setVisible(true);
        if (class43.field827 == null) {
            class129.field2344.setLocation(0, 0);
        } else {
            Insets var4 = class43.field827.getInsets();
            class129.field2344.setLocation(var4.left, var4.top);
        }
        class129.field2344.addFocusListener(this);
        class129.field2344.requestFocus();
        class157.field2809 = true;
        class179.field3420 = false;
        class59.field1095 = class24.method165(128);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public static final void method959(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2852++;
        if (class24.field437 == 1) {
            class196.field3802[class196.field3806 / 100].method835(class129.field2346 - 8, class21.field409 + -8);
        }
        if (class24.field437 == 2) {
            class196.field3802[class196.field3806 / 100 + 4].method835(class129.field2346 - 8, class21.field409 + -8);
        }
        class150.method917(arg2 ^ 0xFFFFBECF);
        if (arg2 != 16730 || !class74.field1378) {
            return;
        }
        int var5 = arg1 + 20;
        int var6 = arg4 + 507;
        class182.field3517.method1364(class144.method884(0, new class184[] { class58.field1039, class170.method1060(field2841, -121) }), var6, var5, 16776960, -1);
        Runtime var7 = Runtime.getRuntime();
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var9 = 16776960;
        if (var8 > 32768 && class55.field970) {
            var9 = 16711680;
        }
        var5 += 15;
        if (var8 > 65536 && !class55.field970) {
            var9 = 16711680;
        }
        class182.field3517.method1364(class144.method884(0, new class184[] { class194.field3769, class170.method1060(var8, -122), class98.field1836 }), var6, var5, var9, -1);
        var5 += 15;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method186(int arg0);

    @OriginalMember(owner = "client!r", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2877++;
    }

    @OriginalMember(owner = "client!r", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2872++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method960(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class210.field4037 = this;
            class185.field3577 = arg3;
            class3.field67 = arg6;
            class3.field65 = arg5;
            class43.field827 = new Frame();
            class43.field827.setTitle("Jagex");
            class43.field827.setResizable(false);
            class43.field827.addWindowListener(this);
            class43.field827.setVisible(true);
            class43.field827.toFront();
            Insets var8 = class43.field827.getInsets();
            class43.field827.setSize(var8.left + arg3 + var8.right, var8.bottom + arg6 - -var8.top);
            class141.field2559 = class98.field1841 = new class147(true, null, arg0, arg2, arg1);
            class98.field1841.method903(1, -115, this);
        } catch (Exception var11) {
            class5.method38((byte) -110, null, var11);
        }
        field2876++;
        int var10 = -73 / ((arg4 - 57) / 51);
    }

    @OriginalMember(owner = "client!r", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!r", name = "providesignlink", descriptor = "(Lpf;)V")
    public static final void providesignlink(class147 arg0) {
        field2837++;
        class98.field1841 = arg0;
        class141.field2559 = arg0;
    }

    @OriginalMember(owner = "client!r", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2863++;
        if (class210.field4037 == this && !class164.field2938) {
            class32.field564 = class24.method165(128);
            class151.method926((byte) 101, 5000L);
            class141.field2559 = null;
            this.method956((byte) 121);
        }
    }

    @OriginalMember(owner = "client!r", name = "start", descriptor = "()V")
    public final void start() {
        field2884++;
        if (class210.field4037 == this && !class164.field2938) {
            class32.field564 = 0L;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    public static void method961(byte arg0) {
        field2844 = null;
        field2839 = null;
        field2870 = null;
        if (arg0 != -73) {
            field2856 = false;
        }
        field2883 = null;
        field2868 = null;
        field2885 = null;
        field2865 = null;
        field2851 = null;
        field2873 = null;
        field2866 = null;
        field2842 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method962(boolean arg0, String arg1) {
        field2854++;
        if (this.field2840) {
            return;
        }
        this.field2840 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V")
    private final void method963(byte arg0) {
        long var2 = class24.method165(128);
        long var4 = class204.field3936[class63.field1183];
        class204.field3936[class63.field1183] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            field2841 = ((var6 >> 1) + 32000) / var6;
        }
        class63.field1183 = class63.field1183 + 1 & 0x1F;
        field2838++;
        int var7 = 75 % ((27 - arg0) / 57);
        if (class107.field1942++ > 50) {
            class157.field2809 = true;
            class107.field1942 -= 50;
            class129.field2344.setSize(class185.field3577, class3.field67);
            class129.field2344.setVisible(true);
            if (class43.field827 == null) {
                class129.field2344.setLocation(0, 0);
            } else {
                Insets var8 = class43.field827.getInsets();
                class129.field2344.setLocation(var8.left, var8.top);
            }
        }
        this.method188(true);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public abstract void method190(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2847++;
    }

    @OriginalMember(owner = "client!r", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2867++;
        if (class43.field827 == null) {
            return class98.field1841 == null || class98.field1841.field2658 == this ? super.getDocumentBase() : class98.field1841.field2658.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "stop", descriptor = "()V")
    public final void stop() {
        field2855++;
        if (class210.field4037 == this && !class164.field2938) {
            class32.field564 = class24.method165(128) + 4000L;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIII)V")
    public static final void method965(byte arg0, int arg1, int arg2, int arg3) {
        if (class19.field353 != 0 && arg1 != 0 && class91.field1700 < 50 && arg2 != -1) {
            class189.field3663[class91.field1700] = arg2;
            class131.field2383[class91.field1700] = arg1;
            class198.field3867[class91.field1700] = arg3;
            class179.field3421[class91.field1700] = null;
            class57.field1025[class91.field1700] = 0;
            class91.field1700++;
        }
        int var4 = 71 % ((arg0 - 20) / 56);
        field2843++;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method191(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIII)V")
    public final void method966(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2857++;
        try {
            if (class210.field4037 != null) {
                class182.field3511++;
                if (class182.field3511 >= 3) {
                    this.method962(true, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class185.field3577 = arg4;
            class210.field4037 = this;
            class3.field65 = arg2;
            class3.field67 = arg3;
            if (class98.field1841 == null) {
                class141.field2559 = class98.field1841 = new class147(false, this, arg1, null, 0);
            }
            class98.field1841.method903(1, arg0 - 115, this);
        } catch (Exception var7) {
            class5.method38((byte) -33, null, var7);
            this.method962(true, "crash");
        }
        if (arg0 != 1) {
            field2885 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class162.field2924 = true;
        class157.field2809 = true;
        field2861++;
    }

    @OriginalMember(owner = "client!r", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2879++;
        if (class210.field4037 != this || class164.field2938) {
            return;
        }
        class157.field2809 = true;
        if (class147.field2652 != null && class147.field2652.startsWith("1.5") && class24.method165(128) - class59.field1095 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class185.field3577 <= var2.width && class3.field67 <= var2.height) {
                class179.field3420 = true;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2860++;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    private final void method967(int arg0) {
        field2878++;
        long var2 = class117.field2117[class198.field3864];
        long var4 = class24.method165(arg0 ^ 0x680);
        if (arg0 != 1536) {
            return;
        }
        class117.field2117[class198.field3864] = var4;
        class198.field3864 = class198.field3864 + 1 & 0x1F;
        synchronized (this) {
            class125.field2255 = class162.field2924;
        }
        this.method186(3503);
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
    }

    @OriginalMember(owner = "client!r", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2850++;
    }

    @OriginalMember(owner = "client!r", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2880++;
        if (class43.field827 == null) {
            return class98.field1841 == null || class98.field1841.field2658 == this ? super.getAppletContext() : class98.field1841.field2658.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLde;)V")
    public static final void method968(byte arg0, class35 arg1) {
        arg1.field655 = arg1.field596;
        field2882++;
        if (arg1.field598 == 0) {
            arg1.field664 = 0;
            return;
        }
        if (arg1.field612 != -1 && arg1.field630 == 0) {
            class188 var2 = class83.method465(arg1.field612, -1);
            if (arg1.field642 > 0 && var2.field3618 == 0) {
                arg1.field664++;
                return;
            }
            if (arg1.field642 <= 0 && var2.field3647 == 0) {
                arg1.field664++;
                return;
            }
        }
        int var3 = arg1.field635;
        int var4 = arg1.field644[arg1.field598 - 1] * 128 + arg1.field651 * 64;
        int var5 = arg1.field615[arg1.field598 - 1] * 128 + arg1.field651 * 64;
        int var6 = arg1.field614;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var5 - var6 > 256 || var5 - var6 < -256) {
            arg1.field614 = var5;
            arg1.field635 = var4;
            return;
        }
        if (var4 > var3) {
            if (var5 > var6) {
                arg1.field649 = 1280;
            } else if (var6 > var5) {
                arg1.field649 = 1792;
            } else {
                arg1.field649 = 1536;
            }
        } else if (var3 <= var4) {
            if (var5 > var6) {
                arg1.field649 = 1024;
            } else if (var5 < var6) {
                arg1.field649 = 0;
            }
        } else if (var5 > var6) {
            arg1.field649 = 768;
        } else if (var6 <= var5) {
            arg1.field649 = 512;
        } else {
            arg1.field649 = 256;
        }
        boolean var7 = true;
        int var8 = arg1.field604;
        int var9 = 4;
        if (arg0 > -9) {
            return;
        }
        int var10 = arg1.field649 - arg1.field647 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 >= -256 && var10 <= 256) {
            var8 = arg1.field627;
        } else if (var10 >= 256 && var10 < 768) {
            var8 = arg1.field629;
        } else if (var10 >= -768 && var10 <= -256) {
            var8 = arg1.field626;
        }
        if (var8 == -1) {
            var8 = arg1.field627;
        }
        arg1.field655 = var8;
        if (arg1 instanceof class158) {
            var7 = ((class158) arg1).field2832.field770;
        }
        if (var7) {
            if (arg1.field649 != arg1.field647 && arg1.field653 == -1 && arg1.field636 != 0) {
                var9 = 2;
            }
            if (arg1.field598 > 2) {
                var9 = 6;
            }
            if (arg1.field598 > 3) {
                var9 = 8;
            }
            if (arg1.field664 > 0 && arg1.field598 > 1) {
                arg1.field664--;
                var9 = 8;
            }
        } else {
            if (arg1.field598 > 1) {
                var9 = 6;
            }
            if (arg1.field598 > 2) {
                var9 = 8;
            }
            if (arg1.field664 > 0 && arg1.field598 > 1) {
                arg1.field664--;
                var9 = 8;
            }
        }
        if (arg1.field631[arg1.field598 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg1.field655 == arg1.field627 && arg1.field597 != -1) {
            arg1.field655 = arg1.field597;
        }
        if (var3 < var4) {
            arg1.field635 += var9;
            if (arg1.field635 > var4) {
                arg1.field635 = var4;
            }
        } else if (var4 < var3) {
            arg1.field635 -= var9;
            if (var4 > arg1.field635) {
                arg1.field635 = var4;
            }
        }
        if (var5 > var6) {
            arg1.field614 += var9;
            if (arg1.field614 > var5) {
                arg1.field614 = var5;
            }
        } else if (var6 > var5) {
            arg1.field614 -= var9;
            if (arg1.field614 < var5) {
                arg1.field614 = var5;
            }
        }
        if (arg1.field635 != var4 || arg1.field614 != var5) {
            return;
        }
        arg1.field598--;
        if (arg1.field642 > 0) {
            arg1.field642--;
            return;
        }
    }
}
