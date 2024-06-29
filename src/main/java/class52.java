import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Component;
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

@OriginalClass("client!hc")
public abstract class class52 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
    private boolean field1164 = false;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lv;")
    public static class146 field1181 = class159.method1226((byte) -37, "title)3jpg");

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Lv;")
    public static class146 field1177 = class159.method1226((byte) -37, "(U0a )2 via: ");

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Z")
    private static boolean field1194 = false;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Lv;")
    public static class146 field1191 = class159.method1226((byte) -37, "<col=00ff80>");

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "[I")
    public static int[] field1196 = new int[4000];

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "Z")
    public static boolean field1204 = false;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lv;")
    private static class146 field1172 = class159.method1226((byte) -37, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Lv;")
    public static class146 field1183 = field1172;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "Lv;")
    public static class146 field1197 = class159.method1226((byte) -37, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lla;")
    public static class77 field1169;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "Z")
    public static boolean field1207;

    @OriginalMember(owner = "client!hc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1168++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public final synchronized void method347(int arg0) {
        if (arg0 != -11354) {
            return;
        }
        field1192++;
        Container var2;
        if (client.field338 == null) {
            var2 = class145.field3293.field319;
        } else {
            var2 = client.field338;
        }
        if (class1.field3 != null) {
            class1.field3.removeFocusListener(this);
            var2.remove(class1.field3);
        }
        class1.field3 = new class151(this);
        var2.add(class1.field3);
        class1.field3.setSize(class95.field2323, class35.field805);
        class1.field3.setVisible(true);
        if (client.field338 == null) {
            class1.field3.setLocation(0, 0);
        } else {
            Insets var3 = client.field338.getInsets();
            class1.field3.setLocation(var3.left, var3.top);
        }
        class1.field3.addFocusListener(this);
        class1.field3.requestFocus();
        class124.field2869 = true;
        class48.field1101 = false;
        class29.field595 = class51.method345((byte) -1);
    }

    @OriginalMember(owner = "client!hc", name = "providesignlink", descriptor = "(Lcf;)V")
    public static final void providesignlink(class21 arg0) {
        field1206++;
        class145.field3293 = arg0;
        class46.field1068 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public abstract void method127(boolean arg0);

    @OriginalMember(owner = "client!hc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1202++;
        if (class87.field2060 != this || field1194) {
            return;
        }
        class124.field2869 = true;
        if (class21.field327 != null && class21.field327.startsWith("1.5") && class51.method345((byte) -1) - class29.field595 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class95.field2323 <= var2.width && class35.field805 <= var2.height) {
                class48.field1101 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1178++;
    }

    @OriginalMember(owner = "client!hc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1193++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method348(Component arg0, int arg1) {
        arg0.removeMouseListener(class110.field2601);
        field1189++;
        arg0.removeMouseMotionListener(class110.field2601);
        arg0.removeFocusListener(class110.field2601);
        class69.field1621 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class134.field3068 = false;
        field1201++;
    }

    @OriginalMember(owner = "client!hc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1203++;
    }

    @OriginalMember(owner = "client!hc", name = "start", descriptor = "()V")
    public final void start() {
        field1174++;
        if (class87.field2060 == this && !field1194) {
            class145.field3290 = 0L;
        }
    }

    @OriginalMember(owner = "client!hc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1184++;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    private final void method349(int arg0) {
        field1180++;
        long var2 = class51.method345((byte) -1);
        long var4 = class148.field3449[class137.field3106];
        class148.field3449[class137.field3106] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class28.field588 = ((var6 >> 1) + 32000) / var6;
        }
        class137.field3106 = class137.field3106 + arg0 & 0x1F;
        if (class15.field247++ > 50) {
            class15.field247 -= 50;
            class124.field2869 = true;
            class1.field3.setSize(class95.field2323, class35.field805);
            class1.field3.setVisible(true);
            if (client.field338 == null) {
                class1.field3.setLocation(0, 0);
            } else {
                Insets var7 = client.field338.getInsets();
                class1.field3.setLocation(var7.left, var7.top);
            }
        }
        this.method132(-111);
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    private final synchronized void method350(int arg0) {
        field1186++;
        if (field1194) {
            return;
        }
        field1194 = true;
        try {
            class1.field3.removeFocusListener(this);
            if (arg0 != -1) {
                this.field1164 = true;
            }
        } catch (Exception var5) {
        }
        try {
            this.method138(-91);
        } catch (Exception var4) {
        }
        if (client.field338 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class145.field3293 != null) {
            try {
                class145.field3293.method120(32);
            } catch (Exception var2) {
            }
        }
        this.method136(false);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLdd;)Lv;")
    public static final class146 method351(boolean arg0, class26 arg1) {
        if (arg0) {
            method354((byte) 103);
        }
        field1171++;
        if (class146.method1118(class42.method281(arg1, 1299495520), (byte) -113) == 0) {
            return null;
        } else if (arg1.field472 == null || arg1.field472.method1112((byte) -109).method1080(-1) == 0) {
            return class119.field2767 ? class120.field2780 : null;
        } else {
            return arg1.field472;
        }
    }

    @OriginalMember(owner = "client!hc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1195++;
        if (client.field338 == null) {
            return class145.field3293 == null || class145.field3293.field319 == this ? super.getCodeBase() : class145.field3293.field319.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "run", descriptor = "()V")
    public final void run() {
        field1188++;
        try {
            if (class21.field320 != null) {
                String var1 = class21.field320.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class21.field327;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method355("wrongjava", (byte) 123);
                        return;
                    }
                    class94.field2242 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class21.field327 == null || class21.field327.equals("1.4.2"))) {
                    this.method355("wrongjava", (byte) 99);
                    return;
                }
            }
            if (class145.field3293.field319 != null) {
                Method var3 = class21.field332;
                if (var3 != null) {
                    try {
                        var3.invoke(class145.field3293.field319, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method347(-11354);
            class141.field3233 = class91.method717(class35.field805, class1.field3, true, class95.field2323);
            this.method127(false);
            class12.field194 = class122.method923((byte) -128);
            while (class145.field3290 == 0L || class51.method345((byte) -1) < class145.field3290) {
                class147.field3417 = class12.field194.method12(class24.field390, class94.field2242, (byte) 12);
                for (int var4 = 0; var4 < class147.field3417; var4++) {
                    this.method353(15441);
                }
                this.method349(1);
                class60.method420(class145.field3293, (byte) 123, class1.field3);
            }
        } catch (Exception var7) {
            class122.method921((byte) 90, null, var7);
            this.method355("crash", (byte) 61);
        }
        this.method350(-1);
    }

    @OriginalMember(owner = "client!hc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1198++;
        if (class87.field2060 == this && !field1194) {
            class145.field3290 = class51.method345((byte) -1);
            class6.method51(5000L, -14344);
            class46.field1068 = null;
            this.method350(-1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "stop", descriptor = "()V")
    public final void stop() {
        field1200++;
        if (class87.field2060 == this && !field1194) {
            class145.field3290 = class51.method345((byte) -1) + 4000L;
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public abstract void method131(int arg0);

    @OriginalMember(owner = "client!hc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1199++;
        if (client.field338 == null) {
            return class145.field3293 == null || class145.field3293.field319 == this ? super.getAppletContext() : class145.field3293.field319.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
    public final boolean method352(byte arg0) {
        field1205++;
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
            if (arg0 > -68) {
                field1204 = true;
            }
            this.method355("invalidhost", (byte) 75);
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1173++;
    }

    @OriginalMember(owner = "client!hc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class134.field3068 = true;
        field1185++;
        class124.field2869 = true;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
    public abstract void method138(int arg0);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
    private final void method353(int arg0) {
        field1167++;
        long var2 = class59.field1366[class51.field1161];
        long var4 = class51.method345((byte) -1);
        class59.field1366[class51.field1161] = var4;
        if (arg0 != 15441) {
            field1194 = false;
        }
        class51.field1161 = class51.field1161 + 1 & 0x1F;
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class71.field1649 = class134.field3068;
        }
        this.method131(arg0 ^ 0xFFFFC3CD);
    }

    @OriginalMember(owner = "client!hc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1175++;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static void method354(byte arg0) {
        field1196 = null;
        field1169 = null;
        int var1 = -110 / ((-arg0 - 66) / 36);
        field1172 = null;
        field1183 = null;
        field1181 = null;
        field1197 = null;
        field1177 = null;
        field1191 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method355(String arg0, byte arg1) {
        if (arg1 < 58) {
            return;
        }
        field1170++;
        if (this.field1164) {
            return;
        }
        this.field1164 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBIIIILjava/lang/String;)V")
    public final void method356(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        try {
            class143.field3277 = arg0;
            class87.field2060 = this;
            class95.field2323 = arg3;
            class35.field805 = arg5;
            client.field338 = new Frame();
            client.field338.setTitle("Jagex");
            client.field338.setResizable(false);
            client.field338.addWindowListener(this);
            client.field338.setVisible(true);
            client.field338.toFront();
            Insets var8 = client.field338.getInsets();
            client.field338.setSize(var8.right + arg3 + var8.left, arg5 - -var8.bottom + var8.top);
            class46.field1068 = class145.field3293 = new class21(true, null, arg4, arg6, arg2);
            class145.field3293.method123(this, 1, 114);
            if (arg1 < 53) {
                this.start();
            }
        } catch (Exception var10) {
            class122.method921((byte) 90, null, var10);
        }
        field1176++;
    }

    @OriginalMember(owner = "client!hc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1165++;
    }

    @OriginalMember(owner = "client!hc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
    public abstract void method132(int arg0);

    @OriginalMember(owner = "client!hc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1190++;
        if (client.field338 == null) {
            return class145.field3293 == null || class145.field3293.field319 == this ? super.getDocumentBase() : class145.field3293.field319.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1166++;
        if (client.field338 == null) {
            return class145.field3293 == null || class145.field3293.field319 == this ? super.getParameter(arg0) : class145.field3293.field319.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
    public abstract void method136(boolean arg0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIZ)V")
    public final void method357(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1182++;
        try {
            if (arg4) {
                if (class87.field2060 == null) {
                    class95.field2323 = arg2;
                    class35.field805 = arg3;
                    class143.field3277 = arg1;
                    class87.field2060 = this;
                    if (class145.field3293 == null) {
                        class46.field1068 = class145.field3293 = new class21(false, this, arg0, null, 0);
                    }
                    class145.field3293.method123(this, 1, -118);
                } else {
                    class6.field131++;
                    if (class6.field131 >= 3) {
                        this.method355("alreadyloaded", (byte) 124);
                    } else {
                        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    }
                }
            }
        } catch (Exception var7) {
            class122.method921((byte) 90, null, var7);
            this.method355("crash", (byte) 64);
        }
    }
}
