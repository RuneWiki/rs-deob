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

@OriginalClass("client!nc")
public abstract class class154 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Z")
    private boolean field2138 = false;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field2127 = 0;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[Z")
    public static boolean[] field2114 = new boolean[200];

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2128 = "Loading title screen - ";

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "Lcl;")
    public static class141 field2146 = class176.method1208(119);

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "S")
    public static short field2152 = 256;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field2151 = 0;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Llc;")
    public static class175 field2111;

    @OriginalMember(owner = "client!nc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 4)
    public final void windowActivated(WindowEvent arg0) {
        field2144++;
    }

    @OriginalMember(owner = "client!nc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 14)
    public final AppletContext getAppletContext() {
        field2142++;
        if (class329.field5029 == null) {
            return class9.field131 == null || class9.field131.field4179 == this ? super.getAppletContext() : class9.field131.field4179.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 32)
    public final URL getCodeBase() {
        field2118++;
        if (class329.field5029 == null) {
            return class9.field131 == null || class9.field131.field4179 == this ? super.getCodeBase() : class9.field131.field4179.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "run", descriptor = "()V", line = 47)
    public final void run() {
        field2115++;
        try {
            if (class265.field4175 != null) {
                String var1 = class265.field4175.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class265.field4170;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1031("wrongjava", (byte) 94);
                        return;
                    }
                    class60.field743 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class265.field4170 == null || class265.field4170.equals("1.4.2"))) {
                    this.method1031("wrongjava", (byte) 66);
                    return;
                }
            }
            if (class265.field4170 != null && class265.field4170.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class265.field4170.length()) {
                    char var5 = class265.field4170.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class337.field5218 = true;
                }
            }
            if (class9.field131.field4179 != null) {
                Method var6 = class265.field4185;
                if (var6 != null) {
                    try {
                        var6.invoke(class9.field131.field4179, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class226.method1553(11111);
            this.method1028((byte) -116);
            class72.field916 = class17.method115(class260.field3941, -1, class188.field2712, class314.field4847);
            this.method1034(0);
            class308.field4767 = class242.method1747((byte) -122);
            while (class318.field4882 == 0L || class318.field4882 > class200.method1375(-16185)) {
                class316.field4876 = class308.field4767.method114(class60.field743, 100, class260.field3945);
                for (int var8 = 0; var8 < class316.field4876; var8++) {
                    this.method1037(1);
                }
                this.method1041((byte) -37);
                class84.method496(class260.field3941, 6946, class9.field131);
            }
        } catch (Exception var11) {
            class42.method245((String) null, 1, var11);
            this.method1031("crash", (byte) 45);
        }
        this.method1029(true, true);
    }

    @OriginalMember(owner = "client!nc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 156)
    public final void windowDeiconified(WindowEvent arg0) {
        field2150++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B[B)[B", line = 164)
    public static final byte[] method1023(byte arg0, byte[] arg1) {
        field2119++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        class86.method509(arg1, 0, var2, 0, arg1.length);
        if (arg0 > -34) {
            method1027(-106);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 183)
    public static final void method1024(int arg0) {
        field2140++;
        if (class326.field4995 != null || class116.field1649 != null) {
            return;
        }
        int var1 = class196.field2814;
        if (arg0 != 30440) {
            field2152 = -65;
        }
        if (!class140.field1951) {
            if (var1 == 1 && class310.field4794 > 0) {
                short var13 = class30.field371[class310.field4794 - 1];
                if (var13 == 32 || var13 == 11 || var13 == 2 || var13 == 60 || var13 == 47 || var13 == 51 || var13 == 19 || var13 == 37 || var13 == 14 || var13 == 57 || var13 == 3 || var13 == 1004) {
                    int var14 = class168.field2332[class310.field4794 - 1];
                    int var15 = class121.field1702[class310.field4794 - 1];
                    class263 var16 = class91.method530(var15, 10989328);
                    class171 var17 = client.method1952(var16);
                    if (var17.method1120(104) || var17.method1121(124)) {
                        class48.field594 = 0;
                        class248.field3765 = false;
                        if (class326.field4995 != null) {
                            class239.method1712(0, class326.field4995);
                        }
                        class326.field4995 = class91.method530(var15, 10989328);
                        class213.field2999 = class148.field2055;
                        class75.field961 = class224.field3184;
                        class208.field2955 = var14;
                        class239.method1712(arg0 - 30440, class326.field4995);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class58.field698 == 1 && class310.field4794 > 2 || class9.method43(class310.field4794 - 1, -106))) {
                var1 = 2;
            }
            if (var1 == 2 && class310.field4794 > 0 || class104.field1340 == 1) {
                class311.method2183((byte) 113);
            }
            if (var1 == 1 && class310.field4794 > 0 || class104.field1340 == 2) {
                class312.method2190(arg0 - 30443);
            }
            return;
        }
        if (var1 != 1) {
            int var2 = class161.field2216;
            int var3 = class211.field2987;
            if ((class221.field3123 - 10) > var3 || var3 > class205.field2871 + class221.field3123 + 10 || (class325.field4984 - 10) > var2 || (class325.field4984 + class172.field2480 + 10) < var2) {
                class140.field1951 = false;
                class63.method390(class325.field4984, class172.field2480, arg0 ^ 0x769D, class221.field3123, class205.field2871);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class325.field4984;
        int var5 = class148.field2055;
        int var6 = class205.field2871;
        int var7 = -1;
        int var8 = class224.field3184;
        int var9 = class221.field3123;
        for (int var10 = 0; var10 < class310.field4794; var10++) {
            if (class262.field3964) {
                int var12 = var4 + ((class310.field4794 - (var10 + 1)) * 15) + 33;
                if (var9 < var5 && var6 + var9 > var5 && (var12 - 13) < var8 && var8 < var12 + 3) {
                    var7 = var10;
                }
            } else {
                int var11 = var4 + ((class310.field4794 + -1 + -var10) * 15) + 31;
                if (var5 > var9 && var5 < var6 + var9 && var8 > var11 - 13 && var8 < var11 + 3) {
                    var7 = var10;
                }
            }
        }
        if (var7 != -1) {
            class99.method599(var7, (byte) 109);
        }
        class140.field1951 = false;
        class63.method390(class325.field4984, class172.field2480, arg0 ^ 0x768A, class221.field3123, class205.field2871);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 322)
    public static final String method1025(String arg0, int arg1) {
        String var2 = class109.method743(class48.method285((byte) -90, arg0), 1);
        if (arg1 > -126) {
            return (String) null;
        }
        if (var2 == null) {
            var2 = "";
        }
        field2137++;
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 339)
    public final void windowOpened(WindowEvent arg0) {
        field2120++;
    }

    @OriginalMember(owner = "client!nc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 348)
    public final synchronized void paint(Graphics arg0) {
        field2143++;
        if (class110.field1561 != this || class299.field4665) {
            return;
        }
        class76.field970 = true;
        if (class337.field5218 && !class250.field3787 && class200.method1375(-16185) - class243.field3663 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class73.field943 && class138.field1938 <= var2.height) {
                class63.field823 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "start", descriptor = "()V", line = 374)
    public final void start() {
        field2125++;
        if (class110.field1561 == this && !class299.field4665) {
            class318.field4882 = 0L;
        }
    }

    @OriginalMember(owner = "client!nc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 387)
    public final void focusLost(FocusEvent arg0) {
        field2124++;
        class309.field4789 = false;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V", line = 396)
    public static final void method1026(byte arg0) {
        if (arg0 >= -124) {
            return;
        }
        for (class180 var1 = (class180) class104.field1345.method2331((byte) 19); var1 != null; var1 = (class180) class104.field1345.method2332(-95)) {
            class99 var2 = var1.field2610;
            if (class138.field1940 != var2.field1312 || var2.field1311) {
                var1.method2285(true);
            } else if (class38.field463 >= var2.field1305) {
                var2.method597(class322.field4939, (byte) -42);
                if (var2.field1311) {
                    var1.method2285(true);
                } else {
                    class93.method554(var2.field1312, var2.field1292, var2.field1300, var2.field1304, 60, var2, 0, -1L, false);
                }
            }
        }
        field2136++;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 432)
    public static void method1027(int arg0) {
        if (arg0 >= -18) {
            field2146 = (class141) null;
        }
        field2111 = null;
        field2114 = null;
        field2146 = null;
        field2128 = null;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V", line = 446)
    public final synchronized void method1028(byte arg0) {
        field2121++;
        if (class260.field3941 != null) {
            class260.field3941.removeFocusListener(this);
            class260.field3941.getParent().remove(class260.field3941);
        }
        if (arg0 >= -113) {
            return;
        }
        Container var2;
        if (class243.field3659 != null) {
            var2 = class243.field3659;
        } else if (class329.field5029 == null) {
            var2 = class9.field131.field4179;
        } else {
            var2 = class329.field5029;
        }
        var2.setLayout((LayoutManager) null);
        class260.field3941 = new class295(this);
        var2.add(class260.field3941);
        class260.field3941.setSize(class188.field2712, class314.field4847);
        class260.field3941.setVisible(true);
        if (class329.field5029 == var2) {
            Insets var3 = class329.field5029.getInsets();
            class260.field3941.setLocation(class148.field2056 + var3.left, class81.field1043 + var3.top);
        } else {
            class260.field3941.setLocation(class148.field2056, class81.field1043);
        }
        class260.field3941.addFocusListener(this);
        class260.field3941.requestFocus();
        class54.field658 = true;
        class309.field4789 = true;
        class76.field970 = true;
        class63.field823 = false;
        class243.field3663 = class200.method1375(-16185);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZZ)V", line = 496)
    private final void method1029(boolean arg0, boolean arg1) {
        field2123++;
        synchronized (this) {
            if (class299.field4665) {
                return;
            }
            class299.field4665 = arg1;
        }
        if (class9.field131.field4179 != null) {
            class9.field131.field4179.destroy();
        }
        try {
            this.method1022((byte) -24);
        } catch (Exception var12) {
        }
        if (class260.field3941 != null) {
            try {
                class260.field3941.removeFocusListener(this);
                class260.field3941.getParent().remove(class260.field3941);
            } catch (Exception var11) {
            }
        }
        if (class9.field131 != null) {
            try {
                class9.field131.method1917(2);
            } catch (Exception var10) {
            }
        }
        this.method1036(!arg1);
        if (class329.field5029 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIZBLjava/lang/String;I)V", line = 556)
    public final void method1030(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, String arg6, int arg7) {
        try {
            class188.field2712 = arg7;
            class73.field943 = arg7;
            class110.field1561 = this;
            class81.field1043 = 0;
            class205.field2877 = arg3;
            class148.field2056 = 0;
            class314.field4847 = arg2;
            class138.field1938 = arg2;
            class329.field5029 = new Frame();
            class329.field5029.setTitle("Jagex");
            class329.field5029.setResizable(true);
            class329.field5029.addWindowListener(this);
            class329.field5029.setVisible(true);
            class329.field5029.toFront();
            int var9 = 87 / ((arg5 + 44) / 49);
            Insets var10 = class329.field5029.getInsets();
            class329.field5029.setSize(class73.field943 + var10.left + var10.right, class138.field1938 + var10.top + var10.bottom);
            class45.field536 = class9.field131 = new class265((Applet) null, arg1, arg6, arg0);
            class18 var11 = class9.field131.method1926(1, (byte) 49, this);
            while (var11.field238 == 0) {
                class81.method485(10L, 1);
            }
            class323.field4966 = (Thread) var11.field241;
        } catch (Exception var13) {
            class42.method245((String) null, 1, var13);
        }
        field2122++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 599)
    public final void method1031(String arg0, byte arg1) {
        field2145++;
        if (this.field2138) {
            return;
        }
        this.field2138 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 < 23) {
                method1039(-86);
            }
            class122.method824(class9.field131.field4179, 25315, "loggedout");
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!nc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 625)
    public final void windowClosed(WindowEvent arg0) {
        field2130++;
    }

    @OriginalMember(owner = "client!nc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 632)
    public final void windowDeactivated(WindowEvent arg0) {
        field2149++;
    }

    @OriginalMember(owner = "client!nc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 650)
    public final void update(Graphics arg0) {
        field2134++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!nc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 659)
    public final String getParameter(String arg0) {
        field2132++;
        if (class329.field5029 == null) {
            return class9.field131 == null || class9.field131.field4179 == this ? super.getParameter(arg0) : class9.field131.field4179.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V", line = 675)
    public static final void method1033(int arg0) {
        field2112++;
        if (class69.field899 == null) {
            return;
        }
        if (class232.field3393 < 10) {
            if (!class42.field501.method1207(class69.field899.field1010, false)) {
                class232.field3393 = class206.field2889.method1176(class69.field899.field1010, (byte) -102) / 10;
                return;
            }
            class100.method602(4);
            class232.field3393 = 10;
        }
        if (class232.field3393 == 10) {
            class239.field3595 = class69.field899.field998 >> 6 << 6;
            class291.field4574 = (class69.field899.field1006 >> 6 << 6) + 64 - class239.field3595;
            class249.field3771 = class69.field899.field995 >> 6 << 6;
            class308.field4766 = (class69.field899.field1003 >> 6 << 6) + 64 - class249.field3771;
            int var1 = -1;
            int[] var2 = class69.field899.method466(class138.field1940, -10, (class118.field1664.field2357 >> 7) + class118.field1668, (class118.field1664.field2392 >> 7) + class142.field1992);
            int var3 = -1;
            if (var2 != null) {
                var1 = var2[1] - class239.field3595;
                var3 = class308.field4766 - (var2[2] - class249.field3771) - 1;
            }
            if (var1 >= 0 && class291.field4574 > var1 && var3 >= 0 && class308.field4766 > var3) {
                int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
                class231.field3373 = var4;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class184.field2663 = var5;
            } else if (class320.field4922 == -1 || class316.field4874 == -1) {
                int[] var7 = class69.field899.method467(class69.field899.field990 >> 14 & 0x3FFF, class69.field899.field990 & 0x3FFF, (byte) -118);
                class184.field2663 = class308.field4766 + class249.field3771 - var7[2] - 1;
                class231.field3373 = var7[1] - class239.field3595;
            } else {
                int[] var6 = class69.field899.method467(class320.field4922, class316.field4874, (byte) -117);
                if (var6 != null) {
                    class184.field2663 = class308.field4766 + class249.field3771 - var6[2] - 1;
                    class231.field3373 = var6[1] - class239.field3595;
                }
                class316.field4874 = -1;
                class320.field4922 = -1;
            }
            if (class69.field899.field1004 == 37) {
                class5.field78 = 3.0F;
                class184.field2652 = 3.0F;
            } else if (class69.field899.field1004 == 50) {
                class5.field78 = 4.0F;
                class184.field2652 = 4.0F;
            } else if (class69.field899.field1004 == 75) {
                class5.field78 = 6.0F;
                class184.field2652 = 6.0F;
            } else if (class69.field899.field1004 == 100) {
                class5.field78 = 8.0F;
                class184.field2652 = 8.0F;
            } else if (class69.field899.field1004 == 200) {
                class5.field78 = 16.0F;
                class184.field2652 = 16.0F;
            } else {
                class5.field78 = 8.0F;
                class184.field2652 = 8.0F;
            }
            class106.method617(-8915);
            int var8 = class291.field4574 >> 6;
            int var9 = class48.field596 >> 2 << 10;
            class196.field2816 = new int[class79.field997 + 1];
            int var10 = class308.field4766 >> 6;
            class50.field625 = new byte[var8][var10][];
            class181.field2622 = new byte[var8][var10][];
            class222.field3143 = new byte[var8][var10][];
            class247.field3754 = new int[var8][var10][];
            class149.field2078 = new byte[var8][var10][];
            class224.field3179 = new byte[var8][var10][];
            class157.field2167 = new int[var8][var10][];
            int var11 = class326.field4996 >> 1;
            class57.field687 = new int[var8][var10][];
            class276.method1988((byte) 82, var9, var11);
            class232.field3393 = 20;
        } else if (class232.field3393 == 20) {
            class276.method1990(arg0 ^ 0x4BDE, new class107(class42.field501.method1180(arg0 ^ 0x4BC8, "underlay", class69.field899.field1010)));
            class232.field3393 = 30;
            class293.method2085(120, true);
            class339.method2350(arg0 - 19443);
        } else if (class232.field3393 == 30) {
            class134.method888(false, new class107(class42.field501.method1180(65, "overlay", class69.field899.field1010)));
            class232.field3393 = 40;
            class339.method2350(0);
        } else if (class232.field3393 == 40) {
            class94.method570(new class107(class42.field501.method1180(-125, "overlay2", class69.field899.field1010)), (byte) -71);
            class232.field3393 = 50;
            class339.method2350(arg0 ^ 0x4BF3);
        } else if (class232.field3393 == 50) {
            class296.method2095(new class107(class42.field501.method1180(arg0 ^ 0x4B86, "loc", class69.field899.field1010)), 89);
            class232.field3393 = 60;
            class293.method2085(126, true);
            class339.method2350(0);
        } else if (class232.field3393 == 60) {
            if (class42.field501.method1191((byte) 117, class69.field899.field1010 + "_labels")) {
                if (!class42.field501.method1207(class69.field899.field1010 + "_labels", false)) {
                    return;
                }
                class334.field5162 = class67.method416(0, class42.field501, class69.field899.field1010 + "_labels");
            } else {
                class334.field5162 = new class269(0);
            }
            class232.field3393 = 70;
            class339.method2350(0);
        } else if (class232.field3393 == 70) {
            class249.field3777 = new class288(11, true, class260.field3941);
            class232.field3393 = 73;
            class293.method2085(7, true);
            class339.method2350(0);
        } else if (class232.field3393 == 73) {
            class62.field790 = new class288(12, true, class260.field3941);
            class232.field3393 = 76;
            class293.method2085(-110, true);
            class339.method2350(0);
        } else if (class232.field3393 == 76) {
            class262.field3959 = new class288(14, true, class260.field3941);
            class232.field3393 = 79;
            class293.method2085(arg0 - 19322, true);
            class339.method2350(arg0 - 19443);
        } else if (class232.field3393 == 79) {
            class235.field3428 = new class288(17, true, class260.field3941);
            class232.field3393 = 82;
            class293.method2085(127, true);
            class339.method2350(0);
        } else if (class232.field3393 == 82) {
            class74.field956 = new class288(19, true, class260.field3941);
            class232.field3393 = 85;
            class293.method2085(126, true);
            class339.method2350(0);
        } else if (class232.field3393 == 85) {
            class89.field1120 = new class288(22, true, class260.field3941);
            class232.field3393 = 88;
            class293.method2085(-95, true);
            class339.method2350(0);
        } else if (class232.field3393 == 88) {
            class198.field2840 = new class288(26, true, class260.field3941);
            class232.field3393 = 91;
            class293.method2085(-24, true);
            class339.method2350(0);
        } else {
            class73.field928 = new class288(30, true, class260.field3941);
            if (arg0 == 19443) {
                class232.field3393 = 100;
                class293.method2085(arg0 - 19479, true);
                class339.method2350(arg0 - 19443);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V", line = 924)
    public final void method1035(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2113++;
        try {
            if (arg4 != -1) {
                method1033(71);
            }
            if (class110.field1561 != null) {
                class115.field1635++;
                if (class115.field1635 >= 3) {
                    this.method1031("alreadyloaded", (byte) 41);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class314.field4847 = arg0;
            class138.field1938 = arg0;
            class81.field1043 = 0;
            class110.field1561 = this;
            class205.field2877 = arg1;
            class188.field2712 = arg3;
            class73.field943 = arg3;
            class148.field2056 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class291.field4572 = true;
            } else {
                class291.field4572 = false;
            }
            if (class9.field131 == null) {
                class45.field536 = class9.field131 = new class265(this, arg2, (String) null, 0);
            }
            class18 var7 = class9.field131.method1926(1, (byte) 49, this);
            while (var7.field238 == 0) {
                class81.method485(10L, 1);
            }
            class323.field4966 = (Thread) var7.field241;
        } catch (Exception var9) {
            class42.method245((String) null, 1, var9);
            this.method1031("crash", (byte) 96);
        }
    }

    @OriginalMember(owner = "client!nc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 980)
    public final URL getDocumentBase() {
        field2116++;
        if (class329.field5029 == null) {
            return class9.field131 == null || class9.field131.field4179 == this ? super.getDocumentBase() : class9.field131.field4179.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 997)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2148++;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V", line = 1007)
    private final void method1037(int arg0) {
        field2117++;
        long var2 = class36.field424[class263.field4070];
        long var4 = class200.method1375(-16185);
        class36.field424[class263.field4070] = var4;
        if (var2 != 0L && var4 > var2) {
        }
        class263.field4070 = class263.field4070 + arg0 & 0x1F;
        synchronized (this) {
            class54.field658 = class309.field4789;
        }
        this.method1040(false);
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)Z", line = 1035)
    public final boolean method1038(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field2135++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = 3 % ((arg0 + 36) / 50);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1031("invalidhost", (byte) 42);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1071)
    public final void focusGained(FocusEvent arg0) {
        field2126++;
        class309.field4789 = true;
        class76.field970 = true;
    }

    @OriginalMember(owner = "client!nc", name = "stop", descriptor = "()V", line = 1081)
    public final void stop() {
        field2129++;
        if (class110.field1561 == this && !class299.field4665) {
            class318.field4882 = class200.method1375(-16185) + 4000L;
        }
    }

    @OriginalMember(owner = "client!nc", name = "destroy", descriptor = "()V", line = 1092)
    public final void destroy() {
        field2147++;
        if (class110.field1561 == this && !class299.field4665) {
            class318.field4882 = class200.method1375(-16185);
            class81.method485(5000L, 1);
            class45.field536 = null;
            this.method1029(false, true);
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V", line = 1107)
    public static final void method1039(int arg0) {
        class285.field4489.method1241(113);
        if (arg0 != -64) {
            providesignlink((class265) null);
        }
        class264.field4165.method1241(116);
        field2133++;
    }

    @OriginalMember(owner = "client!nc", name = "providesignlink", descriptor = "(Ltk;)V", line = 1121)
    public static final void providesignlink(class265 arg0) {
        field2131++;
        class9.field131 = arg0;
        class45.field536 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1129)
    public final void windowIconified(WindowEvent arg0) {
        field2139++;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V", line = 1143)
    private final void method1041(byte arg0) {
        field2141++;
        long var2 = class321.field4929[class181.field2617];
        if (arg0 > -16) {
            this.method1036(false);
        }
        long var4 = class200.method1375(-16185);
        class321.field4929[class181.field2617] = var4;
        class181.field2617 = class181.field2617 + 1 & 0x1F;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class180.field2613 = ((var6 >> 1) + 32000) / var6;
        }
        if (class261.field3952++ > 50) {
            class76.field970 = true;
            class261.field3952 -= 50;
            class260.field3941.setSize(class188.field2712, class314.field4847);
            class260.field3941.setVisible(true);
            if (class329.field5029 != null && class243.field3659 == null) {
                Insets var7 = class329.field5029.getInsets();
                class260.field3941.setLocation(class148.field2056 + var7.left, class81.field1043 + var7.top);
            } else {
                class260.field3941.setLocation(class148.field2056, class81.field1043);
            }
        }
        this.method1032((byte) -29);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public abstract void method1022(byte arg0);

    @OriginalMember(owner = "client!nc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V")
    public abstract void method1032(byte arg0);

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public abstract void method1034(int arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public abstract void method1036(boolean arg0);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
    public abstract void method1040(boolean arg0);
}
