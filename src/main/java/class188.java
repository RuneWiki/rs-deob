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

@OriginalClass("client!fa")
public abstract class class188 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
    private boolean field3230 = false;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Z")
    public static boolean field3217 = true;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lcd;")
    public static class64 field3212 = class44.method335((byte) 71, "<br>");

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "Lja;")
    public static class60 field3239 = null;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Lcd;")
    public static class64 field3240 = class44.method335((byte) 71, "");

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lcd;")
    public static class64 field3232 = field3240;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lcd;")
    public static class64 field3221 = field3240;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field3241 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Z")
    public static boolean field3233;

    @OriginalMember(owner = "client!fa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 4)
    public final void windowIconified(WindowEvent arg0) {
        field3231++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 24)
    public final synchronized void method1323(int arg0) {
        if (class307.field5251 != null) {
            class307.field5251.removeFocusListener(this);
            class307.field5251.getParent().remove(class307.field5251);
        }
        field3215++;
        Container var2;
        if (class263.field4514 != null) {
            var2 = class263.field4514;
        } else if (class27.field441 == null) {
            var2 = class228.field3876.field4845;
        } else {
            var2 = class27.field441;
        }
        var2.setLayout((LayoutManager) null);
        class307.field5251 = new class31(this);
        var2.add(class307.field5251);
        class307.field5251.setSize(class13.field290, class58.field960);
        if (arg0 >= -79) {
            field3239 = (class60) null;
        }
        class307.field5251.setVisible(true);
        if (class27.field441 == var2) {
            Insets var3 = class27.field441.getInsets();
            class307.field5251.setLocation(class2.field14 + var3.left, class277.field4774 + var3.top);
        } else {
            class307.field5251.setLocation(class2.field14, class277.field4774);
        }
        class307.field5251.addFocusListener(this);
        class307.field5251.requestFocus();
        class77.field1458 = true;
        class157.field2771 = true;
        class168.field2916 = true;
        class189.field3252 = false;
        class307.field5252 = class154.method1114(true);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 81)
    public static void method1325(int arg0) {
        field3232 = null;
        field3221 = null;
        if (arg0 != 16736443) {
            method1326(3, -1, -65, -92, (class262) null, -31L, (class262) null, (class262) null);
        }
        field3239 = null;
        field3212 = null;
        field3240 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIILa;JLa;La;)V", line = 110)
    public static final void method1326(int arg0, int arg1, int arg2, int arg3, class262 arg4, long arg5, class262 arg6, class262 arg7) {
        class180 var9 = new class180();
        var9.field3087 = arg4;
        var9.field3101 = arg1 * 128 + 64;
        var9.field3085 = arg2 * 128 + 64;
        var9.field3090 = arg3;
        var9.field3080 = arg5;
        var9.field3083 = arg6;
        var9.field3094 = arg7;
        int var10 = 0;
        class295 var11 = class304.field5203[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field5075; var12++) {
                class195 var13 = var11.field5090[var12];
                if ((var13.field3324 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3330.method48();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3088 = -var10;
        if (class304.field5203[arg0][arg1][arg2] == null) {
            class304.field5203[arg0][arg1][arg2] = new class295(arg0, arg1, arg2);
        }
        class304.field5203[arg0][arg1][arg2].field5083 = var9;
    }

    @OriginalMember(owner = "client!fa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 155)
    public final void windowOpened(WindowEvent arg0) {
        field3225++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 164)
    private final void method1327(boolean arg0) {
        long var2 = class154.method1114(arg0);
        field3234++;
        long var4 = class143.field2518[class185.field3173];
        class143.field2518[class185.field3173] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class104.field1928 = ((var6 >> 1) + 32000) / var6;
        }
        class185.field3173 = class185.field3173 + 1 & 0x1F;
        if (class213.field3589++ > 50) {
            class213.field3589 -= 50;
            class168.field2916 = true;
            class307.field5251.setSize(class13.field290, class58.field960);
            class307.field5251.setVisible(true);
            if (class27.field441 != null && class263.field4514 == null) {
                Insets var7 = class27.field441.getInsets();
                class307.field5251.setLocation(var7.left + class2.field14, var7.top - -class277.field4774);
            } else {
                class307.field5251.setLocation(class2.field14, class277.field4774);
            }
        }
        this.method1338(2);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V", line = 207)
    public static final void method1328(int arg0) {
        if (arg0 < 54) {
            field3239 = (class60) null;
        }
        field3246++;
        for (int var1 = 0; var1 < class307.field5248; var1++) {
            int var10002 = class295.field5067[var1]--;
            if (class295.field5067[var1] >= -10) {
                class239 var2 = class132.field2352[var1];
                if (var2 == null) {
                    var2 = class239.method1740(class299.field5161, class195.field3333[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class295.field5067[var1] += var2.method1738();
                    class132.field2352[var1] = var2;
                }
                if (class295.field5067[var1] < 0) {
                    int var3;
                    if (class273.field4697[var1] == 0) {
                        var3 = class58.field959;
                    } else {
                        int var4 = (class273.field4697[var1] & 0xFF) * 128;
                        int var5 = (class273.field4697[var1] & 0xFF60BB) >> 16;
                        int var6 = class273.field4697[var1] >> 8 & 0xFF;
                        int var7 = var5 * 128 + 64 - class139.field2472.field1859;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var6 * 128 + 64 - class139.field2472.field1865;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var4 < var9) {
                            class295.field5067[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var3 = (var4 - var9) * class106.field1960 / var4;
                    }
                    if (var3 > 0) {
                        class286 var10 = var2.method1741().method1981(class131.field2324);
                        class294 var11 = class294.method2022(var10, 100, var3);
                        var11.method2023(class119.field2161[var1] - 1);
                        class250.field4341.method1420(var11);
                    }
                    class295.field5067[var1] = -100;
                }
            } else {
                class307.field5248--;
                for (int var12 = var1; var12 < class307.field5248; var12++) {
                    class195.field3333[var12] = class195.field3333[var12 + 1];
                    class132.field2352[var12] = class132.field2352[var12 + 1];
                    class119.field2161[var12] = class119.field2161[var12 + 1];
                    class295.field5067[var12] = class295.field5067[var12 + 1];
                    class273.field4697[var12] = class273.field4697[var12 + 1];
                }
                var1--;
            }
        }
        if (class43.field696 && !class76.method606(0)) {
            if (class163.field2865 != 0 && class78.field1469 != -1) {
                class137.method981(class78.field1469, class163.field2865, (byte) 44, class297.field5114, false, 0);
            }
            class43.field696 = false;
        } else if (class163.field2865 != 0 && class78.field1469 != -1 && !class76.method606(0)) {
            class17.field353.method1214(-89, 243);
            class17.field353.method128((byte) -57, class78.field1469);
            class78.field1469 = -1;
            class126.field2263++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 339)
    public final void focusGained(FocusEvent arg0) {
        class157.field2771 = true;
        class168.field2916 = true;
        field3242++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 349)
    public final void method1329(String arg0, int arg1) {
        field3210++;
        if (this.field3230) {
            return;
        }
        this.field3230 = true;
        System.out.println("error_game_" + arg0);
        if (arg1 != -100) {
            this.method1334(41);
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!fa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 370)
    public final void windowDeiconified(WindowEvent arg0) {
        field3235++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V", line = 383)
    private final void method1330(boolean arg0, int arg1) {
        field3211++;
        synchronized (this) {
            if (class258.field4461) {
                return;
            }
            class258.field4461 = true;
            int var4 = 71 % ((51 - arg1) / 58);
        }
        if (class228.field3876.field4845 != null) {
            class228.field3876.field4845.destroy();
        }
        try {
            this.method1333((byte) 110);
        } catch (Exception var13) {
        }
        if (class307.field5251 != null) {
            try {
                class307.field5251.removeFocusListener(this);
                class307.field5251.getParent().remove(class307.field5251);
            } catch (Exception var12) {
            }
        }
        if (class228.field3876 != null) {
            try {
                class228.field3876.method1962(true);
            } catch (Exception var11) {
            }
        }
        this.method1331(31);
        if (class27.field441 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!fa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 442)
    public final synchronized void paint(Graphics arg0) {
        field3208++;
        if (class200.field3436 != this || class258.field4461) {
            return;
        }
        class168.field2916 = true;
        if (class287.field4907 && !class123.field2216 && (class154.method1114(true) - class307.field5252) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class34.field549 <= var2.width && var2.height >= class2.field7) {
                class189.field3252 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 462)
    public final void windowDeactivated(WindowEvent arg0) {
        field3223++;
    }

    @OriginalMember(owner = "client!fa", name = "destroy", descriptor = "()V", line = 469)
    public final void destroy() {
        field3216++;
        if (class200.field3436 == this && !class258.field4461) {
            class205.field3505 = class154.method1114(true);
            class267.method1871(10, 5000L);
            class48.field803 = null;
            this.method1330(false, 122);
        }
    }

    @OriginalMember(owner = "client!fa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 487)
    public final void update(Graphics arg0) {
        field3237++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!fa", name = "run", descriptor = "()V", line = 496)
    public final void run() {
        field3226++;
        try {
            if (class282.field4853 != null) {
                String var1 = class282.field4853.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class282.field4860;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1329("wrongjava", -100);
                        return;
                    }
                    class202.field3456 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class282.field4860 == null || class282.field4860.equals("1.4.2"))) {
                    this.method1329("wrongjava", -100);
                    return;
                }
            }
            if (class282.field4860 != null && class282.field4860.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (var4 < class282.field4860.length()) {
                    char var5 = class282.field4860.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class287.field4907 = true;
                }
            }
            if (class228.field3876.field4845 != null) {
                Method var6 = class282.field4861;
                if (var6 != null) {
                    try {
                        var6.invoke(class228.field3876.field4845, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method1323(-127);
            class183.field3130 = class32.method273(class307.field5251, class13.field290, -51, class58.field960);
            this.method1334(3149);
            class125.field2256 = class117.method835((byte) 97);
            while (class205.field3505 == 0L || class154.method1114(true) < class205.field3505) {
                class199.field3389 = class125.field2256.method740(class245.field4262, (byte) 93, class202.field3456);
                for (int var8 = 0; var8 < class199.field3389; var8++) {
                    this.method1335(0);
                }
                this.method1327(true);
                class110.method799(class228.field3876, class307.field5251, 121);
            }
        } catch (Exception var11) {
            class309.method2146((byte) -128, (String) null, var11);
            this.method1329("crash", -100);
        }
        this.method1330(true, 127);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Z", line = 606)
    public final boolean method1332(byte arg0) {
        field3243++;
        int var2 = 66 % ((arg0 - 58) / 53);
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
                this.method1329("invalidhost", -100);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 644)
    public final AppletContext getAppletContext() {
        field3214++;
        if (class27.field441 == null) {
            return class228.field3876 == null || class228.field3876.field4845 == this ? super.getAppletContext() : class228.field3876.field4845.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 663)
    public final void windowClosed(WindowEvent arg0) {
        field3229++;
    }

    @OriginalMember(owner = "client!fa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 670)
    public final URL getDocumentBase() {
        field3247++;
        if (class27.field441 == null) {
            return class228.field3876 == null || class228.field3876.field4845 == this ? super.getDocumentBase() : class228.field3876.field4845.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 688)
    public final String getParameter(String arg0) {
        field3227++;
        if (class27.field441 == null) {
            return class228.field3876 == null || class228.field3876.field4845 == this ? super.getParameter(arg0) : class228.field3876.field4845.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V", line = 709)
    private final void method1335(int arg0) {
        field3218++;
        long var2 = class27.field433[class40.field626];
        long var4 = class154.method1114(true);
        class27.field433[class40.field626] = var4;
        class40.field626 = class40.field626 + 1 & 0x1F;
        if (arg0 != 0) {
            return;
        }
        if (var2 != 0L && var4 > var2) {
        }
        synchronized (this) {
            class77.field1458 = class157.field2771;
        }
        this.method1324(58);
    }

    @OriginalMember(owner = "client!fa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 737)
    public final URL getCodeBase() {
        field3209++;
        if (class27.field441 == null) {
            return class228.field3876 == null || class228.field3876.field4845 == this ? super.getCodeBase() : class228.field3876.field4845.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "start", descriptor = "()V", line = 755)
    public final void start() {
        field3244++;
        if (class200.field3436 == this && !class258.field4461) {
            class205.field3505 = 0L;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 771)
    public final void method1336(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field3236++;
        try {
            class154.field2735 = arg5;
            class277.field4774 = 0;
            class58.field960 = arg1;
            class2.field7 = arg1;
            class13.field290 = arg4;
            class34.field549 = arg4;
            class200.field3436 = this;
            class2.field14 = 0;
            class27.field441 = new Frame();
            class27.field441.setTitle("Jagex");
            class27.field441.setResizable(true);
            class27.field441.addWindowListener(this);
            class27.field441.setVisible(true);
            class27.field441.toFront();
            if (arg0 != 23213) {
                return;
            }
            Insets var8 = class27.field441.getInsets();
            class27.field441.setSize(class34.field549 + var8.left + var8.right, class2.field7 + var8.bottom - -var8.top);
            class48.field803 = class228.field3876 = new class282((Applet) null, arg3, arg2, arg6);
            class22 var9 = class228.field3876.method1958(1, this, 16711);
            while (var9.field375 == 0) {
                class267.method1871(10, 10L);
            }
            class66.field1313 = (Thread) var9.field377;
        } catch (Exception var11) {
            class309.method2146((byte) -91, (String) null, var11);
        }
    }

    @OriginalMember(owner = "client!fa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 811)
    public final void windowClosing(WindowEvent arg0) {
        field3245++;
        this.destroy();
    }

    @OriginalMember(owner = "client!fa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 822)
    public final void focusLost(FocusEvent arg0) {
        class157.field2771 = false;
        field3238++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V", line = 839)
    public final void method1337(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3219++;
        try {
            if (class200.field3436 != null) {
                class287.field4906++;
                if (class287.field4906 >= 3) {
                    this.method1329("alreadyloaded", arg0 ^ 0xFFFFFFDC);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class200.field3436 = this;
            class154.field2735 = arg1;
            if (arg0 != 64) {
                this.windowClosed((WindowEvent) null);
            }
            class58.field960 = arg3;
            class2.field7 = arg3;
            class2.field14 = 0;
            class13.field290 = arg2;
            class34.field549 = arg2;
            class277.field4774 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class274.field4713 = true;
            } else {
                class274.field4713 = false;
            }
            if (class228.field3876 == null) {
                class48.field803 = class228.field3876 = new class282(this, arg4, (String) null, 0);
            }
            class22 var7 = class228.field3876.method1958(1, this, 16711);
            while (var7.field375 == 0) {
                class267.method1871(10, 10L);
            }
            class66.field1313 = (Thread) var7.field377;
        } catch (Exception var9) {
            class309.method2146((byte) -78, (String) null, var9);
            this.method1329("crash", -100);
        }
    }

    @OriginalMember(owner = "client!fa", name = "stop", descriptor = "()V", line = 898)
    public final void stop() {
        field3224++;
        if (class200.field3436 == this && !class258.field4461) {
            class205.field3505 = class154.method1114(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!fa", name = "providesignlink", descriptor = "(Lte;)V", line = 923)
    public static final void providesignlink(class282 arg0) {
        class228.field3876 = arg0;
        class48.field803 = arg0;
        field3220++;
    }

    @OriginalMember(owner = "client!fa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 932)
    public final void windowActivated(WindowEvent arg0) {
        field3228++;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public abstract void method1324(int arg0);

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
    public abstract void method1331(int arg0);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public abstract void method1333(byte arg0);

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
    public abstract void method1334(int arg0);

    @OriginalMember(owner = "client!fa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)V")
    public abstract void method1338(int arg0);
}
