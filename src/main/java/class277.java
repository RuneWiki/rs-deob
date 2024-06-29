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

@OriginalClass("client!wj")
public abstract class class277 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "Z")
    private boolean field4657 = false;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lpm;")
    public static class99 field4626 = null;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lob;")
    public static class78 field4635 = null;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Lbd;")
    public static class162 field4652 = class17.method142(0, "loginscreen");

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lbd;")
    private static class162 field4627 = class17.method142(0, "Created gameworld");

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "Lbd;")
    public static class162 field4663 = class17.method142(0, "Sprites geladen)3");

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Lbd;")
    public static class162 field4647 = field4627;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "Z")
    public static boolean field4665;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "Z")
    public static boolean field4666;

    @OriginalMember(owner = "client!wj", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void update(Graphics arg0) {
        field4651++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 16)
    public static void method1897(int arg0) {
        field4635 = null;
        field4652 = null;
        field4626 = null;
        field4647 = null;
        field4627 = null;
        if (arg0 > -59) {
            field4626 = (class99) null;
        }
        field4663 = null;
    }

    @OriginalMember(owner = "client!wj", name = "run", descriptor = "()V", line = 32)
    public final void run() {
        field4659++;
        try {
            if (class28.field468 != null) {
                String var1 = class28.field468.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class28.field474;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1902(true, "wrongjava");
                        return;
                    }
                    class74.field1173 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class28.field474 == null || class28.field474.equals("1.4.2"))) {
                    this.method1902(true, "wrongjava");
                    return;
                }
            }
            if (class28.field474 != null && class28.field474.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (class28.field474.length() > var4) {
                    char var5 = class28.field474.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 + (var5 - '0');
                }
                if (var3 >= 5) {
                    class160.field2791 = true;
                }
            }
            if (client.field1903.field469 != null) {
                Method var6 = class28.field488;
                if (var6 != null) {
                    try {
                        var6.invoke(client.field1903.field469, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method1908(50);
            class139.field2484 = class111.method894(class308.field5173, -9970, class251.field4201, class252.field4205);
            this.method858(102);
            class260.field4332 = class239.method1688((byte) -90);
            while (class109.field1957 == 0L || class109.field1957 > class300.method2048((byte) 18)) {
                class206.field3477 = class260.field4332.method837(22302, class74.field1173, class274.field4558);
                for (int var8 = 0; var8 < class206.field3477; var8++) {
                    this.method1898(-3810);
                }
                this.method1899(false);
                class128.method1034(class308.field5173, client.field1903, -51);
            }
        } catch (Exception var11) {
            class129.method1039(-8, (String) null, var11);
            this.method1902(true, "crash");
        }
        this.method1900(true, (byte) 73);
    }

    @OriginalMember(owner = "client!wj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 143)
    public final void focusLost(FocusEvent arg0) {
        class285.field4811 = false;
        field4653++;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 155)
    private final void method1898(int arg0) {
        field4655++;
        long var2 = class268.field4491[class206.field3485];
        if (arg0 != -3810) {
            return;
        }
        long var4 = class300.method2048((byte) 18);
        class268.field4491[class206.field3485] = var4;
        if (var2 != 0L && var4 <= var2) {
        }
        class206.field3485 = class206.field3485 + 1 & 0x1F;
        synchronized (this) {
            class141.field2498 = class285.field4811;
        }
        this.method856((byte) -20);
    }

    @OriginalMember(owner = "client!wj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 185)
    public final void focusGained(FocusEvent arg0) {
        class285.field4811 = true;
        field4644++;
        class238.field3958 = true;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V", line = 196)
    private final void method1899(boolean arg0) {
        if (arg0) {
            return;
        }
        long var2 = class300.method2048((byte) 18);
        field4645++;
        long var4 = class105.field1912[class185.field3195];
        class105.field1912[class185.field3195] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class29.field499 = ((var6 >> 1) + 32000) / var6;
        }
        class185.field3195 = class185.field3195 + 1 & 0x1F;
        if ((class314.field5296++) > 50) {
            class238.field3958 = true;
            class314.field5296 -= 50;
            class308.field5173.setSize(class251.field4201, class252.field4205);
            class308.field5173.setVisible(true);
            if (class95.field1740 != null && class168.field2950 == null) {
                Insets var7 = class95.field1740.getInsets();
                class308.field5173.setLocation(var7.left + class173.field3003, class110.field1999 + var7.top);
            } else {
                class308.field5173.setLocation(class173.field3003, class110.field1999);
            }
        }
        this.method853((byte) -94);
    }

    @OriginalMember(owner = "client!wj", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 241)
    public final URL getCodeBase() {
        field4628++;
        if (class95.field1740 == null) {
            return client.field1903 == null || client.field1903.field469 == this ? super.getCodeBase() : client.field1903.field469.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 259)
    public final String getParameter(String arg0) {
        field4646++;
        if (class95.field1740 == null) {
            return client.field1903 == null || client.field1903.field469 == this ? super.getParameter(arg0) : client.field1903.field469.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 275)
    public final void windowDeiconified(WindowEvent arg0) {
        field4662++;
    }

    @OriginalMember(owner = "client!wj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 284)
    public final synchronized void paint(Graphics arg0) {
        field4648++;
        if (class171.field2961 != this || class67.field1068) {
            return;
        }
        class238.field3958 = true;
        if (class160.field2791 && !class117.field2159 && class300.method2048((byte) 18) - class238.field3955 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class194.field3273 && var2.height >= class212.field3562) {
                class180.field3089 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 306)
    public final void windowDeactivated(WindowEvent arg0) {
        field4636++;
    }

    @OriginalMember(owner = "client!wj", name = "stop", descriptor = "()V", line = 315)
    public final void stop() {
        field4664++;
        if (class171.field2961 == this && !class67.field1068) {
            class109.field1957 = class300.method2048((byte) 18) + 4000L;
        }
    }

    @OriginalMember(owner = "client!wj", name = "destroy", descriptor = "()V", line = 327)
    public final void destroy() {
        field4658++;
        if (class171.field2961 == this && !class67.field1068) {
            class109.field1957 = class300.method2048((byte) 18);
            class177.method1342(5000L, 1);
            class264.field4400 = null;
            this.method1900(false, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!wj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 343)
    public final void windowActivated(WindowEvent arg0) {
        field4633++;
    }

    @OriginalMember(owner = "client!wj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 350)
    public final AppletContext getAppletContext() {
        field4632++;
        if (class95.field1740 == null) {
            return client.field1903 == null || client.field1903.field469 == this ? super.getAppletContext() : client.field1903.field469.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 366)
    public final void windowOpened(WindowEvent arg0) {
        field4656++;
    }

    @OriginalMember(owner = "client!wj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 379)
    public final void windowClosed(WindowEvent arg0) {
        field4650++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZB)V", line = 391)
    private final void method1900(boolean arg0, byte arg1) {
        field4643++;
        synchronized (this) {
            if (class67.field1068) {
                return;
            }
            class67.field1068 = true;
        }
        if (client.field1903.field469 != null) {
            client.field1903.field469.destroy();
        }
        try {
            this.method862(107);
        } catch (Exception var13) {
        }
        if (class308.field5173 != null) {
            try {
                class308.field5173.removeFocusListener(this);
                class308.field5173.getParent().remove(class308.field5173);
            } catch (Exception var12) {
            }
        }
        if (client.field1903 != null) {
            try {
                client.field1903.method223(true);
            } catch (Exception var11) {
            }
        }
        this.method855(false);
        if (class95.field1740 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
        int var9 = -79 / ((-arg1 - 77) / 34);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIZI)V", line = 451)
    public final void method1901(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4639++;
        try {
            if (class171.field2961 != null) {
                class194.field3278++;
                if (class194.field3278 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1902(true, "alreadyloaded");
                return;
            }
            class173.field3003 = 0;
            class251.field4201 = arg2;
            class194.field3273 = arg2;
            class110.field1999 = 0;
            class252.field4205 = arg0;
            class212.field3562 = arg0;
            class260.field4326 = arg4;
            class171.field2961 = this;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class173.field2991 = true;
            } else {
                class173.field2991 = false;
            }
            if (client.field1903 == null) {
                class264.field4400 = client.field1903 = new class28(this, arg1, (String) null, 0);
            }
            class166 var7 = client.field1903.method241((byte) -108, this, 1);
            if (!arg3) {
                field4635 = (class78) null;
            }
            while (var7.field2934 == 0) {
                class177.method1342(10L, 1);
            }
            class288.field4853 = (Thread) var7.field2933;
        } catch (Exception var9) {
            class129.method1039(-8, (String) null, var9);
            this.method1902(true, "crash");
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 507)
    public final void method1902(boolean arg0, String arg1) {
        field4629++;
        if (this.field4657) {
            return;
        }
        this.field4657 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIILjava/lang/String;ZI)V", line = 532)
    public final void method1903(int arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, int arg6) {
        try {
            class110.field1999 = 0;
            class252.field4205 = arg2;
            class212.field3562 = arg2;
            class173.field3003 = 0;
            class260.field4326 = arg0;
            class171.field2961 = this;
            class251.field4201 = arg6;
            class194.field3273 = arg6;
            class95.field1740 = new Frame();
            class95.field1740.setTitle("Jagex");
            class95.field1740.setResizable(true);
            class95.field1740.addWindowListener(this);
            class95.field1740.setVisible(arg5);
            class95.field1740.toFront();
            Insets var8 = class95.field1740.getInsets();
            class95.field1740.setSize(class194.field3273 + var8.left + var8.right, class212.field3562 - -var8.top + var8.bottom);
            class264.field4400 = client.field1903 = new class28((Applet) null, arg3, arg4, arg1);
            class166 var9 = client.field1903.method241((byte) -123, this, 1);
            while (var9.field2934 == 0) {
                class177.method1342(10L, 1);
            }
            class288.field4853 = (Thread) var9.field2933;
        } catch (Exception var11) {
            class129.method1039(-8, (String) null, var11);
        }
        field4654++;
    }

    @OriginalMember(owner = "client!wj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 581)
    public final void windowIconified(WindowEvent arg0) {
        field4638++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V", line = 588)
    public static final void method1904(int arg0, int arg1) {
        class112.field2022.method1538(arg0, (byte) -14);
        class27.field459.method1538(arg0, (byte) -109);
        class93.field1647.method1538(arg0, (byte) -31);
        int var2 = -63 / ((17 - arg1) / 35);
        field4649++;
        class284.field4806.method1538(arg0, (byte) -72);
    }

    @OriginalMember(owner = "client!wj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 601)
    public final URL getDocumentBase() {
        field4634++;
        if (class95.field1740 == null) {
            return client.field1903 == null || client.field1903.field469 == this ? super.getDocumentBase() : client.field1903.field469.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)V", line = 619)
    public static final void method1905(boolean arg0, int arg1) {
        if (arg0) {
            method1897(-47);
        }
        class12.field190.method1538(arg1, (byte) -46);
        field4660++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lob;II)Lbd;", line = 637)
    public static final class162 method1906(class78 arg0, int arg1, int arg2) {
        field4661++;
        int var3 = 44 % ((-arg1 - 43) / 47);
        if (!class136.method1066(client.method861(arg0), arg2, -1) && arg0.field1356 == null) {
            return null;
        } else if (arg0.field1232 == null || arg0.field1232.length <= arg2 || arg0.field1232[arg2] == null || arg0.field1232[arg2].method1278(-1).method1249((byte) -118) == 0) {
            return class255.field4223 ? class135.method1062(new class162[] { class131.field2367, class156.method1212(10, arg2) }, true) : null;
        } else {
            return arg0.field1232[arg2];
        }
    }

    @OriginalMember(owner = "client!wj", name = "providesignlink", descriptor = "(Lib;)V", line = 660)
    public static final void providesignlink(class28 arg0) {
        field4640++;
        client.field1903 = arg0;
        class264.field4400 = arg0;
    }

    @OriginalMember(owner = "client!wj", name = "start", descriptor = "()V", line = 668)
    public final void start() {
        field4641++;
        if (class171.field2961 == this && !class67.field1068) {
            class109.field1957 = 0L;
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)Z", line = 682)
    public final boolean method1907(int arg0) {
        if (arg0 != 23923) {
            return true;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field4642++;
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
                this.method1902(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V", line = 721)
    public final synchronized void method1908(int arg0) {
        field4631++;
        if (class308.field5173 != null) {
            class308.field5173.removeFocusListener(this);
            class308.field5173.getParent().remove(class308.field5173);
        }
        Container var2;
        if (class168.field2950 != null) {
            var2 = class168.field2950;
        } else if (class95.field1740 == null) {
            var2 = client.field1903.field469;
        } else {
            var2 = class95.field1740;
        }
        var2.setLayout((LayoutManager) null);
        class308.field5173 = new class304(this);
        var2.add(class308.field5173);
        class308.field5173.setSize(class251.field4201, class252.field4205);
        if (arg0 != 50) {
            return;
        }
        class308.field5173.setVisible(true);
        if (class95.field1740 == var2) {
            Insets var3 = class95.field1740.getInsets();
            class308.field5173.setLocation(class173.field3003 + var3.left, class110.field1999 + var3.top);
        } else {
            class308.field5173.setLocation(class173.field3003, class110.field1999);
        }
        class308.field5173.addFocusListener(this);
        class308.field5173.requestFocus();
        class285.field4811 = true;
        class238.field3958 = true;
        class180.field3089 = false;
        class141.field2498 = true;
        class238.field3955 = class300.method2048((byte) 18);
    }

    @OriginalMember(owner = "client!wj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 780)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4630++;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public abstract void method858(int arg0);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public abstract void method853(byte arg0);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
    public abstract void method856(byte arg0);

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public abstract void method862(int arg0);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V")
    public abstract void method855(boolean arg0);

    @OriginalMember(owner = "client!wj", name = "init", descriptor = "()V")
    public abstract void init();
}
