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

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "Z")
    private boolean field373 = false;

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Z")
    public static boolean field362 = false;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Lu;")
    public static class38 field369 = class9.method45(-41, "Herbalist");

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lu;")
    public static class38 field367 = class9.method45(-41, "Dungeon");

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Z")
    private static boolean field364 = false;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "Lu;")
    public static class38 field368 = class9.method45(-41, "_");

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "Lu;")
    public static class38 field372 = class9.method45(-41, "Farming patch");

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Z")
    public static volatile boolean field366 = false;

    @OriginalMember(owner = "mapview!p", name = "n", descriptor = "I")
    public static int field374 = 0;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "Lg;")
    public static class13 field361;

    @OriginalMember(owner = "mapview!p", name = "o", descriptor = "Z")
    public static boolean field375;

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "[B")
    public static byte[] field370;

    @OriginalMember(owner = "mapview!p", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 3)
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6)
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 12)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!p", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 19)
    public final URL getDocumentBase() {
        if (class25.field227 == null) {
            return class10.field94 == null || class10.field94.field50 == this ? super.getDocumentBase() : class10.field94.field50.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "run", descriptor = "()V", line = 46)
    public final void run() {
        try {
            if (class6.field40 != null) {
                String var1 = class6.field40.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class6.field38;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method173("wrongjava", (byte) 26);
                        return;
                    }
                    class12.field122 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class6.field38 == null || class6.field38.equals("1.4.2"))) {
                    this.method173("wrongjava", (byte) 26);
                    return;
                }
            }
            if (class10.field94.field50 != null) {
                Method var3 = class6.field42;
                if (var3 != null) {
                    try {
                        var3.invoke(class10.field94.field50, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method178(-50);
            class23.field218 = class10.method54(class31.field381, class13.field128, class25.field224, 17072);
            this.method126(11);
            class26.field325 = class39.method248((byte) -126);
            while (class2.field8 == 0L || class39.method250((byte) -121) < class2.field8) {
                class25.field229 = class26.field325.method148(class20.field193, class12.field122, (byte) 119);
                for (int var5 = 0; var5 < class25.field229; var5++) {
                    this.method171(true);
                }
                this.method177((byte) -60);
                class12.method64(class10.field94, true, class31.field381);
            }
        } catch (Exception var8) {
            class38.method228(var8, 21219, null);
            this.method173("crash", (byte) 26);
        }
        this.method172(true);
    }

    @OriginalMember(owner = "mapview!p", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 126)
    public final AppletContext getAppletContext() {
        if (class25.field227 == null) {
            return class10.field94 == null || class10.field94.field50 == this ? super.getAppletContext() : class10.field94.field50.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IIIII)V", line = 140)
    public final void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class41.field511 != null) {
                class10.field93++;
                if (class10.field93 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method173("alreadyloaded", (byte) 26);
                return;
            }
            if (arg0 >= -9) {
                return;
            }
            class13.field128 = arg4;
            class18.field168 = arg3;
            class25.field224 = arg1;
            class41.field511 = this;
            if (class10.field94 == null) {
                class31.field377 = class10.field94 = new class6(false, this, arg2, null, 0);
            }
            class10.field94.method23(101, 1, this);
        } catch (Exception var7) {
            class38.method228(var7, 21219, null);
            this.method173("crash", (byte) 26);
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z)V", line = 178)
    private final void method171(boolean arg0) {
        if (!arg0) {
            this.method171(true);
        }
        long var2 = class39.method250((byte) -121);
        long var4 = class18.field173[class35.field444];
        class18.field173[class35.field444] = var2;
        class35.field444 = class35.field444 + 1 & 0x1F;
        synchronized (this) {
            ;
        }
        this.method145(-30);
        if (var4 != 0L && var2 > var4) {
        }
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(Z)V", line = 208)
    private final synchronized void method172(boolean arg0) {
        if (field364) {
            return;
        }
        field364 = arg0;
        try {
            class31.field381.removeFocusListener(this);
        } catch (Exception var9) {
        }
        try {
            this.method124(5592405);
        } catch (Exception var8) {
        }
        if (class25.field227 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        if (class10.field94 != null) {
            try {
                class10.field94.method26((byte) 94);
            } catch (Exception var6) {
            }
        }
        this.method137(21326);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 251)
    public final void method173(String arg0, byte arg1) {
        if (this.field373) {
            return;
        }
        this.field373 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != 26) {
                this.windowClosing(null);
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "mapview!p", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 271)
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "destroy", descriptor = "()V", line = 275)
    public final void destroy() {
        if (class41.field511 == this && !field364) {
            class2.field8 = class39.method250((byte) -121);
            class34.method197(21282, 5000L);
            class31.field377 = null;
            this.method172(true);
        }
    }

    @OriginalMember(owner = "mapview!p", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 291)
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 295)
    public final synchronized void paint(Graphics arg0) {
        if (class41.field511 != this || field364) {
            return;
        }
        class8.field64 = true;
        if (class6.field38 != null && class6.field38.startsWith("1.5") && class39.method250((byte) -121) - class14.field130 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class13.field128 <= var2.width && var2.height >= class25.field224) {
                field366 = true;
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "start", descriptor = "()V", line = 320)
    public final void start() {
        if (class41.field511 == this && !field364) {
            class2.field8 = 0L;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V", line = 335)
    public static void method174(byte arg0) {
        field367 = null;
        field361 = null;
        if (arg0 != 89) {
            field362 = false;
        }
        field370 = null;
        field372 = null;
        field369 = null;
        field368 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(B)V", line = 350)
    public static final void method175(byte arg0) {
        if (arg0 != 14) {
            field361 = null;
        }
        if (class6.field40.toLowerCase().indexOf("microsoft") != -1) {
            class14.field138[188] = 71;
            class14.field138[220] = 74;
            class14.field138[192] = 58;
            class14.field138[189] = 26;
            class14.field138[219] = 42;
            class14.field138[221] = 43;
            class14.field138[190] = 72;
            class14.field138[186] = 57;
            class14.field138[187] = 27;
            class14.field138[222] = 59;
            class14.field138[223] = 28;
            class14.field138[191] = 73;
            return;
        }
        class14.field138[92] = 74;
        if (class6.field44 == null) {
            class14.field138[192] = 58;
            class14.field138[222] = 59;
        } else {
            class14.field138[222] = 58;
            class14.field138[192] = 28;
            class14.field138[520] = 59;
        }
        class14.field138[44] = 71;
        class14.field138[91] = 42;
        class14.field138[59] = 57;
        class14.field138[93] = 43;
        class14.field138[46] = 72;
        class14.field138[45] = 26;
        class14.field138[61] = 27;
        class14.field138[47] = 73;
    }

    @OriginalMember(owner = "mapview!p", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 403)
    public final String getParameter(String arg0) {
        if (class25.field227 == null) {
            return class10.field94 == null || class10.field94.field50 == this ? super.getParameter(arg0) : class10.field94.field50.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "(B)Z", line = 418)
    public final boolean method176(byte arg0) {
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
            int var3 = -123 % ((arg0 - 14) / 32);
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method173("invalidhost", (byte) 26);
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "stop", descriptor = "()V", line = 449)
    public final void stop() {
        if (class41.field511 == this && !field364) {
            class2.field8 = class39.method250((byte) -121) + 4000L;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 464)
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "(B)V", line = 476)
    private final void method177(byte arg0) {
        if (arg0 >= -22) {
            this.windowClosing(null);
        }
        long var2 = class39.method250((byte) -121);
        long var4 = class13.field123[class1.field1];
        if (var4 != 0L && var4 >= var2) {
        }
        class13.field123[class1.field1] = var2;
        class1.field1 = class1.field1 + 1 & 0x1F;
        if (class41.field509++ > 50) {
            class41.field509 -= 50;
            class8.field64 = true;
            class31.field381.setSize(class13.field128, class25.field224);
            class31.field381.setVisible(true);
            if (class25.field227 == null) {
                class31.field381.setLocation(0, 0);
            } else {
                Insets var6 = class25.field227.getInsets();
                class31.field381.setLocation(var6.left, var6.top);
            }
        }
        this.method142((byte) 97);
    }

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "(I)V", line = 523)
    public final synchronized void method178(int arg0) {
        if (arg0 > -15) {
            field367 = null;
        }
        Container var2;
        if (class25.field227 == null) {
            var2 = class10.field94.field50;
        } else {
            var2 = class25.field227;
        }
        if (class31.field381 != null) {
            class31.field381.removeFocusListener(this);
            var2.remove(class31.field381);
        }
        class31.field381 = new class20(this);
        var2.add(class31.field381);
        class31.field381.setSize(class13.field128, class25.field224);
        class31.field381.setVisible(true);
        if (class25.field227 == null) {
            class31.field381.setLocation(0, 0);
        } else {
            Insets var3 = class25.field227.getInsets();
            class31.field381.setLocation(var3.left, var3.top);
        }
        class31.field381.addFocusListener(this);
        class31.field381.requestFocus();
        class8.field64 = true;
        field366 = false;
        class14.field130 = class39.method250((byte) -121);
    }

    @OriginalMember(owner = "mapview!p", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 562)
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "mapview!p", name = "providesignlink", descriptor = "(Lca;)V", line = 569)
    public static final void providesignlink(class6 arg0) {
        class10.field94 = arg0;
        class31.field377 = arg0;
    }

    @OriginalMember(owner = "mapview!p", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 588)
    public final URL getCodeBase() {
        if (class25.field227 == null) {
            return class10.field94 == null || class10.field94.field50 == this ? super.getCodeBase() : class10.field94.field50.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 608)
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 613)
    public final void focusGained(FocusEvent arg0) {
        class8.field64 = true;
    }

    @OriginalMember(owner = "mapview!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 628)
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V")
    public abstract void method137(int arg0);

    @OriginalMember(owner = "mapview!p", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)V")
    public abstract void method145(int arg0);

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "(B)V")
    public abstract void method142(byte arg0);

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "(I)V")
    public abstract void method126(int arg0);

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "(I)V")
    public abstract void method124(int arg0);
}
