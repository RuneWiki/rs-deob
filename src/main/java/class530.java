import jagex3.jagmisc.jagmisc;
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

@OriginalClass("client!kn")
public abstract class class530 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "Z")
    private boolean field7782 = false;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "Z")
    private boolean field7780 = false;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "Lpa;")
    public static class254 field7784 = new class254(2, 4);

    @OriginalMember(owner = "client!kn", name = "H", descriptor = "Ljava/lang/String;")
    public static String field7794 = "";

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "Lpa;")
    public static class254 field7796 = new class254(0, 17);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!kn", name = "B", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!kn", name = "C", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!kn", name = "D", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!kn", name = "E", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!kn", name = "F", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!kn", name = "G", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "Z")
    public static boolean field7798;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "Z")
    public static boolean field7801;

    @OriginalMember(owner = "client!kn", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field7788++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public abstract void method1339(byte arg0);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V")
    private final void method3129(boolean arg0, int arg1) {
        field7791++;
        synchronized (this) {
            if (arg1 != -4849) {
                field7784 = null;
            }
            if (class142.field1893) {
                return;
            }
            class142.field1893 = true;
        }
        if (class312.field4572.field7381 != null) {
            class312.field4572.field7381.destroy();
        }
        try {
            this.method1339((byte) 48);
        } catch (Exception var11) {
        }
        if (this.field7780) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field7780 = false;
        }
        class93.method627(arg1 ^ 0xFFFFE997, true);
        class234 var4 = class312.field4572.method2981(11, class247.field3452.getClass());
        while (var4.field3322 == 0) {
            class388.method2433(100L, 99);
        }
        if (class85.field1245 != null) {
            try {
                class85.field1245.removeFocusListener(this);
                class85.field1245.getParent().remove(class85.field1245);
            } catch (Exception var9) {
            }
        }
        if (class312.field4572 != null) {
            try {
                class312.field4572.method2986((byte) 32);
            } catch (Exception var8) {
            }
        }
        this.method1351(arg1 + 4958);
        if (class286.field4195 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public final synchronized void method3130(boolean arg0) {
        if (class85.field1245 != null) {
            class85.field1245.removeFocusListener(this);
            class85.field1245.getParent().remove(class85.field1245);
        }
        field7769++;
        Container var2;
        if (class461.field6896 != null) {
            var2 = class461.field6896;
        } else if (class286.field4195 == null) {
            var2 = class312.field4572.field7381;
        } else {
            var2 = class286.field4195;
        }
        var2.setLayout(null);
        class85.field1245 = new class271(this);
        var2.add(class85.field1245);
        class85.field1245.setSize(class147.field1961, class107.field1525);
        class85.field1245.setVisible(true);
        if (class286.field4195 == var2) {
            Insets var3 = class286.field4195.getInsets();
            class85.field1245.setLocation(class465.field6939 + var3.left, class110.field1551 + var3.top);
        } else {
            class85.field1245.setLocation(class465.field6939, class110.field1551);
        }
        class85.field1245.addFocusListener(this);
        class85.field1245.requestFocus();
        class519.field7632 = true;
        class540.field7916 = true;
        class264.field3703 = true;
        class400.field6095 = arg0;
        class77.field1119 = class58.method427((byte) -19);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(Z)V")
    public abstract void method1334(boolean arg0);

    @OriginalMember(owner = "client!kn", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field7787++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method3131(int arg0) {
        field7784 = null;
        if (arg0 == -15604) {
            field7796 = null;
            field7794 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field7793++;
        if (class247.field3452 == this && !class142.field1893) {
            class61.field873 = class58.method427((byte) -19);
            class388.method2433(5000L, 55);
            class173.field2329 = null;
            this.method3129(false, -4849);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIILjava/lang/String;IIZ)V")
    public final void method3132(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, boolean arg7) {
        field7772++;
        try {
            class465.field6939 = 0;
            class151.field1973 = arg5;
            class107.field1525 = arg1;
            class360.field5522 = arg1;
            class110.field1551 = 0;
            class147.field1961 = arg3;
            class164.field2221 = arg3;
            class247.field3452 = this;
            class286.field4195 = new Frame();
            class286.field4195.setTitle("Jagex");
            class286.field4195.setResizable(true);
            class286.field4195.addWindowListener(this);
            if (arg2 >= -107) {
                providesignlink(null);
            }
            class286.field4195.setVisible(true);
            class286.field4195.toFront();
            Insets var9 = class286.field4195.getInsets();
            class286.field4195.setSize(class164.field2221 + var9.left + var9.right, var9.top + var9.bottom + class360.field5522);
            class173.field2329 = class312.field4572 = new class500(null, arg0, arg4, arg6);
            class234 var10 = class312.field4572.method3001(1, this, 0);
            while (var10.field3322 == 0) {
                class388.method2433(10L, -106);
            }
        } catch (Exception var12) {
            class395.method2457(null, var12, 1);
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(ZI)Lou;")
    public static final class437 method3133(boolean arg0, int arg1) {
        field7778++;
        class507[] var2 = class176.field2356;
        synchronized (class176.field2356) {
            if (arg0) {
                field7784 = null;
            }
            class437 var3;
            if (arg1 >= class176.field2356.length || class176.field2356[arg1].method3039(-1582849078)) {
                var3 = new class437();
                var3.field6608 = new class302[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field6608[var4] = new class302();
                }
            } else {
                var3 = (class437) class176.field2356[arg1].method3041(6);
                var3.method1184(-69);
                int var10002 = class471.field7020[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BIIII)V")
    public final void method3134(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7789++;
        try {
            if (class247.field3452 != null) {
                class432.field6573++;
                if (class432.field6573 >= 3) {
                    this.method3139("alreadyloaded", (byte) 83);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            } else if (arg0 >= 81) {
                class465.field6939 = 0;
                class107.field1525 = arg1;
                class360.field5522 = arg1;
                class247.field3452 = this;
                class147.field1961 = arg4;
                class164.field2221 = arg4;
                class110.field1551 = 0;
                class151.field1973 = arg3;
                if (class312.field4572 == null) {
                    class173.field2329 = class312.field4572 = new class500(this, arg2, null, 0);
                }
                class234 var6 = class312.field4572.method3001(1, this, 0);
                while (var6.field3322 == 0) {
                    class388.method2433(10L, 88);
                }
            }
        } catch (Throwable var8) {
            class395.method2457(null, var8, 1);
            this.method3139("crash", (byte) 83);
        }
    }

    @OriginalMember(owner = "client!kn", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field7766++;
    }

    @OriginalMember(owner = "client!kn", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field7792++;
        if (class247.field3452 != this || class142.field1893) {
            return;
        }
        class264.field3703 = true;
        if (class281.field3983 && class58.method427((byte) -19) - class77.field1119 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class164.field2221 && class360.field5522 <= var2.height) {
                class400.field6095 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
    public abstract void method1351(int arg0);

    @OriginalMember(owner = "client!kn", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field7761++;
        if (class286.field4195 == null) {
            return class312.field4572 == null || class312.field4572.field7381 == this ? super.getParameter(arg0) : class312.field4572.field7381.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field7786++;
        if (class286.field4195 == null) {
            return class312.field4572 == null || class312.field4572.field7381 == this ? super.getAppletContext() : class312.field4572.field7381.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field7785++;
    }

    @OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label108: {
                if (class500.field7385 != null) {
                    String var1 = class500.field7385.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class500.field7367;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method3139("wrongjava", (byte) 83);
                            break label108;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class500.field7367 == null || class500.field7367.equals("1.4.2"))) {
                        this.method3139("wrongjava", (byte) 83);
                        break label108;
                    }
                }
                if (class500.field7367 != null && class500.field7367.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class500.field7367.length()) {
                        char var5 = class500.field7367.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 - (48 - var5);
                        var3++;
                    }
                    if (var4 >= 5) {
                        class281.field3983 = true;
                    }
                }
                if (class312.field4572.field7381 != null) {
                    Method var6 = class500.field7389;
                    if (var6 != null) {
                        try {
                            var6.invoke(class312.field4572.field7381, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class65.method466(false);
                class101.method663((byte) 71);
                this.method3130(false);
                this.method3135(1);
                this.method1354((byte) 94);
                class235.field3332 = class163.method1047((byte) -44);
                this.method3135(1);
                while (class61.field873 == 0L || class58.method427((byte) -19) < class61.field873) {
                    class435.field6594 = class235.field3332.method383(class513.field7540, 0);
                    for (int var7 = 0; var7 < class435.field6594; var7++) {
                        this.method3138(8501);
                    }
                    this.method3137(19652);
                    class4.method11(class85.field1245, 96, class312.field4572);
                }
            }
        } catch (Throwable var10) {
            class395.method2457(this.method1350(32), var10, 1);
            this.method3139("crash", (byte) 83);
        }
        field7775++;
        this.method3129(true, -4849);
    }

    @OriginalMember(owner = "client!kn", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field7777++;
        if (class286.field4195 == null) {
            return class312.field4572 == null || class312.field4572.field7381 == this ? super.getDocumentBase() : class312.field4572.field7381.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "start", descriptor = "()V")
    public final void start() {
        field7771++;
        if (class247.field3452 == this && !class142.field1893) {
            class61.field873 = 0L;
        }
    }

    @OriginalMember(owner = "client!kn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class540.field7916 = true;
        field7783++;
        class264.field3703 = true;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
    public abstract void method1349(int arg0);

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V")
    public abstract void method1354(byte arg0);

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
    public final void method3135(int arg0) {
        if (arg0 != 1) {
            this.field7780 = false;
        }
        field7776++;
        if (this.field7780) {
            return;
        }
        try {
            class234 var2 = class312.field4572.method2999((byte) -120, class247.field3452.getClass());
            while (var2.field3322 == 0) {
                class388.method2433(100L, 95);
            }
            if (var2.field3324 != null) {
                throw (Throwable) var2.field3324;
            }
            jagmisc.init();
            this.field7780 = true;
            class235.field3332 = class163.method1047((byte) 95);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)Ljava/lang/String;")
    public String method1350(int arg0) {
        if (arg0 != 32) {
            this.field7782 = true;
        }
        field7795++;
        return null;
    }

    @OriginalMember(owner = "client!kn", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field7774++;
        if (class286.field4195 == null) {
            return class312.field4572 == null || class312.field4572.field7381 == this ? super.getCodeBase() : class312.field4572.field7381.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field7773++;
    }

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)Z")
    public final boolean method3136(int arg0) {
        field7781++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != -1) {
                field7794 = null;
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
                this.method3139("invalidhost", (byte) 83);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "providesignlink", descriptor = "(Ldq;)V")
    public static final void providesignlink(class500 arg0) {
        field7767++;
        class312.field4572 = arg0;
        class173.field2329 = arg0;
    }

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)V")
    private final void method3137(int arg0) {
        field7763++;
        long var2 = class58.method427((byte) -19);
        long var4 = class215.field3036[class180.field2422];
        class215.field3036[class180.field2422] = var2;
        if (arg0 != 19652) {
            this.method1354((byte) 75);
        }
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class184.field2502 = ((var6 >> 1) + 32000) / var6;
        }
        class180.field2422 = class180.field2422 + 1 & 0x1F;
        if (class163.field2151++ > 50) {
            class264.field3703 = true;
            class163.field2151 -= 50;
            class85.field1245.setSize(class147.field1961, class107.field1525);
            class85.field1245.setVisible(true);
            if (class286.field4195 != null && class461.field6896 == null) {
                Insets var7 = class286.field4195.getInsets();
                class85.field1245.setLocation(class465.field6939 + var7.left, class110.field1551 + var7.top);
            } else {
                class85.field1245.setLocation(class465.field6939, class110.field1551);
            }
        }
        this.method1334(true);
    }

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "(I)V")
    private final void method3138(int arg0) {
        field7762++;
        long var2 = class58.method427((byte) -19);
        long var4 = class229.field3258[class418.field6379];
        class229.field3258[class418.field6379] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 != 8501) {
            field7794 = null;
        }
        class418.field6379 = class418.field6379 + 1 & 0x1F;
        synchronized (this) {
            class519.field7632 = class540.field7916;
        }
        this.method1349(-126);
    }

    @OriginalMember(owner = "client!kn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class540.field7916 = false;
        field7765++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method3139(String arg0, byte arg1) {
        field7770++;
        if (this.field7782) {
            return;
        }
        this.field7782 = true;
        System.out.println("error_game_" + arg0);
        try {
            class305.method1920(class312.field4572.field7381, "loggedout", 21694);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg1 != 83) {
            field7784 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!kn", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field7768++;
    }

    @OriginalMember(owner = "client!kn", name = "stop", descriptor = "()V")
    public final void stop() {
        field7790++;
        if (class247.field3452 == this && !class142.field1893) {
            class61.field873 = class58.method427((byte) -19) + 4000L;
        }
    }

    @OriginalMember(owner = "client!kn", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field7779++;
    }

    @OriginalMember(owner = "client!kn", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field7764++;
    }
}
