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

@OriginalClass("client!ee")
public abstract class class34 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Z")
    private boolean field959 = false;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lkd;")
    public static class73 field916 = class126.method1070((byte) -66, "chatback");

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field925 = 0;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Lkd;")
    public static class73 field939 = class126.method1070((byte) -66, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Lkd;")
    private static class73 field938 = class126.method1070((byte) -66, "Enter name:");

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "Lkd;")
    public static class73 field942 = class126.method1070((byte) -66, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "Z")
    public static boolean field945 = false;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lkd;")
    public static class73 field920 = field938;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lee;")
    private static class34 field927 = null;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "[I")
    public static int[] field958 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "Lkd;")
    private static class73 field960 = class126.method1070((byte) -66, "skill)2");

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lkd;")
    public static class73 field922 = field960;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    private static int field943;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "Lde;")
    public static class27 field955;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lb;")
    public static class8 field923;

    @OriginalMember(owner = "client!ee", name = "run", descriptor = "()V")
    public final void run() {
        field921++;
        try {
            if (class148.field3616 != null) {
                String var1 = class148.field3616.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class148.field3633;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method268(50, "wrongjava");
                        return;
                    }
                    class33.field910 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class148.field3633 == null || class148.field3633.equals("1.4.2"))) {
                    this.method268(50, "wrongjava");
                    return;
                }
            }
            if (class107.field2637.field3629 != null) {
                Method var3 = class148.field3630;
                if (var3 != null) {
                    try {
                        var3.invoke(class107.field2637.field3629, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method270(0);
            class57.field1516 = class72.method600(class18.field519, class33.field912, class72.field1826, -30723);
            this.method174(500000);
            class31.field864 = class139.method1134((byte) -94);
            class31.field864.method247(119);
            while (class62.field1621 == 0L || class146.method1168(-82) < class62.field1621) {
                class31.field871 = class31.field864.method248(class33.field910, class55.field1453, 17);
                for (int var4 = 0; var4 < class31.field871; var4++) {
                    this.method265((byte) 120);
                }
                this.method274(61);
                class16.method128(0, true);
            }
        } catch (Exception var7) {
            class111.method894(null, var7, (byte) 2);
            this.method268(50, "crash");
        }
        this.method273(-1);
    }

    @OriginalMember(owner = "client!ee", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field935++;
    }

    @OriginalMember(owner = "client!ee", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field948++;
    }

    @OriginalMember(owner = "client!ee", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field928++;
        if (class1.field97 == null) {
            return class107.field2637 == null || class107.field2637.field3629 == this ? super.getDocumentBase() : class107.field2637.field3629.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    private final void method265(byte arg0) {
        field944++;
        long var2 = class146.method1168(-76);
        long var4 = class142.field3550[field943];
        class142.field3550[field943] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        field943 = field943 + 1 & 0x1F;
        synchronized (this) {
            class45.field1188 = class146.field3609;
        }
        this.method175(5);
        if (arg0 <= 108) {
            method269(110, true, 95);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method266(int arg0) {
        field958 = null;
        field960 = null;
        field922 = null;
        field939 = null;
        if (arg0 > -44) {
            field943 = 2;
        }
        field920 = null;
        field916 = null;
        field938 = null;
        field923 = null;
        field955 = null;
        field942 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public abstract void method183(boolean arg0);

    @OriginalMember(owner = "client!ee", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field941++;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public abstract void method175(int arg0);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)Z")
    public final boolean method267(byte arg0) {
        field946++;
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
            }
            if (arg0 != 121) {
                providesignlink(null);
            }
            this.method268(50, "invalidhost");
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class146.field3609 = true;
        field956++;
        class140.field3479 = true;
    }

    @OriginalMember(owner = "client!ee", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field930++;
        if (field927 == this && !class92.field2373) {
            class62.field1621 = class146.method1168(-126);
            class112.method913(1, 5000L);
            class15.field458 = null;
            this.method273(-1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "providesignlink", descriptor = "(Lw;)V")
    public static final void providesignlink(class148 arg0) {
        class107.field2637 = arg0;
        class15.field458 = arg0;
        field937++;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public abstract void method174(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method268(int arg0, String arg1) {
        field957++;
        if (arg0 != 50 || this.field959) {
            return;
        }
        this.field959 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ee", name = "start", descriptor = "()V")
    public final void start() {
        field952++;
        if (field927 == this && !class92.field2373) {
            class62.field1621 = 0L;
        }
    }

    @OriginalMember(owner = "client!ee", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field929++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI)La;")
    public static final class1 method269(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method275(4);
        }
        class1 var3 = class45.method335(arg0, -86);
        field950++;
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field126 == null || var3.field126.length <= arg2) {
            return null;
        } else {
            return var3.field126[arg2];
        }
    }

    @OriginalMember(owner = "client!ee", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field933++;
        if (field927 != this || class92.field2373) {
            return;
        }
        class140.field3479 = true;
        if (class148.field3633 != null && class148.field3633.startsWith("1.5") && class146.method1168(-80) - class92.field2380 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class33.field912 && var2.height >= class72.field1826) {
                class42.field1132 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "stop", descriptor = "()V")
    public final void stop() {
        field917++;
        if (field927 == this && !class92.field2373) {
            class62.field1621 = class146.method1168(-121) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public final synchronized void method270(int arg0) {
        field940++;
        Container var2;
        if (class1.field97 == null) {
            var2 = class107.field2637.field3629;
        } else {
            var2 = class1.field97;
        }
        if (class18.field519 != null) {
            class18.field519.removeFocusListener(this);
            var2.remove(class18.field519);
        }
        class18.field519 = new class21(this);
        var2.add(class18.field519);
        if (arg0 != 0) {
            this.method173((byte) -72);
        }
        class18.field519.setSize(class33.field912, class72.field1826);
        class18.field519.setVisible(true);
        if (class1.field97 == null) {
            class18.field519.setLocation(0, 0);
        } else {
            Insets var3 = class1.field97.getInsets();
            class18.field519.setLocation(var3.left, var3.top);
        }
        class18.field519.addFocusListener(this);
        class18.field519.requestFocus();
        class140.field3479 = true;
        class42.field1132 = false;
        class92.field2380 = class146.method1168(-122);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BB)[B")
    public static final byte[] method271(byte[] arg0, byte arg1) {
        field951++;
        int var2 = arg0.length;
        if (arg1 >= 0) {
            return null;
        } else {
            byte[] var3 = new byte[var2];
            class128.method1077(arg0, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ee", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field918++;
        if (class1.field97 == null) {
            return class107.field2637 == null || class107.field2637.field3629 == this ? super.getParameter(arg0) : class107.field2637.field3629.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
    public final void method272(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field949++;
        try {
            if (field927 == null) {
                field927 = this;
                if (arg3 == 3) {
                    class33.field912 = arg4;
                    class72.field1826 = arg0;
                    class37.field1019 = arg2;
                    if (class107.field2637 == null) {
                        class15.field458 = class107.field2637 = new class148(false, this, arg1, null, 0);
                    }
                    class107.field2637.method1176(1, this, (byte) 93);
                }
            } else {
                class38.field1029++;
                if (class38.field1029 >= 3) {
                    this.method268(50, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class111.method894(null, var7, (byte) 2);
            this.method268(50, "crash");
        }
    }

    @OriginalMember(owner = "client!ee", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field931++;
        if (class1.field97 == null) {
            return class107.field2637 == null || class107.field2637.field3629 == this ? super.getCodeBase() : class107.field2637.field3629.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    private final synchronized void method273(int arg0) {
        field963++;
        if (class92.field2373) {
            return;
        }
        class92.field2373 = true;
        try {
            if (arg0 != -1) {
                return;
            }
            class18.field519.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method173((byte) 44);
        } catch (Exception var4) {
        }
        if (class1.field97 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class107.field2637 != null) {
            try {
                class107.field2637.method1182(arg0 ^ 0x70);
            } catch (Exception var2) {
            }
        }
        this.method182(5);
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    private final void method274(int arg0) {
        if (arg0 < 11) {
            field945 = true;
        }
        field919++;
        long var2 = class146.method1168(-128);
        long var4 = class47.field1239[class145.field3586];
        class47.field1239[class145.field3586] = var2;
        class145.field3586 = class145.field3586 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class76.field1942 = ((var6 >> 1) + 32000) / var6;
        }
        if (class48.field1286++ > 50) {
            class140.field3479 = true;
            class48.field1286 -= 50;
            class18.field519.setSize(class33.field912, class72.field1826);
            class18.field519.setVisible(true);
            if (class1.field97 == null) {
                class18.field519.setLocation(0, 0);
            } else {
                Insets var7 = class1.field97.getInsets();
                class18.field519.setLocation(var7.left, var7.top);
            }
        }
        this.method183(false);
    }

    @OriginalMember(owner = "client!ee", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field932++;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public abstract void method182(int arg0);

    @OriginalMember(owner = "client!ee", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field924++;
    }

    @OriginalMember(owner = "client!ee", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field953++;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
    public abstract void method173(byte arg0);

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
    public static final void method275(int arg0) {
        field926++;
        class89.field2235.method1205(8);
        if (arg0 <= 68) {
            return;
        }
        int var1 = class89.field2235.method1211(1, 7);
        if (var1 == 0) {
            return;
        }
        int var2 = class89.field2235.method1211(2, 7);
        if (var2 == 0) {
            class137.field3422[class110.field2712++] = 2047;
        } else if (var2 == 1) {
            int var3 = class89.field2235.method1211(3, 7);
            class73.field1901.method743(28077, var3, false);
            int var4 = class89.field2235.method1211(1, 7);
            if (var4 == 1) {
                class137.field3422[class110.field2712++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class89.field2235.method1211(3, 7);
            class73.field1901.method743(28077, var5, true);
            int var6 = class89.field2235.method1211(3, 7);
            class73.field1901.method743(28077, var6, true);
            int var7 = class89.field2235.method1211(1, 7);
            if (var7 == 1) {
                class137.field3422[class110.field2712++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class89.field2235.method1211(1, 7);
            int var9 = class89.field2235.method1211(1, 7);
            if (var9 == 1) {
                class137.field3422[class110.field2712++] = 2047;
            }
            int var10 = class89.field2235.method1211(7, 7);
            int var11 = class89.field2235.method1211(7, 7);
            class11.field320 = class89.field2235.method1211(2, 7);
            class73.field1901.method747(961, var11, var10, var8 == 1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field954++;
    }

    @OriginalMember(owner = "client!ee", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field947++;
        class146.field3609 = false;
    }

    @OriginalMember(owner = "client!ee", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field936++;
        if (class1.field97 == null) {
            return class107.field2637 == null || class107.field2637.field3629 == this ? super.getAppletContext() : class107.field2637.field3629.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method276(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field961++;
        try {
            field927 = this;
            class37.field1019 = arg2;
            class33.field912 = arg6;
            class72.field1826 = arg3;
            class1.field97 = new Frame();
            class1.field97.setTitle("Jagex");
            class1.field97.setResizable(false);
            class1.field97.addWindowListener(this);
            class1.field97.setVisible(true);
            class1.field97.toFront();
            Insets var8 = class1.field97.getInsets();
            if (arg4 == -1) {
                class1.field97.setSize(var8.right + arg6 + var8.left, var8.top + var8.bottom + arg3);
                class15.field458 = class107.field2637 = new class148(true, null, arg5, arg0, arg1);
                class107.field2637.method1176(1, this, (byte) -89);
            }
        } catch (Exception var10) {
            class111.method894(null, var10, (byte) 2);
        }
    }
}
