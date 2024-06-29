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

@OriginalClass("client!ls")
public abstract class class95 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "Z")
    private boolean field1354 = false;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "Z")
    private boolean field1355 = false;

    @OriginalMember(owner = "client!ls", name = "J", descriptor = "Lmn;")
    public static class249 field1365 = new class249();

    @OriginalMember(owner = "client!ls", name = "M", descriptor = "Z")
    public static boolean field1368 = false;

    @OriginalMember(owner = "client!ls", name = "O", descriptor = "F")
    public static float field1370;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ls", name = "K", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ls", name = "L", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ls", name = "P", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ls", name = "Q", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ls", name = "N", descriptor = "Lul;")
    public static class406 field1369;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "La;")
    public static class439 field1358;

    @OriginalMember(owner = "client!ls", name = "R", descriptor = "Z")
    public static boolean field1373;

    @OriginalMember(owner = "client!ls", name = "S", descriptor = "Z")
    public static boolean field1374;

    @OriginalMember(owner = "client!ls", name = "T", descriptor = "Z")
    public static boolean field1375;

    @OriginalMember(owner = "client!ls", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1367++;
        if (class88.field1269 == this && !class403.field5981) {
            class68.field880 = class493.method2937(-122);
            class434.method2690(10, 5000L);
            class116.field1766 = null;
            this.method769((byte) -70, false);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
    public abstract void method758(boolean arg0);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method759(byte arg0) {
        field1358 = null;
        field1369 = null;
        field1365 = null;
        if (arg0 != -120) {
            field1368 = false;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIIILjava/lang/String;Z)V")
    public final void method760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, boolean arg7) {
        try {
            class76.field1105 = arg4;
            class173.field2593 = arg4;
            class88.field1269 = this;
            class13.field195 = 0;
            class227.field3698 = arg5;
            class80.field1163 = arg2;
            class468.field6769 = arg2;
            class415.field6197 = 0;
            class281.field4281 = new Frame();
            class281.field4281.setTitle("Jagex");
            class281.field4281.setResizable(true);
            class281.field4281.addWindowListener(this);
            class281.field4281.setVisible(true);
            class281.field4281.toFront();
            Insets var9 = class281.field4281.getInsets();
            class281.field4281.setSize(class468.field6769 + var9.left + var9.right, class173.field2593 + var9.top + var9.bottom);
            class116.field1766 = class360.field5349 = new class352(null, arg0, arg6, arg3);
            class449 var10 = class360.field5349.method2195(1, 0, this);
            while (var10.field6570 == 0) {
                class434.method2690(10, 10L);
            }
        } catch (Exception var12) {
            class88.method727(var12, 75, null);
        }
        if (arg1 < 103) {
            this.method769((byte) -97, true);
        }
        field1337++;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method761(byte arg0, String arg1) {
        field1344++;
        if (!class245.field3859 || arg0 > -7) {
            return;
        }
        boolean var2 = false;
        int var3 = class111.field1558;
        int[] var4 = class318.field4804;
        for (int var5 = 0; var5 < var3; var5++) {
            class177 var6 = class26.field319[var4[var5]];
            if (var6 != null && class398.field5947 != var6 && var6.field2660 != null && var6.field2660.equalsIgnoreCase(arg1)) {
                class74.method640(-29627, class120.field1807);
                class12.field170++;
                class71.field1020.method1545(0, -53);
                class71.field1020.method1508(-128, var4[var5]);
                class71.field1020.method1539((byte) -113, class358.field5318);
                class71.field1020.method1508(-128, class71.field1028);
                class71.field1020.method1537((byte) 104, class371.field5524);
                class195.method1362(var6.field1976[0], true, var6.method953(-72), -2, var6.method953(-88), 0, var6.field1978[0], -1, 0);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class358.method2249(0, class12.field154.method1635(class224.field3673, (byte) 43) + arg1);
        }
        if (class245.field3859) {
            class329.method2090(-1);
        }
    }

    @OriginalMember(owner = "client!ls", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ls", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1339++;
    }

    @OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
    public final void run() {
        field1356++;
        try {
            label116: {
                if (class352.field5190 != null) {
                    String var1 = class352.field5190.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class352.field5188;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method773("wrongjava", (byte) 54);
                            break label116;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class352.field5188 == null || class352.field5188.equals("1.4.2"))) {
                        this.method773("wrongjava", (byte) 101);
                        break label116;
                    }
                }
                if (class352.field5188 != null && class352.field5188.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class352.field5188.length()) {
                        char var5 = class352.field5188.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class334.field4990 = true;
                    }
                }
                if (class360.field5349.field5199 != null) {
                    Method var6 = class352.field5207;
                    if (var6 != null) {
                        try {
                            var6.invoke(class360.field5349.field5199, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class505.method3013((byte) 125);
                class338.method2131((byte) 35);
                this.method775(-117);
                this.method774((byte) -102);
                this.method766(50000);
                class364.field5379 = class299.method1935((byte) 34);
                this.method774((byte) -102);
                while (class68.field880 == 0L || class68.field880 > class493.method2937(-124)) {
                    class375.field5615 = class364.field5379.method1496(2007665840, class121.field1826);
                    for (int var7 = 0; var7 < class375.field5615; var7++) {
                        this.method763(-227903135);
                    }
                    this.method762((byte) -107);
                    class519.method3091(class360.field5349, class111.field1557, (byte) -62);
                }
            }
        } catch (Throwable var10) {
            class88.method727(var10, 104, this.method776(false));
            this.method773("crash", (byte) 124);
        }
        this.method769((byte) -26, true);
    }

    @OriginalMember(owner = "client!ls", name = "providesignlink", descriptor = "(Lod;)V")
    public static final void providesignlink(class352 arg0) {
        class360.field5349 = arg0;
        class116.field1766 = arg0;
        field1364++;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
    private final void method762(byte arg0) {
        field1363++;
        long var2 = class493.method2937(arg0 + 16);
        long var4 = class237.field3812[class55.field682];
        if (arg0 != -107) {
            return;
        }
        class237.field3812[class55.field682] = var2;
        class55.field682 = class55.field682 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class309.field4659 = ((var6 >> 1) + 32000) / var6;
        }
        if (class152.field2262++ > 50) {
            class500.field7178 = true;
            class152.field2262 -= 50;
            class111.field1557.setSize(class80.field1163, class76.field1105);
            class111.field1557.setVisible(true);
            if (class281.field4281 != null && class168.field2489 == null) {
                Insets var7 = class281.field4281.getInsets();
                class111.field1557.setLocation(class13.field195 + var7.left, class415.field6197 + var7.top);
            } else {
                class111.field1557.setLocation(class13.field195, class415.field6197);
            }
        }
        this.method768((byte) -117);
    }

    @OriginalMember(owner = "client!ls", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1349++;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    private final void method763(int arg0) {
        field1351++;
        long var2 = class493.method2937(-66);
        long var4 = class191.field3223[class484.field6967];
        class191.field3223[class484.field6967] = var2;
        class484.field6967 = class484.field6967 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 != -227903135) {
            this.method766(-95);
        }
        synchronized (this) {
            class190.field3215 = class111.field1553;
        }
        this.method770(arg0 + 227903053);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Z")
    public static final boolean method764(int arg0, int arg1) {
        field1361++;
        int var2 = -77 / ((-arg0 - 55) / 59);
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III[B)I")
    public static final int method765(int arg0, int arg1, int arg2, byte[] arg3) {
        field1330++;
        int var4 = -1;
        if (arg2 != 255) {
            providesignlink(null);
        }
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class488.field7015[(var4 ^ arg3[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
    public abstract void method766(int arg0);

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)Z")
    public final boolean method767(byte arg0) {
        int var2 = -47 % ((arg0 - 15) / 45);
        field1343++;
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        if (var3.equals("jagex.com") || var3.endsWith(".jagex.com")) {
            return true;
        } else if (var3.equals("runescape.com") || var3.endsWith(".runescape.com")) {
            return true;
        } else if (var3.equals("stellardawn.com") || var3.endsWith(".stellardawn.com")) {
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
                this.method773("invalidhost", (byte) 92);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(B)V")
    public abstract void method768(byte arg0);

    @OriginalMember(owner = "client!ls", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1366++;
        if (class281.field4281 == null) {
            return class360.field5349 == null || class360.field5349.field5199 == this ? super.getCodeBase() : class360.field5349.field5199.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BZ)V")
    private final void method769(byte arg0, boolean arg1) {
        if (arg0 > -6) {
            this.method774((byte) -120);
        }
        field1359++;
        synchronized (this) {
            if (class403.field5981) {
                return;
            }
            class403.field5981 = true;
        }
        if (class360.field5349.field5199 != null) {
            class360.field5349.field5199.destroy();
        }
        try {
            this.method771(false);
        } catch (Exception var11) {
        }
        if (this.field1355) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field1355 = false;
        }
        class449 var4 = class360.field5349.method2188((byte) 41, class88.field1269.getClass());
        while (var4.field6570 == 0) {
            class434.method2690(10, 100L);
        }
        if (class111.field1557 != null) {
            try {
                class111.field1557.removeFocusListener(this);
                class111.field1557.getParent().remove(class111.field1557);
            } catch (Exception var9) {
            }
        }
        if (class360.field5349 != null) {
            try {
                class360.field5349.method2206((byte) -125);
            } catch (Exception var8) {
            }
        }
        this.method758(false);
        if (class281.field4281 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ls", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1352++;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
    public abstract void method770(int arg0);

    @OriginalMember(owner = "client!ls", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1346++;
    }

    @OriginalMember(owner = "client!ls", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1342++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ls", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1360++;
        if (class281.field4281 == null) {
            return class360.field5349 == null || class360.field5349.field5199 == this ? super.getAppletContext() : class360.field5349.field5199.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "stop", descriptor = "()V")
    public final void stop() {
        field1348++;
        if (class88.field1269 == this && !class403.field5981) {
            class68.field880 = class493.method2937(-86) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Z)V")
    public abstract void method771(boolean arg0);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI)B")
    public static final byte method772(int arg0, byte arg1, int arg2) {
        field1333++;
        if (arg0 == 9) {
            int var3 = 91 / ((arg1 - 64) / 55);
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ls", name = "start", descriptor = "()V")
    public final void start() {
        field1357++;
        if (class88.field1269 == this && !class403.field5981) {
            class68.field880 = 0L;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method773(String arg0, byte arg1) {
        field1332++;
        if (this.field1354) {
            return;
        }
        this.field1354 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 <= 48) {
                return;
            }
            class513.method3040("loggedout", class360.field5349.field5199, 1360);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "(B)V")
    public final void method774(byte arg0) {
        field1350++;
        if (arg0 != -102) {
            field1365 = null;
        }
        if (this.field1355) {
            return;
        }
        try {
            class449 var2 = class360.field5349.method2203(class88.field1269.getClass(), 0);
            while (var2.field6570 == 0) {
                class434.method2690(10, 100L);
            }
            if (var2.field6569 != null) {
                throw (Throwable) var2.field6569;
            }
            jagmisc.init();
            this.field1355 = true;
            class364.field5379 = class299.method1935((byte) 34);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)V")
    public final synchronized void method775(int arg0) {
        if (class111.field1557 != null) {
            class111.field1557.removeFocusListener(this);
            class111.field1557.getParent().remove(class111.field1557);
        }
        field1340++;
        Container var2;
        if (class168.field2489 != null) {
            var2 = class168.field2489;
        } else if (class281.field4281 == null) {
            var2 = class360.field5349.field5199;
        } else {
            var2 = class281.field4281;
        }
        var2.setLayout(null);
        class111.field1557 = new class179(this);
        var2.add(class111.field1557);
        class111.field1557.setSize(class80.field1163, class76.field1105);
        class111.field1557.setVisible(true);
        if (class281.field4281 == var2) {
            Insets var3 = class281.field4281.getInsets();
            class111.field1557.setLocation(class13.field195 + var3.left, class415.field6197 + var3.top);
        } else {
            class111.field1557.setLocation(class13.field195, class415.field6197);
        }
        class111.field1557.addFocusListener(this);
        class111.field1557.requestFocus();
        class190.field3215 = true;
        class111.field1553 = true;
        int var4 = 23 / ((arg0 + 67) / 43);
        class500.field7178 = true;
        class24.field296 = false;
        class12.field175 = class493.method2937(-70);
    }

    @OriginalMember(owner = "client!ls", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1334++;
        class111.field1553 = false;
    }

    @OriginalMember(owner = "client!ls", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1341++;
    }

    @OriginalMember(owner = "client!ls", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1331++;
        if (class281.field4281 == null) {
            return class360.field5349 == null || class360.field5349.field5199 == this ? super.getParameter(arg0) : class360.field5349.field5199.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class111.field1553 = true;
        field1362++;
        class500.field7178 = true;
    }

    @OriginalMember(owner = "client!ls", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1345++;
        if (class281.field4281 == null) {
            return class360.field5349 == null || class360.field5349.field5199 == this ? super.getDocumentBase() : class360.field5349.field5199.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public String method776(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field1338++;
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1347++;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
    public final void method777(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1353++;
        try {
            if (class88.field1269 == null) {
                class227.field3698 = arg3;
                class13.field195 = 0;
                class76.field1105 = arg1;
                class173.field2593 = arg1;
                class80.field1163 = arg4;
                class468.field6769 = arg4;
                class415.field6197 = 0;
                class88.field1269 = this;
                if (arg0 == -11443) {
                    if (class360.field5349 == null) {
                        class116.field1766 = class360.field5349 = new class352(this, arg2, null, 0);
                    }
                    class449 var6 = class360.field5349.method2195(1, 0, this);
                    while (var6.field6570 == 0) {
                        class434.method2690(arg0 + 11453, 10L);
                    }
                }
            } else {
                class411.field6125++;
                if (class411.field6125 >= 3) {
                    this.method773("alreadyloaded", (byte) 72);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class88.method727(var8, -25, null);
            this.method773("crash", (byte) 77);
        }
    }

    @OriginalMember(owner = "client!ls", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1336++;
        if (class88.field1269 != this || class403.field5981) {
            return;
        }
        class500.field7178 = true;
        if (class334.field4990 && (class493.method2937(-124) - class12.field175) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class468.field6769 && var2.height >= class173.field2593) {
                class24.field296 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1335++;
    }
}
