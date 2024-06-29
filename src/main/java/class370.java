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

@OriginalClass("client!ak")
public abstract class class370 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "Z")
    private boolean field4618 = false;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "Z")
    private boolean field4630 = false;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field4599 = 0;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Llja;")
    public static class744 field4602 = new class744(7, 7);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ak", name = "gb", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "Lnja;")
    public static class456 field4631;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "Z")
    public static boolean field4637;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "Z")
    public static boolean field4638;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "Z")
    public static boolean field4639;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "Z")
    public static boolean field4640;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "Z")
    public static boolean field4644;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "Z")
    public static boolean field4645;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "Z")
    public static boolean field4647;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "Z")
    public static boolean field4648;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "Z")
    public static boolean field4649;

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "Z")
    public static boolean field4650;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V", line = 3)
    private final void method2155(boolean arg0, int arg1) {
        field4623++;
        synchronized (this) {
            if (class38.field559) {
                return;
            }
            class38.field559 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class345.field4331 != null) {
            class345.field4331.destroy();
        }
        try {
            this.method1896(-38);
        } catch (Exception var9) {
        }
        if (this.field4630) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field4630 = false;
        }
        class405.method2433(true, (byte) 76);
        class729.method4121(-10020);
        if (class109.field1370 != null) {
            try {
                class109.field1370.removeFocusListener(this);
                class109.field1370.getParent().remove(class109.field1370);
            } catch (Exception var7) {
            }
        }
        if (class521.field7389 != null) {
            try {
                class521.field7389.method3788((byte) 94);
            } catch (Exception var6) {
            }
        }
        this.method1887(7);
        if (class645.field8790 != null) {
            class645.field8790.setVisible(false);
            class645.field8790.dispose();
            class645.field8790 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
        if (arg1 != 28565) {
            method2157(false);
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 77)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4611++;
    }

    @OriginalMember(owner = "client!ak", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 89)
    public final synchronized void paint(Graphics arg0) {
        field4633++;
        if (class672.field9220 != this || class38.field559) {
            return;
        }
        class4.field45 = true;
        if (class57.field776 && (class349.method2069(true) - class594.field8078) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class484.field6751 <= var2.width && var2.height >= class39.field570) {
                class144.field1811 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 110)
    public final void windowClosed(WindowEvent arg0) {
        field4629++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Z", line = 117)
    public static final boolean method2156(int arg0, int arg1, int arg2) {
        if (arg2 != 540800) {
            method2167(-71, true);
        }
        field4598++;
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!ak", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 132)
    public final URL getCodeBase() {
        field4607++;
        if (class645.field8790 == null) {
            return class345.field4331 == null || class345.field4331 == this ? super.getCodeBase() : class345.field4331.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 147)
    public final void focusLost(FocusEvent arg0) {
        field4601++;
        class716.field10032 = false;
    }

    @OriginalMember(owner = "client!ak", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 156)
    public static final void provideLoaderApplet(Applet arg0) {
        class345.field4331 = arg0;
        field4627++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 164)
    public static void method2157(boolean arg0) {
        field4631 = null;
        if (arg0) {
            method2157(false);
        }
        field4602 = null;
    }

    @OriginalMember(owner = "client!ak", name = "run", descriptor = "()V", line = 175)
    public final void run() {
        field4597++;
        try {
            if (class675.field9270 != null) {
                String var1 = class675.field9270.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class675.field9267;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2161("wrongjava", -121);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class675.field9267 == null || class675.field9267.equals("1.4.2"))) {
                    this.method2161("wrongjava", -108);
                    return;
                }
            }
            if (class675.field9267 != null && class675.field9267.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class675.field9267.length() > var3) {
                    char var5 = class675.field9267.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class57.field776 = true;
                }
            }
            Applet var6 = class672.field9220;
            if (class345.field4331 != null) {
                var6 = class345.field4331;
            }
            Method var7 = class675.field9247;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class531.method3164(-13918);
            class341.method2026(0);
            this.method1897(97);
            this.method1879((byte) -31);
            class253.field2957 = class371.method2171((byte) 111);
            while (class722.field10137 == 0L || class722.field10137 > class349.method2069(true)) {
                class706.field9923 = class253.field2957.method1830((byte) -94, class392.field5078);
                for (int var8 = 0; var8 < class706.field9923; var8++) {
                    this.method2158((byte) 71);
                }
                this.method2162((byte) -102);
                class201.method1300(class109.field1370, class521.field7389, (byte) -115);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class705.method4008(var20, this.method1874(0), -123);
            this.method2161("crash", -105);
        } finally {
            Object var13 = null;
            this.method2155(true, 28565);
        }
    }

    @OriginalMember(owner = "client!ak", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 296)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4606++;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V", line = 305)
    private final void method2158(byte arg0) {
        field4613++;
        long var2 = class349.method2069(true);
        long var4 = class398.field5206[class788.field10863];
        class398.field5206[class788.field10863] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 < 62) {
            return;
        }
        class788.field10863 = class788.field10863 + 1 & 0x1F;
        synchronized (this) {
            class63.field862 = class716.field10032;
        }
        this.method1877(-28595);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/String;ZIIB)V", line = 342)
    public final void method2159(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5, int arg6, byte arg7) {
        field4609++;
        try {
            class269.field3181 = 0;
            class239.field2816 = null;
            class494.field6874 = arg0;
            class672.field9220 = this;
            class701.field9880 = arg6;
            class484.field6751 = arg6;
            class449.field6100 = 0;
            class705.field9921 = arg5;
            class39.field570 = arg5;
            class645.field8790 = new Frame();
            class645.field8790.setTitle("Jagex");
            class645.field8790.setResizable(true);
            if (arg7 < -58) {
                class645.field8790.addWindowListener(this);
                class645.field8790.setVisible(true);
                class645.field8790.toFront();
                Insets var9 = class645.field8790.getInsets();
                class645.field8790.setSize(class484.field6751 + var9.left + var9.right, class39.field570 + var9.bottom - -var9.top);
                class752.field10434 = class521.field7389 = new class675(arg1, arg3, arg2, true);
                class561 var10 = class521.field7389.method3805(1, 76, this);
                while (var10.field7769 == 0) {
                    class594.method3405(10L, 16711680);
                }
            }
        } catch (Exception var12) {
            class705.method4008(var12, null, -124);
        }
    }

    @OriginalMember(owner = "client!ak", name = "destroy", descriptor = "()V", line = 387)
    public final void destroy() {
        field4622++;
        if (class672.field9220 == this && !class38.field559) {
            class722.field10137 = class349.method2069(true);
            class594.method3405(5000L, 16711680);
            class752.field10434 = null;
            this.method2155(false, 28565);
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)Z", line = 401)
    public final boolean method2160(byte arg0) {
        if (arg0 >= 0) {
            this.field4630 = true;
        }
        field4628++;
        return class37.method326((byte) 122, "jagmisc");
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 417)
    public final void method2161(String arg0, int arg1) {
        field4603++;
        if (this.field4618) {
            return;
        }
        this.field4618 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 > -95) {
                return;
            }
            class745.method4171("loggedout", class345.field4331, (byte) 25);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ak", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 442)
    public final void windowActivated(WindowEvent arg0) {
        field4612++;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V", line = 451)
    private final void method2162(byte arg0) {
        field4595++;
        long var2 = class349.method2069(true);
        long var4 = class274.field3215[class300.field3597];
        class274.field3215[class300.field3597] = var2;
        class300.field3597 = class300.field3597 + 1 & 0x1F;
        int var6 = 51 / ((-arg0 - 12) / 46);
        if (var4 != 0L && var4 < var2) {
            int var7 = (int) (var2 - var4);
            class496.field6902 = ((var7 >> 1) + 32000) / var7;
        }
        if (class269.field3178++ > 50) {
            class269.field3178 -= 50;
            class4.field45 = true;
            class109.field1370.setSize(class701.field9880, class705.field9921);
            class109.field1370.setVisible(true);
            if (class645.field8790 != null && class260.field3075 == null) {
                Insets var8 = class645.field8790.getInsets();
                class109.field1370.setLocation(var8.left + class449.field6100, class269.field3181 + var8.top);
            } else {
                class109.field1370.setLocation(class449.field6100, class269.field3181);
            }
        }
        this.method1889(-3);
    }

    @OriginalMember(owner = "client!ak", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 494)
    public final void windowDeactivated(WindowEvent arg0) {
        field4594++;
    }

    @OriginalMember(owner = "client!ak", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 510)
    public final void focusGained(FocusEvent arg0) {
        class716.field10032 = true;
        field4604++;
        class4.field45 = true;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Z", line = 520)
    public final boolean method2163(int arg0) {
        field4619++;
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
            if (arg0 != -1) {
                this.windowActivated(null);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method2161("invalidhost", -99);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "start", descriptor = "()V", line = 560)
    public final void start() {
        field4608++;
        if (class672.field9220 == this && !class38.field559) {
            class722.field10137 = 0L;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Z", line = 572)
    public final boolean method2164(int arg0) {
        int var2 = 87 % ((arg0 - 15) / 41);
        field4596++;
        return class37.method326((byte) 121, "jagtheora");
    }

    @OriginalMember(owner = "client!ak", name = "stop", descriptor = "()V", line = 583)
    public final void stop() {
        field4617++;
        if (class672.field9220 == this && !class38.field559) {
            class722.field10137 = class349.method2069(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ak", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 597)
    public final String getParameter(String arg0) {
        field4610++;
        if (class645.field8790 == null) {
            return class345.field4331 == null || class345.field4331 == this ? super.getParameter(arg0) : class345.field4331.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 612)
    public final void method2165(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4616++;
        try {
            if (class672.field9220 == null) {
                int var8 = -111 % ((16 - arg4) / 32);
                class269.field3181 = 0;
                class494.field6874 = arg6;
                class449.field6100 = 0;
                class701.field9880 = arg0;
                class484.field6751 = arg0;
                class239.field2816 = class345.field4331;
                class672.field9220 = this;
                class705.field9921 = arg3;
                class39.field570 = arg3;
                class752.field10434 = class521.field7389 = new class675(arg5, arg1, arg2, class345.field4331 != null);
                class561 var9 = class521.field7389.method3805(1, -91, this);
                while (var9.field7769 == 0) {
                    class594.method3405(10L, 16711680);
                }
            } else {
                class271.field3195++;
                if (class271.field3195 >= 3) {
                    this.method2161("alreadyloaded", -128);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var11) {
            class705.method4008(var11, null, -124);
            this.method2161("crash", -128);
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)Z", line = 662)
    public final boolean method2166(int arg0) {
        field4624++;
        return arg0 == 5000 ? class37.method326((byte) 120, "jaclib") : true;
    }

    @OriginalMember(owner = "client!ak", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 673)
    public final URL getDocumentBase() {
        field4600++;
        if (class645.field8790 == null) {
            return class345.field4331 == null || class345.field4331 == this ? super.getDocumentBase() : class345.field4331.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Ljava/lang/String;", line = 693)
    public String method1874(int arg0) {
        if (arg0 != 0) {
            field4602 = null;
        }
        field4632++;
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
    public final void windowIconified(WindowEvent arg0) {
        field4626++;
    }

    @OriginalMember(owner = "client!ak", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 713)
    public final AppletContext getAppletContext() {
        field4625++;
        if (class645.field8790 == null) {
            return class345.field4331 == null || class345.field4331 == this ? super.getAppletContext() : class345.field4331.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)Z", line = 730)
    public static final boolean method2167(int arg0, boolean arg1) {
        if (arg1) {
            return false;
        } else {
            field4620++;
            return arg0 == 7 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V", line = 743)
    public synchronized void method1897(int arg0) {
        if (class109.field1370 != null) {
            class109.field1370.removeFocusListener(this);
            class109.field1370.getParent().setBackground(Color.black);
            class109.field1370.getParent().remove(class109.field1370);
        }
        field4614++;
        Container var2;
        if (class260.field3075 != null) {
            var2 = class260.field3075;
        } else if (class645.field8790 != null) {
            var2 = class645.field8790;
        } else if (class345.field4331 == null) {
            var2 = class672.field9220;
        } else {
            var2 = class345.field4331;
        }
        var2.setLayout(null);
        class109.field1370 = new class572(this);
        var2.add(class109.field1370);
        class109.field1370.setSize(class701.field9880, class705.field9921);
        class109.field1370.setVisible(true);
        int var3 = 24 % ((13 - arg0) / 62);
        if (class645.field8790 == var2) {
            Insets var4 = class645.field8790.getInsets();
            class109.field1370.setLocation(class449.field6100 + var4.left, class269.field3181 + var4.top);
        } else {
            class109.field1370.setLocation(class449.field6100, class269.field3181);
        }
        class109.field1370.addFocusListener(this);
        class109.field1370.requestFocus();
        class716.field10032 = true;
        class63.field862 = true;
        class4.field45 = true;
        class144.field1811 = false;
        class594.field8078 = class349.method2069(true);
    }

    @OriginalMember(owner = "client!ak", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 794)
    public final void windowDeiconified(WindowEvent arg0) {
        field4605++;
    }

    @OriginalMember(owner = "client!ak", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 807)
    public final void windowOpened(WindowEvent arg0) {
        field4621++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public abstract void method1879(byte arg0);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public abstract void method1896(int arg0);

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public abstract void method1877(int arg0);

    @OriginalMember(owner = "client!ak", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V")
    public abstract void method1887(int arg0);

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "(I)V")
    public abstract void method1889(int arg0);
}
