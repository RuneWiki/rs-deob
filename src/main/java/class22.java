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

@OriginalClass("client!d")
public abstract class class22 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Z")
    private boolean field593 = false;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Laf;")
    public static class7 field598 = class48.method406(40, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field603 = 0;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "Laf;")
    public static class7 field612 = class48.method406(40, "ams");

    @OriginalMember(owner = "client!d", name = "L", descriptor = "Laf;")
    public static class7 field618 = class48.method406(40, ")3");

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field617 = 0;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "[I")
    public static int[] field615 = new int[128];

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "Z")
    public static boolean field621;

    @OriginalMember(owner = "client!d", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field613++;
        if (class54.field1324 == null) {
            return class74.field1717 == null || class74.field1717.field2366 == this ? super.getDocumentBase() : class74.field1717.field2366.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method210(int arg0) {
        field618 = null;
        field615 = null;
        field612 = null;
        field598 = null;
        if (arg0 != 1) {
            field615 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)Z")
    public final boolean method211(byte arg0) {
        field595++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            if (arg0 != 88) {
                this.init();
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method216("invalidhost", -121);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field590++;
        this.destroy();
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public abstract void method197(byte arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        try {
            class151.field3539 = this;
            class79.field1839 = arg4;
            class103.field2510 = arg3;
            class81.field1864 = arg1;
            class54.field1324 = new Frame();
            class54.field1324.setTitle("Jagex");
            class54.field1324.setResizable(false);
            class54.field1324.addWindowListener(this);
            class54.field1324.setVisible(true);
            class54.field1324.toFront();
            Insets var8 = class54.field1324.getInsets();
            class54.field1324.setSize(var8.left + arg4 + var8.right, arg1 - -var8.bottom + var8.top);
            class46.field1129 = class74.field1717 = new class100(true, null, arg6, arg5, arg0);
            class74.field1717.method823((byte) -92, 1, this);
            if (arg2 != 5) {
                field617 = 3;
            }
        } catch (Exception var10) {
            class144.method1169(var10, (byte) -82, null);
        }
        field611++;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    public abstract void method202(byte arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
    public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field604++;
        try {
            if (class151.field3539 == null) {
                if (arg0 != 19170) {
                    field618 = null;
                }
                class81.field1864 = arg3;
                class79.field1839 = arg4;
                class103.field2510 = arg2;
                class151.field3539 = this;
                if (class74.field1717 == null) {
                    class46.field1129 = class74.field1717 = new class100(false, this, arg1, null, 0);
                }
                class74.field1717.method823((byte) -88, 1, this);
            } else {
                class96.field2297++;
                if (class96.field2297 >= 3) {
                    this.method216("alreadyloaded", 83);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class144.method1169(var7, (byte) 50, null);
            this.method216("crash", -113);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method214(int arg0) {
        if (arg0 != 1) {
            field618 = null;
        }
        class91.field2106 = true;
        class124.field2960 = true;
        field601++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(JB)V")
    public static final void method215(long arg0, byte arg1) {
        field608++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 <= 79) {
            field618 = null;
        }
        class47.field1150.method1131(47, 2027385224);
        class116.field2757++;
        class47.field1150.method956(arg0, -822368080);
    }

    @OriginalMember(owner = "client!d", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field594++;
    }

    @OriginalMember(owner = "client!d", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field602++;
        if (class54.field1324 == null) {
            return class74.field1717 == null || class74.field1717.field2366 == this ? super.getCodeBase() : class74.field1717.field2366.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method216(String arg0, int arg1) {
        field600++;
        if (this.field593) {
            return;
        }
        this.field593 = true;
        System.out.println("error_game_" + arg0);
        try {
            int var3 = -101 % ((arg1 + 40) / 63);
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public abstract void method198(int arg0);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    private final void method217(int arg0) {
        field616++;
        long var2 = class153.field3579[class108.field2645];
        long var4 = class55.method445(0);
        class153.field3579[class108.field2645] = var4;
        class108.field2645 = class108.field2645 + 1 & arg0;
        synchronized (this) {
            class121.field2845 = class143.field3398;
        }
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        this.method205((byte) -119);
    }

    @OriginalMember(owner = "client!d", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field585++;
        class143.field3398 = false;
    }

    @OriginalMember(owner = "client!d", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field591++;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
    private final void method218(int arg0) {
        field596++;
        long var2 = class96.field2285[class77.field1791];
        long var4 = class55.method445(0);
        class96.field2285[class77.field1791] = var4;
        class77.field1791 = class77.field1791 + 1 & 0x1F;
        if (arg0 <= 78) {
            method214(-93);
        }
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class145.field3433 = ((var6 >> 1) + 32000) / var6;
        }
        if (class6.field105++ > 50) {
            class8.field217 = true;
            class6.field105 -= 50;
            class13.field324.setSize(class79.field1839, class81.field1864);
            class13.field324.setVisible(true);
            if (class54.field1324 == null) {
                class13.field324.setLocation(0, 0);
            } else {
                Insets var7 = class54.field1324.getInsets();
                class13.field324.setLocation(var7.left, var7.top);
            }
        }
        this.method197((byte) -90);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    public final synchronized void method219(boolean arg0) {
        field581++;
        Container var2;
        if (class54.field1324 == null) {
            var2 = class74.field1717.field2366;
        } else {
            var2 = class54.field1324;
        }
        if (class13.field324 != null) {
            class13.field324.removeFocusListener(this);
            var2.remove(class13.field324);
        }
        class13.field324 = new class152(this);
        var2.add(class13.field324);
        class13.field324.setSize(class79.field1839, class81.field1864);
        class13.field324.setVisible(true);
        if (class54.field1324 == null) {
            class13.field324.setLocation(0, 0);
        } else {
            Insets var3 = class54.field1324.getInsets();
            class13.field324.setLocation(var3.left, var3.top);
        }
        class13.field324.addFocusListener(this);
        class13.field324.requestFocus();
        class8.field217 = arg0;
        class133.field3116 = false;
        class58.field1383 = class55.method445(0);
    }

    @OriginalMember(owner = "client!d", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field592++;
        if (class151.field3539 != this || class111.field2680) {
            return;
        }
        class8.field217 = true;
        if (class100.field2371 != null && class100.field2371.startsWith("1.5") && class55.method445(0) - class58.field1383 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class79.field1839 && class81.field1864 <= var2.height) {
                class133.field3116 = true;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field589++;
    }

    @OriginalMember(owner = "client!d", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field583++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!d", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field607++;
        if (class151.field3539 == this && !class111.field2680) {
            class51.field1209 = class55.method445(0);
            class79.method673(2, 5000L);
            class46.field1129 = null;
            this.method220(-9172);
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    public abstract void method205(byte arg0);

    @OriginalMember(owner = "client!d", name = "start", descriptor = "()V")
    public final void start() {
        field609++;
        if (class151.field3539 == this && !class111.field2680) {
            class51.field1209 = 0L;
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
    public abstract void method204(byte arg0);

    @OriginalMember(owner = "client!d", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field587++;
        if (class54.field1324 == null) {
            return class74.field1717 == null || class74.field1717.field2366 == this ? super.getAppletContext() : class74.field1717.field2366.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "providesignlink", descriptor = "(Loc;)V")
    public static final void providesignlink(class100 arg0) {
        field610++;
        class74.field1717 = arg0;
        class46.field1129 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field588++;
    }

    @OriginalMember(owner = "client!d", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field586++;
    }

    @OriginalMember(owner = "client!d", name = "stop", descriptor = "()V")
    public final void stop() {
        field582++;
        if (class151.field3539 == this && !class111.field2680) {
            class51.field1209 = class55.method445(0) + 4000L;
        }
    }

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
    public final void run() {
        field584++;
        try {
            if (class100.field2370 != null) {
                String var1 = class100.field2370.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class100.field2371;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method216("wrongjava", 63);
                        return;
                    }
                    class141.field3337 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class100.field2371 == null || class100.field2371.equals("1.4.2"))) {
                    this.method216("wrongjava", 127);
                    return;
                }
            }
            if (class74.field1717.field2366 != null) {
                Method var3 = class100.field2383;
                if (var3 != null) {
                    try {
                        var3.invoke(class74.field1717.field2366, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method219(true);
            class102.field2425 = class58.method472(class13.field324, class79.field1839, class81.field1864, (byte) -117);
            this.method204((byte) 39);
            class141.field3332 = class43.method381((byte) 125);
            class141.field3332.method131((byte) 57);
            while (class51.field1209 == 0L || class55.method445(0) < class51.field1209) {
                class49.field1180 = class141.field3332.method133(class92.field2133, (byte) -121, class141.field3337);
                for (int var4 = 0; var4 < class49.field1180; var4++) {
                    this.method217(31);
                }
                this.method218(118);
                class77.method663(class74.field1717, (byte) 92, class13.field324);
            }
        } catch (Exception var7) {
            class144.method1169(var7, (byte) -80, null);
            this.method216("crash", 55);
        }
        this.method220(-9172);
    }

    @OriginalMember(owner = "client!d", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field619++;
    }

    @OriginalMember(owner = "client!d", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field620++;
        if (class54.field1324 == null) {
            return class74.field1717 == null || class74.field1717.field2366 == this ? super.getParameter(arg0) : class74.field1717.field2366.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    private final synchronized void method220(int arg0) {
        field599++;
        if (class111.field2680) {
            return;
        }
        class111.field2680 = true;
        try {
            if (arg0 != -9172) {
                this.field593 = false;
            }
            class13.field324.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method202((byte) -37);
        } catch (Exception var4) {
        }
        if (class54.field1324 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class74.field1717 != null) {
            try {
                class74.field1717.method819(0);
            } catch (Exception var2) {
            }
        }
        this.method198(-122);
    }

    @OriginalMember(owner = "client!d", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field597++;
        class143.field3398 = true;
        class8.field217 = true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIBI)V")
    public static final void method221(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -102) {
            field615 = null;
        }
        for (class96 var5 = (class96) class39.field980.method758(255); var5 != null; var5 = (class96) class39.field980.method766(-116)) {
            if (var5.field2277 != -1 || var5.field2272 != null) {
                int var6 = 0;
                if (var5.field2287 < arg1) {
                    var6 += arg1 - var5.field2287;
                } else if (arg1 < var5.field2284) {
                    var6 += var5.field2284 - arg1;
                }
                if (var5.field2273 < arg2) {
                    var6 += arg2 - var5.field2273;
                } else if (var5.field2290 > arg2) {
                    var6 += var5.field2290 - arg2;
                }
                if (var5.field2295 < var6 - 64 || class27.field720 == 0 || var5.field2268 != arg0) {
                    if (var5.field2296 != null) {
                        class144.field3402.method2(var5.field2296);
                        var5.field2296 = null;
                    }
                    if (var5.field2275 != null) {
                        class144.field3402.method2(var5.field2275);
                        var5.field2275 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field2295 - var6) * class27.field720 / var5.field2295;
                    if (var5.field2296 != null) {
                        var5.field2296.method487(var7);
                    } else if (var5.field2277 >= 0) {
                        class61 var8 = class61.method515(class39.field984, var5.field2277, 0);
                        if (var8 != null) {
                            class146 var9 = var8.method517().method1180(class121.field2847);
                            class59 var10 = class59.method498(var9, 100, var7);
                            var10.method490(-1);
                            class144.field3402.method3(var10);
                            var5.field2296 = var10;
                        }
                    }
                    if (var5.field2275 != null) {
                        var5.field2275.method487(var7);
                        if (!var5.field2275.method1130(0)) {
                            var5.field2275 = null;
                        }
                    } else if (var5.field2272 != null && (var5.field2292 -= arg4) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field2272.length);
                        class61 var12 = class61.method515(class39.field984, var5.field2272[var11], 0);
                        if (var12 != null) {
                            class146 var13 = var12.method517().method1180(class121.field2847);
                            class59 var14 = class59.method498(var13, 100, var7);
                            var14.method490(0);
                            class144.field3402.method3(var14);
                            var5.field2275 = var14;
                            var5.field2292 = (int) ((double) (var5.field2291 - var5.field2270) * Math.random()) + var5.field2270;
                        }
                    }
                }
            }
        }
        field605++;
    }

    @OriginalMember(owner = "client!d", name = "init", descriptor = "()V")
    public abstract void init();
}
