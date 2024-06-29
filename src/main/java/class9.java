import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class9 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Z")
    private boolean field183 = false;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Loh;")
    public static class263 field179 = class253.method1681(-118, "T");

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Z")
    public static boolean field213;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "Z")
    public static boolean field214;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
    private final void method64(int arg0, boolean arg1) {
        field195++;
        synchronized (this) {
            if (class119.field2215) {
                return;
            }
            class119.field2215 = true;
        }
        if (class95.field1867.field4557 != null) {
            class95.field1867.field4557.destroy();
        }
        try {
            this.method74(-27217);
        } catch (Exception var10) {
        }
        int var4 = 81 / ((24 - arg0) / 58);
        if (class202.field3648 != null) {
            try {
                class202.field3648.removeFocusListener(this);
                class202.field3648.getParent().remove(class202.field3648);
            } catch (Exception var9) {
            }
        }
        if (class95.field1867 != null) {
            try {
                class95.field1867.method1733((byte) 93);
            } catch (Exception var8) {
            }
        }
        this.method79(0);
        if (class130.field2381 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ig", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field212++;
    }

    @OriginalMember(owner = "client!ig", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field197++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ig", name = "run", descriptor = "()V")
    public final void run() {
        field206++;
        try {
            if (class262.field4563 != null) {
                String var1 = class262.field4563.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class262.field4562;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method73(-129, "wrongjava");
                        return;
                    }
                    class185.field3351 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class262.field4562 == null || class262.field4562.equals("1.4.2"))) {
                    this.method73(-129, "wrongjava");
                    return;
                }
            }
            if (class262.field4562 != null && class262.field4562.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (var4 < class262.field4562.length()) {
                    char var5 = class262.field4562.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class44.field961 = true;
                }
            }
            if (class95.field1867.field4557 != null) {
                Method var6 = class262.field4567;
                if (var6 != null) {
                    try {
                        var6.invoke(class95.field1867.field4557, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method78(-89);
            class255.field4454 = class239.method1601((byte) 104, class138.field2558, class143.field2616, class202.field3648);
            this.method75(90);
            class103.field1958 = class73.method478(-125);
            while (class237.field4140 == 0L || class237.field4140 > class25.method182(true)) {
                class29.field736 = class103.field1958.method47(class185.field3351, class55.field1161, (byte) -103);
                for (int var7 = 0; var7 < class29.field736; var7++) {
                    this.method70(1);
                }
                this.method68((byte) -45);
                class12.method92(class202.field3648, (byte) -119, class95.field1867);
            }
        } catch (Exception var10) {
            class137.method899(var10, (String) null, 46);
            this.method73(-129, "crash");
        }
        this.method64(-69, true);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public abstract void method65(int arg0);

    @OriginalMember(owner = "client!ig", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field199++;
    }

    @OriginalMember(owner = "client!ig", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field185++;
        if (class234.field4108 != this || class119.field2215) {
            return;
        }
        class125.field2292 = true;
        if (class44.field961 && (class25.method182(true) - class102.field1949) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class195.field3527 <= var2.width && class225.field3964 <= var2.height) {
                class254.field4420 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field198++;
        if (class130.field2381 == null) {
            return class95.field1867 == null || class95.field1867.field4557 == this ? super.getDocumentBase() : class95.field1867.field4557.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field209++;
    }

    @OriginalMember(owner = "client!ig", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field202++;
        if (class130.field2381 == null) {
            return class95.field1867 == null || class95.field1867.field4557 == this ? super.getAppletContext() : class95.field1867.field4557.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public abstract void method66(int arg0);

    @OriginalMember(owner = "client!ig", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class62.field1253 = true;
        field180++;
        class125.field2292 = true;
    }

    @OriginalMember(owner = "client!ig", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field188++;
        if (class130.field2381 == null) {
            return class95.field1867 == null || class95.field1867.field4557 == this ? super.getParameter(arg0) : class95.field1867.field4557.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)Lj;")
    public static final class161 method67(int arg0, byte arg1) {
        field210++;
        class161 var2 = (class161) class188.field3391.method1464((byte) 41, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field895.method596(-117, 26, arg0);
        if (arg1 != -51) {
            field192 = -97;
        }
        class161 var4 = new class161();
        if (var3 != null) {
            var4.method1056(new class194(var3), -1);
        }
        class188.field3391.method1472((byte) -29, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field184++;
        if (class234.field4108 == this && !class119.field2215) {
            class237.field4140 = class25.method182(true);
            class215.method1457(5000L, (byte) 102);
            class171.field3131 = null;
            this.method64(100, false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "stop", descriptor = "()V")
    public final void stop() {
        field186++;
        if (class234.field4108 == this && !class119.field2215) {
            class237.field4140 = class25.method182(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ig", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field182++;
    }

    @OriginalMember(owner = "client!ig", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field191++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    private final void method68(byte arg0) {
        field203++;
        long var2 = class25.method182(true);
        int var4 = -75 % ((28 - arg0) / 54);
        long var5 = class12.field332[class268.field4728];
        class12.field332[class268.field4728] = var2;
        if (var5 != 0L && var2 > var5) {
            int var7 = (int) (var2 - var5);
            class225.field3969 = ((var7 >> 1) + 32000) / var7;
        }
        class268.field4728 = class268.field4728 + 1 & 0x1F;
        if (class179.field3276++ > 50) {
            class125.field2292 = true;
            class179.field3276 -= 50;
            class202.field3648.setSize(class138.field2558, class143.field2616);
            class202.field3648.setVisible(true);
            if (class130.field2381 != null && class90.field1774 == null) {
                Insets var8 = class130.field2381.getInsets();
                class202.field3648.setLocation(class114.field2138 + var8.left, class200.field3621 + var8.top);
            } else {
                class202.field3648.setLocation(class114.field2138, class200.field3621);
            }
        }
        this.method65(77);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
    public static final void method69(byte arg0) {
        class241.field4230 &= 0x7FF;
        field187++;
        if (class256.field4464 < 128) {
            class256.field4464 = 128;
        }
        if (class256.field4464 > 383) {
            class256.field4464 = 383;
        }
        int var1 = class53.field1116 >> 7;
        int var2 = class207.field3743 >> 7;
        int var3 = 0;
        int var4 = class120.method781(class12.field321, class53.field1116, false, class207.field3743);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class12.field321;
                    if (var7 < 3 && (class77.field1576[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class112.field2102[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = 48 % ((25 - arg0) / 59);
        int var10 = var3 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (var10 > class43.field928) {
            class43.field928 += (var10 - class43.field928) / 24;
        } else if (class43.field928 > var10) {
            class43.field928 += (var10 - class43.field928) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    private final void method70(int arg0) {
        field204++;
        long var2 = class25.method182(true);
        long var4 = class190.field3415[class113.field2124];
        class190.field3415[class113.field2124] = var2;
        class113.field2124 = class113.field2124 + arg0 & 0x1F;
        synchronized (this) {
            class101.field1925 = class62.field1253;
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        this.method66(arg0 ^ 0xB);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public static void method71(int arg0) {
        if (arg0 != -5433) {
            field179 = null;
        }
        field179 = null;
    }

    @OriginalMember(owner = "client!ig", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field211++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field189++;
        try {
            if (class234.field4108 == null) {
                class145.field2652 = arg2;
                class200.field3621 = 0;
                class138.field2558 = arg4;
                class195.field3527 = arg4;
                class234.field4108 = this;
                class114.field2138 = 0;
                class143.field2616 = arg3;
                class225.field3964 = arg3;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class95.field1867 == null) {
                    class171.field3131 = class95.field1867 = new class262(this, arg1, (String) null, 0);
                }
                if (arg0 == 3292) {
                    class235 var7 = class95.field1867.method1724((byte) 122, 1, this);
                    while (var7.field4114 == 0) {
                        class215.method1457(10L, (byte) 114);
                    }
                }
            } else {
                class153.field2780++;
                if (class153.field2780 >= 3) {
                    this.method73(-129, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class137.method899(var9, (String) null, 46);
            this.method73(-129, "crash");
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method73(int arg0, String arg1) {
        field207++;
        if (this.field183) {
            return;
        }
        this.field183 = true;
        if (arg0 != -129) {
            this.method72(115, 31, -105, 78, 55);
        }
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
    public abstract void method74(int arg0);

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
    public abstract void method75(int arg0);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method76(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field181++;
        int var8 = -13 / ((-arg4 - 49) / 42);
        try {
            class114.field2138 = 0;
            class145.field2652 = arg6;
            class200.field3621 = 0;
            class143.field2616 = arg2;
            class225.field3964 = arg2;
            class138.field2558 = arg5;
            class195.field3527 = arg5;
            class234.field4108 = this;
            class130.field2381 = new Frame();
            class130.field2381.setTitle("Jagex");
            class130.field2381.setResizable(true);
            class130.field2381.addWindowListener(this);
            class130.field2381.setVisible(true);
            class130.field2381.toFront();
            Insets var9 = class130.field2381.getInsets();
            class130.field2381.setSize(class195.field3527 + var9.left + var9.right, class225.field3964 + var9.bottom + var9.top);
            class171.field3131 = class95.field1867 = new class262((Applet) null, arg0, arg1, arg3);
            class235 var10 = class95.field1867.method1724((byte) 99, 1, this);
            while (var10.field4114 == 0) {
                class215.method1457(10L, (byte) 107);
            }
        } catch (Exception var12) {
            class137.method899(var12, (String) null, 46);
        }
    }

    @OriginalMember(owner = "client!ig", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field200++;
        class62.field1253 = false;
    }

    @OriginalMember(owner = "client!ig", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ig", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field190++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        field205++;
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
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                int var3 = -26 / ((arg0 + 13) / 62);
                this.method73(-129, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "start", descriptor = "()V")
    public final void start() {
        field201++;
        if (class234.field4108 == this && !class119.field2215) {
            class237.field4140 = 0L;
        }
    }

    @OriginalMember(owner = "client!ig", name = "providesignlink", descriptor = "(Ltj;)V")
    public static final void providesignlink(class262 arg0) {
        class95.field1867 = arg0;
        class171.field3131 = arg0;
        field196++;
    }

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)V")
    public final synchronized void method78(int arg0) {
        if (class202.field3648 != null) {
            class202.field3648.removeFocusListener(this);
            class202.field3648.getParent().remove(class202.field3648);
        }
        field194++;
        Container var2;
        if (class90.field1774 != null) {
            var2 = class90.field1774;
        } else if (class130.field2381 == null) {
            var2 = class95.field1867.field4557;
        } else {
            var2 = class130.field2381;
        }
        var2.setLayout((LayoutManager) null);
        class202.field3648 = new class153(this);
        var2.add(class202.field3648);
        class202.field3648.setSize(class138.field2558, class143.field2616);
        class202.field3648.setVisible(true);
        if (class130.field2381 == var2) {
            Insets var3 = class130.field2381.getInsets();
            class202.field3648.setLocation(class114.field2138 + var3.left, class200.field3621 + var3.top);
        } else {
            class202.field3648.setLocation(class114.field2138, class200.field3621);
        }
        class202.field3648.addFocusListener(this);
        class202.field3648.requestFocus();
        class62.field1253 = true;
        class101.field1925 = true;
        int var4 = 36 % ((arg0 + 25) / 62);
        class125.field2292 = true;
        class254.field4420 = false;
        class102.field1949 = class25.method182(true);
    }

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)V")
    public abstract void method79(int arg0);

    @OriginalMember(owner = "client!ig", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field193++;
        if (class130.field2381 == null) {
            return class95.field1867 == null || class95.field1867.field4557 == this ? super.getCodeBase() : class95.field1867.field4557.getCodeBase();
        } else {
            return null;
        }
    }
}
