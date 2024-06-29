import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class276 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "Z")
    private boolean field4538 = false;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lck;")
    private static class119 field4512 = class298.method1987((byte) 30, "Loaded wordpack");

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field4528 = 0;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lck;")
    public static class119 field4514 = class298.method1987((byte) 44, "headicons_prayer");

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "[I")
    public static int[] field4537 = new int[2];

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Lck;")
    public static class119 field4526 = field4512;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "Lck;")
    public static class119 field4532 = class298.method1987((byte) 34, "sl_arrows");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "Z")
    public static boolean field4541;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "Z")
    public static boolean field4542;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBII)V", line = 4)
    public static final void method1811(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4509++;
        class86.method574(1);
        class6.field149.field44 = 0;
        class6.field149.method32(175, (byte) -99);
        class6.field149.method32(arg0, (byte) -99);
        class6.field149.method32(arg4, (byte) -99);
        class6.field149.method40(arg3, 100);
        class6.field149.method40(arg1, 66);
        if (arg2 < -50) {
            class211.field3366 = 1;
            class281.field4642 = 1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 25)
    public final String getParameter(String arg0) {
        field4536++;
        if (class118.field1808 == null) {
            return class220.field3533 == null || class220.field3533.field4664 == this ? super.getParameter(arg0) : class220.field3533.field4664.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V", line = 40)
    private final void method1812(int arg0, boolean arg1) {
        field4502++;
        synchronized (this) {
            if (class109.field1670) {
                return;
            }
            class109.field1670 = true;
        }
        if (class220.field3533.field4664 != null) {
            class220.field3533.field4664.destroy();
        }
        try {
            this.method616(0);
            if (arg0 >= -107) {
                this.method1822(51, 18, -23, 63, (String) null, -25, -89);
            }
        } catch (Exception var12) {
        }
        if (class39.field587 != null) {
            try {
                class39.field587.removeFocusListener(this);
                class39.field587.getParent().remove(class39.field587);
            } catch (Exception var11) {
            }
        }
        if (class220.field3533 != null) {
            try {
                class220.field3533.method1866((byte) -84);
            } catch (Exception var10) {
            }
        }
        this.method610(121);
        if (class118.field1808 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ua", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 101)
    public final void windowDeactivated(WindowEvent arg0) {
        field4524++;
    }

    @OriginalMember(owner = "client!ua", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 109)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4534++;
    }

    @OriginalMember(owner = "client!ua", name = "start", descriptor = "()V", line = 117)
    public final void start() {
        field4503++;
        if (class237.field3811 == this && !class109.field1670) {
            class124.field1906 = 0L;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIB)V", line = 131)
    public final void method1813(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4517++;
        try {
            if (class237.field3811 != null) {
                class243.field3915++;
                if (class243.field3915 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1821(-45, "alreadyloaded");
                return;
            }
            class203.field3221 = arg1;
            class237.field3811 = this;
            class131.field2000 = arg3;
            class269.field4437 = arg0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class231.field3737 = true;
            } else {
                class231.field3737 = false;
            }
            if (class220.field3533 == null) {
                class288.field4743 = class220.field3533 = new class282(false, this, arg2, (String) null, 0);
            }
            if (arg4 != 98) {
                field4526 = (class119) null;
            }
            class220.field3533.method1879(2, 5, this);
        } catch (Exception var8) {
            class87.method591((String) null, var8, 58);
            this.method1821(-39, "crash");
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 180)
    public static void method1814(byte arg0) {
        field4537 = null;
        field4526 = null;
        int var1 = -86 / ((9 - arg0) / 36);
        field4514 = null;
        field4532 = null;
        field4512 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lva;III)Lmd;", line = 194)
    public static final class88 method1815(class36 arg0, int arg1, int arg2, int arg3) {
        field4513++;
        if (class56.method414(arg2, arg0, false, arg1)) {
            if (arg3 != -1) {
                field4514 = (class119) null;
            }
            return class111.method711((byte) -108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "destroy", descriptor = "()V", line = 213)
    public final void destroy() {
        field4519++;
        if (class237.field3811 == this && !class109.field1670) {
            class124.field1906 = class110.method707((byte) 121);
            class232.method1493(5000L, (byte) -51);
            class288.field4743 = null;
            this.method1812(-112, false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 227)
    public final synchronized void paint(Graphics arg0) {
        field4505++;
        if (class237.field3811 == this && !class109.field1670) {
            class49.field754 = true;
            if (class282.field4649 != null && class282.field4649.startsWith("1.5")) {
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "run", descriptor = "()V", line = 253)
    public final void run() {
        field4533++;
        try {
            if (class282.field4656 != null) {
                String var1 = class282.field4656.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class282.field4649;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1821(-21, "wrongjava");
                        return;
                    }
                    class220.field3529 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class282.field4649 == null || class282.field4649.equals("1.4.2"))) {
                    this.method1821(-125, "wrongjava");
                    return;
                }
            }
            if (class220.field3533.field4664 != null) {
                Method var3 = class282.field4662;
                if (var3 != null) {
                    try {
                        var3.invoke(class220.field3533.field4664, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method1823((byte) 14);
            this.method611(0);
            class134.field2047 = class50.method386(-96);
            while (class124.field1906 == 0L || class110.method707((byte) 98) < class124.field1906) {
                class243.field3897 = class134.field2047.method109(-22102, class5.field132, class220.field3529);
                for (int var5 = 0; var5 < class243.field3897; var5++) {
                    this.method1819(89);
                }
                this.method1816(32000);
                class257.method1646(class39.field587, class220.field3533, (byte) -56);
            }
        } catch (Exception var8) {
            class87.method591((String) null, var8, 58);
            this.method1821(-21, "crash");
        }
        this.method1812(-113, true);
    }

    @OriginalMember(owner = "client!ua", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 336)
    public final void windowActivated(WindowEvent arg0) {
        field4531++;
    }

    @OriginalMember(owner = "client!ua", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 343)
    public final void windowOpened(WindowEvent arg0) {
        field4506++;
    }

    @OriginalMember(owner = "client!ua", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 360)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4540++;
    }

    @OriginalMember(owner = "client!ua", name = "providesignlink", descriptor = "(Llh;)V", line = 370)
    public static final void providesignlink(class282 arg0) {
        field4521++;
        class220.field3533 = arg0;
        class288.field4743 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 379)
    public final void windowClosed(WindowEvent arg0) {
        field4504++;
    }

    @OriginalMember(owner = "client!ua", name = "stop", descriptor = "()V", line = 387)
    public final void stop() {
        field4523++;
        if (class237.field3811 == this && !class109.field1670) {
            class124.field1906 = class110.method707((byte) 72) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ua", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 399)
    public final URL getCodeBase() {
        field4508++;
        if (class118.field1808 == null) {
            return class220.field3533 == null || class220.field3533.field4664 == this ? super.getCodeBase() : class220.field3533.field4664.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V", line = 425)
    private final void method1816(int arg0) {
        long var2 = class110.method707((byte) 121);
        field4535++;
        long var4 = class110.field1680[class193.field3090];
        class110.field1680[class193.field3090] = var2;
        class193.field3090 = class193.field3090 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class81.field1234 = ((var6 >> 1) + 32000) / var6;
        }
        if (class203.field3227++ > 50) {
            class203.field3227 -= 50;
            class49.field754 = true;
            class39.field587.setSize(class269.field4437, class131.field2000);
            class39.field587.setVisible(true);
            if (class118.field1808 != null && class182.field2880 == null) {
                Insets var7 = class118.field1808.getInsets();
                class39.field587.setLocation(var7.left, class174.field2789 + var7.top);
            } else {
                class39.field587.setLocation(0, class174.field2789);
            }
        }
        if (arg0 != 32000) {
            field4528 = 38;
        }
        this.method618(4226);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)Z", line = 472)
    public final boolean method1817(int arg0) {
        field4510++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 <= 5) {
            return false;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1821(-92, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 507)
    public final AppletContext getAppletContext() {
        field4518++;
        if (class118.field1808 == null) {
            return class220.field3533 == null || class220.field3533.field4664 == this ? super.getAppletContext() : class220.field3533.field4664.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 524)
    public final void focusLost(FocusEvent arg0) {
        field4507++;
        class13.field201 = false;
    }

    @OriginalMember(owner = "client!ua", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 534)
    public final void focusGained(FocusEvent arg0) {
        field4520++;
        class13.field201 = true;
        class49.field754 = true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lwe;", line = 549)
    public static final class56 method1818(int arg0, int arg1) {
        field4529++;
        class56 var2 = (class56) class124.field1915.method487(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class196.field3145.method261(-1, class1.method1((byte) 54, arg1), class214.method1346((byte) -48, arg1));
        if (arg0 != -20682) {
            method1814((byte) 9);
        }
        class56 var4 = new class56();
        if (var3 != null) {
            var4.method417(new class3(var3), -472);
        }
        var4.method415(arg0 + 20678);
        class124.field1915.method488(var4, (byte) 45, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 577)
    public final void windowIconified(WindowEvent arg0) {
        field4515++;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V", line = 588)
    private final void method1819(int arg0) {
        field4511++;
        long var2 = class154.field2459[class197.field3155];
        long var4 = class110.method707((byte) 106);
        int var6 = -40 % ((arg0 + 35) / 32);
        if (var2 != 0L && var2 < var4) {
        }
        class154.field2459[class197.field3155] = var4;
        class197.field3155 = class197.field3155 + 1 & 0x1F;
        synchronized (this) {
            class242.field3895 = class13.field201;
        }
        this.method617(true);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V", line = 616)
    public static final void method1820(int arg0, int arg1) {
        class32.field470.method491(-70, arg1);
        if (arg0 <= 72) {
            field4514 = (class119) null;
        }
        field4516++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)V", line = 627)
    public final void method1821(int arg0, String arg1) {
        field4530++;
        if (this.field4538) {
            return;
        }
        this.field4538 = true;
        if (arg0 >= -9) {
            method1814((byte) -63);
        }
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 652)
    public final void method1822(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field4522++;
        try {
            if (arg2 > -74) {
                this.method617(true);
            }
            class269.field4437 = arg3;
            class203.field3221 = arg5;
            class237.field3811 = this;
            class131.field2000 = arg1;
            class118.field1808 = new Frame();
            class118.field1808.setTitle("Jagex");
            class118.field1808.setResizable(false);
            class118.field1808.addWindowListener(this);
            class118.field1808.setVisible(true);
            class118.field1808.toFront();
            Insets var8 = class118.field1808.getInsets();
            class118.field1808.setSize(var8.right + var8.left + arg3, var8.top + var8.bottom + arg1);
            class288.field4743 = class220.field3533 = new class282(true, (Applet) null, arg6, arg4, arg0);
            class220.field3533.method1879(2, 5, this);
        } catch (Exception var10) {
            class87.method591((String) null, var10, 58);
        }
    }

    @OriginalMember(owner = "client!ua", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 691)
    public final void windowDeiconified(WindowEvent arg0) {
        field4525++;
    }

    @OriginalMember(owner = "client!ua", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 705)
    public final URL getDocumentBase() {
        field4527++;
        if (class118.field1808 == null) {
            return class220.field3533 == null || class220.field3533.field4664 == this ? super.getDocumentBase() : class220.field3533.field4664.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V", line = 741)
    public final synchronized void method1823(byte arg0) {
        if (class39.field587 != null) {
            class39.field587.removeFocusListener(this);
            class39.field587.getParent().remove(class39.field587);
        }
        if (class193.field3082 != null) {
            class193.field3082.getParent().remove(class193.field3082);
            class193.field3082 = null;
        }
        field4539++;
        Container var2;
        if (class182.field2880 != null) {
            var2 = class182.field2880;
        } else if (class118.field1808 == null) {
            var2 = class220.field3533.field4664;
        } else {
            var2 = class118.field1808;
        }
        var2.setLayout((LayoutManager) null);
        if (class174.field2789 != 0) {
            class193.field3082 = new class277(this);
            var2.add(class193.field3082);
            class193.field3082.setSize(class269.field4437, class174.field2789);
            class193.field3082.setVisible(true);
            if (class118.field1808 == var2) {
                Insets var3 = class118.field1808.getInsets();
                class193.field3082.setLocation(var3.left, var3.top);
            } else {
                class193.field3082.setLocation(0, 0);
            }
        }
        class39.field587 = new class277(this);
        class39.field587.setIgnoreRepaint(true);
        var2.add(class39.field587);
        class39.field587.setSize(class269.field4437, class131.field2000);
        class39.field587.setVisible(true);
        if (class118.field1808 == var2) {
            Insets var4 = class118.field1808.getInsets();
            class39.field587.setLocation(var4.left, var4.top + class174.field2789);
        } else {
            class39.field587.setLocation(0, class174.field2789);
        }
        class39.field587.addFocusListener(this);
        class39.field587.requestFocus();
        class13.field201 = true;
        class49.field754 = true;
        if (arg0 != 14) {
            method1811(22, 76, (byte) 118, -38, -58);
        }
        class242.field3895 = true;
        class75.field1176 = false;
        class154.field2465 = class110.method707((byte) 79);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public abstract void method611(int arg0);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public abstract void method610(int arg0);

    @OriginalMember(owner = "client!ua", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public abstract void method617(boolean arg0);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public abstract void method616(int arg0);

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
    public abstract void method618(int arg0);
}
