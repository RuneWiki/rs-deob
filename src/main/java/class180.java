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

@OriginalClass("client!th")
public abstract class class180 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Z")
    private boolean field3448 = false;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Z")
    public static boolean field3415 = false;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lai;")
    private static class10 field3417 = class44.method278("Attack", 117);

    @OriginalMember(owner = "client!th", name = "F", descriptor = "Lai;")
    public static class10 field3446 = field3417;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Lai;")
    public static class10 field3431 = class44.method278("Titelbild geladen)3", 114);

    @OriginalMember(owner = "client!th", name = "N", descriptor = "Lai;")
    public static class10 field3454 = class44.method278("Sie haben gerade eine andere Welt verlassen)3", -7);

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static volatile int field3428 = -1;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "Lai;")
    private static class10 field3455 = class44.method278("Loaded update list", -34);

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Lai;")
    public static class10 field3452 = field3455;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lwg;")
    public static class206 field3418;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Lc;")
    public static class21 field3432;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "Z")
    public static boolean field3459;

    @OriginalMember(owner = "client!th", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3451++;
        if (class122.field2342 == this && !class98.field1813) {
            class145.field2782 = class80.method491(2);
            class172.method1130(5000L, (byte) -79);
            class49.field856 = null;
            this.method1162(30978);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1159(int arg0, byte[] arg1) {
        if (arg0 != 7731) {
            field3454 = null;
        }
        field3457++;
        class114 var2 = new class114(arg1);
        int var3 = var2.method767(true);
        int var4 = var2.method761(255);
        if (var4 < 0 || class67.field1177 != 0 && class67.field1177 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method776(var4, var7, 0, (byte) -100);
            return var7;
        } else {
            int var5 = var2.method761(arg0 ^ 0x1ECC);
            if (var5 < 0 || class67.field1177 != 0 && class67.field1177 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class202.method1316(var6, var5, arg1, var4, 9);
            } else {
                class37.field582.method1115(var2, var6, (byte) 101);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!th", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3443++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public abstract void method190(int arg0);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static void method1160(int arg0) {
        field3418 = null;
        field3431 = null;
        field3417 = null;
        if (arg0 != -10138) {
            return;
        }
        field3452 = null;
        field3432 = null;
        field3446 = null;
        field3455 = null;
        field3454 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1161(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        try {
            class194.field3690 = arg3;
            class196.field3716 = arg5;
            class154.field2976 = arg6;
            class122.field2342 = this;
            client.field448 = new Frame();
            client.field448.setTitle("Jagex");
            client.field448.setResizable(false);
            client.field448.addWindowListener(this);
            client.field448.setVisible(true);
            client.field448.toFront();
            Insets var8 = client.field448.getInsets();
            client.field448.setSize(arg3 + var8.right + var8.left, var8.top + arg5 + var8.bottom);
            class49.field856 = class120.field2313 = new class81(true, null, arg0, arg4, arg1);
            class120.field2313.method494(arg2, this, 110);
        } catch (Exception var10) {
            class109.method700(var10, null, (byte) -123);
        }
        field3453++;
    }

    @OriginalMember(owner = "client!th", name = "start", descriptor = "()V")
    public final void start() {
        field3450++;
        if (class122.field2342 == this && !class98.field1813) {
            class145.field2782 = 0L;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    private final synchronized void method1162(int arg0) {
        field3442++;
        if (class98.field1813) {
            return;
        }
        class98.field1813 = true;
        try {
            class134.field2513.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method194((byte) 73);
        } catch (Exception var4) {
        }
        if (arg0 != 30978) {
            return;
        }
        if (client.field448 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class120.field2313 != null) {
            try {
                class120.field2313.method497(6486);
            } catch (Exception var2) {
            }
        }
        this.method187((byte) -90);
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public abstract void method195(int arg0);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lbf;IIIIB)V")
    public static final void method1163(class17 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3422++;
        if (arg5 != 44) {
            field3446 = null;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = class53.field950 + class171.field3316 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class113.field2124[var6];
        int var9 = var8 * 256 / (class42.field698 + 256);
        int var10 = class113.field2120[var6];
        int var11 = var10 * 256 / (class42.field698 + 256);
        int var12 = arg3 * var11 - arg2 * var9 >> 16;
        int var13 = arg3 * var9 + arg2 * var11 >> 16;
        if (var7 <= 2500) {
            arg0.method105(arg1 + var13 + 94 + 4 - arg0.field256 / 2, -(arg0.field260 / 2) + -4 + 83 + arg4 + -var12);
        } else {
            arg0.method123(class101.field1905, arg1 + var13 + 94 + 4 - arg0.field256 / 2, arg4 - arg0.field260 / 2 + 83 + -4 + -var12);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)I")
    public static final int method1164(int arg0, byte arg1) {
        int var2 = -89 % ((-arg1 - 4) / 52);
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * arg0 >> 12) * arg0 >> 12;
        field3458++;
        int var5 = (arg0 * var3 >> 12) + 40960;
        return var4 * var5 >> 12;
    }

    @OriginalMember(owner = "client!th", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3447++;
        if (class122.field2342 != this || class98.field1813) {
            return;
        }
        class87.field1550 = true;
        if (class81.field1409 != null && class81.field1409.startsWith("1.5") && class80.method491(2) - class68.field1189 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class194.field3690 && class196.field3716 <= var2.height) {
                class10.field125 = true;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3429++;
        if (client.field448 == null) {
            return class120.field2313 == null || class120.field2313.field1410 == this ? super.getCodeBase() : class120.field2313.field1410.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "providesignlink", descriptor = "(Lih;)V")
    public static final void providesignlink(class81 arg0) {
        field3425++;
        class120.field2313 = arg0;
        class49.field856 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3437++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Z")
    public static final boolean method1165(int arg0, int arg1) {
        field3438++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = 22 % ((arg1 - 10) / 52);
        int var3 = class75.field1308[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        return var3 == 1002;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1166(String arg0, byte arg1) {
        field3421++;
        if (this.field3448) {
            return;
        }
        this.field3448 = true;
        System.out.println("error_game_" + arg0);
        if (arg1 != -52) {
            this.field3448 = true;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!th", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3456++;
        if (client.field448 == null) {
            return class120.field2313 == null || class120.field2313.field1410 == this ? super.getParameter(arg0) : class120.field2313.field1410.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
    private final void method1167(int arg0) {
        field3439++;
        long var2 = class80.method491(2);
        int var4 = 43 / ((20 - arg0) / 41);
        long var5 = class87.field1546[class26.field395];
        class87.field1546[class26.field395] = var2;
        if (var5 != 0L && var2 > var5) {
            int var7 = (int) (var2 - var5);
            class142.field2677 = ((var7 >> 1) + 32000) / var7;
        }
        class26.field395 = class26.field395 + 1 & 0x1F;
        if (class149.field2867++ > 50) {
            class149.field2867 -= 50;
            class87.field1550 = true;
            class134.field2513.setSize(class194.field3690, class196.field3716);
            class134.field2513.setVisible(true);
            if (client.field448 == null) {
                class134.field2513.setLocation(0, 0);
            } else {
                Insets var8 = client.field448.getInsets();
                class134.field2513.setLocation(var8.left, var8.top);
            }
        }
        this.method190(-80);
    }

    @OriginalMember(owner = "client!th", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3430++;
    }

    @OriginalMember(owner = "client!th", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3426++;
    }

    @OriginalMember(owner = "client!th", name = "stop", descriptor = "()V")
    public final void stop() {
        field3434++;
        if (class122.field2342 == this && !class98.field1813) {
            class145.field2782 = class80.method491(2) + 4000L;
        }
    }

    @OriginalMember(owner = "client!th", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3435++;
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public abstract void method186(int arg0);

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public final synchronized void method1168(int arg0) {
        field3420++;
        Container var2;
        if (client.field448 == null) {
            var2 = class120.field2313.field1410;
        } else {
            var2 = client.field448;
        }
        if (class134.field2513 != null) {
            class134.field2513.removeFocusListener(this);
            var2.remove(class134.field2513);
        }
        class134.field2513 = new class133(this);
        var2.add(class134.field2513);
        class134.field2513.setSize(class194.field3690, class196.field3716);
        class134.field2513.setVisible(true);
        if (client.field448 == null) {
            class134.field2513.setLocation(0, 0);
        } else {
            Insets var3 = client.field448.getInsets();
            class134.field2513.setLocation(var3.left, var3.top);
        }
        class134.field2513.addFocusListener(this);
        class134.field2513.requestFocus();
        class87.field1550 = true;
        class10.field125 = false;
        if (arg0 >= -16) {
            field3417 = null;
        }
        class68.field1189 = class80.method491(2);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public abstract void method194(byte arg0);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public abstract void method187(byte arg0);

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)Z")
    public final boolean method1169(int arg0) {
        field3436++;
        if (arg0 != 48) {
            providesignlink(null);
        }
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
                this.method1166("invalidhost", (byte) -52);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3444++;
        if (client.field448 == null) {
            return class120.field2313 == null || class120.field2313.field1410 == this ? super.getAppletContext() : class120.field2313.field1410.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class171.field3317 = true;
        class87.field1550 = true;
        field3441++;
    }

    @OriginalMember(owner = "client!th", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3445++;
        if (client.field448 == null) {
            return class120.field2313 == null || class120.field2313.field1410 == this ? super.getDocumentBase() : class120.field2313.field1410.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
    public final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3449++;
        try {
            if (class122.field2342 == null) {
                class196.field3716 = arg2;
                class194.field3690 = arg4;
                class154.field2976 = arg0;
                if (arg1 == 27910) {
                    class122.field2342 = this;
                    if (class120.field2313 == null) {
                        class49.field856 = class120.field2313 = new class81(false, this, arg3, null, 0);
                    }
                    class120.field2313.method494(1, this, 111);
                }
            } else {
                class179.field3412++;
                if (class179.field3412 >= 3) {
                    this.method1166("alreadyloaded", (byte) -52);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class109.method700(var7, null, (byte) -112);
            this.method1166("crash", (byte) -52);
        }
    }

    @OriginalMember(owner = "client!th", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3416++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
    public final void run() {
        field3423++;
        try {
            if (class81.field1412 != null) {
                String var1 = class81.field1412.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class81.field1409;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1166("wrongjava", (byte) -52);
                        return;
                    }
                    class20.field304 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class81.field1409 == null || class81.field1409.equals("1.4.2"))) {
                    this.method1166("wrongjava", (byte) -52);
                    return;
                }
            }
            if (class120.field2313.field1410 != null) {
                Method var3 = class81.field1422;
                if (var3 != null) {
                    try {
                        var3.invoke(class120.field2313.field1410, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1168(-33);
            class190.field3622 = class163.method1077((byte) -30, class134.field2513, class194.field3690, class196.field3716);
            this.method195(-10153);
            class176.field3372 = class108.method694(true);
            while (class145.field2782 == 0L || class80.method491(2) < class145.field2782) {
                class61.field1038 = class176.field3372.method19(-580924254, class20.field304, class35.field552);
                for (int var4 = 0; var4 < class61.field1038; var4++) {
                    this.method1171(24156);
                }
                this.method1167(-50);
                class89.method549(class134.field2513, false, class120.field2313);
            }
        } catch (Exception var7) {
            class109.method700(var7, null, (byte) -126);
            this.method1166("crash", (byte) -52);
        }
        this.method1162(30978);
    }

    @OriginalMember(owner = "client!th", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class171.field3317 = false;
        field3419++;
    }

    @OriginalMember(owner = "client!th", name = "i", descriptor = "(I)V")
    private final void method1171(int arg0) {
        long var2 = class80.method491(arg0 ^ 0x5E5E);
        field3440++;
        long var4 = class115.field2213[class89.field1571];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class115.field2213[class89.field1571] = var2;
        class89.field1571 = class89.field1571 + 1 & 0x1F;
        if (arg0 == 24156) {
            synchronized (this) {
                class96.field1772 = class171.field3317;
            }
            this.method186(11);
        }
    }

    @OriginalMember(owner = "client!th", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3424++;
    }

    @OriginalMember(owner = "client!th", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!th", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3427++;
        this.destroy();
    }
}
