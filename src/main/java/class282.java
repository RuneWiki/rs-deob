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
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class282 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Z")
    private boolean field4479 = false;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Z")
    public static boolean field4475 = false;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "S")
    public static short field4499 = 1;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4500 = "flash3:";

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "F")
    public static float field4492;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Z")
    public static boolean field4502;

    @OriginalMember(owner = "client!dd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4476++;
        if (class224.field3612 == this && !class51.field658) {
            class44.field573 = class249.method1723((byte) 99);
            class115.method752((byte) -62, 5000L);
            class115.field1642 = null;
            this.method1883(-23341, false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4487++;
        if (class41.field517 == null) {
            return class194.field3107 == null || class194.field3107.field609 == this ? super.getDocumentBase() : class194.field3107.field609.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "stop", descriptor = "()V")
    public final void stop() {
        field4491++;
        if (class224.field3612 == this && !class51.field658) {
            class44.field573 = class249.method1723((byte) 81) + 4000L;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
    public final void method1880(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4467++;
        try {
            if (class224.field3612 == null) {
                class283.field4517 = arg1;
                class137.field2161 = arg1;
                class181.field2887 = 0;
                class224.field3612 = this;
                class228.field3647 = 0;
                class292.field4640 = arg4;
                class83.field1033 = arg4;
                class285.field4536 = arg0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class194.field3107 == null) {
                    class115.field1642 = class194.field3107 = new class48(this, arg2, (String) null, 0);
                }
                if (arg3 != -14574) {
                    this.init();
                }
                class243 var7 = class194.field3107.method271(1, this, 2);
                while (var7.field3995 == 0) {
                    class115.method752((byte) -62, 10L);
                }
            } else {
                class207.field3310++;
                if (class207.field3310 >= 3) {
                    this.method1891(false, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class30.method168((byte) -28, var9, (String) null);
            this.method1891(false, "crash");
        }
    }

    @OriginalMember(owner = "client!dd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4481++;
        if (class41.field517 == null) {
            return class194.field3107 == null || class194.field3107.field609 == this ? super.getParameter(arg0) : class194.field3107.field609.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)I")
    public static final int method1881(int arg0, int arg1, int arg2) {
        field4489++;
        if (arg0 >= -73) {
            return -53;
        }
        int var3 = class170.method1159(arg1 + 45365, 4, (byte) 114, arg2 + 91923) + (class170.method1159(arg1 + 10294, 2, (byte) 114, arg2 + 37821) - 128 >> 1) + (class170.method1159(arg1, 1, (byte) 114, arg2) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4497++;
        if (class224.field3612 != this || class51.field658) {
            return;
        }
        class203.field3206 = true;
        if (class56.field709 && (class249.method1723((byte) 125) - client.field1611) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class137.field2161 <= var2.width && var2.height >= class83.field1033) {
                class289.field4603 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4468++;
        if (class41.field517 == null) {
            return class194.field3107 == null || class194.field3107.field609 == this ? super.getCodeBase() : class194.field3107.field609.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field4465++;
        this.destroy();
    }

    @OriginalMember(owner = "client!dd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4470++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lid;B)V")
    public static final void method1882(class230 arg0, byte arg1) {
        if (class73.field924 == arg0.field3792 || arg0.field3827 == -1 || arg0.field3765 != 0 || (arg0.field3800 + 1) > class208.method1458((byte) 118, arg0.field3827).field2634[arg0.field3782]) {
            int var2 = arg0.field3792 - arg0.field3799;
            int var3 = class73.field924 - arg0.field3799;
            int var4 = arg0.field3748 * 128 + arg0.method1638(-6377) * 64;
            int var5 = arg0.field3785 * 128 + arg0.method1638(-6377) * 64;
            int var6 = arg0.field3762 * 128 + arg0.method1638(-6377) * 64;
            int var7 = arg0.field3777 * 128 + (arg0.method1638(-6377) * 64);
            arg0.field3820 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field3818 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        if (arg1 >= -84) {
            method1887(-107, 51, -128, -99, -42);
        }
        field4482++;
        if (arg0.field3764 == 0) {
            arg0.field3835 = 1024;
        }
        arg0.field3821 = 0;
        if (arg0.field3764 == 1) {
            arg0.field3835 = 1536;
        }
        if (arg0.field3764 == 2) {
            arg0.field3835 = 0;
        }
        if (arg0.field3764 == 3) {
            arg0.field3835 = 512;
        }
        arg0.field3751 = arg0.field3835;
    }

    @OriginalMember(owner = "client!dd", name = "providesignlink", descriptor = "(Lcg;)V")
    public static final void providesignlink(class48 arg0) {
        field4494++;
        class194.field3107 = arg0;
        class115.field1642 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)V")
    private final void method1883(int arg0, boolean arg1) {
        field4495++;
        if (arg0 != -23341) {
            return;
        }
        synchronized (this) {
            if (class51.field658) {
                return;
            }
            class51.field658 = true;
        }
        if (class194.field3107.field609 != null) {
            class194.field3107.field609.destroy();
        }
        try {
            this.method741(-1);
        } catch (Exception var9) {
        }
        if (class221.field3551 != null) {
            try {
                class221.field3551.removeFocusListener(this);
                class221.field3551.getParent().remove(class221.field3551);
            } catch (Exception var8) {
            }
        }
        if (class194.field3107 != null) {
            try {
                class194.field3107.method265(-31804);
            } catch (Exception var7) {
            }
        }
        this.method731((byte) 82);
        if (class41.field517 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    private final void method1884(boolean arg0) {
        field4462++;
        long var2 = class209.field3341[class61.field802];
        long var4 = class249.method1723((byte) 4);
        class209.field3341[class61.field802] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class276.field4409 = ((var6 >> 1) + 32000) / var6;
        }
        class61.field802 = class61.field802 + 1 & 0x1F;
        if (arg0) {
            field4469 = -125;
        }
        if (class264.field4264++ > 50) {
            class264.field4264 -= 50;
            class203.field3206 = true;
            class221.field3551.setSize(class283.field4517, class292.field4640);
            class221.field3551.setVisible(true);
            if (class41.field517 != null && class46.field586 == null) {
                Insets var7 = class41.field517.getInsets();
                class221.field3551.setLocation(class181.field2887 + var7.left, class228.field3647 + var7.top);
            } else {
                class221.field3551.setLocation(class181.field2887, class228.field3647);
            }
        }
        this.method739((byte) -120);
    }

    @OriginalMember(owner = "client!dd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4478++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public abstract void method732(int arg0);

    @OriginalMember(owner = "client!dd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field4485++;
        class219.field3506 = false;
    }

    @OriginalMember(owner = "client!dd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4486++;
        if (class41.field517 == null) {
            return class194.field3107 == null || class194.field3107.field609 == this ? super.getAppletContext() : class194.field3107.field609.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method1885(byte arg0) {
        field4466++;
        if (arg0 >= -46) {
            return;
        }
        class251.field4093 = 0;
        int var1 = (class286.field4571.field3820 >> 7) + class181.field2883;
        int var2 = (class286.field4571.field3818 >> 7) + class167.field2683;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class251.field4093 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class251.field4093 = 1;
        }
        if (class251.field4093 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class251.field4093 = 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZZIZII)V")
    public static final void method1886(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg2) {
            return;
        }
        if (arg5 < arg6) {
            int var7 = (arg5 + arg6) / 2;
            int var8 = arg5;
            class216 var9 = class79.field989[var7];
            class79.field989[var7] = class79.field989[arg6];
            class79.field989[arg6] = var9;
            for (int var10 = arg5; var10 < arg6; var10++) {
                if (class130.method887(arg4, class79.field989[var10], arg1, arg0, 0, var9, arg3) <= 0) {
                    class216 var11 = class79.field989[var10];
                    class79.field989[var10] = class79.field989[var8];
                    class79.field989[var8++] = var11;
                }
            }
            class79.field989[arg6] = class79.field989[var8];
            class79.field989[var8] = var9;
            method1886(arg0, arg1, false, arg3, arg4, arg5, var8 - 1);
            method1886(arg0, arg1, arg2, arg3, arg4, var8 + 1, arg6);
        }
        field4488++;
    }

    @OriginalMember(owner = "client!dd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4474++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIII)V")
    public static final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4477++;
        class233 var5 = class114.method746(arg0, 1228126432, 10);
        if (arg3 != 0) {
            method1887(106, -83, 12, 89, 83);
        }
        var5.method1651((byte) 121);
        var5.field3850 = arg1;
        var5.field3855 = arg4;
        var5.field3852 = arg2;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static void method1888(int arg0) {
        field4500 = null;
        if (arg0 != -61) {
            method1894((byte) 67, 21L);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Z")
    public final boolean method1889(byte arg0) {
        field4493++;
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
            if (arg0 > -122) {
                field4492 = -0.8403827F;
            }
            this.method1891(false, "invalidhost");
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public abstract void method739(byte arg0);

    @OriginalMember(owner = "client!dd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4463++;
        class219.field3506 = true;
        class203.field3206 = true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIILjava/lang/String;ZBI)V")
    public final void method1890(int arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, byte arg6, int arg7) {
        field4471++;
        try {
            class181.field2887 = 0;
            class285.field4536 = arg2;
            class224.field3612 = this;
            class228.field3647 = 0;
            class292.field4640 = arg1;
            class83.field1033 = arg1;
            class283.field4517 = arg0;
            class137.field2161 = arg0;
            class41.field517 = new Frame();
            class41.field517.setTitle("Jagex");
            class41.field517.setResizable(true);
            class41.field517.addWindowListener(this);
            class41.field517.setVisible(true);
            class41.field517.toFront();
            Insets var9 = class41.field517.getInsets();
            class41.field517.setSize(class137.field2161 + var9.left + var9.right, class83.field1033 + var9.bottom + var9.top);
            if (arg6 != -48) {
                this.method1890(-124, -9, -105, -28, (String) null, true, (byte) 13, 64);
            }
            class115.field1642 = class194.field3107 = new class48((Applet) null, arg3, arg4, arg7);
            class243 var10 = class194.field3107.method271(1, this, 2);
            while (var10.field3995 == 0) {
                class115.method752((byte) -62, 10L);
            }
        } catch (Exception var12) {
            class30.method168((byte) -122, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method1891(boolean arg0, String arg1) {
        field4484++;
        if (this.field4479) {
            return;
        }
        this.field4479 = true;
        System.out.println("error_game_" + arg1);
        try {
            class277.method1848(class194.field3107.field609, 2795, "loggedout");
            if (arg0) {
                this.method1891(true, (String) null);
            }
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!dd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!dd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4498++;
    }

    @OriginalMember(owner = "client!dd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4501++;
    }

    @OriginalMember(owner = "client!dd", name = "start", descriptor = "()V")
    public final void start() {
        field4464++;
        if (class224.field3612 == this && !class51.field658) {
            class44.field573 = 0L;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public abstract void method724(int arg0);

    @OriginalMember(owner = "client!dd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4496++;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
    private final void method1892(byte arg0) {
        long var2 = class249.method1723((byte) 55);
        field4483++;
        long var4 = class208.field3325[class179.field2847];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class208.field3325[class179.field2847] = var2;
        if (arg0 != 91) {
            return;
        }
        class179.field2847 = class179.field2847 + 1 & 0x1F;
        synchronized (this) {
            class207.field3311 = class219.field3506;
        }
        this.method724(94);
    }

    @OriginalMember(owner = "client!dd", name = "run", descriptor = "()V")
    public final void run() {
        field4490++;
        try {
            if (class48.field611 != null) {
                String var1 = class48.field611.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class48.field600;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1891(false, "wrongjava");
                        return;
                    }
                    class139.field2228 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class48.field600 == null || class48.field600.equals("1.4.2"))) {
                    this.method1891(false, "wrongjava");
                    return;
                }
            }
            if (class48.field600 != null && class48.field600.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class48.field600.length()) {
                    char var5 = class48.field600.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class56.field709 = true;
                }
            }
            if (class194.field3107.field609 != null) {
                Method var6 = class48.field618;
                if (var6 != null) {
                    try {
                        var6.invoke(class194.field3107.field609, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class246.method1708(0);
            this.method1893((byte) 50);
            class52.field673 = class225.method1592(1, class221.field3551, class283.field4517, class292.field4640);
            this.method732(-3);
            class111.field1585 = class105.method638((byte) 82);
            while (class44.field573 == 0L || class44.field573 > class249.method1723((byte) 44)) {
                class156.field2519 = class111.field1585.method1463(false, class139.field2228, class251.field4102);
                for (int var7 = 0; var7 < class156.field2519; var7++) {
                    this.method1892((byte) 91);
                }
                this.method1884(false);
                class296.method1982(class194.field3107, (byte) -73, class221.field3551);
            }
        } catch (Exception var10) {
            class30.method168((byte) -18, var10, (String) null);
            this.method1891(false, "crash");
        }
        this.method1883(-23341, true);
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
    public final synchronized void method1893(byte arg0) {
        if (class221.field3551 != null) {
            class221.field3551.removeFocusListener(this);
            class221.field3551.getParent().remove(class221.field3551);
        }
        if (arg0 < 23) {
            return;
        }
        field4480++;
        Container var2;
        if (class46.field586 != null) {
            var2 = class46.field586;
        } else if (class41.field517 == null) {
            var2 = class194.field3107.field609;
        } else {
            var2 = class41.field517;
        }
        var2.setLayout((LayoutManager) null);
        class221.field3551 = new class95(this);
        var2.add(class221.field3551);
        class221.field3551.setSize(class283.field4517, class292.field4640);
        class221.field3551.setVisible(true);
        if (class41.field517 == var2) {
            Insets var3 = class41.field517.getInsets();
            class221.field3551.setLocation(class181.field2887 + var3.left, class228.field3647 + var3.top);
        } else {
            class221.field3551.setLocation(class181.field2887, class228.field3647);
        }
        class221.field3551.addFocusListener(this);
        class221.field3551.requestFocus();
        class207.field3311 = true;
        class219.field3506 = true;
        class203.field3206 = true;
        class289.field4603 = false;
        client.field1611 = class249.method1723((byte) 64);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1894(byte arg0, long arg1) {
        field4461++;
        class21.field277.setTime(new Date(arg1));
        int var3 = class21.field277.get(7);
        int var4 = class21.field277.get(5);
        if (arg0 != 72) {
            field4472 = 75;
        }
        int var5 = class21.field277.get(2);
        int var6 = class21.field277.get(1);
        int var7 = class21.field277.get(11);
        int var8 = class21.field277.get(12);
        int var9 = class21.field277.get(13);
        return class256.field4153[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class117.field1659[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
    public abstract void method741(int arg0);

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(B)V")
    public abstract void method731(byte arg0);

    @OriginalMember(owner = "client!dd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4473++;
    }
}
