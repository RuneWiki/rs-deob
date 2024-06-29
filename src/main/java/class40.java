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

@OriginalClass("client!ra")
public abstract class class40 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Z")
    private boolean field628 = false;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lr;")
    private static class66 field639 = class93.method641(43, "http:)4)4advert)3runescape)3com)4banner)3ws?size=729");

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "Lr;")
    public static class66 field655 = class93.method641(43, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Lr;")
    public static class66 field658 = class93.method641(43, "titlebg");

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Lr;")
    public static class66 field653 = field639;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Z")
    public static boolean field664;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Z")
    public static boolean field665;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Z")
    public static boolean field666;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public abstract void method239(byte arg0);

    @OriginalMember(owner = "client!ra", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field634++;
        if (class44.field778 != this || class101.field1967) {
            return;
        }
        class89.field1721 = true;
        if (class117.field2200 != null && class117.field2200.startsWith("1.5") && class3.method13(17161) - class109.field2116 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class154.field2747 && var2.height >= class28.field425) {
                class176.field3098 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class44.field770 = false;
        field637++;
    }

    @OriginalMember(owner = "client!ra", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field654++;
    }

    @OriginalMember(owner = "client!ra", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field631++;
    }

    @OriginalMember(owner = "client!ra", name = "run", descriptor = "()V")
    public final void run() {
        field652++;
        try {
            if (class117.field2178 != null) {
                String var1 = class117.field2178.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class117.field2200;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method240(690, "wrongjava");
                        return;
                    }
                    class193.field3342 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class117.field2200 == null || class117.field2200.equals("1.4.2"))) {
                    this.method240(690, "wrongjava");
                    return;
                }
            }
            if (class95.field1835.field2184 != null) {
                Method var3 = class117.field2186;
                if (var3 != null) {
                    try {
                        var3.invoke(class95.field1835.field2184, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method254((byte) -104);
            class52.field908 = class88.method623(class131.field2452, class19.field257, class12.field143, -115);
            this.method250(-1);
            class156.field2773 = class145.method1004(-86);
            while (class125.field2369 == 0L || class3.method13(17161) < class125.field2369) {
                class24.field312 = class156.field2773.method211(class193.field3342, -19, class127.field2371);
                for (int var4 = 0; var4 < class24.field312; var4++) {
                    this.method253((byte) -71);
                }
                this.method248(-16633);
                class253.method1700(class95.field1835, class131.field2452, (byte) -108);
            }
        } catch (Exception var7) {
            class181.method1205((String) null, var7, 38);
            this.method240(690, "crash");
        }
        this.method244(true, 1000);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method240(int arg0, String arg1) {
        field642++;
        if (this.field628) {
            return;
        }
        this.field628 = true;
        if (arg0 != 690) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field647++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Z")
    public static final boolean method241(byte arg0, int arg1) {
        field661++;
        if (arg1 < 0) {
            return false;
        } else if (arg0 > -120) {
            return false;
        } else {
            int var2 = class43.field710[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1007;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Lcf;")
    public static final class157 method242(int arg0, int arg1) {
        if (arg0 != -25672) {
            field655 = null;
        }
        field625++;
        class157 var2 = (class157) class119.field2253.method1617(14366, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class131.field2433.method135(class240.method1580(arg1, 255), arg0 + 25672, class109.method738(arg1, (byte) 117));
        class157 var4 = new class157();
        var4.field2801 = arg1;
        if (var3 != null) {
            var4.method1068((byte) -7, new class249(var3));
        }
        var4.method1066(arg0 ^ 0xFFFF9BB9);
        if (var4.field2836 != -1) {
            var4.method1065((byte) -106, method242(-25672, var4.field2829), method242(arg0, var4.field2836));
        }
        if (var4.field2790 != -1) {
            var4.method1070(method242(-25672, var4.field2790), arg0 ^ 0x6476, method242(-25672, var4.field2796));
        }
        if (!class125.field2364 && var4.field2822) {
            var4.field2820 = null;
            var4.field2813 = class140.field2596;
            var4.field2834 = 0;
            var4.field2817 = false;
            var4.field2791 = null;
        }
        class119.field2253.method1615(var4, 106, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)V")
    public final void method243(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field651++;
        try {
            if (class44.field778 == null) {
                class242.field4240 = 0;
                class44.field778 = this;
                class164.field2939 = 0;
                class29.field431 = arg4;
                class19.field257 = arg3;
                class154.field2747 = arg3;
                class12.field143 = arg2;
                class28.field425 = arg2;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (arg0 < -1) {
                    if (class95.field1835 == null) {
                        class192.field3325 = class95.field1835 = new class117(false, this, arg1, (String) null, 0);
                    }
                    class95.field1835.method770((byte) -95, 1, this);
                }
            } else {
                class184.field3215++;
                if (class184.field3215 >= 3) {
                    this.method240(690, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class181.method1205((String) null, var8, 38);
            this.method240(690, "crash");
        }
    }

    @OriginalMember(owner = "client!ra", name = "stop", descriptor = "()V")
    public final void stop() {
        field632++;
        if (class44.field778 == this && !class101.field1967) {
            class125.field2369 = class3.method13(17161) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V")
    private final void method244(boolean arg0, int arg1) {
        field633++;
        synchronized (this) {
            if (class101.field1967) {
                return;
            }
            class101.field1967 = true;
        }
        if (class95.field1835.field2184 != null) {
            class95.field1835.field2184.destroy();
        }
        try {
            this.method252(-121);
        } catch (Exception var9) {
        }
        if (class131.field2452 != null) {
            try {
                class131.field2452.removeFocusListener(this);
                class131.field2452.getParent().remove(class131.field2452);
            } catch (Exception var8) {
            }
        }
        if (class95.field1835 != null) {
            try {
                class95.field1835.method778(0);
            } catch (Exception var7) {
            }
        }
        if (arg1 != 1000) {
            field624 = -96;
        }
        this.method247(-61);
        if (class158.field2857 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method245(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field662++;
        try {
            class164.field2939 = 0;
            class242.field4240 = 0;
            class19.field257 = arg0;
            class154.field2747 = arg0;
            class44.field778 = this;
            class29.field431 = arg5;
            class12.field143 = arg1;
            class28.field425 = arg1;
            class158.field2857 = new Frame();
            class158.field2857.setTitle("Jagex");
            class158.field2857.setResizable(true);
            class158.field2857.addWindowListener(this);
            class158.field2857.setVisible(true);
            class158.field2857.toFront();
            Insets var8 = class158.field2857.getInsets();
            class158.field2857.setSize(class154.field2747 + var8.right + var8.left, class28.field425 - -var8.top + var8.bottom);
            class192.field3325 = class95.field1835 = new class117(true, (Applet) null, arg6, arg4, arg3);
            class95.field1835.method770((byte) -36, 1, this);
            if (arg2 < 86) {
                this.getDocumentBase();
            }
        } catch (Exception var10) {
            class181.method1205((String) null, var10, 38);
        }
    }

    @OriginalMember(owner = "client!ra", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field627++;
    }

    @OriginalMember(owner = "client!ra", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field636++;
        if (class158.field2857 == null) {
            return class95.field1835 == null || class95.field1835.field2184 == this ? super.getDocumentBase() : class95.field1835.field2184.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public static void method246(byte arg0) {
        int var1 = 35 / ((-arg0 - 70) / 44);
        field639 = null;
        field653 = null;
        field658 = null;
        field655 = null;
    }

    @OriginalMember(owner = "client!ra", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public abstract void method247(int arg0);

    @OriginalMember(owner = "client!ra", name = "providesignlink", descriptor = "(Lik;)V")
    public static final void providesignlink(class117 arg0) {
        field630++;
        class95.field1835 = arg0;
        class192.field3325 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    private final void method248(int arg0) {
        field648++;
        long var2 = class3.method13(17161);
        long var4 = class131.field2442[class26.field333];
        if (arg0 != -16633) {
            providesignlink((class117) null);
        }
        class131.field2442[class26.field333] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class194.field3357 = ((var6 >> 1) + 32000) / var6;
        }
        class26.field333 = class26.field333 + 1 & 0x1F;
        if ((class192.field3321++) > 50) {
            class89.field1721 = true;
            class192.field3321 -= 50;
            class131.field2452.setSize(class19.field257, class12.field143);
            class131.field2452.setVisible(true);
            if (class158.field2857 != null && class7.field58 == null) {
                Insets var7 = class158.field2857.getInsets();
                class131.field2452.setLocation(var7.left + class242.field4240, class164.field2939 + var7.top);
            } else {
                class131.field2452.setLocation(class242.field4240, class164.field2939);
            }
        }
        this.method239((byte) -75);
    }

    @OriginalMember(owner = "client!ra", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field659++;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)Z")
    public final boolean method249(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field657++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = 105 / ((arg0 - 9) / 35);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method240(690, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public abstract void method250(int arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field640++;
        if (arg4 != 1000) {
            field629 = -56;
        }
        if (class165.field2972 <= arg6 && class215.field3706 >= arg3 && class241.field4186 <= arg7 && class222.field3788 >= arg1) {
            class145.method998(arg2, arg6, arg1, arg5, arg7, arg3, arg0, arg4 - 18229);
        } else {
            class162.method1093(arg2, arg7, arg3, arg0, arg5, arg1, false, arg6);
        }
    }

    @OriginalMember(owner = "client!ra", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field641++;
        if (class158.field2857 == null) {
            return class95.field1835 == null || class95.field1835.field2184 == this ? super.getCodeBase() : class95.field1835.field2184.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public abstract void method252(int arg0);

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)V")
    private final void method253(byte arg0) {
        long var2 = class3.method13(17161);
        field623++;
        long var4 = class201.field3459[class133.field2472];
        class201.field3459[class133.field2472] = var2;
        class133.field2472 = class133.field2472 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 > -60) {
                this.destroy();
            }
            class109.field2118 = class44.field770;
        }
        this.method256(2);
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field663++;
    }

    @OriginalMember(owner = "client!ra", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field650++;
    }

    @OriginalMember(owner = "client!ra", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class44.field770 = true;
        class89.field1721 = true;
        field626++;
    }

    @OriginalMember(owner = "client!ra", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field646++;
        if (class158.field2857 == null) {
            return class95.field1835 == null || class95.field1835.field2184 == this ? super.getParameter(arg0) : class95.field1835.field2184.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V")
    public final synchronized void method254(byte arg0) {
        if (class131.field2452 != null) {
            class131.field2452.removeFocusListener(this);
            class131.field2452.getParent().remove(class131.field2452);
        }
        int var2 = 42 / ((32 - arg0) / 53);
        Container var3;
        if (class7.field58 != null) {
            var3 = class7.field58;
        } else if (class158.field2857 == null) {
            var3 = class95.field1835.field2184;
        } else {
            var3 = class158.field2857;
        }
        field645++;
        var3.setLayout((LayoutManager) null);
        class131.field2452 = new class253(this);
        var3.add(class131.field2452);
        class131.field2452.setSize(class19.field257, class12.field143);
        class131.field2452.setVisible(true);
        if (class158.field2857 == var3) {
            Insets var4 = class158.field2857.getInsets();
            class131.field2452.setLocation(var4.left + class242.field4240, class164.field2939 + var4.top);
        } else {
            class131.field2452.setLocation(class242.field4240, class164.field2939);
        }
        class131.field2452.addFocusListener(this);
        class131.field2452.requestFocus();
        class44.field770 = true;
        class109.field2118 = true;
        class89.field1721 = true;
        class176.field3098 = false;
        class109.field2116 = class3.method13(17161);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lfa;I)I")
    public static final int method255(class45 arg0, int arg1) {
        field660++;
        if (arg1 != -6694) {
            providesignlink((class117) null);
        }
        int var2 = arg0.field822;
        if (arg0.field2046 == arg0.field2040) {
            var2 = arg0.field803;
        } else if (arg0.field2056 == arg0.field2040) {
            var2 = arg0.field810;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "start", descriptor = "()V")
    public final void start() {
        field635++;
        if (class44.field778 == this && !class101.field1967) {
            class125.field2369 = 0L;
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public abstract void method256(int arg0);

    @OriginalMember(owner = "client!ra", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field656++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ra", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field643++;
        if (class158.field2857 == null) {
            return class95.field1835 == null || class95.field1835.field2184 == this ? super.getAppletContext() : class95.field1835.field2184.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field649++;
        if (class44.field778 == this && !class101.field1967) {
            class125.field2369 = class3.method13(17161);
            class91.method636(-5, 5000L);
            class192.field3325 = null;
            this.method244(false, 1000);
        }
    }
}
