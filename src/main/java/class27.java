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
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class27 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
    private boolean field640 = false;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lja;")
    private static class62 field656 = class30.method243(43, "Your account is already logged in)3");

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lja;")
    public static class62 field641 = class30.method243(43, "::errortest");

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lja;")
    public static class62 field658 = field656;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Ls;")
    public static class128 field647 = new class128(new byte[5000]);

    @OriginalMember(owner = "client!de", name = "R", descriptor = "Lja;")
    public static class62 field678 = null;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Lja;")
    public static class62 field676 = class30.method243(43, "AUS");

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Lja;")
    public static class62 field677 = class30.method243(43, "b12_full");

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Lpd;")
    public static class108 field661;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Z")
    public static boolean field665;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Z")
    public static boolean field679;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "[Z")
    public static boolean[] field670;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    private final synchronized void method210(int arg0) {
        field657++;
        if (class35.field845) {
            return;
        }
        class35.field845 = true;
        try {
            class9.field240.removeFocusListener(this);
        } catch (Exception var6) {
        }
        try {
            this.method165((byte) 118);
        } catch (Exception var5) {
        }
        if (class15.field348 != null) {
            try {
                System.exit(0);
            } catch (Throwable var4) {
            }
        }
        if (class148.field3481 != null) {
            try {
                class148.field3481.method304((byte) 88);
            } catch (Exception var3) {
            }
        }
        int var2 = -124 % ((78 - arg0) / 38);
        this.method166(-77);
    }

    @OriginalMember(owner = "client!de", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;BIIII)V")
    public final void method211(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field666++;
        try {
            class116.field2673 = arg0;
            class68.field1699 = this;
            class121.field2779 = arg3;
            class137.field3168 = arg5;
            class15.field348 = new Frame();
            class15.field348.setTitle("Jagex");
            class15.field348.setResizable(false);
            class15.field348.addWindowListener(this);
            class15.field348.setVisible(true);
            if (arg2 == 108) {
                class15.field348.toFront();
                Insets var8 = class15.field348.getInsets();
                class15.field348.setSize(arg3 + var8.right + var8.left, var8.top + arg5 + var8.bottom);
                class68.field1684 = class148.field3481 = new class41(true, null, arg6, arg1, arg4);
                class148.field3481.method310(this, 1, (byte) -1);
            }
        } catch (Exception var10) {
            class93.method715(var10, null, true);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method212(String arg0, boolean arg1) {
        field664++;
        if (this.field640) {
            return;
        }
        this.field640 = arg1;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!de", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field652++;
    }

    @OriginalMember(owner = "client!de", name = "stop", descriptor = "()V")
    public final void stop() {
        field663++;
        if (class68.field1699 == this && !class35.field845) {
            class88.field2097 = class26.method209((byte) -70) + 4000L;
        }
    }

    @OriginalMember(owner = "client!de", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field660++;
        if (class15.field348 == null) {
            return class148.field3481 == null || class148.field3481.field957 == this ? super.getCodeBase() : class148.field3481.field957.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 >= -118) {
            field647 = null;
        }
        field667++;
        if (class29.method241(arg8, -1)) {
            class113.field2611 = null;
            class86.method666(arg6, arg7, -1, class131.field2990[arg8], arg3, arg2, arg4, -1, arg1, arg5);
            if (class113.field2611 != null) {
                class86.method666(class102.field2376, class30.field740, -1, class113.field2611, arg3, arg2, arg4, -1412584499, arg1, arg5);
                class113.field2611 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class18.field416[var9] = true;
            }
        } else {
            class18.field416[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public final synchronized void method214(int arg0) {
        Container var2;
        if (class15.field348 == null) {
            var2 = class148.field3481.field957;
        } else {
            var2 = class15.field348;
        }
        field644++;
        if (class9.field240 != null) {
            class9.field240.removeFocusListener(this);
            var2.remove(class9.field240);
        }
        class9.field240 = new class86(this);
        var2.add(class9.field240);
        if (arg0 != 789980720) {
            field661 = null;
        }
        class9.field240.setSize(class121.field2779, class137.field3168);
        class9.field240.setVisible(true);
        if (class15.field348 == null) {
            class9.field240.setLocation(0, 0);
        } else {
            Insets var3 = class15.field348.getInsets();
            class9.field240.setLocation(var3.left, var3.top);
        }
        class9.field240.addFocusListener(this);
        class9.field240.requestFocus();
        class67.field1672 = true;
        class103.field2406 = false;
        class6.field201 = class26.method209((byte) -9);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field642++;
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
            }
            this.method212("invalidhost", true);
            if (arg0 != 0) {
                field641 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field662++;
        if (class15.field348 == null) {
            return class148.field3481 == null || class148.field3481.field957 == this ? super.getParameter(arg0) : class148.field3481.field957.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field672++;
        if (class68.field1699 != this || class35.field845) {
            return;
        }
        class67.field1672 = true;
        if (class41.field955 != null && class41.field955.startsWith("1.5") && class26.method209((byte) -76) - class6.field201 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class121.field2779 && class137.field3168 <= var2.height) {
                class103.field2406 = true;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public abstract void method166(int arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public abstract void method165(byte arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIILbd;)V")
    public static final void method216(int arg0, int arg1, int arg2, int arg3, class12 arg4) {
        field655++;
        if (class146.field3436 >= 50 || class83.field1993 == 0 || (arg4.field267 == null || arg4.field267.length <= arg2)) {
            return;
        }
        int var5 = arg4.field267[arg2];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class35.field834[class146.field3436] = var6;
        int var7 = var5 >> 4 & 0x7;
        int var8 = (arg1 - 64) / 128;
        int var9 = var5 & 0xF;
        int var10 = (arg3 - arg0) / 128;
        class97.field2256[class146.field3436] = var7;
        class80.field1947[class146.field3436] = 0;
        class15.field367[class146.field3436] = null;
        class34.field816[class146.field3436] = (var8 << 16) + (var10 << 8) + var9;
        class146.field3436++;
    }

    @OriginalMember(owner = "client!de", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field674++;
    }

    @OriginalMember(owner = "client!de", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field659++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    private final void method217(boolean arg0) {
        field649++;
        long var2 = class26.method209((byte) -104);
        long var4 = class113.field2616[class62.field1527];
        if (!arg0) {
            this.getDocumentBase();
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class113.field2616[class62.field1527] = var2;
        class62.field1527 = class62.field1527 + 1 & 0x1F;
        synchronized (this) {
            class120.field2740 = class143.field3344;
        }
        this.method156(10);
    }

    @OriginalMember(owner = "client!de", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field651++;
        if (class15.field348 == null) {
            return class148.field3481 == null || class148.field3481.field957 == this ? super.getDocumentBase() : class148.field3481.field957.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
    public abstract void method156(int arg0);

    @OriginalMember(owner = "client!de", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field675++;
    }

    @OriginalMember(owner = "client!de", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field671++;
        if (class15.field348 == null) {
            return class148.field3481 == null || class148.field3481.field957 == this ? super.getAppletContext() : class148.field3481.field957.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field648++;
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
    public final void run() {
        field669++;
        try {
            if (class41.field940 != null) {
                String var1 = class41.field940.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class41.field955;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method212("wrongjava", true);
                        return;
                    }
                    class128.field2867 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class41.field955 == null || class41.field955.equals("1.4.2"))) {
                    this.method212("wrongjava", true);
                    return;
                }
            }
            if (class148.field3481.field957 != null) {
                Method var3 = class41.field942;
                if (var3 != null) {
                    try {
                        var3.invoke(class148.field3481.field957, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method214(789980720);
            class105.field2419 = class26.method207(class9.field240, class137.field3168, class121.field2779, -17983);
            this.method164(-17760);
            class113.field2613 = class124.method981(-1117);
            class113.field2613.method750(122);
            while (class88.field2097 == 0L || class88.field2097 > class26.method209((byte) 122)) {
                class155.field3577 = class113.field2613.method752(-1, class128.field2867, class147.field3454);
                for (int var4 = 0; var4 < class155.field3577; var4++) {
                    this.method217(true);
                }
                this.method218((byte) -97);
                class146.method1166(class148.field3481, 1, class9.field240);
            }
        } catch (Exception var7) {
            class93.method715(var7, null, true);
            this.method212("crash", true);
        }
        this.method210(-81);
    }

    @OriginalMember(owner = "client!de", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field637++;
        if (class68.field1699 == this && !class35.field845) {
            class88.field2097 = class26.method209((byte) -93);
            class146.method1168(-19127, 5000L);
            class68.field1684 = null;
            this.method210(122);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    private final void method218(byte arg0) {
        long var2 = class26.method209((byte) 126);
        field653++;
        long var4 = class8.field220[class119.field2730];
        class8.field220[class119.field2730] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class84.field2026 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != -97) {
            field677 = null;
        }
        class119.field2730 = class119.field2730 + 1 & 0x1F;
        if (class70.field1790++ > 50) {
            class70.field1790 -= 50;
            class67.field1672 = true;
            class9.field240.setSize(class121.field2779, class137.field3168);
            class9.field240.setVisible(true);
            if (class15.field348 == null) {
                class9.field240.setLocation(0, 0);
            } else {
                Insets var7 = class15.field348.getInsets();
                class9.field240.setLocation(var7.left, var7.top);
            }
        }
        this.method153(arg0 ^ 0x5B);
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
    public abstract void method164(int arg0);

    @OriginalMember(owner = "client!de", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class143.field3344 = false;
        field650++;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
    public abstract void method153(int arg0);

    @OriginalMember(owner = "client!de", name = "start", descriptor = "()V")
    public final void start() {
        field654++;
        if (class68.field1699 == this && !class35.field845) {
            class88.field2097 = 0L;
        }
    }

    @OriginalMember(owner = "client!de", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field645++;
    }

    @OriginalMember(owner = "client!de", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field639++;
    }

    @OriginalMember(owner = "client!de", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field638++;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
    public static void method219(byte arg0) {
        field661 = null;
        field641 = null;
        field670 = null;
        field658 = null;
        field676 = null;
        if (arg0 >= 97) {
            field656 = null;
            field677 = null;
            field678 = null;
            field647 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field643++;
        class143.field3344 = true;
        class67.field1672 = true;
    }

    @OriginalMember(owner = "client!de", name = "providesignlink", descriptor = "(Lfe;)V")
    public static final void providesignlink(class41 arg0) {
        class148.field3481 = arg0;
        class68.field1684 = arg0;
        field646++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIBI)V")
    public final void method220(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field668++;
        try {
            if (class68.field1699 == null) {
                class121.field2779 = arg0;
                class137.field3168 = arg2;
                if (arg3 != 105) {
                    this.windowIconified(null);
                }
                class68.field1699 = this;
                class116.field2673 = arg1;
                if (class148.field3481 == null) {
                    class68.field1684 = class148.field3481 = new class41(false, this, arg4, null, 0);
                }
                class148.field3481.method310(this, 1, (byte) -1);
            } else {
                class79.field1913++;
                if (class79.field1913 >= 3) {
                    this.method212("alreadyloaded", true);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class93.method715(var7, null, true);
            this.method212("crash", true);
        }
    }
}
