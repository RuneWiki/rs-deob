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

@OriginalClass("ua")
public abstract class class185 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "ua", name = "l", descriptor = "Z")
    private boolean field3499 = false;

    @OriginalMember(owner = "ua", name = "g", descriptor = "[I")
    public static int[] field3494 = new int[4000];

    @OriginalMember(owner = "ua", name = "y", descriptor = "Lwa;")
    public static class203 field3512 = new class203(5000);

    @OriginalMember(owner = "ua", name = "M", descriptor = "I")
    public static int field3524 = 0;

    @OriginalMember(owner = "ua", name = "J", descriptor = "Llf;")
    private static class109 field3521 = class35.method275("Login", 2);

    @OriginalMember(owner = "ua", name = "O", descriptor = "Llf;")
    public static class109 field3526 = field3521;

    @OriginalMember(owner = "ua", name = "N", descriptor = "Z")
    public static boolean field3525 = false;

    @OriginalMember(owner = "ua", name = "L", descriptor = "Llf;")
    public static class109 field3523 = class35.method275("hitmarks", 2);

    @OriginalMember(owner = "ua", name = "T", descriptor = "Llf;")
    public static class109 field3531 = class35.method275("Titelbild geladen)3", 2);

    @OriginalMember(owner = "ua", name = "P", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "ua", name = "R", descriptor = "[I")
    public static int[] field3529 = new int[25];

    @OriginalMember(owner = "ua", name = "a", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "ua", name = "b", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "ua", name = "c", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "ua", name = "d", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "ua", name = "e", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "ua", name = "f", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "ua", name = "h", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "ua", name = "i", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "ua", name = "j", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "ua", name = "k", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "ua", name = "m", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "ua", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "ua", name = "o", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "ua", name = "p", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "ua", name = "q", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "ua", name = "r", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "ua", name = "s", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "ua", name = "t", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "ua", name = "u", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "ua", name = "v", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "ua", name = "w", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "ua", name = "x", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "ua", name = "z", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "ua", name = "A", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "ua", name = "B", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "ua", name = "C", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "ua", name = "D", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "ua", name = "F", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "ua", name = "G", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "ua", name = "H", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "ua", name = "Q", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "ua", name = "S", descriptor = "Lbg;")
    public static class18 field3530;

    @OriginalMember(owner = "ua", name = "U", descriptor = "Z")
    public static boolean field3532;

    @OriginalMember(owner = "ua", name = "K", descriptor = "[I")
    public static int[] field3522;

    @OriginalMember(owner = "ua", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1249(byte arg0, String arg1) {
        field3495++;
        if (arg0 >= -31) {
            field3526 = null;
        }
        if (this.field3499) {
            return;
        }
        this.field3499 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "ua", name = "providesignlink", descriptor = "(Lke;)V")
    public static final void providesignlink(class99 arg0) {
        field3504++;
        class49.field1009 = arg0;
        class102.field2023 = arg0;
    }

    @OriginalMember(owner = "ua", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3516++;
        if (class26.field558 == null) {
            return class49.field1009 == null || class49.field1009.field2001 == this ? super.getDocumentBase() : class49.field1009.field2001.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "ua", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3502++;
        if (class201.field3970 == this && !class205.field4027) {
            class118.field2326 = class123.method880(false);
            class54.method354(5000L, 122);
            class102.field2023 = null;
            this.method1258((byte) 112);
        }
    }

    @OriginalMember(owner = "ua", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3507++;
    }

    @OriginalMember(owner = "ua", name = "a", descriptor = "(IIBII)V")
    public final void method1250(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3497++;
        try {
            if (class201.field3970 == null) {
                class5.field73 = arg4;
                class137.field2647 = arg0;
                int var6 = -92 % ((-arg2 - 58) / 53);
                class201.field3970 = this;
                class140.field2709 = arg1;
                if (class49.field1009 == null) {
                    class102.field2023 = class49.field1009 = new class99(false, this, arg3, null, 0);
                }
                class49.field1009.method694(this, 1, (byte) 46);
            } else {
                class197.field3775++;
                if (class197.field3775 >= 3) {
                    this.method1249((byte) -107, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class9.method43(null, -106, var8);
            this.method1249((byte) -73, "crash");
        }
    }

    @OriginalMember(owner = "ua", name = "run", descriptor = "()V")
    public final void run() {
        field3490++;
        try {
            if (class99.field1995 != null) {
                String var1 = class99.field1995.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class99.field2000;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1249((byte) -72, "wrongjava");
                        return;
                    }
                    class85.field1744 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class99.field2000 == null || class99.field2000.equals("1.4.2"))) {
                    this.method1249((byte) -44, "wrongjava");
                    return;
                }
            }
            if (class49.field1009.field2001 != null) {
                Method var3 = class99.field1992;
                if (var3 != null) {
                    try {
                        var3.invoke(class49.field1009.field2001, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1251(0);
            class68.field1320 = class83.method529(-3503, class140.field2709, class137.field2647, class6.field88);
            this.method256(40000);
            class144.field2778 = class145.method1019(31379);
            while (class118.field2326 == 0L || class118.field2326 > class123.method880(false)) {
                class118.field2322 = class144.field2778.method872(class139.field2694, class85.field1744, (byte) -58);
                for (int var4 = 0; var4 < class118.field2322; var4++) {
                    this.method1256(true);
                }
                this.method1259((byte) -127);
                class148.method1040(class49.field1009, 0, class6.field88);
            }
        } catch (Exception var7) {
            class9.method43(null, -90, var7);
            this.method1249((byte) -116, "crash");
        }
        this.method1258((byte) 42);
    }

    @OriginalMember(owner = "ua", name = "a", descriptor = "(I)V")
    public final synchronized void method1251(int arg0) {
        field3496++;
        if (arg0 != 0) {
            field3528 = 41;
        }
        Container var2;
        if (class26.field558 == null) {
            var2 = class49.field1009.field2001;
        } else {
            var2 = class26.field558;
        }
        if (class6.field88 != null) {
            class6.field88.removeFocusListener(this);
            var2.remove(class6.field88);
        }
        class6.field88 = new class144(this);
        var2.add(class6.field88);
        class6.field88.setSize(class137.field2647, class140.field2709);
        class6.field88.setVisible(true);
        if (class26.field558 == null) {
            class6.field88.setLocation(0, 0);
        } else {
            Insets var3 = class26.field558.getInsets();
            class6.field88.setLocation(var3.left, var3.top);
        }
        class6.field88.addFocusListener(this);
        class6.field88.requestFocus();
        class80.field1589 = true;
        class173.field3234 = false;
        class1.field6 = class123.method880(false);
    }

    @OriginalMember(owner = "ua", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3518++;
        if (class26.field558 == null) {
            return class49.field1009 == null || class49.field1009.field2001 == this ? super.getParameter(arg0) : class49.field1009.field2001.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "ua", name = "a", descriptor = "(Z)V")
    public abstract void method260(boolean arg0);

    @OriginalMember(owner = "ua", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3517++;
        class15.field288 = true;
        class80.field1589 = true;
    }

    @OriginalMember(owner = "ua", name = "a", descriptor = "(IIB)V")
    public static final void method1252(int arg0, int arg1, byte arg2) {
        field3493++;
        class161 var3 = class123.method883(true, arg0);
        int var4 = var3.field3019;
        if (arg2 <= 8) {
            field3528 = 34;
        }
        int var5 = var3.field3024;
        int var6 = var3.field3026;
        int var7 = client.field676[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class187.field3564[var4] = class31.method262(class170.method1140(class187.field3564[var4], ~var8), class170.method1140(var8, arg1 << var5));
    }

    @OriginalMember(owner = "ua", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1253(boolean arg0, int arg1) {
        field3520++;
        if (class36.field798[arg1]) {
            return true;
        } else if (class55.field1105.method159(arg1, (byte) 103)) {
            int var2 = class55.field1105.method167((byte) 90, arg1);
            if (var2 == 0) {
                class36.field798[arg1] = true;
                return true;
            }
            if (class169.field3146[arg1] == null) {
                class169.field3146[arg1] = new class200[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class169.field3146[arg1][var3] == null) {
                    byte[] var4 = class55.field1105.method147(0, var3, arg1);
                    if (var4 != null) {
                        class169.field3146[arg1][var3] = new class200();
                        class169.field3146[arg1][var3].field3866 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class169.field3146[arg1][var3].method1318(1, new class86(var4));
                        } else {
                            class169.field3146[arg1][var3].method1317((byte) 95, new class86(var4));
                        }
                    }
                }
            }
            class36.field798[arg1] = true;
            if (arg0) {
                method1252(-128, -98, (byte) -54);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ua", name = "b", descriptor = "(I)V")
    public static void method1254(int arg0) {
        field3526 = null;
        field3531 = null;
        field3512 = null;
        field3521 = null;
        field3523 = null;
        field3529 = null;
        if (arg0 == 31) {
            field3522 = null;
            field3494 = null;
            field3530 = null;
        }
    }

    @OriginalMember(owner = "ua", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3506++;
    }

    @OriginalMember(owner = "ua", name = "b", descriptor = "(Z)Z")
    public final boolean method1255(boolean arg0) {
        field3498++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (!arg0) {
                field3522 = null;
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1249((byte) -74, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "ua", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3503++;
    }

    @OriginalMember(owner = "ua", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3491++;
    }

    @OriginalMember(owner = "ua", name = "c", descriptor = "(I)V")
    public abstract void method253(int arg0);

    @OriginalMember(owner = "ua", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3505++;
    }

    @OriginalMember(owner = "ua", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3514++;
    }

    @OriginalMember(owner = "ua", name = "c", descriptor = "(Z)V")
    private final void method1256(boolean arg0) {
        field3508++;
        long var2 = class123.method880(false);
        long var4 = class163.field3050[class96.field1957];
        class163.field3050[class96.field1957] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class96.field1957 = class96.field1957 + 1 & 0x1F;
        if (arg0) {
            synchronized (this) {
                class205.field4021 = class15.field288;
            }
            this.method258((byte) -104);
        }
    }

    @OriginalMember(owner = "ua", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3488++;
        if (class201.field3970 != this || class205.field4027) {
            return;
        }
        class80.field1589 = true;
        if (class99.field2000 != null && class99.field2000.startsWith("1.5") && class123.method880(false) - class1.field6 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class137.field2647 && class140.field2709 <= var2.height) {
                class173.field3234 = true;
            }
        }
    }

    @OriginalMember(owner = "ua", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method1257(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class137.field2647 = arg0;
            class140.field2709 = arg4;
            class201.field3970 = this;
            class5.field73 = arg1;
            class26.field558 = new Frame();
            class26.field558.setTitle("Jagex");
            int var8 = 20 / ((arg3 + 13) / 33);
            class26.field558.setResizable(false);
            class26.field558.addWindowListener(this);
            class26.field558.setVisible(true);
            class26.field558.toFront();
            Insets var9 = class26.field558.getInsets();
            class26.field558.setSize(var9.left + arg0 + var9.right, var9.bottom + arg4 - -var9.top);
            class102.field2023 = class49.field1009 = new class99(true, null, arg5, arg2, arg6);
            class49.field1009.method694(this, 1, (byte) 46);
        } catch (Exception var11) {
            class9.method43(null, -78, var11);
        }
        field3509++;
    }

    @OriginalMember(owner = "ua", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "ua", name = "a", descriptor = "(B)V")
    public abstract void method258(byte arg0);

    @OriginalMember(owner = "ua", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3513++;
    }

    @OriginalMember(owner = "ua", name = "b", descriptor = "(B)V")
    private final synchronized void method1258(byte arg0) {
        field3489++;
        if (class205.field4027) {
            return;
        }
        class205.field4027 = true;
        try {
            class6.field88.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method260(true);
        } catch (Exception var4) {
        }
        if (arg0 <= 17) {
            field3524 = -43;
        }
        if (class26.field558 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class49.field1009 != null) {
            try {
                class49.field1009.method700(false);
            } catch (Exception var2) {
            }
        }
        this.method257((byte) 2);
    }

    @OriginalMember(owner = "ua", name = "start", descriptor = "()V")
    public final void start() {
        field3515++;
        if (class201.field3970 == this && !class205.field4027) {
            class118.field2326 = 0L;
        }
    }

    @OriginalMember(owner = "ua", name = "stop", descriptor = "()V")
    public final void stop() {
        field3510++;
        if (class201.field3970 == this && !class205.field4027) {
            class118.field2326 = class123.method880(false) + 4000L;
        }
    }

    @OriginalMember(owner = "ua", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3511++;
        if (class26.field558 == null) {
            return class49.field1009 == null || class49.field1009.field2001 == this ? super.getAppletContext() : class49.field1009.field2001.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "ua", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3501++;
        if (class26.field558 == null) {
            return class49.field1009 == null || class49.field1009.field2001 == this ? super.getCodeBase() : class49.field1009.field2001.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "ua", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3500++;
        class15.field288 = false;
    }

    @OriginalMember(owner = "ua", name = "c", descriptor = "(B)V")
    private final void method1259(byte arg0) {
        field3519++;
        long var2 = class123.method880(false);
        int var4 = 118 % ((-arg0 - 64) / 47);
        long var5 = class95.field1947[class83.field1686];
        class95.field1947[class83.field1686] = var2;
        if (var5 != 0L && var2 > var5) {
            int var7 = (int) (var2 - var5);
            class147.field2826 = ((var7 >> 1) + 32000) / var7;
        }
        class83.field1686 = class83.field1686 + 1 & 0x1F;
        if (class19.field429++ > 50) {
            class19.field429 -= 50;
            class80.field1589 = true;
            class6.field88.setSize(class137.field2647, class140.field2709);
            class6.field88.setVisible(true);
            if (class26.field558 == null) {
                class6.field88.setLocation(0, 0);
            } else {
                Insets var8 = class26.field558.getInsets();
                class6.field88.setLocation(var8.left, var8.top);
            }
        }
        this.method253(16);
    }

    @OriginalMember(owner = "ua", name = "d", descriptor = "(B)V")
    public abstract void method257(byte arg0);

    @OriginalMember(owner = "ua", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3492++;
    }

    @OriginalMember(owner = "ua", name = "d", descriptor = "(I)V")
    public abstract void method256(int arg0);
}
