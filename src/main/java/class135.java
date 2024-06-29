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

@OriginalClass("client!p")
public abstract class class135 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!p", name = "N", descriptor = "Z")
    private boolean field2648 = false;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "[I")
    public static int[] field2609 = new int[25];

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lsd;")
    private static class166 field2620 = method935("Login", 0);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lsd;")
    private static class166 field2622 = method935("Error connecting to server)3", 0);

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Lsd;")
    public static class166 field2637 = field2620;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Lsd;")
    private static class166 field2645 = method935("Please remove ", 0);

    @OriginalMember(owner = "client!p", name = "J", descriptor = "Lsd;")
    public static class166 field2644 = field2622;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lsd;")
    public static class166 field2625 = field2645;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "Lsd;")
    public static class166 field2651 = null;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "Lsd;")
    public static class166 field2643 = field2645;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
    public static int[] field2616;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "[I")
    public static int[] field2642;

    @OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
    public final void run() {
        field2626++;
        try {
            if (class80.field1642 != null) {
                String var1 = class80.field1642.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class80.field1644;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method932(13768, "wrongjava");
                        return;
                    }
                    class34.field646 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class80.field1644 == null || class80.field1644.equals("1.4.2"))) {
                    this.method932(13768, "wrongjava");
                    return;
                }
            }
            if (class35.field664.field1630 != null) {
                Method var3 = class80.field1637;
                if (var3 != null) {
                    try {
                        var3.invoke(class35.field664.field1630, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method940((byte) -72);
            class99.field1885 = class141.method958(class114.field2219, class48.field888, (byte) -99, class165.field3127);
            this.method215(-97);
            class85.field1699 = class103.method775(-79);
            while (class139.field2696 == 0L || class139.field2696 > class100.method748((byte) 35)) {
                class160.field3056 = class85.field1699.method1095(0, class147.field2897, class34.field646);
                for (int var4 = 0; var4 < class160.field3056; var4++) {
                    this.method936(31);
                }
                this.method941((byte) -107);
                class134.method929(class114.field2219, 1001, class35.field664);
            }
        } catch (Exception var7) {
            class32.method238((byte) -65, var7, null);
            this.method932(13768, "crash");
        }
        this.method931(true);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public abstract void method205(byte arg0);

    @OriginalMember(owner = "client!p", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class14.field259 = false;
        field2612++;
    }

    @OriginalMember(owner = "client!p", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2621++;
        if (class102.field1996 == null) {
            return class35.field664 == null || class35.field664.field1630 == this ? super.getAppletContext() : class35.field664.field1630.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Z")
    public final boolean method930(int arg0) {
        int var2 = 30 / ((-arg0 - 16) / 44);
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        field2638++;
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
                this.method932(13768, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2633++;
        if (class102.field1996 == null) {
            return class35.field664 == null || class35.field664.field1630 == this ? super.getDocumentBase() : class35.field664.field1630.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2630++;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public abstract void method214(int arg0);

    @OriginalMember(owner = "client!p", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2611++;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public abstract void method208(byte arg0);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    private final synchronized void method931(boolean arg0) {
        field2649++;
        if (class90.field1764) {
            return;
        }
        class90.field1764 = arg0;
        try {
            class114.field2219.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method208((byte) 125);
        } catch (Exception var4) {
        }
        if (class102.field1996 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class35.field664 != null) {
            try {
                class35.field664.method652((byte) -50);
            } catch (Exception var2) {
            }
        }
        this.method214(13191);
    }

    @OriginalMember(owner = "client!p", name = "stop", descriptor = "()V")
    public final void stop() {
        field2627++;
        if (class159.field3029 == this && !class90.field1764) {
            class139.field2696 = class100.method748((byte) 35) + 4000L;
        }
    }

    @OriginalMember(owner = "client!p", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2639++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method932(int arg0, String arg1) {
        field2623++;
        if (this.field2648) {
            return;
        }
        this.field2648 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
        if (arg0 != 13768) {
            field2644 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2636++;
    }

    @OriginalMember(owner = "client!p", name = "providesignlink", descriptor = "(Lih;)V")
    public static final void providesignlink(class80 arg0) {
        class35.field664 = arg0;
        class143.field2782 = arg0;
        field2634++;
    }

    @OriginalMember(owner = "client!p", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2653++;
    }

    @OriginalMember(owner = "client!p", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2624++;
    }

    @OriginalMember(owner = "client!p", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2650++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public static void method933(int arg0) {
        field2620 = null;
        if (arg0 != 4523) {
            method934(85, null);
        }
        field2644 = null;
        field2609 = null;
        field2625 = null;
        field2616 = null;
        field2651 = null;
        field2637 = null;
        field2642 = null;
        field2622 = null;
        field2645 = null;
        field2643 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILvd;)Z")
    public static final boolean method934(int arg0, class193 arg1) {
        field2640++;
        int var2 = arg1.field3823;
        if (arg0 != -300) {
            method938(false);
        }
        if (var2 == 205) {
            class48.field887 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class33.field598.method807(var4 == 1, var3, 256);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = var2 & 0x1;
            int var6 = (var2 - 314) / 2;
            class33.field598.method802(var5 == 1, var6, 102);
        }
        if (var2 == 324) {
            class33.field598.method806(false, arg0 ^ 0xFFFFBEA2);
        }
        if (var2 == 325) {
            class33.field598.method806(true, arg0 + 16802);
        }
        if (var2 == 326) {
            class141.field2737++;
            class156.field2989.method705(90, (byte) 9);
            class33.field598.method804(class156.field2989, (byte) -48);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2632++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;I)Lsd;")
    public static final class166 method935(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        field2646++;
        int var3 = var2.length;
        int var4 = arg1;
        class166 var5 = new class166();
        var5.field3162 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field3162[var5.field3187++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field3162[var5.field3187++] = (byte) var6;
            }
        }
        var5.method1117(99);
        return var5.method1131((byte) 71);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    private final void method936(int arg0) {
        field2619++;
        long var2 = class100.method748((byte) 35);
        long var4 = class153.field2955[class162.field3089];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class153.field2955[class162.field3089] = var2;
        class162.field3089 = arg0 & class162.field3089 + 1;
        synchronized (this) {
            class172.field3288 = class14.field259;
        }
        this.method211(arg0 - 31);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
    public final void method937(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2647++;
        try {
            if (class159.field3029 == null) {
                class48.field888 = arg4;
                class165.field3127 = arg2;
                class162.field3091 = arg1;
                class159.field3029 = this;
                if (class35.field664 == null) {
                    class143.field2782 = class35.field664 = new class80(false, this, arg3, null, 0);
                }
                class35.field664.method655(this, arg0, arg0 ^ 0x100001);
            } else {
                class128.field2512++;
                if (class128.field2512 >= 3) {
                    this.method932(arg0 ^ 0x35C9, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class32.method238((byte) -65, var7, null);
            this.method932(13768, "crash");
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
    public static final void method938(boolean arg0) {
        field2631++;
        if (arg0) {
            field2609 = null;
        }
        for (class8 var1 = (class8) class178.field3372.method1109((byte) -120); var1 != null; var1 = (class8) class178.field3372.method1115((byte) 116)) {
            if (var1.field142 != null) {
                var1.method53(false);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public abstract void method211(int arg0);

    @OriginalMember(owner = "client!p", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2613++;
        if (class159.field3029 != this || class90.field1764) {
            return;
        }
        class150.field2919 = true;
        if (class80.field1644 != null && class80.field1644.startsWith("1.5") && class100.method748((byte) 35) - class110.field2130 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class165.field3127 && var2.height >= class48.field888) {
                class130.field2545 = true;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method939(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field2615++;
        try {
            class159.field3029 = this;
            class162.field3091 = arg2;
            class165.field3127 = arg5;
            class48.field888 = arg0;
            class102.field1996 = new Frame();
            class102.field1996.setTitle("Jagex");
            if (arg6 == -4169) {
                class102.field1996.setResizable(false);
                class102.field1996.addWindowListener(this);
                class102.field1996.setVisible(true);
                class102.field1996.toFront();
                Insets var8 = class102.field1996.getInsets();
                class102.field1996.setSize(arg5 + var8.left + var8.right, var8.top + arg0 + var8.bottom);
                class143.field2782 = class35.field664 = new class80(true, null, arg1, arg3, arg4);
                class35.field664.method655(this, 1, arg6 ^ 0xFFEFEFB7);
            }
        } catch (Exception var10) {
            class32.method238((byte) -65, var10, null);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public final synchronized void method940(byte arg0) {
        Container var2;
        if (class102.field1996 == null) {
            var2 = class35.field664.field1630;
        } else {
            var2 = class102.field1996;
        }
        if (class114.field2219 != null) {
            class114.field2219.removeFocusListener(this);
            var2.remove(class114.field2219);
        }
        field2614++;
        class114.field2219 = new class151(this);
        var2.add(class114.field2219);
        if (arg0 != -72) {
            this.method931(false);
        }
        class114.field2219.setSize(class165.field3127, class48.field888);
        class114.field2219.setVisible(true);
        if (class102.field1996 == null) {
            class114.field2219.setLocation(0, 0);
        } else {
            Insets var3 = class102.field1996.getInsets();
            class114.field2219.setLocation(var3.left, var3.top);
        }
        class114.field2219.addFocusListener(this);
        class114.field2219.requestFocus();
        class150.field2919 = true;
        class130.field2545 = false;
        class110.field2130 = class100.method748((byte) 35);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    private final void method941(byte arg0) {
        if (arg0 > -86) {
            field2616 = null;
        }
        field2652++;
        long var2 = class137.field2680[class206.field4060];
        long var4 = class100.method748((byte) 35);
        class137.field2680[class206.field4060] = var4;
        class206.field4060 = class206.field4060 + 1 & 0x1F;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class4.field85 = ((var6 >> 1) + 32000) / var6;
        }
        if (class22.field384++ > 50) {
            class22.field384 -= 50;
            class150.field2919 = true;
            class114.field2219.setSize(class165.field3127, class48.field888);
            class114.field2219.setVisible(true);
            if (class102.field1996 == null) {
                class114.field2219.setLocation(0, 0);
            } else {
                Insets var7 = class102.field1996.getInsets();
                class114.field2219.setLocation(var7.left, var7.top);
            }
        }
        this.method205((byte) -34);
    }

    @OriginalMember(owner = "client!p", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2618++;
        if (class102.field1996 == null) {
            return class35.field664 == null || class35.field664.field1630 == this ? super.getParameter(arg0) : class35.field664.field1630.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "start", descriptor = "()V")
    public final void start() {
        field2610++;
        if (class159.field3029 == this && !class90.field1764) {
            class139.field2696 = 0L;
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public abstract void method215(int arg0);

    @OriginalMember(owner = "client!p", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2629++;
        if (class102.field1996 == null) {
            return class35.field664 == null || class35.field664.field1630 == this ? super.getCodeBase() : class35.field664.field1630.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class14.field259 = true;
        field2635++;
        class150.field2919 = true;
    }

    @OriginalMember(owner = "client!p", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2617++;
        if (class159.field3029 == this && !class90.field1764) {
            class139.field2696 = class100.method748((byte) 35);
            class189.method1260(5000L, 1);
            class143.field2782 = null;
            this.method931(true);
        }
    }
}
