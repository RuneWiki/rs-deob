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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class47 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Z")
    private boolean field1141 = false;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lmc;")
    public static class75 field1127 = class30.method234(true, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1124 = 78;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Lmc;")
    public static class75 field1150 = class30.method234(true, "");

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lmc;")
    private static class75 field1134 = class30.method234(true, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Lmc;")
    public static class75 field1139 = field1150;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lmc;")
    public static class75 field1122 = field1150;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "Lmc;")
    public static class75 field1149 = field1150;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Lmc;")
    public static class75 field1157 = field1150;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Lmc;")
    public static class75 field1130 = field1150;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Lmc;")
    public static class75 field1161 = class30.method234(true, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Z")
    public static boolean field1128 = false;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lmc;")
    public static class75 field1125 = field1134;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "Lmc;")
    public static class75 field1166 = field1150;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Lmc;")
    private static class75 field1140 = class30.method234(true, "Login limit exceeded)3");

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lmc;")
    public static class75 field1133 = field1140;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "Lja;")
    public static class55 field1168;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "Z")
    public static boolean field1170;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
    public static int[] field1154;

    @OriginalMember(owner = "client!he", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 3)
    public final void windowDeactivated(WindowEvent arg0) {
        field1135++;
    }

    @OriginalMember(owner = "client!he", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 12)
    public final synchronized void paint(Graphics arg0) {
        field1152++;
        if (class117.field2893 != this || class28.field601) {
            return;
        }
        class110.field2780 = true;
        if (class124.field3037 == null || !class124.field3037.startsWith("1.5") || System.currentTimeMillis() - class76.field1943 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        if (var2 == null) {
            System.out.println("Rect: null");
        } else {
            System.out.println("Rect: " + var2.x + "," + var2.y + "," + var2.width + "," + var2.height);
        }
        if (var2 == null || var2.width >= class17.field344 && class119.field2935 <= var2.height) {
            class52.field1284 = true;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V", line = 55)
    private final void method351(byte arg0) {
        field1132++;
        long var2 = class3.field55[class17.field352];
        long var4 = System.currentTimeMillis();
        class3.field55[class17.field352] = var4;
        class17.field352 = class17.field352 + 1 & 0x1F;
        if (arg0 != -26) {
            field1134 = null;
        }
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class61.field1593 = ((var6 >> 1) + 32000) / var6;
        }
        if (class69.field1755++ > 50) {
            class69.field1755 -= 50;
            class110.field2780 = true;
            class108.field2738.setSize(class17.field344, class119.field2935);
            class108.field2738.setVisible(true);
            if (class21.field421 == null) {
                class108.field2738.setLocation(0, 0);
            } else {
                Insets var7 = class21.field421.getInsets();
                class108.field2738.setLocation(var7.left, var7.top);
            }
        }
        this.method127(50);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 98)
    public static void method352(int arg0) {
        field1130 = null;
        field1168 = null;
        field1140 = null;
        field1127 = null;
        field1150 = null;
        if (arg0 >= -30) {
            field1130 = null;
        }
        field1166 = null;
        field1139 = null;
        field1125 = null;
        field1133 = null;
        field1157 = null;
        field1161 = null;
        field1154 = null;
        field1122 = null;
        field1134 = null;
        field1149 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Ldb;", line = 129)
    public static final class21 method353(byte arg0, int arg1) {
        field1165++;
        class21 var2 = (class21) class101.field2612.method559((long) arg1, -114);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field1168.method436(arg1, 5, 4);
        if (arg0 > -110) {
            method352(5);
        }
        class21 var4 = new class21();
        if (var3 != null) {
            var4.method150(arg1, new class61(var3), 16846);
        }
        var4.method152(20993);
        class101.field2612.method558((long) arg1, var4, 304);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 157)
    private final synchronized void method354(boolean arg0) {
        field1136++;
        if (class28.field601) {
            return;
        }
        class28.field601 = arg0;
        try {
            class108.field2738.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method134(-13691);
        } catch (Exception var4) {
        }
        if (class21.field421 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class78.field1967 != null) {
            try {
                class78.field1967.method987((byte) -126);
            } catch (Exception var2) {
            }
        }
        this.method130((byte) -7);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/net/InetAddress;Ljava/lang/String;IIIIII)V", line = 203)
    public final void method355(InetAddress arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1137++;
        try {
            class17.field344 = arg5;
            class45.field1111 = arg3;
            class117.field2893 = this;
            class119.field2935 = arg6;
            class21.field421 = new Frame();
            class21.field421.setTitle("Jagex");
            class21.field421.setResizable(false);
            class21.field421.addWindowListener(this);
            if (arg7 != 50) {
                this.destroy();
            }
            class21.field421.setVisible(true);
            class21.field421.toFront();
            Insets var9 = class21.field421.getInsets();
            class21.field421.setSize(arg5 + var9.left + var9.right, arg6 - -var9.bottom + var9.top);
            class36.field859 = class78.field1967 = new class124(true, null, arg0, arg2, arg1, arg4);
            class78.field1967.method986(0, this, 1);
        } catch (Exception var11) {
            class114.method918(12541, null, var11);
        }
    }

    @OriginalMember(owner = "client!he", name = "stop", descriptor = "()V", line = 242)
    public final void stop() {
        field1143++;
        if (class117.field2893 == this && !class28.field601) {
            class87.field2152 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V", line = 259)
    public final void method356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1160++;
        try {
            if (class117.field2893 == null) {
                class119.field2935 = arg0;
                class45.field1111 = arg2;
                class117.field2893 = this;
                class17.field344 = arg1;
                if (arg4 != 11063) {
                    field1127 = null;
                }
                if (class78.field1967 == null) {
                    class36.field859 = class78.field1967 = new class124(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg3, null, 0);
                }
                class78.field1967.method986(arg4 ^ 0x2B37, this, 1);
            } else {
                this.method358("alreadyloaded", (byte) 76);
            }
        } catch (Exception var7) {
            class114.method918(12541, null, var7);
            this.method358("crash", (byte) 76);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 291)
    public static final void method357(int arg0) {
        class118.field2923.method707(-126, 11);
        int var1 = -44 / ((arg0 - 14) / 40);
        field1148++;
        if (class36.field868 != -1) {
            class71.method598((byte) 76, class36.field868);
            class30.field681 = true;
            class36.field868 = -1;
            class75.field1894 = false;
            class108.field2743 = true;
        }
        class97.field2438++;
        if (class130.field3161 != -1) {
            class71.method598((byte) -83, class130.field3161);
            class35.field841 = true;
            class75.field1894 = false;
            class130.field3161 = -1;
        }
        if (class52.field1320 != -1) {
            class71.method598((byte) 107, class52.field1320);
            class52.field1320 = -1;
            class17.method121(30, -9411);
        }
        if (class69.field1766 != -1) {
            class71.method598((byte) -66, class69.field1766);
            class69.field1766 = -1;
        }
        if (class130.field3155 != -1) {
            class71.method598((byte) -81, class130.field3155);
            class130.field3155 = -1;
        }
    }

    @OriginalMember(owner = "client!he", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 341)
    public final void windowIconified(WindowEvent arg0) {
        field1138++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 348)
    public final void method358(String arg0, byte arg1) {
        field1119++;
        if (arg1 != 76) {
            field1157 = null;
        }
        if (this.field1141) {
            return;
        }
        this.field1141 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V", line = 374)
    private final void method359(int arg0) {
        field1145++;
        long var2 = System.currentTimeMillis();
        if (arg0 > -107) {
            this.getParameter(null);
        }
        long var4 = class55.field1362[class87.field2150];
        class55.field1362[class87.field2150] = var2;
        class87.field2150 = class87.field2150 + 1 & 0x1F;
        synchronized (this) {
            class63.field1671 = class8.field140;
        }
        this.method131((byte) 124);
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
    }

    @OriginalMember(owner = "client!he", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 404)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1147++;
    }

    @OriginalMember(owner = "client!he", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 420)
    public final AppletContext getAppletContext() {
        field1123++;
        if (class21.field421 == null) {
            return class78.field1967 == null || class78.field1967.field3036 == this ? super.getAppletContext() : class78.field1967.field3036.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "destroy", descriptor = "()V", line = 438)
    public final void destroy() {
        field1156++;
        if (class117.field2893 == this && !class28.field601) {
            class87.field2152 = System.currentTimeMillis();
            class13.method86(5000L, 1);
            class36.field859 = null;
            this.method354(true);
        }
    }

    @OriginalMember(owner = "client!he", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 458)
    public final URL getDocumentBase() {
        field1162++;
        if (class21.field421 == null) {
            return class78.field1967 == null || class78.field1967.field3036 == this ? super.getDocumentBase() : class78.field1967.field3036.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 475)
    public final void focusGained(FocusEvent arg0) {
        class8.field140 = true;
        field1159++;
        class110.field2780 = true;
    }

    @OriginalMember(owner = "client!he", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 484)
    public final void focusLost(FocusEvent arg0) {
        class8.field140 = false;
        field1144++;
    }

    @OriginalMember(owner = "client!he", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 492)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1131++;
    }

    @OriginalMember(owner = "client!he", name = "providesignlink", descriptor = "(Lvb;)V", line = 501)
    public static final void providesignlink(class124 arg0) {
        field1117++;
        class78.field1967 = arg0;
        class36.field859 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "run", descriptor = "()V", line = 511)
    public final void run() {
        field1164++;
        try {
            if (class124.field3032 != null) {
                String var1 = class124.field3032.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class124.field3037;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method358("wrongjava", (byte) 76);
                        return;
                    }
                    class71.field1803 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class124.field3037 == null || class124.field3037.equals("1.4.2"))) {
                    this.method358("wrongjava", (byte) 76);
                    return;
                }
            }
            this.method360((byte) 32);
            client.field374 = class74.method616(class108.field2738, (byte) 115, class119.field2935, class17.field344);
            this.method129((byte) 100);
            class88.field2171 = class38.method301(200);
            class88.field2171.method80(64);
            while (class87.field2152 == 0L || class87.field2152 > System.currentTimeMillis()) {
                class8.field146 = class88.field2171.method79((byte) 50, class71.field1803, class41.field981);
                for (int var3 = 0; var3 < class8.field146; var3++) {
                    this.method359(-113);
                }
                this.method351((byte) -26);
            }
        } catch (Exception var5) {
            class114.method918(12541, null, var5);
            this.method358("crash", (byte) 76);
        }
        this.method354(true);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V", line = 578)
    public final synchronized void method360(byte arg0) {
        System.out.println("addcanvas");
        field1167++;
        Container var2;
        if (class21.field421 == null) {
            var2 = class78.field1967.field3036;
        } else {
            var2 = class21.field421;
        }
        if (class108.field2738 != null) {
            class108.field2738.removeFocusListener(this);
            var2.remove(class108.field2738);
        }
        class108.field2738 = new class30(this);
        if (arg0 != 32) {
            return;
        }
        var2.add(class108.field2738);
        class108.field2738.setSize(class17.field344, class119.field2935);
        class108.field2738.setVisible(true);
        if (class21.field421 == null) {
            class108.field2738.setLocation(0, 0);
        } else {
            Insets var3 = class21.field421.getInsets();
            class108.field2738.setLocation(var3.left, var3.top);
        }
        class108.field2738.addFocusListener(this);
        class108.field2738.requestFocus();
        class110.field2780 = true;
        class52.field1284 = false;
        class76.field1943 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!he", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 620)
    public final void windowActivated(WindowEvent arg0) {
        field1118++;
    }

    @OriginalMember(owner = "client!he", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 629)
    public final void windowClosed(WindowEvent arg0) {
        field1155++;
    }

    @OriginalMember(owner = "client!he", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 643)
    public final void windowOpened(WindowEvent arg0) {
        field1120++;
    }

    @OriginalMember(owner = "client!he", name = "start", descriptor = "()V", line = 652)
    public final void start() {
        field1121++;
        if (class117.field2893 == this && !class28.field601) {
            class87.field2152 = 0L;
        }
    }

    @OriginalMember(owner = "client!he", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 669)
    public final URL getCodeBase() {
        field1146++;
        if (class21.field421 == null) {
            return class78.field1967 == null || class78.field1967.field3036 == this ? super.getCodeBase() : class78.field1967.field3036.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 695)
    public final void windowDeiconified(WindowEvent arg0) {
        field1163++;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V", line = 728)
    public static final void method361(int arg0) {
        field1151++;
        if (class130.field3166 == 0) {
            class107.field2679 = new class29(4, 104, 104, class15.field280);
            for (int var1 = 0; var1 < 4; var1++) {
                class110.field2783[var1] = new class8(104, 104);
            }
            class108.field2740 = new class2(512, 512);
            class130.field3166 = 20;
            class62.field1627 = 5;
            field1122 = class78.field1964;
        } else if (class130.field3166 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class49.field1196[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class29.method228(var2, 500, 800, 512, 334);
            class62.field1627 = 10;
            class130.field3166 = 30;
            field1122 = class114.field2885;
        } else if (class130.field3166 == 30) {
            class71.field1799 = class10.method68(true, -60, false, 0, true);
            class31.field693 = class10.method68(true, -68, false, 1, true);
            class125.field3070 = class10.method68(false, -58, true, 2, true);
            class112.field2838 = class10.method68(true, -88, false, 3, true);
            class10.field223 = class10.method68(true, arg0 - 87, false, 4, true);
            class40.field967 = class10.method68(true, arg0 - 64, true, 5, true);
            class10.field224 = class10.method68(true, -78, true, 6, false);
            class45.field1101 = class10.method68(true, -127, false, 7, true);
            class12.field248 = class10.method68(true, arg0 - 94, false, 8, true);
            class57.field1440 = class10.method68(true, -106, false, 9, true);
            class32.field712 = class10.method68(true, -83, false, 10, true);
            class100.field2587 = class10.method68(true, arg0 ^ 0xFFFFFFC7, false, 11, true);
            class62.field1627 = 20;
            field1122 = class40.field962;
            class130.field3166 = 40;
        } else if (class130.field3166 == 40) {
            byte var7 = 0;
            int var8 = var7 + class71.field1799.method743((byte) -21) * 5 / 100;
            int var9 = var8 + class31.field693.method743((byte) -21) * 5 / 100;
            int var10 = var9 + class125.field3070.method743((byte) -21) * 5 / 100;
            int var11 = var10 + class112.field2838.method743((byte) -21) * 5 / 100;
            int var12 = var11 + class10.field223.method743((byte) -21) * 5 / 100;
            int var13 = var12 + class40.field967.method743((byte) -21) * 5 / 100;
            int var14 = var13 + class10.field224.method743((byte) -21) * 5 / 100;
            int var15 = var14 + class45.field1101.method743((byte) -21) * 45 / 100;
            int var16 = var15 + class12.field248.method743((byte) -21) * 5 / 100;
            int var17 = var16 + class57.field1440.method743((byte) -21) * 5 / 100;
            int var18 = var17 + class32.field712.method743((byte) -21) * 5 / 100;
            int var19 = var18 + class100.field2587.method743((byte) -21) * 5 / 100;
            if (var19 == 100) {
                class130.field3166 = 45;
                field1122 = class5.field83;
                class62.field1627 = 30;
            } else {
                if (var19 != 0) {
                    field1122 = class69.method586(new class75[] { class10.field153, class45.method345(22978, var19), class32.field723 }, (byte) 78);
                }
                class62.field1627 = 30;
            }
        } else if (class130.field3166 == 45) {
            class62.method543(!class92.field2270, 0, class78.field1967, false);
            class110.field2792 = class36.method281((byte) -15, class108.field2738, class78.field1967);
            class34.field792 = new class23(22050, class10.field221);
            class130.field3166 = 50;
            class62.field1627 = 35;
            field1122 = class86.field2119;
        } else {
            if (arg0 != 3) {
                method357(-4);
            }
            if (class130.field3166 == 50) {
                int var20 = 0;
                if (class44.field1046 == null) {
                    class44.field1046 = class97.method817(class21.field390, class16.field309, false, class12.field248);
                } else {
                    var20++;
                }
                if (class114.field2869 == null) {
                    class114.field2869 = class97.method817(class35.field833, class16.field309, false, class12.field248);
                } else {
                    var20++;
                }
                if (class5.field77 == null) {
                    class5.field77 = class97.method817(class26.field521, class16.field309, false, class12.field248);
                } else {
                    var20++;
                }
                if (var20 < 3) {
                    field1122 = class69.method586(new class75[] { class3.field59, class45.method345(22978, var20 * 100 / 3), class32.field723 }, (byte) 99);
                    class62.field1627 = 40;
                } else {
                    class62.field1627 = 40;
                    class130.field3166 = 60;
                    field1122 = class30.field670;
                }
            } else if (class130.field3166 == 60) {
                int var21 = class34.method264(class32.field712, class12.field248, 17839);
                int var22 = class40.method303((byte) 123);
                if (var22 > var21) {
                    field1122 = class69.method586(new class75[] { class27.field533, class45.method345(22978, var21 * 100 / var22), class32.field723 }, (byte) 30);
                    class62.field1627 = 50;
                } else {
                    class62.field1627 = 50;
                    field1122 = class61.field1549;
                    class17.method121(5, -9411);
                    class130.field3166 = 70;
                }
            } else if (class130.field3166 == 70) {
                if (class125.field3070.method440(5996)) {
                    class90.method749(0, class125.field3070);
                    class35.method277(class125.field3070, (byte) 117);
                    class58.method464(-109, class45.field1101, class125.field3070);
                    class41.method318(class125.field3070, class45.field1101, arg0 + 18, class92.field2270);
                    class75.method629(class45.field1101, arg0 - 3680, class125.field3070);
                    class118.method942(class125.field3070, 10, class45.field1101, class109.field2755);
                    class100.method835(class125.field3070, 0, class31.field693, class71.field1799);
                    class108.method886((byte) -127, class125.field3070, class45.field1101);
                    class71.method603((byte) -96, class125.field3070);
                    class128.method1006(class125.field3070, -103);
                    class104.method859(class112.field2838, class12.field248, arg0 - 32003, class45.field1101);
                    field1122 = class38.field911;
                    class62.field1627 = 60;
                    class130.field3166 = 80;
                } else {
                    field1122 = class69.method586(new class75[] { class112.field2851, class45.method345(22978, class125.field3070.method746((byte) 116)), class32.field723 }, (byte) 76);
                    class62.field1627 = 60;
                }
            } else if (class130.field3166 == 80) {
                int var23 = 0;
                if (class35.field844 == null) {
                    class35.field844 = class104.method863(class82.field2030, class12.field248, class16.field309, 101);
                } else {
                    var23++;
                }
                if (class76.field1940 == null) {
                    class76.field1940 = class104.method863(class99.field2544, class12.field248, class16.field309, arg0 ^ 0xFFFFFF98);
                } else {
                    var23++;
                }
                if (class98.field2466 == null) {
                    class98.field2466 = class94.method802(class12.field248, (byte) 104, class16.field309, class42.field1017);
                } else {
                    var23++;
                }
                if (class130.field3171 == null) {
                    class130.field3171 = class84.method695(true, class16.field309, class12.field248, class92.field2284);
                } else {
                    var23++;
                }
                if (class129.field3146 == null) {
                    class129.field3146 = class84.method695(true, class16.field309, class12.field248, class7.field106);
                } else {
                    var23++;
                }
                if (class99.field2553 == null) {
                    class99.field2553 = class84.method695(true, class16.field309, class12.field248, class69.field1772);
                } else {
                    var23++;
                }
                if (class109.field2765 == null) {
                    class109.field2765 = class84.method695(true, class16.field309, class12.field248, class3.field39);
                } else {
                    var23++;
                }
                if (class64.field1685 == null) {
                    class64.field1685 = class84.method695(true, class16.field309, class12.field248, class94.field2383);
                } else {
                    var23++;
                }
                if (class64.field1698 == null) {
                    class64.field1698 = class104.method863(class122.field2986, class12.field248, class16.field309, 105);
                } else {
                    var23++;
                }
                if (class58.field1470 == null) {
                    class58.field1470 = class84.method695(true, class16.field309, class12.field248, class36.field862);
                } else {
                    var23++;
                }
                if (class50.field1275 == null) {
                    class50.field1275 = class84.method695(true, class16.field309, class12.field248, class50.field1241);
                } else {
                    var23++;
                }
                if (class36.field879 == null) {
                    class36.field879 = class84.method695(true, class16.field309, class12.field248, class26.field512);
                } else {
                    var23++;
                }
                if (class26.field524 == null) {
                    class26.field524 = class94.method802(class12.field248, (byte) 104, class16.field309, class17.field347);
                } else {
                    var23++;
                }
                if (class109.field2769 == null) {
                    class109.field2769 = class94.method802(class12.field248, (byte) 104, class16.field309, class101.field2606);
                } else {
                    var23++;
                }
                if (var23 < 14) {
                    field1122 = class69.method586(new class75[] { class32.field720, class45.method345(arg0 ^ 0x59C1, var23 * 100 / 14), class32.field723 }, (byte) 98);
                    class62.field1627 = 70;
                } else {
                    class76.field1940.method7();
                    int var24 = (int) (Math.random() * 21.0D) - 10;
                    int var25 = (int) (Math.random() * 21.0D) - 10;
                    int var26 = (int) (Math.random() * 41.0D) - 20;
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    for (int var28 = 0; var28 < class130.field3171.length; var28++) {
                        class130.field3171[var28].method5(var24 + var26, var26 + var27, var25 + var26);
                    }
                    class98.field2466[0].method683(var24 + var26, var26 + var27, var25 + var26);
                    class62.field1627 = 70;
                    field1122 = class38.field921;
                    class130.field3166 = 85;
                }
            } else if (class130.field3166 == 85) {
                int var29 = class44.method334(true, class12.field248);
                int var30 = class24.method165((byte) -121);
                if (var30 > var29) {
                    field1122 = class69.method586(new class75[] { class15.field264, class45.method345(arg0 ^ 0x59C1, var29 * 100 / var30), class32.field723 }, (byte) 65);
                    class62.field1627 = 80;
                } else {
                    class130.field3166 = 90;
                    field1122 = class107.field2699;
                    class62.field1627 = 80;
                }
            } else if (class130.field3166 == 90) {
                if (class57.field1440.method440(5996)) {
                    class16 var31 = new class16(class57.field1440, class12.field248, 20, 0.8D, class92.field2270 ? 64 : 128);
                    class49.method370(var31);
                    class49.method375(0.8D);
                    class62.field1627 = 90;
                    field1122 = class21.field397;
                    class130.field3166 = 110;
                } else {
                    field1122 = class69.method586(new class75[] { class114.field2884, class45.method345(22978, class57.field1440.method746((byte) 95)), class32.field723 }, (byte) 112);
                    class62.field1627 = 90;
                }
            } else if (class130.field3166 == 110) {
                class40.field969 = new class68();
                class78.field1967.method986(arg0 ^ 0x3, class40.field969, 10);
                field1122 = class50.field1276;
                class130.field3166 = 120;
                class62.field1627 = 94;
            } else if (class130.field3166 == 120) {
                if (class32.field712.method444(class84.field2055, class16.field309, (byte) -32)) {
                    class41 var32 = new class41(class32.field712.method442(class16.field309, class84.field2055, (byte) 49));
                    class42.method321(var32, 0);
                    class62.field1627 = 96;
                    class130.field3166 = 130;
                    field1122 = class31.field702;
                } else {
                    field1122 = class69.method586(new class75[] { class35.field826, class55.field1364 }, (byte) 105);
                    class62.field1627 = 96;
                }
            } else if (class130.field3166 == 130) {
                if (class112.field2838.method440(5996)) {
                    class130.field3166 = 140;
                    class62.field1627 = 100;
                    field1122 = class30.field668;
                } else {
                    field1122 = class69.method586(new class75[] { class52.field1313, class45.method345(22978, class112.field2838.method746((byte) 93)), class32.field723 }, (byte) 32);
                    class62.field1627 = 100;
                }
            } else if (class130.field3166 == 140) {
                class17.method121(10, -9411);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 1132)
    public final String getParameter(String arg0) {
        field1158++;
        if (class21.field421 == null) {
            return class78.field1967 == null || class78.field1967.field3036 == this ? super.getParameter(arg0) : class78.field1967.field3036.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(B)Z", line = 1154)
    public final boolean method362(byte arg0) {
        field1153++;
        int var2 = -19 / ((arg0 + 28) / 54);
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        if (var3.endsWith("jagex.com")) {
            return true;
        } else if (var3.endsWith("runescape.com")) {
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
                this.method358("invalidhost", (byte) 76);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public abstract void method129(byte arg0);

    @OriginalMember(owner = "client!he", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public abstract void method134(int arg0);

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public abstract void method127(int arg0);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
    public abstract void method131(byte arg0);

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(B)V")
    public abstract void method130(byte arg0);
}
