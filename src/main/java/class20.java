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

@OriginalClass("mapview!ka")
public abstract class class20 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Z")
    private boolean field251 = false;

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Lt;")
    public static class36 field249 = class3.method8(13631, "Water Source");

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Lra;")
    public static class33 field248 = new class33();

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "Lt;")
    public static class36 field255 = class3.method8(13631, "Windmill");

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Lt;")
    public static class36 field256 = class3.method8(13631, "Requesting");

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Lda;")
    public static class7 field258;

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "Z")
    public static boolean field259;

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "[B")
    public static byte[] field252;

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "[I")
    public static int[] field257;

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "[[[I")
    public static int[][][] field253;

    @OriginalMember(owner = "mapview!ka", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 4)
    public final URL getDocumentBase() {
        if (class21.field264 == null) {
            return class15.field177 == null || class15.field177.field155 == this ? super.getDocumentBase() : class15.field177.field155.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 21)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ka", name = "stop", descriptor = "()V", line = 27)
    public final void stop() {
        if (class3.field27 == this && !class36.field497) {
            class29.field424 = class9.method37((byte) -113) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 38)
    public final void method109(String arg0, boolean arg1) {
        if (this.field251) {
            return;
        }
        this.field251 = arg1;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 58)
    public final void focusGained(FocusEvent arg0) {
        class4.field33 = true;
    }

    @OriginalMember(owner = "mapview!ka", name = "start", descriptor = "()V", line = 66)
    public final void start() {
        if (class3.field27 == this && !class36.field497) {
            class29.field424 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "destroy", descriptor = "()V", line = 78)
    public final void destroy() {
        if (class3.field27 == this && !class36.field497) {
            class29.field424 = class9.method37((byte) -85);
            mapview.method140(5000L, 124);
            class28.field412 = null;
            this.method117(0);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "providesignlink", descriptor = "(Lfa;)V", line = 92)
    public static final void providesignlink(class11 arg0) {
        class15.field177 = arg0;
        class28.field412 = arg0;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Z)V", line = 100)
    public final synchronized void method110(boolean arg0) {
        Container var2;
        if (class21.field264 == null) {
            var2 = class15.field177.field155;
        } else {
            var2 = class21.field264;
        }
        if (class41.field544 != null) {
            class41.field544.removeFocusListener(this);
            var2.remove(class41.field544);
        }
        class41.field544 = new class26(this);
        var2.add(class41.field544);
        class41.field544.setSize(field250, field254);
        class41.field544.setVisible(true);
        if (class21.field264 == null) {
            class41.field544.setLocation(0, 0);
        } else {
            Insets var3 = class21.field264.getInsets();
            class41.field544.setLocation(var3.left, var3.top);
        }
        class41.field544.addFocusListener(this);
        class41.field544.requestFocus();
        class4.field33 = true;
        class27.field408 = arg0;
        class40.field524 = class9.method37((byte) -118);
    }

    @OriginalMember(owner = "mapview!ka", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 137)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 141)
    public static final void method112(int arg0) {
        if (class8.field88[0][class1.field7][class2.field10] == null) {
            field252 = null;
        } else {
            field252 = class8.field88[0][class1.field7][class2.field10];
        }
        if (class8.field88[1][class1.field7][class2.field10] == null) {
            class9.field95 = null;
        } else {
            class9.field95 = class8.field88[1][class1.field7][class2.field10];
        }
        if (class8.field88[2][class1.field7][class2.field10] == null) {
            class3.field22 = null;
        } else {
            class3.field22 = class8.field88[2][class1.field7][class2.field10];
        }
        if (class8.field88[3][class1.field7][class2.field10] == null) {
            class40.field529 = null;
        } else {
            class40.field529 = class8.field88[3][class1.field7][class2.field10];
        }
        if (class8.field88[4][class1.field7][class2.field10] == null) {
            class35.field487 = null;
        } else {
            class35.field487 = class8.field88[4][class1.field7][class2.field10];
        }
        if (class9.field94[class1.field7][class2.field10] == null) {
            class8.field89 = null;
        } else {
            class8.field89 = class9.field94[class1.field7][class2.field10];
        }
        if (arg0 != -4) {
            field255 = null;
        }
        if (class4.field39[class1.field7][class2.field10] == null) {
            class22.field274 = null;
        } else {
            class22.field274 = class4.field39[class1.field7][class2.field10];
        }
        if (field253[class1.field7][class2.field10] == null) {
            class33.field459 = null;
        } else {
            class33.field459 = field253[class1.field7][class2.field10];
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 192)
    public final synchronized void paint(Graphics arg0) {
        if (class3.field27 != this || class36.field497) {
            return;
        }
        class4.field33 = true;
        if (class11.field157 != null && class11.field157.startsWith("1.5") && class9.method37((byte) -54) - class40.field524 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= field250 && var2.height >= field254) {
                class27.field408 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 221)
    public final String getParameter(String arg0) {
        if (class21.field264 == null) {
            return class15.field177 == null || class15.field177.field155 == this ? super.getParameter(arg0) : class15.field177.field155.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 238)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ka", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 240)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ka", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 247)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ka", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 251)
    public final AppletContext getAppletContext() {
        if (class21.field264 == null) {
            return class15.field177 == null || class15.field177.field155 == this ? super.getAppletContext() : class15.field177.field155.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 266)
    private final void method114(byte arg0) {
        if (arg0 < 1) {
            field256 = null;
        }
        long var2 = class9.method37((byte) -89);
        long var4 = mapview.field322[class32.field452];
        mapview.field322[class32.field452] = var2;
        class32.field452 = class32.field452 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
        }
        synchronized (this) {
            ;
        }
        this.method115((byte) 62);
    }

    @OriginalMember(owner = "mapview!ka", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 295)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ka", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 303)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "(I)V", line = 311)
    private final synchronized void method117(int arg0) {
        if (class36.field497) {
            return;
        }
        class36.field497 = true;
        try {
            class41.field544.removeFocusListener(this);
            if (arg0 != 0) {
                field249 = null;
            }
        } catch (Exception var9) {
        }
        try {
            this.method111(false);
        } catch (Exception var8) {
        }
        if (class21.field264 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class15.field177 != null) {
            try {
                class15.field177.method60(-2);
            } catch (Exception var6) {
            }
        }
        this.method120((byte) -120);
    }

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "(Z)V", line = 363)
    private final void method118(boolean arg0) {
        long var2 = class9.method37((byte) -78);
        long var4 = class41.field540[class15.field178];
        class41.field540[class15.field178] = var2;
        class15.field178 = class15.field178 + 1 & 0x1F;
        if (var4 != 0L && var2 <= var4) {
        }
        if (!arg0) {
            this.field251 = true;
        }
        if (mapview.field311++ > 50) {
            mapview.field311 -= 50;
            class4.field33 = true;
            class41.field544.setSize(field250, field254);
            class41.field544.setVisible(true);
            if (class21.field264 == null) {
                class41.field544.setLocation(0, 0);
            } else {
                Insets var6 = class21.field264.getInsets();
                class41.field544.setLocation(var6.left, var6.top);
            }
        }
        this.method116(450);
    }

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "(I)Z", line = 406)
    public final boolean method119(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 > -87) {
                field250 = -86;
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
                this.method109("invalidhost", true);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "run", descriptor = "()V", line = 439)
    public final void run() {
        try {
            if (class11.field150 != null) {
                String var1 = class11.field150.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class11.field157;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method109("wrongjava", true);
                        return;
                    }
                    class40.field530 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class11.field157 == null || class11.field157.equals("1.4.2"))) {
                    this.method109("wrongjava", true);
                    return;
                }
            }
            if (class15.field177.field155 != null) {
                Method var3 = class11.field152;
                if (var3 != null) {
                    try {
                        var3.invoke(class15.field177.field155, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method110(false);
            class2.field9 = class2.method4(class41.field544, (byte) -50, field254, field250);
            this.method113(-15);
            class15.field184 = class14.method84(false);
            while (class29.field424 == 0L || class9.method37((byte) -66) < class29.field424) {
                class35.field483 = class15.field184.method182(false, class26.field391, class40.field530);
                for (int var5 = 0; var5 < class35.field483; var5++) {
                    this.method114((byte) 75);
                }
                this.method118(true);
                class40.method260(class15.field177, true, class41.field544);
            }
        } catch (Exception var8) {
            class34.method191(null, var8, -127);
            this.method109("crash", true);
        }
        this.method117(0);
    }

    @OriginalMember(owner = "mapview!ka", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 522)
    public final URL getCodeBase() {
        if (class21.field264 == null) {
            return class15.field177 == null || class15.field177.field155 == this ? super.getCodeBase() : class15.field177.field155.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "(I)V", line = 538)
    public static void method121(int arg0) {
        field258 = null;
        field257 = null;
        field256 = null;
        field255 = null;
        field248 = null;
        field249 = null;
        field253 = null;
        if (arg0 != -32306) {
            providesignlink(null);
        }
        field252 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IIBII)V", line = 557)
    public final void method122(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            if (class3.field27 != null) {
                class2.field17++;
                if (class2.field17 >= 3) {
                    this.method109("alreadyloaded", true);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field254 = arg0;
            class1.field5 = arg4;
            class3.field27 = this;
            if (arg2 != 5) {
                field255 = null;
            }
            field250 = arg1;
            if (class15.field177 == null) {
                class28.field412 = class15.field177 = new class11(false, this, arg3, null, 0);
            }
            class15.field177.method66(2, this, 1);
        } catch (Exception var7) {
            class34.method191(null, var7, arg2 - 104);
            this.method109("crash", true);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 594)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ka", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 596)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(Z)V")
    public abstract void method111(boolean arg0);

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(I)V")
    public abstract void method113(int arg0);

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(B)V")
    public abstract void method115(byte arg0);

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "(I)V")
    public abstract void method116(int arg0);

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "(B)V")
    public abstract void method120(byte arg0);

    @OriginalMember(owner = "mapview!ka", name = "init", descriptor = "()V")
    public abstract void init();
}
