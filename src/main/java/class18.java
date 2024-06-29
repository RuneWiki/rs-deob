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

@OriginalClass("mapview!j")
public abstract class class18 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "Z")
    private boolean field192 = false;

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "[I")
    public static int[] field191 = new int[128];

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "Lea;")
    public static class10 field188 = class3.method8(" ", 104);

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "[I")
    public static int[] field193 = new int[128];

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "Lea;")
    public static class10 field196 = class3.method8("Silk Trader", -64);

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Lea;")
    public static class10 field189 = class3.method8("Enter place name to find", -119);

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Z")
    public static boolean field195 = false;

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "I")
    public static int field194 = 0;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "Z")
    public static boolean field197;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "[[Lr;")
    public static class33[][] field186;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 4)
    private final synchronized void method113(int arg0) {
        if (class6.field34) {
            return;
        }
        class6.field34 = true;
        try {
            class35.field479.removeFocusListener(this);
        } catch (Exception var9) {
        }
        if (arg0 >= -116) {
            field196 = null;
        }
        try {
            this.method115(-117);
        } catch (Exception var8) {
        }
        if (class36.field489 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class21.field223 != null) {
            try {
                class21.field223.method89((byte) 118);
            } catch (Exception var6) {
            }
        }
        this.method123(-1);
    }

    @OriginalMember(owner = "mapview!j", name = "providesignlink", descriptor = "(Lfa;)V", line = 53)
    public static final void providesignlink(class12 arg0) {
        class21.field223 = arg0;
        class34.field454 = arg0;
    }

    @OriginalMember(owner = "mapview!j", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 60)
    public final URL getDocumentBase() {
        if (class36.field489 == null) {
            return class21.field223 == null || class21.field223.field98 == this ? super.getDocumentBase() : class21.field223.field98.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 75)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(B)B", line = 78)
    public static final byte method116(byte arg0) {
        if (arg0 != 98) {
            field191 = null;
        }
        return class14.field164 == null ? 0 : class14.field164[class22.field238];
    }

    @OriginalMember(owner = "mapview!j", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 91)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IIIII)V", line = 95)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class3.field19 != null) {
                mapview.field360++;
                if (mapview.field360 >= 3) {
                    this.method118("alreadyloaded", (byte) -98);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class14.field159 = arg1;
            if (arg2 != 0) {
                method116((byte) 90);
            }
            class4.field27 = arg3;
            class3.field19 = this;
            class6.field36 = arg0;
            if (class21.field223 == null) {
                class34.field454 = class21.field223 = new class12(false, this, arg4, null, 0);
            }
            class21.field223.method86(this, false, 1);
        } catch (Exception var7) {
            class7.method31(true, var7, null);
            this.method118("crash", (byte) -104);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 133)
    public final void method118(String arg0, byte arg1) {
        if (this.field192) {
            return;
        }
        this.field192 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 > -96) {
                field191 = null;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!j", name = "start", descriptor = "()V", line = 155)
    public final void start() {
        if (class3.field19 == this && !class6.field34) {
            mapview.field348 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(I)Z", line = 166)
    public final boolean method119(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 != 48) {
            this.windowClosing(null);
        }
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method118("invalidhost", (byte) -125);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!j", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 203)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 212)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 223)
    public final void focusGained(FocusEvent arg0) {
        class10.field82 = true;
    }

    @OriginalMember(owner = "mapview!j", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 234)
    public final String getParameter(String arg0) {
        if (class36.field489 == null) {
            return class21.field223 == null || class21.field223.field98 == this ? super.getParameter(arg0) : class21.field223.field98.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 251)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 255)
    public final URL getCodeBase() {
        if (class36.field489 == null) {
            return class21.field223 == null || class21.field223.field98 == this ? super.getCodeBase() : class21.field223.field98.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "(I)V", line = 269)
    private final void method120(int arg0) {
        long var2 = class19.method132(14429);
        if (arg0 != 18915) {
            field196 = null;
        }
        long var4 = class40.field515[class8.field66];
        if (var4 != 0L && var4 >= var2) {
        }
        class40.field515[class8.field66] = var2;
        class8.field66 = class8.field66 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method122(117);
    }

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "(I)V", line = 298)
    public static void method121(int arg0) {
        field186 = null;
        field188 = null;
        field189 = null;
        field196 = null;
        if (arg0 < 100) {
            field187 = 27;
        }
        field193 = null;
        field191 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 324)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!j", name = "run", descriptor = "()V", line = 335)
    public final void run() {
        try {
            if (class12.field104 != null) {
                String var1 = class12.field104.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class12.field106;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method118("wrongjava", (byte) -118);
                        return;
                    }
                    class13.field135 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class12.field106 == null || class12.field106.equals("1.4.2"))) {
                    this.method118("wrongjava", (byte) -126);
                    return;
                }
            }
            if (class21.field223.field98 != null) {
                Method var3 = class12.field93;
                if (var3 != null) {
                    try {
                        var3.invoke(class21.field223.field98, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method127((byte) -80);
            class33.field451 = class1.method3((byte) 10, class4.field27, class35.field479, class6.field36);
            this.method129((byte) 107);
            class38.field494 = class22.method153(-12283);
            while (mapview.field348 == 0L || class19.method132(14429) < mapview.field348) {
                class6.field39 = class38.field494.method148((byte) -27, class13.field135, class31.field432);
                for (int var5 = 0; var5 < class6.field39; var5++) {
                    this.method120(18915);
                }
                this.method126(-126);
                class1.method4(class35.field479, (byte) 113, class21.field223);
            }
        } catch (Exception var8) {
            class7.method31(true, var8, null);
            this.method118("crash", (byte) -102);
        }
        this.method113(-122);
    }

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "(I)V", line = 418)
    public static final void method124(int arg0) {
        class39 var1 = class22.field234;
        synchronized (class22.field234) {
            class4.field32 = class33.field445;
            class22.field237 = class11.field92;
            if (arg0 != 1) {
                method125(null, (byte) -67, 34, -91);
            }
            class25.field390 = class39.field505;
            class7.field57 = class13.field114;
            class40.field509 = mapview.field350;
            class2.field9 = mapview.field373;
            class13.field114 = 0;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 443)
    public final AppletContext getAppletContext() {
        if (class36.field489 == null) {
            return class21.field223 == null || class21.field223.field98 == this ? super.getAppletContext() : class21.field223.field98.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "stop", descriptor = "()V", line = 457)
    public final void stop() {
        if (class3.field19 == this && !class6.field34) {
            mapview.field348 = class19.method132(14429) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 468)
    public final synchronized void paint(Graphics arg0) {
        if (class3.field19 != this || class6.field34) {
            return;
        }
        class10.field82 = true;
        if (class12.field106 != null && class12.field106.startsWith("1.5") && class19.method132(14429) - class34.field459 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class6.field36 && var2.height >= class4.field27) {
                mapview.field372 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!j", name = "destroy", descriptor = "()V", line = 498)
    public final void destroy() {
        if (class3.field19 == this && !class6.field34) {
            mapview.field348 = class19.method132(14429);
            class31.method220(5000L, -17164);
            class34.field454 = null;
            this.method113(-125);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([Lea;BII)V", line = 533)
    public static final void method125(class10[] arg0, byte arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            arg0[0].method60(true);
        } else {
            method128(arg3, arg2, (byte) 80, arg0).method60(true);
        }
        if (arg1 != 19) {
            method116((byte) 70);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "(I)V", line = 552)
    private final void method126(int arg0) {
        long var2 = class19.method132(14429);
        long var4 = class40.field506[class25.field391];
        class40.field506[class25.field391] = var2;
        class25.field391 = class25.field391 + 1 & 0x1F;
        if (arg0 > -120) {
            return;
        }
        if (var4 != 0L && var4 < var2) {
        }
        if (class31.field428++ > 50) {
            class10.field82 = true;
            class31.field428 -= 50;
            class35.field479.setSize(class6.field36, class4.field27);
            class35.field479.setVisible(true);
            if (class36.field489 == null) {
                class35.field479.setLocation(0, 0);
            } else {
                Insets var6 = class36.field489.getInsets();
                class35.field479.setLocation(var6.left, var6.top);
            }
        }
        this.method114((byte) 126);
    }

    @OriginalMember(owner = "mapview!j", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 592)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 596)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!j", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 604)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(B)V", line = 610)
    public final synchronized void method127(byte arg0) {
        Container var2;
        if (class36.field489 == null) {
            var2 = class21.field223.field98;
        } else {
            var2 = class36.field489;
        }
        if (class35.field479 != null) {
            class35.field479.removeFocusListener(this);
            var2.remove(class35.field479);
        }
        class35.field479 = new class25(this);
        var2.add(class35.field479);
        class35.field479.setSize(class6.field36, class4.field27);
        class35.field479.setVisible(true);
        if (class36.field489 == null) {
            class35.field479.setLocation(0, 0);
        } else {
            Insets var3 = class36.field489.getInsets();
            class35.field479.setLocation(var3.left, var3.top);
        }
        class35.field479.addFocusListener(this);
        class35.field479.requestFocus();
        int var4 = -84 / ((6 - arg0) / 62);
        class10.field82 = true;
        mapview.field372 = false;
        class34.field459 = class19.method132(14429);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IIB[Lea;)Lea;", line = 648)
    public static final class10 method128(int arg0, int arg1, byte arg2, class10[] arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg0 + var5] == null) {
                arg3[arg0 + var5] = class4.field30;
            }
            var4 += arg3[arg0 + var5].field83;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class10 var9 = arg3[arg0 + var8];
            class26.method197(var9.field78, 0, var6, var7, var9.field83);
            var7 += var9.field83;
        }
        if (arg2 <= 29) {
            return (class10) null;
        } else {
            class10 var10 = new class10();
            var10.field83 = var4;
            var10.field78 = var6;
            return var10;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)V")
    public abstract void method114(byte arg0);

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)V")
    public abstract void method115(int arg0);

    @OriginalMember(owner = "mapview!j", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "(I)V")
    public abstract void method122(int arg0);

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "(I)V")
    public abstract void method123(int arg0);

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "(B)V")
    public abstract void method129(byte arg0);
}
