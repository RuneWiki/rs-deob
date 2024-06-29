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

@OriginalClass("mapview!ma")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Z")
    private boolean field202 = false;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "Lv;")
    public static JagString field201 = class1.method2(255, "Altar");

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lv;")
    public static JagString field206 = class1.method2(255, "Crafting Shop");

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Lv;")
    public static JagString field203 = class1.method2(255, "Combat Training");

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "[B")
    public static byte[] field205;

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "[[Lq;")
    public static WorldmapOverlay[][] field207;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)V", line = 5)
    private final void method78(byte arg0) {
        long var2 = MonotonicTime.method75(-4978);
        long var4 = Linkable.field100[HashTable.field59];
        Linkable.field100[HashTable.field59] = var2;
        if (arg0 != -48) {
            return;
        }
        HashTable.field59 = HashTable.field59 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
        }
        if (Worldmap.field350++ > 50) {
            class18.field162 = true;
            Worldmap.field350 -= 50;
            class18.field167.setSize(BZip2State.field487, GZip.field113);
            class18.field167.setVisible(true);
            if (WorldmapOverlay.field369 == null) {
                class18.field167.setLocation(0, 0);
            } else {
                Insets var6 = WorldmapOverlay.field369.getInsets();
                class18.field167.setLocation(var6.left, var6.top);
            }
        }
        this.method91(false);
    }

    @OriginalMember(owner = "mapview!ma", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 46)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 59)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "run", descriptor = "()V", line = 67)
    public final void run() {
        try {
            if (Signlink.field461 != null) {
                String var1 = Signlink.field461.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Signlink.field457;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method82((byte) -128, "wrongjava");
                        return;
                    }
                    class4.field29 = 5;
                } else if (var1.indexOf("ibm") != -1 && (Signlink.field457 == null || Signlink.field457.equals("1.4.2"))) {
                    this.method82((byte) -121, "wrongjava");
                    return;
                }
            }
            if (MillisTimer.field142.field452 != null) {
                Method var3 = Signlink.field453;
                if (var3 != null) {
                    try {
                        var3.invoke(MillisTimer.field142.field452, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method81(87);
            JagString.field466 = Timer.method193(0, BZip2State.field487, class18.field167, GZip.field113);
            this.method83((byte) 111);
            class18.field164 = StringNode.create((byte) 98);
            class18.field164.init((byte) -49);
            while (Timer.field398 == 0L || Timer.field398 > MonotonicTime.method75(-4978)) {
                JavaMouse.field382 = class18.field164.sleep(class4.field29, 0, Linkable.field93);
                for (int var5 = 0; var5 < JavaMouse.field382; var5++) {
                    this.method87(-28565);
                }
                this.method78((byte) -48);
                JavaMouse.method178(class18.field167, MillisTimer.field142, -51);
            }
        } catch (Exception var8) {
            JagString.method237(-2, null, var8);
            this.method82((byte) -127, "crash");
        }
        this.method90(0);
    }

    @OriginalMember(owner = "mapview!ma", name = "destroy", descriptor = "()V", line = 144)
    public final void destroy() {
        if (HashTable.field68 == this && !JagString.field475) {
            Timer.field398 = MonotonicTime.method75(-4978);
            ByteArray.method55(5000L, (byte) 12);
            GameCanvas.field33 = null;
            this.method90(0);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)V", line = 158)
    public final synchronized void method81(int arg0) {
        Container var2;
        if (WorldmapOverlay.field369 == null) {
            var2 = MillisTimer.field142.field452;
        } else {
            var2 = WorldmapOverlay.field369;
        }
        if (class18.field167 != null) {
            class18.field167.removeFocusListener(this);
            var2.remove(class18.field167);
        }
        if (arg0 <= 56) {
            method85((byte) -17);
        }
        class18.field167 = new GameCanvas(this);
        var2.add(class18.field167);
        class18.field167.setSize(BZip2State.field487, GZip.field113);
        class18.field167.setVisible(true);
        if (WorldmapOverlay.field369 == null) {
            class18.field167.setLocation(0, 0);
        } else {
            Insets var3 = WorldmapOverlay.field369.getInsets();
            class18.field167.setLocation(var3.left, var3.top);
        }
        class18.field167.addFocusListener(this);
        class18.field167.requestFocus();
        class18.field162 = true;
        JavaMouse.field386 = false;
        Timer.field399 = MonotonicTime.method75(-4978);
    }

    @OriginalMember(owner = "mapview!ma", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 197)
    public final String getParameter(String arg0) {
        if (WorldmapOverlay.field369 == null) {
            return MillisTimer.field142 == null || MillisTimer.field142.field452 == this ? super.getParameter(arg0) : MillisTimer.field142.field452.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 211)
    public final void focusGained(FocusEvent arg0) {
        class18.field162 = true;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(BLjava/lang/String;)V", line = 221)
    public final void method82(byte arg0, String arg1) {
        if (this.field202) {
            return;
        }
        this.field202 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var4) {
        }
        if (arg0 > -120) {
            field207 = null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 242)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 247)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "(I)Z", line = 253)
    public final boolean method84(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 21902) {
                field206 = null;
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
                this.method82((byte) -128, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 286)
    public final AppletContext getAppletContext() {
        if (WorldmapOverlay.field369 == null) {
            return MillisTimer.field142 == null || MillisTimer.field142.field452 == this ? super.getAppletContext() : MillisTimer.field142.field452.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 299)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ma", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 306)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ma", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 312)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "(B)B", line = 315)
    public static final byte method85(byte arg0) {
        if (arg0 <= 114) {
            return -14;
        } else if (Timer.field404 == null) {
            return 0;
        } else {
            return Timer.field404[JavaKeyboard.field12];
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 330)
    public final URL getCodeBase() {
        if (WorldmapOverlay.field369 == null) {
            return MillisTimer.field142 == null || MillisTimer.field142.field452 == this ? super.getCodeBase() : MillisTimer.field142.field452.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "start", descriptor = "()V", line = 344)
    public final void start() {
        if (HashTable.field68 == this && !JagString.field475) {
            Timer.field398 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "(I)V", line = 360)
    private final void method87(int arg0) {
        long var2 = MonotonicTime.method75(-4978);
        long var4 = Js5Index.field333[Linkable.field98];
        if (var4 != 0L && var4 >= var2) {
        }
        Js5Index.field333[Linkable.field98] = var2;
        Linkable.field98 = Linkable.field98 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 != -28565) {
                this.method88(-35, -92, -82, -63, 18);
            }
        }
        this.method79(-39);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IIIII)V", line = 390)
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (HashTable.field68 != null) {
                class4.field27++;
                if (class4.field27 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method82((byte) -124, "alreadyloaded");
                return;
            }
            HashTable.field68 = this;
            GZip.field113 = arg3;
            BZip2State.field487 = arg1;
            Timer.field406 = arg4;
            if (MillisTimer.field142 == null) {
                GameCanvas.field33 = MillisTimer.field142 = new Signlink(false, this, arg2, null, 0);
            }
            MillisTimer.field142.method223(this, arg0, -29292);
        } catch (Exception var7) {
            JagString.method237(-2, null, var7);
            this.method82((byte) -123, "crash");
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "providesignlink", descriptor = "(Lu;)V", line = 426)
    public static final void providesignlink(Signlink arg0) {
        MillisTimer.field142 = arg0;
        GameCanvas.field33 = arg0;
    }

    @OriginalMember(owner = "mapview!ma", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 433)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "stop", descriptor = "()V", line = 437)
    public final void stop() {
        if (HashTable.field68 == this && !JagString.field475) {
            Timer.field398 = MonotonicTime.method75(-4978) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 447)
    public final synchronized void paint(Graphics arg0) {
        if (HashTable.field68 != this || JagString.field475) {
            return;
        }
        class18.field162 = true;
        if (Signlink.field457 != null && Signlink.field457.startsWith("1.5") && MonotonicTime.method75(-4978) - Timer.field399 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= BZip2State.field487 && var2.height >= GZip.field113) {
                JavaMouse.field386 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 476)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 482)
    public final URL getDocumentBase() {
        if (WorldmapOverlay.field369 == null) {
            return MillisTimer.field142 == null || MillisTimer.field142.field452 == this ? super.getDocumentBase() : MillisTimer.field142.field452.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "(B)V", line = 506)
    public static final void method89(byte arg0) {
        int var1 = -9 / ((arg0 + 35) / 59);
        if (StringNode.field81 != null) {
            JavaKeyboard var2 = StringNode.field81;
            synchronized (StringNode.field81) {
                StringNode.field81 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "(I)V", line = 520)
    private final synchronized void method90(int arg0) {
        if (JagString.field475) {
            return;
        }
        JagString.field475 = true;
        try {
            if (arg0 != 0) {
                this.field202 = false;
            }
            class18.field167.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method80((byte) 125);
        } catch (Exception var8) {
        }
        if (WorldmapOverlay.field369 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (MillisTimer.field142 != null) {
            try {
                MillisTimer.field142.method224((byte) 72);
            } catch (Exception var6) {
            }
        }
        this.method86(arg0 ^ 0xFFFF9CD9);
    }

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "(I)V", line = 571)
    public static void method92(int arg0) {
        field207 = null;
        field206 = null;
        field201 = null;
        int var1 = 0 / ((arg0 - 74) / 49);
        field205 = null;
        field203 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V")
    public abstract void method79(int arg0);

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(B)V")
    public abstract void method80(byte arg0);

    @OriginalMember(owner = "mapview!ma", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "(B)V")
    public abstract void method83(byte arg0);

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "(I)V")
    public abstract void method86(int arg0);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Z)V")
    public abstract void method91(boolean arg0);
}
