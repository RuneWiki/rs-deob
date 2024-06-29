import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!ng")
public abstract class class341 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Z")
    private boolean field4722 = false;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Z")
    private boolean field4727 = false;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Lqfa;")
    public static class98 field4735 = new class98(96, -2);

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lqfa;")
    public static class98 field4739 = new class98(42, -1);

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "Las;")
    public static class151 field4744 = new class151(10, 2, 2, 0);

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "[I")
    public static int[] field4745 = new int[4];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "Z")
    public static boolean field4746;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "Z")
    public static boolean field4747;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "Z")
    public static boolean field4750;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "Z")
    public static boolean field4751;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "Z")
    public static boolean field4752;

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "Z")
    public static boolean field4753;

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "Z")
    public static boolean field4754;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "Z")
    public static boolean field4755;

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "Z")
    public static boolean field4756;

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "Z")
    public static boolean field4757;

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "Z")
    public static boolean field4761;

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "Z")
    public static boolean field4763;

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "Z")
    public static boolean field4764;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    private final void method2199(int arg0) {
        if (arg0 != -1) {
            this.field4727 = false;
        }
        field4724++;
        long var2 = class479.method2864((byte) -66);
        long var4 = class363.field5145[class131.field1770];
        class363.field5145[class131.field1770] = var2;
        class131.field1770 = class131.field1770 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class70.field876 = class119.field1443;
        }
        this.method1966(false);
    }

    @OriginalMember(owner = "client!ng", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4726++;
        if (class387.field5484 == null) {
            return class213.field2800 == null || class213.field2800 == this ? super.getAppletContext() : class213.field2800.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4709++;
    }

    @OriginalMember(owner = "client!ng", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4738++;
        if (class387.field5484 == null) {
            return class213.field2800 == null || class213.field2800 == this ? super.getCodeBase() : class213.field2800.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)Z")
    public final boolean method2200(int arg0) {
        if (arg0 != 0) {
            this.method1961((byte) 55);
        }
        field4741++;
        return class608.method3425("jagtheora", true);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public String method1957(boolean arg0) {
        if (!arg0) {
            this.method1963(-10);
        }
        field4743++;
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "stop", descriptor = "()V")
    public final void stop() {
        field4708++;
        if (class125.field1524 == this && !class399.field5649) {
            class344.field4851 = class479.method2864((byte) -50) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public static final void method2201(int arg0) {
        if (arg0 <= 18) {
            method2210((byte) 65, null);
        }
        field4715++;
        for (class296 var1 = (class296) class670.field9095.method2765(-12261); var1 != null; var1 = (class296) class670.field9095.method2759(-15361)) {
            class646 var2 = var1.field4165;
            if (var2.field8852) {
                var1.method1185(-122);
                var2.method3566((byte) -120);
            } else if (class740.field10285 >= var2.field8851) {
                var2.method3565((byte) 126, class144.field2064);
                if (var2.field8852) {
                    var1.method1185(-71);
                } else {
                    class505.method2989(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
    public abstract void method1966(boolean arg0);

    @OriginalMember(owner = "client!ng", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4731++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method2202(String arg0, int arg1) {
        field4720++;
        if (this.field4722) {
            return;
        }
        this.field4722 = true;
        if (arg1 > -92) {
            field4735 = null;
        }
        System.out.println("error_game_" + arg0);
        try {
            class113.method797("loggedout", 93, class213.field2800);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public abstract void method1961(byte arg0);

    @OriginalMember(owner = "client!ng", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4712++;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    private final void method2203(int arg0) {
        field4728++;
        int var2 = 87 % ((-arg0 - 34) / 57);
        long var3 = class479.method2864((byte) -96);
        long var5 = class464.field6575[class569.field8085];
        class464.field6575[class569.field8085] = var3;
        class569.field8085 = class569.field8085 + 1 & 0x1F;
        if (var5 != 0L && var5 < var3) {
            int var7 = (int) (var3 - var5);
            class411.field5801 = ((var7 >> 1) + 32000) / var7;
        }
        if (class449.field6371++ > 50) {
            class202.field2642 = true;
            class449.field6371 -= 50;
            class366.field5196.setSize(class446.field6323, class172.field2348);
            class366.field5196.setVisible(true);
            if (class387.field5484 != null && class272.field3891 == null) {
                Insets var8 = class387.field5484.getInsets();
                class366.field5196.setLocation(class633.field8741 + var8.left, class657.field9009 + var8.top);
            } else {
                class366.field5196.setLocation(class633.field8741, class657.field9009);
            }
        }
        this.method1960(-109);
    }

    @OriginalMember(owner = "client!ng", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4729++;
        if (class387.field5484 == null) {
            return class213.field2800 == null || class213.field2800 == this ? super.getParameter(arg0) : class213.field2800.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4711++;
        if (class387.field5484 == null) {
            return class213.field2800 == null || class213.field2800 == this ? super.getDocumentBase() : class213.field2800.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(Z)Z")
    public final boolean method2204(boolean arg0) {
        field4705++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else if (arg0) {
                return false;
            } else {
                this.method2202("invalidhost", -117);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ng", name = "start", descriptor = "()V")
    public final void start() {
        field4736++;
        if (class125.field1524 == this && !class399.field5649) {
            class344.field4851 = 0L;
        }
    }

    @OriginalMember(owner = "client!ng", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4734++;
        if (class125.field1524 == this && !class399.field5649) {
            class344.field4851 = class479.method2864((byte) -110);
            class756.method4205(5000L, 0);
            class597.field8389 = null;
            this.method2209((byte) -71, false);
        }
    }

    @OriginalMember(owner = "client!ng", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4706++;
        class119.field1443 = true;
        class202.field2642 = true;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)Z")
    public static final boolean method2205(int arg0) {
        field4730++;
        if (class100.field1195) {
            try {
                if ((Boolean) class113.method797("showingVideoAd", 93, class213.field2800)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == 5;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILjava/lang/String;ZIII)V")
    public final void method2206(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5, int arg6, int arg7) {
        try {
            class125.field1524 = this;
            class633.field8741 = 0;
            class545.field7591 = arg0;
            class446.field6323 = arg6;
            class494.field7122 = arg6;
            class657.field9009 = arg1;
            class172.field2348 = arg2;
            class261.field3756 = arg2;
            class478.field6779 = null;
            class387.field5484 = new Frame();
            class387.field5484.setTitle("Jagex");
            class387.field5484.setResizable(true);
            class387.field5484.addWindowListener(this);
            class387.field5484.setVisible(true);
            class387.field5484.toFront();
            Insets var9 = class387.field5484.getInsets();
            class387.field5484.setSize(class494.field7122 + var9.right + var9.left, class261.field3756 - -var9.top + var9.bottom);
            class597.field8389 = class202.field2644 = new class316(arg5, arg3, arg7, true);
            class249 var10 = class202.field2644.method2046(arg1 ^ 0x2, this, 1);
            while (var10.field3310 == 0) {
                class756.method4205(10L, 0);
            }
        } catch (Exception var12) {
            class248.method1583((byte) -126, null, var12);
        }
        field4740++;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)Z")
    public final boolean method2207(int arg0) {
        if (arg0 != -12362) {
            this.method2199(23);
        }
        field4733++;
        return class608.method3425("jaclib", true);
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
    public abstract void method1963(int arg0);

    @OriginalMember(owner = "client!ng", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4718++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)Z")
    public final boolean method2208(int arg0) {
        field4719++;
        if (arg0 != -1) {
            method2201(-37);
        }
        return class608.method3425("jagmisc", true);
    }

    @OriginalMember(owner = "client!ng", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4707++;
    }

    @OriginalMember(owner = "client!ng", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4713++;
        if (class125.field1524 != this || class399.field5649) {
            return;
        }
        class202.field2642 = true;
        if (class555.field7793 && (class479.method2864((byte) -68) - class534.field7519) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class494.field7122 <= var2.width && class261.field3756 <= var2.height) {
                class35.field447 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "(I)V")
    public abstract void method1960(int arg0);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BZ)V")
    private final void method2209(byte arg0, boolean arg1) {
        field4710++;
        synchronized (this) {
            if (class399.field5649) {
                return;
            }
            if (arg0 >= -27) {
                this.field4722 = true;
            }
            class399.field5649 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class213.field2800 != null) {
            class213.field2800.destroy();
        }
        try {
            this.method1955((byte) 103);
        } catch (Exception var9) {
        }
        if (this.field4727) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field4727 = false;
        }
        class198.method1217(true, true);
        class507.method2996((byte) -91);
        if (class366.field5196 != null) {
            try {
                class366.field5196.removeFocusListener(this);
                class366.field5196.getParent().remove(class366.field5196);
            } catch (Exception var7) {
            }
        }
        if (class202.field2644 != null) {
            try {
                class202.field2644.method2049(false);
            } catch (Exception var6) {
            }
        }
        this.method1961((byte) 39);
        if (class387.field5484 != null) {
            class387.field5484.setVisible(false);
            class387.field5484.dispose();
            class387.field5484 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ng", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class119.field1443 = false;
        field4725++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLht;)I")
    public static final int method2210(byte arg0, class581 arg1) {
        field4716++;
        int var2 = 124 / ((arg0 + 28) / 34);
        if (class415.field5852 == arg1) {
            return 9216;
        } else if (class277.field3919 == arg1) {
            return 34065;
        } else if (class254.field3721 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "(I)V")
    public synchronized void method1951(int arg0) {
        field4723++;
        if (class366.field5196 != null) {
            class366.field5196.removeFocusListener(this);
            class366.field5196.getParent().setBackground(Color.black);
            class366.field5196.getParent().remove(class366.field5196);
        }
        Container var2;
        if (class272.field3891 != null) {
            var2 = class272.field3891;
        } else if (class387.field5484 != null) {
            var2 = class387.field5484;
        } else if (class213.field2800 == null) {
            var2 = class125.field1524;
        } else {
            var2 = class213.field2800;
        }
        var2.setLayout(null);
        if (arg0 != -15671) {
            return;
        }
        class366.field5196 = new class419(this);
        var2.add(class366.field5196);
        class366.field5196.setSize(class446.field6323, class172.field2348);
        class366.field5196.setVisible(true);
        if (class387.field5484 == var2) {
            Insets var3 = class387.field5484.getInsets();
            class366.field5196.setLocation(class633.field8741 + var3.left, class657.field9009 + var3.top);
        } else {
            class366.field5196.setLocation(class633.field8741, class657.field9009);
        }
        class366.field5196.addFocusListener(this);
        class366.field5196.requestFocus();
        class119.field1443 = true;
        class70.field876 = true;
        class202.field2642 = true;
        class35.field447 = false;
        class534.field7519 = class479.method2864((byte) -69);
    }

    @OriginalMember(owner = "client!ng", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class213.field2800 = arg0;
        field4742++;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public abstract void method1955(byte arg0);

    @OriginalMember(owner = "client!ng", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4732++;
    }

    @OriginalMember(owner = "client!ng", name = "run", descriptor = "()V")
    public final void run() {
        field4714++;
        try {
            if (class316.field4374 != null) {
                String var1 = class316.field4374.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class316.field4382;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2202("wrongjava", -116);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class316.field4382 == null || class316.field4382.equals("1.4.2"))) {
                    this.method2202("wrongjava", -95);
                    return;
                }
            }
            if (class316.field4382 != null && class316.field4382.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class316.field4382.length()) {
                    char var5 = class316.field4382.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = -(-var5 - var4 * 10) - 48;
                }
                if (var4 >= 5) {
                    class555.field7793 = true;
                }
            }
            Applet var6 = class125.field1524;
            if (class213.field2800 != null) {
                var6 = class213.field2800;
            }
            Method var7 = class316.field4393;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class325.method2118(108);
            class389.method2443(16711935);
            this.method1951(-15671);
            this.method1963(0);
            class145.field2086 = class170.method1100((byte) -19);
            while (class344.field4851 == 0L || class479.method2864((byte) -42) < class344.field4851) {
                class96.field1138 = class145.field2086.method2180(class601.field8434, 4);
                for (int var8 = 0; var8 < class96.field1138; var8++) {
                    this.method2199(-1);
                }
                this.method2203(-124);
                class546.method3163(class366.field5196, class202.field2644, 0);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class248.method1583((byte) -40, this.method1957(true), var20);
            this.method2202("crash", -93);
        } finally {
            Object var13 = null;
            this.method2209((byte) -98, true);
        }
    }

    @OriginalMember(owner = "client!ng", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4721++;
    }

    @OriginalMember(owner = "client!ng", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4717++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method2211(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field4737++;
        try {
            if (class125.field1524 == null) {
                class172.field2348 = arg3;
                class261.field3756 = arg3;
                class125.field1524 = this;
                class478.field6779 = class213.field2800;
                class545.field7591 = arg6;
                class657.field9009 = 0;
                class633.field8741 = 0;
                class446.field6323 = arg0;
                class494.field7122 = arg0;
                int var8 = -16 / ((58 - arg5) / 60);
                class597.field8389 = class202.field2644 = new class316(arg2, arg4, arg1, class213.field2800 != null);
                class249 var9 = class202.field2644.method2046(2, this, 1);
                while (var9.field3310 == 0) {
                    class756.method4205(10L, 0);
                }
            } else {
                class395.field5585++;
                if (class395.field5585 >= 3) {
                    this.method2202("alreadyloaded", -118);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var11) {
            class248.method1583((byte) -113, null, var11);
            this.method2202("crash", -122);
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V")
    public static void method2212(byte arg0) {
        field4735 = null;
        field4744 = null;
        field4745 = null;
        int var1 = -30 / ((48 - arg0) / 45);
        field4739 = null;
    }
}
