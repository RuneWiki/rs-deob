import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class193 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
    private boolean field3732 = false;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Led;")
    public static class43 field3740 = null;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static volatile int field3755 = -1;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Led;")
    public static class43 field3749 = class191.method1219("Bitte starten Sie eine Mitgliedschaft", false);

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Led;")
    public static class43 field3754 = class191.method1219("welle:", false);

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "[[B")
    public static byte[][] field3752 = new byte[250][];

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3760 = 0;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field3772 = 0;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3741 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Z")
    public static boolean field3763;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "Z")
    public static boolean field3775;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Z")
    public static final boolean method1220(byte arg0, int arg1) {
        if (arg0 == -79) {
            field3769++;
            return (arg1 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    private final synchronized void method1221(int arg0) {
        field3745++;
        if (class9.field171) {
            return;
        }
        class9.field171 = true;
        try {
            class100.field1911.removeFocusListener(this);
            if (arg0 != 0) {
                field3772 = 44;
            }
        } catch (Exception var5) {
        }
        try {
            this.method147((byte) -125);
        } catch (Exception var4) {
        }
        if (class198.field3901 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class32.field585 != null) {
            try {
                class32.field585.method1010(5822);
            } catch (Exception var2) {
            }
        }
        this.method152((byte) -49);
    }

    @OriginalMember(owner = "client!vc", name = "stop", descriptor = "()V")
    public final void stop() {
        field3731++;
        if (class206.field4037 == this && !class9.field171) {
            class38.field729 = class52.method315((byte) -128) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static void method1222(int arg0) {
        field3740 = null;
        field3749 = null;
        if (arg0 != -347) {
            method1220((byte) 11, 78);
        }
        field3752 = null;
        field3754 = null;
    }

    @OriginalMember(owner = "client!vc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3730++;
    }

    @OriginalMember(owner = "client!vc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3761++;
        if (class198.field3901 == null) {
            return class32.field585 == null || class32.field585.field3231 == this ? super.getCodeBase() : class32.field585.field3231.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "providesignlink", descriptor = "(Lrf;)V")
    public static final void providesignlink(class160 arg0) {
        class32.field585 = arg0;
        client.field557 = arg0;
        field3750++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
    public static final boolean method1223(int arg0, byte arg1) {
        if (arg1 == 59) {
            field3748++;
            return (arg0 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3771++;
        if (class198.field3901 == null) {
            return class32.field585 == null || class32.field585.field3231 == this ? super.getParameter(arg0) : class32.field585.field3231.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public abstract void method151(int arg0);

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    private final void method1224(int arg0) {
        field3765++;
        long var2 = class59.field1224[class188.field3682];
        long var4 = class52.method315((byte) -128);
        class59.field1224[class188.field3682] = var4;
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class188.field3682 = arg0 & class188.field3682 + 1;
        synchronized (this) {
            class119.field2376 = class28.field496;
        }
        this.method156(-41);
    }

    @OriginalMember(owner = "client!vc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3735++;
    }

    @OriginalMember(owner = "client!vc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3738++;
    }

    @OriginalMember(owner = "client!vc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3753++;
        if (class206.field4037 == this && !class9.field171) {
            class38.field729 = class52.method315((byte) -128);
            class38.method209(5000L, -7296);
            client.field557 = null;
            this.method1221(0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "run", descriptor = "()V")
    public final void run() {
        field3734++;
        try {
            if (class160.field3235 != null) {
                String var1 = class160.field3235.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class160.field3232;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1230("wrongjava", (byte) -82);
                        return;
                    }
                    class206.field4038 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class160.field3232 == null || class160.field3232.equals("1.4.2"))) {
                    this.method1230("wrongjava", (byte) -82);
                    return;
                }
            }
            if (class32.field585.field3231 != null) {
                Method var3 = class160.field3229;
                if (var3 != null) {
                    try {
                        var3.invoke(class32.field585.field3231, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1234(0);
            class154.field3132 = class128.method826((byte) 127, class100.field1911, class127.field2542, class27.field482);
            this.method151(10);
            class136.field2825 = class27.method129(100);
            while (class38.field729 == 0L || class52.method315((byte) -18) < class38.field729) {
                class98.field1900 = class136.field2825.method50(class173.field3459, class206.field4038, 44);
                for (int var4 = 0; var4 < class98.field1900; var4++) {
                    this.method1224(31);
                }
                this.method1225((byte) -112);
                class52.method318((byte) -7, class32.field585, class100.field1911);
            }
        } catch (Exception var7) {
            class171.method1086(null, -2929, var7);
            this.method1230("crash", (byte) -82);
        }
        this.method1221(0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    private final void method1225(byte arg0) {
        field3742++;
        long var2 = class52.method315((byte) 9);
        long var4 = class137.field2840[class105.field2021];
        if (arg0 >= -111) {
            return;
        }
        class137.field2840[class105.field2021] = var2;
        class105.field2021 = class105.field2021 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class19.field334 = ((var6 >> 1) + 32000) / var6;
        }
        if (class96.field1873++ > 50) {
            class96.field1873 -= 50;
            class206.field4026 = true;
            class100.field1911.setSize(class27.field482, class127.field2542);
            class100.field1911.setVisible(true);
            if (class198.field3901 == null) {
                class100.field1911.setLocation(0, 0);
            } else {
                Insets var7 = class198.field3901.getInsets();
                class100.field1911.setLocation(var7.left, var7.top);
            }
        }
        this.method148((byte) -39);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;ZIIIII)V")
    public final void method1226(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class127.field2542 = arg5;
            class110.field2130 = arg3;
            class206.field4037 = this;
            class27.field482 = arg6;
            class198.field3901 = new Frame();
            class198.field3901.setTitle("Jagex");
            class198.field3901.setResizable(false);
            class198.field3901.addWindowListener(this);
            class198.field3901.setVisible(true);
            class198.field3901.toFront();
            Insets var8 = class198.field3901.getInsets();
            class198.field3901.setSize(var8.right + var8.left + arg6, var8.top + arg5 - -var8.bottom);
            client.field557 = class32.field585 = new class160(arg1, null, arg4, arg0, arg2);
            class32.field585.method1011(-9054, this, 1);
        } catch (Exception var10) {
            class171.method1086(null, -2929, var10);
        }
        field3733++;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Z")
    public final boolean method1227(byte arg0) {
        field3774++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = 43 / ((-arg0 - 84) / 38);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1230("invalidhost", (byte) -82);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3739++;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
    public abstract void method147(byte arg0);

    @OriginalMember(owner = "client!vc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3737++;
        class28.field496 = true;
        class206.field4026 = true;
    }

    @OriginalMember(owner = "client!vc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3773++;
        if (class198.field3901 == null) {
            return class32.field585 == null || class32.field585.field3231 == this ? super.getDocumentBase() : class32.field585.field3231.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3744++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1228(Component arg0, int arg1) {
        if (arg1 == 4000) {
            arg0.addMouseListener(class102.field1942);
            arg0.addMouseMotionListener(class102.field1942);
            field3736++;
            arg0.addFocusListener(class102.field1942);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lob;Led;I)Led;")
    public static final class43 method1229(class129 arg0, class43 arg1, int arg2) {
        field3764++;
        if (arg2 != 1000) {
            return null;
        } else if (arg1.method261((byte) -126, class90.field1805) == -1) {
            return arg1;
        } else {
            while (true) {
                int var3 = arg1.method261((byte) 21, class121.field2422);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method261((byte) 70, class105.field2013);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method261((byte) 44, class198.field3903);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method261((byte) 76, class144.field2970);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method261((byte) -126, class191.field3715);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method261((byte) 20, class33.field616);
                                                        if (var8 == -1) {
                                                            return arg1;
                                                        }
                                                        class43 var9 = class110.field2127;
                                                        if (class22.field377 != null) {
                                                            var9 = class29.method145(-127, class22.field377.field2929);
                                                            try {
                                                                if (class22.field377.field2930 != null) {
                                                                    byte[] var10 = ((String) class22.field377.field2930).getBytes("ISO-8859-1");
                                                                    var9 = class93.method594(0, var10.length, var10, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class167.method1036(new class43[] { arg1.method241((byte) 126, 0, var8), var9, arg1.method238(68, var8 + 4) }, true);
                                                    }
                                                }
                                                arg1 = class167.method1036(new class43[] { arg1.method241((byte) 122, 0, var7), class172.method1090(class36.method204(arg0, -1, 4), (byte) 105), arg1.method238(45, var7 + 2) }, true);
                                            }
                                        }
                                        arg1 = class167.method1036(new class43[] { arg1.method241((byte) -110, 0, var6), class172.method1090(class36.method204(arg0, arg2 - 1001, 3), (byte) 107), arg1.method238(63, var6 + 2) }, true);
                                    }
                                }
                                arg1 = class167.method1036(new class43[] { arg1.method241((byte) -28, 0, var5), class172.method1090(class36.method204(arg0, -1, 2), (byte) 110), arg1.method238(40, var5 + 2) }, true);
                            }
                        }
                        arg1 = class167.method1036(new class43[] { arg1.method241((byte) 115, 0, var4), class172.method1090(class36.method204(arg0, arg2 ^ 0xFFFFFC17, 1), (byte) 95), arg1.method238(21, var4 + 2) }, true);
                    }
                }
                arg1 = class167.method1036(new class43[] { arg1.method241((byte) 116, 0, var3), class172.method1090(class36.method204(arg0, -1, 0), (byte) 116), arg1.method238(21, var3 + 2) }, true);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3770++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1230(String arg0, byte arg1) {
        field3746++;
        if (this.field3732) {
            return;
        }
        this.field3732 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != -82) {
                this.method147((byte) 21);
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!vc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3768++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLob;)I")
    public static final int method1231(byte arg0, class129 arg1) {
        class30 var2 = (class30) class86.field1674.method75(((long) arg1.field2664 << 32) + (long) arg1.field2661, -128);
        field3762++;
        int var3 = -86 / ((64 - arg0) / 55);
        return var2 == null ? arg1.field2636 : var2.field564;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public abstract void method156(int arg0);

    @OriginalMember(owner = "client!vc", name = "start", descriptor = "()V")
    public final void start() {
        field3747++;
        if (class206.field4037 == this && !class9.field171) {
            class38.field729 = 0L;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lga;Led;Led;I)Ltg;")
    public static final class179 method1232(class58 arg0, class43 arg1, class43 arg2, int arg3) {
        field3766++;
        int var4 = arg0.method347(arg2, (byte) 86);
        if (arg3 == -1) {
            int var5 = arg0.method362(arg1, (byte) -47, var4);
            return class201.method1310(-12, var4, var5, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3757++;
        if (class198.field3901 == null) {
            return class32.field585 == null || class32.field585.field3231 == this ? super.getAppletContext() : class32.field585.field3231.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
    public abstract void method148(byte arg0);

    @OriginalMember(owner = "client!vc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3767++;
        class28.field496 = false;
    }

    @OriginalMember(owner = "client!vc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3759++;
        if (class206.field4037 != this || class9.field171) {
            return;
        }
        class206.field4026 = true;
        if (class160.field3232 != null && class160.field3232.startsWith("1.5") && class52.method315((byte) 114) - class105.field2020 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class27.field482 && var2.height >= class127.field2542) {
                class69.field1381 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIZI)V")
    public final void method1233(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3758++;
        try {
            if (class206.field4037 != null) {
                class58.field1162++;
                if (class58.field1162 >= 3) {
                    this.method1230("alreadyloaded", (byte) -82);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            } else if (!arg3) {
                class27.field482 = arg2;
                class206.field4037 = this;
                class110.field2130 = arg1;
                class127.field2542 = arg4;
                if (class32.field585 == null) {
                    client.field557 = class32.field585 = new class160(false, this, arg0, null, 0);
                }
                class32.field585.method1011(-9054, this, 1);
            }
        } catch (Exception var7) {
            class171.method1086(null, -2929, var7);
            this.method1230("crash", (byte) -82);
        }
    }

    @OriginalMember(owner = "client!vc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3751++;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(B)V")
    public abstract void method152(byte arg0);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    public final synchronized void method1234(int arg0) {
        field3743++;
        if (arg0 != 0) {
            method1229(null, null, 27);
        }
        Container var2;
        if (class198.field3901 == null) {
            var2 = class32.field585.field3231;
        } else {
            var2 = class198.field3901;
        }
        if (class100.field1911 != null) {
            class100.field1911.removeFocusListener(this);
            var2.remove(class100.field1911);
        }
        class100.field1911 = new class100(this);
        var2.add(class100.field1911);
        class100.field1911.setSize(class27.field482, class127.field2542);
        class100.field1911.setVisible(true);
        if (class198.field3901 == null) {
            class100.field1911.setLocation(0, 0);
        } else {
            Insets var3 = class198.field3901.getInsets();
            class100.field1911.setLocation(var3.left, var3.top);
        }
        class100.field1911.addFocusListener(this);
        class100.field1911.requestFocus();
        class206.field4026 = true;
        class69.field1381 = false;
        class105.field2020 = class52.method315((byte) -126);
    }
}
