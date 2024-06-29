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

@OriginalClass("client!v")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Z")
    private boolean field1052 = false;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lli;")
    public static class185 field1046 = class245.method1649("Fallen lassen", -25);

    @OriginalMember(owner = "client!v", name = "z", descriptor = "[I")
    public static int[] field1059 = new int[2500];

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field1068 = 0;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "Lfk;")
    public static class36 field1064 = class40.method247(-256);

    @OriginalMember(owner = "client!v", name = "N", descriptor = "Lli;")
    private static class185 field1072 = class245.method1649("Loaded fonts", 122);

    @OriginalMember(owner = "client!v", name = "M", descriptor = "Lli;")
    public static class185 field1071 = field1072;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Z")
    public static boolean field1073;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Z")
    public static boolean field1074;

    @OriginalMember(owner = "client!v", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1044++;
    }

    @OriginalMember(owner = "client!v", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1060++;
        if (class131.field2357 == null) {
            return class124.field2238 == null || class124.field2238.field3022 == this ? super.getParameter(arg0) : class124.field2238.field3022.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method404(int arg0) {
        field1046 = null;
        field1072 = null;
        field1064 = null;
        field1059 = null;
        if (arg0 != 31) {
            field1072 = null;
        }
        field1071 = null;
    }

    @OriginalMember(owner = "client!v", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1050++;
        if (class267.field4725 != this || class124.field2239) {
            return;
        }
        class181.field3324 = true;
        if (class206.field3785 && (class244.method1644((byte) -63) - class113.field2036) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class201.field3680 && class266.field4715 <= var2.height) {
                class128.field2286 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1036++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!v", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1039++;
    }

    @OriginalMember(owner = "client!v", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1057++;
    }

    @OriginalMember(owner = "client!v", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    private final void method405(byte arg0) {
        field1048++;
        long var2 = class33.field548[class39.field613];
        long var4 = class244.method1644((byte) -32);
        class33.field548[class39.field613] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class163.field3057 = ((var6 >> 1) + 32000) / var6;
        }
        class39.field613 = class39.field613 + 1 & 0x1F;
        if ((class49.field795++) > 50) {
            class181.field3324 = true;
            class49.field795 -= 50;
            class30.field500.setSize(class204.field3738, class148.field2796);
            class30.field500.setVisible(true);
            if (class131.field2357 != null && class144.field2746 == null) {
                Insets var7 = class131.field2357.getInsets();
                class30.field500.setLocation(class210.field3841 + var7.left, class70.field1226 + var7.top);
            } else {
                class30.field500.setLocation(class210.field3841, class70.field1226);
            }
        }
        if (arg0 != -10) {
            this.method415(105, (byte) 4, 5, 39, -12);
        }
        this.method412(-77);
    }

    @OriginalMember(owner = "client!v", name = "run", descriptor = "()V")
    public final void run() {
        field1041++;
        try {
            if (class160.field3031 != null) {
                String var1 = class160.field3031.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class160.field3019;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method417("wrongjava", 1);
                        return;
                    }
                    class84.field1664 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class160.field3019 == null || class160.field3019.equals("1.4.2"))) {
                    this.method417("wrongjava", 1);
                    return;
                }
            }
            if (class160.field3019 != null && class160.field3019.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class160.field3019.length() > var3) {
                    char var5 = class160.field3019.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class206.field3785 = true;
                }
            }
            if (class124.field2238.field3022 != null) {
                Method var6 = class160.field3034;
                if (var6 != null) {
                    try {
                        var6.invoke(class124.field2238.field3022, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class276.method1887(15141);
            this.method416(0);
            class33.field540 = class146.method1045(22, class204.field3738, class148.field2796, class30.field500);
            this.method418((byte) -58);
            class140.field2625 = class151.method1076(-74);
            while (class7.field159 == 0L || class244.method1644((byte) -107) < class7.field159) {
                class44.field701 = class140.field2625.method152(2, class176.field3219, class84.field1664);
                for (int var7 = 0; var7 < class44.field701; var7++) {
                    this.method406(1);
                }
                this.method405((byte) -10);
                class197.method1418(class30.field500, -28826, class124.field2238);
            }
        } catch (Exception var10) {
            class3.method33((String) null, var10, (byte) 126);
            this.method417("crash", 1);
        }
        this.method413(-5226, true);
    }

    @OriginalMember(owner = "client!v", name = "stop", descriptor = "()V")
    public final void stop() {
        field1045++;
        if (class267.field4725 == this && !class124.field2239) {
            class7.field159 = class244.method1644((byte) -73) + 4000L;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    private final void method406(int arg0) {
        long var2 = class244.method1644((byte) -26);
        field1049++;
        long var4 = class273.field4840[class249.field4417];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class273.field4840[class249.field4417] = var2;
        class249.field4417 = class249.field4417 + arg0 & 0x1F;
        synchronized (this) {
            class21.field364 = class75.field1294;
        }
        this.method407(arg0 ^ 0xFFFFA5BB);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public abstract void method407(int arg0);

    @OriginalMember(owner = "client!v", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1063++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    public static final void method408(int arg0, int arg1) {
        field1061++;
        if (arg0 != -49) {
            field1071 = null;
        }
        class174 var2 = class249.method1671(7, arg1, (byte) 101);
        var2.method1234((byte) -117);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z")
    public static final boolean method409(int arg0, int arg1) {
        if (arg0 == 1) {
            field1067++;
            return (arg1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public abstract void method410(int arg0);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)Lo;")
    public static final class174 method411(byte arg0) {
        if (arg0 != -3) {
            return null;
        }
        field1051++;
        class174 var1 = (class174) class241.field4307.method437(10);
        if (var1 != null) {
            var1.method476(102);
            var1.method1276((byte) 82);
            return var1;
        }
        class174 var2;
        do {
            var2 = (class174) class276.field4883.method437(arg0 ^ 0xFFFFFFF7);
            if (var2 == null) {
                return null;
            }
            if (var2.method1238((byte) -125) > class244.method1644((byte) -124)) {
                return null;
            }
            var2.method476(-59);
            var2.method1276((byte) 82);
        } while ((Long.MIN_VALUE & var2.field3318) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "start", descriptor = "()V")
    public final void start() {
        field1047++;
        if (class267.field4725 == this && !class124.field2239) {
            class7.field159 = 0L;
        }
    }

    @OriginalMember(owner = "client!v", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1069++;
    }

    @OriginalMember(owner = "client!v", name = "providesignlink", descriptor = "(Luc;)V")
    public static final void providesignlink(class160 arg0) {
        class124.field2238 = arg0;
        class111.field2014 = arg0;
        field1056++;
    }

    @OriginalMember(owner = "client!v", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1070++;
        if (class131.field2357 == null) {
            return class124.field2238 == null || class124.field2238.field3022 == this ? super.getCodeBase() : class124.field2238.field3022.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public abstract void method412(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)V")
    private final void method413(int arg0, boolean arg1) {
        if (arg0 != -5226) {
            return;
        }
        field1065++;
        synchronized (this) {
            if (class124.field2239) {
                return;
            }
            class124.field2239 = true;
        }
        if (class124.field2238.field3022 != null) {
            class124.field2238.field3022.destroy();
        }
        try {
            this.method419((byte) -87);
        } catch (Exception var9) {
        }
        if (class30.field500 != null) {
            try {
                class30.field500.removeFocusListener(this);
                class30.field500.getParent().remove(class30.field500);
            } catch (Exception var8) {
            }
        }
        if (class124.field2238 != null) {
            try {
                class124.field2238.method1154(0);
            } catch (Exception var7) {
            }
        }
        this.method410(28);
        if (class131.field2357 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIZILjava/lang/String;I)V")
    public final void method414(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, String arg6, int arg7) {
        field1040++;
        try {
            class70.field1226 = arg7;
            class267.field4725 = this;
            class148.field2796 = arg2;
            class266.field4715 = arg2;
            class210.field3841 = 0;
            class113.field2037 = arg1;
            class204.field3738 = arg5;
            class201.field3680 = arg5;
            class131.field2357 = new Frame();
            class131.field2357.setTitle("Jagex");
            class131.field2357.setResizable(true);
            class131.field2357.addWindowListener(this);
            class131.field2357.setVisible(true);
            class131.field2357.toFront();
            Insets var9 = class131.field2357.getInsets();
            class131.field2357.setSize(var9.right + var9.left + class201.field3680, class266.field4715 - -var9.top - -var9.bottom);
            class111.field2014 = class124.field2238 = new class160((Applet) null, arg3, arg6, arg0);
            class29 var10 = class124.field2238.method1152(this, (byte) -47, 1);
            while (var10.field487 == 0) {
                class212.method1488(10L, arg7 - 114);
            }
        } catch (Exception var12) {
            class3.method33((String) null, var12, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!v", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1066++;
    }

    @OriginalMember(owner = "client!v", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1055++;
        if (class131.field2357 == null) {
            return class124.field2238 == null || class124.field2238.field3022 == this ? super.getDocumentBase() : class124.field2238.field3022.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBIII)V")
    public final void method415(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1062++;
        try {
            if (class267.field4725 == null) {
                if (arg1 != -88) {
                    field1059 = null;
                }
                class267.field4725 = this;
                class148.field2796 = arg3;
                class266.field4715 = arg3;
                class210.field3841 = 0;
                class70.field1226 = 0;
                class204.field3738 = arg4;
                class201.field3680 = arg4;
                class113.field2037 = arg2;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class124.field2238 == null) {
                    class111.field2014 = class124.field2238 = new class160(this, arg0, (String) null, 0);
                }
                class29 var7 = class124.field2238.method1152(this, (byte) -47, 1);
                while (var7.field487 == 0) {
                    class212.method1488(10L, -99);
                }
            } else {
                class239.field4273++;
                if (class239.field4273 >= 3) {
                    this.method417("alreadyloaded", arg1 ^ 0xFFFFFFA9);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class3.method33((String) null, var9, (byte) 127);
            this.method417("crash", 1);
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public final synchronized void method416(int arg0) {
        if (arg0 != 0) {
            field1046 = null;
        }
        field1034++;
        if (class30.field500 != null) {
            class30.field500.removeFocusListener(this);
            class30.field500.getParent().remove(class30.field500);
        }
        Container var2;
        if (class144.field2746 != null) {
            var2 = class144.field2746;
        } else if (class131.field2357 == null) {
            var2 = class124.field2238.field3022;
        } else {
            var2 = class131.field2357;
        }
        var2.setLayout((LayoutManager) null);
        class30.field500 = new class113(this);
        var2.add(class30.field500);
        class30.field500.setSize(class204.field3738, class148.field2796);
        class30.field500.setVisible(true);
        if (class131.field2357 == var2) {
            Insets var3 = class131.field2357.getInsets();
            class30.field500.setLocation(class210.field3841 + var3.left, class70.field1226 + var3.top);
        } else {
            class30.field500.setLocation(class210.field3841, class70.field1226);
        }
        class30.field500.addFocusListener(this);
        class30.field500.requestFocus();
        class75.field1294 = true;
        class21.field364 = true;
        class181.field3324 = true;
        class128.field2286 = false;
        class113.field2036 = class244.method1644((byte) -68);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method417(String arg0, int arg1) {
        field1043++;
        if (this.field1052) {
            return;
        }
        this.field1052 = true;
        if (arg1 != 1) {
            method411((byte) -77);
        }
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!v", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1038++;
        if (class131.field2357 == null) {
            return class124.field2238 == null || class124.field2238.field3022 == this ? super.getAppletContext() : class124.field2238.field3022.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1054++;
        if (class267.field4725 == this && !class124.field2239) {
            class7.field159 = class244.method1644((byte) -79);
            class212.method1488(5000L, -50);
            class111.field2014 = null;
            this.method413(-5226, false);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public abstract void method418(byte arg0);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public abstract void method419(byte arg0);

    @OriginalMember(owner = "client!v", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class75.field1294 = false;
        field1042++;
    }

    @OriginalMember(owner = "client!v", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1053++;
    }

    @OriginalMember(owner = "client!v", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class75.field1294 = true;
        field1058++;
        class181.field3324 = true;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z")
    public final boolean method420(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1035++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 < 99) {
                field1059 = null;
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
                this.method417("invalidhost", 1);
                return false;
            }
        }
    }
}
