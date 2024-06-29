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

@OriginalClass("client!og")
public abstract class class457 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!og", name = "t", descriptor = "Z")
    private boolean field6834 = false;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "Z")
    private boolean field6836 = false;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "Lan;")
    public static class20 field6841 = new class20(8);

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field6848 = 0;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field6854 = 64;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "Lrn;")
    public static class174 field6850 = new class174(7, 15);

    @OriginalMember(owner = "client!og", name = "O", descriptor = "F")
    public static float field6855;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "Lbu;")
    public static class17 field6853;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "Lkb;")
    public static class485 field6847;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "Z")
    public static boolean field6860;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "Z")
    public static boolean field6861;

    @OriginalMember(owner = "client!og", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final synchronized void paint(Graphics arg0) {
        field6828++;
        if (class476.field7115 != this || class77.field1303) {
            return;
        }
        class455.field6788 = true;
        if (class413.field6173 && (class211.method1419(12921) - class122.field1983) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class431.field6418 <= var2.width && var2.height >= class420.field6275) {
                class177.field2700 = true;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 27)
    public static void method2717(int arg0) {
        field6847 = null;
        if (arg0 < 64) {
            field6847 = null;
        }
        field6841 = null;
        field6850 = null;
        field6853 = null;
    }

    @OriginalMember(owner = "client!og", name = "run", descriptor = "()V", line = 41)
    public final void run() {
        field6837++;
        try {
            label110: {
                if (class293.field4165 != null) {
                    String var1 = class293.field4165.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class293.field4169;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2719("wrongjava", 1);
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class293.field4169 == null || class293.field4169.equals("1.4.2"))) {
                        this.method2719("wrongjava", 1);
                        break label110;
                    }
                }
                if (class293.field4169 != null && class293.field4169.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class293.field4169.length()) {
                        char var5 = class293.field4169.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class413.field6173 = true;
                    }
                }
                if (class368.field5553.field4170 != null) {
                    Method var6 = class293.field4186;
                    if (var6 != null) {
                        try {
                            var6.invoke(class368.field5553.field4170, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class102.method765((byte) -82);
                class130.method971(-31163);
                this.method2727(-68);
                this.method2728((byte) 87);
                this.method1335((byte) 93);
                field6847 = class87.method687(16565);
                this.method2728((byte) 77);
                while (class125.field2024 == 0L || class125.field2024 > class211.method1419(12921)) {
                    class528.field7793 = field6847.method885(-86, class138.field2223);
                    for (int var7 = 0; var7 < class528.field7793; var7++) {
                        this.method2724(9478);
                    }
                    this.method2725(true);
                    class57.method514(class370.field5611, class368.field5553, 1);
                }
            }
        } catch (Throwable var10) {
            class320.method2087(0, var10, this.method1339(0));
            this.method2719("crash", 1);
        }
        this.method2722(30699, true);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILm;IILqa;II)V", line = 159)
    public static final void method2718(int arg0, class126 arg1, int arg2, int arg3, class162 arg4, int arg5, int arg6) {
        field6816++;
        if (class368.field5569 < 100) {
            class90.method699(arg4, (byte) -126, arg1);
        }
        arg4.method298(arg3, arg6, arg2 + arg3, arg6 - -arg5);
        if (class368.field5569 < 100) {
            byte var7 = 20;
            int var8 = arg3 + (arg2 / 2);
            arg4.method253(arg3, arg6, arg2, arg5, -16777216, 0);
            int var9 = arg5 / 2 + arg6 - var7 - 18;
            arg4.method239(var8 - 152, var9, 304, 34, class111.field1875[class518.field7708].getRGB(), 0);
            arg4.method253(var8 - 150, var9 + 2, class368.field5569 * 3, 30, class215.field3097[class518.field7708].getRGB(), 0);
            class310.field4726.method2900(class412.field6161.method2180(client.field2870, 29491), class303.field4451[class518.field7708].getRGB(), -97, -1, var9 + var7, var8);
            return;
        }
        int var10 = class404.field6067 - ((int) ((float) arg2 / class509.field7493));
        int var11 = (int) ((float) arg5 / class509.field7493) + class158.field2464;
        int var12 = class404.field6067 + ((int) ((float) arg2 / class509.field7493));
        class274.field3937 = class158.field2464 - ((int) ((float) arg5 / class509.field7493));
        int var13 = class158.field2464 - ((int) ((float) arg5 / class509.field7493));
        class299.field4255 = (int) ((float) (arg2 * 2) / class509.field7493);
        if (arg0 < 99) {
            field6850 = null;
        }
        class416.field6222 = class404.field6067 - ((int) ((float) arg2 / class509.field7493));
        class306.field4682 = (int) ((float) (arg5 * 2) / class509.field7493);
        class509.method3039(var10 + class509.field7503, var11 - -class509.field7519, var12 + class509.field7503, class509.field7519 + var13, arg3, arg6, arg3 + arg2, arg5 + arg6 + 1);
        class509.method3044(arg4);
        class392 var14 = class509.method3043(arg4);
        class214.method1429(0, (byte) 124, arg4, var14, 0);
        if (class443.field6619 > 0) {
            class475.field7104--;
            if (class475.field7104 == 0) {
                class443.field6619--;
                class475.field7104 = 20;
            }
        }
        if (!class109.field1828) {
            return;
        }
        int var15 = arg3 + arg2 - 5;
        int var16 = arg5 + arg6 - 8;
        class464.field6944.method2906(13162, -1, var15, 16776960, var16, "Fps:" + class521.field7735);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class464.field6944.method2906(13162, -1, var15, var19, var20, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!og", name = "start", descriptor = "()V", line = 246)
    public final void start() {
        field6817++;
        if (class476.field7115 == this && !class77.field1303) {
            class125.field2024 = 0L;
        }
    }

    @OriginalMember(owner = "client!og", name = "providesignlink", descriptor = "(Lli;)V", line = 258)
    public static final void providesignlink(class293 arg0) {
        class368.field5553 = arg0;
        class107.field1781 = arg0;
        field6829++;
    }

    @OriginalMember(owner = "client!og", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 271)
    public final void windowOpened(WindowEvent arg0) {
        field6822++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 280)
    public final void method2719(String arg0, int arg1) {
        field6824++;
        if (arg1 != 1 || this.field6834) {
            return;
        }
        this.field6834 = true;
        System.out.println("error_game_" + arg0);
        try {
            class512.method3065("loggedout", class368.field5553.field4170, (byte) 10);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)Z", line = 306)
    public final boolean method2720(boolean arg0) {
        field6825++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (arg0) {
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
                this.method2719("invalidhost", 1);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 347)
    public final void windowDeiconified(WindowEvent arg0) {
        field6835++;
    }

    @OriginalMember(owner = "client!og", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 354)
    public final URL getCodeBase() {
        field6830++;
        if (class423.field6321 == null) {
            return class368.field5553 == null || class368.field5553.field4170 == this ? super.getCodeBase() : class368.field5553.field4170.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLjava/lang/String;IIIII)V", line = 371)
    public final void method2721(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 <= 82) {
            return;
        }
        field6846++;
        try {
            class466.field6952 = arg5;
            class431.field6418 = arg5;
            class77.field1297 = arg6;
            class420.field6275 = arg6;
            class5.field127 = 0;
            class414.field6183 = 0;
            class298.field4251 = arg4;
            class476.field7115 = this;
            class423.field6321 = new Frame();
            class423.field6321.setTitle("Jagex");
            class423.field6321.setResizable(true);
            class423.field6321.addWindowListener(this);
            class423.field6321.setVisible(true);
            class423.field6321.toFront();
            Insets var9 = class423.field6321.getInsets();
            class423.field6321.setSize(class431.field6418 + var9.left + var9.right, var9.top + var9.bottom + class420.field6275);
            class107.field1781 = class368.field5553 = new class293(null, arg3, arg2, arg7);
            class324 var10 = class368.field5553.method1859(1, true, this);
            while (var10.field4940 == 0) {
                class71.method583(10L, 29);
            }
        } catch (Exception var12) {
            class320.method2087(0, var12, null);
        }
    }

    @OriginalMember(owner = "client!og", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 412)
    public final void windowClosed(WindowEvent arg0) {
        field6843++;
    }

    @OriginalMember(owner = "client!og", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 421)
    public final void windowIconified(WindowEvent arg0) {
        field6851++;
    }

    @OriginalMember(owner = "client!og", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 428)
    public final URL getDocumentBase() {
        field6819++;
        if (class423.field6321 == null) {
            return class368.field5553 == null || class368.field5553.field4170 == this ? super.getDocumentBase() : class368.field5553.field4170.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 443)
    public final void focusLost(FocusEvent arg0) {
        field6856++;
        class272.field3932 = false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V", line = 452)
    private final void method2722(int arg0, boolean arg1) {
        field6827++;
        synchronized (this) {
            if (class77.field1303) {
                return;
            }
            class77.field1303 = true;
        }
        if (class368.field5553.field4170 != null) {
            class368.field5553.field4170.destroy();
        }
        if (arg0 != 30699) {
            this.destroy();
        }
        try {
            this.method1356(13);
        } catch (Exception var11) {
        }
        if (this.field6836) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field6836 = false;
        }
        class324 var4 = class368.field5553.method1865(false, class476.field7115.getClass());
        while (var4.field4940 == 0) {
            class71.method583(100L, -104);
        }
        if (class370.field5611 != null) {
            try {
                class370.field5611.removeFocusListener(this);
                class370.field5611.getParent().remove(class370.field5611);
            } catch (Exception var9) {
            }
        }
        if (class368.field5553 != null) {
            try {
                class368.field5553.method1847(0);
            } catch (Exception var8) {
            }
        }
        this.method1342(0);
        if (class423.field6321 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!og", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 531)
    public final String getParameter(String arg0) {
        field6838++;
        if (class423.field6321 == null) {
            return class368.field5553 == null || class368.field5553.field4170 == this ? super.getParameter(arg0) : class368.field5553.field4170.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 548)
    public final void focusGained(FocusEvent arg0) {
        class272.field3932 = true;
        field6820++;
        class455.field6788 = true;
    }

    @OriginalMember(owner = "client!og", name = "stop", descriptor = "()V", line = 558)
    public final void stop() {
        field6852++;
        if (class476.field7115 == this && !class77.field1303) {
            class125.field2024 = class211.method1419(12921) + 4000L;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z", line = 571)
    public static final boolean method2723(int arg0, int arg1, int arg2) {
        if (arg1 == -8) {
            field6823++;
            return class319.method2082(arg2, arg0, true) & class337.method2161(-88, arg2, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!og", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 583)
    public final void windowActivated(WindowEvent arg0) {
        field6831++;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Ljava/lang/String;", line = 591)
    public String method1339(int arg0) {
        if (arg0 == 0) {
            field6832++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V", line = 607)
    private final void method2724(int arg0) {
        field6845++;
        long var2 = class211.method1419(12921);
        if (arg0 != 9478) {
            return;
        }
        long var4 = class443.field6618[class502.field7408];
        class443.field6618[class502.field7408] = var2;
        class502.field7408 = class502.field7408 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class160.field2478 = class272.field3932;
        }
        this.method1337(-23077);
    }

    @OriginalMember(owner = "client!og", name = "destroy", descriptor = "()V", line = 646)
    public final void destroy() {
        field6815++;
        if (class476.field7115 == this && !class77.field1303) {
            class125.field2024 = class211.method1419(12921);
            class71.method583(5000L, 66);
            class107.field1781 = null;
            this.method2722(30699, false);
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)V", line = 663)
    private final void method2725(boolean arg0) {
        field6818++;
        long var2 = class211.method1419(12921);
        long var4 = class432.field6420[class325.field4948];
        class432.field6420[class325.field4948] = var2;
        class325.field4948 = class325.field4948 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class521.field7735 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class349.field5211++) > 50) {
            class349.field5211 -= 50;
            class455.field6788 = true;
            class370.field5611.setSize(class466.field6952, class77.field1297);
            class370.field5611.setVisible(true);
            if (class423.field6321 != null && class197.field2913 == null) {
                Insets var7 = class423.field6321.getInsets();
                class370.field5611.setLocation(class414.field6183 + var7.left, class5.field127 + var7.top);
            } else {
                class370.field5611.setLocation(class414.field6183, class5.field127);
            }
        }
        this.method1353(arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIII)V", line = 705)
    public final void method2726(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6833++;
        try {
            if (class476.field7115 == null) {
                class5.field127 = 0;
                class77.field1297 = arg2;
                class420.field6275 = arg2;
                class476.field7115 = this;
                class466.field6952 = arg4;
                class431.field6418 = arg4;
                if (arg1 == -90) {
                    class414.field6183 = 0;
                    class298.field4251 = arg0;
                    if (class368.field5553 == null) {
                        class107.field1781 = class368.field5553 = new class293(this, arg3, null, 0);
                    }
                    class324 var6 = class368.field5553.method1859(1, true, this);
                    while (var6.field4940 == 0) {
                        class71.method583(10L, -123);
                    }
                }
            } else {
                class190.field2833++;
                if (class190.field2833 >= 3) {
                    this.method2719("alreadyloaded", 1);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class320.method2087(arg1 + 90, var8, null);
            this.method2719("crash", 1);
        }
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V", line = 755)
    public final synchronized void method2727(int arg0) {
        int var2 = 89 % ((arg0 - 10) / 43);
        field6821++;
        if (class370.field5611 != null) {
            class370.field5611.removeFocusListener(this);
            class370.field5611.getParent().remove(class370.field5611);
        }
        Container var3;
        if (class197.field2913 != null) {
            var3 = class197.field2913;
        } else if (class423.field6321 == null) {
            var3 = class368.field5553.field4170;
        } else {
            var3 = class423.field6321;
        }
        var3.setLayout(null);
        class370.field5611 = new class282(this);
        var3.add(class370.field5611);
        class370.field5611.setSize(class466.field6952, class77.field1297);
        class370.field5611.setVisible(true);
        if (class423.field6321 == var3) {
            Insets var4 = class423.field6321.getInsets();
            class370.field5611.setLocation(class414.field6183 + var4.left, var4.top - -class5.field127);
        } else {
            class370.field5611.setLocation(class414.field6183, class5.field127);
        }
        class370.field5611.addFocusListener(this);
        class370.field5611.requestFocus();
        class160.field2478 = true;
        class272.field3932 = true;
        class455.field6788 = true;
        class177.field2700 = false;
        class122.field1983 = class211.method1419(12921);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 805)
    public final void method2728(byte arg0) {
        field6826++;
        if (arg0 < 67) {
            this.getAppletContext();
        }
        if (this.field6836) {
            return;
        }
        try {
            class324 var2 = class368.field5553.method1870(class476.field7115.getClass(), (byte) -18);
            while (var2.field4940 == 0) {
                class71.method583(100L, 79);
            }
            if (var2.field4939 != null) {
                throw (Throwable) var2.field4939;
            }
            jagmisc.init();
            this.field6836 = true;
            field6847 = class87.method687(16565);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!og", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 836)
    public final void update(Graphics arg0) {
        field6840++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!og", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 847)
    public final AppletContext getAppletContext() {
        field6839++;
        if (class423.field6321 == null) {
            return class368.field5553 == null || class368.field5553.field4170 == this ? super.getAppletContext() : class368.field5553.field4170.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 868)
    public final void windowDeactivated(WindowEvent arg0) {
        field6842++;
    }

    @OriginalMember(owner = "client!og", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 877)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field6844++;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public abstract void method1356(int arg0);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public abstract void method1353(boolean arg0);

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public abstract void method1342(int arg0);

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    public abstract void method1337(int arg0);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public abstract void method1335(byte arg0);

    @OriginalMember(owner = "client!og", name = "init", descriptor = "()V")
    public abstract void init();
}
