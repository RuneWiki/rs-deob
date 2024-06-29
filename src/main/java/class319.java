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

@OriginalClass("client!oi")
public abstract class class319 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "Z")
    private boolean field4981 = false;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field4965 = 0;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field4971 = 0;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4963 = "";

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field4983 = 0;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public static int field4985 = 2;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "Z")
    public static boolean field4989;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "Z")
    public static boolean field4990;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "[Lai;")
    public static class126[] field4958;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method2184(byte arg0) {
        field4987++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 != 17) {
            this.field4981 = true;
        }
        if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method2186((byte) -43, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 41)
    public static final void method2185(int arg0) {
        field4953++;
        boolean var1 = true;
        class64.method460(50, false);
        class185.field2950 = 0;
        for (int var2 = 0; var2 < class2.field2.length; var2++) {
            if (class329.field5094[var2] != -1 && class2.field2[var2] == null) {
                class2.field2[var2] = class224.field3602.method467(0, 97, class329.field5094[var2]);
                if (class2.field2[var2] == null) {
                    var1 = false;
                    class185.field2950++;
                }
            }
            if (class138.field2190[var2] != -1 && class151.field2425[var2] == null) {
                class151.field2425[var2] = class224.field3602.method476(class138.field2190[var2], class29.method193(arg0, 31), class65.field1067[var2], 0);
                if (class151.field2425[var2] == null) {
                    var1 = false;
                    class185.field2950++;
                }
            }
            if (class265.field4126) {
                if (class140.field2226[var2] != -1 && class30.field508[var2] == null) {
                    class30.field508[var2] = class224.field3602.method467(0, 104, class140.field2226[var2]);
                    if (class30.field508[var2] == null) {
                        var1 = false;
                        class185.field2950++;
                    }
                }
                if (class95.field1570[var2] != -1 && class104.field1756[var2] == null) {
                    class104.field1756[var2] = class224.field3602.method467(0, class29.method193(arg0, 99), class95.field1570[var2]);
                    if (class104.field1756[var2] == null) {
                        var1 = false;
                        class185.field2950++;
                    }
                }
            }
            if (class118.field1901 != null && class307.field4845[var2] == null && class118.field1901[var2] != -1) {
                class307.field4845[var2] = class224.field3602.method476(class118.field1901[var2], 31, class65.field1067[var2], 0);
                if (class307.field4845[var2] == null) {
                    class185.field2950++;
                    var1 = false;
                }
            }
        }
        if (class79.field1204 == null) {
            if (class231.field3664 == null || !class219.field3510.method486(class231.field3664.field2624 + "_labels", 1)) {
                class79.field1204 = new class198(0);
            } else if (class219.field3510.method469(class231.field3664.field2624 + "_labels", -1465)) {
                class79.field1204 = class101.method763((byte) 56, class219.field3510, class231.field3664.field2624 + "_labels");
            } else {
                class185.field2950++;
                var1 = false;
            }
        }
        if (!var1) {
            class278.field4296 = 1;
            return;
        }
        class231.field3672 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class2.field2.length; var4++) {
            byte[] var5 = class151.field2425[var4];
            if (var5 != null) {
                int var6 = (class102.field1728[var4] & 0xFF) * 64 - class91.field1485;
                int var7 = (class102.field1728[var4] >> 8) * 64 - class177.field2780;
                if (class28.field455) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class14.method125(var5, 20876, var7, var6);
            }
            if (class265.field4126) {
                byte[] var8 = class104.field1756[var4];
                if (var8 != null) {
                    int var9 = (class102.field1728[var4] >> 8) * 64 - class177.field2780;
                    int var10 = (class102.field1728[var4] & 0xFF) * 64 - class91.field1485;
                    if (class28.field455) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class14.method125(var8, 20876, var9, var10);
                }
            }
        }
        if (!var3) {
            class278.field4296 = 2;
            return;
        }
        if (class278.field4296 != 0) {
            class17.method144((byte) 28, class64.field1015 + "<br>(100%)", true);
        }
        class84.method605((byte) 52);
        boolean var11 = false;
        class116.method867(0);
        if (class265.field4126 && class6.field61) {
            for (int var12 = 0; var12 < class2.field2.length; var12++) {
                if (class104.field1756[var12] != null || class30.field508[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class68.method515(4, 104, 104, class265.field4126 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class244.field3772[var13].method414(-17697);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class250.field3857[var14][var15][var16] = 0;
                }
            }
        }
        class268.method1924(5, false);
        if (class265.field4126) {
            class69.field1100.method2168();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class69.field1101[var17][var18].field2109 = true;
                }
            }
        }
        if (class265.field4126) {
            class38.method308();
        }
        if (class265.field4126) {
            class28.method186((byte) 126);
        }
        class84.method605((byte) 52);
        System.gc();
        class64.method460(50, true);
        class145.method1101(false, (byte) 20);
        if (!class28.field455) {
            class55.method407(true, false);
            class64.method460(50, true);
            if (class265.field4126) {
                int var19 = class19.field356.field1386[0] >> 3;
                int var20 = class19.field356.field1388[0] >> 3;
                class40.method325(var19, var20, arg0);
            }
            class277.method1984((byte) -70, false);
            if (class307.field4845 != null) {
                class33.method233(-944314938);
            }
        }
        if (class28.field455) {
            class217.method1569(-90, false);
            class64.method460(50, true);
            if (class265.field4126) {
                int var21 = class19.field356.field1386[0] >> 3;
                int var22 = class19.field356.field1388[0] >> 3;
                class40.method325(var21, var22, 0);
            }
            class139.method1065(false, (byte) 118);
        }
        class116.method867(arg0);
        class64.method460(arg0 + 50, true);
        class56.method423(false, -93, class244.field3772);
        if (class265.field4126) {
            class38.method316();
        }
        class64.method460(50, true);
        int var23 = class92.field1522;
        if (class41.field734 < var23) {
            var23 = class41.field734;
        }
        if (class41.field734 - 1 > var23) {
            int var24 = class41.field734 - 1;
        }
        if (class34.method248(-125)) {
            class264.method1877(0);
        } else {
            class264.method1877(class92.field1522);
        }
        class278.method1985((byte) 118);
        if (class265.field4126 && var11) {
            class151.method1155(true);
            class145.method1101(true, (byte) 20);
            if (!class28.field455) {
                class55.method407(true, true);
                class64.method460(50, true);
                class277.method1984((byte) -125, true);
            }
            if (class28.field455) {
                class217.method1569(-108, true);
                class64.method460(50, true);
                class139.method1065(true, (byte) 119);
            }
            class116.method867(0);
            class64.method460(50, true);
            class56.method423(true, -109, class244.field3772);
            class64.method460(arg0 ^ 0x32, true);
            class278.method1985((byte) -81);
            class151.method1155(false);
        }
        if (class265.field4126) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class69.field1101[var25][var26].method999(class29.field475[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class79.method580(var27, (byte) -82, var28);
            }
        }
        class19.method155(-121);
        class84.method605((byte) 52);
        class10.method78(0);
        class116.method867(arg0);
        class318.field4946 = false;
        if (class81.field1219 != null && class127.field2032 != null && class22.field394 == 25) {
            client.field3917++;
            class269.field4191.method246(false, 28);
            class269.field4191.method784(56, 1057001181);
        }
        if (!class28.field455) {
            int var29 = (class111.field1847 + 6) / 8;
            int var30 = (class111.field1847 - 6) / 8;
            int var31 = (class76.field1166 - 6) / 8;
            int var32 = (class76.field1166 + 6) / 8;
            for (int var33 = var30 - 1; var33 <= var29 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var30 > var33 || var33 > var29 || var31 > var34 || var34 > var32) {
                        class224.field3602.method472("m" + var33 + "_" + var34, arg0 ^ 0xFFFFE17E);
                        class224.field3602.method472("l" + var33 + "_" + var34, arg0 ^ 0xFFFFE17E);
                    }
                }
            }
        }
        if (class22.field394 == 28) {
            class320.method2196(10, arg0 ^ 0x0);
        } else {
            class320.method2196(30, arg0);
            if (class127.field2032 != null) {
                class269.field4191.method246(false, 142);
            }
        }
        class147.method1142(-29242);
        class84.method605((byte) 52);
        class180.method1344(arg0 ^ 0x7C);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLjava/lang/String;)V", line = 540)
    public final void method2186(byte arg0, String arg1) {
        field4955++;
        if (this.field4981) {
            return;
        }
        if (arg0 != -43) {
            field4983 = 121;
        }
        this.field4981 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!oi", name = "start", descriptor = "()V", line = 563)
    public final void start() {
        field4957++;
        if (class226.field3621 == this && !class78.field1188) {
            class162.field2549 = 0L;
        }
    }

    @OriginalMember(owner = "client!oi", name = "providesignlink", descriptor = "(Loj;)V", line = 575)
    public static final void providesignlink(class325 arg0) {
        field4954++;
        class83.field1235 = arg0;
        class310.field4877 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 586)
    public final void focusLost(FocusEvent arg0) {
        class55.field877 = false;
        field4978++;
    }

    @OriginalMember(owner = "client!oi", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 594)
    public final void windowActivated(WindowEvent arg0) {
        field4959++;
    }

    @OriginalMember(owner = "client!oi", name = "destroy", descriptor = "()V", line = 601)
    public final void destroy() {
        field4980++;
        if (class226.field3621 == this && !class78.field1188) {
            class162.field2549 = class154.method1172((byte) 110);
            class279.method1991(116, 5000L);
            class310.field4877 = null;
            this.method2187(0, false);
        }
    }

    @OriginalMember(owner = "client!oi", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 617)
    public final void windowClosed(WindowEvent arg0) {
        field4952++;
    }

    @OriginalMember(owner = "client!oi", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 628)
    public final AppletContext getAppletContext() {
        field4951++;
        if (class81.field1219 == null) {
            return class83.field1235 == null || class83.field1235.field5052 == this ? super.getAppletContext() : class83.field1235.field5052.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "stop", descriptor = "()V", line = 646)
    public final void stop() {
        field4967++;
        if (class226.field3621 == this && !class78.field1188) {
            class162.field2549 = class154.method1172((byte) 127) + 4000L;
        }
    }

    @OriginalMember(owner = "client!oi", name = "run", descriptor = "()V", line = 657)
    public final void run() {
        field4962++;
        try {
            if (class325.field5045 != null) {
                String var1 = class325.field5045.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class325.field5047;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2186((byte) -43, "wrongjava");
                        return;
                    }
                    class210.field3363 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class325.field5047 == null || class325.field5047.equals("1.4.2"))) {
                    this.method2186((byte) -43, "wrongjava");
                    return;
                }
            }
            if (class325.field5047 != null && class325.field5047.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class325.field5047.length() > var3) {
                    char var5 = class325.field5047.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class14.field255 = true;
                }
            }
            if (class83.field1235.field5052 != null) {
                Method var6 = class325.field5055;
                if (var6 != null) {
                    try {
                        var6.invoke(class83.field1235.field5052, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class71.method547((byte) 92);
            this.method2189(1468059619);
            class222.field3556 = class70.method541(-1, class73.field1127, class2.field7, class180.field2880);
            this.method1785(101);
            class275.field4269 = class220.method1592(false);
            while (class162.field2549 == 0L || class154.method1172((byte) 100) < class162.field2549) {
                class48.field802 = class275.field4269.method432(class270.field4202, 101, class210.field3363);
                for (int var8 = 0; var8 < class48.field802; var8++) {
                    this.method2193((byte) -111);
                }
                this.method2194(116);
                class25.method171(class2.field7, true, class83.field1235);
            }
        } catch (Exception var11) {
            class134.method1009(-2, (String) null, var11);
            this.method2186((byte) -43, "crash");
        }
        this.method2187(0, true);
    }

    @OriginalMember(owner = "client!oi", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 769)
    public final URL getDocumentBase() {
        field4968++;
        if (class81.field1219 == null) {
            return class83.field1235 == null || class83.field1235.field5052 == this ? super.getDocumentBase() : class83.field1235.field5052.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V", line = 788)
    private final void method2187(int arg0, boolean arg1) {
        field4960++;
        synchronized (this) {
            if (class78.field1188) {
                return;
            }
            class78.field1188 = true;
        }
        if (class83.field1235.field5052 != null) {
            class83.field1235.field5052.destroy();
        }
        try {
            this.method1793(arg0);
        } catch (Exception var12) {
        }
        if (class2.field7 != null) {
            try {
                class2.field7.removeFocusListener(this);
                class2.field7.getParent().remove(class2.field7);
            } catch (Exception var11) {
            }
        }
        if (class83.field1235 != null) {
            try {
                class83.field1235.method2227(0);
            } catch (Exception var10) {
            }
        }
        this.method1796(arg0 ^ 0xFFFFFF8E);
        if (class81.field1219 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!oi", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 855)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4956++;
    }

    @OriginalMember(owner = "client!oi", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 864)
    public final void windowDeiconified(WindowEvent arg0) {
        field4984++;
    }

    @OriginalMember(owner = "client!oi", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 874)
    public final URL getCodeBase() {
        field4972++;
        if (class81.field1219 == null) {
            return class83.field1235 == null || class83.field1235.field5052 == this ? super.getCodeBase() : class83.field1235.field5052.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V", line = 888)
    public final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4975++;
        try {
            if (class226.field3621 != null) {
                class221.field3535++;
                if (class221.field3535 >= 3) {
                    this.method2186((byte) -43, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class107.field1778 = 0;
            class226.field3621 = this;
            class180.field2880 = arg1;
            class64.field1053 = arg1;
            class121.field1938 = 0;
            class73.field1127 = arg4;
            class297.field4686 = arg4;
            class56.field892 = arg0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class181.field2903 = true;
            } else {
                class181.field2903 = false;
            }
            if (class83.field1235 == null) {
                class310.field4877 = class83.field1235 = new class325(this, arg2, (String) null, 0);
            }
            class21 var7 = class83.field1235.method2237(1, this, (byte) 21);
            while (var7.field387 == 0) {
                class279.method1991(115, 10L);
            }
            class89.field1400 = (Thread) var7.field391;
        } catch (Exception var9) {
            class134.method1009(-2, (String) null, var9);
            this.method2186((byte) -43, "crash");
        }
        if (arg3 >= -111) {
            field4963 = (String) null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V", line = 945)
    public final synchronized void method2189(int arg0) {
        if (class2.field7 != null) {
            class2.field7.removeFocusListener(this);
            class2.field7.getParent().remove(class2.field7);
        }
        if (arg0 != 1468059619) {
            field4983 = 41;
        }
        Container var2;
        if (class52.field823 != null) {
            var2 = class52.field823;
        } else if (class81.field1219 == null) {
            var2 = class83.field1235.field5052;
        } else {
            var2 = class81.field1219;
        }
        var2.setLayout((LayoutManager) null);
        class2.field7 = new class170(this);
        field4964++;
        var2.add(class2.field7);
        class2.field7.setSize(class180.field2880, class73.field1127);
        class2.field7.setVisible(true);
        if (class81.field1219 == var2) {
            Insets var3 = class81.field1219.getInsets();
            class2.field7.setLocation(class107.field1778 + var3.left, var3.top - -class121.field1938);
        } else {
            class2.field7.setLocation(class107.field1778, class121.field1938);
        }
        class2.field7.addFocusListener(this);
        class2.field7.requestFocus();
        class236.field3707 = true;
        class55.field877 = true;
        class28.field459 = true;
        class132.field2112 = false;
        class320.field4997 = class154.method1172((byte) 113);
    }

    @OriginalMember(owner = "client!oi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 1006)
    public final synchronized void paint(Graphics arg0) {
        field4977++;
        if (class226.field3621 != this || class78.field1188) {
            return;
        }
        class28.field459 = true;
        if (class14.field255 && !class265.field4126 && class154.method1172((byte) 115) - class320.field4997 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class64.field1053 <= var2.width && class297.field4686 <= var2.height) {
                class132.field2112 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 1028)
    public final String getParameter(String arg0) {
        field4988++;
        if (class81.field1219 == null) {
            return class83.field1235 == null || class83.field1235.field5052 == this ? super.getParameter(arg0) : class83.field1235.field5052.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1045)
    public final void windowOpened(WindowEvent arg0) {
        field4969++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;IIIIZII)V", line = 1053)
    public final void method2190(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4961++;
        try {
            class73.field1127 = arg3;
            class297.field4686 = arg3;
            class226.field3621 = this;
            class56.field892 = arg7;
            class121.field1938 = 0;
            class107.field1778 = 0;
            class180.field2880 = arg4;
            class64.field1053 = arg4;
            class81.field1219 = new Frame();
            class81.field1219.setTitle("Jagex");
            class81.field1219.setResizable(true);
            if (arg1 != 64) {
                this.method2187(-125, true);
            }
            class81.field1219.addWindowListener(this);
            class81.field1219.setVisible(true);
            class81.field1219.toFront();
            Insets var9 = class81.field1219.getInsets();
            class81.field1219.setSize(class64.field1053 + var9.left + var9.right, var9.top - -var9.bottom + class297.field4686);
            class310.field4877 = class83.field1235 = new class325((Applet) null, arg2, arg0, arg6);
            class21 var10 = class83.field1235.method2237(1, this, (byte) 94);
            while (var10.field387 == 0) {
                class279.method1991(91, 10L);
            }
            class89.field1400 = (Thread) var10.field391;
        } catch (Exception var12) {
            class134.method1009(arg1 ^ 0xFFFFFFBE, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!oi", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 1095)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4974++;
    }

    @OriginalMember(owner = "client!oi", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1104)
    public final void windowIconified(WindowEvent arg0) {
        field4976++;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 1111)
    public static void method2191(byte arg0) {
        field4958 = null;
        if (arg0 == -52) {
            field4963 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Ljava/lang/String;", line = 1122)
    public static final String method2192(int arg0, int arg1) {
        field4966++;
        if (arg0 != 0) {
            method2191((byte) 102);
        }
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF0498) >> 16) + "." + ((arg1 & 0xFF73) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!oi", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1137)
    public final void windowDeactivated(WindowEvent arg0) {
        field4982++;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V", line = 1144)
    private final void method2193(byte arg0) {
        field4950++;
        long var2 = class154.method1172((byte) 81);
        long var4 = class288.field4398[class193.field3070];
        if (var4 != 0L && var4 >= var2) {
        }
        if (arg0 >= -106) {
            field4971 = 66;
        }
        class288.field4398[class193.field3070] = var2;
        class193.field3070 = class193.field3070 + 1 & 0x1F;
        synchronized (this) {
            class236.field3707 = class55.field877;
        }
        this.method1795(-104);
    }

    @OriginalMember(owner = "client!oi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1178)
    public final void focusGained(FocusEvent arg0) {
        class55.field877 = true;
        field4970++;
        class28.field459 = true;
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V", line = 1193)
    private final void method2194(int arg0) {
        long var2 = class70.field1111[class96.field1586];
        long var4 = class154.method1172((byte) 86);
        field4986++;
        if (arg0 < 100) {
            this.method1796(118);
        }
        class70.field1111[class96.field1586] = var4;
        class96.field1586 = class96.field1586 + 1 & 0x1F;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class50.field807 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class139.field2220++) > 50) {
            class28.field459 = true;
            class139.field2220 -= 50;
            class2.field7.setSize(class180.field2880, class73.field1127);
            class2.field7.setVisible(true);
            if (class81.field1219 != null && class52.field823 == null) {
                Insets var7 = class81.field1219.getInsets();
                class2.field7.setLocation(class107.field1778 + var7.left, var7.top - -class121.field1938);
            } else {
                class2.field7.setLocation(class107.field1778, class121.field1938);
            }
        }
        this.method1801(false);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public abstract void method1795(int arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public abstract void method1801(boolean arg0);

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public abstract void method1796(int arg0);

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public abstract void method1785(int arg0);

    @OriginalMember(owner = "client!oi", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public abstract void method1793(int arg0);
}
