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

@OriginalClass("client!wi")
public abstract class class250 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Z")
    private boolean field4049 = false;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Z")
    private boolean field4063 = false;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
    public static boolean field4053 = true;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[I")
    public static int[] field4058 = new int[50];

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field4087 = 0;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field4088 = 0;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4051 = 0;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field4091 = 0;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lvl;")
    public static class73 field4050;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Z")
    public static boolean field4092;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "[I")
    public static int[] field4072;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public static final void method1777(int arg0, int arg1) {
        field4076++;
        class181 var2 = class95.method652(12, (byte) 34, arg1);
        var2.method1283(192);
        if (arg0 != -6217) {
            method1788(124, (String) null);
        }
    }

    @OriginalMember(owner = "client!wi", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4067++;
        if (class73.field1086 == null) {
            return class95.field1425 == null || class95.field1425.field3832 == this ? super.getDocumentBase() : class95.field1425.field3832.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Z")
    public final boolean method1778(byte arg0) {
        field4079++;
        int var2 = -109 % ((-arg0 - 45) / 53);
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        if (var3.equals("jagex.com") || var3.endsWith(".jagex.com")) {
            return true;
        } else if (var3.equals("runescape.com") || var3.endsWith(".runescape.com")) {
            return true;
        } else if (var3.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var3.length() > 0 && var3.charAt(var3.length() - 1) >= '0' && var3.charAt(var3.length() - 1) <= '9') {
                var3 = var3.substring(0, var3.length() - 1);
            }
            if (var3.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1780((byte) -63, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field4089++;
        class106.field1543 = false;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    private final void method1779(int arg0) {
        field4065++;
        long var2 = class212.field3302[class35.field419];
        long var4 = class98.method665(true);
        if (arg0 < 81) {
            return;
        }
        class212.field3302[class35.field419] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class266.field4326 = ((var6 >> 1) + 32000) / var6;
        }
        class35.field419 = class35.field419 + 1 & 0x1F;
        if (class313.field5020++ > 50) {
            class192.field3052 = true;
            class313.field5020 -= 50;
            class304.field4831.setSize(class112.field1626, class126.field1814);
            class304.field4831.setVisible(true);
            if (class73.field1086 != null && class123.field1771 == null) {
                Insets var7 = class73.field1086.getInsets();
                class304.field4831.setLocation(class152.field2272 + var7.left, class152.field2274 + var7.top);
            } else {
                class304.field4831.setLocation(class152.field2272, class152.field2274);
            }
        }
        this.method1705(-151);
    }

    @OriginalMember(owner = "client!wi", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4060++;
    }

    @OriginalMember(owner = "client!wi", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!wi", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field4085++;
        this.destroy();
    }

    @OriginalMember(owner = "client!wi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4082++;
        if (class15.field219 != this || class77.field1175) {
            return;
        }
        class192.field3052 = true;
        if (class309.field4966 && (class98.method665(true) - class226.field3507) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class14.field210 && var2.height >= class278.field4556) {
                class161.field2416 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public abstract void method1715(byte arg0);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public abstract void method1705(int arg0);

    @OriginalMember(owner = "client!wi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4066++;
        class106.field1543 = true;
        class192.field3052 = true;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1780(byte arg0, String arg1) {
        field4074++;
        if (arg0 > -30) {
            field4091 = -84;
        }
        if (this.field4049) {
            return;
        }
        this.field4049 = true;
        System.out.println("error_game_" + arg1);
        try {
            class25.method132(class95.field1425.field3832, "loggedout", (byte) 109);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!wi", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4078++;
    }

    @OriginalMember(owner = "client!wi", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4090++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IBZIIII)V")
    public final void method1781(String arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class45.field541 = arg7;
            class112.field1626 = arg1;
            class14.field210 = arg1;
            class15.field219 = this;
            if (arg2 != -47) {
                method1788(-117, (String) null);
            }
            class152.field2272 = 0;
            class126.field1814 = arg6;
            class278.field4556 = arg6;
            class152.field2274 = 0;
            class73.field1086 = new Frame();
            class73.field1086.setTitle("Jagex");
            class73.field1086.setResizable(true);
            class73.field1086.addWindowListener(this);
            class73.field1086.setVisible(true);
            class73.field1086.toFront();
            Insets var9 = class73.field1086.getInsets();
            class73.field1086.setSize(var9.left + var9.right + class14.field210, class278.field4556 + var9.bottom - -var9.top);
            class18.field249 = class95.field1425 = new class239((Applet) null, arg5, arg0, arg4);
            class160 var10 = class95.field1425.method1684(0, this, 1);
            while (var10.field2399 == 0) {
                class7.method43(-83, 10L);
            }
        } catch (Exception var12) {
            class285.method1952(var12, (byte) 49, (String) null);
        }
        field4073++;
    }

    @OriginalMember(owner = "client!wi", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4057++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public abstract void method1702(boolean arg0);

    @OriginalMember(owner = "client!wi", name = "providesignlink", descriptor = "(Lmd;)V")
    public static final void providesignlink(class239 arg0) {
        field4056++;
        class95.field1425 = arg0;
        class18.field249 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
    public final void method1782(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4069++;
        try {
            if (class15.field219 == null) {
                class126.field1814 = arg4;
                class278.field4556 = arg4;
                class45.field541 = arg0;
                class152.field2274 = 0;
                class112.field1626 = arg3;
                class14.field210 = arg3;
                class152.field2272 = 0;
                class15.field219 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class95.field1425 == null) {
                    class18.field249 = class95.field1425 = new class239(this, arg1, (String) null, 0);
                }
                class160 var7 = class95.field1425.method1684(arg2 ^ arg2, this, 1);
                while (var7.field2399 == 0) {
                    class7.method43(-77, 10L);
                }
            } else {
                class14.field207++;
                if (class14.field207 >= 3) {
                    this.method1780((byte) -114, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class285.method1952(var9, (byte) 82, (String) null);
            this.method1780((byte) -70, "crash");
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V")
    private final void method1783(byte arg0) {
        long var2 = class98.method665(true);
        field4068++;
        long var4 = class6.field83[class251.field4118];
        class6.field83[class251.field4118] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class251.field4118 = class251.field4118 + 1 & 0x1F;
        synchronized (this) {
            class283.field4598 = class106.field1543;
        }
        if (arg0 < 93) {
            field4087 = 17;
        }
        this.method1702(false);
    }

    @OriginalMember(owner = "client!wi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4080++;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public static void method1784(int arg0) {
        field4072 = null;
        field4058 = null;
        int var1 = 25 % ((arg0 - 55) / 63);
        field4050 = null;
    }

    @OriginalMember(owner = "client!wi", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4052++;
    }

    @OriginalMember(owner = "client!wi", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4081++;
        if (class73.field1086 == null) {
            return class95.field1425 == null || class95.field1425.field3832 == this ? super.getAppletContext() : class95.field1425.field3832.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4059++;
        if (class73.field1086 == null) {
            return class95.field1425 == null || class95.field1425.field3832 == this ? super.getCodeBase() : class95.field1425.field3832.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
    public final synchronized void method1785(byte arg0) {
        if (class304.field4831 != null) {
            class304.field4831.removeFocusListener(this);
            class304.field4831.getParent().remove(class304.field4831);
        }
        if (arg0 != -94) {
            this.method1781((String) null, -99, (byte) -17, true, -49, 66, 48, -61);
        }
        field4084++;
        Container var2;
        if (class123.field1771 != null) {
            var2 = class123.field1771;
        } else if (class73.field1086 == null) {
            var2 = class95.field1425.field3832;
        } else {
            var2 = class73.field1086;
        }
        var2.setLayout((LayoutManager) null);
        class304.field4831 = new class274(this);
        var2.add(class304.field4831);
        class304.field4831.setSize(class112.field1626, class126.field1814);
        class304.field4831.setVisible(true);
        if (class73.field1086 == var2) {
            Insets var3 = class73.field1086.getInsets();
            class304.field4831.setLocation(class152.field2272 + var3.left, class152.field2274 + var3.top);
        } else {
            class304.field4831.setLocation(class152.field2272, class152.field2274);
        }
        class304.field4831.addFocusListener(this);
        class304.field4831.requestFocus();
        class106.field1543 = true;
        class283.field4598 = true;
        class192.field3052 = true;
        class161.field2416 = false;
        class226.field3507 = class98.method665(true);
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public abstract void method1712(int arg0);

    @OriginalMember(owner = "client!wi", name = "run", descriptor = "()V")
    public final void run() {
        field4075++;
        try {
            if (class239.field3841 != null) {
                String var1 = class239.field3841.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class239.field3831;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1780((byte) -122, "wrongjava");
                        return;
                    }
                    class4.field59 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class239.field3831 == null || class239.field3831.equals("1.4.2"))) {
                    this.method1780((byte) -96, "wrongjava");
                    return;
                }
            }
            if (class239.field3831 != null && class239.field3831.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class239.field3831.length()) {
                    char var5 = class239.field3831.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = -(-var5 - var4 * 10) - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class309.field4966 = true;
                }
            }
            if (class95.field1425.field3832 != null) {
                Method var6 = class239.field3851;
                if (var6 != null) {
                    try {
                        var6.invoke(class95.field1425.field3832, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class232.method1637(1);
            this.method1785((byte) -94);
            class187.field2935 = class140.method882(class112.field1626, class126.field1814, 28594, class304.field4831);
            this.method1712(87);
            class229.field3537 = class209.method1452((byte) -49);
            this.method1787((byte) 83);
            while (class69.field1030 == 0L || class69.field1030 > class98.method665(true)) {
                class188.field2940 = class229.field3537.method176(class4.field59, class181.field2851, 2);
                for (int var7 = 0; var7 < class188.field2940; var7++) {
                    this.method1783((byte) 119);
                }
                this.method1779(108);
                class140.method880(512, class95.field1425, class304.field4831);
            }
        } catch (Exception var10) {
            class285.method1952(var10, (byte) 91, (String) null);
            this.method1780((byte) -78, "crash");
        }
        this.method1789(true, 118);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIILfe;I)V")
    public static final void method1786(byte arg0, int arg1, int arg2, class231 arg3, int arg4) {
        field4064++;
        if (class3.field43 < 3) {
            ((class48) class216.field3380).method275(arg2, arg4, arg3.field3730, arg3.field3686, class216.field3380.field3353 / 2, class216.field3380.field3351 / 2, (int) class144.field2145, 256, arg3.field3637, arg3.field3687);
        } else {
            class151.method1031(arg2, arg4, 0, arg3.field3637, arg3.field3687);
        }
        class195.field3092[arg1] = true;
        if (arg0 != -72) {
            method1784(-16);
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)V")
    public final void method1787(byte arg0) {
        field4086++;
        int var2 = -5 / ((arg0 + 42) / 57);
        if (this.field4063) {
            return;
        }
        try {
            class160 var3 = class95.field1425.method1676(-8877, class15.field219.getClass());
            while (var3.field2399 == 0) {
                class7.method43(-92, 100L);
            }
            if (var3.field2401 != null) {
                throw (Throwable) var3.field2401;
            }
            jagmisc.init();
            this.field4063 = true;
            class229.field3537 = class209.method1452((byte) -49);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!wi", name = "start", descriptor = "()V")
    public final void start() {
        field4083++;
        if (class15.field219 == this && !class77.field1175) {
            class69.field1030 = 0L;
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
    public abstract void method1704(int arg0);

    @OriginalMember(owner = "client!wi", name = "stop", descriptor = "()V")
    public final void stop() {
        field4070++;
        if (class15.field219 == this && !class77.field1175) {
            class69.field1030 = class98.method665(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method1788(int arg0, String arg1) {
        field4061++;
        if (arg0 > -15) {
            field4091 = -27;
        }
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4062++;
        if (class15.field219 == this && !class77.field1175) {
            class69.field1030 = class98.method665(true);
            class7.method43(-92, 5000L);
            class18.field249 = null;
            this.method1789(false, 102);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V")
    private final void method1789(boolean arg0, int arg1) {
        field4055++;
        synchronized (this) {
            if (class77.field1175) {
                return;
            }
            class77.field1175 = true;
        }
        if (arg1 <= 94) {
            this.method1715((byte) -94);
        }
        if (class95.field1425.field3832 != null) {
            class95.field1425.field3832.destroy();
        }
        try {
            this.method1715((byte) -125);
        } catch (Exception var10) {
        }
        if (this.field4063) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field4063 = false;
        }
        class95.field1425.method1679(class15.field219.getClass(), (byte) 17);
        if (class304.field4831 != null) {
            try {
                class304.field4831.removeFocusListener(this);
                class304.field4831.getParent().remove(class304.field4831);
            } catch (Exception var8) {
            }
        }
        if (class95.field1425 != null) {
            try {
                class95.field1425.method1680(0);
            } catch (Exception var7) {
            }
        }
        this.method1704(107);
        if (class73.field1086 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!wi", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4054++;
    }

    @OriginalMember(owner = "client!wi", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4077++;
        if (class73.field1086 == null) {
            return class95.field1425 == null || class95.field1425.field3832 == this ? super.getParameter(arg0) : class95.field1425.field3832.getParameter(arg0);
        } else {
            return null;
        }
    }
}
