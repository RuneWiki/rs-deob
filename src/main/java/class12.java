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

@OriginalClass("mapview!h")
public abstract class class12 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Z")
    private boolean field100 = false;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Lia;")
    public static class15 field99 = class28.method196("underlay)3dat", false);

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "I")
    public static int field102 = 0;

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "Lt;")
    public static class36 field105 = new class36();

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Ld;")
    public static class6 field101;

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "Ljava/lang/String;")
    public static String field104;

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "Z")
    public static boolean field106;

    @OriginalMember(owner = "mapview!h", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 5)
    public final AppletContext getAppletContext() {
        if (class27.field398 == null) {
            return class15.field154 == null || class15.field154.field131 == this ? super.getAppletContext() : class15.field154.field131.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 18)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 30)
    public final String getParameter(String arg0) {
        if (class27.field398 == null) {
            return class15.field154 == null || class15.field154.field131 == this ? super.getParameter(arg0) : class15.field154.field131.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 53)
    public final URL getCodeBase() {
        if (class27.field398 == null) {
            return class15.field154 == null || class15.field154.field131 == this ? super.getCodeBase() : class15.field154.field131.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "destroy", descriptor = "()V", line = 68)
    public final void destroy() {
        if (class13.field114 == this && !class28.field402) {
            class26.field372 = class5.method24((byte) 108);
            class2.method15(5000L, 114);
            class6.field52 = null;
            this.method62(false);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 80)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 82)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 89)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 93)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)V", line = 100)
    public static void method60(int arg0) {
        field101 = null;
        field105 = null;
        field99 = null;
        field104 = null;
        if (arg0 > -99) {
            field103 = 63;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "run", descriptor = "()V", line = 115)
    public final void run() {
        try {
            if (class14.field139 != null) {
                String var1 = class14.field139.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class14.field138;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method68("wrongjava", 1);
                        return;
                    }
                    class10.field89 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class14.field138 == null || class14.field138.equals("1.4.2"))) {
                    this.method68("wrongjava", 1);
                    return;
                }
            }
            if (class15.field154.field131 != null) {
                Method var3 = class14.field123;
                if (var3 != null) {
                    try {
                        var3.invoke(class15.field154.field131, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method67(1);
            class29.field411 = class33.method228(true, class25.field361, class3.field32, class25.field362);
            this.method66(-108);
            class10.field93 = class20.method147((byte) -126);
            while (class26.field372 == 0L || class26.field372 > class5.method24((byte) 33)) {
                class30.field424 = class10.field93.method48(class10.field89, class6.field56, -122);
                for (int var5 = 0; var5 < class30.field424; var5++) {
                    this.method71(64);
                }
                this.method69((byte) 110);
                class18.method139(class3.field32, -51, class15.field154);
            }
        } catch (Exception var8) {
            class17.method134(var8, 10506, null);
            this.method68("crash", 1);
        }
        this.method62(false);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)V", line = 202)
    private final synchronized void method62(boolean arg0) {
        if (class28.field402) {
            return;
        }
        class28.field402 = true;
        try {
            class3.field32.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method59(-85);
            if (arg0) {
                field105 = null;
            }
        } catch (Exception var8) {
        }
        if (class27.field398 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class15.field154 != null) {
            try {
                class15.field154.method91(-29111);
            } catch (Exception var6) {
            }
        }
        this.method72((byte) 95);
    }

    @OriginalMember(owner = "mapview!h", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 257)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(IIIII)V", line = 265)
    public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class13.field114 != null) {
                class39.field512++;
                if (class39.field512 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method68("alreadyloaded", 1);
                return;
            }
            class25.field362 = arg2;
            class17.field177 = arg0;
            if (arg4 >= -83) {
                field99 = null;
            }
            class25.field361 = arg1;
            class13.field114 = this;
            if (class15.field154 == null) {
                class6.field52 = class15.field154 = new class14(false, this, arg3, null, 0);
            }
            class15.field154.method92(1, (byte) 91, this);
        } catch (Exception var7) {
            class17.method134(var7, 10506, null);
            this.method68("crash", 1);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "providesignlink", descriptor = "(Li;)V", line = 303)
    public static final void providesignlink(class14 arg0) {
        class15.field154 = arg0;
        class6.field52 = arg0;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B[B)[B", line = 312)
    public static final byte[] method64(byte arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 < 117) {
            return (byte[]) null;
        } else {
            class23.method154(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "(I)V", line = 333)
    public final synchronized void method67(int arg0) {
        Container var2;
        if (class27.field398 == null) {
            var2 = class15.field154.field131;
        } else {
            var2 = class27.field398;
        }
        if (arg0 != 1) {
            this.field100 = false;
        }
        if (class3.field32 != null) {
            class3.field32.removeFocusListener(this);
            var2.remove(class3.field32);
        }
        class3.field32 = new class33(this);
        var2.add(class3.field32);
        class3.field32.setSize(class25.field362, class25.field361);
        class3.field32.setVisible(true);
        if (class27.field398 == null) {
            class3.field32.setLocation(0, 0);
        } else {
            Insets var3 = class27.field398.getInsets();
            class3.field32.setLocation(var3.left, var3.top);
        }
        class3.field32.addFocusListener(this);
        class3.field32.requestFocus();
        class21.field238 = true;
        mapview.field272 = false;
        class33.field473 = class5.method24((byte) 96);
    }

    @OriginalMember(owner = "mapview!h", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 375)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 377)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 380)
    public final void method68(String arg0, int arg1) {
        if (this.field100) {
            return;
        }
        this.field100 = true;
        if (arg1 != 1) {
            field99 = null;
        }
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!h", name = "start", descriptor = "()V", line = 401)
    public final void start() {
        if (class13.field114 == this && !class28.field402) {
            class26.field372 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)V", line = 413)
    private final void method69(byte arg0) {
        long var2 = class5.method24((byte) 123);
        if (arg0 <= 92) {
            field99 = null;
        }
        long var4 = class17.field174[class39.field516];
        if (var4 != 0L && var4 >= var2) {
        }
        class17.field174[class39.field516] = var2;
        class39.field516 = class39.field516 + 1 & 0x1F;
        if (class6.field49++ > 50) {
            class6.field49 -= 50;
            class21.field238 = true;
            class3.field32.setSize(class25.field362, class25.field361);
            class3.field32.setVisible(true);
            if (class27.field398 == null) {
                class3.field32.setLocation(0, 0);
            } else {
                Insets var6 = class27.field398.getInsets();
                class3.field32.setLocation(var6.left, var6.top);
            }
        }
        this.method65(635);
    }

    @OriginalMember(owner = "mapview!h", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 458)
    public final void focusGained(FocusEvent arg0) {
        class21.field238 = true;
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(Z)V", line = 467)
    public static final void method70(boolean arg0) {
        if (class27.field384 != null) {
            class39 var1 = class27.field384;
            synchronized (class27.field384) {
                class27.field384 = null;
            }
        }
        if (arg0) {
            method70(true);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 486)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!h", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 489)
    public final synchronized void paint(Graphics arg0) {
        if (class13.field114 != this || class28.field402) {
            return;
        }
        class21.field238 = true;
        if (class14.field138 != null && class14.field138.startsWith("1.5") && class5.method24((byte) 19) - class33.field473 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class25.field362 <= var2.width && class25.field361 <= var2.height) {
                mapview.field272 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "stop", descriptor = "()V", line = 513)
    public final void stop() {
        if (class13.field114 == this && !class28.field402) {
            class26.field372 = class5.method24((byte) 92) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 523)
    public final URL getDocumentBase() {
        if (class27.field398 == null) {
            return class15.field154 == null || class15.field154.field131 == this ? super.getDocumentBase() : class15.field154.field131.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "(I)V", line = 543)
    private final void method71(int arg0) {
        long var2 = class5.method24((byte) 70);
        long var4 = class19.field199[class31.field436];
        class19.field199[class31.field436] = var2;
        if (var4 != 0L && var4 < var2) {
        }
        class31.field436 = class31.field436 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method61(503);
        if (arg0 < 46) {
            field103 = -111;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(Z)Z", line = 573)
    public final boolean method73(boolean arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else if (arg0) {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method68("invalidhost", 1);
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)V")
    public abstract void method59(int arg0);

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(I)V")
    public abstract void method61(int arg0);

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "(I)V")
    public abstract void method65(int arg0);

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "(I)V")
    public abstract void method66(int arg0);

    @OriginalMember(owner = "mapview!h", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(B)V")
    public abstract void method72(byte arg0);
}
