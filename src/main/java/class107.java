import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class107 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "Z")
    private boolean field2596 = false;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lic;")
    public static class59 field2569 = class59.method433(0, "<col=00ff00>");

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2557 = 0;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "Lic;")
    public static class59 field2585 = class59.method433(0, "Clientscript error in: ");

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "Lic;")
    private static class59 field2581 = class59.method433(0, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "Lic;")
    public static class59 field2590 = class59.method433(0, "event_opbase");

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Lic;")
    private static class59 field2579 = class59.method433(0, "Loaded sprites");

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lic;")
    public static class59 field2554 = field2581;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "Lic;")
    public static class59 field2594 = class59.method433(0, "b12_full");

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "Lic;")
    public static class59 field2588 = field2579;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "Ldb;")
    public static class24 field2582;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Z")
    public static boolean field2598;

    @OriginalMember(owner = "client!pc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2583++;
        class63.field1617 = false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method832(int arg0) {
        field2593++;
        int var1 = (class159.field3650.field1730 >> 7) + class89.field2229;
        if (arg0 <= 102) {
            return;
        }
        class10.field217 = 0;
        int var2 = (class159.field3650.field1751 >> 7) + class68.field1756;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class10.field217 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class10.field217 = 1;
        }
        if (class10.field217 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class10.field217 = 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "start", descriptor = "()V")
    public final void start() {
        field2568++;
        if (class26.field654 == this && !class41.field1064) {
            class26.field657 = 0L;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lf;B)V")
    public static final void method833(class36 arg0, byte arg1) {
        field2561++;
        class151.field3284 = arg0;
        int var2 = 49 % ((72 - arg1) / 40);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method834(byte arg0) {
        field2579 = null;
        field2588 = null;
        field2554 = null;
        field2590 = null;
        field2582 = null;
        field2581 = null;
        field2594 = null;
        field2585 = null;
        field2569 = null;
        if (arg0 != -89) {
            method833(null, (byte) -2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method835(byte arg0, String arg1) {
        int var3 = -50 / ((-arg0 - 56) / 35);
        field2592++;
        if (this.field2596) {
            return;
        }
        this.field2596 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method836(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg4 < 54) {
                field2579 = null;
            }
            class134.field2975 = arg2;
            class34.field917 = arg3;
            class10.field216 = arg6;
            class26.field654 = this;
            class126.field2867 = new Frame();
            class126.field2867.setTitle("Jagex");
            class126.field2867.setResizable(false);
            class126.field2867.addWindowListener(this);
            class126.field2867.setVisible(true);
            class126.field2867.toFront();
            Insets var8 = class126.field2867.getInsets();
            class126.field2867.setSize(arg6 + var8.left + var8.right, var8.top + arg3 + var8.bottom);
            class149.field3266 = class102.field2497 = new class67(true, null, arg1, arg0, arg5);
            class102.field2497.method543(this, 1, 0);
        } catch (Exception var10) {
            class86.method704(var10, null, 4436);
        }
        field2577++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILdd;I)Lff;")
    public static final class42 method837(int arg0, class26 arg1, int arg2) {
        field2559++;
        byte[] var3 = arg1.method194(arg2, -59);
        if (arg0 != 0) {
            method842(null, 82);
        }
        return var3 == null ? null : new class42(var3);
    }

    @OriginalMember(owner = "client!pc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2552++;
    }

    @OriginalMember(owner = "client!pc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2556++;
        if (class126.field2867 == null) {
            return class102.field2497 == null || class102.field2497.field1679 == this ? super.getDocumentBase() : class102.field2497.field1679.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public static final void method838(int arg0, int arg1, int arg2) {
        field2584++;
        if (arg1 > -57) {
            return;
        }
        class127 var3 = class143.method1061((byte) -99, arg2);
        int var4 = var3.field2888;
        int var5 = var3.field2885;
        int var6 = var3.field2889;
        int var7 = class38.field986[var4 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class85.field2124[var6] = class52.method392(class24.method156(~var8, class85.field2124[var6]), class24.method156(var8, arg0 << var5));
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public abstract void method128(byte arg0);

    @OriginalMember(owner = "client!pc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2562++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method839(int arg0, int arg1) {
        if (arg1 != 3072) {
            method832(96);
        }
        field2589++;
        if (arg0 == -3) {
            class81.method666(class68.field1716, class31.field825, arg1 - 3172, class90.field2300);
        } else if (arg0 == -2) {
            class81.method666(class31.field824, class31.field810, -103, class34.field910);
        } else if (arg0 == -1) {
            class81.method666(class87.field2209, class31.field787, -118, class90.field2293);
        } else if (arg0 == 3) {
            class81.method666(class31.field833, class31.field814, -121, class4.field83);
        } else if (arg0 == 4) {
            class81.method666(class114.field2703, class31.field832, -108, class54.field1332);
        } else if (arg0 == 5) {
            class81.method666(class153.field3307, class31.field820, -115, class80.field1985);
        } else if (arg0 == 6) {
            class81.method666(class158.field3514, class31.field837, -122, class7.field135);
        } else if (arg0 == 7) {
            class81.method666(class43.field1094, class31.field805, -92, class33.field880);
        } else if (arg0 == 8) {
            class81.method666(class148.field3242, class31.field807, -112, class155.field3373);
        } else if (arg0 == 9) {
            class81.method666(class51.field1282, class31.field811, -117, class149.field3271);
        } else if (arg0 == 10) {
            class81.method666(class148.field3244, class31.field795, -91, class22.field530);
        } else if (arg0 == 11) {
            class81.method666(class22.field510, class31.field819, arg1 - 3174, class68.field1752);
        } else if (arg0 == 12) {
            class81.method666(class106.field2521, class31.field836, -117, class153.field3318);
        } else if (arg0 == 13) {
            class81.method666(class23.field533, class31.field843, -93, class90.field2299);
        } else if (arg0 == 14) {
            class81.method666(class62.field1589, class31.field850, arg1 - 3180, class130.field2922);
        } else if (arg0 == 16) {
            class81.method666(class99.field2462, class31.field790, -124, class62.field1570);
        } else if (arg0 == 17) {
            class81.method666(class26.field650, class31.field794, arg1 ^ 0xFFFFF382, class80.field1981);
        } else if (arg0 == 18) {
            class81.method666(class56.field1372, class31.field802, arg1 - 3157, field2554);
        } else if (arg0 == 19) {
            class81.method666(class108.field2601, class33.field882, -106, class51.field1274);
        } else if (arg0 == 20) {
            class81.method666(class31.field803, class31.field800, -107, class90.field2292);
        } else if (arg0 == 22) {
            class81.method666(class2.field51, class31.field845, -105, class134.field2976);
        } else if (arg0 == 23) {
            class81.method666(class59.field1449, class31.field828, -82, class130.field2929);
        } else if (arg0 == 24) {
            class81.method666(class80.field1987, class31.field809, arg1 ^ 0xFFFFF396, class88.field2216);
        } else if (arg0 == 25) {
            class81.method666(class80.field2001, class31.field830, arg1 - 3196, class90.field2298);
        } else if (arg0 == 26) {
            class81.method666(class94.field2410, class31.field798, -87, class131.field2949);
        } else if (arg0 == 27) {
            class81.method666(class31.field816, class31.field789, -93, class155.field3372);
        } else {
            class81.method666(class130.field2915, class31.field793, -113, class90.field2301);
        }
        class89.method737(10, arg1 - 2944);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    private final void method840(int arg0) {
        field2595++;
        long var2 = class29.method235(-329);
        long var4 = class152.field3305[class137.field3046];
        class152.field3305[class137.field3046] = var2;
        if ((long) arg0 != var4 && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class85.field2127 = ((var6 >> 1) + 32000) / var6;
        }
        class137.field3046 = class137.field3046 + 1 & 0x1F;
        if (class106.field2549++ > 50) {
            class41.field1049 = true;
            class106.field2549 -= 50;
            class142.field3115.setSize(class10.field216, class34.field917);
            class142.field3115.setVisible(true);
            if (class126.field2867 == null) {
                class142.field3115.setLocation(0, 0);
            } else {
                Insets var7 = class126.field2867.getInsets();
                class142.field3115.setLocation(var7.left, var7.top);
            }
        }
        this.method133(19349);
    }

    @OriginalMember(owner = "client!pc", name = "providesignlink", descriptor = "(Lje;)V")
    public static final void providesignlink(class67 arg0) {
        field2571++;
        class102.field2497 = arg0;
        class149.field3266 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    private final synchronized void method841(int arg0) {
        field2570++;
        if (class41.field1064) {
            return;
        }
        class41.field1064 = true;
        try {
            class142.field3115.removeFocusListener(this);
        } catch (Exception var5) {
        }
        if (arg0 != 0) {
            this.getDocumentBase();
        }
        try {
            this.method128((byte) -39);
        } catch (Exception var4) {
        }
        if (class126.field2867 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class102.field2497 != null) {
            try {
                class102.field2497.method535((byte) 18);
            } catch (Exception var2) {
            }
        }
        this.method131((byte) 65);
    }

    @OriginalMember(owner = "client!pc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class63.field1617 = true;
        class41.field1049 = true;
        field2572++;
    }

    @OriginalMember(owner = "client!pc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2567++;
    }

    @OriginalMember(owner = "client!pc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2564++;
    }

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
    public final void run() {
        field2560++;
        try {
            if (class67.field1667 != null) {
                String var1 = class67.field1667.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class67.field1669;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method835((byte) -106, "wrongjava");
                        return;
                    }
                    class125.field2804 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class67.field1669 == null || class67.field1669.equals("1.4.2"))) {
                    this.method835((byte) -122, "wrongjava");
                    return;
                }
            }
            if (class102.field2497.field1679 != null) {
                Method var3 = class67.field1671;
                if (var3 != null) {
                    try {
                        var3.invoke(class102.field2497.field1679, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method844(157228071);
            class33.field891 = class77.method634(class142.field3115, 1375517917, class34.field917, class10.field216);
            this.method123(0);
            class53.field1317 = client.method127((byte) 37);
            while (class26.field657 == 0L || class26.field657 > class29.method235(-329)) {
                class65.field1645 = class53.field1317.method18(class125.field2804, class68.field1759, 23535);
                for (int var4 = 0; var4 < class65.field1645; var4++) {
                    this.method845((byte) -128);
                }
                this.method840(0);
                class54.method402(class102.field2497, class142.field3115, (byte) -116);
            }
        } catch (Exception var7) {
            class86.method704(var7, null, 4436);
            this.method835((byte) -105, "crash");
        }
        this.method841(0);
    }

    @OriginalMember(owner = "client!pc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2591++;
    }

    @OriginalMember(owner = "client!pc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2586++;
    }

    @OriginalMember(owner = "client!pc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2587++;
        if (class26.field654 == this && !class41.field1064) {
            class26.field657 = class29.method235(-329);
            class126.method962(false, 5000L);
            class149.field3266 = null;
            this.method841(0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method842(KeyEvent arg0, int arg1) {
        field2576++;
        int var2 = arg0.getKeyChar();
        if (arg1 != 128) {
            field2551 = -34;
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2575++;
        if (class126.field2867 == null) {
            return class102.field2497 == null || class102.field2497.field1679 == this ? super.getParameter(arg0) : class102.field2497.field1679.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2565++;
        if (class126.field2867 == null) {
            return class102.field2497 == null || class102.field2497.field1679 == this ? super.getCodeBase() : class102.field2497.field1679.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2566++;
        if (class26.field654 != this || class41.field1064) {
            return;
        }
        class41.field1049 = true;
        if (class67.field1669 != null && class67.field1669.startsWith("1.5") && class29.method235(-329) - class38.field990 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class10.field216 && class34.field917 <= var2.height) {
                class148.field3234 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Z")
    public final boolean method843(boolean arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field2558++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0) {
                field2588 = null;
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method835((byte) -117, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2573++;
    }

    @OriginalMember(owner = "client!pc", name = "stop", descriptor = "()V")
    public final void stop() {
        field2580++;
        if (class26.field654 == this && !class41.field1064) {
            class26.field657 = class29.method235(-329) + 4000L;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public abstract void method123(int arg0);

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public abstract void method131(byte arg0);

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
    public abstract void method135(byte arg0);

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public final synchronized void method844(int arg0) {
        field2563++;
        if (arg0 != 157228071) {
            this.getAppletContext();
        }
        Container var2;
        if (class126.field2867 == null) {
            var2 = class102.field2497.field1679;
        } else {
            var2 = class126.field2867;
        }
        if (class142.field3115 != null) {
            class142.field3115.removeFocusListener(this);
            var2.remove(class142.field3115);
        }
        class142.field3115 = new class80(this);
        var2.add(class142.field3115);
        class142.field3115.setSize(class10.field216, class34.field917);
        class142.field3115.setVisible(true);
        if (class126.field2867 == null) {
            class142.field3115.setLocation(0, 0);
        } else {
            Insets var3 = class126.field2867.getInsets();
            class142.field3115.setLocation(var3.left, var3.top);
        }
        class142.field3115.addFocusListener(this);
        class142.field3115.requestFocus();
        class41.field1049 = true;
        class148.field3234 = false;
        class38.field990 = class29.method235(arg0 ^ 0xF6A0E290);
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
    private final void method845(byte arg0) {
        field2597++;
        long var2 = class130.field2928[class24.field578];
        long var4 = class29.method235(-329);
        class130.field2928[class24.field578] = var4;
        class24.field578 = class24.field578 + 1 & 0x1F;
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            if (arg0 >= -65) {
                field2581 = null;
            }
            class127.field2890 = class63.field1617;
        }
        this.method135((byte) 126);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZII)V")
    public final void method846(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2555++;
        try {
            if (class26.field654 == null) {
                class26.field654 = this;
                class10.field216 = arg0;
                class34.field917 = arg1;
                if (arg2) {
                    class134.field2975 = arg3;
                    if (class102.field2497 == null) {
                        class149.field3266 = class102.field2497 = new class67(false, this, arg4, null, 0);
                    }
                    class102.field2497.method543(this, 1, 0);
                }
            } else {
                class33.field888++;
                if (class33.field888 >= 3) {
                    this.method835((byte) -123, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class86.method704(var7, null, 4436);
            this.method835((byte) 73, "crash");
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public abstract void method133(int arg0);

    @OriginalMember(owner = "client!pc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2574++;
        if (class126.field2867 == null) {
            return class102.field2497 == null || class102.field2497.field1679 == this ? super.getAppletContext() : class102.field2497.field1679.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2578++;
    }
}
