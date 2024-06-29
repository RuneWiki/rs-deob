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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class93 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Z")
    private boolean field2243 = false;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lwb;")
    private static class130 field2225 = class26.method212("level)2", -32376);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lwb;")
    public static class130[] field2218 = new class130[100];

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "Lwb;")
    public static class130 field2247 = class26.method212("m", -32376);

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "Lwb;")
    public static class130 field2246 = field2225;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    private static int field2236 = 500;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "Lwb;")
    public static class130 field2257 = class26.method212("mapscene", -32376);

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "Lwb;")
    public static class130 field2258 = class26.method212("Wen m-Ochten Sie hinzuf-Ugen?", -32376);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lqd;")
    public static class100 field2222;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "Ld;")
    public static class19 field2250;

    @OriginalMember(owner = "client!pc", name = "providesignlink", descriptor = "(Lsb;)V", line = 4)
    public static final void providesignlink(class110 arg0) {
        class113.field2779 = arg0;
        class113.field2803 = arg0;
        field2255++;
    }

    @OriginalMember(owner = "client!pc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 12)
    public final AppletContext getAppletContext() {
        field2233++;
        if (class61.field1588 == null) {
            return class113.field2779 == null || class113.field2779.field2712 == this ? super.getAppletContext() : class113.field2779.field2712.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "stop", descriptor = "()V", line = 27)
    public final void stop() {
        field2249++;
        if (class113.field2796 == this && !class128.field3029) {
            class56.field1434 = class90.method668(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V", line = 40)
    public final void method687(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2219++;
        try {
            if (class113.field2796 == null) {
                class113.field2796 = this;
                class3.field115 = arg4;
                class83.field1953 = arg0;
                class45.field1204 = arg2;
                if (arg1 <= -79) {
                    if (class113.field2779 == null) {
                        class113.field2803 = class113.field2779 = new class110(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg3, null, 0);
                    }
                    class113.field2779.method842(this, (byte) 78, 1);
                }
            } else {
                this.method693(true, "alreadyloaded");
            }
        } catch (Exception var7) {
            class33.method264(null, var7, (byte) -113);
            this.method693(true, "crash");
        }
    }

    @OriginalMember(owner = "client!pc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 71)
    public final void windowClosed(WindowEvent arg0) {
        field2234++;
    }

    @OriginalMember(owner = "client!pc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 78)
    public final void windowDeiconified(WindowEvent arg0) {
        field2237++;
    }

    @OriginalMember(owner = "client!pc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 86)
    public final synchronized void paint(Graphics arg0) {
        field2260++;
        if (class113.field2796 != this || class128.field3029) {
            return;
        }
        class43.field1191 = true;
        if (class110.field2702 != null && class110.field2702.startsWith("1.5") && class90.method668(false) - class98.field2379 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class45.field1204 && var2.height >= class3.field115) {
                class88.field2105 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 110)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2242++;
    }

    @OriginalMember(owner = "client!pc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 120)
    public final void windowActivated(WindowEvent arg0) {
        field2256++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B[Lwb;)[Lwb;", line = 133)
    public static final class130[] method688(byte arg0, class130[] arg1) {
        field2230++;
        if (arg0 != 54) {
            method699(-30, 111L);
        }
        class130[] var2 = new class130[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class15.method114(new class130[] { class109.method831(var3, class111.method854(arg0, 60)), client.field543 }, -20349);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class15.method114(new class130[] { var2[var3], arg1[var3] }, class111.method854(arg0, -20299));
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V", line = 160)
    public final synchronized void method689(boolean arg0) {
        field2240++;
        Container var2;
        if (class61.field1588 == null) {
            var2 = class113.field2779.field2712;
        } else {
            var2 = class61.field1588;
        }
        if (class84.field2003 != null) {
            class84.field2003.removeFocusListener(this);
            var2.remove(class84.field2003);
        }
        class84.field2003 = new class98(this);
        var2.add(class84.field2003);
        class84.field2003.setSize(class45.field1204, class3.field115);
        class84.field2003.setVisible(true);
        if (class61.field1588 == null) {
            class84.field2003.setLocation(0, 0);
        } else {
            Insets var3 = class61.field1588.getInsets();
            class84.field2003.setLocation(var3.left, var3.top);
        }
        class84.field2003.addFocusListener(this);
        class84.field2003.requestFocus();
        class43.field1191 = true;
        class88.field2105 = arg0;
        class98.field2379 = class90.method668(false);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 199)
    private final void method690(int arg0) {
        field2235++;
        long var2 = class90.method668(false);
        long var4 = class4.field155[class123.field2995];
        class4.field155[class123.field2995] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class90.field2185 = ((var6 >> 1) + 32000) / var6;
        }
        class123.field2995 = class123.field2995 + 1 & 0x1F;
        if (arg0 >= -46) {
            return;
        }
        if (field2236++ > 50) {
            class43.field1191 = true;
            field2236 -= 50;
            class84.field2003.setSize(class45.field1204, class3.field115);
            class84.field2003.setVisible(true);
            if (class61.field1588 == null) {
                class84.field2003.setLocation(0, 0);
            } else {
                Insets var7 = class61.field1588.getInsets();
                class84.field2003.setLocation(var7.left, var7.top);
            }
        }
        this.method159(-1);
    }

    @OriginalMember(owner = "client!pc", name = "destroy", descriptor = "()V", line = 241)
    public final void destroy() {
        field2228++;
        if (class113.field2796 == this && !class128.field3029) {
            class56.field1434 = class90.method668(false);
            class37.method375(-1, 5000L);
            class113.field2803 = null;
            this.method691(false);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V", line = 256)
    private final synchronized void method691(boolean arg0) {
        if (arg0) {
            return;
        }
        field2231++;
        if (class128.field3029) {
            return;
        }
        class128.field3029 = true;
        try {
            class84.field2003.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method158(-111);
        } catch (Exception var4) {
        }
        if (class61.field1588 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class113.field2779 != null) {
            try {
                class113.field2779.method844(-11);
            } catch (Exception var2) {
            }
        }
        this.method160(-1);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Z", line = 314)
    public final boolean method692(byte arg0) {
        field2248++;
        if (arg0 != -34) {
            this.method691(false);
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
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
                this.method693(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V", line = 347)
    public final void run() {
        field2227++;
        try {
            if (class110.field2701 != null) {
                String var1 = class110.field2701.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class110.field2702;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method693(true, "wrongjava");
                        return;
                    }
                    class85.field2023 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class110.field2702 == null || class110.field2702.equals("1.4.2"))) {
                    this.method693(true, "wrongjava");
                    return;
                }
            }
            if (class113.field2779.field2712 != null) {
                Method var3 = class110.field2697;
                if (var3 != null) {
                    try {
                        var3.invoke(class113.field2779.field2712, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method689(false);
            class52.field1365 = class19.method173(class3.field115, 4, class84.field2003, class45.field1204);
            this.method162((byte) -84);
            class20.field575 = client.method161(true);
            class20.field575.method83((byte) 108);
            while (class56.field1434 == 0L || class90.method668(false) < class56.field1434) {
                class35.field1011 = class20.field575.method82(true, class94.field2286, class85.field2023);
                for (int var4 = 0; var4 < class35.field1011; var4++) {
                    this.method694(0);
                }
                this.method690(-90);
            }
        } catch (Exception var7) {
            class33.method264(null, var7, (byte) -123);
            this.method693(true, "crash");
        }
        this.method691(false);
    }

    @OriginalMember(owner = "client!pc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 428)
    public final void windowDeactivated(WindowEvent arg0) {
        field2220++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 443)
    public final void method693(boolean arg0, String arg1) {
        field2244++;
        if (this.field2243) {
            return;
        }
        this.field2243 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!pc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 462)
    public final void focusGained(FocusEvent arg0) {
        class108.field2601 = true;
        class43.field1191 = true;
        field2245++;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V", line = 472)
    private final void method694(int arg0) {
        long var2 = class72.field1833[class17.field456];
        if (arg0 != 0) {
            field2222 = null;
        }
        field2238++;
        long var4 = class90.method668(false);
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class72.field1833[class17.field456] = var4;
        class17.field456 = class17.field456 + 1 & 0x1F;
        synchronized (this) {
            class120.field2944 = class108.field2601;
        }
        this.method164((byte) -7);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V", line = 514)
    public static final void method695(byte arg0) {
        field2259++;
        int var1 = class43.field1187.method1013(client.field527);
        for (int var2 = 0; var2 < class26.field757; var2++) {
            int var11 = class43.field1187.method996(class105.field2546[var2]);
            if (var11 > var1) {
                var1 = var11;
            }
        }
        int var3 = -17 / ((arg0 + 41) / 63);
        var1 += 8;
        int var4 = class26.field757 * 15 + 21;
        if (class105.field2558 > 4 && class35.field988 > 4 && class105.field2558 < 516 && class35.field988 < 338) {
            class58.field1462 = true;
            class35.field1007 = class26.field757 * 15 + 22;
            int var5 = class105.field2558 - var1 / 2 - 4;
            class116.field2863 = 0;
            int var6 = class35.field988 - 4;
            class119.field2908 = var1;
            if (var1 + var5 > 512) {
                var5 = 512 - var1;
            }
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class69.field1767 = var6;
            class18.field496 = var5;
        }
        if (class105.field2558 > 553 && class35.field988 > 205 && class105.field2558 < 743 && class35.field988 < 466) {
            class116.field2863 = 1;
            class58.field1462 = true;
            class35.field1007 = class26.field757 * 15 + 22;
            class119.field2908 = var1;
            int var7 = class35.field988 - 205;
            int var8 = class105.field2558 - var1 / 2 - 553;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 + var4 > 261) {
                var7 = 261 - var4;
            }
            if (var8 < 0) {
                var8 = 0;
            } else if (var1 + var8 > 190) {
                var8 = 190 - var1;
            }
            class18.field496 = var8;
            class69.field1767 = var7;
        }
        if (class105.field2558 <= 17 || class35.field988 <= 357 || class105.field2558 >= 496 || class35.field988 >= 453) {
            return;
        }
        int var9 = class105.field2558 - var1 / 2 - 17;
        class116.field2863 = 2;
        if (var9 < 0) {
            var9 = 0;
        } else if (var1 + var9 > 479) {
            var9 = 479 - var1;
        }
        class58.field1462 = true;
        class18.field496 = var9;
        class35.field1007 = class26.field757 * 15 + 22;
        class119.field2908 = var1;
        int var10 = class35.field988 - 357;
        if (var10 < 0) {
            var10 = 0;
        } else if (var4 + var10 > 96) {
            var10 = 96 - var4;
        }
        class69.field1767 = var10;
    }

    @OriginalMember(owner = "client!pc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 629)
    public final String getParameter(String arg0) {
        field2232++;
        if (class61.field1588 == null) {
            return class113.field2779 == null || class113.field2779.field2712 == this ? super.getParameter(arg0) : class113.field2779.field2712.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 645)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2229++;
    }

    @OriginalMember(owner = "client!pc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 653)
    public final URL getCodeBase() {
        field2253++;
        if (class61.field1588 == null) {
            return class113.field2779 == null || class113.field2779.field2712 == this ? super.getCodeBase() : class113.field2779.field2712.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 676)
    public final void focusLost(FocusEvent arg0) {
        class108.field2601 = false;
        field2252++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;ILjava/net/InetAddress;IIIII)V", line = 685)
    public final void method696(String arg0, int arg1, InetAddress arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 <= 55) {
            return;
        }
        field2239++;
        try {
            class83.field1953 = arg5;
            class3.field115 = arg1;
            class113.field2796 = this;
            class45.field1204 = arg4;
            class61.field1588 = new Frame();
            class61.field1588.setTitle("Jagex");
            class61.field1588.setResizable(false);
            class61.field1588.addWindowListener(this);
            class61.field1588.setVisible(true);
            class61.field1588.toFront();
            Insets var9 = class61.field1588.getInsets();
            class61.field1588.setSize(var9.left + arg4 + var9.right, var9.top + arg1 + var9.bottom);
            class113.field2803 = class113.field2779 = new class110(true, null, arg2, arg6, arg0, arg3);
            class113.field2779.method842(this, (byte) 92, 1);
        } catch (Exception var11) {
            class33.method264(null, var11, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!pc", name = "start", descriptor = "()V", line = 722)
    public final void start() {
        field2251++;
        if (class113.field2796 == this && !class128.field3029) {
            class56.field1434 = 0L;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)I", line = 737)
    public static final int method697(boolean arg0) {
        if (arg0) {
            field2250 = null;
        }
        field2224++;
        return class40.field1112++;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V", line = 750)
    public static void method698(byte arg0) {
        field2258 = null;
        field2257 = null;
        if (arg0 < 6) {
            field2258 = null;
        }
        field2247 = null;
        field2222 = null;
        field2246 = null;
        field2218 = null;
        field2250 = null;
        field2225 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V", line = 769)
    public static final void method699(int arg0, long arg1) {
        field2223++;
        if (arg1 == 0L || arg0 != 29841) {
            return;
        }
        for (int var3 = 0; var3 < class109.field2657; var3++) {
            if (class59.field1477[var3] == arg1) {
                class20.field585 = true;
                class109.field2657--;
                for (int var4 = var3; var4 < class109.field2657; var4++) {
                    class59.field1477[var4] = class59.field1477[var4 + 1];
                }
                class14.field406.method727(82, -113);
                class56.field1432++;
                class14.field406.method344(arg1, -1652311768);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 821)
    public final void windowOpened(WindowEvent arg0) {
        field2217++;
    }

    @OriginalMember(owner = "client!pc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 834)
    public final URL getDocumentBase() {
        field2226++;
        if (class61.field1588 == null) {
            return class113.field2779 == null || class113.field2779.field2712 == this ? super.getDocumentBase() : class113.field2779.field2712.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 854)
    public final void windowIconified(WindowEvent arg0) {
        field2221++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public abstract void method159(int arg0);

    @OriginalMember(owner = "client!pc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public abstract void method160(int arg0);

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public abstract void method158(int arg0);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public abstract void method164(byte arg0);

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
    public abstract void method162(byte arg0);
}
