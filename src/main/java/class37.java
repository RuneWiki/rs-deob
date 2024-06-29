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

@OriginalClass("mapview!ta")
public abstract class class37 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "Z")
    private boolean field504 = false;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "Ls;")
    public static class34 field503 = class9.method35("Estate Agent", 220);

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "I")
    public static volatile int field506 = 0;

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "[Z")
    public static boolean[] field505 = new boolean[112];

    @OriginalMember(owner = "mapview!ta", name = "e", descriptor = "Ls;")
    public static class34 field507 = class9.method35("Farming shop", 220);

    @OriginalMember(owner = "mapview!ta", name = "f", descriptor = "Ls;")
    public static class34 field508 = class9.method35("map", 220);

    @OriginalMember(owner = "mapview!ta", name = "g", descriptor = "Z")
    public static boolean field509;

    @OriginalMember(owner = "mapview!ta", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ta", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 8)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ta", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 11)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "(I)V", line = 18)
    public static void method252(int arg0) {
        field505 = null;
        if (arg0 != 0) {
            providesignlink(null);
        }
        field503 = null;
        field507 = null;
        field508 = null;
    }

    @OriginalMember(owner = "mapview!ta", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 31)
    public final URL getDocumentBase() {
        if (class39.field525 == null) {
            return class14.field129 == null || class14.field129.field459 == this ? super.getDocumentBase() : class14.field129.field459.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 50)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ta", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 63)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!ta", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 71)
    public final String getParameter(String arg0) {
        if (class39.field525 == null) {
            return class14.field129 == null || class14.field129.field459 == this ? super.getParameter(arg0) : class14.field129.field459.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 85)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ta", name = "run", descriptor = "()V", line = 90)
    public final void run() {
        try {
            if (class32.field463 != null) {
                String var1 = class32.field463.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class32.field454;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method256(127, "wrongjava");
                        return;
                    }
                    class29.field394 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class32.field454 == null || class32.field454.equals("1.4.2"))) {
                    this.method256(73, "wrongjava");
                    return;
                }
            }
            if (class14.field129.field459 != null) {
                Method var3 = class32.field457;
                if (var3 != null) {
                    try {
                        var3.invoke(class14.field129.field459, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method253((byte) -86);
            class19.field168 = class10.method43(class25.field261, class9.field80, (byte) -122, class38.field510);
            this.method148(106);
            class9.field81 = class27.method182(-101);
            while (class22.field217 == 0L || class22.method115((byte) 105) < class22.field217) {
                class19.field173 = class9.field81.method18(class29.field394, 1000, class8.field59);
                for (int var5 = 0; var5 < class19.field173; var5++) {
                    this.method257(-43);
                }
                this.method260(true);
                class14.method61(86, class9.field80, class14.field129);
            }
        } catch (Exception var8) {
            class9.method36(true, var8, null);
            this.method256(93, "crash");
        }
        this.method261((byte) 87);
    }

    @OriginalMember(owner = "mapview!ta", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 169)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(B)V", line = 175)
    public final synchronized void method253(byte arg0) {
        Container var2;
        if (class39.field525 == null) {
            var2 = class14.field129.field459;
        } else {
            var2 = class39.field525;
        }
        if (class9.field80 != null) {
            class9.field80.removeFocusListener(this);
            var2.remove(class9.field80);
        }
        class9.field80 = new class7(this);
        var2.add(class9.field80);
        class9.field80.setSize(class38.field510, class25.field261);
        class9.field80.setVisible(true);
        if (class39.field525 == null) {
            class9.field80.setLocation(0, 0);
        } else {
            Insets var3 = class39.field525.getInsets();
            class9.field80.setLocation(var3.left, var3.top);
        }
        class9.field80.addFocusListener(this);
        if (arg0 != -86) {
            field506 = 27;
        }
        class9.field80.requestFocus();
        class24.field239 = true;
        class9.field87 = false;
        class25.field262 = class22.method115((byte) 108);
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "([BI)V", line = 216)
    public static final void method254(byte[] arg0, int arg1) {
        class29 var2 = new class29(arg0);
        var2.field392 = arg0.length - 2;
        class9.field94 = var2.method192((byte) -123);
        class9.field91 = new byte[class9.field94][];
        mapview.field293 = new int[class9.field94];
        class28.field383 = new int[class9.field94];
        class14.field128 = new int[class9.field94];
        class34.field468 = new int[class9.field94];
        var2.field392 = arg0.length - class9.field94 * 8 - 7;
        class34.field464 = var2.method192((byte) -71);
        class26.field361 = var2.method192((byte) -24);
        int var3 = (var2.method197(3) & 0xFF) + 1;
        for (int var4 = 0; var4 < class9.field94; var4++) {
            class14.field128[var4] = var2.method192((byte) 113);
        }
        for (int var5 = 0; var5 < class9.field94; var5++) {
            class34.field468[var5] = var2.method192((byte) 74);
        }
        for (int var6 = 0; var6 < class9.field94; var6++) {
            class28.field383[var6] = var2.method192((byte) -52);
        }
        for (int var7 = 0; var7 < class9.field94; var7++) {
            mapview.field293[var7] = var2.method192((byte) -116);
        }
        var2.field392 = arg0.length - class9.field94 * 8 - (var3 - 1) * 3 - 7;
        class27.field377 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class27.field377[var8] = var2.method200(-56);
            if (class27.field377[var8] == 0) {
                class27.field377[var8] = 1;
            }
        }
        var2.field392 = 0;
        for (int var9 = arg1; var9 < class9.field94; var9++) {
            int var10 = class28.field383[var9];
            int var11 = mapview.field293[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class9.field91[var9] = var13;
            int var14 = var2.method197(3);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method194((byte) 65);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var15 + var10 * var16] = var2.method194((byte) 65);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(B[B)Lr;", line = 331)
    public static final class33 method255(byte arg0, byte[] arg1) {
        if (arg1 == null) {
            return null;
        } else if (arg0 >= -23) {
            return (class33) null;
        } else {
            class33 var2 = new class33(arg1, class14.field128, class34.field468, class28.field383, mapview.field293, class27.field377, class9.field91);
            class30.method202((byte) -82);
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "providesignlink", descriptor = "(Lq;)V", line = 351)
    public static final void providesignlink(class32 arg0) {
        class14.field129 = arg0;
        class6.field46 = arg0;
    }

    @OriginalMember(owner = "mapview!ta", name = "destroy", descriptor = "()V", line = 358)
    public final void destroy() {
        if (class35.field482 == this && !class9.field89) {
            class22.field217 = class22.method115((byte) 111);
            class26.method164(5000L, (byte) 2);
            class6.field46 = null;
            this.method261((byte) 87);
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(ILjava/lang/String;)V", line = 373)
    public final void method256(int arg0, String arg1) {
        if (this.field504) {
            return;
        }
        this.field504 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 <= 53) {
            field503 = null;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 396)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ta", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 407)
    public final void focusGained(FocusEvent arg0) {
        class24.field239 = true;
    }

    @OriginalMember(owner = "mapview!ta", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 421)
    public final URL getCodeBase() {
        if (class39.field525 == null) {
            return class14.field129 == null || class14.field129.field459 == this ? super.getCodeBase() : class14.field129.field459.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "e", descriptor = "(I)V", line = 437)
    private final void method257(int arg0) {
        long var2 = class39.field534[class16.field136];
        long var4 = class22.method115((byte) 72);
        class39.field534[class16.field136] = var4;
        if (var2 != 0L && var4 <= var2) {
        }
        class16.field136 = class16.field136 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 >= -25) {
                field503 = null;
            }
        }
        this.method153(112);
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(IBIII)V", line = 469)
    public final void method258(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            if (class35.field482 != null) {
                class1.field8++;
                if (class1.field8 >= 3) {
                    this.method256(arg1 ^ 0xFFFFFFB7, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class38.field510 = arg3;
            class35.field482 = this;
            class25.field261 = arg4;
            class39.field533 = arg0;
            if (class14.field129 == null) {
                class6.field46 = class14.field129 = new class32(false, this, arg2, null, 0);
            }
            class14.field129.method212(1, -122, this);
        } catch (Exception var7) {
            class9.method36(true, var7, null);
            this.method256(70, "crash");
        }
        if (arg1 != -3) {
            field506 = 98;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "start", descriptor = "()V", line = 506)
    public final void start() {
        if (class35.field482 == this && !class9.field89) {
            class22.field217 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "f", descriptor = "(I)Z", line = 518)
    public final boolean method259(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
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
            if (arg0 != 0) {
                return false;
            } else if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method256(arg0 + 88, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "stop", descriptor = "()V", line = 552)
    public final void stop() {
        if (class35.field482 == this && !class9.field89) {
            class22.field217 = class22.method115((byte) 73) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Z)V", line = 565)
    private final void method260(boolean arg0) {
        long var2 = class22.method115((byte) 69);
        long var4 = mapview.field273[class13.field123];
        if (!arg0) {
            this.method253((byte) -60);
        }
        mapview.field273[class13.field123] = var2;
        class13.field123 = class13.field123 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
        }
        if (class8.field62++ > 50) {
            class24.field239 = true;
            class8.field62 -= 50;
            class9.field80.setSize(class38.field510, class25.field261);
            class9.field80.setVisible(true);
            if (class39.field525 == null) {
                class9.field80.setLocation(0, 0);
            } else {
                Insets var6 = class39.field525.getInsets();
                class9.field80.setLocation(var6.left, var6.top);
            }
        }
        this.method161((byte) 87);
    }

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "(B)V", line = 610)
    private final synchronized void method261(byte arg0) {
        if (class9.field89) {
            return;
        }
        class9.field89 = true;
        try {
            class9.field80.removeFocusListener(this);
            if (arg0 != 87) {
                field507 = null;
            }
        } catch (Exception var9) {
        }
        try {
            this.method151(47);
        } catch (Exception var8) {
        }
        if (class39.field525 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class14.field129 != null) {
            try {
                class14.field129.method210(2);
            } catch (Exception var6) {
            }
        }
        this.method141(-13);
    }

    @OriginalMember(owner = "mapview!ta", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 657)
    public final AppletContext getAppletContext() {
        if (class39.field525 == null) {
            return class14.field129 == null || class14.field129.field459 == this ? super.getAppletContext() : class14.field129.field459.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 671)
    public final synchronized void paint(Graphics arg0) {
        if (class35.field482 != this || class9.field89) {
            return;
        }
        class24.field239 = true;
        if (class32.field454 != null && class32.field454.startsWith("1.5") && class22.method115((byte) 83) - class25.field262 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class38.field510 && var2.height >= class25.field261) {
                class9.field87 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 695)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(B)V")
    public abstract void method161(byte arg0);

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I)V")
    public abstract void method148(int arg0);

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(I)V")
    public abstract void method141(int arg0);

    @OriginalMember(owner = "mapview!ta", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "(I)V")
    public abstract void method153(int arg0);

    @OriginalMember(owner = "mapview!ta", name = "g", descriptor = "(I)V")
    public abstract void method151(int arg0);
}
