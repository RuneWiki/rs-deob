import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
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

@OriginalClass("mapview!p")
public abstract class class30 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Z")
    private boolean field447 = false;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "[[[[B")
    public static byte[][][][] field444 = new byte[5][][][];

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Lta;")
    public static class37 field443 = class20.method87(-126, "Tannery");

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Lta;")
    public static class37 field446 = class20.method87(-102, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lta;")
    public static class37 field448 = class20.method87(-85, "overlay)3dat");

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "I")
    public static int field450 = 0;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "Lta;")
    public static class37 field449 = class20.method87(-112, "Sword Shop");

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "Z")
    public static boolean field451;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "[Lta;")
    public static class37[] field442;

    @OriginalMember(owner = "mapview!p", name = "run", descriptor = "()V", line = 6)
    public final void run() {
        try {
            if (class3.field23 != null) {
                String var1 = class3.field23.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class3.field35;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method177("wrongjava", (byte) 29);
                        return;
                    }
                    class6.field68 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class3.field35 == null || class3.field35.equals("1.4.2"))) {
                    this.method177("wrongjava", (byte) 29);
                    return;
                }
            }
            if (class15.field159.field36 != null) {
                Method var3 = class3.field30;
                if (var3 != null) {
                    try {
                        var3.invoke(class15.field159.field36, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method180(0);
            class37.field508 = class26.method164(class26.field428, (byte) 99, class25.field312, mapview.field320);
            this.method163(77);
            class7.field87 = class35.method203((byte) 50);
            while (mapview.field408 == 0L || mapview.field408 > class2.method3((byte) 88)) {
                class27.field438 = class7.field87.method17(class4.field46, -106, class6.field68);
                for (int var5 = 0; var5 < class27.field438; var5++) {
                    this.method179(-33);
                }
                this.method174((byte) -127);
                class11.method46((byte) -114, class15.field159, mapview.field320);
            }
        } catch (Exception var8) {
            class41.method266((byte) -97, null, var8);
            this.method177("crash", (byte) 29);
        }
        this.method182(0);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V", line = 87)
    private final void method174(byte arg0) {
        long var2 = class2.method3((byte) 86);
        if (arg0 >= -123) {
            field446 = null;
        }
        long var4 = class23.field252[class7.field80];
        if (var4 != 0L && var2 > var4) {
        }
        class23.field252[class7.field80] = var2;
        class7.field80 = class7.field80 + 1 & 0x1F;
        if (class36.field490++ > 50) {
            class14.field155 = true;
            class36.field490 -= 50;
            mapview.field320.setSize(class25.field312, class26.field428);
            mapview.field320.setVisible(true);
            if (class41.field537 == null) {
                mapview.field320.setLocation(0, 0);
            } else {
                Insets var6 = class41.field537.getInsets();
                mapview.field320.setLocation(var6.left, var6.top);
            }
        }
        this.method155(110);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ILfa;II)Z", line = 131)
    public static final boolean method175(int arg0, class11 arg1, int arg2, int arg3) {
        byte[] var4 = arg1.method47(91, arg3, arg0);
        if (arg2 != 0) {
            return true;
        } else if (var4 == null) {
            return false;
        } else {
            class8.method36((byte) 108, var4);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 153)
    public final URL getDocumentBase() {
        if (class41.field537 == null) {
            return class15.field159 == null || class15.field159.field36 == this ? super.getDocumentBase() : class15.field159.field36.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "destroy", descriptor = "()V", line = 168)
    public final void destroy() {
        if (class41.field538 == this && !class25.field305) {
            mapview.field408 = class2.method3((byte) 84);
            method183(5000L, 1000);
            class4.field42 = null;
            this.method182(0);
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IIBII)V", line = 184)
    public final void method176(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            if (class41.field538 != null) {
                class12.field145++;
                if (class12.field145 >= 3) {
                    this.method177("alreadyloaded", (byte) 29);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class41.field538 = this;
            if (arg2 != -126) {
                this.destroy();
            }
            class41.field542 = arg3;
            class26.field428 = arg0;
            class25.field312 = arg4;
            if (class15.field159 == null) {
                class4.field42 = class15.field159 = new class3(false, this, arg1, null, 0);
            }
            class15.field159.method9(1, this, (byte) 102);
        } catch (Exception var7) {
            class41.method266((byte) -97, null, var7);
            this.method177("crash", (byte) 29);
        }
    }

    @OriginalMember(owner = "mapview!p", name = "providesignlink", descriptor = "(Lba;)V", line = 222)
    public static final void providesignlink(class3 arg0) {
        class15.field159 = arg0;
        class4.field42 = arg0;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 229)
    public final void method177(String arg0, byte arg1) {
        if (this.field447) {
            return;
        }
        this.field447 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
            if (arg1 != 29) {
                this.paint(null);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)Z", line = 255)
    public final boolean method178(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 != -1) {
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
                this.method177("invalidhost", (byte) 29);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 292)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 296)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 303)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)V", line = 315)
    private final void method179(int arg0) {
        long var2 = class2.method3((byte) 89);
        if (arg0 != -33) {
            field448 = null;
        }
        long var4 = class21.field236[class37.field501];
        class21.field236[class37.field501] = var2;
        if (var4 != 0L && var2 > var4) {
        }
        class37.field501 = class37.field501 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method162(arg0 + 49);
    }

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "(I)V", line = 350)
    public final synchronized void method180(int arg0) {
        Container var2;
        if (class41.field537 == null) {
            var2 = class15.field159.field36;
        } else {
            var2 = class41.field537;
        }
        if (mapview.field320 != null) {
            mapview.field320.removeFocusListener(this);
            var2.remove(mapview.field320);
        }
        mapview.field320 = new class23(this);
        var2.add(mapview.field320);
        if (arg0 != 0) {
            this.field447 = false;
        }
        mapview.field320.setSize(class25.field312, class26.field428);
        mapview.field320.setVisible(true);
        if (class41.field537 == null) {
            mapview.field320.setLocation(0, 0);
        } else {
            Insets var3 = class41.field537.getInsets();
            mapview.field320.setLocation(var3.left, var3.top);
        }
        mapview.field320.addFocusListener(this);
        mapview.field320.requestFocus();
        class14.field155 = true;
        mapview.field412 = false;
        class36.field495 = class2.method3((byte) 80);
    }

    @OriginalMember(owner = "mapview!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 391)
    public final void focusGained(FocusEvent arg0) {
        class14.field155 = true;
    }

    @OriginalMember(owner = "mapview!p", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 399)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "(I)B", line = 402)
    public static final byte method181(int arg0) {
        if (arg0 <= 24) {
            field448 = null;
        }
        return class12.field143 == null ? 0 : class12.field143[class11.field127];
    }

    @OriginalMember(owner = "mapview!p", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 417)
    public final URL getCodeBase() {
        if (class41.field537 == null) {
            return class15.field159 == null || class15.field159.field36 == this ? super.getCodeBase() : class15.field159.field36.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "(I)V", line = 440)
    private final synchronized void method182(int arg0) {
        if (class25.field305) {
            return;
        }
        class25.field305 = true;
        try {
            mapview.field320.removeFocusListener(this);
            if (arg0 != 0) {
                field445 = 87;
            }
        } catch (Exception var9) {
        }
        try {
            this.method156(-69);
        } catch (Exception var8) {
        }
        if (class41.field537 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class15.field159 != null) {
            try {
                class15.field159.method6(false);
            } catch (Exception var6) {
            }
        }
        this.method158((byte) -99);
    }

    @OriginalMember(owner = "mapview!p", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 491)
    public final AppletContext getAppletContext() {
        if (class41.field537 == null) {
            return class15.field159 == null || class15.field159.field36 == this ? super.getAppletContext() : class15.field159.field36.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 504)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 516)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(JI)V", line = 523)
    public static final void method183(long arg0, int arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class4.method15(-9608, arg0 - 1L);
            class4.method15(-9608, 1L);
        } else {
            class4.method15(-9608, arg0);
        }
        if (arg1 != 1000) {
            method181(-41);
        }
    }

    @OriginalMember(owner = "mapview!p", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 543)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z)V", line = 552)
    public static void method184(boolean arg0) {
        field444 = null;
        field449 = null;
        if (!arg0) {
            field450 = 122;
        }
        field448 = null;
        field443 = null;
        field442 = null;
        field446 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 572)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "start", descriptor = "()V", line = 581)
    public final void start() {
        if (class41.field538 == this && !class25.field305) {
            mapview.field408 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 591)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!p", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 598)
    public final String getParameter(String arg0) {
        if (class41.field537 == null) {
            return class15.field159 == null || class15.field159.field36 == this ? super.getParameter(arg0) : class15.field159.field36.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 613)
    public final synchronized void paint(Graphics arg0) {
        if (class41.field538 != this || class25.field305) {
            return;
        }
        class14.field155 = true;
        if (class3.field35 != null && class3.field35.startsWith("1.5") && class2.method3((byte) 95) - class36.field495 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class25.field312 <= var2.width && var2.height >= class26.field428) {
                mapview.field412 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "stop", descriptor = "()V", line = 645)
    public final void stop() {
        if (class41.field538 == this && !class25.field305) {
            mapview.field408 = class2.method3((byte) 101) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "(I)V")
    public abstract void method163(int arg0);

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "(I)V")
    public abstract void method156(int arg0);

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(B)V")
    public abstract void method158(byte arg0);

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "(I)V")
    public abstract void method155(int arg0);

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "(I)V")
    public abstract void method162(int arg0);
}
