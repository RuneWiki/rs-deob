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

@OriginalClass("client!rc")
public abstract class class374 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
    private boolean field5050 = false;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
    private boolean field5058 = false;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field5064 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "Z")
    public static boolean field5082;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "Z")
    public static boolean field5083;

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 8)
    public final void focusGained(FocusEvent arg0) {
        field5060++;
        class323.field4235 = true;
        class366.field4959 = true;
    }

    @OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 17)
    public final void windowDeactivated(WindowEvent arg0) {
        field5061++;
    }

    @OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 26)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field5045++;
    }

    @OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 35)
    public final synchronized void paint(Graphics arg0) {
        field5049++;
        if (class116.field1654 != this || class441.field6050) {
            return;
        }
        class366.field4959 = true;
        if (class437.field5996 && class498.method2854(-127) - class30.field507 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class184.field2617 && var2.height >= class445.field6092) {
                class18.field302 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V", line = 57)
    public final void method2161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5047++;
        try {
            if (class116.field1654 == null) {
                class423.field5794 = arg3;
                class175.field2555 = arg0;
                class445.field6092 = arg0;
                class116.field1654 = this;
                class149.field2132 = arg2;
                class184.field2617 = arg2;
                if (arg4 > -36) {
                    this.method1250((byte) -21);
                }
                class269.field3539 = 0;
                class224.field3023 = 0;
                if (class389.field5281 == null) {
                    class253.field3359 = class389.field5281 = new class216(this, arg1, null, 0);
                }
                class446 var6 = class389.field5281.method1353(1, -34, this);
                while (var6.field6100 == 0) {
                    class94.method674(10L, 1);
                }
            } else {
                class217.field2936++;
                if (class217.field2936 >= 3) {
                    this.method2163("alreadyloaded", (byte) 95);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class504.method2879(var8, null, -19638);
            this.method2163("crash", (byte) 126);
        }
    }

    @OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 106)
    public final URL getCodeBase() {
        field5067++;
        if (class273.field3572 == null) {
            return class389.field5281 == null || class389.field5281.field2917 == this ? super.getCodeBase() : class389.field5281.field2917.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 125)
    public final void windowActivated(WindowEvent arg0) {
        field5077++;
    }

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 136)
    public final void focusLost(FocusEvent arg0) {
        class323.field4235 = false;
        field5072++;
    }

    @OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 145)
    public final String getParameter(String arg0) {
        field5071++;
        if (class273.field3572 == null) {
            return class389.field5281 == null || class389.field5281.field2917 == this ? super.getParameter(arg0) : class389.field5281.field2917.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 160)
    public final void windowIconified(WindowEvent arg0) {
        field5055++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIB)V", line = 169)
    public static final void method2162(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field5054++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg1 * arg1;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg0 >= class353.field4777 && class300.field3971 >= arg0) {
            int var20 = class99.method710(arg1 + arg2, (byte) -29, class71.field1077, class308.field4055);
            int var21 = class99.method710(arg2 - arg1, (byte) -29, class71.field1077, class308.field4055);
            class427.method2465(class457.field6299[arg0], var20, var21, -7, arg3);
        }
        int var22 = (arg4 - 1) * var15;
        if (arg5 <= 90) {
            return;
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class353.field4777 <= var24 && class300.field3971 >= var23) {
                int var25 = class99.method710(arg2 + var6, (byte) -29, class71.field1077, class308.field4055);
                int var26 = class99.method710(arg2 - var6, (byte) -29, class71.field1077, class308.field4055);
                if (class353.field4777 <= var23) {
                    class427.method2465(class457.field6299[var23], var25, var26, -7, arg3);
                }
                if (class300.field3971 >= var24) {
                    class427.method2465(class457.field6299[var24], var25, var26, -7, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 272)
    public final URL getDocumentBase() {
        field5044++;
        if (class273.field3572 == null) {
            return class389.field5281 == null || class389.field5281.field2917 == this ? super.getDocumentBase() : class389.field5281.field2917.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 287)
    public final void windowClosing(WindowEvent arg0) {
        field5065++;
        this.destroy();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 295)
    public final void method2163(String arg0, byte arg1) {
        field5062++;
        if (this.field5050) {
            return;
        }
        this.field5050 = true;
        System.out.println("error_game_" + arg0);
        try {
            class87.method637(-111, class389.field5281.field2917, "loggedout");
        } catch (Throwable var5) {
        }
        int var3 = 32 / ((-arg1 - 4) / 45);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V", line = 325)
    private final void method2164(boolean arg0, int arg1) {
        field5056++;
        synchronized (this) {
            if (class441.field6050) {
                return;
            }
            class441.field6050 = true;
        }
        if (class389.field5281.field2917 != null) {
            class389.field5281.field2917.destroy();
        }
        int var4 = 68 / ((-arg1 - 15) / 47);
        try {
            this.method1250((byte) -125);
        } catch (Exception var12) {
        }
        if (this.field5058) {
            try {
                jagmisc.quit();
            } catch (Throwable var11) {
            }
            this.field5058 = false;
        }
        class446 var5 = class389.field5281.method1355(true, class116.field1654.getClass());
        while (var5.field6100 == 0) {
            class94.method674(100L, 1);
        }
        if (class518.field7663 != null) {
            try {
                class518.field7663.removeFocusListener(this);
                class518.field7663.getParent().remove(class518.field7663);
            } catch (Exception var10) {
            }
        }
        if (class389.field5281 != null) {
            try {
                class389.field5281.method1364(95);
            } catch (Exception var9) {
            }
        }
        this.method1251((byte) 97);
        if (class273.field3572 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 405)
    public final AppletContext getAppletContext() {
        field5076++;
        if (class273.field3572 == null) {
            return class389.field5281 == null || class389.field5281.field2917 == this ? super.getAppletContext() : class389.field5281.field2917.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Ljava/lang/String;B)I", line = 421)
    public static final int method2165(String arg0, byte arg1) {
        field5046++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - class427.method2463(true, arg0.charAt(var4)));
        }
        if (arg1 != -32) {
            field5064 = -6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V", line = 445)
    private final void method2166(boolean arg0) {
        field5066++;
        long var2 = class498.method2854(-124);
        long var4 = class180.field2598[class196.field2751];
        class180.field2598[class196.field2751] = var2;
        class196.field2751 = class196.field2751 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class334.field4378 = class323.field4235;
        }
        this.method1267((byte) -22);
        if (!arg0) {
            this.method2170(false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V", line = 484)
    public final void run() {
        field5051++;
        try {
            label110: {
                if (class216.field2910 != null) {
                    String var1 = class216.field2910.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class216.field2918;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2163("wrongjava", (byte) 103);
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class216.field2918 == null || class216.field2918.equals("1.4.2"))) {
                        this.method2163("wrongjava", (byte) 46);
                        break label110;
                    }
                }
                if (class216.field2918 != null && class216.field2918.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class216.field2918.length()) {
                        char var5 = class216.field2918.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class437.field5996 = true;
                    }
                }
                if (class389.field5281.field2917 != null) {
                    Method var6 = class216.field2931;
                    if (var6 != null) {
                        try {
                            var6.invoke(class389.field5281.field2917, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class358.method2091(false);
                class308.method1787((byte) -119);
                this.method2167((byte) 107);
                this.method1259((byte) -82);
                class21.field377 = class323.method1864(0);
                this.method2173(1);
                while (class444.field6087 == 0L || class498.method2854(-128) < class444.field6087) {
                    class71.field1064 = class21.field377.method472(class226.field3052, 14965);
                    for (int var7 = 0; var7 < class71.field1064; var7++) {
                        this.method2166(true);
                    }
                    this.method2172((byte) -2);
                    class168.method1126(class389.field5281, class518.field7663, (byte) 121);
                }
            }
        } catch (Throwable var10) {
            class504.method2879(var10, null, -19638);
            this.method2163("crash", (byte) 96);
        }
        this.method2164(true, -62);
    }

    @OriginalMember(owner = "client!rc", name = "start", descriptor = "()V", line = 598)
    public final void start() {
        field5059++;
        if (class116.field1654 == this && !class441.field6050) {
            class444.field6087 = 0L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 610)
    public final void windowDeiconified(WindowEvent arg0) {
        field5042++;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V", line = 622)
    public final synchronized void method2167(byte arg0) {
        if (arg0 <= 34) {
            return;
        }
        if (class518.field7663 != null) {
            class518.field7663.removeFocusListener(this);
            class518.field7663.getParent().remove(class518.field7663);
        }
        field5053++;
        Container var2;
        if (class297.field3882 != null) {
            var2 = class297.field3882;
        } else if (class273.field3572 == null) {
            var2 = class389.field5281.field2917;
        } else {
            var2 = class273.field3572;
        }
        var2.setLayout(null);
        class518.field7663 = new class110(this);
        var2.add(class518.field7663);
        class518.field7663.setSize(class149.field2132, class175.field2555);
        class518.field7663.setVisible(true);
        if (class273.field3572 == var2) {
            Insets var3 = class273.field3572.getInsets();
            class518.field7663.setLocation(class224.field3023 + var3.left, class269.field3539 + var3.top);
        } else {
            class518.field7663.setLocation(class224.field3023, class269.field3539);
        }
        class518.field7663.addFocusListener(this);
        class518.field7663.requestFocus();
        class323.field4235 = true;
        class334.field4378 = true;
        class366.field4959 = true;
        class18.field302 = false;
        class30.field507 = class498.method2854(-120);
    }

    @OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 672)
    public final void windowClosed(WindowEvent arg0) {
        field5041++;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V", line = 679)
    public static final void method2168(byte arg0) {
        class471.method2680((byte) -8, false);
        field5078++;
        class286.field3743 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class305.field4025.length; var2++) {
            if (class76.field1132[var2] != -1 && class305.field4025[var2] == null) {
                class305.field4025[var2] = class88.field1340.method2708(class76.field1132[var2], 0, (byte) 54);
                if (class305.field4025[var2] == null) {
                    class286.field3743++;
                    var1 = false;
                }
            }
            if (class467.field6437[var2] != -1 && class257.field3388[var2] == null) {
                class257.field3388[var2] = class88.field1340.method2716(-1, 0, class380.field5194[var2], class467.field6437[var2]);
                if (class257.field3388[var2] == null) {
                    var1 = false;
                    class286.field3743++;
                }
            }
            if (class386.field5257[var2] != -1 && class420.field5754[var2] == null) {
                class420.field5754[var2] = class88.field1340.method2708(class386.field5257[var2], 0, (byte) 54);
                if (class420.field5754[var2] == null) {
                    var1 = false;
                    class286.field3743++;
                }
            }
            if (class162.field2364[var2] != -1 && class506.field6966[var2] == null) {
                class506.field6966[var2] = class88.field1340.method2708(class162.field2364[var2], 0, (byte) 54);
                if (class506.field6966[var2] == null) {
                    class286.field3743++;
                    var1 = false;
                }
            }
            if (class103.field1521 != null && class252.field3333[var2] == null && class103.field1521[var2] != -1) {
                class252.field3333[var2] = class88.field1340.method2716(-1, 0, class380.field5194[var2], class103.field1521[var2]);
                if (class252.field3333[var2] == null) {
                    class286.field3743++;
                    var1 = false;
                }
            }
        }
        if (class277.field3629 == null) {
            if (class376.field5097 == null || !class393.field5326.method2720((byte) -28, class376.field5097.field851 + "_staticelements")) {
                class277.field3629 = new class397(0);
            } else if (class393.field5326.method2702(31269, class376.field5097.field851 + "_staticelements")) {
                class277.field3629 = class168.method1130(class376.field5097.field851 + "_staticelements", class393.field5326, class5.field151, (byte) -128);
            } else {
                class286.field3743++;
                var1 = false;
            }
        }
        if (!var1) {
            class523.field7734 = 1;
            return;
        }
        boolean var3 = true;
        class496.field6881 = 0;
        for (int var4 = 0; var4 < class305.field4025.length; var4++) {
            byte[] var19 = class257.field3388[var4];
            if (var19 != null) {
                int var20 = (class149.field2131[var4] >> 8) * 64 - class401.field5382;
                int var21 = (class149.field2131[var4] & 0xFF) * 64 - class421.field5762;
                if (class55.field872 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class421.method2427(var19, var20, class289.field3782, class12.field251, var21, 13017);
            }
            byte[] var22 = class506.field6966[var4];
            if (var22 != null) {
                int var23 = (class149.field2131[var4] >> 8) * 64 - class401.field5382;
                int var24 = (class149.field2131[var4] & 0xFF) * 64 - class421.field5762;
                if (class55.field872 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class421.method2427(var22, var23, class289.field3782, class12.field251, var24, 13017);
            }
        }
        if (!var3) {
            class523.field7734 = 2;
            return;
        }
        if (class523.field7734 != 0) {
            class253.method1525(class299.field3960.method1764(class489.field6789, false) + "<br>(100%)", class302.field3995, 1, true);
        }
        class88.method641((byte) 105);
        class129.method924(-10808);
        boolean var5 = false;
        if (class370.field4984.method558() && class154.field2244.field7778) {
            for (int var6 = 0; var6 < class305.field4025.length; var6++) {
                if (class506.field6966[var6] != null || class420.field5754[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class154.field2244.field7769) {
            var7 = class118.field1706[class309.field4061];
        } else {
            var7 = class449.field6124[class309.field4061];
        }
        if (class370.field4984.method569()) {
            var7++;
        }
        class42.method298(7, 4, class12.field251, class289.field3782, var7, var5, class370.field4984.method597() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class120.field1754[var8].method1155(true);
        }
        class342.method1985(0);
        class442.method2552(false, (byte) -13);
        class115.method789(0);
        class121.field1775 = null;
        class88.method641((byte) 126);
        System.gc();
        if (arg0 <= 91) {
            return;
        }
        class471.method2680((byte) -8, true);
        class437.method2512((byte) 1);
        class176.field2559 = class154.field2244.method3089((byte) 118, class166.field2414);
        class339.field4427 = class199.field2765 >= 96;
        class162.field2370 = class154.field2244.field7778;
        class56.field876 = class154.field2244.method3086(class166.field2414, (byte) 60);
        class441.field6052 = !class154.field2244.field7745;
        class308.field4053 = class154.field2244.method1855((byte) 70, class166.field2414) ? -1 : class455.field6229;
        class53.field832 = class154.field2244.field7754;
        class316.field4138 = class166.field2414 == 1 || class154.field2244.field7744;
        class387.field5261 = new class205(4, class12.field251, class289.field3782, false);
        if (class55.field872 == 0) {
            class98.method699(-5232, class387.field5261, class305.field4025);
        } else {
            class153.method1057(class305.field4025, class387.field5261, 16765702);
        }
        class14.method143((byte) 124, class289.field3782 >> 4, class12.field251 >> 4);
        class493.method2837(-1980137565);
        if (var5) {
            class301.method1754(true);
            class166.field2413 = new class205(1, class12.field251, class289.field3782, true);
            if (class55.field872 == 0) {
                class98.method699(-5232, class166.field2413, class420.field5754);
                class471.method2680((byte) -8, true);
            } else {
                class153.method1057(class420.field5754, class166.field2413, 16765702);
                class471.method2680((byte) -8, true);
            }
            class166.field2413.method1625(-7185, class387.field5261.field3574[0], 0);
            class166.field2413.method1630(1, class370.field4984, null, null);
            class301.method1754(false);
        }
        class387.field5261.method1630(1, class370.field4984, class120.field1754, var5 ? class166.field2413.field3574 : null);
        if (class55.field872 == 0) {
            class471.method2680((byte) -8, true);
            class299.method1747(class257.field3388, 64, class387.field5261);
            if (class252.field3333 != null) {
                class373.method2154(14583);
            }
        } else {
            class471.method2680((byte) -8, true);
            class327.method1890(112, class257.field3388, class387.field5261);
        }
        class129.method924(-10808);
        class471.method2680((byte) -8, true);
        class387.field5261.method1631(null, var5 ? class37.field582[0] : null, (byte) 58, class370.field4984);
        class387.field5261.method1311(class370.field4984, (byte) 89);
        class471.method2680((byte) -8, true);
        if (var5) {
            class301.method1754(true);
            class471.method2680((byte) -8, true);
            if (class55.field872 == 0) {
                class299.method1747(class506.field6966, 64, class166.field2413);
            } else {
                class327.method1890(60, class506.field6966, class166.field2413);
            }
            class129.method924(-10808);
            class471.method2680((byte) -8, true);
            class166.field2413.method1631(class209.field2868[0], null, (byte) 58, class370.field4984);
            class166.field2413.method1311(class370.field4984, (byte) 89);
            class471.method2680((byte) -8, true);
            class301.method1754(false);
        }
        class433.method2489(3805);
        int var9 = class387.field5261.field2830;
        if (class411.field5656 < var9) {
            var9 = class411.field5656;
        }
        if (var9 < class411.field5656 - 1) {
            var9 = class411.field5656 - 1;
        }
        if (class154.field2244.method1855((byte) 100, class166.field2414)) {
            class172.method1147(0);
        } else {
            class172.method1147(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class12.field251; var17++) {
                for (int var18 = 0; var18 < class289.field3782; var18++) {
                    class97.method692(var10, var17, (byte) -46, var18);
                }
            }
        }
        class437.method2510(-1975902942);
        class88.method641((byte) 113);
        class1.method5(-59);
        class129.method924(-10808);
        class392.field5313 = false;
        class232.method1446(0);
        if (class273.field3572 != null && class304.field4004 != null && class454.field6161 == 25) {
            class23.field401++;
            class118.method822(79, class206.field2847);
            class193.field2708.method2214(34, 1057001181);
        }
        if (class55.field872 == 0) {
            int var11 = (class522.field7715 - (class12.field251 >> 4)) / 8;
            int var12 = (class522.field7715 + (class12.field251 >> 4)) / 8;
            int var13 = (class176.field2564 - (class289.field3782 >> 4)) / 8;
            int var14 = ((class289.field3782 >> 4) + class176.field2564) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var15 > var12 || var16 < var13 || var14 < var16) {
                        class88.field1340.method2727(0, "m" + var15 + "_" + var16);
                        class88.field1340.method2727(0, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class454.field6161 == 28) {
            class507.method2898(1, 10);
        } else {
            class507.method2898(1, 30);
            if (class304.field4004 != null) {
                class118.method822(-95, class426.field5828);
            }
        }
        class315.method1822(false);
        class88.method641((byte) 122);
        class171.method1143((byte) 113);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILus;I)V", line = 1131)
    public static final void method2169(int arg0, int arg1, int arg2, class1 arg3, int arg4) {
        if (arg1 > -4) {
            method2165(null, (byte) -119);
        }
        field5052++;
        for (class219 var5 = (class219) class201.field2786.method1672((byte) -122); var5 != null; var5 = (class219) class201.field2786.method1668(-1)) {
            if (var5.field2953 == arg4 && arg0 << 7 == var5.field2958 && arg2 << 7 == var5.field2950 && var5.field2956.field33 == arg3.field33) {
                if (var5.field2959 != null) {
                    class318.field4175.method3070(var5.field2959);
                    var5.field2959 = null;
                }
                if (var5.field2945 != null) {
                    class318.field4175.method3070(var5.field2945);
                    var5.field2945 = null;
                }
                var5.method300(false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V", line = 1178)
    public final void stop() {
        field5073++;
        if (class116.field1654 == this && !class441.field6050) {
            class444.field6087 = class498.method2854(-119) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V", line = 1193)
    public final void destroy() {
        field5048++;
        if (class116.field1654 == this && !class441.field6050) {
            class444.field6087 = class498.method2854(-123);
            class94.method674(5000L, 1);
            class253.field3359 = null;
            this.method2164(false, -90);
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)Z", line = 1208)
    public final boolean method2170(boolean arg0) {
        field5069++;
        if (!arg0) {
            this.destroy();
        }
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
            } else {
                this.method2163("invalidhost", (byte) -49);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILdc;ILqa;IILc;IIIIIZ)Lc;", line = 1245)
    public static final class121 method2171(int arg0, int arg1, int arg2, class5 arg3, int arg4, class162 arg5, int arg6, int arg7, class121 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        field5063++;
        if (arg8 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg3 != null) {
            int var16 = var15 | arg3.method32(arg0, false, -1, -1);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg9 << 32) + (long) ((arg6 << 24) + (arg10 << 16) + arg7) + ((long) arg4 << 48);
        if (arg12 != 1232627105) {
            method2171(-124, 64, 42, null, 56, null, 79, -59, null, 28, 51, -126, -49, 97, true);
        }
        class236 var19 = class496.field6882;
        class121 var20;
        synchronized (class496.field6882) {
            var20 = (class121) class496.field6882.method1456(var17, 114);
        }
        if (var20 == null || arg5.method564(var20.method854(), var15) != 0) {
            if (var20 != null) {
                var15 = arg5.method565(var15, var20.method854());
            }
            byte var21;
            if (arg7 == 1) {
                var21 = 9;
            } else if (arg7 == 2) {
                var21 = 12;
            } else if (arg7 == 3) {
                var21 = 15;
            } else if (arg7 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class118 var24 = new class118(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method813(0, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class305.field4019[var31] * var28 >> 15;
                    int var33 = class305.field4022[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method813(var32, 0, var33, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg6 * var35 + arg10 * var36 >> 8);
                short var38 = (short) (((arg4 & 0xFC00) * var35 + (arg9 & 0xFC00) * var36 & 0xFC0000) + ((arg4 & 0x380) * var35 + (arg9 & 0x380) * var36 & 0x38000) + ((arg4 & 0x7F) * var35 + (arg9 & 0x7F) * var36 & 0x7F00) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method809(var38, (short) -1, var26[0][(var39 + 1) % var21], var25, (byte) -1, var26[0][var39], arg12 ^ 0xB6879A21, var37, (byte) 1);
                    } else {
                        var24.method809(var38, (short) -1, var26[var34 - 1][(var39 + 1) % var21], var26[var34 - 1][var39], (byte) -1, var26[var34][(var39 + 1) % var21], -124, var37, (byte) 1);
                        var24.method809(var38, (short) -1, var26[var34][(var39 + 1) % var21], var26[var34 - 1][var39], (byte) -1, var26[var34][var39], -114, var37, (byte) 1);
                    }
                }
            }
            var20 = arg5.method531(var24, var15, class350.field4721, 64, 768);
            class236 var40 = class496.field6882;
            synchronized (class496.field6882) {
                class496.field6882.method1462(var20, var17, -48);
            }
        }
        int var41 = (arg7 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg14) {
            if (arg11 > 13312 || arg11 < 3072) {
                var43 -= 128;
            }
            if (arg11 > 1024 && arg11 < 7168) {
                var42 -= 128;
            }
            if (arg11 > 5120 && arg11 < 11264) {
                var45 = var41 + 128;
            }
            if (arg11 > 9216 && arg11 < 15360) {
                var44 = var41 + 128;
            }
        }
        int var46 = arg8.method845();
        int var47 = arg8.method873();
        int var48 = arg8.method850();
        if (var44 < var47) {
            var47 = var44;
        }
        if (var48 < var43) {
            var48 = var43;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        int var49 = arg8.method862();
        if (var45 < var49) {
            var49 = var45;
        }
        class504 var50 = null;
        if (arg3 != null) {
            int var51 = arg3.field129[arg0];
            var50 = class423.field5791.method1606(var51 >> 16, arg12 - 1232627186);
            arg0 = var51 & 0xFFFF;
        }
        class121 var52;
        if (var50 == null) {
            var52 = var20.method863((byte) 3, var15, true);
            var52.method882(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method879(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method863((byte) 3, var15, true);
            var52.method882(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method879(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method842(arg0, var50, -56);
        }
        if (arg2 != 0) {
            var52.method868(arg2);
        }
        if (arg13 != 0) {
            var52.method869(arg13);
        }
        if (arg1 != 0) {
            var52.method879(0, arg1, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(B)V", line = 1458)
    private final void method2172(byte arg0) {
        field5074++;
        if (arg0 != -2) {
            return;
        }
        long var2 = class498.method2854(arg0 - 109);
        long var4 = class461.field6366[class252.field3348];
        class461.field6366[class252.field3348] = var2;
        class252.field3348 = class252.field3348 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            field5064 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class60.field946++) > 50) {
            class60.field946 -= 50;
            class366.field4959 = true;
            class518.field7663.setSize(class149.field2132, class175.field2555);
            class518.field7663.setVisible(true);
            if (class273.field3572 != null && class297.field3882 == null) {
                Insets var7 = class273.field3572.getInsets();
                class518.field7663.setLocation(class224.field3023 + var7.left, class269.field3539 + var7.top);
            } else {
                class518.field7663.setLocation(class224.field3023, class269.field3539);
            }
        }
        this.method1253(false);
    }

    @OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1501)
    public final void windowOpened(WindowEvent arg0) {
        field5070++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 1508)
    public final void method2173(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field5075++;
        if (this.field5058) {
            return;
        }
        try {
            class446 var2 = class389.field5281.method1368(class116.field1654.getClass(), (byte) -27);
            while (var2.field6100 == 0) {
                class94.method674(100L, arg0);
            }
            if (var2.field6104 != null) {
                throw (Throwable) var2.field6104;
            }
            jagmisc.init();
            this.field5058 = true;
            class21.field377 = class323.method1864(0);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Ljs;)V", line = 1543)
    public static final void providesignlink(class216 arg0) {
        field5043++;
        class389.field5281 = arg0;
        class253.field3359 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BZIILjava/lang/String;III)V", line = 1558)
    public final void method2174(byte arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg0 != -1) {
                field5064 = 112;
            }
            class224.field3023 = 0;
            class149.field2132 = arg5;
            class184.field2617 = arg5;
            class269.field3539 = 0;
            class423.field5794 = arg2;
            class116.field1654 = this;
            class175.field2555 = arg7;
            class445.field6092 = arg7;
            class273.field3572 = new Frame();
            class273.field3572.setTitle("Jagex");
            class273.field3572.setResizable(true);
            class273.field3572.addWindowListener(this);
            class273.field3572.setVisible(true);
            class273.field3572.toFront();
            Insets var9 = class273.field3572.getInsets();
            class273.field3572.setSize(class184.field2617 + var9.left + var9.right, class445.field6092 + var9.top - -var9.bottom);
            class253.field3359 = class389.field5281 = new class216(null, arg6, arg4, arg3);
            class446 var10 = class389.field5281.method1353(1, -34, this);
            while (var10.field6100 == 0) {
                class94.method674(10L, 1);
            }
        } catch (Exception var12) {
            class504.method2879(var12, null, -19638);
        }
        field5057++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public abstract void method1253(boolean arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public abstract void method1259(byte arg0);

    @OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public abstract void method1251(byte arg0);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public abstract void method1267(byte arg0);

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(B)V")
    public abstract void method1250(byte arg0);
}
