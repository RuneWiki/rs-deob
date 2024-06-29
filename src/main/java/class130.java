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
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class130 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Z")
    private boolean field2496 = false;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2460 = 7759444;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lob;")
    public static class141 field2471 = class175.method1195(40, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field2470 = 100;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "Lob;")
    public static class141 field2490 = class175.method1195(40, " <col=ffff00>");

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Z")
    public static boolean field2498;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method820(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field2480++;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg6 - arg1;
        int var12 = arg0 - arg1;
        int var13 = arg0 * arg0;
        int var14 = var12 * var12;
        int var15 = arg6 * arg6;
        int var16 = var11 * var11;
        int var17 = var15 << 1;
        int var18 = var13 << 1;
        int var19 = var14 << 1;
        int var20 = var16 << 1;
        int var21 = arg6 << 1;
        int var22 = (1 - var21) * var13 + var17;
        int var23 = var11 << 1;
        int var24 = var15 - (var21 - 1) * var18;
        int var25 = var16 - (var23 - 1) * var19;
        int var26 = var13 << 2;
        int var27 = var15 << 2;
        int var28 = (1 - var23) * var14 + var20;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        if (arg4) {
            return;
        }
        int var33 = (var23 - 3) * var19;
        int var34 = var20 * 3;
        int var35 = var27;
        int var36 = var30;
        int var37 = (var11 - 1) * var29;
        int var38 = (arg6 - 1) * var26;
        int[] var39 = class41.field805[arg2];
        class180.method1217(arg5 - var12, (byte) 52, arg5 - arg0, arg3, var39);
        class180.method1217(arg5 + var12, (byte) 52, arg5 - var12, arg7, var39);
        class180.method1217(arg0 + arg5, (byte) 52, arg5 + var12, arg3, var39);
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var10++;
                    var22 += var31;
                    var31 += var27;
                    var24 += var35;
                    var35 += var27;
                }
            }
            if (var24 < 0) {
                var10++;
                var22 += var31;
                var24 += var35;
                var35 += var27;
                var31 += var27;
            }
            var24 += -var32;
            var22 += -var38;
            var38 -= var26;
            var32 -= var26;
            int var40 = arg5 + var10;
            int var41 = arg5 - var10;
            boolean var42 = var11 >= var9;
            if (var42) {
                if (var28 < 0) {
                    while (var28 < 0) {
                        var25 += var36;
                        var8++;
                        var36 += var30;
                        var28 += var34;
                        var34 += var30;
                    }
                }
                if (var25 < 0) {
                    var8++;
                    var28 += var34;
                    var34 += var30;
                    var25 += var36;
                    var36 += var30;
                }
                var28 += -var37;
                var25 += -var33;
                var33 -= var29;
                var37 -= var29;
            }
            var9--;
            int var43 = arg2 + var9;
            int var44 = arg2 - var9;
            if (var42) {
                int var45 = arg5 - var8;
                class180.method1217(var45, (byte) 52, var41, arg3, class41.field805[var44]);
                int var46 = arg5 + var8;
                class180.method1217(var46, (byte) 52, var45, arg7, class41.field805[var44]);
                class180.method1217(var40, (byte) 52, var46, arg3, class41.field805[var44]);
                class180.method1217(var45, (byte) 52, var41, arg3, class41.field805[var43]);
                class180.method1217(var46, (byte) 52, var45, arg7, class41.field805[var43]);
                class180.method1217(var40, (byte) 52, var46, arg3, class41.field805[var43]);
            } else {
                class180.method1217(var40, (byte) 52, var41, arg3, class41.field805[var44]);
                class180.method1217(var40, (byte) 52, var41, arg3, class41.field805[var43]);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public abstract void method210(int arg0);

    @OriginalMember(owner = "client!na", name = "start", descriptor = "()V")
    public final void start() {
        field2491++;
        if (class67.field1304 == this && !class24.field453) {
            class27.field516 = 0L;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    private final void method821(int arg0) {
        field2489++;
        long var2 = class163.field3156[class133.field2530];
        if (arg0 != -6549) {
            return;
        }
        long var4 = class1.method2((byte) -56);
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class163.field3156[class133.field2530] = var4;
        class133.field2530 = class133.field2530 + 1 & 0x1F;
        synchronized (this) {
            class111.field2148 = class202.field3824;
        }
        this.method210(70);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public final synchronized void method822(boolean arg0) {
        Container var2;
        if (class209.field3985 == null) {
            var2 = class69.field1356.field3661;
        } else {
            var2 = class209.field3985;
        }
        if (class176.field3488 != null) {
            class176.field3488.removeFocusListener(this);
            var2.remove(class176.field3488);
        }
        class176.field3488 = new class152(this);
        var2.add(class176.field3488);
        field2459++;
        class176.field3488.setSize(class109.field2107, class18.field318);
        class176.field3488.setVisible(true);
        if (class209.field3985 == null) {
            class176.field3488.setLocation(0, 0);
        } else {
            Insets var3 = class209.field3985.getInsets();
            class176.field3488.setLocation(var3.left, var3.top);
        }
        class176.field3488.addFocusListener(this);
        class176.field3488.requestFocus();
        class104.field2013 = true;
        class18.field324 = arg0;
        class141.field2729 = class1.method2((byte) -105);
    }

    @OriginalMember(owner = "client!na", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2482++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public abstract void method219(byte arg0);

    @OriginalMember(owner = "client!na", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2469++;
        if (class209.field3985 == null) {
            return class69.field1356 == null || class69.field1356.field3661 == this ? super.getCodeBase() : class69.field1356.field3661.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "stop", descriptor = "()V")
    public final void stop() {
        field2462++;
        if (class67.field1304 == this && !class24.field453) {
            class27.field516 = class1.method2((byte) -102) + 4000L;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public abstract void method213(boolean arg0);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method823(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2488++;
        try {
            class67.field1304 = this;
            class18.field318 = arg2;
            class109.field2107 = arg4;
            class82.field1640 = arg5;
            class209.field3985 = new Frame();
            class209.field3985.setTitle("Jagex");
            class209.field3985.setResizable(false);
            class209.field3985.addWindowListener(this);
            class209.field3985.setVisible(true);
            class209.field3985.toFront();
            Insets var8 = class209.field3985.getInsets();
            class209.field3985.setSize(var8.right + arg4 + var8.left, var8.bottom + arg2 + var8.top);
            class115.field2200 = class69.field1356 = new class189(true, null, arg0, arg1, arg6);
            class69.field1356.method1256(3360, arg3, this);
        } catch (Exception var10) {
            class170.method1162(null, var10, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!na", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2466++;
        class202.field3824 = true;
        class104.field2013 = true;
    }

    @OriginalMember(owner = "client!na", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2468++;
    }

    @OriginalMember(owner = "client!na", name = "providesignlink", descriptor = "(Lt;)V")
    public static final void providesignlink(class189 arg0) {
        field2473++;
        class69.field1356 = arg0;
        class115.field2200 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2461++;
    }

    @OriginalMember(owner = "client!na", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2477++;
        if (class209.field3985 == null) {
            return class69.field1356 == null || class69.field1356.field3661 == this ? super.getAppletContext() : class69.field1356.field3661.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2467++;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public abstract void method223(int arg0);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public static void method824(int arg0) {
        field2490 = null;
        field2471 = null;
        if (arg0 != 1000) {
            field2471 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BJ)V")
    public static final void method825(byte arg0, long arg1) {
        field2494++;
        if (arg1 == 0L) {
            return;
        }
        if (class88.field1750 >= 100 && class129.field2455 != 1 || class88.field1750 >= 200) {
            class131.method836(0, (byte) -117, class111.field2128, class76.field1532);
            return;
        }
        class141 var3 = class206.method1361(arg1, arg0 + 74).method898(22);
        for (int var4 = 0; var4 < class88.field1750; var4++) {
            if (class131.field2499[var4] == arg1) {
                class131.method836(0, (byte) -110, class111.field2128, class220.method1422(new class141[] { var3, class61.field1203 }, arg0 ^ 0x4B));
                return;
            }
        }
        for (int var5 = 0; var5 < class96.field1912; var5++) {
            if (class154.field2999[var5] == arg1) {
                class131.method836(0, (byte) -102, class111.field2128, class220.method1422(new class141[] { class191.field3684, var3, class158.field3047 }, -3));
                return;
            }
        }
        if (var3.method922((byte) 31, class114.field2176.field773)) {
            class131.method836(0, (byte) -116, class111.field2128, class220.field4152);
            return;
        }
        class188.field3640[class88.field1750] = var3;
        class70.field1413++;
        class131.field2499[class88.field1750] = arg1;
        class103.field1993[class88.field1750] = 0;
        class25.field478[class88.field1750] = class111.field2128;
        if (arg0 != -74) {
            field2471 = null;
        }
        class203.field3897[class88.field1750] = 0;
        class1.field11 = class174.field3461;
        class88.field1750++;
        class7.field120.method32(231, arg0 + 12959);
        class7.field120.method978(-105, arg1);
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
    public final void run() {
        field2495++;
        try {
            if (class189.field3666 != null) {
                String var1 = class189.field3666.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class189.field3659;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method829(43, "wrongjava");
                        return;
                    }
                    class35.field706 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class189.field3659 == null || class189.field3659.equals("1.4.2"))) {
                    this.method829(-119, "wrongjava");
                    return;
                }
            }
            if (class69.field1356.field3661 != null) {
                Method var3 = class189.field3664;
                if (var3 != null) {
                    try {
                        var3.invoke(class69.field1356.field3661, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method822(false);
            class219.field4149 = class161.method1127(class18.field318, class109.field2107, 100, class176.field3488);
            this.method223(0);
            class160.field3101 = class132.method837(107);
            while (class27.field516 == 0L || class27.field516 > class1.method2((byte) -57)) {
                class136.field2587 = class160.field3101.method413(-100, class35.field706, class111.field2127);
                for (int var4 = 0; var4 < class136.field2587; var4++) {
                    this.method821(-6549);
                }
                this.method831((byte) 21);
                class103.method691(class69.field1356, class176.field3488, (byte) 2);
            }
        } catch (Exception var7) {
            class170.method1162(null, var7, (byte) -128);
            this.method829(59, "crash");
        }
        this.method826(-118, true);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public abstract void method216(byte arg0);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
    private final void method826(int arg0, boolean arg1) {
        field2464++;
        int var3 = -39 % ((8 - arg0) / 47);
        synchronized (this) {
            if (class24.field453) {
                return;
            }
            class24.field453 = true;
        }
        if (class69.field1356.field3661 != null) {
            class69.field1356.field3661.destroy();
        }
        if (class176.field3488 != null) {
            try {
                class176.field3488.removeFocusListener(this);
                Container var5;
                if (class209.field3985 == null) {
                    var5 = class69.field1356.field3661;
                } else {
                    var5 = class209.field3985;
                }
                var5.remove(class176.field3488);
            } catch (Exception var11) {
            }
        }
        try {
            this.method219((byte) -94);
        } catch (Exception var10) {
        }
        if (class69.field1356 != null) {
            try {
                class69.field1356.method1253(true);
            } catch (Exception var9) {
            }
        }
        this.method216((byte) -68);
        if (class209.field3985 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!na", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2463++;
        if (class67.field1304 != this || class24.field453) {
            return;
        }
        class104.field2013 = true;
        if (class189.field3659 != null && class189.field3659.startsWith("1.5") && class1.method2((byte) -89) - class141.field2729 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class109.field2107 <= var2.width && var2.height >= class18.field318) {
                class18.field324 = true;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2483++;
    }

    @OriginalMember(owner = "client!na", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2493++;
        if (class67.field1304 == this && !class24.field453) {
            class27.field516 = class1.method2((byte) -109);
            class93.method638(5000L, (byte) -8);
            class115.field2200 = null;
            this.method826(103, false);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    public static final void method827(byte arg0) {
        for (class174 var1 = (class174) class173.field3437.method799((byte) 117); var1 != null; var1 = (class174) class173.field3437.method796((byte) -33)) {
            int var3 = var1.field3454;
            if (class66.method443(true, var3)) {
                boolean var4 = true;
                class170[] var5 = class224.field4232[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field3305;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var1.field4067;
                    class170 var8 = class192.method1268(var7, -83);
                    if (var8 != null) {
                        class38.method252(var8, -81);
                    }
                }
            }
        }
        int var2 = -19 % ((arg0 - 49) / 43);
        field2487++;
    }

    @OriginalMember(owner = "client!na", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2465++;
        if (class209.field3985 == null) {
            return class69.field1356 == null || class69.field1356.field3661 == this ? super.getDocumentBase() : class69.field1356.field3661.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILob;)Z")
    public static final boolean method828(int arg0, class141 arg1) {
        field2475++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 31) {
            field2470 = -90;
        }
        for (int var2 = 0; var2 < class96.field1912; var2++) {
            if (arg1.method933((byte) -79, class166.field3217[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method829(int arg0, String arg1) {
        field2474++;
        if (this.field2496) {
            return;
        }
        this.field2496 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
            int var3 = 54 % ((arg0 + 27) / 52);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!na", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2481++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lkb;IIIIII)V")
    public static final void method830(class101 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field1969.length;
        for (int var8 = 0; var8 < var7; var8++) {
            int var21 = arg0.field1969[var8] - class18.field316;
            int var22 = arg0.field1974[var8] - class162.field3145;
            int var23 = arg0.field1961[var8] - class35.field710;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field1979 != null) {
                class101.field1977[var8] = var24;
                class101.field1963[var8] = var27;
                class101.field1978[var8] = var28;
            }
            class101.field1965[var8] = (var24 << 9) / var28 + class44.field847;
            class101.field1976[var8] = (var27 << 9) / var28 + class44.field844;
        }
        class44.field845 = 0;
        int var9 = arg0.field1960.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var11 = arg0.field1960[var10];
            int var12 = arg0.field1973[var10];
            int var13 = arg0.field1967[var10];
            int var14 = class101.field1965[var11];
            int var15 = class101.field1965[var12];
            int var16 = class101.field1965[var13];
            int var17 = class101.field1976[var11];
            int var18 = class101.field1976[var12];
            int var19 = class101.field1976[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class27.field515 && class179.method1215(class32.field671, client.field605, var17, var18, var19, var14, var15, var16)) {
                    class202.field3823 = arg5;
                    class27.field508 = arg6;
                }
                class44.field842 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class44.field849 || var15 > class44.field849 || var16 > class44.field849) {
                    class44.field842 = true;
                }
                if (arg0.field1979 == null || arg0.field1979[var10] == -1) {
                    if (arg0.field1972[var10] != 12345678) {
                        class44.method292(var17, var18, var19, var14, var15, var16, arg0.field1972[var10], arg0.field1975[var10], arg0.field1959[var10]);
                    }
                } else if (class29.field565) {
                    int var20 = class44.field857.method959(arg0.field1979[var10], -30480);
                    class44.method292(var17, var18, var19, var14, var15, var16, class26.method182(var20, arg0.field1972[var10]), class26.method182(var20, arg0.field1975[var10]), class26.method182(var20, arg0.field1959[var10]));
                } else if (arg0.field1980) {
                    class44.method287(var17, var18, var19, var14, var15, var16, arg0.field1972[var10], arg0.field1975[var10], arg0.field1959[var10], class101.field1977[0], class101.field1977[1], class101.field1977[3], class101.field1963[0], class101.field1963[1], class101.field1963[3], class101.field1978[0], class101.field1978[1], class101.field1978[3], arg0.field1979[var10]);
                } else {
                    class44.method287(var17, var18, var19, var14, var15, var16, arg0.field1972[var10], arg0.field1975[var10], arg0.field1959[var10], class101.field1977[var11], class101.field1977[var12], class101.field1977[var13], class101.field1963[var11], class101.field1963[var12], class101.field1963[var13], class101.field1978[var11], class101.field1978[var12], class101.field1978[var13], arg0.field1979[var10]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
    private final void method831(byte arg0) {
        field2476++;
        long var2 = class1.method2((byte) -102);
        long var4 = class212.field4056[class59.field1144];
        class212.field4056[class59.field1144] = var2;
        class59.field1144 = class59.field1144 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class40.field802 = ((var6 >> 1) + 32000) / var6;
        }
        if (class9.field162++ > 50) {
            class9.field162 -= 50;
            class104.field2013 = true;
            class176.field3488.setSize(class109.field2107, class18.field318);
            class176.field3488.setVisible(true);
            if (class209.field3985 == null) {
                class176.field3488.setLocation(0, 0);
            } else {
                Insets var7 = class209.field3985.getInsets();
                class176.field3488.setLocation(var7.left, var7.top);
            }
        }
        if (arg0 != 21) {
            field2490 = null;
        }
        this.method213(true);
    }

    @OriginalMember(owner = "client!na", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2458++;
    }

    @OriginalMember(owner = "client!na", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2478++;
        if (class209.field3985 == null) {
            return class69.field1356 == null || class69.field1356.field3661 == this ? super.getParameter(arg0) : class69.field1356.field3661.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
    public final void method832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 26340) {
            this.method219((byte) 88);
        }
        field2484++;
        try {
            if (class67.field1304 == null) {
                class82.field1640 = arg1;
                class67.field1304 = this;
                class109.field2107 = arg0;
                class18.field318 = arg4;
                if (class69.field1356 == null) {
                    class115.field2200 = class69.field1356 = new class189(false, this, arg3, null, 0);
                }
                class69.field1356.method1256(3360, 1, this);
            } else {
                class191.field3692++;
                if (class191.field3692 >= 3) {
                    this.method829(arg2 ^ 0x669B, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class170.method1162(null, var7, (byte) -59);
            this.method829(arg2 - 26461, "crash");
        }
    }

    @OriginalMember(owner = "client!na", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2485++;
    }

    @OriginalMember(owner = "client!na", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class202.field3824 = false;
        field2472++;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)Z")
    public final boolean method833(int arg0) {
        field2479++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 != 0) {
            this.run();
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
                this.method829(-84, "invalidhost");
                return false;
            }
        }
    }
}
