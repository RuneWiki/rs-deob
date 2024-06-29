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

@OriginalClass("client!bga")
public abstract class class658 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "Z")
    private boolean field9305 = false;

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "Z")
    private boolean field9318 = false;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!bga", name = "n", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!bga", name = "o", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!bga", name = "p", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!bga", name = "q", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!bga", name = "r", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!bga", name = "s", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!bga", name = "t", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!bga", name = "w", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!bga", name = "x", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!bga", name = "y", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!bga", name = "A", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!bga", name = "C", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!bga", name = "D", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!bga", name = "E", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!bga", name = "F", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!bga", name = "G", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!bga", name = "H", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!bga", name = "J", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!bga", name = "K", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!bga", name = "M", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!bga", name = "N", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!bga", name = "R", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!bga", name = "U", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!bga", name = "I", descriptor = "Z")
    public static boolean field9326;

    @OriginalMember(owner = "client!bga", name = "L", descriptor = "Z")
    public static boolean field9329;

    @OriginalMember(owner = "client!bga", name = "O", descriptor = "Z")
    public static boolean field9332;

    @OriginalMember(owner = "client!bga", name = "P", descriptor = "Z")
    public static boolean field9333;

    @OriginalMember(owner = "client!bga", name = "Q", descriptor = "Z")
    public static boolean field9334;

    @OriginalMember(owner = "client!bga", name = "S", descriptor = "Z")
    public static boolean field9336;

    @OriginalMember(owner = "client!bga", name = "T", descriptor = "Z")
    public static boolean field9337;

    @OriginalMember(owner = "client!bga", name = "V", descriptor = "Z")
    public static boolean field9339;

    @OriginalMember(owner = "client!bga", name = "W", descriptor = "Z")
    public static boolean field9340;

    @OriginalMember(owner = "client!bga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field9298++;
        if (class678.field9508 != this || class645.field9075) {
            return;
        }
        class317.field4067 = true;
        if (class433.field5420 && (class571.method3150(103) - class257.field3133) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class95.field1307 && var2.height >= class366.field4659) {
                class698.field9873 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method3695(String arg0, int arg1) {
        field9315++;
        if (this.field9318) {
            return;
        }
        this.field9318 = true;
        System.out.println("error_game_" + arg0);
        if (arg1 != -1) {
            return;
        }
        try {
            class371.method2028(true, "loggedout", class422.field5308);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!bga", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field9320++;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)Z")
    public final boolean method3696(byte arg0) {
        if (arg0 == -116) {
            field9323++;
            return class496.method2671("jagmisc", -121);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bga", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field9312++;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(B)V")
    private final void method3697(byte arg0) {
        field9321++;
        long var2 = class571.method3150(114);
        long var4 = class503.field6665[class700.field9907];
        class503.field6665[class700.field9907] = var2;
        if (arg0 < 63) {
            this.start();
        }
        class700.field9907 = class700.field9907 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class493.field6520 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class575.field8033++) > 50) {
            class575.field8033 -= 50;
            class317.field4067 = true;
            class500.field6585.setSize(class523.field7111, class244.field3022);
            class500.field6585.setVisible(true);
            if (class582.field8140 != null && class655.field9229 == null) {
                Insets var7 = class582.field8140.getInsets();
                class500.field6585.setLocation(class193.field2426 + var7.left, class267.field3382 + var7.top);
            } else {
                class500.field6585.setLocation(class193.field2426, class267.field3382);
            }
        }
        this.method3704(82);
    }

    @OriginalMember(owner = "client!bga", name = "stop", descriptor = "()V")
    public final void stop() {
        field9309++;
        if (class678.field9508 == this && !class645.field9075) {
            class583.field8145 = class571.method3150(100) + 4000L;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZIIZIIILjava/lang/String;)V")
    public final void method3698(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, String arg7) {
        field9314++;
        try {
            class231.field2887 = null;
            class678.field9508 = this;
            class244.field3022 = arg1;
            class366.field4659 = arg1;
            class267.field3382 = 0;
            class523.field7111 = arg4;
            class95.field1307 = arg4;
            class193.field2426 = 0;
            class68.field929 = arg2;
            class582.field8140 = new Frame();
            class582.field8140.setTitle("Jagex");
            class582.field8140.setResizable(arg0);
            class582.field8140.addWindowListener(this);
            class582.field8140.setVisible(true);
            class582.field8140.toFront();
            Insets var9 = class582.field8140.getInsets();
            class582.field8140.setSize(class95.field1307 + var9.left + var9.right, class366.field4659 + var9.bottom + var9.top);
            class258.field3151 = class590.field8289 = new class648(arg5, arg7, arg6, true);
            class264 var10 = class590.field8289.method3626(1, this, 0);
            while (var10.field3358 == 0) {
                class419.method2233(-28448, 10L);
            }
        } catch (Exception var12) {
            class106.method597(null, -2, var12);
        }
    }

    @OriginalMember(owner = "client!bga", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field9294++;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)Z")
    public final boolean method3699(int arg0) {
        field9293++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (arg0 != -140) {
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
            } else {
                this.method3695("invalidhost", -1);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class413.field5158 = false;
        field9306++;
    }

    @OriginalMember(owner = "client!bga", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field9319++;
        if (class678.field9508 == this && !class645.field9075) {
            class583.field8145 = class571.method3150(127);
            class419.method2233(-28448, 5000L);
            class258.field3151 = null;
            this.method3707((byte) -75, false);
        }
    }

    @OriginalMember(owner = "client!bga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field9303++;
        class413.field5158 = true;
        class317.field4067 = true;
    }

    @OriginalMember(owner = "client!bga", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field9313++;
        if (class582.field8140 == null) {
            return class422.field5308 == null || class422.field5308 == this ? super.getCodeBase() : class422.field5308.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(B)V")
    public synchronized void method3700(byte arg0) {
        if (class500.field6585 != null) {
            class500.field6585.removeFocusListener(this);
            class500.field6585.getParent().setBackground(Color.black);
            class500.field6585.getParent().remove(class500.field6585);
        }
        field9308++;
        Container var2;
        if (class655.field9229 != null) {
            var2 = class655.field9229;
        } else if (class582.field8140 != null) {
            var2 = class582.field8140;
        } else if (class422.field5308 == null) {
            var2 = class678.field9508;
        } else {
            var2 = class422.field5308;
        }
        var2.setLayout(null);
        class500.field6585 = new class220(this);
        var2.add(class500.field6585);
        class500.field6585.setSize(class523.field7111, class244.field3022);
        class500.field6585.setVisible(true);
        if (class582.field8140 == var2) {
            Insets var3 = class582.field8140.getInsets();
            class500.field6585.setLocation(class193.field2426 + var3.left, class267.field3382 + var3.top);
        } else {
            class500.field6585.setLocation(class193.field2426, class267.field3382);
        }
        class500.field6585.addFocusListener(this);
        class500.field6585.requestFocus();
        class588.field8273 = true;
        class413.field5158 = true;
        class317.field4067 = true;
        if (arg0 >= 20) {
            class698.field9873 = false;
            class257.field3133 = class571.method3150(110);
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)Z")
    public final boolean method3701(int arg0) {
        int var2 = -36 % ((10 - arg0) / 57);
        field9325++;
        return class496.method2671("jaclib", -11);
    }

    @OriginalMember(owner = "client!bga", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field9297++;
    }

    @OriginalMember(owner = "client!bga", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field9311++;
        if (class582.field8140 == null) {
            return class422.field5308 == null || class422.field5308 == this ? super.getAppletContext() : class422.field5308.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field9299++;
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(I)V")
    public abstract void method3702(int arg0);

    @OriginalMember(owner = "client!bga", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field9307++;
        if (class582.field8140 == null) {
            return class422.field5308 == null || class422.field5308 == this ? super.getParameter(arg0) : class422.field5308.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(B)Ljava/lang/String;")
    public String method3703(byte arg0) {
        if (arg0 != -30) {
            provideLoaderApplet(null);
        }
        field9300++;
        return null;
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V")
    public abstract void method3704(int arg0);

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "(I)V")
    public abstract void method3705(int arg0);

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBLjava/lang/String;IIII)V")
    public final void method3706(int arg0, byte arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field9322++;
        try {
            if (class678.field9508 == null) {
                class678.field9508 = this;
                class231.field2887 = class422.field5308;
                class267.field3382 = 0;
                if (arg1 != -21) {
                    this.method3700((byte) -77);
                }
                class68.field929 = arg3;
                class523.field7111 = arg4;
                class95.field1307 = arg4;
                class193.field2426 = 0;
                class244.field3022 = arg6;
                class366.field4659 = arg6;
                class258.field3151 = class590.field8289 = new class648(arg0, arg2, arg5, class422.field5308 != null);
                class264 var8 = class590.field8289.method3626(1, this, 0);
                while (var8.field3358 == 0) {
                    class419.method2233(-28448, 10L);
                }
            } else {
                class278.field3476++;
                if (class278.field3476 >= 3) {
                    this.method3695("alreadyloaded", -1);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class106.method597(null, -2, var10);
            this.method3695("crash", arg1 + 20);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BZ)V")
    private final void method3707(byte arg0, boolean arg1) {
        field9295++;
        synchronized (this) {
            if (class645.field9075) {
                return;
            }
            class645.field9075 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class422.field5308 != null) {
            class422.field5308.destroy();
        }
        try {
            this.method3709(-36);
        } catch (Exception var9) {
        }
        if (this.field9305) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field9305 = false;
        }
        class499.method2688(true, (byte) -28);
        class310.method1795(-96);
        if (class500.field6585 != null) {
            try {
                class500.field6585.removeFocusListener(this);
                class500.field6585.getParent().remove(class500.field6585);
            } catch (Exception var7) {
            }
        }
        if (class590.field8289 != null) {
            try {
                class590.field8289.method3640(-121);
            } catch (Exception var6) {
            }
        }
        if (arg0 >= -18) {
            return;
        }
        this.method3702(31);
        if (class582.field8140 != null) {
            class582.field8140.setVisible(false);
            class582.field8140.dispose();
            class582.field8140 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V")
    private final void method3708(boolean arg0) {
        if (arg0) {
            return;
        }
        field9304++;
        long var2 = class571.method3150(92);
        long var4 = class344.field4421[class663.field9373];
        class344.field4421[class663.field9373] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class663.field9373 = class663.field9373 + 1 & 0x1F;
        synchronized (this) {
            class588.field8273 = class413.field5158;
        }
        this.method3705(114);
    }

    @OriginalMember(owner = "client!bga", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field9317++;
    }

    @OriginalMember(owner = "client!bga", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field9316++;
    }

    @OriginalMember(owner = "client!bga", name = "run", descriptor = "()V")
    public final void run() {
        field9302++;
        try {
            if (class648.field9137 != null) {
                String var1 = class648.field9137.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class648.field9157;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3695("wrongjava", -1);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class648.field9157 == null || class648.field9157.equals("1.4.2"))) {
                    this.method3695("wrongjava", -1);
                    return;
                }
            }
            if (class648.field9157 != null && class648.field9157.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class648.field9157.length() > var3) {
                    char var5 = class648.field9157.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = -(-var5 - var4 * 10) - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class433.field5420 = true;
                }
            }
            Applet var6 = class678.field9508;
            if (class422.field5308 != null) {
                var6 = class422.field5308;
            }
            Method var7 = class648.field9145;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class402.method2141(-3);
            class25.method171((byte) 92);
            this.method3700((byte) 118);
            this.method3710(511);
            class39.field524 = class225.method1352(15902);
            while (class583.field8145 == 0L || class583.field8145 > class571.method3150(106)) {
                class343.field4401 = class39.field524.method3759(-13, class680.field9562);
                for (int var8 = 0; var8 < class343.field4401; var8++) {
                    this.method3708(false);
                }
                this.method3697((byte) 114);
                class491.method2647(class590.field8289, (byte) -99, class500.field6585);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class106.method597(this.method3703((byte) -30), -2, var20);
            this.method3695("crash", -1);
        } finally {
            Object var13 = null;
            this.method3707((byte) -117, true);
        }
    }

    @OriginalMember(owner = "client!bga", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field9310++;
        if (class582.field8140 == null) {
            return class422.field5308 == null || class422.field5308 == this ? super.getDocumentBase() : class422.field5308.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "(I)V")
    public abstract void method3709(int arg0);

    @OriginalMember(owner = "client!bga", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field9301++;
    }

    @OriginalMember(owner = "client!bga", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        field9296++;
        class422.field5308 = arg0;
    }

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "(I)V")
    public abstract void method3710(int arg0);

    @OriginalMember(owner = "client!bga", name = "start", descriptor = "()V")
    public final void start() {
        field9324++;
        if (class678.field9508 == this && !class645.field9075) {
            class583.field8145 = 0L;
        }
    }
}
