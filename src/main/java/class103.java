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

@OriginalClass("client!of")
public abstract class class103 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Z")
    private boolean field2593 = false;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[Lfc;")
    public static class39[] field2579 = new class39[100];

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field2576 = 0;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lfc;")
    public static class39 field2581 = class90.method774("Diese Welt ist voll)3", -116);

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lfc;")
    public static class39 field2591 = null;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lfc;")
    public static class39 field2589 = class90.method774("::noclip", -90);

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Z")
    public static boolean field2594 = false;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "Lfc;")
    public static class39 field2600 = class90.method774("p11_full", -122);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    private static int field2606;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Luc;")
    public static class139 field2603;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lc;")
    public static class15 field2582;

    @OriginalMember(owner = "client!of", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 9)
    public final URL getDocumentBase() {
        field2598++;
        if (class87.field2010 == null) {
            return class83.field1850 == null || class83.field1850.field3365 == this ? super.getDocumentBase() : class83.field1850.field3365.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 28)
    public final String getParameter(String arg0) {
        field2607++;
        if (class87.field2010 == null) {
            return class83.field1850 == null || class83.field1850.field3365 == this ? super.getParameter(arg0) : class83.field1850.field3365.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "stop", descriptor = "()V", line = 43)
    public final void stop() {
        field2580++;
        if (class66.field1577 == this && !class131.field3291) {
            class5.field169 = class29.method361(-5321) + 4000L;
        }
    }

    @OriginalMember(owner = "client!of", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 54)
    public final URL getCodeBase() {
        field2612++;
        if (class87.field2010 == null) {
            return class83.field1850 == null || class83.field1850.field3365 == this ? super.getCodeBase() : class83.field1850.field3365.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 74)
    public final AppletContext getAppletContext() {
        field2578++;
        if (class87.field2010 == null) {
            return class83.field1850 == null || class83.field1850.field3365 == this ? super.getAppletContext() : class83.field1850.field3365.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 91)
    public final synchronized void paint(Graphics arg0) {
        field2602++;
        if (class66.field1577 != this || class131.field3291) {
            return;
        }
        class70.field1655 = true;
        if (class133.field3350 != null && class133.field3350.startsWith("1.5") && class29.method361(-5321) - class26.field754 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class13.field339 <= var2.width && var2.height >= class89.field2095) {
                class57.field1421 = true;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 119)
    public final void windowActivated(WindowEvent arg0) {
        field2604++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 130)
    private final void method916(byte arg0) {
        long var2 = class29.method361(-5321);
        field2609++;
        if (arg0 < 8) {
            return;
        }
        long var4 = class124.field3190[class83.field1841];
        class124.field3190[class83.field1841] = var2;
        class83.field1841 = class83.field1841 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class55.field1386 = class18.field498;
        }
        this.method237(2376);
    }

    @OriginalMember(owner = "client!of", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 162)
    public final void windowIconified(WindowEvent arg0) {
        field2608++;
    }

    @OriginalMember(owner = "client!of", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 173)
    public final void focusGained(FocusEvent arg0) {
        class18.field498 = true;
        class70.field1655 = true;
        field2573++;
    }

    @OriginalMember(owner = "client!of", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 184)
    public final void update(Graphics arg0) {
        field2583++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!of", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 200)
    public final void windowOpened(WindowEvent arg0) {
        field2577++;
    }

    @OriginalMember(owner = "client!of", name = "providesignlink", descriptor = "(Ltc;)V", line = 208)
    public static final void providesignlink(class133 arg0) {
        class83.field1850 = arg0;
        class79.field1793 = arg0;
        field2572++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lfc;", line = 216)
    public static final class39 method917(int arg0, int arg1) {
        field2611++;
        if (arg0 != -20666) {
            method917(8, 112);
        }
        return arg1 < 999999999 ? class86.method734(arg1, arg0 + 22884) : class150.field3710;
    }

    @OriginalMember(owner = "client!of", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 240)
    public final void windowDeiconified(WindowEvent arg0) {
        field2592++;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 252)
    public static void method918(byte arg0) {
        field2589 = null;
        field2579 = null;
        field2591 = null;
        field2582 = null;
        field2600 = null;
        if (arg0 < -15) {
            field2603 = null;
            field2581 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 270)
    public final void windowDeactivated(WindowEvent arg0) {
        field2601++;
    }

    @OriginalMember(owner = "client!of", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 277)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2610++;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)Z", line = 287)
    public final boolean method919(byte arg0) {
        field2599++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = -94 % ((arg0 - 17) / 47);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method921("invalidhost", -30);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "start", descriptor = "()V", line = 323)
    public final void start() {
        field2586++;
        if (class66.field1577 == this && !class131.field3291) {
            class5.field169 = 0L;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V", line = 335)
    private final synchronized void method920(byte arg0) {
        field2590++;
        if (class131.field3291) {
            return;
        }
        class131.field3291 = true;
        try {
            class140.field3523.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method240(false);
        } catch (Exception var4) {
        }
        if (arg0 != -1) {
            field2606 = -18;
        }
        if (class87.field2010 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class83.field1850 != null) {
            try {
                class83.field1850.method1086(11621);
            } catch (Exception var2) {
            }
        }
        this.method230(105);
    }

    @OriginalMember(owner = "client!of", name = "run", descriptor = "()V", line = 384)
    public final void run() {
        field2596++;
        try {
            if (class133.field3357 != null) {
                String var1 = class133.field3357.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class133.field3350;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method921("wrongjava", 123);
                        return;
                    }
                    class115.field3017 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class133.field3350 == null || class133.field3350.equals("1.4.2"))) {
                    this.method921("wrongjava", 125);
                    return;
                }
            }
            if (class83.field1850.field3365 != null) {
                Method var3 = class133.field3355;
                if (var3 != null) {
                    try {
                        var3.invoke(class83.field1850.field3365, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method924(90);
            class17.field492 = class3.method23(class89.field2095, 0, class13.field339, class140.field3523);
            this.method239(true);
            class104.field2632 = class151.method1199(-111);
            class104.field2632.method349(512);
            while (class5.field169 == 0L || class29.method361(-5321) < class5.field169) {
                class34.field897 = class104.field2632.method352(class3.field92, class115.field3017, 512);
                for (int var4 = 0; var4 < class34.field897; var4++) {
                    this.method916((byte) 57);
                }
                this.method922((byte) -104);
                class44.method514(4, true);
            }
        } catch (Exception var7) {
            class142.method1158(null, var7, -113);
            this.method921("crash", 124);
        }
        this.method920((byte) -1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 472)
    public final void method921(String arg0, int arg1) {
        field2574++;
        int var3 = -76 % ((arg1 - 79) / 44);
        if (this.field2593) {
            return;
        }
        this.field2593 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!of", name = "destroy", descriptor = "()V", line = 495)
    public final void destroy() {
        field2575++;
        if (class66.field1577 == this && !class131.field3291) {
            class5.field169 = class29.method361(-5321);
            class61.method609(-100, 5000L);
            class79.field1793 = null;
            this.method920((byte) -1);
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V", line = 510)
    private final void method922(byte arg0) {
        field2585++;
        long var2 = class29.method361(-5321);
        int var4 = -74 % ((arg0 + 6) / 63);
        long var5 = class24.field647[field2606];
        class24.field647[field2606] = var2;
        if (var5 != 0L && var2 > var5) {
            int var7 = (int) (var2 - var5);
            class124.field3181 = ((var7 >> 1) + 32000) / var7;
        }
        field2606 = field2606 + 1 & 0x1F;
        if (class139.field3518++ > 50) {
            class139.field3518 -= 50;
            class70.field1655 = true;
            class140.field3523.setSize(class13.field339, class89.field2095);
            class140.field3523.setVisible(true);
            if (class87.field2010 == null) {
                class140.field3523.setLocation(0, 0);
            } else {
                Insets var8 = class87.field2010.getInsets();
                class140.field3523.setLocation(var8.left, var8.top);
            }
        }
        this.method236(true);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 551)
    public final void method923(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        try {
            class66.field1577 = this;
            class13.field339 = arg6;
            class89.field2095 = arg0;
            class115.field3009 = arg1;
            class87.field2010 = new Frame();
            class87.field2010.setTitle("Jagex");
            class87.field2010.setResizable(false);
            class87.field2010.addWindowListener(this);
            class87.field2010.setVisible(true);
            class87.field2010.toFront();
            if (arg2 != 0) {
                providesignlink(null);
            }
            Insets var8 = class87.field2010.getInsets();
            class87.field2010.setSize(var8.left + arg6 + var8.right, var8.top + arg0 - -var8.bottom);
            class79.field1793 = class83.field1850 = new class133(true, null, arg3, arg4, arg5);
            class83.field1850.method1087(1, this, (byte) 125);
        } catch (Exception var10) {
            class142.method1158(null, var10, -105);
        }
        field2588++;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 585)
    public final synchronized void method924(int arg0) {
        field2595++;
        Container var2;
        if (class87.field2010 == null) {
            var2 = class83.field1850.field3365;
        } else {
            var2 = class87.field2010;
        }
        if (class140.field3523 != null) {
            class140.field3523.removeFocusListener(this);
            var2.remove(class140.field3523);
        }
        class140.field3523 = new class76(this);
        var2.add(class140.field3523);
        class140.field3523.setSize(class13.field339, class89.field2095);
        if (arg0 < 75) {
            return;
        }
        class140.field3523.setVisible(true);
        if (class87.field2010 == null) {
            class140.field3523.setLocation(0, 0);
        } else {
            Insets var3 = class87.field2010.getInsets();
            class140.field3523.setLocation(var3.left, var3.top);
        }
        class140.field3523.addFocusListener(this);
        class140.field3523.requestFocus();
        class70.field1655 = true;
        class57.field1421 = false;
        class26.field754 = class29.method361(-5321);
    }

    @OriginalMember(owner = "client!of", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 634)
    public final void focusLost(FocusEvent arg0) {
        field2587++;
        class18.field498 = false;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BIIII)V", line = 645)
    public final void method925(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2584++;
        try {
            if (class66.field1577 == null) {
                if (arg0 < 125) {
                    this.method239(false);
                }
                class13.field339 = arg1;
                class115.field3009 = arg4;
                class89.field2095 = arg2;
                class66.field1577 = this;
                if (class83.field1850 == null) {
                    class79.field1793 = class83.field1850 = new class133(false, this, arg3, null, 0);
                }
                class83.field1850.method1087(1, this, (byte) 125);
            } else {
                class110.field2812++;
                if (class110.field2812 >= 3) {
                    this.method921("alreadyloaded", 21);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class142.method1158(null, var7, -90);
            this.method921("crash", -101);
        }
    }

    @OriginalMember(owner = "client!of", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 686)
    public final void windowClosed(WindowEvent arg0) {
        field2597++;
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V", line = 696)
    public static final void method926(byte arg0) {
        for (class24 var1 = (class24) class83.field1840.method8(-1); var1 != null; var1 = (class24) class83.field1840.method9(1)) {
            if (var1.field673 != null) {
                class37.field1014.method535(var1.field673);
                var1.field673 = null;
            }
            if (var1.field654 != null) {
                class37.field1014.method535(var1.field654);
                var1.field654 = null;
            }
        }
        class83.field1840.method5(true);
        int var2 = 65 % ((arg0 - 13) / 34);
        field2605++;
    }

    @OriginalMember(owner = "client!of", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public abstract void method236(boolean arg0);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public abstract void method230(int arg0);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
    public abstract void method240(boolean arg0);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public abstract void method237(int arg0);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
    public abstract void method239(boolean arg0);
}
