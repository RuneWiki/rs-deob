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

@OriginalClass("client!si")
public abstract class class321 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Z")
    private boolean field4322 = false;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "Z")
    private boolean field4348 = false;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field4326 = 1;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "[S")
    public static short[] field4342 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!si", name = "t", descriptor = "[I")
    public static int[] field4336 = new int[14];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "Z")
    public static boolean field4356;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "Z")
    public static boolean field4357;

    @OriginalMember(owner = "client!si", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4340++;
        if (class414.field5781 == null) {
            return class30.field502 == null || class30.field502.field4117 == this ? super.getAppletContext() : class30.field502.field4117.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4337++;
        if (class67.field1013 == this && !class284.field3807) {
            class90.field1345 = class108.method902((byte) -93);
            class229.method1541(127, 5000L);
            class284.field3809 = null;
            this.method2028(false, false);
        }
    }

    @OriginalMember(owner = "client!si", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4320++;
    }

    @OriginalMember(owner = "client!si", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4355++;
        if (class67.field1013 != this || class284.field3807) {
            return;
        }
        class415.field5809 = true;
        if (class431.field6127 && (class108.method902((byte) -93) - class184.field2677) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class417.field5853 <= var2.width && var2.height >= class135.field1927) {
                class43.field648 = true;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public final void method2026(int arg0) {
        if (arg0 != -30831) {
            return;
        }
        field4350++;
        if (this.field4322) {
            return;
        }
        try {
            class242 var2 = class30.field502.method1944((byte) -103, class67.field1013.getClass());
            while (var2.field3345 == 0) {
                class229.method1541(arg0 + 30903, 100L);
            }
            if (var2.field3341 != null) {
                throw (Throwable) var2.field3341;
            }
            jagmisc.init();
            this.field4322 = true;
            class404.field5626 = class84.method759(0);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public abstract void method1656(int arg0);

    @OriginalMember(owner = "client!si", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4321++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static final void method2027(boolean arg0) {
        field4333++;
        class56 var1 = null;
        try {
            class242 var2 = class30.field502.method1947((byte) -41);
            while (var2.field3345 == 0) {
                class229.method1541(59, 1L);
            }
            if (var2.field3345 == 1) {
                var1 = (class56) var2.field3341;
                class289 var3 = new class289(class122.field1717 * 6 + 3);
                var3.method1824(72, 1);
                var3.method1877(arg0, class122.field1717);
                for (int var4 = 0; var4 < class331.field4511.length; var4++) {
                    if (class257.field3475[var4]) {
                        var3.method1877(true, var4);
                        var3.method1854(class331.field4511[var4], true);
                    }
                }
                var1.method527(var3.field3882, (byte) -126, 0, var3.field3938);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method526(-19635);
            }
            if (!arg0) {
                method2027(false);
            }
        } catch (Exception var5) {
        }
        class402.field5614 = class108.method902((byte) -93);
        class288.field3866 = false;
    }

    @OriginalMember(owner = "client!si", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4318++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZZ)V")
    private final void method2028(boolean arg0, boolean arg1) {
        field4325++;
        synchronized (this) {
            if (class284.field3807) {
                return;
            }
            class284.field3807 = true;
        }
        if (class30.field502.field4117 != null) {
            class30.field502.field4117.destroy();
        }
        try {
            this.method1651(52);
        } catch (Exception var11) {
        }
        if (this.field4322) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field4322 = false;
        }
        class242 var4 = class30.field502.method1963(class67.field1013.getClass(), -95);
        while (var4.field3345 == 0) {
            class229.method1541(61, 100L);
        }
        if (arg0) {
            this.method2035(24);
        }
        if (class418.field5867 != null) {
            try {
                class418.field5867.removeFocusListener(this);
                class418.field5867.getParent().remove(class418.field5867);
            } catch (Exception var9) {
            }
        }
        if (class30.field502 != null) {
            try {
                class30.field502.method1966(true);
            } catch (Exception var8) {
            }
        }
        this.method1654((byte) -94);
        if (class414.field5781 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!si", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4317++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public abstract void method1649(byte arg0);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lth;")
    public static final class169 method2029(int arg0, int arg1) {
        field4354++;
        class169 var2 = (class169) class356.field4848.method361((long) arg0, (byte) -104);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class236.field3278.method2633(class29.method337(arg0, 28), -1, class191.method1379(arg0, -123));
        class169 var4 = new class169();
        if (var3 != null) {
            var4.method1271((byte) -106, new class289(var3));
        }
        class356.field4848.method360(false, var4, (long) arg0);
        int var5 = 40 % ((arg1 + 33) / 61);
        return var4;
    }

    @OriginalMember(owner = "client!si", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4339++;
        if (class414.field5781 == null) {
            return class30.field502 == null || class30.field502.field4117 == this ? super.getDocumentBase() : class30.field502.field4117.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4332++;
        class426.field6025 = true;
        class415.field5809 = true;
    }

    @OriginalMember(owner = "client!si", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4341++;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
    public static void method2030(byte arg0) {
        if (arg0 > -35) {
            method2029(10, -110);
        }
        field4342 = null;
        field4336 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZ)Lsb;")
    public static final class362 method2031(int arg0, int arg1, int arg2, boolean arg3) {
        field4334++;
        class224 var4 = class118.field1653[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class362 var5 = null;
        int var6 = -1;
        if (arg3) {
            return null;
        }
        for (class26 var7 = var4.field3129; var7 != null; var7 = var7.field463) {
            class228 var8 = var7.field460;
            if (var8 instanceof class362) {
                class362 var9 = (class362) var8;
                int var10 = (var9.method2146(30) - 1) * 64 + 60;
                int var11 = var9.field3176 - var10 >> 7;
                int var12 = var9.field3167 - var10 >> 7;
                int var13 = var9.field3176 + var10 >> 7;
                int var14 = var9.field3167 + var10 >> 7;
                if (arg1 >= var11 && arg2 >= var12 && arg1 <= var13 && arg2 <= var14) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg1);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!si", name = "start", descriptor = "()V")
    public final void start() {
        field4323++;
        if (class67.field1013 == this && !class284.field3807) {
            class90.field1345 = 0L;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZI)V")
    public final void method2032(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4335++;
        try {
            if (class67.field1013 == null) {
                class172.field2520 = 0;
                class249.field3414 = arg4;
                class417.field5853 = arg4;
                class67.field1013 = this;
                class134.field1915 = 0;
                class258.field3488 = arg0;
                class135.field1927 = arg0;
                class386.field5440 = arg1;
                if (arg3) {
                    this.field4322 = false;
                }
                if (class30.field502 == null) {
                    class284.field3809 = class30.field502 = new class304(this, arg2, (String) null, 0);
                }
                class242 var6 = class30.field502.method1950(74, 1, this);
                while (var6.field3345 == 0) {
                    class229.method1541(124, 10L);
                }
            } else {
                class259.field3502++;
                if (class259.field3502 >= 3) {
                    this.method2039("alreadyloaded", 5);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class380.method2365(-2, (String) null, var8);
            this.method2039("crash", 5);
        }
    }

    @OriginalMember(owner = "client!si", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4331++;
        if (class414.field5781 == null) {
            return class30.field502 == null || class30.field502.field4117 == this ? super.getCodeBase() : class30.field502.field4117.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4353++;
        if (class414.field5781 == null) {
            return class30.field502 == null || class30.field502.field4117 == this ? super.getParameter(arg0) : class30.field502.field4117.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
    public final synchronized void method2033(boolean arg0) {
        field4345++;
        if (class418.field5867 != null) {
            class418.field5867.removeFocusListener(this);
            class418.field5867.getParent().remove(class418.field5867);
        }
        Container var2;
        if (class416.field5820 != null) {
            var2 = class416.field5820;
        } else if (class414.field5781 == null) {
            var2 = class30.field502.field4117;
        } else {
            var2 = class414.field5781;
        }
        var2.setLayout((LayoutManager) null);
        class418.field5867 = new class263(this);
        var2.add(class418.field5867);
        class418.field5867.setSize(class249.field3414, class258.field3488);
        class418.field5867.setVisible(arg0);
        if (class414.field5781 == var2) {
            Insets var3 = class414.field5781.getInsets();
            class418.field5867.setLocation(class172.field2520 + var3.left, class134.field1915 + var3.top);
        } else {
            class418.field5867.setLocation(class172.field2520, class134.field1915);
        }
        class418.field5867.addFocusListener(this);
        class418.field5867.requestFocus();
        class426.field6025 = true;
        class344.field4666 = true;
        class415.field5809 = true;
        class43.field648 = false;
        class184.field2677 = class108.method902((byte) -93);
    }

    @OriginalMember(owner = "client!si", name = "stop", descriptor = "()V")
    public final void stop() {
        field4324++;
        if (class67.field1013 == this && !class284.field3807) {
            class90.field1345 = class108.method902((byte) -93) + 4000L;
        }
    }

    @OriginalMember(owner = "client!si", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class426.field6025 = false;
        field4351++;
    }

    @OriginalMember(owner = "client!si", name = "run", descriptor = "()V")
    public final void run() {
        field4344++;
        try {
            label116: {
                if (class304.field4121 != null) {
                    String var1 = class304.field4121.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class304.field4118;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2039("wrongjava", 5);
                            break label116;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class304.field4118 == null || class304.field4118.equals("1.4.2"))) {
                        this.method2039("wrongjava", 5);
                        break label116;
                    }
                }
                if (class304.field4118 != null && class304.field4118.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class304.field4118.length() > var3) {
                        char var5 = class304.field4118.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + (var5 - 48);
                    }
                    if (var4 >= 5) {
                        class431.field6127 = true;
                    }
                }
                if (class30.field502.field4117 != null) {
                    Method var6 = class304.field4126;
                    if (var6 != null) {
                        try {
                            var6.invoke(class30.field502.field4117, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class297.method1909(64);
                this.method2033(true);
                this.method1649((byte) 64);
                class404.field5626 = class84.method759(0);
                this.method2026(-30831);
                while (class90.field1345 == 0L || class108.method902((byte) -93) < class90.field1345) {
                    class190.field2735 = class404.field5626.method777(class388.field5458, (byte) -79);
                    for (int var7 = 0; var7 < class190.field2735; var7++) {
                        this.method2037(false);
                    }
                    this.method2035(118);
                    class5.method30(false, class418.field5867, class30.field502);
                }
            }
        } catch (Exception var10) {
            class380.method2365(-2, (String) null, var10);
            this.method2039("crash", 5);
        }
        this.method2028(false, true);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIILjava/lang/String;ZIII)V")
    public final void method2034(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5, int arg6, int arg7) {
        try {
            class249.field3414 = arg0;
            class417.field5853 = arg0;
            class258.field3488 = arg5;
            class135.field1927 = arg5;
            class386.field5440 = arg6;
            class172.field2520 = 0;
            class134.field1915 = 0;
            class67.field1013 = this;
            class414.field5781 = new Frame();
            class414.field5781.setTitle("Jagex");
            class414.field5781.setResizable(true);
            class414.field5781.addWindowListener(this);
            class414.field5781.setVisible(true);
            if (arg7 != 64) {
                field4342 = null;
            }
            class414.field5781.toFront();
            Insets var9 = class414.field5781.getInsets();
            class414.field5781.setSize(class417.field5853 - (-var9.right - var9.left), class135.field1927 + var9.top - -var9.bottom);
            class284.field3809 = class30.field502 = new class304((Applet) null, arg1, arg3, arg2);
            class242 var10 = class30.field502.method1950(-102, 1, this);
            while (var10.field3345 == 0) {
                class229.method1541(83, 10L);
            }
        } catch (Exception var12) {
            class380.method2365(arg7 - 66, (String) null, var12);
        }
        field4349++;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    private final void method2035(int arg0) {
        field4319++;
        long var2 = class108.method902((byte) -93);
        long var4 = class180.field2641[class192.field2771];
        class180.field2641[class192.field2771] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class276.field3716 = ((var6 >> 1) + 32000) / var6;
        }
        class192.field2771 = class192.field2771 + 1 & 0x1F;
        if ((class223.field3089++) > 50) {
            class415.field5809 = true;
            class223.field3089 -= 50;
            class418.field5867.setSize(class249.field3414, class258.field3488);
            class418.field5867.setVisible(true);
            if (class414.field5781 != null && class416.field5820 == null) {
                Insets var7 = class414.field5781.getInsets();
                class418.field5867.setLocation(class172.field2520 + var7.left, class134.field1915 + var7.top);
            } else {
                class418.field5867.setLocation(class172.field2520, class134.field1915);
            }
        }
        this.method1644((byte) 110);
        if (arg0 < 110) {
            this.field4348 = false;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
    public abstract void method1644(byte arg0);

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
    public abstract void method1651(int arg0);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)Z")
    public final boolean method2036(int arg0) {
        field4352++;
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
                this.method2039("invalidhost", 5);
                return arg0 != -7473;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(B)V")
    public abstract void method1654(byte arg0);

    @OriginalMember(owner = "client!si", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(Z)V")
    private final void method2037(boolean arg0) {
        field4347++;
        long var2 = class108.method902((byte) -93);
        long var4 = class3.field21[class177.field2615];
        class3.field21[class177.field2615] = var2;
        if (arg0) {
            field4342 = null;
        }
        class177.field2615 = class177.field2615 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class344.field4666 = class426.field6025;
        }
        this.method1656(-31);
    }

    @OriginalMember(owner = "client!si", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4329++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lrk;ILrk;Lrk;)V")
    public static final void method2038(class427 arg0, int arg1, class427 arg2, class427 arg3) {
        int var4 = -107 % ((arg1 + 39) / 41);
        field4327++;
        class260.field3511 = arg2;
        class326.method2077(arg3, arg0, -26873);
    }

    @OriginalMember(owner = "client!si", name = "providesignlink", descriptor = "(Lbd;)V")
    public static final void providesignlink(class304 arg0) {
        field4330++;
        class30.field502 = arg0;
        class284.field3809 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4343++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method2039(String arg0, int arg1) {
        field4346++;
        if (this.field4348) {
            return;
        }
        this.field4348 = true;
        System.out.println("error_game_" + arg0);
        try {
            class117.method936("loggedout", true, class30.field502.field4117);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            if (arg1 != 5) {
                this.method1656(74);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!si", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4338++;
    }
}
