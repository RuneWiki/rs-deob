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

@OriginalClass("client!dh")
public abstract class class654 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Z")
    private boolean field9282 = false;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "Z")
    private boolean field9298 = false;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "[S")
    private static short[] field9291 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "[S")
    private static short[] field9280 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "[S")
    private static short[] field9296 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "[S")
    private static short[] field9290 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field9286 = 0;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "[[S")
    public static short[][] field9299 = new short[][] { field9280, field9296, field9290, field9291 };

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "Lhs;")
    public static class358 field9289;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "Z")
    public static boolean field9313;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "Z")
    public static boolean field9314;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Z")
    public static boolean field9317;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "Z")
    public static boolean field9318;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "Z")
    public static boolean field9319;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "Z")
    public static boolean field9320;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "Z")
    public static boolean field9321;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "Z")
    public static boolean field9322;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "Z")
    public static boolean field9323;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "Z")
    public static boolean field9324;

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "Z")
    public static boolean field9328;

    @OriginalMember(owner = "client!dh", name = "hb", descriptor = "Z")
    public static boolean field9330;

    @OriginalMember(owner = "client!dh", name = "ib", descriptor = "Z")
    public static boolean field9331;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BZ)V", line = 6)
    private final void method3677(byte arg0, boolean arg1) {
        field9278++;
        synchronized (this) {
            if (class103.field1534) {
                return;
            }
            class103.field1534 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class351.field5138 != null) {
            class351.field5138.destroy();
        }
        int var4 = 27 / ((11 - arg0) / 36);
        try {
            this.method2733((byte) 13);
        } catch (Exception var10) {
        }
        if (this.field9298) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field9298 = false;
        }
        class389.method2428(false, true);
        class126.method972((byte) -27);
        if (class400.field5941 != null) {
            try {
                class400.field5941.removeFocusListener(this);
                class400.field5941.getParent().remove(class400.field5941);
            } catch (Exception var8) {
            }
        }
        if (class706.field9962 != null) {
            try {
                class706.field9962.method4060(false);
            } catch (Exception var7) {
            }
        }
        this.method2725(-1);
        if (class530.field7619 != null) {
            class530.field7619.setVisible(false);
            class530.field7619.dispose();
            class530.field7619 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!dh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 82)
    public final void windowActivated(WindowEvent arg0) {
        field9276++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Z", line = 91)
    public final boolean method3678(byte arg0) {
        field9297++;
        return arg0 == 93 ? class541.method3169("jaclib", arg0 ^ 0xFFFFFF95) : false;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZIILjava/lang/String;II)V", line = 102)
    public final void method3679(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field9273++;
        try {
            class690.field9800 = this;
            if (arg7 > 48) {
                class524.field7544 = arg1;
                class581.field8223 = 0;
                class639.field8969 = null;
                class412.field6066 = arg3;
                class245.field3938 = arg3;
                class189.field3184 = 0;
                class660.field9408 = arg4;
                class205.field3443 = arg4;
                class530.field7619 = new Frame();
                class530.field7619.setTitle("Jagex");
                class530.field7619.setResizable(true);
                class530.field7619.addWindowListener(this);
                class530.field7619.setVisible(true);
                class530.field7619.toFront();
                Insets var9 = class530.field7619.getInsets();
                class530.field7619.setSize(class205.field3443 + var9.right + var9.left, class245.field3938 + var9.bottom - -var9.top);
                class682.field9653 = class706.field9962 = new class731(arg6, arg5, arg0, true);
                class162 var10 = class706.field9962.method4066(-24533, this, 1);
                while (var10.field2512 == 0) {
                    class484.method2932(true, 10L);
                }
            }
        } catch (Exception var12) {
            class333.method2135(var12, null, -76);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 144)
    private final void method3680(byte arg0) {
        field9272++;
        long var2 = class18.method109(-11121);
        long var4 = class100.field1483[class541.field7714];
        class100.field1483[class541.field7714] = var2;
        if (arg0 <= 59) {
            this.method3683(-52);
        }
        class541.field7714 = class541.field7714 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class261.field4065 = class355.field5384;
        }
        this.method2734(0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLjava/lang/String;)V", line = 176)
    public final void method3681(byte arg0, String arg1) {
        field9271++;
        if (this.field9282) {
            return;
        }
        int var3 = -8 % ((25 - arg0) / 42);
        this.field9282 = true;
        System.out.println("error_game_" + arg1);
        try {
            class284.method1862(class351.field5138, "loggedout", (byte) 47);
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)Z", line = 202)
    public final boolean method3682(boolean arg0) {
        field9304++;
        if (!arg0) {
            field9296 = null;
        }
        return class541.method3169("jagmisc", 99);
    }

    @OriginalMember(owner = "client!dh", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 221)
    public static final void provideLoaderApplet(Applet arg0) {
        field9308++;
        class351.field5138 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 230)
    private final void method3683(int arg0) {
        field9277++;
        if (arg0 != -3096) {
            this.destroy();
        }
        long var2 = class18.method109(-11121);
        long var4 = class247.field3959[class693.field9828];
        class247.field3959[class693.field9828] = var2;
        class693.field9828 = class693.field9828 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class595.field8435 = ((var6 >> 1) + 32000) / var6;
        }
        if (class544.field7775++ > 50) {
            class544.field7775 -= 50;
            class468.field6816 = true;
            class400.field5941.setSize(class660.field9408, class412.field6066);
            class400.field5941.setVisible(true);
            if (class530.field7619 != null && class196.field3382 == null) {
                Insets var7 = class530.field7619.getInsets();
                class400.field5941.setLocation(class189.field3184 + var7.left, class581.field8223 + var7.top);
            } else {
                class400.field5941.setLocation(class189.field3184, class581.field8223);
            }
        }
        this.method2741(-96);
    }

    @OriginalMember(owner = "client!dh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 273)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field9294++;
    }

    @OriginalMember(owner = "client!dh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 281)
    public final URL getDocumentBase() {
        field9312++;
        if (class530.field7619 == null) {
            return class351.field5138 == null || class351.field5138 == this ? super.getDocumentBase() : class351.field5138.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 302)
    public final URL getCodeBase() {
        field9310++;
        if (class530.field7619 == null) {
            return class351.field5138 == null || class351.field5138 == this ? super.getCodeBase() : class351.field5138.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 318)
    public final void windowClosing(WindowEvent arg0) {
        field9283++;
        this.destroy();
    }

    @OriginalMember(owner = "client!dh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 328)
    public final String getParameter(String arg0) {
        field9292++;
        if (class530.field7619 == null) {
            return class351.field5138 == null || class351.field5138 == this ? super.getParameter(arg0) : class351.field5138.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 353)
    public final void focusGained(FocusEvent arg0) {
        field9295++;
        class355.field5384 = true;
        class468.field6816 = true;
    }

    @OriginalMember(owner = "client!dh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 365)
    public final void focusLost(FocusEvent arg0) {
        class355.field5384 = false;
        field9302++;
    }

    @OriginalMember(owner = "client!dh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 373)
    public final void windowDeactivated(WindowEvent arg0) {
        field9311++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILjava/lang/String;BIII)V", line = 380)
    public final void method3684(int arg0, int arg1, String arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -111) {
            return;
        }
        field9274++;
        try {
            if (class690.field9800 == null) {
                class639.field8969 = class351.field5138;
                class581.field8223 = 0;
                class524.field7544 = arg4;
                class690.field9800 = this;
                class660.field9408 = arg1;
                class205.field3443 = arg1;
                class412.field6066 = arg0;
                class245.field3938 = arg0;
                class189.field3184 = 0;
                class682.field9653 = class706.field9962 = new class731(arg5, arg2, arg6, class351.field5138 != null);
                class162 var8 = class706.field9962.method4066(-24533, this, 1);
                while (var8.field2512 == 0) {
                    class484.method2932(true, 10L);
                }
            } else {
                class605.field8554++;
                if (class605.field8554 >= 3) {
                    this.method3681((byte) -101, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class333.method2135(var10, null, -70);
            this.method3681((byte) -64, "crash");
        }
    }

    @OriginalMember(owner = "client!dh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 427)
    public final void windowDeiconified(WindowEvent arg0) {
        field9288++;
    }

    @OriginalMember(owner = "client!dh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 442)
    public final synchronized void paint(Graphics arg0) {
        field9279++;
        if (class690.field9800 != this || class103.field1534) {
            return;
        }
        class468.field6816 = true;
        if (class260.field4062 && (class18.method109(-11121) - class496.field7171) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class205.field3443 && class245.field3938 <= var2.height) {
                class384.field5755 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 464)
    public final void windowOpened(WindowEvent arg0) {
        field9284++;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)Z", line = 474)
    public final boolean method3685(int arg0) {
        field9306++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else if (arg0 == 1733) {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method3681((byte) 79, "invalidhost");
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "start", descriptor = "()V", line = 520)
    public final void start() {
        field9293++;
        if (class690.field9800 == this && !class103.field1534) {
            class452.field6573 = 0L;
        }
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V", line = 532)
    public synchronized void method2726(int arg0) {
        if (class400.field5941 != null) {
            class400.field5941.removeFocusListener(this);
            class400.field5941.getParent().setBackground(Color.black);
            class400.field5941.getParent().remove(class400.field5941);
        }
        field9303++;
        Container var2;
        if (class196.field3382 != null) {
            var2 = class196.field3382;
        } else if (class530.field7619 != null) {
            var2 = class530.field7619;
        } else if (class351.field5138 == null) {
            var2 = class690.field9800;
        } else {
            var2 = class351.field5138;
        }
        var2.setLayout(null);
        class400.field5941 = new class530(this);
        var2.add(class400.field5941);
        class400.field5941.setSize(class660.field9408, class412.field6066);
        class400.field5941.setVisible(true);
        if (class530.field7619 == var2) {
            Insets var3 = class530.field7619.getInsets();
            class400.field5941.setLocation(class189.field3184 + var3.left, class581.field8223 + var3.top);
        } else {
            class400.field5941.setLocation(class189.field3184, class581.field8223);
        }
        class400.field5941.addFocusListener(this);
        class400.field5941.requestFocus();
        class261.field4065 = true;
        class355.field5384 = true;
        class468.field6816 = true;
        if (arg0 != 19375) {
            field9289 = null;
        }
        class384.field5755 = false;
        class496.field7171 = class18.method109(arg0 - 30496);
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V", line = 584)
    public static void method3686(byte arg0) {
        field9296 = null;
        field9290 = null;
        field9289 = null;
        field9299 = null;
        int var1 = 81 % ((36 - arg0) / 45);
        field9291 = null;
        field9280 = null;
    }

    @OriginalMember(owner = "client!dh", name = "run", descriptor = "()V", line = 601)
    public final void run() {
        field9301++;
        try {
            if (class731.field10266 != null) {
                String var1 = class731.field10266.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class731.field10273;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3681((byte) 126, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class731.field10273 == null || class731.field10273.equals("1.4.2"))) {
                    this.method3681((byte) 112, "wrongjava");
                    return;
                }
            }
            if (class731.field10273 != null && class731.field10273.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class731.field10273.length() > var3) {
                    char var5 = class731.field10273.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class260.field4062 = true;
                }
            }
            Applet var6 = class690.field9800;
            if (class351.field5138 != null) {
                var6 = class351.field5138;
            }
            Method var7 = class731.field10271;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class553.method3227(54);
            class634.method3586(-32);
            this.method2726(19375);
            this.method2729(true);
            class751.field10473 = class167.method1345(80);
            while (class452.field6573 == 0L || class452.field6573 > class18.method109(-11121)) {
                class398.field5921 = class751.field10473.method3335(class12.field110, 0);
                for (int var8 = 0; var8 < class398.field5921; var8++) {
                    this.method3680((byte) 77);
                }
                this.method3683(-3096);
                class347.method2214(class706.field9962, 0, class400.field5941);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class333.method2135(var20, this.method2736(0), -110);
            this.method3681((byte) 85, "crash");
        } finally {
            Object var13 = null;
            this.method3677((byte) 84, true);
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)V", line = 725)
    public static final void method3687(byte arg0) {
        field9281++;
        if (!class658.field9364 && arg0 == 27) {
            class658.field9364 = true;
            class218.field3575 = true;
            class393.field5872 += (12.0F - class393.field5872) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!dh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 744)
    public final void windowIconified(WindowEvent arg0) {
        field9275++;
    }

    @OriginalMember(owner = "client!dh", name = "destroy", descriptor = "()V", line = 752)
    public final void destroy() {
        field9305++;
        if (class690.field9800 == this && !class103.field1534) {
            class452.field6573 = class18.method109(-11121);
            class484.method2932(true, 5000L);
            class682.field9653 = null;
            this.method3677((byte) 69, false);
        }
    }

    @OriginalMember(owner = "client!dh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 768)
    public final void windowClosed(WindowEvent arg0) {
        field9285++;
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(B)Z", line = 785)
    public final boolean method3688(byte arg0) {
        if (arg0 == -6) {
            field9287++;
            return class541.method3169("jagtheora", -82);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 798)
    public final AppletContext getAppletContext() {
        field9309++;
        if (class530.field7619 == null) {
            return class351.field5138 == null || class351.field5138 == this ? super.getAppletContext() : class351.field5138.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "stop", descriptor = "()V", line = 812)
    public final void stop() {
        field9300++;
        if (class690.field9800 == this && !class103.field1534) {
            class452.field6573 = class18.method109(-11121) + 4000L;
        }
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)Ljava/lang/String;", line = 825)
    public String method2736(int arg0) {
        if (arg0 != 0) {
            this.windowActivated(null);
        }
        field9307++;
        return null;
    }

    @OriginalMember(owner = "client!dh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V")
    public abstract void method2733(byte arg0);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public abstract void method2725(int arg0);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public abstract void method2741(int arg0);

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public abstract void method2734(int arg0);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
    public abstract void method2729(boolean arg0);
}
